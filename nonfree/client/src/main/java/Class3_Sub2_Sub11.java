import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class3_Sub2_Sub11 extends Class3_Sub2 {

	@OriginalMember(owner = "client!gs", name = "F", descriptor = "I")
	private int anInt3659 = 32768;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub11() {
		super(3, false);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3659 = arg0.method4221() << 4;
		} else if (arg1 == 1) {
			super.aBoolean720 = arg0.method4225() == 1;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(21) int[] local21 = this.method8603(arg0, 1);
			@Pc(27) int[] local27 = this.method8603(arg0, 2);
			for (@Pc(29) int local29 = 0; local29 < Static491.anInt8519; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = local27[local29] * this.anInt3659 >> 12;
				@Pc(56) int local56 = local48 * Static587.anIntArray621[local39] >> 12;
				@Pc(64) int local64 = Static246.anIntArray241[local39] * local48 >> 12;
				@Pc(72) int local72 = (local56 >> 12) + local29 & Static309.anInt5846;
				@Pc(81) int local81 = arg0 + (local64 >> 12) & Class4_Sub1_Sub3_Sub2.lb;
				@Pc(87) int[] local87 = this.method8603(local81, 0);
				local11[local29] = local87[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
	@Override
	public void method8598() {
		Static511.method7631();
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(28) int[] local28 = this.method8603(arg0, 1);
			@Pc(34) int[] local34 = this.method8603(arg0, 2);
			@Pc(38) int[] local38 = local16[0];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int[] local46 = local16[2];
			for (@Pc(48) int local48 = 0; local48 < Static491.anInt8519; local48++) {
				@Pc(60) int local60 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(69) int local69 = this.anInt3659 * local34[local48] >> 12;
				@Pc(77) int local77 = local69 * Static587.anIntArray621[local60] >> 12;
				@Pc(85) int local85 = local69 * Static246.anIntArray241[local60] >> 12;
				@Pc(93) int local93 = Static309.anInt5846 & (local77 >> 12) + local48;
				@Pc(101) int local101 = Class4_Sub1_Sub3_Sub2.lb & arg0 + (local85 >> 12);
				@Pc(107) int[][] local107 = this.method8595(local101, 0);
				local38[local48] = local107[0][local93];
				local42[local48] = local107[1][local93];
				local46[local48] = local107[2][local93];
			}
		}
		return local16;
	}
}
