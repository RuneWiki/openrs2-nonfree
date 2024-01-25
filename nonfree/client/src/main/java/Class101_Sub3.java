import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class101_Sub3 extends Class101 {

	@OriginalMember(owner = "client!rp", name = "r", descriptor = "I")
	private int anInt9222;

	@OriginalMember(owner = "client!rp", name = "s", descriptor = "I")
	private int anInt9223;

	@OriginalMember(owner = "client!rp", name = "t", descriptor = "Lclient!si;")
	private Class335 aClass335_38;

	@OriginalMember(owner = "client!rp", name = "u", descriptor = "Lclient!ag;")
	public Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!rp", name = "v", descriptor = "Z")
	private boolean aBoolean671;

	@OriginalMember(owner = "client!rp", name = "w", descriptor = "I")
	private int anInt9224;

	@OriginalMember(owner = "client!rp", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!rp", name = "y", descriptor = "Z")
	private boolean aBoolean672;

	@OriginalMember(owner = "client!rp", name = "z", descriptor = "I")
	public int anInt9225;

	@OriginalMember(owner = "client!rp", name = "A", descriptor = "I")
	private int anInt9226;

	@OriginalMember(owner = "client!rp", name = "B", descriptor = "I")
	public int anInt9227;

	@OriginalMember(owner = "client!rp", name = "C", descriptor = "[F")
	public float[] aFloatArray58;

	@OriginalMember(owner = "client!rp", name = "D", descriptor = "I")
	public int anInt9228;

	@OriginalMember(owner = "client!rp", name = "E", descriptor = "I")
	private int anInt9229;

	@OriginalMember(owner = "client!rp", name = "F", descriptor = "Lclient!wga;")
	public Class76_Sub3 aClass76_Sub3_2;

	@OriginalMember(owner = "client!rp", name = "G", descriptor = "I")
	public int anInt9230;

	@OriginalMember(owner = "client!rp", name = "H", descriptor = "[Lclient!tv;")
	private Class352[] aClass352Array1;

	@OriginalMember(owner = "client!rp", name = "I", descriptor = "Lclient!aq;")
	private final Class22 aClass22_49;

	@OriginalMember(owner = "client!rp", name = "J", descriptor = "I")
	public int anInt9231;

	@OriginalMember(owner = "client!rp", name = "K", descriptor = "I")
	public int anInt9232;

	@OriginalMember(owner = "client!rp", name = "L", descriptor = "I")
	public int anInt9233;

	@OriginalMember(owner = "client!rp", name = "M", descriptor = "I")
	public int anInt9234;

	@OriginalMember(owner = "client!rp", name = "N", descriptor = "I")
	private int anInt9235;

	@OriginalMember(owner = "client!rp", name = "O", descriptor = "I")
	public int anInt9236;

	@OriginalMember(owner = "client!rp", name = "P", descriptor = "I")
	public int anInt9237;

	@OriginalMember(owner = "client!rp", name = "Q", descriptor = "I")
	public int anInt9238;

	@OriginalMember(owner = "client!rp", name = "R", descriptor = "[I")
	public int[] anIntArray471;

	@OriginalMember(owner = "client!rp", name = "S", descriptor = "Z")
	private boolean aBoolean673;

	@OriginalMember(owner = "client!rp", name = "T", descriptor = "I")
	public int anInt9239;

	@OriginalMember(owner = "client!rp", name = "U", descriptor = "I")
	private int anInt9240;

	@OriginalMember(owner = "client!rp", name = "V", descriptor = "I")
	public int anInt9241;

	@OriginalMember(owner = "client!rp", name = "W", descriptor = "Lclient!aq;")
	private final Class22 aClass22_50;

	@OriginalMember(owner = "client!rp", name = "X", descriptor = "I")
	public int anInt9242;

	@OriginalMember(owner = "client!rp", name = "Y", descriptor = "I")
	public int anInt9243;

	@OriginalMember(owner = "client!rp", name = "Z", descriptor = "I")
	public int anInt9244;

	@OriginalMember(owner = "client!rp", name = "ab", descriptor = "I")
	private int anInt9245;

	@OriginalMember(owner = "client!rp", name = "bb", descriptor = "I")
	public int anInt9246;

	@OriginalMember(owner = "client!rp", name = "cb", descriptor = "I")
	public int anInt9247;

	@OriginalMember(owner = "client!rp", name = "db", descriptor = "I")
	public int anInt9248;

	@OriginalMember(owner = "client!rp", name = "eb", descriptor = "I")
	private int anInt9249;

	@OriginalMember(owner = "client!rp", name = "fb", descriptor = "I")
	private int anInt9250;

	@OriginalMember(owner = "client!rp", name = "gb", descriptor = "I")
	public int anInt9251;

	@OriginalMember(owner = "client!rp", name = "hb", descriptor = "I")
	public int anInt9252;

	@OriginalMember(owner = "client!rp", name = "ib", descriptor = "I")
	public int anInt9253;

	@OriginalMember(owner = "client!rp", name = "jb", descriptor = "I")
	public int anInt9254;

	@OriginalMember(owner = "client!rp", name = "kb", descriptor = "[F")
	public float[] aFloatArray59;

	@OriginalMember(owner = "client!rp", name = "lb", descriptor = "Lclient!gq;")
	private Class132 lb;

	@OriginalMember(owner = "client!rp", name = "mb", descriptor = "Lclient!mq;")
	private Class71 aClass71_35;

	@OriginalMember(owner = "client!rp", name = "nb", descriptor = "I")
	private int anInt9255;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class101_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		try {
			this.method8119(arg0, arg2, arg3);
			this.method8144(arg0);
		} catch (@Pc(12) Throwable local12) {
			local12.printStackTrace();
			this.method8148();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class101_Sub3(@OriginalArg(0) Interface3 arg0) {
		super(arg0);
		this.aBoolean671 = false;
		this.aBoolean672 = false;
		this.aClass335_38 = new Class335(4);
		this.anInt9225 = 75518;
		this.anInt9238 = 0;
		this.anInt9231 = 512;
		this.anInt9228 = 50;
		this.anInt9237 = 512;
		this.aBoolean673 = false;
		this.anInt9232 = 0;
		this.anInt9227 = 45823;
		this.anInt9244 = 0;
		this.anInt9243 = 3500;
		this.anInt9250 = 0;
		this.anInt9251 = 78642;
		this.anInt9252 = 128;
		this.anInt9249 = 0;
		this.anInt9254 = 0;
		this.aClass22_49 = new Class22(16);
		this.anInt9255 = -1;
		try {
			this.aClass22_50 = new Class22(256);
			this.aClass76_Sub3_2 = new Class76_Sub3();
			this.method8088(1);
			this.method8062(0);
			Static28.method489(true, true);
			this.aBoolean672 = true;
			this.anInt9222 = (int) Static99.method1701();
		} catch (@Pc(99) Throwable local99) {
			local99.printStackTrace();
			this.method8148();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "()Z")
	@Override
	public boolean method8070() {
		return false;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIF)Lclient!mfa;")
	@Override
	public Class2_Sub13 method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "(I)I")
	public int method8149(@OriginalArg(0) int arg0) {
		return super.anInterface3_12.method1941(arg0).anInt4370;
	}

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "()Z")
	@Override
	public boolean method8101() {
		return false;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!vr;Lclient!vr;FLclient!vr;)Lclient!vr;")
	@Override
	public Class3 method8071(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "()Z")
	@Override
	public boolean method8110() {
		return false;
	}

	@OriginalMember(owner = "client!rp", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt9242;
		@Pc(35) int local35 = this.anInt9242 - arg2;
		if (arg1 + arg3 > this.anInt9232) {
			arg3 -= arg1 + arg3 - this.anInt9232;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt9238) {
			local59 = this.anInt9238 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt9242;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt9254) {
			local59 = arg0 + arg2 - this.anInt9254;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt9244) {
			local59 = this.anInt9244 - arg0;
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
						this.anIntArray471[local30++] = arg4;
					} else {
						this.anIntArray471[local30++] = arg5;
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
					local245 = this.anIntArray471[local30];
					this.anIntArray471[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray471[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray471[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!rp", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass76_Sub3_2.aFloat213 + this.aClass76_Sub3_2.aFloat206 * (float) arg0 + this.aClass76_Sub3_2.aFloat205 * (float) arg1 + this.aClass76_Sub3_2.aFloat207 * (float) arg2;
		if (local24 < (float) this.anInt9228 || local24 > (float) this.anInt9243) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(82) int local82 = (int) ((float) this.anInt9231 * (this.aClass76_Sub3_2.aFloat210 + this.aClass76_Sub3_2.aFloat215 * (float) arg0 + this.aClass76_Sub3_2.aFloat204 * (float) arg1 + this.aClass76_Sub3_2.aFloat209 * (float) arg2) / (float) arg3);
		@Pc(115) int local115 = (int) ((float) this.anInt9237 * (this.aClass76_Sub3_2.aFloat211 + this.aClass76_Sub3_2.aFloat212 * (float) arg0 + this.aClass76_Sub3_2.aFloat214 * (float) arg1 + this.aClass76_Sub3_2.aFloat208 * (float) arg2) / (float) arg3);
		if (local82 >= this.anInt9233 && local82 <= this.anInt9234 && local115 >= this.anInt9248 && local115 <= this.anInt9239) {
			arg4[0] = local82 - this.anInt9233;
			arg4[1] = local115 - this.anInt9248;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!tv;")
	public Class352 method8150(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9253; local1++) {
			if (this.aClass352Array1[local1].aRunnable2 == arg0) {
				return this.aClass352Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
	@Override
	public void method8062(@OriginalArg(0) int arg0) {
		this.aClass352Array1[arg0].method8873(Thread.currentThread());
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt9244) {
					arg1 += local104 * (this.anInt9244 - arg0);
					arg0 = this.anInt9244;
				}
				if (arg2 >= this.anInt9254) {
					arg2 = this.anInt9254 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt9238 && local150 < this.anInt9232) {
							this.anIntArray471[arg0 + local150 * this.anInt9242] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt9238 && local213 < this.anInt9232) {
							local228 = arg0 + local213 * this.anInt9242;
							local233 = this.anIntArray471[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray471[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt9238 && local150 < this.anInt9232) {
							local213 = arg0 + local150 * this.anInt9242;
							local228 = this.anIntArray471[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray471[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt9238) {
					arg0 += local104 * (this.anInt9238 - arg1);
					arg1 = this.anInt9238;
				}
				if (arg3 >= this.anInt9232) {
					arg3 = this.anInt9232 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt9244 && local150 < this.anInt9254) {
							this.anIntArray471[local150 + arg1 * this.anInt9242] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt9244 && local213 < this.anInt9254) {
							local228 = local213 + arg1 * this.anInt9242;
							local233 = this.anIntArray471[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray471[local213 + arg1 * this.anInt9242] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt9244 && local150 < this.anInt9254) {
							local213 = local150 + arg1 * this.anInt9242;
							local228 = this.anIntArray471[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray471[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!rp", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt9244 < arg0) {
			this.anInt9244 = arg0;
		}
		if (this.anInt9238 < arg1) {
			this.anInt9238 = arg1;
		}
		if (this.anInt9254 > arg2) {
			this.anInt9254 = arg2;
		}
		if (this.anInt9232 > arg3) {
			this.anInt9232 = arg3;
		}
		this.method8159();
	}

	@OriginalMember(owner = "client!rp", name = "v", descriptor = "()Z")
	@Override
	public boolean method8133() {
		return false;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIZ)Lclient!mq;")
	@Override
	public Class71 method8079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class71_Sub1_Sub3(this, arg0, arg1) : new Class71_Sub1_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "()Z")
	@Override
	public boolean method8102() {
		return true;
	}

	@OriginalMember(owner = "client!rp", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.anInt9249;
		this.anInt9249 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!vr;)V")
	@Override
	public void method8068(@OriginalArg(0) Class3 arg0) {
	}

	@OriginalMember(owner = "client!rp", name = "y", descriptor = "()Z")
	@Override
	public boolean method8136() {
		return false;
	}

	@OriginalMember(owner = "client!rp", name = "z", descriptor = "()Lclient!dm;")
	@Override
	public Class76 method8141() {
		return new Class76_Sub3();
	}

	@OriginalMember(owner = "client!rp", name = "u", descriptor = "()Z")
	@Override
	public boolean method8128() {
		return false;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!lf;Lclient!jk;)Lclient!rs;")
	@Override
	public Interface17 method8131(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Interface8 arg1) {
		return new Class132(this, (Class71) arg0, (Class349) arg1);
	}

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt9228;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8092(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub2 local8 = (Class2_Sub2) this.aClass335_38.method8357((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method9825();
		local8 = Static477.method7614(arg1, arg2, arg0);
		this.aClass335_38.method8356(local8, (long) arg0.hashCode());
		if (this.aCanvas12 != arg0 || this.lb != null) {
			return;
		}
		@Pc(37) Dimension local37 = arg0.getSize();
		this.anInt9224 = local37.width;
		this.anInt9223 = local37.height;
		this.aClass2_Sub2_1 = local8;
		this.anIntArray471 = local8.anIntArray422;
		this.anInt9242 = local8.anInt8384;
		this.anInt9245 = local8.anInt8383;
		if (this.anInt9242 != this.anInt9226 || this.anInt9245 != this.anInt9229) {
			this.anInt9240 = this.anInt9226 = this.anInt9242;
			this.anInt9235 = this.anInt9229 = this.anInt9245;
			this.aFloatArray59 = this.aFloatArray58 = new float[this.anInt9226 * this.anInt9229];
		}
		this.method8153();
	}

	@OriginalMember(owner = "client!rp", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt9244 == 0 && this.anInt9254 == this.anInt9242 && this.anInt9238 == 0 && this.anInt9232 == this.anInt9245) {
			local19 = this.aFloatArray58.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.aFloatArray58[local27++] = 2.14748365E9F;
				this.aFloatArray58[local27++] = 2.14748365E9F;
				this.aFloatArray58[local27++] = 2.14748365E9F;
				this.aFloatArray58[local27++] = 2.14748365E9F;
				this.aFloatArray58[local27++] = 2.14748365E9F;
				this.aFloatArray58[local27++] = 2.14748365E9F;
				this.aFloatArray58[local27++] = 2.14748365E9F;
				this.aFloatArray58[local27++] = 2.14748365E9F;
			}
			while (local27 < local19) {
				this.aFloatArray58[local27++] = 2.14748365E9F;
			}
			return;
		}
		local19 = this.anInt9254 - this.anInt9244;
		local25 = this.anInt9232 - this.anInt9238;
		local27 = this.anInt9242 - local19;
		@Pc(116) int local116 = this.anInt9244 + this.anInt9238 * this.anInt9242;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8082(@OriginalArg(0) Class2_Sub5 arg0) {
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIIII)V")
	private void method8151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt9244 || arg0 >= this.anInt9254) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt9242;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg1 + local37 >= this.anInt9238 && arg1 + local37 < this.anInt9232 && local27 < arg4) {
					this.anIntArray471[local15 + local37 * this.anInt9242] = arg3;
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
			if (arg1 + local106 >= this.anInt9238 && arg1 + local106 < this.anInt9232 && local27 < arg4) {
				@Pc(129) int local129 = local15 + local106 * this.anInt9242;
				@Pc(134) int local134 = this.anIntArray471[local129];
				@Pc(154) int local154 = ((local134 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local134 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray471[local129] = local100 + local154;
			}
			local106++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!rp", name = "t", descriptor = "()V")
	@Override
	public void method8125() {
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray220;
		@Pc(8) int[] local8 = local2.anIntArray221;
		@Pc(17) int local17 = this.anInt9238 > arg7 ? this.anInt9238 : arg7;
		@Pc(32) int local32 = this.anInt9232 < arg7 + local5.length ? this.anInt9232 : arg7 + local5.length;
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
					if (local129 >= this.anInt9244 && local129 < this.anInt9254 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray471[local129 + arg1 * this.anInt9242] = arg4;
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
					if (local133 >= this.anInt9244 && local133 < this.anInt9254 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt9242;
						local248 = this.anIntArray471[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray471[local133 + arg1 * this.anInt9242] = local201 + local584;
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
		if (arg0 < this.anInt9244) {
			arg1 += local83 * (this.anInt9244 - arg0);
			arg0 = this.anInt9244;
		}
		if (arg2 >= this.anInt9254) {
			arg2 = this.anInt9254 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray471[arg0 + local129 * this.anInt9242] = arg4;
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
					local243 = arg0 + local133 * this.anInt9242;
					local248 = this.anIntArray471[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray471[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!rp", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass352Array1.length; local1++) {
			this.aClass352Array1[local1].anInt10255 = this.aClass352Array1[local1].anInt10257;
			this.aClass352Array1[local1].anInt10260 = arg0;
			this.aClass352Array1[local1].anInt10257 = arg1;
			this.aClass352Array1[local1].anInt10252 = arg2;
			this.aClass352Array1[local1].aBoolean745 = true;
		}
	}

	@OriginalMember(owner = "client!rp", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!rp", name = "w", descriptor = "()Z")
	@Override
	public boolean method8134() {
		return false;
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "()Lclient!dm;")
	@Override
	public Class76 method8085() {
		@Pc(3) Class352 local3 = this.method8150(Thread.currentThread());
		return local3.aClass76_Sub3_3;
	}

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "()Z")
	@Override
	public boolean method8114() {
		return true;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class352 local3 = this.method8150(Thread.currentThread());
		@Pc(6) Class189 local6 = local3.aClass189_2;
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
		@Pc(105) int local105 = arg0 - local6.method4916();
		@Pc(110) int local110 = arg1 - local6.method4921();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt5424 = 0;
		this.C(false);
		local6.aBoolean399 = local114 < 0 || local114 > local6.anInt5420 || local118 < 0 || local118 > local6.anInt5420 || local124 < 0 || local124 > local6.anInt5420;
		local6.method4925((float) local134, (float) local138, (float) local144, (float) local114, (float) local118, (float) local124, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean399 = local114 < 0 || local114 > local6.anInt5420 || local124 < 0 || local124 > local6.anInt5420 || local130 < 0 || local130 > local6.anInt5420;
		local6.method4925((float) local134, (float) local144, (float) local150, (float) local114, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "(IIIIII)V")
	private void method8152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt9238) {
			local8 = this.anInt9238;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt9232) {
			local21 = this.anInt9232;
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
				if (local91 < this.anInt9244) {
					local91 = this.anInt9244;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9254) {
					local102 = this.anInt9254;
				}
				local116 = local91 + local30 * this.anInt9242;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray58[local116]) {
						this.anIntArray471[local116] = arg4;
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
				if (local91 < this.anInt9244) {
					local91 = this.anInt9244;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9254 - 1) {
					local102 = this.anInt9254 - 1;
				}
				local116 = local91 + local30 * this.anInt9242;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray58[local116]) {
						this.anIntArray471[local116] = arg4;
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
				if (local102 < this.anInt9244) {
					local102 = this.anInt9244;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt9254) {
					local116 = this.anInt9254;
				}
				local118 = local102 + local30 * this.anInt9242;
				for (local350 = local102; local350 < local116; local350++) {
					if ((float) arg2 < this.aFloatArray58[local118]) {
						local364 = this.anIntArray471[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray471[local118] = local293 + local364;
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
				if (local102 < this.anInt9244) {
					local102 = this.anInt9244;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt9254 - 1) {
					local116 = this.anInt9254 - 1;
				}
				local118 = local102 + local30 * this.anInt9242;
				for (local350 = local102; local350 <= local116; local350++) {
					if ((float) arg2 < this.aFloatArray58[local118]) {
						local364 = this.anIntArray471[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray471[local118] = local293 + local364;
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
				if (local91 < this.anInt9244) {
					local91 = this.anInt9244;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9254) {
					local102 = this.anInt9254;
				}
				local116 = local91 + local30 * this.anInt9242;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray58[local116]) {
						local350 = this.anIntArray471[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(643) int local643 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray471[local116] = local364 - local643 | local643 - (local643 >>> 8);
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
				if (local91 < this.anInt9244) {
					local91 = this.anInt9244;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9254 - 1) {
					local102 = this.anInt9254 - 1;
				}
				local116 = local91 + local30 * this.anInt9242;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray58[local116]) {
						local350 = this.anIntArray471[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray471[local116] = local364 - local350 | local350 - (local350 >>> 8);
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

	@OriginalMember(owner = "client!rp", name = "s", descriptor = "()V")
	@Override
	protected void method8124() {
		if (this.aBoolean672) {
			Static508.method7933(false, true);
			this.aBoolean672 = false;
		}
		this.aClass2_Sub2_1 = null;
		this.aCanvas12 = null;
		this.anInt9224 = 0;
		this.anInt9223 = 0;
		this.aClass335_38 = null;
		this.aBoolean671 = true;
	}

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "()V")
	private void method8153() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9253; local1++) {
			this.aClass352Array1[local1].method8872();
		}
		this.la();
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(II)Lclient!lf;")
	@Override
	public Interface11 method8084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method8079(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "(IIIIII)Lclient!vr;")
	@Override
	public Class3 method8130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "(II)I")
	@Override
	public int method8095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!rp", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt9244 || arg0 >= this.anInt9254) {
			return;
		}
		if (arg1 < this.anInt9238) {
			arg2 -= this.anInt9238 - arg1;
			arg1 = this.anInt9238;
		}
		if (arg1 + arg2 > this.anInt9232) {
			arg2 = this.anInt9232 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt9242;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray471[local40 + local54 * this.anInt9242] = arg3;
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
				local111 = local40 + local103 * this.anInt9242;
				local116 = this.anIntArray471[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray471[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt9242;
				local111 = this.anIntArray471[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray471[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!gka;I)V")
	@Override
	public void method8115(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class352 local3 = this.method8150(Thread.currentThread());
		@Pc(7) Class15_Sub2 local7 = arg0.aClass390_1.aClass15_Sub2_9;
		for (@Pc(10) Class15_Sub2 local10 = local7.aClass15_Sub2_8; local10 != local7; local10 = local10.aClass15_Sub2_8) {
			@Pc(14) Class15_Sub2_Sub1 local14 = (Class15_Sub2_Sub1) local10;
			@Pc(19) int local19 = local14.anInt10896 >> 12;
			@Pc(24) int local24 = local14.anInt10899 >> 12;
			@Pc(29) int local29 = local14.anInt10900 >> 12;
			@Pc(54) float local54 = this.aClass76_Sub3_2.aFloat213 + this.aClass76_Sub3_2.aFloat206 * (float) local19 + this.aClass76_Sub3_2.aFloat205 * (float) local24 + this.aClass76_Sub3_2.aFloat207 * (float) local29;
			if (!(local54 < (float) this.anInt9228) && !(local54 > (float) local3.anInt10256)) {
				@Pc(103) int local103 = this.anInt9246 + (int) ((float) this.anInt9231 * (this.aClass76_Sub3_2.aFloat210 + this.aClass76_Sub3_2.aFloat215 * (float) local19 + this.aClass76_Sub3_2.aFloat204 * (float) local24 + this.aClass76_Sub3_2.aFloat209 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt9247 + (int) ((float) this.anInt9237 * (this.aClass76_Sub3_2.aFloat211 + this.aClass76_Sub3_2.aFloat212 * (float) local19 + this.aClass76_Sub3_2.aFloat214 * (float) local24 + this.aClass76_Sub3_2.aFloat208 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt9244 && local103 <= this.anInt9254 && local139 >= this.anInt9238 && local139 <= this.anInt9232) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method8162(local14, local103, local139, (int) local54, (local14.anInt10903 * this.anInt9231 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "(I)Z")
	public boolean method8154(@OriginalArg(0) int arg0) {
		return super.anInterface3_12.method1941(arg0).aBoolean331 || super.anInterface3_12.method1941(arg0).aBoolean335;
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method8129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!rp", name = "q", descriptor = "()Z")
	@Override
	public boolean method8117() {
		return true;
	}

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "()Lclient!ev;")
	@Override
	public Class99 method8090() {
		return new Class99(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!rp", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass76_Sub3_2.aFloat213 + this.aClass76_Sub3_2.aFloat206 * (float) arg0 + this.aClass76_Sub3_2.aFloat205 * (float) arg1 + this.aClass76_Sub3_2.aFloat207 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = (int) ((float) this.anInt9231 * (this.aClass76_Sub3_2.aFloat210 + this.aClass76_Sub3_2.aFloat215 * (float) arg0 + this.aClass76_Sub3_2.aFloat204 * (float) arg1 + this.aClass76_Sub3_2.aFloat209 * (float) arg2) / local24);
		@Pc(105) int local105 = (int) ((float) this.anInt9237 * (this.aClass76_Sub3_2.aFloat211 + this.aClass76_Sub3_2.aFloat212 * (float) arg0 + this.aClass76_Sub3_2.aFloat214 * (float) arg1 + this.aClass76_Sub3_2.aFloat208 * (float) arg2) / local24);
		arg3[0] = local73 - this.anInt9233;
		arg3[1] = local105 - this.anInt9248;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!rp", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9244;
		arg0[1] = this.anInt9238;
		arg0[2] = this.anInt9254;
		arg0[3] = this.anInt9232;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method8155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface3_12.method1941(arg6).aBoolean329) {
			this.method8152(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt9255 != arg6) {
			@Pc(26) Class71 local26 = (Class71) this.aClass22_49.method462((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method8160(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(44) int local44 = this.method8156(arg6) ? 64 : this.anInt9252;
				local26 = this.method8111(local44, local32, local44, local44);
				this.aClass22_49.method470((long) arg6, local26);
			}
			this.anInt9255 = arg6;
			this.aClass71_35 = local26;
		}
		((Class71_Sub1) this.aClass71_35).method6401(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(II)I")
	@Override
	public int method8083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!rp", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt9242 + arg0;
		@Pc(13) int local13 = arg1 * this.anInt9226 + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(21) int[] local21 = this.anIntArray471;
		@Pc(24) float[] local24 = this.aFloatArray58;
		@Pc(31) int local31;
		if (local6 < 0) {
			local31 = local21.length + local6;
			Static679.method4128(local21, -local6, local21, 0, local31);
		} else if (local6 > 0) {
			local31 = local21.length - local6;
			Static679.method4128(local21, 0, local21, local6, local31);
		}
		if (local13 < 0) {
			local31 = local24.length + local13;
			Static679.method4133(local24, -local13, local24, 0, local31);
		} else if (local13 > 0) {
			local31 = local24.length - local13;
			Static679.method4133(local24, 0, local24, local13, local31);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "([I)V")
	@Override
	public void method8106(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9242;
		arg0[1] = this.anInt9245;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V")
	@Override
	public void method8081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas12 == null || this.aClass2_Sub2_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas12.getGraphics();
			this.aClass2_Sub2_1.method7474(this.anInt9223, arg1, 0, arg0, this.anInt9224, 0, local14);
		} catch (@Pc(29) Exception local29) {
			this.aCanvas12.repaint();
		}
	}

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "(I)Z")
	public boolean method8156(@OriginalArg(0) int arg0) {
		return this.aBoolean673 || super.anInterface3_12.method1941(arg0).aBoolean333;
	}

	@OriginalMember(owner = "client!rp", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass352Array1.length; local1++) {
			this.aClass352Array1[local1].anInt10257 = this.aClass352Array1[local1].anInt10255;
			this.aClass352Array1[local1].aBoolean745 = false;
		}
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(Z)V")
	@Override
	public void method8121(@OriginalArg(0) boolean arg0) {
		this.aBoolean673 = arg0;
		this.aClass22_50.method461();
	}

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "(I)V")
	@Override
	public void method8118(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt9222;
		for (@Pc(9) Object local9 = this.aClass22_50.method467(); local9 != null; local9 = this.aClass22_50.method475()) {
			@Pc(13) Class2_Sub23 local13 = (Class2_Sub23) local9;
			if (local13.aBoolean190) {
				local13.anInt2538 += local4;
				@Pc(27) int local27 = local13.anInt2538 / 20;
				if (local27 > 0) {
					@Pc(36) Class136 local36 = super.anInterface3_12.method1941(local13.anInt2536);
					local13.method2351(local36.aByte61 * local4 * 50 / 1000, local36.aByte65 * local4 * 50 / 1000);
					local13.anInt2538 -= local27 * 20;
				}
				local13.aBoolean190 = false;
			}
		}
		this.anInt9222 = arg0;
		this.aClass22_49.method468(5);
		this.aClass22_50.method468(5);
	}

	@OriginalMember(owner = "client!rp", name = "x", descriptor = "()Z")
	@Override
	public boolean method8135() {
		return true;
	}

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "(I)I")
	public int method8157(@OriginalArg(0) int arg0) {
		return super.anInterface3_12.method1941(arg0).aShort48 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rp", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class352 local3 = this.method8150(Thread.currentThread());
		local3.aBoolean746 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!de;Z)Lclient!mq;")
	@Override
	public Class71 method8063(@OriginalArg(0) Class67 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray91;
		@Pc(5) byte[] local5 = arg0.aByteArray19;
		@Pc(8) int local8 = arg0.anInt1761;
		@Pc(11) int local11 = arg0.anInt1759;
		@Pc(76) Class71_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray20 == null) {
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
			local76 = new Class71_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray20;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class71_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class71_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.method7690(arg0.anInt1760, arg0.anInt1763, arg0.anInt1762, arg0.anInt1764);
		return local76;
	}

	@OriginalMember(owner = "client!rp", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt9238 || arg1 >= this.anInt9232) {
			return;
		}
		if (arg0 < this.anInt9244) {
			arg2 -= this.anInt9244 - arg0;
			arg0 = this.anInt9244;
		}
		if (arg0 + arg2 > this.anInt9254) {
			arg2 = this.anInt9254 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt9242;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray471[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray471[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray471[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray471[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray471[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rp", name = "n", descriptor = "(I)Z")
	public boolean method8158(@OriginalArg(0) int arg0) {
		return super.anInterface3_12.method1940(arg0);
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "()Z")
	@Override
	public boolean method8086() {
		return false;
	}

	@OriginalMember(owner = "client!rp", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray220;
		@Pc(8) int[] local8 = local2.anIntArray221;
		@Pc(20) int local20;
		if (this.anInt9232 < arg3 + local5.length) {
			local20 = this.anInt9232 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt9238 > arg3) {
			local33 = this.anInt9238 - arg3;
			arg3 = this.anInt9238;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt9242;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt9244 > local58) {
				local62 -= this.anInt9244 - local58;
				local58 = this.anInt9244;
			}
			if (this.anInt9254 < local58 + local62) {
				local62 = this.anInt9254 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray471[local58++] = arg0;
			}
			local49 += this.anInt9242;
		}
	}

	@OriginalMember(owner = "client!rp", name = "B", descriptor = "()V")
	private void method8159() {
		this.anInt9233 = this.anInt9244 - this.anInt9246;
		this.anInt9234 = this.anInt9254 - this.anInt9246;
		this.anInt9248 = this.anInt9238 - this.anInt9247;
		this.anInt9239 = this.anInt9232 - this.anInt9247;
		for (@Pc(29) int local29 = 0; local29 < this.anInt9253; local29++) {
			@Pc(36) Class189 local36 = this.aClass352Array1[local29].aClass189_2;
			local36.anInt5419 = this.anInt9246 - this.anInt9244;
			local36.anInt5422 = this.anInt9247 - this.anInt9238;
			local36.anInt5420 = this.anInt9254 - this.anInt9244;
			local36.anInt5421 = this.anInt9232 - this.anInt9238;
		}
		@Pc(78) int local78 = this.anInt9238 * this.anInt9242 + this.anInt9244;
		for (@Pc(81) int local81 = this.anInt9238; local81 < this.anInt9232; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt9253; local84++) {
				this.aClass352Array1[local84].aClass189_2.anIntArray276[local81 - this.anInt9238] = local78;
			}
			local78 += this.anInt9242;
		}
	}

	@OriginalMember(owner = "client!rp", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt9225 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!rp", name = "A", descriptor = "()V")
	@Override
	public void method8147() {
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIZ)Lclient!mq;")
	@Override
	public Class71 method8077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt9242 + arg0;
		@Pc(16) int local16 = this.anInt9242 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray471[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class71_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class71_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!rp", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt9242 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray471[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8074(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas12 == arg0) {
			this.method8144((Canvas) null);
		}
		@Pc(15) Class2_Sub2 local15 = (Class2_Sub2) this.aClass335_38.method8357((long) arg0.hashCode());
		if (local15 != null) {
			local15.method9825();
		}
	}

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "()V")
	@Override
	public void method8107() {
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I[Lclient!mfa;)V")
	@Override
	public void method8094(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13[] arg1) {
	}

	@OriginalMember(owner = "client!rp", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass76_Sub3_2.aFloat213 + this.aClass76_Sub3_2.aFloat206 * (float) arg0 + this.aClass76_Sub3_2.aFloat205 * (float) arg1 + this.aClass76_Sub3_2.aFloat207 * (float) arg2;
		if (local24 < (float) this.anInt9228 || local24 > (float) this.anInt9243) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt9231 * (this.aClass76_Sub3_2.aFloat210 + this.aClass76_Sub3_2.aFloat215 * (float) arg0 + this.aClass76_Sub3_2.aFloat204 * (float) arg1 + this.aClass76_Sub3_2.aFloat209 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt9237 * (this.aClass76_Sub3_2.aFloat211 + this.aClass76_Sub3_2.aFloat212 * (float) arg0 + this.aClass76_Sub3_2.aFloat214 * (float) arg1 + this.aClass76_Sub3_2.aFloat208 * (float) arg2) / local24);
		if (local81 >= this.anInt9233 && local81 <= this.anInt9234 && local113 >= this.anInt9248 && local113 <= this.anInt9239) {
			arg3[0] = local81 - this.anInt9233;
			arg3[1] = local113 - this.anInt9248;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!rp", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass76_Sub3_2.aFloat206 * (float) arg0 + this.aClass76_Sub3_2.aFloat205 * (float) arg1 + this.aClass76_Sub3_2.aFloat207 * (float) arg2 + this.aClass76_Sub3_2.aFloat213;
		@Pc(49) float local49 = this.aClass76_Sub3_2.aFloat206 * (float) arg3 + this.aClass76_Sub3_2.aFloat205 * (float) arg4 + this.aClass76_Sub3_2.aFloat207 * (float) arg5 + this.aClass76_Sub3_2.aFloat213;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt9228 && local49 < (float) this.anInt9228) {
			local51 |= 0x10;
		} else if (local24 > (float) this.anInt9243 && local49 > (float) this.anInt9243) {
			local51 |= 0x20;
		}
		@Pc(117) int local117 = (int) ((float) this.anInt9231 * (this.aClass76_Sub3_2.aFloat215 * (float) arg0 + this.aClass76_Sub3_2.aFloat204 * (float) arg1 + this.aClass76_Sub3_2.aFloat209 * (float) arg2 + this.aClass76_Sub3_2.aFloat210) / (float) arg6);
		@Pc(150) int local150 = (int) ((float) this.anInt9231 * (this.aClass76_Sub3_2.aFloat215 * (float) arg3 + this.aClass76_Sub3_2.aFloat204 * (float) arg4 + this.aClass76_Sub3_2.aFloat209 * (float) arg5 + this.aClass76_Sub3_2.aFloat210) / (float) arg6);
		if (local117 < this.anInt9233 && local150 < this.anInt9233) {
			local51 |= 0x1;
		} else if (local117 > this.anInt9234 && local150 > this.anInt9234) {
			local51 |= 0x2;
		}
		@Pc(208) int local208 = (int) ((float) this.anInt9237 * (this.aClass76_Sub3_2.aFloat212 * (float) arg0 + this.aClass76_Sub3_2.aFloat214 * (float) arg1 + this.aClass76_Sub3_2.aFloat208 * (float) arg2 + this.aClass76_Sub3_2.aFloat211) / (float) arg6);
		@Pc(241) int local241 = (int) ((float) this.anInt9237 * (this.aClass76_Sub3_2.aFloat212 * (float) arg3 + this.aClass76_Sub3_2.aFloat214 * (float) arg4 + this.aClass76_Sub3_2.aFloat208 * (float) arg5 + this.aClass76_Sub3_2.aFloat211) / (float) arg6);
		if (local208 < this.anInt9248 && local241 < this.anInt9248) {
			local51 |= 0x4;
		} else if (local208 > this.anInt9239 && local241 > this.anInt9239) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!rp", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass76_Sub3_2.aFloat206 * (float) arg0 + this.aClass76_Sub3_2.aFloat205 * (float) arg1 + this.aClass76_Sub3_2.aFloat207 * (float) arg2 + this.aClass76_Sub3_2.aFloat213;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass76_Sub3_2.aFloat206 * (float) arg3 + this.aClass76_Sub3_2.aFloat205 * (float) arg4 + this.aClass76_Sub3_2.aFloat207 * (float) arg5 + this.aClass76_Sub3_2.aFloat213;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt9228 && local57 < (float) this.anInt9228) {
			local1 |= 0x10;
		} else if (local26 > (float) this.anInt9243 && local57 > (float) this.anInt9243) {
			local1 |= 0x20;
		}
		@Pc(128) int local128 = (int) ((float) this.anInt9231 * (this.aClass76_Sub3_2.aFloat215 * (float) arg0 + this.aClass76_Sub3_2.aFloat204 * (float) arg1 + this.aClass76_Sub3_2.aFloat209 * (float) arg2 + this.aClass76_Sub3_2.aFloat210) / local26);
		@Pc(160) int local160 = (int) ((float) this.anInt9231 * (this.aClass76_Sub3_2.aFloat215 * (float) arg3 + this.aClass76_Sub3_2.aFloat204 * (float) arg4 + this.aClass76_Sub3_2.aFloat209 * (float) arg5 + this.aClass76_Sub3_2.aFloat210) / local57);
		if (local128 < this.anInt9233 && local160 < this.anInt9233) {
			local1 |= 0x1;
		} else if (local128 > this.anInt9234 && local160 > this.anInt9234) {
			local1 |= 0x2;
		}
		@Pc(217) int local217 = (int) ((float) this.anInt9237 * (this.aClass76_Sub3_2.aFloat212 * (float) arg0 + this.aClass76_Sub3_2.aFloat214 * (float) arg1 + this.aClass76_Sub3_2.aFloat208 * (float) arg2 + this.aClass76_Sub3_2.aFloat211) / local26);
		@Pc(249) int local249 = (int) ((float) this.anInt9237 * (this.aClass76_Sub3_2.aFloat212 * (float) arg3 + this.aClass76_Sub3_2.aFloat214 * (float) arg4 + this.aClass76_Sub3_2.aFloat208 * (float) arg5 + this.aClass76_Sub3_2.aFloat211) / local57);
		if (local217 < this.anInt9248 && local249 < this.anInt9248) {
			local1 |= 0x4;
		} else if (local217 > this.anInt9239 && local249 > this.anInt9239) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!rp", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt9250;
		this.anInt9250 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.anInt9226 - arg2;
		@Pc(11) int local11 = arg1 * this.anInt9226 + arg0;
		@Pc(14) float[] local14 = this.aFloatArray58;
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

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "(I)V")
	@Override
	public void method8122(@OriginalArg(0) int arg0) {
		this.anInt9252 = arg0;
		this.aClass22_50.method461();
	}

	@OriginalMember(owner = "client!rp", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt9242, this.anInt9245, arg0, 0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray220;
		@Pc(8) int[] local8 = local2.anIntArray221;
		@Pc(17) int local17 = this.anInt9238 > arg7 ? this.anInt9238 : arg7;
		@Pc(32) int local32 = this.anInt9232 < arg7 + local5.length ? this.anInt9232 : arg7 + local5.length;
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
					if (arg1 >= local17 && arg1 < local32 && local172 >= this.anInt9244 && local172 < this.anInt9254 && arg10 < local40 && local172 >= arg6 + local5[local176] && local172 < arg6 + local5[local176] + local8[local176]) {
						this.anIntArray471[local172 + arg1 * this.anInt9242] = arg4;
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
					if (arg1 >= local17 && arg1 < local32 && local176 >= this.anInt9244 && local176 < this.anInt9254 && arg10 < local40 && local176 >= arg6 + local5[local199] && local176 < arg6 + local5[local199] + local8[local199]) {
						local299 = local176 + arg1 * this.anInt9242;
						local316 = this.anIntArray471[local299];
						@Pc(707) int local707 = ((local316 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local316 & 0xFF00) * local172 >> 8 & 0xFF00);
						this.anIntArray471[local176 + arg1 * this.anInt9242] = local263 + local707;
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
				if (arg0 >= this.anInt9244 && arg0 < this.anInt9254 && local172 >= local17 && local172 < local32 && arg10 < local40) {
					local199 = arg6 + local5[local176];
					if (arg0 >= local199 && arg0 < local199 + local8[local176]) {
						this.anIntArray471[arg0 + local172 * this.anInt9242] = arg4;
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
			if (arg0 >= this.anInt9244 && arg0 < this.anInt9254 && local176 >= local17 && local176 < local32 && arg10 < local40) {
				local299 = arg6 + local5[local199];
				if (arg0 >= local299 && arg0 < local299 + local8[local199]) {
					local316 = arg0 + local176 * this.anInt9242;
					@Pc(321) int local321 = this.anIntArray471[local316];
					@Pc(341) int local341 = ((local321 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local321 & 0xFF00) * local172 >> 8 & 0xFF00);
					this.anIntArray471[local316] = local263 + local341;
				}
			}
			arg1 += local77;
			arg0++;
			local36 = arg10 + local159;
			arg10 = local36 % local48;
		}
	}

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "()I")
	@Override
	public int method8109() {
		return 0;
	}

	@OriginalMember(owner = "client!rp", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt9246, this.anInt9247, this.anInt9231, this.anInt9237 };
	}

	@OriginalMember(owner = "client!rp", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9246 = arg0;
		this.anInt9247 = arg1;
		this.anInt9231 = arg2;
		this.anInt9237 = arg3;
		this.method8159();
	}

	@OriginalMember(owner = "client!rp", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rp", name = "r", descriptor = "()Z")
	@Override
	public boolean method8123() {
		return false;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8143(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas12 == null || this.aClass2_Sub2_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas12.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x + arg2 <= this.anInt9242 && local21.y + arg3 <= this.anInt9245 && local21.x + arg2 + local21.width > 0 && local21.y + arg3 + local21.height > 0) {
					this.aClass2_Sub2_1.method7474(local21.height, local21.y + arg3, local21.x, local21.x + arg2, local21.width, local21.y, local14);
				}
			}
		} catch (@Pc(79) Exception local79) {
			this.aCanvas12.repaint();
		}
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)V")
	@Override
	public void method8098() {
		Static16.anInt296 = 10000;
		Static16.anInt295 = 10000;
		if (this.anInt9253 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method8088(this.anInt9253);
		this.method8062(0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!gka;)V")
	@Override
	public void method8065(@OriginalArg(0) Class127 arg0) {
		@Pc(3) Class352 local3 = this.method8150(Thread.currentThread());
		@Pc(7) Class15_Sub2 local7 = arg0.aClass390_1.aClass15_Sub2_9;
		for (@Pc(10) Class15_Sub2 local10 = local7.aClass15_Sub2_8; local10 != local7; local10 = local10.aClass15_Sub2_8) {
			@Pc(14) Class15_Sub2_Sub1 local14 = (Class15_Sub2_Sub1) local10;
			@Pc(19) int local19 = local14.anInt10896 >> 12;
			@Pc(24) int local24 = local14.anInt10899 >> 12;
			@Pc(29) int local29 = local14.anInt10900 >> 12;
			@Pc(54) float local54 = this.aClass76_Sub3_2.aFloat213 + this.aClass76_Sub3_2.aFloat206 * (float) local19 + this.aClass76_Sub3_2.aFloat205 * (float) local24 + this.aClass76_Sub3_2.aFloat207 * (float) local29;
			if (!(local54 < (float) this.anInt9228) && !(local54 > (float) local3.anInt10256)) {
				@Pc(102) int local102 = this.anInt9246 + (int) ((float) this.anInt9231 * (this.aClass76_Sub3_2.aFloat210 + this.aClass76_Sub3_2.aFloat215 * (float) local19 + this.aClass76_Sub3_2.aFloat204 * (float) local24 + this.aClass76_Sub3_2.aFloat209 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt9247 + (int) ((float) this.anInt9237 * (this.aClass76_Sub3_2.aFloat211 + this.aClass76_Sub3_2.aFloat212 * (float) local19 + this.aClass76_Sub3_2.aFloat214 * (float) local24 + this.aClass76_Sub3_2.aFloat208 * (float) local29) / local54);
				if (local102 >= this.anInt9244 && local102 <= this.anInt9254 && local137 >= this.anInt9238 && local137 <= this.anInt9232) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method8162(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt10903 * this.anInt9231 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "()V")
	@Override
	public void method8072() {
		if (this.aCanvas12 == null) {
			this.anInt9242 = 1;
			this.anInt9245 = 1;
			this.anIntArray471 = null;
			this.anInt9226 = 1;
			this.anInt9229 = 1;
			this.aFloatArray58 = null;
		} else {
			this.anIntArray471 = this.aClass2_Sub2_1.anIntArray422;
			this.anInt9242 = this.aClass2_Sub2_1.anInt8384;
			this.anInt9245 = this.aClass2_Sub2_1.anInt8383;
			this.aFloatArray58 = this.aFloatArray59;
			this.anInt9226 = this.anInt9240;
			this.anInt9229 = this.anInt9235;
		}
		this.lb = null;
		this.method8153();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!rs;)V")
	@Override
	public void method8108(@OriginalArg(0) Interface17 arg0) {
		@Pc(2) Class132 local2 = (Class132) arg0;
		this.anInt9242 = local2.anInt4205;
		this.anInt9245 = local2.anInt4210;
		this.anIntArray471 = local2.anIntArray193;
		this.lb = local2;
		this.anInt9226 = local2.anInt4205;
		this.anInt9229 = local2.anInt4210;
		this.aFloatArray58 = local2.aFloatArray23;
		this.method8153();
	}

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "()V")
	@Override
	public void method8116() {
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)V")
	@Override
	public void method8088(@OriginalArg(0) int arg0) {
		this.anInt9253 = arg0;
		this.aClass352Array1 = new Class352[this.anInt9253];
		for (@Pc(9) int local9 = 0; local9 < this.anInt9253; local9++) {
			this.aClass352Array1[local9] = new Class352(this);
		}
	}

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "(I)[I")
	public int[] method8160(@OriginalArg(0) int arg0) {
		@Pc(2) Class22 local2 = this.aClass22_50;
		@Pc(14) Class2_Sub23 local14;
		synchronized (this.aClass22_50) {
			local14 = (Class2_Sub23) this.aClass22_50.method462((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface3_12.method1940(arg0)) {
					return null;
				}
				@Pc(34) Class136 local34 = super.anInterface3_12.method1941(arg0);
				@Pc(45) int local45 = local34.aBoolean333 || this.aBoolean673 ? 64 : this.anInt9252;
				local14 = new Class2_Sub23(arg0, local45, super.anInterface3_12.method1939(0.7F, arg0, local45, local45), local34.anInt4370 != 1);
				this.aClass22_50.method470((long) arg0 | Long.MIN_VALUE, local14);
			}
		}
		local14.aBoolean190 = true;
		return local14.method2353();
	}

	@OriginalMember(owner = "client!rp", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class352 local3 = this.method8150(Thread.currentThread());
		local3.anInt10260 = arg0;
		local3.anInt10257 = arg1;
		local3.anInt10252 = arg2;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method8164(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local28 = arg5 + arg6;
				local32 = arg7 % local28;
				local32 = local28 + arg5 - local32 - (-arg2 + 1) % local28;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				this.method8164(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
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
						if (arg0 >= this.anInt9244 && arg0 < this.anInt9254 && local267 >= this.anInt9238 && local267 < this.anInt9232 && arg7 < local143) {
							this.anIntArray471[arg0 + local267 * this.anInt9242] = arg4;
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
						if (arg0 >= this.anInt9244 && arg0 < this.anInt9254 && local349 >= this.anInt9238 && local349 < this.anInt9232 && arg7 < local143) {
							local375 = arg0 + local349 * this.anInt9242;
							local380 = this.anIntArray471[local375];
							local380 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray471[local375] = local340 + local380;
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
						if (arg1 >= this.anInt9238 && arg1 < this.anInt9232 && local267 >= this.anInt9244 && local267 < this.anInt9254 && arg7 < local143) {
							this.anIntArray471[local267 + arg1 * this.anInt9242] = arg4;
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
						if (arg1 >= this.anInt9238 && arg1 < this.anInt9232 && local349 >= this.anInt9244 && local349 < this.anInt9254 && arg7 < local143) {
							local375 = local349 + arg1 * this.anInt9242;
							local380 = this.anIntArray471[local375];
							@Pc(708) int local708 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray471[local349 + arg1 * this.anInt9242] = local340 + local708;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method8151(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local28 = arg5 + arg6;
			local32 = arg7 % local28;
			local32 = local28 + arg5 - local32 - (-arg3 + 1) % local28;
			arg7 = local32 % local28;
			if (arg7 < 0) {
				arg7 += local28;
			}
			this.method8151(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!rp", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass352Array1.length; local1++) {
			@Pc(7) Class352 local7 = this.aClass352Array1[local1];
			local7.anInt10257 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt10257 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt10257 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt10257 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt10257 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean744 = false;
			} else {
				local7.aBoolean744 = true;
			}
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "([IIIIIZ)Lclient!mq;")
	@Override
	public Class71 method8105(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class71_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class71_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class71_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class71_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8119(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub2 local8 = (Class2_Sub2) this.aClass335_38.method8357((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static477.method7614(arg1, arg2, arg0);
			this.aClass335_38.method8356(local8, (long) arg0.hashCode());
		} else if (local8.anInt8384 != arg1 || local8.anInt8383 != arg2) {
			this.method8092(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V")
	@Override
	public void method8080(@OriginalArg(0) int arg0) {
		this.aClass352Array1[arg0].method8873((Runnable) null);
	}

	@OriginalMember(owner = "client!rp", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt9243;
	}

	@OriginalMember(owner = "client!rp", name = "C", descriptor = "()Z")
	public boolean method8161() {
		return this.aBoolean671;
	}

	@OriginalMember(owner = "client!rp", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt9238) {
			local8 = this.anInt9238;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt9232) {
			local21 = this.anInt9232;
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
				if (local91 < this.anInt9244) {
					local91 = this.anInt9244;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9254) {
					local102 = this.anInt9254;
				}
				local116 = local91 + local30 * this.anInt9242;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray471[local116++] = arg3;
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
				if (local91 < this.anInt9244) {
					local91 = this.anInt9244;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9254 - 1) {
					local102 = this.anInt9254 - 1;
				}
				local116 = local91 + local30 * this.anInt9242;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray471[local116++] = arg3;
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
			if (local102 < this.anInt9244) {
				local102 = this.anInt9244;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt9254) {
				local116 = this.anInt9254;
			}
			local118 = local102 + local30 * this.anInt9242;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray471[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray471[local118++] = local277 + local360;
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
			if (local102 < this.anInt9244) {
				local102 = this.anInt9244;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt9254 - 1) {
				local116 = this.anInt9254 - 1;
			}
			local118 = local102 + local30 * this.anInt9242;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray471[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray471[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!bd;IIII)V")
	private void method8162(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt10902;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method8152(arg1, arg2, arg3, arg4, arg0.anInt10898, 1);
			return;
		}
		if (this.anInt9255 != local2) {
			@Pc(33) Class71 local33 = (Class71) this.aClass22_49.method462((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method8160(local2);
				if (local39 == null) {
					return;
				}
				@Pc(50) int local50 = this.method8156(local2) ? 64 : this.anInt9252;
				local33 = this.method8111(local50, local39, local50, local50);
				this.aClass22_49.method470((long) local2, local33);
			}
			this.anInt9255 = local2;
			this.aClass71_35 = local33;
		}
		local8++;
		((Class71_Sub1) this.aClass71_35).method6401(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt10898, 1);
	}

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "(I)[I")
	public int[] method8163(@OriginalArg(0) int arg0) {
		@Pc(2) Class22 local2 = this.aClass22_50;
		@Pc(12) Class2_Sub23 local12;
		synchronized (this.aClass22_50) {
			local12 = (Class2_Sub23) this.aClass22_50.method462((long) arg0);
			if (local12 == null) {
				if (!super.anInterface3_12.method1940(arg0)) {
					return null;
				}
				@Pc(32) Class136 local32 = super.anInterface3_12.method1941(arg0);
				@Pc(43) int local43 = local32.aBoolean333 || this.aBoolean673 ? 64 : this.anInt9252;
				local12 = new Class2_Sub23(arg0, local43, super.anInterface3_12.method1938(true, 0.7F, local43, arg0, local43), local32.anInt4370 != 1);
				this.aClass22_50.method470((long) arg0, local12);
			}
		}
		local12.aBoolean190 = true;
		return local12.method2353();
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(II)Lclient!jk;")
	@Override
	public Interface8 method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class349(arg0, arg1);
	}

	@OriginalMember(owner = "client!rp", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt9244) {
			arg2 -= this.anInt9244 - arg0;
			arg0 = this.anInt9244;
		}
		if (arg1 < this.anInt9238) {
			arg3 -= this.anInt9238 - arg1;
			arg1 = this.anInt9238;
		}
		if (arg0 + arg2 > this.anInt9254) {
			arg2 = this.anInt9254 - arg0;
		}
		if (arg1 + arg3 > this.anInt9232) {
			arg3 = this.anInt9232 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt9254 || arg1 > this.anInt9232) {
			return;
		}
		@Pc(67) int local67 = this.anInt9242 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt9242;
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
						local217 = this.anIntArray471[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray471[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray471[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray471[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray471[arg2] = arg4;
					arg2++;
					this.anIntArray471[arg2] = arg4;
					arg2++;
					this.anIntArray471[arg2] = arg4;
					arg2++;
					this.anIntArray471[arg2] = arg4;
					arg2++;
					this.anIntArray471[arg2] = arg4;
					arg2++;
					this.anIntArray471[arg2] = arg4;
					arg2++;
					this.anIntArray471[arg2] = arg4;
					arg2++;
					this.anIntArray471[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray471[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8144(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas12 = null;
			this.aClass2_Sub2_1 = null;
			if (this.lb == null) {
				this.anIntArray471 = null;
				this.anInt9242 = this.anInt9245 = 1;
				this.anInt9226 = this.anInt9229 = 1;
				this.method8153();
			}
			return;
		}
		@Pc(10) Class2_Sub2 local10 = (Class2_Sub2) this.aClass335_38.method8357((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas12 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.anInt9224 = local18.width;
		this.anInt9223 = local18.height;
		this.aClass2_Sub2_1 = local10;
		if (this.lb != null) {
			return;
		}
		this.anIntArray471 = local10.anIntArray422;
		this.anInt9242 = local10.anInt8384;
		this.anInt9245 = local10.anInt8383;
		if (this.anInt9242 != this.anInt9226 || this.anInt9245 != this.anInt9229) {
			this.anInt9240 = this.anInt9226 = this.anInt9242;
			this.anInt9235 = this.anInt9229 = this.anInt9245;
			this.aFloatArray59 = this.aFloatArray58 = new float[this.anInt9226 * this.anInt9229];
		}
		this.method8153();
		return;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!dm;)V")
	@Override
	public void method8067(@OriginalArg(0) Class76 arg0) {
		this.aClass76_Sub3_2 = (Class76_Sub3) arg0;
	}

	@OriginalMember(owner = "client!rp", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt9244 = 0;
		this.anInt9238 = 0;
		this.anInt9254 = this.anInt9242;
		this.anInt9232 = this.anInt9245;
		this.method8159();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class18 method8087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class18_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!rp", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt9227 = (int) (arg1 * 65535.0F);
		this.anInt9251 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt9241 = (int) (arg3 * 65535.0F / local26);
		this.anInt9230 = (int) (arg4 * 65535.0F / local26);
		this.anInt9236 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!rp", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt9242) {
			arg2 = this.anInt9242;
		}
		if (arg3 > this.anInt9245) {
			arg3 = this.anInt9245;
		}
		this.anInt9244 = arg0;
		this.anInt9254 = arg2;
		this.anInt9238 = arg1;
		this.anInt9232 = arg3;
		this.method8159();
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(IIIIIIII)V")
	private void method8164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt9238 || arg1 >= this.anInt9232) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt9242;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg0 + local37 >= this.anInt9244 && arg0 + local37 < this.anInt9254 && local27 < arg4) {
					this.anIntArray471[local15 + local37] = arg3;
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
			if (arg0 + local103 >= this.anInt9244 && arg0 + local103 < this.anInt9254 && local27 < arg4) {
				@Pc(126) int local126 = this.anIntArray471[local15 + local103];
				@Pc(146) int local146 = ((local126 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local126 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray471[local15 + local103] = local97 + local146;
			}
			local103++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8138() {
		@Pc(3) Class352 local3 = this.method8150(Thread.currentThread());
		@Pc(6) Class189 local6 = local3.aClass189_2;
		local6.aBoolean402 = false;
		@Pc(14) int local14 = 5 - this.anInt9233;
		@Pc(19) int local19 = 75 - this.anInt9233;
		@Pc(24) int local24 = 15 - this.anInt9233;
		@Pc(29) int local29 = 10 - this.anInt9248;
		@Pc(34) int local34 = 50 - this.anInt9248;
		@Pc(39) int local39 = 90 - this.anInt9248;
		local6.aBoolean399 = local14 < 0 || local14 > local6.anInt5420 || local19 < 0 || local19 > local6.anInt5420 || local24 < 0 || local24 > local6.anInt5420;
		local6.anInt5424 = 0;
		local6.aBoolean400 = false;
		local6.method4924((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		local6.aBoolean402 = true;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!ida;IIII)Lclient!ka;")
	@Override
	public Class14 method8064(@OriginalArg(0) Class159 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class14_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "(I)Lclient!za;")
	@Override
	public Class2_Sub5 method8100(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class352 local3 = this.method8150(Thread.currentThread());
		this.anInt9228 = arg0;
		this.anInt9243 = arg1;
		local3.anInt10256 = this.anInt9243 - 255;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!rt;[Lclient!de;Z)Lclient!da;")
	@Override
	public Class59 method8146(@OriginalArg(0) Class324 arg0, @OriginalArg(1) Class67[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt1761;
			local7[local11] = arg1[local11].anInt1759;
			if (arg1[local11].aByteArray20 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class59_Sub2(this, arg0, arg1, local3, local7);
		} else {
			return new Class59_Sub5(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)V")
	@Override
	public void method8093(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "()V")
	@Override
	public void method8066() {
		this.aClass22_50.method461();
		this.aClass22_49.method461();
	}

	@OriginalMember(owner = "client!rp", name = "n", descriptor = "()Lclient!dm;")
	@Override
	public Class76 method8112() {
		return this.aClass76_Sub3_2;
	}
}
