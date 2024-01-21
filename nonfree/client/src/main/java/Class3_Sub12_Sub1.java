import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class3_Sub12_Sub1 extends Class3_Sub12 {

	@OriginalMember(owner = "client!ra", name = "bc", descriptor = "I")
	private int anInt2939;

	@OriginalMember(owner = "client!ra", name = "lc", descriptor = "Lclient!sc;")
	private Class67 aClass67_1;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
	public Class3_Sub12_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "(I)V")
	public void method1975() {
		super.anInt2886 = (this.anInt2939 + 7) / 8;
	}

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "(II)I")
	public int method1976(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2939;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([II)V")
	public void method1978(@OriginalArg(0) int[] arg0) {
		this.aClass67_1 = new Class67(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "(I)V")
	public void method1979() {
		this.anInt2939 = super.anInt2886 * 8;
	}

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "(II)V")
	public void method1980(@OriginalArg(0) int arg0) {
		super.aByteArray77[super.anInt2886++] = (byte) (this.aClass67_1.method2030() + arg0);
	}

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "(I)I")
	public int method1981() {
		return super.aByteArray77[super.anInt2886++] - this.aClass67_1.method2030() & 0xFF;
	}

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "(II)I")
	public int method1982(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = this.anInt2939 >> 3;
		@Pc(17) int local17 = 0;
		@Pc(25) int local25 = 8 - (this.anInt2939 & 0x7);
		this.anInt2939 += arg0;
		while (local25 < arg0) {
			local17 += (Static86.anIntArray190[local25] & super.aByteArray77[local6++]) << arg0 - local25;
			arg0 -= local25;
			local25 = 8;
		}
		if (arg0 == local25) {
			local17 += Static86.anIntArray190[local25] & super.aByteArray77[local6];
		} else {
			local17 += super.aByteArray77[local6] >> local25 - arg0 & Static86.anIntArray190[arg0];
		}
		return local17;
	}
}
