import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class6_Sub2_Sub34 extends Class6_Sub2 {

	@OriginalMember(owner = "client!sr", name = "J", descriptor = "[Lclient!vg;")
	private Class114[] aClass114Array1;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			this.method5208(super.aClass100_41.method2224());
		}
		return local9;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(22) int local22 = Static185.anInt4925;
			@Pc(24) int local24 = Static345.anInt5779;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass130_41.method2912();
			this.method5208(local28);
			for (@Pc(39) int local39 = 0; local39 < Static345.anInt5779; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static185.anInt4925; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass114Array1 = new Class114[arg0.method3111()];
			for (@Pc(16) int local16 = 0; local16 < this.aClass114Array1.length; local16++) {
				@Pc(22) int local22 = arg0.method3111();
				if (local22 == 0) {
					this.aClass114Array1[local16] = Static278.method4213(arg0);
				} else if (local22 == 1) {
					this.aClass114Array1[local16] = Static153.method2490(arg0);
				} else if (local22 == 2) {
					this.aClass114Array1[local16] = Static339.method4790(arg0);
				} else if (local22 == 3) {
					this.aClass114Array1[local16] = Static131.method2143(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean488 = arg0.method3111() == 1;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[[I)V")
	private void method5208(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static185.anInt4925;
		@Pc(9) int local9 = Static345.anInt5779;
		Static437.method5899(arg0);
		Static418.method5684(Static296.anInt4928, Static64.anInt1348);
		if (this.aClass114Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass114Array1.length; local28++) {
			@Pc(35) Class114 local35 = this.aClass114Array1[local28];
			@Pc(38) int local38 = local35.anInt5076;
			@Pc(41) int local41 = local35.anInt5078;
			if (local38 < 0) {
				if (local41 >= 0) {
					local35.method4461(local7, local9);
				}
			} else if (local41 < 0) {
				local35.method4462(local7, local9);
			} else {
				local35.method4466(local9, local7);
			}
		}
	}
}
