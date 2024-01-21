import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class15 {

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "[B")
	private final byte[] aByteArray20 = new byte[4];

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!oc;")
	private final Class56 aClass56_3;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "J")
	private final long aLong27;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!ue;Ljava/net/URL;)V")
	public Class15(@OriginalArg(0) Class74 arg0, @OriginalArg(1) URL arg1) {
		this.aClass56_3 = arg0.method1874(arg1);
		this.anInt1047 = 0;
		this.aLong27 = Static49.method877() + 30000L;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)[B")
	public byte[] method562() throws IOException {
		if (Static49.method877() > this.aLong27) {
			throw new IOException("fdt");
		}
		if (this.anInt1047 == 0) {
			if (this.aClass56_3.anInt2056 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass56_3.anInt2056 == 1) {
				this.anInt1047 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass56_3.anObject2;
			}
		}
		@Pc(62) int local62;
		if (this.anInt1047 == 1) {
			local62 = this.aDataInputStream1.available();
			if (local62 > 0) {
				if (local62 + this.anInt1046 > 4) {
					local62 = 4 - this.anInt1046;
				}
				this.anInt1046 += this.aDataInputStream1.read(this.aByteArray20, this.anInt1046, local62);
				if (this.anInt1046 == 4) {
					@Pc(100) int local100 = (new Class2_Sub17(this.aByteArray20)).method1747();
					this.aByteArray21 = new byte[local100];
					this.anInt1047 = 2;
				}
			}
		}
		if (this.anInt1047 == 2) {
			local62 = this.aDataInputStream1.available();
			if (local62 > 0) {
				if (local62 + this.anInt1050 > this.aByteArray21.length) {
					local62 = this.aByteArray21.length - this.anInt1050;
				}
				this.anInt1050 += this.aDataInputStream1.read(this.aByteArray21, this.anInt1050, local62);
				if (this.aByteArray21.length == this.anInt1050) {
					return this.aByteArray21;
				}
			}
		}
		return null;
	}
}
