import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class4_Sub1_Sub23 extends Class4_Sub1 {

	@OriginalMember(owner = "client!no", name = "I", descriptor = "I")
	private int anInt6919 = 32768;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub23() {
		super(3, false);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(21) int[] local21 = this.method8392(arg0, 1);
			@Pc(27) int[] local27 = this.method8392(arg0, 2);
			for (@Pc(29) int local29 = 0; local29 < Static376.anInt7260; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = this.anInt6919 * local27[local29] >> 12;
				@Pc(56) int local56 = Static239.anIntArray474[local39] * local48 >> 12;
				@Pc(64) int local64 = Static569.anIntArray535[local39] * local48 >> 12;
				@Pc(72) int local72 = (local56 >> 12) + local29 & Static569.anInt9982;
				@Pc(81) int local81 = Static237.anInt4286 & arg0 + (local64 >> 12);
				@Pc(87) int[] local87 = this.method8392(local81, 0);
				local11[local29] = local87[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt6919 = arg1.method4936() << 4;
		} else if (arg0 == 1) {
			super.aBoolean726 = arg1.method4905() == 1;
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(28) int[] local28 = this.method8392(arg0, 1);
			@Pc(34) int[] local34 = this.method8392(arg0, 2);
			@Pc(38) int[] local38 = local18[0];
			@Pc(42) int[] local42 = local18[1];
			@Pc(46) int[] local46 = local18[2];
			for (@Pc(48) int local48 = 0; local48 < Static376.anInt7260; local48++) {
				@Pc(60) int local60 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(69) int local69 = local34[local48] * this.anInt6919 >> 12;
				@Pc(77) int local77 = local69 * Static239.anIntArray474[local60] >> 12;
				@Pc(85) int local85 = Static569.anIntArray535[local60] * local69 >> 12;
				@Pc(93) int local93 = Static569.anInt9982 & (local77 >> 12) + local48;
				@Pc(101) int local101 = arg0 + (local85 >> 12) & Static237.anInt4286;
				@Pc(107) int[][] local107 = this.method8385(local101, 0);
				local38[local48] = local107[0][local93];
				local42[local48] = local107[1][local93];
				local46[local48] = local107[2][local93];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	@Override
	public void method8391() {
		Static165.method3014();
	}
}
