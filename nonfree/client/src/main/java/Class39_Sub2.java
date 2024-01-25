import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!ri", name = "v", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "[I")
	private int[] anIntArray508;

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!ri", name = "H", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!ri", name = "J", descriptor = "Lclient!eo;")
	private Interface5 anInterface5_6;

	@OriginalMember(owner = "client!ri", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!ri", name = "O", descriptor = "S")
	private short aShort86;

	@OriginalMember(owner = "client!ri", name = "Q", descriptor = "[Lclient!oo;")
	private Class192[] aClass192Array2;

	@OriginalMember(owner = "client!ri", name = "S", descriptor = "S")
	private short aShort87;

	@OriginalMember(owner = "client!ri", name = "T", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!ri", name = "U", descriptor = "[I")
	private int[] anIntArray509;

	@OriginalMember(owner = "client!ri", name = "Y", descriptor = "[I")
	private int[] anIntArray510;

	@OriginalMember(owner = "client!ri", name = "eb", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!ri", name = "fb", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!ri", name = "gb", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!ri", name = "hb", descriptor = "I")
	private int anInt5823;

	@OriginalMember(owner = "client!ri", name = "jb", descriptor = "S")
	private short aShort89;

	@OriginalMember(owner = "client!ri", name = "kb", descriptor = "S")
	private short aShort90;

	@OriginalMember(owner = "client!ri", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!ri", name = "nb", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!ri", name = "qb", descriptor = "[F")
	private float[] aFloatArray27;

	@OriginalMember(owner = "client!ri", name = "tb", descriptor = "I")
	private int anInt5828;

	@OriginalMember(owner = "client!ri", name = "vb", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!ri", name = "xb", descriptor = "I")
	private int anInt5831;

	@OriginalMember(owner = "client!ri", name = "Jb", descriptor = "Lclient!ph;")
	private Interface8 anInterface8_5;

	@OriginalMember(owner = "client!ri", name = "Kb", descriptor = "[Lclient!fa;")
	private Class75[] aClass75Array1;

	@OriginalMember(owner = "client!ri", name = "Ob", descriptor = "B")
	private byte aByte81;

	@OriginalMember(owner = "client!ri", name = "Qb", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!ri", name = "Rb", descriptor = "[I")
	private int[] anIntArray511;

	@OriginalMember(owner = "client!ri", name = "Tb", descriptor = "[F")
	private float[] aFloatArray28;

	@OriginalMember(owner = "client!ri", name = "Ub", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!ri", name = "Wb", descriptor = "[Lclient!nm;")
	private Class178[] aClass178Array1;

	@OriginalMember(owner = "client!ri", name = "Yb", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!ri", name = "Zb", descriptor = "[I")
	private int[] anIntArray512;

	@OriginalMember(owner = "client!ri", name = "dc", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!ri", name = "ec", descriptor = "Lclient!lm;")
	private Class153 aClass153_1;

	@OriginalMember(owner = "client!ri", name = "fc", descriptor = "[Lclient!ma;")
	private Class161[] aClass161Array2;

	@OriginalMember(owner = "client!ri", name = "ic", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!ri", name = "mc", descriptor = "[B")
	private byte[] aByteArray75;

	@OriginalMember(owner = "client!ri", name = "oc", descriptor = "S")
	private short aShort92;

	@OriginalMember(owner = "client!ri", name = "pc", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!ri", name = "rc", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!ri", name = "ab", descriptor = "Z")
	private boolean aBoolean386 = false;

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
	private int anInt5796 = 0;

	@OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
	private int anInt5810 = 0;

	@OriginalMember(owner = "client!ri", name = "pb", descriptor = "Z")
	private boolean aBoolean387 = true;

	@OriginalMember(owner = "client!ri", name = "ub", descriptor = "I")
	private int anInt5829 = 0;

	@OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
	private int anInt5812 = 0;

	@OriginalMember(owner = "client!ri", name = "gc", descriptor = "I")
	private int anInt5848 = 0;

	@OriginalMember(owner = "client!ri", name = "yb", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_33;

	@OriginalMember(owner = "client!ri", name = "ob", descriptor = "Lclient!ot;")
	private Class195 aClass195_9;

	@OriginalMember(owner = "client!ri", name = "Hb", descriptor = "Lclient!ot;")
	private Class195 aClass195_10;

	@OriginalMember(owner = "client!ri", name = "cb", descriptor = "Lclient!ot;")
	private Class195 aClass195_8;

	@OriginalMember(owner = "client!ri", name = "bc", descriptor = "Lclient!ot;")
	private Class195 aClass195_11;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "Lclient!fu;")
	private Class89 aClass89_1;

	static {
		new Class231("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class39_Sub2(@OriginalArg(0) Class28_Sub1 arg0) {
		this.aClass28_Sub1_33 = arg0;
		this.aClass195_9 = new Class195(this.aClass28_Sub1_33, null, 5126, 3, 0);
		this.aClass195_10 = new Class195(this.aClass28_Sub1_33, null, 5126, 2, 0);
		this.aClass195_8 = new Class195(this.aClass28_Sub1_33, null, 5126, 3, 0);
		this.aClass195_11 = new Class195(this.aClass28_Sub1_33, null, 5121, 4, 0);
		this.aClass89_1 = new Class89();
	}

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!bl;Lclient!wr;IIII)V")
	public Class39_Sub2(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) Class266 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5823 = arg5;
		this.anInt5828 = arg2;
		this.aClass28_Sub1_33 = arg0;
		if (Static269.method4104(arg5, arg2)) {
			this.aClass195_9 = new Class195(this.aClass28_Sub1_33, null, 5126, 3, 0);
		}
		if (Static326.method4621(arg5, arg2)) {
			this.aClass195_10 = new Class195(this.aClass28_Sub1_33, null, 5126, 2, 0);
		}
		if (Static54.method1013(arg2, arg5)) {
			this.aClass195_8 = new Class195(this.aClass28_Sub1_33, null, 5126, 3, 0);
		}
		if (Static64.method1229(arg5, arg2)) {
			this.aClass195_11 = new Class195(this.aClass28_Sub1_33, null, 5121, 4, 0);
		}
		if (Static96.method1659(arg2, arg5)) {
			this.aClass89_1 = new Class89();
		}
		@Pc(110) Interface11 local110 = arg0.anInterface11_6;
		@Pc(114) int[] local114 = new int[arg1.anInt7254];
		this.anIntArray508 = new int[arg1.anInt7253 + 1];
		for (@Pc(123) int local123 = 0; local123 < arg1.anInt7254; local123++) {
			if ((arg1.aByteArray93 == null || arg1.aByteArray93[local123] != 2) && (arg1.aShortArray110 == null || arg1.aShortArray110[local123] == -1 || !local110.method2466(arg1.aShortArray110[local123] & 0xFFFF).aBoolean404)) {
				local114[this.anInt5796++] = local123;
				this.anIntArray508[arg1.aShortArray112[local123]]++;
				this.anIntArray508[arg1.aShortArray105[local123]]++;
				this.anIntArray508[arg1.aShortArray111[local123]]++;
			}
		}
		this.anInt5848 = this.anInt5796;
		@Pc(215) long[] local215 = new long[this.anInt5796];
		@Pc(224) boolean local224 = (this.anInt5828 & 0x100) != 0;
		@Pc(236) int local236;
		@Pc(247) int local247;
		@Pc(373) int local373;
		label490: for (@Pc(226) int local226 = 0; local226 < this.anInt5796; local226++) {
			@Pc(232) int local232 = local114[local226];
			@Pc(234) Class229 local234 = null;
			local236 = 0;
			@Pc(238) byte local238 = 0;
			@Pc(240) byte local240 = 0;
			@Pc(242) byte local242 = 0;
			if (arg1.aClass15Array1 != null) {
				for (local247 = 0; local247 < arg1.aClass15Array1.length; local247++) {
					@Pc(254) Class15 local254 = arg1.aClass15Array1[local247];
					if (local232 == local254.anInt315) {
						@Pc(267) Class141 local267 = Static42.method822(local254.anInt314);
						if (local267.aBoolean242) {
							local215[local226] = Long.MAX_VALUE;
							this.anInt5848--;
							continue label490;
						}
					}
				}
			}
			@Pc(290) short local290 = -1;
			if (arg1.aShortArray110 != null) {
				local290 = arg1.aShortArray110[local232];
				if (local290 != -1) {
					local234 = local110.method2466(local290 & 0xFFFF);
					local240 = local234.aByte85;
					local242 = local234.aByte87;
				}
			}
			@Pc(335) boolean local335 = arg1.aByteArray89 != null && arg1.aByteArray89[local232] != 0 || local234 != null && !local234.aBoolean406;
			if ((local224 || local335) && arg1.aByteArray94 != null) {
				local236 += arg1.aByteArray94[local232] << 17;
			}
			if (local335) {
				local236 += 65536;
			}
			local236 += (local240 & 0xFF) << 8;
			local373 = local238 + ((local290 & 0xFFFF) << 16);
			local236 += local242 & 0xFF;
			@Pc(385) int local385 = local373 + (local226 & 0xFFFF);
			local215[local226] = (long) local385 + ((long) local236 << 32);
		}
		Static77.method1447(local114, local215);
		this.anInt5812 = arg1.anInt7253;
		this.anIntArray511 = arg1.anIntArray630;
		this.anInt5829 = arg1.anInt7245;
		this.anIntArray512 = arg1.anIntArray626;
		this.anIntArray510 = arg1.anIntArray629;
		this.lb = arg1.aShortArray106;
		@Pc(436) Class215[] local436 = new Class215[this.anInt5812];
		this.aClass161Array2 = arg1.aClass161Array3;
		this.aClass192Array2 = arg1.aClass192Array3;
		@Pc(464) int local464;
		@Pc(478) int local478;
		if (arg1.aClass15Array1 != null) {
			this.anInt5831 = arg1.aClass15Array1.length;
			this.aClass75Array1 = new Class75[this.anInt5831];
			this.aClass178Array1 = new Class178[this.anInt5831];
			for (local464 = 0; local464 < this.anInt5831; local464++) {
				@Pc(471) Class15 local471 = arg1.aClass15Array1[local464];
				@Pc(476) Class141 local476 = Static42.method822(local471.anInt314);
				local478 = -1;
				for (@Pc(480) int local480 = 0; local480 < this.anInt5796; local480++) {
					if (local114[local480] == local471.anInt315) {
						local478 = local480;
						break;
					}
				}
				if (local478 == -1) {
					throw new RuntimeException();
				}
				local247 = Static245.anIntArray376[arg1.aShortArray108[local471.anInt315] & 0xFFFF] & 0xFFFFFF;
				local247 |= 255 - (arg1.aByteArray89 == null ? 0 : arg1.aByteArray89[local471.anInt315]) << 24;
				this.aClass178Array1[local464] = new Class178(local478, arg1.aShortArray112[local471.anInt315], arg1.aShortArray105[local471.anInt315], arg1.aShortArray111[local471.anInt315], local476.anInt3653, local476.anInt3654, local476.anInt3648, local476.anInt3658, local476.anInt3649, local476.aBoolean242, local476.aBoolean243, local471.anInt313);
				this.aClass75Array1[local464] = new Class75(local247);
			}
		}
		local464 = this.anInt5796 * 3;
		this.aShort86 = (short) arg3;
		if (arg1.aShortArray103 != null) {
			this.aShortArray80 = new short[this.anInt5796];
		}
		this.aShortArray77 = new short[this.anInt5796];
		this.aShortArray79 = new short[this.anInt5796];
		this.aShortArray83 = new short[this.anInt5796];
		this.aShortArray75 = new short[local464];
		this.aFloatArray27 = new float[local464];
		this.aShortArray84 = new short[local464];
		this.aFloatArray28 = new float[local464];
		this.aShort88 = (short) arg4;
		this.aByteArray75 = new byte[this.anInt5796];
		this.aByteArray76 = new byte[local464];
		this.aShortArray76 = new short[local464];
		Static207.aLongArray4 = new long[local464];
		this.aShortArray82 = new short[local464];
		this.aShortArray81 = new short[this.anInt5796];
		this.aShortArray78 = new short[this.anInt5796];
		local236 = 0;
		for (local373 = 0; local373 < arg1.anInt7253; local373++) {
			local478 = this.anIntArray508[local373];
			this.anIntArray508[local373] = local236;
			local236 += local478;
			local436[local373] = new Class215();
		}
		this.anIntArray508[arg1.anInt7253] = local236;
		@Pc(720) int[] local720 = null;
		@Pc(722) int[] local722 = null;
		@Pc(724) int[] local724 = null;
		@Pc(726) float[][] local726 = null;
		@Pc(752) int local752;
		@Pc(788) int local788;
		@Pc(794) int local794;
		@Pc(807) int local807;
		@Pc(809) int local809;
		@Pc(843) int local843;
		@Pc(848) int local848;
		@Pc(1000) float local1000;
		@Pc(1031) float local1031;
		@Pc(1002) float local1002;
		if (arg1.aByteArray92 != null) {
			@Pc(732) int local732 = arg1.anInt7248;
			@Pc(735) int[] local735 = new int[local732];
			@Pc(738) int[] local738 = new int[local732];
			@Pc(741) int[] local741 = new int[local732];
			@Pc(744) int[] local744 = new int[local732];
			@Pc(747) int[] local747 = new int[local732];
			@Pc(750) int[] local750 = new int[local732];
			for (local752 = 0; local752 < local732; local752++) {
				local735[local752] = Integer.MAX_VALUE;
				local738[local752] = -2147483647;
				local741[local752] = Integer.MAX_VALUE;
				local744[local752] = -2147483647;
				local747[local752] = Integer.MAX_VALUE;
				local750[local752] = -2147483647;
			}
			for (local788 = 0; local788 < this.anInt5796; local788++) {
				local794 = local114[local788];
				if (arg1.aByteArray92[local794] != -1) {
					local807 = arg1.aByteArray92[local794] & 0xFF;
					for (local809 = 0; local809 < 3; local809++) {
						@Pc(824) short local824;
						if (local809 == 0) {
							local824 = arg1.aShortArray112[local794];
						} else if (local809 == 1) {
							local824 = arg1.aShortArray105[local794];
						} else {
							local824 = arg1.aShortArray111[local794];
						}
						local843 = arg1.anIntArray626[local824];
						local848 = arg1.anIntArray630[local824];
						@Pc(853) int local853 = arg1.anIntArray629[local824];
						if (local843 < local735[local807]) {
							local735[local807] = local843;
						}
						if (local843 > local738[local807]) {
							local738[local807] = local843;
						}
						if (local848 < local741[local807]) {
							local741[local807] = local848;
						}
						if (local848 > local744[local807]) {
							local744[local807] = local848;
						}
						if (local747[local807] > local853) {
							local747[local807] = local853;
						}
						if (local853 > local750[local807]) {
							local750[local807] = local853;
						}
					}
				}
			}
			local720 = new int[local732];
			local722 = new int[local732];
			local724 = new int[local732];
			local726 = new float[local732][];
			for (local794 = 0; local794 < local732; local794++) {
				@Pc(947) byte local947 = arg1.aByteArray91[local794];
				if (local947 > 0) {
					local720[local794] = (local738[local794] + local735[local794]) / 2;
					local722[local794] = (local744[local794] + local741[local794]) / 2;
					local724[local794] = (local750[local794] + local747[local794]) / 2;
					if (local947 == 1) {
						local848 = arg1.anIntArray633[local794];
						if (local848 == 0) {
							local1000 = 1.0F;
							local1002 = 1.0F;
						} else if (local848 > 0) {
							local1000 = 1.0F;
							local1002 = (float) local848 / 1024.0F;
						} else {
							local1002 = 1.0F;
							local1000 = (float) -local848 / 1024.0F;
						}
						local1031 = 64.0F / (float) arg1.anIntArray627[local794];
					} else if (local947 == 2) {
						local1000 = 64.0F / (float) arg1.anIntArray633[local794];
						local1031 = 64.0F / (float) arg1.anIntArray627[local794];
						local1002 = 64.0F / (float) arg1.anIntArray631[local794];
					} else {
						local1031 = (float) arg1.anIntArray627[local794] / 1024.0F;
						local1000 = (float) arg1.anIntArray633[local794] / 1024.0F;
						local1002 = (float) arg1.anIntArray631[local794] / 1024.0F;
					}
					local726[local794] = Static263.method4045(arg1.aShortArray104[local794], arg1.aByteArray95[local794] & 0xFF, arg1.aShortArray109[local794], local1002, local1031, arg1.aShortArray107[local794], local1000);
				}
			}
		}
		@Pc(1122) Class52[] local1122 = new Class52[arg1.anInt7254];
		@Pc(1141) short local1141;
		@Pc(1151) int local1151;
		@Pc(1161) int local1161;
		@Pc(1222) int local1222;
		for (@Pc(1124) int local1124 = 0; local1124 < arg1.anInt7254; local1124++) {
			@Pc(1131) short local1131 = arg1.aShortArray112[local1124];
			@Pc(1136) short local1136 = arg1.aShortArray105[local1124];
			local1141 = arg1.aShortArray111[local1124];
			local1151 = this.anIntArray512[local1136] - this.anIntArray512[local1131];
			local1161 = this.anIntArray511[local1136] - this.anIntArray511[local1131];
			local752 = this.anIntArray510[local1136] - this.anIntArray510[local1131];
			local788 = this.anIntArray512[local1141] - this.anIntArray512[local1131];
			local794 = this.anIntArray511[local1141] - this.anIntArray511[local1131];
			local807 = this.anIntArray510[local1141] - this.anIntArray510[local1131];
			local809 = local1161 * local807 - local794 * local752;
			local1222 = local752 * local788 - local1151 * local807;
			for (local843 = local794 * local1151 - local788 * local1161; local809 > 8192 || local1222 > 8192 || local843 > 8192 || local809 < -8192 || local1222 < -8192 || local843 < -8192; local843 >>= 0x1) {
				local809 >>= 0x1;
				local1222 >>= 0x1;
			}
			local848 = (int) Math.sqrt((double) (local843 * local843 + local1222 * local1222 + local809 * local809));
			if (local848 <= 0) {
				local848 = 1;
			}
			local1222 = local1222 * 256 / local848;
			local809 = local809 * 256 / local848;
			local843 = local843 * 256 / local848;
			@Pc(1316) byte local1316 = arg1.aByteArray93 == null ? 0 : arg1.aByteArray93[local1124];
			if (local1316 == 0) {
				@Pc(1344) Class215 local1344 = local436[local1131];
				local1344.anInt5726++;
				local1344.anInt5723 += local1222;
				local1344.anInt5725 += local843;
				local1344.anInt5724 += local809;
				@Pc(1372) Class215 local1372 = local436[local1136];
				local1372.anInt5723 += local1222;
				local1372.anInt5726++;
				local1372.anInt5725 += local843;
				local1372.anInt5724 += local809;
				@Pc(1400) Class215 local1400 = local436[local1141];
				local1400.anInt5724 += local809;
				local1400.anInt5726++;
				local1400.anInt5723 += local1222;
				local1400.anInt5725 += local843;
			} else if (local1316 == 1) {
				@Pc(1329) Class52 local1329 = local1122[local1124] = new Class52();
				local1329.anInt1499 = local843;
				local1329.anInt1501 = local1222;
				local1329.anInt1502 = local809;
			}
		}
		@Pc(1441) int local1441;
		for (@Pc(1435) int local1435 = 0; local1435 < this.anInt5796; local1435++) {
			local1441 = local114[local1435];
			@Pc(1448) int local1448 = arg1.aShortArray108[local1441] & 0xFFFF;
			@Pc(1453) short local1453;
			if (arg1.aShortArray110 == null) {
				local1453 = -1;
			} else {
				local1453 = arg1.aShortArray110[local1441];
			}
			if (arg1.aByteArray92 == null) {
				local1161 = -1;
			} else {
				local1161 = arg1.aByteArray92[local1441];
			}
			if (arg1.aByteArray89 == null) {
				local752 = 0;
			} else {
				local752 = arg1.aByteArray89[local1441] & 0xFF;
			}
			@Pc(1488) float local1488 = 0.0F;
			@Pc(1490) float local1490 = 0.0F;
			@Pc(1492) float local1492 = 0.0F;
			local1000 = 0.0F;
			local1031 = 0.0F;
			local1002 = 0.0F;
			@Pc(1500) byte local1500 = 0;
			@Pc(1502) byte local1502 = 0;
			@Pc(1504) int local1504 = 0;
			@Pc(1520) byte local1520;
			@Pc(1540) short local1540;
			@Pc(2279) short local2279;
			@Pc(2284) short local2284;
			if (local1453 != -1) {
				if (local1161 == -1) {
					local1031 = 0.0F;
					local1492 = 1.0F;
					local1002 = 0.0F;
					local1488 = 0.0F;
					local1490 = 1.0F;
					local1500 = 1;
					local1502 = 2;
					local1000 = 1.0F;
				} else {
					local1161 &= 0xFF;
					local1520 = arg1.aByteArray91[local1161];
					@Pc(1530) short local1530;
					@Pc(1535) short local1535;
					@Pc(1569) float local1569;
					@Pc(1774) float local1774;
					@Pc(1782) float local1782;
					@Pc(1883) float local1883;
					@Pc(1891) float local1891;
					@Pc(1899) float local1899;
					@Pc(1922) float local1922;
					@Pc(1945) float local1945;
					@Pc(1968) float local1968;
					if (local1520 == 0) {
						local1530 = arg1.aShortArray112[local1441];
						local1535 = arg1.aShortArray105[local1441];
						local1540 = arg1.aShortArray111[local1441];
						local2279 = arg1.aShortArray104[local1161];
						local2284 = arg1.aShortArray107[local1161];
						@Pc(2289) short local2289 = arg1.aShortArray109[local1161];
						@Pc(2295) float local2295 = (float) arg1.anIntArray626[local2279];
						@Pc(2301) float local2301 = (float) arg1.anIntArray630[local2279];
						local1569 = arg1.anIntArray629[local2279];
						local1774 = (float) arg1.anIntArray626[local2284] - local2295;
						local1782 = (float) arg1.anIntArray630[local2284] - local2301;
						@Pc(2331) float local2331 = (float) arg1.anIntArray629[local2284] - local1569;
						@Pc(2339) float local2339 = (float) arg1.anIntArray626[local2289] - local2295;
						@Pc(2347) float local2347 = (float) arg1.anIntArray630[local2289] - local2301;
						@Pc(2356) float local2356 = (float) arg1.anIntArray629[local2289] - local1569;
						@Pc(2365) float local2365 = (float) arg1.anIntArray626[local1530] - local2295;
						@Pc(2374) float local2374 = (float) arg1.anIntArray630[local1530] - local2301;
						@Pc(2382) float local2382 = (float) arg1.anIntArray629[local1530] - local1569;
						@Pc(2391) float local2391 = (float) arg1.anIntArray626[local1535] - local2295;
						@Pc(2400) float local2400 = (float) arg1.anIntArray630[local1535] - local2301;
						local1883 = (float) arg1.anIntArray629[local1535] - local1569;
						local1891 = (float) arg1.anIntArray626[local1540] - local2295;
						local1899 = (float) arg1.anIntArray630[local1540] - local2301;
						local1922 = (float) arg1.anIntArray629[local1540] - local1569;
						local1945 = local2356 * local1782 - local2331 * local2347;
						local1968 = local2339 * local2331 - local2356 * local1774;
						@Pc(2460) float local2460 = local1774 * local2347 - local2339 * local1782;
						@Pc(2469) float local2469 = local2460 * local2347 - local2356 * local1968;
						@Pc(2477) float local2477 = local2356 * local1945 - local2339 * local2460;
						@Pc(2485) float local2485 = local1968 * local2339 - local1945 * local2347;
						@Pc(2499) float local2499 = 1.0F / (local2331 * local2485 + local2469 * local1774 + local2477 * local1782);
						local1031 = local2499 * (local2485 * local1922 + local1891 * local2469 + local1899 * local2477);
						local1492 = (local2391 * local2469 + local2400 * local2477 + local1883 * local2485) * local2499;
						local1488 = (local2477 * local2374 + local2469 * local2365 + local2485 * local2382) * local2499;
						@Pc(2550) float local2550 = local1945 * local2331 - local2460 * local1774;
						@Pc(2559) float local2559 = local1782 * local2460 - local2331 * local1968;
						@Pc(2568) float local2568 = local1968 * local1774 - local1782 * local1945;
						@Pc(2582) float local2582 = 1.0F / (local2568 * local2356 + local2559 * local2339 + local2347 * local2550);
						local1000 = (local2559 * local2391 + local2400 * local2550 + local1883 * local2568) * local2582;
						local1002 = local2582 * (local1922 * local2568 + local1899 * local2550 + local2559 * local1891);
						local1490 = local2582 * (local2365 * local2559 + local2550 * local2374 + local2568 * local2382);
					} else {
						local1530 = arg1.aShortArray112[local1441];
						local1535 = arg1.aShortArray105[local1441];
						local1540 = arg1.aShortArray111[local1441];
						@Pc(1544) int local1544 = local720[local1161];
						@Pc(1548) int local1548 = local722[local1161];
						@Pc(1552) int local1552 = local724[local1161];
						@Pc(1556) float[] local1556 = local726[local1161];
						@Pc(1561) byte local1561 = arg1.aByteArray90[local1161];
						local1569 = (float) arg1.anIntArray624[local1161] / 256.0F;
						if (local1520 == 1) {
							local1774 = (float) arg1.anIntArray631[local1161] / 1024.0F;
							Static181.method2818(local1548, local1774, arg1.anIntArray629[local1530], local1561, arg1.anIntArray630[local1530], local1556, local1569, arg1.anIntArray626[local1530], local1552, local1544);
							local1488 = Static431.aFloat93;
							local1490 = Static356.aFloat94;
							Static181.method2818(local1548, local1774, arg1.anIntArray629[local1535], local1561, arg1.anIntArray630[local1535], local1556, local1569, arg1.anIntArray626[local1535], local1552, local1544);
							local1492 = Static431.aFloat93;
							local1000 = Static356.aFloat94;
							Static181.method2818(local1548, local1774, arg1.anIntArray629[local1540], local1561, arg1.anIntArray630[local1540], local1556, local1569, arg1.anIntArray626[local1540], local1552, local1544);
							local1002 = Static356.aFloat94;
							local1031 = Static431.aFloat93;
							local1782 = local1774 / 2.0F;
							if ((local1561 & 0x1) == 0) {
								if (local1031 - local1488 > local1782) {
									local1031 -= local1774;
									local1502 = 1;
								} else if (local1488 - local1031 > local1782) {
									local1502 = 2;
									local1031 += local1774;
								}
								if (local1492 - local1488 > local1782) {
									local1500 = 1;
									local1492 -= local1774;
								} else if (local1488 - local1492 > local1782) {
									local1492 += local1774;
									local1500 = 2;
								}
							} else {
								if (local1782 < local1000 - local1490) {
									local1000 -= local1774;
									local1500 = 1;
								} else if (local1782 < local1490 - local1000) {
									local1500 = 2;
									local1000 += local1774;
								}
								if (local1002 - local1490 > local1782) {
									local1002 -= local1774;
									local1502 = 1;
								} else if (local1782 < local1490 - local1002) {
									local1502 = 2;
									local1002 += local1774;
								}
							}
						} else if (local1520 == 2) {
							local1774 = (float) arg1.anIntArray628[local1161] / 256.0F;
							local1782 = (float) arg1.anIntArray632[local1161] / 256.0F;
							@Pc(1793) int local1793 = arg1.anIntArray626[local1535] - arg1.anIntArray626[local1530];
							@Pc(1804) int local1804 = arg1.anIntArray630[local1535] - arg1.anIntArray630[local1530];
							@Pc(1815) int local1815 = arg1.anIntArray629[local1535] - arg1.anIntArray629[local1530];
							@Pc(1826) int local1826 = arg1.anIntArray626[local1540] - arg1.anIntArray626[local1530];
							@Pc(1837) int local1837 = arg1.anIntArray630[local1540] - arg1.anIntArray630[local1530];
							@Pc(1848) int local1848 = arg1.anIntArray629[local1540] - arg1.anIntArray629[local1530];
							@Pc(1857) int local1857 = local1804 * local1848 - local1815 * local1837;
							@Pc(1866) int local1866 = local1826 * local1815 - local1793 * local1848;
							@Pc(1875) int local1875 = local1837 * local1793 - local1804 * local1826;
							local1883 = 64.0F / (float) arg1.anIntArray633[local1161];
							local1891 = 64.0F / (float) arg1.anIntArray627[local1161];
							local1899 = 64.0F / (float) arg1.anIntArray631[local1161];
							local1922 = (local1556[0] * (float) local1857 + (float) local1866 * local1556[1] + (float) local1875 * local1556[2]) / local1883;
							local1945 = (local1556[4] * (float) local1866 + (float) local1857 * local1556[3] + local1556[5] * (float) local1875) / local1891;
							local1968 = ((float) local1875 * local1556[8] + local1556[6] * (float) local1857 + local1556[7] * (float) local1866) / local1899;
							local1504 = Static374.method5187(local1945, local1968, local1922);
							Static397.method5428(local1556, local1569, local1548, local1782, local1544, arg1.anIntArray626[local1530], arg1.anIntArray630[local1530], arg1.anIntArray629[local1530], local1504, local1561, local1552, local1774);
							local1490 = Static112.aFloat97;
							local1488 = Static82.aFloat38;
							Static397.method5428(local1556, local1569, local1548, local1782, local1544, arg1.anIntArray626[local1535], arg1.anIntArray630[local1535], arg1.anIntArray629[local1535], local1504, local1561, local1552, local1774);
							local1492 = Static82.aFloat38;
							local1000 = Static112.aFloat97;
							Static397.method5428(local1556, local1569, local1548, local1782, local1544, arg1.anIntArray626[local1540], arg1.anIntArray630[local1540], arg1.anIntArray629[local1540], local1504, local1561, local1552, local1774);
							local1031 = Static82.aFloat38;
							local1002 = Static112.aFloat97;
						} else if (local1520 == 3) {
							Static286.method4276(local1556, arg1.anIntArray630[local1530], local1544, local1552, arg1.anIntArray626[local1530], local1569, local1548, local1561, arg1.anIntArray629[local1530]);
							local1490 = Static312.aFloat89;
							local1488 = Static261.aFloat83;
							Static286.method4276(local1556, arg1.anIntArray630[local1535], local1544, local1552, arg1.anIntArray626[local1535], local1569, local1548, local1561, arg1.anIntArray629[local1535]);
							local1492 = Static261.aFloat83;
							local1000 = Static312.aFloat89;
							Static286.method4276(local1556, arg1.anIntArray630[local1540], local1544, local1552, arg1.anIntArray626[local1540], local1569, local1548, local1561, arg1.anIntArray629[local1540]);
							local1031 = Static261.aFloat83;
							local1002 = Static312.aFloat89;
							if ((local1561 & 0x1) == 0) {
								if (local1492 - local1488 > 0.5F) {
									local1500 = 1;
									local1492--;
								} else if (local1488 - local1492 > 0.5F) {
									local1500 = 2;
									local1492++;
								}
								if (local1031 - local1488 > 0.5F) {
									local1031--;
									local1502 = 1;
								} else if (local1488 - local1031 > 0.5F) {
									local1031++;
									local1502 = 2;
								}
							} else {
								if (local1000 - local1490 > 0.5F) {
									local1500 = 1;
									local1000--;
								} else if (local1490 - local1000 > 0.5F) {
									local1000++;
									local1500 = 2;
								}
								if (local1002 - local1490 > 0.5F) {
									local1502 = 1;
									local1002--;
								} else if (local1490 - local1002 > 0.5F) {
									local1002++;
									local1502 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray93 == null) {
				local1520 = 0;
			} else {
				local1520 = arg1.aByteArray93[local1441];
			}
			if (local1520 == 0) {
				@Pc(2805) long local2805 = (long) (local1161 << 2) + ((long) (local1504 << 24) + (long) (local1448 << 8) + (long) local752 << 32);
				local1540 = arg1.aShortArray112[local1441];
				local2279 = arg1.aShortArray105[local1441];
				local2284 = arg1.aShortArray111[local1441];
				@Pc(2824) Class215 local2824 = local436[local1540];
				this.aShortArray81[local1435] = this.method4924(local1540, local2824.anInt5726, arg1, local2824.anInt5723, local1490, local2824.anInt5724, local2805, local1488, local2824.anInt5725);
				@Pc(2848) Class215 local2848 = local436[local2279];
				this.aShortArray83[local1435] = this.method4924(local2279, local2848.anInt5726, arg1, local2848.anInt5723, local1000, local2848.anInt5724, local2805 + (long) local1500, local1492, local2848.anInt5725);
				@Pc(2875) Class215 local2875 = local436[local2284];
				this.aShortArray79[local1435] = this.method4924(local2284, local2875.anInt5726, arg1, local2875.anInt5723, local1002, local2875.anInt5724, local2805 + (long) local1502, local1031, local2875.anInt5725);
			} else if (local1520 == 1) {
				@Pc(2665) Class52 local2665 = local1122[local1441];
				@Pc(2709) long local2709 = ((long) local752 + (long) (local1448 << 8) + (long) (local1504 << 24) << 32) + (long) ((local2665.anInt1499 + 256 << 22) + (local2665.anInt1501 + 256 << 12) + (local2665.anInt1502 > 0 ? 1024 : 2048) + (local1161 << 2));
				this.aShortArray81[local1435] = this.method4924(arg1.aShortArray112[local1441], 0, arg1, local2665.anInt1501, local1490, local2665.anInt1502, local2709, local1488, local2665.anInt1499);
				this.aShortArray83[local1435] = this.method4924(arg1.aShortArray105[local1441], 0, arg1, local2665.anInt1501, local1000, local2665.anInt1502, (long) local1500 + local2709, local1492, local2665.anInt1499);
				this.aShortArray79[local1435] = this.method4924(arg1.aShortArray111[local1441], 0, arg1, local2665.anInt1501, local1002, local2665.anInt1502, local2709 + (long) local1502, local1031, local2665.anInt1499);
			}
			if (arg1.aShortArray110 == null) {
				this.aShortArray77[local1435] = -1;
			} else {
				this.aShortArray77[local1435] = arg1.aShortArray110[local1441];
			}
			if (arg1.aByteArray89 != null) {
				this.aByteArray75[local1435] = arg1.aByteArray89[local1441];
			}
			if (arg1.aShortArray103 != null) {
				this.aShortArray80[local1435] = arg1.aShortArray103[local1441];
			}
			this.aShortArray78[local1435] = arg1.aShortArray108[local1441];
		}
		local1441 = 0;
		local1141 = -10000;
		for (local1151 = 0; local1151 < this.anInt5848; local1151++) {
			@Pc(2968) short local2968 = this.aShortArray77[local1151];
			if (local2968 != local1141) {
				local1141 = local2968;
				local1441++;
			}
		}
		this.anIntArray509 = new int[local1441 + 1];
		local1141 = -10000;
		local1441 = 0;
		for (local1161 = 0; local1161 < this.anInt5848; local1161++) {
			@Pc(3002) short local3002 = this.aShortArray77[local1161];
			if (local1141 != local3002) {
				this.anIntArray509[local1441++] = local1161;
				local1141 = local3002;
			}
		}
		this.anIntArray509[local1441] = this.anInt5848;
		Static207.aLongArray4 = null;
		this.aShortArray82 = Static161.method2655(this.anInt5810, this.aShortArray82);
		this.aShortArray75 = Static161.method2655(this.anInt5810, this.aShortArray75);
		this.aShortArray76 = Static161.method2655(this.anInt5810, this.aShortArray76);
		this.aByteArray76 = Static262.method4018(this.anInt5810, this.aByteArray76);
		this.aFloatArray28 = Static422.method5698(this.aFloatArray28, this.anInt5810);
		this.aFloatArray27 = Static422.method5698(this.aFloatArray27, this.anInt5810);
		if (arg1.anIntArray625 != null && Static95.method1647(arg2, this.anInt5823)) {
			this.anIntArrayArray53 = arg1.method5967();
		}
		if (arg1.aClass15Array1 != null && Static323.method4592(arg2, this.anInt5823)) {
			this.anIntArrayArray51 = arg1.method5971();
		}
		if (arg1.anIntArray634 != null && Static8.method122(this.anInt5823, arg2)) {
			local752 = 0;
			@Pc(3116) int[] local3116 = new int[256];
			for (local794 = 0; local794 < this.anInt5796; local794++) {
				local807 = arg1.anIntArray634[local114[local794]];
				if (local807 >= 0) {
					@Pc(3136) int local3136 = local3116[local807]++;
					if (local807 > local752) {
						local752 = local807;
					}
				}
			}
			this.anIntArrayArray52 = new int[local752 + 1][];
			for (local807 = 0; local807 <= local752; local807++) {
				this.anIntArrayArray52[local807] = new int[local3116[local807]];
				local3116[local807] = 0;
			}
			for (local809 = 0; local809 < this.anInt5796; local809++) {
				local1222 = arg1.anIntArray634[local114[local809]];
				if (local1222 >= 0) {
					this.anIntArrayArray52[local1222][local3116[local1222]++] = local809;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!un;)V")
	private void method4911(@OriginalArg(1) Class6_Sub1_Sub8_Sub1 arg0) {
		if (this.anInt5810 > Static202.anIntArray312.length) {
			Static202.anIntArray312 = new int[this.anInt5810];
			Static18.anIntArray22 = new int[this.anInt5810];
		}
		@Pc(47) int local47;
		@Pc(86) int local86;
		@Pc(95) int local95;
		for (@Pc(20) int local20 = 0; local20 < this.anInt5812; local20++) {
			local47 = (this.anIntArray512[local20] - (this.anIntArray511[local20] * this.aClass28_Sub1_33.anInt769 >> 8) >> this.aClass28_Sub1_33.anInt736) - arg0.anInt6840;
			@Pc(72) int local72 = (this.anIntArray510[local20] - (this.anIntArray511[local20] * this.aClass28_Sub1_33.anInt755 >> 8) >> this.aClass28_Sub1_33.anInt736) - arg0.anInt6832;
			@Pc(77) int local77 = this.anIntArray508[local20];
			@Pc(84) int local84 = this.anIntArray508[local20 + 1];
			for (local86 = local77; local86 < local84; local86++) {
				local95 = this.aShortArray84[local86] - 1;
				if (local95 == -1) {
					break;
				}
				Static202.anIntArray312[local95] = local47;
				Static18.anIntArray22[local95] = local72;
			}
		}
		for (local47 = 0; local47 < this.anInt5848; local47++) {
			if (this.aByteArray75 == null || this.aByteArray75[local47] <= 128) {
				@Pc(144) short local144 = this.aShortArray81[local47];
				@Pc(149) short local149 = this.aShortArray83[local47];
				@Pc(154) short local154 = this.aShortArray79[local47];
				local86 = Static202.anIntArray312[local144];
				local95 = Static202.anIntArray312[local149];
				@Pc(166) int local166 = Static202.anIntArray312[local154];
				@Pc(170) int local170 = Static18.anIntArray22[local144];
				@Pc(174) int local174 = Static18.anIntArray22[local149];
				@Pc(178) int local178 = Static18.anIntArray22[local154];
				if ((local174 - local178) * (local86 - local95) - (local166 - local95) * (local174 - local170) > 0) {
					arg0.method5584(local166, local86, local178, local174, local170, local95);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ql;Lclient!ni;I)V")
	@Override
	public void method4910(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class48_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5810 == 0) {
			return;
		}
		@Pc(13) Class132_Sub2 local13 = this.aClass28_Sub1_33.aClass132_Sub2_3;
		@Pc(16) Class132_Sub2 local16 = (Class132_Sub2) arg0;
		if (!this.aBoolean386) {
			this.method4913();
		}
		this.method4918(local16);
		Static278.aFloat85 = local13.aFloat71 + local16.aFloat76 * local13.aFloat75 + local13.aFloat79 * local16.aFloat72 + local16.aFloat71 * local13.aFloat73;
		Static195.aFloat63 = local13.aFloat73 * local16.aFloat75 + local13.aFloat75 * local16.aFloat80 + local16.aFloat74 * local13.aFloat79;
		@Pc(73) float local73 = (float) this.aShort90 * Static195.aFloat63 + Static278.aFloat85;
		@Pc(81) float local81 = (float) this.aShort92 * Static195.aFloat63 + Static278.aFloat85;
		@Pc(97) float local97;
		@Pc(91) float local91;
		if (local73 > local81) {
			local91 = local73 + (float) this.aShort91;
			local97 = local81 - (float) this.aShort91;
		} else {
			local97 = local73 - (float) this.aShort91;
			local91 = (float) this.aShort91 + local81;
		}
		if (this.aClass28_Sub1_33.aFloat16 <= local97 || (float) this.aClass28_Sub1_33.anInt773 >= local91) {
			return;
		}
		Static174.aFloat51 = local13.aFloat81 * local16.aFloat75 + local16.aFloat80 * local13.aFloat74 + local13.aFloat82 * local16.aFloat74;
		Static348.aFloat92 = local13.aFloat72 + local13.aFloat82 * local16.aFloat72 + local13.aFloat74 * local16.aFloat76 + local13.aFloat81 * local16.aFloat71;
		@Pc(173) float local173 = (float) this.aShort90 * Static174.aFloat51 + Static348.aFloat92;
		@Pc(181) float local181 = Static174.aFloat51 * (float) this.aShort92 + Static348.aFloat92;
		@Pc(208) float local208;
		@Pc(196) float local196;
		if (local173 > local181) {
			local196 = (float) this.aClass28_Sub1_33.anInt782 * (local173 + (float) this.aShort91);
			local208 = ((float) -this.aShort91 + local181) * (float) this.aClass28_Sub1_33.anInt782;
		} else {
			local208 = (local173 - (float) this.aShort91) * (float) this.aClass28_Sub1_33.anInt782;
			local196 = ((float) this.aShort91 + local181) * (float) this.aClass28_Sub1_33.anInt782;
		}
		if (this.aClass28_Sub1_33.aFloat11 <= local208 / local91 || this.aClass28_Sub1_33.aFloat21 >= local196 / local91) {
			return;
		}
		Static278.aFloat86 = local16.aFloat75 * local13.aFloat78 + local13.aFloat77 * local16.aFloat74 + local16.aFloat80 * local13.aFloat80;
		Static162.aFloat50 = local13.aFloat76 + local13.aFloat77 * local16.aFloat72 + local13.aFloat80 * local16.aFloat76 + local16.aFloat71 * local13.aFloat78;
		@Pc(297) float local297 = Static162.aFloat50 + (float) this.aShort90 * Static278.aFloat86;
		@Pc(305) float local305 = Static162.aFloat50 + Static278.aFloat86 * (float) this.aShort92;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local305 < local297) {
			local331 = (float) this.aClass28_Sub1_33.anInt752 * (local297 + (float) this.aShort91);
			local320 = (float) this.aClass28_Sub1_33.anInt752 * (local305 - (float) this.aShort91);
		} else {
			local320 = (local297 - (float) this.aShort91) * (float) this.aClass28_Sub1_33.anInt752;
			local331 = ((float) this.aShort91 + local305) * (float) this.aClass28_Sub1_33.anInt752;
		}
		if (local320 / local91 >= this.aClass28_Sub1_33.aFloat14 || this.aClass28_Sub1_33.aFloat25 >= local331 / local91) {
			return;
		}
		if (arg1 != null || this.aClass178Array1 != null) {
			Static198.aFloat65 = local16.aFloat78 * local13.aFloat80 + local16.aFloat81 * local13.aFloat77 + local13.aFloat78 * local16.aFloat73;
			Static286.aFloat87 = local16.aFloat73 * local13.aFloat73 + local13.aFloat75 * local16.aFloat78 + local16.aFloat81 * local13.aFloat79;
			Static188.aFloat59 = local13.aFloat82 * local16.aFloat81 + local16.aFloat78 * local13.aFloat74 + local16.aFloat73 * local13.aFloat81;
			Static400.aFloat101 = local13.aFloat77 * local16.aFloat82 + local13.aFloat80 * local16.aFloat77 + local16.aFloat79 * local13.aFloat78;
			Static4.aFloat1 = local13.aFloat73 * local16.aFloat79 + local16.aFloat82 * local13.aFloat79 + local16.aFloat77 * local13.aFloat75;
			Static26.aFloat48 = local13.aFloat82 * local16.aFloat82 + local16.aFloat77 * local13.aFloat74 + local13.aFloat81 * local16.aFloat79;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(500) int local500 = this.aShort85 + this.aShort87 >> 1;
			@Pc(509) int local509 = this.aShort89 + this.aShort84 >> 1;
			@Pc(528) int local528 = (int) (Static188.aFloat59 * (float) local509 + Static26.aFloat48 * (float) local500 + Static348.aFloat92 + (float) this.aShort90 * Static174.aFloat51);
			@Pc(547) int local547 = (int) ((float) this.aShort90 * Static278.aFloat86 + Static162.aFloat50 + (float) local500 * Static400.aFloat101 + Static198.aFloat65 * (float) local509);
			@Pc(566) int local566 = (int) (Static286.aFloat87 * (float) local509 + (float) this.aShort90 * Static195.aFloat63 + Static278.aFloat85 + Static4.aFloat1 * (float) local500);
			if (this.aClass28_Sub1_33.anInt773 <= local566) {
				arg1.anInt4591 = this.aClass28_Sub1_33.anInt757 + local547 * this.aClass28_Sub1_33.anInt752 / local566;
				arg1.anInt4590 = this.aClass28_Sub1_33.anInt781 + local528 * this.aClass28_Sub1_33.anInt782 / local566;
			} else {
				local490 = true;
			}
			@Pc(621) int local621 = (int) ((float) this.aShort92 * Static174.aFloat51 + Static348.aFloat92 + Static26.aFloat48 * (float) local500 + (float) local509 * Static188.aFloat59);
			@Pc(640) int local640 = (int) (Static400.aFloat101 * (float) local500 + Static162.aFloat50 + (float) this.aShort92 * Static278.aFloat86 + (float) local509 * Static198.aFloat65);
			@Pc(659) int local659 = (int) (Static286.aFloat87 * (float) local509 + Static4.aFloat1 * (float) local500 + Static278.aFloat85 + (float) this.aShort92 * Static195.aFloat63);
			if (this.aClass28_Sub1_33.anInt773 <= local659) {
				arg1.anInt4589 = this.aClass28_Sub1_33.anInt781 + this.aClass28_Sub1_33.anInt782 * local621 / local659;
				arg1.anInt4587 = this.aClass28_Sub1_33.anInt757 + this.aClass28_Sub1_33.anInt752 * local640 / local659;
			} else {
				local490 = true;
			}
			if (local490) {
				if (this.aClass28_Sub1_33.anInt773 > local566 && local659 < this.aClass28_Sub1_33.anInt773) {
					local492 = false;
				} else {
					@Pc(738) int local738;
					@Pc(750) int local750;
					@Pc(777) int local777;
					if (this.aClass28_Sub1_33.anInt773 > local566) {
						local738 = (local659 - this.aClass28_Sub1_33.anInt773 << 16) / (local659 - local566);
						local750 = local621 + (local738 * (local621 - local528) >> 16);
						arg1.anInt4590 = this.aClass28_Sub1_33.anInt782 * local750 / this.aClass28_Sub1_33.anInt773 + this.aClass28_Sub1_33.anInt781;
						local777 = local640 + ((local640 - local547) * local738 >> 16);
						arg1.anInt4591 = this.aClass28_Sub1_33.anInt752 * local777 / this.aClass28_Sub1_33.anInt773 + this.aClass28_Sub1_33.anInt757;
					} else if (this.aClass28_Sub1_33.anInt773 > local659) {
						local738 = (local566 - this.aClass28_Sub1_33.anInt773 << 16) / (local566 - local659);
						local750 = (local738 * (local528 - local621) >> 16) + local528;
						local777 = local547 + ((local547 - local640) * local738 >> 16);
						arg1.anInt4590 = this.aClass28_Sub1_33.anInt782 * local750 / this.aClass28_Sub1_33.anInt773 + this.aClass28_Sub1_33.anInt781;
						arg1.anInt4591 = local777 * this.aClass28_Sub1_33.anInt752 / this.aClass28_Sub1_33.anInt773 + this.aClass28_Sub1_33.anInt757;
					}
				}
			}
			if (local492) {
				arg1.aBoolean329 = true;
				if (local566 <= local659) {
					arg1.anInt4588 = this.aClass28_Sub1_33.anInt781 + this.aClass28_Sub1_33.anInt782 * (this.aShort91 + local621) / local659 - arg1.anInt4589;
				} else {
					arg1.anInt4588 = this.aClass28_Sub1_33.anInt781 + (local528 + this.aShort91) * this.aClass28_Sub1_33.anInt782 / local566 - arg1.anInt4590;
				}
			}
		}
		this.aClass28_Sub1_33.method644();
		this.aClass28_Sub1_33.method702(local16);
		this.method4919();
		this.aClass28_Sub1_33.method713();
		this.method4921();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BZ)V")
	private void method4912(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass195_11 != null && this.aClass195_11.anInterface5_5 == null;
		@Pc(27) boolean local27 = this.aClass195_8 != null && this.aClass195_8.anInterface5_5 == null;
		@Pc(38) boolean local38 = this.aClass195_9 != null && this.aClass195_9.anInterface5_5 == null;
		@Pc(49) boolean local49 = this.aClass195_10 != null && this.aClass195_10.anInterface5_5 == null;
		if (arg0) {
			local27 &= (this.aByte81 & 0x4) != 0;
			local16 &= (this.aByte81 & 0x2) != 0;
			local49 &= (this.aByte81 & 0x8) != 0;
			local38 &= (this.aByte81 & 0x1) != 0;
		}
		@Pc(103) byte local103 = 0;
		@Pc(107) byte local107 = 0;
		@Pc(109) byte local109 = 0;
		if (local38) {
			local103 = 12;
		}
		@Pc(120) byte local120 = 0;
		if (local16) {
			local107 = local103;
			local103 = (byte) (local103 + 4);
		}
		if (local27) {
			local109 = local103;
			local103 = (byte) (local103 + 12);
		}
		if (local49) {
			local120 = local103;
			local103 = (byte) (local103 + 8);
		}
		if (local103 == 0) {
			return;
		}
		if (Static71.aClass6_Sub15_Sub2_1.aByteArray51.length >= this.anInt5810 * local103) {
			Static71.aClass6_Sub15_Sub2_1.anInt3487 = 0;
		} else {
			Static71.aClass6_Sub15_Sub2_1 = new Class6_Sub15_Sub2((this.anInt5810 + 100) * local103);
		}
		@Pc(187) int local187;
		@Pc(196) int local196;
		@Pc(224) int local224;
		@Pc(233) int local233;
		if (local38) {
			@Pc(203) int local203;
			@Pc(210) int local210;
			@Pc(215) int local215;
			@Pc(222) int local222;
			if (this.aClass28_Sub1_33.aBoolean52) {
				for (local187 = 0; local187 < this.anInt5812; local187++) {
					local196 = NativeStream.floatToRawIntBits((float) this.anIntArray512[local187]);
					local203 = NativeStream.floatToRawIntBits((float) this.anIntArray511[local187]);
					local210 = NativeStream.floatToRawIntBits((float) this.anIntArray510[local187]);
					local215 = this.anIntArray508[local187];
					local222 = this.anIntArray508[local187 + 1];
					for (local224 = local215; local224 < local222; local224++) {
						local233 = this.aShortArray84[local224] - 1;
						if (local233 == -1) {
							break;
						}
						Static71.aClass6_Sub15_Sub2_1.anInt3487 = local103 * local233;
						Static71.aClass6_Sub15_Sub2_1.method3107(local196);
						Static71.aClass6_Sub15_Sub2_1.method3107(local203);
						Static71.aClass6_Sub15_Sub2_1.method3107(local210);
					}
				}
			} else {
				for (local187 = 0; local187 < this.anInt5812; local187++) {
					local196 = NativeStream.floatToRawIntBits((float) this.anIntArray512[local187]);
					local203 = NativeStream.floatToRawIntBits((float) this.anIntArray511[local187]);
					local210 = NativeStream.floatToRawIntBits((float) this.anIntArray510[local187]);
					local215 = this.anIntArray508[local187];
					local222 = this.anIntArray508[local187 + 1];
					for (local224 = local215; local224 < local222; local224++) {
						local233 = this.aShortArray84[local224] - 1;
						if (local233 == -1) {
							break;
						}
						Static71.aClass6_Sub15_Sub2_1.anInt3487 = local233 * local103;
						Static71.aClass6_Sub15_Sub2_1.method3089(local196);
						Static71.aClass6_Sub15_Sub2_1.method3089(local203);
						Static71.aClass6_Sub15_Sub2_1.method3089(local210);
					}
				}
			}
		}
		@Pc(474) float local474;
		@Pc(364) short[] local364;
		@Pc(361) short[] local361;
		@Pc(367) short[] local367;
		@Pc(370) byte[] local370;
		@Pc(521) float local521;
		if (local16) {
			if (this.aClass195_8 == null) {
				if (this.aClass153_1 == null) {
					local361 = this.aShortArray75;
					local364 = this.aShortArray82;
					local367 = this.aShortArray76;
					local370 = this.aByteArray76;
				} else {
					local364 = this.aClass153_1.aShortArray64;
					local370 = this.aClass153_1.aByteArray56;
					local361 = this.aClass153_1.aShortArray65;
					local367 = this.aClass153_1.aShortArray63;
				}
				@Pc(394) float local394 = this.aClass28_Sub1_33.aFloatArray6[0];
				@Pc(400) float local400 = this.aClass28_Sub1_33.aFloatArray6[1];
				@Pc(406) float local406 = this.aClass28_Sub1_33.aFloatArray6[2];
				@Pc(410) float local410 = this.aClass28_Sub1_33.aFloat13;
				@Pc(420) float local420 = this.aClass28_Sub1_33.aFloat15 * 768.0F / (float) this.aShort88;
				@Pc(430) float local430 = this.aClass28_Sub1_33.aFloat9 * 768.0F / (float) this.aShort88;
				for (@Pc(432) int local432 = 0; local432 < this.anInt5796; local432++) {
					@Pc(452) int local452 = this.method4914(this.aShortArray77[local432], this.aShort86, this.aShortArray78[local432], this.aByteArray75[local432]);
					@Pc(463) float local463 = (float) (local452 >> 8 & 0xFF) * this.aClass28_Sub1_33.aFloat19;
					local474 = (float) (local452 >> 16 & 0xFF) * this.aClass28_Sub1_33.aFloat8;
					@Pc(483) float local483 = (float) (local452 >>> 24) * this.aClass28_Sub1_33.aFloat26;
					@Pc(488) short local488 = this.aShortArray81[local432];
					@Pc(493) short local493 = (short) local370[local488];
					if (local493 == 0) {
						local521 = ((float) local364[local488] * local394 + local400 * (float) local361[local488] + local406 * (float) local367[local488]) * 0.0026041667F;
					} else {
						local521 = (local406 * (float) local367[local488] + local394 * (float) local364[local488] + (float) local361[local488] * local400) / (float) (local493 * 256);
					}
					@Pc(561) float local561 = local521 * (local521 < 0.0F ? local430 : local420) + local410;
					@Pc(566) int local566 = (int) (local561 * local483);
					@Pc(571) int local571 = (int) (local561 * local474);
					if (local566 < 0) {
						local566 = 0;
					} else if (local566 > 255) {
						local566 = 255;
					}
					@Pc(587) int local587 = (int) (local561 * local463);
					if (local571 < 0) {
						local571 = 0;
					} else if (local571 > 255) {
						local571 = 255;
					}
					if (local587 < 0) {
						local587 = 0;
					} else if (local587 > 255) {
						local587 = 255;
					}
					Static71.aClass6_Sub15_Sub2_1.anInt3487 = local488 * local103 + local107;
					Static71.aClass6_Sub15_Sub2_1.method3075(local566);
					Static71.aClass6_Sub15_Sub2_1.method3075(local571);
					Static71.aClass6_Sub15_Sub2_1.method3075(local587);
					Static71.aClass6_Sub15_Sub2_1.method3075(255 - (this.aByteArray75[local432] & 0xFF));
					local488 = this.aShortArray83[local432];
					local493 = local370[local488];
					if (local493 == 0) {
						local521 = ((float) local361[local488] * local400 + local394 * (float) local364[local488] + local406 * (float) local367[local488]) * 0.0026041667F;
					} else {
						local521 = (local406 * (float) local367[local488] + (float) local364[local488] * local394 + (float) local361[local488] * local400) / (float) (local493 * 256);
					}
					local561 = local521 * (local521 < 0.0F ? local430 : local420) + local410;
					local566 = (int) (local561 * local483);
					local571 = (int) (local474 * local561);
					if (local566 < 0) {
						local566 = 0;
					} else if (local566 > 255) {
						local566 = 255;
					}
					if (local571 < 0) {
						local571 = 0;
					} else if (local571 > 255) {
						local571 = 255;
					}
					local587 = (int) (local561 * local463);
					Static71.aClass6_Sub15_Sub2_1.anInt3487 = local103 * local488 + local107;
					if (local587 < 0) {
						local587 = 0;
					} else if (local587 > 255) {
						local587 = 255;
					}
					Static71.aClass6_Sub15_Sub2_1.method3075(local566);
					Static71.aClass6_Sub15_Sub2_1.method3075(local571);
					Static71.aClass6_Sub15_Sub2_1.method3075(local587);
					Static71.aClass6_Sub15_Sub2_1.method3075(255 - (this.aByteArray75[local432] & 0xFF));
					local488 = this.aShortArray79[local432];
					local493 = local370[local488];
					if (local493 == 0) {
						local521 = (local400 * (float) local361[local488] + local394 * (float) local364[local488] + local406 * (float) local367[local488]) * 0.0026041667F;
					} else {
						local521 = (local400 * (float) local361[local488] + local394 * (float) local364[local488] + local406 * (float) local367[local488]) / (float) (local493 * 256);
					}
					local561 = local410 + (local521 < 0.0F ? local430 : local420) * local521;
					local566 = (int) (local483 * local561);
					local571 = (int) (local561 * local474);
					if (local566 < 0) {
						local566 = 0;
					} else if (local566 > 255) {
						local566 = 255;
					}
					local587 = (int) (local463 * local561);
					if (local571 < 0) {
						local571 = 0;
					} else if (local571 > 255) {
						local571 = 255;
					}
					Static71.aClass6_Sub15_Sub2_1.anInt3487 = local107 + local103 * local488;
					if (local587 < 0) {
						local587 = 0;
					} else if (local587 > 255) {
						local587 = 255;
					}
					Static71.aClass6_Sub15_Sub2_1.method3075(local566);
					Static71.aClass6_Sub15_Sub2_1.method3075(local571);
					Static71.aClass6_Sub15_Sub2_1.method3075(local587);
					Static71.aClass6_Sub15_Sub2_1.method3075(255 - (this.aByteArray75[local432] & 0xFF));
				}
			} else {
				for (local187 = 0; local187 < this.anInt5796; local187++) {
					local196 = this.method4914(this.aShortArray77[local187], this.aShort86, this.aShortArray78[local187], this.aByteArray75[local187]);
					Static71.aClass6_Sub15_Sub2_1.anInt3487 = this.aShortArray81[local187] * local103 + local107;
					Static71.aClass6_Sub15_Sub2_1.method3107(local196);
					Static71.aClass6_Sub15_Sub2_1.anInt3487 = this.aShortArray83[local187] * local103 + local107;
					Static71.aClass6_Sub15_Sub2_1.method3107(local196);
					Static71.aClass6_Sub15_Sub2_1.anInt3487 = local103 * this.aShortArray79[local187] + local107;
					Static71.aClass6_Sub15_Sub2_1.method3107(local196);
				}
			}
		}
		if (local27) {
			if (this.aClass153_1 == null) {
				local367 = this.aShortArray76;
				local361 = this.aShortArray75;
				local364 = this.aShortArray82;
				local370 = this.aByteArray76;
			} else {
				local367 = this.aClass153_1.aShortArray63;
				local361 = this.aClass153_1.aShortArray65;
				local364 = this.aClass153_1.aShortArray64;
				local370 = this.aClass153_1.aByteArray56;
			}
			@Pc(1086) float local1086 = 3.0F / (float) this.aShort88;
			local521 = 3.0F / (float) (this.aShort88 + this.aShort88 / 2);
			Static71.aClass6_Sub15_Sub2_1.anInt3487 = local109;
			if (this.aClass28_Sub1_33.aBoolean52) {
				for (local224 = 0; local224 < this.anInt5810; local224++) {
					local233 = local370[local224] & 0xFF;
					if (local233 == 0) {
						Static71.aClass6_Sub15_Sub2_1.method3139(local521 * (float) local364[local224]);
						Static71.aClass6_Sub15_Sub2_1.method3139(local521 * (float) local361[local224]);
						Static71.aClass6_Sub15_Sub2_1.method3139((float) local367[local224] * local521);
					} else {
						local474 = local1086 / (float) local233;
						Static71.aClass6_Sub15_Sub2_1.method3139((float) local364[local224] * local474);
						Static71.aClass6_Sub15_Sub2_1.method3139(local474 * (float) local361[local224]);
						Static71.aClass6_Sub15_Sub2_1.method3139((float) local367[local224] * local474);
					}
					Static71.aClass6_Sub15_Sub2_1.anInt3487 += local103 - 12;
				}
			} else {
				for (local224 = 0; local224 < this.anInt5810; local224++) {
					local233 = local370[local224] & 0xFF;
					if (local233 == 0) {
						Static71.aClass6_Sub15_Sub2_1.method3142((float) local364[local224] * local521);
						Static71.aClass6_Sub15_Sub2_1.method3142(local521 * (float) local361[local224]);
						Static71.aClass6_Sub15_Sub2_1.method3142(local521 * (float) local367[local224]);
					} else {
						local474 = local1086 / (float) local233;
						Static71.aClass6_Sub15_Sub2_1.method3142(local474 * (float) local364[local224]);
						Static71.aClass6_Sub15_Sub2_1.method3142((float) local361[local224] * local474);
						Static71.aClass6_Sub15_Sub2_1.method3142(local474 * (float) local367[local224]);
					}
					Static71.aClass6_Sub15_Sub2_1.anInt3487 += local103 - 12;
				}
			}
		}
		if (local49) {
			Static71.aClass6_Sub15_Sub2_1.anInt3487 = local120;
			if (this.aClass28_Sub1_33.aBoolean52) {
				for (local187 = 0; local187 < this.anInt5810; local187++) {
					Static71.aClass6_Sub15_Sub2_1.method3139(this.aFloatArray28[local187]);
					Static71.aClass6_Sub15_Sub2_1.method3139(this.aFloatArray27[local187]);
					Static71.aClass6_Sub15_Sub2_1.anInt3487 += local103 - 8;
				}
			} else {
				for (local187 = 0; local187 < this.anInt5810; local187++) {
					Static71.aClass6_Sub15_Sub2_1.method3142(this.aFloatArray28[local187]);
					Static71.aClass6_Sub15_Sub2_1.method3142(this.aFloatArray27[local187]);
					Static71.aClass6_Sub15_Sub2_1.anInt3487 += local103 - 8;
				}
			}
		}
		Static71.aClass6_Sub15_Sub2_1.anInt3487 = local103 * this.anInt5810;
		@Pc(1382) Interface5 local1382;
		if (arg0) {
			if (this.anInterface5_6 == null) {
				this.anInterface5_6 = this.aClass28_Sub1_33.method682(Static71.aClass6_Sub15_Sub2_1.aByteArray51, Static71.aClass6_Sub15_Sub2_1.anInt3487, local103, true);
			} else {
				this.anInterface5_6.method4746(Static71.aClass6_Sub15_Sub2_1.aByteArray51, Static71.aClass6_Sub15_Sub2_1.anInt3487, local103);
			}
			this.aByte81 = 0;
			local1382 = this.anInterface5_6;
		} else {
			local1382 = this.aClass28_Sub1_33.method682(Static71.aClass6_Sub15_Sub2_1.aByteArray51, Static71.aClass6_Sub15_Sub2_1.anInt3487, local103, false);
			this.aBoolean387 = true;
		}
		if (local38) {
			this.aClass195_9.anInterface5_5 = local1382;
			this.aClass195_9.aByte60 = 0;
		}
		if (local49) {
			this.aClass195_10.anInterface5_5 = local1382;
			this.aClass195_10.aByte60 = local120;
		}
		if (local16) {
			this.aClass195_11.anInterface5_5 = local1382;
			this.aClass195_11.aByte60 = local107;
		}
		if (local27) {
			this.aClass195_8.aByte60 = local109;
			this.aClass195_8.anInterface5_5 = local1382;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILclient!fo;Lclient!fo;III)V")
	@Override
	public void method4872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) Class84 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean386) {
			this.method4913();
		}
		@Pc(17) int local17 = arg4 + this.aShort87;
		@Pc(22) int local22 = this.aShort85 + arg4;
		@Pc(27) int local27 = arg6 + this.aShort89;
		@Pc(32) int local32 = this.aShort84 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt6363 <= arg2.anInt6362 + local22 >> arg2.anInt6366 || local27 < 0 || arg2.anInt6362 + local32 >> arg2.anInt6366 >= arg2.anInt6360)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || local22 + arg3.anInt6362 >> arg3.anInt6366 >= arg3.anInt6363 || local27 < 0 || arg3.anInt6360 <= arg3.anInt6362 + local32 >> arg3.anInt6366) {
				return;
			}
		} else {
			local17 >>= arg2.anInt6366;
			local22 = arg2.anInt6362 + local22 - 1 >> arg2.anInt6366;
			local27 >>= arg2.anInt6366;
			local32 = local32 + arg2.anInt6362 - 1 >> arg2.anInt6366;
			if (arg2.method5322(local17, local27) == arg5 && arg5 == arg2.method5322(local22, local27) && arg2.method5322(local17, local32) == arg5 && arg2.method5322(local22, local32) == arg5) {
				return;
			}
		}
		@Pc(199) int local199;
		if (arg0 == 1) {
			for (local199 = 0; local199 < this.anInt5812; local199++) {
				this.anIntArray511[local199] = this.anIntArray511[local199] + arg2.method5334(this.anIntArray512[local199] + arg4, this.anIntArray510[local199] - -arg6) - arg5;
			}
		} else {
			@Pc(207) int local207;
			@Pc(215) int local215;
			if (arg0 == 2) {
				@Pc(415) short local415 = this.aShort90;
				if (local415 == 0) {
					return;
				}
				for (local207 = 0; local207 < this.anInt5812; local207++) {
					local215 = (this.anIntArray511[local207] << 16) / local415;
					if (local215 < arg1) {
						this.anIntArray511[local207] += (arg1 - local215) * (-arg5 + arg2.method5334(this.anIntArray512[local207] - -arg4, arg6 + this.anIntArray510[local207])) / arg1;
					}
				}
			} else {
				@Pc(223) int local223;
				if (arg0 == 3) {
					local199 = (arg1 & 0xFF) * 4;
					local207 = (arg1 >> 8 & 0xFF) * 4;
					local215 = (arg1 >> 16 & 0xFF) << 6;
					local223 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local199 >> 1) < 0 || arg2.anInt6363 << arg2.anInt6366 <= arg4 + (local199 >> 1) + arg2.anInt6362 || arg6 - (local207 >> 1) < 0 || arg2.anInt6360 << arg2.anInt6366 <= (local207 >> 1) + arg6 + arg2.anInt6362) {
						return;
					}
					this.method4879(local223, arg4, local199, arg2, arg6, local215, arg5, local207);
				} else if (arg0 == 4) {
					local199 = this.aShort92 - this.aShort90;
					for (local207 = 0; local207 < this.anInt5812; local207++) {
						this.anIntArray511[local207] = this.anIntArray511[local207] + arg3.method5334(this.anIntArray512[local207] + arg4, arg6 + this.anIntArray510[local207]) + local199 - arg5;
					}
				} else if (arg0 == 5) {
					local199 = this.aShort92 - this.aShort90;
					for (local207 = 0; local207 < this.anInt5812; local207++) {
						local215 = this.anIntArray512[local207] + arg4;
						local223 = arg6 + this.anIntArray510[local207];
						@Pc(370) int local370 = arg2.method5334(local215, local223);
						@Pc(375) int local375 = arg3.method5334(local215, local223);
						@Pc(380) int local380 = local370 - local375;
						this.anIntArray511[local207] = local370 + ((this.anIntArray511[local207] << 8) / local199 * local380 >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean386 = false;
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface5_5 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "()I")
	@Override
	public int method4881() {
		return this.aShort88;
	}

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "(I)V")
	private void method4913() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt5812; local23++) {
			@Pc(30) int local30 = this.anIntArray512[local23];
			@Pc(35) int local35 = this.anIntArray511[local23];
			if (local30 < local7) {
				local7 = local30;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			@Pc(54) int local54 = this.anIntArray510[local23];
			if (local9 > local35) {
				local9 = local35;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			if (local11 > local54) {
				local11 = local54;
			}
			if (local54 > local17) {
				local17 = local54;
			}
			@Pc(86) int local86 = local30 * local30 + local54 * local54;
			if (local19 < local86) {
				local19 = local86;
			}
			local86 = local30 * local30 + local54 * local54 + local35 * local35;
			if (local86 > local21) {
				local21 = local86;
			}
		}
		this.aShort84 = (short) local17;
		this.aShort92 = (short) local15;
		this.aShort85 = (short) local13;
		this.aShort89 = (short) local11;
		this.aShort87 = (short) local7;
		this.aShort90 = (short) local9;
		this.aShort91 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean386 = true;
	}

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "()I")
	@Override
	public int method4894() {
		if (!this.aBoolean386) {
			this.method4913();
		}
		return this.aShort89;
	}

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
	@Override
	public void method4886(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub1_Sub18.anIntArray642[arg0];
		@Pc(13) int local13 = Class6_Sub1_Sub18.anIntArray643[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5812; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray512[local15] + local9 * this.anIntArray511[local15] >> 15;
			this.anIntArray511[local15] = local13 * this.anIntArray511[local15] - local9 * this.anIntArray512[local15] >> 15;
			this.anIntArray512[local15] = local33;
		}
		this.aBoolean386 = false;
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface5_5 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "()V")
	@Override
	protected void method4897() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5829; local3++) {
			this.anIntArray512[local3] = this.anIntArray512[local3] + 7 >> 4;
			this.anIntArray511[local3] = this.anIntArray511[local3] + 7 >> 4;
			this.anIntArray510[local3] = this.anIntArray510[local3] + 7 >> 4;
		}
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface5_5 = null;
		}
		this.aBoolean386 = false;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "()Z")
	@Override
	public boolean method4865() {
		if (this.aShortArray77 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray77.length; local12++) {
			if (this.aShortArray77[local12] != -1 && !this.aClass28_Sub1_33.anInterface11_6.method2468(this.aShortArray77[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V")
	@Override
	public void method4883(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub1_Sub18.anIntArray642[arg0];
		@Pc(13) int local13 = Class6_Sub1_Sub18.anIntArray643[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5812; local15++) {
			@Pc(33) int local33 = this.anIntArray511[local15] * local13 - local9 * this.anIntArray510[local15] >> 15;
			this.anIntArray510[local15] = local9 * this.anIntArray511[local15] + this.anIntArray510[local15] * local13 >> 15;
			this.anIntArray511[local15] = local33;
		}
		this.aBoolean386 = false;
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface5_5 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "()[Lclient!ma;")
	@Override
	public Class161[] method4885() {
		return this.aClass161Array2;
	}

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "()I")
	@Override
	public int method4902() {
		return this.aShort86;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(SIIBB)I")
	private int method4914(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(21) int local21 = Static245.anIntArray376[Static240.method3730(arg1, arg2)];
		if (arg0 != -1) {
			@Pc(33) Class229 local33 = this.aClass28_Sub1_33.anInterface11_6.method2466(arg0 & 0xFFFF);
			@Pc(38) int local38 = local33.aByte84 & 0xFF;
			@Pc(47) int local47;
			@Pc(76) int local76;
			if (local38 != 0) {
				if (arg1 < 0) {
					local47 = 0;
				} else if (arg1 <= 127) {
					local47 = arg1 * 131586;
				} else {
					local47 = 16777215;
				}
				if (local38 == 256) {
					local21 = local47;
				} else {
					local76 = 256 - local38;
					local21 = ((local47 & 0xFF00FF) * local38 + local76 * (local21 & 0xFF00FF) & 0xFF00FF00) + (local38 * (local47 & 0xFF00) + ((local21 & 0xFF00) * local76) & 0xFF0000) >> 8;
				}
			}
			local47 = local33.aByte83 & 0xFF;
			if (local47 != 0) {
				local47 += 256;
				@Pc(123) int local123 = (local21 >> 16 & 0xFF) * local47;
				if (local123 > 65535) {
					local123 = 65535;
				}
				local76 = local47 * (local21 >> 8 & 0xFF);
				if (local76 > 65535) {
					local76 = 65535;
				}
				@Pc(149) int local149 = (local21 & 0xFF) * local47;
				if (local149 > 65535) {
					local149 = 65535;
				}
				local21 = ((local123 & 0xC000FF00) << 8) + (local76 & 0xFF00) + (local149 >> 8);
			}
		}
		return (local21 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!cd;IIIZ)V")
	@Override
	public void method4895(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class39_Sub2 local8 = (Class39_Sub2) arg0;
		if (this.anInt5796 == 0 || local8.anInt5796 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt5812;
		@Pc(21) int[] local21 = local8.anIntArray512;
		@Pc(24) int[] local24 = local8.anIntArray511;
		@Pc(27) int[] local27 = local8.anIntArray510;
		@Pc(30) short[] local30 = local8.aShortArray82;
		@Pc(33) short[] local33 = local8.aShortArray75;
		@Pc(36) short[] local36 = local8.aShortArray76;
		@Pc(39) byte[] local39 = local8.aByteArray76;
		@Pc(54) short[] local54;
		@Pc(46) short[] local46;
		@Pc(58) short[] local58;
		@Pc(50) byte[] local50;
		if (this.aClass153_1 == null) {
			local46 = null;
			local58 = null;
			local54 = null;
			local50 = null;
		} else {
			local46 = this.aClass153_1.aShortArray65;
			local50 = this.aClass153_1.aByteArray56;
			local54 = this.aClass153_1.aShortArray64;
			local58 = this.aClass153_1.aShortArray63;
		}
		@Pc(87) short[] local87;
		@Pc(79) short[] local79;
		@Pc(75) short[] local75;
		@Pc(83) byte[] local83;
		if (local8.aClass153_1 == null) {
			local79 = null;
			local87 = null;
			local75 = null;
			local83 = null;
		} else {
			local75 = local8.aClass153_1.aShortArray63;
			local79 = local8.aClass153_1.aShortArray65;
			local83 = local8.aClass153_1.aByteArray56;
			local87 = local8.aClass153_1.aShortArray64;
		}
		@Pc(100) int[] local100 = local8.anIntArray508;
		@Pc(103) short[] local103 = local8.aShortArray84;
		if (!local8.aBoolean386) {
			local8.method4913();
		}
		@Pc(112) short local112 = local8.aShort90;
		@Pc(115) short local115 = local8.aShort92;
		@Pc(118) short local118 = local8.aShort87;
		@Pc(121) short local121 = local8.aShort85;
		@Pc(124) short local124 = local8.aShort89;
		@Pc(127) short local127 = local8.aShort84;
		for (@Pc(129) int local129 = 0; local129 < this.anInt5812; local129++) {
			@Pc(139) int local139 = this.anIntArray511[local129] - arg2;
			if (local112 <= local139 && local139 <= local115) {
				@Pc(159) int local159 = this.anIntArray512[local129] - arg1;
				if (local118 <= local159 && local159 <= local121) {
					@Pc(183) int local183 = this.anIntArray510[local129] - arg3;
					if (local183 >= local124 && local127 >= local183) {
						@Pc(197) int local197 = -1;
						@Pc(202) int local202 = this.anIntArray508[local129];
						@Pc(209) int local209 = this.anIntArray508[local129 + 1];
						for (@Pc(211) int local211 = local202; local211 < local209; local211++) {
							local197 = this.aShortArray84[local211] - 1;
							if (local197 == -1 || this.aByteArray76[local197] != 0) {
								break;
							}
						}
						if (local197 != -1) {
							for (@Pc(243) int local243 = 0; local243 < local18; local243++) {
								if (local21[local243] == local159 && local183 == local27[local243] && local24[local243] == local139) {
									local209 = local100[local243 + 1];
									local202 = local100[local243];
									@Pc(276) int local276 = -1;
									for (@Pc(278) int local278 = local202; local278 < local209; local278++) {
										local276 = local103[local278] - 1;
										if (local276 == -1 || local39[local276] != 0) {
											break;
										}
									}
									if (local276 != -1) {
										if (local54 == null) {
											this.aClass153_1 = new Class153();
											local54 = this.aClass153_1.aShortArray64 = Static182.method2834(this.aShortArray82);
											local46 = this.aClass153_1.aShortArray65 = Static182.method2834(this.aShortArray75);
											local58 = this.aClass153_1.aShortArray63 = Static182.method2834(this.aShortArray76);
											local50 = this.aClass153_1.aByteArray56 = Static70.method1386(this.aByteArray76);
										}
										if (local87 == null) {
											@Pc(356) Class153 local356 = local8.aClass153_1 = new Class153();
											local87 = local356.aShortArray64 = Static182.method2834(local30);
											local79 = local356.aShortArray65 = Static182.method2834(local33);
											local75 = local356.aShortArray63 = Static182.method2834(local36);
											local83 = local356.aByteArray56 = Static70.method1386(local39);
										}
										@Pc(389) short local389 = this.aShortArray82[local197];
										@Pc(394) short local394 = this.aShortArray75[local197];
										@Pc(399) short local399 = this.aShortArray76[local197];
										@Pc(404) byte local404 = this.aByteArray76[local197];
										local209 = local100[local243 + 1];
										local202 = local100[local243];
										@Pc(424) int local424;
										for (@Pc(416) int local416 = local202; local416 < local209; local416++) {
											local424 = local103[local416] - 1;
											if (local424 == -1) {
												break;
											}
											if (local83[local424] != 0) {
												local87[local424] += local389;
												local79[local424] += local394;
												local75[local424] += local399;
												local83[local424] += local404;
											}
										}
										local389 = local30[local276];
										local202 = this.anIntArray508[local129];
										local404 = local39[local276];
										local209 = this.anIntArray508[local129 + 1];
										local399 = local36[local276];
										local394 = local33[local276];
										for (local424 = local202; local424 < local209; local424++) {
											@Pc(509) int local509 = this.aShortArray84[local424] - 1;
											if (local509 == -1) {
												break;
											}
											if (local50[local509] != 0) {
												local54[local509] += local389;
												local46[local509] += local394;
												local58[local509] += local399;
												local50[local509] += local404;
											}
										}
										if (this.aClass195_8 == null && this.aClass195_11 != null) {
											this.aClass195_11.anInterface5_5 = null;
										}
										if (this.aClass195_8 != null) {
											this.aClass195_8.anInterface5_5 = null;
										}
										if (local8.aClass195_8 == null && local8.aClass195_11 != null) {
											local8.aClass195_11.anInterface5_5 = null;
										}
										if (local8.aClass195_8 != null) {
											local8.aClass195_8.anInterface5_5 = null;
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

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIZIII)Z")
	private boolean method4915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > arg2 && arg2 < arg7 && arg2 < arg4) {
			return false;
		} else if (arg6 < arg2 && arg7 < arg2 && arg4 < arg2) {
			return false;
		} else if (arg3 < arg5 && arg3 < arg1 && arg3 < arg0) {
			return false;
		} else {
			return arg3 <= arg5 || arg1 >= arg3 || arg3 <= arg0;
		}
	}

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "(I)V")
	@Override
	public void method4907(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub1_Sub18.anIntArray642[arg0];
		@Pc(13) int local13 = Class6_Sub1_Sub18.anIntArray643[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5812; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray510[local15] + local13 * this.anIntArray512[local15] >> 15;
			this.anIntArray510[local15] = local13 * this.anIntArray510[local15] - local9 * this.anIntArray512[local15] >> 15;
			this.anIntArray512[local15] = local34;
		}
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface5_5 = null;
		}
		this.aBoolean386 = false;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	@Override
	public void method4862(@OriginalArg(0) int arg0) {
		this.aShort88 = (short) arg0;
		if (this.aClass195_11 != null) {
			this.aClass195_11.anInterface5_5 = null;
		}
		if (this.aClass195_8 != null) {
			this.aClass195_8.anInterface5_5 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "()I")
	@Override
	public int method4868() {
		if (!this.aBoolean386) {
			this.method4913();
		}
		return this.aShort91;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ql;Lclient!ni;II)V")
	@Override
	public void method4864(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class48_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5810 == 0) {
			return;
		}
		@Pc(13) Class132_Sub2 local13 = this.aClass28_Sub1_33.aClass132_Sub2_3;
		if (!this.aBoolean386) {
			this.method4913();
		}
		@Pc(22) Class132_Sub2 local22 = (Class132_Sub2) arg0;
		Static278.aFloat85 = local13.aFloat75 * local22.aFloat76 + local22.aFloat72 * local13.aFloat79 + local13.aFloat73 * local22.aFloat71 + local13.aFloat71;
		Static195.aFloat63 = local22.aFloat80 * local13.aFloat75 + local22.aFloat74 * local13.aFloat79 + local13.aFloat73 * local22.aFloat75;
		@Pc(69) float local69 = Static195.aFloat63 * (float) this.aShort90 + Static278.aFloat85;
		@Pc(77) float local77 = Static278.aFloat85 + Static195.aFloat63 * (float) this.aShort92;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local69 > local77) {
			local88 = local77 - (float) this.aShort91;
			local94 = (float) this.aShort91 + local69;
		} else {
			local88 = (float) -this.aShort91 + local69;
			local94 = (float) this.aShort91 + local77;
		}
		if (local88 >= this.aClass28_Sub1_33.aFloat27 || local94 <= (float) this.aClass28_Sub1_33.anInt773) {
			return;
		}
		Static174.aFloat51 = local22.aFloat75 * local13.aFloat81 + local13.aFloat74 * local22.aFloat80 + local13.aFloat82 * local22.aFloat74;
		Static348.aFloat92 = local13.aFloat81 * local22.aFloat71 + local13.aFloat74 * local22.aFloat76 + local22.aFloat72 * local13.aFloat82 + local13.aFloat72;
		@Pc(170) float local170 = Static174.aFloat51 * (float) this.aShort90 + Static348.aFloat92;
		@Pc(178) float local178 = (float) this.aShort92 * Static174.aFloat51 + Static348.aFloat92;
		@Pc(205) float local205;
		@Pc(193) float local193;
		if (local170 > local178) {
			local193 = (float) this.aClass28_Sub1_33.anInt782 * (local170 + (float) this.aShort91);
			local205 = ((float) -this.aShort91 + local178) * (float) this.aClass28_Sub1_33.anInt782;
		} else {
			local193 = (float) this.aClass28_Sub1_33.anInt782 * (local178 + (float) this.aShort91);
			local205 = (float) this.aClass28_Sub1_33.anInt782 * ((float) -this.aShort91 + local170);
		}
		if (this.aClass28_Sub1_33.aFloat11 <= local205 / (float) arg2 || local193 / (float) arg2 <= this.aClass28_Sub1_33.aFloat21) {
			return;
		}
		Static162.aFloat50 = local22.aFloat76 * local13.aFloat80 + local13.aFloat77 * local22.aFloat72 + local22.aFloat71 * local13.aFloat78 + local13.aFloat76;
		Static278.aFloat86 = local13.aFloat78 * local22.aFloat75 + local13.aFloat77 * local22.aFloat74 + local22.aFloat80 * local13.aFloat80;
		@Pc(297) float local297 = Static162.aFloat50 + Static278.aFloat86 * (float) this.aShort90;
		@Pc(305) float local305 = Static162.aFloat50 + Static278.aFloat86 * (float) this.aShort92;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local297 > local305) {
			local321 = ((float) -this.aShort91 + local305) * (float) this.aClass28_Sub1_33.anInt752;
			local332 = ((float) this.aShort91 + local297) * (float) this.aClass28_Sub1_33.anInt752;
		} else {
			local321 = (float) this.aClass28_Sub1_33.anInt752 * (local297 - (float) this.aShort91);
			local332 = ((float) this.aShort91 + local305) * (float) this.aClass28_Sub1_33.anInt752;
		}
		if (this.aClass28_Sub1_33.aFloat14 <= local321 / (float) arg2 || this.aClass28_Sub1_33.aFloat25 >= local332 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass178Array1 != null) {
			Static286.aFloat87 = local22.aFloat78 * local13.aFloat75 + local13.aFloat79 * local22.aFloat81 + local13.aFloat73 * local22.aFloat73;
			Static188.aFloat59 = local13.aFloat81 * local22.aFloat73 + local13.aFloat82 * local22.aFloat81 + local13.aFloat74 * local22.aFloat78;
			Static198.aFloat65 = local13.aFloat78 * local22.aFloat73 + local22.aFloat78 * local13.aFloat80 + local22.aFloat81 * local13.aFloat77;
			Static400.aFloat101 = local13.aFloat78 * local22.aFloat79 + local13.aFloat80 * local22.aFloat77 + local22.aFloat82 * local13.aFloat77;
			Static4.aFloat1 = local22.aFloat77 * local13.aFloat75 + local22.aFloat82 * local13.aFloat79 + local13.aFloat73 * local22.aFloat79;
			Static26.aFloat48 = local13.aFloat74 * local22.aFloat77 + local13.aFloat82 * local22.aFloat82 + local13.aFloat81 * local22.aFloat79;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.aShort85 + this.aShort87 >> 1;
			@Pc(508) int local508 = this.aShort89 + this.aShort84 >> 1;
			@Pc(527) int local527 = (int) (Static188.aFloat59 * (float) local508 + Static348.aFloat92 + (float) local499 * Static26.aFloat48 + Static174.aFloat51 * (float) this.aShort90);
			@Pc(546) int local546 = (int) (Static198.aFloat65 * (float) local508 + Static400.aFloat101 * (float) local499 + Static162.aFloat50 + (float) this.aShort90 * Static278.aFloat86);
			@Pc(565) int local565 = (int) ((float) local508 * Static286.aFloat87 + Static278.aFloat85 + Static4.aFloat1 * (float) local499 + Static195.aFloat63 * (float) this.aShort90);
			@Pc(584) int local584 = (int) ((float) local508 * Static188.aFloat59 + Static348.aFloat92 + Static26.aFloat48 * (float) local499 + (float) this.aShort92 * Static174.aFloat51);
			@Pc(603) int local603 = (int) ((float) local508 * Static198.aFloat65 + Static278.aFloat86 * (float) this.aShort92 + Static400.aFloat101 * (float) local499 + Static162.aFloat50);
			@Pc(622) int local622 = (int) (Static278.aFloat85 + (float) local499 * Static4.aFloat1 + Static195.aFloat63 * (float) this.aShort92 + (float) local508 * Static286.aFloat87);
			arg1.anInt4591 = this.aClass28_Sub1_33.anInt757 + this.aClass28_Sub1_33.anInt752 * local546 / arg2;
			arg1.anInt4590 = local527 * this.aClass28_Sub1_33.anInt782 / arg2 + this.aClass28_Sub1_33.anInt781;
			arg1.anInt4589 = this.aClass28_Sub1_33.anInt781 + this.aClass28_Sub1_33.anInt782 * local584 / arg2;
			arg1.anInt4587 = this.aClass28_Sub1_33.anInt757 + this.aClass28_Sub1_33.anInt752 * local603 / arg2;
			if (local565 < this.aClass28_Sub1_33.anInt773 && local622 < this.aClass28_Sub1_33.anInt773) {
				arg1.anInt4588 = this.aClass28_Sub1_33.anInt781 + (this.aShort91 + local527) * this.aClass28_Sub1_33.anInt782 / arg2 - arg1.anInt4590;
				arg1.aBoolean329 = true;
			}
		}
		this.aClass28_Sub1_33.method696((float) arg2);
		this.aClass28_Sub1_33.method690();
		this.aClass28_Sub1_33.method702(local22);
		this.method4919();
		this.aClass28_Sub1_33.method713();
		this.method4921();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method4908(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local24 = 0;
			Static403.anInt6659 = 0;
			Static329.anInt5569 = 0;
			Static91.anInt1680 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray53.length > local38) {
					local48 = this.anIntArrayArray53[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.lb == null || (arg6 & this.lb[local56]) != 0) {
							Static403.anInt6659 += this.anIntArray512[local56];
							Static91.anInt1680 += this.anIntArray511[local56];
							local24++;
							Static329.anInt5569 += this.anIntArray510[local56];
						}
					}
				}
			}
			if (local24 <= 0) {
				Static91.anInt1680 = arg3;
				Static403.anInt6659 = arg2;
				Static329.anInt5569 = arg4;
			} else {
				Static238.aBoolean267 = true;
				Static91.anInt1680 = Static91.anInt1680 / local24 + arg3;
				Static403.anInt6659 = arg2 + Static403.anInt6659 / local24;
				Static329.anInt5569 = arg4 + Static329.anInt5569 / local24;
			}
			return;
		}
		@Pc(244) int[] local244;
		@Pc(246) int local246;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg7[2] * arg4 + arg3 * arg7[1] + arg2 * arg7[0] + 16384 >> 15;
				local32 = arg3 * arg7[4] + arg2 * arg7[3] + arg7[5] * arg4 + 16384 >> 15;
				local38 = arg2 * arg7[6] + arg7[7] * arg3 + arg4 * arg7[8] + 16384 >> 15;
				arg4 = local38;
				arg3 = local32;
				arg2 = local24;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray53.length) {
					local244 = this.anIntArrayArray53[local32];
					for (local246 = 0; local246 < local244.length; local246++) {
						local50 = local244[local246];
						if (this.lb == null || (this.lb[local50] & arg6) != 0) {
							this.anIntArray512[local50] += arg2;
							this.anIntArray511[local50] += arg3;
							this.anIntArray510[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(383) int local383;
		@Pc(401) int local401;
		@Pc(636) int local636;
		@Pc(645) int local645;
		@Pc(655) int local655;
		@Pc(659) int local659;
		@Pc(677) int local677;
		@Pc(1024) int local1024;
		@Pc(1032) int local1032;
		@Pc(1186) int local1186;
		@Pc(1212) int local1212;
		@Pc(1216) int local1216;
		@Pc(1225) int local1225;
		@Pc(1230) int local1230;
		@Pc(1234) int local1234;
		@Pc(1238) int local1238;
		@Pc(1240) int local1240;
		@Pc(1372) int[] local1372;
		@Pc(1374) int local1374;
		@Pc(1378) int local1378;
		@Pc(1382) int local1382;
		@Pc(1384) int local1384;
		@Pc(1515) int local1515;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray53.length) {
						local244 = this.anIntArrayArray53[local32];
						for (local246 = 0; local246 < local244.length; local246++) {
							local50 = local244[local246];
							if (this.lb == null || (this.lb[local50] & arg6) != 0) {
								this.anIntArray512[local50] -= Static403.anInt6659;
								this.anIntArray511[local50] -= Static91.anInt1680;
								this.anIntArray510[local50] -= Static329.anInt5569;
								if (arg4 != 0) {
									local56 = Class6_Sub1_Sub18.anIntArray642[arg4];
									local383 = Class6_Sub1_Sub18.anIntArray643[arg4];
									local401 = this.anIntArray512[local50] * local383 + local56 * this.anIntArray511[local50] + 32767 >> 15;
									this.anIntArray511[local50] = this.anIntArray511[local50] * local383 + 32767 - local56 * this.anIntArray512[local50] >> 15;
									this.anIntArray512[local50] = local401;
								}
								if (arg2 != 0) {
									local56 = Class6_Sub1_Sub18.anIntArray642[arg2];
									local383 = Class6_Sub1_Sub18.anIntArray643[arg2];
									local401 = this.anIntArray511[local50] * local383 + 32767 - local56 * this.anIntArray510[local50] >> 15;
									this.anIntArray510[local50] = this.anIntArray510[local50] * local383 + local56 * this.anIntArray511[local50] + 32767 >> 15;
									this.anIntArray511[local50] = local401;
								}
								if (arg3 != 0) {
									local56 = Class6_Sub1_Sub18.anIntArray642[arg3];
									local383 = Class6_Sub1_Sub18.anIntArray643[arg3];
									local401 = this.anIntArray512[local50] * local383 + this.anIntArray510[local50] * local56 + 32767 >> 15;
									this.anIntArray510[local50] = local383 * this.anIntArray510[local50] + 32767 - local56 * this.anIntArray512[local50] >> 15;
									this.anIntArray512[local50] = local401;
								}
								this.anIntArray512[local50] += Static403.anInt6659;
								this.anIntArray511[local50] += Static91.anInt1680;
								this.anIntArray510[local50] += Static329.anInt5569;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray53.length) {
							local48 = this.anIntArrayArray53[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.lb == null || (arg6 & this.lb[local56]) != 0) {
									local383 = this.anIntArray508[local56];
									local401 = this.anIntArray508[local56 + 1];
									for (local636 = local383; local636 < local401; local636++) {
										local645 = this.aShortArray84[local636] - 1;
										if (local645 == -1) {
											break;
										}
										if (arg4 != 0) {
											local655 = Class6_Sub1_Sub18.anIntArray642[arg4];
											local659 = Class6_Sub1_Sub18.anIntArray643[arg4];
											local677 = local655 * this.aShortArray75[local645] + local659 * this.aShortArray82[local645] + 32767 >> 15;
											this.aShortArray75[local645] = (short) (local659 * this.aShortArray75[local645] + 32767 - local655 * this.aShortArray82[local645] >> 15);
											this.aShortArray82[local645] = (short) local677;
										}
										if (arg2 != 0) {
											local655 = Class6_Sub1_Sub18.anIntArray642[arg2];
											local659 = Class6_Sub1_Sub18.anIntArray643[arg2];
											local677 = local659 * this.aShortArray75[local645] + 32767 - local655 * this.aShortArray76[local645] >> 15;
											this.aShortArray76[local645] = (short) (local655 * this.aShortArray75[local645] + local659 * this.aShortArray76[local645] + 32767 >> 15);
											this.aShortArray75[local645] = (short) local677;
										}
										if (arg3 != 0) {
											local655 = Class6_Sub1_Sub18.anIntArray642[arg3];
											local659 = Class6_Sub1_Sub18.anIntArray643[arg3];
											local677 = this.aShortArray76[local645] * local655 + this.aShortArray82[local645] * local659 + 32767 >> 15;
											this.aShortArray76[local645] = (short) (this.aShortArray76[local645] * local659 + 32767 - local655 * this.aShortArray82[local645] >> 15);
											this.aShortArray82[local645] = (short) local677;
										}
									}
								}
							}
						}
					}
					if (this.aClass195_8 == null && this.aClass195_11 != null) {
						this.aClass195_11.anInterface5_5 = null;
					}
					if (this.aClass195_8 != null) {
						this.aClass195_8.anInterface5_5 = null;
						return;
					}
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local246 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static238.aBoolean267) {
					local383 = Static403.anInt6659 * arg7[0] + Static91.anInt1680 * arg7[3] + Static329.anInt5569 * arg7[6] + 16384 >> 15;
					local401 = arg7[7] * Static329.anInt5569 + arg7[1] * Static403.anInt6659 + Static91.anInt1680 * arg7[4] + 16384 >> 15;
					local401 += local50;
					local636 = Static329.anInt5569 * arg7[8] + Static403.anInt6659 * arg7[2] + arg7[5] * Static91.anInt1680 + 16384 >> 15;
					local383 += local246;
					local636 += local56;
					Static91.anInt1680 = local401;
					Static403.anInt6659 = local383;
					Static329.anInt5569 = local636;
					Static238.aBoolean267 = false;
				}
				@Pc(992) int[] local992 = new int[9];
				local401 = Class6_Sub1_Sub18.anIntArray643[arg2];
				local636 = Class6_Sub1_Sub18.anIntArray642[arg2];
				local645 = Class6_Sub1_Sub18.anIntArray643[arg3];
				local655 = Class6_Sub1_Sub18.anIntArray642[arg3];
				local659 = Class6_Sub1_Sub18.anIntArray643[arg4];
				local677 = Class6_Sub1_Sub18.anIntArray642[arg4];
				local1024 = local659 * local636 + 16384 >> 15;
				local1032 = local636 * local677 + 16384 >> 15;
				local992[3] = local401 * local677 + 16384 >> 15;
				local992[1] = local677 * -local645 + local655 * local1024 + 16384 >> 15;
				local992[4] = local401 * local659 + 16384 >> 15;
				local992[2] = local401 * local655 + 16384 >> 15;
				local992[0] = local655 * local1032 + local659 * local645 + 16384 >> 15;
				local992[5] = -local636;
				local992[7] = local1024 * local645 + local677 * local655 + 16384 >> 15;
				local992[6] = local645 * local1032 + local659 * -local655 + 16384 >> 15;
				local992[8] = local645 * local401 + 16384 >> 15;
				@Pc(1160) int local1160 = -Static329.anInt5569 * local992[2] + -Static91.anInt1680 * local992[1] + -Static403.anInt6659 * local992[0] + 16384 >> 15;
				local1186 = local992[4] * -Static91.anInt1680 + local992[3] * -Static403.anInt6659 + local992[5] * -Static329.anInt5569 + 16384 >> 15;
				local1212 = -Static329.anInt5569 * local992[8] + local992[6] * -Static403.anInt6659 + -Static91.anInt1680 * local992[7] + 16384 >> 15;
				local1216 = Static403.anInt6659 + local1160;
				@Pc(1220) int local1220 = local1186 + Static91.anInt1680;
				local1225 = local1212 + Static329.anInt5569;
				@Pc(1228) int[] local1228 = new int[9];
				for (local1230 = 0; local1230 < 3; local1230++) {
					for (local1234 = 0; local1234 < 3; local1234++) {
						local1238 = 0;
						for (local1240 = 0; local1240 < 3; local1240++) {
							local1238 += arg7[local1234 * 3 + local1240] * local992[local1230 * 3 + local1240];
						}
						local1228[local1230 * 3 + local1234] = local1238 + 16384 >> 15;
					}
				}
				local1234 = local992[1] * local50 + local246 * local992[0] + local56 * local992[2] + 16384 >> 15;
				local1238 = local992[5] * local56 + local246 * local992[3] + local50 * local992[4] + 16384 >> 15;
				local1238 += local1220;
				local1240 = local246 * local992[6] + local992[7] * local50 + local56 * local992[8] + 16384 >> 15;
				local1234 += local1216;
				local1240 += local1225;
				local1372 = new int[9];
				for (local1374 = 0; local1374 < 3; local1374++) {
					for (local1378 = 0; local1378 < 3; local1378++) {
						local1382 = 0;
						for (local1384 = 0; local1384 < 3; local1384++) {
							local1382 += local1228[local1378 + local1384 * 3] * arg7[local1384 + local1374 * 3];
						}
						local1372[local1378 + local1374 * 3] = local1382 + 16384 >> 15;
					}
				}
				local1378 = local1240 * arg7[2] + local1234 * arg7[0] + local1238 * arg7[1] + 16384 >> 15;
				local1382 = local1238 * arg7[4] + arg7[3] * local1234 + arg7[5] * local1240 + 16384 >> 15;
				local1378 += local24;
				local1384 = local1240 * arg7[8] + local1234 * arg7[6] + local1238 * arg7[7] + 16384 >> 15;
				local1382 += local32;
				local1384 += local38;
				for (local1515 = 0; local1515 < local8; local1515++) {
					@Pc(1521) int local1521 = arg1[local1515];
					if (this.anIntArrayArray53.length > local1521) {
						@Pc(1535) int[] local1535 = this.anIntArrayArray53[local1521];
						for (@Pc(1537) int local1537 = 0; local1537 < local1535.length; local1537++) {
							@Pc(1543) int local1543 = local1535[local1537];
							if (this.lb == null || (this.lb[local1543] & arg6) != 0) {
								@Pc(1584) int local1584 = local1372[2] * this.anIntArray510[local1543] + local1372[1] * this.anIntArray511[local1543] + local1372[0] * this.anIntArray512[local1543] + 16384 >> 15;
								@Pc(1617) int local1617 = local1372[3] * this.anIntArray512[local1543] + this.anIntArray511[local1543] * local1372[4] + local1372[5] * this.anIntArray510[local1543] + 16384 >> 15;
								@Pc(1650) int local1650 = local1372[6] * this.anIntArray512[local1543] + this.anIntArray511[local1543] * local1372[7] + local1372[8] * this.anIntArray510[local1543] + 16384 >> 15;
								@Pc(1654) int local1654 = local1584 + local1378;
								@Pc(1658) int local1658 = local1617 + local1382;
								this.anIntArray512[local1543] = local1654;
								@Pc(1667) int local1667 = local1650 + local1384;
								this.anIntArray511[local1543] = local1658;
								this.anIntArray510[local1543] = local1667;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2588) Class178 local2588;
			@Pc(2593) Class75 local2593;
			if (arg0 == 5) {
				if (this.anIntArrayArray52 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray52.length) {
							local244 = this.anIntArrayArray52[local32];
							for (local246 = 0; local246 < local244.length; local246++) {
								local50 = local244[local246];
								if (this.aShortArray80 == null || (this.aShortArray80[local50] & arg6) != 0) {
									local56 = arg2 * 8 + (this.aByteArray75[local50] & 0xFF);
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray75[local50] = (byte) local56;
									if (this.aClass195_11 != null) {
										this.aClass195_11.anInterface5_5 = null;
									}
								}
							}
						}
					}
					if (this.aClass178Array1 != null) {
						for (local32 = 0; local32 < this.anInt5831; local32++) {
							local2588 = this.aClass178Array1[local32];
							local2593 = this.aClass75Array1[local32];
							local2593.anInt1830 = 255 - (this.aByteArray75[local2588.anInt4613] & 0xFF) << 24 | local2593.anInt1830 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2853) Class75 local2853;
				if (arg0 == 8) {
					if (this.anIntArrayArray51 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray51.length > local32) {
								local244 = this.anIntArrayArray51[local32];
								for (local246 = 0; local246 < local244.length; local246++) {
									local2853 = this.aClass75Array1[local244[local246]];
									local2853.anInt1829 += arg3;
									local2853.anInt1832 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray51 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray51.length > local32) {
								local244 = this.anIntArrayArray51[local32];
								for (local246 = 0; local246 < local244.length; local246++) {
									local2853 = this.aClass75Array1[local244[local246]];
									local2853.anInt1822 = local2853.anInt1822 * arg3 >> 7;
									local2853.anInt1824 = local2853.anInt1824 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray51 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray51.length) {
							local244 = this.anIntArrayArray51[local32];
							for (local246 = 0; local246 < local244.length; local246++) {
								local2853 = this.aClass75Array1[local244[local246]];
								local2853.anInt1828 = local2853.anInt1828 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray52 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray52.length) {
						local244 = this.anIntArrayArray52[local32];
						for (local246 = 0; local246 < local244.length; local246++) {
							local50 = local244[local246];
							if (this.aShortArray80 == null || (this.aShortArray80[local50] & arg6) != 0) {
								local56 = this.aShortArray78[local50] & 0xFFFF;
								local383 = local56 >> 10 & 0x3F;
								local401 = local56 >> 7 & 0x7;
								local636 = local56 & 0x7F;
								local401 += arg3 / 4;
								@Pc(2700) int local2700 = arg2 + local383 & 0x3F;
								local636 += arg4;
								if (local401 < 0) {
									local401 = 0;
								} else if (local401 > 7) {
									local401 = 7;
								}
								if (local636 < 0) {
									local636 = 0;
								} else if (local636 > 127) {
									local636 = 127;
								}
								this.aShortArray78[local50] = (short) (local636 | local2700 << 10 | local401 << 7);
								if (this.aClass195_11 != null) {
									this.aClass195_11.anInterface5_5 = null;
								}
							}
						}
					}
				}
				if (this.aClass178Array1 != null) {
					for (local32 = 0; local32 < this.anInt5831; local32++) {
						local2588 = this.aClass178Array1[local32];
						local2593 = this.aClass75Array1[local32];
						local2593.anInt1830 = local2593.anInt1830 & 0xFF000000 | Static245.anIntArray376[this.aShortArray78[local2588.anInt4613] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray53.length) {
					local244 = this.anIntArrayArray53[local32];
					for (local246 = 0; local246 < local244.length; local246++) {
						local50 = local244[local246];
						if (this.lb == null || (arg6 & this.lb[local50]) != 0) {
							this.anIntArray512[local50] -= Static403.anInt6659;
							this.anIntArray511[local50] -= Static91.anInt1680;
							this.anIntArray510[local50] -= Static329.anInt5569;
							this.anIntArray512[local50] = arg2 * this.anIntArray512[local50] >> 7;
							this.anIntArray511[local50] = this.anIntArray511[local50] * arg3 >> 7;
							this.anIntArray510[local50] = this.anIntArray510[local50] * arg4 >> 7;
							this.anIntArray512[local50] += Static403.anInt6659;
							this.anIntArray511[local50] += Static91.anInt1680;
							this.anIntArray510[local50] += Static329.anInt5569;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local246 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static238.aBoolean267) {
				local383 = arg7[0] * Static403.anInt6659 + arg7[3] * Static91.anInt1680 + arg7[6] * Static329.anInt5569 + 16384 >> 15;
				local401 = arg7[4] * Static91.anInt1680 + Static403.anInt6659 * arg7[1] + arg7[7] * Static329.anInt5569 + 16384 >> 15;
				local636 = Static329.anInt5569 * arg7[8] + arg7[2] * Static403.anInt6659 + Static91.anInt1680 * arg7[5] + 16384 >> 15;
				local383 += local246;
				local401 += local50;
				Static91.anInt1680 = local401;
				local636 += local56;
				Static403.anInt6659 = local383;
				Static238.aBoolean267 = false;
				Static329.anInt5569 = local636;
			}
			local383 = arg2 << 15 >> 7;
			local401 = arg3 << 15 >> 7;
			local636 = arg4 << 15 >> 7;
			local645 = -Static403.anInt6659 * local383 + 16384 >> 15;
			local655 = local401 * -Static91.anInt1680 + 16384 >> 15;
			local659 = -Static329.anInt5569 * local636 + 16384 >> 15;
			local677 = Static403.anInt6659 + local645;
			local1024 = local655 + Static91.anInt1680;
			local1032 = local659 + Static329.anInt5569;
			@Pc(1881) int[] local1881 = new int[] { arg7[0] * local383 + 16384 >> 15, arg7[3] * local383 + 16384 >> 15, local383 * arg7[6] + 16384 >> 15, local401 * arg7[1] + 16384 >> 15, arg7[4] * local401 + 16384 >> 15, arg7[7] * local401 + 16384 >> 15, arg7[2] * local636 + 16384 >> 15, arg7[5] * local636 + 16384 >> 15, arg7[8] * local636 + 16384 >> 15 };
			local1186 = local246 * local383 + 16384 >> 15;
			local1212 = local50 * local401 + 16384 >> 15;
			@Pc(2009) int local2009 = local1212 + local1024;
			@Pc(2013) int local2013 = local1186 + local677;
			local1216 = local636 * local56 + 16384 >> 15;
			@Pc(2025) int local2025 = local1216 + local1032;
			@Pc(2028) int[] local2028 = new int[9];
			@Pc(2034) int local2034;
			for (local1225 = 0; local1225 < 3; local1225++) {
				for (local2034 = 0; local2034 < 3; local2034++) {
					local1230 = 0;
					for (local1234 = 0; local1234 < 3; local1234++) {
						local1230 += local1881[local2034 + local1234 * 3] * arg7[local1225 * 3 + local1234];
					}
					local2028[local2034 + local1225 * 3] = local1230 + 16384 >> 15;
				}
			}
			local2034 = local2009 * arg7[1] + arg7[0] * local2013 + local2025 * arg7[2] + 16384 >> 15;
			local1230 = local2025 * arg7[5] + arg7[4] * local2009 + local2013 * arg7[3] + 16384 >> 15;
			local1234 = arg7[6] * local2013 + arg7[7] * local2009 + arg7[8] * local2025 + 16384 >> 15;
			local2034 += local24;
			local1230 += local32;
			local1234 += local38;
			for (local1238 = 0; local1238 < local8; local1238++) {
				local1240 = arg1[local1238];
				if (this.anIntArrayArray53.length > local1240) {
					local1372 = this.anIntArrayArray53[local1240];
					for (local1374 = 0; local1374 < local1372.length; local1374++) {
						local1378 = local1372[local1374];
						if (this.lb == null || (arg6 & this.lb[local1378]) != 0) {
							local1382 = local2028[1] * this.anIntArray511[local1378] + this.anIntArray512[local1378] * local2028[0] + local2028[2] * this.anIntArray510[local1378] + 16384 >> 15;
							local1384 = local2028[5] * this.anIntArray510[local1378] + local2028[3] * this.anIntArray512[local1378] + this.anIntArray511[local1378] * local2028[4] + 16384 >> 15;
							@Pc(2274) int local2274 = local1384 + local1230;
							local1515 = this.anIntArray511[local1378] * local2028[7] + local2028[6] * this.anIntArray512[local1378] + this.anIntArray510[local1378] * local2028[8] + 16384 >> 15;
							@Pc(2309) int local2309 = local1382 + local2034;
							@Pc(2313) int local2313 = local1515 + local1234;
							this.anIntArray512[local1378] = local2309;
							this.anIntArray511[local1378] = local2274;
							this.anIntArray510[local1378] = local2313;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method4889(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			Static403.anInt6659 = 0;
			local29 = 0;
			Static329.anInt5569 = 0;
			Static91.anInt1680 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray53.length > local41) {
					local51 = this.anIntArrayArray53[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static403.anInt6659 += this.anIntArray512[local59];
						Static91.anInt1680 += this.anIntArray511[local59];
						local29++;
						Static329.anInt5569 += this.anIntArray510[local59];
					}
				}
			}
			if (local29 > 0) {
				Static329.anInt5569 = Static329.anInt5569 / local29 + local21;
				Static91.anInt1680 = Static91.anInt1680 / local29 + local25;
				Static403.anInt6659 = local17 + Static403.anInt6659 / local29;
			} else {
				Static91.anInt1680 = local25;
				Static329.anInt5569 = local21;
				Static403.anInt6659 = local17;
			}
			return;
		}
		@Pc(169) int[] local169;
		@Pc(171) int local171;
		if (arg0 == 1) {
			local25 = arg3 << 4;
			local21 = arg4 << 4;
			local17 = arg2 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray53.length > local35) {
					local169 = this.anIntArrayArray53[local35];
					for (local171 = 0; local171 < local169.length; local171++) {
						local53 = local169[local171];
						this.anIntArray512[local53] += local17;
						this.anIntArray511[local53] += local25;
						this.anIntArray510[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(293) int local293;
		@Pc(311) int local311;
		@Pc(771) int local771;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray53.length > local35) {
					local169 = this.anIntArrayArray53[local35];
					if ((arg5 & 0x1) == 0) {
						for (local171 = 0; local171 < local169.length; local171++) {
							local53 = local169[local171];
							this.anIntArray512[local53] -= Static403.anInt6659;
							this.anIntArray511[local53] -= Static91.anInt1680;
							this.anIntArray510[local53] -= Static329.anInt5569;
							if (arg4 != 0) {
								local59 = Class6_Sub1_Sub18.anIntArray642[arg4];
								local293 = Class6_Sub1_Sub18.anIntArray643[arg4];
								local311 = local293 * this.anIntArray512[local53] + local59 * this.anIntArray511[local53] + 32767 >> 15;
								this.anIntArray511[local53] = this.anIntArray511[local53] * local293 + 32767 - this.anIntArray512[local53] * local59 >> 15;
								this.anIntArray512[local53] = local311;
							}
							if (arg2 != 0) {
								local59 = Class6_Sub1_Sub18.anIntArray642[arg2];
								local293 = Class6_Sub1_Sub18.anIntArray643[arg2];
								local311 = this.anIntArray511[local53] * local293 + 32767 - local59 * this.anIntArray510[local53] >> 15;
								this.anIntArray510[local53] = local293 * this.anIntArray510[local53] + local59 * this.anIntArray511[local53] + 32767 >> 15;
								this.anIntArray511[local53] = local311;
							}
							if (arg3 != 0) {
								local59 = Class6_Sub1_Sub18.anIntArray642[arg3];
								local293 = Class6_Sub1_Sub18.anIntArray643[arg3];
								local311 = this.anIntArray510[local53] * local59 + local293 * this.anIntArray512[local53] + 32767 >> 15;
								this.anIntArray510[local53] = local293 * this.anIntArray510[local53] + 32767 - local59 * this.anIntArray512[local53] >> 15;
								this.anIntArray512[local53] = local311;
							}
							this.anIntArray512[local53] += Static403.anInt6659;
							this.anIntArray511[local53] += Static91.anInt1680;
							this.anIntArray510[local53] += Static329.anInt5569;
						}
					} else {
						for (local171 = 0; local171 < local169.length; local171++) {
							local53 = local169[local171];
							this.anIntArray512[local53] -= Static403.anInt6659;
							this.anIntArray511[local53] -= Static91.anInt1680;
							this.anIntArray510[local53] -= Static329.anInt5569;
							if (arg2 != 0) {
								local59 = Class6_Sub1_Sub18.anIntArray642[arg2];
								local293 = Class6_Sub1_Sub18.anIntArray643[arg2];
								local311 = this.anIntArray511[local53] * local293 + 32767 - local59 * this.anIntArray510[local53] >> 15;
								this.anIntArray510[local53] = local293 * this.anIntArray510[local53] + local59 * this.anIntArray511[local53] + 32767 >> 15;
								this.anIntArray511[local53] = local311;
							}
							if (arg4 != 0) {
								local59 = Class6_Sub1_Sub18.anIntArray642[arg4];
								local293 = Class6_Sub1_Sub18.anIntArray643[arg4];
								local311 = local59 * this.anIntArray511[local53] + this.anIntArray512[local53] * local293 + 32767 >> 15;
								this.anIntArray511[local53] = this.anIntArray511[local53] * local293 + 32767 - this.anIntArray512[local53] * local59 >> 15;
								this.anIntArray512[local53] = local311;
							}
							if (arg3 != 0) {
								local59 = Class6_Sub1_Sub18.anIntArray642[arg3];
								local293 = Class6_Sub1_Sub18.anIntArray643[arg3];
								local311 = this.anIntArray512[local53] * local293 + this.anIntArray510[local53] * local59 + 32767 >> 15;
								this.anIntArray510[local53] = local293 * this.anIntArray510[local53] + 32767 - local59 * this.anIntArray512[local53] >> 15;
								this.anIntArray512[local53] = local311;
							}
							this.anIntArray512[local53] += Static403.anInt6659;
							this.anIntArray511[local53] += Static91.anInt1680;
							this.anIntArray510[local53] += Static329.anInt5569;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray53.length) {
						local51 = this.anIntArrayArray53[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local293 = this.anIntArray508[local59];
							local311 = this.anIntArray508[local59 + 1];
							for (local771 = local293; local771 < local311; local771++) {
								@Pc(780) int local780 = this.aShortArray84[local771] - 1;
								if (local780 == -1) {
									break;
								}
								@Pc(790) int local790;
								@Pc(794) int local794;
								@Pc(813) int local813;
								if (arg4 != 0) {
									local790 = Class6_Sub1_Sub18.anIntArray642[arg4];
									local794 = Class6_Sub1_Sub18.anIntArray643[arg4];
									local813 = this.aShortArray75[local780] * local790 + this.aShortArray82[local780] * local794 + 32767 >> 15;
									this.aShortArray75[local780] = (short) (this.aShortArray75[local780] * local794 + 32767 - this.aShortArray82[local780] * local790 >> 15);
									this.aShortArray82[local780] = (short) local813;
								}
								if (arg2 != 0) {
									local790 = Class6_Sub1_Sub18.anIntArray642[arg2];
									local794 = Class6_Sub1_Sub18.anIntArray643[arg2];
									local813 = local794 * this.aShortArray75[local780] + 32767 - local790 * this.aShortArray76[local780] >> 15;
									this.aShortArray76[local780] = (short) (local790 * this.aShortArray75[local780] + local794 * this.aShortArray76[local780] + 32767 >> 15);
									this.aShortArray75[local780] = (short) local813;
								}
								if (arg3 != 0) {
									local790 = Class6_Sub1_Sub18.anIntArray642[arg3];
									local794 = Class6_Sub1_Sub18.anIntArray643[arg3];
									local813 = this.aShortArray82[local780] * local794 + local790 * this.aShortArray76[local780] + 32767 >> 15;
									this.aShortArray76[local780] = (short) (this.aShortArray76[local780] * local794 + 32767 - this.aShortArray82[local780] * local790 >> 15);
									this.aShortArray82[local780] = (short) local813;
								}
							}
						}
					}
				}
				if (this.aClass195_8 == null && this.aClass195_11 != null) {
					this.aClass195_11.anInterface5_5 = null;
				}
				if (this.aClass195_8 != null) {
					this.aClass195_8.anInterface5_5 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray53.length > local35) {
					local169 = this.anIntArrayArray53[local35];
					for (local171 = 0; local171 < local169.length; local171++) {
						local53 = local169[local171];
						this.anIntArray512[local53] -= Static403.anInt6659;
						this.anIntArray511[local53] -= Static91.anInt1680;
						this.anIntArray510[local53] -= Static329.anInt5569;
						this.anIntArray512[local53] = arg2 * this.anIntArray512[local53] >> 7;
						this.anIntArray511[local53] = this.anIntArray511[local53] * arg3 >> 7;
						this.anIntArray510[local53] = this.anIntArray510[local53] * arg4 >> 7;
						this.anIntArray512[local53] += Static403.anInt6659;
						this.anIntArray511[local53] += Static91.anInt1680;
						this.anIntArray510[local53] += Static329.anInt5569;
					}
				}
			}
		} else {
			@Pc(1234) Class178 local1234;
			@Pc(1239) Class75 local1239;
			if (arg0 == 5) {
				if (this.anIntArrayArray52 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray52.length > local35) {
							local169 = this.anIntArrayArray52[local35];
							for (local171 = 0; local171 < local169.length; local171++) {
								local53 = local169[local171];
								local59 = arg2 * 8 + (this.aByteArray75[local53] & 0xFF);
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray75[local53] = (byte) local59;
							}
							if (local169.length > 0 && this.aClass195_11 != null) {
								this.aClass195_11.anInterface5_5 = null;
							}
						}
					}
					if (this.aClass178Array1 != null) {
						for (local35 = 0; local35 < this.anInt5831; local35++) {
							local1234 = this.aClass178Array1[local35];
							local1239 = this.aClass75Array1[local35];
							local1239.anInt1830 = local1239.anInt1830 & 0xFFFFFF | 255 - (this.aByteArray75[local1234.anInt4613] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1494) Class75 local1494;
				if (arg0 == 8) {
					if (this.anIntArrayArray51 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray51.length) {
								local169 = this.anIntArrayArray51[local35];
								for (local171 = 0; local171 < local169.length; local171++) {
									local1494 = this.aClass75Array1[local169[local171]];
									local1494.anInt1829 += arg3;
									local1494.anInt1832 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray51 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray51.length) {
								local169 = this.anIntArrayArray51[local35];
								for (local171 = 0; local171 < local169.length; local171++) {
									local1494 = this.aClass75Array1[local169[local171]];
									local1494.anInt1822 = local1494.anInt1822 * arg3 >> 7;
									local1494.anInt1824 = local1494.anInt1824 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray51 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray51.length) {
							local169 = this.anIntArrayArray51[local35];
							for (local171 = 0; local171 < local169.length; local171++) {
								local1494 = this.aClass75Array1[local169[local171]];
								local1494.anInt1828 = arg2 + local1494.anInt1828 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray52 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray52.length > local35) {
						local169 = this.anIntArrayArray52[local35];
						for (local171 = 0; local171 < local169.length; local171++) {
							local53 = local169[local171];
							local59 = this.aShortArray78[local53] & 0xFFFF;
							local293 = local59 >> 10 & 0x3F;
							local311 = local59 >> 7 & 0x7;
							local311 += arg3 / 4;
							local771 = local59 & 0x7F;
							@Pc(1341) int local1341 = local293 + arg2 & 0x3F;
							local771 += arg4;
							if (local311 < 0) {
								local311 = 0;
							} else if (local311 > 7) {
								local311 = 7;
							}
							if (local771 < 0) {
								local771 = 0;
							} else if (local771 > 127) {
								local771 = 127;
							}
							this.aShortArray78[local53] = (short) (local1341 << 10 | local311 << 7 | local771);
						}
						if (local169.length > 0 && this.aClass195_11 != null) {
							this.aClass195_11.anInterface5_5 = null;
						}
					}
				}
				if (this.aClass178Array1 != null) {
					for (local35 = 0; local35 < this.anInt5831; local35++) {
						local1234 = this.aClass178Array1[local35];
						local1239 = this.aClass75Array1[local35];
						local1239.anInt1830 = Static245.anIntArray376[this.aShortArray78[local1234.anInt4613] & 0xFFFF] & 0xFFFFFF | local1239.anInt1830 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "()I")
	@Override
	public int method4877() {
		if (!this.aBoolean386) {
			this.method4913();
		}
		return this.aShort87;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(SS)V")
	@Override
	public void method4909(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5796; local3++) {
			if (this.aShortArray78[local3] == arg0) {
				this.aShortArray78[local3] = arg1;
			}
		}
		if (this.aClass178Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt5831; local34++) {
				@Pc(41) Class178 local41 = this.aClass178Array1[local34];
				@Pc(46) Class75 local46 = this.aClass75Array1[local34];
				local46.anInt1830 = local46.anInt1830 & 0xFF000000 | Static245.anIntArray376[this.aShortArray78[local41.anInt4613] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass195_11 != null) {
			this.aClass195_11.anInterface5_5 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt5796; local7++) {
			local16 = this.aShortArray78[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			@Pc(62) int local62 = local16 & 0x7F;
			if (arg2 != -1) {
				local62 -= -((arg2 - local62) * arg3 >> 7);
			}
			this.aShortArray78[local7] = (short) (local62 | local28 << 7 | local22 << 10);
		}
		if (this.aClass178Array1 != null) {
			for (local16 = 0; local16 < this.anInt5831; local16++) {
				@Pc(108) Class178 local108 = this.aClass178Array1[local16];
				@Pc(113) Class75 local113 = this.aClass75Array1[local16];
				local113.anInt1830 = local113.anInt1830 & 0xFF000000 | Static245.anIntArray376[this.aShortArray78[local108.anInt4613] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass195_11 != null) {
			this.aClass195_11.anInterface5_5 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V")
	@Override
	public void method4870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5812; local7++) {
			if (arg0 != 128) {
				this.anIntArray512[local7] = arg0 * this.anIntArray512[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray511[local7] = arg1 * this.anIntArray511[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray510[local7] = this.anIntArray510[local7] * arg2 >> 7;
			}
		}
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface5_5 = null;
		}
		this.aBoolean386 = false;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	@Override
	public void method4861(@OriginalArg(0) int arg0) {
		this.aShort86 = (short) arg0;
		if (this.aClass195_11 != null) {
			this.aClass195_11.anInterface5_5 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "()I")
	@Override
	public int method4900() {
		return this.anInt5828;
	}

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "()I")
	@Override
	public int method4890() {
		if (!this.aBoolean386) {
			this.method4913();
		}
		return this.aShort85;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!na;I)V")
	private void method4918(@OriginalArg(0) Class132_Sub2 arg0) {
		@Pc(10) int local10;
		if (this.aClass192Array2 != null) {
			for (local10 = 0; local10 < this.aClass192Array2.length; local10++) {
				@Pc(17) Class192 local17 = this.aClass192Array2[local10];
				@Pc(19) Class192 local19 = local17;
				if (local17.aClass192_2 != null) {
					local19 = local17.aClass192_2;
				}
				local19.anInt4902 = (int) (arg0.aFloat72 + arg0.aFloat81 * (float) this.anIntArray510[local17.anInt4898] + (float) this.anIntArray511[local17.anInt4898] * arg0.aFloat74 + (float) this.anIntArray512[local17.anInt4898] * arg0.aFloat82);
				local19.anInt4904 = (int) ((float) this.anIntArray511[local17.anInt4898] * arg0.aFloat80 + arg0.aFloat77 * (float) this.anIntArray512[local17.anInt4898] + arg0.aFloat78 * (float) this.anIntArray510[local17.anInt4898] + arg0.aFloat76);
				local19.anInt4899 = (int) (arg0.aFloat71 + (float) this.anIntArray512[local17.anInt4898] * arg0.aFloat79 + (float) this.anIntArray511[local17.anInt4898] * arg0.aFloat75 + arg0.aFloat73 * (float) this.anIntArray510[local17.anInt4898]);
				local19.anInt4894 = (int) (arg0.aFloat72 + (float) this.anIntArray510[local17.anInt4896] * arg0.aFloat81 + arg0.aFloat74 * (float) this.anIntArray511[local17.anInt4896] + arg0.aFloat82 * (float) this.anIntArray512[local17.anInt4896]);
				local19.anInt4893 = (int) (arg0.aFloat76 + arg0.aFloat78 * (float) this.anIntArray510[local17.anInt4896] + arg0.aFloat77 * (float) this.anIntArray512[local17.anInt4896] + (float) this.anIntArray511[local17.anInt4896] * arg0.aFloat80);
				local19.anInt4889 = (int) (arg0.aFloat71 + arg0.aFloat75 * (float) this.anIntArray511[local17.anInt4896] + arg0.aFloat79 * (float) this.anIntArray512[local17.anInt4896] + arg0.aFloat73 * (float) this.anIntArray510[local17.anInt4896]);
				local19.anInt4891 = (int) ((float) this.anIntArray511[local17.anInt4897] * arg0.aFloat74 + (float) this.anIntArray512[local17.anInt4897] * arg0.aFloat82 + (float) this.anIntArray510[local17.anInt4897] * arg0.aFloat81 + arg0.aFloat72);
				local19.anInt4901 = (int) (arg0.aFloat76 + arg0.aFloat80 * (float) this.anIntArray511[local17.anInt4897] + arg0.aFloat77 * (float) this.anIntArray512[local17.anInt4897] + arg0.aFloat78 * (float) this.anIntArray510[local17.anInt4897]);
				local19.anInt4892 = (int) ((float) this.anIntArray511[local17.anInt4897] * arg0.aFloat75 + (float) this.anIntArray512[local17.anInt4897] * arg0.aFloat79 + arg0.aFloat73 * (float) this.anIntArray510[local17.anInt4897] + arg0.aFloat71);
			}
		}
		if (this.aClass161Array2 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass161Array2.length; local10++) {
			@Pc(358) Class161 local358 = this.aClass161Array2[local10];
			@Pc(360) Class161 local360 = local358;
			if (local358.aClass161_1 != null) {
				local360 = local358.aClass161_1;
			}
			if (local358.aClass132_2 == null) {
				local358.aClass132_2 = arg0.method3998();
			} else {
				local358.aClass132_2.method3982(arg0);
			}
			local360.anInt4061 = (int) ((float) this.anIntArray510[local358.anInt4068] * arg0.aFloat81 + arg0.aFloat74 * (float) this.anIntArray511[local358.anInt4068] + (float) this.anIntArray512[local358.anInt4068] * arg0.aFloat82 + arg0.aFloat72);
			local360.anInt4063 = (int) (arg0.aFloat76 + arg0.aFloat78 * (float) this.anIntArray510[local358.anInt4068] + (float) this.anIntArray512[local358.anInt4068] * arg0.aFloat77 + arg0.aFloat80 * (float) this.anIntArray511[local358.anInt4068]);
			local360.anInt4060 = (int) (arg0.aFloat79 * (float) this.anIntArray512[local358.anInt4068] + arg0.aFloat75 * (float) this.anIntArray511[local358.anInt4068] + (float) this.anIntArray510[local358.anInt4068] * arg0.aFloat73 + arg0.aFloat71);
		}
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "()I")
	@Override
	public int method4875() {
		if (!this.aBoolean386) {
			this.method4913();
		}
		return this.aShort90;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(IIII)V")
	@Override
	protected void method4873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static91.anInt1680 = 0;
			Static403.anInt6659 = 0;
			Static329.anInt5569 = 0;
			for (local17 = 0; local17 < this.anInt5812; local17++) {
				Static403.anInt6659 += this.anIntArray512[local17];
				Static91.anInt1680 += this.anIntArray511[local17];
				Static329.anInt5569 += this.anIntArray510[local17];
				local9++;
			}
			if (local9 <= 0) {
				Static403.anInt6659 = arg1;
				Static91.anInt1680 = arg2;
				Static329.anInt5569 = arg3;
			} else {
				Static91.anInt1680 = arg2 + Static91.anInt1680 / local9;
				Static403.anInt6659 = Static403.anInt6659 / local9 + arg1;
				Static329.anInt5569 = Static329.anInt5569 / local9 + arg3;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt5812; local9++) {
				this.anIntArray512[local9] += arg1;
				this.anIntArray511[local9] += arg2;
				this.anIntArray510[local9] += arg3;
			}
		} else {
			@Pc(165) int local165;
			@Pc(183) int local183;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt5812; local9++) {
					this.anIntArray512[local9] -= Static403.anInt6659;
					this.anIntArray511[local9] -= Static91.anInt1680;
					this.anIntArray510[local9] -= Static329.anInt5569;
					if (arg3 != 0) {
						local17 = Class6_Sub1_Sub18.anIntArray642[arg3];
						local165 = Class6_Sub1_Sub18.anIntArray643[arg3];
						local183 = local165 * this.anIntArray512[local9] + this.anIntArray511[local9] * local17 + 32767 >> 15;
						this.anIntArray511[local9] = local165 * this.anIntArray511[local9] + 32767 - local17 * this.anIntArray512[local9] >> 15;
						this.anIntArray512[local9] = local183;
					}
					if (arg1 != 0) {
						local17 = Class6_Sub1_Sub18.anIntArray642[arg1];
						local165 = Class6_Sub1_Sub18.anIntArray643[arg1];
						local183 = this.anIntArray511[local9] * local165 + 32767 - this.anIntArray510[local9] * local17 >> 15;
						this.anIntArray510[local9] = this.anIntArray511[local9] * local17 + local165 * this.anIntArray510[local9] + 32767 >> 15;
						this.anIntArray511[local9] = local183;
					}
					if (arg2 != 0) {
						local17 = Class6_Sub1_Sub18.anIntArray642[arg2];
						local165 = Class6_Sub1_Sub18.anIntArray643[arg2];
						local183 = local17 * this.anIntArray510[local9] + this.anIntArray512[local9] * local165 + 32767 >> 15;
						this.anIntArray510[local9] = this.anIntArray510[local9] * local165 + 32767 - local17 * this.anIntArray512[local9] >> 15;
						this.anIntArray512[local9] = local183;
					}
					this.anIntArray512[local9] += Static403.anInt6659;
					this.anIntArray511[local9] += Static91.anInt1680;
					this.anIntArray510[local9] += Static329.anInt5569;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt5812; local9++) {
					this.anIntArray512[local9] -= Static403.anInt6659;
					this.anIntArray511[local9] -= Static91.anInt1680;
					this.anIntArray510[local9] -= Static329.anInt5569;
					this.anIntArray512[local9] = this.anIntArray512[local9] * arg1 / 128;
					this.anIntArray511[local9] = this.anIntArray511[local9] * arg2 / 128;
					this.anIntArray510[local9] = this.anIntArray510[local9] * arg3 / 128;
					this.anIntArray512[local9] += Static403.anInt6659;
					this.anIntArray511[local9] += Static91.anInt1680;
					this.anIntArray510[local9] += Static329.anInt5569;
				}
			} else {
				@Pc(524) Class178 local524;
				@Pc(529) Class75 local529;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt5796; local9++) {
						local17 = (this.aByteArray75[local9] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray75[local9] = (byte) local17;
					}
					if (this.aClass195_11 != null) {
						this.aClass195_11.anInterface5_5 = null;
					}
					if (this.aClass178Array1 != null) {
						for (local17 = 0; local17 < this.anInt5831; local17++) {
							local524 = this.aClass178Array1[local17];
							local529 = this.aClass75Array1[local17];
							local529.anInt1830 = 255 - (this.aByteArray75[local524.anInt4613] & 0xFF) << 24 | local529.anInt1830 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt5796; local9++) {
						local17 = this.aShortArray78[local9] & 0xFFFF;
						local165 = local17 >> 10 & 0x3F;
						local183 = local17 >> 7 & 0x7;
						@Pc(583) int local583 = local17 & 0x7F;
						@Pc(589) int local589 = local165 + arg1 & 0x3F;
						local183 += arg2 / 4;
						local583 += arg3;
						if (local183 < 0) {
							local183 = 0;
						} else if (local183 > 7) {
							local183 = 7;
						}
						if (local583 < 0) {
							local583 = 0;
						} else if (local583 > 127) {
							local583 = 127;
						}
						this.aShortArray78[local9] = (short) (local583 | local183 << 7 | local589 << 10);
					}
					if (this.aClass195_11 != null) {
						this.aClass195_11.anInterface5_5 = null;
					}
					if (this.aClass178Array1 != null) {
						for (local17 = 0; local17 < this.anInt5831; local17++) {
							local524 = this.aClass178Array1[local17];
							local529 = this.aClass75Array1[local17];
							local529.anInt1830 = Static245.anIntArray376[this.aShortArray78[local524.anInt4613] & 0xFFFF] & 0xFFFFFF | local529.anInt1830 & 0xFF000000;
						}
					}
				} else {
					@Pc(704) Class75 local704;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt5831; local9++) {
							local704 = this.aClass75Array1[local9];
							local704.anInt1829 += arg2;
							local704.anInt1832 += arg1;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt5831; local9++) {
							local704 = this.aClass75Array1[local9];
							local704.anInt1822 = arg2 * local704.anInt1822 >> 7;
							local704.anInt1824 = local704.anInt1824 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt5831; local9++) {
							local704 = this.aClass75Array1[local9];
							local704.anInt1828 = local704.anInt1828 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "(I)V")
	private void method4919() {
		if (this.anInt5848 == 0) {
			return;
		}
		if (this.aByte81 != 0) {
			this.method4912(true);
		}
		this.method4912(false);
		if (this.aClass89_1 != null) {
			if (this.aClass89_1.anInterface8_3 == null) {
				this.method4920((this.aByte81 & 0x10) != 0);
			}
			if (this.aClass89_1.anInterface8_3 != null) {
				this.aClass28_Sub1_33.method668(this.aClass195_8 != null);
				this.aClass28_Sub1_33.method714(this.aClass195_8, this.aClass195_10, this.aClass195_11, this.aClass195_9);
				@Pc(73) int local73 = this.anIntArray509.length - 1;
				for (@Pc(75) int local75 = 0; local75 < local73; local75++) {
					@Pc(82) int local82 = this.anIntArray509[local75];
					@Pc(89) int local89 = this.anIntArray509[local75 + 1];
					@Pc(96) int local96 = this.aShortArray77[local82] & 0xFFFF;
					if (local96 == 65535) {
						local96 = -1;
					}
					this.aClass28_Sub1_33.method711(this.aClass195_8 != null, local96);
					this.aClass28_Sub1_33.method661(local82 * 3, (local89 - local82) * 3, this.aClass89_1.anInterface8_3);
				}
			}
		}
		this.method4922();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILclient!ql;Z)Z")
	@Override
	public boolean method4888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class132_Sub2 local8 = (Class132_Sub2) arg2;
		@Pc(12) Class132_Sub2 local12 = this.aClass28_Sub1_33.aClass132_Sub2_3;
		@Pc(33) float local33 = local12.aFloat72 + local8.aFloat71 * local12.aFloat81 + local12.aFloat74 * local8.aFloat76 + local12.aFloat82 * local8.aFloat72;
		@Pc(54) float local54 = local8.aFloat71 * local12.aFloat78 + local8.aFloat76 * local12.aFloat80 + local8.aFloat72 * local12.aFloat77 + local12.aFloat76;
		Static174.aFloat51 = local8.aFloat74 * local12.aFloat82 + local8.aFloat80 * local12.aFloat74 + local8.aFloat75 * local12.aFloat81;
		Static26.aFloat48 = local8.aFloat79 * local12.aFloat81 + local8.aFloat82 * local12.aFloat82 + local12.aFloat74 * local8.aFloat77;
		Static198.aFloat65 = local12.aFloat78 * local8.aFloat73 + local12.aFloat80 * local8.aFloat78 + local8.aFloat81 * local12.aFloat77;
		Static278.aFloat86 = local12.aFloat80 * local8.aFloat80 + local12.aFloat77 * local8.aFloat74 + local8.aFloat75 * local12.aFloat78;
		@Pc(147) float local147 = local12.aFloat71 + local12.aFloat79 * local8.aFloat72 + local12.aFloat75 * local8.aFloat76 + local12.aFloat73 * local8.aFloat71;
		Static400.aFloat101 = local8.aFloat82 * local12.aFloat77 + local12.aFloat80 * local8.aFloat77 + local8.aFloat79 * local12.aFloat78;
		Static188.aFloat59 = local12.aFloat82 * local8.aFloat81 + local8.aFloat78 * local12.aFloat74 + local8.aFloat73 * local12.aFloat81;
		Static4.aFloat1 = local12.aFloat79 * local8.aFloat82 + local8.aFloat77 * local12.aFloat75 + local12.aFloat73 * local8.aFloat79;
		Static286.aFloat87 = local8.aFloat81 * local12.aFloat79 + local12.aFloat75 * local8.aFloat78 + local8.aFloat73 * local12.aFloat73;
		Static195.aFloat63 = local8.aFloat74 * local12.aFloat79 + local8.aFloat80 * local12.aFloat75 + local12.aFloat73 * local8.aFloat75;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass28_Sub1_33.anInt782;
		@Pc(255) int local255 = this.aClass28_Sub1_33.anInt752;
		if (!this.aBoolean386) {
			this.method4913();
		}
		Static408.anIntArray588[0] = this.aShort87;
		Static144.anIntArray255[0] = this.aShort90;
		Static408.anIntArray588[1] = this.aShort85;
		Static24.anIntArray34[0] = this.aShort89;
		Static144.anIntArray255[1] = this.aShort90;
		Static24.anIntArray34[1] = this.aShort89;
		Static408.anIntArray588[2] = this.aShort87;
		Static144.anIntArray255[2] = this.aShort92;
		Static408.anIntArray588[3] = this.aShort85;
		Static24.anIntArray34[2] = this.aShort89;
		Static144.anIntArray255[3] = this.aShort92;
		Static24.anIntArray34[3] = this.aShort89;
		Static408.anIntArray588[4] = this.aShort87;
		Static144.anIntArray255[4] = this.aShort90;
		Static24.anIntArray34[4] = this.aShort84;
		Static408.anIntArray588[5] = this.aShort85;
		Static144.anIntArray255[5] = this.aShort90;
		Static408.anIntArray588[6] = this.aShort87;
		Static24.anIntArray34[5] = this.aShort84;
		Static144.anIntArray255[6] = this.aShort92;
		Static408.anIntArray588[7] = this.aShort85;
		Static24.anIntArray34[6] = this.aShort84;
		Static144.anIntArray255[7] = this.aShort92;
		Static24.anIntArray34[7] = this.aShort84;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(390) float local390;
		@Pc(395) float local395;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static408.anIntArray588[local383];
			local395 = Static144.anIntArray255[local383];
			local400 = Static24.anIntArray34[local383];
			local414 = local33 + local400 * Static188.aFloat59 + local390 * Static26.aFloat48 + local395 * Static174.aFloat51;
			local428 = Static198.aFloat65 * local400 + local390 * Static400.aFloat101 + local395 * Static278.aFloat86 + local54;
			local442 = local147 + Static286.aFloat87 * local400 + Static4.aFloat1 * local390 + local395 * Static195.aFloat63;
			if ((float) this.aClass28_Sub1_33.anInt773 <= local442) {
				@Pc(461) float local461 = (float) this.aClass28_Sub1_33.anInt781 + (float) local251 * local414 / local442;
				if (local461 > local243) {
					local243 = local461;
				}
				if (local241 > local461) {
					local241 = local461;
				}
				@Pc(485) float local485 = (float) this.aClass28_Sub1_33.anInt757 + (float) local255 * local428 / local442;
				if (local485 > local247) {
					local247 = local485;
				}
				if (local485 < local245) {
					local245 = local485;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg0 && local243 > (float) arg0 && local245 < (float) arg1 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.anInt5810 > Static202.anIntArray312.length) {
				Static202.anIntArray312 = new int[this.anInt5810];
				Static18.anIntArray22 = new int[this.anInt5810];
			}
			@Pc(620) int local620;
			for (@Pc(546) int local546 = 0; local546 < this.anInt5812; local546++) {
				local400 = this.anIntArray510[local546];
				local395 = this.anIntArray511[local546];
				local390 = this.anIntArray512[local546];
				local442 = local395 * Static195.aFloat63 + Static4.aFloat1 * local390 + local400 * Static286.aFloat87 + local147;
				local414 = local33 + local390 * Static26.aFloat48 + local395 * Static174.aFloat51 + local400 * Static188.aFloat59;
				local428 = local54 + Static198.aFloat65 * local400 + Static400.aFloat101 * local390 + local395 * Static278.aFloat86;
				@Pc(627) int local627;
				@Pc(629) int local629;
				@Pc(638) int local638;
				if (local442 >= (float) this.aClass28_Sub1_33.anInt773) {
					local620 = (int) (local414 * (float) local251 / local442 + (float) this.aClass28_Sub1_33.anInt781);
					local627 = (int) ((float) local255 * local428 / local442 + (float) this.aClass28_Sub1_33.anInt757);
					local629 = this.anIntArray508[local546];
					local638 = this.anIntArray508[local546 + 1];
					for (@Pc(701) int local701 = local629; local701 < local638; local701++) {
						@Pc(710) int local710 = this.aShortArray84[local701] - 1;
						if (local710 == -1) {
							break;
						}
						Static202.anIntArray312[local710] = local620;
						Static18.anIntArray22[local710] = local627;
					}
				} else {
					local620 = this.anIntArray508[local546];
					local627 = this.anIntArray508[local546 + 1];
					for (local629 = local620; local629 < local627; local629++) {
						local638 = this.aShortArray84[local629] - 1;
						if (local638 == -1) {
							break;
						}
						Static202.anIntArray312[this.aShortArray84[local629] - 1] = -999999;
					}
				}
			}
			for (local620 = 0; local620 < this.anInt5796; local620++) {
				if (Static202.anIntArray312[this.aShortArray81[local620]] != -999999 && Static202.anIntArray312[this.aShortArray83[local620]] != -999999 && Static202.anIntArray312[this.aShortArray79[local620]] != -999999 && this.method4915(Static202.anIntArray312[this.aShortArray79[local620]], Static202.anIntArray312[this.aShortArray83[local620]], arg1, arg0, Static18.anIntArray22[this.aShortArray79[local620]], Static202.anIntArray312[this.aShortArray81[local620]], Static18.anIntArray22[this.aShortArray81[local620]], Static18.anIntArray22[this.aShortArray83[local620]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)V")
	private void method4920(@OriginalArg(1) boolean arg0) {
		if (Static71.aClass6_Sub15_Sub2_1.aByteArray51.length < this.anInt5848 * 6) {
			Static71.aClass6_Sub15_Sub2_1 = new Class6_Sub15_Sub2(this.anInt5848 * 6 + 600);
		} else {
			Static71.aClass6_Sub15_Sub2_1.anInt3487 = 0;
		}
		@Pc(42) int local42;
		if (this.aClass28_Sub1_33.aBoolean52) {
			for (local42 = 0; local42 < this.anInt5848; local42++) {
				Static71.aClass6_Sub15_Sub2_1.method3100(this.aShortArray81[local42]);
				Static71.aClass6_Sub15_Sub2_1.method3100(this.aShortArray83[local42]);
				Static71.aClass6_Sub15_Sub2_1.method3100(this.aShortArray79[local42]);
			}
		} else {
			for (local42 = 0; local42 < this.anInt5848; local42++) {
				Static71.aClass6_Sub15_Sub2_1.method3114(this.aShortArray81[local42]);
				Static71.aClass6_Sub15_Sub2_1.method3114(this.aShortArray83[local42]);
				Static71.aClass6_Sub15_Sub2_1.method3114(this.aShortArray79[local42]);
			}
		}
		if (Static71.aClass6_Sub15_Sub2_1.anInt3487 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface8_5 == null) {
				this.anInterface8_5 = this.aClass28_Sub1_33.method669(true, Static71.aClass6_Sub15_Sub2_1.anInt3487, Static71.aClass6_Sub15_Sub2_1.aByteArray51);
			} else {
				this.anInterface8_5.method4284(Static71.aClass6_Sub15_Sub2_1.aByteArray51, Static71.aClass6_Sub15_Sub2_1.anInt3487);
			}
			this.aClass89_1.anInterface8_3 = this.anInterface8_5;
		} else {
			this.aClass89_1.anInterface8_3 = this.aClass28_Sub1_33.method669(false, Static71.aClass6_Sub15_Sub2_1.anInt3487, Static71.aClass6_Sub15_Sub2_1.aByteArray51);
		}
		if (!arg0) {
			this.aBoolean387 = true;
		}
	}

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "()V")
	@Override
	public void method4882() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5812; local7++) {
			this.anIntArray510[local7] = -this.anIntArray510[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt5810; local29++) {
			this.aShortArray76[local29] = (short) -this.aShortArray76[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt5796; local48++) {
			@Pc(55) short local55 = this.aShortArray81[local48];
			this.aShortArray81[local48] = this.aShortArray79[local48];
			this.aShortArray79[local48] = local55;
		}
		if (this.aClass195_8 == null && this.aClass195_11 != null) {
			this.aClass195_11.anInterface5_5 = null;
		}
		if (this.aClass195_8 != null) {
			this.aClass195_8.anInterface5_5 = null;
		}
		if (this.aClass89_1 != null) {
			this.aClass89_1.anInterface8_3 = null;
		}
		this.aBoolean386 = false;
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface5_5 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)V")
	@Override
	public void method4904(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub1_Sub18.anIntArray642[arg0];
		@Pc(13) int local13 = Class6_Sub1_Sub18.anIntArray643[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5812; local15++) {
			local33 = local13 * this.anIntArray512[local15] + this.anIntArray510[local15] * local9 >> 15;
			this.anIntArray510[local15] = this.anIntArray510[local15] * local13 - local9 * this.anIntArray512[local15] >> 15;
			this.anIntArray512[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt5810; local33++) {
			@Pc(83) int local83 = this.aShortArray76[local33] * local9 + local13 * this.aShortArray82[local33] >> 15;
			this.aShortArray76[local33] = (short) (local13 * this.aShortArray76[local33] - this.aShortArray82[local33] * local9 >> 15);
			this.aShortArray82[local33] = (short) local83;
		}
		if (this.aClass195_8 == null && this.aClass195_11 != null) {
			this.aClass195_11.anInterface5_5 = null;
		}
		if (this.aClass195_8 != null) {
			this.aClass195_8.anInterface5_5 = null;
		}
		this.aBoolean386 = false;
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface5_5 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "(I)V")
	private void method4921() {
		if (this.aClass178Array1 == null) {
			return;
		}
		@Pc(8) Class132_Sub2 local8 = this.aClass28_Sub1_33.aClass132_Sub2_2;
		@Pc(12) float local12 = this.aClass28_Sub1_33.method3556();
		@Pc(16) float local16 = this.aClass28_Sub1_33.method3572();
		this.aClass28_Sub1_33.method679();
		this.aClass28_Sub1_33.method3483(false);
		this.aClass28_Sub1_33.method668(false);
		this.aClass28_Sub1_33.method714(null, this.aClass28_Sub1_33.aClass195_1, null, this.aClass28_Sub1_33.aClass195_2);
		for (@Pc(43) int local43 = 0; local43 < this.anInt5831; local43++) {
			@Pc(50) Class178 local50 = this.aClass178Array1[local43];
			@Pc(55) Class75 local55 = this.aClass75Array1[local43];
			if (!local50.aBoolean331 || !this.aClass28_Sub1_33.method3563()) {
				@Pc(83) float local83 = (float) (this.anIntArray512[local50.anInt4610] + this.anIntArray512[local50.anInt4615] + this.anIntArray512[local50.anInt4614]) * 0.3333333F;
				@Pc(104) float local104 = (float) (this.anIntArray511[local50.anInt4610] + this.anIntArray511[local50.anInt4614] + this.anIntArray511[local50.anInt4615]) * 0.3333333F;
				@Pc(125) float local125 = (float) (this.anIntArray510[local50.anInt4614] + this.anIntArray510[local50.anInt4615] + this.anIntArray510[local50.anInt4610]) * 0.3333333F;
				@Pc(139) float local139 = Static174.aFloat51 * local104 + Static26.aFloat48 * local83 + Static188.aFloat59 * local125 + Static348.aFloat92;
				@Pc(153) float local153 = local83 * Static400.aFloat101 + Static278.aFloat86 * local104 + local125 * Static198.aFloat65 + Static162.aFloat50;
				@Pc(167) float local167 = Static286.aFloat87 * local125 + local83 * Static4.aFloat1 + local104 * Static195.aFloat63 + Static278.aFloat85;
				local8.method3997(local55.anInt1828, (float) local55.anInt1829 - local153, local55.anInt1824 * local50.aShort63 >> 7, (float) local55.anInt1832 + local139, local50.aShort61 * local55.anInt1822 >> 7, -local167);
				this.aClass28_Sub1_33.method681(local8);
				this.aClass28_Sub1_33.method3581(local16, local12 - (float) local50.anInt4612 * 1.5F);
				@Pc(218) int local218 = local55.anInt1830;
				OpenGL.glColor4ub((byte) (local218 >> 16), (byte) (local218 >> 8), (byte) local218, (byte) (local218 >> 24));
				this.aClass28_Sub1_33.method718(local50.aShort62);
				this.aClass28_Sub1_33.method708(local50.aByte49);
				this.aClass28_Sub1_33.method678(local50.aByte48);
				this.aClass28_Sub1_33.method720(4);
			}
		}
		this.aClass28_Sub1_33.method3581(local16, local12);
		this.aClass28_Sub1_33.method3483(true);
		this.aClass28_Sub1_33.method713();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!h;)Lclient!h;")
	@Override
	public Class6_Sub1_Sub8 method4866(@OriginalArg(0) Class6_Sub1_Sub8 arg0) {
		if (this.anInt5810 == 0) {
			return null;
		}
		if (!this.aBoolean386) {
			this.method4913();
		}
		@Pc(39) int local39;
		@Pc(56) int local56;
		if (this.aClass28_Sub1_33.anInt769 <= 0) {
			local39 = this.aShort87 - (this.aShort90 * this.aClass28_Sub1_33.anInt769 >> 8) >> this.aClass28_Sub1_33.anInt736;
			local56 = this.aShort85 - (this.aShort92 * this.aClass28_Sub1_33.anInt769 >> 8) >> this.aClass28_Sub1_33.anInt736;
		} else {
			local39 = this.aShort87 - (this.aClass28_Sub1_33.anInt769 * this.aShort92 >> 8) >> this.aClass28_Sub1_33.anInt736;
			local56 = this.aShort85 - (this.aShort90 * this.aClass28_Sub1_33.anInt769 >> 8) >> this.aClass28_Sub1_33.anInt736;
		}
		@Pc(116) int local116;
		@Pc(132) int local132;
		if (this.aClass28_Sub1_33.anInt755 > 0) {
			local116 = this.aShort89 - (this.aShort92 * this.aClass28_Sub1_33.anInt755 >> 8) >> this.aClass28_Sub1_33.anInt736;
			local132 = this.aShort84 - (this.aClass28_Sub1_33.anInt755 * this.aShort90 >> 8) >> this.aClass28_Sub1_33.anInt736;
		} else {
			local116 = this.aShort89 - (this.aClass28_Sub1_33.anInt755 * this.aShort90 >> 8) >> this.aClass28_Sub1_33.anInt736;
			local132 = this.aShort84 - (this.aClass28_Sub1_33.anInt755 * this.aShort92 >> 8) >> this.aClass28_Sub1_33.anInt736;
		}
		@Pc(174) int local174 = local56 + 1 - local39;
		@Pc(180) int local180 = local132 + 1 - local116;
		@Pc(183) Class6_Sub1_Sub8_Sub1 local183 = (Class6_Sub1_Sub8_Sub1) arg0;
		@Pc(193) Class6_Sub1_Sub8_Sub1 local193;
		if (local183 != null && local183.method5583(local180, local174)) {
			local193 = local183;
			local183.method5581();
		} else {
			local193 = new Class6_Sub1_Sub8_Sub1(this.aClass28_Sub1_33, local174, local180);
		}
		local193.method5585(local132, local39, local56, local116);
		this.method4911(local193);
		return local193;
	}

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "()I")
	@Override
	public int method4905() {
		if (!this.aBoolean386) {
			this.method4913();
		}
		return this.aShort92;
	}

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "()[Lclient!oo;")
	@Override
	public Class192[] method4899() {
		return this.aClass192Array2;
	}

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "()V")
	@Override
	public void method4887() {
		if (this.anInt5810 <= 0 || this.anInt5848 <= 0) {
			return;
		}
		this.method4912(false);
		if ((this.aByte81 & 0x10) == 0 && this.aClass89_1.anInterface8_3 == null) {
			this.method4920(false);
		}
		this.method4922();
	}

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V")
	@Override
	public void method4891(@OriginalArg(0) int arg0) {
		this.anInt5828 = arg0;
		if (this.aClass153_1 != null && (this.anInt5828 & 0x10000) == 0) {
			this.aShortArray76 = this.aClass153_1.aShortArray63;
			this.aByteArray76 = this.aClass153_1.aByteArray56;
			this.aShortArray82 = this.aClass153_1.aShortArray64;
			this.aShortArray75 = this.aClass153_1.aShortArray65;
			this.aClass153_1 = null;
		}
		this.aBoolean387 = true;
		this.method4922();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(SS)V")
	@Override
	public void method4901(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface11 local9 = this.aClass28_Sub1_33.anInterface11_6;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5796; local11++) {
			if (this.aShortArray77[local11] == arg0) {
				this.aShortArray77[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class229 local44 = local9.method2466(arg0 & 0xFFFF);
			local33 = local44.aByte83;
			local31 = local44.aByte84;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(65) Class229 local65 = local9.method2466(arg1 & 0xFFFF);
			local54 = local65.aByte83;
			local52 = local65.aByte84;
		}
		if (!(local54 != local33 | local52 != local31)) {
			return;
		}
		if (this.aClass178Array1 != null) {
			for (@Pc(90) int local90 = 0; local90 < this.anInt5831; local90++) {
				@Pc(97) Class178 local97 = this.aClass178Array1[local90];
				@Pc(102) Class75 local102 = this.aClass75Array1[local90];
				local102.anInt1830 = local102.anInt1830 & 0xFF000000 | Static245.anIntArray376[this.aShortArray78[local97.anInt4613] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass195_11 != null) {
			this.aClass195_11.anInterface5_5 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "(I)V")
	private void method4922() {
		if (!this.aBoolean387) {
			return;
		}
		this.aBoolean387 = false;
		if (this.aClass192Array2 == null && this.aClass161Array2 == null && this.aClass178Array1 == null) {
			if (this.anIntArray512 != null && !Static423.method5708(this.anInt5828, this.anInt5823)) {
				if (this.aClass195_9 != null && this.aClass195_9.anInterface5_5 == null) {
					this.aBoolean387 = true;
				} else {
					if (!this.aBoolean386) {
						this.method4913();
					}
					this.anIntArray512 = null;
				}
			}
			if (this.anIntArray511 != null && !Static335.method4766(this.anInt5828, this.anInt5823)) {
				if (this.aClass195_9 != null && this.aClass195_9.anInterface5_5 == null) {
					this.aBoolean387 = true;
				} else {
					if (!this.aBoolean386) {
						this.method4913();
					}
					this.anIntArray511 = null;
				}
			}
			if (this.anIntArray510 != null && !Static182.method2839(this.anInt5823, this.anInt5828)) {
				if (this.aClass195_9 != null && this.aClass195_9.anInterface5_5 == null) {
					this.aBoolean387 = true;
				} else {
					if (!this.aBoolean386) {
						this.method4913();
					}
					this.anIntArray510 = null;
				}
			}
		}
		if (this.aShortArray84 != null && this.anIntArray512 == null && this.anIntArray511 == null && this.anIntArray510 == null) {
			this.aShortArray84 = null;
			this.anIntArray508 = null;
		}
		if (this.aByteArray76 != null && !Static274.method4166(this.anInt5828, this.anInt5823)) {
			if (this.aClass195_8 == null) {
				if (this.aClass195_11 != null && this.aClass195_11.anInterface5_5 == null) {
					this.aBoolean387 = true;
				} else {
					this.aShortArray82 = this.aShortArray75 = this.aShortArray76 = null;
					this.aByteArray76 = null;
				}
			} else if (this.aClass195_8.anInterface5_5 == null) {
				this.aBoolean387 = true;
			} else {
				this.aShortArray82 = this.aShortArray75 = this.aShortArray76 = null;
				this.aByteArray76 = null;
			}
		}
		if (this.aShortArray78 != null && !Static126.method4050(this.anInt5823, this.anInt5828)) {
			if (this.aClass195_11 != null && this.aClass195_11.anInterface5_5 == null) {
				this.aBoolean387 = true;
			} else {
				this.aShortArray78 = null;
			}
		}
		if (this.aByteArray75 != null && !Static60.method1107(this.anInt5823, this.anInt5828)) {
			if (this.aClass195_11 != null && this.aClass195_11.anInterface5_5 == null) {
				this.aBoolean387 = true;
			} else {
				this.aByteArray75 = null;
			}
		}
		if (this.aFloatArray28 != null && !Static224.method3408(this.anInt5823, this.anInt5828)) {
			if (this.aClass195_10 != null && this.aClass195_10.anInterface5_5 == null) {
				this.aBoolean387 = true;
			} else {
				this.aFloatArray28 = this.aFloatArray27 = null;
			}
		}
		if (this.aShortArray77 != null && !Static30.method405(this.anInt5823, this.anInt5828)) {
			if (this.aClass195_11 != null && this.aClass195_11.anInterface5_5 == null) {
				this.aBoolean387 = true;
			} else {
				this.aShortArray77 = null;
			}
		}
		if (this.aShortArray81 != null && !Static209.method3255(this.anInt5828, this.anInt5823)) {
			if ((this.aClass89_1 == null || this.aClass89_1.anInterface8_3 != null) && (this.aClass195_11 == null || this.aClass195_11.anInterface5_5 != null)) {
				this.aShortArray81 = this.aShortArray83 = this.aShortArray79 = null;
			} else {
				this.aBoolean387 = true;
			}
		}
		if (this.anIntArrayArray52 != null && !Static8.method122(this.anInt5823, this.anInt5828)) {
			this.anIntArrayArray52 = null;
			this.aShortArray80 = null;
		}
		if (this.anIntArrayArray53 != null && !Static95.method1647(this.anInt5828, this.anInt5823)) {
			this.lb = null;
			this.anIntArrayArray53 = null;
		}
		if (this.anIntArrayArray51 != null && !Static323.method4592(this.anInt5828, this.anInt5823)) {
			this.anIntArrayArray51 = null;
		}
		if (this.anIntArray509 != null && (this.anInt5828 & 0x800) == 0 && (this.anInt5828 & 0x40000) == 0) {
			this.anIntArray509 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLclient!ri;Lclient!ri;ZIZ)Lclient!cd;")
	private Class39 method4923(@OriginalArg(1) Class39_Sub2 arg0, @OriginalArg(2) Class39_Sub2 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		arg0.anInt5823 = this.anInt5823;
		arg0.anInt5796 = this.anInt5796;
		arg0.anInt5810 = this.anInt5810;
		arg0.anInt5848 = this.anInt5848;
		arg0.anInt5829 = this.anInt5829;
		arg0.aByte81 = 0;
		arg0.anInt5812 = this.anInt5812;
		arg0.aShort86 = this.aShort86;
		arg0.anInt5831 = this.anInt5831;
		arg0.aShort88 = this.aShort88;
		arg0.anInt5828 = arg3;
		@Pc(53) boolean local53 = Static289.method4312(this.anInt5823, arg3);
		@Pc(59) boolean local59 = Static324.method4598(arg3, this.anInt5823);
		@Pc(65) boolean local65 = Static192.method3032(this.anInt5823, arg3);
		@Pc(71) boolean local71 = local59 | local53 | local65;
		@Pc(190) int local190;
		if (local71) {
			if (!local53) {
				arg0.anIntArray512 = this.anIntArray512;
			} else if (arg1.anIntArray512 == null || arg1.anIntArray512.length < this.anInt5829) {
				arg0.anIntArray512 = arg1.anIntArray512 = new int[this.anInt5829];
			} else {
				arg0.anIntArray512 = arg1.anIntArray512;
			}
			if (!local59) {
				arg0.anIntArray511 = this.anIntArray511;
			} else if (arg1.anIntArray511 == null || this.anInt5829 > arg1.anIntArray511.length) {
				arg0.anIntArray511 = arg1.anIntArray511 = new int[this.anInt5829];
			} else {
				arg0.anIntArray511 = arg1.anIntArray511;
			}
			if (!local65) {
				arg0.anIntArray510 = this.anIntArray510;
			} else if (arg1.anIntArray510 == null || arg1.anIntArray510.length < this.anInt5829) {
				arg0.anIntArray510 = arg1.anIntArray510 = new int[this.anInt5829];
			} else {
				arg0.anIntArray510 = arg1.anIntArray510;
			}
			for (local190 = 0; local190 < this.anInt5829; local190++) {
				if (local53) {
					arg0.anIntArray512[local190] = this.anIntArray512[local190];
				}
				if (local59) {
					arg0.anIntArray511[local190] = this.anIntArray511[local190];
				}
				if (local65) {
					arg0.anIntArray510[local190] = this.anIntArray510[local190];
				}
			}
		} else {
			arg0.anIntArray511 = this.anIntArray511;
			arg0.anIntArray512 = this.anIntArray512;
			arg0.anIntArray510 = this.anIntArray510;
		}
		if (Static371.method5157(arg3, this.anInt5823)) {
			arg0.aClass195_9 = arg1.aClass195_9;
			if (arg4) {
				arg0.aByte81 = (byte) (arg0.aByte81 | 0x1);
			}
			arg0.aClass195_9.anInterface5_5 = this.aClass195_9.anInterface5_5;
			arg0.aClass195_9.aByte60 = this.aClass195_9.aByte60;
		} else if (Static269.method4104(this.anInt5823, arg3)) {
			arg0.aClass195_9 = this.aClass195_9;
		} else {
			arg0.aClass195_9 = null;
		}
		if (Static330.method3977(this.anInt5823, arg3)) {
			if (arg1.aShortArray78 == null || this.anInt5796 > arg1.aShortArray78.length) {
				arg0.aShortArray78 = arg1.aShortArray78 = new short[this.anInt5796];
			} else {
				arg0.aShortArray78 = arg1.aShortArray78;
			}
			for (local190 = 0; local190 < this.anInt5796; local190++) {
				arg0.aShortArray78[local190] = this.aShortArray78[local190];
			}
		} else {
			arg0.aShortArray78 = this.aShortArray78;
		}
		if (Static272.method4135(arg3, this.anInt5823)) {
			if (arg1.aByteArray75 == null || this.anInt5796 > arg1.aByteArray75.length) {
				arg0.aByteArray75 = arg1.aByteArray75 = new byte[this.anInt5796];
			} else {
				arg0.aByteArray75 = arg1.aByteArray75;
			}
			for (local190 = 0; local190 < this.anInt5796; local190++) {
				arg0.aByteArray75[local190] = this.aByteArray75[local190];
			}
		} else {
			arg0.aByteArray75 = this.aByteArray75;
		}
		if (Static73.method1405(arg3, this.anInt5823)) {
			if (arg4) {
				arg0.aByte81 = (byte) (arg0.aByte81 | 0x2);
			}
			arg0.aClass195_11 = arg1.aClass195_11;
			arg0.aClass195_11.aByte60 = this.aClass195_11.aByte60;
			arg0.aClass195_11.anInterface5_5 = this.aClass195_11.anInterface5_5;
		} else if (Static64.method1229(this.anInt5823, arg3)) {
			arg0.aClass195_11 = this.aClass195_11;
		} else {
			arg0.aClass195_11 = null;
		}
		@Pc(529) int local529;
		if (Static70.method1382(arg3, this.anInt5823)) {
			if (arg1.aShortArray82 == null || arg1.aShortArray82.length < this.anInt5810) {
				local190 = this.anInt5810;
				arg0.aShortArray82 = arg1.aShortArray82 = new short[local190];
				arg0.aShortArray75 = arg1.aShortArray75 = new short[local190];
				arg0.aShortArray76 = arg1.aShortArray76 = new short[local190];
			} else {
				arg0.aShortArray76 = arg1.aShortArray76;
				arg0.aShortArray75 = arg1.aShortArray75;
				arg0.aShortArray82 = arg1.aShortArray82;
			}
			if (this.aClass153_1 == null) {
				for (local190 = 0; local190 < this.anInt5810; local190++) {
					arg0.aShortArray82[local190] = this.aShortArray82[local190];
					arg0.aShortArray75[local190] = this.aShortArray75[local190];
					arg0.aShortArray76[local190] = this.aShortArray76[local190];
				}
			} else {
				if (arg1.aClass153_1 == null) {
					arg1.aClass153_1 = new Class153();
				}
				@Pc(517) Class153 local517 = arg0.aClass153_1 = arg1.aClass153_1;
				if (local517.aShortArray64 == null || local517.aShortArray64.length < this.anInt5810) {
					local529 = this.anInt5810;
					local517.aShortArray64 = new short[local529];
					local517.aShortArray63 = new short[local529];
					local517.aShortArray65 = new short[local529];
					local517.aByteArray56 = new byte[local529];
				}
				for (local529 = 0; local529 < this.anInt5810; local529++) {
					arg0.aShortArray82[local529] = this.aShortArray82[local529];
					arg0.aShortArray75[local529] = this.aShortArray75[local529];
					arg0.aShortArray76[local529] = this.aShortArray76[local529];
					local517.aShortArray64[local529] = this.aClass153_1.aShortArray64[local529];
					local517.aShortArray65[local529] = this.aClass153_1.aShortArray65[local529];
					local517.aShortArray63[local529] = this.aClass153_1.aShortArray63[local529];
					local517.aByteArray56[local529] = this.aClass153_1.aByteArray56[local529];
				}
			}
			arg0.aByteArray76 = this.aByteArray76;
		} else {
			arg0.aShortArray76 = this.aShortArray76;
			arg0.aShortArray82 = this.aShortArray82;
			arg0.aShortArray75 = this.aShortArray75;
			arg0.aByteArray76 = this.aByteArray76;
			arg0.aClass153_1 = this.aClass153_1;
		}
		if (Static35.method737(this.anInt5823, arg3)) {
			arg0.aClass195_8 = arg1.aClass195_8;
			if (arg4) {
				arg0.aByte81 = (byte) (arg0.aByte81 | 0x4);
			}
			arg0.aClass195_8.anInterface5_5 = this.aClass195_8.anInterface5_5;
			arg0.aClass195_8.aByte60 = this.aClass195_8.aByte60;
		} else if (Static54.method1013(arg3, this.anInt5823)) {
			arg0.aClass195_8 = this.aClass195_8;
		} else {
			arg0.aClass195_8 = null;
		}
		if (Static376.method4535(arg3, this.anInt5823)) {
			if (arg1.aFloatArray28 == null || this.anInt5796 > arg1.aFloatArray28.length) {
				local190 = this.anInt5810;
				arg0.aFloatArray28 = arg1.aFloatArray28 = new float[local190];
				arg0.aFloatArray27 = arg1.aFloatArray27 = new float[local190];
			} else {
				arg0.aFloatArray27 = arg1.aFloatArray27;
				arg0.aFloatArray28 = arg1.aFloatArray28;
			}
			for (local190 = 0; local190 < this.anInt5810; local190++) {
				arg0.aFloatArray28[local190] = this.aFloatArray28[local190];
				arg0.aFloatArray27[local190] = this.aFloatArray27[local190];
			}
		} else {
			arg0.aFloatArray27 = this.aFloatArray27;
			arg0.aFloatArray28 = this.aFloatArray28;
		}
		if (Static97.method1665(arg3, this.anInt5823)) {
			if (arg4) {
				arg0.aByte81 = (byte) (arg0.aByte81 | 0x8);
			}
			arg0.aClass195_10 = arg1.aClass195_10;
			arg0.aClass195_10.aByte60 = this.aClass195_10.aByte60;
			arg0.aClass195_10.anInterface5_5 = this.aClass195_10.anInterface5_5;
		} else if (Static326.method4621(this.anInt5823, arg3)) {
			arg0.aClass195_10 = this.aClass195_10;
		} else {
			arg0.aClass195_10 = null;
		}
		if (Static124.method3217(arg3, this.anInt5823)) {
			if (arg1.aShortArray81 == null || this.anInt5796 > arg1.aShortArray81.length) {
				local190 = this.anInt5796;
				arg0.aShortArray79 = arg1.aShortArray79 = new short[local190];
				arg0.aShortArray83 = arg1.aShortArray83 = new short[local190];
				arg0.aShortArray81 = arg1.aShortArray81 = new short[local190];
			} else {
				arg0.aShortArray81 = arg1.aShortArray81;
				arg0.aShortArray79 = arg1.aShortArray79;
				arg0.aShortArray83 = arg1.aShortArray83;
			}
			for (local190 = 0; local190 < this.anInt5796; local190++) {
				arg0.aShortArray81[local190] = this.aShortArray81[local190];
				arg0.aShortArray83[local190] = this.aShortArray83[local190];
				arg0.aShortArray79[local190] = this.aShortArray79[local190];
			}
		} else {
			arg0.aShortArray81 = this.aShortArray81;
			arg0.aShortArray83 = this.aShortArray83;
			arg0.aShortArray79 = this.aShortArray79;
		}
		if (Static262.method4016(arg3, this.anInt5823)) {
			if (arg4) {
				arg0.aByte81 = (byte) (arg0.aByte81 | 0x10);
			}
			arg0.aClass89_1 = arg1.aClass89_1;
			arg0.aClass89_1.anInterface8_3 = this.aClass89_1.anInterface8_3;
		} else if (Static96.method1659(arg3, this.anInt5823)) {
			arg0.aClass89_1 = this.aClass89_1;
		} else {
			arg0.aClass89_1 = null;
		}
		if (Static393.method4744(arg3, this.anInt5823)) {
			if (arg1.aShortArray77 == null || this.anInt5796 > arg1.aShortArray77.length) {
				local190 = this.anInt5796;
				arg0.aShortArray77 = arg1.aShortArray77 = new short[local190];
			} else {
				arg0.aShortArray77 = arg1.aShortArray77;
			}
			for (local190 = 0; local190 < this.anInt5796; local190++) {
				arg0.aShortArray77[local190] = this.aShortArray77[local190];
			}
		} else {
			arg0.aShortArray77 = this.aShortArray77;
		}
		if (!Static324.method4596(arg3, this.anInt5823)) {
			arg0.aClass75Array1 = this.aClass75Array1;
		} else if (arg1.aClass75Array1 == null || this.anInt5831 > arg1.aClass75Array1.length) {
			local190 = this.anInt5831;
			arg0.aClass75Array1 = arg1.aClass75Array1 = new Class75[local190];
			for (local529 = 0; local529 < this.anInt5831; local529++) {
				arg0.aClass75Array1[local529] = this.aClass75Array1[local529].method1686();
			}
		} else {
			arg0.aClass75Array1 = arg1.aClass75Array1;
			for (local190 = 0; local190 < this.anInt5831; local190++) {
				arg0.aClass75Array1[local190].method1690(this.aClass75Array1[local190]);
			}
		}
		arg0.anIntArray509 = this.anIntArray509;
		arg0.anIntArrayArray52 = this.anIntArrayArray52;
		arg0.anIntArrayArray53 = this.anIntArrayArray53;
		if (this.aBoolean386) {
			arg0.aShort91 = this.aShort91;
			arg0.aShort89 = this.aShort89;
			arg0.aShort87 = this.aShort87;
			arg0.aShort85 = this.aShort85;
			arg0.aShort90 = this.aShort90;
			arg0.aShort92 = this.aShort92;
			arg0.aBoolean386 = true;
			arg0.aShort84 = this.aShort84;
		} else {
			arg0.aBoolean386 = false;
		}
		arg0.aClass192Array2 = this.aClass192Array2;
		arg0.aClass161Array2 = this.aClass161Array2;
		arg0.anIntArray508 = this.anIntArray508;
		arg0.aShortArray84 = this.aShortArray84;
		arg0.aShortArray80 = this.aShortArray80;
		arg0.anIntArrayArray51 = this.anIntArrayArray51;
		arg0.aClass178Array1 = this.aClass178Array1;
		arg0.lb = this.lb;
		return arg0;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)V")
	@Override
	public void method4874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5812; local7++) {
			if (arg0 != 0) {
				this.anIntArray512[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray511[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray510[local7] += arg2;
			}
		}
		if (this.aClass195_9 != null) {
			this.aClass195_9.anInterface5_5 = null;
		}
		this.aBoolean386 = false;
	}

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "()Z")
	@Override
	protected boolean method4878() {
		if (this.anIntArrayArray53 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5829; local12++) {
			this.anIntArray512[local12] <<= 0x4;
			this.anIntArray511[local12] <<= 0x4;
			this.anIntArray510[local12] <<= 0x4;
		}
		Static91.anInt1680 = 0;
		Static329.anInt5569 = 0;
		Static403.anInt6659 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "()I")
	@Override
	public int method4867() {
		if (!this.aBoolean386) {
			this.method4913();
		}
		return this.aShort84;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIZ)Lclient!cd;")
	@Override
	public Class39 method4863(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(17) Class39_Sub2 local17;
		@Pc(21) Class39_Sub2 local21;
		if (arg0 == 1) {
			local21 = this.aClass28_Sub1_33.aClass39_Sub2_8;
			local17 = this.aClass28_Sub1_33.aClass39_Sub2_2;
		} else if (arg0 == 2) {
			local17 = this.aClass28_Sub1_33.aClass39_Sub2_4;
			local21 = this.aClass28_Sub1_33.aClass39_Sub2_10;
		} else if (arg0 == 3) {
			local17 = this.aClass28_Sub1_33.aClass39_Sub2_7;
			local21 = this.aClass28_Sub1_33.aClass39_Sub2_9;
		} else if (arg0 == 4) {
			local17 = this.aClass28_Sub1_33.aClass39_Sub2_6;
			local21 = this.aClass28_Sub1_33.aClass39_Sub2_3;
		} else if (arg0 == 5) {
			local21 = this.aClass28_Sub1_33.aClass39_Sub2_5;
			local17 = this.aClass28_Sub1_33.aClass39_Sub2_1;
		} else {
			local17 = local21 = new Class39_Sub2(this.aClass28_Sub1_33);
		}
		return this.method4923(local17, local21, arg2, arg1, arg0 != 0);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIILclient!wr;IFIJFI)S")
	private short method4924(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class266 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray508[arg0];
		@Pc(17) int local17 = this.anIntArray508[arg0 + 1];
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = local10; local26 < local17; local26++) {
			@Pc(33) short local33 = this.aShortArray84[local26];
			if (local33 == 0) {
				local24 = local26;
				break;
			}
			if (arg6 == Static207.aLongArray4[local26]) {
				return (short) (local33 - 1);
			}
		}
		this.aShortArray84[local24] = (short) (this.anInt5810 + 1);
		Static207.aLongArray4[local24] = arg6;
		this.aShortArray82[this.anInt5810] = (short) arg5;
		this.aShortArray75[this.anInt5810] = (short) arg3;
		this.aShortArray76[this.anInt5810] = (short) arg8;
		this.aByteArray76[this.anInt5810] = (byte) arg1;
		this.aFloatArray28[this.anInt5810] = arg7;
		this.aFloatArray27[this.anInt5810] = arg4;
		return (short) this.anInt5810++;
	}
}
