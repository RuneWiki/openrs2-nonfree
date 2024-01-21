import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class32 {

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "[I")
	private final int[] anIntArray67;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "[I")
	private final int[] anIntArray66;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!eg;")
	private final Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "Lclient!eg;")
	private final Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "[Lclient!eg;")
	private final Class3_Sub2[] aClass3_Sub2Array12;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class32() {
		this.anIntArray67 = new int[0];
		this.anIntArray66 = new int[0];
		this.aClass3_Sub2_1 = new Class3_Sub2_Sub12();
		this.aClass3_Sub2_1.anInt4272 = 1;
		this.aClass3_Sub2_2 = new Class3_Sub2_Sub12();
		this.aClass3_Sub2_2.anInt4272 = 1;
		this.aClass3_Sub2Array12 = new Class3_Sub2[] { this.aClass3_Sub2_1, this.aClass3_Sub2_2 };
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!ce;)V")
	public Class32(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(5) int local5 = arg0.method1278();
		this.aClass3_Sub2Array12 = new Class3_Sub2[local5];
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(16) int[][] local16 = new int[local5][];
		@Pc(44) int local44;
		for (@Pc(18) int local18 = 0; local18 < local5; local18++) {
			@Pc(23) Class3_Sub2 local23 = Static156.method2291(arg0);
			if (local23.method3336() >= 0) {
				local13++;
			}
			if (local23.method3333() >= 0) {
				local11++;
			}
			@Pc(37) int local37 = local23.aClass3_Sub2Array42.length;
			local16[local18] = new int[local37];
			for (local44 = 0; local44 < local37; local44++) {
				local16[local18][local44] = arg0.method1278();
			}
			this.aClass3_Sub2Array12[local18] = local23;
		}
		this.anIntArray67 = new int[local11];
		local11 = 0;
		this.anIntArray66 = new int[local13];
		local13 = 0;
		for (@Pc(88) int local88 = 0; local88 < local5; local88++) {
			@Pc(94) Class3_Sub2 local94 = this.aClass3_Sub2Array12[local88];
			local44 = local94.aClass3_Sub2Array42.length;
			for (@Pc(100) int local100 = 0; local100 < local44; local100++) {
				local94.aClass3_Sub2Array42[local100] = this.aClass3_Sub2Array12[local16[local88][local100]];
			}
			@Pc(121) int local121 = local94.method3336();
			@Pc(125) int local125 = local94.method3333();
			if (local121 > 0) {
				this.anIntArray66[local13++] = local121;
			}
			if (local125 > 0) {
				this.anIntArray67[local11++] = local125;
			}
			local16[local88] = null;
		}
		this.aClass3_Sub2_1 = this.aClass3_Sub2Array12[arg0.method1278()];
		this.aClass3_Sub2_2 = this.aClass3_Sub2Array12[arg0.method1278()];
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ae;BLclient!ke;)Z")
	public boolean method885(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) Class52 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray66.length; local7++) {
			if (!arg1.method1578(this.anIntArray66[local7])) {
				return false;
			}
		}
		for (@Pc(31) int local31 = 0; local31 < this.anIntArray67.length; local31++) {
			if (!arg0.method563(this.anIntArray67[local31])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ae;Lclient!ke;ZIIIZD)[I")
	public int[] method886(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) double arg6) {
		Static149.method2161(arg6);
		@Pc(15) int[] local15 = new int[arg4 * arg3];
		Static67.anInterface1_6 = arg0;
		Static170.aClass52_13 = arg1;
		Static19.method317(arg3, arg4);
		for (@Pc(25) int local25 = 0; local25 < this.aClass3_Sub2Array12.length; local25++) {
			this.aClass3_Sub2Array12[local25].method3335(arg3, arg4);
		}
		@Pc(49) int local49;
		@Pc(47) int local47;
		@Pc(51) byte local51;
		if (arg5) {
			local47 = -1;
			local51 = -1;
			local49 = arg4 - 1;
		} else {
			local47 = arg4;
			local49 = 0;
			local51 = 1;
		}
		@Pc(70) int local70 = 0;
		for (@Pc(72) int local72 = 0; local72 < arg3; local72++) {
			if (arg2) {
				local70 = local72;
			}
			@Pc(94) int[] local94;
			@Pc(96) int[] local96;
			@Pc(92) int[] local92;
			if (this.aClass3_Sub2_1.aBoolean190) {
				@Pc(90) int[] local90 = this.aClass3_Sub2_1.method3334(local72);
				local92 = local90;
				local94 = local90;
				local96 = local90;
			} else {
				@Pc(104) int[][] local104 = this.aClass3_Sub2_1.method3326(local72);
				local96 = local104[1];
				local94 = local104[0];
				local92 = local104[2];
			}
			for (@Pc(118) int local118 = local49; local118 != local47; local118 += local51) {
				@Pc(126) int local126 = local94[local118] >> 4;
				if (local126 > 255) {
					local126 = 255;
				}
				if (local126 < 0) {
					local126 = 0;
				}
				@Pc(146) int local146 = local92[local118] >> 4;
				local126 = Static7.anIntArray3[local126];
				if (local146 > 255) {
					local146 = 255;
				}
				@Pc(161) int local161 = local96[local118] >> 4;
				if (local161 > 255) {
					local161 = 255;
				}
				if (local161 < 0) {
					local161 = 0;
				}
				if (local146 < 0) {
					local146 = 0;
				}
				local161 = Static7.anIntArray3[local161];
				local146 = Static7.anIntArray3[local146];
				local15[local70++] = (local161 << 8) + (local126 << 16) + local146;
				if (arg2) {
					local70 += arg4 - 1;
				}
			}
		}
		for (@Pc(225) int local225 = 0; local225 < this.aClass3_Sub2Array12.length; local225++) {
			this.aClass3_Sub2Array12[local225].method3331();
		}
		return local15;
	}
}
