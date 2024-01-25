import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class22_Sub3 extends Class22 {

	@OriginalMember(owner = "client!wda", name = "hb", descriptor = "I")
	private int anInt11017;

	@OriginalMember(owner = "client!wda", name = "Z", descriptor = "Z")
	private boolean aBoolean745;

	@OriginalMember(owner = "client!wda", name = "mb", descriptor = "Lclient!dm;")
	public Class3_Sub15 aClass3_Sub15_1;

	@OriginalMember(owner = "client!wda", name = "E", descriptor = "I")
	private int anInt11018;

	@OriginalMember(owner = "client!wda", name = "jb", descriptor = "I")
	private int anInt11019;

	@OriginalMember(owner = "client!wda", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!wda", name = "J", descriptor = "Z")
	private boolean aBoolean746;

	@OriginalMember(owner = "client!wda", name = "db", descriptor = "Lclient!qn;")
	private Class313 aClass313_45;

	@OriginalMember(owner = "client!wda", name = "H", descriptor = "I")
	private int anInt11020;

	@OriginalMember(owner = "client!wda", name = "Y", descriptor = "I")
	public int anInt11021;

	@OriginalMember(owner = "client!wda", name = "eb", descriptor = "I")
	private int anInt11022;

	@OriginalMember(owner = "client!wda", name = "F", descriptor = "I")
	public int anInt11023;

	@OriginalMember(owner = "client!wda", name = "ib", descriptor = "I")
	public int anInt11024;

	@OriginalMember(owner = "client!wda", name = "nb", descriptor = "[I")
	public int[] anIntArray785;

	@OriginalMember(owner = "client!wda", name = "fb", descriptor = "I")
	public int anInt11025;

	@OriginalMember(owner = "client!wda", name = "G", descriptor = "I")
	public int anInt11026;

	@OriginalMember(owner = "client!wda", name = "bb", descriptor = "I")
	private int anInt11027;

	@OriginalMember(owner = "client!wda", name = "V", descriptor = "Z")
	private boolean aBoolean747;

	@OriginalMember(owner = "client!wda", name = "C", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_95;

	@OriginalMember(owner = "client!wda", name = "N", descriptor = "I")
	public int anInt11028;

	@OriginalMember(owner = "client!wda", name = "P", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_96;

	@OriginalMember(owner = "client!wda", name = "A", descriptor = "[Lclient!lw;")
	private Class239[] aClass239Array1;

	@OriginalMember(owner = "client!wda", name = "K", descriptor = "I")
	public int anInt11029;

	@OriginalMember(owner = "client!wda", name = "B", descriptor = "I")
	public int anInt11030;

	@OriginalMember(owner = "client!wda", name = "Q", descriptor = "I")
	public int anInt11031;

	@OriginalMember(owner = "client!wda", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!wda", name = "U", descriptor = "I")
	private int anInt11032;

	@OriginalMember(owner = "client!wda", name = "T", descriptor = "I")
	public int anInt11033;

	@OriginalMember(owner = "client!wda", name = "ob", descriptor = "I")
	public int anInt11034;

	@OriginalMember(owner = "client!wda", name = "O", descriptor = "I")
	public int anInt11035;

	@OriginalMember(owner = "client!wda", name = "S", descriptor = "I")
	public int anInt11036;

	@OriginalMember(owner = "client!wda", name = "w", descriptor = "I")
	private int anInt11037;

	@OriginalMember(owner = "client!wda", name = "X", descriptor = "I")
	public int anInt11038;

	@OriginalMember(owner = "client!wda", name = "D", descriptor = "[F")
	public float[] aFloatArray84;

	@OriginalMember(owner = "client!wda", name = "kb", descriptor = "I")
	private int anInt11039;

	@OriginalMember(owner = "client!wda", name = "M", descriptor = "I")
	public int anInt11040;

	@OriginalMember(owner = "client!wda", name = "y", descriptor = "I")
	public int anInt11041;

	@OriginalMember(owner = "client!wda", name = "v", descriptor = "I")
	public int anInt11042;

	@OriginalMember(owner = "client!wda", name = "I", descriptor = "Lclient!ej;")
	public Class58_Sub1 aClass58_Sub1_3;

	@OriginalMember(owner = "client!wda", name = "L", descriptor = "I")
	public int anInt11043;

	@OriginalMember(owner = "client!wda", name = "u", descriptor = "[F")
	public float[] aFloatArray85;

	@OriginalMember(owner = "client!wda", name = "W", descriptor = "Lclient!nc;")
	private Class256 aClass256_1;

	@OriginalMember(owner = "client!wda", name = "t", descriptor = "I")
	public int anInt11044;

	@OriginalMember(owner = "client!wda", name = "gb", descriptor = "I")
	public int anInt11045;

	@OriginalMember(owner = "client!wda", name = "s", descriptor = "I")
	public int anInt11046;

	@OriginalMember(owner = "client!wda", name = "z", descriptor = "I")
	private int anInt11047;

	@OriginalMember(owner = "client!wda", name = "cb", descriptor = "I")
	public int anInt11048;

	@OriginalMember(owner = "client!wda", name = "ab", descriptor = "Lclient!kw;")
	private Class178 aClass178_33;

	@OriginalMember(owner = "client!wda", name = "R", descriptor = "I")
	private int anInt11049;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class22_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		try {
			this.method9370(arg0, arg2, arg3);
			this.method9347(arg0);
		} catch (@Pc(12) Throwable local12) {
			local12.printStackTrace();
			this.method9397();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class22_Sub3(@OriginalArg(0) Interface4 arg0) {
		super(arg0);
		this.aBoolean746 = false;
		this.aBoolean745 = false;
		this.aClass313_45 = new Class313(4);
		this.anInt11028 = 50;
		this.anInt11029 = 0;
		this.anInt11036 = 75518;
		this.anInt11031 = 0;
		this.anInt11027 = 0;
		this.anInt11035 = 3500;
		this.anInt11024 = 0;
		this.anInt11042 = 128;
		this.anInt11023 = 45823;
		this.anInt11041 = 78642;
		this.anInt11045 = 0;
		this.aBoolean747 = false;
		this.anInt11032 = 0;
		this.anInt11046 = 512;
		this.anInt11030 = 512;
		this.aClass307_96 = new Class307(16);
		this.anInt11049 = -1;
		try {
			this.aClass307_95 = new Class307(256);
			this.aClass58_Sub1_3 = new Class58_Sub1();
			this.method9373(1);
			this.method9357(0);
			Static633.method8323(true, true);
			this.aBoolean745 = true;
			this.anInt11018 = (int) Static517.method6965();
		} catch (@Pc(99) Throwable local99) {
			local99.printStackTrace();
			this.method9397();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "()Z")
	@Override
	public boolean method9379() {
		return false;
	}

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "(I)Z")
	public boolean method9409(@OriginalArg(0) int arg0) {
		return super.anInterface4_14.method5758(arg0);
	}

	@OriginalMember(owner = "client!wda", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass58_Sub1_3.aFloat53 + this.aClass58_Sub1_3.aFloat51 * (float) arg0 + this.aClass58_Sub1_3.aFloat49 * (float) arg1 + this.aClass58_Sub1_3.aFloat54 * (float) arg2;
		if (local24 < (float) this.anInt11028 || local24 > (float) this.anInt11035) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt11046 * (this.aClass58_Sub1_3.aFloat48 + this.aClass58_Sub1_3.aFloat55 * (float) arg0 + this.aClass58_Sub1_3.aFloat52 * (float) arg1 + this.aClass58_Sub1_3.aFloat56 * (float) arg2) / (float) arg3);
		@Pc(118) int local118 = (int) ((float) this.anInt11030 * (this.aClass58_Sub1_3.aFloat50 + this.aClass58_Sub1_3.aFloat45 * (float) arg0 + this.aClass58_Sub1_3.aFloat47 * (float) arg1 + this.aClass58_Sub1_3.aFloat46 * (float) arg2) / (float) arg3);
		if (local85 >= this.anInt11033 && local85 <= this.anInt11025 && local118 >= this.anInt11040 && local118 <= this.anInt11021) {
			arg4[0] = local85 - this.anInt11033;
			arg4[1] = local118 - this.anInt11040;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!wda", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wda", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt11043) {
			arg2 = this.anInt11043;
		}
		if (arg3 > this.anInt11037) {
			arg3 = this.anInt11037;
		}
		this.anInt11029 = arg0;
		this.anInt11024 = arg2;
		this.anInt11031 = arg1;
		this.anInt11045 = arg3;
		this.method9418();
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
			@Pc(110) int local110;
			@Pc(143) int local143;
			@Pc(161) int local161;
			@Pc(229) int local229;
			@Pc(246) int local246;
			@Pc(251) int local251;
			@Pc(331) int local331;
			@Pc(220) int local220;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(100) int local100 = arg3 << 16;
				local110 = (int) Math.floor((double) local100 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt11029) {
					arg1 += local110 * (this.anInt11029 - arg0);
					arg0 = this.anInt11029;
				}
				if (arg2 >= this.anInt11024) {
					arg2 = this.anInt11024 - 1;
				}
				local143 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local143 == 255) {
					while (arg0 <= arg2) {
						local161 = arg1 >> 16;
						if (local161 >= this.anInt11031 && local161 < this.anInt11045) {
							this.anIntArray785[arg0 + local161 * this.anInt11043] = arg4;
						}
						arg1 += local110;
						arg0++;
					}
				} else if (arg5 == 1) {
					local220 = ((arg4 & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local143 >> 8 & 0xFF00) + (local143 << 24);
					local161 = 256 - local143;
					while (arg0 <= arg2) {
						local229 = arg1 >> 16;
						if (local229 >= this.anInt11031 && local229 < this.anInt11045) {
							local246 = arg0 + local229 * this.anInt11043;
							local251 = this.anIntArray785[local246];
							local251 = ((local251 & 0xFF00FF) * local161 >> 8 & 0xFF00FF) + ((local251 & 0xFF00) * local161 >> 8 & 0xFF00);
							this.anIntArray785[local246] = local220 + local251;
						}
						arg1 += local110;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local161 = arg1 >> 16;
						if (local161 >= this.anInt11031 && local161 < this.anInt11045) {
							local229 = arg0 + local161 * this.anInt11043;
							local246 = this.anIntArray785[local229];
							local251 = arg4 + local246;
							local331 = (arg4 & 0xFF00FF) + (local246 & 0xFF00FF);
							local246 = (local331 & 0x1000100) + (local251 - local331 & 0x10000);
							this.anIntArray785[local229] = local251 - local246 | local246 - (local246 >>> 8);
						}
						arg1 += local110;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(380) int local380 = arg2 << 16;
				local110 = (int) Math.floor((double) local380 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt11031) {
					arg0 += local110 * (this.anInt11031 - arg1);
					arg1 = this.anInt11031;
				}
				if (arg3 >= this.anInt11045) {
					arg3 = this.anInt11045 - 1;
				}
				local143 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local143 == 255) {
					while (arg1 <= arg3) {
						local161 = arg0 >> 16;
						if (local161 >= this.anInt11029 && local161 < this.anInt11024) {
							this.anIntArray785[local161 + arg1 * this.anInt11043] = arg4;
						}
						arg0 += local110;
						arg1++;
					}
				} else if (arg5 == 1) {
					local220 = ((arg4 & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local143 >> 8 & 0xFF00) + (local143 << 24);
					local161 = 256 - local143;
					while (arg1 <= arg3) {
						local229 = arg0 >> 16;
						if (local229 >= this.anInt11029 && local229 < this.anInt11024) {
							local246 = local229 + arg1 * this.anInt11043;
							local251 = this.anIntArray785[local246];
							local251 = ((local251 & 0xFF00FF) * local161 >> 8 & 0xFF00FF) + ((local251 & 0xFF00) * local161 >> 8 & 0xFF00);
							this.anIntArray785[local229 + arg1 * this.anInt11043] = local220 + local251;
						}
						arg0 += local110;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local161 = arg0 >> 16;
						if (local161 >= this.anInt11029 && local161 < this.anInt11024) {
							local229 = local161 + arg1 * this.anInt11043;
							local246 = this.anIntArray785[local229];
							local251 = arg4 + local246;
							local331 = (arg4 & 0xFF00FF) + (local246 & 0xFF00FF);
							@Pc(626) int local626 = (local331 & 0x1000100) + (local251 - local331 & 0x10000);
							this.anIntArray785[local229] = local251 - local626 | local626 - (local626 >>> 8);
						}
						arg0 += local110;
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

	@OriginalMember(owner = "client!wda", name = "o", descriptor = "()Z")
	@Override
	public boolean method9365() {
		return false;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIII)V")
	@Override
	public void method9352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method9341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray73;
		@Pc(8) int[] local8 = local2.anIntArray74;
		@Pc(18) int local18 = this.anInt11031 > arg7 ? this.anInt11031 : arg7;
		@Pc(34) int local34 = this.anInt11045 < arg7 + local5.length ? this.anInt11045 : arg7 + local5.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg2 + arg3 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(85) int local85;
		@Pc(118) int local118;
		@Pc(136) int local136;
		@Pc(140) int local140;
		@Pc(154) int local154;
		@Pc(242) int local242;
		@Pc(261) int local261;
		@Pc(266) int local266;
		@Pc(215) int local215;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(415) int local415 = arg2 << 16;
			local85 = (int) Math.floor((double) local415 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local18) {
				arg0 += local85 * (local18 - arg1);
				arg1 = local18;
			}
			if (arg3 >= local34) {
				arg3 = local34 - 1;
			}
			local118 = arg4 >>> 24;
			if (local118 == 255 && true) {
				while (arg1 <= arg3) {
					local136 = arg0 >> 16;
					local140 = arg1 - arg7;
					local154 = arg6 + local5[local140];
					if (local136 >= this.anInt11029 && local136 < this.anInt11024 && local136 >= local154 && local136 < local154 + local8[local140]) {
						this.anIntArray785[local136 + arg1 * this.anInt11043] = arg4;
					}
					arg0 += local85;
					arg1++;
				}
			} else {
				local215 = ((arg4 & 0xFF00FF) * local118 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local118 >> 8 & 0xFF00) + (local118 << 24);
				local136 = 256 - local118;
				while (arg1 <= arg3) {
					local140 = arg0 >> 16;
					local154 = arg1 - arg7;
					local242 = arg6 + local5[local154];
					if (local140 >= this.anInt11029 && local140 < this.anInt11024 && local140 >= local242 && local140 < local242 + local8[local154]) {
						local261 = local140 + arg1 * this.anInt11043;
						local266 = this.anIntArray785[local261];
						@Pc(629) int local629 = ((local266 & 0xFF00FF) * local136 >> 8 & 0xFF00FF) + ((local266 & 0xFF00) * local136 >> 8 & 0xFF00);
						this.anIntArray785[local140 + arg1 * this.anInt11043] = local215 + local629;
					}
					arg0 += local85;
					arg1++;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(75) int local75 = arg3 << 16;
		local85 = (int) Math.floor((double) local75 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt11029) {
			arg1 += local85 * (this.anInt11029 - arg0);
			arg0 = this.anInt11029;
		}
		if (arg2 >= this.anInt11024) {
			arg2 = this.anInt11024 - 1;
		}
		local118 = arg4 >>> 24;
		if (local118 == 255 && true) {
			while (arg0 <= arg2) {
				local136 = arg1 >> 16;
				local140 = local136 - arg7;
				if (local136 >= local18 && local136 < local34) {
					local154 = arg6 + local5[local140];
					if (arg0 >= local154 && arg0 < local154 + local8[local140]) {
						this.anIntArray785[arg0 + local136 * this.anInt11043] = arg4;
					}
				}
				arg1 += local85;
				arg0++;
			}
			return;
		}
		local215 = ((arg4 & 0xFF00FF) * local118 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local118 >> 8 & 0xFF00) + (local118 << 24);
		local136 = 256 - local118;
		while (arg0 <= arg2) {
			local140 = arg1 >> 16;
			local154 = local140 - arg7;
			if (local140 >= local18 && local140 < local34) {
				local242 = arg6 + local5[local154];
				if (arg0 >= local242 && arg0 < local242 + local8[local154]) {
					local261 = arg0 + local140 * this.anInt11043;
					local266 = this.anIntArray785[local261];
					local266 = ((local266 & 0xFF00FF) * local136 >> 8 & 0xFF00FF) + ((local266 & 0xFF00) * local136 >> 8 & 0xFF00);
					this.anIntArray785[local261] = local215 + local266;
				}
			}
			arg1 += local85;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIF)Lclient!jw;")
	@Override
	public Class3_Sub5 method9337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "([IIIIIZ)Lclient!kw;")
	@Override
	public Class178 method9322(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class178_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class178_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class178_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class178_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method9349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class239 local3 = this.method9423(Thread.currentThread());
		@Pc(6) Class166 local6 = local3.aClass166_2;
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(14) int local14 = arg3 - arg1;
		@Pc(22) int local22 = local10 >= 0 ? local10 : -local10;
		@Pc(30) int local30 = local14 >= 0 ? local14 : -local14;
		@Pc(32) int local32 = local22;
		if (local22 < local30) {
			local32 = local30;
		}
		if (local32 == 0) {
			return;
		}
		@Pc(47) int local47 = (local10 << 16) / local32;
		@Pc(53) int local53 = (local14 << 16) / local32;
		local10 += local47 >> 16;
		local14 += local53 >> 16;
		if (local53 <= local47) {
			local47 = -local47;
		} else {
			local53 = -local53;
		}
		@Pc(81) int local81 = arg5 * local53 >> 17;
		@Pc(89) int local89 = arg5 * local53 + 1 >> 17;
		@Pc(95) int local95 = arg5 * local47 >> 17;
		@Pc(103) int local103 = arg5 * local47 + 1 >> 17;
		@Pc(108) int local108 = arg0 - local6.method3608();
		@Pc(113) int local113 = arg1 - local6.method3592();
		@Pc(117) int local117 = local108 + local81;
		@Pc(121) int local121 = local108 - local89;
		@Pc(127) int local127 = local108 + local10 - local89;
		@Pc(133) int local133 = local108 + local10 + local81;
		@Pc(137) int local137 = local113 + local95;
		@Pc(141) int local141 = local113 - local103;
		@Pc(147) int local147 = local113 + local14 - local103;
		@Pc(153) int local153 = local113 + local14 + local95;
		local6.anInt3978 = 0;
		this.C(false);
		local6.aBoolean251 = local117 < 0 || local117 > local6.anInt3977 || local121 < 0 || local121 > local6.anInt3977 || local127 < 0 || local127 > local6.anInt3977;
		local6.method3610((float) local137, (float) local141, (float) local147, (float) local117, (float) local121, (float) local127, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean251 = local117 < 0 || local117 > local6.anInt3977 || local127 < 0 || local127 > local6.anInt3977 || local133 < 0 || local133 > local6.anInt3977;
		local6.method3610((float) local137, (float) local147, (float) local153, (float) local117, (float) local127, (float) local133, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "([I)V")
	@Override
	public void method9371(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt11043;
		arg0[1] = this.anInt11037;
	}

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "(I)Z")
	public boolean method9410(@OriginalArg(0) int arg0) {
		return super.anInterface4_14.method5761(arg0).aBoolean766 || super.anInterface4_14.method5761(arg0).aBoolean759;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!tm;Z)Lclient!kw;")
	@Override
	public Class178 method9363(@OriginalArg(0) Class361 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray701;
		@Pc(5) byte[] local5 = arg0.aByteArray90;
		@Pc(8) int local8 = arg0.anInt9706;
		@Pc(11) int local11 = arg0.anInt9707;
		@Pc(80) Class178_Sub1 local80;
		@Pc(22) int[] local22;
		@Pc(27) byte[] local27;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (arg1 && arg0.aByteArray91 == null) {
			local22 = new int[local2.length];
			local27 = new byte[local8 * local11];
			for (local29 = 0; local29 < local11; local29++) {
				local34 = local29 * local8;
				for (local36 = 0; local36 < local8; local36++) {
					local27[local34 + local36] = local5[local34 + local36];
				}
			}
			for (local34 = 0; local34 < local2.length; local34++) {
				local22[local34] = local2[local34];
			}
			local80 = new Class178_Sub1_Sub3(this, local27, local22, local8, local11);
		} else {
			local22 = new int[local8 * local11];
			local27 = arg0.aByteArray91;
			if (local27 == null) {
				for (local29 = 0; local29 < local11; local29++) {
					local34 = local29 * local8;
					for (local36 = 0; local36 < local8; local36++) {
						@Pc(162) int local162 = local2[local5[local34 + local36] & 0xFF];
						local22[local34 + local36] = local162 == 0 ? 0 : local162 | 0xFF000000;
					}
				}
				local80 = new Class178_Sub1_Sub1(this, local22, local8, local11);
			} else {
				for (local29 = 0; local29 < local11; local29++) {
					local34 = local29 * local8;
					for (local36 = 0; local36 < local8; local36++) {
						local22[local34 + local36] = local2[local5[local34 + local36] & 0xFF] | local27[local34 + local36] << 24;
					}
				}
				local80 = new Class178_Sub1_Sub2(this, local22, local8, local11);
			}
		}
		local80.method7631(arg0.anInt9703, arg0.anInt9704, arg0.anInt9708, arg0.anInt9705);
		return local80;
	}

	@OriginalMember(owner = "client!wda", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt11036 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!wda", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class239 local3 = this.method9423(Thread.currentThread());
		local3.aBoolean395 = arg0;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!so;)V")
	@Override
	public void method9384(@OriginalArg(0) Class346 arg0) {
		@Pc(3) Class239 local3 = this.method9423(Thread.currentThread());
		@Pc(7) Class9_Sub2 local7 = arg0.aClass357_1.aClass9_Sub2_9;
		for (@Pc(10) Class9_Sub2 local10 = local7.aClass9_Sub2_8; local10 != local7; local10 = local10.aClass9_Sub2_8) {
			@Pc(14) Class9_Sub2_Sub1 local14 = (Class9_Sub2_Sub1) local10;
			@Pc(19) int local19 = local14.anInt1777 >> 12;
			@Pc(24) int local24 = local14.anInt1772 >> 12;
			@Pc(29) int local29 = local14.anInt1776 >> 12;
			@Pc(54) float local54 = this.aClass58_Sub1_3.aFloat53 + this.aClass58_Sub1_3.aFloat51 * (float) local19 + this.aClass58_Sub1_3.aFloat49 * (float) local24 + this.aClass58_Sub1_3.aFloat54 * (float) local29;
			if (!(local54 < (float) this.anInt11028) && !(local54 > (float) local3.anInt6098)) {
				@Pc(105) int local105 = this.anInt11034 + (int) ((float) this.anInt11046 * (this.aClass58_Sub1_3.aFloat48 + this.aClass58_Sub1_3.aFloat55 * (float) local19 + this.aClass58_Sub1_3.aFloat52 * (float) local24 + this.aClass58_Sub1_3.aFloat56 * (float) local29) / local54);
				@Pc(140) int local140 = this.anInt11038 + (int) ((float) this.anInt11030 * (this.aClass58_Sub1_3.aFloat50 + this.aClass58_Sub1_3.aFloat45 * (float) local19 + this.aClass58_Sub1_3.aFloat47 * (float) local24 + this.aClass58_Sub1_3.aFloat46 * (float) local29) / local54);
				if (local105 >= this.anInt11029 && local105 <= this.anInt11024 && local140 >= this.anInt11031 && local140 <= this.anInt11045) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method9416(local14, local105, local140, (int) local54, (int) ((float) (local14.anInt1775 * this.anInt11046 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!wda", name = "n", descriptor = "(I)I")
	public int method9411(@OriginalArg(0) int arg0) {
		return super.anInterface4_14.method5761(arg0).anInt11143;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method9370(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub15 local8 = (Class3_Sub15) this.aClass313_45.method7104((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static211.method9047(arg1, arg0, arg2);
			this.aClass313_45.method7107((long) arg0.hashCode(), local8);
		} else if (local8.anInt6369 != arg1 || local8.anInt6370 != arg2) {
			this.method9401(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method9390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray73;
		@Pc(8) int[] local8 = local2.anIntArray74;
		@Pc(18) int local18 = this.anInt11031 > arg7 ? this.anInt11031 : arg7;
		@Pc(34) int local34 = this.anInt11045 < arg7 + local5.length ? this.anInt11045 : arg7 + local5.length;
		@Pc(38) int local38 = arg10 << 8;
		@Pc(42) int local42 = arg8 << 8;
		@Pc(46) int local46 = arg9 << 8;
		@Pc(50) int local50 = local42 + local46;
		arg10 = local38 % local50;
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(79) int local79;
		@Pc(83) int local83;
		if (arg2 + arg3 < 0) {
			local79 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
			local83 = local79 % local50;
			local38 = local50 + local42 - arg10 - local83;
			arg10 = local38 % local50;
			if (arg10 < 0) {
				arg10 += local50;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(161) int local161;
		@Pc(179) int local179;
		@Pc(183) int local183;
		@Pc(214) int local214;
		@Pc(327) int local327;
		@Pc(346) int local346;
		@Pc(144) int local144;
		@Pc(130) int local130;
		@Pc(283) int local283;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			local144 = arg2 << 16;
			local79 = (int) Math.floor((double) local144 / (double) arg3 + 0.5D);
			local83 = (int) Math.sqrt((double) ((local79 >> 8) * (local79 >> 8) + 65536));
			local130 = arg3 + arg1;
			local161 = arg4 >>> 24;
			if (local161 == 255 && true) {
				while (arg1 <= local130) {
					local179 = arg0 >> 16;
					local183 = arg1 - arg7;
					if (arg1 >= local18 && arg1 < local34 && local179 >= this.anInt11029 && local179 < this.anInt11024 && arg10 < local42 && local179 >= arg6 + local5[local183] && local179 < arg6 + local5[local183] + local8[local183]) {
						this.anIntArray785[local179 + arg1 * this.anInt11043] = arg4;
					}
					arg0 += local79;
					arg1++;
					local38 = arg10 + local83;
					arg10 = local38 % local50;
				}
			} else {
				local283 = ((arg4 & 0xFF00FF) * local161 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local161 >> 8 & 0xFF00) + (local161 << 24);
				local179 = 256 - local161;
				while (arg1 <= local130) {
					local183 = arg0 >> 16;
					local214 = arg1 - arg7;
					if (arg1 >= local18 && arg1 < local34 && local183 >= this.anInt11029 && local183 < this.anInt11024 && arg10 < local42 && local183 >= arg6 + local5[local214] && local183 < arg6 + local5[local214] + local8[local214]) {
						local327 = local183 + arg1 * this.anInt11043;
						local346 = this.anIntArray785[local327];
						@Pc(782) int local782 = ((local346 & 0xFF00FF) * local179 >> 8 & 0xFF00FF) + ((local346 & 0xFF00) * local179 >> 8 & 0xFF00);
						this.anIntArray785[local183 + arg1 * this.anInt11043] = local283 + local782;
					}
					arg0 += local79;
					arg1++;
					local38 = arg10 + local83;
					arg10 = local38 % local50;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		local130 = arg3 << 16;
		local79 = (int) Math.floor((double) local130 / (double) arg2 + 0.5D);
		local144 = arg2 + arg0;
		local83 = arg4 >>> 24;
		local161 = (int) Math.sqrt((double) ((local79 >> 8) * (local79 >> 8) + 65536));
		if (local83 == 255 && true) {
			while (arg0 <= local144) {
				local179 = arg1 >> 16;
				local183 = local179 - arg7;
				if (arg0 >= this.anInt11029 && arg0 < this.anInt11024 && local179 >= local18 && local179 < local34 && arg10 < local42) {
					local214 = arg6 + local5[local183];
					if (arg0 >= local214 && arg0 < local214 + local8[local183]) {
						this.anIntArray785[arg0 + local179 * this.anInt11043] = arg4;
					}
				}
				arg1 += local79;
				arg0++;
				local38 = arg10 + local161;
				arg10 = local38 % local50;
			}
			return;
		}
		local283 = ((arg4 & 0xFF00FF) * local83 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local83 >> 8 & 0xFF00) + (local83 << 24);
		local179 = 256 - local83;
		while (arg0 <= local144) {
			local183 = arg1 >> 16;
			local214 = local183 - arg7;
			if (arg0 >= this.anInt11029 && arg0 < this.anInt11024 && local183 >= local18 && local183 < local34 && arg10 < local42) {
				local327 = arg6 + local5[local214];
				if (arg0 >= local327 && arg0 < local327 + local8[local214]) {
					local346 = arg0 + local183 * this.anInt11043;
					@Pc(351) int local351 = this.anIntArray785[local346];
					@Pc(371) int local371 = ((local351 & 0xFF00FF) * local179 >> 8 & 0xFF00FF) + ((local351 & 0xFF00) * local179 >> 8 & 0xFF00);
					this.anIntArray785[local346] = local283 + local371;
				}
			}
			arg1 += local79;
			arg0++;
			local38 = arg10 + local161;
			arg10 = local38 % local50;
		}
	}

	@OriginalMember(owner = "client!wda", name = "v", descriptor = "()Z")
	@Override
	public boolean method9342() {
		return true;
	}

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "(I)V")
	@Override
	public void method9343() {
		Static264.anInt4124 = 10000;
		Static264.anInt4121 = 10000;
		if (this.anInt11044 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method9373(this.anInt11044);
		this.method9357(0);
	}

	@OriginalMember(owner = "client!wda", name = "m", descriptor = "(I)I")
	public int method9412(@OriginalArg(0) int arg0) {
		return super.anInterface4_14.method5761(arg0).aShort127 & 0xFFFF;
	}

	@OriginalMember(owner = "client!wda", name = "u", descriptor = "()Z")
	@Override
	public boolean method9386() {
		return true;
	}

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "()Z")
	@Override
	public boolean method9340() {
		return false;
	}

	@OriginalMember(owner = "client!wda", name = "p", descriptor = "(I)[I")
	public int[] method9413(@OriginalArg(0) int arg0) {
		@Pc(2) Class307 local2 = this.aClass307_95;
		@Pc(12) Class3_Sub25 local12;
		synchronized (this.aClass307_95) {
			local12 = (Class3_Sub25) this.aClass307_95.method7002((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_14.method5758(arg0)) {
					return null;
				}
				@Pc(34) Class406 local34 = super.anInterface4_14.method5761(arg0);
				@Pc(48) int local48 = local34.aBoolean762 || this.aBoolean747 ? 64 : this.anInt11042;
				local12 = new Class3_Sub25(arg0, local48, super.anInterface4_14.method5760(local48, local48, true, 0.7F, arg0), local34.anInt11143 != 1);
				this.aClass307_95.method7000(local12, (long) arg0);
			}
		}
		local12.aBoolean212 = true;
		return local12.method3067();
	}

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "(I)V")
	@Override
	public void method9357(@OriginalArg(0) int arg0) {
		this.aClass239Array1[arg0].method5322(Thread.currentThread());
	}

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "()Z")
	@Override
	public boolean method9335() {
		return true;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(II)Lclient!si;")
	@Override
	public Interface23 method9381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method9361(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "()V")
	@Override
	public void method9351() {
		if (this.aCanvas13 == null) {
			this.anInt11043 = 1;
			this.anInt11037 = 1;
			this.anIntArray785 = null;
			this.anInt11039 = 1;
			this.anInt11047 = 1;
			this.aFloatArray85 = null;
		} else {
			this.anIntArray785 = this.aClass3_Sub15_1.anIntArray488;
			this.anInt11043 = this.aClass3_Sub15_1.anInt6369;
			this.anInt11037 = this.aClass3_Sub15_1.anInt6370;
			this.aFloatArray85 = this.aFloatArray84;
			this.anInt11039 = this.anInt11020;
			this.anInt11047 = this.anInt11022;
		}
		this.aClass256_1 = null;
		this.method9421();
	}

	@OriginalMember(owner = "client!wda", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt11031) {
			local8 = this.anInt11031;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt11045) {
			local21 = this.anInt11045;
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
		@Pc(98) int local98;
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(125) int local125;
		if (arg4 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local98 = arg0 + 1 - local36;
				if (local98 < this.anInt11029) {
					local98 = this.anInt11029;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt11024) {
					local109 = this.anInt11024;
				}
				local123 = local98 + local30 * this.anInt11043;
				for (local125 = local98; local125 < local109; local125++) {
					this.anIntArray785[local123++] = arg3;
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
				local98 = arg0 - local36;
				if (local98 < this.anInt11029) {
					local98 = this.anInt11029;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt11024 - 1) {
					local109 = this.anInt11024 - 1;
				}
				local123 = local98 + local30 * this.anInt11043;
				for (local125 = local98; local125 <= local109; local125++) {
					this.anIntArray785[local123++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(287) int local287 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
		local98 = 256 - local57;
		@Pc(346) int local346;
		@Pc(352) int local352;
		while (local30 < arg1) {
			while (local48 <= local34 || local44 <= local34) {
				local44 += local36 + local36;
				local48 += local36++ + local36;
			}
			local109 = arg0 + 1 - local36;
			if (local109 < this.anInt11029) {
				local109 = this.anInt11029;
			}
			local123 = arg0 + local36;
			if (local123 > this.anInt11024) {
				local123 = this.anInt11024;
			}
			local125 = local109 + local30 * this.anInt11043;
			for (local346 = local109; local346 < local123; local346++) {
				local352 = this.anIntArray785[local125];
				@Pc(372) int local372 = ((local352 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local352 & 0xFF00) * local98 >> 8 & 0xFF00);
				this.anIntArray785[local125++] = local287 + local372;
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
			local109 = arg0 - local36;
			if (local109 < this.anInt11029) {
				local109 = this.anInt11029;
			}
			local123 = arg0 + local36;
			if (local123 > this.anInt11024 - 1) {
				local123 = this.anInt11024 - 1;
			}
			local125 = local109 + local30 * this.anInt11043;
			for (local346 = local109; local346 <= local123; local346++) {
				local352 = this.anIntArray785[local125];
				local352 = ((local352 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local352 & 0xFF00) * local98 >> 8 & 0xFF00);
				this.anIntArray785[local125++] = local287 + local352;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "()Z")
	@Override
	public boolean method9388() {
		return false;
	}

	@OriginalMember(owner = "client!wda", name = "x", descriptor = "()Lclient!cl;")
	@Override
	public Class58 method9369() {
		return this.aClass58_Sub1_3;
	}

	@OriginalMember(owner = "client!wda", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass239Array1.length; local1++) {
			@Pc(7) Class239 local7 = this.aClass239Array1[local1];
			local7.anInt6099 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt6099 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt6099 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt6099 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt6099 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean394 = false;
			} else {
				local7.aBoolean394 = true;
			}
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!cl;)V")
	@Override
	public void method9405(@OriginalArg(0) Class58 arg0) {
		this.aClass58_Sub1_3 = (Class58_Sub1) arg0;
	}

	@OriginalMember(owner = "client!wda", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass239Array1.length; local1++) {
			this.aClass239Array1[local1].anInt6099 = this.aClass239Array1[local1].anInt6102;
			this.aClass239Array1[local1].aBoolean396 = false;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class259 method9407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class259_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "(I)V")
	@Override
	public void method9387(@OriginalArg(0) int arg0) {
		this.aClass239Array1[arg0].method5322((Runnable) null);
	}

	@OriginalMember(owner = "client!wda", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(33) int local33;
		if (this.anInt11029 == 0 && this.anInt11024 == this.anInt11043 && this.anInt11031 == 0 && this.anInt11045 == this.anInt11037) {
			local25 = this.aFloatArray85.length;
			local31 = local25 - (local25 & 0x7);
			local33 = 0;
			while (local33 < local31) {
				this.aFloatArray85[local33++] = 2.14748365E9F;
				this.aFloatArray85[local33++] = 2.14748365E9F;
				this.aFloatArray85[local33++] = 2.14748365E9F;
				this.aFloatArray85[local33++] = 2.14748365E9F;
				this.aFloatArray85[local33++] = 2.14748365E9F;
				this.aFloatArray85[local33++] = 2.14748365E9F;
				this.aFloatArray85[local33++] = 2.14748365E9F;
				this.aFloatArray85[local33++] = 2.14748365E9F;
			}
			while (local33 < local25) {
				this.aFloatArray85[local33++] = 2.14748365E9F;
			}
			return;
		}
		local25 = this.anInt11024 - this.anInt11029;
		local31 = this.anInt11045 - this.anInt11031;
		local33 = this.anInt11043 - local25;
		@Pc(124) int local124 = this.anInt11029 + this.anInt11031 * this.anInt11043;
		@Pc(128) int local128 = local25 >> 3;
		@Pc(132) int local132 = local25 & 0x7;
		local25 = local124 - 1;
		for (@Pc(139) int local139 = -local31; local139 < 0; local139++) {
			@Pc(144) int local144;
			if (local128 > 0) {
				local144 = local128;
				do {
					local25++;
					this.aFloatArray85[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray85[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray85[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray85[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray85[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray85[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray85[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray85[local25] = 2.14748365E9F;
					local144--;
				} while (local144 > 0);
			}
			if (local132 > 0) {
				local144 = local132;
				do {
					local25++;
					this.aFloatArray85[local25] = 2.14748365E9F;
					local144--;
				} while (local144 > 0);
			}
			local25 += local33;
		}
	}

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "(I)V")
	@Override
	public void method9394(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt11018;
		for (@Pc(9) Object local9 = this.aClass307_95.method7007(); local9 != null; local9 = this.aClass307_95.method7008()) {
			@Pc(13) Class3_Sub25 local13 = (Class3_Sub25) local9;
			if (local13.aBoolean212) {
				local13.anInt3357 += local4;
				@Pc(27) int local27 = local13.anInt3357 / 20;
				if (local27 > 0) {
					@Pc(36) Class406 local36 = super.anInterface4_14.method5761(local13.anInt3358);
					local13.method3066(local36.aByte145 * local4 * 50 / 1000, local36.aByte150 * local4 * 50 / 1000);
					local13.anInt3357 -= local27 * 20;
				}
				local13.aBoolean212 = false;
			}
		}
		this.anInt11018 = arg0;
		this.aClass307_96.method6995(5);
		this.aClass307_95.method6995(5);
	}

	@OriginalMember(owner = "client!wda", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt11029 < arg0) {
			this.anInt11029 = arg0;
		}
		if (this.anInt11031 < arg1) {
			this.anInt11031 = arg1;
		}
		if (this.anInt11024 > arg2) {
			this.anInt11024 = arg2;
		}
		if (this.anInt11045 > arg3) {
			this.anInt11045 = arg3;
		}
		this.method9418();
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method9355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "()Z")
	@Override
	public boolean method9332() {
		return false;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!so;I)V")
	@Override
	public void method9360(@OriginalArg(0) Class346 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class239 local3 = this.method9423(Thread.currentThread());
		@Pc(7) Class9_Sub2 local7 = arg0.aClass357_1.aClass9_Sub2_9;
		for (@Pc(10) Class9_Sub2 local10 = local7.aClass9_Sub2_8; local10 != local7; local10 = local10.aClass9_Sub2_8) {
			@Pc(14) Class9_Sub2_Sub1 local14 = (Class9_Sub2_Sub1) local10;
			@Pc(19) int local19 = local14.anInt1777 >> 12;
			@Pc(24) int local24 = local14.anInt1772 >> 12;
			@Pc(29) int local29 = local14.anInt1776 >> 12;
			@Pc(54) float local54 = this.aClass58_Sub1_3.aFloat53 + this.aClass58_Sub1_3.aFloat51 * (float) local19 + this.aClass58_Sub1_3.aFloat49 * (float) local24 + this.aClass58_Sub1_3.aFloat54 * (float) local29;
			if (!(local54 < (float) this.anInt11028) && !(local54 > (float) local3.anInt6098)) {
				@Pc(106) int local106 = this.anInt11034 + (int) ((float) this.anInt11046 * (this.aClass58_Sub1_3.aFloat48 + this.aClass58_Sub1_3.aFloat55 * (float) local19 + this.aClass58_Sub1_3.aFloat52 * (float) local24 + this.aClass58_Sub1_3.aFloat56 * (float) local29) / (float) arg1);
				@Pc(142) int local142 = this.anInt11038 + (int) ((float) this.anInt11030 * (this.aClass58_Sub1_3.aFloat50 + this.aClass58_Sub1_3.aFloat45 * (float) local19 + this.aClass58_Sub1_3.aFloat47 * (float) local24 + this.aClass58_Sub1_3.aFloat46 * (float) local29) / (float) arg1);
				if (local106 >= this.anInt11029 && local106 <= this.anInt11024 && local142 >= this.anInt11031 && local142 <= this.anInt11045) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method9416(local14, local106, local142, (int) local54, (local14.anInt1775 * this.anInt11046 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wda", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = (arg7 << 16) / arg2;
		@Pc(26) int local26 = (arg6.length / arg7 << 16) / arg3;
		@Pc(33) int local33 = arg0 + arg1 * this.anInt11043;
		@Pc(38) int local38 = this.anInt11043 - arg2;
		if (arg1 + arg3 > this.anInt11045) {
			arg3 -= arg1 + arg3 - this.anInt11045;
		}
		@Pc(62) int local62;
		if (arg1 < this.anInt11031) {
			local62 = this.anInt11031 - arg1;
			arg3 -= local62;
			local33 += local62 * this.anInt11043;
			local11 += local26 * local62;
		}
		if (arg0 + arg2 > this.anInt11024) {
			local62 = arg0 + arg2 - this.anInt11024;
			arg2 -= local62;
			local38 += local62;
		}
		if (arg0 < this.anInt11029) {
			local62 = this.anInt11029 - arg0;
			arg2 -= local62;
			local33 += local62;
			local9 += local17 * local62;
			local38 += local62;
		}
		local62 = arg4 >>> 24;
		@Pc(135) int local135 = arg5 >>> 24;
		@Pc(154) int local154;
		@Pc(157) int local157;
		@Pc(164) int local164;
		@Pc(167) int local167;
		if (arg8 == 0 || arg8 == 1 && local62 == 255 && local135 == 255) {
			local154 = local9;
			for (local157 = -arg3; local157 < 0; local157++) {
				local164 = (local11 >> 16) * arg7;
				for (local167 = -arg2; local167 < 0; local167++) {
					if (arg6[(local9 >> 16) + local164] == 0) {
						this.anIntArray785[local33++] = arg4;
					} else {
						this.anIntArray785[local33++] = arg5;
					}
					local9 += local17;
				}
				local11 += local26;
				local9 = local154;
				local33 += local38;
			}
			return;
		}
		@Pc(233) int local233;
		@Pc(247) int local247;
		@Pc(251) int local251;
		@Pc(256) int local256;
		if (arg8 == 1) {
			local154 = local9;
			for (local157 = -arg3; local157 < 0; local157++) {
				local164 = (local11 >> 16) * arg7;
				for (local167 = -arg2; local167 < 0; local167++) {
					local233 = arg4;
					if (arg6[(local9 >> 16) + local164] != 0) {
						local233 = arg5;
					}
					local247 = local233 >>> 24;
					local251 = 255 - local247;
					local256 = this.anIntArray785[local33];
					this.anIntArray785[local33++] = ((local233 & 0xFF00FF) * local247 + (local256 & 0xFF00FF) * local251 & 0xFF00FF00) + ((local233 & 0xFF00) * local247 + (local256 & 0xFF00) * local251 & 0xFF0000) >> 8;
					local9 += local17;
				}
				local11 += local26;
				local9 = local154;
				local33 += local38;
			}
		} else if (arg8 == 2) {
			local154 = local9;
			for (local157 = -arg3; local157 < 0; local157++) {
				local164 = (local11 >> 16) * arg7;
				for (local167 = -arg2; local167 < 0; local167++) {
					local233 = arg4;
					if (arg6[(local9 >> 16) + local164] != 0) {
						local233 = arg5;
					}
					if (local233 == 0) {
						local33++;
					} else {
						local247 = this.anIntArray785[local33];
						local251 = local233 + local247;
						local256 = (local233 & 0xFF00FF) + (local247 & 0xFF00FF);
						@Pc(372) int local372 = (local256 & 0x1000100) + (local251 - local256 & 0x10000);
						this.anIntArray785[local33++] = local251 - local372 | local372 - (local372 >>> 8);
					}
					local9 += local17;
				}
				local11 += local26;
				local9 = local154;
				local33 += local38;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wda", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "(IIIIII)V")
	private void method9414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt11031) {
			local8 = this.anInt11031;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt11045) {
			local21 = this.anInt11045;
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
		@Pc(98) int local98;
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(125) int local125;
		if (arg5 == 0 || arg5 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local98 = arg0 + 1 - local36;
				if (local98 < this.anInt11029) {
					local98 = this.anInt11029;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt11024) {
					local109 = this.anInt11024;
				}
				local123 = local98 + local30 * this.anInt11043;
				for (local125 = local98; local125 < local109; local125++) {
					if ((float) arg2 < this.aFloatArray85[local123]) {
						this.anIntArray785[local123] = arg4;
					}
					local123++;
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
				local98 = arg0 - local36;
				if (local98 < this.anInt11029) {
					local98 = this.anInt11029;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt11024 - 1) {
					local109 = this.anInt11024 - 1;
				}
				local123 = local98 + local30 * this.anInt11043;
				for (local125 = local98; local125 <= local109; local125++) {
					if ((float) arg2 < this.aFloatArray85[local123]) {
						this.anIntArray785[local123] = arg4;
					}
					local123++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(380) int local380;
		if (arg5 == 1) {
			@Pc(307) int local307 = ((arg4 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
			local98 = 256 - local57;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local109 = arg0 + 1 - local36;
				if (local109 < this.anInt11029) {
					local109 = this.anInt11029;
				}
				local123 = arg0 + local36;
				if (local123 > this.anInt11024) {
					local123 = this.anInt11024;
				}
				local125 = local109 + local30 * this.anInt11043;
				for (local366 = local109; local366 < local123; local366++) {
					if ((float) arg2 < this.aFloatArray85[local125]) {
						local380 = this.anIntArray785[local125];
						local380 = ((local380 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local98 >> 8 & 0xFF00);
						this.anIntArray785[local125] = local307 + local380;
					}
					local125++;
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
				local109 = arg0 - local36;
				if (local109 < this.anInt11029) {
					local109 = this.anInt11029;
				}
				local123 = arg0 + local36;
				if (local123 > this.anInt11024 - 1) {
					local123 = this.anInt11024 - 1;
				}
				local125 = local109 + local30 * this.anInt11043;
				for (local366 = local109; local366 <= local123; local366++) {
					if ((float) arg2 < this.aFloatArray85[local125]) {
						local380 = this.anIntArray785[local125];
						local380 = ((local380 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local98 >> 8 & 0xFF00);
						this.anIntArray785[local125] = local307 + local380;
					}
					local125++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else if (arg5 == 2) {
			@Pc(655) int local655;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local98 = arg0 + 1 - local36;
				if (local98 < this.anInt11029) {
					local98 = this.anInt11029;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt11024) {
					local109 = this.anInt11024;
				}
				local123 = local98 + local30 * this.anInt11043;
				for (local125 = local98; local125 < local109; local125++) {
					if ((float) arg2 < this.aFloatArray85[local123]) {
						local366 = this.anIntArray785[local123];
						local380 = arg4 + local366;
						local655 = (arg4 & 0xFF00FF) + (local366 & 0xFF00FF);
						@Pc(665) int local665 = (local655 & 0x1000100) + (local380 - local655 & 0x10000);
						this.anIntArray785[local123] = local380 - local665 | local665 - (local665 >>> 8);
					}
					local123++;
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
				local98 = arg0 - local36;
				if (local98 < this.anInt11029) {
					local98 = this.anInt11029;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt11024 - 1) {
					local109 = this.anInt11024 - 1;
				}
				local123 = local98 + local30 * this.anInt11043;
				for (local125 = local98; local125 <= local109; local125++) {
					if ((float) arg2 < this.aFloatArray85[local123]) {
						local366 = this.anIntArray785[local123];
						local380 = arg4 + local366;
						local655 = (arg4 & 0xFF00FF) + (local366 & 0xFF00FF);
						local366 = (local655 & 0x1000100) + (local380 - local655 & 0x10000);
						this.anIntArray785[local123] = local380 - local366 | local366 - (local366 >>> 8);
					}
					local123++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wda", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class239 local3 = this.method9423(Thread.currentThread());
		local3.anInt6100 = arg0;
		local3.anInt6099 = arg1;
		local3.anInt6096 = arg2;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(IIIIIIIIII)V")
	public void method9415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface4_14.method5761(arg6).aBoolean761) {
			this.method9414(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt11049 != arg6) {
			@Pc(33) Class178 local33 = (Class178) this.aClass307_96.method7002((long) arg6);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method9417(arg6);
				if (local39 == null) {
					return;
				}
				@Pc(53) int local53 = this.method9420(arg6) ? 64 : this.anInt11042;
				local33 = this.method9367(local39, local53, local53, local53);
				this.aClass307_96.method7000(local33, (long) arg6);
			}
			this.anInt11049 = arg6;
			this.aClass178_33 = local33;
		}
		((Class178_Sub1) this.aClass178_33).method7641(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!jma;IIII)V")
	private void method9416(@OriginalArg(0) Class9_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt1774;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method9414(arg1, arg2, arg3, arg4, arg0.anInt1780, 1);
			return;
		}
		if (this.anInt11049 != local2) {
			@Pc(34) Class178 local34 = (Class178) this.aClass307_96.method7002((long) local2);
			if (local34 == null) {
				@Pc(40) int[] local40 = this.method9417(local2);
				if (local40 == null) {
					return;
				}
				@Pc(54) int local54 = this.method9420(local2) ? 64 : this.anInt11042;
				local34 = this.method9367(local40, local54, local54, local54);
				this.aClass307_96.method7000(local34, (long) local2);
			}
			this.anInt11049 = local2;
			this.aClass178_33 = local34;
		}
		local8++;
		((Class178_Sub1) this.aClass178_33).method7641(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt1780, 1);
	}

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "(I)[I")
	public int[] method9417(@OriginalArg(0) int arg0) {
		@Pc(2) Class307 local2 = this.aClass307_95;
		@Pc(14) Class3_Sub25 local14;
		synchronized (this.aClass307_95) {
			local14 = (Class3_Sub25) this.aClass307_95.method7002((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface4_14.method5758(arg0)) {
					return null;
				}
				@Pc(36) Class406 local36 = super.anInterface4_14.method5761(arg0);
				@Pc(50) int local50 = local36.aBoolean762 || this.aBoolean747 ? 64 : this.anInt11042;
				local14 = new Class3_Sub25(arg0, local50, super.anInterface4_14.method5757(local50, local50, arg0, 0.7F), local36.anInt11143 != 1);
				this.aClass307_95.method7000(local14, (long) arg0 | Long.MIN_VALUE);
			}
		}
		local14.aBoolean212 = true;
		return local14.method3067();
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!vv;)V")
	@Override
	public void method9398(@OriginalArg(0) Interface25 arg0) {
		@Pc(2) Class256 local2 = (Class256) arg0;
		this.anInt11043 = local2.anInt6551;
		this.anInt11037 = local2.anInt6553;
		this.anIntArray785 = local2.anIntArray497;
		this.aClass256_1 = local2;
		this.anInt11039 = local2.anInt6551;
		this.anInt11047 = local2.anInt6553;
		this.aFloatArray85 = local2.aFloatArray49;
		this.method9421();
	}

	@OriginalMember(owner = "client!wda", name = "t", descriptor = "()I")
	@Override
	public int method9362() {
		return 0;
	}

	@OriginalMember(owner = "client!wda", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass239Array1.length; local1++) {
			this.aClass239Array1[local1].anInt6102 = this.aClass239Array1[local1].anInt6099;
			this.aClass239Array1[local1].anInt6100 = arg0;
			this.aClass239Array1[local1].anInt6099 = arg1;
			this.aClass239Array1[local1].anInt6096 = arg2;
			this.aClass239Array1[local1].aBoolean396 = true;
		}
	}

	@OriginalMember(owner = "client!wda", name = "F", descriptor = "()V")
	private void method9418() {
		this.anInt11033 = this.anInt11029 - this.anInt11034;
		this.anInt11025 = this.anInt11024 - this.anInt11034;
		this.anInt11040 = this.anInt11031 - this.anInt11038;
		this.anInt11021 = this.anInt11045 - this.anInt11038;
		for (@Pc(29) int local29 = 0; local29 < this.anInt11044; local29++) {
			@Pc(36) Class166 local36 = this.aClass239Array1[local29].aClass166_2;
			local36.anInt3974 = this.anInt11034 - this.anInt11029;
			local36.anInt3975 = this.anInt11038 - this.anInt11031;
			local36.anInt3977 = this.anInt11024 - this.anInt11029;
			local36.anInt3976 = this.anInt11045 - this.anInt11031;
		}
		@Pc(78) int local78 = this.anInt11031 * this.anInt11043 + this.anInt11029;
		for (@Pc(81) int local81 = this.anInt11031; local81 < this.anInt11045; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt11044; local84++) {
				this.aClass239Array1[local84].aClass166_2.anIntArray295[local81 - this.anInt11031] = local78;
			}
			local78 += this.anInt11043;
		}
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(IIIIII)Lclient!ih;")
	@Override
	public Class113 method9366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method9395(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			this.method9347((Canvas) null);
		}
		@Pc(17) Class3_Sub15 local17 = (Class3_Sub15) this.aClass313_45.method7104((long) arg0.hashCode());
		if (local17 != null) {
			local17.method9596();
		}
	}

	@OriginalMember(owner = "client!wda", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt11035;
	}

	@OriginalMember(owner = "client!wda", name = "w", descriptor = "()V")
	@Override
	public void method9328() {
		this.aClass307_95.method7006();
		this.aClass307_96.method7006();
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method9326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(31) int local31;
		@Pc(35) int local35;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method9422(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local31 = arg5 + arg6;
				local35 = arg7 % local31;
				local35 = local31 + arg5 - local35 - (-arg2 + 1) % local31;
				arg7 = local35 % local31;
				if (arg7 < 0) {
					arg7 += local31;
				}
				this.method9422(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
			}
		} else if (arg2 != 0) {
			local35 = arg7 << 8;
			@Pc(149) int local149 = arg5 << 8;
			@Pc(153) int local153 = arg6 << 8;
			local31 = local149 + local153;
			arg7 = local35 % local31;
			@Pc(178) int local178;
			@Pc(182) int local182;
			if (arg2 + arg3 < 0) {
				local178 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
				local182 = local178 % local31;
				local35 = local31 + local149 - arg7 - local182;
				arg7 = local35 % local31;
				if (arg7 < 0) {
					arg7 += local31;
				}
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(260) int local260;
			@Pc(278) int local278;
			@Pc(371) int local371;
			@Pc(405) int local405;
			@Pc(410) int local410;
			@Pc(243) int local243;
			@Pc(229) int local229;
			@Pc(362) int local362;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				local229 = arg3 << 16;
				local178 = (int) Math.floor((double) local229 / (double) arg2 + 0.5D);
				local243 = arg2 + arg0;
				local182 = arg4 >>> 24;
				local260 = (int) Math.sqrt((double) ((local178 >> 8) * (local178 >> 8) + 65536));
				if (local182 == 255 && true) {
					while (arg0 <= local243) {
						local278 = arg1 >> 16;
						if (arg0 >= this.anInt11029 && arg0 < this.anInt11024 && local278 >= this.anInt11031 && local278 < this.anInt11045 && arg7 < local149) {
							this.anIntArray785[arg0 + local278 * this.anInt11043] = arg4;
						}
						arg1 += local178;
						arg0++;
						local35 = arg7 + local260;
						arg7 = local35 % local31;
					}
				} else {
					local362 = ((arg4 & 0xFF00FF) * local182 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local182 >> 8 & 0xFF00) + (local182 << 24);
					local278 = 256 - local182;
					while (arg0 <= local243) {
						local371 = arg1 >> 16;
						if (arg0 >= this.anInt11029 && arg0 < this.anInt11024 && local371 >= this.anInt11031 && local371 < this.anInt11045 && arg7 < local149) {
							local405 = arg0 + local371 * this.anInt11043;
							local410 = this.anIntArray785[local405];
							local410 = ((local410 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local410 & 0xFF00) * local278 >> 8 & 0xFF00);
							this.anIntArray785[local405] = local362 + local410;
						}
						arg1 += local178;
						arg0++;
						local35 = arg7 + local260;
						arg7 = local35 % local31;
					}
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				local243 = arg2 << 16;
				local178 = (int) Math.floor((double) local243 / (double) arg3 + 0.5D);
				local229 = arg3 + arg1;
				local182 = arg4 >>> 24;
				local260 = (int) Math.sqrt((double) ((local178 >> 8) * (local178 >> 8) + 65536));
				if (local182 == 255 && true) {
					while (arg1 <= local229) {
						local278 = arg0 >> 16;
						if (arg1 >= this.anInt11031 && arg1 < this.anInt11045 && local278 >= this.anInt11029 && local278 < this.anInt11024 && arg7 < local149) {
							this.anIntArray785[local278 + arg1 * this.anInt11043] = arg4;
						}
						arg0 += local178;
						arg1++;
						local35 = arg7 + local260;
						arg7 = local35 % local31;
					}
				} else {
					local362 = ((arg4 & 0xFF00FF) * local182 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local182 >> 8 & 0xFF00) + (local182 << 24);
					local278 = 256 - local182;
					while (arg1 <= local229) {
						local371 = arg0 >> 16;
						if (arg1 >= this.anInt11031 && arg1 < this.anInt11045 && local371 >= this.anInt11029 && local371 < this.anInt11024 && arg7 < local149) {
							local405 = local371 + arg1 * this.anInt11043;
							local410 = this.anIntArray785[local405];
							@Pc(773) int local773 = ((local410 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local410 & 0xFF00) * local278 >> 8 & 0xFF00);
							this.anIntArray785[local371 + arg1 * this.anInt11043] = local362 + local773;
						}
						arg0 += local178;
						arg1++;
						local35 = arg7 + local260;
						arg7 = local35 % local31;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method9424(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local31 = arg5 + arg6;
			local35 = arg7 % local31;
			local35 = local31 + arg5 - local35 - (-arg3 + 1) % local31;
			arg7 = local35 % local31;
			if (arg7 < 0) {
				arg7 += local31;
			}
			this.method9424(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!wda", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass58_Sub1_3.aFloat51 * (float) arg0 + this.aClass58_Sub1_3.aFloat49 * (float) arg1 + this.aClass58_Sub1_3.aFloat54 * (float) arg2 + this.aClass58_Sub1_3.aFloat53;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass58_Sub1_3.aFloat51 * (float) arg3 + this.aClass58_Sub1_3.aFloat49 * (float) arg4 + this.aClass58_Sub1_3.aFloat54 * (float) arg5 + this.aClass58_Sub1_3.aFloat53;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt11028 && local57 < (float) this.anInt11028) {
			local1 |= 0x10;
		} else if (local26 > (float) this.anInt11035 && local57 > (float) this.anInt11035) {
			local1 |= 0x20;
		}
		@Pc(132) int local132 = (int) ((float) this.anInt11046 * (this.aClass58_Sub1_3.aFloat55 * (float) arg0 + this.aClass58_Sub1_3.aFloat52 * (float) arg1 + this.aClass58_Sub1_3.aFloat56 * (float) arg2 + this.aClass58_Sub1_3.aFloat48) / local26);
		@Pc(164) int local164 = (int) ((float) this.anInt11046 * (this.aClass58_Sub1_3.aFloat55 * (float) arg3 + this.aClass58_Sub1_3.aFloat52 * (float) arg4 + this.aClass58_Sub1_3.aFloat56 * (float) arg5 + this.aClass58_Sub1_3.aFloat48) / local57);
		if (local132 < this.anInt11033 && local164 < this.anInt11033) {
			local1 |= 0x1;
		} else if (local132 > this.anInt11025 && local164 > this.anInt11025) {
			local1 |= 0x2;
		}
		@Pc(225) int local225 = (int) ((float) this.anInt11030 * (this.aClass58_Sub1_3.aFloat45 * (float) arg0 + this.aClass58_Sub1_3.aFloat47 * (float) arg1 + this.aClass58_Sub1_3.aFloat46 * (float) arg2 + this.aClass58_Sub1_3.aFloat50) / local26);
		@Pc(257) int local257 = (int) ((float) this.anInt11030 * (this.aClass58_Sub1_3.aFloat45 * (float) arg3 + this.aClass58_Sub1_3.aFloat47 * (float) arg4 + this.aClass58_Sub1_3.aFloat46 * (float) arg5 + this.aClass58_Sub1_3.aFloat50) / local57);
		if (local225 < this.anInt11040 && local257 < this.anInt11040) {
			local1 |= 0x4;
		} else if (local225 > this.anInt11021 && local257 > this.anInt11021) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method9419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface4_14.method5761(arg6).aBoolean761) {
			this.method9414(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt11049 != arg6) {
			@Pc(33) Class178 local33 = (Class178) this.aClass307_96.method7002((long) arg6);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method9417(arg6);
				if (local39 == null) {
					return;
				}
				@Pc(53) int local53 = this.method9420(arg6) ? 64 : this.anInt11042;
				local33 = this.method9367(local39, local53, local53, local53);
				this.aClass307_96.method7000(local33, (long) arg6);
			}
			this.anInt11049 = arg6;
			this.aClass178_33 = local33;
		}
		((Class178_Sub1) this.aClass178_33).method7642(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "(II)I")
	@Override
	public int method9375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(Z)V")
	@Override
	public void method9374(@OriginalArg(0) boolean arg0) {
		this.aBoolean747 = arg0;
		this.aClass307_95.method7006();
	}

	@OriginalMember(owner = "client!wda", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt11031 || arg1 >= this.anInt11045) {
			return;
		}
		if (arg0 < this.anInt11029) {
			arg2 -= this.anInt11029 - arg0;
			arg0 = this.anInt11029;
		}
		if (arg0 + arg2 > this.anInt11024) {
			arg2 = this.anInt11024 - arg0;
		}
		@Pc(43) int local43 = arg0 + arg1 * this.anInt11043;
		@Pc(47) int local47 = arg3 >>> 24;
		@Pc(61) int local61;
		if (arg4 == 0 || arg4 == 1 && local47 == 255) {
			for (local61 = 0; local61 < arg2; local61++) {
				this.anIntArray785[local43 + local61] = arg3;
			}
			return;
		}
		@Pc(108) int local108;
		@Pc(116) int local116;
		if (arg4 == 1) {
			@Pc(102) int local102 = ((arg3 & 0xFF00FF) * local47 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local47 >> 8 & 0xFF00) + (local47 << 24);
			local61 = 256 - local47;
			for (local108 = 0; local108 < arg2; local108++) {
				local116 = this.anIntArray785[local43 + local108];
				local116 = ((local116 & 0xFF00FF) * local61 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local61 >> 8 & 0xFF00);
				this.anIntArray785[local43 + local108] = local102 + local116;
			}
		} else if (arg4 == 2) {
			for (local61 = 0; local61 < arg2; local61++) {
				local108 = this.anIntArray785[local43 + local61];
				local116 = arg3 + local108;
				@Pc(176) int local176 = (arg3 & 0xFF00FF) + (local108 & 0xFF00FF);
				@Pc(186) int local186 = (local176 & 0x1000100) + (local116 - local176 & 0x10000);
				this.anIntArray785[local43 + local61] = local116 - local186 | local186 - (local186 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wda", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass58_Sub1_3.aFloat51 * (float) arg0 + this.aClass58_Sub1_3.aFloat49 * (float) arg1 + this.aClass58_Sub1_3.aFloat54 * (float) arg2 + this.aClass58_Sub1_3.aFloat53;
		@Pc(49) float local49 = this.aClass58_Sub1_3.aFloat51 * (float) arg3 + this.aClass58_Sub1_3.aFloat49 * (float) arg4 + this.aClass58_Sub1_3.aFloat54 * (float) arg5 + this.aClass58_Sub1_3.aFloat53;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt11028 && local49 < (float) this.anInt11028) {
			local51 |= 0x10;
		} else if (local24 > (float) this.anInt11035 && local49 > (float) this.anInt11035) {
			local51 |= 0x20;
		}
		@Pc(121) int local121 = (int) ((float) this.anInt11046 * (this.aClass58_Sub1_3.aFloat55 * (float) arg0 + this.aClass58_Sub1_3.aFloat52 * (float) arg1 + this.aClass58_Sub1_3.aFloat56 * (float) arg2 + this.aClass58_Sub1_3.aFloat48) / (float) arg6);
		@Pc(154) int local154 = (int) ((float) this.anInt11046 * (this.aClass58_Sub1_3.aFloat55 * (float) arg3 + this.aClass58_Sub1_3.aFloat52 * (float) arg4 + this.aClass58_Sub1_3.aFloat56 * (float) arg5 + this.aClass58_Sub1_3.aFloat48) / (float) arg6);
		if (local121 < this.anInt11033 && local154 < this.anInt11033) {
			local51 |= 0x1;
		} else if (local121 > this.anInt11025 && local154 > this.anInt11025) {
			local51 |= 0x2;
		}
		@Pc(216) int local216 = (int) ((float) this.anInt11030 * (this.aClass58_Sub1_3.aFloat45 * (float) arg0 + this.aClass58_Sub1_3.aFloat47 * (float) arg1 + this.aClass58_Sub1_3.aFloat46 * (float) arg2 + this.aClass58_Sub1_3.aFloat50) / (float) arg6);
		@Pc(249) int local249 = (int) ((float) this.anInt11030 * (this.aClass58_Sub1_3.aFloat45 * (float) arg3 + this.aClass58_Sub1_3.aFloat47 * (float) arg4 + this.aClass58_Sub1_3.aFloat46 * (float) arg5 + this.aClass58_Sub1_3.aFloat50) / (float) arg6);
		if (local216 < this.anInt11040 && local249 < this.anInt11040) {
			local51 |= 0x4;
		} else if (local216 > this.anInt11021 && local249 > this.anInt11021) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method9331(@OriginalArg(0) Class3_Sub16 arg0) {
	}

	@OriginalMember(owner = "client!wda", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass58_Sub1_3.aFloat53 + this.aClass58_Sub1_3.aFloat51 * (float) arg0 + this.aClass58_Sub1_3.aFloat49 * (float) arg1 + this.aClass58_Sub1_3.aFloat54 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(74) int local74 = (int) ((float) this.anInt11046 * (this.aClass58_Sub1_3.aFloat48 + this.aClass58_Sub1_3.aFloat55 * (float) arg0 + this.aClass58_Sub1_3.aFloat52 * (float) arg1 + this.aClass58_Sub1_3.aFloat56 * (float) arg2) / local24);
		@Pc(106) int local106 = (int) ((float) this.anInt11030 * (this.aClass58_Sub1_3.aFloat50 + this.aClass58_Sub1_3.aFloat45 * (float) arg0 + this.aClass58_Sub1_3.aFloat47 * (float) arg1 + this.aClass58_Sub1_3.aFloat46 * (float) arg2) / local24);
		arg3[0] = local74 - this.anInt11033;
		arg3[1] = local106 - this.anInt11040;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!wda", name = "o", descriptor = "(I)Z")
	public boolean method9420(@OriginalArg(0) int arg0) {
		return this.aBoolean747 || super.anInterface4_14.method5761(arg0).aBoolean762;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method9347(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas13 = null;
			this.aClass3_Sub15_1 = null;
			if (this.aClass256_1 == null) {
				this.anIntArray785 = null;
				this.anInt11043 = this.anInt11037 = 1;
				this.anInt11039 = this.anInt11047 = 1;
				this.method9421();
			}
			return;
		}
		@Pc(10) Class3_Sub15 local10 = (Class3_Sub15) this.aClass313_45.method7104((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas13 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.anInt11019 = local18.width;
		this.anInt11017 = local18.height;
		this.aClass3_Sub15_1 = local10;
		if (this.aClass256_1 != null) {
			return;
		}
		this.anIntArray785 = local10.anIntArray488;
		this.anInt11043 = local10.anInt6369;
		this.anInt11037 = local10.anInt6370;
		if (this.anInt11043 != this.anInt11039 || this.anInt11037 != this.anInt11047) {
			this.anInt11020 = this.anInt11039 = this.anInt11043;
			this.anInt11022 = this.anInt11047 = this.anInt11037;
			this.aFloatArray84 = this.aFloatArray85 = new float[this.anInt11039 * this.anInt11047];
		}
		this.method9421();
		return;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIZ)Lclient!kw;")
	@Override
	public Class178 method9361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class178_Sub1_Sub2(this, arg0, arg1) : new Class178_Sub1_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method9401(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub15 local8 = (Class3_Sub15) this.aClass313_45.method7104((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method9596();
		local8 = Static211.method9047(arg1, arg0, arg2);
		this.aClass313_45.method7107((long) arg0.hashCode(), local8);
		if (this.aCanvas13 != arg0 || this.aClass256_1 != null) {
			return;
		}
		@Pc(39) Dimension local39 = arg0.getSize();
		this.anInt11019 = local39.width;
		this.anInt11017 = local39.height;
		this.aClass3_Sub15_1 = local8;
		this.anIntArray785 = local8.anIntArray488;
		this.anInt11043 = local8.anInt6369;
		this.anInt11037 = local8.anInt6370;
		if (this.anInt11043 != this.anInt11039 || this.anInt11037 != this.anInt11047) {
			this.anInt11020 = this.anInt11039 = this.anInt11043;
			this.anInt11022 = this.anInt11047 = this.anInt11037;
			this.aFloatArray84 = this.aFloatArray85 = new float[this.anInt11039 * this.anInt11047];
		}
		this.method9421();
	}

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "(II)Lclient!es;")
	@Override
	public Interface8 method9383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class16(arg0, arg1);
	}

	@OriginalMember(owner = "client!wda", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt11043, this.anInt11037, arg0, 0);
	}

	@OriginalMember(owner = "client!wda", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt11029;
		arg0[1] = this.anInt11031;
		arg0[2] = this.anInt11024;
		arg0[3] = this.anInt11045;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method9385(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas13 == null || this.aClass3_Sub15_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(19) Graphics local19 = this.aCanvas13.getGraphics();
			for (@Pc(21) int local21 = 0; local21 < arg1; local21++) {
				@Pc(26) Rectangle local26 = arg0[local21];
				if (local26.x + arg2 <= this.anInt11043 && local26.y + arg3 <= this.anInt11037 && local26.x + arg2 + local26.width > 0 && local26.y + arg3 + local26.height > 0) {
					this.aClass3_Sub15_1.method5522(local26.x + arg2, local26.y, local19, local26.x, local26.y + arg3, local26.height, local26.width);
				}
			}
		} catch (@Pc(91) Exception local91) {
			this.aCanvas13.repaint();
		}
	}

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "()Z")
	@Override
	public boolean method9323() {
		return false;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!ih;Lclient!ih;FLclient!ih;)Lclient!ih;")
	@Override
	public Class113 method9334(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class113 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!wda", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt11029) {
			arg2 -= this.anInt11029 - arg0;
			arg0 = this.anInt11029;
		}
		if (arg1 < this.anInt11031) {
			arg3 -= this.anInt11031 - arg1;
			arg1 = this.anInt11031;
		}
		if (arg0 + arg2 > this.anInt11024) {
			arg2 = this.anInt11024 - arg0;
		}
		if (arg1 + arg3 > this.anInt11045) {
			arg3 = this.anInt11045 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt11024 || arg1 > this.anInt11045) {
			return;
		}
		@Pc(74) int local74 = this.anInt11043 - arg2;
		@Pc(81) int local81 = arg0 + arg1 * this.anInt11043;
		@Pc(85) int local85 = arg4 >>> 24;
		@Pc(101) int local101;
		@Pc(105) int local105;
		@Pc(112) int local112;
		if (arg5 != 0 && (arg5 != 1 || local85 != 255)) {
			@Pc(231) int local231;
			if (arg5 == 1) {
				@Pc(215) int local215 = ((arg4 & 0xFF00FF) * local85 >> 8 & 0xFF00FF) + (((arg4 & 0xFF00FF00) >>> 8) * local85 & 0xFF00FF00);
				local101 = 256 - local85;
				for (local105 = 0; local105 < arg3; local105++) {
					for (local112 = -arg2; local112 < 0; local112++) {
						local231 = this.anIntArray785[local81];
						local231 = ((local231 & 0xFF00FF) * local101 >> 8 & 0xFF00FF) + (((local231 & 0xFF00FF00) >>> 8) * local101 & 0xFF00FF00);
						this.anIntArray785[local81++] = local215 + local231;
					}
					local81 += local74;
				}
			} else if (arg5 == 2) {
				for (local101 = 0; local101 < arg3; local101++) {
					for (local105 = -arg2; local105 < 0; local105++) {
						local112 = this.anIntArray785[local81];
						local231 = arg4 + local112;
						@Pc(299) int local299 = (arg4 & 0xFF00FF) + (local112 & 0xFF00FF);
						@Pc(309) int local309 = (local299 & 0x1000100) + (local231 - local299 & 0x10000);
						this.anIntArray785[local81++] = local231 - local309 | local309 - (local309 >>> 8);
					}
					local81 += local74;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local101 = arg2 >> 3;
		local105 = arg2 & 0x7;
		arg2 = local81 - 1;
		for (local112 = -arg3; local112 < 0; local112++) {
			if (local101 > 0) {
				arg0 = local101;
				do {
					arg2++;
					this.anIntArray785[arg2] = arg4;
					arg2++;
					this.anIntArray785[arg2] = arg4;
					arg2++;
					this.anIntArray785[arg2] = arg4;
					arg2++;
					this.anIntArray785[arg2] = arg4;
					arg2++;
					this.anIntArray785[arg2] = arg4;
					arg2++;
					this.anIntArray785[arg2] = arg4;
					arg2++;
					this.anIntArray785[arg2] = arg4;
					arg2++;
					this.anIntArray785[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local105 > 0) {
				arg0 = local105;
				do {
					arg2++;
					this.anIntArray785[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local74;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "()V")
	@Override
	public void method9396() {
	}

	@OriginalMember(owner = "client!wda", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt11023 = (int) (arg1 * 65535.0F);
		this.anInt11041 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt11048 = (int) (arg3 * 65535.0F / local26);
		this.anInt11026 = (int) (arg4 * 65535.0F / local26);
		this.lb = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub16 method9329(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt11028;
	}

	@OriginalMember(owner = "client!wda", name = "y", descriptor = "()V")
	@Override
	protected void method9339() {
		if (this.aBoolean745) {
			Static134.method2374(true, false);
			this.aBoolean745 = false;
		}
		this.aClass3_Sub15_1 = null;
		this.aCanvas13 = null;
		this.anInt11019 = 0;
		this.anInt11017 = 0;
		this.aClass313_45 = null;
		this.aBoolean746 = true;
	}

	@OriginalMember(owner = "client!wda", name = "s", descriptor = "()Z")
	@Override
	public boolean method9346() {
		return false;
	}

	@OriginalMember(owner = "client!wda", name = "C", descriptor = "()V")
	private void method9421() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt11044; local1++) {
			this.aClass239Array1[local1].method5319();
		}
		this.la();
	}

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "(I)V")
	@Override
	public void method9338(@OriginalArg(0) int arg0) {
		this.anInt11042 = arg0;
		this.aClass307_95.method7006();
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIIII)V")
	private void method9422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt11031 || arg1 >= this.anInt11045) {
			return;
		}
		@Pc(18) int local18 = arg0 + arg1 * this.anInt11043;
		@Pc(22) int local22 = arg3 >>> 24;
		@Pc(26) int local26 = arg4 + arg5;
		@Pc(30) int local30 = arg6 % local26;
		@Pc(44) int local44;
		if (local22 == 255 && true) {
			local44 = 0;
			while (local44 < arg2) {
				if (arg0 + local44 >= this.anInt11029 && arg0 + local44 < this.anInt11024 && local30 < arg4) {
					this.anIntArray785[local18 + local44] = arg3;
				}
				local44++;
				local30++;
				local30 %= local26;
			}
			return;
		}
		@Pc(111) int local111 = ((arg3 & 0xFF00FF) * local22 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local22 >> 8 & 0xFF00) + (local22 << 24);
		local44 = 256 - local22;
		@Pc(117) int local117 = 0;
		while (local117 < arg2) {
			if (arg0 + local117 >= this.anInt11029 && arg0 + local117 < this.anInt11024 && local30 < arg4) {
				@Pc(144) int local144 = this.anIntArray785[local18 + local117];
				@Pc(164) int local164 = ((local144 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((local144 & 0xFF00) * local44 >> 8 & 0xFF00);
				this.anIntArray785[local18 + local117] = local111 + local164;
			}
			local117++;
			local30++;
			local30 %= local26;
		}
	}

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "(II)I")
	@Override
	public int method9324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!si;Lclient!es;)Lclient!vv;")
	@Override
	public Interface25 method9359(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) Interface8 arg1) {
		return new Class256(this, (Class178) arg0, (Class16) arg1);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(FFF)V")
	@Override
	public void method9344(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method9377() {
		@Pc(3) Class239 local3 = this.method9423(Thread.currentThread());
		@Pc(6) Class166 local6 = local3.aClass166_2;
		local6.aBoolean252 = false;
		@Pc(14) int local14 = 5 - this.anInt11033;
		@Pc(19) int local19 = 75 - this.anInt11033;
		@Pc(24) int local24 = 15 - this.anInt11033;
		@Pc(29) int local29 = 10 - this.anInt11040;
		@Pc(34) int local34 = 50 - this.anInt11040;
		@Pc(39) int local39 = 90 - this.anInt11040;
		local6.aBoolean251 = local14 < 0 || local14 > local6.anInt3977 || local19 < 0 || local19 > local6.anInt3977 || local24 < 0 || local24 > local6.anInt3977;
		if (255 == 255 && true) {
			local6.anInt3978 = 0;
			local6.aBoolean255 = false;
			local6.method3599((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		} else {
			local6.anInt3978 = 0;
			local6.aBoolean255 = false;
			local6.method3599((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		}
		local6.aBoolean252 = true;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIZ)Lclient!kw;")
	@Override
	public Class178 method9356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt11043 + arg0;
		@Pc(16) int local16 = this.anInt11043 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray785[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class178_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class178_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!wda", name = "p", descriptor = "()Z")
	@Override
	public boolean method9408() {
		return false;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!hw;[Lclient!tm;Z)Lclient!da;")
	@Override
	public Class57 method9353(@OriginalArg(0) Class169 arg0, @OriginalArg(1) Class361[] arg1, @OriginalArg(2) boolean arg2) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt9706;
			local7[local11] = arg1[local11].anInt9707;
			if (arg1[local11].aByteArray91 != null) {
				local9 = true;
			}
		}
		if (arg2) {
			if (local9) {
				return new Class57_Sub1(this, arg0, arg1, local3, local7);
			} else {
				return new Class57_Sub5(this, arg0, arg1, local3, local7);
			}
		} else if (local9) {
			throw new IllegalArgumentException("");
		} else {
			return new Class57_Sub4(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!wda", name = "A", descriptor = "()Lclient!cl;")
	@Override
	public Class58 method9376() {
		return new Class58_Sub1();
	}

	@OriginalMember(owner = "client!wda", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt11043 + arg0;
		@Pc(13) int local13 = arg1 * this.anInt11039 + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(24) int[] local24 = this.anIntArray785;
		@Pc(27) float[] local27 = this.aFloatArray85;
		@Pc(34) int local34;
		if (local6 < 0) {
			local34 = local24.length + local6;
			Static732.method6321(local24, -local6, local24, 0, local34);
		} else if (local6 > 0) {
			local34 = local24.length - local6;
			Static732.method6321(local24, 0, local24, local6, local34);
		}
		if (local13 < 0) {
			local34 = local27.length + local13;
			Static732.method6315(local27, -local13, local27, 0, local34);
		} else if (local13 > 0) {
			local34 = local27.length - local13;
			Static732.method6315(local27, 0, local27, local13, local34);
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!lw;")
	public Class239 method9423(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt11044; local1++) {
			if (this.aClass239Array1[local1].aRunnable2 == arg0) {
				return this.aClass239Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(IIIIIIII)V")
	private void method9424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt11029 || arg0 >= this.anInt11024) {
			return;
		}
		@Pc(18) int local18 = arg0 + arg1 * this.anInt11043;
		@Pc(22) int local22 = arg3 >>> 24;
		@Pc(26) int local26 = arg4 + arg5;
		@Pc(30) int local30 = arg6 % local26;
		@Pc(44) int local44;
		if (local22 == 255 && true) {
			local44 = 0;
			while (local44 < arg2) {
				if (arg1 + local44 >= this.anInt11031 && arg1 + local44 < this.anInt11045 && local30 < arg4) {
					this.anIntArray785[local18 + local44 * this.anInt11043] = arg3;
				}
				local44++;
				local30++;
				local30 %= local26;
			}
			return;
		}
		@Pc(114) int local114 = ((arg3 & 0xFF00FF) * local22 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local22 >> 8 & 0xFF00) + (local22 << 24);
		local44 = 256 - local22;
		@Pc(120) int local120 = 0;
		while (local120 < arg2) {
			if (arg1 + local120 >= this.anInt11031 && arg1 + local120 < this.anInt11045 && local30 < arg4) {
				@Pc(147) int local147 = local18 + local120 * this.anInt11043;
				@Pc(152) int local152 = this.anIntArray785[local147];
				@Pc(172) int local172 = ((local152 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((local152 & 0xFF00) * local44 >> 8 & 0xFF00);
				this.anIntArray785[local147] = local114 + local172;
			}
			local120++;
			local30++;
			local30 %= local26;
		}
	}

	@OriginalMember(owner = "client!wda", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.anInt11032;
		this.anInt11032 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!wda", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray73;
		@Pc(8) int[] local8 = local2.anIntArray74;
		@Pc(20) int local20;
		if (this.anInt11045 < arg3 + local5.length) {
			local20 = this.anInt11045 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt11031 > arg3) {
			local33 = this.anInt11031 - arg3;
			arg3 = this.anInt11031;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(50) int local50 = arg3 * this.anInt11043;
		for (@Pc(52) int local52 = local33; local52 < local20; local52++) {
			@Pc(59) int local59 = arg2 + local5[local52];
			@Pc(63) int local63 = local8[local52];
			if (this.anInt11029 > local59) {
				local63 -= this.anInt11029 - local59;
				local59 = this.anInt11029;
			}
			if (this.anInt11024 < local59 + local63) {
				local63 = this.anInt11024 - local59;
			}
			local59 += local50;
			for (@Pc(95) int local95 = -local63; local95 < 0; local95++) {
				this.anIntArray785[local59++] = arg0;
			}
			local50 += this.anInt11043;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(I[Lclient!jw;)V")
	@Override
	public void method9350(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub5[] arg1) {
	}

	@OriginalMember(owner = "client!wda", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt11034, this.anInt11038, this.anInt11046, this.anInt11030 };
	}

	@OriginalMember(owner = "client!wda", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt11034 = arg0;
		this.anInt11038 = arg1;
		this.anInt11046 = arg2;
		this.anInt11030 = arg3;
		this.method9418();
	}

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class239 local3 = this.method9423(Thread.currentThread());
		this.anInt11028 = arg0;
		this.anInt11035 = arg1;
		local3.anInt6098 = this.anInt11035 - 255;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)V")
	@Override
	public void method9373(@OriginalArg(0) int arg0) {
		this.anInt11044 = arg0;
		this.aClass239Array1 = new Class239[this.anInt11044];
		for (@Pc(9) int local9 = 0; local9 < this.anInt11044; local9++) {
			this.aClass239Array1[local9] = new Class239(this);
		}
	}

	@OriginalMember(owner = "client!wda", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt11043 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray785[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!wda", name = "m", descriptor = "()Lclient!an;")
	@Override
	public Class19 method9364() {
		return new Class19(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method9403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!wda", name = "n", descriptor = "()Lclient!cl;")
	@Override
	public Class58 method9354() {
		@Pc(3) Class239 local3 = this.method9423(Thread.currentThread());
		return local3.aClass58_Sub1_2;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(II)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas13 == null || this.aClass3_Sub15_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(19) Graphics local19 = this.aCanvas13.getGraphics();
			this.aClass3_Sub15_1.method5522(arg0, 0, local19, 0, arg1, this.anInt11017, this.anInt11019);
		} catch (@Pc(34) Exception local34) {
			this.aCanvas13.repaint();
		}
	}

	@OriginalMember(owner = "client!wda", name = "z", descriptor = "()V")
	@Override
	public void method9389() {
	}

	@OriginalMember(owner = "client!wda", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt11029 = 0;
		this.anInt11031 = 0;
		this.anInt11024 = this.anInt11043;
		this.anInt11045 = this.anInt11037;
		this.method9418();
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.anInt11039 - arg2;
		@Pc(11) int local11 = arg1 * this.anInt11039 + arg0;
		@Pc(14) float[] local14 = this.aFloatArray85;
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

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "()V")
	@Override
	public void method9345() {
	}

	@OriginalMember(owner = "client!wda", name = "r", descriptor = "()Z")
	@Override
	public boolean method9406() {
		return true;
	}

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "()Z")
	public boolean method9425() {
		return this.aBoolean746;
	}

	@OriginalMember(owner = "client!wda", name = "q", descriptor = "()Z")
	@Override
	public boolean method9380() {
		return false;
	}

	@OriginalMember(owner = "client!wda", name = "B", descriptor = "()V")
	@Override
	public void method9372() {
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!gt;IIII)Lclient!ka;")
	@Override
	public Class170 method9382(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class170_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!wda", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass58_Sub1_3.aFloat53 + this.aClass58_Sub1_3.aFloat51 * (float) arg0 + this.aClass58_Sub1_3.aFloat49 * (float) arg1 + this.aClass58_Sub1_3.aFloat54 * (float) arg2;
		if (local24 < (float) this.anInt11028 || local24 > (float) this.anInt11035) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(84) int local84 = (int) ((float) this.anInt11046 * (this.aClass58_Sub1_3.aFloat48 + this.aClass58_Sub1_3.aFloat55 * (float) arg0 + this.aClass58_Sub1_3.aFloat52 * (float) arg1 + this.aClass58_Sub1_3.aFloat56 * (float) arg2) / local24);
		@Pc(116) int local116 = (int) ((float) this.anInt11030 * (this.aClass58_Sub1_3.aFloat50 + this.aClass58_Sub1_3.aFloat45 * (float) arg0 + this.aClass58_Sub1_3.aFloat47 * (float) arg1 + this.aClass58_Sub1_3.aFloat46 * (float) arg2) / local24);
		if (local84 >= this.anInt11033 && local84 <= this.anInt11025 && local116 >= this.anInt11040 && local116 <= this.anInt11021) {
			arg3[0] = local84 - this.anInt11033;
			arg3[1] = local116 - this.anInt11040;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!wda", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt11027;
		this.anInt11027 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!wda", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt11029 || arg0 >= this.anInt11024) {
			return;
		}
		if (arg1 < this.anInt11031) {
			arg2 -= this.anInt11031 - arg1;
			arg1 = this.anInt11031;
		}
		if (arg1 + arg2 > this.anInt11045) {
			arg2 = this.anInt11045 - arg1;
		}
		@Pc(43) int local43 = arg0 + arg1 * this.anInt11043;
		@Pc(47) int local47 = arg3 >>> 24;
		@Pc(61) int local61;
		if (arg4 == 0 || arg4 == 1 && local47 == 255) {
			for (local61 = 0; local61 < arg2; local61++) {
				this.anIntArray785[local43 + local61 * this.anInt11043] = arg3;
			}
			return;
		}
		@Pc(111) int local111;
		@Pc(119) int local119;
		@Pc(124) int local124;
		if (arg4 == 1) {
			@Pc(105) int local105 = ((arg3 & 0xFF00FF) * local47 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local47 >> 8 & 0xFF00) + (local47 << 24);
			local61 = 256 - local47;
			for (local111 = 0; local111 < arg2; local111++) {
				local119 = local43 + local111 * this.anInt11043;
				local124 = this.anIntArray785[local119];
				local124 = ((local124 & 0xFF00FF) * local61 >> 8 & 0xFF00FF) + ((local124 & 0xFF00) * local61 >> 8 & 0xFF00);
				this.anIntArray785[local119] = local105 + local124;
			}
		} else if (arg4 == 2) {
			for (local61 = 0; local61 < arg2; local61++) {
				local111 = local43 + local61 * this.anInt11043;
				local119 = this.anIntArray785[local111];
				local124 = arg3 + local119;
				@Pc(187) int local187 = (arg3 & 0xFF00FF) + (local119 & 0xFF00FF);
				@Pc(197) int local197 = (local187 & 0x1000100) + (local124 - local187 & 0x10000);
				this.anIntArray785[local111] = local124 - local197 | local197 - (local197 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)V")
	@Override
	public void method9393(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lclient!ih;)V")
	@Override
	public void method9333(@OriginalArg(0) Class113 arg0) {
	}

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "()Z")
	@Override
	public boolean method9392() {
		return false;
	}
}
