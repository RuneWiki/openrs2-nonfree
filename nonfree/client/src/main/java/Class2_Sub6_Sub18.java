import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class2_Sub6_Sub18 extends Class2_Sub6 {

	@OriginalMember(owner = "client!no", name = "J", descriptor = "[Lclient!ac;")
	private Class3[] aClass3Array1;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(23) int local23 = Static51.anInt1085;
			@Pc(25) int local25 = Static262.anInt5589;
			@Pc(29) int[][] local29 = new int[local25][local23];
			@Pc(34) int[][][] local34 = super.aClass52_41.method965();
			this.method5148(local29);
			for (@Pc(40) int local40 = 0; local40 < Static262.anInt5589; local40++) {
				@Pc(46) int[] local46 = local29[local40];
				@Pc(50) int[][] local50 = local34[local40];
				@Pc(54) int[] local54 = local50[0];
				@Pc(58) int[] local58 = local50[1];
				@Pc(62) int[] local62 = local50[2];
				for (@Pc(64) int local64 = 0; local64 < Static51.anInt1085; local64++) {
					@Pc(70) int local70 = local46[local64];
					local62[local64] = (local70 & 0xFF) << 4;
					local58[local64] = local70 >> 4 & 0xFF0;
					local54[local64] = local70 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			this.method5148(super.aClass377_41.method8587());
		}
		return local14;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B[[I)V")
	private void method5148(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static51.anInt1085;
		@Pc(9) int local9 = Static262.anInt5589;
		Static278.method3851(arg0);
		Static188.method2732(Static53.anInt1098, Static332.anInt5256);
		if (this.aClass3Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass3Array1.length; local28++) {
			@Pc(35) Class3 local35 = this.aClass3Array1[local28];
			@Pc(38) int local38 = local35.anInt10311;
			@Pc(41) int local41 = local35.anInt10310;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method8593(local7, local9);
				}
			} else if (local41 < 0) {
				local35.method8589(local9, local7);
			} else {
				local35.method8595(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.aClass3Array1 = new Class3[arg1.method8547()];
			for (@Pc(14) int local14 = 0; local14 < this.aClass3Array1.length; local14++) {
				@Pc(20) int local20 = arg1.method8547();
				if (local20 == 0) {
					this.aClass3Array1[local14] = Static408.method5481(arg1);
				} else if (local20 == 1) {
					this.aClass3Array1[local14] = Static181.method2641(arg1);
				} else if (local20 == 2) {
					this.aClass3Array1[local14] = Static293.method4045(arg1);
				} else if (local20 == 3) {
					this.aClass3Array1[local14] = Static437.method5998(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean743 = arg1.method8547() == 1;
		}
	}
}
