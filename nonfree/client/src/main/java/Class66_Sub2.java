import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public abstract class Class66_Sub2 extends Class66 {

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "Ljava/awt/Canvas;")
	protected Canvas aCanvas10;

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "Z")
	private boolean aBoolean251;

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
	private int anInt3204;

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "Z")
	private boolean aBoolean252;

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "Lclient!mg;")
	protected Class4_Sub1 aClass4_Sub1_3;

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "Lclient!jw;")
	protected Class183 aClass183_12;

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
	private int anInt3205;

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
	public int anInt3206;

	@OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
	private int anInt3207;

	@OriginalMember(owner = "client!qe", name = "B", descriptor = "Lclient!pt;")
	public Class134_Sub3 aClass134_Sub3_7;

	@OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
	public int anInt3208;

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "[I")
	public int[] anIntArray301;

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
	public int anInt3209;

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "F")
	private float aFloat59;

	@OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
	public int anInt3210;

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
	public int anInt3211;

	@OriginalMember(owner = "client!qe", name = "I", descriptor = "Lclient!mga;")
	private final Class223 aClass223_26;

	@OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
	public int anInt3212;

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
	private int anInt3213;

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "Z")
	public boolean aBoolean253;

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
	public int anInt3214;

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
	protected int anInt3215;

	@OriginalMember(owner = "client!qe", name = "O", descriptor = "Lclient!xa;")
	protected Class13 aClass13_12;

	@OriginalMember(owner = "client!qe", name = "P", descriptor = "Z")
	public boolean aBoolean254;

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
	public int anInt3216;

	@OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
	public int anInt3217;

	@OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
	public int anInt3218;

	@OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
	private int anInt3219;

	@OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
	public int anInt3220;

	@OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
	public int anInt3221;

	@OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
	public int anInt3222;

	@OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
	public int anInt3223;

	@OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
	public int anInt3224;

	@OriginalMember(owner = "client!qe", name = "Z", descriptor = "I")
	public int anInt3225;

	@OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
	public int anInt3226;

	@OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
	public int anInt3227;

	@OriginalMember(owner = "client!qe", name = "cb", descriptor = "Z")
	private boolean aBoolean255;

	@OriginalMember(owner = "client!qe", name = "db", descriptor = "I")
	public int anInt3228;

	@OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
	public int anInt3229;

	@OriginalMember(owner = "client!qe", name = "fb", descriptor = "I")
	public int anInt3230;

	@OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
	public int anInt3231;

	@OriginalMember(owner = "client!qe", name = "hb", descriptor = "[Lclient!eo;")
	protected Class94[] aClass94Array3;

	@OriginalMember(owner = "client!qe", name = "ib", descriptor = "I")
	public int anInt3232;

	@OriginalMember(owner = "client!qe", name = "jb", descriptor = "I")
	public int anInt3233;

	@OriginalMember(owner = "client!qe", name = "kb", descriptor = "F")
	private float aFloat60;

	@OriginalMember(owner = "client!qe", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!qe", name = "mb", descriptor = "I")
	public int anInt3234;

	@OriginalMember(owner = "client!qe", name = "nb", descriptor = "Lclient!mga;")
	protected final Class223 aClass223_27;

	@OriginalMember(owner = "client!qe", name = "ob", descriptor = "Lclient!xa;")
	protected Class13 aClass13_13;

	@OriginalMember(owner = "client!qe", name = "pb", descriptor = "I")
	protected int anInt3235;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class66_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1) {
		this(arg1);
		this.method6853(arg0);
		this.method6854(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!e;)V")
	private Class66_Sub2(@OriginalArg(0) Interface3 arg0) {
		super(arg0);
		this.aBoolean251 = false;
		this.aBoolean252 = false;
		this.aClass183_12 = new Class183(4);
		this.anInt3205 = 3500;
		this.anInt3208 = 0;
		this.anInt3207 = 0;
		this.anInt3206 = 50;
		this.anInt3213 = 0;
		this.aBoolean253 = false;
		this.anInt3209 = 0;
		this.anInt3216 = 0;
		this.anInt3230 = 0;
		this.anInt3227 = 3500;
		this.anInt3212 = 0;
		this.anInt3219 = 0;
		this.anInt3228 = 75518;
		this.anInt3223 = this.anInt3205 - 255;
		this.anInt3232 = 512;
		this.anInt3222 = 78642;
		this.anInt3218 = 0;
		this.aBoolean255 = false;
		this.anInt3226 = 512;
		this.lb = 45823;
		this.anInt3234 = 0;
		this.aClass223_27 = new Class223(16);
		this.anInt3235 = -1;
		this.aClass223_26 = new Class223(256);
		this.aClass134_Sub3_7 = new Class134_Sub3();
		this.method6835(1);
		this.method6813(0);
		Static452.method6402(true, false);
		this.aBoolean252 = true;
	}

	@OriginalMember(owner = "client!qe", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public final boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass134_Sub3_7.anInt7284 * arg0 + this.aClass134_Sub3_7.anInt7283 * arg1 + this.aClass134_Sub3_7.anInt7282 * arg2 >> 14) + this.aClass134_Sub3_7.anInt7279;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass134_Sub3_7.anInt7284 * arg3 + this.aClass134_Sub3_7.anInt7283 * arg4 + this.aClass134_Sub3_7.anInt7282 * arg5 >> 14) + this.aClass134_Sub3_7.anInt7279;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt3206 && local52 < this.anInt3206 || !(local23 <= this.anInt3205 || local52 <= this.anInt3205)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt3232 * ((this.aClass134_Sub3_7.anInt7278 * arg0 + this.aClass134_Sub3_7.anInt7274 * arg1 + this.aClass134_Sub3_7.anInt7285 * arg2 >> 14) + this.aClass134_Sub3_7.anInt7281) / local23;
		@Pc(133) int local133 = this.anInt3232 * ((this.aClass134_Sub3_7.anInt7278 * arg3 + this.aClass134_Sub3_7.anInt7274 * arg4 + this.aClass134_Sub3_7.anInt7285 * arg5 >> 14) + this.aClass134_Sub3_7.anInt7281) / local52;
		if (local104 < this.anInt3217 && local133 < this.anInt3217 || local104 > this.anInt3225 && local133 > this.anInt3225) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt3226 * ((this.aClass134_Sub3_7.anInt7280 * arg0 + this.aClass134_Sub3_7.anInt7276 * arg1 + this.aClass134_Sub3_7.anInt7275 * arg2 >> 14) + this.aClass134_Sub3_7.anInt7277) / local23;
			@Pc(209) int local209 = this.anInt3226 * ((this.aClass134_Sub3_7.anInt7280 * arg3 + this.aClass134_Sub3_7.anInt7276 * arg4 + this.aClass134_Sub3_7.anInt7275 * arg5 >> 14) + this.aClass134_Sub3_7.anInt7277) / local52;
			return (local180 >= this.anInt3233 || local209 >= this.anInt3233) && (local180 <= this.anInt3210 || local209 <= this.anInt3210);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public final void method6812(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas10 == null || this.aClass4_Sub1_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas10.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt3214 && local21.y <= this.anInt3215 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass4_Sub1_3.method7318(local21.height, local21.y, local21.width, local21.x, local14);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "()V")
	@Override
	public void method6795() {
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "()V")
	@Override
	public final void method6784() {
	}

	@OriginalMember(owner = "client!qe", name = "ya", descriptor = "(IIIII)V")
	@Override
	public final void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt3216 || arg0 >= this.anInt3230) {
			return;
		}
		if (arg1 < this.anInt3208) {
			arg2 -= this.anInt3208 - arg1;
			arg1 = this.anInt3208;
		}
		if (arg1 + arg2 > this.anInt3218) {
			arg2 = this.anInt3218 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt3214;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray301[local40 + local54 * this.anInt3214] = arg3;
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
				local111 = local40 + local103 * this.anInt3214;
				local116 = this.anIntArray301[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray301[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt3214;
				local111 = this.anIntArray301[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray301[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt3208 || arg1 >= this.anInt3218) {
			return;
		}
		if (arg0 < this.anInt3216) {
			arg2 -= this.anInt3216 - arg0;
			arg0 = this.anInt3216;
		}
		if (arg0 + arg2 > this.anInt3230) {
			arg2 = this.anInt3230 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt3214;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray301[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray301[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray301[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray301[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray301[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(FFF)V")
	@Override
	public final void method6806(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method6826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.e(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.e(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt3216) {
					arg1 += local104 * (this.anInt3216 - arg0);
					arg0 = this.anInt3216;
				}
				if (arg2 >= this.anInt3230) {
					arg2 = this.anInt3230 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt3208 && local150 < this.anInt3218) {
							this.anIntArray301[arg0 + local150 * this.anInt3214] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt3208 && local213 < this.anInt3218) {
							local228 = arg0 + local213 * this.anInt3214;
							local233 = this.anIntArray301[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray301[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt3208 && local150 < this.anInt3218) {
							local213 = arg0 + local150 * this.anInt3214;
							local228 = this.anIntArray301[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray301[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg3 >= this.anInt3218) {
					arg3 = this.anInt3218 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt3216 && local150 < this.anInt3230) {
							this.anIntArray301[local150 + arg1 * this.anInt3214] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt3216 && local213 < this.anInt3230) {
							local228 = local213 + arg1 * this.anInt3214;
							local233 = this.anIntArray301[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray301[local213 + arg1 * this.anInt3214] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt3216 && local150 < this.anInt3230) {
							local213 = local150 + arg1 * this.anInt3214;
							local228 = this.anIntArray301[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray301[local213] = local233 - local587 | local587 - (local587 >>> 8);
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.ya(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.ya(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!c;)V")
	@Override
	public final void method6846(@OriginalArg(0) Class42 arg0) {
		@Pc(3) Class26_Sub1 local3 = arg0.aClass212_1.aClass26_Sub1_5;
		for (@Pc(6) Class26_Sub1 local6 = local3.aClass26_Sub1_10; local6 != local3; local6 = local6.aClass26_Sub1_10) {
			@Pc(10) Class26_Sub1_Sub1 local10 = (Class26_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt9214 >> 12;
			@Pc(20) int local20 = local10.anInt9217 >> 12;
			@Pc(25) int local25 = local10.anInt9213 >> 12;
			@Pc(49) int local49 = this.aClass134_Sub3_7.anInt7279 + (this.aClass134_Sub3_7.anInt7284 * local15 + this.aClass134_Sub3_7.anInt7283 * local20 + this.aClass134_Sub3_7.anInt7282 * local25 >> 14);
			if (local49 >= this.anInt3206 && local49 <= this.anInt3223) {
				@Pc(90) int local90 = this.anInt3231 + this.anInt3232 * (this.aClass134_Sub3_7.anInt7281 + (this.aClass134_Sub3_7.anInt7278 * local15 + this.aClass134_Sub3_7.anInt7274 * local20 + this.aClass134_Sub3_7.anInt7285 * local25 >> 14)) / local49;
				@Pc(122) int local122 = this.anInt3224 + this.anInt3226 * (this.aClass134_Sub3_7.anInt7277 + (this.aClass134_Sub3_7.anInt7280 * local15 + this.aClass134_Sub3_7.anInt7276 * local20 + this.aClass134_Sub3_7.anInt7275 * local25 >> 14)) / local49;
				if (local90 >= this.anInt3216 && local90 <= this.anInt3230 && local122 >= this.anInt3208 && local122 <= this.anInt3218) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method2956(local10, local90, local122, local49, (local10.anInt9222 * this.anInt3232 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "()Z")
	@Override
	public final boolean method6837() {
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	@Override
	public void method6813(@OriginalArg(0) int arg0) {
		this.aClass94Array3[arg0].method5762(Thread.currentThread());
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6839(@OriginalArg(0) boolean arg0) {
		this.aBoolean255 = arg0;
		this.aClass223_26.method4932();
	}

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "()Z")
	@Override
	public final boolean method6814() {
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public abstract void method6787(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "()V")
	@Override
	public final void method6790() {
	}

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "(IIIII)V")
	@Override
	protected final void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt3208) {
			local8 = this.anInt3208;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt3218) {
			local21 = this.anInt3218;
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
				if (local91 < this.anInt3216) {
					local91 = this.anInt3216;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3230) {
					local102 = this.anInt3230;
				}
				local116 = local91 + local30 * this.anInt3214;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray301[local116++] = arg3;
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
				if (local91 < this.anInt3216) {
					local91 = this.anInt3216;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3230 - 1) {
					local102 = this.anInt3230 - 1;
				}
				local116 = local91 + local30 * this.anInt3214;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray301[local116++] = arg3;
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
				if (local102 < this.anInt3216) {
					local102 = this.anInt3216;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt3230) {
					local116 = this.anInt3230;
				}
				local118 = local102 + local30 * this.anInt3214;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray301[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray301[local118++] = local277 + local340;
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
				if (local102 < this.anInt3216) {
					local102 = this.anInt3216;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt3230 - 1) {
					local116 = this.anInt3230 - 1;
				}
				local118 = local102 + local30 * this.anInt3214;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray301[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray301[local118++] = local277 + local340;
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
				if (local91 < this.anInt3216) {
					local91 = this.anInt3216;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3230) {
					local102 = this.anInt3230;
				}
				local116 = local91 + local30 * this.anInt3214;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray301[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray301[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt3216) {
					local91 = this.anInt3216;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3230 - 1) {
					local102 = this.anInt3230 - 1;
				}
				local116 = local91 + local30 * this.anInt3214;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray301[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray301[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
	@Override
	public final int method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6853(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class4_Sub1 local8 = (Class4_Sub1) this.aClass183_12.method4289((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static429.method6116(arg0);
			this.aClass183_12.method4282((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!eo;")
	public abstract Class94 method2953(@OriginalArg(0) Runnable arg0);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6792(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas10 == arg0) {
			this.method6854(null);
		}
		@Pc(15) Class4_Sub1 local15 = (Class4_Sub1) this.aClass183_12.method4289((long) arg0.hashCode());
		if (local15 != null) {
			local15.method8013();
		}
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
	@Override
	public final void method6824(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt3204;
		for (@Pc(9) Object local9 = this.aClass223_26.method4931(); local9 != null; local9 = this.aClass223_26.method4942()) {
			@Pc(13) Class4_Sub30 local13 = (Class4_Sub30) local9;
			if (local13.aBoolean430) {
				local13.anInt5766 += local4;
				@Pc(27) int local27 = local13.anInt5766 / 20;
				if (local27 > 0) {
					@Pc(36) Class271 local36 = super.anInterface3_15.method7249(local13.anInt5768);
					local13.method4902(local36.aByte79 * local4 * 50 / 1000, local36.aByte83 * local4 * 50 / 1000);
					local13.anInt5766 -= local27 * 20;
				}
				local13.aBoolean430 = false;
			}
		}
		this.anInt3204 = arg0;
		this.aClass223_27.method4933(5);
		this.aClass223_26.method4933(5);
	}

	@OriginalMember(owner = "client!qe", name = "SA", descriptor = "()I")
	@Override
	public final int SA() {
		@Pc(2) int local2 = this.anInt3213;
		this.anInt3213 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "()Z")
	@Override
	public final boolean method6793() {
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[Lclient!pv;)V")
	@Override
	public final void method6785(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub32[] arg1) {
	}

	@OriginalMember(owner = "client!qe", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public final void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt3214;
		@Pc(35) int local35 = this.anInt3214 - arg2;
		if (arg1 + arg3 > this.anInt3218) {
			arg3 -= arg1 + arg3 - this.anInt3218;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt3208) {
			local59 = this.anInt3208 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt3214;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt3230) {
			local59 = arg0 + arg2 - this.anInt3230;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt3216) {
			local59 = this.anInt3216 - arg0;
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
						this.anIntArray301[local30++] = arg4;
					} else {
						this.anIntArray301[local30++] = arg5;
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
					local245 = this.anIntArray301[local30];
					this.anIntArray301[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray301[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray301[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "()V")
	protected abstract void method2954();

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)Z")
	public final boolean method2955(@OriginalArg(0) int arg0) {
		return this.aBoolean255 || super.anInterface3_15.method7249(arg0).aBoolean516;
	}

	@OriginalMember(owner = "client!qe", name = "A", descriptor = "()V")
	@Override
	public final void method6847() throws Exception_Sub1 {
		if (this.aCanvas10 == null || this.aClass4_Sub1_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas10.getGraphics();
			this.aClass4_Sub1_3.method7319(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "()Z")
	@Override
	public final boolean method6850() {
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([Lclient!ba;Lclient!c;Lclient!q;[Lclient!ot;I)V")
	public abstract void method6798(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class26_Sub5[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "()V")
	public abstract void method6780();

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public final void method6844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class98 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class98_Sub1 local2 = (Class98_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray536;
		@Pc(8) int[] local8 = local2.anIntArray535;
		@Pc(17) int local17 = this.anInt3208 > arg7 ? this.anInt3208 : arg7;
		@Pc(32) int local32 = this.anInt3218 < arg7 + local5.length ? this.anInt3218 : arg7 + local5.length;
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
					if (local129 >= this.anInt3216 && local129 < this.anInt3230 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray301[local129 + arg1 * this.anInt3214] = arg4;
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
					if (local133 >= this.anInt3216 && local133 < this.anInt3230 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt3214;
						local248 = this.anIntArray301[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray301[local133 + arg1 * this.anInt3214] = local201 + local584;
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
		if (arg0 < this.anInt3216) {
			arg1 += local83 * (this.anInt3216 - arg0);
			arg0 = this.anInt3216;
		}
		if (arg2 >= this.anInt3230) {
			arg2 = this.anInt3230 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray301[arg0 + local129 * this.anInt3214] = arg4;
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
					local243 = arg0 + local133 * this.anInt3214;
					local248 = this.anIntArray301[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray301[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!qe", name = "aa", descriptor = "()I")
	@Override
	public final int aa() {
		@Pc(2) int local2 = this.anInt3219;
		this.anInt3219 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!qe", name = "AA", descriptor = "(IIII)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3207 = this.anInt3209;
		this.anInt3212 = arg0;
		this.anInt3209 = arg1;
		this.anInt3234 = arg2;
		this.aBoolean253 = true;
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V")
	public abstract void method6835(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qe", name = "ca", descriptor = "(IIII)V")
	@Override
	public final void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt3214) {
			arg2 = this.anInt3214;
		}
		if (arg3 > this.anInt3215) {
			arg3 = this.anInt3215;
		}
		this.anInt3216 = arg0;
		this.anInt3230 = arg2;
		this.anInt3208 = arg1;
		this.anInt3218 = arg3;
		this.method2954();
	}

	@OriginalMember(owner = "client!qe", name = "na", descriptor = "(III[I)V")
	@Override
	public final void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass134_Sub3_7.anInt7279 + (this.aClass134_Sub3_7.anInt7284 * arg0 + this.aClass134_Sub3_7.anInt7283 * arg1 + this.aClass134_Sub3_7.anInt7282 * arg2 >> 14);
		if (local23 < this.anInt3206 || local23 > this.anInt3205) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt3232 * (this.aClass134_Sub3_7.anInt7281 + (this.aClass134_Sub3_7.anInt7278 * arg0 + this.aClass134_Sub3_7.anInt7274 * arg1 + this.aClass134_Sub3_7.anInt7285 * arg2 >> 14)) / local23;
		@Pc(102) int local102 = this.anInt3226 * (this.aClass134_Sub3_7.anInt7277 + (this.aClass134_Sub3_7.anInt7280 * arg0 + this.aClass134_Sub3_7.anInt7276 * arg1 + this.aClass134_Sub3_7.anInt7275 * arg2 >> 14)) / local23;
		if (local73 >= this.anInt3217 && local73 <= this.anInt3225 && local102 >= this.anInt3233 && local102 <= this.anInt3210) {
			arg3[0] = local73 - this.anInt3217;
			arg3[1] = local102 - this.anInt3233;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3216 < arg0) {
			this.anInt3216 = arg0;
		}
		if (this.anInt3208 < arg1) {
			this.anInt3208 = arg1;
		}
		if (this.anInt3230 > arg2) {
			this.anInt3230 = arg2;
		}
		if (this.anInt3218 > arg3) {
			this.anInt3218 = arg3;
		}
		this.method2954();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!di;IIII)V")
	public abstract void method2956(@OriginalArg(0) Class26_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "()Z")
	@Override
	public final boolean method6781() {
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "()Lclient!q;")
	@Override
	public final Class134 method6842() {
		@Pc(3) Class94 local3 = this.method2953(Thread.currentThread());
		return local3.aClass134_Sub3_9;
	}

	@OriginalMember(owner = "client!qe", name = "C", descriptor = "()Z")
	@Override
	public final boolean method6849() {
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "JA", descriptor = "(I)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!qe", name = "B", descriptor = "()Z")
	@Override
	public final boolean method6848() {
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!ot;I)V")
	public abstract void method6845(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class26_Sub5[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "()Z")
	@Override
	public final boolean method6821() {
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)I")
	@Override
	public final int method6831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "()I")
	@Override
	public final int v() {
		return 0;
	}

	@OriginalMember(owner = "client!qe", name = "G", descriptor = "()Z")
	public final boolean method2957() {
		return this.aBoolean251;
	}

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class98_Sub1 local2 = (Class98_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray536;
		@Pc(8) int[] local8 = local2.anIntArray535;
		@Pc(20) int local20;
		if (this.anInt3218 < arg3 + local5.length) {
			local20 = this.anInt3218 - arg3;
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
		@Pc(49) int local49 = arg3 * this.anInt3214;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt3216 > local58) {
				local62 -= this.anInt3216 - local58;
				local58 = this.anInt3216;
			}
			if (this.anInt3230 < local58 + local62) {
				local62 = this.anInt3230 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray301[local58++] = arg0;
			}
			local49 += this.anInt3214;
		}
	}

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "()V")
	@Override
	protected final void method6805() {
		if (this.aBoolean252) {
			Static333.method5017(true, false);
			this.aBoolean252 = false;
		}
		this.aClass4_Sub1_3 = null;
		this.aCanvas10 = null;
		this.aClass183_12 = null;
		this.aBoolean251 = true;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!dn;)V")
	@Override
	public final void method6803(@OriginalArg(0) Class75 arg0) {
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public final Class13 method6802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt3214 + arg0;
		@Pc(16) int local16 = this.anInt3214 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray301[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class13_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class13_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "()V")
	@Override
	public final void method6783() {
		this.aClass223_26.method4932();
		this.aClass223_27.method4932();
	}

	@OriginalMember(owner = "client!qe", name = "KA", descriptor = "(IIII)[I")
	@Override
	public final int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt3214 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray301[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "(I)Z")
	public final boolean method2958(@OriginalArg(0) int arg0) {
		return super.anInterface3_15.method7248(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "()Z")
	public abstract boolean method6834();

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "(IIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3231 = arg0;
		this.anInt3224 = arg1;
		this.anInt3232 = arg2;
		this.anInt3226 = arg3;
		this.method2954();
	}

	@OriginalMember(owner = "client!qe", name = "X", descriptor = "(III)V")
	@Override
	public final void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3209 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt3209 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt3209 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt3209 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt3209 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean254 = false;
		} else {
			this.aBoolean254 = true;
		}
	}

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "()Z")
	@Override
	public final boolean method6828() {
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!dn;Lclient!dn;FLclient!dn;)Lclient!dn;")
	@Override
	public final Class75 method6775(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class75 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!pf;IIII)Lclient!ba;")
	public abstract Class9 method6779(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "()Z")
	@Override
	public final boolean method6852() {
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "()V")
	@Override
	public final void method6808() {
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method6816();

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "(I)[I")
	public final int[] method2959(@OriginalArg(0) int arg0) {
		@Pc(2) Class223 local2 = this.aClass223_26;
		@Pc(12) Class4_Sub30 local12;
		synchronized (this.aClass223_26) {
			local12 = (Class4_Sub30) this.aClass223_26.method4943((long) arg0);
			if (local12 == null) {
				if (!super.anInterface3_15.method7248(arg0)) {
					return null;
				}
				@Pc(32) Class271 local32 = super.anInterface3_15.method7249(arg0);
				@Pc(42) int local42 = local32.aBoolean516 || this.aBoolean255 ? 64 : 128;
				local12 = new Class4_Sub30(arg0, local42, super.anInterface3_15.method7250(local42, true, arg0, 0.7F, local42), local32.aBoolean521);
				this.aClass223_26.method4938((long) arg0, local12);
			}
		}
		local12.aBoolean430 = true;
		return local12.method4903();
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(IIIIII)Lclient!dn;")
	@Override
	public final Class75 method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public final void method6800(@OriginalArg(0) Class4_Sub6 arg0) {
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!xa;Z)V")
	protected abstract void method6811(@OriginalArg(0) Class13 arg0);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public final Class13 method6843(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class13_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class13_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class13_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class13_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!kga;[Lclient!pga;Z)Lclient!ta;")
	@Override
	public final Class91 method6829(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class268[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt7058;
			local7[local11] = arg1[local11].anInt7060;
			if (arg1[local11].aByteArray92 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class91_Sub3(this, arg0, arg1, local3, local7);
		} else {
			return new Class91_Sub5(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "(I)Z")
	public final boolean method2960(@OriginalArg(0) int arg0) {
		return super.anInterface3_15.method7249(arg0).aBoolean513;
	}

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "()V")
	protected final void method2961() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3229; local1++) {
			this.aClass94Array3[local1].method5764();
		}
		this.F();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method6786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.e(arg0, arg1, arg2, arg4, arg5);
		this.e(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.ya(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.ya(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!qe", name = "sa", descriptor = "(II)V")
	@Override
	public final void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3206 = arg0;
		this.anInt3205 = arg1;
		this.anInt3223 = this.anInt3205 - 255;
		this.method2962();
	}

	@OriginalMember(owner = "client!qe", name = "IA", descriptor = "()I")
	@Override
	public final int IA() {
		return this.anInt3205;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method6825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method6823(@OriginalArg(0) Class134 arg0) {
		this.aClass134_Sub3_7 = (Class134_Sub3) arg0;
	}

	@OriginalMember(owner = "client!qe", name = "ka", descriptor = "(FF)V")
	@Override
	public final void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat60 = arg0;
		this.aFloat59 = arg1;
		this.method2962();
	}

	@OriginalMember(owner = "client!qe", name = "LA", descriptor = "(IIII)V")
	@Override
	public final void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3212 = arg0;
		this.anInt3209 = arg1;
		this.anInt3234 = arg2;
	}

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "()Lclient!ffa;")
	@Override
	public final Class105 method6836() {
		return new Class105(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "()V")
	@Override
	public final void method6830() {
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZ)Lclient!xa;")
	@Override
	public final Class13 method6856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class13_Sub1_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!qe", name = "u", descriptor = "()I")
	@Override
	public final int method6832() {
		return 0;
	}

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "()V")
	@Override
	public final void k() {
		this.anInt3209 = this.anInt3207;
		this.aBoolean253 = false;
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "()Z")
	@Override
	public final boolean method6789() {
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "I", descriptor = "()V")
	private void method2962() {
		if (this.aFloat59 == 0.0F) {
			this.anInt3227 = this.anInt3205;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt3205;
		@Pc(12) float local12 = (float) this.anInt3206;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat60 / (this.aFloat59 + this.aFloat60);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat59;
		this.anInt3227 = (int) (((float) this.anInt3205 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	public abstract Class16 method6797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(Z)V")
	@Override
	public void method6857(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)Lclient!i;")
	@Override
	public final Class4_Sub6 method6833(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qe", name = "C", descriptor = "(IIIIII)V")
	@Override
	public final void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt3216) {
			arg2 -= this.anInt3216 - arg0;
			arg0 = this.anInt3216;
		}
		if (arg1 < this.anInt3208) {
			arg3 -= this.anInt3208 - arg1;
			arg1 = this.anInt3208;
		}
		if (arg0 + arg2 > this.anInt3230) {
			arg2 = this.anInt3230 - arg0;
		}
		if (arg1 + arg3 > this.anInt3218) {
			arg3 = this.anInt3218 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt3230 || arg1 > this.anInt3218) {
			return;
		}
		@Pc(67) int local67 = this.anInt3214 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt3214;
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
						local217 = this.anIntArray301[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray301[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray301[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray301[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray301[arg2] = arg4;
					arg2++;
					this.anIntArray301[arg2] = arg4;
					arg2++;
					this.anIntArray301[arg2] = arg4;
					arg2++;
					this.anIntArray301[arg2] = arg4;
					arg2++;
					this.anIntArray301[arg2] = arg4;
					arg2++;
					this.anIntArray301[arg2] = arg4;
					arg2++;
					this.anIntArray301[arg2] = arg4;
					arg2++;
					this.anIntArray301[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray301[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "()Lclient!q;")
	@Override
	public final Class134 method6788() {
		return new Class134_Sub3();
	}

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)V")
	@Override
	public final void method6840(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!qe", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.lb = (int) (arg1 * 65535.0F);
		this.anInt3222 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt3220 = (int) (arg3 * 65535.0F / local26);
		this.anInt3211 = (int) (arg4 * 65535.0F / local26);
		this.anInt3221 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!pga;Z)Lclient!xa;")
	@Override
	public final Class13 method6799(@OriginalArg(0) Class268 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray590;
		@Pc(5) byte[] local5 = arg0.aByteArray93;
		@Pc(8) int local8 = arg0.anInt7058;
		@Pc(11) int local11 = arg0.anInt7060;
		@Pc(76) Class13_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray92 == null) {
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
			local76 = new Class13_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray92;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class13_Sub1_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class13_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.EA(arg0.anInt7057, arg0.anInt7059, arg0.anInt7056, arg0.anInt7061);
		return local76;
	}

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "(I)I")
	public final int method2963(@OriginalArg(0) int arg0) {
		return super.anInterface3_15.method7249(arg0).aShort94 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6815(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public final Class98 method6841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class98_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qe", name = "A", descriptor = "([I)V")
	@Override
	public final void A(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3216;
		arg0[1] = this.anInt3208;
		arg0[2] = this.anInt3230;
		arg0[3] = this.anInt3218;
	}

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "()Z")
	@Override
	public final boolean method6804() {
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "ha", descriptor = "(F)V")
	@Override
	public final void ha(@OriginalArg(0) float arg0) {
		this.anInt3228 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(IIIIIIIIII)V")
	public abstract void method2964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!qe", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt3206;
	}

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "(I)V")
	@Override
	public final void D(@OriginalArg(0) int arg0) {
		this.C(0, 0, this.anInt3214, this.anInt3215, arg0, 0);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V")
	@Override
	public final void method6851(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()Z")
	@Override
	public final boolean method6778() {
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6854(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIF)Lclient!pv;")
	@Override
	public final Class4_Sub32 method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "()Z")
	@Override
	public final boolean method6820() {
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "()V")
	@Override
	public final void F() {
		this.anInt3216 = 0;
		this.anInt3208 = 0;
		this.anInt3230 = this.anInt3214;
		this.anInt3218 = this.anInt3215;
		this.method2954();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ba;Lclient!c;Lclient!q;Lclient!ot;I)V")
	@Override
	public final void method6807(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class26_Sub5 arg3, @OriginalArg(4) int arg4) {
		((Class9_Sub1) arg0).method1173(arg2, arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "(I)[I")
	protected final int[] method2965(@OriginalArg(0) int arg0) {
		@Pc(2) Class223 local2 = this.aClass223_26;
		@Pc(12) Class4_Sub30 local12;
		synchronized (this.aClass223_26) {
			local12 = (Class4_Sub30) this.aClass223_26.method4943((long) arg0);
			if (local12 == null) {
				if (!super.anInterface3_15.method7248(arg0)) {
					return null;
				}
				@Pc(32) Class271 local32 = super.anInterface3_15.method7249(arg0);
				@Pc(42) int local42 = local32.aBoolean516 || this.aBoolean255 ? 64 : 128;
				local12 = new Class4_Sub30(arg0, local42, super.anInterface3_15.method7251(0.7F, local42, arg0, local42), local32.aBoolean521);
				this.aClass223_26.method4938((long) arg0, local12);
			}
		}
		local12.aBoolean430 = true;
		return local12.method4903();
	}
}
