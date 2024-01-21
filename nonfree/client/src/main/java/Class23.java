import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class23 {

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
	private int anInt922;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
	private int anInt924;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "[B")
	private final byte[] aByteArray40 = new byte[4];

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Lclient!he;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
	private int anInt920;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "J")
	private final long aLong31;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!jb;Ljava/net/URL;)V")
	public Class23(@OriginalArg(0) Class35 arg0, @OriginalArg(1) URL arg1) {
		this.aClass30_1 = arg0.method985(arg1);
		this.anInt920 = 0;
		this.aLong31 = Static16.method286() + 30000L;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)[B")
	public byte[] method633() throws IOException {
		if (Static16.method286() > this.aLong31) {
			throw new IOException("fdt");
		}
		if (this.anInt920 == 0) {
			if (this.aClass30_1.anInt1209 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass30_1.anInt1209 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass30_1.anObject3;
				this.anInt920 = 1;
			}
		}
		@Pc(95) int local95;
		if (this.anInt920 == 1) {
			@Pc(51) int local51 = this.aDataInputStream1.available();
			if (local51 > 0) {
				if (this.anInt924 + local51 > 4) {
					local51 = 4 - this.anInt924;
				}
				this.anInt924 += this.aDataInputStream1.read(this.aByteArray40, this.anInt924, local51);
				if (this.anInt924 == 4) {
					local95 = (new Class4_Sub13(this.aByteArray40)).method1215();
					this.aByteArray39 = new byte[local95];
					this.anInt920 = 2;
				}
			}
		}
		if (this.anInt920 == 2) {
			local95 = this.aDataInputStream1.available();
			if (local95 > 0) {
				if (this.aByteArray39.length < local95 + this.anInt922) {
					local95 = this.aByteArray39.length - this.anInt922;
				}
				this.anInt922 += this.aDataInputStream1.read(this.aByteArray39, this.anInt922, local95);
				if (this.aByteArray39.length == this.anInt922) {
					return this.aByteArray39;
				}
			}
		}
		return null;
	}
}
