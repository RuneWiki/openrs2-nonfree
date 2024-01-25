import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!om", name = "O", descriptor = "[I")
	private final int[] anIntArray375;

	@OriginalMember(owner = "client!om", name = "C", descriptor = "[I")
	private final int[] anIntArray374;

	@OriginalMember(owner = "client!om", name = "B", descriptor = "Lclient!jq;")
	private final Class1_Sub2 aClass1_Sub2_2;

	@OriginalMember(owner = "client!om", name = "J", descriptor = "Lclient!jq;")
	private final Class1_Sub2 aClass1_Sub2_3;

	@OriginalMember(owner = "client!om", name = "A", descriptor = "Lclient!jq;")
	private final Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!om", name = "z", descriptor = "[Lclient!jq;")
	private final Class1_Sub2[] aClass1_Sub2Array27;

	static {
		new Class96("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	private Class1_Sub1_Sub10() {
		this.anIntArray375 = new int[0];
		this.anIntArray374 = new int[0];
		this.aClass1_Sub2_2 = new Class1_Sub2_Sub21(0);
		this.aClass1_Sub2_2.anInt7615 = 1;
		this.aClass1_Sub2_3 = new Class1_Sub2_Sub21();
		this.aClass1_Sub2_3.anInt7615 = 1;
		this.aClass1_Sub2_1 = new Class1_Sub2_Sub21();
		this.aClass1_Sub2Array27 = new Class1_Sub2[] { this.aClass1_Sub2_3, this.aClass1_Sub2_1, this.aClass1_Sub2_2 };
		this.aClass1_Sub2_1.anInt7615 = 1;
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!ti;)V")
	public Class1_Sub1_Sub10(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(7) int local7 = arg0.method4548();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass1_Sub2Array27 = new Class1_Sub2[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(47) int local47;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub2 local26 = Static221.method5885(arg0);
			if (local26.method5870() >= 0) {
				local9++;
			}
			if (local26.method5861() >= 0) {
				local11++;
			}
			@Pc(40) int local40 = local26.aClass1_Sub2Array42.length;
			local18[local20] = new int[local40];
			for (local47 = 0; local47 < local40; local47++) {
				local18[local20][local47] = arg0.method4548();
			}
			this.aClass1_Sub2Array27[local20] = local26;
		}
		this.anIntArray374 = new int[local9];
		this.anIntArray375 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(88) int local88 = 0; local88 < local7; local88++) {
			@Pc(95) Class1_Sub2 local95 = this.aClass1_Sub2Array27[local88];
			local47 = local95.aClass1_Sub2Array42.length;
			for (@Pc(101) int local101 = 0; local101 < local47; local101++) {
				local95.aClass1_Sub2Array42[local101] = this.aClass1_Sub2Array27[local18[local88][local101]];
			}
			@Pc(127) int local127 = local95.method5870();
			@Pc(131) int local131 = local95.method5861();
			if (local127 > 0) {
				this.anIntArray374[local9++] = local127;
			}
			if (local131 > 0) {
				this.anIntArray375[local11++] = local131;
			}
			local18[local88] = null;
		}
		this.aClass1_Sub2_3 = this.aClass1_Sub2Array27[arg0.method4548()];
		this.aClass1_Sub2_1 = this.aClass1_Sub2Array27[arg0.method4548()];
		this.aClass1_Sub2_2 = this.aClass1_Sub2Array27[arg0.method4548()];
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZLclient!m;ILclient!hh;)[F")
	public float[] method3974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface5 arg3, @OriginalArg(5) Class109 arg4) {
		Static51.anInterface5_3 = arg3;
		Static20.aClass109_6 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub2Array27.length; local11++) {
			this.aClass1_Sub2Array27[local11].method5871(arg0, arg1);
		}
		Static316.method4366(arg1, arg0);
		@Pc(47) float[] local47 = new float[arg0 * 4 * arg1];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < arg0; local51++) {
			@Pc(65) int[] local65;
			@Pc(69) int[] local69;
			@Pc(67) int[] local67;
			if (this.aClass1_Sub2_3.aBoolean645) {
				@Pc(63) int[] local63 = this.aClass1_Sub2_3.method5868(local51);
				local65 = local63;
				local67 = local63;
				local69 = local63;
			} else {
				@Pc(77) int[][] local77 = this.aClass1_Sub2_3.method5865(local51);
				local67 = local77[2];
				local65 = local77[0];
				local69 = local77[1];
			}
			@Pc(101) int[] local101;
			if (this.aClass1_Sub2_1.aBoolean645) {
				local101 = this.aClass1_Sub2_1.method5868(local51);
			} else {
				local101 = this.aClass1_Sub2_1.method5865(local51)[0];
			}
			if (arg2) {
				local49 = local51 << 2;
			}
			@Pc(127) int[] local127;
			if (this.aClass1_Sub2_2.aBoolean645) {
				local127 = this.aClass1_Sub2_2.method5868(local51);
			} else {
				local127 = this.aClass1_Sub2_2.method5865(local51)[0];
			}
			for (@Pc(139) int local139 = arg1 - 1; local139 >= 0; local139--) {
				@Pc(148) float local148 = (float) local101[local139] / 4096.0F;
				@Pc(161) float local161 = ((float) local127[local139] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local148 < 0.0F) {
					local148 = 0.0F;
				} else if (local148 > 1.0F) {
					local148 = 1.0F;
				}
				local47[local49++] = local161 * (float) local65[local139];
				local47[local49++] = (float) local69[local139] * local161;
				local47[local49++] = local161 * (float) local67[local139];
				local47[local49++] = local148;
				if (arg2) {
					local49 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(236) int local236 = 0; local236 < this.aClass1_Sub2Array27.length; local236++) {
			this.aClass1_Sub2Array27[local236].method5860();
		}
		return local47;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!hh;ZIDBLclient!m;IZ)[I")
	public int[] method3975(@OriginalArg(0) Class109 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(5) Interface5 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		Static51.anInterface5_3 = arg4;
		Static20.aClass109_6 = arg0;
		for (@Pc(17) int local17 = 0; local17 < this.aClass1_Sub2Array27.length; local17++) {
			this.aClass1_Sub2Array27[local17].method5871(arg5, arg2);
		}
		Static375.method5903(arg3);
		Static316.method4366(arg2, arg5);
		@Pc(51) int[] local51 = new int[arg2 * arg5];
		@Pc(59) int local59;
		@Pc(57) int local57;
		@Pc(55) byte local55;
		if (arg1) {
			local59 = arg2 - 1;
			local57 = -1;
			local55 = -1;
		} else {
			local55 = 1;
			local57 = arg2;
			local59 = 0;
		}
		@Pc(71) int local71 = 0;
		for (@Pc(73) int local73 = 0; local73 < arg5; local73++) {
			if (arg6) {
				local71 = local73;
			}
			@Pc(91) int[] local91;
			@Pc(95) int[] local95;
			@Pc(93) int[] local93;
			if (this.aClass1_Sub2_3.aBoolean645) {
				@Pc(89) int[] local89 = this.aClass1_Sub2_3.method5868(local73);
				local91 = local89;
				local93 = local89;
				local95 = local89;
			} else {
				@Pc(103) int[][] local103 = this.aClass1_Sub2_3.method5865(local73);
				local91 = local103[0];
				local93 = local103[2];
				local95 = local103[1];
			}
			for (@Pc(117) int local117 = local59; local117 != local57; local117 += local55) {
				@Pc(125) int local125 = local91[local117] >> 4;
				if (local125 > 255) {
					local125 = 255;
				}
				if (local125 < 0) {
					local125 = 0;
				}
				@Pc(140) int local140 = local95[local117] >> 4;
				if (local140 > 255) {
					local140 = 255;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				@Pc(157) int local157 = local93[local117] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				if (local157 < 0) {
					local157 = 0;
				}
				local140 = Static7.anIntArray10[local140];
				local125 = Static7.anIntArray10[local125];
				local157 = Static7.anIntArray10[local157];
				@Pc(191) int local191 = local157 + (local140 << 8) + (local125 << 16);
				if (local191 != 0) {
					local191 |= 0xFF000000;
				}
				local51[local71++] = local191;
				if (arg6) {
					local71 += arg2 - 1;
				}
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.aClass1_Sub2Array27.length; local231++) {
			this.aClass1_Sub2Array27[local231].method5860();
		}
		return local51;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BLclient!hh;Lclient!m;)Z")
	public boolean method3977(@OriginalArg(1) Class109 arg0, @OriginalArg(2) Interface5 arg1) {
		@Pc(15) int local15;
		if (Static238.anInt4205 < 0) {
			for (local15 = 0; local15 < this.anIntArray374.length; local15++) {
				if (!arg0.method2348(this.anIntArray374[local15])) {
					return false;
				}
			}
		} else {
			for (local15 = 0; local15 < this.anIntArray374.length; local15++) {
				if (!arg0.method2354(Static238.anInt4205, this.anIntArray374[local15])) {
					return false;
				}
			}
		}
		for (local15 = 0; local15 < this.anIntArray375.length; local15++) {
			if (!arg1.method3922(this.anIntArray375[local15])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIZDLclient!hh;Lclient!m;)[I")
	public int[] method3979(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) double arg3, @OriginalArg(5) Class109 arg4, @OriginalArg(6) Interface5 arg5) {
		Static51.anInterface5_3 = arg5;
		Static20.aClass109_6 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub2Array27.length; local11++) {
			this.aClass1_Sub2Array27[local11].method5871(arg0, arg1);
		}
		Static375.method5903(arg3);
		Static316.method4366(arg1, arg0);
		@Pc(49) int[] local49 = new int[arg0 * 4 * arg1];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < arg0; local53++) {
			@Pc(69) int[] local69;
			@Pc(77) int[] local77;
			@Pc(73) int[] local73;
			@Pc(85) int[] local85;
			if (this.aClass1_Sub2_3.aBoolean645) {
				local85 = this.aClass1_Sub2_3.method5868(local53);
				local69 = local85;
				local73 = local85;
				local77 = local85;
			} else {
				@Pc(65) int[][] local65 = this.aClass1_Sub2_3.method5865(local53);
				local69 = local65[0];
				local73 = local65[2];
				local77 = local65[1];
			}
			if (arg2) {
				local51 = local53;
			}
			if (this.aClass1_Sub2_1.aBoolean645) {
				local85 = this.aClass1_Sub2_1.method5868(local53);
			} else {
				local85 = this.aClass1_Sub2_1.method5865(local53)[0];
			}
			for (@Pc(119) int local119 = arg1 - 1; local119 >= 0; local119--) {
				@Pc(127) int local127 = local69[local119] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(144) int local144 = local77[local119] >> 4;
				if (local144 > 255) {
					local144 = 255;
				}
				if (local144 < 0) {
					local144 = 0;
				}
				@Pc(159) int local159 = local73[local119] >> 4;
				if (local159 > 255) {
					local159 = 255;
				}
				if (local159 < 0) {
					local159 = 0;
				}
				local127 = Static7.anIntArray10[local127];
				local144 = Static7.anIntArray10[local144];
				local159 = Static7.anIntArray10[local159];
				@Pc(198) int local198;
				if (local127 == 0 && local144 == 0 && local159 == 0) {
					local198 = 0;
				} else {
					local198 = local85[local119] >> 4;
					if (local198 > 255) {
						local198 = 255;
					}
					if (local198 < 0) {
						local198 = 0;
					}
				}
				local49[local51++] = (local127 << 16) + (local198 << 24) + (local144 << 8) + local159;
				if (arg2) {
					local51 += arg1 - 1;
				}
			}
		}
		for (@Pc(251) int local251 = 0; local251 < this.aClass1_Sub2Array27.length; local251++) {
			this.aClass1_Sub2Array27[local251].method5860();
		}
		return local49;
	}
}
