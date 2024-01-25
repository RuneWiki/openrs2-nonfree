import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class3_Sub2_Sub29 extends Class3_Sub2 {

	@OriginalMember(owner = "client!sw", name = "z", descriptor = "I")
	private int anInt9110 = 4096;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(31) int[] local31 = this.method8603(Class4_Sub1_Sub3_Sub2.lb & arg0 - 1, 0);
			@Pc(37) int[] local37 = this.method8603(arg0, 0);
			@Pc(47) int[] local47 = this.method8603(arg0 + 1 & Class4_Sub1_Sub3_Sub2.lb, 0);
			for (@Pc(49) int local49 = 0; local49 < Static491.anInt8519; local49++) {
				@Pc(63) int local63 = (local47[local49] - local31[local49]) * this.anInt9110;
				@Pc(83) int local83 = (local37[Static309.anInt5846 & local49 + 1] - local37[local49 - 1 & Static309.anInt5846]) * this.anInt9110;
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local63 >> 12;
				@Pc(97) int local97 = local87 * local87 >> 12;
				@Pc(103) int local103 = local91 * local91 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((float) (local97 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(128) int local128 = local117 == 0 ? 0 : 16777216 / local117;
				local17[local49] = 4096 - local128;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9110 = arg0.method4221();
		}
	}
}
