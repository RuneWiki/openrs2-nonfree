import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class108_Sub2 extends Class108 {

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "[Lclient!bn;")
	private Class24[] aClass24Array1;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "[Lclient!hd;")
	private Class95[] aClass95Array4;

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "[F")
	private float[] aFloatArray30;

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "S")
	private short aShort76;

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "[I")
	private int[] anIntArray361;

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "Lclient!rs;")
	private Class215 aClass215_1;

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "[I")
	private int[] anIntArray362;

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!rd", name = "F", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!rd", name = "L", descriptor = "S")
	private short aShort77;

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "[I")
	private int[] anIntArray363;

	@OriginalMember(owner = "client!rd", name = "O", descriptor = "S")
	private short aShort78;

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "S")
	private short aShort79;

	@OriginalMember(owner = "client!rd", name = "V", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!rd", name = "X", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!rd", name = "ab", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!rd", name = "bb", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!rd", name = "db", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!rd", name = "fb", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!rd", name = "kb", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!rd", name = "lb", descriptor = "[I")
	private int[] lb;

	@OriginalMember(owner = "client!rd", name = "ob", descriptor = "[Lclient!lq;")
	private Class141[] aClass141Array4;

	@OriginalMember(owner = "client!rd", name = "qb", descriptor = "[B")
	private byte[] aByteArray98;

	@OriginalMember(owner = "client!rd", name = "rb", descriptor = "B")
	private byte aByte74;

	@OriginalMember(owner = "client!rd", name = "sb", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!rd", name = "ub", descriptor = "S")
	private short aShort81;

	@OriginalMember(owner = "client!rd", name = "vb", descriptor = "[I")
	private int[] anIntArray364;

	@OriginalMember(owner = "client!rd", name = "yb", descriptor = "I")
	private int anInt5974;

	@OriginalMember(owner = "client!rd", name = "Cb", descriptor = "S")
	private short aShort82;

	@OriginalMember(owner = "client!rd", name = "Fb", descriptor = "Lclient!ms;")
	private Interface9 anInterface9_7;

	@OriginalMember(owner = "client!rd", name = "Hb", descriptor = "I")
	private int anInt5980;

	@OriginalMember(owner = "client!rd", name = "Jb", descriptor = "[B")
	private byte[] aByteArray99;

	@OriginalMember(owner = "client!rd", name = "Kb", descriptor = "S")
	private short aShort83;

	@OriginalMember(owner = "client!rd", name = "Nb", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!rd", name = "Ob", descriptor = "[Lclient!sr;")
	private Class229[] aClass229Array1;

	@OriginalMember(owner = "client!rd", name = "Rb", descriptor = "[[I")
	private int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!rd", name = "Tb", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!rd", name = "Wb", descriptor = "[F")
	private float[] aFloatArray31;

	@OriginalMember(owner = "client!rd", name = "cc", descriptor = "Lclient!vf;")
	private Interface13 anInterface13_5;

	@OriginalMember(owner = "client!rd", name = "nc", descriptor = "I")
	private int anInt6001;

	@OriginalMember(owner = "client!rd", name = "oc", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Z")
	private boolean aBoolean416 = true;

	@OriginalMember(owner = "client!rd", name = "ib", descriptor = "I")
	private int anInt5967 = 0;

	@OriginalMember(owner = "client!rd", name = "Pb", descriptor = "I")
	private int anInt5983 = 0;

	@OriginalMember(owner = "client!rd", name = "Ib", descriptor = "I")
	private int anInt5981 = 0;

	@OriginalMember(owner = "client!rd", name = "bc", descriptor = "Z")
	private boolean aBoolean417 = false;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
	private int anInt5943 = 0;

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
	private int anInt5956 = 0;

	@OriginalMember(owner = "client!rd", name = "I", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_36;

	@OriginalMember(owner = "client!rd", name = "nb", descriptor = "Lclient!m;")
	private Class145 aClass145_14;

	@OriginalMember(owner = "client!rd", name = "pc", descriptor = "Lclient!m;")
	private Class145 aClass145_16;

	@OriginalMember(owner = "client!rd", name = "jc", descriptor = "Lclient!m;")
	private Class145 aClass145_15;

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "Lclient!m;")
	private Class145 aClass145_13;

	@OriginalMember(owner = "client!rd", name = "Ab", descriptor = "Lclient!fj;")
	private Class72 aClass72_1;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!nq;)V")
	public Class108_Sub2(@OriginalArg(0) Class167_Sub1 arg0) {
		this.aClass167_Sub1_36 = arg0;
		this.aClass145_14 = new Class145(null, 5126, 3, 0);
		this.aClass145_16 = new Class145(null, 5126, 2, 0);
		this.aClass145_15 = new Class145(null, 5126, 3, 0);
		this.aClass145_13 = new Class145(null, 5121, 4, 0);
		this.aClass72_1 = new Class72();
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!nq;Lclient!nd;IIII)V")
	public Class108_Sub2(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass167_Sub1_36 = arg0;
		this.anInt5974 = arg5;
		this.anInt6001 = arg2;
		if (Static345.method4829(arg2, arg5)) {
			this.aClass145_14 = new Class145(null, 5126, 3, 0);
		}
		if (Static138.method2124(arg2, arg5)) {
			this.aClass145_16 = new Class145(null, 5126, 2, 0);
		}
		if (Static97.method1674(arg5, arg2)) {
			this.aClass145_15 = new Class145(null, 5126, 3, 0);
		}
		if (Static225.method3255(arg5, arg2)) {
			this.aClass145_13 = new Class145(null, 5121, 4, 0);
		}
		if (Static459.method4921(arg5, arg2)) {
			this.aClass72_1 = new Class72();
		}
		@Pc(102) Interface7 local102 = arg0.anInterface7_8;
		this.anIntArray363 = new int[arg1.anInt4545 + 1];
		@Pc(113) int[] local113 = new int[arg1.anInt4544];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt4544; local115++) {
			if ((arg1.aByteArray81 == null || arg1.aByteArray81[local115] != 2) && (arg1.aShortArray67 == null || arg1.aShortArray67[local115] == -1 || !local102.method4417(arg1.aShortArray67[local115] & 0xFFFF).aBoolean233)) {
				local113[this.anInt5983++] = local115;
				this.anIntArray363[arg1.aShortArray58[local115]]++;
				this.anIntArray363[arg1.aShortArray64[local115]]++;
				this.anIntArray363[arg1.aShortArray61[local115]]++;
			}
		}
		this.anInt5967 = this.anInt5983;
		@Pc(207) long[] local207 = new long[this.anInt5983];
		@Pc(216) boolean local216 = (this.anInt6001 & 0x100) != 0;
		@Pc(228) int local228;
		@Pc(239) int local239;
		@Pc(371) int local371;
		label495: for (@Pc(218) int local218 = 0; local218 < this.anInt5983; local218++) {
			@Pc(224) int local224 = local113[local218];
			@Pc(226) Class105 local226 = null;
			local228 = 0;
			@Pc(230) byte local230 = 0;
			@Pc(232) byte local232 = 0;
			@Pc(234) byte local234 = 0;
			if (arg1.aClass131Array1 != null) {
				for (local239 = 0; local239 < arg1.aClass131Array1.length; local239++) {
					@Pc(246) Class131 local246 = arg1.aClass131Array1[local239];
					if (local246.anInt3721 == local224) {
						@Pc(255) Class177 local255 = Static410.method5654(local246.anInt3720);
						if (local255.aBoolean377) {
							local207[local218] = Long.MAX_VALUE;
							this.anInt5967--;
							continue label495;
						}
					}
				}
			}
			@Pc(278) short local278 = -1;
			if (arg1.aShortArray67 != null) {
				local278 = arg1.aShortArray67[local224];
				if (local278 != -1) {
					local226 = local102.method4417(local278 & 0xFFFF);
					local232 = local226.aByte37;
					local234 = local226.aByte41;
				}
			}
			@Pc(327) boolean local327 = arg1.aByteArray84 != null && arg1.aByteArray84[local224] != 0 || local226 != null && !local226.aBoolean235 | local226.aBoolean234;
			if ((local216 || local327) && arg1.aByteArray82 != null) {
				local228 += arg1.aByteArray82[local224] << 17;
			}
			if (local327) {
				local228 += 65536;
			}
			local228 += (local232 & 0xFF) << 8;
			local228 += local234 & 0xFF;
			local371 = local230 + ((local278 & 0xFFFF) << 16);
			@Pc(377) int local377 = local371 + (local218 & 0xFFFF);
			local207[local218] = (long) local377 + ((long) local228 << 32);
		}
		Static365.method5100(local207, local113);
		this.anIntArray364 = arg1.anIntArray297;
		this.aShortArray74 = arg1.aShortArray66;
		this.lb = arg1.anIntArray300;
		this.anInt5943 = arg1.anInt4541;
		this.anInt5981 = arg1.anInt4545;
		this.anIntArray361 = arg1.anIntArray303;
		@Pc(424) Class273[] local424 = new Class273[this.anInt5981];
		this.aClass141Array4 = arg1.aClass141Array3;
		this.aClass95Array4 = arg1.aClass95Array3;
		@Pc(452) int local452;
		@Pc(466) int local466;
		if (arg1.aClass131Array1 != null) {
			this.anInt5980 = arg1.aClass131Array1.length;
			this.aClass24Array1 = new Class24[this.anInt5980];
			this.aClass229Array1 = new Class229[this.anInt5980];
			for (local452 = 0; local452 < this.anInt5980; local452++) {
				@Pc(459) Class131 local459 = arg1.aClass131Array1[local452];
				@Pc(464) Class177 local464 = Static410.method5654(local459.anInt3720);
				local466 = -1;
				for (@Pc(468) int local468 = 0; local468 < this.anInt5983; local468++) {
					if (local459.anInt3721 == local113[local468]) {
						local466 = local468;
						break;
					}
				}
				if (local466 == -1) {
					throw new RuntimeException();
				}
				local239 = Static329.anIntArray346[arg1.aShortArray60[local459.anInt3721] & 0xFFFF] & 0xFFFFFF;
				local239 |= 255 - (arg1.aByteArray84 == null ? 0 : arg1.aByteArray84[local459.anInt3721]) << 24;
				this.aClass24Array1[local452] = new Class24(local466, arg1.aShortArray58[local459.anInt3721], arg1.aShortArray64[local459.anInt3721], arg1.aShortArray61[local459.anInt3721], local464.anInt5194, local464.anInt5185, local464.anInt5186, local464.anInt5187, local464.anInt5191, local464.aBoolean377, local464.aBoolean376, local459.anInt3716);
				this.aClass229Array1[local452] = new Class229(local239);
			}
		}
		local452 = this.anInt5983 * 3;
		this.aByteArray98 = new byte[this.anInt5983];
		this.aShortArray82 = new short[this.anInt5983];
		this.aShortArray78 = new short[this.anInt5983];
		this.aShort78 = (short) arg3;
		if (arg1.aShortArray63 != null) {
			this.aShortArray83 = new short[this.anInt5983];
		}
		this.aFloatArray30 = new float[local452];
		this.aShortArray80 = new short[local452];
		Static221.aLongArray11 = new long[local452];
		this.aShortArray75 = new short[this.anInt5983];
		this.aShortArray81 = new short[local452];
		this.aShortArray77 = new short[local452];
		this.aShortArray76 = new short[this.anInt5983];
		this.aByteArray99 = new byte[local452];
		this.aFloatArray31 = new float[local452];
		this.aShortArray79 = new short[local452];
		this.aShortArray84 = new short[this.anInt5983];
		this.aShort80 = (short) arg4;
		local228 = 0;
		for (local371 = 0; local371 < arg1.anInt4545; local371++) {
			local466 = this.anIntArray363[local371];
			this.anIntArray363[local371] = local228;
			local228 += local466;
			local424[local371] = new Class273();
		}
		this.anIntArray363[arg1.anInt4545] = local228;
		@Pc(711) int[] local711 = null;
		@Pc(713) int[] local713 = null;
		@Pc(715) int[] local715 = null;
		@Pc(717) float[][] local717 = null;
		@Pc(743) int local743;
		@Pc(787) int local787;
		@Pc(793) int local793;
		@Pc(807) int local807;
		@Pc(809) int local809;
		@Pc(843) int local843;
		@Pc(848) int local848;
		@Pc(1010) float local1010;
		@Pc(1006) float local1006;
		@Pc(1012) float local1012;
		if (arg1.aByteArray80 != null) {
			@Pc(723) int local723 = arg1.anInt4555;
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
			local713 = new int[local723];
			local711 = new int[local723];
			for (local787 = 0; local787 < this.anInt5983; local787++) {
				local793 = local113[local787];
				if (arg1.aByteArray80[local793] != -1) {
					local807 = arg1.aByteArray80[local793] & 0xFF;
					for (local809 = 0; local809 < 3; local809++) {
						@Pc(824) short local824;
						if (local809 == 0) {
							local824 = arg1.aShortArray58[local793];
						} else if (local809 == 1) {
							local824 = arg1.aShortArray64[local793];
						} else {
							local824 = arg1.aShortArray61[local793];
						}
						local843 = arg1.anIntArray297[local824];
						local848 = arg1.anIntArray303[local824];
						@Pc(853) int local853 = arg1.anIntArray300[local824];
						if (local843 < local726[local807]) {
							local726[local807] = local843;
						}
						if (local843 > local729[local807]) {
							local729[local807] = local843;
						}
						if (local732[local807] > local848) {
							local732[local807] = local848;
						}
						if (local848 > local735[local807]) {
							local735[local807] = local848;
						}
						if (local853 < local738[local807]) {
							local738[local807] = local853;
						}
						if (local853 > local741[local807]) {
							local741[local807] = local853;
						}
					}
				}
			}
			for (local793 = 0; local793 < local723; local793++) {
				@Pc(945) byte local945 = arg1.aByteArray83[local793];
				if (local945 > 0) {
					local711[local793] = (local729[local793] + local726[local793]) / 2;
					local713[local793] = (local732[local793] + local735[local793]) / 2;
					local715[local793] = (local738[local793] + local741[local793]) / 2;
					if (local945 == 1) {
						local848 = arg1.anIntArray304[local793];
						local1006 = 64.0F / (float) arg1.anIntArray306[local793];
						if (local848 == 0) {
							local1010 = 1.0F;
							local1012 = 1.0F;
						} else if (local848 > 0) {
							local1010 = 1.0F;
							local1012 = (float) local848 / 1024.0F;
						} else {
							local1012 = 1.0F;
							local1010 = (float) -local848 / 1024.0F;
						}
					} else if (local945 == 2) {
						local1006 = 64.0F / (float) arg1.anIntArray306[local793];
						local1010 = 64.0F / (float) arg1.anIntArray304[local793];
						local1012 = 64.0F / (float) arg1.anIntArray299[local793];
					} else {
						local1010 = (float) arg1.anIntArray304[local793] / 1024.0F;
						local1006 = (float) arg1.anIntArray306[local793] / 1024.0F;
						local1012 = (float) arg1.anIntArray299[local793] / 1024.0F;
					}
					local717[local793] = Static252.method3559(local1006, arg1.aByteArray79[local793] & 0xFF, local1012, local1010, arg1.aShortArray62[local793], arg1.aShortArray65[local793], arg1.aShortArray59[local793]);
				}
			}
		}
		@Pc(1124) Class244[] local1124 = new Class244[arg1.anInt4544];
		@Pc(1143) short local1143;
		@Pc(1154) int local1154;
		@Pc(1164) int local1164;
		@Pc(1225) int local1225;
		for (@Pc(1126) int local1126 = 0; local1126 < arg1.anInt4544; local1126++) {
			@Pc(1133) short local1133 = arg1.aShortArray58[local1126];
			@Pc(1138) short local1138 = arg1.aShortArray64[local1126];
			local1143 = arg1.aShortArray61[local1126];
			local1154 = this.anIntArray364[local1138] - this.anIntArray364[local1133];
			local1164 = this.anIntArray361[local1138] - this.anIntArray361[local1133];
			local743 = this.lb[local1138] - this.lb[local1133];
			local787 = this.anIntArray364[local1143] - this.anIntArray364[local1133];
			local793 = this.anIntArray361[local1143] - this.anIntArray361[local1133];
			local807 = this.lb[local1143] - this.lb[local1133];
			local809 = local1164 * local807 - local793 * local743;
			local1225 = local743 * local787 - local807 * local1154;
			local843 = local1154 * local793 - local787 * local1164;
			while (local809 > 8192 || local1225 > 8192 || local843 > 8192 || local809 < -8192 || local1225 < -8192 || local843 < -8192) {
				local1225 >>= 0x1;
				local843 >>= 0x1;
				local809 >>= 0x1;
			}
			local848 = (int) Math.sqrt((double) (local843 * local843 + local809 * local809 + local1225 * local1225));
			if (local848 <= 0) {
				local848 = 1;
			}
			local1225 = local1225 * 256 / local848;
			local843 = local843 * 256 / local848;
			local809 = local809 * 256 / local848;
			@Pc(1321) byte local1321 = arg1.aByteArray81 == null ? 0 : arg1.aByteArray81[local1126];
			if (local1321 == 0) {
				@Pc(1330) Class273 local1330 = local424[local1133];
				local1330.anInt7833 += local843;
				local1330.anInt7830 += local809;
				local1330.anInt7832 += local1225;
				local1330.anInt7834++;
				@Pc(1358) Class273 local1358 = local424[local1138];
				local1358.anInt7833 += local843;
				local1358.anInt7830 += local809;
				local1358.anInt7832 += local1225;
				local1358.anInt7834++;
				@Pc(1386) Class273 local1386 = local424[local1143];
				local1386.anInt7830 += local809;
				local1386.anInt7833 += local843;
				local1386.anInt7834++;
				local1386.anInt7832 += local1225;
			} else if (local1321 == 1) {
				@Pc(1423) Class244 local1423 = local1124[local1126] = new Class244();
				local1423.anInt6933 = local809;
				local1423.anInt6932 = local1225;
				local1423.anInt6929 = local843;
			}
		}
		@Pc(1449) int local1449;
		for (@Pc(1443) int local1443 = 0; local1443 < this.anInt5983; local1443++) {
			local1449 = local113[local1443];
			@Pc(1456) int local1456 = arg1.aShortArray60[local1449] & 0xFFFF;
			@Pc(1461) short local1461;
			if (arg1.aShortArray67 == null) {
				local1461 = -1;
			} else {
				local1461 = arg1.aShortArray67[local1449];
			}
			if (arg1.aByteArray80 == null) {
				local1164 = -1;
			} else {
				local1164 = arg1.aByteArray80[local1449];
			}
			if (arg1.aByteArray84 == null) {
				local743 = 0;
			} else {
				local743 = arg1.aByteArray84[local1449] & 0xFF;
			}
			@Pc(1496) float local1496 = 0.0F;
			@Pc(1498) float local1498 = 0.0F;
			@Pc(1500) float local1500 = 0.0F;
			local1010 = 0.0F;
			local1006 = 0.0F;
			local1012 = 0.0F;
			@Pc(1508) byte local1508 = 0;
			@Pc(1510) byte local1510 = 0;
			@Pc(1512) int local1512 = 0;
			@Pc(1546) byte local1546;
			@Pc(1566) short local1566;
			@Pc(2311) short local2311;
			@Pc(2316) short local2316;
			if (local1461 != -1) {
				if (local1164 == -1) {
					local1496 = 0.0F;
					local1006 = 0.0F;
					local1012 = 0.0F;
					local1498 = 1.0F;
					local1010 = 1.0F;
					local1510 = 2;
					local1508 = 1;
					local1500 = 1.0F;
				} else {
					local1164 &= 0xFF;
					local1546 = arg1.aByteArray83[local1164];
					@Pc(1556) short local1556;
					@Pc(1561) short local1561;
					@Pc(1595) float local1595;
					@Pc(1807) float local1807;
					@Pc(1815) float local1815;
					@Pc(1914) float local1914;
					@Pc(1922) float local1922;
					@Pc(1930) float local1930;
					@Pc(1953) float local1953;
					@Pc(1976) float local1976;
					@Pc(1999) float local1999;
					if (local1546 == 0) {
						local1556 = arg1.aShortArray58[local1449];
						local1561 = arg1.aShortArray64[local1449];
						local1566 = arg1.aShortArray61[local1449];
						local2311 = arg1.aShortArray65[local1164];
						local2316 = arg1.aShortArray59[local1164];
						@Pc(2321) short local2321 = arg1.aShortArray62[local1164];
						@Pc(2327) float local2327 = (float) arg1.anIntArray297[local2311];
						@Pc(2333) float local2333 = (float) arg1.anIntArray303[local2311];
						local1595 = arg1.anIntArray300[local2311];
						local1807 = (float) arg1.anIntArray297[local2316] - local2327;
						local1815 = (float) arg1.anIntArray303[local2316] - local2333;
						@Pc(2366) float local2366 = (float) arg1.anIntArray300[local2316] - local1595;
						@Pc(2375) float local2375 = (float) arg1.anIntArray297[local2321] - local2327;
						@Pc(2383) float local2383 = (float) arg1.anIntArray303[local2321] - local2333;
						@Pc(2391) float local2391 = (float) arg1.anIntArray300[local2321] - local1595;
						@Pc(2400) float local2400 = (float) arg1.anIntArray297[local1556] - local2327;
						@Pc(2409) float local2409 = (float) arg1.anIntArray303[local1556] - local2333;
						@Pc(2417) float local2417 = (float) arg1.anIntArray300[local1556] - local1595;
						@Pc(2426) float local2426 = (float) arg1.anIntArray297[local1561] - local2327;
						@Pc(2434) float local2434 = (float) arg1.anIntArray303[local1561] - local2333;
						local1914 = (float) arg1.anIntArray300[local1561] - local1595;
						local1922 = (float) arg1.anIntArray297[local1566] - local2327;
						local1930 = (float) arg1.anIntArray303[local1566] - local2333;
						local1953 = (float) arg1.anIntArray300[local1566] - local1595;
						local1976 = local2391 * local1815 - local2366 * local2383;
						local1999 = local2366 * local2375 - local1807 * local2391;
						@Pc(2493) float local2493 = local2383 * local1807 - local1815 * local2375;
						@Pc(2501) float local2501 = local2383 * local2493 - local1999 * local2391;
						@Pc(2509) float local2509 = local2391 * local1976 - local2375 * local2493;
						@Pc(2518) float local2518 = local1999 * local2375 - local1976 * local2383;
						@Pc(2532) float local2532 = 1.0F / (local2366 * local2518 + local2509 * local1815 + local2501 * local1807);
						local1496 = (local2417 * local2518 + local2409 * local2509 + local2501 * local2400) * local2532;
						local1006 = (local1922 * local2501 + local1930 * local2509 + local2518 * local1953) * local2532;
						local1500 = (local2509 * local2434 + local2426 * local2501 + local1914 * local2518) * local2532;
						@Pc(2582) float local2582 = local1807 * local1999 - local1815 * local1976;
						@Pc(2591) float local2591 = local2493 * local1815 - local1999 * local2366;
						@Pc(2599) float local2599 = local1976 * local2366 - local2493 * local1807;
						@Pc(2613) float local2613 = 1.0F / (local2582 * local2391 + local2591 * local2375 + local2599 * local2383);
						local1010 = (local2591 * local2426 + local2599 * local2434 + local2582 * local1914) * local2613;
						local1498 = (local2591 * local2400 + local2599 * local2409 + local2582 * local2417) * local2613;
						local1012 = (local1953 * local2582 + local2599 * local1930 + local2591 * local1922) * local2613;
					} else {
						local1556 = arg1.aShortArray58[local1449];
						local1561 = arg1.aShortArray64[local1449];
						local1566 = arg1.aShortArray61[local1449];
						@Pc(1570) int local1570 = local711[local1164];
						@Pc(1574) int local1574 = local713[local1164];
						@Pc(1578) int local1578 = local715[local1164];
						@Pc(1582) float[] local1582 = local717[local1164];
						@Pc(1587) byte local1587 = arg1.aByteArray85[local1164];
						local1595 = (float) arg1.anIntArray307[local1164] / 256.0F;
						if (local1546 == 1) {
							local1807 = (float) arg1.anIntArray299[local1164] / 1024.0F;
							Static101.method1701(arg1.anIntArray297[local1556], local1595, local1574, local1582, arg1.anIntArray303[local1556], local1578, local1807, arg1.anIntArray300[local1556], local1587, local1570);
							local1498 = Static38.aFloat10;
							local1496 = Static18.aFloat5;
							Static101.method1701(arg1.anIntArray297[local1561], local1595, local1574, local1582, arg1.anIntArray303[local1561], local1578, local1807, arg1.anIntArray300[local1561], local1587, local1570);
							local1010 = Static38.aFloat10;
							local1500 = Static18.aFloat5;
							Static101.method1701(arg1.anIntArray297[local1566], local1595, local1574, local1582, arg1.anIntArray303[local1566], local1578, local1807, arg1.anIntArray300[local1566], local1587, local1570);
							local1006 = Static18.aFloat5;
							local1012 = Static38.aFloat10;
							local1815 = local1807 / 2.0F;
							if ((local1587 & 0x1) == 0) {
								if (local1815 < local1006 - local1496) {
									local1006 -= local1807;
									local1510 = 1;
								} else if (local1815 < local1496 - local1006) {
									local1510 = 2;
									local1006 += local1807;
								}
								if (local1500 - local1496 > local1815) {
									local1500 -= local1807;
									local1508 = 1;
								} else if (local1815 < local1496 - local1500) {
									local1500 += local1807;
									local1508 = 2;
								}
							} else {
								if (local1010 - local1498 > local1815) {
									local1010 -= local1807;
									local1508 = 1;
								} else if (local1815 < local1498 - local1010) {
									local1010 += local1807;
									local1508 = 2;
								}
								if (local1815 < local1012 - local1498) {
									local1510 = 1;
									local1012 -= local1807;
								} else if (local1498 - local1012 > local1815) {
									local1012 += local1807;
									local1510 = 2;
								}
							}
						} else if (local1546 == 2) {
							local1807 = (float) arg1.anIntArray298[local1164] / 256.0F;
							local1815 = (float) arg1.anIntArray305[local1164] / 256.0F;
							@Pc(1826) int local1826 = arg1.anIntArray297[local1561] - arg1.anIntArray297[local1556];
							@Pc(1836) int local1836 = arg1.anIntArray303[local1561] - arg1.anIntArray303[local1556];
							@Pc(1847) int local1847 = arg1.anIntArray300[local1561] - arg1.anIntArray300[local1556];
							@Pc(1858) int local1858 = arg1.anIntArray297[local1566] - arg1.anIntArray297[local1556];
							@Pc(1869) int local1869 = arg1.anIntArray303[local1566] - arg1.anIntArray303[local1556];
							@Pc(1880) int local1880 = arg1.anIntArray300[local1566] - arg1.anIntArray300[local1556];
							@Pc(1889) int local1889 = local1880 * local1836 - local1869 * local1847;
							@Pc(1897) int local1897 = local1858 * local1847 - local1826 * local1880;
							@Pc(1906) int local1906 = local1826 * local1869 - local1858 * local1836;
							local1914 = 64.0F / (float) arg1.anIntArray304[local1164];
							local1922 = 64.0F / (float) arg1.anIntArray306[local1164];
							local1930 = 64.0F / (float) arg1.anIntArray299[local1164];
							local1953 = ((float) local1897 * local1582[1] + local1582[0] * (float) local1889 + (float) local1906 * local1582[2]) / local1914;
							local1976 = ((float) local1897 * local1582[4] + (float) local1889 * local1582[3] + local1582[5] * (float) local1906) / local1922;
							local1999 = (local1582[6] * (float) local1889 + local1582[7] * (float) local1897 + (float) local1906 * local1582[8]) / local1930;
							local1512 = Static452.method6155(local1953, local1976, local1999);
							Static358.method5011(local1512, local1570, local1587, local1574, local1582, local1807, arg1.anIntArray297[local1556], local1578, arg1.anIntArray300[local1556], local1815, local1595, arg1.anIntArray303[local1556]);
							local1498 = Static216.aFloat54;
							local1496 = Static233.aFloat59;
							Static358.method5011(local1512, local1570, local1587, local1574, local1582, local1807, arg1.anIntArray297[local1561], local1578, arg1.anIntArray300[local1561], local1815, local1595, arg1.anIntArray303[local1561]);
							local1500 = Static233.aFloat59;
							local1010 = Static216.aFloat54;
							Static358.method5011(local1512, local1570, local1587, local1574, local1582, local1807, arg1.anIntArray297[local1566], local1578, arg1.anIntArray300[local1566], local1815, local1595, arg1.anIntArray303[local1566]);
							local1006 = Static233.aFloat59;
							local1012 = Static216.aFloat54;
						} else if (local1546 == 3) {
							Static151.method2345(arg1.anIntArray297[local1556], local1582, local1578, arg1.anIntArray303[local1556], arg1.anIntArray300[local1556], local1587, local1570, local1595, local1574);
							local1496 = Static161.aFloat95;
							local1498 = Static418.aFloat101;
							Static151.method2345(arg1.anIntArray297[local1561], local1582, local1578, arg1.anIntArray303[local1561], arg1.anIntArray300[local1561], local1587, local1570, local1595, local1574);
							local1500 = Static161.aFloat95;
							local1010 = Static418.aFloat101;
							Static151.method2345(arg1.anIntArray297[local1566], local1582, local1578, arg1.anIntArray303[local1566], arg1.anIntArray300[local1566], local1587, local1570, local1595, local1574);
							local1006 = Static161.aFloat95;
							local1012 = Static418.aFloat101;
							if ((local1587 & 0x1) == 0) {
								if (local1006 - local1496 > 0.5F) {
									local1510 = 1;
									local1006--;
								} else if (local1496 - local1006 > 0.5F) {
									local1510 = 2;
									local1006++;
								}
								if (local1500 - local1496 > 0.5F) {
									local1500--;
									local1508 = 1;
								} else if (local1496 - local1500 > 0.5F) {
									local1500++;
									local1508 = 2;
								}
							} else {
								if (local1012 - local1498 > 0.5F) {
									local1012--;
									local1510 = 1;
								} else if (local1498 - local1012 > 0.5F) {
									local1510 = 2;
									local1012++;
								}
								if (local1010 - local1498 > 0.5F) {
									local1010--;
									local1508 = 1;
								} else if (local1498 - local1010 > 0.5F) {
									local1508 = 2;
									local1010++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray81 == null) {
				local1546 = 0;
			} else {
				local1546 = arg1.aByteArray81[local1449];
			}
			if (local1546 == 0) {
				@Pc(2689) long local2689 = ((long) (local1456 << 8) + (long) (local1512 << 24) + (long) local743 << 32) + (long) (local1164 << 2);
				local1566 = arg1.aShortArray58[local1449];
				local2311 = arg1.aShortArray64[local1449];
				local2316 = arg1.aShortArray61[local1449];
				@Pc(2708) Class273 local2708 = local424[local1566];
				this.aShortArray76[local1443] = this.method4956(local2689, local1496, local1498, local2708.anInt7834, local2708.anInt7830, local2708.anInt7832, local2708.anInt7833, local1566, arg1);
				@Pc(2732) Class273 local2732 = local424[local2311];
				this.aShortArray82[local1443] = this.method4956((long) local1508 + local2689, local1500, local1010, local2732.anInt7834, local2732.anInt7830, local2732.anInt7832, local2732.anInt7833, local2311, arg1);
				@Pc(2759) Class273 local2759 = local424[local2316];
				this.aShortArray84[local1443] = this.method4956((long) local1510 + local2689, local1006, local1012, local2759.anInt7834, local2759.anInt7830, local2759.anInt7832, local2759.anInt7833, local2316, arg1);
			} else if (local1546 == 1) {
				@Pc(2791) Class244 local2791 = local1124[local1449];
				@Pc(2834) long local2834 = (long) ((local2791.anInt6932 + 256 << 12) + ((local1164 << 2) + (local2791.anInt6933 > 0 ? 1024 : 2048) + (local2791.anInt6929 - -256 << 22))) + ((long) (local1456 << 8) + (long) (local1512 << 24) + (long) local743 << 32);
				this.aShortArray76[local1443] = this.method4956(local2834, local1496, local1498, 0, local2791.anInt6933, local2791.anInt6932, local2791.anInt6929, arg1.aShortArray58[local1449], arg1);
				this.aShortArray82[local1443] = this.method4956(local2834 + (long) local1508, local1500, local1010, 0, local2791.anInt6933, local2791.anInt6932, local2791.anInt6929, arg1.aShortArray64[local1449], arg1);
				this.aShortArray84[local1443] = this.method4956(local2834 + (long) local1510, local1006, local1012, 0, local2791.anInt6933, local2791.anInt6932, local2791.anInt6929, arg1.aShortArray61[local1449], arg1);
			}
			if (arg1.aShortArray67 == null) {
				this.aShortArray75[local1443] = -1;
			} else {
				this.aShortArray75[local1443] = arg1.aShortArray67[local1449];
			}
			if (arg1.aByteArray84 != null) {
				this.aByteArray98[local1443] = arg1.aByteArray84[local1449];
			}
			if (arg1.aShortArray63 != null) {
				this.aShortArray83[local1443] = arg1.aShortArray63[local1449];
			}
			this.aShortArray78[local1443] = arg1.aShortArray60[local1449];
		}
		local1449 = 0;
		local1143 = -10000;
		for (local1154 = 0; local1154 < this.anInt5967; local1154++) {
			@Pc(2976) short local2976 = this.aShortArray75[local1154];
			if (local2976 != local1143) {
				local1143 = local2976;
				local1449++;
			}
		}
		this.anIntArray362 = new int[local1449 + 1];
		local1143 = -10000;
		local1449 = 0;
		for (local1164 = 0; local1164 < this.anInt5967; local1164++) {
			@Pc(3006) short local3006 = this.aShortArray75[local1164];
			if (local1143 != local3006) {
				local1143 = local3006;
				this.anIntArray362[local1449++] = local1164;
			}
		}
		this.anIntArray362[local1449] = this.anInt5967;
		Static221.aLongArray11 = null;
		this.aShortArray79 = Static84.method4992(this.aShortArray79, this.anInt5956);
		this.aShortArray81 = Static84.method4992(this.aShortArray81, this.anInt5956);
		this.aShortArray77 = Static84.method4992(this.aShortArray77, this.anInt5956);
		this.aByteArray99 = Static355.method3686(this.aByteArray99, this.anInt5956);
		this.aFloatArray30 = Static368.method5129(this.aFloatArray30, this.anInt5956);
		this.aFloatArray31 = Static368.method5129(this.aFloatArray31, this.anInt5956);
		if (arg1.anIntArray301 != null && Static272.method3770(this.anInt5974, arg2)) {
			this.anIntArrayArray51 = arg1.method3774();
		}
		if (arg1.aClass131Array1 != null && Static412.method5679(this.anInt5974, arg2)) {
			this.anIntArrayArray50 = arg1.method3775();
		}
		if (arg1.anIntArray302 != null && Static136.method2084(this.anInt5974, arg2)) {
			local743 = 0;
			@Pc(3124) int[] local3124 = new int[256];
			for (local793 = 0; local793 < this.anInt5983; local793++) {
				local807 = arg1.anIntArray302[local113[local793]];
				if (local807 >= 0) {
					if (local807 > local743) {
						local743 = local807;
					}
					@Pc(3153) int local3153 = local3124[local807]++;
				}
			}
			this.anIntArrayArray49 = new int[local743 + 1][];
			for (local807 = 0; local807 <= local743; local807++) {
				this.anIntArrayArray49[local807] = new int[local3124[local807]];
				local3124[local807] = 0;
			}
			for (local809 = 0; local809 < this.anInt5983; local809++) {
				local1225 = arg1.anIntArray302[local113[local809]];
				if (local1225 >= 0) {
					this.anIntArrayArray49[local1225][local3124[local1225]++] = local809;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5981; local7++) {
			this.lb[local7] = -this.lb[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5956; local25++) {
			this.aShortArray77[local25] = (short) -this.aShortArray77[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt5983; local44++) {
			@Pc(51) short local51 = this.aShortArray76[local44];
			this.aShortArray76[local44] = this.aShortArray84[local44];
			this.aShortArray84[local44] = local51;
		}
		if (this.aClass145_15 == null && this.aClass145_13 != null) {
			this.aClass145_13.anInterface9_4 = null;
		}
		if (this.aClass145_15 != null) {
			this.aClass145_15.anInterface9_4 = null;
		}
		this.aBoolean417 = false;
		if (this.aClass72_1 != null) {
			this.aClass72_1.anInterface13_1 = null;
		}
		if (this.aClass145_14 != null) {
			this.aClass145_14.anInterface9_4 = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILclient!n;Z)Z")
	@Override
	public boolean method4937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class11_Sub2 local8 = (Class11_Sub2) arg2;
		@Pc(12) Class11_Sub2 local12 = this.aClass167_Sub1_36.aClass11_Sub2_3;
		@Pc(33) float local33 = local12.aFloat46 + local12.aFloat37 * local8.aFloat36 + local12.aFloat42 * local8.aFloat46 + local12.aFloat44 * local8.aFloat38;
		@Pc(54) float local54 = local12.aFloat41 * local8.aFloat46 + local12.aFloat43 * local8.aFloat36 + local8.aFloat38 * local12.aFloat39 + local12.aFloat36;
		Static165.aFloat32 = local8.aFloat45 * local12.aFloat39 + local8.aFloat37 * local12.aFloat41 + local8.aFloat43 * local12.aFloat43;
		Static68.aFloat21 = local12.aFloat37 * local8.aFloat39 + local8.aFloat44 * local12.aFloat42 + local12.aFloat44 * local8.aFloat40;
		Static168.aFloat53 = local8.aFloat45 * local12.aFloat40 + local12.aFloat47 * local8.aFloat37 + local8.aFloat43 * local12.aFloat45;
		Static328.aFloat91 = local12.aFloat37 * local8.aFloat41 + local12.aFloat42 * local8.aFloat42 + local12.aFloat44 * local8.aFloat47;
		Static163.aFloat100 = local8.aFloat40 * local12.aFloat39 + local12.aFloat43 * local8.aFloat39 + local8.aFloat44 * local12.aFloat41;
		@Pc(165) float local165 = local12.aFloat38 + local8.aFloat36 * local12.aFloat45 + local8.aFloat46 * local12.aFloat47 + local12.aFloat40 * local8.aFloat38;
		Static146.aFloat48 = local8.aFloat44 * local12.aFloat47 + local8.aFloat39 * local12.aFloat45 + local8.aFloat40 * local12.aFloat40;
		Static95.aFloat30 = local8.aFloat41 * local12.aFloat45 + local8.aFloat42 * local12.aFloat47 + local8.aFloat47 * local12.aFloat40;
		Static53.aFloat11 = local8.aFloat45 * local12.aFloat44 + local8.aFloat37 * local12.aFloat42 + local12.aFloat37 * local8.aFloat43;
		Static60.aFloat16 = local8.aFloat47 * local12.aFloat39 + local12.aFloat43 * local8.aFloat41 + local8.aFloat42 * local12.aFloat41;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass167_Sub1_36.anInt4897;
		@Pc(255) int local255 = this.aClass167_Sub1_36.anInt4903;
		if (!this.aBoolean417) {
			this.method4949();
		}
		Static240.anIntArray391[0] = this.aShort77;
		Static100.anIntArray89[0] = this.aShort83;
		Static419.anIntArray453[0] = this.aShort76;
		Static240.anIntArray391[1] = this.aShort84;
		Static100.anIntArray89[1] = this.aShort83;
		Static419.anIntArray453[1] = this.aShort76;
		Static240.anIntArray391[2] = this.aShort77;
		Static100.anIntArray89[2] = this.aShort82;
		Static419.anIntArray453[2] = this.aShort76;
		Static240.anIntArray391[3] = this.aShort84;
		Static100.anIntArray89[3] = this.aShort82;
		Static419.anIntArray453[3] = this.aShort76;
		Static240.anIntArray391[4] = this.aShort77;
		Static100.anIntArray89[4] = this.aShort83;
		Static240.anIntArray391[5] = this.aShort84;
		Static419.anIntArray453[4] = this.aShort79;
		Static100.anIntArray89[5] = this.aShort83;
		Static240.anIntArray391[6] = this.aShort77;
		Static419.anIntArray453[5] = this.aShort79;
		Static100.anIntArray89[6] = this.aShort82;
		Static240.anIntArray391[7] = this.aShort84;
		Static419.anIntArray453[6] = this.aShort79;
		Static100.anIntArray89[7] = this.aShort82;
		Static419.anIntArray453[7] = this.aShort79;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(395) float local395;
		@Pc(400) float local400;
		@Pc(390) float local390;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static419.anIntArray453[local383];
			local395 = Static240.anIntArray391[local383];
			local400 = Static100.anIntArray89[local383];
			local414 = local54 + Static165.aFloat32 * local400 + Static60.aFloat16 * local395 + local390 * Static163.aFloat100;
			local428 = local165 + local390 * Static146.aFloat48 + local400 * Static168.aFloat53 + Static95.aFloat30 * local395;
			local442 = local33 + local395 * Static328.aFloat91 + Static53.aFloat11 * local400 + local390 * Static68.aFloat21;
			if (local428 >= (float) this.aClass167_Sub1_36.anInt4907) {
				@Pc(461) float local461 = (float) this.aClass167_Sub1_36.anInt4925 + (float) local251 * local442 / local428;
				if (local461 < local241) {
					local241 = local461;
				}
				@Pc(479) float local479 = (float) this.aClass167_Sub1_36.anInt4921 + (float) local255 * local414 / local428;
				if (local461 > local243) {
					local243 = local461;
				}
				if (local245 > local479) {
					local245 = local479;
				}
				local239 = true;
				if (local479 > local247) {
					local247 = local479;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && (float) arg0 < local243 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt5956 > this.aClass167_Sub1_36.anIntArray318.length) {
				this.aClass167_Sub1_36.anIntArray318 = new int[this.anInt5956];
				this.aClass167_Sub1_36.anIntArray320 = new int[this.anInt5956];
			}
			@Pc(558) int[] local558 = this.aClass167_Sub1_36.anIntArray318;
			@Pc(562) int[] local562 = this.aClass167_Sub1_36.anIntArray320;
			@Pc(638) int local638;
			for (@Pc(564) int local564 = 0; local564 < this.anInt5981; local564++) {
				local400 = this.anIntArray361[local564];
				local390 = this.lb[local564];
				local395 = this.anIntArray364[local564];
				local428 = local165 + Static146.aFloat48 * local390 + local395 * Static95.aFloat30 + Static168.aFloat53 * local400;
				local442 = Static68.aFloat21 * local390 + Static328.aFloat91 * local395 + Static53.aFloat11 * local400 + local33;
				local414 = Static60.aFloat16 * local395 + local400 * Static165.aFloat32 + Static163.aFloat100 * local390 + local54;
				@Pc(645) int local645;
				@Pc(647) int local647;
				@Pc(656) int local656;
				if (local428 >= (float) this.aClass167_Sub1_36.anInt4907) {
					local638 = (int) ((float) local251 * local442 / local428 + (float) this.aClass167_Sub1_36.anInt4925);
					local645 = (int) ((float) local255 * local414 / local428 + (float) this.aClass167_Sub1_36.anInt4921);
					local647 = this.anIntArray363[local564];
					local656 = this.anIntArray363[local564 + 1];
					for (@Pc(719) int local719 = local647; local719 < local656; local719++) {
						@Pc(728) int local728 = this.aShortArray80[local719] - 1;
						if (local728 == -1) {
							break;
						}
						local558[local728] = local638;
						local562[local728] = local645;
					}
				} else {
					local638 = this.anIntArray363[local564];
					local645 = this.anIntArray363[local564 + 1];
					for (local647 = local638; local647 < local645; local647++) {
						local656 = this.aShortArray80[local647] - 1;
						if (local656 == -1) {
							break;
						}
						local558[this.aShortArray80[local647] - 1] = -999999;
					}
				}
			}
			for (local638 = 0; local638 < this.anInt5983; local638++) {
				if (local558[this.aShortArray76[local638]] != -999999 && local558[this.aShortArray82[local638]] != -999999 && local558[this.aShortArray84[local638]] != -999999 && this.method4960(local558[this.aShortArray76[local638]], local562[this.aShortArray82[local638]], arg0, local558[this.aShortArray84[local638]], local562[this.aShortArray84[local638]], local562[this.aShortArray76[local638]], arg1, local558[this.aShortArray82[local638]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "W", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void W(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			Static210.anInt3710 = 0;
			Static232.anInt3956 = 0;
			local28 = 0;
			Static94.anInt1704 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray51.length > local38) {
					local48 = this.anIntArrayArray51[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray74 == null || (arg6 & this.aShortArray74[local56]) != 0) {
							Static232.anInt3956 += this.anIntArray364[local56];
							Static94.anInt1704 += this.anIntArray361[local56];
							local28++;
							Static210.anInt3710 += this.lb[local56];
						}
					}
				}
			}
			if (local28 <= 0) {
				Static94.anInt1704 = arg3;
				Static210.anInt3710 = arg4;
				Static232.anInt3956 = arg2;
			} else {
				Static94.anInt1704 = Static94.anInt1704 / local28 + arg3;
				Static232.anInt3956 = arg2 + Static232.anInt3956 / local28;
				Static130.aBoolean184 = true;
				Static210.anInt3710 = Static210.anInt3710 / local28 + arg4;
			}
			return;
		}
		@Pc(245) int[] local245;
		@Pc(247) int local247;
		if (arg0 == 1) {
			if (arg7 != null) {
				local28 = arg7[0] * arg2 + arg7[1] * arg3 + arg4 * arg7[2] + 16384 >> 15;
				local32 = arg7[4] * arg3 + arg7[3] * arg2 + arg7[5] * arg4 + 16384 >> 15;
				local38 = arg4 * arg7[8] + arg3 * arg7[7] + arg7[6] * arg2 + 16384 >> 15;
				arg4 = local38;
				arg2 = local28;
				arg3 = local32;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray51.length) {
					local245 = this.anIntArrayArray51[local32];
					for (local247 = 0; local247 < local245.length; local247++) {
						local50 = local245[local247];
						if (this.aShortArray74 == null || (arg6 & this.aShortArray74[local50]) != 0) {
							this.anIntArray364[local50] += arg2;
							this.anIntArray361[local50] += arg3;
							this.lb[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(379) int local379;
		@Pc(397) int local397;
		@Pc(629) int local629;
		@Pc(638) int local638;
		@Pc(651) int local651;
		@Pc(655) int local655;
		@Pc(673) int local673;
		@Pc(1012) int local1012;
		@Pc(1020) int local1020;
		@Pc(1176) int local1176;
		@Pc(1202) int local1202;
		@Pc(1207) int local1207;
		@Pc(1215) int local1215;
		@Pc(1220) int local1220;
		@Pc(1224) int local1224;
		@Pc(1228) int local1228;
		@Pc(1230) int local1230;
		@Pc(1360) int[] local1360;
		@Pc(1362) int local1362;
		@Pc(1366) int local1366;
		@Pc(1370) int local1370;
		@Pc(1372) int local1372;
		@Pc(1506) int local1506;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray51.length > local32) {
						local245 = this.anIntArrayArray51[local32];
						for (local247 = 0; local247 < local245.length; local247++) {
							local50 = local245[local247];
							if (this.aShortArray74 == null || (arg6 & this.aShortArray74[local50]) != 0) {
								this.anIntArray364[local50] -= Static232.anInt3956;
								this.anIntArray361[local50] -= Static94.anInt1704;
								this.lb[local50] -= Static210.anInt3710;
								if (arg4 != 0) {
									local56 = Class65.anIntArray88[arg4];
									local379 = Class65.anIntArray87[arg4];
									local397 = local379 * this.anIntArray364[local50] + local56 * this.anIntArray361[local50] + 32767 >> 15;
									this.anIntArray361[local50] = local379 * this.anIntArray361[local50] + 32767 - local56 * this.anIntArray364[local50] >> 15;
									this.anIntArray364[local50] = local397;
								}
								if (arg2 != 0) {
									local56 = Class65.anIntArray88[arg2];
									local379 = Class65.anIntArray87[arg2];
									local397 = local379 * this.anIntArray361[local50] + 32767 - this.lb[local50] * local56 >> 15;
									this.lb[local50] = local379 * this.lb[local50] + local56 * this.anIntArray361[local50] + 32767 >> 15;
									this.anIntArray361[local50] = local397;
								}
								if (arg3 != 0) {
									local56 = Class65.anIntArray88[arg3];
									local379 = Class65.anIntArray87[arg3];
									local397 = this.anIntArray364[local50] * local379 + this.lb[local50] * local56 + 32767 >> 15;
									this.lb[local50] = this.lb[local50] * local379 + 32767 - this.anIntArray364[local50] * local56 >> 15;
									this.anIntArray364[local50] = local397;
								}
								this.anIntArray364[local50] += Static232.anInt3956;
								this.anIntArray361[local50] += Static94.anInt1704;
								this.lb[local50] += Static210.anInt3710;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray51.length) {
							local48 = this.anIntArrayArray51[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray74 == null || (arg6 & this.aShortArray74[local56]) != 0) {
									local379 = this.anIntArray363[local56];
									local397 = this.anIntArray363[local56 + 1];
									for (local629 = local379; local629 < local397; local629++) {
										local638 = this.aShortArray80[local629] - 1;
										if (local638 == -1) {
											break;
										}
										if (arg4 != 0) {
											local651 = Class65.anIntArray88[arg4];
											local655 = Class65.anIntArray87[arg4];
											local673 = this.aShortArray79[local638] * local655 + local651 * this.aShortArray81[local638] + 32767 >> 15;
											this.aShortArray81[local638] = (short) (local655 * this.aShortArray81[local638] + 32767 - this.aShortArray79[local638] * local651 >> 15);
											this.aShortArray79[local638] = (short) local673;
										}
										if (arg2 != 0) {
											local651 = Class65.anIntArray88[arg2];
											local655 = Class65.anIntArray87[arg2];
											local673 = local655 * this.aShortArray81[local638] + 32767 - local651 * this.aShortArray77[local638] >> 15;
											this.aShortArray77[local638] = (short) (local651 * this.aShortArray81[local638] + local655 * this.aShortArray77[local638] + 32767 >> 15);
											this.aShortArray81[local638] = (short) local673;
										}
										if (arg3 != 0) {
											local651 = Class65.anIntArray88[arg3];
											local655 = Class65.anIntArray87[arg3];
											local673 = local651 * this.aShortArray77[local638] + this.aShortArray79[local638] * local655 + 32767 >> 15;
											this.aShortArray77[local638] = (short) (this.aShortArray77[local638] * local655 + 32767 - local651 * this.aShortArray79[local638] >> 15);
											this.aShortArray79[local638] = (short) local673;
										}
									}
								}
							}
						}
					}
					if (this.aClass145_15 == null && this.aClass145_13 != null) {
						this.aClass145_13.anInterface9_4 = null;
					}
					if (this.aClass145_15 != null) {
						this.aClass145_15.anInterface9_4 = null;
						return;
					}
				}
			} else {
				local28 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local247 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static130.aBoolean184) {
					local379 = arg7[3] * Static94.anInt1704 + arg7[0] * Static232.anInt3956 + Static210.anInt3710 * arg7[6] + 16384 >> 15;
					local397 = arg7[1] * Static232.anInt3956 + arg7[4] * Static94.anInt1704 + Static210.anInt3710 * arg7[7] + 16384 >> 15;
					local379 += local247;
					local629 = Static94.anInt1704 * arg7[5] + arg7[2] * Static232.anInt3956 + arg7[8] * Static210.anInt3710 + 16384 >> 15;
					local397 += local50;
					Static94.anInt1704 = local397;
					Static232.anInt3956 = local379;
					local629 += local56;
					Static130.aBoolean184 = false;
					Static210.anInt3710 = local629;
				}
				@Pc(980) int[] local980 = new int[9];
				local397 = Class65.anIntArray87[arg2];
				local629 = Class65.anIntArray88[arg2];
				local638 = Class65.anIntArray87[arg3];
				local651 = Class65.anIntArray88[arg3];
				local655 = Class65.anIntArray87[arg4];
				local673 = Class65.anIntArray88[arg4];
				local1012 = local655 * local629 + 16384 >> 15;
				local1020 = local673 * local629 + 16384 >> 15;
				local980[8] = local638 * local397 + 16384 >> 15;
				local980[5] = -local629;
				local980[0] = local651 * local1020 + local655 * local638 + 16384 >> 15;
				local980[1] = local1012 * local651 + local673 * -local638 + 16384 >> 15;
				local980[3] = local397 * local673 + 16384 >> 15;
				local980[7] = local651 * local673 + local638 * local1012 + 16384 >> 15;
				local980[2] = local651 * local397 + 16384 >> 15;
				local980[6] = local655 * -local651 + local638 * local1020 + 16384 >> 15;
				local980[4] = local397 * local655 + 16384 >> 15;
				@Pc(1150) int local1150 = -Static210.anInt3710 * local980[2] + -Static94.anInt1704 * local980[1] + local980[0] * -Static232.anInt3956 + 16384 >> 15;
				local1176 = local980[5] * -Static210.anInt3710 + -Static232.anInt3956 * local980[3] + local980[4] * -Static94.anInt1704 + 16384 >> 15;
				local1202 = -Static210.anInt3710 * local980[8] + local980[6] * -Static232.anInt3956 + local980[7] * -Static94.anInt1704 + 16384 >> 15;
				local1207 = local1150 + Static232.anInt3956;
				@Pc(1211) int local1211 = Static94.anInt1704 + local1176;
				local1215 = Static210.anInt3710 + local1202;
				@Pc(1218) int[] local1218 = new int[9];
				for (local1220 = 0; local1220 < 3; local1220++) {
					for (local1224 = 0; local1224 < 3; local1224++) {
						local1228 = 0;
						for (local1230 = 0; local1230 < 3; local1230++) {
							local1228 += local980[local1230 + local1220 * 3] * arg7[local1224 * 3 + local1230];
						}
						local1218[local1224 + local1220 * 3] = local1228 + 16384 >> 15;
					}
				}
				local1224 = local56 * local980[2] + local980[0] * local247 + local980[1] * local50 + 16384 >> 15;
				local1228 = local56 * local980[5] + local980[4] * local50 + local247 * local980[3] + 16384 >> 15;
				local1230 = local56 * local980[8] + local980[7] * local50 + local247 * local980[6] + 16384 >> 15;
				local1228 += local1211;
				local1224 += local1207;
				local1230 += local1215;
				local1360 = new int[9];
				for (local1362 = 0; local1362 < 3; local1362++) {
					for (local1366 = 0; local1366 < 3; local1366++) {
						local1370 = 0;
						for (local1372 = 0; local1372 < 3; local1372++) {
							local1370 += local1218[local1366 + local1372 * 3] * arg7[local1372 + local1362 * 3];
						}
						local1360[local1366 + local1362 * 3] = local1370 + 16384 >> 15;
					}
				}
				local1366 = arg7[2] * local1230 + local1228 * arg7[1] + local1224 * arg7[0] + 16384 >> 15;
				local1370 = local1224 * arg7[3] + arg7[4] * local1228 + arg7[5] * local1230 + 16384 >> 15;
				local1372 = local1230 * arg7[8] + arg7[6] * local1224 + local1228 * arg7[7] + 16384 >> 15;
				local1370 += local32;
				local1366 += local28;
				local1372 += local38;
				for (local1506 = 0; local1506 < local8; local1506++) {
					@Pc(1512) int local1512 = arg1[local1506];
					if (local1512 < this.anIntArrayArray51.length) {
						@Pc(1526) int[] local1526 = this.anIntArrayArray51[local1512];
						for (@Pc(1528) int local1528 = 0; local1528 < local1526.length; local1528++) {
							@Pc(1534) int local1534 = local1526[local1528];
							if (this.aShortArray74 == null || (this.aShortArray74[local1534] & arg6) != 0) {
								@Pc(1579) int local1579 = local1360[1] * this.anIntArray361[local1534] + this.anIntArray364[local1534] * local1360[0] + this.lb[local1534] * local1360[2] + 16384 >> 15;
								@Pc(1610) int local1610 = local1360[3] * this.anIntArray364[local1534] + this.anIntArray361[local1534] * local1360[4] + local1360[5] * this.lb[local1534] + 16384 >> 15;
								@Pc(1614) int local1614 = local1610 + local1370;
								@Pc(1618) int local1618 = local1579 + local1366;
								@Pc(1650) int local1650 = this.anIntArray364[local1534] * local1360[6] + local1360[7] * this.anIntArray361[local1534] + local1360[8] * this.lb[local1534] + 16384 >> 15;
								this.anIntArray364[local1534] = local1618;
								@Pc(1659) int local1659 = local1650 + local1372;
								this.anIntArray361[local1534] = local1614;
								this.lb[local1534] = local1659;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2588) Class24 local2588;
			@Pc(2593) Class229 local2593;
			if (arg0 == 5) {
				if (this.anIntArrayArray49 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray49.length > local32) {
							local245 = this.anIntArrayArray49[local32];
							for (local247 = 0; local247 < local245.length; local247++) {
								local50 = local245[local247];
								if (this.aShortArray83 == null || (arg6 & this.aShortArray83[local50]) != 0) {
									local56 = arg2 * 8 + (this.aByteArray98[local50] & 0xFF);
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray98[local50] = (byte) local56;
									if (this.aClass145_13 != null) {
										this.aClass145_13.anInterface9_4 = null;
									}
								}
							}
						}
					}
					if (this.aClass24Array1 != null) {
						for (local32 = 0; local32 < this.anInt5980; local32++) {
							local2588 = this.aClass24Array1[local32];
							local2593 = this.aClass229Array1[local32];
							local2593.anInt6433 = 255 - (this.aByteArray98[local2588.anInt600] & 0xFF) << 24 | local2593.anInt6433 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2853) Class229 local2853;
				if (arg0 == 8) {
					if (this.anIntArrayArray50 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray50.length) {
								local245 = this.anIntArrayArray50[local32];
								for (local247 = 0; local247 < local245.length; local247++) {
									local2853 = this.aClass229Array1[local245[local247]];
									local2853.anInt6434 += arg3;
									local2853.anInt6431 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray50 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray50.length > local32) {
								local245 = this.anIntArrayArray50[local32];
								for (local247 = 0; local247 < local245.length; local247++) {
									local2853 = this.aClass229Array1[local245[local247]];
									local2853.anInt6432 = local2853.anInt6432 * arg3 >> 7;
									local2853.anInt6429 = local2853.anInt6429 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray50 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray50.length > local32) {
							local245 = this.anIntArrayArray50[local32];
							for (local247 = 0; local247 < local245.length; local247++) {
								local2853 = this.aClass229Array1[local245[local247]];
								local2853.anInt6428 = arg2 + local2853.anInt6428 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray49 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray49.length > local32) {
						local245 = this.anIntArrayArray49[local32];
						for (local247 = 0; local247 < local245.length; local247++) {
							local50 = local245[local247];
							if (this.aShortArray83 == null || (this.aShortArray83[local50] & arg6) != 0) {
								local56 = this.aShortArray78[local50] & 0xFFFF;
								local379 = local56 >> 10 & 0x3F;
								local397 = local56 >> 7 & 0x7;
								@Pc(2697) int local2697 = arg2 + local379 & 0x3F;
								local629 = local56 & 0x7F;
								local397 += arg3 / 4;
								if (local397 < 0) {
									local397 = 0;
								} else if (local397 > 7) {
									local397 = 7;
								}
								local629 += arg4;
								if (local629 < 0) {
									local629 = 0;
								} else if (local629 > 127) {
									local629 = 127;
								}
								this.aShortArray78[local50] = (short) (local629 | local397 << 7 | local2697 << 10);
								if (this.aClass145_13 != null) {
									this.aClass145_13.anInterface9_4 = null;
								}
							}
						}
					}
				}
				if (this.aClass24Array1 != null) {
					for (local32 = 0; local32 < this.anInt5980; local32++) {
						local2588 = this.aClass24Array1[local32];
						local2593 = this.aClass229Array1[local32];
						local2593.anInt6433 = Static329.anIntArray346[this.aShortArray78[local2588.anInt600] & 0xFFFF] & 0xFFFFFF | local2593.anInt6433 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray51.length) {
					local245 = this.anIntArrayArray51[local32];
					for (local247 = 0; local247 < local245.length; local247++) {
						local50 = local245[local247];
						if (this.aShortArray74 == null || (this.aShortArray74[local50] & arg6) != 0) {
							this.anIntArray364[local50] -= Static232.anInt3956;
							this.anIntArray361[local50] -= Static94.anInt1704;
							this.lb[local50] -= Static210.anInt3710;
							this.anIntArray364[local50] = this.anIntArray364[local50] * arg2 >> 7;
							this.anIntArray361[local50] = arg3 * this.anIntArray361[local50] >> 7;
							this.lb[local50] = this.lb[local50] * arg4 >> 7;
							this.anIntArray364[local50] += Static232.anInt3956;
							this.anIntArray361[local50] += Static94.anInt1704;
							this.lb[local50] += Static210.anInt3710;
						}
					}
				}
			}
		} else {
			local28 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local247 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static130.aBoolean184) {
				local379 = arg7[0] * Static232.anInt3956 + arg7[3] * Static94.anInt1704 + Static210.anInt3710 * arg7[6] + 16384 >> 15;
				local397 = arg7[7] * Static210.anInt3710 + Static94.anInt1704 * arg7[4] + Static232.anInt3956 * arg7[1] + 16384 >> 15;
				local629 = Static94.anInt1704 * arg7[5] + arg7[2] * Static232.anInt3956 + arg7[8] * Static210.anInt3710 + 16384 >> 15;
				local397 += local50;
				local379 += local247;
				local629 += local56;
				Static232.anInt3956 = local379;
				Static94.anInt1704 = local397;
				Static130.aBoolean184 = false;
				Static210.anInt3710 = local629;
			}
			local379 = arg2 << 15 >> 7;
			local397 = arg3 << 15 >> 7;
			local629 = arg4 << 15 >> 7;
			local638 = -Static232.anInt3956 * local379 + 16384 >> 15;
			local651 = local397 * -Static94.anInt1704 + 16384 >> 15;
			local655 = -Static210.anInt3710 * local629 + 16384 >> 15;
			local673 = local638 + Static232.anInt3956;
			local1012 = Static94.anInt1704 + local651;
			local1020 = local655 + Static210.anInt3710;
			@Pc(1881) int[] local1881 = new int[] { local379 * arg7[0] + 16384 >> 15, local379 * arg7[3] + 16384 >> 15, arg7[6] * local379 + 16384 >> 15, local397 * arg7[1] + 16384 >> 15, local397 * arg7[4] + 16384 >> 15, local397 * arg7[7] + 16384 >> 15, local629 * arg7[2] + 16384 >> 15, local629 * arg7[5] + 16384 >> 15, arg7[8] * local629 + 16384 >> 15 };
			local1176 = local379 * local247 + 16384 >> 15;
			local1202 = local397 * local50 + 16384 >> 15;
			@Pc(2009) int local2009 = local1176 + local673;
			local1207 = local56 * local629 + 16384 >> 15;
			@Pc(2021) int local2021 = local1202 + local1012;
			@Pc(2025) int local2025 = local1207 + local1020;
			@Pc(2028) int[] local2028 = new int[9];
			@Pc(2034) int local2034;
			for (local1215 = 0; local1215 < 3; local1215++) {
				for (local2034 = 0; local2034 < 3; local2034++) {
					local1220 = 0;
					for (local1224 = 0; local1224 < 3; local1224++) {
						local1220 += local1881[local2034 + local1224 * 3] * arg7[local1215 * 3 + local1224];
					}
					local2028[local2034 + local1215 * 3] = local1220 + 16384 >> 15;
				}
			}
			local2034 = local2009 * arg7[0] + arg7[1] * local2021 + arg7[2] * local2025 + 16384 >> 15;
			local1220 = arg7[3] * local2009 + arg7[4] * local2021 + arg7[5] * local2025 + 16384 >> 15;
			local2034 += local28;
			local1224 = arg7[6] * local2009 + arg7[7] * local2021 + arg7[8] * local2025 + 16384 >> 15;
			local1220 += local32;
			local1224 += local38;
			for (local1228 = 0; local1228 < local8; local1228++) {
				local1230 = arg1[local1228];
				if (local1230 < this.anIntArrayArray51.length) {
					local1360 = this.anIntArrayArray51[local1230];
					for (local1362 = 0; local1362 < local1360.length; local1362++) {
						local1366 = local1360[local1362];
						if (this.aShortArray74 == null || (this.aShortArray74[local1366] & arg6) != 0) {
							local1370 = local2028[1] * this.anIntArray361[local1366] + local2028[0] * this.anIntArray364[local1366] + this.lb[local1366] * local2028[2] + 16384 >> 15;
							local1372 = this.anIntArray364[local1366] * local2028[3] + this.anIntArray361[local1366] * local2028[4] + this.lb[local1366] * local2028[5] + 16384 >> 15;
							@Pc(2277) int local2277 = local1372 + local1220;
							@Pc(2281) int local2281 = local1370 + local2034;
							local1506 = local2028[6] * this.anIntArray364[local1366] + local2028[7] * this.anIntArray361[local1366] + this.lb[local1366] * local2028[8] + 16384 >> 15;
							this.anIntArray364[local1366] = local2281;
							@Pc(2323) int local2323 = local1506 + local1224;
							this.anIntArray361[local1366] = local2277;
							this.lb[local1366] = local2323;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "la", descriptor = "(IIII)V")
	@Override
	protected void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static94.anInt1704 = 0;
			Static210.anInt3710 = 0;
			Static232.anInt3956 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt5981; local17++) {
				Static232.anInt3956 += this.anIntArray364[local17];
				Static94.anInt1704 += this.anIntArray361[local17];
				Static210.anInt3710 += this.lb[local17];
				local15++;
			}
			if (local15 > 0) {
				Static210.anInt3710 = arg3 + Static210.anInt3710 / local15;
				Static232.anInt3956 = Static232.anInt3956 / local15 + arg1;
				Static94.anInt1704 = arg2 + Static94.anInt1704 / local15;
			} else {
				Static94.anInt1704 = arg2;
				Static210.anInt3710 = arg3;
				Static232.anInt3956 = arg1;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt5981; local15++) {
				this.anIntArray364[local15] += arg1;
				this.anIntArray361[local15] += arg2;
				this.lb[local15] += arg3;
			}
		} else {
			@Pc(163) int local163;
			@Pc(181) int local181;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt5981; local15++) {
					this.anIntArray364[local15] -= Static232.anInt3956;
					this.anIntArray361[local15] -= Static94.anInt1704;
					this.lb[local15] -= Static210.anInt3710;
					if (arg3 != 0) {
						local17 = Class65.anIntArray88[arg3];
						local163 = Class65.anIntArray87[arg3];
						local181 = this.anIntArray364[local15] * local163 + this.anIntArray361[local15] * local17 + 32767 >> 15;
						this.anIntArray361[local15] = local163 * this.anIntArray361[local15] + 32767 - this.anIntArray364[local15] * local17 >> 15;
						this.anIntArray364[local15] = local181;
					}
					if (arg1 != 0) {
						local17 = Class65.anIntArray88[arg1];
						local163 = Class65.anIntArray87[arg1];
						local181 = this.anIntArray361[local15] * local163 + 32767 - this.lb[local15] * local17 >> 15;
						this.lb[local15] = local163 * this.lb[local15] + local17 * this.anIntArray361[local15] + 32767 >> 15;
						this.anIntArray361[local15] = local181;
					}
					if (arg2 != 0) {
						local17 = Class65.anIntArray88[arg2];
						local163 = Class65.anIntArray87[arg2];
						local181 = this.anIntArray364[local15] * local163 + this.lb[local15] * local17 + 32767 >> 15;
						this.lb[local15] = this.lb[local15] * local163 + 32767 - local17 * this.anIntArray364[local15] >> 15;
						this.anIntArray364[local15] = local181;
					}
					this.anIntArray364[local15] += Static232.anInt3956;
					this.anIntArray361[local15] += Static94.anInt1704;
					this.lb[local15] += Static210.anInt3710;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt5981; local15++) {
					this.anIntArray364[local15] -= Static232.anInt3956;
					this.anIntArray361[local15] -= Static94.anInt1704;
					this.lb[local15] -= Static210.anInt3710;
					this.anIntArray364[local15] = arg1 * this.anIntArray364[local15] / 128;
					this.anIntArray361[local15] = this.anIntArray361[local15] * arg2 / 128;
					this.lb[local15] = arg3 * this.lb[local15] / 128;
					this.anIntArray364[local15] += Static232.anInt3956;
					this.anIntArray361[local15] += Static94.anInt1704;
					this.lb[local15] += Static210.anInt3710;
				}
			} else {
				@Pc(515) Class24 local515;
				@Pc(520) Class229 local520;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.anInt5983; local15++) {
						local17 = arg1 * 8 + (this.aByteArray98[local15] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray98[local15] = (byte) local17;
					}
					if (this.aClass145_13 != null) {
						this.aClass145_13.anInterface9_4 = null;
					}
					if (this.aClass24Array1 != null) {
						for (local17 = 0; local17 < this.anInt5980; local17++) {
							local515 = this.aClass24Array1[local17];
							local520 = this.aClass229Array1[local17];
							local520.anInt6433 = local520.anInt6433 & 0xFFFFFF | 255 - (this.aByteArray98[local515.anInt600] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.anInt5983; local15++) {
						local17 = this.aShortArray78[local15] & 0xFFFF;
						local163 = local17 >> 10 & 0x3F;
						local181 = local17 >> 7 & 0x7;
						@Pc(580) int local580 = local17 & 0x7F;
						local181 += arg2 / 4;
						@Pc(592) int local592 = arg1 + local163 & 0x3F;
						if (local181 < 0) {
							local181 = 0;
						} else if (local181 > 7) {
							local181 = 7;
						}
						local580 += arg3;
						if (local580 < 0) {
							local580 = 0;
						} else if (local580 > 127) {
							local580 = 127;
						}
						this.aShortArray78[local15] = (short) (local580 | local181 << 7 | local592 << 10);
					}
					if (this.aClass145_13 != null) {
						this.aClass145_13.anInterface9_4 = null;
					}
					if (this.aClass24Array1 != null) {
						for (local17 = 0; local17 < this.anInt5980; local17++) {
							local515 = this.aClass24Array1[local17];
							local520 = this.aClass229Array1[local17];
							local520.anInt6433 = Static329.anIntArray346[this.aShortArray78[local515.anInt600] & 0xFFFF] & 0xFFFFFF | local520.anInt6433 & 0xFF000000;
						}
					}
				} else {
					@Pc(701) Class229 local701;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt5980; local15++) {
							local701 = this.aClass229Array1[local15];
							local701.anInt6434 += arg2;
							local701.anInt6431 += arg1;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt5980; local15++) {
							local701 = this.aClass229Array1[local15];
							local701.anInt6429 = local701.anInt6429 * arg1 >> 7;
							local701.anInt6432 = local701.anInt6432 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt5980; local15++) {
							local701 = this.aClass229Array1[local15];
							local701.anInt6428 = arg1 + local701.anInt6428 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)V")
	private void method4948(@OriginalArg(0) boolean arg0) {
		if (this.aClass167_Sub1_36.aClass3_Sub25_Sub2_3.aByteArray88.length < this.anInt5967 * 6) {
			this.aClass167_Sub1_36.aClass3_Sub25_Sub2_3 = new Class3_Sub25_Sub2((this.anInt5967 + 100) * 6);
		} else {
			this.aClass167_Sub1_36.aClass3_Sub25_Sub2_3.anInt4974 = 0;
		}
		@Pc(48) Class3_Sub25_Sub2 local48 = this.aClass167_Sub1_36.aClass3_Sub25_Sub2_3;
		@Pc(54) int local54;
		if (this.aClass167_Sub1_36.aBoolean349) {
			for (local54 = 0; local54 < this.anInt5967; local54++) {
				local48.method4123(this.aShortArray76[local54]);
				local48.method4123(this.aShortArray82[local54]);
				local48.method4123(this.aShortArray84[local54]);
			}
		} else {
			for (local54 = 0; local54 < this.anInt5967; local54++) {
				local48.method4120(this.aShortArray76[local54]);
				local48.method4120(this.aShortArray82[local54]);
				local48.method4120(this.aShortArray84[local54]);
			}
		}
		if (local48.anInt4974 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface13_5 == null) {
				this.anInterface13_5 = this.aClass167_Sub1_36.method4047(true, local48.anInt4974, local48.aByteArray88);
			} else {
				this.anInterface13_5.method4215(local48.anInt4974, local48.aByteArray88);
			}
			this.aClass72_1.anInterface13_1 = this.anInterface13_5;
		} else {
			this.aClass72_1.anInterface13_1 = this.aClass167_Sub1_36.method4047(false, local48.anInt4974, local48.aByteArray88);
		}
		if (!arg0) {
			this.aBoolean416 = true;
		}
	}

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "(I)V")
	@Override
	public void E(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class65.anIntArray88[arg0];
		@Pc(13) int local13 = Class65.anIntArray87[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5981; local15++) {
			@Pc(34) int local34 = this.anIntArray361[local15] * local13 - this.lb[local15] * local9 >> 15;
			this.lb[local15] = this.lb[local15] * local13 + local9 * this.anIntArray361[local15] >> 15;
			this.anIntArray361[local15] = local34;
		}
		if (this.aClass145_14 != null) {
			this.aClass145_14.anInterface9_4 = null;
		}
		this.aBoolean417 = false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
	private void method4949() {
		@Pc(14) int local14 = 32767;
		@Pc(16) int local16 = 32767;
		@Pc(18) int local18 = 32767;
		@Pc(20) int local20 = -32768;
		@Pc(22) int local22 = -32768;
		@Pc(24) int local24 = -32768;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < this.anInt5981; local30++) {
			@Pc(37) int local37 = this.anIntArray364[local30];
			@Pc(42) int local42 = this.anIntArray361[local30];
			if (local37 > local20) {
				local20 = local37;
			}
			if (local42 < local16) {
				local16 = local42;
			}
			if (local37 < local14) {
				local14 = local37;
			}
			if (local22 < local42) {
				local22 = local42;
			}
			@Pc(79) int local79 = this.lb[local30];
			if (local79 < local18) {
				local18 = local79;
			}
			if (local24 < local79) {
				local24 = local79;
			}
			@Pc(101) int local101 = local37 * local37 + local79 * local79;
			if (local26 < local101) {
				local26 = local101;
			}
			local101 = local79 * local79 + local37 * local37 + local42 * local42;
			if (local101 > local28) {
				local28 = local101;
			}
		}
		this.aShort79 = (short) local24;
		this.aShort82 = (short) local22;
		this.aShort83 = (short) local16;
		this.aShort77 = (short) local14;
		this.aShort76 = (short) local18;
		this.aShort84 = (short) local20;
		this.aShort81 = (short) (Math.sqrt((double) local26) + 0.99D);
		Math.sqrt((double) local28);
		this.aBoolean417 = true;
	}

	@OriginalMember(owner = "client!rd", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean417) {
			this.method4949();
		}
		return this.aShort81;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLclient!gu;)V")
	private void method4950(@OriginalArg(1) Class11_Sub2 arg0) {
		@Pc(10) int local10;
		if (this.aClass141Array4 != null) {
			for (local10 = 0; local10 < this.aClass141Array4.length; local10++) {
				@Pc(17) Class141 local17 = this.aClass141Array4[local10];
				@Pc(19) Class141 local19 = local17;
				if (local17.aClass141_1 != null) {
					local19 = local17.aClass141_1;
				}
				local19.anInt4129 = (int) ((float) this.lb[local17.anInt4131] * arg0.aFloat44 + (float) this.anIntArray364[local17.anInt4131] * arg0.aFloat42 + arg0.aFloat37 * (float) this.anIntArray361[local17.anInt4131] + arg0.aFloat46);
				local19.anInt4130 = (int) ((float) this.anIntArray364[local17.anInt4131] * arg0.aFloat41 + (float) this.anIntArray361[local17.anInt4131] * arg0.aFloat43 + (float) this.lb[local17.anInt4131] * arg0.aFloat39 + arg0.aFloat36);
				local19.anInt4128 = (int) (arg0.aFloat40 * (float) this.lb[local17.anInt4131] + arg0.aFloat47 * (float) this.anIntArray364[local17.anInt4131] + arg0.aFloat45 * (float) this.anIntArray361[local17.anInt4131] + arg0.aFloat38);
				local19.anInt4139 = (int) (arg0.aFloat42 * (float) this.anIntArray364[local17.anInt4126] + arg0.aFloat37 * (float) this.anIntArray361[local17.anInt4126] + arg0.aFloat44 * (float) this.lb[local17.anInt4126] + arg0.aFloat46);
				local19.anInt4123 = (int) ((float) this.lb[local17.anInt4126] * arg0.aFloat39 + (float) this.anIntArray364[local17.anInt4126] * arg0.aFloat41 + (float) this.anIntArray361[local17.anInt4126] * arg0.aFloat43 + arg0.aFloat36);
				local19.anInt4138 = (int) (arg0.aFloat45 * (float) this.anIntArray361[local17.anInt4126] + (float) this.anIntArray364[local17.anInt4126] * arg0.aFloat47 + arg0.aFloat40 * (float) this.lb[local17.anInt4126] + arg0.aFloat38);
				local19.anInt4135 = (int) ((float) this.lb[local17.anInt4134] * arg0.aFloat44 + (float) this.anIntArray361[local17.anInt4134] * arg0.aFloat37 + arg0.aFloat42 * (float) this.anIntArray364[local17.anInt4134] + arg0.aFloat46);
				local19.anInt4132 = (int) (arg0.aFloat36 + (float) this.anIntArray361[local17.anInt4134] * arg0.aFloat43 + arg0.aFloat41 * (float) this.anIntArray364[local17.anInt4134] + (float) this.lb[local17.anInt4134] * arg0.aFloat39);
				local19.anInt4124 = (int) (arg0.aFloat38 + (float) this.anIntArray364[local17.anInt4134] * arg0.aFloat47 + (float) this.anIntArray361[local17.anInt4134] * arg0.aFloat45 + (float) this.lb[local17.anInt4134] * arg0.aFloat40);
			}
		}
		if (this.aClass95Array4 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass95Array4.length; local10++) {
			@Pc(362) Class95 local362 = this.aClass95Array4[local10];
			@Pc(364) Class95 local364 = local362;
			if (local362.aClass95_2 != null) {
				local364 = local362.aClass95_2;
			}
			if (local362.aClass11_4 == null) {
				local362.aClass11_4 = arg0.method2905();
			} else {
				local362.aClass11_4.ya(arg0);
			}
			local364.anInt2680 = (int) ((float) this.anIntArray364[local362.anInt2684] * arg0.aFloat42 + (float) this.anIntArray361[local362.anInt2684] * arg0.aFloat37 + (float) this.lb[local362.anInt2684] * arg0.aFloat44 + arg0.aFloat46);
			local364.anInt2685 = (int) (arg0.aFloat39 * (float) this.lb[local362.anInt2684] + arg0.aFloat43 * (float) this.anIntArray361[local362.anInt2684] + (float) this.anIntArray364[local362.anInt2684] * arg0.aFloat41 + arg0.aFloat36);
			local364.anInt2681 = (int) (arg0.aFloat38 + arg0.aFloat40 * (float) this.lb[local362.anInt2684] + arg0.aFloat47 * (float) this.anIntArray364[local362.anInt2684] + arg0.aFloat45 * (float) this.anIntArray361[local362.anInt2684]);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class108 method4930(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class108_Sub2 local16;
		@Pc(12) Class108_Sub2 local12;
		if (arg0 == 1) {
			local12 = this.aClass167_Sub1_36.aClass108_Sub2_2;
			local16 = this.aClass167_Sub1_36.aClass108_Sub2_7;
		} else if (arg0 == 2) {
			local12 = this.aClass167_Sub1_36.aClass108_Sub2_6;
			local16 = this.aClass167_Sub1_36.aClass108_Sub2_4;
		} else if (arg0 == 3) {
			local12 = this.aClass167_Sub1_36.aClass108_Sub2_9;
			local16 = this.aClass167_Sub1_36.aClass108_Sub2_3;
		} else if (arg0 == 4) {
			local16 = this.aClass167_Sub1_36.aClass108_Sub2_8;
			local12 = this.aClass167_Sub1_36.aClass108_Sub2_5;
		} else if (arg0 == 5) {
			local16 = this.aClass167_Sub1_36.aClass108_Sub2_1;
			local12 = this.aClass167_Sub1_36.aClass108_Sub2_10;
		} else {
			local16 = local12 = new Class108_Sub2(this.aClass167_Sub1_36);
		}
		return this.method4951(local12, local16, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt5983; local7++) {
			local16 = this.aShortArray78[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			@Pc(46) int local46 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg2 != -1) {
				local46 += arg3 * (arg2 - local46) >> 7;
			}
			this.aShortArray78[local7] = (short) (local22 << 10 | local28 << 7 | local46);
		}
		if (this.aClass24Array1 != null) {
			for (local16 = 0; local16 < this.anInt5980; local16++) {
				@Pc(109) Class24 local109 = this.aClass24Array1[local16];
				@Pc(114) Class229 local114 = this.aClass229Array1[local16];
				local114.anInt6433 = local114.anInt6433 & 0xFF000000 | Static329.anIntArray346[this.aShortArray78[local109.anInt600] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass145_13 != null) {
			this.aClass145_13.anInterface9_4 = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "(I)V")
	@Override
	public void Q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class65.anIntArray88[arg0];
		@Pc(13) int local13 = Class65.anIntArray87[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5981; local15++) {
			local33 = this.anIntArray364[local15] * local13 + local9 * this.lb[local15] >> 15;
			this.lb[local15] = this.lb[local15] * local13 - this.anIntArray364[local15] * local9 >> 15;
			this.anIntArray364[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt5956; local33++) {
			@Pc(84) int local84 = local9 * this.aShortArray77[local33] + this.aShortArray79[local33] * local13 >> 15;
			this.aShortArray77[local33] = (short) (local13 * this.aShortArray77[local33] - this.aShortArray79[local33] * local9 >> 15);
			this.aShortArray79[local33] = (short) local84;
		}
		if (this.aClass145_15 == null && this.aClass145_13 != null) {
			this.aClass145_13.anInterface9_4 = null;
		}
		if (this.aClass145_15 != null) {
			this.aClass145_15.anInterface9_4 = null;
		}
		this.aBoolean417 = false;
		if (this.aClass145_14 != null) {
			this.aClass145_14.anInterface9_4 = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(IILclient!o;Lclient!o;III)V")
	@Override
	public void g(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class55 arg2, @OriginalArg(3) Class55 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean417) {
			this.method4949();
		}
		@Pc(16) int local16 = this.aShort77 + arg4;
		@Pc(22) int local22 = arg4 + this.aShort84;
		@Pc(27) int local27 = this.aShort76 + arg6;
		@Pc(33) int local33 = arg6 + this.aShort79;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt4614 <= local22 + arg2.anInt4610 >> arg2.anInt4615 || local27 < 0 || arg2.anInt4611 <= arg2.anInt4610 + local33 >> arg2.anInt4615)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt4610 + local22 >> arg3.anInt4615 >= arg3.anInt4614 || local27 < 0 || arg3.anInt4610 + local33 >> arg3.anInt4615 >= arg3.anInt4611) {
				return;
			}
		} else {
			local16 >>= arg2.anInt4615;
			local22 = local22 + arg2.anInt4610 - 1 >> arg2.anInt4615;
			local27 >>= arg2.anInt4615;
			local33 = arg2.anInt4610 + local33 - 1 >> arg2.anInt4615;
			if (arg5 == arg2.oa(local16, local27) && arg5 == arg2.oa(local22, local27) && arg2.oa(local16, local33) == arg5 && arg2.oa(local22, local33) == arg5) {
				return;
			}
		}
		@Pc(205) int local205;
		if (arg0 == 1) {
			for (local205 = 0; local205 < this.anInt5981; local205++) {
				this.anIntArray361[local205] = this.anIntArray361[local205] + arg2.R(this.anIntArray364[local205] - -arg4, this.lb[local205] - -arg6) - arg5;
			}
		} else {
			@Pc(213) int local213;
			@Pc(221) int local221;
			if (arg0 == 2) {
				@Pc(426) short local426 = this.aShort83;
				if (local426 == 0) {
					return;
				}
				for (local213 = 0; local213 < this.anInt5981; local213++) {
					local221 = (this.anIntArray361[local213] << 16) / local426;
					if (local221 < arg1) {
						this.anIntArray361[local213] += (arg1 - local221) * (-arg5 + arg2.R(arg4 + this.anIntArray364[local213], arg6 + this.lb[local213])) / arg1;
					}
				}
			} else {
				@Pc(229) int local229;
				if (arg0 == 3) {
					local205 = (arg1 & 0xFF) * 4;
					local213 = (arg1 >> 8 & 0xFF) * 4;
					local221 = (arg1 >> 16 & 0xFF) << 6;
					local229 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local205 >> 1) < 0 || arg2.anInt4614 << arg2.anInt4615 <= arg4 + (local205 >> 1) + arg2.anInt4610 || arg6 - (local213 >> 1) < 0 || arg6 + (local213 >> 1) + arg2.anInt4610 >= arg2.anInt4611 << arg2.anInt4615) {
						return;
					}
					this.method4941(local205, arg2, local213, local221, arg4, local229, arg6, arg5);
				} else if (arg0 == 4) {
					local205 = this.aShort82 - this.aShort83;
					for (local213 = 0; local213 < this.anInt5981; local213++) {
						this.anIntArray361[local213] -= arg5 - arg3.R(arg4 + this.anIntArray364[local213], this.lb[local213] - -arg6) - local205;
					}
				} else if (arg0 == 5) {
					local205 = this.aShort82 - this.aShort83;
					for (local213 = 0; local213 < this.anInt5981; local213++) {
						local221 = this.anIntArray364[local213] + arg4;
						local229 = arg6 + this.lb[local213];
						@Pc(381) int local381 = arg2.R(local221, local229);
						@Pc(386) int local386 = arg3.R(local221, local229);
						@Pc(391) int local391 = local381 - local386;
						this.anIntArray361[local213] = (local391 * ((this.anIntArray361[local213] << 8) / local205) >> 8) - (arg5 - local381);
					}
				}
			}
		}
		if (this.aClass145_14 != null) {
			this.aClass145_14.anInterface9_4 = null;
		}
		this.aBoolean417 = false;
	}

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "()I")
	@Override
	public int D() {
		return this.aShort80;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!rd;ILclient!rd;IZZ)Lclient!ka;")
	private Class108 method4951(@OriginalArg(0) Class108_Sub2 arg0, @OriginalArg(2) Class108_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		arg1.anInt5956 = this.anInt5956;
		arg1.anInt5967 = this.anInt5967;
		arg1.aByte74 = 0;
		arg1.anInt5980 = this.anInt5980;
		arg1.anInt5974 = this.anInt5974;
		arg1.anInt5943 = this.anInt5943;
		arg1.aShort80 = this.aShort80;
		arg1.anInt5981 = this.anInt5981;
		arg1.anInt5983 = this.anInt5983;
		arg1.aShort78 = this.aShort78;
		arg1.anInt6001 = arg2;
		@Pc(58) boolean local58 = Static222.method4448(this.anInt5974, arg2);
		@Pc(64) boolean local64 = Static420.method5754(arg2, this.anInt5974);
		@Pc(70) boolean local70 = Static432.method5866(this.anInt5974, arg2);
		@Pc(76) boolean local76 = local70 | local58 | local64;
		@Pc(191) int local191;
		if (local76) {
			if (!local58) {
				arg1.anIntArray364 = this.anIntArray364;
			} else if (arg0.anIntArray364 == null || this.anInt5943 > arg0.anIntArray364.length) {
				arg1.anIntArray364 = arg0.anIntArray364 = new int[this.anInt5943];
			} else {
				arg1.anIntArray364 = arg0.anIntArray364;
			}
			if (!local64) {
				arg1.anIntArray361 = this.anIntArray361;
			} else if (arg0.anIntArray361 == null || this.anInt5943 > arg0.anIntArray361.length) {
				arg1.anIntArray361 = arg0.anIntArray361 = new int[this.anInt5943];
			} else {
				arg1.anIntArray361 = arg0.anIntArray361;
			}
			if (!local70) {
				arg1.lb = this.lb;
			} else if (arg0.lb == null || this.anInt5943 > arg0.lb.length) {
				arg1.lb = arg0.lb = new int[this.anInt5943];
			} else {
				arg1.lb = arg0.lb;
			}
			for (local191 = 0; local191 < this.anInt5943; local191++) {
				if (local58) {
					arg1.anIntArray364[local191] = this.anIntArray364[local191];
				}
				if (local64) {
					arg1.anIntArray361[local191] = this.anIntArray361[local191];
				}
				if (local70) {
					arg1.lb[local191] = this.lb[local191];
				}
			}
		} else {
			arg1.anIntArray364 = this.anIntArray364;
			arg1.lb = this.lb;
			arg1.anIntArray361 = this.anIntArray361;
		}
		if (Static314.method4404(arg2, this.anInt5974)) {
			if (arg3) {
				arg1.aByte74 = (byte) (arg1.aByte74 | 0x1);
			}
			arg1.aClass145_14 = arg0.aClass145_14;
			arg1.aClass145_14.aByte48 = this.aClass145_14.aByte48;
			arg1.aClass145_14.anInterface9_4 = this.aClass145_14.anInterface9_4;
		} else if (Static345.method4829(arg2, this.anInt5974)) {
			arg1.aClass145_14 = this.aClass145_14;
		} else {
			arg1.aClass145_14 = null;
		}
		if (Static408.method5631(arg2, this.anInt5974)) {
			if (arg0.aShortArray78 == null || this.anInt5983 > arg0.aShortArray78.length) {
				arg1.aShortArray78 = arg0.aShortArray78 = new short[this.anInt5983];
			} else {
				arg1.aShortArray78 = arg0.aShortArray78;
			}
			for (local191 = 0; local191 < this.anInt5983; local191++) {
				arg1.aShortArray78[local191] = this.aShortArray78[local191];
			}
		} else {
			arg1.aShortArray78 = this.aShortArray78;
		}
		if (Static229.method3308(this.anInt5974, arg2)) {
			if (arg0.aByteArray98 == null || this.anInt5983 > arg0.aByteArray98.length) {
				arg1.aByteArray98 = arg0.aByteArray98 = new byte[this.anInt5983];
			} else {
				arg1.aByteArray98 = arg0.aByteArray98;
			}
			for (local191 = 0; local191 < this.anInt5983; local191++) {
				arg1.aByteArray98[local191] = this.aByteArray98[local191];
			}
		} else {
			arg1.aByteArray98 = this.aByteArray98;
		}
		if (Static5.method68(this.anInt5974, arg2)) {
			arg1.aClass145_13 = arg0.aClass145_13;
			if (arg3) {
				arg1.aByte74 = (byte) (arg1.aByte74 | 0x2);
			}
			arg1.aClass145_13.aByte48 = this.aClass145_13.aByte48;
			arg1.aClass145_13.anInterface9_4 = this.aClass145_13.anInterface9_4;
		} else if (Static225.method3255(this.anInt5974, arg2)) {
			arg1.aClass145_13 = this.aClass145_13;
		} else {
			arg1.aClass145_13 = null;
		}
		@Pc(555) int local555;
		if (Static359.method5020(this.anInt5974, arg2)) {
			if (arg0.aShortArray79 == null || this.anInt5956 > arg0.aShortArray79.length) {
				local191 = this.anInt5956;
				arg1.aShortArray81 = arg0.aShortArray81 = new short[local191];
				arg1.aShortArray77 = arg0.aShortArray77 = new short[local191];
				arg1.aShortArray79 = arg0.aShortArray79 = new short[local191];
			} else {
				arg1.aShortArray79 = arg0.aShortArray79;
				arg1.aShortArray77 = arg0.aShortArray77;
				arg1.aShortArray81 = arg0.aShortArray81;
			}
			if (this.aClass215_1 == null) {
				for (local191 = 0; local191 < this.anInt5956; local191++) {
					arg1.aShortArray79[local191] = this.aShortArray79[local191];
					arg1.aShortArray81[local191] = this.aShortArray81[local191];
					arg1.aShortArray77[local191] = this.aShortArray77[local191];
				}
			} else {
				if (arg0.aClass215_1 == null) {
					arg0.aClass215_1 = new Class215();
				}
				@Pc(543) Class215 local543 = arg1.aClass215_1 = arg0.aClass215_1;
				if (local543.aShortArray108 == null || this.anInt5956 > local543.aShortArray108.length) {
					local555 = this.anInt5956;
					local543.aShortArray107 = new short[local555];
					local543.aShortArray106 = new short[local555];
					local543.aByteArray103 = new byte[local555];
					local543.aShortArray108 = new short[local555];
				}
				for (local555 = 0; local555 < this.anInt5956; local555++) {
					arg1.aShortArray79[local555] = this.aShortArray79[local555];
					arg1.aShortArray81[local555] = this.aShortArray81[local555];
					arg1.aShortArray77[local555] = this.aShortArray77[local555];
					local543.aShortArray108[local555] = this.aClass215_1.aShortArray108[local555];
					local543.aShortArray106[local555] = this.aClass215_1.aShortArray106[local555];
					local543.aShortArray107[local555] = this.aClass215_1.aShortArray107[local555];
					local543.aByteArray103[local555] = this.aClass215_1.aByteArray103[local555];
				}
			}
			arg1.aByteArray99 = this.aByteArray99;
		} else {
			arg1.aShortArray77 = this.aShortArray77;
			arg1.aShortArray79 = this.aShortArray79;
			arg1.aShortArray81 = this.aShortArray81;
			arg1.aClass215_1 = this.aClass215_1;
			arg1.aByteArray99 = this.aByteArray99;
		}
		if (Static17.method328(this.anInt5974, arg2)) {
			if (arg3) {
				arg1.aByte74 = (byte) (arg1.aByte74 | 0x4);
			}
			arg1.aClass145_15 = arg0.aClass145_15;
			arg1.aClass145_15.anInterface9_4 = this.aClass145_15.anInterface9_4;
			arg1.aClass145_15.aByte48 = this.aClass145_15.aByte48;
		} else if (Static97.method1674(this.anInt5974, arg2)) {
			arg1.aClass145_15 = this.aClass145_15;
		} else {
			arg1.aClass145_15 = null;
		}
		if (Static240.method5191(arg2, this.anInt5974)) {
			if (arg0.aFloatArray30 == null || arg0.aFloatArray30.length < this.anInt5983) {
				local191 = this.anInt5956;
				arg1.aFloatArray31 = arg0.aFloatArray31 = new float[local191];
				arg1.aFloatArray30 = arg0.aFloatArray30 = new float[local191];
			} else {
				arg1.aFloatArray30 = arg0.aFloatArray30;
				arg1.aFloatArray31 = arg0.aFloatArray31;
			}
			for (local191 = 0; local191 < this.anInt5956; local191++) {
				arg1.aFloatArray30[local191] = this.aFloatArray30[local191];
				arg1.aFloatArray31[local191] = this.aFloatArray31[local191];
			}
		} else {
			arg1.aFloatArray30 = this.aFloatArray30;
			arg1.aFloatArray31 = this.aFloatArray31;
		}
		if (Static21.method6250(arg2, this.anInt5974)) {
			if (arg3) {
				arg1.aByte74 = (byte) (arg1.aByte74 | 0x8);
			}
			arg1.aClass145_16 = arg0.aClass145_16;
			arg1.aClass145_16.aByte48 = this.aClass145_16.aByte48;
			arg1.aClass145_16.anInterface9_4 = this.aClass145_16.anInterface9_4;
		} else if (Static138.method2124(arg2, this.anInt5974)) {
			arg1.aClass145_16 = this.aClass145_16;
		} else {
			arg1.aClass145_16 = null;
		}
		if (Static201.method3086(this.anInt5974, arg2)) {
			if (arg0.aShortArray76 == null || arg0.aShortArray76.length < this.anInt5983) {
				local191 = this.anInt5983;
				arg1.aShortArray76 = arg0.aShortArray76 = new short[local191];
				arg1.aShortArray84 = arg0.aShortArray84 = new short[local191];
				arg1.aShortArray82 = arg0.aShortArray82 = new short[local191];
			} else {
				arg1.aShortArray76 = arg0.aShortArray76;
				arg1.aShortArray84 = arg0.aShortArray84;
				arg1.aShortArray82 = arg0.aShortArray82;
			}
			for (local191 = 0; local191 < this.anInt5983; local191++) {
				arg1.aShortArray76[local191] = this.aShortArray76[local191];
				arg1.aShortArray82[local191] = this.aShortArray82[local191];
				arg1.aShortArray84[local191] = this.aShortArray84[local191];
			}
		} else {
			arg1.aShortArray76 = this.aShortArray76;
			arg1.aShortArray82 = this.aShortArray82;
			arg1.aShortArray84 = this.aShortArray84;
		}
		if (Static307.method4642(arg2, this.anInt5974)) {
			if (arg3) {
				arg1.aByte74 = (byte) (arg1.aByte74 | 0x10);
			}
			arg1.aClass72_1 = arg0.aClass72_1;
			arg1.aClass72_1.anInterface13_1 = this.aClass72_1.anInterface13_1;
		} else if (Static459.method4921(this.anInt5974, arg2)) {
			arg1.aClass72_1 = this.aClass72_1;
		} else {
			arg1.aClass72_1 = null;
		}
		if (Static67.method1249(this.anInt5974, arg2)) {
			if (arg0.aShortArray75 == null || this.anInt5983 > arg0.aShortArray75.length) {
				local191 = this.anInt5983;
				arg1.aShortArray75 = arg0.aShortArray75 = new short[local191];
			} else {
				arg1.aShortArray75 = arg0.aShortArray75;
			}
			for (local191 = 0; local191 < this.anInt5983; local191++) {
				arg1.aShortArray75[local191] = this.aShortArray75[local191];
			}
		} else {
			arg1.aShortArray75 = this.aShortArray75;
		}
		if (!Static127.method2001(arg2, this.anInt5974)) {
			arg1.aClass229Array1 = this.aClass229Array1;
		} else if (arg0.aClass229Array1 == null || this.anInt5980 > arg0.aClass229Array1.length) {
			local191 = this.anInt5980;
			arg1.aClass229Array1 = arg0.aClass229Array1 = new Class229[local191];
			for (local555 = 0; local555 < this.anInt5980; local555++) {
				arg1.aClass229Array1[local555] = this.aClass229Array1[local555].method5292();
			}
		} else {
			arg1.aClass229Array1 = arg0.aClass229Array1;
			for (local191 = 0; local191 < this.anInt5980; local191++) {
				arg1.aClass229Array1[local191].method5293(this.aClass229Array1[local191]);
			}
		}
		arg1.aClass24Array1 = this.aClass24Array1;
		arg1.anIntArrayArray51 = this.anIntArrayArray51;
		arg1.aShortArray74 = this.aShortArray74;
		arg1.anIntArrayArray49 = this.anIntArrayArray49;
		arg1.anIntArray363 = this.anIntArray363;
		arg1.anIntArray362 = this.anIntArray362;
		arg1.aClass95Array4 = this.aClass95Array4;
		arg1.anIntArrayArray50 = this.anIntArrayArray50;
		if (this.aBoolean417) {
			arg1.aShort76 = this.aShort76;
			arg1.aShort81 = this.aShort81;
			arg1.aShort82 = this.aShort82;
			arg1.aShort77 = this.aShort77;
			arg1.aShort84 = this.aShort84;
			arg1.aBoolean417 = true;
			arg1.aShort83 = this.aShort83;
			arg1.aShort79 = this.aShort79;
		} else {
			arg1.aBoolean417 = false;
		}
		arg1.aShortArray83 = this.aShortArray83;
		arg1.aShortArray80 = this.aShortArray80;
		arg1.aClass141Array4 = this.aClass141Array4;
		return arg1;
	}

	@OriginalMember(owner = "client!rd", name = "ja", descriptor = "()I")
	@Override
	public int ja() {
		if (!this.aBoolean417) {
			this.method4949();
		}
		return this.aShort83;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "()[Lclient!hd;")
	@Override
	public Class95[] method4940() {
		return this.aClass95Array4;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	private void method4952() {
		if (this.anInt5967 == 0) {
			return;
		}
		if (this.aByte74 != 0) {
			this.method4959(true);
		}
		this.method4959(false);
		if (this.aClass72_1 != null) {
			if (this.aClass72_1.anInterface13_1 == null) {
				this.method4948((this.aByte74 & 0x10) != 0);
			}
			if (this.aClass72_1.anInterface13_1 != null) {
				this.aClass167_Sub1_36.method3971(this.aClass145_15 != null);
				this.aClass167_Sub1_36.method4045(this.aClass145_14, this.aClass145_15, this.aClass145_16, this.aClass145_13);
				@Pc(74) int local74 = this.anIntArray362.length - 1;
				for (@Pc(76) int local76 = 0; local76 < local74; local76++) {
					@Pc(83) int local83 = this.anIntArray362[local76];
					@Pc(90) int local90 = this.anIntArray362[local76 + 1];
					@Pc(97) int local97 = this.aShortArray75[local83] & 0xFFFF;
					if (local97 == 65535) {
						local97 = -1;
					}
					this.aClass167_Sub1_36.method4038(local97, this.aClass145_15 != null);
					this.aClass167_Sub1_36.method4018(local83 * 3, (local90 - local83) * 3, this.aClass72_1.anInterface13_1);
				}
			}
		}
		this.method4955();
	}

	@OriginalMember(owner = "client!rd", name = "ha", descriptor = "()V")
	@Override
	protected void ha() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5943; local3++) {
			this.anIntArray364[local3] = this.anIntArray364[local3] + 7 >> 4;
			this.anIntArray361[local3] = this.anIntArray361[local3] + 7 >> 4;
			this.lb[local3] = this.lb[local3] + 7 >> 4;
		}
		this.aBoolean417 = false;
		if (this.aClass145_14 != null) {
			this.aClass145_14.anInterface9_4 = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!n;Lclient!st;II)V")
	@Override
	public void method4933(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class23_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5956 == 0) {
			return;
		}
		@Pc(16) Class11_Sub2 local16 = this.aClass167_Sub1_36.aClass11_Sub2_3;
		@Pc(19) Class11_Sub2 local19 = (Class11_Sub2) arg0;
		if (!this.aBoolean417) {
			this.method4949();
		}
		Static302.aFloat86 = local16.aFloat38 + local19.aFloat36 * local16.aFloat45 + local19.aFloat46 * local16.aFloat47 + local19.aFloat38 * local16.aFloat40;
		Static168.aFloat53 = local19.aFloat45 * local16.aFloat40 + local19.aFloat43 * local16.aFloat45 + local16.aFloat47 * local19.aFloat37;
		@Pc(72) float local72 = Static168.aFloat53 * (float) this.aShort83 + Static302.aFloat86;
		@Pc(80) float local80 = Static168.aFloat53 * (float) this.aShort82 + Static302.aFloat86;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local80 < local72) {
			local96 = (float) this.aShort81 + local72;
			local90 = local80 - (float) this.aShort81;
		} else {
			local90 = local72 - (float) this.aShort81;
			local96 = local80 + (float) this.aShort81;
		}
		if (this.aClass167_Sub1_36.aFloat67 <= local90 || local96 <= (float) this.aClass167_Sub1_36.anInt4907) {
			return;
		}
		Static129.aFloat33 = local16.aFloat46 + local16.aFloat42 * local19.aFloat46 + local19.aFloat36 * local16.aFloat37 + local19.aFloat38 * local16.aFloat44;
		Static53.aFloat11 = local19.aFloat45 * local16.aFloat44 + local19.aFloat43 * local16.aFloat37 + local16.aFloat42 * local19.aFloat37;
		@Pc(172) float local172 = Static129.aFloat33 + (float) this.aShort83 * Static53.aFloat11;
		@Pc(180) float local180 = Static129.aFloat33 + (float) this.aShort82 * Static53.aFloat11;
		@Pc(196) float local196;
		@Pc(207) float local207;
		if (local172 > local180) {
			local207 = (local172 + (float) this.aShort81) * (float) this.aClass167_Sub1_36.anInt4897;
			local196 = (float) this.aClass167_Sub1_36.anInt4897 * ((float) -this.aShort81 + local180);
		} else {
			local196 = ((float) -this.aShort81 + local172) * (float) this.aClass167_Sub1_36.anInt4897;
			local207 = ((float) this.aShort81 + local180) * (float) this.aClass167_Sub1_36.anInt4897;
		}
		if (this.aClass167_Sub1_36.aFloat68 <= local196 / (float) arg2 || local207 / (float) arg2 <= this.aClass167_Sub1_36.aFloat73) {
			return;
		}
		Static99.aFloat31 = local16.aFloat36 + local16.aFloat39 * local19.aFloat38 + local16.aFloat43 * local19.aFloat36 + local19.aFloat46 * local16.aFloat41;
		Static165.aFloat32 = local16.aFloat41 * local19.aFloat37 + local19.aFloat43 * local16.aFloat43 + local19.aFloat45 * local16.aFloat39;
		@Pc(299) float local299 = (float) this.aShort83 * Static165.aFloat32 + Static99.aFloat31;
		@Pc(307) float local307 = Static165.aFloat32 * (float) this.aShort82 + Static99.aFloat31;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local299 > local307) {
			local322 = (local307 - (float) this.aShort81) * (float) this.aClass167_Sub1_36.anInt4903;
			local333 = (float) this.aClass167_Sub1_36.anInt4903 * (local299 + (float) this.aShort81);
		} else {
			local333 = (float) this.aClass167_Sub1_36.anInt4903 * (local307 + (float) this.aShort81);
			local322 = (float) this.aClass167_Sub1_36.anInt4903 * ((float) -this.aShort81 + local299);
		}
		if (local322 / (float) arg2 >= this.aClass167_Sub1_36.aFloat77 || local333 / (float) arg2 <= this.aClass167_Sub1_36.aFloat62) {
			return;
		}
		if (arg1 != null || this.aClass24Array1 != null) {
			Static163.aFloat100 = local19.aFloat40 * local16.aFloat39 + local19.aFloat44 * local16.aFloat41 + local16.aFloat43 * local19.aFloat39;
			Static95.aFloat30 = local16.aFloat40 * local19.aFloat47 + local19.aFloat41 * local16.aFloat45 + local19.aFloat42 * local16.aFloat47;
			Static60.aFloat16 = local16.aFloat39 * local19.aFloat47 + local16.aFloat43 * local19.aFloat41 + local16.aFloat41 * local19.aFloat42;
			Static146.aFloat48 = local19.aFloat44 * local16.aFloat47 + local19.aFloat39 * local16.aFloat45 + local16.aFloat40 * local19.aFloat40;
			Static68.aFloat21 = local19.aFloat40 * local16.aFloat44 + local16.aFloat37 * local19.aFloat39 + local16.aFloat42 * local19.aFloat44;
			Static328.aFloat91 = local19.aFloat47 * local16.aFloat44 + local19.aFloat41 * local16.aFloat37 + local16.aFloat42 * local19.aFloat42;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.aShort77 + this.aShort84 >> 1;
			@Pc(509) int local509 = this.aShort76 + this.aShort79 >> 1;
			@Pc(528) int local528 = (int) ((float) local501 * Static328.aFloat91 + Static129.aFloat33 + Static53.aFloat11 * (float) this.aShort83 + Static68.aFloat21 * (float) local509);
			@Pc(547) int local547 = (int) ((float) local509 * Static163.aFloat100 + Static99.aFloat31 + Static60.aFloat16 * (float) local501 + (float) this.aShort83 * Static165.aFloat32);
			@Pc(566) int local566 = (int) ((float) this.aShort83 * Static168.aFloat53 + Static302.aFloat86 + Static95.aFloat30 * (float) local501 + Static146.aFloat48 * (float) local509);
			@Pc(585) int local585 = (int) ((float) local509 * Static68.aFloat21 + (float) this.aShort82 * Static53.aFloat11 + Static328.aFloat91 * (float) local501 + Static129.aFloat33);
			@Pc(604) int local604 = (int) ((float) local509 * Static163.aFloat100 + Static99.aFloat31 + (float) local501 * Static60.aFloat16 + Static165.aFloat32 * (float) this.aShort82);
			arg1.anInt6474 = this.aClass167_Sub1_36.anInt4921 + local604 * this.aClass167_Sub1_36.anInt4903 / arg2;
			arg1.anInt6475 = this.aClass167_Sub1_36.anInt4925 + this.aClass167_Sub1_36.anInt4897 * local528 / arg2;
			@Pc(649) int local649 = (int) ((float) local509 * Static146.aFloat48 + Static95.aFloat30 * (float) local501 + Static302.aFloat86 + (float) this.aShort82 * Static168.aFloat53);
			arg1.anInt6476 = this.aClass167_Sub1_36.anInt4903 * local547 / arg2 + this.aClass167_Sub1_36.anInt4921;
			arg1.anInt6478 = this.aClass167_Sub1_36.anInt4925 + this.aClass167_Sub1_36.anInt4897 * local585 / arg2;
			if (local566 < this.aClass167_Sub1_36.anInt4907 && this.aClass167_Sub1_36.anInt4907 > local649) {
				arg1.anInt6477 = this.aClass167_Sub1_36.anInt4897 * (local528 + this.aShort81) / arg2 + this.aClass167_Sub1_36.anInt4925 - arg1.anInt6475;
				arg1.aBoolean442 = true;
			}
		}
		this.aClass167_Sub1_36.method4044((float) arg2);
		this.aClass167_Sub1_36.method3966();
		this.aClass167_Sub1_36.method4039(local19);
		this.method4952();
		this.aClass167_Sub1_36.method3975();
		this.method4954();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method4947(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class108_Sub2 local8 = (Class108_Sub2) arg0;
		if (this.anInt5983 == 0 || local8.anInt5983 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt5981;
		@Pc(21) int[] local21 = local8.anIntArray364;
		@Pc(24) int[] local24 = local8.anIntArray361;
		@Pc(27) int[] local27 = local8.lb;
		@Pc(30) short[] local30 = local8.aShortArray79;
		@Pc(33) short[] local33 = local8.aShortArray81;
		@Pc(36) short[] local36 = local8.aShortArray77;
		@Pc(39) byte[] local39 = local8.aByteArray99;
		@Pc(54) short[] local54;
		@Pc(58) short[] local58;
		@Pc(50) short[] local50;
		@Pc(46) byte[] local46;
		if (this.aClass215_1 == null) {
			local54 = null;
			local50 = null;
			local46 = null;
			local58 = null;
		} else {
			local46 = this.aClass215_1.aByteArray103;
			local50 = this.aClass215_1.aShortArray107;
			local54 = this.aClass215_1.aShortArray108;
			local58 = this.aClass215_1.aShortArray106;
		}
		@Pc(79) short[] local79;
		@Pc(83) short[] local83;
		@Pc(75) short[] local75;
		@Pc(87) byte[] local87;
		if (local8.aClass215_1 == null) {
			local83 = null;
			local75 = null;
			local79 = null;
			local87 = null;
		} else {
			local75 = local8.aClass215_1.aShortArray107;
			local79 = local8.aClass215_1.aShortArray108;
			local83 = local8.aClass215_1.aShortArray106;
			local87 = local8.aClass215_1.aByteArray103;
		}
		@Pc(100) int[] local100 = local8.anIntArray363;
		@Pc(103) short[] local103 = local8.aShortArray80;
		if (!local8.aBoolean417) {
			local8.method4949();
		}
		@Pc(112) short local112 = local8.aShort83;
		@Pc(115) short local115 = local8.aShort82;
		@Pc(118) short local118 = local8.aShort77;
		@Pc(121) short local121 = local8.aShort84;
		@Pc(124) short local124 = local8.aShort76;
		@Pc(127) short local127 = local8.aShort79;
		for (@Pc(129) int local129 = 0; local129 < this.anInt5981; local129++) {
			@Pc(139) int local139 = this.anIntArray361[local129] - arg2;
			if (local112 <= local139 && local139 <= local115) {
				@Pc(159) int local159 = this.anIntArray364[local129] - arg1;
				if (local118 <= local159 && local159 <= local121) {
					@Pc(182) int local182 = this.lb[local129] - arg3;
					if (local124 <= local182 && local182 <= local127) {
						@Pc(196) int local196 = -1;
						@Pc(201) int local201 = this.anIntArray363[local129];
						@Pc(208) int local208 = this.anIntArray363[local129 + 1];
						for (@Pc(210) int local210 = local201; local210 < local208; local210++) {
							local196 = this.aShortArray80[local210] - 1;
							if (local196 == -1 || this.aByteArray99[local196] != 0) {
								break;
							}
						}
						if (local196 != -1) {
							for (@Pc(243) int local243 = 0; local243 < local18; local243++) {
								if (local21[local243] == local159 && local182 == local27[local243] && local139 == local24[local243]) {
									@Pc(266) int local266 = -1;
									local208 = local100[local243 + 1];
									local201 = local100[local243];
									for (@Pc(278) int local278 = local201; local278 < local208; local278++) {
										local266 = local103[local278] - 1;
										if (local266 == -1 || local39[local266] != 0) {
											break;
										}
									}
									if (local266 != -1) {
										if (local54 == null) {
											this.aClass215_1 = new Class215();
											local54 = this.aClass215_1.aShortArray108 = Static30.method550(this.aShortArray79);
											local58 = this.aClass215_1.aShortArray106 = Static30.method550(this.aShortArray81);
											local50 = this.aClass215_1.aShortArray107 = Static30.method550(this.aShortArray77);
											local46 = this.aClass215_1.aByteArray103 = Static14.method266(this.aByteArray99);
										}
										if (local79 == null) {
											@Pc(358) Class215 local358 = local8.aClass215_1 = new Class215();
											local79 = local358.aShortArray108 = Static30.method550(local30);
											local83 = local358.aShortArray106 = Static30.method550(local33);
											local75 = local358.aShortArray107 = Static30.method550(local36);
											local87 = local358.aByteArray103 = Static14.method266(local39);
										}
										@Pc(391) short local391 = this.aShortArray79[local196];
										@Pc(396) short local396 = this.aShortArray81[local196];
										@Pc(401) short local401 = this.aShortArray77[local196];
										local208 = local100[local243 + 1];
										@Pc(412) byte local412 = this.aByteArray99[local196];
										local201 = local100[local243];
										@Pc(426) int local426;
										for (@Pc(418) int local418 = local201; local418 < local208; local418++) {
											local426 = local103[local418] - 1;
											if (local426 == -1) {
												break;
											}
											if (local87[local426] != 0) {
												local79[local426] += local391;
												local83[local426] += local396;
												local75[local426] += local401;
												local87[local426] += local412;
											}
										}
										local396 = local33[local266];
										local208 = this.anIntArray363[local129 + 1];
										local391 = local30[local266];
										local401 = local36[local266];
										local201 = this.anIntArray363[local129];
										local412 = local39[local266];
										for (local426 = local201; local426 < local208; local426++) {
											@Pc(516) int local516 = this.aShortArray80[local426] - 1;
											if (local516 == -1) {
												break;
											}
											if (local46[local516] != 0) {
												local54[local516] += local391;
												local58[local516] += local396;
												local50[local516] += local401;
												local46[local516] += local412;
											}
										}
										if (this.aClass145_15 == null && this.aClass145_13 != null) {
											this.aClass145_13.anInterface9_4 = null;
										}
										if (this.aClass145_15 != null) {
											this.aClass145_15.anInterface9_4 = null;
										}
										if (local8.aClass145_15 == null && local8.aClass145_13 != null) {
											local8.aClass145_13.anInterface9_4 = null;
										}
										if (local8.aClass145_15 != null) {
											local8.aClass145_15.anInterface9_4 = null;
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

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	private void method4954() {
		if (this.aClass24Array1 == null) {
			return;
		}
		@Pc(18) Class11_Sub2 local18 = this.aClass167_Sub1_36.aClass11_Sub2_2;
		@Pc(22) float local22 = this.aClass167_Sub1_36.s();
		@Pc(26) float local26 = this.aClass167_Sub1_36.I();
		this.aClass167_Sub1_36.method4020();
		this.aClass167_Sub1_36.method6011(false);
		this.aClass167_Sub1_36.method3971(false);
		this.aClass167_Sub1_36.method4045(this.aClass167_Sub1_36.aClass145_12, null, this.aClass167_Sub1_36.aClass145_11, null);
		for (@Pc(55) int local55 = 0; local55 < this.anInt5980; local55++) {
			@Pc(62) Class24 local62 = this.aClass24Array1[local55];
			@Pc(67) Class229 local67 = this.aClass229Array1[local55];
			if (!local62.aBoolean33 || !this.aClass167_Sub1_36.method6019()) {
				@Pc(95) float local95 = (float) (this.anIntArray364[local62.anInt595] + this.anIntArray364[local62.anInt599] + this.anIntArray364[local62.anInt596]) * 0.3333333F;
				@Pc(117) float local117 = (float) (this.anIntArray361[local62.anInt596] + this.anIntArray361[local62.anInt599] + this.anIntArray361[local62.anInt595]) * 0.3333333F;
				@Pc(138) float local138 = (float) (this.lb[local62.anInt595] + this.lb[local62.anInt596] + this.lb[local62.anInt599]) * 0.3333333F;
				@Pc(152) float local152 = local138 * Static68.aFloat21 + Static328.aFloat91 * local95 + local117 * Static53.aFloat11 + Static129.aFloat33;
				@Pc(166) float local166 = Static60.aFloat16 * local95 + Static165.aFloat32 * local117 + Static163.aFloat100 * local138 + Static99.aFloat31;
				@Pc(180) float local180 = Static302.aFloat86 + local138 * Static146.aFloat48 + Static168.aFloat53 * local117 + Static95.aFloat30 * local95;
				local18.method2181(local62.aShort11 * local67.anInt6429 >> 7, local62.aShort10 * local67.anInt6432 >> 7, (float) local67.anInt6431 + local152, local67.anInt6428, (float) local67.anInt6434 - local166, -local180);
				this.aClass167_Sub1_36.method3981(local18);
				this.aClass167_Sub1_36.PA(local26, local22 - (float) local62.anInt593 * 1.5F);
				@Pc(231) int local231 = local67.anInt6433;
				OpenGL.glColor4ub((byte) (local231 >> 16), (byte) (local231 >> 8), (byte) local231, (byte) (local231 >> 24));
				this.aClass167_Sub1_36.method3968(local62.aShort12);
				this.aClass167_Sub1_36.method4040(local62.aByte6);
				this.aClass167_Sub1_36.method3998(local62.aByte5);
				this.aClass167_Sub1_36.method3974(4);
			}
		}
		this.aClass167_Sub1_36.PA(local26, local22);
		this.aClass167_Sub1_36.method6011(true);
		this.aClass167_Sub1_36.method3975();
	}

	@OriginalMember(owner = "client!rd", name = "wa", descriptor = "()I")
	@Override
	public int wa() {
		return this.aShort78;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "()[Lclient!lq;")
	@Override
	public Class141[] method4944() {
		return this.aClass141Array4;
	}

	@OriginalMember(owner = "client!rd", name = "ia", descriptor = "()I")
	@Override
	public int ia() {
		if (!this.aBoolean417) {
			this.method4949();
		}
		return this.aShort79;
	}

	@OriginalMember(owner = "client!rd", name = "AA", descriptor = "()Z")
	@Override
	protected boolean AA() {
		if (this.anIntArrayArray51 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5943; local12++) {
			this.anIntArray364[local12] <<= 0x4;
			this.anIntArray361[local12] <<= 0x4;
			this.lb[local12] <<= 0x4;
		}
		Static232.anInt3956 = 0;
		Static94.anInt1704 = 0;
		Static210.anInt3710 = 0;
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!n;Lclient!st;I)V")
	@Override
	public void method4931(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class23_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5956 == 0) {
			return;
		}
		@Pc(16) Class11_Sub2 local16 = this.aClass167_Sub1_36.aClass11_Sub2_3;
		if (!this.aBoolean417) {
			this.method4949();
		}
		@Pc(25) Class11_Sub2 local25 = (Class11_Sub2) arg0;
		this.method4950(local25);
		Static302.aFloat86 = local16.aFloat38 + local16.aFloat47 * local25.aFloat46 + local25.aFloat36 * local16.aFloat45 + local16.aFloat40 * local25.aFloat38;
		Static168.aFloat53 = local16.aFloat45 * local25.aFloat43 + local16.aFloat47 * local25.aFloat37 + local16.aFloat40 * local25.aFloat45;
		@Pc(76) float local76 = Static302.aFloat86 + (float) this.aShort83 * Static168.aFloat53;
		@Pc(84) float local84 = Static168.aFloat53 * (float) this.aShort82 + Static302.aFloat86;
		@Pc(100) float local100;
		@Pc(94) float local94;
		if (local84 < local76) {
			local94 = local76 + (float) this.aShort81;
			local100 = local84 - (float) this.aShort81;
		} else {
			local94 = (float) this.aShort81 + local84;
			local100 = (float) -this.aShort81 + local76;
		}
		if (this.aClass167_Sub1_36.aFloat63 <= local100 || (float) this.aClass167_Sub1_36.anInt4907 >= local94) {
			return;
		}
		Static53.aFloat11 = local25.aFloat45 * local16.aFloat44 + local25.aFloat37 * local16.aFloat42 + local25.aFloat43 * local16.aFloat37;
		Static129.aFloat33 = local16.aFloat37 * local25.aFloat36 + local16.aFloat42 * local25.aFloat46 + local25.aFloat38 * local16.aFloat44 + local16.aFloat46;
		@Pc(177) float local177 = (float) this.aShort83 * Static53.aFloat11 + Static129.aFloat33;
		@Pc(185) float local185 = (float) this.aShort82 * Static53.aFloat11 + Static129.aFloat33;
		@Pc(201) float local201;
		@Pc(212) float local212;
		if (local177 > local185) {
			local201 = (float) this.aClass167_Sub1_36.anInt4897 * ((float) -this.aShort81 + local185);
			local212 = ((float) this.aShort81 + local177) * (float) this.aClass167_Sub1_36.anInt4897;
		} else {
			local201 = (float) this.aClass167_Sub1_36.anInt4897 * ((float) -this.aShort81 + local177);
			local212 = (float) this.aClass167_Sub1_36.anInt4897 * (local185 + (float) this.aShort81);
		}
		if (local201 / local94 >= this.aClass167_Sub1_36.aFloat68 || this.aClass167_Sub1_36.aFloat73 >= local212 / local94) {
			return;
		}
		Static99.aFloat31 = local16.aFloat36 + local25.aFloat38 * local16.aFloat39 + local16.aFloat43 * local25.aFloat36 + local16.aFloat41 * local25.aFloat46;
		Static165.aFloat32 = local25.aFloat37 * local16.aFloat41 + local25.aFloat43 * local16.aFloat43 + local25.aFloat45 * local16.aFloat39;
		@Pc(302) float local302 = Static165.aFloat32 * (float) this.aShort83 + Static99.aFloat31;
		@Pc(310) float local310 = Static99.aFloat31 + Static165.aFloat32 * (float) this.aShort82;
		@Pc(326) float local326;
		@Pc(337) float local337;
		if (local310 < local302) {
			local337 = (float) this.aClass167_Sub1_36.anInt4903 * (local302 + (float) this.aShort81);
			local326 = (float) this.aClass167_Sub1_36.anInt4903 * ((float) -this.aShort81 + local310);
		} else {
			local326 = (float) this.aClass167_Sub1_36.anInt4903 * ((float) -this.aShort81 + local302);
			local337 = ((float) this.aShort81 + local310) * (float) this.aClass167_Sub1_36.anInt4903;
		}
		if (this.aClass167_Sub1_36.aFloat77 <= local326 / local94 || this.aClass167_Sub1_36.aFloat62 >= local337 / local94) {
			return;
		}
		if (arg1 != null || this.aClass24Array1 != null) {
			Static60.aFloat16 = local16.aFloat39 * local25.aFloat47 + local25.aFloat42 * local16.aFloat41 + local25.aFloat41 * local16.aFloat43;
			Static68.aFloat21 = local25.aFloat40 * local16.aFloat44 + local25.aFloat39 * local16.aFloat37 + local25.aFloat44 * local16.aFloat42;
			Static146.aFloat48 = local16.aFloat40 * local25.aFloat40 + local16.aFloat47 * local25.aFloat44 + local16.aFloat45 * local25.aFloat39;
			Static163.aFloat100 = local25.aFloat40 * local16.aFloat39 + local25.aFloat39 * local16.aFloat43 + local25.aFloat44 * local16.aFloat41;
			Static328.aFloat91 = local25.aFloat47 * local16.aFloat44 + local25.aFloat41 * local16.aFloat37 + local16.aFloat42 * local25.aFloat42;
			Static95.aFloat30 = local16.aFloat40 * local25.aFloat47 + local16.aFloat47 * local25.aFloat42 + local16.aFloat45 * local25.aFloat41;
		}
		if (arg1 != null) {
			@Pc(497) boolean local497 = false;
			@Pc(499) boolean local499 = true;
			@Pc(507) int local507 = this.aShort77 + this.aShort84 >> 1;
			@Pc(515) int local515 = this.aShort79 + this.aShort76 >> 1;
			@Pc(534) int local534 = (int) (Static68.aFloat21 * (float) local515 + Static328.aFloat91 * (float) local507 + Static129.aFloat33 + (float) this.aShort83 * Static53.aFloat11);
			@Pc(553) int local553 = (int) ((float) local515 * Static163.aFloat100 + (float) this.aShort83 * Static165.aFloat32 + Static60.aFloat16 * (float) local507 + Static99.aFloat31);
			@Pc(572) int local572 = (int) (Static146.aFloat48 * (float) local515 + Static168.aFloat53 * (float) this.aShort83 + Static302.aFloat86 + (float) local507 * Static95.aFloat30);
			if (this.aClass167_Sub1_36.anInt4907 > local572) {
				local497 = true;
			} else {
				arg1.anInt6475 = this.aClass167_Sub1_36.anInt4897 * local534 / local572 + this.aClass167_Sub1_36.anInt4925;
				arg1.anInt6476 = this.aClass167_Sub1_36.anInt4921 + local553 * this.aClass167_Sub1_36.anInt4903 / local572;
			}
			@Pc(627) int local627 = (int) (Static53.aFloat11 * (float) this.aShort82 + Static129.aFloat33 + (float) local507 * Static328.aFloat91 + (float) local515 * Static68.aFloat21);
			@Pc(646) int local646 = (int) ((float) local515 * Static163.aFloat100 + Static99.aFloat31 + Static60.aFloat16 * (float) local507 + Static165.aFloat32 * (float) this.aShort82);
			@Pc(665) int local665 = (int) ((float) local507 * Static95.aFloat30 + Static302.aFloat86 + Static168.aFloat53 * (float) this.aShort82 + (float) local515 * Static146.aFloat48);
			if (this.aClass167_Sub1_36.anInt4907 > local665) {
				local497 = true;
			} else {
				arg1.anInt6474 = this.aClass167_Sub1_36.anInt4921 + local646 * this.aClass167_Sub1_36.anInt4903 / local665;
				arg1.anInt6478 = this.aClass167_Sub1_36.anInt4925 + local627 * this.aClass167_Sub1_36.anInt4897 / local665;
			}
			if (local497) {
				if (this.aClass167_Sub1_36.anInt4907 > local572 && local665 < this.aClass167_Sub1_36.anInt4907) {
					local499 = false;
				} else {
					@Pc(753) int local753;
					@Pc(764) int local764;
					@Pc(775) int local775;
					if (this.aClass167_Sub1_36.anInt4907 > local572) {
						local753 = (local665 - this.aClass167_Sub1_36.anInt4907 << 16) / (local665 - local572);
						local764 = (local753 * (local627 - local534) >> 16) + local627;
						local775 = (local753 * (local646 - local553) >> 16) + local646;
						arg1.anInt6475 = local764 * this.aClass167_Sub1_36.anInt4897 / this.aClass167_Sub1_36.anInt4907 + this.aClass167_Sub1_36.anInt4925;
						arg1.anInt6476 = this.aClass167_Sub1_36.anInt4903 * local775 / this.aClass167_Sub1_36.anInt4907 + this.aClass167_Sub1_36.anInt4921;
					} else if (local665 < this.aClass167_Sub1_36.anInt4907) {
						local753 = (local572 - this.aClass167_Sub1_36.anInt4907 << 16) / (local572 - local665);
						local764 = ((local534 - local627) * local753 >> 16) + local534;
						local775 = local553 + (local753 * (local553 - local646) >> 16);
						arg1.anInt6475 = this.aClass167_Sub1_36.anInt4925 + this.aClass167_Sub1_36.anInt4897 * local764 / this.aClass167_Sub1_36.anInt4907;
						arg1.anInt6476 = this.aClass167_Sub1_36.anInt4903 * local775 / this.aClass167_Sub1_36.anInt4907 + this.aClass167_Sub1_36.anInt4921;
					}
				}
			}
			if (local499) {
				arg1.aBoolean442 = true;
				if (local572 <= local665) {
					arg1.anInt6477 = this.aClass167_Sub1_36.anInt4897 * (local627 + this.aShort81) / local665 + this.aClass167_Sub1_36.anInt4925 - arg1.anInt6478;
				} else {
					arg1.anInt6477 = this.aClass167_Sub1_36.anInt4925 + (local534 - -this.aShort81) * this.aClass167_Sub1_36.anInt4897 / local572 - arg1.anInt6475;
				}
			}
		}
		this.aClass167_Sub1_36.method4031();
		this.aClass167_Sub1_36.method4039(local25);
		this.method4952();
		this.aClass167_Sub1_36.method3975();
		this.method4954();
	}

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean417) {
			this.method4949();
		}
		return this.aShort84;
	}

	@OriginalMember(owner = "client!rd", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean417) {
			this.method4949();
		}
		return this.aShort76;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()Z")
	@Override
	public boolean method4936() {
		if (this.aShortArray75 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray75.length; local12++) {
			if (this.aShortArray75[local12] != -1 && !this.aClass167_Sub1_36.anInterface7_8.method4420(this.aShortArray75[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "()V")
	@Override
	public void method4945() {
		if (this.anInt5956 <= 0 || this.anInt5967 <= 0) {
			return;
		}
		this.method4959(false);
		if ((this.aByte74 & 0x10) == 0 && this.aClass72_1.anInterface13_1 == null) {
			this.method4948(false);
		}
		this.method4955();
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "(SS)V")
	@Override
	public void i(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5983; local7++) {
			if (this.aShortArray78[local7] == arg0) {
				this.aShortArray78[local7] = arg1;
			}
		}
		if (this.aClass24Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt5980; local34++) {
				@Pc(41) Class24 local41 = this.aClass24Array1[local34];
				@Pc(46) Class229 local46 = this.aClass229Array1[local34];
				local46.anInt6433 = local46.anInt6433 & 0xFF000000 | Static329.anIntArray346[this.aShortArray78[local41.anInt600] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass145_13 != null) {
			this.aClass145_13.anInterface9_4 = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.anInt6001;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
	private void method4955() {
		if (!this.aBoolean416) {
			return;
		}
		this.aBoolean416 = false;
		if (this.aClass141Array4 == null && this.aClass95Array4 == null && this.aClass24Array1 == null) {
			if (this.anIntArray364 != null && !Static72.method1300(this.anInt5974, this.anInt6001)) {
				if (this.aClass145_14 != null && this.aClass145_14.anInterface9_4 == null) {
					this.aBoolean416 = true;
				} else {
					if (!this.aBoolean417) {
						this.method4949();
					}
					this.anIntArray364 = null;
				}
			}
			if (this.anIntArray361 != null && !Static356.method5849(this.anInt5974, this.anInt6001)) {
				if (this.aClass145_14 != null && this.aClass145_14.anInterface9_4 == null) {
					this.aBoolean416 = true;
				} else {
					if (!this.aBoolean417) {
						this.method4949();
					}
					this.anIntArray361 = null;
				}
			}
			if (this.lb != null && !Static154.method2395(this.anInt6001, this.anInt5974)) {
				if (this.aClass145_14 != null && this.aClass145_14.anInterface9_4 == null) {
					this.aBoolean416 = true;
				} else {
					if (!this.aBoolean417) {
						this.method4949();
					}
					this.lb = null;
				}
			}
		}
		if (this.aShortArray80 != null && this.anIntArray364 == null && this.anIntArray361 == null && this.lb == null) {
			this.aShortArray80 = null;
			this.anIntArray363 = null;
		}
		if (this.aByteArray99 != null && !Static448.method6115(this.anInt5974, this.anInt6001)) {
			if (this.aClass145_15 == null) {
				if (this.aClass145_13 != null && this.aClass145_13.anInterface9_4 == null) {
					this.aBoolean416 = true;
				} else {
					this.aShortArray79 = this.aShortArray81 = this.aShortArray77 = null;
					this.aByteArray99 = null;
				}
			} else if (this.aClass145_15.anInterface9_4 == null) {
				this.aBoolean416 = true;
			} else {
				this.aShortArray79 = this.aShortArray81 = this.aShortArray77 = null;
				this.aByteArray99 = null;
			}
		}
		if (this.aShortArray78 != null && !Static185.method2906(this.anInt6001, this.anInt5974)) {
			if (this.aClass145_13 != null && this.aClass145_13.anInterface9_4 == null) {
				this.aBoolean416 = true;
			} else {
				this.aShortArray78 = null;
			}
		}
		if (this.aByteArray98 != null && !Static462.method6276(this.anInt6001, this.anInt5974)) {
			if (this.aClass145_13 != null && this.aClass145_13.anInterface9_4 == null) {
				this.aBoolean416 = true;
			} else {
				this.aByteArray98 = null;
			}
		}
		if (this.aFloatArray30 != null && !Static285.method4131(this.anInt5974, this.anInt6001)) {
			if (this.aClass145_16 != null && this.aClass145_16.anInterface9_4 == null) {
				this.aBoolean416 = true;
			} else {
				this.aFloatArray30 = this.aFloatArray31 = null;
			}
		}
		if (this.aShortArray75 != null && !Static142.method2185(this.anInt6001, this.anInt5974)) {
			if (this.aClass145_13 != null && this.aClass145_13.anInterface9_4 == null) {
				this.aBoolean416 = true;
			} else {
				this.aShortArray75 = null;
			}
		}
		if (this.aShortArray76 != null && !Static290.method4166(this.anInt5974, this.anInt6001)) {
			if ((this.aClass72_1 == null || this.aClass72_1.anInterface13_1 != null) && (this.aClass145_13 == null || this.aClass145_13.anInterface9_4 != null)) {
				this.aShortArray76 = this.aShortArray82 = this.aShortArray84 = null;
			} else {
				this.aBoolean416 = true;
			}
		}
		if (this.anIntArrayArray49 != null && !Static136.method2084(this.anInt5974, this.anInt6001)) {
			this.anIntArrayArray49 = null;
			this.aShortArray83 = null;
		}
		if (this.anIntArrayArray51 != null && !Static272.method3770(this.anInt5974, this.anInt6001)) {
			this.anIntArrayArray51 = null;
			this.aShortArray74 = null;
		}
		if (this.anIntArrayArray50 != null && !Static412.method5679(this.anInt5974, this.anInt6001)) {
			this.anIntArrayArray50 = null;
		}
		if (this.anIntArray362 != null && (this.anInt6001 & 0x800) == 0 && (this.anInt6001 & 0x40000) == 0) {
			this.anIntArray362 = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "IA", descriptor = "(I)V")
	@Override
	public void IA(@OriginalArg(0) int arg0) {
		if (this.aClass145_13 != null) {
			this.aClass145_13.anInterface9_4 = null;
		}
		this.aShort80 = (short) arg0;
		if (this.aClass145_15 != null) {
			this.aClass145_15.anInterface9_4 = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "(I)V")
	@Override
	public void l(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class65.anIntArray88[arg0];
		@Pc(13) int local13 = Class65.anIntArray87[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5981; local15++) {
			@Pc(33) int local33 = this.anIntArray364[local15] * local13 + this.lb[local15] * local9 >> 15;
			this.lb[local15] = this.lb[local15] * local13 - this.anIntArray364[local15] * local9 >> 15;
			this.anIntArray364[local15] = local33;
		}
		if (this.aClass145_14 != null) {
			this.aClass145_14.anInterface9_4 = null;
		}
		this.aBoolean417 = false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BJFFIIIIILclient!nd;)S")
	private short method4956(@OriginalArg(1) long arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class160 arg8) {
		@Pc(10) int local10 = this.anIntArray363[arg7];
		@Pc(17) int local17 = this.anIntArray363[arg7 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray80[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg0 == Static221.aLongArray11[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray80[local19] = (short) (this.anInt5956 + 1);
		Static221.aLongArray11[local19] = arg0;
		this.aShortArray79[this.anInt5956] = (short) arg4;
		this.aShortArray81[this.anInt5956] = (short) arg5;
		this.aShortArray77[this.anInt5956] = (short) arg6;
		this.aByteArray99[this.anInt5956] = (byte) arg3;
		this.aFloatArray30[this.anInt5956] = arg1;
		this.aFloatArray31[this.anInt5956] = arg2;
		return (short) this.anInt5956++;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(SIIIB)I")
	private int method4957(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(17) int local17 = Static329.anIntArray346[Static37.method608(arg1, arg2)];
		if (arg0 != -1) {
			@Pc(29) Class105 local29 = this.aClass167_Sub1_36.anInterface7_8.method4417(arg0 & 0xFFFF);
			@Pc(34) int local34 = local29.aByte39 & 0xFF;
			@Pc(48) int local48;
			@Pc(70) int local70;
			if (local34 != 0) {
				if (arg2 < 0) {
					local48 = 0;
				} else if (arg2 <= 127) {
					local48 = arg2 * 131586;
				} else {
					local48 = 16777215;
				}
				if (local34 == 256) {
					local17 = local48;
				} else {
					local70 = 256 - local34;
					local17 = (local34 * (local48 & 0xFF00) + (local17 & 0xFF00) * local70 & 0xFF0000) + (local34 * (local48 & 0xFF00FF) + local70 * (local17 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local48 = local29.aByte36 & 0xFF;
			if (local48 != 0) {
				local48 += 256;
				@Pc(116) int local116 = local48 * (local17 >> 16 & 0xFF);
				if (local116 > 65535) {
					local116 = 65535;
				}
				local70 = (local17 >> 8 & 0xFF) * local48;
				if (local70 > 65535) {
					local70 = 65535;
				}
				@Pc(142) int local142 = (local17 & 0xFF) * local48;
				if (local142 > 65535) {
					local142 = 65535;
				}
				local17 = (local142 >> 8) + ((local116 << 8 & 0xFF00AF) + (local70 & 0xFF00));
			}
		}
		return (local17 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!rd", name = "F", descriptor = "()I")
	@Override
	public int F() {
		if (!this.aBoolean417) {
			this.method4949();
		}
		return this.aShort82;
	}

	@OriginalMember(owner = "client!rd", name = "da", descriptor = "()I")
	@Override
	public int da() {
		if (!this.aBoolean417) {
			this.method4949();
		}
		return this.aShort77;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!gf;I)V")
	private void method4958(@OriginalArg(0) Class3_Sub3_Sub9_Sub1 arg0) {
		if (this.aClass167_Sub1_36.anIntArray318.length < this.anInt5956) {
			this.aClass167_Sub1_36.anIntArray320 = new int[this.anInt5956];
			this.aClass167_Sub1_36.anIntArray318 = new int[this.anInt5956];
		}
		@Pc(28) int[] local28 = this.aClass167_Sub1_36.anIntArray318;
		@Pc(32) int[] local32 = this.aClass167_Sub1_36.anIntArray320;
		@Pc(65) int local65;
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (@Pc(38) int local38 = 0; local38 < this.anInt5981; local38++) {
			local65 = (this.anIntArray364[local38] - (this.anIntArray361[local38] * this.aClass167_Sub1_36.anInt4916 >> 8) >> this.aClass167_Sub1_36.anInt4888) - arg0.anInt2336;
			@Pc(90) int local90 = (this.lb[local38] - (this.aClass167_Sub1_36.anInt4904 * this.anIntArray361[local38] >> 8) >> this.aClass167_Sub1_36.anInt4888) - arg0.anInt2335;
			@Pc(95) int local95 = this.anIntArray363[local38];
			@Pc(102) int local102 = this.anIntArray363[local38 + 1];
			for (local104 = local95; local104 < local102; local104++) {
				local113 = this.aShortArray80[local104] - 1;
				if (local113 == -1) {
					break;
				}
				local28[local113] = local65;
				local32[local113] = local90;
			}
		}
		for (local65 = 0; local65 < this.anInt5967; local65++) {
			if (this.aByteArray98 == null || this.aByteArray98[local65] <= 128) {
				@Pc(153) short local153 = this.aShortArray76[local65];
				@Pc(158) short local158 = this.aShortArray82[local65];
				@Pc(163) short local163 = this.aShortArray84[local65];
				local104 = local28[local153];
				local113 = local28[local158];
				@Pc(175) int local175 = local28[local163];
				@Pc(179) int local179 = local32[local153];
				@Pc(183) int local183 = local32[local158];
				@Pc(187) int local187 = local32[local163];
				if ((local104 - local113) * (-local187 + local183) - (local183 - local179) * (local175 - local113) > 0) {
					arg0.method2021(local113, local179, local187, local104, local183, local175);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V")
	private void method4959(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass145_13 != null && this.aClass145_13.anInterface9_4 == null;
		@Pc(27) boolean local27 = this.aClass145_15 != null && this.aClass145_15.anInterface9_4 == null;
		@Pc(38) boolean local38 = this.aClass145_14 != null && this.aClass145_14.anInterface9_4 == null;
		@Pc(49) boolean local49 = this.aClass145_16 != null && this.aClass145_16.anInterface9_4 == null;
		if (arg0) {
			local49 &= (this.aByte74 & 0x8) != 0;
			local16 &= (this.aByte74 & 0x2) != 0;
			local27 &= (this.aByte74 & 0x4) != 0;
			local38 &= (this.aByte74 & 0x1) != 0;
		}
		@Pc(100) byte local100 = 0;
		@Pc(104) byte local104 = 0;
		@Pc(106) byte local106 = 0;
		if (local38) {
			local100 = 12;
		}
		@Pc(117) byte local117 = 0;
		if (local16) {
			local104 = local100;
			local100 = (byte) (local100 + 4);
		}
		if (local27) {
			local106 = local100;
			local100 = (byte) (local100 + 12);
		}
		if (local49) {
			local117 = local100;
			local100 = (byte) (local100 + 8);
		}
		if (local100 == 0) {
			return;
		}
		if (this.aClass167_Sub1_36.aClass3_Sub25_Sub2_3.aByteArray88.length >= local100 * this.anInt5956) {
			this.aClass167_Sub1_36.aClass3_Sub25_Sub2_3.anInt4974 = 0;
		} else {
			this.aClass167_Sub1_36.aClass3_Sub25_Sub2_3 = new Class3_Sub25_Sub2((this.anInt5956 + 100) * local100);
		}
		@Pc(185) Class3_Sub25_Sub2 local185 = this.aClass167_Sub1_36.aClass3_Sub25_Sub2_3;
		@Pc(193) int local193;
		@Pc(202) int local202;
		@Pc(230) int local230;
		@Pc(239) int local239;
		if (local38) {
			@Pc(209) int local209;
			@Pc(216) int local216;
			@Pc(221) int local221;
			@Pc(228) int local228;
			if (this.aClass167_Sub1_36.aBoolean349) {
				for (local193 = 0; local193 < this.anInt5981; local193++) {
					local202 = NativeStream.floatToRawIntBits((float) this.anIntArray364[local193]);
					local209 = NativeStream.floatToRawIntBits((float) this.anIntArray361[local193]);
					local216 = NativeStream.floatToRawIntBits((float) this.lb[local193]);
					local221 = this.anIntArray363[local193];
					local228 = this.anIntArray363[local193 + 1];
					for (local230 = local221; local230 < local228; local230++) {
						local239 = this.aShortArray80[local230] - 1;
						if (local239 == -1) {
							break;
						}
						local185.anInt4974 = local100 * local239;
						local185.method4082(local202);
						local185.method4082(local209);
						local185.method4082(local216);
					}
				}
			} else {
				for (local193 = 0; local193 < this.anInt5981; local193++) {
					local202 = NativeStream.floatToRawIntBits((float) this.anIntArray364[local193]);
					local209 = NativeStream.floatToRawIntBits((float) this.anIntArray361[local193]);
					local216 = NativeStream.floatToRawIntBits((float) this.lb[local193]);
					local221 = this.anIntArray363[local193];
					local228 = this.anIntArray363[local193 + 1];
					for (local230 = local221; local230 < local228; local230++) {
						local239 = this.aShortArray80[local230] - 1;
						if (local239 == -1) {
							break;
						}
						local185.anInt4974 = local239 * local100;
						local185.method4122(local202);
						local185.method4122(local209);
						local185.method4122(local216);
					}
				}
			}
		}
		@Pc(468) float local468;
		@Pc(379) short[] local379;
		@Pc(367) short[] local367;
		@Pc(371) short[] local371;
		@Pc(375) byte[] local375;
		@Pc(523) float local523;
		if (local16) {
			if (this.aClass145_15 == null) {
				if (this.aClass215_1 == null) {
					local367 = this.aShortArray81;
					local371 = this.aShortArray77;
					local379 = this.aShortArray79;
					local375 = this.aByteArray99;
				} else {
					local367 = this.aClass215_1.aShortArray106;
					local371 = this.aClass215_1.aShortArray107;
					local375 = this.aClass215_1.aByteArray103;
					local379 = this.aClass215_1.aShortArray108;
				}
				@Pc(399) float local399 = this.aClass167_Sub1_36.aFloatArray27[0];
				@Pc(405) float local405 = this.aClass167_Sub1_36.aFloatArray27[1];
				@Pc(411) float local411 = this.aClass167_Sub1_36.aFloatArray27[2];
				@Pc(415) float local415 = this.aClass167_Sub1_36.aFloat66;
				@Pc(425) float local425 = this.aClass167_Sub1_36.aFloat74 * 768.0F / (float) this.aShort80;
				@Pc(435) float local435 = this.aClass167_Sub1_36.aFloat65 * 768.0F / (float) this.aShort80;
				for (@Pc(437) int local437 = 0; local437 < this.anInt5983; local437++) {
					@Pc(457) int local457 = this.method4957(this.aShortArray75[local437], this.aShortArray78[local437], this.aShort78, this.aByteArray98[local437]);
					local468 = this.aClass167_Sub1_36.aFloat78 * (float) (local457 >> 16 & 0xFF);
					@Pc(479) float local479 = (float) (local457 >> 8 & 0xFF) * this.aClass167_Sub1_36.aFloat69;
					@Pc(484) short local484 = this.aShortArray76[local437];
					@Pc(493) float local493 = (float) (local457 >>> 24) * this.aClass167_Sub1_36.aFloat71;
					@Pc(498) short local498 = (short) local375[local484];
					if (local498 == 0) {
						local523 = ((float) local379[local484] * local399 + local405 * (float) local367[local484] + (float) local371[local484] * local411) * 0.0026041667F;
					} else {
						local523 = (local405 * (float) local367[local484] + (float) local379[local484] * local399 + local411 * (float) local371[local484]) / (float) (local498 * 256);
					}
					@Pc(563) float local563 = local415 + (local523 < 0.0F ? local435 : local425) * local523;
					@Pc(568) int local568 = (int) (local563 * local493);
					if (local568 < 0) {
						local568 = 0;
					} else if (local568 > 255) {
						local568 = 255;
					}
					@Pc(589) int local589 = (int) (local468 * local563);
					if (local589 < 0) {
						local589 = 0;
					} else if (local589 > 255) {
						local589 = 255;
					}
					@Pc(605) int local605 = (int) (local479 * local563);
					local185.anInt4974 = local104 + local484 * local100;
					if (local605 < 0) {
						local605 = 0;
					} else if (local605 > 255) {
						local605 = 255;
					}
					local185.method4081(local568);
					local185.method4081(local589);
					local185.method4081(local605);
					local185.method4081(255 - (this.aByteArray98[local437] & 0xFF));
					local484 = this.aShortArray82[local437];
					local498 = local375[local484];
					if (local498 == 0) {
						local523 = ((float) local379[local484] * local399 + (float) local367[local484] * local405 + local411 * (float) local371[local484]) * 0.0026041667F;
					} else {
						local523 = ((float) local371[local484] * local411 + (float) local379[local484] * local399 + (float) local367[local484] * local405) / (float) (local498 * 256);
					}
					local563 = (local523 < 0.0F ? local435 : local425) * local523 + local415;
					local568 = (int) (local493 * local563);
					local589 = (int) (local468 * local563);
					if (local568 < 0) {
						local568 = 0;
					} else if (local568 > 255) {
						local568 = 255;
					}
					if (local589 < 0) {
						local589 = 0;
					} else if (local589 > 255) {
						local589 = 255;
					}
					local605 = (int) (local479 * local563);
					local185.anInt4974 = local104 + local484 * local100;
					if (local605 < 0) {
						local605 = 0;
					} else if (local605 > 255) {
						local605 = 255;
					}
					local185.method4081(local568);
					local185.method4081(local589);
					local185.method4081(local605);
					local185.method4081(255 - (this.aByteArray98[local437] & 0xFF));
					local484 = this.aShortArray84[local437];
					local498 = local375[local484];
					if (local498 == 0) {
						local523 = ((float) local371[local484] * local411 + local399 * (float) local379[local484] + local405 * (float) local367[local484]) * 0.0026041667F;
					} else {
						local523 = ((float) local371[local484] * local411 + local405 * (float) local367[local484] + local399 * (float) local379[local484]) / (float) (local498 * 256);
					}
					local563 = local415 + (local523 < 0.0F ? local435 : local425) * local523;
					local568 = (int) (local493 * local563);
					local589 = (int) (local563 * local468);
					if (local568 < 0) {
						local568 = 0;
					} else if (local568 > 255) {
						local568 = 255;
					}
					local605 = (int) (local479 * local563);
					if (local589 < 0) {
						local589 = 0;
					} else if (local589 > 255) {
						local589 = 255;
					}
					if (local605 < 0) {
						local605 = 0;
					} else if (local605 > 255) {
						local605 = 255;
					}
					local185.anInt4974 = local484 * local100 + local104;
					local185.method4081(local568);
					local185.method4081(local589);
					local185.method4081(local605);
					local185.method4081(255 - (this.aByteArray98[local437] & 0xFF));
				}
			} else {
				for (local193 = 0; local193 < this.anInt5983; local193++) {
					local202 = this.method4957(this.aShortArray75[local193], this.aShortArray78[local193], this.aShort78, this.aByteArray98[local193]);
					local185.anInt4974 = local104 + this.aShortArray76[local193] * local100;
					local185.method4082(local202);
					local185.anInt4974 = this.aShortArray82[local193] * local100 + local104;
					local185.method4082(local202);
					local185.anInt4974 = local104 + this.aShortArray84[local193] * local100;
					local185.method4082(local202);
				}
			}
		}
		if (local27) {
			if (this.aClass215_1 == null) {
				local375 = this.aByteArray99;
				local367 = this.aShortArray81;
				local371 = this.aShortArray77;
				local379 = this.aShortArray79;
			} else {
				local379 = this.aClass215_1.aShortArray108;
				local371 = this.aClass215_1.aShortArray107;
				local375 = this.aClass215_1.aByteArray103;
				local367 = this.aClass215_1.aShortArray106;
			}
			@Pc(1099) float local1099 = 3.0F / (float) this.aShort80;
			local523 = 3.0F / (float) (this.aShort80 / 2 + this.aShort80);
			local185.anInt4974 = local106;
			if (this.aClass167_Sub1_36.aBoolean349) {
				for (local230 = 0; local230 < this.anInt5956; local230++) {
					local239 = local375[local230] & 0xFF;
					if (local239 == 0) {
						local185.method4128(local523 * (float) local379[local230]);
						local185.method4128(local523 * (float) local367[local230]);
						local185.method4128((float) local371[local230] * local523);
					} else {
						local468 = local1099 / (float) local239;
						local185.method4128(local468 * (float) local379[local230]);
						local185.method4128((float) local367[local230] * local468);
						local185.method4128((float) local371[local230] * local468);
					}
					local185.anInt4974 += local100 - 12;
				}
			} else {
				for (local230 = 0; local230 < this.anInt5956; local230++) {
					local239 = local375[local230] & 0xFF;
					if (local239 == 0) {
						local185.method4130(local523 * (float) local379[local230]);
						local185.method4130(local523 * (float) local367[local230]);
						local185.method4130((float) local371[local230] * local523);
					} else {
						local468 = local1099 / (float) local239;
						local185.method4130(local468 * (float) local379[local230]);
						local185.method4130(local468 * (float) local367[local230]);
						local185.method4130((float) local371[local230] * local468);
					}
					local185.anInt4974 += local100 - 12;
				}
			}
		}
		if (local49) {
			local185.anInt4974 = local117;
			if (this.aClass167_Sub1_36.aBoolean349) {
				for (local193 = 0; local193 < this.anInt5956; local193++) {
					local185.method4128(this.aFloatArray30[local193]);
					local185.method4128(this.aFloatArray31[local193]);
					local185.anInt4974 += local100 - 8;
				}
			} else {
				for (local193 = 0; local193 < this.anInt5956; local193++) {
					local185.method4130(this.aFloatArray30[local193]);
					local185.method4130(this.aFloatArray31[local193]);
					local185.anInt4974 += local100 - 8;
				}
			}
		}
		local185.anInt4974 = this.anInt5956 * local100;
		@Pc(1408) Interface9 local1408;
		if (arg0) {
			if (this.anInterface9_7 == null) {
				this.anInterface9_7 = this.aClass167_Sub1_36.method4001(local185.aByteArray88, local185.anInt4974, true, local100);
			} else {
				this.anInterface9_7.method2083(local100, local185.anInt4974, local185.aByteArray88);
			}
			local1408 = this.anInterface9_7;
			this.aByte74 = 0;
		} else {
			local1408 = this.aClass167_Sub1_36.method4001(local185.aByteArray88, local185.anInt4974, false, local100);
			this.aBoolean416 = true;
		}
		if (local38) {
			this.aClass145_14.anInterface9_4 = local1408;
			this.aClass145_14.aByte48 = 0;
		}
		if (local49) {
			this.aClass145_16.anInterface9_4 = local1408;
			this.aClass145_16.aByte48 = local117;
		}
		if (local16) {
			this.aClass145_13.aByte48 = local104;
			this.aClass145_13.anInterface9_4 = local1408;
		}
		if (local27) {
			this.aClass145_15.anInterface9_4 = local1408;
			this.aClass145_15.aByte48 = local106;
		}
	}

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class65.anIntArray88[arg0];
		@Pc(13) int local13 = Class65.anIntArray87[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5981; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray361[local15] + local13 * this.anIntArray364[local15] >> 15;
			this.anIntArray361[local15] = this.anIntArray361[local15] * local13 - this.anIntArray364[local15] * local9 >> 15;
			this.anIntArray364[local15] = local33;
		}
		if (this.aClass145_14 != null) {
			this.aClass145_14.anInterface9_4 = null;
		}
		this.aBoolean417 = false;
	}

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "(I)V")
	@Override
	public void q(@OriginalArg(0) int arg0) {
		this.aShort78 = (short) arg0;
		if (this.aClass145_13 != null) {
			this.aClass145_13.anInterface9_4 = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method4960(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg5 && arg1 > arg6 && arg6 < arg4) {
			return false;
		} else if (arg5 < arg6 && arg1 < arg6 && arg6 > arg4) {
			return false;
		} else if (arg0 > arg2 && arg2 < arg7 && arg3 > arg2) {
			return false;
		} else {
			return arg0 >= arg2 || arg2 <= arg7 || arg2 <= arg3;
		}
	}

	@OriginalMember(owner = "client!rd", name = "LA", descriptor = "(Lclient!ia;)Lclient!ia;")
	@Override
	public Class3_Sub3_Sub9 LA(@OriginalArg(0) Class3_Sub3_Sub9 arg0) {
		if (this.anInt5956 == 0) {
			return null;
		}
		if (!this.aBoolean417) {
			this.method4949();
		}
		@Pc(39) int local39;
		@Pc(56) int local56;
		if (this.aClass167_Sub1_36.anInt4916 <= 0) {
			local39 = this.aShort77 - (this.aShort83 * this.aClass167_Sub1_36.anInt4916 >> 8) >> this.aClass167_Sub1_36.anInt4888;
			local56 = this.aShort84 - (this.aClass167_Sub1_36.anInt4916 * this.aShort82 >> 8) >> this.aClass167_Sub1_36.anInt4888;
		} else {
			local39 = this.aShort77 - (this.aShort82 * this.aClass167_Sub1_36.anInt4916 >> 8) >> this.aClass167_Sub1_36.anInt4888;
			local56 = this.aShort84 - (this.aShort83 * this.aClass167_Sub1_36.anInt4916 >> 8) >> this.aClass167_Sub1_36.anInt4888;
		}
		@Pc(112) int local112;
		@Pc(129) int local129;
		if (this.aClass167_Sub1_36.anInt4904 <= 0) {
			local112 = this.aShort76 - (this.aClass167_Sub1_36.anInt4904 * this.aShort83 >> 8) >> this.aClass167_Sub1_36.anInt4888;
			local129 = this.aShort79 - (this.aClass167_Sub1_36.anInt4904 * this.aShort82 >> 8) >> this.aClass167_Sub1_36.anInt4888;
		} else {
			local112 = this.aShort76 - (this.aShort82 * this.aClass167_Sub1_36.anInt4904 >> 8) >> this.aClass167_Sub1_36.anInt4888;
			local129 = this.aShort79 - (this.aClass167_Sub1_36.anInt4904 * this.aShort83 >> 8) >> this.aClass167_Sub1_36.anInt4888;
		}
		@Pc(171) int local171 = local56 + 1 - local39;
		@Pc(177) int local177 = local129 + 1 - local112;
		@Pc(180) Class3_Sub3_Sub9_Sub1 local180 = (Class3_Sub3_Sub9_Sub1) arg0;
		@Pc(196) Class3_Sub3_Sub9_Sub1 local196;
		if (local180 != null && local180.method2018(local177, local171)) {
			local196 = local180;
			local180.method2020();
		} else {
			local196 = new Class3_Sub3_Sub9_Sub1(this.aClass167_Sub1_36, local171, local177);
		}
		local196.method2017(local39, local112, local56, local129);
		this.method4958(local196);
		return local196;
	}

	@OriginalMember(owner = "client!rd", name = "G", descriptor = "(SS)V")
	@Override
	public void G(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass167_Sub1_36.anInterface7_8;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5983; local11++) {
			if (arg0 == this.aShortArray75[local11]) {
				this.aShortArray75[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class105 local48 = local9.method4417(arg0 & 0xFFFF);
			local37 = local48.aByte36;
			local35 = local48.aByte39;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(68) Class105 local68 = local9.method4417(arg1 & 0xFFFF);
			local56 = local68.aByte39;
			local58 = local68.aByte36;
		}
		if (!(local58 != local37 | local35 != local56)) {
			return;
		}
		if (this.aClass24Array1 != null) {
			for (@Pc(101) int local101 = 0; local101 < this.anInt5980; local101++) {
				@Pc(108) Class24 local108 = this.aClass24Array1[local101];
				@Pc(113) Class229 local113 = this.aClass229Array1[local101];
				local113.anInt6433 = Static329.anIntArray346[this.aShortArray78[local108.anInt600] & 0xFFFF] & 0xFFFFFF | local113.anInt6433 & 0xFF000000;
			}
		}
		if (this.aClass145_13 != null) {
			this.aClass145_13.anInterface9_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "(I)V")
	@Override
	public void B(@OriginalArg(0) int arg0) {
		this.anInt6001 = arg0;
		if (this.aClass215_1 != null && (this.anInt6001 & 0x10000) == 0) {
			this.aShortArray79 = this.aClass215_1.aShortArray108;
			this.aShortArray81 = this.aClass215_1.aShortArray106;
			this.aShortArray77 = this.aClass215_1.aShortArray107;
			this.aByteArray99 = this.aClass215_1.aByteArray103;
			this.aClass215_1 = null;
		}
		this.aBoolean416 = true;
		this.method4955();
	}

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5981; local7++) {
			if (arg0 != 0) {
				this.anIntArray364[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray361[local7] += arg1;
			}
			if (arg2 != 0) {
				this.lb[local7] += arg2;
			}
		}
		if (this.aClass145_14 != null) {
			this.aClass145_14.anInterface9_4 = null;
		}
		this.aBoolean417 = false;
	}

	@OriginalMember(owner = "client!rd", name = "Z", descriptor = "(III)V")
	@Override
	public void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5981; local7++) {
			if (arg0 != 128) {
				this.anIntArray364[local7] = arg0 * this.anIntArray364[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray361[local7] = arg1 * this.anIntArray361[local7] >> 7;
			}
			if (arg2 != 128) {
				this.lb[local7] = this.lb[local7] * arg2 >> 7;
			}
		}
		this.aBoolean417 = false;
		if (this.aClass145_14 != null) {
			this.aClass145_14.anInterface9_4 = null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(22) int local22;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg4 << 4;
			local22 = arg2 << 4;
			local24 = 0;
			Static232.anInt3956 = 0;
			Static210.anInt3710 = 0;
			Static94.anInt1704 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray51.length) {
					local52 = this.anIntArrayArray51[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static232.anInt3956 += this.anIntArray364[local60];
						Static94.anInt1704 += this.anIntArray361[local60];
						Static210.anInt3710 += this.lb[local60];
						local24++;
					}
				}
			}
			if (local24 <= 0) {
				Static210.anInt3710 = local18;
				Static232.anInt3956 = local22;
				Static94.anInt1704 = local14;
			} else {
				Static210.anInt3710 = Static210.anInt3710 / local24 + local18;
				Static232.anInt3956 = Static232.anInt3956 / local24 + local22;
				Static94.anInt1704 = Static94.anInt1704 / local24 + local14;
			}
			return;
		}
		@Pc(158) int[] local158;
		@Pc(160) int local160;
		if (arg0 == 1) {
			local14 = arg3 << 4;
			local18 = arg4 << 4;
			local22 = arg2 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray51.length > local32) {
					local158 = this.anIntArrayArray51[local32];
					for (local160 = 0; local160 < local158.length; local160++) {
						local54 = local158[local160];
						this.anIntArray364[local54] += local22;
						this.anIntArray361[local54] += local14;
						this.lb[local54] += local18;
					}
				}
			}
			return;
		}
		@Pc(277) int local277;
		@Pc(296) int local296;
		@Pc(750) int local750;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray51.length > local32) {
					local158 = this.anIntArrayArray51[local32];
					if ((arg5 & 0x1) == 0) {
						for (local160 = 0; local160 < local158.length; local160++) {
							local54 = local158[local160];
							this.anIntArray364[local54] -= Static232.anInt3956;
							this.anIntArray361[local54] -= Static94.anInt1704;
							this.lb[local54] -= Static210.anInt3710;
							if (arg4 != 0) {
								local60 = Class65.anIntArray88[arg4];
								local277 = Class65.anIntArray87[arg4];
								local296 = local60 * this.anIntArray361[local54] + this.anIntArray364[local54] * local277 + 32767 >> 15;
								this.anIntArray361[local54] = this.anIntArray361[local54] * local277 + 32767 - local60 * this.anIntArray364[local54] >> 15;
								this.anIntArray364[local54] = local296;
							}
							if (arg2 != 0) {
								local60 = Class65.anIntArray88[arg2];
								local277 = Class65.anIntArray87[arg2];
								local296 = local277 * this.anIntArray361[local54] + 32767 - this.lb[local54] * local60 >> 15;
								this.lb[local54] = this.anIntArray361[local54] * local60 + this.lb[local54] * local277 + 32767 >> 15;
								this.anIntArray361[local54] = local296;
							}
							if (arg3 != 0) {
								local60 = Class65.anIntArray88[arg3];
								local277 = Class65.anIntArray87[arg3];
								local296 = local60 * this.lb[local54] + this.anIntArray364[local54] * local277 + 32767 >> 15;
								this.lb[local54] = local277 * this.lb[local54] + 32767 - local60 * this.anIntArray364[local54] >> 15;
								this.anIntArray364[local54] = local296;
							}
							this.anIntArray364[local54] += Static232.anInt3956;
							this.anIntArray361[local54] += Static94.anInt1704;
							this.lb[local54] += Static210.anInt3710;
						}
					} else {
						for (local160 = 0; local160 < local158.length; local160++) {
							local54 = local158[local160];
							this.anIntArray364[local54] -= Static232.anInt3956;
							this.anIntArray361[local54] -= Static94.anInt1704;
							this.lb[local54] -= Static210.anInt3710;
							if (arg2 != 0) {
								local60 = Class65.anIntArray88[arg2];
								local277 = Class65.anIntArray87[arg2];
								local296 = local277 * this.anIntArray361[local54] + 32767 - local60 * this.lb[local54] >> 15;
								this.lb[local54] = local60 * this.anIntArray361[local54] + local277 * this.lb[local54] + 32767 >> 15;
								this.anIntArray361[local54] = local296;
							}
							if (arg4 != 0) {
								local60 = Class65.anIntArray88[arg4];
								local277 = Class65.anIntArray87[arg4];
								local296 = local277 * this.anIntArray364[local54] + local60 * this.anIntArray361[local54] + 32767 >> 15;
								this.anIntArray361[local54] = local277 * this.anIntArray361[local54] + 32767 - this.anIntArray364[local54] * local60 >> 15;
								this.anIntArray364[local54] = local296;
							}
							if (arg3 != 0) {
								local60 = Class65.anIntArray88[arg3];
								local277 = Class65.anIntArray87[arg3];
								local296 = this.anIntArray364[local54] * local277 + this.lb[local54] * local60 + 32767 >> 15;
								this.lb[local54] = this.lb[local54] * local277 + 32767 - local60 * this.anIntArray364[local54] >> 15;
								this.anIntArray364[local54] = local296;
							}
							this.anIntArray364[local54] += Static232.anInt3956;
							this.anIntArray361[local54] += Static94.anInt1704;
							this.lb[local54] += Static210.anInt3710;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray51.length > local38) {
						local52 = this.anIntArrayArray51[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local277 = this.anIntArray363[local60];
							local296 = this.anIntArray363[local60 + 1];
							for (local750 = local277; local750 < local296; local750++) {
								@Pc(759) int local759 = this.aShortArray80[local750] - 1;
								if (local759 == -1) {
									break;
								}
								@Pc(769) int local769;
								@Pc(773) int local773;
								@Pc(791) int local791;
								if (arg4 != 0) {
									local769 = Class65.anIntArray88[arg4];
									local773 = Class65.anIntArray87[arg4];
									local791 = this.aShortArray81[local759] * local769 + this.aShortArray79[local759] * local773 + 32767 >> 15;
									this.aShortArray81[local759] = (short) (this.aShortArray81[local759] * local773 + 32767 - this.aShortArray79[local759] * local769 >> 15);
									this.aShortArray79[local759] = (short) local791;
								}
								if (arg2 != 0) {
									local769 = Class65.anIntArray88[arg2];
									local773 = Class65.anIntArray87[arg2];
									local791 = this.aShortArray81[local759] * local773 + 32767 - local769 * this.aShortArray77[local759] >> 15;
									this.aShortArray77[local759] = (short) (this.aShortArray77[local759] * local773 + local769 * this.aShortArray81[local759] + 32767 >> 15);
									this.aShortArray81[local759] = (short) local791;
								}
								if (arg3 != 0) {
									local769 = Class65.anIntArray88[arg3];
									local773 = Class65.anIntArray87[arg3];
									local791 = this.aShortArray79[local759] * local773 + local769 * this.aShortArray77[local759] + 32767 >> 15;
									this.aShortArray77[local759] = (short) (this.aShortArray77[local759] * local773 + 32767 - local769 * this.aShortArray79[local759] >> 15);
									this.aShortArray79[local759] = (short) local791;
								}
							}
						}
					}
				}
				if (this.aClass145_15 == null && this.aClass145_13 != null) {
					this.aClass145_13.anInterface9_4 = null;
				}
				if (this.aClass145_15 != null) {
					this.aClass145_15.anInterface9_4 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray51.length > local32) {
					local158 = this.anIntArrayArray51[local32];
					for (local160 = 0; local160 < local158.length; local160++) {
						local54 = local158[local160];
						this.anIntArray364[local54] -= Static232.anInt3956;
						this.anIntArray361[local54] -= Static94.anInt1704;
						this.lb[local54] -= Static210.anInt3710;
						this.anIntArray364[local54] = arg2 * this.anIntArray364[local54] >> 7;
						this.anIntArray361[local54] = this.anIntArray361[local54] * arg3 >> 7;
						this.lb[local54] = this.lb[local54] * arg4 >> 7;
						this.anIntArray364[local54] += Static232.anInt3956;
						this.anIntArray361[local54] += Static94.anInt1704;
						this.lb[local54] += Static210.anInt3710;
					}
				}
			}
		} else {
			@Pc(1220) Class24 local1220;
			@Pc(1225) Class229 local1225;
			if (arg0 == 5) {
				if (this.anIntArrayArray49 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray49.length > local32) {
							local158 = this.anIntArrayArray49[local32];
							for (local160 = 0; local160 < local158.length; local160++) {
								local54 = local158[local160];
								local60 = arg2 * 8 + (this.aByteArray98[local54] & 0xFF);
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray98[local54] = (byte) local60;
							}
							if (local158.length > 0 && this.aClass145_13 != null) {
								this.aClass145_13.anInterface9_4 = null;
							}
						}
					}
					if (this.aClass24Array1 != null) {
						for (local32 = 0; local32 < this.anInt5980; local32++) {
							local1220 = this.aClass24Array1[local32];
							local1225 = this.aClass229Array1[local32];
							local1225.anInt6433 = local1225.anInt6433 & 0xFFFFFF | 255 - (this.aByteArray98[local1220.anInt600] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1472) Class229 local1472;
				if (arg0 == 8) {
					if (this.anIntArrayArray50 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray50.length > local32) {
								local158 = this.anIntArrayArray50[local32];
								for (local160 = 0; local160 < local158.length; local160++) {
									local1472 = this.aClass229Array1[local158[local160]];
									local1472.anInt6434 += arg3;
									local1472.anInt6431 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray50 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray50.length > local32) {
								local158 = this.anIntArrayArray50[local32];
								for (local160 = 0; local160 < local158.length; local160++) {
									local1472 = this.aClass229Array1[local158[local160]];
									local1472.anInt6432 = local1472.anInt6432 * arg3 >> 7;
									local1472.anInt6429 = arg2 * local1472.anInt6429 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray50 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray50.length) {
							local158 = this.anIntArrayArray50[local32];
							for (local160 = 0; local160 < local158.length; local160++) {
								local1472 = this.aClass229Array1[local158[local160]];
								local1472.anInt6428 = local1472.anInt6428 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray49 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray49.length) {
						local158 = this.anIntArrayArray49[local32];
						for (local160 = 0; local160 < local158.length; local160++) {
							local54 = local158[local160];
							local60 = this.aShortArray78[local54] & 0xFFFF;
							local277 = local60 >> 10 & 0x3F;
							local296 = local60 >> 7 & 0x7;
							local750 = local60 & 0x7F;
							@Pc(1314) int local1314 = local277 + arg2 & 0x3F;
							local296 += arg3 / 4;
							if (local296 < 0) {
								local296 = 0;
							} else if (local296 > 7) {
								local296 = 7;
							}
							local750 += arg4;
							if (local750 < 0) {
								local750 = 0;
							} else if (local750 > 127) {
								local750 = 127;
							}
							this.aShortArray78[local54] = (short) (local750 | local296 << 7 | local1314 << 10);
						}
						if (local158.length > 0 && this.aClass145_13 != null) {
							this.aClass145_13.anInterface9_4 = null;
						}
					}
				}
				if (this.aClass24Array1 != null) {
					for (local32 = 0; local32 < this.anInt5980; local32++) {
						local1220 = this.aClass24Array1[local32];
						local1225 = this.aClass229Array1[local32];
						local1225.anInt6433 = local1225.anInt6433 & 0xFF000000 | Static329.anIntArray346[this.aShortArray78[local1220.anInt600] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}
}
