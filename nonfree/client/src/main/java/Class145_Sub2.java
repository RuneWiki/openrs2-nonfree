import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class145_Sub2 extends Class145 {

	@OriginalMember(owner = "client!lr", name = "lb", descriptor = "I")
	public static int lb = -1;

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!lr", name = "A", descriptor = "[I")
	private int[] anIntArray534;

	@OriginalMember(owner = "client!lr", name = "D", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!lr", name = "J", descriptor = "[F")
	private float[] aFloatArray35;

	@OriginalMember(owner = "client!lr", name = "Q", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!lr", name = "T", descriptor = "Lclient!nu;")
	private Interface10 anInterface10_3;

	@OriginalMember(owner = "client!lr", name = "cb", descriptor = "[I")
	private int[] anIntArray536;

	@OriginalMember(owner = "client!lr", name = "eb", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!lr", name = "fb", descriptor = "[I")
	private int[] anIntArray537;

	@OriginalMember(owner = "client!lr", name = "gb", descriptor = "S")
	private short aShort89;

	@OriginalMember(owner = "client!lr", name = "jb", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!lr", name = "kb", descriptor = "I")
	private int anInt5340;

	@OriginalMember(owner = "client!lr", name = "mb", descriptor = "[[I")
	private int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!lr", name = "ob", descriptor = "S")
	private short aShort90;

	@OriginalMember(owner = "client!lr", name = "qb", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!lr", name = "rb", descriptor = "[B")
	private byte[] aByteArray79;

	@OriginalMember(owner = "client!lr", name = "vb", descriptor = "I")
	private int anInt5344;

	@OriginalMember(owner = "client!lr", name = "Bb", descriptor = "[I")
	private int[] anIntArray538;

	@OriginalMember(owner = "client!lr", name = "Cb", descriptor = "[Lclient!qt;")
	private Class252[] aClass252Array1;

	@OriginalMember(owner = "client!lr", name = "Eb", descriptor = "[[I")
	private int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!lr", name = "Ib", descriptor = "S")
	private short aShort92;

	@OriginalMember(owner = "client!lr", name = "Kb", descriptor = "[Lclient!sca;")
	private Class266[] aClass266Array1;

	@OriginalMember(owner = "client!lr", name = "Mb", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!lr", name = "Pb", descriptor = "S")
	private short aShort94;

	@OriginalMember(owner = "client!lr", name = "Qb", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!lr", name = "Sb", descriptor = "Lclient!ro;")
	private Class259 aClass259_1;

	@OriginalMember(owner = "client!lr", name = "Ub", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!lr", name = "Wb", descriptor = "S")
	private short aShort95;

	@OriginalMember(owner = "client!lr", name = "Xb", descriptor = "[Lclient!fi;")
	private Class93[] aClass93Array5;

	@OriginalMember(owner = "client!lr", name = "ac", descriptor = "[[I")
	private int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!lr", name = "fc", descriptor = "[F")
	private float[] aFloatArray36;

	@OriginalMember(owner = "client!lr", name = "gc", descriptor = "[I")
	private int[] anIntArray539;

	@OriginalMember(owner = "client!lr", name = "hc", descriptor = "I")
	private int anInt5366;

	@OriginalMember(owner = "client!lr", name = "kc", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!lr", name = "mc", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!lr", name = "pc", descriptor = "Lclient!ee;")
	private Interface2 anInterface2_3;

	@OriginalMember(owner = "client!lr", name = "rc", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!lr", name = "sc", descriptor = "B")
	private byte aByte66;

	@OriginalMember(owner = "client!lr", name = "uc", descriptor = "[Lclient!kca;")
	private Class161[] aClass161Array5;

	@OriginalMember(owner = "client!lr", name = "pb", descriptor = "Z")
	private boolean aBoolean375 = true;

	@OriginalMember(owner = "client!lr", name = "tb", descriptor = "I")
	private int anInt5342 = 0;

	@OriginalMember(owner = "client!lr", name = "S", descriptor = "I")
	private int anInt5332 = 0;

	@OriginalMember(owner = "client!lr", name = "lc", descriptor = "I")
	private int anInt5369 = 0;

	@OriginalMember(owner = "client!lr", name = "wc", descriptor = "I")
	private int anInt5374 = 0;

	@OriginalMember(owner = "client!lr", name = "Ab", descriptor = "I")
	private int anInt5349 = 0;

	@OriginalMember(owner = "client!lr", name = "vc", descriptor = "Z")
	private boolean aBoolean376 = false;

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_21;

	@OriginalMember(owner = "client!lr", name = "xc", descriptor = "Lclient!cd;")
	private Class43 aClass43_6;

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "Lclient!cd;")
	private Class43 aClass43_3;

	@OriginalMember(owner = "client!lr", name = "Db", descriptor = "Lclient!cd;")
	private Class43 aClass43_5;

	@OriginalMember(owner = "client!lr", name = "sb", descriptor = "Lclient!cd;")
	private Class43 aClass43_4;

	@OriginalMember(owner = "client!lr", name = "db", descriptor = "Lclient!hs;")
	private Class128 aClass128_1;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class145_Sub2(@OriginalArg(0) Class122_Sub3 arg0) {
		this.aClass122_Sub3_21 = arg0;
		this.aClass43_6 = new Class43(null, 5126, 3, 0);
		this.aClass43_3 = new Class43(null, 5126, 2, 0);
		this.aClass43_5 = new Class43(null, 5126, 3, 0);
		this.aClass43_4 = new Class43(null, 5121, 4, 0);
		this.aClass128_1 = new Class128();
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!uq;Lclient!fp;IIII)V")
	public Class145_Sub2(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5344 = arg5;
		this.anInt5340 = arg2;
		this.aClass122_Sub3_21 = arg0;
		if (Static538.method7475(arg5, arg2)) {
			this.aClass43_6 = new Class43(null, 5126, 3, 0);
		}
		if (Static241.method4171(arg5, arg2)) {
			this.aClass43_3 = new Class43(null, 5126, 2, 0);
		}
		if (Static454.method6446(arg5, arg2)) {
			this.aClass43_5 = new Class43(null, 5126, 3, 0);
		}
		if (Static177.method2906(arg5, arg2)) {
			this.aClass43_4 = new Class43(null, 5121, 4, 0);
		}
		if (Static525.method1314(arg2, arg5)) {
			this.aClass128_1 = new Class128();
		}
		@Pc(102) Interface8 local102 = arg0.anInterface8_14;
		@Pc(106) int[] local106 = new int[arg1.anInt2727];
		this.anIntArray538 = new int[arg1.anInt2715 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt2727; local115++) {
			if ((arg1.aByteArray39 == null || arg1.aByteArray39[local115] != 2) && (arg1.aShortArray47 == null || arg1.aShortArray47[local115] == -1 || !local102.method878(arg1.aShortArray47[local115] & 0xFFFF).aBoolean448)) {
				local106[this.anInt5369++] = local115;
				this.anIntArray538[arg1.aShortArray45[local115]]++;
				this.anIntArray538[arg1.aShortArray42[local115]]++;
				this.anIntArray538[arg1.aShortArray40[local115]]++;
			}
		}
		this.anInt5349 = this.anInt5369;
		@Pc(207) long[] local207 = new long[this.anInt5369];
		@Pc(219) boolean local219 = (this.anInt5340 & 0x100) != 0;
		@Pc(231) int local231;
		@Pc(242) int local242;
		@Pc(372) int local372;
		label497: for (@Pc(221) int local221 = 0; local221 < this.anInt5369; local221++) {
			@Pc(227) int local227 = local106[local221];
			@Pc(229) Class220 local229 = null;
			local231 = 0;
			@Pc(233) byte local233 = 0;
			@Pc(235) byte local235 = 0;
			@Pc(237) byte local237 = 0;
			if (arg1.aClass208Array1 != null) {
				for (local242 = 0; local242 < arg1.aClass208Array1.length; local242++) {
					@Pc(249) Class208 local249 = arg1.aClass208Array1[local242];
					if (local227 == local249.anInt5962) {
						@Pc(262) Class125 local262 = Static177.method2903(local249.anInt5964);
						if (local262.aBoolean230) {
							local207[local221] = Long.MAX_VALUE;
							this.anInt5349--;
							continue label497;
						}
					}
				}
			}
			@Pc(285) short local285 = -1;
			if (arg1.aShortArray47 != null) {
				local285 = arg1.aShortArray47[local227];
				if (local285 != -1) {
					local229 = local102.method878(local285 & 0xFFFF);
					local235 = local229.aByte87;
					local237 = local229.aByte86;
				}
			}
			@Pc(334) boolean local334 = arg1.aByteArray33 != null && arg1.aByteArray33[local227] != 0 || local229 != null && !local229.aBoolean449 | local229.aBoolean445;
			if ((local219 || local334) && arg1.aByteArray38 != null) {
				local231 += arg1.aByteArray38[local227] << 17;
			}
			if (local334) {
				local231 += 65536;
			}
			local231 += (local235 & 0xFF) << 8;
			local372 = local233 + ((local285 & 0xFFFF) << 16);
			local231 += local237 & 0xFF;
			@Pc(384) int local384 = local372 + (local221 & 0xFFFF);
			local207[local221] = (long) local384 + ((long) local231 << 32);
		}
		Static165.method2543(local207, local106);
		this.anIntArray534 = arg1.anIntArray264;
		this.aShortArray95 = arg1.aShortArray43;
		this.anIntArray539 = arg1.anIntArray265;
		this.anInt5374 = arg1.anInt2729;
		this.anIntArray536 = arg1.anIntArray261;
		this.anInt5332 = arg1.anInt2715;
		this.aClass161Array5 = arg1.aClass161Array1;
		this.aClass93Array5 = arg1.aClass93Array1;
		@Pc(443) Class269[] local443 = new Class269[this.anInt5332];
		@Pc(463) int local463;
		@Pc(477) int local477;
		if (arg1.aClass208Array1 != null) {
			this.anInt5366 = arg1.aClass208Array1.length;
			this.aClass252Array1 = new Class252[this.anInt5366];
			this.aClass266Array1 = new Class266[this.anInt5366];
			for (local463 = 0; local463 < this.anInt5366; local463++) {
				@Pc(470) Class208 local470 = arg1.aClass208Array1[local463];
				@Pc(475) Class125 local475 = Static177.method2903(local470.anInt5964);
				local477 = -1;
				for (@Pc(479) int local479 = 0; local479 < this.anInt5369; local479++) {
					if (local106[local479] == local470.anInt5962) {
						local477 = local479;
						break;
					}
				}
				if (local477 == -1) {
					throw new RuntimeException();
				}
				local242 = Static212.anIntArray347[arg1.aShortArray39[local470.anInt5962] & 0xFFFF] & 0xFFFFFF;
				local242 |= 255 - (arg1.aByteArray33 == null ? 0 : arg1.aByteArray33[local470.anInt5962]) << 24;
				this.aClass252Array1[local463] = new Class252(local477, arg1.aShortArray45[local470.anInt5962], arg1.aShortArray42[local470.anInt5962], arg1.aShortArray40[local470.anInt5962], local475.anInt3349, local475.anInt3354, local475.anInt3353, local475.anInt3350, local475.anInt3356, local475.aBoolean230, local475.aBoolean229, local470.anInt5963);
				this.aClass266Array1[local463] = new Class266(local242);
			}
		}
		local463 = this.anInt5369 * 3;
		this.aShortArray100 = new short[this.anInt5369];
		this.aShortArray99 = new short[this.anInt5369];
		Static39.aLongArray1 = new long[local463];
		this.aShortArray102 = new short[this.anInt5369];
		this.aShort95 = (short) arg3;
		this.aByteArray79 = new byte[local463];
		this.aShortArray94 = new short[local463];
		if (arg1.aShortArray41 != null) {
			this.aShortArray101 = new short[this.anInt5369];
		}
		this.aShort89 = (short) arg4;
		this.aShortArray96 = new short[this.anInt5369];
		this.aShortArray103 = new short[local463];
		this.aByteArray78 = new byte[this.anInt5369];
		this.aFloatArray36 = new float[local463];
		this.aFloatArray35 = new float[local463];
		this.aShortArray97 = new short[this.anInt5369];
		this.aShortArray104 = new short[local463];
		this.aShortArray98 = new short[local463];
		local231 = 0;
		for (local372 = 0; local372 < arg1.anInt2715; local372++) {
			local477 = this.anIntArray538[local372];
			this.anIntArray538[local372] = local231;
			local443[local372] = new Class269();
			local231 += local477;
		}
		this.anIntArray538[arg1.anInt2715] = local231;
		@Pc(710) int[] local710 = null;
		@Pc(712) int[] local712 = null;
		@Pc(714) int[] local714 = null;
		@Pc(716) float[][] local716 = null;
		@Pc(742) int local742;
		@Pc(787) int local787;
		@Pc(793) int local793;
		@Pc(806) int local806;
		@Pc(808) int local808;
		@Pc(844) int local844;
		@Pc(849) int local849;
		@Pc(1015) float local1015;
		@Pc(999) float local999;
		@Pc(1007) float local1007;
		if (arg1.aByteArray36 != null) {
			@Pc(722) int local722 = arg1.anInt2710;
			@Pc(725) int[] local725 = new int[local722];
			@Pc(728) int[] local728 = new int[local722];
			@Pc(731) int[] local731 = new int[local722];
			@Pc(734) int[] local734 = new int[local722];
			@Pc(737) int[] local737 = new int[local722];
			@Pc(740) int[] local740 = new int[local722];
			for (local742 = 0; local742 < local722; local742++) {
				local725[local742] = Integer.MAX_VALUE;
				local728[local742] = -2147483647;
				local731[local742] = Integer.MAX_VALUE;
				local734[local742] = -2147483647;
				local737[local742] = Integer.MAX_VALUE;
				local740[local742] = -2147483647;
			}
			local714 = new int[local722];
			local710 = new int[local722];
			local712 = new int[local722];
			for (local787 = 0; local787 < this.anInt5369; local787++) {
				local793 = local106[local787];
				if (arg1.aByteArray36[local793] != -1) {
					local806 = arg1.aByteArray36[local793] & 0xFF;
					for (local808 = 0; local808 < 3; local808++) {
						@Pc(820) short local820;
						if (local808 == 0) {
							local820 = arg1.aShortArray45[local793];
						} else if (local808 == 1) {
							local820 = arg1.aShortArray42[local793];
						} else {
							local820 = arg1.aShortArray40[local793];
						}
						local844 = arg1.anIntArray261[local820];
						local849 = arg1.anIntArray264[local820];
						@Pc(854) int local854 = arg1.anIntArray265[local820];
						if (local844 < local725[local806]) {
							local725[local806] = local844;
						}
						if (local844 > local728[local806]) {
							local728[local806] = local844;
						}
						if (local731[local806] > local849) {
							local731[local806] = local849;
						}
						if (local734[local806] < local849) {
							local734[local806] = local849;
						}
						if (local854 < local737[local806]) {
							local737[local806] = local854;
						}
						if (local740[local806] < local854) {
							local740[local806] = local854;
						}
					}
				}
			}
			local716 = new float[local722][];
			for (local793 = 0; local793 < local722; local793++) {
				@Pc(941) byte local941 = arg1.aByteArray37[local793];
				if (local941 > 0) {
					local710[local793] = (local728[local793] + local725[local793]) / 2;
					local712[local793] = (local734[local793] + local731[local793]) / 2;
					local714[local793] = (local737[local793] + local740[local793]) / 2;
					if (local941 == 1) {
						local849 = arg1.anIntArray266[local793];
						if (local849 == 0) {
							local1015 = 1.0F;
							local999 = 1.0F;
						} else if (local849 > 0) {
							local999 = (float) local849 / 1024.0F;
							local1015 = 1.0F;
						} else {
							local1015 = (float) -local849 / 1024.0F;
							local999 = 1.0F;
						}
						local1007 = 64.0F / (float) arg1.anIntArray267[local793];
					} else if (local941 == 2) {
						local999 = 64.0F / (float) arg1.anIntArray260[local793];
						local1007 = 64.0F / (float) arg1.anIntArray267[local793];
						local1015 = 64.0F / (float) arg1.anIntArray266[local793];
					} else {
						local999 = (float) arg1.anIntArray260[local793] / 1024.0F;
						local1015 = (float) arg1.anIntArray266[local793] / 1024.0F;
						local1007 = (float) arg1.anIntArray267[local793] / 1024.0F;
					}
					local716[local793] = Static404.method6681(local1015, arg1.aByteArray34[local793] & 0xFF, arg1.aShortArray46[local793], local999, arg1.aShortArray44[local793], local1007, arg1.aShortArray38[local793]);
				}
			}
		}
		@Pc(1127) Class180[] local1127 = new Class180[arg1.anInt2727];
		@Pc(1146) short local1146;
		@Pc(1157) int local1157;
		@Pc(1168) int local1168;
		@Pc(1230) int local1230;
		for (@Pc(1129) int local1129 = 0; local1129 < arg1.anInt2727; local1129++) {
			@Pc(1136) short local1136 = arg1.aShortArray45[local1129];
			@Pc(1141) short local1141 = arg1.aShortArray42[local1129];
			local1146 = arg1.aShortArray40[local1129];
			local1157 = this.anIntArray536[local1141] - this.anIntArray536[local1136];
			local1168 = this.anIntArray534[local1141] - this.anIntArray534[local1136];
			local742 = this.anIntArray539[local1141] - this.anIntArray539[local1136];
			local787 = this.anIntArray536[local1146] - this.anIntArray536[local1136];
			local793 = this.anIntArray534[local1146] - this.anIntArray534[local1136];
			local806 = this.anIntArray539[local1146] - this.anIntArray539[local1136];
			local808 = local806 * local1168 - local793 * local742;
			local1230 = local787 * local742 - local1157 * local806;
			local844 = local1157 * local793 - local1168 * local787;
			while (local808 > 8192 || local1230 > 8192 || local844 > 8192 || local808 < -8192 || local1230 < -8192 || local844 < -8192) {
				local808 >>= 0x1;
				local844 >>= 0x1;
				local1230 >>= 0x1;
			}
			local849 = (int) Math.sqrt((double) (local844 * local844 + local808 * local808 + local1230 * local1230));
			if (local849 <= 0) {
				local849 = 1;
			}
			local844 = local844 * 256 / local849;
			local808 = local808 * 256 / local849;
			local1230 = local1230 * 256 / local849;
			@Pc(1323) byte local1323 = arg1.aByteArray39 == null ? 0 : arg1.aByteArray39[local1129];
			if (local1323 == 0) {
				@Pc(1332) Class269 local1332 = local443[local1136];
				local1332.anInt7602 += local808;
				local1332.anInt7599 += local844;
				local1332.anInt7600++;
				local1332.anInt7601 += local1230;
				@Pc(1360) Class269 local1360 = local443[local1141];
				local1360.anInt7600++;
				local1360.anInt7602 += local808;
				local1360.anInt7601 += local1230;
				local1360.anInt7599 += local844;
				@Pc(1388) Class269 local1388 = local443[local1146];
				local1388.anInt7600++;
				local1388.anInt7602 += local808;
				local1388.anInt7601 += local1230;
				local1388.anInt7599 += local844;
			} else if (local1323 == 1) {
				@Pc(1427) Class180 local1427 = local1127[local1129] = new Class180();
				local1427.anInt5152 = local808;
				local1427.anInt5157 = local1230;
				local1427.anInt5153 = local844;
			}
		}
		@Pc(1449) int local1449;
		for (@Pc(1443) int local1443 = 0; local1443 < this.anInt5369; local1443++) {
			local1449 = local106[local1443];
			@Pc(1456) int local1456 = arg1.aShortArray39[local1449] & 0xFFFF;
			@Pc(1464) short local1464;
			if (arg1.aShortArray47 == null) {
				local1464 = -1;
			} else {
				local1464 = arg1.aShortArray47[local1449];
			}
			if (arg1.aByteArray36 == null) {
				local1168 = -1;
			} else {
				local1168 = arg1.aByteArray36[local1449];
			}
			if (arg1.aByteArray33 == null) {
				local742 = 0;
			} else {
				local742 = arg1.aByteArray33[local1449] & 0xFF;
			}
			@Pc(1496) float local1496 = 0.0F;
			@Pc(1498) float local1498 = 0.0F;
			@Pc(1500) float local1500 = 0.0F;
			local1015 = 0.0F;
			local1007 = 0.0F;
			local999 = 0.0F;
			@Pc(1508) byte local1508 = 0;
			@Pc(1510) byte local1510 = 0;
			@Pc(1512) int local1512 = 0;
			@Pc(1546) byte local1546;
			@Pc(1563) short local1563;
			@Pc(1568) short local1568;
			@Pc(1573) short local1573;
			if (local1464 != -1) {
				if (local1168 == -1) {
					local1510 = 2;
					local1015 = 1.0F;
					local1007 = 0.0F;
					local1496 = 0.0F;
					local1498 = 1.0F;
					local999 = 0.0F;
					local1508 = 1;
					local1500 = 1.0F;
				} else {
					local1168 &= 0xFF;
					local1546 = arg1.aByteArray37[local1168];
					@Pc(1553) short local1553;
					@Pc(1558) short local1558;
					@Pc(1596) float local1596;
					@Pc(1604) float local1604;
					@Pc(1612) float local1612;
					@Pc(1697) float local1697;
					@Pc(1706) float local1706;
					@Pc(1715) float local1715;
					@Pc(1723) float local1723;
					@Pc(1732) float local1732;
					@Pc(1740) float local1740;
					if (local1546 == 0) {
						local1553 = arg1.aShortArray45[local1449];
						local1558 = arg1.aShortArray42[local1449];
						local1563 = arg1.aShortArray40[local1449];
						local1568 = arg1.aShortArray38[local1168];
						local1573 = arg1.aShortArray46[local1168];
						@Pc(1578) short local1578 = arg1.aShortArray44[local1168];
						@Pc(1584) float local1584 = (float) arg1.anIntArray261[local1568];
						@Pc(1590) float local1590 = (float) arg1.anIntArray264[local1568];
						local1596 = arg1.anIntArray265[local1568];
						local1604 = (float) arg1.anIntArray261[local1573] - local1584;
						local1612 = (float) arg1.anIntArray264[local1573] - local1590;
						@Pc(1621) float local1621 = (float) arg1.anIntArray265[local1573] - local1596;
						@Pc(1629) float local1629 = (float) arg1.anIntArray261[local1578] - local1584;
						@Pc(1638) float local1638 = (float) arg1.anIntArray264[local1578] - local1590;
						@Pc(1646) float local1646 = (float) arg1.anIntArray265[local1578] - local1596;
						@Pc(1654) float local1654 = (float) arg1.anIntArray261[local1553] - local1584;
						@Pc(1663) float local1663 = (float) arg1.anIntArray264[local1553] - local1590;
						@Pc(1671) float local1671 = (float) arg1.anIntArray265[local1553] - local1596;
						@Pc(1679) float local1679 = (float) arg1.anIntArray261[local1558] - local1584;
						@Pc(1688) float local1688 = (float) arg1.anIntArray264[local1558] - local1590;
						local1697 = (float) arg1.anIntArray265[local1558] - local1596;
						local1706 = (float) arg1.anIntArray261[local1563] - local1584;
						local1715 = (float) arg1.anIntArray264[local1563] - local1590;
						local1723 = (float) arg1.anIntArray265[local1563] - local1596;
						local1732 = local1646 * local1612 - local1638 * local1621;
						local1740 = local1629 * local1621 - local1646 * local1604;
						@Pc(1749) float local1749 = local1638 * local1604 - local1629 * local1612;
						@Pc(1757) float local1757 = local1638 * local1749 - local1740 * local1646;
						@Pc(1765) float local1765 = local1732 * local1646 - local1749 * local1629;
						@Pc(1774) float local1774 = local1629 * local1740 - local1638 * local1732;
						@Pc(1788) float local1788 = 1.0F / (local1621 * local1774 + local1604 * local1757 + local1612 * local1765);
						local1500 = (local1697 * local1774 + local1679 * local1757 + local1765 * local1688) * local1788;
						local1496 = local1788 * (local1671 * local1774 + local1757 * local1654 + local1765 * local1663);
						local1007 = local1788 * (local1723 * local1774 + local1715 * local1765 + local1757 * local1706);
						@Pc(1838) float local1838 = local1621 * local1732 - local1749 * local1604;
						@Pc(1846) float local1846 = local1749 * local1612 - local1740 * local1621;
						@Pc(1854) float local1854 = local1604 * local1740 - local1732 * local1612;
						@Pc(1868) float local1868 = 1.0F / (local1846 * local1629 + local1638 * local1838 + local1854 * local1646);
						local1015 = local1868 * (local1854 * local1697 + local1846 * local1679 + local1838 * local1688);
						local1498 = local1868 * (local1854 * local1671 + local1838 * local1663 + local1654 * local1846);
						local999 = (local1706 * local1846 + local1715 * local1838 + local1854 * local1723) * local1868;
					} else {
						local1553 = arg1.aShortArray45[local1449];
						local1558 = arg1.aShortArray42[local1449];
						local1563 = arg1.aShortArray40[local1449];
						@Pc(1931) int local1931 = local710[local1168];
						@Pc(1935) int local1935 = local712[local1168];
						@Pc(1939) int local1939 = local714[local1168];
						@Pc(1943) float[] local1943 = local716[local1168];
						@Pc(1948) byte local1948 = arg1.aByteArray35[local1168];
						local1596 = (float) arg1.anIntArray262[local1168] / 256.0F;
						if (local1546 == 1) {
							local1604 = (float) arg1.anIntArray260[local1168] / 1024.0F;
							Static89.method1541(local1596, local1931, local1604, local1948, arg1.anIntArray264[local1553], local1935, local1939, local1943, arg1.anIntArray261[local1553], arg1.anIntArray265[local1553]);
							local1498 = Static274.aFloat105;
							local1496 = Static110.aFloat19;
							Static89.method1541(local1596, local1931, local1604, local1948, arg1.anIntArray264[local1558], local1935, local1939, local1943, arg1.anIntArray261[local1558], arg1.anIntArray265[local1558]);
							local1500 = Static110.aFloat19;
							local1015 = Static274.aFloat105;
							Static89.method1541(local1596, local1931, local1604, local1948, arg1.anIntArray264[local1563], local1935, local1939, local1943, arg1.anIntArray261[local1563], arg1.anIntArray265[local1563]);
							local1007 = Static110.aFloat19;
							local999 = Static274.aFloat105;
							local1612 = local1604 / 2.0F;
							if ((local1948 & 0x1) == 0) {
								if (local1500 - local1496 > local1612) {
									local1508 = 1;
									local1500 -= local1604;
								} else if (local1612 < local1496 - local1500) {
									local1500 += local1604;
									local1508 = 2;
								}
								if (local1612 < local1007 - local1496) {
									local1007 -= local1604;
									local1510 = 1;
								} else if (local1496 - local1007 > local1612) {
									local1007 += local1604;
									local1510 = 2;
								}
							} else {
								if (local1612 < local1015 - local1498) {
									local1508 = 1;
									local1015 -= local1604;
								} else if (local1498 - local1015 > local1612) {
									local1015 += local1604;
									local1508 = 2;
								}
								if (local999 - local1498 > local1612) {
									local999 -= local1604;
									local1510 = 1;
								} else if (local1498 - local999 > local1612) {
									local999 += local1604;
									local1510 = 2;
								}
							}
						} else if (local1546 == 2) {
							local1604 = (float) arg1.anIntArray268[local1168] / 256.0F;
							local1612 = (float) arg1.anIntArray263[local1168] / 256.0F;
							@Pc(2196) int local2196 = arg1.anIntArray261[local1558] - arg1.anIntArray261[local1553];
							@Pc(2207) int local2207 = arg1.anIntArray264[local1558] - arg1.anIntArray264[local1553];
							@Pc(2218) int local2218 = arg1.anIntArray265[local1558] - arg1.anIntArray265[local1553];
							@Pc(2229) int local2229 = arg1.anIntArray261[local1563] - arg1.anIntArray261[local1553];
							@Pc(2240) int local2240 = arg1.anIntArray264[local1563] - arg1.anIntArray264[local1553];
							@Pc(2251) int local2251 = arg1.anIntArray265[local1563] - arg1.anIntArray265[local1553];
							@Pc(2260) int local2260 = local2251 * local2207 - local2218 * local2240;
							@Pc(2269) int local2269 = local2218 * local2229 - local2251 * local2196;
							@Pc(2278) int local2278 = local2196 * local2240 - local2229 * local2207;
							local1697 = 64.0F / (float) arg1.anIntArray266[local1168];
							local1706 = 64.0F / (float) arg1.anIntArray267[local1168];
							local1715 = 64.0F / (float) arg1.anIntArray260[local1168];
							local1723 = (local1943[0] * (float) local2260 + local1943[1] * (float) local2269 + local1943[2] * (float) local2278) / local1697;
							local1732 = ((float) local2260 * local1943[3] + (float) local2269 * local1943[4] + local1943[5] * (float) local2278) / local1706;
							local1740 = ((float) local2260 * local1943[6] + (float) local2269 * local1943[7] + (float) local2278 * local1943[8]) / local1715;
							local1512 = Static90.method1570(local1740, local1723, local1732);
							Static341.method5167(local1512, arg1.anIntArray261[local1553], local1596, local1612, local1604, local1931, local1935, local1943, local1948, local1939, arg1.anIntArray265[local1553], arg1.anIntArray264[local1553]);
							local1496 = Static135.aFloat31;
							local1498 = Static284.aFloat108;
							Static341.method5167(local1512, arg1.anIntArray261[local1558], local1596, local1612, local1604, local1931, local1935, local1943, local1948, local1939, arg1.anIntArray265[local1558], arg1.anIntArray264[local1558]);
							local1015 = Static284.aFloat108;
							local1500 = Static135.aFloat31;
							Static341.method5167(local1512, arg1.anIntArray261[local1563], local1596, local1612, local1604, local1931, local1935, local1943, local1948, local1939, arg1.anIntArray265[local1563], arg1.anIntArray264[local1563]);
							local1007 = Static135.aFloat31;
							local999 = Static284.aFloat108;
						} else if (local1546 == 3) {
							Static58.method1109(local1939, arg1.anIntArray261[local1553], local1935, local1948, local1596, local1931, arg1.anIntArray264[local1553], arg1.anIntArray265[local1553], local1943);
							local1496 = Static242.aFloat101;
							local1498 = Static474.aFloat153;
							Static58.method1109(local1939, arg1.anIntArray261[local1558], local1935, local1948, local1596, local1931, arg1.anIntArray264[local1558], arg1.anIntArray265[local1558], local1943);
							local1500 = Static242.aFloat101;
							local1015 = Static474.aFloat153;
							Static58.method1109(local1939, arg1.anIntArray261[local1563], local1935, local1948, local1596, local1931, arg1.anIntArray264[local1563], arg1.anIntArray265[local1563], local1943);
							local999 = Static474.aFloat153;
							local1007 = Static242.aFloat101;
							if ((local1948 & 0x1) == 0) {
								if (local1500 - local1496 > 0.5F) {
									local1500--;
									local1508 = 1;
								} else if (local1496 - local1500 > 0.5F) {
									local1500++;
									local1508 = 2;
								}
								if (local1007 - local1496 > 0.5F) {
									local1510 = 1;
									local1007--;
								} else if (local1496 - local1007 > 0.5F) {
									local1007++;
									local1510 = 2;
								}
							} else {
								if (local1015 - local1498 > 0.5F) {
									local1015--;
									local1508 = 1;
								} else if (local1498 - local1015 > 0.5F) {
									local1508 = 2;
									local1015++;
								}
								if (local999 - local1498 > 0.5F) {
									local999--;
									local1510 = 1;
								} else if (local1498 - local999 > 0.5F) {
									local1510 = 2;
									local999++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray39 == null) {
				local1546 = 0;
			} else {
				local1546 = arg1.aByteArray39[local1449];
			}
			if (local1546 == 0) {
				@Pc(2811) long local2811 = (long) (local1168 << 2) + ((long) local742 + (long) (local1512 << 24) + (long) (local1456 << 8) << 32);
				local1563 = arg1.aShortArray45[local1449];
				local1568 = arg1.aShortArray42[local1449];
				local1573 = arg1.aShortArray40[local1449];
				@Pc(2830) Class269 local2830 = local443[local1563];
				this.aShortArray102[local1443] = this.method4612(local2830.anInt7600, local2830.anInt7602, local2830.anInt7601, arg1, local1498, local2811, local1496, local2830.anInt7599, local1563);
				@Pc(2854) Class269 local2854 = local443[local1568];
				this.aShortArray100[local1443] = this.method4612(local2854.anInt7600, local2854.anInt7602, local2854.anInt7601, arg1, local1015, (long) local1508 + local2811, local1500, local2854.anInt7599, local1568);
				@Pc(2881) Class269 local2881 = local443[local1573];
				this.aShortArray96[local1443] = this.method4612(local2881.anInt7600, local2881.anInt7602, local2881.anInt7601, arg1, local999, (long) local1510 + local2811, local1007, local2881.anInt7599, local1573);
			} else if (local1546 == 1) {
				@Pc(2672) Class180 local2672 = local1127[local1449];
				@Pc(2716) long local2716 = ((long) (local1456 << 8) + (long) (local1512 << 24) + (long) local742 << 32) + (long) ((local2672.anInt5153 + 256 << 22) + (local1168 << 2) + (local2672.anInt5152 <= 0 ? 2048 : 1024) + (local2672.anInt5157 + 256 << 12));
				this.aShortArray102[local1443] = this.method4612(0, local2672.anInt5152, local2672.anInt5157, arg1, local1498, local2716, local1496, local2672.anInt5153, arg1.aShortArray45[local1449]);
				this.aShortArray100[local1443] = this.method4612(0, local2672.anInt5152, local2672.anInt5157, arg1, local1015, local2716 + (long) local1508, local1500, local2672.anInt5153, arg1.aShortArray42[local1449]);
				this.aShortArray96[local1443] = this.method4612(0, local2672.anInt5152, local2672.anInt5157, arg1, local999, (long) local1510 + local2716, local1007, local2672.anInt5153, arg1.aShortArray40[local1449]);
			}
			if (arg1.aShortArray47 == null) {
				this.aShortArray99[local1443] = -1;
			} else {
				this.aShortArray99[local1443] = arg1.aShortArray47[local1449];
			}
			if (arg1.aByteArray33 != null) {
				this.aByteArray78[local1443] = arg1.aByteArray33[local1449];
			}
			if (arg1.aShortArray41 != null) {
				this.aShortArray101[local1443] = arg1.aShortArray41[local1449];
			}
			this.aShortArray97[local1443] = arg1.aShortArray39[local1449];
		}
		local1449 = 0;
		local1146 = -10000;
		for (local1157 = 0; local1157 < this.anInt5349; local1157++) {
			@Pc(2974) short local2974 = this.aShortArray99[local1157];
			if (local2974 != local1146) {
				local1449++;
				local1146 = local2974;
			}
		}
		this.anIntArray537 = new int[local1449 + 1];
		local1449 = 0;
		local1146 = -10000;
		for (local1168 = 0; local1168 < this.anInt5349; local1168++) {
			@Pc(3004) short local3004 = this.aShortArray99[local1168];
			if (local1146 != local3004) {
				local1146 = local3004;
				this.anIntArray537[local1449++] = local1168;
			}
		}
		this.anIntArray537[local1449] = this.anInt5349;
		Static39.aLongArray1 = null;
		this.aShortArray98 = Static251.method4230(this.anInt5342, this.aShortArray98);
		this.aShortArray103 = Static251.method4230(this.anInt5342, this.aShortArray103);
		this.aShortArray104 = Static251.method4230(this.anInt5342, this.aShortArray104);
		this.aByteArray79 = Static390.method4908(this.aByteArray79, this.anInt5342);
		this.aFloatArray36 = Static533.method7373(this.aFloatArray36, this.anInt5342);
		this.aFloatArray35 = Static533.method7373(this.aFloatArray35, this.anInt5342);
		if (arg1.anIntArray259 != null && Static530.method7336(arg2, this.anInt5344)) {
			this.anIntArrayArray66 = arg1.method2309(false);
		}
		if (arg1.aClass208Array1 != null && Static126.method2141(this.anInt5344, arg2)) {
			this.anIntArrayArray65 = arg1.method2316();
		}
		if (arg1.anIntArray258 != null && Static23.method7120(this.anInt5344, arg2)) {
			local742 = 0;
			@Pc(3123) int[] local3123 = new int[256];
			for (local793 = 0; local793 < this.anInt5369; local793++) {
				local806 = arg1.anIntArray258[local106[local793]];
				if (local806 >= 0) {
					if (local742 < local806) {
						local742 = local806;
					}
					@Pc(3148) int local3148 = local3123[local806]++;
				}
			}
			this.anIntArrayArray67 = new int[local742 + 1][];
			for (local806 = 0; local806 <= local742; local806++) {
				this.anIntArrayArray67[local806] = new int[local3123[local806]];
				local3123[local806] = 0;
			}
			for (local808 = 0; local808 < this.anInt5369; local808++) {
				local1230 = arg1.anIntArray258[local106[local808]];
				if (local1230 >= 0) {
					this.anIntArrayArray67[local1230][local3123[local1230]++] = local808;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "X", descriptor = "()V")
	@Override
	public void X() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5332; local7++) {
			this.anIntArray539[local7] = -this.anIntArray539[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5342; local25++) {
			this.aShortArray104[local25] = (short) -this.aShortArray104[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt5369; local48++) {
			@Pc(55) short local55 = this.aShortArray102[local48];
			this.aShortArray102[local48] = this.aShortArray96[local48];
			this.aShortArray96[local48] = local55;
		}
		if (this.aClass43_5 == null && this.aClass43_4 != null) {
			this.aClass43_4.anInterface2_1 = null;
		}
		if (this.aClass43_5 != null) {
			this.aClass43_5.anInterface2_1 = null;
		}
		if (this.aClass43_6 != null) {
			this.aClass43_6.anInterface2_1 = null;
		}
		if (this.aClass128_1 != null) {
			this.aClass128_1.anInterface10_2 = null;
		}
		this.aBoolean376 = false;
	}

	@OriginalMember(owner = "client!lr", name = "M", descriptor = "()I")
	@Override
	public int M() {
		return this.aShort95;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
	private void method4600() {
		if (!this.aBoolean375) {
			return;
		}
		this.aBoolean375 = false;
		if (this.aClass161Array5 == null && this.aClass93Array5 == null && this.aClass252Array1 == null) {
			if (this.anIntArray536 != null && !Static95.method1652(this.anInt5344, this.anInt5340)) {
				if (this.aClass43_6 != null && this.aClass43_6.anInterface2_1 == null) {
					this.aBoolean375 = true;
				} else {
					if (!this.aBoolean376) {
						this.method4608();
					}
					this.anIntArray536 = null;
				}
			}
			if (this.anIntArray534 != null && !Static510.method6254(this.anInt5344, this.anInt5340)) {
				if (this.aClass43_6 != null && this.aClass43_6.anInterface2_1 == null) {
					this.aBoolean375 = true;
				} else {
					if (!this.aBoolean376) {
						this.method4608();
					}
					this.anIntArray534 = null;
				}
			}
			if (this.anIntArray539 != null && !Static316.method4933(this.anInt5340, this.anInt5344)) {
				if (this.aClass43_6 != null && this.aClass43_6.anInterface2_1 == null) {
					this.aBoolean375 = true;
				} else {
					if (!this.aBoolean376) {
						this.method4608();
					}
					this.anIntArray539 = null;
				}
			}
		}
		if (this.aShortArray94 != null && this.anIntArray536 == null && this.anIntArray534 == null && this.anIntArray539 == null) {
			this.anIntArray538 = null;
			this.aShortArray94 = null;
		}
		if (this.aByteArray79 != null && !Static131.method2185(this.anInt5344, this.anInt5340)) {
			if (this.aClass43_5 == null) {
				if (this.aClass43_4 != null && this.aClass43_4.anInterface2_1 == null) {
					this.aBoolean375 = true;
				} else {
					this.aShortArray98 = this.aShortArray103 = this.aShortArray104 = null;
					this.aByteArray79 = null;
				}
			} else if (this.aClass43_5.anInterface2_1 == null) {
				this.aBoolean375 = true;
			} else {
				this.aByteArray79 = null;
				this.aShortArray98 = this.aShortArray103 = this.aShortArray104 = null;
			}
		}
		if (this.aShortArray97 != null && !Static99.method1676(this.anInt5344, this.anInt5340)) {
			if (this.aClass43_4 != null && this.aClass43_4.anInterface2_1 == null) {
				this.aBoolean375 = true;
			} else {
				this.aShortArray97 = null;
			}
		}
		if (this.aByteArray78 != null && !Static499.method6854(this.anInt5340, this.anInt5344)) {
			if (this.aClass43_4 != null && this.aClass43_4.anInterface2_1 == null) {
				this.aBoolean375 = true;
			} else {
				this.aByteArray78 = null;
			}
		}
		if (this.aFloatArray36 != null && !Static365.method5431(this.anInt5344, this.anInt5340)) {
			if (this.aClass43_3 != null && this.aClass43_3.anInterface2_1 == null) {
				this.aBoolean375 = true;
			} else {
				this.aFloatArray36 = this.aFloatArray35 = null;
			}
		}
		if (this.aShortArray99 != null && !Static459.method6490(this.anInt5340, this.anInt5344)) {
			if (this.aClass43_4 != null && this.aClass43_4.anInterface2_1 == null) {
				this.aBoolean375 = true;
			} else {
				this.aShortArray99 = null;
			}
		}
		if (this.aShortArray102 != null && !Static404.method6678(this.anInt5344, this.anInt5340)) {
			if (this.aClass128_1 != null && this.aClass128_1.anInterface10_2 == null || this.aClass43_4 != null && this.aClass43_4.anInterface2_1 == null) {
				this.aBoolean375 = true;
			} else {
				this.aShortArray102 = this.aShortArray100 = this.aShortArray96 = null;
			}
		}
		if (this.anIntArrayArray67 != null && !Static23.method7120(this.anInt5344, this.anInt5340)) {
			this.anIntArrayArray67 = null;
			this.aShortArray101 = null;
		}
		if (this.anIntArrayArray66 != null && !Static530.method7336(this.anInt5340, this.anInt5344)) {
			this.anIntArrayArray66 = null;
			this.aShortArray95 = null;
		}
		if (this.anIntArrayArray65 != null && !Static126.method2141(this.anInt5344, this.anInt5340)) {
			this.anIntArrayArray65 = null;
		}
		if (this.anIntArray537 != null && (this.anInt5340 & 0x800) == 0 && (this.anInt5340 & 0x40000) == 0) {
			this.anIntArray537 = null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "ea", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			local14 = arg4 << 4;
			local18 = arg3 << 4;
			local22 = arg2 << 4;
			local24 = 0;
			Static261.anInt2334 = 0;
			Static76.anInt1385 = 0;
			Static3.anInt81 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray66.length) {
					local48 = this.anIntArrayArray66[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static3.anInt81 += this.anIntArray536[local56];
						Static261.anInt2334 += this.anIntArray534[local56];
						Static76.anInt1385 += this.anIntArray539[local56];
						local24++;
					}
				}
			}
			if (local24 > 0) {
				Static261.anInt2334 = local18 + Static261.anInt2334 / local24;
				Static76.anInt1385 = Static76.anInt1385 / local24 + local14;
				Static3.anInt81 = Static3.anInt81 / local24 + local22;
			} else {
				Static261.anInt2334 = local18;
				Static76.anInt1385 = local14;
				Static3.anInt81 = local22;
			}
			return;
		}
		@Pc(158) int[] local158;
		@Pc(160) int local160;
		if (arg0 == 1) {
			local22 = arg2 << 4;
			local14 = arg4 << 4;
			local18 = arg3 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray66.length > local32) {
					local158 = this.anIntArrayArray66[local32];
					for (local160 = 0; local160 < local158.length; local160++) {
						local50 = local158[local160];
						this.anIntArray536[local50] += local22;
						this.anIntArray534[local50] += local18;
						this.anIntArray539[local50] += local14;
					}
				}
			}
			return;
		}
		@Pc(277) int local277;
		@Pc(295) int local295;
		@Pc(751) int local751;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray66.length) {
					local158 = this.anIntArrayArray66[local32];
					if ((arg5 & 0x1) == 0) {
						for (local160 = 0; local160 < local158.length; local160++) {
							local50 = local158[local160];
							this.anIntArray536[local50] -= Static3.anInt81;
							this.anIntArray534[local50] -= Static261.anInt2334;
							this.anIntArray539[local50] -= Static76.anInt1385;
							if (arg4 != 0) {
								local56 = Class310.anIntArray827[arg4];
								local277 = Class310.anIntArray826[arg4];
								local295 = this.anIntArray536[local50] * local277 + local56 * this.anIntArray534[local50] + 16383 >> 14;
								this.anIntArray534[local50] = local277 * this.anIntArray534[local50] + 16383 - local56 * this.anIntArray536[local50] >> 14;
								this.anIntArray536[local50] = local295;
							}
							if (arg2 != 0) {
								local56 = Class310.anIntArray827[arg2];
								local277 = Class310.anIntArray826[arg2];
								local295 = this.anIntArray534[local50] * local277 + 16383 - this.anIntArray539[local50] * local56 >> 14;
								this.anIntArray539[local50] = this.anIntArray534[local50] * local56 + local277 * this.anIntArray539[local50] + 16383 >> 14;
								this.anIntArray534[local50] = local295;
							}
							if (arg3 != 0) {
								local56 = Class310.anIntArray827[arg3];
								local277 = Class310.anIntArray826[arg3];
								local295 = local56 * this.anIntArray539[local50] + this.anIntArray536[local50] * local277 + 16383 >> 14;
								this.anIntArray539[local50] = local277 * this.anIntArray539[local50] + 16383 - local56 * this.anIntArray536[local50] >> 14;
								this.anIntArray536[local50] = local295;
							}
							this.anIntArray536[local50] += Static3.anInt81;
							this.anIntArray534[local50] += Static261.anInt2334;
							this.anIntArray539[local50] += Static76.anInt1385;
						}
					} else {
						for (local160 = 0; local160 < local158.length; local160++) {
							local50 = local158[local160];
							this.anIntArray536[local50] -= Static3.anInt81;
							this.anIntArray534[local50] -= Static261.anInt2334;
							this.anIntArray539[local50] -= Static76.anInt1385;
							if (arg2 != 0) {
								local56 = Class310.anIntArray827[arg2];
								local277 = Class310.anIntArray826[arg2];
								local295 = this.anIntArray534[local50] * local277 + 16383 - local56 * this.anIntArray539[local50] >> 14;
								this.anIntArray539[local50] = local277 * this.anIntArray539[local50] + local56 * this.anIntArray534[local50] + 16383 >> 14;
								this.anIntArray534[local50] = local295;
							}
							if (arg4 != 0) {
								local56 = Class310.anIntArray827[arg4];
								local277 = Class310.anIntArray826[arg4];
								local295 = local56 * this.anIntArray534[local50] + this.anIntArray536[local50] * local277 + 16383 >> 14;
								this.anIntArray534[local50] = this.anIntArray534[local50] * local277 + 16383 - this.anIntArray536[local50] * local56 >> 14;
								this.anIntArray536[local50] = local295;
							}
							if (arg3 != 0) {
								local56 = Class310.anIntArray827[arg3];
								local277 = Class310.anIntArray826[arg3];
								local295 = local56 * this.anIntArray539[local50] + local277 * this.anIntArray536[local50] + 16383 >> 14;
								this.anIntArray539[local50] = local277 * this.anIntArray539[local50] + 16383 - this.anIntArray536[local50] * local56 >> 14;
								this.anIntArray536[local50] = local295;
							}
							this.anIntArray536[local50] += Static3.anInt81;
							this.anIntArray534[local50] += Static261.anInt2334;
							this.anIntArray539[local50] += Static76.anInt1385;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray66.length > local38) {
						local48 = this.anIntArrayArray66[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local277 = this.anIntArray538[local56];
							local295 = this.anIntArray538[local56 + 1];
							for (local751 = local277; local751 < local295; local751++) {
								@Pc(760) int local760 = this.aShortArray94[local751] - 1;
								if (local760 == -1) {
									break;
								}
								@Pc(772) int local772;
								@Pc(776) int local776;
								@Pc(795) int local795;
								if (arg4 != 0) {
									local772 = Class310.anIntArray827[arg4];
									local776 = Class310.anIntArray826[arg4];
									local795 = this.aShortArray103[local760] * local772 + local776 * this.aShortArray98[local760] + 16383 >> 14;
									this.aShortArray103[local760] = (short) (this.aShortArray103[local760] * local776 + 16383 - this.aShortArray98[local760] * local772 >> 14);
									this.aShortArray98[local760] = (short) local795;
								}
								if (arg2 != 0) {
									local772 = Class310.anIntArray827[arg2];
									local776 = Class310.anIntArray826[arg2];
									local795 = local776 * this.aShortArray103[local760] + 16383 - local772 * this.aShortArray104[local760] >> 14;
									this.aShortArray104[local760] = (short) (local776 * this.aShortArray104[local760] + this.aShortArray103[local760] * local772 + 16383 >> 14);
									this.aShortArray103[local760] = (short) local795;
								}
								if (arg3 != 0) {
									local772 = Class310.anIntArray827[arg3];
									local776 = Class310.anIntArray826[arg3];
									local795 = local772 * this.aShortArray104[local760] + local776 * this.aShortArray98[local760] + 16383 >> 14;
									this.aShortArray104[local760] = (short) (local776 * this.aShortArray104[local760] + 16383 - local772 * this.aShortArray98[local760] >> 14);
									this.aShortArray98[local760] = (short) local795;
								}
							}
						}
					}
				}
				if (this.aClass43_5 == null && this.aClass43_4 != null) {
					this.aClass43_4.anInterface2_1 = null;
				}
				if (this.aClass43_5 != null) {
					this.aClass43_5.anInterface2_1 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray66.length) {
					local158 = this.anIntArrayArray66[local32];
					for (local160 = 0; local160 < local158.length; local160++) {
						local50 = local158[local160];
						this.anIntArray536[local50] -= Static3.anInt81;
						this.anIntArray534[local50] -= Static261.anInt2334;
						this.anIntArray539[local50] -= Static76.anInt1385;
						this.anIntArray536[local50] = arg2 * this.anIntArray536[local50] >> 7;
						this.anIntArray534[local50] = arg3 * this.anIntArray534[local50] >> 7;
						this.anIntArray539[local50] = arg4 * this.anIntArray539[local50] >> 7;
						this.anIntArray536[local50] += Static3.anInt81;
						this.anIntArray534[local50] += Static261.anInt2334;
						this.anIntArray539[local50] += Static76.anInt1385;
					}
				}
			}
		} else {
			@Pc(1214) Class252 local1214;
			@Pc(1219) Class266 local1219;
			if (arg0 == 5) {
				if (this.anIntArrayArray67 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray67.length) {
							local158 = this.anIntArrayArray67[local32];
							for (local160 = 0; local160 < local158.length; local160++) {
								local50 = local158[local160];
								local56 = (this.aByteArray78[local50] & 0xFF) + (arg2 * 8);
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray78[local50] = (byte) local56;
							}
							if (local158.length > 0 && this.aClass43_4 != null) {
								this.aClass43_4.anInterface2_1 = null;
							}
						}
					}
					if (this.aClass252Array1 != null) {
						for (local32 = 0; local32 < this.anInt5366; local32++) {
							local1214 = this.aClass252Array1[local32];
							local1219 = this.aClass266Array1[local32];
							local1219.anInt7528 = 255 - (this.aByteArray78[local1214.anInt7206] & 0xFF) << 24 | local1219.anInt7528 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1470) Class266 local1470;
				if (arg0 == 8) {
					if (this.anIntArrayArray65 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray65.length > local32) {
								local158 = this.anIntArrayArray65[local32];
								for (local160 = 0; local160 < local158.length; local160++) {
									local1470 = this.aClass266Array1[local158[local160]];
									local1470.anInt7535 += arg2;
									local1470.anInt7531 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray65 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray65.length) {
								local158 = this.anIntArrayArray65[local32];
								for (local160 = 0; local160 < local158.length; local160++) {
									local1470 = this.aClass266Array1[local158[local160]];
									local1470.anInt7532 = arg3 * local1470.anInt7532 >> 7;
									local1470.anInt7530 = local1470.anInt7530 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray65 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray65.length) {
							local158 = this.anIntArrayArray65[local32];
							for (local160 = 0; local160 < local158.length; local160++) {
								local1470 = this.aClass266Array1[local158[local160]];
								local1470.anInt7533 = arg2 + local1470.anInt7533 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray67 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray67.length) {
						local158 = this.anIntArrayArray67[local32];
						for (local160 = 0; local160 < local158.length; local160++) {
							local50 = local158[local160];
							local56 = this.aShortArray97[local50] & 0xFFFF;
							local277 = local56 >> 10 & 0x3F;
							local295 = local56 >> 7 & 0x7;
							local295 += arg3 / 4;
							local751 = local56 & 0x7F;
							@Pc(1315) int local1315 = local277 + arg2 & 0x3F;
							if (local295 < 0) {
								local295 = 0;
							} else if (local295 > 7) {
								local295 = 7;
							}
							local751 += arg4;
							if (local751 < 0) {
								local751 = 0;
							} else if (local751 > 127) {
								local751 = 127;
							}
							this.aShortArray97[local50] = (short) (local751 | local1315 << 10 | local295 << 7);
						}
						if (local158.length > 0 && this.aClass43_4 != null) {
							this.aClass43_4.anInterface2_1 = null;
						}
					}
				}
				if (this.aClass252Array1 != null) {
					for (local32 = 0; local32 < this.anInt5366; local32++) {
						local1214 = this.aClass252Array1[local32];
						local1219 = this.aClass266Array1[local32];
						local1219.anInt7528 = Static212.anIntArray347[this.aShortArray97[local1214.anInt7206] & 0xFFFF] & 0xFFFFFF | local1219.anInt7528 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "MA", descriptor = "()V")
	@Override
	protected void MA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5374; local7++) {
			this.anIntArray536[local7] = this.anIntArray536[local7] + 7 >> 4;
			this.anIntArray534[local7] = this.anIntArray534[local7] + 7 >> 4;
			this.anIntArray539[local7] = this.anIntArray539[local7] + 7 >> 4;
		}
		this.aBoolean376 = false;
		if (this.aClass43_6 != null) {
			this.aClass43_6.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "wa", descriptor = "()I")
	@Override
	public int wa() {
		if (!this.aBoolean376) {
			this.method4608();
		}
		return this.aShort96;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!m;Lclient!eca;II)V")
	@Override
	public void method6676(@OriginalArg(0) Class118 arg0, @OriginalArg(1) Class72_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5342 == 0) {
			return;
		}
		@Pc(16) Class118_Sub1 local16 = this.aClass122_Sub3_21.aClass118_Sub1_4;
		@Pc(19) Class118_Sub1 local19 = (Class118_Sub1) arg0;
		if (!this.aBoolean376) {
			this.method4608();
		}
		Static26.aFloat6 = local16.aFloat44 + local19.aFloat37 * local16.aFloat38 + local19.aFloat43 * local16.aFloat41 + local19.aFloat44 * local16.aFloat35;
		Static354.aFloat119 = local16.aFloat35 * local19.aFloat41 + local16.aFloat41 * local19.aFloat39 + local16.aFloat38 * local19.aFloat36;
		@Pc(72) float local72 = Static354.aFloat119 * (float) this.aShort94 + Static26.aFloat6;
		@Pc(80) float local80 = Static26.aFloat6 + Static354.aFloat119 * (float) this.aShort88;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local80 < local72) {
			local96 = (float) this.aShort92 + local72;
			local90 = local80 - (float) this.aShort92;
		} else {
			local90 = local72 - (float) this.aShort92;
			local96 = (float) this.aShort92 + local80;
		}
		if (local90 >= this.aClass122_Sub3_21.aFloat181 || local96 <= (float) this.aClass122_Sub3_21.anInt8450) {
			return;
		}
		Static347.aFloat118 = local19.aFloat41 * local16.aFloat46 + local19.aFloat39 * local16.aFloat36 + local19.aFloat36 * local16.aFloat42;
		Static131.aFloat30 = local19.aFloat37 * local16.aFloat42 + local19.aFloat43 * local16.aFloat36 + local19.aFloat44 * local16.aFloat46 + local16.aFloat37;
		@Pc(172) float local172 = Static131.aFloat30 + (float) this.aShort94 * Static347.aFloat118;
		@Pc(180) float local180 = Static131.aFloat30 + Static347.aFloat118 * (float) this.aShort88;
		@Pc(206) float local206;
		@Pc(195) float local195;
		if (local180 < local172) {
			local195 = (float) this.aClass122_Sub3_21.anInt8462 * (local172 + (float) this.aShort92);
			local206 = (float) this.aClass122_Sub3_21.anInt8462 * (local180 - (float) this.aShort92);
		} else {
			local195 = (float) this.aClass122_Sub3_21.anInt8462 * ((float) this.aShort92 + local180);
			local206 = (float) this.aClass122_Sub3_21.anInt8462 * (local172 - (float) this.aShort92);
		}
		if (this.aClass122_Sub3_21.aFloat174 <= local206 / (float) arg2 || local195 / (float) arg2 <= this.aClass122_Sub3_21.aFloat178) {
			return;
		}
		Static418.aFloat144 = local16.aFloat43 + local16.aFloat40 * local19.aFloat44 + local19.aFloat43 * local16.aFloat39 + local19.aFloat37 * local16.aFloat45;
		Static442.aFloat146 = local16.aFloat39 * local19.aFloat39 + local16.aFloat45 * local19.aFloat36 + local16.aFloat40 * local19.aFloat41;
		@Pc(297) float local297 = Static442.aFloat146 * (float) this.aShort94 + Static418.aFloat144;
		@Pc(305) float local305 = Static442.aFloat146 * (float) this.aShort88 + Static418.aFloat144;
		@Pc(332) float local332;
		@Pc(320) float local320;
		if (local297 > local305) {
			local320 = ((float) this.aShort92 + local297) * (float) this.aClass122_Sub3_21.anInt8459;
			local332 = (float) this.aClass122_Sub3_21.anInt8459 * ((float) -this.aShort92 + local305);
		} else {
			local320 = ((float) this.aShort92 + local305) * (float) this.aClass122_Sub3_21.anInt8459;
			local332 = (float) this.aClass122_Sub3_21.anInt8459 * ((float) -this.aShort92 + local297);
		}
		if (local332 / (float) arg2 >= this.aClass122_Sub3_21.aFloat177 || local320 / (float) arg2 <= this.aClass122_Sub3_21.aFloat164) {
			return;
		}
		if (arg1 != null || this.aClass252Array1 != null) {
			Static487.aFloat155 = local19.aFloat35 * local16.aFloat46 + local19.aFloat40 * local16.aFloat36 + local19.aFloat46 * local16.aFloat42;
			Static401.aFloat141 = local19.aFloat40 * local16.aFloat39 + local19.aFloat46 * local16.aFloat45 + local19.aFloat35 * local16.aFloat40;
			Static192.aFloat52 = local19.aFloat42 * local16.aFloat38 + local16.aFloat41 * local19.aFloat45 + local16.aFloat35 * local19.aFloat38;
			Static237.aFloat100 = local16.aFloat46 * local19.aFloat38 + local19.aFloat45 * local16.aFloat36 + local19.aFloat42 * local16.aFloat42;
			Static127.aFloat95 = local19.aFloat35 * local16.aFloat35 + local16.aFloat41 * local19.aFloat40 + local16.aFloat38 * local19.aFloat46;
			Static229.aFloat97 = local19.aFloat38 * local16.aFloat40 + local19.aFloat45 * local16.aFloat39 + local16.aFloat45 * local19.aFloat42;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.aShort96 + this.aShort91 >> 1;
			@Pc(509) int local509 = this.aShort93 + this.aShort90 >> 1;
			@Pc(528) int local528 = (int) ((float) local509 * Static487.aFloat155 + (float) this.aShort94 * Static347.aFloat118 + Static131.aFloat30 + Static237.aFloat100 * (float) local500);
			@Pc(547) int local547 = (int) (Static401.aFloat141 * (float) local509 + (float) this.aShort94 * Static442.aFloat146 + (float) local500 * Static229.aFloat97 + Static418.aFloat144);
			@Pc(566) int local566 = (int) (Static26.aFloat6 + Static192.aFloat52 * (float) local500 + Static354.aFloat119 * (float) this.aShort94 + Static127.aFloat95 * (float) local509);
			@Pc(585) int local585 = (int) ((float) local509 * Static487.aFloat155 + (float) local500 * Static237.aFloat100 + Static131.aFloat30 + (float) this.aShort88 * Static347.aFloat118);
			@Pc(604) int local604 = (int) ((float) local509 * Static401.aFloat141 + (float) this.aShort88 * Static442.aFloat146 + (float) local500 * Static229.aFloat97 + Static418.aFloat144);
			arg1.anInt2131 = this.aClass122_Sub3_21.anInt8459 * local547 / arg2 + this.aClass122_Sub3_21.anInt8429;
			@Pc(636) int local636 = (int) ((float) this.aShort88 * Static354.aFloat119 + (float) local500 * Static192.aFloat52 + Static26.aFloat6 + (float) local509 * Static127.aFloat95);
			arg1.anInt2133 = this.aClass122_Sub3_21.anInt8429 + this.aClass122_Sub3_21.anInt8459 * local604 / arg2;
			arg1.anInt2130 = this.aClass122_Sub3_21.anInt8438 + this.aClass122_Sub3_21.anInt8462 * local528 / arg2;
			arg1.anInt2132 = this.aClass122_Sub3_21.anInt8462 * local585 / arg2 + this.aClass122_Sub3_21.anInt8438;
			if (local566 < this.aClass122_Sub3_21.anInt8450 && local636 < this.aClass122_Sub3_21.anInt8450) {
				arg1.aBoolean129 = true;
				arg1.anInt2129 = this.aClass122_Sub3_21.anInt8462 * (local528 + this.aShort92) / arg2 + this.aClass122_Sub3_21.anInt8438 - arg1.anInt2130;
			}
		}
		this.aClass122_Sub3_21.method6873((float) arg2);
		this.aClass122_Sub3_21.method6918();
		this.aClass122_Sub3_21.method6927(local19);
		this.method4603();
		this.aClass122_Sub3_21.method6908();
		this.method4604();
	}

	@OriginalMember(owner = "client!lr", name = "va", descriptor = "()I")
	@Override
	public int va() {
		if (!this.aBoolean376) {
			this.method4608();
		}
		return this.aShort91;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZI)V")
	private void method4601(@OriginalArg(0) boolean arg0) {
		if (this.aClass122_Sub3_21.aClass1_Sub6_Sub1_3.aByteArray66.length < this.anInt5349 * 6) {
			this.aClass122_Sub3_21.aClass1_Sub6_Sub1_3 = new Class1_Sub6_Sub1(this.anInt5349 * 6 + 600);
		} else {
			this.aClass122_Sub3_21.aClass1_Sub6_Sub1_3.anInt4555 = 0;
		}
		@Pc(38) Class1_Sub6_Sub1 local38 = this.aClass122_Sub3_21.aClass1_Sub6_Sub1_3;
		@Pc(44) int local44;
		if (this.aClass122_Sub3_21.aBoolean594) {
			for (local44 = 0; local44 < this.anInt5349; local44++) {
				local38.method3919(this.aShortArray102[local44]);
				local38.method3919(this.aShortArray100[local44]);
				local38.method3919(this.aShortArray96[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt5349; local44++) {
				local38.method3971(this.aShortArray102[local44]);
				local38.method3971(this.aShortArray100[local44]);
				local38.method3971(this.aShortArray96[local44]);
			}
		}
		if (local38.anInt4555 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface10_3 == null) {
				this.anInterface10_3 = this.aClass122_Sub3_21.method6901(local38.aByteArray66, local38.anInt4555, true);
			} else {
				this.anInterface10_3.method6550(local38.aByteArray66, local38.anInt4555);
			}
			this.aClass128_1.anInterface10_2 = this.anInterface10_3;
		} else {
			this.aClass128_1.anInterface10_2 = this.aClass122_Sub3_21.method6901(local38.aByteArray66, local38.anInt4555, false);
		}
		if (!arg0) {
			this.aBoolean375 = true;
		}
	}

	@OriginalMember(owner = "client!lr", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		if (!this.aBoolean376) {
			this.method4608();
		}
		return this.aShort93;
	}

	@OriginalMember(owner = "client!lr", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5332; local7++) {
			if (arg0 != 128) {
				this.anIntArray536[local7] = this.anIntArray536[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray534[local7] = arg1 * this.anIntArray534[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray539[local7] = this.anIntArray539[local7] * arg2 >> 7;
			}
		}
		this.aBoolean376 = false;
		if (this.aClass43_6 != null) {
			this.aClass43_6.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "OA", descriptor = "(I)V")
	@Override
	public void OA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class310.anIntArray827[arg0];
		@Pc(13) int local13 = Class310.anIntArray826[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5332; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray536[local15] + this.anIntArray539[local15] * local9 >> 14;
			this.anIntArray539[local15] = this.anIntArray539[local15] * local13 - this.anIntArray536[local15] * local9 >> 14;
			this.anIntArray536[local15] = local33;
		}
		if (this.aClass43_6 != null) {
			this.aClass43_6.anInterface2_1 = null;
		}
		this.aBoolean376 = false;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method4602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > arg4 && arg6 > arg4 && arg7 > arg4) {
			return false;
		} else if (arg2 < arg4 && arg6 < arg4 && arg4 > arg7) {
			return false;
		} else if (arg1 > arg0 && arg0 < arg3 && arg5 > arg0) {
			return false;
		} else {
			return arg1 >= arg0 || arg3 >= arg0 || arg0 <= arg5;
		}
	}

	@OriginalMember(owner = "client!lr", name = "q", descriptor = "(I)V")
	@Override
	public void q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class310.anIntArray827[arg0];
		@Pc(13) int local13 = Class310.anIntArray826[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5332; local15++) {
			local33 = this.anIntArray539[local15] * local9 + local13 * this.anIntArray536[local15] >> 14;
			this.anIntArray539[local15] = local13 * this.anIntArray539[local15] - this.anIntArray536[local15] * local9 >> 14;
			this.anIntArray536[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt5342; local33++) {
			@Pc(84) int local84 = this.aShortArray104[local33] * local9 + local13 * this.aShortArray98[local33] >> 14;
			this.aShortArray104[local33] = (short) (this.aShortArray104[local33] * local13 - this.aShortArray98[local33] * local9 >> 14);
			this.aShortArray98[local33] = (short) local84;
		}
		if (this.aClass43_5 == null && this.aClass43_4 != null) {
			this.aClass43_4.anInterface2_1 = null;
		}
		if (this.aClass43_5 != null) {
			this.aClass43_5.anInterface2_1 = null;
		}
		this.aBoolean376 = false;
		if (this.aClass43_6 != null) {
			this.aClass43_6.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "BA", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			Static261.anInt2334 = 0;
			Static76.anInt1385 = 0;
			local28 = 0;
			Static3.anInt81 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray66.length > local38) {
					local52 = this.anIntArrayArray66[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray95 == null || (this.aShortArray95[local60] & arg6) != 0) {
							Static3.anInt81 += this.anIntArray536[local60];
							Static261.anInt2334 += this.anIntArray534[local60];
							Static76.anInt1385 += this.anIntArray539[local60];
							local28++;
						}
					}
				}
			}
			if (local28 > 0) {
				Static76.anInt1385 = arg4 + Static76.anInt1385 / local28;
				Static3.anInt81 = arg2 + Static3.anInt81 / local28;
				Static64.aBoolean73 = true;
				Static261.anInt2334 = arg3 + Static261.anInt2334 / local28;
			} else {
				Static3.anInt81 = arg2;
				Static76.anInt1385 = arg4;
				Static261.anInt2334 = arg3;
			}
			return;
		}
		@Pc(250) int[] local250;
		@Pc(252) int local252;
		if (arg0 == 1) {
			if (arg7 != null) {
				local28 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
				local32 = arg2 * arg7[3] + arg7[4] * arg3 + arg4 * arg7[5] + 8192 >> 14;
				local38 = arg4 * arg7[8] + arg2 * arg7[6] + arg3 * arg7[7] + 8192 >> 14;
				arg2 = local28;
				arg3 = local32;
				arg4 = local38;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray66.length > local32) {
					local250 = this.anIntArrayArray66[local32];
					for (local252 = 0; local252 < local250.length; local252++) {
						local54 = local250[local252];
						if (this.aShortArray95 == null || (arg6 & this.aShortArray95[local54]) != 0) {
							this.anIntArray536[local54] += arg2;
							this.anIntArray534[local54] += arg3;
							this.anIntArray539[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(381) int local381;
		@Pc(403) int local403;
		@Pc(433) int local433;
		@Pc(460) int local460;
		@Pc(464) int local464;
		@Pc(468) int local468;
		@Pc(472) int local472;
		@Pc(480) int local480;
		@Pc(488) int local488;
		@Pc(645) int local645;
		@Pc(671) int local671;
		@Pc(675) int local675;
		@Pc(684) int local684;
		@Pc(689) int local689;
		@Pc(693) int local693;
		@Pc(697) int local697;
		@Pc(699) int local699;
		@Pc(830) int[] local830;
		@Pc(832) int local832;
		@Pc(836) int local836;
		@Pc(840) int local840;
		@Pc(842) int local842;
		@Pc(973) int local973;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray66.length) {
						local250 = this.anIntArrayArray66[local32];
						for (local252 = 0; local252 < local250.length; local252++) {
							local54 = local250[local252];
							if (this.aShortArray95 == null || (arg6 & this.aShortArray95[local54]) != 0) {
								this.anIntArray536[local54] -= Static3.anInt81;
								this.anIntArray534[local54] -= Static261.anInt2334;
								this.anIntArray539[local54] -= Static76.anInt1385;
								if (arg4 != 0) {
									local60 = Class310.anIntArray827[arg4];
									local381 = Class310.anIntArray826[arg4];
									local403 = local60 * this.anIntArray534[local54] + local381 * this.anIntArray536[local54] + 16383 >> 14;
									this.anIntArray534[local54] = local381 * this.anIntArray534[local54] + 16383 - local60 * this.anIntArray536[local54] >> 14;
									this.anIntArray536[local54] = local403;
								}
								if (arg2 != 0) {
									local60 = Class310.anIntArray827[arg2];
									local381 = Class310.anIntArray826[arg2];
									local403 = local381 * this.anIntArray534[local54] + 16383 - local60 * this.anIntArray539[local54] >> 14;
									this.anIntArray539[local54] = this.anIntArray539[local54] * local381 + this.anIntArray534[local54] * local60 + 16383 >> 14;
									this.anIntArray534[local54] = local403;
								}
								if (arg3 != 0) {
									local60 = Class310.anIntArray827[arg3];
									local381 = Class310.anIntArray826[arg3];
									local403 = this.anIntArray536[local54] * local381 + local60 * this.anIntArray539[local54] + 16383 >> 14;
									this.anIntArray539[local54] = local381 * this.anIntArray539[local54] + 16383 - this.anIntArray536[local54] * local60 >> 14;
									this.anIntArray536[local54] = local403;
								}
								this.anIntArray536[local54] += Static3.anInt81;
								this.anIntArray534[local54] += Static261.anInt2334;
								this.anIntArray539[local54] += Static76.anInt1385;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray66.length > local38) {
							local52 = this.anIntArrayArray66[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray95 == null || (this.aShortArray95[local60] & arg6) != 0) {
									local381 = this.anIntArray538[local60];
									local403 = this.anIntArray538[local60 + 1];
									for (local433 = local381; local433 < local403; local433++) {
										local460 = this.aShortArray94[local433] - 1;
										if (local460 == -1) {
											break;
										}
										if (arg4 != 0) {
											local464 = Class310.anIntArray827[arg4];
											local468 = Class310.anIntArray826[arg4];
											local472 = this.aShortArray98[local460] * local468 + local464 * this.aShortArray103[local460] + 16383 >> 14;
											this.aShortArray103[local460] = (short) (this.aShortArray103[local460] * local468 + 16383 - local464 * this.aShortArray98[local460] >> 14);
											this.aShortArray98[local460] = (short) local472;
										}
										if (arg2 != 0) {
											local464 = Class310.anIntArray827[arg2];
											local468 = Class310.anIntArray826[arg2];
											local472 = local468 * this.aShortArray103[local460] + 16383 - local464 * this.aShortArray104[local460] >> 14;
											this.aShortArray104[local460] = (short) (local464 * this.aShortArray103[local460] + local468 * this.aShortArray104[local460] + 16383 >> 14);
											this.aShortArray103[local460] = (short) local472;
										}
										if (arg3 != 0) {
											local464 = Class310.anIntArray827[arg3];
											local468 = Class310.anIntArray826[arg3];
											local472 = this.aShortArray104[local460] * local464 + local468 * this.aShortArray98[local460] + 16383 >> 14;
											this.aShortArray104[local460] = (short) (this.aShortArray104[local460] * local468 + 16383 - local464 * this.aShortArray98[local460] >> 14);
											this.aShortArray98[local460] = (short) local472;
										}
									}
								}
							}
						}
					}
					if (this.aClass43_5 == null && this.aClass43_4 != null) {
						this.aClass43_4.anInterface2_1 = null;
					}
					if (this.aClass43_5 != null) {
						this.aClass43_5.anInterface2_1 = null;
					}
				}
			} else {
				local28 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local252 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static64.aBoolean73) {
					local381 = arg7[6] * Static76.anInt1385 + arg7[0] * Static3.anInt81 + Static261.anInt2334 * arg7[3] + 8192 >> 14;
					local403 = Static76.anInt1385 * arg7[7] + arg7[1] * Static3.anInt81 + arg7[4] * Static261.anInt2334 + 8192 >> 14;
					local381 += local252;
					local403 += local54;
					local433 = Static3.anInt81 * arg7[2] + Static261.anInt2334 * arg7[5] + arg7[8] * Static76.anInt1385 + 8192 >> 14;
					local433 += local60;
					Static3.anInt81 = local381;
					Static261.anInt2334 = local403;
					Static76.anInt1385 = local433;
					Static64.aBoolean73 = false;
				}
				@Pc(448) int[] local448 = new int[9];
				local403 = Class310.anIntArray826[arg2];
				local433 = Class310.anIntArray827[arg2];
				local460 = Class310.anIntArray826[arg3];
				local464 = Class310.anIntArray827[arg3];
				local468 = Class310.anIntArray826[arg4];
				local472 = Class310.anIntArray827[arg4];
				local480 = local468 * local433 + 8192 >> 14;
				local488 = local472 * local433 + 8192 >> 14;
				local448[6] = local460 * local488 + -local464 * local468 + 8192 >> 14;
				local448[4] = local403 * local468 + 8192 >> 14;
				local448[7] = local472 * local464 + local480 * local460 + 8192 >> 14;
				local448[2] = local403 * local464 + 8192 >> 14;
				local448[0] = local464 * local488 + local468 * local460 + 8192 >> 14;
				local448[8] = local403 * local460 + 8192 >> 14;
				local448[3] = local403 * local472 + 8192 >> 14;
				local448[1] = -local460 * local472 + local480 * local464 + 8192 >> 14;
				local448[5] = -local433;
				@Pc(618) int local618 = -Static3.anInt81 * local448[0] + local448[1] * -Static261.anInt2334 + local448[2] * -Static76.anInt1385 + 8192 >> 14;
				local645 = -Static3.anInt81 * local448[3] + local448[4] * -Static261.anInt2334 + -Static76.anInt1385 * local448[5] + 8192 >> 14;
				local671 = local448[6] * -Static3.anInt81 + local448[7] * -Static261.anInt2334 + -Static76.anInt1385 * local448[8] + 8192 >> 14;
				local675 = Static3.anInt81 + local618;
				@Pc(680) int local680 = local645 + Static261.anInt2334;
				local684 = Static76.anInt1385 + local671;
				@Pc(687) int[] local687 = new int[9];
				for (local689 = 0; local689 < 3; local689++) {
					for (local693 = 0; local693 < 3; local693++) {
						local697 = 0;
						for (local699 = 0; local699 < 3; local699++) {
							local697 += local448[local689 * 3 + local699] * arg7[local693 * 3 + local699];
						}
						local687[local689 * 3 + local693] = local697 + 8192 >> 14;
					}
				}
				local693 = local448[1] * local54 + local252 * local448[0] + local60 * local448[2] + 8192 >> 14;
				local697 = local448[5] * local60 + local448[4] * local54 + local252 * local448[3] + 8192 >> 14;
				local699 = local252 * local448[6] + local54 * local448[7] + local60 * local448[8] + 8192 >> 14;
				local693 += local675;
				local697 += local680;
				local699 += local684;
				local830 = new int[9];
				for (local832 = 0; local832 < 3; local832++) {
					for (local836 = 0; local836 < 3; local836++) {
						local840 = 0;
						for (local842 = 0; local842 < 3; local842++) {
							local840 += local687[local842 * 3 + local836] * arg7[local832 * 3 + local842];
						}
						local830[local836 + local832 * 3] = local840 + 8192 >> 14;
					}
				}
				local836 = local697 * arg7[1] + arg7[0] * local693 + arg7[2] * local699 + 8192 >> 14;
				local840 = local699 * arg7[5] + arg7[3] * local693 + arg7[4] * local697 + 8192 >> 14;
				local840 += local32;
				local842 = arg7[6] * local693 + arg7[7] * local697 + local699 * arg7[8] + 8192 >> 14;
				local836 += local28;
				local842 += local38;
				for (local973 = 0; local973 < local8; local973++) {
					@Pc(979) int local979 = arg1[local973];
					if (local979 < this.anIntArrayArray66.length) {
						@Pc(993) int[] local993 = this.anIntArrayArray66[local979];
						for (@Pc(995) int local995 = 0; local995 < local993.length; local995++) {
							@Pc(1001) int local1001 = local993[local995];
							if (this.aShortArray95 == null || (this.aShortArray95[local1001] & arg6) != 0) {
								@Pc(1045) int local1045 = this.anIntArray539[local1001] * local830[2] + this.anIntArray534[local1001] * local830[1] + this.anIntArray536[local1001] * local830[0] + 8192 >> 14;
								@Pc(1078) int local1078 = local830[3] * this.anIntArray536[local1001] + local830[4] * this.anIntArray534[local1001] + this.anIntArray539[local1001] * local830[5] + 8192 >> 14;
								@Pc(1082) int local1082 = local1078 + local840;
								@Pc(1086) int local1086 = local1045 + local836;
								@Pc(1118) int local1118 = this.anIntArray539[local1001] * local830[8] + local830[6] * this.anIntArray536[local1001] + this.anIntArray534[local1001] * local830[7] + 8192 >> 14;
								@Pc(1122) int local1122 = local1118 + local842;
								this.anIntArray536[local1001] = local1086;
								this.anIntArray534[local1001] = local1082;
								this.anIntArray539[local1001] = local1122;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2600) Class252 local2600;
			@Pc(2605) Class266 local2605;
			if (arg0 == 5) {
				if (this.anIntArrayArray67 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray67.length) {
							local250 = this.anIntArrayArray67[local32];
							for (local252 = 0; local252 < local250.length; local252++) {
								local54 = local250[local252];
								if (this.aShortArray101 == null || (this.aShortArray101[local54] & arg6) != 0) {
									local60 = (this.aByteArray78[local54] & 0xFF) + arg2 * 8;
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray78[local54] = (byte) local60;
									if (this.aClass43_4 != null) {
										this.aClass43_4.anInterface2_1 = null;
									}
								}
							}
						}
					}
					if (this.aClass252Array1 != null) {
						for (local32 = 0; local32 < this.anInt5366; local32++) {
							local2600 = this.aClass252Array1[local32];
							local2605 = this.aClass266Array1[local32];
							local2605.anInt7528 = 255 - (this.aByteArray78[local2600.anInt7206] & 0xFF) << 24 | local2605.anInt7528 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2855) Class266 local2855;
				if (arg0 == 8) {
					if (this.anIntArrayArray65 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray65.length) {
								local250 = this.anIntArrayArray65[local32];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2855 = this.aClass266Array1[local250[local252]];
									local2855.anInt7535 += arg2;
									local2855.anInt7531 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray65 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray65.length) {
								local250 = this.anIntArrayArray65[local32];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2855 = this.aClass266Array1[local250[local252]];
									local2855.anInt7532 = arg3 * local2855.anInt7532 >> 7;
									local2855.anInt7530 = arg2 * local2855.anInt7530 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray65 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray65.length) {
							local250 = this.anIntArrayArray65[local32];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2855 = this.aClass266Array1[local250[local252]];
								local2855.anInt7533 = local2855.anInt7533 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray67 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray67.length > local32) {
						local250 = this.anIntArrayArray67[local32];
						for (local252 = 0; local252 < local250.length; local252++) {
							local54 = local250[local252];
							if (this.aShortArray101 == null || (arg6 & this.aShortArray101[local54]) != 0) {
								local60 = this.aShortArray97[local54] & 0xFFFF;
								local381 = local60 >> 10 & 0x3F;
								local403 = local60 >> 7 & 0x7;
								local433 = local60 & 0x7F;
								local403 += arg3 / 4;
								@Pc(2714) int local2714 = local381 + arg2 & 0x3F;
								local433 += arg4;
								if (local403 < 0) {
									local403 = 0;
								} else if (local403 > 7) {
									local403 = 7;
								}
								if (local433 < 0) {
									local433 = 0;
								} else if (local433 > 127) {
									local433 = 127;
								}
								this.aShortArray97[local54] = (short) (local403 << 7 | local2714 << 10 | local433);
								if (this.aClass43_4 != null) {
									this.aClass43_4.anInterface2_1 = null;
								}
							}
						}
					}
				}
				if (this.aClass252Array1 != null) {
					for (local32 = 0; local32 < this.anInt5366; local32++) {
						local2600 = this.aClass252Array1[local32];
						local2605 = this.aClass266Array1[local32];
						local2605.anInt7528 = local2605.anInt7528 & 0xFF000000 | Static212.anIntArray347[this.aShortArray97[local2600.anInt7206] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray66.length > local32) {
					local250 = this.anIntArrayArray66[local32];
					for (local252 = 0; local252 < local250.length; local252++) {
						local54 = local250[local252];
						if (this.aShortArray95 == null || (this.aShortArray95[local54] & arg6) != 0) {
							this.anIntArray536[local54] -= Static3.anInt81;
							this.anIntArray534[local54] -= Static261.anInt2334;
							this.anIntArray539[local54] -= Static76.anInt1385;
							this.anIntArray536[local54] = arg2 * this.anIntArray536[local54] >> 7;
							this.anIntArray534[local54] = this.anIntArray534[local54] * arg3 >> 7;
							this.anIntArray539[local54] = arg4 * this.anIntArray539[local54] >> 7;
							this.anIntArray536[local54] += Static3.anInt81;
							this.anIntArray534[local54] += Static261.anInt2334;
							this.anIntArray539[local54] += Static76.anInt1385;
						}
					}
				}
			}
		} else {
			local28 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local252 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static64.aBoolean73) {
				local381 = arg7[3] * Static261.anInt2334 + arg7[0] * Static3.anInt81 + Static76.anInt1385 * arg7[6] + 8192 >> 14;
				local403 = arg7[7] * Static76.anInt1385 + Static261.anInt2334 * arg7[4] + arg7[1] * Static3.anInt81 + 8192 >> 14;
				local381 += local252;
				local433 = Static76.anInt1385 * arg7[8] + Static261.anInt2334 * arg7[5] + arg7[2] * Static3.anInt81 + 8192 >> 14;
				local403 += local54;
				Static261.anInt2334 = local403;
				Static3.anInt81 = local381;
				local433 += local60;
				Static76.anInt1385 = local433;
				Static64.aBoolean73 = false;
			}
			local381 = arg2 << 15 >> 7;
			local403 = arg3 << 15 >> 7;
			local433 = arg4 << 15 >> 7;
			local460 = local381 * -Static3.anInt81 + 8192 >> 14;
			local464 = -Static261.anInt2334 * local403 + 8192 >> 14;
			local468 = -Static76.anInt1385 * local433 + 8192 >> 14;
			local472 = local460 + Static3.anInt81;
			local480 = local464 + Static261.anInt2334;
			local488 = Static76.anInt1385 + local468;
			@Pc(2027) int[] local2027 = new int[] { arg7[0] * local381 + 8192 >> 14, local381 * arg7[3] + 8192 >> 14, arg7[6] * local381 + 8192 >> 14, arg7[1] * local403 + 8192 >> 14, local403 * arg7[4] + 8192 >> 14, local403 * arg7[7] + 8192 >> 14, local433 * arg7[2] + 8192 >> 14, arg7[5] * local433 + 8192 >> 14, arg7[8] * local433 + 8192 >> 14 };
			local645 = local252 * local381 + 8192 >> 14;
			local671 = local403 * local54 + 8192 >> 14;
			@Pc(2155) int local2155 = local645 + local472;
			@Pc(2159) int local2159 = local671 + local480;
			local675 = local433 * local60 + 8192 >> 14;
			@Pc(2171) int local2171 = local675 + local488;
			@Pc(2174) int[] local2174 = new int[9];
			@Pc(2180) int local2180;
			for (local684 = 0; local684 < 3; local684++) {
				for (local2180 = 0; local2180 < 3; local2180++) {
					local689 = 0;
					for (local693 = 0; local693 < 3; local693++) {
						local689 += local2027[local693 * 3 + local2180] * arg7[local693 + local684 * 3];
					}
					local2174[local684 * 3 + local2180] = local689 + 8192 >> 14;
				}
			}
			local2180 = arg7[1] * local2159 + arg7[0] * local2155 + arg7[2] * local2171 + 8192 >> 14;
			local689 = arg7[5] * local2171 + local2155 * arg7[3] + local2159 * arg7[4] + 8192 >> 14;
			local2180 += local28;
			local689 += local32;
			local693 = local2155 * arg7[6] + local2159 * arg7[7] + arg7[8] * local2171 + 8192 >> 14;
			local693 += local38;
			for (local697 = 0; local697 < local8; local697++) {
				local699 = arg1[local697];
				if (this.anIntArrayArray66.length > local699) {
					local830 = this.anIntArrayArray66[local699];
					for (local832 = 0; local832 < local830.length; local832++) {
						local836 = local830[local832];
						if (this.aShortArray95 == null || (arg6 & this.aShortArray95[local836]) != 0) {
							local840 = local2174[1] * this.anIntArray534[local836] + this.anIntArray536[local836] * local2174[0] + this.anIntArray539[local836] * local2174[2] + 8192 >> 14;
							local842 = local2174[4] * this.anIntArray534[local836] + local2174[3] * this.anIntArray536[local836] + local2174[5] * this.anIntArray539[local836] + 8192 >> 14;
							@Pc(2419) int local2419 = local842 + local689;
							local973 = local2174[8] * this.anIntArray539[local836] + this.anIntArray534[local836] * local2174[7] + this.anIntArray536[local836] * local2174[6] + 8192 >> 14;
							@Pc(2454) int local2454 = local840 + local2180;
							@Pc(2458) int local2458 = local973 + local693;
							this.anIntArray536[local836] = local2454;
							this.anIntArray534[local836] = local2419;
							this.anIntArray539[local836] = local2458;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
	private void method4603() {
		if (this.anInt5349 == 0) {
			return;
		}
		if (this.aByte66 != 0) {
			this.method4607(true);
		}
		this.method4607(false);
		if (this.aClass128_1 != null) {
			if (this.aClass128_1.anInterface10_2 == null) {
				this.method4601((this.aByte66 & 0x10) != 0);
			}
			if (this.aClass128_1.anInterface10_2 != null) {
				this.aClass122_Sub3_21.method6896(this.aClass43_5 != null);
				this.aClass122_Sub3_21.method6890(this.aClass43_3, this.aClass43_6, this.aClass43_5, this.aClass43_4);
				@Pc(74) int local74 = this.anIntArray537.length - 1;
				for (@Pc(76) int local76 = 0; local76 < local74; local76++) {
					@Pc(83) int local83 = this.anIntArray537[local76];
					@Pc(90) int local90 = this.anIntArray537[local76 + 1];
					@Pc(97) int local97 = this.aShortArray99[local83] & 0xFFFF;
					if (local97 == 65535) {
						local97 = -1;
					}
					this.aClass122_Sub3_21.method6879(local97, this.aClass43_5 != null);
					this.aClass122_Sub3_21.method6889((local90 - local83) * 3, this.aClass128_1.anInterface10_2, local83 * 3);
				}
			}
		}
		this.method4600();
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
	private void method4604() {
		if (this.aClass252Array1 == null) {
			return;
		}
		@Pc(13) Class118_Sub1 local13 = this.aClass122_Sub3_21.aClass118_Sub1_2;
		@Pc(17) float local17 = this.aClass122_Sub3_21.method6863();
		@Pc(21) float local21 = this.aClass122_Sub3_21.method6912();
		this.aClass122_Sub3_21.method6880();
		this.aClass122_Sub3_21.method7271(false);
		this.aClass122_Sub3_21.method6896(false);
		this.aClass122_Sub3_21.method6890(this.aClass122_Sub3_21.aClass43_16, this.aClass122_Sub3_21.aClass43_15, null, null);
		for (@Pc(48) int local48 = 0; local48 < this.anInt5366; local48++) {
			@Pc(55) Class252 local55 = this.aClass252Array1[local48];
			@Pc(60) Class266 local60 = this.aClass266Array1[local48];
			if (!local55.aBoolean519 || !this.aClass122_Sub3_21.method7215()) {
				@Pc(89) float local89 = (float) (this.anIntArray536[local55.anInt7211] + this.anIntArray536[local55.anInt7210] + this.anIntArray536[local55.anInt7209]) * 0.3333333F;
				@Pc(110) float local110 = (float) (this.anIntArray534[local55.anInt7210] + this.anIntArray534[local55.anInt7209] + this.anIntArray534[local55.anInt7211]) * 0.3333333F;
				@Pc(132) float local132 = (float) (this.anIntArray539[local55.anInt7211] + this.anIntArray539[local55.anInt7210] + this.anIntArray539[local55.anInt7209]) * 0.3333333F;
				@Pc(146) float local146 = Static131.aFloat30 + Static347.aFloat118 * local110 + Static237.aFloat100 * local89 + Static487.aFloat155 * local132;
				@Pc(160) float local160 = Static418.aFloat144 + Static401.aFloat141 * local132 + local110 * Static442.aFloat146 + Static229.aFloat97 * local89;
				@Pc(174) float local174 = Static26.aFloat6 + local110 * Static354.aFloat119 + local89 * Static192.aFloat52 + local132 * Static127.aFloat95;
				local13.method2636(local55.aShort121 * local60.anInt7532 >> 7, local146 + (float) local60.anInt7535, local55.aShort120 * local60.anInt7530 >> 7, local60.anInt7533, -local174, (float) local60.anInt7531 - local160);
				this.aClass122_Sub3_21.method6862(local13);
				this.aClass122_Sub3_21.la(local21, local17 - (float) local55.anInt7207 * 1.5F);
				@Pc(226) int local226 = local60.anInt7528;
				OpenGL.glColor4ub((byte) (local226 >> 16), (byte) (local226 >> 8), (byte) local226, (byte) (local226 >> 24));
				this.aClass122_Sub3_21.method6926(local55.aShort122);
				this.aClass122_Sub3_21.method6871(local55.aByte99);
				this.aClass122_Sub3_21.method6875(local55.aByte100);
				this.aClass122_Sub3_21.method6930(4);
			}
		}
		this.aClass122_Sub3_21.la(local21, local17);
		this.aClass122_Sub3_21.method7271(true);
		this.aClass122_Sub3_21.method6908();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	@Override
	public void method6674(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class145_Sub2 local8 = (Class145_Sub2) arg0;
		if (this.anInt5369 == 0 || local8.anInt5369 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt5332;
		@Pc(27) int[] local27 = local8.anIntArray536;
		@Pc(30) int[] local30 = local8.anIntArray534;
		@Pc(33) int[] local33 = local8.anIntArray539;
		@Pc(36) short[] local36 = local8.aShortArray98;
		@Pc(39) short[] local39 = local8.aShortArray103;
		@Pc(42) short[] local42 = local8.aShortArray104;
		@Pc(45) byte[] local45 = local8.aByteArray79;
		@Pc(54) short[] local54;
		@Pc(50) short[] local50;
		@Pc(56) short[] local56;
		@Pc(52) byte[] local52;
		if (this.aClass259_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local56 = this.aClass259_1.aShortArray121;
			local52 = this.aClass259_1.aByteArray105;
			local54 = this.aClass259_1.aShortArray120;
			local50 = this.aClass259_1.aShortArray122;
		}
		@Pc(83) short[] local83;
		@Pc(85) short[] local85;
		@Pc(79) short[] local79;
		@Pc(81) byte[] local81;
		if (local8.aClass259_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local79 = local8.aClass259_1.aShortArray121;
			local81 = local8.aClass259_1.aByteArray105;
			local83 = local8.aClass259_1.aShortArray120;
			local85 = local8.aClass259_1.aShortArray122;
		}
		@Pc(106) int[] local106 = local8.anIntArray538;
		@Pc(109) short[] local109 = local8.aShortArray94;
		if (!local8.aBoolean376) {
			local8.method4608();
		}
		@Pc(118) short local118 = local8.aShort94;
		@Pc(121) short local121 = local8.aShort88;
		@Pc(124) short local124 = local8.aShort96;
		@Pc(127) short local127 = local8.aShort91;
		@Pc(130) short local130 = local8.aShort93;
		@Pc(133) short local133 = local8.aShort90;
		for (@Pc(135) int local135 = 0; local135 < this.anInt5332; local135++) {
			@Pc(145) int local145 = this.anIntArray534[local135] - arg2;
			if (local145 >= local118 && local145 <= local121) {
				@Pc(161) int local161 = this.anIntArray536[local135] - arg1;
				if (local124 <= local161 && local127 >= local161) {
					@Pc(181) int local181 = this.anIntArray539[local135] - arg3;
					if (local181 >= local130 && local181 <= local133) {
						@Pc(191) int local191 = -1;
						@Pc(196) int local196 = this.anIntArray538[local135];
						@Pc(203) int local203 = this.anIntArray538[local135 + 1];
						for (@Pc(205) int local205 = local196; local205 < local203; local205++) {
							local191 = this.aShortArray94[local205] - 1;
							if (local191 == -1 || this.aByteArray79[local191] != 0) {
								break;
							}
						}
						if (local191 != -1) {
							for (@Pc(240) int local240 = 0; local240 < local24; local240++) {
								if (local161 == local27[local240] && local181 == local33[local240] && local30[local240] == local145) {
									@Pc(271) int local271 = -1;
									local196 = local106[local240];
									local203 = local106[local240 + 1];
									for (@Pc(283) int local283 = local196; local283 < local203; local283++) {
										local271 = local109[local283] - 1;
										if (local271 == -1 || local45[local271] != 0) {
											break;
										}
									}
									if (local271 != -1) {
										if (local54 == null) {
											this.aClass259_1 = new Class259();
											local54 = this.aClass259_1.aShortArray120 = Static225.method3896(this.aShortArray98);
											local50 = this.aClass259_1.aShortArray122 = Static225.method3896(this.aShortArray103);
											local56 = this.aClass259_1.aShortArray121 = Static225.method3896(this.aShortArray104);
											local52 = this.aClass259_1.aByteArray105 = Static24.method567(this.aByteArray79);
										}
										if (local83 == null) {
											@Pc(362) Class259 local362 = local8.aClass259_1 = new Class259();
											local83 = local362.aShortArray120 = Static225.method3896(local36);
											local85 = local362.aShortArray122 = Static225.method3896(local39);
											local79 = local362.aShortArray121 = Static225.method3896(local42);
											local81 = local362.aByteArray105 = Static24.method567(local45);
										}
										@Pc(395) short local395 = this.aShortArray98[local191];
										@Pc(400) short local400 = this.aShortArray103[local191];
										@Pc(405) short local405 = this.aShortArray104[local191];
										@Pc(410) byte local410 = this.aByteArray79[local191];
										local203 = local106[local240 + 1];
										local196 = local106[local240];
										@Pc(430) int local430;
										for (@Pc(422) int local422 = local196; local422 < local203; local422++) {
											local430 = local109[local422] - 1;
											if (local430 == -1) {
												break;
											}
											if (local81[local430] != 0) {
												local83[local430] += local395;
												local85[local430] += local400;
												local79[local430] += local405;
												local81[local430] += local410;
											}
										}
										local395 = local36[local271];
										local410 = local45[local271];
										local196 = this.anIntArray538[local135];
										local400 = local39[local271];
										local203 = this.anIntArray538[local135 + 1];
										local405 = local42[local271];
										for (local430 = local196; local430 < local203; local430++) {
											@Pc(516) int local516 = this.aShortArray94[local430] - 1;
											if (local516 == -1) {
												break;
											}
											if (local52[local516] != 0) {
												local54[local516] += local395;
												local50[local516] += local400;
												local56[local516] += local405;
												local52[local516] += local410;
											}
										}
										if (this.aClass43_5 == null && this.aClass43_4 != null) {
											this.aClass43_4.anInterface2_1 = null;
										}
										if (this.aClass43_5 != null) {
											this.aClass43_5.anInterface2_1 = null;
										}
										if (local8.aClass43_5 == null && local8.aClass43_4 != null) {
											local8.aClass43_4.anInterface2_1 = null;
										}
										if (local8.aClass43_5 != null) {
											local8.aClass43_5.anInterface2_1 = null;
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

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
	@Override
	public void b(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class310.anIntArray827[arg0];
		@Pc(13) int local13 = Class310.anIntArray826[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5332; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray534[local15] + this.anIntArray536[local15] * local13 >> 14;
			this.anIntArray534[local15] = local13 * this.anIntArray534[local15] - local9 * this.anIntArray536[local15] >> 14;
			this.anIntArray536[local15] = local33;
		}
		this.aBoolean376 = false;
		if (this.aClass43_6 != null) {
			this.aClass43_6.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZZILclient!lr;Lclient!lr;I)Lclient!r;")
	private Class145 method4605(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class145_Sub2 arg3, @OriginalArg(4) Class145_Sub2 arg4) {
		arg4.anInt5349 = this.anInt5349;
		arg4.anInt5344 = this.anInt5344;
		arg4.anInt5366 = this.anInt5366;
		arg4.anInt5369 = this.anInt5369;
		arg4.anInt5374 = this.anInt5374;
		arg4.aShort89 = this.aShort89;
		arg4.aShort95 = this.aShort95;
		arg4.anInt5340 = arg2;
		arg4.anInt5342 = this.anInt5342;
		arg4.aByte66 = 0;
		arg4.anInt5332 = this.anInt5332;
		@Pc(53) boolean local53 = Static389.method5894(arg2, this.anInt5344);
		@Pc(59) boolean local59 = Static328.method5046(this.anInt5344, arg2);
		@Pc(65) boolean local65 = Static475.method5204(arg2, this.anInt5344);
		@Pc(71) boolean local71 = local53 | local59 | local65;
		@Pc(186) int local186;
		if (local71) {
			if (!local53) {
				arg4.anIntArray536 = this.anIntArray536;
			} else if (arg3.anIntArray536 == null || arg3.anIntArray536.length < this.anInt5374) {
				arg4.anIntArray536 = arg3.anIntArray536 = new int[this.anInt5374];
			} else {
				arg4.anIntArray536 = arg3.anIntArray536;
			}
			if (!local59) {
				arg4.anIntArray534 = this.anIntArray534;
			} else if (arg3.anIntArray534 == null || arg3.anIntArray534.length < this.anInt5374) {
				arg4.anIntArray534 = arg3.anIntArray534 = new int[this.anInt5374];
			} else {
				arg4.anIntArray534 = arg3.anIntArray534;
			}
			if (!local65) {
				arg4.anIntArray539 = this.anIntArray539;
			} else if (arg3.anIntArray539 == null || this.anInt5374 > arg3.anIntArray539.length) {
				arg4.anIntArray539 = arg3.anIntArray539 = new int[this.anInt5374];
			} else {
				arg4.anIntArray539 = arg3.anIntArray539;
			}
			for (local186 = 0; local186 < this.anInt5374; local186++) {
				if (local53) {
					arg4.anIntArray536[local186] = this.anIntArray536[local186];
				}
				if (local59) {
					arg4.anIntArray534[local186] = this.anIntArray534[local186];
				}
				if (local65) {
					arg4.anIntArray539[local186] = this.anIntArray539[local186];
				}
			}
		} else {
			arg4.anIntArray536 = this.anIntArray536;
			arg4.anIntArray539 = this.anIntArray539;
			arg4.anIntArray534 = this.anIntArray534;
		}
		if (Static499.method6935(this.anInt5344, arg2)) {
			arg4.aClass43_6 = arg3.aClass43_6;
			if (arg0) {
				arg4.aByte66 = (byte) (arg4.aByte66 | 0x1);
			}
			arg4.aClass43_6.anInterface2_1 = this.aClass43_6.anInterface2_1;
			arg4.aClass43_6.aByte7 = this.aClass43_6.aByte7;
		} else if (Static538.method7475(this.anInt5344, arg2)) {
			arg4.aClass43_6 = this.aClass43_6;
		} else {
			arg4.aClass43_6 = null;
		}
		if (Static247.method4220(arg2, this.anInt5344)) {
			if (arg3.aShortArray97 == null || this.anInt5369 > arg3.aShortArray97.length) {
				arg4.aShortArray97 = arg3.aShortArray97 = new short[this.anInt5369];
			} else {
				arg4.aShortArray97 = arg3.aShortArray97;
			}
			for (local186 = 0; local186 < this.anInt5369; local186++) {
				arg4.aShortArray97[local186] = this.aShortArray97[local186];
			}
		} else {
			arg4.aShortArray97 = this.aShortArray97;
		}
		if (Static450.method6420(arg2, this.anInt5344)) {
			if (arg3.aByteArray78 == null || arg3.aByteArray78.length < this.anInt5369) {
				arg4.aByteArray78 = arg3.aByteArray78 = new byte[this.anInt5369];
			} else {
				arg4.aByteArray78 = arg3.aByteArray78;
			}
			for (local186 = 0; local186 < this.anInt5369; local186++) {
				arg4.aByteArray78[local186] = this.aByteArray78[local186];
			}
		} else {
			arg4.aByteArray78 = this.aByteArray78;
		}
		if (Static290.method6966(this.anInt5344, arg2)) {
			arg4.aClass43_4 = arg3.aClass43_4;
			if (arg0) {
				arg4.aByte66 = (byte) (arg4.aByte66 | 0x2);
			}
			arg4.aClass43_4.aByte7 = this.aClass43_4.aByte7;
			arg4.aClass43_4.anInterface2_1 = this.aClass43_4.anInterface2_1;
		} else if (Static177.method2906(this.anInt5344, arg2)) {
			arg4.aClass43_4 = this.aClass43_4;
		} else {
			arg4.aClass43_4 = null;
		}
		@Pc(535) int local535;
		if (Static500.method5191(this.anInt5344, arg2)) {
			if (arg3.aShortArray98 == null || this.anInt5342 > arg3.aShortArray98.length) {
				local186 = this.anInt5342;
				arg4.aShortArray104 = arg3.aShortArray104 = new short[local186];
				arg4.aShortArray98 = arg3.aShortArray98 = new short[local186];
				arg4.aShortArray103 = arg3.aShortArray103 = new short[local186];
			} else {
				arg4.aShortArray103 = arg3.aShortArray103;
				arg4.aShortArray98 = arg3.aShortArray98;
				arg4.aShortArray104 = arg3.aShortArray104;
			}
			if (this.aClass259_1 == null) {
				for (local186 = 0; local186 < this.anInt5342; local186++) {
					arg4.aShortArray98[local186] = this.aShortArray98[local186];
					arg4.aShortArray103[local186] = this.aShortArray103[local186];
					arg4.aShortArray104[local186] = this.aShortArray104[local186];
				}
			} else {
				if (arg3.aClass259_1 == null) {
					arg3.aClass259_1 = new Class259();
				}
				@Pc(523) Class259 local523 = arg4.aClass259_1 = arg3.aClass259_1;
				if (local523.aShortArray120 == null || local523.aShortArray120.length < this.anInt5342) {
					local535 = this.anInt5342;
					local523.aByteArray105 = new byte[local535];
					local523.aShortArray121 = new short[local535];
					local523.aShortArray120 = new short[local535];
					local523.aShortArray122 = new short[local535];
				}
				for (local535 = 0; local535 < this.anInt5342; local535++) {
					arg4.aShortArray98[local535] = this.aShortArray98[local535];
					arg4.aShortArray103[local535] = this.aShortArray103[local535];
					arg4.aShortArray104[local535] = this.aShortArray104[local535];
					local523.aShortArray120[local535] = this.aClass259_1.aShortArray120[local535];
					local523.aShortArray122[local535] = this.aClass259_1.aShortArray122[local535];
					local523.aShortArray121[local535] = this.aClass259_1.aShortArray121[local535];
					local523.aByteArray105[local535] = this.aClass259_1.aByteArray105[local535];
				}
			}
			arg4.aByteArray79 = this.aByteArray79;
		} else {
			arg4.aShortArray103 = this.aShortArray103;
			arg4.aByteArray79 = this.aByteArray79;
			arg4.aShortArray104 = this.aShortArray104;
			arg4.aShortArray98 = this.aShortArray98;
			arg4.aClass259_1 = this.aClass259_1;
		}
		if (Static178.method2662(arg2, this.anInt5344)) {
			if (arg0) {
				arg4.aByte66 = (byte) (arg4.aByte66 | 0x4);
			}
			arg4.aClass43_5 = arg3.aClass43_5;
			arg4.aClass43_5.anInterface2_1 = this.aClass43_5.anInterface2_1;
			arg4.aClass43_5.aByte7 = this.aClass43_5.aByte7;
		} else if (Static454.method6446(this.anInt5344, arg2)) {
			arg4.aClass43_5 = this.aClass43_5;
		} else {
			arg4.aClass43_5 = null;
		}
		if (Static300.method4753(arg2, this.anInt5344)) {
			if (arg3.aFloatArray36 == null || this.anInt5369 > arg3.aFloatArray36.length) {
				local186 = this.anInt5342;
				arg4.aFloatArray35 = arg3.aFloatArray35 = new float[local186];
				arg4.aFloatArray36 = arg3.aFloatArray36 = new float[local186];
			} else {
				arg4.aFloatArray36 = arg3.aFloatArray36;
				arg4.aFloatArray35 = arg3.aFloatArray35;
			}
			for (local186 = 0; local186 < this.anInt5342; local186++) {
				arg4.aFloatArray36[local186] = this.aFloatArray36[local186];
				arg4.aFloatArray35[local186] = this.aFloatArray35[local186];
			}
		} else {
			arg4.aFloatArray35 = this.aFloatArray35;
			arg4.aFloatArray36 = this.aFloatArray36;
		}
		if (Static231.method4009(this.anInt5344, arg2)) {
			arg4.aClass43_3 = arg3.aClass43_3;
			if (arg0) {
				arg4.aByte66 = (byte) (arg4.aByte66 | 0x8);
			}
			arg4.aClass43_3.anInterface2_1 = this.aClass43_3.anInterface2_1;
			arg4.aClass43_3.aByte7 = this.aClass43_3.aByte7;
		} else if (Static241.method4171(this.anInt5344, arg2)) {
			arg4.aClass43_3 = this.aClass43_3;
		} else {
			arg4.aClass43_3 = null;
		}
		if (Static51.method986(this.anInt5344, arg2)) {
			if (arg3.aShortArray102 == null || arg3.aShortArray102.length < this.anInt5369) {
				local186 = this.anInt5369;
				arg4.aShortArray100 = arg3.aShortArray100 = new short[local186];
				arg4.aShortArray102 = arg3.aShortArray102 = new short[local186];
				arg4.aShortArray96 = arg3.aShortArray96 = new short[local186];
			} else {
				arg4.aShortArray102 = arg3.aShortArray102;
				arg4.aShortArray96 = arg3.aShortArray96;
				arg4.aShortArray100 = arg3.aShortArray100;
			}
			for (local186 = 0; local186 < this.anInt5369; local186++) {
				arg4.aShortArray102[local186] = this.aShortArray102[local186];
				arg4.aShortArray100[local186] = this.aShortArray100[local186];
				arg4.aShortArray96[local186] = this.aShortArray96[local186];
			}
		} else {
			arg4.aShortArray96 = this.aShortArray96;
			arg4.aShortArray100 = this.aShortArray100;
			arg4.aShortArray102 = this.aShortArray102;
		}
		if (Static206.method3558(this.anInt5344, arg2)) {
			if (arg0) {
				arg4.aByte66 = (byte) (arg4.aByte66 | 0x10);
			}
			arg4.aClass128_1 = arg3.aClass128_1;
			arg4.aClass128_1.anInterface10_2 = this.aClass128_1.anInterface10_2;
		} else if (Static525.method1314(arg2, this.anInt5344)) {
			arg4.aClass128_1 = this.aClass128_1;
		} else {
			arg4.aClass128_1 = null;
		}
		if (Static131.method2186(arg2, this.anInt5344)) {
			if (arg3.aShortArray99 == null || this.anInt5369 > arg3.aShortArray99.length) {
				local186 = this.anInt5369;
				arg4.aShortArray99 = arg3.aShortArray99 = new short[local186];
			} else {
				arg4.aShortArray99 = arg3.aShortArray99;
			}
			for (local186 = 0; local186 < this.anInt5369; local186++) {
				arg4.aShortArray99[local186] = this.aShortArray99[local186];
			}
		} else {
			arg4.aShortArray99 = this.aShortArray99;
		}
		if (!Static433.method6289(arg2, this.anInt5344)) {
			arg4.aClass266Array1 = this.aClass266Array1;
		} else if (arg3.aClass266Array1 == null || arg3.aClass266Array1.length < this.anInt5366) {
			local186 = this.anInt5366;
			arg4.aClass266Array1 = arg3.aClass266Array1 = new Class266[local186];
			for (local535 = 0; local535 < this.anInt5366; local535++) {
				arg4.aClass266Array1[local535] = this.aClass266Array1[local535].method6293();
			}
		} else {
			arg4.aClass266Array1 = arg3.aClass266Array1;
			for (local186 = 0; local186 < this.anInt5366; local186++) {
				arg4.aClass266Array1[local186].method6292(this.aClass266Array1[local186]);
			}
		}
		if (this.aBoolean376) {
			arg4.aShort92 = this.aShort92;
			arg4.aShort93 = this.aShort93;
			arg4.aBoolean376 = true;
			arg4.aShort94 = this.aShort94;
			arg4.aShort88 = this.aShort88;
			arg4.aShort90 = this.aShort90;
			arg4.aShort91 = this.aShort91;
			arg4.aShort96 = this.aShort96;
		} else {
			arg4.aBoolean376 = false;
		}
		arg4.anIntArray537 = this.anIntArray537;
		arg4.aShortArray94 = this.aShortArray94;
		arg4.anIntArrayArray66 = this.anIntArrayArray66;
		arg4.aClass161Array5 = this.aClass161Array5;
		arg4.aShortArray95 = this.aShortArray95;
		arg4.anIntArray538 = this.anIntArray538;
		arg4.anIntArrayArray67 = this.anIntArrayArray67;
		arg4.aClass93Array5 = this.aClass93Array5;
		arg4.aClass252Array1 = this.aClass252Array1;
		arg4.anIntArrayArray65 = this.anIntArrayArray65;
		arg4.aShortArray101 = this.aShortArray101;
		return arg4;
	}

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		if (this.aClass43_4 != null) {
			this.aClass43_4.anInterface2_1 = null;
		}
		this.aShort89 = (short) arg0;
		if (this.aClass43_5 != null) {
			this.aClass43_5.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt5369; local7++) {
			local16 = this.aShortArray97[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg1 != -1) {
				local28 -= -(arg3 * (arg1 - local28) >> 7);
			}
			@Pc(62) int local62 = local16 & 0x7F;
			if (arg2 != -1) {
				local62 += arg3 * (arg2 - local62) >> 7;
			}
			this.aShortArray97[local7] = (short) (local28 << 7 | local22 << 10 | local62);
		}
		if (this.aClass252Array1 != null) {
			for (local16 = 0; local16 < this.anInt5366; local16++) {
				@Pc(107) Class252 local107 = this.aClass252Array1[local16];
				@Pc(112) Class266 local112 = this.aClass266Array1[local16];
				local112.anInt7528 = Static212.anIntArray347[this.aShortArray97[local107.anInt7206] & 0xFFFF] & 0xFFFFFF | local112.anInt7528 & 0xFF000000;
			}
		}
		if (this.aClass43_4 != null) {
			this.aClass43_4.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		if (!this.aBoolean376) {
			this.method4608();
		}
		return this.aShort94;
	}

	@OriginalMember(owner = "client!lr", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class310.anIntArray827[arg0];
		@Pc(13) int local13 = Class310.anIntArray826[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5332; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray534[local15] - local9 * this.anIntArray539[local15] >> 14;
			this.anIntArray539[local15] = local13 * this.anIntArray539[local15] + this.anIntArray534[local15] * local9 >> 14;
			this.anIntArray534[local15] = local34;
		}
		if (this.aClass43_6 != null) {
			this.aClass43_6.anInterface2_1 = null;
		}
		this.aBoolean376 = false;
	}

	@OriginalMember(owner = "client!lr", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	@Override
	public Class1_Sub1_Sub9 EA(@OriginalArg(0) Class1_Sub1_Sub9 arg0) {
		if (this.anInt5342 == 0) {
			return null;
		}
		if (!this.aBoolean376) {
			this.method4608();
		}
		@Pc(40) int local40;
		@Pc(56) int local56;
		if (this.aClass122_Sub3_21.anInt8439 <= 0) {
			local40 = this.aShort96 - (this.aShort94 * this.aClass122_Sub3_21.anInt8439 >> 8) >> this.aClass122_Sub3_21.anInt8421;
			local56 = this.aShort91 - (this.aClass122_Sub3_21.anInt8439 * this.aShort88 >> 8) >> this.aClass122_Sub3_21.anInt8421;
		} else {
			local40 = this.aShort96 - (this.aClass122_Sub3_21.anInt8439 * this.aShort88 >> 8) >> this.aClass122_Sub3_21.anInt8421;
			local56 = this.aShort91 - (this.aShort94 * this.aClass122_Sub3_21.anInt8439 >> 8) >> this.aClass122_Sub3_21.anInt8421;
		}
		@Pc(112) int local112;
		@Pc(128) int local128;
		if (this.aClass122_Sub3_21.anInt8460 > 0) {
			local112 = this.aShort93 - (this.aClass122_Sub3_21.anInt8460 * this.aShort88 >> 8) >> this.aClass122_Sub3_21.anInt8421;
			local128 = this.aShort90 - (this.aShort94 * this.aClass122_Sub3_21.anInt8460 >> 8) >> this.aClass122_Sub3_21.anInt8421;
		} else {
			local112 = this.aShort93 - (this.aClass122_Sub3_21.anInt8460 * this.aShort94 >> 8) >> this.aClass122_Sub3_21.anInt8421;
			local128 = this.aShort90 - (this.aClass122_Sub3_21.anInt8460 * this.aShort88 >> 8) >> this.aClass122_Sub3_21.anInt8421;
		}
		@Pc(170) int local170 = local56 + 1 - local40;
		@Pc(177) int local177 = local128 + 1 - local112;
		@Pc(180) Class1_Sub1_Sub9_Sub1 local180 = (Class1_Sub1_Sub9_Sub1) arg0;
		@Pc(196) Class1_Sub1_Sub9_Sub1 local196;
		if (local180 != null && local180.method4718(local170, local177)) {
			local196 = local180;
			local180.method4715();
		} else {
			local196 = new Class1_Sub1_Sub9_Sub1(this.aClass122_Sub3_21, local170, local177);
		}
		local196.method4712(local112, local56, local128, local40);
		this.method4610(local196);
		return local196;
	}

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "(IIII)V")
	@Override
	protected void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static261.anInt2334 = 0;
			Static3.anInt81 = 0;
			local16 = 0;
			Static76.anInt1385 = 0;
			for (local20 = 0; local20 < this.anInt5332; local20++) {
				Static3.anInt81 += this.anIntArray536[local20];
				Static261.anInt2334 += this.anIntArray534[local20];
				Static76.anInt1385 += this.anIntArray539[local20];
				local16++;
			}
			if (local16 > 0) {
				Static3.anInt81 = Static3.anInt81 / local16 + arg1;
				Static76.anInt1385 = arg3 + Static76.anInt1385 / local16;
				Static261.anInt2334 = arg2 + Static261.anInt2334 / local16;
			} else {
				Static261.anInt2334 = arg2;
				Static3.anInt81 = arg1;
				Static76.anInt1385 = arg3;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt5332; local16++) {
				this.anIntArray536[local16] += arg1;
				this.anIntArray534[local16] += arg2;
				this.anIntArray539[local16] += arg3;
			}
		} else {
			@Pc(170) int local170;
			@Pc(188) int local188;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt5332; local16++) {
					this.anIntArray536[local16] -= Static3.anInt81;
					this.anIntArray534[local16] -= Static261.anInt2334;
					this.anIntArray539[local16] -= Static76.anInt1385;
					if (arg3 != 0) {
						local20 = Class310.anIntArray827[arg3];
						local170 = Class310.anIntArray826[arg3];
						local188 = this.anIntArray536[local16] * local170 + local20 * this.anIntArray534[local16] + 16383 >> 14;
						this.anIntArray534[local16] = local170 * this.anIntArray534[local16] + 16383 - local20 * this.anIntArray536[local16] >> 14;
						this.anIntArray536[local16] = local188;
					}
					if (arg1 != 0) {
						local20 = Class310.anIntArray827[arg1];
						local170 = Class310.anIntArray826[arg1];
						local188 = local170 * this.anIntArray534[local16] + 16383 - this.anIntArray539[local16] * local20 >> 14;
						this.anIntArray539[local16] = this.anIntArray539[local16] * local170 + this.anIntArray534[local16] * local20 + 16383 >> 14;
						this.anIntArray534[local16] = local188;
					}
					if (arg2 != 0) {
						local20 = Class310.anIntArray827[arg2];
						local170 = Class310.anIntArray826[arg2];
						local188 = local170 * this.anIntArray536[local16] + local20 * this.anIntArray539[local16] + 16383 >> 14;
						this.anIntArray539[local16] = local170 * this.anIntArray539[local16] + 16383 - this.anIntArray536[local16] * local20 >> 14;
						this.anIntArray536[local16] = local188;
					}
					this.anIntArray536[local16] += Static3.anInt81;
					this.anIntArray534[local16] += Static261.anInt2334;
					this.anIntArray539[local16] += Static76.anInt1385;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt5332; local16++) {
					this.anIntArray536[local16] -= Static3.anInt81;
					this.anIntArray534[local16] -= Static261.anInt2334;
					this.anIntArray539[local16] -= Static76.anInt1385;
					this.anIntArray536[local16] = arg1 * this.anIntArray536[local16] / 128;
					this.anIntArray534[local16] = arg2 * this.anIntArray534[local16] / 128;
					this.anIntArray539[local16] = this.anIntArray539[local16] * arg3 / 128;
					this.anIntArray536[local16] += Static3.anInt81;
					this.anIntArray534[local16] += Static261.anInt2334;
					this.anIntArray539[local16] += Static76.anInt1385;
				}
			} else {
				@Pc(516) Class252 local516;
				@Pc(521) Class266 local521;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt5369; local16++) {
						local20 = arg1 * 8 + (this.aByteArray78[local16] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray78[local16] = (byte) local20;
					}
					if (this.aClass43_4 != null) {
						this.aClass43_4.anInterface2_1 = null;
					}
					if (this.aClass252Array1 != null) {
						for (local20 = 0; local20 < this.anInt5366; local20++) {
							local516 = this.aClass252Array1[local20];
							local521 = this.aClass266Array1[local20];
							local521.anInt7528 = local521.anInt7528 & 0xFFFFFF | 255 - (this.aByteArray78[local516.anInt7206] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt5369; local16++) {
						local20 = this.aShortArray97[local16] & 0xFFFF;
						local170 = local20 >> 10 & 0x3F;
						local188 = local20 >> 7 & 0x7;
						@Pc(578) int local578 = arg1 + local170 & 0x3F;
						@Pc(582) int local582 = local20 & 0x7F;
						local188 += arg2 / 4;
						local582 += arg3;
						if (local188 < 0) {
							local188 = 0;
						} else if (local188 > 7) {
							local188 = 7;
						}
						if (local582 < 0) {
							local582 = 0;
						} else if (local582 > 127) {
							local582 = 127;
						}
						this.aShortArray97[local16] = (short) (local188 << 7 | local578 << 10 | local582);
					}
					if (this.aClass43_4 != null) {
						this.aClass43_4.anInterface2_1 = null;
					}
					if (this.aClass252Array1 != null) {
						for (local20 = 0; local20 < this.anInt5366; local20++) {
							local516 = this.aClass252Array1[local20];
							local521 = this.aClass266Array1[local20];
							local521.anInt7528 = local521.anInt7528 & 0xFF000000 | Static212.anIntArray347[this.aShortArray97[local516.anInt7206] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(704) Class266 local704;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt5366; local16++) {
							local704 = this.aClass266Array1[local16];
							local704.anInt7531 += arg2;
							local704.anInt7535 += arg1;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt5366; local16++) {
							local704 = this.aClass266Array1[local16];
							local704.anInt7532 = arg2 * local704.anInt7532 >> 7;
							local704.anInt7530 = local704.anInt7530 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt5366; local16++) {
							local704 = this.aClass266Array1[local16];
							local704.anInt7533 = arg1 + local704.anInt7533 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "(I)V")
	@Override
	public void m(@OriginalArg(0) int arg0) {
		this.anInt5340 = arg0;
		if (this.aClass259_1 != null && (this.anInt5340 & 0x10000) == 0) {
			this.aShortArray104 = this.aClass259_1.aShortArray121;
			this.aShortArray103 = this.aClass259_1.aShortArray122;
			this.aByteArray79 = this.aClass259_1.aByteArray105;
			this.aShortArray98 = this.aClass259_1.aShortArray120;
			this.aClass259_1 = null;
		}
		this.aBoolean375 = true;
		this.method4600();
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "()[Lclient!fi;")
	@Override
	public Class93[] method6684() {
		return this.aClass93Array5;
	}

	@OriginalMember(owner = "client!lr", name = "ga", descriptor = "()I")
	@Override
	public int ga() {
		return this.aShort89;
	}

	@OriginalMember(owner = "client!lr", name = "L", descriptor = "(SS)V")
	@Override
	public void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface8 local9 = this.aClass122_Sub3_21.anInterface8_14;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5369; local11++) {
			if (this.aShortArray99[local11] == arg0) {
				this.aShortArray99[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(52) Class220 local52 = local9.method878(arg0 & 0xFFFF);
			local39 = local52.aByte81;
			local41 = local52.aByte84;
		}
		@Pc(60) byte local60 = 0;
		@Pc(62) byte local62 = 0;
		if (arg1 != -1) {
			@Pc(73) Class220 local73 = local9.method878(arg1 & 0xFFFF);
			local62 = local73.aByte84;
			local60 = local73.aByte81;
		}
		if (!(local62 != local41 | local60 != local39)) {
			return;
		}
		if (this.aClass252Array1 != null) {
			for (@Pc(106) int local106 = 0; local106 < this.anInt5366; local106++) {
				@Pc(113) Class252 local113 = this.aClass252Array1[local106];
				@Pc(118) Class266 local118 = this.aClass266Array1[local106];
				local118.anInt7528 = local118.anInt7528 & 0xFF000000 | Static212.anIntArray347[this.aShortArray97[local113.anInt7206] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass43_4 != null) {
			this.aClass43_4.anInterface2_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!lr", name = "pa", descriptor = "(SS)V")
	@Override
	public void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5369; local3++) {
			if (arg0 == this.aShortArray97[local3]) {
				this.aShortArray97[local3] = arg1;
			}
		}
		if (this.aClass252Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt5366; local30++) {
				@Pc(37) Class252 local37 = this.aClass252Array1[local30];
				@Pc(42) Class266 local42 = this.aClass266Array1[local30];
				local42.anInt7528 = local42.anInt7528 & 0xFF000000 | Static212.anIntArray347[this.aShortArray97[local37.anInt7206] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass43_4 != null) {
			this.aClass43_4.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "()V")
	@Override
	public void method6668() {
		if (this.anInt5342 <= 0 || this.anInt5349 <= 0) {
			return;
		}
		this.method4607(false);
		if ((this.aByte66 & 0x10) == 0 && this.aClass128_1.anInterface10_2 == null) {
			this.method4601(false);
		}
		this.method4600();
	}

	@OriginalMember(owner = "client!lr", name = "sa", descriptor = "()Z")
	@Override
	protected boolean sa() {
		if (this.anIntArrayArray66 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5374; local12++) {
			this.anIntArray536[local12] <<= 0x4;
			this.anIntArray534[local12] <<= 0x4;
			this.anIntArray539[local12] <<= 0x4;
		}
		Static76.anInt1385 = 0;
		Static261.anInt2334 = 0;
		Static3.anInt81 = 0;
		return true;
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "()I")
	@Override
	public int e() {
		if (!this.aBoolean376) {
			this.method4608();
		}
		return this.aShort92;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZZ)V")
	private void method4607(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass43_4 != null && this.aClass43_4.anInterface2_1 == null;
		@Pc(27) boolean local27 = this.aClass43_5 != null && this.aClass43_5.anInterface2_1 == null;
		@Pc(38) boolean local38 = this.aClass43_6 != null && this.aClass43_6.anInterface2_1 == null;
		@Pc(49) boolean local49 = this.aClass43_3 != null && this.aClass43_3.anInterface2_1 == null;
		if (arg0) {
			local38 &= (this.aByte66 & 0x1) != 0;
			local49 &= (this.aByte66 & 0x8) != 0;
			local27 &= (this.aByte66 & 0x4) != 0;
			local16 &= (this.aByte66 & 0x2) != 0;
		}
		@Pc(103) byte local103 = 0;
		@Pc(107) byte local107 = 0;
		@Pc(113) byte local113 = 0;
		if (local38) {
			local103 = 12;
		}
		@Pc(124) byte local124 = 0;
		if (local16) {
			local107 = local103;
			local103 = (byte) (local103 + 4);
		}
		if (local27) {
			local113 = local103;
			local103 = (byte) (local103 + 12);
		}
		if (local49) {
			local124 = local103;
			local103 = (byte) (local103 + 8);
		}
		if (local103 == 0) {
			return;
		}
		if (local103 * this.anInt5342 <= this.aClass122_Sub3_21.aClass1_Sub6_Sub1_3.aByteArray66.length) {
			this.aClass122_Sub3_21.aClass1_Sub6_Sub1_3.anInt4555 = 0;
		} else {
			this.aClass122_Sub3_21.aClass1_Sub6_Sub1_3 = new Class1_Sub6_Sub1(local103 * (this.anInt5342 + 100));
		}
		@Pc(194) Class1_Sub6_Sub1 local194 = this.aClass122_Sub3_21.aClass1_Sub6_Sub1_3;
		@Pc(202) int local202;
		@Pc(211) int local211;
		@Pc(239) int local239;
		@Pc(248) int local248;
		if (local38) {
			@Pc(218) int local218;
			@Pc(225) int local225;
			@Pc(230) int local230;
			@Pc(237) int local237;
			if (this.aClass122_Sub3_21.aBoolean594) {
				for (local202 = 0; local202 < this.anInt5332; local202++) {
					local211 = Stream.floatToRawIntBits((float) this.anIntArray536[local202]);
					local218 = Stream.floatToRawIntBits((float) this.anIntArray534[local202]);
					local225 = Stream.floatToRawIntBits((float) this.anIntArray539[local202]);
					local230 = this.anIntArray538[local202];
					local237 = this.anIntArray538[local202 + 1];
					for (local239 = local230; local239 < local237; local239++) {
						local248 = this.aShortArray94[local239] - 1;
						if (local248 == -1) {
							break;
						}
						local194.anInt4555 = local103 * local248;
						local194.method3948(local211);
						local194.method3948(local218);
						local194.method3948(local225);
					}
				}
			} else {
				for (local202 = 0; local202 < this.anInt5332; local202++) {
					local211 = Stream.floatToRawIntBits((float) this.anIntArray536[local202]);
					local218 = Stream.floatToRawIntBits((float) this.anIntArray534[local202]);
					local225 = Stream.floatToRawIntBits((float) this.anIntArray539[local202]);
					local230 = this.anIntArray538[local202];
					local237 = this.anIntArray538[local202 + 1];
					for (local239 = local230; local239 < local237; local239++) {
						local248 = this.aShortArray94[local239] - 1;
						if (local248 == -1) {
							break;
						}
						local194.anInt4555 = local103 * local248;
						local194.method3970(local211);
						local194.method3970(local218);
						local194.method3970(local225);
					}
				}
			}
		}
		@Pc(557) float local557;
		@Pc(455) short[] local455;
		@Pc(458) short[] local458;
		@Pc(464) short[] local464;
		@Pc(461) byte[] local461;
		@Pc(618) float local618;
		if (local16) {
			if (this.aClass43_5 == null) {
				if (this.aClass259_1 == null) {
					local455 = this.aShortArray103;
					local458 = this.aShortArray98;
					local461 = this.aByteArray79;
					local464 = this.aShortArray104;
				} else {
					local455 = this.aClass259_1.aShortArray122;
					local458 = this.aClass259_1.aShortArray120;
					local464 = this.aClass259_1.aShortArray121;
					local461 = this.aClass259_1.aByteArray105;
				}
				@Pc(488) float local488 = this.aClass122_Sub3_21.aFloatArray65[0];
				@Pc(494) float local494 = this.aClass122_Sub3_21.aFloatArray65[1];
				@Pc(500) float local500 = this.aClass122_Sub3_21.aFloatArray65[2];
				@Pc(504) float local504 = this.aClass122_Sub3_21.aFloat169;
				@Pc(514) float local514 = this.aClass122_Sub3_21.aFloat183 * 768.0F / (float) this.aShort89;
				@Pc(524) float local524 = this.aClass122_Sub3_21.aFloat179 * 768.0F / (float) this.aShort89;
				for (@Pc(526) int local526 = 0; local526 < this.anInt5369; local526++) {
					@Pc(546) int local546 = this.method4611(this.aShortArray99[local526], this.aByteArray78[local526], this.aShort95, this.aShortArray97[local526]);
					local557 = this.aClass122_Sub3_21.aFloat165 * (float) (local546 >> 16 & 0xFF);
					@Pc(562) short local562 = this.aShortArray102[local526];
					@Pc(573) float local573 = (float) (local546 >> 8 & 0xFF) * this.aClass122_Sub3_21.aFloat168;
					@Pc(582) float local582 = (float) (local546 >>> 24) * this.aClass122_Sub3_21.aFloat175;
					@Pc(587) short local587 = (short) local461[local562];
					if (local587 == 0) {
						local618 = ((float) local455[local562] * local494 + (float) local458[local562] * local488 + (float) local464[local562] * local500) * 0.0026041667F;
					} else {
						local618 = (local500 * (float) local464[local562] + (float) local455[local562] * local494 + local488 * (float) local458[local562]) / (float) (local587 * 256);
					}
					@Pc(655) float local655 = (local618 < 0.0F ? local524 : local514) * local618 + local504;
					@Pc(660) int local660 = (int) (local582 * local655);
					if (local660 < 0) {
						local660 = 0;
					} else if (local660 > 255) {
						local660 = 255;
					}
					@Pc(679) int local679 = (int) (local655 * local557);
					if (local679 < 0) {
						local679 = 0;
					} else if (local679 > 255) {
						local679 = 255;
					}
					@Pc(695) int local695 = (int) (local655 * local573);
					if (local695 < 0) {
						local695 = 0;
					} else if (local695 > 255) {
						local695 = 255;
					}
					local194.anInt4555 = local107 + local103 * local562;
					local194.method3937(local660);
					local194.method3937(local679);
					local194.method3937(local695);
					local194.method3937(255 - (this.aByteArray78[local526] & 0xFF));
					local562 = this.aShortArray100[local526];
					local587 = local461[local562];
					if (local587 == 0) {
						local618 = (local500 * (float) local464[local562] + (float) local455[local562] * local494 + local488 * (float) local458[local562]) * 0.0026041667F;
					} else {
						local618 = (local500 * (float) local464[local562] + (float) local455[local562] * local494 + local488 * (float) local458[local562]) / (float) (local587 * 256);
					}
					local655 = (local618 < 0.0F ? local524 : local514) * local618 + local504;
					local660 = (int) (local655 * local582);
					local679 = (int) (local557 * local655);
					if (local660 < 0) {
						local660 = 0;
					} else if (local660 > 255) {
						local660 = 255;
					}
					if (local679 < 0) {
						local679 = 0;
					} else if (local679 > 255) {
						local679 = 255;
					}
					local695 = (int) (local573 * local655);
					if (local695 < 0) {
						local695 = 0;
					} else if (local695 > 255) {
						local695 = 255;
					}
					local194.anInt4555 = local107 + local103 * local562;
					local194.method3937(local660);
					local194.method3937(local679);
					local194.method3937(local695);
					local194.method3937(255 - (this.aByteArray78[local526] & 0xFF));
					local562 = this.aShortArray96[local526];
					local587 = local461[local562];
					if (local587 == 0) {
						local618 = (local500 * (float) local464[local562] + local488 * (float) local458[local562] + local494 * (float) local455[local562]) * 0.0026041667F;
					} else {
						local618 = ((float) local455[local562] * local494 + local488 * (float) local458[local562] + local500 * (float) local464[local562]) / (float) (local587 * 256);
					}
					local655 = (local618 < 0.0F ? local524 : local514) * local618 + local504;
					local660 = (int) (local582 * local655);
					if (local660 < 0) {
						local660 = 0;
					} else if (local660 > 255) {
						local660 = 255;
					}
					local679 = (int) (local557 * local655);
					if (local679 < 0) {
						local679 = 0;
					} else if (local679 > 255) {
						local679 = 255;
					}
					local695 = (int) (local655 * local573);
					local194.anInt4555 = local107 + local103 * local562;
					if (local695 < 0) {
						local695 = 0;
					} else if (local695 > 255) {
						local695 = 255;
					}
					local194.method3937(local660);
					local194.method3937(local679);
					local194.method3937(local695);
					local194.method3937(255 - (this.aByteArray78[local526] & 0xFF));
				}
			} else {
				for (local202 = 0; local202 < this.anInt5369; local202++) {
					local211 = this.method4611(this.aShortArray99[local202], this.aByteArray78[local202], this.aShort95, this.aShortArray97[local202]);
					local194.anInt4555 = this.aShortArray102[local202] * local103 + local107;
					local194.method3948(local211);
					local194.anInt4555 = local107 + this.aShortArray100[local202] * local103;
					local194.method3948(local211);
					local194.anInt4555 = local103 * this.aShortArray96[local202] + local107;
					local194.method3948(local211);
				}
			}
		}
		if (local27) {
			if (this.aClass259_1 == null) {
				local458 = this.aShortArray98;
				local464 = this.aShortArray104;
				local461 = this.aByteArray79;
				local455 = this.aShortArray103;
			} else {
				local458 = this.aClass259_1.aShortArray120;
				local461 = this.aClass259_1.aByteArray105;
				local455 = this.aClass259_1.aShortArray122;
				local464 = this.aClass259_1.aShortArray121;
			}
			@Pc(1104) float local1104 = 3.0F / (float) this.aShort89;
			local618 = 3.0F / (float) (this.aShort89 + this.aShort89 / 2);
			local194.anInt4555 = local113;
			if (this.aClass122_Sub3_21.aBoolean594) {
				for (local239 = 0; local239 < this.anInt5342; local239++) {
					local248 = local461[local239] & 0xFF;
					if (local248 == 0) {
						local194.method726(local618 * (float) local458[local239]);
						local194.method726(local618 * (float) local455[local239]);
						local194.method726((float) local464[local239] * local618);
					} else {
						local557 = local1104 / (float) local248;
						local194.method726(local557 * (float) local458[local239]);
						local194.method726(local557 * (float) local455[local239]);
						local194.method726((float) local464[local239] * local557);
					}
					local194.anInt4555 += local103 - 12;
				}
			} else {
				for (local239 = 0; local239 < this.anInt5342; local239++) {
					local248 = local461[local239] & 0xFF;
					if (local248 == 0) {
						local194.method724(local618 * (float) local458[local239]);
						local194.method724(local618 * (float) local455[local239]);
						local194.method724((float) local464[local239] * local618);
					} else {
						local557 = local1104 / (float) local248;
						local194.method724(local557 * (float) local458[local239]);
						local194.method724(local557 * (float) local455[local239]);
						local194.method724((float) local464[local239] * local557);
					}
					local194.anInt4555 += local103 - 12;
				}
			}
		}
		if (local49) {
			local194.anInt4555 = local124;
			if (this.aClass122_Sub3_21.aBoolean594) {
				for (local202 = 0; local202 < this.anInt5342; local202++) {
					local194.method726(this.aFloatArray36[local202]);
					local194.method726(this.aFloatArray35[local202]);
					local194.anInt4555 += local103 - 8;
				}
			} else {
				for (local202 = 0; local202 < this.anInt5342; local202++) {
					local194.method724(this.aFloatArray36[local202]);
					local194.method724(this.aFloatArray35[local202]);
					local194.anInt4555 += local103 - 8;
				}
			}
		}
		local194.anInt4555 = local103 * this.anInt5342;
		@Pc(1396) Interface2 local1396;
		if (arg0) {
			if (this.anInterface2_3 == null) {
				this.anInterface2_3 = this.aClass122_Sub3_21.method6892(local194.aByteArray66, local103, true, local194.anInt4555);
			} else {
				this.anInterface2_3.method4390(local194.aByteArray66, local103, local194.anInt4555);
			}
			local1396 = this.anInterface2_3;
			this.aByte66 = 0;
		} else {
			local1396 = this.aClass122_Sub3_21.method6892(local194.aByteArray66, local103, false, local194.anInt4555);
			this.aBoolean375 = true;
		}
		if (local38) {
			this.aClass43_6.aByte7 = 0;
			this.aClass43_6.anInterface2_1 = local1396;
		}
		if (local49) {
			this.aClass43_3.aByte7 = local124;
			this.aClass43_3.anInterface2_1 = local1396;
		}
		if (local16) {
			this.aClass43_4.aByte7 = local107;
			this.aClass43_4.anInterface2_1 = local1396;
		}
		if (local27) {
			this.aClass43_5.anInterface2_1 = local1396;
			this.aClass43_5.aByte7 = local113;
		}
	}

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "()I")
	@Override
	public int n() {
		if (!this.aBoolean376) {
			this.method4608();
		}
		return this.aShort88;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "()Z")
	@Override
	public boolean method6670() {
		if (this.aShortArray99 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray99.length; local12++) {
			if (this.aShortArray99[local12] != -1 && !this.aClass122_Sub3_21.anInterface8_14.method879(this.aShortArray99[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "(I)V")
	@Override
	public void g(@OriginalArg(0) int arg0) {
		this.aShort95 = (short) arg0;
		if (this.aClass43_4 != null) {
			this.aClass43_4.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!m;Lclient!eca;I)V")
	@Override
	public void method6686(@OriginalArg(0) Class118 arg0, @OriginalArg(1) Class72_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5342 == 0) {
			return;
		}
		@Pc(13) Class118_Sub1 local13 = this.aClass122_Sub3_21.aClass118_Sub1_4;
		@Pc(16) Class118_Sub1 local16 = (Class118_Sub1) arg0;
		if (!this.aBoolean376) {
			this.method4608();
		}
		this.method4609(local16);
		Static354.aFloat119 = local13.aFloat35 * local16.aFloat41 + local16.aFloat36 * local13.aFloat38 + local16.aFloat39 * local13.aFloat41;
		Static26.aFloat6 = local13.aFloat44 + local13.aFloat35 * local16.aFloat44 + local13.aFloat41 * local16.aFloat43 + local13.aFloat38 * local16.aFloat37;
		@Pc(73) float local73 = Static26.aFloat6 + Static354.aFloat119 * (float) this.aShort94;
		@Pc(81) float local81 = Static26.aFloat6 + Static354.aFloat119 * (float) this.aShort88;
		@Pc(97) float local97;
		@Pc(91) float local91;
		if (local81 < local73) {
			local97 = local81 - (float) this.aShort92;
			local91 = local73 + (float) this.aShort92;
		} else {
			local91 = (float) this.aShort92 + local81;
			local97 = local73 - (float) this.aShort92;
		}
		if (local97 >= this.aClass122_Sub3_21.aFloat180 || local91 <= (float) this.aClass122_Sub3_21.anInt8450) {
			return;
		}
		Static131.aFloat30 = local16.aFloat44 * local13.aFloat46 + local13.aFloat42 * local16.aFloat37 + local13.aFloat36 * local16.aFloat43 + local13.aFloat37;
		Static347.aFloat118 = local13.aFloat42 * local16.aFloat36 + local13.aFloat36 * local16.aFloat39 + local13.aFloat46 * local16.aFloat41;
		@Pc(173) float local173 = Static347.aFloat118 * (float) this.aShort94 + Static131.aFloat30;
		@Pc(181) float local181 = (float) this.aShort88 * Static347.aFloat118 + Static131.aFloat30;
		@Pc(196) float local196;
		@Pc(207) float local207;
		if (local173 > local181) {
			local207 = (local173 + (float) this.aShort92) * (float) this.aClass122_Sub3_21.anInt8462;
			local196 = (float) this.aClass122_Sub3_21.anInt8462 * ((float) -this.aShort92 + local181);
		} else {
			local196 = (local173 - (float) this.aShort92) * (float) this.aClass122_Sub3_21.anInt8462;
			local207 = (local181 + (float) this.aShort92) * (float) this.aClass122_Sub3_21.anInt8462;
		}
		if (this.aClass122_Sub3_21.aFloat174 <= local196 / local91 || this.aClass122_Sub3_21.aFloat178 >= local207 / local91) {
			return;
		}
		Static418.aFloat144 = local13.aFloat43 + local16.aFloat44 * local13.aFloat40 + local16.aFloat37 * local13.aFloat45 + local16.aFloat43 * local13.aFloat39;
		Static442.aFloat146 = local16.aFloat39 * local13.aFloat39 + local16.aFloat36 * local13.aFloat45 + local16.aFloat41 * local13.aFloat40;
		@Pc(297) float local297 = (float) this.aShort94 * Static442.aFloat146 + Static418.aFloat144;
		@Pc(305) float local305 = (float) this.aShort88 * Static442.aFloat146 + Static418.aFloat144;
		@Pc(331) float local331;
		@Pc(320) float local320;
		if (local297 > local305) {
			local320 = ((float) this.aShort92 + local297) * (float) this.aClass122_Sub3_21.anInt8459;
			local331 = (local305 - (float) this.aShort92) * (float) this.aClass122_Sub3_21.anInt8459;
		} else {
			local320 = (float) this.aClass122_Sub3_21.anInt8459 * (local305 + (float) this.aShort92);
			local331 = (local297 - (float) this.aShort92) * (float) this.aClass122_Sub3_21.anInt8459;
		}
		if (local331 / local91 >= this.aClass122_Sub3_21.aFloat177 || local320 / local91 <= this.aClass122_Sub3_21.aFloat164) {
			return;
		}
		if (arg1 != null || this.aClass252Array1 != null) {
			Static237.aFloat100 = local16.aFloat45 * local13.aFloat36 + local13.aFloat42 * local16.aFloat42 + local13.aFloat46 * local16.aFloat38;
			Static229.aFloat97 = local13.aFloat40 * local16.aFloat38 + local13.aFloat39 * local16.aFloat45 + local13.aFloat45 * local16.aFloat42;
			Static487.aFloat155 = local16.aFloat35 * local13.aFloat46 + local16.aFloat46 * local13.aFloat42 + local16.aFloat40 * local13.aFloat36;
			Static127.aFloat95 = local13.aFloat38 * local16.aFloat46 + local13.aFloat41 * local16.aFloat40 + local16.aFloat35 * local13.aFloat35;
			Static192.aFloat52 = local16.aFloat38 * local13.aFloat35 + local13.aFloat38 * local16.aFloat42 + local16.aFloat45 * local13.aFloat41;
			Static401.aFloat141 = local16.aFloat35 * local13.aFloat40 + local13.aFloat39 * local16.aFloat40 + local16.aFloat46 * local13.aFloat45;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(500) int local500 = this.aShort96 + this.aShort91 >> 1;
			@Pc(508) int local508 = this.aShort93 + this.aShort90 >> 1;
			@Pc(527) int local527 = (int) (Static347.aFloat118 * (float) this.aShort94 + (float) local500 * Static237.aFloat100 + Static131.aFloat30 + (float) local508 * Static487.aFloat155);
			@Pc(546) int local546 = (int) (Static442.aFloat146 * (float) this.aShort94 + (float) local500 * Static229.aFloat97 + Static418.aFloat144 + Static401.aFloat141 * (float) local508);
			@Pc(565) int local565 = (int) ((float) local508 * Static127.aFloat95 + Static354.aFloat119 * (float) this.aShort94 + Static26.aFloat6 + (float) local500 * Static192.aFloat52);
			if (this.aClass122_Sub3_21.anInt8450 > local565) {
				local490 = true;
			} else {
				arg1.anInt2130 = local527 * this.aClass122_Sub3_21.anInt8462 / local565 + this.aClass122_Sub3_21.anInt8438;
				arg1.anInt2131 = local546 * this.aClass122_Sub3_21.anInt8459 / local565 + this.aClass122_Sub3_21.anInt8429;
			}
			@Pc(623) int local623 = (int) ((float) local508 * Static487.aFloat155 + Static131.aFloat30 + Static237.aFloat100 * (float) local500 + (float) this.aShort88 * Static347.aFloat118);
			@Pc(642) int local642 = (int) ((float) local508 * Static401.aFloat141 + (float) this.aShort88 * Static442.aFloat146 + (float) local500 * Static229.aFloat97 + Static418.aFloat144);
			@Pc(661) int local661 = (int) ((float) local508 * Static127.aFloat95 + Static192.aFloat52 * (float) local500 + Static26.aFloat6 + Static354.aFloat119 * (float) this.aShort88);
			if (this.aClass122_Sub3_21.anInt8450 > local661) {
				local490 = true;
			} else {
				arg1.anInt2133 = this.aClass122_Sub3_21.anInt8429 + this.aClass122_Sub3_21.anInt8459 * local642 / local661;
				arg1.anInt2132 = this.aClass122_Sub3_21.anInt8438 + this.aClass122_Sub3_21.anInt8462 * local623 / local661;
			}
			if (local490) {
				if (local565 < this.aClass122_Sub3_21.anInt8450 && this.aClass122_Sub3_21.anInt8450 > local661) {
					local492 = false;
				} else {
					@Pc(743) int local743;
					@Pc(754) int local754;
					@Pc(765) int local765;
					if (local565 < this.aClass122_Sub3_21.anInt8450) {
						local743 = (local661 - this.aClass122_Sub3_21.anInt8450 << 16) / (local661 - local565);
						local754 = local623 + ((local623 - local527) * local743 >> 16);
						local765 = local642 + ((local642 - local546) * local743 >> 16);
						arg1.anInt2130 = this.aClass122_Sub3_21.anInt8438 + local754 * this.aClass122_Sub3_21.anInt8462 / this.aClass122_Sub3_21.anInt8450;
						arg1.anInt2131 = this.aClass122_Sub3_21.anInt8429 + local765 * this.aClass122_Sub3_21.anInt8459 / this.aClass122_Sub3_21.anInt8450;
					} else if (this.aClass122_Sub3_21.anInt8450 > local661) {
						local743 = (local565 - this.aClass122_Sub3_21.anInt8450 << 16) / (local565 - local661);
						local754 = local527 + ((local527 - local623) * local743 >> 16);
						local765 = local546 + ((local546 - local642) * local743 >> 16);
						arg1.anInt2130 = this.aClass122_Sub3_21.anInt8438 + this.aClass122_Sub3_21.anInt8462 * local754 / this.aClass122_Sub3_21.anInt8450;
						arg1.anInt2131 = local765 * this.aClass122_Sub3_21.anInt8459 / this.aClass122_Sub3_21.anInt8450 + this.aClass122_Sub3_21.anInt8429;
					}
				}
			}
			if (local492) {
				arg1.aBoolean129 = true;
				if (local565 <= local661) {
					arg1.anInt2129 = (this.aShort92 + local623) * this.aClass122_Sub3_21.anInt8462 / local661 + this.aClass122_Sub3_21.anInt8438 - arg1.anInt2132;
				} else {
					arg1.anInt2129 = (local527 + this.aShort92) * this.aClass122_Sub3_21.anInt8462 / local565 + this.aClass122_Sub3_21.anInt8438 - arg1.anInt2130;
				}
			}
		}
		this.aClass122_Sub3_21.method6891();
		this.aClass122_Sub3_21.method6927(local16);
		this.method4603();
		this.aClass122_Sub3_21.method6908();
		this.method4604();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
	private void method4608() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt5332; local23++) {
			@Pc(30) int local30 = this.anIntArray536[local23];
			@Pc(35) int local35 = this.anIntArray534[local23];
			@Pc(40) int local40 = this.anIntArray539[local23];
			if (local15 < local35) {
				local15 = local35;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			if (local9 > local35) {
				local9 = local35;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			if (local11 > local40) {
				local11 = local40;
			}
			if (local17 < local40) {
				local17 = local40;
			}
			@Pc(82) int local82 = local30 * local30 + local40 * local40;
			if (local19 < local82) {
				local19 = local82;
			}
			local82 = local40 * local40 + local30 * local30 + local35 * local35;
			if (local21 < local82) {
				local21 = local82;
			}
		}
		this.aShort96 = (short) local7;
		this.aShort88 = (short) local15;
		this.aShort90 = (short) local17;
		this.aShort93 = (short) local11;
		this.aShort94 = (short) local9;
		this.aShort91 = (short) local13;
		this.aShort92 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean376 = true;
	}

	@OriginalMember(owner = "client!lr", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean376) {
			this.method4608();
		}
		return this.aShort90;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILclient!m;Z)Z")
	@Override
	public boolean method6683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class118_Sub1 local8 = (Class118_Sub1) arg2;
		@Pc(12) Class118_Sub1 local12 = this.aClass122_Sub3_21.aClass118_Sub1_4;
		@Pc(33) float local33 = local12.aFloat46 * local8.aFloat44 + local12.aFloat42 * local8.aFloat37 + local8.aFloat43 * local12.aFloat36 + local12.aFloat37;
		@Pc(54) float local54 = local12.aFloat43 + local8.aFloat37 * local12.aFloat45 + local12.aFloat39 * local8.aFloat43 + local8.aFloat44 * local12.aFloat40;
		Static237.aFloat100 = local8.aFloat42 * local12.aFloat42 + local12.aFloat36 * local8.aFloat45 + local8.aFloat38 * local12.aFloat46;
		Static354.aFloat119 = local12.aFloat38 * local8.aFloat36 + local8.aFloat39 * local12.aFloat41 + local12.aFloat35 * local8.aFloat41;
		Static401.aFloat141 = local12.aFloat40 * local8.aFloat35 + local8.aFloat46 * local12.aFloat45 + local8.aFloat40 * local12.aFloat39;
		Static442.aFloat146 = local8.aFloat39 * local12.aFloat39 + local8.aFloat36 * local12.aFloat45 + local8.aFloat41 * local12.aFloat40;
		Static127.aFloat95 = local8.aFloat35 * local12.aFloat35 + local12.aFloat41 * local8.aFloat40 + local12.aFloat38 * local8.aFloat46;
		Static192.aFloat52 = local12.aFloat35 * local8.aFloat38 + local12.aFloat38 * local8.aFloat42 + local8.aFloat45 * local12.aFloat41;
		Static229.aFloat97 = local12.aFloat40 * local8.aFloat38 + local8.aFloat45 * local12.aFloat39 + local12.aFloat45 * local8.aFloat42;
		@Pc(201) float local201 = local12.aFloat38 * local8.aFloat37 + local12.aFloat41 * local8.aFloat43 + local12.aFloat35 * local8.aFloat44 + local12.aFloat44;
		Static347.aFloat118 = local8.aFloat41 * local12.aFloat46 + local12.aFloat42 * local8.aFloat36 + local12.aFloat36 * local8.aFloat39;
		Static487.aFloat155 = local12.aFloat36 * local8.aFloat40 + local8.aFloat46 * local12.aFloat42 + local8.aFloat35 * local12.aFloat46;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass122_Sub3_21.anInt8462;
		@Pc(255) int local255 = this.aClass122_Sub3_21.anInt8459;
		if (!this.aBoolean376) {
			this.method4608();
		}
		Static393.anIntArray685[0] = this.aShort96;
		Static459.anIntArray734[0] = this.aShort94;
		Static393.anIntArray685[1] = this.aShort91;
		Static58.anIntArray143[0] = this.aShort93;
		Static459.anIntArray734[1] = this.aShort94;
		Static393.anIntArray685[2] = this.aShort96;
		Static58.anIntArray143[1] = this.aShort93;
		Static459.anIntArray734[2] = this.aShort88;
		Static58.anIntArray143[2] = this.aShort93;
		Static393.anIntArray685[3] = this.aShort91;
		Static459.anIntArray734[3] = this.aShort88;
		Static393.anIntArray685[4] = this.aShort96;
		Static58.anIntArray143[3] = this.aShort93;
		Static459.anIntArray734[4] = this.aShort94;
		Static58.anIntArray143[4] = this.aShort90;
		Static393.anIntArray685[5] = this.aShort91;
		Static459.anIntArray734[5] = this.aShort94;
		Static58.anIntArray143[5] = this.aShort90;
		Static393.anIntArray685[6] = this.aShort96;
		Static459.anIntArray734[6] = this.aShort88;
		Static393.anIntArray685[7] = this.aShort91;
		Static58.anIntArray143[6] = this.aShort90;
		Static459.anIntArray734[7] = this.aShort88;
		Static58.anIntArray143[7] = this.aShort90;
		@Pc(414) float local414;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(400) float local400;
		@Pc(395) float local395;
		@Pc(390) float local390;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static58.anIntArray143[local383];
			local395 = Static459.anIntArray734[local383];
			local400 = Static393.anIntArray685[local383];
			local414 = local33 + Static487.aFloat155 * local390 + Static237.aFloat100 * local400 + Static347.aFloat118 * local395;
			local428 = local201 + Static127.aFloat95 * local390 + Static192.aFloat52 * local400 + Static354.aFloat119 * local395;
			local442 = local54 + Static229.aFloat97 * local400 + Static442.aFloat146 * local395 + local390 * Static401.aFloat141;
			if ((float) this.aClass122_Sub3_21.anInt8450 <= local428) {
				@Pc(461) float local461 = (float) this.aClass122_Sub3_21.anInt8438 + local414 * (float) local251 / local428;
				if (local241 > local461) {
					local241 = local461;
				}
				@Pc(479) float local479 = (float) this.aClass122_Sub3_21.anInt8429 + local442 * (float) local255 / local428;
				if (local461 > local243) {
					local243 = local461;
				}
				local239 = true;
				if (local479 < local245) {
					local245 = local479;
				}
				if (local479 > local247) {
					local247 = local479;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && (float) arg1 > local245 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.anInt5342 > this.aClass122_Sub3_21.anIntArray765.length) {
				this.aClass122_Sub3_21.anIntArray765 = new int[this.anInt5342];
				this.aClass122_Sub3_21.anIntArray766 = new int[this.anInt5342];
			}
			@Pc(552) int[] local552 = this.aClass122_Sub3_21.anIntArray765;
			@Pc(556) int[] local556 = this.aClass122_Sub3_21.anIntArray766;
			@Pc(632) int local632;
			for (@Pc(558) int local558 = 0; local558 < this.anInt5332; local558++) {
				local390 = this.anIntArray539[local558];
				local400 = this.anIntArray536[local558];
				local395 = this.anIntArray534[local558];
				local414 = local33 + Static487.aFloat155 * local390 + Static347.aFloat118 * local395 + Static237.aFloat100 * local400;
				local428 = local201 + local390 * Static127.aFloat95 + local395 * Static354.aFloat119 + Static192.aFloat52 * local400;
				local442 = local54 + Static401.aFloat141 * local390 + Static442.aFloat146 * local395 + local400 * Static229.aFloat97;
				@Pc(639) int local639;
				@Pc(641) int local641;
				@Pc(650) int local650;
				if ((float) this.aClass122_Sub3_21.anInt8450 <= local428) {
					local632 = (int) ((float) this.aClass122_Sub3_21.anInt8438 + local414 * (float) local251 / local428);
					local639 = (int) ((float) local255 * local442 / local428 + (float) this.aClass122_Sub3_21.anInt8429);
					local641 = this.anIntArray538[local558];
					local650 = this.anIntArray538[local558 + 1];
					for (@Pc(713) int local713 = local641; local713 < local650; local713++) {
						@Pc(722) int local722 = this.aShortArray94[local713] - 1;
						if (local722 == -1) {
							break;
						}
						local552[local722] = local632;
						local556[local722] = local639;
					}
				} else {
					local632 = this.anIntArray538[local558];
					local639 = this.anIntArray538[local558 + 1];
					for (local641 = local632; local641 < local639; local641++) {
						local650 = this.aShortArray94[local641] - 1;
						if (local650 == -1) {
							break;
						}
						local552[this.aShortArray94[local641] - 1] = -999999;
					}
				}
			}
			for (local632 = 0; local632 < this.anInt5369; local632++) {
				if (local552[this.aShortArray102[local632]] != -999999 && local552[this.aShortArray100[local632]] != -999999 && local552[this.aShortArray96[local632]] != -999999 && this.method4602(arg0, local552[this.aShortArray102[local632]], local556[this.aShortArray102[local632]], local552[this.aShortArray100[local632]], arg1, local552[this.aShortArray96[local632]], local556[this.aShortArray100[local632]], local556[this.aShortArray96[local632]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLclient!hba;)V")
	private void method4609(@OriginalArg(1) Class118_Sub1 arg0) {
		@Pc(10) int local10;
		if (this.aClass161Array5 != null) {
			for (local10 = 0; local10 < this.aClass161Array5.length; local10++) {
				@Pc(17) Class161 local17 = this.aClass161Array5[local10];
				@Pc(19) Class161 local19 = local17;
				if (local17.aClass161_1 != null) {
					local19 = local17.aClass161_1;
				}
				local19.anInt4838 = (int) (arg0.aFloat37 + arg0.aFloat36 * (float) this.anIntArray534[local17.anInt4842] + arg0.aFloat42 * (float) this.anIntArray536[local17.anInt4842] + (float) this.anIntArray539[local17.anInt4842] * arg0.aFloat46);
				local19.anInt4848 = (int) ((float) this.anIntArray536[local17.anInt4842] * arg0.aFloat45 + (float) this.anIntArray534[local17.anInt4842] * arg0.aFloat39 + arg0.aFloat40 * (float) this.anIntArray539[local17.anInt4842] + arg0.aFloat43);
				local19.anInt4843 = (int) ((float) this.anIntArray534[local17.anInt4842] * arg0.aFloat41 + (float) this.anIntArray536[local17.anInt4842] * arg0.aFloat38 + (float) this.anIntArray539[local17.anInt4842] * arg0.aFloat35 + arg0.aFloat44);
				local19.anInt4849 = (int) (arg0.aFloat37 + (float) this.anIntArray536[local17.anInt4841] * arg0.aFloat42 + arg0.aFloat36 * (float) this.anIntArray534[local17.anInt4841] + (float) this.anIntArray539[local17.anInt4841] * arg0.aFloat46);
				local19.anInt4846 = (int) (arg0.aFloat40 * (float) this.anIntArray539[local17.anInt4841] + (float) this.anIntArray534[local17.anInt4841] * arg0.aFloat39 + (float) this.anIntArray536[local17.anInt4841] * arg0.aFloat45 + arg0.aFloat43);
				local19.anInt4850 = (int) (arg0.aFloat44 + (float) this.anIntArray539[local17.anInt4841] * arg0.aFloat35 + (float) this.anIntArray536[local17.anInt4841] * arg0.aFloat38 + arg0.aFloat41 * (float) this.anIntArray534[local17.anInt4841]);
				local19.anInt4839 = (int) ((float) this.anIntArray536[local17.anInt4847] * arg0.aFloat42 + arg0.aFloat36 * (float) this.anIntArray534[local17.anInt4847] + (float) this.anIntArray539[local17.anInt4847] * arg0.aFloat46 + arg0.aFloat37);
				local19.anInt4845 = (int) (arg0.aFloat43 + arg0.aFloat39 * (float) this.anIntArray534[local17.anInt4847] + (float) this.anIntArray536[local17.anInt4847] * arg0.aFloat45 + (float) this.anIntArray539[local17.anInt4847] * arg0.aFloat40);
				local19.anInt4840 = (int) (arg0.aFloat41 * (float) this.anIntArray534[local17.anInt4847] + arg0.aFloat38 * (float) this.anIntArray536[local17.anInt4847] + arg0.aFloat35 * (float) this.anIntArray539[local17.anInt4847] + arg0.aFloat44);
			}
		}
		if (this.aClass93Array5 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass93Array5.length; local10++) {
			@Pc(362) Class93 local362 = this.aClass93Array5[local10];
			@Pc(364) Class93 local364 = local362;
			if (local362.aClass93_1 != null) {
				local364 = local362.aClass93_1;
			}
			if (local362.aClass118_4 == null) {
				local362.aClass118_4 = arg0.method6964();
			} else {
				local362.aClass118_4.EA(arg0);
			}
			local364.anInt2652 = (int) (arg0.aFloat36 * (float) this.anIntArray534[local362.anInt2654] + arg0.aFloat42 * (float) this.anIntArray536[local362.anInt2654] + arg0.aFloat46 * (float) this.anIntArray539[local362.anInt2654] + arg0.aFloat37);
			local364.anInt2655 = (int) (arg0.aFloat43 + arg0.aFloat45 * (float) this.anIntArray536[local362.anInt2654] + arg0.aFloat39 * (float) this.anIntArray534[local362.anInt2654] + (float) this.anIntArray539[local362.anInt2654] * arg0.aFloat40);
			local364.anInt2651 = (int) (arg0.aFloat44 + (float) this.anIntArray539[local362.anInt2654] * arg0.aFloat35 + (float) this.anIntArray536[local362.anInt2654] * arg0.aFloat38 + arg0.aFloat41 * (float) this.anIntArray534[local362.anInt2654]);
		}
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "()[Lclient!kca;")
	@Override
	public Class161[] method6677() {
		return this.aClass161Array5;
	}

	@OriginalMember(owner = "client!lr", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		return this.anInt5340;
	}

	@OriginalMember(owner = "client!lr", name = "ca", descriptor = "(III)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5332; local3++) {
			if (arg0 != 0) {
				this.anIntArray536[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray534[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray539[local3] += arg2;
			}
		}
		this.aBoolean376 = false;
		if (this.aClass43_6 != null) {
			this.aClass43_6.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZLclient!mda;)V")
	private void method4610(@OriginalArg(1) Class1_Sub1_Sub9_Sub1 arg0) {
		if (this.anInt5342 > this.aClass122_Sub3_21.anIntArray765.length) {
			this.aClass122_Sub3_21.anIntArray766 = new int[this.anInt5342];
			this.aClass122_Sub3_21.anIntArray765 = new int[this.anInt5342];
		}
		@Pc(28) int[] local28 = this.aClass122_Sub3_21.anIntArray765;
		@Pc(32) int[] local32 = this.aClass122_Sub3_21.anIntArray766;
		@Pc(62) int local62;
		@Pc(100) int local100;
		@Pc(109) int local109;
		for (@Pc(34) int local34 = 0; local34 < this.anInt5332; local34++) {
			local62 = (this.anIntArray536[local34] - (this.anIntArray534[local34] * this.aClass122_Sub3_21.anInt8439 >> 8) >> this.aClass122_Sub3_21.anInt8421) - arg0.anInt5504;
			@Pc(86) int local86 = (this.anIntArray539[local34] - (this.anIntArray534[local34] * this.aClass122_Sub3_21.anInt8460 >> 8) >> this.aClass122_Sub3_21.anInt8421) - arg0.anInt5506;
			@Pc(91) int local91 = this.anIntArray538[local34];
			@Pc(98) int local98 = this.anIntArray538[local34 + 1];
			for (local100 = local91; local100 < local98; local100++) {
				local109 = this.aShortArray94[local100] - 1;
				if (local109 == -1) {
					break;
				}
				local28[local109] = local62;
				local32[local109] = local86;
			}
		}
		for (local62 = 0; local62 < this.anInt5349; local62++) {
			if (this.aByteArray78 == null || this.aByteArray78[local62] <= 128) {
				@Pc(152) short local152 = this.aShortArray102[local62];
				@Pc(157) short local157 = this.aShortArray100[local62];
				@Pc(162) short local162 = this.aShortArray96[local62];
				local100 = local28[local152];
				local109 = local28[local157];
				@Pc(174) int local174 = local28[local162];
				@Pc(178) int local178 = local32[local152];
				@Pc(182) int local182 = local32[local157];
				@Pc(186) int local186 = local32[local162];
				if (-((local182 - local178) * (-local109 + local174)) + (local100 - local109) * (local182 - local186) > 0) {
					arg0.method4716(local174, local182, local186, local100, local109, local178);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(SBIII)I")
	private int method4611(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = Static212.anIntArray347[Static480.method6618(arg2, arg3)];
		if (arg0 != -1) {
			@Pc(26) Class220 local26 = this.aClass122_Sub3_21.anInterface8_14.method878(arg0 & 0xFFFF);
			@Pc(31) int local31 = local26.aByte81 & 0xFF;
			@Pc(48) int local48;
			@Pc(71) int local71;
			if (local31 != 0) {
				if (arg2 < 0) {
					local48 = 0;
				} else if (arg2 > 127) {
					local48 = 16777215;
				} else {
					local48 = arg2 * 131586;
				}
				if (local31 == 256) {
					local12 = local48;
				} else {
					local71 = 256 - local31;
					local12 = (local71 * (local12 & 0xFF00) + (local48 & 0xFF00) * local31 & 0xFF0000) + (local31 * (local48 & 0xFF00FF) + (local12 & 0xFF00FF) * local71 & 0xFF00FF00) >> 8;
				}
			}
			local48 = local26.aByte84 & 0xFF;
			if (local48 != 0) {
				local48 += 256;
				@Pc(120) int local120 = (local12 >> 16 & 0xFF) * local48;
				if (local120 > 65535) {
					local120 = 65535;
				}
				local71 = local48 * (local12 >> 8 & 0xFF);
				if (local71 > 65535) {
					local71 = 65535;
				}
				@Pc(144) int local144 = local48 * (local12 & 0xFF);
				if (local144 > 65535) {
					local144 = 65535;
				}
				local12 = (local71 & 0xFF00) + ((local120 & 0x5A00FF00) << 8) + (local144 >> 8);
			}
		}
		return (local12 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIILclient!fp;FJFII)S")
	private short method4612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class97 arg3, @OriginalArg(5) float arg4, @OriginalArg(6) long arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(17) int local17 = this.anIntArray538[arg8];
		@Pc(24) int local24 = this.anIntArray538[arg8 + 1];
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = local17; local28 < local24; local28++) {
			@Pc(35) short local35 = this.aShortArray94[local28];
			if (local35 == 0) {
				local26 = local28;
				break;
			}
			if (arg5 == Static39.aLongArray1[local28]) {
				return (short) (local35 - 1);
			}
		}
		this.aShortArray94[local26] = (short) (this.anInt5342 + 1);
		Static39.aLongArray1[local26] = arg5;
		this.aShortArray98[this.anInt5342] = (short) arg1;
		this.aShortArray103[this.anInt5342] = (short) arg2;
		this.aShortArray104[this.anInt5342] = (short) arg7;
		this.aByteArray79[this.anInt5342] = (byte) arg0;
		this.aFloatArray36[this.anInt5342] = arg6;
		this.aFloatArray35[this.anInt5342] = arg4;
		return (short) this.anInt5342++;
	}

	@OriginalMember(owner = "client!lr", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	@Override
	public void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class205 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean376) {
			this.method4608();
		}
		@Pc(16) int local16 = arg4 + this.aShort96;
		@Pc(22) int local22 = arg4 + this.aShort91;
		@Pc(28) int local28 = arg6 + this.aShort93;
		@Pc(34) int local34 = arg6 + this.aShort90;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt8174 <= arg2.anInt8175 + local22 >> arg2.anInt8176 || local28 < 0 || arg2.anInt8177 <= local34 + arg2.anInt8175 >> arg2.anInt8176)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt8175 + local22 >> arg3.anInt8176 >= arg3.anInt8174 || local28 < 0 || arg3.anInt8175 + local34 >> arg3.anInt8176 >= arg3.anInt8177) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8176;
			local22 = arg2.anInt8175 + local22 - 1 >> arg2.anInt8176;
			local28 >>= arg2.anInt8176;
			local34 = local34 + arg2.anInt8175 - 1 >> arg2.anInt8176;
			if (arg2.ba(local16, local28) == arg5 && arg2.ba(local22, local28) == arg5 && arg2.ba(local16, local34) == arg5 && arg2.ba(local22, local34) == arg5) {
				return;
			}
		}
		@Pc(199) int local199;
		if (arg0 == 1) {
			for (local199 = 0; local199 < this.anInt5332; local199++) {
				this.anIntArray534[local199] -= arg5 - arg2.aa(arg4 + this.anIntArray536[local199], this.anIntArray539[local199] - -arg6);
			}
		} else {
			@Pc(249) int local249;
			@Pc(260) int local260;
			if (arg0 == 2) {
				@Pc(241) short local241 = this.aShort94;
				if (local241 == 0) {
					return;
				}
				for (local249 = 0; local249 < this.anInt5332; local249++) {
					local260 = (this.anIntArray534[local249] << 16) / local241;
					if (local260 < arg1) {
						this.anIntArray534[local249] += (arg1 - local260) * (-arg5 + arg2.aa(arg4 + this.anIntArray536[local249], arg6 + this.anIntArray539[local249])) / arg1;
					}
				}
			} else {
				@Pc(336) int local336;
				if (arg0 == 3) {
					local199 = (arg1 & 0xFF) * 4;
					local249 = (arg1 >> 8 & 0xFF) * 4;
					local260 = (arg1 >> 16 & 0xFF) << 6;
					local336 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local199 >> 1) < 0 || arg4 + (local199 >> 1) + arg2.anInt8175 >= arg2.anInt8174 << arg2.anInt8176 || arg6 - (local249 >> 1) < 0 || arg2.anInt8177 << arg2.anInt8176 <= arg2.anInt8175 + (local249 >> 1) + arg6) {
						return;
					}
					this.method6673(local260, local199, local249, arg2, arg5, local336, arg4, arg6);
				} else if (arg0 == 4) {
					local199 = this.aShort88 - this.aShort94;
					for (local249 = 0; local249 < this.anInt5332; local249++) {
						this.anIntArray534[local249] = local199 + this.anIntArray534[local249] + arg3.aa(this.anIntArray536[local249] - -arg4, this.anIntArray539[local249] + arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local199 = this.aShort88 - this.aShort94;
					for (local249 = 0; local249 < this.anInt5332; local249++) {
						local260 = this.anIntArray536[local249] + arg4;
						local336 = this.anIntArray539[local249] + arg6;
						@Pc(490) int local490 = arg2.aa(local260, local336);
						@Pc(495) int local495 = arg3.aa(local260, local336);
						@Pc(501) int local501 = local490 - local495 - arg1;
						this.anIntArray534[local249] = (local501 * ((this.anIntArray534[local249] << 8) / local199) >> 8) + local490 - arg5;
					}
				}
			}
		}
		if (this.aClass43_6 != null) {
			this.aClass43_6.anInterface2_1 = null;
		}
		this.aBoolean376 = false;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class145 method6672(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class145_Sub2 local14;
		@Pc(18) Class145_Sub2 local18;
		if (arg0 == 1) {
			local14 = this.aClass122_Sub3_21.aClass145_Sub2_3;
			local18 = this.aClass122_Sub3_21.aClass145_Sub2_2;
		} else if (arg0 == 2) {
			local14 = this.aClass122_Sub3_21.aClass145_Sub2_1;
			local18 = this.aClass122_Sub3_21.aClass145_Sub2_5;
		} else if (arg0 == 3) {
			local14 = this.aClass122_Sub3_21.aClass145_Sub2_10;
			local18 = this.aClass122_Sub3_21.aClass145_Sub2_9;
		} else if (arg0 == 4) {
			local18 = this.aClass122_Sub3_21.aClass145_Sub2_8;
			local14 = this.aClass122_Sub3_21.aClass145_Sub2_6;
		} else if (arg0 == 5) {
			local14 = this.aClass122_Sub3_21.aClass145_Sub2_4;
			local18 = this.aClass122_Sub3_21.aClass145_Sub2_7;
		} else {
			local14 = local18 = new Class145_Sub2(this.aClass122_Sub3_21);
		}
		return this.method4605(arg0 != 0, arg2, arg1, local18, local14);
	}
}
