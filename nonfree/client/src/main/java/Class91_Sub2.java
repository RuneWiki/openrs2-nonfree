import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class91_Sub2 extends Class91 {

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "S")
	private short aShort45;

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!ko", name = "t", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!ko", name = "w", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
	private int anInt4019;

	@OriginalMember(owner = "client!ko", name = "E", descriptor = "[F")
	private float[] aFloatArray29;

	@OriginalMember(owner = "client!ko", name = "I", descriptor = "Lclient!rt;")
	private Interface10 anInterface10_3;

	@OriginalMember(owner = "client!ko", name = "K", descriptor = "[Lclient!hs;")
	private Class111[] aClass111Array1;

	@OriginalMember(owner = "client!ko", name = "N", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!ko", name = "P", descriptor = "S")
	private short aShort46;

	@OriginalMember(owner = "client!ko", name = "S", descriptor = "S")
	private short aShort47;

	@OriginalMember(owner = "client!ko", name = "T", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!ko", name = "ab", descriptor = "B")
	private byte aByte66;

	@OriginalMember(owner = "client!ko", name = "kb", descriptor = "Lclient!nd;")
	private Class169 aClass169_1;

	@OriginalMember(owner = "client!ko", name = "mb", descriptor = "S")
	private short aShort48;

	@OriginalMember(owner = "client!ko", name = "nb", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!ko", name = "qb", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!ko", name = "ub", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!ko", name = "vb", descriptor = "I")
	private int anInt4047;

	@OriginalMember(owner = "client!ko", name = "wb", descriptor = "Lclient!ap;")
	private Interface1 anInterface1_5;

	@OriginalMember(owner = "client!ko", name = "zb", descriptor = "[Lclient!bi;")
	private Class25[] aClass25Array1;

	@OriginalMember(owner = "client!ko", name = "Bb", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!ko", name = "Db", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!ko", name = "Gb", descriptor = "S")
	private short aShort50;

	@OriginalMember(owner = "client!ko", name = "Hb", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!ko", name = "Jb", descriptor = "S")
	private short aShort51;

	@OriginalMember(owner = "client!ko", name = "Kb", descriptor = "[I")
	private int[] anIntArray342;

	@OriginalMember(owner = "client!ko", name = "Mb", descriptor = "[F")
	private float[] aFloatArray30;

	@OriginalMember(owner = "client!ko", name = "Nb", descriptor = "[I")
	private int[] anIntArray343;

	@OriginalMember(owner = "client!ko", name = "Ob", descriptor = "[I")
	private int[] anIntArray344;

	@OriginalMember(owner = "client!ko", name = "Pb", descriptor = "S")
	private short aShort52;

	@OriginalMember(owner = "client!ko", name = "Wb", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!ko", name = "Xb", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!ko", name = "Yb", descriptor = "S")
	private short aShort53;

	@OriginalMember(owner = "client!ko", name = "cc", descriptor = "[Lclient!pd;")
	private Class189[] aClass189Array3;

	@OriginalMember(owner = "client!ko", name = "dc", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!ko", name = "fc", descriptor = "[Lclient!qc;")
	private Class200[] aClass200Array3;

	@OriginalMember(owner = "client!ko", name = "gc", descriptor = "I")
	private int anInt4065;

	@OriginalMember(owner = "client!ko", name = "hc", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!ko", name = "ic", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!ko", name = "sc", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!ko", name = "X", descriptor = "Z")
	private boolean aBoolean299 = false;

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
	private int anInt4013 = 0;

	@OriginalMember(owner = "client!ko", name = "Q", descriptor = "I")
	private int anInt4027 = 0;

	@OriginalMember(owner = "client!ko", name = "V", descriptor = "I")
	private int anInt4030 = 0;

	@OriginalMember(owner = "client!ko", name = "Rb", descriptor = "I")
	private int anInt4056 = 0;

	@OriginalMember(owner = "client!ko", name = "bc", descriptor = "I")
	private int anInt4063 = 0;

	@OriginalMember(owner = "client!ko", name = "mc", descriptor = "Z")
	private boolean aBoolean300 = true;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_22;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "Lclient!wc;")
	private Class260 aClass260_10;

	@OriginalMember(owner = "client!ko", name = "jc", descriptor = "Lclient!wc;")
	private Class260 aClass260_13;

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "Lclient!wc;")
	private Class260 aClass260_11;

	@OriginalMember(owner = "client!ko", name = "rb", descriptor = "Lclient!wc;")
	private Class260 aClass260_12;

	@OriginalMember(owner = "client!ko", name = "J", descriptor = "Lclient!dv;")
	private Class61 aClass61_1;

	static {
		new Class182("", 73);
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class91_Sub2(@OriginalArg(0) Class49_Sub2 arg0) {
		this.aClass49_Sub2_22 = arg0;
		this.aClass260_10 = new Class260(null, 5126, 3, 0);
		this.aClass260_13 = new Class260(null, 5126, 2, 0);
		this.aClass260_11 = new Class260(null, 5126, 3, 0);
		this.aClass260_12 = new Class260(null, 5121, 4, 0);
		this.aClass61_1 = new Class61();
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!ef;Lclient!kq;IIII)V")
	public Class91_Sub2(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4047 = arg5;
		this.anInt4019 = arg2;
		this.aClass49_Sub2_22 = arg0;
		if (Static207.method3261(arg5, arg2)) {
			this.aClass260_10 = new Class260(null, 5126, 3, 0);
		}
		if (Static55.method921(arg2, arg5)) {
			this.aClass260_13 = new Class260(null, 5126, 2, 0);
		}
		if (Static83.method1622(arg2, arg5)) {
			this.aClass260_11 = new Class260(null, 5126, 3, 0);
		}
		if (Static15.method316(arg2, arg5)) {
			this.aClass260_12 = new Class260(null, 5121, 4, 0);
		}
		if (Static30.method538(arg2, arg5)) {
			this.aClass61_1 = new Class61();
		}
		@Pc(102) Interface4 local102 = arg0.anInterface4_6;
		this.anIntArray345 = new int[arg1.anInt4088 + 1];
		@Pc(113) int[] local113 = new int[arg1.anInt4094];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt4094; local115++) {
			if ((arg1.aByteArray83 == null || arg1.aByteArray83[local115] != 2) && (arg1.aShortArray59 == null || arg1.aShortArray59[local115] == -1 || !local102.method3794(arg1.aShortArray59[local115] & 0xFFFF).aBoolean289)) {
				local113[this.anInt4013++] = local115;
				this.anIntArray345[arg1.aShortArray62[local115]]++;
				this.anIntArray345[arg1.aShortArray61[local115]]++;
				this.anIntArray345[arg1.aShortArray65[local115]]++;
			}
		}
		this.anInt4056 = this.anInt4013;
		@Pc(209) long[] local209 = new long[this.anInt4013];
		@Pc(218) boolean local218 = (this.anInt4019 & 0x100) != 0;
		@Pc(230) int local230;
		@Pc(241) int local241;
		@Pc(363) int local363;
		label490: for (@Pc(220) int local220 = 0; local220 < this.anInt4013; local220++) {
			@Pc(226) int local226 = local113[local220];
			@Pc(228) Class140 local228 = null;
			local230 = 0;
			@Pc(232) byte local232 = 0;
			@Pc(234) byte local234 = 0;
			@Pc(236) byte local236 = 0;
			if (arg1.aClass150Array1 != null) {
				for (local241 = 0; local241 < arg1.aClass150Array1.length; local241++) {
					@Pc(248) Class150 local248 = arg1.aClass150Array1[local241];
					if (local248.anInt4157 == local226) {
						@Pc(261) Class19 local261 = Static218.method3409(local248.anInt4165);
						if (local261.aBoolean21) {
							local209[local220] = Long.MAX_VALUE;
							this.anInt4056--;
							continue label490;
						}
					}
				}
			}
			@Pc(284) short local284 = -1;
			if (arg1.aShortArray59 != null) {
				local284 = arg1.aShortArray59[local226];
				if (local284 != -1) {
					local228 = local102.method3794(local284 & 0xFFFF);
					local234 = local228.aByte62;
					local236 = local228.aByte61;
				}
			}
			@Pc(325) boolean local325 = arg1.aByteArray84 != null && arg1.aByteArray84[local226] != 0 || local228 != null && !local228.aBoolean290;
			if ((local218 || local325) && arg1.aByteArray80 != null) {
				local230 += arg1.aByteArray80[local226] << 17;
			}
			if (local325) {
				local230 += 65536;
			}
			local230 += (local234 & 0xFF) << 8;
			local363 = local232 + ((local284 & 0xFFFF) << 16);
			local230 += local236 & 0xFF;
			@Pc(375) int local375 = local363 + (local220 & 0xFFFF);
			local209[local220] = (long) local375 + ((long) local230 << 32);
		}
		Static91.method1764(local209, local113);
		this.aShortArray58 = arg1.aShortArray60;
		this.anIntArray342 = arg1.anIntArray350;
		this.anIntArray341 = arg1.anIntArray356;
		this.anInt4063 = arg1.anInt4082;
		this.anInt4027 = arg1.anInt4088;
		this.anIntArray343 = arg1.anIntArray349;
		@Pc(426) Class239[] local426 = new Class239[this.anInt4027];
		this.aClass189Array3 = arg1.aClass189Array4;
		this.aClass200Array3 = arg1.aClass200Array4;
		@Pc(454) int local454;
		@Pc(468) int local468;
		if (arg1.aClass150Array1 != null) {
			this.anInt4065 = arg1.aClass150Array1.length;
			this.aClass25Array1 = new Class25[this.anInt4065];
			this.aClass111Array1 = new Class111[this.anInt4065];
			for (local454 = 0; local454 < this.anInt4065; local454++) {
				@Pc(461) Class150 local461 = arg1.aClass150Array1[local454];
				@Pc(466) Class19 local466 = Static218.method3409(local461.anInt4165);
				local468 = -1;
				for (@Pc(470) int local470 = 0; local470 < this.anInt4013; local470++) {
					if (local113[local470] == local461.anInt4157) {
						local468 = local470;
						break;
					}
				}
				if (local468 == -1) {
					throw new RuntimeException();
				}
				local241 = Static199.anIntArray337[arg1.aShortArray63[local461.anInt4157] & 0xFFFF] & 0xFFFFFF;
				local241 |= 255 - (arg1.aByteArray84 == null ? 0 : arg1.aByteArray84[local461.anInt4157]) << 24;
				this.aClass111Array1[local454] = new Class111(local468, arg1.aShortArray62[local461.anInt4157], arg1.aShortArray61[local461.anInt4157], arg1.aShortArray65[local461.anInt4157], local466.anInt535, local466.anInt533, local466.anInt531, local466.anInt540, local466.anInt537, local466.aBoolean21, local466.aBoolean22, local461.anInt4164);
				this.aClass25Array1[local454] = new Class25(local241);
			}
		}
		local454 = this.anInt4013 * 3;
		this.aFloatArray30 = new float[local454];
		this.aShortArray54 = new short[local454];
		this.aShort49 = (short) arg4;
		this.aShortArray50 = new short[local454];
		this.aShortArray52 = new short[this.anInt4013];
		this.aShortArray51 = new short[local454];
		this.aByteArray77 = new byte[local454];
		this.aShortArray53 = new short[this.anInt4013];
		this.aShortArray55 = new short[this.anInt4013];
		this.aByteArray76 = new byte[this.anInt4013];
		this.aShortArray49 = new short[this.anInt4013];
		this.aFloatArray29 = new float[local454];
		this.aShort47 = (short) arg3;
		this.aShortArray57 = new short[local454];
		if (arg1.aShortArray68 != null) {
			this.aShortArray48 = new short[this.anInt4013];
		}
		this.aShortArray56 = new short[this.anInt4013];
		Static185.aLongArray4 = new long[local454];
		local230 = 0;
		for (local363 = 0; local363 < arg1.anInt4088; local363++) {
			local468 = this.anIntArray345[local363];
			this.anIntArray345[local363] = local230;
			local230 += local468;
			local426[local363] = new Class239();
		}
		this.anIntArray345[arg1.anInt4088] = local230;
		@Pc(710) int[] local710 = null;
		@Pc(712) int[] local712 = null;
		@Pc(714) int[] local714 = null;
		@Pc(716) float[][] local716 = null;
		@Pc(742) int local742;
		@Pc(786) int local786;
		@Pc(792) int local792;
		@Pc(806) int local806;
		@Pc(808) int local808;
		@Pc(841) int local841;
		@Pc(846) int local846;
		@Pc(993) float local993;
		@Pc(1027) float local1027;
		@Pc(995) float local995;
		if (arg1.aByteArray79 != null) {
			@Pc(722) int local722 = arg1.anInt4086;
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
			local716 = new float[local722][];
			for (local786 = 0; local786 < this.anInt4013; local786++) {
				local792 = local113[local786];
				if (arg1.aByteArray79[local792] != -1) {
					local806 = arg1.aByteArray79[local792] & 0xFF;
					for (local808 = 0; local808 < 3; local808++) {
						@Pc(822) short local822;
						if (local808 == 0) {
							local822 = arg1.aShortArray62[local792];
						} else if (local808 == 1) {
							local822 = arg1.aShortArray61[local792];
						} else {
							local822 = arg1.aShortArray65[local792];
						}
						local841 = arg1.anIntArray350[local822];
						local846 = arg1.anIntArray349[local822];
						@Pc(851) int local851 = arg1.anIntArray356[local822];
						if (local841 < local725[local806]) {
							local725[local806] = local841;
						}
						if (local728[local806] < local841) {
							local728[local806] = local841;
						}
						if (local731[local806] > local846) {
							local731[local806] = local846;
						}
						if (local846 > local734[local806]) {
							local734[local806] = local846;
						}
						if (local851 < local737[local806]) {
							local737[local806] = local851;
						}
						if (local851 > local740[local806]) {
							local740[local806] = local851;
						}
					}
				}
			}
			for (local792 = 0; local792 < local722; local792++) {
				@Pc(943) byte local943 = arg1.aByteArray82[local792];
				if (local943 > 0) {
					local710[local792] = (local725[local792] + local728[local792]) / 2;
					local712[local792] = (local731[local792] + local734[local792]) / 2;
					local714[local792] = (local740[local792] + local737[local792]) / 2;
					if (local943 == 1) {
						local846 = arg1.anIntArray353[local792];
						if (local846 == 0) {
							local993 = 1.0F;
							local995 = 1.0F;
						} else if (local846 > 0) {
							local995 = (float) local846 / 1024.0F;
							local993 = 1.0F;
						} else {
							local993 = (float) -local846 / 1024.0F;
							local995 = 1.0F;
						}
						local1027 = 64.0F / (float) arg1.anIntArray351[local792];
					} else if (local943 == 2) {
						local1027 = 64.0F / (float) arg1.anIntArray351[local792];
						local995 = 64.0F / (float) arg1.anIntArray347[local792];
						local993 = 64.0F / (float) arg1.anIntArray353[local792];
					} else {
						local993 = (float) arg1.anIntArray353[local792] / 1024.0F;
						local1027 = (float) arg1.anIntArray351[local792] / 1024.0F;
						local995 = (float) arg1.anIntArray347[local792] / 1024.0F;
					}
					local716[local792] = Static284.method4116(local995, arg1.aShortArray64[local792], local1027, local993, arg1.aByteArray81[local792] & 0xFF, arg1.aShortArray67[local792], arg1.aShortArray66[local792]);
				}
			}
		}
		@Pc(1118) Class93[] local1118 = new Class93[arg1.anInt4094];
		@Pc(1137) short local1137;
		@Pc(1147) int local1147;
		@Pc(1158) int local1158;
		@Pc(1219) int local1219;
		for (@Pc(1120) int local1120 = 0; local1120 < arg1.anInt4094; local1120++) {
			@Pc(1127) short local1127 = arg1.aShortArray62[local1120];
			@Pc(1132) short local1132 = arg1.aShortArray61[local1120];
			local1137 = arg1.aShortArray65[local1120];
			local1147 = this.anIntArray342[local1132] - this.anIntArray342[local1127];
			local1158 = this.anIntArray343[local1132] - this.anIntArray343[local1127];
			local742 = this.anIntArray341[local1132] - this.anIntArray341[local1127];
			local786 = this.anIntArray342[local1137] - this.anIntArray342[local1127];
			local792 = this.anIntArray343[local1137] - this.anIntArray343[local1127];
			local806 = this.anIntArray341[local1137] - this.anIntArray341[local1127];
			local808 = local1158 * local806 - local792 * local742;
			local1219 = local742 * local786 - local1147 * local806;
			for (local841 = local792 * local1147 - local1158 * local786; local808 > 8192 || local1219 > 8192 || local841 > 8192 || local808 < -8192 || local1219 < -8192 || local841 < -8192; local841 >>= 0x1) {
				local808 >>= 0x1;
				local1219 >>= 0x1;
			}
			local846 = (int) Math.sqrt((double) (local808 * local808 + local1219 * local1219 + local841 * local841));
			if (local846 <= 0) {
				local846 = 1;
			}
			local841 = local841 * 256 / local846;
			local808 = local808 * 256 / local846;
			local1219 = local1219 * 256 / local846;
			@Pc(1312) byte local1312 = arg1.aByteArray83 == null ? 0 : arg1.aByteArray83[local1120];
			if (local1312 == 0) {
				@Pc(1318) Class239 local1318 = local426[local1127];
				local1318.anInt6573 += local1219;
				local1318.anInt6569 += local808;
				local1318.anInt6574++;
				local1318.anInt6566 += local841;
				@Pc(1346) Class239 local1346 = local426[local1132];
				local1346.anInt6569 += local808;
				local1346.anInt6574++;
				local1346.anInt6566 += local841;
				local1346.anInt6573 += local1219;
				@Pc(1374) Class239 local1374 = local426[local1137];
				local1374.anInt6574++;
				local1374.anInt6573 += local1219;
				local1374.anInt6566 += local841;
				local1374.anInt6569 += local808;
			} else if (local1312 == 1) {
				@Pc(1411) Class93 local1411 = local1118[local1120] = new Class93();
				local1411.anInt2741 = local1219;
				local1411.anInt2738 = local841;
				local1411.anInt2739 = local808;
			}
		}
		@Pc(1433) int local1433;
		for (@Pc(1427) int local1427 = 0; local1427 < this.anInt4013; local1427++) {
			local1433 = local113[local1427];
			@Pc(1440) int local1440 = arg1.aShortArray63[local1433] & 0xFFFF;
			@Pc(1445) short local1445;
			if (arg1.aShortArray59 == null) {
				local1445 = -1;
			} else {
				local1445 = arg1.aShortArray59[local1433];
			}
			if (arg1.aByteArray79 == null) {
				local1158 = -1;
			} else {
				local1158 = arg1.aByteArray79[local1433];
			}
			if (arg1.aByteArray84 == null) {
				local742 = 0;
			} else {
				local742 = arg1.aByteArray84[local1433] & 0xFF;
			}
			@Pc(1480) float local1480 = 0.0F;
			@Pc(1482) float local1482 = 0.0F;
			@Pc(1484) float local1484 = 0.0F;
			local993 = 0.0F;
			local1027 = 0.0F;
			local995 = 0.0F;
			@Pc(1492) byte local1492 = 0;
			@Pc(1494) byte local1494 = 0;
			@Pc(1496) int local1496 = 0;
			@Pc(1530) byte local1530;
			@Pc(1550) short local1550;
			@Pc(1555) short local1555;
			@Pc(1560) short local1560;
			if (local1445 != -1) {
				if (local1158 == -1) {
					local1482 = 1.0F;
					local1484 = 1.0F;
					local1480 = 0.0F;
					local1494 = 2;
					local1492 = 1;
					local1027 = 0.0F;
					local993 = 1.0F;
					local995 = 0.0F;
				} else {
					local1158 &= 0xFF;
					local1530 = arg1.aByteArray82[local1158];
					@Pc(1540) short local1540;
					@Pc(1545) short local1545;
					@Pc(1583) float local1583;
					@Pc(1591) float local1591;
					@Pc(1600) float local1600;
					@Pc(1685) float local1685;
					@Pc(1693) float local1693;
					@Pc(1702) float local1702;
					@Pc(1710) float local1710;
					@Pc(1719) float local1719;
					@Pc(1728) float local1728;
					if (local1530 == 0) {
						local1540 = arg1.aShortArray62[local1433];
						local1545 = arg1.aShortArray61[local1433];
						local1550 = arg1.aShortArray65[local1433];
						local1555 = arg1.aShortArray66[local1158];
						local1560 = arg1.aShortArray64[local1158];
						@Pc(1565) short local1565 = arg1.aShortArray67[local1158];
						@Pc(1571) float local1571 = (float) arg1.anIntArray350[local1555];
						@Pc(1577) float local1577 = (float) arg1.anIntArray349[local1555];
						local1583 = arg1.anIntArray356[local1555];
						local1591 = (float) arg1.anIntArray350[local1560] - local1571;
						local1600 = (float) arg1.anIntArray349[local1560] - local1577;
						@Pc(1609) float local1609 = (float) arg1.anIntArray356[local1560] - local1583;
						@Pc(1617) float local1617 = (float) arg1.anIntArray350[local1565] - local1571;
						@Pc(1625) float local1625 = (float) arg1.anIntArray349[local1565] - local1577;
						@Pc(1633) float local1633 = (float) arg1.anIntArray356[local1565] - local1583;
						@Pc(1641) float local1641 = (float) arg1.anIntArray350[local1540] - local1571;
						@Pc(1650) float local1650 = (float) arg1.anIntArray349[local1540] - local1577;
						@Pc(1659) float local1659 = (float) arg1.anIntArray356[local1540] - local1583;
						@Pc(1668) float local1668 = (float) arg1.anIntArray350[local1545] - local1571;
						@Pc(1676) float local1676 = (float) arg1.anIntArray349[local1545] - local1577;
						local1685 = (float) arg1.anIntArray356[local1545] - local1583;
						local1693 = (float) arg1.anIntArray350[local1550] - local1571;
						local1702 = (float) arg1.anIntArray349[local1550] - local1577;
						local1710 = (float) arg1.anIntArray356[local1550] - local1583;
						local1719 = local1633 * local1600 - local1625 * local1609;
						local1728 = local1609 * local1617 - local1633 * local1591;
						@Pc(1737) float local1737 = local1625 * local1591 - local1617 * local1600;
						@Pc(1745) float local1745 = local1737 * local1625 - local1728 * local1633;
						@Pc(1754) float local1754 = local1633 * local1719 - local1737 * local1617;
						@Pc(1762) float local1762 = local1728 * local1617 - local1719 * local1625;
						@Pc(1776) float local1776 = 1.0F / (local1762 * local1609 + local1754 * local1600 + local1745 * local1591);
						local1484 = (local1762 * local1685 + local1745 * local1668 + local1754 * local1676) * local1776;
						local1480 = (local1659 * local1762 + local1754 * local1650 + local1745 * local1641) * local1776;
						local1027 = (local1754 * local1702 + local1693 * local1745 + local1762 * local1710) * local1776;
						@Pc(1827) float local1827 = local1600 * local1737 - local1609 * local1728;
						@Pc(1835) float local1835 = local1728 * local1591 - local1600 * local1719;
						@Pc(1843) float local1843 = local1719 * local1609 - local1591 * local1737;
						@Pc(1857) float local1857 = 1.0F / (local1835 * local1633 + local1827 * local1617 + local1625 * local1843);
						local1482 = (local1843 * local1650 + local1827 * local1641 + local1659 * local1835) * local1857;
						local995 = (local1710 * local1835 + local1693 * local1827 + local1702 * local1843) * local1857;
						local993 = (local1835 * local1685 + local1676 * local1843 + local1827 * local1668) * local1857;
					} else {
						local1540 = arg1.aShortArray62[local1433];
						local1545 = arg1.aShortArray61[local1433];
						local1550 = arg1.aShortArray65[local1433];
						@Pc(1920) int local1920 = local710[local1158];
						@Pc(1924) int local1924 = local712[local1158];
						@Pc(1928) int local1928 = local714[local1158];
						@Pc(1932) float[] local1932 = local716[local1158];
						@Pc(1937) byte local1937 = arg1.aByteArray85[local1158];
						local1583 = (float) arg1.anIntArray354[local1158] / 256.0F;
						if (local1530 == 1) {
							local1591 = (float) arg1.anIntArray347[local1158] / 1024.0F;
							Static393.method5205(local1928, arg1.anIntArray349[local1540], local1583, arg1.anIntArray356[local1540], local1932, local1920, local1924, arg1.anIntArray350[local1540], local1591, local1937);
							local1480 = Static434.aFloat102;
							local1482 = Static54.aFloat17;
							Static393.method5205(local1928, arg1.anIntArray349[local1545], local1583, arg1.anIntArray356[local1545], local1932, local1920, local1924, arg1.anIntArray350[local1545], local1591, local1937);
							local1484 = Static434.aFloat102;
							local993 = Static54.aFloat17;
							Static393.method5205(local1928, arg1.anIntArray349[local1550], local1583, arg1.anIntArray356[local1550], local1932, local1920, local1924, arg1.anIntArray350[local1550], local1591, local1937);
							local995 = Static54.aFloat17;
							local1027 = Static434.aFloat102;
							local1600 = local1591 / 2.0F;
							if ((local1937 & 0x1) == 0) {
								if (local1484 - local1480 > local1600) {
									local1484 -= local1591;
									local1492 = 1;
								} else if (local1600 < local1480 - local1484) {
									local1492 = 2;
									local1484 += local1591;
								}
								if (local1600 < local1027 - local1480) {
									local1027 -= local1591;
									local1494 = 1;
								} else if (local1480 - local1027 > local1600) {
									local1494 = 2;
									local1027 += local1591;
								}
							} else {
								if (local995 - local1482 > local1600) {
									local995 -= local1591;
									local1494 = 1;
								} else if (local1600 < local1482 - local995) {
									local1494 = 2;
									local995 += local1591;
								}
								if (local993 - local1482 > local1600) {
									local993 -= local1591;
									local1492 = 1;
								} else if (local1600 < local1482 - local993) {
									local993 += local1591;
									local1492 = 2;
								}
							}
						} else if (local1530 == 2) {
							local1591 = (float) arg1.anIntArray352[local1158] / 256.0F;
							local1600 = (float) arg1.anIntArray355[local1158] / 256.0F;
							@Pc(2378) int local2378 = arg1.anIntArray350[local1545] - arg1.anIntArray350[local1540];
							@Pc(2389) int local2389 = arg1.anIntArray349[local1545] - arg1.anIntArray349[local1540];
							@Pc(2399) int local2399 = arg1.anIntArray356[local1545] - arg1.anIntArray356[local1540];
							@Pc(2410) int local2410 = arg1.anIntArray350[local1550] - arg1.anIntArray350[local1540];
							@Pc(2421) int local2421 = arg1.anIntArray349[local1550] - arg1.anIntArray349[local1540];
							@Pc(2432) int local2432 = arg1.anIntArray356[local1550] - arg1.anIntArray356[local1540];
							@Pc(2440) int local2440 = local2432 * local2389 - local2421 * local2399;
							@Pc(2448) int local2448 = local2399 * local2410 - local2378 * local2432;
							@Pc(2457) int local2457 = local2421 * local2378 - local2389 * local2410;
							local1685 = 64.0F / (float) arg1.anIntArray353[local1158];
							local1693 = 64.0F / (float) arg1.anIntArray351[local1158];
							local1702 = 64.0F / (float) arg1.anIntArray347[local1158];
							local1710 = ((float) local2457 * local1932[2] + local1932[1] * (float) local2448 + (float) local2440 * local1932[0]) / local1685;
							local1719 = (local1932[3] * (float) local2440 + (float) local2448 * local1932[4] + (float) local2457 * local1932[5]) / local1693;
							local1728 = ((float) local2457 * local1932[8] + local1932[7] * (float) local2448 + (float) local2440 * local1932[6]) / local1702;
							local1496 = Static293.method4210(local1719, local1728, local1710);
							Static243.method3737(local1924, local1496, local1591, arg1.anIntArray356[local1540], local1928, local1932, local1583, local1600, local1937, arg1.anIntArray350[local1540], arg1.anIntArray349[local1540], local1920);
							local1482 = Static94.aFloat47;
							local1480 = Static436.aFloat103;
							Static243.method3737(local1924, local1496, local1591, arg1.anIntArray356[local1545], local1928, local1932, local1583, local1600, local1937, arg1.anIntArray350[local1545], arg1.anIntArray349[local1545], local1920);
							local993 = Static94.aFloat47;
							local1484 = Static436.aFloat103;
							Static243.method3737(local1924, local1496, local1591, arg1.anIntArray356[local1550], local1928, local1932, local1583, local1600, local1937, arg1.anIntArray350[local1550], arg1.anIntArray349[local1550], local1920);
							local1027 = Static436.aFloat103;
							local995 = Static94.aFloat47;
						} else if (local1530 == 3) {
							Static152.method2536(local1937, local1932, arg1.anIntArray350[local1540], local1920, local1583, arg1.anIntArray356[local1540], arg1.anIntArray349[local1540], local1924, local1928);
							local1480 = Static196.aFloat60;
							local1482 = Static270.aFloat71;
							Static152.method2536(local1937, local1932, arg1.anIntArray350[local1545], local1920, local1583, arg1.anIntArray356[local1545], arg1.anIntArray349[local1545], local1924, local1928);
							local993 = Static270.aFloat71;
							local1484 = Static196.aFloat60;
							Static152.method2536(local1937, local1932, arg1.anIntArray350[local1550], local1920, local1583, arg1.anIntArray356[local1550], arg1.anIntArray349[local1550], local1924, local1928);
							local995 = Static270.aFloat71;
							local1027 = Static196.aFloat60;
							if ((local1937 & 0x1) == 0) {
								if (local1027 - local1480 > 0.5F) {
									local1027--;
									local1494 = 1;
								} else if (local1480 - local1027 > 0.5F) {
									local1494 = 2;
									local1027++;
								}
								if (local1484 - local1480 > 0.5F) {
									local1492 = 1;
									local1484--;
								} else if (local1480 - local1484 > 0.5F) {
									local1492 = 2;
									local1484++;
								}
							} else {
								if (local995 - local1482 > 0.5F) {
									local995--;
									local1494 = 1;
								} else if (local1482 - local995 > 0.5F) {
									local995++;
									local1494 = 2;
								}
								if (local993 - local1482 > 0.5F) {
									local1492 = 1;
									local993--;
								} else if (local1482 - local993 > 0.5F) {
									local1492 = 2;
									local993++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray83 == null) {
				local1530 = 0;
			} else {
				local1530 = arg1.aByteArray83[local1433];
			}
			if (local1530 == 0) {
				@Pc(2796) long local2796 = ((long) local742 + (long) (local1496 << 24) + (long) (local1440 << 8) << 32) + (long) (local1158 << 2);
				local1550 = arg1.aShortArray62[local1433];
				local1555 = arg1.aShortArray61[local1433];
				local1560 = arg1.aShortArray65[local1433];
				@Pc(2815) Class239 local2815 = local426[local1550];
				this.aShortArray53[local1427] = this.method3300(local1480, arg1, local1482, local2815.anInt6574, local2815.anInt6569, local2815.anInt6573, local1550, local2815.anInt6566, local2796);
				@Pc(2839) Class239 local2839 = local426[local1555];
				this.aShortArray49[local1427] = this.method3300(local1484, arg1, local993, local2839.anInt6574, local2839.anInt6569, local2839.anInt6573, local1555, local2839.anInt6566, local2796 + (long) local1492);
				@Pc(2866) Class239 local2866 = local426[local1560];
				this.aShortArray55[local1427] = this.method3300(local1027, arg1, local995, local2866.anInt6574, local2866.anInt6569, local2866.anInt6573, local1560, local2866.anInt6566, (long) local1494 + local2796);
			} else if (local1530 == 1) {
				@Pc(2658) Class93 local2658 = local1118[local1433];
				@Pc(2702) long local2702 = ((long) (local1440 << 8) + (long) (local1496 << 24) + (long) local742 << 32) + (long) ((local2658.anInt2738 + 256 << 22) + (local2658.anInt2741 + 256 << 12) + (local1158 << 2) + (local2658.anInt2739 > 0 ? 1024 : 2048));
				this.aShortArray53[local1427] = this.method3300(local1480, arg1, local1482, 0, local2658.anInt2739, local2658.anInt2741, arg1.aShortArray62[local1433], local2658.anInt2738, local2702);
				this.aShortArray49[local1427] = this.method3300(local1484, arg1, local993, 0, local2658.anInt2739, local2658.anInt2741, arg1.aShortArray61[local1433], local2658.anInt2738, local2702 + (long) local1492);
				this.aShortArray55[local1427] = this.method3300(local1027, arg1, local995, 0, local2658.anInt2739, local2658.anInt2741, arg1.aShortArray65[local1433], local2658.anInt2738, (long) local1494 + local2702);
			}
			if (arg1.aShortArray59 == null) {
				this.aShortArray56[local1427] = -1;
			} else {
				this.aShortArray56[local1427] = arg1.aShortArray59[local1433];
			}
			if (arg1.aByteArray84 != null) {
				this.aByteArray76[local1427] = arg1.aByteArray84[local1433];
			}
			if (arg1.aShortArray68 != null) {
				this.aShortArray48[local1427] = arg1.aShortArray68[local1433];
			}
			this.aShortArray52[local1427] = arg1.aShortArray63[local1433];
		}
		local1433 = 0;
		local1137 = -10000;
		for (local1147 = 0; local1147 < this.anInt4056; local1147++) {
			@Pc(2959) short local2959 = this.aShortArray56[local1147];
			if (local2959 != local1137) {
				local1433++;
				local1137 = local2959;
			}
		}
		this.anIntArray344 = new int[local1433 + 1];
		local1433 = 0;
		local1137 = -10000;
		for (local1158 = 0; local1158 < this.anInt4056; local1158++) {
			@Pc(2993) short local2993 = this.aShortArray56[local1158];
			if (local2993 != local1137) {
				local1137 = local2993;
				this.anIntArray344[local1433++] = local1158;
			}
		}
		this.anIntArray344[local1433] = this.anInt4056;
		Static185.aLongArray4 = null;
		this.aShortArray51 = Static272.method4048(this.aShortArray51, this.anInt4030);
		this.aShortArray54 = Static272.method4048(this.aShortArray54, this.anInt4030);
		this.aShortArray57 = Static272.method4048(this.aShortArray57, this.anInt4030);
		this.aByteArray77 = Static195.method3065(this.anInt4030, this.aByteArray77);
		this.aFloatArray30 = Static436.method5681(this.aFloatArray30, this.anInt4030);
		this.aFloatArray29 = Static436.method5681(this.aFloatArray29, this.anInt4030);
		if (arg1.anIntArray348 != null && Static307.method4342(this.anInt4047, arg2)) {
			this.anIntArrayArray39 = arg1.method3332();
		}
		if (arg1.aClass150Array1 != null && Static241.method3949(this.anInt4047, arg2)) {
			this.anIntArrayArray37 = arg1.method3330();
		}
		if (arg1.anIntArray346 != null && Static281.method5827(arg2, this.anInt4047)) {
			local742 = 0;
			@Pc(3111) int[] local3111 = new int[256];
			for (local792 = 0; local792 < this.anInt4013; local792++) {
				local806 = arg1.anIntArray346[local113[local792]];
				if (local806 >= 0) {
					@Pc(3128) int local3128 = local3111[local806]++;
					if (local742 < local806) {
						local742 = local806;
					}
				}
			}
			this.anIntArrayArray38 = new int[local742 + 1][];
			for (local806 = 0; local806 <= local742; local806++) {
				this.anIntArrayArray38[local806] = new int[local3111[local806]];
				local3111[local806] = 0;
			}
			for (local808 = 0; local808 < this.anInt4013; local808++) {
				local1219 = arg1.anIntArray346[local113[local808]];
				if (local1219 >= 0) {
					this.anIntArrayArray38[local1219][local3111[local1219]++] = local808;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "UA", descriptor = "(I)V")
	@Override
	public void UA(@OriginalArg(0) int arg0) {
		this.anInt4019 = arg0;
		this.aBoolean300 = true;
		if (this.aClass169_1 != null && (this.anInt4019 & 0x10000) == 0) {
			this.aShortArray54 = this.aClass169_1.aShortArray76;
			this.aByteArray77 = this.aClass169_1.aByteArray98;
			this.aShortArray51 = this.aClass169_1.aShortArray74;
			this.aShortArray57 = this.aClass169_1.aShortArray75;
			this.aClass169_1 = null;
		}
		this.method3311();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(SIBIB)I")
	private int method3295(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		@Pc(17) int local17 = Static199.anIntArray337[Static26.method506(arg3, arg1)];
		if (arg0 != -1) {
			@Pc(29) Class140 local29 = this.aClass49_Sub2_22.anInterface4_6.method3794(arg0 & 0xFFFF);
			@Pc(34) int local34 = local29.aByte59 & 0xFF;
			@Pc(53) int local53;
			@Pc(73) int local73;
			if (local34 != 0) {
				if (arg3 < 0) {
					local53 = 0;
				} else if (arg3 <= 127) {
					local53 = arg3 * 131586;
				} else {
					local53 = 16777215;
				}
				if (local34 == 256) {
					local17 = local53;
				} else {
					local73 = 256 - local34;
					local17 = ((local17 & 0xFF00) * local73 + (local53 & 0xFF00) * local34 & 0xFF0000) + (local34 * (local53 & 0xFF00FF) + (local73 * (local17 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local53 = local29.aByte65 & 0xFF;
			if (local53 != 0) {
				local53 += 256;
				@Pc(124) int local124 = local53 * (local17 >> 16 & 0xFF);
				if (local124 > 65535) {
					local124 = 65535;
				}
				local73 = local53 * (local17 >> 8 & 0xFF);
				if (local73 > 65535) {
					local73 = 65535;
				}
				@Pc(150) int local150 = local53 * (local17 & 0xFF);
				if (local150 > 65535) {
					local150 = 65535;
				}
				local17 = (local150 >> 8) + (local73 & 0xFF00) + (local124 << 8 & 0xFF0021);
			}
		}
		return (local17 << 8) + 255 - (arg2 & 0xFF);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!tc;I)V")
	private void method3296(@OriginalArg(0) Class35_Sub2 arg0) {
		@Pc(10) int local10;
		if (this.aClass200Array3 != null) {
			for (local10 = 0; local10 < this.aClass200Array3.length; local10++) {
				@Pc(17) Class200 local17 = this.aClass200Array3[local10];
				@Pc(19) Class200 local19 = local17;
				if (local17.aClass200_2 != null) {
					local19 = local17.aClass200_2;
				}
				local19.anInt5563 = (int) (arg0.aFloat97 * (float) this.anIntArray341[local17.anInt5573] + arg0.aFloat90 * (float) this.anIntArray342[local17.anInt5573] + (float) this.anIntArray343[local17.anInt5573] * arg0.aFloat88 + arg0.aFloat92);
				local19.anInt5565 = (int) ((float) this.anIntArray343[local17.anInt5573] * arg0.aFloat95 + (float) this.anIntArray342[local17.anInt5573] * arg0.aFloat89 + (float) this.anIntArray341[local17.anInt5573] * arg0.aFloat96 + arg0.aFloat98);
				local19.anInt5564 = (int) (arg0.aFloat91 + (float) this.anIntArray341[local17.anInt5573] * arg0.aFloat94 + (float) this.anIntArray343[local17.anInt5573] * arg0.aFloat99 + arg0.aFloat93 * (float) this.anIntArray342[local17.anInt5573]);
				local19.anInt5567 = (int) (arg0.aFloat92 + arg0.aFloat88 * (float) this.anIntArray343[local17.anInt5568] + arg0.aFloat90 * (float) this.anIntArray342[local17.anInt5568] + (float) this.anIntArray341[local17.anInt5568] * arg0.aFloat97);
				local19.anInt5562 = (int) (arg0.aFloat98 + (float) this.anIntArray341[local17.anInt5568] * arg0.aFloat96 + arg0.aFloat95 * (float) this.anIntArray343[local17.anInt5568] + arg0.aFloat89 * (float) this.anIntArray342[local17.anInt5568]);
				local19.anInt5559 = (int) ((float) this.anIntArray342[local17.anInt5568] * arg0.aFloat93 + arg0.aFloat99 * (float) this.anIntArray343[local17.anInt5568] + arg0.aFloat94 * (float) this.anIntArray341[local17.anInt5568] + arg0.aFloat91);
				local19.anInt5560 = (int) (arg0.aFloat90 * (float) this.anIntArray342[local17.anInt5570] + arg0.aFloat88 * (float) this.anIntArray343[local17.anInt5570] + arg0.aFloat97 * (float) this.anIntArray341[local17.anInt5570] + arg0.aFloat92);
				local19.anInt5561 = (int) (arg0.aFloat98 + (float) this.anIntArray342[local17.anInt5570] * arg0.aFloat89 + arg0.aFloat95 * (float) this.anIntArray343[local17.anInt5570] + arg0.aFloat96 * (float) this.anIntArray341[local17.anInt5570]);
				local19.anInt5566 = (int) (arg0.aFloat91 + arg0.aFloat99 * (float) this.anIntArray343[local17.anInt5570] + arg0.aFloat93 * (float) this.anIntArray342[local17.anInt5570] + arg0.aFloat94 * (float) this.anIntArray341[local17.anInt5570]);
			}
		}
		if (this.aClass189Array3 == null) {
			return;
		}
		for (local10 = 0; local10 < this.aClass189Array3.length; local10++) {
			@Pc(362) Class189 local362 = this.aClass189Array3[local10];
			@Pc(364) Class189 local364 = local362;
			if (local362.aClass189_1 != null) {
				local364 = local362.aClass189_1;
			}
			if (local362.aClass35_6 == null) {
				local362.aClass35_6 = arg0.method5043();
			} else {
				local362.aClass35_6.za(arg0);
			}
			local364.anInt5346 = (int) (arg0.aFloat88 * (float) this.anIntArray343[local362.anInt5345] + (float) this.anIntArray342[local362.anInt5345] * arg0.aFloat90 + (float) this.anIntArray341[local362.anInt5345] * arg0.aFloat97 + arg0.aFloat92);
			local364.anInt5342 = (int) (arg0.aFloat98 + (float) this.anIntArray341[local362.anInt5345] * arg0.aFloat96 + arg0.aFloat89 * (float) this.anIntArray342[local362.anInt5345] + (float) this.anIntArray343[local362.anInt5345] * arg0.aFloat95);
			local364.anInt5348 = (int) ((float) this.anIntArray341[local362.anInt5345] * arg0.aFloat94 + arg0.aFloat99 * (float) this.anIntArray343[local362.anInt5345] + arg0.aFloat93 * (float) this.anIntArray342[local362.anInt5345] + arg0.aFloat91);
		}
	}

	@OriginalMember(owner = "client!ko", name = "NA", descriptor = "()I")
	@Override
	public int NA() {
		if (!this.aBoolean299) {
			this.method3303();
		}
		return this.aShort53;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	private void method3297() {
		if (this.anInt4056 == 0) {
			return;
		}
		if (this.aByte66 != 0) {
			this.method3310(true);
		}
		this.method3310(false);
		if (this.aClass61_1 != null) {
			if (this.aClass61_1.anInterface10_1 == null) {
				this.method3305((this.aByte66 & 0x10) != 0);
			}
			if (this.aClass61_1.anInterface10_1 != null) {
				this.aClass49_Sub2_22.method1587(this.aClass260_11 != null);
				this.aClass49_Sub2_22.method1618(this.aClass260_10, this.aClass260_12, this.aClass260_11, this.aClass260_13);
				@Pc(79) int local79 = this.anIntArray344.length - 1;
				for (@Pc(81) int local81 = 0; local81 < local79; local81++) {
					@Pc(88) int local88 = this.anIntArray344[local81];
					@Pc(95) int local95 = this.anIntArray344[local81 + 1];
					@Pc(102) int local102 = this.aShortArray56[local88] & 0xFFFF;
					if (local102 == 65535) {
						local102 = -1;
					}
					this.aClass49_Sub2_22.method1647(this.aClass260_11 != null, local102);
					this.aClass49_Sub2_22.method1631((local95 - local88) * 3, local88 * 3, this.aClass61_1.anInterface10_1);
				}
			}
		}
		this.method3311();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!c;Lclient!ii;II)V")
	@Override
	public void method3280(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class8_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4030 == 0) {
			return;
		}
		@Pc(16) Class35_Sub2 local16 = this.aClass49_Sub2_22.aClass35_Sub2_3;
		@Pc(19) Class35_Sub2 local19 = (Class35_Sub2) arg0;
		if (!this.aBoolean299) {
			this.method3303();
		}
		Static324.aFloat80 = local19.aFloat95 * local16.aFloat99 + local19.aFloat88 * local16.aFloat93 + local16.aFloat94 * local19.aFloat99;
		Static118.aFloat54 = local16.aFloat91 + local16.aFloat99 * local19.aFloat98 + local19.aFloat92 * local16.aFloat93 + local19.aFloat91 * local16.aFloat94;
		@Pc(72) float local72 = Static118.aFloat54 + Static324.aFloat80 * (float) this.aShort46;
		@Pc(80) float local80 = Static324.aFloat80 * (float) this.aShort50 + Static118.aFloat54;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local72 > local80) {
			local96 = (float) -this.aShort52 + local80;
			local90 = local72 + (float) this.aShort52;
		} else {
			local90 = local80 + (float) this.aShort52;
			local96 = local72 - (float) this.aShort52;
		}
		if (local96 >= this.aClass49_Sub2_22.aFloat24 || (float) this.aClass49_Sub2_22.anInt2025 >= local90) {
			return;
		}
		Static96.aFloat48 = local16.aFloat97 * local19.aFloat91 + local16.aFloat90 * local19.aFloat92 + local19.aFloat98 * local16.aFloat88 + local16.aFloat92;
		Static38.aFloat87 = local19.aFloat95 * local16.aFloat88 + local16.aFloat90 * local19.aFloat88 + local16.aFloat97 * local19.aFloat99;
		@Pc(173) float local173 = Static38.aFloat87 * (float) this.aShort46 + Static96.aFloat48;
		@Pc(181) float local181 = Static96.aFloat48 + Static38.aFloat87 * (float) this.aShort50;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local173 > local181) {
			local208 = (float) this.aClass49_Sub2_22.anInt2017 * (local173 + (float) this.aShort52);
			local197 = (float) this.aClass49_Sub2_22.anInt2017 * (local181 - (float) this.aShort52);
		} else {
			local197 = ((float) -this.aShort52 + local173) * (float) this.aClass49_Sub2_22.anInt2017;
			local208 = (local181 + (float) this.aShort52) * (float) this.aClass49_Sub2_22.anInt2017;
		}
		if (this.aClass49_Sub2_22.aFloat23 <= local197 / (float) arg2 || this.aClass49_Sub2_22.aFloat36 >= local208 / (float) arg2) {
			return;
		}
		Static292.aFloat75 = local16.aFloat89 * local19.aFloat92 + local16.aFloat95 * local19.aFloat98 + local19.aFloat91 * local16.aFloat96 + local16.aFloat98;
		Static132.aFloat55 = local19.aFloat95 * local16.aFloat95 + local19.aFloat88 * local16.aFloat89 + local19.aFloat99 * local16.aFloat96;
		@Pc(299) float local299 = Static292.aFloat75 + Static132.aFloat55 * (float) this.aShort46;
		@Pc(307) float local307 = Static132.aFloat55 * (float) this.aShort50 + Static292.aFloat75;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local299 > local307) {
			local322 = ((float) -this.aShort52 + local307) * (float) this.aClass49_Sub2_22.anInt2015;
			local333 = (local299 + (float) this.aShort52) * (float) this.aClass49_Sub2_22.anInt2015;
		} else {
			local322 = (local299 - (float) this.aShort52) * (float) this.aClass49_Sub2_22.anInt2015;
			local333 = (float) this.aClass49_Sub2_22.anInt2015 * ((float) this.aShort52 + local307);
		}
		if (local322 / (float) arg2 >= this.aClass49_Sub2_22.aFloat30 || local333 / (float) arg2 <= this.aClass49_Sub2_22.aFloat27) {
			return;
		}
		if (arg1 != null || this.aClass111Array1 != null) {
			Static86.aFloat66 = local19.aFloat97 * local16.aFloat93 + local19.aFloat96 * local16.aFloat99 + local16.aFloat94 * local19.aFloat94;
			Static106.aFloat51 = local19.aFloat96 * local16.aFloat95 + local19.aFloat97 * local16.aFloat89 + local16.aFloat96 * local19.aFloat94;
			Static356.aFloat85 = local19.aFloat93 * local16.aFloat97 + local16.aFloat88 * local19.aFloat89 + local19.aFloat90 * local16.aFloat90;
			Static55.aFloat18 = local16.aFloat95 * local19.aFloat89 + local16.aFloat89 * local19.aFloat90 + local16.aFloat96 * local19.aFloat93;
			Static36.aFloat13 = local19.aFloat96 * local16.aFloat88 + local16.aFloat90 * local19.aFloat97 + local19.aFloat94 * local16.aFloat97;
			Static36.aFloat14 = local16.aFloat94 * local19.aFloat93 + local16.aFloat99 * local19.aFloat89 + local16.aFloat93 * local19.aFloat90;
		}
		if (arg1 != null) {
			@Pc(502) int local502 = this.aShort45 + this.aShort53 >> 1;
			@Pc(511) int local511 = this.aShort51 + this.aShort48 >> 1;
			@Pc(530) int local530 = (int) ((float) this.aShort46 * Static38.aFloat87 + Static96.aFloat48 + (float) local502 * Static356.aFloat85 + (float) local511 * Static36.aFloat13);
			@Pc(549) int local549 = (int) ((float) this.aShort46 * Static132.aFloat55 + Static292.aFloat75 + (float) local502 * Static55.aFloat18 + (float) local511 * Static106.aFloat51);
			@Pc(568) int local568 = (int) (Static324.aFloat80 * (float) this.aShort46 + Static118.aFloat54 + (float) local502 * Static36.aFloat14 + (float) local511 * Static86.aFloat66);
			@Pc(587) int local587 = (int) (Static36.aFloat13 * (float) local511 + (float) this.aShort50 * Static38.aFloat87 + Static356.aFloat85 * (float) local502 + Static96.aFloat48);
			@Pc(606) int local606 = (int) ((float) local511 * Static106.aFloat51 + Static132.aFloat55 * (float) this.aShort50 + Static292.aFloat75 + Static55.aFloat18 * (float) local502);
			arg1.anInt3263 = this.aClass49_Sub2_22.anInt2048 + local530 * this.aClass49_Sub2_22.anInt2017 / arg2;
			arg1.anInt3264 = local549 * this.aClass49_Sub2_22.anInt2015 / arg2 + this.aClass49_Sub2_22.anInt2023;
			arg1.anInt3260 = local587 * this.aClass49_Sub2_22.anInt2017 / arg2 + this.aClass49_Sub2_22.anInt2048;
			@Pc(664) int local664 = (int) (Static86.aFloat66 * (float) local511 + Static118.aFloat54 + Static36.aFloat14 * (float) local502 + (float) this.aShort50 * Static324.aFloat80);
			arg1.anInt3262 = this.aClass49_Sub2_22.anInt2015 * local606 / arg2 + this.aClass49_Sub2_22.anInt2023;
			if (this.aClass49_Sub2_22.anInt2025 > local568 && local664 < this.aClass49_Sub2_22.anInt2025) {
				arg1.anInt3261 = this.aClass49_Sub2_22.anInt2048 + (local530 + this.aShort52) * this.aClass49_Sub2_22.anInt2017 / arg2 - arg1.anInt3263;
				arg1.aBoolean251 = true;
			}
		}
		this.aClass49_Sub2_22.method1578((float) arg2);
		this.aClass49_Sub2_22.method1645();
		this.aClass49_Sub2_22.method1598(local19);
		this.method3297();
		this.aClass49_Sub2_22.method1604();
		this.method3304();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!fk;B)V")
	private void method3298(@OriginalArg(0) Class2_Sub5_Sub1_Sub1 arg0) {
		if (this.anInt4030 > Static415.anIntArray586.length) {
			Static270.anIntArray409 = new int[this.anInt4030];
			Static415.anIntArray586 = new int[this.anInt4030];
		}
		@Pc(51) int local51;
		@Pc(90) int local90;
		@Pc(99) int local99;
		for (@Pc(24) int local24 = 0; local24 < this.anInt4027; local24++) {
			local51 = (this.anIntArray342[local24] - (this.anIntArray343[local24] * this.aClass49_Sub2_22.anInt2029 >> 8) >> this.aClass49_Sub2_22.anInt2003) - arg0.anInt2551;
			@Pc(76) int local76 = (this.anIntArray341[local24] - (this.anIntArray343[local24] * this.aClass49_Sub2_22.anInt2049 >> 8) >> this.aClass49_Sub2_22.anInt2003) - arg0.anInt2554;
			@Pc(81) int local81 = this.anIntArray345[local24];
			@Pc(88) int local88 = this.anIntArray345[local24 + 1];
			for (local90 = local81; local90 < local88; local90++) {
				local99 = this.aShortArray50[local90] - 1;
				if (local99 == -1) {
					break;
				}
				Static415.anIntArray586[local99] = local51;
				Static270.anIntArray409[local99] = local76;
			}
		}
		for (local51 = 0; local51 < this.anInt4056; local51++) {
			if (this.aByteArray76 == null || this.aByteArray76[local51] <= 128) {
				@Pc(143) short local143 = this.aShortArray53[local51];
				@Pc(148) short local148 = this.aShortArray49[local51];
				@Pc(153) short local153 = this.aShortArray55[local51];
				local90 = Static415.anIntArray586[local143];
				local99 = Static415.anIntArray586[local148];
				@Pc(165) int local165 = Static415.anIntArray586[local153];
				@Pc(169) int local169 = Static270.anIntArray409[local143];
				@Pc(173) int local173 = Static270.anIntArray409[local148];
				@Pc(177) int local177 = Static270.anIntArray409[local153];
				if (-((local165 - local99) * (local173 + -local169)) + (local90 - local99) * (local173 - local177) > 0) {
					arg0.method2001(local177, local169, local165, local173, local90, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method3288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class35_Sub2 local8 = (Class35_Sub2) arg2;
		@Pc(12) Class35_Sub2 local12 = this.aClass49_Sub2_22.aClass35_Sub2_3;
		@Pc(33) float local33 = local12.aFloat92 + local12.aFloat97 * local8.aFloat91 + local12.aFloat88 * local8.aFloat98 + local12.aFloat90 * local8.aFloat92;
		@Pc(54) float local54 = local8.aFloat91 * local12.aFloat96 + local8.aFloat98 * local12.aFloat95 + local12.aFloat89 * local8.aFloat92 + local12.aFloat98;
		Static38.aFloat87 = local12.aFloat97 * local8.aFloat99 + local8.aFloat95 * local12.aFloat88 + local8.aFloat88 * local12.aFloat90;
		Static324.aFloat80 = local8.aFloat99 * local12.aFloat94 + local8.aFloat88 * local12.aFloat93 + local8.aFloat95 * local12.aFloat99;
		@Pc(111) float local111 = local12.aFloat91 + local8.aFloat98 * local12.aFloat99 + local12.aFloat93 * local8.aFloat92 + local12.aFloat94 * local8.aFloat91;
		Static36.aFloat13 = local8.aFloat96 * local12.aFloat88 + local12.aFloat90 * local8.aFloat97 + local8.aFloat94 * local12.aFloat97;
		Static86.aFloat66 = local8.aFloat96 * local12.aFloat99 + local8.aFloat97 * local12.aFloat93 + local12.aFloat94 * local8.aFloat94;
		Static356.aFloat85 = local8.aFloat90 * local12.aFloat90 + local12.aFloat88 * local8.aFloat89 + local8.aFloat93 * local12.aFloat97;
		Static132.aFloat55 = local12.aFloat89 * local8.aFloat88 + local8.aFloat95 * local12.aFloat95 + local8.aFloat99 * local12.aFloat96;
		Static55.aFloat18 = local8.aFloat89 * local12.aFloat95 + local12.aFloat89 * local8.aFloat90 + local8.aFloat93 * local12.aFloat96;
		Static36.aFloat14 = local12.aFloat94 * local8.aFloat93 + local12.aFloat99 * local8.aFloat89 + local12.aFloat93 * local8.aFloat90;
		Static106.aFloat51 = local8.aFloat97 * local12.aFloat89 + local12.aFloat95 * local8.aFloat96 + local12.aFloat96 * local8.aFloat94;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass49_Sub2_22.anInt2017;
		@Pc(255) int local255 = this.aClass49_Sub2_22.anInt2015;
		if (!this.aBoolean299) {
			this.method3303();
		}
		Static120.anIntArray213[0] = this.aShort45;
		Static41.anIntArray63[0] = this.aShort46;
		Static120.anIntArray213[1] = this.aShort53;
		Static436.anIntArray606[0] = this.aShort51;
		Static41.anIntArray63[1] = this.aShort46;
		Static120.anIntArray213[2] = this.aShort45;
		Static436.anIntArray606[1] = this.aShort51;
		Static41.anIntArray63[2] = this.aShort50;
		Static120.anIntArray213[3] = this.aShort53;
		Static436.anIntArray606[2] = this.aShort51;
		Static41.anIntArray63[3] = this.aShort50;
		Static436.anIntArray606[3] = this.aShort51;
		Static120.anIntArray213[4] = this.aShort45;
		Static41.anIntArray63[4] = this.aShort46;
		Static436.anIntArray606[4] = this.aShort48;
		Static120.anIntArray213[5] = this.aShort53;
		Static41.anIntArray63[5] = this.aShort46;
		Static120.anIntArray213[6] = this.aShort45;
		Static436.anIntArray606[5] = this.aShort48;
		Static41.anIntArray63[6] = this.aShort50;
		Static120.anIntArray213[7] = this.aShort53;
		Static436.anIntArray606[6] = this.aShort48;
		Static41.anIntArray63[7] = this.aShort50;
		Static436.anIntArray606[7] = this.aShort48;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(400) float local400;
		@Pc(395) float local395;
		@Pc(390) float local390;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static436.anIntArray606[local383];
			local395 = Static41.anIntArray63[local383];
			local400 = Static120.anIntArray213[local383];
			local414 = local390 * Static86.aFloat66 + local395 * Static324.aFloat80 + local400 * Static36.aFloat14 + local111;
			local428 = local395 * Static38.aFloat87 + Static356.aFloat85 * local400 + local390 * Static36.aFloat13 + local33;
			local442 = local54 + Static106.aFloat51 * local390 + local395 * Static132.aFloat55 + local400 * Static55.aFloat18;
			if (local414 >= (float) this.aClass49_Sub2_22.anInt2025) {
				@Pc(461) float local461 = (float) this.aClass49_Sub2_22.anInt2048 + local428 * (float) local251 / local414;
				@Pc(473) float local473 = local442 * (float) local255 / local414 + (float) this.aClass49_Sub2_22.anInt2023;
				if (local461 < local241) {
					local241 = local461;
				}
				if (local461 > local243) {
					local243 = local461;
				}
				if (local247 < local473) {
					local247 = local473;
				}
				if (local245 > local473) {
					local245 = local473;
				}
				local239 = true;
			}
		}
		if (local239 && (float) arg0 > local241 && local243 > (float) arg0 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (Static415.anIntArray586.length < this.anInt4030) {
				Static415.anIntArray586 = new int[this.anInt4030];
				Static270.anIntArray409 = new int[this.anInt4030];
			}
			@Pc(626) int local626;
			for (@Pc(544) int local544 = 0; local544 < this.anInt4027; local544++) {
				local400 = this.anIntArray342[local544];
				local395 = this.anIntArray343[local544];
				local390 = this.anIntArray341[local544];
				local442 = local395 * Static132.aFloat55 + Static55.aFloat18 * local400 + Static106.aFloat51 * local390 + local54;
				local428 = local33 + Static36.aFloat13 * local390 + Static356.aFloat85 * local400 + local395 * Static38.aFloat87;
				local414 = local111 + local395 * Static324.aFloat80 + Static36.aFloat14 * local400 + Static86.aFloat66 * local390;
				@Pc(639) int local639;
				@Pc(644) int local644;
				@Pc(651) int local651;
				if ((float) this.aClass49_Sub2_22.anInt2025 <= local414) {
					local626 = (int) ((float) local251 * local428 / local414 + (float) this.aClass49_Sub2_22.anInt2048);
					local639 = (int) ((float) this.aClass49_Sub2_22.anInt2023 + (float) local255 * local442 / local414);
					local644 = this.anIntArray345[local544];
					local651 = this.anIntArray345[local544 + 1];
					for (@Pc(653) int local653 = local644; local653 < local651; local653++) {
						@Pc(662) int local662 = this.aShortArray50[local653] - 1;
						if (local662 == -1) {
							break;
						}
						Static415.anIntArray586[local662] = local626;
						Static270.anIntArray409[local662] = local639;
					}
				} else {
					local626 = this.anIntArray345[local544];
					local639 = this.anIntArray345[local544 + 1];
					for (local644 = local626; local644 < local639; local644++) {
						local651 = this.aShortArray50[local644] - 1;
						if (local651 == -1) {
							break;
						}
						Static415.anIntArray586[this.aShortArray50[local644] - 1] = -999999;
					}
				}
			}
			for (local626 = 0; local626 < this.anInt4013; local626++) {
				if (Static415.anIntArray586[this.aShortArray53[local626]] != -999999 && Static415.anIntArray586[this.aShortArray49[local626]] != -999999 && Static415.anIntArray586[this.aShortArray55[local626]] != -999999 && this.method3308(Static415.anIntArray586[this.aShortArray55[local626]], Static270.anIntArray409[this.aShortArray55[local626]], arg0, Static270.anIntArray409[this.aShortArray49[local626]], Static415.anIntArray586[this.aShortArray49[local626]], Static270.anIntArray409[this.aShortArray53[local626]], Static415.anIntArray586[this.aShortArray53[local626]], arg1)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "R", descriptor = "(I)V")
	@Override
	public void R(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class162.anIntArray388[arg0];
		@Pc(13) int local13 = Class162.anIntArray387[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4027; local15++) {
			@Pc(33) int local33 = this.anIntArray342[local15] * local13 + local9 * this.anIntArray343[local15] >> 15;
			this.anIntArray343[local15] = local13 * this.anIntArray343[local15] - this.anIntArray342[local15] * local9 >> 15;
			this.anIntArray342[local15] = local33;
		}
		this.aBoolean299 = false;
		if (this.aClass260_10 != null) {
			this.aClass260_10.anInterface1_7 = null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		if (!this.aBoolean299) {
			this.method3303();
		}
		return this.aShort50;
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "()V")
	@Override
	public void method3292() {
		if (this.anInt4030 <= 0 || this.anInt4056 <= 0) {
			return;
		}
		this.method3310(false);
		if ((this.aByte66 & 0x10) == 0 && this.aClass61_1.anInterface10_1 == null) {
			this.method3305(false);
		}
		this.method3311();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(FLclient!kq;FIIIIBIJ)S")
	private short method3300(@OriginalArg(0) float arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8) {
		@Pc(10) int local10 = this.anIntArray345[arg6];
		@Pc(17) int local17 = this.anIntArray345[arg6 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray50[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static185.aLongArray4[local21] == arg8) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray50[local19] = (short) (this.anInt4030 + 1);
		Static185.aLongArray4[local19] = arg8;
		this.aShortArray51[this.anInt4030] = (short) arg4;
		this.aShortArray54[this.anInt4030] = (short) arg5;
		this.aShortArray57[this.anInt4030] = (short) arg7;
		this.aByteArray77[this.anInt4030] = (byte) arg3;
		this.aFloatArray30[this.anInt4030] = arg0;
		this.aFloatArray29[this.anInt4030] = arg2;
		return (short) this.anInt4030++;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "()[Lclient!pd;")
	@Override
	public Class189[] method3278() {
		return this.aClass189Array3;
	}

	@OriginalMember(owner = "client!ko", name = "JA", descriptor = "(III)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4027; local7++) {
			if (arg0 != 0) {
				this.anIntArray342[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray343[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray341[local7] += arg2;
			}
		}
		if (this.aClass260_10 != null) {
			this.aClass260_10.anInterface1_7 = null;
		}
		this.aBoolean299 = false;
	}

	@OriginalMember(owner = "client!ko", name = "aa", descriptor = "(I)V")
	@Override
	public void aa(@OriginalArg(0) int arg0) {
		this.aShort49 = (short) arg0;
		if (this.aClass260_12 != null) {
			this.aClass260_12.anInterface1_7 = null;
		}
		if (this.aClass260_11 != null) {
			this.aClass260_11.anInterface1_7 = null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "BA", descriptor = "(SS)V")
	@Override
	public void BA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4013; local3++) {
			if (arg0 == this.aShortArray52[local3]) {
				this.aShortArray52[local3] = arg1;
			}
		}
		if (this.aClass111Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt4065; local30++) {
				@Pc(37) Class111 local37 = this.aClass111Array1[local30];
				@Pc(42) Class25 local42 = this.aClass25Array1[local30];
				local42.anInt605 = local42.anInt605 & 0xFF000000 | Static199.anIntArray337[this.aShortArray52[local37.anInt3160] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass260_12 != null) {
			this.aClass260_12.anInterface1_7 = null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "(IILclient!ta;Lclient!ta;III)V")
	@Override
	public void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(3) Class64 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean299) {
			this.method3303();
		}
		@Pc(16) int local16 = this.aShort45 + arg4;
		@Pc(21) int local21 = arg4 + this.aShort53;
		@Pc(26) int local26 = arg6 + this.aShort51;
		@Pc(32) int local32 = arg6 + this.aShort48;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt2927 + local21 >> arg2.anInt2932 >= arg2.anInt2934 || local26 < 0 || arg2.anInt2927 + local32 >> arg2.anInt2932 >= arg2.anInt2928)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt2934 <= local21 + arg3.anInt2927 >> arg3.anInt2932 || local26 < 0 || arg3.anInt2928 <= local32 + arg3.anInt2927 >> arg3.anInt2932) {
				return;
			}
		} else {
			local16 >>= arg2.anInt2932;
			local21 = local21 + arg2.anInt2927 - 1 >> arg2.anInt2932;
			local26 >>= arg2.anInt2932;
			local32 = local32 + arg2.anInt2927 - 1 >> arg2.anInt2932;
			if (arg5 == arg2.l(local16, local26) && arg5 == arg2.l(local21, local26) && arg2.l(local16, local32) == arg5 && arg2.l(local21, local32) == arg5) {
				return;
			}
		}
		@Pc(197) int local197;
		if (arg0 == 1) {
			for (local197 = 0; local197 < this.anInt4027; local197++) {
				this.anIntArray343[local197] -= arg5 - arg2.a(arg4 + this.anIntArray342[local197], arg6 + this.anIntArray341[local197]);
			}
		} else {
			@Pc(249) int local249;
			@Pc(260) int local260;
			if (arg0 == 2) {
				@Pc(244) short local244 = this.aShort46;
				if (local244 == 0) {
					return;
				}
				for (local249 = 0; local249 < this.anInt4027; local249++) {
					local260 = (this.anIntArray343[local249] << 16) / local244;
					if (local260 < arg1) {
						this.anIntArray343[local249] -= -((arg2.a(this.anIntArray342[local249] + arg4, this.anIntArray341[local249] + arg6) - arg5) * (arg1 + -local260) / arg1);
					}
				}
			} else {
				@Pc(347) int local347;
				if (arg0 == 3) {
					local197 = (arg1 & 0xFF) * 4;
					local249 = (arg1 >> 8 & 0xFF) * 4;
					local260 = (arg1 >> 16 & 0xFF) << 6;
					local347 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local197 >> 1) < 0 || arg4 + (local197 >> 1) + arg2.anInt2927 >= arg2.anInt2934 << arg2.anInt2932 || arg6 - (local249 >> 1) < 0 || arg6 + (local249 >> 1) + arg2.anInt2927 >= arg2.anInt2928 << arg2.anInt2932) {
						return;
					}
					this.method3293(arg5, local249, local197, arg2, local260, arg4, arg6, local347);
				} else if (arg0 == 4) {
					local197 = this.aShort50 - this.aShort46;
					for (local249 = 0; local249 < this.anInt4027; local249++) {
						this.anIntArray343[local249] -= arg5 - arg3.a(this.anIntArray342[local249] + arg4, arg6 + this.anIntArray341[local249]) - local197;
					}
				} else if (arg0 == 5) {
					local197 = this.aShort50 - this.aShort46;
					for (local249 = 0; local249 < this.anInt4027; local249++) {
						local260 = this.anIntArray342[local249] + arg4;
						local347 = arg6 + this.anIntArray341[local249];
						@Pc(448) int local448 = arg2.a(local260, local347);
						@Pc(453) int local453 = arg3.a(local260, local347);
						@Pc(458) int local458 = local448 - local453;
						this.anIntArray343[local249] = local448 + (local458 * ((this.anIntArray343[local249] << 8) / local197) >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass260_10 != null) {
			this.aClass260_10.anInterface1_7 = null;
		}
		this.aBoolean299 = false;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII)V")
	@Override
	public void method3291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt4013; local3++) {
			local12 = this.aShortArray52[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			if (arg2 != -1) {
				local28 += (arg2 - local28) * arg3 >> 7;
			}
			this.aShortArray52[local3] = (short) (local28 | local24 << 7 | local18 << 10);
		}
		if (this.aClass111Array1 != null) {
			for (local12 = 0; local12 < this.anInt4065; local12++) {
				@Pc(108) Class111 local108 = this.aClass111Array1[local12];
				@Pc(113) Class25 local113 = this.aClass25Array1[local12];
				local113.anInt605 = local113.anInt605 & 0xFF000000 | Static199.anIntArray337[this.aShortArray52[local108.anInt3160] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass260_12 != null) {
			this.aClass260_12.anInterface1_7 = null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "MA", descriptor = "()I")
	@Override
	public int MA() {
		if (!this.aBoolean299) {
			this.method3303();
		}
		return this.aShort46;
	}

	@OriginalMember(owner = "client!ko", name = "fa", descriptor = "(Lclient!ba;)Lclient!ba;")
	@Override
	public Class2_Sub5_Sub1 fa(@OriginalArg(0) Class2_Sub5_Sub1 arg0) {
		if (this.anInt4030 == 0) {
			return null;
		}
		if (!this.aBoolean299) {
			this.method3303();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass49_Sub2_22.anInt2029 > 0) {
			local40 = this.aShort45 - (this.aShort50 * this.aClass49_Sub2_22.anInt2029 >> 8) >> this.aClass49_Sub2_22.anInt2003;
			local57 = this.aShort53 - (this.aShort46 * this.aClass49_Sub2_22.anInt2029 >> 8) >> this.aClass49_Sub2_22.anInt2003;
		} else {
			local40 = this.aShort45 - (this.aShort46 * this.aClass49_Sub2_22.anInt2029 >> 8) >> this.aClass49_Sub2_22.anInt2003;
			local57 = this.aShort53 - (this.aShort50 * this.aClass49_Sub2_22.anInt2029 >> 8) >> this.aClass49_Sub2_22.anInt2003;
		}
		@Pc(117) int local117;
		@Pc(134) int local134;
		if (this.aClass49_Sub2_22.anInt2049 > 0) {
			local117 = this.aShort51 - (this.aShort50 * this.aClass49_Sub2_22.anInt2049 >> 8) >> this.aClass49_Sub2_22.anInt2003;
			local134 = this.aShort48 - (this.aClass49_Sub2_22.anInt2049 * this.aShort46 >> 8) >> this.aClass49_Sub2_22.anInt2003;
		} else {
			local117 = this.aShort51 - (this.aClass49_Sub2_22.anInt2049 * this.aShort46 >> 8) >> this.aClass49_Sub2_22.anInt2003;
			local134 = this.aShort48 - (this.aClass49_Sub2_22.anInt2049 * this.aShort50 >> 8) >> this.aClass49_Sub2_22.anInt2003;
		}
		@Pc(176) int local176 = local57 + 1 - local40;
		@Pc(183) int local183 = local134 + 1 - local117;
		@Pc(186) Class2_Sub5_Sub1_Sub1 local186 = (Class2_Sub5_Sub1_Sub1) arg0;
		@Pc(202) Class2_Sub5_Sub1_Sub1 local202;
		if (local186 != null && local186.method2004(local183, local176)) {
			local202 = local186;
			local186.method2003();
		} else {
			local202 = new Class2_Sub5_Sub1_Sub1(this.aClass49_Sub2_22, local176, local183);
		}
		local202.method2002(local40, local117, local134, local57);
		this.method3298(local202);
		return local202;
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
	private void method3303() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt4027; local23++) {
			@Pc(30) int local30 = this.anIntArray342[local23];
			@Pc(35) int local35 = this.anIntArray343[local23];
			@Pc(40) int local40 = this.anIntArray341[local23];
			if (local35 < local9) {
				local9 = local35;
			}
			if (local30 > local13) {
				local13 = local30;
			}
			if (local7 > local30) {
				local7 = local30;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			if (local40 < local11) {
				local11 = local40;
			}
			if (local40 > local17) {
				local17 = local40;
			}
			@Pc(82) int local82 = local40 * local40 + local30 * local30;
			if (local19 < local82) {
				local19 = local82;
			}
			local82 = local40 * local40 + local30 * local30 + local35 * local35;
			if (local82 > local21) {
				local21 = local82;
			}
		}
		this.aShort50 = (short) local15;
		this.aShort48 = (short) local17;
		this.aShort45 = (short) local7;
		this.aShort46 = (short) local9;
		this.aShort51 = (short) local11;
		this.aShort53 = (short) local13;
		this.aShort52 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean299 = true;
	}

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "()I")
	@Override
	public int m() {
		if (!this.aBoolean299) {
			this.method3303();
		}
		return this.aShort48;
	}

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "()I")
	@Override
	public int l() {
		return this.aShort49;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(Z)V")
	private void method3304() {
		if (this.aClass111Array1 == null) {
			return;
		}
		@Pc(8) Class35_Sub2 local8 = this.aClass49_Sub2_22.aClass35_Sub2_2;
		@Pc(12) float local12 = this.aClass49_Sub2_22.xa();
		@Pc(16) float local16 = this.aClass49_Sub2_22.W();
		this.aClass49_Sub2_22.method1599();
		this.aClass49_Sub2_22.method4416(false);
		this.aClass49_Sub2_22.method1587(false);
		this.aClass49_Sub2_22.method1618(this.aClass49_Sub2_22.aClass260_5, null, null, this.aClass49_Sub2_22.aClass260_4);
		for (@Pc(43) int local43 = 0; local43 < this.anInt4065; local43++) {
			@Pc(50) Class111 local50 = this.aClass111Array1[local43];
			@Pc(55) Class25 local55 = this.aClass25Array1[local43];
			if (!local50.aBoolean244 || !this.aClass49_Sub2_22.method4431()) {
				@Pc(83) float local83 = (float) (this.anIntArray342[local50.anInt3152] + this.anIntArray342[local50.anInt3159] + this.anIntArray342[local50.anInt3154]) * 0.3333333F;
				@Pc(105) float local105 = (float) (this.anIntArray343[local50.anInt3152] + this.anIntArray343[local50.anInt3154] + this.anIntArray343[local50.anInt3159]) * 0.3333333F;
				@Pc(127) float local127 = (float) (this.anIntArray341[local50.anInt3159] + this.anIntArray341[local50.anInt3154] + this.anIntArray341[local50.anInt3152]) * 0.3333333F;
				@Pc(141) float local141 = Static96.aFloat48 + local127 * Static36.aFloat13 + Static356.aFloat85 * local83 + Static38.aFloat87 * local105;
				@Pc(155) float local155 = Static292.aFloat75 + Static106.aFloat51 * local127 + Static55.aFloat18 * local83 + Static132.aFloat55 * local105;
				@Pc(169) float local169 = Static118.aFloat54 + local105 * Static324.aFloat80 + local83 * Static36.aFloat14 + Static86.aFloat66 * local127;
				local8.method5048(-local169, local55.anInt613, (float) local55.anInt609 + local141, local55.anInt608 * local50.aShort39 >> 7, local55.anInt617 * local50.aShort38 >> 7, (float) local55.anInt610 - local155);
				this.aClass49_Sub2_22.method1660(local8);
				this.aClass49_Sub2_22.g(local16, local12 - (float) local50.anInt3158 * 1.5F);
				@Pc(220) int local220 = local55.anInt605;
				OpenGL.glColor4ub((byte) (local220 >> 16), (byte) (local220 >> 8), (byte) local220, (byte) (local220 >> 24));
				this.aClass49_Sub2_22.method1594(local50.aShort37);
				this.aClass49_Sub2_22.method1626(local50.aByte50);
				this.aClass49_Sub2_22.method1624(local50.aByte49);
				this.aClass49_Sub2_22.method1610(4);
			}
		}
		this.aClass49_Sub2_22.g(local16, local12);
		this.aClass49_Sub2_22.method4416(true);
		this.aClass49_Sub2_22.method1604();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BZ)V")
	private void method3305(@OriginalArg(1) boolean arg0) {
		if (this.anInt4056 * 6 <= Static235.aClass2_Sub23_Sub1_6.aByteArray130.length) {
			Static235.aClass2_Sub23_Sub1_6.anInt6952 = 0;
		} else {
			Static235.aClass2_Sub23_Sub1_6 = new Class2_Sub23_Sub1((this.anInt4056 + 100) * 6);
		}
		@Pc(38) int local38;
		if (this.aClass49_Sub2_22.aBoolean111) {
			for (local38 = 0; local38 < this.anInt4056; local38++) {
				Static235.aClass2_Sub23_Sub1_6.method5502(this.aShortArray53[local38]);
				Static235.aClass2_Sub23_Sub1_6.method5502(this.aShortArray49[local38]);
				Static235.aClass2_Sub23_Sub1_6.method5502(this.aShortArray55[local38]);
			}
		} else {
			for (local38 = 0; local38 < this.anInt4056; local38++) {
				Static235.aClass2_Sub23_Sub1_6.method5457(this.aShortArray53[local38]);
				Static235.aClass2_Sub23_Sub1_6.method5457(this.aShortArray49[local38]);
				Static235.aClass2_Sub23_Sub1_6.method5457(this.aShortArray55[local38]);
			}
		}
		if (Static235.aClass2_Sub23_Sub1_6.anInt6952 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface10_3 == null) {
				this.anInterface10_3 = this.aClass49_Sub2_22.method1591(Static235.aClass2_Sub23_Sub1_6.anInt6952, true, Static235.aClass2_Sub23_Sub1_6.aByteArray130);
			} else {
				this.anInterface10_3.method2312(Static235.aClass2_Sub23_Sub1_6.anInt6952, Static235.aClass2_Sub23_Sub1_6.aByteArray130);
			}
			this.aClass61_1.anInterface10_1 = this.anInterface10_3;
		} else {
			this.aClass61_1.anInterface10_1 = this.aClass49_Sub2_22.method1591(Static235.aClass2_Sub23_Sub1_6.anInt6952, false, Static235.aClass2_Sub23_Sub1_6.aByteArray130);
		}
		if (!arg0) {
			this.aBoolean300 = true;
		}
	}

	@OriginalMember(owner = "client!ko", name = "I", descriptor = "(SS)V")
	@Override
	public void I(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass49_Sub2_22.anInterface4_6;
		for (@Pc(11) int local11 = 0; local11 < this.anInt4013; local11++) {
			if (arg0 == this.aShortArray56[local11]) {
				this.aShortArray56[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(51) Class140 local51 = local9.method3794(arg0 & 0xFFFF);
			local39 = local51.aByte59;
			local41 = local51.aByte65;
		}
		@Pc(59) byte local59 = 0;
		@Pc(61) byte local61 = 0;
		if (arg1 != -1) {
			@Pc(72) Class140 local72 = local9.method3794(arg1 & 0xFFFF);
			local59 = local72.aByte59;
			local61 = local72.aByte65;
		}
		if (!(local39 != local59 | local41 != local61)) {
			return;
		}
		if (this.aClass111Array1 != null) {
			for (@Pc(101) int local101 = 0; local101 < this.anInt4065; local101++) {
				@Pc(108) Class111 local108 = this.aClass111Array1[local101];
				@Pc(113) Class25 local113 = this.aClass25Array1[local101];
				local113.anInt605 = Static199.anIntArray337[this.aShortArray52[local108.anInt3160] & 0xFFFF] & 0xFFFFFF | local113.anInt605 & 0xFF000000;
			}
		}
		if (this.aClass260_12 != null) {
			this.aClass260_12.anInterface1_7 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "()V")
	@Override
	protected void j() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4063; local3++) {
			this.anIntArray342[local3] = this.anIntArray342[local3] + 7 >> 4;
			this.anIntArray343[local3] = this.anIntArray343[local3] + 7 >> 4;
			this.anIntArray341[local3] = this.anIntArray341[local3] + 7 >> 4;
		}
		this.aBoolean299 = false;
		if (this.aClass260_10 != null) {
			this.aClass260_10.anInterface1_7 = null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BIZ)Lclient!t;")
	@Override
	public Class91 method3285(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) Class91_Sub2 local22;
		@Pc(26) Class91_Sub2 local26;
		if (arg0 == 1) {
			local22 = this.aClass49_Sub2_22.aClass91_Sub2_5;
			local26 = this.aClass49_Sub2_22.aClass91_Sub2_4;
		} else if (arg0 == 2) {
			local22 = this.aClass49_Sub2_22.aClass91_Sub2_8;
			local26 = this.aClass49_Sub2_22.aClass91_Sub2_6;
		} else if (arg0 == 3) {
			local22 = this.aClass49_Sub2_22.aClass91_Sub2_10;
			local26 = this.aClass49_Sub2_22.aClass91_Sub2_2;
		} else if (arg0 == 4) {
			local26 = this.aClass49_Sub2_22.aClass91_Sub2_7;
			local22 = this.aClass49_Sub2_22.aClass91_Sub2_9;
		} else if (arg0 == 5) {
			local26 = this.aClass49_Sub2_22.aClass91_Sub2_3;
			local22 = this.aClass49_Sub2_22.aClass91_Sub2_1;
		} else {
			local22 = local26 = new Class91_Sub2(this.aClass49_Sub2_22);
		}
		return this.method3309(arg2, local26, local22, arg1, arg0 != 0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!t;IIIZ)V")
	@Override
	public void method3289(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class91_Sub2 local8 = (Class91_Sub2) arg0;
		if (this.anInt4013 == 0 || local8.anInt4013 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt4027;
		@Pc(27) int[] local27 = local8.anIntArray342;
		@Pc(30) int[] local30 = local8.anIntArray343;
		@Pc(33) int[] local33 = local8.anIntArray341;
		@Pc(36) short[] local36 = local8.aShortArray51;
		@Pc(39) short[] local39 = local8.aShortArray54;
		@Pc(42) short[] local42 = local8.aShortArray57;
		@Pc(45) byte[] local45 = local8.aByteArray77;
		@Pc(60) short[] local60;
		@Pc(52) short[] local52;
		@Pc(64) short[] local64;
		@Pc(56) byte[] local56;
		if (this.aClass169_1 == null) {
			local60 = null;
			local56 = null;
			local64 = null;
			local52 = null;
		} else {
			local52 = this.aClass169_1.aShortArray76;
			local56 = this.aClass169_1.aByteArray98;
			local60 = this.aClass169_1.aShortArray74;
			local64 = this.aClass169_1.aShortArray75;
		}
		@Pc(85) short[] local85;
		@Pc(79) short[] local79;
		@Pc(83) short[] local83;
		@Pc(81) byte[] local81;
		if (local8.aClass169_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local79 = local8.aClass169_1.aShortArray76;
			local83 = local8.aClass169_1.aShortArray75;
			local85 = local8.aClass169_1.aShortArray74;
			local81 = local8.aClass169_1.aByteArray98;
		}
		@Pc(106) int[] local106 = local8.anIntArray345;
		@Pc(109) short[] local109 = local8.aShortArray50;
		if (!local8.aBoolean299) {
			local8.method3303();
		}
		@Pc(118) short local118 = local8.aShort46;
		@Pc(121) short local121 = local8.aShort50;
		@Pc(124) short local124 = local8.aShort45;
		@Pc(127) short local127 = local8.aShort53;
		@Pc(130) short local130 = local8.aShort51;
		@Pc(133) short local133 = local8.aShort48;
		for (@Pc(135) int local135 = 0; local135 < this.anInt4027; local135++) {
			@Pc(145) int local145 = this.anIntArray343[local135] - arg2;
			if (local118 <= local145 && local145 <= local121) {
				@Pc(160) int local160 = this.anIntArray342[local135] - arg1;
				if (local160 >= local124 && local127 >= local160) {
					@Pc(176) int local176 = this.anIntArray341[local135] - arg3;
					if (local176 >= local130 && local133 >= local176) {
						@Pc(190) int local190 = -1;
						@Pc(195) int local195 = this.anIntArray345[local135];
						@Pc(202) int local202 = this.anIntArray345[local135 + 1];
						for (@Pc(204) int local204 = local195; local204 < local202; local204++) {
							local190 = this.aShortArray50[local204] - 1;
							if (local190 == -1 || this.aByteArray77[local190] != 0) {
								break;
							}
						}
						if (local190 != -1) {
							for (@Pc(237) int local237 = 0; local237 < local24; local237++) {
								if (local160 == local27[local237] && local33[local237] == local176 && local145 == local30[local237]) {
									@Pc(260) int local260 = -1;
									local195 = local106[local237];
									local202 = local106[local237 + 1];
									for (@Pc(272) int local272 = local195; local272 < local202; local272++) {
										local260 = local109[local272] - 1;
										if (local260 == -1 || local45[local260] != 0) {
											break;
										}
									}
									if (local260 != -1) {
										if (local60 == null) {
											this.aClass169_1 = new Class169();
											local60 = this.aClass169_1.aShortArray74 = Static72.method1337(this.aShortArray51);
											local52 = this.aClass169_1.aShortArray76 = Static72.method1337(this.aShortArray54);
											local64 = this.aClass169_1.aShortArray75 = Static72.method1337(this.aShortArray57);
											local56 = this.aClass169_1.aByteArray98 = Static202.method3248(this.aByteArray77);
										}
										if (local85 == null) {
											@Pc(349) Class169 local349 = local8.aClass169_1 = new Class169();
											local85 = local349.aShortArray74 = Static72.method1337(local36);
											local79 = local349.aShortArray76 = Static72.method1337(local39);
											local83 = local349.aShortArray75 = Static72.method1337(local42);
											local81 = local349.aByteArray98 = Static202.method3248(local45);
										}
										@Pc(382) short local382 = this.aShortArray51[local190];
										@Pc(387) short local387 = this.aShortArray54[local190];
										@Pc(392) short local392 = this.aShortArray57[local190];
										local195 = local106[local237];
										@Pc(401) byte local401 = this.aByteArray77[local190];
										local202 = local106[local237 + 1];
										@Pc(417) int local417;
										for (@Pc(409) int local409 = local195; local409 < local202; local409++) {
											local417 = local109[local409] - 1;
											if (local417 == -1) {
												break;
											}
											if (local81[local417] != 0) {
												local85[local417] += local382;
												local79[local417] += local387;
												local83[local417] += local392;
												local81[local417] += local401;
											}
										}
										local195 = this.anIntArray345[local135];
										local382 = local36[local260];
										local392 = local42[local260];
										local202 = this.anIntArray345[local135 + 1];
										local387 = local39[local260];
										local401 = local45[local260];
										for (local417 = local195; local417 < local202; local417++) {
											@Pc(503) int local503 = this.aShortArray50[local417] - 1;
											if (local503 == -1) {
												break;
											}
											if (local56[local503] != 0) {
												local60[local503] += local382;
												local52[local503] += local387;
												local64[local503] += local392;
												local56[local503] += local401;
											}
										}
										if (this.aClass260_11 == null && this.aClass260_12 != null) {
											this.aClass260_12.anInterface1_7 = null;
										}
										if (this.aClass260_11 != null) {
											this.aClass260_11.anInterface1_7 = null;
										}
										if (local8.aClass260_11 == null && local8.aClass260_12 != null) {
											local8.aClass260_12.anInterface1_7 = null;
										}
										if (local8.aClass260_11 != null) {
											local8.aClass260_11.anInterface1_7 = null;
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

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "()Z")
	@Override
	public boolean method3287() {
		if (this.aShortArray56 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray56.length; local12++) {
			if (this.aShortArray56[local12] != -1 && !this.aClass49_Sub2_22.anInterface4_6.method3792(this.aShortArray56[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ko", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		if (!this.aBoolean299) {
			this.method3303();
		}
		return this.aShort51;
	}

	@OriginalMember(owner = "client!ko", name = "w", descriptor = "()Z")
	@Override
	protected boolean w() {
		if (this.anIntArrayArray39 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt4063; local12++) {
			this.anIntArray342[local12] <<= 0x4;
			this.anIntArray343[local12] <<= 0x4;
			this.anIntArray341[local12] <<= 0x4;
		}
		Static253.anInt4754 = 0;
		Static204.anInt3384 = 0;
		Static338.anInt6360 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ko", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean299) {
			this.method3303();
		}
		return this.aShort52;
	}

	@OriginalMember(owner = "client!ko", name = "P", descriptor = "()I")
	@Override
	public int P() {
		return this.anInt4019;
	}

	@OriginalMember(owner = "client!ko", name = "XA", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg2 << 4;
			local25 = arg3 << 4;
			Static204.anInt3384 = 0;
			Static338.anInt6360 = 0;
			local31 = 0;
			Static253.anInt4754 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray39.length > local41) {
					local51 = this.anIntArrayArray39[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static338.anInt6360 += this.anIntArray342[local59];
						Static253.anInt4754 += this.anIntArray343[local59];
						Static204.anInt3384 += this.anIntArray341[local59];
						local31++;
					}
				}
			}
			if (local31 <= 0) {
				Static338.anInt6360 = local21;
				Static204.anInt3384 = local17;
				Static253.anInt4754 = local25;
			} else {
				Static204.anInt3384 = local17 + Static204.anInt3384 / local31;
				Static338.anInt6360 = local21 + Static338.anInt6360 / local31;
				Static253.anInt4754 = Static253.anInt4754 / local31 + local25;
			}
			return;
		}
		@Pc(163) int[] local163;
		@Pc(165) int local165;
		if (arg0 == 1) {
			local21 = arg2 << 4;
			local25 = arg3 << 4;
			local17 = arg4 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray39.length) {
					local163 = this.anIntArrayArray39[local35];
					for (local165 = 0; local165 < local163.length; local165++) {
						local53 = local163[local165];
						this.anIntArray342[local53] += local21;
						this.anIntArray343[local53] += local25;
						this.anIntArray341[local53] += local17;
					}
				}
			}
			return;
		}
		@Pc(289) int local289;
		@Pc(308) int local308;
		@Pc(766) int local766;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray39.length) {
					local163 = this.anIntArrayArray39[local35];
					if ((arg5 & 0x1) == 0) {
						for (local165 = 0; local165 < local163.length; local165++) {
							local53 = local163[local165];
							this.anIntArray342[local53] -= Static338.anInt6360;
							this.anIntArray343[local53] -= Static253.anInt4754;
							this.anIntArray341[local53] -= Static204.anInt3384;
							if (arg4 != 0) {
								local59 = Class162.anIntArray388[arg4];
								local289 = Class162.anIntArray387[arg4];
								local308 = local59 * this.anIntArray343[local53] + this.anIntArray342[local53] * local289 + 32767 >> 15;
								this.anIntArray343[local53] = local289 * this.anIntArray343[local53] + 32767 - this.anIntArray342[local53] * local59 >> 15;
								this.anIntArray342[local53] = local308;
							}
							if (arg2 != 0) {
								local59 = Class162.anIntArray388[arg2];
								local289 = Class162.anIntArray387[arg2];
								local308 = this.anIntArray343[local53] * local289 + 32767 - this.anIntArray341[local53] * local59 >> 15;
								this.anIntArray341[local53] = local289 * this.anIntArray341[local53] + local59 * this.anIntArray343[local53] + 32767 >> 15;
								this.anIntArray343[local53] = local308;
							}
							if (arg3 != 0) {
								local59 = Class162.anIntArray388[arg3];
								local289 = Class162.anIntArray387[arg3];
								local308 = local59 * this.anIntArray341[local53] + local289 * this.anIntArray342[local53] + 32767 >> 15;
								this.anIntArray341[local53] = this.anIntArray341[local53] * local289 + 32767 - this.anIntArray342[local53] * local59 >> 15;
								this.anIntArray342[local53] = local308;
							}
							this.anIntArray342[local53] += Static338.anInt6360;
							this.anIntArray343[local53] += Static253.anInt4754;
							this.anIntArray341[local53] += Static204.anInt3384;
						}
					} else {
						for (local165 = 0; local165 < local163.length; local165++) {
							local53 = local163[local165];
							this.anIntArray342[local53] -= Static338.anInt6360;
							this.anIntArray343[local53] -= Static253.anInt4754;
							this.anIntArray341[local53] -= Static204.anInt3384;
							if (arg2 != 0) {
								local59 = Class162.anIntArray388[arg2];
								local289 = Class162.anIntArray387[arg2];
								local308 = this.anIntArray343[local53] * local289 + 32767 - local59 * this.anIntArray341[local53] >> 15;
								this.anIntArray341[local53] = local289 * this.anIntArray341[local53] + local59 * this.anIntArray343[local53] + 32767 >> 15;
								this.anIntArray343[local53] = local308;
							}
							if (arg4 != 0) {
								local59 = Class162.anIntArray388[arg4];
								local289 = Class162.anIntArray387[arg4];
								local308 = this.anIntArray343[local53] * local59 + this.anIntArray342[local53] * local289 + 32767 >> 15;
								this.anIntArray343[local53] = this.anIntArray343[local53] * local289 + 32767 - this.anIntArray342[local53] * local59 >> 15;
								this.anIntArray342[local53] = local308;
							}
							if (arg3 != 0) {
								local59 = Class162.anIntArray388[arg3];
								local289 = Class162.anIntArray387[arg3];
								local308 = local59 * this.anIntArray341[local53] + local289 * this.anIntArray342[local53] + 32767 >> 15;
								this.anIntArray341[local53] = this.anIntArray341[local53] * local289 + 32767 - this.anIntArray342[local53] * local59 >> 15;
								this.anIntArray342[local53] = local308;
							}
							this.anIntArray342[local53] += Static338.anInt6360;
							this.anIntArray343[local53] += Static253.anInt4754;
							this.anIntArray341[local53] += Static204.anInt3384;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray39.length) {
						local51 = this.anIntArrayArray39[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local289 = this.anIntArray345[local59];
							local308 = this.anIntArray345[local59 + 1];
							for (local766 = local289; local766 < local308; local766++) {
								@Pc(775) int local775 = this.aShortArray50[local766] - 1;
								if (local775 == -1) {
									break;
								}
								@Pc(788) int local788;
								@Pc(792) int local792;
								@Pc(810) int local810;
								if (arg4 != 0) {
									local788 = Class162.anIntArray388[arg4];
									local792 = Class162.anIntArray387[arg4];
									local810 = local792 * this.aShortArray51[local775] + this.aShortArray54[local775] * local788 + 32767 >> 15;
									this.aShortArray54[local775] = (short) (local792 * this.aShortArray54[local775] + 32767 - local788 * this.aShortArray51[local775] >> 15);
									this.aShortArray51[local775] = (short) local810;
								}
								if (arg2 != 0) {
									local788 = Class162.anIntArray388[arg2];
									local792 = Class162.anIntArray387[arg2];
									local810 = local792 * this.aShortArray54[local775] + 32767 - local788 * this.aShortArray57[local775] >> 15;
									this.aShortArray57[local775] = (short) (this.aShortArray57[local775] * local792 + this.aShortArray54[local775] * local788 + 32767 >> 15);
									this.aShortArray54[local775] = (short) local810;
								}
								if (arg3 != 0) {
									local788 = Class162.anIntArray388[arg3];
									local792 = Class162.anIntArray387[arg3];
									local810 = this.aShortArray57[local775] * local788 + this.aShortArray51[local775] * local792 + 32767 >> 15;
									this.aShortArray57[local775] = (short) (this.aShortArray57[local775] * local792 + 32767 - local788 * this.aShortArray51[local775] >> 15);
									this.aShortArray51[local775] = (short) local810;
								}
							}
						}
					}
				}
				if (this.aClass260_11 == null && this.aClass260_12 != null) {
					this.aClass260_12.anInterface1_7 = null;
				}
				if (this.aClass260_11 != null) {
					this.aClass260_11.anInterface1_7 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray39.length > local35) {
					local163 = this.anIntArrayArray39[local35];
					for (local165 = 0; local165 < local163.length; local165++) {
						local53 = local163[local165];
						this.anIntArray342[local53] -= Static338.anInt6360;
						this.anIntArray343[local53] -= Static253.anInt4754;
						this.anIntArray341[local53] -= Static204.anInt3384;
						this.anIntArray342[local53] = this.anIntArray342[local53] * arg2 >> 7;
						this.anIntArray343[local53] = arg3 * this.anIntArray343[local53] >> 7;
						this.anIntArray341[local53] = arg4 * this.anIntArray341[local53] >> 7;
						this.anIntArray342[local53] += Static338.anInt6360;
						this.anIntArray343[local53] += Static253.anInt4754;
						this.anIntArray341[local53] += Static204.anInt3384;
					}
				}
			}
		} else {
			@Pc(1216) Class111 local1216;
			@Pc(1221) Class25 local1221;
			if (arg0 == 5) {
				if (this.anIntArrayArray38 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray38.length > local35) {
							local163 = this.anIntArrayArray38[local35];
							for (local165 = 0; local165 < local163.length; local165++) {
								local53 = local163[local165];
								local59 = arg2 * 8 + (this.aByteArray76[local53] & 0xFF);
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray76[local53] = (byte) local59;
							}
							if (local163.length > 0 && this.aClass260_12 != null) {
								this.aClass260_12.anInterface1_7 = null;
							}
						}
					}
					if (this.aClass111Array1 != null) {
						for (local35 = 0; local35 < this.anInt4065; local35++) {
							local1216 = this.aClass111Array1[local35];
							local1221 = this.aClass25Array1[local35];
							local1221.anInt605 = local1221.anInt605 & 0xFFFFFF | 255 - (this.aByteArray76[local1216.anInt3160] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1468) Class25 local1468;
				if (arg0 == 8) {
					if (this.anIntArrayArray37 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray37.length) {
								local163 = this.anIntArrayArray37[local35];
								for (local165 = 0; local165 < local163.length; local165++) {
									local1468 = this.aClass25Array1[local163[local165]];
									local1468.anInt610 += arg3;
									local1468.anInt609 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray37 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray37.length > local35) {
								local163 = this.anIntArrayArray37[local35];
								for (local165 = 0; local165 < local163.length; local165++) {
									local1468 = this.aClass25Array1[local163[local165]];
									local1468.anInt617 = local1468.anInt617 * arg3 >> 7;
									local1468.anInt608 = arg2 * local1468.anInt608 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray37 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray37.length > local35) {
							local163 = this.anIntArrayArray37[local35];
							for (local165 = 0; local165 < local163.length; local165++) {
								local1468 = this.aClass25Array1[local163[local165]];
								local1468.anInt613 = local1468.anInt613 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray38 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray38.length) {
						local163 = this.anIntArrayArray38[local35];
						for (local165 = 0; local165 < local163.length; local165++) {
							local53 = local163[local165];
							local59 = this.aShortArray52[local53] & 0xFFFF;
							local289 = local59 >> 10 & 0x3F;
							local308 = local59 >> 7 & 0x7;
							local766 = local59 & 0x7F;
							local308 += arg3 / 4;
							@Pc(1323) int local1323 = arg2 + local289 & 0x3F;
							local766 += arg4;
							if (local308 < 0) {
								local308 = 0;
							} else if (local308 > 7) {
								local308 = 7;
							}
							if (local766 < 0) {
								local766 = 0;
							} else if (local766 > 127) {
								local766 = 127;
							}
							this.aShortArray52[local53] = (short) (local766 | local308 << 7 | local1323 << 10);
						}
						if (local163.length > 0 && this.aClass260_12 != null) {
							this.aClass260_12.anInterface1_7 = null;
						}
					}
				}
				if (this.aClass111Array1 != null) {
					for (local35 = 0; local35 < this.anInt4065; local35++) {
						local1216 = this.aClass111Array1[local35];
						local1221 = this.aClass25Array1[local35];
						local1221.anInt605 = Static199.anIntArray337[this.aShortArray52[local1216.anInt3160] & 0xFFFF] & 0xFFFFFF | local1221.anInt605 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "M", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void M(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			Static338.anInt6360 = 0;
			local29 = 0;
			Static253.anInt4754 = 0;
			Static204.anInt3384 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray39.length) {
					local51 = this.anIntArrayArray39[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray58 == null || (this.aShortArray58[local59] & arg6) != 0) {
							Static338.anInt6360 += this.anIntArray342[local59];
							Static253.anInt4754 += this.anIntArray343[local59];
							local29++;
							Static204.anInt3384 += this.anIntArray341[local59];
						}
					}
				}
			}
			if (local29 <= 0) {
				Static253.anInt4754 = arg3;
				Static338.anInt6360 = arg2;
				Static204.anInt3384 = arg4;
			} else {
				Static253.anInt4754 = Static253.anInt4754 / local29 + arg3;
				Static150.aBoolean306 = true;
				Static338.anInt6360 = Static338.anInt6360 / local29 + arg2;
				Static204.anInt3384 = Static204.anInt3384 / local29 + arg4;
			}
			return;
		}
		@Pc(246) int[] local246;
		@Pc(248) int local248;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg7[0] * arg2 + arg7[1] * arg3 + arg4 * arg7[2] + 16384 >> 15;
				local35 = arg7[3] * arg2 + arg3 * arg7[4] + arg4 * arg7[5] + 16384 >> 15;
				local41 = arg3 * arg7[7] + arg7[6] * arg2 + arg7[8] * arg4 + 16384 >> 15;
				arg3 = local35;
				arg2 = local29;
				arg4 = local41;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray39.length) {
					local246 = this.anIntArrayArray39[local35];
					for (local248 = 0; local248 < local246.length; local248++) {
						local53 = local246[local248];
						if (this.aShortArray58 == null || (arg6 & this.aShortArray58[local53]) != 0) {
							this.anIntArray342[local53] += arg2;
							this.anIntArray343[local53] += arg3;
							this.anIntArray341[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(382) int local382;
		@Pc(400) int local400;
		@Pc(640) int local640;
		@Pc(649) int local649;
		@Pc(662) int local662;
		@Pc(666) int local666;
		@Pc(684) int local684;
		@Pc(1027) int local1027;
		@Pc(1035) int local1035;
		@Pc(1191) int local1191;
		@Pc(1216) int local1216;
		@Pc(1220) int local1220;
		@Pc(1229) int local1229;
		@Pc(1234) int local1234;
		@Pc(1238) int local1238;
		@Pc(1242) int local1242;
		@Pc(1244) int local1244;
		@Pc(1372) int[] local1372;
		@Pc(1374) int local1374;
		@Pc(1378) int local1378;
		@Pc(1382) int local1382;
		@Pc(1384) int local1384;
		@Pc(1512) int local1512;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray39.length) {
						local246 = this.anIntArrayArray39[local35];
						for (local248 = 0; local248 < local246.length; local248++) {
							local53 = local246[local248];
							if (this.aShortArray58 == null || (arg6 & this.aShortArray58[local53]) != 0) {
								this.anIntArray342[local53] -= Static338.anInt6360;
								this.anIntArray343[local53] -= Static253.anInt4754;
								this.anIntArray341[local53] -= Static204.anInt3384;
								if (arg4 != 0) {
									local59 = Class162.anIntArray388[arg4];
									local382 = Class162.anIntArray387[arg4];
									local400 = local59 * this.anIntArray343[local53] + this.anIntArray342[local53] * local382 + 32767 >> 15;
									this.anIntArray343[local53] = this.anIntArray343[local53] * local382 + 32767 - local59 * this.anIntArray342[local53] >> 15;
									this.anIntArray342[local53] = local400;
								}
								if (arg2 != 0) {
									local59 = Class162.anIntArray388[arg2];
									local382 = Class162.anIntArray387[arg2];
									local400 = this.anIntArray343[local53] * local382 + 32767 - local59 * this.anIntArray341[local53] >> 15;
									this.anIntArray341[local53] = this.anIntArray343[local53] * local59 + local382 * this.anIntArray341[local53] + 32767 >> 15;
									this.anIntArray343[local53] = local400;
								}
								if (arg3 != 0) {
									local59 = Class162.anIntArray388[arg3];
									local382 = Class162.anIntArray387[arg3];
									local400 = this.anIntArray341[local53] * local59 + local382 * this.anIntArray342[local53] + 32767 >> 15;
									this.anIntArray341[local53] = local382 * this.anIntArray341[local53] + 32767 - local59 * this.anIntArray342[local53] >> 15;
									this.anIntArray342[local53] = local400;
								}
								this.anIntArray342[local53] += Static338.anInt6360;
								this.anIntArray343[local53] += Static253.anInt4754;
								this.anIntArray341[local53] += Static204.anInt3384;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray39.length) {
							local51 = this.anIntArrayArray39[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray58 == null || (this.aShortArray58[local59] & arg6) != 0) {
									local382 = this.anIntArray345[local59];
									local400 = this.anIntArray345[local59 + 1];
									for (local640 = local382; local640 < local400; local640++) {
										local649 = this.aShortArray50[local640] - 1;
										if (local649 == -1) {
											break;
										}
										if (arg4 != 0) {
											local662 = Class162.anIntArray388[arg4];
											local666 = Class162.anIntArray387[arg4];
											local684 = this.aShortArray51[local649] * local666 + this.aShortArray54[local649] * local662 + 32767 >> 15;
											this.aShortArray54[local649] = (short) (this.aShortArray54[local649] * local666 + 32767 - this.aShortArray51[local649] * local662 >> 15);
											this.aShortArray51[local649] = (short) local684;
										}
										if (arg2 != 0) {
											local662 = Class162.anIntArray388[arg2];
											local666 = Class162.anIntArray387[arg2];
											local684 = this.aShortArray54[local649] * local666 + 32767 - local662 * this.aShortArray57[local649] >> 15;
											this.aShortArray57[local649] = (short) (this.aShortArray54[local649] * local662 + this.aShortArray57[local649] * local666 + 32767 >> 15);
											this.aShortArray54[local649] = (short) local684;
										}
										if (arg3 != 0) {
											local662 = Class162.anIntArray388[arg3];
											local666 = Class162.anIntArray387[arg3];
											local684 = this.aShortArray57[local649] * local662 + local666 * this.aShortArray51[local649] + 32767 >> 15;
											this.aShortArray57[local649] = (short) (local666 * this.aShortArray57[local649] + 32767 - local662 * this.aShortArray51[local649] >> 15);
											this.aShortArray51[local649] = (short) local684;
										}
									}
								}
							}
						}
					}
					if (this.aClass260_11 == null && this.aClass260_12 != null) {
						this.aClass260_12.anInterface1_7 = null;
					}
					if (this.aClass260_11 != null) {
						this.aClass260_11.anInterface1_7 = null;
						return;
					}
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local248 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static150.aBoolean306) {
					local382 = Static204.anInt3384 * arg7[6] + Static338.anInt6360 * arg7[0] + arg7[3] * Static253.anInt4754 + 16384 >> 15;
					local400 = arg7[7] * Static204.anInt3384 + arg7[1] * Static338.anInt6360 + arg7[4] * Static253.anInt4754 + 16384 >> 15;
					local400 += local53;
					local640 = arg7[8] * Static204.anInt3384 + Static338.anInt6360 * arg7[2] + arg7[5] * Static253.anInt4754 + 16384 >> 15;
					local382 += local248;
					local640 += local59;
					Static338.anInt6360 = local382;
					Static253.anInt4754 = local400;
					Static204.anInt3384 = local640;
					Static150.aBoolean306 = false;
				}
				@Pc(995) int[] local995 = new int[9];
				local400 = Class162.anIntArray387[arg2];
				local640 = Class162.anIntArray388[arg2];
				local649 = Class162.anIntArray387[arg3];
				local662 = Class162.anIntArray388[arg3];
				local666 = Class162.anIntArray387[arg4];
				local684 = Class162.anIntArray388[arg4];
				local1027 = local640 * local666 + 16384 >> 15;
				local1035 = local684 * local640 + 16384 >> 15;
				local995[1] = -local649 * local684 + local662 * local1027 + 16384 >> 15;
				local995[4] = local400 * local666 + 16384 >> 15;
				local995[5] = -local640;
				local995[6] = -local662 * local666 + local1035 * local649 + 16384 >> 15;
				local995[2] = local400 * local662 + 16384 >> 15;
				local995[0] = local1035 * local662 + local666 * local649 + 16384 >> 15;
				local995[3] = local684 * local400 + 16384 >> 15;
				local995[8] = local400 * local649 + 16384 >> 15;
				local995[7] = local662 * local684 + local649 * local1027 + 16384 >> 15;
				@Pc(1166) int local1166 = local995[0] * -Static338.anInt6360 + -Static253.anInt4754 * local995[1] + local995[2] * -Static204.anInt3384 + 16384 >> 15;
				local1191 = -Static253.anInt4754 * local995[4] + local995[3] * -Static338.anInt6360 + local995[5] * -Static204.anInt3384 + 16384 >> 15;
				local1216 = local995[8] * -Static204.anInt3384 + local995[6] * -Static338.anInt6360 + -Static253.anInt4754 * local995[7] + 16384 >> 15;
				local1220 = local1166 + Static338.anInt6360;
				@Pc(1225) int local1225 = local1191 + Static253.anInt4754;
				local1229 = local1216 + Static204.anInt3384;
				@Pc(1232) int[] local1232 = new int[9];
				for (local1234 = 0; local1234 < 3; local1234++) {
					for (local1238 = 0; local1238 < 3; local1238++) {
						local1242 = 0;
						for (local1244 = 0; local1244 < 3; local1244++) {
							local1242 += arg7[local1244 + local1238 * 3] * local995[local1234 * 3 + local1244];
						}
						local1232[local1238 + local1234 * 3] = local1242 + 16384 >> 15;
					}
				}
				local1238 = local59 * local995[2] + local995[0] * local248 + local53 * local995[1] + 16384 >> 15;
				local1242 = local59 * local995[5] + local995[3] * local248 + local53 * local995[4] + 16384 >> 15;
				local1238 += local1220;
				local1244 = local59 * local995[8] + local995[7] * local53 + local995[6] * local248 + 16384 >> 15;
				local1242 += local1225;
				local1244 += local1229;
				local1372 = new int[9];
				for (local1374 = 0; local1374 < 3; local1374++) {
					for (local1378 = 0; local1378 < 3; local1378++) {
						local1382 = 0;
						for (local1384 = 0; local1384 < 3; local1384++) {
							local1382 += arg7[local1374 * 3 + local1384] * local1232[local1384 * 3 + local1378];
						}
						local1372[local1378 + local1374 * 3] = local1382 + 16384 >> 15;
					}
				}
				local1378 = local1244 * arg7[2] + local1242 * arg7[1] + local1238 * arg7[0] + 16384 >> 15;
				local1382 = arg7[5] * local1244 + arg7[3] * local1238 + local1242 * arg7[4] + 16384 >> 15;
				local1378 += local29;
				local1382 += local35;
				local1384 = local1242 * arg7[7] + local1238 * arg7[6] + local1244 * arg7[8] + 16384 >> 15;
				local1384 += local41;
				for (local1512 = 0; local1512 < local8; local1512++) {
					@Pc(1518) int local1518 = arg1[local1512];
					if (local1518 < this.anIntArrayArray39.length) {
						@Pc(1532) int[] local1532 = this.anIntArrayArray39[local1518];
						for (@Pc(1534) int local1534 = 0; local1534 < local1532.length; local1534++) {
							@Pc(1540) int local1540 = local1532[local1534];
							if (this.aShortArray58 == null || (this.aShortArray58[local1540] & arg6) != 0) {
								@Pc(1581) int local1581 = local1372[2] * this.anIntArray341[local1540] + local1372[0] * this.anIntArray342[local1540] + this.anIntArray343[local1540] * local1372[1] + 16384 >> 15;
								@Pc(1613) int local1613 = this.anIntArray343[local1540] * local1372[4] + this.anIntArray342[local1540] * local1372[3] + this.anIntArray341[local1540] * local1372[5] + 16384 >> 15;
								@Pc(1644) int local1644 = this.anIntArray341[local1540] * local1372[8] + local1372[6] * this.anIntArray342[local1540] + local1372[7] * this.anIntArray343[local1540] + 16384 >> 15;
								@Pc(1648) int local1648 = local1613 + local1382;
								@Pc(1652) int local1652 = local1581 + local1378;
								this.anIntArray342[local1540] = local1652;
								@Pc(1661) int local1661 = local1644 + local1384;
								this.anIntArray343[local1540] = local1648;
								this.anIntArray341[local1540] = local1661;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2572) Class111 local2572;
			@Pc(2577) Class25 local2577;
			if (arg0 == 5) {
				if (this.anIntArrayArray38 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray38.length > local35) {
							local246 = this.anIntArrayArray38[local35];
							for (local248 = 0; local248 < local246.length; local248++) {
								local53 = local246[local248];
								if (this.aShortArray48 == null || (arg6 & this.aShortArray48[local53]) != 0) {
									local59 = arg2 * 8 + (this.aByteArray76[local53] & 0xFF);
									if (local59 < 0) {
										local59 = 0;
									} else if (local59 > 255) {
										local59 = 255;
									}
									this.aByteArray76[local53] = (byte) local59;
									if (this.aClass260_12 != null) {
										this.aClass260_12.anInterface1_7 = null;
									}
								}
							}
						}
					}
					if (this.aClass111Array1 != null) {
						for (local35 = 0; local35 < this.anInt4065; local35++) {
							local2572 = this.aClass111Array1[local35];
							local2577 = this.aClass25Array1[local35];
							local2577.anInt605 = local2577.anInt605 & 0xFFFFFF | 255 - (this.aByteArray76[local2572.anInt3160] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2832) Class25 local2832;
				if (arg0 == 8) {
					if (this.anIntArrayArray37 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray37.length) {
								local246 = this.anIntArrayArray37[local35];
								for (local248 = 0; local248 < local246.length; local248++) {
									local2832 = this.aClass25Array1[local246[local248]];
									local2832.anInt610 += arg3;
									local2832.anInt609 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray37 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray37.length > local35) {
								local246 = this.anIntArrayArray37[local35];
								for (local248 = 0; local248 < local246.length; local248++) {
									local2832 = this.aClass25Array1[local246[local248]];
									local2832.anInt608 = arg2 * local2832.anInt608 >> 7;
									local2832.anInt617 = local2832.anInt617 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray37 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray37.length) {
							local246 = this.anIntArrayArray37[local35];
							for (local248 = 0; local248 < local246.length; local248++) {
								local2832 = this.aClass25Array1[local246[local248]];
								local2832.anInt613 = arg2 + local2832.anInt613 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray38 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray38.length) {
						local246 = this.anIntArrayArray38[local35];
						for (local248 = 0; local248 < local246.length; local248++) {
							local53 = local246[local248];
							if (this.aShortArray48 == null || (arg6 & this.aShortArray48[local53]) != 0) {
								local59 = this.aShortArray52[local53] & 0xFFFF;
								local382 = local59 >> 10 & 0x3F;
								local400 = local59 >> 7 & 0x7;
								@Pc(2672) int local2672 = arg2 + local382 & 0x3F;
								local400 += arg3 / 4;
								local640 = local59 & 0x7F;
								if (local400 < 0) {
									local400 = 0;
								} else if (local400 > 7) {
									local400 = 7;
								}
								local640 += arg4;
								if (local640 < 0) {
									local640 = 0;
								} else if (local640 > 127) {
									local640 = 127;
								}
								this.aShortArray52[local53] = (short) (local400 << 7 | local2672 << 10 | local640);
								if (this.aClass260_12 != null) {
									this.aClass260_12.anInterface1_7 = null;
								}
							}
						}
					}
				}
				if (this.aClass111Array1 != null) {
					for (local35 = 0; local35 < this.anInt4065; local35++) {
						local2572 = this.aClass111Array1[local35];
						local2577 = this.aClass25Array1[local35];
						local2577.anInt605 = local2577.anInt605 & 0xFF000000 | Static199.anIntArray337[this.aShortArray52[local2572.anInt3160] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray39.length > local35) {
					local246 = this.anIntArrayArray39[local35];
					for (local248 = 0; local248 < local246.length; local248++) {
						local53 = local246[local248];
						if (this.aShortArray58 == null || (arg6 & this.aShortArray58[local53]) != 0) {
							this.anIntArray342[local53] -= Static338.anInt6360;
							this.anIntArray343[local53] -= Static253.anInt4754;
							this.anIntArray341[local53] -= Static204.anInt3384;
							this.anIntArray342[local53] = arg2 * this.anIntArray342[local53] >> 7;
							this.anIntArray343[local53] = arg3 * this.anIntArray343[local53] >> 7;
							this.anIntArray341[local53] = this.anIntArray341[local53] * arg4 >> 7;
							this.anIntArray342[local53] += Static338.anInt6360;
							this.anIntArray343[local53] += Static253.anInt4754;
							this.anIntArray341[local53] += Static204.anInt3384;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local248 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static150.aBoolean306) {
				local382 = arg7[3] * Static253.anInt4754 + arg7[0] * Static338.anInt6360 + Static204.anInt3384 * arg7[6] + 16384 >> 15;
				local400 = Static253.anInt4754 * arg7[4] + Static338.anInt6360 * arg7[1] + Static204.anInt3384 * arg7[7] + 16384 >> 15;
				local400 += local53;
				local382 += local248;
				local640 = Static204.anInt3384 * arg7[8] + Static253.anInt4754 * arg7[5] + Static338.anInt6360 * arg7[2] + 16384 >> 15;
				Static338.anInt6360 = local382;
				local640 += local59;
				Static253.anInt4754 = local400;
				Static150.aBoolean306 = false;
				Static204.anInt3384 = local640;
			}
			local382 = arg2 << 15 >> 7;
			local400 = arg3 << 15 >> 7;
			local640 = arg4 << 15 >> 7;
			local649 = -Static338.anInt6360 * local382 + 16384 >> 15;
			local662 = local400 * -Static253.anInt4754 + 16384 >> 15;
			local666 = -Static204.anInt3384 * local640 + 16384 >> 15;
			local684 = Static338.anInt6360 + local649;
			local1027 = Static253.anInt4754 + local662;
			local1035 = Static204.anInt3384 + local666;
			@Pc(1878) int[] local1878 = new int[] { local382 * arg7[0] + 16384 >> 15, local382 * arg7[3] + 16384 >> 15, arg7[6] * local382 + 16384 >> 15, local400 * arg7[1] + 16384 >> 15, arg7[4] * local400 + 16384 >> 15, arg7[7] * local400 + 16384 >> 15, local640 * arg7[2] + 16384 >> 15, local640 * arg7[5] + 16384 >> 15, local640 * arg7[8] + 16384 >> 15 };
			local1191 = local248 * local382 + 16384 >> 15;
			local1216 = local53 * local400 + 16384 >> 15;
			local1220 = local59 * local640 + 16384 >> 15;
			@Pc(2014) int local2014 = local1191 + local684;
			@Pc(2018) int local2018 = local1216 + local1027;
			@Pc(2022) int local2022 = local1220 + local1035;
			@Pc(2025) int[] local2025 = new int[9];
			@Pc(2031) int local2031;
			for (local1229 = 0; local1229 < 3; local1229++) {
				for (local2031 = 0; local2031 < 3; local2031++) {
					local1234 = 0;
					for (local1238 = 0; local1238 < 3; local1238++) {
						local1234 += arg7[local1229 * 3 + local1238] * local1878[local2031 + local1238 * 3];
					}
					local2025[local2031 + local1229 * 3] = local1234 + 16384 >> 15;
				}
			}
			local2031 = local2018 * arg7[1] + local2014 * arg7[0] + local2022 * arg7[2] + 16384 >> 15;
			local1234 = arg7[4] * local2018 + arg7[3] * local2014 + arg7[5] * local2022 + 16384 >> 15;
			local2031 += local29;
			local1238 = arg7[8] * local2022 + arg7[6] * local2014 + arg7[7] * local2018 + 16384 >> 15;
			local1234 += local35;
			local1238 += local41;
			for (local1242 = 0; local1242 < local8; local1242++) {
				local1244 = arg1[local1242];
				if (this.anIntArrayArray39.length > local1244) {
					local1372 = this.anIntArrayArray39[local1244];
					for (local1374 = 0; local1374 < local1372.length; local1374++) {
						local1378 = local1372[local1374];
						if (this.aShortArray58 == null || (this.aShortArray58[local1378] & arg6) != 0) {
							local1382 = local2025[2] * this.anIntArray341[local1378] + local2025[0] * this.anIntArray342[local1378] + local2025[1] * this.anIntArray343[local1378] + 16384 >> 15;
							local1384 = local2025[3] * this.anIntArray342[local1378] + local2025[4] * this.anIntArray343[local1378] + this.anIntArray341[local1378] * local2025[5] + 16384 >> 15;
							local1512 = local2025[8] * this.anIntArray341[local1378] + local2025[6] * this.anIntArray342[local1378] + local2025[7] * this.anIntArray343[local1378] + 16384 >> 15;
							@Pc(2301) int local2301 = local1384 + local1234;
							@Pc(2305) int local2305 = local1382 + local2031;
							@Pc(2309) int local2309 = local1512 + local1238;
							this.anIntArray342[local1378] = local2305;
							this.anIntArray343[local1378] = local2301;
							this.anIntArray341[local1378] = local2309;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method3308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > arg7 && arg7 < arg3 && arg7 < arg1) {
			return false;
		} else if (arg7 > arg5 && arg3 < arg7 && arg7 > arg1) {
			return false;
		} else if (arg2 < arg6 && arg4 > arg2 && arg0 > arg2) {
			return false;
		} else {
			return arg2 <= arg6 || arg2 <= arg4 || arg2 <= arg0;
		}
	}

	@OriginalMember(owner = "client!ko", name = "IA", descriptor = "()V")
	@Override
	public void IA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4027; local7++) {
			this.anIntArray341[local7] = -this.anIntArray341[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt4030; local25++) {
			this.aShortArray57[local25] = (short) -this.aShortArray57[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt4013; local44++) {
			@Pc(51) short local51 = this.aShortArray53[local44];
			this.aShortArray53[local44] = this.aShortArray55[local44];
			this.aShortArray55[local44] = local51;
		}
		if (this.aClass260_11 == null && this.aClass260_12 != null) {
			this.aClass260_12.anInterface1_7 = null;
		}
		if (this.aClass260_11 != null) {
			this.aClass260_11.anInterface1_7 = null;
		}
		if (this.aClass260_10 != null) {
			this.aClass260_10.anInterface1_7 = null;
		}
		if (this.aClass61_1 != null) {
			this.aClass61_1.anInterface10_1 = null;
		}
		this.aBoolean299 = false;
	}

	@OriginalMember(owner = "client!ko", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4027; local3++) {
			if (arg0 != 128) {
				this.anIntArray342[local3] = arg0 * this.anIntArray342[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray343[local3] = arg1 * this.anIntArray343[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray341[local3] = arg2 * this.anIntArray341[local3] >> 7;
			}
		}
		if (this.aClass260_10 != null) {
			this.aClass260_10.anInterface1_7 = null;
		}
		this.aBoolean299 = false;
	}

	@OriginalMember(owner = "client!ko", name = "E", descriptor = "(I)V")
	@Override
	public void E(@OriginalArg(0) int arg0) {
		if (this.aClass260_12 != null) {
			this.aClass260_12.anInterface1_7 = null;
		}
		this.aShort47 = (short) arg0;
	}

	@OriginalMember(owner = "client!ko", name = "D", descriptor = "()I")
	@Override
	public int D() {
		return this.aShort47;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!c;Lclient!ii;I)V")
	@Override
	public void method3276(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class8_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4030 == 0) {
			return;
		}
		@Pc(16) Class35_Sub2 local16 = this.aClass49_Sub2_22.aClass35_Sub2_3;
		if (!this.aBoolean299) {
			this.method3303();
		}
		@Pc(25) Class35_Sub2 local25 = (Class35_Sub2) arg0;
		this.method3296(local25);
		Static324.aFloat80 = local16.aFloat94 * local25.aFloat99 + local16.aFloat93 * local25.aFloat88 + local16.aFloat99 * local25.aFloat95;
		Static118.aFloat54 = local25.aFloat91 * local16.aFloat94 + local25.aFloat98 * local16.aFloat99 + local25.aFloat92 * local16.aFloat93 + local16.aFloat91;
		@Pc(76) float local76 = Static118.aFloat54 + Static324.aFloat80 * (float) this.aShort46;
		@Pc(84) float local84 = Static118.aFloat54 + Static324.aFloat80 * (float) this.aShort50;
		@Pc(94) float local94;
		@Pc(100) float local100;
		if (local84 < local76) {
			local100 = local76 + (float) this.aShort52;
			local94 = (float) -this.aShort52 + local84;
		} else {
			local94 = local76 - (float) this.aShort52;
			local100 = local84 + (float) this.aShort52;
		}
		if (local94 >= this.aClass49_Sub2_22.aFloat25 || local100 <= (float) this.aClass49_Sub2_22.anInt2025) {
			return;
		}
		Static38.aFloat87 = local25.aFloat99 * local16.aFloat97 + local16.aFloat90 * local25.aFloat88 + local16.aFloat88 * local25.aFloat95;
		Static96.aFloat48 = local16.aFloat92 + local25.aFloat91 * local16.aFloat97 + local16.aFloat90 * local25.aFloat92 + local16.aFloat88 * local25.aFloat98;
		@Pc(177) float local177 = (float) this.aShort46 * Static38.aFloat87 + Static96.aFloat48;
		@Pc(185) float local185 = Static96.aFloat48 + Static38.aFloat87 * (float) this.aShort50;
		@Pc(211) float local211;
		@Pc(200) float local200;
		if (local185 < local177) {
			local211 = (float) this.aClass49_Sub2_22.anInt2017 * ((float) -this.aShort52 + local185);
			local200 = (float) this.aClass49_Sub2_22.anInt2017 * ((float) this.aShort52 + local177);
		} else {
			local200 = (float) this.aClass49_Sub2_22.anInt2017 * (local185 + (float) this.aShort52);
			local211 = (float) this.aClass49_Sub2_22.anInt2017 * (local177 - (float) this.aShort52);
		}
		if (local211 / local100 >= this.aClass49_Sub2_22.aFloat23 || local200 / local100 <= this.aClass49_Sub2_22.aFloat36) {
			return;
		}
		Static132.aFloat55 = local25.aFloat95 * local16.aFloat95 + local16.aFloat89 * local25.aFloat88 + local16.aFloat96 * local25.aFloat99;
		Static292.aFloat75 = local16.aFloat98 + local16.aFloat96 * local25.aFloat91 + local16.aFloat89 * local25.aFloat92 + local16.aFloat95 * local25.aFloat98;
		@Pc(301) float local301 = Static292.aFloat75 + Static132.aFloat55 * (float) this.aShort46;
		@Pc(309) float local309 = Static292.aFloat75 + Static132.aFloat55 * (float) this.aShort50;
		@Pc(336) float local336;
		@Pc(324) float local324;
		if (local301 > local309) {
			local324 = ((float) this.aShort52 + local301) * (float) this.aClass49_Sub2_22.anInt2015;
			local336 = ((float) -this.aShort52 + local309) * (float) this.aClass49_Sub2_22.anInt2015;
		} else {
			local336 = (float) this.aClass49_Sub2_22.anInt2015 * (local301 - (float) this.aShort52);
			local324 = (float) this.aClass49_Sub2_22.anInt2015 * (local309 + (float) this.aShort52);
		}
		if (local336 / local100 >= this.aClass49_Sub2_22.aFloat30 || local324 / local100 <= this.aClass49_Sub2_22.aFloat27) {
			return;
		}
		if (arg1 != null || this.aClass111Array1 != null) {
			Static86.aFloat66 = local25.aFloat97 * local16.aFloat93 + local25.aFloat96 * local16.aFloat99 + local16.aFloat94 * local25.aFloat94;
			Static55.aFloat18 = local16.aFloat96 * local25.aFloat93 + local16.aFloat89 * local25.aFloat90 + local16.aFloat95 * local25.aFloat89;
			Static36.aFloat13 = local25.aFloat97 * local16.aFloat90 + local16.aFloat88 * local25.aFloat96 + local16.aFloat97 * local25.aFloat94;
			Static356.aFloat85 = local25.aFloat93 * local16.aFloat97 + local16.aFloat88 * local25.aFloat89 + local25.aFloat90 * local16.aFloat90;
			Static36.aFloat14 = local25.aFloat93 * local16.aFloat94 + local16.aFloat99 * local25.aFloat89 + local16.aFloat93 * local25.aFloat90;
			Static106.aFloat51 = local16.aFloat89 * local25.aFloat97 + local16.aFloat95 * local25.aFloat96 + local16.aFloat96 * local25.aFloat94;
		}
		if (arg1 != null) {
			@Pc(495) boolean local495 = false;
			@Pc(497) boolean local497 = true;
			@Pc(505) int local505 = this.aShort53 + this.aShort45 >> 1;
			@Pc(514) int local514 = this.aShort51 + this.aShort48 >> 1;
			@Pc(533) int local533 = (int) ((float) local514 * Static36.aFloat13 + Static96.aFloat48 + Static356.aFloat85 * (float) local505 + (float) this.aShort46 * Static38.aFloat87);
			@Pc(552) int local552 = (int) (Static292.aFloat75 + Static55.aFloat18 * (float) local505 + (float) this.aShort46 * Static132.aFloat55 + Static106.aFloat51 * (float) local514);
			@Pc(571) int local571 = (int) (Static118.aFloat54 + Static36.aFloat14 * (float) local505 + (float) this.aShort46 * Static324.aFloat80 + (float) local514 * Static86.aFloat66);
			if (this.aClass49_Sub2_22.anInt2025 <= local571) {
				arg1.anInt3264 = this.aClass49_Sub2_22.anInt2023 + this.aClass49_Sub2_22.anInt2015 * local552 / local571;
				arg1.anInt3263 = this.aClass49_Sub2_22.anInt2017 * local533 / local571 + this.aClass49_Sub2_22.anInt2048;
			} else {
				local495 = true;
			}
			@Pc(626) int local626 = (int) ((float) local514 * Static36.aFloat13 + (float) this.aShort50 * Static38.aFloat87 + Static356.aFloat85 * (float) local505 + Static96.aFloat48);
			@Pc(645) int local645 = (int) (Static132.aFloat55 * (float) this.aShort50 + Static292.aFloat75 + (float) local505 * Static55.aFloat18 + (float) local514 * Static106.aFloat51);
			@Pc(664) int local664 = (int) ((float) local505 * Static36.aFloat14 + Static118.aFloat54 + (float) this.aShort50 * Static324.aFloat80 + Static86.aFloat66 * (float) local514);
			if (this.aClass49_Sub2_22.anInt2025 > local664) {
				local495 = true;
			} else {
				arg1.anInt3262 = local645 * this.aClass49_Sub2_22.anInt2015 / local664 + this.aClass49_Sub2_22.anInt2023;
				arg1.anInt3260 = this.aClass49_Sub2_22.anInt2048 + this.aClass49_Sub2_22.anInt2017 * local626 / local664;
			}
			if (local495) {
				if (local571 < this.aClass49_Sub2_22.anInt2025 && this.aClass49_Sub2_22.anInt2025 > local664) {
					local497 = false;
				} else {
					@Pc(747) int local747;
					@Pc(759) int local759;
					@Pc(785) int local785;
					if (this.aClass49_Sub2_22.anInt2025 > local571) {
						local747 = (local664 - this.aClass49_Sub2_22.anInt2025 << 16) / (local664 - local571);
						local759 = local626 + ((local626 - local533) * local747 >> 16);
						arg1.anInt3263 = this.aClass49_Sub2_22.anInt2017 * local759 / this.aClass49_Sub2_22.anInt2025 + this.aClass49_Sub2_22.anInt2048;
						local785 = local645 + ((local645 - local552) * local747 >> 16);
						arg1.anInt3264 = local785 * this.aClass49_Sub2_22.anInt2015 / this.aClass49_Sub2_22.anInt2025 + this.aClass49_Sub2_22.anInt2023;
					} else if (local664 < this.aClass49_Sub2_22.anInt2025) {
						local747 = (local571 - this.aClass49_Sub2_22.anInt2025 << 16) / (local571 - local664);
						local759 = local533 + (local747 * (local533 - local626) >> 16);
						arg1.anInt3263 = local759 * this.aClass49_Sub2_22.anInt2017 / this.aClass49_Sub2_22.anInt2025 + this.aClass49_Sub2_22.anInt2048;
						local785 = ((local552 - local645) * local747 >> 16) + local552;
						arg1.anInt3264 = this.aClass49_Sub2_22.anInt2015 * local785 / this.aClass49_Sub2_22.anInt2025 + this.aClass49_Sub2_22.anInt2023;
					}
				}
			}
			if (local497) {
				if (local664 < local571) {
					arg1.anInt3261 = this.aClass49_Sub2_22.anInt2048 + (this.aShort52 + local533) * this.aClass49_Sub2_22.anInt2017 / local571 - arg1.anInt3263;
				} else {
					arg1.anInt3261 = this.aClass49_Sub2_22.anInt2048 + this.aClass49_Sub2_22.anInt2017 * (local626 + this.aShort52) / local664 - arg1.anInt3260;
				}
				arg1.aBoolean251 = true;
			}
		}
		this.aClass49_Sub2_22.method1638();
		this.aClass49_Sub2_22.method1598(local25);
		this.method3297();
		this.aClass49_Sub2_22.method1604();
		this.method3304();
	}

	@OriginalMember(owner = "client!ko", name = "Q", descriptor = "(I)V")
	@Override
	public void Q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class162.anIntArray388[arg0];
		@Pc(13) int local13 = Class162.anIntArray387[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4027; local15++) {
			@Pc(34) int local34 = this.anIntArray341[local15] * local9 + local13 * this.anIntArray342[local15] >> 15;
			this.anIntArray341[local15] = local13 * this.anIntArray341[local15] - local9 * this.anIntArray342[local15] >> 15;
			this.anIntArray342[local15] = local34;
		}
		if (this.aClass260_10 != null) {
			this.aClass260_10.anInterface1_7 = null;
		}
		this.aBoolean299 = false;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZZLclient!ko;Lclient!ko;IZ)Lclient!t;")
	private Class91 method3309(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class91_Sub2 arg1, @OriginalArg(3) Class91_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		arg2.anInt4030 = this.anInt4030;
		arg2.anInt4027 = this.anInt4027;
		arg2.anInt4047 = this.anInt4047;
		arg2.aShort47 = this.aShort47;
		arg2.anInt4065 = this.anInt4065;
		arg2.anInt4056 = this.anInt4056;
		arg2.anInt4063 = this.anInt4063;
		arg2.aByte66 = 0;
		arg2.anInt4013 = this.anInt4013;
		arg2.aShort49 = this.aShort49;
		arg2.anInt4019 = arg3;
		@Pc(58) boolean local58 = Static362.method4949(arg3, this.anInt4047);
		@Pc(64) boolean local64 = Static135.method2303(arg3, this.anInt4047);
		@Pc(70) boolean local70 = Static335.method771(arg3, this.anInt4047);
		@Pc(76) boolean local76 = local70 | local58 | local64;
		@Pc(187) int local187;
		if (local76) {
			if (!local58) {
				arg2.anIntArray342 = this.anIntArray342;
			} else if (arg1.anIntArray342 == null || this.anInt4063 > arg1.anIntArray342.length) {
				arg2.anIntArray342 = arg1.anIntArray342 = new int[this.anInt4063];
			} else {
				arg2.anIntArray342 = arg1.anIntArray342;
			}
			if (!local64) {
				arg2.anIntArray343 = this.anIntArray343;
			} else if (arg1.anIntArray343 == null || this.anInt4063 > arg1.anIntArray343.length) {
				arg2.anIntArray343 = arg1.anIntArray343 = new int[this.anInt4063];
			} else {
				arg2.anIntArray343 = arg1.anIntArray343;
			}
			if (!local70) {
				arg2.anIntArray341 = this.anIntArray341;
			} else if (arg1.anIntArray341 == null || arg1.anIntArray341.length < this.anInt4063) {
				arg2.anIntArray341 = arg1.anIntArray341 = new int[this.anInt4063];
			} else {
				arg2.anIntArray341 = arg1.anIntArray341;
			}
			for (local187 = 0; local187 < this.anInt4063; local187++) {
				if (local58) {
					arg2.anIntArray342[local187] = this.anIntArray342[local187];
				}
				if (local64) {
					arg2.anIntArray343[local187] = this.anIntArray343[local187];
				}
				if (local70) {
					arg2.anIntArray341[local187] = this.anIntArray341[local187];
				}
			}
		} else {
			arg2.anIntArray341 = this.anIntArray341;
			arg2.anIntArray342 = this.anIntArray342;
			arg2.anIntArray343 = this.anIntArray343;
		}
		if (Static58.method1145(arg3, this.anInt4047)) {
			if (arg4) {
				arg2.aByte66 = (byte) (arg2.aByte66 | 0x1);
			}
			arg2.aClass260_10 = arg1.aClass260_10;
			arg2.aClass260_10.anInterface1_7 = this.aClass260_10.anInterface1_7;
			arg2.aClass260_10.aByte98 = this.aClass260_10.aByte98;
		} else if (Static207.method3261(this.anInt4047, arg3)) {
			arg2.aClass260_10 = this.aClass260_10;
		} else {
			arg2.aClass260_10 = null;
		}
		if (Static2.method68(arg3, this.anInt4047)) {
			if (arg1.aShortArray52 == null || arg1.aShortArray52.length < this.anInt4013) {
				arg2.aShortArray52 = arg1.aShortArray52 = new short[this.anInt4013];
			} else {
				arg2.aShortArray52 = arg1.aShortArray52;
			}
			for (local187 = 0; local187 < this.anInt4013; local187++) {
				arg2.aShortArray52[local187] = this.aShortArray52[local187];
			}
		} else {
			arg2.aShortArray52 = this.aShortArray52;
		}
		if (Static108.method1999(this.anInt4047, arg3)) {
			if (arg1.aByteArray76 == null || this.anInt4013 > arg1.aByteArray76.length) {
				arg2.aByteArray76 = arg1.aByteArray76 = new byte[this.anInt4013];
			} else {
				arg2.aByteArray76 = arg1.aByteArray76;
			}
			for (local187 = 0; local187 < this.anInt4013; local187++) {
				arg2.aByteArray76[local187] = this.aByteArray76[local187];
			}
		} else {
			arg2.aByteArray76 = this.aByteArray76;
		}
		if (Static117.method2084(arg3, this.anInt4047)) {
			arg2.aClass260_12 = arg1.aClass260_12;
			if (arg4) {
				arg2.aByte66 = (byte) (arg2.aByte66 | 0x2);
			}
			arg2.aClass260_12.anInterface1_7 = this.aClass260_12.anInterface1_7;
			arg2.aClass260_12.aByte98 = this.aClass260_12.aByte98;
		} else if (Static15.method316(arg3, this.anInt4047)) {
			arg2.aClass260_12 = this.aClass260_12;
		} else {
			arg2.aClass260_12 = null;
		}
		@Pc(544) int local544;
		if (Static37.method605(this.anInt4047, arg3)) {
			if (arg1.aShortArray51 == null || arg1.aShortArray51.length < this.anInt4030) {
				local187 = this.anInt4030;
				arg2.aShortArray54 = arg1.aShortArray54 = new short[local187];
				arg2.aShortArray57 = arg1.aShortArray57 = new short[local187];
				arg2.aShortArray51 = arg1.aShortArray51 = new short[local187];
			} else {
				arg2.aShortArray51 = arg1.aShortArray51;
				arg2.aShortArray57 = arg1.aShortArray57;
				arg2.aShortArray54 = arg1.aShortArray54;
			}
			if (this.aClass169_1 == null) {
				for (local187 = 0; local187 < this.anInt4030; local187++) {
					arg2.aShortArray51[local187] = this.aShortArray51[local187];
					arg2.aShortArray54[local187] = this.aShortArray54[local187];
					arg2.aShortArray57[local187] = this.aShortArray57[local187];
				}
			} else {
				if (arg1.aClass169_1 == null) {
					arg1.aClass169_1 = new Class169();
				}
				@Pc(528) Class169 local528 = arg2.aClass169_1 = arg1.aClass169_1;
				if (local528.aShortArray74 == null || local528.aShortArray74.length < this.anInt4030) {
					local544 = this.anInt4030;
					local528.aByteArray98 = new byte[local544];
					local528.aShortArray76 = new short[local544];
					local528.aShortArray74 = new short[local544];
					local528.aShortArray75 = new short[local544];
				}
				for (local544 = 0; local544 < this.anInt4030; local544++) {
					arg2.aShortArray51[local544] = this.aShortArray51[local544];
					arg2.aShortArray54[local544] = this.aShortArray54[local544];
					arg2.aShortArray57[local544] = this.aShortArray57[local544];
					local528.aShortArray74[local544] = this.aClass169_1.aShortArray74[local544];
					local528.aShortArray76[local544] = this.aClass169_1.aShortArray76[local544];
					local528.aShortArray75[local544] = this.aClass169_1.aShortArray75[local544];
					local528.aByteArray98[local544] = this.aClass169_1.aByteArray98[local544];
				}
			}
			arg2.aByteArray77 = this.aByteArray77;
		} else {
			arg2.aShortArray54 = this.aShortArray54;
			arg2.aShortArray51 = this.aShortArray51;
			arg2.aByteArray77 = this.aByteArray77;
			arg2.aClass169_1 = this.aClass169_1;
			arg2.aShortArray57 = this.aShortArray57;
		}
		if (Static232.method3613(this.anInt4047, arg3)) {
			if (arg4) {
				arg2.aByte66 = (byte) (arg2.aByte66 | 0x4);
			}
			arg2.aClass260_11 = arg1.aClass260_11;
			arg2.aClass260_11.anInterface1_7 = this.aClass260_11.anInterface1_7;
			arg2.aClass260_11.aByte98 = this.aClass260_11.aByte98;
		} else if (Static83.method1622(arg3, this.anInt4047)) {
			arg2.aClass260_11 = this.aClass260_11;
		} else {
			arg2.aClass260_11 = null;
		}
		if (Static359.method4894(arg3, this.anInt4047)) {
			if (arg1.aFloatArray30 == null || this.anInt4013 > arg1.aFloatArray30.length) {
				local187 = this.anInt4030;
				arg2.aFloatArray30 = arg1.aFloatArray30 = new float[local187];
				arg2.aFloatArray29 = arg1.aFloatArray29 = new float[local187];
			} else {
				arg2.aFloatArray29 = arg1.aFloatArray29;
				arg2.aFloatArray30 = arg1.aFloatArray30;
			}
			for (local187 = 0; local187 < this.anInt4030; local187++) {
				arg2.aFloatArray30[local187] = this.aFloatArray30[local187];
				arg2.aFloatArray29[local187] = this.aFloatArray29[local187];
			}
		} else {
			arg2.aFloatArray30 = this.aFloatArray30;
			arg2.aFloatArray29 = this.aFloatArray29;
		}
		if (Static330.method4569(this.anInt4047, arg3)) {
			arg2.aClass260_13 = arg1.aClass260_13;
			if (arg4) {
				arg2.aByte66 = (byte) (arg2.aByte66 | 0x8);
			}
			arg2.aClass260_13.aByte98 = this.aClass260_13.aByte98;
			arg2.aClass260_13.anInterface1_7 = this.aClass260_13.anInterface1_7;
		} else if (Static55.method921(arg3, this.anInt4047)) {
			arg2.aClass260_13 = this.aClass260_13;
		} else {
			arg2.aClass260_13 = null;
		}
		if (Static151.method2523(this.anInt4047, arg3)) {
			if (arg1.aShortArray53 == null || this.anInt4013 > arg1.aShortArray53.length) {
				local187 = this.anInt4013;
				arg2.aShortArray49 = arg1.aShortArray49 = new short[local187];
				arg2.aShortArray55 = arg1.aShortArray55 = new short[local187];
				arg2.aShortArray53 = arg1.aShortArray53 = new short[local187];
			} else {
				arg2.aShortArray53 = arg1.aShortArray53;
				arg2.aShortArray55 = arg1.aShortArray55;
				arg2.aShortArray49 = arg1.aShortArray49;
			}
			for (local187 = 0; local187 < this.anInt4013; local187++) {
				arg2.aShortArray53[local187] = this.aShortArray53[local187];
				arg2.aShortArray49[local187] = this.aShortArray49[local187];
				arg2.aShortArray55[local187] = this.aShortArray55[local187];
			}
		} else {
			arg2.aShortArray49 = this.aShortArray49;
			arg2.aShortArray53 = this.aShortArray53;
			arg2.aShortArray55 = this.aShortArray55;
		}
		if (Static378.method5080(arg3, this.anInt4047)) {
			if (arg4) {
				arg2.aByte66 = (byte) (arg2.aByte66 | 0x10);
			}
			arg2.aClass61_1 = arg1.aClass61_1;
			arg2.aClass61_1.anInterface10_1 = this.aClass61_1.anInterface10_1;
		} else if (Static30.method538(arg3, this.anInt4047)) {
			arg2.aClass61_1 = this.aClass61_1;
		} else {
			arg2.aClass61_1 = null;
		}
		if (Static37.method607(arg3, this.anInt4047)) {
			if (arg1.aShortArray56 == null || this.anInt4013 > arg1.aShortArray56.length) {
				local187 = this.anInt4013;
				arg2.aShortArray56 = arg1.aShortArray56 = new short[local187];
			} else {
				arg2.aShortArray56 = arg1.aShortArray56;
			}
			for (local187 = 0; local187 < this.anInt4013; local187++) {
				arg2.aShortArray56[local187] = this.aShortArray56[local187];
			}
		} else {
			arg2.aShortArray56 = this.aShortArray56;
		}
		if (!Static27.method5782(arg3, this.anInt4047)) {
			arg2.aClass25Array1 = this.aClass25Array1;
		} else if (arg1.aClass25Array1 == null || this.anInt4065 > arg1.aClass25Array1.length) {
			local187 = this.anInt4065;
			arg2.aClass25Array1 = arg1.aClass25Array1 = new Class25[local187];
			for (local544 = 0; local544 < this.anInt4065; local544++) {
				arg2.aClass25Array1[local544] = this.aClass25Array1[local544].method505();
			}
		} else {
			arg2.aClass25Array1 = arg1.aClass25Array1;
			for (local187 = 0; local187 < this.anInt4065; local187++) {
				arg2.aClass25Array1[local187].method507(this.aClass25Array1[local187]);
			}
		}
		arg2.anIntArrayArray39 = this.anIntArrayArray39;
		arg2.aShortArray50 = this.aShortArray50;
		arg2.aClass189Array3 = this.aClass189Array3;
		arg2.aClass200Array3 = this.aClass200Array3;
		arg2.anIntArrayArray37 = this.anIntArrayArray37;
		arg2.anIntArray344 = this.anIntArray344;
		arg2.anIntArrayArray38 = this.anIntArrayArray38;
		if (this.aBoolean299) {
			arg2.aShort51 = this.aShort51;
			arg2.aShort46 = this.aShort46;
			arg2.aShort45 = this.aShort45;
			arg2.aShort48 = this.aShort48;
			arg2.aShort50 = this.aShort50;
			arg2.aShort53 = this.aShort53;
			arg2.aBoolean299 = true;
			arg2.aShort52 = this.aShort52;
		} else {
			arg2.aBoolean299 = false;
		}
		arg2.anIntArray345 = this.anIntArray345;
		arg2.aShortArray58 = this.aShortArray58;
		arg2.aShortArray48 = this.aShortArray48;
		arg2.aClass111Array1 = this.aClass111Array1;
		return arg2;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)V")
	private void method3310(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass260_12 != null && this.aClass260_12.anInterface1_7 == null;
		@Pc(27) boolean local27 = this.aClass260_11 != null && this.aClass260_11.anInterface1_7 == null;
		@Pc(38) boolean local38 = this.aClass260_10 != null && this.aClass260_10.anInterface1_7 == null;
		@Pc(49) boolean local49 = this.aClass260_13 != null && this.aClass260_13.anInterface1_7 == null;
		if (arg0) {
			local16 &= (this.aByte66 & 0x2) != 0;
			local38 &= (this.aByte66 & 0x1) != 0;
			local49 &= (this.aByte66 & 0x8) != 0;
			local27 &= (this.aByte66 & 0x4) != 0;
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
		if (this.anInt4030 * local100 > Static235.aClass2_Sub23_Sub1_6.aByteArray130.length) {
			Static235.aClass2_Sub23_Sub1_6 = new Class2_Sub23_Sub1((this.anInt4030 + 100) * local100);
		} else {
			Static235.aClass2_Sub23_Sub1_6.anInt6952 = 0;
		}
		@Pc(181) int local181;
		@Pc(190) int local190;
		@Pc(218) int local218;
		@Pc(227) int local227;
		if (local38) {
			@Pc(197) int local197;
			@Pc(204) int local204;
			@Pc(209) int local209;
			@Pc(216) int local216;
			if (this.aClass49_Sub2_22.aBoolean111) {
				for (local181 = 0; local181 < this.anInt4027; local181++) {
					local190 = NativeStream.floatToRawIntBits((float) this.anIntArray342[local181]);
					local197 = NativeStream.floatToRawIntBits((float) this.anIntArray343[local181]);
					local204 = NativeStream.floatToRawIntBits((float) this.anIntArray341[local181]);
					local209 = this.anIntArray345[local181];
					local216 = this.anIntArray345[local181 + 1];
					for (local218 = local209; local218 < local216; local218++) {
						local227 = this.aShortArray50[local218] - 1;
						if (local227 == -1) {
							break;
						}
						Static235.aClass2_Sub23_Sub1_6.anInt6952 = local100 * local227;
						Static235.aClass2_Sub23_Sub1_6.method5506(local190);
						Static235.aClass2_Sub23_Sub1_6.method5506(local197);
						Static235.aClass2_Sub23_Sub1_6.method5506(local204);
					}
				}
			} else {
				for (local181 = 0; local181 < this.anInt4027; local181++) {
					local190 = NativeStream.floatToRawIntBits((float) this.anIntArray342[local181]);
					local197 = NativeStream.floatToRawIntBits((float) this.anIntArray343[local181]);
					local204 = NativeStream.floatToRawIntBits((float) this.anIntArray341[local181]);
					local209 = this.anIntArray345[local181];
					local216 = this.anIntArray345[local181 + 1];
					for (local218 = local209; local218 < local216; local218++) {
						local227 = this.aShortArray50[local218] - 1;
						if (local227 == -1) {
							break;
						}
						Static235.aClass2_Sub23_Sub1_6.anInt6952 = local227 * local100;
						Static235.aClass2_Sub23_Sub1_6.method5504(local190);
						Static235.aClass2_Sub23_Sub1_6.method5504(local197);
						Static235.aClass2_Sub23_Sub1_6.method5504(local204);
					}
				}
			}
		}
		@Pc(540) float local540;
		@Pc(436) short[] local436;
		@Pc(427) short[] local427;
		@Pc(433) short[] local433;
		@Pc(430) byte[] local430;
		@Pc(587) float local587;
		if (local16) {
			if (this.aClass260_11 == null) {
				if (this.aClass169_1 == null) {
					local427 = this.aShortArray54;
					local430 = this.aByteArray77;
					local433 = this.aShortArray57;
					local436 = this.aShortArray51;
				} else {
					local436 = this.aClass169_1.aShortArray74;
					local430 = this.aClass169_1.aByteArray98;
					local427 = this.aClass169_1.aShortArray76;
					local433 = this.aClass169_1.aShortArray75;
				}
				@Pc(460) float local460 = this.aClass49_Sub2_22.aFloatArray12[0];
				@Pc(466) float local466 = this.aClass49_Sub2_22.aFloatArray12[1];
				@Pc(472) float local472 = this.aClass49_Sub2_22.aFloatArray12[2];
				@Pc(476) float local476 = this.aClass49_Sub2_22.aFloat34;
				@Pc(486) float local486 = this.aClass49_Sub2_22.aFloat26 * 768.0F / (float) this.aShort49;
				@Pc(496) float local496 = this.aClass49_Sub2_22.aFloat38 * 768.0F / (float) this.aShort49;
				for (@Pc(498) int local498 = 0; local498 < this.anInt4013; local498++) {
					@Pc(518) int local518 = this.method3295(this.aShortArray56[local498], this.aShortArray52[local498], this.aByteArray76[local498], this.aShort47);
					@Pc(529) float local529 = this.aClass49_Sub2_22.aFloat32 * (float) (local518 >> 8 & 0xFF);
					local540 = (float) (local518 >> 16 & 0xFF) * this.aClass49_Sub2_22.aFloat39;
					@Pc(545) short local545 = this.aShortArray53[local498];
					@Pc(554) float local554 = (float) (local518 >>> 24) * this.aClass49_Sub2_22.aFloat42;
					@Pc(559) short local559 = (short) local430[local545];
					if (local559 == 0) {
						local587 = (local460 * (float) local436[local545] + (float) local427[local545] * local466 + (float) local433[local545] * local472) * 0.0026041667F;
					} else {
						local587 = (local472 * (float) local433[local545] + local460 * (float) local436[local545] + (float) local427[local545] * local466) / (float) (local559 * 256);
					}
					@Pc(624) float local624 = local476 + (local587 < 0.0F ? local496 : local486) * local587;
					@Pc(629) int local629 = (int) (local554 * local624);
					@Pc(634) int local634 = (int) (local624 * local540);
					if (local629 < 0) {
						local629 = 0;
					} else if (local629 > 255) {
						local629 = 255;
					}
					@Pc(650) int local650 = (int) (local529 * local624);
					if (local634 < 0) {
						local634 = 0;
					} else if (local634 > 255) {
						local634 = 255;
					}
					if (local650 < 0) {
						local650 = 0;
					} else if (local650 > 255) {
						local650 = 255;
					}
					Static235.aClass2_Sub23_Sub1_6.anInt6952 = local100 * local545 + local104;
					Static235.aClass2_Sub23_Sub1_6.method5449(local629);
					Static235.aClass2_Sub23_Sub1_6.method5449(local634);
					Static235.aClass2_Sub23_Sub1_6.method5449(local650);
					Static235.aClass2_Sub23_Sub1_6.method5449(255 - (this.aByteArray76[local498] & 0xFF));
					local545 = this.aShortArray49[local498];
					local559 = local430[local545];
					if (local559 == 0) {
						local587 = (local472 * (float) local433[local545] + (float) local436[local545] * local460 + local466 * (float) local427[local545]) * 0.0026041667F;
					} else {
						local587 = (local460 * (float) local436[local545] + local466 * (float) local427[local545] + (float) local433[local545] * local472) / (float) (local559 * 256);
					}
					local624 = local587 * (local587 < 0.0F ? local496 : local486) + local476;
					local629 = (int) (local554 * local624);
					if (local629 < 0) {
						local629 = 0;
					} else if (local629 > 255) {
						local629 = 255;
					}
					local634 = (int) (local624 * local540);
					if (local634 < 0) {
						local634 = 0;
					} else if (local634 > 255) {
						local634 = 255;
					}
					local650 = (int) (local529 * local624);
					Static235.aClass2_Sub23_Sub1_6.anInt6952 = local545 * local100 + local104;
					if (local650 < 0) {
						local650 = 0;
					} else if (local650 > 255) {
						local650 = 255;
					}
					Static235.aClass2_Sub23_Sub1_6.method5449(local629);
					Static235.aClass2_Sub23_Sub1_6.method5449(local634);
					Static235.aClass2_Sub23_Sub1_6.method5449(local650);
					Static235.aClass2_Sub23_Sub1_6.method5449(255 - (this.aByteArray76[local498] & 0xFF));
					local545 = this.aShortArray55[local498];
					local559 = local430[local545];
					if (local559 == 0) {
						local587 = ((float) local436[local545] * local460 + (float) local427[local545] * local466 + (float) local433[local545] * local472) * 0.0026041667F;
					} else {
						local587 = ((float) local433[local545] * local472 + (float) local436[local545] * local460 + local466 * (float) local427[local545]) / (float) (local559 * 256);
					}
					local624 = (local587 < 0.0F ? local496 : local486) * local587 + local476;
					local629 = (int) (local624 * local554);
					local634 = (int) (local624 * local540);
					if (local629 < 0) {
						local629 = 0;
					} else if (local629 > 255) {
						local629 = 255;
					}
					local650 = (int) (local529 * local624);
					if (local634 < 0) {
						local634 = 0;
					} else if (local634 > 255) {
						local634 = 255;
					}
					if (local650 < 0) {
						local650 = 0;
					} else if (local650 > 255) {
						local650 = 255;
					}
					Static235.aClass2_Sub23_Sub1_6.anInt6952 = local545 * local100 + local104;
					Static235.aClass2_Sub23_Sub1_6.method5449(local629);
					Static235.aClass2_Sub23_Sub1_6.method5449(local634);
					Static235.aClass2_Sub23_Sub1_6.method5449(local650);
					Static235.aClass2_Sub23_Sub1_6.method5449(255 - (this.aByteArray76[local498] & 0xFF));
				}
			} else {
				for (local181 = 0; local181 < this.anInt4013; local181++) {
					local190 = this.method3295(this.aShortArray56[local181], this.aShortArray52[local181], this.aByteArray76[local181], this.aShort47);
					Static235.aClass2_Sub23_Sub1_6.anInt6952 = local104 + this.aShortArray53[local181] * local100;
					Static235.aClass2_Sub23_Sub1_6.method5506(local190);
					Static235.aClass2_Sub23_Sub1_6.anInt6952 = this.aShortArray49[local181] * local100 + local104;
					Static235.aClass2_Sub23_Sub1_6.method5506(local190);
					Static235.aClass2_Sub23_Sub1_6.anInt6952 = local104 + this.aShortArray55[local181] * local100;
					Static235.aClass2_Sub23_Sub1_6.method5506(local190);
				}
			}
		}
		if (local27) {
			if (this.aClass169_1 == null) {
				local430 = this.aByteArray77;
				local436 = this.aShortArray51;
				local433 = this.aShortArray57;
				local427 = this.aShortArray54;
			} else {
				local427 = this.aClass169_1.aShortArray76;
				local430 = this.aClass169_1.aByteArray98;
				local436 = this.aClass169_1.aShortArray74;
				local433 = this.aClass169_1.aShortArray75;
			}
			@Pc(1084) float local1084 = 3.0F / (float) this.aShort49;
			Static235.aClass2_Sub23_Sub1_6.anInt6952 = local106;
			local587 = 3.0F / (float) (this.aShort49 + this.aShort49 / 2);
			if (this.aClass49_Sub2_22.aBoolean111) {
				for (local218 = 0; local218 < this.anInt4030; local218++) {
					local227 = local430[local218] & 0xFF;
					if (local227 == 0) {
						Static235.aClass2_Sub23_Sub1_6.method3246(local587 * (float) local436[local218]);
						Static235.aClass2_Sub23_Sub1_6.method3246((float) local427[local218] * local587);
						Static235.aClass2_Sub23_Sub1_6.method3246((float) local433[local218] * local587);
					} else {
						local540 = local1084 / (float) local227;
						Static235.aClass2_Sub23_Sub1_6.method3246(local540 * (float) local436[local218]);
						Static235.aClass2_Sub23_Sub1_6.method3246(local540 * (float) local427[local218]);
						Static235.aClass2_Sub23_Sub1_6.method3246((float) local433[local218] * local540);
					}
					Static235.aClass2_Sub23_Sub1_6.anInt6952 += local100 - 12;
				}
			} else {
				for (local218 = 0; local218 < this.anInt4030; local218++) {
					local227 = local430[local218] & 0xFF;
					if (local227 == 0) {
						Static235.aClass2_Sub23_Sub1_6.method3249(local587 * (float) local436[local218]);
						Static235.aClass2_Sub23_Sub1_6.method3249(local587 * (float) local427[local218]);
						Static235.aClass2_Sub23_Sub1_6.method3249((float) local433[local218] * local587);
					} else {
						local540 = local1084 / (float) local227;
						Static235.aClass2_Sub23_Sub1_6.method3249(local540 * (float) local436[local218]);
						Static235.aClass2_Sub23_Sub1_6.method3249(local540 * (float) local427[local218]);
						Static235.aClass2_Sub23_Sub1_6.method3249((float) local433[local218] * local540);
					}
					Static235.aClass2_Sub23_Sub1_6.anInt6952 += local100 - 12;
				}
			}
		}
		if (local49) {
			Static235.aClass2_Sub23_Sub1_6.anInt6952 = local117;
			if (this.aClass49_Sub2_22.aBoolean111) {
				for (local181 = 0; local181 < this.anInt4030; local181++) {
					Static235.aClass2_Sub23_Sub1_6.method3246(this.aFloatArray30[local181]);
					Static235.aClass2_Sub23_Sub1_6.method3246(this.aFloatArray29[local181]);
					Static235.aClass2_Sub23_Sub1_6.anInt6952 += local100 - 8;
				}
			} else {
				for (local181 = 0; local181 < this.anInt4030; local181++) {
					Static235.aClass2_Sub23_Sub1_6.method3249(this.aFloatArray30[local181]);
					Static235.aClass2_Sub23_Sub1_6.method3249(this.aFloatArray29[local181]);
					Static235.aClass2_Sub23_Sub1_6.anInt6952 += local100 - 8;
				}
			}
		}
		Static235.aClass2_Sub23_Sub1_6.anInt6952 = this.anInt4030 * local100;
		@Pc(1408) Interface1 local1408;
		if (arg0) {
			if (this.anInterface1_5 == null) {
				this.anInterface1_5 = this.aClass49_Sub2_22.method1593(Static235.aClass2_Sub23_Sub1_6.anInt6952, local100, Static235.aClass2_Sub23_Sub1_6.aByteArray130, true);
			} else {
				this.anInterface1_5.method691(Static235.aClass2_Sub23_Sub1_6.aByteArray130, local100, Static235.aClass2_Sub23_Sub1_6.anInt6952);
			}
			this.aByte66 = 0;
			local1408 = this.anInterface1_5;
		} else {
			local1408 = this.aClass49_Sub2_22.method1593(Static235.aClass2_Sub23_Sub1_6.anInt6952, local100, Static235.aClass2_Sub23_Sub1_6.aByteArray130, false);
			this.aBoolean300 = true;
		}
		if (local38) {
			this.aClass260_10.anInterface1_7 = local1408;
			this.aClass260_10.aByte98 = 0;
		}
		if (local49) {
			this.aClass260_13.aByte98 = local117;
			this.aClass260_13.anInterface1_7 = local1408;
		}
		if (local16) {
			this.aClass260_12.aByte98 = local104;
			this.aClass260_12.anInterface1_7 = local1408;
		}
		if (local27) {
			this.aClass260_11.anInterface1_7 = local1408;
			this.aClass260_11.aByte98 = local106;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V")
	private void method3311() {
		if (!this.aBoolean300) {
			return;
		}
		this.aBoolean300 = false;
		if (this.aClass200Array3 == null && this.aClass189Array3 == null && this.aClass111Array1 == null) {
			if (this.anIntArray342 != null && !Static14.method306(this.anInt4019, this.anInt4047)) {
				if (this.aClass260_10 != null && this.aClass260_10.anInterface1_7 == null) {
					this.aBoolean300 = true;
				} else {
					if (!this.aBoolean299) {
						this.method3303();
					}
					this.anIntArray342 = null;
				}
			}
			if (this.anIntArray343 != null && !Static434.method5671(this.anInt4019, this.anInt4047)) {
				if (this.aClass260_10 != null && this.aClass260_10.anInterface1_7 == null) {
					this.aBoolean300 = true;
				} else {
					if (!this.aBoolean299) {
						this.method3303();
					}
					this.anIntArray343 = null;
				}
			}
			if (this.anIntArray341 != null && !Static416.method5529(this.anInt4019, this.anInt4047)) {
				if (this.aClass260_10 != null && this.aClass260_10.anInterface1_7 == null) {
					this.aBoolean300 = true;
				} else {
					if (!this.aBoolean299) {
						this.method3303();
					}
					this.anIntArray341 = null;
				}
			}
		}
		if (this.aShortArray50 != null && this.anIntArray342 == null && this.anIntArray343 == null && this.anIntArray341 == null) {
			this.anIntArray345 = null;
			this.aShortArray50 = null;
		}
		if (this.aByteArray77 != null && !Static363.method4952(this.anInt4019, this.anInt4047)) {
			if (this.aClass260_11 == null) {
				if (this.aClass260_12 != null && this.aClass260_12.anInterface1_7 == null) {
					this.aBoolean300 = true;
				} else {
					this.aByteArray77 = null;
					this.aShortArray51 = this.aShortArray54 = this.aShortArray57 = null;
				}
			} else if (this.aClass260_11.anInterface1_7 == null) {
				this.aBoolean300 = true;
			} else {
				this.aByteArray77 = null;
				this.aShortArray51 = this.aShortArray54 = this.aShortArray57 = null;
			}
		}
		if (this.aShortArray52 != null && !Static178.method5736(this.anInt4047, this.anInt4019)) {
			if (this.aClass260_12 != null && this.aClass260_12.anInterface1_7 == null) {
				this.aBoolean300 = true;
			} else {
				this.aShortArray52 = null;
			}
		}
		if (this.aByteArray76 != null && !Static188.method2983(this.anInt4047, this.anInt4019)) {
			if (this.aClass260_12 != null && this.aClass260_12.anInterface1_7 == null) {
				this.aBoolean300 = true;
			} else {
				this.aByteArray76 = null;
			}
		}
		if (this.aFloatArray30 != null && !Static84.method1686(this.anInt4047, this.anInt4019)) {
			if (this.aClass260_13 != null && this.aClass260_13.anInterface1_7 == null) {
				this.aBoolean300 = true;
			} else {
				this.aFloatArray30 = this.aFloatArray29 = null;
			}
		}
		if (this.aShortArray56 != null && !Static91.method1768(this.anInt4019, this.anInt4047)) {
			if (this.aClass260_12 != null && this.aClass260_12.anInterface1_7 == null) {
				this.aBoolean300 = true;
			} else {
				this.aShortArray56 = null;
			}
		}
		if (this.aShortArray53 != null && !Static199.method3100(this.anInt4047, this.anInt4019)) {
			if (this.aClass61_1 != null && this.aClass61_1.anInterface10_1 == null || this.aClass260_12 != null && this.aClass260_12.anInterface1_7 == null) {
				this.aBoolean300 = true;
			} else {
				this.aShortArray53 = this.aShortArray49 = this.aShortArray55 = null;
			}
		}
		if (this.anIntArrayArray38 != null && !Static281.method5827(this.anInt4019, this.anInt4047)) {
			this.anIntArrayArray38 = null;
			this.aShortArray48 = null;
		}
		if (this.anIntArrayArray39 != null && !Static307.method4342(this.anInt4047, this.anInt4019)) {
			this.anIntArrayArray39 = null;
			this.aShortArray58 = null;
		}
		if (this.anIntArrayArray37 != null && !Static241.method3949(this.anInt4047, this.anInt4019)) {
			this.anIntArrayArray37 = null;
		}
		if (this.anIntArray344 != null && (this.anInt4019 & 0x800) == 0 && (this.anInt4019 & 0x40000) == 0) {
			this.anIntArray344 = null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "()[Lclient!qc;")
	@Override
	public Class200[] method3290() {
		return this.aClass200Array3;
	}

	@OriginalMember(owner = "client!ko", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class162.anIntArray388[arg0];
		@Pc(13) int local13 = Class162.anIntArray387[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4027; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray343[local15] - local9 * this.anIntArray341[local15] >> 15;
			this.anIntArray341[local15] = this.anIntArray341[local15] * local13 + local9 * this.anIntArray343[local15] >> 15;
			this.anIntArray343[local15] = local34;
		}
		if (this.aClass260_10 != null) {
			this.aClass260_10.anInterface1_7 = null;
		}
		this.aBoolean299 = false;
	}

	@OriginalMember(owner = "client!ko", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean299) {
			this.method3303();
		}
		return this.aShort45;
	}

	@OriginalMember(owner = "client!ko", name = "N", descriptor = "(IIII)V")
	@Override
	protected void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static253.anInt4754 = 0;
			local14 = 0;
			Static338.anInt6360 = 0;
			Static204.anInt3384 = 0;
			for (local20 = 0; local20 < this.anInt4027; local20++) {
				Static338.anInt6360 += this.anIntArray342[local20];
				Static253.anInt4754 += this.anIntArray343[local20];
				Static204.anInt3384 += this.anIntArray341[local20];
				local14++;
			}
			if (local14 <= 0) {
				Static338.anInt6360 = arg1;
				Static204.anInt3384 = arg3;
				Static253.anInt4754 = arg2;
			} else {
				Static253.anInt4754 = arg2 + Static253.anInt4754 / local14;
				Static204.anInt3384 = arg3 + Static204.anInt3384 / local14;
				Static338.anInt6360 = arg1 + Static338.anInt6360 / local14;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt4027; local14++) {
				this.anIntArray342[local14] += arg1;
				this.anIntArray343[local14] += arg2;
				this.anIntArray341[local14] += arg3;
			}
		} else {
			@Pc(163) int local163;
			@Pc(181) int local181;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt4027; local14++) {
					this.anIntArray342[local14] -= Static338.anInt6360;
					this.anIntArray343[local14] -= Static253.anInt4754;
					this.anIntArray341[local14] -= Static204.anInt3384;
					if (arg3 != 0) {
						local20 = Class162.anIntArray388[arg3];
						local163 = Class162.anIntArray387[arg3];
						local181 = local163 * this.anIntArray342[local14] + local20 * this.anIntArray343[local14] + 32767 >> 15;
						this.anIntArray343[local14] = local163 * this.anIntArray343[local14] + 32767 - this.anIntArray342[local14] * local20 >> 15;
						this.anIntArray342[local14] = local181;
					}
					if (arg1 != 0) {
						local20 = Class162.anIntArray388[arg1];
						local163 = Class162.anIntArray387[arg1];
						local181 = this.anIntArray343[local14] * local163 + 32767 - this.anIntArray341[local14] * local20 >> 15;
						this.anIntArray341[local14] = local163 * this.anIntArray341[local14] + local20 * this.anIntArray343[local14] + 32767 >> 15;
						this.anIntArray343[local14] = local181;
					}
					if (arg2 != 0) {
						local20 = Class162.anIntArray388[arg2];
						local163 = Class162.anIntArray387[arg2];
						local181 = local163 * this.anIntArray342[local14] + this.anIntArray341[local14] * local20 + 32767 >> 15;
						this.anIntArray341[local14] = this.anIntArray341[local14] * local163 + 32767 - local20 * this.anIntArray342[local14] >> 15;
						this.anIntArray342[local14] = local181;
					}
					this.anIntArray342[local14] += Static338.anInt6360;
					this.anIntArray343[local14] += Static253.anInt4754;
					this.anIntArray341[local14] += Static204.anInt3384;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt4027; local14++) {
					this.anIntArray342[local14] -= Static338.anInt6360;
					this.anIntArray343[local14] -= Static253.anInt4754;
					this.anIntArray341[local14] -= Static204.anInt3384;
					this.anIntArray342[local14] = arg1 * this.anIntArray342[local14] / 128;
					this.anIntArray343[local14] = this.anIntArray343[local14] * arg2 / 128;
					this.anIntArray341[local14] = arg3 * this.anIntArray341[local14] / 128;
					this.anIntArray342[local14] += Static338.anInt6360;
					this.anIntArray343[local14] += Static253.anInt4754;
					this.anIntArray341[local14] += Static204.anInt3384;
				}
			} else {
				@Pc(512) Class111 local512;
				@Pc(517) Class25 local517;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt4013; local14++) {
						local20 = arg1 * 8 + (this.aByteArray76[local14] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray76[local14] = (byte) local20;
					}
					if (this.aClass260_12 != null) {
						this.aClass260_12.anInterface1_7 = null;
					}
					if (this.aClass111Array1 != null) {
						for (local20 = 0; local20 < this.anInt4065; local20++) {
							local512 = this.aClass111Array1[local20];
							local517 = this.aClass25Array1[local20];
							local517.anInt605 = 255 - (this.aByteArray76[local512.anInt3160] & 0xFF) << 24 | local517.anInt605 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt4013; local14++) {
						local20 = this.aShortArray52[local14] & 0xFFFF;
						local163 = local20 >> 10 & 0x3F;
						local181 = local20 >> 7 & 0x7;
						local181 += arg2 / 4;
						@Pc(586) int local586 = arg1 + local163 & 0x3F;
						@Pc(590) int local590 = local20 & 0x7F;
						if (local181 < 0) {
							local181 = 0;
						} else if (local181 > 7) {
							local181 = 7;
						}
						local590 += arg3;
						if (local590 < 0) {
							local590 = 0;
						} else if (local590 > 127) {
							local590 = 127;
						}
						this.aShortArray52[local14] = (short) (local590 | local181 << 7 | local586 << 10);
					}
					if (this.aClass260_12 != null) {
						this.aClass260_12.anInterface1_7 = null;
					}
					if (this.aClass111Array1 != null) {
						for (local20 = 0; local20 < this.anInt4065; local20++) {
							local512 = this.aClass111Array1[local20];
							local517 = this.aClass25Array1[local20];
							local517.anInt605 = local517.anInt605 & 0xFF000000 | Static199.anIntArray337[this.aShortArray52[local512.anInt3160] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(704) Class25 local704;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt4065; local14++) {
							local704 = this.aClass25Array1[local14];
							local704.anInt610 += arg2;
							local704.anInt609 += arg1;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt4065; local14++) {
							local704 = this.aClass25Array1[local14];
							local704.anInt617 = local704.anInt617 * arg2 >> 7;
							local704.anInt608 = arg1 * local704.anInt608 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt4065; local14++) {
							local704 = this.aClass25Array1[local14];
							local704.anInt613 = local704.anInt613 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class162.anIntArray388[arg0];
		@Pc(13) int local13 = Class162.anIntArray387[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4027; local15++) {
			local34 = this.anIntArray341[local15] * local9 + this.anIntArray342[local15] * local13 >> 15;
			this.anIntArray341[local15] = this.anIntArray341[local15] * local13 - local9 * this.anIntArray342[local15] >> 15;
			this.anIntArray342[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt4030; local34++) {
			@Pc(89) int local89 = this.aShortArray57[local34] * local9 + local13 * this.aShortArray51[local34] >> 15;
			this.aShortArray57[local34] = (short) (this.aShortArray57[local34] * local13 - this.aShortArray51[local34] * local9 >> 15);
			this.aShortArray51[local34] = (short) local89;
		}
		if (this.aClass260_11 == null && this.aClass260_12 != null) {
			this.aClass260_12.anInterface1_7 = null;
		}
		if (this.aClass260_11 != null) {
			this.aClass260_11.anInterface1_7 = null;
		}
		if (this.aClass260_10 != null) {
			this.aClass260_10.anInterface1_7 = null;
		}
		this.aBoolean299 = false;
	}
}
