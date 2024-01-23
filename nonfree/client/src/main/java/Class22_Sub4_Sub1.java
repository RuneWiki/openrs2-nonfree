import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class22_Sub4_Sub1 extends Class22_Sub4 {

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "Lclient!i;")
	private Class77 aClass77_1;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "Lclient!cd;")
	public Class27 aClass27_1;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "Lclient!om;")
	private Class130 aClass130_1;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "[I")
	public int[] anIntArray170;

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "[Lclient!fd;")
	public Class49[] aClass49Array1;

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "[F")
	private float[] aFloatArray16;

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "Lclient!om;")
	public Class130 aClass130_2;

	@OriginalMember(owner = "client!hi", name = "B", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!hi", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!hi", name = "D", descriptor = "Lclient!ch;")
	private Class30 aClass30_3;

	@OriginalMember(owner = "client!hi", name = "E", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!hi", name = "F", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!hi", name = "H", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!hi", name = "I", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!hi", name = "K", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!hi", name = "L", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!hi", name = "M", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!hi", name = "O", descriptor = "Lclient!om;")
	private Class130 aClass130_3;

	@OriginalMember(owner = "client!hi", name = "P", descriptor = "Lclient!om;")
	private Class130 aClass130_4;

	@OriginalMember(owner = "client!hi", name = "Q", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!hi", name = "R", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!hi", name = "T", descriptor = "[Lclient!bb;")
	public Class15[] aClass15Array1;

	@OriginalMember(owner = "client!hi", name = "U", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!hi", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!hi", name = "W", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!hi", name = "Y", descriptor = "[I")
	public int[] anIntArray175;

	@OriginalMember(owner = "client!hi", name = "bb", descriptor = "[F")
	private float[] aFloatArray17;

	@OriginalMember(owner = "client!hi", name = "db", descriptor = "Lclient!om;")
	private Class130 aClass130_5;

	@OriginalMember(owner = "client!hi", name = "J", descriptor = "B")
	private byte aByte6 = 0;

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "B")
	private byte aByte5 = 0;

	@OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
	public int anInt1917 = 0;

	@OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
	private int anInt1918 = 0;

	@OriginalMember(owner = "client!hi", name = "ab", descriptor = "I")
	private int anInt1919 = 0;

	@OriginalMember(owner = "client!hi", name = "S", descriptor = "Z")
	public boolean aBoolean147 = false;

	@OriginalMember(owner = "client!hi", name = "cb", descriptor = "I")
	private int anInt1920 = 0;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	public Class22_Sub4_Sub1() {
	}

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!tk;IIZ)V")
	public Class22_Sub4_Sub1(@OriginalArg(0) Class22_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(26) int[] local26 = new int[arg0.anInt5257];
		this.anIntArray173 = new int[arg0.anInt5254 + 1];
		for (@Pc(35) int local35 = 0; local35 < arg0.anInt5257; local35++) {
			if ((arg0.aByteArray60 == null || arg0.aByteArray60[local35] != 2) && (arg0.aShortArray82 == null || arg0.aShortArray82[local35] == -1 || !Static18.anInterface1_1.method1632(arg0.aShortArray82[local35] & 0xFFFF))) {
				local26[this.anInt1920++] = local35;
				this.anIntArray173[arg0.anIntArray478[local35]]++;
				this.anIntArray173[arg0.anIntArray482[local35]]++;
				this.anIntArray173[arg0.anIntArray480[local35]]++;
			}
		}
		@Pc(118) long[] local118 = new long[this.anInt1920];
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(130) int local130;
		@Pc(229) int local229;
		for (local120 = 0; local120 < this.anInt1920; local120++) {
			local128 = local26[local120];
			local130 = 0;
			@Pc(132) byte local132 = 0;
			@Pc(134) int local134 = 0;
			@Pc(136) int local136 = 0;
			@Pc(138) short local138 = -1;
			if (arg0.aShortArray82 != null) {
				local138 = arg0.aShortArray82[local128];
				if (local138 != -1) {
					local134 = Static18.anInterface1_1.method1626(local138 & 0xFFFF);
					local136 = Static18.anInterface1_1.method1636(local138 & 0xFFFF);
				}
			}
			@Pc(185) boolean local185 = arg0.aByteArray58 != null && arg0.aByteArray58[local128] != 0 || local138 != -1 && !Static18.anInterface1_1.method1634(local138 & 0xFFFF);
			if ((arg3 || local185) && arg0.aByteArray59 != null) {
				local130 += arg0.aByteArray59[local128] << 17;
			}
			if (local185) {
				local130 += 65536;
			}
			local130 += (local134 & 0xFF) << 8;
			local130 += local136 & 0xFF;
			local229 = local132 + ((local138 & 0xFFFF) << 16);
			@Pc(235) int local235 = local229 + (local120 & 0xFFFF);
			local118[local120] = ((long) local130 << 32) + (long) local235;
		}
		Static283.method4220(local118, local26);
		this.anInt1917 = arg0.anInt5254;
		this.anInt1918 = arg0.anInt5258;
		this.anIntArray174 = arg0.anIntArray483;
		this.anIntArray175 = arg0.anIntArray486;
		this.anIntArray170 = arg0.anIntArray475;
		this.anIntArray172 = arg0.anIntArray485;
		this.aShortArray31 = arg0.aShortArray88;
		this.aClass49Array1 = arg0.aClass49Array3;
		this.aClass15Array1 = arg0.aClass15Array3;
		local120 = this.anInt1920 * 3;
		this.aShortArray34 = new short[local120];
		this.aShortArray26 = new short[local120];
		this.aShortArray24 = new short[local120];
		this.aShortArray33 = new short[local120];
		this.aFloatArray16 = new float[local120];
		this.aFloatArray17 = new float[local120];
		this.aShortArray30 = new short[this.anInt1920];
		this.aByteArray17 = new byte[this.anInt1920];
		this.aShortArray23 = new short[this.anInt1920];
		this.aShortArray27 = new short[this.anInt1920];
		this.aShortArray29 = new short[this.anInt1920];
		this.aShortArray32 = new short[this.anInt1920];
		if (arg0.anIntArray484 != null) {
			this.aByteArray18 = new byte[this.anInt1920];
		}
		if (arg0.aShortArray85 != null) {
			this.aShortArray28 = new short[this.anInt1920];
		}
		this.aClass27_1 = new Class27();
		this.aClass130_2 = new Class130();
		this.aClass130_5 = new Class130();
		if (Static302.aBoolean419) {
			this.aClass130_4 = new Class130();
		}
		this.aClass130_1 = new Class130();
		this.aClass130_3 = new Class130();
		this.aShort10 = (short) arg1;
		this.aShort11 = (short) arg2;
		this.aShortArray25 = new short[local120];
		Static102.aLongArray44 = new long[local120];
		local128 = 0;
		for (local130 = 0; local130 < this.anInt1918; local130++) {
			local229 = this.anIntArray173[local130];
			this.anIntArray173[local130] = local128;
			local128 += local229;
		}
		this.anIntArray173[this.anInt1918] = local128;
		@Pc(441) int[] local441 = null;
		@Pc(443) int[] local443 = null;
		@Pc(445) int[] local445 = null;
		@Pc(448) float[][] local448 = null;
		@Pc(568) int local568;
		@Pc(454) int local454;
		@Pc(698) float local698;
		@Pc(729) float local729;
		@Pc(700) float local700;
		if (arg0.aByteArray62 != null) {
			local454 = arg0.anInt5255;
			@Pc(457) int[] local457 = new int[local454];
			@Pc(460) int[] local460 = new int[local454];
			@Pc(463) int[] local463 = new int[local454];
			@Pc(466) int[] local466 = new int[local454];
			@Pc(469) int[] local469 = new int[local454];
			@Pc(472) int[] local472 = new int[local454];
			@Pc(474) int local474;
			for (local474 = 0; local474 < local454; local474++) {
				local457[local474] = Integer.MAX_VALUE;
				local460[local474] = -2147483647;
				local463[local474] = Integer.MAX_VALUE;
				local466[local474] = -2147483647;
				local469[local474] = Integer.MAX_VALUE;
				local472[local474] = -2147483647;
			}
			for (local474 = 0; local474 < this.anInt1920; local474++) {
				@Pc(513) int local513 = local26[local474];
				if (arg0.aByteArray62[local513] != -1) {
					@Pc(526) int local526 = arg0.aByteArray62[local513] & 0xFF;
					for (@Pc(528) int local528 = 0; local528 < 3; local528++) {
						@Pc(538) int local538;
						if (local528 == 0) {
							local538 = arg0.anIntArray478[local513];
						} else if (local528 == 1) {
							local538 = arg0.anIntArray482[local513];
						} else {
							local538 = arg0.anIntArray480[local513];
						}
						@Pc(558) int local558 = arg0.anIntArray483[local538];
						@Pc(563) int local563 = arg0.anIntArray486[local538];
						local568 = arg0.anIntArray475[local538];
						if (local558 < local457[local526]) {
							local457[local526] = local558;
						}
						if (local558 > local460[local526]) {
							local460[local526] = local558;
						}
						if (local563 < local463[local526]) {
							local463[local526] = local563;
						}
						if (local563 > local466[local526]) {
							local466[local526] = local563;
						}
						if (local568 < local469[local526]) {
							local469[local526] = local568;
						}
						if (local568 > local472[local526]) {
							local472[local526] = local568;
						}
					}
				}
			}
			local441 = new int[local454];
			local443 = new int[local454];
			local445 = new int[local454];
			local448 = new float[local454][];
			for (local474 = 0; local474 < local454; local474++) {
				@Pc(648) byte local648 = arg0.aByteArray64[local474];
				if (local648 > 0) {
					local441[local474] = (local457[local474] + local460[local474]) / 2;
					local443[local474] = (local463[local474] + local466[local474]) / 2;
					local445[local474] = (local469[local474] + local472[local474]) / 2;
					if (local648 == 1) {
						@Pc(694) short local694 = arg0.aShortArray87[local474];
						if (local694 == 0) {
							local698 = 1.0F;
							local700 = 1.0F;
						} else if (local694 > 0) {
							local698 = 1.0F;
							local700 = (float) local694 / 1024.0F;
						} else {
							local700 = 1.0F;
							local698 = (float) -local694 / 1024.0F;
						}
						local729 = 64.0F / (float) (arg0.aShortArray86[local474] & 0xFFFF);
					} else if (local648 == 2) {
						local698 = 64.0F / (float) (arg0.aShortArray87[local474] & 0xFFFF);
						local729 = 64.0F / (float) (arg0.aShortArray86[local474] & 0xFFFF);
						local700 = 64.0F / (float) (arg0.aShortArray81[local474] & 0xFFFF);
					} else {
						local698 = (float) arg0.aShortArray87[local474] / 1024.0F;
						local729 = (float) arg0.aShortArray86[local474] / 1024.0F;
						local700 = (float) arg0.aShortArray81[local474] / 1024.0F;
					}
					local448[local474] = Static102.method1591(arg0.aShortArray89[local474], arg0.aShortArray84[local474], arg0.aShortArray80[local474], arg0.aByteArray65[local474] & 0xFF, local698, local729, local700);
				}
			}
		}
		@Pc(832) int local832;
		@Pc(837) short local837;
		for (local454 = 0; local454 < this.anInt1920; local454++) {
			@Pc(825) int local825 = local26[local454];
			local832 = arg0.aShortArray83[local825] & 0xFFFF;
			if (arg0.aShortArray82 == null) {
				local837 = -1;
			} else {
				local837 = arg0.aShortArray82[local825];
			}
			@Pc(848) int local848;
			if (arg0.aByteArray62 == null) {
				local848 = -1;
			} else {
				local848 = arg0.aByteArray62[local825];
			}
			@Pc(859) int local859;
			if (arg0.aByteArray58 == null) {
				local859 = 0;
			} else {
				local859 = arg0.aByteArray58[local825] & 0xFF;
			}
			@Pc(869) float local869 = 0.0F;
			@Pc(871) float local871 = 0.0F;
			@Pc(873) float local873 = 0.0F;
			local698 = 0.0F;
			local729 = 0.0F;
			local700 = 0.0F;
			@Pc(881) byte local881 = 0;
			@Pc(883) byte local883 = 0;
			local568 = 0;
			@Pc(917) byte local917;
			@Pc(934) int local934;
			@Pc(1295) int local1295;
			if (local837 != -1) {
				if (local848 == -1) {
					local869 = 0.0F;
					local871 = 1.0F;
					local873 = 1.0F;
					local698 = 1.0F;
					local881 = 1;
					local729 = 0.0F;
					local700 = 0.0F;
					local883 = 2;
				} else {
					local848 &= 0xFF;
					local917 = arg0.aByteArray64[local848];
					@Pc(924) int local924;
					@Pc(929) int local929;
					@Pc(967) float local967;
					@Pc(975) float local975;
					@Pc(983) float local983;
					@Pc(1063) float local1063;
					@Pc(1071) float local1071;
					@Pc(1079) float local1079;
					@Pc(1087) float local1087;
					@Pc(1095) float local1095;
					@Pc(1103) float local1103;
					if (local917 == 0) {
						local924 = arg0.anIntArray478[local825];
						local929 = arg0.anIntArray482[local825];
						local934 = arg0.anIntArray480[local825];
						@Pc(939) short local939 = arg0.aShortArray89[local848];
						@Pc(944) short local944 = arg0.aShortArray84[local848];
						@Pc(949) short local949 = arg0.aShortArray80[local848];
						@Pc(955) float local955 = (float) arg0.anIntArray483[local939];
						@Pc(961) float local961 = (float) arg0.anIntArray486[local939];
						local967 = arg0.anIntArray475[local939];
						local975 = (float) arg0.anIntArray483[local944] - local955;
						local983 = (float) arg0.anIntArray486[local944] - local961;
						@Pc(991) float local991 = (float) arg0.anIntArray475[local944] - local967;
						@Pc(999) float local999 = (float) arg0.anIntArray483[local949] - local955;
						@Pc(1007) float local1007 = (float) arg0.anIntArray486[local949] - local961;
						@Pc(1015) float local1015 = (float) arg0.anIntArray475[local949] - local967;
						@Pc(1023) float local1023 = (float) arg0.anIntArray483[local924] - local955;
						@Pc(1031) float local1031 = (float) arg0.anIntArray486[local924] - local961;
						@Pc(1039) float local1039 = (float) arg0.anIntArray475[local924] - local967;
						@Pc(1047) float local1047 = (float) arg0.anIntArray483[local929] - local955;
						@Pc(1055) float local1055 = (float) arg0.anIntArray486[local929] - local961;
						local1063 = (float) arg0.anIntArray475[local929] - local967;
						local1071 = (float) arg0.anIntArray483[local934] - local955;
						local1079 = (float) arg0.anIntArray486[local934] - local961;
						local1087 = (float) arg0.anIntArray475[local934] - local967;
						local1095 = local983 * local1015 - local991 * local1007;
						local1103 = local991 * local999 - local975 * local1015;
						@Pc(1111) float local1111 = local975 * local1007 - local983 * local999;
						@Pc(1119) float local1119 = local1007 * local1111 - local1015 * local1103;
						@Pc(1127) float local1127 = local1015 * local1095 - local999 * local1111;
						@Pc(1135) float local1135 = local999 * local1103 - local1007 * local1095;
						@Pc(1149) float local1149 = 1.0F / (local1119 * local975 + local1127 * local983 + local1135 * local991);
						local869 = (local1119 * local1023 + local1127 * local1031 + local1135 * local1039) * local1149;
						local873 = (local1119 * local1047 + local1127 * local1055 + local1135 * local1063) * local1149;
						local729 = (local1119 * local1071 + local1127 * local1079 + local1135 * local1087) * local1149;
						@Pc(1199) float local1199 = local983 * local1111 - local991 * local1103;
						@Pc(1207) float local1207 = local991 * local1095 - local975 * local1111;
						@Pc(1215) float local1215 = local975 * local1103 - local983 * local1095;
						@Pc(1229) float local1229 = 1.0F / (local1199 * local999 + local1207 * local1007 + local1215 * local1015);
						local871 = (local1199 * local1023 + local1207 * local1031 + local1215 * local1039) * local1229;
						local698 = (local1199 * local1047 + local1207 * local1055 + local1215 * local1063) * local1229;
						local700 = (local1199 * local1071 + local1207 * local1079 + local1215 * local1087) * local1229;
					} else {
						local924 = arg0.anIntArray478[local825];
						local929 = arg0.anIntArray482[local825];
						local934 = arg0.anIntArray480[local825];
						@Pc(1291) int local1291 = local441[local848];
						local1295 = local443[local848];
						@Pc(1299) int local1299 = local445[local848];
						@Pc(1303) float[] local1303 = local448[local848];
						@Pc(1308) byte local1308 = arg0.aByteArray63[local848];
						local967 = (float) arg0.aByteArray67[local848] / 256.0F;
						if (local917 == 1) {
							local975 = (float) (arg0.aShortArray81[local848] & 0xFFFF) / 1024.0F;
							Static102.method1603(arg0.anIntArray483[local924], arg0.anIntArray486[local924], arg0.anIntArray475[local924], local1291, local1295, local1299, local1303, local975, local1308, local967);
							local869 = Static102.aFloat22;
							local871 = Static102.aFloat17;
							Static102.method1603(arg0.anIntArray483[local929], arg0.anIntArray486[local929], arg0.anIntArray475[local929], local1291, local1295, local1299, local1303, local975, local1308, local967);
							local873 = Static102.aFloat22;
							local698 = Static102.aFloat17;
							Static102.method1603(arg0.anIntArray483[local934], arg0.anIntArray486[local934], arg0.anIntArray475[local934], local1291, local1295, local1299, local1303, local975, local1308, local967);
							local729 = Static102.aFloat22;
							local700 = Static102.aFloat17;
							local983 = local975 / 2.0F;
							if ((local1308 & 0x1) == 0) {
								if (local873 - local869 > local983) {
									local873 -= local975;
									local881 = 1;
								} else if (local869 - local873 > local983) {
									local873 += local975;
									local881 = 2;
								}
								if (local729 - local869 > local983) {
									local729 -= local975;
									local883 = 1;
								} else if (local869 - local729 > local983) {
									local729 += local975;
									local883 = 2;
								}
							} else {
								if (local698 - local871 > local983) {
									local698 -= local975;
									local881 = 1;
								} else if (local871 - local698 > local983) {
									local698 += local975;
									local881 = 2;
								}
								if (local700 - local871 > local983) {
									local700 -= local975;
									local883 = 1;
								} else if (local871 - local700 > local983) {
									local700 += local975;
									local883 = 2;
								}
							}
						} else if (local917 == 2) {
							local975 = (float) arg0.aByteArray66[local848] / 256.0F;
							local983 = (float) arg0.aByteArray61[local848] / 256.0F;
							@Pc(1540) int local1540 = arg0.anIntArray483[local929] - arg0.anIntArray483[local924];
							@Pc(1550) int local1550 = arg0.anIntArray486[local929] - arg0.anIntArray486[local924];
							@Pc(1560) int local1560 = arg0.anIntArray475[local929] - arg0.anIntArray475[local924];
							@Pc(1570) int local1570 = arg0.anIntArray483[local934] - arg0.anIntArray483[local924];
							@Pc(1580) int local1580 = arg0.anIntArray486[local934] - arg0.anIntArray486[local924];
							@Pc(1590) int local1590 = arg0.anIntArray475[local934] - arg0.anIntArray475[local924];
							@Pc(1598) int local1598 = local1550 * local1590 - local1580 * local1560;
							@Pc(1606) int local1606 = local1560 * local1570 - local1590 * local1540;
							@Pc(1614) int local1614 = local1540 * local1580 - local1570 * local1550;
							local1063 = 64.0F / (float) (arg0.aShortArray87[local848] & 0xFFFF);
							local1071 = 64.0F / (float) (arg0.aShortArray86[local848] & 0xFFFF);
							local1079 = 64.0F / (float) (arg0.aShortArray81[local848] & 0xFFFF);
							local1087 = ((float) local1598 * local1303[0] + (float) local1606 * local1303[1] + (float) local1614 * local1303[2]) / local1063;
							local1095 = ((float) local1598 * local1303[3] + (float) local1606 * local1303[4] + (float) local1614 * local1303[5]) / local1071;
							local1103 = ((float) local1598 * local1303[6] + (float) local1606 * local1303[7] + (float) local1614 * local1303[8]) / local1079;
							local568 = Static102.method1601(local1087, local1095, local1103);
							Static102.method1578(arg0.anIntArray483[local924], arg0.anIntArray486[local924], arg0.anIntArray475[local924], local1291, local1295, local1299, local568, local1303, local1308, local967, local975, local983);
							local869 = Static102.aFloat21;
							local871 = Static102.aFloat20;
							Static102.method1578(arg0.anIntArray483[local929], arg0.anIntArray486[local929], arg0.anIntArray475[local929], local1291, local1295, local1299, local568, local1303, local1308, local967, local975, local983);
							local873 = Static102.aFloat21;
							local698 = Static102.aFloat20;
							Static102.method1578(arg0.anIntArray483[local934], arg0.anIntArray486[local934], arg0.anIntArray475[local934], local1291, local1295, local1299, local568, local1303, local1308, local967, local975, local983);
							local729 = Static102.aFloat21;
							local700 = Static102.aFloat20;
						} else if (local917 == 3) {
							Static102.method1573(arg0.anIntArray483[local924], arg0.anIntArray486[local924], arg0.anIntArray475[local924], local1291, local1295, local1299, local1303, local1308, local967);
							local869 = Static102.aFloat19;
							local871 = Static102.aFloat18;
							Static102.method1573(arg0.anIntArray483[local929], arg0.anIntArray486[local929], arg0.anIntArray475[local929], local1291, local1295, local1299, local1303, local1308, local967);
							local873 = Static102.aFloat19;
							local698 = Static102.aFloat18;
							Static102.method1573(arg0.anIntArray483[local934], arg0.anIntArray486[local934], arg0.anIntArray475[local934], local1291, local1295, local1299, local1303, local1308, local967);
							local729 = Static102.aFloat19;
							local700 = Static102.aFloat18;
							if ((local1308 & 0x1) == 0) {
								if (local873 - local869 > 0.5F) {
									local873--;
									local881 = 1;
								} else if (local869 - local873 > 0.5F) {
									local873++;
									local881 = 2;
								}
								if (local729 - local869 > 0.5F) {
									local729--;
									local883 = 1;
								} else if (local869 - local729 > 0.5F) {
									local729++;
									local883 = 2;
								}
							} else {
								if (local698 - local871 > 0.5F) {
									local698--;
									local881 = 1;
								} else if (local871 - local698 > 0.5F) {
									local698++;
									local881 = 2;
								}
								if (local700 - local871 > 0.5F) {
									local700--;
									local883 = 1;
								} else if (local871 - local700 > 0.5F) {
									local700++;
									local883 = 2;
								}
							}
						}
					}
				}
			}
			arg0.method4089();
			if (arg0.aByteArray60 == null) {
				local917 = 0;
			} else {
				local917 = arg0.aByteArray60[local825];
			}
			if (local917 == 0) {
				@Pc(2009) long local2009 = (long) (local848 << 2) + ((long) (local568 << 24) + (long) (local832 << 8) + (long) local859 << 32);
				local934 = arg0.anIntArray478[local825];
				@Pc(2019) Class98 local2019 = arg0.aClass98Array2[local934];
				this.aShortArray23[local454] = this.method1590(arg0, local934, local2009, local2019.anInt2727, local2019.anInt2723, local2019.anInt2728, local2019.anInt2721, local869, local871);
				local1295 = arg0.anIntArray482[local825];
				@Pc(2048) Class98 local2048 = arg0.aClass98Array2[local1295];
				this.aShortArray27[local454] = this.method1590(arg0, local1295, local2009 + (long) local881, local2048.anInt2727, local2048.anInt2723, local2048.anInt2728, local2048.anInt2721, local873, local698);
				@Pc(2075) int local2075 = arg0.anIntArray480[local825];
				@Pc(2080) Class98 local2080 = arg0.aClass98Array2[local2075];
				this.aShortArray29[local454] = this.method1590(arg0, local2075, local2009 + (long) local883, local2080.anInt2727, local2080.anInt2723, local2080.anInt2728, local2080.anInt2721, local729, local700);
			} else if (local917 == 1) {
				@Pc(2111) Class25 local2111 = arg0.aClass25Array1[local825];
				@Pc(2152) long local2152 = (long) ((local848 << 2) + (local2111.anInt507 > 0 ? 1024 : 2048) + (local2111.anInt504 + 256 << 12) + (local2111.anInt501 + 256 << 22)) + ((long) (local568 << 24) + (long) (local832 << 8) + (long) local859 << 32);
				this.aShortArray23[local454] = this.method1590(arg0, arg0.anIntArray478[local825], local2152, local2111.anInt507, local2111.anInt504, local2111.anInt501, 0, local869, local871);
				this.aShortArray27[local454] = this.method1590(arg0, arg0.anIntArray482[local825], local2152 + (long) local881, local2111.anInt507, local2111.anInt504, local2111.anInt501, 0, local873, local698);
				this.aShortArray29[local454] = this.method1590(arg0, arg0.anIntArray480[local825], local2152 + (long) local883, local2111.anInt507, local2111.anInt504, local2111.anInt501, 0, local729, local700);
			}
			if (arg0.aShortArray82 == null) {
				this.aShortArray32[local454] = -1;
			} else {
				this.aShortArray32[local454] = arg0.aShortArray82[local825];
			}
			if (this.aByteArray18 != null) {
				this.aByteArray18[local454] = (byte) arg0.anIntArray484[local825];
			}
			this.aShortArray30[local454] = arg0.aShortArray83[local825];
			if (arg0.aByteArray58 != null) {
				this.aByteArray17[local454] = arg0.aByteArray58[local825];
			}
			if (arg0.aShortArray85 != null) {
				this.aShortArray28[local454] = arg0.aShortArray85[local825];
			}
		}
		local454 = 0;
		@Pc(2286) short local2286 = -10000;
		for (local832 = 0; local832 < this.anInt1920; local832++) {
			local837 = this.aShortArray32[local832];
			if (local837 != local2286) {
				local454++;
				local2286 = local837;
			}
		}
		this.anIntArray171 = new int[local454 + 1];
		local454 = 0;
		local2286 = -10000;
		for (local832 = 0; local832 < this.anInt1920; local832++) {
			local837 = this.aShortArray32[local832];
			if (local837 != local2286) {
				this.anIntArray171[local454++] = local832;
				local2286 = local837;
			}
		}
		this.anIntArray171[local454] = this.anInt1920;
		Static102.aLongArray44 = null;
		this.aShortArray34 = Static102.method1584(this.aShortArray34, this.anInt1919);
		this.aShortArray26 = Static102.method1584(this.aShortArray26, this.anInt1919);
		this.aShortArray24 = Static102.method1584(this.aShortArray24, this.anInt1919);
		this.aShortArray33 = Static102.method1584(this.aShortArray33, this.anInt1919);
		this.aFloatArray16 = Static102.method1572(this.aFloatArray16, this.anInt1919);
		this.aFloatArray17 = Static102.method1572(this.aFloatArray17, this.anInt1919);
	}

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "()V")
	public void method1571() {
		if (this.aShortArray34 == null) {
			this.method3555();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt1917; local7++) {
			this.anIntArray174[local7] = -this.anIntArray174[local7];
			this.anIntArray170[local7] = -this.anIntArray170[local7];
		}
		for (local7 = 0; local7 < this.anInt1919; local7++) {
			this.aShortArray34[local7] = (short) -this.aShortArray34[local7];
			this.aShortArray24[local7] = (short) -this.aShortArray24[local7];
		}
		this.aClass27_1.aBoolean39 = false;
		this.aClass130_2.aBoolean277 = false;
		if (this.aClass130_4 != null) {
			this.aClass130_4.aBoolean277 = false;
		}
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)V")
	public void method1575() {
		if (this.aShortArray34 == null) {
			this.method3554(256);
			return;
		}
		@Pc(10) int local10 = Class17.anIntArray22[256];
		@Pc(14) int local14 = Class17.anIntArray24[256];
		@Pc(16) int local16;
		@Pc(36) int local36;
		for (local16 = 0; local16 < this.anInt1917; local16++) {
			local36 = this.anIntArray170[local16] * local10 + this.anIntArray174[local16] * local14 >> 16;
			this.anIntArray170[local16] = this.anIntArray170[local16] * local14 - this.anIntArray174[local16] * local10 >> 16;
			this.anIntArray174[local16] = local36;
		}
		for (local16 = 0; local16 < this.anInt1919; local16++) {
			local36 = this.aShortArray24[local16] * local10 + this.aShortArray34[local16] * local14 >> 16;
			this.aShortArray24[local16] = (short) (this.aShortArray24[local16] * local14 - this.aShortArray34[local16] * local10 >> 16);
			this.aShortArray34[local16] = (short) local36;
		}
		this.aClass27_1.aBoolean39 = false;
		this.aClass130_2.aBoolean277 = false;
		if (this.aClass130_4 != null) {
			this.aClass130_4.aBoolean277 = false;
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class17.anIntArray22[arg0];
		@Pc(7) int local7 = Class17.anIntArray24[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1917; local9++) {
			@Pc(29) int local29 = this.anIntArray175[local9] * local7 - this.anIntArray170[local9] * local3 >> 16;
			this.anIntArray170[local9] = this.anIntArray175[local9] * local3 + this.anIntArray170[local9] * local7 >> 16;
			this.anIntArray175[local9] = local29;
		}
		this.aClass27_1.aBoolean39 = false;
		this.aClass130_2.aBoolean277 = false;
	}

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "()V")
	private void method1576() {
		if (Static102.aClass1_Sub14_3.aByteArray34.length < this.anInt1920 * 12) {
			Static102.aClass1_Sub14_3 = new Class1_Sub14((this.anInt1920 + 100) * 12);
		} else {
			Static102.aClass1_Sub14_3.anInt3290 = 0;
		}
		@Pc(25) int local25;
		if (Static291.aBoolean413) {
			for (local25 = 0; local25 < this.anInt1920; local25++) {
				Static102.aClass1_Sub14_3.method2630(this.aShortArray23[local25]);
				Static102.aClass1_Sub14_3.method2630(this.aShortArray27[local25]);
				Static102.aClass1_Sub14_3.method2630(this.aShortArray29[local25]);
			}
		} else {
			for (local25 = 0; local25 < this.anInt1920; local25++) {
				Static102.aClass1_Sub14_3.method2611(this.aShortArray23[local25]);
				Static102.aClass1_Sub14_3.method2611(this.aShortArray27[local25]);
				Static102.aClass1_Sub14_3.method2611(this.aShortArray29[local25]);
			}
		}
		if (!Static291.aBoolean405) {
			@Pc(115) ByteBuffer local115 = ByteBuffer.allocateDirect(Static102.aClass1_Sub14_3.anInt3290);
			local115.put(Static102.aClass1_Sub14_3.aByteArray34, 0, Static102.aClass1_Sub14_3.anInt3290);
			local115.flip();
			this.aClass130_3.aBoolean277 = true;
			this.aClass130_3.aByteBuffer15 = local115;
			this.aClass130_3.aClass30_7 = null;
			return;
		}
		@Pc(88) Class30 local88 = new Class30();
		@Pc(95) ByteBuffer local95 = ByteBuffer.wrap(Static102.aClass1_Sub14_3.aByteArray34, 0, Static102.aClass1_Sub14_3.anInt3290);
		local88.method544(local95);
		this.aClass130_3.aBoolean277 = true;
		this.aClass130_3.aByteBuffer15 = null;
		this.aClass130_3.aClass30_7 = local88;
	}

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "()I")
	public int method1577() {
		return this.aShort11;
	}

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "()I")
	@Override
	public int method3560() {
		if (!this.aClass27_1.aBoolean39) {
			this.method1602();
		}
		return this.aClass27_1.aShort6;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Lclient!h;")
	@Override
	public Class22 method4074() {
		this.aBoolean147 = false;
		if (this.aClass77_1 != null) {
			this.aShortArray34 = this.aClass77_1.aShortArray45;
			this.aShortArray26 = this.aClass77_1.aShortArray46;
			this.aShortArray24 = this.aClass77_1.aShortArray43;
			this.aShortArray33 = this.aClass77_1.aShortArray44;
			this.aClass77_1 = null;
		}
		return this;
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)V")
	public void method1579(@OriginalArg(0) int arg0) {
		this.aShort11 = (short) arg0;
		if (this.aClass130_4 != null) {
			this.aClass130_4.aBoolean277 = false;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static102.anInt1921 = 0;
			Static102.anInt1922 = 0;
			Static102.anInt1923 = 0;
			for (local11 = 0; local11 < this.anInt1917; local11++) {
				Static102.anInt1921 += this.anIntArray174[local11];
				Static102.anInt1922 += this.anIntArray175[local11];
				Static102.anInt1923 += this.anIntArray170[local11];
				local3++;
			}
			if (local3 > 0) {
				Static102.anInt1921 = Static102.anInt1921 / local3 + arg1;
				Static102.anInt1922 = Static102.anInt1922 / local3 + arg2;
				Static102.anInt1923 = Static102.anInt1923 / local3 + arg3;
			} else {
				Static102.anInt1921 = arg1;
				Static102.anInt1922 = arg2;
				Static102.anInt1923 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt1917; local3++) {
				this.anIntArray174[local3] += arg1;
				this.anIntArray175[local3] += arg2;
				this.anIntArray170[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt1917; local3++) {
					this.anIntArray174[local3] -= Static102.anInt1921;
					this.anIntArray175[local3] -= Static102.anInt1922;
					this.anIntArray170[local3] -= Static102.anInt1923;
					if (arg3 != 0) {
						local11 = Class17.anIntArray22[arg3];
						local146 = Class17.anIntArray24[arg3];
						local164 = this.anIntArray175[local3] * local11 + this.anIntArray174[local3] * local146 + 32767 >> 16;
						this.anIntArray175[local3] = this.anIntArray175[local3] * local146 + 32767 - this.anIntArray174[local3] * local11 >> 16;
						this.anIntArray174[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class17.anIntArray22[arg1];
						local146 = Class17.anIntArray24[arg1];
						local164 = this.anIntArray175[local3] * local146 + 32767 - this.anIntArray170[local3] * local11 >> 16;
						this.anIntArray170[local3] = this.anIntArray175[local3] * local11 + this.anIntArray170[local3] * local146 + 32767 >> 16;
						this.anIntArray175[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class17.anIntArray22[arg2];
						local146 = Class17.anIntArray24[arg2];
						local164 = this.anIntArray170[local3] * local11 + this.anIntArray174[local3] * local146 + 32767 >> 16;
						this.anIntArray170[local3] = this.anIntArray170[local3] * local146 + 32767 - this.anIntArray174[local3] * local11 >> 16;
						this.anIntArray174[local3] = local164;
					}
					this.anIntArray174[local3] += Static102.anInt1921;
					this.anIntArray175[local3] += Static102.anInt1922;
					this.anIntArray170[local3] += Static102.anInt1923;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt1917; local3++) {
					this.anIntArray174[local3] -= Static102.anInt1921;
					this.anIntArray175[local3] -= Static102.anInt1922;
					this.anIntArray170[local3] -= Static102.anInt1923;
					this.anIntArray174[local3] = this.anIntArray174[local3] * arg1 / 128;
					this.anIntArray175[local3] = this.anIntArray175[local3] * arg2 / 128;
					this.anIntArray170[local3] = this.anIntArray170[local3] * arg3 / 128;
					this.anIntArray174[local3] += Static102.anInt1921;
					this.anIntArray175[local3] += Static102.anInt1922;
					this.anIntArray170[local3] += Static102.anInt1923;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt1920; local3++) {
					local11 = (this.aByteArray17[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray17[local3] = (byte) local11;
				}
				this.aClass130_5.aBoolean277 = false;
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt1920; local3++) {
					local11 = this.aShortArray30[local3] & 0xFFFF;
					local146 = local11 >> 10 & 0x3F;
					local164 = local11 >> 7 & 0x7;
					@Pc(496) int local496 = local11 & 0x7F;
					@Pc(502) int local502 = local146 + arg1 & 0x3F;
					local164 += arg2 / 4;
					if (local164 < 0) {
						local164 = 0;
					} else if (local164 > 7) {
						local164 = 7;
					}
					local496 += arg3;
					if (local496 < 0) {
						local496 = 0;
					} else if (local496 > 127) {
						local496 = 127;
					}
					this.aShortArray30[local3] = (short) (local502 << 10 | local164 << 7 | local496);
				}
				this.aClass130_5.aBoolean277 = false;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	@Override
	public void method3554(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class17.anIntArray22[arg0];
		@Pc(7) int local7 = Class17.anIntArray24[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1917; local9++) {
			@Pc(29) int local29 = this.anIntArray170[local9] * local3 + this.anIntArray174[local9] * local7 >> 16;
			this.anIntArray170[local9] = this.anIntArray170[local9] * local7 - this.anIntArray174[local9] * local3 >> 16;
			this.anIntArray174[local9] = local29;
		}
		this.aClass27_1.aBoolean39 = false;
		this.aClass130_2.aBoolean277 = false;
	}

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "()V")
	public void method1581() {
		if (this.aShortArray34 == null) {
			this.method3556();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt1917; local7++) {
			@Pc(16) int local16 = this.anIntArray170[local7];
			this.anIntArray170[local7] = this.anIntArray174[local7];
			this.anIntArray174[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt1919; local7++) {
			@Pc(43) short local43 = this.aShortArray24[local7];
			this.aShortArray24[local7] = this.aShortArray34[local7];
			this.aShortArray34[local7] = (short) -local43;
		}
		this.aClass27_1.aBoolean39 = false;
		this.aClass130_2.aBoolean277 = false;
		if (this.aClass130_4 != null) {
			this.aClass130_4.aBoolean277 = false;
		}
	}

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "()V")
	public void method1582() {
		if (this.aShortArray34 == null) {
			this.method3578();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt1917; local7++) {
			@Pc(16) int local16 = this.anIntArray174[local7];
			this.anIntArray174[local7] = this.anIntArray170[local7];
			this.anIntArray170[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt1919; local7++) {
			@Pc(43) short local43 = this.aShortArray34[local7];
			this.aShortArray34[local7] = this.aShortArray24[local7];
			this.aShortArray24[local7] = (short) -local43;
		}
		this.aClass27_1.aBoolean39 = false;
		this.aClass130_2.aBoolean277 = false;
		if (this.aClass130_4 != null) {
			this.aClass130_4.aBoolean277 = false;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZZZZZ)V")
	private void method1583(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(1) int local1 = 0;
		if (arg1) {
			this.aClass130_2.anInt4036 = 0;
			local1 += 12;
		}
		if (arg2) {
			this.aClass130_5.anInt4036 = local1;
			local1 += 4;
		}
		if (arg3) {
			this.aClass130_4.anInt4036 = local1;
			local1 += 12;
		}
		if (arg4) {
			this.aClass130_1.anInt4036 = local1;
			local1 += 8;
		}
		if (local1 == 0) {
			return;
		}
		if (Static102.aClass1_Sub14_3.aByteArray34.length < this.anInt1919 * local1) {
			Static102.aClass1_Sub14_3 = new Class1_Sub14((this.anInt1919 + 100) * local1);
		} else {
			Static102.aClass1_Sub14_3.anInt3290 = 0;
		}
		@Pc(60) int local60;
		@Pc(71) int local71;
		@Pc(78) int local78;
		@Pc(85) int local85;
		@Pc(90) int local90;
		@Pc(97) int local97;
		@Pc(99) int local99;
		if (arg1) {
			@Pc(109) int local109;
			if (Static291.aBoolean413) {
				for (local60 = 0; local60 < this.anInt1918; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray174[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray175[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray170[local60]);
					local90 = this.anIntArray173[local60];
					local97 = this.anIntArray173[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray25[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static102.aClass1_Sub14_3.anInt3290 = local109 * local1;
						Static102.aClass1_Sub14_3.method2630(local71);
						Static102.aClass1_Sub14_3.method2630(local78);
						Static102.aClass1_Sub14_3.method2630(local85);
					}
				}
			} else {
				for (local60 = 0; local60 < this.anInt1918; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray174[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray175[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray170[local60]);
					local90 = this.anIntArray173[local60];
					local97 = this.anIntArray173[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray25[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static102.aClass1_Sub14_3.anInt3290 = local109 * local1;
						Static102.aClass1_Sub14_3.method2611(local71);
						Static102.aClass1_Sub14_3.method2611(local78);
						Static102.aClass1_Sub14_3.method2611(local85);
					}
				}
			}
		}
		if (arg2) {
			if (Static302.aBoolean419) {
				for (local60 = 0; local60 < this.anInt1920; local60++) {
					local71 = Static102.method1595(this.aShortArray30[local60], this.aShortArray32[local60], this.aShort10, this.aByteArray17[local60]);
					Static102.aClass1_Sub14_3.anInt3290 = this.aClass130_5.anInt4036 + this.aShortArray23[local60] * local1;
					Static102.aClass1_Sub14_3.method2630(local71);
					Static102.aClass1_Sub14_3.anInt3290 = this.aClass130_5.anInt4036 + this.aShortArray27[local60] * local1;
					Static102.aClass1_Sub14_3.method2630(local71);
					Static102.aClass1_Sub14_3.anInt3290 = this.aClass130_5.anInt4036 + this.aShortArray29[local60] * local1;
					Static102.aClass1_Sub14_3.method2630(local71);
				}
			} else {
				local60 = (int) Static96.aFloatArray13[0];
				local71 = (int) Static96.aFloatArray13[1];
				local78 = (int) Static96.aFloatArray13[2];
				local85 = (int) Math.sqrt((double) (local60 * local60 + local71 * local71 + local78 * local78));
				local90 = (int) ((float) this.aShort10 * 1.3F);
				local97 = this.aShort11 * local85 >> 8;
				for (local99 = 0; local99 < this.anInt1920; local99++) {
					@Pc(270) short local270 = this.aShortArray23[local99];
					@Pc(275) short local275 = this.aShortArray33[local270];
					@Pc(281) int local281;
					if (local275 < 0) {
						local281 = -local275 - 1;
					} else {
						if (local275 == 0) {
							local281 = local90 + (local60 * this.aShortArray34[local270] + local71 * this.aShortArray26[local270] + local78 * this.aShortArray24[local270]) / (local97 + local97 / 2);
						} else {
							local281 = local90 + (local60 * this.aShortArray34[local270] + local71 * this.aShortArray26[local270] + local78 * this.aShortArray24[local270]) / (local97 * local275);
						}
						if (local281 < 0) {
							local281 = 0;
						} else if (local281 > 16384) {
							local281 = 16384;
						}
						this.aShortArray33[local270] = (short) (-local281 - 1);
					}
					@Pc(364) short local364 = this.aShortArray27[local99];
					@Pc(369) short local369 = this.aShortArray33[local364];
					@Pc(375) int local375;
					if (local369 < 0) {
						local375 = -local369 - 1;
					} else {
						if (local369 == 0) {
							local375 = local90 + (local60 * this.aShortArray34[local364] + local71 * this.aShortArray26[local364] + local78 * this.aShortArray24[local364]) / (local97 + local97 / 2);
						} else {
							local375 = local90 + (local60 * this.aShortArray34[local364] + local71 * this.aShortArray26[local364] + local78 * this.aShortArray24[local364]) / (local97 * local369);
						}
						if (local375 < 0) {
							local375 = 0;
						} else if (local375 > 16384) {
							local375 = 16384;
						}
						this.aShortArray33[local364] = (short) (-local375 - 1);
					}
					@Pc(458) short local458 = this.aShortArray29[local99];
					@Pc(463) short local463 = this.aShortArray33[local458];
					@Pc(469) int local469;
					if (local463 < 0) {
						local469 = -local463 - 1;
					} else {
						if (local463 == 0) {
							local469 = local90 + (local60 * this.aShortArray34[local458] + local71 * this.aShortArray26[local458] + local78 * this.aShortArray24[local458]) / (local97 + local97 / 2);
						} else {
							local469 = local90 + (local60 * this.aShortArray34[local458] + local71 * this.aShortArray26[local458] + local78 * this.aShortArray24[local458]) / (local97 * local463);
						}
						if (local469 < 0) {
							local469 = 0;
						} else if (local469 > 16384) {
							local469 = 16384;
						}
						this.aShortArray33[local458] = (short) (-local469 - 1);
					}
					@Pc(562) int local562 = Static102.method1595(this.aShortArray30[local99], this.aShortArray32[local99], local281, this.aByteArray17[local99]);
					@Pc(577) int local577 = Static102.method1595(this.aShortArray30[local99], this.aShortArray32[local99], local375, this.aByteArray17[local99]);
					@Pc(592) int local592 = Static102.method1595(this.aShortArray30[local99], this.aShortArray32[local99], local469, this.aByteArray17[local99]);
					Static102.aClass1_Sub14_3.anInt3290 = this.aClass130_5.anInt4036 + local270 * local1;
					Static102.aClass1_Sub14_3.method2630(local562);
					Static102.aClass1_Sub14_3.anInt3290 = this.aClass130_5.anInt4036 + local364 * local1;
					Static102.aClass1_Sub14_3.method2630(local577);
					Static102.aClass1_Sub14_3.anInt3290 = this.aClass130_5.anInt4036 + local458 * local1;
					Static102.aClass1_Sub14_3.method2630(local592);
				}
				this.aShortArray34 = null;
				this.aShortArray26 = null;
				this.aShortArray24 = null;
			}
		}
		if (arg3) {
			@Pc(723) float local723 = 3.0F / (float) this.aShort11;
			@Pc(734) float local734 = 3.0F / (float) (this.aShort11 + this.aShort11 / 2);
			Static102.aClass1_Sub14_3.anInt3290 = this.aClass130_4.anInt4036;
			@Pc(752) short local752;
			@Pc(790) float local790;
			if (Static291.aBoolean413) {
				for (local78 = 0; local78 < this.anInt1919; local78++) {
					local752 = this.aShortArray33[local78];
					if (local752 == 0) {
						Static102.aClass1_Sub14_3.method2604((float) this.aShortArray34[local78] * local734);
						Static102.aClass1_Sub14_3.method2604((float) this.aShortArray26[local78] * local734);
						Static102.aClass1_Sub14_3.method2604((float) this.aShortArray24[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static102.aClass1_Sub14_3.method2604((float) this.aShortArray34[local78] * local790);
						Static102.aClass1_Sub14_3.method2604((float) this.aShortArray26[local78] * local790);
						Static102.aClass1_Sub14_3.method2604((float) this.aShortArray24[local78] * local790);
					}
					Static102.aClass1_Sub14_3.anInt3290 += local1 - 12;
				}
			} else {
				for (local78 = 0; local78 < this.anInt1919; local78++) {
					local752 = this.aShortArray33[local78];
					if (local752 == 0) {
						Static102.aClass1_Sub14_3.method2594((float) this.aShortArray34[local78] * local734);
						Static102.aClass1_Sub14_3.method2594((float) this.aShortArray26[local78] * local734);
						Static102.aClass1_Sub14_3.method2594((float) this.aShortArray24[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static102.aClass1_Sub14_3.method2594((float) this.aShortArray34[local78] * local790);
						Static102.aClass1_Sub14_3.method2594((float) this.aShortArray26[local78] * local790);
						Static102.aClass1_Sub14_3.method2594((float) this.aShortArray24[local78] * local790);
					}
					Static102.aClass1_Sub14_3.anInt3290 += local1 - 12;
				}
			}
		}
		if (arg4) {
			Static102.aClass1_Sub14_3.anInt3290 = this.aClass130_1.anInt4036;
			if (Static291.aBoolean413) {
				for (local60 = 0; local60 < this.anInt1919; local60++) {
					Static102.aClass1_Sub14_3.method2604(this.aFloatArray16[local60]);
					Static102.aClass1_Sub14_3.method2604(this.aFloatArray17[local60]);
					Static102.aClass1_Sub14_3.anInt3290 += local1 - 8;
				}
			} else {
				for (local60 = 0; local60 < this.anInt1919; local60++) {
					Static102.aClass1_Sub14_3.method2594(this.aFloatArray16[local60]);
					Static102.aClass1_Sub14_3.method2594(this.aFloatArray17[local60]);
					Static102.aClass1_Sub14_3.anInt3290 += local1 - 8;
				}
			}
		}
		Static102.aClass1_Sub14_3.anInt3290 = local1 * this.anInt1919;
		@Pc(1007) ByteBuffer local1007;
		if (arg0) {
			if (Static291.aBoolean411) {
				local1007 = ByteBuffer.wrap(Static102.aClass1_Sub14_3.aByteArray34, 0, Static102.aClass1_Sub14_3.anInt3290);
				if (this.aClass30_3 == null) {
					this.aClass30_3 = new Class30(true);
					this.aClass30_3.method544(local1007);
				} else {
					this.aClass30_3.method542(local1007);
				}
				if (arg1) {
					this.aClass130_2.aBoolean277 = true;
					this.aClass130_2.aByteBuffer15 = null;
					this.aClass130_2.aClass30_7 = this.aClass30_3;
					this.aClass130_2.anInt4037 = local1;
				}
				if (arg2) {
					this.aClass130_5.aBoolean277 = true;
					this.aClass130_5.aByteBuffer15 = null;
					this.aClass130_5.aClass30_7 = this.aClass30_3;
					this.aClass130_5.anInt4037 = local1;
				}
				if (arg3) {
					this.aClass130_4.aBoolean277 = true;
					this.aClass130_4.aByteBuffer15 = null;
					this.aClass130_4.aClass30_7 = this.aClass30_3;
					this.aClass130_4.anInt4037 = local1;
				}
				if (arg4) {
					this.aClass130_1.aBoolean277 = true;
					this.aClass130_1.aByteBuffer15 = null;
					this.aClass130_1.aClass30_7 = this.aClass30_3;
					this.aClass130_1.anInt4037 = local1;
				}
			} else {
				if (Static102.aByteBuffer4 == null || Static102.aByteBuffer4.capacity() < Static102.aClass1_Sub14_3.anInt3290) {
					Static102.aByteBuffer4 = ByteBuffer.allocateDirect(Static102.aClass1_Sub14_3.anInt3290 + local1 * 100);
				} else {
					Static102.aByteBuffer4.clear();
				}
				Static102.aByteBuffer4.put(Static102.aClass1_Sub14_3.aByteArray34, 0, Static102.aClass1_Sub14_3.anInt3290);
				Static102.aByteBuffer4.flip();
				if (arg1) {
					this.aClass130_2.aBoolean277 = true;
					this.aClass130_2.aByteBuffer15 = Static102.aByteBuffer4;
					this.aClass130_2.aClass30_7 = null;
					this.aClass130_2.anInt4037 = local1;
				}
				if (arg2) {
					this.aClass130_5.aBoolean277 = true;
					this.aClass130_5.aByteBuffer15 = Static102.aByteBuffer4;
					this.aClass130_2.aClass30_7 = null;
					this.aClass130_5.anInt4037 = local1;
				}
				if (arg3) {
					this.aClass130_4.aBoolean277 = true;
					this.aClass130_4.aByteBuffer15 = Static102.aByteBuffer4;
					this.aClass130_4.aClass30_7 = null;
					this.aClass130_4.anInt4037 = local1;
				}
				if (arg4) {
					this.aClass130_1.aBoolean277 = true;
					this.aClass130_1.aByteBuffer15 = Static102.aByteBuffer4;
					this.aClass130_1.aClass30_7 = null;
					this.aClass130_1.anInt4037 = local1;
				}
			}
		} else if (Static291.aBoolean405) {
			@Pc(1211) Class30 local1211 = new Class30();
			@Pc(1218) ByteBuffer local1218 = ByteBuffer.wrap(Static102.aClass1_Sub14_3.aByteArray34, 0, Static102.aClass1_Sub14_3.anInt3290);
			local1211.method544(local1218);
			if (arg1) {
				this.aClass130_2.aBoolean277 = true;
				this.aClass130_2.aByteBuffer15 = null;
				this.aClass130_2.aClass30_7 = local1211;
				this.aClass130_2.anInt4037 = local1;
			}
			if (arg2) {
				this.aClass130_5.aBoolean277 = true;
				this.aClass130_5.aByteBuffer15 = null;
				this.aClass130_5.aClass30_7 = local1211;
				this.aClass130_5.anInt4037 = local1;
			}
			if (arg3) {
				this.aClass130_4.aBoolean277 = true;
				this.aClass130_4.aByteBuffer15 = null;
				this.aClass130_4.aClass30_7 = local1211;
				this.aClass130_4.anInt4037 = local1;
			}
			if (arg4) {
				this.aClass130_1.aBoolean277 = true;
				this.aClass130_1.aByteBuffer15 = null;
				this.aClass130_1.aClass30_7 = local1211;
				this.aClass130_1.anInt4037 = local1;
			}
		} else {
			local1007 = ByteBuffer.allocateDirect(Static102.aClass1_Sub14_3.anInt3290);
			local1007.put(Static102.aClass1_Sub14_3.aByteArray34, 0, Static102.aClass1_Sub14_3.anInt3290);
			local1007.flip();
			if (arg1) {
				this.aClass130_2.aBoolean277 = true;
				this.aClass130_2.aByteBuffer15 = local1007;
				this.aClass130_2.aClass30_7 = null;
				this.aClass130_2.anInt4037 = local1;
			}
			if (arg2) {
				this.aClass130_5.aBoolean277 = true;
				this.aClass130_5.aByteBuffer15 = local1007;
				this.aClass130_2.aClass30_7 = null;
				this.aClass130_5.anInt4037 = local1;
			}
			if (arg3) {
				this.aClass130_4.aBoolean277 = true;
				this.aClass130_4.aByteBuffer15 = local1007;
				this.aClass130_4.aClass30_7 = null;
				this.aClass130_4.anInt4037 = local1;
			}
			if (arg4) {
				this.aClass130_1.aBoolean277 = true;
				this.aClass130_1.aByteBuffer15 = local1007;
				this.aClass130_1.aClass30_7 = null;
				this.aClass130_1.anInt4037 = local1;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "()I")
	@Override
	public int method3553() {
		if (!this.aClass27_1.aBoolean39) {
			this.method1602();
		}
		return this.aClass27_1.aShort2;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZZZ)Lclient!hc;")
	@Override
	public Class22_Sub4 method3563(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method1596(arg0, arg1, arg2, Static102.aClass22_Sub4_Sub1_6, Static102.aClass22_Sub4_Sub1_5);
	}

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "()I")
	@Override
	public int method3566() {
		if (!this.aClass27_1.aBoolean39) {
			this.method1602();
		}
		return this.aClass27_1.aShort3;
	}

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "()Z")
	@Override
	protected boolean method3567() {
		if (this.anIntArrayArray11 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt1917; local6++) {
			this.anIntArray174[local6] <<= 0x4;
			this.anIntArray175[local6] <<= 0x4;
			this.anIntArray170[local6] <<= 0x4;
		}
		Static102.anInt1921 = 0;
		Static102.anInt1922 = 0;
		Static102.anInt1923 = 0;
		return true;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!h;IIIZ)V")
	@Override
	public void method4072(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class22_Sub4_Sub1 local2 = (Class22_Sub4_Sub1) arg0;
		if (this.anInt1920 == 0 || local2.anInt1920 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt1918;
		@Pc(15) int[] local15 = local2.anIntArray174;
		@Pc(18) int[] local18 = local2.anIntArray175;
		@Pc(21) int[] local21 = local2.anIntArray170;
		@Pc(24) short[] local24 = local2.aShortArray34;
		@Pc(27) short[] local27 = local2.aShortArray26;
		@Pc(30) short[] local30 = local2.aShortArray24;
		@Pc(33) short[] local33 = local2.aShortArray33;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) short[] local52;
		if (this.aClass77_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass77_1.aShortArray45;
			local44 = this.aClass77_1.aShortArray46;
			local48 = this.aClass77_1.aShortArray43;
			local52 = this.aClass77_1.aShortArray44;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) short[] local80;
		if (local2.aClass77_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass77_1.aShortArray45;
			local72 = local2.aClass77_1.aShortArray46;
			local76 = local2.aClass77_1.aShortArray43;
			local80 = local2.aClass77_1.aShortArray44;
		}
		@Pc(92) int[] local92 = local2.anIntArray173;
		@Pc(95) short[] local95 = local2.aShortArray25;
		if (!local2.aClass27_1.aBoolean39) {
			local2.method1602();
		}
		@Pc(105) short local105 = local2.aClass27_1.aShort8;
		@Pc(109) short local109 = local2.aClass27_1.aShort4;
		@Pc(113) short local113 = local2.aClass27_1.aShort2;
		@Pc(117) short local117 = local2.aClass27_1.aShort6;
		@Pc(121) short local121 = local2.aClass27_1.aShort3;
		@Pc(125) short local125 = local2.aClass27_1.aShort5;
		for (@Pc(127) int local127 = 0; local127 < this.anInt1918; local127++) {
			@Pc(138) int local138 = this.anIntArray175[local127] - arg2;
			if (local138 >= local105 && local138 <= local109) {
				@Pc(152) int local152 = this.anIntArray174[local127] - arg1;
				if (local152 >= local113 && local152 <= local117) {
					@Pc(166) int local166 = this.anIntArray170[local127] - arg3;
					if (local166 >= local121 && local166 <= local125) {
						@Pc(175) int local175 = -1;
						@Pc(180) int local180 = this.anIntArray173[local127];
						@Pc(187) int local187 = this.anIntArray173[local127 + 1];
						@Pc(189) int local189;
						for (local189 = local180; local189 < local187; local189++) {
							local175 = this.aShortArray25[local189] - 1;
							if (local175 == -1 || this.aShortArray33[local175] != 0) {
								break;
							}
						}
						if (local175 != -1) {
							for (local189 = 0; local189 < local12; local189++) {
								if (local152 == local15[local189] && local166 == local21[local189] && local138 == local18[local189]) {
									@Pc(237) int local237 = -1;
									local180 = local92[local189];
									local187 = local92[local189 + 1];
									for (@Pc(249) int local249 = local180; local249 < local187; local249++) {
										local237 = local95[local249] - 1;
										if (local237 == -1 || local33[local237] != 0) {
											break;
										}
									}
									if (local237 != -1) {
										if (local40 == null) {
											this.aClass77_1 = new Class77();
											local40 = this.aClass77_1.aShortArray45 = Static113.method1812(this.aShortArray34);
											local44 = this.aClass77_1.aShortArray46 = Static113.method1812(this.aShortArray26);
											local48 = this.aClass77_1.aShortArray43 = Static113.method1812(this.aShortArray24);
											local52 = this.aClass77_1.aShortArray44 = Static113.method1812(this.aShortArray33);
										}
										if (local68 == null) {
											@Pc(325) Class77 local325 = local2.aClass77_1 = new Class77();
											local68 = local325.aShortArray45 = Static113.method1812(local24);
											local72 = local325.aShortArray46 = Static113.method1812(local27);
											local76 = local325.aShortArray43 = Static113.method1812(local30);
											local80 = local325.aShortArray44 = Static113.method1812(local33);
										}
										@Pc(358) short local358 = this.aShortArray34[local175];
										@Pc(363) short local363 = this.aShortArray26[local175];
										@Pc(368) short local368 = this.aShortArray24[local175];
										@Pc(373) short local373 = this.aShortArray33[local175];
										local180 = local92[local189];
										local187 = local92[local189 + 1];
										@Pc(385) int local385;
										@Pc(394) int local394;
										for (local385 = local180; local385 < local187; local385++) {
											local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										local358 = local24[local237];
										local363 = local27[local237];
										local368 = local30[local237];
										local373 = local33[local237];
										local180 = this.anIntArray173[local127];
										local187 = this.anIntArray173[local127 + 1];
										for (local385 = local180; local385 < local187; local385++) {
											local394 = this.aShortArray25[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
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

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILclient!hi;[[I[[IIII)V")
	public void method1585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22_Sub4_Sub1 arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!arg2.aClass27_1.aBoolean39) {
			arg2.method1602();
		}
		@Pc(11) int local11 = arg5 + arg2.aClass27_1.aShort2;
		@Pc(17) int local17 = arg5 + arg2.aClass27_1.aShort6;
		@Pc(23) int local23 = arg7 + arg2.aClass27_1.aShort3;
		@Pc(29) int local29 = arg7 + arg2.aClass27_1.aShort5;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local11 < 0 || local17 + 128 >> 7 >= arg3.length || local23 < 0 || local29 + 128 >> 7 >= arg3[0].length)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg4 == null) {
				return;
			}
			if (local11 < 0 || local17 + 128 >> 7 >= arg4.length || local23 < 0 || local29 + 128 >> 7 >= arg4[0].length) {
				return;
			}
		} else {
			local11 >>= 0x7;
			local17 = local17 + 127 >> 7;
			local23 >>= 0x7;
			local29 = local29 + 127 >> 7;
			if (arg3[local11][local23] == arg6 && arg3[local17][local23] == arg6 && arg3[local11][local29] == arg6 && arg3[local17][local29] == arg6) {
				return;
			}
		}
		@Pc(150) int local150;
		@Pc(161) int local161;
		@Pc(168) int local168;
		@Pc(172) int local172;
		@Pc(176) int local176;
		@Pc(180) int local180;
		@Pc(184) int local184;
		@Pc(206) int local206;
		@Pc(232) int local232;
		@Pc(244) int local244;
		if (arg0 == 1) {
			for (local150 = 0; local150 < this.anInt1918; local150++) {
				local161 = this.anIntArray174[local150] + arg5;
				local168 = this.anIntArray170[local150] + arg7;
				local172 = local161 & 0x7F;
				local176 = local168 & 0x7F;
				local180 = local161 >> 7;
				local184 = local168 >> 7;
				local206 = arg3[local180][local184] * (128 - local172) + arg3[local180 + 1][local184] * local172 >> 7;
				local232 = arg3[local180][local184 + 1] * (128 - local172) + arg3[local180 + 1][local184 + 1] * local172 >> 7;
				local244 = local206 * (128 - local176) + local232 * local176 >> 7;
				this.anIntArray175[local150] = this.anIntArray175[local150] + local244 - arg6;
			}
		} else {
			@Pc(362) int local362;
			@Pc(374) int local374;
			if (arg0 == 2) {
				@Pc(266) short local266 = arg2.aClass27_1.aShort8;
				for (local161 = 0; local161 < this.anInt1918; local161++) {
					local168 = (this.anIntArray175[local161] << 16) / local266;
					if (local168 < arg1) {
						local172 = this.anIntArray174[local161] + arg5;
						local176 = this.anIntArray170[local161] + arg7;
						local180 = local172 & 0x7F;
						local184 = local176 & 0x7F;
						local206 = local172 >> 7;
						local232 = local176 >> 7;
						local244 = arg3[local206][local232] * (128 - local180) + arg3[local206 + 1][local232] * local180 >> 7;
						local362 = arg3[local206][local232 + 1] * (128 - local180) + arg3[local206 + 1][local232 + 1] * local180 >> 7;
						local374 = local244 * (128 - local184) + local362 * local184 >> 7;
						this.anIntArray175[local161] += (local374 - arg6) * (arg1 - local168) / arg1;
					}
				}
			} else if (arg0 == 3) {
				local150 = (arg1 & 0xFF) * 4;
				local161 = (arg1 >> 8 & 0xFF) * 4;
				this.method3551(arg3, arg5, arg6, arg7, local150, local161);
			} else if (arg0 == 4) {
				local150 = arg2.aClass27_1.aShort4 - arg2.aClass27_1.aShort8;
				for (local161 = 0; local161 < this.anInt1918; local161++) {
					local168 = this.anIntArray174[local161] + arg5;
					local172 = this.anIntArray170[local161] + arg7;
					local176 = local168 & 0x7F;
					local180 = local172 & 0x7F;
					local184 = local168 >> 7;
					local206 = local172 >> 7;
					local232 = arg4[local184][local206] * (128 - local176) + arg4[local184 + 1][local206] * local176 >> 7;
					local244 = arg4[local184][local206 + 1] * (128 - local176) + arg4[local184 + 1][local206 + 1] * local176 >> 7;
					local362 = local232 * (128 - local180) + local244 * local180 >> 7;
					this.anIntArray175[local161] = this.anIntArray175[local161] + local362 + local150 - arg6;
				}
			} else if (arg0 == 5) {
				local150 = arg2.aClass27_1.aShort4 - arg2.aClass27_1.aShort8;
				for (local161 = 0; local161 < this.anInt1918; local161++) {
					local168 = this.anIntArray174[local161] + arg5;
					local172 = this.anIntArray170[local161] + arg7;
					local176 = local168 & 0x7F;
					local180 = local172 & 0x7F;
					local184 = local168 >> 7;
					local206 = local172 >> 7;
					local232 = arg3[local184][local206] * (128 - local176) + arg3[local184 + 1][local206] * local176 >> 7;
					local244 = arg3[local184][local206 + 1] * (128 - local176) + arg3[local184 + 1][local206 + 1] * local176 >> 7;
					local362 = local232 * (128 - local180) + local244 * local180 >> 7;
					local232 = arg4[local184][local206] * (128 - local176) + arg4[local184 + 1][local206] * local176 >> 7;
					local244 = arg4[local184][local206 + 1] * (128 - local176) + arg4[local184 + 1][local206 + 1] * local176 >> 7;
					local374 = local232 * (128 - local180) + local244 * local180 >> 7;
					@Pc(716) int local716 = local362 - local374;
					this.anIntArray175[local161] = ((this.anIntArray175[local161] << 8) / local150 * local716 >> 8) - (arg6 - local362);
				}
			}
		}
		this.aClass130_2.aBoolean277 = false;
		this.aClass27_1.aBoolean39 = false;
	}

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "()V")
	public void method1586() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt1917; local1++) {
			this.anIntArray170[local1] = -this.anIntArray170[local1];
		}
		if (this.aShortArray24 != null) {
			for (local1 = 0; local1 < this.anInt1919; local1++) {
				this.aShortArray24[local1] = (short) -this.aShortArray24[local1];
			}
		}
		for (local1 = 0; local1 < this.anInt1920; local1++) {
			@Pc(48) short local48 = this.aShortArray23[local1];
			this.aShortArray23[local1] = this.aShortArray29[local1];
			this.aShortArray29[local1] = local48;
		}
		this.aClass27_1.aBoolean39 = false;
		this.aClass130_2.aBoolean277 = false;
		if (this.aClass130_4 != null) {
			this.aClass130_4.aBoolean277 = false;
		}
		this.aClass130_3.aBoolean277 = false;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "()I")
	@Override
	public int method4071() {
		if (!this.aClass27_1.aBoolean39) {
			this.method1602();
		}
		return this.aClass27_1.aShort8;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!wi;)Lclient!wi;")
	public Class103_Sub2 method1587(@OriginalArg(0) Class103_Sub2 arg0) {
		if (this.anInt1919 == 0) {
			return null;
		}
		if (!this.aClass27_1.aBoolean39) {
			this.method1602();
		}
		@Pc(26) int local26;
		@Pc(40) int local40;
		if (Static96.anInt1797 > 0) {
			local26 = this.aClass27_1.aShort2 - (this.aClass27_1.aShort4 * Static96.anInt1797 >> 8) >> 3;
			local40 = this.aClass27_1.aShort6 - (this.aClass27_1.aShort8 * Static96.anInt1797 >> 8) >> 3;
		} else {
			local26 = this.aClass27_1.aShort2 - (this.aClass27_1.aShort8 * Static96.anInt1797 >> 8) >> 3;
			local40 = this.aClass27_1.aShort6 - (this.aClass27_1.aShort4 * Static96.anInt1797 >> 8) >> 3;
		}
		@Pc(85) int local85;
		@Pc(99) int local99;
		if (Static96.anInt1800 > 0) {
			local85 = this.aClass27_1.aShort3 - (this.aClass27_1.aShort4 * Static96.anInt1800 >> 8) >> 3;
			local99 = this.aClass27_1.aShort5 - (this.aClass27_1.aShort8 * Static96.anInt1800 >> 8) >> 3;
		} else {
			local85 = this.aClass27_1.aShort3 - (this.aClass27_1.aShort8 * Static96.anInt1800 >> 8) >> 3;
			local99 = this.aClass27_1.aShort5 - (this.aClass27_1.aShort4 * Static96.anInt1800 >> 8) >> 3;
		}
		@Pc(134) int local134 = local40 + 1 - local26;
		@Pc(140) int local140 = local99 + 1 - local85;
		@Pc(151) Class103_Sub2 local151;
		if (arg0 == null || arg0.aByteArray74.length < local134 * local140) {
			local151 = new Class103_Sub2(local134, local140, 0);
		} else {
			local151 = arg0;
			arg0.anInt5860 = arg0.anInt5857 = local134;
			arg0.anInt5856 = arg0.anInt5858 = local140;
			arg0.method4609();
		}
		local151.anInt5851 = local26;
		local151.anInt5854 = local85;
		if (Static102.anIntArray177.length < this.anInt1919) {
			Static102.anIntArray177 = new int[this.anInt1919];
			Static102.anIntArray176 = new int[this.anInt1919];
		}
		@Pc(194) int local194;
		@Pc(246) int local246;
		@Pc(248) int local248;
		@Pc(258) int local258;
		for (local194 = 0; local194 < this.anInt1918; local194++) {
			@Pc(216) int local216 = (this.anIntArray174[local194] - (this.anIntArray175[local194] * Static96.anInt1797 >> 8) >> 3) - local26;
			@Pc(234) int local234 = (this.anIntArray170[local194] - (this.anIntArray175[local194] * Static96.anInt1800 >> 8) >> 3) - local85;
			@Pc(239) int local239 = this.anIntArray173[local194];
			local246 = this.anIntArray173[local194 + 1];
			for (local248 = local239; local248 < local246; local248++) {
				local258 = this.aShortArray25[local248] - 1;
				if (local258 == -1) {
					break;
				}
				Static102.anIntArray177[local258] = local216;
				Static102.anIntArray176[local258] = local234;
			}
		}
		for (local194 = 0; local194 < this.anInt1920; local194++) {
			if (this.aByteArray17[local194] <= 128) {
				@Pc(292) short local292 = this.aShortArray23[local194];
				@Pc(297) short local297 = this.aShortArray27[local194];
				@Pc(302) short local302 = this.aShortArray29[local194];
				local246 = Static102.anIntArray177[local292];
				local248 = Static102.anIntArray177[local297];
				local258 = Static102.anIntArray177[local302];
				@Pc(318) int local318 = Static102.anIntArray176[local292];
				@Pc(322) int local322 = Static102.anIntArray176[local297];
				@Pc(326) int local326 = Static102.anIntArray176[local302];
				if ((local246 - local248) * (local322 - local326) - (local322 - local318) * (local258 - local248) > 0) {
					Static18.method306(local151.aByteArray74, local318, local322, local326, local246, local248, local258, local134);
				}
			}
		}
		return local151;
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V")
	@Override
	public void method3576(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class17.anIntArray22[arg0];
		@Pc(7) int local7 = Class17.anIntArray24[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1917; local9++) {
			@Pc(29) int local29 = this.anIntArray175[local9] * local3 + this.anIntArray174[local9] * local7 >> 16;
			this.anIntArray175[local9] = this.anIntArray175[local9] * local7 - this.anIntArray174[local9] * local3 >> 16;
			this.anIntArray174[local9] = local29;
		}
		this.aClass27_1.aBoolean39 = false;
		this.aClass130_2.aBoolean277 = false;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method3570(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(45) int local45;
		@Pc(53) int local53;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			Static102.anInt1921 = 0;
			Static102.anInt1922 = 0;
			Static102.anInt1923 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray11.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray11[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						Static102.anInt1921 += this.anIntArray174[local53];
						Static102.anInt1922 += this.anIntArray175[local53];
						Static102.anInt1923 += this.anIntArray170[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				Static102.anInt1921 = Static102.anInt1921 / local18 + local8;
				Static102.anInt1922 = Static102.anInt1922 / local18 + local12;
				Static102.anInt1923 = Static102.anInt1923 / local18 + local16;
			} else {
				Static102.anInt1921 = local8;
				Static102.anInt1922 = local12;
				Static102.anInt1923 = local16;
			}
			return;
		}
		@Pc(141) int[] local141;
		@Pc(143) int local143;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local141 = this.anIntArrayArray11[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray174[local45] += local8;
						this.anIntArray175[local45] += local12;
						this.anIntArray170[local45] += local16;
					}
				}
			}
			return;
		}
		@Pc(246) int local246;
		@Pc(264) int local264;
		@Pc(484) int local484;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local141 = this.anIntArrayArray11[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray174[local45] -= Static102.anInt1921;
						this.anIntArray175[local45] -= Static102.anInt1922;
						this.anIntArray170[local45] -= Static102.anInt1923;
						if (arg4 != 0) {
							local53 = Class17.anIntArray22[arg4];
							local246 = Class17.anIntArray24[arg4];
							local264 = this.anIntArray175[local45] * local53 + this.anIntArray174[local45] * local246 + 32767 >> 16;
							this.anIntArray175[local45] = this.anIntArray175[local45] * local246 + 32767 - this.anIntArray174[local45] * local53 >> 16;
							this.anIntArray174[local45] = local264;
						}
						if (arg2 != 0) {
							local53 = Class17.anIntArray22[arg2];
							local246 = Class17.anIntArray24[arg2];
							local264 = this.anIntArray175[local45] * local246 + 32767 - this.anIntArray170[local45] * local53 >> 16;
							this.anIntArray170[local45] = this.anIntArray175[local45] * local53 + this.anIntArray170[local45] * local246 + 32767 >> 16;
							this.anIntArray175[local45] = local264;
						}
						if (arg3 != 0) {
							local53 = Class17.anIntArray22[arg3];
							local246 = Class17.anIntArray24[arg3];
							local264 = this.anIntArray170[local45] * local53 + this.anIntArray174[local45] * local246 + 32767 >> 16;
							this.anIntArray170[local45] = this.anIntArray170[local45] * local246 + 32767 - this.anIntArray174[local45] * local53 >> 16;
							this.anIntArray174[local45] = local264;
						}
						this.anIntArray174[local45] += Static102.anInt1921;
						this.anIntArray175[local45] += Static102.anInt1922;
						this.anIntArray170[local45] += Static102.anInt1923;
					}
				}
			}
			if (arg5 && this.aShortArray34 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray11.length) {
						local141 = this.anIntArrayArray11[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray173[local45];
							local246 = this.anIntArray173[local45 + 1];
							for (local264 = local53; local264 < local246; local264++) {
								local484 = this.aShortArray25[local264] - 1;
								if (local484 == -1) {
									break;
								}
								@Pc(494) int local494;
								@Pc(498) int local498;
								@Pc(516) int local516;
								if (arg4 != 0) {
									local494 = Class17.anIntArray22[arg4];
									local498 = Class17.anIntArray24[arg4];
									local516 = this.aShortArray26[local484] * local494 + this.aShortArray34[local484] * local498 + 32767 >> 16;
									this.aShortArray26[local484] = (short) (this.aShortArray26[local484] * local498 + 32767 - this.aShortArray34[local484] * local494 >> 16);
									this.aShortArray34[local484] = (short) local516;
								}
								if (arg2 != 0) {
									local494 = Class17.anIntArray22[arg2];
									local498 = Class17.anIntArray24[arg2];
									local516 = this.aShortArray26[local484] * local498 + 32767 - this.aShortArray24[local484] * local494 >> 16;
									this.aShortArray24[local484] = (short) (this.aShortArray26[local484] * local494 + this.aShortArray24[local484] * local498 + 32767 >> 16);
									this.aShortArray26[local484] = (short) local516;
								}
								if (arg3 != 0) {
									local494 = Class17.anIntArray22[arg3];
									local498 = Class17.anIntArray24[arg3];
									local516 = this.aShortArray24[local484] * local494 + this.aShortArray34[local484] * local498 + 32767 >> 16;
									this.aShortArray24[local484] = (short) (this.aShortArray24[local484] * local498 + 32767 - this.aShortArray34[local484] * local494 >> 16);
									this.aShortArray34[local484] = (short) local516;
								}
							}
						}
					}
				}
				if (this.aClass130_4 != null) {
					this.aClass130_4.aBoolean277 = false;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local141 = this.anIntArrayArray11[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray174[local45] -= Static102.anInt1921;
						this.anIntArray175[local45] -= Static102.anInt1922;
						this.anIntArray170[local45] -= Static102.anInt1923;
						this.anIntArray174[local45] = this.anIntArray174[local45] * arg2 >> 7;
						this.anIntArray175[local45] = this.anIntArray175[local45] * arg3 >> 7;
						this.anIntArray170[local45] = this.anIntArray170[local45] * arg4 >> 7;
						this.anIntArray174[local45] += Static102.anInt1921;
						this.anIntArray175[local45] += Static102.anInt1922;
						this.anIntArray170[local45] += Static102.anInt1923;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray12 != null && this.aByteArray17 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray12.length) {
						local141 = this.anIntArrayArray12[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = (this.aByteArray17[local45] & 0xFF) + arg2 * 8;
							if (local53 < 0) {
								local53 = 0;
							} else if (local53 > 255) {
								local53 = 255;
							}
							this.aByteArray17[local45] = (byte) local53;
						}
						if (local141.length > 0) {
							this.aClass130_5.aBoolean277 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray12 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray12.length) {
					local141 = this.anIntArrayArray12[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						local53 = this.aShortArray30[local45] & 0xFFFF;
						local246 = local53 >> 10 & 0x3F;
						local264 = local53 >> 7 & 0x7;
						local484 = local53 & 0x7F;
						@Pc(932) int local932 = local246 + arg2 & 0x3F;
						local264 += arg3 / 4;
						if (local264 < 0) {
							local264 = 0;
						} else if (local264 > 7) {
							local264 = 7;
						}
						local484 += arg4;
						if (local484 < 0) {
							local484 = 0;
						} else if (local484 > 127) {
							local484 = 127;
						}
						this.aShortArray30[local45] = (short) (local932 << 10 | local264 << 7 | local484);
					}
					if (local141.length > 0) {
						this.aClass130_5.aBoolean277 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZZZZZZZZZZZ)Lclient!hi;")
	public Class22_Sub4_Sub1 method1588(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) boolean arg8) {
		@Pc(3) Class22_Sub4_Sub1 local3 = new Class22_Sub4_Sub1();
		local3.anInt1917 = this.anInt1917;
		local3.anInt1918 = this.anInt1918;
		local3.anInt1919 = this.anInt1919;
		local3.anInt1920 = this.anInt1920;
		if (arg0) {
			local3.anIntArray174 = this.anIntArray174;
			local3.anIntArray170 = this.anIntArray170;
		} else {
			local3.anIntArray174 = Static162.method2752(this.anIntArray174);
			local3.anIntArray170 = Static162.method2752(this.anIntArray170);
		}
		if (arg1) {
			local3.anIntArray175 = this.anIntArray175;
		} else {
			local3.anIntArray175 = Static162.method2752(this.anIntArray175);
		}
		if (arg0 && arg1) {
			local3.aClass130_2 = this.aClass130_2;
			local3.aClass27_1 = this.aClass27_1;
		} else {
			local3.aClass130_2 = new Class130();
			local3.aClass27_1 = new Class27();
		}
		if (arg2) {
			local3.aShortArray30 = this.aShortArray30;
		} else {
			local3.aShortArray30 = Static113.method1812(this.aShortArray30);
		}
		local3.aByteArray17 = this.aByteArray17;
		if (arg2 && arg3 && (arg6 && arg4 || Static302.aBoolean419)) {
			local3.aClass130_5 = this.aClass130_5;
		} else {
			local3.aClass130_5 = new Class130();
		}
		if (arg4) {
			local3.aShortArray34 = this.aShortArray34;
			local3.aShortArray26 = this.aShortArray26;
			local3.aShortArray24 = this.aShortArray24;
			local3.aShortArray33 = this.aShortArray33;
		} else {
			local3.aShortArray34 = Static113.method1812(this.aShortArray34);
			local3.aShortArray26 = Static113.method1812(this.aShortArray26);
			local3.aShortArray24 = Static113.method1812(this.aShortArray24);
			local3.aShortArray33 = Static113.method1812(this.aShortArray33);
		}
		if (!Static302.aBoolean419) {
			local3.aClass130_4 = null;
		} else if (arg4 && arg5 && arg6) {
			local3.aClass130_4 = this.aClass130_4;
		} else {
			local3.aClass130_4 = new Class130();
		}
		local3.aFloatArray16 = this.aFloatArray16;
		local3.aFloatArray17 = this.aFloatArray17;
		local3.aClass130_1 = this.aClass130_1;
		if (arg7) {
			local3.aShortArray23 = this.aShortArray23;
			local3.aShortArray27 = this.aShortArray27;
			local3.aShortArray29 = this.aShortArray29;
			local3.aClass130_3 = this.aClass130_3;
		} else {
			local3.aShortArray23 = Static113.method1812(this.aShortArray23);
			local3.aShortArray27 = Static113.method1812(this.aShortArray27);
			local3.aShortArray29 = Static113.method1812(this.aShortArray29);
			local3.aClass130_3 = new Class130();
		}
		if (arg8) {
			local3.aShortArray32 = this.aShortArray32;
		} else {
			local3.aShortArray32 = Static113.method1812(this.aShortArray32);
		}
		local3.anIntArray172 = this.anIntArray172;
		local3.anIntArrayArray11 = this.anIntArrayArray11;
		local3.aByteArray18 = this.aByteArray18;
		local3.anIntArrayArray12 = this.anIntArrayArray12;
		local3.anIntArray171 = this.anIntArray171;
		local3.aShortArray25 = this.aShortArray25;
		local3.anIntArray173 = this.anIntArray173;
		local3.aShort10 = this.aShort10;
		local3.aShort11 = this.aShort11;
		local3.aClass49Array1 = this.aClass49Array1;
		local3.aClass15Array1 = this.aClass15Array1;
		local3.aShortArray31 = this.aShortArray31;
		local3.aShortArray28 = this.aShortArray28;
		return local3;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "()V")
	@Override
	protected void method3557() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1917; local1++) {
			this.anIntArray174[local1] = this.anIntArray174[local1] + 7 >> 4;
			this.anIntArray175[local1] = this.anIntArray175[local1] + 7 >> 4;
			this.anIntArray170[local1] = this.anIntArray170[local1] + 7 >> 4;
		}
		this.aClass27_1.aBoolean39 = false;
		this.aClass130_2.aBoolean277 = false;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!tk;IJIIIIFF)S")
	private short method1590(@OriginalArg(0) Class22_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray173[arg1];
		@Pc(11) int local11 = this.anIntArray173[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			@Pc(23) short local23 = this.aShortArray25[local15];
			if (local23 == 0) {
				local13 = local15;
				break;
			}
			if (Static102.aLongArray44[local15] == arg2) {
				return (short) (local23 - 1);
			}
		}
		this.aShortArray25[local13] = (short) (this.anInt1919 + 1);
		Static102.aLongArray44[local13] = arg2;
		this.aShortArray34[this.anInt1919] = (short) arg3;
		this.aShortArray26[this.anInt1919] = (short) arg4;
		this.aShortArray24[this.anInt1919] = (short) arg5;
		this.aShortArray33[this.anInt1919] = (short) arg6;
		this.aFloatArray16[this.anInt1919] = arg7;
		this.aFloatArray17[this.anInt1919] = arg8;
		return (short) this.anInt1919++;
	}

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "()I")
	@Override
	public int method3574() {
		if (!this.aClass27_1.aBoolean39) {
			this.method1602();
		}
		return this.aClass27_1.aShort5;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZZZZZZZ)V")
	public void method1592(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (this.aByte6 != 0) {
			throw new IllegalArgumentException();
		} else if (this.anInt1919 != 0) {
			if (arg5) {
				@Pc(26) boolean local26 = !this.aClass130_5.aBoolean277 && (arg1 || arg2 && !Static302.aBoolean419);
				this.method1583(false, !this.aClass130_2.aBoolean277 && arg0, local26, this.aClass130_4 != null && !this.aClass130_4.aBoolean277 && arg2, !this.aClass130_1.aBoolean277);
				if (!this.aClass130_3.aBoolean277 && arg3 && arg1) {
					this.method1576();
				}
			}
			if (arg0) {
				if (this.aClass130_2.aBoolean277) {
					if (!this.aClass27_1.aBoolean39) {
						this.method1602();
					}
					this.anIntArray174 = null;
					this.anIntArray175 = null;
					this.anIntArray170 = null;
					this.aShortArray25 = null;
					this.anIntArray173 = null;
				} else {
					this.aByte5 = (byte) (this.aByte5 | 0x1);
				}
			}
			if (arg1) {
				if (this.aClass130_5.aBoolean277) {
					this.aShortArray30 = null;
					this.aByteArray17 = null;
				} else {
					this.aByte5 = (byte) (this.aByte5 | 0x2);
				}
			}
			if (arg2 && Static302.aBoolean419) {
				if (this.aClass130_4.aBoolean277) {
					this.aShortArray34 = null;
					this.aShortArray26 = null;
					this.aShortArray24 = null;
					this.aShortArray33 = null;
				} else {
					this.aByte5 = (byte) (this.aByte5 | 0x4);
				}
			}
			if (this.aClass130_1.aBoolean277) {
				this.aFloatArray16 = null;
				this.aFloatArray17 = null;
			} else {
				this.aByte5 = (byte) (this.aByte5 | 0x8);
			}
			if (arg3 && arg1) {
				if (this.aClass130_3.aBoolean277 && this.aClass130_5.aBoolean277) {
					this.aShortArray23 = null;
					this.aShortArray27 = null;
					this.aShortArray29 = null;
				} else {
					this.aByte5 = (byte) (this.aByte5 | 0x10);
				}
			}
			if (arg4) {
				this.anIntArray172 = null;
				this.aByteArray18 = null;
				this.anIntArrayArray11 = null;
				this.anIntArrayArray12 = null;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "()I")
	public int method1593() {
		return this.aShort10;
	}

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "()I")
	@Override
	public int method3572() {
		if (!this.aClass27_1.aBoolean39) {
			this.method1602();
		}
		return this.aClass27_1.aShort7;
	}

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "()V")
	private void method1594() {
		@Pc(1) GL local1 = Static291.aGL1;
		if (this.anInt1920 == 0) {
			return;
		}
		if (this.aByte6 != 0) {
			this.method1583(true, !this.aClass130_2.aBoolean277 && (this.aByte6 & 0x1) != 0, !this.aClass130_5.aBoolean277 && (this.aByte6 & 0x2) != 0, this.aClass130_4 != null && !this.aClass130_4.aBoolean277 && (this.aByte6 & 0x4) != 0, false);
		}
		this.method1583(false, !this.aClass130_2.aBoolean277, !this.aClass130_5.aBoolean277, this.aClass130_4 != null && !this.aClass130_4.aBoolean277, !this.aClass130_1.aBoolean277);
		if (!this.aClass130_3.aBoolean277) {
			this.method1576();
		}
		if (this.aByte5 != 0) {
			if ((this.aByte5 & 0x1) != 0) {
				this.anIntArray174 = null;
				this.anIntArray175 = null;
				this.anIntArray170 = null;
				this.aShortArray25 = null;
				this.anIntArray173 = null;
			}
			if ((this.aByte5 & 0x2) != 0) {
				this.aShortArray30 = null;
				this.aByteArray17 = null;
			}
			if ((this.aByte5 & 0x4) != 0) {
				this.aShortArray34 = null;
				this.aShortArray26 = null;
				this.aShortArray24 = null;
				this.aShortArray33 = null;
			}
			if ((this.aByte5 & 0x8) != 0) {
				this.aFloatArray16 = null;
				this.aFloatArray17 = null;
			}
			if ((this.aByte5 & 0x10) != 0) {
				this.aShortArray23 = null;
				this.aShortArray27 = null;
				this.aShortArray29 = null;
			}
			this.aByte5 = 0;
		}
		@Pc(172) Class30 local172 = null;
		if (this.aClass130_2.aClass30_7 != null) {
			this.aClass130_2.aClass30_7.method541();
			local172 = this.aClass130_2.aClass30_7;
			local1.glVertexPointer(3, 5126, this.aClass130_2.anInt4037, (long) this.aClass130_2.anInt4036);
		}
		if (this.aClass130_5.aClass30_7 != null) {
			if (local172 != this.aClass130_5.aClass30_7) {
				this.aClass130_5.aClass30_7.method541();
				local172 = this.aClass130_5.aClass30_7;
			}
			local1.glColorPointer(4, 5121, this.aClass130_5.anInt4037, (long) this.aClass130_5.anInt4036);
		}
		if (Static302.aBoolean419 && this.aClass130_4.aClass30_7 != null) {
			if (local172 != this.aClass130_4.aClass30_7) {
				this.aClass130_4.aClass30_7.method541();
				local172 = this.aClass130_4.aClass30_7;
			}
			local1.glNormalPointer(5126, this.aClass130_4.anInt4037, (long) this.aClass130_4.anInt4036);
		}
		if (this.aClass130_1.aClass30_7 != null) {
			if (local172 != this.aClass130_1.aClass30_7) {
				this.aClass130_1.aClass30_7.method541();
				local172 = this.aClass130_1.aClass30_7;
			}
			local1.glTexCoordPointer(2, 5126, this.aClass130_1.anInt4037, (long) this.aClass130_1.anInt4036);
		}
		if (this.aClass130_3.aClass30_7 != null) {
			this.aClass130_3.aClass30_7.method543();
		}
		if (this.aClass130_2.aClass30_7 == null || this.aClass130_5.aClass30_7 == null || Static302.aBoolean419 && this.aClass130_4.aClass30_7 == null || this.aClass130_1.aClass30_7 == null) {
			if (Static291.aBoolean405) {
				local1.glBindBufferARB(34962, 0);
			}
			if (this.aClass130_2.aClass30_7 == null) {
				this.aClass130_2.aByteBuffer15.position(this.aClass130_2.anInt4036);
				local1.glVertexPointer(3, 5126, this.aClass130_2.anInt4037, this.aClass130_2.aByteBuffer15);
			}
			if (this.aClass130_5.aClass30_7 == null) {
				this.aClass130_5.aByteBuffer15.position(this.aClass130_5.anInt4036);
				local1.glColorPointer(4, 5121, this.aClass130_5.anInt4037, this.aClass130_5.aByteBuffer15);
			}
			if (Static302.aBoolean419 && this.aClass130_4.aClass30_7 == null) {
				this.aClass130_4.aByteBuffer15.position(this.aClass130_4.anInt4036);
				local1.glNormalPointer(5126, this.aClass130_4.anInt4037, this.aClass130_4.aByteBuffer15);
			}
			if (this.aClass130_1.aClass30_7 == null) {
				this.aClass130_1.aByteBuffer15.position(this.aClass130_1.anInt4036);
				local1.glTexCoordPointer(2, 5126, this.aClass130_1.anInt4037, this.aClass130_1.aByteBuffer15);
			}
		}
		if (this.aClass130_3.aClass30_7 == null && Static291.aBoolean405) {
			local1.glBindBufferARB(34963, 0);
		}
		@Pc(417) int local417 = this.anIntArray171.length - 1;
		for (@Pc(419) int local419 = 0; local419 < local417; local419++) {
			@Pc(427) int local427 = this.anIntArray171[local419];
			@Pc(434) int local434 = this.anIntArray171[local419 + 1];
			@Pc(439) short local439 = this.aShortArray32[local427];
			if (local439 == -1) {
				Static291.method4310(-1);
				Static207.method3280(0, 0);
			} else {
				Static18.anInterface1_1.method1630(local439 & 0xFFFF);
			}
			if (this.aClass130_3.aClass30_7 == null) {
				this.aClass130_3.aByteBuffer15.position(local427 * 12);
				local1.glDrawElements(4, (local434 - local427) * 3, 5125, this.aClass130_3.aByteBuffer15);
			} else {
				local1.glDrawElements(4, (local434 - local427) * 3, 5125, (long) (local427 * 12));
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method3571(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		if (this.anInt1919 == 0) {
			return;
		}
		@Pc(5) GL local5 = Static291.aGL1;
		local5.glPushMatrix();
		if (arg2 != 0) {
			local5.glRotatef((float) arg2 * 0.17578125F, 1.0F, 0.0F, 0.0F);
		}
		local5.glTranslatef((float) arg3, (float) arg4, (float) arg5);
		if (arg0 != 0) {
			local5.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
		}
		if (arg1 != 0) {
			local5.glRotatef((float) -arg1 * 0.17578125F, 0.0F, 0.0F, 1.0F);
		}
		this.method1594();
		local5.glPopMatrix();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZZZLclient!hi;Lclient!hi;)Lclient!hc;")
	private Class22_Sub4 method1596(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class22_Sub4_Sub1 arg3, @OriginalArg(4) Class22_Sub4_Sub1 arg4) {
		arg3.anInt1917 = this.anInt1917;
		arg3.anInt1918 = this.anInt1918;
		arg3.anInt1919 = this.anInt1919;
		arg3.anInt1920 = this.anInt1920;
		arg3.aShort10 = this.aShort10;
		arg3.aShort11 = this.aShort11;
		arg3.aByte6 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
		if (arg3.anIntArray174 == null || arg3.anIntArray174.length < this.anInt1917) {
			arg3.anIntArray174 = new int[this.anInt1917 + 100];
			arg3.anIntArray175 = new int[this.anInt1917 + 100];
			arg3.anIntArray170 = new int[this.anInt1917 + 100];
		}
		@Pc(73) int local73;
		for (local73 = 0; local73 < this.anInt1917; local73++) {
			arg3.anIntArray174[local73] = this.anIntArray174[local73];
			arg3.anIntArray175[local73] = this.anIntArray175[local73];
			arg3.anIntArray170[local73] = this.anIntArray170[local73];
		}
		if (arg3.aClass130_2 == null) {
			arg3.aClass130_2 = new Class130();
		}
		arg3.aClass130_2.aBoolean277 = false;
		if (arg3.aClass27_1 == null) {
			arg3.aClass27_1 = new Class27();
		}
		arg3.aClass27_1.aBoolean39 = false;
		if (arg0) {
			arg3.aByteArray17 = this.aByteArray17;
		} else {
			if (arg4.aByteArray17 == null || arg4.aByteArray17.length < this.anInt1920) {
				arg4.aByteArray17 = new byte[this.anInt1920 + 100];
			}
			arg3.aByteArray17 = arg4.aByteArray17;
			for (local73 = 0; local73 < this.anInt1920; local73++) {
				arg3.aByteArray17[local73] = this.aByteArray17[local73];
			}
		}
		if (arg1) {
			arg3.aShortArray30 = this.aShortArray30;
		} else {
			if (arg4.aShortArray30 == null || arg4.aShortArray30.length < this.anInt1920) {
				arg4.aShortArray30 = new short[this.anInt1920 + 100];
			}
			arg3.aShortArray30 = arg4.aShortArray30;
			for (local73 = 0; local73 < this.anInt1920; local73++) {
				arg3.aShortArray30[local73] = this.aShortArray30[local73];
			}
		}
		if (arg0 && arg1) {
			arg3.aClass130_5 = this.aClass130_5;
		} else {
			if (arg4.aClass130_5 == null) {
				arg4.aClass130_5 = new Class130();
			}
			arg3.aClass130_5 = arg4.aClass130_5;
			arg3.aClass130_5.aBoolean277 = false;
		}
		if (arg2 || this.aShortArray34 == null) {
			arg3.aShortArray34 = this.aShortArray34;
			arg3.aShortArray26 = this.aShortArray26;
			arg3.aShortArray24 = this.aShortArray24;
			arg3.aShortArray33 = this.aShortArray33;
			arg3.aClass130_4 = this.aClass130_4;
		} else {
			if (arg4.aShortArray34 == null || arg4.aShortArray34.length < this.anInt1919) {
				arg4.aShortArray34 = new short[this.anInt1919 + 100];
				arg4.aShortArray26 = new short[this.anInt1919 + 100];
				arg4.aShortArray24 = new short[this.anInt1919 + 100];
				arg4.aShortArray33 = new short[this.anInt1919 + 100];
			}
			arg3.aShortArray34 = arg4.aShortArray34;
			arg3.aShortArray26 = arg4.aShortArray26;
			arg3.aShortArray24 = arg4.aShortArray24;
			arg3.aShortArray33 = arg4.aShortArray33;
			for (local73 = 0; local73 < this.anInt1919; local73++) {
				arg3.aShortArray34[local73] = this.aShortArray34[local73];
				arg3.aShortArray26[local73] = this.aShortArray26[local73];
				arg3.aShortArray24[local73] = this.aShortArray24[local73];
				arg3.aShortArray33[local73] = this.aShortArray33[local73];
			}
			if (Static302.aBoolean419) {
				if (arg4.aClass130_4 == null) {
					arg4.aClass130_4 = new Class130();
				}
				arg3.aClass130_4 = arg4.aClass130_4;
				arg3.aClass130_4.aBoolean277 = false;
			} else {
				arg3.aClass130_4 = null;
			}
		}
		arg3.aFloatArray16 = this.aFloatArray16;
		arg3.aFloatArray17 = this.aFloatArray17;
		arg3.anIntArray172 = this.anIntArray172;
		arg3.anIntArrayArray11 = this.anIntArrayArray11;
		arg3.aShortArray23 = this.aShortArray23;
		arg3.aShortArray27 = this.aShortArray27;
		arg3.aShortArray29 = this.aShortArray29;
		arg3.aShortArray32 = this.aShortArray32;
		arg3.aByteArray18 = this.aByteArray18;
		arg3.anIntArrayArray12 = this.anIntArrayArray12;
		arg3.aClass130_1 = this.aClass130_1;
		arg3.aClass130_3 = this.aClass130_3;
		arg3.anIntArray171 = this.anIntArray171;
		arg3.aShortArray25 = this.aShortArray25;
		arg3.anIntArray173 = this.anIntArray173;
		arg3.aBoolean315 = this.aBoolean315;
		arg3.aShortArray31 = this.aShortArray31;
		arg3.aShortArray28 = this.aShortArray28;
		arg3.aClass49Array1 = this.aClass49Array1;
		arg3.aClass15Array1 = this.aClass15Array1;
		return arg3;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(SS)V")
	public void method1597(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1920; local1++) {
			if (this.aShortArray30[local1] == arg0) {
				this.aShortArray30[local1] = arg1;
			}
		}
		this.aClass130_5.aBoolean277 = false;
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(III)V")
	@Override
	public void method3577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1917; local1++) {
			this.anIntArray174[local1] += arg0;
			this.anIntArray175[local1] += arg1;
			this.anIntArray170[local1] += arg2;
		}
		this.aClass27_1.aBoolean39 = false;
		this.aClass130_2.aBoolean277 = false;
	}

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "()V")
	public void method1598() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(24) int local24;
		@Pc(9) int local9;
		@Pc(20) int local20;
		if (this.anIntArray172 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt1917; local9++) {
				local20 = this.anIntArray172[local9] & 0xFF;
				local24 = local5[local20]++;
				if (local20 > local7) {
					local7 = local20;
				}
			}
			this.anIntArrayArray11 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray11[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt1917) {
				local20 = this.anIntArray172[local9] & 0xFF;
				this.anIntArrayArray11[local20][local5[local20]++] = local9++;
			}
			this.anIntArray172 = null;
		}
		if (this.aByteArray18 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt1920; local9++) {
			local20 = this.aByteArray18[local9] & 0xFF;
			local24 = local5[local20]++;
			if (local20 > local7) {
				local7 = local20;
			}
		}
		this.anIntArrayArray12 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray12[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt1920) {
			local20 = this.aByteArray18[local9] & 0xFF;
			this.anIntArrayArray12[local20][local5[local20]++] = local9++;
		}
		this.aByteArray18 = null;
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "()V")
	@Override
	public void method3555() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1917; local1++) {
			this.anIntArray174[local1] = -this.anIntArray174[local1];
			this.anIntArray170[local1] = -this.anIntArray170[local1];
		}
		this.aClass27_1.aBoolean39 = false;
		this.aClass130_2.aBoolean277 = false;
	}

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)V")
	public void method1599(@OriginalArg(0) int arg0) {
		this.aShort10 = (short) arg0;
		this.aClass130_5.aBoolean277 = false;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "()Z")
	@Override
	public boolean method4076() {
		return this.aBoolean147 && this.anIntArray174 != null && this.aShortArray34 != null;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method3558(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(45) int local45;
		@Pc(53) int local53;
		@Pc(33) int local33;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			Static102.anInt1921 = 0;
			Static102.anInt1922 = 0;
			Static102.anInt1923 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray11.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray11[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray31 == null || (arg6 & this.aShortArray31[local53]) != 0) {
							Static102.anInt1921 += this.anIntArray174[local53];
							Static102.anInt1922 += this.anIntArray175[local53];
							Static102.anInt1923 += this.anIntArray170[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				Static102.anInt1921 = Static102.anInt1921 / local18 + arg2;
				Static102.anInt1922 = Static102.anInt1922 / local18 + arg3;
				Static102.anInt1923 = Static102.anInt1923 / local18 + arg4;
				Static102.aBoolean148 = true;
			} else {
				Static102.anInt1921 = arg2;
				Static102.anInt1922 = arg3;
				Static102.anInt1923 = arg4;
			}
			return;
		}
		@Pc(228) int[] local228;
		@Pc(230) int local230;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 16384 >> 15;
				local26 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 16384 >> 15;
				local33 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 16384 >> 15;
				arg2 = local18;
				arg3 = local26;
				arg4 = local33;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray11.length) {
					local228 = this.anIntArrayArray11[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray31 == null || (arg6 & this.aShortArray31[local45]) != 0) {
							this.anIntArray174[local45] += arg2;
							this.anIntArray175[local45] += arg3;
							this.anIntArray170[local45] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(343) int local343;
		@Pc(365) int local365;
		@Pc(387) int local387;
		@Pc(428) int local428;
		@Pc(434) int local434;
		@Pc(440) int local440;
		@Pc(446) int local446;
		@Pc(454) int local454;
		@Pc(462) int local462;
		@Pc(615) int local615;
		@Pc(640) int local640;
		@Pc(644) int local644;
		@Pc(652) int local652;
		@Pc(657) int local657;
		@Pc(662) int local662;
		@Pc(667) int local667;
		@Pc(789) int[] local789;
		@Pc(791) int local791;
		@Pc(796) int local796;
		@Pc(801) int local801;
		@Pc(803) int local803;
		@Pc(929) int local929;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray11.length) {
						local228 = this.anIntArrayArray11[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray31 == null || (arg6 & this.aShortArray31[local45]) != 0) {
								this.anIntArray174[local45] -= Static102.anInt1921;
								this.anIntArray175[local45] -= Static102.anInt1922;
								this.anIntArray170[local45] -= Static102.anInt1923;
								if (arg4 != 0) {
									local53 = Class17.anIntArray22[arg4];
									local343 = Class17.anIntArray24[arg4];
									local365 = this.anIntArray175[local45] * local53 + this.anIntArray174[local45] * local343 + 32767 >> 16;
									this.anIntArray175[local45] = this.anIntArray175[local45] * local343 + 32767 - this.anIntArray174[local45] * local53 >> 16;
									this.anIntArray174[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class17.anIntArray22[arg2];
									local343 = Class17.anIntArray24[arg2];
									local365 = this.anIntArray175[local45] * local343 + 32767 - this.anIntArray170[local45] * local53 >> 16;
									this.anIntArray170[local45] = this.anIntArray175[local45] * local53 + this.anIntArray170[local45] * local343 + 32767 >> 16;
									this.anIntArray175[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class17.anIntArray22[arg3];
									local343 = Class17.anIntArray24[arg3];
									local365 = this.anIntArray170[local45] * local53 + this.anIntArray174[local45] * local343 + 32767 >> 16;
									this.anIntArray170[local45] = this.anIntArray170[local45] * local343 + 32767 - this.anIntArray174[local45] * local53 >> 16;
									this.anIntArray174[local45] = local365;
								}
								this.anIntArray174[local45] += Static102.anInt1921;
								this.anIntArray175[local45] += Static102.anInt1922;
								this.anIntArray170[local45] += Static102.anInt1923;
							}
						}
					}
				}
				if (arg5 && this.aShortArray34 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray11.length) {
							local228 = this.anIntArrayArray11[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray31 == null || (arg6 & this.aShortArray31[local45]) != 0) {
									local53 = this.anIntArray173[local45];
									local343 = this.anIntArray173[local45 + 1];
									for (local365 = local53; local365 < local343; local365++) {
										local387 = this.aShortArray25[local365] - 1;
										if (local387 == -1) {
											break;
										}
										if (arg4 != 0) {
											local428 = Class17.anIntArray22[arg4];
											local434 = Class17.anIntArray24[arg4];
											local440 = this.aShortArray26[local387] * local428 + this.aShortArray34[local387] * local434 + 32767 >> 16;
											this.aShortArray26[local387] = (short) (this.aShortArray26[local387] * local434 + 32767 - this.aShortArray34[local387] * local428 >> 16);
											this.aShortArray34[local387] = (short) local440;
										}
										if (arg2 != 0) {
											local428 = Class17.anIntArray22[arg2];
											local434 = Class17.anIntArray24[arg2];
											local440 = this.aShortArray26[local387] * local434 + 32767 - this.aShortArray24[local387] * local428 >> 16;
											this.aShortArray24[local387] = (short) (this.aShortArray26[local387] * local428 + this.aShortArray24[local387] * local434 + 32767 >> 16);
											this.aShortArray26[local387] = (short) local440;
										}
										if (arg3 != 0) {
											local428 = Class17.anIntArray22[arg3];
											local434 = Class17.anIntArray24[arg3];
											local440 = this.aShortArray24[local387] * local428 + this.aShortArray34[local387] * local434 + 32767 >> 16;
											this.aShortArray24[local387] = (short) (this.aShortArray24[local387] * local434 + 32767 - this.aShortArray34[local387] * local428 >> 16);
											this.aShortArray34[local387] = (short) local440;
										}
									}
								}
							}
						}
					}
					if (this.aClass130_4 != null) {
						this.aClass130_4.aBoolean277 = false;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (Static102.aBoolean148) {
					local343 = arg7[0] * Static102.anInt1921 + arg7[3] * Static102.anInt1922 + arg7[6] * Static102.anInt1923 + 16384 >> 15;
					local365 = arg7[1] * Static102.anInt1921 + arg7[4] * Static102.anInt1922 + arg7[7] * Static102.anInt1923 + 16384 >> 15;
					local387 = arg7[2] * Static102.anInt1921 + arg7[5] * Static102.anInt1922 + arg7[8] * Static102.anInt1923 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static102.anInt1921 = local343;
					Static102.anInt1922 = local365;
					Static102.anInt1923 = local387;
					Static102.aBoolean148 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class17.anIntArray24[arg2] >> 1;
				local387 = Class17.anIntArray22[arg2] >> 1;
				local428 = Class17.anIntArray24[arg3] >> 1;
				local434 = Class17.anIntArray22[arg3] >> 1;
				local440 = Class17.anIntArray24[arg4] >> 1;
				local446 = Class17.anIntArray22[arg4] >> 1;
				local454 = local387 * local440 + 16384 >> 15;
				local462 = local387 * local446 + 16384 >> 15;
				local410[0] = local428 * local440 + local434 * local462 + 16384 >> 15;
				local410[1] = -local428 * local446 + local434 * local454 + 16384 >> 15;
				local410[2] = local434 * local365 + 16384 >> 15;
				local410[3] = local365 * local446 + 16384 >> 15;
				local410[4] = local365 * local440 + 16384 >> 15;
				local410[5] = -local387;
				local410[6] = -local434 * local440 + local428 * local462 + 16384 >> 15;
				local410[7] = local434 * local446 + local428 * local454 + 16384 >> 15;
				local410[8] = local428 * local365 + 16384 >> 15;
				@Pc(590) int local590 = local410[0] * -Static102.anInt1921 + local410[1] * -Static102.anInt1922 + local410[2] * -Static102.anInt1923 + 16384 >> 15;
				local615 = local410[3] * -Static102.anInt1921 + local410[4] * -Static102.anInt1922 + local410[5] * -Static102.anInt1923 + 16384 >> 15;
				local640 = local410[6] * -Static102.anInt1921 + local410[7] * -Static102.anInt1922 + local410[8] * -Static102.anInt1923 + 16384 >> 15;
				local644 = local590 + Static102.anInt1921;
				@Pc(648) int local648 = local615 + Static102.anInt1922;
				local652 = local640 + Static102.anInt1923;
				@Pc(655) int[] local655 = new int[9];
				for (local657 = 0; local657 < 3; local657++) {
					for (local662 = 0; local662 < 3; local662++) {
						local667 = 0;
						for (@Pc(669) int local669 = 0; local669 < 3; local669++) {
							local667 += local410[local657 * 3 + local669] * arg7[local662 * 3 + local669];
						}
						local655[local657 * 3 + local662] = local667 + 16384 >> 15;
					}
				}
				local657 = local410[0] * local230 + local410[1] * local45 + local410[2] * local53 + 16384 >> 15;
				local662 = local410[3] * local230 + local410[4] * local45 + local410[5] * local53 + 16384 >> 15;
				local667 = local410[6] * local230 + local410[7] * local45 + local410[8] * local53 + 16384 >> 15;
				local657 += local644;
				local662 += local648;
				local667 += local652;
				local789 = new int[9];
				for (local791 = 0; local791 < 3; local791++) {
					for (local796 = 0; local796 < 3; local796++) {
						local801 = 0;
						for (local803 = 0; local803 < 3; local803++) {
							local801 += arg7[local791 * 3 + local803] * local655[local796 + local803 * 3];
						}
						local789[local791 * 3 + local796] = local801 + 16384 >> 15;
					}
				}
				local791 = arg7[0] * local657 + arg7[1] * local662 + arg7[2] * local667 + 16384 >> 15;
				local796 = arg7[3] * local657 + arg7[4] * local662 + arg7[5] * local667 + 16384 >> 15;
				local801 = arg7[6] * local657 + arg7[7] * local662 + arg7[8] * local667 + 16384 >> 15;
				local791 += local18;
				local796 += local26;
				local801 += local33;
				for (local803 = 0; local803 < local2; local803++) {
					local929 = arg1[local803];
					if (local929 < this.anIntArrayArray11.length) {
						@Pc(939) int[] local939 = this.anIntArrayArray11[local929];
						for (@Pc(941) int local941 = 0; local941 < local939.length; local941++) {
							@Pc(949) int local949 = local939[local941];
							if (this.aShortArray31 == null || (arg6 & this.aShortArray31[local949]) != 0) {
								@Pc(991) int local991 = local789[0] * this.anIntArray174[local949] + local789[1] * this.anIntArray175[local949] + local789[2] * this.anIntArray170[local949] + 16384 >> 15;
								@Pc(1022) int local1022 = local789[3] * this.anIntArray174[local949] + local789[4] * this.anIntArray175[local949] + local789[5] * this.anIntArray170[local949] + 16384 >> 15;
								@Pc(1053) int local1053 = local789[6] * this.anIntArray174[local949] + local789[7] * this.anIntArray175[local949] + local789[8] * this.anIntArray170[local949] + 16384 >> 15;
								@Pc(1057) int local1057 = local991 + local791;
								@Pc(1061) int local1061 = local1022 + local796;
								@Pc(1065) int local1065 = local1053 + local801;
								this.anIntArray174[local949] = local1057;
								this.anIntArray175[local949] = local1061;
								this.anIntArray170[local949] = local1065;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray11.length) {
						local228 = this.anIntArrayArray11[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray31 == null || (arg6 & this.aShortArray31[local45]) != 0) {
								this.anIntArray174[local45] -= Static102.anInt1921;
								this.anIntArray175[local45] -= Static102.anInt1922;
								this.anIntArray170[local45] -= Static102.anInt1923;
								this.anIntArray174[local45] = this.anIntArray174[local45] * arg2 >> 7;
								this.anIntArray175[local45] = this.anIntArray175[local45] * arg3 >> 7;
								this.anIntArray170[local45] = this.anIntArray170[local45] * arg4 >> 7;
								this.anIntArray174[local45] += Static102.anInt1921;
								this.anIntArray175[local45] += Static102.anInt1922;
								this.anIntArray170[local45] += Static102.anInt1923;
							}
						}
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (Static102.aBoolean148) {
					local343 = arg7[0] * Static102.anInt1921 + arg7[3] * Static102.anInt1922 + arg7[6] * Static102.anInt1923 + 16384 >> 15;
					local365 = arg7[1] * Static102.anInt1921 + arg7[4] * Static102.anInt1922 + arg7[7] * Static102.anInt1923 + 16384 >> 15;
					local387 = arg7[2] * Static102.anInt1921 + arg7[5] * Static102.anInt1922 + arg7[8] * Static102.anInt1923 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static102.anInt1921 = local343;
					Static102.anInt1922 = local365;
					Static102.anInt1923 = local387;
					Static102.aBoolean148 = false;
				}
				local343 = arg2 << 15 >> 7;
				local365 = arg3 << 15 >> 7;
				local387 = arg4 << 15 >> 7;
				local428 = local343 * -Static102.anInt1921 + 16384 >> 15;
				local434 = local365 * -Static102.anInt1922 + 16384 >> 15;
				local440 = local387 * -Static102.anInt1923 + 16384 >> 15;
				local446 = local428 + Static102.anInt1921;
				local454 = local434 + Static102.anInt1922;
				local462 = local440 + Static102.anInt1923;
				@Pc(1783) int[] local1783 = new int[] { local343 * arg7[0] + 16384 >> 15, local343 * arg7[3] + 16384 >> 15, local343 * arg7[6] + 16384 >> 15, local365 * arg7[1] + 16384 >> 15, local365 * arg7[4] + 16384 >> 15, local365 * arg7[7] + 16384 >> 15, local387 * arg7[2] + 16384 >> 15, local387 * arg7[5] + 16384 >> 15, local387 * arg7[8] + 16384 >> 15 };
				local615 = local343 * local230 + 16384 >> 15;
				local640 = local365 * local45 + 16384 >> 15;
				local644 = local387 * local53 + 16384 >> 15;
				@Pc(1919) int local1919 = local615 + local446;
				@Pc(1923) int local1923 = local640 + local454;
				@Pc(1927) int local1927 = local644 + local462;
				@Pc(1930) int[] local1930 = new int[9];
				@Pc(1937) int local1937;
				for (local652 = 0; local652 < 3; local652++) {
					for (local1937 = 0; local1937 < 3; local1937++) {
						local657 = 0;
						for (local662 = 0; local662 < 3; local662++) {
							local657 += arg7[local652 * 3 + local662] * local1783[local1937 + local662 * 3];
						}
						local1930[local652 * 3 + local1937] = local657 + 16384 >> 15;
					}
				}
				local652 = arg7[0] * local1919 + arg7[1] * local1923 + arg7[2] * local1927 + 16384 >> 15;
				local1937 = arg7[3] * local1919 + arg7[4] * local1923 + arg7[5] * local1927 + 16384 >> 15;
				local657 = arg7[6] * local1919 + arg7[7] * local1923 + arg7[8] * local1927 + 16384 >> 15;
				local652 += local18;
				local1937 += local26;
				local657 += local33;
				for (local662 = 0; local662 < local2; local662++) {
					local667 = arg1[local662];
					if (local667 < this.anIntArrayArray11.length) {
						local789 = this.anIntArrayArray11[local667];
						for (local791 = 0; local791 < local789.length; local791++) {
							local796 = local789[local791];
							if (this.aShortArray31 == null || (arg6 & this.aShortArray31[local796]) != 0) {
								local801 = local1930[0] * this.anIntArray174[local796] + local1930[1] * this.anIntArray175[local796] + local1930[2] * this.anIntArray170[local796] + 16384 >> 15;
								local803 = local1930[3] * this.anIntArray174[local796] + local1930[4] * this.anIntArray175[local796] + local1930[5] * this.anIntArray170[local796] + 16384 >> 15;
								local929 = local1930[6] * this.anIntArray174[local796] + local1930[7] * this.anIntArray175[local796] + local1930[8] * this.anIntArray170[local796] + 16384 >> 15;
								@Pc(2198) int local2198 = local801 + local652;
								@Pc(2202) int local2202 = local803 + local1937;
								@Pc(2206) int local2206 = local929 + local657;
								this.anIntArray174[local796] = local2198;
								this.anIntArray175[local796] = local2202;
								this.anIntArray170[local796] = local2206;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray12 != null && this.aByteArray17 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray12.length) {
						local228 = this.anIntArrayArray12[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local45]) != 0) {
								local53 = (this.aByteArray17[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray17[local45] = (byte) local53;
							}
						}
						if (local228.length > 0) {
							this.aClass130_5.aBoolean277 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray12 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray12.length) {
					local228 = this.anIntArrayArray12[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray28 == null || (arg6 & this.aShortArray28[local45]) != 0) {
							local53 = this.aShortArray30[local45] & 0xFFFF;
							local343 = local53 >> 10 & 0x3F;
							local365 = local53 >> 7 & 0x7;
							local387 = local53 & 0x7F;
							@Pc(2518) int local2518 = local343 + arg2 & 0x3F;
							local365 += arg3 / 4;
							if (local365 < 0) {
								local365 = 0;
							} else if (local365 > 7) {
								local365 = 7;
							}
							local387 += arg4;
							if (local387 < 0) {
								local387 = 0;
							} else if (local387 > 127) {
								local387 = 127;
							}
							this.aShortArray30[local45] = (short) (local2518 << 10 | local365 << 7 | local387);
						}
					}
					if (local228.length > 0) {
						this.aClass130_5.aBoolean277 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIIJILclient!ko;)V")
	@Override
	public void method4073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class45_Sub2 arg10) {
		if (this.anInt1919 == 0) {
			return;
		}
		if (!this.aClass27_1.aBoolean39) {
			this.method1602();
		}
		@Pc(13) short local13 = this.aClass27_1.aShort7;
		@Pc(17) short local17 = this.aClass27_1.aShort8;
		@Pc(21) short local21 = this.aClass27_1.aShort4;
		if (arg10 != null) {
			arg10.method2402(arg0, arg9, arg5, arg6, arg7);
		}
		@Pc(40) int local40 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(50) int local50 = arg6 * arg1 + local40 * arg2 >> 16;
		@Pc(62) int local62 = local50 + (local13 * arg2 + local21 * arg1 >> 16);
		if (local62 <= 50) {
			return;
		}
		@Pc(79) int local79 = local50 + (-local13 * arg2 + local17 * arg1 >> 16);
		if (local79 >= 3584) {
			return;
		}
		@Pc(93) int local93 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(99) int local99 = local93 + local13 << 9;
		if (local99 / local62 <= Static25.anInt487) {
			return;
		}
		@Pc(111) int local111 = local93 - local13 << 9;
		if (local111 / local62 >= Static187.anInt3768) {
			return;
		}
		@Pc(127) int local127 = arg6 * arg2 - local40 * arg1 >> 16;
		@Pc(141) int local141 = local127 + (local13 * arg1 + local21 * arg2 >> 16) << 9;
		if (local141 / local62 <= Static56.anInt1120) {
			return;
		}
		@Pc(162) int local162 = local127 + (-local13 * arg1 + local17 * arg2 >> 16) << 9;
		if (local162 / local62 >= Static38.anInt768) {
			return;
		}
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		if (arg0 != 0) {
			local170 = Class17.anIntArray22[arg0];
			local172 = Class17.anIntArray24[arg0];
		}
		if (arg8 > 0L && Static281.aBoolean384 && local79 > 0) {
			@Pc(196) int local196;
			@Pc(200) int local200;
			if (local93 > 0) {
				local196 = local111 / local62;
				local200 = local99 / local79;
			} else {
				local196 = local111 / local79;
				local200 = local99 / local62;
			}
			@Pc(215) int local215;
			@Pc(219) int local219;
			if (local127 > 0) {
				local215 = local162 / local62;
				local219 = local141 / local79;
			} else {
				local215 = local162 / local79;
				local219 = local141 / local62;
			}
			if (Static34.anInt613 >= local196 && Static34.anInt613 <= local200 && Static152.anInt3139 >= local215 && Static152.anInt3139 <= local219) {
				local196 = 999999;
				local200 = -999999;
				local215 = 999999;
				local219 = -999999;
				@Pc(252) short local252 = this.aClass27_1.aShort2;
				@Pc(256) short local256 = this.aClass27_1.aShort6;
				@Pc(260) short local260 = this.aClass27_1.aShort3;
				@Pc(264) short local264 = this.aClass27_1.aShort5;
				@Pc(299) int[] local299 = new int[] { local252, local256, local252, local256, local252, local256, local252, local256 };
				@Pc(334) int[] local334 = new int[] { local260, local260, local264, local264, local260, local260, local264, local264 };
				@Pc(369) int[] local369 = new int[] { local17, local17, local17, local17, local21, local21, local21, local21 };
				@Pc(371) int local371;
				@Pc(378) int local378;
				@Pc(382) int local382;
				@Pc(386) int local386;
				@Pc(398) int local398;
				@Pc(474) int local474;
				@Pc(480) int local480;
				for (local371 = 0; local371 < 8; local371++) {
					local378 = local299[local371];
					local382 = local369[local371];
					local386 = local334[local371];
					if (arg0 != 0) {
						local398 = local386 * local170 + local378 * local172 >> 16;
						local386 = local386 * local172 - local378 * local170 >> 16;
						local378 = local398;
					}
					local378 += arg5;
					local382 += arg6;
					local386 += arg7;
					local398 = local386 * arg3 + local378 * arg4 >> 16;
					local386 = local386 * arg4 - local378 * arg3 >> 16;
					local378 = local398;
					local398 = local382 * arg2 - local386 * arg1 >> 16;
					local386 = local382 * arg1 + local386 * arg2 >> 16;
					if (local386 > 0) {
						local474 = (local378 << 9) / local386;
						local480 = (local398 << 9) / local386;
						if (local474 < local196) {
							local196 = local474;
						}
						if (local474 > local200) {
							local200 = local474;
						}
						if (local480 < local215) {
							local215 = local480;
						}
						if (local480 > local219) {
							local219 = local480;
						}
					}
				}
				if (Static34.anInt613 >= local196 && Static34.anInt613 <= local200 && Static152.anInt3139 >= local215 && Static152.anInt3139 <= local219) {
					if (this.aBoolean315) {
						Static17.aLongArray11[Static57.anInt1123++] = arg8;
					} else {
						if (Static102.anIntArray177.length < this.anInt1919) {
							Static102.anIntArray177 = new int[this.anInt1919];
							Static102.anIntArray176 = new int[this.anInt1919];
						}
						local371 = 0;
						label124: while (true) {
							if (local371 >= this.anInt1918) {
								local371 = 0;
								while (true) {
									if (local371 >= this.anInt1920) {
										break label124;
									}
									@Pc(707) short local707 = this.aShortArray23[local371];
									@Pc(712) short local712 = this.aShortArray27[local371];
									@Pc(717) short local717 = this.aShortArray29[local371];
									if (this.method1589(Static34.anInt613, Static152.anInt3139, Static102.anIntArray176[local707], Static102.anIntArray176[local712], Static102.anIntArray176[local717], Static102.anIntArray177[local707], Static102.anIntArray177[local712], Static102.anIntArray177[local717])) {
										Static17.aLongArray11[Static57.anInt1123++] = arg8;
										break label124;
									}
									local371++;
								}
							}
							local378 = this.anIntArray174[local371];
							local382 = this.anIntArray175[local371];
							local386 = this.anIntArray170[local371];
							if (arg0 != 0) {
								local398 = local386 * local170 + local378 * local172 >> 16;
								local386 = local386 * local172 - local378 * local170 >> 16;
								local378 = local398;
							}
							local378 += arg5;
							local382 += arg6;
							local386 += arg7;
							local398 = local386 * arg3 + local378 * arg4 >> 16;
							local386 = local386 * arg4 - local378 * arg3 >> 16;
							local378 = local398;
							local398 = local382 * arg2 - local386 * arg1 >> 16;
							local386 = local382 * arg1 + local386 * arg2 >> 16;
							if (local386 < 50) {
								break;
							}
							local474 = (local378 << 9) / local386;
							local480 = (local398 << 9) / local386;
							@Pc(661) int local661 = this.anIntArray173[local371];
							@Pc(668) int local668 = this.anIntArray173[local371 + 1];
							for (@Pc(670) int local670 = local661; local670 < local668; local670++) {
								@Pc(680) int local680 = this.aShortArray25[local670] - 1;
								if (local680 == -1) {
									break;
								}
								Static102.anIntArray177[local680] = local474;
								Static102.anIntArray176[local680] = local480;
							}
							local371++;
						}
					}
				}
			}
		}
		@Pc(753) GL local753 = Static291.aGL1;
		local753.glPushMatrix();
		local753.glTranslatef((float) arg5, (float) arg6, (float) arg7);
		local753.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
		this.method1594();
		local753.glPopMatrix();
		if (arg10 != null) {
			arg10.method2399(arg0, arg1, arg2, arg3, arg4, arg9, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(ZZZ)Lclient!hc;")
	@Override
	public Class22_Sub4 method3568(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method1596(arg0, arg1, arg2, Static102.aClass22_Sub4_Sub1_4, Static102.aClass22_Sub4_Sub1_3);
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(ZZZ)Lclient!hc;")
	@Override
	public Class22_Sub4 method3569(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method1596(arg0, arg1, arg2, Static102.aClass22_Sub4_Sub1_2, Static102.aClass22_Sub4_Sub1_1);
	}

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "()I")
	@Override
	public int method3564() {
		if (!this.aClass27_1.aBoolean39) {
			this.method1602();
		}
		return this.aClass27_1.aShort4;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(SS)V")
	public void method1600(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt1920; local1++) {
			if (this.aShortArray32[local1] == arg0) {
				this.aShortArray32[local1] = arg1;
			}
		}
		local1 = 0;
		@Pc(22) int local22 = 0;
		if (arg0 != -1) {
			local1 = Static18.anInterface1_1.method1631(arg0 & 0xFFFF);
			local22 = Static18.anInterface1_1.method1635(arg0 & 0xFFFF);
		}
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		if (arg1 != -1) {
			local41 = Static18.anInterface1_1.method1631(arg1 & 0xFFFF);
			local43 = Static18.anInterface1_1.method1635(arg1 & 0xFFFF);
		}
		if (local1 != local41 || local22 != local43) {
			this.aClass130_5.aBoolean277 = false;
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(III)V")
	@Override
	public void method3575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1917; local1++) {
			this.anIntArray174[local1] = this.anIntArray174[local1] * arg0 >> 7;
			this.anIntArray175[local1] = this.anIntArray175[local1] * arg1 >> 7;
			this.anIntArray170[local1] = this.anIntArray170[local1] * arg2 >> 7;
		}
		this.aClass27_1.aBoolean39 = false;
		this.aClass130_2.aBoolean277 = false;
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "()V")
	@Override
	public void method3556() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1917; local1++) {
			@Pc(10) int local10 = this.anIntArray170[local1];
			this.anIntArray170[local1] = this.anIntArray174[local1];
			this.anIntArray174[local1] = -local10;
		}
		this.aClass27_1.aBoolean39 = false;
		this.aClass130_2.aBoolean277 = false;
	}

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "()V")
	@Override
	public void method3578() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1917; local1++) {
			@Pc(10) int local10 = this.anIntArray174[local1];
			this.anIntArray174[local1] = this.anIntArray170[local1];
			this.anIntArray170[local1] = -local10;
		}
		this.aClass27_1.aBoolean39 = false;
		this.aClass130_2.aBoolean277 = false;
	}

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "()V")
	private void method1602() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt1918; local17++) {
			@Pc(26) int local26 = this.anIntArray174[local17];
			@Pc(31) int local31 = this.anIntArray175[local17];
			@Pc(36) int local36 = this.anIntArray170[local17];
			if (local26 < local1) {
				local1 = local26;
			}
			if (local26 > local7) {
				local7 = local26;
			}
			if (local31 < local3) {
				local3 = local31;
			}
			if (local31 > local9) {
				local9 = local31;
			}
			if (local36 < local5) {
				local5 = local36;
			}
			if (local36 > local11) {
				local11 = local36;
			}
			@Pc(74) int local74 = local26 * local26 + local36 * local36;
			if (local74 > local13) {
				local13 = local74;
			}
			local74 = local26 * local26 + local36 * local36 + local31 * local31;
			if (local74 > local15) {
				local15 = local74;
			}
		}
		this.aClass27_1.aShort2 = (short) local1;
		this.aClass27_1.aShort6 = (short) local7;
		this.aClass27_1.aShort8 = (short) local3;
		this.aClass27_1.aShort4 = (short) local9;
		this.aClass27_1.aShort3 = (short) local5;
		this.aClass27_1.aShort5 = (short) local11;
		this.aClass27_1.aShort7 = (short) (Math.sqrt((double) local13) + 0.99D);
		Math.sqrt((double) local15);
		this.aClass27_1.aBoolean39 = true;
	}
}
