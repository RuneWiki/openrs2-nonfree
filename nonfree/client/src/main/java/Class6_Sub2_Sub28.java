import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class6_Sub2_Sub28 extends Class6_Sub2 {

	@OriginalMember(owner = "client!nu", name = "B", descriptor = "[F")
	public static final float[] aFloatArray22 = new float[16384];

	@OriginalMember(owner = "client!nu", name = "J", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[16384];

	@OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
	private int anInt4732 = 32768;

	static {
		@Pc(12) double local12 = 3.834951969714103E-4D;
		for (@Pc(14) int local14 = 0; local14 < 16384; local14++) {
			aFloatArray22[local14] = (float) Math.sin(local12 * (double) local14);
			aFloatArray23[local14] = (float) Math.cos(local12 * (double) local14);
		}
	}

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub28() {
		super(3, false);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4732 = arg0.method3108() << 4;
		} else if (arg1 == 1) {
			super.aBoolean488 = arg0.method3111() == 1;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(26) int[] local26 = this.method5858(1, arg0);
			@Pc(32) int[] local32 = this.method5858(2, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static185.anInt4925; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = this.anInt4732 * local32[local34] >> 12;
				@Pc(61) int local61 = Static37.anIntArray640[local44] * local53 >> 12;
				@Pc(69) int local69 = Static148.anIntArray260[local44] * local53 >> 12;
				@Pc(77) int local77 = Static64.anInt1348 & (local61 >> 12) + local34;
				@Pc(85) int local85 = arg0 + (local69 >> 12) & Static296.anInt4928;
				@Pc(91) int[] local91 = this.method5858(0, local85);
				local16[local34] = local91[local77];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(28) int[] local28 = this.method5858(1, arg0);
			@Pc(34) int[] local34 = this.method5858(2, arg0);
			@Pc(38) int[] local38 = local18[0];
			@Pc(42) int[] local42 = local18[1];
			@Pc(46) int[] local46 = local18[2];
			for (@Pc(48) int local48 = 0; local48 < Static185.anInt4925; local48++) {
				@Pc(60) int local60 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(69) int local69 = local34[local48] * this.anInt4732 >> 12;
				@Pc(77) int local77 = local69 * Static37.anIntArray640[local60] >> 12;
				@Pc(85) int local85 = Static148.anIntArray260[local60] * local69 >> 12;
				@Pc(93) int local93 = Static64.anInt1348 & (local77 >> 12) + local48;
				@Pc(101) int local101 = Static296.anInt4928 & arg0 + (local85 >> 12);
				@Pc(107) int[][] local107 = this.method5867(local101, 0);
				local38[local48] = local107[0][local93];
				local42[local48] = local107[1][local93];
				local46[local48] = local107[2][local93];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)V")
	@Override
	public void method5862() {
		Static172.method2738();
	}
}
