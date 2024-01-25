import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ev", name = "O", descriptor = "[I")
	private final int[] anIntArray224;

	@OriginalMember(owner = "client!ev", name = "u", descriptor = "[I")
	private final int[] anIntArray219;

	@OriginalMember(owner = "client!ev", name = "G", descriptor = "Lclient!pv;")
	private final Class1_Sub3 aClass1_Sub3_3;

	@OriginalMember(owner = "client!ev", name = "E", descriptor = "Lclient!pv;")
	private final Class1_Sub3 aClass1_Sub3_2;

	@OriginalMember(owner = "client!ev", name = "z", descriptor = "Lclient!pv;")
	private final Class1_Sub3 aClass1_Sub3_1;

	@OriginalMember(owner = "client!ev", name = "Q", descriptor = "[Lclient!pv;")
	private final Class1_Sub3[] aClass1_Sub3Array16;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V")
	private Class1_Sub1_Sub5() {
		this.anIntArray224 = new int[0];
		this.anIntArray219 = new int[0];
		this.aClass1_Sub3_3 = new Class1_Sub3_Sub37(0);
		this.aClass1_Sub3_3.anInt9370 = 1;
		this.aClass1_Sub3_2 = new Class1_Sub3_Sub37();
		this.aClass1_Sub3_2.anInt9370 = 1;
		this.aClass1_Sub3_1 = new Class1_Sub3_Sub37();
		this.aClass1_Sub3Array16 = new Class1_Sub3[] { this.aClass1_Sub3_2, this.aClass1_Sub3_1, this.aClass1_Sub3_3 };
		this.aClass1_Sub3_1.anInt9370 = 1;
	}

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!gw;)V")
	public Class1_Sub1_Sub5(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(7) int local7 = arg0.method3043();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass1_Sub3Array16 = new Class1_Sub3[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class1_Sub3 local26 = Static524.method7448(arg0);
			if (local26.method7905() >= 0) {
				local9++;
			}
			if (local26.method7903() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass1_Sub3Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method3043();
			}
			this.aClass1_Sub3Array16[local20] = local26;
		}
		this.anIntArray224 = new int[local9];
		this.anIntArray219 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class1_Sub3 local98 = this.aClass1_Sub3Array16[local91];
			local50 = local98.aClass1_Sub3Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass1_Sub3Array42[local104] = this.aClass1_Sub3Array16[local18[local91][local104]];
			}
			@Pc(130) int local130 = local98.method7905();
			@Pc(134) int local134 = local98.method7903();
			if (local130 > 0) {
				this.anIntArray224[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray219[local11++] = local134;
			}
			local18[local91] = null;
		}
		this.aClass1_Sub3_2 = this.aClass1_Sub3Array16[arg0.method3043()];
		this.aClass1_Sub3_1 = this.aClass1_Sub3Array16[arg0.method3043()];
		this.aClass1_Sub3_3 = this.aClass1_Sub3Array16[arg0.method3043()];
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(DBLclient!kda;ILclient!n;ZI)[I")
	public int[] method2680(@OriginalArg(0) double arg0, @OriginalArg(2) Class160 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface8 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static166.aClass160_37 = arg1;
		Static29.anInterface8_6 = arg3;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub3Array16.length; local11++) {
			this.aClass1_Sub3Array16[local11].method7902(arg5, arg2);
		}
		Static147.method2993(arg0);
		Static400.method6036(arg2, arg5);
		@Pc(52) int[] local52 = new int[arg5 * arg2 * 4];
		@Pc(54) int local54 = 0;
		for (@Pc(56) int local56 = 0; local56 < arg2; local56++) {
			@Pc(74) int[] local74;
			@Pc(72) int[] local72;
			@Pc(70) int[] local70;
			@Pc(68) int[] local68;
			if (this.aClass1_Sub3_2.aBoolean652) {
				local68 = this.aClass1_Sub3_2.method7906(local56);
				local70 = local68;
				local72 = local68;
				local74 = local68;
			} else {
				@Pc(82) int[][] local82 = this.aClass1_Sub3_2.method7913(local56);
				local70 = local82[2];
				local72 = local82[1];
				local74 = local82[0];
			}
			if (this.aClass1_Sub3_1.aBoolean652) {
				local68 = this.aClass1_Sub3_1.method7906(local56);
			} else {
				local68 = this.aClass1_Sub3_1.method7913(local56)[0];
			}
			if (arg4) {
				local54 = local56;
			}
			for (@Pc(124) int local124 = arg5 - 1; local124 >= 0; local124--) {
				@Pc(132) int local132 = local74[local124] >> 4;
				if (local132 > 255) {
					local132 = 255;
				}
				if (local132 < 0) {
					local132 = 0;
				}
				@Pc(149) int local149 = local72[local124] >> 4;
				if (local149 > 255) {
					local149 = 255;
				}
				if (local149 < 0) {
					local149 = 0;
				}
				@Pc(164) int local164 = local70[local124] >> 4;
				if (local164 > 255) {
					local164 = 255;
				}
				local149 = Static94.anIntArray186[local149];
				local132 = Static94.anIntArray186[local132];
				if (local164 < 0) {
					local164 = 0;
				}
				local164 = Static94.anIntArray186[local164];
				@Pc(198) int local198;
				if (local132 == 0 && local149 == 0 && local164 == 0) {
					local198 = 0;
				} else {
					local198 = local68[local124] >> 4;
					if (local198 > 255) {
						local198 = 255;
					}
					if (local198 < 0) {
						local198 = 0;
					}
				}
				local52[local54++] = local164 + (local149 << 8) + (local132 << 16) + (local198 << 24);
				if (arg4) {
					local54 += arg5 - 1;
				}
			}
		}
		for (@Pc(252) int local252 = 0; local252 < this.aClass1_Sub3Array16.length; local252++) {
			this.aClass1_Sub3Array16[local252].method7908();
		}
		return local52;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!kda;Lclient!n;B)Z")
	public boolean method2681(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Interface8 arg1) {
		@Pc(12) int local12;
		if (Static337.anInt6310 >= 0) {
			for (local12 = 0; local12 < this.anIntArray224.length; local12++) {
				if (!arg0.method4212(this.anIntArray224[local12], Static337.anInt6310)) {
					return false;
				}
			}
		} else {
			for (local12 = 0; local12 < this.anIntArray224.length; local12++) {
				if (!arg0.method4213(this.anIntArray224[local12])) {
					return false;
				}
			}
		}
		for (local12 = 0; local12 < this.anIntArray219.length; local12++) {
			if (!arg1.method7084(this.anIntArray219[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIILclient!kda;Lclient!n;ZZD)[I")
	public int[] method2685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class160 arg2, @OriginalArg(4) Interface8 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) double arg6) {
		Static29.anInterface8_6 = arg3;
		Static166.aClass160_37 = arg2;
		for (@Pc(16) int local16 = 0; local16 < this.aClass1_Sub3Array16.length; local16++) {
			this.aClass1_Sub3Array16[local16].method7902(arg1, arg0);
		}
		Static147.method2993(arg6);
		Static400.method6036(arg0, arg1);
		@Pc(48) int[] local48 = new int[arg1 * arg0];
		@Pc(56) int local56;
		@Pc(52) int local52;
		@Pc(54) byte local54;
		if (arg4) {
			local52 = -1;
			local56 = arg1 - 1;
			local54 = -1;
		} else {
			local52 = arg1;
			local54 = 1;
			local56 = 0;
		}
		@Pc(68) int local68 = 0;
		for (@Pc(70) int local70 = 0; local70 < arg0; local70++) {
			if (arg5) {
				local68 = local70;
			}
			@Pc(92) int[] local92;
			@Pc(88) int[] local88;
			@Pc(90) int[] local90;
			if (this.aClass1_Sub3_2.aBoolean652) {
				@Pc(86) int[] local86 = this.aClass1_Sub3_2.method7906(local70);
				local88 = local86;
				local90 = local86;
				local92 = local86;
			} else {
				@Pc(100) int[][] local100 = this.aClass1_Sub3_2.method7913(local70);
				local88 = local100[1];
				local92 = local100[0];
				local90 = local100[2];
			}
			for (@Pc(114) int local114 = local56; local114 != local52; local114 += local54) {
				@Pc(122) int local122 = local92[local114] >> 4;
				if (local122 > 255) {
					local122 = 255;
				}
				if (local122 < 0) {
					local122 = 0;
				}
				@Pc(142) int local142 = local88[local114] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(159) int local159 = local90[local114] >> 4;
				if (local159 > 255) {
					local159 = 255;
				}
				local122 = Static94.anIntArray186[local122];
				if (local159 < 0) {
					local159 = 0;
				}
				local142 = Static94.anIntArray186[local142];
				local159 = Static94.anIntArray186[local159];
				@Pc(194) int local194 = local159 + (local122 << 16) + (local142 << 8);
				if (local194 != 0) {
					local194 |= 0xFF000000;
				}
				local48[local68++] = local194;
				if (arg5) {
					local68 += arg1 - 1;
				}
			}
		}
		for (@Pc(230) int local230 = 0; local230 < this.aClass1_Sub3Array16.length; local230++) {
			this.aClass1_Sub3Array16[local230].method7908();
		}
		return local48;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIZLclient!kda;Lclient!n;)[F")
	public float[] method2687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class160 arg3, @OriginalArg(5) Interface8 arg4) {
		Static166.aClass160_37 = arg3;
		Static29.anInterface8_6 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass1_Sub3Array16.length; local11++) {
			this.aClass1_Sub3Array16[local11].method7902(arg0, arg1);
		}
		Static400.method6036(arg1, arg0);
		@Pc(38) float[] local38 = new float[arg1 * arg0 * 4];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
			@Pc(58) int[] local58;
			@Pc(56) int[] local56;
			@Pc(60) int[] local60;
			if (this.aClass1_Sub3_2.aBoolean652) {
				@Pc(54) int[] local54 = this.aClass1_Sub3_2.method7906(local42);
				local56 = local54;
				local58 = local54;
				local60 = local54;
			} else {
				@Pc(68) int[][] local68 = this.aClass1_Sub3_2.method7913(local42);
				local58 = local68[0];
				local56 = local68[1];
				local60 = local68[2];
			}
			@Pc(90) int[] local90;
			if (this.aClass1_Sub3_1.aBoolean652) {
				local90 = this.aClass1_Sub3_1.method7906(local42);
			} else {
				local90 = this.aClass1_Sub3_1.method7913(local42)[0];
			}
			@Pc(110) int[] local110;
			if (this.aClass1_Sub3_3.aBoolean652) {
				local110 = this.aClass1_Sub3_3.method7906(local42);
			} else {
				local110 = this.aClass1_Sub3_3.method7913(local42)[0];
			}
			if (arg2) {
				local40 = local42 << 2;
			}
			for (@Pc(130) int local130 = arg0 - 1; local130 >= 0; local130--) {
				@Pc(139) float local139 = (float) local90[local130] / 4096.0F;
				if (local139 < 0.0F) {
					local139 = 0.0F;
				} else if (local139 > 1.0F) {
					local139 = 1.0F;
				}
				@Pc(166) float local166 = ((float) local110[local130] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local38[local40++] = local166 * (float) local58[local130];
				local38[local40++] = (float) local56[local130] * local166;
				local38[local40++] = (float) local60[local130] * local166;
				local38[local40++] = local139;
				if (arg2) {
					local40 += (arg0 << 2) - 4;
				}
			}
		}
		for (@Pc(220) int local220 = 0; local220 < this.aClass1_Sub3Array16.length; local220++) {
			this.aClass1_Sub3Array16[local220].method7908();
		}
		return local38;
	}
}
