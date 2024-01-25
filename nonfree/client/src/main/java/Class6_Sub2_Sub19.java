import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class6_Sub2_Sub19 extends Class6_Sub2 {

	@OriginalMember(owner = "client!kr", name = "F", descriptor = "I")
	private int anInt3695 = 1;

	@OriginalMember(owner = "client!kr", name = "J", descriptor = "I")
	private int anInt3698 = 1;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(23) int local23 = this.anInt3698 + this.anInt3698 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt3695 + this.anInt3695 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(67) int local67;
			@Pc(69) int local69;
			for (@Pc(47) int local47 = arg0 - this.anInt3698; local47 <= this.anInt3698 + arg0; local47++) {
				@Pc(59) int[][] local59 = this.method5867(local47 & Static296.anInt4928, 0);
				@Pc(63) int[][] local63 = new int[3][Static185.anInt4925];
				@Pc(65) int local65 = 0;
				local67 = 0;
				local69 = 0;
				@Pc(73) int[] local73 = local59[0];
				@Pc(77) int[] local77 = local59[1];
				@Pc(81) int[] local81 = local59[2];
				for (@Pc(85) int local85 = -this.anInt3695; local85 <= this.anInt3695; local85++) {
					@Pc(91) int local91 = local85 & Static64.anInt1348;
					local69 += local81[local91];
					local65 += local73[local91];
					local67 += local77[local91];
				}
				@Pc(118) int[] local118 = local63[0];
				@Pc(122) int[] local122 = local63[1];
				@Pc(126) int[] local126 = local63[2];
				@Pc(128) int local128 = 0;
				while (local128 < Static185.anInt4925) {
					local118[local128] = local39 * local65 >> 16;
					local122[local128] = local67 * local39 >> 16;
					local126[local128] = local69 * local39 >> 16;
					@Pc(162) int local162 = local128 - this.anInt3695 & Static64.anInt1348;
					local65 -= local73[local162];
					local69 -= local81[local162];
					local67 -= local77[local162];
					local128++;
					@Pc(188) int local188 = Static64.anInt1348 & this.anInt3695 + local128;
					local69 += local81[local188];
					local67 += local77[local188];
					local65 += local73[local188];
				}
				local42[this.anInt3698 + local47 - arg0] = local63;
			}
			@Pc(230) int[] local230 = local11[0];
			@Pc(234) int[] local234 = local11[1];
			@Pc(238) int[] local238 = local11[2];
			for (local67 = 0; local67 < Static185.anInt4925; local67++) {
				local69 = 0;
				@Pc(246) int local246 = 0;
				@Pc(248) int local248 = 0;
				for (@Pc(250) int local250 = 0; local250 < local23; local250++) {
					@Pc(256) int[][] local256 = local42[local250];
					local69 += local256[0][local67];
					local248 += local256[2][local67];
					local246 += local256[1][local67];
				}
				local230[local67] = local69 * local27 >> 16;
				local234[local67] = local246 * local27 >> 16;
				local238[local67] = local248 * local27 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3695 = arg0.method3111();
		} else if (arg1 == 1) {
			this.anInt3698 = arg0.method3111();
		} else if (arg1 == 2) {
			super.aBoolean488 = arg0.method3111() == 1;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(35) int local35 = this.anInt3698 + this.anInt3698 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(47) int local47 = this.anInt3695 + this.anInt3695 + 1;
			@Pc(51) int local51 = 65536 / local47;
			@Pc(54) int[][] local54 = new int[local35][];
			@Pc(75) int local75;
			for (@Pc(60) int local60 = arg0 - this.anInt3698; local60 <= arg0 + this.anInt3698; local60++) {
				@Pc(70) int[] local70 = this.method5858(0, local60 & Static296.anInt4928);
				@Pc(73) int[] local73 = new int[Static185.anInt4925];
				local75 = 0;
				for (@Pc(79) int local79 = -this.anInt3695; local79 <= this.anInt3695; local79++) {
					local75 += local70[local79 & Static64.anInt1348];
				}
				@Pc(100) int local100 = 0;
				while (local100 < Static185.anInt4925) {
					local73[local100] = local51 * local75 >> 16;
					local75 -= local70[Static64.anInt1348 & local100 - this.anInt3695];
					local100++;
					local75 += local70[this.anInt3695 + local100 & Static64.anInt1348];
				}
				local54[this.anInt3698 + local60 - arg0] = local73;
			}
			for (@Pc(161) int local161 = 0; local161 < Static185.anInt4925; local161++) {
				@Pc(165) int local165 = 0;
				for (local75 = 0; local75 < local35; local75++) {
					local165 += local54[local75][local161];
				}
				local11[local161] = local39 * local165 >> 16;
			}
		}
		return local11;
	}
}
