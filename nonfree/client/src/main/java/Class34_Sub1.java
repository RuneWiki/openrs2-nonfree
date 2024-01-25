import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "Lclient!we;")
	private Class1_Sub30 aClass1_Sub30_1;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "Z")
	private boolean aBoolean86;

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
	private int anInt776;

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "Z")
	private boolean aBoolean87;

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "Lclient!qh;")
	private Class199 aClass199_30;

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
	public int anInt777;

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "Lclient!cn;")
	public Class32_Sub1 aClass32_Sub1_1;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "Lclient!o;")
	private Class6 aClass6_11;

	@OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
	public int anInt778;

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "Lclient!hn;")
	private final Class102 aClass102_9;

	@OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
	public int anInt779;

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
	private int anInt780;

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
	public int anInt781;

	@OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
	public int anInt782;

	@OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
	private int anInt783;

	@OriginalMember(owner = "client!cd", name = "K", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
	public int anInt784;

	@OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
	public int anInt785;

	@OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
	public int anInt786;

	@OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
	public int anInt787;

	@OriginalMember(owner = "client!cd", name = "P", descriptor = "F")
	private float aFloat10;

	@OriginalMember(owner = "client!cd", name = "Q", descriptor = "Z")
	private boolean aBoolean89;

	@OriginalMember(owner = "client!cd", name = "R", descriptor = "[I")
	public int[] anIntArray40;

	@OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
	public int anInt788;

	@OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
	public int anInt789;

	@OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
	public int anInt790;

	@OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
	public int anInt791;

	@OriginalMember(owner = "client!cd", name = "W", descriptor = "I")
	public int anInt792;

	@OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
	private int anInt793;

	@OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
	public int anInt794;

	@OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
	private int anInt795;

	@OriginalMember(owner = "client!cd", name = "ab", descriptor = "Lclient!hn;")
	private final Class102 aClass102_10;

	@OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
	public int anInt796;

	@OriginalMember(owner = "client!cd", name = "cb", descriptor = "I")
	public int anInt797;

	@OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
	public int anInt798;

	@OriginalMember(owner = "client!cd", name = "eb", descriptor = "I")
	public int anInt799;

	@OriginalMember(owner = "client!cd", name = "fb", descriptor = "F")
	private float aFloat11;

	@OriginalMember(owner = "client!cd", name = "gb", descriptor = "I")
	public int anInt800;

	@OriginalMember(owner = "client!cd", name = "hb", descriptor = "I")
	public int anInt801;

	@OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
	public int anInt802;

	@OriginalMember(owner = "client!cd", name = "jb", descriptor = "I")
	private int anInt803;

	@OriginalMember(owner = "client!cd", name = "kb", descriptor = "I")
	public int anInt804;

	@OriginalMember(owner = "client!cd", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!cd", name = "mb", descriptor = "Z")
	public boolean aBoolean90;

	@OriginalMember(owner = "client!cd", name = "nb", descriptor = "[Lclient!lb;")
	private Class140[] aClass140Array1;

	@OriginalMember(owner = "client!cd", name = "ob", descriptor = "I")
	public int anInt805;

	@OriginalMember(owner = "client!cd", name = "pb", descriptor = "I")
	public int anInt806;

	@OriginalMember(owner = "client!cd", name = "qb", descriptor = "Lclient!o;")
	private Class6 aClass6_12;

	@OriginalMember(owner = "client!cd", name = "rb", descriptor = "I")
	private int anInt807;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;)V")
	public Class34_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface6 arg2) {
		this(arg0, arg2);
		this.method5738(arg1);
		this.method5793(arg1);
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(ILclient!l;)V")
	private Class34_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Interface6 arg1) {
		super(arg0, arg1);
		this.aBoolean86 = false;
		this.aBoolean87 = false;
		this.aClass199_30 = new Class199(4);
		this.anInt786 = 512;
		this.anInt783 = 0;
		this.anInt777 = 0;
		this.anInt782 = 0;
		this.anInt788 = 78642;
		this.anInt779 = 0;
		this.anInt796 = 45823;
		this.anInt792 = 0;
		this.anInt793 = 0;
		this.aBoolean89 = false;
		this.anInt798 = 3500;
		this.anInt797 = 75518;
		this.anInt780 = 3500;
		this.anInt791 = 50;
		this.anInt795 = 0;
		this.lb = 0;
		this.anInt801 = this.anInt780 - 255;
		this.aBoolean90 = false;
		this.anInt806 = 512;
		this.anInt800 = 0;
		this.anInt805 = 0;
		this.aClass102_10 = new Class102(16);
		this.anInt807 = -1;
		this.aClass102_9 = new Class102(20);
		this.aClass32_Sub1_1 = new Class32_Sub1();
		this.method5757(1);
		this.method5742(0);
		Static182.method2647(true, false);
		this.aBoolean86 = true;
	}

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "()V")
	@Override
	public void method5781() {
		if (this.aCanvas2 == null || this.aClass1_Sub30_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas2.getGraphics();
			this.aClass1_Sub30_1.method4041(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(Z)V")
	@Override
	public void method5768(@OriginalArg(0) boolean arg0) {
		this.aBoolean89 = arg0;
		this.aClass102_9.method2271();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIII)V")
	public void method784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface6_8.method3937(arg5).aBoolean340) {
			this.ZA(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt807 != arg5) {
			@Pc(26) Class6 local26 = (Class6) this.aClass102_10.method2258((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method787(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method790(arg5) ? 64 : 128;
				local26 = this.method5798(local32, local43, local43, local43);
				this.aClass102_10.method2272((long) arg5, local26);
			}
			this.anInt807 = arg5;
			this.aClass6_12 = local26;
		}
		this.aClass6_12.ya(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)I")
	@Override
	public int method5783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.ma(arg0, arg1, arg2, arg4, arg5);
		this.ma(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.IA(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.IA(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	@Override
	public void method5742(@OriginalArg(0) int arg0) {
		this.aClass140Array1[arg0].method3254(Thread.currentThread());
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(II)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt791 = arg0;
		this.anInt780 = arg1;
		this.anInt801 = this.anInt780 - 255;
		this.method786();
	}

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)Z")
	public boolean method785(@OriginalArg(0) int arg0) {
		return super.anInterface6_8.method3937(arg0).aBoolean342;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	@Override
	public void method5743(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt776;
		for (@Pc(9) Object local9 = this.aClass102_9.method2269(); local9 != null; local9 = this.aClass102_9.method2273()) {
			@Pc(13) Class1_Sub16 local13 = (Class1_Sub16) local9;
			if (local13.aBoolean191) {
				local13.anInt1667 += local4;
				@Pc(27) int local27 = local13.anInt1667 / 20;
				if (local27 > 0) {
					@Pc(36) Class114 local36 = super.anInterface6_8.method3937(local13.anInt1669);
					local13.method1458(local36.aByte28 * local4 * 50 / 1000, local36.aByte27 * local4 * 50 / 1000);
					local13.anInt1667 -= local27 * 20;
				}
				local13.aBoolean191 = false;
			}
		}
		this.anInt776 = arg0;
		this.aClass102_10.method2262(5);
	}

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "()Z")
	@Override
	public boolean method5766() {
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!pq;IIII)Lclient!e;")
	@Override
	public Class57 method5792(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class57_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!cd", name = "MA", descriptor = "([I)V")
	@Override
	public void MA(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt805;
		arg0[1] = this.anInt782;
		arg0[2] = this.lb;
		arg0[3] = this.anInt800;
	}

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "()Z")
	@Override
	public boolean method5775() {
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)I")
	@Override
	public int method5787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "()V")
	private void method786() {
		if (this.aFloat11 == 0.0F) {
			this.anInt798 = this.anInt780;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt780;
		@Pc(12) float local12 = (float) this.anInt791;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat10 / (this.aFloat11 + this.aFloat10);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat11;
		this.anInt798 = (int) (((float) this.anInt780 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[Lclient!bn;)V")
	@Override
	public void method5730(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7[] arg1) {
	}

	@OriginalMember(owner = "client!cd", name = "K", descriptor = "(IIIIII[BII)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt790;
		@Pc(35) int local35 = this.anInt790 - arg2;
		if (arg1 + arg3 > this.anInt800) {
			arg3 -= arg1 + arg3 - this.anInt800;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt782) {
			local59 = this.anInt782 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt790;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.lb) {
			local59 = arg0 + arg2 - this.lb;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt805) {
			local59 = this.anInt805 - arg0;
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
						this.anIntArray40[local30++] = arg4;
					} else {
						this.anIntArray40[local30++] = arg5;
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
					local245 = this.anIntArray40[local30];
					this.anIntArray40[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray40[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray40[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class104 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class104_Sub1 local2 = (Class104_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray180;
		@Pc(8) int[] local8 = local2.anIntArray179;
		@Pc(17) int local17 = this.anInt782 > arg7 ? this.anInt782 : arg7;
		@Pc(32) int local32 = this.anInt800 < arg7 + local5.length ? this.anInt800 : arg7 + local5.length;
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
					if (local129 >= this.anInt805 && local129 < this.lb && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray40[local129 + arg1 * this.anInt790] = arg4;
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
					if (local133 >= this.anInt805 && local133 < this.lb && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt790;
						local248 = this.anIntArray40[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray40[local133 + arg1 * this.anInt790] = local201 + local584;
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
		if (arg0 < this.anInt805) {
			arg1 += local83 * (this.anInt805 - arg0);
			arg0 = this.anInt805;
		}
		if (arg2 >= this.lb) {
			arg2 = this.lb - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray40[arg0 + local129 * this.anInt790] = arg4;
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
					local243 = arg0 + local133 * this.anInt790;
					local248 = this.anIntArray40[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray40[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!cd", name = "IA", descriptor = "(IIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt805 || arg0 >= this.lb) {
			return;
		}
		if (arg1 < this.anInt782) {
			arg2 -= this.anInt782 - arg1;
			arg1 = this.anInt782;
		}
		if (arg1 + arg2 > this.anInt800) {
			arg2 = this.anInt800 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt790;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray40[local40 + local54 * this.anInt790] = arg3;
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
				local111 = local40 + local103 * this.anInt790;
				local116 = this.anIntArray40[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray40[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt790;
				local111 = this.anIntArray40[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray40[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "(IIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt795 = this.anInt792;
		this.anInt779 = arg0;
		this.anInt792 = arg1;
		this.anInt777 = arg2;
		this.aBoolean90 = true;
	}

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "(I)[I")
	private int[] method787(@OriginalArg(0) int arg0) {
		@Pc(2) Class102 local2 = this.aClass102_9;
		@Pc(12) Class1_Sub16 local12;
		synchronized (this.aClass102_9) {
			local12 = (Class1_Sub16) this.aClass102_9.method2258((long) arg0);
			if (local12 == null) {
				if (!super.anInterface6_8.method3934(arg0)) {
					return null;
				}
				@Pc(32) Class114 local32 = super.anInterface6_8.method3937(arg0);
				@Pc(42) int local42 = local32.aBoolean339 || this.aBoolean89 ? 64 : 128;
				local12 = new Class1_Sub16(arg0, local42, super.anInterface6_8.method3935(local42, local42, arg0, 0.7F), local32.aBoolean346);
				this.aClass102_9.method2272((long) arg0, local12);
			}
		}
		local12.aBoolean191 = true;
		return local12.method1456();
	}

	@OriginalMember(owner = "client!cd", name = "SA", descriptor = "(Lclient!c;)V")
	@Override
	public void SA(@OriginalArg(0) Class32 arg0) {
		this.aClass32_Sub1_1 = (Class32_Sub1) arg0;
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "()Z")
	@Override
	public boolean method5740() {
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt805) {
			arg2 -= this.anInt805 - arg0;
			arg0 = this.anInt805;
		}
		if (arg1 < this.anInt782) {
			arg3 -= this.anInt782 - arg1;
			arg1 = this.anInt782;
		}
		if (arg0 + arg2 > this.lb) {
			arg2 = this.lb - arg0;
		}
		if (arg1 + arg3 > this.anInt800) {
			arg3 = this.anInt800 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.lb || arg1 > this.anInt800) {
			return;
		}
		@Pc(67) int local67 = this.anInt790 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt790;
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
						local221 = this.anIntArray40[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray40[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray40[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray40[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray40[arg2] = arg4;
					arg2++;
					this.anIntArray40[arg2] = arg4;
					arg2++;
					this.anIntArray40[arg2] = arg4;
					arg2++;
					this.anIntArray40[arg2] = arg4;
					arg2++;
					this.anIntArray40[arg2] = arg4;
					arg2++;
					this.anIntArray40[arg2] = arg4;
					arg2++;
					this.anIntArray40[arg2] = arg4;
					arg2++;
					this.anIntArray40[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray40[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "()Z")
	@Override
	public boolean method5794() {
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "()Z")
	@Override
	public boolean method5732() {
		return true;
	}

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "(I)[I")
	public int[] method788(@OriginalArg(0) int arg0) {
		@Pc(2) Class102 local2 = this.aClass102_9;
		@Pc(12) Class1_Sub16 local12;
		synchronized (this.aClass102_9) {
			local12 = (Class1_Sub16) this.aClass102_9.method2258((long) arg0);
			if (local12 == null) {
				if (!super.anInterface6_8.method3934(arg0)) {
					return null;
				}
				@Pc(32) Class114 local32 = super.anInterface6_8.method3937(arg0);
				@Pc(42) int local42 = local32.aBoolean339 || this.aBoolean89 ? 64 : 128;
				local12 = new Class1_Sub16(arg0, local42, super.anInterface6_8.method3933(0.7F, true, arg0, local42, local42), local32.aBoolean346);
				this.aClass102_9.method2272((long) arg0, local12);
			}
		}
		local12.aBoolean191 = true;
		return local12.method1456();
	}

	@OriginalMember(owner = "client!cd", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt792 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt792 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt792 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt792 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt792 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean88 = false;
		} else {
			this.aBoolean88 = true;
		}
	}

	@OriginalMember(owner = "client!cd", name = "C", descriptor = "()V")
	private void method789() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt778; local1++) {
			this.aClass140Array1[local1].method3256();
		}
		this.va();
	}

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "(I)Z")
	public boolean method790(@OriginalArg(0) int arg0) {
		return this.aBoolean89 || super.anInterface6_8.method3937(arg0).aBoolean339;
	}

	@OriginalMember(owner = "client!cd", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt791;
	}

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "(III[I)V")
	@Override
	public void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass32_Sub1_1.anInt1075 + (this.aClass32_Sub1_1.anInt1077 * arg0 + this.aClass32_Sub1_1.anInt1083 * arg1 + this.aClass32_Sub1_1.anInt1082 * arg2 >> 15);
		if (local23 < this.anInt791 || local23 > this.anInt780) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt806 * (this.aClass32_Sub1_1.anInt1084 + (this.aClass32_Sub1_1.anInt1086 * arg0 + this.aClass32_Sub1_1.anInt1079 * arg1 + this.aClass32_Sub1_1.anInt1085 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt786 * (this.aClass32_Sub1_1.anInt1078 + (this.aClass32_Sub1_1.anInt1080 * arg0 + this.aClass32_Sub1_1.anInt1076 * arg1 + this.aClass32_Sub1_1.anInt1081 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt787 && local73 <= this.anInt804 && local102 >= this.anInt784 && local102 <= this.anInt785) {
			arg3[0] = local73 - this.anInt787;
			arg3[1] = local102 - this.anInt784;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "(IFFFFF)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt796 = (int) (arg1 * 65535.0F);
		this.anInt788 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt802 = (int) (arg3 * 65535.0F / local26);
		this.anInt794 = (int) (arg4 * 65535.0F / local26);
		this.anInt781 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!cd", name = "ya", descriptor = "(I)V")
	@Override
	public void ya(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt805) {
					arg1 += local104 * (this.anInt805 - arg0);
					arg0 = this.anInt805;
				}
				if (arg2 >= this.lb) {
					arg2 = this.lb - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt782 && local150 < this.anInt800) {
							this.anIntArray40[arg0 + local150 * this.anInt790] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt782 && local213 < this.anInt800) {
							local228 = arg0 + local213 * this.anInt790;
							local233 = this.anIntArray40[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray40[local228] = local204 + local233;
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
				if (arg1 < this.anInt782) {
					arg0 += local104 * (this.anInt782 - arg1);
					arg1 = this.anInt782;
				}
				if (arg3 >= this.anInt800) {
					arg3 = this.anInt800 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt805 && local150 < this.lb) {
							this.anIntArray40[local150 + arg1 * this.anInt790] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt805 && local213 < this.lb) {
							local228 = local213 + arg1 * this.anInt790;
							local233 = this.anIntArray40[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray40[local213 + arg1 * this.anInt790] = local204 + local516;
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

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
	@Override
	public void method5757(@OriginalArg(0) int arg0) {
		if (this.anInt778 == arg0) {
			return;
		}
		this.anInt778 = arg0;
		this.aClass140Array1 = new Class140[this.anInt778];
		for (@Pc(14) int local14 = 0; local14 < this.anInt778; local14++) {
			this.aClass140Array1[local14] = new Class140(this);
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "()Z")
	@Override
	public boolean method5734() {
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "()V")
	private void method791() {
		this.anInt787 = this.anInt805 - this.anInt789;
		this.anInt804 = this.lb - this.anInt789;
		this.anInt784 = this.anInt782 - this.anInt799;
		this.anInt785 = this.anInt800 - this.anInt799;
		for (@Pc(29) int local29 = 0; local29 < this.anInt778; local29++) {
			@Pc(36) Class174 local36 = this.aClass140Array1[local29].aClass174_2;
			local36.anInt5004 = this.anInt789 - this.anInt805;
			local36.anInt5001 = this.anInt799 - this.anInt782;
			local36.anInt5003 = this.lb - this.anInt805;
			local36.anInt5002 = this.anInt800 - this.anInt782;
		}
		@Pc(78) int local78 = this.anInt782 * this.anInt790 + this.anInt805;
		for (@Pc(81) int local81 = this.anInt782; local81 < this.anInt800; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt778; local84++) {
				this.aClass140Array1[local84].aClass174_2.anIntArray322[local81 - this.anInt782] = local78;
			}
			local78 += this.anInt790;
		}
	}

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "()V")
	@Override
	public void method5788() {
	}

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "()Z")
	@Override
	public boolean method5760() {
		return true;
	}

	@OriginalMember(owner = "client!cd", name = "sa", descriptor = "(IIII)[I")
	@Override
	public int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt790 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray40[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!cd", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt790) {
			arg2 = this.anInt790;
		}
		if (arg3 > this.anInt803) {
			arg3 = this.anInt803;
		}
		this.anInt805 = arg0;
		this.lb = arg2;
		this.anInt782 = arg1;
		this.anInt800 = arg3;
		this.method791();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class140 local3 = this.method794(Thread.currentThread());
		@Pc(6) Class174 local6 = local3.aClass174_2;
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
		@Pc(93) int local93 = arg0 - local6.method3919();
		@Pc(98) int local98 = arg1 - local6.method3928();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt5000 = 0;
		local6.aBoolean565 = local102 < 0 || local102 > local6.anInt5003 || local106 < 0 || local106 > local6.anInt5003 || local112 < 0 || local112 > local6.anInt5003;
		local6.method3927(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean565 = local102 < 0 || local102 > local6.anInt5003 || local106 < 0 || local106 > local6.anInt5003 || local118 < 0 || local118 > local6.anInt5003;
		local6.method3927(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!cd", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt805 = 0;
		this.anInt782 = 0;
		this.lb = this.anInt790;
		this.anInt800 = this.anInt803;
		this.method791();
	}

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "()Z")
	@Override
	public boolean method5758() {
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt779 = arg0;
		this.anInt792 = arg1;
		this.anInt777 = arg2;
	}

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "()V")
	@Override
	public void method5789() {
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()Z")
	@Override
	public boolean method5728() {
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5735(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub30 local8 = (Class1_Sub30) this.aClass199_30.method4387((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method5915();
		local8 = Static322.method4323(arg0);
		this.aClass199_30.method4383((long) arg0.hashCode(), local8);
		if (this.aCanvas2 != arg0 || this.aClass6_11 != null) {
			return;
		}
		this.aClass1_Sub30_1 = local8;
		this.anIntArray40 = local8.anIntArray338;
		this.anInt790 = local8.anInt5159;
		this.anInt803 = local8.anInt5157;
		this.method789();
	}

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "(I)V")
	@Override
	public void t(@OriginalArg(0) int arg0) {
		this.P(0, 0, this.anInt790, this.anInt803, arg0, 0);
	}

	@OriginalMember(owner = "client!cd", name = "HA", descriptor = "(IIII)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt805 < arg0) {
			this.anInt805 = arg0;
		}
		if (this.anInt782 < arg1) {
			this.anInt782 = arg1;
		}
		if (this.lb > arg2) {
			this.lb = arg2;
		}
		if (this.anInt800 > arg3) {
			this.anInt800 = arg3;
		}
		this.method791();
	}

	@OriginalMember(owner = "client!cd", name = "ma", descriptor = "(IIIII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt782 || arg1 >= this.anInt800) {
			return;
		}
		if (arg0 < this.anInt805) {
			arg2 -= this.anInt805 - arg0;
			arg0 = this.anInt805;
		}
		if (arg0 + arg2 > this.lb) {
			arg2 = this.lb - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt790;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray40[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray40[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray40[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray40[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray40[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "(I)Z")
	public boolean method792(@OriginalArg(0) int arg0) {
		return super.anInterface6_8.method3934(arg0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class104 method5761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class104_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ob;Lclient!ob;FLclient!ob;)Lclient!ob;")
	@Override
	public Class3 method5763(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!cd", name = "ZA", descriptor = "(IIIII)V")
	@Override
	protected void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt782) {
			local8 = this.anInt782;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt800) {
			local21 = this.anInt800;
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
				if (local91 < this.anInt805) {
					local91 = this.anInt805;
				}
				local102 = arg0 + local36;
				if (local102 > this.lb) {
					local102 = this.lb;
				}
				local116 = local91 + local30 * this.anInt790;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray40[local116++] = arg3;
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
				if (local91 < this.anInt805) {
					local91 = this.anInt805;
				}
				local102 = arg0 + local36;
				if (local102 > this.lb - 1) {
					local102 = this.lb - 1;
				}
				local116 = local91 + local30 * this.anInt790;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray40[local116++] = arg3;
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
				if (local102 < this.anInt805) {
					local102 = this.anInt805;
				}
				local116 = arg0 + local36;
				if (local116 > this.lb) {
					local116 = this.lb;
				}
				local118 = local102 + local30 * this.anInt790;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray40[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray40[local118++] = local277 + local340;
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
				if (local102 < this.anInt805) {
					local102 = this.anInt805;
				}
				local116 = arg0 + local36;
				if (local116 > this.lb - 1) {
					local116 = this.lb - 1;
				}
				local118 = local102 + local30 * this.anInt790;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray40[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray40[local118++] = local277 + local340;
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
				if (local91 < this.anInt805) {
					local91 = this.anInt805;
				}
				local102 = arg0 + local36;
				if (local102 > this.lb) {
					local102 = this.lb;
				}
				local116 = local91 + local30 * this.anInt790;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray40[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray40[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt805) {
					local91 = this.anInt805;
				}
				local102 = arg0 + local36;
				if (local102 > this.lb - 1) {
					local102 = this.lb - 1;
				}
				local116 = local91 + local30 * this.anInt790;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray40[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray40[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cd", name = "da", descriptor = "(FF)V")
	@Override
	public void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat10 = arg0;
		this.aFloat11 = arg1;
		this.method786();
	}

	@OriginalMember(owner = "client!cd", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt789 = arg0;
		this.anInt799 = arg1;
		this.anInt806 = arg2;
		this.anInt786 = arg3;
		this.method791();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class157 method5744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class157_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIF)Lclient!bn;")
	@Override
	public Class1_Sub7 method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "()Z")
	@Override
	public boolean method5796() {
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "()Z")
	@Override
	public boolean method5774() {
		return true;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ob;)V")
	@Override
	public void method5746(@OriginalArg(0) Class3 arg0) {
	}

	@OriginalMember(owner = "client!cd", name = "T", descriptor = "()F")
	@Override
	public float T() {
		return this.aFloat10;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!gf;[Lclient!ev;Z)Lclient!la;")
	@Override
	public Class76 method5754(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class72[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt1855;
			local7[local11] = arg1[local11].anInt1851;
			if (arg1[local11].aByteArray18 != null) {
			}
		}
		return new Class76_Sub1(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "()Z")
	@Override
	public boolean method5755() {
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIIIII)Lclient!ob;")
	@Override
	public Class3 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!cd", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		@Pc(2) int local2 = this.anInt793;
		this.anInt793 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cd", name = "VA", descriptor = "(IIIIII)Z")
	@Override
	public boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass32_Sub1_1.anInt1077 * arg0 + this.aClass32_Sub1_1.anInt1083 * arg1 + this.aClass32_Sub1_1.anInt1082 * arg2 >> 15) + this.aClass32_Sub1_1.anInt1075;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass32_Sub1_1.anInt1077 * arg3 + this.aClass32_Sub1_1.anInt1083 * arg4 + this.aClass32_Sub1_1.anInt1082 * arg5 >> 15) + this.aClass32_Sub1_1.anInt1075;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt791 && local52 < this.anInt791 || !(local23 <= this.anInt780 || local52 <= this.anInt780)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt806 * ((this.aClass32_Sub1_1.anInt1086 * arg0 + this.aClass32_Sub1_1.anInt1079 * arg1 + this.aClass32_Sub1_1.anInt1085 * arg2 >> 15) + this.aClass32_Sub1_1.anInt1084) / local23;
		@Pc(133) int local133 = this.anInt806 * ((this.aClass32_Sub1_1.anInt1086 * arg3 + this.aClass32_Sub1_1.anInt1079 * arg4 + this.aClass32_Sub1_1.anInt1085 * arg5 >> 15) + this.aClass32_Sub1_1.anInt1084) / local52;
		if (local104 < this.anInt787 && local133 < this.anInt787 || local104 > this.anInt804 && local133 > this.anInt804) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt786 * ((this.aClass32_Sub1_1.anInt1080 * arg0 + this.aClass32_Sub1_1.anInt1076 * arg1 + this.aClass32_Sub1_1.anInt1081 * arg2 >> 15) + this.aClass32_Sub1_1.anInt1078) / local23;
			@Pc(209) int local209 = this.anInt786 * ((this.aClass32_Sub1_1.anInt1080 * arg3 + this.aClass32_Sub1_1.anInt1076 * arg4 + this.aClass32_Sub1_1.anInt1081 * arg5 >> 15) + this.aClass32_Sub1_1.anInt1078) / local52;
			return (local180 >= this.anInt784 || local209 >= this.anInt784) && (local180 <= this.anInt785 || local209 <= this.anInt785);
		}
	}

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "()V")
	@Override
	public void method5764() {
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([Lclient!e;Lclient!eu;Lclient!c;[Lclient!ut;I)V")
	@Override
	public void method5797(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Class4_Sub8[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class57_Sub1[] local3 = new Class57_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class57_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class57_Sub1 local26 = Static74.method1225(this, local3);
		local26.method1228(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "()Z")
	@Override
	public boolean method5770() {
		return true;
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
	@Override
	public void method5790(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cd", name = "E", descriptor = "()Z")
	public boolean method793() {
		return this.aBoolean87;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V")
	@Override
	public void method5745(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cd", name = "JA", descriptor = "(F)V")
	@Override
	public void JA(@OriginalArg(0) float arg0) {
		this.anInt797 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ev;Z)Lclient!o;")
	@Override
	public Class6 method5756(@OriginalArg(0) Class72 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray129;
		@Pc(5) byte[] local5 = arg0.aByteArray17;
		@Pc(8) int local8 = arg0.anInt1855;
		@Pc(11) int local11 = arg0.anInt1851;
		@Pc(76) Class6_Sub1 local76;
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
			local76 = new Class6_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray18;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class6_Sub1_Sub1(this, local20, local8, local11);
				local76 = new Class6_Sub1_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class6_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.ha(arg0.anInt1854, arg0.anInt1856, arg0.anInt1852, arg0.anInt1853);
		return local76;
	}

	@OriginalMember(owner = "client!cd", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		@Pc(2) int local2 = this.anInt783;
		this.anInt783 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5751(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas2 == null || this.aClass1_Sub30_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas2.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt790 && local21.y <= this.anInt803 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass1_Sub30_1.method4040(local14, local21.height, local21.x, local21.y, local21.width);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5750() {
		@Pc(3) Class140 local3 = this.method794(Thread.currentThread());
		@Pc(6) Class174 local6 = local3.aClass174_2;
		local6.aBoolean568 = false;
		local6.aBoolean568 = false;
		local6.anInt5000 = 0;
		local6.aBoolean565 = true;
		local6.method3924(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean568 = true;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "()Lclient!c;")
	@Override
	public Class32 method5736() {
		return new Class32_Sub1();
	}

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "()I")
	@Override
	public int method5800() {
		return 0;
	}

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "()V")
	@Override
	protected void method5786() {
		if (this.aBoolean86) {
			Static109.method3817(true, false);
			this.aBoolean86 = false;
		}
		this.aClass1_Sub30_1 = null;
		this.aCanvas2 = null;
		this.aClass199_30 = null;
		this.aBoolean87 = true;
	}

	@OriginalMember(owner = "client!cd", name = "aa", descriptor = "()F")
	@Override
	public float aa() {
		return this.aFloat11;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5791(@OriginalArg(0) Class1_Sub12 arg0) {
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!lb;")
	public Class140 method794(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt778; local1++) {
			if (this.aClass140Array1[local1].aRunnable2 == arg0) {
				return this.aClass140Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5785(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas2 == arg0) {
			this.method5793(null);
		}
		@Pc(15) Class1_Sub30 local15 = (Class1_Sub30) this.aClass199_30.method4387((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5915();
		}
	}

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "()I")
	@Override
	public int r() {
		return this.anInt780;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5738(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub30 local8 = (Class1_Sub30) this.aClass199_30.method4387((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static322.method4323(arg0);
			this.aClass199_30.method4383((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "()V")
	@Override
	public void method5780() {
	}

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)Lclient!n;")
	@Override
	public Class1_Sub12 method5795(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "()V")
	@Override
	public void method5765() {
		this.aClass102_9.method2271();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5778(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!cd", name = "ra", descriptor = "(ILclient!ta;II)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class104_Sub1 local2 = (Class104_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray180;
		@Pc(8) int[] local8 = local2.anIntArray179;
		@Pc(20) int local20;
		if (this.anInt800 < arg3 + local5.length) {
			local20 = this.anInt800 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt782 > arg3) {
			local33 = this.anInt782 - arg3;
			arg3 = this.anInt782;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt790;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt805 > local58) {
				local62 -= this.anInt805 - local58;
				local58 = this.anInt805;
			}
			if (this.lb < local58 + local62) {
				local62 = this.lb - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray40[local58++] = arg0;
			}
			local49 += this.anInt790;
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
	@Override
	public void method5749(@OriginalArg(0) int arg0) {
		this.aClass140Array1[arg0].method3254(null);
	}

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.anInt792 = this.anInt795;
		this.aBoolean90 = false;
	}

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "(I)I")
	public int method795(@OriginalArg(0) int arg0) {
		return super.anInterface6_8.method3937(arg0).aShort37 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class6 method5798(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class6_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class6_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class6_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class6_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!e;Lclient!eu;Lclient!c;Lclient!ut;I)V")
	@Override
	public void method5762(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Class4_Sub8 arg3) {
		((Class57_Sub1) arg0).method1228(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "()Z")
	@Override
	public boolean method5739() {
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "()Lclient!c;")
	@Override
	public Class32 method5747() {
		@Pc(3) Class140 local3 = this.method794(Thread.currentThread());
		return local3.aClass32_Sub1_3;
	}

	@OriginalMember(owner = "client!cd", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return 0;
	}

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "()Z")
	@Override
	public boolean method5772() {
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!ut;I)V")
	@Override
	public void method5771(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class4_Sub8[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class57_Sub1[] local3 = new Class57_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class57_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class57_Sub1 local26 = Static74.method1225(this, local3);
		local26.method1228(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ls;III)V")
	public void method796(@OriginalArg(0) Class4_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt5816;
		@Pc(6) int local6 = arg3 >> 1;
		if (local2 == -1) {
			this.ZA(arg1, arg2, local6, arg0.anInt5822, 1);
			return;
		}
		if (this.anInt807 != local2) {
			@Pc(30) Class6 local30 = (Class6) this.aClass102_10.method2258((long) local2);
			if (local30 == null) {
				@Pc(36) int[] local36 = this.method787(local2);
				if (local36 == null) {
					return;
				}
				@Pc(46) int local46 = this.method790(local2) ? 64 : 128;
				local30 = this.method5798(local36, local46, local46, local46);
				this.aClass102_10.method2272((long) local2, local30);
			}
			this.anInt807 = local2;
			this.aClass6_12 = local30;
		}
		if (this.aClass6_12.RA() == 64) {
			arg3 <<= 0x1;
			local6 <<= 0x1;
		}
		this.aClass6_12.ya(arg1 - local6, arg2 - local6, arg3, arg3, 0, arg0.anInt5822, 1);
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class6 method5777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt790 + arg0;
		@Pc(16) int local16 = this.anInt790 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray40[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class6_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class6_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	@Override
	public void method5737(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!eu;)V")
	@Override
	public void method5741(@OriginalArg(0) Class71 arg0) {
		@Pc(3) Class4_Sub1 local3 = arg0.aClass95_1.aClass4_Sub1_3;
		for (@Pc(6) Class4_Sub1 local6 = local3.aClass4_Sub1_9; local6 != local3; local6 = local6.aClass4_Sub1_9) {
			@Pc(10) Class4_Sub1_Sub2 local10 = (Class4_Sub1_Sub2) local6;
			@Pc(15) int local15 = local10.anInt5820 >> 12;
			@Pc(20) int local20 = local10.anInt5823 >> 12;
			@Pc(25) int local25 = local10.anInt5814 >> 12;
			@Pc(49) int local49 = this.aClass32_Sub1_1.anInt1075 + (this.aClass32_Sub1_1.anInt1077 * local15 + this.aClass32_Sub1_1.anInt1083 * local20 + this.aClass32_Sub1_1.anInt1082 * local25 >> 15);
			if (local49 >= this.anInt791 && local49 <= this.anInt801) {
				@Pc(90) int local90 = this.anInt789 + this.anInt806 * (this.aClass32_Sub1_1.anInt1084 + (this.aClass32_Sub1_1.anInt1086 * local15 + this.aClass32_Sub1_1.anInt1079 * local20 + this.aClass32_Sub1_1.anInt1085 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt799 + this.anInt786 * (this.aClass32_Sub1_1.anInt1078 + (this.aClass32_Sub1_1.anInt1080 * local15 + this.aClass32_Sub1_1.anInt1076 * local20 + this.aClass32_Sub1_1.anInt1081 * local25 >> 15)) / local49;
				if (local90 >= this.anInt805 && local90 <= this.lb && local122 >= this.anInt782 && local122 <= this.anInt800) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method796(local10, local90, local122, (local10.anInt5819 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5793(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas2 = null;
			this.aClass1_Sub30_1 = null;
			if (this.aClass6_11 == null) {
				this.anIntArray40 = null;
				this.anInt790 = this.anInt803 = 1;
				this.method789();
			}
			return;
		}
		@Pc(10) Class1_Sub30 local10 = (Class1_Sub30) this.aClass199_30.method4387((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas2 = arg0;
		this.aClass1_Sub30_1 = local10;
		if (this.aClass6_11 != null) {
			return;
		}
		this.anIntArray40 = local10.anIntArray338;
		this.anInt790 = local10.anInt5159;
		this.anInt803 = local10.anInt5157;
		this.method789();
		return;
	}
}
