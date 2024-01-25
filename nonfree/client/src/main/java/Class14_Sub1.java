import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public abstract class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!lea", name = "r", descriptor = "Ljava/awt/Canvas;")
	protected Canvas aCanvas11;

	@OriginalMember(owner = "client!lea", name = "t", descriptor = "Lclient!mv;")
	protected Class6_Sub23 aClass6_Sub23_3;

	@OriginalMember(owner = "client!lea", name = "w", descriptor = "I")
	private int anInt5814;

	@OriginalMember(owner = "client!lea", name = "x", descriptor = "I")
	public int anInt5815;

	@OriginalMember(owner = "client!lea", name = "z", descriptor = "I")
	public int anInt5816;

	@OriginalMember(owner = "client!lea", name = "A", descriptor = "I")
	public int anInt5817;

	@OriginalMember(owner = "client!lea", name = "C", descriptor = "F")
	private float aFloat137;

	@OriginalMember(owner = "client!lea", name = "G", descriptor = "I")
	public int anInt5821;

	@OriginalMember(owner = "client!lea", name = "I", descriptor = "I")
	public int anInt5823;

	@OriginalMember(owner = "client!lea", name = "J", descriptor = "I")
	public int anInt5824;

	@OriginalMember(owner = "client!lea", name = "K", descriptor = "Lclient!xa;")
	protected Class58 aClass58_30;

	@OriginalMember(owner = "client!lea", name = "N", descriptor = "I")
	public int anInt5827;

	@OriginalMember(owner = "client!lea", name = "T", descriptor = "F")
	private float aFloat138;

	@OriginalMember(owner = "client!lea", name = "U", descriptor = "I")
	public int anInt5832;

	@OriginalMember(owner = "client!lea", name = "X", descriptor = "I")
	public int anInt5834;

	@OriginalMember(owner = "client!lea", name = "ab", descriptor = "I")
	public int anInt5837;

	@OriginalMember(owner = "client!lea", name = "bb", descriptor = "[Lclient!cm;")
	protected Class44[] aClass44Array3;

	@OriginalMember(owner = "client!lea", name = "gb", descriptor = "I")
	public int anInt5841;

	@OriginalMember(owner = "client!lea", name = "ib", descriptor = "I")
	protected int anInt5843;

	@OriginalMember(owner = "client!lea", name = "kb", descriptor = "Z")
	public boolean aBoolean411;

	@OriginalMember(owner = "client!lea", name = "lb", descriptor = "[I")
	public int[] lb;

	@OriginalMember(owner = "client!lea", name = "ob", descriptor = "Lclient!xa;")
	protected Class58 aClass58_31;

	@OriginalMember(owner = "client!lea", name = "s", descriptor = "Z")
	private boolean aBoolean407;

	@OriginalMember(owner = "client!lea", name = "v", descriptor = "Z")
	private boolean aBoolean408;

	@OriginalMember(owner = "client!lea", name = "u", descriptor = "Lclient!hd;")
	protected Class128 aClass128_28;

	@OriginalMember(owner = "client!lea", name = "E", descriptor = "Z")
	public boolean aBoolean409;

	@OriginalMember(owner = "client!lea", name = "B", descriptor = "I")
	public int anInt5818;

	@OriginalMember(owner = "client!lea", name = "F", descriptor = "I")
	private int anInt5820;

	@OriginalMember(owner = "client!lea", name = "V", descriptor = "I")
	public int anInt5833;

	@OriginalMember(owner = "client!lea", name = "S", descriptor = "I")
	public int anInt5831;

	@OriginalMember(owner = "client!lea", name = "Z", descriptor = "I")
	public int anInt5836;

	@OriginalMember(owner = "client!lea", name = "H", descriptor = "I")
	private int anInt5822;

	@OriginalMember(owner = "client!lea", name = "P", descriptor = "I")
	public int anInt5828;

	@OriginalMember(owner = "client!lea", name = "Y", descriptor = "I")
	public int anInt5835;

	@OriginalMember(owner = "client!lea", name = "Q", descriptor = "I")
	private int anInt5829;

	@OriginalMember(owner = "client!lea", name = "db", descriptor = "I")
	public int anInt5839;

	@OriginalMember(owner = "client!lea", name = "L", descriptor = "I")
	public int anInt5825;

	@OriginalMember(owner = "client!lea", name = "cb", descriptor = "I")
	public int anInt5838;

	@OriginalMember(owner = "client!lea", name = "eb", descriptor = "Z")
	private boolean aBoolean410;

	@OriginalMember(owner = "client!lea", name = "R", descriptor = "I")
	private int anInt5830;

	@OriginalMember(owner = "client!lea", name = "fb", descriptor = "I")
	public int anInt5840;

	@OriginalMember(owner = "client!lea", name = "jb", descriptor = "I")
	public int anInt5844;

	@OriginalMember(owner = "client!lea", name = "D", descriptor = "I")
	public int anInt5819;

	@OriginalMember(owner = "client!lea", name = "hb", descriptor = "I")
	public int anInt5842;

	@OriginalMember(owner = "client!lea", name = "M", descriptor = "I")
	public int anInt5826;

	@OriginalMember(owner = "client!lea", name = "mb", descriptor = "I")
	public int anInt5845;

	@OriginalMember(owner = "client!lea", name = "W", descriptor = "Lclient!hm;")
	protected final Class136 aClass136_69;

	@OriginalMember(owner = "client!lea", name = "nb", descriptor = "I")
	protected int anInt5846;

	@OriginalMember(owner = "client!lea", name = "y", descriptor = "Lclient!hm;")
	private final Class136 aClass136_68;

	@OriginalMember(owner = "client!lea", name = "O", descriptor = "Lclient!cr;")
	public Class54_Sub1 aClass54_Sub1_7;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lclient!e;)V")
	private Class14_Sub1(@OriginalArg(0) Interface4 arg0) {
		super(arg0);
		this.aBoolean407 = false;
		this.aBoolean408 = false;
		this.aClass128_28 = new Class128(4);
		this.aBoolean409 = false;
		this.anInt5818 = 512;
		this.anInt5820 = 0;
		this.anInt5833 = 78642;
		this.anInt5831 = 0;
		this.anInt5836 = 3500;
		this.anInt5822 = 0;
		this.anInt5828 = 0;
		this.anInt5835 = 512;
		this.anInt5829 = 0;
		this.anInt5839 = 45823;
		this.anInt5825 = 0;
		this.anInt5838 = 0;
		this.aBoolean410 = false;
		this.anInt5830 = 3500;
		this.anInt5840 = 75518;
		this.anInt5844 = 0;
		this.anInt5819 = 0;
		this.anInt5842 = 0;
		this.anInt5826 = 50;
		this.anInt5845 = this.anInt5830 - 255;
		this.aClass136_69 = new Class136(16);
		this.anInt5846 = -1;
		this.aClass136_68 = new Class136(256);
		this.aClass54_Sub1_7 = new Class54_Sub1();
		this.method6905(1);
		this.method6873(0);
		Static210.method3727(false, true);
		this.aBoolean407 = true;
	}

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class14_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1) {
		this(arg1);
		this.method6844(arg0);
		this.method6900(arg0);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!xa;Z)V")
	protected abstract void method6821(@OriginalArg(0) Class58 arg0);

	@OriginalMember(owner = "client!lea", name = "t", descriptor = "()Lclient!taa;")
	@Override
	public final Class312 method6871() {
		return new Class312(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public final Class58 method6863(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class58_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class58_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class58_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class58_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!lea", name = "s", descriptor = "()V")
	protected final void method5047() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5834; local1++) {
			this.aClass44Array3[local1].method6771();
		}
		this.F();
	}

	@OriginalMember(owner = "client!lea", name = "AA", descriptor = "(IIII)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5822 = this.anInt5842;
		this.anInt5819 = arg0;
		this.anInt5842 = arg1;
		this.anInt5828 = arg2;
		this.aBoolean409 = true;
	}

	@OriginalMember(owner = "client!lea", name = "j", descriptor = "()Z")
	@Override
	public final boolean method6842() {
		return false;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIZ)Lclient!xa;")
	@Override
	public final Class58 method6862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class58_Sub1_Sub2(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "(I)V")
	@Override
	public void method6873(@OriginalArg(0) int arg0) {
		this.aClass44Array3[arg0].method6769(Thread.currentThread());
	}

	@OriginalMember(owner = "client!lea", name = "y", descriptor = "()Z")
	@Override
	public final boolean method6886() {
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "E", descriptor = "()Z")
	@Override
	public final boolean method6901() {
		return false;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!cm;")
	public abstract Class44 method5048(@OriginalArg(0) Runnable arg0);

	@OriginalMember(owner = "client!lea", name = "x", descriptor = "()Lclient!q;")
	@Override
	public final Class54 method6882() {
		return new Class54_Sub1();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(II)I")
	@Override
	public final int method6879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method6868();

	@OriginalMember(owner = "client!lea", name = "ca", descriptor = "(IIII)V")
	@Override
	public final void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt5817) {
			arg2 = this.anInt5817;
		}
		if (arg3 > this.anInt5843) {
			arg3 = this.anInt5843;
		}
		this.anInt5844 = arg0;
		this.anInt5825 = arg2;
		this.anInt5831 = arg1;
		this.anInt5838 = arg3;
		this.method5052();
	}

	@OriginalMember(owner = "client!lea", name = "v", descriptor = "()I")
	@Override
	public final int v() {
		return 0;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public final void method6877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class86 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class86_Sub1 local2 = (Class86_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray567;
		@Pc(8) int[] local8 = local2.anIntArray566;
		@Pc(17) int local17 = this.anInt5831 > arg7 ? this.anInt5831 : arg7;
		@Pc(32) int local32 = this.anInt5838 < arg7 + local5.length ? this.anInt5838 : arg7 + local5.length;
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
					if (local129 >= this.anInt5844 && local129 < this.anInt5825 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.lb[local129 + arg1 * this.anInt5817] = arg4;
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
					if (local133 >= this.anInt5844 && local133 < this.anInt5825 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt5817;
						local248 = this.lb[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.lb[local133 + arg1 * this.anInt5817] = local201 + local584;
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
		if (arg0 < this.anInt5844) {
			arg1 += local83 * (this.anInt5844 - arg0);
			arg0 = this.anInt5844;
		}
		if (arg2 >= this.anInt5825) {
			arg2 = this.anInt5825 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.lb[arg0 + local129 * this.anInt5817] = arg4;
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
					local243 = arg0 + local133 * this.anInt5817;
					local248 = this.lb[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.lb[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!iba;Z)Lclient!xa;")
	@Override
	public final Class58 method6889(@OriginalArg(0) Class140 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray259;
		@Pc(5) byte[] local5 = arg0.aByteArray39;
		@Pc(8) int local8 = arg0.anInt4127;
		@Pc(11) int local11 = arg0.anInt4129;
		@Pc(76) Class58_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray38 == null) {
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
			local76 = new Class58_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray38;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class58_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class58_Sub1_Sub2(this, local20, local8, local11);
			}
		}
		local76.EA(arg0.anInt4125, arg0.anInt4126, arg0.anInt4124, arg0.anInt4128);
		return local76;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "()Z")
	@Override
	public final boolean method6830() {
		return false;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public final void method6891(@OriginalArg(0) Class6_Sub15 arg0) {
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!ub;[Lclient!iba;Z)Lclient!ta;")
	@Override
	public final Class92 method6854(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class140[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt4127;
			local7[local11] = arg1[local11].anInt4129;
			if (arg1[local11].aByteArray38 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class92_Sub2(this, arg0, arg1, local3, local7);
		} else {
			return new Class92_Sub1(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!lea", name = "D", descriptor = "()Z")
	@Override
	public final boolean method6896() {
		return false;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(IIIIII)Lclient!ip;")
	@Override
	public final Class26 method6883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!lea", name = "ka", descriptor = "(FF)V")
	@Override
	public final void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat138 = arg0;
		this.aFloat137 = arg1;
		this.method5058();
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(I)[I")
	protected final int[] method5049(@OriginalArg(0) int arg0) {
		@Pc(2) Class136 local2 = this.aClass136_68;
		@Pc(12) Class6_Sub32 local12;
		synchronized (this.aClass136_68) {
			local12 = (Class6_Sub32) this.aClass136_68.method3473((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_15.method4233(arg0)) {
					return null;
				}
				@Pc(32) Class313 local32 = super.anInterface4_15.method4234(arg0);
				@Pc(42) int local42 = local32.aBoolean595 || this.aBoolean410 ? 64 : 128;
				local12 = new Class6_Sub32(arg0, local42, super.anInterface4_15.method4231(local42, local42, arg0, 0.7F), local32.aBoolean594);
				this.aClass136_68.method3482((long) arg0, local12);
			}
		}
		local12.aBoolean425 = true;
		return local12.method5138();
	}

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "(I)Lclient!i;")
	@Override
	public final Class6_Sub15 method6898(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!lea", name = "m", descriptor = "()Z")
	@Override
	public final boolean method6846() {
		return false;
	}

	@OriginalMember(owner = "client!lea", name = "l", descriptor = "()V")
	@Override
	public final void method6843() {
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6900(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "(I)I")
	public final int method5050(@OriginalArg(0) int arg0) {
		return super.anInterface4_15.method4234(arg0).aShort105 & 0xFFFF;
	}

	@OriginalMember(owner = "client!lea", name = "u", descriptor = "()Z")
	public abstract boolean method6876();

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method6864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!lea", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public final boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass54_Sub1_7.anInt1508 * arg0 + this.aClass54_Sub1_7.anInt1504 * arg1 + this.aClass54_Sub1_7.anInt1507 * arg2 >> 14) + this.aClass54_Sub1_7.anInt1509;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass54_Sub1_7.anInt1508 * arg3 + this.aClass54_Sub1_7.anInt1504 * arg4 + this.aClass54_Sub1_7.anInt1507 * arg5 >> 14) + this.aClass54_Sub1_7.anInt1509;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt5826 && local52 < this.anInt5826 || !(local23 <= this.anInt5830 || local52 <= this.anInt5830)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt5818 * ((this.aClass54_Sub1_7.anInt1500 * arg0 + this.aClass54_Sub1_7.anInt1505 * arg1 + this.aClass54_Sub1_7.anInt1506 * arg2 >> 14) + this.aClass54_Sub1_7.anInt1510) / local23;
		@Pc(133) int local133 = this.anInt5818 * ((this.aClass54_Sub1_7.anInt1500 * arg3 + this.aClass54_Sub1_7.anInt1505 * arg4 + this.aClass54_Sub1_7.anInt1506 * arg5 >> 14) + this.aClass54_Sub1_7.anInt1510) / local52;
		if (local104 < this.anInt5823 && local133 < this.anInt5823 || local104 > this.anInt5824 && local133 > this.anInt5824) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt5835 * ((this.aClass54_Sub1_7.anInt1503 * arg0 + this.aClass54_Sub1_7.anInt1511 * arg1 + this.aClass54_Sub1_7.anInt1502 * arg2 >> 14) + this.aClass54_Sub1_7.anInt1501) / local23;
			@Pc(209) int local209 = this.anInt5835 * ((this.aClass54_Sub1_7.anInt1503 * arg3 + this.aClass54_Sub1_7.anInt1511 * arg4 + this.aClass54_Sub1_7.anInt1502 * arg5 >> 14) + this.aClass54_Sub1_7.anInt1501) / local52;
			return (local180 >= this.anInt5816 || local209 >= this.anInt5816) && (local180 <= this.anInt5821 || local209 <= this.anInt5821);
		}
	}

	@OriginalMember(owner = "client!lea", name = "aa", descriptor = "()I")
	@Override
	public final int aa() {
		@Pc(2) int local2 = this.anInt5820;
		this.anInt5820 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6902(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas11 == arg0) {
			this.method6900(null);
		}
		@Pc(15) Class6_Sub23 local15 = (Class6_Sub23) this.aClass128_28.method3263((long) arg0.hashCode());
		if (local15 != null) {
			local15.method7804();
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6861(@OriginalArg(0) boolean arg0) {
		this.aBoolean410 = arg0;
		this.aClass136_68.method3470();
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(Z)V")
	@Override
	public final void method6878(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lea", name = "w", descriptor = "()V")
	@Override
	public final void method6881() {
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public final Class86 method6840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class86_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "([Lclient!ba;Lclient!ig;Lclient!q;[Lclient!po;I)V")
	public abstract void method6872(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class98_Sub5[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!lea", name = "m", descriptor = "(IIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5827 = arg0;
		this.anInt5837 = arg1;
		this.anInt5818 = arg2;
		this.anInt5835 = arg3;
		this.method5052();
	}

	@OriginalMember(owner = "client!lea", name = "i", descriptor = "(I)Z")
	public final boolean method5051(@OriginalArg(0) int arg0) {
		return super.anInterface4_15.method4234(arg0).aBoolean590;
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "()Z")
	@Override
	public final boolean method6832() {
		return false;
	}

	@OriginalMember(owner = "client!lea", name = "A", descriptor = "()V")
	@Override
	public final void method6890() {
	}

	@OriginalMember(owner = "client!lea", name = "C", descriptor = "()Z")
	@Override
	public final boolean method6895() {
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "o", descriptor = "()V")
	@Override
	public final void method6848() throws Exception_Sub1 {
		if (this.aCanvas11 == null || this.aClass6_Sub23_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas11.getGraphics();
			this.aClass6_Sub23_3.method6173(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas11.repaint();
		}
	}

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "()V")
	@Override
	public final void method6834() {
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(Z)V")
	@Override
	public void method6880(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(FFF)V")
	@Override
	public final void method6831(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!lea", name = "G", descriptor = "()V")
	protected abstract void method5052();

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I[Lclient!bj;)V")
	@Override
	public final void method6869(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub7[] arg1) {
	}

	@OriginalMember(owner = "client!lea", name = "na", descriptor = "(III[I)V")
	@Override
	public final void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass54_Sub1_7.anInt1509 + (this.aClass54_Sub1_7.anInt1508 * arg0 + this.aClass54_Sub1_7.anInt1504 * arg1 + this.aClass54_Sub1_7.anInt1507 * arg2 >> 14);
		if (local23 < this.anInt5826 || local23 > this.anInt5830) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt5818 * (this.aClass54_Sub1_7.anInt1510 + (this.aClass54_Sub1_7.anInt1500 * arg0 + this.aClass54_Sub1_7.anInt1505 * arg1 + this.aClass54_Sub1_7.anInt1506 * arg2 >> 14)) / local23;
		@Pc(102) int local102 = this.anInt5835 * (this.aClass54_Sub1_7.anInt1501 + (this.aClass54_Sub1_7.anInt1503 * arg0 + this.aClass54_Sub1_7.anInt1511 * arg1 + this.aClass54_Sub1_7.anInt1502 * arg2 >> 14)) / local23;
		if (local73 >= this.anInt5823 && local73 <= this.anInt5824 && local102 >= this.anInt5816 && local102 <= this.anInt5821) {
			arg3[0] = local73 - this.anInt5823;
			arg3[1] = local102 - this.anInt5816;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public final void method6865(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas11 == null || this.aClass6_Sub23_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas11.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt5817 && local21.y <= this.anInt5843 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass6_Sub23_3.method6171(local21.x, local21.width, local14, local21.y, local21.height);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas11.repaint();
		}
	}

	@OriginalMember(owner = "client!lea", name = "SA", descriptor = "()I")
	@Override
	public final int SA() {
		@Pc(2) int local2 = this.anInt5829;
		this.anInt5829 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!lea", name = "g", descriptor = "(I)V")
	public abstract void method6905(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method6829(@OriginalArg(0) Class54 arg0) {
		this.aClass54_Sub1_7 = (Class54_Sub1) arg0;
	}

	@OriginalMember(owner = "client!lea", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt5839 = (int) (arg1 * 65535.0F);
		this.anInt5833 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt5841 = (int) (arg3 * 65535.0F / local26);
		this.anInt5832 = (int) (arg4 * 65535.0F / local26);
		this.anInt5815 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V")
	@Override
	public final void method6822(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "()V")
	@Override
	protected final void method6839() {
		if (this.aBoolean407) {
			Static397.method5811(false, true);
			this.aBoolean407 = false;
		}
		this.aClass6_Sub23_3 = null;
		this.aCanvas11 = null;
		this.aClass128_28 = null;
		this.aBoolean408 = true;
	}

	@OriginalMember(owner = "client!lea", name = "H", descriptor = "()Z")
	public final boolean method5053() {
		return this.aBoolean408;
	}

	@OriginalMember(owner = "client!lea", name = "p", descriptor = "()Z")
	@Override
	public final boolean method6849() {
		return false;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method6844(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class6_Sub23 local8 = (Class6_Sub23) this.aClass128_28.method3263((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static176.method3226(arg0);
			this.aClass128_28.method3267(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "(I)V")
	@Override
	public final void method6897(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt5814;
		for (@Pc(9) Object local9 = this.aClass136_68.method3472(); local9 != null; local9 = this.aClass136_68.method3481()) {
			@Pc(13) Class6_Sub32 local13 = (Class6_Sub32) local9;
			if (local13.aBoolean425) {
				local13.anInt5981 += local4;
				@Pc(27) int local27 = local13.anInt5981 / 20;
				if (local27 > 0) {
					@Pc(36) Class313 local36 = super.anInterface4_15.method4234(local13.anInt5980);
					local13.method5137(local36.aByte97 * local4 * 50 / 1000, local36.aByte102 * local4 * 50 / 1000);
					local13.anInt5981 -= local27 * 20;
				}
				local13.aBoolean425 = false;
			}
		}
		this.anInt5814 = arg0;
		this.aClass136_69.method3474(5);
		this.aClass136_68.method3474(5);
	}

	@OriginalMember(owner = "client!lea", name = "D", descriptor = "(I)V")
	@Override
	public final void D(@OriginalArg(0) int arg0) {
		this.C(0, 0, this.anInt5817, this.anInt5843, arg0, 0);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!po;I)V")
	public abstract void method6885(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class98_Sub5[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	public abstract Class59 method6857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(IIIIIIIIII)V")
	public abstract void method5054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!lea", name = "IA", descriptor = "()I")
	@Override
	public final int IA() {
		return this.anInt5830;
	}

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "(IIIII)V")
	@Override
	protected final void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt5831) {
			local8 = this.anInt5831;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt5838) {
			local21 = this.anInt5838;
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
				if (local91 < this.anInt5844) {
					local91 = this.anInt5844;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5825) {
					local102 = this.anInt5825;
				}
				local116 = local91 + local30 * this.anInt5817;
				for (local118 = local91; local118 < local102; local118++) {
					this.lb[local116++] = arg3;
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
				if (local91 < this.anInt5844) {
					local91 = this.anInt5844;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5825 - 1) {
					local102 = this.anInt5825 - 1;
				}
				local116 = local91 + local30 * this.anInt5817;
				for (local118 = local91; local118 <= local102; local118++) {
					this.lb[local116++] = arg3;
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
				if (local102 < this.anInt5844) {
					local102 = this.anInt5844;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt5825) {
					local116 = this.anInt5825;
				}
				local118 = local102 + local30 * this.anInt5817;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.lb[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.lb[local118++] = local277 + local340;
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
				if (local102 < this.anInt5844) {
					local102 = this.anInt5844;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt5825 - 1) {
					local116 = this.anInt5825 - 1;
				}
				local118 = local102 + local30 * this.anInt5817;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.lb[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.lb[local118++] = local277 + local340;
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
				if (local91 < this.anInt5844) {
					local91 = this.anInt5844;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5825) {
					local102 = this.anInt5825;
				}
				local116 = local91 + local30 * this.anInt5817;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.lb[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.lb[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt5844) {
					local91 = this.anInt5844;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5825 - 1) {
					local102 = this.anInt5825 - 1;
				}
				local116 = local91 + local30 * this.anInt5817;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.lb[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.lb[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lea", name = "sa", descriptor = "(II)V")
	@Override
	public final void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5826 = arg0;
		this.anInt5830 = arg1;
		this.anInt5845 = this.anInt5830 - 255;
		this.method5058();
	}

	@OriginalMember(owner = "client!lea", name = "z", descriptor = "()Z")
	@Override
	public final boolean method6887() {
		return false;
	}

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "()V")
	@Override
	public final void k() {
		this.anInt5842 = this.anInt5822;
		this.aBoolean409 = false;
	}

	@OriginalMember(owner = "client!lea", name = "j", descriptor = "(I)Z")
	public final boolean method5055(@OriginalArg(0) int arg0) {
		return super.anInterface4_15.method4233(arg0);
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(II)I")
	@Override
	public final int method6884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIF)Lclient!bj;")
	@Override
	public final Class6_Sub7 method6827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!lea", name = "q", descriptor = "()Lclient!q;")
	@Override
	public final Class54 method6851() {
		@Pc(3) Class44 local3 = this.method5048(Thread.currentThread());
		return local3.aClass54_Sub1_8;
	}

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "(I)[I")
	public final int[] method5056(@OriginalArg(0) int arg0) {
		@Pc(2) Class136 local2 = this.aClass136_68;
		@Pc(12) Class6_Sub32 local12;
		synchronized (this.aClass136_68) {
			local12 = (Class6_Sub32) this.aClass136_68.method3473((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_15.method4233(arg0)) {
					return null;
				}
				@Pc(32) Class313 local32 = super.anInterface4_15.method4234(arg0);
				@Pc(42) int local42 = local32.aBoolean595 || this.aBoolean410 ? 64 : 128;
				local12 = new Class6_Sub32(arg0, local42, super.anInterface4_15.method4230(0.7F, arg0, local42, true, local42), local32.aBoolean594);
				this.aClass136_68.method3482((long) arg0, local12);
			}
		}
		local12.aBoolean425 = true;
		return local12.method5138();
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt5844) {
					arg1 += local104 * (this.anInt5844 - arg0);
					arg0 = this.anInt5844;
				}
				if (arg2 >= this.anInt5825) {
					arg2 = this.anInt5825 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5831 && local150 < this.anInt5838) {
							this.lb[arg0 + local150 * this.anInt5817] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt5831 && local213 < this.anInt5838) {
							local228 = arg0 + local213 * this.anInt5817;
							local233 = this.lb[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.lb[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5831 && local150 < this.anInt5838) {
							local213 = arg0 + local150 * this.anInt5817;
							local228 = this.lb[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.lb[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt5831) {
					arg0 += local104 * (this.anInt5831 - arg1);
					arg1 = this.anInt5831;
				}
				if (arg3 >= this.anInt5838) {
					arg3 = this.anInt5838 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5844 && local150 < this.anInt5825) {
							this.lb[local150 + arg1 * this.anInt5817] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt5844 && local213 < this.anInt5825) {
							local228 = local213 + arg1 * this.anInt5817;
							local233 = this.lb[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.lb[local213 + arg1 * this.anInt5817] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5844 && local150 < this.anInt5825) {
							local213 = local150 + arg1 * this.anInt5817;
							local228 = this.lb[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.lb[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!lea", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public final void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt5817;
		@Pc(35) int local35 = this.anInt5817 - arg2;
		if (arg1 + arg3 > this.anInt5838) {
			arg3 -= arg1 + arg3 - this.anInt5838;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt5831) {
			local59 = this.anInt5831 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt5817;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt5825) {
			local59 = arg0 + arg2 - this.anInt5825;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt5844) {
			local59 = this.anInt5844 - arg0;
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
						this.lb[local30++] = arg4;
					} else {
						this.lb[local30++] = arg5;
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
					local245 = this.lb[local30];
					this.lb[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.lb[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.lb[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!ig;)V")
	@Override
	public final void method6888(@OriginalArg(0) Class144 arg0) {
		@Pc(3) Class98_Sub1 local3 = arg0.aClass254_1.aClass98_Sub1_7;
		for (@Pc(6) Class98_Sub1 local6 = local3.aClass98_Sub1_10; local6 != local3; local6 = local6.aClass98_Sub1_10) {
			@Pc(10) Class98_Sub1_Sub1 local10 = (Class98_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt9517 >> 12;
			@Pc(20) int local20 = local10.anInt9523 >> 12;
			@Pc(25) int local25 = local10.anInt9520 >> 12;
			@Pc(49) int local49 = this.aClass54_Sub1_7.anInt1509 + (this.aClass54_Sub1_7.anInt1508 * local15 + this.aClass54_Sub1_7.anInt1504 * local20 + this.aClass54_Sub1_7.anInt1507 * local25 >> 14);
			if (local49 >= this.anInt5826 && local49 <= this.anInt5845) {
				@Pc(90) int local90 = this.anInt5827 + this.anInt5818 * (this.aClass54_Sub1_7.anInt1510 + (this.aClass54_Sub1_7.anInt1500 * local15 + this.aClass54_Sub1_7.anInt1505 * local20 + this.aClass54_Sub1_7.anInt1506 * local25 >> 14)) / local49;
				@Pc(122) int local122 = this.anInt5837 + this.anInt5835 * (this.aClass54_Sub1_7.anInt1501 + (this.aClass54_Sub1_7.anInt1503 * local15 + this.aClass54_Sub1_7.anInt1511 * local20 + this.aClass54_Sub1_7.anInt1502 * local25 >> 14)) / local49;
				if (local90 >= this.anInt5844 && local90 <= this.anInt5825 && local122 >= this.anInt5831 && local122 <= this.anInt5838) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method5059(local10, local90, local122, local49, (local10.anInt9516 * this.anInt5818 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "JA", descriptor = "(I)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lea", name = "l", descriptor = "(I)Z")
	public final boolean method5057(@OriginalArg(0) int arg0) {
		return this.aBoolean410 || super.anInterface4_15.method4234(arg0).aBoolean595;
	}

	@OriginalMember(owner = "client!lea", name = "I", descriptor = "()V")
	private void method5058() {
		if (this.aFloat137 == 0.0F) {
			this.anInt5836 = this.anInt5830;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt5830;
		@Pc(12) float local12 = (float) this.anInt5826;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat138 / (this.aFloat137 + this.aFloat138);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat137;
		this.anInt5836 = (int) (((float) this.anInt5830 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "()Z")
	@Override
	public final boolean method6826() {
		return false;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6823(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!lea", name = "g", descriptor = "()Z")
	@Override
	public final boolean method6838() {
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "KA", descriptor = "(IIII)[I")
	@Override
	public final int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt5817 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.lb[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!ip;)V")
	@Override
	public final void method6835(@OriginalArg(0) Class26 arg0) {
	}

	@OriginalMember(owner = "client!lea", name = "n", descriptor = "()I")
	@Override
	public final int method6847() {
		return 0;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!nj;IIII)Lclient!ba;")
	public abstract Class20 method6833(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!lea", name = "ya", descriptor = "(IIIII)V")
	@Override
	public final void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt5844 || arg0 >= this.anInt5825) {
			return;
		}
		if (arg1 < this.anInt5831) {
			arg2 -= this.anInt5831 - arg1;
			arg1 = this.anInt5831;
		}
		if (arg1 + arg2 > this.anInt5838) {
			arg2 = this.anInt5838 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5817;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.lb[local40 + local54 * this.anInt5817] = arg3;
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
				local111 = local40 + local103 * this.anInt5817;
				local116 = this.lb[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.lb[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt5817;
				local111 = this.lb[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.lb[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lea", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class86_Sub1 local2 = (Class86_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray567;
		@Pc(8) int[] local8 = local2.anIntArray566;
		@Pc(20) int local20;
		if (this.anInt5838 < arg3 + local5.length) {
			local20 = this.anInt5838 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt5831 > arg3) {
			local33 = this.anInt5831 - arg3;
			arg3 = this.anInt5831;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt5817;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt5844 > local58) {
				local62 -= this.anInt5844 - local58;
				local58 = this.anInt5844;
			}
			if (this.anInt5825 < local58 + local62) {
				local62 = this.anInt5825 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.lb[local58++] = arg0;
			}
			local49 += this.anInt5817;
		}
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V")
	public abstract void method6850(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lea", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5844 < arg0) {
			this.anInt5844 = arg0;
		}
		if (this.anInt5831 < arg1) {
			this.anInt5831 = arg1;
		}
		if (this.anInt5825 > arg2) {
			this.anInt5825 = arg2;
		}
		if (this.anInt5838 > arg3) {
			this.anInt5838 = arg3;
		}
		this.method5052();
	}

	@OriginalMember(owner = "client!lea", name = "C", descriptor = "(IIIIII)V")
	@Override
	public final void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt5844) {
			arg2 -= this.anInt5844 - arg0;
			arg0 = this.anInt5844;
		}
		if (arg1 < this.anInt5831) {
			arg3 -= this.anInt5831 - arg1;
			arg1 = this.anInt5831;
		}
		if (arg0 + arg2 > this.anInt5825) {
			arg2 = this.anInt5825 - arg0;
		}
		if (arg1 + arg3 > this.anInt5838) {
			arg3 = this.anInt5838 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt5825 || arg1 > this.anInt5838) {
			return;
		}
		@Pc(67) int local67 = this.anInt5817 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt5817;
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
						local217 = this.lb[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.lb[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.lb[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.lb[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.lb[arg2] = arg4;
					arg2++;
					this.lb[arg2] = arg4;
					arg2++;
					this.lb[arg2] = arg4;
					arg2++;
					this.lb[arg2] = arg4;
					arg2++;
					this.lb[arg2] = arg4;
					arg2++;
					this.lb[arg2] = arg4;
					arg2++;
					this.lb[arg2] = arg4;
					arg2++;
					this.lb[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.lb[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!lea", name = "F", descriptor = "()V")
	@Override
	public final void F() {
		this.anInt5844 = 0;
		this.anInt5831 = 0;
		this.anInt5825 = this.anInt5817;
		this.anInt5838 = this.anInt5843;
		this.method5052();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!ba;Lclient!ig;Lclient!q;Lclient!po;I)V")
	@Override
	public final void method6856(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class98_Sub5 arg3, @OriginalArg(4) int arg4) {
		((Class20_Sub1) arg0).method7273(arg2, arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!lea", name = "r", descriptor = "()V")
	public abstract void method6858();

	@OriginalMember(owner = "client!lea", name = "ha", descriptor = "(F)V")
	@Override
	public final void ha(@OriginalArg(0) float arg0) {
		this.anInt5840 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!lea", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt5826;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!ip;Lclient!ip;FLclient!ip;)Lclient!ip;")
	@Override
	public final Class26 method6870(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class26 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "()Z")
	@Override
	public final boolean method6837() {
		return false;
	}

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "()Z")
	@Override
	public final boolean method6836() {
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public final Class58 method6874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt5817 + arg0;
		@Pc(16) int local16 = this.anInt5817 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.lb[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class58_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class58_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt5831 || arg1 >= this.anInt5838) {
			return;
		}
		if (arg0 < this.anInt5844) {
			arg2 -= this.anInt5844 - arg0;
			arg0 = this.anInt5844;
		}
		if (arg0 + arg2 > this.anInt5825) {
			arg2 = this.anInt5825 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5817;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.lb[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.lb[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.lb[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.lb[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.lb[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!fm;IIII)V")
	public abstract void method5059(@OriginalArg(0) Class98_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!lea", name = "X", descriptor = "(III)V")
	@Override
	public final void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5842 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt5842 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt5842 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt5842 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt5842 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean411 = false;
		} else {
			this.aBoolean411 = true;
		}
	}

	@OriginalMember(owner = "client!lea", name = "B", descriptor = "()V")
	@Override
	public void method6892() {
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method6875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.e(arg0, arg1, arg2, arg4, arg5);
		this.e(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.ya(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.ya(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!lea", name = "i", descriptor = "()V")
	@Override
	public final void method6841() {
		this.aClass136_68.method3470();
		this.aClass136_69.method3470();
	}

	@OriginalMember(owner = "client!lea", name = "LA", descriptor = "(IIII)V")
	@Override
	public final void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5819 = arg0;
		this.anInt5842 = arg1;
		this.anInt5828 = arg2;
	}

	@OriginalMember(owner = "client!lea", name = "A", descriptor = "([I)V")
	@Override
	public final void A(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5844;
		arg0[1] = this.anInt5831;
		arg0[2] = this.anInt5825;
		arg0[3] = this.anInt5838;
	}
}
