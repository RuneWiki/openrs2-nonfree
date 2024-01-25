import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!at", name = "m", descriptor = "Lclient!ig;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!at", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!at", name = "s", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!at", name = "u", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!at", name = "x", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!at", name = "B", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!at", name = "E", descriptor = "B")
	private byte aByte11;

	@OriginalMember(owner = "client!at", name = "H", descriptor = "I")
	private int anInt477;

	@OriginalMember(owner = "client!at", name = "J", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!at", name = "L", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!at", name = "N", descriptor = "[Lclient!ds;")
	private Class62[] aClass62Array1;

	@OriginalMember(owner = "client!at", name = "Q", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!at", name = "S", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!at", name = "T", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!at", name = "W", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!at", name = "Y", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!at", name = "db", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!at", name = "eb", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!at", name = "hb", descriptor = "Lclient!gp;")
	private Class98 aClass98_1;

	@OriginalMember(owner = "client!at", name = "ib", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!at", name = "jb", descriptor = "Lclient!oi;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!at", name = "mb", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!at", name = "nb", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!at", name = "qb", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!at", name = "vb", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!at", name = "wb", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!at", name = "xb", descriptor = "[I")
	private int[] anIntArray30;

	@OriginalMember(owner = "client!at", name = "yb", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!at", name = "Ab", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!at", name = "Gb", descriptor = "[I")
	private int[] anIntArray31;

	@OriginalMember(owner = "client!at", name = "Hb", descriptor = "[F")
	private float[] aFloatArray2;

	@OriginalMember(owner = "client!at", name = "Jb", descriptor = "[Lclient!hv;")
	private Class114[] aClass114Array1;

	@OriginalMember(owner = "client!at", name = "Nb", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!at", name = "Ob", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!at", name = "Tb", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!at", name = "Wb", descriptor = "[F")
	private float[] aFloatArray3;

	@OriginalMember(owner = "client!at", name = "ac", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!at", name = "bc", descriptor = "I")
	private int anInt511;

	@OriginalMember(owner = "client!at", name = "gc", descriptor = "[Lclient!gh;")
	private Class94[] aClass94Array1;

	@OriginalMember(owner = "client!at", name = "jc", descriptor = "[Lclient!ea;")
	private Class66[] aClass66Array1;

	@OriginalMember(owner = "client!at", name = "lc", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!at", name = "oc", descriptor = "S")
	private short aShort21;

	@OriginalMember(owner = "client!at", name = "sc", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!at", name = "A", descriptor = "I")
	private int anInt472 = 0;

	@OriginalMember(owner = "client!at", name = "z", descriptor = "Z")
	private boolean aBoolean16 = false;

	@OriginalMember(owner = "client!at", name = "pb", descriptor = "Z")
	private boolean aBoolean17 = true;

	@OriginalMember(owner = "client!at", name = "O", descriptor = "I")
	private int anInt480 = 0;

	@OriginalMember(owner = "client!at", name = "Pb", descriptor = "I")
	private int anInt501 = 0;

	@OriginalMember(owner = "client!at", name = "cc", descriptor = "I")
	private int anInt512 = 0;

	@OriginalMember(owner = "client!at", name = "Qb", descriptor = "I")
	private int anInt502 = 0;

	@OriginalMember(owner = "client!at", name = "Lb", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_6;

	@OriginalMember(owner = "client!at", name = "ab", descriptor = "Lclient!nn;")
	private Class179 aClass179_1;

	@OriginalMember(owner = "client!at", name = "bb", descriptor = "Lclient!nn;")
	private Class179 aClass179_2;

	@OriginalMember(owner = "client!at", name = "ub", descriptor = "Lclient!nn;")
	private Class179 aClass179_3;

	@OriginalMember(owner = "client!at", name = "Eb", descriptor = "Lclient!nn;")
	private Class179 aClass179_4;

	@OriginalMember(owner = "client!at", name = "K", descriptor = "Lclient!nr;")
	private Class181 aClass181_1;

	static {
		new Class158("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
		new Class158("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class17_Sub1(@OriginalArg(0) Class106_Sub2 arg0) {
		this.aClass106_Sub2_6 = arg0;
		this.aClass179_1 = new Class179(null, 5126, 3, 0);
		this.aClass179_2 = new Class179(null, 5126, 2, 0);
		this.aClass179_3 = new Class179(null, 5126, 3, 0);
		this.aClass179_4 = new Class179(null, 5121, 4, 0);
		this.aClass181_1 = new Class181();
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!ih;Lclient!ko;IIII)V")
	public Class17_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) Class147 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt511 = arg5;
		this.aClass106_Sub2_6 = arg0;
		this.anInt477 = arg2;
		if (Static77.method1422(arg2, arg5)) {
			this.aClass179_1 = new Class179(null, 5126, 3, 0);
		}
		if (Static72.method1375(arg2, arg5)) {
			this.aClass179_2 = new Class179(null, 5126, 2, 0);
		}
		if (Static350.method4972(arg2, arg5)) {
			this.aClass179_3 = new Class179(null, 5126, 3, 0);
		}
		if (Static201.method3241(arg5, arg2)) {
			this.aClass179_4 = new Class179(null, 5121, 4, 0);
		}
		if (Static373.method5208(arg2, arg5)) {
			this.aClass181_1 = new Class181();
		}
		@Pc(100) Interface7 local100 = arg0.anInterface7_10;
		@Pc(104) int[] local104 = new int[arg1.anInt4367];
		this.anIntArray27 = new int[arg1.anInt4364 + 1];
		for (@Pc(113) int local113 = 0; local113 < arg1.anInt4367; local113++) {
			if ((arg1.aByteArray46 == null || arg1.aByteArray46[local113] != 2) && (arg1.aShortArray69 == null || arg1.aShortArray69[local113] == -1 || !local100.method78(arg1.aShortArray69[local113] & 0xFFFF).aBoolean275)) {
				local104[this.anInt502++] = local113;
				this.anIntArray27[arg1.aShortArray71[local113]]++;
				this.anIntArray27[arg1.aShortArray75[local113]]++;
				this.anIntArray27[arg1.aShortArray72[local113]]++;
			}
		}
		this.anInt480 = this.anInt502;
		@Pc(203) long[] local203 = new long[this.anInt502];
		@Pc(212) boolean local212 = (this.anInt477 & 0x100) != 0;
		@Pc(223) int local223;
		@Pc(234) int local234;
		@Pc(361) int local361;
		label490: for (@Pc(214) int local214 = 0; local214 < this.anInt502; local214++) {
			@Pc(219) int local219 = local104[local214];
			@Pc(221) Class150 local221 = null;
			local223 = 0;
			@Pc(225) byte local225 = 0;
			@Pc(227) byte local227 = 0;
			@Pc(229) byte local229 = 0;
			if (arg1.aClass237Array1 != null) {
				for (local234 = 0; local234 < arg1.aClass237Array1.length; local234++) {
					@Pc(240) Class237 local240 = arg1.aClass237Array1[local234];
					if (local219 == local240.anInt6899) {
						@Pc(253) Class261 local253 = Static194.method3153(local240.anInt6900);
						if (local253.aBoolean497) {
							local203[local214] = Long.MAX_VALUE;
							this.anInt480--;
							continue label490;
						}
					}
				}
			}
			@Pc(275) short local275 = -1;
			if (arg1.aShortArray69 != null) {
				local275 = arg1.aShortArray69[local219];
				if (local275 != -1) {
					local221 = local100.method78(local275 & 0xFFFF);
					local227 = local221.aByte53;
					local229 = local221.aByte57;
				}
			}
			@Pc(317) boolean local317 = arg1.aByteArray47 != null && arg1.aByteArray47[local219] != 0 || local221 != null && !local221.aBoolean276;
			if ((local212 || local317) && arg1.aByteArray48 != null) {
				local223 += arg1.aByteArray48[local219] << 17;
			}
			if (local317) {
				local223 += 65536;
			}
			local223 += (local227 & 0xFF) << 8;
			local223 += local229 & 0xFF;
			local361 = local225 + ((local275 & 0xFFFF) << 16);
			@Pc(367) int local367 = local361 + (local214 & 0xFFFF);
			local203[local214] = (long) local367 + ((long) local223 << 32);
		}
		Static67.method1309(local104, local203);
		this.anIntArray28 = arg1.anIntArray420;
		this.anInt501 = arg1.anInt4362;
		this.anIntArray30 = arg1.anIntArray415;
		this.anInt512 = arg1.anInt4364;
		this.aShortArray19 = arg1.aShortArray76;
		this.anIntArray29 = arg1.anIntArray421;
		this.aClass114Array1 = arg1.aClass114Array3;
		this.aClass94Array1 = arg1.aClass94Array3;
		@Pc(422) Class240[] local422 = new Class240[this.anInt512];
		@Pc(442) int local442;
		@Pc(455) int local455;
		if (arg1.aClass237Array1 != null) {
			this.anInt510 = arg1.aClass237Array1.length;
			this.aClass62Array1 = new Class62[this.anInt510];
			this.aClass66Array1 = new Class66[this.anInt510];
			for (local442 = 0; local442 < this.anInt510; local442++) {
				@Pc(448) Class237 local448 = arg1.aClass237Array1[local442];
				@Pc(453) Class261 local453 = Static194.method3153(local448.anInt6900);
				local455 = -1;
				for (@Pc(457) int local457 = 0; local457 < this.anInt502; local457++) {
					if (local104[local457] == local448.anInt6899) {
						local455 = local457;
						break;
					}
				}
				if (local455 == -1) {
					throw new RuntimeException();
				}
				local234 = Static404.anIntArray530[arg1.aShortArray67[local448.anInt6899] & 0xFFFF] & 0xFFFFFF;
				local234 |= 255 - (arg1.aByteArray47 == null ? 0 : arg1.aByteArray47[local448.anInt6899]) << 24;
				this.aClass66Array1[local442] = new Class66(local455, arg1.aShortArray71[local448.anInt6899], arg1.aShortArray75[local448.anInt6899], arg1.aShortArray72[local448.anInt6899], local453.anInt7628, local453.anInt7637, local453.anInt7634, local453.anInt7633, local453.anInt7629, local453.aBoolean497, local453.aBoolean498, local448.anInt6894);
				this.aClass62Array1[local442] = new Class62(local234);
			}
		}
		local442 = this.anInt502 * 3;
		this.aShortArray22 = new short[local442];
		this.aShortArray20 = new short[local442];
		this.aShortArray21 = new short[local442];
		this.aShortArray15 = new short[this.anInt502];
		this.aShortArray23 = new short[this.anInt502];
		this.aByteArray7 = new byte[this.anInt502];
		this.aShortArray16 = new short[this.anInt502];
		this.aFloatArray2 = new float[local442];
		this.aShort18 = (short) arg4;
		this.aShortArray17 = new short[this.anInt502];
		this.aShortArray18 = new short[local442];
		this.aFloatArray3 = new float[local442];
		Static418.aLongArray8 = new long[local442];
		if (arg1.aShortArray68 != null) {
			this.aShortArray13 = new short[this.anInt502];
		}
		this.aShort17 = (short) arg3;
		this.aShortArray14 = new short[this.anInt502];
		this.aByteArray8 = new byte[local442];
		local223 = 0;
		for (local361 = 0; local361 < arg1.anInt4364; local361++) {
			local455 = this.anIntArray27[local361];
			this.anIntArray27[local361] = local223;
			local223 += local455;
			local422[local361] = new Class240();
		}
		this.anIntArray27[arg1.anInt4364] = local223;
		@Pc(689) int[] local689 = null;
		@Pc(691) int[] local691 = null;
		@Pc(693) int[] local693 = null;
		@Pc(695) float[][] local695 = null;
		@Pc(721) int local721;
		@Pc(764) int local764;
		@Pc(769) int local769;
		@Pc(783) int local783;
		@Pc(785) int local785;
		@Pc(818) int local818;
		@Pc(823) int local823;
		@Pc(974) float local974;
		@Pc(966) float local966;
		@Pc(982) float local982;
		if (arg1.aByteArray45 != null) {
			@Pc(701) int local701 = arg1.anInt4361;
			@Pc(704) int[] local704 = new int[local701];
			@Pc(707) int[] local707 = new int[local701];
			@Pc(710) int[] local710 = new int[local701];
			@Pc(713) int[] local713 = new int[local701];
			@Pc(716) int[] local716 = new int[local701];
			@Pc(719) int[] local719 = new int[local701];
			for (local721 = 0; local721 < local701; local721++) {
				local704[local721] = Integer.MAX_VALUE;
				local707[local721] = -2147483647;
				local710[local721] = Integer.MAX_VALUE;
				local713[local721] = -2147483647;
				local716[local721] = Integer.MAX_VALUE;
				local719[local721] = -2147483647;
			}
			local695 = new float[local701][];
			local693 = new int[local701];
			local691 = new int[local701];
			local689 = new int[local701];
			for (local764 = 0; local764 < this.anInt502; local764++) {
				local769 = local104[local764];
				if (arg1.aByteArray45[local769] != -1) {
					local783 = arg1.aByteArray45[local769] & 0xFF;
					for (local785 = 0; local785 < 3; local785++) {
						@Pc(801) short local801;
						if (local785 == 0) {
							local801 = arg1.aShortArray71[local769];
						} else if (local785 == 1) {
							local801 = arg1.aShortArray75[local769];
						} else {
							local801 = arg1.aShortArray72[local769];
						}
						local818 = arg1.anIntArray421[local801];
						local823 = arg1.anIntArray415[local801];
						@Pc(828) int local828 = arg1.anIntArray420[local801];
						if (local818 < local704[local783]) {
							local704[local783] = local818;
						}
						if (local818 > local707[local783]) {
							local707[local783] = local818;
						}
						if (local823 < local710[local783]) {
							local710[local783] = local823;
						}
						if (local823 > local713[local783]) {
							local713[local783] = local823;
						}
						if (local828 < local716[local783]) {
							local716[local783] = local828;
						}
						if (local719[local783] < local828) {
							local719[local783] = local828;
						}
					}
				}
			}
			for (local769 = 0; local769 < local701; local769++) {
				@Pc(909) byte local909 = arg1.aByteArray51[local769];
				if (local909 > 0) {
					local689[local769] = (local704[local769] + local707[local769]) / 2;
					local691[local769] = (local710[local769] + local713[local769]) / 2;
					local693[local769] = (local716[local769] + local719[local769]) / 2;
					if (local909 == 1) {
						local823 = arg1.anIntArray419[local769];
						local966 = 64.0F / (float) arg1.anIntArray417[local769];
						if (local823 == 0) {
							local974 = 1.0F;
							local982 = 1.0F;
						} else if (local823 <= 0) {
							local982 = 1.0F;
							local974 = (float) -local823 / 1024.0F;
						} else {
							local982 = (float) local823 / 1024.0F;
							local974 = 1.0F;
						}
					} else if (local909 == 2) {
						local966 = 64.0F / (float) arg1.anIntArray417[local769];
						local974 = 64.0F / (float) arg1.anIntArray419[local769];
						local982 = 64.0F / (float) arg1.anIntArray413[local769];
					} else {
						local966 = (float) arg1.anIntArray417[local769] / 1024.0F;
						local974 = (float) arg1.anIntArray419[local769] / 1024.0F;
						local982 = (float) arg1.anIntArray413[local769] / 1024.0F;
					}
					local695[local769] = Static199.method3189(arg1.aShortArray73[local769], local974, local966, arg1.aShortArray74[local769], local982, arg1.aByteArray49[local769] & 0xFF, arg1.aShortArray70[local769]);
				}
			}
		}
		@Pc(1086) Class144[] local1086 = new Class144[arg1.anInt4367];
		@Pc(1104) short local1104;
		@Pc(1115) int local1115;
		@Pc(1125) int local1125;
		@Pc(1186) int local1186;
		for (@Pc(1088) int local1088 = 0; local1088 < arg1.anInt4367; local1088++) {
			@Pc(1094) short local1094 = arg1.aShortArray71[local1088];
			@Pc(1099) short local1099 = arg1.aShortArray75[local1088];
			local1104 = arg1.aShortArray72[local1088];
			local1115 = this.anIntArray29[local1099] - this.anIntArray29[local1094];
			local1125 = this.anIntArray30[local1099] - this.anIntArray30[local1094];
			local721 = this.anIntArray28[local1099] - this.anIntArray28[local1094];
			local764 = this.anIntArray29[local1104] - this.anIntArray29[local1094];
			local769 = this.anIntArray30[local1104] - this.anIntArray30[local1094];
			local783 = this.anIntArray28[local1104] - this.anIntArray28[local1094];
			local785 = local1125 * local783 - local769 * local721;
			local1186 = local721 * local764 - local1115 * local783;
			for (local818 = local769 * local1115 - local1125 * local764; local785 > 8192 || local1186 > 8192 || local818 > 8192 || local785 < -8192 || local1186 < -8192 || local818 < -8192; local818 >>= 0x1) {
				local785 >>= 0x1;
				local1186 >>= 0x1;
			}
			local823 = (int) Math.sqrt((double) (local818 * local818 + local1186 * local1186 + local785 * local785));
			if (local823 <= 0) {
				local823 = 1;
			}
			local1186 = local1186 * 256 / local823;
			local818 = local818 * 256 / local823;
			local785 = local785 * 256 / local823;
			@Pc(1281) byte local1281 = arg1.aByteArray46 == null ? 0 : arg1.aByteArray46[local1088];
			if (local1281 == 0) {
				@Pc(1287) Class240 local1287 = local422[local1094];
				local1287.anInt7110 += local1186;
				local1287.anInt7111 += local818;
				local1287.anInt7112++;
				local1287.anInt7114 += local785;
				@Pc(1315) Class240 local1315 = local422[local1099];
				local1315.anInt7114 += local785;
				local1315.anInt7112++;
				local1315.anInt7110 += local1186;
				local1315.anInt7111 += local818;
				@Pc(1343) Class240 local1343 = local422[local1104];
				local1343.anInt7110 += local1186;
				local1343.anInt7114 += local785;
				local1343.anInt7111 += local818;
				local1343.anInt7112++;
			} else if (local1281 == 1) {
				@Pc(1381) Class144 local1381 = local1086[local1088] = new Class144();
				local1381.anInt4292 = local818;
				local1381.anInt4291 = local785;
				local1381.anInt4288 = local1186;
			}
		}
		@Pc(1406) int local1406;
		for (@Pc(1401) int local1401 = 0; local1401 < this.anInt502; local1401++) {
			local1406 = local104[local1401];
			@Pc(1413) int local1413 = arg1.aShortArray67[local1406] & 0xFFFF;
			@Pc(1418) short local1418;
			if (arg1.aShortArray69 == null) {
				local1418 = -1;
			} else {
				local1418 = arg1.aShortArray69[local1406];
			}
			if (arg1.aByteArray45 == null) {
				local1125 = -1;
			} else {
				local1125 = arg1.aByteArray45[local1406];
			}
			if (arg1.aByteArray47 == null) {
				local721 = 0;
			} else {
				local721 = arg1.aByteArray47[local1406] & 0xFF;
			}
			@Pc(1450) float local1450 = 0.0F;
			@Pc(1452) float local1452 = 0.0F;
			@Pc(1454) float local1454 = 0.0F;
			local974 = 0.0F;
			local966 = 0.0F;
			local982 = 0.0F;
			@Pc(1462) byte local1462 = 0;
			@Pc(1464) byte local1464 = 0;
			@Pc(1466) int local1466 = 0;
			@Pc(1499) byte local1499;
			@Pc(1516) short local1516;
			@Pc(2247) short local2247;
			@Pc(2252) short local2252;
			if (local1418 != -1) {
				if (local1125 == -1) {
					local1464 = 2;
					local974 = 1.0F;
					local1454 = 1.0F;
					local1452 = 1.0F;
					local1450 = 0.0F;
					local1462 = 1;
					local982 = 0.0F;
					local966 = 0.0F;
				} else {
					local1125 &= 0xFF;
					local1499 = arg1.aByteArray51[local1125];
					@Pc(1506) short local1506;
					@Pc(1511) short local1511;
					@Pc(1545) float local1545;
					@Pc(1558) float local1558;
					@Pc(1637) float local1637;
					@Pc(2054) float local2054;
					@Pc(2062) float local2062;
					@Pc(2070) float local2070;
					@Pc(2093) float local2093;
					@Pc(2116) float local2116;
					@Pc(2139) float local2139;
					if (local1499 == 0) {
						local1506 = arg1.aShortArray71[local1406];
						local1511 = arg1.aShortArray75[local1406];
						local1516 = arg1.aShortArray72[local1406];
						local2247 = arg1.aShortArray74[local1125];
						local2252 = arg1.aShortArray73[local1125];
						@Pc(2257) short local2257 = arg1.aShortArray70[local1125];
						@Pc(2263) float local2263 = (float) arg1.anIntArray421[local2247];
						@Pc(2269) float local2269 = (float) arg1.anIntArray415[local2247];
						local1545 = arg1.anIntArray420[local2247];
						local1558 = (float) arg1.anIntArray421[local2252] - local2263;
						local1637 = (float) arg1.anIntArray415[local2252] - local2269;
						@Pc(2300) float local2300 = (float) arg1.anIntArray420[local2252] - local1545;
						@Pc(2308) float local2308 = (float) arg1.anIntArray421[local2257] - local2263;
						@Pc(2317) float local2317 = (float) arg1.anIntArray415[local2257] - local2269;
						@Pc(2326) float local2326 = (float) arg1.anIntArray420[local2257] - local1545;
						@Pc(2335) float local2335 = (float) arg1.anIntArray421[local1506] - local2263;
						@Pc(2344) float local2344 = (float) arg1.anIntArray415[local1506] - local2269;
						@Pc(2352) float local2352 = (float) arg1.anIntArray420[local1506] - local1545;
						@Pc(2360) float local2360 = (float) arg1.anIntArray421[local1511] - local2263;
						@Pc(2369) float local2369 = (float) arg1.anIntArray415[local1511] - local2269;
						local2054 = (float) arg1.anIntArray420[local1511] - local1545;
						local2062 = (float) arg1.anIntArray421[local1516] - local2263;
						local2070 = (float) arg1.anIntArray415[local1516] - local2269;
						local2093 = (float) arg1.anIntArray420[local1516] - local1545;
						local2116 = local1637 * local2326 - local2300 * local2317;
						local2139 = local2300 * local2308 - local2326 * local1558;
						@Pc(2429) float local2429 = local1558 * local2317 - local1637 * local2308;
						@Pc(2437) float local2437 = local2317 * local2429 - local2139 * local2326;
						@Pc(2445) float local2445 = local2326 * local2116 - local2429 * local2308;
						@Pc(2454) float local2454 = local2139 * local2308 - local2116 * local2317;
						@Pc(2468) float local2468 = 1.0F / (local2454 * local2300 + local2445 * local1637 + local2437 * local1558);
						local966 = (local2454 * local2093 + local2070 * local2445 + local2062 * local2437) * local2468;
						local1450 = local2468 * (local2454 * local2352 + local2344 * local2445 + local2335 * local2437);
						local1454 = (local2369 * local2445 + local2360 * local2437 + local2454 * local2054) * local2468;
						@Pc(2519) float local2519 = local2139 * local1558 - local1637 * local2116;
						@Pc(2527) float local2527 = local2116 * local2300 - local1558 * local2429;
						@Pc(2535) float local2535 = local2429 * local1637 - local2139 * local2300;
						@Pc(2549) float local2549 = 1.0F / (local2519 * local2326 + local2317 * local2527 + local2535 * local2308);
						local1452 = (local2335 * local2535 + local2527 * local2344 + local2519 * local2352) * local2549;
						local982 = local2549 * (local2527 * local2070 + local2062 * local2535 + local2093 * local2519);
						local974 = local2549 * (local2519 * local2054 + local2360 * local2535 + local2369 * local2527);
					} else {
						local1506 = arg1.aShortArray71[local1406];
						local1511 = arg1.aShortArray75[local1406];
						local1516 = arg1.aShortArray72[local1406];
						@Pc(1520) int local1520 = local689[local1125];
						@Pc(1524) int local1524 = local691[local1125];
						@Pc(1528) int local1528 = local693[local1125];
						@Pc(1532) float[] local1532 = local695[local1125];
						@Pc(1537) byte local1537 = arg1.aByteArray50[local1125];
						local1545 = (float) arg1.anIntArray414[local1125] / 256.0F;
						if (local1499 == 1) {
							local1558 = (float) arg1.anIntArray413[local1125] / 1024.0F;
							Static182.method3056(arg1.anIntArray415[local1506], local1520, local1528, local1558, local1524, local1532, arg1.anIntArray421[local1506], arg1.anIntArray420[local1506], local1537, local1545);
							local1452 = Static426.aFloat10;
							local1450 = Static145.aFloat26;
							Static182.method3056(arg1.anIntArray415[local1511], local1520, local1528, local1558, local1524, local1532, arg1.anIntArray421[local1511], arg1.anIntArray420[local1511], local1537, local1545);
							local1454 = Static145.aFloat26;
							local974 = Static426.aFloat10;
							Static182.method3056(arg1.anIntArray415[local1516], local1520, local1528, local1558, local1524, local1532, arg1.anIntArray421[local1516], arg1.anIntArray420[local1516], local1537, local1545);
							local966 = Static145.aFloat26;
							local982 = Static426.aFloat10;
							local1637 = local1558 / 2.0F;
							if ((local1537 & 0x1) == 0) {
								if (local1454 - local1450 > local1637) {
									local1462 = 1;
									local1454 -= local1558;
								} else if (local1450 - local1454 > local1637) {
									local1454 += local1558;
									local1462 = 2;
								}
								if (local966 - local1450 > local1637) {
									local966 -= local1558;
									local1464 = 1;
								} else if (local1637 < local1450 - local966) {
									local1464 = 2;
									local966 += local1558;
								}
							} else {
								if (local982 - local1452 > local1637) {
									local982 -= local1558;
									local1464 = 1;
								} else if (local1637 < local1452 - local982) {
									local982 += local1558;
									local1464 = 2;
								}
								if (local974 - local1452 > local1637) {
									local1462 = 1;
									local974 -= local1558;
								} else if (local1637 < local1452 - local974) {
									local974 += local1558;
									local1462 = 2;
								}
							}
						} else if (local1499 == 2) {
							local1558 = (float) arg1.anIntArray412[local1125] / 256.0F;
							local1637 = (float) arg1.anIntArray422[local1125] / 256.0F;
							@Pc(1966) int local1966 = arg1.anIntArray421[local1511] - arg1.anIntArray421[local1506];
							@Pc(1977) int local1977 = arg1.anIntArray415[local1511] - arg1.anIntArray415[local1506];
							@Pc(1988) int local1988 = arg1.anIntArray420[local1511] - arg1.anIntArray420[local1506];
							@Pc(1998) int local1998 = arg1.anIntArray421[local1516] - arg1.anIntArray421[local1506];
							@Pc(2008) int local2008 = arg1.anIntArray415[local1516] - arg1.anIntArray415[local1506];
							@Pc(2019) int local2019 = arg1.anIntArray420[local1516] - arg1.anIntArray420[local1506];
							@Pc(2028) int local2028 = local1977 * local2019 - local2008 * local1988;
							@Pc(2037) int local2037 = local1998 * local1988 - local1966 * local2019;
							@Pc(2046) int local2046 = local1966 * local2008 - local1977 * local1998;
							local2054 = 64.0F / (float) arg1.anIntArray419[local1125];
							local2062 = 64.0F / (float) arg1.anIntArray417[local1125];
							local2070 = 64.0F / (float) arg1.anIntArray413[local1125];
							local2093 = (local1532[2] * (float) local2046 + (float) local2037 * local1532[1] + local1532[0] * (float) local2028) / local2054;
							local2116 = ((float) local2046 * local1532[5] + (float) local2028 * local1532[3] + local1532[4] * (float) local2037) / local2062;
							local2139 = ((float) local2046 * local1532[8] + local1532[6] * (float) local2028 + (float) local2037 * local1532[7]) / local2070;
							local1466 = Static28.method562(local2093, local2139, local2116);
							Static331.method4673(local1528, local1637, local1532, arg1.anIntArray421[local1506], arg1.anIntArray420[local1506], local1558, local1466, local1537, arg1.anIntArray415[local1506], local1520, local1545, local1524);
							local1450 = Static361.aFloat94;
							local1452 = Static387.aFloat100;
							Static331.method4673(local1528, local1637, local1532, arg1.anIntArray421[local1511], arg1.anIntArray420[local1511], local1558, local1466, local1537, arg1.anIntArray415[local1511], local1520, local1545, local1524);
							local1454 = Static361.aFloat94;
							local974 = Static387.aFloat100;
							Static331.method4673(local1528, local1637, local1532, arg1.anIntArray421[local1516], arg1.anIntArray420[local1516], local1558, local1466, local1537, arg1.anIntArray415[local1516], local1520, local1545, local1524);
							local966 = Static361.aFloat94;
							local982 = Static387.aFloat100;
						} else if (local1499 == 3) {
							Static104.method1749(arg1.anIntArray415[local1506], local1528, local1532, local1537, arg1.anIntArray421[local1506], arg1.anIntArray420[local1506], local1520, local1545, local1524);
							local1452 = Static156.aFloat32;
							local1450 = Static15.aFloat2;
							Static104.method1749(arg1.anIntArray415[local1511], local1528, local1532, local1537, arg1.anIntArray421[local1511], arg1.anIntArray420[local1511], local1520, local1545, local1524);
							local974 = Static156.aFloat32;
							local1454 = Static15.aFloat2;
							Static104.method1749(arg1.anIntArray415[local1516], local1528, local1532, local1537, arg1.anIntArray421[local1516], arg1.anIntArray420[local1516], local1520, local1545, local1524);
							local982 = Static156.aFloat32;
							local966 = Static15.aFloat2;
							if ((local1537 & 0x1) == 0) {
								if (local1454 - local1450 > 0.5F) {
									local1462 = 1;
									local1454--;
								} else if (local1450 - local1454 > 0.5F) {
									local1454++;
									local1462 = 2;
								}
								if (local966 - local1450 > 0.5F) {
									local1464 = 1;
									local966--;
								} else if (local1450 - local966 > 0.5F) {
									local966++;
									local1464 = 2;
								}
							} else {
								if (local974 - local1452 > 0.5F) {
									local1462 = 1;
									local974--;
								} else if (local1452 - local974 > 0.5F) {
									local974++;
									local1462 = 2;
								}
								if (local982 - local1452 > 0.5F) {
									local1464 = 1;
									local982--;
								} else if (local1452 - local982 > 0.5F) {
									local982++;
									local1464 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray46 == null) {
				local1499 = 0;
			} else {
				local1499 = arg1.aByteArray46[local1406];
			}
			if (local1499 == 0) {
				@Pc(2628) long local2628 = (long) (local1125 << 2) + ((long) local721 + (long) (local1466 << 24) + (long) (local1413 << 8) << 32);
				local1516 = arg1.aShortArray71[local1406];
				local2247 = arg1.aShortArray75[local1406];
				local2252 = arg1.aShortArray72[local1406];
				@Pc(2647) Class240 local2647 = local422[local1516];
				this.aShortArray14[local1401] = this.method411(local2628, local2647.anInt7111, local2647.anInt7112, local1450, local1452, local1516, local2647.anInt7110, local2647.anInt7114, arg1);
				@Pc(2671) Class240 local2671 = local422[local2247];
				this.aShortArray23[local1401] = this.method411(local2628 + (long) local1462, local2671.anInt7111, local2671.anInt7112, local1454, local974, local2247, local2671.anInt7110, local2671.anInt7114, arg1);
				@Pc(2698) Class240 local2698 = local422[local2252];
				this.aShortArray17[local1401] = this.method411((long) local1464 + local2628, local2698.anInt7111, local2698.anInt7112, local966, local982, local2252, local2698.anInt7110, local2698.anInt7114, arg1);
			} else if (local1499 == 1) {
				@Pc(2731) Class144 local2731 = local1086[local1406];
				@Pc(2776) long local2776 = (long) ((local2731.anInt4288 + 256 << 12) + (local2731.anInt4291 <= 0 ? 2048 : 1024) + (local1125 << 2) + (local2731.anInt4292 + 256 << 22)) + ((long) local721 + (long) (local1413 << 8) + (long) (local1466 << 24) << 32);
				this.aShortArray14[local1401] = this.method411(local2776, local2731.anInt4292, 0, local1450, local1452, arg1.aShortArray71[local1406], local2731.anInt4288, local2731.anInt4291, arg1);
				this.aShortArray23[local1401] = this.method411(local2776 + (long) local1462, local2731.anInt4292, 0, local1454, local974, arg1.aShortArray75[local1406], local2731.anInt4288, local2731.anInt4291, arg1);
				this.aShortArray17[local1401] = this.method411(local2776 + (long) local1464, local2731.anInt4292, 0, local966, local982, arg1.aShortArray72[local1406], local2731.anInt4288, local2731.anInt4291, arg1);
			}
			if (arg1.aShortArray69 == null) {
				this.aShortArray15[local1401] = -1;
			} else {
				this.aShortArray15[local1401] = arg1.aShortArray69[local1406];
			}
			if (arg1.aByteArray47 != null) {
				this.aByteArray7[local1401] = arg1.aByteArray47[local1406];
			}
			if (arg1.aShortArray68 != null) {
				this.aShortArray13[local1401] = arg1.aShortArray68[local1406];
			}
			this.aShortArray16[local1401] = arg1.aShortArray67[local1406];
		}
		local1406 = 0;
		local1104 = -10000;
		for (local1115 = 0; local1115 < this.anInt480; local1115++) {
			@Pc(2916) short local2916 = this.aShortArray15[local1115];
			if (local2916 != local1104) {
				local1104 = local2916;
				local1406++;
			}
		}
		this.anIntArray31 = new int[local1406 + 1];
		local1104 = -10000;
		local1406 = 0;
		for (local1125 = 0; local1125 < this.anInt480; local1125++) {
			@Pc(2949) short local2949 = this.aShortArray15[local1125];
			if (local1104 != local2949) {
				local1104 = local2949;
				this.anIntArray31[local1406++] = local1125;
			}
		}
		this.anIntArray31[local1406] = this.anInt480;
		Static418.aLongArray8 = null;
		this.aShortArray21 = Static49.method922(this.anInt472, this.aShortArray21);
		this.aShortArray18 = Static49.method922(this.anInt472, this.aShortArray18);
		this.aShortArray22 = Static49.method922(this.anInt472, this.aShortArray22);
		this.aByteArray8 = Static319.method1369(this.anInt472, this.aByteArray8);
		this.aFloatArray2 = Static212.method3355(this.aFloatArray2, this.anInt472);
		this.aFloatArray3 = Static212.method3355(this.aFloatArray3, this.anInt472);
		if (arg1.anIntArray416 != null && Static191.method3102(this.anInt511, arg2)) {
			this.anIntArrayArray7 = arg1.method3371();
		}
		if (arg1.aClass237Array1 != null && Static435.method5860(this.anInt511, arg2)) {
			this.anIntArrayArray8 = arg1.method3373();
		}
		if (arg1.anIntArray418 != null && Static445.method5852(this.anInt511, arg2)) {
			local721 = 0;
			@Pc(3067) int[] local3067 = new int[256];
			for (local769 = 0; local769 < this.anInt502; local769++) {
				local783 = arg1.anIntArray418[local104[local769]];
				if (local783 >= 0) {
					if (local783 > local721) {
						local721 = local783;
					}
					@Pc(3095) int local3095 = local3067[local783]++;
				}
			}
			this.anIntArrayArray6 = new int[local721 + 1][];
			for (local783 = 0; local783 <= local721; local783++) {
				this.anIntArrayArray6[local783] = new int[local3067[local783]];
				local3067[local783] = 0;
			}
			for (local785 = 0; local785 < this.anInt502; local785++) {
				local1186 = arg1.anIntArray418[local104[local785]];
				if (local1186 >= 0) {
					this.anIntArrayArray6[local1186][local3067[local1186]++] = local785;
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!kp;I)V")
	private void method409(@OriginalArg(0) Class1_Sub1_Sub10_Sub1 arg0) {
		if (this.aClass106_Sub2_6.anIntArray362.length < this.anInt472) {
			this.aClass106_Sub2_6.anIntArray362 = new int[this.anInt472];
			this.aClass106_Sub2_6.anIntArray363 = new int[this.anInt472];
		}
		@Pc(32) int[] local32 = this.aClass106_Sub2_6.anIntArray362;
		@Pc(36) int[] local36 = this.aClass106_Sub2_6.anIntArray363;
		@Pc(65) int local65;
		@Pc(103) int local103;
		@Pc(112) int local112;
		for (@Pc(38) int local38 = 0; local38 < this.anInt512; local38++) {
			local65 = (this.anIntArray29[local38] - (this.anIntArray30[local38] * this.aClass106_Sub2_6.anInt3766 >> 8) >> this.aClass106_Sub2_6.anInt3734) - arg0.anInt4397;
			@Pc(89) int local89 = (this.anIntArray28[local38] - (this.aClass106_Sub2_6.anInt3754 * this.anIntArray30[local38] >> 8) >> this.aClass106_Sub2_6.anInt3734) - arg0.anInt4402;
			@Pc(94) int local94 = this.anIntArray27[local38];
			@Pc(101) int local101 = this.anIntArray27[local38 + 1];
			for (local103 = local94; local103 < local101; local103++) {
				local112 = this.aShortArray20[local103] - 1;
				if (local112 == -1) {
					break;
				}
				local32[local112] = local65;
				local36[local112] = local89;
			}
		}
		for (local65 = 0; local65 < this.anInt480; local65++) {
			if (this.aByteArray7 == null || this.aByteArray7[local65] <= 128) {
				@Pc(160) short local160 = this.aShortArray14[local65];
				@Pc(165) short local165 = this.aShortArray23[local65];
				@Pc(170) short local170 = this.aShortArray17[local65];
				local103 = local32[local160];
				local112 = local32[local165];
				@Pc(182) int local182 = local32[local170];
				@Pc(186) int local186 = local36[local160];
				@Pc(190) int local190 = local36[local165];
				@Pc(194) int local194 = local36[local170];
				if (-((local182 - local112) * (local190 + -local186)) + (local190 - local194) * (-local112 + local103) > 0) {
					arg0.method3405(local112, local182, local103, local194, local190, local186);
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "B", descriptor = "()I")
	@Override
	public int B() {
		if (!this.aBoolean16) {
			this.method413();
		}
		return this.aShort19;
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "()[Lclient!hv;")
	@Override
	public Class114[] method6205() {
		return this.aClass114Array1;
	}

	@OriginalMember(owner = "client!at", name = "q", descriptor = "(SS)V")
	@Override
	public void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt502; local7++) {
			if (this.aShortArray16[local7] == arg0) {
				this.aShortArray16[local7] = arg1;
			}
		}
		if (this.aClass66Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt510; local30++) {
				@Pc(37) Class66 local37 = this.aClass66Array1[local30];
				@Pc(42) Class62 local42 = this.aClass62Array1[local30];
				local42.anInt2036 = Static404.anIntArray530[this.aShortArray16[local37.anInt2088] & 0xFFFF] & 0xFFFFFF | local42.anInt2036 & 0xFF000000;
			}
		}
		if (this.aClass179_4 != null) {
			this.aClass179_4.anInterface3_7 = null;
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "()Z")
	@Override
	public boolean method6200() {
		if (this.aShortArray15 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray15.length; local12++) {
			if (this.aShortArray15[local12] != -1 && !this.aClass106_Sub2_6.anInterface7_10.method77(this.aShortArray15[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!at", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt512; local7++) {
			this.anIntArray28[local7] = -this.anIntArray28[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt472; local25++) {
			this.aShortArray22[local25] = (short) -this.aShortArray22[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt502; local44++) {
			@Pc(51) short local51 = this.aShortArray14[local44];
			this.aShortArray14[local44] = this.aShortArray17[local44];
			this.aShortArray17[local44] = local51;
		}
		if (this.aClass179_3 == null && this.aClass179_4 != null) {
			this.aClass179_4.anInterface3_7 = null;
		}
		if (this.aClass179_3 != null) {
			this.aClass179_3.anInterface3_7 = null;
		}
		if (this.aClass179_1 != null) {
			this.aClass179_1.anInterface3_7 = null;
		}
		if (this.aClass181_1 != null) {
			this.aClass181_1.anInterface10_5 = null;
		}
		this.aBoolean16 = false;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BLclient!nb;)V")
	private void method410(@OriginalArg(1) Class40_Sub2 arg0) {
		if (this.aClass94Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass94Array1.length; local10++) {
				@Pc(17) Class94 local17 = this.aClass94Array1[local10];
				@Pc(19) Class94 local19 = local17;
				if (local17.aClass94_1 != null) {
					local19 = local17.aClass94_1;
				}
				local19.anInt2939 = (int) (arg0.aFloat78 + arg0.aFloat71 * (float) this.anIntArray30[local17.anInt2952] + arg0.aFloat72 * (float) this.anIntArray29[local17.anInt2952] + arg0.aFloat77 * (float) this.anIntArray28[local17.anInt2952]);
				local19.anInt2950 = (int) (arg0.aFloat80 + (float) this.anIntArray29[local17.anInt2952] * arg0.aFloat76 + (float) this.anIntArray30[local17.anInt2952] * arg0.aFloat82 + arg0.aFloat73 * (float) this.anIntArray28[local17.anInt2952]);
				local19.anInt2934 = (int) (arg0.aFloat74 * (float) this.anIntArray29[local17.anInt2952] + (float) this.anIntArray30[local17.anInt2952] * arg0.aFloat81 + (float) this.anIntArray28[local17.anInt2952] * arg0.aFloat79 + arg0.aFloat75);
				local19.anInt2943 = (int) ((float) this.anIntArray28[local17.anInt2936] * arg0.aFloat77 + (float) this.anIntArray29[local17.anInt2936] * arg0.aFloat72 + (float) this.anIntArray30[local17.anInt2936] * arg0.aFloat71 + arg0.aFloat78);
				local19.anInt2949 = (int) (arg0.aFloat80 + arg0.aFloat82 * (float) this.anIntArray30[local17.anInt2936] + arg0.aFloat76 * (float) this.anIntArray29[local17.anInt2936] + (float) this.anIntArray28[local17.anInt2936] * arg0.aFloat73);
				local19.anInt2947 = (int) ((float) this.anIntArray30[local17.anInt2936] * arg0.aFloat81 + (float) this.anIntArray29[local17.anInt2936] * arg0.aFloat74 + arg0.aFloat79 * (float) this.anIntArray28[local17.anInt2936] + arg0.aFloat75);
				local19.anInt2938 = (int) ((float) this.anIntArray28[local17.anInt2942] * arg0.aFloat77 + arg0.aFloat72 * (float) this.anIntArray29[local17.anInt2942] + (float) this.anIntArray30[local17.anInt2942] * arg0.aFloat71 + arg0.aFloat78);
				local19.anInt2940 = (int) (arg0.aFloat80 + arg0.aFloat73 * (float) this.anIntArray28[local17.anInt2942] + arg0.aFloat82 * (float) this.anIntArray30[local17.anInt2942] + (float) this.anIntArray29[local17.anInt2942] * arg0.aFloat76);
				local19.anInt2951 = (int) ((float) this.anIntArray30[local17.anInt2942] * arg0.aFloat81 + (float) this.anIntArray29[local17.anInt2942] * arg0.aFloat74 + arg0.aFloat79 * (float) this.anIntArray28[local17.anInt2942] + arg0.aFloat75);
			}
		}
		if (this.aClass114Array1 == null) {
			return;
		}
		for (@Pc(363) int local363 = 0; local363 < this.aClass114Array1.length; local363++) {
			@Pc(370) Class114 local370 = this.aClass114Array1[local363];
			@Pc(372) Class114 local372 = local370;
			if (local370.aClass114_2 != null) {
				local372 = local370.aClass114_2;
			}
			if (local370.aClass40_2 == null) {
				local370.aClass40_2 = arg0.method4576();
			} else {
				local370.aClass40_2.ha(arg0);
			}
			local372.anInt3457 = (int) (arg0.aFloat78 + (float) this.anIntArray28[local370.anInt3455] * arg0.aFloat77 + (float) this.anIntArray30[local370.anInt3455] * arg0.aFloat71 + arg0.aFloat72 * (float) this.anIntArray29[local370.anInt3455]);
			local372.anInt3459 = (int) ((float) this.anIntArray29[local370.anInt3455] * arg0.aFloat76 + arg0.aFloat82 * (float) this.anIntArray30[local370.anInt3455] + arg0.aFloat73 * (float) this.anIntArray28[local370.anInt3455] + arg0.aFloat80);
			local372.anInt3461 = (int) ((float) this.anIntArray30[local370.anInt3455] * arg0.aFloat81 + (float) this.anIntArray29[local370.anInt3455] * arg0.aFloat74 + (float) this.anIntArray28[local370.anInt3455] * arg0.aFloat79 + arg0.aFloat75);
		}
	}

	@OriginalMember(owner = "client!at", name = "va", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg4 << 4;
			local22 = arg3 << 4;
			Static181.anInt3934 = 0;
			local26 = 0;
			Static311.anInt5835 = 0;
			Static48.anInt1180 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray7.length > local38) {
					local48 = this.anIntArrayArray7[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static311.anInt5835 += this.anIntArray29[local56];
						Static48.anInt1180 += this.anIntArray30[local56];
						local26++;
						Static181.anInt3934 += this.anIntArray28[local56];
					}
				}
			}
			if (local26 <= 0) {
				Static181.anInt3934 = local18;
				Static311.anInt5835 = local14;
				Static48.anInt1180 = local22;
			} else {
				Static48.anInt1180 = Static48.anInt1180 / local26 + local22;
				Static311.anInt5835 = local14 + Static311.anInt5835 / local26;
				Static181.anInt3934 = Static181.anInt3934 / local26 + local18;
			}
			return;
		}
		@Pc(154) int[] local154;
		@Pc(156) int local156;
		if (arg0 == 1) {
			local22 = arg3 << 4;
			local14 = arg2 << 4;
			local18 = arg4 << 4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray7.length > local32) {
					local154 = this.anIntArrayArray7[local32];
					for (local156 = 0; local156 < local154.length; local156++) {
						local50 = local154[local156];
						this.anIntArray29[local50] += local14;
						this.anIntArray30[local50] += local22;
						this.anIntArray28[local50] += local18;
					}
				}
			}
			return;
		}
		@Pc(270) int local270;
		@Pc(288) int local288;
		@Pc(741) int local741;
		if (arg0 == 2) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray7.length > local32) {
					local154 = this.anIntArrayArray7[local32];
					if ((arg5 & 0x1) == 0) {
						for (local156 = 0; local156 < local154.length; local156++) {
							local50 = local154[local156];
							this.anIntArray29[local50] -= Static311.anInt5835;
							this.anIntArray30[local50] -= Static48.anInt1180;
							this.anIntArray28[local50] -= Static181.anInt3934;
							if (arg4 != 0) {
								local56 = Class90_Sub1.anIntArray304[arg4];
								local270 = Class90_Sub1.anIntArray303[arg4];
								local288 = local56 * this.anIntArray30[local50] + local270 * this.anIntArray29[local50] + 32767 >> 15;
								this.anIntArray30[local50] = local270 * this.anIntArray30[local50] + 32767 - this.anIntArray29[local50] * local56 >> 15;
								this.anIntArray29[local50] = local288;
							}
							if (arg2 != 0) {
								local56 = Class90_Sub1.anIntArray304[arg2];
								local270 = Class90_Sub1.anIntArray303[arg2];
								local288 = local270 * this.anIntArray30[local50] + 32767 - local56 * this.anIntArray28[local50] >> 15;
								this.anIntArray28[local50] = local270 * this.anIntArray28[local50] + local56 * this.anIntArray30[local50] + 32767 >> 15;
								this.anIntArray30[local50] = local288;
							}
							if (arg3 != 0) {
								local56 = Class90_Sub1.anIntArray304[arg3];
								local270 = Class90_Sub1.anIntArray303[arg3];
								local288 = local56 * this.anIntArray28[local50] + local270 * this.anIntArray29[local50] + 32767 >> 15;
								this.anIntArray28[local50] = local270 * this.anIntArray28[local50] + 32767 - local56 * this.anIntArray29[local50] >> 15;
								this.anIntArray29[local50] = local288;
							}
							this.anIntArray29[local50] += Static311.anInt5835;
							this.anIntArray30[local50] += Static48.anInt1180;
							this.anIntArray28[local50] += Static181.anInt3934;
						}
					} else {
						for (local156 = 0; local156 < local154.length; local156++) {
							local50 = local154[local156];
							this.anIntArray29[local50] -= Static311.anInt5835;
							this.anIntArray30[local50] -= Static48.anInt1180;
							this.anIntArray28[local50] -= Static181.anInt3934;
							if (arg2 != 0) {
								local56 = Class90_Sub1.anIntArray304[arg2];
								local270 = Class90_Sub1.anIntArray303[arg2];
								local288 = local270 * this.anIntArray30[local50] + 32767 - this.anIntArray28[local50] * local56 >> 15;
								this.anIntArray28[local50] = this.anIntArray30[local50] * local56 + local270 * this.anIntArray28[local50] + 32767 >> 15;
								this.anIntArray30[local50] = local288;
							}
							if (arg4 != 0) {
								local56 = Class90_Sub1.anIntArray304[arg4];
								local270 = Class90_Sub1.anIntArray303[arg4];
								local288 = local270 * this.anIntArray29[local50] + this.anIntArray30[local50] * local56 + 32767 >> 15;
								this.anIntArray30[local50] = local270 * this.anIntArray30[local50] + 32767 - this.anIntArray29[local50] * local56 >> 15;
								this.anIntArray29[local50] = local288;
							}
							if (arg3 != 0) {
								local56 = Class90_Sub1.anIntArray304[arg3];
								local270 = Class90_Sub1.anIntArray303[arg3];
								local288 = this.anIntArray29[local50] * local270 + this.anIntArray28[local50] * local56 + 32767 >> 15;
								this.anIntArray28[local50] = this.anIntArray28[local50] * local270 + 32767 - local56 * this.anIntArray29[local50] >> 15;
								this.anIntArray29[local50] = local288;
							}
							this.anIntArray29[local50] += Static311.anInt5835;
							this.anIntArray30[local50] += Static48.anInt1180;
							this.anIntArray28[local50] += Static181.anInt3934;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray7.length) {
						local48 = this.anIntArrayArray7[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local270 = this.anIntArray27[local56];
							local288 = this.anIntArray27[local56 + 1];
							for (local741 = local270; local741 < local288; local741++) {
								@Pc(750) int local750 = this.aShortArray20[local741] - 1;
								if (local750 == -1) {
									break;
								}
								@Pc(760) int local760;
								@Pc(764) int local764;
								@Pc(783) int local783;
								if (arg4 != 0) {
									local760 = Class90_Sub1.anIntArray304[arg4];
									local764 = Class90_Sub1.anIntArray303[arg4];
									local783 = local760 * this.aShortArray18[local750] + local764 * this.aShortArray21[local750] + 32767 >> 15;
									this.aShortArray18[local750] = (short) (this.aShortArray18[local750] * local764 + 32767 - local760 * this.aShortArray21[local750] >> 15);
									this.aShortArray21[local750] = (short) local783;
								}
								if (arg2 != 0) {
									local760 = Class90_Sub1.anIntArray304[arg2];
									local764 = Class90_Sub1.anIntArray303[arg2];
									local783 = this.aShortArray18[local750] * local764 + 32767 - local760 * this.aShortArray22[local750] >> 15;
									this.aShortArray22[local750] = (short) (this.aShortArray18[local750] * local760 + local764 * this.aShortArray22[local750] + 32767 >> 15);
									this.aShortArray18[local750] = (short) local783;
								}
								if (arg3 != 0) {
									local760 = Class90_Sub1.anIntArray304[arg3];
									local764 = Class90_Sub1.anIntArray303[arg3];
									local783 = this.aShortArray22[local750] * local760 + this.aShortArray21[local750] * local764 + 32767 >> 15;
									this.aShortArray22[local750] = (short) (this.aShortArray22[local750] * local764 + 32767 - this.aShortArray21[local750] * local760 >> 15);
									this.aShortArray21[local750] = (short) local783;
								}
							}
						}
					}
				}
				if (this.aClass179_3 == null && this.aClass179_4 != null) {
					this.aClass179_4.anInterface3_7 = null;
				}
				if (this.aClass179_3 != null) {
					this.aClass179_3.anInterface3_7 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray7.length) {
					local154 = this.anIntArrayArray7[local32];
					for (local156 = 0; local156 < local154.length; local156++) {
						local50 = local154[local156];
						this.anIntArray29[local50] -= Static311.anInt5835;
						this.anIntArray30[local50] -= Static48.anInt1180;
						this.anIntArray28[local50] -= Static181.anInt3934;
						this.anIntArray29[local50] = this.anIntArray29[local50] * arg2 >> 7;
						this.anIntArray30[local50] = this.anIntArray30[local50] * arg3 >> 7;
						this.anIntArray28[local50] = this.anIntArray28[local50] * arg4 >> 7;
						this.anIntArray29[local50] += Static311.anInt5835;
						this.anIntArray30[local50] += Static48.anInt1180;
						this.anIntArray28[local50] += Static181.anInt3934;
					}
				}
			}
		} else {
			@Pc(1194) Class66 local1194;
			@Pc(1199) Class62 local1199;
			if (arg0 == 5) {
				if (this.anIntArrayArray6 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray6.length > local32) {
							local154 = this.anIntArrayArray6[local32];
							for (local156 = 0; local156 < local154.length; local156++) {
								local50 = local154[local156];
								local56 = arg2 * 8 + (this.aByteArray7[local50] & 0xFF);
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray7[local50] = (byte) local56;
							}
							if (local154.length > 0 && this.aClass179_4 != null) {
								this.aClass179_4.anInterface3_7 = null;
							}
						}
					}
					if (this.aClass66Array1 != null) {
						for (local32 = 0; local32 < this.anInt510; local32++) {
							local1194 = this.aClass66Array1[local32];
							local1199 = this.aClass62Array1[local32];
							local1199.anInt2036 = local1199.anInt2036 & 0xFFFFFF | 255 - (this.aByteArray7[local1194.anInt2088] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1445) Class62 local1445;
				if (arg0 == 8) {
					if (this.anIntArrayArray8 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray8.length > local32) {
								local154 = this.anIntArrayArray8[local32];
								for (local156 = 0; local156 < local154.length; local156++) {
									local1445 = this.aClass62Array1[local154[local156]];
									local1445.anInt2033 += arg3;
									local1445.anInt2026 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray8.length) {
								local154 = this.anIntArrayArray8[local32];
								for (local156 = 0; local156 < local154.length; local156++) {
									local1445 = this.aClass62Array1[local154[local156]];
									local1445.anInt2034 = local1445.anInt2034 * arg3 >> 7;
									local1445.anInt2032 = local1445.anInt2032 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray8.length > local32) {
							local154 = this.anIntArrayArray8[local32];
							for (local156 = 0; local156 < local154.length; local156++) {
								local1445 = this.aClass62Array1[local154[local156]];
								local1445.anInt2031 = local1445.anInt2031 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray6 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray6.length > local32) {
						local154 = this.anIntArrayArray6[local32];
						for (local156 = 0; local156 < local154.length; local156++) {
							local50 = local154[local156];
							local56 = this.aShortArray16[local50] & 0xFFFF;
							local270 = local56 >> 10 & 0x3F;
							local288 = local56 >> 7 & 0x7;
							@Pc(1287) int local1287 = arg2 + local270 & 0x3F;
							local288 += arg3 / 4;
							local741 = local56 & 0x7F;
							local741 += arg4;
							if (local288 < 0) {
								local288 = 0;
							} else if (local288 > 7) {
								local288 = 7;
							}
							if (local741 < 0) {
								local741 = 0;
							} else if (local741 > 127) {
								local741 = 127;
							}
							this.aShortArray16[local50] = (short) (local741 | local288 << 7 | local1287 << 10);
						}
						if (local154.length > 0 && this.aClass179_4 != null) {
							this.aClass179_4.anInterface3_7 = null;
						}
					}
				}
				if (this.aClass66Array1 != null) {
					for (local32 = 0; local32 < this.anInt510; local32++) {
						local1194 = this.aClass66Array1[local32];
						local1199 = this.aClass62Array1[local32];
						local1199.anInt2036 = local1199.anInt2036 & 0xFF000000 | Static404.anIntArray530[this.aShortArray16[local1194.anInt2088] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "za", descriptor = "(IIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static48.anInt1180 = 0;
			Static311.anInt5835 = 0;
			local13 = 0;
			Static181.anInt3934 = 0;
			for (local17 = 0; local17 < this.anInt512; local17++) {
				Static311.anInt5835 += this.anIntArray29[local17];
				Static48.anInt1180 += this.anIntArray30[local17];
				local13++;
				Static181.anInt3934 += this.anIntArray28[local17];
			}
			if (local13 > 0) {
				Static48.anInt1180 = arg2 + Static48.anInt1180 / local13;
				Static181.anInt3934 = arg3 + Static181.anInt3934 / local13;
				Static311.anInt5835 = arg1 + Static311.anInt5835 / local13;
			} else {
				Static48.anInt1180 = arg2;
				Static311.anInt5835 = arg1;
				Static181.anInt3934 = arg3;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt512; local13++) {
				this.anIntArray29[local13] += arg1;
				this.anIntArray30[local13] += arg2;
				this.anIntArray28[local13] += arg3;
			}
		} else {
			@Pc(160) int local160;
			@Pc(178) int local178;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt512; local13++) {
					this.anIntArray29[local13] -= Static311.anInt5835;
					this.anIntArray30[local13] -= Static48.anInt1180;
					this.anIntArray28[local13] -= Static181.anInt3934;
					if (arg3 != 0) {
						local17 = Class90_Sub1.anIntArray304[arg3];
						local160 = Class90_Sub1.anIntArray303[arg3];
						local178 = local160 * this.anIntArray29[local13] + this.anIntArray30[local13] * local17 + 32767 >> 15;
						this.anIntArray30[local13] = local160 * this.anIntArray30[local13] + 32767 - local17 * this.anIntArray29[local13] >> 15;
						this.anIntArray29[local13] = local178;
					}
					if (arg1 != 0) {
						local17 = Class90_Sub1.anIntArray304[arg1];
						local160 = Class90_Sub1.anIntArray303[arg1];
						local178 = this.anIntArray30[local13] * local160 + 32767 - local17 * this.anIntArray28[local13] >> 15;
						this.anIntArray28[local13] = this.anIntArray28[local13] * local160 + local17 * this.anIntArray30[local13] + 32767 >> 15;
						this.anIntArray30[local13] = local178;
					}
					if (arg2 != 0) {
						local17 = Class90_Sub1.anIntArray304[arg2];
						local160 = Class90_Sub1.anIntArray303[arg2];
						local178 = local17 * this.anIntArray28[local13] + local160 * this.anIntArray29[local13] + 32767 >> 15;
						this.anIntArray28[local13] = this.anIntArray28[local13] * local160 + 32767 - this.anIntArray29[local13] * local17 >> 15;
						this.anIntArray29[local13] = local178;
					}
					this.anIntArray29[local13] += Static311.anInt5835;
					this.anIntArray30[local13] += Static48.anInt1180;
					this.anIntArray28[local13] += Static181.anInt3934;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt512; local13++) {
					this.anIntArray29[local13] -= Static311.anInt5835;
					this.anIntArray30[local13] -= Static48.anInt1180;
					this.anIntArray28[local13] -= Static181.anInt3934;
					this.anIntArray29[local13] = arg1 * this.anIntArray29[local13] / 128;
					this.anIntArray30[local13] = arg2 * this.anIntArray30[local13] / 128;
					this.anIntArray28[local13] = arg3 * this.anIntArray28[local13] / 128;
					this.anIntArray29[local13] += Static311.anInt5835;
					this.anIntArray30[local13] += Static48.anInt1180;
					this.anIntArray28[local13] += Static181.anInt3934;
				}
			} else {
				@Pc(511) Class66 local511;
				@Pc(516) Class62 local516;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt502; local13++) {
						local17 = arg1 * 8 + (this.aByteArray7[local13] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray7[local13] = (byte) local17;
					}
					if (this.aClass179_4 != null) {
						this.aClass179_4.anInterface3_7 = null;
					}
					if (this.aClass66Array1 != null) {
						for (local17 = 0; local17 < this.anInt510; local17++) {
							local511 = this.aClass66Array1[local17];
							local516 = this.aClass62Array1[local17];
							local516.anInt2036 = local516.anInt2036 & 0xFFFFFF | 255 - (this.aByteArray7[local511.anInt2088] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt502; local13++) {
						local17 = this.aShortArray16[local13] & 0xFFFF;
						local160 = local17 >> 10 & 0x3F;
						local178 = local17 >> 7 & 0x7;
						@Pc(573) int local573 = local17 & 0x7F;
						local178 += arg2 / 4;
						@Pc(585) int local585 = arg1 + local160 & 0x3F;
						local573 += arg3;
						if (local178 < 0) {
							local178 = 0;
						} else if (local178 > 7) {
							local178 = 7;
						}
						if (local573 < 0) {
							local573 = 0;
						} else if (local573 > 127) {
							local573 = 127;
						}
						this.aShortArray16[local13] = (short) (local573 | local585 << 10 | local178 << 7);
					}
					if (this.aClass179_4 != null) {
						this.aClass179_4.anInterface3_7 = null;
					}
					if (this.aClass66Array1 != null) {
						for (local17 = 0; local17 < this.anInt510; local17++) {
							local511 = this.aClass66Array1[local17];
							local516 = this.aClass62Array1[local17];
							local516.anInt2036 = local516.anInt2036 & 0xFF000000 | Static404.anIntArray530[this.aShortArray16[local511.anInt2088] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(704) Class62 local704;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt510; local13++) {
							local704 = this.aClass62Array1[local13];
							local704.anInt2033 += arg2;
							local704.anInt2026 += arg1;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt510; local13++) {
							local704 = this.aClass62Array1[local13];
							local704.anInt2034 = local704.anInt2034 * arg2 >> 7;
							local704.anInt2032 = local704.anInt2032 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt510; local13++) {
							local704 = this.aClass62Array1[local13];
							local704.anInt2031 = arg1 + local704.anInt2031 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class90_Sub1.anIntArray304[arg0];
		@Pc(13) int local13 = Class90_Sub1.anIntArray303[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt512; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray30[local15] - local9 * this.anIntArray28[local15] >> 15;
			this.anIntArray28[local15] = this.anIntArray30[local15] * local9 + this.anIntArray28[local15] * local13 >> 15;
			this.anIntArray30[local15] = local34;
		}
		if (this.aClass179_1 != null) {
			this.aClass179_1.anInterface3_7 = null;
		}
		this.aBoolean16 = false;
	}

	@OriginalMember(owner = "client!at", name = "S", descriptor = "()I")
	@Override
	public int S() {
		if (!this.aBoolean16) {
			this.method413();
		}
		return this.aShort13;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!c;Lclient!tq;I)V")
	@Override
	public void method6189(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class41_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt472 == 0) {
			return;
		}
		@Pc(13) Class40_Sub2 local13 = this.aClass106_Sub2_6.aClass40_Sub2_4;
		@Pc(16) Class40_Sub2 local16 = (Class40_Sub2) arg0;
		if (!this.aBoolean16) {
			this.method413();
		}
		this.method410(local16);
		Static305.aFloat88 = local16.aFloat71 * local13.aFloat74 + local13.aFloat81 * local16.aFloat82 + local16.aFloat81 * local13.aFloat79;
		Static115.aFloat16 = local13.aFloat75 + local13.aFloat79 * local16.aFloat75 + local13.aFloat74 * local16.aFloat78 + local16.aFloat80 * local13.aFloat81;
		@Pc(73) float local73 = Static305.aFloat88 * (float) this.aShort19 + Static115.aFloat16;
		@Pc(81) float local81 = Static115.aFloat16 + (float) this.aShort15 * Static305.aFloat88;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local73 > local81) {
			local91 = (float) -this.aShort21 + local81;
			local97 = (float) this.aShort21 + local73;
		} else {
			local91 = local73 - (float) this.aShort21;
			local97 = (float) this.aShort21 + local81;
		}
		if (this.aClass106_Sub2_6.aFloat40 <= local91 || (float) this.aClass106_Sub2_6.anInt3747 >= local97) {
			return;
		}
		Static100.aFloat14 = local13.aFloat71 * local16.aFloat82 + local13.aFloat72 * local16.aFloat71 + local13.aFloat77 * local16.aFloat81;
		Static147.aFloat28 = local13.aFloat78 + local13.aFloat77 * local16.aFloat75 + local13.aFloat72 * local16.aFloat78 + local13.aFloat71 * local16.aFloat80;
		@Pc(174) float local174 = (float) this.aShort19 * Static100.aFloat14 + Static147.aFloat28;
		@Pc(182) float local182 = Static100.aFloat14 * (float) this.aShort15 + Static147.aFloat28;
		@Pc(208) float local208;
		@Pc(197) float local197;
		if (local174 > local182) {
			local197 = (float) this.aClass106_Sub2_6.anInt3752 * ((float) this.aShort21 + local174);
			local208 = (local182 - (float) this.aShort21) * (float) this.aClass106_Sub2_6.anInt3752;
		} else {
			local197 = (float) this.aClass106_Sub2_6.anInt3752 * ((float) this.aShort21 + local182);
			local208 = (local174 - (float) this.aShort21) * (float) this.aClass106_Sub2_6.anInt3752;
		}
		if (local208 / local97 >= this.aClass106_Sub2_6.aFloat54 || local197 / local97 <= this.aClass106_Sub2_6.aFloat55) {
			return;
		}
		Static197.aFloat62 = local13.aFloat73 * local16.aFloat81 + local13.aFloat76 * local16.aFloat71 + local13.aFloat82 * local16.aFloat82;
		Static41.aFloat6 = local13.aFloat80 + local13.aFloat82 * local16.aFloat80 + local13.aFloat76 * local16.aFloat78 + local13.aFloat73 * local16.aFloat75;
		@Pc(297) float local297 = Static197.aFloat62 * (float) this.aShort19 + Static41.aFloat6;
		@Pc(305) float local305 = Static41.aFloat6 + (float) this.aShort15 * Static197.aFloat62;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local297 > local305) {
			local331 = (float) this.aClass106_Sub2_6.anInt3758 * ((float) this.aShort21 + local297);
			local320 = ((float) -this.aShort21 + local305) * (float) this.aClass106_Sub2_6.anInt3758;
		} else {
			local320 = (float) this.aClass106_Sub2_6.anInt3758 * (local297 - (float) this.aShort21);
			local331 = (float) this.aClass106_Sub2_6.anInt3758 * (local305 + (float) this.aShort21);
		}
		if (local320 / local97 >= this.aClass106_Sub2_6.aFloat41 || local331 / local97 <= this.aClass106_Sub2_6.aFloat52) {
			return;
		}
		if (arg1 != null || this.aClass66Array1 != null) {
			Static316.aFloat91 = local16.aFloat77 * local13.aFloat74 + local16.aFloat73 * local13.aFloat81 + local13.aFloat79 * local16.aFloat79;
			Static336.aFloat92 = local13.aFloat76 * local16.aFloat72 + local16.aFloat76 * local13.aFloat82 + local13.aFloat73 * local16.aFloat74;
			Static92.aFloat12 = local16.aFloat79 * local13.aFloat73 + local13.aFloat82 * local16.aFloat73 + local13.aFloat76 * local16.aFloat77;
			Static308.aFloat90 = local13.aFloat77 * local16.aFloat74 + local16.aFloat72 * local13.aFloat72 + local16.aFloat76 * local13.aFloat71;
			Static116.aFloat17 = local13.aFloat72 * local16.aFloat77 + local13.aFloat71 * local16.aFloat73 + local13.aFloat77 * local16.aFloat79;
			Static369.aFloat95 = local16.aFloat76 * local13.aFloat81 + local16.aFloat72 * local13.aFloat74 + local16.aFloat74 * local13.aFloat79;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.aShort20 + this.aShort16 >> 1;
			@Pc(509) int local509 = this.aShort13 + this.aShort14 >> 1;
			@Pc(528) int local528 = (int) (Static116.aFloat17 * (float) local509 + (float) this.aShort19 * Static100.aFloat14 + (float) local501 * Static308.aFloat90 + Static147.aFloat28);
			@Pc(547) int local547 = (int) ((float) local509 * Static92.aFloat12 + (float) this.aShort19 * Static197.aFloat62 + Static41.aFloat6 + (float) local501 * Static336.aFloat92);
			@Pc(566) int local566 = (int) ((float) this.aShort19 * Static305.aFloat88 + Static115.aFloat16 + (float) local501 * Static369.aFloat95 + (float) local509 * Static316.aFloat91);
			if (local566 >= this.aClass106_Sub2_6.anInt3747) {
				arg1.anInt7135 = this.aClass106_Sub2_6.anInt3778 + local528 * this.aClass106_Sub2_6.anInt3752 / local566;
				arg1.anInt7134 = this.aClass106_Sub2_6.anInt3756 + this.aClass106_Sub2_6.anInt3758 * local547 / local566;
			} else {
				local491 = true;
			}
			@Pc(622) int local622 = (int) (Static100.aFloat14 * (float) this.aShort15 + (float) local501 * Static308.aFloat90 + Static147.aFloat28 + Static116.aFloat17 * (float) local509);
			@Pc(641) int local641 = (int) ((float) this.aShort15 * Static197.aFloat62 + Static41.aFloat6 + (float) local501 * Static336.aFloat92 + Static92.aFloat12 * (float) local509);
			@Pc(660) int local660 = (int) ((float) local509 * Static316.aFloat91 + Static369.aFloat95 * (float) local501 + Static115.aFloat16 + Static305.aFloat88 * (float) this.aShort15);
			if (local660 >= this.aClass106_Sub2_6.anInt3747) {
				arg1.anInt7138 = this.aClass106_Sub2_6.anInt3778 + local622 * this.aClass106_Sub2_6.anInt3752 / local660;
				arg1.anInt7136 = this.aClass106_Sub2_6.anInt3756 + this.aClass106_Sub2_6.anInt3758 * local641 / local660;
			} else {
				local491 = true;
			}
			if (local491) {
				if (this.aClass106_Sub2_6.anInt3747 > local566 && this.aClass106_Sub2_6.anInt3747 > local660) {
					local493 = false;
				} else {
					@Pc(743) int local743;
					@Pc(753) int local753;
					@Pc(780) int local780;
					if (local566 < this.aClass106_Sub2_6.anInt3747) {
						local743 = (local660 - this.aClass106_Sub2_6.anInt3747 << 16) / (local660 - local566);
						local753 = local622 + ((local622 - local528) * local743 >> 16);
						arg1.anInt7135 = this.aClass106_Sub2_6.anInt3778 + this.aClass106_Sub2_6.anInt3752 * local753 / this.aClass106_Sub2_6.anInt3747;
						local780 = (local743 * (local641 - local547) >> 16) + local641;
						arg1.anInt7134 = this.aClass106_Sub2_6.anInt3758 * local780 / this.aClass106_Sub2_6.anInt3747 + this.aClass106_Sub2_6.anInt3756;
					} else if (local660 < this.aClass106_Sub2_6.anInt3747) {
						local743 = (local566 - this.aClass106_Sub2_6.anInt3747 << 16) / (local566 - local660);
						local753 = ((local528 - local622) * local743 >> 16) + local528;
						arg1.anInt7135 = this.aClass106_Sub2_6.anInt3778 + this.aClass106_Sub2_6.anInt3752 * local753 / this.aClass106_Sub2_6.anInt3747;
						local780 = local547 + ((local547 - local641) * local743 >> 16);
						arg1.anInt7134 = this.aClass106_Sub2_6.anInt3758 * local780 / this.aClass106_Sub2_6.anInt3747 + this.aClass106_Sub2_6.anInt3756;
					}
				}
			}
			if (local493) {
				if (local660 < local566) {
					arg1.anInt7137 = this.aClass106_Sub2_6.anInt3752 * (this.aShort21 + local528) / local566 + this.aClass106_Sub2_6.anInt3778 - arg1.anInt7135;
				} else {
					arg1.anInt7137 = this.aClass106_Sub2_6.anInt3778 + (this.aShort21 + local622) * this.aClass106_Sub2_6.anInt3752 / local660 - arg1.anInt7138;
				}
				arg1.aBoolean441 = true;
			}
		}
		this.aClass106_Sub2_6.method2886();
		this.aClass106_Sub2_6.method2887(local16);
		this.method418();
		this.aClass106_Sub2_6.method2875();
		this.method412();
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZJIIFFIIILclient!ko;)S")
	private short method411(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class147 arg8) {
		@Pc(14) int local14 = this.anIntArray27[arg5];
		@Pc(21) int local21 = this.anIntArray27[arg5 + 1];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = local14; local25 < local21; local25++) {
			@Pc(31) short local31 = this.aShortArray20[local25];
			if (local31 == 0) {
				local23 = local25;
				break;
			}
			if (Static418.aLongArray8[local25] == arg0) {
				return (short) (local31 - 1);
			}
		}
		this.aShortArray20[local23] = (short) (this.anInt472 + 1);
		Static418.aLongArray8[local23] = arg0;
		this.aShortArray21[this.anInt472] = (short) arg7;
		this.aShortArray18[this.anInt472] = (short) arg6;
		this.aShortArray22[this.anInt472] = (short) arg1;
		this.aByteArray8[this.anInt472] = (byte) arg2;
		this.aFloatArray2[this.anInt472] = arg3;
		this.aFloatArray3[this.anInt472] = arg4;
		return (short) this.anInt472++;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!c;Lclient!tq;II)V")
	@Override
	public void method6195(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class41_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt472 == 0) {
			return;
		}
		@Pc(13) Class40_Sub2 local13 = this.aClass106_Sub2_6.aClass40_Sub2_4;
		if (!this.aBoolean16) {
			this.method413();
		}
		@Pc(22) Class40_Sub2 local22 = (Class40_Sub2) arg0;
		Static115.aFloat16 = local13.aFloat81 * local22.aFloat80 + local22.aFloat78 * local13.aFloat74 + local13.aFloat79 * local22.aFloat75 + local13.aFloat75;
		Static305.aFloat88 = local13.aFloat79 * local22.aFloat81 + local13.aFloat81 * local22.aFloat82 + local22.aFloat71 * local13.aFloat74;
		@Pc(69) float local69 = Static115.aFloat16 + (float) this.aShort19 * Static305.aFloat88;
		@Pc(77) float local77 = Static115.aFloat16 + (float) this.aShort15 * Static305.aFloat88;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local69 > local77) {
			local87 = local77 - (float) this.aShort21;
			local93 = local69 + (float) this.aShort21;
		} else {
			local87 = local69 - (float) this.aShort21;
			local93 = local77 + (float) this.aShort21;
		}
		if (this.aClass106_Sub2_6.bf <= local87 || local93 <= (float) this.aClass106_Sub2_6.anInt3747) {
			return;
		}
		Static147.aFloat28 = local13.aFloat71 * local22.aFloat80 + local13.aFloat72 * local22.aFloat78 + local13.aFloat77 * local22.aFloat75 + local13.aFloat78;
		Static100.aFloat14 = local13.aFloat77 * local22.aFloat81 + local22.aFloat82 * local13.aFloat71 + local22.aFloat71 * local13.aFloat72;
		@Pc(169) float local169 = Static147.aFloat28 + Static100.aFloat14 * (float) this.aShort19;
		@Pc(177) float local177 = Static147.aFloat28 + (float) this.aShort15 * Static100.aFloat14;
		@Pc(203) float local203;
		@Pc(192) float local192;
		if (local169 > local177) {
			local192 = ((float) this.aShort21 + local169) * (float) this.aClass106_Sub2_6.anInt3752;
			local203 = (float) this.aClass106_Sub2_6.anInt3752 * (local177 - (float) this.aShort21);
		} else {
			local203 = (float) this.aClass106_Sub2_6.anInt3752 * (local169 - (float) this.aShort21);
			local192 = ((float) this.aShort21 + local177) * (float) this.aClass106_Sub2_6.anInt3752;
		}
		if (local203 / (float) arg2 >= this.aClass106_Sub2_6.aFloat54 || local192 / (float) arg2 <= this.aClass106_Sub2_6.aFloat55) {
			return;
		}
		Static41.aFloat6 = local13.aFloat80 + local22.aFloat78 * local13.aFloat76 + local22.aFloat80 * local13.aFloat82 + local22.aFloat75 * local13.aFloat73;
		Static197.aFloat62 = local13.aFloat82 * local22.aFloat82 + local13.aFloat76 * local22.aFloat71 + local22.aFloat81 * local13.aFloat73;
		@Pc(294) float local294 = Static41.aFloat6 + (float) this.aShort19 * Static197.aFloat62;
		@Pc(302) float local302 = Static41.aFloat6 + (float) this.aShort15 * Static197.aFloat62;
		@Pc(329) float local329;
		@Pc(317) float local317;
		if (local302 < local294) {
			local329 = (float) this.aClass106_Sub2_6.anInt3758 * (local302 - (float) this.aShort21);
			local317 = ((float) this.aShort21 + local294) * (float) this.aClass106_Sub2_6.anInt3758;
		} else {
			local317 = ((float) this.aShort21 + local302) * (float) this.aClass106_Sub2_6.anInt3758;
			local329 = ((float) -this.aShort21 + local294) * (float) this.aClass106_Sub2_6.anInt3758;
		}
		if (this.aClass106_Sub2_6.aFloat41 <= local329 / (float) arg2 || local317 / (float) arg2 <= this.aClass106_Sub2_6.aFloat52) {
			return;
		}
		if (arg1 != null || this.aClass66Array1 != null) {
			Static369.aFloat95 = local22.aFloat74 * local13.aFloat79 + local13.aFloat74 * local22.aFloat72 + local13.aFloat81 * local22.aFloat76;
			Static92.aFloat12 = local22.aFloat79 * local13.aFloat73 + local13.aFloat76 * local22.aFloat77 + local22.aFloat73 * local13.aFloat82;
			Static336.aFloat92 = local13.aFloat82 * local22.aFloat76 + local22.aFloat72 * local13.aFloat76 + local13.aFloat73 * local22.aFloat74;
			Static316.aFloat91 = local22.aFloat79 * local13.aFloat79 + local22.aFloat73 * local13.aFloat81 + local22.aFloat77 * local13.aFloat74;
			Static116.aFloat17 = local13.aFloat77 * local22.aFloat79 + local13.aFloat71 * local22.aFloat73 + local13.aFloat72 * local22.aFloat77;
			Static308.aFloat90 = local13.aFloat71 * local22.aFloat76 + local13.aFloat72 * local22.aFloat72 + local13.aFloat77 * local22.aFloat74;
		}
		if (arg1 != null) {
			@Pc(496) int local496 = this.aShort20 + this.aShort16 >> 1;
			@Pc(505) int local505 = this.aShort14 + this.aShort13 >> 1;
			@Pc(524) int local524 = (int) ((float) local505 * Static116.aFloat17 + Static308.aFloat90 * (float) local496 + Static147.aFloat28 + (float) this.aShort19 * Static100.aFloat14);
			@Pc(543) int local543 = (int) ((float) local505 * Static92.aFloat12 + Static197.aFloat62 * (float) this.aShort19 + Static41.aFloat6 + (float) local496 * Static336.aFloat92);
			@Pc(562) int local562 = (int) (Static316.aFloat91 * (float) local505 + (float) this.aShort19 * Static305.aFloat88 + (float) local496 * Static369.aFloat95 + Static115.aFloat16);
			@Pc(581) int local581 = (int) (Static147.aFloat28 + Static308.aFloat90 * (float) local496 + (float) this.aShort15 * Static100.aFloat14 + Static116.aFloat17 * (float) local505);
			@Pc(600) int local600 = (int) ((float) this.aShort15 * Static197.aFloat62 + Static336.aFloat92 * (float) local496 + Static41.aFloat6 + (float) local505 * Static92.aFloat12);
			arg1.anInt7134 = this.aClass106_Sub2_6.anInt3756 + local543 * this.aClass106_Sub2_6.anInt3758 / arg2;
			arg1.anInt7135 = this.aClass106_Sub2_6.anInt3778 + this.aClass106_Sub2_6.anInt3752 * local524 / arg2;
			arg1.anInt7136 = local600 * this.aClass106_Sub2_6.anInt3758 / arg2 + this.aClass106_Sub2_6.anInt3756;
			@Pc(660) int local660 = (int) (Static316.aFloat91 * (float) local505 + (float) this.aShort15 * Static305.aFloat88 + (float) local496 * Static369.aFloat95 + Static115.aFloat16);
			arg1.anInt7138 = local581 * this.aClass106_Sub2_6.anInt3752 / arg2 + this.aClass106_Sub2_6.anInt3778;
			if (local562 < this.aClass106_Sub2_6.anInt3747 && local660 < this.aClass106_Sub2_6.anInt3747) {
				arg1.aBoolean441 = true;
				arg1.anInt7137 = this.aClass106_Sub2_6.anInt3752 * (this.aShort21 + local524) / arg2 + this.aClass106_Sub2_6.anInt3778 - arg1.anInt7135;
			}
		}
		this.aClass106_Sub2_6.method2893((float) arg2);
		this.aClass106_Sub2_6.method2861();
		this.aClass106_Sub2_6.method2887(local22);
		this.method418();
		this.aClass106_Sub2_6.method2875();
		this.method412();
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BIZ)Lclient!e;")
	@Override
	public Class17 method6202(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class17_Sub1 local18;
		@Pc(14) Class17_Sub1 local14;
		if (arg0 == 1) {
			local14 = this.aClass106_Sub2_6.aClass17_Sub1_10;
			local18 = this.aClass106_Sub2_6.aClass17_Sub1_3;
		} else if (arg0 == 2) {
			local14 = this.aClass106_Sub2_6.aClass17_Sub1_1;
			local18 = this.aClass106_Sub2_6.aClass17_Sub1_8;
		} else if (arg0 == 3) {
			local18 = this.aClass106_Sub2_6.aClass17_Sub1_5;
			local14 = this.aClass106_Sub2_6.aClass17_Sub1_7;
		} else if (arg0 == 4) {
			local18 = this.aClass106_Sub2_6.aClass17_Sub1_9;
			local14 = this.aClass106_Sub2_6.aClass17_Sub1_6;
		} else if (arg0 == 5) {
			local14 = this.aClass106_Sub2_6.aClass17_Sub1_2;
			local18 = this.aClass106_Sub2_6.aClass17_Sub1_4;
		} else {
			local18 = local14 = new Class17_Sub1(this.aClass106_Sub2_6);
		}
		return this.method421(arg0 != 0, local14, arg2, local18, arg1);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
	private void method412() {
		if (this.aClass66Array1 == null) {
			return;
		}
		@Pc(12) Class40_Sub2 local12 = this.aClass106_Sub2_6.aClass40_Sub2_2;
		@Pc(16) float local16 = this.aClass106_Sub2_6.aa();
		@Pc(20) float local20 = this.aClass106_Sub2_6.T();
		this.aClass106_Sub2_6.method2908();
		this.aClass106_Sub2_6.method5955(false);
		this.aClass106_Sub2_6.method2858(false);
		this.aClass106_Sub2_6.method2847(this.aClass106_Sub2_6.aClass179_12, null, null, this.aClass106_Sub2_6.aClass179_11);
		for (@Pc(49) int local49 = 0; local49 < this.anInt510; local49++) {
			@Pc(56) Class66 local56 = this.aClass66Array1[local49];
			@Pc(61) Class62 local61 = this.aClass62Array1[local49];
			if (!local56.aBoolean131 || !this.aClass106_Sub2_6.method5945()) {
				@Pc(89) float local89 = (float) (this.anIntArray29[local56.anInt2084] + this.anIntArray29[local56.anInt2082] + this.anIntArray29[local56.anInt2086]) * 0.3333333F;
				@Pc(112) float local112 = (float) (this.anIntArray30[local56.anInt2086] + this.anIntArray30[local56.anInt2082] + this.anIntArray30[local56.anInt2084]) * 0.3333333F;
				@Pc(133) float local133 = (float) (this.anIntArray28[local56.anInt2084] + this.anIntArray28[local56.anInt2082] + this.anIntArray28[local56.anInt2086]) * 0.3333333F;
				@Pc(147) float local147 = Static308.aFloat90 * local89 + local112 * Static100.aFloat14 + local133 * Static116.aFloat17 + Static147.aFloat28;
				@Pc(161) float local161 = Static197.aFloat62 * local112 + Static336.aFloat92 * local89 + Static92.aFloat12 * local133 + Static41.aFloat6;
				@Pc(175) float local175 = Static316.aFloat91 * local133 + local89 * Static369.aFloat95 + Static305.aFloat88 * local112 + Static115.aFloat16;
				local12.method3912(local147 + (float) local61.anInt2026, local61.anInt2034 * local56.aShort47 >> 7, (float) local61.anInt2033 - local161, local56.aShort48 * local61.anInt2032 >> 7, local61.anInt2031, -local175);
				this.aClass106_Sub2_6.method2845(local12);
				this.aClass106_Sub2_6.da(local20, local16 - (float) local56.anInt2083 * 1.5F);
				@Pc(228) int local228 = local61.anInt2036;
				OpenGL.glColor4ub((byte) (local228 >> 16), (byte) (local228 >> 8), (byte) local228, (byte) (local228 >> 24));
				this.aClass106_Sub2_6.method2904(local56.aShort49);
				this.aClass106_Sub2_6.method2927(local56.aByte38);
				this.aClass106_Sub2_6.method2851(local56.aByte39);
				this.aClass106_Sub2_6.method2874(4);
			}
		}
		this.aClass106_Sub2_6.da(local20, local16);
		this.aClass106_Sub2_6.method5955(true);
		this.aClass106_Sub2_6.method2875();
	}

	@OriginalMember(owner = "client!at", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		return this.anInt477;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V")
	private void method413() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(19) int local19 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt512; local29++) {
			@Pc(36) int local36 = this.anIntArray29[local29];
			@Pc(41) int local41 = this.anIntArray30[local29];
			if (local19 < local36) {
				local19 = local36;
			}
			if (local36 < local7) {
				local7 = local36;
			}
			if (local9 > local41) {
				local9 = local41;
			}
			if (local41 > local21) {
				local21 = local41;
			}
			@Pc(74) int local74 = this.anIntArray28[local29];
			if (local74 < local11) {
				local11 = local74;
			}
			if (local23 < local74) {
				local23 = local74;
			}
			@Pc(100) int local100 = local36 * local36 + local74 * local74;
			if (local25 < local100) {
				local25 = local100;
			}
			local100 = local74 * local74 + local36 * local36 + local41 * local41;
			if (local27 < local100) {
				local27 = local100;
			}
		}
		this.aShort20 = (short) local7;
		this.aShort14 = (short) local11;
		this.aShort19 = (short) local9;
		this.aShort15 = (short) local21;
		this.aShort16 = (short) local19;
		this.aShort13 = (short) local23;
		this.aShort21 = (short) (Math.sqrt((double) local25) + 0.99D);
		Math.sqrt((double) local27);
		this.aBoolean16 = true;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "()V")
	@Override
	public void method6198() {
		if (this.anInt472 <= 0 || this.anInt480 <= 0) {
			return;
		}
		this.method414(false);
		if ((this.aByte11 & 0x10) == 0 && this.aClass181_1.anInterface10_5 == null) {
			this.method417(false);
		}
		this.method422();
	}

	@OriginalMember(owner = "client!at", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		if (this.aClass179_4 != null) {
			this.aClass179_4.anInterface3_7 = null;
		}
		this.aShort17 = (short) arg0;
	}

	@OriginalMember(owner = "client!at", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		return this.aShort17;
	}

	@OriginalMember(owner = "client!at", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class90_Sub1.anIntArray304[arg0];
		@Pc(13) int local13 = Class90_Sub1.anIntArray303[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt512; local15++) {
			local33 = this.anIntArray28[local15] * local9 + local13 * this.anIntArray29[local15] >> 15;
			this.anIntArray28[local15] = local13 * this.anIntArray28[local15] - local9 * this.anIntArray29[local15] >> 15;
			this.anIntArray29[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt472; local33++) {
			@Pc(84) int local84 = this.aShortArray22[local33] * local9 + this.aShortArray21[local33] * local13 >> 15;
			this.aShortArray22[local33] = (short) (this.aShortArray22[local33] * local13 - this.aShortArray21[local33] * local9 >> 15);
			this.aShortArray21[local33] = (short) local84;
		}
		if (this.aClass179_3 == null && this.aClass179_4 != null) {
			this.aClass179_4.anInterface3_7 = null;
		}
		if (this.aClass179_3 != null) {
			this.aClass179_3.anInterface3_7 = null;
		}
		this.aBoolean16 = false;
		if (this.aClass179_1 != null) {
			this.aClass179_1.anInterface3_7 = null;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IZ)V")
	private void method414(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass179_4 != null && this.aClass179_4.anInterface3_7 == null;
		@Pc(27) boolean local27 = this.aClass179_3 != null && this.aClass179_3.anInterface3_7 == null;
		@Pc(47) boolean local47 = this.aClass179_1 != null && this.aClass179_1.anInterface3_7 == null;
		@Pc(58) boolean local58 = this.aClass179_2 != null && this.aClass179_2.anInterface3_7 == null;
		if (arg0) {
			local27 &= (this.aByte11 & 0x4) != 0;
			local16 &= (this.aByte11 & 0x2) != 0;
			local58 &= (this.aByte11 & 0x8) != 0;
			local47 &= (this.aByte11 & 0x1) != 0;
		}
		@Pc(106) byte local106 = 0;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		if (local47) {
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
		if (local58) {
			local123 = local106;
			local106 = (byte) (local106 + 8);
		}
		if (local106 == 0) {
			return;
		}
		if (this.aClass106_Sub2_6.aClass1_Sub3_Sub2_2.aByteArray14.length < this.anInt472 * local106) {
			this.aClass106_Sub2_6.aClass1_Sub3_Sub2_2 = new Class1_Sub3_Sub2((this.anInt472 + 100) * local106);
		} else {
			this.aClass106_Sub2_6.aClass1_Sub3_Sub2_2.anInt1710 = 0;
		}
		@Pc(193) Class1_Sub3_Sub2 local193 = this.aClass106_Sub2_6.aClass1_Sub3_Sub2_2;
		@Pc(201) int local201;
		@Pc(210) int local210;
		@Pc(238) int local238;
		@Pc(247) int local247;
		if (local47) {
			@Pc(217) int local217;
			@Pc(224) int local224;
			@Pc(229) int local229;
			@Pc(236) int local236;
			if (this.aClass106_Sub2_6.aBoolean227) {
				for (local201 = 0; local201 < this.anInt512; local201++) {
					local210 = NativeStream.floatToRawIntBits((float) this.anIntArray29[local201]);
					local217 = NativeStream.floatToRawIntBits((float) this.anIntArray30[local201]);
					local224 = NativeStream.floatToRawIntBits((float) this.anIntArray28[local201]);
					local229 = this.anIntArray27[local201];
					local236 = this.anIntArray27[local201 + 1];
					for (local238 = local229; local238 < local236; local238++) {
						local247 = this.aShortArray20[local238] - 1;
						if (local247 == -1) {
							break;
						}
						local193.anInt1710 = local106 * local247;
						local193.method1197(local210);
						local193.method1197(local217);
						local193.method1197(local224);
					}
				}
			} else {
				for (local201 = 0; local201 < this.anInt512; local201++) {
					local210 = NativeStream.floatToRawIntBits((float) this.anIntArray29[local201]);
					local217 = NativeStream.floatToRawIntBits((float) this.anIntArray30[local201]);
					local224 = NativeStream.floatToRawIntBits((float) this.anIntArray28[local201]);
					local229 = this.anIntArray27[local201];
					local236 = this.anIntArray27[local201 + 1];
					for (local238 = local229; local238 < local236; local238++) {
						local247 = this.aShortArray20[local238] - 1;
						if (local247 == -1) {
							break;
						}
						local193.anInt1710 = local106 * local247;
						local193.method1165(local210);
						local193.method1165(local217);
						local193.method1165(local224);
					}
				}
			}
		}
		@Pc(577) float local577;
		@Pc(453) short[] local453;
		@Pc(459) short[] local459;
		@Pc(456) short[] local456;
		@Pc(450) byte[] local450;
		@Pc(610) float local610;
		if (local16) {
			if (this.aClass179_3 == null) {
				if (this.aClass98_1 == null) {
					local450 = this.aByteArray8;
					local453 = this.aShortArray21;
					local456 = this.aShortArray22;
					local459 = this.aShortArray18;
				} else {
					local450 = this.aClass98_1.aByteArray39;
					local453 = this.aClass98_1.aShortArray61;
					local459 = this.aClass98_1.aShortArray62;
					local456 = this.aClass98_1.aShortArray60;
				}
				@Pc(483) float local483 = this.aClass106_Sub2_6.aFloatArray18[0];
				@Pc(489) float local489 = this.aClass106_Sub2_6.aFloatArray18[1];
				@Pc(495) float local495 = this.aClass106_Sub2_6.aFloatArray18[2];
				@Pc(499) float local499 = this.aClass106_Sub2_6.aFloat56;
				@Pc(509) float local509 = this.aClass106_Sub2_6.aFloat58 * 768.0F / (float) this.aShort18;
				@Pc(519) float local519 = this.aClass106_Sub2_6.aFloat42 * 768.0F / (float) this.aShort18;
				for (@Pc(521) int local521 = 0; local521 < this.anInt502; local521++) {
					@Pc(541) int local541 = this.method419(this.aByteArray7[local521], this.aShortArray15[local521], this.aShortArray16[local521], this.aShort17);
					@Pc(552) float local552 = (float) (local541 >> 8 & 0xFF) * this.aClass106_Sub2_6.aFloat45;
					@Pc(557) short local557 = this.aShortArray14[local521];
					@Pc(566) float local566 = (float) (local541 >>> 24) * this.aClass106_Sub2_6.aFloat51;
					local577 = (float) (local541 >> 16 & 0xFF) * this.aClass106_Sub2_6.aFloat50;
					@Pc(582) short local582 = (short) local450[local557];
					if (local582 == 0) {
						local610 = (local495 * (float) local456[local557] + (float) local459[local557] * local489 + local483 * (float) local453[local557]) * 0.0026041667F;
					} else {
						local610 = ((float) local453[local557] * local483 + local489 * (float) local459[local557] + local495 * (float) local456[local557]) / (float) (local582 * 256);
					}
					@Pc(650) float local650 = (local610 < 0.0F ? local519 : local509) * local610 + local499;
					@Pc(655) int local655 = (int) (local566 * local650);
					@Pc(660) int local660 = (int) (local650 * local577);
					if (local655 < 0) {
						local655 = 0;
					} else if (local655 > 255) {
						local655 = 255;
					}
					@Pc(679) int local679 = (int) (local552 * local650);
					if (local660 < 0) {
						local660 = 0;
					} else if (local660 > 255) {
						local660 = 255;
					}
					if (local679 < 0) {
						local679 = 0;
					} else if (local679 > 255) {
						local679 = 255;
					}
					local193.anInt1710 = local110 + local106 * local557;
					local193.method1208(local655);
					local193.method1208(local660);
					local193.method1208(local679);
					local193.method1208(255 - (this.aByteArray7[local521] & 0xFF));
					local557 = this.aShortArray23[local521];
					local582 = local450[local557];
					if (local582 == 0) {
						local610 = (local495 * (float) local456[local557] + local489 * (float) local459[local557] + (float) local453[local557] * local483) * 0.0026041667F;
					} else {
						local610 = (local489 * (float) local459[local557] + local483 * (float) local453[local557] + local495 * (float) local456[local557]) / (float) (local582 * 256);
					}
					local650 = local499 + (local610 < 0.0F ? local519 : local509) * local610;
					local655 = (int) (local650 * local566);
					if (local655 < 0) {
						local655 = 0;
					} else if (local655 > 255) {
						local655 = 255;
					}
					local660 = (int) (local650 * local577);
					local679 = (int) (local650 * local552);
					if (local660 < 0) {
						local660 = 0;
					} else if (local660 > 255) {
						local660 = 255;
					}
					local193.anInt1710 = local557 * local106 + local110;
					if (local679 < 0) {
						local679 = 0;
					} else if (local679 > 255) {
						local679 = 255;
					}
					local193.method1208(local655);
					local193.method1208(local660);
					local193.method1208(local679);
					local193.method1208(255 - (this.aByteArray7[local521] & 0xFF));
					local557 = this.aShortArray17[local521];
					local582 = local450[local557];
					if (local582 == 0) {
						local610 = ((float) local453[local557] * local483 + local489 * (float) local459[local557] + local495 * (float) local456[local557]) * 0.0026041667F;
					} else {
						local610 = ((float) local456[local557] * local495 + (float) local453[local557] * local483 + local489 * (float) local459[local557]) / (float) (local582 * 256);
					}
					local650 = (local610 < 0.0F ? local519 : local509) * local610 + local499;
					local655 = (int) (local650 * local566);
					if (local655 < 0) {
						local655 = 0;
					} else if (local655 > 255) {
						local655 = 255;
					}
					local660 = (int) (local577 * local650);
					local679 = (int) (local650 * local552);
					if (local660 < 0) {
						local660 = 0;
					} else if (local660 > 255) {
						local660 = 255;
					}
					if (local679 < 0) {
						local679 = 0;
					} else if (local679 > 255) {
						local679 = 255;
					}
					local193.anInt1710 = local110 + local106 * local557;
					local193.method1208(local655);
					local193.method1208(local660);
					local193.method1208(local679);
					local193.method1208(255 - (this.aByteArray7[local521] & 0xFF));
				}
			} else {
				for (local201 = 0; local201 < this.anInt502; local201++) {
					local210 = this.method419(this.aByteArray7[local201], this.aShortArray15[local201], this.aShortArray16[local201], this.aShort17);
					local193.anInt1710 = local110 + this.aShortArray14[local201] * local106;
					local193.method1197(local210);
					local193.anInt1710 = local110 + this.aShortArray23[local201] * local106;
					local193.method1197(local210);
					local193.anInt1710 = this.aShortArray17[local201] * local106 + local110;
					local193.method1197(local210);
				}
			}
		}
		if (local27) {
			if (this.aClass98_1 == null) {
				local453 = this.aShortArray21;
				local459 = this.aShortArray18;
				local456 = this.aShortArray22;
				local450 = this.aByteArray8;
			} else {
				local450 = this.aClass98_1.aByteArray39;
				local459 = this.aClass98_1.aShortArray62;
				local456 = this.aClass98_1.aShortArray60;
				local453 = this.aClass98_1.aShortArray61;
			}
			@Pc(1113) float local1113 = 3.0F / (float) this.aShort18;
			local193.anInt1710 = local112;
			local610 = 3.0F / (float) (this.aShort18 / 2 + this.aShort18);
			if (this.aClass106_Sub2_6.aBoolean227) {
				for (local238 = 0; local238 < this.anInt472; local238++) {
					local247 = local450[local238] & 0xFF;
					if (local247 == 0) {
						local193.method1228((float) local453[local238] * local610);
						local193.method1228((float) local459[local238] * local610);
						local193.method1228(local610 * (float) local456[local238]);
					} else {
						local577 = local1113 / (float) local247;
						local193.method1228(local577 * (float) local453[local238]);
						local193.method1228((float) local459[local238] * local577);
						local193.method1228((float) local456[local238] * local577);
					}
					local193.anInt1710 += local106 - 12;
				}
			} else {
				for (local238 = 0; local238 < this.anInt472; local238++) {
					local247 = local450[local238] & 0xFF;
					if (local247 == 0) {
						local193.method1232(local610 * (float) local453[local238]);
						local193.method1232((float) local459[local238] * local610);
						local193.method1232((float) local456[local238] * local610);
					} else {
						local577 = local1113 / (float) local247;
						local193.method1232(local577 * (float) local453[local238]);
						local193.method1232((float) local459[local238] * local577);
						local193.method1232(local577 * (float) local456[local238]);
					}
					local193.anInt1710 += local106 - 12;
				}
			}
		}
		if (local58) {
			local193.anInt1710 = local123;
			if (this.aClass106_Sub2_6.aBoolean227) {
				for (local201 = 0; local201 < this.anInt472; local201++) {
					local193.method1228(this.aFloatArray2[local201]);
					local193.method1228(this.aFloatArray3[local201]);
					local193.anInt1710 += local106 - 8;
				}
			} else {
				for (local201 = 0; local201 < this.anInt472; local201++) {
					local193.method1232(this.aFloatArray2[local201]);
					local193.method1232(this.aFloatArray3[local201]);
					local193.anInt1710 += local106 - 8;
				}
			}
		}
		local193.anInt1710 = local106 * this.anInt472;
		@Pc(1428) Interface3 local1428;
		if (arg0) {
			if (this.anInterface3_1 == null) {
				this.anInterface3_1 = this.aClass106_Sub2_6.method2883(true, local193.anInt1710, local193.aByteArray14, local106);
			} else {
				this.anInterface3_1.method5206(local193.aByteArray14, local193.anInt1710, local106);
			}
			this.aByte11 = 0;
			local1428 = this.anInterface3_1;
		} else {
			local1428 = this.aClass106_Sub2_6.method2883(false, local193.anInt1710, local193.aByteArray14, local106);
			this.aBoolean17 = true;
		}
		if (local47) {
			this.aClass179_1.anInterface3_7 = local1428;
			this.aClass179_1.aByte70 = 0;
		}
		if (local58) {
			this.aClass179_2.anInterface3_7 = local1428;
			this.aClass179_2.aByte70 = local123;
		}
		if (local16) {
			this.aClass179_4.aByte70 = local110;
			this.aClass179_4.anInterface3_7 = local1428;
		}
		if (local27) {
			this.aClass179_3.anInterface3_7 = local1428;
			this.aClass179_3.aByte70 = local112;
		}
	}

	@OriginalMember(owner = "client!at", name = "aa", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			Static181.anInt3934 = 0;
			Static311.anInt5835 = 0;
			local28 = 0;
			Static48.anInt1180 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray7.length) {
					local48 = this.anIntArrayArray7[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray19 == null || (arg6 & this.aShortArray19[local56]) != 0) {
							Static311.anInt5835 += this.anIntArray29[local56];
							Static48.anInt1180 += this.anIntArray30[local56];
							Static181.anInt3934 += this.anIntArray28[local56];
							local28++;
						}
					}
				}
			}
			if (local28 <= 0) {
				Static48.anInt1180 = arg3;
				Static311.anInt5835 = arg2;
				Static181.anInt3934 = arg4;
			} else {
				Static48.anInt1180 = Static48.anInt1180 / local28 + arg3;
				Static130.aBoolean180 = true;
				Static181.anInt3934 = Static181.anInt3934 / local28 + arg4;
				Static311.anInt5835 = arg2 + Static311.anInt5835 / local28;
			}
			return;
		}
		@Pc(250) int[] local250;
		@Pc(252) int local252;
		if (arg0 == 1) {
			if (arg7 != null) {
				local28 = arg7[2] * arg4 + arg3 * arg7[1] + arg7[0] * arg2 + 16384 >> 15;
				local32 = arg7[5] * arg4 + arg2 * arg7[3] + arg7[4] * arg3 + 16384 >> 15;
				local38 = arg3 * arg7[7] + arg2 * arg7[6] + arg7[8] * arg4 + 16384 >> 15;
				arg2 = local28;
				arg4 = local38;
				arg3 = local32;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray7.length) {
					local250 = this.anIntArrayArray7[local32];
					for (local252 = 0; local252 < local250.length; local252++) {
						local50 = local250[local252];
						if (this.aShortArray19 == null || (this.aShortArray19[local50] & arg6) != 0) {
							this.anIntArray29[local50] += arg2;
							this.anIntArray30[local50] += arg3;
							this.anIntArray28[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(390) int local390;
		@Pc(408) int local408;
		@Pc(645) int local645;
		@Pc(654) int local654;
		@Pc(667) int local667;
		@Pc(671) int local671;
		@Pc(689) int local689;
		@Pc(1033) int local1033;
		@Pc(1041) int local1041;
		@Pc(1194) int local1194;
		@Pc(1219) int local1219;
		@Pc(1223) int local1223;
		@Pc(1231) int local1231;
		@Pc(1236) int local1236;
		@Pc(1240) int local1240;
		@Pc(1244) int local1244;
		@Pc(1246) int local1246;
		@Pc(1375) int[] local1375;
		@Pc(1377) int local1377;
		@Pc(1381) int local1381;
		@Pc(1385) int local1385;
		@Pc(1387) int local1387;
		@Pc(1519) int local1519;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray7.length) {
						local250 = this.anIntArrayArray7[local32];
						for (local252 = 0; local252 < local250.length; local252++) {
							local50 = local250[local252];
							if (this.aShortArray19 == null || (arg6 & this.aShortArray19[local50]) != 0) {
								this.anIntArray29[local50] -= Static311.anInt5835;
								this.anIntArray30[local50] -= Static48.anInt1180;
								this.anIntArray28[local50] -= Static181.anInt3934;
								if (arg4 != 0) {
									local56 = Class90_Sub1.anIntArray304[arg4];
									local390 = Class90_Sub1.anIntArray303[arg4];
									local408 = local390 * this.anIntArray29[local50] + local56 * this.anIntArray30[local50] + 32767 >> 15;
									this.anIntArray30[local50] = this.anIntArray30[local50] * local390 + 32767 - this.anIntArray29[local50] * local56 >> 15;
									this.anIntArray29[local50] = local408;
								}
								if (arg2 != 0) {
									local56 = Class90_Sub1.anIntArray304[arg2];
									local390 = Class90_Sub1.anIntArray303[arg2];
									local408 = this.anIntArray30[local50] * local390 + 32767 - local56 * this.anIntArray28[local50] >> 15;
									this.anIntArray28[local50] = local56 * this.anIntArray30[local50] + this.anIntArray28[local50] * local390 + 32767 >> 15;
									this.anIntArray30[local50] = local408;
								}
								if (arg3 != 0) {
									local56 = Class90_Sub1.anIntArray304[arg3];
									local390 = Class90_Sub1.anIntArray303[arg3];
									local408 = this.anIntArray29[local50] * local390 + local56 * this.anIntArray28[local50] + 32767 >> 15;
									this.anIntArray28[local50] = this.anIntArray28[local50] * local390 + 32767 - local56 * this.anIntArray29[local50] >> 15;
									this.anIntArray29[local50] = local408;
								}
								this.anIntArray29[local50] += Static311.anInt5835;
								this.anIntArray30[local50] += Static48.anInt1180;
								this.anIntArray28[local50] += Static181.anInt3934;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray7.length > local38) {
							local48 = this.anIntArrayArray7[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray19 == null || (this.aShortArray19[local56] & arg6) != 0) {
									local390 = this.anIntArray27[local56];
									local408 = this.anIntArray27[local56 + 1];
									for (local645 = local390; local645 < local408; local645++) {
										local654 = this.aShortArray20[local645] - 1;
										if (local654 == -1) {
											break;
										}
										if (arg4 != 0) {
											local667 = Class90_Sub1.anIntArray304[arg4];
											local671 = Class90_Sub1.anIntArray303[arg4];
											local689 = this.aShortArray21[local654] * local671 + this.aShortArray18[local654] * local667 + 32767 >> 15;
											this.aShortArray18[local654] = (short) (this.aShortArray18[local654] * local671 + 32767 - this.aShortArray21[local654] * local667 >> 15);
											this.aShortArray21[local654] = (short) local689;
										}
										if (arg2 != 0) {
											local667 = Class90_Sub1.anIntArray304[arg2];
											local671 = Class90_Sub1.anIntArray303[arg2];
											local689 = local671 * this.aShortArray18[local654] + 32767 - this.aShortArray22[local654] * local667 >> 15;
											this.aShortArray22[local654] = (short) (this.aShortArray22[local654] * local671 + this.aShortArray18[local654] * local667 + 32767 >> 15);
											this.aShortArray18[local654] = (short) local689;
										}
										if (arg3 != 0) {
											local667 = Class90_Sub1.anIntArray304[arg3];
											local671 = Class90_Sub1.anIntArray303[arg3];
											local689 = this.aShortArray21[local654] * local671 + this.aShortArray22[local654] * local667 + 32767 >> 15;
											this.aShortArray22[local654] = (short) (this.aShortArray22[local654] * local671 + 32767 - this.aShortArray21[local654] * local667 >> 15);
											this.aShortArray21[local654] = (short) local689;
										}
									}
								}
							}
						}
					}
					if (this.aClass179_3 == null && this.aClass179_4 != null) {
						this.aClass179_4.anInterface3_7 = null;
					}
					if (this.aClass179_3 != null) {
						this.aClass179_3.anInterface3_7 = null;
						return;
					}
				}
			} else {
				local28 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local252 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static130.aBoolean180) {
					local390 = Static48.anInt1180 * arg7[3] + arg7[0] * Static311.anInt5835 + arg7[6] * Static181.anInt3934 + 16384 >> 15;
					local408 = Static181.anInt3934 * arg7[7] + arg7[1] * Static311.anInt5835 + Static48.anInt1180 * arg7[4] + 16384 >> 15;
					local408 += local50;
					local390 += local252;
					local645 = arg7[2] * Static311.anInt5835 + arg7[5] * Static48.anInt1180 + arg7[8] * Static181.anInt3934 + 16384 >> 15;
					Static311.anInt5835 = local390;
					local645 += local56;
					Static48.anInt1180 = local408;
					Static181.anInt3934 = local645;
					Static130.aBoolean180 = false;
				}
				@Pc(1001) int[] local1001 = new int[9];
				local408 = Class90_Sub1.anIntArray303[arg2];
				local645 = Class90_Sub1.anIntArray304[arg2];
				local654 = Class90_Sub1.anIntArray303[arg3];
				local667 = Class90_Sub1.anIntArray304[arg3];
				local671 = Class90_Sub1.anIntArray303[arg4];
				local689 = Class90_Sub1.anIntArray304[arg4];
				local1033 = local671 * local645 + 16384 >> 15;
				local1041 = local645 * local689 + 16384 >> 15;
				local1001[6] = local671 * -local667 + local1041 * local654 + 16384 >> 15;
				local1001[0] = local667 * local1041 + local654 * local671 + 16384 >> 15;
				local1001[5] = -local645;
				local1001[1] = local667 * local1033 + -local654 * local689 + 16384 >> 15;
				local1001[2] = local667 * local408 + 16384 >> 15;
				local1001[8] = local654 * local408 + 16384 >> 15;
				local1001[3] = local689 * local408 + 16384 >> 15;
				local1001[4] = local671 * local408 + 16384 >> 15;
				local1001[7] = local1033 * local654 + local667 * local689 + 16384 >> 15;
				@Pc(1169) int local1169 = local1001[0] * -Static311.anInt5835 + local1001[1] * -Static48.anInt1180 + local1001[2] * -Static181.anInt3934 + 16384 >> 15;
				local1194 = local1001[5] * -Static181.anInt3934 + -Static48.anInt1180 * local1001[4] + local1001[3] * -Static311.anInt5835 + 16384 >> 15;
				local1219 = local1001[8] * -Static181.anInt3934 + -Static311.anInt5835 * local1001[6] + local1001[7] * -Static48.anInt1180 + 16384 >> 15;
				local1223 = Static311.anInt5835 + local1169;
				@Pc(1227) int local1227 = Static48.anInt1180 + local1194;
				local1231 = Static181.anInt3934 + local1219;
				@Pc(1234) int[] local1234 = new int[9];
				for (local1236 = 0; local1236 < 3; local1236++) {
					for (local1240 = 0; local1240 < 3; local1240++) {
						local1244 = 0;
						for (local1246 = 0; local1246 < 3; local1246++) {
							local1244 += arg7[local1246 + local1240 * 3] * local1001[local1246 + local1236 * 3];
						}
						local1234[local1240 + local1236 * 3] = local1244 + 16384 >> 15;
					}
				}
				local1240 = local1001[1] * local50 + local252 * local1001[0] + local56 * local1001[2] + 16384 >> 15;
				local1244 = local1001[3] * local252 + local1001[4] * local50 + local1001[5] * local56 + 16384 >> 15;
				local1240 += local1223;
				local1244 += local1227;
				local1246 = local252 * local1001[6] + local50 * local1001[7] + local56 * local1001[8] + 16384 >> 15;
				local1246 += local1231;
				local1375 = new int[9];
				for (local1377 = 0; local1377 < 3; local1377++) {
					for (local1381 = 0; local1381 < 3; local1381++) {
						local1385 = 0;
						for (local1387 = 0; local1387 < 3; local1387++) {
							local1385 += local1234[local1387 * 3 + local1381] * arg7[local1387 + local1377 * 3];
						}
						local1375[local1381 + local1377 * 3] = local1385 + 16384 >> 15;
					}
				}
				local1381 = local1246 * arg7[2] + arg7[0] * local1240 + arg7[1] * local1244 + 16384 >> 15;
				local1385 = arg7[4] * local1244 + arg7[3] * local1240 + local1246 * arg7[5] + 16384 >> 15;
				local1385 += local32;
				local1387 = arg7[8] * local1246 + arg7[6] * local1240 + local1244 * arg7[7] + 16384 >> 15;
				local1381 += local28;
				local1387 += local38;
				for (local1519 = 0; local1519 < local8; local1519++) {
					@Pc(1525) int local1525 = arg1[local1519];
					if (local1525 < this.anIntArrayArray7.length) {
						@Pc(1539) int[] local1539 = this.anIntArrayArray7[local1525];
						for (@Pc(1541) int local1541 = 0; local1541 < local1539.length; local1541++) {
							@Pc(1547) int local1547 = local1539[local1541];
							if (this.aShortArray19 == null || (arg6 & this.aShortArray19[local1547]) != 0) {
								@Pc(1592) int local1592 = this.anIntArray28[local1547] * local1375[2] + local1375[0] * this.anIntArray29[local1547] + local1375[1] * this.anIntArray30[local1547] + 16384 >> 15;
								@Pc(1624) int local1624 = this.anIntArray28[local1547] * local1375[5] + local1375[3] * this.anIntArray29[local1547] + local1375[4] * this.anIntArray30[local1547] + 16384 >> 15;
								@Pc(1656) int local1656 = local1375[7] * this.anIntArray30[local1547] + this.anIntArray29[local1547] * local1375[6] + local1375[8] * this.anIntArray28[local1547] + 16384 >> 15;
								@Pc(1660) int local1660 = local1624 + local1385;
								@Pc(1664) int local1664 = local1592 + local1381;
								@Pc(1668) int local1668 = local1656 + local1387;
								this.anIntArray29[local1547] = local1664;
								this.anIntArray30[local1547] = local1660;
								this.anIntArray28[local1547] = local1668;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2592) Class66 local2592;
			@Pc(2597) Class62 local2597;
			if (arg0 == 5) {
				if (this.anIntArrayArray6 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray6.length > local32) {
							local250 = this.anIntArrayArray6[local32];
							for (local252 = 0; local252 < local250.length; local252++) {
								local50 = local250[local252];
								if (this.aShortArray13 == null || (this.aShortArray13[local50] & arg6) != 0) {
									local56 = arg2 * 8 + (this.aByteArray7[local50] & 0xFF);
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray7[local50] = (byte) local56;
									if (this.aClass179_4 != null) {
										this.aClass179_4.anInterface3_7 = null;
									}
								}
							}
						}
					}
					if (this.aClass66Array1 != null) {
						for (local32 = 0; local32 < this.anInt510; local32++) {
							local2592 = this.aClass66Array1[local32];
							local2597 = this.aClass62Array1[local32];
							local2597.anInt2036 = local2597.anInt2036 & 0xFFFFFF | 255 - (this.aByteArray7[local2592.anInt2088] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2851) Class62 local2851;
				if (arg0 == 8) {
					if (this.anIntArrayArray8 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray8.length) {
								local250 = this.anIntArrayArray8[local32];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2851 = this.aClass62Array1[local250[local252]];
									local2851.anInt2033 += arg3;
									local2851.anInt2026 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray8 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray8.length) {
								local250 = this.anIntArrayArray8[local32];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2851 = this.aClass62Array1[local250[local252]];
									local2851.anInt2032 = arg2 * local2851.anInt2032 >> 7;
									local2851.anInt2034 = arg3 * local2851.anInt2034 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray8 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray8.length > local32) {
							local250 = this.anIntArrayArray8[local32];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2851 = this.aClass62Array1[local250[local252]];
								local2851.anInt2031 = local2851.anInt2031 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray6 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray6.length) {
						local250 = this.anIntArrayArray6[local32];
						for (local252 = 0; local252 < local250.length; local252++) {
							local50 = local250[local252];
							if (this.aShortArray13 == null || (arg6 & this.aShortArray13[local50]) != 0) {
								local56 = this.aShortArray16[local50] & 0xFFFF;
								local390 = local56 >> 10 & 0x3F;
								local408 = local56 >> 7 & 0x7;
								local645 = local56 & 0x7F;
								@Pc(2702) int local2702 = local390 + arg2 & 0x3F;
								local408 += arg3 / 4;
								local645 += arg4;
								if (local408 < 0) {
									local408 = 0;
								} else if (local408 > 7) {
									local408 = 7;
								}
								if (local645 < 0) {
									local645 = 0;
								} else if (local645 > 127) {
									local645 = 127;
								}
								this.aShortArray16[local50] = (short) (local645 | local408 << 7 | local2702 << 10);
								if (this.aClass179_4 != null) {
									this.aClass179_4.anInterface3_7 = null;
								}
							}
						}
					}
				}
				if (this.aClass66Array1 != null) {
					for (local32 = 0; local32 < this.anInt510; local32++) {
						local2592 = this.aClass66Array1[local32];
						local2597 = this.aClass62Array1[local32];
						local2597.anInt2036 = local2597.anInt2036 & 0xFF000000 | Static404.anIntArray530[this.aShortArray16[local2592.anInt2088] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray7.length > local32) {
					local250 = this.anIntArrayArray7[local32];
					for (local252 = 0; local252 < local250.length; local252++) {
						local50 = local250[local252];
						if (this.aShortArray19 == null || (arg6 & this.aShortArray19[local50]) != 0) {
							this.anIntArray29[local50] -= Static311.anInt5835;
							this.anIntArray30[local50] -= Static48.anInt1180;
							this.anIntArray28[local50] -= Static181.anInt3934;
							this.anIntArray29[local50] = arg2 * this.anIntArray29[local50] >> 7;
							this.anIntArray30[local50] = arg3 * this.anIntArray30[local50] >> 7;
							this.anIntArray28[local50] = this.anIntArray28[local50] * arg4 >> 7;
							this.anIntArray29[local50] += Static311.anInt5835;
							this.anIntArray30[local50] += Static48.anInt1180;
							this.anIntArray28[local50] += Static181.anInt3934;
						}
					}
				}
			}
		} else {
			local28 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local252 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static130.aBoolean180) {
				local390 = Static311.anInt5835 * arg7[0] + arg7[3] * Static48.anInt1180 + Static181.anInt3934 * arg7[6] + 16384 >> 15;
				local408 = Static48.anInt1180 * arg7[4] + arg7[1] * Static311.anInt5835 + arg7[7] * Static181.anInt3934 + 16384 >> 15;
				local390 += local252;
				local408 += local50;
				local645 = Static311.anInt5835 * arg7[2] + arg7[5] * Static48.anInt1180 + Static181.anInt3934 * arg7[8] + 16384 >> 15;
				Static311.anInt5835 = local390;
				Static48.anInt1180 = local408;
				local645 += local56;
				Static130.aBoolean180 = false;
				Static181.anInt3934 = local645;
			}
			local390 = arg2 << 15 >> 7;
			local408 = arg3 << 15 >> 7;
			local645 = arg4 << 15 >> 7;
			local654 = local390 * -Static311.anInt5835 + 16384 >> 15;
			local667 = -Static48.anInt1180 * local408 + 16384 >> 15;
			local671 = -Static181.anInt3934 * local645 + 16384 >> 15;
			local689 = local654 + Static311.anInt5835;
			local1033 = local667 + Static48.anInt1180;
			local1041 = Static181.anInt3934 + local671;
			@Pc(1887) int[] local1887 = new int[] { local390 * arg7[0] + 16384 >> 15, local390 * arg7[3] + 16384 >> 15, local390 * arg7[6] + 16384 >> 15, local408 * arg7[1] + 16384 >> 15, local408 * arg7[4] + 16384 >> 15, local408 * arg7[7] + 16384 >> 15, arg7[2] * local645 + 16384 >> 15, arg7[5] * local645 + 16384 >> 15, arg7[8] * local645 + 16384 >> 15 };
			local1194 = local390 * local252 + 16384 >> 15;
			local1219 = local50 * local408 + 16384 >> 15;
			@Pc(2015) int local2015 = local1219 + local1033;
			local1223 = local645 * local56 + 16384 >> 15;
			@Pc(2027) int local2027 = local1194 + local689;
			@Pc(2031) int local2031 = local1223 + local1041;
			@Pc(2034) int[] local2034 = new int[9];
			@Pc(2040) int local2040;
			for (local1231 = 0; local1231 < 3; local1231++) {
				for (local2040 = 0; local2040 < 3; local2040++) {
					local1236 = 0;
					for (local1240 = 0; local1240 < 3; local1240++) {
						local1236 += local1887[local2040 + local1240 * 3] * arg7[local1240 + local1231 * 3];
					}
					local2034[local2040 + local1231 * 3] = local1236 + 16384 >> 15;
				}
			}
			local2040 = local2027 * arg7[0] + arg7[1] * local2015 + local2031 * arg7[2] + 16384 >> 15;
			local1236 = arg7[5] * local2031 + local2015 * arg7[4] + local2027 * arg7[3] + 16384 >> 15;
			local1240 = arg7[7] * local2015 + arg7[6] * local2027 + arg7[8] * local2031 + 16384 >> 15;
			local2040 += local28;
			local1236 += local32;
			local1240 += local38;
			for (local1244 = 0; local1244 < local8; local1244++) {
				local1246 = arg1[local1244];
				if (local1246 < this.anIntArrayArray7.length) {
					local1375 = this.anIntArrayArray7[local1246];
					for (local1377 = 0; local1377 < local1375.length; local1377++) {
						local1381 = local1375[local1377];
						if (this.aShortArray19 == null || (this.aShortArray19[local1381] & arg6) != 0) {
							local1385 = this.anIntArray28[local1381] * local2034[2] + local2034[0] * this.anIntArray29[local1381] + this.anIntArray30[local1381] * local2034[1] + 16384 >> 15;
							local1387 = this.anIntArray28[local1381] * local2034[5] + local2034[3] * this.anIntArray29[local1381] + local2034[4] * this.anIntArray30[local1381] + 16384 >> 15;
							@Pc(2282) int local2282 = local1387 + local1236;
							local1519 = local2034[8] * this.anIntArray28[local1381] + local2034[6] * this.anIntArray29[local1381] + local2034[7] * this.anIntArray30[local1381] + 16384 >> 15;
							@Pc(2317) int local2317 = local1385 + local2040;
							@Pc(2321) int local2321 = local1519 + local1240;
							this.anIntArray29[local1381] = local2317;
							this.anIntArray30[local1381] = local2282;
							this.anIntArray28[local1381] = local2321;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "k", descriptor = "()I")
	@Override
	public int k() {
		if (!this.aBoolean16) {
			this.method413();
		}
		return this.aShort21;
	}

	@OriginalMember(owner = "client!at", name = "Z", descriptor = "()I")
	@Override
	public int Z() {
		if (!this.aBoolean16) {
			this.method413();
		}
		return this.aShort14;
	}

	@OriginalMember(owner = "client!at", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return this.aShort18;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 > arg4 && arg6 > arg4 && arg3 > arg4) {
			return false;
		} else if (arg1 < arg4 && arg4 > arg6 && arg4 > arg3) {
			return false;
		} else if (arg7 > arg0 && arg5 > arg0 && arg2 > arg0) {
			return false;
		} else {
			return arg0 <= arg7 || arg0 <= arg5 || arg2 >= arg0;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZI)V")
	private void method417(@OriginalArg(0) boolean arg0) {
		if (this.aClass106_Sub2_6.aClass1_Sub3_Sub2_2.aByteArray14.length < this.anInt480 * 6) {
			this.aClass106_Sub2_6.aClass1_Sub3_Sub2_2 = new Class1_Sub3_Sub2((this.anInt480 + 100) * 6);
		} else {
			this.aClass106_Sub2_6.aClass1_Sub3_Sub2_2.anInt1710 = 0;
		}
		@Pc(46) Class1_Sub3_Sub2 local46 = this.aClass106_Sub2_6.aClass1_Sub3_Sub2_2;
		@Pc(52) int local52;
		if (this.aClass106_Sub2_6.aBoolean227) {
			for (local52 = 0; local52 < this.anInt480; local52++) {
				local46.method1227(this.aShortArray14[local52]);
				local46.method1227(this.aShortArray23[local52]);
				local46.method1227(this.aShortArray17[local52]);
			}
		} else {
			for (local52 = 0; local52 < this.anInt480; local52++) {
				local46.method1199(this.aShortArray14[local52]);
				local46.method1199(this.aShortArray23[local52]);
				local46.method1199(this.aShortArray17[local52]);
			}
		}
		if (local46.anInt1710 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface10_1 == null) {
				this.anInterface10_1 = this.aClass106_Sub2_6.method2921(local46.aByteArray14, true, local46.anInt1710);
			} else {
				this.anInterface10_1.method5857(local46.aByteArray14, local46.anInt1710);
			}
			this.aClass181_1.anInterface10_5 = this.anInterface10_1;
		} else {
			this.aClass181_1.anInterface10_5 = this.aClass106_Sub2_6.method2921(local46.aByteArray14, false, local46.anInt1710);
		}
		if (!arg0) {
			this.aBoolean17 = true;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt502; local7++) {
			local16 = this.aShortArray16[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg2 != -1) {
				local32 += arg3 * (arg2 - local32) >> 7;
			}
			this.aShortArray16[local7] = (short) (local32 | local28 << 7 | local22 << 10);
		}
		if (this.aClass66Array1 != null) {
			for (local16 = 0; local16 < this.anInt510; local16++) {
				@Pc(110) Class66 local110 = this.aClass66Array1[local16];
				@Pc(115) Class62 local115 = this.aClass62Array1[local16];
				local115.anInt2036 = local115.anInt2036 & 0xFF000000 | Static404.anIntArray530[this.aShortArray16[local110.anInt2088] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass179_4 != null) {
			this.aClass179_4.anInterface3_7 = null;
		}
	}

	@OriginalMember(owner = "client!at", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class90_Sub1.anIntArray304[arg0];
		@Pc(13) int local13 = Class90_Sub1.anIntArray303[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt512; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray29[local15] + this.anIntArray28[local15] * local9 >> 15;
			this.anIntArray28[local15] = local13 * this.anIntArray28[local15] - this.anIntArray29[local15] * local9 >> 15;
			this.anIntArray29[local15] = local33;
		}
		this.aBoolean16 = false;
		if (this.aClass179_1 != null) {
			this.aClass179_1.anInterface3_7 = null;
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(Z)V")
	private void method418() {
		if (this.anInt480 == 0) {
			return;
		}
		if (this.aByte11 != 0) {
			this.method414(true);
		}
		this.method414(false);
		if (this.aClass181_1 != null) {
			if (this.aClass181_1.anInterface10_5 == null) {
				this.method417((this.aByte11 & 0x10) != 0);
			}
			if (this.aClass181_1.anInterface10_5 != null) {
				this.aClass106_Sub2_6.method2858(this.aClass179_3 != null);
				this.aClass106_Sub2_6.method2847(this.aClass179_2, this.aClass179_3, this.aClass179_4, this.aClass179_1);
				@Pc(73) int local73 = this.anIntArray31.length - 1;
				for (@Pc(75) int local75 = 0; local75 < local73; local75++) {
					@Pc(82) int local82 = this.anIntArray31[local75];
					@Pc(89) int local89 = this.anIntArray31[local75 + 1];
					@Pc(96) int local96 = this.aShortArray15[local82] & 0xFFFF;
					if (local96 == 65535) {
						local96 = -1;
					}
					this.aClass106_Sub2_6.method2918(this.aClass179_3 != null, local96);
					this.aClass106_Sub2_6.method2848((local89 - local82) * 3, this.aClass181_1.anInterface10_5, local82 * 3);
				}
			}
		}
		this.method422();
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BBSII)I")
	private int method419(@OriginalArg(1) byte arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17 = Static404.anIntArray530[Static297.method4303(arg2, arg3)];
		if (arg1 != -1) {
			@Pc(30) Class150 local30 = this.aClass106_Sub2_6.anInterface7_10.method78(arg1 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte54 & 0xFF;
			@Pc(44) int local44;
			@Pc(73) int local73;
			if (local35 != 0) {
				if (arg3 < 0) {
					local44 = 0;
				} else if (arg3 > 127) {
					local44 = 16777215;
				} else {
					local44 = arg3 * 131586;
				}
				if (local35 == 256) {
					local17 = local44;
				} else {
					local73 = 256 - local35;
					local17 = ((local44 & 0xFF00FF) * local35 + local73 * (local17 & 0xFF00FF) & 0xFF00FF00) + (local35 * (local44 & 0xFF00) + local73 * (local17 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local44 = local30.aByte56 & 0xFF;
			if (local44 != 0) {
				local44 += 256;
				@Pc(120) int local120 = local44 * (local17 >> 16 & 0xFF);
				if (local120 > 65535) {
					local120 = 65535;
				}
				local73 = local44 * (local17 >> 8 & 0xFF);
				if (local73 > 65535) {
					local73 = 65535;
				}
				@Pc(148) int local148 = local44 * (local17 & 0xFF);
				if (local148 > 65535) {
					local148 = 65535;
				}
				local17 = (local148 >> 8) + (local73 & 0xFF00) + (local120 << 8 & 0xFF00C6);
			}
		}
		return (local17 << 8) + 255 - (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!at", name = "ta", descriptor = "()I")
	@Override
	public int ta() {
		if (!this.aBoolean16) {
			this.method413();
		}
		return this.aShort20;
	}

	@OriginalMember(owner = "client!at", name = "K", descriptor = "(I)V")
	@Override
	public void K(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class90_Sub1.anIntArray304[arg0];
		@Pc(13) int local13 = Class90_Sub1.anIntArray303[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt512; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray30[local15] + local13 * this.anIntArray29[local15] >> 15;
			this.anIntArray30[local15] = local13 * this.anIntArray30[local15] - this.anIntArray29[local15] * local9 >> 15;
			this.anIntArray29[local15] = local34;
		}
		this.aBoolean16 = false;
		if (this.aClass179_1 != null) {
			this.aClass179_1.anInterface3_7 = null;
		}
	}

	@OriginalMember(owner = "client!at", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.anInt477 = arg0;
		if (this.aClass98_1 != null && (this.anInt477 & 0x10000) == 0) {
			this.aShortArray22 = this.aClass98_1.aShortArray60;
			this.aShortArray18 = this.aClass98_1.aShortArray62;
			this.aByteArray8 = this.aClass98_1.aByteArray39;
			this.aShortArray21 = this.aClass98_1.aShortArray61;
			this.aClass98_1 = null;
		}
		this.aBoolean17 = true;
		this.method422();
	}

	@OriginalMember(owner = "client!at", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		if (this.aClass179_4 != null) {
			this.aClass179_4.anInterface3_7 = null;
		}
		this.aShort18 = (short) arg0;
		if (this.aClass179_3 != null) {
			this.aClass179_3.anInterface3_7 = null;
		}
	}

	@OriginalMember(owner = "client!at", name = "KA", descriptor = "()V")
	@Override
	protected void KA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt501; local7++) {
			this.anIntArray29[local7] = this.anIntArray29[local7] + 7 >> 4;
			this.anIntArray30[local7] = this.anIntArray30[local7] + 7 >> 4;
			this.anIntArray28[local7] = this.anIntArray28[local7] + 7 >> 4;
		}
		this.aBoolean16 = false;
		if (this.aClass179_1 != null) {
			this.aClass179_1.anInterface3_7 = null;
		}
	}

	@OriginalMember(owner = "client!at", name = "u", descriptor = "(SS)V")
	@Override
	public void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass106_Sub2_6.anInterface7_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt502; local11++) {
			if (arg0 == this.aShortArray15[local11]) {
				this.aShortArray15[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class150 local44 = local9.method78(arg0 & 0xFFFF);
			local31 = local44.aByte54;
			local33 = local44.aByte56;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(64) Class150 local64 = local9.method78(arg1 & 0xFFFF);
			local54 = local64.aByte56;
			local52 = local64.aByte54;
		}
		if (!(local52 != local31 | local54 != local33)) {
			return;
		}
		if (this.aClass66Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt510; local97++) {
				@Pc(104) Class66 local104 = this.aClass66Array1[local97];
				@Pc(109) Class62 local109 = this.aClass62Array1[local97];
				local109.anInt2036 = Static404.anIntArray530[this.aShortArray16[local104.anInt2088] & 0xFFFF] & 0xFFFFFF | local109.anInt2036 & 0xFF000000;
			}
		}
		if (this.aClass179_4 != null) {
			this.aClass179_4.anInterface3_7 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!at", name = "MA", descriptor = "()I")
	@Override
	public int MA() {
		if (!this.aBoolean16) {
			this.method413();
		}
		return this.aShort16;
	}

	@OriginalMember(owner = "client!at", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) Class96 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean16) {
			this.method413();
		}
		@Pc(16) int local16 = arg4 + this.aShort20;
		@Pc(21) int local21 = this.aShort16 + arg4;
		@Pc(26) int local26 = this.aShort14 + arg6;
		@Pc(32) int local32 = arg6 + this.aShort13;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt5778 + local21 >> arg2.anInt5779 >= arg2.anInt5777 || local26 < 0 || arg2.anInt5775 <= local32 + arg2.anInt5778 >> arg2.anInt5779)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt5778 + local21 >> arg3.anInt5779 >= arg3.anInt5777 || local26 < 0 || arg3.anInt5775 <= arg3.anInt5778 + local32 >> arg3.anInt5779) {
				return;
			}
		} else {
			local16 >>= arg2.anInt5779;
			local21 = arg2.anInt5778 + local21 - 1 >> arg2.anInt5779;
			local26 >>= arg2.anInt5779;
			local32 = arg2.anInt5778 + local32 - 1 >> arg2.anInt5779;
			if (arg2.ua(local16, local26) == arg5 && arg5 == arg2.ua(local21, local26) && arg5 == arg2.ua(local16, local32) && arg2.ua(local21, local32) == arg5) {
				return;
			}
		}
		@Pc(200) int local200;
		if (arg0 == 1) {
			for (local200 = 0; local200 < this.anInt512; local200++) {
				this.anIntArray30[local200] = this.anIntArray30[local200] + arg2.ca(this.anIntArray29[local200] + arg4, this.anIntArray28[local200] + arg6) - arg5;
			}
		} else {
			@Pc(263) int local263;
			@Pc(271) int local271;
			if (arg0 == 2) {
				@Pc(476) short local476 = this.aShort19;
				if (local476 == 0) {
					return;
				}
				for (local263 = 0; local263 < this.anInt512; local263++) {
					local271 = (this.anIntArray30[local263] << 16) / local476;
					if (local271 < arg1) {
						this.anIntArray30[local263] += (arg2.ca(this.anIntArray29[local263] + arg4, this.anIntArray28[local263] + arg6) - arg5) * (arg1 - local271) / arg1;
					}
				}
			} else {
				@Pc(279) int local279;
				if (arg0 == 3) {
					local200 = (arg1 & 0xFF) * 4;
					local263 = (arg1 >> 8 & 0xFF) * 4;
					local271 = (arg1 >> 16 & 0xFF) << 6;
					local279 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local200 >> 1) < 0 || arg2.anInt5777 << arg2.anInt5779 <= arg4 + (local200 >> 1) + arg2.anInt5778 || arg6 - (local263 >> 1) < 0 || arg6 + (local263 >> 1) + arg2.anInt5778 >= arg2.anInt5775 << arg2.anInt5779) {
						return;
					}
					this.method6206(local200, arg6, local271, arg5, local279, arg4, arg2, local263);
				} else if (arg0 == 4) {
					local200 = this.aShort15 - this.aShort19;
					for (local263 = 0; local263 < this.anInt512; local263++) {
						this.anIntArray30[local263] = this.anIntArray30[local263] + arg3.ca(arg4 + this.anIntArray29[local263], this.anIntArray28[local263] - -arg6) + local200 - arg5;
					}
				} else if (arg0 == 5) {
					local200 = this.aShort15 - this.aShort19;
					for (local263 = 0; local263 < this.anInt512; local263++) {
						local271 = this.anIntArray29[local263] + arg4;
						local279 = this.anIntArray28[local263] + arg6;
						@Pc(380) int local380 = arg2.ca(local271, local279);
						@Pc(385) int local385 = arg3.ca(local271, local279);
						@Pc(390) int local390 = local380 - local385;
						this.anIntArray30[local263] = local380 + ((this.anIntArray30[local263] << 8) / local200 * local390 >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass179_1 != null) {
			this.aClass179_1.anInterface3_7 = null;
		}
		this.aBoolean16 = false;
	}

	@OriginalMember(owner = "client!at", name = "n", descriptor = "(III)V")
	@Override
	public void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt512; local3++) {
			if (arg0 != 128) {
				this.anIntArray29[local3] = arg0 * this.anIntArray29[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray30[local3] = this.anIntArray30[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray28[local3] = this.anIntArray28[local3] * arg2 >> 7;
			}
		}
		this.aBoolean16 = false;
		if (this.aClass179_1 != null) {
			this.aClass179_1.anInterface3_7 = null;
		}
	}

	@OriginalMember(owner = "client!at", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean16) {
			this.method413();
		}
		return this.aShort15;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZILclient!at;ZLclient!at;I)Lclient!e;")
	private Class17 method421(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class17_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class17_Sub1 arg3, @OriginalArg(5) int arg4) {
		arg3.aShort18 = this.aShort18;
		arg3.anInt501 = this.anInt501;
		arg3.anInt512 = this.anInt512;
		arg3.aShort17 = this.aShort17;
		arg3.anInt472 = this.anInt472;
		arg3.aByte11 = 0;
		arg3.anInt480 = this.anInt480;
		arg3.anInt502 = this.anInt502;
		arg3.anInt477 = arg4;
		arg3.anInt510 = this.anInt510;
		arg3.anInt511 = this.anInt511;
		@Pc(53) boolean local53 = Static407.method2043(arg4, this.anInt511);
		@Pc(59) boolean local59 = Static432.method5784(arg4, this.anInt511);
		@Pc(65) boolean local65 = Static430.method5720(arg4, this.anInt511);
		@Pc(71) boolean local71 = local65 | local59 | local53;
		@Pc(190) int local190;
		if (local71) {
			if (!local53) {
				arg3.anIntArray29 = this.anIntArray29;
			} else if (arg1.anIntArray29 == null || this.anInt501 > arg1.anIntArray29.length) {
				arg3.anIntArray29 = arg1.anIntArray29 = new int[this.anInt501];
			} else {
				arg3.anIntArray29 = arg1.anIntArray29;
			}
			if (!local59) {
				arg3.anIntArray30 = this.anIntArray30;
			} else if (arg1.anIntArray30 == null || this.anInt501 > arg1.anIntArray30.length) {
				arg3.anIntArray30 = arg1.anIntArray30 = new int[this.anInt501];
			} else {
				arg3.anIntArray30 = arg1.anIntArray30;
			}
			if (!local65) {
				arg3.anIntArray28 = this.anIntArray28;
			} else if (arg1.anIntArray28 == null || this.anInt501 > arg1.anIntArray28.length) {
				arg3.anIntArray28 = arg1.anIntArray28 = new int[this.anInt501];
			} else {
				arg3.anIntArray28 = arg1.anIntArray28;
			}
			for (local190 = 0; local190 < this.anInt501; local190++) {
				if (local53) {
					arg3.anIntArray29[local190] = this.anIntArray29[local190];
				}
				if (local59) {
					arg3.anIntArray30[local190] = this.anIntArray30[local190];
				}
				if (local65) {
					arg3.anIntArray28[local190] = this.anIntArray28[local190];
				}
			}
		} else {
			arg3.anIntArray29 = this.anIntArray29;
			arg3.anIntArray28 = this.anIntArray28;
			arg3.anIntArray30 = this.anIntArray30;
		}
		if (Static157.method2625(arg4, this.anInt511)) {
			if (arg0) {
				arg3.aByte11 = (byte) (arg3.aByte11 | 0x1);
			}
			arg3.aClass179_1 = arg1.aClass179_1;
			arg3.aClass179_1.aByte70 = this.aClass179_1.aByte70;
			arg3.aClass179_1.anInterface3_7 = this.aClass179_1.anInterface3_7;
		} else if (Static77.method1422(arg4, this.anInt511)) {
			arg3.aClass179_1 = this.aClass179_1;
		} else {
			arg3.aClass179_1 = null;
		}
		if (Static443.method6128(arg4, this.anInt511)) {
			if (arg1.aShortArray16 == null || this.anInt502 > arg1.aShortArray16.length) {
				arg3.aShortArray16 = arg1.aShortArray16 = new short[this.anInt502];
			} else {
				arg3.aShortArray16 = arg1.aShortArray16;
			}
			for (local190 = 0; local190 < this.anInt502; local190++) {
				arg3.aShortArray16[local190] = this.aShortArray16[local190];
			}
		} else {
			arg3.aShortArray16 = this.aShortArray16;
		}
		if (Static175.method2965(this.anInt511, arg4)) {
			if (arg1.aByteArray7 == null || arg1.aByteArray7.length < this.anInt502) {
				arg3.aByteArray7 = arg1.aByteArray7 = new byte[this.anInt502];
			} else {
				arg3.aByteArray7 = arg1.aByteArray7;
			}
			for (local190 = 0; local190 < this.anInt502; local190++) {
				arg3.aByteArray7[local190] = this.aByteArray7[local190];
			}
		} else {
			arg3.aByteArray7 = this.aByteArray7;
		}
		if (Static427.method5765(this.anInt511, arg4)) {
			arg3.aClass179_4 = arg1.aClass179_4;
			if (arg0) {
				arg3.aByte11 = (byte) (arg3.aByte11 | 0x2);
			}
			arg3.aClass179_4.aByte70 = this.aClass179_4.aByte70;
			arg3.aClass179_4.anInterface3_7 = this.aClass179_4.anInterface3_7;
		} else if (Static201.method3241(this.anInt511, arg4)) {
			arg3.aClass179_4 = this.aClass179_4;
		} else {
			arg3.aClass179_4 = null;
		}
		@Pc(551) int local551;
		if (Static140.method2263(this.anInt511, arg4)) {
			if (arg1.aShortArray21 == null || arg1.aShortArray21.length < this.anInt472) {
				local190 = this.anInt472;
				arg3.aShortArray22 = arg1.aShortArray22 = new short[local190];
				arg3.aShortArray18 = arg1.aShortArray18 = new short[local190];
				arg3.aShortArray21 = arg1.aShortArray21 = new short[local190];
			} else {
				arg3.aShortArray18 = arg1.aShortArray18;
				arg3.aShortArray22 = arg1.aShortArray22;
				arg3.aShortArray21 = arg1.aShortArray21;
			}
			if (this.aClass98_1 == null) {
				for (local190 = 0; local190 < this.anInt472; local190++) {
					arg3.aShortArray21[local190] = this.aShortArray21[local190];
					arg3.aShortArray18[local190] = this.aShortArray18[local190];
					arg3.aShortArray22[local190] = this.aShortArray22[local190];
				}
			} else {
				if (arg1.aClass98_1 == null) {
					arg1.aClass98_1 = new Class98();
				}
				@Pc(535) Class98 local535 = arg3.aClass98_1 = arg1.aClass98_1;
				if (local535.aShortArray61 == null || local535.aShortArray61.length < this.anInt472) {
					local551 = this.anInt472;
					local535.aShortArray62 = new short[local551];
					local535.aShortArray61 = new short[local551];
					local535.aShortArray60 = new short[local551];
					local535.aByteArray39 = new byte[local551];
				}
				for (local551 = 0; local551 < this.anInt472; local551++) {
					arg3.aShortArray21[local551] = this.aShortArray21[local551];
					arg3.aShortArray18[local551] = this.aShortArray18[local551];
					arg3.aShortArray22[local551] = this.aShortArray22[local551];
					local535.aShortArray61[local551] = this.aClass98_1.aShortArray61[local551];
					local535.aShortArray62[local551] = this.aClass98_1.aShortArray62[local551];
					local535.aShortArray60[local551] = this.aClass98_1.aShortArray60[local551];
					local535.aByteArray39[local551] = this.aClass98_1.aByteArray39[local551];
				}
			}
			arg3.aByteArray8 = this.aByteArray8;
		} else {
			arg3.aShortArray18 = this.aShortArray18;
			arg3.aClass98_1 = this.aClass98_1;
			arg3.aShortArray22 = this.aShortArray22;
			arg3.aByteArray8 = this.aByteArray8;
			arg3.aShortArray21 = this.aShortArray21;
		}
		if (Static132.method2165(this.anInt511, arg4)) {
			if (arg0) {
				arg3.aByte11 = (byte) (arg3.aByte11 | 0x4);
			}
			arg3.aClass179_3 = arg1.aClass179_3;
			arg3.aClass179_3.anInterface3_7 = this.aClass179_3.anInterface3_7;
			arg3.aClass179_3.aByte70 = this.aClass179_3.aByte70;
		} else if (Static350.method4972(arg4, this.anInt511)) {
			arg3.aClass179_3 = this.aClass179_3;
		} else {
			arg3.aClass179_3 = null;
		}
		if (Static1.method37(this.anInt511, arg4)) {
			if (arg1.aFloatArray2 == null || arg1.aFloatArray2.length < this.anInt502) {
				local190 = this.anInt472;
				arg3.aFloatArray2 = arg1.aFloatArray2 = new float[local190];
				arg3.aFloatArray3 = arg1.aFloatArray3 = new float[local190];
			} else {
				arg3.aFloatArray2 = arg1.aFloatArray2;
				arg3.aFloatArray3 = arg1.aFloatArray3;
			}
			for (local190 = 0; local190 < this.anInt472; local190++) {
				arg3.aFloatArray2[local190] = this.aFloatArray2[local190];
				arg3.aFloatArray3[local190] = this.aFloatArray3[local190];
			}
		} else {
			arg3.aFloatArray2 = this.aFloatArray2;
			arg3.aFloatArray3 = this.aFloatArray3;
		}
		if (Static408.method5554(this.anInt511, arg4)) {
			arg3.aClass179_2 = arg1.aClass179_2;
			if (arg0) {
				arg3.aByte11 = (byte) (arg3.aByte11 | 0x8);
			}
			arg3.aClass179_2.anInterface3_7 = this.aClass179_2.anInterface3_7;
			arg3.aClass179_2.aByte70 = this.aClass179_2.aByte70;
		} else if (Static72.method1375(arg4, this.anInt511)) {
			arg3.aClass179_2 = this.aClass179_2;
		} else {
			arg3.aClass179_2 = null;
		}
		if (Static288.method4245(this.anInt511, arg4)) {
			if (arg1.aShortArray14 == null || this.anInt502 > arg1.aShortArray14.length) {
				local190 = this.anInt502;
				arg3.aShortArray23 = arg1.aShortArray23 = new short[local190];
				arg3.aShortArray14 = arg1.aShortArray14 = new short[local190];
				arg3.aShortArray17 = arg1.aShortArray17 = new short[local190];
			} else {
				arg3.aShortArray23 = arg1.aShortArray23;
				arg3.aShortArray17 = arg1.aShortArray17;
				arg3.aShortArray14 = arg1.aShortArray14;
			}
			for (local190 = 0; local190 < this.anInt502; local190++) {
				arg3.aShortArray14[local190] = this.aShortArray14[local190];
				arg3.aShortArray23[local190] = this.aShortArray23[local190];
				arg3.aShortArray17[local190] = this.aShortArray17[local190];
			}
		} else {
			arg3.aShortArray14 = this.aShortArray14;
			arg3.aShortArray23 = this.aShortArray23;
			arg3.aShortArray17 = this.aShortArray17;
		}
		if (Static134.method2185(arg4, this.anInt511)) {
			arg3.aClass181_1 = arg1.aClass181_1;
			if (arg0) {
				arg3.aByte11 = (byte) (arg3.aByte11 | 0x10);
			}
			arg3.aClass181_1.anInterface10_5 = this.aClass181_1.anInterface10_5;
		} else if (Static373.method5208(arg4, this.anInt511)) {
			arg3.aClass181_1 = this.aClass181_1;
		} else {
			arg3.aClass181_1 = null;
		}
		if (Static313.method4479(arg4, this.anInt511)) {
			if (arg1.aShortArray15 == null || this.anInt502 > arg1.aShortArray15.length) {
				local190 = this.anInt502;
				arg3.aShortArray15 = arg1.aShortArray15 = new short[local190];
			} else {
				arg3.aShortArray15 = arg1.aShortArray15;
			}
			for (local190 = 0; local190 < this.anInt502; local190++) {
				arg3.aShortArray15[local190] = this.aShortArray15[local190];
			}
		} else {
			arg3.aShortArray15 = this.aShortArray15;
		}
		if (!Static117.method1923(this.anInt511, arg4)) {
			arg3.aClass62Array1 = this.aClass62Array1;
		} else if (arg1.aClass62Array1 == null || this.anInt510 > arg1.aClass62Array1.length) {
			local190 = this.anInt510;
			arg3.aClass62Array1 = arg1.aClass62Array1 = new Class62[local190];
			for (local551 = 0; local551 < this.anInt510; local551++) {
				arg3.aClass62Array1[local551] = this.aClass62Array1[local551].method1519();
			}
		} else {
			arg3.aClass62Array1 = arg1.aClass62Array1;
			for (local190 = 0; local190 < this.anInt510; local190++) {
				arg3.aClass62Array1[local190].method1521(this.aClass62Array1[local190]);
			}
		}
		arg3.aClass114Array1 = this.aClass114Array1;
		arg3.aClass94Array1 = this.aClass94Array1;
		arg3.anIntArrayArray8 = this.anIntArrayArray8;
		if (this.aBoolean16) {
			arg3.aShort21 = this.aShort21;
			arg3.aBoolean16 = true;
			arg3.aShort16 = this.aShort16;
			arg3.aShort15 = this.aShort15;
			arg3.aShort20 = this.aShort20;
			arg3.aShort13 = this.aShort13;
			arg3.aShort19 = this.aShort19;
			arg3.aShort14 = this.aShort14;
		} else {
			arg3.aBoolean16 = false;
		}
		arg3.aShortArray13 = this.aShortArray13;
		arg3.anIntArrayArray7 = this.anIntArrayArray7;
		arg3.aShortArray19 = this.aShortArray19;
		arg3.anIntArray31 = this.anIntArray31;
		arg3.anIntArrayArray6 = this.anIntArrayArray6;
		arg3.aShortArray20 = this.aShortArray20;
		arg3.anIntArray27 = this.anIntArray27;
		arg3.aClass66Array1 = this.aClass66Array1;
		return arg3;
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(I)V")
	private void method422() {
		if (!this.aBoolean17) {
			return;
		}
		this.aBoolean17 = false;
		if (this.aClass94Array1 == null && this.aClass114Array1 == null && this.aClass66Array1 == null) {
			if (this.anIntArray29 != null && !Static267.method3956(this.anInt477, this.anInt511)) {
				if (this.aClass179_1 != null && this.aClass179_1.anInterface3_7 == null) {
					this.aBoolean17 = true;
				} else {
					if (!this.aBoolean16) {
						this.method413();
					}
					this.anIntArray29 = null;
				}
			}
			if (this.anIntArray30 != null && !Static190.method3098(this.anInt477, this.anInt511)) {
				if (this.aClass179_1 != null && this.aClass179_1.anInterface3_7 == null) {
					this.aBoolean17 = true;
				} else {
					if (!this.aBoolean16) {
						this.method413();
					}
					this.anIntArray30 = null;
				}
			}
			if (this.anIntArray28 != null && !Static172.method2909(this.anInt511, this.anInt477)) {
				if (this.aClass179_1 != null && this.aClass179_1.anInterface3_7 == null) {
					this.aBoolean17 = true;
				} else {
					if (!this.aBoolean16) {
						this.method413();
					}
					this.anIntArray28 = null;
				}
			}
		}
		if (this.aShortArray20 != null && this.anIntArray29 == null && this.anIntArray30 == null && this.anIntArray28 == null) {
			this.aShortArray20 = null;
			this.anIntArray27 = null;
		}
		if (this.aByteArray8 != null && !Static200.method3202(this.anInt477, this.anInt511)) {
			if (this.aClass179_3 == null) {
				if (this.aClass179_4 != null && this.aClass179_4.anInterface3_7 == null) {
					this.aBoolean17 = true;
				} else {
					this.aByteArray8 = null;
					this.aShortArray21 = this.aShortArray18 = this.aShortArray22 = null;
				}
			} else if (this.aClass179_3.anInterface3_7 == null) {
				this.aBoolean17 = true;
			} else {
				this.aByteArray8 = null;
				this.aShortArray21 = this.aShortArray18 = this.aShortArray22 = null;
			}
		}
		if (this.aShortArray16 != null && !Static21.method5156(this.anInt477, this.anInt511)) {
			if (this.aClass179_4 != null && this.aClass179_4.anInterface3_7 == null) {
				this.aBoolean17 = true;
			} else {
				this.aShortArray16 = null;
			}
		}
		if (this.aByteArray7 != null && !Static303.method4389(this.anInt511, this.anInt477)) {
			if (this.aClass179_4 != null && this.aClass179_4.anInterface3_7 == null) {
				this.aBoolean17 = true;
			} else {
				this.aByteArray7 = null;
			}
		}
		if (this.aFloatArray2 != null && !Static78.method1445(this.anInt477, this.anInt511)) {
			if (this.aClass179_2 != null && this.aClass179_2.anInterface3_7 == null) {
				this.aBoolean17 = true;
			} else {
				this.aFloatArray2 = this.aFloatArray3 = null;
			}
		}
		if (this.aShortArray15 != null && !Static416.method5653(this.anInt511, this.anInt477)) {
			if (this.aClass179_4 != null && this.aClass179_4.anInterface3_7 == null) {
				this.aBoolean17 = true;
			} else {
				this.aShortArray15 = null;
			}
		}
		if (this.aShortArray14 != null && !Static37.method736(this.anInt477, this.anInt511)) {
			if ((this.aClass181_1 == null || this.aClass181_1.anInterface10_5 != null) && (this.aClass179_4 == null || this.aClass179_4.anInterface3_7 != null)) {
				this.aShortArray14 = this.aShortArray23 = this.aShortArray17 = null;
			} else {
				this.aBoolean17 = true;
			}
		}
		if (this.anIntArrayArray6 != null && !Static445.method5852(this.anInt511, this.anInt477)) {
			this.aShortArray13 = null;
			this.anIntArrayArray6 = null;
		}
		if (this.anIntArrayArray7 != null && !Static191.method3102(this.anInt511, this.anInt477)) {
			this.anIntArrayArray7 = null;
			this.aShortArray19 = null;
		}
		if (this.anIntArrayArray8 != null && !Static435.method5860(this.anInt511, this.anInt477)) {
			this.anIntArrayArray8 = null;
		}
		if (this.anIntArray31 != null && (this.anInt477 & 0x800) == 0 && (this.anInt477 & 0x40000) == 0) {
			this.anIntArray31 = null;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	@Override
	public void method6199(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class17_Sub1 local8 = (Class17_Sub1) arg0;
		if (this.anInt502 == 0 || local8.anInt502 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt512;
		@Pc(21) int[] local21 = local8.anIntArray29;
		@Pc(24) int[] local24 = local8.anIntArray30;
		@Pc(27) int[] local27 = local8.anIntArray28;
		@Pc(30) short[] local30 = local8.aShortArray21;
		@Pc(33) short[] local33 = local8.aShortArray18;
		@Pc(36) short[] local36 = local8.aShortArray22;
		@Pc(39) byte[] local39 = local8.aByteArray8;
		@Pc(54) short[] local54;
		@Pc(58) short[] local58;
		@Pc(50) short[] local50;
		@Pc(46) byte[] local46;
		if (this.aClass98_1 == null) {
			local54 = null;
			local58 = null;
			local46 = null;
			local50 = null;
		} else {
			local46 = this.aClass98_1.aByteArray39;
			local50 = this.aClass98_1.aShortArray60;
			local54 = this.aClass98_1.aShortArray61;
			local58 = this.aClass98_1.aShortArray62;
		}
		@Pc(77) short[] local77;
		@Pc(73) short[] local73;
		@Pc(79) short[] local79;
		@Pc(75) byte[] local75;
		if (local8.aClass98_1 == null) {
			local73 = null;
			local75 = null;
			local77 = null;
			local79 = null;
		} else {
			local77 = local8.aClass98_1.aShortArray61;
			local75 = local8.aClass98_1.aByteArray39;
			local73 = local8.aClass98_1.aShortArray62;
			local79 = local8.aClass98_1.aShortArray60;
		}
		@Pc(100) int[] local100 = local8.anIntArray27;
		@Pc(103) short[] local103 = local8.aShortArray20;
		if (!local8.aBoolean16) {
			local8.method413();
		}
		@Pc(112) short local112 = local8.aShort19;
		@Pc(115) short local115 = local8.aShort15;
		@Pc(118) short local118 = local8.aShort20;
		@Pc(121) short local121 = local8.aShort16;
		@Pc(124) short local124 = local8.aShort14;
		@Pc(127) short local127 = local8.aShort13;
		for (@Pc(129) int local129 = 0; local129 < this.anInt512; local129++) {
			@Pc(139) int local139 = this.anIntArray30[local129] - arg2;
			if (local139 >= local112 && local115 >= local139) {
				@Pc(163) int local163 = this.anIntArray29[local129] - arg1;
				if (local163 >= local118 && local121 >= local163) {
					@Pc(183) int local183 = this.anIntArray28[local129] - arg3;
					if (local183 >= local124 && local127 >= local183) {
						@Pc(197) int local197 = -1;
						@Pc(202) int local202 = this.anIntArray27[local129];
						@Pc(209) int local209 = this.anIntArray27[local129 + 1];
						for (@Pc(211) int local211 = local202; local211 < local209; local211++) {
							local197 = this.aShortArray20[local211] - 1;
							if (local197 == -1 || this.aByteArray8[local197] != 0) {
								break;
							}
						}
						if (local197 != -1) {
							for (@Pc(243) int local243 = 0; local243 < local18; local243++) {
								if (local21[local243] == local163 && local27[local243] == local183 && local139 == local24[local243]) {
									local209 = local100[local243 + 1];
									local202 = local100[local243];
									@Pc(280) int local280 = -1;
									for (@Pc(282) int local282 = local202; local282 < local209; local282++) {
										local280 = local103[local282] - 1;
										if (local280 == -1 || local39[local280] != 0) {
											break;
										}
									}
									if (local280 != -1) {
										if (local54 == null) {
											this.aClass98_1 = new Class98();
											local54 = this.aClass98_1.aShortArray61 = Static144.method2316(this.aShortArray21);
											local58 = this.aClass98_1.aShortArray62 = Static144.method2316(this.aShortArray18);
											local50 = this.aClass98_1.aShortArray60 = Static144.method2316(this.aShortArray22);
											local46 = this.aClass98_1.aByteArray39 = Static360.method5071(this.aByteArray8);
										}
										if (local77 == null) {
											@Pc(364) Class98 local364 = local8.aClass98_1 = new Class98();
											local77 = local364.aShortArray61 = Static144.method2316(local30);
											local73 = local364.aShortArray62 = Static144.method2316(local33);
											local79 = local364.aShortArray60 = Static144.method2316(local36);
											local75 = local364.aByteArray39 = Static360.method5071(local39);
										}
										@Pc(397) short local397 = this.aShortArray21[local197];
										@Pc(402) short local402 = this.aShortArray18[local197];
										@Pc(407) short local407 = this.aShortArray22[local197];
										@Pc(412) byte local412 = this.aByteArray8[local197];
										local209 = local100[local243 + 1];
										local202 = local100[local243];
										@Pc(432) int local432;
										for (@Pc(424) int local424 = local202; local424 < local209; local424++) {
											local432 = local103[local424] - 1;
											if (local432 == -1) {
												break;
											}
											if (local75[local432] != 0) {
												local77[local432] += local397;
												local73[local432] += local402;
												local79[local432] += local407;
												local75[local432] += local412;
											}
										}
										local202 = this.anIntArray27[local129];
										local209 = this.anIntArray27[local129 + 1];
										local412 = local39[local280];
										local407 = local36[local280];
										local397 = local30[local280];
										local402 = local33[local280];
										for (local432 = local202; local432 < local209; local432++) {
											@Pc(518) int local518 = this.aShortArray20[local432] - 1;
											if (local518 == -1) {
												break;
											}
											if (local46[local518] != 0) {
												local54[local518] += local397;
												local58[local518] += local402;
												local50[local518] += local407;
												local46[local518] += local412;
											}
										}
										if (this.aClass179_3 == null && this.aClass179_4 != null) {
											this.aClass179_4.anInterface3_7 = null;
										}
										if (this.aClass179_3 != null) {
											this.aClass179_3.anInterface3_7 = null;
										}
										if (local8.aClass179_3 == null && local8.aClass179_4 != null) {
											local8.aClass179_4.anInterface3_7 = null;
										}
										if (local8.aClass179_3 != null) {
											local8.aClass179_3.anInterface3_7 = null;
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

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt512; local3++) {
			if (arg0 != 0) {
				this.anIntArray29[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray30[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray28[local3] += arg2;
			}
		}
		this.aBoolean16 = false;
		if (this.aClass179_1 != null) {
			this.aClass179_1.anInterface3_7 = null;
		}
	}

	@OriginalMember(owner = "client!at", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	@Override
	public Class1_Sub1_Sub10 EA(@OriginalArg(0) Class1_Sub1_Sub10 arg0) {
		if (this.anInt472 == 0) {
			return null;
		}
		if (!this.aBoolean16) {
			this.method413();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass106_Sub2_6.anInt3766 <= 0) {
			local43 = this.aShort20 - (this.aClass106_Sub2_6.anInt3766 * this.aShort19 >> 8) >> this.aClass106_Sub2_6.anInt3734;
			local60 = this.aShort16 - (this.aShort15 * this.aClass106_Sub2_6.anInt3766 >> 8) >> this.aClass106_Sub2_6.anInt3734;
		} else {
			local43 = this.aShort20 - (this.aShort15 * this.aClass106_Sub2_6.anInt3766 >> 8) >> this.aClass106_Sub2_6.anInt3734;
			local60 = this.aShort16 - (this.aClass106_Sub2_6.anInt3766 * this.aShort19 >> 8) >> this.aClass106_Sub2_6.anInt3734;
		}
		@Pc(119) int local119;
		@Pc(136) int local136;
		if (this.aClass106_Sub2_6.anInt3754 > 0) {
			local119 = this.aShort14 - (this.aShort15 * this.aClass106_Sub2_6.anInt3754 >> 8) >> this.aClass106_Sub2_6.anInt3734;
			local136 = this.aShort13 - (this.aClass106_Sub2_6.anInt3754 * this.aShort19 >> 8) >> this.aClass106_Sub2_6.anInt3734;
		} else {
			local119 = this.aShort14 - (this.aClass106_Sub2_6.anInt3754 * this.aShort19 >> 8) >> this.aClass106_Sub2_6.anInt3734;
			local136 = this.aShort13 - (this.aClass106_Sub2_6.anInt3754 * this.aShort15 >> 8) >> this.aClass106_Sub2_6.anInt3734;
		}
		@Pc(177) int local177 = local60 + 1 - local43;
		@Pc(183) int local183 = local136 + 1 - local119;
		@Pc(186) Class1_Sub1_Sub10_Sub1 local186 = (Class1_Sub1_Sub10_Sub1) arg0;
		@Pc(196) Class1_Sub1_Sub10_Sub1 local196;
		if (local186 != null && local186.method3401(local183, local177)) {
			local196 = local186;
			local186.method3403();
		} else {
			local196 = new Class1_Sub1_Sub10_Sub1(this.aClass106_Sub2_6, local177, local183);
		}
		local196.method3404(local119, local136, local60, local43);
		this.method409(local196);
		return local196;
	}

	@OriginalMember(owner = "client!at", name = "h", descriptor = "()Z")
	@Override
	protected boolean h() {
		if (this.anIntArrayArray7 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt501; local12++) {
			this.anIntArray29[local12] <<= 0x4;
			this.anIntArray30[local12] <<= 0x4;
			this.anIntArray28[local12] <<= 0x4;
		}
		Static48.anInt1180 = 0;
		Static311.anInt5835 = 0;
		Static181.anInt3934 = 0;
		return true;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method6203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class40_Sub2 local8 = (Class40_Sub2) arg2;
		@Pc(12) Class40_Sub2 local12 = this.aClass106_Sub2_6.aClass40_Sub2_4;
		@Pc(33) float local33 = local8.aFloat78 * local12.aFloat72 + local12.aFloat71 * local8.aFloat80 + local12.aFloat77 * local8.aFloat75 + local12.aFloat78;
		@Pc(54) float local54 = local12.aFloat80 + local12.aFloat73 * local8.aFloat75 + local12.aFloat82 * local8.aFloat80 + local12.aFloat76 * local8.aFloat78;
		Static92.aFloat12 = local8.aFloat73 * local12.aFloat82 + local12.aFloat76 * local8.aFloat77 + local8.aFloat79 * local12.aFloat73;
		Static369.aFloat95 = local12.aFloat79 * local8.aFloat74 + local12.aFloat81 * local8.aFloat76 + local8.aFloat72 * local12.aFloat74;
		Static308.aFloat90 = local12.aFloat77 * local8.aFloat74 + local8.aFloat76 * local12.aFloat71 + local8.aFloat72 * local12.aFloat72;
		Static316.aFloat91 = local8.aFloat77 * local12.aFloat74 + local8.aFloat73 * local12.aFloat81 + local12.aFloat79 * local8.aFloat79;
		Static305.aFloat88 = local12.aFloat74 * local8.aFloat71 + local8.aFloat82 * local12.aFloat81 + local12.aFloat79 * local8.aFloat81;
		Static100.aFloat14 = local12.aFloat77 * local8.aFloat81 + local8.aFloat71 * local12.aFloat72 + local12.aFloat71 * local8.aFloat82;
		@Pc(183) float local183 = local12.aFloat75 + local12.aFloat79 * local8.aFloat75 + local8.aFloat78 * local12.aFloat74 + local12.aFloat81 * local8.aFloat80;
		Static116.aFloat17 = local12.aFloat71 * local8.aFloat73 + local8.aFloat77 * local12.aFloat72 + local8.aFloat79 * local12.aFloat77;
		Static197.aFloat62 = local12.aFloat82 * local8.aFloat82 + local8.aFloat71 * local12.aFloat76 + local8.aFloat81 * local12.aFloat73;
		Static336.aFloat92 = local12.aFloat73 * local8.aFloat74 + local8.aFloat76 * local12.aFloat82 + local12.aFloat76 * local8.aFloat72;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass106_Sub2_6.anInt3752;
		@Pc(255) int local255 = this.aClass106_Sub2_6.anInt3758;
		if (!this.aBoolean16) {
			this.method413();
		}
		Static232.anIntArray435[0] = this.aShort20;
		Static138.anIntArray283[0] = this.aShort19;
		Static323.anIntArray559[0] = this.aShort14;
		Static232.anIntArray435[1] = this.aShort16;
		Static138.anIntArray283[1] = this.aShort19;
		Static323.anIntArray559[1] = this.aShort14;
		Static232.anIntArray435[2] = this.aShort20;
		Static138.anIntArray283[2] = this.aShort15;
		Static232.anIntArray435[3] = this.aShort16;
		Static323.anIntArray559[2] = this.aShort14;
		Static138.anIntArray283[3] = this.aShort15;
		Static323.anIntArray559[3] = this.aShort14;
		Static232.anIntArray435[4] = this.aShort20;
		Static138.anIntArray283[4] = this.aShort19;
		Static232.anIntArray435[5] = this.aShort16;
		Static323.anIntArray559[4] = this.aShort13;
		Static138.anIntArray283[5] = this.aShort19;
		Static232.anIntArray435[6] = this.aShort20;
		Static323.anIntArray559[5] = this.aShort13;
		Static138.anIntArray283[6] = this.aShort15;
		Static323.anIntArray559[6] = this.aShort13;
		Static232.anIntArray435[7] = this.aShort16;
		Static138.anIntArray283[7] = this.aShort15;
		Static323.anIntArray559[7] = this.aShort13;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(390) float local390;
		@Pc(395) float local395;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static232.anIntArray435[local383];
			local395 = Static138.anIntArray283[local383];
			local400 = Static323.anIntArray559[local383];
			local414 = local183 + local395 * Static305.aFloat88 + local390 * Static369.aFloat95 + Static316.aFloat91 * local400;
			local428 = Static308.aFloat90 * local390 + local395 * Static100.aFloat14 + local400 * Static116.aFloat17 + local33;
			local442 = Static92.aFloat12 * local400 + local390 * Static336.aFloat92 + Static197.aFloat62 * local395 + local54;
			if ((float) this.aClass106_Sub2_6.anInt3747 <= local414) {
				@Pc(461) float local461 = local428 * (float) local251 / local414 + (float) this.aClass106_Sub2_6.anInt3778;
				if (local461 > local243) {
					local243 = local461;
				}
				@Pc(479) float local479 = (float) this.aClass106_Sub2_6.anInt3756 + (float) local255 * local442 / local414;
				if (local241 > local461) {
					local241 = local461;
				}
				local239 = true;
				if (local245 > local479) {
					local245 = local479;
				}
				if (local247 < local479) {
					local247 = local479;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && local243 > (float) arg0 && (float) arg1 > local245 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.anInt472 > this.aClass106_Sub2_6.anIntArray362.length) {
				this.aClass106_Sub2_6.anIntArray362 = new int[this.anInt472];
				this.aClass106_Sub2_6.anIntArray363 = new int[this.anInt472];
			}
			@Pc(552) int[] local552 = this.aClass106_Sub2_6.anIntArray362;
			@Pc(556) int[] local556 = this.aClass106_Sub2_6.anIntArray363;
			@Pc(632) int local632;
			for (@Pc(558) int local558 = 0; local558 < this.anInt512; local558++) {
				local390 = this.anIntArray29[local558];
				local395 = this.anIntArray30[local558];
				local400 = this.anIntArray28[local558];
				local414 = local400 * Static316.aFloat91 + Static369.aFloat95 * local390 + Static305.aFloat88 * local395 + local183;
				local428 = local400 * Static116.aFloat17 + local395 * Static100.aFloat14 + local390 * Static308.aFloat90 + local33;
				local442 = local54 + local390 * Static336.aFloat92 + local395 * Static197.aFloat62 + local400 * Static92.aFloat12;
				@Pc(639) int local639;
				@Pc(641) int local641;
				@Pc(650) int local650;
				if ((float) this.aClass106_Sub2_6.anInt3747 <= local414) {
					local632 = (int) ((float) this.aClass106_Sub2_6.anInt3778 + local428 * (float) local251 / local414);
					local639 = (int) ((float) local255 * local442 / local414 + (float) this.aClass106_Sub2_6.anInt3756);
					local641 = this.anIntArray27[local558];
					local650 = this.anIntArray27[local558 + 1];
					for (@Pc(712) int local712 = local641; local712 < local650; local712++) {
						@Pc(721) int local721 = this.aShortArray20[local712] - 1;
						if (local721 == -1) {
							break;
						}
						local552[local721] = local632;
						local556[local721] = local639;
					}
				} else {
					local632 = this.anIntArray27[local558];
					local639 = this.anIntArray27[local558 + 1];
					for (local641 = local632; local641 < local639; local641++) {
						local650 = this.aShortArray20[local641] - 1;
						if (local650 == -1) {
							break;
						}
						local552[this.aShortArray20[local641] - 1] = -999999;
					}
				}
			}
			for (local632 = 0; local632 < this.anInt502; local632++) {
				if (local552[this.aShortArray14[local632]] != -999999 && local552[this.aShortArray23[local632]] != -999999 && local552[this.aShortArray17[local632]] != -999999 && this.method416(arg0, local556[this.aShortArray14[local632]], local552[this.aShortArray17[local632]], local556[this.aShortArray17[local632]], arg1, local552[this.aShortArray23[local632]], local556[this.aShortArray23[local632]], local552[this.aShortArray14[local632]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "()[Lclient!gh;")
	@Override
	public Class94[] method6201() {
		return this.aClass94Array1;
	}
}
