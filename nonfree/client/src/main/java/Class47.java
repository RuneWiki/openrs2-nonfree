import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class47 {

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
	private int anInt2052;

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
	private int anInt2054;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "[B")
	private byte[] aByteArray33 = new byte[4];

	@OriginalMember(owner = "client!ig", name = "s", descriptor = "Lclient!eg;")
	private Class33 aClass33_11;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
	private int anInt2048;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "J")
	private long aLong80;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!gj;Ljava/net/URL;)V")
	public Class47(@OriginalArg(0) Class41 arg0, @OriginalArg(1) URL arg1) {
		this.aClass33_11 = arg0.method1270(arg1);
		this.anInt2048 = 0;
		this.aLong80 = Static111.method1911() + 30000L;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)[B")
	public byte[] method1623() throws IOException {
		if (Static111.method1911() > this.aLong80) {
			throw new IOException("fdt");
		}
		if (this.anInt2048 == 0) {
			if (this.aClass33_11.anInt947 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass33_11.anInt947 == 1) {
				this.anInt2048 = 1;
				this.aDataInputStream1 = (DataInputStream) this.aClass33_11.anObject2;
			}
		}
		@Pc(49) int local49;
		if (this.anInt2048 == 1) {
			local49 = this.aDataInputStream1.available();
			if (local49 > 0) {
				if (local49 + this.anInt2054 > 4) {
					local49 = 4 - this.anInt2054;
				}
				this.anInt2054 += this.aDataInputStream1.read(this.aByteArray33, this.anInt2054, local49);
				if (this.anInt2054 == 4) {
					@Pc(92) int local92 = (new Class2_Sub23(this.aByteArray33)).method2133();
					this.aByteArray34 = new byte[local92];
					this.anInt2048 = 2;
				}
			}
		}
		if (this.anInt2048 == 2) {
			local49 = this.aDataInputStream1.available();
			if (local49 > 0) {
				if (this.anInt2052 + local49 > this.aByteArray34.length) {
					local49 = this.aByteArray34.length - this.anInt2052;
				}
				this.anInt2052 += this.aDataInputStream1.read(this.aByteArray34, this.anInt2052, local49);
				if (this.anInt2052 == this.aByteArray34.length) {
					return this.aByteArray34;
				}
			}
		}
		return null;
	}
}
