import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class53_Sub4_Sub2 extends Class53_Sub4 {

	@OriginalMember(owner = "client!s", name = "n", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "[I")
	public int[] anIntArray502;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Lclient!ff;")
	public Class57 aClass57_1;

	@OriginalMember(owner = "client!s", name = "r", descriptor = "Lclient!ff;")
	private Class57 aClass57_2;

	@OriginalMember(owner = "client!s", name = "s", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!s", name = "t", descriptor = "[I")
	private int[] anIntArray503;

	@OriginalMember(owner = "client!s", name = "u", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!s", name = "v", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!s", name = "w", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!s", name = "x", descriptor = "Lclient!ff;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!s", name = "y", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!s", name = "z", descriptor = "[I")
	public int[] anIntArray504;

	@OriginalMember(owner = "client!s", name = "A", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!s", name = "B", descriptor = "[Lclient!u;")
	public Class170[] aClass170Array3;

	@OriginalMember(owner = "client!s", name = "C", descriptor = "Lclient!rj;")
	private Class155 aClass155_1;

	@OriginalMember(owner = "client!s", name = "H", descriptor = "Lclient!ff;")
	private Class57 aClass57_4;

	@OriginalMember(owner = "client!s", name = "I", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!s", name = "J", descriptor = "[I")
	private int[] anIntArray505;

	@OriginalMember(owner = "client!s", name = "K", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!s", name = "N", descriptor = "[F")
	private float[] aFloatArray54;

	@OriginalMember(owner = "client!s", name = "O", descriptor = "Lclient!ff;")
	private Class57 aClass57_5;

	@OriginalMember(owner = "client!s", name = "P", descriptor = "Lclient!ba;")
	public Class15 aClass15_1;

	@OriginalMember(owner = "client!s", name = "R", descriptor = "[B")
	private byte[] aByteArray62;

	@OriginalMember(owner = "client!s", name = "S", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!s", name = "T", descriptor = "[F")
	private float[] aFloatArray55;

	@OriginalMember(owner = "client!s", name = "U", descriptor = "[I")
	private int[] anIntArray506;

	@OriginalMember(owner = "client!s", name = "V", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!s", name = "W", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!s", name = "X", descriptor = "[I")
	public int[] anIntArray507;

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "Lclient!lk;")
	private Class113 aClass113_7;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "[B")
	private byte[] aByteArray63;

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!s", name = "lb", descriptor = "[Lclient!sk;")
	public Class161[] aClass161Array3;

	@OriginalMember(owner = "client!s", name = "F", descriptor = "I")
	public int anInt4690 = 0;

	@OriginalMember(owner = "client!s", name = "E", descriptor = "I")
	private int anInt4689 = 0;

	@OriginalMember(owner = "client!s", name = "D", descriptor = "B")
	private byte aByte15 = 0;

	@OriginalMember(owner = "client!s", name = "M", descriptor = "I")
	private int anInt4691 = 0;

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "Z")
	public boolean aBoolean326 = false;

	@OriginalMember(owner = "client!s", name = "hb", descriptor = "B")
	private byte aByte16 = 0;

	@OriginalMember(owner = "client!s", name = "jb", descriptor = "I")
	private int anInt4692 = 0;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class53_Sub4_Sub2() {
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lclient!ml;IIZ)V")
	public Class53_Sub4_Sub2(@OriginalArg(0) Class53_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(26) int[] local26 = new int[arg0.anInt3353];
		this.anIntArray506 = new int[arg0.anInt3356 + 1];
		for (@Pc(35) int local35 = 0; local35 < arg0.anInt3353; local35++) {
			if ((arg0.aByteArray40 == null || arg0.aByteArray40[local35] != 2) && (arg0.aShortArray51 == null || arg0.aShortArray51[local35] == -1 || !Static158.anInterface5_1.method442(arg0.aShortArray51[local35] & 0xFFFF))) {
				local26[this.anInt4691++] = local35;
				this.anIntArray506[arg0.anIntArray331[local35]]++;
				this.anIntArray506[arg0.anIntArray330[local35]]++;
				this.anIntArray506[arg0.anIntArray332[local35]]++;
			}
		}
		@Pc(118) long[] local118 = new long[this.anInt4691];
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(130) int local130;
		@Pc(229) int local229;
		for (local120 = 0; local120 < this.anInt4691; local120++) {
			local128 = local26[local120];
			local130 = 0;
			@Pc(132) byte local132 = 0;
			@Pc(134) int local134 = 0;
			@Pc(136) int local136 = 0;
			@Pc(138) short local138 = -1;
			if (arg0.aShortArray51 != null) {
				local138 = arg0.aShortArray51[local128];
				if (local138 != -1) {
					local134 = Static158.anInterface5_1.method444(local138 & 0xFFFF);
					local136 = Static158.anInterface5_1.method455(local138 & 0xFFFF);
				}
			}
			@Pc(185) boolean local185 = arg0.aByteArray33 != null && arg0.aByteArray33[local128] != 0 || local138 != -1 && !Static158.anInterface5_1.method443(local138 & 0xFFFF);
			if ((arg3 || local185) && arg0.aByteArray37 != null) {
				local130 += arg0.aByteArray37[local128] << 17;
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
		Static113.method1806(local26, local118);
		this.anInt4690 = arg0.anInt3356;
		this.anInt4689 = arg0.anInt3355;
		this.anIntArray507 = arg0.anIntArray329;
		this.anIntArray504 = arg0.anIntArray324;
		this.anIntArray502 = arg0.anIntArray326;
		this.anIntArray503 = arg0.anIntArray323;
		this.aShortArray96 = arg0.aShortArray52;
		this.aClass161Array3 = arg0.aClass161Array1;
		this.aClass170Array3 = arg0.aClass170Array1;
		local120 = this.anInt4691 * 3;
		this.aShortArray95 = new short[local120];
		this.aShortArray90 = new short[local120];
		this.aShortArray87 = new short[local120];
		this.aShortArray89 = new short[local120];
		this.aFloatArray55 = new float[local120];
		this.aFloatArray54 = new float[local120];
		this.aShortArray92 = new short[this.anInt4691];
		this.aByteArray63 = new byte[this.anInt4691];
		this.aShortArray94 = new short[this.anInt4691];
		this.aShortArray97 = new short[this.anInt4691];
		this.aShortArray98 = new short[this.anInt4691];
		this.aShortArray91 = new short[this.anInt4691];
		if (arg0.anIntArray325 != null) {
			this.aByteArray62 = new byte[this.anInt4691];
		}
		if (arg0.aShortArray54 != null) {
			this.aShortArray88 = new short[this.anInt4691];
		}
		this.aClass15_1 = new Class15();
		this.aClass57_1 = new Class57();
		this.aClass57_5 = new Class57();
		if (Static56.aBoolean66) {
			this.aClass57_2 = new Class57();
		}
		this.aClass57_3 = new Class57();
		this.aClass57_4 = new Class57();
		this.aShort43 = (short) arg1;
		this.aShort44 = (short) arg2;
		this.aShortArray93 = new short[local120];
		Static247.aLongArray43 = new long[local120];
		local128 = 0;
		for (local130 = 0; local130 < this.anInt4689; local130++) {
			local229 = this.anIntArray506[local130];
			this.anIntArray506[local130] = local128;
			local128 += local229;
		}
		this.anIntArray506[this.anInt4689] = local128;
		@Pc(441) int[] local441 = null;
		@Pc(443) int[] local443 = null;
		@Pc(445) int[] local445 = null;
		@Pc(448) float[][] local448 = null;
		@Pc(568) int local568;
		@Pc(454) int local454;
		@Pc(698) float local698;
		@Pc(729) float local729;
		@Pc(700) float local700;
		if (arg0.aByteArray35 != null) {
			local454 = arg0.anInt3352;
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
			for (local474 = 0; local474 < this.anInt4691; local474++) {
				@Pc(513) int local513 = local26[local474];
				if (arg0.aByteArray35[local513] != -1) {
					@Pc(526) int local526 = arg0.aByteArray35[local513] & 0xFF;
					for (@Pc(528) int local528 = 0; local528 < 3; local528++) {
						@Pc(538) int local538;
						if (local528 == 0) {
							local538 = arg0.anIntArray331[local513];
						} else if (local528 == 1) {
							local538 = arg0.anIntArray330[local513];
						} else {
							local538 = arg0.anIntArray332[local513];
						}
						@Pc(558) int local558 = arg0.anIntArray329[local538];
						@Pc(563) int local563 = arg0.anIntArray324[local538];
						local568 = arg0.anIntArray326[local538];
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
				@Pc(648) byte local648 = arg0.aByteArray38[local474];
				if (local648 > 0) {
					local441[local474] = (local457[local474] + local460[local474]) / 2;
					local443[local474] = (local463[local474] + local466[local474]) / 2;
					local445[local474] = (local469[local474] + local472[local474]) / 2;
					if (local648 == 1) {
						@Pc(694) short local694 = arg0.aShortArray60[local474];
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
						local729 = 64.0F / (float) (arg0.aShortArray55[local474] & 0xFFFF);
					} else if (local648 == 2) {
						local698 = 64.0F / (float) (arg0.aShortArray60[local474] & 0xFFFF);
						local729 = 64.0F / (float) (arg0.aShortArray55[local474] & 0xFFFF);
						local700 = 64.0F / (float) (arg0.aShortArray58[local474] & 0xFFFF);
					} else {
						local698 = (float) arg0.aShortArray60[local474] / 1024.0F;
						local729 = (float) arg0.aShortArray55[local474] / 1024.0F;
						local700 = (float) arg0.aShortArray58[local474] / 1024.0F;
					}
					local448[local474] = Static247.method3901(arg0.aShortArray59[local474], arg0.aShortArray56[local474], arg0.aShortArray57[local474], arg0.aByteArray36[local474] & 0xFF, local698, local729, local700);
				}
			}
		}
		@Pc(832) int local832;
		@Pc(837) short local837;
		for (local454 = 0; local454 < this.anInt4691; local454++) {
			@Pc(825) int local825 = local26[local454];
			local832 = arg0.aShortArray53[local825] & 0xFFFF;
			if (arg0.aShortArray51 == null) {
				local837 = -1;
			} else {
				local837 = arg0.aShortArray51[local825];
			}
			@Pc(848) int local848;
			if (arg0.aByteArray35 == null) {
				local848 = -1;
			} else {
				local848 = arg0.aByteArray35[local825];
			}
			@Pc(859) int local859;
			if (arg0.aByteArray33 == null) {
				local859 = 0;
			} else {
				local859 = arg0.aByteArray33[local825] & 0xFF;
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
					local917 = arg0.aByteArray38[local848];
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
						local924 = arg0.anIntArray331[local825];
						local929 = arg0.anIntArray330[local825];
						local934 = arg0.anIntArray332[local825];
						@Pc(939) short local939 = arg0.aShortArray59[local848];
						@Pc(944) short local944 = arg0.aShortArray56[local848];
						@Pc(949) short local949 = arg0.aShortArray57[local848];
						@Pc(955) float local955 = (float) arg0.anIntArray329[local939];
						@Pc(961) float local961 = (float) arg0.anIntArray324[local939];
						local967 = arg0.anIntArray326[local939];
						local975 = (float) arg0.anIntArray329[local944] - local955;
						local983 = (float) arg0.anIntArray324[local944] - local961;
						@Pc(991) float local991 = (float) arg0.anIntArray326[local944] - local967;
						@Pc(999) float local999 = (float) arg0.anIntArray329[local949] - local955;
						@Pc(1007) float local1007 = (float) arg0.anIntArray324[local949] - local961;
						@Pc(1015) float local1015 = (float) arg0.anIntArray326[local949] - local967;
						@Pc(1023) float local1023 = (float) arg0.anIntArray329[local924] - local955;
						@Pc(1031) float local1031 = (float) arg0.anIntArray324[local924] - local961;
						@Pc(1039) float local1039 = (float) arg0.anIntArray326[local924] - local967;
						@Pc(1047) float local1047 = (float) arg0.anIntArray329[local929] - local955;
						@Pc(1055) float local1055 = (float) arg0.anIntArray324[local929] - local961;
						local1063 = (float) arg0.anIntArray326[local929] - local967;
						local1071 = (float) arg0.anIntArray329[local934] - local955;
						local1079 = (float) arg0.anIntArray324[local934] - local961;
						local1087 = (float) arg0.anIntArray326[local934] - local967;
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
						local924 = arg0.anIntArray331[local825];
						local929 = arg0.anIntArray330[local825];
						local934 = arg0.anIntArray332[local825];
						@Pc(1291) int local1291 = local441[local848];
						local1295 = local443[local848];
						@Pc(1299) int local1299 = local445[local848];
						@Pc(1303) float[] local1303 = local448[local848];
						@Pc(1308) byte local1308 = arg0.aByteArray39[local848];
						local967 = (float) arg0.aByteArray34[local848] / 256.0F;
						if (local917 == 1) {
							local975 = (float) (arg0.aShortArray58[local848] & 0xFFFF) / 1024.0F;
							Static247.method3908(arg0.anIntArray329[local924], arg0.anIntArray324[local924], arg0.anIntArray326[local924], local1291, local1295, local1299, local1303, local975, local1308, local967);
							local869 = Static247.aFloat115;
							local871 = Static247.aFloat118;
							Static247.method3908(arg0.anIntArray329[local929], arg0.anIntArray324[local929], arg0.anIntArray326[local929], local1291, local1295, local1299, local1303, local975, local1308, local967);
							local873 = Static247.aFloat115;
							local698 = Static247.aFloat118;
							Static247.method3908(arg0.anIntArray329[local934], arg0.anIntArray324[local934], arg0.anIntArray326[local934], local1291, local1295, local1299, local1303, local975, local1308, local967);
							local729 = Static247.aFloat115;
							local700 = Static247.aFloat118;
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
							local975 = (float) arg0.aByteArray32[local848] / 256.0F;
							local983 = (float) arg0.aByteArray31[local848] / 256.0F;
							@Pc(1540) int local1540 = arg0.anIntArray329[local929] - arg0.anIntArray329[local924];
							@Pc(1550) int local1550 = arg0.anIntArray324[local929] - arg0.anIntArray324[local924];
							@Pc(1560) int local1560 = arg0.anIntArray326[local929] - arg0.anIntArray326[local924];
							@Pc(1570) int local1570 = arg0.anIntArray329[local934] - arg0.anIntArray329[local924];
							@Pc(1580) int local1580 = arg0.anIntArray324[local934] - arg0.anIntArray324[local924];
							@Pc(1590) int local1590 = arg0.anIntArray326[local934] - arg0.anIntArray326[local924];
							@Pc(1598) int local1598 = local1550 * local1590 - local1580 * local1560;
							@Pc(1606) int local1606 = local1560 * local1570 - local1590 * local1540;
							@Pc(1614) int local1614 = local1540 * local1580 - local1570 * local1550;
							local1063 = 64.0F / (float) (arg0.aShortArray60[local848] & 0xFFFF);
							local1071 = 64.0F / (float) (arg0.aShortArray55[local848] & 0xFFFF);
							local1079 = 64.0F / (float) (arg0.aShortArray58[local848] & 0xFFFF);
							local1087 = ((float) local1598 * local1303[0] + (float) local1606 * local1303[1] + (float) local1614 * local1303[2]) / local1063;
							local1095 = ((float) local1598 * local1303[3] + (float) local1606 * local1303[4] + (float) local1614 * local1303[5]) / local1071;
							local1103 = ((float) local1598 * local1303[6] + (float) local1606 * local1303[7] + (float) local1614 * local1303[8]) / local1079;
							local568 = Static247.method3914(local1087, local1095, local1103);
							Static247.method3893(arg0.anIntArray329[local924], arg0.anIntArray324[local924], arg0.anIntArray326[local924], local1291, local1295, local1299, local568, local1303, local1308, local967, local975, local983);
							local869 = Static247.aFloat119;
							local871 = Static247.aFloat116;
							Static247.method3893(arg0.anIntArray329[local929], arg0.anIntArray324[local929], arg0.anIntArray326[local929], local1291, local1295, local1299, local568, local1303, local1308, local967, local975, local983);
							local873 = Static247.aFloat119;
							local698 = Static247.aFloat116;
							Static247.method3893(arg0.anIntArray329[local934], arg0.anIntArray324[local934], arg0.anIntArray326[local934], local1291, local1295, local1299, local568, local1303, local1308, local967, local975, local983);
							local729 = Static247.aFloat119;
							local700 = Static247.aFloat116;
						} else if (local917 == 3) {
							Static247.method3911(arg0.anIntArray329[local924], arg0.anIntArray324[local924], arg0.anIntArray326[local924], local1291, local1295, local1299, local1303, local1308, local967);
							local869 = Static247.aFloat120;
							local871 = Static247.aFloat117;
							Static247.method3911(arg0.anIntArray329[local929], arg0.anIntArray324[local929], arg0.anIntArray326[local929], local1291, local1295, local1299, local1303, local1308, local967);
							local873 = Static247.aFloat120;
							local698 = Static247.aFloat117;
							Static247.method3911(arg0.anIntArray329[local934], arg0.anIntArray324[local934], arg0.anIntArray326[local934], local1291, local1295, local1299, local1303, local1308, local967);
							local729 = Static247.aFloat120;
							local700 = Static247.aFloat117;
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
			arg0.method2777();
			if (arg0.aByteArray40 == null) {
				local917 = 0;
			} else {
				local917 = arg0.aByteArray40[local825];
			}
			if (local917 == 0) {
				@Pc(2009) long local2009 = (long) (local848 << 2) + ((long) (local568 << 24) + (long) (local832 << 8) + (long) local859 << 32);
				local934 = arg0.anIntArray331[local825];
				@Pc(2019) Class31 local2019 = arg0.aClass31Array1[local934];
				this.aShortArray94[local454] = this.method3890(arg0, local934, local2009, local2019.anInt621, local2019.anInt619, local2019.anInt625, local2019.anInt620, local869, local871);
				local1295 = arg0.anIntArray330[local825];
				@Pc(2048) Class31 local2048 = arg0.aClass31Array1[local1295];
				this.aShortArray97[local454] = this.method3890(arg0, local1295, local2009 + (long) local881, local2048.anInt621, local2048.anInt619, local2048.anInt625, local2048.anInt620, local873, local698);
				@Pc(2075) int local2075 = arg0.anIntArray332[local825];
				@Pc(2080) Class31 local2080 = arg0.aClass31Array1[local2075];
				this.aShortArray98[local454] = this.method3890(arg0, local2075, local2009 + (long) local883, local2080.anInt621, local2080.anInt619, local2080.anInt625, local2080.anInt620, local729, local700);
			} else if (local917 == 1) {
				@Pc(2111) Class122 local2111 = arg0.aClass122Array1[local825];
				@Pc(2152) long local2152 = (long) ((local848 << 2) + (local2111.anInt3342 > 0 ? 1024 : 2048) + (local2111.anInt3339 + 256 << 12) + (local2111.anInt3343 + 256 << 22)) + ((long) (local568 << 24) + (long) (local832 << 8) + (long) local859 << 32);
				this.aShortArray94[local454] = this.method3890(arg0, arg0.anIntArray331[local825], local2152, local2111.anInt3342, local2111.anInt3339, local2111.anInt3343, 0, local869, local871);
				this.aShortArray97[local454] = this.method3890(arg0, arg0.anIntArray330[local825], local2152 + (long) local881, local2111.anInt3342, local2111.anInt3339, local2111.anInt3343, 0, local873, local698);
				this.aShortArray98[local454] = this.method3890(arg0, arg0.anIntArray332[local825], local2152 + (long) local883, local2111.anInt3342, local2111.anInt3339, local2111.anInt3343, 0, local729, local700);
			}
			if (arg0.aShortArray51 == null) {
				this.aShortArray91[local454] = -1;
			} else {
				this.aShortArray91[local454] = arg0.aShortArray51[local825];
			}
			if (this.aByteArray62 != null) {
				this.aByteArray62[local454] = (byte) arg0.anIntArray325[local825];
			}
			this.aShortArray92[local454] = arg0.aShortArray53[local825];
			if (arg0.aByteArray33 != null) {
				this.aByteArray63[local454] = arg0.aByteArray33[local825];
			}
			if (arg0.aShortArray54 != null) {
				this.aShortArray88[local454] = arg0.aShortArray54[local825];
			}
		}
		local454 = 0;
		@Pc(2286) short local2286 = -10000;
		for (local832 = 0; local832 < this.anInt4691; local832++) {
			local837 = this.aShortArray91[local832];
			if (local837 != local2286) {
				local454++;
				local2286 = local837;
			}
		}
		this.anIntArray505 = new int[local454 + 1];
		local454 = 0;
		local2286 = -10000;
		for (local832 = 0; local832 < this.anInt4691; local832++) {
			local837 = this.aShortArray91[local832];
			if (local837 != local2286) {
				this.anIntArray505[local454++] = local832;
				local2286 = local837;
			}
		}
		this.anIntArray505[local454] = this.anInt4691;
		Static247.aLongArray43 = null;
		this.aShortArray95 = Static247.method3897(this.aShortArray95, this.anInt4692);
		this.aShortArray90 = Static247.method3897(this.aShortArray90, this.anInt4692);
		this.aShortArray87 = Static247.method3897(this.aShortArray87, this.anInt4692);
		this.aShortArray89 = Static247.method3897(this.aShortArray89, this.anInt4692);
		this.aFloatArray55 = Static247.method3912(this.aFloatArray55, this.anInt4692);
		this.aFloatArray54 = Static247.method3912(this.aFloatArray54, this.anInt4692);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lclient!vc;")
	@Override
	public Class53 method3846() {
		this.aBoolean326 = false;
		if (this.aClass155_1 != null) {
			this.aShortArray95 = this.aClass155_1.aShortArray84;
			this.aShortArray90 = this.aClass155_1.aShortArray82;
			this.aShortArray87 = this.aClass155_1.aShortArray83;
			this.aShortArray89 = this.aClass155_1.aShortArray85;
			this.aClass155_1 = null;
		}
		return this;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "()I")
	@Override
	public int method3855() {
		if (!this.aClass15_1.aBoolean15) {
			this.method3902();
		}
		return this.aClass15_1.aShort3;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(SS)V")
	public void method3882(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt4691; local1++) {
			if (this.aShortArray91[local1] == arg0) {
				this.aShortArray91[local1] = arg1;
			}
		}
		local1 = 0;
		@Pc(22) int local22 = 0;
		if (arg0 != -1) {
			local1 = Static158.anInterface5_1.method450(arg0 & 0xFFFF);
			local22 = Static158.anInterface5_1.method447(arg0 & 0xFFFF);
		}
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		if (arg1 != -1) {
			local41 = Static158.anInterface5_1.method450(arg1 & 0xFFFF);
			local43 = Static158.anInterface5_1.method447(arg1 & 0xFFFF);
		}
		if (local1 != local41 || local22 != local43) {
			this.aClass57_5.aBoolean103 = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "i", descriptor = "()I")
	@Override
	public int method3866() {
		if (!this.aClass15_1.aBoolean15) {
			this.method3902();
		}
		return this.aClass15_1.aShort4;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public void method3842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10) {
		if (this.anInt4692 == 0) {
			return;
		}
		if (!this.aClass15_1.aBoolean15) {
			this.method3902();
		}
		@Pc(13) short local13 = this.aClass15_1.aShort7;
		@Pc(17) short local17 = this.aClass15_1.aShort8;
		@Pc(21) short local21 = this.aClass15_1.aShort2;
		if (arg10 != null) {
			arg10.method2983(arg0, arg9, arg5, arg6, arg7);
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
		if (local99 / local62 <= Static291.anInt5438) {
			return;
		}
		@Pc(111) int local111 = local93 - local13 << 9;
		if (local111 / local62 >= Static157.anInt3123) {
			return;
		}
		@Pc(127) int local127 = arg6 * arg2 - local40 * arg1 >> 16;
		@Pc(141) int local141 = local127 + (local13 * arg1 + local21 * arg2 >> 16) << 9;
		if (local141 / local62 <= Static311.anInt6034) {
			return;
		}
		@Pc(162) int local162 = local127 + (-local13 * arg1 + local17 * arg2 >> 16) << 9;
		if (local162 / local62 >= Static27.anInt403) {
			return;
		}
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		if (arg0 != 0) {
			local170 = Class111.anIntArray299[arg0];
			local172 = Class111.anIntArray298[arg0];
		}
		if (arg8 > 0L && Static5.aBoolean8 && local79 > 0) {
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
			if (Static281.anInt5334 >= local196 && Static281.anInt5334 <= local200 && Static2.anInt3 >= local215 && Static2.anInt3 <= local219) {
				local196 = 999999;
				local200 = -999999;
				local215 = 999999;
				local219 = -999999;
				@Pc(252) short local252 = this.aClass15_1.aShort4;
				@Pc(256) short local256 = this.aClass15_1.aShort5;
				@Pc(260) short local260 = this.aClass15_1.aShort3;
				@Pc(264) short local264 = this.aClass15_1.aShort6;
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
				if (Static281.anInt5334 >= local196 && Static281.anInt5334 <= local200 && Static2.anInt3 >= local215 && Static2.anInt3 <= local219) {
					if (this.aBoolean325) {
						Static198.aLongArray57[Static300.anInt5627++] = arg8;
					} else {
						if (Static247.anIntArray509.length < this.anInt4692) {
							Static247.anIntArray509 = new int[this.anInt4692];
							Static247.anIntArray508 = new int[this.anInt4692];
						}
						local371 = 0;
						label124: while (true) {
							if (local371 >= this.anInt4689) {
								local371 = 0;
								while (true) {
									if (local371 >= this.anInt4691) {
										break label124;
									}
									@Pc(707) short local707 = this.aShortArray94[local371];
									@Pc(712) short local712 = this.aShortArray97[local371];
									@Pc(717) short local717 = this.aShortArray98[local371];
									if (this.method3905(Static281.anInt5334, Static2.anInt3, Static247.anIntArray508[local707], Static247.anIntArray508[local712], Static247.anIntArray508[local717], Static247.anIntArray509[local707], Static247.anIntArray509[local712], Static247.anIntArray509[local717])) {
										Static198.aLongArray57[Static300.anInt5627++] = arg8;
										break label124;
									}
									local371++;
								}
							}
							local378 = this.anIntArray507[local371];
							local382 = this.anIntArray504[local371];
							local386 = this.anIntArray502[local371];
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
							@Pc(661) int local661 = this.anIntArray506[local371];
							@Pc(668) int local668 = this.anIntArray506[local371 + 1];
							for (@Pc(670) int local670 = local661; local670 < local668; local670++) {
								@Pc(680) int local680 = this.aShortArray93[local670] - 1;
								if (local680 == -1) {
									break;
								}
								Static247.anIntArray509[local680] = local474;
								Static247.anIntArray508[local680] = local480;
							}
							local371++;
						}
					}
				}
			}
		}
		@Pc(753) GL local753 = Static94.aGL1;
		local753.glPushMatrix();
		local753.glTranslatef((float) arg5, (float) arg6, (float) arg7);
		local753.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
		this.method3895();
		local753.glPopMatrix();
		if (arg10 != null) {
			arg10.method2966(arg0, arg1, arg2, arg3, arg4, arg9, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method3880(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
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
			Static247.anInt4693 = 0;
			Static247.anInt4694 = 0;
			Static247.anInt4695 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray39.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray39[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						Static247.anInt4693 += this.anIntArray507[local53];
						Static247.anInt4694 += this.anIntArray504[local53];
						Static247.anInt4695 += this.anIntArray502[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				Static247.anInt4693 = Static247.anInt4693 / local18 + local8;
				Static247.anInt4694 = Static247.anInt4694 / local18 + local12;
				Static247.anInt4695 = Static247.anInt4695 / local18 + local16;
			} else {
				Static247.anInt4693 = local8;
				Static247.anInt4694 = local12;
				Static247.anInt4695 = local16;
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
				if (local26 < this.anIntArrayArray39.length) {
					local141 = this.anIntArrayArray39[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray507[local45] += local8;
						this.anIntArray504[local45] += local12;
						this.anIntArray502[local45] += local16;
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
				if (local26 < this.anIntArrayArray39.length) {
					local141 = this.anIntArrayArray39[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray507[local45] -= Static247.anInt4693;
						this.anIntArray504[local45] -= Static247.anInt4694;
						this.anIntArray502[local45] -= Static247.anInt4695;
						if (arg4 != 0) {
							local53 = Class111.anIntArray299[arg4];
							local246 = Class111.anIntArray298[arg4];
							local264 = this.anIntArray504[local45] * local53 + this.anIntArray507[local45] * local246 + 32767 >> 16;
							this.anIntArray504[local45] = this.anIntArray504[local45] * local246 + 32767 - this.anIntArray507[local45] * local53 >> 16;
							this.anIntArray507[local45] = local264;
						}
						if (arg2 != 0) {
							local53 = Class111.anIntArray299[arg2];
							local246 = Class111.anIntArray298[arg2];
							local264 = this.anIntArray504[local45] * local246 + 32767 - this.anIntArray502[local45] * local53 >> 16;
							this.anIntArray502[local45] = this.anIntArray504[local45] * local53 + this.anIntArray502[local45] * local246 + 32767 >> 16;
							this.anIntArray504[local45] = local264;
						}
						if (arg3 != 0) {
							local53 = Class111.anIntArray299[arg3];
							local246 = Class111.anIntArray298[arg3];
							local264 = this.anIntArray502[local45] * local53 + this.anIntArray507[local45] * local246 + 32767 >> 16;
							this.anIntArray502[local45] = this.anIntArray502[local45] * local246 + 32767 - this.anIntArray507[local45] * local53 >> 16;
							this.anIntArray507[local45] = local264;
						}
						this.anIntArray507[local45] += Static247.anInt4693;
						this.anIntArray504[local45] += Static247.anInt4694;
						this.anIntArray502[local45] += Static247.anInt4695;
					}
				}
			}
			if (arg5 && this.aShortArray95 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray39.length) {
						local141 = this.anIntArrayArray39[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray506[local45];
							local246 = this.anIntArray506[local45 + 1];
							for (local264 = local53; local264 < local246; local264++) {
								local484 = this.aShortArray93[local264] - 1;
								if (local484 == -1) {
									break;
								}
								@Pc(494) int local494;
								@Pc(498) int local498;
								@Pc(516) int local516;
								if (arg4 != 0) {
									local494 = Class111.anIntArray299[arg4];
									local498 = Class111.anIntArray298[arg4];
									local516 = this.aShortArray90[local484] * local494 + this.aShortArray95[local484] * local498 + 32767 >> 16;
									this.aShortArray90[local484] = (short) (this.aShortArray90[local484] * local498 + 32767 - this.aShortArray95[local484] * local494 >> 16);
									this.aShortArray95[local484] = (short) local516;
								}
								if (arg2 != 0) {
									local494 = Class111.anIntArray299[arg2];
									local498 = Class111.anIntArray298[arg2];
									local516 = this.aShortArray90[local484] * local498 + 32767 - this.aShortArray87[local484] * local494 >> 16;
									this.aShortArray87[local484] = (short) (this.aShortArray90[local484] * local494 + this.aShortArray87[local484] * local498 + 32767 >> 16);
									this.aShortArray90[local484] = (short) local516;
								}
								if (arg3 != 0) {
									local494 = Class111.anIntArray299[arg3];
									local498 = Class111.anIntArray298[arg3];
									local516 = this.aShortArray87[local484] * local494 + this.aShortArray95[local484] * local498 + 32767 >> 16;
									this.aShortArray87[local484] = (short) (this.aShortArray87[local484] * local498 + 32767 - this.aShortArray95[local484] * local494 >> 16);
									this.aShortArray95[local484] = (short) local516;
								}
							}
						}
					}
				}
				if (this.aClass57_2 != null) {
					this.aClass57_2.aBoolean103 = false;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray39.length) {
					local141 = this.anIntArrayArray39[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray507[local45] -= Static247.anInt4693;
						this.anIntArray504[local45] -= Static247.anInt4694;
						this.anIntArray502[local45] -= Static247.anInt4695;
						this.anIntArray507[local45] = this.anIntArray507[local45] * arg2 >> 7;
						this.anIntArray504[local45] = this.anIntArray504[local45] * arg3 >> 7;
						this.anIntArray502[local45] = this.anIntArray502[local45] * arg4 >> 7;
						this.anIntArray507[local45] += Static247.anInt4693;
						this.anIntArray504[local45] += Static247.anInt4694;
						this.anIntArray502[local45] += Static247.anInt4695;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray40 != null && this.aByteArray63 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray40.length) {
						local141 = this.anIntArrayArray40[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = (this.aByteArray63[local45] & 0xFF) + arg2 * 8;
							if (local53 < 0) {
								local53 = 0;
							} else if (local53 > 255) {
								local53 = 255;
							}
							this.aByteArray63[local45] = (byte) local53;
						}
						if (local141.length > 0) {
							this.aClass57_5.aBoolean103 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray40 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray40.length) {
					local141 = this.anIntArrayArray40[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						local53 = this.aShortArray92[local45] & 0xFFFF;
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
						this.aShortArray92[local45] = (short) (local932 << 10 | local264 << 7 | local484);
					}
					if (local141.length > 0) {
						this.aClass57_5.aBoolean103 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "()I")
	@Override
	public int method3850() {
		if (!this.aClass15_1.aBoolean15) {
			this.method3902();
		}
		return this.aClass15_1.aShort8;
	}

	@OriginalMember(owner = "client!s", name = "o", descriptor = "()I")
	public int method3884() {
		return this.aShort43;
	}

	@OriginalMember(owner = "client!s", name = "p", descriptor = "()V")
	public void method3885() {
		if (this.aShortArray95 == null) {
			this.method3864();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt4690; local7++) {
			@Pc(16) int local16 = this.anIntArray502[local7];
			this.anIntArray502[local7] = this.anIntArray507[local7];
			this.anIntArray507[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt4692; local7++) {
			@Pc(43) short local43 = this.aShortArray87[local7];
			this.aShortArray87[local7] = this.aShortArray95[local7];
			this.aShortArray95[local7] = (short) -local43;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
		if (this.aClass57_2 != null) {
			this.aClass57_2.aBoolean103 = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "()I")
	@Override
	public int method3863() {
		if (!this.aClass15_1.aBoolean15) {
			this.method3902();
		}
		return this.aClass15_1.aShort7;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method3859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		if (this.anInt4692 == 0) {
			return;
		}
		@Pc(5) GL local5 = Static94.aGL1;
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
		this.method3895();
		local5.glPopMatrix();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	@Override
	public void method3852(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class111.anIntArray299[arg0];
		@Pc(7) int local7 = Class111.anIntArray298[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4690; local9++) {
			@Pc(29) int local29 = this.anIntArray502[local9] * local3 + this.anIntArray507[local9] * local7 >> 16;
			this.anIntArray502[local9] = this.anIntArray502[local9] * local7 - this.anIntArray507[local9] * local3 >> 16;
			this.anIntArray507[local9] = local29;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "q", descriptor = "()V")
	public void method3886() {
		if (this.aShortArray95 == null) {
			this.method3865();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt4690; local7++) {
			this.anIntArray507[local7] = -this.anIntArray507[local7];
			this.anIntArray502[local7] = -this.anIntArray502[local7];
		}
		for (local7 = 0; local7 < this.anInt4692; local7++) {
			this.aShortArray95[local7] = (short) -this.aShortArray95[local7];
			this.aShortArray87[local7] = (short) -this.aShortArray87[local7];
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
		if (this.aClass57_2 != null) {
			this.aClass57_2.aBoolean103 = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "r", descriptor = "()V")
	public void method3887() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt4690; local1++) {
			this.anIntArray502[local1] = -this.anIntArray502[local1];
		}
		if (this.aShortArray87 != null) {
			for (local1 = 0; local1 < this.anInt4692; local1++) {
				this.aShortArray87[local1] = (short) -this.aShortArray87[local1];
			}
		}
		for (local1 = 0; local1 < this.anInt4691; local1++) {
			@Pc(48) short local48 = this.aShortArray94[local1];
			this.aShortArray94[local1] = this.aShortArray98[local1];
			this.aShortArray98[local1] = local48;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
		if (this.aClass57_2 != null) {
			this.aClass57_2.aBoolean103 = false;
		}
		this.aClass57_4.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "j", descriptor = "()Z")
	@Override
	protected boolean method3867() {
		if (this.anIntArrayArray39 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt4690; local6++) {
			this.anIntArray507[local6] <<= 0x4;
			this.anIntArray504[local6] <<= 0x4;
			this.anIntArray502[local6] <<= 0x4;
		}
		Static247.anInt4693 = 0;
		Static247.anInt4694 = 0;
		Static247.anInt4695 = 0;
		return true;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()Z")
	@Override
	public boolean method3845() {
		return this.aBoolean326 && this.anIntArray507 != null && this.aShortArray95 != null;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
	@Override
	public void method3869(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class111.anIntArray299[arg0];
		@Pc(7) int local7 = Class111.anIntArray298[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4690; local9++) {
			@Pc(29) int local29 = this.anIntArray504[local9] * local7 - this.anIntArray502[local9] * local3 >> 16;
			this.anIntArray502[local9] = this.anIntArray504[local9] * local3 + this.anIntArray502[local9] * local7 >> 16;
			this.anIntArray504[local9] = local29;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "s", descriptor = "()V")
	private void method3888() {
		if (Static247.aClass4_Sub10_9.aByteArray71.length < this.anInt4691 * 12) {
			Static247.aClass4_Sub10_9 = new Class4_Sub10((this.anInt4691 + 100) * 12);
		} else {
			Static247.aClass4_Sub10_9.anInt5713 = 0;
		}
		@Pc(25) int local25;
		if (Static94.aBoolean126) {
			for (local25 = 0; local25 < this.anInt4691; local25++) {
				Static247.aClass4_Sub10_9.method4654(this.aShortArray94[local25]);
				Static247.aClass4_Sub10_9.method4654(this.aShortArray97[local25]);
				Static247.aClass4_Sub10_9.method4654(this.aShortArray98[local25]);
			}
		} else {
			for (local25 = 0; local25 < this.anInt4691; local25++) {
				Static247.aClass4_Sub10_9.method4636(this.aShortArray94[local25]);
				Static247.aClass4_Sub10_9.method4636(this.aShortArray97[local25]);
				Static247.aClass4_Sub10_9.method4636(this.aShortArray98[local25]);
			}
		}
		if (!Static94.aBoolean135) {
			@Pc(115) ByteBuffer local115 = ByteBuffer.allocateDirect(Static247.aClass4_Sub10_9.anInt5713);
			local115.put(Static247.aClass4_Sub10_9.aByteArray71, 0, Static247.aClass4_Sub10_9.anInt5713);
			local115.flip();
			this.aClass57_4.aBoolean103 = true;
			this.aClass57_4.aByteBuffer1 = local115;
			this.aClass57_4.aClass113_1 = null;
			return;
		}
		@Pc(88) Class113 local88 = new Class113();
		@Pc(95) ByteBuffer local95 = ByteBuffer.wrap(Static247.aClass4_Sub10_9.aByteArray71, 0, Static247.aClass4_Sub10_9.anInt5713);
		local88.method2615(local95);
		this.aClass57_4.aBoolean103 = true;
		this.aClass57_4.aByteBuffer1 = null;
		this.aClass57_4.aClass113_1 = local88;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZZZZZZZZZ)Lclient!s;")
	public Class53_Sub4_Sub2 method3889(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) boolean arg8) {
		@Pc(3) Class53_Sub4_Sub2 local3 = new Class53_Sub4_Sub2();
		local3.anInt4690 = this.anInt4690;
		local3.anInt4689 = this.anInt4689;
		local3.anInt4692 = this.anInt4692;
		local3.anInt4691 = this.anInt4691;
		if (arg0) {
			local3.anIntArray507 = this.anIntArray507;
			local3.anIntArray502 = this.anIntArray502;
		} else {
			local3.anIntArray507 = Static160.method2579(this.anIntArray507);
			local3.anIntArray502 = Static160.method2579(this.anIntArray502);
		}
		if (arg1) {
			local3.anIntArray504 = this.anIntArray504;
		} else {
			local3.anIntArray504 = Static160.method2579(this.anIntArray504);
		}
		if (arg0 && arg1) {
			local3.aClass57_1 = this.aClass57_1;
			local3.aClass15_1 = this.aClass15_1;
		} else {
			local3.aClass57_1 = new Class57();
			local3.aClass15_1 = new Class15();
		}
		if (arg2) {
			local3.aShortArray92 = this.aShortArray92;
		} else {
			local3.aShortArray92 = Static80.method1396(this.aShortArray92);
		}
		local3.aByteArray63 = this.aByteArray63;
		if (arg2 && arg3 && (arg6 && arg4 || Static56.aBoolean66)) {
			local3.aClass57_5 = this.aClass57_5;
		} else {
			local3.aClass57_5 = new Class57();
		}
		if (arg4) {
			local3.aShortArray95 = this.aShortArray95;
			local3.aShortArray90 = this.aShortArray90;
			local3.aShortArray87 = this.aShortArray87;
			local3.aShortArray89 = this.aShortArray89;
		} else {
			local3.aShortArray95 = Static80.method1396(this.aShortArray95);
			local3.aShortArray90 = Static80.method1396(this.aShortArray90);
			local3.aShortArray87 = Static80.method1396(this.aShortArray87);
			local3.aShortArray89 = Static80.method1396(this.aShortArray89);
		}
		if (!Static56.aBoolean66) {
			local3.aClass57_2 = null;
		} else if (arg4 && arg5 && arg6) {
			local3.aClass57_2 = this.aClass57_2;
		} else {
			local3.aClass57_2 = new Class57();
		}
		local3.aFloatArray55 = this.aFloatArray55;
		local3.aFloatArray54 = this.aFloatArray54;
		local3.aClass57_3 = this.aClass57_3;
		if (arg7) {
			local3.aShortArray94 = this.aShortArray94;
			local3.aShortArray97 = this.aShortArray97;
			local3.aShortArray98 = this.aShortArray98;
			local3.aClass57_4 = this.aClass57_4;
		} else {
			local3.aShortArray94 = Static80.method1396(this.aShortArray94);
			local3.aShortArray97 = Static80.method1396(this.aShortArray97);
			local3.aShortArray98 = Static80.method1396(this.aShortArray98);
			local3.aClass57_4 = new Class57();
		}
		if (arg8) {
			local3.aShortArray91 = this.aShortArray91;
		} else {
			local3.aShortArray91 = Static80.method1396(this.aShortArray91);
		}
		local3.anIntArray503 = this.anIntArray503;
		local3.anIntArrayArray39 = this.anIntArrayArray39;
		local3.aByteArray62 = this.aByteArray62;
		local3.anIntArrayArray40 = this.anIntArrayArray40;
		local3.anIntArray505 = this.anIntArray505;
		local3.aShortArray93 = this.aShortArray93;
		local3.anIntArray506 = this.anIntArray506;
		local3.aShort43 = this.aShort43;
		local3.aShort44 = this.aShort44;
		local3.aClass161Array3 = this.aClass161Array3;
		local3.aClass170Array3 = this.aClass170Array3;
		local3.aShortArray96 = this.aShortArray96;
		local3.aShortArray88 = this.aShortArray88;
		return local3;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ml;IJIIIIFF)S")
	private short method3890(@OriginalArg(0) Class53_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray506[arg1];
		@Pc(11) int local11 = this.anIntArray506[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			@Pc(23) short local23 = this.aShortArray93[local15];
			if (local23 == 0) {
				local13 = local15;
				break;
			}
			if (Static247.aLongArray43[local15] == arg2) {
				return (short) (local23 - 1);
			}
		}
		this.aShortArray93[local13] = (short) (this.anInt4692 + 1);
		Static247.aLongArray43[local13] = arg2;
		this.aShortArray95[this.anInt4692] = (short) arg3;
		this.aShortArray90[this.anInt4692] = (short) arg4;
		this.aShortArray87[this.anInt4692] = (short) arg5;
		this.aShortArray89[this.anInt4692] = (short) arg6;
		this.aFloatArray55[this.anInt4692] = arg7;
		this.aFloatArray54[this.anInt4692] = arg8;
		return (short) this.anInt4692++;
	}

	@OriginalMember(owner = "client!s", name = "l", descriptor = "()I")
	@Override
	public int method3878() {
		if (!this.aClass15_1.aBoolean15) {
			this.method3902();
		}
		return this.aClass15_1.aShort6;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!fe;)Lclient!fe;")
	public Class56_Sub1 method3891(@OriginalArg(0) Class56_Sub1 arg0) {
		if (this.anInt4692 == 0) {
			return null;
		}
		if (!this.aClass15_1.aBoolean15) {
			this.method3902();
		}
		@Pc(26) int local26;
		@Pc(40) int local40;
		if (Static178.anInt3366 > 0) {
			local26 = this.aClass15_1.aShort4 - (this.aClass15_1.aShort2 * Static178.anInt3366 >> 8) >> 3;
			local40 = this.aClass15_1.aShort5 - (this.aClass15_1.aShort8 * Static178.anInt3366 >> 8) >> 3;
		} else {
			local26 = this.aClass15_1.aShort4 - (this.aClass15_1.aShort8 * Static178.anInt3366 >> 8) >> 3;
			local40 = this.aClass15_1.aShort5 - (this.aClass15_1.aShort2 * Static178.anInt3366 >> 8) >> 3;
		}
		@Pc(85) int local85;
		@Pc(99) int local99;
		if (Static178.anInt3363 > 0) {
			local85 = this.aClass15_1.aShort3 - (this.aClass15_1.aShort2 * Static178.anInt3363 >> 8) >> 3;
			local99 = this.aClass15_1.aShort6 - (this.aClass15_1.aShort8 * Static178.anInt3363 >> 8) >> 3;
		} else {
			local85 = this.aClass15_1.aShort3 - (this.aClass15_1.aShort8 * Static178.anInt3363 >> 8) >> 3;
			local99 = this.aClass15_1.aShort6 - (this.aClass15_1.aShort2 * Static178.anInt3363 >> 8) >> 3;
		}
		@Pc(134) int local134 = local40 + 1 - local26;
		@Pc(140) int local140 = local99 + 1 - local85;
		@Pc(151) Class56_Sub1 local151;
		if (arg0 == null || arg0.aByteArray15.length < local134 * local140) {
			local151 = new Class56_Sub1(local134, local140, 0);
		} else {
			local151 = arg0;
			arg0.anInt3412 = arg0.anInt3408 = local134;
			arg0.anInt3410 = arg0.anInt3413 = local140;
			arg0.method1309();
		}
		local151.anInt3404 = local26;
		local151.anInt3405 = local85;
		if (Static247.anIntArray509.length < this.anInt4692) {
			Static247.anIntArray509 = new int[this.anInt4692];
			Static247.anIntArray508 = new int[this.anInt4692];
		}
		@Pc(194) int local194;
		@Pc(246) int local246;
		@Pc(248) int local248;
		@Pc(258) int local258;
		for (local194 = 0; local194 < this.anInt4689; local194++) {
			@Pc(216) int local216 = (this.anIntArray507[local194] - (this.anIntArray504[local194] * Static178.anInt3366 >> 8) >> 3) - local26;
			@Pc(234) int local234 = (this.anIntArray502[local194] - (this.anIntArray504[local194] * Static178.anInt3363 >> 8) >> 3) - local85;
			@Pc(239) int local239 = this.anIntArray506[local194];
			local246 = this.anIntArray506[local194 + 1];
			for (local248 = local239; local248 < local246; local248++) {
				local258 = this.aShortArray93[local248] - 1;
				if (local258 == -1) {
					break;
				}
				Static247.anIntArray509[local258] = local216;
				Static247.anIntArray508[local258] = local234;
			}
		}
		for (local194 = 0; local194 < this.anInt4691; local194++) {
			if (this.aByteArray63[local194] <= 128) {
				@Pc(292) short local292 = this.aShortArray94[local194];
				@Pc(297) short local297 = this.aShortArray97[local194];
				@Pc(302) short local302 = this.aShortArray98[local194];
				local246 = Static247.anIntArray509[local292];
				local248 = Static247.anIntArray509[local297];
				local258 = Static247.anIntArray509[local302];
				@Pc(318) int local318 = Static247.anIntArray508[local292];
				@Pc(322) int local322 = Static247.anIntArray508[local297];
				@Pc(326) int local326 = Static247.anIntArray508[local302];
				if ((local246 - local248) * (local322 - local326) - (local322 - local318) * (local258 - local248) > 0) {
					Static158.method2565(local151.aByteArray15, local318, local322, local326, local246, local248, local258, local134);
				}
			}
		}
		return local151;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
	public void method3892(@OriginalArg(0) int arg0) {
		this.aShort43 = (short) arg0;
		this.aClass57_5.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(ZZZ)Lclient!vg;")
	@Override
	public Class53_Sub4 method3873(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method3910(arg0, arg1, arg2, Static247.aClass53_Sub4_Sub2_4, Static247.aClass53_Sub4_Sub2_3);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method3874(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			Static247.anInt4693 = 0;
			Static247.anInt4694 = 0;
			Static247.anInt4695 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray39.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray39[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local53]) != 0) {
							Static247.anInt4693 += this.anIntArray507[local53];
							Static247.anInt4694 += this.anIntArray504[local53];
							Static247.anInt4695 += this.anIntArray502[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				Static247.anInt4693 = Static247.anInt4693 / local18 + arg2;
				Static247.anInt4694 = Static247.anInt4694 / local18 + arg3;
				Static247.anInt4695 = Static247.anInt4695 / local18 + arg4;
				Static247.aBoolean327 = true;
			} else {
				Static247.anInt4693 = arg2;
				Static247.anInt4694 = arg3;
				Static247.anInt4695 = arg4;
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
				if (local26 < this.anIntArrayArray39.length) {
					local228 = this.anIntArrayArray39[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local45]) != 0) {
							this.anIntArray507[local45] += arg2;
							this.anIntArray504[local45] += arg3;
							this.anIntArray502[local45] += arg4;
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
					if (local26 < this.anIntArrayArray39.length) {
						local228 = this.anIntArrayArray39[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local45]) != 0) {
								this.anIntArray507[local45] -= Static247.anInt4693;
								this.anIntArray504[local45] -= Static247.anInt4694;
								this.anIntArray502[local45] -= Static247.anInt4695;
								if (arg4 != 0) {
									local53 = Class111.anIntArray299[arg4];
									local343 = Class111.anIntArray298[arg4];
									local365 = this.anIntArray504[local45] * local53 + this.anIntArray507[local45] * local343 + 32767 >> 16;
									this.anIntArray504[local45] = this.anIntArray504[local45] * local343 + 32767 - this.anIntArray507[local45] * local53 >> 16;
									this.anIntArray507[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class111.anIntArray299[arg2];
									local343 = Class111.anIntArray298[arg2];
									local365 = this.anIntArray504[local45] * local343 + 32767 - this.anIntArray502[local45] * local53 >> 16;
									this.anIntArray502[local45] = this.anIntArray504[local45] * local53 + this.anIntArray502[local45] * local343 + 32767 >> 16;
									this.anIntArray504[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class111.anIntArray299[arg3];
									local343 = Class111.anIntArray298[arg3];
									local365 = this.anIntArray502[local45] * local53 + this.anIntArray507[local45] * local343 + 32767 >> 16;
									this.anIntArray502[local45] = this.anIntArray502[local45] * local343 + 32767 - this.anIntArray507[local45] * local53 >> 16;
									this.anIntArray507[local45] = local365;
								}
								this.anIntArray507[local45] += Static247.anInt4693;
								this.anIntArray504[local45] += Static247.anInt4694;
								this.anIntArray502[local45] += Static247.anInt4695;
							}
						}
					}
				}
				if (arg5 && this.aShortArray95 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray39.length) {
							local228 = this.anIntArrayArray39[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local45]) != 0) {
									local53 = this.anIntArray506[local45];
									local343 = this.anIntArray506[local45 + 1];
									for (local365 = local53; local365 < local343; local365++) {
										local387 = this.aShortArray93[local365] - 1;
										if (local387 == -1) {
											break;
										}
										if (arg4 != 0) {
											local428 = Class111.anIntArray299[arg4];
											local434 = Class111.anIntArray298[arg4];
											local440 = this.aShortArray90[local387] * local428 + this.aShortArray95[local387] * local434 + 32767 >> 16;
											this.aShortArray90[local387] = (short) (this.aShortArray90[local387] * local434 + 32767 - this.aShortArray95[local387] * local428 >> 16);
											this.aShortArray95[local387] = (short) local440;
										}
										if (arg2 != 0) {
											local428 = Class111.anIntArray299[arg2];
											local434 = Class111.anIntArray298[arg2];
											local440 = this.aShortArray90[local387] * local434 + 32767 - this.aShortArray87[local387] * local428 >> 16;
											this.aShortArray87[local387] = (short) (this.aShortArray90[local387] * local428 + this.aShortArray87[local387] * local434 + 32767 >> 16);
											this.aShortArray90[local387] = (short) local440;
										}
										if (arg3 != 0) {
											local428 = Class111.anIntArray299[arg3];
											local434 = Class111.anIntArray298[arg3];
											local440 = this.aShortArray87[local387] * local428 + this.aShortArray95[local387] * local434 + 32767 >> 16;
											this.aShortArray87[local387] = (short) (this.aShortArray87[local387] * local434 + 32767 - this.aShortArray95[local387] * local428 >> 16);
											this.aShortArray95[local387] = (short) local440;
										}
									}
								}
							}
						}
					}
					if (this.aClass57_2 != null) {
						this.aClass57_2.aBoolean103 = false;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (Static247.aBoolean327) {
					local343 = arg7[0] * Static247.anInt4693 + arg7[3] * Static247.anInt4694 + arg7[6] * Static247.anInt4695 + 16384 >> 15;
					local365 = arg7[1] * Static247.anInt4693 + arg7[4] * Static247.anInt4694 + arg7[7] * Static247.anInt4695 + 16384 >> 15;
					local387 = arg7[2] * Static247.anInt4693 + arg7[5] * Static247.anInt4694 + arg7[8] * Static247.anInt4695 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static247.anInt4693 = local343;
					Static247.anInt4694 = local365;
					Static247.anInt4695 = local387;
					Static247.aBoolean327 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class111.anIntArray298[arg2] >> 1;
				local387 = Class111.anIntArray299[arg2] >> 1;
				local428 = Class111.anIntArray298[arg3] >> 1;
				local434 = Class111.anIntArray299[arg3] >> 1;
				local440 = Class111.anIntArray298[arg4] >> 1;
				local446 = Class111.anIntArray299[arg4] >> 1;
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
				@Pc(590) int local590 = local410[0] * -Static247.anInt4693 + local410[1] * -Static247.anInt4694 + local410[2] * -Static247.anInt4695 + 16384 >> 15;
				local615 = local410[3] * -Static247.anInt4693 + local410[4] * -Static247.anInt4694 + local410[5] * -Static247.anInt4695 + 16384 >> 15;
				local640 = local410[6] * -Static247.anInt4693 + local410[7] * -Static247.anInt4694 + local410[8] * -Static247.anInt4695 + 16384 >> 15;
				local644 = local590 + Static247.anInt4693;
				@Pc(648) int local648 = local615 + Static247.anInt4694;
				local652 = local640 + Static247.anInt4695;
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
					if (local929 < this.anIntArrayArray39.length) {
						@Pc(939) int[] local939 = this.anIntArrayArray39[local929];
						for (@Pc(941) int local941 = 0; local941 < local939.length; local941++) {
							@Pc(949) int local949 = local939[local941];
							if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local949]) != 0) {
								@Pc(991) int local991 = local789[0] * this.anIntArray507[local949] + local789[1] * this.anIntArray504[local949] + local789[2] * this.anIntArray502[local949] + 16384 >> 15;
								@Pc(1022) int local1022 = local789[3] * this.anIntArray507[local949] + local789[4] * this.anIntArray504[local949] + local789[5] * this.anIntArray502[local949] + 16384 >> 15;
								@Pc(1053) int local1053 = local789[6] * this.anIntArray507[local949] + local789[7] * this.anIntArray504[local949] + local789[8] * this.anIntArray502[local949] + 16384 >> 15;
								@Pc(1057) int local1057 = local991 + local791;
								@Pc(1061) int local1061 = local1022 + local796;
								@Pc(1065) int local1065 = local1053 + local801;
								this.anIntArray507[local949] = local1057;
								this.anIntArray504[local949] = local1061;
								this.anIntArray502[local949] = local1065;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray39.length) {
						local228 = this.anIntArrayArray39[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local45]) != 0) {
								this.anIntArray507[local45] -= Static247.anInt4693;
								this.anIntArray504[local45] -= Static247.anInt4694;
								this.anIntArray502[local45] -= Static247.anInt4695;
								this.anIntArray507[local45] = this.anIntArray507[local45] * arg2 >> 7;
								this.anIntArray504[local45] = this.anIntArray504[local45] * arg3 >> 7;
								this.anIntArray502[local45] = this.anIntArray502[local45] * arg4 >> 7;
								this.anIntArray507[local45] += Static247.anInt4693;
								this.anIntArray504[local45] += Static247.anInt4694;
								this.anIntArray502[local45] += Static247.anInt4695;
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
				if (Static247.aBoolean327) {
					local343 = arg7[0] * Static247.anInt4693 + arg7[3] * Static247.anInt4694 + arg7[6] * Static247.anInt4695 + 16384 >> 15;
					local365 = arg7[1] * Static247.anInt4693 + arg7[4] * Static247.anInt4694 + arg7[7] * Static247.anInt4695 + 16384 >> 15;
					local387 = arg7[2] * Static247.anInt4693 + arg7[5] * Static247.anInt4694 + arg7[8] * Static247.anInt4695 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static247.anInt4693 = local343;
					Static247.anInt4694 = local365;
					Static247.anInt4695 = local387;
					Static247.aBoolean327 = false;
				}
				local343 = arg2 << 15 >> 7;
				local365 = arg3 << 15 >> 7;
				local387 = arg4 << 15 >> 7;
				local428 = local343 * -Static247.anInt4693 + 16384 >> 15;
				local434 = local365 * -Static247.anInt4694 + 16384 >> 15;
				local440 = local387 * -Static247.anInt4695 + 16384 >> 15;
				local446 = local428 + Static247.anInt4693;
				local454 = local434 + Static247.anInt4694;
				local462 = local440 + Static247.anInt4695;
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
					if (local667 < this.anIntArrayArray39.length) {
						local789 = this.anIntArrayArray39[local667];
						for (local791 = 0; local791 < local789.length; local791++) {
							local796 = local789[local791];
							if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local796]) != 0) {
								local801 = local1930[0] * this.anIntArray507[local796] + local1930[1] * this.anIntArray504[local796] + local1930[2] * this.anIntArray502[local796] + 16384 >> 15;
								local803 = local1930[3] * this.anIntArray507[local796] + local1930[4] * this.anIntArray504[local796] + local1930[5] * this.anIntArray502[local796] + 16384 >> 15;
								local929 = local1930[6] * this.anIntArray507[local796] + local1930[7] * this.anIntArray504[local796] + local1930[8] * this.anIntArray502[local796] + 16384 >> 15;
								@Pc(2198) int local2198 = local801 + local652;
								@Pc(2202) int local2202 = local803 + local1937;
								@Pc(2206) int local2206 = local929 + local657;
								this.anIntArray507[local796] = local2198;
								this.anIntArray504[local796] = local2202;
								this.anIntArray502[local796] = local2206;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray40 != null && this.aByteArray63 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray40.length) {
						local228 = this.anIntArrayArray40[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray88 == null || (arg6 & this.aShortArray88[local45]) != 0) {
								local53 = (this.aByteArray63[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray63[local45] = (byte) local53;
							}
						}
						if (local228.length > 0) {
							this.aClass57_5.aBoolean103 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray40 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray40.length) {
					local228 = this.anIntArrayArray40[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray88 == null || (arg6 & this.aShortArray88[local45]) != 0) {
							local53 = this.aShortArray92[local45] & 0xFFFF;
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
							this.aShortArray92[local45] = (short) (local2518 << 10 | local365 << 7 | local387);
						}
					}
					if (local228.length > 0) {
						this.aClass57_5.aBoolean103 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
	public void method3894() {
		if (this.aShortArray95 == null) {
			this.method3852(256);
			return;
		}
		@Pc(10) int local10 = Class111.anIntArray299[256];
		@Pc(14) int local14 = Class111.anIntArray298[256];
		@Pc(16) int local16;
		@Pc(36) int local36;
		for (local16 = 0; local16 < this.anInt4690; local16++) {
			local36 = this.anIntArray502[local16] * local10 + this.anIntArray507[local16] * local14 >> 16;
			this.anIntArray502[local16] = this.anIntArray502[local16] * local14 - this.anIntArray507[local16] * local10 >> 16;
			this.anIntArray507[local16] = local36;
		}
		for (local16 = 0; local16 < this.anInt4692; local16++) {
			local36 = this.aShortArray87[local16] * local10 + this.aShortArray95[local16] * local14 >> 16;
			this.aShortArray87[local16] = (short) (this.aShortArray87[local16] * local14 - this.aShortArray95[local16] * local10 >> 16);
			this.aShortArray95[local16] = (short) local36;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
		if (this.aClass57_2 != null) {
			this.aClass57_2.aBoolean103 = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "t", descriptor = "()V")
	private void method3895() {
		@Pc(1) GL local1 = Static94.aGL1;
		if (this.anInt4691 == 0) {
			return;
		}
		if (this.aByte15 != 0) {
			this.method3907(true, !this.aClass57_1.aBoolean103 && (this.aByte15 & 0x1) != 0, !this.aClass57_5.aBoolean103 && (this.aByte15 & 0x2) != 0, this.aClass57_2 != null && !this.aClass57_2.aBoolean103 && (this.aByte15 & 0x4) != 0, false);
		}
		this.method3907(false, !this.aClass57_1.aBoolean103, !this.aClass57_5.aBoolean103, this.aClass57_2 != null && !this.aClass57_2.aBoolean103, !this.aClass57_3.aBoolean103);
		if (!this.aClass57_4.aBoolean103) {
			this.method3888();
		}
		if (this.aByte16 != 0) {
			if ((this.aByte16 & 0x1) != 0) {
				this.anIntArray507 = null;
				this.anIntArray504 = null;
				this.anIntArray502 = null;
				this.aShortArray93 = null;
				this.anIntArray506 = null;
			}
			if ((this.aByte16 & 0x2) != 0) {
				this.aShortArray92 = null;
				this.aByteArray63 = null;
			}
			if ((this.aByte16 & 0x4) != 0) {
				this.aShortArray95 = null;
				this.aShortArray90 = null;
				this.aShortArray87 = null;
				this.aShortArray89 = null;
			}
			if ((this.aByte16 & 0x8) != 0) {
				this.aFloatArray55 = null;
				this.aFloatArray54 = null;
			}
			if ((this.aByte16 & 0x10) != 0) {
				this.aShortArray94 = null;
				this.aShortArray97 = null;
				this.aShortArray98 = null;
			}
			this.aByte16 = 0;
		}
		@Pc(172) Class113 local172 = null;
		if (this.aClass57_1.aClass113_1 != null) {
			this.aClass57_1.aClass113_1.method2617();
			local172 = this.aClass57_1.aClass113_1;
			local1.glVertexPointer(3, 5126, this.aClass57_1.anInt1745, (long) this.aClass57_1.anInt1744);
		}
		if (this.aClass57_5.aClass113_1 != null) {
			if (local172 != this.aClass57_5.aClass113_1) {
				this.aClass57_5.aClass113_1.method2617();
				local172 = this.aClass57_5.aClass113_1;
			}
			local1.glColorPointer(4, 5121, this.aClass57_5.anInt1745, (long) this.aClass57_5.anInt1744);
		}
		if (Static56.aBoolean66 && this.aClass57_2.aClass113_1 != null) {
			if (local172 != this.aClass57_2.aClass113_1) {
				this.aClass57_2.aClass113_1.method2617();
				local172 = this.aClass57_2.aClass113_1;
			}
			local1.glNormalPointer(5126, this.aClass57_2.anInt1745, (long) this.aClass57_2.anInt1744);
		}
		if (this.aClass57_3.aClass113_1 != null) {
			if (local172 != this.aClass57_3.aClass113_1) {
				this.aClass57_3.aClass113_1.method2617();
				local172 = this.aClass57_3.aClass113_1;
			}
			local1.glTexCoordPointer(2, 5126, this.aClass57_3.anInt1745, (long) this.aClass57_3.anInt1744);
		}
		if (this.aClass57_4.aClass113_1 != null) {
			this.aClass57_4.aClass113_1.method2616();
		}
		if (this.aClass57_1.aClass113_1 == null || this.aClass57_5.aClass113_1 == null || Static56.aBoolean66 && this.aClass57_2.aClass113_1 == null || this.aClass57_3.aClass113_1 == null) {
			if (Static94.aBoolean135) {
				local1.glBindBufferARB(34962, 0);
			}
			if (this.aClass57_1.aClass113_1 == null) {
				this.aClass57_1.aByteBuffer1.position(this.aClass57_1.anInt1744);
				local1.glVertexPointer(3, 5126, this.aClass57_1.anInt1745, this.aClass57_1.aByteBuffer1);
			}
			if (this.aClass57_5.aClass113_1 == null) {
				this.aClass57_5.aByteBuffer1.position(this.aClass57_5.anInt1744);
				local1.glColorPointer(4, 5121, this.aClass57_5.anInt1745, this.aClass57_5.aByteBuffer1);
			}
			if (Static56.aBoolean66 && this.aClass57_2.aClass113_1 == null) {
				this.aClass57_2.aByteBuffer1.position(this.aClass57_2.anInt1744);
				local1.glNormalPointer(5126, this.aClass57_2.anInt1745, this.aClass57_2.aByteBuffer1);
			}
			if (this.aClass57_3.aClass113_1 == null) {
				this.aClass57_3.aByteBuffer1.position(this.aClass57_3.anInt1744);
				local1.glTexCoordPointer(2, 5126, this.aClass57_3.anInt1745, this.aClass57_3.aByteBuffer1);
			}
		}
		if (this.aClass57_4.aClass113_1 == null && Static94.aBoolean135) {
			local1.glBindBufferARB(34963, 0);
		}
		@Pc(417) int local417 = this.anIntArray505.length - 1;
		for (@Pc(419) int local419 = 0; local419 < local417; local419++) {
			@Pc(427) int local427 = this.anIntArray505[local419];
			@Pc(434) int local434 = this.anIntArray505[local419 + 1];
			@Pc(439) short local439 = this.aShortArray91[local427];
			if (local439 == -1) {
				Static94.method1600(-1);
				Static164.method2665(0, 0);
			} else {
				Static158.anInterface5_1.method451(local439 & 0xFFFF);
			}
			if (this.aClass57_4.aClass113_1 == null) {
				this.aClass57_4.aByteBuffer1.position(local427 * 12);
				local1.glDrawElements(4, (local434 - local427) * 3, 5125, this.aClass57_4.aByteBuffer1);
			} else {
				local1.glDrawElements(4, (local434 - local427) * 3, 5125, (long) (local427 * 12));
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "k", descriptor = "()I")
	@Override
	public int method3875() {
		if (!this.aClass15_1.aBoolean15) {
			this.method3902();
		}
		return this.aClass15_1.aShort5;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "()V")
	@Override
	protected void method3856() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4690; local1++) {
			this.anIntArray507[local1] = this.anIntArray507[local1] + 7 >> 4;
			this.anIntArray504[local1] = this.anIntArray504[local1] + 7 >> 4;
			this.anIntArray502[local1] = this.anIntArray502[local1] + 7 >> 4;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(III)V")
	@Override
	public void method3861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4690; local1++) {
			this.anIntArray507[local1] = this.anIntArray507[local1] * arg0 >> 7;
			this.anIntArray504[local1] = this.anIntArray504[local1] * arg1 >> 7;
			this.anIntArray502[local1] = this.anIntArray502[local1] * arg2 >> 7;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IILclient!s;[[I[[IIII)V")
	public void method3896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53_Sub4_Sub2 arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!arg2.aClass15_1.aBoolean15) {
			arg2.method3902();
		}
		@Pc(11) int local11 = arg5 + arg2.aClass15_1.aShort4;
		@Pc(17) int local17 = arg5 + arg2.aClass15_1.aShort5;
		@Pc(23) int local23 = arg7 + arg2.aClass15_1.aShort3;
		@Pc(29) int local29 = arg7 + arg2.aClass15_1.aShort6;
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
			for (local150 = 0; local150 < this.anInt4689; local150++) {
				local161 = this.anIntArray507[local150] + arg5;
				local168 = this.anIntArray502[local150] + arg7;
				local172 = local161 & 0x7F;
				local176 = local168 & 0x7F;
				local180 = local161 >> 7;
				local184 = local168 >> 7;
				local206 = arg3[local180][local184] * (128 - local172) + arg3[local180 + 1][local184] * local172 >> 7;
				local232 = arg3[local180][local184 + 1] * (128 - local172) + arg3[local180 + 1][local184 + 1] * local172 >> 7;
				local244 = local206 * (128 - local176) + local232 * local176 >> 7;
				this.anIntArray504[local150] = this.anIntArray504[local150] + local244 - arg6;
			}
		} else {
			@Pc(362) int local362;
			@Pc(374) int local374;
			if (arg0 == 2) {
				@Pc(266) short local266 = arg2.aClass15_1.aShort8;
				for (local161 = 0; local161 < this.anInt4689; local161++) {
					local168 = (this.anIntArray504[local161] << 16) / local266;
					if (local168 < arg1) {
						local172 = this.anIntArray507[local161] + arg5;
						local176 = this.anIntArray502[local161] + arg7;
						local180 = local172 & 0x7F;
						local184 = local176 & 0x7F;
						local206 = local172 >> 7;
						local232 = local176 >> 7;
						local244 = arg3[local206][local232] * (128 - local180) + arg3[local206 + 1][local232] * local180 >> 7;
						local362 = arg3[local206][local232 + 1] * (128 - local180) + arg3[local206 + 1][local232 + 1] * local180 >> 7;
						local374 = local244 * (128 - local184) + local362 * local184 >> 7;
						this.anIntArray504[local161] += (local374 - arg6) * (arg1 - local168) / arg1;
					}
				}
			} else if (arg0 == 3) {
				local150 = (arg1 & 0xFF) * 4;
				local161 = (arg1 >> 8 & 0xFF) * 4;
				this.method3877(arg3, arg5, arg6, arg7, local150, local161);
			} else if (arg0 == 4) {
				local150 = arg2.aClass15_1.aShort2 - arg2.aClass15_1.aShort8;
				for (local161 = 0; local161 < this.anInt4689; local161++) {
					local168 = this.anIntArray507[local161] + arg5;
					local172 = this.anIntArray502[local161] + arg7;
					local176 = local168 & 0x7F;
					local180 = local172 & 0x7F;
					local184 = local168 >> 7;
					local206 = local172 >> 7;
					local232 = arg4[local184][local206] * (128 - local176) + arg4[local184 + 1][local206] * local176 >> 7;
					local244 = arg4[local184][local206 + 1] * (128 - local176) + arg4[local184 + 1][local206 + 1] * local176 >> 7;
					local362 = local232 * (128 - local180) + local244 * local180 >> 7;
					this.anIntArray504[local161] = this.anIntArray504[local161] + local362 + local150 - arg6;
				}
			} else if (arg0 == 5) {
				local150 = arg2.aClass15_1.aShort2 - arg2.aClass15_1.aShort8;
				for (local161 = 0; local161 < this.anInt4689; local161++) {
					local168 = this.anIntArray507[local161] + arg5;
					local172 = this.anIntArray502[local161] + arg7;
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
					this.anIntArray504[local161] = ((this.anIntArray504[local161] << 8) / local150 * local716 >> 8) - (arg6 - local362);
				}
			}
		}
		this.aClass57_1.aBoolean103 = false;
		this.aClass15_1.aBoolean15 = false;
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
	public void method3898(@OriginalArg(0) int arg0) {
		this.aShort44 = (short) arg0;
		if (this.aClass57_2 != null) {
			this.aClass57_2.aBoolean103 = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!vc;IIIZ)V")
	@Override
	public void method3844(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class53_Sub4_Sub2 local2 = (Class53_Sub4_Sub2) arg0;
		if (this.anInt4691 == 0 || local2.anInt4691 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt4689;
		@Pc(15) int[] local15 = local2.anIntArray507;
		@Pc(18) int[] local18 = local2.anIntArray504;
		@Pc(21) int[] local21 = local2.anIntArray502;
		@Pc(24) short[] local24 = local2.aShortArray95;
		@Pc(27) short[] local27 = local2.aShortArray90;
		@Pc(30) short[] local30 = local2.aShortArray87;
		@Pc(33) short[] local33 = local2.aShortArray89;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) short[] local52;
		if (this.aClass155_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass155_1.aShortArray84;
			local44 = this.aClass155_1.aShortArray82;
			local48 = this.aClass155_1.aShortArray83;
			local52 = this.aClass155_1.aShortArray85;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) short[] local80;
		if (local2.aClass155_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass155_1.aShortArray84;
			local72 = local2.aClass155_1.aShortArray82;
			local76 = local2.aClass155_1.aShortArray83;
			local80 = local2.aClass155_1.aShortArray85;
		}
		@Pc(92) int[] local92 = local2.anIntArray506;
		@Pc(95) short[] local95 = local2.aShortArray93;
		if (!local2.aClass15_1.aBoolean15) {
			local2.method3902();
		}
		@Pc(105) short local105 = local2.aClass15_1.aShort8;
		@Pc(109) short local109 = local2.aClass15_1.aShort2;
		@Pc(113) short local113 = local2.aClass15_1.aShort4;
		@Pc(117) short local117 = local2.aClass15_1.aShort5;
		@Pc(121) short local121 = local2.aClass15_1.aShort3;
		@Pc(125) short local125 = local2.aClass15_1.aShort6;
		for (@Pc(127) int local127 = 0; local127 < this.anInt4689; local127++) {
			@Pc(138) int local138 = this.anIntArray504[local127] - arg2;
			if (local138 >= local105 && local138 <= local109) {
				@Pc(152) int local152 = this.anIntArray507[local127] - arg1;
				if (local152 >= local113 && local152 <= local117) {
					@Pc(166) int local166 = this.anIntArray502[local127] - arg3;
					if (local166 >= local121 && local166 <= local125) {
						@Pc(175) int local175 = -1;
						@Pc(180) int local180 = this.anIntArray506[local127];
						@Pc(187) int local187 = this.anIntArray506[local127 + 1];
						@Pc(189) int local189;
						for (local189 = local180; local189 < local187; local189++) {
							local175 = this.aShortArray93[local189] - 1;
							if (local175 == -1 || this.aShortArray89[local175] != 0) {
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
											this.aClass155_1 = new Class155();
											local40 = this.aClass155_1.aShortArray84 = Static80.method1396(this.aShortArray95);
											local44 = this.aClass155_1.aShortArray82 = Static80.method1396(this.aShortArray90);
											local48 = this.aClass155_1.aShortArray83 = Static80.method1396(this.aShortArray87);
											local52 = this.aClass155_1.aShortArray85 = Static80.method1396(this.aShortArray89);
										}
										if (local68 == null) {
											@Pc(325) Class155 local325 = local2.aClass155_1 = new Class155();
											local68 = local325.aShortArray84 = Static80.method1396(local24);
											local72 = local325.aShortArray82 = Static80.method1396(local27);
											local76 = local325.aShortArray83 = Static80.method1396(local30);
											local80 = local325.aShortArray85 = Static80.method1396(local33);
										}
										@Pc(358) short local358 = this.aShortArray95[local175];
										@Pc(363) short local363 = this.aShortArray90[local175];
										@Pc(368) short local368 = this.aShortArray87[local175];
										@Pc(373) short local373 = this.aShortArray89[local175];
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
										local180 = this.anIntArray506[local127];
										local187 = this.anIntArray506[local127 + 1];
										for (local385 = local180; local385 < local187; local385++) {
											local394 = this.aShortArray93[local385] - 1;
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

	@OriginalMember(owner = "client!s", name = "u", descriptor = "()V")
	public void method3899() {
		if (this.aShortArray95 == null) {
			this.method3857();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt4690; local7++) {
			@Pc(16) int local16 = this.anIntArray507[local7];
			this.anIntArray507[local7] = this.anIntArray502[local7];
			this.anIntArray502[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt4692; local7++) {
			@Pc(43) short local43 = this.aShortArray95[local7];
			this.aShortArray95[local7] = this.aShortArray87[local7];
			this.aShortArray87[local7] = (short) -local43;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
		if (this.aClass57_2 != null) {
			this.aClass57_2.aBoolean103 = false;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
	@Override
	public void method3860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4690; local1++) {
			this.anIntArray507[local1] += arg0;
			this.anIntArray504[local1] += arg1;
			this.anIntArray502[local1] += arg2;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "h", descriptor = "()V")
	@Override
	public void method3865() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4690; local1++) {
			this.anIntArray507[local1] = -this.anIntArray507[local1];
			this.anIntArray502[local1] = -this.anIntArray502[local1];
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "v", descriptor = "()V")
	private void method3902() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt4689; local17++) {
			@Pc(26) int local26 = this.anIntArray507[local17];
			@Pc(31) int local31 = this.anIntArray504[local17];
			@Pc(36) int local36 = this.anIntArray502[local17];
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
		this.aClass15_1.aShort4 = (short) local1;
		this.aClass15_1.aShort5 = (short) local7;
		this.aClass15_1.aShort8 = (short) local3;
		this.aClass15_1.aShort2 = (short) local9;
		this.aClass15_1.aShort3 = (short) local5;
		this.aClass15_1.aShort6 = (short) local11;
		this.aClass15_1.aShort7 = (short) (Math.sqrt((double) local13) + 0.99D);
		Math.sqrt((double) local15);
		this.aClass15_1.aBoolean15 = true;
	}

	@OriginalMember(owner = "client!s", name = "w", descriptor = "()V")
	public void method3903() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(24) int local24;
		@Pc(9) int local9;
		@Pc(20) int local20;
		if (this.anIntArray503 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt4690; local9++) {
				local20 = this.anIntArray503[local9] & 0xFF;
				local24 = local5[local20]++;
				if (local20 > local7) {
					local7 = local20;
				}
			}
			this.anIntArrayArray39 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray39[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt4690) {
				local20 = this.anIntArray503[local9] & 0xFF;
				this.anIntArrayArray39[local20][local5[local20]++] = local9++;
			}
			this.anIntArray503 = null;
		}
		if (this.aByteArray62 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt4691; local9++) {
			local20 = this.aByteArray62[local9] & 0xFF;
			local24 = local5[local20]++;
			if (local20 > local7) {
				local7 = local20;
			}
		}
		this.anIntArrayArray40 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray40[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt4691) {
			local20 = this.aByteArray62[local9] & 0xFF;
			this.anIntArrayArray40[local20][local5[local20]++] = local9++;
		}
		this.aByteArray62 = null;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(SS)V")
	public void method3904(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4691; local1++) {
			if (this.aShortArray92[local1] == arg0) {
				this.aShortArray92[local1] = arg1;
			}
		}
		this.aClass57_5.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method3905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!s", name = "x", descriptor = "()I")
	public int method3906() {
		return this.aShort44;
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "()V")
	@Override
	public void method3857() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4690; local1++) {
			@Pc(10) int local10 = this.anIntArray507[local1];
			this.anIntArray507[local1] = this.anIntArray502[local1];
			this.anIntArray502[local1] = -local10;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZZZ)V")
	private void method3907(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(1) int local1 = 0;
		if (arg1) {
			this.aClass57_1.anInt1744 = 0;
			local1 += 12;
		}
		if (arg2) {
			this.aClass57_5.anInt1744 = local1;
			local1 += 4;
		}
		if (arg3) {
			this.aClass57_2.anInt1744 = local1;
			local1 += 12;
		}
		if (arg4) {
			this.aClass57_3.anInt1744 = local1;
			local1 += 8;
		}
		if (local1 == 0) {
			return;
		}
		if (Static247.aClass4_Sub10_9.aByteArray71.length < this.anInt4692 * local1) {
			Static247.aClass4_Sub10_9 = new Class4_Sub10((this.anInt4692 + 100) * local1);
		} else {
			Static247.aClass4_Sub10_9.anInt5713 = 0;
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
			if (Static94.aBoolean126) {
				for (local60 = 0; local60 < this.anInt4689; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray507[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray504[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray502[local60]);
					local90 = this.anIntArray506[local60];
					local97 = this.anIntArray506[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray93[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static247.aClass4_Sub10_9.anInt5713 = local109 * local1;
						Static247.aClass4_Sub10_9.method4654(local71);
						Static247.aClass4_Sub10_9.method4654(local78);
						Static247.aClass4_Sub10_9.method4654(local85);
					}
				}
			} else {
				for (local60 = 0; local60 < this.anInt4689; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray507[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray504[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray502[local60]);
					local90 = this.anIntArray506[local60];
					local97 = this.anIntArray506[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray93[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static247.aClass4_Sub10_9.anInt5713 = local109 * local1;
						Static247.aClass4_Sub10_9.method4636(local71);
						Static247.aClass4_Sub10_9.method4636(local78);
						Static247.aClass4_Sub10_9.method4636(local85);
					}
				}
			}
		}
		if (arg2) {
			if (Static56.aBoolean66) {
				for (local60 = 0; local60 < this.anInt4691; local60++) {
					local71 = Static247.method3900(this.aShortArray92[local60], this.aShortArray91[local60], this.aShort43, this.aByteArray63[local60]);
					Static247.aClass4_Sub10_9.anInt5713 = this.aClass57_5.anInt1744 + this.aShortArray94[local60] * local1;
					Static247.aClass4_Sub10_9.method4654(local71);
					Static247.aClass4_Sub10_9.anInt5713 = this.aClass57_5.anInt1744 + this.aShortArray97[local60] * local1;
					Static247.aClass4_Sub10_9.method4654(local71);
					Static247.aClass4_Sub10_9.anInt5713 = this.aClass57_5.anInt1744 + this.aShortArray98[local60] * local1;
					Static247.aClass4_Sub10_9.method4654(local71);
				}
			} else {
				local60 = (int) Static178.aFloatArray40[0];
				local71 = (int) Static178.aFloatArray40[1];
				local78 = (int) Static178.aFloatArray40[2];
				local85 = (int) Math.sqrt((double) (local60 * local60 + local71 * local71 + local78 * local78));
				local90 = (int) ((float) this.aShort43 * 1.3F);
				local97 = this.aShort44 * local85 >> 8;
				for (local99 = 0; local99 < this.anInt4691; local99++) {
					@Pc(270) short local270 = this.aShortArray94[local99];
					@Pc(275) short local275 = this.aShortArray89[local270];
					@Pc(281) int local281;
					if (local275 < 0) {
						local281 = -local275 - 1;
					} else {
						if (local275 == 0) {
							local281 = local90 + (local60 * this.aShortArray95[local270] + local71 * this.aShortArray90[local270] + local78 * this.aShortArray87[local270]) / (local97 + local97 / 2);
						} else {
							local281 = local90 + (local60 * this.aShortArray95[local270] + local71 * this.aShortArray90[local270] + local78 * this.aShortArray87[local270]) / (local97 * local275);
						}
						if (local281 < 0) {
							local281 = 0;
						} else if (local281 > 16384) {
							local281 = 16384;
						}
						this.aShortArray89[local270] = (short) (-local281 - 1);
					}
					@Pc(364) short local364 = this.aShortArray97[local99];
					@Pc(369) short local369 = this.aShortArray89[local364];
					@Pc(375) int local375;
					if (local369 < 0) {
						local375 = -local369 - 1;
					} else {
						if (local369 == 0) {
							local375 = local90 + (local60 * this.aShortArray95[local364] + local71 * this.aShortArray90[local364] + local78 * this.aShortArray87[local364]) / (local97 + local97 / 2);
						} else {
							local375 = local90 + (local60 * this.aShortArray95[local364] + local71 * this.aShortArray90[local364] + local78 * this.aShortArray87[local364]) / (local97 * local369);
						}
						if (local375 < 0) {
							local375 = 0;
						} else if (local375 > 16384) {
							local375 = 16384;
						}
						this.aShortArray89[local364] = (short) (-local375 - 1);
					}
					@Pc(458) short local458 = this.aShortArray98[local99];
					@Pc(463) short local463 = this.aShortArray89[local458];
					@Pc(469) int local469;
					if (local463 < 0) {
						local469 = -local463 - 1;
					} else {
						if (local463 == 0) {
							local469 = local90 + (local60 * this.aShortArray95[local458] + local71 * this.aShortArray90[local458] + local78 * this.aShortArray87[local458]) / (local97 + local97 / 2);
						} else {
							local469 = local90 + (local60 * this.aShortArray95[local458] + local71 * this.aShortArray90[local458] + local78 * this.aShortArray87[local458]) / (local97 * local463);
						}
						if (local469 < 0) {
							local469 = 0;
						} else if (local469 > 16384) {
							local469 = 16384;
						}
						this.aShortArray89[local458] = (short) (-local469 - 1);
					}
					@Pc(562) int local562 = Static247.method3900(this.aShortArray92[local99], this.aShortArray91[local99], local281, this.aByteArray63[local99]);
					@Pc(577) int local577 = Static247.method3900(this.aShortArray92[local99], this.aShortArray91[local99], local375, this.aByteArray63[local99]);
					@Pc(592) int local592 = Static247.method3900(this.aShortArray92[local99], this.aShortArray91[local99], local469, this.aByteArray63[local99]);
					Static247.aClass4_Sub10_9.anInt5713 = this.aClass57_5.anInt1744 + local270 * local1;
					Static247.aClass4_Sub10_9.method4654(local562);
					Static247.aClass4_Sub10_9.anInt5713 = this.aClass57_5.anInt1744 + local364 * local1;
					Static247.aClass4_Sub10_9.method4654(local577);
					Static247.aClass4_Sub10_9.anInt5713 = this.aClass57_5.anInt1744 + local458 * local1;
					Static247.aClass4_Sub10_9.method4654(local592);
				}
				this.aShortArray95 = null;
				this.aShortArray90 = null;
				this.aShortArray87 = null;
			}
		}
		if (arg3) {
			@Pc(723) float local723 = 3.0F / (float) this.aShort44;
			@Pc(734) float local734 = 3.0F / (float) (this.aShort44 + this.aShort44 / 2);
			Static247.aClass4_Sub10_9.anInt5713 = this.aClass57_2.anInt1744;
			@Pc(752) short local752;
			@Pc(790) float local790;
			if (Static94.aBoolean126) {
				for (local78 = 0; local78 < this.anInt4692; local78++) {
					local752 = this.aShortArray89[local78];
					if (local752 == 0) {
						Static247.aClass4_Sub10_9.method4641((float) this.aShortArray95[local78] * local734);
						Static247.aClass4_Sub10_9.method4641((float) this.aShortArray90[local78] * local734);
						Static247.aClass4_Sub10_9.method4641((float) this.aShortArray87[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static247.aClass4_Sub10_9.method4641((float) this.aShortArray95[local78] * local790);
						Static247.aClass4_Sub10_9.method4641((float) this.aShortArray90[local78] * local790);
						Static247.aClass4_Sub10_9.method4641((float) this.aShortArray87[local78] * local790);
					}
					Static247.aClass4_Sub10_9.anInt5713 += local1 - 12;
				}
			} else {
				for (local78 = 0; local78 < this.anInt4692; local78++) {
					local752 = this.aShortArray89[local78];
					if (local752 == 0) {
						Static247.aClass4_Sub10_9.method4669((float) this.aShortArray95[local78] * local734);
						Static247.aClass4_Sub10_9.method4669((float) this.aShortArray90[local78] * local734);
						Static247.aClass4_Sub10_9.method4669((float) this.aShortArray87[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static247.aClass4_Sub10_9.method4669((float) this.aShortArray95[local78] * local790);
						Static247.aClass4_Sub10_9.method4669((float) this.aShortArray90[local78] * local790);
						Static247.aClass4_Sub10_9.method4669((float) this.aShortArray87[local78] * local790);
					}
					Static247.aClass4_Sub10_9.anInt5713 += local1 - 12;
				}
			}
		}
		if (arg4) {
			Static247.aClass4_Sub10_9.anInt5713 = this.aClass57_3.anInt1744;
			if (Static94.aBoolean126) {
				for (local60 = 0; local60 < this.anInt4692; local60++) {
					Static247.aClass4_Sub10_9.method4641(this.aFloatArray55[local60]);
					Static247.aClass4_Sub10_9.method4641(this.aFloatArray54[local60]);
					Static247.aClass4_Sub10_9.anInt5713 += local1 - 8;
				}
			} else {
				for (local60 = 0; local60 < this.anInt4692; local60++) {
					Static247.aClass4_Sub10_9.method4669(this.aFloatArray55[local60]);
					Static247.aClass4_Sub10_9.method4669(this.aFloatArray54[local60]);
					Static247.aClass4_Sub10_9.anInt5713 += local1 - 8;
				}
			}
		}
		Static247.aClass4_Sub10_9.anInt5713 = local1 * this.anInt4692;
		@Pc(1007) ByteBuffer local1007;
		if (arg0) {
			if (Static94.aBoolean129) {
				local1007 = ByteBuffer.wrap(Static247.aClass4_Sub10_9.aByteArray71, 0, Static247.aClass4_Sub10_9.anInt5713);
				if (this.aClass113_7 == null) {
					this.aClass113_7 = new Class113(true);
					this.aClass113_7.method2615(local1007);
				} else {
					this.aClass113_7.method2613(local1007);
				}
				if (arg1) {
					this.aClass57_1.aBoolean103 = true;
					this.aClass57_1.aByteBuffer1 = null;
					this.aClass57_1.aClass113_1 = this.aClass113_7;
					this.aClass57_1.anInt1745 = local1;
				}
				if (arg2) {
					this.aClass57_5.aBoolean103 = true;
					this.aClass57_5.aByteBuffer1 = null;
					this.aClass57_5.aClass113_1 = this.aClass113_7;
					this.aClass57_5.anInt1745 = local1;
				}
				if (arg3) {
					this.aClass57_2.aBoolean103 = true;
					this.aClass57_2.aByteBuffer1 = null;
					this.aClass57_2.aClass113_1 = this.aClass113_7;
					this.aClass57_2.anInt1745 = local1;
				}
				if (arg4) {
					this.aClass57_3.aBoolean103 = true;
					this.aClass57_3.aByteBuffer1 = null;
					this.aClass57_3.aClass113_1 = this.aClass113_7;
					this.aClass57_3.anInt1745 = local1;
				}
			} else {
				if (Static247.aByteBuffer15 == null || Static247.aByteBuffer15.capacity() < Static247.aClass4_Sub10_9.anInt5713) {
					Static247.aByteBuffer15 = ByteBuffer.allocateDirect(Static247.aClass4_Sub10_9.anInt5713 + local1 * 100);
				} else {
					Static247.aByteBuffer15.clear();
				}
				Static247.aByteBuffer15.put(Static247.aClass4_Sub10_9.aByteArray71, 0, Static247.aClass4_Sub10_9.anInt5713);
				Static247.aByteBuffer15.flip();
				if (arg1) {
					this.aClass57_1.aBoolean103 = true;
					this.aClass57_1.aByteBuffer1 = Static247.aByteBuffer15;
					this.aClass57_1.aClass113_1 = null;
					this.aClass57_1.anInt1745 = local1;
				}
				if (arg2) {
					this.aClass57_5.aBoolean103 = true;
					this.aClass57_5.aByteBuffer1 = Static247.aByteBuffer15;
					this.aClass57_1.aClass113_1 = null;
					this.aClass57_5.anInt1745 = local1;
				}
				if (arg3) {
					this.aClass57_2.aBoolean103 = true;
					this.aClass57_2.aByteBuffer1 = Static247.aByteBuffer15;
					this.aClass57_2.aClass113_1 = null;
					this.aClass57_2.anInt1745 = local1;
				}
				if (arg4) {
					this.aClass57_3.aBoolean103 = true;
					this.aClass57_3.aByteBuffer1 = Static247.aByteBuffer15;
					this.aClass57_3.aClass113_1 = null;
					this.aClass57_3.anInt1745 = local1;
				}
			}
		} else if (Static94.aBoolean135) {
			@Pc(1211) Class113 local1211 = new Class113();
			@Pc(1218) ByteBuffer local1218 = ByteBuffer.wrap(Static247.aClass4_Sub10_9.aByteArray71, 0, Static247.aClass4_Sub10_9.anInt5713);
			local1211.method2615(local1218);
			if (arg1) {
				this.aClass57_1.aBoolean103 = true;
				this.aClass57_1.aByteBuffer1 = null;
				this.aClass57_1.aClass113_1 = local1211;
				this.aClass57_1.anInt1745 = local1;
			}
			if (arg2) {
				this.aClass57_5.aBoolean103 = true;
				this.aClass57_5.aByteBuffer1 = null;
				this.aClass57_5.aClass113_1 = local1211;
				this.aClass57_5.anInt1745 = local1;
			}
			if (arg3) {
				this.aClass57_2.aBoolean103 = true;
				this.aClass57_2.aByteBuffer1 = null;
				this.aClass57_2.aClass113_1 = local1211;
				this.aClass57_2.anInt1745 = local1;
			}
			if (arg4) {
				this.aClass57_3.aBoolean103 = true;
				this.aClass57_3.aByteBuffer1 = null;
				this.aClass57_3.aClass113_1 = local1211;
				this.aClass57_3.anInt1745 = local1;
			}
		} else {
			local1007 = ByteBuffer.allocateDirect(Static247.aClass4_Sub10_9.anInt5713);
			local1007.put(Static247.aClass4_Sub10_9.aByteArray71, 0, Static247.aClass4_Sub10_9.anInt5713);
			local1007.flip();
			if (arg1) {
				this.aClass57_1.aBoolean103 = true;
				this.aClass57_1.aByteBuffer1 = local1007;
				this.aClass57_1.aClass113_1 = null;
				this.aClass57_1.anInt1745 = local1;
			}
			if (arg2) {
				this.aClass57_5.aBoolean103 = true;
				this.aClass57_5.aByteBuffer1 = local1007;
				this.aClass57_1.aClass113_1 = null;
				this.aClass57_5.anInt1745 = local1;
			}
			if (arg3) {
				this.aClass57_2.aBoolean103 = true;
				this.aClass57_2.aByteBuffer1 = local1007;
				this.aClass57_2.aClass113_1 = null;
				this.aClass57_2.anInt1745 = local1;
			}
			if (arg4) {
				this.aClass57_3.aBoolean103 = true;
				this.aClass57_3.aByteBuffer1 = local1007;
				this.aClass57_3.aClass113_1 = null;
				this.aClass57_3.anInt1745 = local1;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(ZZZ)Lclient!vg;")
	@Override
	public Class53_Sub4 method3870(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method3910(arg0, arg1, arg2, Static247.aClass53_Sub4_Sub2_6, Static247.aClass53_Sub4_Sub2_5);
	}

	@OriginalMember(owner = "client!s", name = "m", descriptor = "()I")
	@Override
	public int method3879() {
		if (!this.aClass15_1.aBoolean15) {
			this.method3902();
		}
		return this.aClass15_1.aShort2;
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "()V")
	@Override
	public void method3864() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4690; local1++) {
			@Pc(10) int local10 = this.anIntArray502[local1];
			this.anIntArray502[local1] = this.anIntArray507[local1];
			this.anIntArray507[local1] = -local10;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	@Override
	public void method3854(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class111.anIntArray299[arg0];
		@Pc(7) int local7 = Class111.anIntArray298[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4690; local9++) {
			@Pc(29) int local29 = this.anIntArray504[local9] * local3 + this.anIntArray507[local9] * local7 >> 16;
			this.anIntArray504[local9] = this.anIntArray504[local9] * local7 - this.anIntArray507[local9] * local3 >> 16;
			this.anIntArray507[local9] = local29;
		}
		this.aClass15_1.aBoolean15 = false;
		this.aClass57_1.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZZZZZ)V")
	public void method3909(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (this.aByte15 != 0) {
			throw new IllegalArgumentException();
		} else if (this.anInt4692 != 0) {
			if (arg5) {
				@Pc(26) boolean local26 = !this.aClass57_5.aBoolean103 && (arg1 || arg2 && !Static56.aBoolean66);
				this.method3907(false, !this.aClass57_1.aBoolean103 && arg0, local26, this.aClass57_2 != null && !this.aClass57_2.aBoolean103 && arg2, !this.aClass57_3.aBoolean103);
				if (!this.aClass57_4.aBoolean103 && arg3 && arg1) {
					this.method3888();
				}
			}
			if (arg0) {
				if (this.aClass57_1.aBoolean103) {
					if (!this.aClass15_1.aBoolean15) {
						this.method3902();
					}
					this.anIntArray507 = null;
					this.anIntArray504 = null;
					this.anIntArray502 = null;
					this.aShortArray93 = null;
					this.anIntArray506 = null;
				} else {
					this.aByte16 = (byte) (this.aByte16 | 0x1);
				}
			}
			if (arg1) {
				if (this.aClass57_5.aBoolean103) {
					this.aShortArray92 = null;
					this.aByteArray63 = null;
				} else {
					this.aByte16 = (byte) (this.aByte16 | 0x2);
				}
			}
			if (arg2 && Static56.aBoolean66) {
				if (this.aClass57_2.aBoolean103) {
					this.aShortArray95 = null;
					this.aShortArray90 = null;
					this.aShortArray87 = null;
					this.aShortArray89 = null;
				} else {
					this.aByte16 = (byte) (this.aByte16 | 0x4);
				}
			}
			if (this.aClass57_3.aBoolean103) {
				this.aFloatArray55 = null;
				this.aFloatArray54 = null;
			} else {
				this.aByte16 = (byte) (this.aByte16 | 0x8);
			}
			if (arg3 && arg1) {
				if (this.aClass57_4.aBoolean103 && this.aClass57_5.aBoolean103) {
					this.aShortArray94 = null;
					this.aShortArray97 = null;
					this.aShortArray98 = null;
				} else {
					this.aByte16 = (byte) (this.aByte16 | 0x10);
				}
			}
			if (arg4) {
				this.anIntArray503 = null;
				this.aByteArray62 = null;
				this.anIntArrayArray39 = null;
				this.anIntArrayArray40 = null;
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZ)Lclient!vg;")
	@Override
	public Class53_Sub4 method3868(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method3910(arg0, arg1, arg2, Static247.aClass53_Sub4_Sub2_2, Static247.aClass53_Sub4_Sub2_1);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZZLclient!s;Lclient!s;)Lclient!vg;")
	private Class53_Sub4 method3910(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class53_Sub4_Sub2 arg3, @OriginalArg(4) Class53_Sub4_Sub2 arg4) {
		arg3.anInt4690 = this.anInt4690;
		arg3.anInt4689 = this.anInt4689;
		arg3.anInt4692 = this.anInt4692;
		arg3.anInt4691 = this.anInt4691;
		arg3.aShort43 = this.aShort43;
		arg3.aShort44 = this.aShort44;
		arg3.aByte15 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
		if (arg3.anIntArray507 == null || arg3.anIntArray507.length < this.anInt4690) {
			arg3.anIntArray507 = new int[this.anInt4690 + 100];
			arg3.anIntArray504 = new int[this.anInt4690 + 100];
			arg3.anIntArray502 = new int[this.anInt4690 + 100];
		}
		@Pc(73) int local73;
		for (local73 = 0; local73 < this.anInt4690; local73++) {
			arg3.anIntArray507[local73] = this.anIntArray507[local73];
			arg3.anIntArray504[local73] = this.anIntArray504[local73];
			arg3.anIntArray502[local73] = this.anIntArray502[local73];
		}
		if (arg3.aClass57_1 == null) {
			arg3.aClass57_1 = new Class57();
		}
		arg3.aClass57_1.aBoolean103 = false;
		if (arg3.aClass15_1 == null) {
			arg3.aClass15_1 = new Class15();
		}
		arg3.aClass15_1.aBoolean15 = false;
		if (arg0) {
			arg3.aByteArray63 = this.aByteArray63;
		} else {
			if (arg4.aByteArray63 == null || arg4.aByteArray63.length < this.anInt4691) {
				arg4.aByteArray63 = new byte[this.anInt4691 + 100];
			}
			arg3.aByteArray63 = arg4.aByteArray63;
			for (local73 = 0; local73 < this.anInt4691; local73++) {
				arg3.aByteArray63[local73] = this.aByteArray63[local73];
			}
		}
		if (arg1) {
			arg3.aShortArray92 = this.aShortArray92;
		} else {
			if (arg4.aShortArray92 == null || arg4.aShortArray92.length < this.anInt4691) {
				arg4.aShortArray92 = new short[this.anInt4691 + 100];
			}
			arg3.aShortArray92 = arg4.aShortArray92;
			for (local73 = 0; local73 < this.anInt4691; local73++) {
				arg3.aShortArray92[local73] = this.aShortArray92[local73];
			}
		}
		if (arg0 && arg1) {
			arg3.aClass57_5 = this.aClass57_5;
		} else {
			if (arg4.aClass57_5 == null) {
				arg4.aClass57_5 = new Class57();
			}
			arg3.aClass57_5 = arg4.aClass57_5;
			arg3.aClass57_5.aBoolean103 = false;
		}
		if (arg2 || this.aShortArray95 == null) {
			arg3.aShortArray95 = this.aShortArray95;
			arg3.aShortArray90 = this.aShortArray90;
			arg3.aShortArray87 = this.aShortArray87;
			arg3.aShortArray89 = this.aShortArray89;
			arg3.aClass57_2 = this.aClass57_2;
		} else {
			if (arg4.aShortArray95 == null || arg4.aShortArray95.length < this.anInt4692) {
				arg4.aShortArray95 = new short[this.anInt4692 + 100];
				arg4.aShortArray90 = new short[this.anInt4692 + 100];
				arg4.aShortArray87 = new short[this.anInt4692 + 100];
				arg4.aShortArray89 = new short[this.anInt4692 + 100];
			}
			arg3.aShortArray95 = arg4.aShortArray95;
			arg3.aShortArray90 = arg4.aShortArray90;
			arg3.aShortArray87 = arg4.aShortArray87;
			arg3.aShortArray89 = arg4.aShortArray89;
			for (local73 = 0; local73 < this.anInt4692; local73++) {
				arg3.aShortArray95[local73] = this.aShortArray95[local73];
				arg3.aShortArray90[local73] = this.aShortArray90[local73];
				arg3.aShortArray87[local73] = this.aShortArray87[local73];
				arg3.aShortArray89[local73] = this.aShortArray89[local73];
			}
			if (Static56.aBoolean66) {
				if (arg4.aClass57_2 == null) {
					arg4.aClass57_2 = new Class57();
				}
				arg3.aClass57_2 = arg4.aClass57_2;
				arg3.aClass57_2.aBoolean103 = false;
			} else {
				arg3.aClass57_2 = null;
			}
		}
		arg3.aFloatArray55 = this.aFloatArray55;
		arg3.aFloatArray54 = this.aFloatArray54;
		arg3.anIntArray503 = this.anIntArray503;
		arg3.anIntArrayArray39 = this.anIntArrayArray39;
		arg3.aShortArray94 = this.aShortArray94;
		arg3.aShortArray97 = this.aShortArray97;
		arg3.aShortArray98 = this.aShortArray98;
		arg3.aShortArray91 = this.aShortArray91;
		arg3.aByteArray62 = this.aByteArray62;
		arg3.anIntArrayArray40 = this.anIntArrayArray40;
		arg3.aClass57_3 = this.aClass57_3;
		arg3.aClass57_4 = this.aClass57_4;
		arg3.anIntArray505 = this.anIntArray505;
		arg3.aShortArray93 = this.aShortArray93;
		arg3.anIntArray506 = this.anIntArray506;
		arg3.aBoolean325 = this.aBoolean325;
		arg3.aShortArray96 = this.aShortArray96;
		arg3.aShortArray88 = this.aShortArray88;
		arg3.aClass161Array3 = this.aClass161Array3;
		arg3.aClass170Array3 = this.aClass170Array3;
		return arg3;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method3871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static247.anInt4693 = 0;
			Static247.anInt4694 = 0;
			Static247.anInt4695 = 0;
			for (local11 = 0; local11 < this.anInt4690; local11++) {
				Static247.anInt4693 += this.anIntArray507[local11];
				Static247.anInt4694 += this.anIntArray504[local11];
				Static247.anInt4695 += this.anIntArray502[local11];
				local3++;
			}
			if (local3 > 0) {
				Static247.anInt4693 = Static247.anInt4693 / local3 + arg1;
				Static247.anInt4694 = Static247.anInt4694 / local3 + arg2;
				Static247.anInt4695 = Static247.anInt4695 / local3 + arg3;
			} else {
				Static247.anInt4693 = arg1;
				Static247.anInt4694 = arg2;
				Static247.anInt4695 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt4690; local3++) {
				this.anIntArray507[local3] += arg1;
				this.anIntArray504[local3] += arg2;
				this.anIntArray502[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt4690; local3++) {
					this.anIntArray507[local3] -= Static247.anInt4693;
					this.anIntArray504[local3] -= Static247.anInt4694;
					this.anIntArray502[local3] -= Static247.anInt4695;
					if (arg3 != 0) {
						local11 = Class111.anIntArray299[arg3];
						local146 = Class111.anIntArray298[arg3];
						local164 = this.anIntArray504[local3] * local11 + this.anIntArray507[local3] * local146 + 32767 >> 16;
						this.anIntArray504[local3] = this.anIntArray504[local3] * local146 + 32767 - this.anIntArray507[local3] * local11 >> 16;
						this.anIntArray507[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class111.anIntArray299[arg1];
						local146 = Class111.anIntArray298[arg1];
						local164 = this.anIntArray504[local3] * local146 + 32767 - this.anIntArray502[local3] * local11 >> 16;
						this.anIntArray502[local3] = this.anIntArray504[local3] * local11 + this.anIntArray502[local3] * local146 + 32767 >> 16;
						this.anIntArray504[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class111.anIntArray299[arg2];
						local146 = Class111.anIntArray298[arg2];
						local164 = this.anIntArray502[local3] * local11 + this.anIntArray507[local3] * local146 + 32767 >> 16;
						this.anIntArray502[local3] = this.anIntArray502[local3] * local146 + 32767 - this.anIntArray507[local3] * local11 >> 16;
						this.anIntArray507[local3] = local164;
					}
					this.anIntArray507[local3] += Static247.anInt4693;
					this.anIntArray504[local3] += Static247.anInt4694;
					this.anIntArray502[local3] += Static247.anInt4695;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt4690; local3++) {
					this.anIntArray507[local3] -= Static247.anInt4693;
					this.anIntArray504[local3] -= Static247.anInt4694;
					this.anIntArray502[local3] -= Static247.anInt4695;
					this.anIntArray507[local3] = this.anIntArray507[local3] * arg1 / 128;
					this.anIntArray504[local3] = this.anIntArray504[local3] * arg2 / 128;
					this.anIntArray502[local3] = this.anIntArray502[local3] * arg3 / 128;
					this.anIntArray507[local3] += Static247.anInt4693;
					this.anIntArray504[local3] += Static247.anInt4694;
					this.anIntArray502[local3] += Static247.anInt4695;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt4691; local3++) {
					local11 = (this.aByteArray63[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray63[local3] = (byte) local11;
				}
				this.aClass57_5.aBoolean103 = false;
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt4691; local3++) {
					local11 = this.aShortArray92[local3] & 0xFFFF;
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
					this.aShortArray92[local3] = (short) (local502 << 10 | local164 << 7 | local496);
				}
				this.aClass57_5.aBoolean103 = false;
			}
		}
	}
}
