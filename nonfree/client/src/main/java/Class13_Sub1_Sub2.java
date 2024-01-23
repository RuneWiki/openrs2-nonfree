import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class13_Sub1_Sub2 extends Class13_Sub1 {

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "[F")
	private float[] aFloatArray19;

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "[I")
	private int[] anIntArray285;

	@OriginalMember(owner = "client!mn", name = "s", descriptor = "S")
	private short aShort27;

	@OriginalMember(owner = "client!mn", name = "t", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!mn", name = "v", descriptor = "[I")
	public int[] anIntArray286;

	@OriginalMember(owner = "client!mn", name = "x", descriptor = "Lclient!ml;")
	private Class110 aClass110_1;

	@OriginalMember(owner = "client!mn", name = "y", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!mn", name = "z", descriptor = "Lclient!ml;")
	private Class110 aClass110_2;

	@OriginalMember(owner = "client!mn", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!mn", name = "C", descriptor = "[I")
	private int[] anIntArray287;

	@OriginalMember(owner = "client!mn", name = "D", descriptor = "[I")
	private int[] anIntArray288;

	@OriginalMember(owner = "client!mn", name = "E", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!mn", name = "F", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!mn", name = "G", descriptor = "Lclient!ml;")
	public Class110 aClass110_3;

	@OriginalMember(owner = "client!mn", name = "H", descriptor = "[Lclient!kd;")
	public Class88[] aClass88Array2;

	@OriginalMember(owner = "client!mn", name = "I", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!mn", name = "J", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!mn", name = "K", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!mn", name = "L", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!mn", name = "O", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!mn", name = "P", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!mn", name = "Q", descriptor = "[F")
	private float[] aFloatArray20;

	@OriginalMember(owner = "client!mn", name = "S", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!mn", name = "T", descriptor = "Lclient!si;")
	public Class157 aClass157_1;

	@OriginalMember(owner = "client!mn", name = "U", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!mn", name = "V", descriptor = "[I")
	public int[] anIntArray289;

	@OriginalMember(owner = "client!mn", name = "X", descriptor = "Lclient!ml;")
	private Class110 aClass110_4;

	@OriginalMember(owner = "client!mn", name = "Z", descriptor = "Lclient!me;")
	private Class107 aClass107_5;

	@OriginalMember(owner = "client!mn", name = "ab", descriptor = "Lclient!ml;")
	private Class110 aClass110_5;

	@OriginalMember(owner = "client!mn", name = "bb", descriptor = "[Lclient!go;")
	public Class62[] aClass62Array2;

	@OriginalMember(owner = "client!mn", name = "cb", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!mn", name = "eb", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!mn", name = "fb", descriptor = "Lclient!rf;")
	private Class147 aClass147_1;

	@OriginalMember(owner = "client!mn", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!mn", name = "ib", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!mn", name = "A", descriptor = "B")
	private byte aByte11 = 0;

	@OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
	private int anInt3452 = 0;

	@OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
	public int anInt3451 = 0;

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
	private int anInt3450 = 0;

	@OriginalMember(owner = "client!mn", name = "W", descriptor = "I")
	private int anInt3453 = 0;

	@OriginalMember(owner = "client!mn", name = "R", descriptor = "B")
	private byte aByte12 = 0;

	@OriginalMember(owner = "client!mn", name = "Y", descriptor = "Z")
	public boolean aBoolean224 = false;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class13_Sub1_Sub2() {
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!ud;IIZ)V")
	public Class13_Sub1_Sub2(@OriginalArg(0) Class13_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(26) int[] local26 = new int[arg0.anInt5390];
		this.anIntArray285 = new int[arg0.anInt5391 + 1];
		for (@Pc(35) int local35 = 0; local35 < arg0.anInt5390; local35++) {
			if ((arg0.aByteArray70 == null || arg0.aByteArray70[local35] != 2) && (arg0.aShortArray89 == null || arg0.aShortArray89[local35] == -1 || !Static283.anInterface1_1.method2430(arg0.aShortArray89[local35] & 0xFFFF))) {
				local26[this.anInt3452++] = local35;
				this.anIntArray285[arg0.anIntArray432[local35]]++;
				this.anIntArray285[arg0.anIntArray424[local35]]++;
				this.anIntArray285[arg0.anIntArray426[local35]]++;
			}
		}
		@Pc(118) long[] local118 = new long[this.anInt3452];
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(130) int local130;
		@Pc(229) int local229;
		for (local120 = 0; local120 < this.anInt3452; local120++) {
			local128 = local26[local120];
			local130 = 0;
			@Pc(132) byte local132 = 0;
			@Pc(134) int local134 = 0;
			@Pc(136) int local136 = 0;
			@Pc(138) short local138 = -1;
			if (arg0.aShortArray89 != null) {
				local138 = arg0.aShortArray89[local128];
				if (local138 != -1) {
					local134 = Static283.anInterface1_1.method2427(local138 & 0xFFFF);
					local136 = Static283.anInterface1_1.method2437(local138 & 0xFFFF);
				}
			}
			@Pc(185) boolean local185 = arg0.aByteArray66 != null && arg0.aByteArray66[local128] != 0 || local138 != -1 && !Static283.anInterface1_1.method2426(local138 & 0xFFFF);
			if ((arg3 || local185) && arg0.aByteArray65 != null) {
				local130 += arg0.aByteArray65[local128] << 17;
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
		Static307.method4711(local26, local118);
		this.anInt3451 = arg0.anInt5391;
		this.anInt3450 = arg0.anInt5389;
		this.anIntArray289 = arg0.anIntArray433;
		this.anIntArray286 = arg0.anIntArray434;
		this.anIntArray290 = arg0.anIntArray430;
		this.anIntArray287 = arg0.anIntArray423;
		this.aShortArray60 = arg0.aShortArray92;
		this.aClass62Array2 = arg0.aClass62Array3;
		this.aClass88Array2 = arg0.aClass88Array3;
		local120 = this.anInt3452 * 3;
		this.aShortArray63 = new short[local120];
		this.aShortArray65 = new short[local120];
		this.aShortArray64 = new short[local120];
		this.aShortArray67 = new short[local120];
		this.aFloatArray20 = new float[local120];
		this.aFloatArray19 = new float[local120];
		this.aShortArray61 = new short[this.anInt3452];
		this.aByteArray44 = new byte[this.anInt3452];
		this.aShortArray62 = new short[this.anInt3452];
		this.aShortArray59 = new short[this.anInt3452];
		this.aShortArray57 = new short[this.anInt3452];
		this.aShortArray58 = new short[this.anInt3452];
		if (arg0.anIntArray428 != null) {
			this.aByteArray45 = new byte[this.anInt3452];
		}
		if (arg0.aShortArray87 != null) {
			this.aShortArray56 = new short[this.anInt3452];
		}
		this.aClass157_1 = new Class157();
		this.aClass110_3 = new Class110();
		this.aClass110_1 = new Class110();
		if (Static253.aBoolean335) {
			this.aClass110_4 = new Class110();
		}
		this.aClass110_2 = new Class110();
		this.aClass110_5 = new Class110();
		this.aShort27 = (short) arg1;
		this.aShort28 = (short) arg2;
		this.aShortArray66 = new short[local120];
		Static172.aLongArray6 = new long[local120];
		local128 = 0;
		for (local130 = 0; local130 < this.anInt3450; local130++) {
			local229 = this.anIntArray285[local130];
			this.anIntArray285[local130] = local128;
			local128 += local229;
		}
		this.anIntArray285[this.anInt3450] = local128;
		@Pc(441) int[] local441 = null;
		@Pc(443) int[] local443 = null;
		@Pc(445) int[] local445 = null;
		@Pc(448) float[][] local448 = null;
		@Pc(568) int local568;
		@Pc(454) int local454;
		@Pc(698) float local698;
		@Pc(729) float local729;
		@Pc(700) float local700;
		if (arg0.aByteArray68 != null) {
			local454 = arg0.anInt5392;
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
			for (local474 = 0; local474 < this.anInt3452; local474++) {
				@Pc(513) int local513 = local26[local474];
				if (arg0.aByteArray68[local513] != -1) {
					@Pc(526) int local526 = arg0.aByteArray68[local513] & 0xFF;
					for (@Pc(528) int local528 = 0; local528 < 3; local528++) {
						@Pc(538) int local538;
						if (local528 == 0) {
							local538 = arg0.anIntArray432[local513];
						} else if (local528 == 1) {
							local538 = arg0.anIntArray424[local513];
						} else {
							local538 = arg0.anIntArray426[local513];
						}
						@Pc(558) int local558 = arg0.anIntArray433[local538];
						@Pc(563) int local563 = arg0.anIntArray434[local538];
						local568 = arg0.anIntArray430[local538];
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
				@Pc(648) byte local648 = arg0.aByteArray67[local474];
				if (local648 > 0) {
					local441[local474] = (local457[local474] + local460[local474]) / 2;
					local443[local474] = (local463[local474] + local466[local474]) / 2;
					local445[local474] = (local469[local474] + local472[local474]) / 2;
					if (local648 == 1) {
						@Pc(694) short local694 = arg0.aShortArray90[local474];
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
						local729 = 64.0F / (float) (arg0.aShortArray85[local474] & 0xFFFF);
					} else if (local648 == 2) {
						local698 = 64.0F / (float) (arg0.aShortArray90[local474] & 0xFFFF);
						local729 = 64.0F / (float) (arg0.aShortArray85[local474] & 0xFFFF);
						local700 = 64.0F / (float) (arg0.aShortArray88[local474] & 0xFFFF);
					} else {
						local698 = (float) arg0.aShortArray90[local474] / 1024.0F;
						local729 = (float) arg0.aShortArray85[local474] / 1024.0F;
						local700 = (float) arg0.aShortArray88[local474] / 1024.0F;
					}
					local448[local474] = Static172.method2780(arg0.aShortArray86[local474], arg0.aShortArray83[local474], arg0.aShortArray84[local474], arg0.aByteArray69[local474] & 0xFF, local698, local729, local700);
				}
			}
		}
		@Pc(832) int local832;
		@Pc(837) short local837;
		for (local454 = 0; local454 < this.anInt3452; local454++) {
			@Pc(825) int local825 = local26[local454];
			local832 = arg0.aShortArray91[local825] & 0xFFFF;
			if (arg0.aShortArray89 == null) {
				local837 = -1;
			} else {
				local837 = arg0.aShortArray89[local825];
			}
			@Pc(848) int local848;
			if (arg0.aByteArray68 == null) {
				local848 = -1;
			} else {
				local848 = arg0.aByteArray68[local825];
			}
			@Pc(859) int local859;
			if (arg0.aByteArray66 == null) {
				local859 = 0;
			} else {
				local859 = arg0.aByteArray66[local825] & 0xFF;
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
					local917 = arg0.aByteArray67[local848];
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
						local924 = arg0.anIntArray432[local825];
						local929 = arg0.anIntArray424[local825];
						local934 = arg0.anIntArray426[local825];
						@Pc(939) short local939 = arg0.aShortArray86[local848];
						@Pc(944) short local944 = arg0.aShortArray83[local848];
						@Pc(949) short local949 = arg0.aShortArray84[local848];
						@Pc(955) float local955 = (float) arg0.anIntArray433[local939];
						@Pc(961) float local961 = (float) arg0.anIntArray434[local939];
						local967 = arg0.anIntArray430[local939];
						local975 = (float) arg0.anIntArray433[local944] - local955;
						local983 = (float) arg0.anIntArray434[local944] - local961;
						@Pc(991) float local991 = (float) arg0.anIntArray430[local944] - local967;
						@Pc(999) float local999 = (float) arg0.anIntArray433[local949] - local955;
						@Pc(1007) float local1007 = (float) arg0.anIntArray434[local949] - local961;
						@Pc(1015) float local1015 = (float) arg0.anIntArray430[local949] - local967;
						@Pc(1023) float local1023 = (float) arg0.anIntArray433[local924] - local955;
						@Pc(1031) float local1031 = (float) arg0.anIntArray434[local924] - local961;
						@Pc(1039) float local1039 = (float) arg0.anIntArray430[local924] - local967;
						@Pc(1047) float local1047 = (float) arg0.anIntArray433[local929] - local955;
						@Pc(1055) float local1055 = (float) arg0.anIntArray434[local929] - local961;
						local1063 = (float) arg0.anIntArray430[local929] - local967;
						local1071 = (float) arg0.anIntArray433[local934] - local955;
						local1079 = (float) arg0.anIntArray434[local934] - local961;
						local1087 = (float) arg0.anIntArray430[local934] - local967;
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
						local924 = arg0.anIntArray432[local825];
						local929 = arg0.anIntArray424[local825];
						local934 = arg0.anIntArray426[local825];
						@Pc(1291) int local1291 = local441[local848];
						local1295 = local443[local848];
						@Pc(1299) int local1299 = local445[local848];
						@Pc(1303) float[] local1303 = local448[local848];
						@Pc(1308) byte local1308 = arg0.aByteArray64[local848];
						local967 = (float) arg0.aByteArray62[local848] / 256.0F;
						if (local917 == 1) {
							local975 = (float) (arg0.aShortArray88[local848] & 0xFFFF) / 1024.0F;
							Static172.method2758(arg0.anIntArray433[local924], arg0.anIntArray434[local924], arg0.anIntArray430[local924], local1291, local1295, local1299, local1303, local975, local1308, local967);
							local869 = Static172.aFloat98;
							local871 = Static172.aFloat96;
							Static172.method2758(arg0.anIntArray433[local929], arg0.anIntArray434[local929], arg0.anIntArray430[local929], local1291, local1295, local1299, local1303, local975, local1308, local967);
							local873 = Static172.aFloat98;
							local698 = Static172.aFloat96;
							Static172.method2758(arg0.anIntArray433[local934], arg0.anIntArray434[local934], arg0.anIntArray430[local934], local1291, local1295, local1299, local1303, local975, local1308, local967);
							local729 = Static172.aFloat98;
							local700 = Static172.aFloat96;
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
							local975 = (float) arg0.aByteArray71[local848] / 256.0F;
							local983 = (float) arg0.aByteArray63[local848] / 256.0F;
							@Pc(1540) int local1540 = arg0.anIntArray433[local929] - arg0.anIntArray433[local924];
							@Pc(1550) int local1550 = arg0.anIntArray434[local929] - arg0.anIntArray434[local924];
							@Pc(1560) int local1560 = arg0.anIntArray430[local929] - arg0.anIntArray430[local924];
							@Pc(1570) int local1570 = arg0.anIntArray433[local934] - arg0.anIntArray433[local924];
							@Pc(1580) int local1580 = arg0.anIntArray434[local934] - arg0.anIntArray434[local924];
							@Pc(1590) int local1590 = arg0.anIntArray430[local934] - arg0.anIntArray430[local924];
							@Pc(1598) int local1598 = local1550 * local1590 - local1580 * local1560;
							@Pc(1606) int local1606 = local1560 * local1570 - local1590 * local1540;
							@Pc(1614) int local1614 = local1540 * local1580 - local1570 * local1550;
							local1063 = 64.0F / (float) (arg0.aShortArray90[local848] & 0xFFFF);
							local1071 = 64.0F / (float) (arg0.aShortArray85[local848] & 0xFFFF);
							local1079 = 64.0F / (float) (arg0.aShortArray88[local848] & 0xFFFF);
							local1087 = ((float) local1598 * local1303[0] + (float) local1606 * local1303[1] + (float) local1614 * local1303[2]) / local1063;
							local1095 = ((float) local1598 * local1303[3] + (float) local1606 * local1303[4] + (float) local1614 * local1303[5]) / local1071;
							local1103 = ((float) local1598 * local1303[6] + (float) local1606 * local1303[7] + (float) local1614 * local1303[8]) / local1079;
							local568 = Static172.method2766(local1087, local1095, local1103);
							Static172.method2779(arg0.anIntArray433[local924], arg0.anIntArray434[local924], arg0.anIntArray430[local924], local1291, local1295, local1299, local568, local1303, local1308, local967, local975, local983);
							local869 = Static172.aFloat99;
							local871 = Static172.aFloat101;
							Static172.method2779(arg0.anIntArray433[local929], arg0.anIntArray434[local929], arg0.anIntArray430[local929], local1291, local1295, local1299, local568, local1303, local1308, local967, local975, local983);
							local873 = Static172.aFloat99;
							local698 = Static172.aFloat101;
							Static172.method2779(arg0.anIntArray433[local934], arg0.anIntArray434[local934], arg0.anIntArray430[local934], local1291, local1295, local1299, local568, local1303, local1308, local967, local975, local983);
							local729 = Static172.aFloat99;
							local700 = Static172.aFloat101;
						} else if (local917 == 3) {
							Static172.method2789(arg0.anIntArray433[local924], arg0.anIntArray434[local924], arg0.anIntArray430[local924], local1291, local1295, local1299, local1303, local1308, local967);
							local869 = Static172.aFloat97;
							local871 = Static172.aFloat100;
							Static172.method2789(arg0.anIntArray433[local929], arg0.anIntArray434[local929], arg0.anIntArray430[local929], local1291, local1295, local1299, local1303, local1308, local967);
							local873 = Static172.aFloat97;
							local698 = Static172.aFloat100;
							Static172.method2789(arg0.anIntArray433[local934], arg0.anIntArray434[local934], arg0.anIntArray430[local934], local1291, local1295, local1299, local1303, local1308, local967);
							local729 = Static172.aFloat97;
							local700 = Static172.aFloat100;
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
			arg0.method4290();
			if (arg0.aByteArray70 == null) {
				local917 = 0;
			} else {
				local917 = arg0.aByteArray70[local825];
			}
			if (local917 == 0) {
				@Pc(2009) long local2009 = (long) (local848 << 2) + ((long) (local568 << 24) + (long) (local832 << 8) + (long) local859 << 32);
				local934 = arg0.anIntArray432[local825];
				@Pc(2019) Class8 local2019 = arg0.aClass8Array2[local934];
				this.aShortArray62[local454] = this.method2786(arg0, local934, local2009, local2019.anInt154, local2019.anInt153, local2019.anInt151, local2019.anInt150, local869, local871);
				local1295 = arg0.anIntArray424[local825];
				@Pc(2048) Class8 local2048 = arg0.aClass8Array2[local1295];
				this.aShortArray59[local454] = this.method2786(arg0, local1295, local2009 + (long) local881, local2048.anInt154, local2048.anInt153, local2048.anInt151, local2048.anInt150, local873, local698);
				@Pc(2075) int local2075 = arg0.anIntArray426[local825];
				@Pc(2080) Class8 local2080 = arg0.aClass8Array2[local2075];
				this.aShortArray57[local454] = this.method2786(arg0, local2075, local2009 + (long) local883, local2080.anInt154, local2080.anInt153, local2080.anInt151, local2080.anInt150, local729, local700);
			} else if (local917 == 1) {
				@Pc(2111) Class81 local2111 = arg0.aClass81Array1[local825];
				@Pc(2152) long local2152 = (long) ((local848 << 2) + (local2111.anInt2514 > 0 ? 1024 : 2048) + (local2111.anInt2517 + 256 << 12) + (local2111.anInt2516 + 256 << 22)) + ((long) (local568 << 24) + (long) (local832 << 8) + (long) local859 << 32);
				this.aShortArray62[local454] = this.method2786(arg0, arg0.anIntArray432[local825], local2152, local2111.anInt2514, local2111.anInt2517, local2111.anInt2516, 0, local869, local871);
				this.aShortArray59[local454] = this.method2786(arg0, arg0.anIntArray424[local825], local2152 + (long) local881, local2111.anInt2514, local2111.anInt2517, local2111.anInt2516, 0, local873, local698);
				this.aShortArray57[local454] = this.method2786(arg0, arg0.anIntArray426[local825], local2152 + (long) local883, local2111.anInt2514, local2111.anInt2517, local2111.anInt2516, 0, local729, local700);
			}
			if (arg0.aShortArray89 == null) {
				this.aShortArray58[local454] = -1;
			} else {
				this.aShortArray58[local454] = arg0.aShortArray89[local825];
			}
			if (this.aByteArray45 != null) {
				this.aByteArray45[local454] = (byte) arg0.anIntArray428[local825];
			}
			this.aShortArray61[local454] = arg0.aShortArray91[local825];
			if (arg0.aByteArray66 != null) {
				this.aByteArray44[local454] = arg0.aByteArray66[local825];
			}
			if (arg0.aShortArray87 != null) {
				this.aShortArray56[local454] = arg0.aShortArray87[local825];
			}
		}
		local454 = 0;
		@Pc(2286) short local2286 = -10000;
		for (local832 = 0; local832 < this.anInt3452; local832++) {
			local837 = this.aShortArray58[local832];
			if (local837 != local2286) {
				local454++;
				local2286 = local837;
			}
		}
		this.anIntArray288 = new int[local454 + 1];
		local454 = 0;
		local2286 = -10000;
		for (local832 = 0; local832 < this.anInt3452; local832++) {
			local837 = this.aShortArray58[local832];
			if (local837 != local2286) {
				this.anIntArray288[local454++] = local832;
				local2286 = local837;
			}
		}
		this.anIntArray288[local454] = this.anInt3452;
		Static172.aLongArray6 = null;
		this.aShortArray63 = Static172.method2772(this.aShortArray63, this.anInt3453);
		this.aShortArray65 = Static172.method2772(this.aShortArray65, this.anInt3453);
		this.aShortArray64 = Static172.method2772(this.aShortArray64, this.anInt3453);
		this.aShortArray67 = Static172.method2772(this.aShortArray67, this.anInt3453);
		this.aFloatArray20 = Static172.method2765(this.aFloatArray20, this.anInt3453);
		this.aFloatArray19 = Static172.method2765(this.aFloatArray19, this.anInt3453);
	}

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "()I")
	@Override
	public int method2755() {
		if (!this.aClass157_1.aBoolean334) {
			this.method2763();
		}
		return this.aClass157_1.aShort36;
	}

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "()I")
	@Override
	public int method2741() {
		if (!this.aClass157_1.aBoolean334) {
			this.method2763();
		}
		return this.aClass157_1.aShort35;
	}

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "(I)V")
	public void method2759() {
		if (this.aShortArray63 == null) {
			this.method2735(256);
			return;
		}
		@Pc(10) int local10 = Class174.anIntArray444[256];
		@Pc(14) int local14 = Class174.anIntArray443[256];
		@Pc(16) int local16;
		@Pc(36) int local36;
		for (local16 = 0; local16 < this.anInt3451; local16++) {
			local36 = this.anIntArray290[local16] * local10 + this.anIntArray289[local16] * local14 >> 16;
			this.anIntArray290[local16] = this.anIntArray290[local16] * local14 - this.anIntArray289[local16] * local10 >> 16;
			this.anIntArray289[local16] = local36;
		}
		for (local16 = 0; local16 < this.anInt3453; local16++) {
			local36 = this.aShortArray64[local16] * local10 + this.aShortArray63[local16] * local14 >> 16;
			this.aShortArray64[local16] = (short) (this.aShortArray64[local16] * local14 - this.aShortArray63[local16] * local10 >> 16);
			this.aShortArray63[local16] = (short) local36;
		}
		this.aClass157_1.aBoolean334 = false;
		this.aClass110_3.aBoolean220 = false;
		if (this.aClass110_4 != null) {
			this.aClass110_4.aBoolean220 = false;
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(III)V")
	@Override
	public void method2744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3451; local1++) {
			this.anIntArray289[local1] = this.anIntArray289[local1] * arg0 >> 7;
			this.anIntArray286[local1] = this.anIntArray286[local1] * arg1 >> 7;
			this.anIntArray290[local1] = this.anIntArray290[local1] * arg2 >> 7;
		}
		this.aClass157_1.aBoolean334 = false;
		this.aClass110_3.aBoolean220 = false;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method2760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "()V")
	public void method2761() {
		if (this.aShortArray63 == null) {
			this.method2745();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt3451; local7++) {
			@Pc(16) int local16 = this.anIntArray289[local7];
			this.anIntArray289[local7] = this.anIntArray290[local7];
			this.anIntArray290[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt3453; local7++) {
			@Pc(43) short local43 = this.aShortArray63[local7];
			this.aShortArray63[local7] = this.aShortArray64[local7];
			this.aShortArray64[local7] = (short) -local43;
		}
		this.aClass157_1.aBoolean334 = false;
		this.aClass110_3.aBoolean220 = false;
		if (this.aClass110_4 != null) {
			this.aClass110_4.aBoolean220 = false;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIIIIIJILclient!il;)V")
	@Override
	public void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class21_Sub1 arg10) {
		if (this.anInt3453 == 0) {
			return;
		}
		if (!this.aClass157_1.aBoolean334) {
			this.method2763();
		}
		@Pc(13) short local13 = this.aClass157_1.aShort32;
		@Pc(17) short local17 = this.aClass157_1.aShort31;
		@Pc(21) short local21 = this.aClass157_1.aShort30;
		if (arg10 != null) {
			arg10.method1990(arg0, arg9, arg5, arg6, arg7);
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
		if (local99 / local62 <= Static190.anInt3867) {
			return;
		}
		@Pc(111) int local111 = local93 - local13 << 9;
		if (local111 / local62 >= Static60.anInt1354) {
			return;
		}
		@Pc(127) int local127 = arg6 * arg2 - local40 * arg1 >> 16;
		@Pc(141) int local141 = local127 + (local13 * arg1 + local21 * arg2 >> 16) << 9;
		if (local141 / local62 <= Static244.anInt4816) {
			return;
		}
		@Pc(162) int local162 = local127 + (-local13 * arg1 + local17 * arg2 >> 16) << 9;
		if (local162 / local62 >= Static157.anInt314) {
			return;
		}
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		if (arg0 != 0) {
			local170 = Class174.anIntArray444[arg0];
			local172 = Class174.anIntArray443[arg0];
		}
		if (arg8 > 0L && Static287.aBoolean384 && local79 > 0) {
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
			if (Static177.anInt3590 >= local196 && Static177.anInt3590 <= local200 && Static223.anInt4478 >= local215 && Static223.anInt4478 <= local219) {
				local196 = 999999;
				local200 = -999999;
				local215 = 999999;
				local219 = -999999;
				@Pc(252) short local252 = this.aClass157_1.aShort35;
				@Pc(256) short local256 = this.aClass157_1.aShort33;
				@Pc(260) short local260 = this.aClass157_1.aShort36;
				@Pc(264) short local264 = this.aClass157_1.aShort34;
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
				if (Static177.anInt3590 >= local196 && Static177.anInt3590 <= local200 && Static223.anInt4478 >= local215 && Static223.anInt4478 <= local219) {
					if (this.aBoolean223) {
						Static4.aLongArray1[Static242.anInt4774++] = arg8;
					} else {
						if (Static172.anIntArray292.length < this.anInt3453) {
							Static172.anIntArray292 = new int[this.anInt3453];
							Static172.anIntArray291 = new int[this.anInt3453];
						}
						local371 = 0;
						label124: while (true) {
							if (local371 >= this.anInt3450) {
								local371 = 0;
								while (true) {
									if (local371 >= this.anInt3452) {
										break label124;
									}
									@Pc(707) short local707 = this.aShortArray62[local371];
									@Pc(712) short local712 = this.aShortArray59[local371];
									@Pc(717) short local717 = this.aShortArray57[local371];
									if (this.method2760(Static177.anInt3590, Static223.anInt4478, Static172.anIntArray291[local707], Static172.anIntArray291[local712], Static172.anIntArray291[local717], Static172.anIntArray292[local707], Static172.anIntArray292[local712], Static172.anIntArray292[local717])) {
										Static4.aLongArray1[Static242.anInt4774++] = arg8;
										break label124;
									}
									local371++;
								}
							}
							local378 = this.anIntArray289[local371];
							local382 = this.anIntArray286[local371];
							local386 = this.anIntArray290[local371];
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
							@Pc(661) int local661 = this.anIntArray285[local371];
							@Pc(668) int local668 = this.anIntArray285[local371 + 1];
							for (@Pc(670) int local670 = local661; local670 < local668; local670++) {
								@Pc(680) int local680 = this.aShortArray66[local670] - 1;
								if (local680 == -1) {
									break;
								}
								Static172.anIntArray292[local680] = local474;
								Static172.anIntArray291[local680] = local480;
							}
							local371++;
						}
					}
				}
			}
		}
		@Pc(753) GL local753 = Static251.aGL1;
		local753.glPushMatrix();
		local753.glTranslatef((float) arg5, (float) arg6, (float) arg7);
		local753.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
		this.method2777();
		local753.glPopMatrix();
		if (arg10 != null) {
			arg10.method1984(arg0, arg1, arg2, arg3, arg4, arg9, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "()I")
	@Override
	public int method2742() {
		if (!this.aClass157_1.aBoolean334) {
			this.method2763();
		}
		return this.aClass157_1.aShort34;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void method2752(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			Static172.anInt3455 = 0;
			Static172.anInt3454 = 0;
			Static172.anInt3456 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray21.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray21[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local53]) != 0) {
							Static172.anInt3455 += this.anIntArray289[local53];
							Static172.anInt3454 += this.anIntArray286[local53];
							Static172.anInt3456 += this.anIntArray290[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				Static172.anInt3455 = Static172.anInt3455 / local18 + arg2;
				Static172.anInt3454 = Static172.anInt3454 / local18 + arg3;
				Static172.anInt3456 = Static172.anInt3456 / local18 + arg4;
				Static172.aBoolean225 = true;
			} else {
				Static172.anInt3455 = arg2;
				Static172.anInt3454 = arg3;
				Static172.anInt3456 = arg4;
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
				if (local26 < this.anIntArrayArray21.length) {
					local228 = this.anIntArrayArray21[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local45]) != 0) {
							this.anIntArray289[local45] += arg2;
							this.anIntArray286[local45] += arg3;
							this.anIntArray290[local45] += arg4;
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
					if (local26 < this.anIntArrayArray21.length) {
						local228 = this.anIntArrayArray21[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local45]) != 0) {
								this.anIntArray289[local45] -= Static172.anInt3455;
								this.anIntArray286[local45] -= Static172.anInt3454;
								this.anIntArray290[local45] -= Static172.anInt3456;
								if (arg4 != 0) {
									local53 = Class174.anIntArray444[arg4];
									local343 = Class174.anIntArray443[arg4];
									local365 = this.anIntArray286[local45] * local53 + this.anIntArray289[local45] * local343 + 32767 >> 16;
									this.anIntArray286[local45] = this.anIntArray286[local45] * local343 + 32767 - this.anIntArray289[local45] * local53 >> 16;
									this.anIntArray289[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class174.anIntArray444[arg2];
									local343 = Class174.anIntArray443[arg2];
									local365 = this.anIntArray286[local45] * local343 + 32767 - this.anIntArray290[local45] * local53 >> 16;
									this.anIntArray290[local45] = this.anIntArray286[local45] * local53 + this.anIntArray290[local45] * local343 + 32767 >> 16;
									this.anIntArray286[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class174.anIntArray444[arg3];
									local343 = Class174.anIntArray443[arg3];
									local365 = this.anIntArray290[local45] * local53 + this.anIntArray289[local45] * local343 + 32767 >> 16;
									this.anIntArray290[local45] = this.anIntArray290[local45] * local343 + 32767 - this.anIntArray289[local45] * local53 >> 16;
									this.anIntArray289[local45] = local365;
								}
								this.anIntArray289[local45] += Static172.anInt3455;
								this.anIntArray286[local45] += Static172.anInt3454;
								this.anIntArray290[local45] += Static172.anInt3456;
							}
						}
					}
				}
				if (arg5 && this.aShortArray63 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray21.length) {
							local228 = this.anIntArrayArray21[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local45]) != 0) {
									local53 = this.anIntArray285[local45];
									local343 = this.anIntArray285[local45 + 1];
									for (local365 = local53; local365 < local343; local365++) {
										local387 = this.aShortArray66[local365] - 1;
										if (local387 == -1) {
											break;
										}
										if (arg4 != 0) {
											local428 = Class174.anIntArray444[arg4];
											local434 = Class174.anIntArray443[arg4];
											local440 = this.aShortArray65[local387] * local428 + this.aShortArray63[local387] * local434 + 32767 >> 16;
											this.aShortArray65[local387] = (short) (this.aShortArray65[local387] * local434 + 32767 - this.aShortArray63[local387] * local428 >> 16);
											this.aShortArray63[local387] = (short) local440;
										}
										if (arg2 != 0) {
											local428 = Class174.anIntArray444[arg2];
											local434 = Class174.anIntArray443[arg2];
											local440 = this.aShortArray65[local387] * local434 + 32767 - this.aShortArray64[local387] * local428 >> 16;
											this.aShortArray64[local387] = (short) (this.aShortArray65[local387] * local428 + this.aShortArray64[local387] * local434 + 32767 >> 16);
											this.aShortArray65[local387] = (short) local440;
										}
										if (arg3 != 0) {
											local428 = Class174.anIntArray444[arg3];
											local434 = Class174.anIntArray443[arg3];
											local440 = this.aShortArray64[local387] * local428 + this.aShortArray63[local387] * local434 + 32767 >> 16;
											this.aShortArray64[local387] = (short) (this.aShortArray64[local387] * local434 + 32767 - this.aShortArray63[local387] * local428 >> 16);
											this.aShortArray63[local387] = (short) local440;
										}
									}
								}
							}
						}
					}
					if (this.aClass110_4 != null) {
						this.aClass110_4.aBoolean220 = false;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (Static172.aBoolean225) {
					local343 = arg7[0] * Static172.anInt3455 + arg7[3] * Static172.anInt3454 + arg7[6] * Static172.anInt3456 + 16384 >> 15;
					local365 = arg7[1] * Static172.anInt3455 + arg7[4] * Static172.anInt3454 + arg7[7] * Static172.anInt3456 + 16384 >> 15;
					local387 = arg7[2] * Static172.anInt3455 + arg7[5] * Static172.anInt3454 + arg7[8] * Static172.anInt3456 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static172.anInt3455 = local343;
					Static172.anInt3454 = local365;
					Static172.anInt3456 = local387;
					Static172.aBoolean225 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class174.anIntArray443[arg2] >> 1;
				local387 = Class174.anIntArray444[arg2] >> 1;
				local428 = Class174.anIntArray443[arg3] >> 1;
				local434 = Class174.anIntArray444[arg3] >> 1;
				local440 = Class174.anIntArray443[arg4] >> 1;
				local446 = Class174.anIntArray444[arg4] >> 1;
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
				@Pc(590) int local590 = local410[0] * -Static172.anInt3455 + local410[1] * -Static172.anInt3454 + local410[2] * -Static172.anInt3456 + 16384 >> 15;
				local615 = local410[3] * -Static172.anInt3455 + local410[4] * -Static172.anInt3454 + local410[5] * -Static172.anInt3456 + 16384 >> 15;
				local640 = local410[6] * -Static172.anInt3455 + local410[7] * -Static172.anInt3454 + local410[8] * -Static172.anInt3456 + 16384 >> 15;
				local644 = local590 + Static172.anInt3455;
				@Pc(648) int local648 = local615 + Static172.anInt3454;
				local652 = local640 + Static172.anInt3456;
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
					if (local929 < this.anIntArrayArray21.length) {
						@Pc(939) int[] local939 = this.anIntArrayArray21[local929];
						for (@Pc(941) int local941 = 0; local941 < local939.length; local941++) {
							@Pc(949) int local949 = local939[local941];
							if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local949]) != 0) {
								@Pc(991) int local991 = local789[0] * this.anIntArray289[local949] + local789[1] * this.anIntArray286[local949] + local789[2] * this.anIntArray290[local949] + 16384 >> 15;
								@Pc(1022) int local1022 = local789[3] * this.anIntArray289[local949] + local789[4] * this.anIntArray286[local949] + local789[5] * this.anIntArray290[local949] + 16384 >> 15;
								@Pc(1053) int local1053 = local789[6] * this.anIntArray289[local949] + local789[7] * this.anIntArray286[local949] + local789[8] * this.anIntArray290[local949] + 16384 >> 15;
								@Pc(1057) int local1057 = local991 + local791;
								@Pc(1061) int local1061 = local1022 + local796;
								@Pc(1065) int local1065 = local1053 + local801;
								this.anIntArray289[local949] = local1057;
								this.anIntArray286[local949] = local1061;
								this.anIntArray290[local949] = local1065;
							}
						}
					}
				}
			}
		} else if (arg0 == 3) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray21.length) {
						local228 = this.anIntArrayArray21[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local45]) != 0) {
								this.anIntArray289[local45] -= Static172.anInt3455;
								this.anIntArray286[local45] -= Static172.anInt3454;
								this.anIntArray290[local45] -= Static172.anInt3456;
								this.anIntArray289[local45] = this.anIntArray289[local45] * arg2 >> 7;
								this.anIntArray286[local45] = this.anIntArray286[local45] * arg3 >> 7;
								this.anIntArray290[local45] = this.anIntArray290[local45] * arg4 >> 7;
								this.anIntArray289[local45] += Static172.anInt3455;
								this.anIntArray286[local45] += Static172.anInt3454;
								this.anIntArray290[local45] += Static172.anInt3456;
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
				if (Static172.aBoolean225) {
					local343 = arg7[0] * Static172.anInt3455 + arg7[3] * Static172.anInt3454 + arg7[6] * Static172.anInt3456 + 16384 >> 15;
					local365 = arg7[1] * Static172.anInt3455 + arg7[4] * Static172.anInt3454 + arg7[7] * Static172.anInt3456 + 16384 >> 15;
					local387 = arg7[2] * Static172.anInt3455 + arg7[5] * Static172.anInt3454 + arg7[8] * Static172.anInt3456 + 16384 >> 15;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					Static172.anInt3455 = local343;
					Static172.anInt3454 = local365;
					Static172.anInt3456 = local387;
					Static172.aBoolean225 = false;
				}
				local343 = arg2 << 15 >> 7;
				local365 = arg3 << 15 >> 7;
				local387 = arg4 << 15 >> 7;
				local428 = local343 * -Static172.anInt3455 + 16384 >> 15;
				local434 = local365 * -Static172.anInt3454 + 16384 >> 15;
				local440 = local387 * -Static172.anInt3456 + 16384 >> 15;
				local446 = local428 + Static172.anInt3455;
				local454 = local434 + Static172.anInt3454;
				local462 = local440 + Static172.anInt3456;
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
					if (local667 < this.anIntArrayArray21.length) {
						local789 = this.anIntArrayArray21[local667];
						for (local791 = 0; local791 < local789.length; local791++) {
							local796 = local789[local791];
							if (this.aShortArray60 == null || (arg6 & this.aShortArray60[local796]) != 0) {
								local801 = local1930[0] * this.anIntArray289[local796] + local1930[1] * this.anIntArray286[local796] + local1930[2] * this.anIntArray290[local796] + 16384 >> 15;
								local803 = local1930[3] * this.anIntArray289[local796] + local1930[4] * this.anIntArray286[local796] + local1930[5] * this.anIntArray290[local796] + 16384 >> 15;
								local929 = local1930[6] * this.anIntArray289[local796] + local1930[7] * this.anIntArray286[local796] + local1930[8] * this.anIntArray290[local796] + 16384 >> 15;
								@Pc(2198) int local2198 = local801 + local652;
								@Pc(2202) int local2202 = local803 + local1937;
								@Pc(2206) int local2206 = local929 + local657;
								this.anIntArray289[local796] = local2198;
								this.anIntArray286[local796] = local2202;
								this.anIntArray290[local796] = local2206;
							}
						}
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray22 != null && this.aByteArray44 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray22.length) {
						local228 = this.anIntArrayArray22[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray56 == null || (arg6 & this.aShortArray56[local45]) != 0) {
								local53 = (this.aByteArray44[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray44[local45] = (byte) local53;
							}
						}
						if (local228.length > 0) {
							this.aClass110_1.aBoolean220 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray22 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray22.length) {
					local228 = this.anIntArrayArray22[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray56 == null || (arg6 & this.aShortArray56[local45]) != 0) {
							local53 = this.aShortArray61[local45] & 0xFFFF;
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
							this.aShortArray61[local45] = (short) (local2518 << 10 | local365 << 7 | local387);
						}
					}
					if (local228.length > 0) {
						this.aClass110_1.aBoolean220 = false;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "o", descriptor = "()I")
	public int method2762() {
		return this.aShort28;
	}

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "()V")
	private void method2763() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt3450; local17++) {
			@Pc(26) int local26 = this.anIntArray289[local17];
			@Pc(31) int local31 = this.anIntArray286[local17];
			@Pc(36) int local36 = this.anIntArray290[local17];
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
		this.aClass157_1.aShort35 = (short) local1;
		this.aClass157_1.aShort33 = (short) local7;
		this.aClass157_1.aShort31 = (short) local3;
		this.aClass157_1.aShort30 = (short) local9;
		this.aClass157_1.aShort36 = (short) local5;
		this.aClass157_1.aShort34 = (short) local11;
		this.aClass157_1.aShort32 = (short) (Math.sqrt((double) local13) + 0.99D);
		Math.sqrt((double) local15);
		this.aClass157_1.aBoolean334 = true;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "()I")
	@Override
	public int method4266() {
		if (!this.aClass157_1.aBoolean334) {
			this.method2763();
		}
		return this.aClass157_1.aShort31;
	}

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "()V")
	@Override
	protected void method2749() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3451; local1++) {
			this.anIntArray289[local1] = this.anIntArray289[local1] + 7 >> 4;
			this.anIntArray286[local1] = this.anIntArray286[local1] + 7 >> 4;
			this.anIntArray290[local1] = this.anIntArray290[local1] + 7 >> 4;
		}
		this.aClass157_1.aBoolean334 = false;
		this.aClass110_3.aBoolean220 = false;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZZZLclient!mn;Lclient!mn;)Lclient!gk;")
	private Class13_Sub1 method2764(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class13_Sub1_Sub2 arg3, @OriginalArg(4) Class13_Sub1_Sub2 arg4) {
		arg3.anInt3451 = this.anInt3451;
		arg3.anInt3450 = this.anInt3450;
		arg3.anInt3453 = this.anInt3453;
		arg3.anInt3452 = this.anInt3452;
		arg3.aShort27 = this.aShort27;
		arg3.aShort28 = this.aShort28;
		arg3.aByte12 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
		if (arg3.anIntArray289 == null || arg3.anIntArray289.length < this.anInt3451) {
			arg3.anIntArray289 = new int[this.anInt3451 + 100];
			arg3.anIntArray286 = new int[this.anInt3451 + 100];
			arg3.anIntArray290 = new int[this.anInt3451 + 100];
		}
		@Pc(73) int local73;
		for (local73 = 0; local73 < this.anInt3451; local73++) {
			arg3.anIntArray289[local73] = this.anIntArray289[local73];
			arg3.anIntArray286[local73] = this.anIntArray286[local73];
			arg3.anIntArray290[local73] = this.anIntArray290[local73];
		}
		if (arg3.aClass110_3 == null) {
			arg3.aClass110_3 = new Class110();
		}
		arg3.aClass110_3.aBoolean220 = false;
		if (arg3.aClass157_1 == null) {
			arg3.aClass157_1 = new Class157();
		}
		arg3.aClass157_1.aBoolean334 = false;
		if (arg0) {
			arg3.aByteArray44 = this.aByteArray44;
		} else {
			if (arg4.aByteArray44 == null || arg4.aByteArray44.length < this.anInt3452) {
				arg4.aByteArray44 = new byte[this.anInt3452 + 100];
			}
			arg3.aByteArray44 = arg4.aByteArray44;
			for (local73 = 0; local73 < this.anInt3452; local73++) {
				arg3.aByteArray44[local73] = this.aByteArray44[local73];
			}
		}
		if (arg1) {
			arg3.aShortArray61 = this.aShortArray61;
		} else {
			if (arg4.aShortArray61 == null || arg4.aShortArray61.length < this.anInt3452) {
				arg4.aShortArray61 = new short[this.anInt3452 + 100];
			}
			arg3.aShortArray61 = arg4.aShortArray61;
			for (local73 = 0; local73 < this.anInt3452; local73++) {
				arg3.aShortArray61[local73] = this.aShortArray61[local73];
			}
		}
		if (arg0 && arg1) {
			arg3.aClass110_1 = this.aClass110_1;
		} else {
			if (arg4.aClass110_1 == null) {
				arg4.aClass110_1 = new Class110();
			}
			arg3.aClass110_1 = arg4.aClass110_1;
			arg3.aClass110_1.aBoolean220 = false;
		}
		if (arg2 || this.aShortArray63 == null) {
			arg3.aShortArray63 = this.aShortArray63;
			arg3.aShortArray65 = this.aShortArray65;
			arg3.aShortArray64 = this.aShortArray64;
			arg3.aShortArray67 = this.aShortArray67;
			arg3.aClass110_4 = this.aClass110_4;
		} else {
			if (arg4.aShortArray63 == null || arg4.aShortArray63.length < this.anInt3453) {
				arg4.aShortArray63 = new short[this.anInt3453 + 100];
				arg4.aShortArray65 = new short[this.anInt3453 + 100];
				arg4.aShortArray64 = new short[this.anInt3453 + 100];
				arg4.aShortArray67 = new short[this.anInt3453 + 100];
			}
			arg3.aShortArray63 = arg4.aShortArray63;
			arg3.aShortArray65 = arg4.aShortArray65;
			arg3.aShortArray64 = arg4.aShortArray64;
			arg3.aShortArray67 = arg4.aShortArray67;
			for (local73 = 0; local73 < this.anInt3453; local73++) {
				arg3.aShortArray63[local73] = this.aShortArray63[local73];
				arg3.aShortArray65[local73] = this.aShortArray65[local73];
				arg3.aShortArray64[local73] = this.aShortArray64[local73];
				arg3.aShortArray67[local73] = this.aShortArray67[local73];
			}
			if (Static253.aBoolean335) {
				if (arg4.aClass110_4 == null) {
					arg4.aClass110_4 = new Class110();
				}
				arg3.aClass110_4 = arg4.aClass110_4;
				arg3.aClass110_4.aBoolean220 = false;
			} else {
				arg3.aClass110_4 = null;
			}
		}
		arg3.aFloatArray20 = this.aFloatArray20;
		arg3.aFloatArray19 = this.aFloatArray19;
		arg3.anIntArray287 = this.anIntArray287;
		arg3.anIntArrayArray21 = this.anIntArrayArray21;
		arg3.aShortArray62 = this.aShortArray62;
		arg3.aShortArray59 = this.aShortArray59;
		arg3.aShortArray57 = this.aShortArray57;
		arg3.aShortArray58 = this.aShortArray58;
		arg3.aByteArray45 = this.aByteArray45;
		arg3.anIntArrayArray22 = this.anIntArrayArray22;
		arg3.aClass110_2 = this.aClass110_2;
		arg3.aClass110_5 = this.aClass110_5;
		arg3.anIntArray288 = this.anIntArray288;
		arg3.aShortArray66 = this.aShortArray66;
		arg3.anIntArray285 = this.anIntArray285;
		arg3.aBoolean223 = this.aBoolean223;
		arg3.aShortArray60 = this.aShortArray60;
		arg3.aShortArray56 = this.aShortArray56;
		arg3.aClass62Array2 = this.aClass62Array2;
		arg3.aClass88Array2 = this.aClass88Array2;
		return arg3;
	}

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "()V")
	@Override
	public void method2747() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3451; local1++) {
			@Pc(10) int local10 = this.anIntArray290[local1];
			this.anIntArray290[local1] = this.anIntArray289[local1];
			this.anIntArray289[local1] = -local10;
		}
		this.aClass157_1.aBoolean334 = false;
		this.aClass110_3.aBoolean220 = false;
	}

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "(I)V")
	public void method2767(@OriginalArg(0) int arg0) {
		this.aShort28 = (short) arg0;
		if (this.aClass110_4 != null) {
			this.aClass110_4.aBoolean220 = false;
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "()V")
	@Override
	public void method2730() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3451; local1++) {
			this.anIntArray289[local1] = -this.anIntArray289[local1];
			this.anIntArray290[local1] = -this.anIntArray290[local1];
		}
		this.aClass157_1.aBoolean334 = false;
		this.aClass110_3.aBoolean220 = false;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZZZZZ)V")
	private void method2768(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(1) int local1 = 0;
		if (arg1) {
			this.aClass110_3.anInt3404 = 0;
			local1 += 12;
		}
		if (arg2) {
			this.aClass110_1.anInt3404 = local1;
			local1 += 4;
		}
		if (arg3) {
			this.aClass110_4.anInt3404 = local1;
			local1 += 12;
		}
		if (arg4) {
			this.aClass110_2.anInt3404 = local1;
			local1 += 8;
		}
		if (local1 == 0) {
			return;
		}
		if (Static172.aClass4_Sub24_31.aByteArray47.length < this.anInt3453 * local1) {
			Static172.aClass4_Sub24_31 = new Class4_Sub24((this.anInt3453 + 100) * local1);
		} else {
			Static172.aClass4_Sub24_31.anInt3822 = 0;
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
			if (Static251.aBoolean314) {
				for (local60 = 0; local60 < this.anInt3450; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray289[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray286[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray290[local60]);
					local90 = this.anIntArray285[local60];
					local97 = this.anIntArray285[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray66[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static172.aClass4_Sub24_31.anInt3822 = local109 * local1;
						Static172.aClass4_Sub24_31.method3066(local71);
						Static172.aClass4_Sub24_31.method3066(local78);
						Static172.aClass4_Sub24_31.method3066(local85);
					}
				}
			} else {
				for (local60 = 0; local60 < this.anInt3450; local60++) {
					local71 = Float.floatToRawIntBits((float) this.anIntArray289[local60]);
					local78 = Float.floatToRawIntBits((float) this.anIntArray286[local60]);
					local85 = Float.floatToRawIntBits((float) this.anIntArray290[local60]);
					local90 = this.anIntArray285[local60];
					local97 = this.anIntArray285[local60 + 1];
					for (local99 = local90; local99 < local97; local99++) {
						local109 = this.aShortArray66[local99] - 1;
						if (local109 == -1) {
							break;
						}
						Static172.aClass4_Sub24_31.anInt3822 = local109 * local1;
						Static172.aClass4_Sub24_31.method3103(local71);
						Static172.aClass4_Sub24_31.method3103(local78);
						Static172.aClass4_Sub24_31.method3103(local85);
					}
				}
			}
		}
		if (arg2) {
			if (Static253.aBoolean335) {
				for (local60 = 0; local60 < this.anInt3452; local60++) {
					local71 = Static172.method2783(this.aShortArray61[local60], this.aShortArray58[local60], this.aShort27, this.aByteArray44[local60]);
					Static172.aClass4_Sub24_31.anInt3822 = this.aClass110_1.anInt3404 + this.aShortArray62[local60] * local1;
					Static172.aClass4_Sub24_31.method3066(local71);
					Static172.aClass4_Sub24_31.anInt3822 = this.aClass110_1.anInt3404 + this.aShortArray59[local60] * local1;
					Static172.aClass4_Sub24_31.method3066(local71);
					Static172.aClass4_Sub24_31.anInt3822 = this.aClass110_1.anInt3404 + this.aShortArray57[local60] * local1;
					Static172.aClass4_Sub24_31.method3066(local71);
				}
			} else {
				local60 = (int) Static290.aFloatArray25[0];
				local71 = (int) Static290.aFloatArray25[1];
				local78 = (int) Static290.aFloatArray25[2];
				local85 = (int) Math.sqrt((double) (local60 * local60 + local71 * local71 + local78 * local78));
				local90 = (int) ((float) this.aShort27 * 1.3F);
				local97 = this.aShort28 * local85 >> 8;
				for (local99 = 0; local99 < this.anInt3452; local99++) {
					@Pc(270) short local270 = this.aShortArray62[local99];
					@Pc(275) short local275 = this.aShortArray67[local270];
					@Pc(281) int local281;
					if (local275 < 0) {
						local281 = -local275 - 1;
					} else {
						if (local275 == 0) {
							local281 = local90 + (local60 * this.aShortArray63[local270] + local71 * this.aShortArray65[local270] + local78 * this.aShortArray64[local270]) / (local97 + local97 / 2);
						} else {
							local281 = local90 + (local60 * this.aShortArray63[local270] + local71 * this.aShortArray65[local270] + local78 * this.aShortArray64[local270]) / (local97 * local275);
						}
						if (local281 < 0) {
							local281 = 0;
						} else if (local281 > 16384) {
							local281 = 16384;
						}
						this.aShortArray67[local270] = (short) (-local281 - 1);
					}
					@Pc(364) short local364 = this.aShortArray59[local99];
					@Pc(369) short local369 = this.aShortArray67[local364];
					@Pc(375) int local375;
					if (local369 < 0) {
						local375 = -local369 - 1;
					} else {
						if (local369 == 0) {
							local375 = local90 + (local60 * this.aShortArray63[local364] + local71 * this.aShortArray65[local364] + local78 * this.aShortArray64[local364]) / (local97 + local97 / 2);
						} else {
							local375 = local90 + (local60 * this.aShortArray63[local364] + local71 * this.aShortArray65[local364] + local78 * this.aShortArray64[local364]) / (local97 * local369);
						}
						if (local375 < 0) {
							local375 = 0;
						} else if (local375 > 16384) {
							local375 = 16384;
						}
						this.aShortArray67[local364] = (short) (-local375 - 1);
					}
					@Pc(458) short local458 = this.aShortArray57[local99];
					@Pc(463) short local463 = this.aShortArray67[local458];
					@Pc(469) int local469;
					if (local463 < 0) {
						local469 = -local463 - 1;
					} else {
						if (local463 == 0) {
							local469 = local90 + (local60 * this.aShortArray63[local458] + local71 * this.aShortArray65[local458] + local78 * this.aShortArray64[local458]) / (local97 + local97 / 2);
						} else {
							local469 = local90 + (local60 * this.aShortArray63[local458] + local71 * this.aShortArray65[local458] + local78 * this.aShortArray64[local458]) / (local97 * local463);
						}
						if (local469 < 0) {
							local469 = 0;
						} else if (local469 > 16384) {
							local469 = 16384;
						}
						this.aShortArray67[local458] = (short) (-local469 - 1);
					}
					@Pc(562) int local562 = Static172.method2783(this.aShortArray61[local99], this.aShortArray58[local99], local281, this.aByteArray44[local99]);
					@Pc(577) int local577 = Static172.method2783(this.aShortArray61[local99], this.aShortArray58[local99], local375, this.aByteArray44[local99]);
					@Pc(592) int local592 = Static172.method2783(this.aShortArray61[local99], this.aShortArray58[local99], local469, this.aByteArray44[local99]);
					Static172.aClass4_Sub24_31.anInt3822 = this.aClass110_1.anInt3404 + local270 * local1;
					Static172.aClass4_Sub24_31.method3066(local562);
					Static172.aClass4_Sub24_31.anInt3822 = this.aClass110_1.anInt3404 + local364 * local1;
					Static172.aClass4_Sub24_31.method3066(local577);
					Static172.aClass4_Sub24_31.anInt3822 = this.aClass110_1.anInt3404 + local458 * local1;
					Static172.aClass4_Sub24_31.method3066(local592);
				}
				this.aShortArray63 = null;
				this.aShortArray65 = null;
				this.aShortArray64 = null;
			}
		}
		if (arg3) {
			@Pc(723) float local723 = 3.0F / (float) this.aShort28;
			@Pc(734) float local734 = 3.0F / (float) (this.aShort28 + this.aShort28 / 2);
			Static172.aClass4_Sub24_31.anInt3822 = this.aClass110_4.anInt3404;
			@Pc(752) short local752;
			@Pc(790) float local790;
			if (Static251.aBoolean314) {
				for (local78 = 0; local78 < this.anInt3453; local78++) {
					local752 = this.aShortArray67[local78];
					if (local752 == 0) {
						Static172.aClass4_Sub24_31.method3099((float) this.aShortArray63[local78] * local734);
						Static172.aClass4_Sub24_31.method3099((float) this.aShortArray65[local78] * local734);
						Static172.aClass4_Sub24_31.method3099((float) this.aShortArray64[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static172.aClass4_Sub24_31.method3099((float) this.aShortArray63[local78] * local790);
						Static172.aClass4_Sub24_31.method3099((float) this.aShortArray65[local78] * local790);
						Static172.aClass4_Sub24_31.method3099((float) this.aShortArray64[local78] * local790);
					}
					Static172.aClass4_Sub24_31.anInt3822 += local1 - 12;
				}
			} else {
				for (local78 = 0; local78 < this.anInt3453; local78++) {
					local752 = this.aShortArray67[local78];
					if (local752 == 0) {
						Static172.aClass4_Sub24_31.method3087((float) this.aShortArray63[local78] * local734);
						Static172.aClass4_Sub24_31.method3087((float) this.aShortArray65[local78] * local734);
						Static172.aClass4_Sub24_31.method3087((float) this.aShortArray64[local78] * local734);
					} else {
						local790 = local723 / (float) local752;
						Static172.aClass4_Sub24_31.method3087((float) this.aShortArray63[local78] * local790);
						Static172.aClass4_Sub24_31.method3087((float) this.aShortArray65[local78] * local790);
						Static172.aClass4_Sub24_31.method3087((float) this.aShortArray64[local78] * local790);
					}
					Static172.aClass4_Sub24_31.anInt3822 += local1 - 12;
				}
			}
		}
		if (arg4) {
			Static172.aClass4_Sub24_31.anInt3822 = this.aClass110_2.anInt3404;
			if (Static251.aBoolean314) {
				for (local60 = 0; local60 < this.anInt3453; local60++) {
					Static172.aClass4_Sub24_31.method3099(this.aFloatArray20[local60]);
					Static172.aClass4_Sub24_31.method3099(this.aFloatArray19[local60]);
					Static172.aClass4_Sub24_31.anInt3822 += local1 - 8;
				}
			} else {
				for (local60 = 0; local60 < this.anInt3453; local60++) {
					Static172.aClass4_Sub24_31.method3087(this.aFloatArray20[local60]);
					Static172.aClass4_Sub24_31.method3087(this.aFloatArray19[local60]);
					Static172.aClass4_Sub24_31.anInt3822 += local1 - 8;
				}
			}
		}
		Static172.aClass4_Sub24_31.anInt3822 = local1 * this.anInt3453;
		@Pc(1007) ByteBuffer local1007;
		if (arg0) {
			if (Static251.aBoolean332) {
				local1007 = ByteBuffer.wrap(Static172.aClass4_Sub24_31.aByteArray47, 0, Static172.aClass4_Sub24_31.anInt3822);
				if (this.aClass107_5 == null) {
					this.aClass107_5 = new Class107(true);
					this.aClass107_5.method2632(local1007);
				} else {
					this.aClass107_5.method2636(local1007);
				}
				if (arg1) {
					this.aClass110_3.aBoolean220 = true;
					this.aClass110_3.aByteBuffer10 = null;
					this.aClass110_3.aClass107_4 = this.aClass107_5;
					this.aClass110_3.anInt3407 = local1;
				}
				if (arg2) {
					this.aClass110_1.aBoolean220 = true;
					this.aClass110_1.aByteBuffer10 = null;
					this.aClass110_1.aClass107_4 = this.aClass107_5;
					this.aClass110_1.anInt3407 = local1;
				}
				if (arg3) {
					this.aClass110_4.aBoolean220 = true;
					this.aClass110_4.aByteBuffer10 = null;
					this.aClass110_4.aClass107_4 = this.aClass107_5;
					this.aClass110_4.anInt3407 = local1;
				}
				if (arg4) {
					this.aClass110_2.aBoolean220 = true;
					this.aClass110_2.aByteBuffer10 = null;
					this.aClass110_2.aClass107_4 = this.aClass107_5;
					this.aClass110_2.anInt3407 = local1;
				}
			} else {
				if (Static172.aByteBuffer11 == null || Static172.aByteBuffer11.capacity() < Static172.aClass4_Sub24_31.anInt3822) {
					Static172.aByteBuffer11 = ByteBuffer.allocateDirect(Static172.aClass4_Sub24_31.anInt3822 + local1 * 100);
				} else {
					Static172.aByteBuffer11.clear();
				}
				Static172.aByteBuffer11.put(Static172.aClass4_Sub24_31.aByteArray47, 0, Static172.aClass4_Sub24_31.anInt3822);
				Static172.aByteBuffer11.flip();
				if (arg1) {
					this.aClass110_3.aBoolean220 = true;
					this.aClass110_3.aByteBuffer10 = Static172.aByteBuffer11;
					this.aClass110_3.aClass107_4 = null;
					this.aClass110_3.anInt3407 = local1;
				}
				if (arg2) {
					this.aClass110_1.aBoolean220 = true;
					this.aClass110_1.aByteBuffer10 = Static172.aByteBuffer11;
					this.aClass110_3.aClass107_4 = null;
					this.aClass110_1.anInt3407 = local1;
				}
				if (arg3) {
					this.aClass110_4.aBoolean220 = true;
					this.aClass110_4.aByteBuffer10 = Static172.aByteBuffer11;
					this.aClass110_4.aClass107_4 = null;
					this.aClass110_4.anInt3407 = local1;
				}
				if (arg4) {
					this.aClass110_2.aBoolean220 = true;
					this.aClass110_2.aByteBuffer10 = Static172.aByteBuffer11;
					this.aClass110_2.aClass107_4 = null;
					this.aClass110_2.anInt3407 = local1;
				}
			}
		} else if (Static251.aBoolean327) {
			@Pc(1211) Class107 local1211 = new Class107();
			@Pc(1218) ByteBuffer local1218 = ByteBuffer.wrap(Static172.aClass4_Sub24_31.aByteArray47, 0, Static172.aClass4_Sub24_31.anInt3822);
			local1211.method2632(local1218);
			if (arg1) {
				this.aClass110_3.aBoolean220 = true;
				this.aClass110_3.aByteBuffer10 = null;
				this.aClass110_3.aClass107_4 = local1211;
				this.aClass110_3.anInt3407 = local1;
			}
			if (arg2) {
				this.aClass110_1.aBoolean220 = true;
				this.aClass110_1.aByteBuffer10 = null;
				this.aClass110_1.aClass107_4 = local1211;
				this.aClass110_1.anInt3407 = local1;
			}
			if (arg3) {
				this.aClass110_4.aBoolean220 = true;
				this.aClass110_4.aByteBuffer10 = null;
				this.aClass110_4.aClass107_4 = local1211;
				this.aClass110_4.anInt3407 = local1;
			}
			if (arg4) {
				this.aClass110_2.aBoolean220 = true;
				this.aClass110_2.aByteBuffer10 = null;
				this.aClass110_2.aClass107_4 = local1211;
				this.aClass110_2.anInt3407 = local1;
			}
		} else {
			local1007 = ByteBuffer.allocateDirect(Static172.aClass4_Sub24_31.anInt3822);
			local1007.put(Static172.aClass4_Sub24_31.aByteArray47, 0, Static172.aClass4_Sub24_31.anInt3822);
			local1007.flip();
			if (arg1) {
				this.aClass110_3.aBoolean220 = true;
				this.aClass110_3.aByteBuffer10 = local1007;
				this.aClass110_3.aClass107_4 = null;
				this.aClass110_3.anInt3407 = local1;
			}
			if (arg2) {
				this.aClass110_1.aBoolean220 = true;
				this.aClass110_1.aByteBuffer10 = local1007;
				this.aClass110_3.aClass107_4 = null;
				this.aClass110_1.anInt3407 = local1;
			}
			if (arg3) {
				this.aClass110_4.aBoolean220 = true;
				this.aClass110_4.aByteBuffer10 = local1007;
				this.aClass110_4.aClass107_4 = null;
				this.aClass110_4.anInt3407 = local1;
			}
			if (arg4) {
				this.aClass110_2.aBoolean220 = true;
				this.aClass110_2.aByteBuffer10 = local1007;
				this.aClass110_2.aClass107_4 = null;
				this.aClass110_2.anInt3407 = local1;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "()Z")
	@Override
	public boolean method4264() {
		return this.aBoolean224 && this.anIntArray289 != null && this.aShortArray63 != null;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZZZZZZZZZZZ)Lclient!mn;")
	public Class13_Sub1_Sub2 method2770(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) boolean arg8) {
		@Pc(3) Class13_Sub1_Sub2 local3 = new Class13_Sub1_Sub2();
		local3.anInt3451 = this.anInt3451;
		local3.anInt3450 = this.anInt3450;
		local3.anInt3453 = this.anInt3453;
		local3.anInt3452 = this.anInt3452;
		if (arg0) {
			local3.anIntArray289 = this.anIntArray289;
			local3.anIntArray290 = this.anIntArray290;
		} else {
			local3.anIntArray289 = Static162.method2610(this.anIntArray289);
			local3.anIntArray290 = Static162.method2610(this.anIntArray290);
		}
		if (arg1) {
			local3.anIntArray286 = this.anIntArray286;
		} else {
			local3.anIntArray286 = Static162.method2610(this.anIntArray286);
		}
		if (arg0 && arg1) {
			local3.aClass110_3 = this.aClass110_3;
			local3.aClass157_1 = this.aClass157_1;
		} else {
			local3.aClass110_3 = new Class110();
			local3.aClass157_1 = new Class157();
		}
		if (arg2) {
			local3.aShortArray61 = this.aShortArray61;
		} else {
			local3.aShortArray61 = Static28.method590(this.aShortArray61);
		}
		local3.aByteArray44 = this.aByteArray44;
		if (arg2 && arg3 && (arg6 && arg4 || Static253.aBoolean335)) {
			local3.aClass110_1 = this.aClass110_1;
		} else {
			local3.aClass110_1 = new Class110();
		}
		if (arg4) {
			local3.aShortArray63 = this.aShortArray63;
			local3.aShortArray65 = this.aShortArray65;
			local3.aShortArray64 = this.aShortArray64;
			local3.aShortArray67 = this.aShortArray67;
		} else {
			local3.aShortArray63 = Static28.method590(this.aShortArray63);
			local3.aShortArray65 = Static28.method590(this.aShortArray65);
			local3.aShortArray64 = Static28.method590(this.aShortArray64);
			local3.aShortArray67 = Static28.method590(this.aShortArray67);
		}
		if (!Static253.aBoolean335) {
			local3.aClass110_4 = null;
		} else if (arg4 && arg5 && arg6) {
			local3.aClass110_4 = this.aClass110_4;
		} else {
			local3.aClass110_4 = new Class110();
		}
		local3.aFloatArray20 = this.aFloatArray20;
		local3.aFloatArray19 = this.aFloatArray19;
		local3.aClass110_2 = this.aClass110_2;
		if (arg7) {
			local3.aShortArray62 = this.aShortArray62;
			local3.aShortArray59 = this.aShortArray59;
			local3.aShortArray57 = this.aShortArray57;
			local3.aClass110_5 = this.aClass110_5;
		} else {
			local3.aShortArray62 = Static28.method590(this.aShortArray62);
			local3.aShortArray59 = Static28.method590(this.aShortArray59);
			local3.aShortArray57 = Static28.method590(this.aShortArray57);
			local3.aClass110_5 = new Class110();
		}
		if (arg8) {
			local3.aShortArray58 = this.aShortArray58;
		} else {
			local3.aShortArray58 = Static28.method590(this.aShortArray58);
		}
		local3.anIntArray287 = this.anIntArray287;
		local3.anIntArrayArray21 = this.anIntArrayArray21;
		local3.aByteArray45 = this.aByteArray45;
		local3.anIntArrayArray22 = this.anIntArrayArray22;
		local3.anIntArray288 = this.anIntArray288;
		local3.aShortArray66 = this.aShortArray66;
		local3.anIntArray285 = this.anIntArray285;
		local3.aShort27 = this.aShort27;
		local3.aShort28 = this.aShort28;
		local3.aClass62Array2 = this.aClass62Array2;
		local3.aClass88Array2 = this.aClass88Array2;
		local3.aShortArray60 = this.aShortArray60;
		local3.aShortArray56 = this.aShortArray56;
		return local3;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!ta;)Lclient!ta;")
	public Class58_Sub2 method2771(@OriginalArg(0) Class58_Sub2 arg0) {
		if (this.anInt3453 == 0) {
			return null;
		}
		if (!this.aClass157_1.aBoolean334) {
			this.method2763();
		}
		@Pc(26) int local26;
		@Pc(40) int local40;
		if (Static290.anInt5640 > 0) {
			local26 = this.aClass157_1.aShort35 - (this.aClass157_1.aShort30 * Static290.anInt5640 >> 8) >> 3;
			local40 = this.aClass157_1.aShort33 - (this.aClass157_1.aShort31 * Static290.anInt5640 >> 8) >> 3;
		} else {
			local26 = this.aClass157_1.aShort35 - (this.aClass157_1.aShort31 * Static290.anInt5640 >> 8) >> 3;
			local40 = this.aClass157_1.aShort33 - (this.aClass157_1.aShort30 * Static290.anInt5640 >> 8) >> 3;
		}
		@Pc(85) int local85;
		@Pc(99) int local99;
		if (Static290.anInt5646 > 0) {
			local85 = this.aClass157_1.aShort36 - (this.aClass157_1.aShort30 * Static290.anInt5646 >> 8) >> 3;
			local99 = this.aClass157_1.aShort34 - (this.aClass157_1.aShort31 * Static290.anInt5646 >> 8) >> 3;
		} else {
			local85 = this.aClass157_1.aShort36 - (this.aClass157_1.aShort31 * Static290.anInt5646 >> 8) >> 3;
			local99 = this.aClass157_1.aShort34 - (this.aClass157_1.aShort30 * Static290.anInt5646 >> 8) >> 3;
		}
		@Pc(134) int local134 = local40 + 1 - local26;
		@Pc(140) int local140 = local99 + 1 - local85;
		@Pc(151) Class58_Sub2 local151;
		if (arg0 == null || arg0.aByteArray59.length < local134 * local140) {
			local151 = new Class58_Sub2(local134, local140, 0);
		} else {
			local151 = arg0;
			arg0.anInt5022 = arg0.anInt5028 = local134;
			arg0.anInt5025 = arg0.anInt5023 = local140;
			arg0.method3977();
		}
		local151.anInt5026 = local26;
		local151.anInt5027 = local85;
		if (Static172.anIntArray292.length < this.anInt3453) {
			Static172.anIntArray292 = new int[this.anInt3453];
			Static172.anIntArray291 = new int[this.anInt3453];
		}
		@Pc(194) int local194;
		@Pc(246) int local246;
		@Pc(248) int local248;
		@Pc(258) int local258;
		for (local194 = 0; local194 < this.anInt3450; local194++) {
			@Pc(216) int local216 = (this.anIntArray289[local194] - (this.anIntArray286[local194] * Static290.anInt5640 >> 8) >> 3) - local26;
			@Pc(234) int local234 = (this.anIntArray290[local194] - (this.anIntArray286[local194] * Static290.anInt5646 >> 8) >> 3) - local85;
			@Pc(239) int local239 = this.anIntArray285[local194];
			local246 = this.anIntArray285[local194 + 1];
			for (local248 = local239; local248 < local246; local248++) {
				local258 = this.aShortArray66[local248] - 1;
				if (local258 == -1) {
					break;
				}
				Static172.anIntArray292[local258] = local216;
				Static172.anIntArray291[local258] = local234;
			}
		}
		for (local194 = 0; local194 < this.anInt3452; local194++) {
			if (this.aByteArray44[local194] <= 128) {
				@Pc(292) short local292 = this.aShortArray62[local194];
				@Pc(297) short local297 = this.aShortArray59[local194];
				@Pc(302) short local302 = this.aShortArray57[local194];
				local246 = Static172.anIntArray292[local292];
				local248 = Static172.anIntArray292[local297];
				local258 = Static172.anIntArray292[local302];
				@Pc(318) int local318 = Static172.anIntArray291[local292];
				@Pc(322) int local322 = Static172.anIntArray291[local297];
				@Pc(326) int local326 = Static172.anIntArray291[local302];
				if ((local246 - local248) * (local322 - local326) - (local322 - local318) * (local258 - local248) > 0) {
					Static283.method4421(local151.aByteArray59, local318, local322, local326, local246, local248, local258, local134);
				}
			}
		}
		return local151;
	}

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "()I")
	public int method2773() {
		return this.aShort27;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(SS)V")
	public void method2774(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt3452; local1++) {
			if (this.aShortArray58[local1] == arg0) {
				this.aShortArray58[local1] = arg1;
			}
		}
		local1 = 0;
		@Pc(22) int local22 = 0;
		if (arg0 != -1) {
			local1 = Static283.anInterface1_1.method2438(arg0 & 0xFFFF);
			local22 = Static283.anInterface1_1.method2425(arg0 & 0xFFFF);
		}
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		if (arg1 != -1) {
			local41 = Static283.anInterface1_1.method2438(arg1 & 0xFFFF);
			local43 = Static283.anInterface1_1.method2425(arg1 & 0xFFFF);
		}
		if (local1 != local41 || local22 != local43) {
			this.aClass110_1.aBoolean220 = false;
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)V")
	@Override
	public void method2740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3451; local1++) {
			this.anIntArray289[local1] += arg0;
			this.anIntArray286[local1] += arg1;
			this.anIntArray290[local1] += arg2;
		}
		this.aClass157_1.aBoolean334 = false;
		this.aClass110_3.aBoolean220 = false;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII)V")
	@Override
	protected void method2751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			Static172.anInt3455 = 0;
			Static172.anInt3454 = 0;
			Static172.anInt3456 = 0;
			for (local11 = 0; local11 < this.anInt3451; local11++) {
				Static172.anInt3455 += this.anIntArray289[local11];
				Static172.anInt3454 += this.anIntArray286[local11];
				Static172.anInt3456 += this.anIntArray290[local11];
				local3++;
			}
			if (local3 > 0) {
				Static172.anInt3455 = Static172.anInt3455 / local3 + arg1;
				Static172.anInt3454 = Static172.anInt3454 / local3 + arg2;
				Static172.anInt3456 = Static172.anInt3456 / local3 + arg3;
			} else {
				Static172.anInt3455 = arg1;
				Static172.anInt3454 = arg2;
				Static172.anInt3456 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt3451; local3++) {
				this.anIntArray289[local3] += arg1;
				this.anIntArray286[local3] += arg2;
				this.anIntArray290[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt3451; local3++) {
					this.anIntArray289[local3] -= Static172.anInt3455;
					this.anIntArray286[local3] -= Static172.anInt3454;
					this.anIntArray290[local3] -= Static172.anInt3456;
					if (arg3 != 0) {
						local11 = Class174.anIntArray444[arg3];
						local146 = Class174.anIntArray443[arg3];
						local164 = this.anIntArray286[local3] * local11 + this.anIntArray289[local3] * local146 + 32767 >> 16;
						this.anIntArray286[local3] = this.anIntArray286[local3] * local146 + 32767 - this.anIntArray289[local3] * local11 >> 16;
						this.anIntArray289[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class174.anIntArray444[arg1];
						local146 = Class174.anIntArray443[arg1];
						local164 = this.anIntArray286[local3] * local146 + 32767 - this.anIntArray290[local3] * local11 >> 16;
						this.anIntArray290[local3] = this.anIntArray286[local3] * local11 + this.anIntArray290[local3] * local146 + 32767 >> 16;
						this.anIntArray286[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class174.anIntArray444[arg2];
						local146 = Class174.anIntArray443[arg2];
						local164 = this.anIntArray290[local3] * local11 + this.anIntArray289[local3] * local146 + 32767 >> 16;
						this.anIntArray290[local3] = this.anIntArray290[local3] * local146 + 32767 - this.anIntArray289[local3] * local11 >> 16;
						this.anIntArray289[local3] = local164;
					}
					this.anIntArray289[local3] += Static172.anInt3455;
					this.anIntArray286[local3] += Static172.anInt3454;
					this.anIntArray290[local3] += Static172.anInt3456;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt3451; local3++) {
					this.anIntArray289[local3] -= Static172.anInt3455;
					this.anIntArray286[local3] -= Static172.anInt3454;
					this.anIntArray290[local3] -= Static172.anInt3456;
					this.anIntArray289[local3] = this.anIntArray289[local3] * arg1 / 128;
					this.anIntArray286[local3] = this.anIntArray286[local3] * arg2 / 128;
					this.anIntArray290[local3] = this.anIntArray290[local3] * arg3 / 128;
					this.anIntArray289[local3] += Static172.anInt3455;
					this.anIntArray286[local3] += Static172.anInt3454;
					this.anIntArray290[local3] += Static172.anInt3456;
				}
			} else if (arg0 == 5) {
				for (local3 = 0; local3 < this.anInt3452; local3++) {
					local11 = (this.aByteArray44[local3] & 0xFF) + arg1 * 8;
					if (local11 < 0) {
						local11 = 0;
					} else if (local11 > 255) {
						local11 = 255;
					}
					this.aByteArray44[local3] = (byte) local11;
				}
				this.aClass110_1.aBoolean220 = false;
			} else if (arg0 == 7) {
				for (local3 = 0; local3 < this.anInt3452; local3++) {
					local11 = this.aShortArray61[local3] & 0xFFFF;
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
					this.aShortArray61[local3] = (short) (local502 << 10 | local164 << 7 | local496);
				}
				this.aClass110_1.aBoolean220 = false;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "s", descriptor = "()V")
	public void method2775() {
		if (this.aShortArray63 == null) {
			this.method2747();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt3451; local7++) {
			@Pc(16) int local16 = this.anIntArray290[local7];
			this.anIntArray290[local7] = this.anIntArray289[local7];
			this.anIntArray289[local7] = -local16;
		}
		for (local7 = 0; local7 < this.anInt3453; local7++) {
			@Pc(43) short local43 = this.aShortArray64[local7];
			this.aShortArray64[local7] = this.aShortArray63[local7];
			this.aShortArray63[local7] = (short) -local43;
		}
		this.aClass157_1.aBoolean334 = false;
		this.aClass110_3.aBoolean220 = false;
		if (this.aClass110_4 != null) {
			this.aClass110_4.aBoolean220 = false;
		}
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "()I")
	@Override
	public int method2732() {
		if (!this.aClass157_1.aBoolean334) {
			this.method2763();
		}
		return this.aClass157_1.aShort32;
	}

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "()V")
	@Override
	public void method2745() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3451; local1++) {
			@Pc(10) int local10 = this.anIntArray289[local1];
			this.anIntArray289[local1] = this.anIntArray290[local1];
			this.anIntArray290[local1] = -local10;
		}
		this.aClass157_1.aBoolean334 = false;
		this.aClass110_3.aBoolean220 = false;
	}

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "(I)V")
	public void method2776(@OriginalArg(0) int arg0) {
		this.aShort27 = (short) arg0;
		this.aClass110_1.aBoolean220 = false;
	}

	@OriginalMember(owner = "client!mn", name = "t", descriptor = "()V")
	private void method2777() {
		@Pc(1) GL local1 = Static251.aGL1;
		if (this.anInt3452 == 0) {
			return;
		}
		if (this.aByte12 != 0) {
			this.method2768(true, !this.aClass110_3.aBoolean220 && (this.aByte12 & 0x1) != 0, !this.aClass110_1.aBoolean220 && (this.aByte12 & 0x2) != 0, this.aClass110_4 != null && !this.aClass110_4.aBoolean220 && (this.aByte12 & 0x4) != 0, false);
		}
		this.method2768(false, !this.aClass110_3.aBoolean220, !this.aClass110_1.aBoolean220, this.aClass110_4 != null && !this.aClass110_4.aBoolean220, !this.aClass110_2.aBoolean220);
		if (!this.aClass110_5.aBoolean220) {
			this.method2778();
		}
		if (this.aByte11 != 0) {
			if ((this.aByte11 & 0x1) != 0) {
				this.anIntArray289 = null;
				this.anIntArray286 = null;
				this.anIntArray290 = null;
				this.aShortArray66 = null;
				this.anIntArray285 = null;
			}
			if ((this.aByte11 & 0x2) != 0) {
				this.aShortArray61 = null;
				this.aByteArray44 = null;
			}
			if ((this.aByte11 & 0x4) != 0) {
				this.aShortArray63 = null;
				this.aShortArray65 = null;
				this.aShortArray64 = null;
				this.aShortArray67 = null;
			}
			if ((this.aByte11 & 0x8) != 0) {
				this.aFloatArray20 = null;
				this.aFloatArray19 = null;
			}
			if ((this.aByte11 & 0x10) != 0) {
				this.aShortArray62 = null;
				this.aShortArray59 = null;
				this.aShortArray57 = null;
			}
			this.aByte11 = 0;
		}
		@Pc(172) Class107 local172 = null;
		if (this.aClass110_3.aClass107_4 != null) {
			this.aClass110_3.aClass107_4.method2633();
			local172 = this.aClass110_3.aClass107_4;
			local1.glVertexPointer(3, 5126, this.aClass110_3.anInt3407, (long) this.aClass110_3.anInt3404);
		}
		if (this.aClass110_1.aClass107_4 != null) {
			if (local172 != this.aClass110_1.aClass107_4) {
				this.aClass110_1.aClass107_4.method2633();
				local172 = this.aClass110_1.aClass107_4;
			}
			local1.glColorPointer(4, 5121, this.aClass110_1.anInt3407, (long) this.aClass110_1.anInt3404);
		}
		if (Static253.aBoolean335 && this.aClass110_4.aClass107_4 != null) {
			if (local172 != this.aClass110_4.aClass107_4) {
				this.aClass110_4.aClass107_4.method2633();
				local172 = this.aClass110_4.aClass107_4;
			}
			local1.glNormalPointer(5126, this.aClass110_4.anInt3407, (long) this.aClass110_4.anInt3404);
		}
		if (this.aClass110_2.aClass107_4 != null) {
			if (local172 != this.aClass110_2.aClass107_4) {
				this.aClass110_2.aClass107_4.method2633();
				local172 = this.aClass110_2.aClass107_4;
			}
			local1.glTexCoordPointer(2, 5126, this.aClass110_2.anInt3407, (long) this.aClass110_2.anInt3404);
		}
		if (this.aClass110_5.aClass107_4 != null) {
			this.aClass110_5.aClass107_4.method2635();
		}
		if (this.aClass110_3.aClass107_4 == null || this.aClass110_1.aClass107_4 == null || Static253.aBoolean335 && this.aClass110_4.aClass107_4 == null || this.aClass110_2.aClass107_4 == null) {
			if (Static251.aBoolean327) {
				local1.glBindBufferARB(34962, 0);
			}
			if (this.aClass110_3.aClass107_4 == null) {
				this.aClass110_3.aByteBuffer10.position(this.aClass110_3.anInt3404);
				local1.glVertexPointer(3, 5126, this.aClass110_3.anInt3407, this.aClass110_3.aByteBuffer10);
			}
			if (this.aClass110_1.aClass107_4 == null) {
				this.aClass110_1.aByteBuffer10.position(this.aClass110_1.anInt3404);
				local1.glColorPointer(4, 5121, this.aClass110_1.anInt3407, this.aClass110_1.aByteBuffer10);
			}
			if (Static253.aBoolean335 && this.aClass110_4.aClass107_4 == null) {
				this.aClass110_4.aByteBuffer10.position(this.aClass110_4.anInt3404);
				local1.glNormalPointer(5126, this.aClass110_4.anInt3407, this.aClass110_4.aByteBuffer10);
			}
			if (this.aClass110_2.aClass107_4 == null) {
				this.aClass110_2.aByteBuffer10.position(this.aClass110_2.anInt3404);
				local1.glTexCoordPointer(2, 5126, this.aClass110_2.anInt3407, this.aClass110_2.aByteBuffer10);
			}
		}
		if (this.aClass110_5.aClass107_4 == null && Static251.aBoolean327) {
			local1.glBindBufferARB(34963, 0);
		}
		@Pc(417) int local417 = this.anIntArray288.length - 1;
		for (@Pc(419) int local419 = 0; local419 < local417; local419++) {
			@Pc(427) int local427 = this.anIntArray288[local419];
			@Pc(434) int local434 = this.anIntArray288[local419 + 1];
			@Pc(439) short local439 = this.aShortArray58[local427];
			if (local439 == -1) {
				Static251.method3892(-1);
				Static126.method2046(0, 0);
			} else {
				Static283.anInterface1_1.method2436(local439 & 0xFFFF);
			}
			if (this.aClass110_5.aClass107_4 == null) {
				this.aClass110_5.aByteBuffer10.position(local427 * 12);
				local1.glDrawElements(4, (local434 - local427) * 3, 5125, this.aClass110_5.aByteBuffer10);
			} else {
				local1.glDrawElements(4, (local434 - local427) * 3, 5125, (long) (local427 * 12));
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "()V")
	private void method2778() {
		if (Static172.aClass4_Sub24_31.aByteArray47.length < this.anInt3452 * 12) {
			Static172.aClass4_Sub24_31 = new Class4_Sub24((this.anInt3452 + 100) * 12);
		} else {
			Static172.aClass4_Sub24_31.anInt3822 = 0;
		}
		@Pc(25) int local25;
		if (Static251.aBoolean314) {
			for (local25 = 0; local25 < this.anInt3452; local25++) {
				Static172.aClass4_Sub24_31.method3066(this.aShortArray62[local25]);
				Static172.aClass4_Sub24_31.method3066(this.aShortArray59[local25]);
				Static172.aClass4_Sub24_31.method3066(this.aShortArray57[local25]);
			}
		} else {
			for (local25 = 0; local25 < this.anInt3452; local25++) {
				Static172.aClass4_Sub24_31.method3103(this.aShortArray62[local25]);
				Static172.aClass4_Sub24_31.method3103(this.aShortArray59[local25]);
				Static172.aClass4_Sub24_31.method3103(this.aShortArray57[local25]);
			}
		}
		if (!Static251.aBoolean327) {
			@Pc(115) ByteBuffer local115 = ByteBuffer.allocateDirect(Static172.aClass4_Sub24_31.anInt3822);
			local115.put(Static172.aClass4_Sub24_31.aByteArray47, 0, Static172.aClass4_Sub24_31.anInt3822);
			local115.flip();
			this.aClass110_5.aBoolean220 = true;
			this.aClass110_5.aByteBuffer10 = local115;
			this.aClass110_5.aClass107_4 = null;
			return;
		}
		@Pc(88) Class107 local88 = new Class107();
		@Pc(95) ByteBuffer local95 = ByteBuffer.wrap(Static172.aClass4_Sub24_31.aByteArray47, 0, Static172.aClass4_Sub24_31.anInt3822);
		local88.method2632(local95);
		this.aClass110_5.aBoolean220 = true;
		this.aClass110_5.aByteBuffer10 = null;
		this.aClass110_5.aClass107_4 = local88;
	}

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "()Z")
	@Override
	protected boolean method2746() {
		if (this.anIntArrayArray21 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt3451; local6++) {
			this.anIntArray289[local6] <<= 0x4;
			this.anIntArray286[local6] <<= 0x4;
			this.anIntArray290[local6] <<= 0x4;
		}
		Static172.anInt3455 = 0;
		Static172.anInt3454 = 0;
		Static172.anInt3456 = 0;
		return true;
	}

	@OriginalMember(owner = "client!mn", name = "v", descriptor = "()V")
	public void method2781() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt3451; local1++) {
			this.anIntArray290[local1] = -this.anIntArray290[local1];
		}
		if (this.aShortArray64 != null) {
			for (local1 = 0; local1 < this.anInt3453; local1++) {
				this.aShortArray64[local1] = (short) -this.aShortArray64[local1];
			}
		}
		for (local1 = 0; local1 < this.anInt3452; local1++) {
			@Pc(48) short local48 = this.aShortArray62[local1];
			this.aShortArray62[local1] = this.aShortArray57[local1];
			this.aShortArray57[local1] = local48;
		}
		this.aClass157_1.aBoolean334 = false;
		this.aClass110_3.aBoolean220 = false;
		if (this.aClass110_4 != null) {
			this.aClass110_4.aBoolean220 = false;
		}
		this.aClass110_5.aBoolean220 = false;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIIIIJ)V")
	@Override
	public void method2743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		if (this.anInt3453 == 0) {
			return;
		}
		@Pc(5) GL local5 = Static251.aGL1;
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
		this.method2777();
		local5.glPopMatrix();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!uk;IIIZ)V")
	@Override
	public void method4261(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class13_Sub1_Sub2 local2 = (Class13_Sub1_Sub2) arg0;
		if (this.anInt3452 == 0 || local2.anInt3452 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt3450;
		@Pc(15) int[] local15 = local2.anIntArray289;
		@Pc(18) int[] local18 = local2.anIntArray286;
		@Pc(21) int[] local21 = local2.anIntArray290;
		@Pc(24) short[] local24 = local2.aShortArray63;
		@Pc(27) short[] local27 = local2.aShortArray65;
		@Pc(30) short[] local30 = local2.aShortArray64;
		@Pc(33) short[] local33 = local2.aShortArray67;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) short[] local52;
		if (this.aClass147_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass147_1.aShortArray79;
			local44 = this.aClass147_1.aShortArray78;
			local48 = this.aClass147_1.aShortArray77;
			local52 = this.aClass147_1.aShortArray76;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) short[] local80;
		if (local2.aClass147_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass147_1.aShortArray79;
			local72 = local2.aClass147_1.aShortArray78;
			local76 = local2.aClass147_1.aShortArray77;
			local80 = local2.aClass147_1.aShortArray76;
		}
		@Pc(92) int[] local92 = local2.anIntArray285;
		@Pc(95) short[] local95 = local2.aShortArray66;
		if (!local2.aClass157_1.aBoolean334) {
			local2.method2763();
		}
		@Pc(105) short local105 = local2.aClass157_1.aShort31;
		@Pc(109) short local109 = local2.aClass157_1.aShort30;
		@Pc(113) short local113 = local2.aClass157_1.aShort35;
		@Pc(117) short local117 = local2.aClass157_1.aShort33;
		@Pc(121) short local121 = local2.aClass157_1.aShort36;
		@Pc(125) short local125 = local2.aClass157_1.aShort34;
		for (@Pc(127) int local127 = 0; local127 < this.anInt3450; local127++) {
			@Pc(138) int local138 = this.anIntArray286[local127] - arg2;
			if (local138 >= local105 && local138 <= local109) {
				@Pc(152) int local152 = this.anIntArray289[local127] - arg1;
				if (local152 >= local113 && local152 <= local117) {
					@Pc(166) int local166 = this.anIntArray290[local127] - arg3;
					if (local166 >= local121 && local166 <= local125) {
						@Pc(175) int local175 = -1;
						@Pc(180) int local180 = this.anIntArray285[local127];
						@Pc(187) int local187 = this.anIntArray285[local127 + 1];
						@Pc(189) int local189;
						for (local189 = local180; local189 < local187; local189++) {
							local175 = this.aShortArray66[local189] - 1;
							if (local175 == -1 || this.aShortArray67[local175] != 0) {
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
											this.aClass147_1 = new Class147();
											local40 = this.aClass147_1.aShortArray79 = Static28.method590(this.aShortArray63);
											local44 = this.aClass147_1.aShortArray78 = Static28.method590(this.aShortArray65);
											local48 = this.aClass147_1.aShortArray77 = Static28.method590(this.aShortArray64);
											local52 = this.aClass147_1.aShortArray76 = Static28.method590(this.aShortArray67);
										}
										if (local68 == null) {
											@Pc(325) Class147 local325 = local2.aClass147_1 = new Class147();
											local68 = local325.aShortArray79 = Static28.method590(local24);
											local72 = local325.aShortArray78 = Static28.method590(local27);
											local76 = local325.aShortArray77 = Static28.method590(local30);
											local80 = local325.aShortArray76 = Static28.method590(local33);
										}
										@Pc(358) short local358 = this.aShortArray63[local175];
										@Pc(363) short local363 = this.aShortArray65[local175];
										@Pc(368) short local368 = this.aShortArray64[local175];
										@Pc(373) short local373 = this.aShortArray67[local175];
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
										local180 = this.anIntArray285[local127];
										local187 = this.anIntArray285[local127 + 1];
										for (local385 = local180; local385 < local187; local385++) {
											local394 = this.aShortArray66[local385] - 1;
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

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "()I")
	@Override
	public int method2737() {
		if (!this.aClass157_1.aBoolean334) {
			this.method2763();
		}
		return this.aClass157_1.aShort33;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(SS)V")
	public void method2784(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3452; local1++) {
			if (this.aShortArray61[local1] == arg0) {
				this.aShortArray61[local1] = arg1;
			}
		}
		this.aClass110_1.aBoolean220 = false;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(ZZZ)Lclient!gk;")
	@Override
	public Class13_Sub1 method2750(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method2764(arg0, arg1, arg2, Static172.aClass13_Sub1_Sub2_2, Static172.aClass13_Sub1_Sub2_1);
	}

	@OriginalMember(owner = "client!mn", name = "x", descriptor = "()V")
	public void method2785() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(24) int local24;
		@Pc(9) int local9;
		@Pc(20) int local20;
		if (this.anIntArray287 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt3451; local9++) {
				local20 = this.anIntArray287[local9] & 0xFF;
				local24 = local5[local20]++;
				if (local20 > local7) {
					local7 = local20;
				}
			}
			this.anIntArrayArray21 = new int[local7 + 1][];
			for (local9 = 0; local9 <= local7; local9++) {
				this.anIntArrayArray21[local9] = new int[local5[local9]];
				local5[local9] = 0;
			}
			local9 = 0;
			while (local9 < this.anInt3451) {
				local20 = this.anIntArray287[local9] & 0xFF;
				this.anIntArrayArray21[local20][local5[local20]++] = local9++;
			}
			this.anIntArray287 = null;
		}
		if (this.aByteArray45 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt3452; local9++) {
			local20 = this.aByteArray45[local9] & 0xFF;
			local24 = local5[local20]++;
			if (local20 > local7) {
				local7 = local20;
			}
		}
		this.anIntArrayArray22 = new int[local7 + 1][];
		for (local9 = 0; local9 <= local7; local9++) {
			this.anIntArrayArray22[local9] = new int[local5[local9]];
			local5[local9] = 0;
		}
		local9 = 0;
		while (local9 < this.anInt3452) {
			local20 = this.aByteArray45[local9] & 0xFF;
			this.anIntArrayArray22[local20][local5[local20]++] = local9++;
		}
		this.aByteArray45 = null;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!ud;IJIIIIFF)S")
	private short method2786(@OriginalArg(0) Class13_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray285[arg1];
		@Pc(11) int local11 = this.anIntArray285[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			@Pc(23) short local23 = this.aShortArray66[local15];
			if (local23 == 0) {
				local13 = local15;
				break;
			}
			if (Static172.aLongArray6[local15] == arg2) {
				return (short) (local23 - 1);
			}
		}
		this.aShortArray66[local13] = (short) (this.anInt3453 + 1);
		Static172.aLongArray6[local13] = arg2;
		this.aShortArray63[this.anInt3453] = (short) arg3;
		this.aShortArray65[this.anInt3453] = (short) arg4;
		this.aShortArray64[this.anInt3453] = (short) arg5;
		this.aShortArray67[this.anInt3453] = (short) arg6;
		this.aFloatArray20[this.anInt3453] = arg7;
		this.aFloatArray19[this.anInt3453] = arg8;
		return (short) this.anInt3453++;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)Lclient!uk;")
	@Override
	public Class13 method4268() {
		this.aBoolean224 = false;
		if (this.aClass147_1 != null) {
			this.aShortArray63 = this.aClass147_1.aShortArray79;
			this.aShortArray65 = this.aClass147_1.aShortArray78;
			this.aShortArray64 = this.aClass147_1.aShortArray77;
			this.aShortArray67 = this.aClass147_1.aShortArray76;
			this.aClass147_1 = null;
		}
		return this;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
	@Override
	public void method2733(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class174.anIntArray444[arg0];
		@Pc(7) int local7 = Class174.anIntArray443[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3451; local9++) {
			@Pc(29) int local29 = this.anIntArray286[local9] * local7 - this.anIntArray290[local9] * local3 >> 16;
			this.anIntArray290[local9] = this.anIntArray286[local9] * local3 + this.anIntArray290[local9] * local7 >> 16;
			this.anIntArray286[local9] = local29;
		}
		this.aClass157_1.aBoolean334 = false;
		this.aClass110_3.aBoolean220 = false;
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(ZZZ)Lclient!gk;")
	@Override
	public Class13_Sub1 method2753(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method2764(arg0, arg1, arg2, Static172.aClass13_Sub1_Sub2_6, Static172.aClass13_Sub1_Sub2_5);
	}

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "()I")
	@Override
	public int method2739() {
		if (!this.aClass157_1.aBoolean334) {
			this.method2763();
		}
		return this.aClass157_1.aShort30;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IILclient!mn;[[I[[IIII)V")
	public void method2787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13_Sub1_Sub2 arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!arg2.aClass157_1.aBoolean334) {
			arg2.method2763();
		}
		@Pc(11) int local11 = arg5 + arg2.aClass157_1.aShort35;
		@Pc(17) int local17 = arg5 + arg2.aClass157_1.aShort33;
		@Pc(23) int local23 = arg7 + arg2.aClass157_1.aShort36;
		@Pc(29) int local29 = arg7 + arg2.aClass157_1.aShort34;
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
			for (local150 = 0; local150 < this.anInt3450; local150++) {
				local161 = this.anIntArray289[local150] + arg5;
				local168 = this.anIntArray290[local150] + arg7;
				local172 = local161 & 0x7F;
				local176 = local168 & 0x7F;
				local180 = local161 >> 7;
				local184 = local168 >> 7;
				local206 = arg3[local180][local184] * (128 - local172) + arg3[local180 + 1][local184] * local172 >> 7;
				local232 = arg3[local180][local184 + 1] * (128 - local172) + arg3[local180 + 1][local184 + 1] * local172 >> 7;
				local244 = local206 * (128 - local176) + local232 * local176 >> 7;
				this.anIntArray286[local150] = this.anIntArray286[local150] + local244 - arg6;
			}
		} else {
			@Pc(362) int local362;
			@Pc(374) int local374;
			if (arg0 == 2) {
				@Pc(266) short local266 = arg2.aClass157_1.aShort31;
				for (local161 = 0; local161 < this.anInt3450; local161++) {
					local168 = (this.anIntArray286[local161] << 16) / local266;
					if (local168 < arg1) {
						local172 = this.anIntArray289[local161] + arg5;
						local176 = this.anIntArray290[local161] + arg7;
						local180 = local172 & 0x7F;
						local184 = local176 & 0x7F;
						local206 = local172 >> 7;
						local232 = local176 >> 7;
						local244 = arg3[local206][local232] * (128 - local180) + arg3[local206 + 1][local232] * local180 >> 7;
						local362 = arg3[local206][local232 + 1] * (128 - local180) + arg3[local206 + 1][local232 + 1] * local180 >> 7;
						local374 = local244 * (128 - local184) + local362 * local184 >> 7;
						this.anIntArray286[local161] += (local374 - arg6) * (arg1 - local168) / arg1;
					}
				}
			} else if (arg0 == 3) {
				local150 = (arg1 & 0xFF) * 4;
				local161 = (arg1 >> 8 & 0xFF) * 4;
				this.method2756(arg3, arg5, arg6, arg7, local150, local161);
			} else if (arg0 == 4) {
				local150 = arg2.aClass157_1.aShort30 - arg2.aClass157_1.aShort31;
				for (local161 = 0; local161 < this.anInt3450; local161++) {
					local168 = this.anIntArray289[local161] + arg5;
					local172 = this.anIntArray290[local161] + arg7;
					local176 = local168 & 0x7F;
					local180 = local172 & 0x7F;
					local184 = local168 >> 7;
					local206 = local172 >> 7;
					local232 = arg4[local184][local206] * (128 - local176) + arg4[local184 + 1][local206] * local176 >> 7;
					local244 = arg4[local184][local206 + 1] * (128 - local176) + arg4[local184 + 1][local206 + 1] * local176 >> 7;
					local362 = local232 * (128 - local180) + local244 * local180 >> 7;
					this.anIntArray286[local161] = this.anIntArray286[local161] + local362 + local150 - arg6;
				}
			} else if (arg0 == 5) {
				local150 = arg2.aClass157_1.aShort30 - arg2.aClass157_1.aShort31;
				for (local161 = 0; local161 < this.anInt3450; local161++) {
					local168 = this.anIntArray289[local161] + arg5;
					local172 = this.anIntArray290[local161] + arg7;
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
					this.anIntArray286[local161] = ((this.anIntArray286[local161] << 8) / local150 * local716 >> 8) - (arg6 - local362);
				}
			}
		}
		this.aClass110_3.aBoolean220 = false;
		this.aClass157_1.aBoolean334 = false;
	}

	@OriginalMember(owner = "client!mn", name = "y", descriptor = "()V")
	public void method2788() {
		if (this.aShortArray63 == null) {
			this.method2730();
			return;
		}
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt3451; local7++) {
			this.anIntArray289[local7] = -this.anIntArray289[local7];
			this.anIntArray290[local7] = -this.anIntArray290[local7];
		}
		for (local7 = 0; local7 < this.anInt3453; local7++) {
			this.aShortArray63[local7] = (short) -this.aShortArray63[local7];
			this.aShortArray64[local7] = (short) -this.aShortArray64[local7];
		}
		this.aClass157_1.aBoolean334 = false;
		this.aClass110_3.aBoolean220 = false;
		if (this.aClass110_4 != null) {
			this.aClass110_4.aBoolean220 = false;
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
	@Override
	public void method2735(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class174.anIntArray444[arg0];
		@Pc(7) int local7 = Class174.anIntArray443[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3451; local9++) {
			@Pc(29) int local29 = this.anIntArray290[local9] * local3 + this.anIntArray289[local9] * local7 >> 16;
			this.anIntArray290[local9] = this.anIntArray290[local9] * local7 - this.anIntArray289[local9] * local3 >> 16;
			this.anIntArray289[local9] = local29;
		}
		this.aClass157_1.aBoolean334 = false;
		this.aClass110_3.aBoolean220 = false;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZZZ)Lclient!gk;")
	@Override
	public Class13_Sub1 method2729(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		return this.method2764(arg0, arg1, arg2, Static172.aClass13_Sub1_Sub2_4, Static172.aClass13_Sub1_Sub2_3);
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)V")
	@Override
	public void method2757(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class174.anIntArray444[arg0];
		@Pc(7) int local7 = Class174.anIntArray443[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3451; local9++) {
			@Pc(29) int local29 = this.anIntArray286[local9] * local3 + this.anIntArray289[local9] * local7 >> 16;
			this.anIntArray286[local9] = this.anIntArray286[local9] * local7 - this.anIntArray289[local9] * local3 >> 16;
			this.anIntArray289[local9] = local29;
		}
		this.aClass157_1.aBoolean334 = false;
		this.aClass110_3.aBoolean220 = false;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZZZZZZZ)V")
	public void method2790(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (this.aByte12 != 0) {
			throw new IllegalArgumentException();
		} else if (this.anInt3453 != 0) {
			if (arg5) {
				@Pc(26) boolean local26 = !this.aClass110_1.aBoolean220 && (arg1 || arg2 && !Static253.aBoolean335);
				this.method2768(false, !this.aClass110_3.aBoolean220 && arg0, local26, this.aClass110_4 != null && !this.aClass110_4.aBoolean220 && arg2, !this.aClass110_2.aBoolean220);
				if (!this.aClass110_5.aBoolean220 && arg3 && arg1) {
					this.method2778();
				}
			}
			if (arg0) {
				if (this.aClass110_3.aBoolean220) {
					if (!this.aClass157_1.aBoolean334) {
						this.method2763();
					}
					this.anIntArray289 = null;
					this.anIntArray286 = null;
					this.anIntArray290 = null;
					this.aShortArray66 = null;
					this.anIntArray285 = null;
				} else {
					this.aByte11 = (byte) (this.aByte11 | 0x1);
				}
			}
			if (arg1) {
				if (this.aClass110_1.aBoolean220) {
					this.aShortArray61 = null;
					this.aByteArray44 = null;
				} else {
					this.aByte11 = (byte) (this.aByte11 | 0x2);
				}
			}
			if (arg2 && Static253.aBoolean335) {
				if (this.aClass110_4.aBoolean220) {
					this.aShortArray63 = null;
					this.aShortArray65 = null;
					this.aShortArray64 = null;
					this.aShortArray67 = null;
				} else {
					this.aByte11 = (byte) (this.aByte11 | 0x4);
				}
			}
			if (this.aClass110_2.aBoolean220) {
				this.aFloatArray20 = null;
				this.aFloatArray19 = null;
			} else {
				this.aByte11 = (byte) (this.aByte11 | 0x8);
			}
			if (arg3 && arg1) {
				if (this.aClass110_5.aBoolean220 && this.aClass110_1.aBoolean220) {
					this.aShortArray62 = null;
					this.aShortArray59 = null;
					this.aShortArray57 = null;
				} else {
					this.aByte11 = (byte) (this.aByte11 | 0x10);
				}
			}
			if (arg4) {
				this.anIntArray287 = null;
				this.aByteArray45 = null;
				this.anIntArrayArray21 = null;
				this.anIntArrayArray22 = null;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[IIIIZ)V")
	@Override
	protected void method2734(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
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
			Static172.anInt3455 = 0;
			Static172.anInt3454 = 0;
			Static172.anInt3456 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray21.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray21[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						Static172.anInt3455 += this.anIntArray289[local53];
						Static172.anInt3454 += this.anIntArray286[local53];
						Static172.anInt3456 += this.anIntArray290[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				Static172.anInt3455 = Static172.anInt3455 / local18 + local8;
				Static172.anInt3454 = Static172.anInt3454 / local18 + local12;
				Static172.anInt3456 = Static172.anInt3456 / local18 + local16;
			} else {
				Static172.anInt3455 = local8;
				Static172.anInt3454 = local12;
				Static172.anInt3456 = local16;
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
				if (local26 < this.anIntArrayArray21.length) {
					local141 = this.anIntArrayArray21[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray289[local45] += local8;
						this.anIntArray286[local45] += local12;
						this.anIntArray290[local45] += local16;
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
				if (local26 < this.anIntArrayArray21.length) {
					local141 = this.anIntArrayArray21[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray289[local45] -= Static172.anInt3455;
						this.anIntArray286[local45] -= Static172.anInt3454;
						this.anIntArray290[local45] -= Static172.anInt3456;
						if (arg4 != 0) {
							local53 = Class174.anIntArray444[arg4];
							local246 = Class174.anIntArray443[arg4];
							local264 = this.anIntArray286[local45] * local53 + this.anIntArray289[local45] * local246 + 32767 >> 16;
							this.anIntArray286[local45] = this.anIntArray286[local45] * local246 + 32767 - this.anIntArray289[local45] * local53 >> 16;
							this.anIntArray289[local45] = local264;
						}
						if (arg2 != 0) {
							local53 = Class174.anIntArray444[arg2];
							local246 = Class174.anIntArray443[arg2];
							local264 = this.anIntArray286[local45] * local246 + 32767 - this.anIntArray290[local45] * local53 >> 16;
							this.anIntArray290[local45] = this.anIntArray286[local45] * local53 + this.anIntArray290[local45] * local246 + 32767 >> 16;
							this.anIntArray286[local45] = local264;
						}
						if (arg3 != 0) {
							local53 = Class174.anIntArray444[arg3];
							local246 = Class174.anIntArray443[arg3];
							local264 = this.anIntArray290[local45] * local53 + this.anIntArray289[local45] * local246 + 32767 >> 16;
							this.anIntArray290[local45] = this.anIntArray290[local45] * local246 + 32767 - this.anIntArray289[local45] * local53 >> 16;
							this.anIntArray289[local45] = local264;
						}
						this.anIntArray289[local45] += Static172.anInt3455;
						this.anIntArray286[local45] += Static172.anInt3454;
						this.anIntArray290[local45] += Static172.anInt3456;
					}
				}
			}
			if (arg5 && this.aShortArray63 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray21.length) {
						local141 = this.anIntArrayArray21[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray285[local45];
							local246 = this.anIntArray285[local45 + 1];
							for (local264 = local53; local264 < local246; local264++) {
								local484 = this.aShortArray66[local264] - 1;
								if (local484 == -1) {
									break;
								}
								@Pc(494) int local494;
								@Pc(498) int local498;
								@Pc(516) int local516;
								if (arg4 != 0) {
									local494 = Class174.anIntArray444[arg4];
									local498 = Class174.anIntArray443[arg4];
									local516 = this.aShortArray65[local484] * local494 + this.aShortArray63[local484] * local498 + 32767 >> 16;
									this.aShortArray65[local484] = (short) (this.aShortArray65[local484] * local498 + 32767 - this.aShortArray63[local484] * local494 >> 16);
									this.aShortArray63[local484] = (short) local516;
								}
								if (arg2 != 0) {
									local494 = Class174.anIntArray444[arg2];
									local498 = Class174.anIntArray443[arg2];
									local516 = this.aShortArray65[local484] * local498 + 32767 - this.aShortArray64[local484] * local494 >> 16;
									this.aShortArray64[local484] = (short) (this.aShortArray65[local484] * local494 + this.aShortArray64[local484] * local498 + 32767 >> 16);
									this.aShortArray65[local484] = (short) local516;
								}
								if (arg3 != 0) {
									local494 = Class174.anIntArray444[arg3];
									local498 = Class174.anIntArray443[arg3];
									local516 = this.aShortArray64[local484] * local494 + this.aShortArray63[local484] * local498 + 32767 >> 16;
									this.aShortArray64[local484] = (short) (this.aShortArray64[local484] * local498 + 32767 - this.aShortArray63[local484] * local494 >> 16);
									this.aShortArray63[local484] = (short) local516;
								}
							}
						}
					}
				}
				if (this.aClass110_4 != null) {
					this.aClass110_4.aBoolean220 = false;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray21.length) {
					local141 = this.anIntArrayArray21[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray289[local45] -= Static172.anInt3455;
						this.anIntArray286[local45] -= Static172.anInt3454;
						this.anIntArray290[local45] -= Static172.anInt3456;
						this.anIntArray289[local45] = this.anIntArray289[local45] * arg2 >> 7;
						this.anIntArray286[local45] = this.anIntArray286[local45] * arg3 >> 7;
						this.anIntArray290[local45] = this.anIntArray290[local45] * arg4 >> 7;
						this.anIntArray289[local45] += Static172.anInt3455;
						this.anIntArray286[local45] += Static172.anInt3454;
						this.anIntArray290[local45] += Static172.anInt3456;
					}
				}
			}
		} else if (arg0 == 5) {
			if (this.anIntArrayArray22 != null && this.aByteArray44 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray22.length) {
						local141 = this.anIntArrayArray22[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = (this.aByteArray44[local45] & 0xFF) + arg2 * 8;
							if (local53 < 0) {
								local53 = 0;
							} else if (local53 > 255) {
								local53 = 255;
							}
							this.aByteArray44[local45] = (byte) local53;
						}
						if (local141.length > 0) {
							this.aClass110_1.aBoolean220 = false;
						}
					}
				}
			}
		} else if (arg0 == 7 && this.anIntArrayArray22 != null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray22.length) {
					local141 = this.anIntArrayArray22[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						local53 = this.aShortArray61[local45] & 0xFFFF;
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
						this.aShortArray61[local45] = (short) (local932 << 10 | local264 << 7 | local484);
					}
					if (local141.length > 0) {
						this.aClass110_1.aBoolean220 = false;
					}
				}
			}
		}
	}
}
