import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class32_Sub2 extends Class32 {

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "S")
	private short aShort90;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "Lclient!rg;")
	private Interface12 anInterface12_7;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "Lclient!lh;")
	private Class148 aClass148_1;

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "[B")
	private byte[] aByteArray201;

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "[I")
	private int[] anIntArray488;

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "[I")
	private int[] anIntArray489;

	@OriginalMember(owner = "client!ve", name = "O", descriptor = "B")
	private byte aByte99;

	@OriginalMember(owner = "client!ve", name = "P", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!ve", name = "Q", descriptor = "[Lclient!au;")
	private Class17[] aClass17Array3;

	@OriginalMember(owner = "client!ve", name = "R", descriptor = "Lclient!gb;")
	private Interface4 anInterface4_5;

	@OriginalMember(owner = "client!ve", name = "T", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!ve", name = "U", descriptor = "[I")
	private int[] anIntArray490;

	@OriginalMember(owner = "client!ve", name = "V", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!ve", name = "Y", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!ve", name = "Z", descriptor = "[B")
	private byte[] aByteArray202;

	@OriginalMember(owner = "client!ve", name = "cb", descriptor = "I")
	private int anInt7303;

	@OriginalMember(owner = "client!ve", name = "eb", descriptor = "S")
	private short aShort92;

	@OriginalMember(owner = "client!ve", name = "fb", descriptor = "I")
	private int anInt7305;

	@OriginalMember(owner = "client!ve", name = "ob", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!ve", name = "sb", descriptor = "[Lclient!qm;")
	private Class202[] aClass202Array3;

	@OriginalMember(owner = "client!ve", name = "ub", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!ve", name = "Eb", descriptor = "[I")
	private int[] anIntArray491;

	@OriginalMember(owner = "client!ve", name = "Lb", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!ve", name = "Ob", descriptor = "[F")
	private float[] aFloatArray31;

	@OriginalMember(owner = "client!ve", name = "Pb", descriptor = "[[I")
	private int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!ve", name = "Vb", descriptor = "[Lclient!vu;")
	private Class259[] aClass259Array1;

	@OriginalMember(owner = "client!ve", name = "Wb", descriptor = "I")
	private int anInt7334;

	@OriginalMember(owner = "client!ve", name = "ac", descriptor = "S")
	private short aShort94;

	@OriginalMember(owner = "client!ve", name = "bc", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!ve", name = "dc", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!ve", name = "fc", descriptor = "S")
	private short aShort95;

	@OriginalMember(owner = "client!ve", name = "kc", descriptor = "[F")
	private float[] aFloatArray32;

	@OriginalMember(owner = "client!ve", name = "lc", descriptor = "[Lclient!qn;")
	private Class203[] aClass203Array1;

	@OriginalMember(owner = "client!ve", name = "mc", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!ve", name = "sc", descriptor = "S")
	private short aShort97;

	@OriginalMember(owner = "client!ve", name = "uc", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!ve", name = "vc", descriptor = "[I")
	private int[] anIntArray492;

	@OriginalMember(owner = "client!ve", name = "yc", descriptor = "S")
	private short aShort98;

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
	private int anInt7289 = 0;

	@OriginalMember(owner = "client!ve", name = "Bb", descriptor = "Z")
	private boolean aBoolean628 = false;

	@OriginalMember(owner = "client!ve", name = "ec", descriptor = "I")
	private int anInt7339 = 0;

	@OriginalMember(owner = "client!ve", name = "jb", descriptor = "I")
	private int anInt7309 = 0;

	@OriginalMember(owner = "client!ve", name = "gb", descriptor = "I")
	private int anInt7306 = 0;

	@OriginalMember(owner = "client!ve", name = "Ab", descriptor = "Z")
	private boolean aBoolean627 = true;

	@OriginalMember(owner = "client!ve", name = "Ub", descriptor = "I")
	private int anInt7333 = 0;

	@OriginalMember(owner = "client!ve", name = "wb", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_39;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "Lclient!gs;")
	private Class100 aClass100_13;

	@OriginalMember(owner = "client!ve", name = "Kb", descriptor = "Lclient!gs;")
	private Class100 aClass100_15;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "Lclient!gs;")
	private Class100 aClass100_14;

	@OriginalMember(owner = "client!ve", name = "Sb", descriptor = "Lclient!gs;")
	private Class100 aClass100_16;

	@OriginalMember(owner = "client!ve", name = "jc", descriptor = "Lclient!ev;")
	private Class75 aClass75_1;

	static {
		new Class256("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!bo;)V")
	public Class32_Sub2(@OriginalArg(0) Class26_Sub1 arg0) {
		this.aClass26_Sub1_39 = arg0;
		this.aClass100_13 = new Class100(this.aClass26_Sub1_39, null, 5126, 3, 0);
		this.aClass100_15 = new Class100(this.aClass26_Sub1_39, null, 5126, 2, 0);
		this.aClass100_14 = new Class100(this.aClass26_Sub1_39, null, 5126, 3, 0);
		this.aClass100_16 = new Class100(this.aClass26_Sub1_39, null, 5121, 4, 0);
		this.aClass75_1 = new Class75();
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!bo;Lclient!wp;IIII)V")
	public Class32_Sub2(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) Class266 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7305 = arg2;
		this.aClass26_Sub1_39 = arg0;
		this.anInt7303 = arg5;
		if (Static382.method5314(arg2, arg5)) {
			this.aClass100_13 = new Class100(this.aClass26_Sub1_39, null, 5126, 3, 0);
		}
		if (Static304.method4372(arg5, arg2)) {
			this.aClass100_15 = new Class100(this.aClass26_Sub1_39, null, 5126, 2, 0);
		}
		if (Static224.method3459(arg5, arg2)) {
			this.aClass100_14 = new Class100(this.aClass26_Sub1_39, null, 5126, 3, 0);
		}
		if (Static328.method4699(arg5, arg2)) {
			this.aClass100_16 = new Class100(this.aClass26_Sub1_39, null, 5121, 4, 0);
		}
		if (Static122.method1778(arg5, arg2)) {
			this.aClass75_1 = new Class75();
		}
		@Pc(110) Interface8 local110 = arg0.anInterface8_5;
		@Pc(114) int[] local114 = new int[arg1.anInt7821];
		this.anIntArray491 = new int[arg1.anInt7804 + 1];
		for (@Pc(123) int local123 = 0; local123 < arg1.anInt7821; local123++) {
			if ((arg1.aByteArray220 == null || arg1.aByteArray220[local123] != 2) && (arg1.aShortArray109 == null || arg1.aShortArray109[local123] == -1 || !local110.method3836(arg1.aShortArray109[local123] & 0xFFFF).aBoolean439)) {
				local114[this.anInt7309++] = local123;
				this.anIntArray491[arg1.aShortArray107[local123]]++;
				this.anIntArray491[arg1.aShortArray114[local123]]++;
				this.anIntArray491[arg1.aShortArray112[local123]]++;
			}
		}
		this.anInt7339 = this.anInt7309;
		@Pc(217) long[] local217 = new long[this.anInt7309];
		@Pc(229) boolean local229 = (this.anInt7305 & 0x100) != 0;
		@Pc(241) int local241;
		@Pc(252) int local252;
		@Pc(384) int local384;
		label490: for (@Pc(231) int local231 = 0; local231 < this.anInt7309; local231++) {
			@Pc(237) int local237 = local114[local231];
			@Pc(239) Class178 local239 = null;
			local241 = 0;
			@Pc(243) byte local243 = 0;
			@Pc(245) byte local245 = 0;
			@Pc(247) byte local247 = 0;
			if (arg1.aClass84Array1 != null) {
				for (local252 = 0; local252 < arg1.aClass84Array1.length; local252++) {
					@Pc(259) Class84 local259 = arg1.aClass84Array1[local252];
					if (local237 == local259.anInt2344) {
						@Pc(268) Class91 local268 = Static415.method5639(local259.anInt2340);
						if (local268.aBoolean203) {
							local217[local231] = Long.MAX_VALUE;
							this.anInt7339--;
							continue label490;
						}
					}
				}
			}
			@Pc(295) short local295 = -1;
			if (arg1.aShortArray109 != null) {
				local295 = arg1.aShortArray109[local237];
				if (local295 != -1) {
					local239 = local110.method3836(local295 & 0xFFFF);
					local245 = local239.aByte59;
					local247 = local239.aByte53;
				}
			}
			@Pc(340) boolean local340 = arg1.aByteArray215 != null && arg1.aByteArray215[local237] != 0 || local239 != null && !local239.aBoolean435;
			if ((local229 || local340) && arg1.aByteArray216 != null) {
				local241 += arg1.aByteArray216[local237] << 17;
			}
			if (local340) {
				local241 += 65536;
			}
			local241 += (local245 & 0xFF) << 8;
			local241 += local247 & 0xFF;
			local384 = local243 + ((local295 & 0xFFFF) << 16);
			@Pc(390) int local390 = local384 + (local231 & 0xFFFF);
			local217[local231] = ((long) local241 << 32) + (long) local390;
		}
		Static37.method713(local217, local114);
		this.anIntArray492 = arg1.anIntArray518;
		this.anInt7306 = arg1.anInt7805;
		this.anIntArray489 = arg1.anIntArray510;
		this.anIntArray488 = arg1.anIntArray514;
		this.aShortArray100 = arg1.aShortArray111;
		this.anInt7289 = arg1.anInt7804;
		this.aClass202Array3 = arg1.aClass202Array4;
		@Pc(441) Class19[] local441 = new Class19[this.anInt7289];
		this.aClass17Array3 = arg1.aClass17Array4;
		@Pc(465) int local465;
		@Pc(479) int local479;
		if (arg1.aClass84Array1 != null) {
			this.anInt7334 = arg1.aClass84Array1.length;
			this.aClass203Array1 = new Class203[this.anInt7334];
			this.aClass259Array1 = new Class259[this.anInt7334];
			for (local465 = 0; local465 < this.anInt7334; local465++) {
				@Pc(472) Class84 local472 = arg1.aClass84Array1[local465];
				@Pc(477) Class91 local477 = Static415.method5639(local472.anInt2340);
				local479 = -1;
				for (@Pc(481) int local481 = 0; local481 < this.anInt7309; local481++) {
					if (local114[local481] == local472.anInt2344) {
						local479 = local481;
						break;
					}
				}
				if (local479 == -1) {
					throw new RuntimeException();
				}
				local252 = Static130.anIntArray144[arg1.aShortArray115[local472.anInt2344] & 0xFFFF] & 0xFFFFFF;
				local252 |= 255 - (arg1.aByteArray215 == null ? 0 : arg1.aByteArray215[local472.anInt2344]) << 24;
				this.aClass259Array1[local465] = new Class259(local479, arg1.aShortArray107[local472.anInt2344], arg1.aShortArray114[local472.anInt2344], arg1.aShortArray112[local472.anInt2344], local477.anInt2441, local477.anInt2435, local477.anInt2437, local477.anInt2432, local477.anInt2439, local477.aBoolean203, local477.aBoolean205, local472.anInt2345);
				this.aClass203Array1[local465] = new Class203(local252);
			}
		}
		local465 = this.anInt7309 * 3;
		this.aShortArray93 = new short[local465];
		if (arg1.aShortArray110 != null) {
			this.aShortArray94 = new short[this.anInt7309];
		}
		this.aShortArray95 = new short[this.anInt7309];
		Static393.aLongArray8 = new long[local465];
		this.aShortArray98 = new short[this.anInt7309];
		this.aByteArray201 = new byte[local465];
		this.aFloatArray31 = new float[local465];
		this.aShort95 = (short) arg4;
		this.aFloatArray32 = new float[local465];
		this.aShortArray97 = new short[this.anInt7309];
		this.aShort96 = (short) arg3;
		this.aShortArray96 = new short[local465];
		this.aShortArray103 = new short[this.anInt7309];
		this.aShortArray99 = new short[local465];
		this.aByteArray202 = new byte[this.anInt7309];
		this.aShortArray102 = new short[this.anInt7309];
		this.aShortArray101 = new short[local465];
		local241 = 0;
		for (local384 = 0; local384 < arg1.anInt7804; local384++) {
			local479 = this.anIntArray491[local384];
			this.anIntArray491[local384] = local241;
			local241 += local479;
			local441[local384] = new Class19();
		}
		this.anIntArray491[arg1.anInt7804] = local241;
		@Pc(716) int[] local716 = null;
		@Pc(718) int[] local718 = null;
		@Pc(720) int[] local720 = null;
		@Pc(722) float[][] local722 = null;
		@Pc(748) int local748;
		@Pc(784) int local784;
		@Pc(790) int local790;
		@Pc(804) int local804;
		@Pc(806) int local806;
		@Pc(840) int local840;
		@Pc(845) int local845;
		@Pc(1026) float local1026;
		@Pc(1011) float local1011;
		@Pc(1020) float local1020;
		if (arg1.aByteArray217 != null) {
			@Pc(728) int local728 = arg1.anInt7801;
			@Pc(731) int[] local731 = new int[local728];
			@Pc(734) int[] local734 = new int[local728];
			@Pc(737) int[] local737 = new int[local728];
			@Pc(740) int[] local740 = new int[local728];
			@Pc(743) int[] local743 = new int[local728];
			@Pc(746) int[] local746 = new int[local728];
			for (local748 = 0; local748 < local728; local748++) {
				local731[local748] = Integer.MAX_VALUE;
				local734[local748] = -2147483647;
				local737[local748] = Integer.MAX_VALUE;
				local740[local748] = -2147483647;
				local743[local748] = Integer.MAX_VALUE;
				local746[local748] = -2147483647;
			}
			for (local784 = 0; local784 < this.anInt7309; local784++) {
				local790 = local114[local784];
				if (arg1.aByteArray217[local790] != -1) {
					local804 = arg1.aByteArray217[local790] & 0xFF;
					for (local806 = 0; local806 < 3; local806++) {
						@Pc(821) short local821;
						if (local806 == 0) {
							local821 = arg1.aShortArray107[local790];
						} else if (local806 == 1) {
							local821 = arg1.aShortArray114[local790];
						} else {
							local821 = arg1.aShortArray112[local790];
						}
						local840 = arg1.anIntArray510[local821];
						local845 = arg1.anIntArray518[local821];
						@Pc(850) int local850 = arg1.anIntArray514[local821];
						if (local840 < local731[local804]) {
							local731[local804] = local840;
						}
						if (local840 > local734[local804]) {
							local734[local804] = local840;
						}
						if (local737[local804] > local845) {
							local737[local804] = local845;
						}
						if (local845 > local740[local804]) {
							local740[local804] = local845;
						}
						if (local850 < local743[local804]) {
							local743[local804] = local850;
						}
						if (local850 > local746[local804]) {
							local746[local804] = local850;
						}
					}
				}
			}
			local722 = new float[local728][];
			local720 = new int[local728];
			local718 = new int[local728];
			local716 = new int[local728];
			for (local790 = 0; local790 < local728; local790++) {
				@Pc(954) byte local954 = arg1.aByteArray219[local790];
				if (local954 > 0) {
					local716[local790] = (local731[local790] + local734[local790]) / 2;
					local718[local790] = (local737[local790] + local740[local790]) / 2;
					local720[local790] = (local746[local790] + local743[local790]) / 2;
					if (local954 == 1) {
						local845 = arg1.anIntArray511[local790];
						local1011 = 64.0F / (float) arg1.anIntArray515[local790];
						if (local845 == 0) {
							local1020 = 1.0F;
							local1026 = 1.0F;
						} else if (local845 <= 0) {
							local1020 = 1.0F;
							local1026 = (float) -local845 / 1024.0F;
						} else {
							local1020 = (float) local845 / 1024.0F;
							local1026 = 1.0F;
						}
					} else if (local954 == 2) {
						local1026 = 64.0F / (float) arg1.anIntArray511[local790];
						local1011 = 64.0F / (float) arg1.anIntArray515[local790];
						local1020 = 64.0F / (float) arg1.anIntArray513[local790];
					} else {
						local1026 = (float) arg1.anIntArray511[local790] / 1024.0F;
						local1011 = (float) arg1.anIntArray515[local790] / 1024.0F;
						local1020 = (float) arg1.anIntArray513[local790] / 1024.0F;
					}
					local722[local790] = Static359.method3804(arg1.aShortArray106[local790], arg1.aShortArray113[local790], local1020, local1026, arg1.aByteArray221[local790] & 0xFF, arg1.aShortArray108[local790], local1011);
				}
			}
		}
		@Pc(1132) Class119[] local1132 = new Class119[arg1.anInt7821];
		@Pc(1151) short local1151;
		@Pc(1161) int local1161;
		@Pc(1171) int local1171;
		@Pc(1231) int local1231;
		for (@Pc(1134) int local1134 = 0; local1134 < arg1.anInt7821; local1134++) {
			@Pc(1141) short local1141 = arg1.aShortArray107[local1134];
			@Pc(1146) short local1146 = arg1.aShortArray114[local1134];
			local1151 = arg1.aShortArray112[local1134];
			local1161 = this.anIntArray489[local1146] - this.anIntArray489[local1141];
			local1171 = this.anIntArray492[local1146] - this.anIntArray492[local1141];
			local748 = this.anIntArray488[local1146] - this.anIntArray488[local1141];
			local784 = this.anIntArray489[local1151] - this.anIntArray489[local1141];
			local790 = this.anIntArray492[local1151] - this.anIntArray492[local1141];
			local804 = this.anIntArray488[local1151] - this.anIntArray488[local1141];
			local806 = local1171 * local804 - local748 * local790;
			local1231 = local748 * local784 - local804 * local1161;
			for (local840 = local790 * local1161 - local1171 * local784; local806 > 8192 || local1231 > 8192 || local840 > 8192 || local806 < -8192 || local1231 < -8192 || local840 < -8192; local840 >>= 0x1) {
				local806 >>= 0x1;
				local1231 >>= 0x1;
			}
			local845 = (int) Math.sqrt((double) (local840 * local840 + local806 * local806 + local1231 * local1231));
			if (local845 <= 0) {
				local845 = 1;
			}
			local1231 = local1231 * 256 / local845;
			local806 = local806 * 256 / local845;
			local840 = local840 * 256 / local845;
			@Pc(1328) byte local1328 = arg1.aByteArray220 == null ? 0 : arg1.aByteArray220[local1134];
			if (local1328 == 0) {
				@Pc(1337) Class19 local1337 = local441[local1141];
				local1337.anInt492 += local806;
				local1337.anInt491 += local840;
				local1337.anInt494 += local1231;
				local1337.anInt497++;
				@Pc(1365) Class19 local1365 = local441[local1146];
				local1365.anInt497++;
				local1365.anInt492 += local806;
				local1365.anInt494 += local1231;
				local1365.anInt491 += local840;
				@Pc(1393) Class19 local1393 = local441[local1151];
				local1393.anInt494 += local1231;
				local1393.anInt497++;
				local1393.anInt491 += local840;
				local1393.anInt492 += local806;
			} else if (local1328 == 1) {
				@Pc(1432) Class119 local1432 = local1132[local1134] = new Class119();
				local1432.anInt3337 = local1231;
				local1432.anInt3338 = local806;
				local1432.anInt3339 = local840;
			}
		}
		@Pc(1458) int local1458;
		for (@Pc(1452) int local1452 = 0; local1452 < this.anInt7309; local1452++) {
			local1458 = local114[local1452];
			@Pc(1465) int local1465 = arg1.aShortArray115[local1458] & 0xFFFF;
			@Pc(1470) short local1470;
			if (arg1.aShortArray109 == null) {
				local1470 = -1;
			} else {
				local1470 = arg1.aShortArray109[local1458];
			}
			if (arg1.aByteArray217 == null) {
				local1171 = -1;
			} else {
				local1171 = arg1.aByteArray217[local1458];
			}
			if (arg1.aByteArray215 == null) {
				local748 = 0;
			} else {
				local748 = arg1.aByteArray215[local1458] & 0xFF;
			}
			@Pc(1505) float local1505 = 0.0F;
			@Pc(1507) float local1507 = 0.0F;
			@Pc(1509) float local1509 = 0.0F;
			local1026 = 0.0F;
			local1011 = 0.0F;
			local1020 = 0.0F;
			@Pc(1517) byte local1517 = 0;
			@Pc(1519) byte local1519 = 0;
			@Pc(1521) int local1521 = 0;
			@Pc(1555) byte local1555;
			@Pc(1575) short local1575;
			@Pc(1580) short local1580;
			@Pc(1585) short local1585;
			if (local1470 != -1) {
				if (local1171 == -1) {
					local1509 = 1.0F;
					local1505 = 0.0F;
					local1507 = 1.0F;
					local1026 = 1.0F;
					local1011 = 0.0F;
					local1020 = 0.0F;
					local1517 = 1;
					local1519 = 2;
				} else {
					local1171 &= 0xFF;
					local1555 = arg1.aByteArray219[local1171];
					@Pc(1565) short local1565;
					@Pc(1570) short local1570;
					@Pc(1608) float local1608;
					@Pc(1616) float local1616;
					@Pc(1625) float local1625;
					@Pc(1707) float local1707;
					@Pc(1715) float local1715;
					@Pc(1724) float local1724;
					@Pc(1732) float local1732;
					@Pc(1741) float local1741;
					@Pc(1749) float local1749;
					if (local1555 == 0) {
						local1565 = arg1.aShortArray107[local1458];
						local1570 = arg1.aShortArray114[local1458];
						local1575 = arg1.aShortArray112[local1458];
						local1580 = arg1.aShortArray113[local1171];
						local1585 = arg1.aShortArray108[local1171];
						@Pc(1590) short local1590 = arg1.aShortArray106[local1171];
						@Pc(1596) float local1596 = (float) arg1.anIntArray510[local1580];
						@Pc(1602) float local1602 = (float) arg1.anIntArray518[local1580];
						local1608 = arg1.anIntArray514[local1580];
						local1616 = (float) arg1.anIntArray510[local1585] - local1596;
						local1625 = (float) arg1.anIntArray518[local1585] - local1602;
						@Pc(1633) float local1633 = (float) arg1.anIntArray514[local1585] - local1608;
						@Pc(1642) float local1642 = (float) arg1.anIntArray510[local1590] - local1596;
						@Pc(1650) float local1650 = (float) arg1.anIntArray518[local1590] - local1602;
						@Pc(1658) float local1658 = (float) arg1.anIntArray514[local1590] - local1608;
						@Pc(1666) float local1666 = (float) arg1.anIntArray510[local1565] - local1596;
						@Pc(1674) float local1674 = (float) arg1.anIntArray518[local1565] - local1602;
						@Pc(1682) float local1682 = (float) arg1.anIntArray514[local1565] - local1608;
						@Pc(1691) float local1691 = (float) arg1.anIntArray510[local1570] - local1596;
						@Pc(1699) float local1699 = (float) arg1.anIntArray518[local1570] - local1602;
						local1707 = (float) arg1.anIntArray514[local1570] - local1608;
						local1715 = (float) arg1.anIntArray510[local1575] - local1596;
						local1724 = (float) arg1.anIntArray518[local1575] - local1602;
						local1732 = (float) arg1.anIntArray514[local1575] - local1608;
						local1741 = local1658 * local1625 - local1650 * local1633;
						local1749 = local1642 * local1633 - local1616 * local1658;
						@Pc(1758) float local1758 = local1616 * local1650 - local1625 * local1642;
						@Pc(1767) float local1767 = local1758 * local1650 - local1749 * local1658;
						@Pc(1775) float local1775 = local1658 * local1741 - local1642 * local1758;
						@Pc(1784) float local1784 = local1642 * local1749 - local1741 * local1650;
						@Pc(1798) float local1798 = 1.0F / (local1616 * local1767 + local1625 * local1775 + local1784 * local1633);
						local1509 = (local1775 * local1699 + local1767 * local1691 + local1784 * local1707) * local1798;
						local1011 = local1798 * (local1784 * local1732 + local1724 * local1775 + local1715 * local1767);
						local1505 = local1798 * (local1666 * local1767 + local1775 * local1674 + local1682 * local1784);
						@Pc(1849) float local1849 = local1749 * local1616 - local1625 * local1741;
						@Pc(1858) float local1858 = local1633 * local1741 - local1616 * local1758;
						@Pc(1867) float local1867 = local1758 * local1625 - local1749 * local1633;
						@Pc(1881) float local1881 = 1.0F / (local1642 * local1867 + local1650 * local1858 + local1658 * local1849);
						local1026 = (local1849 * local1707 + local1867 * local1691 + local1858 * local1699) * local1881;
						local1020 = local1881 * (local1732 * local1849 + local1724 * local1858 + local1867 * local1715);
						local1507 = (local1682 * local1849 + local1674 * local1858 + local1666 * local1867) * local1881;
					} else {
						local1565 = arg1.aShortArray107[local1458];
						local1570 = arg1.aShortArray114[local1458];
						local1575 = arg1.aShortArray112[local1458];
						@Pc(1944) int local1944 = local716[local1171];
						@Pc(1948) int local1948 = local718[local1171];
						@Pc(1952) int local1952 = local720[local1171];
						@Pc(1956) float[] local1956 = local722[local1171];
						@Pc(1961) byte local1961 = arg1.aByteArray218[local1171];
						local1608 = (float) arg1.anIntArray519[local1171] / 256.0F;
						if (local1555 == 1) {
							local1616 = (float) arg1.anIntArray513[local1171] / 1024.0F;
							Static282.method4164(local1952, arg1.anIntArray510[local1565], arg1.anIntArray518[local1565], local1944, local1956, local1616, local1608, local1948, arg1.anIntArray514[local1565], local1961);
							local1505 = Static447.aFloat151;
							local1507 = Static412.aFloat213;
							Static282.method4164(local1952, arg1.anIntArray510[local1570], arg1.anIntArray518[local1570], local1944, local1956, local1616, local1608, local1948, arg1.anIntArray514[local1570], local1961);
							local1509 = Static447.aFloat151;
							local1026 = Static412.aFloat213;
							Static282.method4164(local1952, arg1.anIntArray510[local1575], arg1.anIntArray518[local1575], local1944, local1956, local1616, local1608, local1948, arg1.anIntArray514[local1575], local1961);
							local1020 = Static412.aFloat213;
							local1011 = Static447.aFloat151;
							local1625 = local1616 / 2.0F;
							if ((local1961 & 0x1) == 0) {
								if (local1509 - local1505 > local1625) {
									local1509 -= local1616;
									local1517 = 1;
								} else if (local1625 < local1505 - local1509) {
									local1509 += local1616;
									local1517 = 2;
								}
								if (local1625 < local1011 - local1505) {
									local1519 = 1;
									local1011 -= local1616;
								} else if (local1505 - local1011 > local1625) {
									local1011 += local1616;
									local1519 = 2;
								}
							} else {
								if (local1026 - local1507 > local1625) {
									local1026 -= local1616;
									local1517 = 1;
								} else if (local1507 - local1026 > local1625) {
									local1517 = 2;
									local1026 += local1616;
								}
								if (local1625 < local1020 - local1507) {
									local1519 = 1;
									local1020 -= local1616;
								} else if (local1625 < local1507 - local1020) {
									local1519 = 2;
									local1020 += local1616;
								}
							}
						} else if (local1555 == 2) {
							local1616 = (float) arg1.anIntArray520[local1171] / 256.0F;
							local1625 = (float) arg1.anIntArray521[local1171] / 256.0F;
							@Pc(2397) int local2397 = arg1.anIntArray510[local1570] - arg1.anIntArray510[local1565];
							@Pc(2408) int local2408 = arg1.anIntArray518[local1570] - arg1.anIntArray518[local1565];
							@Pc(2418) int local2418 = arg1.anIntArray514[local1570] - arg1.anIntArray514[local1565];
							@Pc(2429) int local2429 = arg1.anIntArray510[local1575] - arg1.anIntArray510[local1565];
							@Pc(2440) int local2440 = arg1.anIntArray518[local1575] - arg1.anIntArray518[local1565];
							@Pc(2451) int local2451 = arg1.anIntArray514[local1575] - arg1.anIntArray514[local1565];
							@Pc(2460) int local2460 = local2408 * local2451 - local2440 * local2418;
							@Pc(2469) int local2469 = local2429 * local2418 - local2397 * local2451;
							@Pc(2478) int local2478 = local2440 * local2397 - local2408 * local2429;
							local1707 = 64.0F / (float) arg1.anIntArray511[local1171];
							local1715 = 64.0F / (float) arg1.anIntArray515[local1171];
							local1724 = 64.0F / (float) arg1.anIntArray513[local1171];
							local1732 = ((float) local2469 * local1956[1] + (float) local2460 * local1956[0] + local1956[2] * (float) local2478) / local1707;
							local1741 = ((float) local2460 * local1956[3] + (float) local2469 * local1956[4] + local1956[5] * (float) local2478) / local1715;
							local1749 = ((float) local2469 * local1956[7] + local1956[6] * (float) local2460 + local1956[8] * (float) local2478) / local1724;
							local1521 = Static106.method1651(local1741, local1749, local1732);
							Static69.method1274(local1616, local1944, local1608, local1948, local1952, arg1.anIntArray514[local1565], local1961, local1521, arg1.anIntArray510[local1565], local1625, arg1.anIntArray518[local1565], local1956);
							local1507 = Static451.aFloat59;
							local1505 = Static318.aFloat172;
							Static69.method1274(local1616, local1944, local1608, local1948, local1952, arg1.anIntArray514[local1570], local1961, local1521, arg1.anIntArray510[local1570], local1625, arg1.anIntArray518[local1570], local1956);
							local1026 = Static451.aFloat59;
							local1509 = Static318.aFloat172;
							Static69.method1274(local1616, local1944, local1608, local1948, local1952, arg1.anIntArray514[local1575], local1961, local1521, arg1.anIntArray510[local1575], local1625, arg1.anIntArray518[local1575], local1956);
							local1011 = Static318.aFloat172;
							local1020 = Static451.aFloat59;
						} else if (local1555 == 3) {
							Static362.method5050(arg1.anIntArray514[local1565], local1961, local1944, arg1.anIntArray518[local1565], local1948, local1952, local1956, arg1.anIntArray510[local1565], local1608);
							local1507 = Static233.aFloat144;
							local1505 = Static159.aFloat96;
							Static362.method5050(arg1.anIntArray514[local1570], local1961, local1944, arg1.anIntArray518[local1570], local1948, local1952, local1956, arg1.anIntArray510[local1570], local1608);
							local1026 = Static233.aFloat144;
							local1509 = Static159.aFloat96;
							Static362.method5050(arg1.anIntArray514[local1575], local1961, local1944, arg1.anIntArray518[local1575], local1948, local1952, local1956, arg1.anIntArray510[local1575], local1608);
							local1020 = Static233.aFloat144;
							local1011 = Static159.aFloat96;
							if ((local1961 & 0x1) == 0) {
								if (local1011 - local1505 > 0.5F) {
									local1519 = 1;
									local1011--;
								} else if (local1505 - local1011 > 0.5F) {
									local1011++;
									local1519 = 2;
								}
								if (local1509 - local1505 > 0.5F) {
									local1517 = 1;
									local1509--;
								} else if (local1505 - local1509 > 0.5F) {
									local1517 = 2;
									local1509++;
								}
							} else {
								if (local1026 - local1507 > 0.5F) {
									local1026--;
									local1517 = 1;
								} else if (local1507 - local1026 > 0.5F) {
									local1517 = 2;
									local1026++;
								}
								if (local1020 - local1507 > 0.5F) {
									local1519 = 1;
									local1020--;
								} else if (local1507 - local1020 > 0.5F) {
									local1020++;
									local1519 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray220 == null) {
				local1555 = 0;
			} else {
				local1555 = arg1.aByteArray220[local1458];
			}
			if (local1555 == 0) {
				@Pc(2826) long local2826 = (long) (local1171 << 2) + ((long) (local1521 << 24) + (long) (local1465 << 8) + (long) local748 << 32);
				local1575 = arg1.aShortArray107[local1458];
				local1580 = arg1.aShortArray114[local1458];
				local1585 = arg1.aShortArray112[local1458];
				@Pc(2845) Class19 local2845 = local441[local1575];
				this.aShortArray98[local1452] = this.method5693(local1575, local2826, local2845.anInt497, local2845.anInt492, arg1, local2845.anInt494, local1505, local2845.anInt491, local1507);
				@Pc(2869) Class19 local2869 = local441[local1580];
				this.aShortArray102[local1452] = this.method5693(local1580, (long) local1517 + local2826, local2869.anInt497, local2869.anInt492, arg1, local2869.anInt494, local1509, local2869.anInt491, local1026);
				@Pc(2896) Class19 local2896 = local441[local1585];
				this.aShortArray103[local1452] = this.method5693(local1585, local2826 + (long) local1519, local2896.anInt497, local2896.anInt492, arg1, local2896.anInt494, local1011, local2896.anInt491, local1020);
			} else if (local1555 == 1) {
				@Pc(2684) Class119 local2684 = local1132[local1458];
				@Pc(2729) long local2729 = ((long) (local1521 << 24) + (long) (local1465 << 8) + (long) local748 << 32) + (long) ((local2684.anInt3339 + 256 << 22) + (local1171 << 2) + ((local2684.anInt3338 <= 0 ? 2048 : 1024) - -(local2684.anInt3337 + 256 << 12)));
				this.aShortArray98[local1452] = this.method5693(arg1.aShortArray107[local1458], local2729, 0, local2684.anInt3338, arg1, local2684.anInt3337, local1505, local2684.anInt3339, local1507);
				this.aShortArray102[local1452] = this.method5693(arg1.aShortArray114[local1458], (long) local1517 + local2729, 0, local2684.anInt3338, arg1, local2684.anInt3337, local1509, local2684.anInt3339, local1026);
				this.aShortArray103[local1452] = this.method5693(arg1.aShortArray112[local1458], local2729 + (long) local1519, 0, local2684.anInt3338, arg1, local2684.anInt3337, local1011, local2684.anInt3339, local1020);
			}
			if (arg1.aShortArray109 == null) {
				this.aShortArray95[local1452] = -1;
			} else {
				this.aShortArray95[local1452] = arg1.aShortArray109[local1458];
			}
			if (arg1.aByteArray215 != null) {
				this.aByteArray202[local1452] = arg1.aByteArray215[local1458];
			}
			if (arg1.aShortArray110 != null) {
				this.aShortArray94[local1452] = arg1.aShortArray110[local1458];
			}
			this.aShortArray97[local1452] = arg1.aShortArray115[local1458];
		}
		local1458 = 0;
		local1151 = -10000;
		for (local1161 = 0; local1161 < this.anInt7339; local1161++) {
			@Pc(2989) short local2989 = this.aShortArray95[local1161];
			if (local1151 != local2989) {
				local1458++;
				local1151 = local2989;
			}
		}
		this.anIntArray490 = new int[local1458 + 1];
		local1458 = 0;
		local1151 = -10000;
		for (local1171 = 0; local1171 < this.anInt7339; local1171++) {
			@Pc(3023) short local3023 = this.aShortArray95[local1171];
			if (local1151 != local3023) {
				this.anIntArray490[local1458++] = local1171;
				local1151 = local3023;
			}
		}
		this.anIntArray490[local1458] = this.anInt7339;
		Static393.aLongArray8 = null;
		this.aShortArray101 = Static183.method2897(this.aShortArray101, this.anInt7333);
		this.aShortArray96 = Static183.method2897(this.aShortArray96, this.anInt7333);
		this.aShortArray93 = Static183.method2897(this.aShortArray93, this.anInt7333);
		this.aByteArray201 = Static263.method4259(this.anInt7333, this.aByteArray201);
		this.aFloatArray31 = Static371.method5227(this.anInt7333, this.aFloatArray31);
		this.aFloatArray32 = Static371.method5227(this.anInt7333, this.aFloatArray32);
		if (arg1.anIntArray517 != null && Static159.method2515(arg2, this.anInt7303)) {
			this.anIntArrayArray56 = arg1.method6053();
		}
		if (arg1.aClass84Array1 != null && Static373.method910(this.anInt7303, arg2)) {
			this.anIntArrayArray57 = arg1.method6051();
		}
		if (arg1.anIntArray516 != null && Static119.method1741(this.anInt7303, arg2)) {
			local748 = 0;
			@Pc(3137) int[] local3137 = new int[256];
			for (local790 = 0; local790 < this.anInt7309; local790++) {
				local804 = arg1.anIntArray516[local114[local790]];
				if (local804 >= 0) {
					if (local748 < local804) {
						local748 = local804;
					}
					@Pc(3163) int local3163 = local3137[local804]++;
				}
			}
			this.anIntArrayArray58 = new int[local748 + 1][];
			for (local804 = 0; local804 <= local748; local804++) {
				this.anIntArrayArray58[local804] = new int[local3137[local804]];
				local3137[local804] = 0;
			}
			for (local806 = 0; local806 < this.anInt7309; local806++) {
				local1231 = arg1.anIntArray516[local114[local806]];
				if (local1231 >= 0) {
					this.anIntArrayArray58[local1231][local3137[local1231]++] = local806;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "W", descriptor = "()V")
	@Override
	protected void W() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7306; local3++) {
			this.anIntArray489[local3] = this.anIntArray489[local3] + 7 >> 4;
			this.anIntArray492[local3] = this.anIntArray492[local3] + 7 >> 4;
			this.anIntArray488[local3] = this.anIntArray488[local3] + 7 >> 4;
		}
		this.aBoolean628 = false;
		if (this.aClass100_13 != null) {
			this.aClass100_13.anInterface12_4 = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ia;Lclient!fo;I)V")
	@Override
	public void method5675(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class38_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7333 == 0) {
			return;
		}
		@Pc(16) Class102_Sub2 local16 = this.aClass26_Sub1_39.aClass102_Sub2_3;
		if (!this.aBoolean628) {
			this.method5696();
		}
		@Pc(25) Class102_Sub2 local25 = (Class102_Sub2) arg0;
		this.method5694(local25);
		Static368.aFloat197 = local16.aFloat111 + local16.aFloat103 * local25.aFloat111 + local16.aFloat113 * local25.aFloat104 + local16.aFloat108 * local25.aFloat114;
		Static265.aFloat216 = local16.aFloat113 * local25.aFloat110 + local16.aFloat108 * local25.aFloat106 + local16.aFloat103 * local25.aFloat108;
		@Pc(76) float local76 = (float) this.aShort98 * Static265.aFloat216 + Static368.aFloat197;
		@Pc(84) float local84 = (float) this.aShort94 * Static265.aFloat216 + Static368.aFloat197;
		@Pc(95) float local95;
		@Pc(101) float local101;
		if (local76 > local84) {
			local95 = (float) -this.aShort91 + local84;
			local101 = (float) this.aShort91 + local76;
		} else {
			local95 = (float) -this.aShort91 + local76;
			local101 = (float) this.aShort91 + local84;
		}
		if (this.aClass26_Sub1_39.aFloat20 <= local95 || local101 <= (float) this.aClass26_Sub1_39.anInt970) {
			return;
		}
		Static38.aFloat39 = local16.aFloat104 + local25.aFloat111 * local16.aFloat112 + local25.aFloat104 * local16.aFloat109 + local16.aFloat110 * local25.aFloat114;
		Static225.aFloat142 = local25.aFloat110 * local16.aFloat109 + local16.aFloat110 * local25.aFloat106 + local25.aFloat108 * local16.aFloat112;
		@Pc(178) float local178 = (float) this.aShort98 * Static225.aFloat142 + Static38.aFloat39;
		@Pc(186) float local186 = Static38.aFloat39 + (float) this.aShort94 * Static225.aFloat142;
		@Pc(212) float local212;
		@Pc(201) float local201;
		if (local178 > local186) {
			local201 = ((float) this.aShort91 + local178) * (float) this.aClass26_Sub1_39.anInt958;
			local212 = (local186 - (float) this.aShort91) * (float) this.aClass26_Sub1_39.anInt958;
		} else {
			local201 = (float) this.aClass26_Sub1_39.anInt958 * (local186 + (float) this.aShort91);
			local212 = (local178 - (float) this.aShort91) * (float) this.aClass26_Sub1_39.anInt958;
		}
		if (local212 / local101 >= this.aClass26_Sub1_39.aFloat19 || local201 / local101 <= this.aClass26_Sub1_39.aFloat31) {
			return;
		}
		Static212.aFloat133 = local16.aFloat107 * local25.aFloat104 + local25.aFloat114 * local16.aFloat106 + local25.aFloat111 * local16.aFloat105 + local16.aFloat114;
		Static90.aFloat68 = local16.aFloat105 * local25.aFloat108 + local16.aFloat106 * local25.aFloat106 + local25.aFloat110 * local16.aFloat107;
		@Pc(301) float local301 = (float) this.aShort98 * Static90.aFloat68 + Static212.aFloat133;
		@Pc(309) float local309 = (float) this.aShort94 * Static90.aFloat68 + Static212.aFloat133;
		@Pc(336) float local336;
		@Pc(324) float local324;
		if (local309 < local301) {
			local324 = (local301 + (float) this.aShort91) * (float) this.aClass26_Sub1_39.anInt941;
			local336 = (float) this.aClass26_Sub1_39.anInt941 * ((float) -this.aShort91 + local309);
		} else {
			local324 = (local309 + (float) this.aShort91) * (float) this.aClass26_Sub1_39.anInt941;
			local336 = ((float) -this.aShort91 + local301) * (float) this.aClass26_Sub1_39.anInt941;
		}
		if (local336 / local101 >= this.aClass26_Sub1_39.aFloat37 || local324 / local101 <= this.aClass26_Sub1_39.aFloat26) {
			return;
		}
		if (arg1 != null || this.aClass259Array1 != null) {
			Static396.aFloat207 = local25.aFloat113 * local16.aFloat112 + local16.aFloat109 * local25.aFloat109 + local16.aFloat110 * local25.aFloat107;
			Static62.aFloat60 = local16.aFloat105 * local25.aFloat103 + local16.aFloat107 * local25.aFloat112 + local16.aFloat106 * local25.aFloat105;
			Static322.aFloat174 = local16.aFloat108 * local25.aFloat105 + local25.aFloat112 * local16.aFloat113 + local25.aFloat103 * local16.aFloat103;
			Static45.aFloat217 = local16.aFloat105 * local25.aFloat113 + local25.aFloat109 * local16.aFloat107 + local25.aFloat107 * local16.aFloat106;
			Static251.aFloat152 = local16.aFloat113 * local25.aFloat109 + local25.aFloat107 * local16.aFloat108 + local16.aFloat103 * local25.aFloat113;
			Static65.aFloat228 = local16.aFloat110 * local25.aFloat105 + local25.aFloat112 * local16.aFloat109 + local25.aFloat103 * local16.aFloat112;
		}
		if (arg1 != null) {
			@Pc(496) boolean local496 = false;
			@Pc(498) boolean local498 = true;
			@Pc(506) int local506 = this.aShort97 + this.aShort92 >> 1;
			@Pc(514) int local514 = this.aShort90 + this.aShort93 >> 1;
			@Pc(533) int local533 = (int) ((float) this.aShort98 * Static225.aFloat142 + (float) local506 * Static396.aFloat207 + Static38.aFloat39 + Static65.aFloat228 * (float) local514);
			@Pc(552) int local552 = (int) ((float) local514 * Static62.aFloat60 + Static212.aFloat133 + Static45.aFloat217 * (float) local506 + Static90.aFloat68 * (float) this.aShort98);
			@Pc(571) int local571 = (int) ((float) local514 * Static322.aFloat174 + (float) this.aShort98 * Static265.aFloat216 + Static251.aFloat152 * (float) local506 + Static368.aFloat197);
			if (local571 >= this.aClass26_Sub1_39.anInt970) {
				arg1.anInt2397 = this.aClass26_Sub1_39.anInt958 * local533 / local571 + this.aClass26_Sub1_39.anInt946;
				arg1.anInt2399 = this.aClass26_Sub1_39.anInt941 * local552 / local571 + this.aClass26_Sub1_39.anInt935;
			} else {
				local496 = true;
			}
			@Pc(629) int local629 = (int) ((float) this.aShort94 * Static225.aFloat142 + (float) local506 * Static396.aFloat207 + Static38.aFloat39 + Static65.aFloat228 * (float) local514);
			@Pc(648) int local648 = (int) ((float) local514 * Static62.aFloat60 + Static212.aFloat133 + (float) local506 * Static45.aFloat217 + (float) this.aShort94 * Static90.aFloat68);
			@Pc(667) int local667 = (int) ((float) local514 * Static322.aFloat174 + (float) local506 * Static251.aFloat152 + Static368.aFloat197 + (float) this.aShort94 * Static265.aFloat216);
			if (this.aClass26_Sub1_39.anInt970 <= local667) {
				arg1.anInt2400 = this.aClass26_Sub1_39.anInt941 * local648 / local667 + this.aClass26_Sub1_39.anInt935;
				arg1.anInt2401 = local629 * this.aClass26_Sub1_39.anInt958 / local667 + this.aClass26_Sub1_39.anInt946;
			} else {
				local496 = true;
			}
			if (local496) {
				if (this.aClass26_Sub1_39.anInt970 > local571 && this.aClass26_Sub1_39.anInt970 > local667) {
					local498 = false;
				} else {
					@Pc(753) int local753;
					@Pc(764) int local764;
					@Pc(775) int local775;
					if (local571 < this.aClass26_Sub1_39.anInt970) {
						local753 = (local667 - this.aClass26_Sub1_39.anInt970 << 16) / (local667 - local571);
						local764 = ((local629 - local533) * local753 >> 16) + local629;
						arg1.anInt2397 = this.aClass26_Sub1_39.anInt958 * local764 / this.aClass26_Sub1_39.anInt970 + this.aClass26_Sub1_39.anInt946;
						local775 = (local753 * (local648 - local552) >> 16) + local648;
						arg1.anInt2399 = this.aClass26_Sub1_39.anInt935 + this.aClass26_Sub1_39.anInt941 * local775 / this.aClass26_Sub1_39.anInt970;
					} else if (this.aClass26_Sub1_39.anInt970 > local667) {
						local753 = (local571 - this.aClass26_Sub1_39.anInt970 << 16) / (local571 - local667);
						local764 = local533 + ((local533 - local629) * local753 >> 16);
						local775 = local552 + (local753 * (local552 - local648) >> 16);
						arg1.anInt2397 = local764 * this.aClass26_Sub1_39.anInt958 / this.aClass26_Sub1_39.anInt970 + this.aClass26_Sub1_39.anInt946;
						arg1.anInt2399 = this.aClass26_Sub1_39.anInt941 * local775 / this.aClass26_Sub1_39.anInt970 + this.aClass26_Sub1_39.anInt935;
					}
				}
			}
			if (local498) {
				if (local571 > local667) {
					arg1.anInt2398 = (local533 + this.aShort91) * this.aClass26_Sub1_39.anInt958 / local571 + this.aClass26_Sub1_39.anInt946 - arg1.anInt2397;
				} else {
					arg1.anInt2398 = (this.aShort91 + local629) * this.aClass26_Sub1_39.anInt958 / local667 + this.aClass26_Sub1_39.anInt946 - arg1.anInt2401;
				}
				arg1.aBoolean201 = true;
			}
		}
		this.aClass26_Sub1_39.method666();
		this.aClass26_Sub1_39.method697(local25);
		this.method5688();
		this.aClass26_Sub1_39.method654();
		this.method5699();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	private void method5686() {
		if (!this.aBoolean627) {
			return;
		}
		this.aBoolean627 = false;
		if (this.aClass202Array3 == null && this.aClass17Array3 == null && this.aClass259Array1 == null) {
			if (this.anIntArray489 != null && !Static45.method5679(this.anInt7303, this.anInt7305)) {
				if (this.aClass100_13 != null && this.aClass100_13.anInterface12_4 == null) {
					this.aBoolean627 = true;
				} else {
					if (!this.aBoolean628) {
						this.method5696();
					}
					this.anIntArray489 = null;
				}
			}
			if (this.anIntArray492 != null && !Static304.method4373(this.anInt7303, this.anInt7305)) {
				if (this.aClass100_13 != null && this.aClass100_13.anInterface12_4 == null) {
					this.aBoolean627 = true;
				} else {
					if (!this.aBoolean628) {
						this.method5696();
					}
					this.anIntArray492 = null;
				}
			}
			if (this.anIntArray488 != null && !Static312.method2254(this.anInt7305, this.anInt7303)) {
				if (this.aClass100_13 != null && this.aClass100_13.anInterface12_4 == null) {
					this.aBoolean627 = true;
				} else {
					if (!this.aBoolean628) {
						this.method5696();
					}
					this.anIntArray488 = null;
				}
			}
		}
		if (this.aShortArray99 != null && this.anIntArray489 == null && this.anIntArray492 == null && this.anIntArray488 == null) {
			this.anIntArray491 = null;
			this.aShortArray99 = null;
		}
		if (this.aByteArray201 != null && !Static157.method2351(this.anInt7305, this.anInt7303)) {
			if (this.aClass100_14 == null) {
				if (this.aClass100_16 != null && this.aClass100_16.anInterface12_4 == null) {
					this.aBoolean627 = true;
				} else {
					this.aByteArray201 = null;
					this.aShortArray101 = this.aShortArray96 = this.aShortArray93 = null;
				}
			} else if (this.aClass100_14.anInterface12_4 == null) {
				this.aBoolean627 = true;
			} else {
				this.aShortArray101 = this.aShortArray96 = this.aShortArray93 = null;
				this.aByteArray201 = null;
			}
		}
		if (this.aShortArray97 != null && !Static302.method3958(this.anInt7303, this.anInt7305)) {
			if (this.aClass100_16 != null && this.aClass100_16.anInterface12_4 == null) {
				this.aBoolean627 = true;
			} else {
				this.aShortArray97 = null;
			}
		}
		if (this.aByteArray202 != null && !Static330.method4707(this.anInt7303, this.anInt7305)) {
			if (this.aClass100_16 != null && this.aClass100_16.anInterface12_4 == null) {
				this.aBoolean627 = true;
			} else {
				this.aByteArray202 = null;
			}
		}
		if (this.aFloatArray31 != null && !Static268.method4008(this.anInt7305, this.anInt7303)) {
			if (this.aClass100_15 != null && this.aClass100_15.anInterface12_4 == null) {
				this.aBoolean627 = true;
			} else {
				this.aFloatArray31 = this.aFloatArray32 = null;
			}
		}
		if (this.aShortArray95 != null && !Static38.method722(this.anInt7303, this.anInt7305)) {
			if (this.aClass100_16 != null && this.aClass100_16.anInterface12_4 == null) {
				this.aBoolean627 = true;
			} else {
				this.aShortArray95 = null;
			}
		}
		if (this.aShortArray98 != null && !Static177.method2783(this.anInt7303, this.anInt7305)) {
			if (this.aClass75_1 != null && this.aClass75_1.anInterface4_3 == null || this.aClass100_16 != null && this.aClass100_16.anInterface12_4 == null) {
				this.aBoolean627 = true;
			} else {
				this.aShortArray98 = this.aShortArray102 = this.aShortArray103 = null;
			}
		}
		if (this.anIntArrayArray58 != null && !Static119.method1741(this.anInt7303, this.anInt7305)) {
			this.anIntArrayArray58 = null;
			this.aShortArray94 = null;
		}
		if (this.anIntArrayArray56 != null && !Static159.method2515(this.anInt7305, this.anInt7303)) {
			this.anIntArrayArray56 = null;
			this.aShortArray100 = null;
		}
		if (this.anIntArrayArray57 != null && !Static373.method910(this.anInt7303, this.anInt7305)) {
			this.anIntArrayArray57 = null;
		}
		if (this.anIntArray490 != null && (this.anInt7305 & 0x800) == 0 && (this.anInt7305 & 0x40000) == 0) {
			this.anIntArray490 = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		this.aShort96 = (short) arg0;
		if (this.aClass100_16 != null) {
			this.aClass100_16.anInterface12_4 = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BIZ)Lclient!c;")
	@Override
	public Class32 method5678(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class32_Sub2 local18;
		@Pc(14) Class32_Sub2 local14;
		if (arg0 == 1) {
			local14 = this.aClass26_Sub1_39.aClass32_Sub2_9;
			local18 = this.aClass26_Sub1_39.aClass32_Sub2_5;
		} else if (arg0 == 2) {
			local14 = this.aClass26_Sub1_39.aClass32_Sub2_1;
			local18 = this.aClass26_Sub1_39.aClass32_Sub2_6;
		} else if (arg0 == 3) {
			local18 = this.aClass26_Sub1_39.aClass32_Sub2_2;
			local14 = this.aClass26_Sub1_39.aClass32_Sub2_10;
		} else if (arg0 == 4) {
			local14 = this.aClass26_Sub1_39.aClass32_Sub2_7;
			local18 = this.aClass26_Sub1_39.aClass32_Sub2_3;
		} else if (arg0 == 5) {
			local14 = this.aClass26_Sub1_39.aClass32_Sub2_4;
			local18 = this.aClass26_Sub1_39.aClass32_Sub2_8;
		} else {
			local18 = local14 = new Class32_Sub2(this.aClass26_Sub1_39);
		}
		return this.method5690(local18, arg2, arg0 != 0, arg1, local14);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
	private void method5688() {
		if (this.anInt7339 == 0) {
			return;
		}
		if (this.aByte99 != 0) {
			this.method5702(true);
		}
		this.method5702(false);
		if (this.aClass75_1 != null) {
			if (this.aClass75_1.anInterface4_3 == null) {
				this.method5703((this.aByte99 & 0x10) != 0);
			}
			if (this.aClass75_1.anInterface4_3 != null) {
				this.aClass26_Sub1_39.method662(this.aClass100_14 != null);
				this.aClass26_Sub1_39.method668(this.aClass100_15, this.aClass100_13, this.aClass100_14, this.aClass100_16);
				@Pc(76) int local76 = this.anIntArray490.length - 1;
				for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
					@Pc(85) int local85 = this.anIntArray490[local78];
					@Pc(92) int local92 = this.anIntArray490[local78 + 1];
					@Pc(99) int local99 = this.aShortArray95[local85] & 0xFFFF;
					if (local99 == 65535) {
						local99 = -1;
					}
					this.aClass26_Sub1_39.method678(this.aClass100_14 != null, local99);
					this.aClass26_Sub1_39.method664(local85 * 3, (local92 - local85) * 3, this.aClass75_1.anInterface4_3);
				}
			}
		}
		this.method5686();
	}

	@OriginalMember(owner = "client!ve", name = "VA", descriptor = "()I")
	@Override
	public int VA() {
		if (!this.aBoolean628) {
			this.method5696();
		}
		return this.aShort92;
	}

	@OriginalMember(owner = "client!ve", name = "XA", descriptor = "(III)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7289; local3++) {
			if (arg0 != 128) {
				this.anIntArray489[local3] = this.anIntArray489[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray492[local3] = this.anIntArray492[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray488[local3] = arg2 * this.anIntArray488[local3] >> 7;
			}
		}
		this.aBoolean628 = false;
		if (this.aClass100_13 != null) {
			this.aClass100_13.anInterface12_4 = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	@Override
	public Class2_Sub2_Sub9 ua(@OriginalArg(0) Class2_Sub2_Sub9 arg0) {
		if (this.anInt7333 == 0) {
			return null;
		}
		if (!this.aBoolean628) {
			this.method5696();
		}
		@Pc(39) int local39;
		@Pc(56) int local56;
		if (this.aClass26_Sub1_39.anInt937 > 0) {
			local39 = this.aShort97 - (this.aClass26_Sub1_39.anInt937 * this.aShort94 >> 8) >> this.aClass26_Sub1_39.anInt924;
			local56 = this.aShort92 - (this.aShort98 * this.aClass26_Sub1_39.anInt937 >> 8) >> this.aClass26_Sub1_39.anInt924;
		} else {
			local39 = this.aShort97 - (this.aShort98 * this.aClass26_Sub1_39.anInt937 >> 8) >> this.aClass26_Sub1_39.anInt924;
			local56 = this.aShort92 - (this.aClass26_Sub1_39.anInt937 * this.aShort94 >> 8) >> this.aClass26_Sub1_39.anInt924;
		}
		@Pc(116) int local116;
		@Pc(133) int local133;
		if (this.aClass26_Sub1_39.anInt967 <= 0) {
			local116 = this.aShort90 - (this.aClass26_Sub1_39.anInt967 * this.aShort98 >> 8) >> this.aClass26_Sub1_39.anInt924;
			local133 = this.aShort93 - (this.aClass26_Sub1_39.anInt967 * this.aShort94 >> 8) >> this.aClass26_Sub1_39.anInt924;
		} else {
			local116 = this.aShort90 - (this.aShort94 * this.aClass26_Sub1_39.anInt967 >> 8) >> this.aClass26_Sub1_39.anInt924;
			local133 = this.aShort93 - (this.aShort98 * this.aClass26_Sub1_39.anInt967 >> 8) >> this.aClass26_Sub1_39.anInt924;
		}
		@Pc(175) int local175 = local56 + 1 - local39;
		@Pc(181) int local181 = local133 + 1 - local116;
		@Pc(184) Class2_Sub2_Sub9_Sub1 local184 = (Class2_Sub2_Sub9_Sub1) arg0;
		@Pc(200) Class2_Sub2_Sub9_Sub1 local200;
		if (local184 != null && local184.method5942(local181, local175)) {
			local200 = local184;
			local184.method5944();
		} else {
			local200 = new Class2_Sub2_Sub9_Sub1(this.aClass26_Sub1_39, local175, local181);
		}
		local200.method5939(local39, local56, local133, local116);
		this.method5697(local200);
		return local200;
	}

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class184.anIntArray349[arg0];
		@Pc(13) int local13 = Class184.anIntArray350[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7289; local15++) {
			@Pc(33) int local33 = this.anIntArray489[local15] * local13 + this.anIntArray492[local15] * local9 >> 15;
			this.anIntArray492[local15] = this.anIntArray492[local15] * local13 - local9 * this.anIntArray489[local15] >> 15;
			this.anIntArray489[local15] = local33;
		}
		this.aBoolean628 = false;
		if (this.aClass100_13 != null) {
			this.aClass100_13.anInterface12_4 = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	@Override
	public void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean628) {
			this.method5696();
		}
		@Pc(17) int local17 = arg4 + this.aShort97;
		@Pc(22) int local22 = this.aShort92 + arg4;
		@Pc(28) int local28 = arg6 + this.aShort90;
		@Pc(33) int local33 = this.aShort93 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt6997 + local22 >> arg2.anInt7000 >= arg2.anInt6999 || local28 < 0 || local33 + arg2.anInt6997 >> arg2.anInt7000 >= arg2.anInt7001)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || arg3.anInt6997 + local22 >> arg3.anInt7000 >= arg3.anInt6999 || local28 < 0 || arg3.anInt7001 <= arg3.anInt6997 + local33 >> arg3.anInt7000) {
				return;
			}
		} else {
			local17 >>= arg2.anInt7000;
			local22 = arg2.anInt6997 + local22 - 1 >> arg2.anInt7000;
			local28 >>= arg2.anInt7000;
			local33 = local33 + arg2.anInt6997 - 1 >> arg2.anInt7000;
			if (arg2.I(local17, local28) == arg5 && arg5 == arg2.I(local22, local28) && arg2.I(local17, local33) == arg5 && arg5 == arg2.I(local22, local33)) {
				return;
			}
		}
		@Pc(206) int local206;
		if (arg0 == 1) {
			for (local206 = 0; local206 < this.anInt7289; local206++) {
				this.anIntArray492[local206] = this.anIntArray492[local206] + arg2.va(arg4 + this.anIntArray489[local206], arg6 + this.anIntArray488[local206]) - arg5;
			}
		} else {
			@Pc(267) int local267;
			@Pc(276) int local276;
			if (arg0 == 2) {
				@Pc(477) short local477 = this.aShort98;
				if (local477 == 0) {
					return;
				}
				for (local267 = 0; local267 < this.anInt7289; local267++) {
					local276 = (this.anIntArray492[local267] << 16) / local477;
					if (local276 < arg1) {
						this.anIntArray492[local267] -= -((arg2.va(this.anIntArray489[local267] + arg4, arg6 + this.anIntArray488[local267]) - arg5) * (arg1 + -local276) / arg1);
					}
				}
			} else {
				@Pc(283) int local283;
				if (arg0 == 3) {
					local206 = (arg1 & 0xFF) * 4;
					local267 = (arg1 >> 8 & 0xFF) * 4;
					local276 = (arg1 >> 16 & 0xFF) << 6;
					local283 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local206 >> 1) < 0 || arg2.anInt6997 + (local206 >> 1) + arg4 >= arg2.anInt6999 << arg2.anInt7000 || arg6 - (local267 >> 1) < 0 || arg2.anInt7001 << arg2.anInt7000 <= arg2.anInt6997 + arg6 + (local267 >> 1)) {
						return;
					}
					this.method5685(local206, arg6, local283, local276, arg2, arg4, arg5, local267);
				} else if (arg0 == 4) {
					local206 = this.aShort94 - this.aShort98;
					for (local267 = 0; local267 < this.anInt7289; local267++) {
						this.anIntArray492[local267] = this.anIntArray492[local267] + arg3.va(arg4 + this.anIntArray489[local267], this.anIntArray488[local267] + arg6) + local206 - arg5;
					}
				} else if (arg0 == 5) {
					local206 = this.aShort94 - this.aShort98;
					for (local267 = 0; local267 < this.anInt7289; local267++) {
						local276 = arg4 + this.anIntArray489[local267];
						local283 = arg6 + this.anIntArray488[local267];
						@Pc(288) int local288 = arg2.va(local276, local283);
						@Pc(293) int local293 = arg3.va(local276, local283);
						@Pc(298) int local298 = local288 - local293;
						this.anIntArray492[local267] = local288 + ((this.anIntArray492[local267] << 8) / local206 * local298 >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass100_13 != null) {
			this.aClass100_13.anInterface12_4 = null;
		}
		this.aBoolean628 = false;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ia;Lclient!fo;II)V")
	@Override
	public void method5677(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class38_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7333 == 0) {
			return;
		}
		@Pc(16) Class102_Sub2 local16 = this.aClass26_Sub1_39.aClass102_Sub2_3;
		if (!this.aBoolean628) {
			this.method5696();
		}
		@Pc(25) Class102_Sub2 local25 = (Class102_Sub2) arg0;
		Static368.aFloat197 = local25.aFloat104 * local16.aFloat113 + local16.aFloat108 * local25.aFloat114 + local16.aFloat103 * local25.aFloat111 + local16.aFloat111;
		Static265.aFloat216 = local16.aFloat108 * local25.aFloat106 + local16.aFloat113 * local25.aFloat110 + local25.aFloat108 * local16.aFloat103;
		@Pc(72) float local72 = (float) this.aShort98 * Static265.aFloat216 + Static368.aFloat197;
		@Pc(80) float local80 = Static368.aFloat197 + Static265.aFloat216 * (float) this.aShort94;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local91 = local80 - (float) this.aShort91;
			local97 = (float) this.aShort91 + local72;
		} else {
			local91 = (float) -this.aShort91 + local72;
			local97 = (float) this.aShort91 + local80;
		}
		if (this.aClass26_Sub1_39.bf <= local91 || (float) this.aClass26_Sub1_39.anInt970 >= local97) {
			return;
		}
		Static38.aFloat39 = local16.aFloat104 + local16.aFloat112 * local25.aFloat111 + local25.aFloat104 * local16.aFloat109 + local16.aFloat110 * local25.aFloat114;
		Static225.aFloat142 = local16.aFloat109 * local25.aFloat110 + local16.aFloat110 * local25.aFloat106 + local25.aFloat108 * local16.aFloat112;
		@Pc(173) float local173 = Static38.aFloat39 + Static225.aFloat142 * (float) this.aShort98;
		@Pc(181) float local181 = Static38.aFloat39 + (float) this.aShort94 * Static225.aFloat142;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local173 > local181) {
			local197 = (float) this.aClass26_Sub1_39.anInt958 * (local181 - (float) this.aShort91);
			local208 = (float) this.aClass26_Sub1_39.anInt958 * ((float) this.aShort91 + local173);
		} else {
			local197 = (float) this.aClass26_Sub1_39.anInt958 * ((float) -this.aShort91 + local173);
			local208 = (float) this.aClass26_Sub1_39.anInt958 * ((float) this.aShort91 + local181);
		}
		if (local197 / (float) arg2 >= this.aClass26_Sub1_39.aFloat19 || this.aClass26_Sub1_39.aFloat31 >= local208 / (float) arg2) {
			return;
		}
		Static90.aFloat68 = local25.aFloat110 * local16.aFloat107 + local25.aFloat106 * local16.aFloat106 + local25.aFloat108 * local16.aFloat105;
		Static212.aFloat133 = local16.aFloat114 + local25.aFloat111 * local16.aFloat105 + local16.aFloat106 * local25.aFloat114 + local16.aFloat107 * local25.aFloat104;
		@Pc(299) float local299 = Static90.aFloat68 * (float) this.aShort98 + Static212.aFloat133;
		@Pc(307) float local307 = Static212.aFloat133 + (float) this.aShort94 * Static90.aFloat68;
		@Pc(323) float local323;
		@Pc(334) float local334;
		if (local299 > local307) {
			local323 = ((float) -this.aShort91 + local307) * (float) this.aClass26_Sub1_39.anInt941;
			local334 = (local299 + (float) this.aShort91) * (float) this.aClass26_Sub1_39.anInt941;
		} else {
			local323 = ((float) -this.aShort91 + local299) * (float) this.aClass26_Sub1_39.anInt941;
			local334 = (local307 + (float) this.aShort91) * (float) this.aClass26_Sub1_39.anInt941;
		}
		if (local323 / (float) arg2 >= this.aClass26_Sub1_39.aFloat37 || local334 / (float) arg2 <= this.aClass26_Sub1_39.aFloat26) {
			return;
		}
		if (arg1 != null || this.aClass259Array1 != null) {
			Static396.aFloat207 = local25.aFloat109 * local16.aFloat109 + local25.aFloat107 * local16.aFloat110 + local16.aFloat112 * local25.aFloat113;
			Static62.aFloat60 = local16.aFloat106 * local25.aFloat105 + local25.aFloat112 * local16.aFloat107 + local16.aFloat105 * local25.aFloat103;
			Static65.aFloat228 = local16.aFloat112 * local25.aFloat103 + local25.aFloat105 * local16.aFloat110 + local16.aFloat109 * local25.aFloat112;
			Static322.aFloat174 = local25.aFloat103 * local16.aFloat103 + local16.aFloat113 * local25.aFloat112 + local16.aFloat108 * local25.aFloat105;
			Static45.aFloat217 = local16.aFloat106 * local25.aFloat107 + local25.aFloat109 * local16.aFloat107 + local16.aFloat105 * local25.aFloat113;
			Static251.aFloat152 = local16.aFloat108 * local25.aFloat107 + local16.aFloat113 * local25.aFloat109 + local16.aFloat103 * local25.aFloat113;
		}
		if (arg1 != null) {
			@Pc(502) int local502 = this.aShort97 + this.aShort92 >> 1;
			@Pc(510) int local510 = this.aShort93 + this.aShort90 >> 1;
			@Pc(529) int local529 = (int) ((float) local510 * Static65.aFloat228 + Static38.aFloat39 + (float) local502 * Static396.aFloat207 + Static225.aFloat142 * (float) this.aShort98);
			@Pc(548) int local548 = (int) (Static62.aFloat60 * (float) local510 + (float) local502 * Static45.aFloat217 + Static212.aFloat133 + Static90.aFloat68 * (float) this.aShort98);
			@Pc(567) int local567 = (int) (Static368.aFloat197 + Static251.aFloat152 * (float) local502 + Static265.aFloat216 * (float) this.aShort98 + (float) local510 * Static322.aFloat174);
			@Pc(586) int local586 = (int) ((float) local510 * Static65.aFloat228 + (float) this.aShort94 * Static225.aFloat142 + Static396.aFloat207 * (float) local502 + Static38.aFloat39);
			@Pc(605) int local605 = (int) (Static90.aFloat68 * (float) this.aShort94 + (float) local502 * Static45.aFloat217 + Static212.aFloat133 + Static62.aFloat60 * (float) local510);
			@Pc(624) int local624 = (int) ((float) local510 * Static322.aFloat174 + Static368.aFloat197 + Static251.aFloat152 * (float) local502 + (float) this.aShort94 * Static265.aFloat216);
			arg1.anInt2397 = local529 * this.aClass26_Sub1_39.anInt958 / arg2 + this.aClass26_Sub1_39.anInt946;
			arg1.anInt2400 = local605 * this.aClass26_Sub1_39.anInt941 / arg2 + this.aClass26_Sub1_39.anInt935;
			arg1.anInt2401 = this.aClass26_Sub1_39.anInt946 + this.aClass26_Sub1_39.anInt958 * local586 / arg2;
			arg1.anInt2399 = local548 * this.aClass26_Sub1_39.anInt941 / arg2 + this.aClass26_Sub1_39.anInt935;
			if (local567 < this.aClass26_Sub1_39.anInt970 && local624 < this.aClass26_Sub1_39.anInt970) {
				arg1.anInt2398 = this.aClass26_Sub1_39.anInt946 + (this.aShort91 + local529) * this.aClass26_Sub1_39.anInt958 / arg2 - arg1.anInt2397;
				arg1.aBoolean201 = true;
			}
		}
		this.aClass26_Sub1_39.method680((float) arg2);
		this.aClass26_Sub1_39.method645();
		this.aClass26_Sub1_39.method697(local25);
		this.method5688();
		this.aClass26_Sub1_39.method654();
		this.method5699();
	}

	@OriginalMember(owner = "client!ve", name = "va", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static97.anInt2177 = 0;
			Static135.anInt2655 = 0;
			Static15.anInt384 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray56.length > local41) {
					local51 = this.anIntArrayArray56[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray100 == null || (arg6 & this.aShortArray100[local59]) != 0) {
							Static97.anInt2177 += this.anIntArray489[local59];
							Static135.anInt2655 += this.anIntArray492[local59];
							local33++;
							Static15.anInt384 += this.anIntArray488[local59];
						}
					}
				}
			}
			if (local33 <= 0) {
				Static135.anInt2655 = arg3;
				Static97.anInt2177 = arg2;
				Static15.anInt384 = arg4;
			} else {
				Static15.anInt384 = Static15.anInt384 / local33 + arg4;
				Static24.aBoolean45 = true;
				Static97.anInt2177 = Static97.anInt2177 / local33 + arg2;
				Static135.anInt2655 = Static135.anInt2655 / local33 + arg3;
			}
			return;
		}
		@Pc(246) int[] local246;
		@Pc(248) int local248;
		if (arg0 == 1) {
			if (arg7 != null) {
				local33 = arg4 * arg7[2] + arg7[1] * arg3 + arg2 * arg7[0] + 16384 >> 15;
				local35 = arg4 * arg7[5] + arg2 * arg7[3] + arg7[4] * arg3 + 16384 >> 15;
				local41 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 16384 >> 15;
				arg2 = local33;
				arg4 = local41;
				arg3 = local35;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray56.length > local35) {
					local246 = this.anIntArrayArray56[local35];
					for (local248 = 0; local248 < local246.length; local248++) {
						local53 = local246[local248];
						if (this.aShortArray100 == null || (this.aShortArray100[local53] & arg6) != 0) {
							this.anIntArray489[local53] += arg2;
							this.anIntArray492[local53] += arg3;
							this.anIntArray488[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(374) int local374;
		@Pc(396) int local396;
		@Pc(423) int local423;
		@Pc(454) int local454;
		@Pc(458) int local458;
		@Pc(462) int local462;
		@Pc(466) int local466;
		@Pc(474) int local474;
		@Pc(482) int local482;
		@Pc(637) int local637;
		@Pc(662) int local662;
		@Pc(666) int local666;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(683) int local683;
		@Pc(687) int local687;
		@Pc(689) int local689;
		@Pc(819) int[] local819;
		@Pc(821) int local821;
		@Pc(825) int local825;
		@Pc(829) int local829;
		@Pc(831) int local831;
		@Pc(959) int local959;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray56.length) {
						local246 = this.anIntArrayArray56[local35];
						for (local248 = 0; local248 < local246.length; local248++) {
							local53 = local246[local248];
							if (this.aShortArray100 == null || (arg6 & this.aShortArray100[local53]) != 0) {
								this.anIntArray489[local53] -= Static97.anInt2177;
								this.anIntArray492[local53] -= Static135.anInt2655;
								this.anIntArray488[local53] -= Static15.anInt384;
								if (arg4 != 0) {
									local59 = Class184.anIntArray349[arg4];
									local374 = Class184.anIntArray350[arg4];
									local396 = local59 * this.anIntArray492[local53] + this.anIntArray489[local53] * local374 + 32767 >> 15;
									this.anIntArray492[local53] = this.anIntArray492[local53] * local374 + 32767 - this.anIntArray489[local53] * local59 >> 15;
									this.anIntArray489[local53] = local396;
								}
								if (arg2 != 0) {
									local59 = Class184.anIntArray349[arg2];
									local374 = Class184.anIntArray350[arg2];
									local396 = local374 * this.anIntArray492[local53] + 32767 - this.anIntArray488[local53] * local59 >> 15;
									this.anIntArray488[local53] = this.anIntArray488[local53] * local374 + this.anIntArray492[local53] * local59 + 32767 >> 15;
									this.anIntArray492[local53] = local396;
								}
								if (arg3 != 0) {
									local59 = Class184.anIntArray349[arg3];
									local374 = Class184.anIntArray350[arg3];
									local396 = local59 * this.anIntArray488[local53] + this.anIntArray489[local53] * local374 + 32767 >> 15;
									this.anIntArray488[local53] = local374 * this.anIntArray488[local53] + 32767 - local59 * this.anIntArray489[local53] >> 15;
									this.anIntArray489[local53] = local396;
								}
								this.anIntArray489[local53] += Static97.anInt2177;
								this.anIntArray492[local53] += Static135.anInt2655;
								this.anIntArray488[local53] += Static15.anInt384;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray56.length > local41) {
							local51 = this.anIntArrayArray56[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray100 == null || (arg6 & this.aShortArray100[local59]) != 0) {
									local374 = this.anIntArray491[local59];
									local396 = this.anIntArray491[local59 + 1];
									for (local423 = local374; local423 < local396; local423++) {
										local454 = this.aShortArray99[local423] - 1;
										if (local454 == -1) {
											break;
										}
										if (arg4 != 0) {
											local458 = Class184.anIntArray349[arg4];
											local462 = Class184.anIntArray350[arg4];
											local466 = this.aShortArray96[local454] * local458 + this.aShortArray101[local454] * local462 + 32767 >> 15;
											this.aShortArray96[local454] = (short) (local462 * this.aShortArray96[local454] + 32767 - this.aShortArray101[local454] * local458 >> 15);
											this.aShortArray101[local454] = (short) local466;
										}
										if (arg2 != 0) {
											local458 = Class184.anIntArray349[arg2];
											local462 = Class184.anIntArray350[arg2];
											local466 = this.aShortArray96[local454] * local462 + 32767 - this.aShortArray93[local454] * local458 >> 15;
											this.aShortArray93[local454] = (short) (local462 * this.aShortArray93[local454] + local458 * this.aShortArray96[local454] + 32767 >> 15);
											this.aShortArray96[local454] = (short) local466;
										}
										if (arg3 != 0) {
											local458 = Class184.anIntArray349[arg3];
											local462 = Class184.anIntArray350[arg3];
											local466 = this.aShortArray93[local454] * local458 + this.aShortArray101[local454] * local462 + 32767 >> 15;
											this.aShortArray93[local454] = (short) (this.aShortArray93[local454] * local462 + 32767 - local458 * this.aShortArray101[local454] >> 15);
											this.aShortArray101[local454] = (short) local466;
										}
									}
								}
							}
						}
					}
					if (this.aClass100_14 == null && this.aClass100_16 != null) {
						this.aClass100_16.anInterface12_4 = null;
					}
					if (this.aClass100_14 != null) {
						this.aClass100_14.anInterface12_4 = null;
					}
				}
			} else {
				local33 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local248 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static24.aBoolean45) {
					local374 = Static97.anInt2177 * arg7[0] + arg7[3] * Static135.anInt2655 + arg7[6] * Static15.anInt384 + 16384 >> 15;
					local396 = Static15.anInt384 * arg7[7] + arg7[4] * Static135.anInt2655 + arg7[1] * Static97.anInt2177 + 16384 >> 15;
					local396 += local53;
					local423 = Static97.anInt2177 * arg7[2] + arg7[5] * Static135.anInt2655 + Static15.anInt384 * arg7[8] + 16384 >> 15;
					local374 += local248;
					Static135.anInt2655 = local396;
					Static97.anInt2177 = local374;
					local423 += local59;
					Static24.aBoolean45 = false;
					Static15.anInt384 = local423;
				}
				@Pc(442) int[] local442 = new int[9];
				local396 = Class184.anIntArray350[arg2];
				local423 = Class184.anIntArray349[arg2];
				local454 = Class184.anIntArray350[arg3];
				local458 = Class184.anIntArray349[arg3];
				local462 = Class184.anIntArray350[arg4];
				local466 = Class184.anIntArray349[arg4];
				local474 = local462 * local423 + 16384 >> 15;
				local482 = local466 * local423 + 16384 >> 15;
				local442[5] = -local423;
				local442[2] = local396 * local458 + 16384 >> 15;
				local442[0] = local454 * local462 + local458 * local482 + 16384 >> 15;
				local442[8] = local454 * local396 + 16384 >> 15;
				local442[1] = local466 * -local454 + local458 * local474 + 16384 >> 15;
				local442[3] = local396 * local466 + 16384 >> 15;
				local442[7] = local454 * local474 + local458 * local466 + 16384 >> 15;
				local442[6] = local454 * local482 + -local458 * local462 + 16384 >> 15;
				local442[4] = local462 * local396 + 16384 >> 15;
				@Pc(612) int local612 = local442[1] * -Static135.anInt2655 + -Static97.anInt2177 * local442[0] + -Static15.anInt384 * local442[2] + 16384 >> 15;
				local637 = -Static15.anInt384 * local442[5] + local442[4] * -Static135.anInt2655 + local442[3] * -Static97.anInt2177 + 16384 >> 15;
				local662 = -Static15.anInt384 * local442[8] + -Static97.anInt2177 * local442[6] + local442[7] * -Static135.anInt2655 + 16384 >> 15;
				local666 = local612 + Static97.anInt2177;
				@Pc(670) int local670 = Static135.anInt2655 + local637;
				local674 = Static15.anInt384 + local662;
				@Pc(677) int[] local677 = new int[9];
				for (local679 = 0; local679 < 3; local679++) {
					for (local683 = 0; local683 < 3; local683++) {
						local687 = 0;
						for (local689 = 0; local689 < 3; local689++) {
							local687 += arg7[local683 * 3 + local689] * local442[local679 * 3 + local689];
						}
						local677[local679 * 3 + local683] = local687 + 16384 >> 15;
					}
				}
				local683 = local59 * local442[2] + local442[1] * local53 + local248 * local442[0] + 16384 >> 15;
				local687 = local53 * local442[4] + local248 * local442[3] + local442[5] * local59 + 16384 >> 15;
				local687 += local670;
				local683 += local666;
				local689 = local53 * local442[7] + local248 * local442[6] + local442[8] * local59 + 16384 >> 15;
				local689 += local674;
				local819 = new int[9];
				for (local821 = 0; local821 < 3; local821++) {
					for (local825 = 0; local825 < 3; local825++) {
						local829 = 0;
						for (local831 = 0; local831 < 3; local831++) {
							local829 += local677[local825 + local831 * 3] * arg7[local831 + local821 * 3];
						}
						local819[local825 + local821 * 3] = local829 + 16384 >> 15;
					}
				}
				local825 = local689 * arg7[2] + local683 * arg7[0] + arg7[1] * local687 + 16384 >> 15;
				local829 = local689 * arg7[5] + local687 * arg7[4] + local683 * arg7[3] + 16384 >> 15;
				local829 += local35;
				local825 += local33;
				local831 = local689 * arg7[8] + local687 * arg7[7] + arg7[6] * local683 + 16384 >> 15;
				local831 += local41;
				for (local959 = 0; local959 < local8; local959++) {
					@Pc(965) int local965 = arg1[local959];
					if (this.anIntArrayArray56.length > local965) {
						@Pc(975) int[] local975 = this.anIntArrayArray56[local965];
						for (@Pc(977) int local977 = 0; local977 < local975.length; local977++) {
							@Pc(983) int local983 = local975[local977];
							if (this.aShortArray100 == null || (this.aShortArray100[local983] & arg6) != 0) {
								@Pc(1027) int local1027 = local819[2] * this.anIntArray488[local983] + this.anIntArray489[local983] * local819[0] + this.anIntArray492[local983] * local819[1] + 16384 >> 15;
								@Pc(1059) int local1059 = local819[4] * this.anIntArray492[local983] + this.anIntArray489[local983] * local819[3] + this.anIntArray488[local983] * local819[5] + 16384 >> 15;
								@Pc(1063) int local1063 = local1027 + local825;
								@Pc(1067) int local1067 = local1059 + local829;
								@Pc(1098) int local1098 = this.anIntArray488[local983] * local819[8] + local819[7] * this.anIntArray492[local983] + local819[6] * this.anIntArray489[local983] + 16384 >> 15;
								this.anIntArray489[local983] = local1063;
								@Pc(1107) int local1107 = local1098 + local831;
								this.anIntArray492[local983] = local1067;
								this.anIntArray488[local983] = local1107;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2568) Class259 local2568;
			@Pc(2573) Class203 local2573;
			if (arg0 == 5) {
				if (this.anIntArrayArray58 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray58.length > local35) {
							local246 = this.anIntArrayArray58[local35];
							for (local248 = 0; local248 < local246.length; local248++) {
								local53 = local246[local248];
								if (this.aShortArray94 == null || (arg6 & this.aShortArray94[local53]) != 0) {
									local59 = (this.aByteArray202[local53] & 0xFF) + (arg2 * 8);
									if (local59 < 0) {
										local59 = 0;
									} else if (local59 > 255) {
										local59 = 255;
									}
									this.aByteArray202[local53] = (byte) local59;
									if (this.aClass100_16 != null) {
										this.aClass100_16.anInterface12_4 = null;
									}
								}
							}
						}
					}
					if (this.aClass259Array1 != null) {
						for (local35 = 0; local35 < this.anInt7334; local35++) {
							local2568 = this.aClass259Array1[local35];
							local2573 = this.aClass203Array1[local35];
							local2573.anInt5787 = 255 - (this.aByteArray202[local2568.anInt7523] & 0xFF) << 24 | local2573.anInt5787 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2834) Class203 local2834;
				if (arg0 == 8) {
					if (this.anIntArrayArray57 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (this.anIntArrayArray57.length > local35) {
								local246 = this.anIntArrayArray57[local35];
								for (local248 = 0; local248 < local246.length; local248++) {
									local2834 = this.aClass203Array1[local246[local248]];
									local2834.anInt5790 += arg3;
									local2834.anInt5781 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray57 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (local35 < this.anIntArrayArray57.length) {
								local246 = this.anIntArrayArray57[local35];
								for (local248 = 0; local248 < local246.length; local248++) {
									local2834 = this.aClass203Array1[local246[local248]];
									local2834.anInt5789 = arg2 * local2834.anInt5789 >> 7;
									local2834.anInt5785 = local2834.anInt5785 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray57 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray57.length > local35) {
							local246 = this.anIntArrayArray57[local35];
							for (local248 = 0; local248 < local246.length; local248++) {
								local2834 = this.aClass203Array1[local246[local248]];
								local2834.anInt5783 = local2834.anInt5783 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray58 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray58.length) {
						local246 = this.anIntArrayArray58[local35];
						for (local248 = 0; local248 < local246.length; local248++) {
							local53 = local246[local248];
							if (this.aShortArray94 == null || (arg6 & this.aShortArray94[local53]) != 0) {
								local59 = this.aShortArray97[local53] & 0xFFFF;
								local374 = local59 >> 10 & 0x3F;
								local396 = local59 >> 7 & 0x7;
								local396 += arg3 / 4;
								local423 = local59 & 0x7F;
								@Pc(2688) int local2688 = local374 + arg2 & 0x3F;
								if (local396 < 0) {
									local396 = 0;
								} else if (local396 > 7) {
									local396 = 7;
								}
								local423 += arg4;
								if (local423 < 0) {
									local423 = 0;
								} else if (local423 > 127) {
									local423 = 127;
								}
								this.aShortArray97[local53] = (short) (local396 << 7 | local2688 << 10 | local423);
								if (this.aClass100_16 != null) {
									this.aClass100_16.anInterface12_4 = null;
								}
							}
						}
					}
				}
				if (this.aClass259Array1 != null) {
					for (local35 = 0; local35 < this.anInt7334; local35++) {
						local2568 = this.aClass259Array1[local35];
						local2573 = this.aClass203Array1[local35];
						local2573.anInt5787 = Static130.anIntArray144[this.aShortArray97[local2568.anInt7523] & 0xFFFF] & 0xFFFFFF | local2573.anInt5787 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray56.length) {
					local246 = this.anIntArrayArray56[local35];
					for (local248 = 0; local248 < local246.length; local248++) {
						local53 = local246[local248];
						if (this.aShortArray100 == null || (this.aShortArray100[local53] & arg6) != 0) {
							this.anIntArray489[local53] -= Static97.anInt2177;
							this.anIntArray492[local53] -= Static135.anInt2655;
							this.anIntArray488[local53] -= Static15.anInt384;
							this.anIntArray489[local53] = this.anIntArray489[local53] * arg2 >> 7;
							this.anIntArray492[local53] = this.anIntArray492[local53] * arg3 >> 7;
							this.anIntArray488[local53] = arg4 * this.anIntArray488[local53] >> 7;
							this.anIntArray489[local53] += Static97.anInt2177;
							this.anIntArray492[local53] += Static135.anInt2655;
							this.anIntArray488[local53] += Static15.anInt384;
						}
					}
				}
			}
		} else {
			local33 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local248 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static24.aBoolean45) {
				local374 = Static15.anInt384 * arg7[6] + arg7[0] * Static97.anInt2177 + arg7[3] * Static135.anInt2655 + 16384 >> 15;
				local396 = Static15.anInt384 * arg7[7] + Static135.anInt2655 * arg7[4] + Static97.anInt2177 * arg7[1] + 16384 >> 15;
				local374 += local248;
				local396 += local53;
				local423 = Static135.anInt2655 * arg7[5] + arg7[2] * Static97.anInt2177 + arg7[8] * Static15.anInt384 + 16384 >> 15;
				Static97.anInt2177 = local374;
				local423 += local59;
				Static135.anInt2655 = local396;
				Static24.aBoolean45 = false;
				Static15.anInt384 = local423;
			}
			local374 = arg2 << 15 >> 7;
			local396 = arg3 << 15 >> 7;
			local423 = arg4 << 15 >> 7;
			local454 = -Static97.anInt2177 * local374 + 16384 >> 15;
			local458 = local396 * -Static135.anInt2655 + 16384 >> 15;
			local462 = local423 * -Static15.anInt384 + 16384 >> 15;
			local466 = Static97.anInt2177 + local454;
			local474 = Static135.anInt2655 + local458;
			local482 = local462 + Static15.anInt384;
			@Pc(2007) int[] local2007 = new int[] { local374 * arg7[0] + 16384 >> 15, arg7[3] * local374 + 16384 >> 15, arg7[6] * local374 + 16384 >> 15, arg7[1] * local396 + 16384 >> 15, arg7[4] * local396 + 16384 >> 15, arg7[7] * local396 + 16384 >> 15, local423 * arg7[2] + 16384 >> 15, arg7[5] * local423 + 16384 >> 15, local423 * arg7[8] + 16384 >> 15 };
			local637 = local248 * local374 + 16384 >> 15;
			local662 = local53 * local396 + 16384 >> 15;
			local666 = local423 * local59 + 16384 >> 15;
			@Pc(2143) int local2143 = local662 + local474;
			@Pc(2147) int local2147 = local637 + local466;
			@Pc(2151) int local2151 = local666 + local482;
			@Pc(2154) int[] local2154 = new int[9];
			@Pc(2160) int local2160;
			for (local674 = 0; local674 < 3; local674++) {
				for (local2160 = 0; local2160 < 3; local2160++) {
					local679 = 0;
					for (local683 = 0; local683 < 3; local683++) {
						local679 += arg7[local683 + local674 * 3] * local2007[local2160 + local683 * 3];
					}
					local2154[local674 * 3 + local2160] = local679 + 16384 >> 15;
				}
			}
			local2160 = local2151 * arg7[2] + local2147 * arg7[0] + arg7[1] * local2143 + 16384 >> 15;
			local679 = arg7[5] * local2151 + arg7[4] * local2143 + local2147 * arg7[3] + 16384 >> 15;
			local679 += local35;
			local683 = arg7[8] * local2151 + arg7[7] * local2143 + arg7[6] * local2147 + 16384 >> 15;
			local2160 += local33;
			local683 += local41;
			for (local687 = 0; local687 < local8; local687++) {
				local689 = arg1[local687];
				if (local689 < this.anIntArrayArray56.length) {
					local819 = this.anIntArrayArray56[local689];
					for (local821 = 0; local821 < local819.length; local821++) {
						local825 = local819[local821];
						if (this.aShortArray100 == null || (this.aShortArray100[local825] & arg6) != 0) {
							local829 = local2154[1] * this.anIntArray492[local825] + this.anIntArray489[local825] * local2154[0] + local2154[2] * this.anIntArray488[local825] + 16384 >> 15;
							local831 = this.anIntArray489[local825] * local2154[3] + local2154[4] * this.anIntArray492[local825] + local2154[5] * this.anIntArray488[local825] + 16384 >> 15;
							@Pc(2395) int local2395 = local831 + local679;
							@Pc(2399) int local2399 = local829 + local2160;
							local959 = local2154[7] * this.anIntArray492[local825] + local2154[6] * this.anIntArray489[local825] + this.anIntArray488[local825] * local2154[8] + 16384 >> 15;
							this.anIntArray489[local825] = local2399;
							@Pc(2439) int local2439 = local959 + local683;
							this.anIntArray492[local825] = local2395;
							this.anIntArray488[local825] = local2439;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "ra", descriptor = "()I")
	@Override
	public int ra() {
		if (!this.aBoolean628) {
			this.method5696();
		}
		return this.aShort91;
	}

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class184.anIntArray349[arg0];
		@Pc(13) int local13 = Class184.anIntArray350[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7289; local15++) {
			@Pc(33) int local33 = this.anIntArray489[local15] * local13 + local9 * this.anIntArray488[local15] >> 15;
			this.anIntArray488[local15] = local13 * this.anIntArray488[local15] - this.anIntArray489[local15] * local9 >> 15;
			this.anIntArray489[local15] = local33;
		}
		if (this.aClass100_13 != null) {
			this.aClass100_13.anInterface12_4 = null;
		}
		this.aBoolean628 = false;
	}

	@OriginalMember(owner = "client!ve", name = "FA", descriptor = "()Z")
	@Override
	protected boolean FA() {
		if (this.anIntArrayArray56 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7306; local12++) {
			this.anIntArray489[local12] <<= 0x4;
			this.anIntArray492[local12] <<= 0x4;
			this.anIntArray488[local12] <<= 0x4;
		}
		Static135.anInt2655 = 0;
		Static15.anInt384 = 0;
		Static97.anInt2177 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ve", name = "N", descriptor = "(SS)V")
	@Override
	public void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7309; local3++) {
			if (arg0 == this.aShortArray97[local3]) {
				this.aShortArray97[local3] = arg1;
			}
		}
		if (this.aClass259Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt7334; local34++) {
				@Pc(41) Class259 local41 = this.aClass259Array1[local34];
				@Pc(46) Class203 local46 = this.aClass203Array1[local34];
				local46.anInt5787 = Static130.anIntArray144[this.aShortArray97[local41.anInt7523] & 0xFFFF] & 0xFFFFFF | local46.anInt5787 & 0xFF000000;
			}
		}
		if (this.aClass100_16 != null) {
			this.aClass100_16.anInterface12_4 = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "X", descriptor = "()I")
	@Override
	public int X() {
		if (!this.aBoolean628) {
			this.method5696();
		}
		return this.aShort90;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ve;ZZIILclient!ve;)Lclient!c;")
	private Class32 method5690(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class32_Sub2 arg4) {
		arg0.anInt7333 = this.anInt7333;
		arg0.anInt7306 = this.anInt7306;
		arg0.anInt7334 = this.anInt7334;
		arg0.anInt7305 = arg3;
		arg0.aByte99 = 0;
		arg0.aShort95 = this.aShort95;
		arg0.anInt7309 = this.anInt7309;
		arg0.anInt7303 = this.anInt7303;
		arg0.anInt7289 = this.anInt7289;
		arg0.aShort96 = this.aShort96;
		arg0.anInt7339 = this.anInt7339;
		@Pc(53) boolean local53 = Static397.method5451(this.anInt7303, arg3);
		@Pc(59) boolean local59 = Static67.method1264(arg3, this.anInt7303);
		@Pc(65) boolean local65 = Static418.method5664(arg3, this.anInt7303);
		@Pc(71) boolean local71 = local65 | local53 | local59;
		@Pc(186) int local186;
		if (local71) {
			if (!local53) {
				arg0.anIntArray489 = this.anIntArray489;
			} else if (arg4.anIntArray489 == null || this.anInt7306 > arg4.anIntArray489.length) {
				arg0.anIntArray489 = arg4.anIntArray489 = new int[this.anInt7306];
			} else {
				arg0.anIntArray489 = arg4.anIntArray489;
			}
			if (!local59) {
				arg0.anIntArray492 = this.anIntArray492;
			} else if (arg4.anIntArray492 == null || arg4.anIntArray492.length < this.anInt7306) {
				arg0.anIntArray492 = arg4.anIntArray492 = new int[this.anInt7306];
			} else {
				arg0.anIntArray492 = arg4.anIntArray492;
			}
			if (!local65) {
				arg0.anIntArray488 = this.anIntArray488;
			} else if (arg4.anIntArray488 == null || this.anInt7306 > arg4.anIntArray488.length) {
				arg0.anIntArray488 = arg4.anIntArray488 = new int[this.anInt7306];
			} else {
				arg0.anIntArray488 = arg4.anIntArray488;
			}
			for (local186 = 0; local186 < this.anInt7306; local186++) {
				if (local53) {
					arg0.anIntArray489[local186] = this.anIntArray489[local186];
				}
				if (local59) {
					arg0.anIntArray492[local186] = this.anIntArray492[local186];
				}
				if (local65) {
					arg0.anIntArray488[local186] = this.anIntArray488[local186];
				}
			}
		} else {
			arg0.anIntArray488 = this.anIntArray488;
			arg0.anIntArray489 = this.anIntArray489;
			arg0.anIntArray492 = this.anIntArray492;
		}
		if (Static266.method3986(arg3, this.anInt7303)) {
			arg0.aClass100_13 = arg4.aClass100_13;
			if (arg2) {
				arg0.aByte99 = (byte) (arg0.aByte99 | 0x1);
			}
			arg0.aClass100_13.aByte25 = this.aClass100_13.aByte25;
			arg0.aClass100_13.anInterface12_4 = this.aClass100_13.anInterface12_4;
		} else if (Static382.method5314(arg3, this.anInt7303)) {
			arg0.aClass100_13 = this.aClass100_13;
		} else {
			arg0.aClass100_13 = null;
		}
		if (Static13.method218(arg3, this.anInt7303)) {
			if (arg4.aShortArray97 == null || arg4.aShortArray97.length < this.anInt7309) {
				arg0.aShortArray97 = arg4.aShortArray97 = new short[this.anInt7309];
			} else {
				arg0.aShortArray97 = arg4.aShortArray97;
			}
			for (local186 = 0; local186 < this.anInt7309; local186++) {
				arg0.aShortArray97[local186] = this.aShortArray97[local186];
			}
		} else {
			arg0.aShortArray97 = this.aShortArray97;
		}
		if (Static418.method5663(arg3, this.anInt7303)) {
			if (arg4.aByteArray202 == null || this.anInt7309 > arg4.aByteArray202.length) {
				arg0.aByteArray202 = arg4.aByteArray202 = new byte[this.anInt7309];
			} else {
				arg0.aByteArray202 = arg4.aByteArray202;
			}
			for (local186 = 0; local186 < this.anInt7309; local186++) {
				arg0.aByteArray202[local186] = this.aByteArray202[local186];
			}
		} else {
			arg0.aByteArray202 = this.aByteArray202;
		}
		if (Static7.method161(this.anInt7303, arg3)) {
			arg0.aClass100_16 = arg4.aClass100_16;
			if (arg2) {
				arg0.aByte99 = (byte) (arg0.aByte99 | 0x2);
			}
			arg0.aClass100_16.aByte25 = this.aClass100_16.aByte25;
			arg0.aClass100_16.anInterface12_4 = this.aClass100_16.anInterface12_4;
		} else if (Static328.method4699(this.anInt7303, arg3)) {
			arg0.aClass100_16 = this.aClass100_16;
		} else {
			arg0.aClass100_16 = null;
		}
		@Pc(525) int local525;
		if (Static336.method4750(arg3, this.anInt7303)) {
			if (arg4.aShortArray101 == null || this.anInt7333 > arg4.aShortArray101.length) {
				local186 = this.anInt7333;
				arg0.aShortArray93 = arg4.aShortArray93 = new short[local186];
				arg0.aShortArray96 = arg4.aShortArray96 = new short[local186];
				arg0.aShortArray101 = arg4.aShortArray101 = new short[local186];
			} else {
				arg0.aShortArray93 = arg4.aShortArray93;
				arg0.aShortArray96 = arg4.aShortArray96;
				arg0.aShortArray101 = arg4.aShortArray101;
			}
			if (this.aClass148_1 == null) {
				for (local186 = 0; local186 < this.anInt7333; local186++) {
					arg0.aShortArray101[local186] = this.aShortArray101[local186];
					arg0.aShortArray96[local186] = this.aShortArray96[local186];
					arg0.aShortArray93[local186] = this.aShortArray93[local186];
				}
			} else {
				if (arg4.aClass148_1 == null) {
					arg4.aClass148_1 = new Class148();
				}
				@Pc(509) Class148 local509 = arg0.aClass148_1 = arg4.aClass148_1;
				if (local509.aShortArray46 == null || local509.aShortArray46.length < this.anInt7333) {
					local525 = this.anInt7333;
					local509.aShortArray46 = new short[local525];
					local509.aByteArray126 = new byte[local525];
					local509.aShortArray48 = new short[local525];
					local509.aShortArray47 = new short[local525];
				}
				for (local525 = 0; local525 < this.anInt7333; local525++) {
					arg0.aShortArray101[local525] = this.aShortArray101[local525];
					arg0.aShortArray96[local525] = this.aShortArray96[local525];
					arg0.aShortArray93[local525] = this.aShortArray93[local525];
					local509.aShortArray46[local525] = this.aClass148_1.aShortArray46[local525];
					local509.aShortArray48[local525] = this.aClass148_1.aShortArray48[local525];
					local509.aShortArray47[local525] = this.aClass148_1.aShortArray47[local525];
					local509.aByteArray126[local525] = this.aClass148_1.aByteArray126[local525];
				}
			}
			arg0.aByteArray201 = this.aByteArray201;
		} else {
			arg0.aShortArray101 = this.aShortArray101;
			arg0.aClass148_1 = this.aClass148_1;
			arg0.aByteArray201 = this.aByteArray201;
			arg0.aShortArray96 = this.aShortArray96;
			arg0.aShortArray93 = this.aShortArray93;
		}
		if (Static348.method4892(this.anInt7303, arg3)) {
			if (arg2) {
				arg0.aByte99 = (byte) (arg0.aByte99 | 0x4);
			}
			arg0.aClass100_14 = arg4.aClass100_14;
			arg0.aClass100_14.anInterface12_4 = this.aClass100_14.anInterface12_4;
			arg0.aClass100_14.aByte25 = this.aClass100_14.aByte25;
		} else if (Static224.method3459(this.anInt7303, arg3)) {
			arg0.aClass100_14 = this.aClass100_14;
		} else {
			arg0.aClass100_14 = null;
		}
		if (Static445.method6017(this.anInt7303, arg3)) {
			if (arg4.aFloatArray31 == null || this.anInt7309 > arg4.aFloatArray31.length) {
				local186 = this.anInt7333;
				arg0.aFloatArray32 = arg4.aFloatArray32 = new float[local186];
				arg0.aFloatArray31 = arg4.aFloatArray31 = new float[local186];
			} else {
				arg0.aFloatArray31 = arg4.aFloatArray31;
				arg0.aFloatArray32 = arg4.aFloatArray32;
			}
			for (local186 = 0; local186 < this.anInt7333; local186++) {
				arg0.aFloatArray31[local186] = this.aFloatArray31[local186];
				arg0.aFloatArray32[local186] = this.aFloatArray32[local186];
			}
		} else {
			arg0.aFloatArray31 = this.aFloatArray31;
			arg0.aFloatArray32 = this.aFloatArray32;
		}
		if (Static33.method440(this.anInt7303, arg3)) {
			if (arg2) {
				arg0.aByte99 = (byte) (arg0.aByte99 | 0x8);
			}
			arg0.aClass100_15 = arg4.aClass100_15;
			arg0.aClass100_15.aByte25 = this.aClass100_15.aByte25;
			arg0.aClass100_15.anInterface12_4 = this.aClass100_15.anInterface12_4;
		} else if (Static304.method4372(this.anInt7303, arg3)) {
			arg0.aClass100_15 = this.aClass100_15;
		} else {
			arg0.aClass100_15 = null;
		}
		if (Static417.method5650(this.anInt7303, arg3)) {
			if (arg4.aShortArray98 == null || arg4.aShortArray98.length < this.anInt7309) {
				local186 = this.anInt7309;
				arg0.aShortArray102 = arg4.aShortArray102 = new short[local186];
				arg0.aShortArray103 = arg4.aShortArray103 = new short[local186];
				arg0.aShortArray98 = arg4.aShortArray98 = new short[local186];
			} else {
				arg0.aShortArray103 = arg4.aShortArray103;
				arg0.aShortArray98 = arg4.aShortArray98;
				arg0.aShortArray102 = arg4.aShortArray102;
			}
			for (local186 = 0; local186 < this.anInt7309; local186++) {
				arg0.aShortArray98[local186] = this.aShortArray98[local186];
				arg0.aShortArray102[local186] = this.aShortArray102[local186];
				arg0.aShortArray103[local186] = this.aShortArray103[local186];
			}
		} else {
			arg0.aShortArray102 = this.aShortArray102;
			arg0.aShortArray103 = this.aShortArray103;
			arg0.aShortArray98 = this.aShortArray98;
		}
		if (Static204.method3163(arg3, this.anInt7303)) {
			if (arg2) {
				arg0.aByte99 = (byte) (arg0.aByte99 | 0x10);
			}
			arg0.aClass75_1 = arg4.aClass75_1;
			arg0.aClass75_1.anInterface4_3 = this.aClass75_1.anInterface4_3;
		} else if (Static122.method1778(this.anInt7303, arg3)) {
			arg0.aClass75_1 = this.aClass75_1;
		} else {
			arg0.aClass75_1 = null;
		}
		if (Static429.method5790(this.anInt7303, arg3)) {
			if (arg4.aShortArray95 == null || this.anInt7309 > arg4.aShortArray95.length) {
				local186 = this.anInt7309;
				arg0.aShortArray95 = arg4.aShortArray95 = new short[local186];
			} else {
				arg0.aShortArray95 = arg4.aShortArray95;
			}
			for (local186 = 0; local186 < this.anInt7309; local186++) {
				arg0.aShortArray95[local186] = this.aShortArray95[local186];
			}
		} else {
			arg0.aShortArray95 = this.aShortArray95;
		}
		if (!Static299.method4338(this.anInt7303, arg3)) {
			arg0.aClass203Array1 = this.aClass203Array1;
		} else if (arg4.aClass203Array1 == null || arg4.aClass203Array1.length < this.anInt7334) {
			local186 = this.anInt7334;
			arg0.aClass203Array1 = arg4.aClass203Array1 = new Class203[local186];
			for (local525 = 0; local525 < this.anInt7334; local525++) {
				arg0.aClass203Array1[local525] = this.aClass203Array1[local525].method4623();
			}
		} else {
			arg0.aClass203Array1 = arg4.aClass203Array1;
			for (local186 = 0; local186 < this.anInt7334; local186++) {
				arg0.aClass203Array1[local186].method4622(this.aClass203Array1[local186]);
			}
		}
		arg0.anIntArrayArray56 = this.anIntArrayArray56;
		arg0.aClass17Array3 = this.aClass17Array3;
		arg0.aShortArray94 = this.aShortArray94;
		arg0.anIntArrayArray58 = this.anIntArrayArray58;
		arg0.anIntArray490 = this.anIntArray490;
		arg0.aClass259Array1 = this.aClass259Array1;
		arg0.aShortArray100 = this.aShortArray100;
		arg0.anIntArrayArray57 = this.anIntArrayArray57;
		if (this.aBoolean628) {
			arg0.aShort91 = this.aShort91;
			arg0.aShort98 = this.aShort98;
			arg0.aBoolean628 = true;
			arg0.aShort94 = this.aShort94;
			arg0.aShort93 = this.aShort93;
			arg0.aShort97 = this.aShort97;
			arg0.aShort90 = this.aShort90;
			arg0.aShort92 = this.aShort92;
		} else {
			arg0.aBoolean628 = false;
		}
		arg0.aShortArray99 = this.aShortArray99;
		arg0.anIntArray491 = this.anIntArray491;
		arg0.aClass202Array3 = this.aClass202Array3;
		return arg0;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "()I")
	@Override
	public int b() {
		if (!this.aBoolean628) {
			this.method5696();
		}
		return this.aShort98;
	}

	@OriginalMember(owner = "client!ve", name = "YA", descriptor = "(SS)V")
	@Override
	public void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface8 local9 = this.aClass26_Sub1_39.anInterface8_5;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7309; local11++) {
			if (arg0 == this.aShortArray95[local11]) {
				this.aShortArray95[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class178 local44 = local9.method3836(arg0 & 0xFFFF);
			local31 = local44.aByte57;
			local33 = local44.aByte54;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(64) Class178 local64 = local9.method3836(arg1 & 0xFFFF);
			local52 = local64.aByte57;
			local54 = local64.aByte54;
		}
		if (!(local54 != local33 | local52 != local31)) {
			return;
		}
		if (this.aClass259Array1 != null) {
			for (@Pc(89) int local89 = 0; local89 < this.anInt7334; local89++) {
				@Pc(96) Class259 local96 = this.aClass259Array1[local89];
				@Pc(101) Class203 local101 = this.aClass203Array1[local89];
				local101.anInt5787 = local101.anInt5787 & 0xFF000000 | Static130.anIntArray144[this.aShortArray97[local96.anInt7523] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass100_16 != null) {
			this.aClass100_16.anInterface12_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ve", name = "la", descriptor = "()I")
	@Override
	public int la() {
		if (!this.aBoolean628) {
			this.method5696();
		}
		return this.aShort97;
	}

	@OriginalMember(owner = "client!ve", name = "ja", descriptor = "(III)V")
	@Override
	public void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7289; local3++) {
			if (arg0 != 0) {
				this.anIntArray489[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray492[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray488[local3] += arg2;
			}
		}
		if (this.aClass100_13 != null) {
			this.aClass100_13.anInterface12_4 = null;
		}
		this.aBoolean628 = false;
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "()[Lclient!qm;")
	@Override
	public Class202[] method5673() {
		return this.aClass202Array3;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method5691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < arg2 && arg3 > arg0 && arg7 > arg0) {
			return false;
		} else if (arg0 > arg2 && arg0 > arg3 && arg0 > arg7) {
			return false;
		} else if (arg1 < arg5 && arg6 > arg1 && arg1 < arg4) {
			return false;
		} else {
			return arg5 >= arg1 || arg1 <= arg6 || arg4 >= arg1;
		}
	}

	@OriginalMember(owner = "client!ve", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		return this.aShort96;
	}

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "()I")
	@Override
	public int E() {
		if (!this.aBoolean628) {
			this.method5696();
		}
		return this.aShort94;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "()[Lclient!au;")
	@Override
	public Class17[] method5667() {
		return this.aClass17Array3;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IJIILclient!wp;IIFIF)S")
	private short method5693(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class266 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(10) int local10 = this.anIntArray491[arg0];
		@Pc(17) int local17 = this.anIntArray491[arg0 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray99[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg1 == Static393.aLongArray8[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray99[local19] = (short) (this.anInt7333 + 1);
		Static393.aLongArray8[local19] = arg1;
		this.aShortArray101[this.anInt7333] = (short) arg3;
		this.aShortArray96[this.anInt7333] = (short) arg5;
		this.aShortArray93[this.anInt7333] = (short) arg7;
		this.aByteArray201[this.anInt7333] = (byte) arg2;
		this.aFloatArray31[this.anInt7333] = arg6;
		this.aFloatArray32[this.anInt7333] = arg8;
		return (short) this.anInt7333++;
	}

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "(IIII)V")
	@Override
	protected void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static97.anInt2177 = 0;
			local14 = 0;
			Static15.anInt384 = 0;
			Static135.anInt2655 = 0;
			for (local20 = 0; local20 < this.anInt7289; local20++) {
				Static97.anInt2177 += this.anIntArray489[local20];
				Static135.anInt2655 += this.anIntArray492[local20];
				Static15.anInt384 += this.anIntArray488[local20];
				local14++;
			}
			if (local14 <= 0) {
				Static15.anInt384 = arg3;
				Static135.anInt2655 = arg2;
				Static97.anInt2177 = arg1;
			} else {
				Static135.anInt2655 = arg2 + Static135.anInt2655 / local14;
				Static15.anInt384 = Static15.anInt384 / local14 + arg3;
				Static97.anInt2177 = Static97.anInt2177 / local14 + arg1;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt7289; local14++) {
				this.anIntArray489[local14] += arg1;
				this.anIntArray492[local14] += arg2;
				this.anIntArray488[local14] += arg3;
			}
		} else {
			@Pc(170) int local170;
			@Pc(188) int local188;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt7289; local14++) {
					this.anIntArray489[local14] -= Static97.anInt2177;
					this.anIntArray492[local14] -= Static135.anInt2655;
					this.anIntArray488[local14] -= Static15.anInt384;
					if (arg3 != 0) {
						local20 = Class184.anIntArray349[arg3];
						local170 = Class184.anIntArray350[arg3];
						local188 = this.anIntArray492[local14] * local20 + this.anIntArray489[local14] * local170 + 32767 >> 15;
						this.anIntArray492[local14] = this.anIntArray492[local14] * local170 + 32767 - local20 * this.anIntArray489[local14] >> 15;
						this.anIntArray489[local14] = local188;
					}
					if (arg1 != 0) {
						local20 = Class184.anIntArray349[arg1];
						local170 = Class184.anIntArray350[arg1];
						local188 = this.anIntArray492[local14] * local170 + 32767 - this.anIntArray488[local14] * local20 >> 15;
						this.anIntArray488[local14] = local170 * this.anIntArray488[local14] + local20 * this.anIntArray492[local14] + 32767 >> 15;
						this.anIntArray492[local14] = local188;
					}
					if (arg2 != 0) {
						local20 = Class184.anIntArray349[arg2];
						local170 = Class184.anIntArray350[arg2];
						local188 = this.anIntArray489[local14] * local170 + local20 * this.anIntArray488[local14] + 32767 >> 15;
						this.anIntArray488[local14] = this.anIntArray488[local14] * local170 + 32767 - local20 * this.anIntArray489[local14] >> 15;
						this.anIntArray489[local14] = local188;
					}
					this.anIntArray489[local14] += Static97.anInt2177;
					this.anIntArray492[local14] += Static135.anInt2655;
					this.anIntArray488[local14] += Static15.anInt384;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt7289; local14++) {
					this.anIntArray489[local14] -= Static97.anInt2177;
					this.anIntArray492[local14] -= Static135.anInt2655;
					this.anIntArray488[local14] -= Static15.anInt384;
					this.anIntArray489[local14] = this.anIntArray489[local14] * arg1 / 128;
					this.anIntArray492[local14] = this.anIntArray492[local14] * arg2 / 128;
					this.anIntArray488[local14] = arg3 * this.anIntArray488[local14] / 128;
					this.anIntArray489[local14] += Static97.anInt2177;
					this.anIntArray492[local14] += Static135.anInt2655;
					this.anIntArray488[local14] += Static15.anInt384;
				}
			} else {
				@Pc(526) Class259 local526;
				@Pc(531) Class203 local531;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt7309; local14++) {
						local20 = (this.aByteArray202[local14] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray202[local14] = (byte) local20;
					}
					if (this.aClass100_16 != null) {
						this.aClass100_16.anInterface12_4 = null;
					}
					if (this.aClass259Array1 != null) {
						for (local20 = 0; local20 < this.anInt7334; local20++) {
							local526 = this.aClass259Array1[local20];
							local531 = this.aClass203Array1[local20];
							local531.anInt5787 = local531.anInt5787 & 0xFFFFFF | 255 - (this.aByteArray202[local526.anInt7523] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt7309; local14++) {
						local20 = this.aShortArray97[local14] & 0xFFFF;
						local170 = local20 >> 10 & 0x3F;
						local188 = local20 >> 7 & 0x7;
						local188 += arg2 / 4;
						@Pc(597) int local597 = local20 & 0x7F;
						@Pc(603) int local603 = arg1 + local170 & 0x3F;
						if (local188 < 0) {
							local188 = 0;
						} else if (local188 > 7) {
							local188 = 7;
						}
						local597 += arg3;
						if (local597 < 0) {
							local597 = 0;
						} else if (local597 > 127) {
							local597 = 127;
						}
						this.aShortArray97[local14] = (short) (local188 << 7 | local603 << 10 | local597);
					}
					if (this.aClass100_16 != null) {
						this.aClass100_16.anInterface12_4 = null;
					}
					if (this.aClass259Array1 != null) {
						for (local20 = 0; local20 < this.anInt7334; local20++) {
							local526 = this.aClass259Array1[local20];
							local531 = this.aClass203Array1[local20];
							local531.anInt5787 = local531.anInt5787 & 0xFF000000 | Static130.anIntArray144[this.aShortArray97[local526.anInt7523] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(719) Class203 local719;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt7334; local14++) {
							local719 = this.aClass203Array1[local14];
							local719.anInt5790 += arg2;
							local719.anInt5781 += arg1;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt7334; local14++) {
							local719 = this.aClass203Array1[local14];
							local719.anInt5785 = arg2 * local719.anInt5785 >> 7;
							local719.anInt5789 = arg1 * local719.anInt5789 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt7334; local14++) {
							local719 = this.aClass203Array1[local14];
							local719.anInt5783 = local719.anInt5783 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "()V")
	@Override
	public void method5666() {
		if (this.anInt7333 <= 0 || this.anInt7339 <= 0) {
			return;
		}
		this.method5702(false);
		if ((this.aByte99 & 0x10) == 0 && this.aClass75_1.anInterface4_3 == null) {
			this.method5703(false);
		}
		this.method5686();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILclient!ia;Z)Z")
	@Override
	public boolean method5671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class102_Sub2 local8 = (Class102_Sub2) arg2;
		@Pc(12) Class102_Sub2 local12 = this.aClass26_Sub1_39.aClass102_Sub2_3;
		@Pc(33) float local33 = local12.aFloat104 + local12.aFloat110 * local8.aFloat114 + local12.aFloat109 * local8.aFloat104 + local8.aFloat111 * local12.aFloat112;
		@Pc(54) float local54 = local8.aFloat111 * local12.aFloat105 + local8.aFloat104 * local12.aFloat107 + local8.aFloat114 * local12.aFloat106 + local12.aFloat114;
		Static265.aFloat216 = local8.aFloat108 * local12.aFloat103 + local12.aFloat108 * local8.aFloat106 + local12.aFloat113 * local8.aFloat110;
		Static251.aFloat152 = local8.aFloat107 * local12.aFloat108 + local12.aFloat113 * local8.aFloat109 + local8.aFloat113 * local12.aFloat103;
		Static62.aFloat60 = local12.aFloat105 * local8.aFloat103 + local12.aFloat107 * local8.aFloat112 + local12.aFloat106 * local8.aFloat105;
		Static45.aFloat217 = local12.aFloat106 * local8.aFloat107 + local8.aFloat109 * local12.aFloat107 + local12.aFloat105 * local8.aFloat113;
		Static90.aFloat68 = local8.aFloat106 * local12.aFloat106 + local12.aFloat107 * local8.aFloat110 + local12.aFloat105 * local8.aFloat108;
		Static396.aFloat207 = local12.aFloat112 * local8.aFloat113 + local8.aFloat109 * local12.aFloat109 + local12.aFloat110 * local8.aFloat107;
		Static65.aFloat228 = local8.aFloat103 * local12.aFloat112 + local8.aFloat112 * local12.aFloat109 + local8.aFloat105 * local12.aFloat110;
		@Pc(201) float local201 = local12.aFloat111 + local8.aFloat111 * local12.aFloat103 + local8.aFloat104 * local12.aFloat113 + local8.aFloat114 * local12.aFloat108;
		Static322.aFloat174 = local8.aFloat105 * local12.aFloat108 + local12.aFloat113 * local8.aFloat112 + local8.aFloat103 * local12.aFloat103;
		Static225.aFloat142 = local12.aFloat112 * local8.aFloat108 + local8.aFloat110 * local12.aFloat109 + local12.aFloat110 * local8.aFloat106;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass26_Sub1_39.anInt958;
		@Pc(255) int local255 = this.aClass26_Sub1_39.anInt941;
		if (!this.aBoolean628) {
			this.method5696();
		}
		Static235.anIntArray308[0] = this.aShort97;
		Static134.anIntArray146[0] = this.aShort98;
		Static128.anIntArray142[0] = this.aShort90;
		Static235.anIntArray308[1] = this.aShort92;
		Static134.anIntArray146[1] = this.aShort98;
		Static128.anIntArray142[1] = this.aShort90;
		Static235.anIntArray308[2] = this.aShort97;
		Static134.anIntArray146[2] = this.aShort94;
		Static235.anIntArray308[3] = this.aShort92;
		Static128.anIntArray142[2] = this.aShort90;
		Static134.anIntArray146[3] = this.aShort94;
		Static235.anIntArray308[4] = this.aShort97;
		Static128.anIntArray142[3] = this.aShort90;
		Static134.anIntArray146[4] = this.aShort98;
		Static128.anIntArray142[4] = this.aShort93;
		Static235.anIntArray308[5] = this.aShort92;
		Static134.anIntArray146[5] = this.aShort98;
		Static235.anIntArray308[6] = this.aShort97;
		Static128.anIntArray142[5] = this.aShort93;
		Static134.anIntArray146[6] = this.aShort94;
		Static128.anIntArray142[6] = this.aShort93;
		Static235.anIntArray308[7] = this.aShort92;
		Static134.anIntArray146[7] = this.aShort94;
		Static128.anIntArray142[7] = this.aShort93;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(395) float local395;
		@Pc(390) float local390;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static134.anIntArray146[local383];
			local395 = Static235.anIntArray308[local383];
			local400 = Static128.anIntArray142[local383];
			local414 = local201 + local400 * Static322.aFloat174 + local390 * Static265.aFloat216 + Static251.aFloat152 * local395;
			local428 = local33 + local400 * Static65.aFloat228 + local395 * Static396.aFloat207 + local390 * Static225.aFloat142;
			local442 = Static90.aFloat68 * local390 + local395 * Static45.aFloat217 + local400 * Static62.aFloat60 + local54;
			if (local414 >= (float) this.aClass26_Sub1_39.anInt970) {
				@Pc(461) float local461 = (float) this.aClass26_Sub1_39.anInt946 + local428 * (float) local251 / local414;
				if (local461 > local243) {
					local243 = local461;
				}
				if (local461 < local241) {
					local241 = local461;
				}
				@Pc(485) float local485 = local442 * (float) local255 / local414 + (float) this.aClass26_Sub1_39.anInt935;
				local239 = true;
				if (local245 > local485) {
					local245 = local485;
				}
				if (local485 > local247) {
					local247 = local485;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && local243 > (float) arg0 && local245 < (float) arg1 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (Static430.anIntArray500.length < this.anInt7333) {
				Static79.anIntArray103 = new int[this.anInt7333];
				Static430.anIntArray500 = new int[this.anInt7333];
			}
			@Pc(632) int local632;
			for (@Pc(550) int local550 = 0; local550 < this.anInt7289; local550++) {
				local390 = this.anIntArray492[local550];
				local395 = this.anIntArray489[local550];
				local400 = this.anIntArray488[local550];
				local442 = local390 * Static90.aFloat68 + Static45.aFloat217 * local395 + local400 * Static62.aFloat60 + local54;
				local428 = Static396.aFloat207 * local395 + Static225.aFloat142 * local390 + local400 * Static65.aFloat228 + local33;
				local414 = Static265.aFloat216 * local390 + local395 * Static251.aFloat152 + Static322.aFloat174 * local400 + local201;
				@Pc(645) int local645;
				@Pc(650) int local650;
				@Pc(657) int local657;
				if (local414 >= (float) this.aClass26_Sub1_39.anInt970) {
					local632 = (int) ((float) this.aClass26_Sub1_39.anInt946 + local428 * (float) local251 / local414);
					local645 = (int) ((float) this.aClass26_Sub1_39.anInt935 + (float) local255 * local442 / local414);
					local650 = this.anIntArray491[local550];
					local657 = this.anIntArray491[local550 + 1];
					for (@Pc(659) int local659 = local650; local659 < local657; local659++) {
						@Pc(668) int local668 = this.aShortArray99[local659] - 1;
						if (local668 == -1) {
							break;
						}
						Static430.anIntArray500[local668] = local632;
						Static79.anIntArray103[local668] = local645;
					}
				} else {
					local632 = this.anIntArray491[local550];
					local645 = this.anIntArray491[local550 + 1];
					for (local650 = local632; local650 < local645; local650++) {
						local657 = this.aShortArray99[local650] - 1;
						if (local657 == -1) {
							break;
						}
						Static430.anIntArray500[this.aShortArray99[local650] - 1] = -999999;
					}
				}
			}
			for (local632 = 0; local632 < this.anInt7309; local632++) {
				if (Static430.anIntArray500[this.aShortArray98[local632]] != -999999 && Static430.anIntArray500[this.aShortArray102[local632]] != -999999 && Static430.anIntArray500[this.aShortArray103[local632]] != -999999 && this.method5691(arg1, arg0, Static79.anIntArray103[this.aShortArray98[local632]], Static79.anIntArray103[this.aShortArray102[local632]], Static430.anIntArray500[this.aShortArray103[local632]], Static430.anIntArray500[this.aShortArray98[local632]], Static430.anIntArray500[this.aShortArray102[local632]], Static79.anIntArray103[this.aShortArray103[local632]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!ik;)V")
	private void method5694(@OriginalArg(1) Class102_Sub2 arg0) {
		@Pc(10) int local10;
		if (this.aClass202Array3 != null) {
			for (local10 = 0; local10 < this.aClass202Array3.length; local10++) {
				@Pc(17) Class202 local17 = this.aClass202Array3[local10];
				@Pc(19) Class202 local19 = local17;
				if (local17.aClass202_2 != null) {
					local19 = local17.aClass202_2;
				}
				local19.anInt5768 = (int) ((float) this.anIntArray489[local17.anInt5771] * arg0.aFloat109 + arg0.aFloat110 * (float) this.anIntArray492[local17.anInt5771] + (float) this.anIntArray488[local17.anInt5771] * arg0.aFloat112 + arg0.aFloat104);
				local19.anInt5761 = (int) (arg0.aFloat114 + arg0.aFloat105 * (float) this.anIntArray488[local17.anInt5771] + (float) this.anIntArray489[local17.anInt5771] * arg0.aFloat107 + arg0.aFloat106 * (float) this.anIntArray492[local17.anInt5771]);
				local19.anInt5778 = (int) (arg0.aFloat111 + (float) this.anIntArray492[local17.anInt5771] * arg0.aFloat108 + arg0.aFloat113 * (float) this.anIntArray489[local17.anInt5771] + arg0.aFloat103 * (float) this.anIntArray488[local17.anInt5771]);
				local19.anInt5769 = (int) ((float) this.anIntArray489[local17.anInt5777] * arg0.aFloat109 + arg0.aFloat110 * (float) this.anIntArray492[local17.anInt5777] + (float) this.anIntArray488[local17.anInt5777] * arg0.aFloat112 + arg0.aFloat104);
				local19.anInt5779 = (int) (arg0.aFloat114 + arg0.aFloat106 * (float) this.anIntArray492[local17.anInt5777] + arg0.aFloat107 * (float) this.anIntArray489[local17.anInt5777] + arg0.aFloat105 * (float) this.anIntArray488[local17.anInt5777]);
				local19.anInt5773 = (int) (arg0.aFloat111 + arg0.aFloat113 * (float) this.anIntArray489[local17.anInt5777] + arg0.aFloat108 * (float) this.anIntArray492[local17.anInt5777] + (float) this.anIntArray488[local17.anInt5777] * arg0.aFloat103);
				local19.anInt5772 = (int) ((float) this.anIntArray488[local17.anInt5774] * arg0.aFloat112 + (float) this.anIntArray492[local17.anInt5774] * arg0.aFloat110 + arg0.aFloat109 * (float) this.anIntArray489[local17.anInt5774] + arg0.aFloat104);
				local19.anInt5758 = (int) (arg0.aFloat105 * (float) this.anIntArray488[local17.anInt5774] + arg0.aFloat106 * (float) this.anIntArray492[local17.anInt5774] + (float) this.anIntArray489[local17.anInt5774] * arg0.aFloat107 + arg0.aFloat114);
				local19.anInt5763 = (int) (arg0.aFloat111 + (float) this.anIntArray492[local17.anInt5774] * arg0.aFloat108 + (float) this.anIntArray489[local17.anInt5774] * arg0.aFloat113 + arg0.aFloat103 * (float) this.anIntArray488[local17.anInt5774]);
			}
		}
		if (this.aClass17Array3 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass17Array3.length; local10++) {
			@Pc(365) Class17 local365 = this.aClass17Array3[local10];
			@Pc(367) Class17 local367 = local365;
			if (local365.aClass17_1 != null) {
				local367 = local365.aClass17_1;
			}
			if (local365.aClass102_1 == null) {
				local365.aClass102_1 = arg0.method4931();
			} else {
				local365.aClass102_1.ba(arg0);
			}
			local367.anInt427 = (int) (arg0.aFloat104 + (float) this.anIntArray488[local365.anInt428] * arg0.aFloat112 + (float) this.anIntArray492[local365.anInt428] * arg0.aFloat110 + arg0.aFloat109 * (float) this.anIntArray489[local365.anInt428]);
			local367.anInt430 = (int) (arg0.aFloat114 + (float) this.anIntArray488[local365.anInt428] * arg0.aFloat105 + arg0.aFloat107 * (float) this.anIntArray489[local365.anInt428] + (float) this.anIntArray492[local365.anInt428] * arg0.aFloat106);
			local367.anInt431 = (int) ((float) this.anIntArray488[local365.anInt428] * arg0.aFloat103 + (float) this.anIntArray492[local365.anInt428] * arg0.aFloat108 + (float) this.anIntArray489[local365.anInt428] * arg0.aFloat113 + arg0.aFloat111);
		}
	}

	@OriginalMember(owner = "client!ve", name = "sa", descriptor = "()V")
	@Override
	public void sa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7289; local7++) {
			this.anIntArray488[local7] = -this.anIntArray488[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt7333; local25++) {
			this.aShortArray93[local25] = (short) -this.aShortArray93[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt7309; local48++) {
			@Pc(55) short local55 = this.aShortArray98[local48];
			this.aShortArray98[local48] = this.aShortArray103[local48];
			this.aShortArray103[local48] = local55;
		}
		if (this.aClass100_14 == null && this.aClass100_16 != null) {
			this.aClass100_16.anInterface12_4 = null;
		}
		if (this.aClass100_14 != null) {
			this.aClass100_14.anInterface12_4 = null;
		}
		if (this.aClass100_13 != null) {
			this.aClass100_13.anInterface12_4 = null;
		}
		if (this.aClass75_1 != null) {
			this.aClass75_1.anInterface4_3 = null;
		}
		this.aBoolean628 = false;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(SIIIB)I")
	private int method5695(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(20) int local20 = Static130.anIntArray144[Static33.method443(arg1, arg2)];
		if (arg0 != -1) {
			@Pc(32) Class178 local32 = this.aClass26_Sub1_39.anInterface8_5.method3836(arg0 & 0xFFFF);
			@Pc(37) int local37 = local32.aByte57 & 0xFF;
			@Pc(49) int local49;
			@Pc(70) int local70;
			if (local37 != 0) {
				if (arg2 < 0) {
					local49 = 0;
				} else if (arg2 > 127) {
					local49 = 16777215;
				} else {
					local49 = arg2 * 131586;
				}
				if (local37 == 256) {
					local20 = local49;
				} else {
					local70 = 256 - local37;
					local20 = (local37 * (local49 & 0xFF00) + (local20 & 0xFF00) * local70 & 0xFF0000) + ((local20 & 0xFF00FF) * local70 + local37 * (local49 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local49 = local32.aByte54 & 0xFF;
			if (local49 != 0) {
				local49 += 256;
				@Pc(123) int local123 = local49 * (local20 >> 16 & 0xFF);
				if (local123 > 65535) {
					local123 = 65535;
				}
				local70 = local49 * (local20 >> 8 & 0xFF);
				if (local70 > 65535) {
					local70 = 65535;
				}
				@Pc(151) int local151 = local49 * (local20 & 0xFF);
				if (local151 > 65535) {
					local151 = 65535;
				}
				local20 = (local70 & 0xFF00) + ((local123 & 0x2400FF00) << 8) + (local151 >> 8);
			}
		}
		return (local20 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	private void method5696() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt7289; local23++) {
			@Pc(36) int local36 = this.anIntArray489[local23];
			@Pc(41) int local41 = this.anIntArray492[local23];
			if (local13 < local36) {
				local13 = local36;
			}
			@Pc(51) int local51 = this.anIntArray488[local23];
			if (local41 > local15) {
				local15 = local41;
			}
			if (local7 > local36) {
				local7 = local36;
			}
			if (local41 < local9) {
				local9 = local41;
			}
			if (local51 > local17) {
				local17 = local51;
			}
			if (local51 < local11) {
				local11 = local51;
			}
			@Pc(97) int local97 = local36 * local36 + local51 * local51;
			if (local19 < local97) {
				local19 = local97;
			}
			local97 = local51 * local51 + local36 * local36 + local41 * local41;
			if (local97 > local21) {
				local21 = local97;
			}
		}
		this.aShort92 = (short) local13;
		this.aShort97 = (short) local7;
		this.aShort93 = (short) local17;
		this.aShort98 = (short) local9;
		this.aShort90 = (short) local11;
		this.aShort94 = (short) local15;
		this.aShort91 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean628 = true;
	}

	@OriginalMember(owner = "client!ve", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		return this.aShort95;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLclient!wg;)V")
	private void method5697(@OriginalArg(1) Class2_Sub2_Sub9_Sub1 arg0) {
		if (Static430.anIntArray500.length < this.anInt7333) {
			Static79.anIntArray103 = new int[this.anInt7333];
			Static430.anIntArray500 = new int[this.anInt7333];
		}
		@Pc(57) int local57;
		@Pc(96) int local96;
		@Pc(105) int local105;
		for (@Pc(30) int local30 = 0; local30 < this.anInt7289; local30++) {
			local57 = (this.anIntArray489[local30] - (this.aClass26_Sub1_39.anInt937 * this.anIntArray492[local30] >> 8) >> this.aClass26_Sub1_39.anInt924) - arg0.anInt7666;
			@Pc(82) int local82 = (this.anIntArray488[local30] - (this.aClass26_Sub1_39.anInt967 * this.anIntArray492[local30] >> 8) >> this.aClass26_Sub1_39.anInt924) - arg0.anInt7673;
			@Pc(87) int local87 = this.anIntArray491[local30];
			@Pc(94) int local94 = this.anIntArray491[local30 + 1];
			for (local96 = local87; local96 < local94; local96++) {
				local105 = this.aShortArray99[local96] - 1;
				if (local105 == -1) {
					break;
				}
				Static430.anIntArray500[local105] = local57;
				Static79.anIntArray103[local105] = local82;
			}
		}
		for (local57 = 0; local57 < this.anInt7339; local57++) {
			if (this.aByteArray202 == null || this.aByteArray202[local57] <= 128) {
				@Pc(148) short local148 = this.aShortArray98[local57];
				@Pc(153) short local153 = this.aShortArray102[local57];
				@Pc(158) short local158 = this.aShortArray103[local57];
				local96 = Static430.anIntArray500[local148];
				local105 = Static430.anIntArray500[local153];
				@Pc(170) int local170 = Static430.anIntArray500[local158];
				@Pc(174) int local174 = Static79.anIntArray103[local148];
				@Pc(178) int local178 = Static79.anIntArray103[local153];
				@Pc(182) int local182 = Static79.anIntArray103[local158];
				if ((local96 - local105) * (local178 - local182) - (local170 - local105) * (local178 - local174) > 0) {
					arg0.method5941(local178, local170, local174, local96, local182, local105);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "WA", descriptor = "(I)V")
	@Override
	public void WA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class184.anIntArray349[arg0];
		@Pc(13) int local13 = Class184.anIntArray350[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7289; local15++) {
			@Pc(34) int local34 = this.anIntArray492[local15] * local13 - local9 * this.anIntArray488[local15] >> 15;
			this.anIntArray488[local15] = this.anIntArray492[local15] * local9 + this.anIntArray488[local15] * local13 >> 15;
			this.anIntArray492[local15] = local34;
		}
		this.aBoolean628 = false;
		if (this.aClass100_13 != null) {
			this.aClass100_13.anInterface12_4 = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt7309; local3++) {
			local12 = this.aShortArray97[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			@Pc(56) int local56 = local12 & 0x7F;
			if (arg2 != -1) {
				local56 += (arg2 - local56) * arg3 >> 7;
			}
			this.aShortArray97[local3] = (short) (local18 << 10 | local24 << 7 | local56);
		}
		if (this.aClass259Array1 != null) {
			for (local12 = 0; local12 < this.anInt7334; local12++) {
				@Pc(106) Class259 local106 = this.aClass259Array1[local12];
				@Pc(111) Class203 local111 = this.aClass203Array1[local12];
				local111.anInt5787 = Static130.anIntArray144[this.aShortArray97[local106.anInt7523] & 0xFFFF] & 0xFFFFFF | local111.anInt5787 & 0xFF000000;
			}
		}
		if (this.aClass100_16 != null) {
			this.aClass100_16.anInterface12_4 = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	@Override
	public void method5672(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class32_Sub2 local8 = (Class32_Sub2) arg0;
		if (this.anInt7309 == 0 || local8.anInt7309 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt7289;
		@Pc(24) int[] local24 = local8.anIntArray489;
		@Pc(27) int[] local27 = local8.anIntArray492;
		@Pc(30) int[] local30 = local8.anIntArray488;
		@Pc(33) short[] local33 = local8.aShortArray101;
		@Pc(36) short[] local36 = local8.aShortArray96;
		@Pc(39) short[] local39 = local8.aShortArray93;
		@Pc(42) byte[] local42 = local8.aByteArray201;
		@Pc(49) short[] local49;
		@Pc(57) short[] local57;
		@Pc(53) short[] local53;
		@Pc(61) byte[] local61;
		if (this.aClass148_1 == null) {
			local57 = null;
			local49 = null;
			local53 = null;
			local61 = null;
		} else {
			local49 = this.aClass148_1.aShortArray46;
			local53 = this.aClass148_1.aShortArray47;
			local57 = this.aClass148_1.aShortArray48;
			local61 = this.aClass148_1.aByteArray126;
		}
		@Pc(78) short[] local78;
		@Pc(82) short[] local82;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local8.aClass148_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local80 = local8.aClass148_1.aByteArray126;
			local78 = local8.aClass148_1.aShortArray46;
			local82 = local8.aClass148_1.aShortArray48;
			local76 = local8.aClass148_1.aShortArray47;
		}
		@Pc(103) int[] local103 = local8.anIntArray491;
		@Pc(106) short[] local106 = local8.aShortArray99;
		if (!local8.aBoolean628) {
			local8.method5696();
		}
		@Pc(115) short local115 = local8.aShort98;
		@Pc(118) short local118 = local8.aShort94;
		@Pc(121) short local121 = local8.aShort97;
		@Pc(124) short local124 = local8.aShort92;
		@Pc(127) short local127 = local8.aShort90;
		@Pc(130) short local130 = local8.aShort93;
		for (@Pc(132) int local132 = 0; local132 < this.anInt7289; local132++) {
			@Pc(142) int local142 = this.anIntArray492[local132] - arg2;
			if (local142 >= local115 && local118 >= local142) {
				@Pc(162) int local162 = this.anIntArray489[local132] - arg1;
				if (local121 <= local162 && local124 >= local162) {
					@Pc(181) int local181 = this.anIntArray488[local132] - arg3;
					if (local181 >= local127 && local181 <= local130) {
						@Pc(199) int local199 = -1;
						@Pc(204) int local204 = this.anIntArray491[local132];
						@Pc(211) int local211 = this.anIntArray491[local132 + 1];
						for (@Pc(213) int local213 = local204; local213 < local211; local213++) {
							local199 = this.aShortArray99[local213] - 1;
							if (local199 == -1 || this.aByteArray201[local199] != 0) {
								break;
							}
						}
						if (local199 != -1) {
							for (@Pc(242) int local242 = 0; local242 < local21; local242++) {
								if (local24[local242] == local162 && local30[local242] == local181 && local142 == local27[local242]) {
									local211 = local103[local242 + 1];
									@Pc(275) int local275 = -1;
									local204 = local103[local242];
									for (@Pc(281) int local281 = local204; local281 < local211; local281++) {
										local275 = local106[local281] - 1;
										if (local275 == -1 || local42[local275] != 0) {
											break;
										}
									}
									if (local275 != -1) {
										if (local49 == null) {
											this.aClass148_1 = new Class148();
											local49 = this.aClass148_1.aShortArray46 = Static401.method5468(this.aShortArray101);
											local57 = this.aClass148_1.aShortArray48 = Static401.method5468(this.aShortArray96);
											local53 = this.aClass148_1.aShortArray47 = Static401.method5468(this.aShortArray93);
											local61 = this.aClass148_1.aByteArray126 = Static141.method2017(this.aByteArray201);
										}
										if (local78 == null) {
											@Pc(358) Class148 local358 = local8.aClass148_1 = new Class148();
											local78 = local358.aShortArray46 = Static401.method5468(local33);
											local82 = local358.aShortArray48 = Static401.method5468(local36);
											local76 = local358.aShortArray47 = Static401.method5468(local39);
											local80 = local358.aByteArray126 = Static141.method2017(local42);
										}
										@Pc(391) short local391 = this.aShortArray101[local199];
										@Pc(396) short local396 = this.aShortArray96[local199];
										@Pc(401) short local401 = this.aShortArray93[local199];
										local204 = local103[local242];
										local211 = local103[local242 + 1];
										@Pc(416) byte local416 = this.aByteArray201[local199];
										@Pc(426) int local426;
										for (@Pc(418) int local418 = local204; local418 < local211; local418++) {
											local426 = local106[local418] - 1;
											if (local426 == -1) {
												break;
											}
											if (local80[local426] != 0) {
												local78[local426] += local391;
												local82[local426] += local396;
												local76[local426] += local401;
												local80[local426] += local416;
											}
										}
										local396 = local36[local275];
										local391 = local33[local275];
										local416 = local42[local275];
										local211 = this.anIntArray491[local132 + 1];
										local204 = this.anIntArray491[local132];
										local401 = local39[local275];
										for (local426 = local204; local426 < local211; local426++) {
											@Pc(513) int local513 = this.aShortArray99[local426] - 1;
											if (local513 == -1) {
												break;
											}
											if (local61[local513] != 0) {
												local49[local513] += local391;
												local57[local513] += local396;
												local53[local513] += local401;
												local61[local513] += local416;
											}
										}
										if (this.aClass100_14 == null && this.aClass100_16 != null) {
											this.aClass100_16.anInterface12_4 = null;
										}
										if (this.aClass100_14 != null) {
											this.aClass100_14.anInterface12_4 = null;
										}
										if (local8.aClass100_14 == null && local8.aClass100_16 != null) {
											local8.aClass100_16.anInterface12_4 = null;
										}
										if (local8.aClass100_14 != null) {
											local8.aClass100_14.anInterface12_4 = null;
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

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "()I")
	@Override
	public int n() {
		return this.anInt7305;
	}

	@OriginalMember(owner = "client!ve", name = "xa", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg3 << 4;
			local22 = arg4 << 4;
			Static97.anInt2177 = 0;
			Static15.anInt384 = 0;
			local28 = 0;
			Static135.anInt2655 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray56.length > local38) {
					local48 = this.anIntArrayArray56[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static97.anInt2177 += this.anIntArray489[local56];
						Static135.anInt2655 += this.anIntArray492[local56];
						local28++;
						Static15.anInt384 += this.anIntArray488[local56];
					}
				}
			}
			if (local28 <= 0) {
				Static15.anInt384 = local22;
				Static97.anInt2177 = local14;
				Static135.anInt2655 = local18;
			} else {
				Static15.anInt384 = local22 + Static15.anInt384 / local28;
				Static97.anInt2177 = local14 + Static97.anInt2177 / local28;
				Static135.anInt2655 = local18 + Static135.anInt2655 / local28;
			}
			return;
		}
		@Pc(155) int[] local155;
		@Pc(157) int local157;
		if (arg0 == 1) {
			local18 = arg3 << 4;
			local22 = arg4 << 4;
			local14 = arg2 << 4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray56.length) {
					local155 = this.anIntArrayArray56[local32];
					for (local157 = 0; local157 < local155.length; local157++) {
						local50 = local155[local157];
						this.anIntArray489[local50] += local14;
						this.anIntArray492[local50] += local18;
						this.anIntArray488[local50] += local22;
					}
				}
			}
			return;
		}
		@Pc(274) int local274;
		@Pc(293) int local293;
		@Pc(748) int local748;
		if (arg0 == 2) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray56.length > local32) {
					local155 = this.anIntArrayArray56[local32];
					if ((arg5 & 0x1) == 0) {
						for (local157 = 0; local157 < local155.length; local157++) {
							local50 = local155[local157];
							this.anIntArray489[local50] -= Static97.anInt2177;
							this.anIntArray492[local50] -= Static135.anInt2655;
							this.anIntArray488[local50] -= Static15.anInt384;
							if (arg4 != 0) {
								local56 = Class184.anIntArray349[arg4];
								local274 = Class184.anIntArray350[arg4];
								local293 = local56 * this.anIntArray492[local50] + local274 * this.anIntArray489[local50] + 32767 >> 15;
								this.anIntArray492[local50] = this.anIntArray492[local50] * local274 + 32767 - local56 * this.anIntArray489[local50] >> 15;
								this.anIntArray489[local50] = local293;
							}
							if (arg2 != 0) {
								local56 = Class184.anIntArray349[arg2];
								local274 = Class184.anIntArray350[arg2];
								local293 = this.anIntArray492[local50] * local274 + 32767 - this.anIntArray488[local50] * local56 >> 15;
								this.anIntArray488[local50] = local56 * this.anIntArray492[local50] + local274 * this.anIntArray488[local50] + 32767 >> 15;
								this.anIntArray492[local50] = local293;
							}
							if (arg3 != 0) {
								local56 = Class184.anIntArray349[arg3];
								local274 = Class184.anIntArray350[arg3];
								local293 = local56 * this.anIntArray488[local50] + local274 * this.anIntArray489[local50] + 32767 >> 15;
								this.anIntArray488[local50] = this.anIntArray488[local50] * local274 + 32767 - local56 * this.anIntArray489[local50] >> 15;
								this.anIntArray489[local50] = local293;
							}
							this.anIntArray489[local50] += Static97.anInt2177;
							this.anIntArray492[local50] += Static135.anInt2655;
							this.anIntArray488[local50] += Static15.anInt384;
						}
					} else {
						for (local157 = 0; local157 < local155.length; local157++) {
							local50 = local155[local157];
							this.anIntArray489[local50] -= Static97.anInt2177;
							this.anIntArray492[local50] -= Static135.anInt2655;
							this.anIntArray488[local50] -= Static15.anInt384;
							if (arg2 != 0) {
								local56 = Class184.anIntArray349[arg2];
								local274 = Class184.anIntArray350[arg2];
								local293 = this.anIntArray492[local50] * local274 + 32767 - local56 * this.anIntArray488[local50] >> 15;
								this.anIntArray488[local50] = this.anIntArray488[local50] * local274 + this.anIntArray492[local50] * local56 + 32767 >> 15;
								this.anIntArray492[local50] = local293;
							}
							if (arg4 != 0) {
								local56 = Class184.anIntArray349[arg4];
								local274 = Class184.anIntArray350[arg4];
								local293 = this.anIntArray489[local50] * local274 + this.anIntArray492[local50] * local56 + 32767 >> 15;
								this.anIntArray492[local50] = this.anIntArray492[local50] * local274 + 32767 - this.anIntArray489[local50] * local56 >> 15;
								this.anIntArray489[local50] = local293;
							}
							if (arg3 != 0) {
								local56 = Class184.anIntArray349[arg3];
								local274 = Class184.anIntArray350[arg3];
								local293 = this.anIntArray489[local50] * local274 + this.anIntArray488[local50] * local56 + 32767 >> 15;
								this.anIntArray488[local50] = local274 * this.anIntArray488[local50] + 32767 - local56 * this.anIntArray489[local50] >> 15;
								this.anIntArray489[local50] = local293;
							}
							this.anIntArray489[local50] += Static97.anInt2177;
							this.anIntArray492[local50] += Static135.anInt2655;
							this.anIntArray488[local50] += Static15.anInt384;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray56.length) {
						local48 = this.anIntArrayArray56[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local274 = this.anIntArray491[local56];
							local293 = this.anIntArray491[local56 + 1];
							for (local748 = local274; local748 < local293; local748++) {
								@Pc(757) int local757 = this.aShortArray99[local748] - 1;
								if (local757 == -1) {
									break;
								}
								@Pc(770) int local770;
								@Pc(774) int local774;
								@Pc(792) int local792;
								if (arg4 != 0) {
									local770 = Class184.anIntArray349[arg4];
									local774 = Class184.anIntArray350[arg4];
									local792 = local774 * this.aShortArray101[local757] + this.aShortArray96[local757] * local770 + 32767 >> 15;
									this.aShortArray96[local757] = (short) (this.aShortArray96[local757] * local774 + 32767 - local770 * this.aShortArray101[local757] >> 15);
									this.aShortArray101[local757] = (short) local792;
								}
								if (arg2 != 0) {
									local770 = Class184.anIntArray349[arg2];
									local774 = Class184.anIntArray350[arg2];
									local792 = local774 * this.aShortArray96[local757] + 32767 - local770 * this.aShortArray93[local757] >> 15;
									this.aShortArray93[local757] = (short) (local770 * this.aShortArray96[local757] + this.aShortArray93[local757] * local774 + 32767 >> 15);
									this.aShortArray96[local757] = (short) local792;
								}
								if (arg3 != 0) {
									local770 = Class184.anIntArray349[arg3];
									local774 = Class184.anIntArray350[arg3];
									local792 = local774 * this.aShortArray101[local757] + this.aShortArray93[local757] * local770 + 32767 >> 15;
									this.aShortArray93[local757] = (short) (this.aShortArray93[local757] * local774 + 32767 - local770 * this.aShortArray101[local757] >> 15);
									this.aShortArray101[local757] = (short) local792;
								}
							}
						}
					}
				}
				if (this.aClass100_14 == null && this.aClass100_16 != null) {
					this.aClass100_16.anInterface12_4 = null;
				}
				if (this.aClass100_14 != null) {
					this.aClass100_14.anInterface12_4 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray56.length > local32) {
					local155 = this.anIntArrayArray56[local32];
					for (local157 = 0; local157 < local155.length; local157++) {
						local50 = local155[local157];
						this.anIntArray489[local50] -= Static97.anInt2177;
						this.anIntArray492[local50] -= Static135.anInt2655;
						this.anIntArray488[local50] -= Static15.anInt384;
						this.anIntArray489[local50] = arg2 * this.anIntArray489[local50] >> 7;
						this.anIntArray492[local50] = this.anIntArray492[local50] * arg3 >> 7;
						this.anIntArray488[local50] = this.anIntArray488[local50] * arg4 >> 7;
						this.anIntArray489[local50] += Static97.anInt2177;
						this.anIntArray492[local50] += Static135.anInt2655;
						this.anIntArray488[local50] += Static15.anInt384;
					}
				}
			}
		} else {
			@Pc(1203) Class259 local1203;
			@Pc(1208) Class203 local1208;
			if (arg0 == 5) {
				if (this.anIntArrayArray58 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray58.length > local32) {
							local155 = this.anIntArrayArray58[local32];
							for (local157 = 0; local157 < local155.length; local157++) {
								local50 = local155[local157];
								local56 = arg2 * 8 + (this.aByteArray202[local50] & 0xFF);
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray202[local50] = (byte) local56;
							}
							if (local155.length > 0 && this.aClass100_16 != null) {
								this.aClass100_16.anInterface12_4 = null;
							}
						}
					}
					if (this.aClass259Array1 != null) {
						for (local32 = 0; local32 < this.anInt7334; local32++) {
							local1203 = this.aClass259Array1[local32];
							local1208 = this.aClass203Array1[local32];
							local1208.anInt5787 = 255 - (this.aByteArray202[local1203.anInt7523] & 0xFF) << 24 | local1208.anInt5787 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1458) Class203 local1458;
				if (arg0 == 8) {
					if (this.anIntArrayArray57 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray57.length > local32) {
								local155 = this.anIntArrayArray57[local32];
								for (local157 = 0; local157 < local155.length; local157++) {
									local1458 = this.aClass203Array1[local155[local157]];
									local1458.anInt5781 += arg2;
									local1458.anInt5790 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray57 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray57.length) {
								local155 = this.anIntArrayArray57[local32];
								for (local157 = 0; local157 < local155.length; local157++) {
									local1458 = this.aClass203Array1[local155[local157]];
									local1458.anInt5789 = local1458.anInt5789 * arg2 >> 7;
									local1458.anInt5785 = arg3 * local1458.anInt5785 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray57 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray57.length) {
							local155 = this.anIntArrayArray57[local32];
							for (local157 = 0; local157 < local155.length; local157++) {
								local1458 = this.aClass203Array1[local155[local157]];
								local1458.anInt5783 = local1458.anInt5783 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray58 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray58.length) {
						local155 = this.anIntArrayArray58[local32];
						for (local157 = 0; local157 < local155.length; local157++) {
							local50 = local155[local157];
							local56 = this.aShortArray97[local50] & 0xFFFF;
							local274 = local56 >> 10 & 0x3F;
							local293 = local56 >> 7 & 0x7;
							local748 = local56 & 0x7F;
							local293 += arg3 / 4;
							@Pc(1303) int local1303 = local274 + arg2 & 0x3F;
							local748 += arg4;
							if (local293 < 0) {
								local293 = 0;
							} else if (local293 > 7) {
								local293 = 7;
							}
							if (local748 < 0) {
								local748 = 0;
							} else if (local748 > 127) {
								local748 = 127;
							}
							this.aShortArray97[local50] = (short) (local748 | local293 << 7 | local1303 << 10);
						}
						if (local155.length > 0 && this.aClass100_16 != null) {
							this.aClass100_16.anInterface12_4 = null;
						}
					}
				}
				if (this.aClass259Array1 != null) {
					for (local32 = 0; local32 < this.anInt7334; local32++) {
						local1203 = this.aClass259Array1[local32];
						local1208 = this.aClass203Array1[local32];
						local1208.anInt5787 = Static130.anIntArray144[this.aShortArray97[local1203.anInt7523] & 0xFFFF] & 0xFFFFFF | local1208.anInt5787 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
	private void method5699() {
		if (this.aClass259Array1 == null) {
			return;
		}
		@Pc(8) Class102_Sub2 local8 = this.aClass26_Sub1_39.aClass102_Sub2_2;
		@Pc(12) float local12 = this.aClass26_Sub1_39.w();
		@Pc(16) float local16 = this.aClass26_Sub1_39.la();
		this.aClass26_Sub1_39.method699();
		this.aClass26_Sub1_39.method2253(false);
		this.aClass26_Sub1_39.method662(false);
		this.aClass26_Sub1_39.method668(this.aClass26_Sub1_39.aClass100_3, this.aClass26_Sub1_39.aClass100_4, null, null);
		for (@Pc(43) int local43 = 0; local43 < this.anInt7334; local43++) {
			@Pc(50) Class259 local50 = this.aClass259Array1[local43];
			@Pc(55) Class203 local55 = this.aClass203Array1[local43];
			if (!local50.aBoolean642 || !this.aClass26_Sub1_39.method2267()) {
				@Pc(84) float local84 = (float) (this.anIntArray489[local50.anInt7522] + this.anIntArray489[local50.anInt7516] + this.anIntArray489[local50.anInt7521]) * 0.3333333F;
				@Pc(106) float local106 = (float) (this.anIntArray492[local50.anInt7522] + this.anIntArray492[local50.anInt7516] + this.anIntArray492[local50.anInt7521]) * 0.3333333F;
				@Pc(128) float local128 = (float) (this.anIntArray488[local50.anInt7522] + this.anIntArray488[local50.anInt7516] + this.anIntArray488[local50.anInt7521]) * 0.3333333F;
				@Pc(142) float local142 = Static396.aFloat207 * local84 + Static225.aFloat142 * local106 + Static65.aFloat228 * local128 + Static38.aFloat39;
				@Pc(156) float local156 = Static212.aFloat133 + Static62.aFloat60 * local128 + local84 * Static45.aFloat217 + Static90.aFloat68 * local106;
				@Pc(170) float local170 = Static368.aFloat197 + Static251.aFloat152 * local84 + Static265.aFloat216 * local106 + local128 * Static322.aFloat174;
				local8.method2656(local55.anInt5783, (float) local55.anInt5790 - local156, local50.aShort105 * local55.anInt5785 >> 7, local50.aShort104 * local55.anInt5789 >> 7, -local170, (float) local55.anInt5781 + local142);
				this.aClass26_Sub1_39.method642(local8);
				this.aClass26_Sub1_39.o(local16, local12 - (float) local50.anInt7519 * 1.5F);
				@Pc(221) int local221 = local55.anInt5787;
				OpenGL.glColor4ub((byte) (local221 >> 16), (byte) (local221 >> 8), (byte) local221, (byte) (local221 >> 24));
				this.aClass26_Sub1_39.method628(local50.aShort106);
				this.aClass26_Sub1_39.method671(local50.aByte102);
				this.aClass26_Sub1_39.method669(local50.aByte103);
				this.aClass26_Sub1_39.method707(4);
			}
		}
		this.aClass26_Sub1_39.o(local16, local12);
		this.aClass26_Sub1_39.method2253(true);
		this.aClass26_Sub1_39.method654();
	}

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "()I")
	@Override
	public int C() {
		if (!this.aBoolean628) {
			this.method5696();
		}
		return this.aShort93;
	}

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "(I)V")
	@Override
	public void u(@OriginalArg(0) int arg0) {
		this.anInt7305 = arg0;
		this.aBoolean627 = true;
		if (this.aClass148_1 != null && (this.anInt7305 & 0x10000) == 0) {
			this.aShortArray93 = this.aClass148_1.aShortArray47;
			this.aShortArray101 = this.aClass148_1.aShortArray46;
			this.aByteArray201 = this.aClass148_1.aByteArray126;
			this.aShortArray96 = this.aClass148_1.aShortArray48;
			this.aClass148_1 = null;
		}
		this.method5686();
	}

	@OriginalMember(owner = "client!ve", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aShort95 = (short) arg0;
		if (this.aClass100_16 != null) {
			this.aClass100_16.anInterface12_4 = null;
		}
		if (this.aClass100_14 != null) {
			this.aClass100_14.anInterface12_4 = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class184.anIntArray349[arg0];
		@Pc(13) int local13 = Class184.anIntArray350[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7289; local15++) {
			local34 = local9 * this.anIntArray488[local15] + local13 * this.anIntArray489[local15] >> 15;
			this.anIntArray488[local15] = this.anIntArray488[local15] * local13 - local9 * this.anIntArray489[local15] >> 15;
			this.anIntArray489[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt7333; local34++) {
			@Pc(84) int local84 = local9 * this.aShortArray93[local34] + local13 * this.aShortArray101[local34] >> 15;
			this.aShortArray93[local34] = (short) (this.aShortArray93[local34] * local13 - this.aShortArray101[local34] * local9 >> 15);
			this.aShortArray101[local34] = (short) local84;
		}
		if (this.aClass100_14 == null && this.aClass100_16 != null) {
			this.aClass100_16.anInterface12_4 = null;
		}
		if (this.aClass100_14 != null) {
			this.aClass100_14.anInterface12_4 = null;
		}
		this.aBoolean628 = false;
		if (this.aClass100_13 != null) {
			this.aClass100_13.anInterface12_4 = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "()Z")
	@Override
	public boolean method5676() {
		if (this.aShortArray95 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray95.length; local12++) {
			if (this.aShortArray95[local12] != -1 && !this.aClass26_Sub1_39.anInterface8_5.method3835(this.aShortArray95[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BZ)V")
	private void method5702(@OriginalArg(1) boolean arg0) {
		@Pc(20) boolean local20 = this.aClass100_16 != null && this.aClass100_16.anInterface12_4 == null;
		@Pc(31) boolean local31 = this.aClass100_14 != null && this.aClass100_14.anInterface12_4 == null;
		@Pc(42) boolean local42 = this.aClass100_13 != null && this.aClass100_13.anInterface12_4 == null;
		@Pc(53) boolean local53 = this.aClass100_15 != null && this.aClass100_15.anInterface12_4 == null;
		if (arg0) {
			local31 &= (this.aByte99 & 0x4) != 0;
			local53 &= (this.aByte99 & 0x8) != 0;
			local42 &= (this.aByte99 & 0x1) != 0;
			local20 &= (this.aByte99 & 0x2) != 0;
		}
		@Pc(104) byte local104 = 0;
		@Pc(108) byte local108 = 0;
		@Pc(110) byte local110 = 0;
		if (local42) {
			local104 = 12;
		}
		@Pc(121) byte local121 = 0;
		if (local20) {
			local108 = local104;
			local104 = (byte) (local104 + 4);
		}
		if (local31) {
			local110 = local104;
			local104 = (byte) (local104 + 12);
		}
		if (local53) {
			local121 = local104;
			local104 = (byte) (local104 + 8);
		}
		if (local104 == 0) {
			return;
		}
		if (local104 * this.anInt7333 <= Static309.aClass2_Sub20_Sub2_2.aByteArray136.length) {
			Static309.aClass2_Sub20_Sub2_2.anInt4608 = 0;
		} else {
			Static309.aClass2_Sub20_Sub2_2 = new Class2_Sub20_Sub2(local104 * (this.anInt7333 + 100));
		}
		@Pc(189) int local189;
		@Pc(198) int local198;
		@Pc(226) int local226;
		@Pc(235) int local235;
		if (local42) {
			@Pc(205) int local205;
			@Pc(212) int local212;
			@Pc(217) int local217;
			@Pc(224) int local224;
			if (this.aClass26_Sub1_39.aBoolean76) {
				for (local189 = 0; local189 < this.anInt7289; local189++) {
					local198 = NativeStream.floatToRawIntBits((float) this.anIntArray489[local189]);
					local205 = NativeStream.floatToRawIntBits((float) this.anIntArray492[local189]);
					local212 = NativeStream.floatToRawIntBits((float) this.anIntArray488[local189]);
					local217 = this.anIntArray491[local189];
					local224 = this.anIntArray491[local189 + 1];
					for (local226 = local217; local226 < local224; local226++) {
						local235 = this.aShortArray99[local226] - 1;
						if (local235 == -1) {
							break;
						}
						Static309.aClass2_Sub20_Sub2_2.anInt4608 = local104 * local235;
						Static309.aClass2_Sub20_Sub2_2.method3713(local198);
						Static309.aClass2_Sub20_Sub2_2.method3713(local205);
						Static309.aClass2_Sub20_Sub2_2.method3713(local212);
					}
				}
			} else {
				for (local189 = 0; local189 < this.anInt7289; local189++) {
					local198 = NativeStream.floatToRawIntBits((float) this.anIntArray489[local189]);
					local205 = NativeStream.floatToRawIntBits((float) this.anIntArray492[local189]);
					local212 = NativeStream.floatToRawIntBits((float) this.anIntArray488[local189]);
					local217 = this.anIntArray491[local189];
					local224 = this.anIntArray491[local189 + 1];
					for (local226 = local217; local226 < local224; local226++) {
						local235 = this.aShortArray99[local226] - 1;
						if (local235 == -1) {
							break;
						}
						Static309.aClass2_Sub20_Sub2_2.anInt4608 = local235 * local104;
						Static309.aClass2_Sub20_Sub2_2.method3703(local198);
						Static309.aClass2_Sub20_Sub2_2.method3703(local205);
						Static309.aClass2_Sub20_Sub2_2.method3703(local212);
					}
				}
			}
		}
		@Pc(479) float local479;
		@Pc(364) short[] local364;
		@Pc(376) short[] local376;
		@Pc(372) short[] local372;
		@Pc(368) byte[] local368;
		@Pc(523) float local523;
		if (local20) {
			if (this.aClass100_14 == null) {
				if (this.aClass148_1 == null) {
					local368 = this.aByteArray201;
					local376 = this.aShortArray96;
					local372 = this.aShortArray93;
					local364 = this.aShortArray101;
				} else {
					local364 = this.aClass148_1.aShortArray46;
					local368 = this.aClass148_1.aByteArray126;
					local372 = this.aClass148_1.aShortArray47;
					local376 = this.aClass148_1.aShortArray48;
				}
				@Pc(396) float local396 = this.aClass26_Sub1_39.aFloatArray3[0];
				@Pc(402) float local402 = this.aClass26_Sub1_39.aFloatArray3[1];
				@Pc(408) float local408 = this.aClass26_Sub1_39.aFloatArray3[2];
				@Pc(412) float local412 = this.aClass26_Sub1_39.aFloat33;
				@Pc(422) float local422 = this.aClass26_Sub1_39.aFloat24 * 768.0F / (float) this.aShort95;
				@Pc(432) float local432 = this.aClass26_Sub1_39.aFloat22 * 768.0F / (float) this.aShort95;
				for (@Pc(434) int local434 = 0; local434 < this.anInt7309; local434++) {
					@Pc(454) int local454 = this.method5695(this.aShortArray95[local434], this.aShortArray97[local434], this.aShort96, this.aByteArray202[local434]);
					@Pc(459) short local459 = this.aShortArray98[local434];
					@Pc(468) float local468 = this.aClass26_Sub1_39.aFloat32 * (float) (local454 >>> 24);
					local479 = (float) (local454 >> 16 & 0xFF) * this.aClass26_Sub1_39.aFloat30;
					@Pc(490) float local490 = (float) (local454 >> 8 & 0xFF) * this.aClass26_Sub1_39.aFloat29;
					@Pc(495) short local495 = (short) local368[local459];
					if (local495 == 0) {
						local523 = ((float) local372[local459] * local408 + (float) local376[local459] * local402 + (float) local364[local459] * local396) * 0.0026041667F;
					} else {
						local523 = (local408 * (float) local372[local459] + local402 * (float) local376[local459] + (float) local364[local459] * local396) / (float) (local495 * 256);
					}
					@Pc(560) float local560 = (local523 < 0.0F ? local432 : local422) * local523 + local412;
					@Pc(565) int local565 = (int) (local468 * local560);
					@Pc(570) int local570 = (int) (local560 * local479);
					if (local565 < 0) {
						local565 = 0;
					} else if (local565 > 255) {
						local565 = 255;
					}
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					@Pc(602) int local602 = (int) (local490 * local560);
					if (local602 < 0) {
						local602 = 0;
					} else if (local602 > 255) {
						local602 = 255;
					}
					Static309.aClass2_Sub20_Sub2_2.anInt4608 = local459 * local104 + local108;
					Static309.aClass2_Sub20_Sub2_2.method3699(local565);
					Static309.aClass2_Sub20_Sub2_2.method3699(local570);
					Static309.aClass2_Sub20_Sub2_2.method3699(local602);
					Static309.aClass2_Sub20_Sub2_2.method3699(255 - (this.aByteArray202[local434] & 0xFF));
					local459 = this.aShortArray102[local434];
					local495 = local368[local459];
					if (local495 == 0) {
						local523 = (local408 * (float) local372[local459] + (float) local364[local459] * local396 + (float) local376[local459] * local402) * 0.0026041667F;
					} else {
						local523 = (local396 * (float) local364[local459] + (float) local376[local459] * local402 + (float) local372[local459] * local408) / (float) (local495 * 256);
					}
					local560 = local523 * (local523 < 0.0F ? local432 : local422) + local412;
					local565 = (int) (local560 * local468);
					local570 = (int) (local479 * local560);
					if (local565 < 0) {
						local565 = 0;
					} else if (local565 > 255) {
						local565 = 255;
					}
					local602 = (int) (local490 * local560);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					Static309.aClass2_Sub20_Sub2_2.anInt4608 = local459 * local104 + local108;
					if (local602 < 0) {
						local602 = 0;
					} else if (local602 > 255) {
						local602 = 255;
					}
					Static309.aClass2_Sub20_Sub2_2.method3699(local565);
					Static309.aClass2_Sub20_Sub2_2.method3699(local570);
					Static309.aClass2_Sub20_Sub2_2.method3699(local602);
					Static309.aClass2_Sub20_Sub2_2.method3699(255 - (this.aByteArray202[local434] & 0xFF));
					local459 = this.aShortArray103[local434];
					local495 = local368[local459];
					if (local495 == 0) {
						local523 = (local402 * (float) local376[local459] + (float) local364[local459] * local396 + (float) local372[local459] * local408) * 0.0026041667F;
					} else {
						local523 = ((float) local372[local459] * local408 + local402 * (float) local376[local459] + (float) local364[local459] * local396) / (float) (local495 * 256);
					}
					local560 = local523 * (local523 < 0.0F ? local432 : local422) + local412;
					local565 = (int) (local560 * local468);
					if (local565 < 0) {
						local565 = 0;
					} else if (local565 > 255) {
						local565 = 255;
					}
					local570 = (int) (local479 * local560);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					local602 = (int) (local560 * local490);
					Static309.aClass2_Sub20_Sub2_2.anInt4608 = local459 * local104 + local108;
					if (local602 < 0) {
						local602 = 0;
					} else if (local602 > 255) {
						local602 = 255;
					}
					Static309.aClass2_Sub20_Sub2_2.method3699(local565);
					Static309.aClass2_Sub20_Sub2_2.method3699(local570);
					Static309.aClass2_Sub20_Sub2_2.method3699(local602);
					Static309.aClass2_Sub20_Sub2_2.method3699(255 - (this.aByteArray202[local434] & 0xFF));
				}
			} else {
				for (local189 = 0; local189 < this.anInt7309; local189++) {
					local198 = this.method5695(this.aShortArray95[local189], this.aShortArray97[local189], this.aShort96, this.aByteArray202[local189]);
					Static309.aClass2_Sub20_Sub2_2.anInt4608 = this.aShortArray98[local189] * local104 + local108;
					Static309.aClass2_Sub20_Sub2_2.method3713(local198);
					Static309.aClass2_Sub20_Sub2_2.anInt4608 = local108 + local104 * this.aShortArray102[local189];
					Static309.aClass2_Sub20_Sub2_2.method3713(local198);
					Static309.aClass2_Sub20_Sub2_2.anInt4608 = this.aShortArray103[local189] * local104 + local108;
					Static309.aClass2_Sub20_Sub2_2.method3713(local198);
				}
			}
		}
		if (local31) {
			if (this.aClass148_1 == null) {
				local376 = this.aShortArray96;
				local364 = this.aShortArray101;
				local368 = this.aByteArray201;
				local372 = this.aShortArray93;
			} else {
				local368 = this.aClass148_1.aByteArray126;
				local376 = this.aClass148_1.aShortArray48;
				local372 = this.aClass148_1.aShortArray47;
				local364 = this.aClass148_1.aShortArray46;
			}
			@Pc(1102) float local1102 = 3.0F / (float) this.aShort95;
			local523 = 3.0F / (float) (this.aShort95 + this.aShort95 / 2);
			Static309.aClass2_Sub20_Sub2_2.anInt4608 = local110;
			if (this.aClass26_Sub1_39.aBoolean76) {
				for (local226 = 0; local226 < this.anInt7333; local226++) {
					local235 = local368[local226] & 0xFF;
					if (local235 == 0) {
						Static309.aClass2_Sub20_Sub2_2.method3750(local523 * (float) local364[local226]);
						Static309.aClass2_Sub20_Sub2_2.method3750((float) local376[local226] * local523);
						Static309.aClass2_Sub20_Sub2_2.method3750(local523 * (float) local372[local226]);
					} else {
						local479 = local1102 / (float) local235;
						Static309.aClass2_Sub20_Sub2_2.method3750((float) local364[local226] * local479);
						Static309.aClass2_Sub20_Sub2_2.method3750((float) local376[local226] * local479);
						Static309.aClass2_Sub20_Sub2_2.method3750(local479 * (float) local372[local226]);
					}
					Static309.aClass2_Sub20_Sub2_2.anInt4608 += local104 - 12;
				}
			} else {
				for (local226 = 0; local226 < this.anInt7333; local226++) {
					local235 = local368[local226] & 0xFF;
					if (local235 == 0) {
						Static309.aClass2_Sub20_Sub2_2.method3753(local523 * (float) local364[local226]);
						Static309.aClass2_Sub20_Sub2_2.method3753((float) local376[local226] * local523);
						Static309.aClass2_Sub20_Sub2_2.method3753((float) local372[local226] * local523);
					} else {
						local479 = local1102 / (float) local235;
						Static309.aClass2_Sub20_Sub2_2.method3753((float) local364[local226] * local479);
						Static309.aClass2_Sub20_Sub2_2.method3753((float) local376[local226] * local479);
						Static309.aClass2_Sub20_Sub2_2.method3753(local479 * (float) local372[local226]);
					}
					Static309.aClass2_Sub20_Sub2_2.anInt4608 += local104 - 12;
				}
			}
		}
		if (local53) {
			Static309.aClass2_Sub20_Sub2_2.anInt4608 = local121;
			if (this.aClass26_Sub1_39.aBoolean76) {
				for (local189 = 0; local189 < this.anInt7333; local189++) {
					Static309.aClass2_Sub20_Sub2_2.method3750(this.aFloatArray31[local189]);
					Static309.aClass2_Sub20_Sub2_2.method3750(this.aFloatArray32[local189]);
					Static309.aClass2_Sub20_Sub2_2.anInt4608 += local104 - 8;
				}
			} else {
				for (local189 = 0; local189 < this.anInt7333; local189++) {
					Static309.aClass2_Sub20_Sub2_2.method3753(this.aFloatArray31[local189]);
					Static309.aClass2_Sub20_Sub2_2.method3753(this.aFloatArray32[local189]);
					Static309.aClass2_Sub20_Sub2_2.anInt4608 += local104 - 8;
				}
			}
		}
		Static309.aClass2_Sub20_Sub2_2.anInt4608 = local104 * this.anInt7333;
		@Pc(1413) Interface12 local1413;
		if (arg0) {
			if (this.anInterface12_7 == null) {
				this.anInterface12_7 = this.aClass26_Sub1_39.method692(local104, true, Static309.aClass2_Sub20_Sub2_2.anInt4608, Static309.aClass2_Sub20_Sub2_2.aByteArray136);
			} else {
				this.anInterface12_7.method3160(Static309.aClass2_Sub20_Sub2_2.aByteArray136, local104, Static309.aClass2_Sub20_Sub2_2.anInt4608);
			}
			local1413 = this.anInterface12_7;
			this.aByte99 = 0;
		} else {
			local1413 = this.aClass26_Sub1_39.method692(local104, false, Static309.aClass2_Sub20_Sub2_2.anInt4608, Static309.aClass2_Sub20_Sub2_2.aByteArray136);
			this.aBoolean627 = true;
		}
		if (local42) {
			this.aClass100_13.anInterface12_4 = local1413;
			this.aClass100_13.aByte25 = 0;
		}
		if (local53) {
			this.aClass100_15.anInterface12_4 = local1413;
			this.aClass100_15.aByte25 = local121;
		}
		if (local20) {
			this.aClass100_16.anInterface12_4 = local1413;
			this.aClass100_16.aByte25 = local108;
		}
		if (local31) {
			this.aClass100_14.anInterface12_4 = local1413;
			this.aClass100_14.aByte25 = local110;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)V")
	private void method5703(@OriginalArg(1) boolean arg0) {
		if (this.anInt7339 * 6 > Static309.aClass2_Sub20_Sub2_2.aByteArray136.length) {
			Static309.aClass2_Sub20_Sub2_2 = new Class2_Sub20_Sub2((this.anInt7339 + 100) * 6);
		} else {
			Static309.aClass2_Sub20_Sub2_2.anInt4608 = 0;
		}
		@Pc(44) int local44;
		if (this.aClass26_Sub1_39.aBoolean76) {
			for (local44 = 0; local44 < this.anInt7339; local44++) {
				Static309.aClass2_Sub20_Sub2_2.method3745(this.aShortArray98[local44]);
				Static309.aClass2_Sub20_Sub2_2.method3745(this.aShortArray102[local44]);
				Static309.aClass2_Sub20_Sub2_2.method3745(this.aShortArray103[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt7339; local44++) {
				Static309.aClass2_Sub20_Sub2_2.method3714(this.aShortArray98[local44]);
				Static309.aClass2_Sub20_Sub2_2.method3714(this.aShortArray102[local44]);
				Static309.aClass2_Sub20_Sub2_2.method3714(this.aShortArray103[local44]);
			}
		}
		if (Static309.aClass2_Sub20_Sub2_2.anInt4608 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface4_5 == null) {
				this.anInterface4_5 = this.aClass26_Sub1_39.method650(Static309.aClass2_Sub20_Sub2_2.aByteArray136, Static309.aClass2_Sub20_Sub2_2.anInt4608, true);
			} else {
				this.anInterface4_5.method3583(Static309.aClass2_Sub20_Sub2_2.aByteArray136, Static309.aClass2_Sub20_Sub2_2.anInt4608);
			}
			this.aClass75_1.anInterface4_3 = this.anInterface4_5;
		} else {
			this.aClass75_1.anInterface4_3 = this.aClass26_Sub1_39.method650(Static309.aClass2_Sub20_Sub2_2.aByteArray136, Static309.aClass2_Sub20_Sub2_2.anInt4608, false);
		}
		if (!arg0) {
			this.aBoolean627 = true;
		}
	}
}
