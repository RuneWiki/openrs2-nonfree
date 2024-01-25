import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class57_Sub3 extends Class57 {

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "Lclient!pk;")
	private Class264 aClass264_1;

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "Lclient!pk;")
	private Class264 aClass264_2;

	@OriginalMember(owner = "client!nk", name = "A", descriptor = "I")
	private int anInt6784;

	@OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
	private int anInt6788;

	@OriginalMember(owner = "client!nk", name = "I", descriptor = "Lclient!vs;")
	private Class347 aClass347_1;

	@OriginalMember(owner = "client!nk", name = "S", descriptor = "Lclient!ifa;")
	private final Class44_Sub2 aClass44_Sub2_10;

	@OriginalMember(owner = "client!nk", name = "T", descriptor = "Z")
	private boolean aBoolean492;

	@OriginalMember(owner = "client!nk", name = "U", descriptor = "Lclient!pk;")
	private Class264 aClass264_3;

	@OriginalMember(owner = "client!nk", name = "X", descriptor = "Z")
	private boolean aBoolean493;

	@OriginalMember(owner = "client!nk", name = "hb", descriptor = "Lclient!bw;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!nk", name = "lb", descriptor = "Z")
	private boolean lb;

	@OriginalMember(owner = "client!nk", name = "qb", descriptor = "I")
	private int anInt6807;

	@OriginalMember(owner = "client!nk", name = "xb", descriptor = "I")
	private int anInt6811;

	@OriginalMember(owner = "client!nk", name = "Gb", descriptor = "I")
	private int anInt6815;

	@OriginalMember(owner = "client!nk", name = "Vb", descriptor = "I")
	private int anInt6828;

	@OriginalMember(owner = "client!nk", name = "Zb", descriptor = "Lclient!pk;")
	private Class264 aClass264_4;

	@OriginalMember(owner = "client!nk", name = "kc", descriptor = "I")
	private int anInt6839;

	@OriginalMember(owner = "client!nk", name = "nc", descriptor = "I")
	private int anInt6842;

	@OriginalMember(owner = "client!nk", name = "sc", descriptor = "I")
	private int anInt6846;

	@OriginalMember(owner = "client!nk", name = "zc", descriptor = "I")
	private int anInt6852;

	@OriginalMember(owner = "client!nk", name = "Jc", descriptor = "I")
	private int anInt6859;

	@OriginalMember(owner = "client!nk", name = "Db", descriptor = "[I")
	private int[] anIntArray356;

	@OriginalMember(owner = "client!nk", name = "xc", descriptor = "I")
	private int anInt6850;

	@OriginalMember(owner = "client!nk", name = "Fc", descriptor = "I")
	private int anInt6857;

	@OriginalMember(owner = "client!nk", name = "ub", descriptor = "Z")
	private boolean aBoolean494;

	@OriginalMember(owner = "client!nk", name = "Cc", descriptor = "I")
	private int anInt6855;

	@OriginalMember(owner = "client!nk", name = "nb", descriptor = "[I")
	private int[] anIntArray354;

	@OriginalMember(owner = "client!nk", name = "H", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!nk", name = "Hc", descriptor = "[I")
	private int[] anIntArray357;

	@OriginalMember(owner = "client!nk", name = "Kc", descriptor = "I")
	private int anInt6860;

	@OriginalMember(owner = "client!nk", name = "sb", descriptor = "[I")
	private int[] anIntArray355;

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "[Lclient!fk;")
	private Class103[] aClass103Array4;

	@OriginalMember(owner = "client!nk", name = "K", descriptor = "[Lclient!nba;")
	private Class227[] aClass227Array4;

	@OriginalMember(owner = "client!nk", name = "Jb", descriptor = "I")
	private int anInt6817;

	@OriginalMember(owner = "client!nk", name = "O", descriptor = "[Lclient!df;")
	private Class61[] aClass61Array1;

	@OriginalMember(owner = "client!nk", name = "kb", descriptor = "[Lclient!tw;")
	private Class323[] aClass323Array1;

	@OriginalMember(owner = "client!nk", name = "z", descriptor = "[B")
	private byte[] aByteArray81;

	@OriginalMember(owner = "client!nk", name = "oc", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!nk", name = "gc", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!nk", name = "R", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!nk", name = "vc", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!nk", name = "Cb", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!nk", name = "N", descriptor = "[B")
	private byte[] aByteArray82;

	@OriginalMember(owner = "client!nk", name = "Dc", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!nk", name = "y", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!nk", name = "W", descriptor = "[F")
	private float[] aFloatArray50;

	@OriginalMember(owner = "client!nk", name = "vb", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!nk", name = "Bb", descriptor = "S")
	private short aShort81;

	@OriginalMember(owner = "client!nk", name = "jc", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!nk", name = "yb", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!nk", name = "E", descriptor = "[F")
	private float[] aFloatArray49;

	@OriginalMember(owner = "client!nk", name = "Nb", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!nk", name = "Ic", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!nk", name = "fb", descriptor = "[I")
	private int[] anIntArray353;

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "[I")
	private int[] anIntArray350;

	@OriginalMember(owner = "client!nk", name = "F", descriptor = "[I")
	private int[] anIntArray352;

	@OriginalMember(owner = "client!nk", name = "eb", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!nk", name = "Ab", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!nk", name = "fc", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!ifa;Lclient!kk;IIII)V")
	public Class57_Sub3(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface11 local11 = arg0.anInterface11_11;
		@Pc(15) int[] local15 = new int[arg1.anInt5626];
		this.anIntArray356 = new int[arg1.anInt5612 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt5626; local24++) {
			if ((arg1.aByteArray65 == null || arg1.aByteArray65[local24] != 2) && (arg1.aShortArray65 == null || arg1.aShortArray65[local24] == -1 || !local11.method7405(arg1.aShortArray65[local24] & 0xFFFF).aBoolean14)) {
				local15[this.anInt6850++] = local24;
				this.anIntArray356[arg1.aShortArray61[local24]]++;
				this.anIntArray356[arg1.aShortArray59[local24]]++;
				this.anIntArray356[arg1.aShortArray68[local24]]++;
			}
		}
		this.anInt6857 = this.anInt6850;
		@Pc(116) long[] local116 = new long[this.anInt6850];
		@Pc(125) boolean local125 = (this.anInt6839 & 0x100) != 0;
		@Pc(137) int local137;
		@Pc(148) int local148;
		@Pc(283) int local283;
		label501: for (@Pc(127) int local127 = 0; local127 < this.anInt6850; local127++) {
			@Pc(133) int local133 = local15[local127];
			@Pc(135) Class14 local135 = null;
			local137 = 0;
			@Pc(139) byte local139 = 0;
			@Pc(141) byte local141 = 0;
			@Pc(143) byte local143 = 0;
			if (arg1.aClass287Array1 != null) {
				for (local148 = 0; local148 < arg1.aClass287Array1.length; local148++) {
					@Pc(155) Class287 local155 = arg1.aClass287Array1[local148];
					if (local155.anInt8501 == local133) {
						@Pc(168) Class285 local168 = Static71.method1199(local155.anInt8499);
						if (local168.aBoolean580) {
							local116[local127] = Long.MAX_VALUE;
							this.anInt6857--;
							continue label501;
						}
					}
				}
			}
			@Pc(191) short local191 = -1;
			if (arg1.aShortArray65 != null) {
				local191 = arg1.aShortArray65[local133];
				if (local191 != -1) {
					local135 = local11.method7405(local191 & 0xFFFF);
					local143 = local135.aByte5;
					local141 = local135.aByte9;
				}
			}
			@Pc(239) boolean local239 = arg1.aByteArray61 != null && arg1.aByteArray61[local133] != 0 || local135 != null && local135.aBoolean15 | !local135.aBoolean10;
			if ((local125 || local239) && arg1.aByteArray62 != null) {
				local137 += arg1.aByteArray62[local133] << 17;
			}
			if (local239) {
				local137 += 65536;
			}
			local137 += (local141 & 0xFF) << 8;
			local137 += local143 & 0xFF;
			local283 = local139 + ((local191 & 0xFFFF) << 16);
			@Pc(289) int local289 = local283 + (local127 & 0xFFFF);
			local116[local127] = ((long) local137 << 32) + ((long) local289);
			this.aBoolean494 |= local239;
		}
		Static475.method4820(local116, local15);
		this.anInt6855 = arg1.anInt5618;
		this.anIntArray354 = arg1.anIntArray278;
		this.aShortArray78 = arg1.aShortArray63;
		this.anIntArray357 = arg1.anIntArray272;
		this.anInt6860 = arg1.anInt5612;
		this.anIntArray355 = arg1.anIntArray279;
		this.aClass103Array4 = arg1.aClass103Array3;
		this.aClass227Array4 = arg1.aClass227Array3;
		@Pc(355) Class34[] local355 = new Class34[this.anInt6860];
		@Pc(375) int local375;
		@Pc(389) int local389;
		if (arg1.aClass287Array1 != null) {
			this.anInt6817 = arg1.aClass287Array1.length;
			this.aClass61Array1 = new Class61[this.anInt6817];
			this.aClass323Array1 = new Class323[this.anInt6817];
			for (local375 = 0; local375 < this.anInt6817; local375++) {
				@Pc(382) Class287 local382 = arg1.aClass287Array1[local375];
				@Pc(387) Class285 local387 = Static71.method1199(local382.anInt8499);
				local389 = -1;
				for (@Pc(391) int local391 = 0; local391 < this.anInt6850; local391++) {
					if (local15[local391] == local382.anInt8501) {
						local389 = local391;
						break;
					}
				}
				if (local389 == -1) {
					throw new RuntimeException();
				}
				local148 = Static15.anIntArray11[arg1.aShortArray66[local382.anInt8501] & 0xFFFF] & 0xFFFFFF;
				local148 |= 255 - (arg1.aByteArray61 == null ? 0 : arg1.aByteArray61[local382.anInt8501]) << 24;
				this.aClass61Array1[local375] = new Class61(local389, arg1.aShortArray61[local382.anInt8501], arg1.aShortArray59[local382.anInt8501], arg1.aShortArray68[local382.anInt8501], local387.anInt8284, local387.anInt8281, local387.anInt8280, local387.anInt8289, local387.anInt8290, local387.aBoolean580, local387.aBoolean581, local382.anInt8500);
				this.aClass323Array1[local375] = new Class323(local148);
			}
		}
		local375 = this.anInt6850 * 3;
		this.aByteArray81 = new byte[this.anInt6850];
		this.aShortArray86 = new short[this.anInt6850];
		Static107.aLongArray16 = new long[local375];
		this.aShortArray84 = new short[local375];
		this.aShortArray79 = new short[this.anInt6850];
		this.aShortArray87 = new short[local375];
		if (arg1.aShortArray60 != null) {
			this.aShortArray82 = new short[this.anInt6850];
		}
		this.aByteArray82 = new byte[local375];
		this.aShortArray88 = new short[local375];
		this.aShortArray77 = new short[this.anInt6850];
		this.aFloatArray50 = new float[local375];
		this.aShortArray80 = new short[local375];
		this.aShort81 = (short) arg4;
		this.aShortArray85 = new short[this.anInt6850];
		this.aShortArray81 = new short[local375];
		this.aFloatArray49 = new float[local375];
		this.aShortArray83 = new short[local375];
		this.aShortArray89 = new short[this.anInt6850];
		this.aShort80 = (short) arg3;
		local137 = 0;
		for (local283 = 0; local283 < arg1.anInt5612; local283++) {
			local389 = this.anIntArray356[local283];
			this.anIntArray356[local283] = local137;
			local137 += local389;
			local355[local283] = new Class34();
		}
		this.anIntArray356[arg1.anInt5612] = local137;
		@Pc(639) int[] local639 = null;
		@Pc(641) int[] local641 = null;
		@Pc(643) int[] local643 = null;
		@Pc(645) float[][] local645 = null;
		@Pc(663) int[] local663;
		@Pc(671) int local671;
		@Pc(712) int local712;
		@Pc(718) int local718;
		@Pc(732) int local732;
		@Pc(734) int local734;
		@Pc(767) int local767;
		@Pc(772) int local772;
		@Pc(941) float local941;
		@Pc(933) float local933;
		@Pc(925) float local925;
		if (arg1.aByteArray64 != null) {
			@Pc(651) int local651 = arg1.anInt5628;
			@Pc(654) int[] local654 = new int[local651];
			@Pc(657) int[] local657 = new int[local651];
			@Pc(660) int[] local660 = new int[local651];
			local663 = new int[local651];
			@Pc(666) int[] local666 = new int[local651];
			@Pc(669) int[] local669 = new int[local651];
			for (local671 = 0; local671 < local651; local671++) {
				local654[local671] = Integer.MAX_VALUE;
				local657[local671] = -2147483647;
				local660[local671] = Integer.MAX_VALUE;
				local663[local671] = -2147483647;
				local666[local671] = Integer.MAX_VALUE;
				local669[local671] = -2147483647;
			}
			local645 = new float[local651][];
			local641 = new int[local651];
			local643 = new int[local651];
			for (local712 = 0; local712 < this.anInt6850; local712++) {
				local718 = local15[local712];
				if (arg1.aByteArray64[local718] != -1) {
					local732 = arg1.aByteArray64[local718] & 0xFF;
					for (local734 = 0; local734 < 3; local734++) {
						@Pc(748) short local748;
						if (local734 == 0) {
							local748 = arg1.aShortArray61[local718];
						} else if (local734 == 1) {
							local748 = arg1.aShortArray59[local718];
						} else {
							local748 = arg1.aShortArray68[local718];
						}
						local767 = arg1.anIntArray278[local748];
						local772 = arg1.anIntArray272[local748];
						@Pc(777) int local777 = arg1.anIntArray279[local748];
						if (local654[local732] > local767) {
							local654[local732] = local767;
						}
						if (local767 > local657[local732]) {
							local657[local732] = local767;
						}
						if (local772 < local660[local732]) {
							local660[local732] = local772;
						}
						if (local772 > local663[local732]) {
							local663[local732] = local772;
						}
						if (local666[local732] > local777) {
							local666[local732] = local777;
						}
						if (local777 > local669[local732]) {
							local669[local732] = local777;
						}
					}
				}
			}
			local639 = new int[local651];
			for (local718 = 0; local718 < local651; local718++) {
				@Pc(868) byte local868 = arg1.aByteArray60[local718];
				if (local868 > 0) {
					local639[local718] = (local657[local718] + local654[local718]) / 2;
					local641[local718] = (local660[local718] + local663[local718]) / 2;
					local643[local718] = (local669[local718] + local666[local718]) / 2;
					if (local868 == 1) {
						local772 = arg1.anIntArray277[local718];
						local933 = 64.0F / (float) arg1.anIntArray275[local718];
						if (local772 == 0) {
							local925 = 1.0F;
							local941 = 1.0F;
						} else if (local772 > 0) {
							local941 = 1.0F;
							local925 = (float) local772 / 1024.0F;
						} else {
							local941 = (float) -local772 / 1024.0F;
							local925 = 1.0F;
						}
					} else if (local868 == 2) {
						local925 = 64.0F / (float) arg1.anIntArray274[local718];
						local941 = 64.0F / (float) arg1.anIntArray277[local718];
						local933 = 64.0F / (float) arg1.anIntArray275[local718];
					} else {
						local925 = (float) arg1.anIntArray274[local718] / 1024.0F;
						local933 = (float) arg1.anIntArray275[local718] / 1024.0F;
						local941 = (float) arg1.anIntArray277[local718] / 1024.0F;
					}
					local645[local718] = Static386.method6104(arg1.aShortArray67[local718], local933, arg1.aShortArray62[local718], arg1.aByteArray63[local718] & 0xFF, local941, arg1.aShortArray64[local718], local925);
				}
			}
		}
		@Pc(1053) Class192[] local1053 = new Class192[arg1.anInt5626];
		@Pc(1072) short local1072;
		@Pc(1082) int local1082;
		@Pc(1093) int local1093;
		for (@Pc(1055) int local1055 = 0; local1055 < arg1.anInt5626; local1055++) {
			@Pc(1062) short local1062 = arg1.aShortArray61[local1055];
			@Pc(1067) short local1067 = arg1.aShortArray59[local1055];
			local1072 = arg1.aShortArray68[local1055];
			local1082 = this.anIntArray354[local1067] - this.anIntArray354[local1062];
			local1093 = this.anIntArray357[local1067] - this.anIntArray357[local1062];
			local671 = this.anIntArray355[local1067] - this.anIntArray355[local1062];
			local712 = this.anIntArray354[local1072] - this.anIntArray354[local1062];
			local718 = this.anIntArray357[local1072] - this.anIntArray357[local1062];
			local732 = this.anIntArray355[local1072] - this.anIntArray355[local1062];
			local734 = local732 * local1093 - local718 * local671;
			@Pc(1154) int local1154 = local671 * local712 - local1082 * local732;
			for (local767 = local718 * local1082 - local1093 * local712; local734 > 8192 || local1154 > 8192 || local767 > 8192 || local734 < -8192 || local1154 < -8192 || local767 < -8192; local767 >>= 0x1) {
				local1154 >>= 0x1;
				local734 >>= 0x1;
			}
			local772 = (int) Math.sqrt((double) (local1154 * local1154 + local734 * local734 + local767 * local767));
			if (local772 <= 0) {
				local772 = 1;
			}
			local734 = local734 * 256 / local772;
			local767 = local767 * 256 / local772;
			local1154 = local1154 * 256 / local772;
			@Pc(1256) byte local1256 = arg1.aByteArray65 == null ? 0 : arg1.aByteArray65[local1055];
			if (local1256 == 0) {
				@Pc(1284) Class34 local1284 = local355[local1062];
				local1284.anInt540 += local767;
				local1284.anInt542++;
				local1284.anInt543 += local734;
				local1284.anInt541 += local1154;
				@Pc(1312) Class34 local1312 = local355[local1067];
				local1312.anInt542++;
				local1312.anInt543 += local734;
				local1312.anInt540 += local767;
				local1312.anInt541 += local1154;
				@Pc(1340) Class34 local1340 = local355[local1072];
				local1340.anInt540 += local767;
				local1340.anInt541 += local1154;
				local1340.anInt543 += local734;
				local1340.anInt542++;
			} else if (local1256 == 1) {
				@Pc(1269) Class192 local1269 = local1053[local1055] = new Class192();
				local1269.anInt5632 = local734;
				local1269.anInt5636 = local1154;
				local1269.anInt5633 = local767;
			}
		}
		@Pc(1377) int local1377;
		for (@Pc(1371) int local1371 = 0; local1371 < this.anInt6850; local1371++) {
			local1377 = local15[local1371];
			@Pc(1384) int local1384 = arg1.aShortArray66[local1377] & 0xFFFF;
			@Pc(1389) short local1389;
			if (arg1.aShortArray65 == null) {
				local1389 = -1;
			} else {
				local1389 = arg1.aShortArray65[local1377];
			}
			if (arg1.aByteArray64 == null) {
				local1093 = -1;
			} else {
				local1093 = arg1.aByteArray64[local1377];
			}
			if (arg1.aByteArray61 == null) {
				local671 = 0;
			} else {
				local671 = arg1.aByteArray61[local1377] & 0xFF;
			}
			@Pc(1424) float local1424 = 0.0F;
			@Pc(1426) float local1426 = 0.0F;
			@Pc(1428) float local1428 = 0.0F;
			local941 = 0.0F;
			local933 = 0.0F;
			local925 = 0.0F;
			@Pc(1436) byte local1436 = 0;
			@Pc(1438) byte local1438 = 0;
			@Pc(1440) int local1440 = 0;
			@Pc(1456) byte local1456;
			@Pc(1476) short local1476;
			@Pc(1481) short local1481;
			@Pc(1486) short local1486;
			if (local1389 != -1) {
				if (local1093 == -1) {
					local1438 = 2;
					local925 = 0.0F;
					local941 = 1.0F;
					local1428 = 1.0F;
					local1424 = 0.0F;
					local1426 = 1.0F;
					local1436 = 1;
					local933 = 0.0F;
				} else {
					local1093 &= 0xFF;
					local1456 = arg1.aByteArray60[local1093];
					@Pc(1466) short local1466;
					@Pc(1471) short local1471;
					@Pc(1509) float local1509;
					@Pc(1518) float local1518;
					@Pc(1526) float local1526;
					@Pc(1612) float local1612;
					@Pc(1620) float local1620;
					@Pc(1629) float local1629;
					@Pc(1637) float local1637;
					@Pc(1646) float local1646;
					@Pc(1654) float local1654;
					if (local1456 == 0) {
						local1466 = arg1.aShortArray61[local1377];
						local1471 = arg1.aShortArray59[local1377];
						local1476 = arg1.aShortArray68[local1377];
						local1481 = arg1.aShortArray67[local1093];
						local1486 = arg1.aShortArray64[local1093];
						@Pc(1491) short local1491 = arg1.aShortArray62[local1093];
						@Pc(1497) float local1497 = (float) arg1.anIntArray278[local1481];
						@Pc(1503) float local1503 = (float) arg1.anIntArray272[local1481];
						local1509 = arg1.anIntArray279[local1481];
						local1518 = (float) arg1.anIntArray278[local1486] - local1497;
						local1526 = (float) arg1.anIntArray272[local1486] - local1503;
						@Pc(1535) float local1535 = (float) arg1.anIntArray279[local1486] - local1509;
						@Pc(1543) float local1543 = (float) arg1.anIntArray278[local1491] - local1497;
						@Pc(1552) float local1552 = (float) arg1.anIntArray272[local1491] - local1503;
						@Pc(1560) float local1560 = (float) arg1.anIntArray279[local1491] - local1509;
						@Pc(1568) float local1568 = (float) arg1.anIntArray278[local1466] - local1497;
						@Pc(1577) float local1577 = (float) arg1.anIntArray272[local1466] - local1503;
						@Pc(1586) float local1586 = (float) arg1.anIntArray279[local1466] - local1509;
						@Pc(1595) float local1595 = (float) arg1.anIntArray278[local1471] - local1497;
						@Pc(1603) float local1603 = (float) arg1.anIntArray272[local1471] - local1503;
						local1612 = (float) arg1.anIntArray279[local1471] - local1509;
						local1620 = (float) arg1.anIntArray278[local1476] - local1497;
						local1629 = (float) arg1.anIntArray272[local1476] - local1503;
						local1637 = (float) arg1.anIntArray279[local1476] - local1509;
						local1646 = local1526 * local1560 - local1552 * local1535;
						local1654 = local1535 * local1543 - local1560 * local1518;
						@Pc(1662) float local1662 = local1552 * local1518 - local1543 * local1526;
						@Pc(1671) float local1671 = local1662 * local1552 - local1560 * local1654;
						@Pc(1680) float local1680 = local1646 * local1560 - local1543 * local1662;
						@Pc(1689) float local1689 = local1654 * local1543 - local1646 * local1552;
						@Pc(1703) float local1703 = 1.0F / (local1680 * local1526 + local1671 * local1518 + local1535 * local1689);
						local933 = local1703 * (local1689 * local1637 + local1629 * local1680 + local1620 * local1671);
						local1424 = (local1689 * local1586 + local1577 * local1680 + local1671 * local1568) * local1703;
						local1428 = (local1612 * local1689 + local1595 * local1671 + local1603 * local1680) * local1703;
						@Pc(1753) float local1753 = local1646 * local1535 - local1662 * local1518;
						@Pc(1762) float local1762 = local1518 * local1654 - local1646 * local1526;
						@Pc(1771) float local1771 = local1526 * local1662 - local1654 * local1535;
						@Pc(1785) float local1785 = 1.0F / (local1552 * local1753 + local1771 * local1543 + local1560 * local1762);
						local925 = local1785 * (local1637 * local1762 + local1629 * local1753 + local1620 * local1771);
						local941 = local1785 * (local1612 * local1762 + local1771 * local1595 + local1603 * local1753);
						local1426 = local1785 * (local1753 * local1577 + local1771 * local1568 + local1762 * local1586);
					} else {
						local1466 = arg1.aShortArray61[local1377];
						local1471 = arg1.aShortArray59[local1377];
						local1476 = arg1.aShortArray68[local1377];
						@Pc(1848) int local1848 = local639[local1093];
						@Pc(1852) int local1852 = local641[local1093];
						@Pc(1856) int local1856 = local643[local1093];
						@Pc(1860) float[] local1860 = local645[local1093];
						@Pc(1865) byte local1865 = arg1.aByteArray66[local1093];
						local1509 = (float) arg1.anIntArray270[local1093] / 256.0F;
						if (local1456 == 1) {
							local1518 = (float) arg1.anIntArray274[local1093] / 1024.0F;
							Static244.method3924(local1848, local1856, local1852, local1518, arg1.anIntArray278[local1466], local1509, arg1.anIntArray272[local1466], arg1.anIntArray279[local1466], local1865, local1860);
							local1426 = Static290.aFloat187;
							local1424 = Static508.aFloat218;
							Static244.method3924(local1848, local1856, local1852, local1518, arg1.anIntArray278[local1471], local1509, arg1.anIntArray272[local1471], arg1.anIntArray279[local1471], local1865, local1860);
							local941 = Static290.aFloat187;
							local1428 = Static508.aFloat218;
							Static244.method3924(local1848, local1856, local1852, local1518, arg1.anIntArray278[local1476], local1509, arg1.anIntArray272[local1476], arg1.anIntArray279[local1476], local1865, local1860);
							local925 = Static290.aFloat187;
							local933 = Static508.aFloat218;
							local1526 = local1518 / 2.0F;
							if ((local1865 & 0x1) == 0) {
								if (local1428 - local1424 > local1526) {
									local1436 = 1;
									local1428 -= local1518;
								} else if (local1526 < local1424 - local1428) {
									local1436 = 2;
									local1428 += local1518;
								}
								if (local933 - local1424 > local1526) {
									local933 -= local1518;
									local1438 = 1;
								} else if (local1526 < local1424 - local933) {
									local1438 = 2;
									local933 += local1518;
								}
							} else {
								if (local1526 < local925 - local1426) {
									local925 -= local1518;
									local1438 = 1;
								} else if (local1426 - local925 > local1526) {
									local925 += local1518;
									local1438 = 2;
								}
								if (local941 - local1426 > local1526) {
									local941 -= local1518;
									local1436 = 1;
								} else if (local1526 < local1426 - local941) {
									local1436 = 2;
									local941 += local1518;
								}
							}
						} else if (local1456 == 2) {
							local1518 = (float) arg1.anIntArray273[local1093] / 256.0F;
							local1526 = (float) arg1.anIntArray276[local1093] / 256.0F;
							@Pc(2102) int local2102 = arg1.anIntArray278[local1471] - arg1.anIntArray278[local1466];
							@Pc(2113) int local2113 = arg1.anIntArray272[local1471] - arg1.anIntArray272[local1466];
							@Pc(2124) int local2124 = arg1.anIntArray279[local1471] - arg1.anIntArray279[local1466];
							@Pc(2134) int local2134 = arg1.anIntArray278[local1476] - arg1.anIntArray278[local1466];
							@Pc(2145) int local2145 = arg1.anIntArray272[local1476] - arg1.anIntArray272[local1466];
							@Pc(2156) int local2156 = arg1.anIntArray279[local1476] - arg1.anIntArray279[local1466];
							@Pc(2165) int local2165 = local2113 * local2156 - local2124 * local2145;
							@Pc(2174) int local2174 = local2124 * local2134 - local2102 * local2156;
							@Pc(2183) int local2183 = local2102 * local2145 - local2113 * local2134;
							local1612 = 64.0F / (float) arg1.anIntArray277[local1093];
							local1620 = 64.0F / (float) arg1.anIntArray275[local1093];
							local1629 = 64.0F / (float) arg1.anIntArray274[local1093];
							local1637 = (local1860[2] * (float) local2183 + local1860[0] * (float) local2165 + local1860[1] * (float) local2174) / local1612;
							local1646 = ((float) local2174 * local1860[4] + (float) local2165 * local1860[3] + (float) local2183 * local1860[5]) / local1620;
							local1654 = ((float) local2183 * local1860[8] + (float) local2165 * local1860[6] + local1860[7] * (float) local2174) / local1629;
							local1440 = Static570.method8151(local1646, local1637, local1654);
							Static342.method5573(arg1.anIntArray279[local1466], arg1.anIntArray278[local1466], local1526, arg1.anIntArray272[local1466], local1856, local1848, local1852, local1860, local1865, local1518, local1509, local1440);
							local1424 = Static63.aFloat35;
							local1426 = Static373.aFloat199;
							Static342.method5573(arg1.anIntArray279[local1471], arg1.anIntArray278[local1471], local1526, arg1.anIntArray272[local1471], local1856, local1848, local1852, local1860, local1865, local1518, local1509, local1440);
							local941 = Static373.aFloat199;
							local1428 = Static63.aFloat35;
							Static342.method5573(arg1.anIntArray279[local1476], arg1.anIntArray278[local1476], local1526, arg1.anIntArray272[local1476], local1856, local1848, local1852, local1860, local1865, local1518, local1509, local1440);
							local925 = Static373.aFloat199;
							local933 = Static63.aFloat35;
						} else if (local1456 == 3) {
							Static98.method2169(arg1.anIntArray272[local1466], arg1.anIntArray278[local1466], local1865, local1509, arg1.anIntArray279[local1466], local1856, local1860, local1852, local1848);
							local1424 = Static31.aFloat16;
							local1426 = Static87.aFloat85;
							Static98.method2169(arg1.anIntArray272[local1471], arg1.anIntArray278[local1471], local1865, local1509, arg1.anIntArray279[local1471], local1856, local1860, local1852, local1848);
							local1428 = Static31.aFloat16;
							local941 = Static87.aFloat85;
							Static98.method2169(arg1.anIntArray272[local1476], arg1.anIntArray278[local1476], local1865, local1509, arg1.anIntArray279[local1476], local1856, local1860, local1852, local1848);
							local925 = Static87.aFloat85;
							local933 = Static31.aFloat16;
							if ((local1865 & 0x1) == 0) {
								if (local933 - local1424 > 0.5F) {
									local1438 = 1;
									local933--;
								} else if (local1424 - local933 > 0.5F) {
									local933++;
									local1438 = 2;
								}
								if (local1428 - local1424 > 0.5F) {
									local1428--;
									local1436 = 1;
								} else if (local1424 - local1428 > 0.5F) {
									local1428++;
									local1436 = 2;
								}
							} else {
								if (local941 - local1426 > 0.5F) {
									local1436 = 1;
									local941--;
								} else if (local1426 - local941 > 0.5F) {
									local941++;
									local1436 = 2;
								}
								if (local925 - local1426 > 0.5F) {
									local1438 = 1;
									local925--;
								} else if (local1426 - local925 > 0.5F) {
									local1438 = 2;
									local925++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray65 == null) {
				local1456 = 0;
			} else {
				local1456 = arg1.aByteArray65[local1377];
			}
			if (local1456 == 0) {
				@Pc(2623) long local2623 = (long) (local1093 << 2) + ((long) (local1384 << 8) + (long) (local1440 << 24) + (long) local671 << 32);
				local1476 = arg1.aShortArray61[local1377];
				local1481 = arg1.aShortArray59[local1377];
				local1486 = arg1.aShortArray68[local1377];
				@Pc(2642) Class34 local2642 = local355[local1476];
				this.aShortArray77[local1371] = this.method5689(local1371, local2642.anInt542, local2642.anInt541, local1426, local2642.anInt543, arg1, local1476, local1424, local2623, local2642.anInt540);
				@Pc(2667) Class34 local2667 = local355[local1481];
				this.aShortArray85[local1371] = this.method5689(local1371, local2667.anInt542, local2667.anInt541, local941, local2667.anInt543, arg1, local1481, local1428, local2623 + (long) local1436, local2667.anInt540);
				@Pc(2695) Class34 local2695 = local355[local1486];
				this.aShortArray89[local1371] = this.method5689(local1371, local2695.anInt542, local2695.anInt541, local925, local2695.anInt543, arg1, local1486, local933, local2623 + (long) local1438, local2695.anInt540);
			} else if (local1456 == 1) {
				@Pc(2728) Class192 local2728 = local1053[local1377];
				@Pc(2773) long local2773 = (long) ((local2728.anInt5636 + 256 << 12) + (local1093 << 2) + (local2728.anInt5632 <= 0 ? 2048 : 1024) + (local2728.anInt5633 - -256 << 22)) + ((long) local671 + (long) (local1384 << 8) + (long) (local1440 << 24) << 32);
				this.aShortArray77[local1371] = this.method5689(local1371, 0, local2728.anInt5636, local1426, local2728.anInt5632, arg1, arg1.aShortArray61[local1377], local1424, local2773, local2728.anInt5633);
				this.aShortArray85[local1371] = this.method5689(local1371, 0, local2728.anInt5636, local941, local2728.anInt5632, arg1, arg1.aShortArray59[local1377], local1428, (long) local1436 + local2773, local2728.anInt5633);
				this.aShortArray89[local1371] = this.method5689(local1371, 0, local2728.anInt5636, local925, local2728.anInt5632, arg1, arg1.aShortArray68[local1377], local933, local2773 + (long) local1438, local2728.anInt5633);
			}
			if (arg1.aShortArray65 == null) {
				this.aShortArray86[local1371] = -1;
			} else {
				this.aShortArray86[local1371] = arg1.aShortArray65[local1377];
			}
			if (arg1.aByteArray61 != null) {
				this.aByteArray81[local1371] = arg1.aByteArray61[local1377];
			}
			if (arg1.aShortArray60 != null) {
				this.aShortArray82[local1371] = arg1.aShortArray60[local1377];
			}
			this.aShortArray79[local1371] = arg1.aShortArray66[local1377];
		}
		if (this.anInt6857 > 0) {
			local1377 = 1;
			local1072 = this.aShortArray86[0];
			for (local1082 = 0; local1082 < this.anInt6857; local1082++) {
				@Pc(2924) short local2924 = this.aShortArray86[local1082];
				if (local2924 != local1072) {
					local1377++;
					local1072 = local2924;
				}
			}
			this.anIntArray353 = new int[local1377];
			this.anIntArray350 = new int[local1377];
			this.anIntArray352 = new int[local1377 + 1];
			this.anIntArray352[0] = 0;
			local1093 = this.anInt6807;
			local1377 = 0;
			local1072 = this.aShortArray86[0];
			@Pc(2966) short local2966 = 0;
			for (local712 = 0; local712 < this.anInt6857; local712++) {
				@Pc(2975) short local2975 = this.aShortArray86[local712];
				if (local1072 != local2975) {
					this.anIntArray350[local1377] = local1093;
					this.anIntArray353[local1377] = local2966 + 1 - local1093;
					local1377++;
					this.anIntArray352[local1377] = local712;
					local1072 = local2975;
					local2966 = 0;
					local1093 = this.anInt6807;
				}
				@Pc(3011) short local3011 = this.aShortArray77[local712];
				if (local1093 > local3011) {
					local1093 = local3011;
				}
				if (local3011 > local2966) {
					local2966 = local3011;
				}
				local3011 = this.aShortArray85[local712];
				if (local2966 < local3011) {
					local2966 = local3011;
				}
				if (local1093 > local3011) {
					local1093 = local3011;
				}
				local3011 = this.aShortArray89[local712];
				if (local3011 > local2966) {
					local2966 = local3011;
				}
				if (local3011 < local1093) {
					local1093 = local3011;
				}
			}
			this.anIntArray350[local1377] = local1093;
			this.anIntArray353[local1377] = local2966 + 1 - local1093;
			local1377++;
			this.anIntArray352[local1377] = this.anInt6857;
		}
		Static107.aLongArray16 = null;
		this.aShortArray81 = Static526.method3101(this.anInt6807, this.aShortArray81);
		this.aShortArray83 = Static526.method3101(this.anInt6807, this.aShortArray83);
		this.aShortArray87 = Static526.method3101(this.anInt6807, this.aShortArray87);
		this.aShortArray80 = Static526.method3101(this.anInt6807, this.aShortArray80);
		this.aShortArray84 = Static526.method3101(this.anInt6807, this.aShortArray84);
		this.aByteArray82 = Static224.method3667(this.aByteArray82, this.anInt6807);
		this.aFloatArray50 = Static401.method6310(this.anInt6807, this.aFloatArray50);
		this.aFloatArray49 = Static401.method6310(this.anInt6807, this.aFloatArray49);
		if (arg1.anIntArray271 != null && Static7.method140(this.anInt6859, arg2)) {
			this.anIntArrayArray36 = arg1.method4764(false);
		}
		if (arg1.aClass287Array1 != null && Static128.method2630(this.anInt6859, arg2)) {
			this.anIntArrayArray37 = arg1.method4759();
		}
		if (arg1.anIntArray269 != null && Static476.method7152(arg2, this.anInt6859)) {
			local1377 = 0;
			local663 = new int[256];
			for (local1082 = 0; local1082 < this.anInt6850; local1082++) {
				local1093 = arg1.anIntArray269[local15[local1082]];
				if (local1093 >= 0) {
					if (local1093 > local1377) {
						local1377 = local1093;
					}
					@Pc(3233) int local3233 = local663[local1093]++;
				}
			}
			this.anIntArrayArray38 = new int[local1377 + 1][];
			for (local1093 = 0; local1093 <= local1377; local1093++) {
				this.anIntArrayArray38[local1093] = new int[local663[local1093]];
				local663[local1093] = 0;
			}
			for (local671 = 0; local671 < this.anInt6850; local671++) {
				local712 = arg1.anIntArray269[local15[local671]];
				if (local712 >= 0) {
					this.anIntArrayArray38[local712][local663[local712]++] = local671;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!ifa;IIZZ)V")
	public Class57_Sub3(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.lb = true;
		this.anInt6807 = 0;
		this.aBoolean493 = false;
		this.anInt6850 = 0;
		this.aBoolean494 = false;
		this.anInt6857 = 0;
		this.aBoolean492 = false;
		this.anInt6855 = 0;
		this.anInt6860 = 0;
		this.aBoolean492 = arg4;
		this.aClass44_Sub2_10 = arg0;
		this.anInt6859 = arg2;
		this.anInt6839 = arg1;
		if (arg3 || Static526.method3100(this.anInt6859, this.anInt6839)) {
			this.aClass264_2 = new Class264(Static485.method7231(this.anInt6839, this.anInt6859));
		}
		if (arg3 || Static222.method3619(this.anInt6859, this.anInt6839)) {
			this.aClass264_4 = new Class264(Static544.method7890(this.anInt6839, this.anInt6859));
		}
		if (arg3 || Static570.method8152(this.anInt6839, this.anInt6859)) {
			this.aClass264_1 = new Class264(Static401.method6308(this.anInt6839, this.anInt6859));
		}
		if (arg3 || Static217.method8380(this.anInt6859, this.anInt6839)) {
			this.aClass264_3 = new Class264(Static347.method5596(this.anInt6859, this.anInt6839));
		}
		if (arg3 || Static112.method2453(this.anInt6859, this.anInt6839)) {
			this.aClass347_1 = new Class347(Static420.method6570(this.anInt6839, this.anInt6859));
		}
	}

	@OriginalMember(owner = "client!nk", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub27.anIntArray296[arg0];
		@Pc(13) int local13 = Class4_Sub27.anIntArray297[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6860; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray357[local15] + local13 * this.anIntArray354[local15] >> 14;
			this.anIntArray357[local15] = this.anIntArray357[local15] * local13 - local9 * this.anIntArray354[local15] >> 14;
			this.anIntArray354[local15] = local34;
		}
		this.method5705();
		this.aBoolean493 = false;
	}

	@OriginalMember(owner = "client!nk", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local24 = 0;
			Static299.anInt6041 = 0;
			Static347.anInt6686 = 0;
			Static344.anInt6660 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray36.length) {
					local52 = this.anIntArrayArray36[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray78 == null || (this.aShortArray78[local60] & arg6) != 0) {
							Static299.anInt6041 += this.anIntArray354[local60];
							Static344.anInt6660 += this.anIntArray357[local60];
							local24++;
							Static347.anInt6686 += this.anIntArray355[local60];
						}
					}
				}
			}
			if (local24 <= 0) {
				Static299.anInt6041 = arg2;
				Static347.anInt6686 = arg4;
				Static344.anInt6660 = arg3;
			} else {
				Static112.aBoolean193 = true;
				Static299.anInt6041 = arg2 + Static299.anInt6041 / local24;
				Static344.anInt6660 = Static344.anInt6660 / local24 + arg3;
				Static347.anInt6686 = Static347.anInt6686 / local24 + arg4;
			}
			return;
		}
		@Pc(248) int[] local248;
		@Pc(250) int local250;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg4 * arg7[2] + arg7[0] * arg2 + arg3 * arg7[1] + 8192 >> 14;
				local32 = arg3 * arg7[4] + arg7[3] * arg2 + arg4 * arg7[5] + 8192 >> 14;
				local38 = arg7[7] * arg3 + arg2 * arg7[6] + arg7[8] * arg4 + 8192 >> 14;
				arg3 = local32;
				arg2 = local24;
				arg4 = local38;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray36.length) {
					local248 = this.anIntArrayArray36[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local54 = local248[local250];
						if (this.aShortArray78 == null || (this.aShortArray78[local54] & arg6) != 0) {
							this.anIntArray354[local54] += arg2;
							this.anIntArray357[local54] += arg3;
							this.anIntArray355[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(376) int local376;
		@Pc(398) int local398;
		@Pc(428) int local428;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(637) int local637;
		@Pc(662) int local662;
		@Pc(666) int local666;
		@Pc(675) int local675;
		@Pc(680) int local680;
		@Pc(684) int local684;
		@Pc(688) int local688;
		@Pc(690) int local690;
		@Pc(818) int[] local818;
		@Pc(820) int local820;
		@Pc(824) int local824;
		@Pc(828) int local828;
		@Pc(830) int local830;
		@Pc(958) int local958;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray36.length > local32) {
						local248 = this.anIntArrayArray36[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local54 = local248[local250];
							if (this.aShortArray78 == null || (this.aShortArray78[local54] & arg6) != 0) {
								this.anIntArray354[local54] -= Static299.anInt6041;
								this.anIntArray357[local54] -= Static344.anInt6660;
								this.anIntArray355[local54] -= Static347.anInt6686;
								if (arg4 != 0) {
									local60 = Class4_Sub27.anIntArray296[arg4];
									local376 = Class4_Sub27.anIntArray297[arg4];
									local398 = local60 * this.anIntArray357[local54] + this.anIntArray354[local54] * local376 + 16383 >> 14;
									this.anIntArray357[local54] = local376 * this.anIntArray357[local54] + 16383 - this.anIntArray354[local54] * local60 >> 14;
									this.anIntArray354[local54] = local398;
								}
								if (arg2 != 0) {
									local60 = Class4_Sub27.anIntArray296[arg2];
									local376 = Class4_Sub27.anIntArray297[arg2];
									local398 = this.anIntArray357[local54] * local376 + 16383 - local60 * this.anIntArray355[local54] >> 14;
									this.anIntArray355[local54] = this.anIntArray355[local54] * local376 + this.anIntArray357[local54] * local60 + 16383 >> 14;
									this.anIntArray357[local54] = local398;
								}
								if (arg3 != 0) {
									local60 = Class4_Sub27.anIntArray296[arg3];
									local376 = Class4_Sub27.anIntArray297[arg3];
									local398 = this.anIntArray354[local54] * local376 + this.anIntArray355[local54] * local60 + 16383 >> 14;
									this.anIntArray355[local54] = this.anIntArray355[local54] * local376 + 16383 - local60 * this.anIntArray354[local54] >> 14;
									this.anIntArray354[local54] = local398;
								}
								this.anIntArray354[local54] += Static299.anInt6041;
								this.anIntArray357[local54] += Static344.anInt6660;
								this.anIntArray355[local54] += Static347.anInt6686;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray36.length > local38) {
							local52 = this.anIntArrayArray36[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray78 == null || (arg6 & this.aShortArray78[local60]) != 0) {
									local376 = this.anIntArray356[local60];
									local398 = this.anIntArray356[local60 + 1];
									for (local428 = local376; local428 < local398; local428++) {
										local455 = this.aShortArray88[local428] - 1;
										if (local455 == -1) {
											break;
										}
										if (arg4 != 0) {
											local459 = Class4_Sub27.anIntArray296[arg4];
											local463 = Class4_Sub27.anIntArray297[arg4];
											local467 = this.aShortArray80[local455] * local459 + local463 * this.aShortArray87[local455] + 16383 >> 14;
											this.aShortArray80[local455] = (short) (local463 * this.aShortArray80[local455] + 16383 - local459 * this.aShortArray87[local455] >> 14);
											this.aShortArray87[local455] = (short) local467;
										}
										if (arg2 != 0) {
											local459 = Class4_Sub27.anIntArray296[arg2];
											local463 = Class4_Sub27.anIntArray297[arg2];
											local467 = this.aShortArray80[local455] * local463 + 16383 - local459 * this.aShortArray84[local455] >> 14;
											this.aShortArray84[local455] = (short) (local463 * this.aShortArray84[local455] + this.aShortArray80[local455] * local459 + 16383 >> 14);
											this.aShortArray80[local455] = (short) local467;
										}
										if (arg3 != 0) {
											local459 = Class4_Sub27.anIntArray296[arg3];
											local463 = Class4_Sub27.anIntArray297[arg3];
											local467 = local463 * this.aShortArray87[local455] + this.aShortArray84[local455] * local459 + 16383 >> 14;
											this.aShortArray84[local455] = (short) (local463 * this.aShortArray84[local455] + 16383 - local459 * this.aShortArray87[local455] >> 14);
											this.aShortArray87[local455] = (short) local467;
										}
									}
								}
							}
						}
					}
					this.method5696();
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local250 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static112.aBoolean193) {
					local376 = Static347.anInt6686 * arg7[6] + arg7[0] * Static299.anInt6041 + Static344.anInt6660 * arg7[3] + 8192 >> 14;
					local398 = Static347.anInt6686 * arg7[7] + arg7[4] * Static344.anInt6660 + Static299.anInt6041 * arg7[1] + 8192 >> 14;
					local376 += local250;
					local398 += local54;
					local428 = Static299.anInt6041 * arg7[2] + Static344.anInt6660 * arg7[5] + Static347.anInt6686 * arg7[8] + 8192 >> 14;
					local428 += local60;
					Static299.anInt6041 = local376;
					Static344.anInt6660 = local398;
					Static112.aBoolean193 = false;
					Static347.anInt6686 = local428;
				}
				@Pc(443) int[] local443 = new int[9];
				local398 = Class4_Sub27.anIntArray297[arg2];
				local428 = Class4_Sub27.anIntArray296[arg2];
				local455 = Class4_Sub27.anIntArray297[arg3];
				local459 = Class4_Sub27.anIntArray296[arg3];
				local463 = Class4_Sub27.anIntArray297[arg4];
				local467 = Class4_Sub27.anIntArray296[arg4];
				local475 = local463 * local428 + 8192 >> 14;
				local483 = local467 * local428 + 8192 >> 14;
				local443[1] = local475 * local459 + -local455 * local467 + 8192 >> 14;
				local443[6] = -local459 * local463 + local483 * local455 + 8192 >> 14;
				local443[4] = local398 * local463 + 8192 >> 14;
				local443[0] = local459 * local483 + local455 * local463 + 8192 >> 14;
				local443[2] = local398 * local459 + 8192 >> 14;
				local443[8] = local455 * local398 + 8192 >> 14;
				local443[5] = -local428;
				local443[3] = local398 * local467 + 8192 >> 14;
				local443[7] = local475 * local455 + local467 * local459 + 8192 >> 14;
				@Pc(612) int local612 = local443[1] * -Static344.anInt6660 + -Static299.anInt6041 * local443[0] + local443[2] * -Static347.anInt6686 + 8192 >> 14;
				local637 = local443[4] * -Static344.anInt6660 + -Static299.anInt6041 * local443[3] + local443[5] * -Static347.anInt6686 + 8192 >> 14;
				local662 = -Static347.anInt6686 * local443[8] + -Static344.anInt6660 * local443[7] + -Static299.anInt6041 * local443[6] + 8192 >> 14;
				local666 = Static299.anInt6041 + local612;
				@Pc(671) int local671 = local637 + Static344.anInt6660;
				local675 = Static347.anInt6686 + local662;
				@Pc(678) int[] local678 = new int[9];
				for (local680 = 0; local680 < 3; local680++) {
					for (local684 = 0; local684 < 3; local684++) {
						local688 = 0;
						for (local690 = 0; local690 < 3; local690++) {
							local688 += arg7[local690 + local684 * 3] * local443[local690 + local680 * 3];
						}
						local678[local684 + local680 * 3] = local688 + 8192 >> 14;
					}
				}
				local684 = local250 * local443[0] + local443[1] * local54 + local60 * local443[2] + 8192 >> 14;
				local688 = local54 * local443[4] + local443[3] * local250 + local60 * local443[5] + 8192 >> 14;
				local688 += local671;
				local684 += local666;
				local690 = local54 * local443[7] + local443[6] * local250 + local443[8] * local60 + 8192 >> 14;
				local690 += local675;
				local818 = new int[9];
				for (local820 = 0; local820 < 3; local820++) {
					for (local824 = 0; local824 < 3; local824++) {
						local828 = 0;
						for (local830 = 0; local830 < 3; local830++) {
							local828 += local678[local824 + local830 * 3] * arg7[local820 * 3 + local830];
						}
						local818[local820 * 3 + local824] = local828 + 8192 >> 14;
					}
				}
				local824 = local684 * arg7[0] + arg7[1] * local688 + arg7[2] * local690 + 8192 >> 14;
				local828 = local688 * arg7[4] + local684 * arg7[3] + arg7[5] * local690 + 8192 >> 14;
				local830 = arg7[8] * local690 + local684 * arg7[6] + local688 * arg7[7] + 8192 >> 14;
				local824 += local24;
				local828 += local32;
				local830 += local38;
				for (local958 = 0; local958 < local8; local958++) {
					@Pc(964) int local964 = arg1[local958];
					if (local964 < this.anIntArrayArray36.length) {
						@Pc(978) int[] local978 = this.anIntArrayArray36[local964];
						for (@Pc(980) int local980 = 0; local980 < local978.length; local980++) {
							@Pc(986) int local986 = local978[local980];
							if (this.aShortArray78 == null || (this.aShortArray78[local986] & arg6) != 0) {
								@Pc(1030) int local1030 = local818[2] * this.anIntArray355[local986] + this.anIntArray357[local986] * local818[1] + this.anIntArray354[local986] * local818[0] + 8192 >> 14;
								@Pc(1062) int local1062 = local818[4] * this.anIntArray357[local986] + this.anIntArray354[local986] * local818[3] + local818[5] * this.anIntArray355[local986] + 8192 >> 14;
								@Pc(1094) int local1094 = local818[6] * this.anIntArray354[local986] + this.anIntArray357[local986] * local818[7] + this.anIntArray355[local986] * local818[8] + 8192 >> 14;
								@Pc(1098) int local1098 = local1030 + local824;
								@Pc(1102) int local1102 = local1062 + local828;
								this.anIntArray354[local986] = local1098;
								@Pc(1111) int local1111 = local1094 + local830;
								this.anIntArray357[local986] = local1102;
								this.anIntArray355[local986] = local1111;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2602) Class323 local2602;
			@Pc(2487) boolean local2487;
			@Pc(2597) Class61 local2597;
			if (arg0 == 5) {
				if (this.anIntArrayArray38 != null) {
					local2487 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray38.length) {
							local52 = this.anIntArrayArray38[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray82 == null || (this.aShortArray82[local60] & arg6) != 0) {
									local376 = (this.aByteArray81[local60] & 0xFF) + (arg2 * 8);
									if (local376 < 0) {
										local376 = 0;
									} else if (local376 > 255) {
										local376 = 255;
									}
									this.aByteArray81[local60] = (byte) local376;
								}
							}
							local2487 |= local52.length > 0;
						}
					}
					if (local2487) {
						if (this.aClass61Array1 != null) {
							for (local38 = 0; local38 < this.anInt6817; local38++) {
								local2597 = this.aClass61Array1[local38];
								local2602 = this.aClass323Array1[local38];
								local2602.anInt9342 = 255 - (this.aByteArray81[local2597.anInt2154] & 0xFF) << 24 | local2602.anInt9342 & 0xFFFFFF;
							}
						}
						this.method5703();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray38 != null) {
					local2487 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray38.length) {
							local52 = this.anIntArrayArray38[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray82 == null || (this.aShortArray82[local60] & arg6) != 0) {
									local376 = this.aShortArray79[local60] & 0xFFFF;
									local398 = local376 >> 10 & 0x3F;
									local428 = local376 >> 7 & 0x7;
									local455 = local376 & 0x7F;
									@Pc(2708) int local2708 = local398 + arg2 & 0x3F;
									local428 += arg3 / 4;
									if (local428 < 0) {
										local428 = 0;
									} else if (local428 > 7) {
										local428 = 7;
									}
									local455 += arg4;
									if (local455 < 0) {
										local455 = 0;
									} else if (local455 > 127) {
										local455 = 127;
									}
									this.aShortArray79[local60] = (short) (local428 << 7 | local2708 << 10 | local455);
								}
							}
							local2487 |= local52.length > 0;
						}
					}
					if (local2487) {
						if (this.aClass61Array1 != null) {
							for (local38 = 0; local38 < this.anInt6817; local38++) {
								local2597 = this.aClass61Array1[local38];
								local2602 = this.aClass323Array1[local38];
								local2602.anInt9342 = Static15.anIntArray11[this.aShortArray79[local2597.anInt2154] & 0xFFFF] & 0xFFFFFF | local2602.anInt9342 & 0xFF000000;
							}
						}
						this.method5703();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray37 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray37.length > local32) {
							local248 = this.anIntArrayArray37[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local2602 = this.aClass323Array1[local248[local250]];
								local2602.anInt9336 += arg2;
								local2602.anInt9343 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray37 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray37.length) {
							local248 = this.anIntArrayArray37[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local2602 = this.aClass323Array1[local248[local250]];
								local2602.anInt9341 = arg3 * local2602.anInt9341 >> 7;
								local2602.anInt9338 = local2602.anInt9338 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray37 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray37.length > local32) {
						local248 = this.anIntArrayArray37[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local2602 = this.aClass323Array1[local248[local250]];
							local2602.anInt9347 = arg2 + local2602.anInt9347 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray36.length) {
					local248 = this.anIntArrayArray36[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local54 = local248[local250];
						if (this.aShortArray78 == null || (this.aShortArray78[local54] & arg6) != 0) {
							this.anIntArray354[local54] -= Static299.anInt6041;
							this.anIntArray357[local54] -= Static344.anInt6660;
							this.anIntArray355[local54] -= Static347.anInt6686;
							this.anIntArray354[local54] = arg2 * this.anIntArray354[local54] >> 7;
							this.anIntArray357[local54] = this.anIntArray357[local54] * arg3 >> 7;
							this.anIntArray355[local54] = arg4 * this.anIntArray355[local54] >> 7;
							this.anIntArray354[local54] += Static299.anInt6041;
							this.anIntArray357[local54] += Static344.anInt6660;
							this.anIntArray355[local54] += Static347.anInt6686;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local250 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static112.aBoolean193) {
				local376 = arg7[6] * Static347.anInt6686 + arg7[0] * Static299.anInt6041 + Static344.anInt6660 * arg7[3] + 8192 >> 14;
				local398 = Static347.anInt6686 * arg7[7] + arg7[4] * Static344.anInt6660 + arg7[1] * Static299.anInt6041 + 8192 >> 14;
				local428 = arg7[5] * Static344.anInt6660 + Static299.anInt6041 * arg7[2] + arg7[8] * Static347.anInt6686 + 8192 >> 14;
				local376 += local250;
				local398 += local54;
				Static344.anInt6660 = local398;
				local428 += local60;
				Static299.anInt6041 = local376;
				Static112.aBoolean193 = false;
				Static347.anInt6686 = local428;
			}
			local376 = arg2 << 15 >> 7;
			local398 = arg3 << 15 >> 7;
			local428 = arg4 << 15 >> 7;
			local455 = -Static299.anInt6041 * local376 + 8192 >> 14;
			local459 = -Static344.anInt6660 * local398 + 8192 >> 14;
			local463 = -Static347.anInt6686 * local428 + 8192 >> 14;
			local467 = local455 + Static299.anInt6041;
			local475 = Static344.anInt6660 + local459;
			local483 = local463 + Static347.anInt6686;
			@Pc(2009) int[] local2009 = new int[] { arg7[0] * local376 + 8192 >> 14, arg7[3] * local376 + 8192 >> 14, local376 * arg7[6] + 8192 >> 14, local398 * arg7[1] + 8192 >> 14, local398 * arg7[4] + 8192 >> 14, local398 * arg7[7] + 8192 >> 14, arg7[2] * local428 + 8192 >> 14, local428 * arg7[5] + 8192 >> 14, arg7[8] * local428 + 8192 >> 14 };
			local637 = local250 * local376 + 8192 >> 14;
			local662 = local54 * local398 + 8192 >> 14;
			local666 = local428 * local60 + 8192 >> 14;
			@Pc(2145) int local2145 = local662 + local475;
			@Pc(2149) int local2149 = local637 + local467;
			@Pc(2153) int local2153 = local666 + local483;
			@Pc(2156) int[] local2156 = new int[9];
			@Pc(2162) int local2162;
			for (local675 = 0; local675 < 3; local675++) {
				for (local2162 = 0; local2162 < 3; local2162++) {
					local680 = 0;
					for (local684 = 0; local684 < 3; local684++) {
						local680 += arg7[local675 * 3 + local684] * local2009[local684 * 3 + local2162];
					}
					local2156[local2162 + local675 * 3] = local680 + 8192 >> 14;
				}
			}
			local2162 = arg7[2] * local2153 + local2145 * arg7[1] + arg7[0] * local2149 + 8192 >> 14;
			local680 = local2153 * arg7[5] + local2145 * arg7[4] + arg7[3] * local2149 + 8192 >> 14;
			local684 = arg7[7] * local2145 + local2149 * arg7[6] + local2153 * arg7[8] + 8192 >> 14;
			local2162 += local24;
			local680 += local32;
			local684 += local38;
			for (local688 = 0; local688 < local8; local688++) {
				local690 = arg1[local688];
				if (this.anIntArrayArray36.length > local690) {
					local818 = this.anIntArrayArray36[local690];
					for (local820 = 0; local820 < local818.length; local820++) {
						local824 = local818[local820];
						if (this.aShortArray78 == null || (arg6 & this.aShortArray78[local824]) != 0) {
							local828 = this.anIntArray355[local824] * local2156[2] + this.anIntArray357[local824] * local2156[1] + this.anIntArray354[local824] * local2156[0] + 8192 >> 14;
							local830 = local2156[3] * this.anIntArray354[local824] + local2156[4] * this.anIntArray357[local824] + this.anIntArray355[local824] * local2156[5] + 8192 >> 14;
							@Pc(2407) int local2407 = local828 + local2162;
							@Pc(2411) int local2411 = local830 + local680;
							local958 = local2156[7] * this.anIntArray357[local824] + this.anIntArray354[local824] * local2156[6] + this.anIntArray355[local824] * local2156[8] + 8192 >> 14;
							this.anIntArray354[local824] = local2407;
							@Pc(2451) int local2451 = local958 + local684;
							this.anIntArray357[local824] = local2411;
							this.anIntArray355[local824] = local2451;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7926(@OriginalArg(0) Class8 arg0) {
		@Pc(8) Class8_Sub3 local8 = (Class8_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass227Array4 != null) {
			for (local13 = 0; local13 < this.aClass227Array4.length; local13++) {
				@Pc(20) Class227 local20 = this.aClass227Array4[local13];
				@Pc(22) Class227 local22 = local20;
				if (local20.aClass227_1 != null) {
					local22 = local20.aClass227_1;
				}
				local22.anInt6588 = (int) (local8.aFloat40 + (float) this.anIntArray357[local20.anInt6582] * local8.aFloat46 + (float) this.anIntArray354[local20.anInt6582] * local8.aFloat45 + (float) this.anIntArray355[local20.anInt6582] * local8.aFloat41);
				local22.anInt6586 = (int) (local8.aFloat47 + local8.aFloat44 * (float) this.anIntArray354[local20.anInt6582] + local8.aFloat37 * (float) this.anIntArray357[local20.anInt6582] + local8.aFloat48 * (float) this.anIntArray355[local20.anInt6582]);
				local22.anInt6584 = (int) (local8.aFloat42 + local8.aFloat43 * (float) this.anIntArray357[local20.anInt6582] + local8.aFloat38 * (float) this.anIntArray354[local20.anInt6582] + local8.aFloat39 * (float) this.anIntArray355[local20.anInt6582]);
				local22.anInt6590 = (int) ((float) this.anIntArray355[local20.anInt6581] * local8.aFloat41 + local8.aFloat45 * (float) this.anIntArray354[local20.anInt6581] + local8.aFloat46 * (float) this.anIntArray357[local20.anInt6581] + local8.aFloat40);
				local22.anInt6592 = (int) (local8.aFloat47 + (float) this.anIntArray355[local20.anInt6581] * local8.aFloat48 + local8.aFloat44 * (float) this.anIntArray354[local20.anInt6581] + local8.aFloat37 * (float) this.anIntArray357[local20.anInt6581]);
				local22.anInt6585 = (int) ((float) this.anIntArray354[local20.anInt6581] * local8.aFloat38 + (float) this.anIntArray357[local20.anInt6581] * local8.aFloat43 + (float) this.anIntArray355[local20.anInt6581] * local8.aFloat39 + local8.aFloat42);
				local22.anInt6580 = (int) (local8.aFloat41 * (float) this.anIntArray355[local20.anInt6587] + (float) this.anIntArray357[local20.anInt6587] * local8.aFloat46 + local8.aFloat45 * (float) this.anIntArray354[local20.anInt6587] + local8.aFloat40);
				local22.anInt6589 = (int) ((float) this.anIntArray354[local20.anInt6587] * local8.aFloat44 + (float) this.anIntArray357[local20.anInt6587] * local8.aFloat37 + local8.aFloat48 * (float) this.anIntArray355[local20.anInt6587] + local8.aFloat47);
				local22.anInt6577 = (int) (local8.aFloat42 + local8.aFloat43 * (float) this.anIntArray357[local20.anInt6587] + (float) this.anIntArray354[local20.anInt6587] * local8.aFloat38 + (float) this.anIntArray355[local20.anInt6587] * local8.aFloat39);
			}
		}
		if (this.aClass103Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass103Array4.length; local13++) {
			@Pc(365) Class103 local365 = this.aClass103Array4[local13];
			@Pc(367) Class103 local367 = local365;
			if (local365.aClass103_1 != null) {
				local367 = local365.aClass103_1;
			}
			if (local365.aClass8_1 == null) {
				local365.aClass8_1 = local8.method6812();
			} else {
				local365.aClass8_1.M(local8);
			}
			local367.anInt2992 = (int) (local8.aFloat41 * (float) this.anIntArray355[local365.anInt2993] + (float) this.anIntArray357[local365.anInt2993] * local8.aFloat46 + (float) this.anIntArray354[local365.anInt2993] * local8.aFloat45 + local8.aFloat40);
			local367.anInt2990 = (int) (local8.aFloat48 * (float) this.anIntArray355[local365.anInt2993] + local8.aFloat37 * (float) this.anIntArray357[local365.anInt2993] + (float) this.anIntArray354[local365.anInt2993] * local8.aFloat44 + local8.aFloat47);
			local367.anInt2991 = (int) (local8.aFloat42 + (float) this.anIntArray357[local365.anInt2993] * local8.aFloat43 + local8.aFloat38 * (float) this.anIntArray354[local365.anInt2993] + local8.aFloat39 * (float) this.anIntArray355[local365.anInt2993]);
		}
	}

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "()[Lclient!fk;")
	@Override
	public Class103[] method7920() {
		return this.aClass103Array4;
	}

	@OriginalMember(owner = "client!nk", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean493) {
			this.method5692();
		}
		return this.anInt6852;
	}

	@OriginalMember(owner = "client!nk", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort80;
	}

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "()V")
	@Override
	public void method7929() {
		if (this.anInt6807 > 0 && this.anInt6857 > 0) {
			this.method5701();
			this.method5690();
			this.method5691();
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method5688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > arg2 && arg6 > arg2 && arg3 > arg2) {
			return false;
		} else if (arg2 > arg0 && arg2 > arg6 && arg3 < arg2) {
			return false;
		} else if (arg5 < arg4 && arg7 > arg5 && arg5 < arg1) {
			return false;
		} else {
			return arg4 >= arg5 || arg7 >= arg5 || arg5 <= arg1;
		}
	}

	@OriginalMember(owner = "client!nk", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort81 = (short) arg0;
		this.method5705();
		this.method5696();
	}

	@OriginalMember(owner = "client!nk", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean493) {
			this.method5692();
		}
		return this.anInt6842;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!q;Lclient!mj;II)V")
	@Override
	public void method7919(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class1_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6807 == 0) {
			return;
		}
		@Pc(13) Class8_Sub3 local13 = this.aClass44_Sub2_10.aClass8_Sub3_16;
		@Pc(16) Class8_Sub3 local16 = (Class8_Sub3) arg0;
		if (!this.aBoolean493) {
			this.method5692();
		}
		Static224.aFloat132 = local16.aFloat43 * local13.aFloat39 + local16.aFloat46 * local13.aFloat38 + local16.aFloat37 * local13.aFloat43;
		Static298.aFloat190 = local16.aFloat42 * local13.aFloat39 + local13.aFloat43 * local16.aFloat47 + local13.aFloat38 * local16.aFloat40 + local13.aFloat42;
		@Pc(69) float local69 = (float) this.anInt6852 * Static224.aFloat132 + Static298.aFloat190;
		@Pc(77) float local77 = Static298.aFloat190 + Static224.aFloat132 * (float) this.anInt6842;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = local69 + (float) this.anInt6846;
			local93 = local77 - (float) this.anInt6846;
		} else {
			local87 = local77 + (float) this.anInt6846;
			local93 = local69 - (float) this.anInt6846;
		}
		if (this.aClass44_Sub2_10.aFloat158 <= local93 || (float) this.aClass44_Sub2_10.anInt4965 >= local87) {
			return;
		}
		Static524.aFloat228 = local13.aFloat40 + local16.aFloat42 * local13.aFloat41 + local16.aFloat40 * local13.aFloat45 + local16.aFloat47 * local13.aFloat46;
		Static267.aFloat159 = local13.aFloat46 * local16.aFloat37 + local13.aFloat45 * local16.aFloat46 + local13.aFloat41 * local16.aFloat43;
		@Pc(169) float local169 = Static524.aFloat228 + (float) this.anInt6852 * Static267.aFloat159;
		@Pc(177) float local177 = Static524.aFloat228 + (float) this.anInt6842 * Static267.aFloat159;
		@Pc(193) float local193;
		@Pc(204) float local204;
		if (local177 < local169) {
			local193 = ((float) -this.anInt6846 + local177) * (float) this.aClass44_Sub2_10.bf;
			local204 = (local169 + (float) this.anInt6846) * (float) this.aClass44_Sub2_10.bf;
		} else {
			local193 = (float) this.aClass44_Sub2_10.bf * (local169 - (float) this.anInt6846);
			local204 = (local177 + (float) this.anInt6846) * (float) this.aClass44_Sub2_10.bf;
		}
		if (this.aClass44_Sub2_10.aFloat157 <= local193 / (float) arg2 || this.aClass44_Sub2_10.aFloat154 >= local204 / (float) arg2) {
			return;
		}
		Static361.aFloat197 = local13.aFloat37 * local16.aFloat37 + local13.aFloat44 * local16.aFloat46 + local16.aFloat43 * local13.aFloat48;
		Static481.aFloat217 = local13.aFloat37 * local16.aFloat47 + local16.aFloat40 * local13.aFloat44 + local16.aFloat42 * local13.aFloat48 + local13.aFloat47;
		@Pc(295) float local295 = Static481.aFloat217 + (float) this.anInt6852 * Static361.aFloat197;
		@Pc(303) float local303 = Static481.aFloat217 + (float) this.anInt6842 * Static361.aFloat197;
		@Pc(330) float local330;
		@Pc(318) float local318;
		if (local303 < local295) {
			local318 = (float) this.aClass44_Sub2_10.anInt4949 * (local295 + (float) this.anInt6846);
			local330 = ((float) -this.anInt6846 + local303) * (float) this.aClass44_Sub2_10.anInt4949;
		} else {
			local318 = (float) this.aClass44_Sub2_10.anInt4949 * ((float) this.anInt6846 + local303);
			local330 = ((float) -this.anInt6846 + local295) * (float) this.aClass44_Sub2_10.anInt4949;
		}
		if (this.aClass44_Sub2_10.aFloat147 <= local330 / (float) arg2 || local318 / (float) arg2 <= this.aClass44_Sub2_10.aFloat143) {
			return;
		}
		if (arg1 != null || this.aClass61Array1 != null) {
			Static560.aFloat225 = local16.aFloat48 * local13.aFloat46 + local16.aFloat41 * local13.aFloat45 + local16.aFloat39 * local13.aFloat41;
			Static316.aFloat192 = local16.aFloat38 * local13.aFloat48 + local16.aFloat44 * local13.aFloat37 + local13.aFloat44 * local16.aFloat45;
			Static313.aFloat140 = local16.aFloat39 * local13.aFloat48 + local13.aFloat44 * local16.aFloat41 + local16.aFloat48 * local13.aFloat37;
			Static430.aFloat209 = local16.aFloat38 * local13.aFloat39 + local16.aFloat44 * local13.aFloat43 + local16.aFloat45 * local13.aFloat38;
			Static452.aFloat215 = local13.aFloat45 * local16.aFloat45 + local13.aFloat46 * local16.aFloat44 + local16.aFloat38 * local13.aFloat41;
			Static18.aFloat15 = local13.aFloat39 * local16.aFloat39 + local16.aFloat41 * local13.aFloat38 + local16.aFloat48 * local13.aFloat43;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.anInt6815 + this.anInt6828 >> 1;
			@Pc(506) int local506 = this.anInt6811 + this.anInt6788 >> 1;
			@Pc(525) int local525 = (int) (Static267.aFloat159 * (float) this.anInt6852 + (float) local498 * Static452.aFloat215 + Static524.aFloat228 + (float) local506 * Static560.aFloat225);
			@Pc(544) int local544 = (int) (Static316.aFloat192 * (float) local498 + Static481.aFloat217 + (float) this.anInt6852 * Static361.aFloat197 + (float) local506 * Static313.aFloat140);
			@Pc(563) int local563 = (int) ((float) local506 * Static18.aFloat15 + (float) this.anInt6852 * Static224.aFloat132 + Static430.aFloat209 * (float) local498 + Static298.aFloat190);
			@Pc(582) int local582 = (int) (Static524.aFloat228 + (float) local498 * Static452.aFloat215 + (float) this.anInt6842 * Static267.aFloat159 + Static560.aFloat225 * (float) local506);
			@Pc(601) int local601 = (int) ((float) local506 * Static313.aFloat140 + Static481.aFloat217 + (float) local498 * Static316.aFloat192 + (float) this.anInt6842 * Static361.aFloat197);
			arg1.anInt6301 = this.aClass44_Sub2_10.bf * local582 / arg2 + this.aClass44_Sub2_10.anInt4972;
			arg1.anInt6299 = this.aClass44_Sub2_10.anInt4954 + local544 * this.aClass44_Sub2_10.anInt4949 / arg2;
			arg1.anInt6300 = this.aClass44_Sub2_10.anInt4954 + local601 * this.aClass44_Sub2_10.anInt4949 / arg2;
			arg1.anInt6297 = this.aClass44_Sub2_10.anInt4972 + local525 * this.aClass44_Sub2_10.bf / arg2;
			@Pc(674) int local674 = (int) (Static224.aFloat132 * (float) this.anInt6842 + (float) local498 * Static430.aFloat209 + Static298.aFloat190 + Static18.aFloat15 * (float) local506);
			if (local563 >= this.aClass44_Sub2_10.anInt4965 || local674 >= this.aClass44_Sub2_10.anInt4965) {
				arg1.anInt6298 = (local525 + this.anInt6846) * this.aClass44_Sub2_10.bf / arg2 + this.aClass44_Sub2_10.anInt4972 - arg1.anInt6297;
				arg1.aBoolean461 = true;
			}
		}
		this.aClass44_Sub2_10.method4372((float) arg2);
		this.aClass44_Sub2_10.method4251();
		this.aClass44_Sub2_10.method4341(local16);
		this.method5699();
		this.method5693();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class57 method7912(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(28) Class57_Sub3 local28;
		@Pc(32) Class57_Sub3 local32;
		if (arg0 == 1) {
			local32 = this.aClass44_Sub2_10.aClass57_Sub3_23;
			local28 = this.aClass44_Sub2_10.aClass57_Sub3_26;
		} else if (arg0 == 2) {
			local32 = this.aClass44_Sub2_10.aClass57_Sub3_28;
			local28 = this.aClass44_Sub2_10.aClass57_Sub3_22;
		} else if (arg0 == 3) {
			local32 = this.aClass44_Sub2_10.aClass57_Sub3_30;
			local28 = this.aClass44_Sub2_10.aClass57_Sub3_24;
		} else if (arg0 == 4) {
			local32 = this.aClass44_Sub2_10.aClass57_Sub3_25;
			local28 = this.aClass44_Sub2_10.aClass57_Sub3_29;
		} else if (arg0 == 5) {
			local28 = this.aClass44_Sub2_10.aClass57_Sub3_21;
			local32 = this.aClass44_Sub2_10.aClass57_Sub3_27;
		} else {
			local28 = local32 = new Class57_Sub3(this.aClass44_Sub2_10, 0, 0, true, false);
		}
		return this.method5704(local28, arg0 != 0, local32, arg1, arg2);
	}

	@OriginalMember(owner = "client!nk", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean493) {
			this.method5692();
		}
		return this.anInt6784;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "()V")
	@Override
	protected void method7908() {
	}

	@OriginalMember(owner = "client!nk", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean493) {
			this.method5692();
		}
		return this.anInt6788;
	}

	@OriginalMember(owner = "client!nk", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static347.anInt6686 = 0;
			Static299.anInt6041 = 0;
			local16 = 0;
			Static344.anInt6660 = 0;
			for (local20 = 0; local20 < this.anInt6860; local20++) {
				Static299.anInt6041 += this.anIntArray354[local20];
				Static344.anInt6660 += this.anIntArray357[local20];
				local16++;
				Static347.anInt6686 += this.anIntArray355[local20];
			}
			if (local16 > 0) {
				Static344.anInt6660 = arg2 + Static344.anInt6660 / local16;
				Static299.anInt6041 = arg1 + Static299.anInt6041 / local16;
				Static347.anInt6686 = Static347.anInt6686 / local16 + arg3;
			} else {
				Static344.anInt6660 = arg2;
				Static299.anInt6041 = arg1;
				Static347.anInt6686 = arg3;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt6860; local16++) {
				this.anIntArray354[local16] += arg1;
				this.anIntArray357[local16] += arg2;
				this.anIntArray355[local16] += arg3;
			}
		} else {
			@Pc(163) int local163;
			@Pc(181) int local181;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt6860; local16++) {
					this.anIntArray354[local16] -= Static299.anInt6041;
					this.anIntArray357[local16] -= Static344.anInt6660;
					this.anIntArray355[local16] -= Static347.anInt6686;
					if (arg3 != 0) {
						local20 = Class4_Sub27.anIntArray296[arg3];
						local163 = Class4_Sub27.anIntArray297[arg3];
						local181 = this.anIntArray354[local16] * local163 + local20 * this.anIntArray357[local16] + 16383 >> 14;
						this.anIntArray357[local16] = local163 * this.anIntArray357[local16] + 16383 - local20 * this.anIntArray354[local16] >> 14;
						this.anIntArray354[local16] = local181;
					}
					if (arg1 != 0) {
						local20 = Class4_Sub27.anIntArray296[arg1];
						local163 = Class4_Sub27.anIntArray297[arg1];
						local181 = this.anIntArray357[local16] * local163 + 16383 - this.anIntArray355[local16] * local20 >> 14;
						this.anIntArray355[local16] = this.anIntArray355[local16] * local163 + local20 * this.anIntArray357[local16] + 16383 >> 14;
						this.anIntArray357[local16] = local181;
					}
					if (arg2 != 0) {
						local20 = Class4_Sub27.anIntArray296[arg2];
						local163 = Class4_Sub27.anIntArray297[arg2];
						local181 = this.anIntArray354[local16] * local163 + local20 * this.anIntArray355[local16] + 16383 >> 14;
						this.anIntArray355[local16] = local163 * this.anIntArray355[local16] + 16383 - local20 * this.anIntArray354[local16] >> 14;
						this.anIntArray354[local16] = local181;
					}
					this.anIntArray354[local16] += Static299.anInt6041;
					this.anIntArray357[local16] += Static344.anInt6660;
					this.anIntArray355[local16] += Static347.anInt6686;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt6860; local16++) {
					this.anIntArray354[local16] -= Static299.anInt6041;
					this.anIntArray357[local16] -= Static344.anInt6660;
					this.anIntArray355[local16] -= Static347.anInt6686;
					this.anIntArray354[local16] = this.anIntArray354[local16] * arg1 / 128;
					this.anIntArray357[local16] = this.anIntArray357[local16] * arg2 / 128;
					this.anIntArray355[local16] = this.anIntArray355[local16] * arg3 / 128;
					this.anIntArray354[local16] += Static299.anInt6041;
					this.anIntArray357[local16] += Static344.anInt6660;
					this.anIntArray355[local16] += Static347.anInt6686;
				}
			} else {
				@Pc(519) Class61 local519;
				@Pc(524) Class323 local524;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt6850; local16++) {
						local20 = (this.aByteArray81[local16] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray81[local16] = (byte) local20;
					}
					if (this.aClass61Array1 != null) {
						for (local20 = 0; local20 < this.anInt6817; local20++) {
							local519 = this.aClass61Array1[local20];
							local524 = this.aClass323Array1[local20];
							local524.anInt9342 = 255 - (this.aByteArray81[local519.anInt2154] & 0xFF) << 24 | local524.anInt9342 & 0xFFFFFF;
						}
					}
					this.method5703();
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt6850; local16++) {
						local20 = this.aShortArray79[local16] & 0xFFFF;
						local163 = local20 >> 10 & 0x3F;
						local181 = local20 >> 7 & 0x7;
						local181 += arg2 / 4;
						@Pc(588) int local588 = local20 & 0x7F;
						@Pc(594) int local594 = local163 + arg1 & 0x3F;
						local588 += arg3;
						if (local181 < 0) {
							local181 = 0;
						} else if (local181 > 7) {
							local181 = 7;
						}
						if (local588 < 0) {
							local588 = 0;
						} else if (local588 > 127) {
							local588 = 127;
						}
						this.aShortArray79[local16] = (short) (local594 << 10 | local181 << 7 | local588);
					}
					if (this.aClass61Array1 != null) {
						for (local20 = 0; local20 < this.anInt6817; local20++) {
							local519 = this.aClass61Array1[local20];
							local524 = this.aClass323Array1[local20];
							local524.anInt9342 = local524.anInt9342 & 0xFF000000 | Static15.anIntArray11[this.aShortArray79[local519.anInt2154] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5703();
				} else {
					@Pc(701) Class323 local701;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt6817; local16++) {
							local701 = this.aClass323Array1[local16];
							local701.anInt9343 += arg2;
							local701.anInt9336 += arg1;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt6817; local16++) {
							local701 = this.aClass323Array1[local16];
							local701.anInt9341 = local701.anInt9341 * arg2 >> 7;
							local701.anInt9338 = arg1 * local701.anInt9338 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt6817; local16++) {
							local701 = this.aClass323Array1[local16];
							local701.anInt9347 = local701.anInt9347 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) boolean arg3) {
		return this.method5694(arg1, arg2, arg0, arg3, -1);
	}

	@OriginalMember(owner = "client!nk", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean493) {
			this.method5692();
		}
		return this.anInt6846;
	}

	@OriginalMember(owner = "client!nk", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class4_Sub5_Sub6 S(@OriginalArg(0) Class4_Sub5_Sub6 arg0) {
		if (this.anInt6807 == 0) {
			return null;
		}
		if (!this.aBoolean493) {
			this.method5692();
		}
		@Pc(42) int local42;
		@Pc(59) int local59;
		if (this.aClass44_Sub2_10.anInt4945 <= 0) {
			local42 = this.anInt6828 - (this.anInt6852 * this.aClass44_Sub2_10.anInt4945 >> 8) >> this.aClass44_Sub2_10.anInt4939;
			local59 = this.anInt6815 - (this.anInt6842 * this.aClass44_Sub2_10.anInt4945 >> 8) >> this.aClass44_Sub2_10.anInt4939;
		} else {
			local42 = this.anInt6828 - (this.anInt6842 * this.aClass44_Sub2_10.anInt4945 >> 8) >> this.aClass44_Sub2_10.anInt4939;
			local59 = this.anInt6815 - (this.aClass44_Sub2_10.anInt4945 * this.anInt6852 >> 8) >> this.aClass44_Sub2_10.anInt4939;
		}
		@Pc(119) int local119;
		@Pc(136) int local136;
		if (this.aClass44_Sub2_10.anInt4941 > 0) {
			local119 = this.anInt6788 - (this.aClass44_Sub2_10.anInt4941 * this.anInt6842 >> 8) >> this.aClass44_Sub2_10.anInt4939;
			local136 = this.anInt6811 - (this.anInt6852 * this.aClass44_Sub2_10.anInt4941 >> 8) >> this.aClass44_Sub2_10.anInt4939;
		} else {
			local119 = this.anInt6788 - (this.aClass44_Sub2_10.anInt4941 * this.anInt6852 >> 8) >> this.aClass44_Sub2_10.anInt4939;
			local136 = this.anInt6811 - (this.aClass44_Sub2_10.anInt4941 * this.anInt6842 >> 8) >> this.aClass44_Sub2_10.anInt4939;
		}
		@Pc(178) int local178 = local59 + 1 - local42;
		@Pc(185) int local185 = local136 + 1 - local119;
		@Pc(188) Class4_Sub5_Sub6_Sub1 local188 = (Class4_Sub5_Sub6_Sub1) arg0;
		@Pc(204) Class4_Sub5_Sub6_Sub1 local204;
		if (local188 != null && local188.method7039(local185, local178)) {
			local204 = local188;
			local188.method7042();
		} else {
			local204 = new Class4_Sub5_Sub6_Sub1(this.aClass44_Sub2_10, local178, local185);
		}
		local204.method7043(local59, local119, local42, local136);
		this.method5702(local204);
		return local204;
	}

	@OriginalMember(owner = "client!nk", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean493) {
			this.method5692();
		}
		return this.anInt6811;
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "()[Lclient!nba;")
	@Override
	public Class227[] method7915() {
		return this.aClass227Array4;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIFILclient!kk;IFJI)S")
	private short method5689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class191 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) long arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray356[arg6];
		@Pc(17) int local17 = this.anIntArray356[arg6 + 1];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = local10; local27 < local17; local27++) {
			@Pc(34) short local34 = this.aShortArray88[local27];
			if (local34 == 0) {
				local25 = local27;
				break;
			}
			if (Static107.aLongArray16[local27] == arg8) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray88[local25] = (short) (this.anInt6807 + 1);
		Static107.aLongArray16[local25] = arg8;
		this.aShortArray83[this.anInt6807] = (short) arg0;
		this.aShortArray81[this.anInt6807] = (short) arg6;
		this.aShortArray87[this.anInt6807] = (short) arg4;
		this.aShortArray80[this.anInt6807] = (short) arg2;
		this.aShortArray84[this.anInt6807] = (short) arg9;
		this.aByteArray82[this.anInt6807] = (byte) arg1;
		this.aFloatArray50[this.anInt6807] = arg7;
		this.aFloatArray49[this.anInt6807] = arg3;
		return (short) this.anInt6807++;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5694(arg1, arg2, arg0, arg3, arg4);
	}

	@OriginalMember(owner = "client!nk", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub27.anIntArray296[arg0];
		@Pc(13) int local13 = Class4_Sub27.anIntArray297[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6860; local15++) {
			local33 = local9 * this.anIntArray355[local15] + this.anIntArray354[local15] * local13 >> 14;
			this.anIntArray355[local15] = local13 * this.anIntArray355[local15] - local9 * this.anIntArray354[local15] >> 14;
			this.anIntArray354[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt6807; local33++) {
			@Pc(83) int local83 = local9 * this.aShortArray84[local33] + local13 * this.aShortArray87[local33] >> 14;
			this.aShortArray84[local33] = (short) (local13 * this.aShortArray84[local33] - this.aShortArray87[local33] * local9 >> 14);
			this.aShortArray87[local33] = (short) local83;
		}
		this.method5705();
		this.method5696();
		this.aBoolean493 = false;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)Z")
	private boolean method5690() {
		if (this.aClass347_1.aBoolean703) {
			return true;
		}
		if (this.aClass347_1.anInterface3_8 == null) {
			this.aClass347_1.anInterface3_8 = this.aClass44_Sub2_10.method4245(this.aBoolean492);
		}
		@Pc(28) Interface3 local28 = this.aClass347_1.anInterface3_8;
		local28.method5228(this.anInt6857 * 6);
		@Pc(47) Buffer local47 = local28.method5235();
		if (local47 != null) {
			@Pc(55) Stream local55 = this.aClass44_Sub2_10.method4315(local47);
			@Pc(59) int local59;
			if (Stream.b()) {
				for (local59 = 0; local59 < this.anInt6857; local59++) {
					local55.e(this.aShortArray77[local59]);
					local55.e(this.aShortArray85[local59]);
					local55.e(this.aShortArray89[local59]);
				}
			} else {
				for (local59 = 0; local59 < this.anInt6857; local59++) {
					local55.f(this.aShortArray77[local59]);
					local55.f(this.aShortArray85[local59]);
					local55.f(this.aShortArray89[local59]);
				}
			}
			local55.a();
			if (local28.method5237()) {
				this.lb = true;
				this.aClass347_1.aBoolean703 = true;
				this.aClass347_1.anInterface3_7 = local28;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nk", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V")
	private void method5691() {
		if (!this.lb) {
			return;
		}
		this.lb = false;
		if (this.aClass227Array4 == null && this.aClass103Array4 == null && this.aClass61Array1 == null) {
			if (this.anIntArray354 != null && !Static299.method5148(this.anInt6839, this.anInt6859)) {
				if (this.aClass264_2 == null || this.aClass264_2.method6350()) {
					if (!this.aBoolean493) {
						this.method5692();
					}
					this.anIntArray354 = null;
				} else {
					this.lb = true;
				}
			}
			if (this.anIntArray357 != null && !Static209.method3502(this.anInt6859, this.anInt6839)) {
				if (this.aClass264_2 == null || this.aClass264_2.method6350()) {
					if (!this.aBoolean493) {
						this.method5692();
					}
					this.anIntArray357 = null;
				} else {
					this.lb = true;
				}
			}
			if (this.anIntArray355 != null && !Static578.method8246(this.anInt6839, this.anInt6859)) {
				if (this.aClass264_2 == null || this.aClass264_2.method6350()) {
					if (!this.aBoolean493) {
						this.method5692();
					}
					this.anIntArray355 = null;
				} else {
					this.lb = true;
				}
			}
		}
		if (this.aShortArray88 != null && this.anIntArray354 == null && this.anIntArray357 == null && this.anIntArray355 == null) {
			this.aShortArray88 = null;
			this.anIntArray356 = null;
		}
		if (this.aByteArray82 != null && !Static478.method7166(this.anInt6839, this.anInt6859)) {
			label195: {
				label194: {
					@Pc(164) boolean local164;
					if ((this.anInt6859 & 0x37) == 0) {
						if (this.aClass264_1 == null || this.aClass264_1.method6350()) {
							break label194;
						}
						local164 = false;
					} else {
						if (this.aClass264_3 == null || this.aClass264_3.method6350()) {
							break label194;
						}
						local164 = false;
					}
					if (!local164) {
						this.lb = true;
						break label195;
					}
				}
				this.aByteArray82 = null;
				this.aShortArray87 = this.aShortArray80 = this.aShortArray84 = null;
			}
		}
		if (this.aShortArray79 != null && !Static8.method156(this.anInt6839, this.anInt6859)) {
			if (this.aClass264_1 == null || this.aClass264_1.method6350()) {
				this.aShortArray79 = null;
			} else {
				this.lb = true;
			}
		}
		if (this.aByteArray81 != null && !Static129.method2635(this.anInt6859, this.anInt6839)) {
			if (this.aClass264_1 == null || this.aClass264_1.method6350()) {
				this.aByteArray81 = null;
			} else {
				this.lb = true;
			}
		}
		if (this.aFloatArray50 != null && !Static514.method7512(this.anInt6859, this.anInt6839)) {
			if (this.aClass264_4 == null || this.aClass264_4.method6350()) {
				this.aFloatArray50 = this.aFloatArray49 = null;
			} else {
				this.lb = true;
			}
		}
		if (this.aShortArray86 != null && !Static79.method1264(this.anInt6839, this.anInt6859)) {
			if (this.aClass264_1 == null || this.aClass264_1.method6350()) {
				this.aShortArray86 = null;
			} else {
				this.lb = true;
			}
		}
		if (this.aShortArray77 != null && !Static506.method2843(this.anInt6859, this.anInt6839)) {
			if ((this.aClass347_1 == null || this.aClass347_1.method8143()) && (this.aClass264_1 == null || this.aClass264_1.method6350())) {
				this.aShortArray77 = this.aShortArray85 = this.aShortArray89 = null;
			} else {
				this.lb = true;
			}
		}
		if (this.aShortArray81 != null) {
			if (this.aClass264_2 == null || this.aClass264_2.method6350()) {
				this.aShortArray81 = null;
			} else {
				this.lb = true;
			}
		}
		if (this.aShortArray83 != null) {
			if (this.aClass264_1 == null || this.aClass264_1.method6350()) {
				this.aShortArray83 = null;
			} else {
				this.lb = true;
			}
		}
		if (this.anIntArrayArray38 != null && !Static476.method7152(this.anInt6839, this.anInt6859)) {
			this.aShortArray82 = null;
			this.anIntArrayArray38 = null;
		}
		if (this.anIntArrayArray36 != null && !Static7.method140(this.anInt6859, this.anInt6839)) {
			this.anIntArrayArray36 = null;
			this.aShortArray78 = null;
		}
		if (this.anIntArrayArray37 != null && !Static128.method2630(this.anInt6859, this.anInt6839)) {
			this.anIntArrayArray37 = null;
		}
		if (this.anIntArray352 != null && (this.anInt6839 & 0x800) == 0 && (this.anInt6839 & 0x40000) == 0) {
			this.anIntArray352 = null;
			this.anIntArray353 = null;
			this.anIntArray350 = null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(3) Class83 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean493) {
			this.method5692();
		}
		@Pc(16) int local16 = this.anInt6828 + arg4;
		@Pc(22) int local22 = arg4 + this.anInt6815;
		@Pc(27) int local27 = this.anInt6788 + arg6;
		@Pc(33) int local33 = arg6 + this.anInt6811;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local22 + arg2.anInt8824 >> arg2.anInt8825 >= arg2.anInt8829 || local27 < 0 || arg2.anInt8830 <= arg2.anInt8824 + local33 >> arg2.anInt8825)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt8829 <= local22 + arg3.anInt8824 >> arg3.anInt8825 || local27 < 0 || arg3.anInt8824 + local33 >> arg3.anInt8825 >= arg3.anInt8830) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8825;
			local22 = local22 + arg2.anInt8824 - 1 >> arg2.anInt8825;
			local27 >>= arg2.anInt8825;
			local33 = arg2.anInt8824 + local33 - 1 >> arg2.anInt8825;
			if (arg2.method7217(local27, local16) == arg5 && arg5 == arg2.method7217(local27, local22) && arg5 == arg2.method7217(local33, local16) && arg2.method7217(local33, local22) == arg5) {
				return;
			}
		}
		@Pc(206) int local206;
		if (arg0 == 1) {
			for (local206 = 0; local206 < this.anInt6860; local206++) {
				this.anIntArray357[local206] = this.anIntArray357[local206] + arg2.method7213(this.anIntArray354[local206] + arg4, arg6 + this.anIntArray355[local206]) - arg5;
			}
		} else {
			@Pc(257) int local257;
			@Pc(268) int local268;
			if (arg0 == 2) {
				local206 = this.anInt6852;
				if (local206 == 0) {
					return;
				}
				for (local257 = 0; local257 < this.anInt6860; local257++) {
					local268 = (this.anIntArray357[local257] << 16) / local206;
					if (arg1 > local268) {
						this.anIntArray357[local257] -= -((arg1 - local268) * (arg2.method7213(this.anIntArray354[local257] + arg4, this.anIntArray355[local257] + arg6) - arg5) / arg1);
					}
				}
			} else {
				@Pc(349) int local349;
				if (arg0 == 3) {
					local206 = (arg1 & 0xFF) * 4;
					local257 = (arg1 >> 8 & 0xFF) * 4;
					local268 = (arg1 >> 16 & 0xFF) << 6;
					local349 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local206 >> 1) < 0 || arg2.anInt8824 + arg4 + (local206 >> 1) >= arg2.anInt8829 << arg2.anInt8825 || arg6 - (local257 >> 1) < 0 || arg2.anInt8830 << arg2.anInt8825 <= arg2.anInt8824 + arg6 + (local257 >> 1)) {
						return;
					}
					this.method7913(arg5, local349, local206, local268, local257, arg4, arg2, arg6);
				} else if (arg0 == 4) {
					local206 = this.anInt6842 - this.anInt6852;
					for (local257 = 0; local257 < this.anInt6860; local257++) {
						this.anIntArray357[local257] = local206 + this.anIntArray357[local257] + arg3.method7213(this.anIntArray354[local257] - -arg4, arg6 + this.anIntArray355[local257]) - arg5;
					}
				} else if (arg0 == 5) {
					local206 = this.anInt6842 - this.anInt6852;
					for (local257 = 0; local257 < this.anInt6860; local257++) {
						local268 = this.anIntArray354[local257] + arg4;
						local349 = arg6 + this.anIntArray355[local257];
						@Pc(505) int local505 = arg2.method7213(local268, local349);
						@Pc(511) int local511 = arg3.method7213(local268, local349);
						@Pc(518) int local518 = local505 - local511 - arg1;
						this.anIntArray357[local257] = ((this.anIntArray357[local257] << 8) / local206 * local518 >> 8) - (arg5 - local505);
					}
				}
			}
		}
		this.method5705();
		this.aBoolean493 = false;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
	private void method5692() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt6860; local28++) {
			@Pc(35) int local35 = this.anIntArray354[local28];
			@Pc(40) int local40 = this.anIntArray357[local28];
			if (local35 > local13) {
				local13 = local35;
			}
			if (local7 > local35) {
				local7 = local35;
			}
			if (local40 > local15) {
				local15 = local40;
			}
			if (local9 > local40) {
				local9 = local40;
			}
			@Pc(73) int local73 = this.anIntArray355[local28];
			if (local17 < local73) {
				local17 = local73;
			}
			if (local73 < local11) {
				local11 = local73;
			}
			@Pc(91) int local91 = local73 * local73 + local35 * local35;
			if (local91 > local19) {
				local19 = local91;
			}
			local91 = local40 * local40 + local73 * local73 + local35 * local35;
			if (local21 < local91) {
				local21 = local91;
			}
		}
		this.anInt6852 = local9;
		this.anInt6828 = local7;
		this.anInt6811 = local17;
		this.anInt6815 = local13;
		this.anInt6788 = local11;
		this.anInt6842 = local15;
		this.anInt6846 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt6784 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean493 = true;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V")
	private void method5693() {
		if (this.aClass61Array1 == null) {
			return;
		}
		this.aClass44_Sub2_10.ZA(false);
		this.aClass44_Sub2_10.method4244(false);
		this.aClass44_Sub2_10.method4241(1, Static447.aClass328_3);
		this.aClass44_Sub2_10.method4312(1, Static447.aClass328_3);
		for (@Pc(35) int local35 = 0; local35 < this.anInt6817; local35++) {
			@Pc(42) Class61 local42 = this.aClass61Array1[local35];
			@Pc(47) Class323 local47 = this.aClass323Array1[local35];
			if (!local42.aBoolean150 || !this.aClass44_Sub2_10.method5019()) {
				@Pc(76) float local76 = (float) (this.anIntArray354[local42.anInt2149] + this.anIntArray354[local42.anInt2152] + this.anIntArray354[local42.anInt2153]) * 0.3333333F;
				@Pc(97) float local97 = (float) (this.anIntArray357[local42.anInt2153] + this.anIntArray357[local42.anInt2152] + this.anIntArray357[local42.anInt2149]) * 0.3333333F;
				@Pc(119) float local119 = (float) (this.anIntArray355[local42.anInt2152] + this.anIntArray355[local42.anInt2153] + this.anIntArray355[local42.anInt2149]) * 0.3333333F;
				@Pc(133) float local133 = local119 * Static560.aFloat225 + local97 * Static267.aFloat159 + local76 * Static452.aFloat215 + Static524.aFloat228;
				@Pc(147) float local147 = local76 * Static316.aFloat192 + local97 * Static361.aFloat197 + local119 * Static313.aFloat140 + Static481.aFloat217;
				@Pc(161) float local161 = local97 * Static224.aFloat132 + Static430.aFloat209 * local76 + Static18.aFloat15 * local119 + Static298.aFloat190;
				@Pc(166) Class8_Sub3 local166 = this.aClass44_Sub2_10.method4281();
				local166.method1581(local47.anInt9347, local147 + (float) local47.anInt9343, (float) -local42.anInt2150 + local161, local47.anInt9338 * local42.aShort31 >> 7, (float) local47.anInt9336 + local133, local42.aShort30 * local47.anInt9341 >> 7);
				local166.method1569(this.aClass44_Sub2_10.aClass8_Sub3_17);
				this.aClass44_Sub2_10.method4275();
				@Pc(214) int local214 = local47.anInt9342;
				this.aClass44_Sub2_10.method4272(local42.aShort32, false, false);
				this.aClass44_Sub2_10.method4321(local42.aByte15);
				this.aClass44_Sub2_10.method4285(local214);
				this.aClass44_Sub2_10.method4260();
			}
		}
		this.aClass44_Sub2_10.method4312(1, Static283.aClass328_5);
		this.aClass44_Sub2_10.method4241(1, Static283.aClass328_5);
		this.aClass44_Sub2_10.ZA(true);
	}

	@OriginalMember(owner = "client!nk", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort81;
	}

	@OriginalMember(owner = "client!nk", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6860; local3++) {
			if (arg0 != 0) {
				this.anIntArray354[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray357[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray355[local3] += arg2;
			}
		}
		this.method5705();
		this.aBoolean493 = false;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILclient!q;IZBI)Z")
	private boolean method5694(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class8_Sub3 local8 = (Class8_Sub3) arg1;
		@Pc(12) Class8_Sub3 local12 = this.aClass44_Sub2_10.aClass8_Sub3_16;
		@Pc(33) float local33 = local12.aFloat40 + local12.aFloat41 * local8.aFloat42 + local8.aFloat40 * local12.aFloat45 + local12.aFloat46 * local8.aFloat47;
		@Pc(54) float local54 = local12.aFloat47 + local12.aFloat44 * local8.aFloat40 + local8.aFloat47 * local12.aFloat37 + local8.aFloat42 * local12.aFloat48;
		Static267.aFloat159 = local12.aFloat41 * local8.aFloat43 + local8.aFloat46 * local12.aFloat45 + local8.aFloat37 * local12.aFloat46;
		Static316.aFloat192 = local12.aFloat48 * local8.aFloat38 + local12.aFloat37 * local8.aFloat44 + local8.aFloat45 * local12.aFloat44;
		Static313.aFloat140 = local8.aFloat41 * local12.aFloat44 + local12.aFloat37 * local8.aFloat48 + local12.aFloat48 * local8.aFloat39;
		Static560.aFloat225 = local8.aFloat39 * local12.aFloat41 + local12.aFloat46 * local8.aFloat48 + local12.aFloat45 * local8.aFloat41;
		Static430.aFloat209 = local8.aFloat38 * local12.aFloat39 + local8.aFloat45 * local12.aFloat38 + local12.aFloat43 * local8.aFloat44;
		Static361.aFloat197 = local8.aFloat43 * local12.aFloat48 + local8.aFloat37 * local12.aFloat37 + local12.aFloat44 * local8.aFloat46;
		@Pc(183) float local183 = local12.aFloat38 * local8.aFloat40 + local12.aFloat43 * local8.aFloat47 + local8.aFloat42 * local12.aFloat39 + local12.aFloat42;
		Static224.aFloat132 = local8.aFloat43 * local12.aFloat39 + local12.aFloat38 * local8.aFloat46 + local12.aFloat43 * local8.aFloat37;
		Static18.aFloat15 = local12.aFloat39 * local8.aFloat39 + local8.aFloat48 * local12.aFloat43 + local8.aFloat41 * local12.aFloat38;
		Static452.aFloat215 = local8.aFloat38 * local12.aFloat41 + local12.aFloat45 * local8.aFloat45 + local12.aFloat46 * local8.aFloat44;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass44_Sub2_10.bf;
		@Pc(255) int local255 = this.aClass44_Sub2_10.anInt4949;
		if (!this.aBoolean493) {
			this.method5692();
		}
		Static422.anIntArray418[0] = this.anInt6828;
		Static2.anIntArray4[0] = this.anInt6852;
		Static422.anIntArray418[1] = this.anInt6815;
		Static306.anIntArray299[0] = this.anInt6788;
		Static2.anIntArray4[1] = this.anInt6852;
		Static306.anIntArray299[1] = this.anInt6788;
		Static422.anIntArray418[2] = this.anInt6828;
		Static2.anIntArray4[2] = this.anInt6842;
		Static306.anIntArray299[2] = this.anInt6788;
		Static422.anIntArray418[3] = this.anInt6815;
		Static2.anIntArray4[3] = this.anInt6842;
		Static422.anIntArray418[4] = this.anInt6828;
		Static306.anIntArray299[3] = this.anInt6788;
		Static2.anIntArray4[4] = this.anInt6852;
		Static306.anIntArray299[4] = this.anInt6811;
		Static422.anIntArray418[5] = this.anInt6815;
		Static2.anIntArray4[5] = this.anInt6852;
		Static306.anIntArray299[5] = this.anInt6811;
		Static422.anIntArray418[6] = this.anInt6828;
		Static2.anIntArray4[6] = this.anInt6842;
		Static306.anIntArray299[6] = this.anInt6811;
		Static422.anIntArray418[7] = this.anInt6815;
		Static2.anIntArray4[7] = this.anInt6842;
		Static306.anIntArray299[7] = this.anInt6811;
		@Pc(447) float local447;
		@Pc(433) float local433;
		@Pc(419) float local419;
		@Pc(395) float local395;
		@Pc(400) float local400;
		@Pc(405) float local405;
		for (@Pc(388) int local388 = 0; local388 < 8; local388++) {
			local395 = Static422.anIntArray418[local388];
			local400 = Static2.anIntArray4[local388];
			local405 = Static306.anIntArray299[local388];
			local419 = local183 + Static18.aFloat15 * local405 + Static430.aFloat209 * local395 + Static224.aFloat132 * local400;
			local433 = local54 + local405 * Static313.aFloat140 + local400 * Static361.aFloat197 + Static316.aFloat192 * local395;
			local447 = Static452.aFloat215 * local395 + local400 * Static267.aFloat159 + local405 * Static560.aFloat225 + local33;
			if (local419 >= (float) this.aClass44_Sub2_10.anInt4965) {
				if (arg4 > 0) {
					local419 = arg4;
				}
				@Pc(474) float local474 = local447 * (float) local251 / local419 + (float) this.aClass44_Sub2_10.anInt4972;
				@Pc(486) float local486 = (float) this.aClass44_Sub2_10.anInt4954 + local433 * (float) local255 / local419;
				if (local243 < local474) {
					local243 = local474;
				}
				if (local241 > local474) {
					local241 = local474;
				}
				if (local486 > local247) {
					local247 = local486;
				}
				if (local486 < local245) {
					local245 = local486;
				}
				local239 = true;
			}
		}
		if (local239 && (float) arg2 > local241 && (float) arg2 < local243 && local245 < (float) arg0 && (float) arg0 < local247) {
			if (arg3) {
				return true;
			}
			if (Static508.anIntArray491.length < this.anInt6807) {
				Static508.anIntArray491 = new int[this.anInt6807];
				Static5.anIntArray6 = new int[this.anInt6807];
			}
			@Pc(653) int local653;
			for (@Pc(563) int local563 = 0; local563 < this.anInt6860; local563++) {
				local405 = this.anIntArray355[local563];
				local395 = this.anIntArray354[local563];
				local400 = this.anIntArray357[local563];
				local419 = local183 + local405 * Static18.aFloat15 + Static430.aFloat209 * local395 + Static224.aFloat132 * local400;
				local447 = local33 + local405 * Static560.aFloat225 + local400 * Static267.aFloat159 + Static452.aFloat215 * local395;
				local433 = local54 + local400 * Static361.aFloat197 + local395 * Static316.aFloat192 + local405 * Static313.aFloat140;
				@Pc(666) int local666;
				@Pc(671) int local671;
				@Pc(678) int local678;
				if ((float) this.aClass44_Sub2_10.anInt4965 <= local419) {
					if (arg4 > 0) {
						local419 = arg4;
					}
					local653 = (int) (local447 * (float) local251 / local419 + (float) this.aClass44_Sub2_10.anInt4972);
					local666 = (int) ((float) this.aClass44_Sub2_10.anInt4954 + (float) local255 * local433 / local419);
					local671 = this.anIntArray356[local563];
					local678 = this.anIntArray356[local563 + 1];
					for (@Pc(680) int local680 = local671; local680 < local678; local680++) {
						@Pc(689) int local689 = this.aShortArray88[local680] - 1;
						if (local689 == -1) {
							break;
						}
						Static508.anIntArray491[local689] = local653;
						Static5.anIntArray6[local689] = local666;
					}
				} else {
					local653 = this.anIntArray356[local563];
					local666 = this.anIntArray356[local563 + 1];
					for (local671 = local653; local671 < local666; local671++) {
						local678 = this.aShortArray88[local671] - 1;
						if (local678 == -1) {
							break;
						}
						Static508.anIntArray491[this.aShortArray88[local671] - 1] = -999999;
					}
				}
			}
			for (local653 = 0; local653 < this.anInt6850; local653++) {
				if (Static508.anIntArray491[this.aShortArray77[local653]] != -999999 && Static508.anIntArray491[this.aShortArray85[local653]] != -999999 && Static508.anIntArray491[this.aShortArray89[local653]] != -999999 && this.method5688(Static5.anIntArray6[this.aShortArray77[local653]], Static508.anIntArray491[this.aShortArray89[local653]], arg0, Static5.anIntArray6[this.aShortArray89[local653]], Static508.anIntArray491[this.aShortArray77[local653]], arg2, Static5.anIntArray6[this.aShortArray85[local653]], Static508.anIntArray491[this.aShortArray85[local653]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V")
	private void method5695() {
		if (this.aClass347_1 != null) {
			this.aClass347_1.aBoolean703 = false;
		}
	}

	@OriginalMember(owner = "client!nk", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6855; local3++) {
			this.anIntArray354[local3] = this.anIntArray354[local3] + 7 >> 4;
			this.anIntArray357[local3] = this.anIntArray357[local3] + 7 >> 4;
			this.anIntArray355[local3] = this.anIntArray355[local3] + 7 >> 4;
		}
		this.method5705();
		this.aBoolean493 = false;
	}

	@OriginalMember(owner = "client!nk", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub27.anIntArray296[arg0];
		@Pc(13) int local13 = Class4_Sub27.anIntArray297[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6860; local15++) {
			@Pc(33) int local33 = this.anIntArray354[local15] * local13 + local9 * this.anIntArray355[local15] >> 14;
			this.anIntArray355[local15] = local13 * this.anIntArray355[local15] - this.anIntArray354[local15] * local9 >> 14;
			this.anIntArray354[local15] = local33;
		}
		this.method5705();
		this.aBoolean493 = false;
	}

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "()Z")
	@Override
	public boolean method7932() {
		if (this.aShortArray86 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray86.length; local12++) {
			if (this.aShortArray86[local12] != -1 && !this.aClass44_Sub2_10.anInterface11_11.method7407(this.aShortArray86[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)V")
	private void method5696() {
		if ((this.anInt6859 & 0x37) == 0) {
			if (this.aClass264_1 == null) {
				return;
			}
			this.aClass264_1.aBoolean529 = false;
		} else if (this.aClass264_3 != null) {
			this.aClass264_3.aBoolean529 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7931(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			local14 = arg4 << 4;
			local18 = arg2 << 4;
			local22 = arg3 << 4;
			Static344.anInt6660 = 0;
			local26 = 0;
			Static347.anInt6686 = 0;
			Static299.anInt6041 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray36.length > local38) {
					local48 = this.anIntArrayArray36[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static299.anInt6041 += this.anIntArray354[local56];
						Static344.anInt6660 += this.anIntArray357[local56];
						local26++;
						Static347.anInt6686 += this.anIntArray355[local56];
					}
				}
			}
			if (local26 > 0) {
				Static299.anInt6041 = local18 + Static299.anInt6041 / local26;
				Static344.anInt6660 = local22 + Static344.anInt6660 / local26;
				Static347.anInt6686 = Static347.anInt6686 / local26 + local14;
			} else {
				Static347.anInt6686 = local14;
				Static299.anInt6041 = local18;
				Static344.anInt6660 = local22;
			}
			return;
		}
		@Pc(166) int[] local166;
		@Pc(168) int local168;
		if (arg0 == 1) {
			local18 = arg2 << 4;
			local22 = arg3 << 4;
			local14 = arg4 << 4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray36.length > local32) {
					local166 = this.anIntArrayArray36[local32];
					for (local168 = 0; local168 < local166.length; local168++) {
						local50 = local166[local168];
						this.anIntArray354[local50] += local18;
						this.anIntArray357[local50] += local22;
						this.anIntArray355[local50] += local14;
					}
				}
			}
			return;
		}
		@Pc(285) int local285;
		@Pc(304) int local304;
		@Pc(756) int local756;
		@Pc(765) int local765;
		if (arg0 == 2) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray36.length) {
					local166 = this.anIntArrayArray36[local32];
					if ((arg5 & 0x1) == 0) {
						for (local168 = 0; local168 < local166.length; local168++) {
							local50 = local166[local168];
							this.anIntArray354[local50] -= Static299.anInt6041;
							this.anIntArray357[local50] -= Static344.anInt6660;
							this.anIntArray355[local50] -= Static347.anInt6686;
							if (arg4 != 0) {
								local56 = Class4_Sub27.anIntArray296[arg4];
								local285 = Class4_Sub27.anIntArray297[arg4];
								local304 = local56 * this.anIntArray357[local50] + this.anIntArray354[local50] * local285 + 16383 >> 14;
								this.anIntArray357[local50] = local285 * this.anIntArray357[local50] + 16383 - local56 * this.anIntArray354[local50] >> 14;
								this.anIntArray354[local50] = local304;
							}
							if (arg2 != 0) {
								local56 = Class4_Sub27.anIntArray296[arg2];
								local285 = Class4_Sub27.anIntArray297[arg2];
								local304 = local285 * this.anIntArray357[local50] + 16383 - local56 * this.anIntArray355[local50] >> 14;
								this.anIntArray355[local50] = this.anIntArray355[local50] * local285 + local56 * this.anIntArray357[local50] + 16383 >> 14;
								this.anIntArray357[local50] = local304;
							}
							if (arg3 != 0) {
								local56 = Class4_Sub27.anIntArray296[arg3];
								local285 = Class4_Sub27.anIntArray297[arg3];
								local304 = local56 * this.anIntArray355[local50] + local285 * this.anIntArray354[local50] + 16383 >> 14;
								this.anIntArray355[local50] = local285 * this.anIntArray355[local50] + 16383 - local56 * this.anIntArray354[local50] >> 14;
								this.anIntArray354[local50] = local304;
							}
							this.anIntArray354[local50] += Static299.anInt6041;
							this.anIntArray357[local50] += Static344.anInt6660;
							this.anIntArray355[local50] += Static347.anInt6686;
						}
					} else {
						for (local168 = 0; local168 < local166.length; local168++) {
							local50 = local166[local168];
							this.anIntArray354[local50] -= Static299.anInt6041;
							this.anIntArray357[local50] -= Static344.anInt6660;
							this.anIntArray355[local50] -= Static347.anInt6686;
							if (arg2 != 0) {
								local56 = Class4_Sub27.anIntArray296[arg2];
								local285 = Class4_Sub27.anIntArray297[arg2];
								local304 = local285 * this.anIntArray357[local50] + 16383 - this.anIntArray355[local50] * local56 >> 14;
								this.anIntArray355[local50] = local285 * this.anIntArray355[local50] + this.anIntArray357[local50] * local56 + 16383 >> 14;
								this.anIntArray357[local50] = local304;
							}
							if (arg4 != 0) {
								local56 = Class4_Sub27.anIntArray296[arg4];
								local285 = Class4_Sub27.anIntArray297[arg4];
								local304 = this.anIntArray357[local50] * local56 + local285 * this.anIntArray354[local50] + 16383 >> 14;
								this.anIntArray357[local50] = this.anIntArray357[local50] * local285 + 16383 - local56 * this.anIntArray354[local50] >> 14;
								this.anIntArray354[local50] = local304;
							}
							if (arg3 != 0) {
								local56 = Class4_Sub27.anIntArray296[arg3];
								local285 = Class4_Sub27.anIntArray297[arg3];
								local304 = this.anIntArray354[local50] * local285 + this.anIntArray355[local50] * local56 + 16383 >> 14;
								this.anIntArray355[local50] = local285 * this.anIntArray355[local50] + 16383 - this.anIntArray354[local50] * local56 >> 14;
								this.anIntArray354[local50] = local304;
							}
							this.anIntArray354[local50] += Static299.anInt6041;
							this.anIntArray357[local50] += Static344.anInt6660;
							this.anIntArray355[local50] += Static347.anInt6686;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray36.length) {
						local48 = this.anIntArrayArray36[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local285 = this.anIntArray356[local56];
							local304 = this.anIntArray356[local56 + 1];
							for (local756 = local285; local756 < local304; local756++) {
								local765 = this.aShortArray88[local756] - 1;
								if (local765 == -1) {
									break;
								}
								@Pc(775) int local775;
								@Pc(779) int local779;
								@Pc(797) int local797;
								if (arg4 != 0) {
									local775 = Class4_Sub27.anIntArray296[arg4];
									local779 = Class4_Sub27.anIntArray297[arg4];
									local797 = this.aShortArray87[local765] * local779 + this.aShortArray80[local765] * local775 + 16383 >> 14;
									this.aShortArray80[local765] = (short) (this.aShortArray80[local765] * local779 + 16383 - local775 * this.aShortArray87[local765] >> 14);
									this.aShortArray87[local765] = (short) local797;
								}
								if (arg2 != 0) {
									local775 = Class4_Sub27.anIntArray296[arg2];
									local779 = Class4_Sub27.anIntArray297[arg2];
									local797 = local779 * this.aShortArray80[local765] + 16383 - this.aShortArray84[local765] * local775 >> 14;
									this.aShortArray84[local765] = (short) (local779 * this.aShortArray84[local765] + local775 * this.aShortArray80[local765] + 16383 >> 14);
									this.aShortArray80[local765] = (short) local797;
								}
								if (arg3 != 0) {
									local775 = Class4_Sub27.anIntArray296[arg3];
									local779 = Class4_Sub27.anIntArray297[arg3];
									local797 = local775 * this.aShortArray84[local765] + this.aShortArray87[local765] * local779 + 16383 >> 14;
									this.aShortArray84[local765] = (short) (this.aShortArray84[local765] * local779 + 16383 - this.aShortArray87[local765] * local775 >> 14);
									this.aShortArray87[local765] = (short) local797;
								}
							}
						}
					}
				}
				this.method5696();
			}
		} else if (arg0 == 3) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray36.length) {
					local166 = this.anIntArrayArray36[local32];
					for (local168 = 0; local168 < local166.length; local168++) {
						local50 = local166[local168];
						this.anIntArray354[local50] -= Static299.anInt6041;
						this.anIntArray357[local50] -= Static344.anInt6660;
						this.anIntArray355[local50] -= Static347.anInt6686;
						this.anIntArray354[local50] = this.anIntArray354[local50] * arg2 >> 7;
						this.anIntArray357[local50] = arg3 * this.anIntArray357[local50] >> 7;
						this.anIntArray355[local50] = this.anIntArray355[local50] * arg4 >> 7;
						this.anIntArray354[local50] += Static299.anInt6041;
						this.anIntArray357[local50] += Static344.anInt6660;
						this.anIntArray355[local50] += Static347.anInt6686;
					}
				}
			}
		} else {
			@Pc(1192) Class323 local1192;
			@Pc(1096) boolean local1096;
			@Pc(1187) Class61 local1187;
			if (arg0 == 5) {
				if (this.anIntArrayArray38 != null) {
					local1096 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray38.length) {
							local48 = this.anIntArrayArray38[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local285 = arg2 * 8 + (this.aByteArray81[local56] & 0xFF);
								if (local285 < 0) {
									local285 = 0;
								} else if (local285 > 255) {
									local285 = 255;
								}
								this.aByteArray81[local56] = (byte) local285;
							}
							local1096 |= local48.length > 0;
						}
					}
					if (local1096) {
						if (this.aClass61Array1 != null) {
							for (local38 = 0; local38 < this.anInt6817; local38++) {
								local1187 = this.aClass61Array1[local38];
								local1192 = this.aClass323Array1[local38];
								local1192.anInt9342 = local1192.anInt9342 & 0xFFFFFF | 255 - (this.aByteArray81[local1187.anInt2154] & 0xFF) << 24;
							}
						}
						this.method5703();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray38 != null) {
					local1096 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray38.length) {
							local48 = this.anIntArrayArray38[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local285 = this.aShortArray79[local56] & 0xFFFF;
								local304 = local285 >> 10 & 0x3F;
								local756 = local285 >> 7 & 0x7;
								local765 = local285 & 0x7F;
								local756 += arg3 / 4;
								@Pc(1289) int local1289 = local304 + arg2 & 0x3F;
								if (local756 < 0) {
									local756 = 0;
								} else if (local756 > 7) {
									local756 = 7;
								}
								local765 += arg4;
								if (local765 < 0) {
									local765 = 0;
								} else if (local765 > 127) {
									local765 = 127;
								}
								this.aShortArray79[local56] = (short) (local1289 << 10 | local756 << 7 | local765);
							}
							local1096 |= local48.length > 0;
						}
					}
					if (local1096) {
						if (this.aClass61Array1 != null) {
							for (local38 = 0; local38 < this.anInt6817; local38++) {
								local1187 = this.aClass61Array1[local38];
								local1192 = this.aClass323Array1[local38];
								local1192.anInt9342 = Static15.anIntArray11[this.aShortArray79[local1187.anInt2154] & 0xFFFF] & 0xFFFFFF | local1192.anInt9342 & 0xFF000000;
							}
						}
						this.method5703();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray37 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray37.length) {
							local166 = this.anIntArrayArray37[local32];
							for (local168 = 0; local168 < local166.length; local168++) {
								local1192 = this.aClass323Array1[local166[local168]];
								local1192.anInt9343 += arg3;
								local1192.anInt9336 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray37 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray37.length) {
							local166 = this.anIntArrayArray37[local32];
							for (local168 = 0; local168 < local166.length; local168++) {
								local1192 = this.aClass323Array1[local166[local168]];
								local1192.anInt9341 = local1192.anInt9341 * arg3 >> 7;
								local1192.anInt9338 = arg2 * local1192.anInt9338 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray37 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray37.length > local32) {
						local166 = this.anIntArrayArray37[local32];
						for (local168 = 0; local168 < local166.length; local168++) {
							local1192 = this.aClass323Array1[local166[local168]];
							local1192.anInt9347 = local1192.anInt9347 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
	public void method5697() {
		if (this.aClass264_2 != null) {
			this.aClass264_2.method6353();
		}
		if (this.aClass264_4 != null) {
			this.aClass264_4.method6353();
		}
		if (this.aClass264_1 != null) {
			this.aClass264_1.method6353();
		}
		if (this.aClass264_3 != null) {
			this.aClass264_3.method6353();
		}
		if (this.aClass347_1 != null) {
			this.aClass347_1.method8142();
		}
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(Z)V")
	private void method5699() {
		if (this.anInt6857 == 0) {
			return;
		}
		if (this.method5701() && this.method5690()) {
			this.aClass44_Sub2_10.method4358(0, this.aClass264_2.anInterface9_12);
			this.aClass44_Sub2_10.method4358(1, this.aClass264_1.anInterface9_12);
			this.aClass44_Sub2_10.method4358(2, this.aClass264_4.anInterface9_12);
			@Pc(51) boolean local51;
			if ((this.anInt6859 & 0x37) == 0) {
				local51 = false;
				this.aClass44_Sub2_10.method4244(false);
				this.aClass44_Sub2_10.method4374(this.aClass44_Sub2_10.aClass3_16);
			} else {
				local51 = true;
				this.aClass44_Sub2_10.method4244(true);
				this.aClass44_Sub2_10.method4358(3, this.aClass264_3.anInterface9_12);
				this.aClass44_Sub2_10.method4374(this.aClass44_Sub2_10.aClass3_19);
			}
			for (@Pc(89) int local89 = 0; local89 < this.anIntArray350.length; local89++) {
				@Pc(96) int local96 = this.anIntArray352[local89];
				@Pc(103) int local103 = this.anIntArray352[local89 + 1];
				@Pc(110) int local110 = this.aShortArray86[local96] & 0xFFFF;
				if (local110 == 65535) {
					local110 = -1;
				}
				this.aClass44_Sub2_10.method4272(local110, true, local51);
				this.aClass44_Sub2_10.method4361(local96 * 3, Static262.aClass271_5, local103 - local96, this.anIntArray350[local89], this.anIntArray353[local89], this.aClass347_1.anInterface3_7);
			}
		}
		this.method5691();
	}

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "(I)Z")
	private boolean method5701() {
		@Pc(18) boolean local18 = !this.aClass264_1.aBoolean529;
		@Pc(31) boolean local31 = (this.anInt6859 & 0x37) != 0 && !this.aClass264_3.aBoolean529;
		@Pc(39) boolean local39 = !this.aClass264_2.aBoolean529;
		@Pc(47) boolean local47 = !this.aClass264_4.aBoolean529;
		if (!local39 && !local18 && !local31 && !local47) {
			return true;
		}
		@Pc(59) boolean local59 = true;
		@Pc(78) Interface9 local78;
		@Pc(92) Buffer local92;
		if (local39) {
			if (this.aClass264_2.anInterface9_13 == null) {
				this.aClass264_2.anInterface9_13 = this.aClass44_Sub2_10.method4286(this.aBoolean492);
			}
			local78 = this.aClass264_2.anInterface9_13;
			local78.method5102(12, this.anInt6807 * 12);
			local92 = local78.method5100();
			if (local92 == null) {
				local59 = false;
			} else {
				this.aClass44_Sub2_10.aNativeInterface3.copyPositions(this.anIntArray354, this.anIntArray357, this.anIntArray355, this.aShortArray81, 0, 12, this.anInt6807, local92.getAddress());
				if (local78.method5101()) {
					this.aClass264_2.aBoolean529 = true;
					this.aClass264_2.anInterface9_12 = local78;
				} else {
					local59 = false;
				}
			}
		}
		@Pc(220) short[] local220;
		@Pc(208) short[] local208;
		@Pc(212) short[] local212;
		@Pc(216) byte[] local216;
		if (local18) {
			if (this.aClass264_1.anInterface9_13 == null) {
				this.aClass264_1.anInterface9_13 = this.aClass44_Sub2_10.method4286(this.aBoolean492);
			}
			local78 = this.aClass264_1.anInterface9_13;
			local78.method5102(4, this.anInt6807 * 4);
			local92 = local78.method5100();
			if (local92 == null) {
				local59 = false;
			} else {
				if ((this.anInt6859 & 0x37) == 0) {
					if (this.aClass43_1 == null) {
						local216 = this.aByteArray82;
						local208 = this.aShortArray80;
						local220 = this.aShortArray87;
						local212 = this.aShortArray84;
					} else {
						local208 = this.aClass43_1.aShortArray9;
						local212 = this.aClass43_1.aShortArray10;
						local216 = this.aClass43_1.aByteArray10;
						local220 = this.aClass43_1.aShortArray11;
					}
					this.aClass44_Sub2_10.aNativeInterface3.copyLighting(this.aShortArray79, this.aByteArray81, this.aShortArray86, local220, local208, local212, local216, this.aShort80, this.aShort81, this.aShortArray83, 0, 4, this.anInt6807, local92.getAddress());
				} else {
					this.aClass44_Sub2_10.aNativeInterface3.copyColours(this.aShortArray79, this.aByteArray81, this.aShortArray86, this.aShort80, this.aShortArray83, 0, 4, this.anInt6807, local92.getAddress());
				}
				if (local78.method5101()) {
					this.aClass264_1.anInterface9_12 = local78;
					this.aClass264_1.aBoolean529 = true;
				} else {
					local59 = false;
				}
			}
		}
		if (local31) {
			if (this.aClass264_3.anInterface9_13 == null) {
				this.aClass264_3.anInterface9_13 = this.aClass44_Sub2_10.method4286(this.aBoolean492);
			}
			local78 = this.aClass264_3.anInterface9_13;
			local78.method5102(12, this.anInt6807 * 12);
			local92 = local78.method5100();
			if (local92 == null) {
				local59 = false;
			} else {
				if (this.aClass43_1 == null) {
					local212 = this.aShortArray84;
					local220 = this.aShortArray87;
					local208 = this.aShortArray80;
					local216 = this.aByteArray82;
				} else {
					local212 = this.aClass43_1.aShortArray10;
					local220 = this.aClass43_1.aShortArray11;
					local216 = this.aClass43_1.aByteArray10;
					local208 = this.aClass43_1.aShortArray9;
				}
				this.aClass44_Sub2_10.aNativeInterface3.copyNormals(local220, local208, local212, local216, 3.0F / (float) this.aShort81, 3.0F / (float) (this.aShort81 / 2 + this.aShort81), 0, 12, this.anInt6807, local92.getAddress());
				if (local78.method5101()) {
					this.aClass264_3.anInterface9_12 = local78;
					this.aClass264_3.aBoolean529 = true;
				} else {
					local59 = false;
				}
			}
		}
		if (local47) {
			if (this.aClass264_4.anInterface9_13 == null) {
				this.aClass264_4.anInterface9_13 = this.aClass44_Sub2_10.method4286(this.aBoolean492);
			}
			local78 = this.aClass264_4.anInterface9_13;
			local78.method5102(8, this.anInt6807 * 8);
			local92 = local78.method5100();
			if (local92 == null) {
				local59 = false;
			} else {
				this.aClass44_Sub2_10.aNativeInterface3.copyTexCoords(this.aFloatArray50, this.aFloatArray49, 0, 8, this.anInt6807, local92.getAddress());
				if (local78.method5101()) {
					this.aClass264_4.anInterface9_12 = local78;
					this.aClass264_4.aBoolean529 = true;
				} else {
					local59 = false;
				}
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!nk", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6860; local3++) {
			this.anIntArray355[local3] = -this.anIntArray355[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt6807; local25++) {
			this.aShortArray84[local25] = (short) -this.aShortArray84[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt6850; local48++) {
			@Pc(55) short local55 = this.aShortArray77[local48];
			this.aShortArray77[local48] = this.aShortArray89[local48];
			this.aShortArray89[local48] = local55;
		}
		this.method5705();
		this.method5696();
		this.method5695();
		this.aBoolean493 = false;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7922(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class57_Sub3 local8 = (Class57_Sub3) arg0;
		if (this.anInt6850 == 0 || local8.anInt6850 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt6860;
		@Pc(27) int[] local27 = local8.anIntArray354;
		@Pc(30) int[] local30 = local8.anIntArray357;
		@Pc(33) int[] local33 = local8.anIntArray355;
		@Pc(36) short[] local36 = local8.aShortArray87;
		@Pc(39) short[] local39 = local8.aShortArray80;
		@Pc(42) short[] local42 = local8.aShortArray84;
		@Pc(45) byte[] local45 = local8.aByteArray82;
		@Pc(54) short[] local54;
		@Pc(52) short[] local52;
		@Pc(50) short[] local50;
		@Pc(56) byte[] local56;
		if (this.aClass43_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local52 = this.aClass43_1.aShortArray9;
			local54 = this.aClass43_1.aShortArray11;
			local50 = this.aClass43_1.aShortArray10;
			local56 = this.aClass43_1.aByteArray10;
		}
		@Pc(79) short[] local79;
		@Pc(81) short[] local81;
		@Pc(83) short[] local83;
		@Pc(85) byte[] local85;
		if (local8.aClass43_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local85 = local8.aClass43_1.aByteArray10;
			local81 = local8.aClass43_1.aShortArray9;
			local79 = local8.aClass43_1.aShortArray11;
			local83 = local8.aClass43_1.aShortArray10;
		}
		@Pc(106) int[] local106 = local8.anIntArray356;
		@Pc(109) short[] local109 = local8.aShortArray88;
		if (!local8.aBoolean493) {
			local8.method5692();
		}
		@Pc(118) int local118 = local8.anInt6852;
		@Pc(121) int local121 = local8.anInt6842;
		@Pc(124) int local124 = local8.anInt6828;
		@Pc(127) int local127 = local8.anInt6815;
		@Pc(130) int local130 = local8.anInt6788;
		@Pc(133) int local133 = local8.anInt6811;
		for (@Pc(135) int local135 = 0; local135 < this.anInt6860; local135++) {
			@Pc(144) int local144 = this.anIntArray357[local135] - arg2;
			if (local118 <= local144 && local121 >= local144) {
				@Pc(160) int local160 = this.anIntArray354[local135] - arg1;
				if (local160 >= local124 && local127 >= local160) {
					@Pc(175) int local175 = this.anIntArray355[local135] - arg3;
					if (local175 >= local130 && local133 >= local175) {
						@Pc(185) int local185 = -1;
						@Pc(190) int local190 = this.anIntArray356[local135];
						@Pc(197) int local197 = this.anIntArray356[local135 + 1];
						for (@Pc(199) int local199 = local190; local199 < local197; local199++) {
							local185 = this.aShortArray88[local199] - 1;
							if (local185 == -1 || this.aByteArray82[local185] != 0) {
								break;
							}
						}
						if (local185 != -1) {
							for (@Pc(235) int local235 = 0; local235 < local24; local235++) {
								if (local160 == local27[local235] && local33[local235] == local175 && local144 == local30[local235]) {
									@Pc(258) int local258 = -1;
									local190 = local106[local235];
									local197 = local106[local235 + 1];
									for (@Pc(270) int local270 = local190; local270 < local197; local270++) {
										local258 = local109[local270] - 1;
										if (local258 == -1 || local45[local258] != 0) {
											break;
										}
									}
									if (local258 != -1) {
										if (local54 == null) {
											this.aClass43_1 = new Class43();
											local54 = this.aClass43_1.aShortArray11 = Static112.method2452(this.aShortArray87);
											local52 = this.aClass43_1.aShortArray9 = Static112.method2452(this.aShortArray80);
											local50 = this.aClass43_1.aShortArray10 = Static112.method2452(this.aShortArray84);
											local56 = this.aClass43_1.aByteArray10 = Static587.method8309(this.aByteArray82);
										}
										if (local79 == null) {
											@Pc(354) Class43 local354 = local8.aClass43_1 = new Class43();
											local79 = local354.aShortArray11 = Static112.method2452(local36);
											local81 = local354.aShortArray9 = Static112.method2452(local39);
											local83 = local354.aShortArray10 = Static112.method2452(local42);
											local85 = local354.aByteArray10 = Static587.method8309(local45);
										}
										@Pc(387) short local387 = this.aShortArray87[local185];
										@Pc(392) short local392 = this.aShortArray80[local185];
										@Pc(397) short local397 = this.aShortArray84[local185];
										@Pc(402) byte local402 = this.aByteArray82[local185];
										local190 = local106[local235];
										local197 = local106[local235 + 1];
										@Pc(422) int local422;
										for (@Pc(414) int local414 = local190; local414 < local197; local414++) {
											local422 = local109[local414] - 1;
											if (local422 == -1) {
												break;
											}
											if (local85[local422] != 0) {
												local79[local422] += local387;
												local81[local422] += local392;
												local83[local422] += local397;
												local85[local422] += local402;
											}
										}
										local397 = local42[local258];
										local387 = local36[local258];
										local197 = this.anIntArray356[local135 + 1];
										local392 = local39[local258];
										local190 = this.anIntArray356[local135];
										local402 = local45[local258];
										for (local422 = local190; local422 < local197; local422++) {
											@Pc(507) int local507 = this.aShortArray88[local422] - 1;
											if (local507 == -1) {
												break;
											}
											if (local56[local507] != 0) {
												local54[local507] += local387;
												local52[local507] += local392;
												local50[local507] += local397;
												local56[local507] += local402;
											}
										}
										local8.method5696();
										this.method5696();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray36 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt6855; local12++) {
			this.anIntArray354[local12] <<= 0x4;
			this.anIntArray357[local12] <<= 0x4;
			this.anIntArray355[local12] <<= 0x4;
		}
		Static347.anInt6686 = 0;
		Static299.anInt6041 = 0;
		Static344.anInt6660 = 0;
		return true;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!rr;B)V")
	private void method5702(@OriginalArg(0) Class4_Sub5_Sub6_Sub1 arg0) {
		if (Static508.anIntArray491.length < this.anInt6807) {
			Static5.anIntArray6 = new int[this.anInt6807];
			Static508.anIntArray491 = new int[this.anInt6807];
		}
		@Pc(47) int local47;
		@Pc(85) int local85;
		@Pc(94) int local94;
		for (@Pc(20) int local20 = 0; local20 < this.anInt6860; local20++) {
			local47 = (this.anIntArray354[local20] - (this.anIntArray357[local20] * this.aClass44_Sub2_10.anInt4945 >> 8) >> this.aClass44_Sub2_10.anInt4939) - arg0.anInt8626;
			@Pc(71) int local71 = (this.anIntArray355[local20] - (this.aClass44_Sub2_10.anInt4941 * this.anIntArray357[local20] >> 8) >> this.aClass44_Sub2_10.anInt4939) - arg0.anInt8631;
			@Pc(76) int local76 = this.anIntArray356[local20];
			@Pc(83) int local83 = this.anIntArray356[local20 + 1];
			for (local85 = local76; local85 < local83; local85++) {
				local94 = this.aShortArray88[local85] - 1;
				if (local94 == -1) {
					break;
				}
				Static508.anIntArray491[local94] = local47;
				Static5.anIntArray6[local94] = local71;
			}
		}
		for (local47 = 0; local47 < this.anInt6857; local47++) {
			if (this.aByteArray81 == null || this.aByteArray81[local47] <= 128) {
				@Pc(142) short local142 = this.aShortArray77[local47];
				@Pc(147) short local147 = this.aShortArray85[local47];
				@Pc(152) short local152 = this.aShortArray89[local47];
				local85 = Static508.anIntArray491[local142];
				local94 = Static508.anIntArray491[local147];
				@Pc(164) int local164 = Static508.anIntArray491[local152];
				@Pc(168) int local168 = Static5.anIntArray6[local142];
				@Pc(172) int local172 = Static5.anIntArray6[local147];
				@Pc(176) int local176 = Static5.anIntArray6[local152];
				if (-((local172 - local168) * (-local94 + local164)) + (local85 - local94) * (local172 - local176) > 0) {
					arg0.method7040(local168, local94, local176, local172, local164, local85);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt6839;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt6850; local7++) {
			local16 = this.aShortArray79[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 -= -(arg3 * (arg0 - local22) >> 7);
			}
			@Pc(47) int local47 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg2 != -1) {
				local47 += arg3 * (arg2 - local47) >> 7;
			}
			this.aShortArray79[local7] = (short) (local22 << 10 | local28 << 7 | local47);
		}
		if (this.aClass61Array1 != null) {
			for (local16 = 0; local16 < this.anInt6817; local16++) {
				@Pc(105) Class61 local105 = this.aClass61Array1[local16];
				@Pc(110) Class323 local110 = this.aClass323Array1[local16];
				local110.anInt9342 = local110.anInt9342 & 0xFF000000 | Static15.anIntArray11[this.aShortArray79[local105.anInt2154] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5703();
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(Z)V")
	private void method5703() {
		if (this.aClass264_1 != null) {
			this.aClass264_1.aBoolean529 = false;
		}
	}

	@OriginalMember(owner = "client!nk", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		this.aShort80 = (short) arg0;
		this.method5703();
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "()V")
	@Override
	protected void method7911() {
	}

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean493) {
			this.method5692();
		}
		return this.anInt6815;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!nk;ZILclient!nk;IZ)Lclient!da;")
	private Class57 method5704(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class57_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		arg0.anInt6850 = this.anInt6850;
		arg0.anInt6839 = arg3;
		arg0.anInt6857 = this.anInt6857;
		if ((arg3 & 0x100) == 0) {
			arg0.aBoolean494 = this.aBoolean494;
		} else {
			arg0.aBoolean494 = true;
		}
		arg0.anInt6817 = this.anInt6817;
		arg0.anInt6859 = this.anInt6859;
		arg0.anInt6807 = this.anInt6807;
		arg0.anInt6855 = this.anInt6855;
		arg0.aShort81 = this.aShort81;
		arg0.anInt6860 = this.anInt6860;
		arg0.aShort80 = this.aShort80;
		@Pc(71) boolean local71 = Static562.method8063(arg3, this.anInt6859);
		@Pc(77) boolean local77 = Static219.method3585(this.anInt6859, arg3);
		@Pc(83) boolean local83 = Static394.method6254(arg3, this.anInt6859);
		@Pc(89) boolean local89 = local83 | local77 | local71;
		@Pc(194) int local194;
		if (local89) {
			if (!local71) {
				arg0.anIntArray354 = this.anIntArray354;
			} else if (arg2.anIntArray354 == null || arg2.anIntArray354.length < this.anInt6855) {
				arg0.anIntArray354 = arg2.anIntArray354 = new int[this.anInt6855];
			} else {
				arg0.anIntArray354 = arg2.anIntArray354;
			}
			if (!local77) {
				arg0.anIntArray357 = this.anIntArray357;
			} else if (arg2.anIntArray357 == null || this.anInt6855 > arg2.anIntArray357.length) {
				arg0.anIntArray357 = arg2.anIntArray357 = new int[this.anInt6855];
			} else {
				arg0.anIntArray357 = arg2.anIntArray357;
			}
			if (!local83) {
				arg0.anIntArray355 = this.anIntArray355;
			} else if (arg2.anIntArray355 == null || this.anInt6855 > arg2.anIntArray355.length) {
				arg0.anIntArray355 = arg2.anIntArray355 = new int[this.anInt6855];
			} else {
				arg0.anIntArray355 = arg2.anIntArray355;
			}
			for (local194 = 0; local194 < this.anInt6855; local194++) {
				if (local71) {
					arg0.anIntArray354[local194] = this.anIntArray354[local194];
				}
				if (local77) {
					arg0.anIntArray357[local194] = this.anIntArray357[local194];
				}
				if (local83) {
					arg0.anIntArray355[local194] = this.anIntArray355[local194];
				}
			}
		} else {
			arg0.anIntArray354 = this.anIntArray354;
			arg0.anIntArray355 = this.anIntArray355;
			arg0.anIntArray357 = this.anIntArray357;
		}
		if (Static485.method7231(arg3, this.anInt6859)) {
			arg0.aClass264_2 = arg2.aClass264_2;
			arg0.aClass264_2.anInterface9_12 = this.aClass264_2.anInterface9_12;
			arg0.aClass264_2.aBoolean529 = this.aClass264_2.aBoolean529;
			arg0.aClass264_2.aBoolean528 = true;
		} else if (Static526.method3100(this.anInt6859, arg3)) {
			arg0.aClass264_2 = this.aClass264_2;
		} else {
			arg0.aClass264_2 = null;
		}
		if (Static554.method8025(this.anInt6859, arg3)) {
			if (arg2.aShortArray79 == null || arg2.aShortArray79.length < this.anInt6850) {
				arg0.aShortArray79 = arg2.aShortArray79 = new short[this.anInt6850];
			} else {
				arg0.aShortArray79 = arg2.aShortArray79;
			}
			for (local194 = 0; local194 < this.anInt6850; local194++) {
				arg0.aShortArray79[local194] = this.aShortArray79[local194];
			}
		} else {
			arg0.aShortArray79 = this.aShortArray79;
		}
		if (Static480.method8255(this.anInt6859, arg3)) {
			if (arg2.aByteArray81 == null || this.anInt6850 > arg2.aByteArray81.length) {
				arg0.aByteArray81 = arg2.aByteArray81 = new byte[this.anInt6850];
			} else {
				arg0.aByteArray81 = arg2.aByteArray81;
			}
			for (local194 = 0; local194 < this.anInt6850; local194++) {
				arg0.aByteArray81[local194] = this.aByteArray81[local194];
			}
		} else {
			arg0.aByteArray81 = this.aByteArray81;
		}
		if (Static401.method6308(arg3, this.anInt6859)) {
			arg0.aClass264_1 = arg2.aClass264_1;
			arg0.aClass264_1.aBoolean529 = this.aClass264_1.aBoolean529;
			arg0.aClass264_1.aBoolean528 = true;
			arg0.aClass264_1.anInterface9_12 = this.aClass264_1.anInterface9_12;
		} else if (Static570.method8152(arg3, this.anInt6859)) {
			arg0.aClass264_1 = this.aClass264_1;
		} else {
			arg0.aClass264_1 = null;
		}
		@Pc(531) int local531;
		if (Static296.method5098(arg3, this.anInt6859)) {
			if (arg2.aShortArray87 == null || this.anInt6807 > arg2.aShortArray87.length) {
				local194 = this.anInt6807;
				arg0.aShortArray87 = arg2.aShortArray87 = new short[local194];
				arg0.aShortArray84 = arg2.aShortArray84 = new short[local194];
				arg0.aShortArray80 = arg2.aShortArray80 = new short[local194];
			} else {
				arg0.aShortArray87 = arg2.aShortArray87;
				arg0.aShortArray80 = arg2.aShortArray80;
				arg0.aShortArray84 = arg2.aShortArray84;
			}
			if (this.aClass43_1 == null) {
				arg0.aClass43_1 = null;
				for (local194 = 0; local194 < this.anInt6807; local194++) {
					arg0.aShortArray87[local194] = this.aShortArray87[local194];
					arg0.aShortArray80[local194] = this.aShortArray80[local194];
					arg0.aShortArray84[local194] = this.aShortArray84[local194];
				}
			} else {
				if (arg2.aClass43_1 == null) {
					arg2.aClass43_1 = new Class43();
				}
				@Pc(515) Class43 local515 = arg0.aClass43_1 = arg2.aClass43_1;
				if (local515.aShortArray11 == null || local515.aShortArray11.length < this.anInt6807) {
					local531 = this.anInt6807;
					local515.aShortArray11 = new short[local531];
					local515.aShortArray10 = new short[local531];
					local515.aByteArray10 = new byte[local531];
					local515.aShortArray9 = new short[local531];
				}
				for (local531 = 0; local531 < this.anInt6807; local531++) {
					arg0.aShortArray87[local531] = this.aShortArray87[local531];
					arg0.aShortArray80[local531] = this.aShortArray80[local531];
					arg0.aShortArray84[local531] = this.aShortArray84[local531];
					local515.aShortArray11[local531] = this.aClass43_1.aShortArray11[local531];
					local515.aShortArray9[local531] = this.aClass43_1.aShortArray9[local531];
					local515.aShortArray10[local531] = this.aClass43_1.aShortArray10[local531];
					local515.aByteArray10[local531] = this.aClass43_1.aByteArray10[local531];
				}
			}
			arg0.aByteArray82 = this.aByteArray82;
		} else {
			arg0.aShortArray84 = this.aShortArray84;
			arg0.aByteArray82 = this.aByteArray82;
			arg0.aShortArray87 = this.aShortArray87;
			arg0.aClass43_1 = this.aClass43_1;
			arg0.aShortArray80 = this.aShortArray80;
		}
		if (Static347.method5596(this.anInt6859, arg3)) {
			arg0.aClass264_3 = arg2.aClass264_3;
			arg0.aClass264_3.aBoolean529 = this.aClass264_3.aBoolean529;
			arg0.aClass264_3.anInterface9_12 = this.aClass264_3.anInterface9_12;
			arg0.aClass264_3.aBoolean528 = true;
		} else if (Static217.method8380(this.anInt6859, arg3)) {
			arg0.aClass264_3 = this.aClass264_3;
		} else {
			arg0.aClass264_3 = null;
		}
		if (Static224.method3664(arg3, this.anInt6859)) {
			if (arg2.aFloatArray50 == null || arg2.aFloatArray50.length < this.anInt6850) {
				local194 = this.anInt6807;
				arg0.aFloatArray50 = arg2.aFloatArray50 = new float[local194];
				arg0.aFloatArray49 = arg2.aFloatArray49 = new float[local194];
			} else {
				arg0.aFloatArray49 = arg2.aFloatArray49;
				arg0.aFloatArray50 = arg2.aFloatArray50;
			}
			for (local194 = 0; local194 < this.anInt6807; local194++) {
				arg0.aFloatArray50[local194] = this.aFloatArray50[local194];
				arg0.aFloatArray49[local194] = this.aFloatArray49[local194];
			}
		} else {
			arg0.aFloatArray49 = this.aFloatArray49;
			arg0.aFloatArray50 = this.aFloatArray50;
		}
		if (Static544.method7890(arg3, this.anInt6859)) {
			arg0.aClass264_4 = arg2.aClass264_4;
			arg0.aClass264_4.aBoolean528 = true;
			arg0.aClass264_4.aBoolean529 = this.aClass264_4.aBoolean529;
			arg0.aClass264_4.anInterface9_12 = this.aClass264_4.anInterface9_12;
		} else if (Static222.method3619(this.anInt6859, arg3)) {
			arg0.aClass264_4 = this.aClass264_4;
		} else {
			arg0.aClass264_4 = null;
		}
		if (Static92.method2101(arg3, this.anInt6859)) {
			if (arg2.aShortArray77 == null || arg2.aShortArray77.length < this.anInt6850) {
				local194 = this.anInt6850;
				arg0.aShortArray89 = arg2.aShortArray89 = new short[local194];
				arg0.aShortArray85 = arg2.aShortArray85 = new short[local194];
				arg0.aShortArray77 = arg2.aShortArray77 = new short[local194];
			} else {
				arg0.aShortArray77 = arg2.aShortArray77;
				arg0.aShortArray89 = arg2.aShortArray89;
				arg0.aShortArray85 = arg2.aShortArray85;
			}
			for (local194 = 0; local194 < this.anInt6850; local194++) {
				arg0.aShortArray77[local194] = this.aShortArray77[local194];
				arg0.aShortArray85[local194] = this.aShortArray85[local194];
				arg0.aShortArray89[local194] = this.aShortArray89[local194];
			}
		} else {
			arg0.aShortArray89 = this.aShortArray89;
			arg0.aShortArray85 = this.aShortArray85;
			arg0.aShortArray77 = this.aShortArray77;
		}
		if (Static420.method6570(arg3, this.anInt6859)) {
			arg0.aClass347_1 = arg2.aClass347_1;
			arg0.aClass347_1.anInterface3_7 = this.aClass347_1.anInterface3_7;
			arg0.aClass347_1.aBoolean702 = true;
			arg0.aClass347_1.aBoolean703 = this.aClass347_1.aBoolean703;
		} else if (Static112.method2453(this.anInt6859, arg3)) {
			arg0.aClass347_1 = this.aClass347_1;
		} else {
			arg0.aClass347_1 = null;
		}
		if (Static248.method3992(this.anInt6859, arg3)) {
			if (arg2.aShortArray86 == null || arg2.aShortArray86.length < this.anInt6850) {
				local194 = this.anInt6850;
				arg0.aShortArray86 = arg2.aShortArray86 = new short[local194];
			} else {
				arg0.aShortArray86 = arg2.aShortArray86;
			}
			for (local194 = 0; local194 < this.anInt6850; local194++) {
				arg0.aShortArray86[local194] = this.aShortArray86[local194];
			}
		} else {
			arg0.aShortArray86 = this.aShortArray86;
		}
		if (!Static347.method5597(this.anInt6859, arg3)) {
			arg0.aClass323Array1 = this.aClass323Array1;
		} else if (arg2.aClass323Array1 == null || this.anInt6817 > arg2.aClass323Array1.length) {
			local194 = this.anInt6817;
			arg0.aClass323Array1 = arg2.aClass323Array1 = new Class323[local194];
			for (local531 = 0; local531 < this.anInt6817; local531++) {
				arg0.aClass323Array1[local531] = this.aClass323Array1[local531].method7610();
			}
		} else {
			arg0.aClass323Array1 = arg2.aClass323Array1;
			for (local194 = 0; local194 < this.anInt6817; local194++) {
				arg0.aClass323Array1[local194].method7611(this.aClass323Array1[local194]);
			}
		}
		arg0.aClass227Array4 = this.aClass227Array4;
		arg0.aClass61Array1 = this.aClass61Array1;
		arg0.aClass103Array4 = this.aClass103Array4;
		arg0.aShortArray88 = this.aShortArray88;
		arg0.aShortArray81 = this.aShortArray81;
		arg0.anIntArrayArray37 = this.anIntArrayArray37;
		arg0.anIntArray352 = this.anIntArray352;
		arg0.aShortArray78 = this.aShortArray78;
		arg0.anIntArrayArray38 = this.anIntArrayArray38;
		if (this.aBoolean493) {
			arg0.anInt6852 = this.anInt6852;
			arg0.anInt6815 = this.anInt6815;
			arg0.anInt6828 = this.anInt6828;
			arg0.anInt6842 = this.anInt6842;
			arg0.anInt6784 = this.anInt6784;
			arg0.anInt6811 = this.anInt6811;
			arg0.aBoolean493 = true;
			arg0.anInt6846 = this.anInt6846;
			arg0.anInt6788 = this.anInt6788;
		} else {
			arg0.aBoolean493 = false;
		}
		arg0.aShortArray82 = this.aShortArray82;
		arg0.anIntArray356 = this.anIntArray356;
		arg0.anIntArray350 = this.anIntArray350;
		arg0.aShortArray83 = this.aShortArray83;
		arg0.anIntArrayArray36 = this.anIntArrayArray36;
		arg0.anIntArray353 = this.anIntArray353;
		return arg0;
	}

	@OriginalMember(owner = "client!nk", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6860; local7++) {
			if (arg0 != 128) {
				this.anIntArray354[local7] = arg0 * this.anIntArray354[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray357[local7] = arg1 * this.anIntArray357[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray355[local7] = arg2 * this.anIntArray355[local7] >> 7;
			}
		}
		this.method5705();
		this.aBoolean493 = false;
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6850; local3++) {
			if (this.aShortArray79[local3] == arg0) {
				this.aShortArray79[local3] = arg1;
			}
		}
		if (this.aClass61Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt6817; local30++) {
				@Pc(37) Class61 local37 = this.aClass61Array1[local30];
				@Pc(42) Class323 local42 = this.aClass323Array1[local30];
				local42.anInt9342 = Static15.anIntArray11[this.aShortArray79[local37.anInt2154] & 0xFFFF] & 0xFFFFFF | local42.anInt9342 & 0xFF000000;
			}
		}
		this.method5703();
	}

	@OriginalMember(owner = "client!nk", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub27.anIntArray296[arg0];
		@Pc(13) int local13 = Class4_Sub27.anIntArray297[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6860; local15++) {
			@Pc(34) int local34 = this.anIntArray357[local15] * local13 - local9 * this.anIntArray355[local15] >> 14;
			this.anIntArray355[local15] = local13 * this.anIntArray355[local15] + local9 * this.anIntArray357[local15] >> 14;
			this.anIntArray357[local15] = local34;
		}
		this.method5705();
		this.aBoolean493 = false;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!q;Lclient!mj;I)V")
	@Override
	public void method7927(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class1_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6807 == 0) {
			return;
		}
		@Pc(13) Class8_Sub3 local13 = this.aClass44_Sub2_10.aClass8_Sub3_16;
		if (!this.aBoolean493) {
			this.method5692();
		}
		@Pc(22) Class8_Sub3 local22 = (Class8_Sub3) arg0;
		Static298.aFloat190 = local13.aFloat42 + local22.aFloat47 * local13.aFloat43 + local13.aFloat38 * local22.aFloat40 + local13.aFloat39 * local22.aFloat42;
		Static224.aFloat132 = local13.aFloat39 * local22.aFloat43 + local22.aFloat46 * local13.aFloat38 + local22.aFloat37 * local13.aFloat43;
		@Pc(69) float local69 = Static298.aFloat190 + Static224.aFloat132 * (float) this.anInt6852;
		@Pc(77) float local77 = (float) this.anInt6842 * Static224.aFloat132 + Static298.aFloat190;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local69 > local77) {
			local88 = (float) -this.anInt6846 + local77;
			local94 = local69 + (float) this.anInt6846;
		} else {
			local94 = local77 + (float) this.anInt6846;
			local88 = (float) -this.anInt6846 + local69;
		}
		if (this.aClass44_Sub2_10.aFloat148 <= local88 || (float) this.aClass44_Sub2_10.anInt4965 >= local94) {
			return;
		}
		Static267.aFloat159 = local22.aFloat46 * local13.aFloat45 + local22.aFloat37 * local13.aFloat46 + local22.aFloat43 * local13.aFloat41;
		Static524.aFloat228 = local13.aFloat40 + local22.aFloat42 * local13.aFloat41 + local13.aFloat45 * local22.aFloat40 + local22.aFloat47 * local13.aFloat46;
		@Pc(171) float local171 = Static524.aFloat228 + Static267.aFloat159 * (float) this.anInt6852;
		@Pc(179) float local179 = Static524.aFloat228 + (float) this.anInt6842 * Static267.aFloat159;
		@Pc(206) float local206;
		@Pc(194) float local194;
		if (local171 > local179) {
			local194 = (local171 + (float) this.anInt6846) * (float) this.aClass44_Sub2_10.bf;
			local206 = ((float) -this.anInt6846 + local179) * (float) this.aClass44_Sub2_10.bf;
		} else {
			local206 = (float) this.aClass44_Sub2_10.bf * (local171 - (float) this.anInt6846);
			local194 = (float) this.aClass44_Sub2_10.bf * ((float) this.anInt6846 + local179);
		}
		if (this.aClass44_Sub2_10.aFloat157 <= local206 / local94 || this.aClass44_Sub2_10.aFloat154 >= local194 / local94) {
			return;
		}
		Static481.aFloat217 = local13.aFloat47 + local22.aFloat47 * local13.aFloat37 + local22.aFloat40 * local13.aFloat44 + local13.aFloat48 * local22.aFloat42;
		Static361.aFloat197 = local13.aFloat44 * local22.aFloat46 + local22.aFloat37 * local13.aFloat37 + local13.aFloat48 * local22.aFloat43;
		@Pc(295) float local295 = (float) this.anInt6852 * Static361.aFloat197 + Static481.aFloat217;
		@Pc(303) float local303 = Static481.aFloat217 + Static361.aFloat197 * (float) this.anInt6842;
		@Pc(330) float local330;
		@Pc(318) float local318;
		if (local303 < local295) {
			local318 = (float) this.aClass44_Sub2_10.anInt4949 * ((float) this.anInt6846 + local295);
			local330 = (float) this.aClass44_Sub2_10.anInt4949 * ((float) -this.anInt6846 + local303);
		} else {
			local330 = (local295 - (float) this.anInt6846) * (float) this.aClass44_Sub2_10.anInt4949;
			local318 = (float) this.aClass44_Sub2_10.anInt4949 * ((float) this.anInt6846 + local303);
		}
		if (this.aClass44_Sub2_10.aFloat147 <= local330 / local94 || this.aClass44_Sub2_10.aFloat143 >= local318 / local94) {
			return;
		}
		if (arg1 != null || this.aClass61Array1 != null) {
			Static313.aFloat140 = local13.aFloat37 * local22.aFloat48 + local22.aFloat41 * local13.aFloat44 + local13.aFloat48 * local22.aFloat39;
			Static430.aFloat209 = local13.aFloat39 * local22.aFloat38 + local22.aFloat44 * local13.aFloat43 + local13.aFloat38 * local22.aFloat45;
			Static560.aFloat225 = local22.aFloat41 * local13.aFloat45 + local13.aFloat46 * local22.aFloat48 + local13.aFloat41 * local22.aFloat39;
			Static18.aFloat15 = local13.aFloat39 * local22.aFloat39 + local22.aFloat48 * local13.aFloat43 + local13.aFloat38 * local22.aFloat41;
			Static452.aFloat215 = local22.aFloat38 * local13.aFloat41 + local22.aFloat45 * local13.aFloat45 + local13.aFloat46 * local22.aFloat44;
			Static316.aFloat192 = local22.aFloat38 * local13.aFloat48 + local13.aFloat37 * local22.aFloat44 + local22.aFloat45 * local13.aFloat44;
		}
		if (arg1 != null) {
			@Pc(489) boolean local489 = false;
			@Pc(491) boolean local491 = true;
			@Pc(499) int local499 = this.anInt6815 + this.anInt6828 >> 1;
			@Pc(507) int local507 = this.anInt6811 + this.anInt6788 >> 1;
			@Pc(526) int local526 = (int) (Static524.aFloat228 + (float) local499 * Static452.aFloat215 + (float) this.anInt6852 * Static267.aFloat159 + Static560.aFloat225 * (float) local507);
			@Pc(545) int local545 = (int) ((float) local507 * Static313.aFloat140 + Static361.aFloat197 * (float) this.anInt6852 + Static316.aFloat192 * (float) local499 + Static481.aFloat217);
			@Pc(564) int local564 = (int) (Static298.aFloat190 + Static430.aFloat209 * (float) local499 + Static224.aFloat132 * (float) this.anInt6852 + (float) local507 * Static18.aFloat15);
			if (this.aClass44_Sub2_10.anInt4965 > local564) {
				local489 = true;
			} else {
				arg1.anInt6297 = this.aClass44_Sub2_10.anInt4972 + this.aClass44_Sub2_10.bf * local526 / local564;
				arg1.anInt6299 = this.aClass44_Sub2_10.anInt4954 + local545 * this.aClass44_Sub2_10.anInt4949 / local564;
			}
			@Pc(618) int local618 = (int) ((float) this.anInt6842 * Static267.aFloat159 + Static452.aFloat215 * (float) local499 + Static524.aFloat228 + (float) local507 * Static560.aFloat225);
			@Pc(637) int local637 = (int) ((float) local507 * Static313.aFloat140 + (float) local499 * Static316.aFloat192 + Static481.aFloat217 + (float) this.anInt6842 * Static361.aFloat197);
			@Pc(656) int local656 = (int) ((float) this.anInt6842 * Static224.aFloat132 + Static298.aFloat190 + Static430.aFloat209 * (float) local499 + (float) local507 * Static18.aFloat15);
			if (local656 < this.aClass44_Sub2_10.anInt4965) {
				local489 = true;
			} else {
				arg1.anInt6301 = this.aClass44_Sub2_10.anInt4972 + local618 * this.aClass44_Sub2_10.bf / local656;
				arg1.anInt6300 = this.aClass44_Sub2_10.anInt4954 + local637 * this.aClass44_Sub2_10.anInt4949 / local656;
			}
			if (local489) {
				if (local564 < this.aClass44_Sub2_10.anInt4965 && this.aClass44_Sub2_10.anInt4965 > local656) {
					local491 = false;
				} else {
					@Pc(736) int local736;
					@Pc(748) int local748;
					@Pc(758) int local758;
					if (local564 < this.aClass44_Sub2_10.anInt4965) {
						local736 = (local656 - this.aClass44_Sub2_10.anInt4965 << 16) / (local656 - local564);
						local748 = local618 + (local736 * (local618 - local526) >> 16);
						local758 = (local736 * (local637 - local545) >> 16) + local637;
						arg1.anInt6297 = this.aClass44_Sub2_10.anInt4972 + this.aClass44_Sub2_10.bf * local748 / this.aClass44_Sub2_10.anInt4965;
						arg1.anInt6299 = this.aClass44_Sub2_10.anInt4954 + local758 * this.aClass44_Sub2_10.anInt4949 / this.aClass44_Sub2_10.anInt4965;
					} else if (this.aClass44_Sub2_10.anInt4965 > local656) {
						local736 = (local564 - this.aClass44_Sub2_10.anInt4965 << 16) / (local564 - local656);
						local748 = ((local526 - local618) * local736 >> 16) + local526;
						arg1.anInt6297 = this.aClass44_Sub2_10.anInt4972 + local748 * this.aClass44_Sub2_10.bf / this.aClass44_Sub2_10.anInt4965;
						local758 = ((local545 - local637) * local736 >> 16) + local545;
						arg1.anInt6299 = this.aClass44_Sub2_10.anInt4949 * local758 / this.aClass44_Sub2_10.anInt4965 + this.aClass44_Sub2_10.anInt4954;
					}
				}
			}
			if (local491) {
				arg1.aBoolean461 = true;
				if (local564 <= local656) {
					arg1.anInt6298 = this.aClass44_Sub2_10.bf * (this.anInt6846 + local618) / local656 + this.aClass44_Sub2_10.anInt4972 - arg1.anInt6301;
				} else {
					arg1.anInt6298 = (local526 + this.anInt6846) * this.aClass44_Sub2_10.bf / local564 + this.aClass44_Sub2_10.anInt4972 - arg1.anInt6297;
				}
			}
		}
		this.aClass44_Sub2_10.method4278();
		this.aClass44_Sub2_10.method4341(local22);
		this.method5699();
		this.method5693();
	}

	@OriginalMember(owner = "client!nk", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface11 local9 = this.aClass44_Sub2_10.anInterface11_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6850; local11++) {
			if (this.aShortArray86[local11] == arg0) {
				this.aShortArray86[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class14 local48 = local9.method7405(arg0 & 0xFFFF);
			local37 = local48.aByte8;
			local35 = local48.aByte7;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(68) Class14 local68 = local9.method7405(arg1 & 0xFFFF);
			local58 = local68.aByte8;
			local56 = local68.aByte7;
		}
		if (!(local56 != local35 | local58 != local37)) {
			return;
		}
		if (this.aClass61Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt6817; local97++) {
				@Pc(104) Class61 local104 = this.aClass61Array1[local97];
				@Pc(109) Class323 local109 = this.aClass323Array1[local97];
				local109.anInt9342 = Static15.anIntArray11[this.aShortArray79[local104.anInt2154] & 0xFFFF] & 0xFFFFFF | local109.anInt9342 & 0xFF000000;
			}
		}
		this.method5703();
	}

	@OriginalMember(owner = "client!nk", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean493) {
			this.method5692();
		}
		return this.anInt6828;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!q;IZ)V")
	@Override
	public void method7909(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray78 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6860; local14++) {
			if ((arg1 & this.aShortArray78[local14]) != 0) {
				if (arg2) {
					arg0.DA(this.anIntArray354[local14], this.anIntArray357[local14], this.anIntArray355[local14], local12);
				} else {
					arg0.method6811(this.anIntArray354[local14], this.anIntArray357[local14], this.anIntArray355[local14], local12);
				}
				this.anIntArray354[local14] = local12[0];
				this.anIntArray357[local14] = local12[1];
				this.anIntArray355[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		if (this.aClass264_2 != null) {
			this.aClass264_2.aBoolean528 = Static485.method7231(arg0, this.anInt6859);
		}
		if (this.aClass264_4 != null) {
			this.aClass264_4.aBoolean528 = Static544.method7890(arg0, this.anInt6859);
		}
		if (this.aClass264_1 != null) {
			this.aClass264_1.aBoolean528 = Static401.method6308(arg0, this.anInt6859);
		}
		if (this.aClass264_3 != null) {
			this.aClass264_3.aBoolean528 = Static347.method5596(this.anInt6859, arg0);
		}
		this.anInt6839 = arg0;
		if (this.aClass43_1 != null && (this.anInt6839 & 0x10000) == 0) {
			this.aShortArray84 = this.aClass43_1.aShortArray10;
			this.aByteArray82 = this.aClass43_1.aByteArray10;
			this.aShortArray80 = this.aClass43_1.aShortArray9;
			this.aShortArray87 = this.aClass43_1.aShortArray11;
			this.aClass43_1 = null;
		}
		this.lb = true;
		this.method5691();
	}

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "(I)V")
	private void method5705() {
		if (this.aClass264_2 != null) {
			this.aClass264_2.aBoolean529 = false;
		}
	}
}
