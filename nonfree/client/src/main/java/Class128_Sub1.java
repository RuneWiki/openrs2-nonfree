import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class128_Sub1 extends Class128 {

	@OriginalMember(owner = "client!js", name = "q", descriptor = "Z")
	private boolean aBoolean239;

	@OriginalMember(owner = "client!js", name = "r", descriptor = "Lclient!wa;")
	private Class257 aClass257_14;

	@OriginalMember(owner = "client!js", name = "s", descriptor = "Z")
	private boolean aBoolean240;

	@OriginalMember(owner = "client!js", name = "t", descriptor = "I")
	private int anInt3189;

	@OriginalMember(owner = "client!js", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!js", name = "v", descriptor = "Lclient!ab;")
	private Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!js", name = "w", descriptor = "Z")
	public boolean aBoolean241;

	@OriginalMember(owner = "client!js", name = "x", descriptor = "Lclient!cm;")
	public Class40_Sub1 aClass40_Sub1_1;

	@OriginalMember(owner = "client!js", name = "y", descriptor = "I")
	public int anInt3190;

	@OriginalMember(owner = "client!js", name = "z", descriptor = "I")
	private int anInt3191;

	@OriginalMember(owner = "client!js", name = "A", descriptor = "I")
	public int anInt3192;

	@OriginalMember(owner = "client!js", name = "B", descriptor = "I")
	public int anInt3193;

	@OriginalMember(owner = "client!js", name = "C", descriptor = "I")
	private int anInt3194;

	@OriginalMember(owner = "client!js", name = "D", descriptor = "I")
	public int anInt3195;

	@OriginalMember(owner = "client!js", name = "E", descriptor = "I")
	public int anInt3196;

	@OriginalMember(owner = "client!js", name = "F", descriptor = "I")
	public int anInt3197;

	@OriginalMember(owner = "client!js", name = "G", descriptor = "I")
	public int anInt3198;

	@OriginalMember(owner = "client!js", name = "H", descriptor = "I")
	public int anInt3199;

	@OriginalMember(owner = "client!js", name = "I", descriptor = "I")
	public int anInt3200;

	@OriginalMember(owner = "client!js", name = "J", descriptor = "I")
	public int anInt3201;

	@OriginalMember(owner = "client!js", name = "K", descriptor = "I")
	public int anInt3202;

	@OriginalMember(owner = "client!js", name = "L", descriptor = "I")
	public int anInt3203;

	@OriginalMember(owner = "client!js", name = "M", descriptor = "Lclient!ng;")
	private final Class167 aClass167_51;

	@OriginalMember(owner = "client!js", name = "N", descriptor = "I")
	public int anInt3204;

	@OriginalMember(owner = "client!js", name = "O", descriptor = "Z")
	public boolean aBoolean242;

	@OriginalMember(owner = "client!js", name = "P", descriptor = "F")
	private float aFloat44;

	@OriginalMember(owner = "client!js", name = "Q", descriptor = "I")
	public int anInt3205;

	@OriginalMember(owner = "client!js", name = "R", descriptor = "F")
	private float aFloat45;

	@OriginalMember(owner = "client!js", name = "S", descriptor = "I")
	private int anInt3206;

	@OriginalMember(owner = "client!js", name = "T", descriptor = "I")
	public int anInt3207;

	@OriginalMember(owner = "client!js", name = "U", descriptor = "I")
	public int anInt3208;

	@OriginalMember(owner = "client!js", name = "V", descriptor = "I")
	public int anInt3209;

	@OriginalMember(owner = "client!js", name = "W", descriptor = "I")
	public int anInt3210;

	@OriginalMember(owner = "client!js", name = "X", descriptor = "I")
	public int anInt3211;

	@OriginalMember(owner = "client!js", name = "Y", descriptor = "I")
	public int anInt3212;

	@OriginalMember(owner = "client!js", name = "Z", descriptor = "I")
	public int anInt3213;

	@OriginalMember(owner = "client!js", name = "ab", descriptor = "I")
	public int anInt3214;

	@OriginalMember(owner = "client!js", name = "bb", descriptor = "Z")
	private boolean aBoolean243;

	@OriginalMember(owner = "client!js", name = "cb", descriptor = "I")
	public int anInt3215;

	@OriginalMember(owner = "client!js", name = "db", descriptor = "[I")
	public int[] anIntArray173;

	@OriginalMember(owner = "client!js", name = "eb", descriptor = "Lclient!f;")
	private Class49 aClass49_8;

	@OriginalMember(owner = "client!js", name = "fb", descriptor = "I")
	public int anInt3216;

	@OriginalMember(owner = "client!js", name = "gb", descriptor = "Lclient!ng;")
	private final Class167 aClass167_52;

	@OriginalMember(owner = "client!js", name = "hb", descriptor = "I")
	private int anInt3217;

	@OriginalMember(owner = "client!js", name = "ib", descriptor = "I")
	private int anInt3218;

	@OriginalMember(owner = "client!js", name = "jb", descriptor = "I")
	public int anInt3219;

	@OriginalMember(owner = "client!js", name = "kb", descriptor = "[Lclient!pa;")
	private Class187[] aClass187Array1;

	@OriginalMember(owner = "client!js", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!js", name = "mb", descriptor = "I")
	private int anInt3220;

	@OriginalMember(owner = "client!js", name = "nb", descriptor = "Lclient!f;")
	private Class49 aClass49_9;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;)V")
	public Class128_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface8 arg2) {
		this(arg0, arg2);
		this.method3567(arg1);
		this.method3563(arg1);
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(ILclient!m;)V")
	private Class128_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
		super(arg0, arg1);
		this.aBoolean240 = false;
		this.aBoolean239 = false;
		this.aClass257_14 = new Class257(4);
		this.aBoolean241 = false;
		this.anInt3190 = 3500;
		this.anInt3195 = 0;
		this.anInt3198 = 50;
		this.anInt3202 = 75518;
		this.anInt3204 = 512;
		this.anInt3199 = 512;
		this.anInt3206 = 0;
		this.anInt3201 = 0;
		this.anInt3200 = 0;
		this.anInt3191 = 0;
		this.anInt3205 = 45823;
		this.anInt3208 = 0;
		this.anInt3207 = 0;
		this.anInt3194 = 3500;
		this.aBoolean243 = false;
		this.anInt3213 = 0;
		this.anInt3196 = 78642;
		this.anInt3192 = this.anInt3194 - 255;
		this.anInt3214 = 0;
		this.anInt3218 = 0;
		this.aClass167_52 = new Class167(16);
		this.anInt3220 = -1;
		this.aClass167_51 = new Class167(20);
		this.aClass40_Sub1_1 = new Class40_Sub1();
		this.method3550(1);
		this.method3592(0);
		Static139.method1854(true, false);
		this.aBoolean239 = true;
	}

	@OriginalMember(owner = "client!js", name = "la", descriptor = "()F")
	@Override
	public float la() {
		return this.aFloat44;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "()V")
	@Override
	public void method3535() {
		this.aClass167_51.method3390();
	}

	@OriginalMember(owner = "client!js", name = "q", descriptor = "()V")
	@Override
	protected void method3586() {
		if (this.aBoolean239) {
			Static366.method4763(true, false);
			this.aBoolean239 = false;
		}
		this.aClass1_Sub2_1 = null;
		this.aCanvas6 = null;
		this.aClass257_14 = null;
		this.aBoolean240 = true;
	}

	@OriginalMember(owner = "client!js", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3214 = arg0;
		this.anInt3207 = arg1;
		this.anInt3201 = arg2;
	}

	@OriginalMember(owner = "client!js", name = "o", descriptor = "(FF)V")
	@Override
	public void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat44 = arg0;
		this.aFloat45 = arg1;
		this.method2703();
	}

	@OriginalMember(owner = "client!js", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3191 = this.anInt3207;
		this.anInt3214 = arg0;
		this.anInt3207 = arg1;
		this.anInt3201 = arg2;
		this.aBoolean241 = true;
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(II)I")
	@Override
	public int method3605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!js", name = "d", descriptor = "()I")
	@Override
	public int d() {
		return this.anInt3198;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "()V")
	@Override
	public void method3534() {
		if (this.aCanvas6 == null || this.aClass1_Sub2_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas6.getGraphics();
			this.aClass1_Sub2_1.method5563(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!js", name = "l", descriptor = "()Z")
	@Override
	public boolean method3570() {
		return false;
	}

	@OriginalMember(owner = "client!js", name = "h", descriptor = "(I)Z")
	public boolean method2699(@OriginalArg(0) int arg0) {
		return super.anInterface8_8.method1375(arg0).aBoolean433;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class49 method3564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt3197 + arg0;
		@Pc(16) int local16 = this.anInt3197 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray173[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class49_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class49_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!js", name = "pa", descriptor = "(IIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt3197) {
			arg2 = this.anInt3197;
		}
		if (arg3 > this.anInt3217) {
			arg3 = this.anInt3217;
		}
		this.anInt3213 = arg0;
		this.anInt3200 = arg2;
		this.anInt3208 = arg1;
		this.anInt3195 = arg3;
		this.method2704();
	}

	@OriginalMember(owner = "client!js", name = "NA", descriptor = "(IIIIII)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt3213) {
			arg2 -= this.anInt3213 - arg0;
			arg0 = this.anInt3213;
		}
		if (arg1 < this.anInt3208) {
			arg3 -= this.anInt3208 - arg1;
			arg1 = this.anInt3208;
		}
		if (arg0 + arg2 > this.anInt3200) {
			arg2 = this.anInt3200 - arg0;
		}
		if (arg1 + arg3 > this.anInt3195) {
			arg3 = this.anInt3195 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt3200 || arg1 > this.anInt3195) {
			return;
		}
		@Pc(67) int local67 = this.anInt3197 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt3197;
		@Pc(78) int local78 = arg4 >>> 24;
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(101) int local101;
		if (arg5 != 0 && (arg5 != 1 || local78 != 255)) {
			@Pc(221) int local221;
			if (arg5 == 1) {
				@Pc(205) int local205 = ((arg4 & 0xFF00FF) * local78 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local78 >> 8 & 0xFF00) + (local78 << 24);
				local90 = 256 - local78;
				for (local94 = 0; local94 < arg3; local94++) {
					for (local101 = -arg2; local101 < 0; local101++) {
						local221 = this.anIntArray173[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray173[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray173[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray173[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray173[arg2] = arg4;
					arg2++;
					this.anIntArray173[arg2] = arg4;
					arg2++;
					this.anIntArray173[arg2] = arg4;
					arg2++;
					this.anIntArray173[arg2] = arg4;
					arg2++;
					this.anIntArray173[arg2] = arg4;
					arg2++;
					this.anIntArray173[arg2] = arg4;
					arg2++;
					this.anIntArray173[arg2] = arg4;
					arg2++;
					this.anIntArray173[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray173[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!js", name = "SA", descriptor = "(IIIIII)Z")
	@Override
	public boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass40_Sub1_1.anInt953 * arg0 + this.aClass40_Sub1_1.anInt958 * arg1 + this.aClass40_Sub1_1.anInt955 * arg2 >> 15) + this.aClass40_Sub1_1.anInt957;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass40_Sub1_1.anInt953 * arg3 + this.aClass40_Sub1_1.anInt958 * arg4 + this.aClass40_Sub1_1.anInt955 * arg5 >> 15) + this.aClass40_Sub1_1.anInt957;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt3198 && local52 < this.anInt3198 || !(local23 <= this.anInt3194 || local52 <= this.anInt3194)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt3204 * ((this.aClass40_Sub1_1.anInt960 * arg0 + this.aClass40_Sub1_1.anInt954 * arg1 + this.aClass40_Sub1_1.anInt962 * arg2 >> 15) + this.aClass40_Sub1_1.anInt956) / local23;
		@Pc(133) int local133 = this.anInt3204 * ((this.aClass40_Sub1_1.anInt960 * arg3 + this.aClass40_Sub1_1.anInt954 * arg4 + this.aClass40_Sub1_1.anInt962 * arg5 >> 15) + this.aClass40_Sub1_1.anInt956) / local52;
		if (local104 < this.anInt3212 && local133 < this.anInt3212 || local104 > this.anInt3209 && local133 > this.anInt3209) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt3199 * ((this.aClass40_Sub1_1.anInt961 * arg0 + this.aClass40_Sub1_1.anInt959 * arg1 + this.aClass40_Sub1_1.anInt951 * arg2 >> 15) + this.aClass40_Sub1_1.anInt952) / local23;
			@Pc(209) int local209 = this.anInt3199 * ((this.aClass40_Sub1_1.anInt961 * arg3 + this.aClass40_Sub1_1.anInt959 * arg4 + this.aClass40_Sub1_1.anInt951 * arg5 >> 15) + this.aClass40_Sub1_1.anInt952) / local52;
			return (local180 >= this.lb || local209 >= this.lb) && (local180 <= this.anInt3215 || local209 <= this.anInt3215);
		}
	}

	@OriginalMember(owner = "client!js", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method3599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
			@Pc(204) int local204;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(94) int local94 = arg3 << 16;
				local104 = (int) Math.floor((double) local94 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt3213) {
					arg1 += local104 * (this.anInt3213 - arg0);
					arg0 = this.anInt3213;
				}
				if (arg2 >= this.anInt3200) {
					arg2 = this.anInt3200 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt3208 && local150 < this.anInt3195) {
							this.anIntArray173[arg0 + local150 * this.anInt3197] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt3208 && local213 < this.anInt3195) {
							local228 = arg0 + local213 * this.anInt3197;
							local233 = this.anIntArray173[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray173[local228] = local204 + local233;
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
				if (arg1 < this.anInt3208) {
					arg0 += local104 * (this.anInt3208 - arg1);
					arg1 = this.anInt3208;
				}
				if (arg3 >= this.anInt3195) {
					arg3 = this.anInt3195 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt3213 && local150 < this.anInt3200) {
							this.anIntArray173[local150 + arg1 * this.anInt3197] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt3213 && local213 < this.anInt3200) {
							local228 = local213 + arg1 * this.anInt3197;
							local233 = this.anIntArray173[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray173[local213 + arg1 * this.anInt3197] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.da(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.da(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface8_8.method1375(arg5).aBoolean432) {
			this.O(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt3220 != arg5) {
			@Pc(26) Class49 local26 = (Class49) this.aClass167_52.method3386((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method2706(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method2711(arg5) ? 64 : 128;
				local26 = this.method3572(local32, local43, local43, local43);
				this.aClass167_52.method3392(local26, (long) arg5);
			}
			this.anInt3220 = arg5;
			this.aClass49_9 = local26;
		}
		this.aClass49_9.M(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!js", name = "f", descriptor = "()Z")
	@Override
	public boolean method3545() {
		return false;
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(Z)V")
	@Override
	public void method3598(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V")
	@Override
	public void method3555(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!js", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3207 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt3207 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt3207 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt3207 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt3207 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean242 = false;
		} else {
			this.aBoolean242 = true;
		}
	}

	@OriginalMember(owner = "client!js", name = "y", descriptor = "()Z")
	@Override
	public boolean method3603() {
		return false;
	}

	@OriginalMember(owner = "client!js", name = "e", descriptor = "()V")
	@Override
	public void method3542() {
	}

	@OriginalMember(owner = "client!js", name = "s", descriptor = "()Z")
	@Override
	public boolean method3589() {
		return true;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method3574(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas6 == null || this.aClass1_Sub2_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas6.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt3197 && local21.y <= this.anInt3217 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass1_Sub2_1.method5564(local14, local21.height, local21.x, local21.width, local21.y);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!js", name = "n", descriptor = "()Z")
	@Override
	public boolean method3581() {
		return false;
	}

	@OriginalMember(owner = "client!js", name = "A", descriptor = "()Z")
	public boolean method2701() {
		return this.aBoolean240;
	}

	@OriginalMember(owner = "client!js", name = "ua", descriptor = "(F)V")
	@Override
	public void ua(@OriginalArg(0) float arg0) {
		this.anInt3202 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!tl;)V")
	@Override
	public void method3576(@OriginalArg(0) Class9 arg0) {
	}

	@OriginalMember(owner = "client!js", name = "i", descriptor = "(I)Z")
	public boolean method2702(@OriginalArg(0) int arg0) {
		return super.anInterface8_8.method1376(arg0);
	}

	@OriginalMember(owner = "client!js", name = "S", descriptor = "()V")
	@Override
	public void S() {
		this.anInt3207 = this.anInt3191;
		this.aBoolean241 = false;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class59 method3585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class59_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!js", name = "D", descriptor = "()V")
	private void method2703() {
		if (this.aFloat45 == 0.0F) {
			this.anInt3190 = this.anInt3194;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt3194;
		@Pc(12) float local12 = (float) this.anInt3198;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat44 / (this.aFloat45 + this.aFloat44);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat45;
		this.anInt3190 = (int) (((float) this.anInt3194 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)I")
	@Override
	public int method3554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII)V")
	@Override
	public void method3543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!js", name = "E", descriptor = "()V")
	private void method2704() {
		this.anInt3212 = this.anInt3213 - this.anInt3193;
		this.anInt3209 = this.anInt3200 - this.anInt3193;
		this.lb = this.anInt3208 - this.anInt3211;
		this.anInt3215 = this.anInt3195 - this.anInt3211;
		for (@Pc(29) int local29 = 0; local29 < this.anInt3219; local29++) {
			@Pc(36) Class249 local36 = this.aClass187Array1[local29].aClass249_1;
			local36.anInt6951 = this.anInt3193 - this.anInt3213;
			local36.anInt6952 = this.anInt3211 - this.anInt3208;
			local36.anInt6949 = this.anInt3200 - this.anInt3213;
			local36.anInt6954 = this.anInt3195 - this.anInt3208;
		}
		@Pc(78) int local78 = this.anInt3208 * this.anInt3197 + this.anInt3213;
		for (@Pc(81) int local81 = this.anInt3208; local81 < this.anInt3195; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt3219; local84++) {
				this.aClass187Array1[local84].aClass249_1.anIntArray463[local81 - this.anInt3208] = local78;
			}
			local78 += this.anInt3197;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([Lclient!c;Lclient!po;Lclient!ia;[Lclient!vk;I)V")
	@Override
	public void method3546(@OriginalArg(0) Class33[] arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class13_Sub8[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class33_Sub1[] local3 = new Class33_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class33_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class33_Sub1 local26 = Static407.method5085(this, local3);
		local26.method5081(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!js", name = "B", descriptor = "()Z")
	@Override
	public boolean method3608() {
		return false;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class163 method3560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class163_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!js", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt3208 || arg1 >= this.anInt3195) {
			return;
		}
		if (arg0 < this.anInt3213) {
			arg2 -= this.anInt3213 - arg0;
			arg0 = this.anInt3213;
		}
		if (arg0 + arg2 > this.anInt3200) {
			arg2 = this.anInt3200 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt3197;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray173[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray173[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray173[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray173[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray173[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!js", name = "o", descriptor = "()V")
	@Override
	public void method3582() {
	}

	@OriginalMember(owner = "client!js", name = "r", descriptor = "()Z")
	@Override
	public boolean method3588() {
		return false;
	}

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3578(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas6 == arg0) {
			this.method3563(null);
		}
		@Pc(15) Class1_Sub2 local15 = (Class1_Sub2) this.aClass257_14.method5503((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5617();
		}
	}

	@OriginalMember(owner = "client!js", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt3213 = 0;
		this.anInt3208 = 0;
		this.anInt3200 = this.anInt3197;
		this.anInt3195 = this.anInt3217;
		this.method2704();
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "()Z")
	@Override
	public boolean method3536() {
		return false;
	}

	@OriginalMember(owner = "client!js", name = "j", descriptor = "(ILclient!ea;II)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class59_Sub2 local2 = (Class59_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray247;
		@Pc(8) int[] local8 = local2.anIntArray246;
		@Pc(20) int local20;
		if (this.anInt3195 < arg3 + local5.length) {
			local20 = this.anInt3195 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt3208 > arg3) {
			local33 = this.anInt3208 - arg3;
			arg3 = this.anInt3208;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt3197;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt3213 > local58) {
				local62 -= this.anInt3213 - local58;
				local58 = this.anInt3213;
			}
			if (this.anInt3200 < local58 + local62) {
				local62 = this.anInt3200 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray173[local58++] = arg0;
			}
			local49 += this.anInt3197;
		}
	}

	@OriginalMember(owner = "client!js", name = "u", descriptor = "([I)V")
	@Override
	public void u(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3213;
		arg0[1] = this.anInt3208;
		arg0[2] = this.anInt3200;
		arg0[3] = this.anInt3195;
	}

	@OriginalMember(owner = "client!js", name = "e", descriptor = "(I)V")
	@Override
	public void method3592(@OriginalArg(0) int arg0) {
		this.aClass187Array1[arg0].method3932(Thread.currentThread());
	}

	@OriginalMember(owner = "client!js", name = "w", descriptor = "()F")
	@Override
	public float w() {
		return this.aFloat45;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIF)Lclient!kt;")
	@Override
	public Class1_Sub24 method3577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(IIIIII)Lclient!tl;")
	@Override
	public Class9 method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!ar;III)V")
	public void method2705(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt3239;
		@Pc(6) int local6 = arg3 >> 1;
		if (local2 == -1) {
			this.O(arg1, arg2, local6, arg0.anInt3241, 1);
			return;
		}
		if (this.anInt3220 != local2) {
			@Pc(30) Class49 local30 = (Class49) this.aClass167_52.method3386((long) local2);
			if (local30 == null) {
				@Pc(36) int[] local36 = this.method2706(local2);
				if (local36 == null) {
					return;
				}
				@Pc(46) int local46 = this.method2711(local2) ? 64 : 128;
				local30 = this.method3572(local36, local46, local46, local46);
				this.aClass167_52.method3392(local30, (long) local2);
			}
			this.anInt3220 = local2;
			this.aClass49_9 = local30;
		}
		if (this.aClass49_9.ja() == 64) {
			arg3 <<= 0x1;
			local6 <<= 0x1;
		}
		this.aClass49_9.M(arg1 - local6, arg2 - local6, arg3, arg3, 0, arg0.anInt3241, 1);
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
	@Override
	public void method3544(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt3189;
		for (@Pc(9) Object local9 = this.aClass167_51.method3395(); local9 != null; local9 = this.aClass167_51.method3388()) {
			@Pc(13) Class1_Sub27 local13 = (Class1_Sub27) local9;
			if (local13.aBoolean331) {
				local13.anInt4245 += local4;
				@Pc(27) int local27 = local13.anInt4245 / 20;
				if (local27 > 0) {
					@Pc(36) Class201 local36 = super.anInterface8_8.method1375(local13.anInt4244);
					local13.method3418(local36.aByte60 * local4 * 50 / 1000, local36.aByte59 * local4 * 50 / 1000);
					local13.anInt4245 -= local27 * 20;
				}
				local13.aBoolean331 = false;
			}
		}
		this.anInt3189 = arg0;
		this.aClass167_52.method3384(5);
	}

	@OriginalMember(owner = "client!js", name = "IA", descriptor = "(IIII)[I")
	@Override
	public int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt3197 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray173[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!js", name = "z", descriptor = "()Z")
	@Override
	public boolean method3604() {
		return false;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!vk;I)V")
	@Override
	public void method3541(@OriginalArg(0) Class33[] arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class13_Sub8[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class33_Sub1[] local3 = new Class33_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class33_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class33_Sub1 local26 = Static407.method5085(this, local3);
		local26.method5081(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!js", name = "j", descriptor = "(I)[I")
	private int[] method2706(@OriginalArg(0) int arg0) {
		@Pc(2) Class167 local2 = this.aClass167_51;
		@Pc(12) Class1_Sub27 local12;
		synchronized (this.aClass167_51) {
			local12 = (Class1_Sub27) this.aClass167_51.method3386((long) arg0);
			if (local12 == null) {
				if (!super.anInterface8_8.method1376(arg0)) {
					return null;
				}
				@Pc(32) Class201 local32 = super.anInterface8_8.method1375(arg0);
				@Pc(42) int local42 = local32.aBoolean431 || this.aBoolean243 ? 64 : 128;
				local12 = new Class1_Sub27(arg0, local42, super.anInterface8_8.method1373(local42, local42, arg0, 0.7F), local32.aBoolean436);
				this.aClass167_51.method3392(local12, (long) arg0);
			}
		}
		local12.aBoolean331 = true;
		return local12.method3417();
	}

	@OriginalMember(owner = "client!js", name = "aa", descriptor = "(IIIIII[BII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt3197;
		@Pc(35) int local35 = this.anInt3197 - arg2;
		if (arg1 + arg3 > this.anInt3195) {
			arg3 -= arg1 + arg3 - this.anInt3195;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt3208) {
			local59 = this.anInt3208 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt3197;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt3200) {
			local59 = arg0 + arg2 - this.anInt3200;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt3213) {
			local59 = this.anInt3213 - arg0;
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
						this.anIntArray173[local30++] = arg4;
					} else {
						this.anIntArray173[local30++] = arg5;
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
					local245 = this.anIntArray173[local30];
					this.anIntArray173[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray173[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray173[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3567(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub2 local8 = (Class1_Sub2) this.aClass257_14.method5503((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static441.method5548(arg0);
			this.aClass257_14.method5504(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!js", name = "k", descriptor = "()Z")
	@Override
	public boolean method3569() {
		return false;
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V")
	@Override
	public void method3550(@OriginalArg(0) int arg0) {
		if (this.anInt3219 == arg0) {
			return;
		}
		this.anInt3219 = arg0;
		this.aClass187Array1 = new Class187[this.anInt3219];
		for (@Pc(14) int local14 = 0; local14 < this.anInt3219; local14++) {
			this.aClass187Array1[local14] = new Class187(this);
		}
	}

	@OriginalMember(owner = "client!js", name = "m", descriptor = "()Z")
	@Override
	public boolean method3573() {
		return true;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method3591() {
		@Pc(3) Class187 local3 = this.method2709(Thread.currentThread());
		@Pc(6) Class249 local6 = local3.aClass249_1;
		local6.aBoolean571 = false;
		local6.aBoolean571 = false;
		local6.anInt6953 = 0;
		local6.aBoolean569 = true;
		local6.method5322(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean571 = true;
	}

	@OriginalMember(owner = "client!js", name = "F", descriptor = "()V")
	private void method2707() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3219; local1++) {
			this.aClass187Array1[local1].method3935();
		}
		this.va();
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(FFF)V")
	@Override
	public void method3547(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!po;)V")
	@Override
	public void method3587(@OriginalArg(0) Class194 arg0) {
		@Pc(3) Class13_Sub1 local3 = arg0.aClass46_1.aClass13_Sub1_5;
		for (@Pc(6) Class13_Sub1 local6 = local3.aClass13_Sub1_7; local6 != local3; local6 = local6.aClass13_Sub1_7) {
			@Pc(10) Class13_Sub1_Sub1 local10 = (Class13_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt3243 >> 12;
			@Pc(20) int local20 = local10.anInt3236 >> 12;
			@Pc(25) int local25 = local10.anInt3237 >> 12;
			@Pc(49) int local49 = this.aClass40_Sub1_1.anInt957 + (this.aClass40_Sub1_1.anInt953 * local15 + this.aClass40_Sub1_1.anInt958 * local20 + this.aClass40_Sub1_1.anInt955 * local25 >> 15);
			if (local49 >= this.anInt3198 && local49 <= this.anInt3192) {
				@Pc(90) int local90 = this.anInt3193 + this.anInt3204 * (this.aClass40_Sub1_1.anInt956 + (this.aClass40_Sub1_1.anInt960 * local15 + this.aClass40_Sub1_1.anInt954 * local20 + this.aClass40_Sub1_1.anInt962 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt3211 + this.anInt3199 * (this.aClass40_Sub1_1.anInt952 + (this.aClass40_Sub1_1.anInt961 * local15 + this.aClass40_Sub1_1.anInt959 * local20 + this.aClass40_Sub1_1.anInt951 * local25 >> 15)) / local49;
				if (local90 >= this.anInt3213 && local90 <= this.anInt3200 && local122 >= this.anInt3208 && local122 <= this.anInt3195) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method2705(local10, local90, local122, (local10.anInt3238 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method3553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class187 local3 = this.method2709(Thread.currentThread());
		@Pc(6) Class249 local6 = local3.aClass249_1;
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
		if (local50 <= local44) {
			local44 = -local44;
		} else {
			local50 = -local50;
		}
		@Pc(66) int local66 = arg5 * local50 >> 17;
		@Pc(74) int local74 = arg5 * local50 + 1 >> 17;
		@Pc(80) int local80 = arg5 * local44 >> 17;
		@Pc(88) int local88 = arg5 * local44 + 1 >> 17;
		@Pc(93) int local93 = arg0 - local6.method5324();
		@Pc(98) int local98 = arg1 - local6.method5325();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt6953 = 0;
		local6.aBoolean569 = local102 < 0 || local102 > local6.anInt6949 || local106 < 0 || local106 > local6.anInt6949 || local112 < 0 || local112 > local6.anInt6949;
		local6.method5329(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean569 = local102 < 0 || local102 > local6.anInt6949 || local106 < 0 || local106 > local6.anInt6949 || local118 < 0 || local118 > local6.anInt6949;
		local6.method5329(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!js", name = "j", descriptor = "()I")
	@Override
	public int method3558() {
		return 0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method3601(@OriginalArg(0) Class1_Sub14 arg0) {
	}

	@OriginalMember(owner = "client!js", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		this.NA(0, 0, this.anInt3197, this.anInt3217, arg0, 0);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class59 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class59_Sub2 local2 = (Class59_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray247;
		@Pc(8) int[] local8 = local2.anIntArray246;
		@Pc(17) int local17 = this.anInt3208 > arg7 ? this.anInt3208 : arg7;
		@Pc(32) int local32 = this.anInt3195 < arg7 + local5.length ? this.anInt3195 : arg7 + local5.length;
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
					if (local129 >= this.anInt3213 && local129 < this.anInt3200 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray173[local129 + arg1 * this.anInt3197] = arg4;
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
					if (local133 >= this.anInt3213 && local133 < this.anInt3200 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt3197;
						local248 = this.anIntArray173[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray173[local133 + arg1 * this.anInt3197] = local201 + local584;
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
		if (arg0 < this.anInt3213) {
			arg1 += local83 * (this.anInt3213 - arg0);
			arg0 = this.anInt3213;
		}
		if (arg2 >= this.anInt3200) {
			arg2 = this.anInt3200 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray173[arg0 + local129 * this.anInt3197] = arg4;
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
					local243 = arg0 + local133 * this.anInt3197;
					local248 = this.anIntArray173[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray173[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!js", name = "t", descriptor = "()Z")
	@Override
	public boolean method3594() {
		return true;
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3563(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas6 = null;
			this.aClass1_Sub2_1 = null;
			if (this.aClass49_8 == null) {
				this.anIntArray173 = null;
				this.anInt3197 = this.anInt3217 = 1;
				this.method2707();
			}
			return;
		}
		@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) this.aClass257_14.method5503((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas6 = arg0;
		this.aClass1_Sub2_1 = local10;
		if (this.aClass49_8 != null) {
			return;
		}
		this.anIntArray173 = local10.anIntArray489;
		this.anInt3197 = local10.anInt7368;
		this.anInt3217 = local10.anInt7369;
		this.method2707();
		return;
	}

	@OriginalMember(owner = "client!js", name = "O", descriptor = "(IIIII)V")
	@Override
	protected void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt3208) {
			local8 = this.anInt3208;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt3195) {
			local21 = this.anInt3195;
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
		if (arg4 == 0 || arg4 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt3213) {
					local91 = this.anInt3213;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3200) {
					local102 = this.anInt3200;
				}
				local116 = local91 + local30 * this.anInt3197;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray173[local116++] = arg3;
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
				if (local91 < this.anInt3213) {
					local91 = this.anInt3213;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3200 - 1) {
					local102 = this.anInt3200 - 1;
				}
				local116 = local91 + local30 * this.anInt3197;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray173[local116++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(334) int local334;
		@Pc(340) int local340;
		if (arg4 == 1) {
			@Pc(277) int local277 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
			local91 = 256 - local57;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local102 = arg0 + 1 - local36;
				if (local102 < this.anInt3213) {
					local102 = this.anInt3213;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt3200) {
					local116 = this.anInt3200;
				}
				local118 = local102 + local30 * this.anInt3197;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray173[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray173[local118++] = local277 + local340;
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
				if (local102 < this.anInt3213) {
					local102 = this.anInt3213;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt3200 - 1) {
					local116 = this.anInt3200 - 1;
				}
				local118 = local102 + local30 * this.anInt3197;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray173[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray173[local118++] = local277 + local340;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else if (arg4 == 2) {
			@Pc(593) int local593;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt3213) {
					local91 = this.anInt3213;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3200) {
					local102 = this.anInt3200;
				}
				local116 = local91 + local30 * this.anInt3197;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray173[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray173[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				local91 = arg0 - local36;
				if (local91 < this.anInt3213) {
					local91 = this.anInt3213;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3200 - 1) {
					local102 = this.anInt3200 - 1;
				}
				local116 = local91 + local30 * this.anInt3197;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray173[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray173[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I[Lclient!kt;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub24[] arg1) {
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)Lclient!l;")
	@Override
	public Class1_Sub14 method3538() {
		return null;
	}

	@OriginalMember(owner = "client!js", name = "k", descriptor = "(I)[I")
	public int[] method2708(@OriginalArg(0) int arg0) {
		@Pc(2) Class167 local2 = this.aClass167_51;
		@Pc(12) Class1_Sub27 local12;
		synchronized (this.aClass167_51) {
			local12 = (Class1_Sub27) this.aClass167_51.method3386((long) arg0);
			if (local12 == null) {
				if (!super.anInterface8_8.method1376(arg0)) {
					return null;
				}
				@Pc(32) Class201 local32 = super.anInterface8_8.method1375(arg0);
				@Pc(42) int local42 = local32.aBoolean431 || this.aBoolean243 ? 64 : 128;
				local12 = new Class1_Sub27(arg0, local42, super.anInterface8_8.method1374(local42, true, local42, 0.7F, arg0), local32.aBoolean436);
				this.aClass167_51.method3392(local12, (long) arg0);
			}
		}
		local12.aBoolean331 = true;
		return local12.method3417();
	}

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(I)V")
	@Override
	public void method3590(@OriginalArg(0) int arg0) {
		this.aClass187Array1[arg0].method3932(null);
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(Z)V")
	@Override
	public void method3566(@OriginalArg(0) boolean arg0) {
		this.aBoolean243 = arg0;
		this.aClass167_51.method3390();
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3549(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub2 local8 = (Class1_Sub2) this.aClass257_14.method5503((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method5617();
		local8 = Static441.method5548(arg0);
		this.aClass257_14.method5504(local8, (long) arg0.hashCode());
		if (this.aCanvas6 != arg0 || this.aClass49_8 != null) {
			return;
		}
		this.aClass1_Sub2_1 = local8;
		this.anIntArray173 = local8.anIntArray489;
		this.anInt3197 = local8.anInt7368;
		this.anInt3217 = local8.anInt7369;
		this.method2707();
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!pa;")
	public Class187 method2709(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3219; local1++) {
			if (this.aClass187Array1[local1].aRunnable2 == arg0) {
				return this.aClass187Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!js", name = "ia", descriptor = "(III[I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass40_Sub1_1.anInt957 + (this.aClass40_Sub1_1.anInt953 * arg0 + this.aClass40_Sub1_1.anInt958 * arg1 + this.aClass40_Sub1_1.anInt955 * arg2 >> 15);
		if (local23 < this.anInt3198 || local23 > this.anInt3194) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt3204 * (this.aClass40_Sub1_1.anInt956 + (this.aClass40_Sub1_1.anInt960 * arg0 + this.aClass40_Sub1_1.anInt954 * arg1 + this.aClass40_Sub1_1.anInt962 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt3199 * (this.aClass40_Sub1_1.anInt952 + (this.aClass40_Sub1_1.anInt961 * arg0 + this.aClass40_Sub1_1.anInt959 * arg1 + this.aClass40_Sub1_1.anInt951 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt3212 && local73 <= this.anInt3209 && local102 >= this.lb && local102 <= this.anInt3215) {
			arg3[0] = local73 - this.anInt3212;
			arg3[1] = local102 - this.lb;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!js", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!js", name = "g", descriptor = "(I)V")
	@Override
	public void method3606(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!js", name = "m", descriptor = "(Lclient!ia;)V")
	@Override
	public void m(@OriginalArg(0) Class40 arg0) {
		this.aClass40_Sub1_1 = (Class40_Sub1) arg0;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!je;[Lclient!gu;Z)Lclient!oa;")
	@Override
	public Class16 method3575(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class100[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2451;
			local7[local11] = arg1[local11].anInt2454;
			if (arg1[local11].aByteArray23 != null) {
			}
		}
		return new Class16_Sub2(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!js", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3193 = arg0;
		this.anInt3211 = arg1;
		this.anInt3204 = arg2;
		this.anInt3199 = arg3;
		this.method2704();
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!gu;Z)Lclient!f;")
	@Override
	public Class49 method3540(@OriginalArg(0) Class100 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray118;
		@Pc(5) byte[] local5 = arg0.aByteArray22;
		@Pc(8) int local8 = arg0.anInt2451;
		@Pc(11) int local11 = arg0.anInt2454;
		@Pc(76) Class49_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray23 == null) {
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
			local76 = new Class49_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray23;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class49_Sub1_Sub1(this, local20, local8, local11);
				local76 = new Class49_Sub1_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class49_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.ka(arg0.anInt2452, arg0.anInt2449, arg0.anInt2453, arg0.anInt2450);
		return local76;
	}

	@OriginalMember(owner = "client!js", name = "v", descriptor = "()Z")
	@Override
	public boolean method3597() {
		return false;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class49 method3572(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class49_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class49_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class49_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class49_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!js", name = "C", descriptor = "()Lclient!ia;")
	@Override
	public Class40 method3609() {
		return new Class40_Sub1();
	}

	@OriginalMember(owner = "client!js", name = "FA", descriptor = "()I")
	@Override
	public int FA() {
		return 0;
	}

	@OriginalMember(owner = "client!js", name = "JA", descriptor = "(II)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3198 = arg0;
		this.anInt3194 = arg1;
		this.anInt3192 = this.anInt3194 - 255;
		this.method2703();
	}

	@OriginalMember(owner = "client!js", name = "XA", descriptor = "(IFFFFF)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt3205 = (int) (arg1 * 65535.0F);
		this.anInt3196 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt3203 = (int) (arg3 * 65535.0F / local26);
		this.anInt3216 = (int) (arg4 * 65535.0F / local26);
		this.anInt3210 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!js", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		@Pc(2) int local2 = this.anInt3206;
		this.anInt3206 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!js", name = "x", descriptor = "()Lclient!ia;")
	@Override
	public Class40 method3600() {
		@Pc(3) Class187 local3 = this.method2709(Thread.currentThread());
		return local3.aClass40_Sub1_2;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!tl;Lclient!tl;FLclient!tl;)Lclient!tl;")
	@Override
	public Class9 method3579(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class9 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!js", name = "p", descriptor = "()Z")
	@Override
	public boolean method3584() {
		return false;
	}

	@OriginalMember(owner = "client!js", name = "i", descriptor = "()V")
	@Override
	public void method3556() {
	}

	@OriginalMember(owner = "client!js", name = "g", descriptor = "()I")
	@Override
	public int g() {
		@Pc(2) int local2 = this.anInt3218;
		this.anInt3218 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!js", name = "h", descriptor = "()V")
	@Override
	public void method3548() {
	}

	@OriginalMember(owner = "client!js", name = "Z", descriptor = "(IIII)V")
	@Override
	public void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3213 < arg0) {
			this.anInt3213 = arg0;
		}
		if (this.anInt3208 < arg1) {
			this.anInt3208 = arg1;
		}
		if (this.anInt3200 > arg2) {
			this.anInt3200 = arg2;
		}
		if (this.anInt3195 > arg3) {
			this.anInt3195 = arg3;
		}
		this.method2704();
	}

	@OriginalMember(owner = "client!js", name = "W", descriptor = "()I")
	@Override
	public int W() {
		return this.anInt3194;
	}

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.da(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.da(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!qc;IIII)Lclient!c;")
	@Override
	public Class33 method3602(@OriginalArg(0) Class199 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class33_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!js", name = "u", descriptor = "()Z")
	@Override
	public boolean method3595() {
		return true;
	}

	@OriginalMember(owner = "client!js", name = "da", descriptor = "(IIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt3213 || arg0 >= this.anInt3200) {
			return;
		}
		if (arg1 < this.anInt3208) {
			arg2 -= this.anInt3208 - arg1;
			arg1 = this.anInt3208;
		}
		if (arg1 + arg2 > this.anInt3195) {
			arg2 = this.anInt3195 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt3197;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray173[local40 + local54 * this.anInt3197] = arg3;
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
				local111 = local40 + local103 * this.anInt3197;
				local116 = this.anIntArray173[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray173[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt3197;
				local111 = this.anIntArray173[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray173[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!js", name = "l", descriptor = "(I)I")
	public int method2710(@OriginalArg(0) int arg0) {
		return super.anInterface8_8.method1375(arg0).aShort61 & 0xFFFF;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!c;Lclient!po;Lclient!ia;Lclient!vk;I)V")
	@Override
	public void method3557(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class13_Sub8 arg3) {
		((Class33_Sub1) arg0).method5081(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!js", name = "m", descriptor = "(I)Z")
	public boolean method2711(@OriginalArg(0) int arg0) {
		return this.aBoolean243 || super.anInterface8_8.method1375(arg0).aBoolean431;
	}
}
