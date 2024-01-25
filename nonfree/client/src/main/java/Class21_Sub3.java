import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class21_Sub3 extends Class21 {

	@OriginalMember(owner = "client!mf", name = "lb", descriptor = "[Ljava/lang/String;")
	public static final String[] lb = new String[100];

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "S")
	private short aShort74;

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "Lclient!ul;")
	private Interface21 anInterface21_3;

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
	private int anInt6645;

	@OriginalMember(owner = "client!mf", name = "z", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!mf", name = "B", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!mf", name = "C", descriptor = "[I")
	private int[] anIntArray437;

	@OriginalMember(owner = "client!mf", name = "D", descriptor = "B")
	private byte aByte69;

	@OriginalMember(owner = "client!mf", name = "E", descriptor = "[F")
	private float[] aFloatArray60;

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "[Lclient!qda;")
	private Class266[] aClass266Array1;

	@OriginalMember(owner = "client!mf", name = "I", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!mf", name = "K", descriptor = "[I")
	private int[] anIntArray438;

	@OriginalMember(owner = "client!mf", name = "N", descriptor = "S")
	private short aShort75;

	@OriginalMember(owner = "client!mf", name = "P", descriptor = "Lclient!sj;")
	private Interface16 anInterface16_5;

	@OriginalMember(owner = "client!mf", name = "R", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!mf", name = "S", descriptor = "[Lclient!o;")
	private Class234[] aClass234Array1;

	@OriginalMember(owner = "client!mf", name = "U", descriptor = "S")
	private short aShort76;

	@OriginalMember(owner = "client!mf", name = "V", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!mf", name = "Z", descriptor = "[Lclient!gi;")
	private Class121[] aClass121Array6;

	@OriginalMember(owner = "client!mf", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!mf", name = "eb", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!mf", name = "fb", descriptor = "S")
	private short aShort77;

	@OriginalMember(owner = "client!mf", name = "kb", descriptor = "[I")
	private int[] anIntArray439;

	@OriginalMember(owner = "client!mf", name = "mb", descriptor = "S")
	private short aShort78;

	@OriginalMember(owner = "client!mf", name = "tb", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!mf", name = "vb", descriptor = "S")
	private short aShort79;

	@OriginalMember(owner = "client!mf", name = "wb", descriptor = "[F")
	private float[] aFloatArray61;

	@OriginalMember(owner = "client!mf", name = "yb", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!mf", name = "Cb", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!mf", name = "Fb", descriptor = "I")
	private int anInt6675;

	@OriginalMember(owner = "client!mf", name = "Hb", descriptor = "S")
	private short aShort81;

	@OriginalMember(owner = "client!mf", name = "Jb", descriptor = "Lclient!ro;")
	private Class286 aClass286_1;

	@OriginalMember(owner = "client!mf", name = "Pb", descriptor = "S")
	private short aShort82;

	@OriginalMember(owner = "client!mf", name = "Xb", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!mf", name = "Yb", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!mf", name = "ec", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!mf", name = "gc", descriptor = "I")
	private int anInt6695;

	@OriginalMember(owner = "client!mf", name = "tc", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!mf", name = "uc", descriptor = "[Lclient!rea;")
	private Class280[] aClass280Array6;

	@OriginalMember(owner = "client!mf", name = "vc", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!mf", name = "ab", descriptor = "Z")
	private boolean aBoolean574 = true;

	@OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
	private int anInt6657 = 0;

	@OriginalMember(owner = "client!mf", name = "Rb", descriptor = "Z")
	private boolean aBoolean575 = false;

	@OriginalMember(owner = "client!mf", name = "Vb", descriptor = "I")
	private int anInt6687 = 0;

	@OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
	private int anInt6662 = 0;

	@OriginalMember(owner = "client!mf", name = "Gb", descriptor = "I")
	private int anInt6676 = 0;

	@OriginalMember(owner = "client!mf", name = "kc", descriptor = "I")
	private int anInt6697 = 0;

	@OriginalMember(owner = "client!mf", name = "xb", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_22;

	@OriginalMember(owner = "client!mf", name = "qb", descriptor = "Lclient!vv;")
	private Class346 aClass346_10;

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "Lclient!vv;")
	private Class346 aClass346_9;

	@OriginalMember(owner = "client!mf", name = "hc", descriptor = "Lclient!vv;")
	private Class346 aClass346_11;

	@OriginalMember(owner = "client!mf", name = "mc", descriptor = "Lclient!vv;")
	private Class346 aClass346_12;

	@OriginalMember(owner = "client!mf", name = "Ab", descriptor = "Lclient!nca;")
	private Class224 aClass224_1;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class21_Sub3(@OriginalArg(0) Class15_Sub3 arg0) {
		this.aClass15_Sub3_22 = arg0;
		this.aClass346_10 = new Class346(null, 5126, 3, 0);
		this.aClass346_9 = new Class346(null, 5126, 2, 0);
		this.aClass346_11 = new Class346(null, 5126, 3, 0);
		this.aClass346_12 = new Class346(null, 5121, 4, 0);
		this.aClass224_1 = new Class224();
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!ji;Lclient!fca;IIII)V")
	public Class21_Sub3(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6695 = arg2;
		this.aClass15_Sub3_22 = arg0;
		this.anInt6675 = arg5;
		if (Static259.method4588(arg2, arg5)) {
			this.aClass346_10 = new Class346(null, 5126, 3, 0);
		}
		if (Static387.method6199(arg2, arg5)) {
			this.aClass346_9 = new Class346(null, 5126, 2, 0);
		}
		if (Static263.method4657(arg5, arg2)) {
			this.aClass346_11 = new Class346(null, 5126, 3, 0);
		}
		if (Static259.method4587(arg2, arg5)) {
			this.aClass346_12 = new Class346(null, 5121, 4, 0);
		}
		if (Static390.method6233(arg5, arg2)) {
			this.aClass224_1 = new Class224();
		}
		@Pc(102) Interface4 local102 = arg0.anInterface4_11;
		this.anIntArray435 = new int[arg1.anInt3172 + 1];
		@Pc(113) int[] local113 = new int[arg1.anInt3177];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt3177; local115++) {
			if ((arg1.aByteArray47 == null || arg1.aByteArray47[local115] != 2) && (arg1.aShortArray52 == null || arg1.aShortArray52[local115] == -1 || !local102.method3088(arg1.aShortArray52[local115] & 0xFFFF).aBoolean493)) {
				local113[this.anInt6657++] = local115;
				this.anIntArray435[arg1.aShortArray48[local115]]++;
				this.anIntArray435[arg1.aShortArray53[local115]]++;
				this.anIntArray435[arg1.aShortArray49[local115]]++;
			}
		}
		this.anInt6676 = this.anInt6657;
		@Pc(209) long[] local209 = new long[this.anInt6657];
		@Pc(218) boolean local218 = (this.anInt6695 & 0x100) != 0;
		@Pc(230) int local230;
		@Pc(241) int local241;
		@Pc(380) int local380;
		label493: for (@Pc(220) int local220 = 0; local220 < this.anInt6657; local220++) {
			@Pc(226) int local226 = local113[local220];
			@Pc(228) Class178 local228 = null;
			local230 = 0;
			@Pc(232) byte local232 = 0;
			@Pc(234) byte local234 = 0;
			@Pc(236) byte local236 = 0;
			if (arg1.aClass275Array1 != null) {
				for (local241 = 0; local241 < arg1.aClass275Array1.length; local241++) {
					@Pc(248) Class275 local248 = arg1.aClass275Array1[local241];
					if (local248.anInt8401 == local226) {
						@Pc(261) Class198 local261 = Static53.method1292(local248.anInt8402);
						if (local261.aBoolean514) {
							local209[local220] = Long.MAX_VALUE;
							this.anInt6676--;
							continue label493;
						}
					}
				}
			}
			@Pc(288) short local288 = -1;
			if (arg1.aShortArray52 != null) {
				local288 = arg1.aShortArray52[local226];
				if (local288 != -1) {
					local228 = local102.method3088(local288 & 0xFFFF);
					local236 = local228.aByte58;
					local234 = local228.aByte54;
				}
			}
			@Pc(336) boolean local336 = arg1.aByteArray43 != null && arg1.aByteArray43[local226] != 0 || local228 != null && !local228.aBoolean489 | local228.aBoolean494;
			if ((local218 || local336) && arg1.aByteArray41 != null) {
				local230 += arg1.aByteArray41[local226] << 17;
			}
			if (local336) {
				local230 += 65536;
			}
			local230 += (local234 & 0xFF) << 8;
			local230 += local236 & 0xFF;
			local380 = local232 + ((local288 & 0xFFFF) << 16);
			@Pc(386) int local386 = local380 + (local220 & 0xFFFF);
			local209[local220] = ((long) local230 << 32) + (long) local386;
		}
		Static545.method7995(local209, local113);
		this.anIntArray439 = arg1.anIntArray200;
		this.anIntArray438 = arg1.anIntArray198;
		this.anInt6687 = arg1.anInt3170;
		this.aShortArray99 = arg1.aShortArray51;
		this.anIntArray436 = arg1.anIntArray202;
		this.anInt6662 = arg1.anInt3172;
		this.aClass280Array6 = arg1.aClass280Array2;
		this.aClass121Array6 = arg1.aClass121Array2;
		@Pc(441) Class249[] local441 = new Class249[this.anInt6662];
		@Pc(461) int local461;
		@Pc(475) int local475;
		if (arg1.aClass275Array1 != null) {
			this.anInt6645 = arg1.aClass275Array1.length;
			this.aClass234Array1 = new Class234[this.anInt6645];
			this.aClass266Array1 = new Class266[this.anInt6645];
			for (local461 = 0; local461 < this.anInt6645; local461++) {
				@Pc(468) Class275 local468 = arg1.aClass275Array1[local461];
				@Pc(473) Class198 local473 = Static53.method1292(local468.anInt8402);
				local475 = -1;
				for (@Pc(477) int local477 = 0; local477 < this.anInt6657; local477++) {
					if (local113[local477] == local468.anInt8401) {
						local475 = local477;
						break;
					}
				}
				if (local475 == -1) {
					throw new RuntimeException();
				}
				local241 = Static331.anIntArray442[arg1.aShortArray56[local468.anInt8401] & 0xFFFF] & 0xFFFFFF;
				local241 |= 255 - (arg1.aByteArray43 == null ? 0 : arg1.aByteArray43[local468.anInt8401]) << 24;
				this.aClass266Array1[local461] = new Class266(local475, arg1.aShortArray48[local468.anInt8401], arg1.aShortArray53[local468.anInt8401], arg1.aShortArray49[local468.anInt8401], local473.anInt6034, local473.anInt6039, local473.anInt6035, local473.anInt6036, local473.anInt6037, local473.aBoolean514, local473.aBoolean513, local468.anInt8398);
				this.aClass234Array1[local461] = new Class234(local241);
			}
		}
		local461 = this.anInt6657 * 3;
		this.aShort82 = (short) arg3;
		this.aFloatArray60 = new float[local461];
		this.aShortArray108 = new short[this.anInt6657];
		this.aShortArray103 = new short[this.anInt6657];
		this.aShortArray102 = new short[this.anInt6657];
		Static135.aLongArray6 = new long[local461];
		this.aShortArray100 = new short[this.anInt6657];
		this.aByteArray77 = new byte[this.anInt6657];
		this.aByteArray76 = new byte[local461];
		this.aShort78 = (short) arg4;
		this.aShortArray98 = new short[this.anInt6657];
		this.aShortArray107 = new short[local461];
		this.aShortArray105 = new short[local461];
		this.aShortArray106 = new short[local461];
		this.aFloatArray61 = new float[local461];
		this.aShortArray101 = new short[local461];
		if (arg1.aShortArray55 != null) {
			this.aShortArray104 = new short[this.anInt6657];
		}
		local230 = 0;
		for (local380 = 0; local380 < arg1.anInt3172; local380++) {
			local475 = this.anIntArray435[local380];
			this.anIntArray435[local380] = local230;
			local230 += local475;
			local441[local380] = new Class249();
		}
		this.anIntArray435[arg1.anInt3172] = local230;
		@Pc(711) int[] local711 = null;
		@Pc(713) int[] local713 = null;
		@Pc(715) int[] local715 = null;
		@Pc(717) float[][] local717 = null;
		@Pc(743) int local743;
		@Pc(782) int local782;
		@Pc(788) int local788;
		@Pc(802) int local802;
		@Pc(804) int local804;
		@Pc(840) int local840;
		@Pc(845) int local845;
		@Pc(1003) float local1003;
		@Pc(999) float local999;
		@Pc(1005) float local1005;
		if (arg1.aByteArray42 != null) {
			@Pc(723) int local723 = arg1.anInt3183;
			@Pc(726) int[] local726 = new int[local723];
			@Pc(729) int[] local729 = new int[local723];
			@Pc(732) int[] local732 = new int[local723];
			@Pc(735) int[] local735 = new int[local723];
			@Pc(738) int[] local738 = new int[local723];
			@Pc(741) int[] local741 = new int[local723];
			for (local743 = 0; local743 < local723; local743++) {
				local726[local743] = Integer.MAX_VALUE;
				local729[local743] = -2147483647;
				local732[local743] = Integer.MAX_VALUE;
				local735[local743] = -2147483647;
				local738[local743] = Integer.MAX_VALUE;
				local741[local743] = -2147483647;
			}
			local713 = new int[local723];
			for (local782 = 0; local782 < this.anInt6657; local782++) {
				local788 = local113[local782];
				if (arg1.aByteArray42[local788] != -1) {
					local802 = arg1.aByteArray42[local788] & 0xFF;
					for (local804 = 0; local804 < 3; local804++) {
						@Pc(816) short local816;
						if (local804 == 0) {
							local816 = arg1.aShortArray48[local788];
						} else if (local804 == 1) {
							local816 = arg1.aShortArray53[local788];
						} else {
							local816 = arg1.aShortArray49[local788];
						}
						local840 = arg1.anIntArray202[local816];
						local845 = arg1.anIntArray198[local816];
						@Pc(850) int local850 = arg1.anIntArray200[local816];
						if (local840 < local726[local802]) {
							local726[local802] = local840;
						}
						if (local729[local802] < local840) {
							local729[local802] = local840;
						}
						if (local845 < local732[local802]) {
							local732[local802] = local845;
						}
						if (local845 > local735[local802]) {
							local735[local802] = local845;
						}
						if (local850 < local738[local802]) {
							local738[local802] = local850;
						}
						if (local741[local802] < local850) {
							local741[local802] = local850;
						}
					}
				}
			}
			local717 = new float[local723][];
			local711 = new int[local723];
			local715 = new int[local723];
			for (local788 = 0; local788 < local723; local788++) {
				@Pc(943) byte local943 = arg1.aByteArray44[local788];
				if (local943 > 0) {
					local711[local788] = (local726[local788] + local729[local788]) / 2;
					local713[local788] = (local732[local788] + local735[local788]) / 2;
					local715[local788] = (local741[local788] + local738[local788]) / 2;
					if (local943 == 1) {
						local845 = arg1.anIntArray197[local788];
						local999 = 64.0F / (float) arg1.anIntArray194[local788];
						if (local845 == 0) {
							local1003 = 1.0F;
							local1005 = 1.0F;
						} else if (local845 > 0) {
							local1005 = (float) local845 / 1024.0F;
							local1003 = 1.0F;
						} else {
							local1003 = (float) -local845 / 1024.0F;
							local1005 = 1.0F;
						}
					} else if (local943 == 2) {
						local999 = 64.0F / (float) arg1.anIntArray194[local788];
						local1003 = 64.0F / (float) arg1.anIntArray197[local788];
						local1005 = 64.0F / (float) arg1.anIntArray201[local788];
					} else {
						local1003 = (float) arg1.anIntArray197[local788] / 1024.0F;
						local999 = (float) arg1.anIntArray194[local788] / 1024.0F;
						local1005 = (float) arg1.anIntArray201[local788] / 1024.0F;
					}
					local717[local788] = Static57.method1331(arg1.aByteArray46[local788] & 0xFF, local1005, arg1.aShortArray57[local788], local999, arg1.aShortArray54[local788], local1003, arg1.aShortArray50[local788]);
				}
			}
		}
		@Pc(1115) Class54[] local1115 = new Class54[arg1.anInt3177];
		@Pc(1134) short local1134;
		@Pc(1145) int local1145;
		@Pc(1156) int local1156;
		@Pc(1218) int local1218;
		for (@Pc(1117) int local1117 = 0; local1117 < arg1.anInt3177; local1117++) {
			@Pc(1124) short local1124 = arg1.aShortArray48[local1117];
			@Pc(1129) short local1129 = arg1.aShortArray53[local1117];
			local1134 = arg1.aShortArray49[local1117];
			local1145 = this.anIntArray436[local1129] - this.anIntArray436[local1124];
			local1156 = this.anIntArray438[local1129] - this.anIntArray438[local1124];
			local743 = this.anIntArray439[local1129] - this.anIntArray439[local1124];
			local782 = this.anIntArray436[local1134] - this.anIntArray436[local1124];
			local788 = this.anIntArray438[local1134] - this.anIntArray438[local1124];
			local802 = this.anIntArray439[local1134] - this.anIntArray439[local1124];
			local804 = local802 * local1156 - local743 * local788;
			local1218 = local743 * local782 - local802 * local1145;
			local840 = local1145 * local788 - local782 * local1156;
			while (local804 > 8192 || local1218 > 8192 || local840 > 8192 || local804 < -8192 || local1218 < -8192 || local840 < -8192) {
				local840 >>= 0x1;
				local804 >>= 0x1;
				local1218 >>= 0x1;
			}
			local845 = (int) Math.sqrt((double) (local804 * local804 + local1218 * local1218 + local840 * local840));
			if (local845 <= 0) {
				local845 = 1;
			}
			local840 = local840 * 256 / local845;
			local1218 = local1218 * 256 / local845;
			local804 = local804 * 256 / local845;
			@Pc(1317) byte local1317 = arg1.aByteArray47 == null ? 0 : arg1.aByteArray47[local1117];
			if (local1317 == 0) {
				@Pc(1350) Class249 local1350 = local441[local1124];
				local1350.anInt7451 += local1218;
				local1350.anInt7453++;
				local1350.anInt7450 += local804;
				local1350.anInt7455 += local840;
				@Pc(1378) Class249 local1378 = local441[local1129];
				local1378.anInt7450 += local804;
				local1378.anInt7455 += local840;
				local1378.anInt7451 += local1218;
				local1378.anInt7453++;
				@Pc(1406) Class249 local1406 = local441[local1134];
				local1406.anInt7451 += local1218;
				local1406.anInt7450 += local804;
				local1406.anInt7455 += local840;
				local1406.anInt7453++;
			} else if (local1317 == 1) {
				@Pc(1335) Class54 local1335 = local1115[local1117] = new Class54();
				local1335.anInt1889 = local1218;
				local1335.anInt1886 = local804;
				local1335.anInt1887 = local840;
			}
		}
		@Pc(1443) int local1443;
		for (@Pc(1437) int local1437 = 0; local1437 < this.anInt6657; local1437++) {
			local1443 = local113[local1437];
			@Pc(1450) int local1450 = arg1.aShortArray56[local1443] & 0xFFFF;
			@Pc(1458) short local1458;
			if (arg1.aShortArray52 == null) {
				local1458 = -1;
			} else {
				local1458 = arg1.aShortArray52[local1443];
			}
			if (arg1.aByteArray42 == null) {
				local1156 = -1;
			} else {
				local1156 = arg1.aByteArray42[local1443];
			}
			if (arg1.aByteArray43 == null) {
				local743 = 0;
			} else {
				local743 = arg1.aByteArray43[local1443] & 0xFF;
			}
			@Pc(1490) float local1490 = 0.0F;
			@Pc(1492) float local1492 = 0.0F;
			@Pc(1494) float local1494 = 0.0F;
			local1003 = 0.0F;
			local999 = 0.0F;
			local1005 = 0.0F;
			@Pc(1502) byte local1502 = 0;
			@Pc(1504) byte local1504 = 0;
			@Pc(1506) int local1506 = 0;
			@Pc(1541) byte local1541;
			@Pc(1558) short local1558;
			@Pc(2306) short local2306;
			@Pc(2311) short local2311;
			if (local1458 != -1) {
				if (local1156 == -1) {
					local1490 = 0.0F;
					local1494 = 1.0F;
					local1005 = 0.0F;
					local1492 = 1.0F;
					local1003 = 1.0F;
					local1502 = 1;
					local999 = 0.0F;
					local1504 = 2;
				} else {
					local1156 &= 0xFF;
					local1541 = arg1.aByteArray44[local1156];
					@Pc(1548) short local1548;
					@Pc(1553) short local1553;
					@Pc(1587) float local1587;
					@Pc(1804) float local1804;
					@Pc(1812) float local1812;
					@Pc(1910) float local1910;
					@Pc(1918) float local1918;
					@Pc(1926) float local1926;
					@Pc(1949) float local1949;
					@Pc(1972) float local1972;
					@Pc(1995) float local1995;
					if (local1541 == 0) {
						local1548 = arg1.aShortArray48[local1443];
						local1553 = arg1.aShortArray53[local1443];
						local1558 = arg1.aShortArray49[local1443];
						local2306 = arg1.aShortArray50[local1156];
						local2311 = arg1.aShortArray57[local1156];
						@Pc(2316) short local2316 = arg1.aShortArray54[local1156];
						@Pc(2322) float local2322 = (float) arg1.anIntArray202[local2306];
						@Pc(2328) float local2328 = (float) arg1.anIntArray198[local2306];
						local1587 = arg1.anIntArray200[local2306];
						local1804 = (float) arg1.anIntArray202[local2311] - local2322;
						local1812 = (float) arg1.anIntArray198[local2311] - local2328;
						@Pc(2358) float local2358 = (float) arg1.anIntArray200[local2311] - local1587;
						@Pc(2367) float local2367 = (float) arg1.anIntArray202[local2316] - local2322;
						@Pc(2376) float local2376 = (float) arg1.anIntArray198[local2316] - local2328;
						@Pc(2384) float local2384 = (float) arg1.anIntArray200[local2316] - local1587;
						@Pc(2393) float local2393 = (float) arg1.anIntArray202[local1548] - local2322;
						@Pc(2401) float local2401 = (float) arg1.anIntArray198[local1548] - local2328;
						@Pc(2409) float local2409 = (float) arg1.anIntArray200[local1548] - local1587;
						@Pc(2418) float local2418 = (float) arg1.anIntArray202[local1553] - local2322;
						@Pc(2427) float local2427 = (float) arg1.anIntArray198[local1553] - local2328;
						local1910 = (float) arg1.anIntArray200[local1553] - local1587;
						local1918 = (float) arg1.anIntArray202[local1558] - local2322;
						local1926 = (float) arg1.anIntArray198[local1558] - local2328;
						local1949 = (float) arg1.anIntArray200[local1558] - local1587;
						local1972 = local1812 * local2384 - local2376 * local2358;
						local1995 = local2358 * local2367 - local2384 * local1804;
						@Pc(2485) float local2485 = local2376 * local1804 - local1812 * local2367;
						@Pc(2493) float local2493 = local2485 * local2376 - local1995 * local2384;
						@Pc(2502) float local2502 = local1972 * local2384 - local2485 * local2367;
						@Pc(2511) float local2511 = local1995 * local2367 - local2376 * local1972;
						@Pc(2525) float local2525 = 1.0F / (local1812 * local2502 + local2493 * local1804 + local2358 * local2511);
						local1490 = local2525 * (local2409 * local2511 + local2502 * local2401 + local2393 * local2493);
						local1494 = (local1910 * local2511 + local2502 * local2427 + local2418 * local2493) * local2525;
						local999 = (local1949 * local2511 + local2493 * local1918 + local2502 * local1926) * local2525;
						@Pc(2576) float local2576 = local2358 * local1972 - local1804 * local2485;
						@Pc(2585) float local2585 = local1804 * local1995 - local1812 * local1972;
						@Pc(2594) float local2594 = local1812 * local2485 - local1995 * local2358;
						@Pc(2608) float local2608 = 1.0F / (local2367 * local2594 + local2576 * local2376 + local2384 * local2585);
						local1005 = local2608 * (local2576 * local1926 + local2594 * local1918 + local2585 * local1949);
						local1003 = local2608 * (local2594 * local2418 + local2576 * local2427 + local2585 * local1910);
						local1492 = local2608 * (local2409 * local2585 + local2393 * local2594 + local2576 * local2401);
					} else {
						local1548 = arg1.aShortArray48[local1443];
						local1553 = arg1.aShortArray53[local1443];
						local1558 = arg1.aShortArray49[local1443];
						@Pc(1562) int local1562 = local711[local1156];
						@Pc(1566) int local1566 = local713[local1156];
						@Pc(1570) int local1570 = local715[local1156];
						@Pc(1574) float[] local1574 = local717[local1156];
						@Pc(1579) byte local1579 = arg1.aByteArray45[local1156];
						local1587 = (float) arg1.anIntArray199[local1156] / 256.0F;
						if (local1541 == 1) {
							local1804 = (float) arg1.anIntArray201[local1156] / 1024.0F;
							Static293.method4981(local1570, local1579, local1574, arg1.anIntArray202[local1548], arg1.anIntArray200[local1548], local1587, local1566, local1562, arg1.anIntArray198[local1548], local1804);
							local1492 = Static430.aFloat174;
							local1490 = Static314.aFloat124;
							Static293.method4981(local1570, local1579, local1574, arg1.anIntArray202[local1553], arg1.anIntArray200[local1553], local1587, local1566, local1562, arg1.anIntArray198[local1553], local1804);
							local1494 = Static314.aFloat124;
							local1003 = Static430.aFloat174;
							Static293.method4981(local1570, local1579, local1574, arg1.anIntArray202[local1558], arg1.anIntArray200[local1558], local1587, local1566, local1562, arg1.anIntArray198[local1558], local1804);
							local999 = Static314.aFloat124;
							local1005 = Static430.aFloat174;
							local1812 = local1804 / 2.0F;
							if ((local1579 & 0x1) == 0) {
								if (local1812 < local1494 - local1490) {
									local1494 -= local1804;
									local1502 = 1;
								} else if (local1490 - local1494 > local1812) {
									local1494 += local1804;
									local1502 = 2;
								}
								if (local999 - local1490 > local1812) {
									local999 -= local1804;
									local1504 = 1;
								} else if (local1812 < local1490 - local999) {
									local999 += local1804;
									local1504 = 2;
								}
							} else {
								if (local1812 < local1005 - local1492) {
									local1504 = 1;
									local1005 -= local1804;
								} else if (local1492 - local1005 > local1812) {
									local1504 = 2;
									local1005 += local1804;
								}
								if (local1003 - local1492 > local1812) {
									local1003 -= local1804;
									local1502 = 1;
								} else if (local1812 < local1492 - local1003) {
									local1502 = 2;
									local1003 += local1804;
								}
							}
						} else if (local1541 == 2) {
							local1804 = (float) arg1.anIntArray196[local1156] / 256.0F;
							local1812 = (float) arg1.anIntArray195[local1156] / 256.0F;
							@Pc(1823) int local1823 = arg1.anIntArray202[local1553] - arg1.anIntArray202[local1548];
							@Pc(1834) int local1834 = arg1.anIntArray198[local1553] - arg1.anIntArray198[local1548];
							@Pc(1844) int local1844 = arg1.anIntArray200[local1553] - arg1.anIntArray200[local1548];
							@Pc(1854) int local1854 = arg1.anIntArray202[local1558] - arg1.anIntArray202[local1548];
							@Pc(1864) int local1864 = arg1.anIntArray198[local1558] - arg1.anIntArray198[local1548];
							@Pc(1875) int local1875 = arg1.anIntArray200[local1558] - arg1.anIntArray200[local1548];
							@Pc(1884) int local1884 = local1834 * local1875 - local1864 * local1844;
							@Pc(1893) int local1893 = local1844 * local1854 - local1823 * local1875;
							@Pc(1902) int local1902 = local1864 * local1823 - local1834 * local1854;
							local1910 = 64.0F / (float) arg1.anIntArray197[local1156];
							local1918 = 64.0F / (float) arg1.anIntArray194[local1156];
							local1926 = 64.0F / (float) arg1.anIntArray201[local1156];
							local1949 = (local1574[1] * (float) local1893 + local1574[0] * (float) local1884 + (float) local1902 * local1574[2]) / local1910;
							local1972 = ((float) local1902 * local1574[5] + local1574[4] * (float) local1893 + local1574[3] * (float) local1884) / local1918;
							local1995 = (local1574[6] * (float) local1884 + local1574[7] * (float) local1893 + local1574[8] * (float) local1902) / local1926;
							local1506 = Static166.method3097(local1972, local1949, local1995);
							Static488.method2075(arg1.anIntArray202[local1548], local1574, local1587, local1570, local1562, local1804, local1506, local1579, arg1.anIntArray198[local1548], arg1.anIntArray200[local1548], local1566, local1812);
							local1492 = Static455.aFloat177;
							local1490 = Static404.aFloat171;
							Static488.method2075(arg1.anIntArray202[local1553], local1574, local1587, local1570, local1562, local1804, local1506, local1579, arg1.anIntArray198[local1553], arg1.anIntArray200[local1553], local1566, local1812);
							local1494 = Static404.aFloat171;
							local1003 = Static455.aFloat177;
							Static488.method2075(arg1.anIntArray202[local1558], local1574, local1587, local1570, local1562, local1804, local1506, local1579, arg1.anIntArray198[local1558], arg1.anIntArray200[local1558], local1566, local1812);
							local999 = Static404.aFloat171;
							local1005 = Static455.aFloat177;
						} else if (local1541 == 3) {
							Static355.method4580(local1562, local1566, local1570, arg1.anIntArray198[local1548], arg1.anIntArray200[local1548], local1579, local1587, local1574, arg1.anIntArray202[local1548]);
							local1490 = Static413.aFloat172;
							local1492 = Static496.aFloat182;
							Static355.method4580(local1562, local1566, local1570, arg1.anIntArray198[local1553], arg1.anIntArray200[local1553], local1579, local1587, local1574, arg1.anIntArray202[local1553]);
							local1494 = Static413.aFloat172;
							local1003 = Static496.aFloat182;
							Static355.method4580(local1562, local1566, local1570, arg1.anIntArray198[local1558], arg1.anIntArray200[local1558], local1579, local1587, local1574, arg1.anIntArray202[local1558]);
							local1005 = Static496.aFloat182;
							local999 = Static413.aFloat172;
							if ((local1579 & 0x1) == 0) {
								if (local1494 - local1490 > 0.5F) {
									local1494--;
									local1502 = 1;
								} else if (local1490 - local1494 > 0.5F) {
									local1502 = 2;
									local1494++;
								}
								if (local999 - local1490 > 0.5F) {
									local999--;
									local1504 = 1;
								} else if (local1490 - local999 > 0.5F) {
									local1504 = 2;
									local999++;
								}
							} else {
								if (local1003 - local1492 > 0.5F) {
									local1502 = 1;
									local1003--;
								} else if (local1492 - local1003 > 0.5F) {
									local1003++;
									local1502 = 2;
								}
								if (local1005 - local1492 > 0.5F) {
									local1005--;
									local1504 = 1;
								} else if (local1492 - local1005 > 0.5F) {
									local1005++;
									local1504 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray47 == null) {
				local1541 = 0;
			} else {
				local1541 = arg1.aByteArray47[local1443];
			}
			if (local1541 == 0) {
				@Pc(2685) long local2685 = ((long) (local1450 << 8) + (long) (local1506 << 24) + (long) local743 << 32) + (long) (local1156 << 2);
				local1558 = arg1.aShortArray48[local1443];
				local2306 = arg1.aShortArray53[local1443];
				local2311 = arg1.aShortArray49[local1443];
				@Pc(2704) Class249 local2704 = local441[local1558];
				this.aShortArray108[local1437] = this.method5575(local1490, local2704.anInt7453, local1558, local2704.anInt7455, local2704.anInt7450, local2704.anInt7451, local2685, arg1, local1492);
				@Pc(2728) Class249 local2728 = local441[local2306];
				this.aShortArray100[local1437] = this.method5575(local1494, local2728.anInt7453, local2306, local2728.anInt7455, local2728.anInt7450, local2728.anInt7451, (long) local1502 + local2685, arg1, local1003);
				@Pc(2755) Class249 local2755 = local441[local2311];
				this.aShortArray102[local1437] = this.method5575(local999, local2755.anInt7453, local2311, local2755.anInt7455, local2755.anInt7450, local2755.anInt7451, local2685 + (long) local1504, arg1, local1005);
			} else if (local1541 == 1) {
				@Pc(2787) Class54 local2787 = local1115[local1443];
				@Pc(2834) long local2834 = ((long) (local1450 << 8) + (long) (local1506 << 24) + (long) local743 << 32) + (long) ((local1156 << 2) - (-(local2787.anInt1886 > 0 ? 1024 : 2048) - (local2787.anInt1889 + 256 << 12) - (local2787.anInt1887 + 256 << 22)));
				this.aShortArray108[local1437] = this.method5575(local1490, 0, arg1.aShortArray48[local1443], local2787.anInt1887, local2787.anInt1886, local2787.anInt1889, local2834, arg1, local1492);
				this.aShortArray100[local1437] = this.method5575(local1494, 0, arg1.aShortArray53[local1443], local2787.anInt1887, local2787.anInt1886, local2787.anInt1889, local2834 + (long) local1502, arg1, local1003);
				this.aShortArray102[local1437] = this.method5575(local999, 0, arg1.aShortArray49[local1443], local2787.anInt1887, local2787.anInt1886, local2787.anInt1889, local2834 + (long) local1504, arg1, local1005);
			}
			if (arg1.aShortArray52 == null) {
				this.aShortArray98[local1437] = -1;
			} else {
				this.aShortArray98[local1437] = arg1.aShortArray52[local1443];
			}
			if (arg1.aByteArray43 != null) {
				this.aByteArray77[local1437] = arg1.aByteArray43[local1443];
			}
			if (arg1.aShortArray55 != null) {
				this.aShortArray104[local1437] = arg1.aShortArray55[local1443];
			}
			this.aShortArray103[local1437] = arg1.aShortArray56[local1443];
		}
		local1443 = 0;
		local1134 = -10000;
		for (local1145 = 0; local1145 < this.anInt6676; local1145++) {
			@Pc(2972) short local2972 = this.aShortArray98[local1145];
			if (local1134 != local2972) {
				local1134 = local2972;
				local1443++;
			}
		}
		this.anIntArray437 = new int[local1443 + 1];
		local1134 = -10000;
		local1443 = 0;
		for (local1156 = 0; local1156 < this.anInt6676; local1156++) {
			@Pc(3006) short local3006 = this.aShortArray98[local1156];
			if (local3006 != local1134) {
				this.anIntArray437[local1443++] = local1156;
				local1134 = local3006;
			}
		}
		this.anIntArray437[local1443] = this.anInt6676;
		Static135.aLongArray6 = null;
		this.aShortArray105 = Static92.method2097(this.aShortArray105, this.anInt6697);
		this.aShortArray107 = Static92.method2097(this.aShortArray107, this.anInt6697);
		this.aShortArray106 = Static92.method2097(this.aShortArray106, this.anInt6697);
		this.aByteArray76 = Static380.method6132(this.aByteArray76, this.anInt6697);
		this.aFloatArray61 = Static207.method3627(this.aFloatArray61, this.anInt6697);
		this.aFloatArray60 = Static207.method3627(this.aFloatArray60, this.anInt6697);
		if (arg1.anIntArray193 != null && Static534.method7871(arg2, this.anInt6675)) {
			this.anIntArrayArray55 = arg1.method2784(false);
		}
		if (arg1.aClass275Array1 != null && Static552.method8062(arg2, this.anInt6675)) {
			this.anIntArrayArray53 = arg1.method2780();
		}
		if (arg1.anIntArray203 != null && Static91.method2090(this.anInt6675, arg2)) {
			local743 = 0;
			@Pc(3121) int[] local3121 = new int[256];
			for (local788 = 0; local788 < this.anInt6657; local788++) {
				local802 = arg1.anIntArray203[local113[local788]];
				if (local802 >= 0) {
					@Pc(3138) int local3138 = local3121[local802]++;
					if (local743 < local802) {
						local743 = local802;
					}
				}
			}
			this.anIntArrayArray54 = new int[local743 + 1][];
			for (local802 = 0; local802 <= local743; local802++) {
				this.anIntArrayArray54[local802] = new int[local3121[local802]];
				local3121[local802] = 0;
			}
			for (local804 = 0; local804 < this.anInt6657; local804++) {
				local1218 = arg1.anIntArray203[local113[local804]];
				if (local1218 >= 0) {
					this.anIntArrayArray54[local1218][local3121[local1218]++] = local804;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "()Z")
	@Override
	public boolean method7134() {
		if (this.aShortArray98 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray98.length; local12++) {
			if (this.aShortArray98[local12] != -1 && !this.aClass15_Sub3_22.anInterface4_11.method3090(this.aShortArray98[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mf", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		this.anInt6695 = arg0;
		if (this.aClass286_1 != null && (this.anInt6695 & 0x10000) == 0) {
			this.aShortArray106 = this.aClass286_1.aShortArray132;
			this.aShortArray105 = this.aClass286_1.aShortArray131;
			this.aByteArray76 = this.aClass286_1.aByteArray93;
			this.aShortArray107 = this.aClass286_1.aShortArray133;
			this.aClass286_1 = null;
		}
		this.aBoolean574 = true;
		this.method5578();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!bf;)V")
	private void method5572(@OriginalArg(1) Class3_Sub4_Sub2_Sub1 arg0) {
		if (this.anInt6697 > this.aClass15_Sub3_22.anIntArray316.length) {
			this.aClass15_Sub3_22.anIntArray316 = new int[this.anInt6697];
			this.aClass15_Sub3_22.anIntArray315 = new int[this.anInt6697];
		}
		@Pc(32) int[] local32 = this.aClass15_Sub3_22.anIntArray316;
		@Pc(36) int[] local36 = this.aClass15_Sub3_22.anIntArray315;
		@Pc(64) int local64;
		@Pc(102) int local102;
		@Pc(111) int local111;
		for (@Pc(38) int local38 = 0; local38 < this.anInt6662; local38++) {
			local64 = (this.anIntArray436[local38] - (this.anIntArray438[local38] * this.aClass15_Sub3_22.anInt5335 >> 8) >> this.aClass15_Sub3_22.anInt5327) - arg0.anInt949;
			@Pc(88) int local88 = (this.anIntArray439[local38] - (this.aClass15_Sub3_22.anInt5353 * this.anIntArray438[local38] >> 8) >> this.aClass15_Sub3_22.anInt5327) - arg0.anInt947;
			@Pc(93) int local93 = this.anIntArray435[local38];
			@Pc(100) int local100 = this.anIntArray435[local38 + 1];
			for (local102 = local93; local102 < local100; local102++) {
				local111 = this.aShortArray101[local102] - 1;
				if (local111 == -1) {
					break;
				}
				local32[local111] = local64;
				local36[local111] = local88;
			}
		}
		for (local64 = 0; local64 < this.anInt6676; local64++) {
			if (this.aByteArray77 == null || this.aByteArray77[local64] <= 128) {
				@Pc(166) short local166 = this.aShortArray108[local64];
				@Pc(171) short local171 = this.aShortArray100[local64];
				@Pc(176) short local176 = this.aShortArray102[local64];
				local102 = local32[local166];
				local111 = local32[local171];
				@Pc(188) int local188 = local32[local176];
				@Pc(192) int local192 = local36[local166];
				@Pc(196) int local196 = local36[local171];
				@Pc(200) int local200 = local36[local176];
				if ((local102 - local111) * (local196 - local200) - (local196 - local192) * (local188 + -local111) > 0) {
					arg0.method1059(local192, local188, local111, local196, local200, local102);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "E", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
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
			local27 = 0;
			Static193.anInt2483 = 0;
			Static137.anInt3201 = 0;
			Static175.anInt3559 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray55.length) {
					local51 = this.anIntArrayArray55[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static193.anInt2483 += this.anIntArray436[local59];
						Static175.anInt3559 += this.anIntArray438[local59];
						local27++;
						Static137.anInt3201 += this.anIntArray439[local59];
					}
				}
			}
			if (local27 > 0) {
				Static193.anInt2483 = Static193.anInt2483 / local27 + local17;
				Static175.anInt3559 = local25 + Static175.anInt3559 / local27;
				Static137.anInt3201 = local21 + Static137.anInt3201 / local27;
			} else {
				Static137.anInt3201 = local21;
				Static175.anInt3559 = local25;
				Static193.anInt2483 = local17;
			}
			return;
		}
		@Pc(156) int[] local156;
		@Pc(158) int local158;
		if (arg0 == 1) {
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			local17 = arg2 << 4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray55.length > local35) {
					local156 = this.anIntArrayArray55[local35];
					for (local158 = 0; local158 < local156.length; local158++) {
						local53 = local156[local158];
						this.anIntArray436[local53] += local17;
						this.anIntArray438[local53] += local25;
						this.anIntArray439[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(278) int local278;
		@Pc(297) int local297;
		@Pc(754) int local754;
		if (arg0 == 2) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray55.length > local35) {
					local156 = this.anIntArrayArray55[local35];
					if ((arg5 & 0x1) == 0) {
						for (local158 = 0; local158 < local156.length; local158++) {
							local53 = local156[local158];
							this.anIntArray436[local53] -= Static193.anInt2483;
							this.anIntArray438[local53] -= Static175.anInt3559;
							this.anIntArray439[local53] -= Static137.anInt3201;
							if (arg4 != 0) {
								local59 = Class2_Sub3.anIntArray620[arg4];
								local278 = Class2_Sub3.anIntArray621[arg4];
								local297 = this.anIntArray436[local53] * local278 + local59 * this.anIntArray438[local53] + 16383 >> 14;
								this.anIntArray438[local53] = this.anIntArray438[local53] * local278 + 16383 - local59 * this.anIntArray436[local53] >> 14;
								this.anIntArray436[local53] = local297;
							}
							if (arg2 != 0) {
								local59 = Class2_Sub3.anIntArray620[arg2];
								local278 = Class2_Sub3.anIntArray621[arg2];
								local297 = local278 * this.anIntArray438[local53] + 16383 - local59 * this.anIntArray439[local53] >> 14;
								this.anIntArray439[local53] = this.anIntArray439[local53] * local278 + local59 * this.anIntArray438[local53] + 16383 >> 14;
								this.anIntArray438[local53] = local297;
							}
							if (arg3 != 0) {
								local59 = Class2_Sub3.anIntArray620[arg3];
								local278 = Class2_Sub3.anIntArray621[arg3];
								local297 = local59 * this.anIntArray439[local53] + local278 * this.anIntArray436[local53] + 16383 >> 14;
								this.anIntArray439[local53] = this.anIntArray439[local53] * local278 + 16383 - this.anIntArray436[local53] * local59 >> 14;
								this.anIntArray436[local53] = local297;
							}
							this.anIntArray436[local53] += Static193.anInt2483;
							this.anIntArray438[local53] += Static175.anInt3559;
							this.anIntArray439[local53] += Static137.anInt3201;
						}
					} else {
						for (local158 = 0; local158 < local156.length; local158++) {
							local53 = local156[local158];
							this.anIntArray436[local53] -= Static193.anInt2483;
							this.anIntArray438[local53] -= Static175.anInt3559;
							this.anIntArray439[local53] -= Static137.anInt3201;
							if (arg2 != 0) {
								local59 = Class2_Sub3.anIntArray620[arg2];
								local278 = Class2_Sub3.anIntArray621[arg2];
								local297 = this.anIntArray438[local53] * local278 + 16383 - this.anIntArray439[local53] * local59 >> 14;
								this.anIntArray439[local53] = local278 * this.anIntArray439[local53] + this.anIntArray438[local53] * local59 + 16383 >> 14;
								this.anIntArray438[local53] = local297;
							}
							if (arg4 != 0) {
								local59 = Class2_Sub3.anIntArray620[arg4];
								local278 = Class2_Sub3.anIntArray621[arg4];
								local297 = this.anIntArray436[local53] * local278 + this.anIntArray438[local53] * local59 + 16383 >> 14;
								this.anIntArray438[local53] = local278 * this.anIntArray438[local53] + 16383 - this.anIntArray436[local53] * local59 >> 14;
								this.anIntArray436[local53] = local297;
							}
							if (arg3 != 0) {
								local59 = Class2_Sub3.anIntArray620[arg3];
								local278 = Class2_Sub3.anIntArray621[arg3];
								local297 = this.anIntArray439[local53] * local59 + local278 * this.anIntArray436[local53] + 16383 >> 14;
								this.anIntArray439[local53] = this.anIntArray439[local53] * local278 + 16383 - this.anIntArray436[local53] * local59 >> 14;
								this.anIntArray436[local53] = local297;
							}
							this.anIntArray436[local53] += Static193.anInt2483;
							this.anIntArray438[local53] += Static175.anInt3559;
							this.anIntArray439[local53] += Static137.anInt3201;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray55.length) {
						local51 = this.anIntArrayArray55[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local278 = this.anIntArray435[local59];
							local297 = this.anIntArray435[local59 + 1];
							for (local754 = local278; local754 < local297; local754++) {
								@Pc(763) int local763 = this.aShortArray101[local754] - 1;
								if (local763 == -1) {
									break;
								}
								@Pc(776) int local776;
								@Pc(780) int local780;
								@Pc(798) int local798;
								if (arg4 != 0) {
									local776 = Class2_Sub3.anIntArray620[arg4];
									local780 = Class2_Sub3.anIntArray621[arg4];
									local798 = local780 * this.aShortArray105[local763] + this.aShortArray107[local763] * local776 + 16383 >> 14;
									this.aShortArray107[local763] = (short) (this.aShortArray107[local763] * local780 + 16383 - local776 * this.aShortArray105[local763] >> 14);
									this.aShortArray105[local763] = (short) local798;
								}
								if (arg2 != 0) {
									local776 = Class2_Sub3.anIntArray620[arg2];
									local780 = Class2_Sub3.anIntArray621[arg2];
									local798 = local780 * this.aShortArray107[local763] + 16383 - this.aShortArray106[local763] * local776 >> 14;
									this.aShortArray106[local763] = (short) (this.aShortArray106[local763] * local780 + this.aShortArray107[local763] * local776 + 16383 >> 14);
									this.aShortArray107[local763] = (short) local798;
								}
								if (arg3 != 0) {
									local776 = Class2_Sub3.anIntArray620[arg3];
									local780 = Class2_Sub3.anIntArray621[arg3];
									local798 = this.aShortArray106[local763] * local776 + this.aShortArray105[local763] * local780 + 16383 >> 14;
									this.aShortArray106[local763] = (short) (local780 * this.aShortArray106[local763] + 16383 - this.aShortArray105[local763] * local776 >> 14);
									this.aShortArray105[local763] = (short) local798;
								}
							}
						}
					}
				}
				if (this.aClass346_11 == null && this.aClass346_12 != null) {
					this.aClass346_12.anInterface16_6 = null;
				}
				if (this.aClass346_11 != null) {
					this.aClass346_11.anInterface16_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray55.length) {
					local156 = this.anIntArrayArray55[local35];
					for (local158 = 0; local158 < local156.length; local158++) {
						local53 = local156[local158];
						this.anIntArray436[local53] -= Static193.anInt2483;
						this.anIntArray438[local53] -= Static175.anInt3559;
						this.anIntArray439[local53] -= Static137.anInt3201;
						this.anIntArray436[local53] = this.anIntArray436[local53] * arg2 >> 7;
						this.anIntArray438[local53] = arg3 * this.anIntArray438[local53] >> 7;
						this.anIntArray439[local53] = this.anIntArray439[local53] * arg4 >> 7;
						this.anIntArray436[local53] += Static193.anInt2483;
						this.anIntArray438[local53] += Static175.anInt3559;
						this.anIntArray439[local53] += Static137.anInt3201;
					}
				}
			}
		} else {
			@Pc(1211) Class266 local1211;
			@Pc(1216) Class234 local1216;
			if (arg0 == 5) {
				if (this.anIntArrayArray54 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray54.length) {
							local156 = this.anIntArrayArray54[local35];
							for (local158 = 0; local158 < local156.length; local158++) {
								local53 = local156[local158];
								local59 = arg2 * 8 + (this.aByteArray77[local53] & 0xFF);
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray77[local53] = (byte) local59;
							}
							if (local156.length > 0 && this.aClass346_12 != null) {
								this.aClass346_12.anInterface16_6 = null;
							}
						}
					}
					if (this.aClass266Array1 != null) {
						for (local35 = 0; local35 < this.anInt6645; local35++) {
							local1211 = this.aClass266Array1[local35];
							local1216 = this.aClass234Array1[local35];
							local1216.anInt7179 = 255 - (this.aByteArray77[local1211.anInt8216] & 0xFF) << 24 | local1216.anInt7179 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1472) Class234 local1472;
				if (arg0 == 8) {
					if (this.anIntArrayArray53 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray53.length > local35) {
								local156 = this.anIntArrayArray53[local35];
								for (local158 = 0; local158 < local156.length; local158++) {
									local1472 = this.aClass234Array1[local156[local158]];
									local1472.anInt7178 += arg2;
									local1472.anInt7177 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray53 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (local35 < this.anIntArrayArray53.length) {
								local156 = this.anIntArrayArray53[local35];
								for (local158 = 0; local158 < local156.length; local158++) {
									local1472 = this.aClass234Array1[local156[local158]];
									local1472.anInt7184 = local1472.anInt7184 * arg3 >> 7;
									local1472.anInt7176 = local1472.anInt7176 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray53 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray53.length) {
							local156 = this.anIntArrayArray53[local35];
							for (local158 = 0; local158 < local156.length; local158++) {
								local1472 = this.aClass234Array1[local156[local158]];
								local1472.anInt7175 = arg2 + local1472.anInt7175 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray54 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray54.length > local35) {
						local156 = this.anIntArrayArray54[local35];
						for (local158 = 0; local158 < local156.length; local158++) {
							local53 = local156[local158];
							local59 = this.aShortArray103[local53] & 0xFFFF;
							local278 = local59 >> 10 & 0x3F;
							local297 = local59 >> 7 & 0x7;
							@Pc(1309) int local1309 = local278 + arg2 & 0x3F;
							local754 = local59 & 0x7F;
							local297 += arg3 / 4;
							local754 += arg4;
							if (local297 < 0) {
								local297 = 0;
							} else if (local297 > 7) {
								local297 = 7;
							}
							if (local754 < 0) {
								local754 = 0;
							} else if (local754 > 127) {
								local754 = 127;
							}
							this.aShortArray103[local53] = (short) (local754 | local297 << 7 | local1309 << 10);
						}
						if (local156.length > 0 && this.aClass346_12 != null) {
							this.aClass346_12.anInterface16_6 = null;
						}
					}
				}
				if (this.aClass266Array1 != null) {
					for (local35 = 0; local35 < this.anInt6645; local35++) {
						local1211 = this.aClass266Array1[local35];
						local1216 = this.aClass234Array1[local35];
						local1216.anInt7179 = Static331.anIntArray442[this.aShortArray103[local1211.anInt8216] & 0xFFFF] & 0xFFFFFF | local1216.anInt7179 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt6657; local3++) {
			local12 = this.aShortArray103[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			@Pc(42) int local42 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			if (arg2 != -1) {
				local42 += arg3 * (arg2 - local42) >> 7;
			}
			this.aShortArray103[local3] = (short) (local24 << 7 | local18 << 10 | local42);
		}
		if (this.aClass266Array1 != null) {
			for (local12 = 0; local12 < this.anInt6645; local12++) {
				@Pc(107) Class266 local107 = this.aClass266Array1[local12];
				@Pc(112) Class234 local112 = this.aClass234Array1[local12];
				local112.anInt7179 = local112.anInt7179 & 0xFF000000 | Static331.anIntArray442[this.aShortArray103[local107.anInt8216] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass346_12 != null) {
			this.aClass346_12.anInterface16_6 = null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	private void method5573() {
		if (this.aClass266Array1 == null) {
			return;
		}
		@Pc(12) Class255_Sub1 local12 = this.aClass15_Sub3_22.aClass255_Sub1_2;
		@Pc(16) float local16 = this.aClass15_Sub3_22.method4395();
		@Pc(20) float local20 = this.aClass15_Sub3_22.method4456();
		this.aClass15_Sub3_22.method4437();
		this.aClass15_Sub3_22.method5336(false);
		this.aClass15_Sub3_22.method4414(false);
		this.aClass15_Sub3_22.method4409(null, this.aClass15_Sub3_22.aClass346_7, null, this.aClass15_Sub3_22.aClass346_8);
		for (@Pc(49) int local49 = 0; local49 < this.anInt6645; local49++) {
			@Pc(56) Class266 local56 = this.aClass266Array1[local49];
			@Pc(61) Class234 local61 = this.aClass234Array1[local49];
			if (!local56.aBoolean675 || !this.aClass15_Sub3_22.method5325()) {
				@Pc(89) float local89 = (float) (this.anIntArray436[local56.anInt8218] + this.anIntArray436[local56.anInt8219] + this.anIntArray436[local56.anInt8212]) * 0.3333333F;
				@Pc(112) float local112 = (float) (this.anIntArray438[local56.anInt8219] + this.anIntArray438[local56.anInt8212] + this.anIntArray438[local56.anInt8218]) * 0.3333333F;
				@Pc(134) float local134 = (float) (this.anIntArray439[local56.anInt8219] + this.anIntArray439[local56.anInt8212] + this.anIntArray439[local56.anInt8218]) * 0.3333333F;
				@Pc(148) float local148 = Static381.aFloat15 * local89 + local112 * Static154.aFloat51 + Static323.aFloat145 * local134 + Static121.aFloat57;
				@Pc(162) float local162 = Static524.aFloat187 + Static157.aFloat52 * local134 + local89 * Static334.aFloat150 + Static304.aFloat122 * local112;
				@Pc(176) float local176 = Static409.aFloat203 * local134 + Static445.aFloat176 * local112 + Static237.aFloat81 * local89 + Static509.aFloat184;
				local12.method6437(-local176, local61.anInt7175, local61.anInt7184 * local56.aShort99 >> 7, (float) local61.anInt7177 - local162, local148 + (float) local61.anInt7178, local56.aShort100 * local61.anInt7176 >> 7);
				this.aClass15_Sub3_22.method4421(local12);
				this.aClass15_Sub3_22.ka(local20, local16 - (float) local56.anInt8214 * 1.5F);
				@Pc(227) int local227 = local61.anInt7179;
				OpenGL.glColor4ub((byte) (local227 >> 16), (byte) (local227 >> 8), (byte) local227, (byte) (local227 >> 24));
				this.aClass15_Sub3_22.method4448(local56.aShort98);
				this.aClass15_Sub3_22.method4392(local56.aByte84);
				this.aClass15_Sub3_22.method4450(4);
			}
		}
		this.aClass15_Sub3_22.ka(local20, local16);
		this.aClass15_Sub3_22.method5336(true);
		this.aClass15_Sub3_22.method4380();
	}

	@OriginalMember(owner = "client!mf", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		if (!this.aBoolean575) {
			this.method5581();
		}
		return this.aShort74;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "()[Lclient!gi;")
	@Override
	public Class121[] method7138() {
		return this.aClass121Array6;
	}

	@OriginalMember(owner = "client!mf", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean575) {
			this.method5581();
		}
		return this.aShort77;
	}

	@OriginalMember(owner = "client!mf", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean575) {
			this.method5581();
		}
		@Pc(16) int local16 = this.aShort80 + arg4;
		@Pc(21) int local21 = this.aShort76 + arg4;
		@Pc(26) int local26 = this.aShort79 + arg6;
		@Pc(31) int local31 = arg6 + this.aShort75;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt10458 >> arg2.anInt10463 >= arg2.anInt10461 || local26 < 0 || arg2.anInt10458 + local31 >> arg2.anInt10463 >= arg2.anInt10459)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt10461 <= arg3.anInt10458 + local21 >> arg3.anInt10463 || local26 < 0 || arg3.anInt10458 + local31 >> arg3.anInt10463 >= arg3.anInt10459) {
				return;
			}
		} else {
			local16 >>= arg2.anInt10463;
			local21 = local21 + arg2.anInt10458 - 1 >> arg2.anInt10463;
			local26 >>= arg2.anInt10463;
			local31 = arg2.anInt10458 + local31 - 1 >> arg2.anInt10463;
			if (arg2.JA(local16, local26) == arg5 && arg2.JA(local21, local26) == arg5 && arg2.JA(local16, local31) == arg5 && arg5 == arg2.JA(local21, local31)) {
				return;
			}
		}
		@Pc(192) int local192;
		if (arg0 == 1) {
			for (local192 = 0; local192 < this.anInt6662; local192++) {
				this.anIntArray438[local192] += arg2.sa(arg4 + this.anIntArray436[local192], arg6 + this.anIntArray439[local192]) - arg5;
			}
		} else {
			@Pc(253) int local253;
			@Pc(262) int local262;
			if (arg0 == 2) {
				@Pc(465) short local465 = this.aShort81;
				if (local465 == 0) {
					return;
				}
				for (local253 = 0; local253 < this.anInt6662; local253++) {
					local262 = (this.anIntArray438[local253] << 16) / local465;
					if (local262 < arg1) {
						this.anIntArray438[local253] += (arg1 - local262) * (arg2.sa(arg4 + this.anIntArray436[local253], this.anIntArray439[local253] + arg6) - arg5) / arg1;
					}
				}
			} else {
				@Pc(269) int local269;
				if (arg0 == 3) {
					local192 = (arg1 & 0xFF) * 4;
					local253 = (arg1 >> 8 & 0xFF) * 4;
					local262 = (arg1 >> 16 & 0xFF) << 6;
					local269 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local192 >> 1) < 0 || arg2.anInt10461 << arg2.anInt10463 <= arg2.anInt10458 + arg4 + (local192 >> 1) || arg6 - (local253 >> 1) < 0 || arg2.anInt10458 + arg6 + (local253 >> 1) >= arg2.anInt10459 << arg2.anInt10463) {
						return;
					}
					this.method7139(arg4, local262, local269, local192, local253, arg6, arg2, arg5);
				} else if (arg0 == 4) {
					local192 = this.aShort77 - this.aShort81;
					for (local253 = 0; local253 < this.anInt6662; local253++) {
						this.anIntArray438[local253] = this.anIntArray438[local253] + arg3.sa(this.anIntArray436[local253] + arg4, this.anIntArray439[local253] - -arg6) + local192 - arg5;
					}
				} else if (arg0 == 5) {
					local192 = this.aShort77 - this.aShort81;
					for (local253 = 0; local253 < this.anInt6662; local253++) {
						local262 = arg4 + this.anIntArray436[local253];
						local269 = arg6 + this.anIntArray439[local253];
						@Pc(274) int local274 = arg2.sa(local262, local269);
						@Pc(279) int local279 = arg3.sa(local262, local269);
						@Pc(287) int local287 = local274 - local279 - arg1;
						this.anIntArray438[local253] = ((this.anIntArray438[local253] << 8) / local192 * local287 >> 8) + local274 - arg5;
					}
				}
			}
		}
		this.aBoolean575 = false;
		if (this.aClass346_10 != null) {
			this.aClass346_10.anInterface16_6 = null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "P", descriptor = "()V")
	@Override
	public void P() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6662; local7++) {
			this.anIntArray439[local7] = -this.anIntArray439[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt6697; local29++) {
			this.aShortArray106[local29] = (short) -this.aShortArray106[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt6657; local52++) {
			@Pc(59) short local59 = this.aShortArray108[local52];
			this.aShortArray108[local52] = this.aShortArray102[local52];
			this.aShortArray102[local52] = local59;
		}
		if (this.aClass346_11 == null && this.aClass346_12 != null) {
			this.aClass346_12.anInterface16_6 = null;
		}
		if (this.aClass346_11 != null) {
			this.aClass346_11.anInterface16_6 = null;
		}
		if (this.aClass346_10 != null) {
			this.aClass346_10.anInterface16_6 = null;
		}
		if (this.aClass224_1 != null) {
			this.aClass224_1.anInterface21_4 = null;
		}
		this.aBoolean575 = false;
	}

	@OriginalMember(owner = "client!mf", name = "ha", descriptor = "()I")
	@Override
	public int ha() {
		if (!this.aBoolean575) {
			this.method5581();
		}
		return this.aShort80;
	}

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6662; local3++) {
			if (arg0 != 0) {
				this.anIntArray436[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray438[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray439[local3] += arg2;
			}
		}
		this.aBoolean575 = false;
		if (this.aClass346_10 != null) {
			this.aClass346_10.anInterface16_6 = null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "LA", descriptor = "()I")
	@Override
	public int LA() {
		if (!this.aBoolean575) {
			this.method5581();
		}
		return this.aShort79;
	}

	@OriginalMember(owner = "client!mf", name = "M", descriptor = "()I")
	@Override
	public int M() {
		if (!this.aBoolean575) {
			this.method5581();
		}
		return this.aShort76;
	}

	@OriginalMember(owner = "client!mf", name = "Y", descriptor = "()V")
	@Override
	protected void Y() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6687; local3++) {
			this.anIntArray436[local3] = this.anIntArray436[local3] + 7 >> 4;
			this.anIntArray438[local3] = this.anIntArray438[local3] + 7 >> 4;
			this.anIntArray439[local3] = this.anIntArray439[local3] + 7 >> 4;
		}
		if (this.aClass346_10 != null) {
			this.aClass346_10.anInterface16_6 = null;
		}
		this.aBoolean575 = false;
	}

	@OriginalMember(owner = "client!mf", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	@Override
	public Class3_Sub4_Sub2 Z(@OriginalArg(0) Class3_Sub4_Sub2 arg0) {
		if (this.anInt6697 == 0) {
			return null;
		}
		if (!this.aBoolean575) {
			this.method5581();
		}
		@Pc(42) int local42;
		@Pc(59) int local59;
		if (this.aClass15_Sub3_22.anInt5335 > 0) {
			local42 = this.aShort80 - (this.aClass15_Sub3_22.anInt5335 * this.aShort77 >> 8) >> this.aClass15_Sub3_22.anInt5327;
			local59 = this.aShort76 - (this.aClass15_Sub3_22.anInt5335 * this.aShort81 >> 8) >> this.aClass15_Sub3_22.anInt5327;
		} else {
			local42 = this.aShort80 - (this.aShort81 * this.aClass15_Sub3_22.anInt5335 >> 8) >> this.aClass15_Sub3_22.anInt5327;
			local59 = this.aShort76 - (this.aClass15_Sub3_22.anInt5335 * this.aShort77 >> 8) >> this.aClass15_Sub3_22.anInt5327;
		}
		@Pc(117) int local117;
		@Pc(134) int local134;
		if (this.aClass15_Sub3_22.anInt5353 > 0) {
			local117 = this.aShort79 - (this.aShort77 * this.aClass15_Sub3_22.anInt5353 >> 8) >> this.aClass15_Sub3_22.anInt5327;
			local134 = this.aShort75 - (this.aClass15_Sub3_22.anInt5353 * this.aShort81 >> 8) >> this.aClass15_Sub3_22.anInt5327;
		} else {
			local117 = this.aShort79 - (this.aShort81 * this.aClass15_Sub3_22.anInt5353 >> 8) >> this.aClass15_Sub3_22.anInt5327;
			local134 = this.aShort75 - (this.aShort77 * this.aClass15_Sub3_22.anInt5353 >> 8) >> this.aClass15_Sub3_22.anInt5327;
		}
		@Pc(175) int local175 = local59 + 1 - local42;
		@Pc(182) int local182 = local134 + 1 - local117;
		@Pc(185) Class3_Sub4_Sub2_Sub1 local185 = (Class3_Sub4_Sub2_Sub1) arg0;
		@Pc(195) Class3_Sub4_Sub2_Sub1 local195;
		if (local185 != null && local185.method1056(local182, local175)) {
			local195 = local185;
			local185.method1060();
		} else {
			local195 = new Class3_Sub4_Sub2_Sub1(this.aClass15_Sub3_22, local175, local182);
		}
		local195.method1057(local42, local117, local59, local134);
		this.method5572(local195);
		return local195;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(SIIBI)I")
	private int method5574(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17 = Static331.anIntArray442[Static540.method7920(arg1, arg3)];
		if (arg0 != -1) {
			@Pc(29) Class178 local29 = this.aClass15_Sub3_22.anInterface4_11.method3088(arg0 & 0xFFFF);
			@Pc(34) int local34 = local29.aByte52 & 0xFF;
			@Pc(47) int local47;
			@Pc(67) int local67;
			if (local34 != 0) {
				if (arg3 < 0) {
					local47 = 0;
				} else if (arg3 <= 127) {
					local47 = arg3 * 131586;
				} else {
					local47 = 16777215;
				}
				if (local34 == 256) {
					local17 = local47;
				} else {
					local67 = 256 - local34;
					local17 = (local34 * (local47 & 0xFF00) + (local17 & 0xFF00) * local67 & 0xFF0000) + (local34 * (local47 & 0xFF00FF) + ((local17 & 0xFF00FF) * local67) & 0xFF00FF00) >> 8;
				}
			}
			local47 = local29.aByte57 & 0xFF;
			if (local47 != 0) {
				local47 += 256;
				@Pc(122) int local122 = (local17 >> 16 & 0xFF) * local47;
				if (local122 > 65535) {
					local122 = 65535;
				}
				local67 = local47 * (local17 >> 8 & 0xFF);
				if (local67 > 65535) {
					local67 = 65535;
				}
				@Pc(148) int local148 = local47 * (local17 & 0xFF);
				if (local148 > 65535) {
					local148 = 65535;
				}
				local17 = (local148 >> 8) + (local67 & 0xFF00) + (local122 << 8 & 0xFF0004);
			}
		}
		return (local17 << 8) + 255 - (arg2 & 0xFF);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(FIBIIIIJLclient!fca;F)S")
	private short method5575(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) Class96 arg7, @OriginalArg(9) float arg8) {
		@Pc(10) int local10 = this.anIntArray435[arg2];
		@Pc(17) int local17 = this.anIntArray435[arg2 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray101[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static135.aLongArray6[local21] == arg6) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray101[local19] = (short) (this.anInt6697 + 1);
		Static135.aLongArray6[local19] = arg6;
		this.aShortArray105[this.anInt6697] = (short) arg4;
		this.aShortArray107[this.anInt6697] = (short) arg5;
		this.aShortArray106[this.anInt6697] = (short) arg3;
		this.aByteArray76[this.anInt6697] = (byte) arg1;
		this.aFloatArray61[this.anInt6697] = arg0;
		this.aFloatArray60[this.anInt6697] = arg8;
		return (short) this.anInt6697++;
	}

	@OriginalMember(owner = "client!mf", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class2_Sub3.anIntArray620[arg0];
		@Pc(13) int local13 = Class2_Sub3.anIntArray621[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6662; local15++) {
			@Pc(34) int local34 = this.anIntArray438[local15] * local13 - this.anIntArray439[local15] * local9 >> 14;
			this.anIntArray439[local15] = this.anIntArray439[local15] * local13 + local9 * this.anIntArray438[local15] >> 14;
			this.anIntArray438[local15] = local34;
		}
		if (this.aClass346_10 != null) {
			this.aClass346_10.anInterface16_6 = null;
		}
		this.aBoolean575 = false;
	}

	@OriginalMember(owner = "client!mf", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean575) {
			this.method5581();
		}
		return this.aShort75;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZB)V")
	private void method5577(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass346_12 != null && this.aClass346_12.anInterface16_6 == null;
		@Pc(27) boolean local27 = this.aClass346_11 != null && this.aClass346_11.anInterface16_6 == null;
		@Pc(38) boolean local38 = this.aClass346_10 != null && this.aClass346_10.anInterface16_6 == null;
		@Pc(49) boolean local49 = this.aClass346_9 != null && this.aClass346_9.anInterface16_6 == null;
		if (arg0) {
			local16 &= (this.aByte69 & 0x2) != 0;
			local38 &= (this.aByte69 & 0x1) != 0;
			local27 &= (this.aByte69 & 0x4) != 0;
			local49 &= (this.aByte69 & 0x8) != 0;
		}
		@Pc(103) byte local103 = 0;
		@Pc(107) byte local107 = 0;
		@Pc(109) byte local109 = 0;
		@Pc(111) byte local111 = 0;
		if (local38) {
			local103 = 12;
		}
		if (local16) {
			local107 = local103;
			local103 = (byte) (local103 + 4);
		}
		if (local27) {
			local109 = local103;
			local103 = (byte) (local103 + 12);
		}
		if (local49) {
			local111 = local103;
			local103 = (byte) (local103 + 8);
		}
		if (local103 == 0) {
			return;
		}
		if (local103 * this.anInt6697 > this.aClass15_Sub3_22.aClass3_Sub7_Sub2_3.aByteArray86.length) {
			this.aClass15_Sub3_22.aClass3_Sub7_Sub2_3 = new Class3_Sub7_Sub2(local103 * (this.anInt6697 + 100));
		} else {
			this.aClass15_Sub3_22.aClass3_Sub7_Sub2_3.anInt7869 = 0;
		}
		@Pc(189) Class3_Sub7_Sub2 local189 = this.aClass15_Sub3_22.aClass3_Sub7_Sub2_3;
		@Pc(197) int local197;
		@Pc(206) int local206;
		@Pc(234) int local234;
		@Pc(243) int local243;
		if (local38) {
			@Pc(213) int local213;
			@Pc(220) int local220;
			@Pc(225) int local225;
			@Pc(232) int local232;
			if (this.aClass15_Sub3_22.aBoolean442) {
				for (local197 = 0; local197 < this.anInt6662; local197++) {
					local206 = Stream.floatToRawIntBits((float) this.anIntArray436[local197]);
					local213 = Stream.floatToRawIntBits((float) this.anIntArray438[local197]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray439[local197]);
					local225 = this.anIntArray435[local197];
					local232 = this.anIntArray435[local197 + 1];
					for (local234 = local225; local234 < local232; local234++) {
						local243 = this.aShortArray101[local234] - 1;
						if (local243 == -1) {
							break;
						}
						local189.anInt7869 = local103 * local243;
						local189.method6495(local206);
						local189.method6495(local213);
						local189.method6495(local220);
					}
				}
			} else {
				for (local197 = 0; local197 < this.anInt6662; local197++) {
					local206 = Stream.floatToRawIntBits((float) this.anIntArray436[local197]);
					local213 = Stream.floatToRawIntBits((float) this.anIntArray438[local197]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray439[local197]);
					local225 = this.anIntArray435[local197];
					local232 = this.anIntArray435[local197 + 1];
					for (local234 = local225; local234 < local232; local234++) {
						local243 = this.aShortArray101[local234] - 1;
						if (local243 == -1) {
							break;
						}
						local189.anInt7869 = local243 * local103;
						local189.method6493(local206);
						local189.method6493(local213);
						local189.method6493(local220);
					}
				}
			}
		}
		@Pc(485) float local485;
		@Pc(383) short[] local383;
		@Pc(375) short[] local375;
		@Pc(371) short[] local371;
		@Pc(379) byte[] local379;
		@Pc(529) float local529;
		if (local16) {
			if (this.aClass346_11 == null) {
				if (this.aClass286_1 == null) {
					local379 = this.aByteArray76;
					local383 = this.aShortArray105;
					local375 = this.aShortArray107;
					local371 = this.aShortArray106;
				} else {
					local371 = this.aClass286_1.aShortArray132;
					local375 = this.aClass286_1.aShortArray133;
					local379 = this.aClass286_1.aByteArray93;
					local383 = this.aClass286_1.aShortArray131;
				}
				@Pc(403) float local403 = this.aClass15_Sub3_22.aFloatArray41[0];
				@Pc(409) float local409 = this.aClass15_Sub3_22.aFloatArray41[1];
				@Pc(415) float local415 = this.aClass15_Sub3_22.aFloatArray41[2];
				@Pc(419) float local419 = this.aClass15_Sub3_22.aFloat109;
				@Pc(429) float local429 = this.aClass15_Sub3_22.aFloat96 * 768.0F / (float) this.aShort78;
				@Pc(439) float local439 = this.aClass15_Sub3_22.aFloat105 * 768.0F / (float) this.aShort78;
				for (@Pc(441) int local441 = 0; local441 < this.anInt6657; local441++) {
					@Pc(463) int local463 = this.method5574(this.aShortArray98[local441], this.aShortArray103[local441], this.aByteArray77[local441], this.aShort82);
					@Pc(474) float local474 = this.aClass15_Sub3_22.aFloat100 * (float) (local463 >> 8 & 0xFF);
					local485 = (float) (local463 >> 16 & 0xFF) * this.aClass15_Sub3_22.aFloat98;
					@Pc(490) short local490 = this.aShortArray108[local441];
					@Pc(499) float local499 = this.aClass15_Sub3_22.aFloat93 * (float) (local463 >>> 24);
					@Pc(504) short local504 = (short) local379[local490];
					if (local504 == 0) {
						local529 = (local409 * (float) local375[local490] + local403 * (float) local383[local490] + (float) local371[local490] * local415) * 0.0026041667F;
					} else {
						local529 = ((float) local371[local490] * local415 + (float) local383[local490] * local403 + (float) local375[local490] * local409) / (float) (local504 * 256);
					}
					@Pc(569) float local569 = local419 + (local529 < 0.0F ? local439 : local429) * local529;
					@Pc(574) int local574 = (int) (local569 * local499);
					@Pc(579) int local579 = (int) (local485 * local569);
					if (local574 < 0) {
						local574 = 0;
					} else if (local574 > 255) {
						local574 = 255;
					}
					@Pc(598) int local598 = (int) (local569 * local474);
					if (local579 < 0) {
						local579 = 0;
					} else if (local579 > 255) {
						local579 = 255;
					}
					local189.anInt7869 = local103 * local490 + local107;
					if (local598 < 0) {
						local598 = 0;
					} else if (local598 > 255) {
						local598 = 255;
					}
					local189.method6494(local574);
					local189.method6494(local579);
					local189.method6494(local598);
					local189.method6494(255 - (this.aByteArray77[local441] & 0xFF));
					local490 = this.aShortArray100[local441];
					local504 = local379[local490];
					if (local504 == 0) {
						local529 = ((float) local383[local490] * local403 + local409 * (float) local375[local490] + (float) local371[local490] * local415) * 0.0026041667F;
					} else {
						local529 = (local415 * (float) local371[local490] + local409 * (float) local375[local490] + local403 * (float) local383[local490]) / (float) (local504 * 256);
					}
					local569 = local529 * (local529 < 0.0F ? local439 : local429) + local419;
					local574 = (int) (local499 * local569);
					if (local574 < 0) {
						local574 = 0;
					} else if (local574 > 255) {
						local574 = 255;
					}
					local579 = (int) (local485 * local569);
					local598 = (int) (local474 * local569);
					if (local579 < 0) {
						local579 = 0;
					} else if (local579 > 255) {
						local579 = 255;
					}
					local189.anInt7869 = local107 + local103 * local490;
					if (local598 < 0) {
						local598 = 0;
					} else if (local598 > 255) {
						local598 = 255;
					}
					local189.method6494(local574);
					local189.method6494(local579);
					local189.method6494(local598);
					local189.method6494(255 - (this.aByteArray77[local441] & 0xFF));
					local490 = this.aShortArray102[local441];
					local504 = local379[local490];
					if (local504 == 0) {
						local529 = ((float) local383[local490] * local403 + local409 * (float) local375[local490] + (float) local371[local490] * local415) * 0.0026041667F;
					} else {
						local529 = ((float) local375[local490] * local409 + local403 * (float) local383[local490] + local415 * (float) local371[local490]) / (float) (local504 * 256);
					}
					local569 = local419 + local529 * (local529 < 0.0F ? local439 : local429);
					local574 = (int) (local569 * local499);
					if (local574 < 0) {
						local574 = 0;
					} else if (local574 > 255) {
						local574 = 255;
					}
					local579 = (int) (local569 * local485);
					if (local579 < 0) {
						local579 = 0;
					} else if (local579 > 255) {
						local579 = 255;
					}
					local598 = (int) (local474 * local569);
					local189.anInt7869 = local103 * local490 + local107;
					if (local598 < 0) {
						local598 = 0;
					} else if (local598 > 255) {
						local598 = 255;
					}
					local189.method6494(local574);
					local189.method6494(local579);
					local189.method6494(local598);
					local189.method6494(255 - (this.aByteArray77[local441] & 0xFF));
				}
			} else {
				for (local197 = 0; local197 < this.anInt6657; local197++) {
					local206 = this.method5574(this.aShortArray98[local197], this.aShortArray103[local197], this.aByteArray77[local197], this.aShort82);
					local189.anInt7869 = this.aShortArray108[local197] * local103 + local107;
					local189.method6495(local206);
					local189.anInt7869 = local107 + this.aShortArray100[local197] * local103;
					local189.method6495(local206);
					local189.anInt7869 = local103 * this.aShortArray102[local197] + local107;
					local189.method6495(local206);
				}
			}
		}
		if (local27) {
			if (this.aClass286_1 == null) {
				local379 = this.aByteArray76;
				local371 = this.aShortArray106;
				local383 = this.aShortArray105;
				local375 = this.aShortArray107;
			} else {
				local379 = this.aClass286_1.aByteArray93;
				local375 = this.aClass286_1.aShortArray133;
				local383 = this.aClass286_1.aShortArray131;
				local371 = this.aClass286_1.aShortArray132;
			}
			@Pc(1104) float local1104 = 3.0F / (float) this.aShort78;
			local529 = 3.0F / (float) (this.aShort78 / 2 + this.aShort78);
			local189.anInt7869 = local109;
			if (this.aClass15_Sub3_22.aBoolean442) {
				for (local234 = 0; local234 < this.anInt6697; local234++) {
					local243 = local379[local234] & 0xFF;
					if (local243 == 0) {
						local189.method6561(local529 * (float) local383[local234]);
						local189.method6561(local529 * (float) local375[local234]);
						local189.method6561((float) local371[local234] * local529);
					} else {
						local485 = local1104 / (float) local243;
						local189.method6561((float) local383[local234] * local485);
						local189.method6561(local485 * (float) local375[local234]);
						local189.method6561((float) local371[local234] * local485);
					}
					local189.anInt7869 += local103 - 12;
				}
			} else {
				for (local234 = 0; local234 < this.anInt6697; local234++) {
					local243 = local379[local234] & 0xFF;
					if (local243 == 0) {
						local189.method6560(local529 * (float) local383[local234]);
						local189.method6560(local529 * (float) local375[local234]);
						local189.method6560(local529 * (float) local371[local234]);
					} else {
						local485 = local1104 / (float) local243;
						local189.method6560((float) local383[local234] * local485);
						local189.method6560((float) local375[local234] * local485);
						local189.method6560(local485 * (float) local371[local234]);
					}
					local189.anInt7869 += local103 - 12;
				}
			}
		}
		if (local49) {
			local189.anInt7869 = local111;
			if (this.aClass15_Sub3_22.aBoolean442) {
				for (local197 = 0; local197 < this.anInt6697; local197++) {
					local189.method6561(this.aFloatArray61[local197]);
					local189.method6561(this.aFloatArray60[local197]);
					local189.anInt7869 += local103 - 8;
				}
			} else {
				for (local197 = 0; local197 < this.anInt6697; local197++) {
					local189.method6560(this.aFloatArray61[local197]);
					local189.method6560(this.aFloatArray60[local197]);
					local189.anInt7869 += local103 - 8;
				}
			}
		}
		local189.anInt7869 = this.anInt6697 * local103;
		@Pc(1427) Interface16 local1427;
		if (arg0) {
			if (this.anInterface16_5 == null) {
				this.anInterface16_5 = this.aClass15_Sub3_22.method4422(local189.anInt7869, true, local189.aByteArray86, local103);
			} else {
				this.anInterface16_5.method7026(local189.anInt7869, local189.aByteArray86, local103);
			}
			this.aByte69 = 0;
			local1427 = this.anInterface16_5;
		} else {
			local1427 = this.aClass15_Sub3_22.method4422(local189.anInt7869, false, local189.aByteArray86, local103);
			this.aBoolean574 = true;
		}
		if (local38) {
			this.aClass346_10.anInterface16_6 = local1427;
			this.aClass346_10.aByte106 = 0;
		}
		if (local49) {
			this.aClass346_9.anInterface16_6 = local1427;
			this.aClass346_9.aByte106 = local111;
		}
		if (local16) {
			this.aClass346_12.aByte106 = local107;
			this.aClass346_12.anInterface16_6 = local1427;
		}
		if (local27) {
			this.aClass346_11.anInterface16_6 = local1427;
			this.aClass346_11.aByte106 = local109;
		}
	}

	@OriginalMember(owner = "client!mf", name = "da", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			local24 = 0;
			Static137.anInt3201 = 0;
			Static193.anInt2483 = 0;
			Static175.anInt3559 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray55.length) {
					local48 = this.anIntArrayArray55[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray99 == null || (arg6 & this.aShortArray99[local56]) != 0) {
							Static193.anInt2483 += this.anIntArray436[local56];
							Static175.anInt3559 += this.anIntArray438[local56];
							local24++;
							Static137.anInt3201 += this.anIntArray439[local56];
						}
					}
				}
			}
			if (local24 > 0) {
				Static137.anInt3201 = arg4 + Static137.anInt3201 / local24;
				Static55.aBoolean105 = true;
				Static193.anInt2483 = Static193.anInt2483 / local24 + arg2;
				Static175.anInt3559 = arg3 + Static175.anInt3559 / local24;
			} else {
				Static193.anInt2483 = arg2;
				Static175.anInt3559 = arg3;
				Static137.anInt3201 = arg4;
			}
			return;
		}
		@Pc(258) int[] local258;
		@Pc(260) int local260;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg2 * arg7[0] + arg7[1] * arg3 + arg4 * arg7[2] + 8192 >> 14;
				local32 = arg7[5] * arg4 + arg2 * arg7[3] + arg7[4] * arg3 + 8192 >> 14;
				local38 = arg7[8] * arg4 + arg3 * arg7[7] + arg7[6] * arg2 + 8192 >> 14;
				arg2 = local24;
				arg3 = local32;
				arg4 = local38;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray55.length) {
					local258 = this.anIntArrayArray55[local32];
					for (local260 = 0; local260 < local258.length; local260++) {
						local50 = local258[local260];
						if (this.aShortArray99 == null || (arg6 & this.aShortArray99[local50]) != 0) {
							this.anIntArray436[local50] += arg2;
							this.anIntArray438[local50] += arg3;
							this.anIntArray439[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(392) int local392;
		@Pc(410) int local410;
		@Pc(646) int local646;
		@Pc(655) int local655;
		@Pc(668) int local668;
		@Pc(672) int local672;
		@Pc(691) int local691;
		@Pc(1035) int local1035;
		@Pc(1043) int local1043;
		@Pc(1198) int local1198;
		@Pc(1224) int local1224;
		@Pc(1228) int local1228;
		@Pc(1237) int local1237;
		@Pc(1242) int local1242;
		@Pc(1246) int local1246;
		@Pc(1250) int local1250;
		@Pc(1252) int local1252;
		@Pc(1386) int[] local1386;
		@Pc(1388) int local1388;
		@Pc(1392) int local1392;
		@Pc(1396) int local1396;
		@Pc(1398) int local1398;
		@Pc(1528) int local1528;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray55.length) {
						local258 = this.anIntArrayArray55[local32];
						for (local260 = 0; local260 < local258.length; local260++) {
							local50 = local258[local260];
							if (this.aShortArray99 == null || (arg6 & this.aShortArray99[local50]) != 0) {
								this.anIntArray436[local50] -= Static193.anInt2483;
								this.anIntArray438[local50] -= Static175.anInt3559;
								this.anIntArray439[local50] -= Static137.anInt3201;
								if (arg4 != 0) {
									local56 = Class2_Sub3.anIntArray620[arg4];
									local392 = Class2_Sub3.anIntArray621[arg4];
									local410 = local392 * this.anIntArray436[local50] + local56 * this.anIntArray438[local50] + 16383 >> 14;
									this.anIntArray438[local50] = local392 * this.anIntArray438[local50] + 16383 - this.anIntArray436[local50] * local56 >> 14;
									this.anIntArray436[local50] = local410;
								}
								if (arg2 != 0) {
									local56 = Class2_Sub3.anIntArray620[arg2];
									local392 = Class2_Sub3.anIntArray621[arg2];
									local410 = this.anIntArray438[local50] * local392 + 16383 - local56 * this.anIntArray439[local50] >> 14;
									this.anIntArray439[local50] = local392 * this.anIntArray439[local50] + local56 * this.anIntArray438[local50] + 16383 >> 14;
									this.anIntArray438[local50] = local410;
								}
								if (arg3 != 0) {
									local56 = Class2_Sub3.anIntArray620[arg3];
									local392 = Class2_Sub3.anIntArray621[arg3];
									local410 = this.anIntArray439[local50] * local56 + local392 * this.anIntArray436[local50] + 16383 >> 14;
									this.anIntArray439[local50] = this.anIntArray439[local50] * local392 + 16383 - local56 * this.anIntArray436[local50] >> 14;
									this.anIntArray436[local50] = local410;
								}
								this.anIntArray436[local50] += Static193.anInt2483;
								this.anIntArray438[local50] += Static175.anInt3559;
								this.anIntArray439[local50] += Static137.anInt3201;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray55.length > local38) {
							local48 = this.anIntArrayArray55[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray99 == null || (this.aShortArray99[local56] & arg6) != 0) {
									local392 = this.anIntArray435[local56];
									local410 = this.anIntArray435[local56 + 1];
									for (local646 = local392; local646 < local410; local646++) {
										local655 = this.aShortArray101[local646] - 1;
										if (local655 == -1) {
											break;
										}
										if (arg4 != 0) {
											local668 = Class2_Sub3.anIntArray620[arg4];
											local672 = Class2_Sub3.anIntArray621[arg4];
											local691 = this.aShortArray107[local655] * local668 + local672 * this.aShortArray105[local655] + 16383 >> 14;
											this.aShortArray107[local655] = (short) (this.aShortArray107[local655] * local672 + 16383 - local668 * this.aShortArray105[local655] >> 14);
											this.aShortArray105[local655] = (short) local691;
										}
										if (arg2 != 0) {
											local668 = Class2_Sub3.anIntArray620[arg2];
											local672 = Class2_Sub3.anIntArray621[arg2];
											local691 = local672 * this.aShortArray107[local655] + 16383 - local668 * this.aShortArray106[local655] >> 14;
											this.aShortArray106[local655] = (short) (this.aShortArray107[local655] * local668 + local672 * this.aShortArray106[local655] + 16383 >> 14);
											this.aShortArray107[local655] = (short) local691;
										}
										if (arg3 != 0) {
											local668 = Class2_Sub3.anIntArray620[arg3];
											local672 = Class2_Sub3.anIntArray621[arg3];
											local691 = this.aShortArray106[local655] * local668 + this.aShortArray105[local655] * local672 + 16383 >> 14;
											this.aShortArray106[local655] = (short) (local672 * this.aShortArray106[local655] + 16383 - local668 * this.aShortArray105[local655] >> 14);
											this.aShortArray105[local655] = (short) local691;
										}
									}
								}
							}
						}
					}
					if (this.aClass346_11 == null && this.aClass346_12 != null) {
						this.aClass346_12.anInterface16_6 = null;
					}
					if (this.aClass346_11 != null) {
						this.aClass346_11.anInterface16_6 = null;
						return;
					}
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local260 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static55.aBoolean105) {
					local392 = arg7[6] * Static137.anInt3201 + arg7[0] * Static193.anInt2483 + arg7[3] * Static175.anInt3559 + 8192 >> 14;
					local410 = arg7[7] * Static137.anInt3201 + arg7[1] * Static193.anInt2483 + arg7[4] * Static175.anInt3559 + 8192 >> 14;
					local392 += local260;
					local646 = Static175.anInt3559 * arg7[5] + arg7[2] * Static193.anInt2483 + arg7[8] * Static137.anInt3201 + 8192 >> 14;
					local410 += local50;
					Static175.anInt3559 = local410;
					local646 += local56;
					Static193.anInt2483 = local392;
					Static55.aBoolean105 = false;
					Static137.anInt3201 = local646;
				}
				@Pc(1003) int[] local1003 = new int[9];
				local410 = Class2_Sub3.anIntArray621[arg2];
				local646 = Class2_Sub3.anIntArray620[arg2];
				local655 = Class2_Sub3.anIntArray621[arg3];
				local668 = Class2_Sub3.anIntArray620[arg3];
				local672 = Class2_Sub3.anIntArray621[arg4];
				local691 = Class2_Sub3.anIntArray620[arg4];
				local1035 = local646 * local672 + 8192 >> 14;
				local1043 = local691 * local646 + 8192 >> 14;
				local1003[2] = local410 * local668 + 8192 >> 14;
				local1003[5] = -local646;
				local1003[4] = local672 * local410 + 8192 >> 14;
				local1003[1] = local691 * -local655 + local1035 * local668 + 8192 >> 14;
				local1003[6] = -local668 * local672 + local1043 * local655 + 8192 >> 14;
				local1003[8] = local410 * local655 + 8192 >> 14;
				local1003[3] = local691 * local410 + 8192 >> 14;
				local1003[7] = local1035 * local655 + local668 * local691 + 8192 >> 14;
				local1003[0] = local655 * local672 + local1043 * local668 + 8192 >> 14;
				@Pc(1173) int local1173 = local1003[2] * -Static137.anInt3201 + local1003[0] * -Static193.anInt2483 + -Static175.anInt3559 * local1003[1] + 8192 >> 14;
				local1198 = local1003[4] * -Static175.anInt3559 + local1003[3] * -Static193.anInt2483 + local1003[5] * -Static137.anInt3201 + 8192 >> 14;
				local1224 = -Static175.anInt3559 * local1003[7] + -Static193.anInt2483 * local1003[6] + -Static137.anInt3201 * local1003[8] + 8192 >> 14;
				local1228 = local1173 + Static193.anInt2483;
				@Pc(1232) int local1232 = Static175.anInt3559 + local1198;
				local1237 = local1224 + Static137.anInt3201;
				@Pc(1240) int[] local1240 = new int[9];
				for (local1242 = 0; local1242 < 3; local1242++) {
					for (local1246 = 0; local1246 < 3; local1246++) {
						local1250 = 0;
						for (local1252 = 0; local1252 < 3; local1252++) {
							local1250 += arg7[local1246 * 3 + local1252] * local1003[local1252 + local1242 * 3];
						}
						local1240[local1242 * 3 + local1246] = local1250 + 8192 >> 14;
					}
				}
				local1246 = local1003[0] * local260 + local50 * local1003[1] + local56 * local1003[2] + 8192 >> 14;
				local1250 = local1003[3] * local260 + local50 * local1003[4] + local56 * local1003[5] + 8192 >> 14;
				local1246 += local1228;
				local1250 += local1232;
				local1252 = local260 * local1003[6] + local1003[7] * local50 + local1003[8] * local56 + 8192 >> 14;
				local1252 += local1237;
				local1386 = new int[9];
				for (local1388 = 0; local1388 < 3; local1388++) {
					for (local1392 = 0; local1392 < 3; local1392++) {
						local1396 = 0;
						for (local1398 = 0; local1398 < 3; local1398++) {
							local1396 += arg7[local1398 + local1388 * 3] * local1240[local1398 * 3 + local1392];
						}
						local1386[local1392 + local1388 * 3] = local1396 + 8192 >> 14;
					}
				}
				local1392 = arg7[2] * local1252 + local1246 * arg7[0] + local1250 * arg7[1] + 8192 >> 14;
				local1396 = arg7[5] * local1252 + arg7[3] * local1246 + local1250 * arg7[4] + 8192 >> 14;
				local1396 += local32;
				local1398 = arg7[8] * local1252 + arg7[7] * local1250 + local1246 * arg7[6] + 8192 >> 14;
				local1392 += local24;
				local1398 += local38;
				for (local1528 = 0; local1528 < local8; local1528++) {
					@Pc(1534) int local1534 = arg1[local1528];
					if (this.anIntArrayArray55.length > local1534) {
						@Pc(1548) int[] local1548 = this.anIntArrayArray55[local1534];
						for (@Pc(1550) int local1550 = 0; local1550 < local1548.length; local1550++) {
							@Pc(1556) int local1556 = local1548[local1550];
							if (this.aShortArray99 == null || (this.aShortArray99[local1556] & arg6) != 0) {
								@Pc(1600) int local1600 = this.anIntArray439[local1556] * local1386[2] + local1386[1] * this.anIntArray438[local1556] + this.anIntArray436[local1556] * local1386[0] + 8192 >> 14;
								@Pc(1631) int local1631 = local1386[5] * this.anIntArray439[local1556] + local1386[4] * this.anIntArray438[local1556] + local1386[3] * this.anIntArray436[local1556] + 8192 >> 14;
								@Pc(1635) int local1635 = local1600 + local1392;
								@Pc(1639) int local1639 = local1631 + local1396;
								@Pc(1670) int local1670 = this.anIntArray439[local1556] * local1386[8] + this.anIntArray438[local1556] * local1386[7] + local1386[6] * this.anIntArray436[local1556] + 8192 >> 14;
								@Pc(1674) int local1674 = local1670 + local1398;
								this.anIntArray436[local1556] = local1635;
								this.anIntArray438[local1556] = local1639;
								this.anIntArray439[local1556] = local1674;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2604) Class266 local2604;
			@Pc(2609) Class234 local2609;
			if (arg0 == 5) {
				if (this.anIntArrayArray54 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray54.length) {
							local258 = this.anIntArrayArray54[local32];
							for (local260 = 0; local260 < local258.length; local260++) {
								local50 = local258[local260];
								if (this.aShortArray104 == null || (this.aShortArray104[local50] & arg6) != 0) {
									local56 = (this.aByteArray77[local50] & 0xFF) + (arg2 * 8);
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray77[local50] = (byte) local56;
									if (this.aClass346_12 != null) {
										this.aClass346_12.anInterface16_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass266Array1 != null) {
						for (local32 = 0; local32 < this.anInt6645; local32++) {
							local2604 = this.aClass266Array1[local32];
							local2609 = this.aClass234Array1[local32];
							local2609.anInt7179 = local2609.anInt7179 & 0xFFFFFF | 255 - (this.aByteArray77[local2604.anInt8216] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2862) Class234 local2862;
				if (arg0 == 8) {
					if (this.anIntArrayArray53 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray53.length > local32) {
								local258 = this.anIntArrayArray53[local32];
								for (local260 = 0; local260 < local258.length; local260++) {
									local2862 = this.aClass234Array1[local258[local260]];
									local2862.anInt7178 += arg2;
									local2862.anInt7177 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray53 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray53.length) {
								local258 = this.anIntArrayArray53[local32];
								for (local260 = 0; local260 < local258.length; local260++) {
									local2862 = this.aClass234Array1[local258[local260]];
									local2862.anInt7176 = local2862.anInt7176 * arg2 >> 7;
									local2862.anInt7184 = local2862.anInt7184 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray53 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray53.length) {
							local258 = this.anIntArrayArray53[local32];
							for (local260 = 0; local260 < local258.length; local260++) {
								local2862 = this.aClass234Array1[local258[local260]];
								local2862.anInt7175 = arg2 + local2862.anInt7175 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray54 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray54.length) {
						local258 = this.anIntArrayArray54[local32];
						for (local260 = 0; local260 < local258.length; local260++) {
							local50 = local258[local260];
							if (this.aShortArray104 == null || (arg6 & this.aShortArray104[local50]) != 0) {
								local56 = this.aShortArray103[local50] & 0xFFFF;
								local392 = local56 >> 10 & 0x3F;
								local410 = local56 >> 7 & 0x7;
								local646 = local56 & 0x7F;
								local410 += arg3 / 4;
								@Pc(2718) int local2718 = arg2 + local392 & 0x3F;
								if (local410 < 0) {
									local410 = 0;
								} else if (local410 > 7) {
									local410 = 7;
								}
								local646 += arg4;
								if (local646 < 0) {
									local646 = 0;
								} else if (local646 > 127) {
									local646 = 127;
								}
								this.aShortArray103[local50] = (short) (local2718 << 10 | local410 << 7 | local646);
								if (this.aClass346_12 != null) {
									this.aClass346_12.anInterface16_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass266Array1 != null) {
					for (local32 = 0; local32 < this.anInt6645; local32++) {
						local2604 = this.aClass266Array1[local32];
						local2609 = this.aClass234Array1[local32];
						local2609.anInt7179 = local2609.anInt7179 & 0xFF000000 | Static331.anIntArray442[this.aShortArray103[local2604.anInt8216] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray55.length > local32) {
					local258 = this.anIntArrayArray55[local32];
					for (local260 = 0; local260 < local258.length; local260++) {
						local50 = local258[local260];
						if (this.aShortArray99 == null || (this.aShortArray99[local50] & arg6) != 0) {
							this.anIntArray436[local50] -= Static193.anInt2483;
							this.anIntArray438[local50] -= Static175.anInt3559;
							this.anIntArray439[local50] -= Static137.anInt3201;
							this.anIntArray436[local50] = arg2 * this.anIntArray436[local50] >> 7;
							this.anIntArray438[local50] = this.anIntArray438[local50] * arg3 >> 7;
							this.anIntArray439[local50] = arg4 * this.anIntArray439[local50] >> 7;
							this.anIntArray436[local50] += Static193.anInt2483;
							this.anIntArray438[local50] += Static175.anInt3559;
							this.anIntArray439[local50] += Static137.anInt3201;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local260 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static55.aBoolean105) {
				local392 = Static193.anInt2483 * arg7[0] + Static175.anInt3559 * arg7[3] + arg7[6] * Static137.anInt3201 + 8192 >> 14;
				local410 = arg7[7] * Static137.anInt3201 + arg7[4] * Static175.anInt3559 + arg7[1] * Static193.anInt2483 + 8192 >> 14;
				local410 += local50;
				local392 += local260;
				local646 = Static137.anInt3201 * arg7[8] + Static175.anInt3559 * arg7[5] + Static193.anInt2483 * arg7[2] + 8192 >> 14;
				local646 += local56;
				Static193.anInt2483 = local392;
				Static175.anInt3559 = local410;
				Static55.aBoolean105 = false;
				Static137.anInt3201 = local646;
			}
			local392 = arg2 << 15 >> 7;
			local410 = arg3 << 15 >> 7;
			local646 = arg4 << 15 >> 7;
			local655 = local392 * -Static193.anInt2483 + 8192 >> 14;
			local668 = -Static175.anInt3559 * local410 + 8192 >> 14;
			local672 = local646 * -Static137.anInt3201 + 8192 >> 14;
			local691 = local655 + Static193.anInt2483;
			local1035 = Static175.anInt3559 + local668;
			local1043 = Static137.anInt3201 + local672;
			@Pc(1896) int[] local1896 = new int[] { local392 * arg7[0] + 8192 >> 14, arg7[3] * local392 + 8192 >> 14, arg7[6] * local392 + 8192 >> 14, arg7[1] * local410 + 8192 >> 14, arg7[4] * local410 + 8192 >> 14, arg7[7] * local410 + 8192 >> 14, local646 * arg7[2] + 8192 >> 14, arg7[5] * local646 + 8192 >> 14, arg7[8] * local646 + 8192 >> 14 };
			local1198 = local392 * local260 + 8192 >> 14;
			local1224 = local410 * local50 + 8192 >> 14;
			local1228 = local56 * local646 + 8192 >> 14;
			@Pc(2032) int local2032 = local1198 + local691;
			@Pc(2036) int local2036 = local1224 + local1035;
			@Pc(2040) int local2040 = local1228 + local1043;
			@Pc(2043) int[] local2043 = new int[9];
			@Pc(2049) int local2049;
			for (local1237 = 0; local1237 < 3; local1237++) {
				for (local2049 = 0; local2049 < 3; local2049++) {
					local1242 = 0;
					for (local1246 = 0; local1246 < 3; local1246++) {
						local1242 += arg7[local1246 + local1237 * 3] * local1896[local1246 * 3 + local2049];
					}
					local2043[local2049 + local1237 * 3] = local1242 + 8192 >> 14;
				}
			}
			local2049 = arg7[2] * local2040 + arg7[1] * local2036 + arg7[0] * local2032 + 8192 >> 14;
			local1242 = local2032 * arg7[3] + arg7[4] * local2036 + arg7[5] * local2040 + 8192 >> 14;
			local1246 = local2036 * arg7[7] + arg7[6] * local2032 + local2040 * arg7[8] + 8192 >> 14;
			local1242 += local32;
			local2049 += local24;
			local1246 += local38;
			for (local1250 = 0; local1250 < local8; local1250++) {
				local1252 = arg1[local1250];
				if (this.anIntArrayArray55.length > local1252) {
					local1386 = this.anIntArrayArray55[local1252];
					for (local1388 = 0; local1388 < local1386.length; local1388++) {
						local1392 = local1386[local1388];
						if (this.aShortArray99 == null || (this.aShortArray99[local1392] & arg6) != 0) {
							local1396 = local2043[0] * this.anIntArray436[local1392] + this.anIntArray438[local1392] * local2043[1] + local2043[2] * this.anIntArray439[local1392] + 8192 >> 14;
							local1398 = local2043[5] * this.anIntArray439[local1392] + this.anIntArray436[local1392] * local2043[3] + this.anIntArray438[local1392] * local2043[4] + 8192 >> 14;
							local1528 = local2043[7] * this.anIntArray438[local1392] + local2043[6] * this.anIntArray436[local1392] + local2043[8] * this.anIntArray439[local1392] + 8192 >> 14;
							@Pc(2318) int local2318 = local1396 + local2049;
							@Pc(2322) int local2322 = local1398 + local1242;
							this.anIntArray436[local1392] = local2318;
							@Pc(2331) int local2331 = local1528 + local1246;
							this.anIntArray438[local1392] = local2322;
							this.anIntArray439[local1392] = local2331;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "(I)V")
	@Override
	public void v(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class2_Sub3.anIntArray620[arg0];
		@Pc(13) int local13 = Class2_Sub3.anIntArray621[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6662; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray436[local15] + this.anIntArray438[local15] * local9 >> 14;
			this.anIntArray438[local15] = local13 * this.anIntArray438[local15] - this.anIntArray436[local15] * local9 >> 14;
			this.anIntArray436[local15] = local33;
		}
		this.aBoolean575 = false;
		if (this.aClass346_10 != null) {
			this.aClass346_10.anInterface16_6 = null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "()[Lclient!rea;")
	@Override
	public Class280[] method7135() {
		return this.aClass280Array6;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V")
	private void method5578() {
		if (!this.aBoolean574) {
			return;
		}
		this.aBoolean574 = false;
		if (this.aClass121Array6 == null && this.aClass280Array6 == null && this.aClass266Array1 == null) {
			if (this.anIntArray436 != null && !Static589.method8328(this.anInt6695, this.anInt6675)) {
				if (this.aClass346_10 != null && this.aClass346_10.anInterface16_6 == null) {
					this.aBoolean574 = true;
				} else {
					if (!this.aBoolean575) {
						this.method5581();
					}
					this.anIntArray436 = null;
				}
			}
			if (this.anIntArray438 != null && !Static358.method5932(this.anInt6695, this.anInt6675)) {
				if (this.aClass346_10 != null && this.aClass346_10.anInterface16_6 == null) {
					this.aBoolean574 = true;
				} else {
					if (!this.aBoolean575) {
						this.method5581();
					}
					this.anIntArray438 = null;
				}
			}
			if (this.anIntArray439 != null && !Static566.method8143(this.anInt6675, this.anInt6695)) {
				if (this.aClass346_10 != null && this.aClass346_10.anInterface16_6 == null) {
					this.aBoolean574 = true;
				} else {
					if (!this.aBoolean575) {
						this.method5581();
					}
					this.anIntArray439 = null;
				}
			}
		}
		if (this.aShortArray101 != null && this.anIntArray436 == null && this.anIntArray438 == null && this.anIntArray439 == null) {
			this.aShortArray101 = null;
			this.anIntArray435 = null;
		}
		if (this.aByteArray76 != null && !Static238.method8060(this.anInt6695, this.anInt6675)) {
			if (this.aClass346_11 == null) {
				if (this.aClass346_12 != null && this.aClass346_12.anInterface16_6 == null) {
					this.aBoolean574 = true;
				} else {
					this.aByteArray76 = null;
					this.aShortArray105 = this.aShortArray107 = this.aShortArray106 = null;
				}
			} else if (this.aClass346_11.anInterface16_6 == null) {
				this.aBoolean574 = true;
			} else {
				this.aShortArray105 = this.aShortArray107 = this.aShortArray106 = null;
				this.aByteArray76 = null;
			}
		}
		if (this.aShortArray103 != null && !Static249.method1649(this.anInt6695, this.anInt6675)) {
			if (this.aClass346_12 != null && this.aClass346_12.anInterface16_6 == null) {
				this.aBoolean574 = true;
			} else {
				this.aShortArray103 = null;
			}
		}
		if (this.aByteArray77 != null && !Static82.method1134(this.anInt6675, this.anInt6695)) {
			if (this.aClass346_12 != null && this.aClass346_12.anInterface16_6 == null) {
				this.aBoolean574 = true;
			} else {
				this.aByteArray77 = null;
			}
		}
		if (this.aFloatArray61 != null && !Static548.method8016(this.anInt6675, this.anInt6695)) {
			if (this.aClass346_9 != null && this.aClass346_9.anInterface16_6 == null) {
				this.aBoolean574 = true;
			} else {
				this.aFloatArray61 = this.aFloatArray60 = null;
			}
		}
		if (this.aShortArray98 != null && !Static347.method5855(this.anInt6675, this.anInt6695)) {
			if (this.aClass346_12 != null && this.aClass346_12.anInterface16_6 == null) {
				this.aBoolean574 = true;
			} else {
				this.aShortArray98 = null;
			}
		}
		if (this.aShortArray108 != null && !Static265.method4661(this.anInt6695, this.anInt6675)) {
			if ((this.aClass224_1 == null || this.aClass224_1.anInterface21_4 != null) && (this.aClass346_12 == null || this.aClass346_12.anInterface16_6 != null)) {
				this.aShortArray108 = this.aShortArray100 = this.aShortArray102 = null;
			} else {
				this.aBoolean574 = true;
			}
		}
		if (this.anIntArrayArray54 != null && !Static91.method2090(this.anInt6675, this.anInt6695)) {
			this.anIntArrayArray54 = null;
			this.aShortArray104 = null;
		}
		if (this.anIntArrayArray55 != null && !Static534.method7871(this.anInt6695, this.anInt6675)) {
			this.aShortArray99 = null;
			this.anIntArrayArray55 = null;
		}
		if (this.anIntArrayArray53 != null && !Static552.method8062(this.anInt6695, this.anInt6675)) {
			this.anIntArrayArray53 = null;
		}
		if (this.anIntArray437 != null && (this.anInt6695 & 0x800) == 0 && (this.anInt6695 & 0x40000) == 0) {
			this.anIntArray437 = null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "(III)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6662; local7++) {
			if (arg0 != 128) {
				this.anIntArray436[local7] = this.anIntArray436[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray438[local7] = arg1 * this.anIntArray438[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray439[local7] = arg2 * this.anIntArray439[local7] >> 7;
			}
		}
		if (this.aClass346_10 != null) {
			this.aClass346_10.anInterface16_6 = null;
		}
		this.aBoolean575 = false;
	}

	@OriginalMember(owner = "client!mf", name = "V", descriptor = "(I)V")
	@Override
	public void V(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class2_Sub3.anIntArray620[arg0];
		@Pc(13) int local13 = Class2_Sub3.anIntArray621[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6662; local15++) {
			local33 = local9 * this.anIntArray439[local15] + this.anIntArray436[local15] * local13 >> 14;
			this.anIntArray439[local15] = local13 * this.anIntArray439[local15] - local9 * this.anIntArray436[local15] >> 14;
			this.anIntArray436[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt6697; local33++) {
			@Pc(86) int local86 = local9 * this.aShortArray106[local33] + this.aShortArray105[local33] * local13 >> 14;
			this.aShortArray106[local33] = (short) (this.aShortArray106[local33] * local13 - this.aShortArray105[local33] * local9 >> 14);
			this.aShortArray105[local33] = (short) local86;
		}
		if (this.aClass346_11 == null && this.aClass346_12 != null) {
			this.aClass346_12.anInterface16_6 = null;
		}
		if (this.aClass346_11 != null) {
			this.aClass346_11.anInterface16_6 = null;
		}
		if (this.aClass346_10 != null) {
			this.aClass346_10.anInterface16_6 = null;
		}
		this.aBoolean575 = false;
	}

	@OriginalMember(owner = "client!mf", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		if (!this.aBoolean575) {
			this.method5581();
		}
		return this.aShort81;
	}

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "()I")
	@Override
	public int F() {
		return this.aShort78;
	}

	@OriginalMember(owner = "client!mf", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		if (this.aClass346_12 != null) {
			this.aClass346_12.anInterface16_6 = null;
		}
		this.aShort82 = (short) arg0;
	}

	@OriginalMember(owner = "client!mf", name = "ka", descriptor = "(SS)V")
	@Override
	public void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass15_Sub3_22.anInterface4_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6657; local11++) {
			if (arg0 == this.aShortArray98[local11]) {
				this.aShortArray98[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class178 local47 = local9.method3088(arg0 & 0xFFFF);
			local35 = local47.aByte52;
			local37 = local47.aByte57;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class178 local68 = local9.method3088(arg1 & 0xFFFF);
			local57 = local68.aByte57;
			local55 = local68.aByte52;
		}
		if (!(local55 != local35 | local37 != local57)) {
			return;
		}
		if (this.aClass266Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt6645; local97++) {
				@Pc(104) Class266 local104 = this.aClass266Array1[local97];
				@Pc(109) Class234 local109 = this.aClass234Array1[local97];
				local109.anInt7179 = Static331.anIntArray442[this.aShortArray103[local104.anInt8216] & 0xFFFF] & 0xFFFFFF | local109.anInt7179 & 0xFF000000;
			}
		}
		if (this.aClass346_12 != null) {
			this.aClass346_12.anInterface16_6 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method5579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg1 && arg3 > arg6 && arg4 > arg6) {
			return false;
		} else if (arg6 > arg1 && arg6 > arg3 && arg6 > arg4) {
			return false;
		} else if (arg2 < arg7 && arg5 > arg2 && arg0 > arg2) {
			return false;
		} else {
			return arg2 <= arg7 || arg2 <= arg5 || arg2 <= arg0;
		}
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "()V")
	@Override
	public void method7142() {
		if (this.anInt6697 <= 0 || this.anInt6676 <= 0) {
			return;
		}
		this.method5577(false);
		if ((this.aByte69 & 0x10) == 0 && this.aClass224_1.anInterface21_4 == null) {
			this.method5583(false);
		}
		this.method5578();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!q;Lclient!ht;I)V")
	@Override
	public void method7145(@OriginalArg(0) Class255 arg0, @OriginalArg(1) Class55_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6697 == 0) {
			return;
		}
		@Pc(16) Class255_Sub1 local16 = this.aClass15_Sub3_22.aClass255_Sub1_4;
		@Pc(19) Class255_Sub1 local19 = (Class255_Sub1) arg0;
		if (!this.aBoolean575) {
			this.method5581();
		}
		Static445.aFloat176 = local16.aFloat168 * local19.aFloat167 + local16.aFloat160 * local19.aFloat158 + local16.aFloat164 * local19.aFloat168;
		Static509.aFloat184 = local16.aFloat164 * local19.aFloat161 + local19.aFloat166 * local16.aFloat160 + local16.aFloat168 * local19.aFloat157 + local16.aFloat161;
		@Pc(72) float local72 = Static509.aFloat184 + Static445.aFloat176 * (float) this.aShort81;
		@Pc(80) float local80 = Static509.aFloat184 + (float) this.aShort77 * Static445.aFloat176;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local97 = (float) this.aShort74 + local72;
			local91 = (float) -this.aShort74 + local80;
		} else {
			local91 = (float) -this.aShort74 + local72;
			local97 = (float) this.aShort74 + local80;
		}
		if (this.aClass15_Sub3_22.aFloat107 <= local91 || local97 <= (float) this.aClass15_Sub3_22.anInt5370) {
			return;
		}
		Static121.aFloat57 = local16.aFloat159 * local19.aFloat166 + local19.aFloat157 * local16.aFloat158 + local16.aFloat162 * local19.aFloat161 + local16.aFloat166;
		Static154.aFloat51 = local19.aFloat158 * local16.aFloat159 + local19.aFloat167 * local16.aFloat158 + local19.aFloat168 * local16.aFloat162;
		@Pc(174) float local174 = (float) this.aShort81 * Static154.aFloat51 + Static121.aFloat57;
		@Pc(182) float local182 = Static121.aFloat57 + (float) this.aShort77 * Static154.aFloat51;
		@Pc(209) float local209;
		@Pc(197) float local197;
		if (local174 > local182) {
			local197 = (local174 + (float) this.aShort74) * (float) this.aClass15_Sub3_22.anInt5349;
			local209 = ((float) -this.aShort74 + local182) * (float) this.aClass15_Sub3_22.anInt5349;
		} else {
			local197 = ((float) this.aShort74 + local182) * (float) this.aClass15_Sub3_22.anInt5349;
			local209 = (float) this.aClass15_Sub3_22.anInt5349 * ((float) -this.aShort74 + local174);
		}
		if (this.aClass15_Sub3_22.aFloat102 <= local209 / local97 || local197 / local97 <= this.aClass15_Sub3_22.aFloat108) {
			return;
		}
		Static524.aFloat187 = local16.aFloat157 + local19.aFloat161 * local16.aFloat163 + local16.aFloat165 * local19.aFloat166 + local19.aFloat157 * local16.aFloat167;
		Static304.aFloat122 = local19.aFloat168 * local16.aFloat163 + local16.aFloat165 * local19.aFloat158 + local19.aFloat167 * local16.aFloat167;
		@Pc(299) float local299 = Static524.aFloat187 + Static304.aFloat122 * (float) this.aShort81;
		@Pc(307) float local307 = Static524.aFloat187 + Static304.aFloat122 * (float) this.aShort77;
		@Pc(334) float local334;
		@Pc(322) float local322;
		if (local307 < local299) {
			local322 = (float) this.aClass15_Sub3_22.anInt5363 * ((float) this.aShort74 + local299);
			local334 = ((float) -this.aShort74 + local307) * (float) this.aClass15_Sub3_22.anInt5363;
		} else {
			local334 = (local299 - (float) this.aShort74) * (float) this.aClass15_Sub3_22.anInt5363;
			local322 = (float) this.aClass15_Sub3_22.anInt5363 * (local307 + (float) this.aShort74);
		}
		if (local334 / local97 >= this.aClass15_Sub3_22.aFloat88 || this.aClass15_Sub3_22.aFloat90 >= local322 / local97) {
			return;
		}
		if (arg1 != null || this.aClass266Array1 != null) {
			Static334.aFloat150 = local19.aFloat159 * local16.aFloat165 + local16.aFloat167 * local19.aFloat165 + local16.aFloat163 * local19.aFloat160;
			Static323.aFloat145 = local19.aFloat162 * local16.aFloat159 + local19.aFloat163 * local16.aFloat158 + local16.aFloat162 * local19.aFloat164;
			Static381.aFloat15 = local19.aFloat160 * local16.aFloat162 + local19.aFloat159 * local16.aFloat159 + local16.aFloat158 * local19.aFloat165;
			Static237.aFloat81 = local19.aFloat165 * local16.aFloat168 + local19.aFloat159 * local16.aFloat160 + local16.aFloat164 * local19.aFloat160;
			Static409.aFloat203 = local19.aFloat163 * local16.aFloat168 + local16.aFloat160 * local19.aFloat162 + local19.aFloat164 * local16.aFloat164;
			Static157.aFloat52 = local19.aFloat162 * local16.aFloat165 + local16.aFloat167 * local19.aFloat163 + local16.aFloat163 * local19.aFloat164;
		}
		if (arg1 != null) {
			@Pc(493) boolean local493 = false;
			@Pc(495) boolean local495 = true;
			@Pc(503) int local503 = this.aShort76 + this.aShort80 >> 1;
			@Pc(511) int local511 = this.aShort75 + this.aShort79 >> 1;
			@Pc(530) int local530 = (int) (Static154.aFloat51 * (float) this.aShort81 + (float) local503 * Static381.aFloat15 + Static121.aFloat57 + Static323.aFloat145 * (float) local511);
			@Pc(549) int local549 = (int) (Static524.aFloat187 + (float) local503 * Static334.aFloat150 + Static304.aFloat122 * (float) this.aShort81 + Static157.aFloat52 * (float) local511);
			@Pc(568) int local568 = (int) ((float) local511 * Static409.aFloat203 + Static509.aFloat184 + (float) local503 * Static237.aFloat81 + (float) this.aShort81 * Static445.aFloat176);
			if (local568 < this.aClass15_Sub3_22.anInt5370) {
				local493 = true;
			} else {
				arg1.anInt3936 = this.aClass15_Sub3_22.anInt5349 * local530 / local568 + this.aClass15_Sub3_22.anInt5350;
				arg1.anInt3937 = this.aClass15_Sub3_22.anInt5354 + local549 * this.aClass15_Sub3_22.anInt5363 / local568;
			}
			@Pc(623) int local623 = (int) (Static154.aFloat51 * (float) this.aShort77 + Static381.aFloat15 * (float) local503 + Static121.aFloat57 + (float) local511 * Static323.aFloat145);
			@Pc(642) int local642 = (int) (Static157.aFloat52 * (float) local511 + Static334.aFloat150 * (float) local503 + Static524.aFloat187 + Static304.aFloat122 * (float) this.aShort77);
			@Pc(661) int local661 = (int) (Static445.aFloat176 * (float) this.aShort77 + Static237.aFloat81 * (float) local503 + Static509.aFloat184 + (float) local511 * Static409.aFloat203);
			if (local661 < this.aClass15_Sub3_22.anInt5370) {
				local493 = true;
			} else {
				arg1.anInt3938 = this.aClass15_Sub3_22.anInt5349 * local623 / local661 + this.aClass15_Sub3_22.anInt5350;
				arg1.anInt3935 = this.aClass15_Sub3_22.anInt5354 + this.aClass15_Sub3_22.anInt5363 * local642 / local661;
			}
			if (local493) {
				if (local568 < this.aClass15_Sub3_22.anInt5370 && this.aClass15_Sub3_22.anInt5370 > local661) {
					local495 = false;
				} else {
					@Pc(735) int local735;
					@Pc(746) int local746;
					@Pc(757) int local757;
					if (this.aClass15_Sub3_22.anInt5370 > local568) {
						local735 = (local661 - this.aClass15_Sub3_22.anInt5370 << 16) / (local661 - local568);
						local746 = local623 + (local735 * (local623 - local530) >> 16);
						local757 = ((local642 - local549) * local735 >> 16) + local642;
						arg1.anInt3936 = this.aClass15_Sub3_22.anInt5349 * local746 / this.aClass15_Sub3_22.anInt5370 + this.aClass15_Sub3_22.anInt5350;
						arg1.anInt3937 = this.aClass15_Sub3_22.anInt5354 + this.aClass15_Sub3_22.anInt5363 * local757 / this.aClass15_Sub3_22.anInt5370;
					} else if (local661 < this.aClass15_Sub3_22.anInt5370) {
						local735 = (local568 - this.aClass15_Sub3_22.anInt5370 << 16) / (local568 - local661);
						local746 = local530 + ((local530 - local623) * local735 >> 16);
						local757 = local549 + (local735 * (local549 - local642) >> 16);
						arg1.anInt3936 = this.aClass15_Sub3_22.anInt5350 + local746 * this.aClass15_Sub3_22.anInt5349 / this.aClass15_Sub3_22.anInt5370;
						arg1.anInt3937 = this.aClass15_Sub3_22.anInt5363 * local757 / this.aClass15_Sub3_22.anInt5370 + this.aClass15_Sub3_22.anInt5354;
					}
				}
			}
			if (local495) {
				arg1.aBoolean304 = true;
				if (local661 < local568) {
					arg1.anInt3934 = this.aClass15_Sub3_22.anInt5350 + (this.aShort74 + local530) * this.aClass15_Sub3_22.anInt5349 / local568 - arg1.anInt3936;
				} else {
					arg1.anInt3934 = this.aClass15_Sub3_22.anInt5349 * (this.aShort74 + local623) / local661 + this.aClass15_Sub3_22.anInt5350 - arg1.anInt3938;
				}
			}
		}
		this.aClass15_Sub3_22.method4423();
		this.aClass15_Sub3_22.method4419(local19);
		this.method5582();
		this.aClass15_Sub3_22.method4380();
		this.method5573();
	}

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V")
	private void method5581() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt6662; local23++) {
			@Pc(30) int local30 = this.anIntArray436[local23];
			@Pc(35) int local35 = this.anIntArray438[local23];
			@Pc(40) int local40 = this.anIntArray439[local23];
			if (local30 < local7) {
				local7 = local30;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			if (local30 > local13) {
				local13 = local30;
			}
			if (local40 > local17) {
				local17 = local40;
			}
			if (local11 > local40) {
				local11 = local40;
			}
			@Pc(82) int local82 = local30 * local30 + local40 * local40;
			if (local19 < local82) {
				local19 = local82;
			}
			local82 = local35 * local35 + local30 * local30 + local40 * local40;
			if (local21 < local82) {
				local21 = local82;
			}
		}
		this.aShort79 = (short) local11;
		this.aShort75 = (short) local17;
		this.aShort80 = (short) local7;
		this.aShort81 = (short) local9;
		this.aShort76 = (short) local13;
		this.aShort77 = (short) local15;
		this.aShort74 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean575 = true;
	}

	@OriginalMember(owner = "client!mf", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		if (this.aClass346_12 != null) {
			this.aClass346_12.anInterface16_6 = null;
		}
		this.aShort78 = (short) arg0;
		if (this.aClass346_11 != null) {
			this.aClass346_11.anInterface16_6 = null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "()I")
	@Override
	public int h() {
		return this.anInt6695;
	}

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V")
	private void method5582() {
		if (this.anInt6676 == 0) {
			return;
		}
		if (this.aByte69 != 0) {
			this.method5577(true);
		}
		this.method5577(false);
		if (this.aClass224_1 != null) {
			if (this.aClass224_1.anInterface21_4 == null) {
				this.method5583((this.aByte69 & 0x10) != 0);
			}
			if (this.aClass224_1.anInterface21_4 != null) {
				this.aClass15_Sub3_22.method4414(this.aClass346_11 != null);
				this.aClass15_Sub3_22.method4409(this.aClass346_12, this.aClass346_9, this.aClass346_11, this.aClass346_10);
				@Pc(79) int local79 = this.anIntArray437.length - 1;
				for (@Pc(81) int local81 = 0; local81 < local79; local81++) {
					@Pc(88) int local88 = this.anIntArray437[local81];
					@Pc(95) int local95 = this.anIntArray437[local81 + 1];
					@Pc(102) int local102 = this.aShortArray98[local88] & 0xFFFF;
					if (local102 == 65535) {
						local102 = -1;
					}
					this.aClass15_Sub3_22.method4403(local102, this.aClass346_11 != null);
					this.aClass15_Sub3_22.method4453((local95 - local88) * 3, this.aClass224_1.anInterface21_4, local88 * 3);
				}
			}
		}
		this.method5578();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7143(@OriginalArg(0) Class255 arg0) {
		@Pc(8) Class255_Sub1 local8 = (Class255_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass121Array6 != null) {
			for (local13 = 0; local13 < this.aClass121Array6.length; local13++) {
				@Pc(20) Class121 local20 = this.aClass121Array6[local13];
				@Pc(22) Class121 local22 = local20;
				if (local20.aClass121_1 != null) {
					local22 = local20.aClass121_1;
				}
				local22.anInt3501 = (int) ((float) this.anIntArray438[local20.anInt3496] * local8.aFloat158 + (float) this.anIntArray436[local20.anInt3496] * local8.aFloat159 + local8.aFloat162 * (float) this.anIntArray439[local20.anInt3496] + local8.aFloat166);
				local22.anInt3503 = (int) (local8.aFloat157 + (float) this.anIntArray438[local20.anInt3496] * local8.aFloat167 + local8.aFloat165 * (float) this.anIntArray436[local20.anInt3496] + (float) this.anIntArray439[local20.anInt3496] * local8.aFloat163);
				local22.anInt3497 = (int) (local8.aFloat161 + local8.aFloat168 * (float) this.anIntArray438[local20.anInt3496] + local8.aFloat160 * (float) this.anIntArray436[local20.anInt3496] + (float) this.anIntArray439[local20.anInt3496] * local8.aFloat164);
				local22.anInt3511 = (int) (local8.aFloat158 * (float) this.anIntArray438[local20.anInt3505] + local8.aFloat159 * (float) this.anIntArray436[local20.anInt3505] + local8.aFloat162 * (float) this.anIntArray439[local20.anInt3505] + local8.aFloat166);
				local22.anInt3509 = (int) (local8.aFloat157 + local8.aFloat163 * (float) this.anIntArray439[local20.anInt3505] + (float) this.anIntArray436[local20.anInt3505] * local8.aFloat165 + local8.aFloat167 * (float) this.anIntArray438[local20.anInt3505]);
				local22.anInt3506 = (int) (local8.aFloat164 * (float) this.anIntArray439[local20.anInt3505] + (float) this.anIntArray438[local20.anInt3505] * local8.aFloat168 + local8.aFloat160 * (float) this.anIntArray436[local20.anInt3505] + local8.aFloat161);
				local22.anInt3498 = (int) (local8.aFloat159 * (float) this.anIntArray436[local20.anInt3508] + (float) this.anIntArray438[local20.anInt3508] * local8.aFloat158 + (float) this.anIntArray439[local20.anInt3508] * local8.aFloat162 + local8.aFloat166);
				local22.anInt3502 = (int) (local8.aFloat157 + (float) this.anIntArray436[local20.anInt3508] * local8.aFloat165 + local8.aFloat167 * (float) this.anIntArray438[local20.anInt3508] + local8.aFloat163 * (float) this.anIntArray439[local20.anInt3508]);
				local22.anInt3499 = (int) (local8.aFloat161 + local8.aFloat160 * (float) this.anIntArray436[local20.anInt3508] + local8.aFloat168 * (float) this.anIntArray438[local20.anInt3508] + local8.aFloat164 * (float) this.anIntArray439[local20.anInt3508]);
			}
		}
		if (this.aClass280Array6 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass280Array6.length; local13++) {
			@Pc(365) Class280 local365 = this.aClass280Array6[local13];
			@Pc(367) Class280 local367 = local365;
			if (local365.aClass280_2 != null) {
				local367 = local365.aClass280_2;
			}
			if (local365.aClass255_7 == null) {
				local365.aClass255_7 = local8.method8170();
			} else {
				local365.aClass255_7.la(local8);
			}
			local367.anInt8550 = (int) ((float) this.anIntArray439[local365.anInt8557] * local8.aFloat162 + local8.aFloat158 * (float) this.anIntArray438[local365.anInt8557] + (float) this.anIntArray436[local365.anInt8557] * local8.aFloat159 + local8.aFloat166);
			local367.anInt8552 = (int) (local8.aFloat167 * (float) this.anIntArray438[local365.anInt8557] + (float) this.anIntArray436[local365.anInt8557] * local8.aFloat165 + local8.aFloat163 * (float) this.anIntArray439[local365.anInt8557] + local8.aFloat157);
			local367.anInt8555 = (int) ((float) this.anIntArray439[local365.anInt8557] * local8.aFloat164 + (float) this.anIntArray436[local365.anInt8557] * local8.aFloat160 + (float) this.anIntArray438[local365.anInt8557] * local8.aFloat168 + local8.aFloat161);
		}
	}

	@OriginalMember(owner = "client!mf", name = "UA", descriptor = "(SS)V")
	@Override
	public void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6657; local3++) {
			if (arg0 == this.aShortArray103[local3]) {
				this.aShortArray103[local3] = arg1;
			}
		}
		if (this.aClass266Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt6645; local30++) {
				@Pc(37) Class266 local37 = this.aClass266Array1[local30];
				@Pc(42) Class234 local42 = this.aClass234Array1[local30];
				local42.anInt7179 = Static331.anIntArray442[this.aShortArray103[local37.anInt8216] & 0xFFFF] & 0xFFFFFF | local42.anInt7179 & 0xFF000000;
			}
		}
		if (this.aClass346_12 != null) {
			this.aClass346_12.anInterface16_6 = null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "ua", descriptor = "(IIII)V")
	@Override
	protected void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static175.anInt3559 = 0;
			Static137.anInt3201 = 0;
			Static193.anInt2483 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt6662; local17++) {
				Static193.anInt2483 += this.anIntArray436[local17];
				Static175.anInt3559 += this.anIntArray438[local17];
				local15++;
				Static137.anInt3201 += this.anIntArray439[local17];
			}
			if (local15 <= 0) {
				Static193.anInt2483 = arg1;
				Static137.anInt3201 = arg3;
				Static175.anInt3559 = arg2;
			} else {
				Static175.anInt3559 = arg2 + Static175.anInt3559 / local15;
				Static193.anInt2483 = arg1 + Static193.anInt2483 / local15;
				Static137.anInt3201 = arg3 + Static137.anInt3201 / local15;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt6662; local15++) {
				this.anIntArray436[local15] += arg1;
				this.anIntArray438[local15] += arg2;
				this.anIntArray439[local15] += arg3;
			}
		} else {
			@Pc(164) int local164;
			@Pc(182) int local182;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt6662; local15++) {
					this.anIntArray436[local15] -= Static193.anInt2483;
					this.anIntArray438[local15] -= Static175.anInt3559;
					this.anIntArray439[local15] -= Static137.anInt3201;
					if (arg3 != 0) {
						local17 = Class2_Sub3.anIntArray620[arg3];
						local164 = Class2_Sub3.anIntArray621[arg3];
						local182 = this.anIntArray436[local15] * local164 + this.anIntArray438[local15] * local17 + 16383 >> 14;
						this.anIntArray438[local15] = local164 * this.anIntArray438[local15] + 16383 - local17 * this.anIntArray436[local15] >> 14;
						this.anIntArray436[local15] = local182;
					}
					if (arg1 != 0) {
						local17 = Class2_Sub3.anIntArray620[arg1];
						local164 = Class2_Sub3.anIntArray621[arg1];
						local182 = local164 * this.anIntArray438[local15] + 16383 - this.anIntArray439[local15] * local17 >> 14;
						this.anIntArray439[local15] = this.anIntArray439[local15] * local164 + local17 * this.anIntArray438[local15] + 16383 >> 14;
						this.anIntArray438[local15] = local182;
					}
					if (arg2 != 0) {
						local17 = Class2_Sub3.anIntArray620[arg2];
						local164 = Class2_Sub3.anIntArray621[arg2];
						local182 = this.anIntArray436[local15] * local164 + local17 * this.anIntArray439[local15] + 16383 >> 14;
						this.anIntArray439[local15] = this.anIntArray439[local15] * local164 + 16383 - local17 * this.anIntArray436[local15] >> 14;
						this.anIntArray436[local15] = local182;
					}
					this.anIntArray436[local15] += Static193.anInt2483;
					this.anIntArray438[local15] += Static175.anInt3559;
					this.anIntArray439[local15] += Static137.anInt3201;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt6662; local15++) {
					this.anIntArray436[local15] -= Static193.anInt2483;
					this.anIntArray438[local15] -= Static175.anInt3559;
					this.anIntArray439[local15] -= Static137.anInt3201;
					this.anIntArray436[local15] = arg1 * this.anIntArray436[local15] / 128;
					this.anIntArray438[local15] = this.anIntArray438[local15] * arg2 / 128;
					this.anIntArray439[local15] = arg3 * this.anIntArray439[local15] / 128;
					this.anIntArray436[local15] += Static193.anInt2483;
					this.anIntArray438[local15] += Static175.anInt3559;
					this.anIntArray439[local15] += Static137.anInt3201;
				}
			} else {
				@Pc(523) Class266 local523;
				@Pc(528) Class234 local528;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.anInt6657; local15++) {
						local17 = arg1 * 8 + (this.aByteArray77[local15] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray77[local15] = (byte) local17;
					}
					if (this.aClass346_12 != null) {
						this.aClass346_12.anInterface16_6 = null;
					}
					if (this.aClass266Array1 != null) {
						for (local17 = 0; local17 < this.anInt6645; local17++) {
							local523 = this.aClass266Array1[local17];
							local528 = this.aClass234Array1[local17];
							local528.anInt7179 = 255 - (this.aByteArray77[local523.anInt8216] & 0xFF) << 24 | local528.anInt7179 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.anInt6657; local15++) {
						local17 = this.aShortArray103[local15] & 0xFFFF;
						local164 = local17 >> 10 & 0x3F;
						local182 = local17 >> 7 & 0x7;
						local182 += arg2 / 4;
						@Pc(595) int local595 = local164 + arg1 & 0x3F;
						@Pc(599) int local599 = local17 & 0x7F;
						if (local182 < 0) {
							local182 = 0;
						} else if (local182 > 7) {
							local182 = 7;
						}
						local599 += arg3;
						if (local599 < 0) {
							local599 = 0;
						} else if (local599 > 127) {
							local599 = 127;
						}
						this.aShortArray103[local15] = (short) (local182 << 7 | local595 << 10 | local599);
					}
					if (this.aClass346_12 != null) {
						this.aClass346_12.anInterface16_6 = null;
					}
					if (this.aClass266Array1 != null) {
						for (local17 = 0; local17 < this.anInt6645; local17++) {
							local523 = this.aClass266Array1[local17];
							local528 = this.aClass234Array1[local17];
							local528.anInt7179 = Static331.anIntArray442[this.aShortArray103[local523.anInt8216] & 0xFFFF] & 0xFFFFFF | local528.anInt7179 & 0xFF000000;
						}
					}
				} else {
					@Pc(717) Class234 local717;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt6645; local15++) {
							local717 = this.aClass234Array1[local15];
							local717.anInt7178 += arg1;
							local717.anInt7177 += arg2;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt6645; local15++) {
							local717 = this.aClass234Array1[local15];
							local717.anInt7176 = local717.anInt7176 * arg1 >> 7;
							local717.anInt7184 = arg2 * local717.anInt7184 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt6645; local15++) {
							local717 = this.aClass234Array1[local15];
							local717.anInt7175 = arg1 + local717.anInt7175 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class21 method7131(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class21_Sub3 local12;
		@Pc(16) Class21_Sub3 local16;
		if (arg0 == 1) {
			local12 = this.aClass15_Sub3_22.bf;
			local16 = this.aClass15_Sub3_22.aClass21_Sub3_6;
		} else if (arg0 == 2) {
			local16 = this.aClass15_Sub3_22.aClass21_Sub3_5;
			local12 = this.aClass15_Sub3_22.aClass21_Sub3_2;
		} else if (arg0 == 3) {
			local12 = this.aClass15_Sub3_22.aClass21_Sub3_3;
			local16 = this.aClass15_Sub3_22.aClass21_Sub3_7;
		} else if (arg0 == 4) {
			local16 = this.aClass15_Sub3_22.aClass21_Sub3_1;
			local12 = this.aClass15_Sub3_22.aClass21_Sub3_8;
		} else if (arg0 == 5) {
			local16 = this.aClass15_Sub3_22.aClass21_Sub3_4;
			local12 = this.aClass15_Sub3_22.aClass21_Sub3_9;
		} else {
			local12 = local16 = new Class21_Sub3(this.aClass15_Sub3_22);
		}
		return this.method5585(arg1, local16, arg0 != 0, local12, arg2);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class255_Sub1 local8 = (Class255_Sub1) arg2;
		@Pc(12) Class255_Sub1 local12 = this.aClass15_Sub3_22.aClass255_Sub1_4;
		@Pc(33) float local33 = local12.aFloat166 + local8.aFloat157 * local12.aFloat158 + local12.aFloat159 * local8.aFloat166 + local8.aFloat161 * local12.aFloat162;
		@Pc(54) float local54 = local12.aFloat165 * local8.aFloat166 + local8.aFloat157 * local12.aFloat167 + local8.aFloat161 * local12.aFloat163 + local12.aFloat157;
		Static237.aFloat81 = local8.aFloat160 * local12.aFloat164 + local12.aFloat160 * local8.aFloat159 + local8.aFloat165 * local12.aFloat168;
		Static304.aFloat122 = local12.aFloat167 * local8.aFloat167 + local12.aFloat165 * local8.aFloat158 + local8.aFloat168 * local12.aFloat163;
		Static323.aFloat145 = local12.aFloat158 * local8.aFloat163 + local12.aFloat159 * local8.aFloat162 + local12.aFloat162 * local8.aFloat164;
		Static157.aFloat52 = local8.aFloat164 * local12.aFloat163 + local8.aFloat162 * local12.aFloat165 + local12.aFloat167 * local8.aFloat163;
		Static154.aFloat51 = local8.aFloat158 * local12.aFloat159 + local12.aFloat158 * local8.aFloat167 + local8.aFloat168 * local12.aFloat162;
		Static381.aFloat15 = local12.aFloat158 * local8.aFloat165 + local8.aFloat159 * local12.aFloat159 + local12.aFloat162 * local8.aFloat160;
		Static334.aFloat150 = local12.aFloat163 * local8.aFloat160 + local8.aFloat165 * local12.aFloat167 + local12.aFloat165 * local8.aFloat159;
		@Pc(201) float local201 = local12.aFloat161 + local8.aFloat157 * local12.aFloat168 + local8.aFloat166 * local12.aFloat160 + local12.aFloat164 * local8.aFloat161;
		Static445.aFloat176 = local8.aFloat167 * local12.aFloat168 + local12.aFloat160 * local8.aFloat158 + local12.aFloat164 * local8.aFloat168;
		Static409.aFloat203 = local12.aFloat164 * local8.aFloat164 + local8.aFloat162 * local12.aFloat160 + local8.aFloat163 * local12.aFloat168;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass15_Sub3_22.anInt5349;
		@Pc(255) int local255 = this.aClass15_Sub3_22.anInt5363;
		if (!this.aBoolean575) {
			this.method5581();
		}
		Static541.anIntArray651[0] = this.aShort80;
		Static553.anIntArray655[0] = this.aShort81;
		Static279.anIntArray361[0] = this.aShort79;
		Static541.anIntArray651[1] = this.aShort76;
		Static553.anIntArray655[1] = this.aShort81;
		Static279.anIntArray361[1] = this.aShort79;
		Static541.anIntArray651[2] = this.aShort80;
		Static553.anIntArray655[2] = this.aShort77;
		Static541.anIntArray651[3] = this.aShort76;
		Static279.anIntArray361[2] = this.aShort79;
		Static553.anIntArray655[3] = this.aShort77;
		Static279.anIntArray361[3] = this.aShort79;
		Static541.anIntArray651[4] = this.aShort80;
		Static553.anIntArray655[4] = this.aShort81;
		Static279.anIntArray361[4] = this.aShort75;
		Static541.anIntArray651[5] = this.aShort76;
		Static553.anIntArray655[5] = this.aShort81;
		Static541.anIntArray651[6] = this.aShort80;
		Static279.anIntArray361[5] = this.aShort75;
		Static553.anIntArray655[6] = this.aShort77;
		Static279.anIntArray361[6] = this.aShort75;
		Static541.anIntArray651[7] = this.aShort76;
		Static553.anIntArray655[7] = this.aShort77;
		Static279.anIntArray361[7] = this.aShort75;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(390) float local390;
		@Pc(400) float local400;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static541.anIntArray651[local383];
			local395 = Static279.anIntArray361[local383];
			local400 = Static553.anIntArray655[local383];
			local414 = Static409.aFloat203 * local395 + local390 * Static237.aFloat81 + Static445.aFloat176 * local400 + local201;
			local428 = local33 + local395 * Static323.aFloat145 + Static381.aFloat15 * local390 + local400 * Static154.aFloat51;
			local442 = local54 + Static304.aFloat122 * local400 + Static334.aFloat150 * local390 + Static157.aFloat52 * local395;
			if (local414 >= (float) this.aClass15_Sub3_22.anInt5370) {
				@Pc(461) float local461 = local428 * (float) local251 / local414 + (float) this.aClass15_Sub3_22.anInt5350;
				if (local461 > local243) {
					local243 = local461;
				}
				if (local241 > local461) {
					local241 = local461;
				}
				@Pc(485) float local485 = local442 * (float) local255 / local414 + (float) this.aClass15_Sub3_22.anInt5354;
				if (local245 > local485) {
					local245 = local485;
				}
				local239 = true;
				if (local485 > local247) {
					local247 = local485;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && local245 < (float) arg1 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.anInt6697 > this.aClass15_Sub3_22.anIntArray316.length) {
				this.aClass15_Sub3_22.anIntArray316 = new int[this.anInt6697];
				this.aClass15_Sub3_22.anIntArray315 = new int[this.anInt6697];
			}
			@Pc(558) int[] local558 = this.aClass15_Sub3_22.anIntArray316;
			@Pc(562) int[] local562 = this.aClass15_Sub3_22.anIntArray315;
			@Pc(638) int local638;
			for (@Pc(564) int local564 = 0; local564 < this.anInt6662; local564++) {
				local390 = this.anIntArray436[local564];
				local395 = this.anIntArray439[local564];
				local400 = this.anIntArray438[local564];
				local442 = local54 + Static304.aFloat122 * local400 + local390 * Static334.aFloat150 + local395 * Static157.aFloat52;
				local414 = local201 + local395 * Static409.aFloat203 + Static445.aFloat176 * local400 + Static237.aFloat81 * local390;
				local428 = local33 + local400 * Static154.aFloat51 + Static381.aFloat15 * local390 + local395 * Static323.aFloat145;
				@Pc(645) int local645;
				@Pc(647) int local647;
				@Pc(656) int local656;
				if ((float) this.aClass15_Sub3_22.anInt5370 <= local414) {
					local638 = (int) (local428 * (float) local251 / local414 + (float) this.aClass15_Sub3_22.anInt5350);
					local645 = (int) ((float) this.aClass15_Sub3_22.anInt5354 + local442 * (float) local255 / local414);
					local647 = this.anIntArray435[local564];
					local656 = this.anIntArray435[local564 + 1];
					for (@Pc(715) int local715 = local647; local715 < local656; local715++) {
						@Pc(724) int local724 = this.aShortArray101[local715] - 1;
						if (local724 == -1) {
							break;
						}
						local558[local724] = local638;
						local562[local724] = local645;
					}
				} else {
					local638 = this.anIntArray435[local564];
					local645 = this.anIntArray435[local564 + 1];
					for (local647 = local638; local647 < local645; local647++) {
						local656 = this.aShortArray101[local647] - 1;
						if (local656 == -1) {
							break;
						}
						local558[this.aShortArray101[local647] - 1] = -999999;
					}
				}
			}
			for (local638 = 0; local638 < this.anInt6657; local638++) {
				if (local558[this.aShortArray108[local638]] != -999999 && local558[this.aShortArray100[local638]] != -999999 && local558[this.aShortArray102[local638]] != -999999 && this.method5579(local558[this.aShortArray102[local638]], local562[this.aShortArray108[local638]], arg0, local562[this.aShortArray100[local638]], local562[this.aShortArray102[local638]], local558[this.aShortArray100[local638]], arg1, local558[this.aShortArray108[local638]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mf", name = "Q", descriptor = "()Z")
	@Override
	protected boolean Q() {
		if (this.anIntArrayArray55 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt6687; local12++) {
			this.anIntArray436[local12] <<= 0x4;
			this.anIntArray438[local12] <<= 0x4;
			this.anIntArray439[local12] <<= 0x4;
		}
		Static175.anInt3559 = 0;
		Static193.anInt2483 = 0;
		Static137.anInt3201 = 0;
		return true;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method7147(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class21_Sub3 local8 = (Class21_Sub3) arg0;
		if (this.anInt6657 == 0 || local8.anInt6657 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt6662;
		@Pc(24) int[] local24 = local8.anIntArray436;
		@Pc(27) int[] local27 = local8.anIntArray438;
		@Pc(30) int[] local30 = local8.anIntArray439;
		@Pc(33) short[] local33 = local8.aShortArray105;
		@Pc(36) short[] local36 = local8.aShortArray107;
		@Pc(39) short[] local39 = local8.aShortArray106;
		@Pc(42) byte[] local42 = local8.aByteArray76;
		@Pc(57) short[] local57;
		@Pc(53) short[] local53;
		@Pc(61) short[] local61;
		@Pc(49) byte[] local49;
		if (this.aClass286_1 == null) {
			local49 = null;
			local57 = null;
			local53 = null;
			local61 = null;
		} else {
			local49 = this.aClass286_1.aByteArray93;
			local53 = this.aClass286_1.aShortArray133;
			local57 = this.aClass286_1.aShortArray131;
			local61 = this.aClass286_1.aShortArray132;
		}
		@Pc(78) short[] local78;
		@Pc(90) short[] local90;
		@Pc(82) short[] local82;
		@Pc(86) byte[] local86;
		if (local8.aClass286_1 == null) {
			local90 = null;
			local86 = null;
			local82 = null;
			local78 = null;
		} else {
			local78 = local8.aClass286_1.aShortArray131;
			local82 = local8.aClass286_1.aShortArray132;
			local86 = local8.aClass286_1.aByteArray93;
			local90 = local8.aClass286_1.aShortArray133;
		}
		@Pc(103) int[] local103 = local8.anIntArray435;
		@Pc(106) short[] local106 = local8.aShortArray101;
		if (!local8.aBoolean575) {
			local8.method5581();
		}
		@Pc(115) short local115 = local8.aShort81;
		@Pc(118) short local118 = local8.aShort77;
		@Pc(121) short local121 = local8.aShort80;
		@Pc(124) short local124 = local8.aShort76;
		@Pc(127) short local127 = local8.aShort79;
		@Pc(130) short local130 = local8.aShort75;
		for (@Pc(132) int local132 = 0; local132 < this.anInt6662; local132++) {
			@Pc(142) int local142 = this.anIntArray438[local132] - arg2;
			if (local115 <= local142 && local142 <= local118) {
				@Pc(162) int local162 = this.anIntArray436[local132] - arg1;
				if (local162 >= local121 && local162 <= local124) {
					@Pc(182) int local182 = this.anIntArray439[local132] - arg3;
					if (local182 >= local127 && local182 <= local130) {
						@Pc(192) int local192 = -1;
						@Pc(197) int local197 = this.anIntArray435[local132];
						@Pc(204) int local204 = this.anIntArray435[local132 + 1];
						for (@Pc(206) int local206 = local197; local206 < local204; local206++) {
							local192 = this.aShortArray101[local206] - 1;
							if (local192 == -1 || this.aByteArray76[local192] != 0) {
								break;
							}
						}
						if (local192 != -1) {
							for (@Pc(235) int local235 = 0; local235 < local21; local235++) {
								if (local24[local235] == local162 && local182 == local30[local235] && local142 == local27[local235]) {
									local197 = local103[local235];
									@Pc(266) int local266 = -1;
									local204 = local103[local235 + 1];
									for (@Pc(274) int local274 = local197; local274 < local204; local274++) {
										local266 = local106[local274] - 1;
										if (local266 == -1 || local42[local266] != 0) {
											break;
										}
									}
									if (local266 != -1) {
										if (local57 == null) {
											this.aClass286_1 = new Class286();
											local57 = this.aClass286_1.aShortArray131 = Static423.method6762(this.aShortArray105);
											local53 = this.aClass286_1.aShortArray133 = Static423.method6762(this.aShortArray107);
											local61 = this.aClass286_1.aShortArray132 = Static423.method6762(this.aShortArray106);
											local49 = this.aClass286_1.aByteArray93 = Static121.method3341(this.aByteArray76);
										}
										if (local78 == null) {
											@Pc(351) Class286 local351 = local8.aClass286_1 = new Class286();
											local78 = local351.aShortArray131 = Static423.method6762(local33);
											local90 = local351.aShortArray133 = Static423.method6762(local36);
											local82 = local351.aShortArray132 = Static423.method6762(local39);
											local86 = local351.aByteArray93 = Static121.method3341(local42);
										}
										@Pc(384) short local384 = this.aShortArray105[local192];
										@Pc(389) short local389 = this.aShortArray107[local192];
										@Pc(394) short local394 = this.aShortArray106[local192];
										@Pc(399) byte local399 = this.aByteArray76[local192];
										local197 = local103[local235];
										local204 = local103[local235 + 1];
										@Pc(419) int local419;
										for (@Pc(411) int local411 = local197; local411 < local204; local411++) {
											local419 = local106[local411] - 1;
											if (local419 == -1) {
												break;
											}
											if (local86[local419] != 0) {
												local78[local419] += local384;
												local90[local419] += local389;
												local82[local419] += local394;
												local86[local419] += local399;
											}
										}
										local389 = local36[local266];
										local384 = local33[local266];
										local197 = this.anIntArray435[local132];
										local204 = this.anIntArray435[local132 + 1];
										local394 = local39[local266];
										local399 = local42[local266];
										for (local419 = local197; local419 < local204; local419++) {
											@Pc(506) int local506 = this.aShortArray101[local419] - 1;
											if (local506 == -1) {
												break;
											}
											if (local49[local506] != 0) {
												local57[local506] += local384;
												local53[local506] += local389;
												local61[local506] += local394;
												local49[local506] += local399;
											}
										}
										if (this.aClass346_11 == null && this.aClass346_12 != null) {
											this.aClass346_12.anInterface16_6 = null;
										}
										if (this.aClass346_11 != null) {
											this.aClass346_11.anInterface16_6 = null;
										}
										if (local8.aClass346_11 == null && local8.aClass346_12 != null) {
											local8.aClass346_12.anInterface16_6 = null;
										}
										if (local8.aClass346_11 != null) {
											local8.aClass346_11.anInterface16_6 = null;
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

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!q;Lclient!ht;II)V")
	@Override
	public void method7133(@OriginalArg(0) Class255 arg0, @OriginalArg(1) Class55_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6697 == 0) {
			return;
		}
		@Pc(16) Class255_Sub1 local16 = this.aClass15_Sub3_22.aClass255_Sub1_4;
		@Pc(19) Class255_Sub1 local19 = (Class255_Sub1) arg0;
		if (!this.aBoolean575) {
			this.method5581();
		}
		Static445.aFloat176 = local16.aFloat168 * local19.aFloat167 + local19.aFloat158 * local16.aFloat160 + local16.aFloat164 * local19.aFloat168;
		Static509.aFloat184 = local19.aFloat161 * local16.aFloat164 + local16.aFloat160 * local19.aFloat166 + local19.aFloat157 * local16.aFloat168 + local16.aFloat161;
		@Pc(72) float local72 = (float) this.aShort81 * Static445.aFloat176 + Static509.aFloat184;
		@Pc(80) float local80 = (float) this.aShort77 * Static445.aFloat176 + Static509.aFloat184;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local72 > local80) {
			local91 = (float) -this.aShort74 + local80;
			local97 = local72 + (float) this.aShort74;
		} else {
			local91 = (float) -this.aShort74 + local72;
			local97 = (float) this.aShort74 + local80;
		}
		if (this.aClass15_Sub3_22.aFloat101 <= local91 || local97 <= (float) this.aClass15_Sub3_22.anInt5370) {
			return;
		}
		Static154.aFloat51 = local16.aFloat162 * local19.aFloat168 + local16.aFloat159 * local19.aFloat158 + local19.aFloat167 * local16.aFloat158;
		Static121.aFloat57 = local16.aFloat162 * local19.aFloat161 + local16.aFloat158 * local19.aFloat157 + local16.aFloat159 * local19.aFloat166 + local16.aFloat166;
		@Pc(174) float local174 = Static154.aFloat51 * (float) this.aShort81 + Static121.aFloat57;
		@Pc(182) float local182 = Static121.aFloat57 + Static154.aFloat51 * (float) this.aShort77;
		@Pc(209) float local209;
		@Pc(197) float local197;
		if (local174 > local182) {
			local197 = (float) this.aClass15_Sub3_22.anInt5349 * (local174 + (float) this.aShort74);
			local209 = (float) this.aClass15_Sub3_22.anInt5349 * ((float) -this.aShort74 + local182);
		} else {
			local197 = (float) this.aClass15_Sub3_22.anInt5349 * (local182 + (float) this.aShort74);
			local209 = (float) this.aClass15_Sub3_22.anInt5349 * ((float) -this.aShort74 + local174);
		}
		if (local209 / (float) arg2 >= this.aClass15_Sub3_22.aFloat102 || local197 / (float) arg2 <= this.aClass15_Sub3_22.aFloat108) {
			return;
		}
		Static304.aFloat122 = local16.aFloat165 * local19.aFloat158 + local19.aFloat167 * local16.aFloat167 + local19.aFloat168 * local16.aFloat163;
		Static524.aFloat187 = local16.aFloat163 * local19.aFloat161 + local19.aFloat166 * local16.aFloat165 + local19.aFloat157 * local16.aFloat167 + local16.aFloat157;
		@Pc(301) float local301 = Static524.aFloat187 + (float) this.aShort81 * Static304.aFloat122;
		@Pc(309) float local309 = Static524.aFloat187 + Static304.aFloat122 * (float) this.aShort77;
		@Pc(325) float local325;
		@Pc(336) float local336;
		if (local309 < local301) {
			local325 = (float) this.aClass15_Sub3_22.anInt5363 * ((float) -this.aShort74 + local309);
			local336 = (float) this.aClass15_Sub3_22.anInt5363 * (local301 + (float) this.aShort74);
		} else {
			local325 = ((float) -this.aShort74 + local301) * (float) this.aClass15_Sub3_22.anInt5363;
			local336 = (local309 + (float) this.aShort74) * (float) this.aClass15_Sub3_22.anInt5363;
		}
		if (local325 / (float) arg2 >= this.aClass15_Sub3_22.aFloat88 || local336 / (float) arg2 <= this.aClass15_Sub3_22.aFloat90) {
			return;
		}
		if (arg1 != null || this.aClass266Array1 != null) {
			Static409.aFloat203 = local16.aFloat164 * local19.aFloat164 + local16.aFloat168 * local19.aFloat163 + local19.aFloat162 * local16.aFloat160;
			Static323.aFloat145 = local19.aFloat164 * local16.aFloat162 + local16.aFloat159 * local19.aFloat162 + local19.aFloat163 * local16.aFloat158;
			Static334.aFloat150 = local19.aFloat159 * local16.aFloat165 + local16.aFloat167 * local19.aFloat165 + local16.aFloat163 * local19.aFloat160;
			Static157.aFloat52 = local16.aFloat163 * local19.aFloat164 + local16.aFloat165 * local19.aFloat162 + local16.aFloat167 * local19.aFloat163;
			Static237.aFloat81 = local19.aFloat160 * local16.aFloat164 + local19.aFloat165 * local16.aFloat168 + local19.aFloat159 * local16.aFloat160;
			Static381.aFloat15 = local16.aFloat159 * local19.aFloat159 + local19.aFloat165 * local16.aFloat158 + local16.aFloat162 * local19.aFloat160;
		}
		if (arg1 != null) {
			@Pc(504) int local504 = this.aShort80 + this.aShort76 >> 1;
			@Pc(513) int local513 = this.aShort79 + this.aShort75 >> 1;
			@Pc(532) int local532 = (int) ((float) this.aShort81 * Static154.aFloat51 + Static381.aFloat15 * (float) local504 + Static121.aFloat57 + (float) local513 * Static323.aFloat145);
			@Pc(551) int local551 = (int) (Static524.aFloat187 + (float) local504 * Static334.aFloat150 + (float) this.aShort81 * Static304.aFloat122 + (float) local513 * Static157.aFloat52);
			@Pc(570) int local570 = (int) (Static237.aFloat81 * (float) local504 + Static509.aFloat184 + (float) this.aShort81 * Static445.aFloat176 + Static409.aFloat203 * (float) local513);
			@Pc(589) int local589 = (int) (Static121.aFloat57 + Static381.aFloat15 * (float) local504 + (float) this.aShort77 * Static154.aFloat51 + (float) local513 * Static323.aFloat145);
			@Pc(608) int local608 = (int) ((float) local513 * Static157.aFloat52 + (float) local504 * Static334.aFloat150 + Static524.aFloat187 + Static304.aFloat122 * (float) this.aShort77);
			arg1.anInt3936 = local532 * this.aClass15_Sub3_22.anInt5349 / arg2 + this.aClass15_Sub3_22.anInt5350;
			@Pc(640) int local640 = (int) ((float) local513 * Static409.aFloat203 + (float) this.aShort77 * Static445.aFloat176 + (float) local504 * Static237.aFloat81 + Static509.aFloat184);
			arg1.anInt3938 = this.aClass15_Sub3_22.anInt5349 * local589 / arg2 + this.aClass15_Sub3_22.anInt5350;
			arg1.anInt3937 = this.aClass15_Sub3_22.anInt5354 + local551 * this.aClass15_Sub3_22.anInt5363 / arg2;
			arg1.anInt3935 = this.aClass15_Sub3_22.anInt5363 * local608 / arg2 + this.aClass15_Sub3_22.anInt5354;
			if (local570 < this.aClass15_Sub3_22.anInt5370 && local640 < this.aClass15_Sub3_22.anInt5370) {
				arg1.aBoolean304 = true;
				arg1.anInt3934 = this.aClass15_Sub3_22.anInt5349 * (this.aShort74 + local532) / arg2 + this.aClass15_Sub3_22.anInt5350 - arg1.anInt3936;
			}
		}
		this.aClass15_Sub3_22.method4402((float) arg2);
		this.aClass15_Sub3_22.method4447();
		this.aClass15_Sub3_22.method4419(local19);
		this.method5582();
		this.aClass15_Sub3_22.method4380();
		this.method5573();
	}

	@OriginalMember(owner = "client!mf", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class2_Sub3.anIntArray620[arg0];
		@Pc(13) int local13 = Class2_Sub3.anIntArray621[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6662; local15++) {
			@Pc(33) int local33 = this.anIntArray436[local15] * local13 + local9 * this.anIntArray439[local15] >> 14;
			this.anIntArray439[local15] = this.anIntArray439[local15] * local13 - this.anIntArray436[local15] * local9 >> 14;
			this.anIntArray436[local15] = local33;
		}
		if (this.aClass346_10 != null) {
			this.aClass346_10.anInterface16_6 = null;
		}
		this.aBoolean575 = false;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)V")
	private void method5583(@OriginalArg(1) boolean arg0) {
		if (this.anInt6676 * 6 > this.aClass15_Sub3_22.aClass3_Sub7_Sub2_3.aByteArray86.length) {
			this.aClass15_Sub3_22.aClass3_Sub7_Sub2_3 = new Class3_Sub7_Sub2((this.anInt6676 + 100) * 6);
		} else {
			this.aClass15_Sub3_22.aClass3_Sub7_Sub2_3.anInt7869 = 0;
		}
		@Pc(38) Class3_Sub7_Sub2 local38 = this.aClass15_Sub3_22.aClass3_Sub7_Sub2_3;
		@Pc(44) int local44;
		if (this.aClass15_Sub3_22.aBoolean442) {
			for (local44 = 0; local44 < this.anInt6676; local44++) {
				local38.method6528(this.aShortArray108[local44]);
				local38.method6528(this.aShortArray100[local44]);
				local38.method6528(this.aShortArray102[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt6676; local44++) {
				local38.method6498(this.aShortArray108[local44]);
				local38.method6498(this.aShortArray100[local44]);
				local38.method6498(this.aShortArray102[local44]);
			}
		}
		if (local38.anInt7869 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface21_3 == null) {
				this.anInterface21_3 = this.aClass15_Sub3_22.method4459(true, local38.aByteArray86, local38.anInt7869);
			} else {
				this.anInterface21_3.method7918(local38.aByteArray86, local38.anInt7869);
			}
			this.aClass224_1.anInterface21_4 = this.anInterface21_3;
		} else {
			this.aClass224_1.anInterface21_4 = this.aClass15_Sub3_22.method4459(false, local38.aByteArray86, local38.anInt7869);
		}
		if (!arg0) {
			this.aBoolean574 = true;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!mf;ZBLclient!mf;Z)Lclient!ba;")
	private Class21 method5585(@OriginalArg(0) int arg0, @OriginalArg(1) Class21_Sub3 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class21_Sub3 arg3, @OriginalArg(5) boolean arg4) {
		arg3.anInt6645 = this.anInt6645;
		arg3.anInt6657 = this.anInt6657;
		arg3.anInt6676 = this.anInt6676;
		arg3.anInt6662 = this.anInt6662;
		arg3.anInt6675 = this.anInt6675;
		arg3.aShort82 = this.aShort82;
		arg3.anInt6697 = this.anInt6697;
		arg3.aByte69 = 0;
		arg3.anInt6687 = this.anInt6687;
		arg3.anInt6695 = arg0;
		arg3.aShort78 = this.aShort78;
		@Pc(53) boolean local53 = Static548.method8015(this.anInt6675, arg0);
		@Pc(59) boolean local59 = Static497.method7515(this.anInt6675, arg0);
		@Pc(65) boolean local65 = Static458.method7062(arg0, this.anInt6675);
		@Pc(71) boolean local71 = local65 | local53 | local59;
		@Pc(190) int local190;
		if (local71) {
			if (!local53) {
				arg3.anIntArray436 = this.anIntArray436;
			} else if (arg1.anIntArray436 == null || this.anInt6687 > arg1.anIntArray436.length) {
				arg3.anIntArray436 = arg1.anIntArray436 = new int[this.anInt6687];
			} else {
				arg3.anIntArray436 = arg1.anIntArray436;
			}
			if (!local59) {
				arg3.anIntArray438 = this.anIntArray438;
			} else if (arg1.anIntArray438 == null || arg1.anIntArray438.length < this.anInt6687) {
				arg3.anIntArray438 = arg1.anIntArray438 = new int[this.anInt6687];
			} else {
				arg3.anIntArray438 = arg1.anIntArray438;
			}
			if (!local65) {
				arg3.anIntArray439 = this.anIntArray439;
			} else if (arg1.anIntArray439 == null || arg1.anIntArray439.length < this.anInt6687) {
				arg3.anIntArray439 = arg1.anIntArray439 = new int[this.anInt6687];
			} else {
				arg3.anIntArray439 = arg1.anIntArray439;
			}
			for (local190 = 0; local190 < this.anInt6687; local190++) {
				if (local53) {
					arg3.anIntArray436[local190] = this.anIntArray436[local190];
				}
				if (local59) {
					arg3.anIntArray438[local190] = this.anIntArray438[local190];
				}
				if (local65) {
					arg3.anIntArray439[local190] = this.anIntArray439[local190];
				}
			}
		} else {
			arg3.anIntArray436 = this.anIntArray436;
			arg3.anIntArray439 = this.anIntArray439;
			arg3.anIntArray438 = this.anIntArray438;
		}
		if (Static237.method4127(arg0, this.anInt6675)) {
			if (arg2) {
				arg3.aByte69 = (byte) (arg3.aByte69 | 0x1);
			}
			arg3.aClass346_10 = arg1.aClass346_10;
			arg3.aClass346_10.anInterface16_6 = this.aClass346_10.anInterface16_6;
			arg3.aClass346_10.aByte106 = this.aClass346_10.aByte106;
		} else if (Static259.method4588(arg0, this.anInt6675)) {
			arg3.aClass346_10 = this.aClass346_10;
		} else {
			arg3.aClass346_10 = null;
		}
		if (Static381.method1552(arg0, this.anInt6675)) {
			if (arg1.aShortArray103 == null || this.anInt6657 > arg1.aShortArray103.length) {
				arg3.aShortArray103 = arg1.aShortArray103 = new short[this.anInt6657];
			} else {
				arg3.aShortArray103 = arg1.aShortArray103;
			}
			for (local190 = 0; local190 < this.anInt6657; local190++) {
				arg3.aShortArray103[local190] = this.aShortArray103[local190];
			}
		} else {
			arg3.aShortArray103 = this.aShortArray103;
		}
		if (Static130.method2554(arg0, this.anInt6675)) {
			if (arg1.aByteArray77 == null || arg1.aByteArray77.length < this.anInt6657) {
				arg3.aByteArray77 = arg1.aByteArray77 = new byte[this.anInt6657];
			} else {
				arg3.aByteArray77 = arg1.aByteArray77;
			}
			for (local190 = 0; local190 < this.anInt6657; local190++) {
				arg3.aByteArray77[local190] = this.aByteArray77[local190];
			}
		} else {
			arg3.aByteArray77 = this.aByteArray77;
		}
		if (Static251.method4498(arg0, this.anInt6675)) {
			if (arg2) {
				arg3.aByte69 = (byte) (arg3.aByte69 | 0x2);
			}
			arg3.aClass346_12 = arg1.aClass346_12;
			arg3.aClass346_12.anInterface16_6 = this.aClass346_12.anInterface16_6;
			arg3.aClass346_12.aByte106 = this.aClass346_12.aByte106;
		} else if (Static259.method4587(arg0, this.anInt6675)) {
			arg3.aClass346_12 = this.aClass346_12;
		} else {
			arg3.aClass346_12 = null;
		}
		@Pc(551) int local551;
		if (Static387.method6201(this.anInt6675, arg0)) {
			if (arg1.aShortArray105 == null || this.anInt6697 > arg1.aShortArray105.length) {
				local190 = this.anInt6697;
				arg3.aShortArray107 = arg1.aShortArray107 = new short[local190];
				arg3.aShortArray105 = arg1.aShortArray105 = new short[local190];
				arg3.aShortArray106 = arg1.aShortArray106 = new short[local190];
			} else {
				arg3.aShortArray107 = arg1.aShortArray107;
				arg3.aShortArray105 = arg1.aShortArray105;
				arg3.aShortArray106 = arg1.aShortArray106;
			}
			if (this.aClass286_1 == null) {
				for (local190 = 0; local190 < this.anInt6697; local190++) {
					arg3.aShortArray105[local190] = this.aShortArray105[local190];
					arg3.aShortArray107[local190] = this.aShortArray107[local190];
					arg3.aShortArray106[local190] = this.aShortArray106[local190];
				}
			} else {
				if (arg1.aClass286_1 == null) {
					arg1.aClass286_1 = new Class286();
				}
				@Pc(535) Class286 local535 = arg3.aClass286_1 = arg1.aClass286_1;
				if (local535.aShortArray131 == null || local535.aShortArray131.length < this.anInt6697) {
					local551 = this.anInt6697;
					local535.aShortArray131 = new short[local551];
					local535.aByteArray93 = new byte[local551];
					local535.aShortArray133 = new short[local551];
					local535.aShortArray132 = new short[local551];
				}
				for (local551 = 0; local551 < this.anInt6697; local551++) {
					arg3.aShortArray105[local551] = this.aShortArray105[local551];
					arg3.aShortArray107[local551] = this.aShortArray107[local551];
					arg3.aShortArray106[local551] = this.aShortArray106[local551];
					local535.aShortArray131[local551] = this.aClass286_1.aShortArray131[local551];
					local535.aShortArray133[local551] = this.aClass286_1.aShortArray133[local551];
					local535.aShortArray132[local551] = this.aClass286_1.aShortArray132[local551];
					local535.aByteArray93[local551] = this.aClass286_1.aByteArray93[local551];
				}
			}
			arg3.aByteArray76 = this.aByteArray76;
		} else {
			arg3.aClass286_1 = this.aClass286_1;
			arg3.aByteArray76 = this.aByteArray76;
			arg3.aShortArray106 = this.aShortArray106;
			arg3.aShortArray105 = this.aShortArray105;
			arg3.aShortArray107 = this.aShortArray107;
		}
		if (Static425.method6774(arg0, this.anInt6675)) {
			if (arg2) {
				arg3.aByte69 = (byte) (arg3.aByte69 | 0x4);
			}
			arg3.aClass346_11 = arg1.aClass346_11;
			arg3.aClass346_11.anInterface16_6 = this.aClass346_11.anInterface16_6;
			arg3.aClass346_11.aByte106 = this.aClass346_11.aByte106;
		} else if (Static263.method4657(this.anInt6675, arg0)) {
			arg3.aClass346_11 = this.aClass346_11;
		} else {
			arg3.aClass346_11 = null;
		}
		if (Static377.method6099(arg0, this.anInt6675)) {
			if (arg1.aFloatArray61 == null || this.anInt6657 > arg1.aFloatArray61.length) {
				local190 = this.anInt6697;
				arg3.aFloatArray60 = arg1.aFloatArray60 = new float[local190];
				arg3.aFloatArray61 = arg1.aFloatArray61 = new float[local190];
			} else {
				arg3.aFloatArray60 = arg1.aFloatArray60;
				arg3.aFloatArray61 = arg1.aFloatArray61;
			}
			for (local190 = 0; local190 < this.anInt6697; local190++) {
				arg3.aFloatArray61[local190] = this.aFloatArray61[local190];
				arg3.aFloatArray60[local190] = this.aFloatArray60[local190];
			}
		} else {
			arg3.aFloatArray61 = this.aFloatArray61;
			arg3.aFloatArray60 = this.aFloatArray60;
		}
		if (Static574.method8204(arg0, this.anInt6675)) {
			if (arg2) {
				arg3.aByte69 = (byte) (arg3.aByte69 | 0x8);
			}
			arg3.aClass346_9 = arg1.aClass346_9;
			arg3.aClass346_9.anInterface16_6 = this.aClass346_9.anInterface16_6;
			arg3.aClass346_9.aByte106 = this.aClass346_9.aByte106;
		} else if (Static387.method6199(arg0, this.anInt6675)) {
			arg3.aClass346_9 = this.aClass346_9;
		} else {
			arg3.aClass346_9 = null;
		}
		if (Static329.method5691(this.anInt6675, arg0)) {
			if (arg1.aShortArray108 == null || this.anInt6657 > arg1.aShortArray108.length) {
				local190 = this.anInt6657;
				arg3.aShortArray108 = arg1.aShortArray108 = new short[local190];
				arg3.aShortArray102 = arg1.aShortArray102 = new short[local190];
				arg3.aShortArray100 = arg1.aShortArray100 = new short[local190];
			} else {
				arg3.aShortArray100 = arg1.aShortArray100;
				arg3.aShortArray102 = arg1.aShortArray102;
				arg3.aShortArray108 = arg1.aShortArray108;
			}
			for (local190 = 0; local190 < this.anInt6657; local190++) {
				arg3.aShortArray108[local190] = this.aShortArray108[local190];
				arg3.aShortArray100[local190] = this.aShortArray100[local190];
				arg3.aShortArray102[local190] = this.aShortArray102[local190];
			}
		} else {
			arg3.aShortArray100 = this.aShortArray100;
			arg3.aShortArray102 = this.aShortArray102;
			arg3.aShortArray108 = this.aShortArray108;
		}
		if (Static391.method6248(arg0, this.anInt6675)) {
			if (arg2) {
				arg3.aByte69 = (byte) (arg3.aByte69 | 0x10);
			}
			arg3.aClass224_1 = arg1.aClass224_1;
			arg3.aClass224_1.anInterface21_4 = this.aClass224_1.anInterface21_4;
		} else if (Static390.method6233(this.anInt6675, arg0)) {
			arg3.aClass224_1 = this.aClass224_1;
		} else {
			arg3.aClass224_1 = null;
		}
		if (Static464.method7108(arg0, this.anInt6675)) {
			if (arg1.aShortArray98 == null || this.anInt6657 > arg1.aShortArray98.length) {
				local551 = this.anInt6657;
				arg3.aShortArray98 = arg1.aShortArray98 = new short[local551];
			} else {
				arg3.aShortArray98 = arg1.aShortArray98;
			}
			for (local551 = 0; local551 < this.anInt6657; local551++) {
				arg3.aShortArray98[local551] = this.aShortArray98[local551];
			}
		} else {
			arg3.aShortArray98 = this.aShortArray98;
		}
		if (!Static210.method3685(arg0, this.anInt6675)) {
			arg3.aClass234Array1 = this.aClass234Array1;
		} else if (arg1.aClass234Array1 == null || this.anInt6645 > arg1.aClass234Array1.length) {
			local551 = this.anInt6645;
			arg3.aClass234Array1 = arg1.aClass234Array1 = new Class234[local551];
			for (@Pc(1105) int local1105 = 0; local1105 < this.anInt6645; local1105++) {
				arg3.aClass234Array1[local1105] = this.aClass234Array1[local1105].method5983();
			}
		} else {
			arg3.aClass234Array1 = arg1.aClass234Array1;
			for (local551 = 0; local551 < this.anInt6645; local551++) {
				arg3.aClass234Array1[local551].method5978(this.aClass234Array1[local551]);
			}
		}
		arg3.aClass280Array6 = this.aClass280Array6;
		if (this.aBoolean575) {
			arg3.aShort76 = this.aShort76;
			arg3.aBoolean575 = true;
			arg3.aShort75 = this.aShort75;
			arg3.aShort74 = this.aShort74;
			arg3.aShort79 = this.aShort79;
			arg3.aShort81 = this.aShort81;
			arg3.aShort77 = this.aShort77;
			arg3.aShort80 = this.aShort80;
		} else {
			arg3.aBoolean575 = false;
		}
		arg3.aClass266Array1 = this.aClass266Array1;
		arg3.aClass121Array6 = this.aClass121Array6;
		arg3.anIntArray437 = this.anIntArray437;
		arg3.aShortArray104 = this.aShortArray104;
		arg3.anIntArrayArray54 = this.anIntArrayArray54;
		arg3.anIntArrayArray53 = this.anIntArrayArray53;
		arg3.aShortArray101 = this.aShortArray101;
		arg3.aShortArray99 = this.aShortArray99;
		arg3.anIntArrayArray55 = this.anIntArrayArray55;
		arg3.anIntArray435 = this.anIntArray435;
		return arg3;
	}

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aShort82;
	}
}
