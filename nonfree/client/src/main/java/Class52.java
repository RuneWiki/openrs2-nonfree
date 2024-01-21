import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class52 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "I")
	private int anInt1818;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "I")
	private int anInt1822;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!n", name = "q", descriptor = "[B")
	private final byte[] aByteArray19 = new byte[4];

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Lclient!ke;")
	private final Class43 aClass43_6;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "I")
	private int anInt1821;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "J")
	private final long aLong62;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!ve;Ljava/net/URL;)V")
	public Class52(@OriginalArg(0) Class81 arg0, @OriginalArg(1) URL arg1) {
		this.aClass43_6 = arg0.method1940(arg1);
		this.anInt1821 = 0;
		this.aLong62 = Static8.method75() + 30000L;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)[B")
	public byte[] method1232() throws IOException {
		if (Static8.method75() > this.aLong62) {
			throw new IOException("fdt");
		}
		if (this.anInt1821 == 0) {
			if (this.aClass43_6.anInt1565 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass43_6.anInt1565 == 1) {
				this.anInt1821 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass43_6.anObject2;
			}
		}
		@Pc(65) int local65;
		if (this.anInt1821 == 1) {
			local65 = this.aDataInputStream1.available();
			if (local65 > 0) {
				if (local65 + this.anInt1822 > 4) {
					local65 = 4 - this.anInt1822;
				}
				this.anInt1822 += this.aDataInputStream1.read(this.aByteArray19, this.anInt1822, local65);
				if (this.anInt1822 == 4) {
					@Pc(108) int local108 = (new Class4_Sub9(this.aByteArray19)).method780();
					this.anInt1821 = 2;
					this.aByteArray20 = new byte[local108];
				}
			}
		}
		if (this.anInt1821 == 2) {
			local65 = this.aDataInputStream1.available();
			if (local65 > 0) {
				if (this.aByteArray20.length < local65 + this.anInt1818) {
					local65 = this.aByteArray20.length - this.anInt1818;
				}
				this.anInt1818 += this.aDataInputStream1.read(this.aByteArray20, this.anInt1818, local65);
				if (this.aByteArray20.length == this.anInt1818) {
					return this.aByteArray20;
				}
			}
		}
		return null;
	}
}
