import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!rr", name = "A", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!rr", name = "C", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!rr", name = "E", descriptor = "S")
	private short aShort86;

	@OriginalMember(owner = "client!rr", name = "H", descriptor = "[F")
	private float[] aFloatArray34;

	@OriginalMember(owner = "client!rr", name = "O", descriptor = "I")
	private int anInt5885;

	@OriginalMember(owner = "client!rr", name = "Q", descriptor = "S")
	private short aShort87;

	@OriginalMember(owner = "client!rr", name = "T", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!rr", name = "X", descriptor = "Lclient!ik;")
	private Interface3 anInterface3_5;

	@OriginalMember(owner = "client!rr", name = "bb", descriptor = "[I")
	private int[] anIntArray441;

	@OriginalMember(owner = "client!rr", name = "fb", descriptor = "[I")
	private int[] anIntArray442;

	@OriginalMember(owner = "client!rr", name = "hb", descriptor = "[Lclient!id;")
	private Class114[] aClass114Array1;

	@OriginalMember(owner = "client!rr", name = "lb", descriptor = "S")
	private short lb;

	@OriginalMember(owner = "client!rr", name = "mb", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!rr", name = "nb", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!rr", name = "ob", descriptor = "I")
	private int anInt5900;

	@OriginalMember(owner = "client!rr", name = "pb", descriptor = "S")
	private short aShort89;

	@OriginalMember(owner = "client!rr", name = "qb", descriptor = "[I")
	private int[] anIntArray443;

	@OriginalMember(owner = "client!rr", name = "tb", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!rr", name = "wb", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!rr", name = "yb", descriptor = "B")
	private byte aByte86;

	@OriginalMember(owner = "client!rr", name = "Cb", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!rr", name = "Db", descriptor = "Lclient!nq;")
	private Class176 aClass176_1;

	@OriginalMember(owner = "client!rr", name = "Fb", descriptor = "[Lclient!ov;")
	private Class193[] aClass193Array1;

	@OriginalMember(owner = "client!rr", name = "Jb", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!rr", name = "Lb", descriptor = "I")
	private int anInt5912;

	@OriginalMember(owner = "client!rr", name = "Ob", descriptor = "[Lclient!sd;")
	private Class230[] aClass230Array3;

	@OriginalMember(owner = "client!rr", name = "Ub", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!rr", name = "Wb", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!rr", name = "Zb", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!rr", name = "ac", descriptor = "[F")
	private float[] aFloatArray35;

	@OriginalMember(owner = "client!rr", name = "bc", descriptor = "Lclient!tg;")
	private Interface9 anInterface9_6;

	@OriginalMember(owner = "client!rr", name = "cc", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!rr", name = "dc", descriptor = "[I")
	private int[] anIntArray444;

	@OriginalMember(owner = "client!rr", name = "ec", descriptor = "S")
	private short aShort90;

	@OriginalMember(owner = "client!rr", name = "hc", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!rr", name = "ic", descriptor = "[Lclient!ck;")
	private Class40[] aClass40Array3;

	@OriginalMember(owner = "client!rr", name = "jc", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!rr", name = "kc", descriptor = "[I")
	private int[] anIntArray445;

	@OriginalMember(owner = "client!rr", name = "lc", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!rr", name = "oc", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!rr", name = "sc", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!rr", name = "db", descriptor = "I")
	private int anInt5895 = 0;

	@OriginalMember(owner = "client!rr", name = "sb", descriptor = "I")
	private int anInt5902 = 0;

	@OriginalMember(owner = "client!rr", name = "z", descriptor = "Z")
	private boolean aBoolean525 = true;

	@OriginalMember(owner = "client!rr", name = "Hb", descriptor = "I")
	private int anInt5910 = 0;

	@OriginalMember(owner = "client!rr", name = "fc", descriptor = "Z")
	private boolean aBoolean526 = false;

	@OriginalMember(owner = "client!rr", name = "ub", descriptor = "I")
	private int anInt5903 = 0;

	@OriginalMember(owner = "client!rr", name = "wc", descriptor = "I")
	private int anInt5929 = 0;

	@OriginalMember(owner = "client!rr", name = "Ib", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_36;

	@OriginalMember(owner = "client!rr", name = "V", descriptor = "Lclient!ff;")
	private Class80 aClass80_9;

	@OriginalMember(owner = "client!rr", name = "nc", descriptor = "Lclient!ff;")
	private Class80 aClass80_12;

	@OriginalMember(owner = "client!rr", name = "Eb", descriptor = "Lclient!ff;")
	private Class80 aClass80_10;

	@OriginalMember(owner = "client!rr", name = "mc", descriptor = "Lclient!ff;")
	private Class80 aClass80_11;

	@OriginalMember(owner = "client!rr", name = "gb", descriptor = "Lclient!lh;")
	private Class149 aClass149_1;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class8_Sub2(@OriginalArg(0) Class117_Sub1 arg0) {
		this.aClass117_Sub1_36 = arg0;
		this.aClass80_9 = new Class80(null, 5126, 3, 0);
		this.aClass80_12 = new Class80(null, 5126, 2, 0);
		this.aClass80_10 = new Class80(null, 5126, 3, 0);
		this.aClass80_11 = new Class80(null, 5121, 4, 0);
		this.aClass149_1 = new Class149();
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!ih;Lclient!ld;IIII)V")
	public Class8_Sub2(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) Class147 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5900 = arg5;
		this.anInt5885 = arg2;
		this.aClass117_Sub1_36 = arg0;
		if (Static92.method3325(arg5, arg2)) {
			this.aClass80_9 = new Class80(null, 5126, 3, 0);
		}
		if (Static392.method5095(arg5, arg2)) {
			this.aClass80_12 = new Class80(null, 5126, 2, 0);
		}
		if (Static91.method1067(arg5, arg2)) {
			this.aClass80_10 = new Class80(null, 5126, 3, 0);
		}
		if (Static367.method4802(arg5, arg2)) {
			this.aClass80_11 = new Class80(null, 5121, 4, 0);
		}
		if (Static196.method2817(arg2, arg5)) {
			this.aClass149_1 = new Class149();
		}
		@Pc(102) Interface4 local102 = arg0.anInterface4_10;
		this.anIntArray442 = new int[arg1.anInt4183 + 1];
		@Pc(113) int[] local113 = new int[arg1.anInt4185];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt4185; local115++) {
			if ((arg1.aByteArray57 == null || arg1.aByteArray57[local115] != 2) && (arg1.aShortArray60 == null || arg1.aShortArray60[local115] == -1 || !local102.method5090(arg1.aShortArray60[local115] & 0xFFFF).aBoolean57)) {
				local113[this.anInt5895++] = local115;
				this.anIntArray442[arg1.aShortArray61[local115]]++;
				this.anIntArray442[arg1.aShortArray57[local115]]++;
				this.anIntArray442[arg1.aShortArray62[local115]]++;
			}
		}
		this.anInt5903 = this.anInt5895;
		@Pc(209) long[] local209 = new long[this.anInt5895];
		@Pc(221) boolean local221 = (this.anInt5885 & 0x100) != 0;
		@Pc(233) int local233;
		@Pc(244) int local244;
		@Pc(383) int local383;
		label497: for (@Pc(223) int local223 = 0; local223 < this.anInt5895; local223++) {
			@Pc(229) int local229 = local113[local223];
			@Pc(231) Class25 local231 = null;
			local233 = 0;
			@Pc(235) byte local235 = 0;
			@Pc(237) byte local237 = 0;
			@Pc(239) byte local239 = 0;
			if (arg1.aClass264Array1 != null) {
				for (local244 = 0; local244 < arg1.aClass264Array1.length; local244++) {
					@Pc(251) Class264 local251 = arg1.aClass264Array1[local244];
					if (local251.anInt6895 == local229) {
						@Pc(264) Class27 local264 = Static256.method3592(local251.anInt6896);
						if (local264.aBoolean65) {
							local209[local223] = Long.MAX_VALUE;
							this.anInt5903--;
							continue label497;
						}
					}
				}
			}
			@Pc(287) short local287 = -1;
			if (arg1.aShortArray60 != null) {
				local287 = arg1.aShortArray60[local229];
				if (local287 != -1) {
					local231 = local102.method5090(local287 & 0xFFFF);
					local237 = local231.aByte11;
					local239 = local231.aByte10;
				}
			}
			@Pc(339) boolean local339 = arg1.aByteArray60 != null && arg1.aByteArray60[local229] != 0 || local231 != null && local231.aBoolean53 | !local231.aBoolean56;
			if ((local221 || local339) && arg1.aByteArray59 != null) {
				local233 += arg1.aByteArray59[local229] << 17;
			}
			if (local339) {
				local233 += 65536;
			}
			local233 += (local237 & 0xFF) << 8;
			local233 += local239 & 0xFF;
			local383 = local235 + ((local287 & 0xFFFF) << 16);
			@Pc(389) int local389 = local383 + (local223 & 0xFFFF);
			local209[local223] = (long) local389 + ((long) local233 << 32);
		}
		Static185.method2684(local209, local113);
		this.anInt5929 = arg1.anInt4183;
		this.anIntArray444 = arg1.anIntArray305;
		this.anInt5910 = arg1.anInt4178;
		this.aShortArray99 = arg1.aShortArray56;
		this.anIntArray445 = arg1.anIntArray300;
		this.anIntArray441 = arg1.anIntArray301;
		this.aClass40Array3 = arg1.aClass40Array2;
		@Pc(440) Class105[] local440 = new Class105[this.anInt5929];
		this.aClass230Array3 = arg1.aClass230Array2;
		@Pc(464) int local464;
		@Pc(478) int local478;
		if (arg1.aClass264Array1 != null) {
			this.anInt5912 = arg1.aClass264Array1.length;
			this.aClass114Array1 = new Class114[this.anInt5912];
			this.aClass193Array1 = new Class193[this.anInt5912];
			for (local464 = 0; local464 < this.anInt5912; local464++) {
				@Pc(471) Class264 local471 = arg1.aClass264Array1[local464];
				@Pc(476) Class27 local476 = Static256.method3592(local471.anInt6896);
				local478 = -1;
				for (@Pc(480) int local480 = 0; local480 < this.anInt5895; local480++) {
					if (local471.anInt6895 == local113[local480]) {
						local478 = local480;
						break;
					}
				}
				if (local478 == -1) {
					throw new RuntimeException();
				}
				local244 = Static134.anIntArray182[arg1.aShortArray63[local471.anInt6895] & 0xFFFF] & 0xFFFFFF;
				local244 |= 255 - (arg1.aByteArray60 == null ? 0 : arg1.aByteArray60[local471.anInt6895]) << 24;
				this.aClass193Array1[local464] = new Class193(local478, arg1.aShortArray61[local471.anInt6895], arg1.aShortArray57[local471.anInt6895], arg1.aShortArray62[local471.anInt6895], local476.anInt399, local476.anInt397, local476.anInt403, local476.anInt395, local476.anInt402, local476.aBoolean65, local476.aBoolean66, local471.anInt6894);
				this.aClass114Array1[local464] = new Class114(local244);
			}
		}
		local464 = this.anInt5895 * 3;
		this.aByteArray84 = new byte[this.anInt5895];
		this.aShortArray102 = new short[this.anInt5895];
		this.aShortArray94 = new short[this.anInt5895];
		this.aShortArray98 = new short[local464];
		this.aByteArray85 = new byte[local464];
		this.aFloatArray34 = new float[local464];
		this.aShortArray103 = new short[local464];
		this.aShortArray93 = new short[this.anInt5895];
		this.aShortArray96 = new short[local464];
		this.aShort84 = (short) arg3;
		this.aFloatArray35 = new float[local464];
		this.aShortArray101 = new short[this.anInt5895];
		Static266.aLongArray7 = new long[local464];
		this.aShortArray95 = new short[this.anInt5895];
		this.aShortArray97 = new short[local464];
		if (arg1.aShortArray59 != null) {
			this.aShortArray100 = new short[this.anInt5895];
		}
		this.aShort85 = (short) arg4;
		local233 = 0;
		for (local383 = 0; local383 < arg1.anInt4183; local383++) {
			local478 = this.anIntArray442[local383];
			this.anIntArray442[local383] = local233;
			local440[local383] = new Class105();
			local233 += local478;
		}
		this.anIntArray442[arg1.anInt4183] = local233;
		@Pc(711) int[] local711 = null;
		@Pc(713) int[] local713 = null;
		@Pc(715) int[] local715 = null;
		@Pc(717) float[][] local717 = null;
		@Pc(743) int local743;
		@Pc(788) int local788;
		@Pc(794) int local794;
		@Pc(808) int local808;
		@Pc(810) int local810;
		@Pc(846) int local846;
		@Pc(851) int local851;
		@Pc(1015) float local1015;
		@Pc(1039) float local1039;
		@Pc(1013) float local1013;
		if (arg1.aByteArray55 != null) {
			@Pc(723) int local723 = arg1.anInt4171;
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
			local715 = new int[local723];
			local717 = new float[local723][];
			local711 = new int[local723];
			for (local788 = 0; local788 < this.anInt5895; local788++) {
				local794 = local113[local788];
				if (arg1.aByteArray55[local794] != -1) {
					local808 = arg1.aByteArray55[local794] & 0xFF;
					for (local810 = 0; local810 < 3; local810++) {
						@Pc(822) short local822;
						if (local810 == 0) {
							local822 = arg1.aShortArray61[local794];
						} else if (local810 == 1) {
							local822 = arg1.aShortArray57[local794];
						} else {
							local822 = arg1.aShortArray62[local794];
						}
						local846 = arg1.anIntArray305[local822];
						local851 = arg1.anIntArray301[local822];
						@Pc(856) int local856 = arg1.anIntArray300[local822];
						if (local846 < local726[local808]) {
							local726[local808] = local846;
						}
						if (local846 > local729[local808]) {
							local729[local808] = local846;
						}
						if (local732[local808] > local851) {
							local732[local808] = local851;
						}
						if (local851 > local735[local808]) {
							local735[local808] = local851;
						}
						if (local738[local808] > local856) {
							local738[local808] = local856;
						}
						if (local741[local808] < local856) {
							local741[local808] = local856;
						}
					}
				}
			}
			local713 = new int[local723];
			for (local794 = 0; local794 < local723; local794++) {
				@Pc(951) byte local951 = arg1.aByteArray54[local794];
				if (local951 > 0) {
					local711[local794] = (local729[local794] + local726[local794]) / 2;
					local713[local794] = (local732[local794] + local735[local794]) / 2;
					local715[local794] = (local741[local794] + local738[local794]) / 2;
					if (local951 == 1) {
						local851 = arg1.anIntArray306[local794];
						if (local851 == 0) {
							local1013 = 1.0F;
							local1015 = 1.0F;
						} else if (local851 > 0) {
							local1013 = (float) local851 / 1024.0F;
							local1015 = 1.0F;
						} else {
							local1015 = (float) -local851 / 1024.0F;
							local1013 = 1.0F;
						}
						local1039 = 64.0F / (float) arg1.anIntArray303[local794];
					} else if (local951 == 2) {
						local1015 = 64.0F / (float) arg1.anIntArray306[local794];
						local1039 = 64.0F / (float) arg1.anIntArray303[local794];
						local1013 = 64.0F / (float) arg1.anIntArray298[local794];
					} else {
						local1039 = (float) arg1.anIntArray303[local794] / 1024.0F;
						local1013 = (float) arg1.anIntArray298[local794] / 1024.0F;
						local1015 = (float) arg1.anIntArray306[local794] / 1024.0F;
					}
					local717[local794] = Static426.method5423(local1015, local1013, arg1.aShortArray64[local794], arg1.aShortArray58[local794], arg1.aShortArray65[local794], arg1.aByteArray56[local794] & 0xFF, local1039);
				}
			}
		}
		@Pc(1134) Class109[] local1134 = new Class109[arg1.anInt4185];
		@Pc(1153) short local1153;
		@Pc(1164) int local1164;
		@Pc(1175) int local1175;
		@Pc(1235) int local1235;
		for (@Pc(1136) int local1136 = 0; local1136 < arg1.anInt4185; local1136++) {
			@Pc(1143) short local1143 = arg1.aShortArray61[local1136];
			@Pc(1148) short local1148 = arg1.aShortArray57[local1136];
			local1153 = arg1.aShortArray62[local1136];
			local1164 = this.anIntArray444[local1148] - this.anIntArray444[local1143];
			local1175 = this.anIntArray441[local1148] - this.anIntArray441[local1143];
			local743 = this.anIntArray445[local1148] - this.anIntArray445[local1143];
			local788 = this.anIntArray444[local1153] - this.anIntArray444[local1143];
			local794 = this.anIntArray441[local1153] - this.anIntArray441[local1143];
			local808 = this.anIntArray445[local1153] - this.anIntArray445[local1143];
			local810 = local808 * local1175 - local743 * local794;
			local1235 = local743 * local788 - local1164 * local808;
			local846 = local794 * local1164 - local1175 * local788;
			while (local810 > 8192 || local1235 > 8192 || local846 > 8192 || local810 < -8192 || local1235 < -8192 || local846 < -8192) {
				local846 >>= 0x1;
				local1235 >>= 0x1;
				local810 >>= 0x1;
			}
			local851 = (int) Math.sqrt((double) (local1235 * local1235 + local810 * local810 + local846 * local846));
			if (local851 <= 0) {
				local851 = 1;
			}
			local1235 = local1235 * 256 / local851;
			local810 = local810 * 256 / local851;
			local846 = local846 * 256 / local851;
			@Pc(1329) byte local1329 = arg1.aByteArray57 == null ? 0 : arg1.aByteArray57[local1136];
			if (local1329 == 0) {
				@Pc(1335) Class105 local1335 = local440[local1143];
				local1335.anInt2382 += local1235;
				local1335.anInt2384++;
				local1335.anInt2383 += local846;
				local1335.anInt2380 += local810;
				@Pc(1363) Class105 local1363 = local440[local1148];
				local1363.anInt2383 += local846;
				local1363.anInt2384++;
				local1363.anInt2380 += local810;
				local1363.anInt2382 += local1235;
				@Pc(1391) Class105 local1391 = local440[local1153];
				local1391.anInt2384++;
				local1391.anInt2382 += local1235;
				local1391.anInt2383 += local846;
				local1391.anInt2380 += local810;
			} else if (local1329 == 1) {
				@Pc(1430) Class109 local1430 = local1134[local1136] = new Class109();
				local1430.anInt2672 = local1235;
				local1430.anInt2670 = local810;
				local1430.anInt2671 = local846;
			}
		}
		@Pc(1456) int local1456;
		for (@Pc(1450) int local1450 = 0; local1450 < this.anInt5895; local1450++) {
			local1456 = local113[local1450];
			@Pc(1463) int local1463 = arg1.aShortArray63[local1456] & 0xFFFF;
			@Pc(1468) short local1468;
			if (arg1.aShortArray60 == null) {
				local1468 = -1;
			} else {
				local1468 = arg1.aShortArray60[local1456];
			}
			if (arg1.aByteArray55 == null) {
				local1175 = -1;
			} else {
				local1175 = arg1.aByteArray55[local1456];
			}
			if (arg1.aByteArray60 == null) {
				local743 = 0;
			} else {
				local743 = arg1.aByteArray60[local1456] & 0xFF;
			}
			@Pc(1503) float local1503 = 0.0F;
			@Pc(1505) float local1505 = 0.0F;
			@Pc(1507) float local1507 = 0.0F;
			local1015 = 0.0F;
			local1039 = 0.0F;
			local1013 = 0.0F;
			@Pc(1515) byte local1515 = 0;
			@Pc(1517) byte local1517 = 0;
			@Pc(1519) int local1519 = 0;
			@Pc(1535) byte local1535;
			@Pc(1552) short local1552;
			@Pc(1557) short local1557;
			@Pc(1562) short local1562;
			if (local1468 != -1) {
				if (local1175 == -1) {
					local1517 = 2;
					local1503 = 0.0F;
					local1013 = 0.0F;
					local1015 = 1.0F;
					local1507 = 1.0F;
					local1505 = 1.0F;
					local1515 = 1;
					local1039 = 0.0F;
				} else {
					local1175 &= 0xFF;
					local1535 = arg1.aByteArray54[local1175];
					@Pc(1542) short local1542;
					@Pc(1547) short local1547;
					@Pc(1585) float local1585;
					@Pc(1594) float local1594;
					@Pc(1602) float local1602;
					@Pc(1686) float local1686;
					@Pc(1694) float local1694;
					@Pc(1702) float local1702;
					@Pc(1711) float local1711;
					@Pc(1719) float local1719;
					@Pc(1728) float local1728;
					if (local1535 == 0) {
						local1542 = arg1.aShortArray61[local1456];
						local1547 = arg1.aShortArray57[local1456];
						local1552 = arg1.aShortArray62[local1456];
						local1557 = arg1.aShortArray58[local1175];
						local1562 = arg1.aShortArray65[local1175];
						@Pc(1567) short local1567 = arg1.aShortArray64[local1175];
						@Pc(1573) float local1573 = (float) arg1.anIntArray305[local1557];
						@Pc(1579) float local1579 = (float) arg1.anIntArray301[local1557];
						local1585 = arg1.anIntArray300[local1557];
						local1594 = (float) arg1.anIntArray305[local1562] - local1573;
						local1602 = (float) arg1.anIntArray301[local1562] - local1579;
						@Pc(1611) float local1611 = (float) arg1.anIntArray300[local1562] - local1585;
						@Pc(1620) float local1620 = (float) arg1.anIntArray305[local1567] - local1573;
						@Pc(1629) float local1629 = (float) arg1.anIntArray301[local1567] - local1579;
						@Pc(1637) float local1637 = (float) arg1.anIntArray300[local1567] - local1585;
						@Pc(1645) float local1645 = (float) arg1.anIntArray305[local1542] - local1573;
						@Pc(1654) float local1654 = (float) arg1.anIntArray301[local1542] - local1579;
						@Pc(1662) float local1662 = (float) arg1.anIntArray300[local1542] - local1585;
						@Pc(1670) float local1670 = (float) arg1.anIntArray305[local1547] - local1573;
						@Pc(1678) float local1678 = (float) arg1.anIntArray301[local1547] - local1579;
						local1686 = (float) arg1.anIntArray300[local1547] - local1585;
						local1694 = (float) arg1.anIntArray305[local1552] - local1573;
						local1702 = (float) arg1.anIntArray301[local1552] - local1579;
						local1711 = (float) arg1.anIntArray300[local1552] - local1585;
						local1719 = local1602 * local1637 - local1611 * local1629;
						local1728 = local1620 * local1611 - local1594 * local1637;
						@Pc(1736) float local1736 = local1594 * local1629 - local1620 * local1602;
						@Pc(1744) float local1744 = local1629 * local1736 - local1637 * local1728;
						@Pc(1752) float local1752 = local1719 * local1637 - local1620 * local1736;
						@Pc(1761) float local1761 = local1728 * local1620 - local1719 * local1629;
						@Pc(1775) float local1775 = 1.0F / (local1752 * local1602 + local1744 * local1594 + local1611 * local1761);
						local1039 = local1775 * (local1711 * local1761 + local1752 * local1702 + local1744 * local1694);
						local1507 = (local1686 * local1761 + local1752 * local1678 + local1670 * local1744) * local1775;
						local1503 = (local1761 * local1662 + local1752 * local1654 + local1645 * local1744) * local1775;
						@Pc(1826) float local1826 = local1594 * local1728 - local1602 * local1719;
						@Pc(1834) float local1834 = local1611 * local1719 - local1736 * local1594;
						@Pc(1842) float local1842 = local1602 * local1736 - local1611 * local1728;
						@Pc(1856) float local1856 = 1.0F / (local1826 * local1637 + local1842 * local1620 + local1834 * local1629);
						local1505 = local1856 * (local1826 * local1662 + local1842 * local1645 + local1654 * local1834);
						local1015 = local1856 * (local1834 * local1678 + local1670 * local1842 + local1826 * local1686);
						local1013 = local1856 * (local1834 * local1702 + local1842 * local1694 + local1826 * local1711);
					} else {
						local1542 = arg1.aShortArray61[local1456];
						local1547 = arg1.aShortArray57[local1456];
						local1552 = arg1.aShortArray62[local1456];
						@Pc(1919) int local1919 = local711[local1175];
						@Pc(1923) int local1923 = local713[local1175];
						@Pc(1927) int local1927 = local715[local1175];
						@Pc(1931) float[] local1931 = local717[local1175];
						@Pc(1936) byte local1936 = arg1.aByteArray58[local1175];
						local1585 = (float) arg1.anIntArray302[local1175] / 256.0F;
						if (local1535 == 1) {
							local1594 = (float) arg1.anIntArray298[local1175] / 1024.0F;
							Static165.method2161(local1594, local1936, arg1.anIntArray300[local1542], local1585, local1931, local1927, local1919, arg1.anIntArray301[local1542], local1923, arg1.anIntArray305[local1542]);
							local1505 = Static87.aFloat8;
							local1503 = Static315.aFloat71;
							Static165.method2161(local1594, local1936, arg1.anIntArray300[local1547], local1585, local1931, local1927, local1919, arg1.anIntArray301[local1547], local1923, arg1.anIntArray305[local1547]);
							local1507 = Static315.aFloat71;
							local1015 = Static87.aFloat8;
							Static165.method2161(local1594, local1936, arg1.anIntArray300[local1552], local1585, local1931, local1927, local1919, arg1.anIntArray301[local1552], local1923, arg1.anIntArray305[local1552]);
							local1039 = Static315.aFloat71;
							local1013 = Static87.aFloat8;
							local1602 = local1594 / 2.0F;
							if ((local1936 & 0x1) == 0) {
								if (local1602 < local1039 - local1503) {
									local1039 -= local1594;
									local1517 = 1;
								} else if (local1503 - local1039 > local1602) {
									local1517 = 2;
									local1039 += local1594;
								}
								if (local1507 - local1503 > local1602) {
									local1507 -= local1594;
									local1515 = 1;
								} else if (local1503 - local1507 > local1602) {
									local1515 = 2;
									local1507 += local1594;
								}
							} else {
								if (local1015 - local1505 > local1602) {
									local1515 = 1;
									local1015 -= local1594;
								} else if (local1505 - local1015 > local1602) {
									local1015 += local1594;
									local1515 = 2;
								}
								if (local1013 - local1505 > local1602) {
									local1517 = 1;
									local1013 -= local1594;
								} else if (local1602 < local1505 - local1013) {
									local1013 += local1594;
									local1517 = 2;
								}
							}
						} else if (local1535 == 2) {
							local1594 = (float) arg1.anIntArray299[local1175] / 256.0F;
							local1602 = (float) arg1.anIntArray297[local1175] / 256.0F;
							@Pc(2173) int local2173 = arg1.anIntArray305[local1547] - arg1.anIntArray305[local1542];
							@Pc(2184) int local2184 = arg1.anIntArray301[local1547] - arg1.anIntArray301[local1542];
							@Pc(2195) int local2195 = arg1.anIntArray300[local1547] - arg1.anIntArray300[local1542];
							@Pc(2205) int local2205 = arg1.anIntArray305[local1552] - arg1.anIntArray305[local1542];
							@Pc(2216) int local2216 = arg1.anIntArray301[local1552] - arg1.anIntArray301[local1542];
							@Pc(2227) int local2227 = arg1.anIntArray300[local1552] - arg1.anIntArray300[local1542];
							@Pc(2235) int local2235 = local2184 * local2227 - local2216 * local2195;
							@Pc(2243) int local2243 = local2195 * local2205 - local2173 * local2227;
							@Pc(2252) int local2252 = local2216 * local2173 - local2205 * local2184;
							local1686 = 64.0F / (float) arg1.anIntArray306[local1175];
							local1694 = 64.0F / (float) arg1.anIntArray303[local1175];
							local1702 = 64.0F / (float) arg1.anIntArray298[local1175];
							local1711 = (local1931[2] * (float) local2252 + local1931[1] * (float) local2243 + local1931[0] * (float) local2235) / local1686;
							local1719 = (local1931[3] * (float) local2235 + local1931[4] * (float) local2243 + local1931[5] * (float) local2252) / local1694;
							local1728 = (local1931[8] * (float) local2252 + (float) local2235 * local1931[6] + (float) local2243 * local1931[7]) / local1702;
							local1519 = Static111.method1400(local1719, local1711, local1728);
							Static461.method5952(local1585, local1923, local1927, local1919, local1594, arg1.anIntArray301[local1542], local1931, local1602, local1519, arg1.anIntArray305[local1542], local1936, arg1.anIntArray300[local1542]);
							local1503 = Static352.aFloat76;
							local1505 = Static127.aFloat13;
							Static461.method5952(local1585, local1923, local1927, local1919, local1594, arg1.anIntArray301[local1547], local1931, local1602, local1519, arg1.anIntArray305[local1547], local1936, arg1.anIntArray300[local1547]);
							local1507 = Static352.aFloat76;
							local1015 = Static127.aFloat13;
							Static461.method5952(local1585, local1923, local1927, local1919, local1594, arg1.anIntArray301[local1552], local1931, local1602, local1519, arg1.anIntArray305[local1552], local1936, arg1.anIntArray300[local1552]);
							local1013 = Static127.aFloat13;
							local1039 = Static352.aFloat76;
						} else if (local1535 == 3) {
							Static28.method410(arg1.anIntArray301[local1542], local1923, arg1.anIntArray300[local1542], local1919, local1936, local1585, arg1.anIntArray305[local1542], local1927, local1931);
							local1505 = Static9.aFloat2;
							local1503 = Static161.aFloat28;
							Static28.method410(arg1.anIntArray301[local1547], local1923, arg1.anIntArray300[local1547], local1919, local1936, local1585, arg1.anIntArray305[local1547], local1927, local1931);
							local1507 = Static161.aFloat28;
							local1015 = Static9.aFloat2;
							Static28.method410(arg1.anIntArray301[local1552], local1923, arg1.anIntArray300[local1552], local1919, local1936, local1585, arg1.anIntArray305[local1552], local1927, local1931);
							local1039 = Static161.aFloat28;
							local1013 = Static9.aFloat2;
							if ((local1936 & 0x1) == 0) {
								if (local1507 - local1503 > 0.5F) {
									local1507--;
									local1515 = 1;
								} else if (local1503 - local1507 > 0.5F) {
									local1515 = 2;
									local1507++;
								}
								if (local1039 - local1503 > 0.5F) {
									local1039--;
									local1517 = 1;
								} else if (local1503 - local1039 > 0.5F) {
									local1517 = 2;
									local1039++;
								}
							} else {
								if (local1013 - local1505 > 0.5F) {
									local1517 = 1;
									local1013--;
								} else if (local1505 - local1013 > 0.5F) {
									local1517 = 2;
									local1013++;
								}
								if (local1015 - local1505 > 0.5F) {
									local1015--;
									local1515 = 1;
								} else if (local1505 - local1015 > 0.5F) {
									local1515 = 2;
									local1015++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray57 == null) {
				local1535 = 0;
			} else {
				local1535 = arg1.aByteArray57[local1456];
			}
			if (local1535 == 0) {
				@Pc(2814) long local2814 = (long) (local1175 << 2) + ((long) local743 + (long) (local1463 << 8) + (long) (local1519 << 24) << 32);
				local1552 = arg1.aShortArray61[local1456];
				local1557 = arg1.aShortArray57[local1456];
				local1562 = arg1.aShortArray62[local1456];
				@Pc(2833) Class105 local2833 = local440[local1552];
				this.aShortArray102[local1450] = this.method4776(local2833.anInt2382, local1503, local2814, local2833.anInt2380, local2833.anInt2383, local1505, arg1, local2833.anInt2384, local1552);
				@Pc(2857) Class105 local2857 = local440[local1557];
				this.aShortArray93[local1450] = this.method4776(local2857.anInt2382, local1507, local2814 + (long) local1515, local2857.anInt2380, local2857.anInt2383, local1015, arg1, local2857.anInt2384, local1557);
				@Pc(2884) Class105 local2884 = local440[local1562];
				this.aShortArray101[local1450] = this.method4776(local2884.anInt2382, local1039, (long) local1517 + local2814, local2884.anInt2380, local2884.anInt2383, local1013, arg1, local2884.anInt2384, local1562);
			} else if (local1535 == 1) {
				@Pc(2677) Class109 local2677 = local1134[local1456];
				@Pc(2719) long local2719 = ((long) local743 + (long) (local1519 << 24) + (long) (local1463 << 8) << 32) + (long) ((local2677.anInt2670 > 0 ? 1024 : 2048) + ((local1175 << 2) + (local2677.anInt2672 + 256 << 12) + (local2677.anInt2671 - -256 << 22)));
				this.aShortArray102[local1450] = this.method4776(local2677.anInt2672, local1503, local2719, local2677.anInt2670, local2677.anInt2671, local1505, arg1, 0, arg1.aShortArray61[local1456]);
				this.aShortArray93[local1450] = this.method4776(local2677.anInt2672, local1507, (long) local1515 + local2719, local2677.anInt2670, local2677.anInt2671, local1015, arg1, 0, arg1.aShortArray57[local1456]);
				this.aShortArray101[local1450] = this.method4776(local2677.anInt2672, local1039, (long) local1517 + local2719, local2677.anInt2670, local2677.anInt2671, local1013, arg1, 0, arg1.aShortArray62[local1456]);
			}
			if (arg1.aShortArray60 == null) {
				this.aShortArray94[local1450] = -1;
			} else {
				this.aShortArray94[local1450] = arg1.aShortArray60[local1456];
			}
			if (arg1.aByteArray60 != null) {
				this.aByteArray84[local1450] = arg1.aByteArray60[local1456];
			}
			if (arg1.aShortArray59 != null) {
				this.aShortArray100[local1450] = arg1.aShortArray59[local1456];
			}
			this.aShortArray95[local1450] = arg1.aShortArray63[local1456];
		}
		local1456 = 0;
		local1153 = -10000;
		for (local1164 = 0; local1164 < this.anInt5903; local1164++) {
			@Pc(2977) short local2977 = this.aShortArray94[local1164];
			if (local2977 != local1153) {
				local1153 = local2977;
				local1456++;
			}
		}
		this.anIntArray443 = new int[local1456 + 1];
		local1456 = 0;
		local1153 = -10000;
		for (local1175 = 0; local1175 < this.anInt5903; local1175++) {
			@Pc(3011) short local3011 = this.aShortArray94[local1175];
			if (local3011 != local1153) {
				this.anIntArray443[local1456++] = local1175;
				local1153 = local3011;
			}
		}
		this.anIntArray443[local1456] = this.anInt5903;
		Static266.aLongArray7 = null;
		this.aShortArray98 = Static339.method4433(this.anInt5902, this.aShortArray98);
		this.aShortArray96 = Static339.method4433(this.anInt5902, this.aShortArray96);
		this.aShortArray103 = Static339.method4433(this.anInt5902, this.aShortArray103);
		this.aByteArray85 = Static87.method1049(this.aByteArray85, this.anInt5902);
		this.aFloatArray34 = Static439.method5504(this.anInt5902, this.aFloatArray34);
		this.aFloatArray35 = Static439.method5504(this.anInt5902, this.aFloatArray35);
		if (arg1.anIntArray304 != null && Static465.method5681(arg2, this.anInt5900)) {
			this.anIntArrayArray45 = arg1.method3299();
		}
		if (arg1.aClass264Array1 != null && Static36.method493(this.anInt5900, arg2)) {
			this.anIntArrayArray46 = arg1.method3309();
		}
		if (arg1.anIntArray307 != null && Static152.method1909(arg2, this.anInt5900)) {
			local743 = 0;
			@Pc(3129) int[] local3129 = new int[256];
			for (local794 = 0; local794 < this.anInt5895; local794++) {
				local808 = arg1.anIntArray307[local113[local794]];
				if (local808 >= 0) {
					if (local808 > local743) {
						local743 = local808;
					}
					@Pc(3154) int local3154 = local3129[local808]++;
				}
			}
			this.anIntArrayArray44 = new int[local743 + 1][];
			for (local808 = 0; local808 <= local743; local808++) {
				this.anIntArrayArray44[local808] = new int[local3129[local808]];
				local3129[local808] = 0;
			}
			for (local810 = 0; local810 < this.anInt5895; local810++) {
				local1235 = arg1.anIntArray307[local113[local810]];
				if (local1235 >= 0) {
					this.anIntArrayArray44[local1235][local3129[local1235]++] = local810;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	@Override
	public void method5996(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class8_Sub2 local8 = (Class8_Sub2) arg0;
		if (this.anInt5895 == 0 || local8.anInt5895 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt5929;
		@Pc(24) int[] local24 = local8.anIntArray444;
		@Pc(27) int[] local27 = local8.anIntArray441;
		@Pc(30) int[] local30 = local8.anIntArray445;
		@Pc(33) short[] local33 = local8.aShortArray98;
		@Pc(36) short[] local36 = local8.aShortArray96;
		@Pc(39) short[] local39 = local8.aShortArray103;
		@Pc(42) byte[] local42 = local8.aByteArray85;
		@Pc(49) short[] local49;
		@Pc(53) short[] local53;
		@Pc(47) short[] local47;
		@Pc(51) byte[] local51;
		if (this.aClass176_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local53 = this.aClass176_1.aShortArray78;
			local51 = this.aClass176_1.aByteArray70;
			local47 = this.aClass176_1.aShortArray76;
			local49 = this.aClass176_1.aShortArray77;
		}
		@Pc(76) short[] local76;
		@Pc(82) short[] local82;
		@Pc(78) short[] local78;
		@Pc(80) byte[] local80;
		if (local8.aClass176_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local80 = local8.aClass176_1.aByteArray70;
			local82 = local8.aClass176_1.aShortArray78;
			local78 = local8.aClass176_1.aShortArray76;
			local76 = local8.aClass176_1.aShortArray77;
		}
		@Pc(103) int[] local103 = local8.anIntArray442;
		@Pc(106) short[] local106 = local8.aShortArray97;
		if (!local8.aBoolean526) {
			local8.method4768();
		}
		@Pc(115) short local115 = local8.lb;
		@Pc(118) short local118 = local8.aShort89;
		@Pc(121) short local121 = local8.aShort91;
		@Pc(124) short local124 = local8.aShort88;
		@Pc(127) short local127 = local8.aShort87;
		@Pc(130) short local130 = local8.aShort86;
		for (@Pc(132) int local132 = 0; local132 < this.anInt5929; local132++) {
			@Pc(142) int local142 = this.anIntArray441[local132] - arg2;
			if (local115 <= local142 && local142 <= local118) {
				@Pc(162) int local162 = this.anIntArray444[local132] - arg1;
				if (local162 >= local121 && local162 <= local124) {
					@Pc(178) int local178 = this.anIntArray445[local132] - arg3;
					if (local178 >= local127 && local130 >= local178) {
						@Pc(192) int local192 = -1;
						@Pc(197) int local197 = this.anIntArray442[local132];
						@Pc(204) int local204 = this.anIntArray442[local132 + 1];
						for (@Pc(206) int local206 = local197; local206 < local204; local206++) {
							local192 = this.aShortArray97[local206] - 1;
							if (local192 == -1 || this.aByteArray85[local192] != 0) {
								break;
							}
						}
						if (local192 != -1) {
							for (@Pc(242) int local242 = 0; local242 < local21; local242++) {
								if (local24[local242] == local162 && local30[local242] == local178 && local27[local242] == local142) {
									local204 = local103[local242 + 1];
									@Pc(271) int local271 = -1;
									local197 = local103[local242];
									for (@Pc(277) int local277 = local197; local277 < local204; local277++) {
										local271 = local106[local277] - 1;
										if (local271 == -1 || local42[local271] != 0) {
											break;
										}
									}
									if (local271 != -1) {
										if (local49 == null) {
											this.aClass176_1 = new Class176();
											local49 = this.aClass176_1.aShortArray77 = Static77.method952(this.aShortArray98);
											local53 = this.aClass176_1.aShortArray78 = Static77.method952(this.aShortArray96);
											local47 = this.aClass176_1.aShortArray76 = Static77.method952(this.aShortArray103);
											local51 = this.aClass176_1.aByteArray70 = Static37.method494(this.aByteArray85);
										}
										if (local76 == null) {
											@Pc(358) Class176 local358 = local8.aClass176_1 = new Class176();
											local76 = local358.aShortArray77 = Static77.method952(local33);
											local82 = local358.aShortArray78 = Static77.method952(local36);
											local78 = local358.aShortArray76 = Static77.method952(local39);
											local80 = local358.aByteArray70 = Static37.method494(local42);
										}
										@Pc(391) short local391 = this.aShortArray98[local192];
										@Pc(396) short local396 = this.aShortArray96[local192];
										@Pc(401) short local401 = this.aShortArray103[local192];
										@Pc(406) byte local406 = this.aByteArray85[local192];
										local204 = local103[local242 + 1];
										local197 = local103[local242];
										@Pc(426) int local426;
										for (@Pc(418) int local418 = local197; local418 < local204; local418++) {
											local426 = local106[local418] - 1;
											if (local426 == -1) {
												break;
											}
											if (local80[local426] != 0) {
												local76[local426] += local391;
												local82[local426] += local396;
												local78[local426] += local401;
												local80[local426] += local406;
											}
										}
										local204 = this.anIntArray442[local132 + 1];
										local391 = local33[local271];
										local406 = local42[local271];
										local396 = local36[local271];
										local197 = this.anIntArray442[local132];
										local401 = local39[local271];
										for (local426 = local197; local426 < local204; local426++) {
											@Pc(513) int local513 = this.aShortArray97[local426] - 1;
											if (local513 == -1) {
												break;
											}
											if (local51[local513] != 0) {
												local49[local513] += local391;
												local53[local513] += local396;
												local47[local513] += local401;
												local51[local513] += local406;
											}
										}
										if (this.aClass80_10 == null && this.aClass80_11 != null) {
											this.aClass80_11.anInterface9_2 = null;
										}
										if (this.aClass80_10 != null) {
											this.aClass80_10.anInterface9_2 = null;
										}
										if (local8.aClass80_10 == null && local8.aClass80_11 != null) {
											local8.aClass80_11.anInterface9_2 = null;
										}
										if (local8.aClass80_10 != null) {
											local8.aClass80_10.anInterface9_2 = null;
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

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!kr;I)V")
	private void method4758(@OriginalArg(0) Class1_Sub3_Sub11_Sub1 arg0) {
		if (this.anInt5902 > this.aClass117_Sub1_36.anIntArray232.length) {
			this.aClass117_Sub1_36.anIntArray232 = new int[this.anInt5902];
			this.aClass117_Sub1_36.anIntArray231 = new int[this.anInt5902];
		}
		@Pc(28) int[] local28 = this.aClass117_Sub1_36.anIntArray232;
		@Pc(32) int[] local32 = this.aClass117_Sub1_36.anIntArray231;
		@Pc(60) int local60;
		@Pc(99) int local99;
		@Pc(108) int local108;
		for (@Pc(34) int local34 = 0; local34 < this.anInt5929; local34++) {
			local60 = (this.anIntArray444[local34] - (this.aClass117_Sub1_36.anInt3117 * this.anIntArray441[local34] >> 8) >> this.aClass117_Sub1_36.anInt3091) - arg0.anInt4083;
			@Pc(85) int local85 = (this.anIntArray445[local34] - (this.anIntArray441[local34] * this.aClass117_Sub1_36.anInt3105 >> 8) >> this.aClass117_Sub1_36.anInt3091) - arg0.anInt4085;
			@Pc(90) int local90 = this.anIntArray442[local34];
			@Pc(97) int local97 = this.anIntArray442[local34 + 1];
			for (local99 = local90; local99 < local97; local99++) {
				local108 = this.aShortArray97[local99] - 1;
				if (local108 == -1) {
					break;
				}
				local28[local108] = local60;
				local32[local108] = local85;
			}
		}
		for (local60 = 0; local60 < this.anInt5903; local60++) {
			if (this.aByteArray84 == null || this.aByteArray84[local60] <= 128) {
				@Pc(150) short local150 = this.aShortArray102[local60];
				@Pc(155) short local155 = this.aShortArray93[local60];
				@Pc(160) short local160 = this.aShortArray101[local60];
				local99 = local28[local150];
				local108 = local28[local155];
				@Pc(172) int local172 = local28[local160];
				@Pc(176) int local176 = local32[local150];
				@Pc(180) int local180 = local32[local155];
				@Pc(184) int local184 = local32[local160];
				if (-((local180 - local176) * (-local108 + local172)) + (local99 - local108) * (local180 - local184) > 0) {
					arg0.method3207(local180, local99, local176, local108, local184, local172);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V")
	private void method4759() {
		if (!this.aBoolean525) {
			return;
		}
		this.aBoolean525 = false;
		if (this.aClass40Array3 == null && this.aClass230Array3 == null && this.aClass193Array1 == null) {
			if (this.anIntArray444 != null && !Static148.method1863(this.anInt5900, this.anInt5885)) {
				if (this.aClass80_9 != null && this.aClass80_9.anInterface9_2 == null) {
					this.aBoolean525 = true;
				} else {
					if (!this.aBoolean526) {
						this.method4768();
					}
					this.anIntArray444 = null;
				}
			}
			if (this.anIntArray441 != null && !Static460.method5931(this.anInt5885, this.anInt5900)) {
				if (this.aClass80_9 != null && this.aClass80_9.anInterface9_2 == null) {
					this.aBoolean525 = true;
				} else {
					if (!this.aBoolean526) {
						this.method4768();
					}
					this.anIntArray441 = null;
				}
			}
			if (this.anIntArray445 != null && !Static388.method5411(this.anInt5900, this.anInt5885)) {
				if (this.aClass80_9 != null && this.aClass80_9.anInterface9_2 == null) {
					this.aBoolean525 = true;
				} else {
					if (!this.aBoolean526) {
						this.method4768();
					}
					this.anIntArray445 = null;
				}
			}
		}
		if (this.aShortArray97 != null && this.anIntArray444 == null && this.anIntArray441 == null && this.anIntArray445 == null) {
			this.aShortArray97 = null;
			this.anIntArray442 = null;
		}
		if (this.aByteArray85 != null && !Static54.method702(this.anInt5885, this.anInt5900)) {
			if (this.aClass80_10 == null) {
				if (this.aClass80_11 != null && this.aClass80_11.anInterface9_2 == null) {
					this.aBoolean525 = true;
				} else {
					this.aByteArray85 = null;
					this.aShortArray98 = this.aShortArray96 = this.aShortArray103 = null;
				}
			} else if (this.aClass80_10.anInterface9_2 == null) {
				this.aBoolean525 = true;
			} else {
				this.aShortArray98 = this.aShortArray96 = this.aShortArray103 = null;
				this.aByteArray85 = null;
			}
		}
		if (this.aShortArray95 != null && !Static71.method919(this.anInt5885, this.anInt5900)) {
			if (this.aClass80_11 != null && this.aClass80_11.anInterface9_2 == null) {
				this.aBoolean525 = true;
			} else {
				this.aShortArray95 = null;
			}
		}
		if (this.aByteArray84 != null && !Static456.method2876(this.anInt5885, this.anInt5900)) {
			if (this.aClass80_11 != null && this.aClass80_11.anInterface9_2 == null) {
				this.aBoolean525 = true;
			} else {
				this.aByteArray84 = null;
			}
		}
		if (this.aFloatArray34 != null && !Static58.method818(this.anInt5900, this.anInt5885)) {
			if (this.aClass80_12 != null && this.aClass80_12.anInterface9_2 == null) {
				this.aBoolean525 = true;
			} else {
				this.aFloatArray34 = this.aFloatArray35 = null;
			}
		}
		if (this.aShortArray94 != null && !Static139.method1759(this.anInt5885, this.anInt5900)) {
			if (this.aClass80_11 != null && this.aClass80_11.anInterface9_2 == null) {
				this.aBoolean525 = true;
			} else {
				this.aShortArray94 = null;
			}
		}
		if (this.aShortArray102 != null && !Static384.method4936(this.anInt5900, this.anInt5885)) {
			if ((this.aClass149_1 == null || this.aClass149_1.anInterface3_4 != null) && (this.aClass80_11 == null || this.aClass80_11.anInterface9_2 != null)) {
				this.aShortArray102 = this.aShortArray93 = this.aShortArray101 = null;
			} else {
				this.aBoolean525 = true;
			}
		}
		if (this.anIntArrayArray44 != null && !Static152.method1909(this.anInt5885, this.anInt5900)) {
			this.aShortArray100 = null;
			this.anIntArrayArray44 = null;
		}
		if (this.anIntArrayArray45 != null && !Static465.method5681(this.anInt5885, this.anInt5900)) {
			this.anIntArrayArray45 = null;
			this.aShortArray99 = null;
		}
		if (this.anIntArrayArray46 != null && !Static36.method493(this.anInt5900, this.anInt5885)) {
			this.anIntArrayArray46 = null;
		}
		if (this.anIntArray443 != null && (this.anInt5885 & 0x800) == 0 && (this.anInt5885 & 0x40000) == 0) {
			this.anIntArray443 = null;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!c;Lclient!wp;I)V")
	@Override
	public void method5987(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class111_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5902 == 0) {
			return;
		}
		@Pc(16) Class34_Sub2 local16 = this.aClass117_Sub1_36.aClass34_Sub2_3;
		@Pc(19) Class34_Sub2 local19 = (Class34_Sub2) arg0;
		if (!this.aBoolean526) {
			this.method4768();
		}
		this.method4770(local19);
		Static364.aFloat78 = local16.aFloat26 + local19.aFloat26 * local16.aFloat19 + local19.aFloat15 * local16.aFloat22 + local19.aFloat20 * local16.aFloat16;
		Static354.aFloat77 = local16.aFloat16 * local19.aFloat21 + local19.aFloat18 * local16.aFloat22 + local16.aFloat19 * local19.aFloat16;
		@Pc(76) float local76 = Static364.aFloat78 + (float) this.lb * Static354.aFloat77;
		@Pc(84) float local84 = Static364.aFloat78 + (float) this.aShort89 * Static354.aFloat77;
		@Pc(101) float local101;
		@Pc(94) float local94;
		if (local84 < local76) {
			local94 = (float) this.aShort90 + local76;
			local101 = (float) -this.aShort90 + local84;
		} else {
			local94 = local84 + (float) this.aShort90;
			local101 = (float) -this.aShort90 + local76;
		}
		if (this.aClass117_Sub1_36.aFloat32 <= local101 || (float) this.aClass117_Sub1_36.anInt3131 >= local94) {
			return;
		}
		Static119.aFloat11 = local16.aFloat15 + local19.aFloat15 * local16.aFloat17 + local16.aFloat18 * local19.aFloat20 + local19.aFloat26 * local16.aFloat24;
		Static351.aFloat74 = local16.aFloat24 * local19.aFloat16 + local16.aFloat18 * local19.aFloat21 + local16.aFloat17 * local19.aFloat18;
		@Pc(178) float local178 = Static119.aFloat11 + Static351.aFloat74 * (float) this.lb;
		@Pc(186) float local186 = Static119.aFloat11 + Static351.aFloat74 * (float) this.aShort89;
		@Pc(201) float local201;
		@Pc(212) float local212;
		if (local178 > local186) {
			local201 = (local186 - (float) this.aShort90) * (float) this.aClass117_Sub1_36.anInt3123;
			local212 = (float) this.aClass117_Sub1_36.anInt3123 * ((float) this.aShort90 + local178);
		} else {
			local212 = (float) this.aClass117_Sub1_36.anInt3123 * (local186 + (float) this.aShort90);
			local201 = (float) this.aClass117_Sub1_36.anInt3123 * ((float) -this.aShort90 + local178);
		}
		if (this.aClass117_Sub1_36.aFloat37 <= local201 / local94 || this.aClass117_Sub1_36.aFloat33 >= local212 / local94) {
			return;
		}
		Static253.aFloat60 = local16.aFloat25 * local19.aFloat16 + local19.aFloat21 * local16.aFloat21 + local19.aFloat18 * local16.aFloat23;
		Static48.aFloat6 = local16.aFloat25 * local19.aFloat26 + local19.aFloat15 * local16.aFloat23 + local16.aFloat21 * local19.aFloat20 + local16.aFloat20;
		@Pc(302) float local302 = Static48.aFloat6 + (float) this.lb * Static253.aFloat60;
		@Pc(310) float local310 = Static48.aFloat6 + (float) this.aShort89 * Static253.aFloat60;
		@Pc(336) float local336;
		@Pc(325) float local325;
		if (local310 < local302) {
			local325 = (float) this.aClass117_Sub1_36.anInt3118 * (local302 + (float) this.aShort90);
			local336 = (local310 - (float) this.aShort90) * (float) this.aClass117_Sub1_36.anInt3118;
		} else {
			local325 = (float) this.aClass117_Sub1_36.anInt3118 * ((float) this.aShort90 + local310);
			local336 = (float) this.aClass117_Sub1_36.anInt3118 * (local302 - (float) this.aShort90);
		}
		if (this.aClass117_Sub1_36.aFloat34 <= local336 / local94 || this.aClass117_Sub1_36.aFloat42 >= local325 / local94) {
			return;
		}
		if (arg1 != null || this.aClass193Array1 != null) {
			Static364.aFloat79 = local19.aFloat22 * local16.aFloat24 + local16.aFloat18 * local19.aFloat23 + local19.aFloat17 * local16.aFloat17;
			Static41.aFloat5 = local19.aFloat25 * local16.aFloat18 + local19.aFloat24 * local16.aFloat17 + local19.aFloat19 * local16.aFloat24;
			Static81.aFloat7 = local16.aFloat16 * local19.aFloat25 + local16.aFloat22 * local19.aFloat24 + local19.aFloat19 * local16.aFloat19;
			Static342.aFloat73 = local16.aFloat21 * local19.aFloat25 + local16.aFloat23 * local19.aFloat24 + local16.aFloat25 * local19.aFloat19;
			Static352.aFloat75 = local16.aFloat25 * local19.aFloat22 + local16.aFloat23 * local19.aFloat17 + local19.aFloat23 * local16.aFloat21;
			Static153.aFloat27 = local19.aFloat22 * local16.aFloat19 + local16.aFloat22 * local19.aFloat17 + local16.aFloat16 * local19.aFloat23;
		}
		if (arg1 != null) {
			@Pc(495) boolean local495 = false;
			@Pc(497) boolean local497 = true;
			@Pc(505) int local505 = this.aShort91 + this.aShort88 >> 1;
			@Pc(513) int local513 = this.aShort86 + this.aShort87 >> 1;
			@Pc(532) int local532 = (int) ((float) this.lb * Static351.aFloat74 + Static364.aFloat79 * (float) local505 + Static119.aFloat11 + Static41.aFloat5 * (float) local513);
			@Pc(551) int local551 = (int) ((float) local513 * Static342.aFloat73 + Static48.aFloat6 + Static352.aFloat75 * (float) local505 + Static253.aFloat60 * (float) this.lb);
			@Pc(570) int local570 = (int) ((float) this.lb * Static354.aFloat77 + Static364.aFloat78 + Static153.aFloat27 * (float) local505 + Static81.aFloat7 * (float) local513);
			if (this.aClass117_Sub1_36.anInt3131 > local570) {
				local495 = true;
			} else {
				arg1.anInt7285 = local532 * this.aClass117_Sub1_36.anInt3123 / local570 + this.aClass117_Sub1_36.anInt3116;
				arg1.anInt7282 = this.aClass117_Sub1_36.anInt3111 + this.aClass117_Sub1_36.anInt3118 * local551 / local570;
			}
			@Pc(629) int local629 = (int) ((float) this.aShort89 * Static351.aFloat74 + Static119.aFloat11 + (float) local505 * Static364.aFloat79 + (float) local513 * Static41.aFloat5);
			@Pc(648) int local648 = (int) (Static48.aFloat6 + (float) local505 * Static352.aFloat75 + (float) this.aShort89 * Static253.aFloat60 + Static342.aFloat73 * (float) local513);
			@Pc(667) int local667 = (int) (Static81.aFloat7 * (float) local513 + (float) local505 * Static153.aFloat27 + Static364.aFloat78 + (float) this.aShort89 * Static354.aFloat77);
			if (local667 < this.aClass117_Sub1_36.anInt3131) {
				local495 = true;
			} else {
				arg1.anInt7284 = this.aClass117_Sub1_36.anInt3111 + this.aClass117_Sub1_36.anInt3118 * local648 / local667;
				arg1.anInt7283 = this.aClass117_Sub1_36.anInt3123 * local629 / local667 + this.aClass117_Sub1_36.anInt3116;
			}
			if (local495) {
				if (this.aClass117_Sub1_36.anInt3131 > local570 && this.aClass117_Sub1_36.anInt3131 > local667) {
					local497 = false;
				} else {
					@Pc(741) int local741;
					@Pc(751) int local751;
					@Pc(777) int local777;
					if (local570 < this.aClass117_Sub1_36.anInt3131) {
						local741 = (local667 - this.aClass117_Sub1_36.anInt3131 << 16) / (local667 - local570);
						local751 = ((local629 - local532) * local741 >> 16) + local629;
						arg1.anInt7285 = this.aClass117_Sub1_36.anInt3123 * local751 / this.aClass117_Sub1_36.anInt3131 + this.aClass117_Sub1_36.anInt3116;
						local777 = (local741 * (local648 - local551) >> 16) + local648;
						arg1.anInt7282 = this.aClass117_Sub1_36.anInt3111 + this.aClass117_Sub1_36.anInt3118 * local777 / this.aClass117_Sub1_36.anInt3131;
					} else if (this.aClass117_Sub1_36.anInt3131 > local667) {
						local741 = (local570 - this.aClass117_Sub1_36.anInt3131 << 16) / (local570 - local667);
						local751 = ((local532 - local629) * local741 >> 16) + local532;
						arg1.anInt7285 = this.aClass117_Sub1_36.anInt3123 * local751 / this.aClass117_Sub1_36.anInt3131 + this.aClass117_Sub1_36.anInt3116;
						local777 = (local741 * (local551 - local648) >> 16) + local551;
						arg1.anInt7282 = local777 * this.aClass117_Sub1_36.anInt3118 / this.aClass117_Sub1_36.anInt3131 + this.aClass117_Sub1_36.anInt3111;
					}
				}
			}
			if (local497) {
				arg1.aBoolean631 = true;
				if (local667 >= local570) {
					arg1.anInt7286 = (local629 + this.aShort90) * this.aClass117_Sub1_36.anInt3123 / local667 + this.aClass117_Sub1_36.anInt3116 - arg1.anInt7283;
				} else {
					arg1.anInt7286 = this.aClass117_Sub1_36.anInt3116 + (local532 + this.aShort90) * this.aClass117_Sub1_36.anInt3123 / local570 - arg1.anInt7285;
				}
			}
		}
		this.aClass117_Sub1_36.method2522();
		this.aClass117_Sub1_36.method2489(local19);
		this.method4762();
		this.aClass117_Sub1_36.method2474();
		this.method4771();
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(ZI)V")
	private void method4761(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass80_11 != null && this.aClass80_11.anInterface9_2 == null;
		@Pc(27) boolean local27 = this.aClass80_10 != null && this.aClass80_10.anInterface9_2 == null;
		@Pc(38) boolean local38 = this.aClass80_9 != null && this.aClass80_9.anInterface9_2 == null;
		@Pc(49) boolean local49 = this.aClass80_12 != null && this.aClass80_12.anInterface9_2 == null;
		if (arg0) {
			local38 &= (this.aByte86 & 0x1) != 0;
			local49 &= (this.aByte86 & 0x8) != 0;
			local16 &= (this.aByte86 & 0x2) != 0;
			local27 &= (this.aByte86 & 0x4) != 0;
		}
		@Pc(110) byte local110 = 0;
		@Pc(114) byte local114 = 0;
		@Pc(116) byte local116 = 0;
		@Pc(118) byte local118 = 0;
		if (local38) {
			local110 = 12;
		}
		if (local16) {
			local114 = local110;
			local110 = (byte) (local110 + 4);
		}
		if (local27) {
			local116 = local110;
			local110 = (byte) (local110 + 12);
		}
		if (local49) {
			local118 = local110;
			local110 = (byte) (local110 + 8);
		}
		if (local110 == 0) {
			return;
		}
		if (this.aClass117_Sub1_36.aClass1_Sub19_Sub1_2.aByteArray38.length >= this.anInt5902 * local110) {
			this.aClass117_Sub1_36.aClass1_Sub19_Sub1_2.anInt3698 = 0;
		} else {
			this.aClass117_Sub1_36.aClass1_Sub19_Sub1_2 = new Class1_Sub19_Sub1((this.anInt5902 + 100) * local110);
		}
		@Pc(193) Class1_Sub19_Sub1 local193 = this.aClass117_Sub1_36.aClass1_Sub19_Sub1_2;
		@Pc(201) int local201;
		@Pc(210) int local210;
		@Pc(238) int local238;
		@Pc(247) int local247;
		if (local38) {
			@Pc(217) int local217;
			@Pc(224) int local224;
			@Pc(229) int local229;
			@Pc(236) int local236;
			if (this.aClass117_Sub1_36.aBoolean291) {
				for (local201 = 0; local201 < this.anInt5929; local201++) {
					local210 = NativeStream.floatToRawIntBits((float) this.anIntArray444[local201]);
					local217 = NativeStream.floatToRawIntBits((float) this.anIntArray441[local201]);
					local224 = NativeStream.floatToRawIntBits((float) this.anIntArray445[local201]);
					local229 = this.anIntArray442[local201];
					local236 = this.anIntArray442[local201 + 1];
					for (local238 = local229; local238 < local236; local238++) {
						local247 = this.aShortArray97[local238] - 1;
						if (local247 == -1) {
							break;
						}
						local193.anInt3698 = local110 * local247;
						local193.method2912(local210);
						local193.method2912(local217);
						local193.method2912(local224);
					}
				}
			} else {
				for (local201 = 0; local201 < this.anInt5929; local201++) {
					local210 = NativeStream.floatToRawIntBits((float) this.anIntArray444[local201]);
					local217 = NativeStream.floatToRawIntBits((float) this.anIntArray441[local201]);
					local224 = NativeStream.floatToRawIntBits((float) this.anIntArray445[local201]);
					local229 = this.anIntArray442[local201];
					local236 = this.anIntArray442[local201 + 1];
					for (local238 = local229; local238 < local236; local238++) {
						local247 = this.aShortArray97[local238] - 1;
						if (local247 == -1) {
							break;
						}
						local193.anInt3698 = local110 * local247;
						local193.method2913(local210);
						local193.method2913(local217);
						local193.method2913(local224);
					}
				}
			}
		}
		@Pc(561) float local561;
		@Pc(451) short[] local451;
		@Pc(448) short[] local448;
		@Pc(454) short[] local454;
		@Pc(445) byte[] local445;
		@Pc(605) float local605;
		if (local16) {
			if (this.aClass80_10 == null) {
				if (this.aClass176_1 == null) {
					local445 = this.aByteArray85;
					local448 = this.aShortArray96;
					local451 = this.aShortArray98;
					local454 = this.aShortArray103;
				} else {
					local451 = this.aClass176_1.aShortArray77;
					local448 = this.aClass176_1.aShortArray78;
					local454 = this.aClass176_1.aShortArray76;
					local445 = this.aClass176_1.aByteArray70;
				}
				@Pc(478) float local478 = this.aClass117_Sub1_36.aFloatArray12[0];
				@Pc(484) float local484 = this.aClass117_Sub1_36.aFloatArray12[1];
				@Pc(490) float local490 = this.aClass117_Sub1_36.aFloatArray12[2];
				@Pc(494) float local494 = this.aClass117_Sub1_36.aFloat31;
				@Pc(504) float local504 = this.aClass117_Sub1_36.aFloat50 * 768.0F / (float) this.aShort85;
				@Pc(514) float local514 = this.aClass117_Sub1_36.aFloat44 * 768.0F / (float) this.aShort85;
				for (@Pc(516) int local516 = 0; local516 < this.anInt5895; local516++) {
					@Pc(536) int local536 = this.method4767(this.aShort84, this.aShortArray94[local516], this.aByteArray84[local516], this.aShortArray95[local516]);
					@Pc(545) float local545 = this.aClass117_Sub1_36.aFloat47 * (float) (local536 >>> 24);
					@Pc(550) short local550 = this.aShortArray102[local516];
					local561 = (float) (local536 >> 16 & 0xFF) * this.aClass117_Sub1_36.aFloat45;
					@Pc(572) float local572 = this.aClass117_Sub1_36.aFloat30 * (float) (local536 >> 8 & 0xFF);
					@Pc(577) short local577 = (short) local445[local550];
					if (local577 == 0) {
						local605 = ((float) local451[local550] * local478 + local484 * (float) local448[local550] + (float) local454[local550] * local490) * 0.0026041667F;
					} else {
						local605 = ((float) local454[local550] * local490 + local484 * (float) local448[local550] + (float) local451[local550] * local478) / (float) (local577 * 256);
					}
					@Pc(642) float local642 = (local605 < 0.0F ? local514 : local504) * local605 + local494;
					@Pc(647) int local647 = (int) (local642 * local545);
					if (local647 < 0) {
						local647 = 0;
					} else if (local647 > 255) {
						local647 = 255;
					}
					@Pc(666) int local666 = (int) (local561 * local642);
					if (local666 < 0) {
						local666 = 0;
					} else if (local666 > 255) {
						local666 = 255;
					}
					@Pc(682) int local682 = (int) (local642 * local572);
					local193.anInt3698 = local114 + local550 * local110;
					if (local682 < 0) {
						local682 = 0;
					} else if (local682 > 255) {
						local682 = 255;
					}
					local193.method2934(local647);
					local193.method2934(local666);
					local193.method2934(local682);
					local193.method2934(255 - (this.aByteArray84[local516] & 0xFF));
					local550 = this.aShortArray93[local516];
					local577 = local445[local550];
					if (local577 == 0) {
						local605 = ((float) local448[local550] * local484 + local478 * (float) local451[local550] + local490 * (float) local454[local550]) * 0.0026041667F;
					} else {
						local605 = ((float) local448[local550] * local484 + (float) local451[local550] * local478 + local490 * (float) local454[local550]) / (float) (local577 * 256);
					}
					local642 = (local605 < 0.0F ? local514 : local504) * local605 + local494;
					local647 = (int) (local642 * local545);
					local666 = (int) (local561 * local642);
					if (local647 < 0) {
						local647 = 0;
					} else if (local647 > 255) {
						local647 = 255;
					}
					if (local666 < 0) {
						local666 = 0;
					} else if (local666 > 255) {
						local666 = 255;
					}
					local682 = (int) (local572 * local642);
					local193.anInt3698 = local114 + local110 * local550;
					if (local682 < 0) {
						local682 = 0;
					} else if (local682 > 255) {
						local682 = 255;
					}
					local193.method2934(local647);
					local193.method2934(local666);
					local193.method2934(local682);
					local193.method2934(255 - (this.aByteArray84[local516] & 0xFF));
					local550 = this.aShortArray101[local516];
					local577 = local445[local550];
					if (local577 == 0) {
						local605 = ((float) local454[local550] * local490 + (float) local448[local550] * local484 + local478 * (float) local451[local550]) * 0.0026041667F;
					} else {
						local605 = (local490 * (float) local454[local550] + (float) local451[local550] * local478 + local484 * (float) local448[local550]) / (float) (local577 * 256);
					}
					local642 = local494 + (local605 < 0.0F ? local514 : local504) * local605;
					local647 = (int) (local545 * local642);
					if (local647 < 0) {
						local647 = 0;
					} else if (local647 > 255) {
						local647 = 255;
					}
					local666 = (int) (local561 * local642);
					local682 = (int) (local642 * local572);
					if (local666 < 0) {
						local666 = 0;
					} else if (local666 > 255) {
						local666 = 255;
					}
					if (local682 < 0) {
						local682 = 0;
					} else if (local682 > 255) {
						local682 = 255;
					}
					local193.anInt3698 = local110 * local550 + local114;
					local193.method2934(local647);
					local193.method2934(local666);
					local193.method2934(local682);
					local193.method2934(255 - (this.aByteArray84[local516] & 0xFF));
				}
			} else {
				for (local201 = 0; local201 < this.anInt5895; local201++) {
					local210 = this.method4767(this.aShort84, this.aShortArray94[local201], this.aByteArray84[local201], this.aShortArray95[local201]);
					local193.anInt3698 = local114 + local110 * this.aShortArray102[local201];
					local193.method2912(local210);
					local193.anInt3698 = local114 + this.aShortArray93[local201] * local110;
					local193.method2912(local210);
					local193.anInt3698 = local110 * this.aShortArray101[local201] + local114;
					local193.method2912(local210);
				}
			}
		}
		if (local27) {
			if (this.aClass176_1 == null) {
				local445 = this.aByteArray85;
				local451 = this.aShortArray98;
				local448 = this.aShortArray96;
				local454 = this.aShortArray103;
			} else {
				local445 = this.aClass176_1.aByteArray70;
				local448 = this.aClass176_1.aShortArray78;
				local451 = this.aClass176_1.aShortArray77;
				local454 = this.aClass176_1.aShortArray76;
			}
			@Pc(1091) float local1091 = 3.0F / (float) this.aShort85;
			local193.anInt3698 = local116;
			local605 = 3.0F / (float) (this.aShort85 + this.aShort85 / 2);
			if (this.aClass117_Sub1_36.aBoolean291) {
				for (local238 = 0; local238 < this.anInt5902; local238++) {
					local247 = local445[local238] & 0xFF;
					if (local247 == 0) {
						local193.method2067((float) local451[local238] * local605);
						local193.method2067((float) local448[local238] * local605);
						local193.method2067((float) local454[local238] * local605);
					} else {
						local561 = local1091 / (float) local247;
						local193.method2067(local561 * (float) local451[local238]);
						local193.method2067((float) local448[local238] * local561);
						local193.method2067((float) local454[local238] * local561);
					}
					local193.anInt3698 += local110 - 12;
				}
			} else {
				for (local238 = 0; local238 < this.anInt5902; local238++) {
					local247 = local445[local238] & 0xFF;
					if (local247 == 0) {
						local193.method2063((float) local451[local238] * local605);
						local193.method2063((float) local448[local238] * local605);
						local193.method2063((float) local454[local238] * local605);
					} else {
						local561 = local1091 / (float) local247;
						local193.method2063(local561 * (float) local451[local238]);
						local193.method2063((float) local448[local238] * local561);
						local193.method2063((float) local454[local238] * local561);
					}
					local193.anInt3698 += local110 - 12;
				}
			}
		}
		if (local49) {
			local193.anInt3698 = local118;
			if (this.aClass117_Sub1_36.aBoolean291) {
				for (local201 = 0; local201 < this.anInt5902; local201++) {
					local193.method2067(this.aFloatArray34[local201]);
					local193.method2067(this.aFloatArray35[local201]);
					local193.anInt3698 += local110 - 8;
				}
			} else {
				for (local201 = 0; local201 < this.anInt5902; local201++) {
					local193.method2063(this.aFloatArray34[local201]);
					local193.method2063(this.aFloatArray35[local201]);
					local193.anInt3698 += local110 - 8;
				}
			}
		}
		local193.anInt3698 = local110 * this.anInt5902;
		@Pc(1391) Interface9 local1391;
		if (arg0) {
			if (this.anInterface9_6 == null) {
				this.anInterface9_6 = this.aClass117_Sub1_36.method2459(local110, true, local193.anInt3698, local193.aByteArray38);
			} else {
				this.anInterface9_6.method3689(local110, local193.anInt3698, local193.aByteArray38);
			}
			this.aByte86 = 0;
			local1391 = this.anInterface9_6;
		} else {
			local1391 = this.aClass117_Sub1_36.method2459(local110, false, local193.anInt3698, local193.aByteArray38);
			this.aBoolean525 = true;
		}
		if (local38) {
			this.aClass80_9.anInterface9_2 = local1391;
			this.aClass80_9.aByte35 = 0;
		}
		if (local49) {
			this.aClass80_12.anInterface9_2 = local1391;
			this.aClass80_12.aByte35 = local118;
		}
		if (local16) {
			this.aClass80_11.aByte35 = local114;
			this.aClass80_11.anInterface9_2 = local1391;
		}
		if (local27) {
			this.aClass80_10.anInterface9_2 = local1391;
			this.aClass80_10.aByte35 = local116;
		}
	}

	@OriginalMember(owner = "client!rr", name = "B", descriptor = "()I")
	@Override
	public int B() {
		if (!this.aBoolean526) {
			this.method4768();
		}
		return this.lb;
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V")
	private void method4762() {
		if (this.anInt5903 == 0) {
			return;
		}
		if (this.aByte86 != 0) {
			this.method4761(true);
		}
		this.method4761(false);
		if (this.aClass149_1 != null) {
			if (this.aClass149_1.anInterface3_4 == null) {
				this.method4773((this.aByte86 & 0x10) != 0);
			}
			if (this.aClass149_1.anInterface3_4 != null) {
				this.aClass117_Sub1_36.method2498(this.aClass80_10 != null);
				this.aClass117_Sub1_36.method2475(this.aClass80_12, this.aClass80_10, this.aClass80_11, this.aClass80_9);
				@Pc(78) int local78 = this.anIntArray443.length - 1;
				for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
					@Pc(87) int local87 = this.anIntArray443[local80];
					@Pc(94) int local94 = this.anIntArray443[local80 + 1];
					@Pc(101) int local101 = this.aShortArray94[local87] & 0xFFFF;
					if (local101 == 65535) {
						local101 = -1;
					}
					this.aClass117_Sub1_36.method2460(local101, this.aClass80_10 != null);
					this.aClass117_Sub1_36.method2534(local87 * 3, this.aClass149_1.anInterface3_4, (local94 - local87) * 3);
				}
			}
		}
		this.method4759();
	}

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "(SS)V")
	@Override
	public void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5895; local7++) {
			if (this.aShortArray95[local7] == arg0) {
				this.aShortArray95[local7] = arg1;
			}
		}
		if (this.aClass193Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt5912; local34++) {
				@Pc(41) Class193 local41 = this.aClass193Array1[local34];
				@Pc(46) Class114 local46 = this.aClass114Array1[local34];
				local46.anInt2856 = Static134.anIntArray182[this.aShortArray95[local41.anInt5141] & 0xFFFF] & 0xFFFFFF | local46.anInt2856 & 0xFF000000;
			}
		}
		if (this.aClass80_11 != null) {
			this.aClass80_11.anInterface9_2 = null;
		}
	}

	@OriginalMember(owner = "client!rr", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return this.aShort85;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BIIIIIIII)Z")
	private boolean method4765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg4 && arg0 > arg2 && arg5 > arg2) {
			return false;
		} else if (arg2 > arg4 && arg2 > arg0 && arg5 < arg2) {
			return false;
		} else if (arg3 < arg6 && arg3 < arg7 && arg1 > arg3) {
			return false;
		} else {
			return arg3 <= arg6 || arg7 >= arg3 || arg3 <= arg1;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!rr;ILclient!rr;BZZ)Lclient!e;")
	private Class8 method4766(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub2 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		arg2.anInt5910 = this.anInt5910;
		arg2.aShort85 = this.aShort85;
		arg2.anInt5903 = this.anInt5903;
		arg2.anInt5912 = this.anInt5912;
		arg2.anInt5895 = this.anInt5895;
		arg2.anInt5885 = arg1;
		arg2.aShort84 = this.aShort84;
		arg2.aByte86 = 0;
		arg2.anInt5929 = this.anInt5929;
		arg2.anInt5902 = this.anInt5902;
		arg2.anInt5900 = this.anInt5900;
		@Pc(53) boolean local53 = Static344.method4573(this.anInt5900, arg1);
		@Pc(59) boolean local59 = Static446.method5652(arg1, this.anInt5900);
		@Pc(65) boolean local65 = Static440.method2582(arg1, this.anInt5900);
		@Pc(71) boolean local71 = local53 | local59 | local65;
		@Pc(176) int local176;
		if (local71) {
			if (!local53) {
				arg2.anIntArray444 = this.anIntArray444;
			} else if (arg0.anIntArray444 == null || arg0.anIntArray444.length < this.anInt5910) {
				arg2.anIntArray444 = arg0.anIntArray444 = new int[this.anInt5910];
			} else {
				arg2.anIntArray444 = arg0.anIntArray444;
			}
			if (!local59) {
				arg2.anIntArray441 = this.anIntArray441;
			} else if (arg0.anIntArray441 == null || arg0.anIntArray441.length < this.anInt5910) {
				arg2.anIntArray441 = arg0.anIntArray441 = new int[this.anInt5910];
			} else {
				arg2.anIntArray441 = arg0.anIntArray441;
			}
			if (!local65) {
				arg2.anIntArray445 = this.anIntArray445;
			} else if (arg0.anIntArray445 == null || arg0.anIntArray445.length < this.anInt5910) {
				arg2.anIntArray445 = arg0.anIntArray445 = new int[this.anInt5910];
			} else {
				arg2.anIntArray445 = arg0.anIntArray445;
			}
			for (local176 = 0; local176 < this.anInt5910; local176++) {
				if (local53) {
					arg2.anIntArray444[local176] = this.anIntArray444[local176];
				}
				if (local59) {
					arg2.anIntArray441[local176] = this.anIntArray441[local176];
				}
				if (local65) {
					arg2.anIntArray445[local176] = this.anIntArray445[local176];
				}
			}
		} else {
			arg2.anIntArray445 = this.anIntArray445;
			arg2.anIntArray444 = this.anIntArray444;
			arg2.anIntArray441 = this.anIntArray441;
		}
		if (Static180.method2596(this.anInt5900, arg1)) {
			arg2.aClass80_9 = arg0.aClass80_9;
			if (arg3) {
				arg2.aByte86 = (byte) (arg2.aByte86 | 0x1);
			}
			arg2.aClass80_9.aByte35 = this.aClass80_9.aByte35;
			arg2.aClass80_9.anInterface9_2 = this.aClass80_9.anInterface9_2;
		} else if (Static92.method3325(this.anInt5900, arg1)) {
			arg2.aClass80_9 = this.aClass80_9;
		} else {
			arg2.aClass80_9 = null;
		}
		if (Static206.method2989(arg1, this.anInt5900)) {
			if (arg0.aShortArray95 == null || arg0.aShortArray95.length < this.anInt5895) {
				arg2.aShortArray95 = arg0.aShortArray95 = new short[this.anInt5895];
			} else {
				arg2.aShortArray95 = arg0.aShortArray95;
			}
			for (local176 = 0; local176 < this.anInt5895; local176++) {
				arg2.aShortArray95[local176] = this.aShortArray95[local176];
			}
		} else {
			arg2.aShortArray95 = this.aShortArray95;
		}
		if (Static86.method5984(this.anInt5900, arg1)) {
			if (arg0.aByteArray84 == null || this.anInt5895 > arg0.aByteArray84.length) {
				arg2.aByteArray84 = arg0.aByteArray84 = new byte[this.anInt5895];
			} else {
				arg2.aByteArray84 = arg0.aByteArray84;
			}
			for (local176 = 0; local176 < this.anInt5895; local176++) {
				arg2.aByteArray84[local176] = this.aByteArray84[local176];
			}
		} else {
			arg2.aByteArray84 = this.aByteArray84;
		}
		if (Static275.method3737(this.anInt5900, arg1)) {
			arg2.aClass80_11 = arg0.aClass80_11;
			if (arg3) {
				arg2.aByte86 = (byte) (arg2.aByte86 | 0x2);
			}
			arg2.aClass80_11.aByte35 = this.aClass80_11.aByte35;
			arg2.aClass80_11.anInterface9_2 = this.aClass80_11.anInterface9_2;
		} else if (Static367.method4802(this.anInt5900, arg1)) {
			arg2.aClass80_11 = this.aClass80_11;
		} else {
			arg2.aClass80_11 = null;
		}
		@Pc(552) int local552;
		if (Static421.method5391(this.anInt5900, arg1)) {
			if (arg0.aShortArray98 == null || arg0.aShortArray98.length < this.anInt5902) {
				local176 = this.anInt5902;
				arg2.aShortArray96 = arg0.aShortArray96 = new short[local176];
				arg2.aShortArray98 = arg0.aShortArray98 = new short[local176];
				arg2.aShortArray103 = arg0.aShortArray103 = new short[local176];
			} else {
				arg2.aShortArray96 = arg0.aShortArray96;
				arg2.aShortArray98 = arg0.aShortArray98;
				arg2.aShortArray103 = arg0.aShortArray103;
			}
			if (this.aClass176_1 == null) {
				for (local176 = 0; local176 < this.anInt5902; local176++) {
					arg2.aShortArray98[local176] = this.aShortArray98[local176];
					arg2.aShortArray96[local176] = this.aShortArray96[local176];
					arg2.aShortArray103[local176] = this.aShortArray103[local176];
				}
			} else {
				if (arg0.aClass176_1 == null) {
					arg0.aClass176_1 = new Class176();
				}
				@Pc(540) Class176 local540 = arg2.aClass176_1 = arg0.aClass176_1;
				if (local540.aShortArray77 == null || this.anInt5902 > local540.aShortArray77.length) {
					local552 = this.anInt5902;
					local540.aShortArray76 = new short[local552];
					local540.aShortArray78 = new short[local552];
					local540.aShortArray77 = new short[local552];
					local540.aByteArray70 = new byte[local552];
				}
				for (local552 = 0; local552 < this.anInt5902; local552++) {
					arg2.aShortArray98[local552] = this.aShortArray98[local552];
					arg2.aShortArray96[local552] = this.aShortArray96[local552];
					arg2.aShortArray103[local552] = this.aShortArray103[local552];
					local540.aShortArray77[local552] = this.aClass176_1.aShortArray77[local552];
					local540.aShortArray78[local552] = this.aClass176_1.aShortArray78[local552];
					local540.aShortArray76[local552] = this.aClass176_1.aShortArray76[local552];
					local540.aByteArray70[local552] = this.aClass176_1.aByteArray70[local552];
				}
			}
			arg2.aByteArray85 = this.aByteArray85;
		} else {
			arg2.aShortArray98 = this.aShortArray98;
			arg2.aByteArray85 = this.aByteArray85;
			arg2.aClass176_1 = this.aClass176_1;
			arg2.aShortArray96 = this.aShortArray96;
			arg2.aShortArray103 = this.aShortArray103;
		}
		if (Static157.method2094(arg1, this.anInt5900)) {
			arg2.aClass80_10 = arg0.aClass80_10;
			if (arg3) {
				arg2.aByte86 = (byte) (arg2.aByte86 | 0x4);
			}
			arg2.aClass80_10.anInterface9_2 = this.aClass80_10.anInterface9_2;
			arg2.aClass80_10.aByte35 = this.aClass80_10.aByte35;
		} else if (Static91.method1067(this.anInt5900, arg1)) {
			arg2.aClass80_10 = this.aClass80_10;
		} else {
			arg2.aClass80_10 = null;
		}
		if (Static329.method4322(arg1, this.anInt5900)) {
			if (arg0.aFloatArray34 == null || this.anInt5895 > arg0.aFloatArray34.length) {
				local176 = this.anInt5902;
				arg2.aFloatArray35 = arg0.aFloatArray35 = new float[local176];
				arg2.aFloatArray34 = arg0.aFloatArray34 = new float[local176];
			} else {
				arg2.aFloatArray35 = arg0.aFloatArray35;
				arg2.aFloatArray34 = arg0.aFloatArray34;
			}
			for (local176 = 0; local176 < this.anInt5902; local176++) {
				arg2.aFloatArray34[local176] = this.aFloatArray34[local176];
				arg2.aFloatArray35[local176] = this.aFloatArray35[local176];
			}
		} else {
			arg2.aFloatArray34 = this.aFloatArray34;
			arg2.aFloatArray35 = this.aFloatArray35;
		}
		if (Static70.method3912(arg1, this.anInt5900)) {
			if (arg3) {
				arg2.aByte86 = (byte) (arg2.aByte86 | 0x8);
			}
			arg2.aClass80_12 = arg0.aClass80_12;
			arg2.aClass80_12.anInterface9_2 = this.aClass80_12.anInterface9_2;
			arg2.aClass80_12.aByte35 = this.aClass80_12.aByte35;
		} else if (Static392.method5095(this.anInt5900, arg1)) {
			arg2.aClass80_12 = this.aClass80_12;
		} else {
			arg2.aClass80_12 = null;
		}
		if (Static465.method5695(this.anInt5900, arg1)) {
			if (arg0.aShortArray102 == null || this.anInt5895 > arg0.aShortArray102.length) {
				local176 = this.anInt5895;
				arg2.aShortArray93 = arg0.aShortArray93 = new short[local176];
				arg2.aShortArray102 = arg0.aShortArray102 = new short[local176];
				arg2.aShortArray101 = arg0.aShortArray101 = new short[local176];
			} else {
				arg2.aShortArray102 = arg0.aShortArray102;
				arg2.aShortArray101 = arg0.aShortArray101;
				arg2.aShortArray93 = arg0.aShortArray93;
			}
			for (local176 = 0; local176 < this.anInt5895; local176++) {
				arg2.aShortArray102[local176] = this.aShortArray102[local176];
				arg2.aShortArray93[local176] = this.aShortArray93[local176];
				arg2.aShortArray101[local176] = this.aShortArray101[local176];
			}
		} else {
			arg2.aShortArray102 = this.aShortArray102;
			arg2.aShortArray101 = this.aShortArray101;
			arg2.aShortArray93 = this.aShortArray93;
		}
		if (Static303.method4048(this.anInt5900, arg1)) {
			if (arg3) {
				arg2.aByte86 = (byte) (arg2.aByte86 | 0x10);
			}
			arg2.aClass149_1 = arg0.aClass149_1;
			arg2.aClass149_1.anInterface3_4 = this.aClass149_1.anInterface3_4;
		} else if (Static196.method2817(arg1, this.anInt5900)) {
			arg2.aClass149_1 = this.aClass149_1;
		} else {
			arg2.aClass149_1 = null;
		}
		if (Static59.method836(this.anInt5900, arg1)) {
			if (arg0.aShortArray94 == null || this.anInt5895 > arg0.aShortArray94.length) {
				local176 = this.anInt5895;
				arg2.aShortArray94 = arg0.aShortArray94 = new short[local176];
			} else {
				arg2.aShortArray94 = arg0.aShortArray94;
			}
			for (local176 = 0; local176 < this.anInt5895; local176++) {
				arg2.aShortArray94[local176] = this.aShortArray94[local176];
			}
		} else {
			arg2.aShortArray94 = this.aShortArray94;
		}
		if (!Static451.method5819(arg1, this.anInt5900)) {
			arg2.aClass114Array1 = this.aClass114Array1;
		} else if (arg0.aClass114Array1 == null || this.anInt5912 > arg0.aClass114Array1.length) {
			local176 = this.anInt5912;
			arg2.aClass114Array1 = arg0.aClass114Array1 = new Class114[local176];
			for (local552 = 0; local552 < this.anInt5912; local552++) {
				arg2.aClass114Array1[local552] = this.aClass114Array1[local552].method2284();
			}
		} else {
			arg2.aClass114Array1 = arg0.aClass114Array1;
			for (local176 = 0; local176 < this.anInt5912; local176++) {
				arg2.aClass114Array1[local176].method2285(this.aClass114Array1[local176]);
			}
		}
		arg2.aClass193Array1 = this.aClass193Array1;
		arg2.aClass230Array3 = this.aClass230Array3;
		arg2.aClass40Array3 = this.aClass40Array3;
		arg2.aShortArray99 = this.aShortArray99;
		if (this.aBoolean526) {
			arg2.aShort88 = this.aShort88;
			arg2.aShort86 = this.aShort86;
			arg2.aBoolean526 = true;
			arg2.aShort91 = this.aShort91;
			arg2.aShort90 = this.aShort90;
			arg2.lb = this.lb;
			arg2.aShort87 = this.aShort87;
			arg2.aShort89 = this.aShort89;
		} else {
			arg2.aBoolean526 = false;
		}
		arg2.anIntArray442 = this.anIntArray442;
		arg2.anIntArrayArray46 = this.anIntArrayArray46;
		arg2.anIntArrayArray45 = this.anIntArrayArray45;
		arg2.anIntArrayArray44 = this.anIntArrayArray44;
		arg2.anIntArray443 = this.anIntArray443;
		arg2.aShortArray100 = this.aShortArray100;
		arg2.aShortArray97 = this.aShortArray97;
		return arg2;
	}

	@OriginalMember(owner = "client!rr", name = "ta", descriptor = "()I")
	@Override
	public int ta() {
		if (!this.aBoolean526) {
			this.method4768();
		}
		return this.aShort91;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IISBI)I")
	private int method4767(@OriginalArg(0) int arg0, @OriginalArg(2) short arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = Static134.anIntArray182[Static312.method4115(arg0, arg3)];
		if (arg1 != -1) {
			@Pc(28) Class25 local28 = this.aClass117_Sub1_36.anInterface4_10.method5090(arg1 & 0xFFFF);
			@Pc(33) int local33 = local28.aByte12 & 0xFF;
			@Pc(45) int local45;
			@Pc(67) int local67;
			if (local33 != 0) {
				if (arg0 < 0) {
					local45 = 0;
				} else if (arg0 > 127) {
					local45 = 16777215;
				} else {
					local45 = arg0 * 131586;
				}
				if (local33 == 256) {
					local16 = local45;
				} else {
					local67 = 256 - local33;
					local16 = ((local45 & 0xFF00FF) * local33 + local67 * (local16 & 0xFF00FF) & 0xFF00FF00) + ((local16 & 0xFF00) * local67 + (local45 & 0xFF00) * local33 & 0xFF0000) >> 8;
				}
			}
			local45 = local28.aByte7 & 0xFF;
			if (local45 != 0) {
				local45 += 256;
				@Pc(121) int local121 = local45 * (local16 >> 16 & 0xFF);
				if (local121 > 65535) {
					local121 = 65535;
				}
				local67 = (local16 >> 8 & 0xFF) * local45;
				if (local67 > 65535) {
					local67 = 65535;
				}
				@Pc(145) int local145 = local45 * (local16 & 0xFF);
				if (local145 > 65535) {
					local145 = 65535;
				}
				local16 = (local145 >> 8) + (local67 & 0xFF00) + (local121 << 8 & 0xFF00C4);
			}
		}
		return (local16 << 8) + 255 - (arg2 & 0xFF);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt5895; local7++) {
			local16 = this.aShortArray95[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg0 != -1) {
				local22 -= -((arg0 - local22) * arg3 >> 7);
			}
			@Pc(62) int local62 = local16 & 0x7F;
			if (arg2 != -1) {
				local62 += (arg2 - local62) * arg3 >> 7;
			}
			this.aShortArray95[local7] = (short) (local62 | local28 << 7 | local22 << 10);
		}
		if (this.aClass193Array1 != null) {
			for (local16 = 0; local16 < this.anInt5912; local16++) {
				@Pc(111) Class193 local111 = this.aClass193Array1[local16];
				@Pc(116) Class114 local116 = this.aClass114Array1[local16];
				local116.anInt2856 = local116.anInt2856 & 0xFF000000 | Static134.anIntArray182[this.aShortArray95[local111.anInt5141] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass80_11 != null) {
			this.aClass80_11.anInterface9_2 = null;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "()[Lclient!sd;")
	@Override
	public Class230[] method5988() {
		return this.aClass230Array3;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5929; local3++) {
			if (arg0 != 0) {
				this.anIntArray444[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray441[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray445[local3] += arg2;
			}
		}
		if (this.aClass80_9 != null) {
			this.aClass80_9.anInterface9_2 = null;
		}
		this.aBoolean526 = false;
	}

	@OriginalMember(owner = "client!rr", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.aShort84 = (short) arg0;
		if (this.aClass80_11 != null) {
			this.aClass80_11.anInterface9_2 = null;
		}
	}

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "(SS)V")
	@Override
	public void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass117_Sub1_36.anInterface4_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5895; local11++) {
			if (this.aShortArray94[local11] == arg0) {
				this.aShortArray94[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class25 local48 = local9.method5090(arg0 & 0xFFFF);
			local37 = local48.aByte7;
			local35 = local48.aByte12;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(69) Class25 local69 = local9.method5090(arg1 & 0xFFFF);
			local56 = local69.aByte12;
			local58 = local69.aByte7;
		}
		if (!(local37 != local58 | local35 != local56)) {
			return;
		}
		if (this.aClass193Array1 != null) {
			for (@Pc(98) int local98 = 0; local98 < this.anInt5912; local98++) {
				@Pc(105) Class193 local105 = this.aClass193Array1[local98];
				@Pc(110) Class114 local110 = this.aClass114Array1[local98];
				local110.anInt2856 = local110.anInt2856 & 0xFF000000 | Static134.anIntArray182[this.aShortArray95[local105.anInt5141] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass80_11 != null) {
			this.aClass80_11.anInterface9_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "()I")
	@Override
	public int k() {
		if (!this.aBoolean526) {
			this.method4768();
		}
		return this.aShort90;
	}

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean526) {
			this.method4768();
		}
		return this.aShort89;
	}

	@OriginalMember(owner = "client!rr", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		return this.aShort84;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method5985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class34_Sub2 local8 = (Class34_Sub2) arg2;
		@Pc(12) Class34_Sub2 local12 = this.aClass117_Sub1_36.aClass34_Sub2_3;
		@Pc(33) float local33 = local12.aFloat24 * local8.aFloat26 + local8.aFloat20 * local12.aFloat18 + local12.aFloat17 * local8.aFloat15 + local12.aFloat15;
		@Pc(54) float local54 = local12.aFloat20 + local8.aFloat26 * local12.aFloat25 + local8.aFloat15 * local12.aFloat23 + local8.aFloat20 * local12.aFloat21;
		Static364.aFloat79 = local8.aFloat22 * local12.aFloat24 + local8.aFloat23 * local12.aFloat18 + local8.aFloat17 * local12.aFloat17;
		Static153.aFloat27 = local8.aFloat23 * local12.aFloat16 + local12.aFloat22 * local8.aFloat17 + local8.aFloat22 * local12.aFloat19;
		Static351.aFloat74 = local8.aFloat16 * local12.aFloat24 + local8.aFloat21 * local12.aFloat18 + local8.aFloat18 * local12.aFloat17;
		Static354.aFloat77 = local8.aFloat16 * local12.aFloat19 + local8.aFloat21 * local12.aFloat16 + local12.aFloat22 * local8.aFloat18;
		Static41.aFloat5 = local8.aFloat19 * local12.aFloat24 + local12.aFloat18 * local8.aFloat25 + local12.aFloat17 * local8.aFloat24;
		Static253.aFloat60 = local12.aFloat21 * local8.aFloat21 + local8.aFloat18 * local12.aFloat23 + local8.aFloat16 * local12.aFloat25;
		Static342.aFloat73 = local12.aFloat23 * local8.aFloat24 + local8.aFloat25 * local12.aFloat21 + local12.aFloat25 * local8.aFloat19;
		Static81.aFloat7 = local12.aFloat22 * local8.aFloat24 + local8.aFloat25 * local12.aFloat16 + local8.aFloat19 * local12.aFloat19;
		Static352.aFloat75 = local12.aFloat21 * local8.aFloat23 + local8.aFloat17 * local12.aFloat23 + local8.aFloat22 * local12.aFloat25;
		@Pc(237) float local237 = local8.aFloat20 * local12.aFloat16 + local8.aFloat15 * local12.aFloat22 + local8.aFloat26 * local12.aFloat19 + local12.aFloat26;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass117_Sub1_36.anInt3123;
		@Pc(255) int local255 = this.aClass117_Sub1_36.anInt3118;
		if (!this.aBoolean526) {
			this.method4768();
		}
		Static17.anIntArray310[0] = this.aShort91;
		Static378.anIntArray457[0] = this.lb;
		Static17.anIntArray310[1] = this.aShort88;
		Static349.anIntArray413[0] = this.aShort87;
		Static378.anIntArray457[1] = this.lb;
		Static17.anIntArray310[2] = this.aShort91;
		Static349.anIntArray413[1] = this.aShort87;
		Static378.anIntArray457[2] = this.aShort89;
		Static17.anIntArray310[3] = this.aShort88;
		Static349.anIntArray413[2] = this.aShort87;
		Static378.anIntArray457[3] = this.aShort89;
		Static349.anIntArray413[3] = this.aShort87;
		Static17.anIntArray310[4] = this.aShort91;
		Static378.anIntArray457[4] = this.lb;
		Static17.anIntArray310[5] = this.aShort88;
		Static349.anIntArray413[4] = this.aShort86;
		Static378.anIntArray457[5] = this.lb;
		Static349.anIntArray413[5] = this.aShort86;
		Static17.anIntArray310[6] = this.aShort91;
		Static378.anIntArray457[6] = this.aShort89;
		Static349.anIntArray413[6] = this.aShort86;
		Static17.anIntArray310[7] = this.aShort88;
		Static378.anIntArray457[7] = this.aShort89;
		Static349.anIntArray413[7] = this.aShort86;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(414) float local414;
		@Pc(395) float local395;
		@Pc(390) float local390;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static378.anIntArray457[local383];
			local395 = Static17.anIntArray310[local383];
			local400 = Static349.anIntArray413[local383];
			local414 = Static81.aFloat7 * local400 + local395 * Static153.aFloat27 + Static354.aFloat77 * local390 + local237;
			local428 = local54 + local395 * Static352.aFloat75 + Static253.aFloat60 * local390 + Static342.aFloat73 * local400;
			local442 = Static41.aFloat5 * local400 + Static364.aFloat79 * local395 + Static351.aFloat74 * local390 + local33;
			if ((float) this.aClass117_Sub1_36.anInt3131 <= local414) {
				@Pc(461) float local461 = local442 * (float) local251 / local414 + (float) this.aClass117_Sub1_36.anInt3116;
				@Pc(473) float local473 = (float) this.aClass117_Sub1_36.anInt3111 + (float) local255 * local428 / local414;
				if (local461 < local241) {
					local241 = local461;
				}
				if (local243 < local461) {
					local243 = local461;
				}
				local239 = true;
				if (local245 > local473) {
					local245 = local473;
				}
				if (local247 < local473) {
					local247 = local473;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && (float) arg0 < local243 && (float) arg1 > local245 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.aClass117_Sub1_36.anIntArray232.length < this.anInt5902) {
				this.aClass117_Sub1_36.anIntArray231 = new int[this.anInt5902];
				this.aClass117_Sub1_36.anIntArray232 = new int[this.anInt5902];
			}
			@Pc(556) int[] local556 = this.aClass117_Sub1_36.anIntArray232;
			@Pc(560) int[] local560 = this.aClass117_Sub1_36.anIntArray231;
			@Pc(636) int local636;
			for (@Pc(562) int local562 = 0; local562 < this.anInt5929; local562++) {
				local390 = this.anIntArray441[local562];
				local400 = this.anIntArray445[local562];
				local395 = this.anIntArray444[local562];
				local428 = local390 * Static253.aFloat60 + Static352.aFloat75 * local395 + local400 * Static342.aFloat73 + local54;
				local442 = local33 + Static41.aFloat5 * local400 + Static351.aFloat74 * local390 + Static364.aFloat79 * local395;
				local414 = local395 * Static153.aFloat27 + local390 * Static354.aFloat77 + local400 * Static81.aFloat7 + local237;
				@Pc(643) int local643;
				@Pc(645) int local645;
				@Pc(654) int local654;
				if (local414 >= (float) this.aClass117_Sub1_36.anInt3131) {
					local636 = (int) ((float) local251 * local442 / local414 + (float) this.aClass117_Sub1_36.anInt3116);
					local643 = (int) ((float) this.aClass117_Sub1_36.anInt3111 + (float) local255 * local428 / local414);
					local645 = this.anIntArray442[local562];
					local654 = this.anIntArray442[local562 + 1];
					for (@Pc(712) int local712 = local645; local712 < local654; local712++) {
						@Pc(721) int local721 = this.aShortArray97[local712] - 1;
						if (local721 == -1) {
							break;
						}
						local556[local721] = local636;
						local560[local721] = local643;
					}
				} else {
					local636 = this.anIntArray442[local562];
					local643 = this.anIntArray442[local562 + 1];
					for (local645 = local636; local645 < local643; local645++) {
						local654 = this.aShortArray97[local645] - 1;
						if (local654 == -1) {
							break;
						}
						local556[this.aShortArray97[local645] - 1] = -999999;
					}
				}
			}
			for (local636 = 0; local636 < this.anInt5895; local636++) {
				if (local556[this.aShortArray102[local636]] != -999999 && local556[this.aShortArray93[local636]] != -999999 && local556[this.aShortArray101[local636]] != -999999 && this.method4765(local560[this.aShortArray93[local636]], local556[this.aShortArray101[local636]], arg1, arg0, local560[this.aShortArray102[local636]], local560[this.aShortArray101[local636]], local556[this.aShortArray102[local636]], local556[this.aShortArray93[local636]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "()V")
	@Override
	public void method5991() {
		if (this.anInt5902 <= 0 || this.anInt5903 <= 0) {
			return;
		}
		this.method4761(false);
		if ((this.aByte86 & 0x10) == 0 && this.aClass149_1.anInterface3_4 == null) {
			this.method4773(false);
		}
		this.method4759();
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)V")
	private void method4768() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt5929; local27++) {
			@Pc(34) int local34 = this.anIntArray444[local27];
			@Pc(39) int local39 = this.anIntArray441[local27];
			if (local34 > local13) {
				local13 = local34;
			}
			if (local9 > local39) {
				local9 = local39;
			}
			if (local15 < local39) {
				local15 = local39;
			}
			@Pc(59) int local59 = this.anIntArray445[local27];
			if (local34 < local7) {
				local7 = local34;
			}
			if (local11 > local59) {
				local11 = local59;
			}
			if (local59 > local21) {
				local21 = local59;
			}
			@Pc(82) int local82 = local34 * local34 + local59 * local59;
			if (local82 > local23) {
				local23 = local82;
			}
			local82 = local39 * local39 + local59 * local59 + local34 * local34;
			if (local82 > local25) {
				local25 = local82;
			}
		}
		this.aShort91 = (short) local7;
		this.aShort87 = (short) local11;
		this.aShort88 = (short) local13;
		this.lb = (short) local9;
		this.aShort86 = (short) local21;
		this.aShort89 = (short) local15;
		this.aShort90 = (short) (Math.sqrt((double) local23) + 0.99D);
		Math.sqrt((double) local25);
		this.aBoolean526 = true;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BIZ)Lclient!e;")
	@Override
	public Class8 method5983(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class8_Sub2 local16;
		@Pc(12) Class8_Sub2 local12;
		if (arg0 == 1) {
			local12 = this.aClass117_Sub1_36.aClass8_Sub2_3;
			local16 = this.aClass117_Sub1_36.aClass8_Sub2_6;
		} else if (arg0 == 2) {
			local12 = this.aClass117_Sub1_36.aClass8_Sub2_10;
			local16 = this.aClass117_Sub1_36.aClass8_Sub2_8;
		} else if (arg0 == 3) {
			local16 = this.aClass117_Sub1_36.aClass8_Sub2_5;
			local12 = this.aClass117_Sub1_36.aClass8_Sub2_9;
		} else if (arg0 == 4) {
			local12 = this.aClass117_Sub1_36.aClass8_Sub2_4;
			local16 = this.aClass117_Sub1_36.aClass8_Sub2_2;
		} else if (arg0 == 5) {
			local12 = this.aClass117_Sub1_36.aClass8_Sub2_7;
			local16 = this.aClass117_Sub1_36.aClass8_Sub2_1;
		} else {
			local16 = local12 = new Class8_Sub2(this.aClass117_Sub1_36);
		}
		return this.method4766(local12, arg1, local16, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!rr", name = "za", descriptor = "(IIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static203.anInt3768 = 0;
			local14 = 0;
			Static343.anInt5563 = 0;
			Static445.anInt7012 = 0;
			for (local20 = 0; local20 < this.anInt5929; local20++) {
				Static203.anInt3768 += this.anIntArray444[local20];
				Static343.anInt5563 += this.anIntArray441[local20];
				Static445.anInt7012 += this.anIntArray445[local20];
				local14++;
			}
			if (local14 <= 0) {
				Static343.anInt5563 = arg2;
				Static203.anInt3768 = arg1;
				Static445.anInt7012 = arg3;
			} else {
				Static203.anInt3768 = arg1 + Static203.anInt3768 / local14;
				Static445.anInt7012 = arg3 + Static445.anInt7012 / local14;
				Static343.anInt5563 = arg2 + Static343.anInt5563 / local14;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt5929; local14++) {
				this.anIntArray444[local14] += arg1;
				this.anIntArray441[local14] += arg2;
				this.anIntArray445[local14] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(186) int local186;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt5929; local14++) {
					this.anIntArray444[local14] -= Static203.anInt3768;
					this.anIntArray441[local14] -= Static343.anInt5563;
					this.anIntArray445[local14] -= Static445.anInt7012;
					if (arg3 != 0) {
						local20 = Class1_Sub29.anIntArray537[arg3];
						local167 = Class1_Sub29.anIntArray536[arg3];
						local186 = local20 * this.anIntArray441[local14] + this.anIntArray444[local14] * local167 + 32767 >> 15;
						this.anIntArray441[local14] = this.anIntArray441[local14] * local167 + 32767 - local20 * this.anIntArray444[local14] >> 15;
						this.anIntArray444[local14] = local186;
					}
					if (arg1 != 0) {
						local20 = Class1_Sub29.anIntArray537[arg1];
						local167 = Class1_Sub29.anIntArray536[arg1];
						local186 = this.anIntArray441[local14] * local167 + 32767 - this.anIntArray445[local14] * local20 >> 15;
						this.anIntArray445[local14] = this.anIntArray445[local14] * local167 + this.anIntArray441[local14] * local20 + 32767 >> 15;
						this.anIntArray441[local14] = local186;
					}
					if (arg2 != 0) {
						local20 = Class1_Sub29.anIntArray537[arg2];
						local167 = Class1_Sub29.anIntArray536[arg2];
						local186 = this.anIntArray445[local14] * local20 + local167 * this.anIntArray444[local14] + 32767 >> 15;
						this.anIntArray445[local14] = this.anIntArray445[local14] * local167 + 32767 - this.anIntArray444[local14] * local20 >> 15;
						this.anIntArray444[local14] = local186;
					}
					this.anIntArray444[local14] += Static203.anInt3768;
					this.anIntArray441[local14] += Static343.anInt5563;
					this.anIntArray445[local14] += Static445.anInt7012;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt5929; local14++) {
					this.anIntArray444[local14] -= Static203.anInt3768;
					this.anIntArray441[local14] -= Static343.anInt5563;
					this.anIntArray445[local14] -= Static445.anInt7012;
					this.anIntArray444[local14] = arg1 * this.anIntArray444[local14] / 128;
					this.anIntArray441[local14] = arg2 * this.anIntArray441[local14] / 128;
					this.anIntArray445[local14] = arg3 * this.anIntArray445[local14] / 128;
					this.anIntArray444[local14] += Static203.anInt3768;
					this.anIntArray441[local14] += Static343.anInt5563;
					this.anIntArray445[local14] += Static445.anInt7012;
				}
			} else {
				@Pc(515) Class193 local515;
				@Pc(520) Class114 local520;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt5895; local14++) {
						local20 = arg1 * 8 + (this.aByteArray84[local14] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray84[local14] = (byte) local20;
					}
					if (this.aClass80_11 != null) {
						this.aClass80_11.anInterface9_2 = null;
					}
					if (this.aClass193Array1 != null) {
						for (local20 = 0; local20 < this.anInt5912; local20++) {
							local515 = this.aClass193Array1[local20];
							local520 = this.aClass114Array1[local20];
							local520.anInt2856 = 255 - (this.aByteArray84[local515.anInt5141] & 0xFF) << 24 | local520.anInt2856 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt5895; local14++) {
						local20 = this.aShortArray95[local14] & 0xFFFF;
						local167 = local20 >> 10 & 0x3F;
						local186 = local20 >> 7 & 0x7;
						@Pc(576) int local576 = local167 + arg1 & 0x3F;
						@Pc(580) int local580 = local20 & 0x7F;
						local186 += arg2 / 4;
						local580 += arg3;
						if (local186 < 0) {
							local186 = 0;
						} else if (local186 > 7) {
							local186 = 7;
						}
						if (local580 < 0) {
							local580 = 0;
						} else if (local580 > 127) {
							local580 = 127;
						}
						this.aShortArray95[local14] = (short) (local186 << 7 | local576 << 10 | local580);
					}
					if (this.aClass80_11 != null) {
						this.aClass80_11.anInterface9_2 = null;
					}
					if (this.aClass193Array1 != null) {
						for (local20 = 0; local20 < this.anInt5912; local20++) {
							local515 = this.aClass193Array1[local20];
							local520 = this.aClass114Array1[local20];
							local520.anInt2856 = Static134.anIntArray182[this.aShortArray95[local515.anInt5141] & 0xFFFF] & 0xFFFFFF | local520.anInt2856 & 0xFF000000;
						}
					}
				} else {
					@Pc(695) Class114 local695;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt5912; local14++) {
							local695 = this.aClass114Array1[local14];
							local695.anInt2850 += arg1;
							local695.anInt2857 += arg2;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt5912; local14++) {
							local695 = this.aClass114Array1[local14];
							local695.anInt2859 = local695.anInt2859 * arg2 >> 7;
							local695.anInt2852 = arg1 * local695.anInt2852 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt5912; local14++) {
							local695 = this.aClass114Array1[local14];
							local695.anInt2854 = local695.anInt2854 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class139 arg2, @OriginalArg(3) Class139 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean526) {
			this.method4768();
		}
		@Pc(17) int local17 = arg4 + this.aShort91;
		@Pc(22) int local22 = arg4 + this.aShort88;
		@Pc(27) int local27 = this.aShort87 + arg6;
		@Pc(32) int local32 = arg6 + this.aShort86;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt6760 + local22 >> arg2.anInt6759 >= arg2.anInt6757 || local27 < 0 || arg2.anInt6758 <= arg2.anInt6760 + local32 >> arg2.anInt6759)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || arg3.anInt6757 <= arg3.anInt6760 + local22 >> arg3.anInt6759 || local27 < 0 || local32 + arg3.anInt6760 >> arg3.anInt6759 >= arg3.anInt6758) {
				return;
			}
		} else {
			local17 >>= arg2.anInt6759;
			local22 = arg2.anInt6760 + local22 - 1 >> arg2.anInt6759;
			local27 >>= arg2.anInt6759;
			local32 = arg2.anInt6760 + local32 - 1 >> arg2.anInt6759;
			if (arg5 == arg2.ua(local17, local27) && arg5 == arg2.ua(local22, local27) && arg5 == arg2.ua(local17, local32) && arg5 == arg2.ua(local22, local32)) {
				return;
			}
		}
		@Pc(191) int local191;
		if (arg0 == 1) {
			for (local191 = 0; local191 < this.anInt5929; local191++) {
				this.anIntArray441[local191] = this.anIntArray441[local191] + arg2.ca(arg4 + this.anIntArray444[local191], this.anIntArray445[local191] + arg6) - arg5;
			}
		} else {
			@Pc(244) int local244;
			@Pc(255) int local255;
			if (arg0 == 2) {
				@Pc(239) short local239 = this.lb;
				if (local239 == 0) {
					return;
				}
				for (local244 = 0; local244 < this.anInt5929; local244++) {
					local255 = (this.anIntArray441[local244] << 16) / local239;
					if (local255 < arg1) {
						this.anIntArray441[local244] += (arg1 - local255) * (arg2.ca(this.anIntArray444[local244] - -arg4, this.anIntArray445[local244] + arg6) - arg5) / arg1;
					}
				}
			} else {
				@Pc(338) int local338;
				if (arg0 == 3) {
					local191 = (arg1 & 0xFF) * 4;
					local244 = (arg1 >> 8 & 0xFF) * 4;
					local255 = (arg1 >> 16 & 0xFF) << 6;
					local338 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local191 >> 1) < 0 || arg2.anInt6757 << arg2.anInt6759 <= arg4 + (local191 >> 1) + arg2.anInt6760 || arg6 - (local244 >> 1) < 0 || arg6 + (local244 >> 1) + arg2.anInt6760 >= arg2.anInt6758 << arg2.anInt6759) {
						return;
					}
					this.method5993(local191, local244, local338, arg6, local255, arg2, arg4, arg5);
				} else if (arg0 == 4) {
					local191 = this.aShort89 - this.lb;
					for (local244 = 0; local244 < this.anInt5929; local244++) {
						this.anIntArray441[local244] = local191 + this.anIntArray441[local244] + arg3.ca(arg4 + this.anIntArray444[local244], arg6 + this.anIntArray445[local244]) - arg5;
					}
				} else if (arg0 == 5) {
					local191 = this.aShort89 - this.lb;
					for (local244 = 0; local244 < this.anInt5929; local244++) {
						local255 = arg4 + this.anIntArray444[local244];
						local338 = arg6 + this.anIntArray445[local244];
						@Pc(444) int local444 = arg2.ca(local255, local338);
						@Pc(449) int local449 = arg3.ca(local255, local338);
						@Pc(454) int local454 = local444 - local449;
						this.anIntArray441[local244] = local444 + ((this.anIntArray441[local244] << 8) / local191 * local454 >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean526 = false;
		if (this.aClass80_9 != null) {
			this.aClass80_9.anInterface9_2 = null;
		}
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "()[Lclient!ck;")
	@Override
	public Class40[] method5995() {
		return this.aClass40Array3;
	}

	@OriginalMember(owner = "client!rr", name = "K", descriptor = "(I)V")
	@Override
	public void K(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub29.anIntArray537[arg0];
		@Pc(13) int local13 = Class1_Sub29.anIntArray536[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5929; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray441[local15] + this.anIntArray444[local15] * local13 >> 15;
			this.anIntArray441[local15] = local13 * this.anIntArray441[local15] - local9 * this.anIntArray444[local15] >> 15;
			this.anIntArray444[local15] = local34;
		}
		if (this.aClass80_9 != null) {
			this.aClass80_9.anInterface9_2 = null;
		}
		this.aBoolean526 = false;
	}

	@OriginalMember(owner = "client!rr", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.aShort85 = (short) arg0;
		if (this.aClass80_11 != null) {
			this.aClass80_11.anInterface9_2 = null;
		}
		if (this.aClass80_10 != null) {
			this.aClass80_10.anInterface9_2 = null;
		}
	}

	@OriginalMember(owner = "client!rr", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5929; local7++) {
			this.anIntArray445[local7] = -this.anIntArray445[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5902; local25++) {
			this.aShortArray103[local25] = (short) -this.aShortArray103[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt5895; local48++) {
			@Pc(55) short local55 = this.aShortArray102[local48];
			this.aShortArray102[local48] = this.aShortArray101[local48];
			this.aShortArray101[local48] = local55;
		}
		if (this.aClass80_10 == null && this.aClass80_11 != null) {
			this.aClass80_11.anInterface9_2 = null;
		}
		if (this.aClass80_10 != null) {
			this.aClass80_10.anInterface9_2 = null;
		}
		if (this.aClass80_9 != null) {
			this.aClass80_9.anInterface9_2 = null;
		}
		if (this.aClass149_1 != null) {
			this.aClass149_1.anInterface3_4 = null;
		}
		this.aBoolean526 = false;
	}

	@OriginalMember(owner = "client!rr", name = "Z", descriptor = "()I")
	@Override
	public int Z() {
		if (!this.aBoolean526) {
			this.method4768();
		}
		return this.aShort87;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!c;Lclient!wp;II)V")
	@Override
	public void method5999(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class111_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5902 == 0) {
			return;
		}
		@Pc(13) Class34_Sub2 local13 = this.aClass117_Sub1_36.aClass34_Sub2_3;
		if (!this.aBoolean526) {
			this.method4768();
		}
		@Pc(22) Class34_Sub2 local22 = (Class34_Sub2) arg0;
		Static364.aFloat78 = local13.aFloat26 + local13.aFloat19 * local22.aFloat26 + local22.aFloat20 * local13.aFloat16 + local13.aFloat22 * local22.aFloat15;
		Static354.aFloat77 = local13.aFloat22 * local22.aFloat18 + local13.aFloat16 * local22.aFloat21 + local13.aFloat19 * local22.aFloat16;
		@Pc(69) float local69 = Static354.aFloat77 * (float) this.lb + Static364.aFloat78;
		@Pc(77) float local77 = Static364.aFloat78 + (float) this.aShort89 * Static354.aFloat77;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local77 < local69) {
			local88 = (float) -this.aShort90 + local77;
			local94 = (float) this.aShort90 + local69;
		} else {
			local88 = (float) -this.aShort90 + local69;
			local94 = local77 + (float) this.aShort90;
		}
		if (this.aClass117_Sub1_36.aFloat36 <= local88 || (float) this.aClass117_Sub1_36.anInt3131 >= local94) {
			return;
		}
		Static351.aFloat74 = local22.aFloat16 * local13.aFloat24 + local22.aFloat18 * local13.aFloat17 + local22.aFloat21 * local13.aFloat18;
		Static119.aFloat11 = local13.aFloat15 + local22.aFloat26 * local13.aFloat24 + local13.aFloat18 * local22.aFloat20 + local22.aFloat15 * local13.aFloat17;
		@Pc(171) float local171 = Static351.aFloat74 * (float) this.lb + Static119.aFloat11;
		@Pc(179) float local179 = (float) this.aShort89 * Static351.aFloat74 + Static119.aFloat11;
		@Pc(195) float local195;
		@Pc(206) float local206;
		if (local171 > local179) {
			local195 = (float) this.aClass117_Sub1_36.anInt3123 * ((float) -this.aShort90 + local179);
			local206 = (float) this.aClass117_Sub1_36.anInt3123 * ((float) this.aShort90 + local171);
		} else {
			local206 = (float) this.aClass117_Sub1_36.anInt3123 * ((float) this.aShort90 + local179);
			local195 = ((float) -this.aShort90 + local171) * (float) this.aClass117_Sub1_36.anInt3123;
		}
		if (this.aClass117_Sub1_36.aFloat37 <= local195 / (float) arg2 || local206 / (float) arg2 <= this.aClass117_Sub1_36.aFloat33) {
			return;
		}
		Static48.aFloat6 = local22.aFloat26 * local13.aFloat25 + local13.aFloat23 * local22.aFloat15 + local13.aFloat21 * local22.aFloat20 + local13.aFloat20;
		Static253.aFloat60 = local13.aFloat21 * local22.aFloat21 + local22.aFloat18 * local13.aFloat23 + local13.aFloat25 * local22.aFloat16;
		@Pc(298) float local298 = (float) this.lb * Static253.aFloat60 + Static48.aFloat6;
		@Pc(306) float local306 = Static48.aFloat6 + (float) this.aShort89 * Static253.aFloat60;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local298 > local306) {
			local321 = (local306 - (float) this.aShort90) * (float) this.aClass117_Sub1_36.anInt3118;
			local332 = (local298 + (float) this.aShort90) * (float) this.aClass117_Sub1_36.anInt3118;
		} else {
			local321 = (local298 - (float) this.aShort90) * (float) this.aClass117_Sub1_36.anInt3118;
			local332 = (float) this.aClass117_Sub1_36.anInt3118 * (local306 + (float) this.aShort90);
		}
		if (local321 / (float) arg2 >= this.aClass117_Sub1_36.aFloat34 || local332 / (float) arg2 <= this.aClass117_Sub1_36.aFloat42) {
			return;
		}
		if (arg1 != null || this.aClass193Array1 != null) {
			Static81.aFloat7 = local13.aFloat16 * local22.aFloat25 + local22.aFloat24 * local13.aFloat22 + local13.aFloat19 * local22.aFloat19;
			Static153.aFloat27 = local22.aFloat17 * local13.aFloat22 + local22.aFloat23 * local13.aFloat16 + local22.aFloat22 * local13.aFloat19;
			Static41.aFloat5 = local13.aFloat24 * local22.aFloat19 + local13.aFloat17 * local22.aFloat24 + local13.aFloat18 * local22.aFloat25;
			Static364.aFloat79 = local22.aFloat22 * local13.aFloat24 + local22.aFloat23 * local13.aFloat18 + local13.aFloat17 * local22.aFloat17;
			Static352.aFloat75 = local13.aFloat25 * local22.aFloat22 + local13.aFloat23 * local22.aFloat17 + local13.aFloat21 * local22.aFloat23;
			Static342.aFloat73 = local13.aFloat25 * local22.aFloat19 + local22.aFloat24 * local13.aFloat23 + local22.aFloat25 * local13.aFloat21;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.aShort91 + this.aShort88 >> 1;
			@Pc(508) int local508 = this.aShort86 + this.aShort87 >> 1;
			@Pc(527) int local527 = (int) (Static351.aFloat74 * (float) this.lb + Static119.aFloat11 + Static364.aFloat79 * (float) local500 + Static41.aFloat5 * (float) local508);
			@Pc(546) int local546 = (int) (Static342.aFloat73 * (float) local508 + Static48.aFloat6 + Static352.aFloat75 * (float) local500 + (float) this.lb * Static253.aFloat60);
			@Pc(565) int local565 = (int) ((float) local508 * Static81.aFloat7 + (float) this.lb * Static354.aFloat77 + Static364.aFloat78 + (float) local500 * Static153.aFloat27);
			@Pc(584) int local584 = (int) (Static351.aFloat74 * (float) this.aShort89 + Static364.aFloat79 * (float) local500 + Static119.aFloat11 + (float) local508 * Static41.aFloat5);
			@Pc(603) int local603 = (int) (Static342.aFloat73 * (float) local508 + Static352.aFloat75 * (float) local500 + Static48.aFloat6 + (float) this.aShort89 * Static253.aFloat60);
			@Pc(622) int local622 = (int) ((float) local508 * Static81.aFloat7 + (float) this.aShort89 * Static354.aFloat77 + (float) local500 * Static153.aFloat27 + Static364.aFloat78);
			arg1.anInt7285 = this.aClass117_Sub1_36.anInt3116 + this.aClass117_Sub1_36.anInt3123 * local527 / arg2;
			arg1.anInt7283 = this.aClass117_Sub1_36.anInt3116 + this.aClass117_Sub1_36.anInt3123 * local584 / arg2;
			arg1.anInt7282 = this.aClass117_Sub1_36.anInt3111 + this.aClass117_Sub1_36.anInt3118 * local546 / arg2;
			arg1.anInt7284 = this.aClass117_Sub1_36.anInt3111 + this.aClass117_Sub1_36.anInt3118 * local603 / arg2;
			if (local565 < this.aClass117_Sub1_36.anInt3131 && this.aClass117_Sub1_36.anInt3131 > local622) {
				arg1.aBoolean631 = true;
				arg1.anInt7286 = this.aClass117_Sub1_36.anInt3116 + this.aClass117_Sub1_36.anInt3123 * (this.aShort90 + local527) / arg2 - arg1.anInt7285;
			}
		}
		this.aClass117_Sub1_36.method2465((float) arg2);
		this.aClass117_Sub1_36.method2491();
		this.aClass117_Sub1_36.method2489(local22);
		this.method4762();
		this.aClass117_Sub1_36.method2474();
		this.method4771();
	}

	@OriginalMember(owner = "client!rr", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub29.anIntArray537[arg0];
		@Pc(13) int local13 = Class1_Sub29.anIntArray536[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5929; local15++) {
			@Pc(34) int local34 = this.anIntArray441[local15] * local13 - this.anIntArray445[local15] * local9 >> 15;
			this.anIntArray445[local15] = local9 * this.anIntArray441[local15] + local13 * this.anIntArray445[local15] >> 15;
			this.anIntArray441[local15] = local34;
		}
		if (this.aClass80_9 != null) {
			this.aClass80_9.anInterface9_2 = null;
		}
		this.aBoolean526 = false;
	}

	@OriginalMember(owner = "client!rr", name = "va", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			Static203.anInt3768 = 0;
			local29 = 0;
			Static445.anInt7012 = 0;
			Static343.anInt5563 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray45.length) {
					local51 = this.anIntArrayArray45[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static203.anInt3768 += this.anIntArray444[local59];
						Static343.anInt5563 += this.anIntArray441[local59];
						local29++;
						Static445.anInt7012 += this.anIntArray445[local59];
					}
				}
			}
			if (local29 <= 0) {
				Static343.anInt5563 = local17;
				Static445.anInt7012 = local21;
				Static203.anInt3768 = local25;
			} else {
				Static203.anInt3768 = Static203.anInt3768 / local29 + local25;
				Static343.anInt5563 = Static343.anInt5563 / local29 + local17;
				Static445.anInt7012 = local21 + Static445.anInt7012 / local29;
			}
			return;
		}
		@Pc(161) int[] local161;
		@Pc(163) int local163;
		if (arg0 == 1) {
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			local17 = arg3 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray45.length > local35) {
					local161 = this.anIntArrayArray45[local35];
					for (local163 = 0; local163 < local161.length; local163++) {
						local53 = local161[local163];
						this.anIntArray444[local53] += local25;
						this.anIntArray441[local53] += local17;
						this.anIntArray445[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(281) int local281;
		@Pc(299) int local299;
		@Pc(746) int local746;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray45.length > local35) {
					local161 = this.anIntArrayArray45[local35];
					if ((arg5 & 0x1) == 0) {
						for (local163 = 0; local163 < local161.length; local163++) {
							local53 = local161[local163];
							this.anIntArray444[local53] -= Static203.anInt3768;
							this.anIntArray441[local53] -= Static343.anInt5563;
							this.anIntArray445[local53] -= Static445.anInt7012;
							if (arg4 != 0) {
								local59 = Class1_Sub29.anIntArray537[arg4];
								local281 = Class1_Sub29.anIntArray536[arg4];
								local299 = local281 * this.anIntArray444[local53] + local59 * this.anIntArray441[local53] + 32767 >> 15;
								this.anIntArray441[local53] = local281 * this.anIntArray441[local53] + 32767 - this.anIntArray444[local53] * local59 >> 15;
								this.anIntArray444[local53] = local299;
							}
							if (arg2 != 0) {
								local59 = Class1_Sub29.anIntArray537[arg2];
								local281 = Class1_Sub29.anIntArray536[arg2];
								local299 = local281 * this.anIntArray441[local53] + 32767 - local59 * this.anIntArray445[local53] >> 15;
								this.anIntArray445[local53] = this.anIntArray441[local53] * local59 + local281 * this.anIntArray445[local53] + 32767 >> 15;
								this.anIntArray441[local53] = local299;
							}
							if (arg3 != 0) {
								local59 = Class1_Sub29.anIntArray537[arg3];
								local281 = Class1_Sub29.anIntArray536[arg3];
								local299 = this.anIntArray445[local53] * local59 + local281 * this.anIntArray444[local53] + 32767 >> 15;
								this.anIntArray445[local53] = local281 * this.anIntArray445[local53] + 32767 - local59 * this.anIntArray444[local53] >> 15;
								this.anIntArray444[local53] = local299;
							}
							this.anIntArray444[local53] += Static203.anInt3768;
							this.anIntArray441[local53] += Static343.anInt5563;
							this.anIntArray445[local53] += Static445.anInt7012;
						}
					} else {
						for (local163 = 0; local163 < local161.length; local163++) {
							local53 = local161[local163];
							this.anIntArray444[local53] -= Static203.anInt3768;
							this.anIntArray441[local53] -= Static343.anInt5563;
							this.anIntArray445[local53] -= Static445.anInt7012;
							if (arg2 != 0) {
								local59 = Class1_Sub29.anIntArray537[arg2];
								local281 = Class1_Sub29.anIntArray536[arg2];
								local299 = this.anIntArray441[local53] * local281 + 32767 - this.anIntArray445[local53] * local59 >> 15;
								this.anIntArray445[local53] = this.anIntArray441[local53] * local59 + local281 * this.anIntArray445[local53] + 32767 >> 15;
								this.anIntArray441[local53] = local299;
							}
							if (arg4 != 0) {
								local59 = Class1_Sub29.anIntArray537[arg4];
								local281 = Class1_Sub29.anIntArray536[arg4];
								local299 = this.anIntArray444[local53] * local281 + local59 * this.anIntArray441[local53] + 32767 >> 15;
								this.anIntArray441[local53] = local281 * this.anIntArray441[local53] + 32767 - this.anIntArray444[local53] * local59 >> 15;
								this.anIntArray444[local53] = local299;
							}
							if (arg3 != 0) {
								local59 = Class1_Sub29.anIntArray537[arg3];
								local281 = Class1_Sub29.anIntArray536[arg3];
								local299 = this.anIntArray444[local53] * local281 + this.anIntArray445[local53] * local59 + 32767 >> 15;
								this.anIntArray445[local53] = this.anIntArray445[local53] * local281 + 32767 - local59 * this.anIntArray444[local53] >> 15;
								this.anIntArray444[local53] = local299;
							}
							this.anIntArray444[local53] += Static203.anInt3768;
							this.anIntArray441[local53] += Static343.anInt5563;
							this.anIntArray445[local53] += Static445.anInt7012;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray45.length) {
						local51 = this.anIntArrayArray45[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local281 = this.anIntArray442[local59];
							local299 = this.anIntArray442[local59 + 1];
							for (local746 = local281; local746 < local299; local746++) {
								@Pc(755) int local755 = this.aShortArray97[local746] - 1;
								if (local755 == -1) {
									break;
								}
								@Pc(765) int local765;
								@Pc(769) int local769;
								@Pc(788) int local788;
								if (arg4 != 0) {
									local765 = Class1_Sub29.anIntArray537[arg4];
									local769 = Class1_Sub29.anIntArray536[arg4];
									local788 = this.aShortArray96[local755] * local765 + this.aShortArray98[local755] * local769 + 32767 >> 15;
									this.aShortArray96[local755] = (short) (this.aShortArray96[local755] * local769 + 32767 - local765 * this.aShortArray98[local755] >> 15);
									this.aShortArray98[local755] = (short) local788;
								}
								if (arg2 != 0) {
									local765 = Class1_Sub29.anIntArray537[arg2];
									local769 = Class1_Sub29.anIntArray536[arg2];
									local788 = local769 * this.aShortArray96[local755] + 32767 - local765 * this.aShortArray103[local755] >> 15;
									this.aShortArray103[local755] = (short) (local769 * this.aShortArray103[local755] + this.aShortArray96[local755] * local765 + 32767 >> 15);
									this.aShortArray96[local755] = (short) local788;
								}
								if (arg3 != 0) {
									local765 = Class1_Sub29.anIntArray537[arg3];
									local769 = Class1_Sub29.anIntArray536[arg3];
									local788 = this.aShortArray98[local755] * local769 + this.aShortArray103[local755] * local765 + 32767 >> 15;
									this.aShortArray103[local755] = (short) (local769 * this.aShortArray103[local755] + 32767 - this.aShortArray98[local755] * local765 >> 15);
									this.aShortArray98[local755] = (short) local788;
								}
							}
						}
					}
				}
				if (this.aClass80_10 == null && this.aClass80_11 != null) {
					this.aClass80_11.anInterface9_2 = null;
				}
				if (this.aClass80_10 != null) {
					this.aClass80_10.anInterface9_2 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray45.length) {
					local161 = this.anIntArrayArray45[local35];
					for (local163 = 0; local163 < local161.length; local163++) {
						local53 = local161[local163];
						this.anIntArray444[local53] -= Static203.anInt3768;
						this.anIntArray441[local53] -= Static343.anInt5563;
						this.anIntArray445[local53] -= Static445.anInt7012;
						this.anIntArray444[local53] = arg2 * this.anIntArray444[local53] >> 7;
						this.anIntArray441[local53] = this.anIntArray441[local53] * arg3 >> 7;
						this.anIntArray445[local53] = arg4 * this.anIntArray445[local53] >> 7;
						this.anIntArray444[local53] += Static203.anInt3768;
						this.anIntArray441[local53] += Static343.anInt5563;
						this.anIntArray445[local53] += Static445.anInt7012;
					}
				}
			}
		} else {
			@Pc(1200) Class193 local1200;
			@Pc(1205) Class114 local1205;
			if (arg0 == 5) {
				if (this.anIntArrayArray44 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray44.length > local35) {
							local161 = this.anIntArrayArray44[local35];
							for (local163 = 0; local163 < local161.length; local163++) {
								local53 = local161[local163];
								local59 = (this.aByteArray84[local53] & 0xFF) + (arg2 * 8);
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray84[local53] = (byte) local59;
							}
							if (local161.length > 0 && this.aClass80_11 != null) {
								this.aClass80_11.anInterface9_2 = null;
							}
						}
					}
					if (this.aClass193Array1 != null) {
						for (local35 = 0; local35 < this.anInt5912; local35++) {
							local1200 = this.aClass193Array1[local35];
							local1205 = this.aClass114Array1[local35];
							local1205.anInt2856 = local1205.anInt2856 & 0xFFFFFF | 255 - (this.aByteArray84[local1200.anInt5141] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1452) Class114 local1452;
				if (arg0 == 8) {
					if (this.anIntArrayArray46 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray46.length) {
								local161 = this.anIntArrayArray46[local35];
								for (local163 = 0; local163 < local161.length; local163++) {
									local1452 = this.aClass114Array1[local161[local163]];
									local1452.anInt2850 += arg2;
									local1452.anInt2857 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray46 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray46.length > local35) {
								local161 = this.anIntArrayArray46[local35];
								for (local163 = 0; local163 < local161.length; local163++) {
									local1452 = this.aClass114Array1[local161[local163]];
									local1452.anInt2852 = arg2 * local1452.anInt2852 >> 7;
									local1452.anInt2859 = local1452.anInt2859 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray46 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray46.length) {
							local161 = this.anIntArrayArray46[local35];
							for (local163 = 0; local163 < local161.length; local163++) {
								local1452 = this.aClass114Array1[local161[local163]];
								local1452.anInt2854 = arg2 + local1452.anInt2854 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray44 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray44.length > local35) {
						local161 = this.anIntArrayArray44[local35];
						for (local163 = 0; local163 < local161.length; local163++) {
							local53 = local161[local163];
							local59 = this.aShortArray95[local53] & 0xFFFF;
							local281 = local59 >> 10 & 0x3F;
							local299 = local59 >> 7 & 0x7;
							@Pc(1293) int local1293 = local281 + arg2 & 0x3F;
							local299 += arg3 / 4;
							local746 = local59 & 0x7F;
							if (local299 < 0) {
								local299 = 0;
							} else if (local299 > 7) {
								local299 = 7;
							}
							local746 += arg4;
							if (local746 < 0) {
								local746 = 0;
							} else if (local746 > 127) {
								local746 = 127;
							}
							this.aShortArray95[local53] = (short) (local746 | local299 << 7 | local1293 << 10);
						}
						if (local161.length > 0 && this.aClass80_11 != null) {
							this.aClass80_11.anInterface9_2 = null;
						}
					}
				}
				if (this.aClass193Array1 != null) {
					for (local35 = 0; local35 < this.anInt5912; local35++) {
						local1200 = this.aClass193Array1[local35];
						local1205 = this.aClass114Array1[local35];
						local1205.anInt2856 = local1205.anInt2856 & 0xFF000000 | Static134.anIntArray182[this.aShortArray95[local1200.anInt5141] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!hf;)V")
	private void method4770(@OriginalArg(1) Class34_Sub2 arg0) {
		if (this.aClass40Array3 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass40Array3.length; local6++) {
				@Pc(13) Class40 local13 = this.aClass40Array3[local6];
				@Pc(15) Class40 local15 = local13;
				if (local13.aClass40_1 != null) {
					local15 = local13.aClass40_1;
				}
				local15.anInt760 = (int) (arg0.aFloat18 * (float) this.anIntArray441[local13.anInt765] + (float) this.anIntArray444[local13.anInt765] * arg0.aFloat17 + (float) this.anIntArray445[local13.anInt765] * arg0.aFloat24 + arg0.aFloat15);
				local15.anInt768 = (int) (arg0.aFloat20 + arg0.aFloat23 * (float) this.anIntArray444[local13.anInt765] + (float) this.anIntArray441[local13.anInt765] * arg0.aFloat21 + arg0.aFloat25 * (float) this.anIntArray445[local13.anInt765]);
				local15.anInt759 = (int) (arg0.aFloat26 + arg0.aFloat22 * (float) this.anIntArray444[local13.anInt765] + (float) this.anIntArray441[local13.anInt765] * arg0.aFloat16 + arg0.aFloat19 * (float) this.anIntArray445[local13.anInt765]);
				local15.anInt766 = (int) (arg0.aFloat24 * (float) this.anIntArray445[local13.anInt764] + arg0.aFloat17 * (float) this.anIntArray444[local13.anInt764] + arg0.aFloat18 * (float) this.anIntArray441[local13.anInt764] + arg0.aFloat15);
				local15.anInt761 = (int) (arg0.aFloat20 + arg0.aFloat25 * (float) this.anIntArray445[local13.anInt764] + (float) this.anIntArray441[local13.anInt764] * arg0.aFloat21 + (float) this.anIntArray444[local13.anInt764] * arg0.aFloat23);
				local15.anInt769 = (int) (arg0.aFloat19 * (float) this.anIntArray445[local13.anInt764] + arg0.aFloat16 * (float) this.anIntArray441[local13.anInt764] + arg0.aFloat22 * (float) this.anIntArray444[local13.anInt764] + arg0.aFloat26);
				local15.anInt762 = (int) (arg0.aFloat15 + arg0.aFloat18 * (float) this.anIntArray441[local13.anInt756] + arg0.aFloat17 * (float) this.anIntArray444[local13.anInt756] + (float) this.anIntArray445[local13.anInt756] * arg0.aFloat24);
				local15.anInt763 = (int) (arg0.aFloat20 + arg0.aFloat23 * (float) this.anIntArray444[local13.anInt756] + (float) this.anIntArray441[local13.anInt756] * arg0.aFloat21 + (float) this.anIntArray445[local13.anInt756] * arg0.aFloat25);
				local15.anInt767 = (int) (arg0.aFloat26 + (float) this.anIntArray444[local13.anInt756] * arg0.aFloat22 + arg0.aFloat16 * (float) this.anIntArray441[local13.anInt756] + (float) this.anIntArray445[local13.anInt756] * arg0.aFloat19);
			}
		}
		if (this.aClass230Array3 == null) {
			return;
		}
		for (@Pc(359) int local359 = 0; local359 < this.aClass230Array3.length; local359++) {
			@Pc(366) Class230 local366 = this.aClass230Array3[local359];
			@Pc(368) Class230 local368 = local366;
			if (local366.aClass230_2 != null) {
				local368 = local366.aClass230_2;
			}
			if (local366.aClass34_6 == null) {
				local366.aClass34_6 = arg0.method4361();
			} else {
				local366.aClass34_6.ha(arg0);
			}
			local368.anInt6005 = (int) (arg0.aFloat15 + (float) this.anIntArray441[local366.anInt6004] * arg0.aFloat18 + arg0.aFloat17 * (float) this.anIntArray444[local366.anInt6004] + arg0.aFloat24 * (float) this.anIntArray445[local366.anInt6004]);
			local368.anInt5996 = (int) (arg0.aFloat20 + arg0.aFloat25 * (float) this.anIntArray445[local366.anInt6004] + arg0.aFloat23 * (float) this.anIntArray444[local366.anInt6004] + (float) this.anIntArray441[local366.anInt6004] * arg0.aFloat21);
			local368.anInt5994 = (int) ((float) this.anIntArray445[local366.anInt6004] * arg0.aFloat19 + (float) this.anIntArray444[local366.anInt6004] * arg0.aFloat22 + arg0.aFloat16 * (float) this.anIntArray441[local366.anInt6004] + arg0.aFloat26);
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
	private void method4771() {
		if (this.aClass193Array1 == null) {
			return;
		}
		@Pc(18) Class34_Sub2 local18 = this.aClass117_Sub1_36.aClass34_Sub2_2;
		@Pc(22) float local22 = this.aClass117_Sub1_36.aa();
		@Pc(26) float local26 = this.aClass117_Sub1_36.T();
		this.aClass117_Sub1_36.method2455();
		this.aClass117_Sub1_36.method5677(false);
		this.aClass117_Sub1_36.method2498(false);
		this.aClass117_Sub1_36.method2475(this.aClass117_Sub1_36.aClass80_4, null, null, this.aClass117_Sub1_36.aClass80_5);
		for (@Pc(53) int local53 = 0; local53 < this.anInt5912; local53++) {
			@Pc(60) Class193 local60 = this.aClass193Array1[local53];
			@Pc(65) Class114 local65 = this.aClass114Array1[local53];
			if (!local60.aBoolean464 || !this.aClass117_Sub1_36.method5713()) {
				@Pc(93) float local93 = (float) (this.anIntArray444[local60.anInt5143] + this.anIntArray444[local60.anInt5145] + this.anIntArray444[local60.anInt5139]) * 0.3333333F;
				@Pc(114) float local114 = (float) (this.anIntArray441[local60.anInt5143] + this.anIntArray441[local60.anInt5145] + this.anIntArray441[local60.anInt5139]) * 0.3333333F;
				@Pc(136) float local136 = (float) (this.anIntArray445[local60.anInt5145] + this.anIntArray445[local60.anInt5143] + this.anIntArray445[local60.anInt5139]) * 0.3333333F;
				@Pc(150) float local150 = local136 * Static41.aFloat5 + local93 * Static364.aFloat79 + Static351.aFloat74 * local114 + Static119.aFloat11;
				@Pc(164) float local164 = Static48.aFloat6 + local93 * Static352.aFloat75 + local114 * Static253.aFloat60 + local136 * Static342.aFloat73;
				@Pc(178) float local178 = Static364.aFloat78 + Static81.aFloat7 * local136 + Static354.aFloat77 * local114 + Static153.aFloat27 * local93;
				local18.method1912(local65.anInt2859 * local60.aShort76 >> 7, (float) local65.anInt2857 - local164, -local178, local65.anInt2854, local60.aShort75 * local65.anInt2852 >> 7, (float) local65.anInt2850 + local150);
				this.aClass117_Sub1_36.method2509(local18);
				this.aClass117_Sub1_36.da(local26, local22 - (float) local60.anInt5140 * 1.5F);
				@Pc(229) int local229 = local65.anInt2856;
				OpenGL.glColor4ub((byte) (local229 >> 16), (byte) (local229 >> 8), (byte) local229, (byte) (local229 >> 24));
				this.aClass117_Sub1_36.method2531(local60.aShort77);
				this.aClass117_Sub1_36.method2503(local60.aByte76);
				this.aClass117_Sub1_36.method2535(local60.aByte77);
				this.aClass117_Sub1_36.method2452(4);
			}
		}
		this.aClass117_Sub1_36.da(local26, local22);
		this.aClass117_Sub1_36.method5677(true);
		this.aClass117_Sub1_36.method2474();
	}

	@OriginalMember(owner = "client!rr", name = "KA", descriptor = "()V")
	@Override
	protected void KA() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5910; local3++) {
			this.anIntArray444[local3] = this.anIntArray444[local3] + 7 >> 4;
			this.anIntArray441[local3] = this.anIntArray441[local3] + 7 >> 4;
			this.anIntArray445[local3] = this.anIntArray445[local3] + 7 >> 4;
		}
		if (this.aClass80_9 != null) {
			this.aClass80_9.anInterface9_2 = null;
		}
		this.aBoolean526 = false;
	}

	@OriginalMember(owner = "client!rr", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		return this.anInt5885;
	}

	@OriginalMember(owner = "client!rr", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.anInt5885 = arg0;
		this.aBoolean525 = true;
		if (this.aClass176_1 != null && (this.anInt5885 & 0x10000) == 0) {
			this.aShortArray96 = this.aClass176_1.aShortArray78;
			this.aShortArray98 = this.aClass176_1.aShortArray77;
			this.aByteArray85 = this.aClass176_1.aByteArray70;
			this.aShortArray103 = this.aClass176_1.aShortArray76;
			this.aClass176_1 = null;
		}
		this.method4759();
	}

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "()Z")
	@Override
	protected boolean h() {
		if (this.anIntArrayArray45 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5910; local12++) {
			this.anIntArray444[local12] <<= 0x4;
			this.anIntArray441[local12] <<= 0x4;
			this.anIntArray445[local12] <<= 0x4;
		}
		Static445.anInt7012 = 0;
		Static203.anInt3768 = 0;
		Static343.anInt5563 = 0;
		return true;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)V")
	private void method4773(@OriginalArg(1) boolean arg0) {
		if (this.anInt5903 * 6 > this.aClass117_Sub1_36.aClass1_Sub19_Sub1_2.aByteArray38.length) {
			this.aClass117_Sub1_36.aClass1_Sub19_Sub1_2 = new Class1_Sub19_Sub1((this.anInt5903 + 100) * 6);
		} else {
			this.aClass117_Sub1_36.aClass1_Sub19_Sub1_2.anInt3698 = 0;
		}
		@Pc(38) Class1_Sub19_Sub1 local38 = this.aClass117_Sub1_36.aClass1_Sub19_Sub1_2;
		@Pc(44) int local44;
		if (this.aClass117_Sub1_36.aBoolean291) {
			for (local44 = 0; local44 < this.anInt5903; local44++) {
				local38.method2930(this.aShortArray102[local44]);
				local38.method2930(this.aShortArray93[local44]);
				local38.method2930(this.aShortArray101[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt5903; local44++) {
				local38.method2936(this.aShortArray102[local44]);
				local38.method2936(this.aShortArray93[local44]);
				local38.method2936(this.aShortArray101[local44]);
			}
		}
		if (local38.anInt3698 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface3_5 == null) {
				this.anInterface3_5 = this.aClass117_Sub1_36.method2511(local38.aByteArray38, true, local38.anInt3698);
			} else {
				this.anInterface3_5.method5205(local38.anInt3698, local38.aByteArray38);
			}
			this.aClass149_1.anInterface3_4 = this.anInterface3_5;
		} else {
			this.aClass149_1.anInterface3_4 = this.aClass117_Sub1_36.method2511(local38.aByteArray38, false, local38.anInt3698);
		}
		if (!arg0) {
			this.aBoolean525 = true;
		}
	}

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "(III)V")
	@Override
	public void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5929; local3++) {
			if (arg0 != 128) {
				this.anIntArray444[local3] = arg0 * this.anIntArray444[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray441[local3] = arg1 * this.anIntArray441[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray445[local3] = this.anIntArray445[local3] * arg2 >> 7;
			}
		}
		if (this.aClass80_9 != null) {
			this.aClass80_9.anInterface9_2 = null;
		}
		this.aBoolean526 = false;
	}

	@OriginalMember(owner = "client!rr", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub29.anIntArray537[arg0];
		@Pc(13) int local13 = Class1_Sub29.anIntArray536[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5929; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray445[local15] + this.anIntArray444[local15] * local13 >> 15;
			this.anIntArray445[local15] = this.anIntArray445[local15] * local13 - this.anIntArray444[local15] * local9 >> 15;
			this.anIntArray444[local15] = local33;
		}
		if (this.aClass80_9 != null) {
			this.aClass80_9.anInterface9_2 = null;
		}
		this.aBoolean526 = false;
	}

	@OriginalMember(owner = "client!rr", name = "S", descriptor = "()I")
	@Override
	public int S() {
		if (!this.aBoolean526) {
			this.method4768();
		}
		return this.aShort86;
	}

	@OriginalMember(owner = "client!rr", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	@Override
	public Class1_Sub3_Sub11 EA(@OriginalArg(0) Class1_Sub3_Sub11 arg0) {
		if (this.anInt5902 == 0) {
			return null;
		}
		if (!this.aBoolean526) {
			this.method4768();
		}
		@Pc(39) int local39;
		@Pc(56) int local56;
		if (this.aClass117_Sub1_36.anInt3117 > 0) {
			local39 = this.aShort91 - (this.aClass117_Sub1_36.anInt3117 * this.aShort89 >> 8) >> this.aClass117_Sub1_36.anInt3091;
			local56 = this.aShort88 - (this.lb * this.aClass117_Sub1_36.anInt3117 >> 8) >> this.aClass117_Sub1_36.anInt3091;
		} else {
			local39 = this.aShort91 - (this.lb * this.aClass117_Sub1_36.anInt3117 >> 8) >> this.aClass117_Sub1_36.anInt3091;
			local56 = this.aShort88 - (this.aClass117_Sub1_36.anInt3117 * this.aShort89 >> 8) >> this.aClass117_Sub1_36.anInt3091;
		}
		@Pc(113) int local113;
		@Pc(129) int local129;
		if (this.aClass117_Sub1_36.anInt3105 > 0) {
			local113 = this.aShort87 - (this.aShort89 * this.aClass117_Sub1_36.anInt3105 >> 8) >> this.aClass117_Sub1_36.anInt3091;
			local129 = this.aShort86 - (this.lb * this.aClass117_Sub1_36.anInt3105 >> 8) >> this.aClass117_Sub1_36.anInt3091;
		} else {
			local113 = this.aShort87 - (this.aClass117_Sub1_36.anInt3105 * this.lb >> 8) >> this.aClass117_Sub1_36.anInt3091;
			local129 = this.aShort86 - (this.aClass117_Sub1_36.anInt3105 * this.aShort89 >> 8) >> this.aClass117_Sub1_36.anInt3091;
		}
		@Pc(171) int local171 = local56 + 1 - local39;
		@Pc(178) int local178 = local129 + 1 - local113;
		@Pc(181) Class1_Sub3_Sub11_Sub1 local181 = (Class1_Sub3_Sub11_Sub1) arg0;
		@Pc(197) Class1_Sub3_Sub11_Sub1 local197;
		if (local181 != null && local181.method3201(local178, local171)) {
			local197 = local181;
			local181.method3202();
		} else {
			local197 = new Class1_Sub3_Sub11_Sub1(this.aClass117_Sub1_36, local171, local178);
		}
		local197.method3206(local129, local39, local113, local56);
		this.method4758(local197);
		return local197;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IFIJIIFLclient!ld;II)S")
	private short method4776(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) Class147 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray442[arg8];
		@Pc(17) int local17 = this.anIntArray442[arg8 + 1];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = local10; local27 < local17; local27++) {
			@Pc(34) short local34 = this.aShortArray97[local27];
			if (local34 == 0) {
				local25 = local27;
				break;
			}
			if (Static266.aLongArray7[local27] == arg2) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray97[local25] = (short) (this.anInt5902 + 1);
		Static266.aLongArray7[local25] = arg2;
		this.aShortArray98[this.anInt5902] = (short) arg3;
		this.aShortArray96[this.anInt5902] = (short) arg0;
		this.aShortArray103[this.anInt5902] = (short) arg4;
		this.aByteArray85[this.anInt5902] = (byte) arg7;
		this.aFloatArray34[this.anInt5902] = arg1;
		this.aFloatArray35[this.anInt5902] = arg5;
		return (short) this.anInt5902++;
	}

	@OriginalMember(owner = "client!rr", name = "aa", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			Static203.anInt3768 = 0;
			Static445.anInt7012 = 0;
			local28 = 0;
			Static343.anInt5563 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray45.length) {
					local52 = this.anIntArrayArray45[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray99 == null || (this.aShortArray99[local60] & arg6) != 0) {
							Static203.anInt3768 += this.anIntArray444[local60];
							Static343.anInt5563 += this.anIntArray441[local60];
							local28++;
							Static445.anInt7012 += this.anIntArray445[local60];
						}
					}
				}
			}
			if (local28 <= 0) {
				Static445.anInt7012 = arg4;
				Static203.anInt3768 = arg2;
				Static343.anInt5563 = arg3;
			} else {
				Static177.aBoolean317 = true;
				Static445.anInt7012 = Static445.anInt7012 / local28 + arg4;
				Static203.anInt3768 = Static203.anInt3768 / local28 + arg2;
				Static343.anInt5563 = arg3 + Static343.anInt5563 / local28;
			}
			return;
		}
		@Pc(248) int[] local248;
		@Pc(250) int local250;
		if (arg0 == 1) {
			if (arg7 != null) {
				local28 = arg7[1] * arg3 + arg2 * arg7[0] + arg4 * arg7[2] + 16384 >> 15;
				local32 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 16384 >> 15;
				local38 = arg7[6] * arg2 + arg7[7] * arg3 + arg4 * arg7[8] + 16384 >> 15;
				arg2 = local28;
				arg4 = local38;
				arg3 = local32;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray45.length) {
					local248 = this.anIntArrayArray45[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local54 = local248[local250];
						if (this.aShortArray99 == null || (this.aShortArray99[local54] & arg6) != 0) {
							this.anIntArray444[local54] += arg2;
							this.anIntArray441[local54] += arg3;
							this.anIntArray445[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(370) int local370;
		@Pc(392) int local392;
		@Pc(419) int local419;
		@Pc(450) int local450;
		@Pc(454) int local454;
		@Pc(458) int local458;
		@Pc(462) int local462;
		@Pc(470) int local470;
		@Pc(478) int local478;
		@Pc(634) int local634;
		@Pc(660) int local660;
		@Pc(664) int local664;
		@Pc(672) int local672;
		@Pc(677) int local677;
		@Pc(681) int local681;
		@Pc(685) int local685;
		@Pc(687) int local687;
		@Pc(818) int[] local818;
		@Pc(820) int local820;
		@Pc(824) int local824;
		@Pc(828) int local828;
		@Pc(830) int local830;
		@Pc(961) int local961;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray45.length) {
						local248 = this.anIntArrayArray45[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local54 = local248[local250];
							if (this.aShortArray99 == null || (arg6 & this.aShortArray99[local54]) != 0) {
								this.anIntArray444[local54] -= Static203.anInt3768;
								this.anIntArray441[local54] -= Static343.anInt5563;
								this.anIntArray445[local54] -= Static445.anInt7012;
								if (arg4 != 0) {
									local60 = Class1_Sub29.anIntArray537[arg4];
									local370 = Class1_Sub29.anIntArray536[arg4];
									local392 = this.anIntArray444[local54] * local370 + local60 * this.anIntArray441[local54] + 32767 >> 15;
									this.anIntArray441[local54] = local370 * this.anIntArray441[local54] + 32767 - this.anIntArray444[local54] * local60 >> 15;
									this.anIntArray444[local54] = local392;
								}
								if (arg2 != 0) {
									local60 = Class1_Sub29.anIntArray537[arg2];
									local370 = Class1_Sub29.anIntArray536[arg2];
									local392 = local370 * this.anIntArray441[local54] + 32767 - local60 * this.anIntArray445[local54] >> 15;
									this.anIntArray445[local54] = local60 * this.anIntArray441[local54] + local370 * this.anIntArray445[local54] + 32767 >> 15;
									this.anIntArray441[local54] = local392;
								}
								if (arg3 != 0) {
									local60 = Class1_Sub29.anIntArray537[arg3];
									local370 = Class1_Sub29.anIntArray536[arg3];
									local392 = local60 * this.anIntArray445[local54] + this.anIntArray444[local54] * local370 + 32767 >> 15;
									this.anIntArray445[local54] = local370 * this.anIntArray445[local54] + 32767 - this.anIntArray444[local54] * local60 >> 15;
									this.anIntArray444[local54] = local392;
								}
								this.anIntArray444[local54] += Static203.anInt3768;
								this.anIntArray441[local54] += Static343.anInt5563;
								this.anIntArray445[local54] += Static445.anInt7012;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray45.length > local38) {
							local52 = this.anIntArrayArray45[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray99 == null || (arg6 & this.aShortArray99[local60]) != 0) {
									local370 = this.anIntArray442[local60];
									local392 = this.anIntArray442[local60 + 1];
									for (local419 = local370; local419 < local392; local419++) {
										local450 = this.aShortArray97[local419] - 1;
										if (local450 == -1) {
											break;
										}
										if (arg4 != 0) {
											local454 = Class1_Sub29.anIntArray537[arg4];
											local458 = Class1_Sub29.anIntArray536[arg4];
											local462 = local458 * this.aShortArray98[local450] + this.aShortArray96[local450] * local454 + 32767 >> 15;
											this.aShortArray96[local450] = (short) (local458 * this.aShortArray96[local450] + 32767 - this.aShortArray98[local450] * local454 >> 15);
											this.aShortArray98[local450] = (short) local462;
										}
										if (arg2 != 0) {
											local454 = Class1_Sub29.anIntArray537[arg2];
											local458 = Class1_Sub29.anIntArray536[arg2];
											local462 = local458 * this.aShortArray96[local450] + 32767 - this.aShortArray103[local450] * local454 >> 15;
											this.aShortArray103[local450] = (short) (local454 * this.aShortArray96[local450] + this.aShortArray103[local450] * local458 + 32767 >> 15);
											this.aShortArray96[local450] = (short) local462;
										}
										if (arg3 != 0) {
											local454 = Class1_Sub29.anIntArray537[arg3];
											local458 = Class1_Sub29.anIntArray536[arg3];
											local462 = this.aShortArray103[local450] * local454 + local458 * this.aShortArray98[local450] + 32767 >> 15;
											this.aShortArray103[local450] = (short) (local458 * this.aShortArray103[local450] + 32767 - local454 * this.aShortArray98[local450] >> 15);
											this.aShortArray98[local450] = (short) local462;
										}
									}
								}
							}
						}
					}
					if (this.aClass80_10 == null && this.aClass80_11 != null) {
						this.aClass80_11.anInterface9_2 = null;
					}
					if (this.aClass80_10 != null) {
						this.aClass80_10.anInterface9_2 = null;
					}
				}
			} else {
				local28 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local250 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static177.aBoolean317) {
					local370 = Static343.anInt5563 * arg7[3] + arg7[0] * Static203.anInt3768 + Static445.anInt7012 * arg7[6] + 16384 >> 15;
					local392 = arg7[7] * Static445.anInt7012 + Static203.anInt3768 * arg7[1] + arg7[4] * Static343.anInt5563 + 16384 >> 15;
					local370 += local250;
					local419 = arg7[2] * Static203.anInt3768 + arg7[5] * Static343.anInt5563 + arg7[8] * Static445.anInt7012 + 16384 >> 15;
					local392 += local54;
					Static203.anInt3768 = local370;
					Static343.anInt5563 = local392;
					local419 += local60;
					Static445.anInt7012 = local419;
					Static177.aBoolean317 = false;
				}
				@Pc(438) int[] local438 = new int[9];
				local392 = Class1_Sub29.anIntArray536[arg2];
				local419 = Class1_Sub29.anIntArray537[arg2];
				local450 = Class1_Sub29.anIntArray536[arg3];
				local454 = Class1_Sub29.anIntArray537[arg3];
				local458 = Class1_Sub29.anIntArray536[arg4];
				local462 = Class1_Sub29.anIntArray537[arg4];
				local470 = local419 * local458 + 16384 >> 15;
				local478 = local462 * local419 + 16384 >> 15;
				local438[0] = local478 * local454 + local458 * local450 + 16384 >> 15;
				local438[8] = local392 * local450 + 16384 >> 15;
				local438[3] = local392 * local462 + 16384 >> 15;
				local438[5] = -local419;
				local438[2] = local454 * local392 + 16384 >> 15;
				local438[7] = local454 * local462 + local470 * local450 + 16384 >> 15;
				local438[6] = local458 * -local454 + local478 * local450 + 16384 >> 15;
				local438[1] = -local450 * local462 + local454 * local470 + 16384 >> 15;
				local438[4] = local458 * local392 + 16384 >> 15;
				@Pc(607) int local607 = local438[1] * -Static343.anInt5563 + -Static203.anInt3768 * local438[0] + -Static445.anInt7012 * local438[2] + 16384 >> 15;
				local634 = local438[3] * -Static203.anInt3768 + -Static343.anInt5563 * local438[4] + -Static445.anInt7012 * local438[5] + 16384 >> 15;
				local660 = -Static343.anInt5563 * local438[7] + -Static203.anInt3768 * local438[6] + -Static445.anInt7012 * local438[8] + 16384 >> 15;
				local664 = Static203.anInt3768 + local607;
				@Pc(668) int local668 = Static343.anInt5563 + local634;
				local672 = Static445.anInt7012 + local660;
				@Pc(675) int[] local675 = new int[9];
				for (local677 = 0; local677 < 3; local677++) {
					for (local681 = 0; local681 < 3; local681++) {
						local685 = 0;
						for (local687 = 0; local687 < 3; local687++) {
							local685 += arg7[local681 * 3 + local687] * local438[local687 + local677 * 3];
						}
						local675[local681 + local677 * 3] = local685 + 16384 >> 15;
					}
				}
				local681 = local250 * local438[0] + local54 * local438[1] + local60 * local438[2] + 16384 >> 15;
				local685 = local438[3] * local250 + local438[4] * local54 + local438[5] * local60 + 16384 >> 15;
				local681 += local664;
				local687 = local54 * local438[7] + local250 * local438[6] + local438[8] * local60 + 16384 >> 15;
				local685 += local668;
				local687 += local672;
				local818 = new int[9];
				for (local820 = 0; local820 < 3; local820++) {
					for (local824 = 0; local824 < 3; local824++) {
						local828 = 0;
						for (local830 = 0; local830 < 3; local830++) {
							local828 += arg7[local830 + local820 * 3] * local675[local830 * 3 + local824];
						}
						local818[local824 + local820 * 3] = local828 + 16384 >> 15;
					}
				}
				local824 = arg7[0] * local681 + arg7[1] * local685 + arg7[2] * local687 + 16384 >> 15;
				local828 = arg7[4] * local685 + arg7[3] * local681 + arg7[5] * local687 + 16384 >> 15;
				local828 += local32;
				local830 = arg7[8] * local687 + arg7[6] * local681 + arg7[7] * local685 + 16384 >> 15;
				local824 += local28;
				local830 += local38;
				for (local961 = 0; local961 < local8; local961++) {
					@Pc(967) int local967 = arg1[local961];
					if (local967 < this.anIntArrayArray45.length) {
						@Pc(981) int[] local981 = this.anIntArrayArray45[local967];
						for (@Pc(983) int local983 = 0; local983 < local981.length; local983++) {
							@Pc(989) int local989 = local981[local983];
							if (this.aShortArray99 == null || (this.aShortArray99[local989] & arg6) != 0) {
								@Pc(1030) int local1030 = this.anIntArray441[local989] * local818[1] + this.anIntArray444[local989] * local818[0] + this.anIntArray445[local989] * local818[2] + 16384 >> 15;
								@Pc(1062) int local1062 = local818[5] * this.anIntArray445[local989] + local818[3] * this.anIntArray444[local989] + this.anIntArray441[local989] * local818[4] + 16384 >> 15;
								@Pc(1066) int local1066 = local1062 + local828;
								@Pc(1070) int local1070 = local1030 + local824;
								@Pc(1102) int local1102 = this.anIntArray444[local989] * local818[6] + this.anIntArray441[local989] * local818[7] + this.anIntArray445[local989] * local818[8] + 16384 >> 15;
								this.anIntArray444[local989] = local1070;
								@Pc(1111) int local1111 = local1102 + local830;
								this.anIntArray441[local989] = local1066;
								this.anIntArray445[local989] = local1111;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2564) Class193 local2564;
			@Pc(2569) Class114 local2569;
			if (arg0 == 5) {
				if (this.anIntArrayArray44 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray44.length) {
							local248 = this.anIntArrayArray44[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local54 = local248[local250];
								if (this.aShortArray100 == null || (arg6 & this.aShortArray100[local54]) != 0) {
									local60 = (this.aByteArray84[local54] & 0xFF) + arg2 * 8;
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray84[local54] = (byte) local60;
									if (this.aClass80_11 != null) {
										this.aClass80_11.anInterface9_2 = null;
									}
								}
							}
						}
					}
					if (this.aClass193Array1 != null) {
						for (local32 = 0; local32 < this.anInt5912; local32++) {
							local2564 = this.aClass193Array1[local32];
							local2569 = this.aClass114Array1[local32];
							local2569.anInt2856 = local2569.anInt2856 & 0xFFFFFF | 255 - (this.aByteArray84[local2564.anInt5141] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2832) Class114 local2832;
				if (arg0 == 8) {
					if (this.anIntArrayArray46 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray46.length > local32) {
								local248 = this.anIntArrayArray46[local32];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2832 = this.aClass114Array1[local248[local250]];
									local2832.anInt2857 += arg3;
									local2832.anInt2850 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray46 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray46.length) {
								local248 = this.anIntArrayArray46[local32];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2832 = this.aClass114Array1[local248[local250]];
									local2832.anInt2852 = local2832.anInt2852 * arg2 >> 7;
									local2832.anInt2859 = local2832.anInt2859 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray46 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray46.length) {
							local248 = this.anIntArrayArray46[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local2832 = this.aClass114Array1[local248[local250]];
								local2832.anInt2854 = arg2 + local2832.anInt2854 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray44 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray44.length > local32) {
						local248 = this.anIntArrayArray44[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local54 = local248[local250];
							if (this.aShortArray100 == null || (this.aShortArray100[local54] & arg6) != 0) {
								local60 = this.aShortArray95[local54] & 0xFFFF;
								local370 = local60 >> 10 & 0x3F;
								local392 = local60 >> 7 & 0x7;
								@Pc(2674) int local2674 = arg2 + local370 & 0x3F;
								local392 += arg3 / 4;
								local419 = local60 & 0x7F;
								if (local392 < 0) {
									local392 = 0;
								} else if (local392 > 7) {
									local392 = 7;
								}
								local419 += arg4;
								if (local419 < 0) {
									local419 = 0;
								} else if (local419 > 127) {
									local419 = 127;
								}
								this.aShortArray95[local54] = (short) (local2674 << 10 | local392 << 7 | local419);
								if (this.aClass80_11 != null) {
									this.aClass80_11.anInterface9_2 = null;
								}
							}
						}
					}
				}
				if (this.aClass193Array1 != null) {
					for (local32 = 0; local32 < this.anInt5912; local32++) {
						local2564 = this.aClass193Array1[local32];
						local2569 = this.aClass114Array1[local32];
						local2569.anInt2856 = Static134.anIntArray182[this.aShortArray95[local2564.anInt5141] & 0xFFFF] & 0xFFFFFF | local2569.anInt2856 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray45.length) {
					local248 = this.anIntArrayArray45[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local54 = local248[local250];
						if (this.aShortArray99 == null || (this.aShortArray99[local54] & arg6) != 0) {
							this.anIntArray444[local54] -= Static203.anInt3768;
							this.anIntArray441[local54] -= Static343.anInt5563;
							this.anIntArray445[local54] -= Static445.anInt7012;
							this.anIntArray444[local54] = arg2 * this.anIntArray444[local54] >> 7;
							this.anIntArray441[local54] = this.anIntArray441[local54] * arg3 >> 7;
							this.anIntArray445[local54] = arg4 * this.anIntArray445[local54] >> 7;
							this.anIntArray444[local54] += Static203.anInt3768;
							this.anIntArray441[local54] += Static343.anInt5563;
							this.anIntArray445[local54] += Static445.anInt7012;
						}
					}
				}
			}
		} else {
			local28 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local250 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static177.aBoolean317) {
				local370 = arg7[6] * Static445.anInt7012 + Static203.anInt3768 * arg7[0] + arg7[3] * Static343.anInt5563 + 16384 >> 15;
				local392 = arg7[7] * Static445.anInt7012 + arg7[1] * Static203.anInt3768 + arg7[4] * Static343.anInt5563 + 16384 >> 15;
				local419 = Static445.anInt7012 * arg7[8] + arg7[5] * Static343.anInt5563 + arg7[2] * Static203.anInt3768 + 16384 >> 15;
				local370 += local250;
				local392 += local54;
				local419 += local60;
				Static203.anInt3768 = local370;
				Static343.anInt5563 = local392;
				Static445.anInt7012 = local419;
				Static177.aBoolean317 = false;
			}
			local370 = arg2 << 15 >> 7;
			local392 = arg3 << 15 >> 7;
			local419 = arg4 << 15 >> 7;
			local450 = -Static203.anInt3768 * local370 + 16384 >> 15;
			local454 = local392 * -Static343.anInt5563 + 16384 >> 15;
			local458 = local419 * -Static445.anInt7012 + 16384 >> 15;
			local462 = Static203.anInt3768 + local450;
			local470 = Static343.anInt5563 + local454;
			local478 = local458 + Static445.anInt7012;
			@Pc(1868) int[] local1868 = new int[] { arg7[0] * local370 + 16384 >> 15, local370 * arg7[3] + 16384 >> 15, local370 * arg7[6] + 16384 >> 15, local392 * arg7[1] + 16384 >> 15, local392 * arg7[4] + 16384 >> 15, local392 * arg7[7] + 16384 >> 15, local419 * arg7[2] + 16384 >> 15, arg7[5] * local419 + 16384 >> 15, local419 * arg7[8] + 16384 >> 15 };
			local634 = local250 * local370 + 16384 >> 15;
			local660 = local392 * local54 + 16384 >> 15;
			@Pc(1996) int local1996 = local634 + local462;
			@Pc(2000) int local2000 = local660 + local470;
			local664 = local60 * local419 + 16384 >> 15;
			@Pc(2012) int local2012 = local664 + local478;
			@Pc(2015) int[] local2015 = new int[9];
			@Pc(2021) int local2021;
			for (local672 = 0; local672 < 3; local672++) {
				for (local2021 = 0; local2021 < 3; local2021++) {
					local677 = 0;
					for (local681 = 0; local681 < 3; local681++) {
						local677 += arg7[local681 + local672 * 3] * local1868[local681 * 3 + local2021];
					}
					local2015[local672 * 3 + local2021] = local677 + 16384 >> 15;
				}
			}
			local2021 = local2012 * arg7[2] + local1996 * arg7[0] + arg7[1] * local2000 + 16384 >> 15;
			local677 = arg7[4] * local2000 + arg7[3] * local1996 + local2012 * arg7[5] + 16384 >> 15;
			local677 += local32;
			local681 = arg7[8] * local2012 + arg7[7] * local2000 + arg7[6] * local1996 + 16384 >> 15;
			local2021 += local28;
			local681 += local38;
			for (local685 = 0; local685 < local8; local685++) {
				local687 = arg1[local685];
				if (this.anIntArrayArray45.length > local687) {
					local818 = this.anIntArrayArray45[local687];
					for (local820 = 0; local820 < local818.length; local820++) {
						local824 = local818[local820];
						if (this.aShortArray99 == null || (arg6 & this.aShortArray99[local824]) != 0) {
							local828 = local2015[1] * this.anIntArray441[local824] + local2015[0] * this.anIntArray444[local824] + local2015[2] * this.anIntArray445[local824] + 16384 >> 15;
							local830 = this.anIntArray444[local824] * local2015[3] + this.anIntArray441[local824] * local2015[4] + this.anIntArray445[local824] * local2015[5] + 16384 >> 15;
							local961 = local2015[8] * this.anIntArray445[local824] + local2015[6] * this.anIntArray444[local824] + local2015[7] * this.anIntArray441[local824] + 16384 >> 15;
							@Pc(2293) int local2293 = local830 + local677;
							@Pc(2297) int local2297 = local828 + local2021;
							@Pc(2301) int local2301 = local961 + local681;
							this.anIntArray444[local824] = local2297;
							this.anIntArray441[local824] = local2293;
							this.anIntArray445[local824] = local2301;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "MA", descriptor = "()I")
	@Override
	public int MA() {
		if (!this.aBoolean526) {
			this.method4768();
		}
		return this.aShort88;
	}

	@OriginalMember(owner = "client!rr", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class1_Sub29.anIntArray537[arg0];
		@Pc(13) int local13 = Class1_Sub29.anIntArray536[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5929; local15++) {
			local33 = this.anIntArray445[local15] * local9 + local13 * this.anIntArray444[local15] >> 15;
			this.anIntArray445[local15] = this.anIntArray445[local15] * local13 - this.anIntArray444[local15] * local9 >> 15;
			this.anIntArray444[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt5902; local33++) {
			@Pc(82) int local82 = local9 * this.aShortArray103[local33] + local13 * this.aShortArray98[local33] >> 15;
			this.aShortArray103[local33] = (short) (this.aShortArray103[local33] * local13 - local9 * this.aShortArray98[local33] >> 15);
			this.aShortArray98[local33] = (short) local82;
		}
		if (this.aClass80_10 == null && this.aClass80_11 != null) {
			this.aClass80_11.anInterface9_2 = null;
		}
		if (this.aClass80_10 != null) {
			this.aClass80_10.anInterface9_2 = null;
		}
		this.aBoolean526 = false;
		if (this.aClass80_9 != null) {
			this.aClass80_9.anInterface9_2 = null;
		}
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "()Z")
	@Override
	public boolean method5994() {
		if (this.aShortArray94 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray94.length; local12++) {
			if (this.aShortArray94[local12] != -1 && !this.aClass117_Sub1_36.anInterface4_10.method5089(this.aShortArray94[local12])) {
				return false;
			}
		}
		return true;
	}
}
