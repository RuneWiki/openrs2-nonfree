import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
	private int anInt209;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "[B")
	private final byte[] aByteArray2 = new byte[4];

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!ea;")
	private final Class18 aClass18_1;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "J")
	private final long aLong12;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!gg;Ljava/net/URL;)V")
	public Class5(@OriginalArg(0) Class32 arg0, @OriginalArg(1) URL arg1) {
		this.aClass18_1 = arg0.method1476(arg1);
		this.anInt208 = 0;
		this.aLong12 = Static143.method2807() + 30000L;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)[B")
	public byte[] method184() throws IOException {
		if (Static143.method2807() > this.aLong12) {
			throw new IOException("fdt");
		}
		if (this.anInt208 == 0) {
			if (this.aClass18_1.anInt1403 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass18_1.anInt1403 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass18_1.anObject2;
				this.anInt208 = 1;
			}
		}
		@Pc(62) int local62;
		if (this.anInt208 == 1) {
			local62 = this.aDataInputStream1.available();
			if (local62 > 0) {
				if (this.anInt206 + local62 > 4) {
					local62 = 4 - this.anInt206;
				}
				this.anInt206 += this.aDataInputStream1.read(this.aByteArray2, this.anInt206, local62);
				if (this.anInt206 == 4) {
					@Pc(104) int local104 = (new Class1_Sub9(this.aByteArray2)).method1273();
					this.anInt208 = 2;
					this.aByteArray3 = new byte[local104];
				}
			}
		}
		if (this.anInt208 == 2) {
			local62 = this.aDataInputStream1.available();
			if (local62 > 0) {
				if (this.anInt209 + local62 > this.aByteArray3.length) {
					local62 = this.aByteArray3.length - this.anInt209;
				}
				this.anInt209 += this.aDataInputStream1.read(this.aByteArray3, this.anInt209, local62);
				if (this.aByteArray3.length == this.anInt209) {
					return this.aByteArray3;
				}
			}
		}
		return null;
	}
}
