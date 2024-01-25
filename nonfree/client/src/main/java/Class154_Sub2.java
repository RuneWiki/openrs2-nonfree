import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class154_Sub2 extends Class154 {

	@OriginalMember(owner = "client!wv", name = "A", descriptor = "I")
	private int anInt7630;

	@OriginalMember(owner = "client!wv", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!wv", name = "L", descriptor = "I")
	private int anInt7637;

	@OriginalMember(owner = "client!wv", name = "S", descriptor = "Lclient!er;")
	public Class71 aClass71_13;

	@OriginalMember(owner = "client!wv", name = "T", descriptor = "I")
	private int anInt7640;

	@OriginalMember(owner = "client!wv", name = "V", descriptor = "I")
	private int anInt7641;

	@OriginalMember(owner = "client!wv", name = "X", descriptor = "Lclient!gg;")
	private Interface4 anInterface4_7;

	@OriginalMember(owner = "client!wv", name = "Y", descriptor = "Lclient!er;")
	public Class71 aClass71_14;

	@OriginalMember(owner = "client!wv", name = "ab", descriptor = "Lclient!er;")
	private Class71 aClass71_15;

	@OriginalMember(owner = "client!wv", name = "cb", descriptor = "[Lclient!hv;")
	private Class10_Sub20[] aClass10_Sub20Array1;

	@OriginalMember(owner = "client!wv", name = "eb", descriptor = "Lclient!er;")
	public Class71 aClass71_16;

	@OriginalMember(owner = "client!wv", name = "u", descriptor = "Lclient!mf;")
	private final Class163 aClass163_46 = new Class163();

	@OriginalMember(owner = "client!wv", name = "P", descriptor = "[[I")
	private final int[][] anIntArrayArray69;

	@OriginalMember(owner = "client!wv", name = "G", descriptor = "Lclient!da;")
	public final Class50_Sub1 aClass50_Sub1_43;

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
	private final int anInt7618;

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "[[S")
	public final short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!wv", name = "O", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!wv", name = "H", descriptor = "[[B")
	private final byte[][] aByteArrayArray52;

	@OriginalMember(owner = "client!wv", name = "n", descriptor = "[[[Lclient!hv;")
	private Class10_Sub20[][][] aClass10_Sub20ArrayArrayArray1;

	@OriginalMember(owner = "client!wv", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!wv", name = "Q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!wv", name = "N", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
	public final int anInt7623;

	@OriginalMember(owner = "client!wv", name = "v", descriptor = "I")
	private final int anInt7625;

	@OriginalMember(owner = "client!wv", name = "bb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!wv", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!wv", name = "W", descriptor = "[[B")
	private byte[][] aByteArrayArray53;

	@OriginalMember(owner = "client!wv", name = "F", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!wv", name = "U", descriptor = "Lclient!mn;")
	private Class167 aClass167_39;

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "Lclient!dr;")
	private Class59 aClass59_2;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!da;IIII[[I[[II)V")
	public Class154_Sub2(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray69 = arg5;
		this.aClass50_Sub1_43 = arg0;
		this.anInt7618 = super.anInt7617 - 2;
		this.aShortArrayArray10 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.aByteArrayArray52 = new byte[arg3][arg4];
		this.aClass10_Sub20ArrayArrayArray1 = new Class10_Sub20[arg3][arg4][];
		this.aFloatArrayArray7 = new float[super.anInt7614 + 1][super.anInt7616 + 1];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.anInt7623 = arg2;
		this.anInt7625 = 0x1 << this.anInt7618;
		this.aFloatArrayArray8 = new float[super.anInt7614 + 1][super.anInt7616 + 1];
		this.aFloatArrayArray9 = new float[super.anInt7614 + 1][super.anInt7616 + 1];
		this.aByteArrayArray53 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; local117 < super.anInt7616; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt7614 > local121; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(156) int local156 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + local139 * local139 + arg7 * 4 * arg7)));
				this.aFloatArrayArray9[local121][local117] = local175 * (float) local139;
				this.aFloatArrayArray8[local121][local117] = (float) (-arg7 * 2) * local175;
				this.aFloatArrayArray7[local121][local117] = (float) local156 * local175;
			}
		}
		this.aClass167_39 = new Class167(128);
		if ((this.anInt7623 & 0x10) != 0) {
			this.aClass59_2 = new Class59(this.aClass50_Sub1_43, this);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method6083(arg1, arg0, arg4, arg2, arg3);
	}

	@OriginalMember(owner = "client!wv", name = "ua", descriptor = "(II)I")
	@Override
	public int ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray69[arg0][arg1];
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!bk;[I)V")
	@Override
	public void method6079(@OriginalArg(0) Class10_Sub4 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass163_46.method3613(new Class10_Sub42(this.aClass50_Sub1_43, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!wv", name = "qa", descriptor = "(III)V")
	@Override
	public void qa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray53[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray53[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!wv", name = "H", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class10_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass59_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass50_Sub1_43.anInt1427 >> 8) >> this.aClass50_Sub1_43.anInt1404;
			@Pc(38) int local38 = arg3 - (this.aClass50_Sub1_43.anInt1431 * arg2 >> 8) >> this.aClass50_Sub1_43.anInt1404;
			this.aClass59_2.method1519(arg0, local38, local24);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IILclient!tj;Z)V")
	private void method6082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10_Sub1_Sub7_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray10[arg0][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray13[arg0][arg1];
		@Pc(29) int local29 = local12.length;
		if (this.aClass50_Sub1_43.anIntArray108.length < local29) {
			this.aClass50_Sub1_43.anIntArray108 = new int[local29];
			this.aClass50_Sub1_43.anIntArray109 = new int[local29];
		}
		@Pc(49) int[] local49 = this.aClass50_Sub1_43.anIntArray108;
		@Pc(53) int[] local53 = this.aClass50_Sub1_43.anIntArray109;
		for (@Pc(55) int local55 = 0; local55 < local29; local55++) {
			local49[local55] = (local12[local55] & 0xFF) >> this.aClass50_Sub1_43.anInt1404;
			local53[local55] = (local19[local55] & 0xFF) >> this.aClass50_Sub1_43.anInt1404;
		}
		@Pc(87) int local87 = 0;
		while (local87 < local29) {
			@Pc(93) int local93 = local49[local87];
			@Pc(98) int local98 = local53[local87++];
			@Pc(102) int local102 = local49[local87];
			@Pc(107) int local107 = local53[local87++];
			@Pc(111) int local111 = local49[local87];
			@Pc(116) int local116 = local53[local87++];
			if (-((local111 - local102) * (local107 + -local98)) + (local93 - local102) * (local107 - local116) > 0) {
				arg2.method5200(local98, local107, local102, local111, local93, local116);
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!i;IIIIZ)Z")
	@Override
	public boolean method6077(@OriginalArg(0) Class10_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass59_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass50_Sub1_43.anInt1427 >> 8) >> this.aClass50_Sub1_43.anInt1404;
			@Pc(40) int local40 = arg3 - (this.aClass50_Sub1_43.anInt1431 * arg2 >> 8) >> this.aClass50_Sub1_43.anInt1404;
			return this.aClass59_2.method1518(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIZII[[Z)V")
	private void method6083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean[][] arg4) {
		if (this.aClass10_Sub20Array1 == null) {
			return;
		}
		@Pc(18) float local18 = this.aClass50_Sub1_43.aFloat29;
		@Pc(22) float local22 = this.aClass50_Sub1_43.aFloat36;
		@Pc(28) int local28 = arg3 + arg3 + 1;
		@Pc(32) int local32 = local28 * local28;
		if (this.aClass50_Sub1_43.anIntArray107.length < local32) {
			this.aClass50_Sub1_43.anIntArray107 = new int[local32];
		}
		if (this.aClass50_Sub1_43.aClass10_Sub8_Sub1_2.aByteArray44.length < this.anInt7637 * 2) {
			this.aClass50_Sub1_43.aClass10_Sub8_Sub1_2 = new Class10_Sub8_Sub1(this.anInt7637 * 2);
		}
		@Pc(71) int local71 = arg1 - arg3;
		@Pc(73) int local73 = local71;
		if (local71 < 0) {
			local71 = 0;
		}
		@Pc(84) int local84 = arg0 - arg3;
		@Pc(86) int local86 = local84;
		if (local84 < 0) {
			local84 = 0;
		}
		@Pc(97) int local97 = arg3 + arg1;
		if (local97 > super.anInt7614 - 1) {
			local97 = super.anInt7614 - 1;
		}
		@Pc(112) int local112 = arg3 + arg0;
		if (local112 > super.anInt7616 - 1) {
			local112 = super.anInt7616 - 1;
		}
		@Pc(129) int local129 = 0;
		@Pc(133) int[] local133 = this.aClass50_Sub1_43.anIntArray107;
		@Pc(145) int local145;
		for (@Pc(135) int local135 = local71; local135 <= local97; local135++) {
			@Pc(143) boolean[] local143 = arg4[local135 - local73];
			for (local145 = local84; local145 <= local112; local145++) {
				if (local143[local145 - local86]) {
					local133[local129++] = super.anInt7614 * local145 + local135;
				}
			}
		}
		this.aClass50_Sub1_43.method1265();
		this.aClass50_Sub1_43.method1298((this.anInt7623 & 0x7) != 0);
		for (@Pc(213) int local213 = 0; local213 < this.aClass10_Sub20Array1.length; local213++) {
			this.aClass10_Sub20Array1[local213].method2720(local133, local129);
		}
		if (!this.aClass163_46.method3617()) {
			local145 = this.aClass50_Sub1_43.anInt1424;
			@Pc(242) int local242 = this.aClass50_Sub1_43.anInt1426;
			this.aClass50_Sub1_43.Q(0, local242, this.aClass50_Sub1_43.anInt1415);
			this.aClass50_Sub1_43.da(local22, local18 - 4.0F);
			this.aClass50_Sub1_43.method1298(false);
			this.aClass50_Sub1_43.method1331(false);
			this.aClass50_Sub1_43.method1279(128);
			this.aClass50_Sub1_43.method1318(-2);
			this.aClass50_Sub1_43.method1295(this.aClass50_Sub1_43.aClass4_Sub1_3);
			this.aClass50_Sub1_43.method1316(8448, 7681);
			this.aClass50_Sub1_43.method1309(0, 34166, 770);
			this.aClass50_Sub1_43.method1275(34167, 0);
			for (@Pc(309) Class10 local309 = this.aClass163_46.method3620(); local309 != null; local309 = this.aClass163_46.method3621()) {
				@Pc(314) Class10_Sub42 local314 = (Class10_Sub42) local309;
				local314.method5415(arg0, arg1, arg3, arg4);
			}
			this.aClass50_Sub1_43.method1309(0, 5890, 768);
			this.aClass50_Sub1_43.method1275(5890, 0);
			this.aClass50_Sub1_43.method1295(null);
			this.aClass50_Sub1_43.Q(local145, local242, this.aClass50_Sub1_43.anInt1415);
		}
		if (this.aClass59_2 != null) {
			this.aClass50_Sub1_43.da(local22, local18 - 8.0F);
			this.aClass50_Sub1_43.method1265();
			this.aClass50_Sub1_43.method1283(this.aClass71_16, this.aClass71_13, null, null);
			this.aClass59_2.method1514(arg1, arg2, arg4, arg3, arg0);
		}
		this.aClass50_Sub1_43.da(local22, local18);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6075(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt7641 <= 0) {
			return;
		}
		this.aClass50_Sub1_43.method1323();
		this.aClass50_Sub1_43.method1273(false);
		this.aClass50_Sub1_43.method1298(false);
		this.aClass50_Sub1_43.method1293(false);
		this.aClass50_Sub1_43.method1331(false);
		this.aClass50_Sub1_43.method1279(0);
		this.aClass50_Sub1_43.method1318(-2);
		this.aClass50_Sub1_43.method1295(null);
		Static84.aFloatArray12[4] = 0.0F;
		Static84.aFloatArray12[0] = (float) 1024 / ((float) super.anInt7615 * 128.0F * (float) this.aClass50_Sub1_43.anInt1397);
		Static84.aFloatArray12[2] = 0.0F;
		Static84.aFloatArray12[10] = 0.0F;
		Static84.aFloatArray12[6] = 0.0F;
		Static84.aFloatArray12[15] = 1.0F;
		Static84.aFloatArray12[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass50_Sub1_43.anInt1397;
		Static84.aFloatArray12[3] = 0.0F;
		Static84.aFloatArray12[11] = 0.0F;
		Static84.aFloatArray12[9] = 0.0F;
		Static84.aFloatArray12[7] = 0.0F;
		Static84.aFloatArray12[1] = 0.0F;
		Static84.aFloatArray12[5] = (float) 1024 / ((float) this.aClass50_Sub1_43.anInt1334 * 128.0F * (float) super.anInt7615);
		Static84.aFloatArray12[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass50_Sub1_43.anInt1334;
		Static84.aFloatArray12[14] = 0.0F;
		Static84.aFloatArray12[8] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static84.aFloatArray12, 0);
		Static84.aFloatArray12[8] = 0.0F;
		Static84.aFloatArray12[9] = 1.0F;
		Static84.aFloatArray12[13] = 0.0F;
		Static84.aFloatArray12[2] = 0.0F;
		Static84.aFloatArray12[1] = 0.0F;
		Static84.aFloatArray12[7] = 0.0F;
		Static84.aFloatArray12[11] = 0.0F;
		Static84.aFloatArray12[14] = 0.0F;
		Static84.aFloatArray12[12] = 0.0F;
		Static84.aFloatArray12[0] = 1.0F;
		Static84.aFloatArray12[6] = 1.0F;
		Static84.aFloatArray12[4] = 0.0F;
		Static84.aFloatArray12[15] = 1.0F;
		Static84.aFloatArray12[3] = 0.0F;
		Static84.aFloatArray12[10] = 0.0F;
		Static84.aFloatArray12[5] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static84.aFloatArray12, 0);
		if ((this.anInt7623 & 0x7) == 0) {
			this.aClass50_Sub1_43.method1298(false);
		} else {
			this.aClass50_Sub1_43.method1298(true);
			this.aClass50_Sub1_43.method1327();
		}
		this.aClass50_Sub1_43.method1283(this.aClass71_16, this.aClass71_13, this.aClass71_14, this.aClass71_15);
		if (this.aClass50_Sub1_43.aClass10_Sub8_Sub1_2.aByteArray44.length < this.anInt7637 * 2) {
			this.aClass50_Sub1_43.aClass10_Sub8_Sub1_2 = new Class10_Sub8_Sub1(this.anInt7637 * 2);
		} else {
			this.aClass50_Sub1_43.aClass10_Sub8_Sub1_2.anInt2989 = 0;
		}
		@Pc(315) int local315 = 0;
		@Pc(319) Class10_Sub8_Sub1 local319 = this.aClass50_Sub1_43.aClass10_Sub8_Sub1_2;
		@Pc(325) int local325;
		@Pc(335) int local335;
		@Pc(337) int local337;
		@Pc(354) short[] local354;
		@Pc(358) int local358;
		if (this.aClass50_Sub1_43.aBoolean99) {
			for (local325 = arg1; local325 < arg3; local325++) {
				local335 = super.anInt7614 * local325 + arg0;
				for (local337 = arg0; local337 < arg2; local337++) {
					if (arg4[local337 - arg0][local325 - arg1]) {
						local354 = this.aShortArrayArray10[local335];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local319.method2509(local354[local358] & 0xFFFF);
								local315++;
							}
						}
					}
					local335++;
				}
			}
		} else {
			for (local325 = arg1; local325 < arg3; local325++) {
				local335 = super.anInt7614 * local325 + arg0;
				for (local337 = arg0; local337 < arg2; local337++) {
					if (arg4[local337 - arg0][local325 - arg1]) {
						local354 = this.aShortArrayArray10[local335];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local315++;
								local319.method2496(local354[local358] & 0xFFFF);
							}
						}
					}
					local335++;
				}
			}
		}
		if (local315 > 0) {
			@Pc(466) Class26_Sub1 local466 = new Class26_Sub1(this.aClass50_Sub1_43, 5123, local319.aByteArray44, local319.anInt2989);
			this.aClass50_Sub1_43.method1290(local315, 0, local466);
		}
	}

	@OriginalMember(owner = "client!wv", name = "ba", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void ba(@OriginalArg(0) Class10_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass59_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass50_Sub1_43.anInt1427 >> 8) >> this.aClass50_Sub1_43.anInt1404;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass50_Sub1_43.anInt1431 >> 8) >> this.aClass50_Sub1_43.anInt1404;
			this.aClass59_2.method1522(arg0, local24, local38);
		}
	}

	@OriginalMember(owner = "client!wv", name = "ca", descriptor = "(II)I")
	@Override
	public int ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt7617;
		@Pc(13) int local13 = arg1 >> super.anInt7617;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt7614 - 1 || super.anInt7616 - 1 < local13) {
			return 0;
		}
		@Pc(48) int local48 = arg0 & super.anInt7615 - 1;
		@Pc(55) int local55 = arg1 & super.anInt7615 - 1;
		@Pc(82) int local82 = this.anIntArrayArray69[local8 + 1][local13] * local48 + (super.anInt7615 - local48) * this.anIntArrayArray69[local8][local13] >> super.anInt7617;
		@Pc(113) int local113 = this.anIntArrayArray69[local8 + 1][local13 + 1] * local48 + (super.anInt7615 - local48) * this.anIntArrayArray69[local8][local13 + 1] >> super.anInt7617;
		return local113 * local55 + (super.anInt7615 - local55) * local82 >> super.anInt7617;
	}

	@OriginalMember(owner = "client!wv", name = "aa", descriptor = "()V")
	@Override
	public void aa() {
		if (this.anInt7641 <= 0) {
			this.aClass59_2 = null;
		} else {
			@Pc(22) byte[][] local22 = new byte[super.anInt7614 + 1][super.anInt7616 + 1];
			@Pc(28) int local28;
			for (@Pc(24) int local24 = 1; super.anInt7614 > local24; local24++) {
				for (local28 = 1; local28 < super.anInt7616; local28++) {
					local22[local24][local28] = (byte) ((this.aByteArrayArray53[local24][local28 + 1] >> 3) + (this.aByteArrayArray53[local24 + 1][local28] >> 3) + (this.aByteArrayArray53[local24 + -1][local28] >> 2) + (this.aByteArrayArray53[local24][local28 + -1] >> 2) + (this.aByteArrayArray53[local24][local28] >> 1));
				}
			}
			this.aClass10_Sub20Array1 = new Class10_Sub20[this.aClass167_39.method3698()];
			this.aClass167_39.method3703(this.aClass10_Sub20Array1);
			for (local28 = 0; local28 < this.aClass10_Sub20Array1.length; local28++) {
				this.aClass10_Sub20Array1[local28].method2717(this.anInt7641);
			}
			@Pc(140) int local140 = 24;
			if (this.anIntArrayArrayArray11 != null) {
				local140 += 4;
			}
			if ((this.anInt7623 & 0x7) != 0) {
				local140 += 12;
			}
			@Pc(159) NativeBuffer local159 = this.aClass50_Sub1_43.aNativeHeap1.a(local140 * this.anInt7641);
			@Pc(164) NativeStream local164 = new NativeStream(local159);
			@Pc(168) Class10_Sub20[] local168 = new Class10_Sub20[this.anInt7641];
			@Pc(175) int local175 = Static68.method1346(this.anInt7641 / 4);
			if (local175 < 1) {
				local175 = 1;
			}
			@Pc(187) Class167 local187 = new Class167(local175);
			@Pc(191) Class10_Sub20[] local191 = new Class10_Sub20[this.anInt7640];
			@Pc(197) int local197;
			for (@Pc(193) int local193 = 0; super.anInt7614 > local193; local193++) {
				for (local197 = 0; super.anInt7616 > local197; local197++) {
					if (this.anIntArrayArrayArray9[local193][local197] != null) {
						@Pc(213) Class10_Sub20[] local213 = this.aClass10_Sub20ArrayArrayArray1[local193][local197];
						@Pc(220) int[] local220 = this.anIntArrayArrayArray10[local193][local197];
						@Pc(227) int[] local227 = this.anIntArrayArrayArray13[local193][local197];
						@Pc(234) int[] local234 = this.anIntArrayArrayArray12[local193][local197];
						@Pc(241) int[] local241 = this.anIntArrayArrayArray9[local193][local197];
						@Pc(253) int[] local253 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local193][local197];
						@Pc(265) int[] local265 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local193][local197];
						if (local234 == null) {
							local234 = local241;
						}
						@Pc(276) float local276 = this.aFloatArrayArray9[local193][local197];
						@Pc(283) float local283 = this.aFloatArrayArray8[local193][local197];
						@Pc(290) float local290 = this.aFloatArrayArray7[local193][local197];
						@Pc(299) float local299 = this.aFloatArrayArray9[local193][local197 + 1];
						@Pc(308) float local308 = this.aFloatArrayArray8[local193][local197 + 1];
						@Pc(317) float local317 = this.aFloatArrayArray7[local193][local197 + 1];
						@Pc(328) float local328 = this.aFloatArrayArray9[local193 + 1][local197 + 1];
						@Pc(339) float local339 = this.aFloatArrayArray8[local193 + 1][local197 + 1];
						@Pc(350) float local350 = this.aFloatArrayArray7[local193 + 1][local197 + 1];
						@Pc(359) float local359 = this.aFloatArrayArray9[local193 + 1][local197];
						@Pc(368) float local368 = this.aFloatArrayArray8[local193 + 1][local197];
						@Pc(377) float local377 = this.aFloatArrayArray7[local193 + 1][local197];
						@Pc(385) int local385 = local22[local193][local197] & 0xFF;
						@Pc(395) int local395 = local22[local193][local197 + 1] & 0xFF;
						@Pc(407) int local407 = local22[local193 + 1][local197 + 1] & 0xFF;
						@Pc(417) int local417 = local22[local193 + 1][local197] & 0xFF;
						@Pc(419) int local419 = 0;
						@Pc(429) int local429;
						label337: for (@Pc(421) int local421 = 0; local421 < local241.length; local421++) {
							@Pc(427) Class10_Sub20 local427 = local213[local421];
							for (local429 = 0; local429 < local419; local429++) {
								if (local427 == local191[local429]) {
									continue label337;
								}
							}
							local191[local419++] = local427;
						}
						@Pc(470) short[] local470 = this.aShortArrayArray10[local193 + super.anInt7614 * local197] = new short[local241.length];
						for (local429 = 0; local429 < local241.length; local429++) {
							@Pc(483) int local483 = (local193 << super.anInt7617) + local220[local429];
							@Pc(492) int local492 = (local197 << super.anInt7617) + local227[local429];
							@Pc(497) int local497 = local483 >> this.anInt7618;
							@Pc(502) int local502 = local492 >> this.anInt7618;
							@Pc(506) int local506 = local241[local429];
							@Pc(510) int local510 = local234[local429];
							@Pc(518) int local518 = local253 == null ? 0 : local253[local429];
							@Pc(536) long local536 = (long) local502 | (long) (local497 << 16) | (long) local510 << 48 | (long) local506 << 32;
							@Pc(540) int local540 = local220[local429];
							@Pc(544) int local544 = local227[local429];
							@Pc(546) byte local546 = 74;
							@Pc(548) int local548 = 0;
							@Pc(550) float local550 = 1.0F;
							@Pc(558) float local558;
							@Pc(560) float local560;
							@Pc(556) float local556;
							@Pc(632) float local632;
							@Pc(564) int local564;
							if (local540 == 0 && local544 == 0) {
								local556 = local290;
								local558 = local276;
								local560 = local283;
								local564 = local546 - local385;
							} else if (local540 == 0 && super.anInt7615 == local544) {
								local558 = local299;
								local560 = local308;
								local556 = local317;
								local564 = local546 - local395;
							} else if (local540 == super.anInt7615 && local544 == super.anInt7615) {
								local558 = local328;
								local556 = local350;
								local564 = local546 - local407;
								local560 = local339;
							} else if (super.anInt7615 == local540 && local544 == 0) {
								local560 = local368;
								local556 = local377;
								local564 = local546 - local417;
								local558 = local359;
							} else {
								@Pc(608) float local608 = (float) local540 / (float) super.anInt7615;
								@Pc(615) float local615 = (float) local544 / (float) super.anInt7615;
								@Pc(623) float local623 = local608 * (local359 - local276) + local276;
								local632 = local608 * (local368 - local283) + local283;
								@Pc(641) float local641 = local290 + (local377 - local290) * local608;
								@Pc(649) float local649 = (local328 - local299) * local608 + local299;
								@Pc(657) float local657 = local308 + local608 * (local339 - local308);
								@Pc(665) float local665 = (local350 - local317) * local608 + local317;
								local560 = (local657 - local632) * local615 + local632;
								local558 = local623 + (local649 - local623) * local615;
								local556 = (local665 - local641) * local615 + local641;
								@Pc(701) int local701 = (local540 * (local417 - local385) >> super.anInt7617) + local385;
								@Pc(712) int local712 = (local540 * (local407 - local395) >> super.anInt7617) + local395;
								local564 = local546 - ((local712 - local701) * local544 >> super.anInt7617) - local701;
							}
							if (local506 != -1) {
								@Pc(773) int local773 = local564 * (local506 & 0x7F) >> 7;
								if (local773 < 2) {
									local773 = 2;
								} else if (local773 > 126) {
									local773 = 126;
								}
								if ((this.anInt7623 & 0x7) == 0) {
									local550 = local560 * this.aClass50_Sub1_43.aFloatArray8[1] + local558 * this.aClass50_Sub1_43.aFloatArray8[0] + this.aClass50_Sub1_43.aFloatArray8[2] * local556;
									local550 = local550 * (local550 > 0.0F ? this.aClass50_Sub1_43.aFloat35 : this.aClass50_Sub1_43.aFloat30) + this.aClass50_Sub1_43.aFloat34;
								}
								local548 = Static451.anIntArray744[local506 & 0xFF80 | local773];
							}
							@Pc(847) Class10 local847 = null;
							if ((local483 & this.anInt7625 - 1) == 0 && (local492 & this.anInt7625 - 1) == 0) {
								local847 = local187.method3709(local536);
							}
							@Pc(886) int local886;
							@Pc(912) int local912;
							if (local847 == null) {
								if (local510 == local506) {
									local912 = local548;
								} else {
									@Pc(922) int local922 = local564 * (local510 & 0x7F) >> 7;
									if (local922 < 2) {
										local922 = 2;
									} else if (local922 > 126) {
										local922 = 126;
									}
									local912 = Static451.anIntArray744[local510 & 0xFF80 | local922];
									if ((this.anInt7623 & 0x7) == 0) {
										local632 = local556 * this.aClass50_Sub1_43.aFloatArray8[2] + this.aClass50_Sub1_43.aFloatArray8[1] * local560 + this.aClass50_Sub1_43.aFloatArray8[0] * local558;
										local632 = (local550 > 0.0F ? this.aClass50_Sub1_43.aFloat35 : this.aClass50_Sub1_43.aFloat30) * local550 + this.aClass50_Sub1_43.aFloat34;
										@Pc(995) int local995 = local912 >> 16 & 0xFF;
										@Pc(1001) int local1001 = local912 >> 8 & 0xFF;
										local995 = (int) ((float) local995 * local632);
										@Pc(1011) int local1011 = local912 & 0xFF;
										if (local995 < 0) {
											local995 = 0;
										} else if (local995 > 255) {
											local995 = 255;
										}
										local1001 = (int) ((float) local1001 * local632);
										if (local1001 < 0) {
											local1001 = 0;
										} else if (local1001 > 255) {
											local1001 = 255;
										}
										local1011 = (int) ((float) local1011 * local632);
										if (local1011 < 0) {
											local1011 = 0;
										} else if (local1011 > 255) {
											local1011 = 255;
										}
										local912 = local1001 << 8 | local995 << 16 | local1011;
									}
								}
								if (this.aClass50_Sub1_43.aBoolean99) {
									local164.a((float) local483);
									local164.a((float) (local518 + this.ca(local483, local492)));
									local164.a((float) local492);
									local164.a((byte) (local912 >> 16));
									local164.a((byte) (local912 >> 8));
									local164.a((byte) local912);
									local164.a(-1);
									local164.a((float) local483);
									local164.a((float) local492);
									if (this.anIntArrayArrayArray11 != null) {
										local164.a((float) (local265 == null ? 0 : local265[local429] - 1));
									}
									if ((this.anInt7623 & 0x7) != 0) {
										local164.a(local558);
										local164.a(local560);
										local164.a(local556);
									}
								} else {
									local164.b((float) local483);
									local164.b((float) (this.ca(local483, local492) + local518));
									local164.b((float) local492);
									local164.a((byte) (local912 >> 16));
									local164.a((byte) (local912 >> 8));
									local164.a((byte) local912);
									local164.a(-1);
									local164.b((float) local483);
									local164.b((float) local492);
									if (this.anIntArrayArrayArray11 != null) {
										local164.b((float) (local265 == null ? 0 : local265[local429] - 1));
									}
									if ((this.anInt7623 & 0x7) != 0) {
										local164.b(local558);
										local164.b(local560);
										local164.b(local556);
									}
								}
								local886 = this.anInt7630++;
								local470[local429] = (short) local886;
								if (local506 != -1) {
									local168[local886] = local213[local429];
								}
								local187.method3705(new Class10_Sub24(local470[local429]), local536);
							} else {
								local470[local429] = ((Class10_Sub24) local847).aShort62;
								local886 = local470[local429] & 0xFFFF;
								if (local506 != -1 && local213[local429].aLong264 < local168[local886].aLong264) {
									local168[local886] = local213[local429];
								}
							}
							for (local912 = 0; local912 < local419; local912++) {
								local191[local912].method2715(local548, local564, local886, local550);
							}
							this.anInt7637++;
						}
					}
				}
			}
			for (local197 = 0; local197 < this.anInt7630; local197++) {
				@Pc(1323) Class10_Sub20 local1323 = local168[local197];
				if (local1323 != null) {
					local1323.method2713(local197);
				}
			}
			@Pc(1357) int local1357;
			for (@Pc(1336) int local1336 = 0; local1336 < super.anInt7614; local1336++) {
				for (@Pc(1340) int local1340 = 0; super.anInt7616 > local1340; local1340++) {
					@Pc(1353) short[] local1353 = this.aShortArrayArray10[local1340 * super.anInt7614 + local1336];
					if (local1353 != null) {
						local1357 = 0;
						@Pc(1359) int local1359 = 0;
						while (local1353.length > local1359) {
							@Pc(1368) int local1368 = local1353[local1359++] & 0xFFFF;
							@Pc(1375) int local1375 = local1353[local1359++] & 0xFFFF;
							@Pc(1382) int local1382 = local1353[local1359++] & 0xFFFF;
							@Pc(1386) Class10_Sub20 local1386 = local168[local1368];
							@Pc(1390) Class10_Sub20 local1390 = local168[local1375];
							@Pc(1394) Class10_Sub20 local1394 = local168[local1382];
							@Pc(1396) Class10_Sub20 local1396 = null;
							if (local1386 != null) {
								local1396 = local1386;
								local1386.method2721(local1336, local1357, local1340);
							}
							if (local1390 != null) {
								local1390.method2721(local1336, local1357, local1340);
								if (local1396 == null || local1390.aLong264 < local1396.aLong264) {
									local1396 = local1390;
								}
							}
							if (local1394 != null) {
								local1394.method2721(local1336, local1357, local1340);
								if (local1396 == null || local1396.aLong264 > local1394.aLong264) {
									local1396 = local1394;
								}
							}
							if (local1396 != null) {
								if (local1386 != null) {
									local1396.method2713(local1368);
								}
								if (local1390 != null) {
									local1396.method2713(local1375);
								}
								if (local1394 != null) {
									local1396.method2713(local1382);
								}
								local1396.method2721(local1336, local1357, local1340);
							}
							local1357++;
						}
					}
				}
			}
			local164.a();
			this.anInterface4_7 = this.aClass50_Sub1_43.method1302(local164.c(), local159, local140);
			this.aClass71_16 = new Class71(this.anInterface4_7, 5126, 3, 0);
			this.aClass71_15 = new Class71(this.anInterface4_7, 5121, 4, 12);
			@Pc(1539) byte local1539;
			if (this.anIntArrayArrayArray11 == null) {
				this.aClass71_13 = new Class71(this.anInterface4_7, 5126, 2, 16);
				local1539 = 24;
			} else {
				local1539 = 28;
				this.aClass71_13 = new Class71(this.anInterface4_7, 5126, 3, 16);
			}
			if ((this.anInt7623 & 0x7) != 0) {
				this.aClass71_14 = new Class71(this.anInterface4_7, 5126, 3, local1539);
			}
			@Pc(1576) long[] local1576 = new long[this.aClass10_Sub20Array1.length];
			for (local1357 = 0; local1357 < this.aClass10_Sub20Array1.length; local1357++) {
				@Pc(1585) Class10_Sub20 local1585 = this.aClass10_Sub20Array1[local1357];
				local1576[local1357] = local1585.aLong264;
				local1585.method2714(this.anInt7630);
			}
			Static182.method2975(this.aClass10_Sub20Array1, local1576);
			if (this.aClass59_2 != null) {
				this.aClass59_2.method1517();
			}
		}
		this.anIntArrayArrayArray12 = null;
		this.aClass10_Sub20ArrayArrayArray1 = null;
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray11 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray8 = this.aFloatArrayArray7 = null;
		this.anIntArrayArrayArray14 = null;
		this.anIntArrayArrayArray10 = this.anIntArrayArrayArray13 = null;
		this.aClass167_39 = null;
		this.aByteArrayArray53 = null;
	}

	@OriginalMember(owner = "client!wv", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt7614][super.anInt7616][];
		}
		if (arg5 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt7614][super.anInt7616][];
		}
		this.anIntArrayArrayArray10[arg0][arg1] = arg2;
		this.anIntArrayArrayArray13[arg0][arg1] = arg4;
		this.anIntArrayArrayArray9[arg0][arg1] = arg6;
		this.anIntArrayArrayArray12[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg3;
		}
		@Pc(88) Class10_Sub20[] local88 = this.aClass10_Sub20ArrayArrayArray1[arg0][arg1] = new Class10_Sub20[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[local90] << 14);
			@Pc(125) Class10 local125;
			for (local125 = this.aClass167_39.method3709(local119); local125 != null; local125 = this.aClass167_39.method3707()) {
				@Pc(130) Class10_Sub20 local130 = (Class10_Sub20) local125;
				if (local130.anInt3240 == arg8[local90] && (float) arg9[local90] == local130.aFloat56 && arg10 == local130.anInt3235 && local130.anInt3232 == arg11 && local130.anInt3244 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class10_Sub20(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass167_39.method3705(local88[local90], local119);
			} else {
				local88[local90] = (Class10_Sub20) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray52[arg0][arg1] = (byte) (this.aByteArrayArray52[arg0][arg1] | 0x1);
		}
		if (this.anInt7640 < arg6.length) {
			this.anInt7640 = arg6.length;
		}
		this.anInt7641 += arg6.length;
	}

	@OriginalMember(owner = "client!wv", name = "OA", descriptor = "(IILclient!i;)Lclient!i;")
	@Override
	public Class10_Sub1_Sub7 OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10_Sub1_Sub7 arg2) {
		if ((this.aByteArrayArray52[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt7615 >> this.aClass50_Sub1_43.anInt1404;
		@Pc(27) Class10_Sub1_Sub7_Sub1 local27 = (Class10_Sub1_Sub7_Sub1) arg2;
		@Pc(43) Class10_Sub1_Sub7_Sub1 local43;
		if (local27 != null && local27.method5201(local24, local24)) {
			local43 = local27;
			local27.method5203();
		} else {
			local43 = new Class10_Sub1_Sub7_Sub1(this.aClass50_Sub1_43, local24, local24);
		}
		local43.method5198(local24, 0, 0, local24);
		this.method6082(arg0, arg1, local43);
		return local43;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)V")
	@Override
	public void method6078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(8) int local8 = arg9.length;
		@Pc(13) int[] local13 = new int[local8 * 3];
		@Pc(18) int[] local18 = new int[local8 * 3];
		@Pc(23) int[] local23 = new int[local8 * 3];
		@Pc(28) int[] local28 = new int[local8 * 3];
		@Pc(33) int[] local33 = new int[local8 * 3];
		@Pc(38) int[] local38 = new int[local8 * 3];
		@Pc(47) int[] local47 = arg3 == null ? null : new int[local8 * 3];
		@Pc(56) int[] local56 = arg5 == null ? null : new int[local8 * 3];
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < local8; local60++) {
			@Pc(66) int local66 = arg6[local60];
			@Pc(70) int local70 = arg7[local60];
			@Pc(74) int local74 = arg8[local60];
			local13[local58] = arg2[local66];
			local18[local58] = arg4[local66];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local66];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local66];
			}
			local58++;
			local13[local58] = arg2[local70];
			local18[local58] = arg4[local70];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local70];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local70];
			}
			local58++;
			local13[local58] = arg2[local74];
			local18[local58] = arg4[local74];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local74];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local74];
			}
			local58++;
		}
		this.pa(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}
}
