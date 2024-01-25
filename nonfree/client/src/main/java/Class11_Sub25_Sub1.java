import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class11_Sub25_Sub1 extends Class11_Sub25 {

	@OriginalMember(owner = "client!js", name = "Cb", descriptor = "Lclient!qr;")
	private Class169 aClass169_1;

	@OriginalMember(owner = "client!js", name = "Jb", descriptor = "I")
	private int anInt2897;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I)V")
	public Class11_Sub25_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!js", name = "o", descriptor = "(II)V")
	public void method2454(@OriginalArg(1) int arg0) {
		super.aByteArray93[super.anInt6076++] = (byte) (arg0 + this.aClass169_1.method4520());
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([IZ)V")
	public void method2457(@OriginalArg(0) int[] arg0) {
		this.aClass169_1 = new Class169(arg0);
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "([BIII)V")
	public void method2458(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray93[super.anInt6076++] - this.aClass169_1.method4520());
		}
	}

	@OriginalMember(owner = "client!js", name = "j", descriptor = "(B)V")
	public void method2461() {
		super.anInt6076 = (this.anInt2897 + 7) / 8;
	}

	@OriginalMember(owner = "client!js", name = "g", descriptor = "(BI)I")
	public int method2462(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt2897 >> 3;
		@Pc(24) int local24 = 8 - (this.anInt2897 & 0x7);
		this.anInt2897 += arg0;
		@Pc(32) int local32 = 0;
		while (arg0 > local24) {
			local32 += (super.aByteArray93[local10++] & Static297.anIntArray485[local24]) << arg0 - local24;
			arg0 -= local24;
			local24 = 8;
		}
		if (arg0 == local24) {
			local32 += super.aByteArray93[local10] & Static297.anIntArray485[local24];
		} else {
			local32 += super.aByteArray93[local10] >> local24 - arg0 & Static297.anIntArray485[arg0];
		}
		return local32;
	}

	@OriginalMember(owner = "client!js", name = "w", descriptor = "(I)V")
	public void method2464() {
		this.anInt2897 = super.anInt6076 * 8;
	}

	@OriginalMember(owner = "client!js", name = "x", descriptor = "(I)I")
	public int method2465() {
		return super.aByteArray93[super.anInt6076++] - this.aClass169_1.method4520() & 0xFF;
	}

	@OriginalMember(owner = "client!js", name = "h", descriptor = "(BI)I")
	public int method2466(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2897;
	}
}
