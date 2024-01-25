import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public final class Class82_Sub2 extends Class82 {

	@OriginalMember(owner = "client!fga", name = "x", descriptor = "Lclient!ev;")
	public Class3_Sub16 aClass3_Sub16_1;

	@OriginalMember(owner = "client!fga", name = "y", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!fga", name = "z", descriptor = "Z")
	private boolean aBoolean228;

	@OriginalMember(owner = "client!fga", name = "A", descriptor = "Lclient!baa;")
	private Class25 aClass25_16;

	@OriginalMember(owner = "client!fga", name = "B", descriptor = "I")
	private int anInt3078;

	@OriginalMember(owner = "client!fga", name = "C", descriptor = "I")
	private int anInt3079;

	@OriginalMember(owner = "client!fga", name = "D", descriptor = "I")
	private int anInt3080;

	@OriginalMember(owner = "client!fga", name = "E", descriptor = "Z")
	private boolean aBoolean229;

	@OriginalMember(owner = "client!fga", name = "F", descriptor = "I")
	public int anInt3081;

	@OriginalMember(owner = "client!fga", name = "G", descriptor = "I")
	private int anInt3082;

	@OriginalMember(owner = "client!fga", name = "H", descriptor = "Lclient!il;")
	private Class163 aClass163_1;

	@OriginalMember(owner = "client!fga", name = "I", descriptor = "Lclient!bg;")
	public Class31_Sub1 aClass31_Sub1_1;

	@OriginalMember(owner = "client!fga", name = "J", descriptor = "I")
	public int anInt3083;

	@OriginalMember(owner = "client!fga", name = "K", descriptor = "I")
	public int anInt3084;

	@OriginalMember(owner = "client!fga", name = "L", descriptor = "I")
	public int anInt3085;

	@OriginalMember(owner = "client!fga", name = "M", descriptor = "I")
	private int anInt3086;

	@OriginalMember(owner = "client!fga", name = "N", descriptor = "I")
	public int anInt3087;

	@OriginalMember(owner = "client!fga", name = "O", descriptor = "I")
	public int anInt3088;

	@OriginalMember(owner = "client!fga", name = "P", descriptor = "I")
	public int anInt3089;

	@OriginalMember(owner = "client!fga", name = "Q", descriptor = "I")
	private int anInt3090;

	@OriginalMember(owner = "client!fga", name = "R", descriptor = "I")
	public int anInt3091;

	@OriginalMember(owner = "client!fga", name = "S", descriptor = "I")
	public int anInt3092;

	@OriginalMember(owner = "client!fga", name = "T", descriptor = "Lclient!gw;")
	private final Class136 aClass136_19;

	@OriginalMember(owner = "client!fga", name = "U", descriptor = "I")
	public int anInt3093;

	@OriginalMember(owner = "client!fga", name = "V", descriptor = "I")
	public int anInt3094;

	@OriginalMember(owner = "client!fga", name = "W", descriptor = "I")
	public int anInt3095;

	@OriginalMember(owner = "client!fga", name = "X", descriptor = "I")
	public int anInt3096;

	@OriginalMember(owner = "client!fga", name = "Y", descriptor = "I")
	public int anInt3097;

	@OriginalMember(owner = "client!fga", name = "Z", descriptor = "I")
	public int anInt3098;

	@OriginalMember(owner = "client!fga", name = "ab", descriptor = "Z")
	private boolean aBoolean230;

	@OriginalMember(owner = "client!fga", name = "bb", descriptor = "I")
	public int anInt3099;

	@OriginalMember(owner = "client!fga", name = "cb", descriptor = "I")
	private int anInt3100;

	@OriginalMember(owner = "client!fga", name = "db", descriptor = "I")
	public int anInt3101;

	@OriginalMember(owner = "client!fga", name = "eb", descriptor = "I")
	public int anInt3102;

	@OriginalMember(owner = "client!fga", name = "fb", descriptor = "I")
	public int anInt3103;

	@OriginalMember(owner = "client!fga", name = "gb", descriptor = "I")
	public int anInt3104;

	@OriginalMember(owner = "client!fga", name = "hb", descriptor = "I")
	public int anInt3105;

	@OriginalMember(owner = "client!fga", name = "ib", descriptor = "Lclient!gw;")
	private final Class136 aClass136_20;

	@OriginalMember(owner = "client!fga", name = "jb", descriptor = "[I")
	public int[] anIntArray193;

	@OriginalMember(owner = "client!fga", name = "kb", descriptor = "[Lclient!rd;")
	private Class290[] aClass290Array1;

	@OriginalMember(owner = "client!fga", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!fga", name = "mb", descriptor = "[F")
	public float[] aFloatArray15;

	@OriginalMember(owner = "client!fga", name = "nb", descriptor = "I")
	private int anInt3106;

	@OriginalMember(owner = "client!fga", name = "ob", descriptor = "I")
	private int anInt3107;

	@OriginalMember(owner = "client!fga", name = "pb", descriptor = "I")
	public int anInt3108;

	@OriginalMember(owner = "client!fga", name = "qb", descriptor = "I")
	private int anInt3109;

	@OriginalMember(owner = "client!fga", name = "rb", descriptor = "[F")
	public float[] aFloatArray16;

	@OriginalMember(owner = "client!fga", name = "sb", descriptor = "Lclient!fd;")
	private Class103 aClass103_12;

	@OriginalMember(owner = "client!fga", name = "tb", descriptor = "I")
	private int anInt3110;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class82_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		try {
			this.method6123(arg0, arg2, arg3);
			this.method6099(arg0);
		} catch (@Pc(12) Throwable local12) {
			local12.printStackTrace();
			this.method6133();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class82_Sub2(@OriginalArg(0) Interface5 arg0) {
		super(arg0);
		this.aBoolean228 = false;
		this.aBoolean229 = false;
		this.aClass25_16 = new Class25(4);
		this.anInt3085 = 50;
		this.anInt3082 = 0;
		this.anInt3090 = 0;
		this.anInt3103 = 0;
		this.anInt3095 = 75518;
		this.anInt3084 = 78642;
		this.lb = 128;
		this.anInt3091 = 0;
		this.anInt3092 = 3500;
		this.aBoolean230 = false;
		this.anInt3101 = 512;
		this.anInt3108 = 45823;
		this.anInt3093 = 512;
		this.anInt3083 = 0;
		this.anInt3096 = 0;
		this.aClass136_20 = new Class136(16);
		this.anInt3110 = -1;
		try {
			this.aClass136_19 = new Class136(256);
			this.aClass31_Sub1_1 = new Class31_Sub1();
			this.method6165(1);
			this.method6098(0);
			Static56.method1015(true, true);
			this.aBoolean228 = true;
			this.anInt3080 = (int) Static191.method3071();
		} catch (@Pc(99) Throwable local99) {
			local99.printStackTrace();
			this.method6133();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fga", name = "e", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub45 method6138(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "(IIIIII)V")
	private void method2687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt3083) {
			local8 = this.anInt3083;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt3091) {
			local21 = this.anInt3091;
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
				if (local91 < this.anInt3103) {
					local91 = this.anInt3103;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3096) {
					local102 = this.anInt3096;
				}
				local116 = local91 + local30 * this.anInt3098;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray16[local116]) {
						this.anIntArray193[local116] = arg4;
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
				if (local91 < this.anInt3103) {
					local91 = this.anInt3103;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3096 - 1) {
					local102 = this.anInt3096 - 1;
				}
				local116 = local91 + local30 * this.anInt3098;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray16[local116]) {
						this.anIntArray193[local116] = arg4;
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
				if (local102 < this.anInt3103) {
					local102 = this.anInt3103;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt3096) {
					local116 = this.anInt3096;
				}
				local118 = local102 + local30 * this.anInt3098;
				for (local350 = local102; local350 < local116; local350++) {
					if ((float) arg2 < this.aFloatArray16[local118]) {
						local364 = this.anIntArray193[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray193[local118] = local293 + local364;
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
				if (local102 < this.anInt3103) {
					local102 = this.anInt3103;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt3096 - 1) {
					local116 = this.anInt3096 - 1;
				}
				local118 = local102 + local30 * this.anInt3098;
				for (local350 = local102; local350 <= local116; local350++) {
					if ((float) arg2 < this.aFloatArray16[local118]) {
						local364 = this.anIntArray193[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray193[local118] = local293 + local364;
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
				if (local91 < this.anInt3103) {
					local91 = this.anInt3103;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3096) {
					local102 = this.anInt3096;
				}
				local116 = local91 + local30 * this.anInt3098;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray16[local116]) {
						local350 = this.anIntArray193[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(643) int local643 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray193[local116] = local364 - local643 | local643 - (local643 >>> 8);
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
				if (local91 < this.anInt3103) {
					local91 = this.anInt3103;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3096 - 1) {
					local102 = this.anInt3096 - 1;
				}
				local116 = local91 + local30 * this.anInt3098;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray16[local116]) {
						local350 = this.anIntArray193[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray193[local116] = local364 - local350 | local350 - (local350 >>> 8);
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

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6149(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub16 local8 = (Class3_Sub16) this.aClass25_16.method426((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method8682();
		local8 = Static168.method2811(arg0, arg1, arg2);
		this.aClass25_16.method434((long) arg0.hashCode(), local8);
		if (this.aCanvas3 != arg0 || this.aClass163_1 != null) {
			return;
		}
		@Pc(37) Dimension local37 = arg0.getSize();
		this.anInt3079 = local37.width;
		this.anInt3078 = local37.height;
		this.aClass3_Sub16_1 = local8;
		this.anIntArray193 = local8.anIntArray582;
		this.anInt3098 = local8.anInt9296;
		this.anInt3086 = local8.anInt9294;
		if (this.anInt3098 != this.anInt3109 || this.anInt3086 != this.anInt3107) {
			this.anInt3106 = this.anInt3109 = this.anInt3098;
			this.anInt3100 = this.anInt3107 = this.anInt3086;
			this.aFloatArray15 = this.aFloatArray16 = new float[this.anInt3109 * this.anInt3107];
		}
		this.method2698();
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!di;)V")
	@Override
	public void method6141(@OriginalArg(0) Interface7 arg0) {
		@Pc(2) Class163 local2 = (Class163) arg0;
		this.anInt3098 = local2.anInt4814;
		this.anInt3086 = local2.anInt4810;
		this.anIntArray193 = local2.anIntArray266;
		this.aClass163_1 = local2;
		this.anInt3109 = local2.anInt4814;
		this.anInt3107 = local2.anInt4810;
		this.aFloatArray16 = local2.aFloatArray41;
		this.method2698();
	}

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "(II)V")
	@Override
	public void method6166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas3 == null || this.aClass3_Sub16_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			this.aClass3_Sub16_1.method7952(this.anInt3079, this.anInt3078, arg0, 0, 0, local14, arg1);
		} catch (@Pc(29) Exception local29) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!fga", name = "r", descriptor = "()V")
	@Override
	public void method6157() {
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V")
	@Override
	public void method6132(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt3080;
		for (@Pc(9) Object local9 = this.aClass136_19.method3140(); local9 != null; local9 = this.aClass136_19.method3136()) {
			@Pc(13) Class3_Sub48 local13 = (Class3_Sub48) local9;
			if (local13.aBoolean679) {
				local13.anInt9175 += local4;
				@Pc(27) int local27 = local13.anInt9175 / 20;
				if (local27 > 0) {
					@Pc(36) Class355 local36 = super.anInterface5_9.method4129(local13.anInt9174);
					local13.method7870(local36.aByte125 * local4 * 50 / 1000, local36.aByte122 * local4 * 50 / 1000);
					local13.anInt9175 -= local27 * 20;
				}
				local13.aBoolean679 = false;
			}
		}
		this.anInt3080 = arg0;
		this.aClass136_20.method3132(5);
		this.aClass136_19.method3132(5);
	}

	@OriginalMember(owner = "client!fga", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass31_Sub1_1.aFloat13 * (float) arg0 + this.aClass31_Sub1_1.aFloat12 * (float) arg1 + this.aClass31_Sub1_1.aFloat16 * (float) arg2 + this.aClass31_Sub1_1.aFloat14;
		@Pc(49) float local49 = this.aClass31_Sub1_1.aFloat13 * (float) arg3 + this.aClass31_Sub1_1.aFloat12 * (float) arg4 + this.aClass31_Sub1_1.aFloat16 * (float) arg5 + this.aClass31_Sub1_1.aFloat14;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt3085 && local49 < (float) this.anInt3085) {
			local51 |= 0x10;
		} else if (local24 > (float) this.anInt3092 && local49 > (float) this.anInt3092) {
			local51 |= 0x20;
		}
		@Pc(117) int local117 = (int) ((float) this.anInt3093 * (this.aClass31_Sub1_1.aFloat15 * (float) arg0 + this.aClass31_Sub1_1.aFloat18 * (float) arg1 + this.aClass31_Sub1_1.aFloat17 * (float) arg2 + this.aClass31_Sub1_1.aFloat10) / (float) arg6);
		@Pc(150) int local150 = (int) ((float) this.anInt3093 * (this.aClass31_Sub1_1.aFloat15 * (float) arg3 + this.aClass31_Sub1_1.aFloat18 * (float) arg4 + this.aClass31_Sub1_1.aFloat17 * (float) arg5 + this.aClass31_Sub1_1.aFloat10) / (float) arg6);
		if (local117 < this.anInt3104 && local150 < this.anInt3104) {
			local51 |= 0x1;
		} else if (local117 > this.anInt3088 && local150 > this.anInt3088) {
			local51 |= 0x2;
		}
		@Pc(208) int local208 = (int) ((float) this.anInt3101 * (this.aClass31_Sub1_1.aFloat9 * (float) arg0 + this.aClass31_Sub1_1.aFloat19 * (float) arg1 + this.aClass31_Sub1_1.aFloat8 * (float) arg2 + this.aClass31_Sub1_1.aFloat11) / (float) arg6);
		@Pc(241) int local241 = (int) ((float) this.anInt3101 * (this.aClass31_Sub1_1.aFloat9 * (float) arg3 + this.aClass31_Sub1_1.aFloat19 * (float) arg4 + this.aClass31_Sub1_1.aFloat8 * (float) arg5 + this.aClass31_Sub1_1.aFloat11) / (float) arg6);
		if (local208 < this.anInt3105 && local241 < this.anInt3105) {
			local51 |= 0x4;
		} else if (local208 > this.anInt3094 && local241 > this.anInt3094) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)I")
	@Override
	public int method6105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "(I)[I")
	public int[] method2688(@OriginalArg(0) int arg0) {
		@Pc(2) Class136 local2 = this.aClass136_19;
		@Pc(12) Class3_Sub48 local12;
		synchronized (this.aClass136_19) {
			local12 = (Class3_Sub48) this.aClass136_19.method3134((long) arg0);
			if (local12 == null) {
				if (!super.anInterface5_9.method4130(arg0)) {
					return null;
				}
				@Pc(32) Class355 local32 = super.anInterface5_9.method4129(arg0);
				@Pc(43) int local43 = local32.aBoolean741 || this.aBoolean230 ? 64 : this.lb;
				local12 = new Class3_Sub48(arg0, local43, super.anInterface5_9.method4127(arg0, 0.7F, local43, local43, true), local32.anInt9790 != 1);
				this.aClass136_19.method3135(local12, (long) arg0);
			}
		}
		local12.aBoolean679 = true;
		return local12.method7871();
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIF)Lclient!tj;")
	@Override
	public Class3_Sub22 method6126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!fga", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt3098;
		@Pc(35) int local35 = this.anInt3098 - arg2;
		if (arg1 + arg3 > this.anInt3091) {
			arg3 -= arg1 + arg3 - this.anInt3091;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt3083) {
			local59 = this.anInt3083 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt3098;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt3096) {
			local59 = arg0 + arg2 - this.anInt3096;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt3103) {
			local59 = this.anInt3103 - arg0;
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
						this.anIntArray193[local30++] = arg4;
					} else {
						this.anIntArray193[local30++] = arg5;
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
					local245 = this.anIntArray193[local30];
					this.anIntArray193[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray193[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray193[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIZ)Lclient!fd;")
	@Override
	public Class103 method6110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class103_Sub2_Sub1(this, arg0, arg1) : new Class103_Sub2_Sub2(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!fga", name = "y", descriptor = "()Z")
	@Override
	public boolean method6175() {
		return false;
	}

	@OriginalMember(owner = "client!fga", name = "e", descriptor = "()Z")
	@Override
	public boolean method6113() {
		return false;
	}

	@OriginalMember(owner = "client!fga", name = "w", descriptor = "()Z")
	@Override
	public boolean method6171() {
		return false;
	}

	@OriginalMember(owner = "client!fga", name = "t", descriptor = "()V")
	@Override
	public void method6162() {
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6123(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub16 local8 = (Class3_Sub16) this.aClass25_16.method426((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static168.method2811(arg0, arg1, arg2);
			this.aClass25_16.method434((long) arg0.hashCode(), local8);
		} else if (local8.anInt9296 != arg1 || local8.anInt9294 != arg2) {
			this.method6149(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fga", name = "o", descriptor = "()I")
	@Override
	public int method6131() {
		return 0;
	}

	@OriginalMember(owner = "client!fga", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt3092;
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6140(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas3 == arg0) {
			this.method6099((Canvas) null);
		}
		@Pc(15) Class3_Sub16 local15 = (Class3_Sub16) this.aClass25_16.method426((long) arg0.hashCode());
		if (local15 != null) {
			local15.method8682();
		}
	}

	@OriginalMember(owner = "client!fga", name = "i", descriptor = "(I)Z")
	public boolean method2689(@OriginalArg(0) int arg0) {
		return super.anInterface5_9.method4129(arg0).aBoolean744 || super.anInterface5_9.method4129(arg0).aBoolean747;
	}

	@OriginalMember(owner = "client!fga", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass290Array1.length; local1++) {
			this.aClass290Array1[local1].anInt8245 = this.aClass290Array1[local1].anInt8246;
			this.aClass290Array1[local1].aBoolean593 = false;
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!he;)V")
	@Override
	public void method6145(@OriginalArg(0) Class141 arg0) {
	}

	@OriginalMember(owner = "client!fga", name = "j", descriptor = "(I)Z")
	public boolean method2690(@OriginalArg(0) int arg0) {
		return super.anInterface5_9.method4130(arg0);
	}

	@OriginalMember(owner = "client!fga", name = "z", descriptor = "()Z")
	@Override
	public boolean method6177() {
		return false;
	}

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "()Z")
	@Override
	public boolean method6104() {
		return true;
	}

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class290 local3 = this.method2699(Thread.currentThread());
		this.anInt3085 = arg0;
		this.anInt3092 = arg1;
		local3.anInt8248 = this.anInt3092 - 255;
	}

	@OriginalMember(owner = "client!fga", name = "A", descriptor = "()Z")
	@Override
	public boolean method6183() {
		return true;
	}

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "()Z")
	@Override
	public boolean method6111() {
		return false;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6099(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas3 = null;
			this.aClass3_Sub16_1 = null;
			if (this.aClass163_1 == null) {
				this.anIntArray193 = null;
				this.anInt3098 = this.anInt3086 = 1;
				this.anInt3109 = this.anInt3107 = 1;
				this.method2698();
			}
			return;
		}
		@Pc(10) Class3_Sub16 local10 = (Class3_Sub16) this.aClass25_16.method426((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas3 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.anInt3079 = local18.width;
		this.anInt3078 = local18.height;
		this.aClass3_Sub16_1 = local10;
		if (this.aClass163_1 != null) {
			return;
		}
		this.anIntArray193 = local10.anIntArray582;
		this.anInt3098 = local10.anInt9296;
		this.anInt3086 = local10.anInt9294;
		if (this.anInt3098 != this.anInt3109 || this.anInt3086 != this.anInt3107) {
			this.anInt3106 = this.anInt3109 = this.anInt3098;
			this.anInt3100 = this.anInt3107 = this.anInt3086;
			this.aFloatArray15 = this.aFloatArray16 = new float[this.anInt3109 * this.anInt3107];
		}
		this.method2698();
		return;
	}

	@OriginalMember(owner = "client!fga", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt3103 || arg0 >= this.anInt3096) {
			return;
		}
		if (arg1 < this.anInt3083) {
			arg2 -= this.anInt3083 - arg1;
			arg1 = this.anInt3083;
		}
		if (arg1 + arg2 > this.anInt3091) {
			arg2 = this.anInt3091 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt3098;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray193[local40 + local54 * this.anInt3098] = arg3;
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
				local111 = local40 + local103 * this.anInt3098;
				local116 = this.anIntArray193[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray193[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt3098;
				local111 = this.anIntArray193[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray193[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fga", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt3095 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub3(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fga", name = "g", descriptor = "()V")
	private void method2691() {
		this.anInt3104 = this.anInt3103 - this.anInt3089;
		this.anInt3088 = this.anInt3096 - this.anInt3089;
		this.anInt3105 = this.anInt3083 - this.anInt3099;
		this.anInt3094 = this.anInt3091 - this.anInt3099;
		for (@Pc(29) int local29 = 0; local29 < this.anInt3087; local29++) {
			@Pc(36) Class303 local36 = this.aClass290Array1[local29].aClass303_2;
			local36.anInt8609 = this.anInt3089 - this.anInt3103;
			local36.anInt8611 = this.anInt3099 - this.anInt3083;
			local36.anInt8612 = this.anInt3096 - this.anInt3103;
			local36.anInt8610 = this.anInt3091 - this.anInt3083;
		}
		@Pc(78) int local78 = this.anInt3083 * this.anInt3098 + this.anInt3103;
		for (@Pc(81) int local81 = this.anInt3083; local81 < this.anInt3091; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt3087; local84++) {
				this.aClass290Array1[local84].aClass303_2.anIntArray543[local81 - this.anInt3083] = local78;
			}
			local78 += this.anInt3098;
		}
	}

	@OriginalMember(owner = "client!fga", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt3103) {
			arg2 -= this.anInt3103 - arg0;
			arg0 = this.anInt3103;
		}
		if (arg1 < this.anInt3083) {
			arg3 -= this.anInt3083 - arg1;
			arg1 = this.anInt3083;
		}
		if (arg0 + arg2 > this.anInt3096) {
			arg2 = this.anInt3096 - arg0;
		}
		if (arg1 + arg3 > this.anInt3091) {
			arg3 = this.anInt3091 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt3096 || arg1 > this.anInt3091) {
			return;
		}
		@Pc(67) int local67 = this.anInt3098 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt3098;
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
						local217 = this.anIntArray193[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray193[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray193[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray193[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray193[arg2] = arg4;
					arg2++;
					this.anIntArray193[arg2] = arg4;
					arg2++;
					this.anIntArray193[arg2] = arg4;
					arg2++;
					this.anIntArray193[arg2] = arg4;
					arg2++;
					this.anIntArray193[arg2] = arg4;
					arg2++;
					this.anIntArray193[arg2] = arg4;
					arg2++;
					this.anIntArray193[arg2] = arg4;
					arg2++;
					this.anIntArray193[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray193[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!fga", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass31_Sub1_1.aFloat14 + this.aClass31_Sub1_1.aFloat13 * (float) arg0 + this.aClass31_Sub1_1.aFloat12 * (float) arg1 + this.aClass31_Sub1_1.aFloat16 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = (int) ((float) this.anInt3093 * (this.aClass31_Sub1_1.aFloat10 + this.aClass31_Sub1_1.aFloat15 * (float) arg0 + this.aClass31_Sub1_1.aFloat18 * (float) arg1 + this.aClass31_Sub1_1.aFloat17 * (float) arg2) / local24);
		@Pc(105) int local105 = (int) ((float) this.anInt3101 * (this.aClass31_Sub1_1.aFloat11 + this.aClass31_Sub1_1.aFloat9 * (float) arg0 + this.aClass31_Sub1_1.aFloat19 * (float) arg1 + this.aClass31_Sub1_1.aFloat8 * (float) arg2) / local24);
		arg3[0] = local73 - this.anInt3104;
		arg3[1] = local105 - this.anInt3105;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!fga", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt3083 || arg1 >= this.anInt3091) {
			return;
		}
		if (arg0 < this.anInt3103) {
			arg2 -= this.anInt3103 - arg0;
			arg0 = this.anInt3103;
		}
		if (arg0 + arg2 > this.anInt3096) {
			arg2 = this.anInt3096 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt3098;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray193[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray193[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray193[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray193[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray193[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fga", name = "h", descriptor = "(I)V")
	@Override
	public void method6165(@OriginalArg(0) int arg0) {
		this.anInt3087 = arg0;
		this.aClass290Array1 = new Class290[this.anInt3087];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3087; local9++) {
			this.aClass290Array1[local9] = new Class290(this);
		}
	}

	@OriginalMember(owner = "client!fga", name = "p", descriptor = "()Z")
	@Override
	public boolean method6136() {
		return false;
	}

	@OriginalMember(owner = "client!fga", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method6179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!fga", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt3103 = 0;
		this.anInt3083 = 0;
		this.anInt3096 = this.anInt3098;
		this.anInt3091 = this.anInt3086;
		this.method2691();
	}

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "(I)V")
	@Override
	public void method6155(@OriginalArg(0) int arg0) {
		this.lb = arg0;
		this.aClass136_19.method3142();
	}

	@OriginalMember(owner = "client!fga", name = "e", descriptor = "(II)Lclient!lh;")
	@Override
	public Interface14 method6182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class167(arg0, arg1);
	}

	@OriginalMember(owner = "client!fga", name = "k", descriptor = "(I)I")
	public int method2692(@OriginalArg(0) int arg0) {
		return super.anInterface5_9.method4129(arg0).aShort122 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fga", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt3082;
		this.anInt3082 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!ih;)V")
	@Override
	public void method6160(@OriginalArg(0) Class31 arg0) {
		this.aClass31_Sub1_1 = (Class31_Sub1) arg0;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6102(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!fga", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fga", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg1;
		@Pc(5) int[] local5 = local2.anIntArray590;
		@Pc(8) int[] local8 = local2.anIntArray591;
		@Pc(20) int local20;
		if (this.anInt3091 < arg3 + local5.length) {
			local20 = this.anInt3091 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt3083 > arg3) {
			local33 = this.anInt3083 - arg3;
			arg3 = this.anInt3083;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt3098;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt3103 > local58) {
				local62 -= this.anInt3103 - local58;
				local58 = this.anInt3103;
			}
			if (this.anInt3096 < local58 + local62) {
				local62 = this.anInt3096 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray193[local58++] = arg0;
			}
			local49 += this.anInt3098;
		}
	}

	@OriginalMember(owner = "client!fga", name = "g", descriptor = "(I)V")
	@Override
	public void method6159(@OriginalArg(0) int arg0) {
		this.aClass290Array1[arg0].method7137((Runnable) null);
	}

	@OriginalMember(owner = "client!fga", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt3103 == 0 && this.anInt3096 == this.anInt3098 && this.anInt3083 == 0 && this.anInt3091 == this.anInt3086) {
			local19 = this.aFloatArray16.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.aFloatArray16[local27++] = 2.14748365E9F;
				this.aFloatArray16[local27++] = 2.14748365E9F;
				this.aFloatArray16[local27++] = 2.14748365E9F;
				this.aFloatArray16[local27++] = 2.14748365E9F;
				this.aFloatArray16[local27++] = 2.14748365E9F;
				this.aFloatArray16[local27++] = 2.14748365E9F;
				this.aFloatArray16[local27++] = 2.14748365E9F;
				this.aFloatArray16[local27++] = 2.14748365E9F;
			}
			while (local27 < local19) {
				this.aFloatArray16[local27++] = 2.14748365E9F;
			}
			return;
		}
		local19 = this.anInt3096 - this.anInt3103;
		local25 = this.anInt3091 - this.anInt3083;
		local27 = this.anInt3098 - local19;
		@Pc(116) int local116 = this.anInt3103 + this.anInt3083 * this.anInt3098;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.aFloatArray16[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray16[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray16[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray16[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray16[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray16[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray16[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray16[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.aFloatArray16[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!fga", name = "l", descriptor = "(I)[I")
	public int[] method2693(@OriginalArg(0) int arg0) {
		@Pc(2) Class136 local2 = this.aClass136_19;
		@Pc(14) Class3_Sub48 local14;
		synchronized (this.aClass136_19) {
			local14 = (Class3_Sub48) this.aClass136_19.method3134((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface5_9.method4130(arg0)) {
					return null;
				}
				@Pc(34) Class355 local34 = super.anInterface5_9.method4129(arg0);
				@Pc(45) int local45 = local34.aBoolean741 || this.aBoolean230 ? 64 : this.lb;
				local14 = new Class3_Sub48(arg0, local45, super.anInterface5_9.method4131(local45, local45, arg0, 0.7F), local34.anInt9790 != 1);
				this.aClass136_19.method3135(local14, (long) arg0 | Long.MIN_VALUE);
			}
		}
		local14.aBoolean679 = true;
		return local14.method7871();
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg5;
		@Pc(5) int[] local5 = local2.anIntArray590;
		@Pc(8) int[] local8 = local2.anIntArray591;
		@Pc(17) int local17 = this.anInt3083 > arg7 ? this.anInt3083 : arg7;
		@Pc(32) int local32 = this.anInt3091 < arg7 + local5.length ? this.anInt3091 : arg7 + local5.length;
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
					if (local129 >= this.anInt3103 && local129 < this.anInt3096 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray193[local129 + arg1 * this.anInt3098] = arg4;
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
					if (local133 >= this.anInt3103 && local133 < this.anInt3096 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt3098;
						local248 = this.anIntArray193[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray193[local133 + arg1 * this.anInt3098] = local201 + local584;
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
		if (arg0 < this.anInt3103) {
			arg1 += local83 * (this.anInt3103 - arg0);
			arg0 = this.anInt3103;
		}
		if (arg2 >= this.anInt3096) {
			arg2 = this.anInt3096 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray193[arg0 + local129 * this.anInt3098] = arg4;
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
					local243 = arg0 + local133 * this.anInt3098;
					local248 = this.anIntArray193[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray193[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!fga", name = "s", descriptor = "()Z")
	@Override
	public boolean method6158() {
		return true;
	}

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "(I)V")
	@Override
	public void method6135() {
		Static345.anInt6355 = 10000;
		Static345.anInt6360 = 10000;
		if (this.anInt3087 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method6165(this.anInt3087);
		this.method6098(0);
	}

	@OriginalMember(owner = "client!fga", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt3098) {
			arg2 = this.anInt3098;
		}
		if (arg3 > this.anInt3086) {
			arg3 = this.anInt3086;
		}
		this.anInt3103 = arg0;
		this.anInt3096 = arg2;
		this.anInt3083 = arg1;
		this.anInt3091 = arg3;
		this.method2691();
	}

	@OriginalMember(owner = "client!fga", name = "m", descriptor = "(I)Z")
	public boolean method2694(@OriginalArg(0) int arg0) {
		return this.aBoolean230 || super.anInterface5_9.method4129(arg0).aBoolean741;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method2695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface5_9.method4129(arg6).aBoolean743) {
			this.method2687(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt3110 != arg6) {
			@Pc(26) Class103 local26 = (Class103) this.aClass136_20.method3134((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method2693(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(44) int local44 = this.method2694(arg6) ? 64 : this.lb;
				local26 = this.method6112(local44, local32, local44, local44);
				this.aClass136_20.method3135(local26, (long) arg6);
			}
			this.anInt3110 = arg6;
			this.aClass103_12 = local26;
		}
		((Class103_Sub2) this.aClass103_12).method7465(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!fga", name = "n", descriptor = "(I)I")
	public int method2696(@OriginalArg(0) int arg0) {
		return super.anInterface5_9.method4129(arg0).anInt9790;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIIII)V")
	private void method2697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt3103 || arg0 >= this.anInt3096) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt3098;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg1 + local37 >= this.anInt3083 && arg1 + local37 < this.anInt3091 && local27 < arg4) {
					this.anIntArray193[local15 + local37 * this.anInt3098] = arg3;
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
			if (arg1 + local106 >= this.anInt3083 && arg1 + local106 < this.anInt3091 && local27 < arg4) {
				@Pc(129) int local129 = local15 + local106 * this.anInt3098;
				@Pc(134) int local134 = this.anIntArray193[local129];
				@Pc(154) int local154 = ((local134 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local134 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray193[local129] = local100 + local154;
			}
			local106++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!fga", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass31_Sub1_1.aFloat14 + this.aClass31_Sub1_1.aFloat13 * (float) arg0 + this.aClass31_Sub1_1.aFloat12 * (float) arg1 + this.aClass31_Sub1_1.aFloat16 * (float) arg2;
		if (local24 < (float) this.anInt3085 || local24 > (float) this.anInt3092) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(82) int local82 = (int) ((float) this.anInt3093 * (this.aClass31_Sub1_1.aFloat10 + this.aClass31_Sub1_1.aFloat15 * (float) arg0 + this.aClass31_Sub1_1.aFloat18 * (float) arg1 + this.aClass31_Sub1_1.aFloat17 * (float) arg2) / (float) arg3);
		@Pc(115) int local115 = (int) ((float) this.anInt3101 * (this.aClass31_Sub1_1.aFloat11 + this.aClass31_Sub1_1.aFloat9 * (float) arg0 + this.aClass31_Sub1_1.aFloat19 * (float) arg1 + this.aClass31_Sub1_1.aFloat8 * (float) arg2) / (float) arg3);
		if (local82 >= this.anInt3104 && local82 <= this.anInt3088 && local115 >= this.anInt3105 && local115 <= this.anInt3094) {
			arg4[0] = local82 - this.anInt3104;
			arg4[1] = local115 - this.anInt3105;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!fga", name = "v", descriptor = "()Lclient!ih;")
	@Override
	public Class31 method6170() {
		return new Class31_Sub1();
	}

	@OriginalMember(owner = "client!fga", name = "B", descriptor = "()V")
	private void method2698() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3087; local1++) {
			this.aClass290Array1[local1].method7139();
		}
		this.la();
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6173(@OriginalArg(0) Class3_Sub45 arg0) {
	}

	@OriginalMember(owner = "client!fga", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!pw;Lclient!lh;)Lclient!di;")
	@Override
	public Interface7 method6143(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface14 arg1) {
		return new Class163(this, (Class103) arg0, (Class167) arg1);
	}

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "()V")
	@Override
	public void method6118() {
		this.aClass136_19.method3142();
		this.aClass136_20.method3142();
	}

	@OriginalMember(owner = "client!fga", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass31_Sub1_1.aFloat14 + this.aClass31_Sub1_1.aFloat13 * (float) arg0 + this.aClass31_Sub1_1.aFloat12 * (float) arg1 + this.aClass31_Sub1_1.aFloat16 * (float) arg2;
		if (local24 < (float) this.anInt3085 || local24 > (float) this.anInt3092) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt3093 * (this.aClass31_Sub1_1.aFloat10 + this.aClass31_Sub1_1.aFloat15 * (float) arg0 + this.aClass31_Sub1_1.aFloat18 * (float) arg1 + this.aClass31_Sub1_1.aFloat17 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt3101 * (this.aClass31_Sub1_1.aFloat11 + this.aClass31_Sub1_1.aFloat9 * (float) arg0 + this.aClass31_Sub1_1.aFloat19 * (float) arg1 + this.aClass31_Sub1_1.aFloat8 * (float) arg2) / local24);
		if (local81 >= this.anInt3104 && local81 <= this.anInt3088 && local113 >= this.anInt3105 && local113 <= this.anInt3094) {
			arg3[0] = local81 - this.anInt3104;
			arg3[1] = local113 - this.anInt3105;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!oia;Z)Lclient!fd;")
	@Override
	public Class103 method6106(@OriginalArg(0) Class251 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray430;
		@Pc(5) byte[] local5 = arg0.aByteArray65;
		@Pc(8) int local8 = arg0.anInt7185;
		@Pc(11) int local11 = arg0.anInt7184;
		@Pc(76) Class103_Sub2 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray64 == null) {
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
			local76 = new Class103_Sub2_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray64;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class103_Sub2_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class103_Sub2_Sub1(this, local20, local8, local11);
			}
		}
		local76.method7441(arg0.anInt7183, arg0.anInt7180, arg0.anInt7181, arg0.anInt7182);
		return local76;
	}

	@OriginalMember(owner = "client!fga", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt3098 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray193[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!fga", name = "k", descriptor = "()V")
	@Override
	protected void method6121() {
		if (this.aBoolean228) {
			Static92.method1552(true, false);
			this.aBoolean228 = false;
		}
		this.aClass3_Sub16_1 = null;
		this.aCanvas3 = null;
		this.anInt3079 = 0;
		this.anInt3078 = 0;
		this.aClass25_16 = null;
		this.aBoolean229 = true;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!ik;)V")
	@Override
	public void method6161(@OriginalArg(0) Class162 arg0) {
		@Pc(3) Class290 local3 = this.method2699(Thread.currentThread());
		@Pc(7) Class9_Sub3 local7 = arg0.aClass347_1.aClass9_Sub3_9;
		for (@Pc(10) Class9_Sub3 local10 = local7.aClass9_Sub3_8; local10 != local7; local10 = local10.aClass9_Sub3_8) {
			@Pc(14) Class9_Sub3_Sub2 local14 = (Class9_Sub3_Sub2) local10;
			@Pc(19) int local19 = local14.anInt6754 >> 12;
			@Pc(24) int local24 = local14.anInt6759 >> 12;
			@Pc(29) int local29 = local14.anInt6757 >> 12;
			@Pc(54) float local54 = this.aClass31_Sub1_1.aFloat14 + this.aClass31_Sub1_1.aFloat13 * (float) local19 + this.aClass31_Sub1_1.aFloat12 * (float) local24 + this.aClass31_Sub1_1.aFloat16 * (float) local29;
			if (!(local54 < (float) this.anInt3085) && !(local54 > (float) local3.anInt8248)) {
				@Pc(102) int local102 = this.anInt3089 + (int) ((float) this.anInt3093 * (this.aClass31_Sub1_1.aFloat10 + this.aClass31_Sub1_1.aFloat15 * (float) local19 + this.aClass31_Sub1_1.aFloat18 * (float) local24 + this.aClass31_Sub1_1.aFloat17 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt3099 + (int) ((float) this.anInt3101 * (this.aClass31_Sub1_1.aFloat11 + this.aClass31_Sub1_1.aFloat9 * (float) local19 + this.aClass31_Sub1_1.aFloat19 * (float) local24 + this.aClass31_Sub1_1.aFloat8 * (float) local29) / local54);
				if (local102 >= this.anInt3103 && local102 <= this.anInt3096 && local137 >= this.anInt3083 && local137 <= this.anInt3091) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method2702(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt6755 * this.anInt3093 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!fga", name = "m", descriptor = "()Z")
	@Override
	public boolean method6129() {
		return false;
	}

	@OriginalMember(owner = "client!fga", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt3089, this.anInt3099, this.anInt3093, this.anInt3101 };
	}

	@OriginalMember(owner = "client!fga", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt3085;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIZ)Lclient!fd;")
	@Override
	public Class103 method6144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt3098 + arg0;
		@Pc(16) int local16 = this.anInt3098 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray193[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class103_Sub2_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class103_Sub2_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!rd;")
	public Class290 method2699(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3087; local1++) {
			if (this.aClass290Array1[local1].aRunnable2 == arg0) {
				return this.aClass290Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fga", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt3083) {
			local8 = this.anInt3083;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt3091) {
			local21 = this.anInt3091;
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
				if (local91 < this.anInt3103) {
					local91 = this.anInt3103;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3096) {
					local102 = this.anInt3096;
				}
				local116 = local91 + local30 * this.anInt3098;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray193[local116++] = arg3;
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
				if (local91 < this.anInt3103) {
					local91 = this.anInt3103;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3096 - 1) {
					local102 = this.anInt3096 - 1;
				}
				local116 = local91 + local30 * this.anInt3098;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray193[local116++] = arg3;
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
			if (local102 < this.anInt3103) {
				local102 = this.anInt3103;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt3096) {
				local116 = this.anInt3096;
			}
			local118 = local102 + local30 * this.anInt3098;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray193[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray193[local118++] = local277 + local360;
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
			if (local102 < this.anInt3103) {
				local102 = this.anInt3103;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt3096 - 1) {
				local116 = this.anInt3096 - 1;
			}
			local118 = local102 + local30 * this.anInt3098;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray193[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray193[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!fga", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3103;
		arg0[1] = this.anInt3083;
		arg0[2] = this.anInt3096;
		arg0[3] = this.anInt3091;
	}

	@OriginalMember(owner = "client!fga", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3103 < arg0) {
			this.anInt3103 = arg0;
		}
		if (this.anInt3083 < arg1) {
			this.anInt3083 = arg1;
		}
		if (this.anInt3096 > arg2) {
			this.anInt3096 = arg2;
		}
		if (this.anInt3091 > arg3) {
			this.anInt3091 = arg3;
		}
		this.method2691();
	}

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt3103) {
					arg1 += local104 * (this.anInt3103 - arg0);
					arg0 = this.anInt3103;
				}
				if (arg2 >= this.anInt3096) {
					arg2 = this.anInt3096 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt3083 && local150 < this.anInt3091) {
							this.anIntArray193[arg0 + local150 * this.anInt3098] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt3083 && local213 < this.anInt3091) {
							local228 = arg0 + local213 * this.anInt3098;
							local233 = this.anIntArray193[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray193[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt3083 && local150 < this.anInt3091) {
							local213 = arg0 + local150 * this.anInt3098;
							local228 = this.anIntArray193[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray193[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt3083) {
					arg0 += local104 * (this.anInt3083 - arg1);
					arg1 = this.anInt3083;
				}
				if (arg3 >= this.anInt3091) {
					arg3 = this.anInt3091 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt3103 && local150 < this.anInt3096) {
							this.anIntArray193[local150 + arg1 * this.anInt3098] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt3103 && local213 < this.anInt3096) {
							local228 = local213 + arg1 * this.anInt3098;
							local233 = this.anIntArray193[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray193[local213 + arg1 * this.anInt3098] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt3103 && local150 < this.anInt3096) {
							local213 = local150 + arg1 * this.anInt3098;
							local228 = this.anIntArray193[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray193[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method2701(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local28 = arg5 + arg6;
				local32 = arg7 % local28;
				local32 = local28 + arg5 - local32 - (-arg2 + 1) % local28;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				this.method2701(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
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
						if (arg0 >= this.anInt3103 && arg0 < this.anInt3096 && local267 >= this.anInt3083 && local267 < this.anInt3091 && arg7 < local143) {
							this.anIntArray193[arg0 + local267 * this.anInt3098] = arg4;
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
						if (arg0 >= this.anInt3103 && arg0 < this.anInt3096 && local349 >= this.anInt3083 && local349 < this.anInt3091 && arg7 < local143) {
							local375 = arg0 + local349 * this.anInt3098;
							local380 = this.anIntArray193[local375];
							local380 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray193[local375] = local340 + local380;
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
						if (arg1 >= this.anInt3083 && arg1 < this.anInt3091 && local267 >= this.anInt3103 && local267 < this.anInt3096 && arg7 < local143) {
							this.anIntArray193[local267 + arg1 * this.anInt3098] = arg4;
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
						if (arg1 >= this.anInt3083 && arg1 < this.anInt3091 && local349 >= this.anInt3103 && local349 < this.anInt3096 && arg7 < local143) {
							local375 = local349 + arg1 * this.anInt3098;
							local380 = this.anIntArray193[local375];
							@Pc(708) int local708 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray193[local349 + arg1 * this.anInt3098] = local340 + local708;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method2697(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local28 = arg5 + arg6;
			local32 = arg7 % local28;
			local32 = local28 + arg5 - local32 - (-arg3 + 1) % local28;
			arg7 = local32 % local28;
			if (arg7 < 0) {
				arg7 += local28;
			}
			this.method2697(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!vo;IIII)Lclient!ka;")
	@Override
	public Class75 method6176(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class75_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!he;Lclient!he;FLclient!he;)Lclient!he;")
	@Override
	public Class141 method6150(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class141 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class290 local3 = this.method2699(Thread.currentThread());
		@Pc(6) Class303 local6 = local3.aClass303_2;
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
		@Pc(105) int local105 = arg0 - local6.method7434();
		@Pc(110) int local110 = arg1 - local6.method7428();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt8607 = 0;
		this.C(false);
		local6.aBoolean630 = local114 < 0 || local114 > local6.anInt8612 || local118 < 0 || local118 > local6.anInt8612 || local124 < 0 || local124 > local6.anInt8612;
		local6.method7426((float) local134, (float) local138, (float) local144, (float) local114, (float) local118, (float) local124, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean630 = local114 < 0 || local114 > local6.anInt8612 || local124 < 0 || local124 > local6.anInt8612 || local130 < 0 || local130 > local6.anInt8612;
		local6.method7426((float) local134, (float) local144, (float) local150, (float) local114, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!fga", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass31_Sub1_1.aFloat13 * (float) arg0 + this.aClass31_Sub1_1.aFloat12 * (float) arg1 + this.aClass31_Sub1_1.aFloat16 * (float) arg2 + this.aClass31_Sub1_1.aFloat14;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass31_Sub1_1.aFloat13 * (float) arg3 + this.aClass31_Sub1_1.aFloat12 * (float) arg4 + this.aClass31_Sub1_1.aFloat16 * (float) arg5 + this.aClass31_Sub1_1.aFloat14;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt3085 && local57 < (float) this.anInt3085) {
			local1 |= 0x10;
		} else if (local26 > (float) this.anInt3092 && local57 > (float) this.anInt3092) {
			local1 |= 0x20;
		}
		@Pc(128) int local128 = (int) ((float) this.anInt3093 * (this.aClass31_Sub1_1.aFloat15 * (float) arg0 + this.aClass31_Sub1_1.aFloat18 * (float) arg1 + this.aClass31_Sub1_1.aFloat17 * (float) arg2 + this.aClass31_Sub1_1.aFloat10) / local26);
		@Pc(160) int local160 = (int) ((float) this.anInt3093 * (this.aClass31_Sub1_1.aFloat15 * (float) arg3 + this.aClass31_Sub1_1.aFloat18 * (float) arg4 + this.aClass31_Sub1_1.aFloat17 * (float) arg5 + this.aClass31_Sub1_1.aFloat10) / local57);
		if (local128 < this.anInt3104 && local160 < this.anInt3104) {
			local1 |= 0x1;
		} else if (local128 > this.anInt3088 && local160 > this.anInt3088) {
			local1 |= 0x2;
		}
		@Pc(217) int local217 = (int) ((float) this.anInt3101 * (this.aClass31_Sub1_1.aFloat9 * (float) arg0 + this.aClass31_Sub1_1.aFloat19 * (float) arg1 + this.aClass31_Sub1_1.aFloat8 * (float) arg2 + this.aClass31_Sub1_1.aFloat11) / local26);
		@Pc(249) int local249 = (int) ((float) this.anInt3101 * (this.aClass31_Sub1_1.aFloat9 * (float) arg3 + this.aClass31_Sub1_1.aFloat19 * (float) arg4 + this.aClass31_Sub1_1.aFloat8 * (float) arg5 + this.aClass31_Sub1_1.aFloat11) / local57);
		if (local217 < this.anInt3105 && local249 < this.anInt3105) {
			local1 |= 0x4;
		} else if (local217 > this.anInt3094 && local249 > this.anInt3094) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!fga", name = "C", descriptor = "()Z")
	public boolean method2700() {
		return this.aBoolean229;
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(IIIIIIII)V")
	private void method2701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt3083 || arg1 >= this.anInt3091) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt3098;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg0 + local37 >= this.anInt3103 && arg0 + local37 < this.anInt3096 && local27 < arg4) {
					this.anIntArray193[local15 + local37] = arg3;
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
			if (arg0 + local103 >= this.anInt3103 && arg0 + local103 < this.anInt3096 && local27 < arg4) {
				@Pc(126) int local126 = this.anIntArray193[local15 + local103];
				@Pc(146) int local146 = ((local126 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local126 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray193[local15 + local103] = local97 + local146;
			}
			local103++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(Z)V")
	@Override
	public void method6128(@OriginalArg(0) boolean arg0) {
		this.aBoolean230 = arg0;
		this.aClass136_19.method3142();
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "()Z")
	@Override
	public boolean method6103() {
		return false;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!ik;I)V")
	@Override
	public void method6107(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class290 local3 = this.method2699(Thread.currentThread());
		@Pc(7) Class9_Sub3 local7 = arg0.aClass347_1.aClass9_Sub3_9;
		for (@Pc(10) Class9_Sub3 local10 = local7.aClass9_Sub3_8; local10 != local7; local10 = local10.aClass9_Sub3_8) {
			@Pc(14) Class9_Sub3_Sub2 local14 = (Class9_Sub3_Sub2) local10;
			@Pc(19) int local19 = local14.anInt6754 >> 12;
			@Pc(24) int local24 = local14.anInt6759 >> 12;
			@Pc(29) int local29 = local14.anInt6757 >> 12;
			@Pc(54) float local54 = this.aClass31_Sub1_1.aFloat14 + this.aClass31_Sub1_1.aFloat13 * (float) local19 + this.aClass31_Sub1_1.aFloat12 * (float) local24 + this.aClass31_Sub1_1.aFloat16 * (float) local29;
			if (!(local54 < (float) this.anInt3085) && !(local54 > (float) local3.anInt8248)) {
				@Pc(103) int local103 = this.anInt3089 + (int) ((float) this.anInt3093 * (this.aClass31_Sub1_1.aFloat10 + this.aClass31_Sub1_1.aFloat15 * (float) local19 + this.aClass31_Sub1_1.aFloat18 * (float) local24 + this.aClass31_Sub1_1.aFloat17 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt3099 + (int) ((float) this.anInt3101 * (this.aClass31_Sub1_1.aFloat11 + this.aClass31_Sub1_1.aFloat9 * (float) local19 + this.aClass31_Sub1_1.aFloat19 * (float) local24 + this.aClass31_Sub1_1.aFloat8 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt3103 && local103 <= this.anInt3096 && local139 >= this.anInt3083 && local139 <= this.anInt3091) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method2702(local14, local103, local139, (int) local54, (local14.anInt6755 * this.anInt3093 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fga", name = "n", descriptor = "()V")
	@Override
	public void method6130() {
	}

	@OriginalMember(owner = "client!fga", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class290 local3 = this.method2699(Thread.currentThread());
		local3.aBoolean592 = arg0;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "([IIIIIZ)Lclient!fd;")
	@Override
	public Class103 method6180(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class103_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class103_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class103_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class103_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!fga", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class290 local3 = this.method2699(Thread.currentThread());
		local3.anInt8251 = arg0;
		local3.anInt8245 = arg1;
		local3.anInt8247 = arg2;
	}

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "(IIIIII)Lclient!he;")
	@Override
	public Class141 method6168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!fga", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt3098 + arg0;
		@Pc(13) int local13 = arg1 * this.anInt3109 + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(21) int[] local21 = this.anIntArray193;
		@Pc(24) float[] local24 = this.aFloatArray16;
		@Pc(31) int local31;
		if (local6 < 0) {
			local31 = local21.length + local6;
			Static651.method750(local21, -local6, local21, 0, local31);
		} else if (local6 > 0) {
			local31 = local21.length - local6;
			Static651.method750(local21, 0, local21, local6, local31);
		}
		if (local13 < 0) {
			local31 = local24.length + local13;
			Static651.method754(local24, -local13, local24, 0, local31);
		} else if (local13 > 0) {
			local31 = local24.length - local13;
			Static651.method754(local24, 0, local24, local13, local31);
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!ej;[Lclient!oia;Z)Lclient!da;")
	@Override
	public Class63 method6127(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class251[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt7185;
			local7[local11] = arg1[local11].anInt7184;
			if (arg1[local11].aByteArray64 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class63_Sub5(this, arg0, arg1, local3, local7);
		} else {
			return new Class63_Sub1(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!fga", name = "l", descriptor = "()Lclient!ih;")
	@Override
	public Class31 method6125() {
		@Pc(3) Class290 local3 = this.method2699(Thread.currentThread());
		return local3.aClass31_Sub1_3;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V")
	@Override
	public void method6098(@OriginalArg(0) int arg0) {
		this.aClass290Array1[arg0].method7137(Thread.currentThread());
	}

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "(II)I")
	@Override
	public int method6169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "([I)V")
	@Override
	public void method6156(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3098;
		arg0[1] = this.anInt3086;
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(II)Lclient!pw;")
	@Override
	public Interface19 method6163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6110(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!fga", name = "x", descriptor = "()Lclient!ih;")
	@Override
	public Class31 method6174() {
		return this.aClass31_Sub1_1;
	}

	@OriginalMember(owner = "client!fga", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt3098, this.anInt3086, arg0, 0);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "()Z")
	@Override
	public boolean method6101() {
		return true;
	}

	@OriginalMember(owner = "client!fga", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3089 = arg0;
		this.anInt3099 = arg1;
		this.anInt3093 = arg2;
		this.anInt3101 = arg3;
		this.method2691();
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class91 method6139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class91_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!fga", name = "h", descriptor = "()Lclient!er;")
	@Override
	public Class98 method6119() {
		return new Class98(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6122() {
		@Pc(3) Class290 local3 = this.method2699(Thread.currentThread());
		@Pc(6) Class303 local6 = local3.aClass303_2;
		local6.aBoolean634 = false;
		@Pc(14) int local14 = 5 - this.anInt3104;
		@Pc(19) int local19 = 75 - this.anInt3104;
		@Pc(24) int local24 = 15 - this.anInt3104;
		@Pc(29) int local29 = 10 - this.anInt3105;
		@Pc(34) int local34 = 50 - this.anInt3105;
		@Pc(39) int local39 = 90 - this.anInt3105;
		local6.aBoolean630 = local14 < 0 || local14 > local6.anInt8612 || local19 < 0 || local19 > local6.anInt8612 || local24 < 0 || local24 > local6.anInt8612;
		local6.anInt8607 = 0;
		local6.aBoolean632 = false;
		local6.method7425((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		local6.aBoolean634 = true;
	}

	@OriginalMember(owner = "client!fga", name = "u", descriptor = "()V")
	@Override
	public void method6167() {
		if (this.aCanvas3 == null) {
			this.anInt3098 = 1;
			this.anInt3086 = 1;
			this.anIntArray193 = null;
			this.anInt3109 = 1;
			this.anInt3107 = 1;
			this.aFloatArray16 = null;
		} else {
			this.anIntArray193 = this.aClass3_Sub16_1.anIntArray582;
			this.anInt3098 = this.aClass3_Sub16_1.anInt9296;
			this.anInt3086 = this.aClass3_Sub16_1.anInt9294;
			this.aFloatArray16 = this.aFloatArray15;
			this.anInt3109 = this.anInt3106;
			this.anInt3107 = this.anInt3100;
		}
		this.aClass163_1 = null;
		this.method2698();
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg5;
		@Pc(5) int[] local5 = local2.anIntArray590;
		@Pc(8) int[] local8 = local2.anIntArray591;
		@Pc(17) int local17 = this.anInt3083 > arg7 ? this.anInt3083 : arg7;
		@Pc(32) int local32 = this.anInt3091 < arg7 + local5.length ? this.anInt3091 : arg7 + local5.length;
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
					if (arg1 >= local17 && arg1 < local32 && local172 >= this.anInt3103 && local172 < this.anInt3096 && arg10 < local40 && local172 >= arg6 + local5[local176] && local172 < arg6 + local5[local176] + local8[local176]) {
						this.anIntArray193[local172 + arg1 * this.anInt3098] = arg4;
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
					if (arg1 >= local17 && arg1 < local32 && local176 >= this.anInt3103 && local176 < this.anInt3096 && arg10 < local40 && local176 >= arg6 + local5[local199] && local176 < arg6 + local5[local199] + local8[local199]) {
						local299 = local176 + arg1 * this.anInt3098;
						local316 = this.anIntArray193[local299];
						@Pc(707) int local707 = ((local316 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local316 & 0xFF00) * local172 >> 8 & 0xFF00);
						this.anIntArray193[local176 + arg1 * this.anInt3098] = local263 + local707;
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
				if (arg0 >= this.anInt3103 && arg0 < this.anInt3096 && local172 >= local17 && local172 < local32 && arg10 < local40) {
					local199 = arg6 + local5[local176];
					if (arg0 >= local199 && arg0 < local199 + local8[local176]) {
						this.anIntArray193[arg0 + local172 * this.anInt3098] = arg4;
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
			if (arg0 >= this.anInt3103 && arg0 < this.anInt3096 && local176 >= local17 && local176 < local32 && arg10 < local40) {
				local299 = arg6 + local5[local199];
				if (arg0 >= local299 && arg0 < local299 + local8[local199]) {
					local316 = arg0 + local176 * this.anInt3098;
					@Pc(321) int local321 = this.anIntArray193[local316];
					@Pc(341) int local341 = ((local321 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local321 & 0xFF00) * local172 >> 8 & 0xFF00);
					this.anIntArray193[local316] = local263 + local341;
				}
			}
			arg1 += local77;
			arg0++;
			local36 = arg10 + local159;
			arg10 = local36 % local48;
		}
	}

	@OriginalMember(owner = "client!fga", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt3108 = (int) (arg1 * 65535.0F);
		this.anInt3084 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt3102 = (int) (arg3 * 65535.0F / local26);
		this.anInt3097 = (int) (arg4 * 65535.0F / local26);
		this.anInt3081 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!fga", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass290Array1.length; local1++) {
			this.aClass290Array1[local1].anInt8246 = this.aClass290Array1[local1].anInt8245;
			this.aClass290Array1[local1].anInt8251 = arg0;
			this.aClass290Array1[local1].anInt8245 = arg1;
			this.aClass290Array1[local1].anInt8247 = arg2;
			this.aClass290Array1[local1].aBoolean593 = true;
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!gia;IIII)V")
	private void method2702(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt6758;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method2687(arg1, arg2, arg3, arg4, arg0.anInt6756, 1);
			return;
		}
		if (this.anInt3110 != local2) {
			@Pc(33) Class103 local33 = (Class103) this.aClass136_20.method3134((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method2693(local2);
				if (local39 == null) {
					return;
				}
				@Pc(50) int local50 = this.method2694(local2) ? 64 : this.lb;
				local33 = this.method6112(local50, local39, local50, local50);
				this.aClass136_20.method3135(local33, (long) local2);
			}
			this.anInt3110 = local2;
			this.aClass103_12 = local33;
		}
		local8++;
		((Class103_Sub2) this.aClass103_12).method7465(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt6756, 1);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Z)V")
	@Override
	public void method6109(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fga", name = "q", descriptor = "()V")
	@Override
	public void method6153() {
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(I[Lclient!tj;)V")
	@Override
	public void method6100(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22[] arg1) {
	}

	@OriginalMember(owner = "client!fga", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass290Array1.length; local1++) {
			@Pc(7) Class290 local7 = this.aClass290Array1[local1];
			local7.anInt8245 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt8245 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt8245 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt8245 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt8245 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean594 = false;
			} else {
				local7.aBoolean594 = true;
			}
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6148(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas3 == null || this.aClass3_Sub16_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x + arg2 <= this.anInt3098 && local21.y + arg3 <= this.anInt3086 && local21.x + arg2 + local21.width > 0 && local21.y + arg3 + local21.height > 0) {
					this.aClass3_Sub16_1.method7952(local21.width, local21.height, local21.x + arg2, local21.y, local21.x, local14, local21.y + arg3);
				}
			}
		} catch (@Pc(79) Exception local79) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.anInt3109 - arg2;
		@Pc(11) int local11 = arg1 * this.anInt3109 + arg0;
		@Pc(14) float[] local14 = this.aFloatArray16;
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

	@OriginalMember(owner = "client!fga", name = "j", descriptor = "()Z")
	@Override
	public boolean method6120() {
		return false;
	}

	@OriginalMember(owner = "client!fga", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.anInt3090;
		this.anInt3090 = 0;
		return local2;
	}
}
