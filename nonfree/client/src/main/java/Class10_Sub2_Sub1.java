import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class10_Sub2_Sub1 extends Class10_Sub2 {

	@OriginalMember(owner = "client!be", name = "l", descriptor = "I")
	private final int anInt763;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "I")
	private final int anInt759;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "I")
	private final int anInt762;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub2_Sub1(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		@Pc(6) int local6 = arg0.method5312();
		this.anInt763 = local6 & 0xFFFF;
		this.anInt759 = local6 >>> 16;
		this.anInt762 = arg0.method5322(-97);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		@Pc(15) int local15 = this.anInt759 * 512 + 256;
		@Pc(22) int local22 = this.anInt763 * 512 + 256;
		@Pc(25) int local25 = this.anInt762;
		if (local25 < 3 && Static135.method2226(this.anInt759, this.anInt763)) {
			local25++;
		}
		@Pc(75) Class19_Sub1_Sub3_Sub4 local75 = new Class19_Sub1_Sub3_Sub4(super.anInt6403, 0, this.anInt762, local25, local15, Static505.method7237(this.anInt762, local22, local15) - super.anInt6402, local22, this.anInt759, this.anInt759, this.anInt763, this.anInt763, super.anInt6404, false);
		Static59.aClass136_6.method3508((long) (this.anInt759 << 16 | this.anInt763), new Class3_Sub4_Sub9(local75));
	}
}
