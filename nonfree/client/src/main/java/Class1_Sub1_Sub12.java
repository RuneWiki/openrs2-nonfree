import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fm", name = "X", descriptor = "[Lclient!oj;")
	private Class35[] aClass35Array1;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass35Array1 = new Class35[arg0.method3122()];
			for (@Pc(44) int local44 = 0; local44 < this.aClass35Array1.length; local44++) {
				@Pc(57) int local57 = arg0.method3122();
				if (local57 == 0) {
					this.aClass35Array1[local44] = Static60.method1024(arg0);
				} else if (local57 == 1) {
					this.aClass35Array1[local44] = Static105.method1665(arg0);
				} else if (local57 == 2) {
					this.aClass35Array1[local44] = Static257.method3984(arg0);
				} else if (local57 == 3) {
					this.aClass35Array1[local44] = Static40.method747(arg0);
				}
			}
		} else if (arg1 == 1) {
			this.aBoolean434 = arg0.method3122() == 1;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			this.method1391(this.aClass176_41.method4470());
		}
		return local14;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(22) int local22 = Static131.anInt2513;
			@Pc(24) int local24 = Static219.anInt4483;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = this.aClass153_41.method3957();
			this.method1391(local28);
			for (@Pc(39) int local39 = 0; local39 < Static219.anInt4483; local39++) {
				@Pc(50) int[] local50 = local28[local39];
				@Pc(54) int[][] local54 = local33[local39];
				@Pc(58) int[] local58 = local54[0];
				@Pc(62) int[] local62 = local54[2];
				@Pc(66) int[] local66 = local54[1];
				for (@Pc(68) int local68 = 0; local68 < Static131.anInt2513; local68++) {
					@Pc(79) int local79 = local50[local68];
					local62[local68] = (local79 & 0xFF) << 4;
					local66[local68] = local79 >> 4 & 0xFF0;
					local58[local68] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "([[II)V")
	private void method1391(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static131.anInt2513;
		@Pc(9) int local9 = Static219.anInt4483;
		Static289.method4433(arg0);
		Static292.method4475(Static9.anInt244, Static11.anInt321);
		if (this.aClass35Array1 == null) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass35Array1.length; local32++) {
			@Pc(46) Class35 local46 = this.aClass35Array1[local32];
			@Pc(49) int local49 = local46.anInt5404;
			@Pc(52) int local52 = local46.anInt5399;
			if (local49 >= 0) {
				if (local52 < 0) {
					local46.method4143(local7, local9);
				} else {
					local46.method4140(local9, local7);
				}
			} else if (local52 >= 0) {
				local46.method4139(local7, local9);
			}
		}
	}
}
