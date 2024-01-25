import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public abstract class Class90_Sub2 extends Class90 {

	@OriginalMember(owner = "client!fv", name = "s", descriptor = "Lclient!oj;")
	protected Class234 aClass234_43;

	@OriginalMember(owner = "client!fv", name = "t", descriptor = "Ljava/awt/Canvas;")
	protected Canvas aCanvas12;

	@OriginalMember(owner = "client!fv", name = "u", descriptor = "Z")
	private boolean aBoolean547;

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "Z")
	private boolean aBoolean548;

	@OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
	private int anInt8481;

	@OriginalMember(owner = "client!fv", name = "x", descriptor = "Lclient!kg;")
	protected Class6_Sub13 aClass6_Sub13_3;

	@OriginalMember(owner = "client!fv", name = "y", descriptor = "I")
	private int anInt8482;

	@OriginalMember(owner = "client!fv", name = "z", descriptor = "Z")
	private boolean aBoolean549;

	@OriginalMember(owner = "client!fv", name = "A", descriptor = "I")
	private int anInt8483;

	@OriginalMember(owner = "client!fv", name = "B", descriptor = "I")
	private int anInt8484;

	@OriginalMember(owner = "client!fv", name = "C", descriptor = "I")
	private int anInt8485;

	@OriginalMember(owner = "client!fv", name = "D", descriptor = "Lclient!eq;")
	public Class93_Sub1 aClass93_Sub1_8;

	@OriginalMember(owner = "client!fv", name = "E", descriptor = "I")
	public int anInt8486;

	@OriginalMember(owner = "client!fv", name = "F", descriptor = "I")
	public int anInt8487;

	@OriginalMember(owner = "client!fv", name = "G", descriptor = "I")
	public int anInt8488;

	@OriginalMember(owner = "client!fv", name = "H", descriptor = "Lclient!vh;")
	private final Class330 aClass330_59;

	@OriginalMember(owner = "client!fv", name = "I", descriptor = "I")
	protected int anInt8489;

	@OriginalMember(owner = "client!fv", name = "J", descriptor = "I")
	public int anInt8490;

	@OriginalMember(owner = "client!fv", name = "K", descriptor = "I")
	public int anInt8491;

	@OriginalMember(owner = "client!fv", name = "L", descriptor = "Lclient!xa;")
	protected Class71 aClass71_51;

	@OriginalMember(owner = "client!fv", name = "M", descriptor = "I")
	public int anInt8492;

	@OriginalMember(owner = "client!fv", name = "N", descriptor = "I")
	public int anInt8493;

	@OriginalMember(owner = "client!fv", name = "O", descriptor = "I")
	public int anInt8494;

	@OriginalMember(owner = "client!fv", name = "P", descriptor = "I")
	public int anInt8495;

	@OriginalMember(owner = "client!fv", name = "Q", descriptor = "I")
	public int anInt8496;

	@OriginalMember(owner = "client!fv", name = "R", descriptor = "I")
	public int anInt8497;

	@OriginalMember(owner = "client!fv", name = "S", descriptor = "I")
	public int anInt8498;

	@OriginalMember(owner = "client!fv", name = "T", descriptor = "I")
	public int anInt8499;

	@OriginalMember(owner = "client!fv", name = "U", descriptor = "[Lclient!vd;")
	protected Class38[] aClass38Array3;

	@OriginalMember(owner = "client!fv", name = "V", descriptor = "I")
	public int anInt8500;

	@OriginalMember(owner = "client!fv", name = "W", descriptor = "I")
	public int anInt8501;

	@OriginalMember(owner = "client!fv", name = "X", descriptor = "F")
	private float aFloat176;

	@OriginalMember(owner = "client!fv", name = "Y", descriptor = "I")
	public int anInt8502;

	@OriginalMember(owner = "client!fv", name = "Z", descriptor = "I")
	public int anInt8503;

	@OriginalMember(owner = "client!fv", name = "ab", descriptor = "I")
	public int anInt8504;

	@OriginalMember(owner = "client!fv", name = "bb", descriptor = "Z")
	public boolean aBoolean550;

	@OriginalMember(owner = "client!fv", name = "cb", descriptor = "I")
	public int anInt8505;

	@OriginalMember(owner = "client!fv", name = "db", descriptor = "I")
	public int anInt8506;

	@OriginalMember(owner = "client!fv", name = "eb", descriptor = "I")
	public int anInt8507;

	@OriginalMember(owner = "client!fv", name = "fb", descriptor = "Z")
	public boolean aBoolean551;

	@OriginalMember(owner = "client!fv", name = "gb", descriptor = "I")
	public int anInt8508;

	@OriginalMember(owner = "client!fv", name = "hb", descriptor = "Lclient!vh;")
	protected final Class330 aClass330_60;

	@OriginalMember(owner = "client!fv", name = "ib", descriptor = "I")
	public int anInt8509;

	@OriginalMember(owner = "client!fv", name = "jb", descriptor = "[I")
	public int[] anIntArray602;

	@OriginalMember(owner = "client!fv", name = "kb", descriptor = "I")
	public int anInt8510;

	@OriginalMember(owner = "client!fv", name = "lb", descriptor = "F")
	private float lb;

	@OriginalMember(owner = "client!fv", name = "mb", descriptor = "I")
	public int anInt8511;

	@OriginalMember(owner = "client!fv", name = "nb", descriptor = "I")
	public int anInt8512;

	@OriginalMember(owner = "client!fv", name = "ob", descriptor = "Lclient!xa;")
	protected Class71 aClass71_52;

	@OriginalMember(owner = "client!fv", name = "pb", descriptor = "I")
	protected int anInt8513;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class90_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1) {
		this(arg1);
		this.method7507(arg0);
		this.method7472(arg0);
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!e;)V")
	private Class90_Sub2(@OriginalArg(0) Interface2 arg0) {
		super(arg0);
		this.aBoolean547 = false;
		this.aBoolean548 = false;
		this.aClass234_43 = new Class234(4);
		this.anInt8483 = 0;
		this.anInt8485 = 3500;
		this.anInt8491 = 0;
		this.aBoolean549 = false;
		this.anInt8486 = 0;
		this.anInt8503 = 512;
		this.anInt8502 = 75518;
		this.anInt8484 = 0;
		this.anInt8505 = this.anInt8485 - 255;
		this.anInt8494 = 0;
		this.aBoolean551 = false;
		this.anInt8495 = 3500;
		this.anInt8498 = 0;
		this.anInt8499 = 0;
		this.anInt8509 = 0;
		this.anInt8482 = 0;
		this.anInt8510 = 0;
		this.anInt8496 = 50;
		this.anInt8512 = 45823;
		this.anInt8511 = 78642;
		this.anInt8507 = 512;
		this.aClass330_60 = new Class330(16);
		this.anInt8513 = -1;
		this.aClass330_59 = new Class330(256);
		this.aClass93_Sub1_8 = new Class93_Sub1();
		this.method7478(1);
		this.method7491(0);
		Static477.method6609(false, true);
		this.aBoolean548 = true;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public final Class71 method7471(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class71_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class71_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class71_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class71_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "()Z")
	@Override
	public final boolean method7493() {
		return false;
	}

	@OriginalMember(owner = "client!fv", name = "A", descriptor = "()V")
	@Override
	public final void method7514() {
	}

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "(IIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8508 = arg0;
		this.anInt8488 = arg1;
		this.anInt8507 = arg2;
		this.anInt8503 = arg3;
		this.method6760();
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "()I")
	@Override
	public final int method7458() {
		return 0;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIII)Lclient!ka;")
	@Override
	public final Class3 method7456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!fv", name = "B", descriptor = "()Lclient!q;")
	@Override
	public final Class93 method7518() {
		return new Class93_Sub1();
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "()Lclient!q;")
	@Override
	public final Class93 method7455() {
		@Pc(3) Class38 local3 = this.method6761(Thread.currentThread());
		return local3.aClass93_Sub1_7;
	}

	@OriginalMember(owner = "client!fv", name = "X", descriptor = "(III)V")
	@Override
	public final void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8499 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt8499 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt8499 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt8499 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt8499 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean550 = false;
		} else {
			this.aBoolean550 = true;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!ka;Lclient!ka;FLclient!ka;)Lclient!ka;")
	@Override
	public final Class3 method7503(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7472(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt8486) {
					arg1 += local104 * (this.anInt8486 - arg0);
					arg0 = this.anInt8486;
				}
				if (arg2 >= this.anInt8491) {
					arg2 = this.anInt8491 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt8509 && local150 < this.anInt8494) {
							this.anIntArray602[arg0 + local150 * this.anInt8497] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt8509 && local213 < this.anInt8494) {
							local228 = arg0 + local213 * this.anInt8497;
							local233 = this.anIntArray602[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray602[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt8509 && local150 < this.anInt8494) {
							local213 = arg0 + local150 * this.anInt8497;
							local228 = this.anIntArray602[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray602[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt8509) {
					arg0 += local104 * (this.anInt8509 - arg1);
					arg1 = this.anInt8509;
				}
				if (arg3 >= this.anInt8494) {
					arg3 = this.anInt8494 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt8486 && local150 < this.anInt8491) {
							this.anIntArray602[local150 + arg1 * this.anInt8497] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt8486 && local213 < this.anInt8491) {
							local228 = local213 + arg1 * this.anInt8497;
							local233 = this.anIntArray602[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray602[local213 + arg1 * this.anInt8497] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt8486 && local150 < this.anInt8491) {
							local213 = local150 + arg1 * this.anInt8497;
							local228 = this.anIntArray602[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray602[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!fv", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public final boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass93_Sub1_8.anInt2527 * arg0 + this.aClass93_Sub1_8.anInt2523 * arg1 + this.aClass93_Sub1_8.anInt2520 * arg2 >> 14) + this.aClass93_Sub1_8.anInt2526;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass93_Sub1_8.anInt2527 * arg3 + this.aClass93_Sub1_8.anInt2523 * arg4 + this.aClass93_Sub1_8.anInt2520 * arg5 >> 14) + this.aClass93_Sub1_8.anInt2526;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt8496 && local52 < this.anInt8496 || !(local23 <= this.anInt8485 || local52 <= this.anInt8485)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt8507 * ((this.aClass93_Sub1_8.anInt2522 * arg0 + this.aClass93_Sub1_8.anInt2524 * arg1 + this.aClass93_Sub1_8.anInt2525 * arg2 >> 14) + this.aClass93_Sub1_8.anInt2518) / local23;
		@Pc(133) int local133 = this.anInt8507 * ((this.aClass93_Sub1_8.anInt2522 * arg3 + this.aClass93_Sub1_8.anInt2524 * arg4 + this.aClass93_Sub1_8.anInt2525 * arg5 >> 14) + this.aClass93_Sub1_8.anInt2518) / local52;
		if (local104 < this.anInt8506 && local133 < this.anInt8506 || local104 > this.anInt8490 && local133 > this.anInt8490) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt8503 * ((this.aClass93_Sub1_8.anInt2516 * arg0 + this.aClass93_Sub1_8.anInt2519 * arg1 + this.aClass93_Sub1_8.anInt2521 * arg2 >> 14) + this.aClass93_Sub1_8.anInt2517) / local23;
			@Pc(209) int local209 = this.anInt8503 * ((this.aClass93_Sub1_8.anInt2516 * arg3 + this.aClass93_Sub1_8.anInt2519 * arg4 + this.aClass93_Sub1_8.anInt2521 * arg5 >> 14) + this.aClass93_Sub1_8.anInt2517) / local52;
			return (local180 >= this.anInt8500 || local209 >= this.anInt8500) && (local180 <= this.anInt8492 || local209 <= this.anInt8492);
		}
	}

	@OriginalMember(owner = "client!fv", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class17_Sub2 local2 = (Class17_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray151;
		@Pc(8) int[] local8 = local2.anIntArray150;
		@Pc(20) int local20;
		if (this.anInt8494 < arg3 + local5.length) {
			local20 = this.anInt8494 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt8509 > arg3) {
			local33 = this.anInt8509 - arg3;
			arg3 = this.anInt8509;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt8497;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt8486 > local58) {
				local62 -= this.anInt8486 - local58;
				local58 = this.anInt8486;
			}
			if (this.anInt8491 < local58 + local62) {
				local62 = this.anInt8491 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray602[local58++] = arg0;
			}
			local49 += this.anInt8497;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!cq;IIII)V")
	public abstract void method6754(@OriginalArg(0) Class60_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fv", name = "s", descriptor = "()V")
	protected final void method6755() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8504; local1++) {
			this.aClass38Array3[local1].method5973();
		}
		this.F();
	}

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "(I)V")
	@Override
	public void method7491(@OriginalArg(0) int arg0) {
		this.aClass38Array3[arg0].method5974(Thread.currentThread());
	}

	@OriginalMember(owner = "client!fv", name = "aa", descriptor = "()I")
	@Override
	public final int aa() {
		@Pc(2) int local2 = this.anInt8484;
		this.anInt8484 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!fv", name = "D", descriptor = "(I)V")
	@Override
	public final void D(@OriginalArg(0) int arg0) {
		this.C(0, 0, this.anInt8497, this.anInt8489, arg0, 0);
	}

	@OriginalMember(owner = "client!fv", name = "AA", descriptor = "(IIII)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8483 = this.anInt8499;
		this.anInt8498 = arg0;
		this.anInt8499 = arg1;
		this.anInt8510 = arg2;
		this.aBoolean551 = true;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7483(@OriginalArg(0) boolean arg0) {
		this.aBoolean549 = arg0;
		this.aClass330_59.method7688();
	}

	@OriginalMember(owner = "client!fv", name = "w", descriptor = "()Z")
	@Override
	public final boolean method7504() {
		return true;
	}

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "(IIIII)V")
	@Override
	protected final void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt8509) {
			local8 = this.anInt8509;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt8494) {
			local21 = this.anInt8494;
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
				if (local91 < this.anInt8486) {
					local91 = this.anInt8486;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8491) {
					local102 = this.anInt8491;
				}
				local116 = local91 + local30 * this.anInt8497;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray602[local116++] = arg3;
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
				if (local91 < this.anInt8486) {
					local91 = this.anInt8486;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8491 - 1) {
					local102 = this.anInt8491 - 1;
				}
				local116 = local91 + local30 * this.anInt8497;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray602[local116++] = arg3;
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
				if (local102 < this.anInt8486) {
					local102 = this.anInt8486;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt8491) {
					local116 = this.anInt8491;
				}
				local118 = local102 + local30 * this.anInt8497;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray602[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray602[local118++] = local277 + local340;
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
				if (local102 < this.anInt8486) {
					local102 = this.anInt8486;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt8491 - 1) {
					local116 = this.anInt8491 - 1;
				}
				local118 = local102 + local30 * this.anInt8497;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray602[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray602[local118++] = local277 + local340;
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
				if (local91 < this.anInt8486) {
					local91 = this.anInt8486;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8491) {
					local102 = this.anInt8491;
				}
				local116 = local91 + local30 * this.anInt8497;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray602[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray602[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt8486) {
					local91 = this.anInt8486;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8491 - 1) {
					local102 = this.anInt8491 - 1;
				}
				local116 = local91 + local30 * this.anInt8497;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray602[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray602[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "()I")
	@Override
	public final int v() {
		return 0;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIIF)Lclient!ld;")
	@Override
	public final Class6_Sub25 method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!fv", name = "ya", descriptor = "(IIIII)V")
	@Override
	public final void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt8486 || arg0 >= this.anInt8491) {
			return;
		}
		if (arg1 < this.anInt8509) {
			arg2 -= this.anInt8509 - arg1;
			arg1 = this.anInt8509;
		}
		if (arg1 + arg2 > this.anInt8494) {
			arg2 = this.anInt8494 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt8497;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray602[local40 + local54 * this.anInt8497] = arg3;
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
				local111 = local40 + local103 * this.anInt8497;
				local116 = this.anIntArray602[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray602[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt8497;
				local111 = this.anIntArray602[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray602[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fv", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7513() {
		return true;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!hn;IIII)Lclient!ba;")
	public abstract Class24 method7464(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)I")
	@Override
	public final int method7461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!fv", name = "JA", descriptor = "(I)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fv", name = "E", descriptor = "()V")
	private void method6756() {
		if (this.lb == 0.0F) {
			this.anInt8495 = this.anInt8485;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt8485;
		@Pc(12) float local12 = (float) this.anInt8496;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat176 / (this.lb + this.aFloat176);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.lb;
		this.anInt8495 = (int) (((float) this.anInt8485 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!hfa;)V")
	@Override
	public final void method7511(@OriginalArg(0) Class127 arg0) {
		@Pc(3) Class60_Sub1 local3 = arg0.aClass145_1.aClass60_Sub1_7;
		for (@Pc(6) Class60_Sub1 local6 = local3.aClass60_Sub1_10; local6 != local3; local6 = local6.aClass60_Sub1_10) {
			@Pc(10) Class60_Sub1_Sub1 local10 = (Class60_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt2705 >> 12;
			@Pc(20) int local20 = local10.anInt2701 >> 12;
			@Pc(25) int local25 = local10.anInt2709 >> 12;
			@Pc(49) int local49 = this.aClass93_Sub1_8.anInt2526 + (this.aClass93_Sub1_8.anInt2527 * local15 + this.aClass93_Sub1_8.anInt2523 * local20 + this.aClass93_Sub1_8.anInt2520 * local25 >> 14);
			if (local49 >= this.anInt8496 && local49 <= this.anInt8505) {
				@Pc(90) int local90 = this.anInt8508 + this.anInt8507 * (this.aClass93_Sub1_8.anInt2518 + (this.aClass93_Sub1_8.anInt2522 * local15 + this.aClass93_Sub1_8.anInt2524 * local20 + this.aClass93_Sub1_8.anInt2525 * local25 >> 14)) / local49;
				@Pc(122) int local122 = this.anInt8488 + this.anInt8503 * (this.aClass93_Sub1_8.anInt2517 + (this.aClass93_Sub1_8.anInt2516 * local15 + this.aClass93_Sub1_8.anInt2519 * local20 + this.aClass93_Sub1_8.anInt2521 * local25 >> 14)) / local49;
				if (local90 >= this.anInt8486 && local90 <= this.anInt8491 && local122 >= this.anInt8509 && local122 <= this.anInt8494) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method6754(local10, local90, local122, local49, (local10.anInt2707 * this.anInt8507 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "()V")
	@Override
	public final void method7475() {
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(FFF)V")
	@Override
	public final void method7457(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "(I)V")
	@Override
	public final void method7486(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt8481;
		for (@Pc(9) Object local9 = this.aClass330_59.method7681(); local9 != null; local9 = this.aClass330_59.method7689()) {
			@Pc(13) Class6_Sub4 local13 = (Class6_Sub4) local9;
			if (local13.aBoolean14) {
				local13.anInt199 += local4;
				@Pc(27) int local27 = local13.anInt199 / 20;
				if (local27 > 0) {
					@Pc(36) Class115 local36 = super.anInterface2_15.method3085(local13.anInt200);
					local13.method181(local36.aByte36 * local4 * 50 / 1000, local36.aByte35 * local4 * 50 / 1000);
					local13.anInt199 -= local27 * 20;
				}
				local13.aBoolean14 = false;
			}
		}
		this.anInt8481 = arg0;
		this.aClass330_60.method7680(5);
		this.aClass330_59.method7680(5);
	}

	@OriginalMember(owner = "client!fv", name = "D", descriptor = "()V")
	@Override
	protected final void method7525() {
		if (this.aBoolean548) {
			Static477.method6611(false, true);
			this.aBoolean548 = false;
		}
		this.aClass6_Sub13_3 = null;
		this.aCanvas12 = null;
		this.aClass234_43 = null;
		this.aBoolean547 = true;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public final void method7520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class17 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class17_Sub2 local2 = (Class17_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray151;
		@Pc(8) int[] local8 = local2.anIntArray150;
		@Pc(17) int local17 = this.anInt8509 > arg7 ? this.anInt8509 : arg7;
		@Pc(32) int local32 = this.anInt8494 < arg7 + local5.length ? this.anInt8494 : arg7 + local5.length;
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
					if (local129 >= this.anInt8486 && local129 < this.anInt8491 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray602[local129 + arg1 * this.anInt8497] = arg4;
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
					if (local133 >= this.anInt8486 && local133 < this.anInt8491 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt8497;
						local248 = this.anIntArray602[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray602[local133 + arg1 * this.anInt8497] = local201 + local584;
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
		if (arg0 < this.anInt8486) {
			arg1 += local83 * (this.anInt8486 - arg0);
			arg0 = this.anInt8486;
		}
		if (arg2 >= this.anInt8491) {
			arg2 = this.anInt8491 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray602[arg0 + local129 * this.anInt8497] = arg4;
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
					local243 = arg0 + local133 * this.anInt8497;
					local248 = this.anIntArray602[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray602[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)[I")
	protected final int[] method6757(@OriginalArg(0) int arg0) {
		@Pc(2) Class330 local2 = this.aClass330_59;
		@Pc(12) Class6_Sub4 local12;
		synchronized (this.aClass330_59) {
			local12 = (Class6_Sub4) this.aClass330_59.method7677((long) arg0);
			if (local12 == null) {
				if (!super.anInterface2_15.method3089(arg0)) {
					return null;
				}
				@Pc(32) Class115 local32 = super.anInterface2_15.method3085(arg0);
				@Pc(42) int local42 = local32.aBoolean233 || this.aBoolean549 ? 64 : 128;
				local12 = new Class6_Sub4(arg0, local42, super.anInterface2_15.method3087(local42, local42, arg0, 0.7F), local32.aBoolean230);
				this.aClass330_59.method7676(local12, (long) arg0);
			}
		}
		local12.aBoolean14 = true;
		return local12.method180();
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)Lclient!i;")
	@Override
	public final Class6_Sub2 method7451(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I[Lclient!ld;)V")
	@Override
	public final void method7448(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub25[] arg1) {
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!kq;Z)Lclient!xa;")
	@Override
	public final Class71 method7522(@OriginalArg(0) Class177 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray399;
		@Pc(5) byte[] local5 = arg0.aByteArray66;
		@Pc(8) int local8 = arg0.anInt4887;
		@Pc(11) int local11 = arg0.anInt4884;
		@Pc(76) Class71_Sub2 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray67 == null) {
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
			local76 = new Class71_Sub2_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray67;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class71_Sub2_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class71_Sub2_Sub3(this, local20, local8, local11);
			}
		}
		local76.EA(arg0.anInt4886, arg0.anInt4885, arg0.anInt4889, arg0.anInt4888);
		return local76;
	}

	@OriginalMember(owner = "client!fv", name = "KA", descriptor = "(IIII)[I")
	@Override
	public final int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt8497 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray602[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public final Class17 method7517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class17_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([Lclient!ba;Lclient!hfa;Lclient!q;[Lclient!rc;I)V")
	public abstract void method7524(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) Class60_Sub6[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fv", name = "y", descriptor = "()V")
	@Override
	public final void method7508() throws Exception_Sub1 {
		if (this.aCanvas12 == null || this.aClass6_Sub13_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas12.getGraphics();
			this.aClass6_Sub13_3.method4479(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas12.repaint();
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public final Class71 method7453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt8497 + arg0;
		@Pc(16) int local16 = this.anInt8497 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray602[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class71_Sub2_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class71_Sub2_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!rc;I)V")
	public abstract void method7476(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class60_Sub6[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public final void method7449(@OriginalArg(0) Class6_Sub2 arg0) {
	}

	@OriginalMember(owner = "client!fv", name = "ha", descriptor = "(F)V")
	@Override
	public final void ha(@OriginalArg(0) float arg0) {
		this.anInt8502 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "(Z)V")
	@Override
	public void method7500(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method7512();

	@OriginalMember(owner = "client!fv", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt8512 = (int) (arg1 * 65535.0F);
		this.anInt8511 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt8493 = (int) (arg3 * 65535.0F / local26);
		this.anInt8501 = (int) (arg4 * 65535.0F / local26);
		this.anInt8487 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!fv", name = "ca", descriptor = "(IIII)V")
	@Override
	public final void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt8497) {
			arg2 = this.anInt8497;
		}
		if (arg3 > this.anInt8489) {
			arg3 = this.anInt8489;
		}
		this.anInt8486 = arg0;
		this.anInt8491 = arg2;
		this.anInt8509 = arg1;
		this.anInt8494 = arg3;
		this.method6760();
	}

	@OriginalMember(owner = "client!fv", name = "ka", descriptor = "(FF)V")
	@Override
	public final void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat176 = arg0;
		this.lb = arg1;
		this.method6756();
	}

	@OriginalMember(owner = "client!fv", name = "SA", descriptor = "()I")
	@Override
	public final int SA() {
		@Pc(2) int local2 = this.anInt8482;
		this.anInt8482 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!fv", name = "A", descriptor = "([I)V")
	@Override
	public final void A(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8486;
		arg0[1] = this.anInt8509;
		arg0[2] = this.anInt8491;
		arg0[3] = this.anInt8494;
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)V")
	public abstract void method7478(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!ka;)V")
	@Override
	public final void method7454(@OriginalArg(0) Class3 arg0) {
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method7492(@OriginalArg(0) Class93 arg0) {
		this.aClass93_Sub1_8 = (Class93_Sub1) arg0;
	}

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "(I)[I")
	public final int[] method6758(@OriginalArg(0) int arg0) {
		@Pc(2) Class330 local2 = this.aClass330_59;
		@Pc(12) Class6_Sub4 local12;
		synchronized (this.aClass330_59) {
			local12 = (Class6_Sub4) this.aClass330_59.method7677((long) arg0);
			if (local12 == null) {
				if (!super.anInterface2_15.method3089(arg0)) {
					return null;
				}
				@Pc(32) Class115 local32 = super.anInterface2_15.method3085(arg0);
				@Pc(42) int local42 = local32.aBoolean233 || this.aBoolean549 ? 64 : 128;
				local12 = new Class6_Sub4(arg0, local42, super.anInterface2_15.method3088(arg0, local42, 0.7F, local42, true), local32.aBoolean230);
				this.aClass330_59.method7676(local12, (long) arg0);
			}
		}
		local12.aBoolean14 = true;
		return local12.method180();
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method7494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.e(arg0, arg1, arg2, arg4, arg5);
		this.e(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.ya(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.ya(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!fv", name = "p", descriptor = "()Z")
	@Override
	public final boolean method7497() {
		return false;
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7507(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class6_Sub13 local8 = (Class6_Sub13) this.aClass234_43.method5464((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static484.method6801(arg0);
			this.aClass234_43.method5466((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!fv", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7499() {
		return false;
	}

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "(I)Z")
	public final boolean method6759(@OriginalArg(0) int arg0) {
		return super.anInterface2_15.method3085(arg0).aBoolean226;
	}

	@OriginalMember(owner = "client!fv", name = "C", descriptor = "()V")
	@Override
	public void method7521() {
	}

	@OriginalMember(owner = "client!fv", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public final void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt8497;
		@Pc(35) int local35 = this.anInt8497 - arg2;
		if (arg1 + arg3 > this.anInt8494) {
			arg3 -= arg1 + arg3 - this.anInt8494;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt8509) {
			local59 = this.anInt8509 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt8497;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt8491) {
			local59 = arg0 + arg2 - this.anInt8491;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt8486) {
			local59 = this.anInt8486 - arg0;
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
						this.anIntArray602[local30++] = arg4;
					} else {
						this.anIntArray602[local30++] = arg5;
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
					local245 = this.anIntArray602[local30];
					this.anIntArray602[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray602[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray602[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!fv", name = "IA", descriptor = "()I")
	@Override
	public final int IA() {
		return this.anInt8485;
	}

	@OriginalMember(owner = "client!fv", name = "t", descriptor = "()V")
	@Override
	public final void method7501() {
	}

	@OriginalMember(owner = "client!fv", name = "sa", descriptor = "(II)V")
	@Override
	public final void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8496 = arg0;
		this.anInt8485 = arg1;
		this.anInt8505 = this.anInt8485 - 255;
		this.method6756();
	}

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "()Z")
	@Override
	public final boolean method7479() {
		return false;
	}

	@OriginalMember(owner = "client!fv", name = "C", descriptor = "(IIIIII)V")
	@Override
	public final void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt8486) {
			arg2 -= this.anInt8486 - arg0;
			arg0 = this.anInt8486;
		}
		if (arg1 < this.anInt8509) {
			arg3 -= this.anInt8509 - arg1;
			arg1 = this.anInt8509;
		}
		if (arg0 + arg2 > this.anInt8491) {
			arg2 = this.anInt8491 - arg0;
		}
		if (arg1 + arg3 > this.anInt8494) {
			arg3 = this.anInt8494 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt8491 || arg1 > this.anInt8494) {
			return;
		}
		@Pc(67) int local67 = this.anInt8497 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt8497;
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
						local217 = this.anIntArray602[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray602[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray602[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray602[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray602[arg2] = arg4;
					arg2++;
					this.anIntArray602[arg2] = arg4;
					arg2++;
					this.anIntArray602[arg2] = arg4;
					arg2++;
					this.anIntArray602[arg2] = arg4;
					arg2++;
					this.anIntArray602[arg2] = arg4;
					arg2++;
					this.anIntArray602[arg2] = arg4;
					arg2++;
					this.anIntArray602[arg2] = arg4;
					arg2++;
					this.anIntArray602[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray602[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!mj;[Lclient!kq;Z)Lclient!ta;")
	@Override
	public final Class82 method7523(@OriginalArg(0) Class202 arg0, @OriginalArg(1) Class177[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt4887;
			local7[local11] = arg1[local11].anInt4884;
			if (arg1[local11].aByteArray67 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class82_Sub3(this, arg0, arg1, local3, local7);
		} else {
			return new Class82_Sub1(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7466() {
		return false;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7487(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas12 == arg0) {
			this.method7472(null);
		}
		@Pc(15) Class6_Sub13 local15 = (Class6_Sub13) this.aClass234_43.method5464((long) arg0.hashCode());
		if (local15 != null) {
			local15.method7948();
		}
	}

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "()Z")
	@Override
	public final boolean method7474() {
		return false;
	}

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "()Z")
	@Override
	public final boolean method7485() {
		return false;
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7526(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "()V")
	@Override
	public final void method7488() {
		this.aClass330_59.method7688();
		this.aClass330_60.method7688();
	}

	@OriginalMember(owner = "client!fv", name = "LA", descriptor = "(IIII)V")
	@Override
	public final void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8498 = arg0;
		this.anInt8499 = arg1;
		this.anInt8510 = arg2;
	}

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "()V")
	@Override
	public final void k() {
		this.anInt8499 = this.anInt8483;
		this.aBoolean551 = false;
	}

	@OriginalMember(owner = "client!fv", name = "G", descriptor = "()V")
	protected abstract void method6760();

	@OriginalMember(owner = "client!fv", name = "x", descriptor = "()Z")
	@Override
	public final boolean method7506() {
		return true;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
	public abstract void method7468(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fv", name = "q", descriptor = "()Z")
	@Override
	public final boolean method7498() {
		return false;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!vd;")
	public abstract Class38 method6761(@OriginalArg(0) Runnable arg0);

	@OriginalMember(owner = "client!fv", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8486 < arg0) {
			this.anInt8486 = arg0;
		}
		if (this.anInt8509 < arg1) {
			this.anInt8509 = arg1;
		}
		if (this.anInt8491 > arg2) {
			this.anInt8491 = arg2;
		}
		if (this.anInt8494 > arg3) {
			this.anInt8494 = arg3;
		}
		this.method6760();
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	public abstract Class46 method7477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!fv", name = "u", descriptor = "()Z")
	@Override
	public final boolean method7502() {
		return true;
	}

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "(I)Z")
	public final boolean method6762(@OriginalArg(0) int arg0) {
		return super.anInterface2_15.method3089(arg0);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "()Lclient!fea;")
	@Override
	public final Class102 method7450() {
		return new Class102(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!ba;Lclient!hfa;Lclient!q;Lclient!rc;I)V")
	@Override
	public final void method7470(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) Class60_Sub6 arg3, @OriginalArg(4) int arg4) {
		((Class24_Sub1) arg0).method7406(arg2, arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!fv", name = "F", descriptor = "()V")
	@Override
	public final void F() {
		this.anInt8486 = 0;
		this.anInt8509 = 0;
		this.anInt8491 = this.anInt8497;
		this.anInt8494 = this.anInt8489;
		this.method6760();
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)I")
	@Override
	public final int method7505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "()Z")
	@Override
	public final boolean method7496() {
		return false;
	}

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "(I)I")
	public final int method6763(@OriginalArg(0) int arg0) {
		return super.anInterface2_15.method3085(arg0).aShort55 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fv", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt8496;
	}

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "(I)V")
	@Override
	public final void method7510(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "(I)Z")
	public final boolean method6764(@OriginalArg(0) int arg0) {
		return this.aBoolean549 || super.anInterface2_15.method3085(arg0).aBoolean233;
	}

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "()Z")
	public abstract boolean method7480();

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "()Z")
	@Override
	public final boolean method7452() {
		return false;
	}

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "()V")
	@Override
	public final void method7469() {
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(Z)V")
	@Override
	public final void method7489(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fv", name = "H", descriptor = "()Z")
	public final boolean method6765() {
		return this.aBoolean547;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(IIIIIIIIII)V")
	public abstract void method6766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public final void method7460(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas12 == null || this.aClass6_Sub13_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas12.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt8497 && local21.y <= this.anInt8489 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass6_Sub13_3.method4477(local21.height, local21.width, local21.y, local14, local21.x);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas12.repaint();
		}
	}

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt8509 || arg1 >= this.anInt8494) {
			return;
		}
		if (arg0 < this.anInt8486) {
			arg2 -= this.anInt8486 - arg0;
			arg0 = this.anInt8486;
		}
		if (arg0 + arg2 > this.anInt8491) {
			arg2 = this.anInt8491 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt8497;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray602[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray602[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray602[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray602[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray602[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fv", name = "na", descriptor = "(III[I)V")
	@Override
	public final void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass93_Sub1_8.anInt2526 + (this.aClass93_Sub1_8.anInt2527 * arg0 + this.aClass93_Sub1_8.anInt2523 * arg1 + this.aClass93_Sub1_8.anInt2520 * arg2 >> 14);
		if (local23 < this.anInt8496 || local23 > this.anInt8485) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt8507 * (this.aClass93_Sub1_8.anInt2518 + (this.aClass93_Sub1_8.anInt2522 * arg0 + this.aClass93_Sub1_8.anInt2524 * arg1 + this.aClass93_Sub1_8.anInt2525 * arg2 >> 14)) / local23;
		@Pc(102) int local102 = this.anInt8503 * (this.aClass93_Sub1_8.anInt2517 + (this.aClass93_Sub1_8.anInt2516 * arg0 + this.aClass93_Sub1_8.anInt2519 * arg1 + this.aClass93_Sub1_8.anInt2521 * arg2 >> 14)) / local23;
		if (local73 >= this.anInt8506 && local73 <= this.anInt8490 && local102 >= this.anInt8500 && local102 <= this.anInt8492) {
			arg3[0] = local73 - this.anInt8506;
			arg3[1] = local102 - this.anInt8500;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}
}
