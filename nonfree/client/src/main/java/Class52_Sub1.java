import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class52_Sub1 extends Class52 {

	@OriginalMember(owner = "client!os", name = "r", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!os", name = "s", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!os", name = "u", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!os", name = "v", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!os", name = "w", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!os", name = "y", descriptor = "[B")
	private byte[] aByteArray67;

	@OriginalMember(owner = "client!os", name = "D", descriptor = "S")
	private short aShort71;

	@OriginalMember(owner = "client!os", name = "H", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!os", name = "I", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!os", name = "K", descriptor = "S")
	private short aShort72;

	@OriginalMember(owner = "client!os", name = "P", descriptor = "[Lclient!lp;")
	private Class212[] aClass212Array2;

	@OriginalMember(owner = "client!os", name = "Q", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!os", name = "R", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!os", name = "S", descriptor = "[Lclient!sca;")
	private Class307[] aClass307Array1;

	@OriginalMember(owner = "client!os", name = "W", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!os", name = "X", descriptor = "[Lclient!ns;")
	private Class244[] aClass244Array2;

	@OriginalMember(owner = "client!os", name = "bb", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!os", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!os", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!os", name = "fb", descriptor = "[F")
	private float[] aFloatArray55;

	@OriginalMember(owner = "client!os", name = "hb", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!os", name = "kb", descriptor = "[I")
	private int[] anIntArray401;

	@OriginalMember(owner = "client!os", name = "nb", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!os", name = "pb", descriptor = "B")
	private byte aByte90;

	@OriginalMember(owner = "client!os", name = "rb", descriptor = "[F")
	private float[] aFloatArray56;

	@OriginalMember(owner = "client!os", name = "sb", descriptor = "[I")
	private int[] anIntArray402;

	@OriginalMember(owner = "client!os", name = "wb", descriptor = "I")
	private int anInt6839;

	@OriginalMember(owner = "client!os", name = "xb", descriptor = "[I")
	private int[] anIntArray403;

	@OriginalMember(owner = "client!os", name = "zb", descriptor = "S")
	private short aShort73;

	@OriginalMember(owner = "client!os", name = "Ab", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!os", name = "Cb", descriptor = "I")
	private int anInt6842;

	@OriginalMember(owner = "client!os", name = "Hb", descriptor = "S")
	private short aShort74;

	@OriginalMember(owner = "client!os", name = "Jb", descriptor = "[I")
	private int[] anIntArray404;

	@OriginalMember(owner = "client!os", name = "Sb", descriptor = "Lclient!eq;")
	private Interface8 anInterface8_5;

	@OriginalMember(owner = "client!os", name = "Tb", descriptor = "S")
	private short aShort75;

	@OriginalMember(owner = "client!os", name = "Xb", descriptor = "[Lclient!ie;")
	private Class155[] aClass155Array1;

	@OriginalMember(owner = "client!os", name = "bc", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!os", name = "jc", descriptor = "S")
	private short aShort76;

	@OriginalMember(owner = "client!os", name = "kc", descriptor = "S")
	private short aShort77;

	@OriginalMember(owner = "client!os", name = "pc", descriptor = "I")
	private int anInt6869;

	@OriginalMember(owner = "client!os", name = "qc", descriptor = "Lclient!ii;")
	private Interface12 anInterface12_3;

	@OriginalMember(owner = "client!os", name = "wc", descriptor = "Lclient!hn;")
	private Class140 aClass140_1;

	@OriginalMember(owner = "client!os", name = "yc", descriptor = "[I")
	private int[] anIntArray405;

	@OriginalMember(owner = "client!os", name = "Bc", descriptor = "S")
	private short aShort78;

	@OriginalMember(owner = "client!os", name = "O", descriptor = "Z")
	private boolean aBoolean525 = false;

	@OriginalMember(owner = "client!os", name = "B", descriptor = "I")
	private int anInt6816 = 0;

	@OriginalMember(owner = "client!os", name = "Z", descriptor = "Z")
	private boolean aBoolean526 = true;

	@OriginalMember(owner = "client!os", name = "Eb", descriptor = "I")
	private int anInt6844 = 0;

	@OriginalMember(owner = "client!os", name = "Vb", descriptor = "I")
	private int anInt6855 = 0;

	@OriginalMember(owner = "client!os", name = "ic", descriptor = "Z")
	private boolean aBoolean527 = false;

	@OriginalMember(owner = "client!os", name = "Kb", descriptor = "I")
	private int anInt6847 = 0;

	@OriginalMember(owner = "client!os", name = "Y", descriptor = "I")
	private int anInt6827 = 0;

	@OriginalMember(owner = "client!os", name = "mc", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_30;

	@OriginalMember(owner = "client!os", name = "N", descriptor = "Lclient!mq;")
	private Class226 aClass226_8;

	@OriginalMember(owner = "client!os", name = "Lb", descriptor = "Lclient!mq;")
	private Class226 aClass226_9;

	@OriginalMember(owner = "client!os", name = "zc", descriptor = "Lclient!mq;")
	private Class226 aClass226_11;

	@OriginalMember(owner = "client!os", name = "uc", descriptor = "Lclient!mq;")
	private Class226 aClass226_10;

	@OriginalMember(owner = "client!os", name = "Fb", descriptor = "Lclient!qe;")
	private Class281 aClass281_1;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!lj;)V")
	public Class52_Sub1(@OriginalArg(0) Class78_Sub3 arg0) {
		this.aClass78_Sub3_30 = arg0;
		this.aClass226_8 = new Class226(null, 5126, 3, 0);
		this.aClass226_9 = new Class226(null, 5126, 2, 0);
		this.aClass226_11 = new Class226(null, 5126, 3, 0);
		this.aClass226_10 = new Class226(null, 5121, 4, 0);
		this.aClass281_1 = new Class281();
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!lj;Lclient!nba;IIII)V")
	public Class52_Sub1(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) Class231 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6839 = arg2;
		this.anInt6842 = arg5;
		this.aClass78_Sub3_30 = arg0;
		if (Static567.method5561(arg5, arg2)) {
			this.aClass226_8 = new Class226(null, 5126, 3, 0);
		}
		if (Static115.method1622(arg5, arg2)) {
			this.aClass226_9 = new Class226(null, 5126, 2, 0);
		}
		if (Static100.method1477(arg2, arg5)) {
			this.aClass226_11 = new Class226(null, 5126, 3, 0);
		}
		if (Static280.method4171(arg2, arg5)) {
			this.aClass226_10 = new Class226(null, 5121, 4, 0);
		}
		if (Static345.method7740(arg2, arg5)) {
			this.aClass281_1 = new Class281();
		}
		@Pc(105) Interface9 local105 = arg0.anInterface9_13;
		this.anIntArray403 = new int[arg1.anInt6260 + 1];
		@Pc(116) int[] local116 = new int[arg1.anInt6268];
		for (@Pc(118) int local118 = 0; local118 < arg1.anInt6268; local118++) {
			if ((arg1.aByteArray61 == null || arg1.aByteArray61[local118] != 2) && (arg1.aShortArray51 == null || arg1.aShortArray51[local118] == -1 || !local105.method947(arg1.aShortArray51[local118] & 0xFFFF).aBoolean34)) {
				local116[this.anInt6855++] = local118;
				this.anIntArray403[arg1.aShortArray55[local118]]++;
				this.anIntArray403[arg1.aShortArray61[local118]]++;
				this.anIntArray403[arg1.aShortArray52[local118]]++;
			}
		}
		this.anInt6847 = this.anInt6855;
		@Pc(206) long[] local206 = new long[this.anInt6855];
		@Pc(215) boolean local215 = (this.anInt6839 & 0x100) != 0;
		@Pc(227) int local227;
		@Pc(391) int local391;
		for (@Pc(217) int local217 = 0; local217 < this.anInt6855; local217++) {
			@Pc(223) int local223 = local116[local217];
			@Pc(225) Class17 local225 = null;
			local227 = 0;
			@Pc(229) byte local229 = 0;
			@Pc(231) byte local231 = 0;
			@Pc(233) byte local233 = 0;
			if (arg1.aClass362Array1 != null) {
				@Pc(238) boolean local238 = false;
				for (@Pc(240) int local240 = 0; local240 < arg1.aClass362Array1.length; local240++) {
					@Pc(247) Class362 local247 = arg1.aClass362Array1[local240];
					if (local247.anInt9627 == local223) {
						@Pc(256) Class299 local256 = Static540.method7344(local247.anInt9626);
						if (local256.aBoolean608) {
							local238 = true;
						}
						if (local256.anInt7984 != -1) {
							@Pc(272) Class17 local272 = local105.method947(local256.anInt7984);
							if (local272.aBoolean27) {
								this.aBoolean525 = true;
							}
						}
					}
				}
				if (local238) {
					local206[local217] = Long.MAX_VALUE;
					this.anInt6847--;
					continue;
				}
			}
			@Pc(304) short local304 = -1;
			if (arg1.aShortArray51 != null) {
				local304 = arg1.aShortArray51[local223];
				if (local304 != -1) {
					local225 = local105.method947(local304 & 0xFFFF);
					local233 = local225.aByte20;
					local231 = local225.aByte22;
				}
			}
			@Pc(353) boolean local353 = arg1.aByteArray62 != null && arg1.aByteArray62[local223] != 0 || local225 != null && local225.aBoolean27 | !local225.aBoolean25;
			if ((local215 || local353) && arg1.aByteArray60 != null) {
				local227 += arg1.aByteArray60[local223] << 17;
			}
			if (local353) {
				local227 += 65536;
			}
			local227 += (local231 & 0xFF) << 8;
			local391 = local229 + ((local304 & 0xFFFF) << 16);
			local227 += local233 & 0xFF;
			@Pc(403) int local403 = local391 + (local217 & 0xFFFF);
			local206[local217] = (long) local403 + ((long) local227 << 32);
			this.aBoolean525 |= local353;
		}
		Static575.method7747(local116, local206);
		this.anIntArray405 = arg1.anIntArray372;
		this.anIntArray404 = arg1.anIntArray366;
		this.anInt6816 = arg1.anInt6260;
		this.anInt6844 = arg1.anInt6251;
		this.anIntArray401 = arg1.anIntArray375;
		this.aShortArray67 = arg1.aShortArray53;
		this.aClass212Array2 = arg1.aClass212Array1;
		this.aClass244Array2 = arg1.aClass244Array1;
		@Pc(464) Class337[] local464 = new Class337[this.anInt6816];
		@Pc(484) int local484;
		@Pc(498) int local498;
		if (arg1.aClass362Array1 != null) {
			this.anInt6869 = arg1.aClass362Array1.length;
			this.aClass155Array1 = new Class155[this.anInt6869];
			this.aClass307Array1 = new Class307[this.anInt6869];
			for (local484 = 0; local484 < this.anInt6869; local484++) {
				@Pc(491) Class362 local491 = arg1.aClass362Array1[local484];
				@Pc(496) Class299 local496 = Static540.method7344(local491.anInt9626);
				local498 = -1;
				for (@Pc(500) int local500 = 0; local500 < this.anInt6855; local500++) {
					if (local491.anInt9627 == local116[local500]) {
						local498 = local500;
						break;
					}
				}
				if (local498 == -1) {
					throw new RuntimeException();
				}
				@Pc(544) int local544 = Static226.anIntArray212[arg1.aShortArray59[local491.anInt9627] & 0xFFFF] & 0xFFFFFF;
				@Pc(562) int local562 = local544 | 255 - (arg1.aByteArray62 == null ? 0 : arg1.aByteArray62[local491.anInt9627]) << 24;
				this.aClass307Array1[local484] = new Class307(local498, arg1.aShortArray55[local491.anInt9627], arg1.aShortArray61[local491.anInt9627], arg1.aShortArray52[local491.anInt9627], local496.anInt7990, local496.anInt7991, local496.anInt7984, local496.anInt7988, local496.anInt7989, local496.aBoolean608, local496.aBoolean607, local491.anInt9629);
				this.aClass155Array1[local484] = new Class155(local562);
			}
		}
		local484 = this.anInt6855 * 3;
		this.aShortArray75 = new short[this.anInt6855];
		this.aShortArray71 = new short[this.anInt6855];
		this.aShort77 = (short) arg4;
		this.aByteArray68 = new byte[local484];
		this.aShort71 = (short) arg3;
		this.aShortArray73 = new short[local484];
		this.aShortArray74 = new short[local484];
		this.aShortArray68 = new short[local484];
		this.aShortArray66 = new short[this.anInt6855];
		this.aFloatArray55 = new float[local484];
		this.aShortArray70 = new short[this.anInt6855];
		this.aByteArray67 = new byte[this.anInt6855];
		this.aShortArray65 = new short[local484];
		Static59.aLongArray1 = new long[local484];
		if (arg1.aShortArray56 != null) {
			this.aShortArray72 = new short[this.anInt6855];
		}
		this.aShortArray69 = new short[this.anInt6855];
		this.aFloatArray56 = new float[local484];
		local227 = 0;
		for (local391 = 0; local391 < arg1.anInt6260; local391++) {
			local498 = this.anIntArray403[local391];
			this.anIntArray403[local391] = local227;
			local464[local391] = new Class337();
			local227 += local498;
		}
		this.anIntArray403[arg1.anInt6260] = local227;
		@Pc(743) int[] local743 = null;
		@Pc(745) int[] local745 = null;
		@Pc(747) int[] local747 = null;
		@Pc(749) float[][] local749 = null;
		@Pc(775) int local775;
		@Pc(820) int local820;
		@Pc(826) int local826;
		@Pc(839) int local839;
		@Pc(841) int local841;
		@Pc(877) int local877;
		@Pc(882) int local882;
		@Pc(1040) float local1040;
		@Pc(1032) float local1032;
		@Pc(1024) float local1024;
		if (arg1.aByteArray64 != null) {
			@Pc(755) int local755 = arg1.anInt6267;
			@Pc(758) int[] local758 = new int[local755];
			@Pc(761) int[] local761 = new int[local755];
			@Pc(764) int[] local764 = new int[local755];
			@Pc(767) int[] local767 = new int[local755];
			@Pc(770) int[] local770 = new int[local755];
			@Pc(773) int[] local773 = new int[local755];
			for (local775 = 0; local775 < local755; local775++) {
				local758[local775] = Integer.MAX_VALUE;
				local761[local775] = -2147483647;
				local764[local775] = Integer.MAX_VALUE;
				local767[local775] = -2147483647;
				local770[local775] = Integer.MAX_VALUE;
				local773[local775] = -2147483647;
			}
			local749 = new float[local755][];
			local747 = new int[local755];
			local743 = new int[local755];
			for (local820 = 0; local820 < this.anInt6855; local820++) {
				local826 = local116[local820];
				if (arg1.aByteArray64[local826] != -1) {
					local839 = arg1.aByteArray64[local826] & 0xFF;
					for (local841 = 0; local841 < 3; local841++) {
						@Pc(853) short local853;
						if (local841 == 0) {
							local853 = arg1.aShortArray55[local826];
						} else if (local841 == 1) {
							local853 = arg1.aShortArray61[local826];
						} else {
							local853 = arg1.aShortArray52[local826];
						}
						local877 = arg1.anIntArray372[local853];
						local882 = arg1.anIntArray375[local853];
						@Pc(887) int local887 = arg1.anIntArray366[local853];
						if (local758[local839] > local877) {
							local758[local839] = local877;
						}
						if (local761[local839] < local877) {
							local761[local839] = local877;
						}
						if (local764[local839] > local882) {
							local764[local839] = local882;
						}
						if (local767[local839] < local882) {
							local767[local839] = local882;
						}
						if (local887 < local770[local839]) {
							local770[local839] = local887;
						}
						if (local887 > local773[local839]) {
							local773[local839] = local887;
						}
					}
				}
			}
			local745 = new int[local755];
			for (local826 = 0; local826 < local755; local826++) {
				@Pc(968) byte local968 = arg1.aByteArray59[local826];
				if (local968 > 0) {
					local743[local826] = (local758[local826] + local761[local826]) / 2;
					local745[local826] = (local764[local826] + local767[local826]) / 2;
					local747[local826] = (local773[local826] + local770[local826]) / 2;
					if (local968 == 1) {
						local882 = arg1.anIntArray374[local826];
						local1032 = 64.0F / (float) arg1.anIntArray369[local826];
						if (local882 == 0) {
							local1040 = 1.0F;
							local1024 = 1.0F;
						} else if (local882 <= 0) {
							local1040 = (float) -local882 / 1024.0F;
							local1024 = 1.0F;
						} else {
							local1040 = 1.0F;
							local1024 = (float) local882 / 1024.0F;
						}
					} else if (local968 == 2) {
						local1024 = 64.0F / (float) arg1.anIntArray373[local826];
						local1032 = 64.0F / (float) arg1.anIntArray369[local826];
						local1040 = 64.0F / (float) arg1.anIntArray374[local826];
					} else {
						local1024 = (float) arg1.anIntArray373[local826] / 1024.0F;
						local1040 = (float) arg1.anIntArray374[local826] / 1024.0F;
						local1032 = (float) arg1.anIntArray369[local826] / 1024.0F;
					}
					local749[local826] = Static232.method3445(local1040, local1024, arg1.aShortArray57[local826], arg1.aShortArray58[local826], arg1.aShortArray54[local826], arg1.aByteArray63[local826] & 0xFF, local1032);
				}
			}
		}
		@Pc(1145) Class279[] local1145 = new Class279[arg1.anInt6268];
		@Pc(1164) short local1164;
		@Pc(1175) int local1175;
		@Pc(1186) int local1186;
		@Pc(1247) int local1247;
		for (@Pc(1147) int local1147 = 0; local1147 < arg1.anInt6268; local1147++) {
			@Pc(1154) short local1154 = arg1.aShortArray55[local1147];
			@Pc(1159) short local1159 = arg1.aShortArray61[local1147];
			local1164 = arg1.aShortArray52[local1147];
			local1175 = this.anIntArray405[local1159] - this.anIntArray405[local1154];
			local1186 = this.anIntArray401[local1159] - this.anIntArray401[local1154];
			local775 = this.anIntArray404[local1159] - this.anIntArray404[local1154];
			local820 = this.anIntArray405[local1164] - this.anIntArray405[local1154];
			local826 = this.anIntArray401[local1164] - this.anIntArray401[local1154];
			local839 = this.anIntArray404[local1164] - this.anIntArray404[local1154];
			local841 = local1186 * local839 - local775 * local826;
			local1247 = local820 * local775 - local1175 * local839;
			local877 = local826 * local1175 - local1186 * local820;
			while (local841 > 8192 || local1247 > 8192 || local877 > 8192 || local841 < -8192 || local1247 < -8192 || local877 < -8192) {
				local877 >>= 0x1;
				local1247 >>= 0x1;
				local841 >>= 0x1;
			}
			local882 = (int) Math.sqrt((double) (local877 * local877 + local1247 * local1247 + local841 * local841));
			if (local882 <= 0) {
				local882 = 1;
			}
			local841 = local841 * 256 / local882;
			local877 = local877 * 256 / local882;
			local1247 = local1247 * 256 / local882;
			@Pc(1338) byte local1338 = arg1.aByteArray61 == null ? 0 : arg1.aByteArray61[local1147];
			if (local1338 == 0) {
				@Pc(1366) Class337 local1366 = local464[local1154];
				local1366.anInt8993++;
				local1366.anInt8991 += local841;
				local1366.anInt8990 += local877;
				local1366.anInt8994 += local1247;
				@Pc(1394) Class337 local1394 = local464[local1159];
				local1394.anInt8994 += local1247;
				local1394.anInt8993++;
				local1394.anInt8990 += local877;
				local1394.anInt8991 += local841;
				@Pc(1422) Class337 local1422 = local464[local1164];
				local1422.anInt8993++;
				local1422.anInt8990 += local877;
				local1422.anInt8994 += local1247;
				local1422.anInt8991 += local841;
			} else if (local1338 == 1) {
				@Pc(1351) Class279 local1351 = local1145[local1147] = new Class279();
				local1351.anInt7393 = local1247;
				local1351.anInt7394 = local841;
				local1351.anInt7397 = local877;
			}
		}
		@Pc(1459) int local1459;
		for (@Pc(1453) int local1453 = 0; local1453 < this.anInt6855; local1453++) {
			local1459 = local116[local1453];
			@Pc(1466) int local1466 = arg1.aShortArray59[local1459] & 0xFFFF;
			@Pc(1471) short local1471;
			if (arg1.aShortArray51 == null) {
				local1471 = -1;
			} else {
				local1471 = arg1.aShortArray51[local1459];
			}
			if (arg1.aByteArray64 == null) {
				local1186 = -1;
			} else {
				local1186 = arg1.aByteArray64[local1459];
			}
			if (arg1.aByteArray62 == null) {
				local775 = 0;
			} else {
				local775 = arg1.aByteArray62[local1459] & 0xFF;
			}
			@Pc(1506) float local1506 = 0.0F;
			@Pc(1508) float local1508 = 0.0F;
			@Pc(1510) float local1510 = 0.0F;
			local1040 = 0.0F;
			local1032 = 0.0F;
			local1024 = 0.0F;
			@Pc(1518) byte local1518 = 0;
			@Pc(1520) byte local1520 = 0;
			@Pc(1522) int local1522 = 0;
			@Pc(1557) byte local1557;
			@Pc(1574) short local1574;
			@Pc(2321) short local2321;
			@Pc(2326) short local2326;
			if (local1471 != -1) {
				if (local1186 == -1) {
					local1024 = 0.0F;
					local1518 = 1;
					local1506 = 0.0F;
					local1508 = 1.0F;
					local1040 = 1.0F;
					local1510 = 1.0F;
					local1032 = 0.0F;
					local1520 = 2;
				} else {
					local1186 &= 0xFF;
					local1557 = arg1.aByteArray59[local1186];
					@Pc(1564) short local1564;
					@Pc(1569) short local1569;
					@Pc(1603) float local1603;
					@Pc(1621) float local1621;
					@Pc(1629) float local1629;
					@Pc(1728) float local1728;
					@Pc(1736) float local1736;
					@Pc(1744) float local1744;
					@Pc(1767) float local1767;
					@Pc(1790) float local1790;
					@Pc(1813) float local1813;
					if (local1557 == 0) {
						local1564 = arg1.aShortArray55[local1459];
						local1569 = arg1.aShortArray61[local1459];
						local1574 = arg1.aShortArray52[local1459];
						local2321 = arg1.aShortArray57[local1186];
						local2326 = arg1.aShortArray58[local1186];
						@Pc(2331) short local2331 = arg1.aShortArray54[local1186];
						@Pc(2337) float local2337 = (float) arg1.anIntArray372[local2321];
						@Pc(2343) float local2343 = (float) arg1.anIntArray375[local2321];
						local1603 = arg1.anIntArray366[local2321];
						local1621 = (float) arg1.anIntArray372[local2326] - local2337;
						local1629 = (float) arg1.anIntArray375[local2326] - local2343;
						@Pc(2373) float local2373 = (float) arg1.anIntArray366[local2326] - local1603;
						@Pc(2382) float local2382 = (float) arg1.anIntArray372[local2331] - local2337;
						@Pc(2391) float local2391 = (float) arg1.anIntArray375[local2331] - local2343;
						@Pc(2400) float local2400 = (float) arg1.anIntArray366[local2331] - local1603;
						@Pc(2409) float local2409 = (float) arg1.anIntArray372[local1564] - local2337;
						@Pc(2418) float local2418 = (float) arg1.anIntArray375[local1564] - local2343;
						@Pc(2426) float local2426 = (float) arg1.anIntArray366[local1564] - local1603;
						@Pc(2435) float local2435 = (float) arg1.anIntArray372[local1569] - local2337;
						@Pc(2443) float local2443 = (float) arg1.anIntArray375[local1569] - local2343;
						local1728 = (float) arg1.anIntArray366[local1569] - local1603;
						local1736 = (float) arg1.anIntArray372[local1574] - local2337;
						local1744 = (float) arg1.anIntArray375[local1574] - local2343;
						local1767 = (float) arg1.anIntArray366[local1574] - local1603;
						local1790 = local1629 * local2400 - local2391 * local2373;
						local1813 = local2382 * local2373 - local2400 * local1621;
						@Pc(2503) float local2503 = local1621 * local2391 - local2382 * local1629;
						@Pc(2512) float local2512 = local2391 * local2503 - local1813 * local2400;
						@Pc(2521) float local2521 = local2400 * local1790 - local2382 * local2503;
						@Pc(2530) float local2530 = local2382 * local1813 - local2391 * local1790;
						@Pc(2544) float local2544 = 1.0F / (local2373 * local2530 + local1629 * local2521 + local1621 * local2512);
						local1032 = (local1736 * local2512 + local1744 * local2521 + local1767 * local2530) * local2544;
						local1506 = (local2530 * local2426 + local2521 * local2418 + local2409 * local2512) * local2544;
						local1510 = (local2521 * local2443 + local2435 * local2512 + local2530 * local1728) * local2544;
						@Pc(2594) float local2594 = local1790 * local2373 - local1621 * local2503;
						@Pc(2603) float local2603 = local1621 * local1813 - local1790 * local1629;
						@Pc(2612) float local2612 = local2503 * local1629 - local1813 * local2373;
						@Pc(2626) float local2626 = 1.0F / (local2612 * local2382 + local2594 * local2391 + local2400 * local2603);
						local1040 = local2626 * (local1728 * local2603 + local2435 * local2612 + local2443 * local2594);
						local1024 = (local2594 * local1744 + local2612 * local1736 + local2603 * local1767) * local2626;
						local1508 = (local2594 * local2418 + local2612 * local2409 + local2603 * local2426) * local2626;
					} else {
						local1564 = arg1.aShortArray55[local1459];
						local1569 = arg1.aShortArray61[local1459];
						local1574 = arg1.aShortArray52[local1459];
						@Pc(1578) int local1578 = local743[local1186];
						@Pc(1582) int local1582 = local745[local1186];
						@Pc(1586) int local1586 = local747[local1186];
						@Pc(1590) float[] local1590 = local749[local1186];
						@Pc(1595) byte local1595 = arg1.aByteArray58[local1186];
						local1603 = (float) arg1.anIntArray368[local1186] / 256.0F;
						if (local1557 == 1) {
							local1621 = (float) arg1.anIntArray373[local1186] / 1024.0F;
							Static114.method1612(local1590, arg1.anIntArray375[local1564], local1578, local1621, local1595, local1582, arg1.anIntArray372[local1564], local1603, local1586, arg1.anIntArray366[local1564]);
							local1506 = Static254.aFloat80;
							local1508 = Static434.aFloat196;
							Static114.method1612(local1590, arg1.anIntArray375[local1569], local1578, local1621, local1595, local1582, arg1.anIntArray372[local1569], local1603, local1586, arg1.anIntArray366[local1569]);
							local1040 = Static434.aFloat196;
							local1510 = Static254.aFloat80;
							Static114.method1612(local1590, arg1.anIntArray375[local1574], local1578, local1621, local1595, local1582, arg1.anIntArray372[local1574], local1603, local1586, arg1.anIntArray366[local1574]);
							local1032 = Static254.aFloat80;
							local1024 = Static434.aFloat196;
							local1629 = local1621 / 2.0F;
							if ((local1595 & 0x1) == 0) {
								if (local1629 < local1032 - local1506) {
									local1520 = 1;
									local1032 -= local1621;
								} else if (local1629 < local1506 - local1032) {
									local1520 = 2;
									local1032 += local1621;
								}
								if (local1629 < local1510 - local1506) {
									local1518 = 1;
									local1510 -= local1621;
								} else if (local1629 < local1506 - local1510) {
									local1510 += local1621;
									local1518 = 2;
								}
							} else {
								if (local1040 - local1508 > local1629) {
									local1040 -= local1621;
									local1518 = 1;
								} else if (local1508 - local1040 > local1629) {
									local1518 = 2;
									local1040 += local1621;
								}
								if (local1024 - local1508 > local1629) {
									local1024 -= local1621;
									local1520 = 1;
								} else if (local1508 - local1024 > local1629) {
									local1024 += local1621;
									local1520 = 2;
								}
							}
						} else if (local1557 == 2) {
							local1621 = (float) arg1.anIntArray365[local1186] / 256.0F;
							local1629 = (float) arg1.anIntArray371[local1186] / 256.0F;
							@Pc(1640) int local1640 = arg1.anIntArray372[local1569] - arg1.anIntArray372[local1564];
							@Pc(1651) int local1651 = arg1.anIntArray375[local1569] - arg1.anIntArray375[local1564];
							@Pc(1661) int local1661 = arg1.anIntArray366[local1569] - arg1.anIntArray366[local1564];
							@Pc(1671) int local1671 = arg1.anIntArray372[local1574] - arg1.anIntArray372[local1564];
							@Pc(1682) int local1682 = arg1.anIntArray375[local1574] - arg1.anIntArray375[local1564];
							@Pc(1693) int local1693 = arg1.anIntArray366[local1574] - arg1.anIntArray366[local1564];
							@Pc(1702) int local1702 = local1693 * local1651 - local1682 * local1661;
							@Pc(1711) int local1711 = local1671 * local1661 - local1640 * local1693;
							@Pc(1720) int local1720 = local1682 * local1640 - local1651 * local1671;
							local1728 = 64.0F / (float) arg1.anIntArray374[local1186];
							local1736 = 64.0F / (float) arg1.anIntArray369[local1186];
							local1744 = 64.0F / (float) arg1.anIntArray373[local1186];
							local1767 = ((float) local1720 * local1590[2] + local1590[0] * (float) local1702 + local1590[1] * (float) local1711) / local1728;
							local1790 = (local1590[4] * (float) local1711 + local1590[3] * (float) local1702 + (float) local1720 * local1590[5]) / local1736;
							local1813 = ((float) local1711 * local1590[7] + local1590[6] * (float) local1702 + (float) local1720 * local1590[8]) / local1744;
							local1522 = Static533.method7293(local1790, local1813, local1767);
							Static469.method6498(arg1.anIntArray366[local1564], local1582, local1590, local1578, local1629, arg1.anIntArray375[local1564], local1586, local1595, local1522, local1621, local1603, arg1.anIntArray372[local1564]);
							local1508 = Static410.aFloat186;
							local1506 = Static294.aFloat134;
							Static469.method6498(arg1.anIntArray366[local1569], local1582, local1590, local1578, local1629, arg1.anIntArray375[local1569], local1586, local1595, local1522, local1621, local1603, arg1.anIntArray372[local1569]);
							local1510 = Static294.aFloat134;
							local1040 = Static410.aFloat186;
							Static469.method6498(arg1.anIntArray366[local1574], local1582, local1590, local1578, local1629, arg1.anIntArray375[local1574], local1586, local1595, local1522, local1621, local1603, arg1.anIntArray372[local1574]);
							local1024 = Static410.aFloat186;
							local1032 = Static294.aFloat134;
						} else if (local1557 == 3) {
							Static367.method5657(local1582, local1595, local1586, local1590, local1603, local1578, arg1.anIntArray372[local1564], arg1.anIntArray375[local1564], arg1.anIntArray366[local1564]);
							local1508 = Static357.aFloat178;
							local1506 = Static513.aFloat230;
							Static367.method5657(local1582, local1595, local1586, local1590, local1603, local1578, arg1.anIntArray372[local1569], arg1.anIntArray375[local1569], arg1.anIntArray366[local1569]);
							local1510 = Static513.aFloat230;
							local1040 = Static357.aFloat178;
							Static367.method5657(local1582, local1595, local1586, local1590, local1603, local1578, arg1.anIntArray372[local1574], arg1.anIntArray375[local1574], arg1.anIntArray366[local1574]);
							local1032 = Static513.aFloat230;
							local1024 = Static357.aFloat178;
							if ((local1595 & 0x1) == 0) {
								if (local1032 - local1506 > 0.5F) {
									local1032--;
									local1520 = 1;
								} else if (local1506 - local1032 > 0.5F) {
									local1032++;
									local1520 = 2;
								}
								if (local1510 - local1506 > 0.5F) {
									local1510--;
									local1518 = 1;
								} else if (local1506 - local1510 > 0.5F) {
									local1510++;
									local1518 = 2;
								}
							} else {
								if (local1040 - local1508 > 0.5F) {
									local1040--;
									local1518 = 1;
								} else if (local1508 - local1040 > 0.5F) {
									local1040++;
									local1518 = 2;
								}
								if (local1024 - local1508 > 0.5F) {
									local1520 = 1;
									local1024--;
								} else if (local1508 - local1024 > 0.5F) {
									local1520 = 2;
									local1024++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray61 == null) {
				local1557 = 0;
			} else {
				local1557 = arg1.aByteArray61[local1459];
			}
			if (local1557 == 0) {
				@Pc(2704) long local2704 = (long) (local1186 << 2) + ((long) (local1466 << 8) + (long) (local1522 << 24) + (long) local775 << 32);
				local1574 = arg1.aShortArray55[local1459];
				local2321 = arg1.aShortArray61[local1459];
				local2326 = arg1.aShortArray52[local1459];
				@Pc(2723) Class337 local2723 = local464[local1574];
				this.aShortArray69[local1453] = this.method5551(local2723.anInt8993, arg1, local1508, local2723.anInt8994, local1574, local2723.anInt8990, local1506, local2723.anInt8991, local2704);
				@Pc(2747) Class337 local2747 = local464[local2321];
				this.aShortArray71[local1453] = this.method5551(local2747.anInt8993, arg1, local1040, local2747.anInt8994, local2321, local2747.anInt8990, local1510, local2747.anInt8991, local2704 + (long) local1518);
				@Pc(2774) Class337 local2774 = local464[local2326];
				this.aShortArray66[local1453] = this.method5551(local2774.anInt8993, arg1, local1024, local2774.anInt8994, local2326, local2774.anInt8990, local1032, local2774.anInt8991, (long) local1520 + local2704);
			} else if (local1557 == 1) {
				@Pc(2806) Class279 local2806 = local1145[local1459];
				@Pc(2849) long local2849 = ((long) (local1522 << 24) + (long) (local1466 << 8) + (long) local775 << 32) + (long) ((local2806.anInt7397 + 256 << 22) + ((local1186 << 2) + (local2806.anInt7394 <= 0 ? 2048 : 1024) + (local2806.anInt7393 + 256 << 12)));
				this.aShortArray69[local1453] = this.method5551(0, arg1, local1508, local2806.anInt7393, arg1.aShortArray55[local1459], local2806.anInt7397, local1506, local2806.anInt7394, local2849);
				this.aShortArray71[local1453] = this.method5551(0, arg1, local1040, local2806.anInt7393, arg1.aShortArray61[local1459], local2806.anInt7397, local1510, local2806.anInt7394, local2849 + (long) local1518);
				this.aShortArray66[local1453] = this.method5551(0, arg1, local1024, local2806.anInt7393, arg1.aShortArray52[local1459], local2806.anInt7397, local1032, local2806.anInt7394, local2849 + (long) local1520);
			}
			if (arg1.aShortArray51 == null) {
				this.aShortArray70[local1453] = -1;
			} else {
				this.aShortArray70[local1453] = arg1.aShortArray51[local1459];
			}
			if (arg1.aByteArray62 != null) {
				this.aByteArray67[local1453] = arg1.aByteArray62[local1459];
			}
			if (arg1.aShortArray56 != null) {
				this.aShortArray72[local1453] = arg1.aShortArray56[local1459];
			}
			this.aShortArray75[local1453] = arg1.aShortArray59[local1459];
		}
		local1459 = 0;
		local1164 = -10000;
		for (local1175 = 0; local1175 < this.anInt6847; local1175++) {
			@Pc(2987) short local2987 = this.aShortArray70[local1175];
			if (local2987 != local1164) {
				local1459++;
				local1164 = local2987;
			}
		}
		this.anIntArray402 = new int[local1459 + 1];
		local1164 = -10000;
		local1459 = 0;
		for (local1186 = 0; local1186 < this.anInt6847; local1186++) {
			@Pc(3021) short local3021 = this.aShortArray70[local1186];
			if (local1164 != local3021) {
				local1164 = local3021;
				this.anIntArray402[local1459++] = local1186;
			}
		}
		this.anIntArray402[local1459] = this.anInt6847;
		Static59.aLongArray1 = null;
		this.aShortArray74 = Static167.method2715(this.aShortArray74, this.anInt6827);
		this.aShortArray68 = Static167.method2715(this.aShortArray68, this.anInt6827);
		this.aShortArray65 = Static167.method2715(this.aShortArray65, this.anInt6827);
		this.aByteArray68 = Static40.method717(this.anInt6827, this.aByteArray68);
		this.aFloatArray55 = Static541.method7361(this.anInt6827, this.aFloatArray55);
		this.aFloatArray56 = Static541.method7361(this.anInt6827, this.aFloatArray56);
		if (arg1.anIntArray367 != null && Static355.method5292(this.anInt6842, arg2)) {
			this.anIntArrayArray35 = arg1.method5070(false);
		}
		if (arg1.aClass362Array1 != null && Static375.method5455(arg2, this.anInt6842)) {
			this.anIntArrayArray36 = arg1.method5076();
		}
		if (arg1.anIntArray370 != null && Static543.method7387(this.anInt6842, arg2)) {
			local775 = 0;
			@Pc(3136) int[] local3136 = new int[256];
			for (local826 = 0; local826 < this.anInt6855; local826++) {
				local839 = arg1.anIntArray370[local116[local826]];
				if (local839 >= 0) {
					if (local775 < local839) {
						local775 = local839;
					}
					@Pc(3158) int local3158 = local3136[local839]++;
				}
			}
			this.anIntArrayArray37 = new int[local775 + 1][];
			for (local839 = 0; local839 <= local775; local839++) {
				this.anIntArrayArray37[local839] = new int[local3136[local839]];
				local3136[local839] = 0;
			}
			for (local841 = 0; local841 < this.anInt6855; local841++) {
				local1247 = arg1.anIntArray370[local116[local841]];
				if (local1247 >= 0) {
					this.anIntArrayArray37[local1247][local3136[local1247]++] = local841;
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "()V")
	@Override
	public void method7397() {
		if (this.anInt6827 <= 0 || this.anInt6847 <= 0) {
			return;
		}
		this.method5547(false);
		if ((this.aByte90 & 0x10) == 0 && this.aClass281_1.anInterface12_4 == null) {
			this.method5548(false);
		}
		this.method5545();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7410(@OriginalArg(0) Class34 arg0) {
		@Pc(8) Class34_Sub2 local8 = (Class34_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass244Array2 != null) {
			for (local13 = 0; local13 < this.aClass244Array2.length; local13++) {
				@Pc(20) Class244 local20 = this.aClass244Array2[local13];
				@Pc(22) Class244 local22 = local20;
				if (local20.aClass244_2 != null) {
					local22 = local20.aClass244_2;
				}
				local22.anInt6536 = (int) ((float) this.anIntArray404[local20.anInt6527] * local8.aFloat31 + (float) this.anIntArray401[local20.anInt6527] * local8.aFloat26 + (float) this.anIntArray405[local20.anInt6527] * local8.aFloat29 + local8.aFloat36);
				local22.anInt6534 = (int) (local8.aFloat35 + (float) this.anIntArray405[local20.anInt6527] * local8.aFloat32 + local8.aFloat34 * (float) this.anIntArray401[local20.anInt6527] + local8.aFloat25 * (float) this.anIntArray404[local20.anInt6527]);
				local22.anInt6537 = (int) (local8.aFloat28 * (float) this.anIntArray404[local20.anInt6527] + local8.aFloat33 * (float) this.anIntArray405[local20.anInt6527] + local8.aFloat27 * (float) this.anIntArray401[local20.anInt6527] + local8.aFloat30);
				local22.anInt6525 = (int) (local8.aFloat36 + local8.aFloat29 * (float) this.anIntArray405[local20.anInt6532] + local8.aFloat26 * (float) this.anIntArray401[local20.anInt6532] + local8.aFloat31 * (float) this.anIntArray404[local20.anInt6532]);
				local22.anInt6529 = (int) (local8.aFloat35 + local8.aFloat32 * (float) this.anIntArray405[local20.anInt6532] + (float) this.anIntArray401[local20.anInt6532] * local8.aFloat34 + (float) this.anIntArray404[local20.anInt6532] * local8.aFloat25);
				local22.anInt6533 = (int) ((float) this.anIntArray404[local20.anInt6532] * local8.aFloat28 + local8.aFloat33 * (float) this.anIntArray405[local20.anInt6532] + local8.aFloat27 * (float) this.anIntArray401[local20.anInt6532] + local8.aFloat30);
				local22.anInt6531 = (int) (local8.aFloat36 + local8.aFloat31 * (float) this.anIntArray404[local20.anInt6530] + local8.aFloat29 * (float) this.anIntArray405[local20.anInt6530] + (float) this.anIntArray401[local20.anInt6530] * local8.aFloat26);
				local22.anInt6524 = (int) (local8.aFloat35 + local8.aFloat34 * (float) this.anIntArray401[local20.anInt6530] + (float) this.anIntArray405[local20.anInt6530] * local8.aFloat32 + (float) this.anIntArray404[local20.anInt6530] * local8.aFloat25);
				local22.anInt6535 = (int) (local8.aFloat30 + (float) this.anIntArray404[local20.anInt6530] * local8.aFloat28 + local8.aFloat27 * (float) this.anIntArray401[local20.anInt6530] + local8.aFloat33 * (float) this.anIntArray405[local20.anInt6530]);
			}
		}
		if (this.aClass212Array2 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass212Array2.length; local13++) {
			@Pc(365) Class212 local365 = this.aClass212Array2[local13];
			@Pc(367) Class212 local367 = local365;
			if (local365.aClass212_1 != null) {
				local367 = local365.aClass212_1;
			}
			if (local365.aClass34_4 == null) {
				local365.aClass34_4 = local8.method6215();
			} else {
				local365.aClass34_4.M(local8);
			}
			local367.anInt5651 = (int) ((float) this.anIntArray404[local365.anInt5656] * local8.aFloat31 + (float) this.anIntArray405[local365.anInt5656] * local8.aFloat29 + local8.aFloat26 * (float) this.anIntArray401[local365.anInt5656] + local8.aFloat36);
			local367.anInt5653 = (int) (local8.aFloat35 + local8.aFloat25 * (float) this.anIntArray404[local365.anInt5656] + (float) this.anIntArray405[local365.anInt5656] * local8.aFloat32 + (float) this.anIntArray401[local365.anInt5656] * local8.aFloat34);
			local367.anInt5655 = (int) (local8.aFloat27 * (float) this.anIntArray401[local365.anInt5656] + local8.aFloat33 * (float) this.anIntArray405[local365.anInt5656] + (float) this.anIntArray404[local365.anInt5656] * local8.aFloat28 + local8.aFloat30);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!q;Lclient!et;I)V")
	@Override
	public void method7413(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class11_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6827 == 0) {
			return;
		}
		@Pc(16) Class34_Sub2 local16 = this.aClass78_Sub3_30.aClass34_Sub2_3;
		if (!this.aBoolean527) {
			this.method5544();
		}
		@Pc(25) Class34_Sub2 local25 = (Class34_Sub2) arg0;
		Static477.aFloat204 = local25.aFloat27 * local16.aFloat28 + local25.aFloat26 * local16.aFloat33 + local16.aFloat27 * local25.aFloat34;
		Static464.aFloat227 = local16.aFloat30 + local16.aFloat33 * local25.aFloat36 + local16.aFloat27 * local25.aFloat35 + local16.aFloat28 * local25.aFloat30;
		@Pc(72) float local72 = Static464.aFloat227 + Static477.aFloat204 * (float) this.aShort74;
		@Pc(80) float local80 = Static464.aFloat227 + Static477.aFloat204 * (float) this.aShort69;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local91 = (float) -this.aShort70 + local80;
			local97 = local72 + (float) this.aShort70;
		} else {
			local97 = (float) this.aShort70 + local80;
			local91 = (float) -this.aShort70 + local72;
		}
		if (this.aClass78_Sub3_30.aFloat137 <= local91 || (float) this.aClass78_Sub3_30.anInt5571 >= local97) {
			return;
		}
		Static269.aFloat130 = local16.aFloat31 * local25.aFloat27 + local16.aFloat26 * local25.aFloat34 + local16.aFloat29 * local25.aFloat26;
		Static116.aFloat42 = local25.aFloat30 * local16.aFloat31 + local25.aFloat36 * local16.aFloat29 + local16.aFloat26 * local25.aFloat35 + local16.aFloat36;
		@Pc(174) float local174 = (float) this.aShort74 * Static269.aFloat130 + Static116.aFloat42;
		@Pc(182) float local182 = Static116.aFloat42 + Static269.aFloat130 * (float) this.aShort69;
		@Pc(209) float local209;
		@Pc(197) float local197;
		if (local174 > local182) {
			local197 = (float) this.aClass78_Sub3_30.anInt5597 * ((float) this.aShort70 + local174);
			local209 = (local182 - (float) this.aShort70) * (float) this.aClass78_Sub3_30.anInt5597;
		} else {
			local197 = (float) this.aClass78_Sub3_30.anInt5597 * ((float) this.aShort70 + local182);
			local209 = (float) this.aClass78_Sub3_30.anInt5597 * ((float) -this.aShort70 + local174);
		}
		if (local209 / local97 >= this.aClass78_Sub3_30.aFloat155 || this.aClass78_Sub3_30.aFloat152 >= local197 / local97) {
			return;
		}
		Static20.aFloat2 = local16.aFloat35 + local25.aFloat35 * local16.aFloat34 + local25.aFloat36 * local16.aFloat32 + local25.aFloat30 * local16.aFloat25;
		Static306.aFloat128 = local25.aFloat34 * local16.aFloat34 + local25.aFloat26 * local16.aFloat32 + local16.aFloat25 * local25.aFloat27;
		@Pc(298) float local298 = (float) this.aShort74 * Static306.aFloat128 + Static20.aFloat2;
		@Pc(306) float local306 = Static306.aFloat128 * (float) this.aShort69 + Static20.aFloat2;
		@Pc(333) float local333;
		@Pc(321) float local321;
		if (local298 > local306) {
			local321 = (local298 + (float) this.aShort70) * (float) this.aClass78_Sub3_30.anInt5583;
			local333 = ((float) -this.aShort70 + local306) * (float) this.aClass78_Sub3_30.anInt5583;
		} else {
			local333 = (local298 - (float) this.aShort70) * (float) this.aClass78_Sub3_30.anInt5583;
			local321 = (float) this.aClass78_Sub3_30.anInt5583 * (local306 + (float) this.aShort70);
		}
		if (this.aClass78_Sub3_30.aFloat142 <= local333 / local97 || this.aClass78_Sub3_30.aFloat143 >= local321 / local97) {
			return;
		}
		if (arg1 != null || this.aClass307Array1 != null) {
			Static91.aFloat207 = local25.aFloat25 * local16.aFloat26 + local25.aFloat31 * local16.aFloat29 + local25.aFloat28 * local16.aFloat31;
			Static526.aFloat231 = local25.aFloat29 * local16.aFloat32 + local16.aFloat34 * local25.aFloat32 + local25.aFloat33 * local16.aFloat25;
			Static135.aFloat78 = local25.aFloat33 * local16.aFloat31 + local16.aFloat29 * local25.aFloat29 + local16.aFloat26 * local25.aFloat32;
			Static431.aFloat194 = local16.aFloat33 * local25.aFloat29 + local16.aFloat27 * local25.aFloat32 + local25.aFloat33 * local16.aFloat28;
			Static24.aFloat4 = local25.aFloat28 * local16.aFloat28 + local16.aFloat27 * local25.aFloat25 + local25.aFloat31 * local16.aFloat33;
			Static468.aFloat201 = local16.aFloat32 * local25.aFloat31 + local25.aFloat25 * local16.aFloat34 + local16.aFloat25 * local25.aFloat28;
		}
		if (arg1 != null) {
			@Pc(492) boolean local492 = false;
			@Pc(494) boolean local494 = true;
			@Pc(503) int local503 = this.aShort76 + this.aShort75 >> 1;
			@Pc(512) int local512 = this.aShort72 + this.aShort78 >> 1;
			@Pc(531) int local531 = (int) (Static91.aFloat207 * (float) local512 + Static269.aFloat130 * (float) this.aShort74 + Static116.aFloat42 + Static135.aFloat78 * (float) local503);
			@Pc(550) int local550 = (int) (Static468.aFloat201 * (float) local512 + Static526.aFloat231 * (float) local503 + Static20.aFloat2 + Static306.aFloat128 * (float) this.aShort74);
			@Pc(569) int local569 = (int) ((float) local512 * Static24.aFloat4 + (float) this.aShort74 * Static477.aFloat204 + Static431.aFloat194 * (float) local503 + Static464.aFloat227);
			if (this.aClass78_Sub3_30.anInt5571 > local569) {
				local492 = true;
			} else {
				arg1.anInt2554 = local550 * this.aClass78_Sub3_30.anInt5583 / local569 + this.aClass78_Sub3_30.anInt5599;
				arg1.anInt2556 = this.aClass78_Sub3_30.anInt5597 * local531 / local569 + this.aClass78_Sub3_30.anInt5596;
			}
			@Pc(623) int local623 = (int) ((float) local503 * Static135.aFloat78 + Static116.aFloat42 + (float) this.aShort69 * Static269.aFloat130 + (float) local512 * Static91.aFloat207);
			@Pc(642) int local642 = (int) (Static468.aFloat201 * (float) local512 + Static20.aFloat2 + Static526.aFloat231 * (float) local503 + Static306.aFloat128 * (float) this.aShort69);
			@Pc(661) int local661 = (int) ((float) local512 * Static24.aFloat4 + Static431.aFloat194 * (float) local503 + Static464.aFloat227 + (float) this.aShort69 * Static477.aFloat204);
			if (local661 < this.aClass78_Sub3_30.anInt5571) {
				local492 = true;
			} else {
				arg1.anInt2558 = this.aClass78_Sub3_30.anInt5596 + local623 * this.aClass78_Sub3_30.anInt5597 / local661;
				arg1.anInt2557 = this.aClass78_Sub3_30.anInt5599 + local642 * this.aClass78_Sub3_30.anInt5583 / local661;
			}
			if (local492) {
				if (local569 < this.aClass78_Sub3_30.anInt5571 && this.aClass78_Sub3_30.anInt5571 > local661) {
					local494 = false;
				} else {
					@Pc(731) int local731;
					@Pc(742) int local742;
					@Pc(752) int local752;
					if (this.aClass78_Sub3_30.anInt5571 > local569) {
						local731 = (local661 - this.aClass78_Sub3_30.anInt5571 << 16) / (local661 - local569);
						local742 = (local731 * (local623 - local531) >> 16) + local623;
						local752 = local642 + ((local642 - local550) * local731 >> 16);
						arg1.anInt2556 = this.aClass78_Sub3_30.anInt5596 + local742 * this.aClass78_Sub3_30.anInt5597 / this.aClass78_Sub3_30.anInt5571;
						arg1.anInt2554 = this.aClass78_Sub3_30.anInt5583 * local752 / this.aClass78_Sub3_30.anInt5571 + this.aClass78_Sub3_30.anInt5599;
					} else if (this.aClass78_Sub3_30.anInt5571 > local661) {
						local731 = (local569 - this.aClass78_Sub3_30.anInt5571 << 16) / (local569 - local661);
						local742 = (local731 * (local531 - local623) >> 16) + local531;
						local752 = ((local550 - local642) * local731 >> 16) + local550;
						arg1.anInt2556 = this.aClass78_Sub3_30.anInt5597 * local742 / this.aClass78_Sub3_30.anInt5571 + this.aClass78_Sub3_30.anInt5596;
						arg1.anInt2554 = this.aClass78_Sub3_30.anInt5583 * local752 / this.aClass78_Sub3_30.anInt5571 + this.aClass78_Sub3_30.anInt5599;
					}
				}
			}
			if (local494) {
				arg1.aBoolean195 = true;
				if (local661 >= local569) {
					arg1.anInt2555 = this.aClass78_Sub3_30.anInt5597 * (this.aShort70 + local623) / local661 + this.aClass78_Sub3_30.anInt5596 - arg1.anInt2558;
				} else {
					arg1.anInt2555 = (local531 + this.aShort70) * this.aClass78_Sub3_30.anInt5597 / local569 + this.aClass78_Sub3_30.anInt5596 - arg1.anInt2556;
				}
			}
		}
		this.aClass78_Sub3_30.method4538();
		this.aClass78_Sub3_30.method4510(local25);
		this.method5552();
		this.aClass78_Sub3_30.method4503();
		this.method5542();
	}

	@OriginalMember(owner = "client!os", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean527) {
			this.method5544();
		}
		return this.aShort69;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
	private void method5542() {
		if (this.aClass307Array1 == null) {
			return;
		}
		@Pc(17) Class34_Sub2 local17 = this.aClass78_Sub3_30.aClass34_Sub2_2;
		this.aClass78_Sub3_30.method4548();
		this.aClass78_Sub3_30.ZA(!this.aBoolean525);
		this.aClass78_Sub3_30.method4524(false);
		this.aClass78_Sub3_30.method4537(this.aClass78_Sub3_30.aClass226_7, null, this.aClass78_Sub3_30.aClass226_6, null);
		for (@Pc(49) int local49 = 0; local49 < this.anInt6869; local49++) {
			@Pc(56) Class307 local56 = this.aClass307Array1[local49];
			@Pc(61) Class155 local61 = this.aClass155Array1[local49];
			if (!local56.aBoolean610 || !this.aClass78_Sub3_30.method6802()) {
				@Pc(89) float local89 = (float) (this.anIntArray405[local56.anInt8085] + this.anIntArray405[local56.anInt8090] + this.anIntArray405[local56.anInt8088]) * 0.3333333F;
				@Pc(111) float local111 = (float) (this.anIntArray401[local56.anInt8085] + this.anIntArray401[local56.anInt8088] + this.anIntArray401[local56.anInt8090]) * 0.3333333F;
				@Pc(133) float local133 = (float) (this.anIntArray404[local56.anInt8090] + this.anIntArray404[local56.anInt8088] + this.anIntArray404[local56.anInt8085]) * 0.3333333F;
				@Pc(147) float local147 = Static91.aFloat207 * local133 + Static135.aFloat78 * local89 + Static269.aFloat130 * local111 + Static116.aFloat42;
				@Pc(161) float local161 = Static306.aFloat128 * local111 + local89 * Static526.aFloat231 + local133 * Static468.aFloat201 + Static20.aFloat2;
				@Pc(175) float local175 = Static464.aFloat227 + local133 * Static24.aFloat4 + Static431.aFloat194 * local89 + Static477.aFloat204 * local111;
				local17.method980((float) local61.anInt3972 - local161, local61.anInt3973 * local56.aShort105 >> 7, (float) local61.anInt3969 + local147, local61.anInt3971 * local56.aShort106 >> 7, local61.anInt3974, (float) local56.anInt8089 - local175);
				this.aClass78_Sub3_30.method4569(local17);
				@Pc(218) int local218 = local61.anInt3967;
				OpenGL.glColor4ub((byte) (local218 >> 16), (byte) (local218 >> 8), (byte) local218, (byte) (local218 >> 24));
				this.aClass78_Sub3_30.method4567(local56.aShort107);
				this.aClass78_Sub3_30.method4566(local56.aByte110);
				this.aClass78_Sub3_30.method4541(4);
			}
		}
		this.aClass78_Sub3_30.ZA(true);
		this.aClass78_Sub3_30.method4503();
	}

	@OriginalMember(owner = "client!os", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6816; local7++) {
			if (arg0 != 128) {
				this.anIntArray405[local7] = this.anIntArray405[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray401[local7] = arg1 * this.anIntArray401[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray404[local7] = arg2 * this.anIntArray404[local7] >> 7;
			}
		}
		if (this.aClass226_8 != null) {
			this.aClass226_8.anInterface8_4 = null;
		}
		this.aBoolean527 = false;
	}

	@OriginalMember(owner = "client!os", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean527) {
			this.method5544();
		}
		return this.aShort73;
	}

	@OriginalMember(owner = "client!os", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6844; local7++) {
			this.anIntArray405[local7] = this.anIntArray405[local7] + 7 >> 4;
			this.anIntArray401[local7] = this.anIntArray401[local7] + 7 >> 4;
			this.anIntArray404[local7] = this.anIntArray404[local7] + 7 >> 4;
		}
		this.aBoolean527 = false;
		if (this.aClass226_8 != null) {
			this.aClass226_8.anInterface8_4 = null;
		}
	}

	@OriginalMember(owner = "client!os", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean527) {
			this.method5544();
		}
		return this.aShort76;
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6855; local3++) {
			if (arg0 == this.aShortArray75[local3]) {
				this.aShortArray75[local3] = arg1;
			}
		}
		if (this.aClass307Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt6869; local38++) {
				@Pc(45) Class307 local45 = this.aClass307Array1[local38];
				@Pc(50) Class155 local50 = this.aClass155Array1[local38];
				local50.anInt3967 = Static226.anIntArray212[this.aShortArray75[local45.anInt8091] & 0xFFFF] & 0xFFFFFF | local50.anInt3967 & 0xFF000000;
			}
		}
		if (this.aClass226_10 != null) {
			this.aClass226_10.anInterface8_4 = null;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3) {
		return this.method5549(arg1, arg3, arg0, arg2, -1);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "()V")
	@Override
	protected void method7393() {
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5549(arg1, arg3, arg0, arg2, arg4);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class52 method7412(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class52_Sub1 local12;
		@Pc(16) Class52_Sub1 local16;
		if (arg0 == 1) {
			local12 = this.aClass78_Sub3_30.aClass52_Sub1_9;
			local16 = this.aClass78_Sub3_30.aClass52_Sub1_1;
		} else if (arg0 == 2) {
			local12 = this.aClass78_Sub3_30.aClass52_Sub1_2;
			local16 = this.aClass78_Sub3_30.aClass52_Sub1_8;
		} else if (arg0 == 3) {
			local16 = this.aClass78_Sub3_30.aClass52_Sub1_6;
			local12 = this.aClass78_Sub3_30.aClass52_Sub1_5;
		} else if (arg0 == 4) {
			local16 = this.aClass78_Sub3_30.aClass52_Sub1_7;
			local12 = this.aClass78_Sub3_30.aClass52_Sub1_3;
		} else if (arg0 == 5) {
			local16 = this.aClass78_Sub3_30.aClass52_Sub1_4;
			local12 = this.aClass78_Sub3_30.aClass52_Sub1_10;
		} else {
			local12 = local16 = new Class52_Sub1(this.aClass78_Sub3_30);
		}
		return this.method5553(local12, arg0 != 0, arg2, local16, arg1);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BBSII)I")
	private int method5543(@OriginalArg(1) byte arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = Static226.anIntArray212[Static543.method7389(arg3, arg2)];
		if (arg1 != -1) {
			@Pc(30) Class17 local30 = this.aClass78_Sub3_30.anInterface9_13.method947(arg1 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte21 & 0xFF;
			@Pc(41) int local41;
			@Pc(64) int local64;
			if (local35 != 0) {
				if (arg3 < 0) {
					local41 = 0;
				} else if (arg3 > 127) {
					local41 = 16777215;
				} else {
					local41 = arg3 * 131586;
				}
				if (local35 == 256) {
					local12 = local41;
				} else {
					local64 = 256 - local35;
					local12 = (local64 * (local12 & 0xFF00) + (local41 & 0xFF00) * local35 & 0xFF0000) + (local64 * (local12 & 0xFF00FF) + local35 * (local41 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local41 = local30.aByte17 & 0xFF;
			if (local41 != 0) {
				local41 += 256;
				@Pc(114) int local114 = (local12 >> 16 & 0xFF) * local41;
				if (local114 > 65535) {
					local114 = 65535;
				}
				local64 = (local12 >> 8 & 0xFF) * local41;
				if (local64 > 65535) {
					local64 = 65535;
				}
				@Pc(142) int local142 = (local12 & 0xFF) * local41;
				if (local142 > 65535) {
					local142 = 65535;
				}
				local12 = (local142 >> 8) + (local64 & 0xFF00) + (local114 << 8 & 0xFF00C8);
			}
		}
		return (local12 << 8) + 255 - (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!os", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		this.anInt6839 = arg0;
		if (this.aClass140_1 != null && (this.anInt6839 & 0x10000) == 0) {
			this.aByteArray68 = this.aClass140_1.aByteArray19;
			this.aShortArray68 = this.aClass140_1.aShortArray29;
			this.aShortArray74 = this.aClass140_1.aShortArray28;
			this.aShortArray65 = this.aClass140_1.aShortArray27;
			this.aClass140_1 = null;
		}
		this.aBoolean526 = true;
		this.method5545();
	}

	@OriginalMember(owner = "client!os", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		if (this.aClass226_10 != null) {
			this.aClass226_10.anInterface8_4 = null;
		}
		this.aShort77 = (short) arg0;
		if (this.aClass226_11 != null) {
			this.aClass226_11.anInterface8_4 = null;
		}
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "()[Lclient!ns;")
	@Override
	public Class244[] method7404() {
		return this.aClass244Array2;
	}

	@OriginalMember(owner = "client!os", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt6839;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7414(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class52_Sub1 local8 = (Class52_Sub1) arg0;
		if (this.anInt6855 == 0 || local8.anInt6855 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt6816;
		@Pc(27) int[] local27 = local8.anIntArray405;
		@Pc(30) int[] local30 = local8.anIntArray401;
		@Pc(33) int[] local33 = local8.anIntArray404;
		@Pc(36) short[] local36 = local8.aShortArray74;
		@Pc(39) short[] local39 = local8.aShortArray68;
		@Pc(42) short[] local42 = local8.aShortArray65;
		@Pc(45) byte[] local45 = local8.aByteArray68;
		@Pc(52) short[] local52;
		@Pc(54) short[] local54;
		@Pc(50) short[] local50;
		@Pc(56) byte[] local56;
		if (this.aClass140_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local52 = this.aClass140_1.aShortArray28;
			local56 = this.aClass140_1.aByteArray19;
			local50 = this.aClass140_1.aShortArray27;
			local54 = this.aClass140_1.aShortArray29;
		}
		@Pc(81) short[] local81;
		@Pc(83) short[] local83;
		@Pc(85) short[] local85;
		@Pc(79) byte[] local79;
		if (local8.aClass140_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local85 = local8.aClass140_1.aShortArray27;
			local83 = local8.aClass140_1.aShortArray29;
			local81 = local8.aClass140_1.aShortArray28;
			local79 = local8.aClass140_1.aByteArray19;
		}
		@Pc(106) int[] local106 = local8.anIntArray403;
		@Pc(109) short[] local109 = local8.aShortArray73;
		if (!local8.aBoolean527) {
			local8.method5544();
		}
		@Pc(118) short local118 = local8.aShort74;
		@Pc(121) short local121 = local8.aShort69;
		@Pc(124) short local124 = local8.aShort76;
		@Pc(127) short local127 = local8.aShort75;
		@Pc(130) short local130 = local8.aShort72;
		@Pc(133) short local133 = local8.aShort78;
		for (@Pc(135) int local135 = 0; local135 < this.anInt6816; local135++) {
			@Pc(145) int local145 = this.anIntArray401[local135] - arg2;
			if (local145 >= local118 && local145 <= local121) {
				@Pc(169) int local169 = this.anIntArray405[local135] - arg1;
				if (local169 >= local124 && local169 <= local127) {
					@Pc(185) int local185 = this.anIntArray404[local135] - arg3;
					if (local185 >= local130 && local133 >= local185) {
						@Pc(199) int local199 = -1;
						@Pc(204) int local204 = this.anIntArray403[local135];
						@Pc(211) int local211 = this.anIntArray403[local135 + 1];
						for (@Pc(213) int local213 = local204; local213 < local211; local213++) {
							local199 = this.aShortArray73[local213] - 1;
							if (local199 == -1 || this.aByteArray68[local199] != 0) {
								break;
							}
						}
						if (local199 != -1) {
							for (@Pc(244) int local244 = 0; local244 < local24; local244++) {
								if (local27[local244] == local169 && local185 == local33[local244] && local145 == local30[local244]) {
									@Pc(271) int local271 = -1;
									local204 = local106[local244];
									local211 = local106[local244 + 1];
									for (@Pc(283) int local283 = local204; local283 < local211; local283++) {
										local271 = local109[local283] - 1;
										if (local271 == -1 || local45[local271] != 0) {
											break;
										}
									}
									if (local271 != -1) {
										if (local52 == null) {
											this.aClass140_1 = new Class140();
											local52 = this.aClass140_1.aShortArray28 = Static58.method974(this.aShortArray74);
											local54 = this.aClass140_1.aShortArray29 = Static58.method974(this.aShortArray68);
											local50 = this.aClass140_1.aShortArray27 = Static58.method974(this.aShortArray65);
											local56 = this.aClass140_1.aByteArray19 = Static477.method6641(this.aByteArray68);
										}
										if (local81 == null) {
											@Pc(367) Class140 local367 = local8.aClass140_1 = new Class140();
											local81 = local367.aShortArray28 = Static58.method974(local36);
											local83 = local367.aShortArray29 = Static58.method974(local39);
											local85 = local367.aShortArray27 = Static58.method974(local42);
											local79 = local367.aByteArray19 = Static477.method6641(local45);
										}
										@Pc(400) short local400 = this.aShortArray74[local199];
										@Pc(405) short local405 = this.aShortArray68[local199];
										@Pc(410) short local410 = this.aShortArray65[local199];
										@Pc(415) byte local415 = this.aByteArray68[local199];
										local204 = local106[local244];
										local211 = local106[local244 + 1];
										@Pc(435) int local435;
										for (@Pc(427) int local427 = local204; local427 < local211; local427++) {
											local435 = local109[local427] - 1;
											if (local435 == -1) {
												break;
											}
											if (local79[local435] != 0) {
												local81[local435] += local400;
												local83[local435] += local405;
												local85[local435] += local410;
												local79[local435] += local415;
											}
										}
										local204 = this.anIntArray403[local135];
										local410 = local42[local271];
										local211 = this.anIntArray403[local135 + 1];
										local415 = local45[local271];
										local400 = local36[local271];
										local405 = local39[local271];
										for (local435 = local204; local435 < local211; local435++) {
											@Pc(518) int local518 = this.aShortArray73[local435] - 1;
											if (local518 == -1) {
												break;
											}
											if (local56[local518] != 0) {
												local52[local518] += local400;
												local54[local518] += local405;
												local50[local518] += local410;
												local56[local518] += local415;
											}
										}
										if (this.aClass226_11 == null && this.aClass226_10 != null) {
											this.aClass226_10.anInterface8_4 = null;
										}
										if (this.aClass226_11 != null) {
											this.aClass226_11.anInterface8_4 = null;
										}
										if (local8.aClass226_11 == null && local8.aClass226_10 != null) {
											local8.aClass226_10.anInterface8_4 = null;
										}
										if (local8.aClass226_11 != null) {
											local8.aClass226_11.anInterface8_4 = null;
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

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
	private void method5544() {
		@Pc(7) int local7 = 32767;
		@Pc(13) int local13 = 32767;
		@Pc(15) int local15 = 32767;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt6816; local27++) {
			@Pc(34) int local34 = this.anIntArray405[local27];
			@Pc(39) int local39 = this.anIntArray401[local27];
			if (local39 < local13) {
				local13 = local39;
			}
			if (local39 > local19) {
				local19 = local39;
			}
			@Pc(58) int local58 = this.anIntArray404[local27];
			if (local34 < local7) {
				local7 = local34;
			}
			if (local34 > local17) {
				local17 = local34;
			}
			if (local58 > local21) {
				local21 = local58;
			}
			if (local15 > local58) {
				local15 = local58;
			}
			@Pc(94) int local94 = local58 * local58 + local34 * local34;
			if (local94 > local23) {
				local23 = local94;
			}
			local94 = local58 * local58 + local34 * local34 + local39 * local39;
			if (local94 > local25) {
				local25 = local94;
			}
		}
		this.aShort75 = (short) local17;
		this.aShort72 = (short) local15;
		this.aShort76 = (short) local7;
		this.aShort78 = (short) local21;
		this.aShort74 = (short) local13;
		this.aShort69 = (short) local19;
		this.aShort70 = (short) (Math.sqrt((double) local23) + 0.99D);
		this.aShort73 = (short) (Math.sqrt((double) local25) + 0.99D);
		this.aBoolean527 = true;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(Z)V")
	private void method5545() {
		if (!this.aBoolean526) {
			return;
		}
		this.aBoolean526 = false;
		if (this.aClass244Array2 == null && this.aClass212Array2 == null && this.aClass307Array1 == null) {
			if (this.anIntArray405 != null && !Static218.method3262(this.anInt6842, this.anInt6839)) {
				if (this.aClass226_8 != null && this.aClass226_8.anInterface8_4 == null) {
					this.aBoolean526 = true;
				} else {
					if (!this.aBoolean527) {
						this.method5544();
					}
					this.anIntArray405 = null;
				}
			}
			if (this.anIntArray401 != null && !Static71.method1175(this.anInt6839, this.anInt6842)) {
				if (this.aClass226_8 != null && this.aClass226_8.anInterface8_4 == null) {
					this.aBoolean526 = true;
				} else {
					if (!this.aBoolean527) {
						this.method5544();
					}
					this.anIntArray401 = null;
				}
			}
			if (this.anIntArray404 != null && !Static400.method5772(this.anInt6842, this.anInt6839)) {
				if (this.aClass226_8 != null && this.aClass226_8.anInterface8_4 == null) {
					this.aBoolean526 = true;
				} else {
					if (!this.aBoolean527) {
						this.method5544();
					}
					this.anIntArray404 = null;
				}
			}
		}
		if (this.aShortArray73 != null && this.anIntArray405 == null && this.anIntArray401 == null && this.anIntArray404 == null) {
			this.anIntArray403 = null;
			this.aShortArray73 = null;
		}
		if (this.aByteArray68 != null && !Static140.method2406(this.anInt6842, this.anInt6839)) {
			if (this.aClass226_11 == null) {
				if (this.aClass226_10 != null && this.aClass226_10.anInterface8_4 == null) {
					this.aBoolean526 = true;
				} else {
					this.aByteArray68 = null;
					this.aShortArray74 = this.aShortArray68 = this.aShortArray65 = null;
				}
			} else if (this.aClass226_11.anInterface8_4 == null) {
				this.aBoolean526 = true;
			} else {
				this.aShortArray74 = this.aShortArray68 = this.aShortArray65 = null;
				this.aByteArray68 = null;
			}
		}
		if (this.aShortArray75 != null && !Static296.method4402(this.anInt6839, this.anInt6842)) {
			if (this.aClass226_10 != null && this.aClass226_10.anInterface8_4 == null) {
				this.aBoolean526 = true;
			} else {
				this.aShortArray75 = null;
			}
		}
		if (this.aByteArray67 != null && !Static190.method5364(this.anInt6842, this.anInt6839)) {
			if (this.aClass226_10 != null && this.aClass226_10.anInterface8_4 == null) {
				this.aBoolean526 = true;
			} else {
				this.aByteArray67 = null;
			}
		}
		if (this.aFloatArray55 != null && !Static408.method5835(this.anInt6839, this.anInt6842)) {
			if (this.aClass226_9 != null && this.aClass226_9.anInterface8_4 == null) {
				this.aBoolean526 = true;
			} else {
				this.aFloatArray55 = this.aFloatArray56 = null;
			}
		}
		if (this.aShortArray70 != null && !Static149.method2490(this.anInt6839, this.anInt6842)) {
			if (this.aClass226_10 != null && this.aClass226_10.anInterface8_4 == null) {
				this.aBoolean526 = true;
			} else {
				this.aShortArray70 = null;
			}
		}
		if (this.aShortArray69 != null && !Static252.method3697(this.anInt6842, this.anInt6839)) {
			if ((this.aClass281_1 == null || this.aClass281_1.anInterface12_4 != null) && (this.aClass226_10 == null || this.aClass226_10.anInterface8_4 != null)) {
				this.aShortArray69 = this.aShortArray71 = this.aShortArray66 = null;
			} else {
				this.aBoolean526 = true;
			}
		}
		if (this.anIntArrayArray37 != null && !Static543.method7387(this.anInt6842, this.anInt6839)) {
			this.aShortArray72 = null;
			this.anIntArrayArray37 = null;
		}
		if (this.anIntArrayArray35 != null && !Static355.method5292(this.anInt6842, this.anInt6839)) {
			this.anIntArrayArray35 = null;
			this.aShortArray67 = null;
		}
		if (this.anIntArrayArray36 != null && !Static375.method5455(this.anInt6839, this.anInt6842)) {
			this.anIntArrayArray36 = null;
		}
		if (this.anIntArray402 != null && (this.anInt6839 & 0x800) == 0 && (this.anInt6839 & 0x40000) == 0) {
			this.anIntArray402 = null;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BLclient!gd;)V")
	private void method5546(@OriginalArg(1) Class1_Sub8_Sub4_Sub1 arg0) {
		if (this.anInt6827 > this.aClass78_Sub3_30.anIntArray312.length) {
			this.aClass78_Sub3_30.anIntArray312 = new int[this.anInt6827];
			this.aClass78_Sub3_30.anIntArray310 = new int[this.anInt6827];
		}
		@Pc(32) int[] local32 = this.aClass78_Sub3_30.anIntArray312;
		@Pc(36) int[] local36 = this.aClass78_Sub3_30.anIntArray310;
		@Pc(65) int local65;
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (@Pc(38) int local38 = 0; local38 < this.anInt6816; local38++) {
			local65 = (this.anIntArray405[local38] - (this.aClass78_Sub3_30.anInt5603 * this.anIntArray401[local38] >> 8) >> this.aClass78_Sub3_30.anInt5557) - arg0.anInt2973;
			@Pc(90) int local90 = (this.anIntArray404[local38] - (this.aClass78_Sub3_30.anInt5575 * this.anIntArray401[local38] >> 8) >> this.aClass78_Sub3_30.anInt5557) - arg0.anInt2970;
			@Pc(95) int local95 = this.anIntArray403[local38];
			@Pc(102) int local102 = this.anIntArray403[local38 + 1];
			for (local104 = local95; local104 < local102; local104++) {
				local113 = this.aShortArray73[local104] - 1;
				if (local113 == -1) {
					break;
				}
				local32[local113] = local65;
				local36[local113] = local90;
			}
		}
		for (local65 = 0; local65 < this.anInt6847; local65++) {
			if (this.aByteArray67 == null || this.aByteArray67[local65] <= 128) {
				@Pc(151) short local151 = this.aShortArray69[local65];
				@Pc(156) short local156 = this.aShortArray71[local65];
				@Pc(161) short local161 = this.aShortArray66[local65];
				local104 = local32[local151];
				local113 = local32[local156];
				@Pc(173) int local173 = local32[local161];
				@Pc(177) int local177 = local36[local151];
				@Pc(181) int local181 = local36[local156];
				@Pc(185) int local185 = local36[local161];
				if (-((local173 - local113) * (-local177 + local181)) + (local181 - local185) * (local104 - local113) > 0) {
					arg0.method2587(local181, local113, local177, local185, local173, local104);
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!q;IZ)V")
	@Override
	public void method7403(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray67 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6816; local14++) {
			if ((this.aShortArray67[local14] & arg1) != 0) {
				if (arg2) {
					arg0.B(this.anIntArray405[local14], this.anIntArray401[local14], this.anIntArray404[local14], local12);
				} else {
					arg0.method6216(this.anIntArray405[local14], this.anIntArray401[local14], this.anIntArray404[local14], local12);
				}
				this.anIntArray405[local14] = local12[0];
				this.anIntArray401[local14] = local12[1];
				this.anIntArray404[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6816; local3++) {
			if (arg0 != 0) {
				this.anIntArray405[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray401[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray404[local3] += arg2;
			}
		}
		if (this.aClass226_8 != null) {
			this.aClass226_8.anInterface8_4 = null;
		}
		this.aBoolean527 = false;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BZ)V")
	private void method5547(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass226_10 != null && this.aClass226_10.anInterface8_4 == null;
		@Pc(27) boolean local27 = this.aClass226_11 != null && this.aClass226_11.anInterface8_4 == null;
		@Pc(38) boolean local38 = this.aClass226_8 != null && this.aClass226_8.anInterface8_4 == null;
		@Pc(49) boolean local49 = this.aClass226_9 != null && this.aClass226_9.anInterface8_4 == null;
		if (arg0) {
			local27 &= (this.aByte90 & 0x4) != 0;
			local38 &= (this.aByte90 & 0x1) != 0;
			local49 &= (this.aByte90 & 0x8) != 0;
			local16 &= (this.aByte90 & 0x2) != 0;
		}
		@Pc(106) byte local106 = 0;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		if (local38) {
			local106 = 12;
		}
		@Pc(123) byte local123 = 0;
		if (local16) {
			local110 = local106;
			local106 = (byte) (local106 + 4);
		}
		if (local27) {
			local112 = local106;
			local106 = (byte) (local106 + 12);
		}
		if (local49) {
			local123 = local106;
			local106 = (byte) (local106 + 8);
		}
		if (local106 == 0) {
			return;
		}
		if (this.aClass78_Sub3_30.aClass1_Sub3_Sub2_1.aByteArray104.length < this.anInt6827 * local106) {
			this.aClass78_Sub3_30.aClass1_Sub3_Sub2_1 = new Class1_Sub3_Sub2(local106 * (this.anInt6827 + 100));
		} else {
			this.aClass78_Sub3_30.aClass1_Sub3_Sub2_1.anInt9802 = 0;
		}
		@Pc(189) Class1_Sub3_Sub2 local189 = this.aClass78_Sub3_30.aClass1_Sub3_Sub2_1;
		@Pc(197) int local197;
		@Pc(206) int local206;
		@Pc(234) int local234;
		@Pc(243) int local243;
		if (local38) {
			@Pc(213) int local213;
			@Pc(220) int local220;
			@Pc(225) int local225;
			@Pc(232) int local232;
			if (this.aClass78_Sub3_30.aBoolean425) {
				for (local197 = 0; local197 < this.anInt6816; local197++) {
					local206 = Stream.floatToRawIntBits((float) this.anIntArray405[local197]);
					local213 = Stream.floatToRawIntBits((float) this.anIntArray401[local197]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray404[local197]);
					local225 = this.anIntArray403[local197];
					local232 = this.anIntArray403[local197 + 1];
					for (local234 = local225; local234 < local232; local234++) {
						local243 = this.aShortArray73[local234] - 1;
						if (local243 == -1) {
							break;
						}
						local189.anInt9802 = local243 * local106;
						local189.method7936(local206);
						local189.method7936(local213);
						local189.method7936(local220);
					}
				}
			} else {
				for (local197 = 0; local197 < this.anInt6816; local197++) {
					local206 = Stream.floatToRawIntBits((float) this.anIntArray405[local197]);
					local213 = Stream.floatToRawIntBits((float) this.anIntArray401[local197]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray404[local197]);
					local225 = this.anIntArray403[local197];
					local232 = this.anIntArray403[local197 + 1];
					for (local234 = local225; local234 < local232; local234++) {
						local243 = this.aShortArray73[local234] - 1;
						if (local243 == -1) {
							break;
						}
						local189.anInt9802 = local243 * local106;
						local189.method7926(local206);
						local189.method7926(local213);
						local189.method7926(local220);
					}
				}
			}
		}
		@Pc(566) float local566;
		@Pc(445) short[] local445;
		@Pc(442) short[] local442;
		@Pc(439) short[] local439;
		@Pc(448) byte[] local448;
		@Pc(596) float local596;
		if (local16) {
			if (this.aClass226_11 == null) {
				if (this.aClass140_1 == null) {
					local439 = this.aShortArray65;
					local442 = this.aShortArray74;
					local445 = this.aShortArray68;
					local448 = this.aByteArray68;
				} else {
					local445 = this.aClass140_1.aShortArray29;
					local448 = this.aClass140_1.aByteArray19;
					local442 = this.aClass140_1.aShortArray28;
					local439 = this.aClass140_1.aShortArray27;
				}
				@Pc(472) float local472 = this.aClass78_Sub3_30.aFloatArray49[0];
				@Pc(478) float local478 = this.aClass78_Sub3_30.aFloatArray49[1];
				@Pc(484) float local484 = this.aClass78_Sub3_30.aFloatArray49[2];
				@Pc(488) float local488 = this.aClass78_Sub3_30.aFloat145;
				@Pc(498) float local498 = this.aClass78_Sub3_30.aFloat140 * 768.0F / (float) this.aShort77;
				@Pc(508) float local508 = this.aClass78_Sub3_30.aFloat141 * 768.0F / (float) this.aShort77;
				for (@Pc(510) int local510 = 0; local510 < this.anInt6855; local510++) {
					@Pc(530) int local530 = this.method5543(this.aByteArray67[local510], this.aShortArray70[local510], this.aShortArray75[local510], this.aShort71);
					@Pc(535) short local535 = this.aShortArray69[local510];
					@Pc(544) float local544 = (float) (local530 >>> 24) * this.aClass78_Sub3_30.aFloat148;
					@Pc(555) float local555 = this.aClass78_Sub3_30.aFloat153 * (float) (local530 >> 8 & 0xFF);
					local566 = this.aClass78_Sub3_30.aFloat149 * (float) (local530 >> 16 & 0xFF);
					@Pc(571) short local571 = (short) local448[local535];
					if (local571 == 0) {
						local596 = ((float) local445[local535] * local478 + local472 * (float) local442[local535] + (float) local439[local535] * local484) * 0.0026041667F;
					} else {
						local596 = (local478 * (float) local445[local535] + (float) local442[local535] * local472 + (float) local439[local535] * local484) / (float) (local571 * 256);
					}
					@Pc(636) float local636 = local488 + local596 * (local596 < 0.0F ? local508 : local498);
					@Pc(641) int local641 = (int) (local544 * local636);
					@Pc(646) int local646 = (int) (local636 * local566);
					if (local641 < 0) {
						local641 = 0;
					} else if (local641 > 255) {
						local641 = 255;
					}
					@Pc(662) int local662 = (int) (local636 * local555);
					if (local646 < 0) {
						local646 = 0;
					} else if (local646 > 255) {
						local646 = 255;
					}
					if (local662 < 0) {
						local662 = 0;
					} else if (local662 > 255) {
						local662 = 255;
					}
					local189.anInt9802 = local110 + local535 * local106;
					local189.method7917(local641);
					local189.method7917(local646);
					local189.method7917(local662);
					local189.method7917(255 - (this.aByteArray67[local510] & 0xFF));
					local535 = this.aShortArray71[local510];
					local571 = local448[local535];
					if (local571 == 0) {
						local596 = ((float) local439[local535] * local484 + local478 * (float) local445[local535] + (float) local442[local535] * local472) * 0.0026041667F;
					} else {
						local596 = ((float) local439[local535] * local484 + local478 * (float) local445[local535] + (float) local442[local535] * local472) / (float) (local571 * 256);
					}
					local636 = (local596 < 0.0F ? local508 : local498) * local596 + local488;
					local641 = (int) (local544 * local636);
					if (local641 < 0) {
						local641 = 0;
					} else if (local641 > 255) {
						local641 = 255;
					}
					local646 = (int) (local566 * local636);
					local662 = (int) (local555 * local636);
					if (local646 < 0) {
						local646 = 0;
					} else if (local646 > 255) {
						local646 = 255;
					}
					if (local662 < 0) {
						local662 = 0;
					} else if (local662 > 255) {
						local662 = 255;
					}
					local189.anInt9802 = local110 + local535 * local106;
					local189.method7917(local641);
					local189.method7917(local646);
					local189.method7917(local662);
					local189.method7917(255 - (this.aByteArray67[local510] & 0xFF));
					local535 = this.aShortArray66[local510];
					local571 = local448[local535];
					if (local571 == 0) {
						local596 = ((float) local439[local535] * local484 + (float) local445[local535] * local478 + local472 * (float) local442[local535]) * 0.0026041667F;
					} else {
						local596 = (local484 * (float) local439[local535] + (float) local442[local535] * local472 + local478 * (float) local445[local535]) / (float) (local571 * 256);
					}
					local636 = (local596 < 0.0F ? local508 : local498) * local596 + local488;
					local641 = (int) (local544 * local636);
					if (local641 < 0) {
						local641 = 0;
					} else if (local641 > 255) {
						local641 = 255;
					}
					local646 = (int) (local636 * local566);
					local662 = (int) (local555 * local636);
					if (local646 < 0) {
						local646 = 0;
					} else if (local646 > 255) {
						local646 = 255;
					}
					local189.anInt9802 = local106 * local535 + local110;
					if (local662 < 0) {
						local662 = 0;
					} else if (local662 > 255) {
						local662 = 255;
					}
					local189.method7917(local641);
					local189.method7917(local646);
					local189.method7917(local662);
					local189.method7917(255 - (this.aByteArray67[local510] & 0xFF));
				}
			} else {
				for (local197 = 0; local197 < this.anInt6855; local197++) {
					local206 = this.method5543(this.aByteArray67[local197], this.aShortArray70[local197], this.aShortArray75[local197], this.aShort71);
					local189.anInt9802 = local106 * this.aShortArray69[local197] + local110;
					local189.method7936(local206);
					local189.anInt9802 = this.aShortArray71[local197] * local106 + local110;
					local189.method7936(local206);
					local189.anInt9802 = this.aShortArray66[local197] * local106 + local110;
					local189.method7936(local206);
				}
			}
		}
		if (local27) {
			if (this.aClass140_1 == null) {
				local445 = this.aShortArray68;
				local442 = this.aShortArray74;
				local439 = this.aShortArray65;
				local448 = this.aByteArray68;
			} else {
				local442 = this.aClass140_1.aShortArray28;
				local439 = this.aClass140_1.aShortArray27;
				local445 = this.aClass140_1.aShortArray29;
				local448 = this.aClass140_1.aByteArray19;
			}
			@Pc(1088) float local1088 = 3.0F / (float) this.aShort77;
			local189.anInt9802 = local112;
			local596 = 3.0F / (float) (this.aShort77 + this.aShort77 / 2);
			if (this.aClass78_Sub3_30.aBoolean425) {
				for (local234 = 0; local234 < this.anInt6827; local234++) {
					local243 = local448[local234] & 0xFF;
					if (local243 == 0) {
						local189.method7979((float) local442[local234] * local596);
						local189.method7979((float) local445[local234] * local596);
						local189.method7979((float) local439[local234] * local596);
					} else {
						local566 = local1088 / (float) local243;
						local189.method7979(local566 * (float) local442[local234]);
						local189.method7979((float) local445[local234] * local566);
						local189.method7979((float) local439[local234] * local566);
					}
					local189.anInt9802 += local106 - 12;
				}
			} else {
				for (local234 = 0; local234 < this.anInt6827; local234++) {
					local243 = local448[local234] & 0xFF;
					if (local243 == 0) {
						local189.method7984((float) local442[local234] * local596);
						local189.method7984(local596 * (float) local445[local234]);
						local189.method7984(local596 * (float) local439[local234]);
					} else {
						local566 = local1088 / (float) local243;
						local189.method7984((float) local442[local234] * local566);
						local189.method7984((float) local445[local234] * local566);
						local189.method7984((float) local439[local234] * local566);
					}
					local189.anInt9802 += local106 - 12;
				}
			}
		}
		if (local49) {
			local189.anInt9802 = local123;
			if (this.aClass78_Sub3_30.aBoolean425) {
				for (local197 = 0; local197 < this.anInt6827; local197++) {
					local189.method7979(this.aFloatArray55[local197]);
					local189.method7979(this.aFloatArray56[local197]);
					local189.anInt9802 += local106 - 8;
				}
			} else {
				for (local197 = 0; local197 < this.anInt6827; local197++) {
					local189.method7984(this.aFloatArray55[local197]);
					local189.method7984(this.aFloatArray56[local197]);
					local189.anInt9802 += local106 - 8;
				}
			}
		}
		local189.anInt9802 = this.anInt6827 * local106;
		@Pc(1390) Interface8 local1390;
		if (arg0) {
			if (this.anInterface8_5 == null) {
				this.anInterface8_5 = this.aClass78_Sub3_30.method4550(local189.anInt9802, true, local189.aByteArray104, local106);
			} else {
				this.anInterface8_5.method7523(local106, local189.aByteArray104, local189.anInt9802);
			}
			this.aByte90 = 0;
			local1390 = this.anInterface8_5;
		} else {
			local1390 = this.aClass78_Sub3_30.method4550(local189.anInt9802, false, local189.aByteArray104, local106);
			this.aBoolean526 = true;
		}
		if (local38) {
			this.aClass226_8.anInterface8_4 = local1390;
			this.aClass226_8.aByte85 = 0;
		}
		if (local49) {
			this.aClass226_9.anInterface8_4 = local1390;
			this.aClass226_9.aByte85 = local123;
		}
		if (local16) {
			this.aClass226_10.anInterface8_4 = local1390;
			this.aClass226_10.aByte85 = local110;
		}
		if (local27) {
			this.aClass226_11.anInterface8_4 = local1390;
			this.aClass226_11.aByte85 = local112;
		}
	}

	@OriginalMember(owner = "client!os", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface9 local9 = this.aClass78_Sub3_30.anInterface9_13;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6855; local11++) {
			if (this.aShortArray70[local11] == arg0) {
				this.aShortArray70[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class17 local48 = local9.method947(arg0 & 0xFFFF);
			local37 = local48.aByte17;
			local35 = local48.aByte21;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(69) Class17 local69 = local9.method947(arg1 & 0xFFFF);
			local58 = local69.aByte17;
			local56 = local69.aByte21;
		}
		if (!(local56 != local35 | local58 != local37)) {
			return;
		}
		if (this.aClass307Array1 != null) {
			for (@Pc(102) int local102 = 0; local102 < this.anInt6869; local102++) {
				@Pc(109) Class307 local109 = this.aClass307Array1[local102];
				@Pc(114) Class155 local114 = this.aClass155Array1[local102];
				local114.anInt3967 = local114.anInt3967 & 0xFF000000 | Static226.anIntArray212[this.aShortArray75[local109.anInt8091] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass226_10 != null) {
			this.aClass226_10.anInterface8_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!os", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray35 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt6844; local12++) {
			this.anIntArray405[local12] <<= 0x4;
			this.anIntArray401[local12] <<= 0x4;
			this.anIntArray404[local12] <<= 0x4;
		}
		Static328.anInt6008 = 0;
		Static121.anInt2504 = 0;
		Static581.anInt9574 = 0;
		return true;
	}

	@OriginalMember(owner = "client!os", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		this.aShort71 = (short) arg0;
		if (this.aClass226_10 != null) {
			this.aClass226_10.anInterface8_4 = null;
		}
	}

	@OriginalMember(owner = "client!os", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean525;
	}

	@OriginalMember(owner = "client!os", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class85_Sub8.anIntArray426[arg0];
		@Pc(13) int local13 = Class85_Sub8.anIntArray427[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6816; local15++) {
			@Pc(34) int local34 = this.anIntArray401[local15] * local13 - this.anIntArray404[local15] * local9 >> 14;
			this.anIntArray404[local15] = this.anIntArray404[local15] * local13 + this.anIntArray401[local15] * local9 >> 14;
			this.anIntArray401[local15] = local34;
		}
		this.aBoolean527 = false;
		if (this.aClass226_8 != null) {
			this.aClass226_8.anInterface8_4 = null;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)V")
	private void method5548(@OriginalArg(0) boolean arg0) {
		if (this.aClass78_Sub3_30.aClass1_Sub3_Sub2_1.aByteArray104.length >= this.anInt6847 * 6) {
			this.aClass78_Sub3_30.aClass1_Sub3_Sub2_1.anInt9802 = 0;
		} else {
			this.aClass78_Sub3_30.aClass1_Sub3_Sub2_1 = new Class1_Sub3_Sub2(this.anInt6847 * 6 + 600);
		}
		@Pc(44) Class1_Sub3_Sub2 local44 = this.aClass78_Sub3_30.aClass1_Sub3_Sub2_1;
		@Pc(50) int local50;
		if (this.aClass78_Sub3_30.aBoolean425) {
			for (local50 = 0; local50 < this.anInt6847; local50++) {
				local44.method7937(this.aShortArray69[local50]);
				local44.method7937(this.aShortArray71[local50]);
				local44.method7937(this.aShortArray66[local50]);
			}
		} else {
			for (local50 = 0; local50 < this.anInt6847; local50++) {
				local44.method7948(this.aShortArray69[local50]);
				local44.method7948(this.aShortArray71[local50]);
				local44.method7948(this.aShortArray66[local50]);
			}
		}
		if (local44.anInt9802 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface12_3 == null) {
				this.anInterface12_3 = this.aClass78_Sub3_30.method4508(local44.aByteArray104, local44.anInt9802, true);
			} else {
				this.anInterface12_3.method4195(local44.anInt9802, local44.aByteArray104);
			}
			this.aClass281_1.anInterface12_4 = this.anInterface12_3;
		} else {
			this.aClass281_1.anInterface12_4 = this.aClass78_Sub3_30.method4508(local44.aByteArray104, local44.anInt9802, false);
		}
		if (!arg0) {
			this.aBoolean526 = true;
		}
	}

	@OriginalMember(owner = "client!os", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort71;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7391(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(17) int local17;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg3 << 4;
			local25 = arg2 << 4;
			local27 = 0;
			Static581.anInt9574 = 0;
			Static328.anInt6008 = 0;
			Static121.anInt2504 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray35.length) {
					local51 = this.anIntArrayArray35[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static581.anInt9574 += this.anIntArray405[local59];
						Static328.anInt6008 += this.anIntArray401[local59];
						Static121.anInt2504 += this.anIntArray404[local59];
						local27++;
					}
				}
			}
			if (local27 > 0) {
				Static121.anInt2504 = local17 + Static121.anInt2504 / local27;
				Static581.anInt9574 = Static581.anInt9574 / local27 + local25;
				Static328.anInt6008 = local21 + Static328.anInt6008 / local27;
			} else {
				Static328.anInt6008 = local21;
				Static121.anInt2504 = local17;
				Static581.anInt9574 = local25;
			}
			return;
		}
		@Pc(154) int[] local154;
		@Pc(156) int local156;
		if (arg0 == 1) {
			local17 = arg4 << 4;
			local21 = arg3 << 4;
			local25 = arg2 << 4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray35.length > local35) {
					local154 = this.anIntArrayArray35[local35];
					for (local156 = 0; local156 < local154.length; local156++) {
						local53 = local154[local156];
						this.anIntArray405[local53] += local25;
						this.anIntArray401[local53] += local21;
						this.anIntArray404[local53] += local17;
					}
				}
			}
			return;
		}
		@Pc(272) int local272;
		@Pc(291) int local291;
		@Pc(752) int local752;
		if (arg0 == 2) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray35.length > local35) {
					local154 = this.anIntArrayArray35[local35];
					if ((arg5 & 0x1) == 0) {
						for (local156 = 0; local156 < local154.length; local156++) {
							local53 = local154[local156];
							this.anIntArray405[local53] -= Static581.anInt9574;
							this.anIntArray401[local53] -= Static328.anInt6008;
							this.anIntArray404[local53] -= Static121.anInt2504;
							if (arg4 != 0) {
								local59 = Class85_Sub8.anIntArray426[arg4];
								local272 = Class85_Sub8.anIntArray427[arg4];
								local291 = local59 * this.anIntArray401[local53] + this.anIntArray405[local53] * local272 + 16383 >> 14;
								this.anIntArray401[local53] = local272 * this.anIntArray401[local53] + 16383 - this.anIntArray405[local53] * local59 >> 14;
								this.anIntArray405[local53] = local291;
							}
							if (arg2 != 0) {
								local59 = Class85_Sub8.anIntArray426[arg2];
								local272 = Class85_Sub8.anIntArray427[arg2];
								local291 = this.anIntArray401[local53] * local272 + 16383 - local59 * this.anIntArray404[local53] >> 14;
								this.anIntArray404[local53] = local272 * this.anIntArray404[local53] + this.anIntArray401[local53] * local59 + 16383 >> 14;
								this.anIntArray401[local53] = local291;
							}
							if (arg3 != 0) {
								local59 = Class85_Sub8.anIntArray426[arg3];
								local272 = Class85_Sub8.anIntArray427[arg3];
								local291 = local272 * this.anIntArray405[local53] + local59 * this.anIntArray404[local53] + 16383 >> 14;
								this.anIntArray404[local53] = this.anIntArray404[local53] * local272 + 16383 - this.anIntArray405[local53] * local59 >> 14;
								this.anIntArray405[local53] = local291;
							}
							this.anIntArray405[local53] += Static581.anInt9574;
							this.anIntArray401[local53] += Static328.anInt6008;
							this.anIntArray404[local53] += Static121.anInt2504;
						}
					} else {
						for (local156 = 0; local156 < local154.length; local156++) {
							local53 = local154[local156];
							this.anIntArray405[local53] -= Static581.anInt9574;
							this.anIntArray401[local53] -= Static328.anInt6008;
							this.anIntArray404[local53] -= Static121.anInt2504;
							if (arg2 != 0) {
								local59 = Class85_Sub8.anIntArray426[arg2];
								local272 = Class85_Sub8.anIntArray427[arg2];
								local291 = this.anIntArray401[local53] * local272 + 16383 - local59 * this.anIntArray404[local53] >> 14;
								this.anIntArray404[local53] = this.anIntArray404[local53] * local272 + this.anIntArray401[local53] * local59 + 16383 >> 14;
								this.anIntArray401[local53] = local291;
							}
							if (arg4 != 0) {
								local59 = Class85_Sub8.anIntArray426[arg4];
								local272 = Class85_Sub8.anIntArray427[arg4];
								local291 = local59 * this.anIntArray401[local53] + local272 * this.anIntArray405[local53] + 16383 >> 14;
								this.anIntArray401[local53] = this.anIntArray401[local53] * local272 + 16383 - this.anIntArray405[local53] * local59 >> 14;
								this.anIntArray405[local53] = local291;
							}
							if (arg3 != 0) {
								local59 = Class85_Sub8.anIntArray426[arg3];
								local272 = Class85_Sub8.anIntArray427[arg3];
								local291 = this.anIntArray404[local53] * local59 + this.anIntArray405[local53] * local272 + 16383 >> 14;
								this.anIntArray404[local53] = this.anIntArray404[local53] * local272 + 16383 - local59 * this.anIntArray405[local53] >> 14;
								this.anIntArray405[local53] = local291;
							}
							this.anIntArray405[local53] += Static581.anInt9574;
							this.anIntArray401[local53] += Static328.anInt6008;
							this.anIntArray404[local53] += Static121.anInt2504;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray35.length) {
						local51 = this.anIntArrayArray35[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local272 = this.anIntArray403[local59];
							local291 = this.anIntArray403[local59 + 1];
							for (local752 = local272; local752 < local291; local752++) {
								@Pc(761) int local761 = this.aShortArray73[local752] - 1;
								if (local761 == -1) {
									break;
								}
								@Pc(774) int local774;
								@Pc(778) int local778;
								@Pc(796) int local796;
								if (arg4 != 0) {
									local774 = Class85_Sub8.anIntArray426[arg4];
									local778 = Class85_Sub8.anIntArray427[arg4];
									local796 = local778 * this.aShortArray74[local761] + local774 * this.aShortArray68[local761] + 16383 >> 14;
									this.aShortArray68[local761] = (short) (local778 * this.aShortArray68[local761] + 16383 - this.aShortArray74[local761] * local774 >> 14);
									this.aShortArray74[local761] = (short) local796;
								}
								if (arg2 != 0) {
									local774 = Class85_Sub8.anIntArray426[arg2];
									local778 = Class85_Sub8.anIntArray427[arg2];
									local796 = local778 * this.aShortArray68[local761] + 16383 - this.aShortArray65[local761] * local774 >> 14;
									this.aShortArray65[local761] = (short) (this.aShortArray68[local761] * local774 + this.aShortArray65[local761] * local778 + 16383 >> 14);
									this.aShortArray68[local761] = (short) local796;
								}
								if (arg3 != 0) {
									local774 = Class85_Sub8.anIntArray426[arg3];
									local778 = Class85_Sub8.anIntArray427[arg3];
									local796 = local774 * this.aShortArray65[local761] + this.aShortArray74[local761] * local778 + 16383 >> 14;
									this.aShortArray65[local761] = (short) (local778 * this.aShortArray65[local761] + 16383 - local774 * this.aShortArray74[local761] >> 14);
									this.aShortArray74[local761] = (short) local796;
								}
							}
						}
					}
				}
				if (this.aClass226_11 == null && this.aClass226_10 != null) {
					this.aClass226_10.anInterface8_4 = null;
				}
				if (this.aClass226_11 != null) {
					this.aClass226_11.anInterface8_4 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray35.length > local35) {
					local154 = this.anIntArrayArray35[local35];
					for (local156 = 0; local156 < local154.length; local156++) {
						local53 = local154[local156];
						this.anIntArray405[local53] -= Static581.anInt9574;
						this.anIntArray401[local53] -= Static328.anInt6008;
						this.anIntArray404[local53] -= Static121.anInt2504;
						this.anIntArray405[local53] = arg2 * this.anIntArray405[local53] >> 7;
						this.anIntArray401[local53] = this.anIntArray401[local53] * arg3 >> 7;
						this.anIntArray404[local53] = this.anIntArray404[local53] * arg4 >> 7;
						this.anIntArray405[local53] += Static581.anInt9574;
						this.anIntArray401[local53] += Static328.anInt6008;
						this.anIntArray404[local53] += Static121.anInt2504;
					}
				}
			}
		} else {
			@Pc(1219) Class307 local1219;
			@Pc(1224) Class155 local1224;
			if (arg0 == 5) {
				if (this.anIntArrayArray37 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray37.length) {
							local154 = this.anIntArrayArray37[local35];
							for (local156 = 0; local156 < local154.length; local156++) {
								local53 = local154[local156];
								local59 = arg2 * 8 + (this.aByteArray67[local53] & 0xFF);
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray67[local53] = (byte) local59;
							}
							if (local154.length > 0 && this.aClass226_10 != null) {
								this.aClass226_10.anInterface8_4 = null;
							}
						}
					}
					if (this.aClass307Array1 != null) {
						for (local35 = 0; local35 < this.anInt6869; local35++) {
							local1219 = this.aClass307Array1[local35];
							local1224 = this.aClass155Array1[local35];
							local1224.anInt3967 = local1224.anInt3967 & 0xFFFFFF | 255 - (this.aByteArray67[local1219.anInt8091] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1468) Class155 local1468;
				if (arg0 == 8) {
					if (this.anIntArrayArray36 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray36.length > local35) {
								local154 = this.anIntArrayArray36[local35];
								for (local156 = 0; local156 < local154.length; local156++) {
									local1468 = this.aClass155Array1[local154[local156]];
									local1468.anInt3969 += arg2;
									local1468.anInt3972 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray36 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray36.length > local35) {
								local154 = this.anIntArrayArray36[local35];
								for (local156 = 0; local156 < local154.length; local156++) {
									local1468 = this.aClass155Array1[local154[local156]];
									local1468.anInt3971 = local1468.anInt3971 * arg3 >> 7;
									local1468.anInt3973 = arg2 * local1468.anInt3973 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray36 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray36.length > local35) {
							local154 = this.anIntArrayArray36[local35];
							for (local156 = 0; local156 < local154.length; local156++) {
								local1468 = this.aClass155Array1[local154[local156]];
								local1468.anInt3974 = arg2 + local1468.anInt3974 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray37 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray37.length > local35) {
						local154 = this.anIntArrayArray37[local35];
						for (local156 = 0; local156 < local154.length; local156++) {
							local53 = local154[local156];
							local59 = this.aShortArray75[local53] & 0xFFFF;
							local272 = local59 >> 10 & 0x3F;
							local291 = local59 >> 7 & 0x7;
							local752 = local59 & 0x7F;
							local291 += arg3 / 4;
							@Pc(1320) int local1320 = arg2 + local272 & 0x3F;
							if (local291 < 0) {
								local291 = 0;
							} else if (local291 > 7) {
								local291 = 7;
							}
							local752 += arg4;
							if (local752 < 0) {
								local752 = 0;
							} else if (local752 > 127) {
								local752 = 127;
							}
							this.aShortArray75[local53] = (short) (local291 << 7 | local1320 << 10 | local752);
						}
						if (local154.length > 0 && this.aClass226_10 != null) {
							this.aClass226_10.anInterface8_4 = null;
						}
					}
				}
				if (this.aClass307Array1 != null) {
					for (local35 = 0; local35 < this.anInt6869; local35++) {
						local1219 = this.aClass307Array1[local35];
						local1224 = this.aClass155Array1[local35];
						local1224.anInt3967 = local1224.anInt3967 & 0xFF000000 | Static226.anIntArray212[this.aShortArray75[local1219.anInt8091] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!q;Lclient!et;II)V")
	@Override
	public void method7405(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class11_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6827 == 0) {
			return;
		}
		@Pc(13) Class34_Sub2 local13 = this.aClass78_Sub3_30.aClass34_Sub2_3;
		if (!this.aBoolean527) {
			this.method5544();
		}
		@Pc(22) Class34_Sub2 local22 = (Class34_Sub2) arg0;
		Static464.aFloat227 = local13.aFloat30 + local13.aFloat27 * local22.aFloat35 + local13.aFloat33 * local22.aFloat36 + local13.aFloat28 * local22.aFloat30;
		Static477.aFloat204 = local13.aFloat28 * local22.aFloat27 + local13.aFloat33 * local22.aFloat26 + local22.aFloat34 * local13.aFloat27;
		@Pc(69) float local69 = (float) this.aShort74 * Static477.aFloat204 + Static464.aFloat227;
		@Pc(77) float local77 = Static464.aFloat227 + (float) this.aShort69 * Static477.aFloat204;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local77 < local69) {
			local88 = (float) -this.aShort70 + local77;
			local94 = local69 + (float) this.aShort70;
		} else {
			local94 = local77 + (float) this.aShort70;
			local88 = (float) -this.aShort70 + local69;
		}
		if (this.aClass78_Sub3_30.aFloat138 <= local88 || (float) this.aClass78_Sub3_30.anInt5571 >= local94) {
			return;
		}
		Static116.aFloat42 = local13.aFloat36 + local22.aFloat30 * local13.aFloat31 + local13.aFloat26 * local22.aFloat35 + local13.aFloat29 * local22.aFloat36;
		Static269.aFloat130 = local13.aFloat29 * local22.aFloat26 + local22.aFloat34 * local13.aFloat26 + local22.aFloat27 * local13.aFloat31;
		@Pc(171) float local171 = Static116.aFloat42 + (float) this.aShort74 * Static269.aFloat130;
		@Pc(179) float local179 = Static116.aFloat42 + (float) this.aShort69 * Static269.aFloat130;
		@Pc(195) float local195;
		@Pc(206) float local206;
		if (local171 > local179) {
			local195 = (float) this.aClass78_Sub3_30.anInt5597 * ((float) -this.aShort70 + local179);
			local206 = ((float) this.aShort70 + local171) * (float) this.aClass78_Sub3_30.anInt5597;
		} else {
			local206 = (float) this.aClass78_Sub3_30.anInt5597 * ((float) this.aShort70 + local179);
			local195 = (float) this.aClass78_Sub3_30.anInt5597 * ((float) -this.aShort70 + local171);
		}
		if (this.aClass78_Sub3_30.aFloat155 <= local195 / (float) arg2 || local206 / (float) arg2 <= this.aClass78_Sub3_30.aFloat152) {
			return;
		}
		Static20.aFloat2 = local13.aFloat32 * local22.aFloat36 + local13.aFloat34 * local22.aFloat35 + local22.aFloat30 * local13.aFloat25 + local13.aFloat35;
		Static306.aFloat128 = local13.aFloat25 * local22.aFloat27 + local13.aFloat32 * local22.aFloat26 + local22.aFloat34 * local13.aFloat34;
		@Pc(298) float local298 = (float) this.aShort74 * Static306.aFloat128 + Static20.aFloat2;
		@Pc(306) float local306 = (float) this.aShort69 * Static306.aFloat128 + Static20.aFloat2;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local298 > local306) {
			local322 = ((float) -this.aShort70 + local306) * (float) this.aClass78_Sub3_30.anInt5583;
			local333 = (local298 + (float) this.aShort70) * (float) this.aClass78_Sub3_30.anInt5583;
		} else {
			local322 = ((float) -this.aShort70 + local298) * (float) this.aClass78_Sub3_30.anInt5583;
			local333 = (float) this.aClass78_Sub3_30.anInt5583 * (local306 + (float) this.aShort70);
		}
		if (local322 / (float) arg2 >= this.aClass78_Sub3_30.aFloat142 || this.aClass78_Sub3_30.aFloat143 >= local333 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass307Array1 != null) {
			Static135.aFloat78 = local22.aFloat33 * local13.aFloat31 + local13.aFloat29 * local22.aFloat29 + local13.aFloat26 * local22.aFloat32;
			Static431.aFloat194 = local13.aFloat28 * local22.aFloat33 + local22.aFloat29 * local13.aFloat33 + local13.aFloat27 * local22.aFloat32;
			Static24.aFloat4 = local22.aFloat28 * local13.aFloat28 + local13.aFloat27 * local22.aFloat25 + local13.aFloat33 * local22.aFloat31;
			Static91.aFloat207 = local13.aFloat31 * local22.aFloat28 + local22.aFloat31 * local13.aFloat29 + local22.aFloat25 * local13.aFloat26;
			Static468.aFloat201 = local13.aFloat32 * local22.aFloat31 + local22.aFloat25 * local13.aFloat34 + local22.aFloat28 * local13.aFloat25;
			Static526.aFloat231 = local22.aFloat29 * local13.aFloat32 + local13.aFloat34 * local22.aFloat32 + local13.aFloat25 * local22.aFloat33;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.aShort76 + this.aShort75 >> 1;
			@Pc(509) int local509 = this.aShort78 + this.aShort72 >> 1;
			@Pc(528) int local528 = (int) (Static269.aFloat130 * (float) this.aShort74 + Static116.aFloat42 + (float) local501 * Static135.aFloat78 + Static91.aFloat207 * (float) local509);
			@Pc(547) int local547 = (int) (Static20.aFloat2 + (float) local501 * Static526.aFloat231 + (float) this.aShort74 * Static306.aFloat128 + (float) local509 * Static468.aFloat201);
			@Pc(566) int local566 = (int) ((float) local509 * Static24.aFloat4 + Static477.aFloat204 * (float) this.aShort74 + Static431.aFloat194 * (float) local501 + Static464.aFloat227);
			@Pc(585) int local585 = (int) ((float) local509 * Static91.aFloat207 + Static269.aFloat130 * (float) this.aShort69 + Static135.aFloat78 * (float) local501 + Static116.aFloat42);
			@Pc(604) int local604 = (int) ((float) local509 * Static468.aFloat201 + (float) this.aShort69 * Static306.aFloat128 + Static20.aFloat2 + Static526.aFloat231 * (float) local501);
			@Pc(623) int local623 = (int) (Static477.aFloat204 * (float) this.aShort69 + Static431.aFloat194 * (float) local501 + Static464.aFloat227 + Static24.aFloat4 * (float) local509);
			arg1.anInt2558 = local585 * this.aClass78_Sub3_30.anInt5597 / arg2 + this.aClass78_Sub3_30.anInt5596;
			arg1.anInt2556 = this.aClass78_Sub3_30.anInt5596 + local528 * this.aClass78_Sub3_30.anInt5597 / arg2;
			arg1.anInt2554 = this.aClass78_Sub3_30.anInt5599 + this.aClass78_Sub3_30.anInt5583 * local547 / arg2;
			arg1.anInt2557 = this.aClass78_Sub3_30.anInt5599 + this.aClass78_Sub3_30.anInt5583 * local604 / arg2;
			if (local566 >= this.aClass78_Sub3_30.anInt5571 || this.aClass78_Sub3_30.anInt5571 <= local623) {
				arg1.anInt2555 = this.aClass78_Sub3_30.anInt5596 + (local528 + this.aShort70) * this.aClass78_Sub3_30.anInt5597 / arg2 - arg1.anInt2556;
				arg1.aBoolean195 = true;
			}
		}
		this.aClass78_Sub3_30.method4536((float) arg2);
		this.aClass78_Sub3_30.method4498();
		this.aClass78_Sub3_30.method4510(local22);
		this.method5552();
		this.aClass78_Sub3_30.method4503();
		this.method5542();
	}

	@OriginalMember(owner = "client!os", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class129 arg2, @OriginalArg(3) Class129 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean527) {
			this.method5544();
		}
		@Pc(16) int local16 = this.aShort76 + arg4;
		@Pc(22) int local22 = arg4 + this.aShort75;
		@Pc(27) int local27 = arg6 + this.aShort72;
		@Pc(33) int local33 = arg6 + this.aShort78;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt8060 + local22 >> arg2.anInt8066 >= arg2.anInt8065 || local27 < 0 || arg2.anInt8060 + local33 >> arg2.anInt8066 >= arg2.anInt8058)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local22 + arg3.anInt8060 >> arg3.anInt8066 >= arg3.anInt8065 || local27 < 0 || arg3.anInt8060 + local33 >> arg3.anInt8066 >= arg3.anInt8058) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8066;
			local22 = arg2.anInt8060 + local22 - 1 >> arg2.anInt8066;
			local27 >>= arg2.anInt8066;
			local33 = arg2.anInt8060 + local33 - 1 >> arg2.anInt8066;
			if (arg2.method6481(local27, local16) == arg5 && arg5 == arg2.method6481(local27, local22) && arg5 == arg2.method6481(local33, local16) && arg5 == arg2.method6481(local33, local22)) {
				return;
			}
		}
		@Pc(206) int local206;
		if (arg0 == 1) {
			for (local206 = 0; local206 < this.anInt6816; local206++) {
				this.anIntArray401[local206] = this.anIntArray401[local206] + arg2.method6480(arg6 + this.anIntArray404[local206], arg4 + this.anIntArray405[local206]) - arg5;
			}
		} else {
			@Pc(261) int local261;
			@Pc(272) int local272;
			if (arg0 == 2) {
				@Pc(253) short local253 = this.aShort74;
				if (local253 == 0) {
					return;
				}
				for (local261 = 0; local261 < this.anInt6816; local261++) {
					local272 = (this.anIntArray401[local261] << 16) / local253;
					if (arg1 > local272) {
						this.anIntArray401[local261] += (arg1 - local272) * (arg2.method6480(this.anIntArray404[local261] + arg6, arg4 + this.anIntArray405[local261]) + -arg5) / arg1;
					}
				}
			} else {
				@Pc(354) int local354;
				if (arg0 == 3) {
					local206 = (arg1 & 0xFF) * 4;
					local261 = (arg1 >> 8 & 0xFF) * 4;
					local272 = (arg1 >> 16 & 0xFF) << 6;
					local354 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local206 >> 1) < 0 || arg2.anInt8065 << arg2.anInt8066 <= arg4 + (local206 >> 1) + arg2.anInt8060 || arg6 - (local261 >> 1) < 0 || arg2.anInt8058 << arg2.anInt8066 <= arg6 + (local261 >> 1) + arg2.anInt8060) {
						return;
					}
					this.method7401(arg4, local261, local272, arg6, arg5, local206, local354, arg2);
				} else if (arg0 == 4) {
					local206 = this.aShort69 - this.aShort74;
					for (local261 = 0; local261 < this.anInt6816; local261++) {
						this.anIntArray401[local261] = local206 + this.anIntArray401[local261] + arg3.method6480(arg6 + this.anIntArray404[local261], this.anIntArray405[local261] + arg4) - arg5;
					}
				} else if (arg0 == 5) {
					local206 = this.aShort69 - this.aShort74;
					for (local261 = 0; local261 < this.anInt6816; local261++) {
						local272 = this.anIntArray405[local261] + arg4;
						local354 = this.anIntArray404[local261] + arg6;
						@Pc(461) int local461 = arg2.method6480(local354, local272);
						@Pc(467) int local467 = arg3.method6480(local354, local272);
						@Pc(475) int local475 = local461 - arg1 - local467;
						this.anIntArray401[local261] = local461 + ((this.anIntArray401[local261] << 8) / local206 * local475 >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean527 = false;
		if (this.aClass226_8 != null) {
			this.aClass226_8.anInterface8_4 = null;
		}
	}

	@OriginalMember(owner = "client!os", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class1_Sub8_Sub4 S(@OriginalArg(0) Class1_Sub8_Sub4 arg0) {
		if (this.anInt6827 == 0) {
			return null;
		}
		if (!this.aBoolean527) {
			this.method5544();
		}
		@Pc(42) int local42;
		@Pc(59) int local59;
		if (this.aClass78_Sub3_30.anInt5603 > 0) {
			local42 = this.aShort76 - (this.aShort69 * this.aClass78_Sub3_30.anInt5603 >> 8) >> this.aClass78_Sub3_30.anInt5557;
			local59 = this.aShort75 - (this.aClass78_Sub3_30.anInt5603 * this.aShort74 >> 8) >> this.aClass78_Sub3_30.anInt5557;
		} else {
			local42 = this.aShort76 - (this.aShort74 * this.aClass78_Sub3_30.anInt5603 >> 8) >> this.aClass78_Sub3_30.anInt5557;
			local59 = this.aShort75 - (this.aClass78_Sub3_30.anInt5603 * this.aShort69 >> 8) >> this.aClass78_Sub3_30.anInt5557;
		}
		@Pc(119) int local119;
		@Pc(136) int local136;
		if (this.aClass78_Sub3_30.anInt5575 <= 0) {
			local119 = this.aShort72 - (this.aClass78_Sub3_30.anInt5575 * this.aShort74 >> 8) >> this.aClass78_Sub3_30.anInt5557;
			local136 = this.aShort78 - (this.aShort69 * this.aClass78_Sub3_30.anInt5575 >> 8) >> this.aClass78_Sub3_30.anInt5557;
		} else {
			local119 = this.aShort72 - (this.aShort69 * this.aClass78_Sub3_30.anInt5575 >> 8) >> this.aClass78_Sub3_30.anInt5557;
			local136 = this.aShort78 - (this.aClass78_Sub3_30.anInt5575 * this.aShort74 >> 8) >> this.aClass78_Sub3_30.anInt5557;
		}
		@Pc(179) int local179 = local59 + 1 - local42;
		@Pc(186) int local186 = local136 + 1 - local119;
		@Pc(189) Class1_Sub8_Sub4_Sub1 local189 = (Class1_Sub8_Sub4_Sub1) arg0;
		@Pc(205) Class1_Sub8_Sub4_Sub1 local205;
		if (local189 != null && local189.method2583(local179, local186)) {
			local205 = local189;
			local189.method2586();
		} else {
			local205 = new Class1_Sub8_Sub4_Sub1(this.aClass78_Sub3_30, local179, local186);
		}
		local205.method2585(local136, local42, local59, local119);
		this.method5546(local205);
		return local205;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZILclient!q;ZI)Z")
	private boolean method5549(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class34_Sub2 local8 = (Class34_Sub2) arg3;
		@Pc(12) Class34_Sub2 local12 = this.aClass78_Sub3_30.aClass34_Sub2_3;
		@Pc(33) float local33 = local12.aFloat36 + local8.aFloat36 * local12.aFloat29 + local12.aFloat26 * local8.aFloat35 + local12.aFloat31 * local8.aFloat30;
		@Pc(54) float local54 = local12.aFloat35 + local8.aFloat36 * local12.aFloat32 + local8.aFloat35 * local12.aFloat34 + local8.aFloat30 * local12.aFloat25;
		Static135.aFloat78 = local8.aFloat33 * local12.aFloat31 + local8.aFloat32 * local12.aFloat26 + local8.aFloat29 * local12.aFloat29;
		Static526.aFloat231 = local12.aFloat34 * local8.aFloat32 + local8.aFloat29 * local12.aFloat32 + local12.aFloat25 * local8.aFloat33;
		Static91.aFloat207 = local8.aFloat31 * local12.aFloat29 + local8.aFloat25 * local12.aFloat26 + local12.aFloat31 * local8.aFloat28;
		Static431.aFloat194 = local12.aFloat27 * local8.aFloat32 + local8.aFloat29 * local12.aFloat33 + local12.aFloat28 * local8.aFloat33;
		@Pc(147) float local147 = local12.aFloat30 + local8.aFloat35 * local12.aFloat27 + local12.aFloat33 * local8.aFloat36 + local8.aFloat30 * local12.aFloat28;
		Static24.aFloat4 = local12.aFloat27 * local8.aFloat25 + local12.aFloat33 * local8.aFloat31 + local12.aFloat28 * local8.aFloat28;
		Static306.aFloat128 = local8.aFloat34 * local12.aFloat34 + local8.aFloat26 * local12.aFloat32 + local12.aFloat25 * local8.aFloat27;
		Static477.aFloat204 = local8.aFloat27 * local12.aFloat28 + local12.aFloat33 * local8.aFloat26 + local12.aFloat27 * local8.aFloat34;
		Static468.aFloat201 = local12.aFloat32 * local8.aFloat31 + local12.aFloat34 * local8.aFloat25 + local8.aFloat28 * local12.aFloat25;
		Static269.aFloat130 = local8.aFloat27 * local12.aFloat31 + local8.aFloat26 * local12.aFloat29 + local12.aFloat26 * local8.aFloat34;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass78_Sub3_30.anInt5597;
		@Pc(255) int local255 = this.aClass78_Sub3_30.anInt5583;
		if (!this.aBoolean527) {
			this.method5544();
		}
		Static63.anIntArray55[0] = this.aShort76;
		Static517.anIntArray544[0] = this.aShort74;
		Static446.anIntArray469[0] = this.aShort72;
		Static63.anIntArray55[1] = this.aShort75;
		Static517.anIntArray544[1] = this.aShort74;
		Static63.anIntArray55[2] = this.aShort76;
		Static446.anIntArray469[1] = this.aShort72;
		Static517.anIntArray544[2] = this.aShort69;
		Static63.anIntArray55[3] = this.aShort75;
		Static446.anIntArray469[2] = this.aShort72;
		Static517.anIntArray544[3] = this.aShort69;
		Static446.anIntArray469[3] = this.aShort72;
		Static63.anIntArray55[4] = this.aShort76;
		Static517.anIntArray544[4] = this.aShort74;
		Static63.anIntArray55[5] = this.aShort75;
		Static446.anIntArray469[4] = this.aShort78;
		Static517.anIntArray544[5] = this.aShort74;
		Static63.anIntArray55[6] = this.aShort76;
		Static446.anIntArray469[5] = this.aShort78;
		Static517.anIntArray544[6] = this.aShort69;
		Static63.anIntArray55[7] = this.aShort75;
		Static446.anIntArray469[6] = this.aShort78;
		Static517.anIntArray544[7] = this.aShort69;
		Static446.anIntArray469[7] = this.aShort78;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(395) float local395;
		@Pc(390) float local390;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static517.anIntArray544[local383];
			local395 = Static63.anIntArray55[local383];
			local400 = Static446.anIntArray469[local383];
			local414 = Static24.aFloat4 * local400 + Static477.aFloat204 * local390 + local395 * Static431.aFloat194 + local147;
			local428 = local395 * Static526.aFloat231 + local390 * Static306.aFloat128 + Static468.aFloat201 * local400 + local54;
			local442 = local33 + local395 * Static135.aFloat78 + Static269.aFloat130 * local390 + local400 * Static91.aFloat207;
			if (local414 >= (float) this.aClass78_Sub3_30.anInt5571) {
				if (arg4 > 0) {
					local414 = arg4;
				}
				@Pc(466) float local466 = (float) this.aClass78_Sub3_30.anInt5596 + (float) local251 * local442 / local414;
				if (local466 > local243) {
					local243 = local466;
				}
				@Pc(484) float local484 = local428 * (float) local255 / local414 + (float) this.aClass78_Sub3_30.anInt5599;
				if (local466 < local241) {
					local241 = local466;
				}
				if (local484 < local245) {
					local245 = local484;
				}
				if (local484 > local247) {
					local247 = local484;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg2 && local243 > (float) arg2 && local245 < (float) arg0 && (float) arg0 < local247) {
			if (arg1) {
				return true;
			}
			if (this.aClass78_Sub3_30.anIntArray312.length < this.anInt6827) {
				this.aClass78_Sub3_30.anIntArray310 = new int[this.anInt6827];
				this.aClass78_Sub3_30.anIntArray312 = new int[this.anInt6827];
			}
			@Pc(557) int[] local557 = this.aClass78_Sub3_30.anIntArray312;
			@Pc(561) int[] local561 = this.aClass78_Sub3_30.anIntArray310;
			@Pc(637) int local637;
			for (@Pc(563) int local563 = 0; local563 < this.anInt6816; local563++) {
				local400 = this.anIntArray404[local563];
				local390 = this.anIntArray401[local563];
				local395 = this.anIntArray405[local563];
				local414 = Static477.aFloat204 * local390 + Static431.aFloat194 * local395 + Static24.aFloat4 * local400 + local147;
				local428 = Static468.aFloat201 * local400 + local390 * Static306.aFloat128 + local395 * Static526.aFloat231 + local54;
				local442 = local33 + Static269.aFloat130 * local390 + Static135.aFloat78 * local395 + Static91.aFloat207 * local400;
				@Pc(644) int local644;
				@Pc(646) int local646;
				@Pc(655) int local655;
				if (local414 >= (float) this.aClass78_Sub3_30.anInt5571) {
					if (arg4 > 0) {
						local414 = arg4;
					}
					local637 = (int) ((float) local251 * local442 / local414 + (float) this.aClass78_Sub3_30.anInt5596);
					local644 = (int) ((float) this.aClass78_Sub3_30.anInt5599 + (float) local255 * local428 / local414);
					local646 = this.anIntArray403[local563];
					local655 = this.anIntArray403[local563 + 1];
					for (@Pc(725) int local725 = local646; local725 < local655; local725++) {
						@Pc(734) int local734 = this.aShortArray73[local725] - 1;
						if (local734 == -1) {
							break;
						}
						local557[local734] = local637;
						local561[local734] = local644;
					}
				} else {
					local637 = this.anIntArray403[local563];
					local644 = this.anIntArray403[local563 + 1];
					for (local646 = local637; local646 < local644; local646++) {
						local655 = this.aShortArray73[local646] - 1;
						if (local655 == -1) {
							break;
						}
						local557[this.aShortArray73[local646] - 1] = -999999;
					}
				}
			}
			for (local637 = 0; local637 < this.anInt6855; local637++) {
				if (local557[this.aShortArray69[local637]] != -999999 && local557[this.aShortArray71[local637]] != -999999 && local557[this.aShortArray66[local637]] != -999999 && this.method5554(local561[this.aShortArray69[local637]], local561[this.aShortArray71[local637]], local557[this.aShortArray69[local637]], local561[this.aShortArray66[local637]], arg0, arg2, local557[this.aShortArray66[local637]], local557[this.aShortArray71[local637]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt6855; local7++) {
			local16 = this.aShortArray75[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 -= -((arg0 - local22) * arg3 >> 7);
			}
			@Pc(48) int local48 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local48 += (arg2 - local48) * arg3 >> 7;
			}
			this.aShortArray75[local7] = (short) (local28 << 7 | local22 << 10 | local48);
		}
		if (this.aClass307Array1 != null) {
			for (local16 = 0; local16 < this.anInt6869; local16++) {
				@Pc(112) Class307 local112 = this.aClass307Array1[local16];
				@Pc(117) Class155 local117 = this.aClass155Array1[local16];
				local117.anInt3967 = local117.anInt3967 & 0xFF000000 | Static226.anIntArray212[this.aShortArray75[local112.anInt8091] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass226_10 != null) {
			this.aClass226_10.anInterface8_4 = null;
		}
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "()Z")
	@Override
	public boolean method7409() {
		if (this.aShortArray70 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray70.length; local12++) {
			if (this.aShortArray70[local12] != -1 && !this.aClass78_Sub3_30.anInterface9_13.method949(this.aShortArray70[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!nba;FIIIFIIJ)S")
	private short method5551(@OriginalArg(0) int arg0, @OriginalArg(1) Class231 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(9) long arg8) {
		@Pc(10) int local10 = this.anIntArray403[arg4];
		@Pc(17) int local17 = this.anIntArray403[arg4 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray73[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg8 == Static59.aLongArray1[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray73[local19] = (short) (this.anInt6827 + 1);
		Static59.aLongArray1[local19] = arg8;
		this.aShortArray74[this.anInt6827] = (short) arg7;
		this.aShortArray68[this.anInt6827] = (short) arg3;
		this.aShortArray65[this.anInt6827] = (short) arg5;
		this.aByteArray68[this.anInt6827] = (byte) arg0;
		this.aFloatArray55[this.anInt6827] = arg6;
		this.aFloatArray56[this.anInt6827] = arg2;
		return (short) this.anInt6827++;
	}

	@OriginalMember(owner = "client!os", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean527) {
			this.method5544();
		}
		return this.aShort70;
	}

	@OriginalMember(owner = "client!os", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static581.anInt9574 = 0;
			Static328.anInt6008 = 0;
			Static121.anInt2504 = 0;
			for (local17 = 0; local17 < this.anInt6816; local17++) {
				Static581.anInt9574 += this.anIntArray405[local17];
				Static328.anInt6008 += this.anIntArray401[local17];
				local9++;
				Static121.anInt2504 += this.anIntArray404[local17];
			}
			if (local9 <= 0) {
				Static328.anInt6008 = arg2;
				Static121.anInt2504 = arg3;
				Static581.anInt9574 = arg1;
			} else {
				Static328.anInt6008 = arg2 + Static328.anInt6008 / local9;
				Static121.anInt2504 = Static121.anInt2504 / local9 + arg3;
				Static581.anInt9574 = arg1 + Static581.anInt9574 / local9;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt6816; local9++) {
				this.anIntArray405[local9] += arg1;
				this.anIntArray401[local9] += arg2;
				this.anIntArray404[local9] += arg3;
			}
		} else {
			@Pc(161) int local161;
			@Pc(180) int local180;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt6816; local9++) {
					this.anIntArray405[local9] -= Static581.anInt9574;
					this.anIntArray401[local9] -= Static328.anInt6008;
					this.anIntArray404[local9] -= Static121.anInt2504;
					if (arg3 != 0) {
						local17 = Class85_Sub8.anIntArray426[arg3];
						local161 = Class85_Sub8.anIntArray427[arg3];
						local180 = local17 * this.anIntArray401[local9] + this.anIntArray405[local9] * local161 + 16383 >> 14;
						this.anIntArray401[local9] = this.anIntArray401[local9] * local161 + 16383 - this.anIntArray405[local9] * local17 >> 14;
						this.anIntArray405[local9] = local180;
					}
					if (arg1 != 0) {
						local17 = Class85_Sub8.anIntArray426[arg1];
						local161 = Class85_Sub8.anIntArray427[arg1];
						local180 = local161 * this.anIntArray401[local9] + 16383 - local17 * this.anIntArray404[local9] >> 14;
						this.anIntArray404[local9] = this.anIntArray404[local9] * local161 + local17 * this.anIntArray401[local9] + 16383 >> 14;
						this.anIntArray401[local9] = local180;
					}
					if (arg2 != 0) {
						local17 = Class85_Sub8.anIntArray426[arg2];
						local161 = Class85_Sub8.anIntArray427[arg2];
						local180 = local161 * this.anIntArray405[local9] + this.anIntArray404[local9] * local17 + 16383 >> 14;
						this.anIntArray404[local9] = this.anIntArray404[local9] * local161 + 16383 - local17 * this.anIntArray405[local9] >> 14;
						this.anIntArray405[local9] = local180;
					}
					this.anIntArray405[local9] += Static581.anInt9574;
					this.anIntArray401[local9] += Static328.anInt6008;
					this.anIntArray404[local9] += Static121.anInt2504;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt6816; local9++) {
					this.anIntArray405[local9] -= Static581.anInt9574;
					this.anIntArray401[local9] -= Static328.anInt6008;
					this.anIntArray404[local9] -= Static121.anInt2504;
					this.anIntArray405[local9] = arg1 * this.anIntArray405[local9] / 128;
					this.anIntArray401[local9] = arg2 * this.anIntArray401[local9] / 128;
					this.anIntArray404[local9] = this.anIntArray404[local9] * arg3 / 128;
					this.anIntArray405[local9] += Static581.anInt9574;
					this.anIntArray401[local9] += Static328.anInt6008;
					this.anIntArray404[local9] += Static121.anInt2504;
				}
			} else {
				@Pc(520) Class307 local520;
				@Pc(525) Class155 local525;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt6855; local9++) {
						local17 = arg1 * 8 + (this.aByteArray67[local9] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray67[local9] = (byte) local17;
					}
					if (this.aClass226_10 != null) {
						this.aClass226_10.anInterface8_4 = null;
					}
					if (this.aClass307Array1 != null) {
						for (local17 = 0; local17 < this.anInt6869; local17++) {
							local520 = this.aClass307Array1[local17];
							local525 = this.aClass155Array1[local17];
							local525.anInt3967 = local525.anInt3967 & 0xFFFFFF | 255 - (this.aByteArray67[local520.anInt8091] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt6855; local9++) {
						local17 = this.aShortArray75[local9] & 0xFFFF;
						local161 = local17 >> 10 & 0x3F;
						local180 = local17 >> 7 & 0x7;
						@Pc(582) int local582 = local17 & 0x7F;
						local180 += arg2 / 4;
						@Pc(594) int local594 = local161 + arg1 & 0x3F;
						if (local180 < 0) {
							local180 = 0;
						} else if (local180 > 7) {
							local180 = 7;
						}
						local582 += arg3;
						if (local582 < 0) {
							local582 = 0;
						} else if (local582 > 127) {
							local582 = 127;
						}
						this.aShortArray75[local9] = (short) (local180 << 7 | local594 << 10 | local582);
					}
					if (this.aClass226_10 != null) {
						this.aClass226_10.anInterface8_4 = null;
					}
					if (this.aClass307Array1 != null) {
						for (local17 = 0; local17 < this.anInt6869; local17++) {
							local520 = this.aClass307Array1[local17];
							local525 = this.aClass155Array1[local17];
							local525.anInt3967 = local525.anInt3967 & 0xFF000000 | Static226.anIntArray212[this.aShortArray75[local520.anInt8091] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(704) Class155 local704;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt6869; local9++) {
							local704 = this.aClass155Array1[local9];
							local704.anInt3969 += arg1;
							local704.anInt3972 += arg2;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt6869; local9++) {
							local704 = this.aClass155Array1[local9];
							local704.anInt3973 = arg1 * local704.anInt3973 >> 7;
							local704.anInt3971 = arg2 * local704.anInt3971 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt6869; local9++) {
							local704 = this.aClass155Array1[local9];
							local704.anInt3974 = arg1 + local704.anInt3974 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6816; local7++) {
			this.anIntArray404[local7] = -this.anIntArray404[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt6827; local29++) {
			this.aShortArray65[local29] = (short) -this.aShortArray65[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt6855; local52++) {
			@Pc(59) short local59 = this.aShortArray69[local52];
			this.aShortArray69[local52] = this.aShortArray66[local52];
			this.aShortArray66[local52] = local59;
		}
		if (this.aClass226_11 == null && this.aClass226_10 != null) {
			this.aClass226_10.anInterface8_4 = null;
		}
		if (this.aClass226_11 != null) {
			this.aClass226_11.anInterface8_4 = null;
		}
		this.aBoolean527 = false;
		if (this.aClass281_1 != null) {
			this.aClass281_1.anInterface12_4 = null;
		}
		if (this.aClass226_8 != null) {
			this.aClass226_8.anInterface8_4 = null;
		}
	}

	@OriginalMember(owner = "client!os", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class85_Sub8.anIntArray426[arg0];
		@Pc(13) int local13 = Class85_Sub8.anIntArray427[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6816; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray405[local15] + local9 * this.anIntArray401[local15] >> 14;
			this.anIntArray401[local15] = local13 * this.anIntArray401[local15] - local9 * this.anIntArray405[local15] >> 14;
			this.anIntArray405[local15] = local33;
		}
		if (this.aClass226_8 != null) {
			this.aClass226_8.anInterface8_4 = null;
		}
		this.aBoolean527 = false;
	}

	@OriginalMember(owner = "client!os", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class85_Sub8.anIntArray426[arg0];
		@Pc(13) int local13 = Class85_Sub8.anIntArray427[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6816; local15++) {
			local33 = local9 * this.anIntArray404[local15] + local13 * this.anIntArray405[local15] >> 14;
			this.anIntArray404[local15] = this.anIntArray404[local15] * local13 - local9 * this.anIntArray405[local15] >> 14;
			this.anIntArray405[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt6827; local33++) {
			@Pc(83) int local83 = local9 * this.aShortArray65[local33] + local13 * this.aShortArray74[local33] >> 14;
			this.aShortArray65[local33] = (short) (this.aShortArray65[local33] * local13 - this.aShortArray74[local33] * local9 >> 14);
			this.aShortArray74[local33] = (short) local83;
		}
		if (this.aClass226_11 == null && this.aClass226_10 != null) {
			this.aClass226_10.anInterface8_4 = null;
		}
		if (this.aClass226_11 != null) {
			this.aClass226_11.anInterface8_4 = null;
		}
		this.aBoolean527 = false;
		if (this.aClass226_8 != null) {
			this.aClass226_8.anInterface8_4 = null;
		}
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(I)V")
	private void method5552() {
		if (this.anInt6847 == 0) {
			return;
		}
		if (this.aByte90 != 0) {
			this.method5547(true);
		}
		this.method5547(false);
		if (this.aClass281_1 != null) {
			if (this.aClass281_1.anInterface12_4 == null) {
				this.method5548((this.aByte90 & 0x10) != 0);
			}
			if (this.aClass281_1.anInterface12_4 != null) {
				this.aClass78_Sub3_30.method4524(this.aClass226_11 != null);
				this.aClass78_Sub3_30.method4537(this.aClass226_9, this.aClass226_11, this.aClass226_8, this.aClass226_10);
				@Pc(82) int local82 = this.anIntArray402.length - 1;
				for (@Pc(84) int local84 = 0; local84 < local82; local84++) {
					@Pc(91) int local91 = this.anIntArray402[local84];
					@Pc(98) int local98 = this.anIntArray402[local84 + 1];
					@Pc(105) int local105 = this.aShortArray70[local91] & 0xFFFF;
					if (local105 == 65535) {
						local105 = -1;
					}
					this.aClass78_Sub3_30.method4544(local105, this.aClass226_11 != null);
					this.aClass78_Sub3_30.method4564((local98 - local91) * 3, local91 * 3, this.aClass281_1.anInterface12_4);
				}
			}
		}
		this.method5545();
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "()V")
	@Override
	protected void method7399() {
	}

	@OriginalMember(owner = "client!os", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static121.anInt2504 = 0;
			Static328.anInt6008 = 0;
			local31 = 0;
			Static581.anInt9574 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray35.length) {
					local55 = this.anIntArrayArray35[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray67 == null || (arg6 & this.aShortArray67[local63]) != 0) {
							Static581.anInt9574 += this.anIntArray405[local63];
							Static328.anInt6008 += this.anIntArray401[local63];
							Static121.anInt2504 += this.anIntArray404[local63];
							local31++;
						}
					}
				}
			}
			if (local31 > 0) {
				Static492.aBoolean620 = true;
				Static328.anInt6008 = Static328.anInt6008 / local31 + arg3;
				Static121.anInt2504 = arg4 + Static121.anInt2504 / local31;
				Static581.anInt9574 = Static581.anInt9574 / local31 + arg2;
			} else {
				Static328.anInt6008 = arg3;
				Static581.anInt9574 = arg2;
				Static121.anInt2504 = arg4;
			}
			return;
		}
		@Pc(254) int[] local254;
		@Pc(256) int local256;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg3 * arg7[1] + arg7[0] * arg2 + arg4 * arg7[2] + 8192 >> 14;
				local35 = arg3 * arg7[4] + arg2 * arg7[3] + arg7[5] * arg4 + 8192 >> 14;
				local41 = arg2 * arg7[6] + arg3 * arg7[7] + arg4 * arg7[8] + 8192 >> 14;
				arg3 = local35;
				arg4 = local41;
				arg2 = local31;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray35.length) {
					local254 = this.anIntArrayArray35[local35];
					for (local256 = 0; local256 < local254.length; local256++) {
						local57 = local254[local256];
						if (this.aShortArray67 == null || (arg6 & this.aShortArray67[local57]) != 0) {
							this.anIntArray405[local57] += arg2;
							this.anIntArray401[local57] += arg3;
							this.anIntArray404[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(380) int local380;
		@Pc(402) int local402;
		@Pc(425) int local425;
		@Pc(460) int local460;
		@Pc(464) int local464;
		@Pc(468) int local468;
		@Pc(472) int local472;
		@Pc(480) int local480;
		@Pc(488) int local488;
		@Pc(645) int local645;
		@Pc(670) int local670;
		@Pc(674) int local674;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(692) int local692;
		@Pc(696) int local696;
		@Pc(698) int local698;
		@Pc(828) int[] local828;
		@Pc(830) int local830;
		@Pc(834) int local834;
		@Pc(838) int local838;
		@Pc(840) int local840;
		@Pc(966) int local966;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray35.length > local35) {
						local254 = this.anIntArrayArray35[local35];
						for (local256 = 0; local256 < local254.length; local256++) {
							local57 = local254[local256];
							if (this.aShortArray67 == null || (this.aShortArray67[local57] & arg6) != 0) {
								this.anIntArray405[local57] -= Static581.anInt9574;
								this.anIntArray401[local57] -= Static328.anInt6008;
								this.anIntArray404[local57] -= Static121.anInt2504;
								if (arg4 != 0) {
									local63 = Class85_Sub8.anIntArray426[arg4];
									local380 = Class85_Sub8.anIntArray427[arg4];
									local402 = local380 * this.anIntArray405[local57] + this.anIntArray401[local57] * local63 + 16383 >> 14;
									this.anIntArray401[local57] = this.anIntArray401[local57] * local380 + 16383 - this.anIntArray405[local57] * local63 >> 14;
									this.anIntArray405[local57] = local402;
								}
								if (arg2 != 0) {
									local63 = Class85_Sub8.anIntArray426[arg2];
									local380 = Class85_Sub8.anIntArray427[arg2];
									local402 = this.anIntArray401[local57] * local380 + 16383 - local63 * this.anIntArray404[local57] >> 14;
									this.anIntArray404[local57] = local63 * this.anIntArray401[local57] + local380 * this.anIntArray404[local57] + 16383 >> 14;
									this.anIntArray401[local57] = local402;
								}
								if (arg3 != 0) {
									local63 = Class85_Sub8.anIntArray426[arg3];
									local380 = Class85_Sub8.anIntArray427[arg3];
									local402 = this.anIntArray404[local57] * local63 + this.anIntArray405[local57] * local380 + 16383 >> 14;
									this.anIntArray404[local57] = local380 * this.anIntArray404[local57] + 16383 - local63 * this.anIntArray405[local57] >> 14;
									this.anIntArray405[local57] = local402;
								}
								this.anIntArray405[local57] += Static581.anInt9574;
								this.anIntArray401[local57] += Static328.anInt6008;
								this.anIntArray404[local57] += Static121.anInt2504;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray35.length) {
							local55 = this.anIntArrayArray35[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray67 == null || (arg6 & this.aShortArray67[local63]) != 0) {
									local380 = this.anIntArray403[local63];
									local402 = this.anIntArray403[local63 + 1];
									for (local425 = local380; local425 < local402; local425++) {
										local460 = this.aShortArray73[local425] - 1;
										if (local460 == -1) {
											break;
										}
										if (arg4 != 0) {
											local464 = Class85_Sub8.anIntArray426[arg4];
											local468 = Class85_Sub8.anIntArray427[arg4];
											local472 = local464 * this.aShortArray68[local460] + local468 * this.aShortArray74[local460] + 16383 >> 14;
											this.aShortArray68[local460] = (short) (local468 * this.aShortArray68[local460] + 16383 - local464 * this.aShortArray74[local460] >> 14);
											this.aShortArray74[local460] = (short) local472;
										}
										if (arg2 != 0) {
											local464 = Class85_Sub8.anIntArray426[arg2];
											local468 = Class85_Sub8.anIntArray427[arg2];
											local472 = this.aShortArray68[local460] * local468 + 16383 - local464 * this.aShortArray65[local460] >> 14;
											this.aShortArray65[local460] = (short) (local464 * this.aShortArray68[local460] + this.aShortArray65[local460] * local468 + 16383 >> 14);
											this.aShortArray68[local460] = (short) local472;
										}
										if (arg3 != 0) {
											local464 = Class85_Sub8.anIntArray426[arg3];
											local468 = Class85_Sub8.anIntArray427[arg3];
											local472 = local464 * this.aShortArray65[local460] + this.aShortArray74[local460] * local468 + 16383 >> 14;
											this.aShortArray65[local460] = (short) (this.aShortArray65[local460] * local468 + 16383 - local464 * this.aShortArray74[local460] >> 14);
											this.aShortArray74[local460] = (short) local472;
										}
									}
								}
							}
						}
					}
					if (this.aClass226_11 == null && this.aClass226_10 != null) {
						this.aClass226_10.anInterface8_4 = null;
					}
					if (this.aClass226_11 != null) {
						this.aClass226_11.anInterface8_4 = null;
					}
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local256 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static492.aBoolean620) {
					local380 = arg7[0] * Static581.anInt9574 + Static328.anInt6008 * arg7[3] + Static121.anInt2504 * arg7[6] + 8192 >> 14;
					local402 = Static121.anInt2504 * arg7[7] + Static328.anInt6008 * arg7[4] + Static581.anInt9574 * arg7[1] + 8192 >> 14;
					local425 = arg7[5] * Static328.anInt6008 + arg7[2] * Static581.anInt9574 + arg7[8] * Static121.anInt2504 + 8192 >> 14;
					local402 += local57;
					local380 += local256;
					Static581.anInt9574 = local380;
					Static328.anInt6008 = local402;
					local425 += local63;
					Static492.aBoolean620 = false;
					Static121.anInt2504 = local425;
				}
				@Pc(448) int[] local448 = new int[9];
				local402 = Class85_Sub8.anIntArray427[arg2];
				local425 = Class85_Sub8.anIntArray426[arg2];
				local460 = Class85_Sub8.anIntArray427[arg3];
				local464 = Class85_Sub8.anIntArray426[arg3];
				local468 = Class85_Sub8.anIntArray427[arg4];
				local472 = Class85_Sub8.anIntArray426[arg4];
				local480 = local425 * local468 + 8192 >> 14;
				local488 = local425 * local472 + 8192 >> 14;
				local448[5] = -local425;
				local448[8] = local460 * local402 + 8192 >> 14;
				local448[6] = -local464 * local468 + local460 * local488 + 8192 >> 14;
				local448[4] = local468 * local402 + 8192 >> 14;
				local448[2] = local402 * local464 + 8192 >> 14;
				local448[7] = local480 * local460 + local472 * local464 + 8192 >> 14;
				local448[0] = local468 * local460 + local488 * local464 + 8192 >> 14;
				local448[1] = -local460 * local472 + local480 * local464 + 8192 >> 14;
				local448[3] = local472 * local402 + 8192 >> 14;
				@Pc(619) int local619 = -Static328.anInt6008 * local448[1] + local448[0] * -Static581.anInt9574 + local448[2] * -Static121.anInt2504 + 8192 >> 14;
				local645 = -Static328.anInt6008 * local448[4] + local448[3] * -Static581.anInt9574 + local448[5] * -Static121.anInt2504 + 8192 >> 14;
				local670 = -Static328.anInt6008 * local448[7] + -Static581.anInt9574 * local448[6] + local448[8] * -Static121.anInt2504 + 8192 >> 14;
				local674 = local619 + Static581.anInt9574;
				@Pc(678) int local678 = Static328.anInt6008 + local645;
				local683 = local670 + Static121.anInt2504;
				@Pc(686) int[] local686 = new int[9];
				for (local688 = 0; local688 < 3; local688++) {
					for (local692 = 0; local692 < 3; local692++) {
						local696 = 0;
						for (local698 = 0; local698 < 3; local698++) {
							local696 += local448[local698 + local688 * 3] * arg7[local698 + local692 * 3];
						}
						local686[local688 * 3 + local692] = local696 + 8192 >> 14;
					}
				}
				local692 = local448[2] * local63 + local57 * local448[1] + local448[0] * local256 + 8192 >> 14;
				local696 = local448[4] * local57 + local448[3] * local256 + local448[5] * local63 + 8192 >> 14;
				local698 = local63 * local448[8] + local256 * local448[6] + local57 * local448[7] + 8192 >> 14;
				local692 += local674;
				local696 += local678;
				local698 += local683;
				local828 = new int[9];
				for (local830 = 0; local830 < 3; local830++) {
					for (local834 = 0; local834 < 3; local834++) {
						local838 = 0;
						for (local840 = 0; local840 < 3; local840++) {
							local838 += local686[local840 * 3 + local834] * arg7[local830 * 3 + local840];
						}
						local828[local834 + local830 * 3] = local838 + 8192 >> 14;
					}
				}
				local834 = arg7[1] * local696 + arg7[0] * local692 + local698 * arg7[2] + 8192 >> 14;
				local838 = arg7[4] * local696 + local692 * arg7[3] + local698 * arg7[5] + 8192 >> 14;
				local838 += local35;
				local834 += local31;
				local840 = local696 * arg7[7] + arg7[6] * local692 + arg7[8] * local698 + 8192 >> 14;
				local840 += local41;
				for (local966 = 0; local966 < local8; local966++) {
					@Pc(972) int local972 = arg1[local966];
					if (local972 < this.anIntArrayArray35.length) {
						@Pc(986) int[] local986 = this.anIntArrayArray35[local972];
						for (@Pc(988) int local988 = 0; local988 < local986.length; local988++) {
							@Pc(994) int local994 = local986[local988];
							if (this.aShortArray67 == null || (this.aShortArray67[local994] & arg6) != 0) {
								@Pc(1039) int local1039 = this.anIntArray405[local994] * local828[0] + this.anIntArray401[local994] * local828[1] + this.anIntArray404[local994] * local828[2] + 8192 >> 14;
								@Pc(1070) int local1070 = this.anIntArray404[local994] * local828[5] + this.anIntArray405[local994] * local828[3] + local828[4] * this.anIntArray401[local994] + 8192 >> 14;
								@Pc(1074) int local1074 = local1039 + local834;
								@Pc(1078) int local1078 = local1070 + local838;
								@Pc(1109) int local1109 = local828[7] * this.anIntArray401[local994] + local828[6] * this.anIntArray405[local994] + local828[8] * this.anIntArray404[local994] + 8192 >> 14;
								@Pc(1113) int local1113 = local1109 + local840;
								this.anIntArray405[local994] = local1074;
								this.anIntArray401[local994] = local1078;
								this.anIntArray404[local994] = local1113;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2580) Class307 local2580;
			@Pc(2585) Class155 local2585;
			if (arg0 == 5) {
				if (this.anIntArrayArray37 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray37.length) {
							local254 = this.anIntArrayArray37[local35];
							for (local256 = 0; local256 < local254.length; local256++) {
								local57 = local254[local256];
								if (this.aShortArray72 == null || (this.aShortArray72[local57] & arg6) != 0) {
									local63 = arg2 * 8 + (this.aByteArray67[local57] & 0xFF);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray67[local57] = (byte) local63;
									if (this.aClass226_10 != null) {
										this.aClass226_10.anInterface8_4 = null;
									}
								}
							}
						}
					}
					if (this.aClass307Array1 != null) {
						for (local35 = 0; local35 < this.anInt6869; local35++) {
							local2580 = this.aClass307Array1[local35];
							local2585 = this.aClass155Array1[local35];
							local2585.anInt3967 = local2585.anInt3967 & 0xFFFFFF | 255 - (this.aByteArray67[local2580.anInt8091] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2833) Class155 local2833;
				if (arg0 == 8) {
					if (this.anIntArrayArray36 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray36.length > local35) {
								local254 = this.anIntArrayArray36[local35];
								for (local256 = 0; local256 < local254.length; local256++) {
									local2833 = this.aClass155Array1[local254[local256]];
									local2833.anInt3969 += arg2;
									local2833.anInt3972 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray36 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray36.length) {
								local254 = this.anIntArrayArray36[local35];
								for (local256 = 0; local256 < local254.length; local256++) {
									local2833 = this.aClass155Array1[local254[local256]];
									local2833.anInt3973 = local2833.anInt3973 * arg2 >> 7;
									local2833.anInt3971 = arg3 * local2833.anInt3971 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray36 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray36.length > local35) {
							local254 = this.anIntArrayArray36[local35];
							for (local256 = 0; local256 < local254.length; local256++) {
								local2833 = this.aClass155Array1[local254[local256]];
								local2833.anInt3974 = arg2 + local2833.anInt3974 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray37 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray37.length > local35) {
						local254 = this.anIntArrayArray37[local35];
						for (local256 = 0; local256 < local254.length; local256++) {
							local57 = local254[local256];
							if (this.aShortArray72 == null || (this.aShortArray72[local57] & arg6) != 0) {
								local63 = this.aShortArray75[local57] & 0xFFFF;
								local380 = local63 >> 10 & 0x3F;
								local402 = local63 >> 7 & 0x7;
								local402 += arg3 / 4;
								@Pc(2683) int local2683 = arg2 + local380 & 0x3F;
								local425 = local63 & 0x7F;
								local425 += arg4;
								if (local402 < 0) {
									local402 = 0;
								} else if (local402 > 7) {
									local402 = 7;
								}
								if (local425 < 0) {
									local425 = 0;
								} else if (local425 > 127) {
									local425 = 127;
								}
								this.aShortArray75[local57] = (short) (local425 | local2683 << 10 | local402 << 7);
								if (this.aClass226_10 != null) {
									this.aClass226_10.anInterface8_4 = null;
								}
							}
						}
					}
				}
				if (this.aClass307Array1 != null) {
					for (local35 = 0; local35 < this.anInt6869; local35++) {
						local2580 = this.aClass307Array1[local35];
						local2585 = this.aClass155Array1[local35];
						local2585.anInt3967 = Static226.anIntArray212[this.aShortArray75[local2580.anInt8091] & 0xFFFF] & 0xFFFFFF | local2585.anInt3967 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray35.length) {
					local254 = this.anIntArrayArray35[local35];
					for (local256 = 0; local256 < local254.length; local256++) {
						local57 = local254[local256];
						if (this.aShortArray67 == null || (arg6 & this.aShortArray67[local57]) != 0) {
							this.anIntArray405[local57] -= Static581.anInt9574;
							this.anIntArray401[local57] -= Static328.anInt6008;
							this.anIntArray404[local57] -= Static121.anInt2504;
							this.anIntArray405[local57] = arg2 * this.anIntArray405[local57] >> 7;
							this.anIntArray401[local57] = this.anIntArray401[local57] * arg3 >> 7;
							this.anIntArray404[local57] = arg4 * this.anIntArray404[local57] >> 7;
							this.anIntArray405[local57] += Static581.anInt9574;
							this.anIntArray401[local57] += Static328.anInt6008;
							this.anIntArray404[local57] += Static121.anInt2504;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local256 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static492.aBoolean620) {
				local380 = Static328.anInt6008 * arg7[3] + Static581.anInt9574 * arg7[0] + arg7[6] * Static121.anInt2504 + 8192 >> 14;
				local402 = Static328.anInt6008 * arg7[4] + Static581.anInt9574 * arg7[1] + Static121.anInt2504 * arg7[7] + 8192 >> 14;
				local380 += local256;
				local425 = arg7[2] * Static581.anInt9574 + arg7[5] * Static328.anInt6008 + Static121.anInt2504 * arg7[8] + 8192 >> 14;
				local402 += local57;
				local425 += local63;
				Static328.anInt6008 = local402;
				Static581.anInt9574 = local380;
				Static492.aBoolean620 = false;
				Static121.anInt2504 = local425;
			}
			local380 = arg2 << 15 >> 7;
			local402 = arg3 << 15 >> 7;
			local425 = arg4 << 15 >> 7;
			local460 = local380 * -Static581.anInt9574 + 8192 >> 14;
			local464 = local402 * -Static328.anInt6008 + 8192 >> 14;
			local468 = local425 * -Static121.anInt2504 + 8192 >> 14;
			local472 = local460 + Static581.anInt9574;
			local480 = Static328.anInt6008 + local464;
			local488 = Static121.anInt2504 + local468;
			@Pc(2029) int[] local2029 = new int[] { local380 * arg7[0] + 8192 >> 14, local380 * arg7[3] + 8192 >> 14, local380 * arg7[6] + 8192 >> 14, arg7[1] * local402 + 8192 >> 14, local402 * arg7[4] + 8192 >> 14, local402 * arg7[7] + 8192 >> 14, arg7[2] * local425 + 8192 >> 14, arg7[5] * local425 + 8192 >> 14, local425 * arg7[8] + 8192 >> 14 };
			local645 = local380 * local256 + 8192 >> 14;
			local670 = local57 * local402 + 8192 >> 14;
			@Pc(2157) int local2157 = local670 + local480;
			local674 = local425 * local63 + 8192 >> 14;
			@Pc(2169) int local2169 = local645 + local472;
			@Pc(2173) int local2173 = local674 + local488;
			@Pc(2176) int[] local2176 = new int[9];
			@Pc(2182) int local2182;
			for (local683 = 0; local683 < 3; local683++) {
				for (local2182 = 0; local2182 < 3; local2182++) {
					local688 = 0;
					for (local692 = 0; local692 < 3; local692++) {
						local688 += arg7[local683 * 3 + local692] * local2029[local2182 + local692 * 3];
					}
					local2176[local2182 + local683 * 3] = local688 + 8192 >> 14;
				}
			}
			local2182 = arg7[2] * local2173 + arg7[0] * local2169 + arg7[1] * local2157 + 8192 >> 14;
			local688 = local2173 * arg7[5] + arg7[4] * local2157 + arg7[3] * local2169 + 8192 >> 14;
			local692 = arg7[8] * local2173 + local2169 * arg7[6] + local2157 * arg7[7] + 8192 >> 14;
			local688 += local35;
			local2182 += local31;
			local692 += local41;
			for (local696 = 0; local696 < local8; local696++) {
				local698 = arg1[local696];
				if (this.anIntArrayArray35.length > local698) {
					local828 = this.anIntArrayArray35[local698];
					for (local830 = 0; local830 < local828.length; local830++) {
						local834 = local828[local830];
						if (this.aShortArray67 == null || (arg6 & this.aShortArray67[local834]) != 0) {
							local838 = local2176[2] * this.anIntArray404[local834] + this.anIntArray405[local834] * local2176[0] + this.anIntArray401[local834] * local2176[1] + 8192 >> 14;
							local840 = local2176[5] * this.anIntArray404[local834] + local2176[3] * this.anIntArray405[local834] + this.anIntArray401[local834] * local2176[4] + 8192 >> 14;
							@Pc(2417) int local2417 = local838 + local2182;
							@Pc(2421) int local2421 = local840 + local688;
							local966 = local2176[6] * this.anIntArray405[local834] + this.anIntArray401[local834] * local2176[7] + local2176[8] * this.anIntArray404[local834] + 8192 >> 14;
							this.anIntArray405[local834] = local2417;
							@Pc(2462) int local2462 = local966 + local692;
							this.anIntArray401[local834] = local2421;
							this.anIntArray404[local834] = local2462;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean527) {
			this.method5544();
		}
		return this.aShort78;
	}

	@OriginalMember(owner = "client!os", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean527) {
			this.method5544();
		}
		return this.aShort74;
	}

	@OriginalMember(owner = "client!os", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean527) {
			this.method5544();
		}
		return this.aShort72;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "()[Lclient!lp;")
	@Override
	public Class212[] method7395() {
		return this.aClass212Array2;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!os;ZIZLclient!os;I)Lclient!da;")
	private Class52 method5553(@OriginalArg(0) Class52_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class52_Sub1 arg3, @OriginalArg(5) int arg4) {
		arg0.anInt6869 = this.anInt6869;
		arg0.anInt6847 = this.anInt6847;
		arg0.anInt6839 = arg4;
		arg0.anInt6842 = this.anInt6842;
		arg0.aShort71 = this.aShort71;
		arg0.aByte90 = 0;
		arg0.aShort77 = this.aShort77;
		arg0.anInt6855 = this.anInt6855;
		arg0.anInt6816 = this.anInt6816;
		if ((arg4 & 0x100) == 0) {
			arg0.aBoolean525 = this.aBoolean525;
		} else {
			arg0.aBoolean525 = true;
		}
		arg0.anInt6844 = this.anInt6844;
		arg0.anInt6827 = this.anInt6827;
		@Pc(69) boolean local69 = Static575.method7748(this.anInt6842, arg4);
		@Pc(75) boolean local75 = Static480.method6648(arg4, this.anInt6842);
		@Pc(83) boolean local83 = Static579.method7769(this.anInt6842, arg4);
		@Pc(89) boolean local89 = local83 | local69 | local75;
		@Pc(194) int local194;
		if (local89) {
			if (!local69) {
				arg0.anIntArray405 = this.anIntArray405;
			} else if (arg3.anIntArray405 == null || arg3.anIntArray405.length < this.anInt6844) {
				arg0.anIntArray405 = arg3.anIntArray405 = new int[this.anInt6844];
			} else {
				arg0.anIntArray405 = arg3.anIntArray405;
			}
			if (!local75) {
				arg0.anIntArray401 = this.anIntArray401;
			} else if (arg3.anIntArray401 == null || arg3.anIntArray401.length < this.anInt6844) {
				arg0.anIntArray401 = arg3.anIntArray401 = new int[this.anInt6844];
			} else {
				arg0.anIntArray401 = arg3.anIntArray401;
			}
			if (!local83) {
				arg0.anIntArray404 = this.anIntArray404;
			} else if (arg3.anIntArray404 == null || this.anInt6844 > arg3.anIntArray404.length) {
				arg0.anIntArray404 = arg3.anIntArray404 = new int[this.anInt6844];
			} else {
				arg0.anIntArray404 = arg3.anIntArray404;
			}
			for (local194 = 0; local194 < this.anInt6844; local194++) {
				if (local69) {
					arg0.anIntArray405[local194] = this.anIntArray405[local194];
				}
				if (local75) {
					arg0.anIntArray401[local194] = this.anIntArray401[local194];
				}
				if (local83) {
					arg0.anIntArray404[local194] = this.anIntArray404[local194];
				}
			}
		} else {
			arg0.anIntArray404 = this.anIntArray404;
			arg0.anIntArray401 = this.anIntArray401;
			arg0.anIntArray405 = this.anIntArray405;
		}
		if (Static324.method4819(this.anInt6842, arg4)) {
			arg0.aClass226_8 = arg3.aClass226_8;
			if (arg1) {
				arg0.aByte90 = (byte) (arg0.aByte90 | 0x1);
			}
			arg0.aClass226_8.aByte85 = this.aClass226_8.aByte85;
			arg0.aClass226_8.anInterface8_4 = this.aClass226_8.anInterface8_4;
		} else if (Static567.method5561(this.anInt6842, arg4)) {
			arg0.aClass226_8 = this.aClass226_8;
		} else {
			arg0.aClass226_8 = null;
		}
		if (Static109.method1516(arg4, this.anInt6842)) {
			if (arg3.aShortArray75 == null || this.anInt6855 > arg3.aShortArray75.length) {
				arg0.aShortArray75 = arg3.aShortArray75 = new short[this.anInt6855];
			} else {
				arg0.aShortArray75 = arg3.aShortArray75;
			}
			for (local194 = 0; local194 < this.anInt6855; local194++) {
				arg0.aShortArray75[local194] = this.aShortArray75[local194];
			}
		} else {
			arg0.aShortArray75 = this.aShortArray75;
		}
		if (Static64.method1035(arg4, this.anInt6842)) {
			if (arg3.aByteArray67 == null || this.anInt6855 > arg3.aByteArray67.length) {
				arg0.aByteArray67 = arg3.aByteArray67 = new byte[this.anInt6855];
			} else {
				arg0.aByteArray67 = arg3.aByteArray67;
			}
			for (local194 = 0; local194 < this.anInt6855; local194++) {
				arg0.aByteArray67[local194] = this.aByteArray67[local194];
			}
		} else {
			arg0.aByteArray67 = this.aByteArray67;
		}
		if (Static519.method7180(arg4, this.anInt6842)) {
			if (arg1) {
				arg0.aByte90 = (byte) (arg0.aByte90 | 0x2);
			}
			arg0.aClass226_10 = arg3.aClass226_10;
			arg0.aClass226_10.aByte85 = this.aClass226_10.aByte85;
			arg0.aClass226_10.anInterface8_4 = this.aClass226_10.anInterface8_4;
		} else if (Static280.method4171(arg4, this.anInt6842)) {
			arg0.aClass226_10 = this.aClass226_10;
		} else {
			arg0.aClass226_10 = null;
		}
		@Pc(576) int local576;
		if (Static262.method3790(this.anInt6842, arg4)) {
			if (arg3.aShortArray74 == null || arg3.aShortArray74.length < this.anInt6827) {
				local194 = this.anInt6827;
				arg0.aShortArray68 = arg3.aShortArray68 = new short[local194];
				arg0.aShortArray65 = arg3.aShortArray65 = new short[local194];
				arg0.aShortArray74 = arg3.aShortArray74 = new short[local194];
			} else {
				arg0.aShortArray74 = arg3.aShortArray74;
				arg0.aShortArray65 = arg3.aShortArray65;
				arg0.aShortArray68 = arg3.aShortArray68;
			}
			if (this.aClass140_1 == null) {
				for (local194 = 0; local194 < this.anInt6827; local194++) {
					arg0.aShortArray74[local194] = this.aShortArray74[local194];
					arg0.aShortArray68[local194] = this.aShortArray68[local194];
					arg0.aShortArray65[local194] = this.aShortArray65[local194];
				}
			} else {
				if (arg3.aClass140_1 == null) {
					arg3.aClass140_1 = new Class140();
				}
				@Pc(564) Class140 local564 = arg0.aClass140_1 = arg3.aClass140_1;
				if (local564.aShortArray28 == null || local564.aShortArray28.length < this.anInt6827) {
					local576 = this.anInt6827;
					local564.aByteArray19 = new byte[local576];
					local564.aShortArray29 = new short[local576];
					local564.aShortArray28 = new short[local576];
					local564.aShortArray27 = new short[local576];
				}
				for (local576 = 0; local576 < this.anInt6827; local576++) {
					arg0.aShortArray74[local576] = this.aShortArray74[local576];
					arg0.aShortArray68[local576] = this.aShortArray68[local576];
					arg0.aShortArray65[local576] = this.aShortArray65[local576];
					local564.aShortArray28[local576] = this.aClass140_1.aShortArray28[local576];
					local564.aShortArray29[local576] = this.aClass140_1.aShortArray29[local576];
					local564.aShortArray27[local576] = this.aClass140_1.aShortArray27[local576];
					local564.aByteArray19[local576] = this.aClass140_1.aByteArray19[local576];
				}
			}
			arg0.aByteArray68 = this.aByteArray68;
		} else {
			arg0.aByteArray68 = this.aByteArray68;
			arg0.aClass140_1 = this.aClass140_1;
			arg0.aShortArray65 = this.aShortArray65;
			arg0.aShortArray74 = this.aShortArray74;
			arg0.aShortArray68 = this.aShortArray68;
		}
		if (Static380.method5475(this.anInt6842, arg4)) {
			if (arg1) {
				arg0.aByte90 = (byte) (arg0.aByte90 | 0x4);
			}
			arg0.aClass226_11 = arg3.aClass226_11;
			arg0.aClass226_11.anInterface8_4 = this.aClass226_11.anInterface8_4;
			arg0.aClass226_11.aByte85 = this.aClass226_11.aByte85;
		} else if (Static100.method1477(arg4, this.anInt6842)) {
			arg0.aClass226_11 = this.aClass226_11;
		} else {
			arg0.aClass226_11 = null;
		}
		if (Static98.method1465(this.anInt6842, arg4)) {
			if (arg3.aFloatArray55 == null || this.anInt6855 > arg3.aFloatArray55.length) {
				local194 = this.anInt6827;
				arg0.aFloatArray55 = arg3.aFloatArray55 = new float[local194];
				arg0.aFloatArray56 = arg3.aFloatArray56 = new float[local194];
			} else {
				arg0.aFloatArray56 = arg3.aFloatArray56;
				arg0.aFloatArray55 = arg3.aFloatArray55;
			}
			for (local194 = 0; local194 < this.anInt6827; local194++) {
				arg0.aFloatArray55[local194] = this.aFloatArray55[local194];
				arg0.aFloatArray56[local194] = this.aFloatArray56[local194];
			}
		} else {
			arg0.aFloatArray55 = this.aFloatArray55;
			arg0.aFloatArray56 = this.aFloatArray56;
		}
		if (Static308.method4627(this.anInt6842, arg4)) {
			if (arg1) {
				arg0.aByte90 = (byte) (arg0.aByte90 | 0x8);
			}
			arg0.aClass226_9 = arg3.aClass226_9;
			arg0.aClass226_9.anInterface8_4 = this.aClass226_9.anInterface8_4;
			arg0.aClass226_9.aByte85 = this.aClass226_9.aByte85;
		} else if (Static115.method1622(this.anInt6842, arg4)) {
			arg0.aClass226_9 = this.aClass226_9;
		} else {
			arg0.aClass226_9 = null;
		}
		if (Static99.method1471(arg4, this.anInt6842)) {
			if (arg3.aShortArray69 == null || arg3.aShortArray69.length < this.anInt6855) {
				local194 = this.anInt6855;
				arg0.aShortArray69 = arg3.aShortArray69 = new short[local194];
				arg0.aShortArray66 = arg3.aShortArray66 = new short[local194];
				arg0.aShortArray71 = arg3.aShortArray71 = new short[local194];
			} else {
				arg0.aShortArray71 = arg3.aShortArray71;
				arg0.aShortArray66 = arg3.aShortArray66;
				arg0.aShortArray69 = arg3.aShortArray69;
			}
			for (local194 = 0; local194 < this.anInt6855; local194++) {
				arg0.aShortArray69[local194] = this.aShortArray69[local194];
				arg0.aShortArray71[local194] = this.aShortArray71[local194];
				arg0.aShortArray66[local194] = this.aShortArray66[local194];
			}
		} else {
			arg0.aShortArray69 = this.aShortArray69;
			arg0.aShortArray66 = this.aShortArray66;
			arg0.aShortArray71 = this.aShortArray71;
		}
		if (Static100.method1475(this.anInt6842, arg4)) {
			arg0.aClass281_1 = arg3.aClass281_1;
			if (arg1) {
				arg0.aByte90 = (byte) (arg0.aByte90 | 0x10);
			}
			arg0.aClass281_1.anInterface12_4 = this.aClass281_1.anInterface12_4;
		} else if (Static345.method7740(arg4, this.anInt6842)) {
			arg0.aClass281_1 = this.aClass281_1;
		} else {
			arg0.aClass281_1 = null;
		}
		if (Static28.method561(arg4, this.anInt6842)) {
			if (arg3.aShortArray70 == null || arg3.aShortArray70.length < this.anInt6855) {
				local194 = this.anInt6855;
				arg0.aShortArray70 = arg3.aShortArray70 = new short[local194];
			} else {
				arg0.aShortArray70 = arg3.aShortArray70;
			}
			for (local194 = 0; local194 < this.anInt6855; local194++) {
				arg0.aShortArray70[local194] = this.aShortArray70[local194];
			}
		} else {
			arg0.aShortArray70 = this.aShortArray70;
		}
		if (!Static280.method4167(arg4, this.anInt6842)) {
			arg0.aClass155Array1 = this.aClass155Array1;
		} else if (arg3.aClass155Array1 == null || this.anInt6869 > arg3.aClass155Array1.length) {
			local194 = this.anInt6869;
			arg0.aClass155Array1 = arg3.aClass155Array1 = new Class155[local194];
			for (local576 = 0; local576 < this.anInt6869; local576++) {
				arg0.aClass155Array1[local576] = this.aClass155Array1[local576].method3237();
			}
		} else {
			arg0.aClass155Array1 = arg3.aClass155Array1;
			for (local194 = 0; local194 < this.anInt6869; local194++) {
				arg0.aClass155Array1[local194].method3242(this.aClass155Array1[local194]);
			}
		}
		arg0.aShortArray67 = this.aShortArray67;
		arg0.aShortArray72 = this.aShortArray72;
		arg0.anIntArrayArray37 = this.anIntArrayArray37;
		arg0.anIntArray402 = this.anIntArray402;
		arg0.anIntArrayArray36 = this.anIntArrayArray36;
		arg0.anIntArrayArray35 = this.anIntArrayArray35;
		arg0.aShortArray73 = this.aShortArray73;
		arg0.aClass307Array1 = this.aClass307Array1;
		arg0.aClass212Array2 = this.aClass212Array2;
		if (this.aBoolean527) {
			arg0.aShort74 = this.aShort74;
			arg0.aShort73 = this.aShort73;
			arg0.aShort72 = this.aShort72;
			arg0.aBoolean527 = true;
			arg0.aShort70 = this.aShort70;
			arg0.aShort75 = this.aShort75;
			arg0.aShort78 = this.aShort78;
			arg0.aShort76 = this.aShort76;
			arg0.aShort69 = this.aShort69;
		} else {
			arg0.aBoolean527 = false;
		}
		arg0.anIntArray403 = this.anIntArray403;
		arg0.aClass244Array2 = this.aClass244Array2;
		return arg0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method5554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > arg4 && arg4 < arg1 && arg3 > arg4) {
			return false;
		} else if (arg0 < arg4 && arg1 < arg4 && arg4 > arg3) {
			return false;
		} else if (arg2 > arg5 && arg7 > arg5 && arg5 < arg6) {
			return false;
		} else {
			return arg2 >= arg5 || arg7 >= arg5 || arg5 <= arg6;
		}
	}

	@OriginalMember(owner = "client!os", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort77;
	}

	@OriginalMember(owner = "client!os", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean527) {
			this.method5544();
		}
		return this.aShort75;
	}

	@OriginalMember(owner = "client!os", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class85_Sub8.anIntArray426[arg0];
		@Pc(13) int local13 = Class85_Sub8.anIntArray427[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6816; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray405[local15] + this.anIntArray404[local15] * local9 >> 14;
			this.anIntArray404[local15] = local13 * this.anIntArray404[local15] - this.anIntArray405[local15] * local9 >> 14;
			this.anIntArray405[local15] = local33;
		}
		if (this.aClass226_8 != null) {
			this.aClass226_8.anInterface8_4 = null;
		}
		this.aBoolean527 = false;
	}
}
