import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class163_Sub1 extends Class163 {

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
	private int anInt4196;

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!ms", name = "x", descriptor = "Lclient!s;")
	private Class2_Sub30 aClass2_Sub30_1;

	@OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
	public int anInt4197;

	@OriginalMember(owner = "client!ms", name = "B", descriptor = "Lclient!o;")
	private Class13 aClass13_16;

	@OriginalMember(owner = "client!ms", name = "E", descriptor = "I")
	public int anInt4200;

	@OriginalMember(owner = "client!ms", name = "H", descriptor = "F")
	private float aFloat51;

	@OriginalMember(owner = "client!ms", name = "I", descriptor = "F")
	private float aFloat52;

	@OriginalMember(owner = "client!ms", name = "J", descriptor = "I")
	public int anInt4203;

	@OriginalMember(owner = "client!ms", name = "K", descriptor = "[I")
	public int[] anIntArray354;

	@OriginalMember(owner = "client!ms", name = "L", descriptor = "I")
	private int anInt4204;

	@OriginalMember(owner = "client!ms", name = "N", descriptor = "I")
	public int anInt4206;

	@OriginalMember(owner = "client!ms", name = "S", descriptor = "I")
	public int anInt4211;

	@OriginalMember(owner = "client!ms", name = "W", descriptor = "I")
	public int anInt4214;

	@OriginalMember(owner = "client!ms", name = "Z", descriptor = "Z")
	public boolean aBoolean297;

	@OriginalMember(owner = "client!ms", name = "bb", descriptor = "[Lclient!ps;")
	private Class195[] aClass195Array1;

	@OriginalMember(owner = "client!ms", name = "db", descriptor = "I")
	public int anInt4218;

	@OriginalMember(owner = "client!ms", name = "hb", descriptor = "I")
	public int anInt4222;

	@OriginalMember(owner = "client!ms", name = "ib", descriptor = "I")
	public int anInt4223;

	@OriginalMember(owner = "client!ms", name = "jb", descriptor = "I")
	public int anInt4224;

	@OriginalMember(owner = "client!ms", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!ms", name = "ob", descriptor = "Lclient!o;")
	private Class13 aClass13_17;

	@OriginalMember(owner = "client!ms", name = "w", descriptor = "Z")
	private boolean aBoolean294;

	@OriginalMember(owner = "client!ms", name = "v", descriptor = "Z")
	private boolean aBoolean293;

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "Lclient!ew;")
	private Class72 aClass72_31;

	@OriginalMember(owner = "client!ms", name = "D", descriptor = "I")
	public int anInt4199;

	@OriginalMember(owner = "client!ms", name = "O", descriptor = "I")
	public int anInt4207;

	@OriginalMember(owner = "client!ms", name = "R", descriptor = "I")
	private int anInt4210;

	@OriginalMember(owner = "client!ms", name = "z", descriptor = "Z")
	private boolean aBoolean295;

	@OriginalMember(owner = "client!ms", name = "G", descriptor = "I")
	public int anInt4202;

	@OriginalMember(owner = "client!ms", name = "P", descriptor = "I")
	private int anInt4208;

	@OriginalMember(owner = "client!ms", name = "eb", descriptor = "I")
	private int anInt4219;

	@OriginalMember(owner = "client!ms", name = "cb", descriptor = "I")
	public int anInt4217;

	@OriginalMember(owner = "client!ms", name = "X", descriptor = "I")
	public int anInt4215;

	@OriginalMember(owner = "client!ms", name = "T", descriptor = "I")
	public int anInt4212;

	@OriginalMember(owner = "client!ms", name = "M", descriptor = "I")
	public int anInt4205;

	@OriginalMember(owner = "client!ms", name = "V", descriptor = "Z")
	public boolean aBoolean296;

	@OriginalMember(owner = "client!ms", name = "F", descriptor = "I")
	public int anInt4201;

	@OriginalMember(owner = "client!ms", name = "C", descriptor = "I")
	public int anInt4198;

	@OriginalMember(owner = "client!ms", name = "gb", descriptor = "I")
	public int anInt4221;

	@OriginalMember(owner = "client!ms", name = "Y", descriptor = "I")
	private int anInt4216;

	@OriginalMember(owner = "client!ms", name = "Q", descriptor = "I")
	public int anInt4209;

	@OriginalMember(owner = "client!ms", name = "fb", descriptor = "I")
	public int anInt4220;

	@OriginalMember(owner = "client!ms", name = "U", descriptor = "I")
	public int anInt4213;

	@OriginalMember(owner = "client!ms", name = "kb", descriptor = "I")
	public int anInt4225;

	@OriginalMember(owner = "client!ms", name = "mb", descriptor = "I")
	public int anInt4226;

	@OriginalMember(owner = "client!ms", name = "ab", descriptor = "Lclient!ka;")
	private final Class132 aClass132_37;

	@OriginalMember(owner = "client!ms", name = "pb", descriptor = "I")
	private int anInt4227;

	@OriginalMember(owner = "client!ms", name = "A", descriptor = "Lclient!ka;")
	private final Class132 aClass132_36;

	@OriginalMember(owner = "client!ms", name = "nb", descriptor = "Lclient!ii;")
	public Class31_Sub1 aClass31_Sub1_1;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(ILclient!l;)V")
	private Class163_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Interface9 arg1) {
		super(arg0, arg1);
		this.aBoolean294 = false;
		this.aBoolean293 = false;
		this.aClass72_31 = new Class72(4);
		this.anInt4199 = 78642;
		this.anInt4207 = 512;
		this.anInt4210 = 0;
		this.aBoolean295 = false;
		this.anInt4202 = 45823;
		this.anInt4208 = 3500;
		this.anInt4219 = 0;
		this.anInt4217 = 0;
		this.anInt4215 = 0;
		this.anInt4212 = this.anInt4208 - 255;
		this.anInt4205 = 0;
		this.aBoolean296 = false;
		this.anInt4201 = 75518;
		this.anInt4198 = 0;
		this.anInt4221 = 50;
		this.anInt4216 = 0;
		this.anInt4209 = 512;
		this.anInt4220 = 0;
		this.anInt4213 = 0;
		this.anInt4225 = 0;
		this.anInt4226 = 3500;
		this.aClass132_37 = new Class132(16);
		this.anInt4227 = -1;
		this.aClass132_36 = new Class132(20);
		this.aClass31_Sub1_1 = new Class31_Sub1();
		this.method5564(1);
		this.method5547(0);
		Static340.method5394(false, true);
		this.aBoolean293 = true;
	}

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;)V")
	public Class163_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface9 arg2) {
		this(arg0, arg2);
		this.method5518(arg1);
		this.method5560(arg1);
	}

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "(I)Z")
	public boolean method3440(@OriginalArg(0) int arg0) {
		return this.aBoolean295 || super.anInterface9_12.method1769(arg0).aBoolean283;
	}

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "()Z")
	public boolean method3441() {
		return this.aBoolean294;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!ks;)V")
	@Override
	public void method5561(@OriginalArg(0) Class109 arg0) {
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5535(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas3 == null || this.aClass2_Sub30_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt4224 && local21.y <= this.anInt4204 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass2_Sub30_1.method4500(local21.x, local21.width, local21.height, local21.y, local14);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(Z)V")
	@Override
	public void method5534(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ms", name = "VA", descriptor = "(IIIIII)Z")
	@Override
	public boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass31_Sub1_1.anInt2885 * arg0 + this.aClass31_Sub1_1.anInt2884 * arg1 + this.aClass31_Sub1_1.anInt2892 * arg2 >> 15) + this.aClass31_Sub1_1.anInt2890;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass31_Sub1_1.anInt2885 * arg3 + this.aClass31_Sub1_1.anInt2884 * arg4 + this.aClass31_Sub1_1.anInt2892 * arg5 >> 15) + this.aClass31_Sub1_1.anInt2890;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt4221 && local52 < this.anInt4221 || !(local23 <= this.anInt4208 || local52 <= this.anInt4208)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt4209 * ((this.aClass31_Sub1_1.anInt2888 * arg0 + this.aClass31_Sub1_1.anInt2887 * arg1 + this.aClass31_Sub1_1.anInt2882 * arg2 >> 15) + this.aClass31_Sub1_1.anInt2889) / local23;
		@Pc(133) int local133 = this.anInt4209 * ((this.aClass31_Sub1_1.anInt2888 * arg3 + this.aClass31_Sub1_1.anInt2887 * arg4 + this.aClass31_Sub1_1.anInt2882 * arg5 >> 15) + this.aClass31_Sub1_1.anInt2889) / local52;
		if (local104 < this.anInt4223 && local133 < this.anInt4223 || local104 > this.anInt4203 && local133 > this.anInt4203) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt4207 * ((this.aClass31_Sub1_1.anInt2893 * arg0 + this.aClass31_Sub1_1.anInt2891 * arg1 + this.aClass31_Sub1_1.anInt2883 * arg2 >> 15) + this.aClass31_Sub1_1.anInt2886) / local23;
			@Pc(209) int local209 = this.anInt4207 * ((this.aClass31_Sub1_1.anInt2893 * arg3 + this.aClass31_Sub1_1.anInt2891 * arg4 + this.aClass31_Sub1_1.anInt2883 * arg5 >> 15) + this.aClass31_Sub1_1.anInt2886) / local52;
			return (local180 >= this.anInt4222 || local209 >= this.anInt4222) && (local180 <= this.anInt4200 || local209 <= this.anInt4200);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5517(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ms", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt4215) {
			arg2 -= this.anInt4215 - arg0;
			arg0 = this.anInt4215;
		}
		if (arg1 < this.anInt4217) {
			arg3 -= this.anInt4217 - arg1;
			arg1 = this.anInt4217;
		}
		if (arg0 + arg2 > this.anInt4213) {
			arg2 = this.anInt4213 - arg0;
		}
		if (arg1 + arg3 > this.anInt4220) {
			arg3 = this.anInt4220 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt4213 || arg1 > this.anInt4220) {
			return;
		}
		@Pc(67) int local67 = this.anInt4224 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt4224;
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
						local221 = this.anIntArray354[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray354[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray354[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray354[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray354[arg2] = arg4;
					arg2++;
					this.anIntArray354[arg2] = arg4;
					arg2++;
					this.anIntArray354[arg2] = arg4;
					arg2++;
					this.anIntArray354[arg2] = arg4;
					arg2++;
					this.anIntArray354[arg2] = arg4;
					arg2++;
					this.anIntArray354[arg2] = arg4;
					arg2++;
					this.anIntArray354[arg2] = arg4;
					arg2++;
					this.anIntArray354[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray354[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIII)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4198 = arg0;
		this.anInt4205 = arg1;
		this.anInt4225 = arg2;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class35 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class35_Sub1 local2 = (Class35_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray89;
		@Pc(8) int[] local8 = local2.anIntArray88;
		@Pc(17) int local17 = this.anInt4217 > arg7 ? this.anInt4217 : arg7;
		@Pc(32) int local32 = this.anInt4220 < arg7 + local5.length ? this.anInt4220 : arg7 + local5.length;
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
					if (local129 >= this.anInt4215 && local129 < this.anInt4213 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray354[local129 + arg1 * this.anInt4224] = arg4;
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
					if (local133 >= this.anInt4215 && local133 < this.anInt4213 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt4224;
						local248 = this.anIntArray354[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray354[local133 + arg1 * this.anInt4224] = local201 + local584;
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
		if (arg0 < this.anInt4215) {
			arg1 += local83 * (this.anInt4215 - arg0);
			arg0 = this.anInt4215;
		}
		if (arg2 >= this.anInt4213) {
			arg2 = this.anInt4213 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray354[arg0 + local129 * this.anInt4224] = arg4;
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
					local243 = arg0 + local133 * this.anInt4224;
					local248 = this.anIntArray354[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray354[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!ms", name = "A", descriptor = "()Z")
	@Override
	public boolean method5563() {
		return true;
	}

	@OriginalMember(owner = "client!ms", name = "MA", descriptor = "([I)V")
	@Override
	public void MA(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4215;
		arg0[1] = this.anInt4217;
		arg0[2] = this.anInt4213;
		arg0[3] = this.anInt4220;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!ps;")
	public Class195 method3442(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4214; local1++) {
			if (this.aClass195Array1[local1].aRunnable2 == arg0) {
				return this.aClass195Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ms", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt4215 = 0;
		this.anInt4217 = 0;
		this.anInt4213 = this.anInt4224;
		this.anInt4220 = this.anInt4204;
		this.method3450();
	}

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "()Z")
	@Override
	public boolean method5528() {
		return true;
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(II)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4221 = arg0;
		this.anInt4208 = arg1;
		this.anInt4212 = this.anInt4208 - 255;
		this.method3444();
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class162 method5557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class162_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ms", name = "v", descriptor = "()Z")
	@Override
	public boolean method5552() {
		return true;
	}

	@OriginalMember(owner = "client!ms", name = "v", descriptor = "(III[I)V")
	@Override
	public void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass31_Sub1_1.anInt2890 + (this.aClass31_Sub1_1.anInt2885 * arg0 + this.aClass31_Sub1_1.anInt2884 * arg1 + this.aClass31_Sub1_1.anInt2892 * arg2 >> 15);
		if (local23 < this.anInt4221 || local23 > this.anInt4208) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt4209 * (this.aClass31_Sub1_1.anInt2889 + (this.aClass31_Sub1_1.anInt2888 * arg0 + this.aClass31_Sub1_1.anInt2887 * arg1 + this.aClass31_Sub1_1.anInt2882 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt4207 * (this.aClass31_Sub1_1.anInt2886 + (this.aClass31_Sub1_1.anInt2893 * arg0 + this.aClass31_Sub1_1.anInt2891 * arg1 + this.aClass31_Sub1_1.anInt2883 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt4223 && local73 <= this.anInt4203 && local102 >= this.anInt4222 && local102 <= this.anInt4200) {
			arg3[0] = local73 - this.anInt4223;
			arg3[1] = local102 - this.anInt4222;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class13 method5513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt4224 + arg0;
		@Pc(16) int local16 = this.anInt4224 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray354[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class13_Sub2_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class13_Sub2_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "(IIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4216 = this.anInt4205;
		this.anInt4198 = arg0;
		this.anInt4205 = arg1;
		this.anInt4225 = arg2;
		this.aBoolean296 = true;
	}

	@OriginalMember(owner = "client!ms", name = "ZA", descriptor = "(IIIII)V")
	@Override
	protected void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt4217) {
			local8 = this.anInt4217;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt4220) {
			local21 = this.anInt4220;
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
				if (local91 < this.anInt4215) {
					local91 = this.anInt4215;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt4213) {
					local102 = this.anInt4213;
				}
				local116 = local91 + local30 * this.anInt4224;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray354[local116++] = arg3;
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
				if (local91 < this.anInt4215) {
					local91 = this.anInt4215;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt4213 - 1) {
					local102 = this.anInt4213 - 1;
				}
				local116 = local91 + local30 * this.anInt4224;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray354[local116++] = arg3;
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
				if (local102 < this.anInt4215) {
					local102 = this.anInt4215;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt4213) {
					local116 = this.anInt4213;
				}
				local118 = local102 + local30 * this.anInt4224;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray354[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray354[local118++] = local277 + local340;
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
				if (local102 < this.anInt4215) {
					local102 = this.anInt4215;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt4213 - 1) {
					local116 = this.anInt4213 - 1;
				}
				local118 = local102 + local30 * this.anInt4224;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray354[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray354[local118++] = local277 + local340;
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
				if (local91 < this.anInt4215) {
					local91 = this.anInt4215;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt4213) {
					local102 = this.anInt4213;
				}
				local116 = local91 + local30 * this.anInt4224;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray354[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray354[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt4215) {
					local91 = this.anInt4215;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt4213 - 1) {
					local102 = this.anInt4213 - 1;
				}
				local116 = local91 + local30 * this.anInt4224;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray354[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray354[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "(I)[I")
	public int[] method3443(@OriginalArg(0) int arg0) {
		@Pc(2) Class132 local2 = this.aClass132_36;
		@Pc(12) Class2_Sub33 local12;
		synchronized (this.aClass132_36) {
			local12 = (Class2_Sub33) this.aClass132_36.method2701((long) arg0);
			if (local12 == null) {
				if (!super.anInterface9_12.method1773(arg0)) {
					return null;
				}
				@Pc(32) Class158 local32 = super.anInterface9_12.method1769(arg0);
				@Pc(42) int local42 = local32.aBoolean283 || this.aBoolean295 ? 64 : 128;
				local12 = new Class2_Sub33(arg0, local42, super.anInterface9_12.method1770(local42, arg0, 0.7F, true, local42), local32.aBoolean282);
				this.aClass132_36.method2711(local12, (long) arg0);
			}
		}
		local12.aBoolean310 = true;
		return local12.method3534();
	}

	@OriginalMember(owner = "client!ms", name = "z", descriptor = "()V")
	@Override
	public void method5562() {
		if (this.aCanvas3 == null || this.aClass2_Sub30_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			this.aClass2_Sub30_1.method4498(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5523() {
		@Pc(3) Class195 local3 = this.method3442(Thread.currentThread());
		@Pc(6) Class107 local6 = local3.aClass107_1;
		local6.aBoolean172 = false;
		local6.aBoolean172 = false;
		local6.anInt2704 = 0;
		local6.aBoolean173 = true;
		local6.method2220(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean172 = true;
	}

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "()Z")
	@Override
	public boolean method5521() {
		return false;
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5560(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas3 = null;
			this.aClass2_Sub30_1 = null;
			if (this.aClass13_16 == null) {
				this.anIntArray354 = null;
				this.anInt4224 = this.anInt4204 = 1;
				this.method3447();
			}
			return;
		}
		@Pc(10) Class2_Sub30 local10 = (Class2_Sub30) this.aClass72_31.method1659((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas3 = arg0;
		this.aClass2_Sub30_1 = local10;
		if (this.aClass13_16 != null) {
			return;
		}
		this.anIntArray354 = local10.anIntArray502;
		this.anInt4224 = local10.anInt5721;
		this.anInt4204 = local10.anInt5719;
		this.method3447();
		return;
	}

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "()Z")
	@Override
	public boolean method5541() {
		return false;
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(Z)V")
	@Override
	public void method5531(@OriginalArg(0) boolean arg0) {
		this.aBoolean295 = arg0;
		this.aClass132_36.method2698();
	}

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "()V")
	@Override
	public void method5520() {
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5533(@OriginalArg(0) Class2_Sub6 arg0) {
	}

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "()Z")
	@Override
	public boolean method5508() {
		return false;
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5519(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class2_Sub30 local8 = (Class2_Sub30) this.aClass72_31.method1659((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method5703();
		local8 = Static410.method5196(arg0);
		this.aClass72_31.method1653(local8, (long) arg0.hashCode());
		if (this.aCanvas3 != arg0 || this.aClass13_16 != null) {
			return;
		}
		this.aClass2_Sub30_1 = local8;
		this.anIntArray354 = local8.anIntArray502;
		this.anInt4224 = local8.anInt5721;
		this.anInt4204 = local8.anInt5719;
		this.method3447();
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIII)Lclient!ks;")
	@Override
	public Class109 method5499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	@Override
	public void method5495(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "()V")
	@Override
	public void method5505() {
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!au;Z)Lclient!o;")
	@Override
	public Class13 method5549(@OriginalArg(0) Class17 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray32;
		@Pc(5) byte[] local5 = arg0.aByteArray4;
		@Pc(8) int local8 = arg0.anInt342;
		@Pc(11) int local11 = arg0.anInt345;
		@Pc(76) Class13_Sub2 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray3 == null) {
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
			local76 = new Class13_Sub2_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray3;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class13_Sub2_Sub3(this, local20, local8, local11);
				local76 = new Class13_Sub2_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class13_Sub2_Sub3(this, local20, local8, local11);
			}
		}
		local76.ha(arg0.anInt341, arg0.anInt344, arg0.anInt343, arg0.anInt346);
		return local76;
	}

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "(I)V")
	@Override
	public void t(@OriginalArg(0) int arg0) {
		this.P(0, 0, this.anInt4224, this.anInt4204, arg0, 0);
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "()V")
	@Override
	protected void method5497() {
		if (this.aBoolean293) {
			Static228.method2981(true, false);
			this.aBoolean293 = false;
		}
		this.aClass2_Sub30_1 = null;
		this.aCanvas3 = null;
		this.aClass72_31 = null;
		this.aBoolean294 = true;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!e;Lclient!vk;Lclient!c;Lclient!rr;I)V")
	@Override
	public void method5551(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class21_Sub7 arg3) {
		((Class59_Sub2) arg0).method5444(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!ms", name = "C", descriptor = "()V")
	private void method3444() {
		if (this.aFloat52 == 0.0F) {
			this.anInt4226 = this.anInt4208;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt4208;
		@Pc(12) float local12 = (float) this.anInt4221;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat51 / (this.aFloat52 + this.aFloat51);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat52;
		this.anInt4226 = (int) (((float) this.anInt4208 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "()Z")
	@Override
	public boolean method5507() {
		return false;
	}

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "(I)V")
	@Override
	public void method5547(@OriginalArg(0) int arg0) {
		this.aClass195Array1[arg0].method4293(Thread.currentThread());
	}

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.anInt4205 = this.anInt4216;
		this.aBoolean296 = false;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIIIII)V")
	public void method3445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface9_12.method1769(arg5).aBoolean284) {
			this.ZA(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt4227 != arg5) {
			@Pc(26) Class13 local26 = (Class13) this.aClass132_37.method2701((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method3448(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method3440(arg5) ? 64 : 128;
				local26 = this.method5522(local32, local43, local43, local43);
				this.aClass132_37.method2711(local26, (long) arg5);
			}
			this.anInt4227 = arg5;
			this.aClass13_17 = local26;
		}
		this.aClass13_17.ya(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!ms", name = "ya", descriptor = "(I)V")
	@Override
	public void ya(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I[Lclient!sa;)V")
	@Override
	public void method5536(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub29[] arg1) {
	}

	@OriginalMember(owner = "client!ms", name = "y", descriptor = "()V")
	@Override
	public void method5559() {
	}

	@OriginalMember(owner = "client!ms", name = "JA", descriptor = "(F)V")
	@Override
	public void JA(@OriginalArg(0) float arg0) {
		this.anInt4201 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([Lclient!e;Lclient!vk;Lclient!c;[Lclient!rr;I)V")
	@Override
	public void method5556(@OriginalArg(0) Class59[] arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class21_Sub7[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class59_Sub2[] local3 = new Class59_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class59_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class59_Sub2 local26 = Static432.method5448(this, local3);
		local26.method5444(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "()I")
	@Override
	public int r() {
		return this.anInt4208;
	}

	@OriginalMember(owner = "client!ms", name = "aa", descriptor = "()F")
	@Override
	public float aa() {
		return this.aFloat52;
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
	@Override
	public void method5496(@OriginalArg(0) int arg0) {
		this.aClass195Array1[arg0].method4293(null);
	}

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "(I)V")
	@Override
	public void method5564(@OriginalArg(0) int arg0) {
		if (this.anInt4214 == arg0) {
			return;
		}
		this.anInt4214 = arg0;
		this.aClass195Array1 = new Class195[this.anInt4214];
		for (@Pc(14) int local14 = 0; local14 < this.anInt4214; local14++) {
			this.aClass195Array1[local14] = new Class195(this);
		}
	}

	@OriginalMember(owner = "client!ms", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt4221;
	}

	@OriginalMember(owner = "client!ms", name = "q", descriptor = "()Lclient!c;")
	@Override
	public Class31 method5539() {
		@Pc(3) Class195 local3 = this.method3442(Thread.currentThread());
		return local3.aClass31_Sub1_2;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!rr;I)V")
	@Override
	public void method5509(@OriginalArg(0) Class59[] arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class21_Sub7[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class59_Sub2[] local3 = new Class59_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class59_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class59_Sub2 local26 = Static432.method5448(this, local3);
		local26.method5444(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!ms", name = "B", descriptor = "(IFFFFF)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt4202 = (int) (arg1 * 65535.0F);
		this.anInt4199 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.lb = (int) (arg3 * 65535.0F / local26);
		this.anInt4211 = (int) (arg4 * 65535.0F / local26);
		this.anInt4197 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIF)Lclient!sa;")
	@Override
	public Class2_Sub29 method5542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class35 method5550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class35_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ms", name = "SA", descriptor = "(Lclient!c;)V")
	@Override
	public void SA(@OriginalArg(0) Class31 arg0) {
		this.aClass31_Sub1_1 = (Class31_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ms", name = "w", descriptor = "()I")
	@Override
	public int method5553() {
		return 0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!fv;III)V")
	public void method3446(@OriginalArg(0) Class21_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt548;
		@Pc(4) int local4 = arg3;
		@Pc(8) int local8 = arg3 << 1;
		if (local2 == -1) {
			this.ZA(arg1, arg2, local4, arg0.anInt545, 1);
			return;
		}
		if (this.anInt4227 != local2) {
			@Pc(32) Class13 local32 = (Class13) this.aClass132_37.method2701((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method3448(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method3440(local2) ? 64 : 128;
				local32 = this.method5522(local38, local48, local48, local48);
				this.aClass132_37.method2711(local32, (long) local2);
			}
			this.anInt4227 = local2;
			this.aClass13_17 = local32;
		}
		this.aClass13_17.ya(arg1 - local4, arg2 - local4, local8, local8, 0, arg0.anInt545, 1);
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.ma(arg0, arg1, arg2, arg4, arg5);
		this.ma(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.IA(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.IA(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!qq;IIII)Lclient!e;")
	@Override
	public Class59 method5530(@OriginalArg(0) Class205 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class59_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ms", name = "D", descriptor = "()V")
	private void method3447() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4214; local1++) {
			this.aClass195Array1[local1].method4294();
		}
		this.va();
	}

	@OriginalMember(owner = "client!ms", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		@Pc(2) int local2 = this.anInt4210;
		this.anInt4210 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ms", name = "B", descriptor = "()Lclient!c;")
	@Override
	public Class31 method5566() {
		return new Class31_Sub1();
	}

	@OriginalMember(owner = "client!ms", name = "ra", descriptor = "(ILclient!ta;II)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class35_Sub1 local2 = (Class35_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray89;
		@Pc(8) int[] local8 = local2.anIntArray88;
		@Pc(20) int local20;
		if (this.anInt4220 < arg3 + local5.length) {
			local20 = this.anInt4220 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt4217 > arg3) {
			local33 = this.anInt4217 - arg3;
			arg3 = this.anInt4217;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt4224;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt4215 > local58) {
				local62 -= this.anInt4215 - local58;
				local58 = this.anInt4215;
			}
			if (this.anInt4213 < local58 + local62) {
				local62 = this.anInt4213 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray354[local58++] = arg0;
			}
			local49 += this.anInt4224;
		}
	}

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "(I)[I")
	private int[] method3448(@OriginalArg(0) int arg0) {
		@Pc(2) Class132 local2 = this.aClass132_36;
		@Pc(12) Class2_Sub33 local12;
		synchronized (this.aClass132_36) {
			local12 = (Class2_Sub33) this.aClass132_36.method2701((long) arg0);
			if (local12 == null) {
				if (!super.anInterface9_12.method1773(arg0)) {
					return null;
				}
				@Pc(32) Class158 local32 = super.anInterface9_12.method1769(arg0);
				@Pc(42) int local42 = local32.aBoolean283 || this.aBoolean295 ? 64 : 128;
				local12 = new Class2_Sub33(arg0, local42, super.anInterface9_12.method1772(local42, 0.7F, arg0, local42), local32.aBoolean282);
				this.aClass132_36.method2711(local12, (long) arg0);
			}
		}
		local12.aBoolean310 = true;
		return local12.method3534();
	}

	@OriginalMember(owner = "client!ms", name = "da", descriptor = "(FF)V")
	@Override
	public void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat51 = arg0;
		this.aFloat52 = arg1;
		this.method3444();
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class13 method5522(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class13_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class13_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class13_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class13_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "(I)Z")
	public boolean method3449(@OriginalArg(0) int arg0) {
		return super.anInterface9_12.method1773(arg0);
	}

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "()Z")
	@Override
	public boolean method5524() {
		return true;
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)Lclient!n;")
	@Override
	public Class2_Sub6 method5506(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ms", name = "E", descriptor = "()V")
	private void method3450() {
		this.anInt4223 = this.anInt4215 - this.anInt4206;
		this.anInt4203 = this.anInt4213 - this.anInt4206;
		this.anInt4222 = this.anInt4217 - this.anInt4218;
		this.anInt4200 = this.anInt4220 - this.anInt4218;
		for (@Pc(29) int local29 = 0; local29 < this.anInt4214; local29++) {
			@Pc(36) Class107 local36 = this.aClass195Array1[local29].aClass107_1;
			local36.anInt2702 = this.anInt4206 - this.anInt4215;
			local36.anInt2701 = this.anInt4218 - this.anInt4217;
			local36.anInt2703 = this.anInt4213 - this.anInt4215;
			local36.anInt2700 = this.anInt4220 - this.anInt4217;
		}
		@Pc(78) int local78 = this.anInt4217 * this.anInt4224 + this.anInt4215;
		for (@Pc(81) int local81 = this.anInt4217; local81 < this.anInt4220; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt4214; local84++) {
				this.aClass195Array1[local84].aClass107_1.anIntArray216[local81 - this.anInt4217] = local78;
			}
			local78 += this.anInt4224;
		}
	}

	@OriginalMember(owner = "client!ms", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt4224) {
			arg2 = this.anInt4224;
		}
		if (arg3 > this.anInt4204) {
			arg3 = this.anInt4204;
		}
		this.anInt4215 = arg0;
		this.anInt4213 = arg2;
		this.anInt4217 = arg1;
		this.anInt4220 = arg3;
		this.method3450();
	}

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "(I)Z")
	public boolean method3451(@OriginalArg(0) int arg0) {
		return super.anInterface9_12.method1769(arg0).aBoolean280;
	}

	@OriginalMember(owner = "client!ms", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4205 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt4205 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt4205 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt4205 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt4205 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean297 = false;
		} else {
			this.aBoolean297 = true;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!ks;Lclient!ks;FLclient!ks;)Lclient!ks;")
	@Override
	public Class109 method5525(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class109 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "()Z")
	@Override
	public boolean method5544() {
		return false;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!kt;[Lclient!au;Z)Lclient!la;")
	@Override
	public Class92 method5537(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class17[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt342;
			local7[local11] = arg1[local11].anInt345;
			if (arg1[local11].aByteArray3 != null) {
			}
		}
		return new Class92_Sub2(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5515(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas3 == arg0) {
			this.method5560(null);
		}
		@Pc(15) Class2_Sub30 local15 = (Class2_Sub30) this.aClass72_31.method1659((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5703();
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!vk;)V")
	@Override
	public void method5503(@OriginalArg(0) Class256 arg0) {
		@Pc(3) Class21_Sub1 local3 = arg0.aClass187_1.aClass21_Sub1_9;
		for (@Pc(6) Class21_Sub1 local6 = local3.aClass21_Sub1_7; local6 != local3; local6 = local6.aClass21_Sub1_7) {
			@Pc(10) Class21_Sub1_Sub1 local10 = (Class21_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt543 >> 12;
			@Pc(20) int local20 = local10.anInt544 >> 12;
			@Pc(25) int local25 = local10.anInt547 >> 12;
			@Pc(49) int local49 = this.aClass31_Sub1_1.anInt2890 + (this.aClass31_Sub1_1.anInt2885 * local15 + this.aClass31_Sub1_1.anInt2884 * local20 + this.aClass31_Sub1_1.anInt2892 * local25 >> 15);
			if (local49 >= this.anInt4221 && local49 <= this.anInt4212) {
				@Pc(90) int local90 = this.anInt4206 + this.anInt4209 * (this.aClass31_Sub1_1.anInt2889 + (this.aClass31_Sub1_1.anInt2888 * local15 + this.aClass31_Sub1_1.anInt2887 * local20 + this.aClass31_Sub1_1.anInt2882 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt4218 + this.anInt4207 * (this.aClass31_Sub1_1.anInt2886 + (this.aClass31_Sub1_1.anInt2893 * local15 + this.aClass31_Sub1_1.anInt2891 * local20 + this.aClass31_Sub1_1.anInt2883 * local25 >> 15)) / local49;
				if (local90 >= this.anInt4215 && local90 <= this.anInt4213 && local122 >= this.anInt4217 && local122 <= this.anInt4220) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method3446(local10, local90, local122, (local10.anInt542 * this.anInt4209 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "()V")
	@Override
	public void method5511() {
	}

	@OriginalMember(owner = "client!ms", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4206 = arg0;
		this.anInt4218 = arg1;
		this.anInt4209 = arg2;
		this.anInt4207 = arg3;
		this.method3450();
	}

	@OriginalMember(owner = "client!ms", name = "HA", descriptor = "(IIII)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4215 < arg0) {
			this.anInt4215 = arg0;
		}
		if (this.anInt4217 < arg1) {
			this.anInt4217 = arg1;
		}
		if (this.anInt4213 > arg2) {
			this.anInt4213 = arg2;
		}
		if (this.anInt4220 > arg3) {
			this.anInt4220 = arg3;
		}
		this.method3450();
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(II)I")
	@Override
	public int method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "()V")
	@Override
	public void method5498() {
		this.aClass132_36.method2698();
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)V")
	@Override
	public void method5510(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt4196;
		for (@Pc(9) Object local9 = this.aClass132_36.method2702(); local9 != null; local9 = this.aClass132_36.method2699()) {
			@Pc(13) Class2_Sub33 local13 = (Class2_Sub33) local9;
			if (local13.aBoolean310) {
				local13.anInt4306 += local4;
				@Pc(27) int local27 = local13.anInt4306 / 20;
				if (local27 > 0) {
					@Pc(36) Class158 local36 = super.anInterface9_12.method1769(local13.anInt4305);
					local13.method3535(local36.aByte48 * local4 * 50 / 1000, local36.aByte42 * local4 * 50 / 1000);
					local13.anInt4306 -= local27 * 20;
				}
				local13.aBoolean310 = false;
			}
		}
		this.anInt4196 = arg0;
		this.aClass132_37.method2713(5);
	}

	@OriginalMember(owner = "client!ms", name = "IA", descriptor = "(IIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt4215 || arg0 >= this.anInt4213) {
			return;
		}
		if (arg1 < this.anInt4217) {
			arg2 -= this.anInt4217 - arg1;
			arg1 = this.anInt4217;
		}
		if (arg1 + arg2 > this.anInt4220) {
			arg2 = this.anInt4220 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt4224;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray354[local40 + local54 * this.anInt4224] = arg3;
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
				local111 = local40 + local103 * this.anInt4224;
				local116 = this.anIntArray354[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray354[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt4224;
				local111 = this.anIntArray354[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray354[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5518(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class2_Sub30 local8 = (Class2_Sub30) this.aClass72_31.method1659((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static410.method5196(arg0);
			this.aClass72_31.method1653(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!ms", name = "ma", descriptor = "(IIIII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt4217 || arg1 >= this.anInt4220) {
			return;
		}
		if (arg0 < this.anInt4215) {
			arg2 -= this.anInt4215 - arg0;
			arg0 = this.anInt4215;
		}
		if (arg0 + arg2 > this.anInt4213) {
			arg2 = this.anInt4213 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt4224;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray354[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray354[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray354[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray354[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray354[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "()Z")
	@Override
	public boolean method5538() {
		return false;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
	@Override
	public void method5493(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ms", name = "T", descriptor = "()F")
	@Override
	public float T() {
		return this.aFloat51;
	}

	@OriginalMember(owner = "client!ms", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		@Pc(2) int local2 = this.anInt4219;
		this.anInt4219 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "()Z")
	@Override
	public boolean method5491() {
		return false;
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.ma(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.ma(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt4215) {
					arg1 += local104 * (this.anInt4215 - arg0);
					arg0 = this.anInt4215;
				}
				if (arg2 >= this.anInt4213) {
					arg2 = this.anInt4213 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt4217 && local150 < this.anInt4220) {
							this.anIntArray354[arg0 + local150 * this.anInt4224] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt4217 && local213 < this.anInt4220) {
							local228 = arg0 + local213 * this.anInt4224;
							local233 = this.anIntArray354[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray354[local228] = local204 + local233;
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
				if (arg1 < this.anInt4217) {
					arg0 += local104 * (this.anInt4217 - arg1);
					arg1 = this.anInt4217;
				}
				if (arg3 >= this.anInt4220) {
					arg3 = this.anInt4220 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt4215 && local150 < this.anInt4213) {
							this.anIntArray354[local150 + arg1 * this.anInt4224] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt4215 && local213 < this.anInt4213) {
							local228 = local213 + arg1 * this.anInt4224;
							local233 = this.anIntArray354[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray354[local213 + arg1 * this.anInt4224] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.IA(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.IA(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "()Z")
	@Override
	public boolean method5548() {
		return false;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)I")
	@Override
	public int method5502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "()Z")
	@Override
	public boolean method5492() {
		return false;
	}

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "()Z")
	@Override
	public boolean method5516() {
		return false;
	}

	@OriginalMember(owner = "client!ms", name = "x", descriptor = "()Z")
	@Override
	public boolean method5555() {
		return false;
	}

	@OriginalMember(owner = "client!ms", name = "K", descriptor = "(IIIIII[BII)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt4224;
		@Pc(35) int local35 = this.anInt4224 - arg2;
		if (arg1 + arg3 > this.anInt4220) {
			arg3 -= arg1 + arg3 - this.anInt4220;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt4217) {
			local59 = this.anInt4217 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt4224;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt4213) {
			local59 = arg0 + arg2 - this.anInt4213;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt4215) {
			local59 = this.anInt4215 - arg0;
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
						this.anIntArray354[local30++] = arg4;
					} else {
						this.anIntArray354[local30++] = arg5;
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
					local245 = this.anIntArray354[local30];
					this.anIntArray354[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray354[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray354[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!ms", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return 0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class195 local3 = this.method3442(Thread.currentThread());
		@Pc(6) Class107 local6 = local3.aClass107_1;
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
		@Pc(93) int local93 = arg0 - local6.method2231();
		@Pc(98) int local98 = arg1 - local6.method2228();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt2704 = 0;
		local6.aBoolean173 = local102 < 0 || local102 > local6.anInt2703 || local106 < 0 || local106 > local6.anInt2703 || local112 < 0 || local112 > local6.anInt2703;
		local6.method2219(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean173 = local102 < 0 || local102 > local6.anInt2703 || local106 < 0 || local106 > local6.anInt2703 || local118 < 0 || local118 > local6.anInt2703;
		local6.method2219(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "(I)I")
	public int method3452(@OriginalArg(0) int arg0) {
		return super.anInterface9_12.method1769(arg0).aShort37 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ms", name = "sa", descriptor = "(IIII)[I")
	@Override
	public int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt4224 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray354[local18 + local20];
			}
		}
		return local4;
	}
}
