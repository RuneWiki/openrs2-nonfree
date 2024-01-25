import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class6_Sub4_Sub29 extends Class6_Sub4 {

	@OriginalMember(owner = "client!oga", name = "J", descriptor = "[Lclient!uha;")
	private Class69[] aClass69Array1;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "([[IZ)V")
	private void method6474(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static6.anInt111;
		@Pc(14) int local14 = Static429.anInt7811;
		Static578.method5711(arg0);
		Static211.method3615(Static325.anInt6209, Static2.anInt12);
		if (this.aClass69Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass69Array1.length; local28++) {
			@Pc(35) Class69 local35 = this.aClass69Array1[local28];
			@Pc(38) int local38 = local35.anInt6639;
			@Pc(41) int local41 = local35.anInt6646;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method5707(local7, local14);
				}
			} else if (local41 >= 0) {
				local35.method5709(local7, local14);
			} else {
				local35.method5702(local7, local14);
			}
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(23) int local23 = Static6.anInt111;
			@Pc(25) int local25 = Static429.anInt7811;
			@Pc(29) int[][] local29 = new int[local25][local23];
			@Pc(34) int[][][] local34 = super.aClass307_41.method7791();
			this.method6474(local29);
			for (@Pc(40) int local40 = 0; local40 < Static429.anInt7811; local40++) {
				@Pc(46) int[] local46 = local29[local40];
				@Pc(50) int[][] local50 = local34[local40];
				@Pc(54) int[] local54 = local50[0];
				@Pc(58) int[] local58 = local50[1];
				@Pc(62) int[] local62 = local50[2];
				for (@Pc(64) int local64 = 0; local64 < Static6.anInt111; local64++) {
					@Pc(70) int local70 = local46[local64];
					local62[local64] = (local70 & 0xFF) << 4;
					local58[local64] = local70 >> 4 & 0xFF0;
					local54[local64] = local70 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			this.method6474(super.aClass372_41.method8735());
		}
		return local9;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.aClass69Array1 = new Class69[arg1.method8604()];
			for (@Pc(33) int local33 = 0; local33 < this.aClass69Array1.length; local33++) {
				@Pc(39) int local39 = arg1.method8604();
				if (local39 == 0) {
					this.aClass69Array1[local33] = Static317.method5295(arg1);
				} else if (local39 == 1) {
					this.aClass69Array1[local33] = Static436.method6773(arg1);
				} else if (local39 == 2) {
					this.aClass69Array1[local33] = Static356.method5701(arg1);
				} else if (local39 == 3) {
					this.aClass69Array1[local33] = Static591.method8327(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean674 = arg1.method8604() == 1;
			return;
		}
	}
}
