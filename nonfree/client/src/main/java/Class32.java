import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class32 {

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
	private int anInt1520;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
	private int anInt1522;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "[B")
	private final byte[] aByteArray6 = new byte[4];

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "Lclient!ca;")
	private final Class11 aClass11_2;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
	private int anInt1521;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "J")
	private final long aLong85;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!ih;Ljava/net/URL;)V")
	public Class32(@OriginalArg(0) Class36 arg0, @OriginalArg(1) URL arg1) {
		this.aClass11_2 = arg0.method1116(arg1);
		this.anInt1521 = 0;
		this.aLong85 = Static70.method1106() + 30000L;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)[B")
	public byte[] method982() throws IOException {
		if (this.aLong85 < Static70.method1106()) {
			throw new IOException("fdt");
		}
		if (this.anInt1521 == 0) {
			if (this.aClass11_2.anInt467 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass11_2.anInt467 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass11_2.anObject2;
				this.anInt1521 = 1;
			}
		}
		@Pc(59) int local59;
		if (this.anInt1521 == 1) {
			local59 = this.aDataInputStream1.available();
			if (local59 > 0) {
				if (this.anInt1520 + local59 > 4) {
					local59 = 4 - this.anInt1520;
				}
				this.anInt1520 += this.aDataInputStream1.read(this.aByteArray6, this.anInt1520, local59);
				if (this.anInt1520 == 4) {
					@Pc(103) int local103 = (new Class2_Sub13(this.aByteArray6)).method1396();
					this.aByteArray5 = new byte[local103];
					this.anInt1521 = 2;
				}
			}
		}
		if (this.anInt1521 == 2) {
			local59 = this.aDataInputStream1.available();
			if (local59 > 0) {
				if (this.aByteArray5.length < this.anInt1522 + local59) {
					local59 = this.aByteArray5.length - this.anInt1522;
				}
				this.anInt1522 += this.aDataInputStream1.read(this.aByteArray5, this.anInt1522, local59);
				if (this.aByteArray5.length == this.anInt1522) {
					return this.aByteArray5;
				}
			}
		}
		return null;
	}
}
