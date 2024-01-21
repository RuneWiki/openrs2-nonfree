import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3 {

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private int anInt111;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
	private int anInt121;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "[B")
	private final byte[] aByteArray3 = new byte[4];

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "Lclient!hf;")
	private final Class32 aClass32_1;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	private int anInt113;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "J")
	private final long aLong5;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!e;Ljava/net/URL;)V")
	public Class3(@OriginalArg(0) Class16 arg0, @OriginalArg(1) URL arg1) {
		this.aClass32_1 = arg0.method983(arg1);
		this.anInt113 = 0;
		this.aLong5 = Static169.method2888() + 30000L;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)[B")
	public byte[] method81() throws IOException {
		if (this.aLong5 < Static169.method2888()) {
			throw new IOException("fdt");
		}
		if (this.anInt113 == 0) {
			if (this.aClass32_1.anInt1974 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass32_1.anInt1974 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass32_1.anObject2;
				this.anInt113 = 1;
			}
		}
		@Pc(58) int local58;
		if (this.anInt113 == 1) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (local58 + this.anInt111 > 4) {
					local58 = 4 - this.anInt111;
				}
				this.anInt111 += this.aDataInputStream1.read(this.aByteArray3, this.anInt111, local58);
				if (this.anInt111 == 4) {
					@Pc(102) int local102 = (new Class1_Sub8(this.aByteArray3)).method1626();
					this.anInt113 = 2;
					this.aByteArray1 = new byte[local102];
				}
			}
		}
		if (this.anInt113 == 2) {
			local58 = this.aDataInputStream1.available();
			if (local58 > 0) {
				if (this.aByteArray1.length < local58 + this.anInt121) {
					local58 = this.aByteArray1.length - this.anInt121;
				}
				this.anInt121 += this.aDataInputStream1.read(this.aByteArray1, this.anInt121, local58);
				if (this.aByteArray1.length == this.anInt121) {
					return this.aByteArray1;
				}
			}
		}
		return null;
	}
}
