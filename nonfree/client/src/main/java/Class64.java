import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class64 {

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
	private int anInt2853;

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
	private int anInt2857;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "[B")
	private final byte[] aByteArray36 = new byte[4];

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "Lclient!gd;")
	private final Class22 aClass22_5;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	private int anInt2844;

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "J")
	private final long aLong91;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!vb;Ljava/net/URL;)V")
	public Class64(@OriginalArg(0) Class75 arg0, @OriginalArg(1) URL arg1) {
		this.aClass22_5 = arg0.method2175(arg1);
		this.anInt2844 = 0;
		this.aLong91 = Static87.method1625() + 30000L;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)[B")
	public byte[] method1946() throws IOException {
		if (this.aLong91 < Static87.method1625()) {
			throw new IOException("fdt");
		}
		if (this.anInt2844 == 0) {
			if (this.aClass22_5.anInt1200 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass22_5.anInt1200 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass22_5.anObject3;
				this.anInt2844 = 1;
			}
		}
		@Pc(60) int local60;
		if (this.anInt2844 == 1) {
			local60 = this.aDataInputStream1.available();
			if (local60 > 0) {
				if (this.anInt2857 + local60 > 4) {
					local60 = 4 - this.anInt2857;
				}
				this.anInt2857 += this.aDataInputStream1.read(this.aByteArray36, this.anInt2857, local60);
				if (this.anInt2857 == 4) {
					@Pc(103) int local103 = (new Class3_Sub11(this.aByteArray36)).method984();
					this.anInt2844 = 2;
					this.aByteArray37 = new byte[local103];
				}
			}
		}
		if (this.anInt2844 == 2) {
			local60 = this.aDataInputStream1.available();
			if (local60 > 0) {
				if (this.anInt2853 + local60 > this.aByteArray37.length) {
					local60 = this.aByteArray37.length - this.anInt2853;
				}
				this.anInt2853 += this.aDataInputStream1.read(this.aByteArray37, this.anInt2853, local60);
				if (this.anInt2853 == this.aByteArray37.length) {
					return this.aByteArray37;
				}
			}
		}
		return null;
	}
}
