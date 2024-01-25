import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class116_Sub1 extends Class116 {

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "[F")
	private float[] aFloatArray8;

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "[F")
	private float[] aFloatArray9;

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "[Lclient!ew;")
	private Class76[] aClass76Array2;

	@OriginalMember(owner = "client!hq", name = "x", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!hq", name = "E", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!hq", name = "J", descriptor = "I")
	private int anInt2914;

	@OriginalMember(owner = "client!hq", name = "M", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!hq", name = "N", descriptor = "[Lclient!fv;")
	private Class90[] aClass90Array1;

	@OriginalMember(owner = "client!hq", name = "Q", descriptor = "I")
	private int anInt2919;

	@OriginalMember(owner = "client!hq", name = "S", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!hq", name = "T", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!hq", name = "W", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!hq", name = "Y", descriptor = "Lclient!fq;")
	private Class87 aClass87_1;

	@OriginalMember(owner = "client!hq", name = "ab", descriptor = "S")
	private short aShort45;

	@OriginalMember(owner = "client!hq", name = "bb", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!hq", name = "db", descriptor = "S")
	private short aShort46;

	@OriginalMember(owner = "client!hq", name = "hb", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!hq", name = "jb", descriptor = "I")
	private int anInt2929;

	@OriginalMember(owner = "client!hq", name = "kb", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!hq", name = "lb", descriptor = "[I")
	private int[] lb;

	@OriginalMember(owner = "client!hq", name = "nb", descriptor = "S")
	private short aShort47;

	@OriginalMember(owner = "client!hq", name = "ob", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!hq", name = "pb", descriptor = "Lclient!it;")
	private Interface7 anInterface7_2;

	@OriginalMember(owner = "client!hq", name = "rb", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!hq", name = "tb", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!hq", name = "ub", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!hq", name = "Ab", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!hq", name = "Gb", descriptor = "S")
	private short aShort48;

	@OriginalMember(owner = "client!hq", name = "Kb", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!hq", name = "Nb", descriptor = "[Lclient!le;")
	private Class155[] aClass155Array1;

	@OriginalMember(owner = "client!hq", name = "Ob", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!hq", name = "Sb", descriptor = "[Lclient!fs;")
	private Class88[] aClass88Array2;

	@OriginalMember(owner = "client!hq", name = "Tb", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!hq", name = "Ub", descriptor = "Lclient!lc;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!hq", name = "Vb", descriptor = "S")
	private short aShort50;

	@OriginalMember(owner = "client!hq", name = "Xb", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!hq", name = "Yb", descriptor = "B")
	private byte aByte66;

	@OriginalMember(owner = "client!hq", name = "ec", descriptor = "[I")
	private int[] anIntArray238;

	@OriginalMember(owner = "client!hq", name = "hc", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!hq", name = "lc", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!hq", name = "rc", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
	private int anInt2900 = 0;

	@OriginalMember(owner = "client!hq", name = "G", descriptor = "I")
	private int anInt2911 = 0;

	@OriginalMember(owner = "client!hq", name = "U", descriptor = "I")
	private int anInt2921 = 0;

	@OriginalMember(owner = "client!hq", name = "wb", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!hq", name = "Ib", descriptor = "I")
	private int anInt2941 = 0;

	@OriginalMember(owner = "client!hq", name = "ac", descriptor = "I")
	private int anInt2949 = 0;

	@OriginalMember(owner = "client!hq", name = "gc", descriptor = "Z")
	private boolean aBoolean219 = true;

	@OriginalMember(owner = "client!hq", name = "Db", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_15;

	@OriginalMember(owner = "client!hq", name = "zb", descriptor = "Lclient!og;")
	private Class190 aClass190_3;

	@OriginalMember(owner = "client!hq", name = "D", descriptor = "Lclient!og;")
	private Class190 aClass190_2;

	@OriginalMember(owner = "client!hq", name = "B", descriptor = "Lclient!og;")
	private Class190 aClass190_1;

	@OriginalMember(owner = "client!hq", name = "Jb", descriptor = "Lclient!og;")
	private Class190 aClass190_4;

	@OriginalMember(owner = "client!hq", name = "V", descriptor = "Lclient!ig;")
	private Class121 aClass121_1;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class116_Sub1(@OriginalArg(0) Class135_Sub2 arg0) {
		this.aClass135_Sub2_15 = arg0;
		this.aClass190_3 = new Class190(null, 5126, 3, 0);
		this.aClass190_2 = new Class190(null, 5126, 2, 0);
		this.aClass190_1 = new Class190(null, 5126, 3, 0);
		this.aClass190_4 = new Class190(null, 5121, 4, 0);
		this.aClass121_1 = new Class121();
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!ug;Lclient!mb;IIII)V")
	public Class116_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2919 = arg5;
		this.aClass135_Sub2_15 = arg0;
		this.anInt2914 = arg2;
		if (Static356.method4709(arg2, arg5)) {
			this.aClass190_3 = new Class190(null, 5126, 3, 0);
		}
		if (Static118.method1692(arg2, arg5)) {
			this.aClass190_2 = new Class190(null, 5126, 2, 0);
		}
		if (Static202.method2860(arg2, arg5)) {
			this.aClass190_1 = new Class190(null, 5126, 3, 0);
		}
		if (Static2.method8(arg5, arg2)) {
			this.aClass190_4 = new Class190(null, 5121, 4, 0);
		}
		if (Static222.method3018(arg5, arg2)) {
			this.aClass121_1 = new Class121();
		}
		@Pc(102) Interface5 local102 = arg0.anInterface5_7;
		@Pc(106) int[] local106 = new int[arg1.anInt4024];
		this.anIntArray239 = new int[arg1.anInt4013 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt4024; local115++) {
			if ((arg1.aByteArray54 == null || arg1.aByteArray54[local115] != 2) && (arg1.aShortArray74 == null || arg1.aShortArray74[local115] == -1 || !local102.method4079(arg1.aShortArray74[local115] & 0xFFFF).aBoolean192)) {
				local106[this.anInt2911++] = local115;
				this.anIntArray239[arg1.aShortArray69[local115]]++;
				this.anIntArray239[arg1.aShortArray71[local115]]++;
				this.anIntArray239[arg1.aShortArray73[local115]]++;
			}
		}
		this.anInt2900 = this.anInt2911;
		@Pc(203) long[] local203 = new long[this.anInt2911];
		@Pc(212) boolean local212 = (this.anInt2914 & 0x100) != 0;
		@Pc(224) int local224;
		@Pc(235) int local235;
		@Pc(364) int local364;
		label488: for (@Pc(214) int local214 = 0; local214 < this.anInt2911; local214++) {
			@Pc(220) int local220 = local106[local214];
			@Pc(222) Class112 local222 = null;
			local224 = 0;
			@Pc(226) byte local226 = 0;
			@Pc(228) byte local228 = 0;
			@Pc(230) byte local230 = 0;
			if (arg1.aClass254Array1 != null) {
				for (local235 = 0; local235 < arg1.aClass254Array1.length; local235++) {
					@Pc(242) Class254 local242 = arg1.aClass254Array1[local235];
					if (local242.anInt7065 == local220) {
						@Pc(255) Class108 local255 = Static177.method2489(local242.anInt7069);
						if (local255.aBoolean167) {
							local203[local214] = Long.MAX_VALUE;
							this.anInt2900--;
							continue label488;
						}
					}
				}
			}
			@Pc(282) short local282 = -1;
			if (arg1.aShortArray74 != null) {
				local282 = arg1.aShortArray74[local220];
				if (local282 != -1) {
					local222 = local102.method4079(local282 & 0xFFFF);
					local228 = local222.aByte57;
					local230 = local222.aByte55;
				}
			}
			@Pc(326) boolean local326 = arg1.aByteArray51 != null && arg1.aByteArray51[local220] != 0 || local222 != null && !local222.aBoolean194;
			if ((local212 || local326) && arg1.aByteArray52 != null) {
				local224 += arg1.aByteArray52[local220] << 17;
			}
			if (local326) {
				local224 += 65536;
			}
			local224 += (local228 & 0xFF) << 8;
			local364 = local226 + ((local282 & 0xFFFF) << 16);
			local224 += local230 & 0xFF;
			@Pc(376) int local376 = local364 + (local214 & 0xFFFF);
			local203[local214] = (long) local376 + ((long) local224 << 32);
		}
		Static248.method3585(local106, local203);
		this.anInt2949 = arg1.anInt4013;
		this.anIntArray237 = arg1.anIntArray324;
		this.anInt2941 = arg1.anInt4011;
		this.lb = arg1.anIntArray329;
		this.aShortArray55 = arg1.aShortArray66;
		this.anIntArray236 = arg1.anIntArray326;
		this.aClass76Array2 = arg1.aClass76Array4;
		this.aClass88Array2 = arg1.aClass88Array4;
		@Pc(435) Class157[] local435 = new Class157[this.anInt2949];
		@Pc(455) int local455;
		@Pc(469) int local469;
		if (arg1.aClass254Array1 != null) {
			this.anInt2929 = arg1.aClass254Array1.length;
			this.aClass155Array1 = new Class155[this.anInt2929];
			this.aClass90Array1 = new Class90[this.anInt2929];
			for (local455 = 0; local455 < this.anInt2929; local455++) {
				@Pc(462) Class254 local462 = arg1.aClass254Array1[local455];
				@Pc(467) Class108 local467 = Static177.method2489(local462.anInt7069);
				local469 = -1;
				for (@Pc(471) int local471 = 0; local471 < this.anInt2911; local471++) {
					if (local106[local471] == local462.anInt7065) {
						local469 = local471;
						break;
					}
				}
				if (local469 == -1) {
					throw new RuntimeException();
				}
				local235 = Static365.anIntArray475[arg1.aShortArray68[local462.anInt7065] & 0xFFFF] & 0xFFFFFF;
				local235 |= 255 - (arg1.aByteArray51 == null ? 0 : arg1.aByteArray51[local462.anInt7065]) << 24;
				this.aClass90Array1[local455] = new Class90(local469, arg1.aShortArray69[local462.anInt7065], arg1.aShortArray71[local462.anInt7065], arg1.aShortArray73[local462.anInt7065], local467.anInt2545, local467.anInt2548, local467.anInt2542, local467.anInt2543, local467.anInt2544, local467.aBoolean167, local467.aBoolean168, local462.anInt7067);
				this.aClass155Array1[local455] = new Class155(local235);
			}
		}
		local455 = this.anInt2911 * 3;
		this.aShortArray51 = new short[local455];
		Static170.aLongArray11 = new long[local455];
		this.aShortArray52 = new short[this.anInt2911];
		this.aByteArray30 = new byte[this.anInt2911];
		this.aFloatArray9 = new float[local455];
		this.aShort44 = (short) arg4;
		this.aShortArray56 = new short[local455];
		this.aShortArray47 = new short[local455];
		this.aByteArray31 = new byte[local455];
		this.aShortArray54 = new short[local455];
		this.aShort50 = (short) arg3;
		this.aFloatArray8 = new float[local455];
		this.aShortArray53 = new short[this.anInt2911];
		if (arg1.aShortArray70 != null) {
			this.aShortArray50 = new short[this.anInt2911];
		}
		this.aShortArray49 = new short[this.anInt2911];
		this.aShortArray48 = new short[this.anInt2911];
		this.aShortArray46 = new short[this.anInt2911];
		local224 = 0;
		for (local364 = 0; local364 < arg1.anInt4013; local364++) {
			local469 = this.anIntArray239[local364];
			this.anIntArray239[local364] = local224;
			local435[local364] = new Class157();
			local224 += local469;
		}
		this.anIntArray239[arg1.anInt4013] = local224;
		@Pc(707) int[] local707 = null;
		@Pc(709) int[] local709 = null;
		@Pc(711) int[] local711 = null;
		@Pc(713) float[][] local713 = null;
		@Pc(739) int local739;
		@Pc(777) int local777;
		@Pc(783) int local783;
		@Pc(797) int local797;
		@Pc(799) int local799;
		@Pc(833) int local833;
		@Pc(838) int local838;
		@Pc(992) float local992;
		@Pc(1008) float local1008;
		@Pc(1000) float local1000;
		if (arg1.aByteArray50 != null) {
			@Pc(719) int local719 = arg1.anInt4016;
			@Pc(722) int[] local722 = new int[local719];
			@Pc(725) int[] local725 = new int[local719];
			@Pc(728) int[] local728 = new int[local719];
			@Pc(731) int[] local731 = new int[local719];
			@Pc(734) int[] local734 = new int[local719];
			@Pc(737) int[] local737 = new int[local719];
			for (local739 = 0; local739 < local719; local739++) {
				local722[local739] = Integer.MAX_VALUE;
				local725[local739] = -2147483647;
				local728[local739] = Integer.MAX_VALUE;
				local731[local739] = -2147483647;
				local734[local739] = Integer.MAX_VALUE;
				local737[local739] = -2147483647;
			}
			local709 = new int[local719];
			local711 = new int[local719];
			for (local777 = 0; local777 < this.anInt2911; local777++) {
				local783 = local106[local777];
				if (arg1.aByteArray50[local783] != -1) {
					local797 = arg1.aByteArray50[local783] & 0xFF;
					for (local799 = 0; local799 < 3; local799++) {
						@Pc(811) short local811;
						if (local799 == 0) {
							local811 = arg1.aShortArray69[local783];
						} else if (local799 == 1) {
							local811 = arg1.aShortArray71[local783];
						} else {
							local811 = arg1.aShortArray73[local783];
						}
						local833 = arg1.anIntArray324[local811];
						local838 = arg1.anIntArray326[local811];
						@Pc(843) int local843 = arg1.anIntArray329[local811];
						if (local833 < local722[local797]) {
							local722[local797] = local833;
						}
						if (local833 > local725[local797]) {
							local725[local797] = local833;
						}
						if (local838 < local728[local797]) {
							local728[local797] = local838;
						}
						if (local838 > local731[local797]) {
							local731[local797] = local838;
						}
						if (local843 < local734[local797]) {
							local734[local797] = local843;
						}
						if (local843 > local737[local797]) {
							local737[local797] = local843;
						}
					}
				}
			}
			local707 = new int[local719];
			local713 = new float[local719][];
			for (local783 = 0; local783 < local719; local783++) {
				@Pc(937) byte local937 = arg1.aByteArray48[local783];
				if (local937 > 0) {
					local707[local783] = (local722[local783] + local725[local783]) / 2;
					local709[local783] = (local728[local783] + local731[local783]) / 2;
					local711[local783] = (local734[local783] + local737[local783]) / 2;
					if (local937 == 1) {
						local838 = arg1.anIntArray325[local783];
						local1008 = 64.0F / (float) arg1.anIntArray328[local783];
						if (local838 == 0) {
							local1000 = 1.0F;
							local992 = 1.0F;
						} else if (local838 <= 0) {
							local992 = (float) -local838 / 1024.0F;
							local1000 = 1.0F;
						} else {
							local1000 = (float) local838 / 1024.0F;
							local992 = 1.0F;
						}
					} else if (local937 == 2) {
						local1000 = 64.0F / (float) arg1.anIntArray327[local783];
						local992 = 64.0F / (float) arg1.anIntArray325[local783];
						local1008 = 64.0F / (float) arg1.anIntArray328[local783];
					} else {
						local992 = (float) arg1.anIntArray325[local783] / 1024.0F;
						local1000 = (float) arg1.anIntArray327[local783] / 1024.0F;
						local1008 = (float) arg1.anIntArray328[local783] / 1024.0F;
					}
					local713[local783] = Static247.method3254(arg1.aByteArray49[local783] & 0xFF, local992, local1008, local1000, arg1.aShortArray67[local783], arg1.aShortArray72[local783], arg1.aShortArray75[local783]);
				}
			}
		}
		@Pc(1110) Class105[] local1110 = new Class105[arg1.anInt4024];
		@Pc(1129) short local1129;
		@Pc(1140) int local1140;
		@Pc(1150) int local1150;
		@Pc(1210) int local1210;
		for (@Pc(1112) int local1112 = 0; local1112 < arg1.anInt4024; local1112++) {
			@Pc(1119) short local1119 = arg1.aShortArray69[local1112];
			@Pc(1124) short local1124 = arg1.aShortArray71[local1112];
			local1129 = arg1.aShortArray73[local1112];
			local1140 = this.anIntArray237[local1124] - this.anIntArray237[local1119];
			local1150 = this.anIntArray236[local1124] - this.anIntArray236[local1119];
			local739 = this.lb[local1124] - this.lb[local1119];
			local777 = this.anIntArray237[local1129] - this.anIntArray237[local1119];
			local783 = this.anIntArray236[local1129] - this.anIntArray236[local1119];
			local797 = this.lb[local1129] - this.lb[local1119];
			local799 = local1150 * local797 - local783 * local739;
			local1210 = local777 * local739 - local797 * local1140;
			local833 = local1140 * local783 - local1150 * local777;
			while (local799 > 8192 || local1210 > 8192 || local833 > 8192 || local799 < -8192 || local1210 < -8192 || local833 < -8192) {
				local833 >>= 0x1;
				local1210 >>= 0x1;
				local799 >>= 0x1;
			}
			local838 = (int) Math.sqrt((double) (local1210 * local1210 + local799 * local799 + local833 * local833));
			if (local838 <= 0) {
				local838 = 1;
			}
			local833 = local833 * 256 / local838;
			local1210 = local1210 * 256 / local838;
			local799 = local799 * 256 / local838;
			@Pc(1306) byte local1306 = arg1.aByteArray54 == null ? 0 : arg1.aByteArray54[local1112];
			if (local1306 == 0) {
				@Pc(1315) Class157 local1315 = local435[local1119];
				local1315.anInt3821 += local799;
				local1315.anInt3820 += local1210;
				local1315.anInt3823++;
				local1315.anInt3819 += local833;
				@Pc(1343) Class157 local1343 = local435[local1124];
				local1343.anInt3819 += local833;
				local1343.anInt3823++;
				local1343.anInt3820 += local1210;
				local1343.anInt3821 += local799;
				@Pc(1371) Class157 local1371 = local435[local1129];
				local1371.anInt3819 += local833;
				local1371.anInt3820 += local1210;
				local1371.anInt3821 += local799;
				local1371.anInt3823++;
			} else if (local1306 == 1) {
				@Pc(1408) Class105 local1408 = local1110[local1112] = new Class105();
				local1408.anInt2513 = local799;
				local1408.anInt2514 = local1210;
				local1408.anInt2515 = local833;
			}
		}
		@Pc(1430) int local1430;
		for (@Pc(1424) int local1424 = 0; local1424 < this.anInt2911; local1424++) {
			local1430 = local106[local1424];
			@Pc(1437) int local1437 = arg1.aShortArray68[local1430] & 0xFFFF;
			@Pc(1445) short local1445;
			if (arg1.aShortArray74 == null) {
				local1445 = -1;
			} else {
				local1445 = arg1.aShortArray74[local1430];
			}
			if (arg1.aByteArray50 == null) {
				local1150 = -1;
			} else {
				local1150 = arg1.aByteArray50[local1430];
			}
			if (arg1.aByteArray51 == null) {
				local739 = 0;
			} else {
				local739 = arg1.aByteArray51[local1430] & 0xFF;
			}
			@Pc(1477) float local1477 = 0.0F;
			@Pc(1479) float local1479 = 0.0F;
			@Pc(1481) float local1481 = 0.0F;
			local992 = 0.0F;
			local1008 = 0.0F;
			local1000 = 0.0F;
			@Pc(1489) byte local1489 = 0;
			@Pc(1491) byte local1491 = 0;
			@Pc(1493) int local1493 = 0;
			@Pc(1508) byte local1508;
			@Pc(1525) short local1525;
			@Pc(2275) short local2275;
			@Pc(2280) short local2280;
			if (local1445 != -1) {
				if (local1150 == -1) {
					local1477 = 0.0F;
					local1000 = 0.0F;
					local1008 = 0.0F;
					local1489 = 1;
					local1479 = 1.0F;
					local992 = 1.0F;
					local1481 = 1.0F;
					local1491 = 2;
				} else {
					local1150 &= 0xFF;
					local1508 = arg1.aByteArray48[local1150];
					@Pc(1515) short local1515;
					@Pc(1520) short local1520;
					@Pc(1554) float local1554;
					@Pc(1565) float local1565;
					@Pc(1644) float local1644;
					@Pc(2081) float local2081;
					@Pc(2089) float local2089;
					@Pc(2097) float local2097;
					@Pc(2120) float local2120;
					@Pc(2143) float local2143;
					@Pc(2166) float local2166;
					if (local1508 == 0) {
						local1515 = arg1.aShortArray69[local1430];
						local1520 = arg1.aShortArray71[local1430];
						local1525 = arg1.aShortArray73[local1430];
						local2275 = arg1.aShortArray72[local1150];
						local2280 = arg1.aShortArray75[local1150];
						@Pc(2285) short local2285 = arg1.aShortArray67[local1150];
						@Pc(2291) float local2291 = (float) arg1.anIntArray324[local2275];
						@Pc(2297) float local2297 = (float) arg1.anIntArray326[local2275];
						local1554 = arg1.anIntArray329[local2275];
						local1565 = (float) arg1.anIntArray324[local2280] - local2291;
						local1644 = (float) arg1.anIntArray326[local2280] - local2297;
						@Pc(2329) float local2329 = (float) arg1.anIntArray329[local2280] - local1554;
						@Pc(2337) float local2337 = (float) arg1.anIntArray324[local2285] - local2291;
						@Pc(2346) float local2346 = (float) arg1.anIntArray326[local2285] - local2297;
						@Pc(2354) float local2354 = (float) arg1.anIntArray329[local2285] - local1554;
						@Pc(2363) float local2363 = (float) arg1.anIntArray324[local1515] - local2291;
						@Pc(2371) float local2371 = (float) arg1.anIntArray326[local1515] - local2297;
						@Pc(2379) float local2379 = (float) arg1.anIntArray329[local1515] - local1554;
						@Pc(2388) float local2388 = (float) arg1.anIntArray324[local1520] - local2291;
						@Pc(2396) float local2396 = (float) arg1.anIntArray326[local1520] - local2297;
						local2081 = (float) arg1.anIntArray329[local1520] - local1554;
						local2089 = (float) arg1.anIntArray324[local1525] - local2291;
						local2097 = (float) arg1.anIntArray326[local1525] - local2297;
						local2120 = (float) arg1.anIntArray329[local1525] - local1554;
						local2143 = local2354 * local1644 - local2346 * local2329;
						local2166 = local2337 * local2329 - local2354 * local1565;
						@Pc(2458) float local2458 = local1565 * local2346 - local1644 * local2337;
						@Pc(2467) float local2467 = local2346 * local2458 - local2354 * local2166;
						@Pc(2475) float local2475 = local2143 * local2354 - local2458 * local2337;
						@Pc(2483) float local2483 = local2337 * local2166 - local2346 * local2143;
						@Pc(2497) float local2497 = 1.0F / (local2329 * local2483 + local2467 * local1565 + local1644 * local2475);
						local1477 = (local2483 * local2379 + local2371 * local2475 + local2363 * local2467) * local2497;
						local1008 = (local2120 * local2483 + local2097 * local2475 + local2467 * local2089) * local2497;
						local1481 = local2497 * (local2396 * local2475 + local2467 * local2388 + local2081 * local2483);
						@Pc(2547) float local2547 = local2166 * local1565 - local1644 * local2143;
						@Pc(2556) float local2556 = local2143 * local2329 - local2458 * local1565;
						@Pc(2565) float local2565 = local2458 * local1644 - local2166 * local2329;
						@Pc(2579) float local2579 = 1.0F / (local2346 * local2556 + local2337 * local2565 + local2354 * local2547);
						local1479 = local2579 * (local2379 * local2547 + local2363 * local2565 + local2556 * local2371);
						local992 = local2579 * (local2396 * local2556 + local2565 * local2388 + local2081 * local2547);
						local1000 = (local2547 * local2120 + local2089 * local2565 + local2556 * local2097) * local2579;
					} else {
						local1515 = arg1.aShortArray69[local1430];
						local1520 = arg1.aShortArray71[local1430];
						local1525 = arg1.aShortArray73[local1430];
						@Pc(1529) int local1529 = local707[local1150];
						@Pc(1533) int local1533 = local709[local1150];
						@Pc(1537) int local1537 = local711[local1150];
						@Pc(1541) float[] local1541 = local713[local1150];
						@Pc(1546) byte local1546 = arg1.aByteArray53[local1150];
						local1554 = (float) arg1.anIntArray331[local1150] / 256.0F;
						if (local1508 == 1) {
							local1565 = (float) arg1.anIntArray327[local1150] / 1024.0F;
							Static120.method1697(local1565, local1546, local1533, local1537, local1541, local1554, local1529, arg1.anIntArray324[local1515], arg1.anIntArray329[local1515], arg1.anIntArray326[local1515]);
							local1479 = Static271.aFloat51;
							local1477 = Static13.aFloat6;
							Static120.method1697(local1565, local1546, local1533, local1537, local1541, local1554, local1529, arg1.anIntArray324[local1520], arg1.anIntArray329[local1520], arg1.anIntArray326[local1520]);
							local992 = Static271.aFloat51;
							local1481 = Static13.aFloat6;
							Static120.method1697(local1565, local1546, local1533, local1537, local1541, local1554, local1529, arg1.anIntArray324[local1525], arg1.anIntArray329[local1525], arg1.anIntArray326[local1525]);
							local1000 = Static271.aFloat51;
							local1008 = Static13.aFloat6;
							local1644 = local1565 / 2.0F;
							if ((local1546 & 0x1) == 0) {
								if (local1008 - local1477 > local1644) {
									local1008 -= local1565;
									local1491 = 1;
								} else if (local1477 - local1008 > local1644) {
									local1491 = 2;
									local1008 += local1565;
								}
								if (local1481 - local1477 > local1644) {
									local1489 = 1;
									local1481 -= local1565;
								} else if (local1477 - local1481 > local1644) {
									local1481 += local1565;
									local1489 = 2;
								}
							} else {
								if (local1644 < local992 - local1479) {
									local992 -= local1565;
									local1489 = 1;
								} else if (local1644 < local1479 - local992) {
									local992 += local1565;
									local1489 = 2;
								}
								if (local1000 - local1479 > local1644) {
									local1491 = 1;
									local1000 -= local1565;
								} else if (local1644 < local1479 - local1000) {
									local1491 = 2;
									local1000 += local1565;
								}
							}
						} else if (local1508 == 2) {
							local1565 = (float) arg1.anIntArray335[local1150] / 256.0F;
							local1644 = (float) arg1.anIntArray333[local1150] / 256.0F;
							@Pc(1993) int local1993 = arg1.anIntArray324[local1520] - arg1.anIntArray324[local1515];
							@Pc(2004) int local2004 = arg1.anIntArray326[local1520] - arg1.anIntArray326[local1515];
							@Pc(2015) int local2015 = arg1.anIntArray329[local1520] - arg1.anIntArray329[local1515];
							@Pc(2025) int local2025 = arg1.anIntArray324[local1525] - arg1.anIntArray324[local1515];
							@Pc(2036) int local2036 = arg1.anIntArray326[local1525] - arg1.anIntArray326[local1515];
							@Pc(2046) int local2046 = arg1.anIntArray329[local1525] - arg1.anIntArray329[local1515];
							@Pc(2055) int local2055 = local2046 * local2004 - local2015 * local2036;
							@Pc(2064) int local2064 = local2025 * local2015 - local2046 * local1993;
							@Pc(2073) int local2073 = local2036 * local1993 - local2004 * local2025;
							local2081 = 64.0F / (float) arg1.anIntArray325[local1150];
							local2089 = 64.0F / (float) arg1.anIntArray328[local1150];
							local2097 = 64.0F / (float) arg1.anIntArray327[local1150];
							local2120 = ((float) local2064 * local1541[1] + (float) local2055 * local1541[0] + local1541[2] * (float) local2073) / local2081;
							local2143 = ((float) local2073 * local1541[5] + (float) local2064 * local1541[4] + (float) local2055 * local1541[3]) / local2089;
							local2166 = ((float) local2064 * local1541[7] + local1541[6] * (float) local2055 + (float) local2073 * local1541[8]) / local2097;
							local1493 = Static345.method4586(local2120, local2143, local2166);
							Static98.method1500(local1546, local1537, local1554, local1493, local1644, arg1.anIntArray324[local1515], local1533, local1565, arg1.anIntArray329[local1515], local1541, local1529, arg1.anIntArray326[local1515]);
							local1477 = Static67.aFloat19;
							local1479 = Static374.aFloat71;
							Static98.method1500(local1546, local1537, local1554, local1493, local1644, arg1.anIntArray324[local1520], local1533, local1565, arg1.anIntArray329[local1520], local1541, local1529, arg1.anIntArray326[local1520]);
							local1481 = Static67.aFloat19;
							local992 = Static374.aFloat71;
							Static98.method1500(local1546, local1537, local1554, local1493, local1644, arg1.anIntArray324[local1525], local1533, local1565, arg1.anIntArray329[local1525], local1541, local1529, arg1.anIntArray326[local1525]);
							local1008 = Static67.aFloat19;
							local1000 = Static374.aFloat71;
						} else if (local1508 == 3) {
							Static72.method1175(local1537, local1554, local1533, arg1.anIntArray326[local1515], local1529, arg1.anIntArray324[local1515], local1541, local1546, arg1.anIntArray329[local1515]);
							local1479 = Static269.aFloat48;
							local1477 = Static111.aFloat23;
							Static72.method1175(local1537, local1554, local1533, arg1.anIntArray326[local1520], local1529, arg1.anIntArray324[local1520], local1541, local1546, arg1.anIntArray329[local1520]);
							local1481 = Static111.aFloat23;
							local992 = Static269.aFloat48;
							Static72.method1175(local1537, local1554, local1533, arg1.anIntArray326[local1525], local1529, arg1.anIntArray324[local1525], local1541, local1546, arg1.anIntArray329[local1525]);
							local1000 = Static269.aFloat48;
							local1008 = Static111.aFloat23;
							if ((local1546 & 0x1) == 0) {
								if (local1481 - local1477 > 0.5F) {
									local1489 = 1;
									local1481--;
								} else if (local1477 - local1481 > 0.5F) {
									local1489 = 2;
									local1481++;
								}
								if (local1008 - local1477 > 0.5F) {
									local1008--;
									local1491 = 1;
								} else if (local1477 - local1008 > 0.5F) {
									local1008++;
									local1491 = 2;
								}
							} else {
								if (local992 - local1479 > 0.5F) {
									local1489 = 1;
									local992--;
								} else if (local1479 - local992 > 0.5F) {
									local1489 = 2;
									local992++;
								}
								if (local1000 - local1479 > 0.5F) {
									local1000--;
									local1491 = 1;
								} else if (local1479 - local1000 > 0.5F) {
									local1000++;
									local1491 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray54 == null) {
				local1508 = 0;
			} else {
				local1508 = arg1.aByteArray54[local1430];
			}
			if (local1508 == 0) {
				@Pc(2677) long local2677 = (long) (local1150 << 2) + ((long) (local1493 << 24) + (long) (local1437 << 8) + (long) local739 << 32);
				local1525 = arg1.aShortArray69[local1430];
				local2275 = arg1.aShortArray71[local1430];
				local2280 = arg1.aShortArray73[local1430];
				@Pc(2696) Class157 local2696 = local435[local1525];
				this.aShortArray52[local1424] = this.method2229(local1525, arg1, local2696.anInt3823, local2696.anInt3820, local1479, local2696.anInt3819, local1477, local2696.anInt3821, local2677);
				@Pc(2720) Class157 local2720 = local435[local2275];
				this.aShortArray46[local1424] = this.method2229(local2275, arg1, local2720.anInt3823, local2720.anInt3820, local992, local2720.anInt3819, local1481, local2720.anInt3821, local2677 + (long) local1489);
				@Pc(2747) Class157 local2747 = local435[local2280];
				this.aShortArray49[local1424] = this.method2229(local2280, arg1, local2747.anInt3823, local2747.anInt3820, local1000, local2747.anInt3819, local1008, local2747.anInt3821, (long) local1491 + local2677);
			} else if (local1508 == 1) {
				@Pc(2781) Class105 local2781 = local1110[local1430];
				@Pc(2824) long local2824 = ((long) local739 + (long) (local1493 << 24) + (long) (local1437 << 8) << 32) + (long) ((local2781.anInt2515 + 256 << 22) + (local2781.anInt2514 + 256 << 12) + ((local1150 << 2) - -(local2781.anInt2513 > 0 ? 1024 : 2048)));
				this.aShortArray52[local1424] = this.method2229(arg1.aShortArray69[local1430], arg1, 0, local2781.anInt2514, local1479, local2781.anInt2515, local1477, local2781.anInt2513, local2824);
				this.aShortArray46[local1424] = this.method2229(arg1.aShortArray71[local1430], arg1, 0, local2781.anInt2514, local992, local2781.anInt2515, local1481, local2781.anInt2513, (long) local1489 + local2824);
				this.aShortArray49[local1424] = this.method2229(arg1.aShortArray73[local1430], arg1, 0, local2781.anInt2514, local1000, local2781.anInt2515, local1008, local2781.anInt2513, (long) local1491 + local2824);
			}
			if (arg1.aShortArray74 == null) {
				this.aShortArray53[local1424] = -1;
			} else {
				this.aShortArray53[local1424] = arg1.aShortArray74[local1430];
			}
			if (arg1.aByteArray51 != null) {
				this.aByteArray30[local1424] = arg1.aByteArray51[local1430];
			}
			if (arg1.aShortArray70 != null) {
				this.aShortArray50[local1424] = arg1.aShortArray70[local1430];
			}
			this.aShortArray48[local1424] = arg1.aShortArray68[local1430];
		}
		local1430 = 0;
		local1129 = -10000;
		for (local1140 = 0; local1140 < this.anInt2900; local1140++) {
			@Pc(2966) short local2966 = this.aShortArray53[local1140];
			if (local1129 != local2966) {
				local1129 = local2966;
				local1430++;
			}
		}
		this.anIntArray238 = new int[local1430 + 1];
		local1430 = 0;
		local1129 = -10000;
		for (local1150 = 0; local1150 < this.anInt2900; local1150++) {
			@Pc(3000) short local3000 = this.aShortArray53[local1150];
			if (local3000 != local1129) {
				local1129 = local3000;
				this.anIntArray238[local1430++] = local1150;
			}
		}
		this.anIntArray238[local1430] = this.anInt2900;
		Static170.aLongArray11 = null;
		this.aShortArray47 = Static358.method2932(this.anInt2921, this.aShortArray47);
		this.aShortArray54 = Static358.method2932(this.anInt2921, this.aShortArray54);
		this.aShortArray56 = Static358.method2932(this.anInt2921, this.aShortArray56);
		this.aByteArray31 = Static382.method5073(this.anInt2921, this.aByteArray31);
		this.aFloatArray8 = Static219.method2991(this.aFloatArray8, this.anInt2921);
		this.aFloatArray9 = Static219.method2991(this.aFloatArray9, this.anInt2921);
		if (arg1.anIntArray332 != null && Static397.method5246(arg2, this.anInt2919)) {
			this.anIntArrayArray34 = arg1.method3192();
		}
		if (arg1.aClass254Array1 != null && Static434.method5767(arg2, this.anInt2919)) {
			this.anIntArrayArray33 = arg1.method3200();
		}
		if (arg1.anIntArray330 != null && Static320.method4232(this.anInt2919, arg2)) {
			local739 = 0;
			@Pc(3122) int[] local3122 = new int[256];
			for (local783 = 0; local783 < this.anInt2911; local783++) {
				local797 = arg1.anIntArray330[local106[local783]];
				if (local797 >= 0) {
					@Pc(3139) int local3139 = local3122[local797]++;
					if (local797 > local739) {
						local739 = local797;
					}
				}
			}
			this.anIntArrayArray35 = new int[local739 + 1][];
			for (local797 = 0; local797 <= local739; local797++) {
				this.anIntArrayArray35[local797] = new int[local3122[local797]];
				local3122[local797] = 0;
			}
			for (local799 = 0; local799 < this.anInt2911; local799++) {
				local1210 = arg1.anIntArray330[local106[local799]];
				if (local1210 >= 0) {
					this.anIntArrayArray35[local1210][local3122[local1210]++] = local799;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "Q", descriptor = "(I)V")
	@Override
	public void Q(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class100.anIntArray206[arg0];
		@Pc(13) int local13 = Class100.anIntArray208[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2949; local15++) {
			@Pc(34) int local34 = local9 * this.lb[local15] + local13 * this.anIntArray237[local15] >> 15;
			this.lb[local15] = this.lb[local15] * local13 - this.anIntArray237[local15] * local9 >> 15;
			this.anIntArray237[local15] = local34;
		}
		this.aBoolean218 = false;
		if (this.aClass190_3 != null) {
			this.aClass190_3.anInterface9_3 = null;
		}
	}

	@OriginalMember(owner = "client!hq", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean218) {
			this.method2241();
		}
		return this.aShort47;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII)V")
	@Override
	public void method3119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2911; local7++) {
			local16 = this.aShortArray48[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 -= -((arg1 - local28) * arg3 >> 7);
			}
			@Pc(47) int local47 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local47 += (arg2 - local47) * arg3 >> 7;
			}
			this.aShortArray48[local7] = (short) (local22 << 10 | local28 << 7 | local47);
		}
		if (this.aClass90Array1 != null) {
			for (local16 = 0; local16 < this.anInt2929; local16++) {
				@Pc(105) Class90 local105 = this.aClass90Array1[local16];
				@Pc(110) Class155 local110 = this.aClass155Array1[local16];
				local110.anInt3772 = local110.anInt3772 & 0xFF000000 | Static365.anIntArray475[this.aShortArray48[local105.anInt2182] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass190_4 != null) {
			this.aClass190_4.anInterface9_3 = null;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!mb;IIFIIFIJ)S")
	private short method2229(@OriginalArg(0) int arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8) {
		@Pc(10) int local10 = this.anIntArray239[arg0];
		@Pc(17) int local17 = this.anIntArray239[arg0 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray51[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static170.aLongArray11[local21] == arg8) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray51[local19] = (short) (this.anInt2921 + 1);
		Static170.aLongArray11[local19] = arg8;
		this.aShortArray47[this.anInt2921] = (short) arg7;
		this.aShortArray54[this.anInt2921] = (short) arg3;
		this.aShortArray56[this.anInt2921] = (short) arg5;
		this.aByteArray31[this.anInt2921] = (byte) arg2;
		this.aFloatArray8[this.anInt2921] = arg6;
		this.aFloatArray9[this.anInt2921] = arg4;
		return (short) this.anInt2921++;
	}

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "(I)V")
	private void method2231() {
		if (this.anInt2900 == 0) {
			return;
		}
		if (this.aByte66 != 0) {
			this.method2235(true);
		}
		this.method2235(false);
		if (this.aClass121_1 != null) {
			if (this.aClass121_1.anInterface7_3 == null) {
				this.method2240((this.aByte66 & 0x10) != 0);
			}
			if (this.aClass121_1.anInterface7_3 != null) {
				this.aClass135_Sub2_15.method5461(this.aClass190_1 != null);
				this.aClass135_Sub2_15.method5431(this.aClass190_2, this.aClass190_3, this.aClass190_4, this.aClass190_1);
				@Pc(78) int local78 = this.anIntArray238.length - 1;
				for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
					@Pc(87) int local87 = this.anIntArray238[local80];
					@Pc(94) int local94 = this.anIntArray238[local80 + 1];
					@Pc(101) int local101 = this.aShortArray53[local87] & 0xFFFF;
					if (local101 == 65535) {
						local101 = -1;
					}
					this.aClass135_Sub2_15.method5443(this.aClass190_1 != null, local101);
					this.aClass135_Sub2_15.method5479(this.aClass121_1.anInterface7_3, local87 * 3, (local94 - local87) * 3);
				}
			}
		}
		this.method2237();
	}

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "()I")
	@Override
	public int m() {
		if (!this.aBoolean218) {
			this.method2241();
		}
		return this.aShort49;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!hq;ZZBLclient!hq;)Lclient!t;")
	private Class116 method2232(@OriginalArg(0) int arg0, @OriginalArg(1) Class116_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class116_Sub1 arg4) {
		arg4.aShort50 = this.aShort50;
		arg4.aByte66 = 0;
		arg4.anInt2949 = this.anInt2949;
		arg4.anInt2919 = this.anInt2919;
		arg4.anInt2921 = this.anInt2921;
		arg4.anInt2929 = this.anInt2929;
		arg4.aShort44 = this.aShort44;
		arg4.anInt2900 = this.anInt2900;
		arg4.anInt2911 = this.anInt2911;
		arg4.anInt2941 = this.anInt2941;
		arg4.anInt2914 = arg0;
		@Pc(53) boolean local53 = Static127.method1766(arg0, this.anInt2919);
		@Pc(59) boolean local59 = Static150.method2110(arg0, this.anInt2919);
		@Pc(65) boolean local65 = Static295.method3842(this.anInt2919, arg0);
		@Pc(71) boolean local71 = local59 | local53 | local65;
		@Pc(194) int local194;
		if (local71) {
			if (!local53) {
				arg4.anIntArray237 = this.anIntArray237;
			} else if (arg1.anIntArray237 == null || this.anInt2941 > arg1.anIntArray237.length) {
				arg4.anIntArray237 = arg1.anIntArray237 = new int[this.anInt2941];
			} else {
				arg4.anIntArray237 = arg1.anIntArray237;
			}
			if (!local59) {
				arg4.anIntArray236 = this.anIntArray236;
			} else if (arg1.anIntArray236 == null || this.anInt2941 > arg1.anIntArray236.length) {
				arg4.anIntArray236 = arg1.anIntArray236 = new int[this.anInt2941];
			} else {
				arg4.anIntArray236 = arg1.anIntArray236;
			}
			if (!local65) {
				arg4.lb = this.lb;
			} else if (arg1.lb == null || arg1.lb.length < this.anInt2941) {
				arg4.lb = arg1.lb = new int[this.anInt2941];
			} else {
				arg4.lb = arg1.lb;
			}
			for (local194 = 0; local194 < this.anInt2941; local194++) {
				if (local53) {
					arg4.anIntArray237[local194] = this.anIntArray237[local194];
				}
				if (local59) {
					arg4.anIntArray236[local194] = this.anIntArray236[local194];
				}
				if (local65) {
					arg4.lb[local194] = this.lb[local194];
				}
			}
		} else {
			arg4.anIntArray236 = this.anIntArray236;
			arg4.lb = this.lb;
			arg4.anIntArray237 = this.anIntArray237;
		}
		if (Static293.method3831(arg0, this.anInt2919)) {
			arg4.aClass190_3 = arg1.aClass190_3;
			if (arg2) {
				arg4.aByte66 = (byte) (arg4.aByte66 | 0x1);
			}
			arg4.aClass190_3.anInterface9_3 = this.aClass190_3.anInterface9_3;
			arg4.aClass190_3.aByte76 = this.aClass190_3.aByte76;
		} else if (Static356.method4709(arg0, this.anInt2919)) {
			arg4.aClass190_3 = this.aClass190_3;
		} else {
			arg4.aClass190_3 = null;
		}
		if (Static174.method2447(this.anInt2919, arg0)) {
			if (arg1.aShortArray48 == null || arg1.aShortArray48.length < this.anInt2911) {
				arg4.aShortArray48 = arg1.aShortArray48 = new short[this.anInt2911];
			} else {
				arg4.aShortArray48 = arg1.aShortArray48;
			}
			for (local194 = 0; local194 < this.anInt2911; local194++) {
				arg4.aShortArray48[local194] = this.aShortArray48[local194];
			}
		} else {
			arg4.aShortArray48 = this.aShortArray48;
		}
		if (Static347.method4605(this.anInt2919, arg0)) {
			if (arg1.aByteArray30 == null || arg1.aByteArray30.length < this.anInt2911) {
				arg4.aByteArray30 = arg1.aByteArray30 = new byte[this.anInt2911];
			} else {
				arg4.aByteArray30 = arg1.aByteArray30;
			}
			for (local194 = 0; local194 < this.anInt2911; local194++) {
				arg4.aByteArray30[local194] = this.aByteArray30[local194];
			}
		} else {
			arg4.aByteArray30 = this.aByteArray30;
		}
		if (Static107.method1597(this.anInt2919, arg0)) {
			arg4.aClass190_4 = arg1.aClass190_4;
			if (arg2) {
				arg4.aByte66 = (byte) (arg4.aByte66 | 0x2);
			}
			arg4.aClass190_4.anInterface9_3 = this.aClass190_4.anInterface9_3;
			arg4.aClass190_4.aByte76 = this.aClass190_4.aByte76;
		} else if (Static2.method8(this.anInt2919, arg0)) {
			arg4.aClass190_4 = this.aClass190_4;
		} else {
			arg4.aClass190_4 = null;
		}
		@Pc(531) int local531;
		if (Static454.method6024(this.anInt2919, arg0)) {
			if (arg1.aShortArray47 == null || this.anInt2921 > arg1.aShortArray47.length) {
				local194 = this.anInt2921;
				arg4.aShortArray47 = arg1.aShortArray47 = new short[local194];
				arg4.aShortArray56 = arg1.aShortArray56 = new short[local194];
				arg4.aShortArray54 = arg1.aShortArray54 = new short[local194];
			} else {
				arg4.aShortArray54 = arg1.aShortArray54;
				arg4.aShortArray47 = arg1.aShortArray47;
				arg4.aShortArray56 = arg1.aShortArray56;
			}
			if (this.aClass87_1 == null) {
				for (local194 = 0; local194 < this.anInt2921; local194++) {
					arg4.aShortArray47[local194] = this.aShortArray47[local194];
					arg4.aShortArray54[local194] = this.aShortArray54[local194];
					arg4.aShortArray56[local194] = this.aShortArray56[local194];
				}
			} else {
				if (arg1.aClass87_1 == null) {
					arg1.aClass87_1 = new Class87();
				}
				@Pc(515) Class87 local515 = arg4.aClass87_1 = arg1.aClass87_1;
				if (local515.aShortArray28 == null || this.anInt2921 > local515.aShortArray28.length) {
					local531 = this.anInt2921;
					local515.aShortArray28 = new short[local531];
					local515.aShortArray29 = new short[local531];
					local515.aByteArray15 = new byte[local531];
					local515.aShortArray27 = new short[local531];
				}
				for (local531 = 0; local531 < this.anInt2921; local531++) {
					arg4.aShortArray47[local531] = this.aShortArray47[local531];
					arg4.aShortArray54[local531] = this.aShortArray54[local531];
					arg4.aShortArray56[local531] = this.aShortArray56[local531];
					local515.aShortArray28[local531] = this.aClass87_1.aShortArray28[local531];
					local515.aShortArray27[local531] = this.aClass87_1.aShortArray27[local531];
					local515.aShortArray29[local531] = this.aClass87_1.aShortArray29[local531];
					local515.aByteArray15[local531] = this.aClass87_1.aByteArray15[local531];
				}
			}
			arg4.aByteArray31 = this.aByteArray31;
		} else {
			arg4.aShortArray54 = this.aShortArray54;
			arg4.aClass87_1 = this.aClass87_1;
			arg4.aByteArray31 = this.aByteArray31;
			arg4.aShortArray47 = this.aShortArray47;
			arg4.aShortArray56 = this.aShortArray56;
		}
		if (Static184.method2547(arg0, this.anInt2919)) {
			if (arg2) {
				arg4.aByte66 = (byte) (arg4.aByte66 | 0x4);
			}
			arg4.aClass190_1 = arg1.aClass190_1;
			arg4.aClass190_1.aByte76 = this.aClass190_1.aByte76;
			arg4.aClass190_1.anInterface9_3 = this.aClass190_1.anInterface9_3;
		} else if (Static202.method2860(arg0, this.anInt2919)) {
			arg4.aClass190_1 = this.aClass190_1;
		} else {
			arg4.aClass190_1 = null;
		}
		if (Static102.method1520(arg0, this.anInt2919)) {
			if (arg1.aFloatArray8 == null || arg1.aFloatArray8.length < this.anInt2911) {
				local194 = this.anInt2921;
				arg4.aFloatArray9 = arg1.aFloatArray9 = new float[local194];
				arg4.aFloatArray8 = arg1.aFloatArray8 = new float[local194];
			} else {
				arg4.aFloatArray9 = arg1.aFloatArray9;
				arg4.aFloatArray8 = arg1.aFloatArray8;
			}
			for (local194 = 0; local194 < this.anInt2921; local194++) {
				arg4.aFloatArray8[local194] = this.aFloatArray8[local194];
				arg4.aFloatArray9[local194] = this.aFloatArray9[local194];
			}
		} else {
			arg4.aFloatArray8 = this.aFloatArray8;
			arg4.aFloatArray9 = this.aFloatArray9;
		}
		if (Static315.method4084(arg0, this.anInt2919)) {
			arg4.aClass190_2 = arg1.aClass190_2;
			if (arg2) {
				arg4.aByte66 = (byte) (arg4.aByte66 | 0x8);
			}
			arg4.aClass190_2.anInterface9_3 = this.aClass190_2.anInterface9_3;
			arg4.aClass190_2.aByte76 = this.aClass190_2.aByte76;
		} else if (Static118.method1692(arg0, this.anInt2919)) {
			arg4.aClass190_2 = this.aClass190_2;
		} else {
			arg4.aClass190_2 = null;
		}
		if (Static272.method3621(arg0, this.anInt2919)) {
			if (arg1.aShortArray52 == null || arg1.aShortArray52.length < this.anInt2911) {
				local194 = this.anInt2911;
				arg4.aShortArray52 = arg1.aShortArray52 = new short[local194];
				arg4.aShortArray49 = arg1.aShortArray49 = new short[local194];
				arg4.aShortArray46 = arg1.aShortArray46 = new short[local194];
			} else {
				arg4.aShortArray46 = arg1.aShortArray46;
				arg4.aShortArray52 = arg1.aShortArray52;
				arg4.aShortArray49 = arg1.aShortArray49;
			}
			for (local194 = 0; local194 < this.anInt2911; local194++) {
				arg4.aShortArray52[local194] = this.aShortArray52[local194];
				arg4.aShortArray46[local194] = this.aShortArray46[local194];
				arg4.aShortArray49[local194] = this.aShortArray49[local194];
			}
		} else {
			arg4.aShortArray49 = this.aShortArray49;
			arg4.aShortArray52 = this.aShortArray52;
			arg4.aShortArray46 = this.aShortArray46;
		}
		if (Static447.method5933(this.anInt2919, arg0)) {
			arg4.aClass121_1 = arg1.aClass121_1;
			if (arg2) {
				arg4.aByte66 = (byte) (arg4.aByte66 | 0x10);
			}
			arg4.aClass121_1.anInterface7_3 = this.aClass121_1.anInterface7_3;
		} else if (Static222.method3018(this.anInt2919, arg0)) {
			arg4.aClass121_1 = this.aClass121_1;
		} else {
			arg4.aClass121_1 = null;
		}
		if (Static396.method5234(arg0, this.anInt2919)) {
			if (arg1.aShortArray53 == null || this.anInt2911 > arg1.aShortArray53.length) {
				local194 = this.anInt2911;
				arg4.aShortArray53 = arg1.aShortArray53 = new short[local194];
			} else {
				arg4.aShortArray53 = arg1.aShortArray53;
			}
			for (local194 = 0; local194 < this.anInt2911; local194++) {
				arg4.aShortArray53[local194] = this.aShortArray53[local194];
			}
		} else {
			arg4.aShortArray53 = this.aShortArray53;
		}
		if (!Static438.method2158(arg0, this.anInt2919)) {
			arg4.aClass155Array1 = this.aClass155Array1;
		} else if (arg1.aClass155Array1 == null || arg1.aClass155Array1.length < this.anInt2929) {
			local194 = this.anInt2929;
			arg4.aClass155Array1 = arg1.aClass155Array1 = new Class155[local194];
			for (local531 = 0; local531 < this.anInt2929; local531++) {
				arg4.aClass155Array1[local531] = this.aClass155Array1[local531].method2994();
			}
		} else {
			arg4.aClass155Array1 = arg1.aClass155Array1;
			for (local194 = 0; local194 < this.anInt2929; local194++) {
				arg4.aClass155Array1[local194].method2993(this.aClass155Array1[local194]);
			}
		}
		arg4.aShortArray50 = this.aShortArray50;
		arg4.aClass76Array2 = this.aClass76Array2;
		arg4.aShortArray51 = this.aShortArray51;
		arg4.aShortArray55 = this.aShortArray55;
		arg4.anIntArrayArray34 = this.anIntArrayArray34;
		arg4.aClass88Array2 = this.aClass88Array2;
		if (this.aBoolean218) {
			arg4.aShort46 = this.aShort46;
			arg4.aShort43 = this.aShort43;
			arg4.aShort49 = this.aShort49;
			arg4.aBoolean218 = true;
			arg4.aShort48 = this.aShort48;
			arg4.aShort47 = this.aShort47;
			arg4.aShort45 = this.aShort45;
			arg4.aShort42 = this.aShort42;
		} else {
			arg4.aBoolean218 = false;
		}
		arg4.anIntArray238 = this.anIntArray238;
		arg4.aClass90Array1 = this.aClass90Array1;
		arg4.anIntArrayArray33 = this.anIntArrayArray33;
		arg4.anIntArray239 = this.anIntArray239;
		arg4.anIntArrayArray35 = this.anIntArrayArray35;
		return arg4;
	}

	@OriginalMember(owner = "client!hq", name = "R", descriptor = "(I)V")
	@Override
	public void R(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class100.anIntArray206[arg0];
		@Pc(13) int local13 = Class100.anIntArray208[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2949; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray237[local15] + this.anIntArray236[local15] * local9 >> 15;
			this.anIntArray236[local15] = local13 * this.anIntArray236[local15] - local9 * this.anIntArray237[local15] >> 15;
			this.anIntArray237[local15] = local33;
		}
		this.aBoolean218 = false;
		if (this.aClass190_3 != null) {
			this.aClass190_3.anInterface9_3 = null;
		}
	}

	@OriginalMember(owner = "client!hq", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		if (!this.aBoolean218) {
			this.method2241();
		}
		return this.aShort48;
	}

	@OriginalMember(owner = "client!hq", name = "JA", descriptor = "(III)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2949; local7++) {
			if (arg0 != 0) {
				this.anIntArray237[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray236[local7] += arg1;
			}
			if (arg2 != 0) {
				this.lb[local7] += arg2;
			}
		}
		if (this.aClass190_3 != null) {
			this.aClass190_3.anInterface9_3 = null;
		}
		this.aBoolean218 = false;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(SBBII)I")
	private int method2233(@OriginalArg(0) short arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = Static365.anIntArray475[Static61.method862(arg2, arg3)];
		if (arg0 != -1) {
			@Pc(24) Class112 local24 = this.aClass135_Sub2_15.anInterface5_7.method4079(arg0 & 0xFFFF);
			@Pc(29) int local29 = local24.aByte51 & 0xFF;
			@Pc(38) int local38;
			@Pc(69) int local69;
			if (local29 != 0) {
				if (arg3 < 0) {
					local38 = 0;
				} else if (arg3 <= 127) {
					local38 = arg3 * 131586;
				} else {
					local38 = 16777215;
				}
				if (local29 == 256) {
					local12 = local38;
				} else {
					local69 = 256 - local29;
					local12 = (local69 * (local12 & 0xFF00FF) + (local38 & 0xFF00FF) * local29 & 0xFF00FF00) + ((local12 & 0xFF00) * local69 + (local38 & 0xFF00) * local29 & 0xFF0000) >> 8;
				}
			}
			local38 = local24.aByte53 & 0xFF;
			if (local38 != 0) {
				local38 += 256;
				@Pc(118) int local118 = local38 * (local12 >> 16 & 0xFF);
				if (local118 > 65535) {
					local118 = 65535;
				}
				local69 = local38 * (local12 >> 8 & 0xFF);
				if (local69 > 65535) {
					local69 = 65535;
				}
				@Pc(146) int local146 = (local12 & 0xFF) * local38;
				if (local146 > 65535) {
					local146 = 65535;
				}
				local12 = (local69 & 0xFF00) + ((local118 & 0xAD00FF00) << 8) + (local146 >> 8);
			}
		}
		return (local12 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!hq", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class100.anIntArray206[arg0];
		@Pc(13) int local13 = Class100.anIntArray208[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2949; local15++) {
			@Pc(33) int local33 = this.anIntArray236[local15] * local13 - local9 * this.lb[local15] >> 15;
			this.lb[local15] = this.anIntArray236[local15] * local9 + this.lb[local15] * local13 >> 15;
			this.anIntArray236[local15] = local33;
		}
		if (this.aClass190_3 != null) {
			this.aClass190_3.anInterface9_3 = null;
		}
		this.aBoolean218 = false;
	}

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "(I)V")
	private void method2234() {
		if (this.aClass90Array1 == null) {
			return;
		}
		@Pc(18) Class35_Sub2 local18 = this.aClass135_Sub2_15.aClass35_Sub2_2;
		@Pc(22) float local22 = this.aClass135_Sub2_15.xa();
		@Pc(26) float local26 = this.aClass135_Sub2_15.W();
		this.aClass135_Sub2_15.method5408();
		this.aClass135_Sub2_15.method5336(false);
		this.aClass135_Sub2_15.method5461(false);
		this.aClass135_Sub2_15.method5431(this.aClass135_Sub2_15.aClass190_11, this.aClass135_Sub2_15.aClass190_10, null, null);
		for (@Pc(53) int local53 = 0; local53 < this.anInt2929; local53++) {
			@Pc(60) Class90 local60 = this.aClass90Array1[local53];
			@Pc(65) Class155 local65 = this.aClass155Array1[local53];
			if (!local60.aBoolean149 || !this.aClass135_Sub2_15.method5355()) {
				@Pc(94) float local94 = (float) (this.anIntArray237[local60.anInt2187] + this.anIntArray237[local60.anInt2184] + this.anIntArray237[local60.anInt2186]) * 0.3333333F;
				@Pc(116) float local116 = (float) (this.anIntArray236[local60.anInt2187] + this.anIntArray236[local60.anInt2184] + this.anIntArray236[local60.anInt2186]) * 0.3333333F;
				@Pc(138) float local138 = (float) (this.lb[local60.anInt2186] + this.lb[local60.anInt2184] + this.lb[local60.anInt2187]) * 0.3333333F;
				@Pc(152) float local152 = Static247.aFloat46 + local138 * Static351.aFloat70 + Static1.aFloat1 * local94 + local116 * Static285.aFloat53;
				@Pc(166) float local166 = local94 * Static100.aFloat21 + Static75.aFloat20 * local116 + local138 * Static351.aFloat69 + Static407.aFloat98;
				@Pc(180) float local180 = Static229.aFloat45 * local94 + Static215.aFloat67 * local116 + local138 * Static142.aFloat26 + Static215.aFloat65;
				local18.method2902(local65.anInt3779, local65.anInt3781 * local60.aShort39 >> 7, -local180, local65.anInt3776 * local60.aShort40 >> 7, (float) local65.anInt3774 - local166, local152 + (float) local65.anInt3777);
				this.aClass135_Sub2_15.method5487(local18);
				this.aClass135_Sub2_15.g(local26, local22 - (float) local60.anInt2185 * 1.5F);
				@Pc(231) int local231 = local65.anInt3772;
				OpenGL.glColor4ub((byte) (local231 >> 16), (byte) (local231 >> 8), (byte) local231, (byte) (local231 >> 24));
				this.aClass135_Sub2_15.method5485(local60.aShort38);
				this.aClass135_Sub2_15.method5426(local60.aByte46);
				this.aClass135_Sub2_15.method5441(local60.aByte45);
				this.aClass135_Sub2_15.method5452(4);
			}
		}
		this.aClass135_Sub2_15.g(local26, local22);
		this.aClass135_Sub2_15.method5336(true);
		this.aClass135_Sub2_15.method5465();
	}

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "(IILclient!ta;Lclient!ta;III)V")
	@Override
	public void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class41 arg2, @OriginalArg(3) Class41 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean218) {
			this.method2241();
		}
		@Pc(16) int local16 = this.aShort47 + arg4;
		@Pc(21) int local21 = arg4 + this.aShort45;
		@Pc(26) int local26 = this.aShort48 + arg6;
		@Pc(31) int local31 = this.aShort49 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt6908 <= arg2.anInt6905 + local21 >> arg2.anInt6907 || local26 < 0 || arg2.anInt6905 + local31 >> arg2.anInt6907 >= arg2.anInt6909)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt6905 + local21 >> arg3.anInt6907 >= arg3.anInt6908 || local26 < 0 || local31 + arg3.anInt6905 >> arg3.anInt6907 >= arg3.anInt6909) {
				return;
			}
		} else {
			local16 >>= arg2.anInt6907;
			local21 = local21 + arg2.anInt6905 - 1 >> arg2.anInt6907;
			local26 >>= arg2.anInt6907;
			local31 = local31 + arg2.anInt6905 - 1 >> arg2.anInt6907;
			if (arg2.l(local16, local26) == arg5 && arg5 == arg2.l(local21, local26) && arg5 == arg2.l(local16, local31) && arg5 == arg2.l(local21, local31)) {
				return;
			}
		}
		@Pc(199) int local199;
		if (arg0 == 1) {
			for (local199 = 0; local199 < this.anInt2949; local199++) {
				this.anIntArray236[local199] = this.anIntArray236[local199] + arg2.a(arg4 + this.anIntArray237[local199], this.lb[local199] - -arg6) - arg5;
			}
		} else {
			@Pc(207) int local207;
			@Pc(215) int local215;
			if (arg0 == 2) {
				@Pc(410) short local410 = this.aShort43;
				if (local410 == 0) {
					return;
				}
				for (local207 = 0; local207 < this.anInt2949; local207++) {
					local215 = (this.anIntArray236[local207] << 16) / local410;
					if (arg1 > local215) {
						this.anIntArray236[local207] -= -((arg1 - local215) * (arg2.a(arg4 + this.anIntArray237[local207], arg6 + this.lb[local207]) - arg5) / arg1);
					}
				}
			} else {
				@Pc(223) int local223;
				if (arg0 == 3) {
					local199 = (arg1 & 0xFF) * 4;
					local207 = (arg1 >> 8 & 0xFF) * 4;
					local215 = (arg1 >> 16 & 0xFF) << 6;
					local223 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local199 >> 1) < 0 || (local199 >> 1) + arg4 + arg2.anInt6905 >= arg2.anInt6908 << arg2.anInt6907 || arg6 - (local207 >> 1) < 0 || arg6 + (local207 >> 1) + arg2.anInt6905 >= arg2.anInt6909 << arg2.anInt6907) {
						return;
					}
					this.method3106(local199, local207, arg6, arg4, local223, local215, arg5, arg2);
				} else if (arg0 == 4) {
					local199 = this.aShort46 - this.aShort43;
					for (local207 = 0; local207 < this.anInt2949; local207++) {
						this.anIntArray236[local207] = this.anIntArray236[local207] + arg3.a(this.anIntArray237[local207] + arg4, this.lb[local207] + arg6) + local199 - arg5;
					}
				} else if (arg0 == 5) {
					local199 = this.aShort46 - this.aShort43;
					for (local207 = 0; local207 < this.anInt2949; local207++) {
						local215 = this.anIntArray237[local207] + arg4;
						local223 = this.lb[local207] + arg6;
						@Pc(325) int local325 = arg2.a(local215, local223);
						@Pc(330) int local330 = arg3.a(local215, local223);
						@Pc(334) int local334 = local325 - local330;
						this.anIntArray236[local207] = local325 + ((this.anIntArray236[local207] << 8) / local199 * local334 >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean218 = false;
		if (this.aClass190_3 != null) {
			this.aClass190_3.anInterface9_3 = null;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BZ)V")
	private void method2235(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass190_4 != null && this.aClass190_4.anInterface9_3 == null;
		@Pc(27) boolean local27 = this.aClass190_1 != null && this.aClass190_1.anInterface9_3 == null;
		@Pc(38) boolean local38 = this.aClass190_3 != null && this.aClass190_3.anInterface9_3 == null;
		@Pc(49) boolean local49 = this.aClass190_2 != null && this.aClass190_2.anInterface9_3 == null;
		if (arg0) {
			local16 &= (this.aByte66 & 0x2) != 0;
			local27 &= (this.aByte66 & 0x4) != 0;
			local38 &= (this.aByte66 & 0x1) != 0;
			local49 &= (this.aByte66 & 0x8) != 0;
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
		if (this.anInt2921 * local103 <= this.aClass135_Sub2_15.aClass4_Sub9_Sub1_3.aByteArray81.length) {
			this.aClass135_Sub2_15.aClass4_Sub9_Sub1_3.anInt6207 = 0;
		} else {
			this.aClass135_Sub2_15.aClass4_Sub9_Sub1_3 = new Class4_Sub9_Sub1(local103 * (this.anInt2921 + 100));
		}
		@Pc(183) Class4_Sub9_Sub1 local183 = this.aClass135_Sub2_15.aClass4_Sub9_Sub1_3;
		@Pc(199) int local199;
		@Pc(208) int local208;
		@Pc(236) int local236;
		@Pc(245) int local245;
		if (local38) {
			@Pc(215) int local215;
			@Pc(222) int local222;
			@Pc(227) int local227;
			@Pc(234) int local234;
			if (this.aClass135_Sub2_15.aBoolean474) {
				for (local199 = 0; local199 < this.anInt2949; local199++) {
					local208 = NativeStream.floatToRawIntBits((float) this.anIntArray237[local199]);
					local215 = NativeStream.floatToRawIntBits((float) this.anIntArray236[local199]);
					local222 = NativeStream.floatToRawIntBits((float) this.lb[local199]);
					local227 = this.anIntArray239[local199];
					local234 = this.anIntArray239[local199 + 1];
					for (local236 = local227; local236 < local234; local236++) {
						local245 = this.aShortArray51[local236] - 1;
						if (local245 == -1) {
							break;
						}
						local183.anInt6207 = local245 * local103;
						local183.method5047(local208);
						local183.method5047(local215);
						local183.method5047(local222);
					}
				}
			} else {
				for (local199 = 0; local199 < this.anInt2949; local199++) {
					local208 = NativeStream.floatToRawIntBits((float) this.anIntArray237[local199]);
					local215 = NativeStream.floatToRawIntBits((float) this.anIntArray236[local199]);
					local222 = NativeStream.floatToRawIntBits((float) this.lb[local199]);
					local227 = this.anIntArray239[local199];
					local234 = this.anIntArray239[local199 + 1];
					for (local236 = local227; local236 < local234; local236++) {
						local245 = this.aShortArray51[local236] - 1;
						if (local245 == -1) {
							break;
						}
						local183.anInt6207 = local103 * local245;
						local183.method5040(local208);
						local183.method5040(local215);
						local183.method5040(local222);
					}
				}
			}
		}
		@Pc(505) float local505;
		@Pc(384) short[] local384;
		@Pc(378) short[] local378;
		@Pc(387) short[] local387;
		@Pc(381) byte[] local381;
		@Pc(538) float local538;
		if (local16) {
			if (this.aClass190_1 == null) {
				if (this.aClass87_1 == null) {
					local378 = this.aShortArray54;
					local381 = this.aByteArray31;
					local384 = this.aShortArray47;
					local387 = this.aShortArray56;
				} else {
					local378 = this.aClass87_1.aShortArray27;
					local387 = this.aClass87_1.aShortArray29;
					local384 = this.aClass87_1.aShortArray28;
					local381 = this.aClass87_1.aByteArray15;
				}
				@Pc(411) float local411 = this.aClass135_Sub2_15.aFloatArray29[0];
				@Pc(417) float local417 = this.aClass135_Sub2_15.aFloatArray29[1];
				@Pc(423) float local423 = this.aClass135_Sub2_15.aFloatArray29[2];
				@Pc(427) float local427 = this.aClass135_Sub2_15.aFloat92;
				@Pc(437) float local437 = this.aClass135_Sub2_15.aFloat97 * 768.0F / (float) this.aShort44;
				@Pc(447) float local447 = this.aClass135_Sub2_15.aFloat82 * 768.0F / (float) this.aShort44;
				for (@Pc(449) int local449 = 0; local449 < this.anInt2911; local449++) {
					@Pc(469) int local469 = this.method2233(this.aShortArray53[local449], this.aByteArray30[local449], this.aShortArray48[local449], this.aShort50);
					@Pc(480) float local480 = this.aClass135_Sub2_15.aFloat94 * (float) (local469 >> 8 & 0xFF);
					@Pc(489) float local489 = this.aClass135_Sub2_15.aFloat93 * (float) (local469 >>> 24);
					@Pc(494) short local494 = this.aShortArray52[local449];
					local505 = this.aClass135_Sub2_15.aFloat83 * (float) (local469 >> 16 & 0xFF);
					@Pc(510) short local510 = (short) local381[local494];
					if (local510 == 0) {
						local538 = ((float) local387[local494] * local423 + (float) local378[local494] * local417 + local411 * (float) local384[local494]) * 0.0026041667F;
					} else {
						local538 = ((float) local384[local494] * local411 + local417 * (float) local378[local494] + (float) local387[local494] * local423) / (float) (local510 * 256);
					}
					@Pc(575) float local575 = (local538 < 0.0F ? local447 : local437) * local538 + local427;
					@Pc(580) int local580 = (int) (local575 * local489);
					@Pc(585) int local585 = (int) (local575 * local505);
					if (local580 < 0) {
						local580 = 0;
					} else if (local580 > 255) {
						local580 = 255;
					}
					@Pc(604) int local604 = (int) (local575 * local480);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local183.anInt6207 = local107 + local494 * local103;
					if (local604 < 0) {
						local604 = 0;
					} else if (local604 > 255) {
						local604 = 255;
					}
					local183.method4999(local580);
					local183.method4999(local585);
					local183.method4999(local604);
					local183.method4999(255 - (this.aByteArray30[local449] & 0xFF));
					local494 = this.aShortArray46[local449];
					local510 = local381[local494];
					if (local510 == 0) {
						local538 = (local417 * (float) local378[local494] + (float) local384[local494] * local411 + local423 * (float) local387[local494]) * 0.0026041667F;
					} else {
						local538 = (local423 * (float) local387[local494] + local411 * (float) local384[local494] + (float) local378[local494] * local417) / (float) (local510 * 256);
					}
					local575 = (local538 < 0.0F ? local447 : local437) * local538 + local427;
					local580 = (int) (local575 * local489);
					local585 = (int) (local505 * local575);
					if (local580 < 0) {
						local580 = 0;
					} else if (local580 > 255) {
						local580 = 255;
					}
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local604 = (int) (local480 * local575);
					if (local604 < 0) {
						local604 = 0;
					} else if (local604 > 255) {
						local604 = 255;
					}
					local183.anInt6207 = local107 + local103 * local494;
					local183.method4999(local580);
					local183.method4999(local585);
					local183.method4999(local604);
					local183.method4999(255 - (this.aByteArray30[local449] & 0xFF));
					local494 = this.aShortArray49[local449];
					local510 = local381[local494];
					if (local510 == 0) {
						local538 = ((float) local384[local494] * local411 + local417 * (float) local378[local494] + local423 * (float) local387[local494]) * 0.0026041667F;
					} else {
						local538 = (local417 * (float) local378[local494] + local411 * (float) local384[local494] + (float) local387[local494] * local423) / (float) (local510 * 256);
					}
					local575 = local427 + (local538 < 0.0F ? local447 : local437) * local538;
					local580 = (int) (local575 * local489);
					local585 = (int) (local505 * local575);
					if (local580 < 0) {
						local580 = 0;
					} else if (local580 > 255) {
						local580 = 255;
					}
					local604 = (int) (local575 * local480);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					if (local604 < 0) {
						local604 = 0;
					} else if (local604 > 255) {
						local604 = 255;
					}
					local183.anInt6207 = local107 + local494 * local103;
					local183.method4999(local580);
					local183.method4999(local585);
					local183.method4999(local604);
					local183.method4999(255 - (this.aByteArray30[local449] & 0xFF));
				}
			} else {
				for (local199 = 0; local199 < this.anInt2911; local199++) {
					local208 = this.method2233(this.aShortArray53[local199], this.aByteArray30[local199], this.aShortArray48[local199], this.aShort50);
					local183.anInt6207 = local107 + this.aShortArray52[local199] * local103;
					local183.method5047(local208);
					local183.anInt6207 = local107 + local103 * this.aShortArray46[local199];
					local183.method5047(local208);
					local183.anInt6207 = local107 + local103 * this.aShortArray49[local199];
					local183.method5047(local208);
				}
			}
		}
		if (local27) {
			if (this.aClass87_1 == null) {
				local384 = this.aShortArray47;
				local381 = this.aByteArray31;
				local378 = this.aShortArray54;
				local387 = this.aShortArray56;
			} else {
				local384 = this.aClass87_1.aShortArray28;
				local378 = this.aClass87_1.aShortArray27;
				local387 = this.aClass87_1.aShortArray29;
				local381 = this.aClass87_1.aByteArray15;
			}
			@Pc(1114) float local1114 = 3.0F / (float) this.aShort44;
			local183.anInt6207 = local109;
			local538 = 3.0F / (float) (this.aShort44 + this.aShort44 / 2);
			if (this.aClass135_Sub2_15.aBoolean474) {
				for (local236 = 0; local236 < this.anInt2921; local236++) {
					local245 = local381[local236] & 0xFF;
					if (local245 == 0) {
						local183.method1085(local538 * (float) local384[local236]);
						local183.method1085(local538 * (float) local378[local236]);
						local183.method1085(local538 * (float) local387[local236]);
					} else {
						local505 = local1114 / (float) local245;
						local183.method1085(local505 * (float) local384[local236]);
						local183.method1085(local505 * (float) local378[local236]);
						local183.method1085(local505 * (float) local387[local236]);
					}
					local183.anInt6207 += local103 - 12;
				}
			} else {
				for (local236 = 0; local236 < this.anInt2921; local236++) {
					local245 = local381[local236] & 0xFF;
					if (local245 == 0) {
						local183.method1084(local538 * (float) local384[local236]);
						local183.method1084(local538 * (float) local378[local236]);
						local183.method1084(local538 * (float) local387[local236]);
					} else {
						local505 = local1114 / (float) local245;
						local183.method1084(local505 * (float) local384[local236]);
						local183.method1084(local505 * (float) local378[local236]);
						local183.method1084((float) local387[local236] * local505);
					}
					local183.anInt6207 += local103 - 12;
				}
			}
		}
		if (local49) {
			local183.anInt6207 = local111;
			if (this.aClass135_Sub2_15.aBoolean474) {
				for (local199 = 0; local199 < this.anInt2921; local199++) {
					local183.method1085(this.aFloatArray8[local199]);
					local183.method1085(this.aFloatArray9[local199]);
					local183.anInt6207 += local103 - 8;
				}
			} else {
				for (local199 = 0; local199 < this.anInt2921; local199++) {
					local183.method1084(this.aFloatArray8[local199]);
					local183.method1084(this.aFloatArray9[local199]);
					local183.anInt6207 += local103 - 8;
				}
			}
		}
		local183.anInt6207 = local103 * this.anInt2921;
		@Pc(1406) Interface9 local1406;
		if (arg0) {
			if (this.anInterface9_1 == null) {
				this.anInterface9_1 = this.aClass135_Sub2_15.method5405(true, local183.anInt6207, local103, local183.aByteArray81);
			} else {
				this.anInterface9_1.method2936(local183.aByteArray81, local103, local183.anInt6207);
			}
			this.aByte66 = 0;
			local1406 = this.anInterface9_1;
		} else {
			local1406 = this.aClass135_Sub2_15.method5405(false, local183.anInt6207, local103, local183.aByteArray81);
			this.aBoolean219 = true;
		}
		if (local38) {
			this.aClass190_3.anInterface9_3 = local1406;
			this.aClass190_3.aByte76 = 0;
		}
		if (local49) {
			this.aClass190_2.anInterface9_3 = local1406;
			this.aClass190_2.aByte76 = local111;
		}
		if (local16) {
			this.aClass190_4.aByte76 = local107;
			this.aClass190_4.anInterface9_3 = local1406;
		}
		if (local27) {
			this.aClass190_1.anInterface9_3 = local1406;
			this.aClass190_1.aByte76 = local109;
		}
	}

	@OriginalMember(owner = "client!hq", name = "XA", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg3 << 4;
			local25 = arg4 << 4;
			Static267.anInt4392 = 0;
			Static289.anInt4755 = 0;
			Static132.anInt2425 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray34.length > local41) {
					local55 = this.anIntArrayArray34[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static132.anInt2425 += this.anIntArray237[local63];
						Static267.anInt4392 += this.anIntArray236[local63];
						Static289.anInt4755 += this.lb[local63];
						local33++;
					}
				}
			}
			if (local33 > 0) {
				Static132.anInt2425 = local17 + Static132.anInt2425 / local33;
				Static289.anInt4755 = Static289.anInt4755 / local33 + local25;
				Static267.anInt4392 = Static267.anInt4392 / local33 + local21;
			} else {
				Static132.anInt2425 = local17;
				Static289.anInt4755 = local25;
				Static267.anInt4392 = local21;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local21 = arg3 << 4;
			local25 = arg4 << 4;
			local17 = arg2 << 4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray34.length > local35) {
					local159 = this.anIntArrayArray34[local35];
					for (local161 = 0; local161 < local159.length; local161++) {
						local57 = local159[local161];
						this.anIntArray237[local57] += local17;
						this.anIntArray236[local57] += local21;
						this.lb[local57] += local25;
					}
				}
			}
			return;
		}
		@Pc(282) int local282;
		@Pc(300) int local300;
		@Pc(752) int local752;
		if (arg0 == 2) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray34.length > local35) {
					local159 = this.anIntArrayArray34[local35];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local57 = local159[local161];
							this.anIntArray237[local57] -= Static132.anInt2425;
							this.anIntArray236[local57] -= Static267.anInt4392;
							this.lb[local57] -= Static289.anInt4755;
							if (arg4 != 0) {
								local63 = Class100.anIntArray206[arg4];
								local282 = Class100.anIntArray208[arg4];
								local300 = this.anIntArray236[local57] * local63 + local282 * this.anIntArray237[local57] + 32767 >> 15;
								this.anIntArray236[local57] = this.anIntArray236[local57] * local282 + 32767 - this.anIntArray237[local57] * local63 >> 15;
								this.anIntArray237[local57] = local300;
							}
							if (arg2 != 0) {
								local63 = Class100.anIntArray206[arg2];
								local282 = Class100.anIntArray208[arg2];
								local300 = local282 * this.anIntArray236[local57] + 32767 - this.lb[local57] * local63 >> 15;
								this.lb[local57] = this.anIntArray236[local57] * local63 + this.lb[local57] * local282 + 32767 >> 15;
								this.anIntArray236[local57] = local300;
							}
							if (arg3 != 0) {
								local63 = Class100.anIntArray206[arg3];
								local282 = Class100.anIntArray208[arg3];
								local300 = local282 * this.anIntArray237[local57] + local63 * this.lb[local57] + 32767 >> 15;
								this.lb[local57] = local282 * this.lb[local57] + 32767 - this.anIntArray237[local57] * local63 >> 15;
								this.anIntArray237[local57] = local300;
							}
							this.anIntArray237[local57] += Static132.anInt2425;
							this.anIntArray236[local57] += Static267.anInt4392;
							this.lb[local57] += Static289.anInt4755;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local57 = local159[local161];
							this.anIntArray237[local57] -= Static132.anInt2425;
							this.anIntArray236[local57] -= Static267.anInt4392;
							this.lb[local57] -= Static289.anInt4755;
							if (arg2 != 0) {
								local63 = Class100.anIntArray206[arg2];
								local282 = Class100.anIntArray208[arg2];
								local300 = local282 * this.anIntArray236[local57] + 32767 - local63 * this.lb[local57] >> 15;
								this.lb[local57] = local282 * this.lb[local57] + local63 * this.anIntArray236[local57] + 32767 >> 15;
								this.anIntArray236[local57] = local300;
							}
							if (arg4 != 0) {
								local63 = Class100.anIntArray206[arg4];
								local282 = Class100.anIntArray208[arg4];
								local300 = this.anIntArray236[local57] * local63 + this.anIntArray237[local57] * local282 + 32767 >> 15;
								this.anIntArray236[local57] = this.anIntArray236[local57] * local282 + 32767 - this.anIntArray237[local57] * local63 >> 15;
								this.anIntArray237[local57] = local300;
							}
							if (arg3 != 0) {
								local63 = Class100.anIntArray206[arg3];
								local282 = Class100.anIntArray208[arg3];
								local300 = this.anIntArray237[local57] * local282 + this.lb[local57] * local63 + 32767 >> 15;
								this.lb[local57] = this.lb[local57] * local282 + 32767 - local63 * this.anIntArray237[local57] >> 15;
								this.anIntArray237[local57] = local300;
							}
							this.anIntArray237[local57] += Static132.anInt2425;
							this.anIntArray236[local57] += Static267.anInt4392;
							this.lb[local57] += Static289.anInt4755;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray34.length > local41) {
						local55 = this.anIntArrayArray34[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local282 = this.anIntArray239[local63];
							local300 = this.anIntArray239[local63 + 1];
							for (local752 = local282; local752 < local300; local752++) {
								@Pc(761) int local761 = this.aShortArray51[local752] - 1;
								if (local761 == -1) {
									break;
								}
								@Pc(771) int local771;
								@Pc(775) int local775;
								@Pc(793) int local793;
								if (arg4 != 0) {
									local771 = Class100.anIntArray206[arg4];
									local775 = Class100.anIntArray208[arg4];
									local793 = local775 * this.aShortArray47[local761] + local771 * this.aShortArray54[local761] + 32767 >> 15;
									this.aShortArray54[local761] = (short) (local775 * this.aShortArray54[local761] + 32767 - this.aShortArray47[local761] * local771 >> 15);
									this.aShortArray47[local761] = (short) local793;
								}
								if (arg2 != 0) {
									local771 = Class100.anIntArray206[arg2];
									local775 = Class100.anIntArray208[arg2];
									local793 = this.aShortArray54[local761] * local775 + 32767 - this.aShortArray56[local761] * local771 >> 15;
									this.aShortArray56[local761] = (short) (local771 * this.aShortArray54[local761] + local775 * this.aShortArray56[local761] + 32767 >> 15);
									this.aShortArray54[local761] = (short) local793;
								}
								if (arg3 != 0) {
									local771 = Class100.anIntArray206[arg3];
									local775 = Class100.anIntArray208[arg3];
									local793 = local775 * this.aShortArray47[local761] + local771 * this.aShortArray56[local761] + 32767 >> 15;
									this.aShortArray56[local761] = (short) (this.aShortArray56[local761] * local775 + 32767 - local771 * this.aShortArray47[local761] >> 15);
									this.aShortArray47[local761] = (short) local793;
								}
							}
						}
					}
				}
				if (this.aClass190_1 == null && this.aClass190_4 != null) {
					this.aClass190_4.anInterface9_3 = null;
				}
				if (this.aClass190_1 != null) {
					this.aClass190_1.anInterface9_3 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray34.length > local35) {
					local159 = this.anIntArrayArray34[local35];
					for (local161 = 0; local161 < local159.length; local161++) {
						local57 = local159[local161];
						this.anIntArray237[local57] -= Static132.anInt2425;
						this.anIntArray236[local57] -= Static267.anInt4392;
						this.lb[local57] -= Static289.anInt4755;
						this.anIntArray237[local57] = arg2 * this.anIntArray237[local57] >> 7;
						this.anIntArray236[local57] = this.anIntArray236[local57] * arg3 >> 7;
						this.lb[local57] = this.lb[local57] * arg4 >> 7;
						this.anIntArray237[local57] += Static132.anInt2425;
						this.anIntArray236[local57] += Static267.anInt4392;
						this.lb[local57] += Static289.anInt4755;
					}
				}
			}
		} else {
			@Pc(1213) Class90 local1213;
			@Pc(1218) Class155 local1218;
			if (arg0 == 5) {
				if (this.anIntArrayArray35 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray35.length > local35) {
							local159 = this.anIntArrayArray35[local35];
							for (local161 = 0; local161 < local159.length; local161++) {
								local57 = local159[local161];
								local63 = (this.aByteArray30[local57] & 0xFF) + arg2 * 8;
								if (local63 < 0) {
									local63 = 0;
								} else if (local63 > 255) {
									local63 = 255;
								}
								this.aByteArray30[local57] = (byte) local63;
							}
							if (local159.length > 0 && this.aClass190_4 != null) {
								this.aClass190_4.anInterface9_3 = null;
							}
						}
					}
					if (this.aClass90Array1 != null) {
						for (local35 = 0; local35 < this.anInt2929; local35++) {
							local1213 = this.aClass90Array1[local35];
							local1218 = this.aClass155Array1[local35];
							local1218.anInt3772 = 255 - (this.aByteArray30[local1213.anInt2182] & 0xFF) << 24 | local1218.anInt3772 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1458) Class155 local1458;
				if (arg0 == 8) {
					if (this.anIntArrayArray33 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (local35 < this.anIntArrayArray33.length) {
								local159 = this.anIntArrayArray33[local35];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1458 = this.aClass155Array1[local159[local161]];
									local1458.anInt3774 += arg3;
									local1458.anInt3777 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray33 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (this.anIntArrayArray33.length > local35) {
								local159 = this.anIntArrayArray33[local35];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1458 = this.aClass155Array1[local159[local161]];
									local1458.anInt3776 = arg3 * local1458.anInt3776 >> 7;
									local1458.anInt3781 = arg2 * local1458.anInt3781 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray33 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray33.length) {
							local159 = this.anIntArrayArray33[local35];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1458 = this.aClass155Array1[local159[local161]];
								local1458.anInt3779 = arg2 + local1458.anInt3779 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray35 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray35.length) {
						local159 = this.anIntArrayArray35[local35];
						for (local161 = 0; local161 < local159.length; local161++) {
							local57 = local159[local161];
							local63 = this.aShortArray48[local57] & 0xFFFF;
							local282 = local63 >> 10 & 0x3F;
							local300 = local63 >> 7 & 0x7;
							local752 = local63 & 0x7F;
							local300 += arg3 / 4;
							@Pc(1313) int local1313 = local282 + arg2 & 0x3F;
							local752 += arg4;
							if (local300 < 0) {
								local300 = 0;
							} else if (local300 > 7) {
								local300 = 7;
							}
							if (local752 < 0) {
								local752 = 0;
							} else if (local752 > 127) {
								local752 = 127;
							}
							this.aShortArray48[local57] = (short) (local300 << 7 | local1313 << 10 | local752);
						}
						if (local159.length > 0 && this.aClass190_4 != null) {
							this.aClass190_4.anInterface9_3 = null;
						}
					}
				}
				if (this.aClass90Array1 != null) {
					for (local35 = 0; local35 < this.anInt2929; local35++) {
						local1213 = this.aClass90Array1[local35];
						local1218 = this.aClass155Array1[local35];
						local1218.anInt3772 = local1218.anInt3772 & 0xFF000000 | Static365.anIntArray475[this.aShortArray48[local1213.anInt2182] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "P", descriptor = "()I")
	@Override
	public int P() {
		return this.anInt2914;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!c;Lclient!vs;I)V")
	@Override
	public void method3117(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class20_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2921 == 0) {
			return;
		}
		@Pc(13) Class35_Sub2 local13 = this.aClass135_Sub2_15.aClass35_Sub2_4;
		if (!this.aBoolean218) {
			this.method2241();
		}
		@Pc(22) Class35_Sub2 local22 = (Class35_Sub2) arg0;
		this.method2238(local22);
		Static215.aFloat65 = local13.aFloat33 * local22.aFloat35 + local13.aFloat39 * local22.aFloat43 + local13.aFloat41 * local22.aFloat38 + local13.aFloat35;
		Static215.aFloat67 = local13.aFloat33 * local22.aFloat39 + local22.aFloat34 * local13.aFloat39 + local13.aFloat41 * local22.aFloat37;
		@Pc(73) float local73 = Static215.aFloat65 + (float) this.aShort43 * Static215.aFloat67;
		@Pc(81) float local81 = (float) this.aShort46 * Static215.aFloat67 + Static215.aFloat65;
		@Pc(98) float local98;
		@Pc(91) float local91;
		if (local81 < local73) {
			local98 = (float) -this.aShort42 + local81;
			local91 = (float) this.aShort42 + local73;
		} else {
			local91 = (float) this.aShort42 + local81;
			local98 = (float) -this.aShort42 + local73;
		}
		if (this.aClass135_Sub2_15.aFloat89 <= local98 || (float) this.aClass135_Sub2_15.anInt6796 >= local91) {
			return;
		}
		Static247.aFloat46 = local13.aFloat38 + local22.aFloat35 * local13.aFloat32 + local13.aFloat37 * local22.aFloat43 + local22.aFloat38 * local13.aFloat42;
		Static285.aFloat53 = local22.aFloat39 * local13.aFloat32 + local22.aFloat34 * local13.aFloat37 + local22.aFloat37 * local13.aFloat42;
		@Pc(175) float local175 = Static247.aFloat46 + (float) this.aShort43 * Static285.aFloat53;
		@Pc(183) float local183 = (float) this.aShort46 * Static285.aFloat53 + Static247.aFloat46;
		@Pc(199) float local199;
		@Pc(210) float local210;
		if (local183 < local175) {
			local210 = (local175 + (float) this.aShort42) * (float) this.aClass135_Sub2_15.anInt6811;
			local199 = (float) this.aClass135_Sub2_15.anInt6811 * (local183 - (float) this.aShort42);
		} else {
			local199 = (float) this.aClass135_Sub2_15.anInt6811 * ((float) -this.aShort42 + local175);
			local210 = (float) this.aClass135_Sub2_15.anInt6811 * (local183 + (float) this.aShort42);
		}
		if (local199 / local91 >= this.aClass135_Sub2_15.aFloat90 || this.aClass135_Sub2_15.aFloat81 >= local210 / local91) {
			return;
		}
		Static407.aFloat98 = local22.aFloat35 * local13.aFloat36 + local13.aFloat34 * local22.aFloat43 + local22.aFloat38 * local13.aFloat40 + local13.aFloat43;
		Static75.aFloat20 = local22.aFloat39 * local13.aFloat36 + local13.aFloat40 * local22.aFloat37 + local22.aFloat34 * local13.aFloat34;
		@Pc(299) float local299 = Static407.aFloat98 + (float) this.aShort43 * Static75.aFloat20;
		@Pc(307) float local307 = (float) this.aShort46 * Static75.aFloat20 + Static407.aFloat98;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local299 > local307) {
			local322 = (float) this.aClass135_Sub2_15.anInt6795 * (local307 - (float) this.aShort42);
			local333 = ((float) this.aShort42 + local299) * (float) this.aClass135_Sub2_15.anInt6795;
		} else {
			local322 = (local299 - (float) this.aShort42) * (float) this.aClass135_Sub2_15.anInt6795;
			local333 = ((float) this.aShort42 + local307) * (float) this.aClass135_Sub2_15.anInt6795;
		}
		if (local322 / local91 >= this.aClass135_Sub2_15.aFloat78 || this.aClass135_Sub2_15.aFloat91 >= local333 / local91) {
			return;
		}
		if (arg1 != null || this.aClass90Array1 != null) {
			Static351.aFloat69 = local22.aFloat36 * local13.aFloat34 + local22.aFloat32 * local13.aFloat40 + local22.aFloat33 * local13.aFloat36;
			Static351.aFloat70 = local13.aFloat32 * local22.aFloat33 + local13.aFloat42 * local22.aFloat32 + local13.aFloat37 * local22.aFloat36;
			Static1.aFloat1 = local13.aFloat37 * local22.aFloat40 + local13.aFloat42 * local22.aFloat42 + local13.aFloat32 * local22.aFloat41;
			Static142.aFloat26 = local22.aFloat32 * local13.aFloat41 + local22.aFloat36 * local13.aFloat39 + local13.aFloat33 * local22.aFloat33;
			Static229.aFloat45 = local22.aFloat41 * local13.aFloat33 + local13.aFloat39 * local22.aFloat40 + local22.aFloat42 * local13.aFloat41;
			Static100.aFloat21 = local22.aFloat41 * local13.aFloat36 + local13.aFloat40 * local22.aFloat42 + local13.aFloat34 * local22.aFloat40;
		}
		if (arg1 != null) {
			@Pc(492) boolean local492 = false;
			@Pc(494) boolean local494 = true;
			@Pc(502) int local502 = this.aShort45 + this.aShort47 >> 1;
			@Pc(510) int local510 = this.aShort49 + this.aShort48 >> 1;
			@Pc(529) int local529 = (int) ((float) local510 * Static351.aFloat70 + (float) this.aShort43 * Static285.aFloat53 + Static247.aFloat46 + (float) local502 * Static1.aFloat1);
			@Pc(548) int local548 = (int) ((float) local510 * Static351.aFloat69 + Static407.aFloat98 + Static100.aFloat21 * (float) local502 + (float) this.aShort43 * Static75.aFloat20);
			@Pc(567) int local567 = (int) ((float) local510 * Static142.aFloat26 + (float) this.aShort43 * Static215.aFloat67 + Static229.aFloat45 * (float) local502 + Static215.aFloat65);
			if (this.aClass135_Sub2_15.anInt6796 <= local567) {
				arg1.anInt7195 = this.aClass135_Sub2_15.bf + local529 * this.aClass135_Sub2_15.anInt6811 / local567;
				arg1.anInt7191 = this.aClass135_Sub2_15.anInt6795 * local548 / local567 + this.aClass135_Sub2_15.anInt6805;
			} else {
				local492 = true;
			}
			@Pc(622) int local622 = (int) (Static351.aFloat70 * (float) local510 + (float) this.aShort46 * Static285.aFloat53 + Static1.aFloat1 * (float) local502 + Static247.aFloat46);
			@Pc(641) int local641 = (int) (Static351.aFloat69 * (float) local510 + (float) this.aShort46 * Static75.aFloat20 + Static407.aFloat98 + (float) local502 * Static100.aFloat21);
			@Pc(660) int local660 = (int) ((float) local502 * Static229.aFloat45 + Static215.aFloat65 + (float) this.aShort46 * Static215.aFloat67 + Static142.aFloat26 * (float) local510);
			if (this.aClass135_Sub2_15.anInt6796 <= local660) {
				arg1.anInt7194 = this.aClass135_Sub2_15.bf + this.aClass135_Sub2_15.anInt6811 * local622 / local660;
				arg1.anInt7192 = this.aClass135_Sub2_15.anInt6805 + local641 * this.aClass135_Sub2_15.anInt6795 / local660;
			} else {
				local492 = true;
			}
			if (local492) {
				if (this.aClass135_Sub2_15.anInt6796 > local567 && this.aClass135_Sub2_15.anInt6796 > local660) {
					local494 = false;
				} else {
					@Pc(739) int local739;
					@Pc(751) int local751;
					@Pc(778) int local778;
					if (this.aClass135_Sub2_15.anInt6796 > local567) {
						local739 = (local660 - this.aClass135_Sub2_15.anInt6796 << 16) / (local660 - local567);
						local751 = local622 + (local739 * (local622 - local529) >> 16);
						arg1.anInt7195 = local751 * this.aClass135_Sub2_15.anInt6811 / this.aClass135_Sub2_15.anInt6796 + this.aClass135_Sub2_15.bf;
						local778 = local641 + ((local641 - local548) * local739 >> 16);
						arg1.anInt7191 = this.aClass135_Sub2_15.anInt6805 + this.aClass135_Sub2_15.anInt6795 * local778 / this.aClass135_Sub2_15.anInt6796;
					} else if (local660 < this.aClass135_Sub2_15.anInt6796) {
						local739 = (local567 - this.aClass135_Sub2_15.anInt6796 << 16) / (local567 - local660);
						local751 = ((local529 - local622) * local739 >> 16) + local529;
						arg1.anInt7195 = this.aClass135_Sub2_15.bf + this.aClass135_Sub2_15.anInt6811 * local751 / this.aClass135_Sub2_15.anInt6796;
						local778 = (local739 * (local548 - local641) >> 16) + local548;
						arg1.anInt7191 = this.aClass135_Sub2_15.anInt6805 + local778 * this.aClass135_Sub2_15.anInt6795 / this.aClass135_Sub2_15.anInt6796;
					}
				}
			}
			if (local494) {
				if (local660 >= local567) {
					arg1.anInt7193 = this.aClass135_Sub2_15.bf + this.aClass135_Sub2_15.anInt6811 * (this.aShort42 + local622) / local660 - arg1.anInt7194;
				} else {
					arg1.anInt7193 = this.aClass135_Sub2_15.bf + this.aClass135_Sub2_15.anInt6811 * (this.aShort42 + local529) / local567 - arg1.anInt7195;
				}
				arg1.aBoolean508 = true;
			}
		}
		this.aClass135_Sub2_15.method5470();
		this.aClass135_Sub2_15.method5464(local22);
		this.method2231();
		this.aClass135_Sub2_15.method5465();
		this.method2234();
	}

	@OriginalMember(owner = "client!hq", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		if (!this.aBoolean218) {
			this.method2241();
		}
		return this.aShort46;
	}

	@OriginalMember(owner = "client!hq", name = "w", descriptor = "()Z")
	@Override
	protected boolean w() {
		if (this.anIntArrayArray34 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt2941; local12++) {
			this.anIntArray237[local12] <<= 0x4;
			this.anIntArray236[local12] <<= 0x4;
			this.lb[local12] <<= 0x4;
		}
		Static289.anInt4755 = 0;
		Static267.anInt4392 = 0;
		Static132.anInt2425 = 0;
		return true;
	}

	@OriginalMember(owner = "client!hq", name = "BA", descriptor = "(SS)V")
	@Override
	public void BA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2911; local7++) {
			if (this.aShortArray48[local7] == arg0) {
				this.aShortArray48[local7] = arg1;
			}
		}
		if (this.aClass90Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt2929; local30++) {
				@Pc(37) Class90 local37 = this.aClass90Array1[local30];
				@Pc(42) Class155 local42 = this.aClass155Array1[local30];
				local42.anInt3772 = Static365.anIntArray475[this.aShortArray48[local37.anInt2182] & 0xFFFF] & 0xFFFFFF | local42.anInt3772 & 0xFF000000;
			}
		}
		if (this.aClass190_4 != null) {
			this.aClass190_4.anInterface9_3 = null;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method2236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > arg6 && arg3 > arg6 && arg2 > arg6) {
			return false;
		} else if (arg6 > arg0 && arg6 > arg3 && arg6 > arg2) {
			return false;
		} else if (arg4 < arg5 && arg1 > arg4 && arg7 > arg4) {
			return false;
		} else {
			return arg4 <= arg5 || arg4 <= arg1 || arg7 >= arg4;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "()V")
	@Override
	public void method3105() {
		if (this.anInt2921 <= 0 || this.anInt2900 <= 0) {
			return;
		}
		this.method2235(false);
		if ((this.aByte66 & 0x10) == 0 && this.aClass121_1.anInterface7_3 == null) {
			this.method2240(false);
		}
		this.method2237();
	}

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "(I)V")
	private void method2237() {
		if (!this.aBoolean219) {
			return;
		}
		this.aBoolean219 = false;
		if (this.aClass76Array2 == null && this.aClass88Array2 == null && this.aClass90Array1 == null) {
			if (this.anIntArray237 != null && !Static336.method4437(this.anInt2919, this.anInt2914)) {
				if (this.aClass190_3 != null && this.aClass190_3.anInterface9_3 == null) {
					this.aBoolean219 = true;
				} else {
					if (!this.aBoolean218) {
						this.method2241();
					}
					this.anIntArray237 = null;
				}
			}
			if (this.anIntArray236 != null && !Static239.method3208(this.anInt2914, this.anInt2919)) {
				if (this.aClass190_3 != null && this.aClass190_3.anInterface9_3 == null) {
					this.aBoolean219 = true;
				} else {
					if (!this.aBoolean218) {
						this.method2241();
					}
					this.anIntArray236 = null;
				}
			}
			if (this.lb != null && !Static283.method3702(this.anInt2919, this.anInt2914)) {
				if (this.aClass190_3 != null && this.aClass190_3.anInterface9_3 == null) {
					this.aBoolean219 = true;
				} else {
					if (!this.aBoolean218) {
						this.method2241();
					}
					this.lb = null;
				}
			}
		}
		if (this.aShortArray51 != null && this.anIntArray237 == null && this.anIntArray236 == null && this.lb == null) {
			this.aShortArray51 = null;
			this.anIntArray239 = null;
		}
		if (this.aByteArray31 != null && !Static268.method3533(this.anInt2919, this.anInt2914)) {
			if (this.aClass190_1 == null) {
				if (this.aClass190_4 != null && this.aClass190_4.anInterface9_3 == null) {
					this.aBoolean219 = true;
				} else {
					this.aShortArray47 = this.aShortArray54 = this.aShortArray56 = null;
					this.aByteArray31 = null;
				}
			} else if (this.aClass190_1.anInterface9_3 == null) {
				this.aBoolean219 = true;
			} else {
				this.aShortArray47 = this.aShortArray54 = this.aShortArray56 = null;
				this.aByteArray31 = null;
			}
		}
		if (this.aShortArray48 != null && !Static341.method4513(this.anInt2914, this.anInt2919)) {
			if (this.aClass190_4 != null && this.aClass190_4.anInterface9_3 == null) {
				this.aBoolean219 = true;
			} else {
				this.aShortArray48 = null;
			}
		}
		if (this.aByteArray30 != null && !Static305.method3991(this.anInt2919, this.anInt2914)) {
			if (this.aClass190_4 != null && this.aClass190_4.anInterface9_3 == null) {
				this.aBoolean219 = true;
			} else {
				this.aByteArray30 = null;
			}
		}
		if (this.aFloatArray8 != null && !Static431.method5883(this.anInt2914, this.anInt2919)) {
			if (this.aClass190_2 != null && this.aClass190_2.anInterface9_3 == null) {
				this.aBoolean219 = true;
			} else {
				this.aFloatArray8 = this.aFloatArray9 = null;
			}
		}
		if (this.aShortArray53 != null && !Static251.method3312(this.anInt2914, this.anInt2919)) {
			if (this.aClass190_4 != null && this.aClass190_4.anInterface9_3 == null) {
				this.aBoolean219 = true;
			} else {
				this.aShortArray53 = null;
			}
		}
		if (this.aShortArray52 != null && !Static63.method4598(this.anInt2919, this.anInt2914)) {
			if ((this.aClass121_1 == null || this.aClass121_1.anInterface7_3 != null) && (this.aClass190_4 == null || this.aClass190_4.anInterface9_3 != null)) {
				this.aShortArray52 = this.aShortArray46 = this.aShortArray49 = null;
			} else {
				this.aBoolean219 = true;
			}
		}
		if (this.anIntArrayArray35 != null && !Static320.method4232(this.anInt2919, this.anInt2914)) {
			this.aShortArray50 = null;
			this.anIntArrayArray35 = null;
		}
		if (this.anIntArrayArray34 != null && !Static397.method5246(this.anInt2914, this.anInt2919)) {
			this.anIntArrayArray34 = null;
			this.aShortArray55 = null;
		}
		if (this.anIntArrayArray33 != null && !Static434.method5767(this.anInt2914, this.anInt2919)) {
			this.anIntArrayArray33 = null;
		}
		if (this.anIntArray238 != null && (this.anInt2914 & 0x800) == 0 && (this.anInt2914 & 0x40000) == 0) {
			this.anIntArray238 = null;
		}
	}

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "()Z")
	@Override
	public boolean method3120() {
		if (this.aShortArray53 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray53.length; local12++) {
			if (this.aShortArray53[local12] != -1 && !this.aClass135_Sub2_15.anInterface5_7.method4075(this.aShortArray53[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class100.anIntArray206[arg0];
		@Pc(13) int local13 = Class100.anIntArray208[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2949; local15++) {
			local33 = this.anIntArray237[local15] * local13 + this.lb[local15] * local9 >> 15;
			this.lb[local15] = this.lb[local15] * local13 - local9 * this.anIntArray237[local15] >> 15;
			this.anIntArray237[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt2921; local33++) {
			@Pc(86) int local86 = this.aShortArray47[local33] * local13 + local9 * this.aShortArray56[local33] >> 15;
			this.aShortArray56[local33] = (short) (this.aShortArray56[local33] * local13 - this.aShortArray47[local33] * local9 >> 15);
			this.aShortArray47[local33] = (short) local86;
		}
		if (this.aClass190_1 == null && this.aClass190_4 != null) {
			this.aClass190_4.anInterface9_3 = null;
		}
		if (this.aClass190_1 != null) {
			this.aClass190_1.anInterface9_3 = null;
		}
		this.aBoolean218 = false;
		if (this.aClass190_3 != null) {
			this.aClass190_3.anInterface9_3 = null;
		}
	}

	@OriginalMember(owner = "client!hq", name = "U", descriptor = "()I")
	@Override
	public int U() {
		if (!this.aBoolean218) {
			this.method2241();
		}
		return this.aShort42;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "()[Lclient!ew;")
	@Override
	public Class76[] method3111() {
		return this.aClass76Array2;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!km;I)V")
	private void method2238(@OriginalArg(0) Class35_Sub2 arg0) {
		@Pc(6) int local6;
		if (this.aClass76Array2 != null) {
			for (local6 = 0; local6 < this.aClass76Array2.length; local6++) {
				@Pc(13) Class76 local13 = this.aClass76Array2[local6];
				@Pc(15) Class76 local15 = local13;
				if (local13.aClass76_1 != null) {
					local15 = local13.aClass76_1;
				}
				local15.anInt1843 = (int) (arg0.aFloat38 + (float) this.anIntArray237[local13.anInt1844] * arg0.aFloat42 + arg0.aFloat37 * (float) this.anIntArray236[local13.anInt1844] + (float) this.lb[local13.anInt1844] * arg0.aFloat32);
				local15.anInt1850 = (int) (arg0.aFloat43 + (float) this.anIntArray237[local13.anInt1844] * arg0.aFloat40 + arg0.aFloat34 * (float) this.anIntArray236[local13.anInt1844] + (float) this.lb[local13.anInt1844] * arg0.aFloat36);
				local15.anInt1841 = (int) (arg0.aFloat35 + (float) this.lb[local13.anInt1844] * arg0.aFloat33 + arg0.aFloat39 * (float) this.anIntArray236[local13.anInt1844] + (float) this.anIntArray237[local13.anInt1844] * arg0.aFloat41);
				local15.anInt1835 = (int) (arg0.aFloat38 + arg0.aFloat32 * (float) this.lb[local13.anInt1845] + arg0.aFloat42 * (float) this.anIntArray237[local13.anInt1845] + (float) this.anIntArray236[local13.anInt1845] * arg0.aFloat37);
				local15.anInt1847 = (int) (arg0.aFloat43 + arg0.aFloat34 * (float) this.anIntArray236[local13.anInt1845] + (float) this.anIntArray237[local13.anInt1845] * arg0.aFloat40 + (float) this.lb[local13.anInt1845] * arg0.aFloat36);
				local15.anInt1839 = (int) (arg0.aFloat35 + (float) this.lb[local13.anInt1845] * arg0.aFloat33 + (float) this.anIntArray236[local13.anInt1845] * arg0.aFloat39 + (float) this.anIntArray237[local13.anInt1845] * arg0.aFloat41);
				local15.anInt1836 = (int) (arg0.aFloat38 + arg0.aFloat37 * (float) this.anIntArray236[local13.anInt1840] + arg0.aFloat42 * (float) this.anIntArray237[local13.anInt1840] + arg0.aFloat32 * (float) this.lb[local13.anInt1840]);
				local15.anInt1848 = (int) (arg0.aFloat36 * (float) this.lb[local13.anInt1840] + arg0.aFloat40 * (float) this.anIntArray237[local13.anInt1840] + (float) this.anIntArray236[local13.anInt1840] * arg0.aFloat34 + arg0.aFloat43);
				local15.anInt1837 = (int) ((float) this.anIntArray237[local13.anInt1840] * arg0.aFloat41 + (float) this.anIntArray236[local13.anInt1840] * arg0.aFloat39 + (float) this.lb[local13.anInt1840] * arg0.aFloat33 + arg0.aFloat35);
			}
		}
		if (this.aClass88Array2 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass88Array2.length; local6++) {
			@Pc(358) Class88 local358 = this.aClass88Array2[local6];
			@Pc(360) Class88 local360 = local358;
			if (local358.aClass88_1 != null) {
				local360 = local358.aClass88_1;
			}
			if (local358.aClass35_1 == null) {
				local358.aClass35_1 = arg0.method2897();
			} else {
				local358.aClass35_1.za(arg0);
			}
			local360.anInt2127 = (int) (arg0.aFloat42 * (float) this.anIntArray237[local358.anInt2132] + arg0.aFloat37 * (float) this.anIntArray236[local358.anInt2132] + arg0.aFloat32 * (float) this.lb[local358.anInt2132] + arg0.aFloat38);
			local360.anInt2133 = (int) (arg0.aFloat43 + arg0.aFloat40 * (float) this.anIntArray237[local358.anInt2132] + (float) this.anIntArray236[local358.anInt2132] * arg0.aFloat34 + arg0.aFloat36 * (float) this.lb[local358.anInt2132]);
			local360.anInt2130 = (int) (arg0.aFloat35 + (float) this.lb[local358.anInt2132] * arg0.aFloat33 + (float) this.anIntArray236[local358.anInt2132] * arg0.aFloat39 + arg0.aFloat41 * (float) this.anIntArray237[local358.anInt2132]);
		}
	}

	@OriginalMember(owner = "client!hq", name = "IA", descriptor = "()V")
	@Override
	public void IA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2949; local7++) {
			this.lb[local7] = -this.lb[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt2921; local29++) {
			this.aShortArray56[local29] = (short) -this.aShortArray56[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt2911; local48++) {
			@Pc(55) short local55 = this.aShortArray52[local48];
			this.aShortArray52[local48] = this.aShortArray49[local48];
			this.aShortArray49[local48] = local55;
		}
		if (this.aClass190_1 == null && this.aClass190_4 != null) {
			this.aClass190_4.anInterface9_3 = null;
		}
		if (this.aClass190_1 != null) {
			this.aClass190_1.anInterface9_3 = null;
		}
		if (this.aClass121_1 != null) {
			this.aClass121_1.anInterface7_3 = null;
		}
		this.aBoolean218 = false;
		if (this.aClass190_3 != null) {
			this.aClass190_3.anInterface9_3 = null;
		}
	}

	@OriginalMember(owner = "client!hq", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2949; local3++) {
			if (arg0 != 128) {
				this.anIntArray237[local3] = arg0 * this.anIntArray237[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray236[local3] = arg1 * this.anIntArray236[local3] >> 7;
			}
			if (arg2 != 128) {
				this.lb[local3] = this.lb[local3] * arg2 >> 7;
			}
		}
		this.aBoolean218 = false;
		if (this.aClass190_3 != null) {
			this.aClass190_3.anInterface9_3 = null;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!ua;I)V")
	private void method2239(@OriginalArg(0) Class4_Sub2_Sub3_Sub1 arg0) {
		if (this.anInt2921 > this.aClass135_Sub2_15.anIntArray519.length) {
			this.aClass135_Sub2_15.anIntArray520 = new int[this.anInt2921];
			this.aClass135_Sub2_15.anIntArray519 = new int[this.anInt2921];
		}
		@Pc(28) int[] local28 = this.aClass135_Sub2_15.anIntArray519;
		@Pc(32) int[] local32 = this.aClass135_Sub2_15.anIntArray520;
		@Pc(60) int local60;
		@Pc(99) int local99;
		@Pc(108) int local108;
		for (@Pc(34) int local34 = 0; local34 < this.anInt2949; local34++) {
			local60 = (this.anIntArray237[local34] - (this.anIntArray236[local34] * this.aClass135_Sub2_15.anInt6809 >> 8) >> this.aClass135_Sub2_15.anInt6780) - arg0.anInt6496;
			@Pc(85) int local85 = (this.lb[local34] - (this.anIntArray236[local34] * this.aClass135_Sub2_15.anInt6791 >> 8) >> this.aClass135_Sub2_15.anInt6780) - arg0.anInt6490;
			@Pc(90) int local90 = this.anIntArray239[local34];
			@Pc(97) int local97 = this.anIntArray239[local34 + 1];
			for (local99 = local90; local99 < local97; local99++) {
				local108 = this.aShortArray51[local99] - 1;
				if (local108 == -1) {
					break;
				}
				local28[local108] = local60;
				local32[local108] = local85;
			}
		}
		for (local60 = 0; local60 < this.anInt2900; local60++) {
			if (this.aByteArray30 == null || this.aByteArray30[local60] <= 128) {
				@Pc(158) short local158 = this.aShortArray52[local60];
				@Pc(163) short local163 = this.aShortArray46[local60];
				@Pc(168) short local168 = this.aShortArray49[local60];
				local99 = local28[local158];
				local108 = local28[local163];
				@Pc(180) int local180 = local28[local168];
				@Pc(184) int local184 = local32[local158];
				@Pc(188) int local188 = local32[local163];
				@Pc(192) int local192 = local32[local168];
				if ((local99 - local108) * (local188 - local192) - (local188 - local184) * (local180 - local108) > 0) {
					arg0.method5260(local108, local180, local184, local188, local99, local192);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "N", descriptor = "(IIII)V")
	@Override
	protected void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static132.anInt2425 = 0;
			Static289.anInt4755 = 0;
			Static267.anInt4392 = 0;
			local18 = 0;
			for (local20 = 0; local20 < this.anInt2949; local20++) {
				Static132.anInt2425 += this.anIntArray237[local20];
				Static267.anInt4392 += this.anIntArray236[local20];
				local18++;
				Static289.anInt4755 += this.lb[local20];
			}
			if (local18 > 0) {
				Static267.anInt4392 = arg2 + Static267.anInt4392 / local18;
				Static132.anInt2425 = arg1 + Static132.anInt2425 / local18;
				Static289.anInt4755 = Static289.anInt4755 / local18 + arg3;
			} else {
				Static267.anInt4392 = arg2;
				Static289.anInt4755 = arg3;
				Static132.anInt2425 = arg1;
			}
		} else if (arg0 == 1) {
			for (local18 = 0; local18 < this.anInt2949; local18++) {
				this.anIntArray237[local18] += arg1;
				this.anIntArray236[local18] += arg2;
				this.lb[local18] += arg3;
			}
		} else {
			@Pc(159) int local159;
			@Pc(178) int local178;
			if (arg0 == 2) {
				for (local18 = 0; local18 < this.anInt2949; local18++) {
					this.anIntArray237[local18] -= Static132.anInt2425;
					this.anIntArray236[local18] -= Static267.anInt4392;
					this.lb[local18] -= Static289.anInt4755;
					if (arg3 != 0) {
						local20 = Class100.anIntArray206[arg3];
						local159 = Class100.anIntArray208[arg3];
						local178 = this.anIntArray236[local18] * local20 + this.anIntArray237[local18] * local159 + 32767 >> 15;
						this.anIntArray236[local18] = local159 * this.anIntArray236[local18] + 32767 - this.anIntArray237[local18] * local20 >> 15;
						this.anIntArray237[local18] = local178;
					}
					if (arg1 != 0) {
						local20 = Class100.anIntArray206[arg1];
						local159 = Class100.anIntArray208[arg1];
						local178 = this.anIntArray236[local18] * local159 + 32767 - local20 * this.lb[local18] >> 15;
						this.lb[local18] = this.anIntArray236[local18] * local20 + local159 * this.lb[local18] + 32767 >> 15;
						this.anIntArray236[local18] = local178;
					}
					if (arg2 != 0) {
						local20 = Class100.anIntArray206[arg2];
						local159 = Class100.anIntArray208[arg2];
						local178 = local159 * this.anIntArray237[local18] + local20 * this.lb[local18] + 32767 >> 15;
						this.lb[local18] = local159 * this.lb[local18] + 32767 - local20 * this.anIntArray237[local18] >> 15;
						this.anIntArray237[local18] = local178;
					}
					this.anIntArray237[local18] += Static132.anInt2425;
					this.anIntArray236[local18] += Static267.anInt4392;
					this.lb[local18] += Static289.anInt4755;
				}
			} else if (arg0 == 3) {
				for (local18 = 0; local18 < this.anInt2949; local18++) {
					this.anIntArray237[local18] -= Static132.anInt2425;
					this.anIntArray236[local18] -= Static267.anInt4392;
					this.lb[local18] -= Static289.anInt4755;
					this.anIntArray237[local18] = arg1 * this.anIntArray237[local18] / 128;
					this.anIntArray236[local18] = arg2 * this.anIntArray236[local18] / 128;
					this.lb[local18] = arg3 * this.lb[local18] / 128;
					this.anIntArray237[local18] += Static132.anInt2425;
					this.anIntArray236[local18] += Static267.anInt4392;
					this.lb[local18] += Static289.anInt4755;
				}
			} else {
				@Pc(510) Class90 local510;
				@Pc(515) Class155 local515;
				if (arg0 == 5) {
					for (local18 = 0; local18 < this.anInt2911; local18++) {
						local20 = (this.aByteArray30[local18] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray30[local18] = (byte) local20;
					}
					if (this.aClass190_4 != null) {
						this.aClass190_4.anInterface9_3 = null;
					}
					if (this.aClass90Array1 != null) {
						for (local20 = 0; local20 < this.anInt2929; local20++) {
							local510 = this.aClass90Array1[local20];
							local515 = this.aClass155Array1[local20];
							local515.anInt3772 = 255 - (this.aByteArray30[local510.anInt2182] & 0xFF) << 24 | local515.anInt3772 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local18 = 0; local18 < this.anInt2911; local18++) {
						local20 = this.aShortArray48[local18] & 0xFFFF;
						local159 = local20 >> 10 & 0x3F;
						local178 = local20 >> 7 & 0x7;
						@Pc(577) int local577 = local159 + arg1 & 0x3F;
						local178 += arg2 / 4;
						@Pc(587) int local587 = local20 & 0x7F;
						if (local178 < 0) {
							local178 = 0;
						} else if (local178 > 7) {
							local178 = 7;
						}
						local587 += arg3;
						if (local587 < 0) {
							local587 = 0;
						} else if (local587 > 127) {
							local587 = 127;
						}
						this.aShortArray48[local18] = (short) (local577 << 10 | local178 << 7 | local587);
					}
					if (this.aClass190_4 != null) {
						this.aClass190_4.anInterface9_3 = null;
					}
					if (this.aClass90Array1 != null) {
						for (local20 = 0; local20 < this.anInt2929; local20++) {
							local510 = this.aClass90Array1[local20];
							local515 = this.aClass155Array1[local20];
							local515.anInt3772 = local515.anInt3772 & 0xFF000000 | Static365.anIntArray475[this.aShortArray48[local510.anInt2182] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(707) Class155 local707;
					if (arg0 == 8) {
						for (local18 = 0; local18 < this.anInt2929; local18++) {
							local707 = this.aClass155Array1[local18];
							local707.anInt3774 += arg2;
							local707.anInt3777 += arg1;
						}
					} else if (arg0 == 10) {
						for (local18 = 0; local18 < this.anInt2929; local18++) {
							local707 = this.aClass155Array1[local18];
							local707.anInt3781 = local707.anInt3781 * arg1 >> 7;
							local707.anInt3776 = arg2 * local707.anInt3776 >> 7;
						}
					} else if (arg0 == 9) {
						for (local18 = 0; local18 < this.anInt2929; local18++) {
							local707 = this.aClass155Array1[local18];
							local707.anInt3779 = local707.anInt3779 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "()V")
	@Override
	protected void j() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2941; local7++) {
			this.anIntArray237[local7] = this.anIntArray237[local7] + 7 >> 4;
			this.anIntArray236[local7] = this.anIntArray236[local7] + 7 >> 4;
			this.lb[local7] = this.lb[local7] + 7 >> 4;
		}
		if (this.aClass190_3 != null) {
			this.aClass190_3.anInterface9_3 = null;
		}
		this.aBoolean218 = false;
	}

	@OriginalMember(owner = "client!hq", name = "MA", descriptor = "()I")
	@Override
	public int MA() {
		if (!this.aBoolean218) {
			this.method2241();
		}
		return this.aShort43;
	}

	@OriginalMember(owner = "client!hq", name = "NA", descriptor = "()I")
	@Override
	public int NA() {
		if (!this.aBoolean218) {
			this.method2241();
		}
		return this.aShort45;
	}

	@OriginalMember(owner = "client!hq", name = "fa", descriptor = "(Lclient!ba;)Lclient!ba;")
	@Override
	public Class4_Sub2_Sub3 fa(@OriginalArg(0) Class4_Sub2_Sub3 arg0) {
		if (this.anInt2921 == 0) {
			return null;
		}
		if (!this.aBoolean218) {
			this.method2241();
		}
		@Pc(37) int local37;
		@Pc(53) int local53;
		if (this.aClass135_Sub2_15.anInt6809 <= 0) {
			local37 = this.aShort47 - (this.aClass135_Sub2_15.anInt6809 * this.aShort43 >> 8) >> this.aClass135_Sub2_15.anInt6780;
			local53 = this.aShort45 - (this.aClass135_Sub2_15.anInt6809 * this.aShort46 >> 8) >> this.aClass135_Sub2_15.anInt6780;
		} else {
			local37 = this.aShort47 - (this.aShort46 * this.aClass135_Sub2_15.anInt6809 >> 8) >> this.aClass135_Sub2_15.anInt6780;
			local53 = this.aShort45 - (this.aShort43 * this.aClass135_Sub2_15.anInt6809 >> 8) >> this.aClass135_Sub2_15.anInt6780;
		}
		@Pc(111) int local111;
		@Pc(128) int local128;
		if (this.aClass135_Sub2_15.anInt6791 <= 0) {
			local111 = this.aShort48 - (this.aShort43 * this.aClass135_Sub2_15.anInt6791 >> 8) >> this.aClass135_Sub2_15.anInt6780;
			local128 = this.aShort49 - (this.aClass135_Sub2_15.anInt6791 * this.aShort46 >> 8) >> this.aClass135_Sub2_15.anInt6780;
		} else {
			local111 = this.aShort48 - (this.aShort46 * this.aClass135_Sub2_15.anInt6791 >> 8) >> this.aClass135_Sub2_15.anInt6780;
			local128 = this.aShort49 - (this.aClass135_Sub2_15.anInt6791 * this.aShort43 >> 8) >> this.aClass135_Sub2_15.anInt6780;
		}
		@Pc(171) int local171 = local53 + 1 - local37;
		@Pc(177) int local177 = local128 + 1 - local111;
		@Pc(180) Class4_Sub2_Sub3_Sub1 local180 = (Class4_Sub2_Sub3_Sub1) arg0;
		@Pc(190) Class4_Sub2_Sub3_Sub1 local190;
		if (local180 != null && local180.method5259(local177, local171)) {
			local190 = local180;
			local180.method5262();
		} else {
			local190 = new Class4_Sub2_Sub3_Sub1(this.aClass135_Sub2_15, local171, local177);
		}
		local190.method5261(local37, local111, local53, local128);
		this.method2239(local190);
		return local190;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BIZ)Lclient!t;")
	@Override
	public Class116 method3123(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class116_Sub1 local12;
		@Pc(16) Class116_Sub1 local16;
		if (arg0 == 1) {
			local12 = this.aClass135_Sub2_15.aClass116_Sub1_9;
			local16 = this.aClass135_Sub2_15.aClass116_Sub1_5;
		} else if (arg0 == 2) {
			local16 = this.aClass135_Sub2_15.aClass116_Sub1_8;
			local12 = this.aClass135_Sub2_15.aClass116_Sub1_7;
		} else if (arg0 == 3) {
			local12 = this.aClass135_Sub2_15.aClass116_Sub1_2;
			local16 = this.aClass135_Sub2_15.aClass116_Sub1_3;
		} else if (arg0 == 4) {
			local12 = this.aClass135_Sub2_15.aClass116_Sub1_1;
			local16 = this.aClass135_Sub2_15.aClass116_Sub1_4;
		} else if (arg0 == 5) {
			local12 = this.aClass135_Sub2_15.aClass116_Sub1_10;
			local16 = this.aClass135_Sub2_15.aClass116_Sub1_6;
		} else {
			local12 = local16 = new Class116_Sub1(this.aClass135_Sub2_15);
		}
		return this.method2232(arg1, local16, arg0 != 0, arg2, local12);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!c;Lclient!vs;II)V")
	@Override
	public void method3104(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class20_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2921 == 0) {
			return;
		}
		@Pc(13) Class35_Sub2 local13 = this.aClass135_Sub2_15.aClass35_Sub2_4;
		if (!this.aBoolean218) {
			this.method2241();
		}
		@Pc(22) Class35_Sub2 local22 = (Class35_Sub2) arg0;
		Static215.aFloat67 = local13.aFloat33 * local22.aFloat39 + local22.aFloat34 * local13.aFloat39 + local13.aFloat41 * local22.aFloat37;
		Static215.aFloat65 = local13.aFloat35 + local13.aFloat39 * local22.aFloat43 + local22.aFloat38 * local13.aFloat41 + local22.aFloat35 * local13.aFloat33;
		@Pc(69) float local69 = (float) this.aShort43 * Static215.aFloat67 + Static215.aFloat65;
		@Pc(77) float local77 = Static215.aFloat67 * (float) this.aShort46 + Static215.aFloat65;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local77 < local69) {
			local87 = local77 - (float) this.aShort42;
			local93 = local69 + (float) this.aShort42;
		} else {
			local87 = local69 - (float) this.aShort42;
			local93 = local77 + (float) this.aShort42;
		}
		if (local87 >= this.aClass135_Sub2_15.aFloat77 || (float) this.aClass135_Sub2_15.anInt6796 >= local93) {
			return;
		}
		Static247.aFloat46 = local13.aFloat38 + local13.aFloat32 * local22.aFloat35 + local13.aFloat37 * local22.aFloat43 + local13.aFloat42 * local22.aFloat38;
		Static285.aFloat53 = local22.aFloat37 * local13.aFloat42 + local13.aFloat37 * local22.aFloat34 + local13.aFloat32 * local22.aFloat39;
		@Pc(169) float local169 = Static247.aFloat46 + (float) this.aShort43 * Static285.aFloat53;
		@Pc(177) float local177 = Static247.aFloat46 + Static285.aFloat53 * (float) this.aShort46;
		@Pc(192) float local192;
		@Pc(203) float local203;
		if (local177 < local169) {
			local192 = (float) this.aClass135_Sub2_15.anInt6811 * (local177 - (float) this.aShort42);
			local203 = ((float) this.aShort42 + local169) * (float) this.aClass135_Sub2_15.anInt6811;
		} else {
			local192 = (float) this.aClass135_Sub2_15.anInt6811 * (local169 - (float) this.aShort42);
			local203 = (float) this.aClass135_Sub2_15.anInt6811 * ((float) this.aShort42 + local177);
		}
		if (this.aClass135_Sub2_15.aFloat90 <= local192 / (float) arg2 || local203 / (float) arg2 <= this.aClass135_Sub2_15.aFloat81) {
			return;
		}
		Static407.aFloat98 = local13.aFloat43 + local13.aFloat40 * local22.aFloat38 + local22.aFloat43 * local13.aFloat34 + local13.aFloat36 * local22.aFloat35;
		Static75.aFloat20 = local22.aFloat39 * local13.aFloat36 + local22.aFloat34 * local13.aFloat34 + local13.aFloat40 * local22.aFloat37;
		@Pc(294) float local294 = Static75.aFloat20 * (float) this.aShort43 + Static407.aFloat98;
		@Pc(302) float local302 = (float) this.aShort46 * Static75.aFloat20 + Static407.aFloat98;
		@Pc(329) float local329;
		@Pc(317) float local317;
		if (local302 < local294) {
			local317 = ((float) this.aShort42 + local294) * (float) this.aClass135_Sub2_15.anInt6795;
			local329 = (float) this.aClass135_Sub2_15.anInt6795 * ((float) -this.aShort42 + local302);
		} else {
			local317 = ((float) this.aShort42 + local302) * (float) this.aClass135_Sub2_15.anInt6795;
			local329 = (float) this.aClass135_Sub2_15.anInt6795 * (local294 - (float) this.aShort42);
		}
		if (local329 / (float) arg2 >= this.aClass135_Sub2_15.aFloat78 || local317 / (float) arg2 <= this.aClass135_Sub2_15.aFloat91) {
			return;
		}
		if (arg1 != null || this.aClass90Array1 != null) {
			Static351.aFloat69 = local13.aFloat34 * local22.aFloat36 + local22.aFloat32 * local13.aFloat40 + local22.aFloat33 * local13.aFloat36;
			Static1.aFloat1 = local22.aFloat41 * local13.aFloat32 + local13.aFloat42 * local22.aFloat42 + local22.aFloat40 * local13.aFloat37;
			Static142.aFloat26 = local13.aFloat41 * local22.aFloat32 + local13.aFloat39 * local22.aFloat36 + local13.aFloat33 * local22.aFloat33;
			Static229.aFloat45 = local22.aFloat41 * local13.aFloat33 + local22.aFloat42 * local13.aFloat41 + local13.aFloat39 * local22.aFloat40;
			Static100.aFloat21 = local13.aFloat34 * local22.aFloat40 + local13.aFloat40 * local22.aFloat42 + local22.aFloat41 * local13.aFloat36;
			Static351.aFloat70 = local22.aFloat32 * local13.aFloat42 + local22.aFloat36 * local13.aFloat37 + local13.aFloat32 * local22.aFloat33;
		}
		if (arg1 != null) {
			@Pc(496) int local496 = this.aShort47 + this.aShort45 >> 1;
			@Pc(504) int local504 = this.aShort48 + this.aShort49 >> 1;
			@Pc(523) int local523 = (int) (Static351.aFloat70 * (float) local504 + (float) this.aShort43 * Static285.aFloat53 + (float) local496 * Static1.aFloat1 + Static247.aFloat46);
			@Pc(542) int local542 = (int) ((float) local504 * Static351.aFloat69 + (float) this.aShort43 * Static75.aFloat20 + (float) local496 * Static100.aFloat21 + Static407.aFloat98);
			@Pc(561) int local561 = (int) (Static142.aFloat26 * (float) local504 + Static215.aFloat67 * (float) this.aShort43 + Static215.aFloat65 + Static229.aFloat45 * (float) local496);
			@Pc(580) int local580 = (int) (Static351.aFloat70 * (float) local504 + Static247.aFloat46 + Static1.aFloat1 * (float) local496 + Static285.aFloat53 * (float) this.aShort46);
			@Pc(599) int local599 = (int) (Static407.aFloat98 + (float) local496 * Static100.aFloat21 + Static75.aFloat20 * (float) this.aShort46 + Static351.aFloat69 * (float) local504);
			arg1.anInt7191 = this.aClass135_Sub2_15.anInt6795 * local542 / arg2 + this.aClass135_Sub2_15.anInt6805;
			arg1.anInt7194 = local580 * this.aClass135_Sub2_15.anInt6811 / arg2 + this.aClass135_Sub2_15.bf;
			arg1.anInt7192 = this.aClass135_Sub2_15.anInt6805 + local599 * this.aClass135_Sub2_15.anInt6795 / arg2;
			arg1.anInt7195 = this.aClass135_Sub2_15.anInt6811 * local523 / arg2 + this.aClass135_Sub2_15.bf;
			@Pc(671) int local671 = (int) (Static142.aFloat26 * (float) local504 + Static215.aFloat67 * (float) this.aShort46 + Static229.aFloat45 * (float) local496 + Static215.aFloat65);
			if (this.aClass135_Sub2_15.anInt6796 > local561 && this.aClass135_Sub2_15.anInt6796 > local671) {
				arg1.anInt7193 = this.aClass135_Sub2_15.bf + this.aClass135_Sub2_15.anInt6811 * (this.aShort42 + local523) / arg2 - arg1.anInt7195;
				arg1.aBoolean508 = true;
			}
		}
		this.aClass135_Sub2_15.method5478((float) arg2);
		this.aClass135_Sub2_15.method5440();
		this.aClass135_Sub2_15.method5464(local22);
		this.method2231();
		this.aClass135_Sub2_15.method5465();
		this.method2234();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)V")
	private void method2240(@OriginalArg(0) boolean arg0) {
		if (this.anInt2900 * 6 <= this.aClass135_Sub2_15.aClass4_Sub9_Sub1_3.aByteArray81.length) {
			this.aClass135_Sub2_15.aClass4_Sub9_Sub1_3.anInt6207 = 0;
		} else {
			this.aClass135_Sub2_15.aClass4_Sub9_Sub1_3 = new Class4_Sub9_Sub1((this.anInt2900 + 100) * 6);
		}
		@Pc(38) Class4_Sub9_Sub1 local38 = this.aClass135_Sub2_15.aClass4_Sub9_Sub1_3;
		@Pc(44) int local44;
		if (this.aClass135_Sub2_15.aBoolean474) {
			for (local44 = 0; local44 < this.anInt2900; local44++) {
				local38.method5029(this.aShortArray52[local44]);
				local38.method5029(this.aShortArray46[local44]);
				local38.method5029(this.aShortArray49[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt2900; local44++) {
				local38.method5060(this.aShortArray52[local44]);
				local38.method5060(this.aShortArray46[local44]);
				local38.method5060(this.aShortArray49[local44]);
			}
		}
		if (local38.anInt6207 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface7_2 == null) {
				this.anInterface7_2 = this.aClass135_Sub2_15.method5423(true, local38.aByteArray81, local38.anInt6207);
			} else {
				this.anInterface7_2.method3829(local38.anInt6207, local38.aByteArray81);
			}
			this.aClass121_1.anInterface7_3 = this.anInterface7_2;
		} else {
			this.aClass121_1.anInterface7_3 = this.aClass135_Sub2_15.method5423(false, local38.aByteArray81, local38.anInt6207);
		}
		if (!arg0) {
			this.aBoolean219 = true;
		}
	}

	@OriginalMember(owner = "client!hq", name = "aa", descriptor = "(I)V")
	@Override
	public void aa(@OriginalArg(0) int arg0) {
		this.aShort44 = (short) arg0;
		if (this.aClass190_4 != null) {
			this.aClass190_4.anInterface9_3 = null;
		}
		if (this.aClass190_1 != null) {
			this.aClass190_1.anInterface9_3 = null;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method3107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class35_Sub2 local8 = (Class35_Sub2) arg2;
		@Pc(12) Class35_Sub2 local12 = this.aClass135_Sub2_15.aClass35_Sub2_4;
		@Pc(33) float local33 = local12.aFloat38 + local12.aFloat37 * local8.aFloat43 + local8.aFloat38 * local12.aFloat42 + local12.aFloat32 * local8.aFloat35;
		@Pc(54) float local54 = local8.aFloat43 * local12.aFloat34 + local8.aFloat38 * local12.aFloat40 + local12.aFloat36 * local8.aFloat35 + local12.aFloat43;
		Static142.aFloat26 = local12.aFloat33 * local8.aFloat33 + local12.aFloat39 * local8.aFloat36 + local8.aFloat32 * local12.aFloat41;
		Static229.aFloat45 = local8.aFloat41 * local12.aFloat33 + local8.aFloat40 * local12.aFloat39 + local8.aFloat42 * local12.aFloat41;
		Static351.aFloat70 = local12.aFloat32 * local8.aFloat33 + local12.aFloat37 * local8.aFloat36 + local8.aFloat32 * local12.aFloat42;
		Static215.aFloat67 = local12.aFloat33 * local8.aFloat39 + local12.aFloat39 * local8.aFloat34 + local8.aFloat37 * local12.aFloat41;
		Static1.aFloat1 = local8.aFloat40 * local12.aFloat37 + local8.aFloat42 * local12.aFloat42 + local12.aFloat32 * local8.aFloat41;
		Static351.aFloat69 = local12.aFloat40 * local8.aFloat32 + local12.aFloat34 * local8.aFloat36 + local12.aFloat36 * local8.aFloat33;
		Static75.aFloat20 = local8.aFloat37 * local12.aFloat40 + local8.aFloat34 * local12.aFloat34 + local8.aFloat39 * local12.aFloat36;
		Static285.aFloat53 = local12.aFloat42 * local8.aFloat37 + local8.aFloat34 * local12.aFloat37 + local12.aFloat32 * local8.aFloat39;
		Static100.aFloat21 = local8.aFloat41 * local12.aFloat36 + local12.aFloat34 * local8.aFloat40 + local8.aFloat42 * local12.aFloat40;
		@Pc(237) float local237 = local12.aFloat39 * local8.aFloat43 + local8.aFloat38 * local12.aFloat41 + local12.aFloat33 * local8.aFloat35 + local12.aFloat35;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass135_Sub2_15.anInt6811;
		@Pc(255) int local255 = this.aClass135_Sub2_15.anInt6795;
		if (!this.aBoolean218) {
			this.method2241();
		}
		Static255.anIntArray350[0] = this.aShort47;
		Static59.anIntArray40[0] = this.aShort43;
		Static339.anIntArray442[0] = this.aShort48;
		Static255.anIntArray350[1] = this.aShort45;
		Static59.anIntArray40[1] = this.aShort43;
		Static339.anIntArray442[1] = this.aShort48;
		Static255.anIntArray350[2] = this.aShort47;
		Static59.anIntArray40[2] = this.aShort46;
		Static255.anIntArray350[3] = this.aShort45;
		Static339.anIntArray442[2] = this.aShort48;
		Static59.anIntArray40[3] = this.aShort46;
		Static339.anIntArray442[3] = this.aShort48;
		Static255.anIntArray350[4] = this.aShort47;
		Static59.anIntArray40[4] = this.aShort43;
		Static255.anIntArray350[5] = this.aShort45;
		Static339.anIntArray442[4] = this.aShort49;
		Static59.anIntArray40[5] = this.aShort43;
		Static255.anIntArray350[6] = this.aShort47;
		Static339.anIntArray442[5] = this.aShort49;
		Static59.anIntArray40[6] = this.aShort46;
		Static339.anIntArray442[6] = this.aShort49;
		Static255.anIntArray350[7] = this.aShort45;
		Static59.anIntArray40[7] = this.aShort46;
		Static339.anIntArray442[7] = this.aShort49;
		@Pc(414) float local414;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(395) float local395;
		@Pc(390) float local390;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static59.anIntArray40[local383];
			local395 = Static255.anIntArray350[local383];
			local400 = Static339.anIntArray442[local383];
			local414 = local390 * Static285.aFloat53 + local395 * Static1.aFloat1 + local400 * Static351.aFloat70 + local33;
			local428 = local237 + local390 * Static215.aFloat67 + Static229.aFloat45 * local395 + Static142.aFloat26 * local400;
			local442 = local54 + local400 * Static351.aFloat69 + Static75.aFloat20 * local390 + local395 * Static100.aFloat21;
			if ((float) this.aClass135_Sub2_15.anInt6796 <= local428) {
				@Pc(461) float local461 = (float) this.aClass135_Sub2_15.bf + (float) local251 * local414 / local428;
				@Pc(473) float local473 = (float) this.aClass135_Sub2_15.anInt6805 + local442 * (float) local255 / local428;
				if (local243 < local461) {
					local243 = local461;
				}
				if (local461 < local241) {
					local241 = local461;
				}
				local239 = true;
				if (local247 < local473) {
					local247 = local473;
				}
				if (local245 > local473) {
					local245 = local473;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && local245 < (float) arg1 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt2921 > this.aClass135_Sub2_15.anIntArray519.length) {
				this.aClass135_Sub2_15.anIntArray520 = new int[this.anInt2921];
				this.aClass135_Sub2_15.anIntArray519 = new int[this.anInt2921];
			}
			@Pc(554) int[] local554 = this.aClass135_Sub2_15.anIntArray519;
			@Pc(558) int[] local558 = this.aClass135_Sub2_15.anIntArray520;
			@Pc(634) int local634;
			for (@Pc(560) int local560 = 0; local560 < this.anInt2949; local560++) {
				local390 = this.anIntArray236[local560];
				local400 = this.lb[local560];
				local395 = this.anIntArray237[local560];
				local442 = local54 + local400 * Static351.aFloat69 + Static100.aFloat21 * local395 + Static75.aFloat20 * local390;
				local414 = Static1.aFloat1 * local395 + Static285.aFloat53 * local390 + local400 * Static351.aFloat70 + local33;
				local428 = local237 + Static215.aFloat67 * local390 + Static229.aFloat45 * local395 + local400 * Static142.aFloat26;
				@Pc(641) int local641;
				@Pc(643) int local643;
				@Pc(652) int local652;
				if (local428 >= (float) this.aClass135_Sub2_15.anInt6796) {
					local634 = (int) ((float) local251 * local414 / local428 + (float) this.aClass135_Sub2_15.bf);
					local641 = (int) ((float) this.aClass135_Sub2_15.anInt6805 + local442 * (float) local255 / local428);
					local643 = this.anIntArray239[local560];
					local652 = this.anIntArray239[local560 + 1];
					for (@Pc(715) int local715 = local643; local715 < local652; local715++) {
						@Pc(724) int local724 = this.aShortArray51[local715] - 1;
						if (local724 == -1) {
							break;
						}
						local554[local724] = local634;
						local558[local724] = local641;
					}
				} else {
					local634 = this.anIntArray239[local560];
					local641 = this.anIntArray239[local560 + 1];
					for (local643 = local634; local643 < local641; local643++) {
						local652 = this.aShortArray51[local643] - 1;
						if (local652 == -1) {
							break;
						}
						local554[this.aShortArray51[local643] - 1] = -999999;
					}
				}
			}
			for (local634 = 0; local634 < this.anInt2911; local634++) {
				if (local554[this.aShortArray52[local634]] != -999999 && local554[this.aShortArray46[local634]] != -999999 && local554[this.aShortArray49[local634]] != -999999 && this.method2236(local558[this.aShortArray52[local634]], local554[this.aShortArray46[local634]], local558[this.aShortArray49[local634]], local558[this.aShortArray46[local634]], arg0, local554[this.aShortArray52[local634]], arg1, local554[this.aShortArray49[local634]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hq", name = "D", descriptor = "()I")
	@Override
	public int D() {
		return this.aShort50;
	}

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "(I)V")
	private void method2241() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < this.anInt2949; local30++) {
			@Pc(37) int local37 = this.anIntArray237[local30];
			@Pc(42) int local42 = this.anIntArray236[local30];
			if (local9 > local42) {
				local9 = local42;
			}
			if (local37 < local7) {
				local7 = local37;
			}
			if (local37 > local13) {
				local13 = local37;
			}
			if (local15 < local42) {
				local15 = local42;
			}
			@Pc(71) int local71 = this.lb[local30];
			if (local71 < local11) {
				local11 = local71;
			}
			if (local71 > local17) {
				local17 = local71;
			}
			@Pc(97) int local97 = local71 * local71 + local37 * local37;
			if (local97 > local19) {
				local19 = local97;
			}
			local97 = local71 * local71 + local37 * local37 + local42 * local42;
			if (local28 < local97) {
				local28 = local97;
			}
		}
		this.aShort48 = (short) local11;
		this.aShort43 = (short) local9;
		this.aShort47 = (short) local7;
		this.aShort45 = (short) local13;
		this.aShort49 = (short) local17;
		this.aShort46 = (short) local15;
		this.aShort42 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local28);
		this.aBoolean218 = true;
	}

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "()I")
	@Override
	public int l() {
		return this.aShort44;
	}

	@OriginalMember(owner = "client!hq", name = "E", descriptor = "(I)V")
	@Override
	public void E(@OriginalArg(0) int arg0) {
		if (this.aClass190_4 != null) {
			this.aClass190_4.anInterface9_3 = null;
		}
		this.aShort50 = (short) arg0;
	}

	@OriginalMember(owner = "client!hq", name = "M", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void M(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static267.anInt4392 = 0;
			local26 = 0;
			Static132.anInt2425 = 0;
			Static289.anInt4755 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray34.length > local38) {
					local52 = this.anIntArrayArray34[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray55 == null || (this.aShortArray55[local60] & arg6) != 0) {
							Static132.anInt2425 += this.anIntArray237[local60];
							Static267.anInt4392 += this.anIntArray236[local60];
							Static289.anInt4755 += this.lb[local60];
							local26++;
						}
					}
				}
			}
			if (local26 > 0) {
				Static267.anInt4392 = Static267.anInt4392 / local26 + arg3;
				Static132.anInt2425 = Static132.anInt2425 / local26 + arg2;
				Static213.aBoolean42 = true;
				Static289.anInt4755 = Static289.anInt4755 / local26 + arg4;
			} else {
				Static267.anInt4392 = arg3;
				Static289.anInt4755 = arg4;
				Static132.anInt2425 = arg2;
			}
			return;
		}
		@Pc(258) int[] local258;
		@Pc(260) int local260;
		if (arg0 == 1) {
			if (arg7 != null) {
				local26 = arg4 * arg7[2] + arg7[1] * arg3 + arg2 * arg7[0] + 16384 >> 15;
				local32 = arg7[4] * arg3 + arg7[3] * arg2 + arg7[5] * arg4 + 16384 >> 15;
				local38 = arg3 * arg7[7] + arg2 * arg7[6] + arg4 * arg7[8] + 16384 >> 15;
				arg2 = local26;
				arg3 = local32;
				arg4 = local38;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray34.length) {
					local258 = this.anIntArrayArray34[local32];
					for (local260 = 0; local260 < local258.length; local260++) {
						local54 = local258[local260];
						if (this.aShortArray55 == null || (arg6 & this.aShortArray55[local54]) != 0) {
							this.anIntArray237[local54] += arg2;
							this.anIntArray236[local54] += arg3;
							this.lb[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(380) int local380;
		@Pc(403) int local403;
		@Pc(429) int local429;
		@Pc(460) int local460;
		@Pc(464) int local464;
		@Pc(468) int local468;
		@Pc(472) int local472;
		@Pc(480) int local480;
		@Pc(488) int local488;
		@Pc(642) int local642;
		@Pc(667) int local667;
		@Pc(671) int local671;
		@Pc(679) int local679;
		@Pc(684) int local684;
		@Pc(688) int local688;
		@Pc(692) int local692;
		@Pc(694) int local694;
		@Pc(826) int[] local826;
		@Pc(828) int local828;
		@Pc(832) int local832;
		@Pc(836) int local836;
		@Pc(838) int local838;
		@Pc(969) int local969;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray34.length) {
						local258 = this.anIntArrayArray34[local32];
						for (local260 = 0; local260 < local258.length; local260++) {
							local54 = local258[local260];
							if (this.aShortArray55 == null || (arg6 & this.aShortArray55[local54]) != 0) {
								this.anIntArray237[local54] -= Static132.anInt2425;
								this.anIntArray236[local54] -= Static267.anInt4392;
								this.lb[local54] -= Static289.anInt4755;
								if (arg4 != 0) {
									local60 = Class100.anIntArray206[arg4];
									local380 = Class100.anIntArray208[arg4];
									local403 = this.anIntArray237[local54] * local380 + local60 * this.anIntArray236[local54] + 32767 >> 15;
									this.anIntArray236[local54] = this.anIntArray236[local54] * local380 + 32767 - this.anIntArray237[local54] * local60 >> 15;
									this.anIntArray237[local54] = local403;
								}
								if (arg2 != 0) {
									local60 = Class100.anIntArray206[arg2];
									local380 = Class100.anIntArray208[arg2];
									local403 = local380 * this.anIntArray236[local54] + 32767 - this.lb[local54] * local60 >> 15;
									this.lb[local54] = local380 * this.lb[local54] + local60 * this.anIntArray236[local54] + 32767 >> 15;
									this.anIntArray236[local54] = local403;
								}
								if (arg3 != 0) {
									local60 = Class100.anIntArray206[arg3];
									local380 = Class100.anIntArray208[arg3];
									local403 = local380 * this.anIntArray237[local54] + local60 * this.lb[local54] + 32767 >> 15;
									this.lb[local54] = this.lb[local54] * local380 + 32767 - this.anIntArray237[local54] * local60 >> 15;
									this.anIntArray237[local54] = local403;
								}
								this.anIntArray237[local54] += Static132.anInt2425;
								this.anIntArray236[local54] += Static267.anInt4392;
								this.lb[local54] += Static289.anInt4755;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray34.length > local38) {
							local52 = this.anIntArrayArray34[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray55 == null || (arg6 & this.aShortArray55[local60]) != 0) {
									local380 = this.anIntArray239[local60];
									local403 = this.anIntArray239[local60 + 1];
									for (local429 = local380; local429 < local403; local429++) {
										local460 = this.aShortArray51[local429] - 1;
										if (local460 == -1) {
											break;
										}
										if (arg4 != 0) {
											local464 = Class100.anIntArray206[arg4];
											local468 = Class100.anIntArray208[arg4];
											local472 = this.aShortArray47[local460] * local468 + local464 * this.aShortArray54[local460] + 32767 >> 15;
											this.aShortArray54[local460] = (short) (local468 * this.aShortArray54[local460] + 32767 - this.aShortArray47[local460] * local464 >> 15);
											this.aShortArray47[local460] = (short) local472;
										}
										if (arg2 != 0) {
											local464 = Class100.anIntArray206[arg2];
											local468 = Class100.anIntArray208[arg2];
											local472 = this.aShortArray54[local460] * local468 + 32767 - this.aShortArray56[local460] * local464 >> 15;
											this.aShortArray56[local460] = (short) (this.aShortArray54[local460] * local464 + this.aShortArray56[local460] * local468 + 32767 >> 15);
											this.aShortArray54[local460] = (short) local472;
										}
										if (arg3 != 0) {
											local464 = Class100.anIntArray206[arg3];
											local468 = Class100.anIntArray208[arg3];
											local472 = this.aShortArray47[local460] * local468 + this.aShortArray56[local460] * local464 + 32767 >> 15;
											this.aShortArray56[local460] = (short) (local468 * this.aShortArray56[local460] + 32767 - this.aShortArray47[local460] * local464 >> 15);
											this.aShortArray47[local460] = (short) local472;
										}
									}
								}
							}
						}
					}
					if (this.aClass190_1 == null && this.aClass190_4 != null) {
						this.aClass190_4.anInterface9_3 = null;
					}
					if (this.aClass190_1 != null) {
						this.aClass190_1.anInterface9_3 = null;
					}
				}
			} else {
				local26 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local260 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static213.aBoolean42) {
					local380 = arg7[6] * Static289.anInt4755 + Static132.anInt2425 * arg7[0] + Static267.anInt4392 * arg7[3] + 16384 >> 15;
					local403 = Static267.anInt4392 * arg7[4] + arg7[1] * Static132.anInt2425 + arg7[7] * Static289.anInt4755 + 16384 >> 15;
					local403 += local54;
					local429 = arg7[2] * Static132.anInt2425 + arg7[5] * Static267.anInt4392 + Static289.anInt4755 * arg7[8] + 16384 >> 15;
					local380 += local260;
					Static132.anInt2425 = local380;
					local429 += local60;
					Static267.anInt4392 = local403;
					Static213.aBoolean42 = false;
					Static289.anInt4755 = local429;
				}
				@Pc(448) int[] local448 = new int[9];
				local403 = Class100.anIntArray208[arg2];
				local429 = Class100.anIntArray206[arg2];
				local460 = Class100.anIntArray208[arg3];
				local464 = Class100.anIntArray206[arg3];
				local468 = Class100.anIntArray208[arg4];
				local472 = Class100.anIntArray206[arg4];
				local480 = local429 * local468 + 16384 >> 15;
				local488 = local472 * local429 + 16384 >> 15;
				local448[5] = -local429;
				local448[0] = local464 * local488 + local460 * local468 + 16384 >> 15;
				local448[3] = local403 * local472 + 16384 >> 15;
				local448[6] = -local464 * local468 + local460 * local488 + 16384 >> 15;
				local448[7] = local460 * local480 + local472 * local464 + 16384 >> 15;
				local448[2] = local403 * local464 + 16384 >> 15;
				local448[8] = local460 * local403 + 16384 >> 15;
				local448[4] = local403 * local468 + 16384 >> 15;
				local448[1] = -local460 * local472 + local464 * local480 + 16384 >> 15;
				@Pc(617) int local617 = -Static289.anInt4755 * local448[2] + -Static267.anInt4392 * local448[1] + -Static132.anInt2425 * local448[0] + 16384 >> 15;
				local642 = -Static289.anInt4755 * local448[5] + local448[4] * -Static267.anInt4392 + local448[3] * -Static132.anInt2425 + 16384 >> 15;
				local667 = local448[8] * -Static289.anInt4755 + local448[7] * -Static267.anInt4392 + local448[6] * -Static132.anInt2425 + 16384 >> 15;
				local671 = local617 + Static132.anInt2425;
				@Pc(675) int local675 = local642 + Static267.anInt4392;
				local679 = Static289.anInt4755 + local667;
				@Pc(682) int[] local682 = new int[9];
				for (local684 = 0; local684 < 3; local684++) {
					for (local688 = 0; local688 < 3; local688++) {
						local692 = 0;
						for (local694 = 0; local694 < 3; local694++) {
							local692 += local448[local684 * 3 + local694] * arg7[local688 * 3 + local694];
						}
						local682[local688 + local684 * 3] = local692 + 16384 >> 15;
					}
				}
				local688 = local448[0] * local260 + local54 * local448[1] + local60 * local448[2] + 16384 >> 15;
				local692 = local54 * local448[4] + local260 * local448[3] + local60 * local448[5] + 16384 >> 15;
				local688 += local671;
				local694 = local448[6] * local260 + local448[7] * local54 + local448[8] * local60 + 16384 >> 15;
				local692 += local675;
				local694 += local679;
				local826 = new int[9];
				for (local828 = 0; local828 < 3; local828++) {
					for (local832 = 0; local832 < 3; local832++) {
						local836 = 0;
						for (local838 = 0; local838 < 3; local838++) {
							local836 += local682[local832 + local838 * 3] * arg7[local828 * 3 + local838];
						}
						local826[local828 * 3 + local832] = local836 + 16384 >> 15;
					}
				}
				local832 = arg7[2] * local694 + local692 * arg7[1] + local688 * arg7[0] + 16384 >> 15;
				local836 = arg7[3] * local688 + arg7[4] * local692 + arg7[5] * local694 + 16384 >> 15;
				local832 += local26;
				local838 = local692 * arg7[7] + arg7[6] * local688 + arg7[8] * local694 + 16384 >> 15;
				local836 += local32;
				local838 += local38;
				for (local969 = 0; local969 < local8; local969++) {
					@Pc(975) int local975 = arg1[local969];
					if (local975 < this.anIntArrayArray34.length) {
						@Pc(989) int[] local989 = this.anIntArrayArray34[local975];
						for (@Pc(991) int local991 = 0; local991 < local989.length; local991++) {
							@Pc(997) int local997 = local989[local991];
							if (this.aShortArray55 == null || (arg6 & this.aShortArray55[local997]) != 0) {
								@Pc(1039) int local1039 = local826[2] * this.lb[local997] + local826[0] * this.anIntArray237[local997] + this.anIntArray236[local997] * local826[1] + 16384 >> 15;
								@Pc(1070) int local1070 = this.lb[local997] * local826[5] + local826[3] * this.anIntArray237[local997] + local826[4] * this.anIntArray236[local997] + 16384 >> 15;
								@Pc(1102) int local1102 = this.lb[local997] * local826[8] + this.anIntArray237[local997] * local826[6] + this.anIntArray236[local997] * local826[7] + 16384 >> 15;
								@Pc(1106) int local1106 = local1070 + local836;
								@Pc(1110) int local1110 = local1039 + local832;
								this.anIntArray237[local997] = local1110;
								@Pc(1119) int local1119 = local1102 + local838;
								this.anIntArray236[local997] = local1106;
								this.lb[local997] = local1119;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2601) Class90 local2601;
			@Pc(2606) Class155 local2606;
			if (arg0 == 5) {
				if (this.anIntArrayArray35 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray35.length > local32) {
							local258 = this.anIntArrayArray35[local32];
							for (local260 = 0; local260 < local258.length; local260++) {
								local54 = local258[local260];
								if (this.aShortArray50 == null || (arg6 & this.aShortArray50[local54]) != 0) {
									local60 = arg2 * 8 + (this.aByteArray30[local54] & 0xFF);
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray30[local54] = (byte) local60;
									if (this.aClass190_4 != null) {
										this.aClass190_4.anInterface9_3 = null;
									}
								}
							}
						}
					}
					if (this.aClass90Array1 != null) {
						for (local32 = 0; local32 < this.anInt2929; local32++) {
							local2601 = this.aClass90Array1[local32];
							local2606 = this.aClass155Array1[local32];
							local2606.anInt3772 = 255 - (this.aByteArray30[local2601.anInt2182] & 0xFF) << 24 | local2606.anInt3772 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2855) Class155 local2855;
				if (arg0 == 8) {
					if (this.anIntArrayArray33 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray33.length > local32) {
								local258 = this.anIntArrayArray33[local32];
								for (local260 = 0; local260 < local258.length; local260++) {
									local2855 = this.aClass155Array1[local258[local260]];
									local2855.anInt3777 += arg2;
									local2855.anInt3774 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray33 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray33.length) {
								local258 = this.anIntArrayArray33[local32];
								for (local260 = 0; local260 < local258.length; local260++) {
									local2855 = this.aClass155Array1[local258[local260]];
									local2855.anInt3776 = arg3 * local2855.anInt3776 >> 7;
									local2855.anInt3781 = local2855.anInt3781 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray33 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray33.length > local32) {
							local258 = this.anIntArrayArray33[local32];
							for (local260 = 0; local260 < local258.length; local260++) {
								local2855 = this.aClass155Array1[local258[local260]];
								local2855.anInt3779 = arg2 + local2855.anInt3779 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray35 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray35.length > local32) {
						local258 = this.anIntArrayArray35[local32];
						for (local260 = 0; local260 < local258.length; local260++) {
							local54 = local258[local260];
							if (this.aShortArray50 == null || (this.aShortArray50[local54] & arg6) != 0) {
								local60 = this.aShortArray48[local54] & 0xFFFF;
								local380 = local60 >> 10 & 0x3F;
								local403 = local60 >> 7 & 0x7;
								@Pc(2701) int local2701 = arg2 + local380 & 0x3F;
								local403 += arg3 / 4;
								local429 = local60 & 0x7F;
								local429 += arg4;
								if (local403 < 0) {
									local403 = 0;
								} else if (local403 > 7) {
									local403 = 7;
								}
								if (local429 < 0) {
									local429 = 0;
								} else if (local429 > 127) {
									local429 = 127;
								}
								this.aShortArray48[local54] = (short) (local429 | local403 << 7 | local2701 << 10);
								if (this.aClass190_4 != null) {
									this.aClass190_4.anInterface9_3 = null;
								}
							}
						}
					}
				}
				if (this.aClass90Array1 != null) {
					for (local32 = 0; local32 < this.anInt2929; local32++) {
						local2601 = this.aClass90Array1[local32];
						local2606 = this.aClass155Array1[local32];
						local2606.anInt3772 = Static365.anIntArray475[this.aShortArray48[local2601.anInt2182] & 0xFFFF] & 0xFFFFFF | local2606.anInt3772 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray34.length) {
					local258 = this.anIntArrayArray34[local32];
					for (local260 = 0; local260 < local258.length; local260++) {
						local54 = local258[local260];
						if (this.aShortArray55 == null || (this.aShortArray55[local54] & arg6) != 0) {
							this.anIntArray237[local54] -= Static132.anInt2425;
							this.anIntArray236[local54] -= Static267.anInt4392;
							this.lb[local54] -= Static289.anInt4755;
							this.anIntArray237[local54] = arg2 * this.anIntArray237[local54] >> 7;
							this.anIntArray236[local54] = this.anIntArray236[local54] * arg3 >> 7;
							this.lb[local54] = arg4 * this.lb[local54] >> 7;
							this.anIntArray237[local54] += Static132.anInt2425;
							this.anIntArray236[local54] += Static267.anInt4392;
							this.lb[local54] += Static289.anInt4755;
						}
					}
				}
			}
		} else {
			local26 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local260 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static213.aBoolean42) {
				local380 = Static289.anInt4755 * arg7[6] + Static132.anInt2425 * arg7[0] + Static267.anInt4392 * arg7[3] + 16384 >> 15;
				local403 = Static289.anInt4755 * arg7[7] + Static267.anInt4392 * arg7[4] + arg7[1] * Static132.anInt2425 + 16384 >> 15;
				local380 += local260;
				local429 = Static267.anInt4392 * arg7[5] + Static132.anInt2425 * arg7[2] + Static289.anInt4755 * arg7[8] + 16384 >> 15;
				local403 += local54;
				local429 += local60;
				Static267.anInt4392 = local403;
				Static132.anInt2425 = local380;
				Static213.aBoolean42 = false;
				Static289.anInt4755 = local429;
			}
			local380 = arg2 << 15 >> 7;
			local403 = arg3 << 15 >> 7;
			local429 = arg4 << 15 >> 7;
			local460 = -Static132.anInt2425 * local380 + 16384 >> 15;
			local464 = local403 * -Static267.anInt4392 + 16384 >> 15;
			local468 = local429 * -Static289.anInt4755 + 16384 >> 15;
			local472 = local460 + Static132.anInt2425;
			local480 = local464 + Static267.anInt4392;
			local488 = Static289.anInt4755 + local468;
			@Pc(2038) int[] local2038 = new int[] { local380 * arg7[0] + 16384 >> 15, local380 * arg7[3] + 16384 >> 15, arg7[6] * local380 + 16384 >> 15, local403 * arg7[1] + 16384 >> 15, local403 * arg7[4] + 16384 >> 15, arg7[7] * local403 + 16384 >> 15, arg7[2] * local429 + 16384 >> 15, local429 * arg7[5] + 16384 >> 15, arg7[8] * local429 + 16384 >> 15 };
			local642 = local260 * local380 + 16384 >> 15;
			local667 = local403 * local54 + 16384 >> 15;
			@Pc(2166) int local2166 = local642 + local472;
			@Pc(2170) int local2170 = local667 + local480;
			local671 = local60 * local429 + 16384 >> 15;
			@Pc(2182) int local2182 = local671 + local488;
			@Pc(2185) int[] local2185 = new int[9];
			@Pc(2191) int local2191;
			for (local679 = 0; local679 < 3; local679++) {
				for (local2191 = 0; local2191 < 3; local2191++) {
					local684 = 0;
					for (local688 = 0; local688 < 3; local688++) {
						local684 += arg7[local688 + local679 * 3] * local2038[local2191 + local688 * 3];
					}
					local2185[local679 * 3 + local2191] = local684 + 16384 >> 15;
				}
			}
			local2191 = local2182 * arg7[2] + arg7[1] * local2170 + local2166 * arg7[0] + 16384 >> 15;
			local684 = local2182 * arg7[5] + local2166 * arg7[3] + arg7[4] * local2170 + 16384 >> 15;
			local684 += local32;
			local688 = arg7[8] * local2182 + arg7[7] * local2170 + arg7[6] * local2166 + 16384 >> 15;
			local2191 += local26;
			local688 += local38;
			for (local692 = 0; local692 < local8; local692++) {
				local694 = arg1[local692];
				if (this.anIntArrayArray34.length > local694) {
					local826 = this.anIntArrayArray34[local694];
					for (local828 = 0; local828 < local826.length; local828++) {
						local832 = local826[local828];
						if (this.aShortArray55 == null || (this.aShortArray55[local832] & arg6) != 0) {
							local836 = local2185[1] * this.anIntArray236[local832] + local2185[0] * this.anIntArray237[local832] + local2185[2] * this.lb[local832] + 16384 >> 15;
							local838 = local2185[5] * this.lb[local832] + local2185[3] * this.anIntArray237[local832] + this.anIntArray236[local832] * local2185[4] + 16384 >> 15;
							local969 = this.anIntArray236[local832] * local2185[7] + this.anIntArray237[local832] * local2185[6] + local2185[8] * this.lb[local832] + 16384 >> 15;
							@Pc(2459) int local2459 = local836 + local2191;
							@Pc(2463) int local2463 = local838 + local684;
							this.anIntArray237[local832] = local2459;
							@Pc(2472) int local2472 = local969 + local688;
							this.anIntArray236[local832] = local2463;
							this.lb[local832] = local2472;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "UA", descriptor = "(I)V")
	@Override
	public void UA(@OriginalArg(0) int arg0) {
		this.anInt2914 = arg0;
		this.aBoolean219 = true;
		if (this.aClass87_1 != null && (this.anInt2914 & 0x10000) == 0) {
			this.aByteArray31 = this.aClass87_1.aByteArray15;
			this.aShortArray56 = this.aClass87_1.aShortArray29;
			this.aShortArray54 = this.aClass87_1.aShortArray27;
			this.aShortArray47 = this.aClass87_1.aShortArray28;
			this.aClass87_1 = null;
		}
		this.method2237();
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "()[Lclient!fs;")
	@Override
	public Class88[] method3115() {
		return this.aClass88Array2;
	}

	@OriginalMember(owner = "client!hq", name = "I", descriptor = "(SS)V")
	@Override
	public void I(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface5 local9 = this.aClass135_Sub2_15.anInterface5_7;
		for (@Pc(11) int local11 = 0; local11 < this.anInt2911; local11++) {
			if (this.aShortArray53[local11] == arg0) {
				this.aShortArray53[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(52) Class112 local52 = local9.method4079(arg0 & 0xFFFF);
			local39 = local52.aByte51;
			local41 = local52.aByte53;
		}
		@Pc(60) byte local60 = 0;
		@Pc(62) byte local62 = 0;
		if (arg1 != -1) {
			@Pc(72) Class112 local72 = local9.method4079(arg1 & 0xFFFF);
			local62 = local72.aByte53;
			local60 = local72.aByte51;
		}
		if (!(local62 != local41 | local60 != local39)) {
			return;
		}
		if (this.aClass90Array1 != null) {
			for (@Pc(101) int local101 = 0; local101 < this.anInt2929; local101++) {
				@Pc(108) Class90 local108 = this.aClass90Array1[local101];
				@Pc(113) Class155 local113 = this.aClass155Array1[local101];
				local113.anInt3772 = local113.anInt3772 & 0xFF000000 | Static365.anIntArray475[this.aShortArray48[local108.anInt2182] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass190_4 != null) {
			this.aClass190_4.anInterface9_3 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!t;IIIZ)V")
	@Override
	public void method3118(@OriginalArg(0) Class116 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class116_Sub1 local8 = (Class116_Sub1) arg0;
		if (this.anInt2911 == 0 || local8.anInt2911 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt2949;
		@Pc(24) int[] local24 = local8.anIntArray237;
		@Pc(27) int[] local27 = local8.anIntArray236;
		@Pc(30) int[] local30 = local8.lb;
		@Pc(33) short[] local33 = local8.aShortArray47;
		@Pc(36) short[] local36 = local8.aShortArray54;
		@Pc(39) short[] local39 = local8.aShortArray56;
		@Pc(42) byte[] local42 = local8.aByteArray31;
		@Pc(53) short[] local53;
		@Pc(47) short[] local47;
		@Pc(49) short[] local49;
		@Pc(51) byte[] local51;
		if (this.aClass87_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local49 = this.aClass87_1.aShortArray29;
			local51 = this.aClass87_1.aByteArray15;
			local47 = this.aClass87_1.aShortArray27;
			local53 = this.aClass87_1.aShortArray28;
		}
		@Pc(78) short[] local78;
		@Pc(76) short[] local76;
		@Pc(82) short[] local82;
		@Pc(80) byte[] local80;
		if (local8.aClass87_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local82 = local8.aClass87_1.aShortArray29;
			local80 = local8.aClass87_1.aByteArray15;
			local76 = local8.aClass87_1.aShortArray27;
			local78 = local8.aClass87_1.aShortArray28;
		}
		@Pc(103) int[] local103 = local8.anIntArray239;
		@Pc(106) short[] local106 = local8.aShortArray51;
		if (!local8.aBoolean218) {
			local8.method2241();
		}
		@Pc(115) short local115 = local8.aShort43;
		@Pc(118) short local118 = local8.aShort46;
		@Pc(121) short local121 = local8.aShort47;
		@Pc(124) short local124 = local8.aShort45;
		@Pc(127) short local127 = local8.aShort48;
		@Pc(130) short local130 = local8.aShort49;
		for (@Pc(132) int local132 = 0; local132 < this.anInt2949; local132++) {
			@Pc(142) int local142 = this.anIntArray236[local132] - arg2;
			if (local115 <= local142 && local142 <= local118) {
				@Pc(165) int local165 = this.anIntArray237[local132] - arg1;
				if (local121 <= local165 && local124 >= local165) {
					@Pc(184) int local184 = this.lb[local132] - arg3;
					if (local184 >= local127 && local184 <= local130) {
						@Pc(198) int local198 = -1;
						@Pc(203) int local203 = this.anIntArray239[local132];
						@Pc(210) int local210 = this.anIntArray239[local132 + 1];
						for (@Pc(212) int local212 = local203; local212 < local210; local212++) {
							local198 = this.aShortArray51[local212] - 1;
							if (local198 == -1 || this.aByteArray31[local198] != 0) {
								break;
							}
						}
						if (local198 != -1) {
							for (@Pc(242) int local242 = 0; local242 < local21; local242++) {
								if (local24[local242] == local165 && local184 == local30[local242] && local27[local242] == local142) {
									local203 = local103[local242];
									@Pc(273) int local273 = -1;
									local210 = local103[local242 + 1];
									for (@Pc(281) int local281 = local203; local281 < local210; local281++) {
										local273 = local106[local281] - 1;
										if (local273 == -1 || local42[local273] != 0) {
											break;
										}
									}
									if (local273 != -1) {
										if (local53 == null) {
											this.aClass87_1 = new Class87();
											local53 = this.aClass87_1.aShortArray28 = Static429.method5622(this.aShortArray47);
											local47 = this.aClass87_1.aShortArray27 = Static429.method5622(this.aShortArray54);
											local49 = this.aClass87_1.aShortArray29 = Static429.method5622(this.aShortArray56);
											local51 = this.aClass87_1.aByteArray15 = Static252.method3317(this.aByteArray31);
										}
										if (local78 == null) {
											@Pc(364) Class87 local364 = local8.aClass87_1 = new Class87();
											local78 = local364.aShortArray28 = Static429.method5622(local33);
											local76 = local364.aShortArray27 = Static429.method5622(local36);
											local82 = local364.aShortArray29 = Static429.method5622(local39);
											local80 = local364.aByteArray15 = Static252.method3317(local42);
										}
										@Pc(397) short local397 = this.aShortArray47[local198];
										@Pc(402) short local402 = this.aShortArray54[local198];
										@Pc(407) short local407 = this.aShortArray56[local198];
										local203 = local103[local242];
										@Pc(416) byte local416 = this.aByteArray31[local198];
										local210 = local103[local242 + 1];
										@Pc(432) int local432;
										for (@Pc(424) int local424 = local203; local424 < local210; local424++) {
											local432 = local106[local424] - 1;
											if (local432 == -1) {
												break;
											}
											if (local80[local432] != 0) {
												local78[local432] += local397;
												local76[local432] += local402;
												local82[local432] += local407;
												local80[local432] += local416;
											}
										}
										local203 = this.anIntArray239[local132];
										local397 = local33[local273];
										local407 = local39[local273];
										local402 = local36[local273];
										local416 = local42[local273];
										local210 = this.anIntArray239[local132 + 1];
										for (local432 = local203; local432 < local210; local432++) {
											@Pc(519) int local519 = this.aShortArray51[local432] - 1;
											if (local519 == -1) {
												break;
											}
											if (local51[local519] != 0) {
												local53[local519] += local397;
												local47[local519] += local402;
												local49[local519] += local407;
												local51[local519] += local416;
											}
										}
										if (this.aClass190_1 == null && this.aClass190_4 != null) {
											this.aClass190_4.anInterface9_3 = null;
										}
										if (this.aClass190_1 != null) {
											this.aClass190_1.anInterface9_3 = null;
										}
										if (local8.aClass190_1 == null && local8.aClass190_4 != null) {
											local8.aClass190_4.anInterface9_3 = null;
										}
										if (local8.aClass190_1 != null) {
											local8.aClass190_1.anInterface9_3 = null;
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
