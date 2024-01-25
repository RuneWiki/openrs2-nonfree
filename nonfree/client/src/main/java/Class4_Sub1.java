import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "Ljava/awt/Canvas;")
	protected Canvas aCanvas6;

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "I")
	private int anInt2866;

	@OriginalMember(owner = "client!hr", name = "v", descriptor = "Lclient!fk;")
	protected Class1_Sub13 aClass1_Sub13_3;

	@OriginalMember(owner = "client!hr", name = "w", descriptor = "I")
	public int anInt2867;

	@OriginalMember(owner = "client!hr", name = "A", descriptor = "Lclient!ha;")
	protected Class104 aClass104_12;

	@OriginalMember(owner = "client!hr", name = "B", descriptor = "[Lclient!vc;")
	protected Class200[] aClass200Array3;

	@OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
	protected int anInt2871;

	@OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
	public int anInt2873;

	@OriginalMember(owner = "client!hr", name = "G", descriptor = "I")
	public int anInt2874;

	@OriginalMember(owner = "client!hr", name = "H", descriptor = "I")
	public int anInt2875;

	@OriginalMember(owner = "client!hr", name = "K", descriptor = "F")
	private float aFloat51;

	@OriginalMember(owner = "client!hr", name = "M", descriptor = "I")
	public int anInt2879;

	@OriginalMember(owner = "client!hr", name = "Q", descriptor = "I")
	public int anInt2883;

	@OriginalMember(owner = "client!hr", name = "S", descriptor = "I")
	public int anInt2884;

	@OriginalMember(owner = "client!hr", name = "U", descriptor = "I")
	public int anInt2885;

	@OriginalMember(owner = "client!hr", name = "V", descriptor = "[I")
	public int[] anIntArray248;

	@OriginalMember(owner = "client!hr", name = "X", descriptor = "I")
	public int anInt2887;

	@OriginalMember(owner = "client!hr", name = "db", descriptor = "I")
	public int anInt2891;

	@OriginalMember(owner = "client!hr", name = "eb", descriptor = "Z")
	public boolean aBoolean247;

	@OriginalMember(owner = "client!hr", name = "fb", descriptor = "F")
	private float aFloat52;

	@OriginalMember(owner = "client!hr", name = "gb", descriptor = "I")
	public int anInt2892;

	@OriginalMember(owner = "client!hr", name = "ob", descriptor = "Lclient!ha;")
	private Class104 aClass104_13;

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "Z")
	private boolean aBoolean244;

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "Z")
	private boolean aBoolean243;

	@OriginalMember(owner = "client!hr", name = "s", descriptor = "Lclient!pt;")
	protected Class230 aClass230_20;

	@OriginalMember(owner = "client!hr", name = "E", descriptor = "I")
	private int anInt2872;

	@OriginalMember(owner = "client!hr", name = "L", descriptor = "I")
	public int anInt2878;

	@OriginalMember(owner = "client!hr", name = "P", descriptor = "I")
	public int anInt2882;

	@OriginalMember(owner = "client!hr", name = "J", descriptor = "I")
	private int anInt2877;

	@OriginalMember(owner = "client!hr", name = "I", descriptor = "I")
	public int anInt2876;

	@OriginalMember(owner = "client!hr", name = "Z", descriptor = "I")
	public int anInt2889;

	@OriginalMember(owner = "client!hr", name = "cb", descriptor = "Z")
	private boolean aBoolean246;

	@OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
	public int anInt2870;

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "I")
	public int anInt2868;

	@OriginalMember(owner = "client!hr", name = "ib", descriptor = "I")
	private int anInt2894;

	@OriginalMember(owner = "client!hr", name = "bb", descriptor = "I")
	public int anInt2890;

	@OriginalMember(owner = "client!hr", name = "Y", descriptor = "I")
	public int anInt2888;

	@OriginalMember(owner = "client!hr", name = "hb", descriptor = "I")
	public int anInt2893;

	@OriginalMember(owner = "client!hr", name = "ab", descriptor = "Z")
	public boolean aBoolean245;

	@OriginalMember(owner = "client!hr", name = "O", descriptor = "I")
	public int anInt2881;

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
	public int anInt2869;

	@OriginalMember(owner = "client!hr", name = "jb", descriptor = "I")
	public int anInt2895;

	@OriginalMember(owner = "client!hr", name = "mb", descriptor = "I")
	public int anInt2897;

	@OriginalMember(owner = "client!hr", name = "N", descriptor = "I")
	public int anInt2880;

	@OriginalMember(owner = "client!hr", name = "W", descriptor = "I")
	private int anInt2886;

	@OriginalMember(owner = "client!hr", name = "kb", descriptor = "I")
	public int anInt2896;

	@OriginalMember(owner = "client!hr", name = "lb", descriptor = "Lclient!sw;")
	private final Class277 lb;

	@OriginalMember(owner = "client!hr", name = "nb", descriptor = "I")
	private int anInt2898;

	@OriginalMember(owner = "client!hr", name = "T", descriptor = "Lclient!sw;")
	private final Class277 aClass277_22;

	@OriginalMember(owner = "client!hr", name = "z", descriptor = "Lclient!hj;")
	public Class128_Sub1 aClass128_Sub1_4;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!n;)V")
	private Class4_Sub1(@OriginalArg(0) Interface13 arg0) {
		super(arg0);
		this.aBoolean244 = false;
		this.aBoolean243 = false;
		this.aClass230_20 = new Class230(4);
		this.anInt2872 = 0;
		this.anInt2878 = 75518;
		this.anInt2882 = 0;
		this.anInt2877 = 0;
		this.anInt2876 = 0;
		this.anInt2889 = 0;
		this.aBoolean246 = false;
		this.anInt2870 = 45823;
		this.anInt2868 = 50;
		this.anInt2894 = 3500;
		this.anInt2890 = 512;
		this.anInt2888 = 78642;
		this.anInt2893 = 0;
		this.aBoolean245 = false;
		this.anInt2881 = 3500;
		this.anInt2869 = 0;
		this.anInt2895 = 0;
		this.anInt2897 = 512;
		this.anInt2880 = this.anInt2894 - 255;
		this.anInt2886 = 0;
		this.anInt2896 = 0;
		this.lb = new Class277(16);
		this.anInt2898 = -1;
		this.aClass277_22 = new Class277(20);
		this.aClass128_Sub1_4 = new Class128_Sub1();
		this.method7185(1);
		this.method7196(0);
		Static290.method5100(true, false);
		this.aBoolean244 = true;
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class4_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface13 arg1) {
		this(arg1);
		this.method7217(arg0);
		this.method7174(arg0);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public final Class28 method7186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class28_Sub3(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "()V")
	@Override
	public final void method7154() {
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7188(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas6 == arg0) {
			this.method7174(null);
		}
		@Pc(15) Class1_Sub13 local15 = (Class1_Sub13) this.aClass230_20.method6144((long) arg0.hashCode());
		if (local15 != null) {
			local15.method8239();
		}
	}

	@OriginalMember(owner = "client!hr", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public final boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass128_Sub1_4.anInt3786 * arg0 + this.aClass128_Sub1_4.anInt3790 * arg1 + this.aClass128_Sub1_4.anInt3787 * arg2 >> 15) + this.aClass128_Sub1_4.anInt3779;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass128_Sub1_4.anInt3786 * arg3 + this.aClass128_Sub1_4.anInt3790 * arg4 + this.aClass128_Sub1_4.anInt3787 * arg5 >> 15) + this.aClass128_Sub1_4.anInt3779;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt2868 && local52 < this.anInt2868 || !(local23 <= this.anInt2894 || local52 <= this.anInt2894)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt2890 * ((this.aClass128_Sub1_4.anInt3783 * arg0 + this.aClass128_Sub1_4.anInt3780 * arg1 + this.aClass128_Sub1_4.anInt3784 * arg2 >> 15) + this.aClass128_Sub1_4.anInt3781) / local23;
		@Pc(133) int local133 = this.anInt2890 * ((this.aClass128_Sub1_4.anInt3783 * arg3 + this.aClass128_Sub1_4.anInt3780 * arg4 + this.aClass128_Sub1_4.anInt3784 * arg5 >> 15) + this.aClass128_Sub1_4.anInt3781) / local52;
		if (local104 < this.anInt2884 && local133 < this.anInt2884 || local104 > this.anInt2892 && local133 > this.anInt2892) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt2897 * ((this.aClass128_Sub1_4.anInt3788 * arg0 + this.aClass128_Sub1_4.anInt3782 * arg1 + this.aClass128_Sub1_4.anInt3785 * arg2 >> 15) + this.aClass128_Sub1_4.anInt3789) / local23;
			@Pc(209) int local209 = this.anInt2897 * ((this.aClass128_Sub1_4.anInt3788 * arg3 + this.aClass128_Sub1_4.anInt3782 * arg4 + this.aClass128_Sub1_4.anInt3785 * arg5 >> 15) + this.aClass128_Sub1_4.anInt3789) / local52;
			return (local180 >= this.anInt2875 || local209 >= this.anInt2875) && (local180 <= this.anInt2874 || local209 <= this.anInt2874);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "()Z")
	@Override
	public final boolean method7148() {
		return false;
	}

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "(I)Z")
	public final boolean method2730(@OriginalArg(0) int arg0) {
		return super.anInterface13_13.method5789(arg0).aBoolean641;
	}

	@OriginalMember(owner = "client!hr", name = "xa", descriptor = "()V")
	@Override
	public final void xa() {
		this.anInt2889 = this.anInt2872;
		this.aBoolean245 = false;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!mv;)V")
	@Override
	public final void method7218(@OriginalArg(0) Class103 arg0) {
	}

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "(IIIIII)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt2896) {
			arg2 -= this.anInt2896 - arg0;
			arg0 = this.anInt2896;
		}
		if (arg1 < this.anInt2869) {
			arg3 -= this.anInt2869 - arg1;
			arg1 = this.anInt2869;
		}
		if (arg0 + arg2 > this.anInt2893) {
			arg2 = this.anInt2893 - arg0;
		}
		if (arg1 + arg3 > this.anInt2882) {
			arg3 = this.anInt2882 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt2893 || arg1 > this.anInt2882) {
			return;
		}
		@Pc(67) int local67 = this.anInt2885 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt2885;
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
						local217 = this.anIntArray248[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray248[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray248[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray248[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray248[arg2] = arg4;
					arg2++;
					this.anIntArray248[arg2] = arg4;
					arg2++;
					this.anIntArray248[arg2] = arg4;
					arg2++;
					this.anIntArray248[arg2] = arg4;
					arg2++;
					this.anIntArray248[arg2] = arg4;
					arg2++;
					this.anIntArray248[arg2] = arg4;
					arg2++;
					this.anIntArray248[arg2] = arg4;
					arg2++;
					this.anIntArray248[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray248[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public final void method7210(@OriginalArg(0) Class1_Sub23 arg0) {
	}

	@OriginalMember(owner = "client!hr", name = "D", descriptor = "()Z")
	@Override
	public final boolean method7223() {
		return true;
	}

	@OriginalMember(owner = "client!hr", name = "v", descriptor = "()V")
	@Override
	public void method7202() {
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I[Lclient!cba;)V")
	@Override
	public final void method7222(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1) {
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V")
	@Override
	public void method7196(@OriginalArg(0) int arg0) {
		this.aClass200Array3[arg0].method5586(Thread.currentThread());
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public final void method7212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class28 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class28_Sub3 local2 = (Class28_Sub3) arg5;
		@Pc(5) int[] local5 = local2.anIntArray630;
		@Pc(8) int[] local8 = local2.anIntArray629;
		@Pc(17) int local17 = this.anInt2869 > arg7 ? this.anInt2869 : arg7;
		@Pc(32) int local32 = this.anInt2882 < arg7 + local5.length ? this.anInt2882 : arg7 + local5.length;
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
					if (local129 >= this.anInt2896 && local129 < this.anInt2893 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray248[local129 + arg1 * this.anInt2885] = arg4;
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
					if (local133 >= this.anInt2896 && local133 < this.anInt2893 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt2885;
						local248 = this.anIntArray248[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray248[local133 + arg1 * this.anInt2885] = local201 + local584;
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
		if (arg0 < this.anInt2896) {
			arg1 += local83 * (this.anInt2896 - arg0);
			arg0 = this.anInt2896;
		}
		if (arg2 >= this.anInt2893) {
			arg2 = this.anInt2893 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray248[arg0 + local129 * this.anInt2885] = arg4;
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
					local243 = arg0 + local133 * this.anInt2885;
					local248 = this.anIntArray248[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray248[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!hr", name = "P", descriptor = "()F")
	@Override
	public final float P() {
		return this.aFloat51;
	}

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "(I)V")
	@Override
	public final void method7201(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public final void method7198(@OriginalArg(0) Class128 arg0) {
		this.aClass128_Sub1_4 = (Class128_Sub1) arg0;
	}

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "()Lclient!fd;")
	@Override
	public final Class98 method7207() {
		return new Class98(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "(I)V")
	public abstract void method7213(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!saa;III)V")
	public final void method2731(@OriginalArg(0) Class46_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt4600;
		@Pc(8) int local8 = arg3 << 1;
		if (local2 == -1) {
			this.A(arg1, arg2, arg3, arg0.anInt4605, 1);
			return;
		}
		if (this.anInt2898 != local2) {
			@Pc(32) Class104 local32 = (Class104) this.lb.method7014((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method2734(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method2735(local2) ? 64 : 128;
				local32 = this.method7156(local38, local48, local48, local48);
				this.lb.method7016(local32, (long) local2);
			}
			this.anInt2898 = local2;
			this.aClass104_13 = local32;
		}
		local8++;
		this.aClass104_13.ra(arg1 - arg3, arg2 - arg3, local8, local8, 0, arg0.anInt4605, 1);
	}

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "(I)Z")
	public final boolean method2732(@OriginalArg(0) int arg0) {
		return super.anInterface13_13.method5788(arg0);
	}

	@OriginalMember(owner = "client!hr", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public final void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class28_Sub3 local2 = (Class28_Sub3) arg1;
		@Pc(5) int[] local5 = local2.anIntArray630;
		@Pc(8) int[] local8 = local2.anIntArray629;
		@Pc(20) int local20;
		if (this.anInt2882 < arg3 + local5.length) {
			local20 = this.anInt2882 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt2869 > arg3) {
			local33 = this.anInt2869 - arg3;
			arg3 = this.anInt2869;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt2885;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt2896 > local58) {
				local62 -= this.anInt2896 - local58;
				local58 = this.anInt2896;
			}
			if (this.anInt2893 < local58 + local62) {
				local62 = this.anInt2893 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray248[local58++] = arg0;
			}
			local49 += this.anInt2885;
		}
	}

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7217(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub13 local8 = (Class1_Sub13) this.aClass230_20.method6144((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static16.method8191(arg0);
			this.aClass230_20.method6139((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIII)Lclient!mv;")
	@Override
	public final Class103 method7172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!dp;Z)Lclient!ha;")
	@Override
	public final Class104 method7149(@OriginalArg(0) Class70 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray142;
		@Pc(5) byte[] local5 = arg0.aByteArray19;
		@Pc(8) int local8 = arg0.anInt2013;
		@Pc(11) int local11 = arg0.anInt2012;
		@Pc(76) Class104_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray18 == null) {
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
			local76 = new Class104_Sub1_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray18;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class104_Sub1_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class104_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.KA(arg0.anInt2011, arg0.anInt2010, arg0.anInt2015, arg0.anInt2014);
		return local76;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7158(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!hr", name = "w", descriptor = "()Z")
	public final boolean method2733() {
		return this.aBoolean243;
	}

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7153() {
		return false;
	}

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "(I)[I")
	private int[] method2734(@OriginalArg(0) int arg0) {
		@Pc(2) Class277 local2 = this.aClass277_22;
		@Pc(12) Class1_Sub22 local12;
		synchronized (this.aClass277_22) {
			local12 = (Class1_Sub22) this.aClass277_22.method7014((long) arg0);
			if (local12 == null) {
				if (!super.anInterface13_13.method5788(arg0)) {
					return null;
				}
				@Pc(32) Class296 local32 = super.anInterface13_13.method5789(arg0);
				@Pc(42) int local42 = local32.aBoolean638 || this.aBoolean246 ? 64 : 128;
				local12 = new Class1_Sub22(arg0, local42, super.anInterface13_13.method5786(0.7F, local42, local42, arg0), local32.aBoolean639);
				this.aClass277_22.method7016(local12, (long) arg0);
			}
		}
		local12.aBoolean324 = true;
		return local12.method3803();
	}

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "(I)Z")
	public final boolean method2735(@OriginalArg(0) int arg0) {
		return this.aBoolean246 || super.anInterface13_13.method5789(arg0).aBoolean638;
	}

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "()Z")
	@Override
	public final boolean method7204() {
		return false;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIIIII)V")
	public final void method2736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface13_13.method5789(arg5).aBoolean640) {
			this.A(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt2898 != arg5) {
			@Pc(26) Class104 local26 = (Class104) this.lb.method7014((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method2734(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method2735(arg5) ? 64 : 128;
				local26 = this.method7156(local32, local43, local43, local43);
				this.lb.method7016(local26, (long) arg5);
			}
			this.anInt2898 = arg5;
			this.aClass104_13 = local26;
		}
		this.aClass104_13.ra(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "(I)[I")
	public final int[] method2737(@OriginalArg(0) int arg0) {
		@Pc(2) Class277 local2 = this.aClass277_22;
		@Pc(12) Class1_Sub22 local12;
		synchronized (this.aClass277_22) {
			local12 = (Class1_Sub22) this.aClass277_22.method7014((long) arg0);
			if (local12 == null) {
				if (!super.anInterface13_13.method5788(arg0)) {
					return null;
				}
				@Pc(32) Class296 local32 = super.anInterface13_13.method5789(arg0);
				@Pc(42) int local42 = local32.aBoolean638 || this.aBoolean246 ? 64 : 128;
				local12 = new Class1_Sub22(arg0, local42, super.anInterface13_13.method5790(local42, true, 0.7F, arg0, local42), local32.aBoolean639);
				this.aClass277_22.method7016(local12, (long) arg0);
			}
		}
		local12.aBoolean324 = true;
		return local12.method3803();
	}

	@OriginalMember(owner = "client!hr", name = "CA", descriptor = "()I")
	@Override
	public final int CA() {
		return this.anInt2894;
	}

	@OriginalMember(owner = "client!hr", name = "v", descriptor = "(IIII)[I")
	@Override
	public final int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt2885 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray248[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!hr", name = "ra", descriptor = "()F")
	@Override
	public final float ra() {
		return this.aFloat52;
	}

	@OriginalMember(owner = "client!hr", name = "s", descriptor = "()Lclient!m;")
	@Override
	public final Class128 method7189() {
		return new Class128_Sub1();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIF)Lclient!cba;")
	@Override
	public final Class1_Sub5 method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7160(@OriginalArg(0) boolean arg0) {
		this.aBoolean246 = arg0;
		this.aClass277_22.method7019();
	}

	@OriginalMember(owner = "client!hr", name = "E", descriptor = "(III)V")
	@Override
	public final void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2889 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt2889 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt2889 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt2889 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt2889 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean247 = false;
		} else {
			this.aBoolean247 = true;
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)I")
	@Override
	public final int method7184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(IIII)V")
	@Override
	public final void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2879 = arg0;
		this.anInt2887 = arg1;
		this.anInt2890 = arg2;
		this.anInt2897 = arg3;
		this.method2739();
	}

	@OriginalMember(owner = "client!hr", name = "IA", descriptor = "(III[I)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass128_Sub1_4.anInt3779 + (this.aClass128_Sub1_4.anInt3786 * arg0 + this.aClass128_Sub1_4.anInt3790 * arg1 + this.aClass128_Sub1_4.anInt3787 * arg2 >> 15);
		if (local23 < this.anInt2868 || local23 > this.anInt2894) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt2890 * (this.aClass128_Sub1_4.anInt3781 + (this.aClass128_Sub1_4.anInt3783 * arg0 + this.aClass128_Sub1_4.anInt3780 * arg1 + this.aClass128_Sub1_4.anInt3784 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt2897 * (this.aClass128_Sub1_4.anInt3789 + (this.aClass128_Sub1_4.anInt3788 * arg0 + this.aClass128_Sub1_4.anInt3782 * arg1 + this.aClass128_Sub1_4.anInt3785 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt2884 && local73 <= this.anInt2892 && local102 >= this.anInt2875 && local102 <= this.anInt2874) {
			arg3[0] = local73 - this.anInt2884;
			arg3[1] = local102 - this.anInt2875;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ei;IIII)Lclient!r;")
	public abstract Class97 method7192(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "()V")
	@Override
	public final void method7161() {
	}

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7152() {
		return true;
	}

	@OriginalMember(owner = "client!hr", name = "N", descriptor = "(IIII)V")
	@Override
	public final void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt2885) {
			arg2 = this.anInt2885;
		}
		if (arg3 > this.anInt2871) {
			arg3 = this.anInt2871;
		}
		this.anInt2896 = arg0;
		this.anInt2893 = arg2;
		this.anInt2869 = arg1;
		this.anInt2882 = arg3;
		this.method2739();
	}

	@OriginalMember(owner = "client!hr", name = "UA", descriptor = "(IIIII)V")
	@Override
	public final void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt2869 || arg1 >= this.anInt2882) {
			return;
		}
		if (arg0 < this.anInt2896) {
			arg2 -= this.anInt2896 - arg0;
			arg0 = this.anInt2896;
		}
		if (arg0 + arg2 > this.anInt2893) {
			arg2 = this.anInt2893 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2885;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray248[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray248[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray248[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray248[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray248[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public final Class104 method7156(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class104_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class104_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class104_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class104_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hr", name = "E", descriptor = "()V")
	protected final void method2738() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2883; local1++) {
			this.aClass200Array3[local1].method5587();
		}
		this.n();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!r;Lclient!ka;Lclient!m;Lclient!cf;I)V")
	@Override
	public final void method7211(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) Class46_Sub1 arg3) {
		((Class97_Sub1) arg0).method5540(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.UA(arg0, arg1, arg2, arg4, arg5);
		this.UA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.e(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.e(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "(IIII)V")
	@Override
	public final void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2872 = this.anInt2889;
		this.anInt2876 = arg0;
		this.anInt2889 = arg1;
		this.anInt2895 = arg2;
		this.aBoolean245 = true;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!mv;Lclient!mv;FLclient!mv;)Lclient!mv;")
	@Override
	public final Class103 method7200(@OriginalArg(0) Class103 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class103 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!hr", name = "ta", descriptor = "(II)V")
	@Override
	public final void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2868 = arg0;
		this.anInt2894 = arg1;
		this.anInt2880 = this.anInt2894 - 255;
		this.method2740();
	}

	@OriginalMember(owner = "client!hr", name = "JA", descriptor = "(IIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2876 = arg0;
		this.anInt2889 = arg1;
		this.anInt2895 = arg2;
	}

	@OriginalMember(owner = "client!hr", name = "B", descriptor = "()Z")
	@Override
	public final boolean method7219() {
		return true;
	}

	@OriginalMember(owner = "client!hr", name = "F", descriptor = "(IIII)V")
	@Override
	public final void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2896 < arg0) {
			this.anInt2896 = arg0;
		}
		if (this.anInt2869 < arg1) {
			this.anInt2869 = arg1;
		}
		if (this.anInt2893 > arg2) {
			this.anInt2893 = arg2;
		}
		if (this.anInt2882 > arg3) {
			this.anInt2882 = arg3;
		}
		this.method2739();
	}

	@OriginalMember(owner = "client!hr", name = "YA", descriptor = "()I")
	@Override
	public final int YA() {
		@Pc(2) int local2 = this.anInt2877;
		this.anInt2877 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public final void method7178(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas6 == null || this.aClass1_Sub13_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas6.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt2885 && local21.y <= this.anInt2871 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass1_Sub13_3.method8177(local21.width, local21.height, local14, local21.y, local21.x);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ka;)V")
	@Override
	public final void method7179(@OriginalArg(0) Class158 arg0) {
		@Pc(3) Class46_Sub3 local3 = arg0.aClass185_1.aClass46_Sub3_7;
		for (@Pc(6) Class46_Sub3 local6 = local3.aClass46_Sub3_9; local6 != local3; local6 = local6.aClass46_Sub3_9) {
			@Pc(10) Class46_Sub3_Sub1 local10 = (Class46_Sub3_Sub1) local6;
			@Pc(15) int local15 = local10.anInt4593 >> 12;
			@Pc(20) int local20 = local10.anInt4601 >> 12;
			@Pc(25) int local25 = local10.anInt4597 >> 12;
			@Pc(49) int local49 = this.aClass128_Sub1_4.anInt3779 + (this.aClass128_Sub1_4.anInt3786 * local15 + this.aClass128_Sub1_4.anInt3790 * local20 + this.aClass128_Sub1_4.anInt3787 * local25 >> 15);
			if (local49 >= this.anInt2868 && local49 <= this.anInt2880) {
				@Pc(90) int local90 = this.anInt2879 + this.anInt2890 * (this.aClass128_Sub1_4.anInt3781 + (this.aClass128_Sub1_4.anInt3783 * local15 + this.aClass128_Sub1_4.anInt3780 * local20 + this.aClass128_Sub1_4.anInt3784 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt2887 + this.anInt2897 * (this.aClass128_Sub1_4.anInt3789 + (this.aClass128_Sub1_4.anInt3788 * local15 + this.aClass128_Sub1_4.anInt3782 * local20 + this.aClass128_Sub1_4.anInt3785 * local25 >> 15)) / local49;
				if (local90 >= this.anInt2896 && local90 <= this.anInt2893 && local122 >= this.anInt2869 && local122 <= this.anInt2882) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method2731(local10, local90, local122, (local10.anInt4604 * this.anInt2890 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public final Class104 method7199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt2885 + arg0;
		@Pc(16) int local16 = this.anInt2885 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray248[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class104_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class104_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7174(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "()Lclient!m;")
	@Override
	public final Class128 method7165() {
		@Pc(3) Class200 local3 = this.method2741(Thread.currentThread());
		return local3.aClass128_Sub1_9;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V")
	public abstract void method7185(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hr", name = "C", descriptor = "()V")
	@Override
	public final void method7221() {
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.UA(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.UA(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt2896) {
					arg1 += local104 * (this.anInt2896 - arg0);
					arg0 = this.anInt2896;
				}
				if (arg2 >= this.anInt2893) {
					arg2 = this.anInt2893 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt2869 && local150 < this.anInt2882) {
							this.anIntArray248[arg0 + local150 * this.anInt2885] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt2869 && local213 < this.anInt2882) {
							local228 = arg0 + local213 * this.anInt2885;
							local233 = this.anIntArray248[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray248[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt2869 && local150 < this.anInt2882) {
							local213 = arg0 + local150 * this.anInt2885;
							local228 = this.anIntArray248[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray248[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt2869) {
					arg0 += local104 * (this.anInt2869 - arg1);
					arg1 = this.anInt2869;
				}
				if (arg3 >= this.anInt2882) {
					arg3 = this.anInt2882 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt2896 && local150 < this.anInt2893) {
							this.anIntArray248[local150 + arg1 * this.anInt2885] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt2896 && local213 < this.anInt2893) {
							local228 = local213 + arg1 * this.anInt2885;
							local233 = this.anIntArray248[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray248[local213 + arg1 * this.anInt2885] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt2896 && local150 < this.anInt2893) {
							local213 = local150 + arg1 * this.anInt2885;
							local228 = this.anIntArray248[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray248[local213] = local233 - local587 | local587 - (local587 >>> 8);
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.e(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.e(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!hr", name = "F", descriptor = "()V")
	protected abstract void method2739();

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "()Z")
	@Override
	public final boolean method7195() {
		return false;
	}

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt2870 = (int) (arg1 * 65535.0F);
		this.anInt2888 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt2891 = (int) (arg3 * 65535.0F / local26);
		this.anInt2867 = (int) (arg4 * 65535.0F / local26);
		this.anInt2873 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([Lclient!r;Lclient!ka;Lclient!m;[Lclient!cf;I)V")
	public abstract void method7175(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) Class46_Sub1[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!hr", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt2885;
		@Pc(35) int local35 = this.anInt2885 - arg2;
		if (arg1 + arg3 > this.anInt2882) {
			arg3 -= arg1 + arg3 - this.anInt2882;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt2869) {
			local59 = this.anInt2869 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt2885;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt2893) {
			local59 = arg0 + arg2 - this.anInt2893;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt2896) {
			local59 = this.anInt2896 - arg0;
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
						this.anIntArray248[local30++] = arg4;
					} else {
						this.anIntArray248[local30++] = arg5;
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
					local245 = this.anIntArray248[local30];
					this.anIntArray248[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray248[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray248[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!hr", name = "ba", descriptor = "()I")
	@Override
	public final int ba() {
		@Pc(2) int local2 = this.anInt2886;
		this.anInt2886 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
	@Override
	public final void method7177(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2866;
		for (@Pc(9) Object local9 = this.aClass277_22.method7013(); local9 != null; local9 = this.aClass277_22.method7022()) {
			@Pc(13) Class1_Sub22 local13 = (Class1_Sub22) local9;
			if (local13.aBoolean324) {
				local13.anInt4063 += local4;
				@Pc(27) int local27 = local13.anInt4063 / 20;
				if (local27 > 0) {
					@Pc(36) Class296 local36 = super.anInterface13_13.method5789(local13.anInt4062);
					local13.method3804(local36.aByte101 * local4 * 50 / 1000, local36.aByte105 * local4 * 50 / 1000);
					local13.anInt4063 -= local27 * 20;
				}
				local13.aBoolean324 = false;
			}
		}
		this.anInt2866 = arg0;
		this.lb.method7018(5);
	}

	@OriginalMember(owner = "client!hr", name = "la", descriptor = "(FF)V")
	@Override
	public final void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat51 = arg0;
		this.aFloat52 = arg1;
		this.method2740();
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(Z)V")
	@Override
	public final void method7216(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hr", name = "A", descriptor = "()Z")
	@Override
	public final boolean method7209() {
		return false;
	}

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "()Z")
	@Override
	public final boolean method7180() {
		return false;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)I")
	@Override
	public final int method7167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "()V")
	@Override
	protected final void method7197() {
		if (this.aBoolean244) {
			Static133.method7848(false, true);
			this.aBoolean244 = false;
		}
		this.aClass1_Sub13_3 = null;
		this.aCanvas6 = null;
		this.aClass230_20 = null;
		this.aBoolean243 = true;
	}

	@OriginalMember(owner = "client!hr", name = "Z", descriptor = "(I)V")
	@Override
	public final void Z(@OriginalArg(0) int arg0) {
		this.f(0, 0, this.anInt2885, this.anInt2871, arg0, 0);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	public abstract Class7 method7187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7214(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hr", name = "A", descriptor = "(IIIII)V")
	@Override
	protected final void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt2869) {
			local8 = this.anInt2869;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt2882) {
			local21 = this.anInt2882;
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
				if (local91 < this.anInt2896) {
					local91 = this.anInt2896;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2893) {
					local102 = this.anInt2893;
				}
				local116 = local91 + local30 * this.anInt2885;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray248[local116++] = arg3;
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
				if (local91 < this.anInt2896) {
					local91 = this.anInt2896;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2893 - 1) {
					local102 = this.anInt2893 - 1;
				}
				local116 = local91 + local30 * this.anInt2885;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray248[local116++] = arg3;
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
				if (local102 < this.anInt2896) {
					local102 = this.anInt2896;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt2893) {
					local116 = this.anInt2893;
				}
				local118 = local102 + local30 * this.anInt2885;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray248[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray248[local118++] = local277 + local340;
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
				if (local102 < this.anInt2896) {
					local102 = this.anInt2896;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt2893 - 1) {
					local116 = this.anInt2893 - 1;
				}
				local118 = local102 + local30 * this.anInt2885;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray248[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray248[local118++] = local277 + local340;
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
				if (local91 < this.anInt2896) {
					local91 = this.anInt2896;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2893) {
					local102 = this.anInt2893;
				}
				local116 = local91 + local30 * this.anInt2885;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray248[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray248[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt2896) {
					local91 = this.anInt2896;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2893 - 1) {
					local102 = this.anInt2893 - 1;
				}
				local116 = local91 + local30 * this.anInt2885;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray248[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray248[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hr", name = "M", descriptor = "(F)V")
	@Override
	public final void M(@OriginalArg(0) float arg0) {
		this.anInt2878 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "()V")
	@Override
	public final void method7164() {
		if (this.aCanvas6 == null || this.aClass1_Sub13_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas6.getGraphics();
			this.aClass1_Sub13_3.method8178(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "()Z")
	public abstract boolean method7166();

	@OriginalMember(owner = "client!hr", name = "L", descriptor = "(I)V")
	@Override
	public final void L(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "()Z")
	@Override
	public final boolean method7182() {
		return false;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method7169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "()V")
	@Override
	public final void n() {
		this.anInt2896 = 0;
		this.anInt2869 = 0;
		this.anInt2893 = this.anInt2885;
		this.anInt2882 = this.anInt2871;
		this.method2739();
	}

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "()Z")
	@Override
	public final boolean method7171() {
		return true;
	}

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "([I)V")
	@Override
	public final void d(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2896;
		arg0[1] = this.anInt2869;
		arg0[2] = this.anInt2893;
		arg0[3] = this.anInt2882;
	}

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "()V")
	@Override
	public final void method7173() {
		this.aClass277_22.method7019();
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "()Z")
	@Override
	public final boolean method7151() {
		return false;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(FFF)V")
	@Override
	public final void method7206(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt2896 || arg0 >= this.anInt2893) {
			return;
		}
		if (arg1 < this.anInt2869) {
			arg2 -= this.anInt2869 - arg1;
			arg1 = this.anInt2869;
		}
		if (arg1 + arg2 > this.anInt2882) {
			arg2 = this.anInt2882 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2885;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray248[local40 + local54 * this.anInt2885] = arg3;
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
				local111 = local40 + local103 * this.anInt2885;
				local116 = this.anIntArray248[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray248[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt2885;
				local111 = this.anIntArray248[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray248[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!fc;[Lclient!dp;Z)Lclient!ra;")
	@Override
	public final Class36 method7193(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class70[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2013;
			local7[local11] = arg1[local11].anInt2012;
			if (arg1[local11].aByteArray18 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class36_Sub4(this, arg0, arg1, local3, local7);
		} else {
			return new Class36_Sub2(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "()I")
	@Override
	public final int method7163() {
		return 0;
	}

	@OriginalMember(owner = "client!hr", name = "G", descriptor = "()V")
	private void method2740() {
		if (this.aFloat52 == 0.0F) {
			this.anInt2881 = this.anInt2894;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt2894;
		@Pc(12) float local12 = (float) this.anInt2868;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat51 / (this.aFloat52 + this.aFloat51);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat52;
		this.anInt2881 = (int) (((float) this.anInt2894 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method7215();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!vc;")
	public abstract Class200 method2741(@OriginalArg(0) Runnable arg0);

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt2868;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!cf;I)V")
	public abstract void method7159(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) Class46_Sub1[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!hr", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7208() {
		return false;
	}

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7183() {
		return false;
	}

	@OriginalMember(owner = "client!hr", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return 0;
	}

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "()V")
	@Override
	public final void method7168() {
	}

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)Lclient!u;")
	@Override
	public final Class1_Sub23 method7220(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "(I)I")
	public final int method2742(@OriginalArg(0) int arg0) {
		return super.anInterface13_13.method5789(arg0).aShort116 & 0xFFFF;
	}
}
