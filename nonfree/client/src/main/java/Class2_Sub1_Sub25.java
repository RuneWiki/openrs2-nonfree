import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class2_Sub1_Sub25 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nq", name = "S", descriptor = "I")
	private int anInt4672 = 32768;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub25() {
		super(3, false);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt4672 = arg1.method5753() << 4;
		} else if (arg0 == 1) {
			super.aBoolean498 = arg1.method5732() == 1;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(39) int[] local39 = this.method6069(1, arg0);
			@Pc(45) int[] local45 = this.method6069(2, arg0);
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[1];
			@Pc(57) int[] local57 = local11[2];
			for (@Pc(59) int local59 = 0; local59 < Static391.anInt7118; local59++) {
				@Pc(71) int local71 = local39[local59] * 255 >> 12 & 0xFF;
				@Pc(80) int local80 = local45[local59] * this.anInt4672 >> 12;
				@Pc(88) int local88 = local80 * Static89.anIntArray149[local71] >> 12;
				@Pc(96) int local96 = Static40.anIntArray60[local71] * local80 >> 12;
				@Pc(104) int local104 = Static235.anInt4676 & local59 + (local88 >> 12);
				@Pc(112) int local112 = (local96 >> 12) + arg0 & Static67.anInt1510;
				@Pc(118) int[][] local118 = this.method6061(0, local112);
				local49[local59] = local118[0][local104];
				local53[local59] = local118[1][local104];
				local57[local59] = local118[2][local104];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(28) int[] local28 = this.method6069(1, arg0);
			@Pc(34) int[] local34 = this.method6069(2, arg0);
			for (@Pc(36) int local36 = 0; local36 < Static391.anInt7118; local36++) {
				@Pc(46) int local46 = local28[local36] >> 4 & 0xFF;
				@Pc(55) int local55 = local34[local36] * this.anInt4672 >> 12;
				@Pc(63) int local63 = Static89.anIntArray149[local46] * local55 >> 12;
				@Pc(71) int local71 = Static40.anIntArray60[local46] * local55 >> 12;
				@Pc(79) int local79 = (local63 >> 12) + local36 & Static235.anInt4676;
				@Pc(88) int local88 = arg0 + (local71 >> 12) & Static67.anInt1510;
				@Pc(94) int[] local94 = this.method6069(0, local88);
				local11[local36] = local94[local79];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
	@Override
	public void method6067() {
		Static155.method2766();
	}
}
