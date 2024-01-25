import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ap", name = "y", descriptor = "[I")
	private final int[] anIntArray13;

	@OriginalMember(owner = "client!ap", name = "z", descriptor = "[I")
	private final int[] anIntArray14;

	@OriginalMember(owner = "client!ap", name = "w", descriptor = "Lclient!gd;")
	private final Class1_Sub4 aClass1_Sub4_1;

	@OriginalMember(owner = "client!ap", name = "E", descriptor = "Lclient!gd;")
	private final Class1_Sub4 aClass1_Sub4_3;

	@OriginalMember(owner = "client!ap", name = "A", descriptor = "Lclient!gd;")
	private final Class1_Sub4 aClass1_Sub4_2;

	@OriginalMember(owner = "client!ap", name = "F", descriptor = "[Lclient!gd;")
	private final Class1_Sub4[] aClass1_Sub4Array4;

	static {
		new Class119("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V")
	private Class1_Sub5_Sub1() {
		this.anIntArray13 = new int[0];
		this.anIntArray14 = new int[0];
		this.aClass1_Sub4_1 = new Class1_Sub4_Sub34(0);
		this.aClass1_Sub4_1.anInt7270 = 1;
		this.aClass1_Sub4_3 = new Class1_Sub4_Sub34();
		this.aClass1_Sub4_3.anInt7270 = 1;
		this.aClass1_Sub4_2 = new Class1_Sub4_Sub34();
		this.aClass1_Sub4_2.anInt7270 = 1;
		this.aClass1_Sub4Array4 = new Class1_Sub4[] { this.aClass1_Sub4_3, this.aClass1_Sub4_2, this.aClass1_Sub4_1 };
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class1_Sub5_Sub1(@OriginalArg(0) Class1_Sub28 arg0) {
		@Pc(7) int local7 = arg0.method5337();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass1_Sub4Array4 = new Class1_Sub4[local7];
		@Pc(53) int local53;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub4 local26 = Static346.method4705(arg0);
			if (local26.method5694() >= 0) {
				local9++;
			}
			if (local26.method5687() >= 0) {
				local11++;
			}
			@Pc(46) int local46 = local26.aClass1_Sub4Array42.length;
			local14[local20] = new int[local46];
			for (local53 = 0; local53 < local46; local53++) {
				local14[local20][local53] = arg0.method5337();
			}
			this.aClass1_Sub4Array4[local20] = local26;
		}
		this.anIntArray13 = new int[local9];
		local9 = 0;
		this.anIntArray14 = new int[local11];
		local11 = 0;
		for (@Pc(94) int local94 = 0; local94 < local7; local94++) {
			@Pc(101) Class1_Sub4 local101 = this.aClass1_Sub4Array4[local94];
			local53 = local101.aClass1_Sub4Array42.length;
			for (@Pc(107) int local107 = 0; local107 < local53; local107++) {
				local101.aClass1_Sub4Array42[local107] = this.aClass1_Sub4Array4[local14[local94][local107]];
			}
			@Pc(129) int local129 = local101.method5694();
			@Pc(133) int local133 = local101.method5687();
			if (local129 > 0) {
				this.anIntArray13[local9++] = local129;
			}
			if (local133 > 0) {
				this.anIntArray14[local11++] = local133;
			}
			local14[local94] = null;
		}
		this.aClass1_Sub4_3 = this.aClass1_Sub4Array4[arg0.method5337()];
		this.aClass1_Sub4_2 = this.aClass1_Sub4Array4[arg0.method5337()];
		this.aClass1_Sub4_1 = this.aClass1_Sub4Array4[arg0.method5337()];
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZLclient!fo;ZIIBLclient!l;D)[I")
	public int[] method245(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Interface6 arg5, @OriginalArg(7) double arg6) {
		Static46.anInterface6_1 = arg5;
		Static333.aClass82_78 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub4Array4.length; local11++) {
			this.aClass1_Sub4Array4[local11].method5698(arg3, arg4);
		}
		Static412.method5318(arg6);
		Static412.method5317(arg4, arg3);
		@Pc(43) int[] local43 = new int[arg3 * arg4];
		@Pc(53) int local53;
		@Pc(49) int local49;
		@Pc(47) byte local47;
		if (arg2) {
			local47 = -1;
			local49 = -1;
			local53 = arg4 - 1;
		} else {
			local49 = arg4;
			local53 = 0;
			local47 = 1;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg3; local65++) {
			if (arg0) {
				local63 = local65;
			}
			@Pc(85) int[] local85;
			@Pc(87) int[] local87;
			@Pc(83) int[] local83;
			if (this.aClass1_Sub4_3.aBoolean796) {
				@Pc(81) int[] local81 = this.aClass1_Sub4_3.method5683(local65);
				local83 = local81;
				local85 = local81;
				local87 = local81;
			} else {
				@Pc(95) int[][] local95 = this.aClass1_Sub4_3.method5691(local65);
				local85 = local95[0];
				local83 = local95[2];
				local87 = local95[1];
			}
			for (@Pc(109) int local109 = local53; local109 != local49; local109 += local47) {
				@Pc(117) int local117 = local85[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(135) int local135 = local87[local109] >> 4;
				if (local135 > 255) {
					local135 = 255;
				}
				if (local135 < 0) {
					local135 = 0;
				}
				@Pc(152) int local152 = local83[local109] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				if (local152 < 0) {
					local152 = 0;
				}
				local135 = Static127.anIntArray157[local135];
				local117 = Static127.anIntArray157[local117];
				local152 = Static127.anIntArray157[local152];
				@Pc(188) int local188 = (local135 << 8) + (local117 << 16) + local152;
				if (local188 != 0) {
					local188 |= 0xFF000000;
				}
				local43[local63++] = local188;
				if (arg0) {
					local63 += arg4 - 1;
				}
			}
		}
		for (@Pc(233) int local233 = 0; local233 < this.aClass1_Sub4Array4.length; local233++) {
			this.aClass1_Sub4Array4[local233].method5688();
		}
		return local43;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!fo;Lclient!l;B)Z")
	public boolean method246(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Interface6 arg1) {
		@Pc(9) int local9;
		if (Static458.anInt6288 < 0) {
			for (local9 = 0; local9 < this.anIntArray13.length; local9++) {
				if (!arg0.method1820(this.anIntArray13[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray13.length; local9++) {
				if (!arg0.method1829(Static458.anInt6288, this.anIntArray13[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray14.length; local9++) {
			if (!arg1.method3934(this.anIntArray14[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!l;ZILclient!fo;I)[F")
	public float[] method247(@OriginalArg(0) int arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class82 arg3, @OriginalArg(5) int arg4) {
		Static333.aClass82_78 = arg3;
		Static46.anInterface6_1 = arg1;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub4Array4.length; local11++) {
			this.aClass1_Sub4Array4[local11].method5698(arg4, arg0);
		}
		Static412.method5317(arg0, arg4);
		@Pc(42) float[] local42 = new float[arg0 * arg4 * 4];
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < arg4; local55++) {
			@Pc(73) int[] local73;
			@Pc(71) int[] local71;
			@Pc(75) int[] local75;
			if (this.aClass1_Sub4_3.aBoolean796) {
				@Pc(69) int[] local69 = this.aClass1_Sub4_3.method5683(local55);
				local71 = local69;
				local73 = local69;
				local75 = local69;
			} else {
				@Pc(83) int[][] local83 = this.aClass1_Sub4_3.method5691(local55);
				local75 = local83[2];
				local73 = local83[0];
				local71 = local83[1];
			}
			@Pc(107) int[] local107;
			if (this.aClass1_Sub4_2.aBoolean796) {
				local107 = this.aClass1_Sub4_2.method5683(local55);
			} else {
				local107 = this.aClass1_Sub4_2.method5691(local55)[0];
			}
			@Pc(127) int[] local127;
			if (this.aClass1_Sub4_1.aBoolean796) {
				local127 = this.aClass1_Sub4_1.method5683(local55);
			} else {
				local127 = this.aClass1_Sub4_1.method5691(local55)[0];
			}
			if (arg2) {
				local53 = local55 << 2;
			}
			for (@Pc(145) int local145 = arg0 - 1; local145 >= 0; local145--) {
				@Pc(154) float local154 = (float) local107[local145] / 4096.0F;
				if (local154 < 0.0F) {
					local154 = 0.0F;
				} else if (local154 > 1.0F) {
					local154 = 1.0F;
				}
				@Pc(181) float local181 = ((float) local127[local145] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local42[local53++] = (float) local73[local145] * local181;
				local42[local53++] = local181 * (float) local71[local145];
				local42[local53++] = local181 * (float) local75[local145];
				local42[local53++] = local154;
				if (arg2) {
					local53 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(235) int local235 = 0; local235 < this.aClass1_Sub4Array4.length; local235++) {
			this.aClass1_Sub4Array4[local235].method5688();
		}
		return local42;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!l;Lclient!fo;DBIIZ)[I")
	public int[] method249(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) double arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static46.anInterface6_1 = arg0;
		Static333.aClass82_78 = arg1;
		for (@Pc(16) int local16 = 0; local16 < this.aClass1_Sub4Array4.length; local16++) {
			this.aClass1_Sub4Array4[local16].method5698(arg3, arg4);
		}
		Static412.method5318(arg2);
		Static412.method5317(arg4, arg3);
		@Pc(50) int[] local50 = new int[arg4 * 4 * arg3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < arg3; local54++) {
			@Pc(78) int[] local78;
			@Pc(70) int[] local70;
			@Pc(74) int[] local74;
			@Pc(86) int[] local86;
			if (this.aClass1_Sub4_3.aBoolean796) {
				local86 = this.aClass1_Sub4_3.method5683(local54);
				local74 = local86;
				local70 = local86;
				local78 = local86;
			} else {
				@Pc(66) int[][] local66 = this.aClass1_Sub4_3.method5691(local54);
				local70 = local66[1];
				local74 = local66[2];
				local78 = local66[0];
			}
			if (arg5) {
				local52 = local54;
			}
			if (this.aClass1_Sub4_2.aBoolean796) {
				local86 = this.aClass1_Sub4_2.method5683(local54);
			} else {
				local86 = this.aClass1_Sub4_2.method5691(local54)[0];
			}
			for (@Pc(120) int local120 = arg4 - 1; local120 >= 0; local120--) {
				@Pc(128) int local128 = local78[local120] >> 4;
				if (local128 > 255) {
					local128 = 255;
				}
				if (local128 < 0) {
					local128 = 0;
				}
				@Pc(145) int local145 = local70[local120] >> 4;
				if (local145 > 255) {
					local145 = 255;
				}
				if (local145 < 0) {
					local145 = 0;
				}
				@Pc(163) int local163 = local74[local120] >> 4;
				if (local163 > 255) {
					local163 = 255;
				}
				if (local163 < 0) {
					local163 = 0;
				}
				local145 = Static127.anIntArray157[local145];
				local128 = Static127.anIntArray157[local128];
				local163 = Static127.anIntArray157[local163];
				@Pc(198) int local198;
				if (local128 == 0 && local145 == 0 && local163 == 0) {
					local198 = 0;
				} else {
					local198 = local86[local120] >> 4;
					if (local198 > 255) {
						local198 = 255;
					}
					if (local198 < 0) {
						local198 = 0;
					}
				}
				local50[local52++] = (local128 << 16) + (local198 << 24) + (local145 << 8) + local163;
				if (arg5) {
					local52 += arg4 - 1;
				}
			}
		}
		for (@Pc(254) int local254 = 0; local254 < this.aClass1_Sub4Array4.length; local254++) {
			this.aClass1_Sub4Array4[local254].method5688();
		}
		return local50;
	}
}
