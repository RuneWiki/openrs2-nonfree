import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class63_Sub2 extends Class63 {

	@OriginalMember(owner = "client!jv", name = "j", descriptor = "Lclient!uba;")
	private Class280 aClass280_1;

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "[I")
	private int[] anIntArray414;

	@OriginalMember(owner = "client!jv", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!jv", name = "t", descriptor = "[F")
	private float[] aFloatArray22;

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "Lclient!eea;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!jv", name = "v", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!jv", name = "y", descriptor = "I")
	private int anInt4229;

	@OriginalMember(owner = "client!jv", name = "z", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!jv", name = "A", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!jv", name = "C", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!jv", name = "F", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!jv", name = "M", descriptor = "[Lclient!mm;")
	private Class192[] aClass192Array4;

	@OriginalMember(owner = "client!jv", name = "N", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!jv", name = "O", descriptor = "I")
	private int anInt4238;

	@OriginalMember(owner = "client!jv", name = "Q", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!jv", name = "R", descriptor = "S")
	private short aShort82;

	@OriginalMember(owner = "client!jv", name = "S", descriptor = "[I")
	private int[] anIntArray415;

	@OriginalMember(owner = "client!jv", name = "T", descriptor = "S")
	private short aShort83;

	@OriginalMember(owner = "client!jv", name = "U", descriptor = "B")
	private byte aByte62;

	@OriginalMember(owner = "client!jv", name = "V", descriptor = "Lclient!lq;")
	private Interface10 anInterface10_3;

	@OriginalMember(owner = "client!jv", name = "W", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!jv", name = "X", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!jv", name = "hb", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!jv", name = "ib", descriptor = "[Lclient!iba;")
	private Class126[] aClass126Array1;

	@OriginalMember(owner = "client!jv", name = "lb", descriptor = "S")
	private short lb;

	@OriginalMember(owner = "client!jv", name = "nb", descriptor = "[F")
	private float[] aFloatArray23;

	@OriginalMember(owner = "client!jv", name = "qb", descriptor = "[I")
	private int[] anIntArray416;

	@OriginalMember(owner = "client!jv", name = "vb", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!jv", name = "zb", descriptor = "S")
	private short aShort86;

	@OriginalMember(owner = "client!jv", name = "Db", descriptor = "S")
	private short aShort87;

	@OriginalMember(owner = "client!jv", name = "Gb", descriptor = "[Lclient!kda;")
	private Class159[] aClass159Array1;

	@OriginalMember(owner = "client!jv", name = "Jb", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!jv", name = "Kb", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!jv", name = "Lb", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!jv", name = "Qb", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!jv", name = "Tb", descriptor = "S")
	private short aShort89;

	@OriginalMember(owner = "client!jv", name = "ac", descriptor = "I")
	private int anInt4275;

	@OriginalMember(owner = "client!jv", name = "ec", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!jv", name = "gc", descriptor = "[I")
	private int[] anIntArray417;

	@OriginalMember(owner = "client!jv", name = "jc", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!jv", name = "qc", descriptor = "[I")
	private int[] anIntArray418;

	@OriginalMember(owner = "client!jv", name = "rc", descriptor = "[Lclient!kv;")
	private Class169[] aClass169Array4;

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
	private int anInt4221 = 0;

	@OriginalMember(owner = "client!jv", name = "P", descriptor = "Z")
	private boolean aBoolean324 = true;

	@OriginalMember(owner = "client!jv", name = "gb", descriptor = "I")
	private int anInt4246 = 0;

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
	private int anInt4225 = 0;

	@OriginalMember(owner = "client!jv", name = "Y", descriptor = "I")
	private int anInt4239 = 0;

	@OriginalMember(owner = "client!jv", name = "fc", descriptor = "I")
	private int anInt4278 = 0;

	@OriginalMember(owner = "client!jv", name = "H", descriptor = "Z")
	private boolean aBoolean323 = false;

	@OriginalMember(owner = "client!jv", name = "kc", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_20;

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "Lclient!af;")
	private Class11 aClass11_4;

	@OriginalMember(owner = "client!jv", name = "lc", descriptor = "Lclient!af;")
	private Class11 aClass11_7;

	@OriginalMember(owner = "client!jv", name = "Cb", descriptor = "Lclient!af;")
	private Class11 aClass11_6;

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "Lclient!af;")
	private Class11 aClass11_5;

	@OriginalMember(owner = "client!jv", name = "Nb", descriptor = "Lclient!tc;")
	private Class267 aClass267_1;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class63_Sub2(@OriginalArg(0) Class39_Sub3 arg0) {
		this.aClass39_Sub3_20 = arg0;
		this.aClass11_4 = new Class11(null, 5126, 3, 0);
		this.aClass11_7 = new Class11(null, 5126, 2, 0);
		this.aClass11_6 = new Class11(null, 5126, 3, 0);
		this.aClass11_5 = new Class11(null, 5121, 4, 0);
		this.aClass267_1 = new Class267();
	}

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!os;Lclient!bt;IIII)V")
	public Class63_Sub2(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4238 = arg5;
		this.aClass39_Sub3_20 = arg0;
		this.anInt4229 = arg2;
		if (Static204.method3281(arg2, arg5)) {
			this.aClass11_4 = new Class11(null, 5126, 3, 0);
		}
		if (Static460.method7584(arg2, arg5)) {
			this.aClass11_7 = new Class11(null, 5126, 2, 0);
		}
		if (Static262.method6209(arg5, arg2)) {
			this.aClass11_6 = new Class11(null, 5126, 3, 0);
		}
		if (Static466.method7016(arg5, arg2)) {
			this.aClass11_5 = new Class11(null, 5121, 4, 0);
		}
		if (Static188.method254(arg5, arg2)) {
			this.aClass267_1 = new Class267();
		}
		@Pc(102) Interface12 local102 = arg0.anInterface12_15;
		@Pc(106) int[] local106 = new int[arg1.anInt856];
		this.anIntArray418 = new int[arg1.anInt861 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt856; local115++) {
			if ((arg1.aByteArray25 == null || arg1.aByteArray25[local115] != 2) && (arg1.aShortArray35 == null || arg1.aShortArray35[local115] == -1 || !local102.method2573(arg1.aShortArray35[local115] & 0xFFFF).aBoolean459)) {
				local106[this.anInt4239++] = local115;
				this.anIntArray418[arg1.aShortArray33[local115]]++;
				this.anIntArray418[arg1.aShortArray27[local115]]++;
				this.anIntArray418[arg1.aShortArray28[local115]]++;
			}
		}
		this.anInt4246 = this.anInt4239;
		@Pc(208) long[] local208 = new long[this.anInt4239];
		@Pc(220) boolean local220 = (this.anInt4229 & 0x100) != 0;
		@Pc(232) int local232;
		@Pc(243) int local243;
		@Pc(371) int local371;
		label495: for (@Pc(222) int local222 = 0; local222 < this.anInt4239; local222++) {
			@Pc(228) int local228 = local106[local222];
			@Pc(230) Class204 local230 = null;
			local232 = 0;
			@Pc(234) byte local234 = 0;
			@Pc(236) byte local236 = 0;
			@Pc(238) byte local238 = 0;
			if (arg1.aClass120Array1 != null) {
				for (local243 = 0; local243 < arg1.aClass120Array1.length; local243++) {
					@Pc(250) Class120 local250 = arg1.aClass120Array1[local243];
					if (local250.anInt3402 == local228) {
						@Pc(259) Class233 local259 = Static367.method5866(local250.anInt3401);
						if (local259.aBoolean556) {
							local208[local222] = Long.MAX_VALUE;
							this.anInt4246--;
							continue label495;
						}
					}
				}
			}
			@Pc(282) short local282 = -1;
			if (arg1.aShortArray35 != null) {
				local282 = arg1.aShortArray35[local228];
				if (local282 != -1) {
					local230 = local102.method2573(local282 & 0xFFFF);
					local236 = local230.aByte85;
					local238 = local230.aByte86;
				}
			}
			@Pc(333) boolean local333 = arg1.aByteArray30 != null && arg1.aByteArray30[local228] != 0 || local230 != null && !local230.aBoolean458 | local230.aBoolean453;
			if ((local220 || local333) && arg1.aByteArray31 != null) {
				local232 += arg1.aByteArray31[local228] << 17;
			}
			if (local333) {
				local232 += 65536;
			}
			local232 += (local236 & 0xFF) << 8;
			local371 = local234 + ((local282 & 0xFFFF) << 16);
			local232 += local238 & 0xFF;
			@Pc(383) int local383 = local371 + (local222 & 0xFFFF);
			local208[local222] = ((long) local232 << 32) + ((long) local383);
		}
		Static59.method1102(local208, local106);
		this.anIntArray416 = arg1.anIntArray72;
		this.anIntArray415 = arg1.anIntArray71;
		this.anInt4225 = arg1.anInt861;
		this.anInt4278 = arg1.anInt866;
		this.aShortArray81 = arg1.aShortArray26;
		this.anIntArray417 = arg1.anIntArray65;
		@Pc(435) Class130[] local435 = new Class130[this.anInt4225];
		this.aClass169Array4 = arg1.aClass169Array1;
		this.aClass192Array4 = arg1.aClass192Array1;
		@Pc(463) int local463;
		@Pc(477) int local477;
		if (arg1.aClass120Array1 != null) {
			this.anInt4275 = arg1.aClass120Array1.length;
			this.aClass126Array1 = new Class126[this.anInt4275];
			this.aClass159Array1 = new Class159[this.anInt4275];
			for (local463 = 0; local463 < this.anInt4275; local463++) {
				@Pc(470) Class120 local470 = arg1.aClass120Array1[local463];
				@Pc(475) Class233 local475 = Static367.method5866(local470.anInt3401);
				local477 = -1;
				for (@Pc(479) int local479 = 0; local479 < this.anInt4239; local479++) {
					if (local106[local479] == local470.anInt3402) {
						local477 = local479;
						break;
					}
				}
				if (local477 == -1) {
					throw new RuntimeException();
				}
				local243 = Static445.anIntArray614[arg1.aShortArray30[local470.anInt3402] & 0xFFFF] & 0xFFFFFF;
				local243 |= 255 - (arg1.aByteArray30 == null ? 0 : arg1.aByteArray30[local470.anInt3402]) << 24;
				this.aClass126Array1[local463] = new Class126(local477, arg1.aShortArray33[local470.anInt3402], arg1.aShortArray27[local470.anInt3402], arg1.aShortArray28[local470.anInt3402], local475.anInt7439, local475.anInt7440, local475.anInt7435, local475.anInt7438, local475.anInt7434, local475.aBoolean556, local475.aBoolean558, local470.anInt3406);
				this.aClass159Array1[local463] = new Class159(local243);
			}
		}
		local463 = this.anInt4239 * 3;
		this.aByteArray77 = new byte[local463];
		this.aFloatArray22 = new float[local463];
		Static211.aLongArray12 = new long[local463];
		this.aShortArray82 = new short[this.anInt4239];
		this.aShortArray77 = new short[this.anInt4239];
		this.aFloatArray23 = new float[local463];
		this.aByteArray78 = new byte[this.anInt4239];
		this.aShortArray74 = new short[this.anInt4239];
		this.aShortArray73 = new short[this.anInt4239];
		this.aShortArray79 = new short[local463];
		this.aShort88 = (short) arg4;
		this.aShortArray80 = new short[local463];
		this.aShortArray75 = new short[local463];
		this.aShortArray76 = new short[this.anInt4239];
		if (arg1.aShortArray31 != null) {
			this.aShortArray72 = new short[this.anInt4239];
		}
		this.aShort84 = (short) arg3;
		this.aShortArray78 = new short[local463];
		local232 = 0;
		for (local371 = 0; local371 < arg1.anInt861; local371++) {
			local477 = this.anIntArray418[local371];
			this.anIntArray418[local371] = local232;
			local435[local371] = new Class130();
			local232 += local477;
		}
		this.anIntArray418[arg1.anInt861] = local232;
		@Pc(715) int[] local715 = null;
		@Pc(717) int[] local717 = null;
		@Pc(719) int[] local719 = null;
		@Pc(721) float[][] local721 = null;
		@Pc(747) int local747;
		@Pc(791) int local791;
		@Pc(797) int local797;
		@Pc(810) int local810;
		@Pc(812) int local812;
		@Pc(845) int local845;
		@Pc(850) int local850;
		@Pc(1014) float local1014;
		@Pc(1008) float local1008;
		@Pc(1012) float local1012;
		if (arg1.aByteArray28 != null) {
			@Pc(727) int local727 = arg1.anInt850;
			@Pc(730) int[] local730 = new int[local727];
			@Pc(733) int[] local733 = new int[local727];
			@Pc(736) int[] local736 = new int[local727];
			@Pc(739) int[] local739 = new int[local727];
			@Pc(742) int[] local742 = new int[local727];
			@Pc(745) int[] local745 = new int[local727];
			for (local747 = 0; local747 < local727; local747++) {
				local730[local747] = Integer.MAX_VALUE;
				local733[local747] = -2147483647;
				local736[local747] = Integer.MAX_VALUE;
				local739[local747] = -2147483647;
				local742[local747] = Integer.MAX_VALUE;
				local745[local747] = -2147483647;
			}
			local717 = new int[local727];
			local719 = new int[local727];
			local721 = new float[local727][];
			local715 = new int[local727];
			for (local791 = 0; local791 < this.anInt4239; local791++) {
				local797 = local106[local791];
				if (arg1.aByteArray28[local797] != -1) {
					local810 = arg1.aByteArray28[local797] & 0xFF;
					for (local812 = 0; local812 < 3; local812++) {
						@Pc(821) short local821;
						if (local812 == 0) {
							local821 = arg1.aShortArray33[local797];
						} else if (local812 == 1) {
							local821 = arg1.aShortArray27[local797];
						} else {
							local821 = arg1.aShortArray28[local797];
						}
						local845 = arg1.anIntArray65[local821];
						local850 = arg1.anIntArray71[local821];
						@Pc(855) int local855 = arg1.anIntArray72[local821];
						if (local845 < local730[local810]) {
							local730[local810] = local845;
						}
						if (local845 > local733[local810]) {
							local733[local810] = local845;
						}
						if (local736[local810] > local850) {
							local736[local810] = local850;
						}
						if (local850 > local739[local810]) {
							local739[local810] = local850;
						}
						if (local855 < local742[local810]) {
							local742[local810] = local855;
						}
						if (local745[local810] < local855) {
							local745[local810] = local855;
						}
					}
				}
			}
			for (local797 = 0; local797 < local727; local797++) {
				@Pc(949) byte local949 = arg1.aByteArray27[local797];
				if (local949 > 0) {
					local715[local797] = (local733[local797] + local730[local797]) / 2;
					local717[local797] = (local739[local797] + local736[local797]) / 2;
					local719[local797] = (local745[local797] + local742[local797]) / 2;
					if (local949 == 1) {
						local850 = arg1.anIntArray64[local797];
						local1008 = 64.0F / (float) arg1.anIntArray70[local797];
						if (local850 == 0) {
							local1012 = 1.0F;
							local1014 = 1.0F;
						} else if (local850 <= 0) {
							local1012 = 1.0F;
							local1014 = (float) -local850 / 1024.0F;
						} else {
							local1014 = 1.0F;
							local1012 = (float) local850 / 1024.0F;
						}
					} else if (local949 == 2) {
						local1014 = 64.0F / (float) arg1.anIntArray64[local797];
						local1008 = 64.0F / (float) arg1.anIntArray70[local797];
						local1012 = 64.0F / (float) arg1.anIntArray73[local797];
					} else {
						local1012 = (float) arg1.anIntArray73[local797] / 1024.0F;
						local1014 = (float) arg1.anIntArray64[local797] / 1024.0F;
						local1008 = (float) arg1.anIntArray70[local797] / 1024.0F;
					}
					local721[local797] = Static311.method4817(arg1.aShortArray29[local797], arg1.aByteArray29[local797] & 0xFF, local1012, local1008, arg1.aShortArray32[local797], arg1.aShortArray34[local797], local1014);
				}
			}
		}
		@Pc(1131) Class134[] local1131 = new Class134[arg1.anInt856];
		@Pc(1150) short local1150;
		@Pc(1161) int local1161;
		@Pc(1171) int local1171;
		@Pc(1233) int local1233;
		for (@Pc(1133) int local1133 = 0; local1133 < arg1.anInt856; local1133++) {
			@Pc(1140) short local1140 = arg1.aShortArray33[local1133];
			@Pc(1145) short local1145 = arg1.aShortArray27[local1133];
			local1150 = arg1.aShortArray28[local1133];
			local1161 = this.anIntArray417[local1145] - this.anIntArray417[local1140];
			local1171 = this.anIntArray415[local1145] - this.anIntArray415[local1140];
			local747 = this.anIntArray416[local1145] - this.anIntArray416[local1140];
			local791 = this.anIntArray417[local1150] - this.anIntArray417[local1140];
			local797 = this.anIntArray415[local1150] - this.anIntArray415[local1140];
			local810 = this.anIntArray416[local1150] - this.anIntArray416[local1140];
			local812 = local810 * local1171 - local747 * local797;
			local1233 = local791 * local747 - local810 * local1161;
			for (local845 = local797 * local1161 - local1171 * local791; local812 > 8192 || local1233 > 8192 || local845 > 8192 || local812 < -8192 || local1233 < -8192 || local845 < -8192; local845 >>= 0x1) {
				local1233 >>= 0x1;
				local812 >>= 0x1;
			}
			local850 = (int) Math.sqrt((double) (local812 * local812 + local1233 * local1233 + local845 * local845));
			if (local850 <= 0) {
				local850 = 1;
			}
			local1233 = local1233 * 256 / local850;
			local845 = local845 * 256 / local850;
			local812 = local812 * 256 / local850;
			@Pc(1330) byte local1330 = arg1.aByteArray25 == null ? 0 : arg1.aByteArray25[local1133];
			if (local1330 == 0) {
				@Pc(1336) Class130 local1336 = local435[local1140];
				local1336.anInt3705++;
				local1336.anInt3702 += local845;
				local1336.anInt3708 += local1233;
				local1336.anInt3707 += local812;
				@Pc(1364) Class130 local1364 = local435[local1145];
				local1364.anInt3708 += local1233;
				local1364.anInt3705++;
				local1364.anInt3707 += local812;
				local1364.anInt3702 += local845;
				@Pc(1392) Class130 local1392 = local435[local1150];
				local1392.anInt3702 += local845;
				local1392.anInt3708 += local1233;
				local1392.anInt3705++;
				local1392.anInt3707 += local812;
			} else if (local1330 == 1) {
				@Pc(1429) Class134 local1429 = local1131[local1133] = new Class134();
				local1429.anInt3781 = local1233;
				local1429.anInt3779 = local812;
				local1429.anInt3782 = local845;
			}
		}
		@Pc(1451) int local1451;
		for (@Pc(1445) int local1445 = 0; local1445 < this.anInt4239; local1445++) {
			local1451 = local106[local1445];
			@Pc(1458) int local1458 = arg1.aShortArray30[local1451] & 0xFFFF;
			@Pc(1466) short local1466;
			if (arg1.aShortArray35 == null) {
				local1466 = -1;
			} else {
				local1466 = arg1.aShortArray35[local1451];
			}
			if (arg1.aByteArray28 == null) {
				local1171 = -1;
			} else {
				local1171 = arg1.aByteArray28[local1451];
			}
			if (arg1.aByteArray30 == null) {
				local747 = 0;
			} else {
				local747 = arg1.aByteArray30[local1451] & 0xFF;
			}
			@Pc(1498) float local1498 = 0.0F;
			@Pc(1500) float local1500 = 0.0F;
			@Pc(1502) float local1502 = 0.0F;
			local1014 = 0.0F;
			local1008 = 0.0F;
			local1012 = 0.0F;
			@Pc(1510) byte local1510 = 0;
			@Pc(1512) byte local1512 = 0;
			@Pc(1514) int local1514 = 0;
			@Pc(1547) byte local1547;
			@Pc(1567) short local1567;
			@Pc(1572) short local1572;
			@Pc(1577) short local1577;
			if (local1466 != -1) {
				if (local1171 == -1) {
					local1012 = 0.0F;
					local1512 = 2;
					local1500 = 1.0F;
					local1014 = 1.0F;
					local1502 = 1.0F;
					local1008 = 0.0F;
					local1498 = 0.0F;
					local1510 = 1;
				} else {
					local1171 &= 0xFF;
					local1547 = arg1.aByteArray27[local1171];
					@Pc(1557) short local1557;
					@Pc(1562) short local1562;
					@Pc(1600) float local1600;
					@Pc(1609) float local1609;
					@Pc(1618) float local1618;
					@Pc(1703) float local1703;
					@Pc(1711) float local1711;
					@Pc(1720) float local1720;
					@Pc(1729) float local1729;
					@Pc(1737) float local1737;
					@Pc(1746) float local1746;
					if (local1547 == 0) {
						local1557 = arg1.aShortArray33[local1451];
						local1562 = arg1.aShortArray27[local1451];
						local1567 = arg1.aShortArray28[local1451];
						local1572 = arg1.aShortArray32[local1171];
						local1577 = arg1.aShortArray29[local1171];
						@Pc(1582) short local1582 = arg1.aShortArray34[local1171];
						@Pc(1588) float local1588 = (float) arg1.anIntArray65[local1572];
						@Pc(1594) float local1594 = (float) arg1.anIntArray71[local1572];
						local1600 = arg1.anIntArray72[local1572];
						local1609 = (float) arg1.anIntArray65[local1577] - local1588;
						local1618 = (float) arg1.anIntArray71[local1577] - local1594;
						@Pc(1626) float local1626 = (float) arg1.anIntArray72[local1577] - local1600;
						@Pc(1635) float local1635 = (float) arg1.anIntArray65[local1582] - local1588;
						@Pc(1644) float local1644 = (float) arg1.anIntArray71[local1582] - local1594;
						@Pc(1652) float local1652 = (float) arg1.anIntArray72[local1582] - local1600;
						@Pc(1661) float local1661 = (float) arg1.anIntArray65[local1557] - local1588;
						@Pc(1669) float local1669 = (float) arg1.anIntArray71[local1557] - local1594;
						@Pc(1677) float local1677 = (float) arg1.anIntArray72[local1557] - local1600;
						@Pc(1685) float local1685 = (float) arg1.anIntArray65[local1562] - local1588;
						@Pc(1694) float local1694 = (float) arg1.anIntArray71[local1562] - local1594;
						local1703 = (float) arg1.anIntArray72[local1562] - local1600;
						local1711 = (float) arg1.anIntArray65[local1567] - local1588;
						local1720 = (float) arg1.anIntArray71[local1567] - local1594;
						local1729 = (float) arg1.anIntArray72[local1567] - local1600;
						local1737 = local1618 * local1652 - local1644 * local1626;
						local1746 = local1626 * local1635 - local1652 * local1609;
						@Pc(1754) float local1754 = local1644 * local1609 - local1618 * local1635;
						@Pc(1763) float local1763 = local1754 * local1644 - local1652 * local1746;
						@Pc(1772) float local1772 = local1652 * local1737 - local1635 * local1754;
						@Pc(1781) float local1781 = local1746 * local1635 - local1644 * local1737;
						@Pc(1795) float local1795 = 1.0F / (local1781 * local1626 + local1772 * local1618 + local1763 * local1609);
						local1008 = local1795 * (local1711 * local1763 + local1720 * local1772 + local1781 * local1729);
						local1502 = local1795 * (local1694 * local1772 + local1685 * local1763 + local1781 * local1703);
						local1498 = local1795 * (local1763 * local1661 + local1772 * local1669 + local1677 * local1781);
						@Pc(1846) float local1846 = local1737 * local1626 - local1609 * local1754;
						@Pc(1855) float local1855 = local1746 * local1609 - local1618 * local1737;
						@Pc(1864) float local1864 = local1754 * local1618 - local1626 * local1746;
						@Pc(1878) float local1878 = 1.0F / (local1635 * local1864 + local1644 * local1846 + local1855 * local1652);
						local1500 = local1878 * (local1846 * local1669 + local1661 * local1864 + local1855 * local1677);
						local1012 = (local1864 * local1711 + local1846 * local1720 + local1729 * local1855) * local1878;
						local1014 = local1878 * (local1855 * local1703 + local1846 * local1694 + local1864 * local1685);
					} else {
						local1557 = arg1.aShortArray33[local1451];
						local1562 = arg1.aShortArray27[local1451];
						local1567 = arg1.aShortArray28[local1451];
						@Pc(1941) int local1941 = local715[local1171];
						@Pc(1945) int local1945 = local717[local1171];
						@Pc(1949) int local1949 = local719[local1171];
						@Pc(1953) float[] local1953 = local721[local1171];
						@Pc(1958) byte local1958 = arg1.aByteArray26[local1171];
						local1600 = (float) arg1.anIntArray67[local1171] / 256.0F;
						if (local1547 == 1) {
							local1609 = (float) arg1.anIntArray73[local1171] / 1024.0F;
							Static390.method6255(local1958, arg1.anIntArray72[local1557], local1953, local1600, local1609, arg1.anIntArray71[local1557], arg1.anIntArray65[local1557], local1941, local1945, local1949);
							local1498 = Static301.aFloat103;
							local1500 = Static235.aFloat75;
							Static390.method6255(local1958, arg1.anIntArray72[local1562], local1953, local1600, local1609, arg1.anIntArray71[local1562], arg1.anIntArray65[local1562], local1941, local1945, local1949);
							local1014 = Static235.aFloat75;
							local1502 = Static301.aFloat103;
							Static390.method6255(local1958, arg1.anIntArray72[local1567], local1953, local1600, local1609, arg1.anIntArray71[local1567], arg1.anIntArray65[local1567], local1941, local1945, local1949);
							local1012 = Static235.aFloat75;
							local1008 = Static301.aFloat103;
							local1618 = local1609 / 2.0F;
							if ((local1958 & 0x1) == 0) {
								if (local1502 - local1498 > local1618) {
									local1502 -= local1609;
									local1510 = 1;
								} else if (local1498 - local1502 > local1618) {
									local1502 += local1609;
									local1510 = 2;
								}
								if (local1618 < local1008 - local1498) {
									local1512 = 1;
									local1008 -= local1609;
								} else if (local1618 < local1498 - local1008) {
									local1008 += local1609;
									local1512 = 2;
								}
							} else {
								if (local1618 < local1012 - local1500) {
									local1512 = 1;
									local1012 -= local1609;
								} else if (local1618 < local1500 - local1012) {
									local1512 = 2;
									local1012 += local1609;
								}
								if (local1014 - local1500 > local1618) {
									local1014 -= local1609;
									local1510 = 1;
								} else if (local1618 < local1500 - local1014) {
									local1014 += local1609;
									local1510 = 2;
								}
							}
						} else if (local1547 == 2) {
							local1609 = (float) arg1.anIntArray69[local1171] / 256.0F;
							local1618 = (float) arg1.anIntArray74[local1171] / 256.0F;
							@Pc(2207) int local2207 = arg1.anIntArray65[local1562] - arg1.anIntArray65[local1557];
							@Pc(2218) int local2218 = arg1.anIntArray71[local1562] - arg1.anIntArray71[local1557];
							@Pc(2229) int local2229 = arg1.anIntArray72[local1562] - arg1.anIntArray72[local1557];
							@Pc(2239) int local2239 = arg1.anIntArray65[local1567] - arg1.anIntArray65[local1557];
							@Pc(2250) int local2250 = arg1.anIntArray71[local1567] - arg1.anIntArray71[local1557];
							@Pc(2261) int local2261 = arg1.anIntArray72[local1567] - arg1.anIntArray72[local1557];
							@Pc(2270) int local2270 = local2261 * local2218 - local2229 * local2250;
							@Pc(2279) int local2279 = local2239 * local2229 - local2261 * local2207;
							@Pc(2288) int local2288 = local2250 * local2207 - local2218 * local2239;
							local1703 = 64.0F / (float) arg1.anIntArray64[local1171];
							local1711 = 64.0F / (float) arg1.anIntArray70[local1171];
							local1720 = 64.0F / (float) arg1.anIntArray73[local1171];
							local1729 = (local1953[2] * (float) local2288 + local1953[1] * (float) local2279 + local1953[0] * (float) local2270) / local1703;
							local1737 = ((float) local2288 * local1953[5] + (float) local2270 * local1953[3] + (float) local2279 * local1953[4]) / local1711;
							local1746 = (local1953[8] * (float) local2288 + local1953[7] * (float) local2279 + local1953[6] * (float) local2270) / local1720;
							local1514 = Static454.method6940(local1746, local1737, local1729);
							Static447.method6829(local1953, local1945, arg1.anIntArray71[local1557], arg1.anIntArray65[local1557], local1514, local1941, local1609, local1618, local1949, arg1.anIntArray72[local1557], local1958, local1600);
							local1500 = Static275.aFloat215;
							local1498 = Static362.aFloat177;
							Static447.method6829(local1953, local1945, arg1.anIntArray71[local1562], arg1.anIntArray65[local1562], local1514, local1941, local1609, local1618, local1949, arg1.anIntArray72[local1562], local1958, local1600);
							local1502 = Static362.aFloat177;
							local1014 = Static275.aFloat215;
							Static447.method6829(local1953, local1945, arg1.anIntArray71[local1567], arg1.anIntArray65[local1567], local1514, local1941, local1609, local1618, local1949, arg1.anIntArray72[local1567], local1958, local1600);
							local1008 = Static362.aFloat177;
							local1012 = Static275.aFloat215;
						} else if (local1547 == 3) {
							Static91.method1700(local1949, local1958, local1945, arg1.anIntArray71[local1557], local1953, local1941, local1600, arg1.anIntArray65[local1557], arg1.anIntArray72[local1557]);
							local1500 = Static275.aFloat214;
							local1498 = Static431.aFloat209;
							Static91.method1700(local1949, local1958, local1945, arg1.anIntArray71[local1562], local1953, local1941, local1600, arg1.anIntArray65[local1562], arg1.anIntArray72[local1562]);
							local1502 = Static431.aFloat209;
							local1014 = Static275.aFloat214;
							Static91.method1700(local1949, local1958, local1945, arg1.anIntArray71[local1567], local1953, local1941, local1600, arg1.anIntArray65[local1567], arg1.anIntArray72[local1567]);
							local1012 = Static275.aFloat214;
							local1008 = Static431.aFloat209;
							if ((local1958 & 0x1) == 0) {
								if (local1502 - local1498 > 0.5F) {
									local1510 = 1;
									local1502--;
								} else if (local1498 - local1502 > 0.5F) {
									local1510 = 2;
									local1502++;
								}
								if (local1008 - local1498 > 0.5F) {
									local1512 = 1;
									local1008--;
								} else if (local1498 - local1008 > 0.5F) {
									local1512 = 2;
									local1008++;
								}
							} else {
								if (local1014 - local1500 > 0.5F) {
									local1014--;
									local1510 = 1;
								} else if (local1500 - local1014 > 0.5F) {
									local1510 = 2;
									local1014++;
								}
								if (local1012 - local1500 > 0.5F) {
									local1012--;
									local1512 = 1;
								} else if (local1500 - local1012 > 0.5F) {
									local1512 = 2;
									local1012++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray25 == null) {
				local1547 = 0;
			} else {
				local1547 = arg1.aByteArray25[local1451];
			}
			if (local1547 == 0) {
				@Pc(2828) long local2828 = (long) (local1171 << 2) + ((long) (local1514 << 24) + (long) (local1458 << 8) + (long) local747 << 32);
				local1567 = arg1.aShortArray33[local1451];
				local1572 = arg1.aShortArray27[local1451];
				local1577 = arg1.aShortArray28[local1451];
				@Pc(2847) Class130 local2847 = local435[local1567];
				this.aShortArray82[local1445] = this.method3695(local1498, local2847.anInt3707, local2847.anInt3705, arg1, local2828, local2847.anInt3702, local2847.anInt3708, local1500, local1567);
				@Pc(2871) Class130 local2871 = local435[local1572];
				this.aShortArray77[local1445] = this.method3695(local1502, local2871.anInt3707, local2871.anInt3705, arg1, local2828 + (long) local1510, local2871.anInt3702, local2871.anInt3708, local1014, local1572);
				@Pc(2898) Class130 local2898 = local435[local1577];
				this.aShortArray73[local1445] = this.method3695(local1008, local2898.anInt3707, local2898.anInt3705, arg1, (long) local1512 + local2828, local2898.anInt3702, local2898.anInt3708, local1012, local1577);
			} else if (local1547 == 1) {
				@Pc(2688) Class134 local2688 = local1131[local1451];
				@Pc(2734) long local2734 = ((long) local747 + (long) (local1514 << 24) + (long) (local1458 << 8) << 32) + (long) ((local2688.anInt3782 + 256 << 22) + (local2688.anInt3781 + 256 << 12) + ((local1171 << 2) - -(local2688.anInt3779 <= 0 ? 2048 : 1024)));
				this.aShortArray82[local1445] = this.method3695(local1498, local2688.anInt3779, 0, arg1, local2734, local2688.anInt3782, local2688.anInt3781, local1500, arg1.aShortArray33[local1451]);
				this.aShortArray77[local1445] = this.method3695(local1502, local2688.anInt3779, 0, arg1, local2734 + (long) local1510, local2688.anInt3782, local2688.anInt3781, local1014, arg1.aShortArray27[local1451]);
				this.aShortArray73[local1445] = this.method3695(local1008, local2688.anInt3779, 0, arg1, local2734 + (long) local1512, local2688.anInt3782, local2688.anInt3781, local1012, arg1.aShortArray28[local1451]);
			}
			if (arg1.aShortArray35 == null) {
				this.aShortArray76[local1445] = -1;
			} else {
				this.aShortArray76[local1445] = arg1.aShortArray35[local1451];
			}
			if (arg1.aByteArray30 != null) {
				this.aByteArray78[local1445] = arg1.aByteArray30[local1451];
			}
			if (arg1.aShortArray31 != null) {
				this.aShortArray72[local1445] = arg1.aShortArray31[local1451];
			}
			this.aShortArray74[local1445] = arg1.aShortArray30[local1451];
		}
		local1451 = 0;
		local1150 = -10000;
		for (local1161 = 0; local1161 < this.anInt4246; local1161++) {
			@Pc(2991) short local2991 = this.aShortArray76[local1161];
			if (local1150 != local2991) {
				local1150 = local2991;
				local1451++;
			}
		}
		this.anIntArray414 = new int[local1451 + 1];
		local1150 = -10000;
		local1451 = 0;
		for (local1171 = 0; local1171 < this.anInt4246; local1171++) {
			@Pc(3025) short local3025 = this.aShortArray76[local1171];
			if (local1150 != local3025) {
				local1150 = local3025;
				this.anIntArray414[local1451++] = local1171;
			}
		}
		this.anIntArray414[local1451] = this.anInt4246;
		Static211.aLongArray12 = null;
		this.aShortArray75 = Static237.method3661(this.anInt4221, this.aShortArray75);
		this.aShortArray80 = Static237.method3661(this.anInt4221, this.aShortArray80);
		this.aShortArray79 = Static237.method3661(this.anInt4221, this.aShortArray79);
		this.aByteArray77 = Static363.method1121(this.anInt4221, this.aByteArray77);
		this.aFloatArray22 = Static182.method3003(this.anInt4221, this.aFloatArray22);
		this.aFloatArray23 = Static182.method3003(this.anInt4221, this.aFloatArray23);
		if (arg1.anIntArray68 != null && Static325.method4709(this.anInt4238, arg2)) {
			this.anIntArrayArray48 = arg1.method873(false);
		}
		if (arg1.aClass120Array1 != null && Static54.method978(arg2, this.anInt4238)) {
			this.anIntArrayArray49 = arg1.method861();
		}
		if (arg1.anIntArray66 != null && Static458.method6978(this.anInt4238, arg2)) {
			local747 = 0;
			@Pc(3144) int[] local3144 = new int[256];
			for (local797 = 0; local797 < this.anInt4239; local797++) {
				local810 = arg1.anIntArray66[local106[local797]];
				if (local810 >= 0) {
					if (local747 < local810) {
						local747 = local810;
					}
					@Pc(3170) int local3170 = local3144[local810]++;
				}
			}
			this.anIntArrayArray50 = new int[local747 + 1][];
			for (local810 = 0; local810 <= local747; local810++) {
				this.anIntArrayArray50[local810] = new int[local3144[local810]];
				local3144[local810] = 0;
			}
			for (local812 = 0; local812 < this.anInt4239; local812++) {
				local1233 = arg1.anIntArray66[local106[local812]];
				if (local1233 >= 0) {
					this.anIntArrayArray50[local1233][local3144[local1233]++] = local812;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean323) {
			this.method3686();
		}
		return this.aShort82;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZB)V")
	private void method3685(@OriginalArg(0) boolean arg0) {
		if (this.anInt4246 * 6 > this.aClass39_Sub3_20.aClass2_Sub29_Sub1_2.aByteArray96.length) {
			this.aClass39_Sub3_20.aClass2_Sub29_Sub1_2 = new Class2_Sub29_Sub1(this.anInt4246 * 6 + 600);
		} else {
			this.aClass39_Sub3_20.aClass2_Sub29_Sub1_2.anInt6132 = 0;
		}
		@Pc(38) Class2_Sub29_Sub1 local38 = this.aClass39_Sub3_20.aClass2_Sub29_Sub1_2;
		@Pc(44) int local44;
		if (this.aClass39_Sub3_20.aBoolean485) {
			for (local44 = 0; local44 < this.anInt4246; local44++) {
				local38.method5217(this.aShortArray82[local44]);
				local38.method5217(this.aShortArray77[local44]);
				local38.method5217(this.aShortArray73[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt4246; local44++) {
				local38.method5199(this.aShortArray82[local44]);
				local38.method5199(this.aShortArray77[local44]);
				local38.method5199(this.aShortArray73[local44]);
			}
		}
		if (local38.anInt6132 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface5_2 == null) {
				this.anInterface5_2 = this.aClass39_Sub3_20.method5733(local38.anInt6132, local38.aByteArray96, true);
			} else {
				this.anInterface5_2.method6824(local38.anInt6132, local38.aByteArray96);
			}
			this.aClass267_1.anInterface5_5 = this.anInterface5_2;
		} else {
			this.aClass267_1.anInterface5_5 = this.aClass39_Sub3_20.method5733(local38.anInt6132, local38.aByteArray96, false);
		}
		if (!arg0) {
			this.aBoolean324 = true;
		}
	}

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "(IIII)V")
	@Override
	protected void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static284.anInt9393 = 0;
			local11 = 0;
			Static310.anInt5645 = 0;
			Static224.anInt4040 = 0;
			for (local17 = 0; local17 < this.anInt4225; local17++) {
				Static310.anInt5645 += this.anIntArray417[local17];
				Static224.anInt4040 += this.anIntArray415[local17];
				local11++;
				Static284.anInt9393 += this.anIntArray416[local17];
			}
			if (local11 <= 0) {
				Static310.anInt5645 = arg1;
				Static284.anInt9393 = arg3;
				Static224.anInt4040 = arg2;
			} else {
				Static284.anInt9393 = arg3 + Static284.anInt9393 / local11;
				Static310.anInt5645 = arg1 + Static310.anInt5645 / local11;
				Static224.anInt4040 = arg2 + Static224.anInt4040 / local11;
			}
		} else if (arg0 == 1) {
			for (local11 = 0; local11 < this.anInt4225; local11++) {
				this.anIntArray417[local11] += arg1;
				this.anIntArray415[local11] += arg2;
				this.anIntArray416[local11] += arg3;
			}
		} else {
			@Pc(157) int local157;
			@Pc(175) int local175;
			if (arg0 == 2) {
				for (local11 = 0; local11 < this.anInt4225; local11++) {
					this.anIntArray417[local11] -= Static310.anInt5645;
					this.anIntArray415[local11] -= Static224.anInt4040;
					this.anIntArray416[local11] -= Static284.anInt9393;
					if (arg3 != 0) {
						local17 = Class125.anIntArray381[arg3];
						local157 = Class125.anIntArray382[arg3];
						local175 = local157 * this.anIntArray417[local11] + this.anIntArray415[local11] * local17 + 32767 >> 15;
						this.anIntArray415[local11] = local157 * this.anIntArray415[local11] + 32767 - local17 * this.anIntArray417[local11] >> 15;
						this.anIntArray417[local11] = local175;
					}
					if (arg1 != 0) {
						local17 = Class125.anIntArray381[arg1];
						local157 = Class125.anIntArray382[arg1];
						local175 = this.anIntArray415[local11] * local157 + 32767 - this.anIntArray416[local11] * local17 >> 15;
						this.anIntArray416[local11] = this.anIntArray415[local11] * local17 + local157 * this.anIntArray416[local11] + 32767 >> 15;
						this.anIntArray415[local11] = local175;
					}
					if (arg2 != 0) {
						local17 = Class125.anIntArray381[arg2];
						local157 = Class125.anIntArray382[arg2];
						local175 = this.anIntArray417[local11] * local157 + local17 * this.anIntArray416[local11] + 32767 >> 15;
						this.anIntArray416[local11] = this.anIntArray416[local11] * local157 + 32767 - this.anIntArray417[local11] * local17 >> 15;
						this.anIntArray417[local11] = local175;
					}
					this.anIntArray417[local11] += Static310.anInt5645;
					this.anIntArray415[local11] += Static224.anInt4040;
					this.anIntArray416[local11] += Static284.anInt9393;
				}
			} else if (arg0 == 3) {
				for (local11 = 0; local11 < this.anInt4225; local11++) {
					this.anIntArray417[local11] -= Static310.anInt5645;
					this.anIntArray415[local11] -= Static224.anInt4040;
					this.anIntArray416[local11] -= Static284.anInt9393;
					this.anIntArray417[local11] = this.anIntArray417[local11] * arg1 / 128;
					this.anIntArray415[local11] = arg2 * this.anIntArray415[local11] / 128;
					this.anIntArray416[local11] = this.anIntArray416[local11] * arg3 / 128;
					this.anIntArray417[local11] += Static310.anInt5645;
					this.anIntArray415[local11] += Static224.anInt4040;
					this.anIntArray416[local11] += Static284.anInt9393;
				}
			} else {
				@Pc(516) Class126 local516;
				@Pc(521) Class159 local521;
				if (arg0 == 5) {
					for (local11 = 0; local11 < this.anInt4239; local11++) {
						local17 = arg1 * 8 + (this.aByteArray78[local11] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray78[local11] = (byte) local17;
					}
					if (this.aClass11_5 != null) {
						this.aClass11_5.anInterface10_1 = null;
					}
					if (this.aClass126Array1 != null) {
						for (local17 = 0; local17 < this.anInt4275; local17++) {
							local516 = this.aClass126Array1[local17];
							local521 = this.aClass159Array1[local17];
							local521.anInt4335 = 255 - (this.aByteArray78[local516.anInt3552] & 0xFF) << 24 | local521.anInt4335 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local11 = 0; local11 < this.anInt4239; local11++) {
						local17 = this.aShortArray74[local11] & 0xFFFF;
						local157 = local17 >> 10 & 0x3F;
						local175 = local17 >> 7 & 0x7;
						@Pc(580) int local580 = local17 & 0x7F;
						local175 += arg2 / 4;
						@Pc(593) int local593 = local157 + arg1 & 0x3F;
						if (local175 < 0) {
							local175 = 0;
						} else if (local175 > 7) {
							local175 = 7;
						}
						local580 += arg3;
						if (local580 < 0) {
							local580 = 0;
						} else if (local580 > 127) {
							local580 = 127;
						}
						this.aShortArray74[local11] = (short) (local593 << 10 | local175 << 7 | local580);
					}
					if (this.aClass11_5 != null) {
						this.aClass11_5.anInterface10_1 = null;
					}
					if (this.aClass126Array1 != null) {
						for (local17 = 0; local17 < this.anInt4275; local17++) {
							local516 = this.aClass126Array1[local17];
							local521 = this.aClass159Array1[local17];
							local521.anInt4335 = Static445.anIntArray614[this.aShortArray74[local516.anInt3552] & 0xFFFF] & 0xFFFFFF | local521.anInt4335 & 0xFF000000;
						}
					}
				} else {
					@Pc(710) Class159 local710;
					if (arg0 == 8) {
						for (local11 = 0; local11 < this.anInt4275; local11++) {
							local710 = this.aClass159Array1[local11];
							local710.anInt4337 += arg2;
							local710.anInt4331 += arg1;
						}
					} else if (arg0 == 10) {
						for (local11 = 0; local11 < this.anInt4275; local11++) {
							local710 = this.aClass159Array1[local11];
							local710.anInt4338 = arg2 * local710.anInt4338 >> 7;
							local710.anInt4333 = arg1 * local710.anInt4333 >> 7;
						}
					} else if (arg0 == 9) {
						for (local11 = 0; local11 < this.anInt4275; local11++) {
							local710 = this.aClass159Array1[local11];
							local710.anInt4334 = local710.anInt4334 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		if (!this.aBoolean323) {
			this.method3686();
		}
		return this.aShort87;
	}

	@OriginalMember(owner = "client!jv", name = "L", descriptor = "(SS)V")
	@Override
	public void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface12 local9 = this.aClass39_Sub3_20.anInterface12_15;
		for (@Pc(11) int local11 = 0; local11 < this.anInt4239; local11++) {
			if (this.aShortArray76[local11] == arg0) {
				this.aShortArray76[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class204 local48 = local9.method2573(arg0 & 0xFFFF);
			local35 = local48.aByte83;
			local37 = local48.aByte82;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(68) Class204 local68 = local9.method2573(arg1 & 0xFFFF);
			local58 = local68.aByte82;
			local56 = local68.aByte83;
		}
		if (!(local56 != local35 | local37 != local58)) {
			return;
		}
		if (this.aClass126Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt4275; local97++) {
				@Pc(104) Class126 local104 = this.aClass126Array1[local97];
				@Pc(109) Class159 local109 = this.aClass159Array1[local97];
				local109.anInt4335 = local109.anInt4335 & 0xFF000000 | Static445.anIntArray614[this.aShortArray74[local104.anInt3552] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass11_5 != null) {
			this.aClass11_5.anInterface10_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "(I)V")
	@Override
	public void m(@OriginalArg(0) int arg0) {
		this.anInt4229 = arg0;
		this.aBoolean324 = true;
		if (this.aClass280_1 != null && (this.anInt4229 & 0x10000) == 0) {
			this.aByteArray77 = this.aClass280_1.aByteArray110;
			this.aShortArray75 = this.aClass280_1.aShortArray108;
			this.aShortArray80 = this.aClass280_1.aShortArray109;
			this.aShortArray79 = this.aClass280_1.aShortArray107;
			this.aClass280_1 = null;
		}
		this.method3693();
	}

	@OriginalMember(owner = "client!jv", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	@Override
	public Class2_Sub13_Sub6 EA(@OriginalArg(0) Class2_Sub13_Sub6 arg0) {
		if (this.anInt4221 == 0) {
			return null;
		}
		if (!this.aBoolean323) {
			this.method3686();
		}
		@Pc(40) int local40;
		@Pc(56) int local56;
		if (this.aClass39_Sub3_20.anInt6742 > 0) {
			local40 = this.aShort83 - (this.aClass39_Sub3_20.anInt6742 * this.aShort85 >> 8) >> this.aClass39_Sub3_20.anInt6716;
			local56 = this.lb - (this.aShort87 * this.aClass39_Sub3_20.anInt6742 >> 8) >> this.aClass39_Sub3_20.anInt6716;
		} else {
			local40 = this.aShort83 - (this.aShort87 * this.aClass39_Sub3_20.anInt6742 >> 8) >> this.aClass39_Sub3_20.anInt6716;
			local56 = this.lb - (this.aClass39_Sub3_20.anInt6742 * this.aShort85 >> 8) >> this.aClass39_Sub3_20.anInt6716;
		}
		@Pc(112) int local112;
		@Pc(129) int local129;
		if (this.aClass39_Sub3_20.anInt6758 > 0) {
			local112 = this.aShort86 - (this.aClass39_Sub3_20.anInt6758 * this.aShort85 >> 8) >> this.aClass39_Sub3_20.anInt6716;
			local129 = this.aShort82 - (this.aClass39_Sub3_20.anInt6758 * this.aShort87 >> 8) >> this.aClass39_Sub3_20.anInt6716;
		} else {
			local112 = this.aShort86 - (this.aShort87 * this.aClass39_Sub3_20.anInt6758 >> 8) >> this.aClass39_Sub3_20.anInt6716;
			local129 = this.aShort82 - (this.aClass39_Sub3_20.anInt6758 * this.aShort85 >> 8) >> this.aClass39_Sub3_20.anInt6716;
		}
		@Pc(172) int local172 = local56 + 1 - local40;
		@Pc(179) int local179 = local129 + 1 - local112;
		@Pc(182) Class2_Sub13_Sub6_Sub1 local182 = (Class2_Sub13_Sub6_Sub1) arg0;
		@Pc(192) Class2_Sub13_Sub6_Sub1 local192;
		if (local182 != null && local182.method3166(local179, local172)) {
			local192 = local182;
			local182.method3164();
		} else {
			local192 = new Class2_Sub13_Sub6_Sub1(this.aClass39_Sub3_20, local172, local179);
		}
		local192.method3167(local112, local129, local40, local56);
		this.method3689(local192);
		return local192;
	}

	@OriginalMember(owner = "client!jv", name = "va", descriptor = "()I")
	@Override
	public int va() {
		if (!this.aBoolean323) {
			this.method3686();
		}
		return this.lb;
	}

	@OriginalMember(owner = "client!jv", name = "ea", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg2 << 4;
			local25 = arg3 << 4;
			Static310.anInt5645 = 0;
			Static284.anInt9393 = 0;
			local31 = 0;
			Static224.anInt4040 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray48.length) {
					local55 = this.anIntArrayArray48[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static310.anInt5645 += this.anIntArray417[local63];
						Static224.anInt4040 += this.anIntArray415[local63];
						Static284.anInt9393 += this.anIntArray416[local63];
						local31++;
					}
				}
			}
			if (local31 > 0) {
				Static224.anInt4040 = Static224.anInt4040 / local31 + local25;
				Static284.anInt9393 = Static284.anInt9393 / local31 + local17;
				Static310.anInt5645 = Static310.anInt5645 / local31 + local21;
			} else {
				Static310.anInt5645 = local21;
				Static224.anInt4040 = local25;
				Static284.anInt9393 = local17;
			}
			return;
		}
		@Pc(163) int[] local163;
		@Pc(165) int local165;
		if (arg0 == 1) {
			local25 = arg3 << 4;
			local17 = arg4 << 4;
			local21 = arg2 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray48.length) {
					local163 = this.anIntArrayArray48[local35];
					for (local165 = 0; local165 < local163.length; local165++) {
						local57 = local163[local165];
						this.anIntArray417[local57] += local21;
						this.anIntArray415[local57] += local25;
						this.anIntArray416[local57] += local17;
					}
				}
			}
			return;
		}
		@Pc(275) int local275;
		@Pc(294) int local294;
		@Pc(755) int local755;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray48.length) {
					local163 = this.anIntArrayArray48[local35];
					if ((arg5 & 0x1) == 0) {
						for (local165 = 0; local165 < local163.length; local165++) {
							local57 = local163[local165];
							this.anIntArray417[local57] -= Static310.anInt5645;
							this.anIntArray415[local57] -= Static224.anInt4040;
							this.anIntArray416[local57] -= Static284.anInt9393;
							if (arg4 != 0) {
								local63 = Class125.anIntArray381[arg4];
								local275 = Class125.anIntArray382[arg4];
								local294 = local275 * this.anIntArray417[local57] + this.anIntArray415[local57] * local63 + 32767 >> 15;
								this.anIntArray415[local57] = this.anIntArray415[local57] * local275 + 32767 - local63 * this.anIntArray417[local57] >> 15;
								this.anIntArray417[local57] = local294;
							}
							if (arg2 != 0) {
								local63 = Class125.anIntArray381[arg2];
								local275 = Class125.anIntArray382[arg2];
								local294 = this.anIntArray415[local57] * local275 + 32767 - this.anIntArray416[local57] * local63 >> 15;
								this.anIntArray416[local57] = this.anIntArray416[local57] * local275 + this.anIntArray415[local57] * local63 + 32767 >> 15;
								this.anIntArray415[local57] = local294;
							}
							if (arg3 != 0) {
								local63 = Class125.anIntArray381[arg3];
								local275 = Class125.anIntArray382[arg3];
								local294 = local63 * this.anIntArray416[local57] + this.anIntArray417[local57] * local275 + 32767 >> 15;
								this.anIntArray416[local57] = local275 * this.anIntArray416[local57] + 32767 - this.anIntArray417[local57] * local63 >> 15;
								this.anIntArray417[local57] = local294;
							}
							this.anIntArray417[local57] += Static310.anInt5645;
							this.anIntArray415[local57] += Static224.anInt4040;
							this.anIntArray416[local57] += Static284.anInt9393;
						}
					} else {
						for (local165 = 0; local165 < local163.length; local165++) {
							local57 = local163[local165];
							this.anIntArray417[local57] -= Static310.anInt5645;
							this.anIntArray415[local57] -= Static224.anInt4040;
							this.anIntArray416[local57] -= Static284.anInt9393;
							if (arg2 != 0) {
								local63 = Class125.anIntArray381[arg2];
								local275 = Class125.anIntArray382[arg2];
								local294 = local275 * this.anIntArray415[local57] + 32767 - local63 * this.anIntArray416[local57] >> 15;
								this.anIntArray416[local57] = this.anIntArray415[local57] * local63 + this.anIntArray416[local57] * local275 + 32767 >> 15;
								this.anIntArray415[local57] = local294;
							}
							if (arg4 != 0) {
								local63 = Class125.anIntArray381[arg4];
								local275 = Class125.anIntArray382[arg4];
								local294 = this.anIntArray417[local57] * local275 + local63 * this.anIntArray415[local57] + 32767 >> 15;
								this.anIntArray415[local57] = local275 * this.anIntArray415[local57] + 32767 - this.anIntArray417[local57] * local63 >> 15;
								this.anIntArray417[local57] = local294;
							}
							if (arg3 != 0) {
								local63 = Class125.anIntArray381[arg3];
								local275 = Class125.anIntArray382[arg3];
								local294 = local275 * this.anIntArray417[local57] + local63 * this.anIntArray416[local57] + 32767 >> 15;
								this.anIntArray416[local57] = this.anIntArray416[local57] * local275 + 32767 - local63 * this.anIntArray417[local57] >> 15;
								this.anIntArray417[local57] = local294;
							}
							this.anIntArray417[local57] += Static310.anInt5645;
							this.anIntArray415[local57] += Static224.anInt4040;
							this.anIntArray416[local57] += Static284.anInt9393;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray48.length) {
						local55 = this.anIntArrayArray48[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local275 = this.anIntArray418[local63];
							local294 = this.anIntArray418[local63 + 1];
							for (local755 = local275; local755 < local294; local755++) {
								@Pc(764) int local764 = this.aShortArray78[local755] - 1;
								if (local764 == -1) {
									break;
								}
								@Pc(774) int local774;
								@Pc(778) int local778;
								@Pc(796) int local796;
								if (arg4 != 0) {
									local774 = Class125.anIntArray381[arg4];
									local778 = Class125.anIntArray382[arg4];
									local796 = local778 * this.aShortArray75[local764] + this.aShortArray80[local764] * local774 + 32767 >> 15;
									this.aShortArray80[local764] = (short) (local778 * this.aShortArray80[local764] + 32767 - this.aShortArray75[local764] * local774 >> 15);
									this.aShortArray75[local764] = (short) local796;
								}
								if (arg2 != 0) {
									local774 = Class125.anIntArray381[arg2];
									local778 = Class125.anIntArray382[arg2];
									local796 = local778 * this.aShortArray80[local764] + 32767 - this.aShortArray79[local764] * local774 >> 15;
									this.aShortArray79[local764] = (short) (local778 * this.aShortArray79[local764] + this.aShortArray80[local764] * local774 + 32767 >> 15);
									this.aShortArray80[local764] = (short) local796;
								}
								if (arg3 != 0) {
									local774 = Class125.anIntArray381[arg3];
									local778 = Class125.anIntArray382[arg3];
									local796 = this.aShortArray79[local764] * local774 + local778 * this.aShortArray75[local764] + 32767 >> 15;
									this.aShortArray79[local764] = (short) (this.aShortArray79[local764] * local778 + 32767 - local774 * this.aShortArray75[local764] >> 15);
									this.aShortArray75[local764] = (short) local796;
								}
							}
						}
					}
				}
				if (this.aClass11_6 == null && this.aClass11_5 != null) {
					this.aClass11_5.anInterface10_1 = null;
				}
				if (this.aClass11_6 != null) {
					this.aClass11_6.anInterface10_1 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray48.length > local35) {
					local163 = this.anIntArrayArray48[local35];
					for (local165 = 0; local165 < local163.length; local165++) {
						local57 = local163[local165];
						this.anIntArray417[local57] -= Static310.anInt5645;
						this.anIntArray415[local57] -= Static224.anInt4040;
						this.anIntArray416[local57] -= Static284.anInt9393;
						this.anIntArray417[local57] = arg2 * this.anIntArray417[local57] >> 7;
						this.anIntArray415[local57] = this.anIntArray415[local57] * arg3 >> 7;
						this.anIntArray416[local57] = arg4 * this.anIntArray416[local57] >> 7;
						this.anIntArray417[local57] += Static310.anInt5645;
						this.anIntArray415[local57] += Static224.anInt4040;
						this.anIntArray416[local57] += Static284.anInt9393;
					}
				}
			}
		} else {
			@Pc(1210) Class126 local1210;
			@Pc(1215) Class159 local1215;
			if (arg0 == 5) {
				if (this.anIntArrayArray50 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray50.length) {
							local163 = this.anIntArrayArray50[local35];
							for (local165 = 0; local165 < local163.length; local165++) {
								local57 = local163[local165];
								local63 = (this.aByteArray78[local57] & 0xFF) + (arg2 * 8);
								if (local63 < 0) {
									local63 = 0;
								} else if (local63 > 255) {
									local63 = 255;
								}
								this.aByteArray78[local57] = (byte) local63;
							}
							if (local163.length > 0 && this.aClass11_5 != null) {
								this.aClass11_5.anInterface10_1 = null;
							}
						}
					}
					if (this.aClass126Array1 != null) {
						for (local35 = 0; local35 < this.anInt4275; local35++) {
							local1210 = this.aClass126Array1[local35];
							local1215 = this.aClass159Array1[local35];
							local1215.anInt4335 = 255 - (this.aByteArray78[local1210.anInt3552] & 0xFF) << 24 | local1215.anInt4335 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1463) Class159 local1463;
				if (arg0 == 8) {
					if (this.anIntArrayArray49 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray49.length) {
								local163 = this.anIntArrayArray49[local35];
								for (local165 = 0; local165 < local163.length; local165++) {
									local1463 = this.aClass159Array1[local163[local165]];
									local1463.anInt4337 += arg3;
									local1463.anInt4331 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray49 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray49.length > local35) {
								local163 = this.anIntArrayArray49[local35];
								for (local165 = 0; local165 < local163.length; local165++) {
									local1463 = this.aClass159Array1[local163[local165]];
									local1463.anInt4333 = arg2 * local1463.anInt4333 >> 7;
									local1463.anInt4338 = arg3 * local1463.anInt4338 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray49 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray49.length) {
							local163 = this.anIntArrayArray49[local35];
							for (local165 = 0; local165 < local163.length; local165++) {
								local1463 = this.aClass159Array1[local163[local165]];
								local1463.anInt4334 = arg2 + local1463.anInt4334 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray50 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray50.length > local35) {
						local163 = this.anIntArrayArray50[local35];
						for (local165 = 0; local165 < local163.length; local165++) {
							local57 = local163[local165];
							local63 = this.aShortArray74[local57] & 0xFFFF;
							local275 = local63 >> 10 & 0x3F;
							local294 = local63 >> 7 & 0x7;
							local755 = local63 & 0x7F;
							@Pc(1303) int local1303 = local275 + arg2 & 0x3F;
							local294 += arg3 / 4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 7) {
								local294 = 7;
							}
							local755 += arg4;
							if (local755 < 0) {
								local755 = 0;
							} else if (local755 > 127) {
								local755 = 127;
							}
							this.aShortArray74[local57] = (short) (local294 << 7 | local1303 << 10 | local755);
						}
						if (local163.length > 0 && this.aClass11_5 != null) {
							this.aClass11_5.anInterface10_1 = null;
						}
					}
				}
				if (this.aClass126Array1 != null) {
					for (local35 = 0; local35 < this.anInt4275; local35++) {
						local1210 = this.aClass126Array1[local35];
						local1215 = this.aClass159Array1[local35];
						local1215.anInt4335 = local1215.anInt4335 & 0xFF000000 | Static445.anIntArray614[this.aShortArray74[local1210.anInt3552] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
	private void method3686() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt4225; local23++) {
			@Pc(30) int local30 = this.anIntArray417[local23];
			@Pc(35) int local35 = this.anIntArray415[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			@Pc(58) int local58 = this.anIntArray416[local23];
			if (local30 < local7) {
				local7 = local30;
			}
			if (local9 > local35) {
				local9 = local35;
			}
			if (local11 > local58) {
				local11 = local58;
			}
			if (local17 < local58) {
				local17 = local58;
			}
			@Pc(99) int local99 = local30 * local30 + local58 * local58;
			if (local19 < local99) {
				local19 = local99;
			}
			local99 = local30 * local30 + local58 * local58 + local35 * local35;
			if (local99 > local21) {
				local21 = local99;
			}
		}
		this.lb = (short) local13;
		this.aShort83 = (short) local7;
		this.aShort85 = (short) local15;
		this.aShort82 = (short) local17;
		this.aShort86 = (short) local11;
		this.aShort87 = (short) local9;
		this.aShort89 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean323 = true;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class63 method7706(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class63_Sub2 local18;
		@Pc(14) Class63_Sub2 local14;
		if (arg0 == 1) {
			local14 = this.aClass39_Sub3_20.aClass63_Sub2_9;
			local18 = this.aClass39_Sub3_20.aClass63_Sub2_8;
		} else if (arg0 == 2) {
			local14 = this.aClass39_Sub3_20.aClass63_Sub2_3;
			local18 = this.aClass39_Sub3_20.aClass63_Sub2_4;
		} else if (arg0 == 3) {
			local14 = this.aClass39_Sub3_20.aClass63_Sub2_7;
			local18 = this.aClass39_Sub3_20.aClass63_Sub2_5;
		} else if (arg0 == 4) {
			local18 = this.aClass39_Sub3_20.aClass63_Sub2_6;
			local14 = this.aClass39_Sub3_20.bf;
		} else if (arg0 == 5) {
			local18 = this.aClass39_Sub3_20.aClass63_Sub2_1;
			local14 = this.aClass39_Sub3_20.aClass63_Sub2_2;
		} else {
			local18 = local14 = new Class63_Sub2(this.aClass39_Sub3_20);
		}
		return this.method3691(arg0 != 0, arg2, local18, arg1, local14);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!m;Lclient!gr;I)V")
	@Override
	public void method7700(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class6_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4221 == 0) {
			return;
		}
		@Pc(13) Class181_Sub3 local13 = this.aClass39_Sub3_20.aClass181_Sub3_3;
		@Pc(16) Class181_Sub3 local16 = (Class181_Sub3) arg0;
		if (!this.aBoolean323) {
			this.method3686();
		}
		this.method3692(local16);
		Static425.aFloat179 = local13.aFloat153 * local16.aFloat151 + local16.aFloat143 * local13.aFloat147 + local16.aFloat153 * local13.aFloat148;
		Static319.aFloat127 = local13.aFloat150 + local16.aFloat152 * local13.aFloat153 + local13.aFloat147 * local16.aFloat145 + local13.aFloat148 * local16.aFloat150;
		@Pc(73) float local73 = (float) this.aShort87 * Static425.aFloat179 + Static319.aFloat127;
		@Pc(81) float local81 = (float) this.aShort85 * Static425.aFloat179 + Static319.aFloat127;
		@Pc(98) float local98;
		@Pc(91) float local91;
		if (local81 < local73) {
			local98 = local81 - (float) this.aShort89;
			local91 = (float) this.aShort89 + local73;
		} else {
			local91 = (float) this.aShort89 + local81;
			local98 = (float) -this.aShort89 + local73;
		}
		if (local98 >= this.aClass39_Sub3_20.aFloat162 || (float) this.aClass39_Sub3_20.anInt6759 >= local91) {
			return;
		}
		Static507.aFloat49 = local13.aFloat146 * local16.aFloat143 + local16.aFloat151 * local13.aFloat143 + local16.aFloat153 * local13.aFloat149;
		Static206.aFloat66 = local13.aFloat145 + local16.aFloat145 * local13.aFloat146 + local13.aFloat143 * local16.aFloat152 + local13.aFloat149 * local16.aFloat150;
		@Pc(174) float local174 = Static507.aFloat49 * (float) this.aShort87 + Static206.aFloat66;
		@Pc(182) float local182 = Static206.aFloat66 + (float) this.aShort85 * Static507.aFloat49;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local182 < local174) {
			local197 = (float) this.aClass39_Sub3_20.anInt6751 * ((float) -this.aShort89 + local182);
			local208 = (float) this.aClass39_Sub3_20.anInt6751 * (local174 + (float) this.aShort89);
		} else {
			local197 = (float) this.aClass39_Sub3_20.anInt6751 * (local174 - (float) this.aShort89);
			local208 = (local182 + (float) this.aShort89) * (float) this.aClass39_Sub3_20.anInt6751;
		}
		if (this.aClass39_Sub3_20.aFloat154 <= local197 / local91 || local208 / local91 <= this.aClass39_Sub3_20.aFloat161) {
			return;
		}
		Static371.aFloat181 = local16.aFloat151 * local13.aFloat151 + local16.aFloat143 * local13.aFloat142 + local13.aFloat144 * local16.aFloat153;
		Static24.aFloat14 = local13.aFloat144 * local16.aFloat150 + local16.aFloat152 * local13.aFloat151 + local16.aFloat145 * local13.aFloat142 + local13.aFloat152;
		@Pc(298) float local298 = (float) this.aShort87 * Static371.aFloat181 + Static24.aFloat14;
		@Pc(306) float local306 = Static24.aFloat14 + (float) this.aShort85 * Static371.aFloat181;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local306 < local298) {
			local333 = (float) this.aClass39_Sub3_20.anInt6726 * ((float) this.aShort89 + local298);
			local322 = ((float) -this.aShort89 + local306) * (float) this.aClass39_Sub3_20.anInt6726;
		} else {
			local322 = (float) this.aClass39_Sub3_20.anInt6726 * ((float) -this.aShort89 + local298);
			local333 = (local306 + (float) this.aShort89) * (float) this.aClass39_Sub3_20.anInt6726;
		}
		if (local322 / local91 >= this.aClass39_Sub3_20.aFloat171 || this.aClass39_Sub3_20.aFloat157 >= local333 / local91) {
			return;
		}
		if (arg1 != null || this.aClass126Array1 != null) {
			Static458.aFloat213 = local16.aFloat146 * local13.aFloat142 + local16.aFloat142 * local13.aFloat151 + local16.aFloat147 * local13.aFloat144;
			Static83.aFloat29 = local16.aFloat148 * local13.aFloat149 + local13.aFloat146 * local16.aFloat149 + local16.aFloat144 * local13.aFloat143;
			Static493.aFloat220 = local16.aFloat144 * local13.aFloat151 + local16.aFloat149 * local13.aFloat142 + local13.aFloat144 * local16.aFloat148;
			Static446.aFloat212 = local16.aFloat149 * local13.aFloat147 + local13.aFloat153 * local16.aFloat144 + local16.aFloat148 * local13.aFloat148;
			Static167.aFloat59 = local13.aFloat143 * local16.aFloat142 + local16.aFloat146 * local13.aFloat146 + local13.aFloat149 * local16.aFloat147;
			Static356.aFloat52 = local16.aFloat146 * local13.aFloat147 + local16.aFloat142 * local13.aFloat153 + local13.aFloat148 * local16.aFloat147;
		}
		if (arg1 != null) {
			@Pc(493) boolean local493 = false;
			@Pc(495) boolean local495 = true;
			@Pc(503) int local503 = this.lb + this.aShort83 >> 1;
			@Pc(511) int local511 = this.aShort86 + this.aShort82 >> 1;
			@Pc(530) int local530 = (int) ((float) local511 * Static83.aFloat29 + Static507.aFloat49 * (float) this.aShort87 + (float) local503 * Static167.aFloat59 + Static206.aFloat66);
			@Pc(549) int local549 = (int) (Static24.aFloat14 + (float) local503 * Static458.aFloat213 + Static371.aFloat181 * (float) this.aShort87 + Static493.aFloat220 * (float) local511);
			@Pc(568) int local568 = (int) ((float) this.aShort87 * Static425.aFloat179 + Static319.aFloat127 + Static356.aFloat52 * (float) local503 + Static446.aFloat212 * (float) local511);
			if (local568 < this.aClass39_Sub3_20.anInt6759) {
				local493 = true;
			} else {
				arg1.anInt3041 = local530 * this.aClass39_Sub3_20.anInt6751 / local568 + this.aClass39_Sub3_20.anInt6734;
				arg1.anInt3043 = this.aClass39_Sub3_20.anInt6726 * local549 / local568 + this.aClass39_Sub3_20.anInt6736;
			}
			@Pc(622) int local622 = (int) (Static167.aFloat59 * (float) local503 + Static206.aFloat66 + Static507.aFloat49 * (float) this.aShort85 + Static83.aFloat29 * (float) local511);
			@Pc(641) int local641 = (int) ((float) local503 * Static458.aFloat213 + Static24.aFloat14 + Static371.aFloat181 * (float) this.aShort85 + (float) local511 * Static493.aFloat220);
			@Pc(660) int local660 = (int) ((float) this.aShort85 * Static425.aFloat179 + Static356.aFloat52 * (float) local503 + Static319.aFloat127 + (float) local511 * Static446.aFloat212);
			if (local660 >= this.aClass39_Sub3_20.anInt6759) {
				arg1.anInt3044 = this.aClass39_Sub3_20.anInt6736 + this.aClass39_Sub3_20.anInt6726 * local641 / local660;
				arg1.anInt3042 = this.aClass39_Sub3_20.anInt6734 + local622 * this.aClass39_Sub3_20.anInt6751 / local660;
			} else {
				local493 = true;
			}
			if (local493) {
				if (this.aClass39_Sub3_20.anInt6759 > local568 && local660 < this.aClass39_Sub3_20.anInt6759) {
					local495 = false;
				} else {
					@Pc(751) int local751;
					@Pc(762) int local762;
					@Pc(773) int local773;
					if (local568 < this.aClass39_Sub3_20.anInt6759) {
						local751 = (local660 - this.aClass39_Sub3_20.anInt6759 << 16) / (local660 - local568);
						local762 = ((local622 - local530) * local751 >> 16) + local622;
						arg1.anInt3041 = this.aClass39_Sub3_20.anInt6751 * local762 / this.aClass39_Sub3_20.anInt6759 + this.aClass39_Sub3_20.anInt6734;
						local773 = ((local641 - local549) * local751 >> 16) + local641;
						arg1.anInt3043 = local773 * this.aClass39_Sub3_20.anInt6726 / this.aClass39_Sub3_20.anInt6759 + this.aClass39_Sub3_20.anInt6736;
					} else if (this.aClass39_Sub3_20.anInt6759 > local660) {
						local751 = (local568 - this.aClass39_Sub3_20.anInt6759 << 16) / (local568 - local660);
						local762 = (local751 * (local530 - local622) >> 16) + local530;
						local773 = ((local549 - local641) * local751 >> 16) + local549;
						arg1.anInt3041 = local762 * this.aClass39_Sub3_20.anInt6751 / this.aClass39_Sub3_20.anInt6759 + this.aClass39_Sub3_20.anInt6734;
						arg1.anInt3043 = this.aClass39_Sub3_20.anInt6736 + this.aClass39_Sub3_20.anInt6726 * local773 / this.aClass39_Sub3_20.anInt6759;
					}
				}
			}
			if (local495) {
				arg1.aBoolean247 = true;
				if (local568 > local660) {
					arg1.anInt3040 = this.aClass39_Sub3_20.anInt6751 * (local530 + this.aShort89) / local568 + this.aClass39_Sub3_20.anInt6734 - arg1.anInt3041;
				} else {
					arg1.anInt3040 = this.aClass39_Sub3_20.anInt6751 * (local622 + this.aShort89) / local660 + this.aClass39_Sub3_20.anInt6734 - arg1.anInt3042;
				}
			}
		}
		this.aClass39_Sub3_20.method5712();
		this.aClass39_Sub3_20.method5737(local16);
		this.method3687();
		this.aClass39_Sub3_20.method5734();
		this.method3696();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
	private void method3687() {
		if (this.anInt4246 == 0) {
			return;
		}
		if (this.aByte62 != 0) {
			this.method3694(true);
		}
		this.method3694(false);
		if (this.aClass267_1 != null) {
			if (this.aClass267_1.anInterface5_5 == null) {
				this.method3685((this.aByte62 & 0x10) != 0);
			}
			if (this.aClass267_1.anInterface5_5 != null) {
				this.aClass39_Sub3_20.method5736(this.aClass11_6 != null);
				this.aClass39_Sub3_20.method5754(this.aClass11_4, this.aClass11_5, this.aClass11_7, this.aClass11_6);
				@Pc(82) int local82 = this.anIntArray414.length - 1;
				for (@Pc(84) int local84 = 0; local84 < local82; local84++) {
					@Pc(91) int local91 = this.anIntArray414[local84];
					@Pc(98) int local98 = this.anIntArray414[local84 + 1];
					@Pc(105) int local105 = this.aShortArray76[local91] & 0xFFFF;
					if (local105 == 65535) {
						local105 = -1;
					}
					this.aClass39_Sub3_20.method5715(local105, this.aClass11_6 != null);
					this.aClass39_Sub3_20.method5755(this.aClass267_1.anInterface5_5, (local98 - local91) * 3, local91 * 3);
				}
			}
		}
		this.method3693();
	}

	@OriginalMember(owner = "client!jv", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	@Override
	public void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean323) {
			this.method3686();
		}
		@Pc(16) int local16 = this.aShort83 + arg4;
		@Pc(22) int local22 = arg4 + this.lb;
		@Pc(27) int local27 = arg6 + this.aShort86;
		@Pc(32) int local32 = this.aShort82 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt7998 <= local22 + arg2.anInt7994 >> arg2.anInt7996 || local27 < 0 || local32 + arg2.anInt7994 >> arg2.anInt7996 >= arg2.anInt7995)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt7994 + local22 >> arg3.anInt7996 >= arg3.anInt7998 || local27 < 0 || arg3.anInt7994 + local32 >> arg3.anInt7996 >= arg3.anInt7995) {
				return;
			}
		} else {
			local16 >>= arg2.anInt7996;
			local22 = arg2.anInt7994 + local22 - 1 >> arg2.anInt7996;
			local27 >>= arg2.anInt7996;
			local32 = local32 + arg2.anInt7994 - 1 >> arg2.anInt7996;
			if (arg5 == arg2.ba(local16, local27) && arg5 == arg2.ba(local22, local27) && arg2.ba(local16, local32) == arg5 && arg5 == arg2.ba(local22, local32)) {
				return;
			}
		}
		@Pc(201) int local201;
		if (arg0 == 1) {
			for (local201 = 0; local201 < this.anInt4225; local201++) {
				this.anIntArray415[local201] = this.anIntArray415[local201] + arg2.aa(this.anIntArray417[local201] - -arg4, arg6 + this.anIntArray416[local201]) - arg5;
			}
		} else {
			@Pc(257) int local257;
			@Pc(265) int local265;
			if (arg0 == 2) {
				@Pc(469) short local469 = this.aShort87;
				if (local469 == 0) {
					return;
				}
				for (local257 = 0; local257 < this.anInt4225; local257++) {
					local265 = (this.anIntArray415[local257] << 16) / local469;
					if (arg1 > local265) {
						this.anIntArray415[local257] += (arg2.aa(this.anIntArray417[local257] + arg4, this.anIntArray416[local257] + arg6) - arg5) * (-local265 + arg1) / arg1;
					}
				}
			} else {
				@Pc(273) int local273;
				if (arg0 == 3) {
					local201 = (arg1 & 0xFF) * 4;
					local257 = (arg1 >> 8 & 0xFF) * 4;
					local265 = (arg1 >> 16 & 0xFF) << 6;
					local273 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local201 >> 1) < 0 || arg2.anInt7998 << arg2.anInt7996 <= arg2.anInt7994 + (local201 >> 1) + arg4 || arg6 - (local257 >> 1) < 0 || (local257 >> 1) + arg6 + arg2.anInt7994 >= arg2.anInt7995 << arg2.anInt7996) {
						return;
					}
					this.method7695(local265, arg2, local273, arg6, arg5, arg4, local201, local257);
				} else if (arg0 == 4) {
					local201 = this.aShort85 - this.aShort87;
					for (local257 = 0; local257 < this.anInt4225; local257++) {
						this.anIntArray415[local257] = local201 + this.anIntArray415[local257] + arg3.aa(this.anIntArray417[local257] + arg4, arg6 + this.anIntArray416[local257]) - arg5;
					}
				} else if (arg0 == 5) {
					local201 = this.aShort85 - this.aShort87;
					for (local257 = 0; local257 < this.anInt4225; local257++) {
						local265 = this.anIntArray417[local257] + arg4;
						local273 = arg6 + this.anIntArray416[local257];
						@Pc(421) int local421 = arg2.aa(local265, local273);
						@Pc(426) int local426 = arg3.aa(local265, local273);
						@Pc(434) int local434 = local421 - arg1 - local426;
						this.anIntArray415[local257] = (local434 * ((this.anIntArray415[local257] << 8) / local201) >> 8) + local421 - arg5;
					}
				}
			}
		}
		this.aBoolean323 = false;
		if (this.aClass11_4 != null) {
			this.aClass11_4.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BIIIIIIII)Z")
	private boolean method3688(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg1 && arg2 < arg5 && arg2 < arg0) {
			return false;
		} else if (arg1 < arg2 && arg2 > arg5 && arg2 > arg0) {
			return false;
		} else if (arg4 < arg3 && arg7 > arg4 && arg6 > arg4) {
			return false;
		} else {
			return arg4 <= arg3 || arg4 <= arg7 || arg4 <= arg6;
		}
	}

	@OriginalMember(owner = "client!jv", name = "sa", descriptor = "()Z")
	@Override
	protected boolean sa() {
		if (this.anIntArrayArray48 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt4278; local12++) {
			this.anIntArray417[local12] <<= 0x4;
			this.anIntArray415[local12] <<= 0x4;
			this.anIntArray416[local12] <<= 0x4;
		}
		Static284.anInt9393 = 0;
		Static310.anInt5645 = 0;
		Static224.anInt4040 = 0;
		return true;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!iaa;I)V")
	private void method3689(@OriginalArg(0) Class2_Sub13_Sub6_Sub1 arg0) {
		if (this.anInt4221 > this.aClass39_Sub3_20.anIntArray516.length) {
			this.aClass39_Sub3_20.anIntArray515 = new int[this.anInt4221];
			this.aClass39_Sub3_20.anIntArray516 = new int[this.anInt4221];
		}
		@Pc(40) int[] local40 = this.aClass39_Sub3_20.anIntArray516;
		@Pc(44) int[] local44 = this.aClass39_Sub3_20.anIntArray515;
		@Pc(73) int local73;
		@Pc(111) int local111;
		@Pc(120) int local120;
		for (@Pc(46) int local46 = 0; local46 < this.anInt4225; local46++) {
			local73 = (this.anIntArray417[local46] - (this.aClass39_Sub3_20.anInt6742 * this.anIntArray415[local46] >> 8) >> this.aClass39_Sub3_20.anInt6716) - arg0.anInt3541;
			@Pc(97) int local97 = (this.anIntArray416[local46] - (this.aClass39_Sub3_20.anInt6758 * this.anIntArray415[local46] >> 8) >> this.aClass39_Sub3_20.anInt6716) - arg0.anInt3542;
			@Pc(102) int local102 = this.anIntArray418[local46];
			@Pc(109) int local109 = this.anIntArray418[local46 + 1];
			for (local111 = local102; local111 < local109; local111++) {
				local120 = this.aShortArray78[local111] - 1;
				if (local120 == -1) {
					break;
				}
				local40[local120] = local73;
				local44[local120] = local97;
			}
		}
		for (local73 = 0; local73 < this.anInt4246; local73++) {
			if (this.aByteArray78 == null || this.aByteArray78[local73] <= 128) {
				@Pc(165) short local165 = this.aShortArray82[local73];
				@Pc(170) short local170 = this.aShortArray77[local73];
				@Pc(175) short local175 = this.aShortArray73[local73];
				local111 = local40[local165];
				local120 = local40[local170];
				@Pc(187) int local187 = local40[local175];
				@Pc(191) int local191 = local44[local165];
				@Pc(195) int local195 = local44[local170];
				@Pc(199) int local199 = local44[local175];
				if ((local195 - local199) * (local111 - local120) - (local187 - local120) * (local195 - local191) > 0) {
					arg0.method3169(local187, local120, local199, local195, local111, local191);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "pa", descriptor = "(SS)V")
	@Override
	public void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4239; local7++) {
			if (this.aShortArray74[local7] == arg0) {
				this.aShortArray74[local7] = arg1;
			}
		}
		if (this.aClass126Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt4275; local34++) {
				@Pc(41) Class126 local41 = this.aClass126Array1[local34];
				@Pc(46) Class159 local46 = this.aClass159Array1[local34];
				local46.anInt4335 = Static445.anIntArray614[this.aShortArray74[local41.anInt3552] & 0xFFFF] & 0xFFFFFF | local46.anInt4335 & 0xFF000000;
			}
		}
		if (this.aClass11_5 != null) {
			this.aClass11_5.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!jv", name = "X", descriptor = "()V")
	@Override
	public void X() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4225; local7++) {
			this.anIntArray416[local7] = -this.anIntArray416[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt4221; local29++) {
			this.aShortArray79[local29] = (short) -this.aShortArray79[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt4239; local48++) {
			@Pc(55) short local55 = this.aShortArray82[local48];
			this.aShortArray82[local48] = this.aShortArray73[local48];
			this.aShortArray73[local48] = local55;
		}
		if (this.aClass11_6 == null && this.aClass11_5 != null) {
			this.aClass11_5.anInterface10_1 = null;
		}
		if (this.aClass11_6 != null) {
			this.aClass11_6.anInterface10_1 = null;
		}
		this.aBoolean323 = false;
		if (this.aClass11_4 != null) {
			this.aClass11_4.anInterface10_1 = null;
		}
		if (this.aClass267_1 != null) {
			this.aClass267_1.anInterface5_5 = null;
		}
	}

	@OriginalMember(owner = "client!jv", name = "OA", descriptor = "(I)V")
	@Override
	public void OA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class125.anIntArray381[arg0];
		@Pc(13) int local13 = Class125.anIntArray382[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4225; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray417[local15] + local9 * this.anIntArray416[local15] >> 15;
			this.anIntArray416[local15] = local13 * this.anIntArray416[local15] - this.anIntArray417[local15] * local9 >> 15;
			this.anIntArray417[local15] = local33;
		}
		this.aBoolean323 = false;
		if (this.aClass11_4 != null) {
			this.aClass11_4.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!jv", name = "ca", descriptor = "(III)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4225; local3++) {
			if (arg0 != 0) {
				this.anIntArray417[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray415[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray416[local3] += arg2;
			}
		}
		if (this.aClass11_4 != null) {
			this.aClass11_4.anInterface10_1 = null;
		}
		this.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "()I")
	@Override
	public int n() {
		if (!this.aBoolean323) {
			this.method3686();
		}
		return this.aShort85;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZZLclient!jv;ILclient!jv;)Lclient!r;")
	private Class63 method3691(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class63_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class63_Sub2 arg4) {
		arg2.anInt4225 = this.anInt4225;
		arg2.anInt4238 = this.anInt4238;
		arg2.aShort88 = this.aShort88;
		arg2.anInt4278 = this.anInt4278;
		arg2.anInt4229 = arg3;
		arg2.anInt4275 = this.anInt4275;
		arg2.anInt4246 = this.anInt4246;
		arg2.anInt4239 = this.anInt4239;
		arg2.anInt4221 = this.anInt4221;
		arg2.aShort84 = this.aShort84;
		arg2.aByte62 = 0;
		@Pc(59) boolean local59 = Static63.method1151(arg3, this.anInt4238);
		@Pc(65) boolean local65 = Static381.method5974(arg3, this.anInt4238);
		@Pc(71) boolean local71 = Static412.method6448(this.anInt4238, arg3);
		@Pc(77) boolean local77 = local59 | local65 | local71;
		@Pc(192) int local192;
		if (local77) {
			if (!local59) {
				arg2.anIntArray417 = this.anIntArray417;
			} else if (arg4.anIntArray417 == null || arg4.anIntArray417.length < this.anInt4278) {
				arg2.anIntArray417 = arg4.anIntArray417 = new int[this.anInt4278];
			} else {
				arg2.anIntArray417 = arg4.anIntArray417;
			}
			if (!local65) {
				arg2.anIntArray415 = this.anIntArray415;
			} else if (arg4.anIntArray415 == null || arg4.anIntArray415.length < this.anInt4278) {
				arg2.anIntArray415 = arg4.anIntArray415 = new int[this.anInt4278];
			} else {
				arg2.anIntArray415 = arg4.anIntArray415;
			}
			if (!local71) {
				arg2.anIntArray416 = this.anIntArray416;
			} else if (arg4.anIntArray416 == null || arg4.anIntArray416.length < this.anInt4278) {
				arg2.anIntArray416 = arg4.anIntArray416 = new int[this.anInt4278];
			} else {
				arg2.anIntArray416 = arg4.anIntArray416;
			}
			for (local192 = 0; local192 < this.anInt4278; local192++) {
				if (local59) {
					arg2.anIntArray417[local192] = this.anIntArray417[local192];
				}
				if (local65) {
					arg2.anIntArray415[local192] = this.anIntArray415[local192];
				}
				if (local71) {
					arg2.anIntArray416[local192] = this.anIntArray416[local192];
				}
			}
		} else {
			arg2.anIntArray416 = this.anIntArray416;
			arg2.anIntArray415 = this.anIntArray415;
			arg2.anIntArray417 = this.anIntArray417;
		}
		if (Static342.method5379(arg3, this.anInt4238)) {
			if (arg0) {
				arg2.aByte62 = (byte) (arg2.aByte62 | 0x1);
			}
			arg2.aClass11_4 = arg4.aClass11_4;
			arg2.aClass11_4.aByte5 = this.aClass11_4.aByte5;
			arg2.aClass11_4.anInterface10_1 = this.aClass11_4.anInterface10_1;
		} else if (Static204.method3281(arg3, this.anInt4238)) {
			arg2.aClass11_4 = this.aClass11_4;
		} else {
			arg2.aClass11_4 = null;
		}
		if (Static261.method4058(this.anInt4238, arg3)) {
			if (arg4.aShortArray74 == null || this.anInt4239 > arg4.aShortArray74.length) {
				arg2.aShortArray74 = arg4.aShortArray74 = new short[this.anInt4239];
			} else {
				arg2.aShortArray74 = arg4.aShortArray74;
			}
			for (local192 = 0; local192 < this.anInt4239; local192++) {
				arg2.aShortArray74[local192] = this.aShortArray74[local192];
			}
		} else {
			arg2.aShortArray74 = this.aShortArray74;
		}
		if (Static311.method4813(arg3, this.anInt4238)) {
			if (arg4.aByteArray78 == null || arg4.aByteArray78.length < this.anInt4239) {
				arg2.aByteArray78 = arg4.aByteArray78 = new byte[this.anInt4239];
			} else {
				arg2.aByteArray78 = arg4.aByteArray78;
			}
			for (local192 = 0; local192 < this.anInt4239; local192++) {
				arg2.aByteArray78[local192] = this.aByteArray78[local192];
			}
		} else {
			arg2.aByteArray78 = this.aByteArray78;
		}
		if (Static269.method4299(arg3, this.anInt4238)) {
			if (arg0) {
				arg2.aByte62 = (byte) (arg2.aByte62 | 0x2);
			}
			arg2.aClass11_5 = arg4.aClass11_5;
			arg2.aClass11_5.anInterface10_1 = this.aClass11_5.anInterface10_1;
			arg2.aClass11_5.aByte5 = this.aClass11_5.aByte5;
		} else if (Static466.method7016(this.anInt4238, arg3)) {
			arg2.aClass11_5 = this.aClass11_5;
		} else {
			arg2.aClass11_5 = null;
		}
		@Pc(574) int local574;
		if (Static368.method5871(this.anInt4238, arg3)) {
			if (arg4.aShortArray75 == null || arg4.aShortArray75.length < this.anInt4221) {
				local192 = this.anInt4221;
				arg2.aShortArray79 = arg4.aShortArray79 = new short[local192];
				arg2.aShortArray75 = arg4.aShortArray75 = new short[local192];
				arg2.aShortArray80 = arg4.aShortArray80 = new short[local192];
			} else {
				arg2.aShortArray79 = arg4.aShortArray79;
				arg2.aShortArray75 = arg4.aShortArray75;
				arg2.aShortArray80 = arg4.aShortArray80;
			}
			if (this.aClass280_1 == null) {
				for (local192 = 0; local192 < this.anInt4221; local192++) {
					arg2.aShortArray75[local192] = this.aShortArray75[local192];
					arg2.aShortArray80[local192] = this.aShortArray80[local192];
					arg2.aShortArray79[local192] = this.aShortArray79[local192];
				}
			} else {
				if (arg4.aClass280_1 == null) {
					arg4.aClass280_1 = new Class280();
				}
				@Pc(558) Class280 local558 = arg2.aClass280_1 = arg4.aClass280_1;
				if (local558.aShortArray108 == null || this.anInt4221 > local558.aShortArray108.length) {
					local574 = this.anInt4221;
					local558.aShortArray107 = new short[local574];
					local558.aShortArray108 = new short[local574];
					local558.aShortArray109 = new short[local574];
					local558.aByteArray110 = new byte[local574];
				}
				for (local574 = 0; local574 < this.anInt4221; local574++) {
					arg2.aShortArray75[local574] = this.aShortArray75[local574];
					arg2.aShortArray80[local574] = this.aShortArray80[local574];
					arg2.aShortArray79[local574] = this.aShortArray79[local574];
					local558.aShortArray108[local574] = this.aClass280_1.aShortArray108[local574];
					local558.aShortArray109[local574] = this.aClass280_1.aShortArray109[local574];
					local558.aShortArray107[local574] = this.aClass280_1.aShortArray107[local574];
					local558.aByteArray110[local574] = this.aClass280_1.aByteArray110[local574];
				}
			}
			arg2.aByteArray77 = this.aByteArray77;
		} else {
			arg2.aClass280_1 = this.aClass280_1;
			arg2.aShortArray80 = this.aShortArray80;
			arg2.aShortArray75 = this.aShortArray75;
			arg2.aShortArray79 = this.aShortArray79;
			arg2.aByteArray77 = this.aByteArray77;
		}
		if (Static37.method713(arg3, this.anInt4238)) {
			if (arg0) {
				arg2.aByte62 = (byte) (arg2.aByte62 | 0x4);
			}
			arg2.aClass11_6 = arg4.aClass11_6;
			arg2.aClass11_6.aByte5 = this.aClass11_6.aByte5;
			arg2.aClass11_6.anInterface10_1 = this.aClass11_6.anInterface10_1;
		} else if (Static262.method6209(this.anInt4238, arg3)) {
			arg2.aClass11_6 = this.aClass11_6;
		} else {
			arg2.aClass11_6 = null;
		}
		if (Static204.method3284(arg3, this.anInt4238)) {
			if (arg4.aFloatArray22 == null || this.anInt4239 > arg4.aFloatArray22.length) {
				local192 = this.anInt4221;
				arg2.aFloatArray22 = arg4.aFloatArray22 = new float[local192];
				arg2.aFloatArray23 = arg4.aFloatArray23 = new float[local192];
			} else {
				arg2.aFloatArray22 = arg4.aFloatArray22;
				arg2.aFloatArray23 = arg4.aFloatArray23;
			}
			for (local192 = 0; local192 < this.anInt4221; local192++) {
				arg2.aFloatArray22[local192] = this.aFloatArray22[local192];
				arg2.aFloatArray23[local192] = this.aFloatArray23[local192];
			}
		} else {
			arg2.aFloatArray22 = this.aFloatArray22;
			arg2.aFloatArray23 = this.aFloatArray23;
		}
		if (Static326.method5155(arg3, this.anInt4238)) {
			if (arg0) {
				arg2.aByte62 = (byte) (arg2.aByte62 | 0x8);
			}
			arg2.aClass11_7 = arg4.aClass11_7;
			arg2.aClass11_7.aByte5 = this.aClass11_7.aByte5;
			arg2.aClass11_7.anInterface10_1 = this.aClass11_7.anInterface10_1;
		} else if (Static460.method7584(arg3, this.anInt4238)) {
			arg2.aClass11_7 = this.aClass11_7;
		} else {
			arg2.aClass11_7 = null;
		}
		if (Static498.method7327(arg3, this.anInt4238)) {
			if (arg4.aShortArray82 == null || this.anInt4239 > arg4.aShortArray82.length) {
				local192 = this.anInt4239;
				arg2.aShortArray73 = arg4.aShortArray73 = new short[local192];
				arg2.aShortArray77 = arg4.aShortArray77 = new short[local192];
				arg2.aShortArray82 = arg4.aShortArray82 = new short[local192];
			} else {
				arg2.aShortArray77 = arg4.aShortArray77;
				arg2.aShortArray82 = arg4.aShortArray82;
				arg2.aShortArray73 = arg4.aShortArray73;
			}
			for (local192 = 0; local192 < this.anInt4239; local192++) {
				arg2.aShortArray82[local192] = this.aShortArray82[local192];
				arg2.aShortArray77[local192] = this.aShortArray77[local192];
				arg2.aShortArray73[local192] = this.aShortArray73[local192];
			}
		} else {
			arg2.aShortArray82 = this.aShortArray82;
			arg2.aShortArray73 = this.aShortArray73;
			arg2.aShortArray77 = this.aShortArray77;
		}
		if (Static98.method1917(arg3, this.anInt4238)) {
			arg2.aClass267_1 = arg4.aClass267_1;
			if (arg0) {
				arg2.aByte62 = (byte) (arg2.aByte62 | 0x10);
			}
			arg2.aClass267_1.anInterface5_5 = this.aClass267_1.anInterface5_5;
		} else if (Static188.method254(this.anInt4238, arg3)) {
			arg2.aClass267_1 = this.aClass267_1;
		} else {
			arg2.aClass267_1 = null;
		}
		if (Static230.method3625(this.anInt4238, arg3)) {
			if (arg4.aShortArray76 == null || this.anInt4239 > arg4.aShortArray76.length) {
				local192 = this.anInt4239;
				arg2.aShortArray76 = arg4.aShortArray76 = new short[local192];
			} else {
				arg2.aShortArray76 = arg4.aShortArray76;
			}
			for (local192 = 0; local192 < this.anInt4239; local192++) {
				arg2.aShortArray76[local192] = this.aShortArray76[local192];
			}
		} else {
			arg2.aShortArray76 = this.aShortArray76;
		}
		if (!Static363.method1122(this.anInt4238, arg3)) {
			arg2.aClass159Array1 = this.aClass159Array1;
		} else if (arg4.aClass159Array1 == null || arg4.aClass159Array1.length < this.anInt4275) {
			local192 = this.anInt4275;
			arg2.aClass159Array1 = arg4.aClass159Array1 = new Class159[local192];
			for (local574 = 0; local574 < this.anInt4275; local574++) {
				arg2.aClass159Array1[local574] = this.aClass159Array1[local574].method3753();
			}
		} else {
			arg2.aClass159Array1 = arg4.aClass159Array1;
			for (local192 = 0; local192 < this.anInt4275; local192++) {
				arg2.aClass159Array1[local192].method3754(this.aClass159Array1[local192]);
			}
		}
		arg2.aClass192Array4 = this.aClass192Array4;
		if (this.aBoolean323) {
			arg2.aShort86 = this.aShort86;
			arg2.lb = this.lb;
			arg2.aShort89 = this.aShort89;
			arg2.aShort82 = this.aShort82;
			arg2.aShort85 = this.aShort85;
			arg2.aShort83 = this.aShort83;
			arg2.aBoolean323 = true;
			arg2.aShort87 = this.aShort87;
		} else {
			arg2.aBoolean323 = false;
		}
		arg2.aShortArray78 = this.aShortArray78;
		arg2.anIntArray418 = this.anIntArray418;
		arg2.aClass169Array4 = this.aClass169Array4;
		arg2.anIntArrayArray48 = this.anIntArrayArray48;
		arg2.anIntArrayArray49 = this.anIntArrayArray49;
		arg2.anIntArrayArray50 = this.anIntArrayArray50;
		arg2.aClass126Array1 = this.aClass126Array1;
		arg2.aShortArray81 = this.aShortArray81;
		arg2.anIntArray414 = this.anIntArray414;
		arg2.aShortArray72 = this.aShortArray72;
		return arg2;
	}

	@OriginalMember(owner = "client!jv", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4225; local7++) {
			if (arg0 != 128) {
				this.anIntArray417[local7] = this.anIntArray417[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray415[local7] = arg1 * this.anIntArray415[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray416[local7] = arg2 * this.anIntArray416[local7] >> 7;
			}
		}
		if (this.aClass11_4 != null) {
			this.aClass11_4.anInterface10_1 = null;
		}
		this.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "(I)V")
	@Override
	public void q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class125.anIntArray381[arg0];
		@Pc(13) int local13 = Class125.anIntArray382[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4225; local15++) {
			local33 = local9 * this.anIntArray416[local15] + this.anIntArray417[local15] * local13 >> 15;
			this.anIntArray416[local15] = local13 * this.anIntArray416[local15] - this.anIntArray417[local15] * local9 >> 15;
			this.anIntArray417[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt4221; local33++) {
			@Pc(87) int local87 = local13 * this.aShortArray75[local33] + this.aShortArray79[local33] * local9 >> 15;
			this.aShortArray79[local33] = (short) (this.aShortArray79[local33] * local13 - this.aShortArray75[local33] * local9 >> 15);
			this.aShortArray75[local33] = (short) local87;
		}
		if (this.aClass11_6 == null && this.aClass11_5 != null) {
			this.aClass11_5.anInterface10_1 = null;
		}
		if (this.aClass11_6 != null) {
			this.aClass11_6.anInterface10_1 = null;
		}
		if (this.aClass11_4 != null) {
			this.aClass11_4.anInterface10_1 = null;
		}
		this.aBoolean323 = false;
	}

	@OriginalMember(owner = "client!jv", name = "ga", descriptor = "()I")
	@Override
	public int ga() {
		return this.aShort88;
	}

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "()I")
	@Override
	public int e() {
		if (!this.aBoolean323) {
			this.method3686();
		}
		return this.aShort89;
	}

	@OriginalMember(owner = "client!jv", name = "M", descriptor = "()I")
	@Override
	public int M() {
		return this.aShort84;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method7697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class181_Sub3 local8 = (Class181_Sub3) arg2;
		@Pc(12) Class181_Sub3 local12 = this.aClass39_Sub3_20.aClass181_Sub3_3;
		@Pc(33) float local33 = local12.aFloat145 + local8.aFloat152 * local12.aFloat143 + local12.aFloat146 * local8.aFloat145 + local8.aFloat150 * local12.aFloat149;
		@Pc(54) float local54 = local12.aFloat152 + local12.aFloat144 * local8.aFloat150 + local8.aFloat145 * local12.aFloat142 + local12.aFloat151 * local8.aFloat152;
		Static493.aFloat220 = local8.aFloat144 * local12.aFloat151 + local12.aFloat142 * local8.aFloat149 + local12.aFloat144 * local8.aFloat148;
		Static507.aFloat49 = local8.aFloat151 * local12.aFloat143 + local8.aFloat143 * local12.aFloat146 + local8.aFloat153 * local12.aFloat149;
		Static371.aFloat181 = local12.aFloat142 * local8.aFloat143 + local8.aFloat151 * local12.aFloat151 + local12.aFloat144 * local8.aFloat153;
		Static167.aFloat59 = local8.aFloat147 * local12.aFloat149 + local12.aFloat146 * local8.aFloat146 + local12.aFloat143 * local8.aFloat142;
		Static83.aFloat29 = local12.aFloat149 * local8.aFloat148 + local8.aFloat149 * local12.aFloat146 + local8.aFloat144 * local12.aFloat143;
		Static446.aFloat212 = local8.aFloat144 * local12.aFloat153 + local8.aFloat149 * local12.aFloat147 + local12.aFloat148 * local8.aFloat148;
		Static425.aFloat179 = local12.aFloat147 * local8.aFloat143 + local8.aFloat151 * local12.aFloat153 + local8.aFloat153 * local12.aFloat148;
		@Pc(201) float local201 = local12.aFloat150 + local12.aFloat147 * local8.aFloat145 + local12.aFloat153 * local8.aFloat152 + local8.aFloat150 * local12.aFloat148;
		Static356.aFloat52 = local12.aFloat148 * local8.aFloat147 + local8.aFloat142 * local12.aFloat153 + local12.aFloat147 * local8.aFloat146;
		Static458.aFloat213 = local12.aFloat144 * local8.aFloat147 + local8.aFloat146 * local12.aFloat142 + local8.aFloat142 * local12.aFloat151;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass39_Sub3_20.anInt6751;
		@Pc(255) int local255 = this.aClass39_Sub3_20.anInt6726;
		if (!this.aBoolean323) {
			this.method3686();
		}
		Static545.anIntArray767[0] = this.aShort83;
		Static194.anIntArray216[0] = this.aShort87;
		Static9.anIntArray18[0] = this.aShort86;
		Static545.anIntArray767[1] = this.lb;
		Static194.anIntArray216[1] = this.aShort87;
		Static545.anIntArray767[2] = this.aShort83;
		Static9.anIntArray18[1] = this.aShort86;
		Static194.anIntArray216[2] = this.aShort85;
		Static545.anIntArray767[3] = this.lb;
		Static9.anIntArray18[2] = this.aShort86;
		Static194.anIntArray216[3] = this.aShort85;
		Static545.anIntArray767[4] = this.aShort83;
		Static9.anIntArray18[3] = this.aShort86;
		Static194.anIntArray216[4] = this.aShort87;
		Static9.anIntArray18[4] = this.aShort82;
		Static545.anIntArray767[5] = this.lb;
		Static194.anIntArray216[5] = this.aShort87;
		Static9.anIntArray18[5] = this.aShort82;
		Static545.anIntArray767[6] = this.aShort83;
		Static194.anIntArray216[6] = this.aShort85;
		Static545.anIntArray767[7] = this.lb;
		Static9.anIntArray18[6] = this.aShort82;
		Static194.anIntArray216[7] = this.aShort85;
		Static9.anIntArray18[7] = this.aShort82;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(390) float local390;
		@Pc(400) float local400;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static545.anIntArray767[local383];
			local395 = Static9.anIntArray18[local383];
			local400 = Static194.anIntArray216[local383];
			local414 = local390 * Static167.aFloat59 + Static507.aFloat49 * local400 + local395 * Static83.aFloat29 + local33;
			local428 = Static493.aFloat220 * local395 + local390 * Static458.aFloat213 + local400 * Static371.aFloat181 + local54;
			local442 = local201 + Static446.aFloat212 * local395 + Static425.aFloat179 * local400 + local390 * Static356.aFloat52;
			if (local442 >= (float) this.aClass39_Sub3_20.anInt6759) {
				@Pc(461) float local461 = (float) local251 * local414 / local442 + (float) this.aClass39_Sub3_20.anInt6734;
				@Pc(473) float local473 = (float) this.aClass39_Sub3_20.anInt6736 + local428 * (float) local255 / local442;
				if (local243 < local461) {
					local243 = local461;
				}
				if (local241 > local461) {
					local241 = local461;
				}
				local239 = true;
				if (local245 > local473) {
					local245 = local473;
				}
				if (local473 > local247) {
					local247 = local473;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt4221 > this.aClass39_Sub3_20.anIntArray516.length) {
				this.aClass39_Sub3_20.anIntArray515 = new int[this.anInt4221];
				this.aClass39_Sub3_20.anIntArray516 = new int[this.anInt4221];
			}
			@Pc(552) int[] local552 = this.aClass39_Sub3_20.anIntArray516;
			@Pc(556) int[] local556 = this.aClass39_Sub3_20.anIntArray515;
			@Pc(632) int local632;
			for (@Pc(558) int local558 = 0; local558 < this.anInt4225; local558++) {
				local400 = this.anIntArray415[local558];
				local390 = this.anIntArray417[local558];
				local395 = this.anIntArray416[local558];
				local442 = local201 + Static446.aFloat212 * local395 + local400 * Static425.aFloat179 + local390 * Static356.aFloat52;
				local414 = local33 + Static167.aFloat59 * local390 + Static507.aFloat49 * local400 + local395 * Static83.aFloat29;
				local428 = Static371.aFloat181 * local400 + local390 * Static458.aFloat213 + local395 * Static493.aFloat220 + local54;
				@Pc(639) int local639;
				@Pc(641) int local641;
				@Pc(650) int local650;
				if ((float) this.aClass39_Sub3_20.anInt6759 <= local442) {
					local632 = (int) ((float) local251 * local414 / local442 + (float) this.aClass39_Sub3_20.anInt6734);
					local639 = (int) ((float) this.aClass39_Sub3_20.anInt6736 + (float) local255 * local428 / local442);
					local641 = this.anIntArray418[local558];
					local650 = this.anIntArray418[local558 + 1];
					for (@Pc(709) int local709 = local641; local709 < local650; local709++) {
						@Pc(718) int local718 = this.aShortArray78[local709] - 1;
						if (local718 == -1) {
							break;
						}
						local552[local718] = local632;
						local556[local718] = local639;
					}
				} else {
					local632 = this.anIntArray418[local558];
					local639 = this.anIntArray418[local558 + 1];
					for (local641 = local632; local641 < local639; local641++) {
						local650 = this.aShortArray78[local641] - 1;
						if (local650 == -1) {
							break;
						}
						local552[this.aShortArray78[local641] - 1] = -999999;
					}
				}
			}
			for (local632 = 0; local632 < this.anInt4239; local632++) {
				if (local552[this.aShortArray82[local632]] != -999999 && local552[this.aShortArray77[local632]] != -999999 && local552[this.aShortArray73[local632]] != -999999 && this.method3688(local556[this.aShortArray73[local632]], local556[this.aShortArray82[local632]], arg1, local552[this.aShortArray82[local632]], arg0, local556[this.aShortArray77[local632]], local552[this.aShortArray73[local632]], local552[this.aShortArray77[local632]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!ol;B)V")
	private void method3692(@OriginalArg(0) Class181_Sub3 arg0) {
		@Pc(10) int local10;
		if (this.aClass192Array4 != null) {
			for (local10 = 0; local10 < this.aClass192Array4.length; local10++) {
				@Pc(17) Class192 local17 = this.aClass192Array4[local10];
				@Pc(19) Class192 local19 = local17;
				if (local17.aClass192_1 != null) {
					local19 = local17.aClass192_1;
				}
				local19.anInt5538 = (int) (arg0.aFloat149 * (float) this.anIntArray416[local17.anInt5532] + arg0.aFloat143 * (float) this.anIntArray415[local17.anInt5532] + (float) this.anIntArray417[local17.anInt5532] * arg0.aFloat146 + arg0.aFloat145);
				local19.anInt5544 = (int) (arg0.aFloat142 * (float) this.anIntArray417[local17.anInt5532] + arg0.aFloat151 * (float) this.anIntArray415[local17.anInt5532] + arg0.aFloat144 * (float) this.anIntArray416[local17.anInt5532] + arg0.aFloat152);
				local19.anInt5542 = (int) (arg0.aFloat150 + arg0.aFloat148 * (float) this.anIntArray416[local17.anInt5532] + (float) this.anIntArray417[local17.anInt5532] * arg0.aFloat147 + arg0.aFloat153 * (float) this.anIntArray415[local17.anInt5532]);
				local19.anInt5545 = (int) (arg0.aFloat145 + (float) this.anIntArray417[local17.anInt5539] * arg0.aFloat146 + (float) this.anIntArray415[local17.anInt5539] * arg0.aFloat143 + (float) this.anIntArray416[local17.anInt5539] * arg0.aFloat149);
				local19.anInt5534 = (int) ((float) this.anIntArray415[local17.anInt5539] * arg0.aFloat151 + arg0.aFloat142 * (float) this.anIntArray417[local17.anInt5539] + (float) this.anIntArray416[local17.anInt5539] * arg0.aFloat144 + arg0.aFloat152);
				local19.anInt5533 = (int) (arg0.aFloat150 + (float) this.anIntArray415[local17.anInt5539] * arg0.aFloat153 + (float) this.anIntArray417[local17.anInt5539] * arg0.aFloat147 + (float) this.anIntArray416[local17.anInt5539] * arg0.aFloat148);
				local19.anInt5537 = (int) ((float) this.anIntArray416[local17.anInt5543] * arg0.aFloat149 + (float) this.anIntArray415[local17.anInt5543] * arg0.aFloat143 + arg0.aFloat146 * (float) this.anIntArray417[local17.anInt5543] + arg0.aFloat145);
				local19.anInt5535 = (int) (arg0.aFloat152 + (float) this.anIntArray415[local17.anInt5543] * arg0.aFloat151 + arg0.aFloat142 * (float) this.anIntArray417[local17.anInt5543] + (float) this.anIntArray416[local17.anInt5543] * arg0.aFloat144);
				local19.anInt5531 = (int) (arg0.aFloat148 * (float) this.anIntArray416[local17.anInt5543] + arg0.aFloat147 * (float) this.anIntArray417[local17.anInt5543] + arg0.aFloat153 * (float) this.anIntArray415[local17.anInt5543] + arg0.aFloat150);
			}
		}
		if (this.aClass169Array4 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass169Array4.length; local10++) {
			@Pc(358) Class169 local358 = this.aClass169Array4[local10];
			@Pc(360) Class169 local360 = local358;
			if (local358.aClass169_2 != null) {
				local360 = local358.aClass169_2;
			}
			if (local358.aClass181_10 == null) {
				local358.aClass181_10 = arg0.method5993();
			} else {
				local358.aClass181_10.EA(arg0);
			}
			local360.anInt4676 = (int) ((float) this.anIntArray417[local358.anInt4667] * arg0.aFloat146 + (float) this.anIntArray415[local358.anInt4667] * arg0.aFloat143 + (float) this.anIntArray416[local358.anInt4667] * arg0.aFloat149 + arg0.aFloat145);
			local360.anInt4674 = (int) (arg0.aFloat152 + arg0.aFloat142 * (float) this.anIntArray417[local358.anInt4667] + arg0.aFloat151 * (float) this.anIntArray415[local358.anInt4667] + (float) this.anIntArray416[local358.anInt4667] * arg0.aFloat144);
			local360.anInt4670 = (int) (arg0.aFloat147 * (float) this.anIntArray417[local358.anInt4667] + arg0.aFloat153 * (float) this.anIntArray415[local358.anInt4667] + (float) this.anIntArray416[local358.anInt4667] * arg0.aFloat148 + arg0.aFloat150);
		}
	}

	@OriginalMember(owner = "client!jv", name = "wa", descriptor = "()I")
	@Override
	public int wa() {
		if (!this.aBoolean323) {
			this.method3686();
		}
		return this.aShort83;
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "()[Lclient!kv;")
	@Override
	public Class169[] method7702() {
		return this.aClass169Array4;
	}

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)V")
	private void method3693() {
		if (!this.aBoolean324) {
			return;
		}
		this.aBoolean324 = false;
		if (this.aClass192Array4 == null && this.aClass169Array4 == null && this.aClass126Array1 == null) {
			if (this.anIntArray417 != null && !Static57.method4377(this.anInt4238, this.anInt4229)) {
				if (this.aClass11_4 != null && this.aClass11_4.anInterface10_1 == null) {
					this.aBoolean324 = true;
				} else {
					if (!this.aBoolean323) {
						this.method3686();
					}
					this.anIntArray417 = null;
				}
			}
			if (this.anIntArray415 != null && !Static210.method3337(this.anInt4238, this.anInt4229)) {
				if (this.aClass11_4 != null && this.aClass11_4.anInterface10_1 == null) {
					this.aBoolean324 = true;
				} else {
					if (!this.aBoolean323) {
						this.method3686();
					}
					this.anIntArray415 = null;
				}
			}
			if (this.anIntArray416 != null && !Static86.method1677(this.anInt4238, this.anInt4229)) {
				if (this.aClass11_4 != null && this.aClass11_4.anInterface10_1 == null) {
					this.aBoolean324 = true;
				} else {
					if (!this.aBoolean323) {
						this.method3686();
					}
					this.anIntArray416 = null;
				}
			}
		}
		if (this.aShortArray78 != null && this.anIntArray417 == null && this.anIntArray415 == null && this.anIntArray416 == null) {
			this.anIntArray418 = null;
			this.aShortArray78 = null;
		}
		if (this.aByteArray77 != null && !Static443.method6744(this.anInt4229, this.anInt4238)) {
			if (this.aClass11_6 == null) {
				if (this.aClass11_5 != null && this.aClass11_5.anInterface10_1 == null) {
					this.aBoolean324 = true;
				} else {
					this.aShortArray75 = this.aShortArray80 = this.aShortArray79 = null;
					this.aByteArray77 = null;
				}
			} else if (this.aClass11_6.anInterface10_1 == null) {
				this.aBoolean324 = true;
			} else {
				this.aByteArray77 = null;
				this.aShortArray75 = this.aShortArray80 = this.aShortArray79 = null;
			}
		}
		if (this.aShortArray74 != null && !Static411.method6444(this.anInt4229, this.anInt4238)) {
			if (this.aClass11_5 != null && this.aClass11_5.anInterface10_1 == null) {
				this.aBoolean324 = true;
			} else {
				this.aShortArray74 = null;
			}
		}
		if (this.aByteArray78 != null && !Static281.method4444(this.anInt4238, this.anInt4229)) {
			if (this.aClass11_5 != null && this.aClass11_5.anInterface10_1 == null) {
				this.aBoolean324 = true;
			} else {
				this.aByteArray78 = null;
			}
		}
		if (this.aFloatArray22 != null && !Static312.method4820(this.anInt4229, this.anInt4238)) {
			if (this.aClass11_7 != null && this.aClass11_7.anInterface10_1 == null) {
				this.aBoolean324 = true;
			} else {
				this.aFloatArray22 = this.aFloatArray23 = null;
			}
		}
		if (this.aShortArray76 != null && !Static434.method7678(this.anInt4238, this.anInt4229)) {
			if (this.aClass11_5 != null && this.aClass11_5.anInterface10_1 == null) {
				this.aBoolean324 = true;
			} else {
				this.aShortArray76 = null;
			}
		}
		if (this.aShortArray82 != null && !Static44.method832(this.anInt4238, this.anInt4229)) {
			if (this.aClass267_1 != null && this.aClass267_1.anInterface5_5 == null || this.aClass11_5 != null && this.aClass11_5.anInterface10_1 == null) {
				this.aBoolean324 = true;
			} else {
				this.aShortArray82 = this.aShortArray77 = this.aShortArray73 = null;
			}
		}
		if (this.anIntArrayArray50 != null && !Static458.method6978(this.anInt4238, this.anInt4229)) {
			this.aShortArray72 = null;
			this.anIntArrayArray50 = null;
		}
		if (this.anIntArrayArray48 != null && !Static325.method4709(this.anInt4238, this.anInt4229)) {
			this.anIntArrayArray48 = null;
			this.aShortArray81 = null;
		}
		if (this.anIntArrayArray49 != null && !Static54.method978(this.anInt4229, this.anInt4238)) {
			this.anIntArrayArray49 = null;
		}
		if (this.anIntArray414 != null && (this.anInt4229 & 0x800) == 0 && (this.anInt4229 & 0x40000) == 0) {
			this.anIntArray414 = null;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "()V")
	@Override
	public void method7696() {
		if (this.anInt4221 <= 0 || this.anInt4246 <= 0) {
			return;
		}
		this.method3694(false);
		if ((this.aByte62 & 0x10) == 0 && this.aClass267_1.anInterface5_5 == null) {
			this.method3685(false);
		}
		this.method3693();
	}

	@OriginalMember(owner = "client!jv", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		if (this.aClass11_5 != null) {
			this.aClass11_5.anInterface10_1 = null;
		}
		this.aShort88 = (short) arg0;
		if (this.aClass11_6 != null) {
			this.aClass11_6.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BZ)V")
	private void method3694(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass11_5 != null && this.aClass11_5.anInterface10_1 == null;
		@Pc(27) boolean local27 = this.aClass11_6 != null && this.aClass11_6.anInterface10_1 == null;
		@Pc(38) boolean local38 = this.aClass11_4 != null && this.aClass11_4.anInterface10_1 == null;
		@Pc(49) boolean local49 = this.aClass11_7 != null && this.aClass11_7.anInterface10_1 == null;
		if (arg0) {
			local16 &= (this.aByte62 & 0x2) != 0;
			local38 &= (this.aByte62 & 0x1) != 0;
			local49 &= (this.aByte62 & 0x8) != 0;
			local27 &= (this.aByte62 & 0x4) != 0;
		}
		@Pc(106) byte local106 = 0;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		if (local38) {
			local106 = 12;
		}
		@Pc(129) byte local129 = 0;
		if (local16) {
			local110 = local106;
			local106 = (byte) (local106 + 4);
		}
		if (local27) {
			local112 = local106;
			local106 = (byte) (local106 + 12);
		}
		if (local49) {
			local129 = local106;
			local106 = (byte) (local106 + 8);
		}
		if (local106 == 0) {
			return;
		}
		if (this.anInt4221 * local106 > this.aClass39_Sub3_20.aClass2_Sub29_Sub1_2.aByteArray96.length) {
			this.aClass39_Sub3_20.aClass2_Sub29_Sub1_2 = new Class2_Sub29_Sub1(local106 * (this.anInt4221 + 100));
		} else {
			this.aClass39_Sub3_20.aClass2_Sub29_Sub1_2.anInt6132 = 0;
		}
		@Pc(192) Class2_Sub29_Sub1 local192 = this.aClass39_Sub3_20.aClass2_Sub29_Sub1_2;
		@Pc(200) int local200;
		@Pc(209) int local209;
		@Pc(237) int local237;
		@Pc(246) int local246;
		if (local38) {
			@Pc(216) int local216;
			@Pc(223) int local223;
			@Pc(228) int local228;
			@Pc(235) int local235;
			if (this.aClass39_Sub3_20.aBoolean485) {
				for (local200 = 0; local200 < this.anInt4225; local200++) {
					local209 = Stream.floatToRawIntBits((float) this.anIntArray417[local200]);
					local216 = Stream.floatToRawIntBits((float) this.anIntArray415[local200]);
					local223 = Stream.floatToRawIntBits((float) this.anIntArray416[local200]);
					local228 = this.anIntArray418[local200];
					local235 = this.anIntArray418[local200 + 1];
					for (local237 = local228; local237 < local235; local237++) {
						local246 = this.aShortArray78[local237] - 1;
						if (local246 == -1) {
							break;
						}
						local192.anInt6132 = local106 * local246;
						local192.method5185(local209);
						local192.method5185(local216);
						local192.method5185(local223);
					}
				}
			} else {
				for (local200 = 0; local200 < this.anInt4225; local200++) {
					local209 = Stream.floatToRawIntBits((float) this.anIntArray417[local200]);
					local216 = Stream.floatToRawIntBits((float) this.anIntArray415[local200]);
					local223 = Stream.floatToRawIntBits((float) this.anIntArray416[local200]);
					local228 = this.anIntArray418[local200];
					local235 = this.anIntArray418[local200 + 1];
					for (local237 = local228; local237 < local235; local237++) {
						local246 = this.aShortArray78[local237] - 1;
						if (local246 == -1) {
							break;
						}
						local192.anInt6132 = local106 * local246;
						local192.method5206(local209);
						local192.method5206(local216);
						local192.method5206(local223);
					}
				}
			}
		}
		@Pc(475) float local475;
		@Pc(378) short[] local378;
		@Pc(374) short[] local374;
		@Pc(382) short[] local382;
		@Pc(386) byte[] local386;
		@Pc(536) float local536;
		if (local16) {
			if (this.aClass11_6 == null) {
				if (this.aClass280_1 == null) {
					local374 = this.aShortArray80;
					local378 = this.aShortArray75;
					local386 = this.aByteArray77;
					local382 = this.aShortArray79;
				} else {
					local374 = this.aClass280_1.aShortArray109;
					local378 = this.aClass280_1.aShortArray108;
					local382 = this.aClass280_1.aShortArray107;
					local386 = this.aClass280_1.aByteArray110;
				}
				@Pc(406) float local406 = this.aClass39_Sub3_20.aFloatArray53[0];
				@Pc(412) float local412 = this.aClass39_Sub3_20.aFloatArray53[1];
				@Pc(418) float local418 = this.aClass39_Sub3_20.aFloatArray53[2];
				@Pc(422) float local422 = this.aClass39_Sub3_20.aFloat159;
				@Pc(432) float local432 = this.aClass39_Sub3_20.aFloat167 * 768.0F / (float) this.aShort88;
				@Pc(442) float local442 = this.aClass39_Sub3_20.aFloat168 * 768.0F / (float) this.aShort88;
				for (@Pc(444) int local444 = 0; local444 < this.anInt4239; local444++) {
					@Pc(464) int local464 = this.method3697(this.aShort84, this.aShortArray74[local444], this.aShortArray76[local444], this.aByteArray78[local444]);
					local475 = this.aClass39_Sub3_20.aFloat160 * (float) (local464 >> 16 & 0xFF);
					@Pc(484) float local484 = this.aClass39_Sub3_20.aFloat173 * (float) (local464 >>> 24);
					@Pc(489) short local489 = this.aShortArray82[local444];
					@Pc(500) float local500 = this.aClass39_Sub3_20.aFloat174 * (float) (local464 >> 8 & 0xFF);
					@Pc(505) short local505 = (short) local386[local489];
					if (local505 == 0) {
						local536 = (local418 * (float) local382[local489] + local412 * (float) local374[local489] + local406 * (float) local378[local489]) * 0.0026041667F;
					} else {
						local536 = ((float) local382[local489] * local418 + local406 * (float) local378[local489] + local412 * (float) local374[local489]) / (float) (local505 * 256);
					}
					@Pc(573) float local573 = local422 + local536 * (local536 < 0.0F ? local442 : local432);
					@Pc(578) int local578 = (int) (local484 * local573);
					if (local578 < 0) {
						local578 = 0;
					} else if (local578 > 255) {
						local578 = 255;
					}
					@Pc(599) int local599 = (int) (local475 * local573);
					@Pc(604) int local604 = (int) (local500 * local573);
					if (local599 < 0) {
						local599 = 0;
					} else if (local599 > 255) {
						local599 = 255;
					}
					if (local604 < 0) {
						local604 = 0;
					} else if (local604 > 255) {
						local604 = 255;
					}
					local192.anInt6132 = local489 * local106 + local110;
					local192.method5172(local578);
					local192.method5172(local599);
					local192.method5172(local604);
					local192.method5172(255 - (this.aByteArray78[local444] & 0xFF));
					local489 = this.aShortArray77[local444];
					local505 = local386[local489];
					if (local505 == 0) {
						local536 = (local412 * (float) local374[local489] + local406 * (float) local378[local489] + local418 * (float) local382[local489]) * 0.0026041667F;
					} else {
						local536 = (local406 * (float) local378[local489] + (float) local374[local489] * local412 + (float) local382[local489] * local418) / (float) (local505 * 256);
					}
					local573 = (local536 < 0.0F ? local442 : local432) * local536 + local422;
					local578 = (int) (local484 * local573);
					local599 = (int) (local573 * local475);
					if (local578 < 0) {
						local578 = 0;
					} else if (local578 > 255) {
						local578 = 255;
					}
					if (local599 < 0) {
						local599 = 0;
					} else if (local599 > 255) {
						local599 = 255;
					}
					local604 = (int) (local500 * local573);
					if (local604 < 0) {
						local604 = 0;
					} else if (local604 > 255) {
						local604 = 255;
					}
					local192.anInt6132 = local106 * local489 + local110;
					local192.method5172(local578);
					local192.method5172(local599);
					local192.method5172(local604);
					local192.method5172(255 - (this.aByteArray78[local444] & 0xFF));
					local489 = this.aShortArray73[local444];
					local505 = local386[local489];
					if (local505 == 0) {
						local536 = ((float) local374[local489] * local412 + local406 * (float) local378[local489] + (float) local382[local489] * local418) * 0.0026041667F;
					} else {
						local536 = ((float) local382[local489] * local418 + local412 * (float) local374[local489] + local406 * (float) local378[local489]) / (float) (local505 * 256);
					}
					local573 = (local536 < 0.0F ? local442 : local432) * local536 + local422;
					local578 = (int) (local484 * local573);
					if (local578 < 0) {
						local578 = 0;
					} else if (local578 > 255) {
						local578 = 255;
					}
					local599 = (int) (local573 * local475);
					local604 = (int) (local573 * local500);
					if (local599 < 0) {
						local599 = 0;
					} else if (local599 > 255) {
						local599 = 255;
					}
					local192.anInt6132 = local489 * local106 + local110;
					if (local604 < 0) {
						local604 = 0;
					} else if (local604 > 255) {
						local604 = 255;
					}
					local192.method5172(local578);
					local192.method5172(local599);
					local192.method5172(local604);
					local192.method5172(255 - (this.aByteArray78[local444] & 0xFF));
				}
			} else {
				for (local200 = 0; local200 < this.anInt4239; local200++) {
					local209 = this.method3697(this.aShort84, this.aShortArray74[local200], this.aShortArray76[local200], this.aByteArray78[local200]);
					local192.anInt6132 = local110 + local106 * this.aShortArray82[local200];
					local192.method5185(local209);
					local192.anInt6132 = local106 * this.aShortArray77[local200] + local110;
					local192.method5185(local209);
					local192.anInt6132 = this.aShortArray73[local200] * local106 + local110;
					local192.method5185(local209);
				}
			}
		}
		if (local27) {
			if (this.aClass280_1 == null) {
				local382 = this.aShortArray79;
				local386 = this.aByteArray77;
				local374 = this.aShortArray80;
				local378 = this.aShortArray75;
			} else {
				local382 = this.aClass280_1.aShortArray107;
				local374 = this.aClass280_1.aShortArray109;
				local386 = this.aClass280_1.aByteArray110;
				local378 = this.aClass280_1.aShortArray108;
			}
			@Pc(1109) float local1109 = 3.0F / (float) this.aShort88;
			local536 = 3.0F / (float) (this.aShort88 + this.aShort88 / 2);
			local192.anInt6132 = local112;
			if (this.aClass39_Sub3_20.aBoolean485) {
				for (local237 = 0; local237 < this.anInt4221; local237++) {
					local246 = local386[local237] & 0xFF;
					if (local246 == 0) {
						local192.method3899((float) local378[local237] * local536);
						local192.method3899(local536 * (float) local374[local237]);
						local192.method3899(local536 * (float) local382[local237]);
					} else {
						local475 = local1109 / (float) local246;
						local192.method3899(local475 * (float) local378[local237]);
						local192.method3899(local475 * (float) local374[local237]);
						local192.method3899((float) local382[local237] * local475);
					}
					local192.anInt6132 += local106 - 12;
				}
			} else {
				for (local237 = 0; local237 < this.anInt4221; local237++) {
					local246 = local386[local237] & 0xFF;
					if (local246 == 0) {
						local192.method3902((float) local378[local237] * local536);
						local192.method3902((float) local374[local237] * local536);
						local192.method3902((float) local382[local237] * local536);
					} else {
						local475 = local1109 / (float) local246;
						local192.method3902(local475 * (float) local378[local237]);
						local192.method3902(local475 * (float) local374[local237]);
						local192.method3902(local475 * (float) local382[local237]);
					}
					local192.anInt6132 += local106 - 12;
				}
			}
		}
		if (local49) {
			local192.anInt6132 = local129;
			if (this.aClass39_Sub3_20.aBoolean485) {
				for (local200 = 0; local200 < this.anInt4221; local200++) {
					local192.method3899(this.aFloatArray22[local200]);
					local192.method3899(this.aFloatArray23[local200]);
					local192.anInt6132 += local106 - 8;
				}
			} else {
				for (local200 = 0; local200 < this.anInt4221; local200++) {
					local192.method3902(this.aFloatArray22[local200]);
					local192.method3902(this.aFloatArray23[local200]);
					local192.anInt6132 += local106 - 8;
				}
			}
		}
		local192.anInt6132 = local106 * this.anInt4221;
		@Pc(1413) Interface10 local1413;
		if (arg0) {
			if (this.anInterface10_3 == null) {
				this.anInterface10_3 = this.aClass39_Sub3_20.method5689(local192.anInt6132, local192.aByteArray96, local106, true);
			} else {
				this.anInterface10_3.method3585(local192.anInt6132, local192.aByteArray96, local106);
			}
			local1413 = this.anInterface10_3;
			this.aByte62 = 0;
		} else {
			local1413 = this.aClass39_Sub3_20.method5689(local192.anInt6132, local192.aByteArray96, local106, false);
			this.aBoolean324 = true;
		}
		if (local38) {
			this.aClass11_4.aByte5 = 0;
			this.aClass11_4.anInterface10_1 = local1413;
		}
		if (local49) {
			this.aClass11_7.anInterface10_1 = local1413;
			this.aClass11_7.aByte5 = local129;
		}
		if (local16) {
			this.aClass11_5.anInterface10_1 = local1413;
			this.aClass11_5.aByte5 = local110;
		}
		if (local27) {
			this.aClass11_6.anInterface10_1 = local1413;
			this.aClass11_6.aByte5 = local112;
		}
	}

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "()Z")
	@Override
	public boolean method7707() {
		if (this.aShortArray76 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray76.length; local12++) {
			if (this.aShortArray76[local12] != -1 && !this.aClass39_Sub3_20.anInterface12_15.method2572(this.aShortArray76[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jv", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class125.anIntArray381[arg0];
		@Pc(13) int local13 = Class125.anIntArray382[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4225; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray415[local15] - this.anIntArray416[local15] * local9 >> 15;
			this.anIntArray416[local15] = this.anIntArray415[local15] * local9 + local13 * this.anIntArray416[local15] >> 15;
			this.anIntArray415[local15] = local34;
		}
		this.aBoolean323 = false;
		if (this.aClass11_4 != null) {
			this.aClass11_4.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!jv", name = "BA", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			Static284.anInt9393 = 0;
			Static224.anInt4040 = 0;
			local31 = 0;
			Static310.anInt5645 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray48.length) {
					local51 = this.anIntArrayArray48[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray81 == null || (arg6 & this.aShortArray81[local59]) != 0) {
							Static310.anInt5645 += this.anIntArray417[local59];
							Static224.anInt4040 += this.anIntArray415[local59];
							local31++;
							Static284.anInt9393 += this.anIntArray416[local59];
						}
					}
				}
			}
			if (local31 <= 0) {
				Static224.anInt4040 = arg3;
				Static284.anInt9393 = arg4;
				Static310.anInt5645 = arg2;
			} else {
				Static224.anInt4040 = Static224.anInt4040 / local31 + arg3;
				Static284.anInt9393 = arg4 + Static284.anInt9393 / local31;
				Static310.anInt5645 = arg2 + Static310.anInt5645 / local31;
				Static89.aBoolean130 = true;
			}
			return;
		}
		@Pc(249) int[] local249;
		@Pc(251) int local251;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg4 * arg7[2] + arg3 * arg7[1] + arg7[0] * arg2 + 16384 >> 15;
				local35 = arg2 * arg7[3] + arg3 * arg7[4] + arg4 * arg7[5] + 16384 >> 15;
				local41 = arg7[7] * arg3 + arg7[6] * arg2 + arg4 * arg7[8] + 16384 >> 15;
				arg2 = local31;
				arg4 = local41;
				arg3 = local35;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray48.length) {
					local249 = this.anIntArrayArray48[local35];
					for (local251 = 0; local251 < local249.length; local251++) {
						local53 = local249[local251];
						if (this.aShortArray81 == null || (arg6 & this.aShortArray81[local53]) != 0) {
							this.anIntArray417[local53] += arg2;
							this.anIntArray415[local53] += arg3;
							this.anIntArray416[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(376) int local376;
		@Pc(399) int local399;
		@Pc(421) int local421;
		@Pc(456) int local456;
		@Pc(460) int local460;
		@Pc(464) int local464;
		@Pc(468) int local468;
		@Pc(476) int local476;
		@Pc(484) int local484;
		@Pc(640) int local640;
		@Pc(665) int local665;
		@Pc(670) int local670;
		@Pc(679) int local679;
		@Pc(684) int local684;
		@Pc(688) int local688;
		@Pc(692) int local692;
		@Pc(694) int local694;
		@Pc(823) int[] local823;
		@Pc(825) int local825;
		@Pc(829) int local829;
		@Pc(833) int local833;
		@Pc(835) int local835;
		@Pc(965) int local965;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray48.length) {
						local249 = this.anIntArrayArray48[local35];
						for (local251 = 0; local251 < local249.length; local251++) {
							local53 = local249[local251];
							if (this.aShortArray81 == null || (this.aShortArray81[local53] & arg6) != 0) {
								this.anIntArray417[local53] -= Static310.anInt5645;
								this.anIntArray415[local53] -= Static224.anInt4040;
								this.anIntArray416[local53] -= Static284.anInt9393;
								if (arg4 != 0) {
									local59 = Class125.anIntArray381[arg4];
									local376 = Class125.anIntArray382[arg4];
									local399 = this.anIntArray417[local53] * local376 + this.anIntArray415[local53] * local59 + 32767 >> 15;
									this.anIntArray415[local53] = this.anIntArray415[local53] * local376 + 32767 - this.anIntArray417[local53] * local59 >> 15;
									this.anIntArray417[local53] = local399;
								}
								if (arg2 != 0) {
									local59 = Class125.anIntArray381[arg2];
									local376 = Class125.anIntArray382[arg2];
									local399 = local376 * this.anIntArray415[local53] + 32767 - this.anIntArray416[local53] * local59 >> 15;
									this.anIntArray416[local53] = local376 * this.anIntArray416[local53] + this.anIntArray415[local53] * local59 + 32767 >> 15;
									this.anIntArray415[local53] = local399;
								}
								if (arg3 != 0) {
									local59 = Class125.anIntArray381[arg3];
									local376 = Class125.anIntArray382[arg3];
									local399 = this.anIntArray417[local53] * local376 + local59 * this.anIntArray416[local53] + 32767 >> 15;
									this.anIntArray416[local53] = local376 * this.anIntArray416[local53] + 32767 - local59 * this.anIntArray417[local53] >> 15;
									this.anIntArray417[local53] = local399;
								}
								this.anIntArray417[local53] += Static310.anInt5645;
								this.anIntArray415[local53] += Static224.anInt4040;
								this.anIntArray416[local53] += Static284.anInt9393;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray48.length) {
							local51 = this.anIntArrayArray48[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray81 == null || (this.aShortArray81[local59] & arg6) != 0) {
									local376 = this.anIntArray418[local59];
									local399 = this.anIntArray418[local59 + 1];
									for (local421 = local376; local421 < local399; local421++) {
										local456 = this.aShortArray78[local421] - 1;
										if (local456 == -1) {
											break;
										}
										if (arg4 != 0) {
											local460 = Class125.anIntArray381[arg4];
											local464 = Class125.anIntArray382[arg4];
											local468 = this.aShortArray75[local456] * local464 + local460 * this.aShortArray80[local456] + 32767 >> 15;
											this.aShortArray80[local456] = (short) (local464 * this.aShortArray80[local456] + 32767 - this.aShortArray75[local456] * local460 >> 15);
											this.aShortArray75[local456] = (short) local468;
										}
										if (arg2 != 0) {
											local460 = Class125.anIntArray381[arg2];
											local464 = Class125.anIntArray382[arg2];
											local468 = this.aShortArray80[local456] * local464 + 32767 - local460 * this.aShortArray79[local456] >> 15;
											this.aShortArray79[local456] = (short) (local460 * this.aShortArray80[local456] + this.aShortArray79[local456] * local464 + 32767 >> 15);
											this.aShortArray80[local456] = (short) local468;
										}
										if (arg3 != 0) {
											local460 = Class125.anIntArray381[arg3];
											local464 = Class125.anIntArray382[arg3];
											local468 = this.aShortArray75[local456] * local464 + local460 * this.aShortArray79[local456] + 32767 >> 15;
											this.aShortArray79[local456] = (short) (this.aShortArray79[local456] * local464 + 32767 - this.aShortArray75[local456] * local460 >> 15);
											this.aShortArray75[local456] = (short) local468;
										}
									}
								}
							}
						}
					}
					if (this.aClass11_6 == null && this.aClass11_5 != null) {
						this.aClass11_5.anInterface10_1 = null;
					}
					if (this.aClass11_6 != null) {
						this.aClass11_6.anInterface10_1 = null;
					}
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local251 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static89.aBoolean130) {
					local376 = arg7[0] * Static310.anInt5645 + arg7[3] * Static224.anInt4040 + arg7[6] * Static284.anInt9393 + 16384 >> 15;
					local399 = Static224.anInt4040 * arg7[4] + arg7[1] * Static310.anInt5645 + Static284.anInt9393 * arg7[7] + 16384 >> 15;
					local421 = Static310.anInt5645 * arg7[2] + Static224.anInt4040 * arg7[5] + Static284.anInt9393 * arg7[8] + 16384 >> 15;
					local376 += local251;
					local399 += local53;
					Static224.anInt4040 = local399;
					Static310.anInt5645 = local376;
					local421 += local59;
					Static284.anInt9393 = local421;
					Static89.aBoolean130 = false;
				}
				@Pc(444) int[] local444 = new int[9];
				local399 = Class125.anIntArray382[arg2];
				local421 = Class125.anIntArray381[arg2];
				local456 = Class125.anIntArray382[arg3];
				local460 = Class125.anIntArray381[arg3];
				local464 = Class125.anIntArray382[arg4];
				local468 = Class125.anIntArray381[arg4];
				local476 = local464 * local421 + 16384 >> 15;
				local484 = local468 * local421 + 16384 >> 15;
				local444[0] = local484 * local460 + local456 * local464 + 16384 >> 15;
				local444[5] = -local421;
				local444[6] = local456 * local484 + local464 * -local460 + 16384 >> 15;
				local444[7] = local460 * local468 + local476 * local456 + 16384 >> 15;
				local444[4] = local464 * local399 + 16384 >> 15;
				local444[1] = -local456 * local468 + local460 * local476 + 16384 >> 15;
				local444[8] = local399 * local456 + 16384 >> 15;
				local444[3] = local399 * local468 + 16384 >> 15;
				local444[2] = local460 * local399 + 16384 >> 15;
				@Pc(613) int local613 = -Static224.anInt4040 * local444[1] + local444[0] * -Static310.anInt5645 + local444[2] * -Static284.anInt9393 + 16384 >> 15;
				local640 = local444[3] * -Static310.anInt5645 + -Static224.anInt4040 * local444[4] + -Static284.anInt9393 * local444[5] + 16384 >> 15;
				local665 = local444[8] * -Static284.anInt9393 + local444[7] * -Static224.anInt4040 + -Static310.anInt5645 * local444[6] + 16384 >> 15;
				local670 = local613 + Static310.anInt5645;
				@Pc(674) int local674 = Static224.anInt4040 + local640;
				local679 = local665 + Static284.anInt9393;
				@Pc(682) int[] local682 = new int[9];
				for (local684 = 0; local684 < 3; local684++) {
					for (local688 = 0; local688 < 3; local688++) {
						local692 = 0;
						for (local694 = 0; local694 < 3; local694++) {
							local692 += local444[local694 + local684 * 3] * arg7[local688 * 3 + local694];
						}
						local682[local688 + local684 * 3] = local692 + 16384 >> 15;
					}
				}
				local688 = local59 * local444[2] + local53 * local444[1] + local444[0] * local251 + 16384 >> 15;
				local692 = local251 * local444[3] + local53 * local444[4] + local444[5] * local59 + 16384 >> 15;
				local694 = local444[6] * local251 + local53 * local444[7] + local59 * local444[8] + 16384 >> 15;
				local688 += local670;
				local692 += local674;
				local694 += local679;
				local823 = new int[9];
				for (local825 = 0; local825 < 3; local825++) {
					for (local829 = 0; local829 < 3; local829++) {
						local833 = 0;
						for (local835 = 0; local835 < 3; local835++) {
							local833 += arg7[local825 * 3 + local835] * local682[local829 + local835 * 3];
						}
						local823[local829 + local825 * 3] = local833 + 16384 >> 15;
					}
				}
				local829 = arg7[1] * local692 + arg7[0] * local688 + arg7[2] * local694 + 16384 >> 15;
				local833 = arg7[5] * local694 + arg7[3] * local688 + local692 * arg7[4] + 16384 >> 15;
				local829 += local31;
				local833 += local35;
				local835 = arg7[7] * local692 + local688 * arg7[6] + local694 * arg7[8] + 16384 >> 15;
				local835 += local41;
				for (local965 = 0; local965 < local8; local965++) {
					@Pc(971) int local971 = arg1[local965];
					if (this.anIntArrayArray48.length > local971) {
						@Pc(985) int[] local985 = this.anIntArrayArray48[local971];
						for (@Pc(987) int local987 = 0; local987 < local985.length; local987++) {
							@Pc(993) int local993 = local985[local987];
							if (this.aShortArray81 == null || (this.aShortArray81[local993] & arg6) != 0) {
								@Pc(1038) int local1038 = this.anIntArray417[local993] * local823[0] + this.anIntArray415[local993] * local823[1] + this.anIntArray416[local993] * local823[2] + 16384 >> 15;
								@Pc(1069) int local1069 = local823[5] * this.anIntArray416[local993] + local823[4] * this.anIntArray415[local993] + local823[3] * this.anIntArray417[local993] + 16384 >> 15;
								@Pc(1073) int local1073 = local1038 + local829;
								@Pc(1105) int local1105 = local823[7] * this.anIntArray415[local993] + local823[6] * this.anIntArray417[local993] + local823[8] * this.anIntArray416[local993] + 16384 >> 15;
								@Pc(1109) int local1109 = local1069 + local833;
								@Pc(1113) int local1113 = local1105 + local835;
								this.anIntArray417[local993] = local1073;
								this.anIntArray415[local993] = local1109;
								this.anIntArray416[local993] = local1113;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2566) Class126 local2566;
			@Pc(2571) Class159 local2571;
			if (arg0 == 5) {
				if (this.anIntArrayArray50 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray50.length) {
							local249 = this.anIntArrayArray50[local35];
							for (local251 = 0; local251 < local249.length; local251++) {
								local53 = local249[local251];
								if (this.aShortArray72 == null || (arg6 & this.aShortArray72[local53]) != 0) {
									local59 = (this.aByteArray78[local53] & 0xFF) + arg2 * 8;
									if (local59 < 0) {
										local59 = 0;
									} else if (local59 > 255) {
										local59 = 255;
									}
									this.aByteArray78[local53] = (byte) local59;
									if (this.aClass11_5 != null) {
										this.aClass11_5.anInterface10_1 = null;
									}
								}
							}
						}
					}
					if (this.aClass126Array1 != null) {
						for (local35 = 0; local35 < this.anInt4275; local35++) {
							local2566 = this.aClass126Array1[local35];
							local2571 = this.aClass159Array1[local35];
							local2571.anInt4335 = local2571.anInt4335 & 0xFFFFFF | 255 - (this.aByteArray78[local2566.anInt3552] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2822) Class159 local2822;
				if (arg0 == 8) {
					if (this.anIntArrayArray49 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray49.length > local35) {
								local249 = this.anIntArrayArray49[local35];
								for (local251 = 0; local251 < local249.length; local251++) {
									local2822 = this.aClass159Array1[local249[local251]];
									local2822.anInt4331 += arg2;
									local2822.anInt4337 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray49 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray49.length) {
								local249 = this.anIntArrayArray49[local35];
								for (local251 = 0; local251 < local249.length; local251++) {
									local2822 = this.aClass159Array1[local249[local251]];
									local2822.anInt4333 = local2822.anInt4333 * arg2 >> 7;
									local2822.anInt4338 = local2822.anInt4338 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray49 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray49.length > local35) {
							local249 = this.anIntArrayArray49[local35];
							for (local251 = 0; local251 < local249.length; local251++) {
								local2822 = this.aClass159Array1[local249[local251]];
								local2822.anInt4334 = arg2 + local2822.anInt4334 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray50 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray50.length > local35) {
						local249 = this.anIntArrayArray50[local35];
						for (local251 = 0; local251 < local249.length; local251++) {
							local53 = local249[local251];
							if (this.aShortArray72 == null || (arg6 & this.aShortArray72[local53]) != 0) {
								local59 = this.aShortArray74[local53] & 0xFFFF;
								local376 = local59 >> 10 & 0x3F;
								local399 = local59 >> 7 & 0x7;
								local421 = local59 & 0x7F;
								local399 += arg3 / 4;
								@Pc(2673) int local2673 = local376 + arg2 & 0x3F;
								local421 += arg4;
								if (local399 < 0) {
									local399 = 0;
								} else if (local399 > 7) {
									local399 = 7;
								}
								if (local421 < 0) {
									local421 = 0;
								} else if (local421 > 127) {
									local421 = 127;
								}
								this.aShortArray74[local53] = (short) (local421 | local399 << 7 | local2673 << 10);
								if (this.aClass11_5 != null) {
									this.aClass11_5.anInterface10_1 = null;
								}
							}
						}
					}
				}
				if (this.aClass126Array1 != null) {
					for (local35 = 0; local35 < this.anInt4275; local35++) {
						local2566 = this.aClass126Array1[local35];
						local2571 = this.aClass159Array1[local35];
						local2571.anInt4335 = Static445.anIntArray614[this.aShortArray74[local2566.anInt3552] & 0xFFFF] & 0xFFFFFF | local2571.anInt4335 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray48.length > local35) {
					local249 = this.anIntArrayArray48[local35];
					for (local251 = 0; local251 < local249.length; local251++) {
						local53 = local249[local251];
						if (this.aShortArray81 == null || (this.aShortArray81[local53] & arg6) != 0) {
							this.anIntArray417[local53] -= Static310.anInt5645;
							this.anIntArray415[local53] -= Static224.anInt4040;
							this.anIntArray416[local53] -= Static284.anInt9393;
							this.anIntArray417[local53] = arg2 * this.anIntArray417[local53] >> 7;
							this.anIntArray415[local53] = arg3 * this.anIntArray415[local53] >> 7;
							this.anIntArray416[local53] = this.anIntArray416[local53] * arg4 >> 7;
							this.anIntArray417[local53] += Static310.anInt5645;
							this.anIntArray415[local53] += Static224.anInt4040;
							this.anIntArray416[local53] += Static284.anInt9393;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local251 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static89.aBoolean130) {
				local376 = arg7[0] * Static310.anInt5645 + arg7[3] * Static224.anInt4040 + arg7[6] * Static284.anInt9393 + 16384 >> 15;
				local399 = arg7[7] * Static284.anInt9393 + arg7[1] * Static310.anInt5645 + Static224.anInt4040 * arg7[4] + 16384 >> 15;
				local376 += local251;
				local399 += local53;
				local421 = Static310.anInt5645 * arg7[2] + arg7[5] * Static224.anInt4040 + Static284.anInt9393 * arg7[8] + 16384 >> 15;
				local421 += local59;
				Static224.anInt4040 = local399;
				Static310.anInt5645 = local376;
				Static89.aBoolean130 = false;
				Static284.anInt9393 = local421;
			}
			local376 = arg2 << 15 >> 7;
			local399 = arg3 << 15 >> 7;
			local421 = arg4 << 15 >> 7;
			local456 = -Static310.anInt5645 * local376 + 16384 >> 15;
			local460 = local399 * -Static224.anInt4040 + 16384 >> 15;
			local464 = -Static284.anInt9393 * local421 + 16384 >> 15;
			local468 = local456 + Static310.anInt5645;
			local476 = Static224.anInt4040 + local460;
			local484 = local464 + Static284.anInt9393;
			@Pc(2013) int[] local2013 = new int[] { arg7[0] * local376 + 16384 >> 15, local376 * arg7[3] + 16384 >> 15, arg7[6] * local376 + 16384 >> 15, local399 * arg7[1] + 16384 >> 15, arg7[4] * local399 + 16384 >> 15, local399 * arg7[7] + 16384 >> 15, arg7[2] * local421 + 16384 >> 15, arg7[5] * local421 + 16384 >> 15, arg7[8] * local421 + 16384 >> 15 };
			local640 = local251 * local376 + 16384 >> 15;
			local665 = local399 * local53 + 16384 >> 15;
			local670 = local59 * local421 + 16384 >> 15;
			@Pc(2149) int local2149 = local640 + local468;
			@Pc(2153) int local2153 = local665 + local476;
			@Pc(2157) int local2157 = local670 + local484;
			@Pc(2160) int[] local2160 = new int[9];
			@Pc(2166) int local2166;
			for (local679 = 0; local679 < 3; local679++) {
				for (local2166 = 0; local2166 < 3; local2166++) {
					local684 = 0;
					for (local688 = 0; local688 < 3; local688++) {
						local684 += arg7[local688 + local679 * 3] * local2013[local2166 + local688 * 3];
					}
					local2160[local2166 + local679 * 3] = local684 + 16384 >> 15;
				}
			}
			local2166 = local2153 * arg7[1] + local2149 * arg7[0] + arg7[2] * local2157 + 16384 >> 15;
			local684 = arg7[5] * local2157 + arg7[3] * local2149 + arg7[4] * local2153 + 16384 >> 15;
			local2166 += local31;
			local684 += local35;
			local688 = arg7[8] * local2157 + arg7[6] * local2149 + arg7[7] * local2153 + 16384 >> 15;
			local688 += local41;
			for (local692 = 0; local692 < local8; local692++) {
				local694 = arg1[local692];
				if (local694 < this.anIntArrayArray48.length) {
					local823 = this.anIntArrayArray48[local694];
					for (local825 = 0; local825 < local823.length; local825++) {
						local829 = local823[local825];
						if (this.aShortArray81 == null || (arg6 & this.aShortArray81[local829]) != 0) {
							local833 = local2160[2] * this.anIntArray416[local829] + this.anIntArray415[local829] * local2160[1] + local2160[0] * this.anIntArray417[local829] + 16384 >> 15;
							local835 = this.anIntArray416[local829] * local2160[5] + this.anIntArray415[local829] * local2160[4] + this.anIntArray417[local829] * local2160[3] + 16384 >> 15;
							@Pc(2398) int local2398 = local835 + local684;
							local965 = local2160[7] * this.anIntArray415[local829] + local2160[6] * this.anIntArray417[local829] + local2160[8] * this.anIntArray416[local829] + 16384 >> 15;
							@Pc(2433) int local2433 = local833 + local2166;
							@Pc(2437) int local2437 = local965 + local688;
							this.anIntArray417[local829] = local2433;
							this.anIntArray415[local829] = local2398;
							this.anIntArray416[local829] = local2437;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(FIILclient!bt;JIIBFI)S")
	private short method3695(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class29 arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray418[arg8];
		@Pc(17) int local17 = this.anIntArray418[arg8 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray78[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg4 == Static211.aLongArray12[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray78[local19] = (short) (this.anInt4221 + 1);
		Static211.aLongArray12[local19] = arg4;
		this.aShortArray75[this.anInt4221] = (short) arg1;
		this.aShortArray80[this.anInt4221] = (short) arg6;
		this.aShortArray79[this.anInt4221] = (short) arg5;
		this.aByteArray77[this.anInt4221] = (byte) arg2;
		this.aFloatArray22[this.anInt4221] = arg0;
		this.aFloatArray23[this.anInt4221] = arg7;
		return (short) this.anInt4221++;
	}

	@OriginalMember(owner = "client!jv", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		return this.anInt4229;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!m;Lclient!gr;II)V")
	@Override
	public void method7703(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class6_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4221 == 0) {
			return;
		}
		@Pc(16) Class181_Sub3 local16 = this.aClass39_Sub3_20.aClass181_Sub3_3;
		if (!this.aBoolean323) {
			this.method3686();
		}
		@Pc(25) Class181_Sub3 local25 = (Class181_Sub3) arg0;
		Static425.aFloat179 = local25.aFloat153 * local16.aFloat148 + local16.aFloat147 * local25.aFloat143 + local16.aFloat153 * local25.aFloat151;
		Static319.aFloat127 = local16.aFloat150 + local16.aFloat153 * local25.aFloat152 + local25.aFloat145 * local16.aFloat147 + local16.aFloat148 * local25.aFloat150;
		@Pc(72) float local72 = (float) this.aShort87 * Static425.aFloat179 + Static319.aFloat127;
		@Pc(80) float local80 = Static319.aFloat127 + (float) this.aShort85 * Static425.aFloat179;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local97 = local72 + (float) this.aShort89;
			local91 = (float) -this.aShort89 + local80;
		} else {
			local91 = (float) -this.aShort89 + local72;
			local97 = local80 + (float) this.aShort89;
		}
		if (local91 >= this.aClass39_Sub3_20.aFloat158 || local97 <= (float) this.aClass39_Sub3_20.anInt6759) {
			return;
		}
		Static206.aFloat66 = local16.aFloat145 + local25.aFloat150 * local16.aFloat149 + local25.aFloat145 * local16.aFloat146 + local16.aFloat143 * local25.aFloat152;
		Static507.aFloat49 = local25.aFloat143 * local16.aFloat146 + local16.aFloat143 * local25.aFloat151 + local25.aFloat153 * local16.aFloat149;
		@Pc(174) float local174 = Static206.aFloat66 + Static507.aFloat49 * (float) this.aShort87;
		@Pc(182) float local182 = Static206.aFloat66 + (float) this.aShort85 * Static507.aFloat49;
		@Pc(209) float local209;
		@Pc(197) float local197;
		if (local182 < local174) {
			local197 = (local174 + (float) this.aShort89) * (float) this.aClass39_Sub3_20.anInt6751;
			local209 = ((float) -this.aShort89 + local182) * (float) this.aClass39_Sub3_20.anInt6751;
		} else {
			local209 = (float) this.aClass39_Sub3_20.anInt6751 * (local174 - (float) this.aShort89);
			local197 = (float) this.aClass39_Sub3_20.anInt6751 * (local182 + (float) this.aShort89);
		}
		if (local209 / (float) arg2 >= this.aClass39_Sub3_20.aFloat154 || this.aClass39_Sub3_20.aFloat161 >= local197 / (float) arg2) {
			return;
		}
		Static371.aFloat181 = local25.aFloat143 * local16.aFloat142 + local25.aFloat151 * local16.aFloat151 + local16.aFloat144 * local25.aFloat153;
		Static24.aFloat14 = local16.aFloat152 + local25.aFloat150 * local16.aFloat144 + local16.aFloat142 * local25.aFloat145 + local16.aFloat151 * local25.aFloat152;
		@Pc(300) float local300 = (float) this.aShort87 * Static371.aFloat181 + Static24.aFloat14;
		@Pc(308) float local308 = Static371.aFloat181 * (float) this.aShort85 + Static24.aFloat14;
		@Pc(323) float local323;
		@Pc(334) float local334;
		if (local308 < local300) {
			local323 = (float) this.aClass39_Sub3_20.anInt6726 * (local308 - (float) this.aShort89);
			local334 = (float) this.aClass39_Sub3_20.anInt6726 * ((float) this.aShort89 + local300);
		} else {
			local334 = (local308 + (float) this.aShort89) * (float) this.aClass39_Sub3_20.anInt6726;
			local323 = (float) this.aClass39_Sub3_20.anInt6726 * (local300 - (float) this.aShort89);
		}
		if (this.aClass39_Sub3_20.aFloat171 <= local323 / (float) arg2 || local334 / (float) arg2 <= this.aClass39_Sub3_20.aFloat157) {
			return;
		}
		if (arg1 != null || this.aClass126Array1 != null) {
			Static167.aFloat59 = local16.aFloat146 * local25.aFloat146 + local16.aFloat143 * local25.aFloat142 + local25.aFloat147 * local16.aFloat149;
			Static83.aFloat29 = local16.aFloat143 * local25.aFloat144 + local16.aFloat146 * local25.aFloat149 + local25.aFloat148 * local16.aFloat149;
			Static493.aFloat220 = local16.aFloat142 * local25.aFloat149 + local25.aFloat144 * local16.aFloat151 + local16.aFloat144 * local25.aFloat148;
			Static446.aFloat212 = local25.aFloat148 * local16.aFloat148 + local16.aFloat147 * local25.aFloat149 + local16.aFloat153 * local25.aFloat144;
			Static356.aFloat52 = local16.aFloat148 * local25.aFloat147 + local16.aFloat153 * local25.aFloat142 + local16.aFloat147 * local25.aFloat146;
			Static458.aFloat213 = local25.aFloat147 * local16.aFloat144 + local16.aFloat142 * local25.aFloat146 + local16.aFloat151 * local25.aFloat142;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.lb + this.aShort83 >> 1;
			@Pc(509) int local509 = this.aShort82 + this.aShort86 >> 1;
			@Pc(528) int local528 = (int) (Static507.aFloat49 * (float) this.aShort87 + Static206.aFloat66 + (float) local501 * Static167.aFloat59 + (float) local509 * Static83.aFloat29);
			@Pc(547) int local547 = (int) (Static493.aFloat220 * (float) local509 + Static371.aFloat181 * (float) this.aShort87 + Static24.aFloat14 + Static458.aFloat213 * (float) local501);
			@Pc(566) int local566 = (int) ((float) local509 * Static446.aFloat212 + (float) this.aShort87 * Static425.aFloat179 + (float) local501 * Static356.aFloat52 + Static319.aFloat127);
			@Pc(585) int local585 = (int) (Static167.aFloat59 * (float) local501 + Static206.aFloat66 + Static507.aFloat49 * (float) this.aShort85 + Static83.aFloat29 * (float) local509);
			@Pc(604) int local604 = (int) ((float) local509 * Static493.aFloat220 + (float) this.aShort85 * Static371.aFloat181 + Static24.aFloat14 + Static458.aFloat213 * (float) local501);
			arg1.anInt3044 = local604 * this.aClass39_Sub3_20.anInt6726 / arg2 + this.aClass39_Sub3_20.anInt6736;
			@Pc(636) int local636 = (int) ((float) local509 * Static446.aFloat212 + Static425.aFloat179 * (float) this.aShort85 + Static356.aFloat52 * (float) local501 + Static319.aFloat127);
			arg1.anInt3041 = local528 * this.aClass39_Sub3_20.anInt6751 / arg2 + this.aClass39_Sub3_20.anInt6734;
			arg1.anInt3043 = this.aClass39_Sub3_20.anInt6736 + local547 * this.aClass39_Sub3_20.anInt6726 / arg2;
			arg1.anInt3042 = this.aClass39_Sub3_20.anInt6734 + this.aClass39_Sub3_20.anInt6751 * local585 / arg2;
			if (this.aClass39_Sub3_20.anInt6759 > local566 && local636 < this.aClass39_Sub3_20.anInt6759) {
				arg1.aBoolean247 = true;
				arg1.anInt3040 = this.aClass39_Sub3_20.anInt6751 * (local528 + this.aShort89) / arg2 + this.aClass39_Sub3_20.anInt6734 - arg1.anInt3041;
			}
		}
		this.aClass39_Sub3_20.method5700((float) arg2);
		this.aClass39_Sub3_20.method5702();
		this.aClass39_Sub3_20.method5737(local25);
		this.method3687();
		this.aClass39_Sub3_20.method5734();
		this.method3696();
	}

	@OriginalMember(owner = "client!jv", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		if (!this.aBoolean323) {
			this.method3686();
		}
		return this.aShort86;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V")
	private void method3696() {
		if (this.aClass126Array1 == null) {
			return;
		}
		@Pc(8) Class181_Sub3 local8 = this.aClass39_Sub3_20.aClass181_Sub3_2;
		@Pc(12) float local12 = this.aClass39_Sub3_20.ra();
		@Pc(16) float local16 = this.aClass39_Sub3_20.P();
		this.aClass39_Sub3_20.method5724();
		this.aClass39_Sub3_20.method6058(false);
		this.aClass39_Sub3_20.method5736(false);
		this.aClass39_Sub3_20.method5754(this.aClass39_Sub3_20.aClass11_12, null, this.aClass39_Sub3_20.aClass11_13, null);
		for (@Pc(43) int local43 = 0; local43 < this.anInt4275; local43++) {
			@Pc(50) Class126 local50 = this.aClass126Array1[local43];
			@Pc(55) Class159 local55 = this.aClass159Array1[local43];
			if (!local50.aBoolean273 || !this.aClass39_Sub3_20.method6043()) {
				@Pc(84) float local84 = (float) (this.anIntArray417[local50.anInt3554] + this.anIntArray417[local50.anInt3553] + this.anIntArray417[local50.anInt3555]) * 0.3333333F;
				@Pc(105) float local105 = (float) (this.anIntArray415[local50.anInt3553] + this.anIntArray415[local50.anInt3554] + this.anIntArray415[local50.anInt3555]) * 0.3333333F;
				@Pc(127) float local127 = (float) (this.anIntArray416[local50.anInt3553] + this.anIntArray416[local50.anInt3554] + this.anIntArray416[local50.anInt3555]) * 0.3333333F;
				@Pc(141) float local141 = local127 * Static83.aFloat29 + Static167.aFloat59 * local84 + local105 * Static507.aFloat49 + Static206.aFloat66;
				@Pc(155) float local155 = Static458.aFloat213 * local84 + Static371.aFloat181 * local105 + Static493.aFloat220 * local127 + Static24.aFloat14;
				@Pc(169) float local169 = Static425.aFloat179 * local105 + local84 * Static356.aFloat52 + local127 * Static446.aFloat212 + Static319.aFloat127;
				local8.method5495(-local169, local55.anInt4334, local55.anInt4333 * local50.aShort70 >> 7, local50.aShort69 * local55.anInt4338 >> 7, (float) local55.anInt4337 - local155, local141 + (float) local55.anInt4331);
				this.aClass39_Sub3_20.method5753(local8);
				this.aClass39_Sub3_20.la(local16, local12 - (float) local50.anInt3556 * 1.5F);
				@Pc(219) int local219 = local55.anInt4335;
				OpenGL.glColor4ub((byte) (local219 >> 16), (byte) (local219 >> 8), (byte) local219, (byte) (local219 >> 24));
				this.aClass39_Sub3_20.method5686(local50.aShort71);
				this.aClass39_Sub3_20.method5704(local50.aByte53);
				this.aClass39_Sub3_20.method5699(local50.aByte52);
				this.aClass39_Sub3_20.method5742(4);
			}
		}
		this.aClass39_Sub3_20.la(local16, local12);
		this.aClass39_Sub3_20.method6058(true);
		this.aClass39_Sub3_20.method5734();
	}

	@OriginalMember(owner = "client!jv", name = "MA", descriptor = "()V")
	@Override
	protected void MA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4278; local7++) {
			this.anIntArray417[local7] = this.anIntArray417[local7] + 7 >> 4;
			this.anIntArray415[local7] = this.anIntArray415[local7] + 7 >> 4;
			this.anIntArray416[local7] = this.anIntArray416[local7] + 7 >> 4;
		}
		this.aBoolean323 = false;
		if (this.aClass11_4 != null) {
			this.aClass11_4.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "()[Lclient!mm;")
	@Override
	public Class192[] method7708() {
		return this.aClass192Array4;
	}

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aShort84 = (short) arg0;
		if (this.aClass11_5 != null) {
			this.aClass11_5.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt4239; local7++) {
			local16 = this.aShortArray74[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			@Pc(45) int local45 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local45 -= -(arg3 * (arg2 - local45) >> 7);
			}
			this.aShortArray74[local7] = (short) (local45 | local28 << 7 | local22 << 10);
		}
		if (this.aClass126Array1 != null) {
			for (local16 = 0; local16 < this.anInt4275; local16++) {
				@Pc(107) Class126 local107 = this.aClass126Array1[local16];
				@Pc(112) Class159 local112 = this.aClass159Array1[local16];
				local112.anInt4335 = local112.anInt4335 & 0xFF000000 | Static445.anIntArray614[this.aShortArray74[local107.anInt3552] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass11_5 != null) {
			this.aClass11_5.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIISB)I")
	private int method3697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) short arg2, @OriginalArg(4) byte arg3) {
		@Pc(12) int local12 = Static445.anIntArray614[Static48.method860(arg0, arg1)];
		if (arg2 != -1) {
			@Pc(24) Class204 local24 = this.aClass39_Sub3_20.anInterface12_15.method2573(arg2 & 0xFFFF);
			@Pc(29) int local29 = local24.aByte83 & 0xFF;
			@Pc(41) int local41;
			@Pc(69) int local69;
			if (local29 != 0) {
				if (arg0 < 0) {
					local41 = 0;
				} else if (arg0 <= 127) {
					local41 = arg0 * 131586;
				} else {
					local41 = 16777215;
				}
				if (local29 == 256) {
					local12 = local41;
				} else {
					local69 = 256 - local29;
					local12 = ((local12 & 0xFF00) * local69 + (local41 & 0xFF00) * local29 & 0xFF0000) + ((local12 & 0xFF00FF) * local69 + local29 * (local41 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local41 = local24.aByte82 & 0xFF;
			if (local41 != 0) {
				local41 += 256;
				@Pc(118) int local118 = local41 * (local12 >> 16 & 0xFF);
				if (local118 > 65535) {
					local118 = 65535;
				}
				local69 = local41 * (local12 >> 8 & 0xFF);
				if (local69 > 65535) {
					local69 = 65535;
				}
				@Pc(144) int local144 = (local12 & 0xFF) * local41;
				if (local144 > 65535) {
					local144 = 65535;
				}
				local12 = ((local118 & 0x6A00FF00) << 8) - (-(local69 & 0xFF00) - (local144 >> 8));
			}
		}
		return (local12 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
	@Override
	public void b(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class125.anIntArray381[arg0];
		@Pc(13) int local13 = Class125.anIntArray382[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4225; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray417[local15] + local9 * this.anIntArray415[local15] >> 15;
			this.anIntArray415[local15] = local13 * this.anIntArray415[local15] - local9 * this.anIntArray417[local15] >> 15;
			this.anIntArray417[local15] = local33;
		}
		this.aBoolean323 = false;
		if (this.aClass11_4 != null) {
			this.aClass11_4.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method7705(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class63_Sub2 local8 = (Class63_Sub2) arg0;
		if (this.anInt4239 == 0 || local8.anInt4239 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt4225;
		@Pc(24) int[] local24 = local8.anIntArray417;
		@Pc(27) int[] local27 = local8.anIntArray415;
		@Pc(30) int[] local30 = local8.anIntArray416;
		@Pc(33) short[] local33 = local8.aShortArray75;
		@Pc(36) short[] local36 = local8.aShortArray80;
		@Pc(39) short[] local39 = local8.aShortArray79;
		@Pc(42) byte[] local42 = local8.aByteArray77;
		@Pc(51) short[] local51;
		@Pc(47) short[] local47;
		@Pc(49) short[] local49;
		@Pc(53) byte[] local53;
		if (this.aClass280_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local53 = this.aClass280_1.aByteArray110;
			local47 = this.aClass280_1.aShortArray109;
			local49 = this.aClass280_1.aShortArray107;
			local51 = this.aClass280_1.aShortArray108;
		}
		@Pc(90) short[] local90;
		@Pc(78) short[] local78;
		@Pc(86) short[] local86;
		@Pc(82) byte[] local82;
		if (local8.aClass280_1 == null) {
			local90 = null;
			local82 = null;
			local86 = null;
			local78 = null;
		} else {
			local78 = local8.aClass280_1.aShortArray109;
			local82 = local8.aClass280_1.aByteArray110;
			local86 = local8.aClass280_1.aShortArray107;
			local90 = local8.aClass280_1.aShortArray108;
		}
		@Pc(103) int[] local103 = local8.anIntArray418;
		@Pc(106) short[] local106 = local8.aShortArray78;
		if (!local8.aBoolean323) {
			local8.method3686();
		}
		@Pc(115) short local115 = local8.aShort87;
		@Pc(118) short local118 = local8.aShort85;
		@Pc(121) short local121 = local8.aShort83;
		@Pc(124) short local124 = local8.lb;
		@Pc(127) short local127 = local8.aShort86;
		@Pc(130) short local130 = local8.aShort82;
		for (@Pc(132) int local132 = 0; local132 < this.anInt4225; local132++) {
			@Pc(141) int local141 = this.anIntArray415[local132] - arg2;
			if (local115 <= local141 && local118 >= local141) {
				@Pc(160) int local160 = this.anIntArray417[local132] - arg1;
				if (local160 >= local121 && local124 >= local160) {
					@Pc(176) int local176 = this.anIntArray416[local132] - arg3;
					if (local127 <= local176 && local130 >= local176) {
						@Pc(194) int local194 = -1;
						@Pc(199) int local199 = this.anIntArray418[local132];
						@Pc(206) int local206 = this.anIntArray418[local132 + 1];
						for (@Pc(208) int local208 = local199; local208 < local206; local208++) {
							local194 = this.aShortArray78[local208] - 1;
							if (local194 == -1 || this.aByteArray77[local194] != 0) {
								break;
							}
						}
						if (local194 != -1) {
							for (@Pc(240) int local240 = 0; local240 < local21; local240++) {
								if (local24[local240] == local160 && local30[local240] == local176 && local141 == local27[local240]) {
									local206 = local103[local240 + 1];
									@Pc(269) int local269 = -1;
									local199 = local103[local240];
									for (@Pc(275) int local275 = local199; local275 < local206; local275++) {
										local269 = local106[local275] - 1;
										if (local269 == -1 || local42[local269] != 0) {
											break;
										}
									}
									if (local269 != -1) {
										if (local51 == null) {
											this.aClass280_1 = new Class280();
											local51 = this.aClass280_1.aShortArray108 = Static192.method3148(this.aShortArray75);
											local47 = this.aClass280_1.aShortArray109 = Static192.method3148(this.aShortArray80);
											local49 = this.aClass280_1.aShortArray107 = Static192.method3148(this.aShortArray79);
											local53 = this.aClass280_1.aByteArray110 = Static229.method3608(this.aByteArray77);
										}
										if (local90 == null) {
											@Pc(355) Class280 local355 = local8.aClass280_1 = new Class280();
											local90 = local355.aShortArray108 = Static192.method3148(local33);
											local78 = local355.aShortArray109 = Static192.method3148(local36);
											local86 = local355.aShortArray107 = Static192.method3148(local39);
											local82 = local355.aByteArray110 = Static229.method3608(local42);
										}
										@Pc(388) short local388 = this.aShortArray75[local194];
										@Pc(393) short local393 = this.aShortArray80[local194];
										@Pc(398) short local398 = this.aShortArray79[local194];
										@Pc(403) byte local403 = this.aByteArray77[local194];
										local199 = local103[local240];
										local206 = local103[local240 + 1];
										@Pc(423) int local423;
										for (@Pc(415) int local415 = local199; local415 < local206; local415++) {
											local423 = local106[local415] - 1;
											if (local423 == -1) {
												break;
											}
											if (local82[local423] != 0) {
												local90[local423] += local388;
												local78[local423] += local393;
												local86[local423] += local398;
												local82[local423] += local403;
											}
										}
										local206 = this.anIntArray418[local132 + 1];
										local403 = local42[local269];
										local393 = local36[local269];
										local388 = local33[local269];
										local398 = local39[local269];
										local199 = this.anIntArray418[local132];
										for (local423 = local199; local423 < local206; local423++) {
											@Pc(509) int local509 = this.aShortArray78[local423] - 1;
											if (local509 == -1) {
												break;
											}
											if (local53[local509] != 0) {
												local51[local509] += local388;
												local47[local509] += local393;
												local49[local509] += local398;
												local53[local509] += local403;
											}
										}
										if (this.aClass11_6 == null && this.aClass11_5 != null) {
											this.aClass11_5.anInterface10_1 = null;
										}
										if (this.aClass11_6 != null) {
											this.aClass11_6.anInterface10_1 = null;
										}
										if (local8.aClass11_6 == null && local8.aClass11_5 != null) {
											local8.aClass11_5.anInterface10_1 = null;
										}
										if (local8.aClass11_6 != null) {
											local8.aClass11_6.anInterface10_1 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
