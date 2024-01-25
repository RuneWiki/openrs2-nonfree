import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public final class Class44_Sub2 extends Class44 {

	@OriginalMember(owner = "client!tda", name = "cb", descriptor = "[I")
	public final int[] anIntArray632 = new int[12];

	@OriginalMember(owner = "client!tda", name = "db", descriptor = "[[I")
	public final int[][] anIntArrayArray74 = new int[32][512];

	@OriginalMember(owner = "client!tda", name = "eb", descriptor = "[I")
	public final int[] anIntArray633 = new int[Static477.anInt8870];

	@OriginalMember(owner = "client!tda", name = "ab", descriptor = "[I")
	public final int[] anIntArray631 = new int[2200];

	@OriginalMember(owner = "client!tda", name = "gb", descriptor = "[I")
	public final int[] anIntArray634 = new int[12];

	@OriginalMember(owner = "client!tda", name = "ib", descriptor = "[[I")
	public final int[][] anIntArrayArray75 = new int[12][Static477.anInt8867 + 8191];

	@OriginalMember(owner = "client!tda", name = "mb", descriptor = "[I")
	public final int[] anIntArray636 = new int[32];

	@OriginalMember(owner = "client!tda", name = "nb", descriptor = "[[I")
	public final int[][] anIntArrayArray76 = new int[2200][64];

	@OriginalMember(owner = "client!tda", name = "kb", descriptor = "[I")
	public final int[] anIntArray635 = new int[Static477.anInt8867 + 8191];

	@OriginalMember(owner = "client!tda", name = "lb", descriptor = "[I")
	public final int[] lb = new int[Static477.anInt8867 + 8191];

	@OriginalMember(owner = "client!tda", name = "hb", descriptor = "Lclient!kc;")
	public Class170 aClass170_1;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class44_Sub2(@OriginalArg(0) Class14_Sub1 arg0) {
		super(arg0);
		this.aClass170_1 = new Class170(arg0);
		super.aClass20_Sub1_44 = new Class20_Sub1_Sub2(super.aClass14_Sub1_14);
		super.aClass20_Sub1_50 = new Class20_Sub1_Sub2(super.aClass14_Sub1_14);
		super.aClass20_Sub1_46 = new Class20_Sub1_Sub2(super.aClass14_Sub1_14);
		super.aClass20_Sub1_43 = new Class20_Sub1_Sub2(super.aClass14_Sub1_14);
		super.aClass20_Sub1_45 = new Class20_Sub1_Sub2(super.aClass14_Sub1_14);
		super.aClass20_Sub1_42 = new Class20_Sub1_Sub2(super.aClass14_Sub1_14);
		super.aClass20_Sub1_48 = new Class20_Sub1_Sub2(super.aClass14_Sub1_14);
		super.aClass20_Sub1_47 = new Class20_Sub1_Sub2(super.aClass14_Sub1_14);
		super.aClass20_Sub1_41 = new Class20_Sub1_Sub2(super.aClass14_Sub1_14);
		super.aClass20_Sub1_49 = new Class20_Sub1_Sub2(super.aClass14_Sub1_14);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
	@Override
	public void method6771() {
		this.aClass170_1 = new Class170(super.aClass14_Sub1_14);
	}
}
