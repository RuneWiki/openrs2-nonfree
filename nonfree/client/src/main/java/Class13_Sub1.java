import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!aha", name = "r", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!aha", name = "t", descriptor = "Lclient!pca;")
	public Class2_Sub26 aClass2_Sub26_1;

	@OriginalMember(owner = "client!aha", name = "u", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!aha", name = "x", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!aha", name = "A", descriptor = "[F")
	public float[] aFloatArray1;

	@OriginalMember(owner = "client!aha", name = "E", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!aha", name = "H", descriptor = "I")
	public int anInt237;

	@OriginalMember(owner = "client!aha", name = "I", descriptor = "I")
	public int anInt238;

	@OriginalMember(owner = "client!aha", name = "J", descriptor = "[F")
	public float[] aFloatArray2;

	@OriginalMember(owner = "client!aha", name = "K", descriptor = "I")
	public int anInt239;

	@OriginalMember(owner = "client!aha", name = "O", descriptor = "Lclient!uw;")
	private Class357 aClass357_1;

	@OriginalMember(owner = "client!aha", name = "S", descriptor = "I")
	public int anInt243;

	@OriginalMember(owner = "client!aha", name = "T", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!aha", name = "W", descriptor = "[I")
	public int[] anIntArray31;

	@OriginalMember(owner = "client!aha", name = "X", descriptor = "I")
	public int anInt247;

	@OriginalMember(owner = "client!aha", name = "Y", descriptor = "I")
	private int anInt248;

	@OriginalMember(owner = "client!aha", name = "cb", descriptor = "I")
	public int anInt252;

	@OriginalMember(owner = "client!aha", name = "eb", descriptor = "I")
	public int anInt254;

	@OriginalMember(owner = "client!aha", name = "gb", descriptor = "[Lclient!k;")
	private Class192[] aClass192Array1;

	@OriginalMember(owner = "client!aha", name = "hb", descriptor = "I")
	public int anInt255;

	@OriginalMember(owner = "client!aha", name = "ib", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!aha", name = "jb", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!aha", name = "kb", descriptor = "I")
	public int anInt258;

	@OriginalMember(owner = "client!aha", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!aha", name = "mb", descriptor = "I")
	public int anInt259;

	@OriginalMember(owner = "client!aha", name = "pb", descriptor = "Lclient!iea;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!aha", name = "s", descriptor = "Z")
	private boolean aBoolean27;

	@OriginalMember(owner = "client!aha", name = "w", descriptor = "Z")
	private boolean aBoolean28;

	@OriginalMember(owner = "client!aha", name = "v", descriptor = "Lclient!tba;")
	private Class323 aClass323_3;

	@OriginalMember(owner = "client!aha", name = "C", descriptor = "I")
	public int anInt232;

	@OriginalMember(owner = "client!aha", name = "F", descriptor = "I")
	public int anInt235;

	@OriginalMember(owner = "client!aha", name = "G", descriptor = "I")
	public int anInt236;

	@OriginalMember(owner = "client!aha", name = "ab", descriptor = "I")
	public int anInt250;

	@OriginalMember(owner = "client!aha", name = "P", descriptor = "I")
	public int anInt241;

	@OriginalMember(owner = "client!aha", name = "V", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!aha", name = "R", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!aha", name = "Z", descriptor = "I")
	public int anInt249;

	@OriginalMember(owner = "client!aha", name = "U", descriptor = "I")
	public int anInt245;

	@OriginalMember(owner = "client!aha", name = "z", descriptor = "I")
	public int anInt231;

	@OriginalMember(owner = "client!aha", name = "D", descriptor = "I")
	public int anInt233;

	@OriginalMember(owner = "client!aha", name = "Q", descriptor = "Z")
	private boolean aBoolean29;

	@OriginalMember(owner = "client!aha", name = "bb", descriptor = "I")
	public int anInt251;

	@OriginalMember(owner = "client!aha", name = "N", descriptor = "I")
	public int anInt240;

	@OriginalMember(owner = "client!aha", name = "db", descriptor = "I")
	public int anInt253;

	@OriginalMember(owner = "client!aha", name = "M", descriptor = "Lclient!de;")
	private final Class69 aClass69_5;

	@OriginalMember(owner = "client!aha", name = "ob", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!aha", name = "fb", descriptor = "Lclient!de;")
	private final Class69 aClass69_6;

	@OriginalMember(owner = "client!aha", name = "nb", descriptor = "Lclient!cda;")
	public Class51_Sub1 aClass51_Sub1_1;

	@OriginalMember(owner = "client!aha", name = "y", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class13_Sub1(@OriginalArg(0) Interface2 arg0) {
		super(arg0);
		this.aBoolean27 = false;
		this.aBoolean28 = false;
		this.aClass323_3 = new Class323(4);
		this.anInt232 = 50;
		this.anInt235 = 512;
		this.anInt236 = 0;
		this.anInt250 = 128;
		this.anInt241 = 3500;
		this.anInt246 = 0;
		this.anInt242 = 0;
		this.anInt249 = 75518;
		this.anInt245 = 0;
		this.anInt231 = 45823;
		this.anInt233 = 0;
		this.aBoolean29 = false;
		this.anInt251 = 78642;
		this.anInt240 = 512;
		this.anInt253 = 0;
		this.aClass69_5 = new Class69(16);
		this.anInt260 = -1;
		try {
			this.aClass69_6 = new Class69(256);
			this.aClass51_Sub1_1 = new Class51_Sub1();
			this.method8099(1);
			this.method8139(0);
			Static187.method3201(true, true);
			this.aBoolean27 = true;
			this.anInt230 = (int) Static48.method1203();
		} catch (@Pc(99) Throwable local99) {
			local99.printStackTrace();
			this.method8117();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class13_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		try {
			this.method8146(arg0, arg2, arg3);
			this.method8124(arg0);
		} catch (@Pc(12) Throwable local12) {
			local12.printStackTrace();
			this.method8117();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface2_12.method6027(arg6).aBoolean514) {
			this.method339(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt260 != arg6) {
			@Pc(26) Class31 local26 = (Class31) this.aClass69_5.method1919((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method346(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(44) int local44 = this.method340(arg6) ? 64 : this.anInt250;
				local26 = this.method8088(local44, local44, local32, local44);
				this.aClass69_5.method1917((long) arg6, local26);
			}
			this.anInt260 = arg6;
			this.aClass31_1 = local26;
		}
		((Class31_Sub1) this.aClass31_1).method8816(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!aha", name = "d", descriptor = "(I)I")
	public int method338(@OriginalArg(0) int arg0) {
		return super.anInterface2_12.method6027(arg0).aShort94 & 0xFFFF;
	}

	@OriginalMember(owner = "client!aha", name = "u", descriptor = "()Z")
	@Override
	public boolean method8145() {
		return false;
	}

	@OriginalMember(owner = "client!aha", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt233 || arg0 >= this.anInt245) {
			return;
		}
		if (arg1 < this.anInt236) {
			arg2 -= this.anInt236 - arg1;
			arg1 = this.anInt236;
		}
		if (arg1 + arg2 > this.anInt253) {
			arg2 = this.anInt253 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt254;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray31[local40 + local54 * this.anInt254] = arg3;
			}
			return;
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(116) int local116;
		if (arg4 == 1) {
			@Pc(97) int local97 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local103 = 0; local103 < arg2; local103++) {
				local111 = local40 + local103 * this.anInt254;
				local116 = this.anIntArray31[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray31[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt254;
				local111 = this.anIntArray31[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray31[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aha", name = "d", descriptor = "(II)Lclient!hca;")
	@Override
	public Interface8 method8151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method8169(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!aha", name = "m", descriptor = "()V")
	@Override
	public void method8118() {
	}

	@OriginalMember(owner = "client!aha", name = "h", descriptor = "(I)V")
	@Override
	public void method8139(@OriginalArg(0) int arg0) {
		this.aClass192Array1[arg0].method4504(Thread.currentThread());
	}

	@OriginalMember(owner = "client!aha", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt254 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray31[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(II)Lclient!lda;")
	@Override
	public Interface15 method8120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class190(arg0, arg1);
	}

	@OriginalMember(owner = "client!aha", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt233;
		arg0[1] = this.anInt236;
		arg0[2] = this.anInt245;
		arg0[3] = this.anInt253;
	}

	@OriginalMember(owner = "client!aha", name = "e", descriptor = "(IIIIII)V")
	private void method339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt236) {
			local8 = this.anInt236;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt253) {
			local21 = this.anInt253;
		}
		@Pc(30) int local30 = local8;
		@Pc(34) int local34 = arg3 * arg3;
		@Pc(36) int local36 = 0;
		@Pc(40) int local40 = arg1 - local8;
		@Pc(44) int local44 = local40 * local40;
		@Pc(48) int local48 = local44 - local40;
		if (arg1 > local21) {
			arg1 = local21;
		}
		@Pc(57) int local57 = arg4 >>> 24;
		@Pc(91) int local91;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(118) int local118;
		if (arg5 == 0 || arg5 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt233) {
					local91 = this.anInt233;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt245) {
					local102 = this.anInt245;
				}
				local116 = local91 + local30 * this.anInt254;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray2[local116]) {
						this.anIntArray31[local116] = arg4;
					}
					local116++;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg3;
			local40 = local30 - arg1;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg3;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt233) {
					local91 = this.anInt233;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt245 - 1) {
					local102 = this.anInt245 - 1;
				}
				local116 = local91 + local30 * this.anInt254;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray2[local116]) {
						this.anIntArray31[local116] = arg4;
					}
					local116++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(350) int local350;
		@Pc(364) int local364;
		if (arg5 == 1) {
			@Pc(293) int local293 = ((arg4 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
			local91 = 256 - local57;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local102 = arg0 + 1 - local36;
				if (local102 < this.anInt233) {
					local102 = this.anInt233;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt245) {
					local116 = this.anInt245;
				}
				local118 = local102 + local30 * this.anInt254;
				for (local350 = local102; local350 < local116; local350++) {
					if ((float) arg2 < this.aFloatArray2[local118]) {
						local364 = this.anIntArray31[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray31[local118] = local293 + local364;
					}
					local118++;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg3;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg3;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local102 = arg0 - local36;
				if (local102 < this.anInt233) {
					local102 = this.anInt233;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt245 - 1) {
					local116 = this.anInt245 - 1;
				}
				local118 = local102 + local30 * this.anInt254;
				for (local350 = local102; local350 <= local116; local350++) {
					if ((float) arg2 < this.aFloatArray2[local118]) {
						local364 = this.anIntArray31[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray31[local118] = local293 + local364;
					}
					local118++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else if (arg5 == 2) {
			@Pc(633) int local633;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt233) {
					local91 = this.anInt233;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt245) {
					local102 = this.anInt245;
				}
				local116 = local91 + local30 * this.anInt254;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray2[local116]) {
						local350 = this.anIntArray31[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(643) int local643 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray31[local116] = local364 - local643 | local643 - (local643 >>> 8);
					}
					local116++;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg3;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg3;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt233) {
					local91 = this.anInt233;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt245 - 1) {
					local102 = this.anInt245 - 1;
				}
				local116 = local91 + local30 * this.anInt254;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray2[local116]) {
						local350 = this.anIntArray31[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray31[local116] = local364 - local350 | local350 - (local350 >>> 8);
					}
					local116++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aha", name = "v", descriptor = "()Z")
	@Override
	public boolean method8147() {
		return false;
	}

	@OriginalMember(owner = "client!aha", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass51_Sub1_1.aFloat44 + this.aClass51_Sub1_1.aFloat39 * (float) arg0 + this.aClass51_Sub1_1.aFloat45 * (float) arg1 + this.aClass51_Sub1_1.aFloat42 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = (int) ((float) this.anInt235 * (this.aClass51_Sub1_1.aFloat38 + this.aClass51_Sub1_1.aFloat40 * (float) arg0 + this.aClass51_Sub1_1.aFloat41 * (float) arg1 + this.aClass51_Sub1_1.aFloat43 * (float) arg2) / local24);
		@Pc(105) int local105 = (int) ((float) this.anInt240 * (this.aClass51_Sub1_1.aFloat36 + this.aClass51_Sub1_1.aFloat46 * (float) arg0 + this.aClass51_Sub1_1.aFloat47 * (float) arg1 + this.aClass51_Sub1_1.aFloat37 * (float) arg2) / local24);
		arg3[0] = local73 - this.anInt259;
		arg3[1] = local105 - this.anInt239;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!aha", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass51_Sub1_1.aFloat44 + this.aClass51_Sub1_1.aFloat39 * (float) arg0 + this.aClass51_Sub1_1.aFloat45 * (float) arg1 + this.aClass51_Sub1_1.aFloat42 * (float) arg2;
		if (local24 < (float) this.anInt232 || local24 > (float) this.anInt241) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(82) int local82 = (int) ((float) this.anInt235 * (this.aClass51_Sub1_1.aFloat38 + this.aClass51_Sub1_1.aFloat40 * (float) arg0 + this.aClass51_Sub1_1.aFloat41 * (float) arg1 + this.aClass51_Sub1_1.aFloat43 * (float) arg2) / (float) arg3);
		@Pc(115) int local115 = (int) ((float) this.anInt240 * (this.aClass51_Sub1_1.aFloat36 + this.aClass51_Sub1_1.aFloat46 * (float) arg0 + this.aClass51_Sub1_1.aFloat47 * (float) arg1 + this.aClass51_Sub1_1.aFloat37 * (float) arg2) / (float) arg3);
		if (local82 >= this.anInt259 && local82 <= this.anInt258 && local115 >= this.anInt239 && local115 <= this.anInt252) {
			arg4[0] = local82 - this.anInt259;
			arg4[1] = local115 - this.anInt239;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!aha", name = "k", descriptor = "(I)Z")
	public boolean method340(@OriginalArg(0) int arg0) {
		return this.aBoolean29 || super.anInterface2_12.method6027(arg0).aBoolean516;
	}

	@OriginalMember(owner = "client!aha", name = "y", descriptor = "()Lclient!pda;")
	@Override
	public Class51 method8154() {
		@Pc(3) Class192 local3 = this.method348(Thread.currentThread());
		return local3.aClass51_Sub1_2;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8131(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub26 local8 = (Class2_Sub26) this.aClass323_3.method7484((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method8920();
		local8 = Static303.method4763(arg0, arg2, arg1);
		this.aClass323_3.method7477(local8, (long) arg0.hashCode());
		if (this.aCanvas1 != arg0 || this.aClass357_1 != null) {
			return;
		}
		@Pc(37) Dimension local37 = arg0.getSize();
		this.anInt229 = local37.width;
		this.anInt228 = local37.height;
		this.aClass2_Sub26_1 = local8;
		this.anIntArray31 = local8.anIntArray741;
		this.anInt254 = local8.anInt10486;
		this.anInt248 = local8.anInt10482;
		if (this.anInt254 != this.anInt256 || this.anInt248 != this.anInt257) {
			this.anInt234 = this.anInt256 = this.anInt254;
			this.anInt244 = this.anInt257 = this.anInt248;
			this.aFloatArray1 = this.aFloatArray2 = new float[this.anInt256 * this.anInt257];
		}
		this.method343();
	}

	@OriginalMember(owner = "client!aha", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt254, this.anInt248, arg0, 0);
	}

	@OriginalMember(owner = "client!aha", name = "d", descriptor = "()V")
	@Override
	public void method8094() {
		if (this.aCanvas1 == null) {
			this.anInt254 = 1;
			this.anInt248 = 1;
			this.anIntArray31 = null;
			this.anInt256 = 1;
			this.anInt257 = 1;
			this.aFloatArray2 = null;
		} else {
			this.anIntArray31 = this.aClass2_Sub26_1.anIntArray741;
			this.anInt254 = this.aClass2_Sub26_1.anInt10486;
			this.anInt248 = this.aClass2_Sub26_1.anInt10482;
			this.aFloatArray2 = this.aFloatArray1;
			this.anInt256 = this.anInt234;
			this.anInt257 = this.anInt244;
		}
		this.aClass357_1 = null;
		this.method343();
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!hb;Z)Lclient!iea;")
	@Override
	public Class31 method8141(@OriginalArg(0) Class139 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray261;
		@Pc(5) byte[] local5 = arg0.aByteArray32;
		@Pc(8) int local8 = arg0.anInt3984;
		@Pc(11) int local11 = arg0.anInt3983;
		@Pc(76) Class31_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray31 == null) {
			local20 = new int[local2.length];
			local25 = new byte[local8 * local11];
			for (local27 = 0; local27 < local11; local27++) {
				local32 = local27 * local8;
				for (local34 = 0; local34 < local8; local34++) {
					local25[local32 + local34] = local5[local32 + local34];
				}
			}
			for (local32 = 0; local32 < local2.length; local32++) {
				local20[local32] = local2[local32];
			}
			local76 = new Class31_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray31;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class31_Sub1_Sub3(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class31_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.method8792(arg0.anInt3981, arg0.anInt3980, arg0.anInt3985, arg0.anInt3982);
		return local76;
	}

	@OriginalMember(owner = "client!aha", name = "l", descriptor = "(I)[I")
	public int[] method341(@OriginalArg(0) int arg0) {
		@Pc(2) Class69 local2 = this.aClass69_6;
		@Pc(12) Class2_Sub16 local12;
		synchronized (this.aClass69_6) {
			local12 = (Class2_Sub16) this.aClass69_6.method1919((long) arg0);
			if (local12 == null) {
				if (!super.anInterface2_12.method6026(arg0)) {
					return null;
				}
				@Pc(32) Class271 local32 = super.anInterface2_12.method6027(arg0);
				@Pc(43) int local43 = local32.aBoolean516 || this.aBoolean29 ? 64 : this.anInt250;
				local12 = new Class2_Sub16(arg0, local43, super.anInterface2_12.method6024(local43, arg0, true, local43, 0.7F), local32.anInt7162 != 1);
				this.aClass69_6.method1917((long) arg0, local12);
			}
		}
		local12.aBoolean220 = true;
		return local12.method2302();
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "(IIIIII)Lclient!mda;")
	@Override
	public Class49 method8148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Z)V")
	@Override
	public void method8098(@OriginalArg(0) boolean arg0) {
		this.aBoolean29 = arg0;
		this.aClass69_6.method1905();
	}

	@OriginalMember(owner = "client!aha", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt233 = 0;
		this.anInt236 = 0;
		this.anInt245 = this.anInt254;
		this.anInt253 = this.anInt248;
		this.method351();
	}

	@OriginalMember(owner = "client!aha", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt241;
	}

	@OriginalMember(owner = "client!aha", name = "q", descriptor = "()Z")
	@Override
	public boolean method8134() {
		return true;
	}

	@OriginalMember(owner = "client!aha", name = "g", descriptor = "()Z")
	public boolean method342() {
		return this.aBoolean28;
	}

	@OriginalMember(owner = "client!aha", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass192Array1.length; local1++) {
			this.aClass192Array1[local1].anInt5131 = this.aClass192Array1[local1].anInt5127;
			this.aClass192Array1[local1].anInt5132 = arg0;
			this.aClass192Array1[local1].anInt5127 = arg1;
			this.aClass192Array1[local1].anInt5128 = arg2;
			this.aClass192Array1[local1].aBoolean379 = true;
		}
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8146(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub26 local8 = (Class2_Sub26) this.aClass323_3.method7484((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static303.method4763(arg0, arg2, arg1);
			this.aClass323_3.method7477(local8, (long) arg0.hashCode());
		} else if (local8.anInt10486 != arg1 || local8.anInt10482 != arg2) {
			this.method8131(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class91 method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class91_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(I)V")
	@Override
	public void method8097(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt230;
		for (@Pc(9) Object local9 = this.aClass69_6.method1908(); local9 != null; local9 = this.aClass69_6.method1914()) {
			@Pc(13) Class2_Sub16 local13 = (Class2_Sub16) local9;
			if (local13.aBoolean220) {
				local13.anInt2707 += local4;
				@Pc(27) int local27 = local13.anInt2707 / 20;
				if (local27 > 0) {
					@Pc(36) Class271 local36 = super.anInterface2_12.method6027(local13.anInt2706);
					local13.method2300(local36.aByte93 * local4 * 50 / 1000, local36.aByte95 * local4 * 50 / 1000);
					local13.anInt2707 -= local27 * 20;
				}
				local13.aBoolean220 = false;
			}
		}
		this.anInt230 = arg0;
		this.aClass69_5.method1910(5);
		this.aClass69_6.method1910(5);
	}

	@OriginalMember(owner = "client!aha", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt233 < arg0) {
			this.anInt233 = arg0;
		}
		if (this.anInt236 < arg1) {
			this.anInt236 = arg1;
		}
		if (this.anInt245 > arg2) {
			this.anInt245 = arg2;
		}
		if (this.anInt253 > arg3) {
			this.anInt253 = arg3;
		}
		this.method351();
	}

	@OriginalMember(owner = "client!aha", name = "B", descriptor = "()V")
	private void method343() {
		for (@Pc(1) int local1 = 0; local1 < this.lb; local1++) {
			this.aClass192Array1[local1].method4505();
		}
		this.la();
	}

	@OriginalMember(owner = "client!aha", name = "t", descriptor = "()Z")
	@Override
	public boolean method8142() {
		return false;
	}

	@OriginalMember(owner = "client!aha", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.U(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.U(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(104) int local104;
			@Pc(137) int local137;
			@Pc(150) int local150;
			@Pc(213) int local213;
			@Pc(228) int local228;
			@Pc(233) int local233;
			@Pc(309) int local309;
			@Pc(204) int local204;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(94) int local94 = arg3 << 16;
				local104 = (int) Math.floor((double) local94 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt233) {
					arg1 += local104 * (this.anInt233 - arg0);
					arg0 = this.anInt233;
				}
				if (arg2 >= this.anInt245) {
					arg2 = this.anInt245 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt236 && local150 < this.anInt253) {
							this.anIntArray31[arg0 + local150 * this.anInt254] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt236 && local213 < this.anInt253) {
							local228 = arg0 + local213 * this.anInt254;
							local233 = this.anIntArray31[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray31[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt236 && local150 < this.anInt253) {
							local213 = arg0 + local150 * this.anInt254;
							local228 = this.anIntArray31[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray31[local213] = local233 - local228 | local228 - (local228 >>> 8);
						}
						arg1 += local104;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(357) int local357 = arg2 << 16;
				local104 = (int) Math.floor((double) local357 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt236) {
					arg0 += local104 * (this.anInt236 - arg1);
					arg1 = this.anInt236;
				}
				if (arg3 >= this.anInt253) {
					arg3 = this.anInt253 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt233 && local150 < this.anInt245) {
							this.anIntArray31[local150 + arg1 * this.anInt254] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt233 && local213 < this.anInt245) {
							local228 = local213 + arg1 * this.anInt254;
							local233 = this.anIntArray31[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray31[local213 + arg1 * this.anInt254] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt233 && local150 < this.anInt245) {
							local213 = local150 + arg1 * this.anInt254;
							local228 = this.anIntArray31[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray31[local213] = local233 - local587 | local587 - (local587 >>> 8);
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.P(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.P(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class192 local3 = this.method348(Thread.currentThread());
		@Pc(6) Class374 local6 = local3.aClass374_1;
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(14) int local14 = arg3 - arg1;
		@Pc(21) int local21 = local10 >= 0 ? local10 : -local10;
		@Pc(28) int local28 = local14 >= 0 ? local14 : -local14;
		@Pc(30) int local30 = local21;
		if (local21 < local28) {
			local30 = local28;
		}
		if (local30 == 0) {
			return;
		}
		@Pc(44) int local44 = (local10 << 16) / local30;
		@Pc(50) int local50 = (local14 << 16) / local30;
		local10 += local44 >> 16;
		local14 += local50 >> 16;
		if (local50 <= local44) {
			local44 = -local44;
		} else {
			local50 = -local50;
		}
		@Pc(78) int local78 = arg5 * local50 >> 17;
		@Pc(86) int local86 = arg5 * local50 + 1 >> 17;
		@Pc(92) int local92 = arg5 * local44 >> 17;
		@Pc(100) int local100 = arg5 * local44 + 1 >> 17;
		@Pc(105) int local105 = arg0 - local6.method8689();
		@Pc(110) int local110 = arg1 - local6.method8693();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt10206 = 0;
		this.C(false);
		local6.aBoolean739 = local114 < 0 || local114 > local6.anInt10207 || local118 < 0 || local118 > local6.anInt10207 || local124 < 0 || local124 > local6.anInt10207;
		local6.method8691((float) local134, (float) local138, (float) local144, (float) local114, (float) local118, (float) local124, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean739 = local114 < 0 || local114 > local6.anInt10207 || local124 < 0 || local124 > local6.anInt10207 || local130 < 0 || local130 > local6.anInt10207;
		local6.method8691((float) local134, (float) local144, (float) local150, (float) local114, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!pda;)V")
	@Override
	public void method8138(@OriginalArg(0) Class51 arg0) {
		this.aClass51_Sub1_1 = (Class51_Sub1) arg0;
	}

	@OriginalMember(owner = "client!aha", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt249 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!mda;)V")
	@Override
	public void method8132(@OriginalArg(0) Class49 arg0) {
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!aha", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt233) {
			arg2 -= this.anInt233 - arg0;
			arg0 = this.anInt233;
		}
		if (arg1 < this.anInt236) {
			arg3 -= this.anInt236 - arg1;
			arg1 = this.anInt236;
		}
		if (arg0 + arg2 > this.anInt245) {
			arg2 = this.anInt245 - arg0;
		}
		if (arg1 + arg3 > this.anInt253) {
			arg3 = this.anInt253 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt245 || arg1 > this.anInt253) {
			return;
		}
		@Pc(67) int local67 = this.anInt254 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt254;
		@Pc(78) int local78 = arg4 >>> 24;
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(101) int local101;
		if (arg5 != 0 && (arg5 != 1 || local78 != 255)) {
			@Pc(217) int local217;
			if (arg5 == 1) {
				@Pc(201) int local201 = ((arg4 & 0xFF00FF) * local78 >> 8 & 0xFF00FF) + (((arg4 & 0xFF00FF00) >>> 8) * local78 & 0xFF00FF00);
				local90 = 256 - local78;
				for (local94 = 0; local94 < arg3; local94++) {
					for (local101 = -arg2; local101 < 0; local101++) {
						local217 = this.anIntArray31[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray31[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray31[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray31[local74++] = local217 - local294 | local294 - (local294 >>> 8);
					}
					local74 += local67;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local90 = arg2 >> 3;
		local94 = arg2 & 0x7;
		arg2 = local74 - 1;
		for (local101 = -arg3; local101 < 0; local101++) {
			if (local90 > 0) {
				arg0 = local90;
				do {
					arg2++;
					this.anIntArray31[arg2] = arg4;
					arg2++;
					this.anIntArray31[arg2] = arg4;
					arg2++;
					this.anIntArray31[arg2] = arg4;
					arg2++;
					this.anIntArray31[arg2] = arg4;
					arg2++;
					this.anIntArray31[arg2] = arg4;
					arg2++;
					this.anIntArray31[arg2] = arg4;
					arg2++;
					this.anIntArray31[arg2] = arg4;
					arg2++;
					this.anIntArray31[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray31[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!hca;Lclient!lda;)Lclient!nl;")
	@Override
	public Interface18 method8107(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Interface15 arg1) {
		return new Class357(this, (Class31) arg0, (Class190) arg1);
	}

	@OriginalMember(owner = "client!aha", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass51_Sub1_1.aFloat39 * (float) arg0 + this.aClass51_Sub1_1.aFloat45 * (float) arg1 + this.aClass51_Sub1_1.aFloat42 * (float) arg2 + this.aClass51_Sub1_1.aFloat44;
		@Pc(49) float local49 = this.aClass51_Sub1_1.aFloat39 * (float) arg3 + this.aClass51_Sub1_1.aFloat45 * (float) arg4 + this.aClass51_Sub1_1.aFloat42 * (float) arg5 + this.aClass51_Sub1_1.aFloat44;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt232 && local49 < (float) this.anInt232) {
			local51 |= 0x10;
		} else if (local24 > (float) this.anInt241 && local49 > (float) this.anInt241) {
			local51 |= 0x20;
		}
		@Pc(117) int local117 = (int) ((float) this.anInt235 * (this.aClass51_Sub1_1.aFloat40 * (float) arg0 + this.aClass51_Sub1_1.aFloat41 * (float) arg1 + this.aClass51_Sub1_1.aFloat43 * (float) arg2 + this.aClass51_Sub1_1.aFloat38) / (float) arg6);
		@Pc(150) int local150 = (int) ((float) this.anInt235 * (this.aClass51_Sub1_1.aFloat40 * (float) arg3 + this.aClass51_Sub1_1.aFloat41 * (float) arg4 + this.aClass51_Sub1_1.aFloat43 * (float) arg5 + this.aClass51_Sub1_1.aFloat38) / (float) arg6);
		if (local117 < this.anInt259 && local150 < this.anInt259) {
			local51 |= 0x1;
		} else if (local117 > this.anInt258 && local150 > this.anInt258) {
			local51 |= 0x2;
		}
		@Pc(208) int local208 = (int) ((float) this.anInt240 * (this.aClass51_Sub1_1.aFloat46 * (float) arg0 + this.aClass51_Sub1_1.aFloat47 * (float) arg1 + this.aClass51_Sub1_1.aFloat37 * (float) arg2 + this.aClass51_Sub1_1.aFloat36) / (float) arg6);
		@Pc(241) int local241 = (int) ((float) this.anInt240 * (this.aClass51_Sub1_1.aFloat46 * (float) arg3 + this.aClass51_Sub1_1.aFloat47 * (float) arg4 + this.aClass51_Sub1_1.aFloat37 * (float) arg5 + this.aClass51_Sub1_1.aFloat36) / (float) arg6);
		if (local208 < this.anInt239 && local241 < this.anInt239) {
			local51 |= 0x4;
		} else if (local208 > this.anInt252 && local241 > this.anInt252) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!aha", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt236) {
			local8 = this.anInt236;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt253) {
			local21 = this.anInt253;
		}
		@Pc(30) int local30 = local8;
		@Pc(34) int local34 = arg2 * arg2;
		@Pc(36) int local36 = 0;
		@Pc(40) int local40 = arg1 - local8;
		@Pc(44) int local44 = local40 * local40;
		@Pc(48) int local48 = local44 - local40;
		if (arg1 > local21) {
			arg1 = local21;
		}
		@Pc(57) int local57 = arg3 >>> 24;
		@Pc(91) int local91;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(118) int local118;
		if (local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt233) {
					local91 = this.anInt233;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt245) {
					local102 = this.anInt245;
				}
				local116 = local91 + local30 * this.anInt254;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray31[local116++] = arg3;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg2;
			local40 = local30 - arg1;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg2;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt233) {
					local91 = this.anInt233;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt245 - 1) {
					local102 = this.anInt245 - 1;
				}
				local116 = local91 + local30 * this.anInt254;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray31[local116++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(277) int local277 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
		local91 = 256 - local57;
		@Pc(334) int local334;
		@Pc(340) int local340;
		while (local30 < arg1) {
			while (local48 <= local34 || local44 <= local34) {
				local44 += local36 + local36;
				local48 += local36++ + local36;
			}
			local102 = arg0 + 1 - local36;
			if (local102 < this.anInt233) {
				local102 = this.anInt233;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt245) {
				local116 = this.anInt245;
			}
			local118 = local102 + local30 * this.anInt254;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray31[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray31[local118++] = local277 + local360;
			}
			local30++;
			local44 -= local40-- + local40;
			local48 -= local40 + local40;
		}
		local36 = arg2;
		local40 = -local40;
		local48 = local40 * local40 + local34;
		local44 = local48 - arg2;
		local48 -= local40;
		while (local30 < local21) {
			while (local48 > local34 && local44 > local34) {
				local48 -= local36-- + local36;
				local44 -= local36 + local36;
			}
			local102 = arg0 - local36;
			if (local102 < this.anInt233) {
				local102 = this.anInt233;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt245 - 1) {
				local116 = this.anInt245 - 1;
			}
			local118 = local102 + local30 * this.anInt254;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray31[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray31[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!mda;Lclient!mda;FLclient!mda;)Lclient!mda;")
	@Override
	public Class49 method8123(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class49 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!fl;)V")
	@Override
	public void method8101(@OriginalArg(0) Class119 arg0) {
		@Pc(3) Class192 local3 = this.method348(Thread.currentThread());
		@Pc(7) Class16_Sub6 local7 = arg0.aClass202_1.aClass16_Sub6_1;
		for (@Pc(10) Class16_Sub6 local10 = local7.aClass16_Sub6_10; local10 != local7; local10 = local10.aClass16_Sub6_10) {
			@Pc(14) Class16_Sub6_Sub1 local14 = (Class16_Sub6_Sub1) local10;
			@Pc(19) int local19 = local14.anInt10126 >> 12;
			@Pc(24) int local24 = local14.anInt10131 >> 12;
			@Pc(29) int local29 = local14.anInt10130 >> 12;
			@Pc(54) float local54 = this.aClass51_Sub1_1.aFloat44 + this.aClass51_Sub1_1.aFloat39 * (float) local19 + this.aClass51_Sub1_1.aFloat45 * (float) local24 + this.aClass51_Sub1_1.aFloat42 * (float) local29;
			if (!(local54 < (float) this.anInt232) && !(local54 > (float) local3.anInt5125)) {
				@Pc(102) int local102 = this.anInt255 + (int) ((float) this.anInt235 * (this.aClass51_Sub1_1.aFloat38 + this.aClass51_Sub1_1.aFloat40 * (float) local19 + this.aClass51_Sub1_1.aFloat41 * (float) local24 + this.aClass51_Sub1_1.aFloat43 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt237 + (int) ((float) this.anInt240 * (this.aClass51_Sub1_1.aFloat36 + this.aClass51_Sub1_1.aFloat46 * (float) local19 + this.aClass51_Sub1_1.aFloat47 * (float) local24 + this.aClass51_Sub1_1.aFloat37 * (float) local29) / local54);
				if (local102 >= this.anInt233 && local102 <= this.anInt245 && local137 >= this.anInt236 && local137 <= this.anInt253) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method350(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt10125 * this.anInt235 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!aha", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt254;
		@Pc(35) int local35 = this.anInt254 - arg2;
		if (arg1 + arg3 > this.anInt253) {
			arg3 -= arg1 + arg3 - this.anInt253;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt236) {
			local59 = this.anInt236 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt254;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt245) {
			local59 = arg0 + arg2 - this.anInt245;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt233) {
			local59 = this.anInt233 - arg0;
			arg2 -= local59;
			local30 += local59;
			local6 += local14 * local59;
			local35 += local59;
		}
		local59 = arg4 >>> 24;
		@Pc(132) int local132 = arg5 >>> 24;
		@Pc(145) int local145;
		@Pc(148) int local148;
		@Pc(155) int local155;
		@Pc(158) int local158;
		if (arg8 == 0 || arg8 == 1 && local59 == 255 && local132 == 255) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					if (arg6[(local6 >> 16) + local155] == 0) {
						this.anIntArray31[local30++] = arg4;
					} else {
						this.anIntArray31[local30++] = arg5;
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
			return;
		}
		@Pc(222) int local222;
		@Pc(236) int local236;
		@Pc(240) int local240;
		@Pc(245) int local245;
		if (arg8 == 1) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					local236 = local222 >>> 24;
					local240 = 255 - local236;
					local245 = this.anIntArray31[local30];
					this.anIntArray31[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else if (arg8 == 2) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					if (local222 == 0) {
						local30++;
					} else {
						local236 = this.anIntArray31[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray31[local30++] = local240 - local360 | local360 - (local360 >>> 8);
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIF)Lclient!laa;")
	@Override
	public Class2_Sub12 method8111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!aha", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass51_Sub1_1.aFloat44 + this.aClass51_Sub1_1.aFloat39 * (float) arg0 + this.aClass51_Sub1_1.aFloat45 * (float) arg1 + this.aClass51_Sub1_1.aFloat42 * (float) arg2;
		if (local24 < (float) this.anInt232 || local24 > (float) this.anInt241) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt235 * (this.aClass51_Sub1_1.aFloat38 + this.aClass51_Sub1_1.aFloat40 * (float) arg0 + this.aClass51_Sub1_1.aFloat41 * (float) arg1 + this.aClass51_Sub1_1.aFloat43 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt240 * (this.aClass51_Sub1_1.aFloat36 + this.aClass51_Sub1_1.aFloat46 * (float) arg0 + this.aClass51_Sub1_1.aFloat47 * (float) arg1 + this.aClass51_Sub1_1.aFloat37 * (float) arg2) / local24);
		if (local81 >= this.anInt259 && local81 <= this.anInt258 && local113 >= this.anInt239 && local113 <= this.anInt252) {
			arg3[0] = local81 - this.anInt259;
			arg3[1] = local113 - this.anInt239;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!aha", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aha", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class192 local3 = this.method348(Thread.currentThread());
		local3.anInt5132 = arg0;
		local3.anInt5127 = arg1;
		local3.anInt5128 = arg2;
	}

	@OriginalMember(owner = "client!aha", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.anInt242;
		this.anInt242 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!aha", name = "o", descriptor = "()Z")
	@Override
	public boolean method8121() {
		return true;
	}

	@OriginalMember(owner = "client!aha", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray170;
		@Pc(8) int[] local8 = local2.anIntArray171;
		@Pc(20) int local20;
		if (this.anInt253 < arg3 + local5.length) {
			local20 = this.anInt253 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt236 > arg3) {
			local33 = this.anInt236 - arg3;
			arg3 = this.anInt236;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt254;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt233 > local58) {
				local62 -= this.anInt233 - local58;
				local58 = this.anInt233;
			}
			if (this.anInt245 < local58 + local62) {
				local62 = this.anInt245 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray31[local58++] = arg0;
			}
			local49 += this.anInt254;
		}
	}

	@OriginalMember(owner = "client!aha", name = "s", descriptor = "()Lclient!pda;")
	@Override
	public Class51 method8137() {
		return new Class51_Sub1();
	}

	@OriginalMember(owner = "client!aha", name = "l", descriptor = "()Z")
	@Override
	public boolean method8116() {
		return false;
	}

	@OriginalMember(owner = "client!aha", name = "f", descriptor = "()V")
	@Override
	public void method8108() {
	}

	@OriginalMember(owner = "client!aha", name = "m", descriptor = "(I)Z")
	public boolean method344(@OriginalArg(0) int arg0) {
		return super.anInterface2_12.method6026(arg0);
	}

	@OriginalMember(owner = "client!aha", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt236 || arg1 >= this.anInt253) {
			return;
		}
		if (arg0 < this.anInt233) {
			arg2 -= this.anInt233 - arg0;
			arg0 = this.anInt233;
		}
		if (arg0 + arg2 > this.anInt245) {
			arg2 = this.anInt245 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt254;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray31[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray31[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray31[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray31[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray31[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aha", name = "j", descriptor = "()V")
	@Override
	public void method8110() {
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(Z)V")
	@Override
	public void method8140(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "([IIIIIZ)Lclient!iea;")
	@Override
	public Class31 method8157(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class31_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class31_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class31_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class31_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aha", name = "w", descriptor = "()V")
	@Override
	public void method8150() {
	}

	@OriginalMember(owner = "client!aha", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt254) {
			arg2 = this.anInt254;
		}
		if (arg3 > this.anInt248) {
			arg3 = this.anInt248;
		}
		this.anInt233 = arg0;
		this.anInt245 = arg2;
		this.anInt236 = arg1;
		this.anInt253 = arg3;
		this.method351();
	}

	@OriginalMember(owner = "client!aha", name = "h", descriptor = "()Z")
	@Override
	public boolean method8109() {
		return false;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIIII)V")
	private void method345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt236 || arg1 >= this.anInt253) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt254;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg0 + local37 >= this.anInt233 && arg0 + local37 < this.anInt245 && local27 < arg4) {
					this.anIntArray31[local15 + local37] = arg3;
				}
				local37++;
				local27++;
				local27 %= local23;
			}
			return;
		}
		@Pc(97) int local97 = ((arg3 & 0xFF00FF) * local19 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local19 >> 8 & 0xFF00) + (local19 << 24);
		local37 = 256 - local19;
		@Pc(103) int local103 = 0;
		while (local103 < arg2) {
			if (arg0 + local103 >= this.anInt233 && arg0 + local103 < this.anInt245 && local27 < arg4) {
				@Pc(126) int local126 = this.anIntArray31[local15 + local103];
				@Pc(146) int local146 = ((local126 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local126 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray31[local15 + local103] = local97 + local146;
			}
			local103++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!aha", name = "n", descriptor = "(I)[I")
	public int[] method346(@OriginalArg(0) int arg0) {
		@Pc(2) Class69 local2 = this.aClass69_6;
		@Pc(14) Class2_Sub16 local14;
		synchronized (this.aClass69_6) {
			local14 = (Class2_Sub16) this.aClass69_6.method1919((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface2_12.method6026(arg0)) {
					return null;
				}
				@Pc(34) Class271 local34 = super.anInterface2_12.method6027(arg0);
				@Pc(45) int local45 = local34.aBoolean516 || this.aBoolean29 ? 64 : this.anInt250;
				local14 = new Class2_Sub16(arg0, local45, super.anInterface2_12.method6023(local45, 0.7F, arg0, local45), local34.anInt7162 != 1);
				this.aClass69_6.method1917((long) arg0 | Long.MIN_VALUE, local14);
			}
		}
		local14.aBoolean220 = true;
		return local14.method2302();
	}

	@OriginalMember(owner = "client!aha", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class192 local3 = this.method348(Thread.currentThread());
		this.anInt232 = arg0;
		this.anInt241 = arg1;
		local3.anInt5125 = this.anInt241 - 255;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray170;
		@Pc(8) int[] local8 = local2.anIntArray171;
		@Pc(17) int local17 = this.anInt236 > arg7 ? this.anInt236 : arg7;
		@Pc(32) int local32 = this.anInt253 < arg7 + local5.length ? this.anInt253 : arg7 + local5.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg2 + arg3 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(83) int local83;
		@Pc(116) int local116;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(145) int local145;
		@Pc(226) int local226;
		@Pc(243) int local243;
		@Pc(248) int local248;
		@Pc(201) int local201;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(390) int local390 = arg2 << 16;
			local83 = (int) Math.floor((double) local390 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local17) {
				arg0 += local83 * (local17 - arg1);
				arg1 = local17;
			}
			if (arg3 >= local32) {
				arg3 = local32 - 1;
			}
			local116 = arg4 >>> 24;
			if (local116 == 255) {
				while (arg1 <= arg3) {
					local129 = arg0 >> 16;
					local133 = arg1 - arg7;
					local145 = arg6 + local5[local133];
					if (local129 >= this.anInt233 && local129 < this.anInt245 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray31[local129 + arg1 * this.anInt254] = arg4;
					}
					arg0 += local83;
					arg1++;
				}
			} else {
				local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
				local129 = 256 - local116;
				while (arg1 <= arg3) {
					local133 = arg0 >> 16;
					local145 = arg1 - arg7;
					local226 = arg6 + local5[local145];
					if (local133 >= this.anInt233 && local133 < this.anInt245 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt254;
						local248 = this.anIntArray31[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray31[local133 + arg1 * this.anInt254] = local201 + local584;
					}
					arg0 += local83;
					arg1++;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(73) int local73 = arg3 << 16;
		local83 = (int) Math.floor((double) local73 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt233) {
			arg1 += local83 * (this.anInt233 - arg0);
			arg0 = this.anInt233;
		}
		if (arg2 >= this.anInt245) {
			arg2 = this.anInt245 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray31[arg0 + local129 * this.anInt254] = arg4;
					}
				}
				arg1 += local83;
				arg0++;
			}
			return;
		}
		local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
		local129 = 256 - local116;
		while (arg0 <= arg2) {
			local133 = arg1 >> 16;
			local145 = local133 - arg7;
			if (local133 >= local17 && local133 < local32) {
				local226 = arg6 + local5[local145];
				if (arg0 >= local226 && arg0 < local226 + local8[local145]) {
					local243 = arg0 + local133 * this.anInt254;
					local248 = this.anIntArray31[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray31[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method8104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!jl;[Lclient!hb;Z)Lclient!da;")
	@Override
	public Class37 method8136(@OriginalArg(0) Class183 arg0, @OriginalArg(1) Class139[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt3984;
			local7[local11] = arg1[local11].anInt3983;
			if (arg1[local11].aByteArray31 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class37_Sub1(this, arg0, arg1, local3, local7);
		} else {
			return new Class37_Sub5(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!aha", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt255 = arg0;
		this.anInt237 = arg1;
		this.anInt235 = arg2;
		this.anInt240 = arg3;
		this.method351();
	}

	@OriginalMember(owner = "client!aha", name = "o", descriptor = "(I)I")
	public int method347(@OriginalArg(0) int arg0) {
		return super.anInterface2_12.method6027(arg0).anInt7162;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8126() {
		@Pc(3) Class192 local3 = this.method348(Thread.currentThread());
		@Pc(6) Class374 local6 = local3.aClass374_1;
		local6.aBoolean738 = false;
		@Pc(14) int local14 = 5 - this.anInt259;
		@Pc(19) int local19 = 75 - this.anInt259;
		@Pc(24) int local24 = 15 - this.anInt259;
		@Pc(29) int local29 = 10 - this.anInt239;
		@Pc(34) int local34 = 50 - this.anInt239;
		@Pc(39) int local39 = 90 - this.anInt239;
		local6.aBoolean739 = local14 < 0 || local14 > local6.anInt10207 || local19 < 0 || local19 > local6.anInt10207 || local24 < 0 || local24 > local6.anInt10207;
		local6.anInt10206 = 0;
		local6.aBoolean737 = false;
		local6.method8690((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		local6.aBoolean738 = true;
	}

	@OriginalMember(owner = "client!aha", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class192 local3 = this.method348(Thread.currentThread());
		local3.aBoolean381 = arg0;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray170;
		@Pc(8) int[] local8 = local2.anIntArray171;
		@Pc(17) int local17 = this.anInt236 > arg7 ? this.anInt236 : arg7;
		@Pc(32) int local32 = this.anInt253 < arg7 + local5.length ? this.anInt253 : arg7 + local5.length;
		@Pc(36) int local36 = arg10 << 8;
		@Pc(40) int local40 = arg8 << 8;
		@Pc(44) int local44 = arg9 << 8;
		@Pc(48) int local48 = local40 + local44;
		arg10 = local36 % local48;
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(77) int local77;
		@Pc(81) int local81;
		if (arg2 + arg3 < 0) {
			local77 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
			local81 = local77 % local48;
			local36 = local48 + local40 - arg10 - local81;
			arg10 = local36 % local48;
			if (arg10 < 0) {
				arg10 += local48;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(159) int local159;
		@Pc(172) int local172;
		@Pc(176) int local176;
		@Pc(199) int local199;
		@Pc(299) int local299;
		@Pc(316) int local316;
		@Pc(142) int local142;
		@Pc(128) int local128;
		@Pc(263) int local263;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			local142 = arg2 << 16;
			local77 = (int) Math.floor((double) local142 / (double) arg3 + 0.5D);
			local81 = (int) Math.sqrt((double) ((local77 >> 8) * (local77 >> 8) + 65536));
			local128 = arg3 + arg1;
			local159 = arg4 >>> 24;
			if (local159 == 255) {
				while (arg1 <= local128) {
					local172 = arg0 >> 16;
					local176 = arg1 - arg7;
					if (arg1 >= local17 && arg1 < local32 && local172 >= this.anInt233 && local172 < this.anInt245 && arg10 < local40 && local172 >= arg6 + local5[local176] && local172 < arg6 + local5[local176] + local8[local176]) {
						this.anIntArray31[local172 + arg1 * this.anInt254] = arg4;
					}
					arg0 += local77;
					arg1++;
					local36 = arg10 + local81;
					arg10 = local36 % local48;
				}
			} else {
				local263 = ((arg4 & 0xFF00FF) * local159 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local159 >> 8 & 0xFF00) + (local159 << 24);
				local172 = 256 - local159;
				while (arg1 <= local128) {
					local176 = arg0 >> 16;
					local199 = arg1 - arg7;
					if (arg1 >= local17 && arg1 < local32 && local176 >= this.anInt233 && local176 < this.anInt245 && arg10 < local40 && local176 >= arg6 + local5[local199] && local176 < arg6 + local5[local199] + local8[local199]) {
						local299 = local176 + arg1 * this.anInt254;
						local316 = this.anIntArray31[local299];
						@Pc(707) int local707 = ((local316 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local316 & 0xFF00) * local172 >> 8 & 0xFF00);
						this.anIntArray31[local176 + arg1 * this.anInt254] = local263 + local707;
					}
					arg0 += local77;
					arg1++;
					local36 = arg10 + local81;
					arg10 = local36 % local48;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		local128 = arg3 << 16;
		local77 = (int) Math.floor((double) local128 / (double) arg2 + 0.5D);
		local142 = arg2 + arg0;
		local81 = arg4 >>> 24;
		local159 = (int) Math.sqrt((double) ((local77 >> 8) * (local77 >> 8) + 65536));
		if (local81 == 255) {
			while (arg0 <= local142) {
				local172 = arg1 >> 16;
				local176 = local172 - arg7;
				if (arg0 >= this.anInt233 && arg0 < this.anInt245 && local172 >= local17 && local172 < local32 && arg10 < local40) {
					local199 = arg6 + local5[local176];
					if (arg0 >= local199 && arg0 < local199 + local8[local176]) {
						this.anIntArray31[arg0 + local172 * this.anInt254] = arg4;
					}
				}
				arg1 += local77;
				arg0++;
				local36 = arg10 + local159;
				arg10 = local36 % local48;
			}
			return;
		}
		local263 = ((arg4 & 0xFF00FF) * local81 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local81 >> 8 & 0xFF00) + (local81 << 24);
		local172 = 256 - local81;
		while (arg0 <= local142) {
			local176 = arg1 >> 16;
			local199 = local176 - arg7;
			if (arg0 >= this.anInt233 && arg0 < this.anInt245 && local176 >= local17 && local176 < local32 && arg10 < local40) {
				local299 = arg6 + local5[local199];
				if (arg0 >= local299 && arg0 < local299 + local8[local199]) {
					local316 = arg0 + local176 * this.anInt254;
					@Pc(321) int local321 = this.anIntArray31[local316];
					@Pc(341) int local341 = ((local321 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local321 & 0xFF00) * local172 >> 8 & 0xFF00);
					this.anIntArray31[local316] = local263 + local341;
				}
			}
			arg1 += local77;
			arg0++;
			local36 = arg10 + local159;
			arg10 = local36 % local48;
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "()Z")
	@Override
	public boolean method8084() {
		return false;
	}

	@OriginalMember(owner = "client!aha", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt246;
		this.anInt246 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!k;")
	public Class192 method348(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.lb; local1++) {
			if (this.aClass192Array1[local1].aRunnable2 == arg0) {
				return this.aClass192Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aha", name = "f", descriptor = "(I)V")
	@Override
	public void method8113(@OriginalArg(0) int arg0) {
		this.anInt250 = arg0;
		this.aClass69_6.method1905();
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "([I)V")
	@Override
	public void method8100(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt254;
		arg0[1] = this.anInt248;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(I[Lclient!laa;)V")
	@Override
	public void method8102(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12[] arg1) {
	}

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "(II)V")
	@Override
	public void method8133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas1 == null || this.aClass2_Sub26_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			this.aClass2_Sub26_1.method8911(0, arg1, this.anInt228, 0, arg0, local14, this.anInt229);
		} catch (@Pc(29) Exception local29) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!aha", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass192Array1.length; local1++) {
			@Pc(7) Class192 local7 = this.aClass192Array1[local1];
			local7.anInt5127 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt5127 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt5127 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt5127 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt5127 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean380 = false;
			} else {
				local7.aBoolean380 = true;
			}
		}
	}

	@OriginalMember(owner = "client!aha", name = "e", descriptor = "()V")
	@Override
	protected void method8103() {
		if (this.aBoolean27) {
			Static21.method563(true, false);
			this.aBoolean27 = false;
		}
		this.aClass2_Sub26_1 = null;
		this.aCanvas1 = null;
		this.anInt229 = 0;
		this.anInt228 = 0;
		this.aClass323_3 = null;
		this.aBoolean28 = true;
	}

	@OriginalMember(owner = "client!aha", name = "p", descriptor = "()Z")
	@Override
	public boolean method8128() {
		return false;
	}

	@OriginalMember(owner = "client!aha", name = "x", descriptor = "()Z")
	@Override
	public boolean method8152() {
		return false;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8158(@OriginalArg(0) Class2_Sub40 arg0) {
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8156(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas1 == arg0) {
			this.method8124((Canvas) null);
		}
		@Pc(15) Class2_Sub26 local15 = (Class2_Sub26) this.aClass323_3.method7484((long) arg0.hashCode());
		if (local15 != null) {
			local15.method8920();
		}
	}

	@OriginalMember(owner = "client!aha", name = "n", descriptor = "()Lclient!pda;")
	@Override
	public Class51 method8119() {
		return this.aClass51_Sub1_1;
	}

	@OriginalMember(owner = "client!aha", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt255, this.anInt237, this.anInt235, this.anInt240 };
	}

	@OriginalMember(owner = "client!aha", name = "A", descriptor = "()Z")
	@Override
	public boolean method8167() {
		return true;
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(II)I")
	@Override
	public int method8122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!aha", name = "k", descriptor = "()Z")
	@Override
	public boolean method8114() {
		return true;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!lga;IIII)Lclient!ka;")
	@Override
	public Class193 method8161(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class193_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!aha", name = "p", descriptor = "(I)Z")
	public boolean method349(@OriginalArg(0) int arg0) {
		return super.anInterface2_12.method6027(arg0).aBoolean513 || super.anInterface2_12.method6027(arg0).aBoolean510;
	}

	@OriginalMember(owner = "client!aha", name = "j", descriptor = "(I)Lclient!za;")
	@Override
	public Class2_Sub40 method8162(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aha", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt232;
	}

	@OriginalMember(owner = "client!aha", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt233 == 0 && this.anInt245 == this.anInt254 && this.anInt236 == 0 && this.anInt253 == this.anInt248) {
			local19 = this.aFloatArray2.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
			}
			while (local27 < local19) {
				this.aFloatArray2[local27++] = 2.14748365E9F;
			}
			return;
		}
		local19 = this.anInt245 - this.anInt233;
		local25 = this.anInt253 - this.anInt236;
		local27 = this.anInt254 - local19;
		@Pc(116) int local116 = this.anInt233 + this.anInt236 * this.anInt254;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!aha", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass51_Sub1_1.aFloat39 * (float) arg0 + this.aClass51_Sub1_1.aFloat45 * (float) arg1 + this.aClass51_Sub1_1.aFloat42 * (float) arg2 + this.aClass51_Sub1_1.aFloat44;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass51_Sub1_1.aFloat39 * (float) arg3 + this.aClass51_Sub1_1.aFloat45 * (float) arg4 + this.aClass51_Sub1_1.aFloat42 * (float) arg5 + this.aClass51_Sub1_1.aFloat44;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt232 && local57 < (float) this.anInt232) {
			local1 |= 0x10;
		} else if (local26 > (float) this.anInt241 && local57 > (float) this.anInt241) {
			local1 |= 0x20;
		}
		@Pc(128) int local128 = (int) ((float) this.anInt235 * (this.aClass51_Sub1_1.aFloat40 * (float) arg0 + this.aClass51_Sub1_1.aFloat41 * (float) arg1 + this.aClass51_Sub1_1.aFloat43 * (float) arg2 + this.aClass51_Sub1_1.aFloat38) / local26);
		@Pc(160) int local160 = (int) ((float) this.anInt235 * (this.aClass51_Sub1_1.aFloat40 * (float) arg3 + this.aClass51_Sub1_1.aFloat41 * (float) arg4 + this.aClass51_Sub1_1.aFloat43 * (float) arg5 + this.aClass51_Sub1_1.aFloat38) / local57);
		if (local128 < this.anInt259 && local160 < this.anInt259) {
			local1 |= 0x1;
		} else if (local128 > this.anInt258 && local160 > this.anInt258) {
			local1 |= 0x2;
		}
		@Pc(217) int local217 = (int) ((float) this.anInt240 * (this.aClass51_Sub1_1.aFloat46 * (float) arg0 + this.aClass51_Sub1_1.aFloat47 * (float) arg1 + this.aClass51_Sub1_1.aFloat37 * (float) arg2 + this.aClass51_Sub1_1.aFloat36) / local26);
		@Pc(249) int local249 = (int) ((float) this.anInt240 * (this.aClass51_Sub1_1.aFloat46 * (float) arg3 + this.aClass51_Sub1_1.aFloat47 * (float) arg4 + this.aClass51_Sub1_1.aFloat37 * (float) arg5 + this.aClass51_Sub1_1.aFloat36) / local57);
		if (local217 < this.anInt239 && local249 < this.anInt239) {
			local1 |= 0x4;
		} else if (local217 > this.anInt252 && local249 > this.anInt252) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aha", name = "e", descriptor = "(I)V")
	@Override
	public void method8105() {
		Static468.anInt7559 = 10000;
		Static468.anInt7567 = 10000;
		if (this.lb > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method8099(this.lb);
		this.method8139(0);
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method345(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local28 = arg5 + arg6;
				local32 = arg7 % local28;
				local32 = local28 + arg5 - local32 - (-arg2 + 1) % local28;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				this.method345(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
			}
		} else if (arg2 != 0) {
			local32 = arg7 << 8;
			@Pc(143) int local143 = arg5 << 8;
			@Pc(147) int local147 = arg6 << 8;
			local28 = local143 + local147;
			arg7 = local32 % local28;
			@Pc(172) int local172;
			@Pc(176) int local176;
			if (arg2 + arg3 < 0) {
				local172 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
				local176 = local172 % local28;
				local32 = local28 + local143 - arg7 - local176;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(254) int local254;
			@Pc(267) int local267;
			@Pc(349) int local349;
			@Pc(375) int local375;
			@Pc(380) int local380;
			@Pc(237) int local237;
			@Pc(223) int local223;
			@Pc(340) int local340;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				local223 = arg3 << 16;
				local172 = (int) Math.floor((double) local223 / (double) arg2 + 0.5D);
				local237 = arg2 + arg0;
				local176 = arg4 >>> 24;
				local254 = (int) Math.sqrt((double) ((local172 >> 8) * (local172 >> 8) + 65536));
				if (local176 == 255) {
					while (arg0 <= local237) {
						local267 = arg1 >> 16;
						if (arg0 >= this.anInt233 && arg0 < this.anInt245 && local267 >= this.anInt236 && local267 < this.anInt253 && arg7 < local143) {
							this.anIntArray31[arg0 + local267 * this.anInt254] = arg4;
						}
						arg1 += local172;
						arg0++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				} else {
					local340 = ((arg4 & 0xFF00FF) * local176 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local176 >> 8 & 0xFF00) + (local176 << 24);
					local267 = 256 - local176;
					while (arg0 <= local237) {
						local349 = arg1 >> 16;
						if (arg0 >= this.anInt233 && arg0 < this.anInt245 && local349 >= this.anInt236 && local349 < this.anInt253 && arg7 < local143) {
							local375 = arg0 + local349 * this.anInt254;
							local380 = this.anIntArray31[local375];
							local380 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray31[local375] = local340 + local380;
						}
						arg1 += local172;
						arg0++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				local237 = arg2 << 16;
				local172 = (int) Math.floor((double) local237 / (double) arg3 + 0.5D);
				local223 = arg3 + arg1;
				local176 = arg4 >>> 24;
				local254 = (int) Math.sqrt((double) ((local172 >> 8) * (local172 >> 8) + 65536));
				if (local176 == 255) {
					while (arg1 <= local223) {
						local267 = arg0 >> 16;
						if (arg1 >= this.anInt236 && arg1 < this.anInt253 && local267 >= this.anInt233 && local267 < this.anInt245 && arg7 < local143) {
							this.anIntArray31[local267 + arg1 * this.anInt254] = arg4;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				} else {
					local340 = ((arg4 & 0xFF00FF) * local176 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local176 >> 8 & 0xFF00) + (local176 << 24);
					local267 = 256 - local176;
					while (arg1 <= local223) {
						local349 = arg0 >> 16;
						if (arg1 >= this.anInt236 && arg1 < this.anInt253 && local349 >= this.anInt233 && local349 < this.anInt245 && arg7 < local143) {
							local375 = local349 + arg1 * this.anInt254;
							local380 = this.anIntArray31[local375];
							@Pc(708) int local708 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray31[local349 + arg1 * this.anInt254] = local340 + local708;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method352(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local28 = arg5 + arg6;
			local32 = arg7 % local28;
			local32 = local28 + arg5 - local32 - (-arg3 + 1) % local28;
			arg7 = local32 % local28;
			if (arg7 < 0) {
				arg7 += local28;
			}
			this.method352(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)V")
	@Override
	public void method8086(@OriginalArg(0) int arg0) {
		this.aClass192Array1[arg0].method4504((Runnable) null);
	}

	@OriginalMember(owner = "client!aha", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt254 + arg0;
		@Pc(13) int local13 = arg1 * this.anInt256 + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(21) int[] local21 = this.anIntArray31;
		@Pc(24) float[] local24 = this.aFloatArray2;
		@Pc(31) int local31;
		if (local6 < 0) {
			local31 = local21.length + local6;
			Static650.method2270(local21, -local6, local21, 0, local31);
		} else if (local6 > 0) {
			local31 = local21.length - local6;
			Static650.method2270(local21, 0, local21, local6, local31);
		}
		if (local13 < 0) {
			local31 = local24.length + local13;
			Static650.method2273(local24, -local13, local24, 0, local31);
		} else if (local13 > 0) {
			local31 = local24.length - local13;
			Static650.method2273(local24, 0, local24, local13, local31);
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIZ)Lclient!iea;")
	@Override
	public Class31 method8169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class31_Sub1_Sub1(this, arg0, arg1) : new Class31_Sub1_Sub3(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "()Z")
	@Override
	public boolean method8093() {
		return false;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!l;IIII)V")
	private void method350(@OriginalArg(0) Class16_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt10127;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method339(arg1, arg2, arg3, arg4, arg0.anInt10129, 1);
			return;
		}
		if (this.anInt260 != local2) {
			@Pc(33) Class31 local33 = (Class31) this.aClass69_5.method1919((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method346(local2);
				if (local39 == null) {
					return;
				}
				@Pc(50) int local50 = this.method340(local2) ? 64 : this.anInt250;
				local33 = this.method8088(local50, local50, local39, local50);
				this.aClass69_5.method1917((long) local2, local33);
			}
			this.anInt260 = local2;
			this.aClass31_1 = local33;
		}
		local8++;
		((Class31_Sub1) this.aClass31_1).method8816(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt10129, 1);
	}

	@OriginalMember(owner = "client!aha", name = "C", descriptor = "()V")
	private void method351() {
		this.anInt259 = this.anInt233 - this.anInt255;
		this.anInt258 = this.anInt245 - this.anInt255;
		this.anInt239 = this.anInt236 - this.anInt237;
		this.anInt252 = this.anInt253 - this.anInt237;
		for (@Pc(29) int local29 = 0; local29 < this.lb; local29++) {
			@Pc(36) Class374 local36 = this.aClass192Array1[local29].aClass374_1;
			local36.anInt10208 = this.anInt255 - this.anInt233;
			local36.anInt10210 = this.anInt237 - this.anInt236;
			local36.anInt10207 = this.anInt245 - this.anInt233;
			local36.anInt10209 = this.anInt253 - this.anInt236;
		}
		@Pc(78) int local78 = this.anInt236 * this.anInt254 + this.anInt233;
		for (@Pc(81) int local81 = this.anInt236; local81 < this.anInt253; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.lb; local84++) {
				this.aClass192Array1[local84].aClass374_1.anIntArray719[local81 - this.anInt236] = local78;
			}
			local78 += this.anInt254;
		}
	}

	@OriginalMember(owner = "client!aha", name = "z", descriptor = "()V")
	@Override
	public void method8166() {
		this.aClass69_6.method1905();
		this.aClass69_5.method1905();
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8085(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas1 == null || this.aClass2_Sub26_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x + arg2 <= this.anInt254 && local21.y + arg3 <= this.anInt248 && local21.x + arg2 + local21.width > 0 && local21.y + arg3 + local21.height > 0) {
					this.aClass2_Sub26_1.method8911(local21.x, local21.y + arg3, local21.height, local21.y, local21.x + arg2, local14, local21.width);
				}
			}
		} catch (@Pc(79) Exception local79) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIZ)Lclient!iea;")
	@Override
	public Class31 method8153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt254 + arg0;
		@Pc(16) int local16 = this.anInt254 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray31[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class31_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class31_Sub1_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aha", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt231 = (int) (arg1 * 65535.0F);
		this.anInt251 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt238 = (int) (arg3 * 65535.0F / local26);
		this.anInt247 = (int) (arg4 * 65535.0F / local26);
		this.anInt243 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "()I")
	@Override
	public int method8089() {
		return 0;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8124(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas1 = null;
			this.aClass2_Sub26_1 = null;
			if (this.aClass357_1 == null) {
				this.anIntArray31 = null;
				this.anInt254 = this.anInt248 = 1;
				this.anInt256 = this.anInt257 = 1;
				this.method343();
			}
			return;
		}
		@Pc(10) Class2_Sub26 local10 = (Class2_Sub26) this.aClass323_3.method7484((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas1 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.anInt229 = local18.width;
		this.anInt228 = local18.height;
		this.aClass2_Sub26_1 = local10;
		if (this.aClass357_1 != null) {
			return;
		}
		this.anIntArray31 = local10.anIntArray741;
		this.anInt254 = local10.anInt10486;
		this.anInt248 = local10.anInt10482;
		if (this.anInt254 != this.anInt256 || this.anInt248 != this.anInt257) {
			this.anInt234 = this.anInt256 = this.anInt254;
			this.anInt244 = this.anInt257 = this.anInt248;
			this.aFloatArray1 = this.aFloatArray2 = new float[this.anInt256 * this.anInt257];
		}
		this.method343();
		return;
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(IIIIIIII)V")
	private void method352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt233 || arg0 >= this.anInt245) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt254;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg1 + local37 >= this.anInt236 && arg1 + local37 < this.anInt253 && local27 < arg4) {
					this.anIntArray31[local15 + local37 * this.anInt254] = arg3;
				}
				local37++;
				local27++;
				local27 %= local23;
			}
			return;
		}
		@Pc(100) int local100 = ((arg3 & 0xFF00FF) * local19 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local19 >> 8 & 0xFF00) + (local19 << 24);
		local37 = 256 - local19;
		@Pc(106) int local106 = 0;
		while (local106 < arg2) {
			if (arg1 + local106 >= this.anInt236 && arg1 + local106 < this.anInt253 && local27 < arg4) {
				@Pc(129) int local129 = local15 + local106 * this.anInt254;
				@Pc(134) int local134 = this.anIntArray31[local129];
				@Pc(154) int local154 = ((local134 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local134 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray31[local129] = local100 + local154;
			}
			local106++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!nl;)V")
	@Override
	public void method8168(@OriginalArg(0) Interface18 arg0) {
		@Pc(2) Class357 local2 = (Class357) arg0;
		this.anInt254 = local2.anInt9907;
		this.anInt248 = local2.anInt9906;
		this.anIntArray31 = local2.anIntArray698;
		this.aClass357_1 = local2;
		this.anInt256 = local2.anInt9907;
		this.anInt257 = local2.anInt9906;
		this.aFloatArray2 = local2.aFloatArray100;
		this.method343();
	}

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "(I)V")
	@Override
	public void method8099(@OriginalArg(0) int arg0) {
		this.lb = arg0;
		this.aClass192Array1 = new Class192[this.lb];
		for (@Pc(9) int local9 = 0; local9 < this.lb; local9++) {
			this.aClass192Array1[local9] = new Class192(this);
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!fl;I)V")
	@Override
	public void method8165(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class192 local3 = this.method348(Thread.currentThread());
		@Pc(7) Class16_Sub6 local7 = arg0.aClass202_1.aClass16_Sub6_1;
		for (@Pc(10) Class16_Sub6 local10 = local7.aClass16_Sub6_10; local10 != local7; local10 = local10.aClass16_Sub6_10) {
			@Pc(14) Class16_Sub6_Sub1 local14 = (Class16_Sub6_Sub1) local10;
			@Pc(19) int local19 = local14.anInt10126 >> 12;
			@Pc(24) int local24 = local14.anInt10131 >> 12;
			@Pc(29) int local29 = local14.anInt10130 >> 12;
			@Pc(54) float local54 = this.aClass51_Sub1_1.aFloat44 + this.aClass51_Sub1_1.aFloat39 * (float) local19 + this.aClass51_Sub1_1.aFloat45 * (float) local24 + this.aClass51_Sub1_1.aFloat42 * (float) local29;
			if (!(local54 < (float) this.anInt232) && !(local54 > (float) local3.anInt5125)) {
				@Pc(103) int local103 = this.anInt255 + (int) ((float) this.anInt235 * (this.aClass51_Sub1_1.aFloat38 + this.aClass51_Sub1_1.aFloat40 * (float) local19 + this.aClass51_Sub1_1.aFloat41 * (float) local24 + this.aClass51_Sub1_1.aFloat43 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt237 + (int) ((float) this.anInt240 * (this.aClass51_Sub1_1.aFloat36 + this.aClass51_Sub1_1.aFloat46 * (float) local19 + this.aClass51_Sub1_1.aFloat47 * (float) local24 + this.aClass51_Sub1_1.aFloat37 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt233 && local103 <= this.anInt245 && local139 >= this.anInt236 && local139 <= this.anInt253) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method350(local14, local103, local139, (int) local54, (local14.anInt10125 * this.anInt235 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aha", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass192Array1.length; local1++) {
			this.aClass192Array1[local1].anInt5127 = this.aClass192Array1[local1].anInt5131;
			this.aClass192Array1[local1].aBoolean379 = false;
		}
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.anInt256 - arg2;
		@Pc(11) int local11 = arg1 * this.anInt256 + arg0;
		@Pc(14) float[] local14 = this.aFloatArray2;
		@Pc(16) int local16 = 0;
		while (local16 < arg3) {
			@Pc(19) int local19 = 0;
			while (local19 < arg2) {
				@Pc(24) float local24 = local14[local11];
				if (local24 != 2.14748365E9F) {
					local14[local11] = (float) ((double) local24 + arg4);
				}
				local19++;
				local11++;
			}
			local16++;
			local11 += local4;
		}
	}

	@OriginalMember(owner = "client!aha", name = "e", descriptor = "(II)I")
	@Override
	public int method8163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!aha", name = "r", descriptor = "()Lclient!nia;")
	@Override
	public Class240 method8135() {
		return new Class240(0, "Pure Java", 1, "CPU", 0L);
	}
}
