import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class27 {

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	private int anInt1295;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	private int anInt1296;

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "[B")
	private final byte[] aByteArray6 = new byte[4];

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "Lclient!ha;")
	private final Class29 aClass29_2;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
	private int anInt1294;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "J")
	private final long aLong66;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!ih;Ljava/net/URL;)V")
	public Class27(@OriginalArg(0) Class39 arg0, @OriginalArg(1) URL arg1) {
		this.aClass29_2 = arg0.method1234(arg1);
		this.anInt1294 = 0;
		this.aLong66 = Static88.method1536() + 30000L;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)[B")
	public byte[] method971() throws IOException {
		if (Static88.method1536() > this.aLong66) {
			throw new IOException("fdt");
		}
		if (this.anInt1294 == 0) {
			if (this.aClass29_2.anInt1375 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass29_2.anInt1375 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass29_2.anObject2;
				this.anInt1294 = 1;
			}
		}
		@Pc(53) int local53;
		if (this.anInt1294 == 1) {
			local53 = this.aDataInputStream1.available();
			if (local53 > 0) {
				if (this.anInt1296 + local53 > 4) {
					local53 = 4 - this.anInt1296;
				}
				this.anInt1296 += this.aDataInputStream1.read(this.aByteArray6, this.anInt1296, local53);
				if (this.anInt1296 == 4) {
					@Pc(97) int local97 = (new Class3_Sub12(this.aByteArray6)).method1373();
					this.aByteArray7 = new byte[local97];
					this.anInt1294 = 2;
				}
			}
		}
		if (this.anInt1294 == 2) {
			local53 = this.aDataInputStream1.available();
			if (local53 > 0) {
				if (this.anInt1295 + local53 > this.aByteArray7.length) {
					local53 = this.aByteArray7.length - this.anInt1295;
				}
				this.anInt1295 += this.aDataInputStream1.read(this.aByteArray7, this.anInt1295, local53);
				if (this.anInt1295 == this.aByteArray7.length) {
					return this.aByteArray7;
				}
			}
		}
		return null;
	}
}
