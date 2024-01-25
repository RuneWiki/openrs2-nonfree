import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class63_Sub3 extends Class63 {

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "[F")
	private float[] aFloatArray44;

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "[B")
	private byte[] aByteArray86;

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!qf", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray159;

	@OriginalMember(owner = "client!qf", name = "S", descriptor = "[I")
	private int[] anIntArray567;

	@OriginalMember(owner = "client!qf", name = "W", descriptor = "[I")
	private int[] anIntArray568;

	@OriginalMember(owner = "client!qf", name = "X", descriptor = "S")
	private short aShort97;

	@OriginalMember(owner = "client!qf", name = "Y", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!qf", name = "bb", descriptor = "S")
	private short aShort98;

	@OriginalMember(owner = "client!qf", name = "cb", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!qf", name = "db", descriptor = "S")
	private short aShort100;

	@OriginalMember(owner = "client!qf", name = "eb", descriptor = "Lclient!cd;")
	private Interface5 anInterface5_5;

	@OriginalMember(owner = "client!qf", name = "fb", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!qf", name = "gb", descriptor = "Lclient!vu;")
	private Interface23 anInterface23_3;

	@OriginalMember(owner = "client!qf", name = "ib", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!qf", name = "lb", descriptor = "[F")
	private float[] lb;

	@OriginalMember(owner = "client!qf", name = "nb", descriptor = "[I")
	private int[] anIntArray569;

	@OriginalMember(owner = "client!qf", name = "ob", descriptor = "[Lclient!rfa;")
	private Class287[] aClass287Array1;

	@OriginalMember(owner = "client!qf", name = "tb", descriptor = "[I")
	private int[] anIntArray570;

	@OriginalMember(owner = "client!qf", name = "vb", descriptor = "I")
	private int anInt7426;

	@OriginalMember(owner = "client!qf", name = "xb", descriptor = "[Lclient!lea;")
	private Class206[] aClass206Array4;

	@OriginalMember(owner = "client!qf", name = "zb", descriptor = "[I")
	private int[] anIntArray571;

	@OriginalMember(owner = "client!qf", name = "Ab", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!qf", name = "Eb", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!qf", name = "Hb", descriptor = "Lclient!pg;")
	private Class259 aClass259_1;

	@OriginalMember(owner = "client!qf", name = "Ob", descriptor = "B")
	private byte aByte100;

	@OriginalMember(owner = "client!qf", name = "Rb", descriptor = "[[I")
	private int[][] anIntArrayArray160;

	@OriginalMember(owner = "client!qf", name = "Sb", descriptor = "[Lclient!in;")
	private Class158[] aClass158Array4;

	@OriginalMember(owner = "client!qf", name = "Vb", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!qf", name = "Xb", descriptor = "I")
	private int anInt7444;

	@OriginalMember(owner = "client!qf", name = "bc", descriptor = "[[I")
	private int[][] anIntArrayArray161;

	@OriginalMember(owner = "client!qf", name = "fc", descriptor = "S")
	private short aShort103;

	@OriginalMember(owner = "client!qf", name = "hc", descriptor = "[S")
	private short[] aShortArray119;

	@OriginalMember(owner = "client!qf", name = "kc", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!qf", name = "oc", descriptor = "[S")
	private short[] aShortArray121;

	@OriginalMember(owner = "client!qf", name = "rc", descriptor = "I")
	private int anInt7455;

	@OriginalMember(owner = "client!qf", name = "uc", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!qf", name = "vc", descriptor = "[S")
	private short[] aShortArray123;

	@OriginalMember(owner = "client!qf", name = "xc", descriptor = "S")
	private short aShort104;

	@OriginalMember(owner = "client!qf", name = "zc", descriptor = "[S")
	private short[] aShortArray124;

	@OriginalMember(owner = "client!qf", name = "Ac", descriptor = "[Lclient!iw;")
	private Class166[] aClass166Array1;

	@OriginalMember(owner = "client!qf", name = "Cc", descriptor = "[B")
	private byte[] aByteArray87;

	@OriginalMember(owner = "client!qf", name = "Ic", descriptor = "S")
	private short aShort105;

	@OriginalMember(owner = "client!qf", name = "P", descriptor = "Z")
	private boolean aBoolean581 = false;

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
	private int anInt7396 = 0;

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
	private int anInt7401 = 0;

	@OriginalMember(owner = "client!qf", name = "Db", descriptor = "Z")
	private boolean aBoolean582 = false;

	@OriginalMember(owner = "client!qf", name = "ac", descriptor = "I")
	private int anInt7446 = 0;

	@OriginalMember(owner = "client!qf", name = "pc", descriptor = "I")
	private int anInt7454 = 0;

	@OriginalMember(owner = "client!qf", name = "wc", descriptor = "Z")
	private boolean aBoolean583 = true;

	@OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
	private int anInt7408 = 0;

	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_32;

	@OriginalMember(owner = "client!qf", name = "D", descriptor = "Lclient!lq;")
	private Class213 aClass213_7;

	@OriginalMember(owner = "client!qf", name = "F", descriptor = "Lclient!lq;")
	private Class213 aClass213_8;

	@OriginalMember(owner = "client!qf", name = "yc", descriptor = "Lclient!lq;")
	private Class213 aClass213_10;

	@OriginalMember(owner = "client!qf", name = "jc", descriptor = "Lclient!lq;")
	private Class213 aClass213_9;

	@OriginalMember(owner = "client!qf", name = "dc", descriptor = "Lclient!kc;")
	private Class183 aClass183_1;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class63_Sub3(@OriginalArg(0) Class134_Sub2 arg0) {
		this.aClass134_Sub2_32 = arg0;
		this.aClass213_7 = new Class213(null, 5126, 3, 0);
		this.aClass213_8 = new Class213(null, 5126, 2, 0);
		this.aClass213_10 = new Class213(null, 5126, 3, 0);
		this.aClass213_9 = new Class213(null, 5121, 4, 0);
		this.aClass183_1 = new Class183();
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!ok;Lclient!lm;IIII)V")
	public Class63_Sub3(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7444 = arg5;
		this.anInt7455 = arg2;
		this.aClass134_Sub2_32 = arg0;
		if (Static29.method347(arg2, arg5)) {
			this.aClass213_7 = new Class213(null, 5126, 3, 0);
		}
		if (Static483.method6535(arg2, arg5)) {
			this.aClass213_8 = new Class213(null, 5126, 2, 0);
		}
		if (Static454.method6262(arg5, arg2)) {
			this.aClass213_10 = new Class213(null, 5126, 3, 0);
		}
		if (Static27.method316(arg5, arg2)) {
			this.aClass213_9 = new Class213(null, 5121, 4, 0);
		}
		if (Static555.method7560(arg5, arg2)) {
			this.aClass183_1 = new Class183();
		}
		@Pc(105) Interface7 local105 = arg0.anInterface7_10;
		this.anIntArray569 = new int[arg1.anInt5242 + 1];
		@Pc(116) int[] local116 = new int[arg1.anInt5254];
		for (@Pc(118) int local118 = 0; local118 < arg1.anInt5254; local118++) {
			if ((arg1.aByteArray57 == null || arg1.aByteArray57[local118] != 2) && (arg1.aShortArray88 == null || arg1.aShortArray88[local118] == -1 || !local105.method3874(arg1.aShortArray88[local118] & 0xFFFF).aBoolean11)) {
				local116[this.anInt7408++] = local118;
				this.anIntArray569[arg1.aShortArray89[local118]]++;
				this.anIntArray569[arg1.aShortArray93[local118]]++;
				this.anIntArray569[arg1.aShortArray84[local118]]++;
			}
		}
		this.anInt7446 = this.anInt7408;
		@Pc(212) long[] local212 = new long[this.anInt7408];
		@Pc(221) boolean local221 = (this.anInt7455 & 0x100) != 0;
		@Pc(233) int local233;
		@Pc(244) int local244;
		@Pc(373) int local373;
		label495: for (@Pc(223) int local223 = 0; local223 < this.anInt7408; local223++) {
			@Pc(229) int local229 = local116[local223];
			@Pc(231) Class3 local231 = null;
			local233 = 0;
			@Pc(235) byte local235 = 0;
			@Pc(237) byte local237 = 0;
			@Pc(239) byte local239 = 0;
			if (arg1.aClass264Array1 != null) {
				for (local244 = 0; local244 < arg1.aClass264Array1.length; local244++) {
					@Pc(251) Class264 local251 = arg1.aClass264Array1[local244];
					if (local229 == local251.anInt7109) {
						@Pc(260) Class352 local260 = Static548.method7013(local251.anInt7105);
						if (local260.aBoolean735) {
							local212[local223] = Long.MAX_VALUE;
							this.anInt7446--;
							continue label495;
						}
					}
				}
			}
			@Pc(287) short local287 = -1;
			if (arg1.aShortArray88 != null) {
				local287 = arg1.aShortArray88[local229];
				if (local287 != -1) {
					local231 = local105.method3874(local287 & 0xFFFF);
					local237 = local231.aByte7;
					local239 = local231.aByte1;
				}
			}
			@Pc(335) boolean local335 = arg1.aByteArray61 != null && arg1.aByteArray61[local229] != 0 || local231 != null && local231.aBoolean10 | !local231.aBoolean8;
			if ((local221 || local335) && arg1.aByteArray60 != null) {
				local233 += arg1.aByteArray60[local229] << 17;
			}
			if (local335) {
				local233 += 65536;
			}
			local233 += (local237 & 0xFF) << 8;
			local373 = local235 + ((local287 & 0xFFFF) << 16);
			local233 += local239 & 0xFF;
			@Pc(385) int local385 = local373 + (local223 & 0xFFFF);
			local212[local223] = (long) local385 + ((long) local233 << 32);
			this.aBoolean582 |= local335;
		}
		Static320.method3905(local116, local212);
		this.aShortArray117 = arg1.aShortArray86;
		this.anIntArray568 = arg1.anIntArray405;
		this.anIntArray570 = arg1.anIntArray407;
		this.anInt7454 = arg1.anInt5244;
		this.anInt7401 = arg1.anInt5242;
		this.anIntArray567 = arg1.anIntArray409;
		@Pc(442) Class292[] local442 = new Class292[this.anInt7401];
		this.aClass206Array4 = arg1.aClass206Array3;
		this.aClass158Array4 = arg1.aClass158Array3;
		@Pc(470) int local470;
		@Pc(484) int local484;
		if (arg1.aClass264Array1 != null) {
			this.anInt7426 = arg1.aClass264Array1.length;
			this.aClass287Array1 = new Class287[this.anInt7426];
			this.aClass166Array1 = new Class166[this.anInt7426];
			for (local470 = 0; local470 < this.anInt7426; local470++) {
				@Pc(477) Class264 local477 = arg1.aClass264Array1[local470];
				@Pc(482) Class352 local482 = Static548.method7013(local477.anInt7105);
				local484 = -1;
				for (@Pc(486) int local486 = 0; local486 < this.anInt7408; local486++) {
					if (local477.anInt7109 == local116[local486]) {
						local484 = local486;
						break;
					}
				}
				if (local484 == -1) {
					throw new RuntimeException();
				}
				local244 = Static379.anIntArray506[arg1.aShortArray87[local477.anInt7109] & 0xFFFF] & 0xFFFFFF;
				local244 |= 255 - (arg1.aByteArray61 == null ? 0 : arg1.aByteArray61[local477.anInt7109]) << 24;
				this.aClass287Array1[local470] = new Class287(local484, arg1.aShortArray89[local477.anInt7109], arg1.aShortArray93[local477.anInt7109], arg1.aShortArray84[local477.anInt7109], local482.anInt9415, local482.anInt9412, local482.anInt9416, local482.anInt9417, local482.anInt9410, local482.aBoolean735, local482.aBoolean736, local477.anInt7107);
				this.aClass166Array1[local470] = new Class166(local244);
			}
		}
		local470 = this.anInt7408 * 3;
		this.aShortArray120 = new short[local470];
		this.aShort105 = (short) arg3;
		this.aFloatArray44 = new float[local470];
		this.aByteArray87 = new byte[local470];
		this.aShortArray115 = new short[this.anInt7408];
		this.aShortArray124 = new short[local470];
		this.aShortArray121 = new short[this.anInt7408];
		this.aShortArray122 = new short[this.anInt7408];
		this.aShortArray123 = new short[this.anInt7408];
		this.aShortArray118 = new short[local470];
		this.aShortArray114 = new short[local470];
		if (arg1.aShortArray90 != null) {
			this.aShortArray116 = new short[this.anInt7408];
		}
		Static338.aLongArray25 = new long[local470];
		this.aByteArray86 = new byte[this.anInt7408];
		this.aShortArray119 = new short[this.anInt7408];
		this.lb = new float[local470];
		this.aShort99 = (short) arg4;
		local233 = 0;
		for (local373 = 0; local373 < arg1.anInt5242; local373++) {
			local484 = this.anIntArray569[local373];
			this.anIntArray569[local373] = local233;
			local442[local373] = new Class292();
			local233 += local484;
		}
		this.anIntArray569[arg1.anInt5242] = local233;
		@Pc(718) int[] local718 = null;
		@Pc(720) int[] local720 = null;
		@Pc(722) int[] local722 = null;
		@Pc(724) float[][] local724 = null;
		@Pc(750) int local750;
		@Pc(798) int local798;
		@Pc(804) int local804;
		@Pc(817) int local817;
		@Pc(819) int local819;
		@Pc(853) int local853;
		@Pc(858) int local858;
		@Pc(1018) float local1018;
		@Pc(1047) float local1047;
		@Pc(1023) float local1023;
		if (arg1.aByteArray58 != null) {
			@Pc(730) int local730 = arg1.anInt5245;
			@Pc(733) int[] local733 = new int[local730];
			@Pc(736) int[] local736 = new int[local730];
			@Pc(739) int[] local739 = new int[local730];
			@Pc(742) int[] local742 = new int[local730];
			@Pc(745) int[] local745 = new int[local730];
			@Pc(748) int[] local748 = new int[local730];
			for (local750 = 0; local750 < local730; local750++) {
				local733[local750] = Integer.MAX_VALUE;
				local736[local750] = -2147483647;
				local739[local750] = Integer.MAX_VALUE;
				local742[local750] = -2147483647;
				local745[local750] = Integer.MAX_VALUE;
				local748[local750] = -2147483647;
			}
			local724 = new float[local730][];
			local718 = new int[local730];
			local722 = new int[local730];
			local720 = new int[local730];
			for (local798 = 0; local798 < this.anInt7408; local798++) {
				local804 = local116[local798];
				if (arg1.aByteArray58[local804] != -1) {
					local817 = arg1.aByteArray58[local804] & 0xFF;
					for (local819 = 0; local819 < 3; local819++) {
						@Pc(834) short local834;
						if (local819 == 0) {
							local834 = arg1.aShortArray89[local804];
						} else if (local819 == 1) {
							local834 = arg1.aShortArray93[local804];
						} else {
							local834 = arg1.aShortArray84[local804];
						}
						local853 = arg1.anIntArray407[local834];
						local858 = arg1.anIntArray409[local834];
						@Pc(863) int local863 = arg1.anIntArray405[local834];
						if (local853 < local733[local817]) {
							local733[local817] = local853;
						}
						if (local736[local817] < local853) {
							local736[local817] = local853;
						}
						if (local858 < local739[local817]) {
							local739[local817] = local858;
						}
						if (local742[local817] < local858) {
							local742[local817] = local858;
						}
						if (local863 < local745[local817]) {
							local745[local817] = local863;
						}
						if (local863 > local748[local817]) {
							local748[local817] = local863;
						}
					}
				}
			}
			for (local804 = 0; local804 < local730; local804++) {
				@Pc(959) byte local959 = arg1.aByteArray62[local804];
				if (local959 > 0) {
					local718[local804] = (local736[local804] + local733[local804]) / 2;
					local720[local804] = (local742[local804] + local739[local804]) / 2;
					local722[local804] = (local745[local804] + local748[local804]) / 2;
					if (local959 == 1) {
						local858 = arg1.anIntArray402[local804];
						if (local858 == 0) {
							local1023 = 1.0F;
							local1018 = 1.0F;
						} else if (local858 > 0) {
							local1018 = 1.0F;
							local1023 = (float) local858 / 1024.0F;
						} else {
							local1018 = (float) -local858 / 1024.0F;
							local1023 = 1.0F;
						}
						local1047 = 64.0F / (float) arg1.anIntArray404[local804];
					} else if (local959 == 2) {
						local1047 = 64.0F / (float) arg1.anIntArray404[local804];
						local1023 = 64.0F / (float) arg1.anIntArray412[local804];
						local1018 = 64.0F / (float) arg1.anIntArray402[local804];
					} else {
						local1047 = (float) arg1.anIntArray404[local804] / 1024.0F;
						local1018 = (float) arg1.anIntArray402[local804] / 1024.0F;
						local1023 = (float) arg1.anIntArray412[local804] / 1024.0F;
					}
					local724[local804] = Static24.method273(arg1.aShortArray92[local804], local1023, arg1.aByteArray59[local804] & 0xFF, local1018, arg1.aShortArray91[local804], local1047, arg1.aShortArray85[local804]);
				}
			}
		}
		@Pc(1140) Class10[] local1140 = new Class10[arg1.anInt5254];
		@Pc(1159) short local1159;
		@Pc(1170) int local1170;
		@Pc(1180) int local1180;
		@Pc(1241) int local1241;
		for (@Pc(1142) int local1142 = 0; local1142 < arg1.anInt5254; local1142++) {
			@Pc(1149) short local1149 = arg1.aShortArray89[local1142];
			@Pc(1154) short local1154 = arg1.aShortArray93[local1142];
			local1159 = arg1.aShortArray84[local1142];
			local1170 = this.anIntArray570[local1154] - this.anIntArray570[local1149];
			local1180 = this.anIntArray567[local1154] - this.anIntArray567[local1149];
			local750 = this.anIntArray568[local1154] - this.anIntArray568[local1149];
			local798 = this.anIntArray570[local1159] - this.anIntArray570[local1149];
			local804 = this.anIntArray567[local1159] - this.anIntArray567[local1149];
			local817 = this.anIntArray568[local1159] - this.anIntArray568[local1149];
			local819 = local817 * local1180 - local750 * local804;
			local1241 = local798 * local750 - local1170 * local817;
			local853 = local804 * local1170 - local1180 * local798;
			while (local819 > 8192 || local1241 > 8192 || local853 > 8192 || local819 < -8192 || local1241 < -8192 || local853 < -8192) {
				local1241 >>= 0x1;
				local853 >>= 0x1;
				local819 >>= 0x1;
			}
			local858 = (int) Math.sqrt((double) (local853 * local853 + local1241 * local1241 + local819 * local819));
			if (local858 <= 0) {
				local858 = 1;
			}
			local819 = local819 * 256 / local858;
			local853 = local853 * 256 / local858;
			local1241 = local1241 * 256 / local858;
			@Pc(1335) byte local1335 = arg1.aByteArray57 == null ? 0 : arg1.aByteArray57[local1142];
			if (local1335 == 0) {
				@Pc(1366) Class292 local1366 = local442[local1149];
				local1366.anInt7849 += local819;
				local1366.anInt7853++;
				local1366.anInt7850 += local853;
				local1366.anInt7852 += local1241;
				@Pc(1394) Class292 local1394 = local442[local1154];
				local1394.anInt7849 += local819;
				local1394.anInt7852 += local1241;
				local1394.anInt7853++;
				local1394.anInt7850 += local853;
				@Pc(1422) Class292 local1422 = local442[local1159];
				local1422.anInt7853++;
				local1422.anInt7849 += local819;
				local1422.anInt7852 += local1241;
				local1422.anInt7850 += local853;
			} else if (local1335 == 1) {
				@Pc(1351) Class10 local1351 = local1140[local1142] = new Class10();
				local1351.anInt197 = local1241;
				local1351.anInt193 = local819;
				local1351.anInt194 = local853;
			}
		}
		@Pc(1459) int local1459;
		for (@Pc(1453) int local1453 = 0; local1453 < this.anInt7408; local1453++) {
			local1459 = local116[local1453];
			@Pc(1466) int local1466 = arg1.aShortArray87[local1459] & 0xFFFF;
			@Pc(1474) short local1474;
			if (arg1.aShortArray88 == null) {
				local1474 = -1;
			} else {
				local1474 = arg1.aShortArray88[local1459];
			}
			if (arg1.aByteArray58 == null) {
				local1180 = -1;
			} else {
				local1180 = arg1.aByteArray58[local1459];
			}
			if (arg1.aByteArray61 == null) {
				local750 = 0;
			} else {
				local750 = arg1.aByteArray61[local1459] & 0xFF;
			}
			@Pc(1506) float local1506 = 0.0F;
			@Pc(1508) float local1508 = 0.0F;
			@Pc(1510) float local1510 = 0.0F;
			local1018 = 0.0F;
			local1047 = 0.0F;
			local1023 = 0.0F;
			@Pc(1518) byte local1518 = 0;
			@Pc(1520) byte local1520 = 0;
			@Pc(1522) int local1522 = 0;
			@Pc(1538) byte local1538;
			@Pc(1555) short local1555;
			@Pc(2294) short local2294;
			@Pc(2299) short local2299;
			if (local1474 != -1) {
				if (local1180 == -1) {
					local1023 = 0.0F;
					local1047 = 0.0F;
					local1520 = 2;
					local1508 = 1.0F;
					local1510 = 1.0F;
					local1518 = 1;
					local1506 = 0.0F;
					local1018 = 1.0F;
				} else {
					local1180 &= 0xFF;
					local1538 = arg1.aByteArray62[local1180];
					@Pc(1545) short local1545;
					@Pc(1550) short local1550;
					@Pc(1584) float local1584;
					@Pc(1595) float local1595;
					@Pc(1674) float local1674;
					@Pc(1907) float local1907;
					@Pc(1915) float local1915;
					@Pc(1923) float local1923;
					@Pc(1946) float local1946;
					@Pc(1969) float local1969;
					@Pc(1992) float local1992;
					if (local1538 == 0) {
						local1545 = arg1.aShortArray89[local1459];
						local1550 = arg1.aShortArray93[local1459];
						local1555 = arg1.aShortArray84[local1459];
						local2294 = arg1.aShortArray85[local1180];
						local2299 = arg1.aShortArray92[local1180];
						@Pc(2304) short local2304 = arg1.aShortArray91[local1180];
						@Pc(2310) float local2310 = (float) arg1.anIntArray407[local2294];
						@Pc(2316) float local2316 = (float) arg1.anIntArray409[local2294];
						local1584 = arg1.anIntArray405[local2294];
						local1595 = (float) arg1.anIntArray407[local2299] - local2310;
						local1674 = (float) arg1.anIntArray409[local2299] - local2316;
						@Pc(2348) float local2348 = (float) arg1.anIntArray405[local2299] - local1584;
						@Pc(2357) float local2357 = (float) arg1.anIntArray407[local2304] - local2310;
						@Pc(2365) float local2365 = (float) arg1.anIntArray409[local2304] - local2316;
						@Pc(2374) float local2374 = (float) arg1.anIntArray405[local2304] - local1584;
						@Pc(2383) float local2383 = (float) arg1.anIntArray407[local1545] - local2310;
						@Pc(2391) float local2391 = (float) arg1.anIntArray409[local1545] - local2316;
						@Pc(2400) float local2400 = (float) arg1.anIntArray405[local1545] - local1584;
						@Pc(2409) float local2409 = (float) arg1.anIntArray407[local1550] - local2310;
						@Pc(2417) float local2417 = (float) arg1.anIntArray409[local1550] - local2316;
						local1907 = (float) arg1.anIntArray405[local1550] - local1584;
						local1915 = (float) arg1.anIntArray407[local1555] - local2310;
						local1923 = (float) arg1.anIntArray409[local1555] - local2316;
						local1946 = (float) arg1.anIntArray405[local1555] - local1584;
						local1969 = local2374 * local1674 - local2365 * local2348;
						local1992 = local2357 * local2348 - local2374 * local1595;
						@Pc(2473) float local2473 = local1595 * local2365 - local1674 * local2357;
						@Pc(2481) float local2481 = local2473 * local2365 - local2374 * local1992;
						@Pc(2489) float local2489 = local1969 * local2374 - local2357 * local2473;
						@Pc(2498) float local2498 = local2357 * local1992 - local2365 * local1969;
						@Pc(2512) float local2512 = 1.0F / (local2498 * local2348 + local1595 * local2481 + local1674 * local2489);
						local1047 = local2512 * (local1946 * local2498 + local2489 * local1923 + local2481 * local1915);
						local1510 = (local2489 * local2417 + local2409 * local2481 + local1907 * local2498) * local2512;
						local1506 = (local2481 * local2383 + local2489 * local2391 + local2400 * local2498) * local2512;
						@Pc(2563) float local2563 = local1992 * local1595 - local1674 * local1969;
						@Pc(2571) float local2571 = local1674 * local2473 - local1992 * local2348;
						@Pc(2579) float local2579 = local1969 * local2348 - local2473 * local1595;
						@Pc(2593) float local2593 = 1.0F / (local2365 * local2579 + local2357 * local2571 + local2563 * local2374);
						local1018 = (local1907 * local2563 + local2579 * local2417 + local2409 * local2571) * local2593;
						local1023 = local2593 * (local2579 * local1923 + local2571 * local1915 + local2563 * local1946);
						local1508 = local2593 * (local2400 * local2563 + local2571 * local2383 + local2579 * local2391);
					} else {
						local1545 = arg1.aShortArray89[local1459];
						local1550 = arg1.aShortArray93[local1459];
						local1555 = arg1.aShortArray84[local1459];
						@Pc(1559) int local1559 = local718[local1180];
						@Pc(1563) int local1563 = local720[local1180];
						@Pc(1567) int local1567 = local722[local1180];
						@Pc(1571) float[] local1571 = local724[local1180];
						@Pc(1576) byte local1576 = arg1.aByteArray63[local1180];
						local1584 = (float) arg1.anIntArray406[local1180] / 256.0F;
						if (local1538 == 1) {
							local1595 = (float) arg1.anIntArray412[local1180] / 1024.0F;
							Static352.method4830(local1595, local1584, local1563, local1571, arg1.anIntArray407[local1545], local1559, local1567, arg1.anIntArray409[local1545], arg1.anIntArray405[local1545], local1576);
							local1508 = Static595.aFloat212;
							local1506 = Static9.aFloat2;
							Static352.method4830(local1595, local1584, local1563, local1571, arg1.anIntArray407[local1550], local1559, local1567, arg1.anIntArray409[local1550], arg1.anIntArray405[local1550], local1576);
							local1018 = Static595.aFloat212;
							local1510 = Static9.aFloat2;
							Static352.method4830(local1595, local1584, local1563, local1571, arg1.anIntArray407[local1555], local1559, local1567, arg1.anIntArray409[local1555], arg1.anIntArray405[local1555], local1576);
							local1023 = Static595.aFloat212;
							local1047 = Static9.aFloat2;
							local1674 = local1595 / 2.0F;
							if ((local1576 & 0x1) == 0) {
								if (local1047 - local1506 > local1674) {
									local1520 = 1;
									local1047 -= local1595;
								} else if (local1506 - local1047 > local1674) {
									local1047 += local1595;
									local1520 = 2;
								}
								if (local1674 < local1510 - local1506) {
									local1518 = 1;
									local1510 -= local1595;
								} else if (local1674 < local1506 - local1510) {
									local1510 += local1595;
									local1518 = 2;
								}
							} else {
								if (local1674 < local1018 - local1508) {
									local1518 = 1;
									local1018 -= local1595;
								} else if (local1674 < local1508 - local1018) {
									local1018 += local1595;
									local1518 = 2;
								}
								if (local1023 - local1508 > local1674) {
									local1520 = 1;
									local1023 -= local1595;
								} else if (local1508 - local1023 > local1674) {
									local1520 = 2;
									local1023 += local1595;
								}
							}
						} else if (local1538 == 2) {
							local1595 = (float) arg1.anIntArray403[local1180] / 256.0F;
							local1674 = (float) arg1.anIntArray411[local1180] / 256.0F;
							@Pc(1822) int local1822 = arg1.anIntArray407[local1550] - arg1.anIntArray407[local1545];
							@Pc(1832) int local1832 = arg1.anIntArray409[local1550] - arg1.anIntArray409[local1545];
							@Pc(1842) int local1842 = arg1.anIntArray405[local1550] - arg1.anIntArray405[local1545];
							@Pc(1853) int local1853 = arg1.anIntArray407[local1555] - arg1.anIntArray407[local1545];
							@Pc(1864) int local1864 = arg1.anIntArray409[local1555] - arg1.anIntArray409[local1545];
							@Pc(1874) int local1874 = arg1.anIntArray405[local1555] - arg1.anIntArray405[local1545];
							@Pc(1882) int local1882 = local1832 * local1874 - local1864 * local1842;
							@Pc(1890) int local1890 = local1842 * local1853 - local1822 * local1874;
							@Pc(1899) int local1899 = local1822 * local1864 - local1832 * local1853;
							local1907 = 64.0F / (float) arg1.anIntArray402[local1180];
							local1915 = 64.0F / (float) arg1.anIntArray404[local1180];
							local1923 = 64.0F / (float) arg1.anIntArray412[local1180];
							local1946 = (local1571[1] * (float) local1890 + local1571[0] * (float) local1882 + (float) local1899 * local1571[2]) / local1907;
							local1969 = ((float) local1899 * local1571[5] + local1571[3] * (float) local1882 + (float) local1890 * local1571[4]) / local1915;
							local1992 = (local1571[6] * (float) local1882 + local1571[7] * (float) local1890 + local1571[8] * (float) local1899) / local1923;
							local1522 = Static375.method5042(local1992, local1946, local1969);
							Static583.method7798(local1522, local1567, local1559, arg1.anIntArray409[local1545], arg1.anIntArray405[local1545], local1595, local1571, local1584, local1576, arg1.anIntArray407[local1545], local1563, local1674);
							local1508 = Static498.aFloat203;
							local1506 = Static227.aFloat110;
							Static583.method7798(local1522, local1567, local1559, arg1.anIntArray409[local1550], arg1.anIntArray405[local1550], local1595, local1571, local1584, local1576, arg1.anIntArray407[local1550], local1563, local1674);
							local1018 = Static498.aFloat203;
							local1510 = Static227.aFloat110;
							Static583.method7798(local1522, local1567, local1559, arg1.anIntArray409[local1555], arg1.anIntArray405[local1555], local1595, local1571, local1584, local1576, arg1.anIntArray407[local1555], local1563, local1674);
							local1047 = Static227.aFloat110;
							local1023 = Static498.aFloat203;
						} else if (local1538 == 3) {
							Static37.method515(arg1.anIntArray405[local1545], local1567, local1576, local1559, arg1.anIntArray409[local1545], arg1.anIntArray407[local1545], local1584, local1563, local1571);
							local1506 = Static111.aFloat30;
							local1508 = Static88.aFloat18;
							Static37.method515(arg1.anIntArray405[local1550], local1567, local1576, local1559, arg1.anIntArray409[local1550], arg1.anIntArray407[local1550], local1584, local1563, local1571);
							local1018 = Static88.aFloat18;
							local1510 = Static111.aFloat30;
							Static37.method515(arg1.anIntArray405[local1555], local1567, local1576, local1559, arg1.anIntArray409[local1555], arg1.anIntArray407[local1555], local1584, local1563, local1571);
							local1023 = Static88.aFloat18;
							local1047 = Static111.aFloat30;
							if ((local1576 & 0x1) == 0) {
								if (local1047 - local1506 > 0.5F) {
									local1047--;
									local1520 = 1;
								} else if (local1506 - local1047 > 0.5F) {
									local1520 = 2;
									local1047++;
								}
								if (local1510 - local1506 > 0.5F) {
									local1518 = 1;
									local1510--;
								} else if (local1506 - local1510 > 0.5F) {
									local1518 = 2;
									local1510++;
								}
							} else {
								if (local1023 - local1508 > 0.5F) {
									local1520 = 1;
									local1023--;
								} else if (local1508 - local1023 > 0.5F) {
									local1520 = 2;
									local1023++;
								}
								if (local1018 - local1508 > 0.5F) {
									local1518 = 1;
									local1018--;
								} else if (local1508 - local1018 > 0.5F) {
									local1018++;
									local1518 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray57 == null) {
				local1538 = 0;
			} else {
				local1538 = arg1.aByteArray57[local1459];
			}
			if (local1538 == 0) {
				@Pc(2815) long local2815 = ((long) local750 + (long) (local1466 << 8) + (long) (local1522 << 24) << 32) + (long) (local1180 << 2);
				local1555 = arg1.aShortArray89[local1459];
				local2294 = arg1.aShortArray93[local1459];
				local2299 = arg1.aShortArray84[local1459];
				@Pc(2834) Class292 local2834 = local442[local1555];
				this.aShortArray115[local1453] = this.method5930(local2834.anInt7853, local1506, local2834.anInt7852, local2815, local2834.anInt7849, local1508, local2834.anInt7850, arg1, local1555);
				@Pc(2858) Class292 local2858 = local442[local2294];
				this.aShortArray119[local1453] = this.method5930(local2858.anInt7853, local1510, local2858.anInt7852, (long) local1518 + local2815, local2858.anInt7849, local1018, local2858.anInt7850, arg1, local2294);
				@Pc(2885) Class292 local2885 = local442[local2299];
				this.aShortArray122[local1453] = this.method5930(local2885.anInt7853, local1047, local2885.anInt7852, (long) local1520 + local2815, local2885.anInt7849, local1023, local2885.anInt7850, arg1, local2299);
			} else if (local1538 == 1) {
				@Pc(2676) Class10 local2676 = local1140[local1459];
				@Pc(2721) long local2721 = (long) ((local2676.anInt193 <= 0 ? 2048 : 1024) + (local1180 << 2) + (local2676.anInt197 + 256 << 12) + (local2676.anInt194 + 256 << 22)) + ((long) (local1466 << 8) + (long) (local1522 << 24) + (long) local750 << 32);
				this.aShortArray115[local1453] = this.method5930(0, local1506, local2676.anInt197, local2721, local2676.anInt193, local1508, local2676.anInt194, arg1, arg1.aShortArray89[local1459]);
				this.aShortArray119[local1453] = this.method5930(0, local1510, local2676.anInt197, (long) local1518 + local2721, local2676.anInt193, local1018, local2676.anInt194, arg1, arg1.aShortArray93[local1459]);
				this.aShortArray122[local1453] = this.method5930(0, local1047, local2676.anInt197, (long) local1520 + local2721, local2676.anInt193, local1023, local2676.anInt194, arg1, arg1.aShortArray84[local1459]);
			}
			if (arg1.aShortArray88 == null) {
				this.aShortArray121[local1453] = -1;
			} else {
				this.aShortArray121[local1453] = arg1.aShortArray88[local1459];
			}
			if (arg1.aByteArray61 != null) {
				this.aByteArray86[local1453] = arg1.aByteArray61[local1459];
			}
			if (arg1.aShortArray90 != null) {
				this.aShortArray116[local1453] = arg1.aShortArray90[local1459];
			}
			this.aShortArray123[local1453] = arg1.aShortArray87[local1459];
		}
		local1459 = 0;
		local1159 = -10000;
		for (local1170 = 0; local1170 < this.anInt7446; local1170++) {
			@Pc(2978) short local2978 = this.aShortArray121[local1170];
			if (local2978 != local1159) {
				local1159 = local2978;
				local1459++;
			}
		}
		this.anIntArray571 = new int[local1459 + 1];
		local1459 = 0;
		local1159 = -10000;
		for (local1180 = 0; local1180 < this.anInt7446; local1180++) {
			@Pc(3008) short local3008 = this.aShortArray121[local1180];
			if (local3008 != local1159) {
				local1159 = local3008;
				this.anIntArray571[local1459++] = local1180;
			}
		}
		this.anIntArray571[local1459] = this.anInt7446;
		Static338.aLongArray25 = null;
		this.aShortArray114 = Static229.method3477(this.anInt7396, this.aShortArray114);
		this.aShortArray124 = Static229.method3477(this.anInt7396, this.aShortArray124);
		this.aShortArray120 = Static229.method3477(this.anInt7396, this.aShortArray120);
		this.aByteArray87 = Static482.method6525(this.aByteArray87, this.anInt7396);
		this.aFloatArray44 = Static10.method107(this.aFloatArray44, this.anInt7396);
		this.lb = Static10.method107(this.lb, this.anInt7396);
		if (arg1.anIntArray408 != null && Static516.method7177(this.anInt7444, arg2)) {
			this.anIntArrayArray160 = arg1.method4265(false);
		}
		if (arg1.aClass264Array1 != null && Static114.method1792(this.anInt7444, arg2)) {
			this.anIntArrayArray159 = arg1.method4266();
		}
		if (arg1.anIntArray410 != null && Static130.method2035(arg2, this.anInt7444)) {
			local750 = 0;
			@Pc(3131) int[] local3131 = new int[256];
			for (local804 = 0; local804 < this.anInt7408; local804++) {
				local817 = arg1.anIntArray410[local116[local804]];
				if (local817 >= 0) {
					@Pc(3148) int local3148 = local3131[local817]++;
					if (local817 > local750) {
						local750 = local817;
					}
				}
			}
			this.anIntArrayArray161 = new int[local750 + 1][];
			for (local817 = 0; local817 <= local750; local817++) {
				this.anIntArrayArray161[local817] = new int[local3131[local817]];
				local3131[local817] = 0;
			}
			for (local819 = 0; local819 < this.anInt7408; local819++) {
				local1241 = arg1.anIntArray410[local116[local819]];
				if (local1241 >= 0) {
					this.anIntArrayArray161[local1241][local3131[local1241]++] = local819;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean581) {
			this.method5926();
		}
		return this.aShort100;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "()V")
	@Override
	public void method7411() {
		if (this.anInt7396 <= 0 || this.anInt7446 <= 0) {
			return;
		}
		this.method5924(false);
		if ((this.aByte100 & 0x10) == 0 && this.aClass183_1.anInterface23_1 == null) {
			this.method5929(false);
		}
		this.method5919();
	}

	@OriginalMember(owner = "client!qf", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean581) {
			this.method5926();
		}
		return this.aShort98;
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "()V")
	@Override
	protected void method7428() {
	}

	@OriginalMember(owner = "client!qf", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7401; local3++) {
			if (arg0 != 0) {
				this.anIntArray570[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray567[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray568[local3] += arg2;
			}
		}
		this.aBoolean581 = false;
		if (this.aClass213_7 != null) {
			this.aClass213_7.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class63 method7417(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) Class63_Sub3 local22;
		@Pc(26) Class63_Sub3 local26;
		if (arg0 == 1) {
			local26 = this.aClass134_Sub2_32.aClass63_Sub3_7;
			local22 = this.aClass134_Sub2_32.aClass63_Sub3_4;
		} else if (arg0 == 2) {
			local22 = this.aClass134_Sub2_32.aClass63_Sub3_8;
			local26 = this.aClass134_Sub2_32.aClass63_Sub3_10;
		} else if (arg0 == 3) {
			local22 = this.aClass134_Sub2_32.aClass63_Sub3_3;
			local26 = this.aClass134_Sub2_32.aClass63_Sub3_2;
		} else if (arg0 == 4) {
			local22 = this.aClass134_Sub2_32.aClass63_Sub3_6;
			local26 = this.aClass134_Sub2_32.aClass63_Sub3_9;
		} else if (arg0 == 5) {
			local26 = this.aClass134_Sub2_32.aClass63_Sub3_5;
			local22 = this.aClass134_Sub2_32.aClass63_Sub3_1;
		} else {
			local22 = local26 = new Class63_Sub3(this.aClass134_Sub2_32);
		}
		return this.method5921(arg2, arg1, local26, arg0 != 0, local22);
	}

	@OriginalMember(owner = "client!qf", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean581) {
			this.method5926();
		}
		return this.aShort101;
	}

	@OriginalMember(owner = "client!qf", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7401; local7++) {
			if (arg0 != 128) {
				this.anIntArray570[local7] = this.anIntArray570[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray567[local7] = arg1 * this.anIntArray567[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray568[local7] = this.anIntArray568[local7] * arg2 >> 7;
			}
		}
		if (this.aClass213_7 != null) {
			this.aClass213_7.anInterface5_1 = null;
		}
		this.aBoolean581 = false;
	}

	@OriginalMember(owner = "client!qf", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7454; local3++) {
			this.anIntArray570[local3] = this.anIntArray570[local3] + 7 >> 4;
			this.anIntArray567[local3] = this.anIntArray567[local3] + 7 >> 4;
			this.anIntArray568[local3] = this.anIntArray568[local3] + 7 >> 4;
		}
		this.aBoolean581 = false;
		if (this.aClass213_7 != null) {
			this.aClass213_7.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean581) {
			this.method5926();
		}
		return this.aShort103;
	}

	@OriginalMember(owner = "client!qf", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean581) {
			this.method5926();
		}
		return this.aShort102;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt7408; local3++) {
			local12 = this.aShortArray123[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local24 -= -(arg3 * (arg1 - local24) >> 7);
			}
			@Pc(57) int local57 = local12 & 0x7F;
			if (arg2 != -1) {
				local57 += arg3 * (arg2 - local57) >> 7;
			}
			this.aShortArray123[local3] = (short) (local57 | local24 << 7 | local18 << 10);
		}
		if (this.aClass287Array1 != null) {
			for (local12 = 0; local12 < this.anInt7426; local12++) {
				@Pc(111) Class287 local111 = this.aClass287Array1[local12];
				@Pc(116) Class166 local116 = this.aClass166Array1[local12];
				local116.anInt4316 = local116.anInt4316 & 0xFF000000 | Static379.anIntArray506[this.aShortArray123[local111.anInt7742] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass213_9 != null) {
			this.aClass213_9.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort105;
	}

	@OriginalMember(owner = "client!qf", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean582;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) boolean arg3) {
		return this.method5934(-1, arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method5918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg4 && arg3 > arg2 && arg2 < arg1) {
			return false;
		} else if (arg2 > arg4 && arg3 < arg2 && arg1 < arg2) {
			return false;
		} else if (arg5 < arg7 && arg5 < arg6 && arg0 > arg5) {
			return false;
		} else {
			return arg5 <= arg7 || arg6 >= arg5 || arg0 >= arg5;
		}
	}

	@OriginalMember(owner = "client!qf", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static38.anInt604 = 0;
			Static243.anInt4477 = 0;
			local16 = 0;
			Static420.anInt7307 = 0;
			for (local20 = 0; local20 < this.anInt7401; local20++) {
				Static38.anInt604 += this.anIntArray570[local20];
				Static243.anInt4477 += this.anIntArray567[local20];
				Static420.anInt7307 += this.anIntArray568[local20];
				local16++;
			}
			if (local16 > 0) {
				Static420.anInt7307 = Static420.anInt7307 / local16 + arg3;
				Static38.anInt604 = Static38.anInt604 / local16 + arg1;
				Static243.anInt4477 = arg2 + Static243.anInt4477 / local16;
			} else {
				Static38.anInt604 = arg1;
				Static243.anInt4477 = arg2;
				Static420.anInt7307 = arg3;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt7401; local16++) {
				this.anIntArray570[local16] += arg1;
				this.anIntArray567[local16] += arg2;
				this.anIntArray568[local16] += arg3;
			}
		} else {
			@Pc(159) int local159;
			@Pc(177) int local177;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt7401; local16++) {
					this.anIntArray570[local16] -= Static38.anInt604;
					this.anIntArray567[local16] -= Static243.anInt4477;
					this.anIntArray568[local16] -= Static420.anInt7307;
					if (arg3 != 0) {
						local20 = Class1_Sub6_Sub2.anIntArray675[arg3];
						local159 = Class1_Sub6_Sub2.anIntArray676[arg3];
						local177 = local159 * this.anIntArray570[local16] + local20 * this.anIntArray567[local16] + 16383 >> 14;
						this.anIntArray567[local16] = local159 * this.anIntArray567[local16] + 16383 - local20 * this.anIntArray570[local16] >> 14;
						this.anIntArray570[local16] = local177;
					}
					if (arg1 != 0) {
						local20 = Class1_Sub6_Sub2.anIntArray675[arg1];
						local159 = Class1_Sub6_Sub2.anIntArray676[arg1];
						local177 = this.anIntArray567[local16] * local159 + 16383 - this.anIntArray568[local16] * local20 >> 14;
						this.anIntArray568[local16] = this.anIntArray568[local16] * local159 + local20 * this.anIntArray567[local16] + 16383 >> 14;
						this.anIntArray567[local16] = local177;
					}
					if (arg2 != 0) {
						local20 = Class1_Sub6_Sub2.anIntArray675[arg2];
						local159 = Class1_Sub6_Sub2.anIntArray676[arg2];
						local177 = local20 * this.anIntArray568[local16] + this.anIntArray570[local16] * local159 + 16383 >> 14;
						this.anIntArray568[local16] = local159 * this.anIntArray568[local16] + 16383 - local20 * this.anIntArray570[local16] >> 14;
						this.anIntArray570[local16] = local177;
					}
					this.anIntArray570[local16] += Static38.anInt604;
					this.anIntArray567[local16] += Static243.anInt4477;
					this.anIntArray568[local16] += Static420.anInt7307;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt7401; local16++) {
					this.anIntArray570[local16] -= Static38.anInt604;
					this.anIntArray567[local16] -= Static243.anInt4477;
					this.anIntArray568[local16] -= Static420.anInt7307;
					this.anIntArray570[local16] = arg1 * this.anIntArray570[local16] / 128;
					this.anIntArray567[local16] = arg2 * this.anIntArray567[local16] / 128;
					this.anIntArray568[local16] = arg3 * this.anIntArray568[local16] / 128;
					this.anIntArray570[local16] += Static38.anInt604;
					this.anIntArray567[local16] += Static243.anInt4477;
					this.anIntArray568[local16] += Static420.anInt7307;
				}
			} else {
				@Pc(511) Class287 local511;
				@Pc(516) Class166 local516;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt7408; local16++) {
						local20 = arg1 * 8 + (this.aByteArray86[local16] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray86[local16] = (byte) local20;
					}
					if (this.aClass213_9 != null) {
						this.aClass213_9.anInterface5_1 = null;
					}
					if (this.aClass287Array1 != null) {
						for (local20 = 0; local20 < this.anInt7426; local20++) {
							local511 = this.aClass287Array1[local20];
							local516 = this.aClass166Array1[local20];
							local516.anInt4316 = 255 - (this.aByteArray86[local511.anInt7742] & 0xFF) << 24 | local516.anInt4316 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt7408; local16++) {
						local20 = this.aShortArray123[local16] & 0xFFFF;
						local159 = local20 >> 10 & 0x3F;
						local177 = local20 >> 7 & 0x7;
						local177 += arg2 / 4;
						@Pc(578) int local578 = local20 & 0x7F;
						@Pc(584) int local584 = arg1 + local159 & 0x3F;
						if (local177 < 0) {
							local177 = 0;
						} else if (local177 > 7) {
							local177 = 7;
						}
						local578 += arg3;
						if (local578 < 0) {
							local578 = 0;
						} else if (local578 > 127) {
							local578 = 127;
						}
						this.aShortArray123[local16] = (short) (local578 | local584 << 10 | local177 << 7);
					}
					if (this.aClass213_9 != null) {
						this.aClass213_9.anInterface5_1 = null;
					}
					if (this.aClass287Array1 != null) {
						for (local20 = 0; local20 < this.anInt7426; local20++) {
							local511 = this.aClass287Array1[local20];
							local516 = this.aClass166Array1[local20];
							local516.anInt4316 = local516.anInt4316 & 0xFF000000 | Static379.anIntArray506[this.aShortArray123[local511.anInt7742] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(695) Class166 local695;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt7426; local16++) {
							local695 = this.aClass166Array1[local16];
							local695.anInt4307 += arg2;
							local695.anInt4315 += arg1;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt7426; local16++) {
							local695 = this.aClass166Array1[local16];
							local695.anInt4312 = local695.anInt4312 * arg1 >> 7;
							local695.anInt4308 = local695.anInt4308 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt7426; local16++) {
							local695 = this.aClass166Array1[local16];
							local695.anInt4310 = arg1 + local695.anInt4310 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		if (this.aClass213_9 != null) {
			this.aClass213_9.anInterface5_1 = null;
		}
		this.aShort105 = (short) arg0;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
	private void method5919() {
		if (!this.aBoolean583) {
			return;
		}
		this.aBoolean583 = false;
		if (this.aClass206Array4 == null && this.aClass158Array4 == null && this.aClass287Array1 == null) {
			if (this.anIntArray570 != null && !Static492.method7375(this.anInt7455, this.anInt7444)) {
				if (this.aClass213_7 != null && this.aClass213_7.anInterface5_1 == null) {
					this.aBoolean583 = true;
				} else {
					if (!this.aBoolean581) {
						this.method5926();
					}
					this.anIntArray570 = null;
				}
			}
			if (this.anIntArray567 != null && !Static75.method7432(this.anInt7444, this.anInt7455)) {
				if (this.aClass213_7 != null && this.aClass213_7.anInterface5_1 == null) {
					this.aBoolean583 = true;
				} else {
					if (!this.aBoolean581) {
						this.method5926();
					}
					this.anIntArray567 = null;
				}
			}
			if (this.anIntArray568 != null && !Static576.method7739(this.anInt7455, this.anInt7444)) {
				if (this.aClass213_7 != null && this.aClass213_7.anInterface5_1 == null) {
					this.aBoolean583 = true;
				} else {
					if (!this.aBoolean581) {
						this.method5926();
					}
					this.anIntArray568 = null;
				}
			}
		}
		if (this.aShortArray118 != null && this.anIntArray570 == null && this.anIntArray567 == null && this.anIntArray568 == null) {
			this.anIntArray569 = null;
			this.aShortArray118 = null;
		}
		if (this.aByteArray87 != null && !Static454.method6260(this.anInt7444, this.anInt7455)) {
			if (this.aClass213_10 == null) {
				if (this.aClass213_9 != null && this.aClass213_9.anInterface5_1 == null) {
					this.aBoolean583 = true;
				} else {
					this.aShortArray114 = this.aShortArray124 = this.aShortArray120 = null;
					this.aByteArray87 = null;
				}
			} else if (this.aClass213_10.anInterface5_1 == null) {
				this.aBoolean583 = true;
			} else {
				this.aShortArray114 = this.aShortArray124 = this.aShortArray120 = null;
				this.aByteArray87 = null;
			}
		}
		if (this.aShortArray123 != null && !Static281.method3943(this.anInt7444, this.anInt7455)) {
			if (this.aClass213_9 != null && this.aClass213_9.anInterface5_1 == null) {
				this.aBoolean583 = true;
			} else {
				this.aShortArray123 = null;
			}
		}
		if (this.aByteArray86 != null && !Static276.method3884(this.anInt7444, this.anInt7455)) {
			if (this.aClass213_9 != null && this.aClass213_9.anInterface5_1 == null) {
				this.aBoolean583 = true;
			} else {
				this.aByteArray86 = null;
			}
		}
		if (this.aFloatArray44 != null && !Static194.method2958(this.anInt7455, this.anInt7444)) {
			if (this.aClass213_8 != null && this.aClass213_8.anInterface5_1 == null) {
				this.aBoolean583 = true;
			} else {
				this.aFloatArray44 = this.lb = null;
			}
		}
		if (this.aShortArray121 != null && !Static25.method283(this.anInt7444, this.anInt7455)) {
			if (this.aClass213_9 != null && this.aClass213_9.anInterface5_1 == null) {
				this.aBoolean583 = true;
			} else {
				this.aShortArray121 = null;
			}
		}
		if (this.aShortArray115 != null && !Static124.method5297(this.anInt7455, this.anInt7444)) {
			if ((this.aClass183_1 == null || this.aClass183_1.anInterface23_1 != null) && (this.aClass213_9 == null || this.aClass213_9.anInterface5_1 != null)) {
				this.aShortArray115 = this.aShortArray119 = this.aShortArray122 = null;
			} else {
				this.aBoolean583 = true;
			}
		}
		if (this.anIntArrayArray161 != null && !Static130.method2035(this.anInt7455, this.anInt7444)) {
			this.anIntArrayArray161 = null;
			this.aShortArray116 = null;
		}
		if (this.anIntArrayArray160 != null && !Static516.method7177(this.anInt7444, this.anInt7455)) {
			this.aShortArray117 = null;
			this.anIntArrayArray160 = null;
		}
		if (this.anIntArrayArray159 != null && !Static114.method1792(this.anInt7444, this.anInt7455)) {
			this.anIntArrayArray159 = null;
		}
		if (this.anIntArray571 != null && (this.anInt7455 & 0x800) == 0 && (this.anInt7455 & 0x40000) == 0) {
			this.anIntArray571 = null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7408; local7++) {
			if (this.aShortArray123[local7] == arg0) {
				this.aShortArray123[local7] = arg1;
			}
		}
		if (this.aClass287Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt7426; local30++) {
				@Pc(37) Class287 local37 = this.aClass287Array1[local30];
				@Pc(42) Class166 local42 = this.aClass166Array1[local30];
				local42.anInt4316 = Static379.anIntArray506[this.aShortArray123[local37.anInt7742] & 0xFFFF] & 0xFFFFFF | local42.anInt4316 & 0xFF000000;
			}
		}
		if (this.aClass213_9 != null) {
			this.aClass213_9.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) Class47 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean581) {
			this.method5926();
		}
		@Pc(16) int local16 = this.aShort103 + arg4;
		@Pc(22) int local22 = arg4 + this.aShort97;
		@Pc(27) int local27 = this.aShort96 + arg6;
		@Pc(32) int local32 = this.aShort101 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9209 <= arg2.anInt9208 + local22 >> arg2.anInt9205 || local27 < 0 || arg2.anInt9208 + local32 >> arg2.anInt9205 >= arg2.anInt9210)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9208 + local22 >> arg3.anInt9205 >= arg3.anInt9209 || local27 < 0 || local32 + arg3.anInt9208 >> arg3.anInt9205 >= arg3.anInt9210) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9205;
			local22 = arg2.anInt9208 + local22 - 1 >> arg2.anInt9205;
			local27 >>= arg2.anInt9205;
			local32 = arg2.anInt9208 + local32 - 1 >> arg2.anInt9205;
			if (arg2.method7545(local16, local27) == arg5 && arg5 == arg2.method7545(local22, local27) && arg5 == arg2.method7545(local16, local32) && arg2.method7545(local22, local32) == arg5) {
				return;
			}
		}
		@Pc(199) int local199;
		if (arg0 == 1) {
			for (local199 = 0; local199 < this.anInt7401; local199++) {
				this.anIntArray567[local199] = this.anIntArray567[local199] + arg2.method7550(arg4 + this.anIntArray570[local199], this.anIntArray568[local199] - -arg6) - arg5;
			}
		} else {
			@Pc(253) int local253;
			@Pc(264) int local264;
			if (arg0 == 2) {
				@Pc(245) short local245 = this.aShort100;
				if (local245 == 0) {
					return;
				}
				for (local253 = 0; local253 < this.anInt7401; local253++) {
					local264 = (this.anIntArray567[local253] << 16) / local245;
					if (local264 < arg1) {
						this.anIntArray567[local253] += (arg2.method7550(this.anIntArray570[local253] + arg4, arg6 + this.anIntArray568[local253]) - arg5) * (-local264 + arg1) / arg1;
					}
				}
			} else {
				@Pc(346) int local346;
				if (arg0 == 3) {
					local199 = (arg1 & 0xFF) * 4;
					local253 = (arg1 >> 8 & 0xFF) * 4;
					local264 = (arg1 >> 16 & 0xFF) << 6;
					local346 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local199 >> 1) < 0 || arg2.anInt9209 << arg2.anInt9205 <= arg4 + (local199 >> 1) + arg2.anInt9208 || arg6 - (local253 >> 1) < 0 || arg2.anInt9210 << arg2.anInt9205 <= arg2.anInt9208 + arg6 + (local253 >> 1)) {
						return;
					}
					this.method7427(local199, local253, local264, arg4, arg5, arg2, local346, arg6);
				} else if (arg0 == 4) {
					local199 = this.aShort102 - this.aShort100;
					for (local253 = 0; local253 < this.anInt7401; local253++) {
						this.anIntArray567[local253] = this.anIntArray567[local253] + arg3.method7550(this.anIntArray570[local253] + arg4, arg6 + this.anIntArray568[local253]) + local199 - arg5;
					}
				} else if (arg0 == 5) {
					local199 = this.aShort102 - this.aShort100;
					for (local253 = 0; local253 < this.anInt7401; local253++) {
						local264 = arg4 + this.anIntArray570[local253];
						local346 = this.anIntArray568[local253] + arg6;
						@Pc(451) int local451 = arg2.method7550(local264, local346);
						@Pc(457) int local457 = arg3.method7550(local264, local346);
						@Pc(464) int local464 = local451 - arg1 - local457;
						this.anIntArray567[local253] = local451 + ((this.anIntArray567[local253] << 8) / local199 * local464 >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean581 = false;
		if (this.aClass213_7 != null) {
			this.aClass213_7.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BIISI)I")
	private int method5920(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		@Pc(12) int local12 = Static379.anIntArray506[Static463.method6384(arg2, arg1)];
		if (arg3 != -1) {
			@Pc(30) Class3 local30 = this.aClass134_Sub2_32.anInterface7_10.method3874(arg3 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte2 & 0xFF;
			@Pc(47) int local47;
			@Pc(76) int local76;
			if (local35 != 0) {
				if (arg1 < 0) {
					local47 = 0;
				} else if (arg1 > 127) {
					local47 = 16777215;
				} else {
					local47 = arg1 * 131586;
				}
				if (local35 == 256) {
					local12 = local47;
				} else {
					local76 = 256 - local35;
					local12 = (local76 * (local12 & 0xFF00) + local35 * (local47 & 0xFF00) & 0xFF0000) + ((local12 & 0xFF00FF) * local76 + local35 * (local47 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local47 = local30.aByte5 & 0xFF;
			if (local47 != 0) {
				local47 += 256;
				@Pc(122) int local122 = (local12 >> 16 & 0xFF) * local47;
				if (local122 > 65535) {
					local122 = 65535;
				}
				local76 = (local12 >> 8 & 0xFF) * local47;
				if (local76 > 65535) {
					local76 = 65535;
				}
				@Pc(148) int local148 = local47 * (local12 & 0xFF);
				if (local148 > 65535) {
					local148 = 65535;
				}
				local12 = (local148 >> 8) + (local76 & 0xFF00) + (local122 << 8 & 0xFF005A);
			}
		}
		return (local12 << 8) - ((arg0 & 0xFF) - 255);
	}

	@OriginalMember(owner = "client!qf", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray160 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7454; local12++) {
			this.anIntArray570[local12] <<= 0x4;
			this.anIntArray567[local12] <<= 0x4;
			this.anIntArray568[local12] <<= 0x4;
		}
		Static38.anInt604 = 0;
		Static420.anInt7307 = 0;
		Static243.anInt4477 = 0;
		return true;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7423(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class63_Sub3 local8 = (Class63_Sub3) arg0;
		if (this.anInt7408 == 0 || local8.anInt7408 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt7401;
		@Pc(21) int[] local21 = local8.anIntArray570;
		@Pc(24) int[] local24 = local8.anIntArray567;
		@Pc(27) int[] local27 = local8.anIntArray568;
		@Pc(30) short[] local30 = local8.aShortArray114;
		@Pc(33) short[] local33 = local8.aShortArray124;
		@Pc(36) short[] local36 = local8.aShortArray120;
		@Pc(39) byte[] local39 = local8.aByteArray87;
		@Pc(46) short[] local46;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(50) byte[] local50;
		if (this.aClass259_1 == null) {
			local44 = null;
			local46 = null;
			local48 = null;
			local50 = null;
		} else {
			local50 = this.aClass259_1.aByteArray84;
			local48 = this.aClass259_1.aShortArray112;
			local46 = this.aClass259_1.aShortArray111;
			local44 = this.aClass259_1.aShortArray113;
		}
		@Pc(77) short[] local77;
		@Pc(79) short[] local79;
		@Pc(73) short[] local73;
		@Pc(75) byte[] local75;
		if (local8.aClass259_1 == null) {
			local73 = null;
			local75 = null;
			local77 = null;
			local79 = null;
		} else {
			local79 = local8.aClass259_1.aShortArray113;
			local75 = local8.aClass259_1.aByteArray84;
			local73 = local8.aClass259_1.aShortArray112;
			local77 = local8.aClass259_1.aShortArray111;
		}
		@Pc(100) int[] local100 = local8.anIntArray569;
		@Pc(103) short[] local103 = local8.aShortArray118;
		if (!local8.aBoolean581) {
			local8.method5926();
		}
		@Pc(112) short local112 = local8.aShort100;
		@Pc(115) short local115 = local8.aShort102;
		@Pc(118) short local118 = local8.aShort103;
		@Pc(121) short local121 = local8.aShort97;
		@Pc(124) short local124 = local8.aShort96;
		@Pc(127) short local127 = local8.aShort101;
		for (@Pc(129) int local129 = 0; local129 < this.anInt7401; local129++) {
			@Pc(138) int local138 = this.anIntArray567[local129] - arg2;
			if (local138 >= local112 && local138 <= local115) {
				@Pc(158) int local158 = this.anIntArray570[local129] - arg1;
				if (local158 >= local118 && local158 <= local121) {
					@Pc(182) int local182 = this.anIntArray568[local129] - arg3;
					if (local182 >= local124 && local182 <= local127) {
						@Pc(196) int local196 = -1;
						@Pc(201) int local201 = this.anIntArray569[local129];
						@Pc(208) int local208 = this.anIntArray569[local129 + 1];
						for (@Pc(210) int local210 = local201; local210 < local208; local210++) {
							local196 = this.aShortArray118[local210] - 1;
							if (local196 == -1 || this.aByteArray87[local196] != 0) {
								break;
							}
						}
						if (local196 != -1) {
							for (@Pc(244) int local244 = 0; local244 < local18; local244++) {
								if (local21[local244] == local158 && local182 == local27[local244] && local24[local244] == local138) {
									@Pc(263) int local263 = -1;
									local201 = local100[local244];
									local208 = local100[local244 + 1];
									for (@Pc(275) int local275 = local201; local275 < local208; local275++) {
										local263 = local103[local275] - 1;
										if (local263 == -1 || local39[local263] != 0) {
											break;
										}
									}
									if (local263 != -1) {
										if (local46 == null) {
											this.aClass259_1 = new Class259();
											local46 = this.aClass259_1.aShortArray111 = Static157.method2281(this.aShortArray114);
											local44 = this.aClass259_1.aShortArray113 = Static157.method2281(this.aShortArray124);
											local48 = this.aClass259_1.aShortArray112 = Static157.method2281(this.aShortArray120);
											local50 = this.aClass259_1.aByteArray84 = Static292.method4110(this.aByteArray87);
										}
										if (local77 == null) {
											@Pc(357) Class259 local357 = local8.aClass259_1 = new Class259();
											local77 = local357.aShortArray111 = Static157.method2281(local30);
											local79 = local357.aShortArray113 = Static157.method2281(local33);
											local73 = local357.aShortArray112 = Static157.method2281(local36);
											local75 = local357.aByteArray84 = Static292.method4110(local39);
										}
										@Pc(390) short local390 = this.aShortArray114[local196];
										@Pc(395) short local395 = this.aShortArray124[local196];
										@Pc(400) short local400 = this.aShortArray120[local196];
										local201 = local100[local244];
										@Pc(409) byte local409 = this.aByteArray87[local196];
										local208 = local100[local244 + 1];
										@Pc(425) int local425;
										for (@Pc(417) int local417 = local201; local417 < local208; local417++) {
											local425 = local103[local417] - 1;
											if (local425 == -1) {
												break;
											}
											if (local75[local425] != 0) {
												local77[local425] += local390;
												local79[local425] += local395;
												local73[local425] += local400;
												local75[local425] += local409;
											}
										}
										local400 = local36[local263];
										local409 = local39[local263];
										local390 = local30[local263];
										local201 = this.anIntArray569[local129];
										local208 = this.anIntArray569[local129 + 1];
										local395 = local33[local263];
										for (local425 = local201; local425 < local208; local425++) {
											@Pc(511) int local511 = this.aShortArray118[local425] - 1;
											if (local511 == -1) {
												break;
											}
											if (local50[local511] != 0) {
												local46[local511] += local390;
												local44[local511] += local395;
												local48[local511] += local400;
												local50[local511] += local409;
											}
										}
										if (this.aClass213_10 == null && this.aClass213_9 != null) {
											this.aClass213_9.anInterface5_1 = null;
										}
										if (this.aClass213_10 != null) {
											this.aClass213_10.anInterface5_1 = null;
										}
										if (local8.aClass213_10 == null && local8.aClass213_9 != null) {
											local8.aClass213_9.anInterface5_1 = null;
										}
										if (local8.aClass213_10 != null) {
											local8.aClass213_10.anInterface5_1 = null;
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

	@OriginalMember(owner = "client!qf", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub6_Sub2.anIntArray675[arg0];
		@Pc(13) int local13 = Class1_Sub6_Sub2.anIntArray676[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7401; local15++) {
			local33 = local13 * this.anIntArray570[local15] + local9 * this.anIntArray568[local15] >> 14;
			this.anIntArray568[local15] = this.anIntArray568[local15] * local13 - this.anIntArray570[local15] * local9 >> 14;
			this.anIntArray570[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7396; local33++) {
			@Pc(88) int local88 = this.aShortArray120[local33] * local9 + this.aShortArray114[local33] * local13 >> 14;
			this.aShortArray120[local33] = (short) (this.aShortArray120[local33] * local13 - local9 * this.aShortArray114[local33] >> 14);
			this.aShortArray114[local33] = (short) local88;
		}
		if (this.aClass213_10 == null && this.aClass213_9 != null) {
			this.aClass213_9.anInterface5_1 = null;
		}
		if (this.aClass213_10 != null) {
			this.aClass213_10.anInterface5_1 = null;
		}
		if (this.aClass213_7 != null) {
			this.aClass213_7.anInterface5_1 = null;
		}
		this.aBoolean581 = false;
	}

	@OriginalMember(owner = "client!qf", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub6_Sub2.anIntArray675[arg0];
		@Pc(13) int local13 = Class1_Sub6_Sub2.anIntArray676[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7401; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray567[local15] - this.anIntArray568[local15] * local9 >> 14;
			this.anIntArray568[local15] = local13 * this.anIntArray568[local15] + local9 * this.anIntArray567[local15] >> 14;
			this.anIntArray567[local15] = local34;
		}
		if (this.aClass213_7 != null) {
			this.aClass213_7.anInterface5_1 = null;
		}
		this.aBoolean581 = false;
	}

	@OriginalMember(owner = "client!qf", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub6_Sub2.anIntArray675[arg0];
		@Pc(13) int local13 = Class1_Sub6_Sub2.anIntArray676[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7401; local15++) {
			@Pc(33) int local33 = this.anIntArray570[local15] * local13 + local9 * this.anIntArray568[local15] >> 14;
			this.anIntArray568[local15] = this.anIntArray568[local15] * local13 - local9 * this.anIntArray570[local15] >> 14;
			this.anIntArray570[local15] = local33;
		}
		if (this.aClass213_7 != null) {
			this.aClass213_7.anInterface5_1 = null;
		}
		this.aBoolean581 = false;
	}

	@OriginalMember(owner = "client!qf", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		this.anInt7455 = arg0;
		this.aBoolean583 = true;
		if (this.aClass259_1 != null && (this.anInt7455 & 0x10000) == 0) {
			this.aShortArray120 = this.aClass259_1.aShortArray112;
			this.aShortArray124 = this.aClass259_1.aShortArray113;
			this.aByteArray87 = this.aClass259_1.aByteArray84;
			this.aShortArray114 = this.aClass259_1.aShortArray111;
			this.aClass259_1 = null;
		}
		this.method5919();
	}

	@OriginalMember(owner = "client!qf", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort99;
	}

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			local27 = 0;
			Static420.anInt7307 = 0;
			Static38.anInt604 = 0;
			Static243.anInt4477 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray160.length) {
					local51 = this.anIntArrayArray160[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray117 == null || (this.aShortArray117[local59] & arg6) != 0) {
							Static38.anInt604 += this.anIntArray570[local59];
							Static243.anInt4477 += this.anIntArray567[local59];
							Static420.anInt7307 += this.anIntArray568[local59];
							local27++;
						}
					}
				}
			}
			if (local27 > 0) {
				Static38.anInt604 = arg2 + Static38.anInt604 / local27;
				Static243.anInt4477 = arg3 + Static243.anInt4477 / local27;
				Static20.aBoolean25 = true;
				Static420.anInt7307 = Static420.anInt7307 / local27 + arg4;
			} else {
				Static38.anInt604 = arg2;
				Static243.anInt4477 = arg3;
				Static420.anInt7307 = arg4;
			}
			return;
		}
		@Pc(246) int[] local246;
		@Pc(248) int local248;
		if (arg0 == 1) {
			if (arg7 != null) {
				local27 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
				local35 = arg7[3] * arg2 + arg3 * arg7[4] + arg7[5] * arg4 + 8192 >> 14;
				local41 = arg2 * arg7[6] + arg7[7] * arg3 + arg4 * arg7[8] + 8192 >> 14;
				arg2 = local27;
				arg3 = local35;
				arg4 = local41;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray160.length) {
					local246 = this.anIntArrayArray160[local35];
					for (local248 = 0; local248 < local246.length; local248++) {
						local53 = local246[local248];
						if (this.aShortArray117 == null || (this.aShortArray117[local53] & arg6) != 0) {
							this.anIntArray570[local53] += arg2;
							this.anIntArray567[local53] += arg3;
							this.anIntArray568[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(364) int local364;
		@Pc(386) int local386;
		@Pc(412) int local412;
		@Pc(443) int local443;
		@Pc(447) int local447;
		@Pc(451) int local451;
		@Pc(455) int local455;
		@Pc(463) int local463;
		@Pc(471) int local471;
		@Pc(627) int local627;
		@Pc(652) int local652;
		@Pc(656) int local656;
		@Pc(664) int local664;
		@Pc(669) int local669;
		@Pc(673) int local673;
		@Pc(677) int local677;
		@Pc(679) int local679;
		@Pc(811) int[] local811;
		@Pc(813) int local813;
		@Pc(817) int local817;
		@Pc(821) int local821;
		@Pc(823) int local823;
		@Pc(953) int local953;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (local35 < this.anIntArrayArray160.length) {
						local246 = this.anIntArrayArray160[local35];
						for (local248 = 0; local248 < local246.length; local248++) {
							local53 = local246[local248];
							if (this.aShortArray117 == null || (arg6 & this.aShortArray117[local53]) != 0) {
								this.anIntArray570[local53] -= Static38.anInt604;
								this.anIntArray567[local53] -= Static243.anInt4477;
								this.anIntArray568[local53] -= Static420.anInt7307;
								if (arg4 != 0) {
									local59 = Class1_Sub6_Sub2.anIntArray675[arg4];
									local364 = Class1_Sub6_Sub2.anIntArray676[arg4];
									local386 = this.anIntArray570[local53] * local364 + local59 * this.anIntArray567[local53] + 16383 >> 14;
									this.anIntArray567[local53] = local364 * this.anIntArray567[local53] + 16383 - local59 * this.anIntArray570[local53] >> 14;
									this.anIntArray570[local53] = local386;
								}
								if (arg2 != 0) {
									local59 = Class1_Sub6_Sub2.anIntArray675[arg2];
									local364 = Class1_Sub6_Sub2.anIntArray676[arg2];
									local386 = local364 * this.anIntArray567[local53] + 16383 - this.anIntArray568[local53] * local59 >> 14;
									this.anIntArray568[local53] = local59 * this.anIntArray567[local53] + this.anIntArray568[local53] * local364 + 16383 >> 14;
									this.anIntArray567[local53] = local386;
								}
								if (arg3 != 0) {
									local59 = Class1_Sub6_Sub2.anIntArray675[arg3];
									local364 = Class1_Sub6_Sub2.anIntArray676[arg3];
									local386 = this.anIntArray568[local53] * local59 + local364 * this.anIntArray570[local53] + 16383 >> 14;
									this.anIntArray568[local53] = this.anIntArray568[local53] * local364 + 16383 - local59 * this.anIntArray570[local53] >> 14;
									this.anIntArray570[local53] = local386;
								}
								this.anIntArray570[local53] += Static38.anInt604;
								this.anIntArray567[local53] += Static243.anInt4477;
								this.anIntArray568[local53] += Static420.anInt7307;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray160.length) {
							local51 = this.anIntArrayArray160[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray117 == null || (arg6 & this.aShortArray117[local59]) != 0) {
									local364 = this.anIntArray569[local59];
									local386 = this.anIntArray569[local59 + 1];
									for (local412 = local364; local412 < local386; local412++) {
										local443 = this.aShortArray118[local412] - 1;
										if (local443 == -1) {
											break;
										}
										if (arg4 != 0) {
											local447 = Class1_Sub6_Sub2.anIntArray675[arg4];
											local451 = Class1_Sub6_Sub2.anIntArray676[arg4];
											local455 = this.aShortArray114[local443] * local451 + local447 * this.aShortArray124[local443] + 16383 >> 14;
											this.aShortArray124[local443] = (short) (local451 * this.aShortArray124[local443] + 16383 - this.aShortArray114[local443] * local447 >> 14);
											this.aShortArray114[local443] = (short) local455;
										}
										if (arg2 != 0) {
											local447 = Class1_Sub6_Sub2.anIntArray675[arg2];
											local451 = Class1_Sub6_Sub2.anIntArray676[arg2];
											local455 = this.aShortArray124[local443] * local451 + 16383 - this.aShortArray120[local443] * local447 >> 14;
											this.aShortArray120[local443] = (short) (this.aShortArray124[local443] * local447 + local451 * this.aShortArray120[local443] + 16383 >> 14);
											this.aShortArray124[local443] = (short) local455;
										}
										if (arg3 != 0) {
											local447 = Class1_Sub6_Sub2.anIntArray675[arg3];
											local451 = Class1_Sub6_Sub2.anIntArray676[arg3];
											local455 = local447 * this.aShortArray120[local443] + this.aShortArray114[local443] * local451 + 16383 >> 14;
											this.aShortArray120[local443] = (short) (this.aShortArray120[local443] * local451 + 16383 - this.aShortArray114[local443] * local447 >> 14);
											this.aShortArray114[local443] = (short) local455;
										}
									}
								}
							}
						}
					}
					if (this.aClass213_10 == null && this.aClass213_9 != null) {
						this.aClass213_9.anInterface5_1 = null;
					}
					if (this.aClass213_10 != null) {
						this.aClass213_10.anInterface5_1 = null;
					}
				}
			} else {
				local27 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local248 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static20.aBoolean25) {
					local364 = Static243.anInt4477 * arg7[3] + Static38.anInt604 * arg7[0] + arg7[6] * Static420.anInt7307 + 8192 >> 14;
					local386 = Static420.anInt7307 * arg7[7] + arg7[4] * Static243.anInt4477 + arg7[1] * Static38.anInt604 + 8192 >> 14;
					local386 += local53;
					local412 = Static420.anInt7307 * arg7[8] + arg7[5] * Static243.anInt4477 + Static38.anInt604 * arg7[2] + 8192 >> 14;
					local364 += local248;
					local412 += local59;
					Static243.anInt4477 = local386;
					Static38.anInt604 = local364;
					Static20.aBoolean25 = false;
					Static420.anInt7307 = local412;
				}
				@Pc(431) int[] local431 = new int[9];
				local386 = Class1_Sub6_Sub2.anIntArray676[arg2];
				local412 = Class1_Sub6_Sub2.anIntArray675[arg2];
				local443 = Class1_Sub6_Sub2.anIntArray676[arg3];
				local447 = Class1_Sub6_Sub2.anIntArray675[arg3];
				local451 = Class1_Sub6_Sub2.anIntArray676[arg4];
				local455 = Class1_Sub6_Sub2.anIntArray675[arg4];
				local463 = local451 * local412 + 8192 >> 14;
				local471 = local412 * local455 + 8192 >> 14;
				local431[0] = local443 * local451 + local447 * local471 + 8192 >> 14;
				local431[4] = local451 * local386 + 8192 >> 14;
				local431[8] = local386 * local443 + 8192 >> 14;
				local431[3] = local386 * local455 + 8192 >> 14;
				local431[5] = -local412;
				local431[2] = local386 * local447 + 8192 >> 14;
				local431[6] = local451 * -local447 + local443 * local471 + 8192 >> 14;
				local431[1] = local455 * -local443 + local463 * local447 + 8192 >> 14;
				local431[7] = local443 * local463 + local455 * local447 + 8192 >> 14;
				@Pc(602) int local602 = -Static38.anInt604 * local431[0] + -Static243.anInt4477 * local431[1] + local431[2] * -Static420.anInt7307 + 8192 >> 14;
				local627 = local431[5] * -Static420.anInt7307 + -Static38.anInt604 * local431[3] + -Static243.anInt4477 * local431[4] + 8192 >> 14;
				local652 = local431[8] * -Static420.anInt7307 + local431[7] * -Static243.anInt4477 + -Static38.anInt604 * local431[6] + 8192 >> 14;
				local656 = Static38.anInt604 + local602;
				@Pc(660) int local660 = Static243.anInt4477 + local627;
				local664 = Static420.anInt7307 + local652;
				@Pc(667) int[] local667 = new int[9];
				for (local669 = 0; local669 < 3; local669++) {
					for (local673 = 0; local673 < 3; local673++) {
						local677 = 0;
						for (local679 = 0; local679 < 3; local679++) {
							local677 += arg7[local673 * 3 + local679] * local431[local679 + local669 * 3];
						}
						local667[local669 * 3 + local673] = local677 + 8192 >> 14;
					}
				}
				local673 = local431[1] * local53 + local248 * local431[0] + local59 * local431[2] + 8192 >> 14;
				local677 = local59 * local431[5] + local431[4] * local53 + local431[3] * local248 + 8192 >> 14;
				local677 += local660;
				local679 = local431[7] * local53 + local431[6] * local248 + local431[8] * local59 + 8192 >> 14;
				local673 += local656;
				local679 += local664;
				local811 = new int[9];
				for (local813 = 0; local813 < 3; local813++) {
					for (local817 = 0; local817 < 3; local817++) {
						local821 = 0;
						for (local823 = 0; local823 < 3; local823++) {
							local821 += arg7[local823 + local813 * 3] * local667[local817 + local823 * 3];
						}
						local811[local813 * 3 + local817] = local821 + 8192 >> 14;
					}
				}
				local817 = arg7[1] * local677 + local673 * arg7[0] + arg7[2] * local679 + 8192 >> 14;
				local821 = arg7[3] * local673 + local677 * arg7[4] + arg7[5] * local679 + 8192 >> 14;
				local821 += local35;
				local823 = arg7[7] * local677 + local673 * arg7[6] + arg7[8] * local679 + 8192 >> 14;
				local817 += local27;
				local823 += local41;
				for (local953 = 0; local953 < local8; local953++) {
					@Pc(959) int local959 = arg1[local953];
					if (this.anIntArrayArray160.length > local959) {
						@Pc(973) int[] local973 = this.anIntArrayArray160[local959];
						for (@Pc(975) int local975 = 0; local975 < local973.length; local975++) {
							@Pc(981) int local981 = local973[local975];
							if (this.aShortArray117 == null || (this.aShortArray117[local981] & arg6) != 0) {
								@Pc(1022) int local1022 = this.anIntArray568[local981] * local811[2] + local811[1] * this.anIntArray567[local981] + local811[0] * this.anIntArray570[local981] + 8192 >> 14;
								@Pc(1054) int local1054 = local811[5] * this.anIntArray568[local981] + local811[3] * this.anIntArray570[local981] + this.anIntArray567[local981] * local811[4] + 8192 >> 14;
								@Pc(1085) int local1085 = this.anIntArray568[local981] * local811[8] + local811[7] * this.anIntArray567[local981] + this.anIntArray570[local981] * local811[6] + 8192 >> 14;
								@Pc(1089) int local1089 = local1054 + local821;
								@Pc(1093) int local1093 = local1022 + local817;
								this.anIntArray570[local981] = local1093;
								@Pc(1102) int local1102 = local1085 + local823;
								this.anIntArray567[local981] = local1089;
								this.anIntArray568[local981] = local1102;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2577) Class287 local2577;
			@Pc(2582) Class166 local2582;
			if (arg0 == 5) {
				if (this.anIntArrayArray161 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray161.length) {
							local246 = this.anIntArrayArray161[local35];
							for (local248 = 0; local248 < local246.length; local248++) {
								local53 = local246[local248];
								if (this.aShortArray116 == null || (this.aShortArray116[local53] & arg6) != 0) {
									local59 = (this.aByteArray86[local53] & 0xFF) + (arg2 * 8);
									if (local59 < 0) {
										local59 = 0;
									} else if (local59 > 255) {
										local59 = 255;
									}
									this.aByteArray86[local53] = (byte) local59;
									if (this.aClass213_9 != null) {
										this.aClass213_9.anInterface5_1 = null;
									}
								}
							}
						}
					}
					if (this.aClass287Array1 != null) {
						for (local35 = 0; local35 < this.anInt7426; local35++) {
							local2577 = this.aClass287Array1[local35];
							local2582 = this.aClass166Array1[local35];
							local2582.anInt4316 = 255 - (this.aByteArray86[local2577.anInt7742] & 0xFF) << 24 | local2582.anInt4316 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2836) Class166 local2836;
				if (arg0 == 8) {
					if (this.anIntArrayArray159 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (local35 < this.anIntArrayArray159.length) {
								local246 = this.anIntArrayArray159[local35];
								for (local248 = 0; local248 < local246.length; local248++) {
									local2836 = this.aClass166Array1[local246[local248]];
									local2836.anInt4315 += arg2;
									local2836.anInt4307 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray159 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray159.length > local35) {
								local246 = this.anIntArrayArray159[local35];
								for (local248 = 0; local248 < local246.length; local248++) {
									local2836 = this.aClass166Array1[local246[local248]];
									local2836.anInt4308 = arg3 * local2836.anInt4308 >> 7;
									local2836.anInt4312 = local2836.anInt4312 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray159 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray159.length) {
							local246 = this.anIntArrayArray159[local35];
							for (local248 = 0; local248 < local246.length; local248++) {
								local2836 = this.aClass166Array1[local246[local248]];
								local2836.anInt4310 = local2836.anInt4310 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray161 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray161.length > local35) {
						local246 = this.anIntArrayArray161[local35];
						for (local248 = 0; local248 < local246.length; local248++) {
							local53 = local246[local248];
							if (this.aShortArray116 == null || (this.aShortArray116[local53] & arg6) != 0) {
								local59 = this.aShortArray123[local53] & 0xFFFF;
								local364 = local59 >> 10 & 0x3F;
								local386 = local59 >> 7 & 0x7;
								local412 = local59 & 0x7F;
								@Pc(2686) int local2686 = arg2 + local364 & 0x3F;
								local386 += arg3 / 4;
								if (local386 < 0) {
									local386 = 0;
								} else if (local386 > 7) {
									local386 = 7;
								}
								local412 += arg4;
								if (local412 < 0) {
									local412 = 0;
								} else if (local412 > 127) {
									local412 = 127;
								}
								this.aShortArray123[local53] = (short) (local2686 << 10 | local386 << 7 | local412);
								if (this.aClass213_9 != null) {
									this.aClass213_9.anInterface5_1 = null;
								}
							}
						}
					}
				}
				if (this.aClass287Array1 != null) {
					for (local35 = 0; local35 < this.anInt7426; local35++) {
						local2577 = this.aClass287Array1[local35];
						local2582 = this.aClass166Array1[local35];
						local2582.anInt4316 = Static379.anIntArray506[this.aShortArray123[local2577.anInt7742] & 0xFFFF] & 0xFFFFFF | local2582.anInt4316 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray160.length > local35) {
					local246 = this.anIntArrayArray160[local35];
					for (local248 = 0; local248 < local246.length; local248++) {
						local53 = local246[local248];
						if (this.aShortArray117 == null || (arg6 & this.aShortArray117[local53]) != 0) {
							this.anIntArray570[local53] -= Static38.anInt604;
							this.anIntArray567[local53] -= Static243.anInt4477;
							this.anIntArray568[local53] -= Static420.anInt7307;
							this.anIntArray570[local53] = arg2 * this.anIntArray570[local53] >> 7;
							this.anIntArray567[local53] = arg3 * this.anIntArray567[local53] >> 7;
							this.anIntArray568[local53] = this.anIntArray568[local53] * arg4 >> 7;
							this.anIntArray570[local53] += Static38.anInt604;
							this.anIntArray567[local53] += Static243.anInt4477;
							this.anIntArray568[local53] += Static420.anInt7307;
						}
					}
				}
			}
		} else {
			local27 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local248 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static20.aBoolean25) {
				local364 = Static38.anInt604 * arg7[0] + arg7[3] * Static243.anInt4477 + Static420.anInt7307 * arg7[6] + 8192 >> 14;
				local386 = Static38.anInt604 * arg7[1] + arg7[4] * Static243.anInt4477 + arg7[7] * Static420.anInt7307 + 8192 >> 14;
				local386 += local53;
				local412 = Static38.anInt604 * arg7[2] + Static243.anInt4477 * arg7[5] + Static420.anInt7307 * arg7[8] + 8192 >> 14;
				local364 += local248;
				Static243.anInt4477 = local386;
				local412 += local59;
				Static38.anInt604 = local364;
				Static20.aBoolean25 = false;
				Static420.anInt7307 = local412;
			}
			local364 = arg2 << 15 >> 7;
			local386 = arg3 << 15 >> 7;
			local412 = arg4 << 15 >> 7;
			local443 = -Static38.anInt604 * local364 + 8192 >> 14;
			local447 = -Static243.anInt4477 * local386 + 8192 >> 14;
			local451 = -Static420.anInt7307 * local412 + 8192 >> 14;
			local455 = local443 + Static38.anInt604;
			local463 = Static243.anInt4477 + local447;
			local471 = local451 + Static420.anInt7307;
			@Pc(2003) int[] local2003 = new int[] { local364 * arg7[0] + 8192 >> 14, arg7[3] * local364 + 8192 >> 14, arg7[6] * local364 + 8192 >> 14, local386 * arg7[1] + 8192 >> 14, arg7[4] * local386 + 8192 >> 14, local386 * arg7[7] + 8192 >> 14, local412 * arg7[2] + 8192 >> 14, arg7[5] * local412 + 8192 >> 14, arg7[8] * local412 + 8192 >> 14 };
			local627 = local364 * local248 + 8192 >> 14;
			local652 = local53 * local386 + 8192 >> 14;
			local656 = local59 * local412 + 8192 >> 14;
			@Pc(2139) int local2139 = local627 + local455;
			@Pc(2143) int local2143 = local652 + local463;
			@Pc(2147) int local2147 = local656 + local471;
			@Pc(2150) int[] local2150 = new int[9];
			@Pc(2156) int local2156;
			for (local664 = 0; local664 < 3; local664++) {
				for (local2156 = 0; local2156 < 3; local2156++) {
					local669 = 0;
					for (local673 = 0; local673 < 3; local673++) {
						local669 += local2003[local673 * 3 + local2156] * arg7[local664 * 3 + local673];
					}
					local2150[local2156 + local664 * 3] = local669 + 8192 >> 14;
				}
			}
			local2156 = local2139 * arg7[0] + local2143 * arg7[1] + arg7[2] * local2147 + 8192 >> 14;
			local669 = local2147 * arg7[5] + local2143 * arg7[4] + local2139 * arg7[3] + 8192 >> 14;
			local2156 += local27;
			local669 += local35;
			local673 = arg7[7] * local2143 + arg7[6] * local2139 + local2147 * arg7[8] + 8192 >> 14;
			local673 += local41;
			for (local677 = 0; local677 < local8; local677++) {
				local679 = arg1[local677];
				if (this.anIntArrayArray160.length > local679) {
					local811 = this.anIntArrayArray160[local679];
					for (local813 = 0; local813 < local811.length; local813++) {
						local817 = local811[local813];
						if (this.aShortArray117 == null || (this.aShortArray117[local817] & arg6) != 0) {
							local821 = local2150[1] * this.anIntArray567[local817] + local2150[0] * this.anIntArray570[local817] + local2150[2] * this.anIntArray568[local817] + 8192 >> 14;
							local823 = this.anIntArray568[local817] * local2150[5] + local2150[4] * this.anIntArray567[local817] + this.anIntArray570[local817] * local2150[3] + 8192 >> 14;
							@Pc(2400) int local2400 = local821 + local2156;
							@Pc(2404) int local2404 = local823 + local669;
							local953 = local2150[6] * this.anIntArray570[local817] + this.anIntArray567[local817] * local2150[7] + this.anIntArray568[local817] * local2150[8] + 8192 >> 14;
							@Pc(2439) int local2439 = local953 + local673;
							this.anIntArray570[local817] = local2400;
							this.anIntArray567[local817] = local2404;
							this.anIntArray568[local817] = local2439;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZZILclient!qf;ZLclient!qf;)Lclient!da;")
	private Class63 method5921(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class63_Sub3 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class63_Sub3 arg4) {
		arg4.anInt7446 = this.anInt7446;
		arg4.anInt7396 = this.anInt7396;
		arg4.anInt7408 = this.anInt7408;
		arg4.anInt7454 = this.anInt7454;
		arg4.anInt7455 = arg1;
		if ((arg1 & 0x100) == 0) {
			arg4.aBoolean582 = this.aBoolean582;
		} else {
			arg4.aBoolean582 = true;
		}
		arg4.anInt7426 = this.anInt7426;
		arg4.aShort99 = this.aShort99;
		arg4.aByte100 = 0;
		arg4.anInt7444 = this.anInt7444;
		arg4.aShort105 = this.aShort105;
		arg4.anInt7401 = this.anInt7401;
		@Pc(66) boolean local66 = Static30.method388(this.anInt7444, arg1);
		@Pc(72) boolean local72 = Static549.method6482(arg1, this.anInt7444);
		@Pc(78) boolean local78 = Static114.method1789(this.anInt7444, arg1);
		@Pc(84) boolean local84 = local78 | local72 | local66;
		@Pc(203) int local203;
		if (local84) {
			if (!local66) {
				arg4.anIntArray570 = this.anIntArray570;
			} else if (arg2.anIntArray570 == null || arg2.anIntArray570.length < this.anInt7454) {
				arg4.anIntArray570 = arg2.anIntArray570 = new int[this.anInt7454];
			} else {
				arg4.anIntArray570 = arg2.anIntArray570;
			}
			if (!local72) {
				arg4.anIntArray567 = this.anIntArray567;
			} else if (arg2.anIntArray567 == null || this.anInt7454 > arg2.anIntArray567.length) {
				arg4.anIntArray567 = arg2.anIntArray567 = new int[this.anInt7454];
			} else {
				arg4.anIntArray567 = arg2.anIntArray567;
			}
			if (!local78) {
				arg4.anIntArray568 = this.anIntArray568;
			} else if (arg2.anIntArray568 == null || arg2.anIntArray568.length < this.anInt7454) {
				arg4.anIntArray568 = arg2.anIntArray568 = new int[this.anInt7454];
			} else {
				arg4.anIntArray568 = arg2.anIntArray568;
			}
			for (local203 = 0; local203 < this.anInt7454; local203++) {
				if (local66) {
					arg4.anIntArray570[local203] = this.anIntArray570[local203];
				}
				if (local72) {
					arg4.anIntArray567[local203] = this.anIntArray567[local203];
				}
				if (local78) {
					arg4.anIntArray568[local203] = this.anIntArray568[local203];
				}
			}
		} else {
			arg4.anIntArray570 = this.anIntArray570;
			arg4.anIntArray567 = this.anIntArray567;
			arg4.anIntArray568 = this.anIntArray568;
		}
		if (Static448.method6201(this.anInt7444, arg1)) {
			arg4.aClass213_7 = arg2.aClass213_7;
			if (arg3) {
				arg4.aByte100 = (byte) (arg4.aByte100 | 0x1);
			}
			arg4.aClass213_7.aByte82 = this.aClass213_7.aByte82;
			arg4.aClass213_7.anInterface5_1 = this.aClass213_7.anInterface5_1;
		} else if (Static29.method347(arg1, this.anInt7444)) {
			arg4.aClass213_7 = this.aClass213_7;
		} else {
			arg4.aClass213_7 = null;
		}
		if (Static410.method5651(this.anInt7444, arg1)) {
			if (arg2.aShortArray123 == null || arg2.aShortArray123.length < this.anInt7408) {
				arg4.aShortArray123 = arg2.aShortArray123 = new short[this.anInt7408];
			} else {
				arg4.aShortArray123 = arg2.aShortArray123;
			}
			for (local203 = 0; local203 < this.anInt7408; local203++) {
				arg4.aShortArray123[local203] = this.aShortArray123[local203];
			}
		} else {
			arg4.aShortArray123 = this.aShortArray123;
		}
		if (Static332.method5799(arg1, this.anInt7444)) {
			if (arg2.aByteArray86 == null || this.anInt7408 > arg2.aByteArray86.length) {
				arg4.aByteArray86 = arg2.aByteArray86 = new byte[this.anInt7408];
			} else {
				arg4.aByteArray86 = arg2.aByteArray86;
			}
			for (local203 = 0; local203 < this.anInt7408; local203++) {
				arg4.aByteArray86[local203] = this.aByteArray86[local203];
			}
		} else {
			arg4.aByteArray86 = this.aByteArray86;
		}
		if (Static330.method4520(arg1, this.anInt7444)) {
			if (arg3) {
				arg4.aByte100 = (byte) (arg4.aByte100 | 0x2);
			}
			arg4.aClass213_9 = arg2.aClass213_9;
			arg4.aClass213_9.aByte82 = this.aClass213_9.aByte82;
			arg4.aClass213_9.anInterface5_1 = this.aClass213_9.anInterface5_1;
		} else if (Static27.method316(this.anInt7444, arg1)) {
			arg4.aClass213_9 = this.aClass213_9;
		} else {
			arg4.aClass213_9 = null;
		}
		@Pc(530) int local530;
		if (Static559.method7593(this.anInt7444, arg1)) {
			if (arg2.aShortArray114 == null || arg2.aShortArray114.length < this.anInt7396) {
				local203 = this.anInt7396;
				arg4.aShortArray120 = arg2.aShortArray120 = new short[local203];
				arg4.aShortArray124 = arg2.aShortArray124 = new short[local203];
				arg4.aShortArray114 = arg2.aShortArray114 = new short[local203];
			} else {
				arg4.aShortArray124 = arg2.aShortArray124;
				arg4.aShortArray114 = arg2.aShortArray114;
				arg4.aShortArray120 = arg2.aShortArray120;
			}
			if (this.aClass259_1 == null) {
				for (local203 = 0; local203 < this.anInt7396; local203++) {
					arg4.aShortArray114[local203] = this.aShortArray114[local203];
					arg4.aShortArray124[local203] = this.aShortArray124[local203];
					arg4.aShortArray120[local203] = this.aShortArray120[local203];
				}
			} else {
				if (arg2.aClass259_1 == null) {
					arg2.aClass259_1 = new Class259();
				}
				@Pc(518) Class259 local518 = arg4.aClass259_1 = arg2.aClass259_1;
				if (local518.aShortArray111 == null || this.anInt7396 > local518.aShortArray111.length) {
					local530 = this.anInt7396;
					local518.aShortArray113 = new short[local530];
					local518.aShortArray111 = new short[local530];
					local518.aByteArray84 = new byte[local530];
					local518.aShortArray112 = new short[local530];
				}
				for (local530 = 0; local530 < this.anInt7396; local530++) {
					arg4.aShortArray114[local530] = this.aShortArray114[local530];
					arg4.aShortArray124[local530] = this.aShortArray124[local530];
					arg4.aShortArray120[local530] = this.aShortArray120[local530];
					local518.aShortArray111[local530] = this.aClass259_1.aShortArray111[local530];
					local518.aShortArray113[local530] = this.aClass259_1.aShortArray113[local530];
					local518.aShortArray112[local530] = this.aClass259_1.aShortArray112[local530];
					local518.aByteArray84[local530] = this.aClass259_1.aByteArray84[local530];
				}
			}
			arg4.aByteArray87 = this.aByteArray87;
		} else {
			arg4.aClass259_1 = this.aClass259_1;
			arg4.aByteArray87 = this.aByteArray87;
			arg4.aShortArray114 = this.aShortArray114;
			arg4.aShortArray124 = this.aShortArray124;
			arg4.aShortArray120 = this.aShortArray120;
		}
		if (Static312.method4328(arg1, this.anInt7444)) {
			arg4.aClass213_10 = arg2.aClass213_10;
			if (arg3) {
				arg4.aByte100 = (byte) (arg4.aByte100 | 0x4);
			}
			arg4.aClass213_10.anInterface5_1 = this.aClass213_10.anInterface5_1;
			arg4.aClass213_10.aByte82 = this.aClass213_10.aByte82;
		} else if (Static454.method6262(this.anInt7444, arg1)) {
			arg4.aClass213_10 = this.aClass213_10;
		} else {
			arg4.aClass213_10 = null;
		}
		if (Static482.method6524(arg1, this.anInt7444)) {
			if (arg2.aFloatArray44 == null || this.anInt7408 > arg2.aFloatArray44.length) {
				local203 = this.anInt7396;
				arg4.lb = arg2.lb = new float[local203];
				arg4.aFloatArray44 = arg2.aFloatArray44 = new float[local203];
			} else {
				arg4.aFloatArray44 = arg2.aFloatArray44;
				arg4.lb = arg2.lb;
			}
			for (local203 = 0; local203 < this.anInt7396; local203++) {
				arg4.aFloatArray44[local203] = this.aFloatArray44[local203];
				arg4.lb[local203] = this.lb[local203];
			}
		} else {
			arg4.aFloatArray44 = this.aFloatArray44;
			arg4.lb = this.lb;
		}
		if (Static414.method5678(arg1, this.anInt7444)) {
			if (arg3) {
				arg4.aByte100 = (byte) (arg4.aByte100 | 0x8);
			}
			arg4.aClass213_8 = arg2.aClass213_8;
			arg4.aClass213_8.aByte82 = this.aClass213_8.aByte82;
			arg4.aClass213_8.anInterface5_1 = this.aClass213_8.anInterface5_1;
		} else if (Static483.method6535(arg1, this.anInt7444)) {
			arg4.aClass213_8 = this.aClass213_8;
		} else {
			arg4.aClass213_8 = null;
		}
		if (Static472.method6449(this.anInt7444, arg1)) {
			if (arg2.aShortArray115 == null || arg2.aShortArray115.length < this.anInt7408) {
				local203 = this.anInt7408;
				arg4.aShortArray115 = arg2.aShortArray115 = new short[local203];
				arg4.aShortArray119 = arg2.aShortArray119 = new short[local203];
				arg4.aShortArray122 = arg2.aShortArray122 = new short[local203];
			} else {
				arg4.aShortArray122 = arg2.aShortArray122;
				arg4.aShortArray119 = arg2.aShortArray119;
				arg4.aShortArray115 = arg2.aShortArray115;
			}
			for (local203 = 0; local203 < this.anInt7408; local203++) {
				arg4.aShortArray115[local203] = this.aShortArray115[local203];
				arg4.aShortArray119[local203] = this.aShortArray119[local203];
				arg4.aShortArray122[local203] = this.aShortArray122[local203];
			}
		} else {
			arg4.aShortArray119 = this.aShortArray119;
			arg4.aShortArray115 = this.aShortArray115;
			arg4.aShortArray122 = this.aShortArray122;
		}
		if (Static14.method145(this.anInt7444, arg1)) {
			arg4.aClass183_1 = arg2.aClass183_1;
			if (arg3) {
				arg4.aByte100 = (byte) (arg4.aByte100 | 0x10);
			}
			arg4.aClass183_1.anInterface23_1 = this.aClass183_1.anInterface23_1;
		} else if (Static555.method7560(this.anInt7444, arg1)) {
			arg4.aClass183_1 = this.aClass183_1;
		} else {
			arg4.aClass183_1 = null;
		}
		if (Static406.method5635(arg1, this.anInt7444)) {
			if (arg2.aShortArray121 == null || this.anInt7408 > arg2.aShortArray121.length) {
				local203 = this.anInt7408;
				arg4.aShortArray121 = arg2.aShortArray121 = new short[local203];
			} else {
				arg4.aShortArray121 = arg2.aShortArray121;
			}
			for (local203 = 0; local203 < this.anInt7408; local203++) {
				arg4.aShortArray121[local203] = this.aShortArray121[local203];
			}
		} else {
			arg4.aShortArray121 = this.aShortArray121;
		}
		if (!Static447.method6181(this.anInt7444, arg1)) {
			arg4.aClass166Array1 = this.aClass166Array1;
		} else if (arg2.aClass166Array1 == null || this.anInt7426 > arg2.aClass166Array1.length) {
			local203 = this.anInt7426;
			arg4.aClass166Array1 = arg2.aClass166Array1 = new Class166[local203];
			for (local530 = 0; local530 < this.anInt7426; local530++) {
				arg4.aClass166Array1[local530] = this.aClass166Array1[local530].method3480();
			}
		} else {
			arg4.aClass166Array1 = arg2.aClass166Array1;
			for (local203 = 0; local203 < this.anInt7426; local203++) {
				arg4.aClass166Array1[local203].method3481(this.aClass166Array1[local203]);
			}
		}
		arg4.aClass287Array1 = this.aClass287Array1;
		arg4.anIntArray569 = this.anIntArray569;
		arg4.aClass206Array4 = this.aClass206Array4;
		if (this.aBoolean581) {
			arg4.aShort98 = this.aShort98;
			arg4.aShort100 = this.aShort100;
			arg4.aShort104 = this.aShort104;
			arg4.aBoolean581 = true;
			arg4.aShort96 = this.aShort96;
			arg4.aShort101 = this.aShort101;
			arg4.aShort102 = this.aShort102;
			arg4.aShort97 = this.aShort97;
			arg4.aShort103 = this.aShort103;
		} else {
			arg4.aBoolean581 = false;
		}
		arg4.aClass158Array4 = this.aClass158Array4;
		arg4.aShortArray117 = this.aShortArray117;
		arg4.anIntArray571 = this.anIntArray571;
		arg4.anIntArrayArray159 = this.anIntArrayArray159;
		arg4.aShortArray118 = this.aShortArray118;
		arg4.anIntArrayArray161 = this.anIntArrayArray161;
		arg4.aShortArray116 = this.aShortArray116;
		arg4.anIntArrayArray160 = this.anIntArrayArray160;
		return arg4;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!tv;)V")
	private void method5922(@OriginalArg(1) Class1_Sub6_Sub5_Sub1 arg0) {
		if (this.anInt7396 > this.aClass134_Sub2_32.anIntArray512.length) {
			this.aClass134_Sub2_32.anIntArray513 = new int[this.anInt7396];
			this.aClass134_Sub2_32.anIntArray512 = new int[this.anInt7396];
		}
		@Pc(32) int[] local32 = this.aClass134_Sub2_32.anIntArray512;
		@Pc(36) int[] local36 = this.aClass134_Sub2_32.anIntArray513;
		@Pc(65) int local65;
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (@Pc(38) int local38 = 0; local38 < this.anInt7401; local38++) {
			local65 = (this.anIntArray570[local38] - (this.aClass134_Sub2_32.anInt6587 * this.anIntArray567[local38] >> 8) >> this.aClass134_Sub2_32.anInt6550) - arg0.anInt8721;
			@Pc(90) int local90 = (this.anIntArray568[local38] - (this.anIntArray567[local38] * this.aClass134_Sub2_32.anInt6588 >> 8) >> this.aClass134_Sub2_32.anInt6550) - arg0.anInt8724;
			@Pc(95) int local95 = this.anIntArray569[local38];
			@Pc(102) int local102 = this.anIntArray569[local38 + 1];
			for (local104 = local95; local104 < local102; local104++) {
				local113 = this.aShortArray118[local104] - 1;
				if (local113 == -1) {
					break;
				}
				local32[local113] = local65;
				local36[local113] = local90;
			}
		}
		for (local65 = 0; local65 < this.anInt7446; local65++) {
			if (this.aByteArray86 == null || this.aByteArray86[local65] <= 128) {
				@Pc(163) short local163 = this.aShortArray115[local65];
				@Pc(168) short local168 = this.aShortArray119[local65];
				@Pc(173) short local173 = this.aShortArray122[local65];
				local104 = local32[local163];
				local113 = local32[local168];
				@Pc(185) int local185 = local32[local173];
				@Pc(189) int local189 = local36[local163];
				@Pc(193) int local193 = local36[local168];
				@Pc(197) int local197 = local36[local173];
				if (-((local193 - local189) * (local185 - local113)) + (local193 - local197) * (local104 - local113) > 0) {
					arg0.method7152(local185, local104, local113, local197, local189, local193);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean581) {
			this.method5926();
		}
		return this.aShort104;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BZ)V")
	private void method5924(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass213_9 != null && this.aClass213_9.anInterface5_1 == null;
		@Pc(27) boolean local27 = this.aClass213_10 != null && this.aClass213_10.anInterface5_1 == null;
		@Pc(38) boolean local38 = this.aClass213_7 != null && this.aClass213_7.anInterface5_1 == null;
		@Pc(49) boolean local49 = this.aClass213_8 != null && this.aClass213_8.anInterface5_1 == null;
		if (arg0) {
			local27 &= (this.aByte100 & 0x4) != 0;
			local16 &= (this.aByte100 & 0x2) != 0;
			local38 &= (this.aByte100 & 0x1) != 0;
			local49 &= (this.aByte100 & 0x8) != 0;
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
		if (this.aClass134_Sub2_32.aClass1_Sub35_Sub1_2.aByteArray85.length >= this.anInt7396 * local103) {
			this.aClass134_Sub2_32.aClass1_Sub35_Sub1_2.anInt7214 = 0;
		} else {
			this.aClass134_Sub2_32.aClass1_Sub35_Sub1_2 = new Class1_Sub35_Sub1((this.anInt7396 + 100) * local103);
		}
		@Pc(186) Class1_Sub35_Sub1 local186 = this.aClass134_Sub2_32.aClass1_Sub35_Sub1_2;
		@Pc(194) int local194;
		@Pc(203) int local203;
		@Pc(231) int local231;
		@Pc(240) int local240;
		if (local38) {
			@Pc(210) int local210;
			@Pc(217) int local217;
			@Pc(222) int local222;
			@Pc(229) int local229;
			if (this.aClass134_Sub2_32.aBoolean517) {
				for (local194 = 0; local194 < this.anInt7401; local194++) {
					local203 = Stream.floatToRawIntBits((float) this.anIntArray570[local194]);
					local210 = Stream.floatToRawIntBits((float) this.anIntArray567[local194]);
					local217 = Stream.floatToRawIntBits((float) this.anIntArray568[local194]);
					local222 = this.anIntArray569[local194];
					local229 = this.anIntArray569[local194 + 1];
					for (local231 = local222; local231 < local229; local231++) {
						local240 = this.aShortArray118[local231] - 1;
						if (local240 == -1) {
							break;
						}
						local186.anInt7214 = local103 * local240;
						local186.method5792(local203);
						local186.method5792(local210);
						local186.method5792(local217);
					}
				}
			} else {
				for (local194 = 0; local194 < this.anInt7401; local194++) {
					local203 = Stream.floatToRawIntBits((float) this.anIntArray570[local194]);
					local210 = Stream.floatToRawIntBits((float) this.anIntArray567[local194]);
					local217 = Stream.floatToRawIntBits((float) this.anIntArray568[local194]);
					local222 = this.anIntArray569[local194];
					local229 = this.anIntArray569[local194 + 1];
					for (local231 = local222; local231 < local229; local231++) {
						local240 = this.aShortArray118[local231] - 1;
						if (local240 == -1) {
							break;
						}
						local186.anInt7214 = local103 * local240;
						local186.method5745(local203);
						local186.method5745(local210);
						local186.method5745(local217);
					}
				}
			}
		}
		@Pc(489) float local489;
		@Pc(374) short[] local374;
		@Pc(378) short[] local378;
		@Pc(382) short[] local382;
		@Pc(386) byte[] local386;
		@Pc(530) float local530;
		if (local16) {
			if (this.aClass213_10 == null) {
				if (this.aClass259_1 == null) {
					local382 = this.aShortArray120;
					local378 = this.aShortArray124;
					local374 = this.aShortArray114;
					local386 = this.aByteArray87;
				} else {
					local374 = this.aClass259_1.aShortArray111;
					local378 = this.aClass259_1.aShortArray113;
					local382 = this.aClass259_1.aShortArray112;
					local386 = this.aClass259_1.aByteArray84;
				}
				@Pc(406) float local406 = this.aClass134_Sub2_32.aFloatArray40[0];
				@Pc(412) float local412 = this.aClass134_Sub2_32.aFloatArray40[1];
				@Pc(418) float local418 = this.aClass134_Sub2_32.aFloatArray40[2];
				@Pc(422) float local422 = this.aClass134_Sub2_32.aFloat157;
				@Pc(432) float local432 = this.aClass134_Sub2_32.aFloat141 * 768.0F / (float) this.aShort99;
				@Pc(442) float local442 = this.aClass134_Sub2_32.aFloat144 * 768.0F / (float) this.aShort99;
				for (@Pc(444) int local444 = 0; local444 < this.anInt7408; local444++) {
					@Pc(464) int local464 = this.method5920(this.aByteArray86[local444], this.aShort105, this.aShortArray123[local444], this.aShortArray121[local444]);
					@Pc(473) float local473 = (float) (local464 >>> 24) * this.aClass134_Sub2_32.aFloat138;
					@Pc(478) short local478 = this.aShortArray115[local444];
					local489 = (float) (local464 >> 16 & 0xFF) * this.aClass134_Sub2_32.aFloat149;
					@Pc(500) float local500 = this.aClass134_Sub2_32.aFloat152 * (float) (local464 >> 8 & 0xFF);
					@Pc(505) short local505 = (short) local386[local478];
					if (local505 == 0) {
						local530 = (local406 * (float) local374[local478] + local412 * (float) local378[local478] + local418 * (float) local382[local478]) * 0.0026041667F;
					} else {
						local530 = ((float) local378[local478] * local412 + local406 * (float) local374[local478] + local418 * (float) local382[local478]) / (float) (local505 * 256);
					}
					@Pc(570) float local570 = (local530 < 0.0F ? local442 : local432) * local530 + local422;
					@Pc(575) int local575 = (int) (local570 * local473);
					if (local575 < 0) {
						local575 = 0;
					} else if (local575 > 255) {
						local575 = 255;
					}
					@Pc(591) int local591 = (int) (local489 * local570);
					if (local591 < 0) {
						local591 = 0;
					} else if (local591 > 255) {
						local591 = 255;
					}
					@Pc(609) int local609 = (int) (local500 * local570);
					if (local609 < 0) {
						local609 = 0;
					} else if (local609 > 255) {
						local609 = 255;
					}
					local186.anInt7214 = local103 * local478 + local107;
					local186.method5777(local575);
					local186.method5777(local591);
					local186.method5777(local609);
					local186.method5777(255 - (this.aByteArray86[local444] & 0xFF));
					local478 = this.aShortArray119[local444];
					local505 = local386[local478];
					if (local505 == 0) {
						local530 = (local412 * (float) local378[local478] + (float) local374[local478] * local406 + local418 * (float) local382[local478]) * 0.0026041667F;
					} else {
						local530 = (local406 * (float) local374[local478] + (float) local378[local478] * local412 + local418 * (float) local382[local478]) / (float) (local505 * 256);
					}
					local570 = (local530 < 0.0F ? local442 : local432) * local530 + local422;
					local575 = (int) (local570 * local473);
					if (local575 < 0) {
						local575 = 0;
					} else if (local575 > 255) {
						local575 = 255;
					}
					local591 = (int) (local570 * local489);
					local609 = (int) (local500 * local570);
					if (local591 < 0) {
						local591 = 0;
					} else if (local591 > 255) {
						local591 = 255;
					}
					if (local609 < 0) {
						local609 = 0;
					} else if (local609 > 255) {
						local609 = 255;
					}
					local186.anInt7214 = local103 * local478 + local107;
					local186.method5777(local575);
					local186.method5777(local591);
					local186.method5777(local609);
					local186.method5777(255 - (this.aByteArray86[local444] & 0xFF));
					local478 = this.aShortArray122[local444];
					local505 = local386[local478];
					if (local505 == 0) {
						local530 = (local406 * (float) local374[local478] + local412 * (float) local378[local478] + (float) local382[local478] * local418) * 0.0026041667F;
					} else {
						local530 = ((float) local382[local478] * local418 + (float) local378[local478] * local412 + local406 * (float) local374[local478]) / (float) (local505 * 256);
					}
					local570 = local422 + (local530 < 0.0F ? local442 : local432) * local530;
					local575 = (int) (local473 * local570);
					if (local575 < 0) {
						local575 = 0;
					} else if (local575 > 255) {
						local575 = 255;
					}
					local591 = (int) (local489 * local570);
					local609 = (int) (local570 * local500);
					if (local591 < 0) {
						local591 = 0;
					} else if (local591 > 255) {
						local591 = 255;
					}
					if (local609 < 0) {
						local609 = 0;
					} else if (local609 > 255) {
						local609 = 255;
					}
					local186.anInt7214 = local103 * local478 + local107;
					local186.method5777(local575);
					local186.method5777(local591);
					local186.method5777(local609);
					local186.method5777(255 - (this.aByteArray86[local444] & 0xFF));
				}
			} else {
				for (local194 = 0; local194 < this.anInt7408; local194++) {
					local203 = this.method5920(this.aByteArray86[local194], this.aShort105, this.aShortArray123[local194], this.aShortArray121[local194]);
					local186.anInt7214 = local107 + local103 * this.aShortArray115[local194];
					local186.method5792(local203);
					local186.anInt7214 = local103 * this.aShortArray119[local194] + local107;
					local186.method5792(local203);
					local186.anInt7214 = this.aShortArray122[local194] * local103 + local107;
					local186.method5792(local203);
				}
			}
		}
		if (local27) {
			if (this.aClass259_1 == null) {
				local378 = this.aShortArray124;
				local382 = this.aShortArray120;
				local374 = this.aShortArray114;
				local386 = this.aByteArray87;
			} else {
				local386 = this.aClass259_1.aByteArray84;
				local378 = this.aClass259_1.aShortArray113;
				local382 = this.aClass259_1.aShortArray112;
				local374 = this.aClass259_1.aShortArray111;
			}
			@Pc(1100) float local1100 = 3.0F / (float) this.aShort99;
			local530 = 3.0F / (float) (this.aShort99 + this.aShort99 / 2);
			local186.anInt7214 = local109;
			if (this.aClass134_Sub2_32.aBoolean517) {
				for (local231 = 0; local231 < this.anInt7396; local231++) {
					local240 = local386[local231] & 0xFF;
					if (local240 == 0) {
						local186.method5571((float) local374[local231] * local530);
						local186.method5571((float) local378[local231] * local530);
						local186.method5571(local530 * (float) local382[local231]);
					} else {
						local489 = local1100 / (float) local240;
						local186.method5571(local489 * (float) local374[local231]);
						local186.method5571(local489 * (float) local378[local231]);
						local186.method5571((float) local382[local231] * local489);
					}
					local186.anInt7214 += local103 - 12;
				}
			} else {
				for (local231 = 0; local231 < this.anInt7396; local231++) {
					local240 = local386[local231] & 0xFF;
					if (local240 == 0) {
						local186.method5572((float) local374[local231] * local530);
						local186.method5572(local530 * (float) local378[local231]);
						local186.method5572(local530 * (float) local382[local231]);
					} else {
						local489 = local1100 / (float) local240;
						local186.method5572((float) local374[local231] * local489);
						local186.method5572((float) local378[local231] * local489);
						local186.method5572(local489 * (float) local382[local231]);
					}
					local186.anInt7214 += local103 - 12;
				}
			}
		}
		if (local49) {
			local186.anInt7214 = local111;
			if (this.aClass134_Sub2_32.aBoolean517) {
				for (local194 = 0; local194 < this.anInt7396; local194++) {
					local186.method5571(this.aFloatArray44[local194]);
					local186.method5571(this.lb[local194]);
					local186.anInt7214 += local103 - 8;
				}
			} else {
				for (local194 = 0; local194 < this.anInt7396; local194++) {
					local186.method5572(this.aFloatArray44[local194]);
					local186.method5572(this.lb[local194]);
					local186.anInt7214 += local103 - 8;
				}
			}
		}
		local186.anInt7214 = this.anInt7396 * local103;
		@Pc(1404) Interface5 local1404;
		if (arg0) {
			if (this.anInterface5_5 == null) {
				this.anInterface5_5 = this.aClass134_Sub2_32.method5270(true, local186.anInt7214, local103, local186.aByteArray85);
			} else {
				this.anInterface5_5.method7484(local186.anInt7214, local103, local186.aByteArray85);
			}
			local1404 = this.anInterface5_5;
			this.aByte100 = 0;
		} else {
			local1404 = this.aClass134_Sub2_32.method5270(false, local186.anInt7214, local103, local186.aByteArray85);
			this.aBoolean583 = true;
		}
		if (local38) {
			this.aClass213_7.aByte82 = 0;
			this.aClass213_7.anInterface5_1 = local1404;
		}
		if (local49) {
			this.aClass213_8.aByte82 = local111;
			this.aClass213_8.anInterface5_1 = local1404;
		}
		if (local16) {
			this.aClass213_9.anInterface5_1 = local1404;
			this.aClass213_9.aByte82 = local107;
		}
		if (local27) {
			this.aClass213_10.aByte82 = local109;
			this.aClass213_10.anInterface5_1 = local1404;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!q;Lclient!kd;I)V")
	@Override
	public void method7429(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class8_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7396 == 0) {
			return;
		}
		@Pc(16) Class113_Sub2 local16 = this.aClass134_Sub2_32.aClass113_Sub2_3;
		if (!this.aBoolean581) {
			this.method5926();
		}
		@Pc(25) Class113_Sub2 local25 = (Class113_Sub2) arg0;
		Static121.aFloat34 = local25.aFloat66 * local16.aFloat71 + local16.aFloat63 * local25.aFloat70 + local25.aFloat71 * local16.aFloat64;
		Static116.aFloat31 = local25.aFloat69 * local16.aFloat64 + local25.aFloat62 * local16.aFloat71 + local16.aFloat63 * local25.aFloat68 + local16.aFloat69;
		@Pc(72) float local72 = Static121.aFloat34 * (float) this.aShort100 + Static116.aFloat31;
		@Pc(80) float local80 = Static116.aFloat31 + (float) this.aShort102 * Static121.aFloat34;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local80 < local72) {
			local90 = local80 - (float) this.aShort104;
			local96 = (float) this.aShort104 + local72;
		} else {
			local90 = local72 - (float) this.aShort104;
			local96 = local80 + (float) this.aShort104;
		}
		if (local90 >= this.aClass134_Sub2_32.aFloat145 || (float) this.aClass134_Sub2_32.anInt6591 >= local96) {
			return;
		}
		Static105.aFloat23 = local16.aFloat68 + local25.aFloat68 * local16.aFloat67 + local25.aFloat62 * local16.aFloat70 + local16.aFloat72 * local25.aFloat69;
		Static565.aFloat210 = local16.aFloat70 * local25.aFloat66 + local16.aFloat67 * local25.aFloat70 + local25.aFloat71 * local16.aFloat72;
		@Pc(172) float local172 = Static565.aFloat210 * (float) this.aShort100 + Static105.aFloat23;
		@Pc(180) float local180 = Static105.aFloat23 + (float) this.aShort102 * Static565.aFloat210;
		@Pc(206) float local206;
		@Pc(195) float local195;
		if (local180 < local172) {
			local206 = (float) this.aClass134_Sub2_32.anInt6567 * (local180 - (float) this.aShort104);
			local195 = (float) this.aClass134_Sub2_32.anInt6567 * (local172 + (float) this.aShort104);
		} else {
			local195 = (float) this.aClass134_Sub2_32.anInt6567 * (local180 + (float) this.aShort104);
			local206 = (float) this.aClass134_Sub2_32.anInt6567 * (local172 - (float) this.aShort104);
		}
		if (this.aClass134_Sub2_32.aFloat146 <= local206 / local96 || this.aClass134_Sub2_32.aFloat151 >= local195 / local96) {
			return;
		}
		Static233.aFloat181 = local16.aFloat65 * local25.aFloat70 + local16.aFloat66 * local25.aFloat66 + local25.aFloat71 * local16.aFloat73;
		Static558.aFloat209 = local25.aFloat68 * local16.aFloat65 + local16.aFloat66 * local25.aFloat62 + local16.aFloat73 * local25.aFloat69 + local16.aFloat62;
		@Pc(295) float local295 = Static233.aFloat181 * (float) this.aShort100 + Static558.aFloat209;
		@Pc(303) float local303 = Static233.aFloat181 * (float) this.aShort102 + Static558.aFloat209;
		@Pc(319) float local319;
		@Pc(330) float local330;
		if (local303 < local295) {
			local319 = ((float) -this.aShort104 + local303) * (float) this.aClass134_Sub2_32.anInt6583;
			local330 = (local295 + (float) this.aShort104) * (float) this.aClass134_Sub2_32.anInt6583;
		} else {
			local319 = ((float) -this.aShort104 + local295) * (float) this.aClass134_Sub2_32.anInt6583;
			local330 = ((float) this.aShort104 + local303) * (float) this.aClass134_Sub2_32.anInt6583;
		}
		if (local319 / local96 >= this.aClass134_Sub2_32.aFloat140 || this.aClass134_Sub2_32.aFloat155 >= local330 / local96) {
			return;
		}
		if (arg1 != null || this.aClass287Array1 != null) {
			Static152.aFloat44 = local25.aFloat65 * local16.aFloat70 + local25.aFloat67 * local16.aFloat67 + local25.aFloat63 * local16.aFloat72;
			Static340.aFloat130 = local16.aFloat66 * local25.aFloat73 + local25.aFloat72 * local16.aFloat65 + local25.aFloat64 * local16.aFloat73;
			Static557.aFloat208 = local25.aFloat63 * local16.aFloat73 + local16.aFloat66 * local25.aFloat65 + local16.aFloat65 * local25.aFloat67;
			Static156.aFloat52 = local25.aFloat72 * local16.aFloat63 + local25.aFloat73 * local16.aFloat71 + local25.aFloat64 * local16.aFloat64;
			Static545.aFloat207 = local25.aFloat65 * local16.aFloat71 + local25.aFloat67 * local16.aFloat63 + local25.aFloat63 * local16.aFloat64;
			Static322.aFloat125 = local16.aFloat70 * local25.aFloat73 + local16.aFloat67 * local25.aFloat72 + local16.aFloat72 * local25.aFloat64;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(501) int local501 = this.aShort103 + this.aShort97 >> 1;
			@Pc(509) int local509 = this.aShort96 + this.aShort101 >> 1;
			@Pc(528) int local528 = (int) (Static322.aFloat125 * (float) local509 + (float) local501 * Static152.aFloat44 + Static105.aFloat23 + Static565.aFloat210 * (float) this.aShort100);
			@Pc(547) int local547 = (int) ((float) local509 * Static340.aFloat130 + Static558.aFloat209 + Static557.aFloat208 * (float) local501 + Static233.aFloat181 * (float) this.aShort100);
			@Pc(566) int local566 = (int) ((float) local509 * Static156.aFloat52 + (float) this.aShort100 * Static121.aFloat34 + (float) local501 * Static545.aFloat207 + Static116.aFloat31);
			if (this.aClass134_Sub2_32.anInt6591 > local566) {
				local490 = true;
			} else {
				arg1.anInt4679 = this.aClass134_Sub2_32.anInt6583 * local547 / local566 + this.aClass134_Sub2_32.anInt6568;
				arg1.anInt4680 = this.aClass134_Sub2_32.anInt6585 + this.aClass134_Sub2_32.anInt6567 * local528 / local566;
			}
			@Pc(625) int local625 = (int) ((float) this.aShort102 * Static565.aFloat210 + (float) local501 * Static152.aFloat44 + Static105.aFloat23 + Static322.aFloat125 * (float) local509);
			@Pc(644) int local644 = (int) ((float) this.aShort102 * Static233.aFloat181 + Static557.aFloat208 * (float) local501 + Static558.aFloat209 + Static340.aFloat130 * (float) local509);
			@Pc(663) int local663 = (int) (Static156.aFloat52 * (float) local509 + Static121.aFloat34 * (float) this.aShort102 + Static116.aFloat31 + (float) local501 * Static545.aFloat207);
			if (local663 < this.aClass134_Sub2_32.anInt6591) {
				local490 = true;
			} else {
				arg1.anInt4681 = local644 * this.aClass134_Sub2_32.anInt6583 / local663 + this.aClass134_Sub2_32.anInt6568;
				arg1.anInt4682 = this.aClass134_Sub2_32.anInt6585 + this.aClass134_Sub2_32.anInt6567 * local625 / local663;
			}
			if (local490) {
				if (local566 < this.aClass134_Sub2_32.anInt6591 && local663 < this.aClass134_Sub2_32.anInt6591) {
					local492 = false;
				} else {
					@Pc(746) int local746;
					@Pc(758) int local758;
					@Pc(770) int local770;
					if (local566 < this.aClass134_Sub2_32.anInt6591) {
						local746 = (local663 - this.aClass134_Sub2_32.anInt6591 << 16) / (local663 - local566);
						local758 = local625 + ((local625 - local528) * local746 >> 16);
						arg1.anInt4680 = local758 * this.aClass134_Sub2_32.anInt6567 / this.aClass134_Sub2_32.anInt6591 + this.aClass134_Sub2_32.anInt6585;
						local770 = local644 + ((local644 - local547) * local746 >> 16);
						arg1.anInt4679 = local770 * this.aClass134_Sub2_32.anInt6583 / this.aClass134_Sub2_32.anInt6591 + this.aClass134_Sub2_32.anInt6568;
					} else if (local663 < this.aClass134_Sub2_32.anInt6591) {
						local746 = (local566 - this.aClass134_Sub2_32.anInt6591 << 16) / (local566 - local663);
						local758 = local528 + ((local528 - local625) * local746 >> 16);
						local770 = local547 + ((local547 - local644) * local746 >> 16);
						arg1.anInt4680 = this.aClass134_Sub2_32.anInt6567 * local758 / this.aClass134_Sub2_32.anInt6591 + this.aClass134_Sub2_32.anInt6585;
						arg1.anInt4679 = local770 * this.aClass134_Sub2_32.anInt6583 / this.aClass134_Sub2_32.anInt6591 + this.aClass134_Sub2_32.anInt6568;
					}
				}
			}
			if (local492) {
				arg1.aBoolean353 = true;
				if (local566 <= local663) {
					arg1.anInt4678 = this.aClass134_Sub2_32.anInt6585 + this.aClass134_Sub2_32.anInt6567 * (local625 + this.aShort104) / local663 - arg1.anInt4682;
				} else {
					arg1.anInt4678 = this.aClass134_Sub2_32.anInt6567 * (this.aShort104 + local528) / local566 + this.aClass134_Sub2_32.anInt6585 - arg1.anInt4680;
				}
			}
		}
		this.aClass134_Sub2_32.method5258();
		this.aClass134_Sub2_32.method5206(local25);
		this.method5925();
		this.aClass134_Sub2_32.method5201();
		this.method5933();
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)V")
	private void method5925() {
		if (this.anInt7446 == 0) {
			return;
		}
		if (this.aByte100 != 0) {
			this.method5924(true);
		}
		this.method5924(false);
		if (this.aClass183_1 != null) {
			if (this.aClass183_1.anInterface23_1 == null) {
				this.method5929((this.aByte100 & 0x10) != 0);
			}
			if (this.aClass183_1.anInterface23_1 != null) {
				this.aClass134_Sub2_32.method5190(this.aClass213_10 != null);
				this.aClass134_Sub2_32.method5259(this.aClass213_8, this.aClass213_10, this.aClass213_9, this.aClass213_7);
				@Pc(76) int local76 = this.anIntArray571.length - 1;
				for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
					@Pc(85) int local85 = this.anIntArray571[local78];
					@Pc(92) int local92 = this.anIntArray571[local78 + 1];
					@Pc(99) int local99 = this.aShortArray121[local85] & 0xFFFF;
					if (local99 == 65535) {
						local99 = -1;
					}
					this.aClass134_Sub2_32.method5193(this.aClass213_10 != null, local99);
					this.aClass134_Sub2_32.method5219(local85 * 3, this.aClass183_1.anInterface23_1, (local92 - local85) * 3);
				}
			}
		}
		this.method5919();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	private void method5926() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt7401; local29++) {
			@Pc(36) int local36 = this.anIntArray570[local29];
			@Pc(41) int local41 = this.anIntArray567[local29];
			if (local41 < local9) {
				local9 = local41;
			}
			if (local15 < local41) {
				local15 = local41;
			}
			@Pc(60) int local60 = this.anIntArray568[local29];
			if (local36 < local7) {
				local7 = local36;
			}
			if (local36 > local13) {
				local13 = local36;
			}
			if (local60 > local17) {
				local17 = local60;
			}
			if (local11 > local60) {
				local11 = local60;
			}
			@Pc(93) int local93 = local36 * local36 + local60 * local60;
			if (local93 > local19) {
				local19 = local93;
			}
			local93 = local60 * local60 + local36 * local36 + local41 * local41;
			if (local21 < local93) {
				local21 = local93;
			}
		}
		this.aShort100 = (short) local9;
		this.aShort97 = (short) local13;
		this.aShort101 = (short) local17;
		this.aShort96 = (short) local11;
		this.aShort103 = (short) local7;
		this.aShort102 = (short) local15;
		this.aShort104 = (short) (Math.sqrt((double) local19) + 0.99D);
		this.aShort98 = (short) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean581 = true;
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "()Z")
	@Override
	public boolean method7430() {
		if (this.aShortArray121 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray121.length; local12++) {
			if (this.aShortArray121[local12] != -1 && !this.aClass134_Sub2_32.anInterface7_10.method3871(this.aShortArray121[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qf", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7401; local7++) {
			this.anIntArray568[local7] = -this.anIntArray568[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt7396; local25++) {
			this.aShortArray120[local25] = (short) -this.aShortArray120[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt7408; local44++) {
			@Pc(51) short local51 = this.aShortArray115[local44];
			this.aShortArray115[local44] = this.aShortArray122[local44];
			this.aShortArray122[local44] = local51;
		}
		if (this.aClass213_10 == null && this.aClass213_9 != null) {
			this.aClass213_9.anInterface5_1 = null;
		}
		if (this.aClass213_10 != null) {
			this.aClass213_10.anInterface5_1 = null;
		}
		if (this.aClass213_7 != null) {
			this.aClass213_7.anInterface5_1 = null;
		}
		if (this.aClass183_1 != null) {
			this.aClass183_1.anInterface23_1 = null;
		}
		this.aBoolean581 = false;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "()[Lclient!in;")
	@Override
	public Class158[] method7413() {
		return this.aClass158Array4;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
	private void method5929(@OriginalArg(0) boolean arg0) {
		if (this.aClass134_Sub2_32.aClass1_Sub35_Sub1_2.aByteArray85.length < this.anInt7446 * 6) {
			this.aClass134_Sub2_32.aClass1_Sub35_Sub1_2 = new Class1_Sub35_Sub1(this.anInt7446 * 6 + 600);
		} else {
			this.aClass134_Sub2_32.aClass1_Sub35_Sub1_2.anInt7214 = 0;
		}
		@Pc(42) Class1_Sub35_Sub1 local42 = this.aClass134_Sub2_32.aClass1_Sub35_Sub1_2;
		@Pc(56) int local56;
		if (this.aClass134_Sub2_32.aBoolean517) {
			for (local56 = 0; local56 < this.anInt7446; local56++) {
				local42.method5776(this.aShortArray115[local56]);
				local42.method5776(this.aShortArray119[local56]);
				local42.method5776(this.aShortArray122[local56]);
			}
		} else {
			for (local56 = 0; local56 < this.anInt7446; local56++) {
				local42.method5767(this.aShortArray115[local56]);
				local42.method5767(this.aShortArray119[local56]);
				local42.method5767(this.aShortArray122[local56]);
			}
		}
		if (local42.anInt7214 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface23_3 == null) {
				this.anInterface23_3 = this.aClass134_Sub2_32.method5223(local42.aByteArray85, true, local42.anInt7214);
			} else {
				this.anInterface23_3.method5061(local42.anInt7214, local42.aByteArray85);
			}
			this.aClass183_1.anInterface23_1 = this.anInterface23_3;
		} else {
			this.aClass183_1.anInterface23_1 = this.aClass134_Sub2_32.method5223(local42.aByteArray85, false, local42.anInt7214);
		}
		if (!arg0) {
			this.aBoolean583 = true;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIFIJIFILclient!lm;I)S")
	private short method5930(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class210 arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray569[arg8];
		@Pc(17) int local17 = this.anIntArray569[arg8 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(26) int local26 = local10; local26 < local17; local26++) {
			@Pc(33) short local33 = this.aShortArray118[local26];
			if (local33 == 0) {
				local19 = local26;
				break;
			}
			if (Static338.aLongArray25[local26] == arg3) {
				return (short) (local33 - 1);
			}
		}
		this.aShortArray118[local19] = (short) (this.anInt7396 + 1);
		Static338.aLongArray25[local19] = arg3;
		this.aShortArray114[this.anInt7396] = (short) arg4;
		this.aShortArray124[this.anInt7396] = (short) arg2;
		this.aShortArray120[this.anInt7396] = (short) arg6;
		this.aByteArray87[this.anInt7396] = (byte) arg0;
		this.aFloatArray44[this.anInt7396] = arg1;
		this.lb[this.anInt7396] = arg5;
		return (short) this.anInt7396++;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg2 << 4;
			local22 = arg4 << 4;
			Static38.anInt604 = 0;
			Static243.anInt4477 = 0;
			local28 = 0;
			Static420.anInt7307 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray160.length) {
					local52 = this.anIntArrayArray160[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static38.anInt604 += this.anIntArray570[local60];
						Static243.anInt4477 += this.anIntArray567[local60];
						local28++;
						Static420.anInt7307 += this.anIntArray568[local60];
					}
				}
			}
			if (local28 <= 0) {
				Static243.anInt4477 = local14;
				Static38.anInt604 = local18;
				Static420.anInt7307 = local22;
			} else {
				Static420.anInt7307 = Static420.anInt7307 / local28 + local22;
				Static38.anInt604 = local18 + Static38.anInt604 / local28;
				Static243.anInt4477 = Static243.anInt4477 / local28 + local14;
			}
			return;
		}
		@Pc(166) int[] local166;
		@Pc(168) int local168;
		if (arg0 == 1) {
			local22 = arg4 << 4;
			local14 = arg3 << 4;
			local18 = arg2 << 4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray160.length) {
					local166 = this.anIntArrayArray160[local32];
					for (local168 = 0; local168 < local166.length; local168++) {
						local54 = local166[local168];
						this.anIntArray570[local54] += local18;
						this.anIntArray567[local54] += local14;
						this.anIntArray568[local54] += local22;
					}
				}
			}
			return;
		}
		@Pc(288) int local288;
		@Pc(307) int local307;
		@Pc(764) int local764;
		if (arg0 == 2) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray160.length > local32) {
					local166 = this.anIntArrayArray160[local32];
					if ((arg5 & 0x1) == 0) {
						for (local168 = 0; local168 < local166.length; local168++) {
							local54 = local166[local168];
							this.anIntArray570[local54] -= Static38.anInt604;
							this.anIntArray567[local54] -= Static243.anInt4477;
							this.anIntArray568[local54] -= Static420.anInt7307;
							if (arg4 != 0) {
								local60 = Class1_Sub6_Sub2.anIntArray675[arg4];
								local288 = Class1_Sub6_Sub2.anIntArray676[arg4];
								local307 = this.anIntArray567[local54] * local60 + local288 * this.anIntArray570[local54] + 16383 >> 14;
								this.anIntArray567[local54] = local288 * this.anIntArray567[local54] + 16383 - this.anIntArray570[local54] * local60 >> 14;
								this.anIntArray570[local54] = local307;
							}
							if (arg2 != 0) {
								local60 = Class1_Sub6_Sub2.anIntArray675[arg2];
								local288 = Class1_Sub6_Sub2.anIntArray676[arg2];
								local307 = this.anIntArray567[local54] * local288 + 16383 - this.anIntArray568[local54] * local60 >> 14;
								this.anIntArray568[local54] = local288 * this.anIntArray568[local54] + local60 * this.anIntArray567[local54] + 16383 >> 14;
								this.anIntArray567[local54] = local307;
							}
							if (arg3 != 0) {
								local60 = Class1_Sub6_Sub2.anIntArray675[arg3];
								local288 = Class1_Sub6_Sub2.anIntArray676[arg3];
								local307 = local288 * this.anIntArray570[local54] + local60 * this.anIntArray568[local54] + 16383 >> 14;
								this.anIntArray568[local54] = this.anIntArray568[local54] * local288 + 16383 - local60 * this.anIntArray570[local54] >> 14;
								this.anIntArray570[local54] = local307;
							}
							this.anIntArray570[local54] += Static38.anInt604;
							this.anIntArray567[local54] += Static243.anInt4477;
							this.anIntArray568[local54] += Static420.anInt7307;
						}
					} else {
						for (local168 = 0; local168 < local166.length; local168++) {
							local54 = local166[local168];
							this.anIntArray570[local54] -= Static38.anInt604;
							this.anIntArray567[local54] -= Static243.anInt4477;
							this.anIntArray568[local54] -= Static420.anInt7307;
							if (arg2 != 0) {
								local60 = Class1_Sub6_Sub2.anIntArray675[arg2];
								local288 = Class1_Sub6_Sub2.anIntArray676[arg2];
								local307 = local288 * this.anIntArray567[local54] + 16383 - local60 * this.anIntArray568[local54] >> 14;
								this.anIntArray568[local54] = local288 * this.anIntArray568[local54] + this.anIntArray567[local54] * local60 + 16383 >> 14;
								this.anIntArray567[local54] = local307;
							}
							if (arg4 != 0) {
								local60 = Class1_Sub6_Sub2.anIntArray675[arg4];
								local288 = Class1_Sub6_Sub2.anIntArray676[arg4];
								local307 = this.anIntArray567[local54] * local60 + local288 * this.anIntArray570[local54] + 16383 >> 14;
								this.anIntArray567[local54] = this.anIntArray567[local54] * local288 + 16383 - local60 * this.anIntArray570[local54] >> 14;
								this.anIntArray570[local54] = local307;
							}
							if (arg3 != 0) {
								local60 = Class1_Sub6_Sub2.anIntArray675[arg3];
								local288 = Class1_Sub6_Sub2.anIntArray676[arg3];
								local307 = local60 * this.anIntArray568[local54] + this.anIntArray570[local54] * local288 + 16383 >> 14;
								this.anIntArray568[local54] = local288 * this.anIntArray568[local54] + 16383 - this.anIntArray570[local54] * local60 >> 14;
								this.anIntArray570[local54] = local307;
							}
							this.anIntArray570[local54] += Static38.anInt604;
							this.anIntArray567[local54] += Static243.anInt4477;
							this.anIntArray568[local54] += Static420.anInt7307;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray160.length) {
						local52 = this.anIntArrayArray160[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local288 = this.anIntArray569[local60];
							local307 = this.anIntArray569[local60 + 1];
							for (local764 = local288; local764 < local307; local764++) {
								@Pc(773) int local773 = this.aShortArray118[local764] - 1;
								if (local773 == -1) {
									break;
								}
								@Pc(782) int local782;
								@Pc(786) int local786;
								@Pc(804) int local804;
								if (arg4 != 0) {
									local782 = Class1_Sub6_Sub2.anIntArray675[arg4];
									local786 = Class1_Sub6_Sub2.anIntArray676[arg4];
									local804 = this.aShortArray114[local773] * local786 + local782 * this.aShortArray124[local773] + 16383 >> 14;
									this.aShortArray124[local773] = (short) (local786 * this.aShortArray124[local773] + 16383 - this.aShortArray114[local773] * local782 >> 14);
									this.aShortArray114[local773] = (short) local804;
								}
								if (arg2 != 0) {
									local782 = Class1_Sub6_Sub2.anIntArray675[arg2];
									local786 = Class1_Sub6_Sub2.anIntArray676[arg2];
									local804 = local786 * this.aShortArray124[local773] + 16383 - local782 * this.aShortArray120[local773] >> 14;
									this.aShortArray120[local773] = (short) (local786 * this.aShortArray120[local773] + local782 * this.aShortArray124[local773] + 16383 >> 14);
									this.aShortArray124[local773] = (short) local804;
								}
								if (arg3 != 0) {
									local782 = Class1_Sub6_Sub2.anIntArray675[arg3];
									local786 = Class1_Sub6_Sub2.anIntArray676[arg3];
									local804 = local782 * this.aShortArray120[local773] + this.aShortArray114[local773] * local786 + 16383 >> 14;
									this.aShortArray120[local773] = (short) (local786 * this.aShortArray120[local773] + 16383 - local782 * this.aShortArray114[local773] >> 14);
									this.aShortArray114[local773] = (short) local804;
								}
							}
						}
					}
				}
				if (this.aClass213_10 == null && this.aClass213_9 != null) {
					this.aClass213_9.anInterface5_1 = null;
				}
				if (this.aClass213_10 != null) {
					this.aClass213_10.anInterface5_1 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray160.length) {
					local166 = this.anIntArrayArray160[local32];
					for (local168 = 0; local168 < local166.length; local168++) {
						local54 = local166[local168];
						this.anIntArray570[local54] -= Static38.anInt604;
						this.anIntArray567[local54] -= Static243.anInt4477;
						this.anIntArray568[local54] -= Static420.anInt7307;
						this.anIntArray570[local54] = arg2 * this.anIntArray570[local54] >> 7;
						this.anIntArray567[local54] = this.anIntArray567[local54] * arg3 >> 7;
						this.anIntArray568[local54] = this.anIntArray568[local54] * arg4 >> 7;
						this.anIntArray570[local54] += Static38.anInt604;
						this.anIntArray567[local54] += Static243.anInt4477;
						this.anIntArray568[local54] += Static420.anInt7307;
					}
				}
			}
		} else {
			@Pc(1221) Class287 local1221;
			@Pc(1226) Class166 local1226;
			if (arg0 == 5) {
				if (this.anIntArrayArray161 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray161.length > local32) {
							local166 = this.anIntArrayArray161[local32];
							for (local168 = 0; local168 < local166.length; local168++) {
								local54 = local166[local168];
								local60 = arg2 * 8 + (this.aByteArray86[local54] & 0xFF);
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray86[local54] = (byte) local60;
							}
							if (local166.length > 0 && this.aClass213_9 != null) {
								this.aClass213_9.anInterface5_1 = null;
							}
						}
					}
					if (this.aClass287Array1 != null) {
						for (local32 = 0; local32 < this.anInt7426; local32++) {
							local1221 = this.aClass287Array1[local32];
							local1226 = this.aClass166Array1[local32];
							local1226.anInt4316 = local1226.anInt4316 & 0xFFFFFF | 255 - (this.aByteArray86[local1221.anInt7742] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1475) Class166 local1475;
				if (arg0 == 8) {
					if (this.anIntArrayArray159 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray159.length) {
								local166 = this.anIntArrayArray159[local32];
								for (local168 = 0; local168 < local166.length; local168++) {
									local1475 = this.aClass166Array1[local166[local168]];
									local1475.anInt4307 += arg3;
									local1475.anInt4315 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray159 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray159.length > local32) {
								local166 = this.anIntArrayArray159[local32];
								for (local168 = 0; local168 < local166.length; local168++) {
									local1475 = this.aClass166Array1[local166[local168]];
									local1475.anInt4312 = arg2 * local1475.anInt4312 >> 7;
									local1475.anInt4308 = arg3 * local1475.anInt4308 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray159 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray159.length > local32) {
							local166 = this.anIntArrayArray159[local32];
							for (local168 = 0; local168 < local166.length; local168++) {
								local1475 = this.aClass166Array1[local166[local168]];
								local1475.anInt4310 = arg2 + local1475.anInt4310 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray161 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray161.length > local32) {
						local166 = this.anIntArrayArray161[local32];
						for (local168 = 0; local168 < local166.length; local168++) {
							local54 = local166[local168];
							local60 = this.aShortArray123[local54] & 0xFFFF;
							local288 = local60 >> 10 & 0x3F;
							local307 = local60 >> 7 & 0x7;
							@Pc(1314) int local1314 = arg2 + local288 & 0x3F;
							local764 = local60 & 0x7F;
							local307 += arg3 / 4;
							local764 += arg4;
							if (local307 < 0) {
								local307 = 0;
							} else if (local307 > 7) {
								local307 = 7;
							}
							if (local764 < 0) {
								local764 = 0;
							} else if (local764 > 127) {
								local764 = 127;
							}
							this.aShortArray123[local54] = (short) (local307 << 7 | local1314 << 10 | local764);
						}
						if (local166.length > 0 && this.aClass213_9 != null) {
							this.aClass213_9.anInterface5_1 = null;
						}
					}
				}
				if (this.aClass287Array1 != null) {
					for (local32 = 0; local32 < this.anInt7426; local32++) {
						local1221 = this.aClass287Array1[local32];
						local1226 = this.aClass166Array1[local32];
						local1226.anInt4316 = Static379.anIntArray506[this.aShortArray123[local1221.anInt7742] & 0xFFFF] & 0xFFFFFF | local1226.anInt4316 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "()[Lclient!lea;")
	@Override
	public Class206[] method7421() {
		return this.aClass206Array4;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!q;Lclient!kd;II)V")
	@Override
	public void method7420(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class8_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7396 == 0) {
			return;
		}
		@Pc(16) Class113_Sub2 local16 = this.aClass134_Sub2_32.aClass113_Sub2_3;
		if (!this.aBoolean581) {
			this.method5926();
		}
		@Pc(25) Class113_Sub2 local25 = (Class113_Sub2) arg0;
		Static121.aFloat34 = local16.aFloat64 * local25.aFloat71 + local16.aFloat71 * local25.aFloat66 + local25.aFloat70 * local16.aFloat63;
		Static116.aFloat31 = local16.aFloat64 * local25.aFloat69 + local25.aFloat68 * local16.aFloat63 + local25.aFloat62 * local16.aFloat71 + local16.aFloat69;
		@Pc(72) float local72 = Static121.aFloat34 * (float) this.aShort100 + Static116.aFloat31;
		@Pc(80) float local80 = (float) this.aShort102 * Static121.aFloat34 + Static116.aFloat31;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local97 = local72 + (float) this.aShort104;
			local91 = (float) -this.aShort104 + local80;
		} else {
			local91 = (float) -this.aShort104 + local72;
			local97 = (float) this.aShort104 + local80;
		}
		if (local91 >= this.aClass134_Sub2_32.aFloat158 || local97 <= (float) this.aClass134_Sub2_32.anInt6591) {
			return;
		}
		Static565.aFloat210 = local16.aFloat72 * local25.aFloat71 + local16.aFloat67 * local25.aFloat70 + local16.aFloat70 * local25.aFloat66;
		Static105.aFloat23 = local16.aFloat68 + local16.aFloat72 * local25.aFloat69 + local25.aFloat62 * local16.aFloat70 + local16.aFloat67 * local25.aFloat68;
		@Pc(174) float local174 = (float) this.aShort100 * Static565.aFloat210 + Static105.aFloat23;
		@Pc(182) float local182 = (float) this.aShort102 * Static565.aFloat210 + Static105.aFloat23;
		@Pc(208) float local208;
		@Pc(197) float local197;
		if (local174 > local182) {
			local197 = (float) this.aClass134_Sub2_32.anInt6567 * ((float) this.aShort104 + local174);
			local208 = (float) this.aClass134_Sub2_32.anInt6567 * ((float) -this.aShort104 + local182);
		} else {
			local197 = (local182 + (float) this.aShort104) * (float) this.aClass134_Sub2_32.anInt6567;
			local208 = (local174 - (float) this.aShort104) * (float) this.aClass134_Sub2_32.anInt6567;
		}
		if (local208 / (float) arg2 >= this.aClass134_Sub2_32.aFloat146 || this.aClass134_Sub2_32.aFloat151 >= local197 / (float) arg2) {
			return;
		}
		Static558.aFloat209 = local16.aFloat62 + local25.aFloat69 * local16.aFloat73 + local25.aFloat68 * local16.aFloat65 + local16.aFloat66 * local25.aFloat62;
		Static233.aFloat181 = local16.aFloat65 * local25.aFloat70 + local16.aFloat66 * local25.aFloat66 + local16.aFloat73 * local25.aFloat71;
		@Pc(300) float local300 = Static558.aFloat209 + Static233.aFloat181 * (float) this.aShort100;
		@Pc(308) float local308 = (float) this.aShort102 * Static233.aFloat181 + Static558.aFloat209;
		@Pc(324) float local324;
		@Pc(335) float local335;
		if (local300 > local308) {
			local324 = ((float) -this.aShort104 + local308) * (float) this.aClass134_Sub2_32.anInt6583;
			local335 = ((float) this.aShort104 + local300) * (float) this.aClass134_Sub2_32.anInt6583;
		} else {
			local335 = (local308 + (float) this.aShort104) * (float) this.aClass134_Sub2_32.anInt6583;
			local324 = ((float) -this.aShort104 + local300) * (float) this.aClass134_Sub2_32.anInt6583;
		}
		if (local324 / (float) arg2 >= this.aClass134_Sub2_32.aFloat140 || this.aClass134_Sub2_32.aFloat155 >= local335 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass287Array1 != null) {
			Static557.aFloat208 = local25.aFloat63 * local16.aFloat73 + local16.aFloat66 * local25.aFloat65 + local16.aFloat65 * local25.aFloat67;
			Static322.aFloat125 = local25.aFloat64 * local16.aFloat72 + local25.aFloat72 * local16.aFloat67 + local25.aFloat73 * local16.aFloat70;
			Static545.aFloat207 = local25.aFloat67 * local16.aFloat63 + local16.aFloat71 * local25.aFloat65 + local16.aFloat64 * local25.aFloat63;
			Static156.aFloat52 = local25.aFloat72 * local16.aFloat63 + local16.aFloat71 * local25.aFloat73 + local16.aFloat64 * local25.aFloat64;
			Static152.aFloat44 = local25.aFloat63 * local16.aFloat72 + local25.aFloat67 * local16.aFloat67 + local25.aFloat65 * local16.aFloat70;
			Static340.aFloat130 = local16.aFloat66 * local25.aFloat73 + local25.aFloat72 * local16.aFloat65 + local25.aFloat64 * local16.aFloat73;
		}
		if (arg1 != null) {
			@Pc(503) int local503 = this.aShort97 + this.aShort103 >> 1;
			@Pc(511) int local511 = this.aShort101 + this.aShort96 >> 1;
			@Pc(530) int local530 = (int) ((float) local503 * Static152.aFloat44 + Static105.aFloat23 + Static565.aFloat210 * (float) this.aShort100 + (float) local511 * Static322.aFloat125);
			@Pc(549) int local549 = (int) ((float) local503 * Static557.aFloat208 + Static558.aFloat209 + Static233.aFloat181 * (float) this.aShort100 + (float) local511 * Static340.aFloat130);
			@Pc(568) int local568 = (int) (Static156.aFloat52 * (float) local511 + (float) this.aShort100 * Static121.aFloat34 + (float) local503 * Static545.aFloat207 + Static116.aFloat31);
			@Pc(587) int local587 = (int) ((float) local511 * Static322.aFloat125 + Static565.aFloat210 * (float) this.aShort102 + Static105.aFloat23 + Static152.aFloat44 * (float) local503);
			@Pc(606) int local606 = (int) (Static233.aFloat181 * (float) this.aShort102 + Static558.aFloat209 + Static557.aFloat208 * (float) local503 + (float) local511 * Static340.aFloat130);
			@Pc(625) int local625 = (int) (Static156.aFloat52 * (float) local511 + Static116.aFloat31 + (float) local503 * Static545.aFloat207 + (float) this.aShort102 * Static121.aFloat34);
			arg1.anInt4681 = this.aClass134_Sub2_32.anInt6568 + this.aClass134_Sub2_32.anInt6583 * local606 / arg2;
			arg1.anInt4679 = this.aClass134_Sub2_32.anInt6583 * local549 / arg2 + this.aClass134_Sub2_32.anInt6568;
			arg1.anInt4682 = this.aClass134_Sub2_32.anInt6585 + this.aClass134_Sub2_32.anInt6567 * local587 / arg2;
			arg1.anInt4680 = this.aClass134_Sub2_32.anInt6585 + this.aClass134_Sub2_32.anInt6567 * local530 / arg2;
			if (local568 >= this.aClass134_Sub2_32.anInt6591 || local625 >= this.aClass134_Sub2_32.anInt6591) {
				arg1.aBoolean353 = true;
				arg1.anInt4678 = this.aClass134_Sub2_32.anInt6585 + (this.aShort104 + local530) * this.aClass134_Sub2_32.anInt6567 / arg2 - arg1.anInt4680;
			}
		}
		this.aClass134_Sub2_32.method5208((float) arg2);
		this.aClass134_Sub2_32.method5196();
		this.aClass134_Sub2_32.method5206(local25);
		this.method5925();
		this.aClass134_Sub2_32.method5201();
		this.method5933();
	}

	@OriginalMember(owner = "client!qf", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort99 = (short) arg0;
		if (this.aClass213_9 != null) {
			this.aClass213_9.anInterface5_1 = null;
		}
		if (this.aClass213_10 != null) {
			this.aClass213_10.anInterface5_1 = null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class1_Sub6_Sub5 S(@OriginalArg(0) Class1_Sub6_Sub5 arg0) {
		if (this.anInt7396 == 0) {
			return null;
		}
		if (!this.aBoolean581) {
			this.method5926();
		}
		@Pc(40) int local40;
		@Pc(56) int local56;
		if (this.aClass134_Sub2_32.anInt6587 > 0) {
			local40 = this.aShort103 - (this.aShort102 * this.aClass134_Sub2_32.anInt6587 >> 8) >> this.aClass134_Sub2_32.anInt6550;
			local56 = this.aShort97 - (this.aClass134_Sub2_32.anInt6587 * this.aShort100 >> 8) >> this.aClass134_Sub2_32.anInt6550;
		} else {
			local40 = this.aShort103 - (this.aClass134_Sub2_32.anInt6587 * this.aShort100 >> 8) >> this.aClass134_Sub2_32.anInt6550;
			local56 = this.aShort97 - (this.aClass134_Sub2_32.anInt6587 * this.aShort102 >> 8) >> this.aClass134_Sub2_32.anInt6550;
		}
		@Pc(113) int local113;
		@Pc(130) int local130;
		if (this.aClass134_Sub2_32.anInt6588 <= 0) {
			local113 = this.aShort96 - (this.aShort100 * this.aClass134_Sub2_32.anInt6588 >> 8) >> this.aClass134_Sub2_32.anInt6550;
			local130 = this.aShort101 - (this.aClass134_Sub2_32.anInt6588 * this.aShort102 >> 8) >> this.aClass134_Sub2_32.anInt6550;
		} else {
			local113 = this.aShort96 - (this.aClass134_Sub2_32.anInt6588 * this.aShort102 >> 8) >> this.aClass134_Sub2_32.anInt6550;
			local130 = this.aShort101 - (this.aShort100 * this.aClass134_Sub2_32.anInt6588 >> 8) >> this.aClass134_Sub2_32.anInt6550;
		}
		@Pc(171) int local171 = local56 + 1 - local40;
		@Pc(178) int local178 = local130 + 1 - local113;
		@Pc(181) Class1_Sub6_Sub5_Sub1 local181 = (Class1_Sub6_Sub5_Sub1) arg0;
		@Pc(197) Class1_Sub6_Sub5_Sub1 local197;
		if (local181 != null && local181.method7150(local178, local171)) {
			local197 = local181;
			local181.method7151();
		} else {
			local197 = new Class1_Sub6_Sub5_Sub1(this.aClass134_Sub2_32, local171, local178);
		}
		local197.method7148(local56, local40, local130, local113);
		this.method5922(local197);
		return local197;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7409(@OriginalArg(0) Class113 arg0) {
		@Pc(8) Class113_Sub2 local8 = (Class113_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass206Array4 != null) {
			for (local13 = 0; local13 < this.aClass206Array4.length; local13++) {
				@Pc(20) Class206 local20 = this.aClass206Array4[local13];
				@Pc(22) Class206 local22 = local20;
				if (local20.aClass206_1 != null) {
					local22 = local20.aClass206_1;
				}
				local22.anInt5066 = (int) (local8.aFloat72 * (float) this.anIntArray568[local20.anInt5078] + (float) this.anIntArray567[local20.anInt5078] * local8.aFloat70 + (float) this.anIntArray570[local20.anInt5078] * local8.aFloat67 + local8.aFloat68);
				local22.anInt5081 = (int) (local8.aFloat66 * (float) this.anIntArray567[local20.anInt5078] + local8.aFloat65 * (float) this.anIntArray570[local20.anInt5078] + local8.aFloat73 * (float) this.anIntArray568[local20.anInt5078] + local8.aFloat62);
				local22.anInt5073 = (int) (local8.aFloat69 + local8.aFloat71 * (float) this.anIntArray567[local20.anInt5078] + local8.aFloat63 * (float) this.anIntArray570[local20.anInt5078] + local8.aFloat64 * (float) this.anIntArray568[local20.anInt5078]);
				local22.anInt5072 = (int) (local8.aFloat68 + local8.aFloat67 * (float) this.anIntArray570[local20.anInt5079] + local8.aFloat70 * (float) this.anIntArray567[local20.anInt5079] + (float) this.anIntArray568[local20.anInt5079] * local8.aFloat72);
				local22.anInt5070 = (int) ((float) this.anIntArray570[local20.anInt5079] * local8.aFloat65 + local8.aFloat66 * (float) this.anIntArray567[local20.anInt5079] + local8.aFloat73 * (float) this.anIntArray568[local20.anInt5079] + local8.aFloat62);
				local22.anInt5071 = (int) (local8.aFloat69 + (float) this.anIntArray570[local20.anInt5079] * local8.aFloat63 + (float) this.anIntArray567[local20.anInt5079] * local8.aFloat71 + local8.aFloat64 * (float) this.anIntArray568[local20.anInt5079]);
				local22.anInt5083 = (int) (local8.aFloat68 + (float) this.anIntArray568[local20.anInt5080] * local8.aFloat72 + (float) this.anIntArray567[local20.anInt5080] * local8.aFloat70 + local8.aFloat67 * (float) this.anIntArray570[local20.anInt5080]);
				local22.anInt5075 = (int) (local8.aFloat62 + (float) this.anIntArray570[local20.anInt5080] * local8.aFloat65 + local8.aFloat66 * (float) this.anIntArray567[local20.anInt5080] + (float) this.anIntArray568[local20.anInt5080] * local8.aFloat73);
				local22.anInt5082 = (int) ((float) this.anIntArray570[local20.anInt5080] * local8.aFloat63 + local8.aFloat71 * (float) this.anIntArray567[local20.anInt5080] + (float) this.anIntArray568[local20.anInt5080] * local8.aFloat64 + local8.aFloat69);
			}
		}
		if (this.aClass158Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass158Array4.length; local13++) {
			@Pc(361) Class158 local361 = this.aClass158Array4[local13];
			@Pc(363) Class158 local363 = local361;
			if (local361.aClass158_1 != null) {
				local363 = local361.aClass158_1;
			}
			if (local361.aClass113_1 == null) {
				local361.aClass113_1 = local8.method6103();
			} else {
				local361.aClass113_1.M(local8);
			}
			local363.anInt4244 = (int) (local8.aFloat72 * (float) this.anIntArray568[local361.anInt4248] + (float) this.anIntArray567[local361.anInt4248] * local8.aFloat70 + local8.aFloat67 * (float) this.anIntArray570[local361.anInt4248] + local8.aFloat68);
			local363.anInt4247 = (int) (local8.aFloat62 + (float) this.anIntArray568[local361.anInt4248] * local8.aFloat73 + local8.aFloat66 * (float) this.anIntArray567[local361.anInt4248] + local8.aFloat65 * (float) this.anIntArray570[local361.anInt4248]);
			local363.anInt4249 = (int) (local8.aFloat63 * (float) this.anIntArray570[local361.anInt4248] + (float) this.anIntArray567[local361.anInt4248] * local8.aFloat71 + (float) this.anIntArray568[local361.anInt4248] * local8.aFloat64 + local8.aFloat69);
		}
	}

	@OriginalMember(owner = "client!qf", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt7455;
	}

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean581) {
			this.method5926();
		}
		return this.aShort97;
	}

	@OriginalMember(owner = "client!qf", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass134_Sub2_32.anInterface7_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7408; local11++) {
			if (arg0 == this.aShortArray121[local11]) {
				this.aShortArray121[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class3 local48 = local9.method3874(arg0 & 0xFFFF);
			local35 = local48.aByte2;
			local37 = local48.aByte5;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(69) Class3 local69 = local9.method3874(arg1 & 0xFFFF);
			local58 = local69.aByte5;
			local56 = local69.aByte2;
		}
		if (!(local56 != local35 | local37 != local58)) {
			return;
		}
		if (this.aClass287Array1 != null) {
			for (@Pc(102) int local102 = 0; local102 < this.anInt7426; local102++) {
				@Pc(109) Class287 local109 = this.aClass287Array1[local102];
				@Pc(114) Class166 local114 = this.aClass166Array1[local102];
				local114.anInt4316 = Static379.anIntArray506[this.aShortArray123[local109.anInt7742] & 0xFFFF] & 0xFFFFFF | local114.anInt4316 & 0xFF000000;
			}
		}
		if (this.aClass213_9 != null) {
			this.aClass213_9.anInterface5_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "()V")
	@Override
	protected void method7422() {
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
	private void method5933() {
		if (this.aClass287Array1 == null) {
			return;
		}
		@Pc(18) Class113_Sub2 local18 = this.aClass134_Sub2_32.aClass113_Sub2_2;
		this.aClass134_Sub2_32.method5226();
		this.aClass134_Sub2_32.ZA(false);
		this.aClass134_Sub2_32.method5190(false);
		this.aClass134_Sub2_32.method5259(this.aClass134_Sub2_32.aClass213_5, null, null, this.aClass134_Sub2_32.aClass213_6);
		for (@Pc(45) int local45 = 0; local45 < this.anInt7426; local45++) {
			@Pc(52) Class287 local52 = this.aClass287Array1[local45];
			@Pc(57) Class166 local57 = this.aClass166Array1[local45];
			if (!local52.aBoolean595 || !this.aClass134_Sub2_32.method6917()) {
				@Pc(86) float local86 = (float) (this.anIntArray570[local52.anInt7746] + this.anIntArray570[local52.anInt7741] + this.anIntArray570[local52.anInt7743]) * 0.3333333F;
				@Pc(107) float local107 = (float) (this.anIntArray567[local52.anInt7746] + this.anIntArray567[local52.anInt7741] + this.anIntArray567[local52.anInt7743]) * 0.3333333F;
				@Pc(128) float local128 = (float) (this.anIntArray568[local52.anInt7743] + this.anIntArray568[local52.anInt7746] + this.anIntArray568[local52.anInt7741]) * 0.3333333F;
				@Pc(142) float local142 = Static322.aFloat125 * local128 + Static565.aFloat210 * local107 + local86 * Static152.aFloat44 + Static105.aFloat23;
				@Pc(156) float local156 = local128 * Static340.aFloat130 + local86 * Static557.aFloat208 + Static233.aFloat181 * local107 + Static558.aFloat209;
				@Pc(170) float local170 = Static121.aFloat34 * local107 + Static545.aFloat207 * local86 + local128 * Static156.aFloat52 + Static116.aFloat31;
				local18.method2601((float) local57.anInt4307 - local156, local57.anInt4310, (float) local57.anInt4315 + local142, local52.aShort113 * local57.anInt4312 >> 7, local52.aShort111 * local57.anInt4308 >> 7, (float) local52.anInt7740 - local170);
				this.aClass134_Sub2_32.method5220(local18);
				@Pc(214) int local214 = local57.anInt4316;
				OpenGL.glColor4ub((byte) (local214 >> 16), (byte) (local214 >> 8), (byte) local214, (byte) (local214 >> 24));
				this.aClass134_Sub2_32.method5207(local52.aShort112);
				this.aClass134_Sub2_32.method5233(local52.aByte106);
				this.aClass134_Sub2_32.method5229(4);
			}
		}
		this.aClass134_Sub2_32.ZA(true);
		this.aClass134_Sub2_32.method5201();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIZLclient!q;)Z")
	private boolean method5934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class113 arg4) {
		@Pc(8) Class113_Sub2 local8 = (Class113_Sub2) arg4;
		@Pc(12) Class113_Sub2 local12 = this.aClass134_Sub2_32.aClass113_Sub2_3;
		@Pc(33) float local33 = local12.aFloat68 + local12.aFloat72 * local8.aFloat69 + local12.aFloat70 * local8.aFloat62 + local12.aFloat67 * local8.aFloat68;
		@Pc(54) float local54 = local8.aFloat68 * local12.aFloat65 + local8.aFloat62 * local12.aFloat66 + local8.aFloat69 * local12.aFloat73 + local12.aFloat62;
		Static322.aFloat125 = local8.aFloat72 * local12.aFloat67 + local8.aFloat73 * local12.aFloat70 + local8.aFloat64 * local12.aFloat72;
		Static121.aFloat34 = local12.aFloat64 * local8.aFloat71 + local12.aFloat63 * local8.aFloat70 + local12.aFloat71 * local8.aFloat66;
		Static152.aFloat44 = local8.aFloat67 * local12.aFloat67 + local12.aFloat70 * local8.aFloat65 + local8.aFloat63 * local12.aFloat72;
		Static156.aFloat52 = local8.aFloat73 * local12.aFloat71 + local12.aFloat63 * local8.aFloat72 + local8.aFloat64 * local12.aFloat64;
		@Pc(147) float local147 = local12.aFloat69 + local12.aFloat64 * local8.aFloat69 + local12.aFloat63 * local8.aFloat68 + local8.aFloat62 * local12.aFloat71;
		Static233.aFloat181 = local8.aFloat71 * local12.aFloat73 + local12.aFloat65 * local8.aFloat70 + local12.aFloat66 * local8.aFloat66;
		Static565.aFloat210 = local12.aFloat70 * local8.aFloat66 + local8.aFloat70 * local12.aFloat67 + local8.aFloat71 * local12.aFloat72;
		Static340.aFloat130 = local12.aFloat66 * local8.aFloat73 + local12.aFloat65 * local8.aFloat72 + local8.aFloat64 * local12.aFloat73;
		Static557.aFloat208 = local12.aFloat73 * local8.aFloat63 + local8.aFloat67 * local12.aFloat65 + local8.aFloat65 * local12.aFloat66;
		Static545.aFloat207 = local12.aFloat64 * local8.aFloat63 + local8.aFloat65 * local12.aFloat71 + local12.aFloat63 * local8.aFloat67;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass134_Sub2_32.anInt6567;
		@Pc(255) int local255 = this.aClass134_Sub2_32.anInt6583;
		if (!this.aBoolean581) {
			this.method5926();
		}
		Static520.anIntArray668[0] = this.aShort103;
		Static457.anIntArray607[0] = this.aShort100;
		Static520.anIntArray668[1] = this.aShort97;
		Static486.anIntArray629[0] = this.aShort96;
		Static457.anIntArray607[1] = this.aShort100;
		Static486.anIntArray629[1] = this.aShort96;
		Static520.anIntArray668[2] = this.aShort103;
		Static457.anIntArray607[2] = this.aShort102;
		Static486.anIntArray629[2] = this.aShort96;
		Static520.anIntArray668[3] = this.aShort97;
		Static457.anIntArray607[3] = this.aShort102;
		Static486.anIntArray629[3] = this.aShort96;
		Static520.anIntArray668[4] = this.aShort103;
		Static457.anIntArray607[4] = this.aShort100;
		Static520.anIntArray668[5] = this.aShort97;
		Static486.anIntArray629[4] = this.aShort101;
		Static457.anIntArray607[5] = this.aShort100;
		Static486.anIntArray629[5] = this.aShort101;
		Static520.anIntArray668[6] = this.aShort103;
		Static457.anIntArray607[6] = this.aShort102;
		Static520.anIntArray668[7] = this.aShort97;
		Static486.anIntArray629[6] = this.aShort101;
		Static457.anIntArray607[7] = this.aShort102;
		Static486.anIntArray629[7] = this.aShort101;
		@Pc(447) float local447;
		@Pc(433) float local433;
		@Pc(419) float local419;
		@Pc(395) float local395;
		@Pc(400) float local400;
		@Pc(405) float local405;
		for (@Pc(388) int local388 = 0; local388 < 8; local388++) {
			local395 = Static520.anIntArray668[local388];
			local400 = Static457.anIntArray607[local388];
			local405 = Static486.anIntArray629[local388];
			local419 = local405 * Static156.aFloat52 + local400 * Static121.aFloat34 + Static545.aFloat207 * local395 + local147;
			local433 = Static233.aFloat181 * local400 + local395 * Static557.aFloat208 + Static340.aFloat130 * local405 + local54;
			local447 = local33 + Static322.aFloat125 * local405 + Static152.aFloat44 * local395 + local400 * Static565.aFloat210;
			if ((float) this.aClass134_Sub2_32.anInt6591 <= local419) {
				if (arg0 > 0) {
					local419 = arg0;
				}
				@Pc(471) float local471 = (float) this.aClass134_Sub2_32.anInt6585 + local447 * (float) local251 / local419;
				@Pc(483) float local483 = (float) local255 * local433 / local419 + (float) this.aClass134_Sub2_32.anInt6568;
				if (local471 < local241) {
					local241 = local471;
				}
				if (local471 > local243) {
					local243 = local471;
				}
				local239 = true;
				if (local245 > local483) {
					local245 = local483;
				}
				if (local483 > local247) {
					local247 = local483;
				}
			}
		}
		if (local239 && local241 < (float) arg1 && (float) arg1 < local243 && (float) arg2 > local245 && (float) arg2 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt7396 > this.aClass134_Sub2_32.anIntArray512.length) {
				this.aClass134_Sub2_32.anIntArray513 = new int[this.anInt7396];
				this.aClass134_Sub2_32.anIntArray512 = new int[this.anInt7396];
			}
			@Pc(566) int[] local566 = this.aClass134_Sub2_32.anIntArray512;
			@Pc(570) int[] local570 = this.aClass134_Sub2_32.anIntArray513;
			@Pc(659) int local659;
			for (@Pc(572) int local572 = 0; local572 < this.anInt7401; local572++) {
				local395 = this.anIntArray570[local572];
				local405 = this.anIntArray568[local572];
				local400 = this.anIntArray567[local572];
				local419 = local405 * Static156.aFloat52 + Static545.aFloat207 * local395 + local400 * Static121.aFloat34 + local147;
				local447 = local33 + local405 * Static322.aFloat125 + Static565.aFloat210 * local400 + local395 * Static152.aFloat44;
				local433 = local405 * Static340.aFloat130 + local400 * Static233.aFloat181 + local395 * Static557.aFloat208 + local54;
				@Pc(672) int local672;
				@Pc(677) int local677;
				@Pc(684) int local684;
				if (local419 >= (float) this.aClass134_Sub2_32.anInt6591) {
					if (arg0 > 0) {
						local419 = arg0;
					}
					local659 = (int) ((float) this.aClass134_Sub2_32.anInt6585 + (float) local251 * local447 / local419);
					local672 = (int) ((float) local255 * local433 / local419 + (float) this.aClass134_Sub2_32.anInt6568);
					local677 = this.anIntArray569[local572];
					local684 = this.anIntArray569[local572 + 1];
					for (@Pc(686) int local686 = local677; local686 < local684; local686++) {
						@Pc(695) int local695 = this.aShortArray118[local686] - 1;
						if (local695 == -1) {
							break;
						}
						local566[local695] = local659;
						local570[local695] = local672;
					}
				} else {
					local659 = this.anIntArray569[local572];
					local672 = this.anIntArray569[local572 + 1];
					for (local677 = local659; local677 < local672; local677++) {
						local684 = this.aShortArray118[local677] - 1;
						if (local684 == -1) {
							break;
						}
						local566[this.aShortArray118[local677] - 1] = -999999;
					}
				}
			}
			for (local659 = 0; local659 < this.anInt7408; local659++) {
				if (local566[this.aShortArray115[local659]] != -999999 && local566[this.aShortArray119[local659]] != -999999 && local566[this.aShortArray122[local659]] != -999999 && this.method5918(local566[this.aShortArray122[local659]], local570[this.aShortArray122[local659]], arg2, local570[this.aShortArray119[local659]], local570[this.aShortArray115[local659]], arg1, local566[this.aShortArray119[local659]], local566[this.aShortArray115[local659]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean581) {
			this.method5926();
		}
		return this.aShort96;
	}

	@OriginalMember(owner = "client!qf", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub6_Sub2.anIntArray675[arg0];
		@Pc(13) int local13 = Class1_Sub6_Sub2.anIntArray676[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7401; local15++) {
			@Pc(34) int local34 = this.anIntArray567[local15] * local9 + this.anIntArray570[local15] * local13 >> 14;
			this.anIntArray567[local15] = this.anIntArray567[local15] * local13 - this.anIntArray570[local15] * local9 >> 14;
			this.anIntArray570[local15] = local34;
		}
		if (this.aClass213_7 != null) {
			this.aClass213_7.anInterface5_1 = null;
		}
		this.aBoolean581 = false;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5934(arg4, arg0, arg1, arg3, arg2);
	}
}
