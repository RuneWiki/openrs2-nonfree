import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class11_Sub1_Sub1_Sub4 extends Class11_Sub1_Sub1 {

	@OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
	private int anInt4445;

	@OriginalMember(owner = "client!jf", name = "U", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!jf", name = "Y", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!jf", name = "bb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!jf", name = "hb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!jf", name = "ob", descriptor = "Lclient!oa;")
	private Class11_Sub9 aClass11_Sub9_6;

	@OriginalMember(owner = "client!jf", name = "tb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!jf", name = "yb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!jf", name = "zb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!jf", name = "Cb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!jf", name = "Db", descriptor = "I")
	private int anInt4470;

	@OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
	private int anInt4451 = 0;

	@OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
	private int anInt4452 = 0;

	@OriginalMember(owner = "client!jf", name = "nb", descriptor = "I")
	private int anInt4462 = -1;

	@OriginalMember(owner = "client!jf", name = "ub", descriptor = "I")
	private int anInt4466 = 0;

	@OriginalMember(owner = "client!jf", name = "Bb", descriptor = "Z")
	private boolean aBoolean319 = false;

	@OriginalMember(owner = "client!jf", name = "Gb", descriptor = "Z")
	private boolean aBoolean320 = false;

	@OriginalMember(owner = "client!jf", name = "jb", descriptor = "I")
	private int anInt4459 = 0;

	@OriginalMember(owner = "client!jf", name = "db", descriptor = "I")
	public final int anInt4454;

	@OriginalMember(owner = "client!jf", name = "Ab", descriptor = "I")
	private final int anInt4469;

	@OriginalMember(owner = "client!jf", name = "Kb", descriptor = "I")
	private final int anInt4476;

	@OriginalMember(owner = "client!jf", name = "eb", descriptor = "I")
	private final int anInt4455;

	@OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
	public final int anInt4447;

	@OriginalMember(owner = "client!jf", name = "Jb", descriptor = "I")
	public final int anInt4475;

	@OriginalMember(owner = "client!jf", name = "lb", descriptor = "I")
	private final int lb;

	@OriginalMember(owner = "client!jf", name = "R", descriptor = "Z")
	private final boolean aBoolean318;

	@OriginalMember(owner = "client!jf", name = "qb", descriptor = "I")
	public final int anInt4464;

	@OriginalMember(owner = "client!jf", name = "Nb", descriptor = "Lclient!ks;")
	private final Class197 aClass197_2;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class11_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg1, arg2, arg3, Static538.method6114(arg1, arg4, arg3) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt4454 = arg7;
		this.anInt4469 = arg5;
		this.anInt4476 = arg8;
		this.anInt4455 = arg9;
		this.aBoolean320 = false;
		this.anInt4447 = arg11;
		this.anInt4475 = arg6;
		this.lb = arg0;
		this.aBoolean318 = arg12;
		this.anInt4464 = arg10;
		@Pc(85) int local85 = Static583.aClass256_2.method5466(this.lb).anInt3775;
		if (local85 == -1) {
			this.aClass197_2 = null;
		} else {
			this.aClass197_2 = Static223.aClass245_1.method5312(local85);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIILclient!r;)Z")
	@Override
	public boolean method7210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!r;B)Lclient!da;")
	private Class52 method3584(@OriginalArg(0) int arg0, @OriginalArg(1) Class78 arg1) {
		@Pc(16) Class134 local16 = Static583.aClass256_2.method5466(this.lb);
		return local16.method3062(this.anInt4459, Static223.aClass245_1, this.anInt4451, arg1, this.anInt4462, arg0);
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)I")
	@Override
	public int method7208(@OriginalArg(0) int arg0) {
		if (arg0 != 6329) {
			this.method7205(null);
		}
		return this.anInt4452;
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)I")
	@Override
	public int method7212() {
		return this.anInt4466;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!vv;IIZLclient!r;II)V")
	@Override
	public void method7215(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7206(@OriginalArg(0) Class78 arg0) {
		@Pc(13) Class52 local13 = this.method3584(0, arg0);
		if (local13 == null) {
			return;
		}
		@Pc(19) Class34 local19 = arg0.method6848();
		local19.oa(this.anInt4445);
		local19.ZA(this.anInt4470);
		local19.U((int) this.aDouble2, (int) this.aDouble8, (int) this.aDouble5);
		this.anInt4466 = local13.J();
		this.anInt4452 = local13.RA();
		this.method3585(arg0, local13, local19);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLclient!r;Lclient!da;Lclient!q;)V")
	private void method3585(@OriginalArg(1) Class78 arg0, @OriginalArg(2) Class52 arg1, @OriginalArg(3) Class34 arg2) {
		arg1.method7410(arg2);
		@Pc(9) Class244[] local9 = arg1.method7404();
		@Pc(20) Class212[] local20 = arg1.method7395();
		if ((this.aClass11_Sub9_6 == null || this.aClass11_Sub9_6.aBoolean511) && (local9 != null || local20 != null)) {
			this.aClass11_Sub9_6 = Static363.method5341(Static518.anInt9331, true);
		}
		if (this.aClass11_Sub9_6 != null) {
			this.aClass11_Sub9_6.method5339(arg0, (long) Static518.anInt9331, local9, local20);
			this.aClass11_Sub9_6.method5348(super.aByte113, super.aShort90, super.aShort91, super.aShort88, super.aShort89);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BIIII)V")
	public void method3586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean320) {
			local12 = arg2 - super.anInt8902;
			@Pc(19) double local19 = (double) (arg3 - super.anInt8906);
			@Pc(28) double local28 = Math.sqrt(local19 * local19 + local12 * local12);
			this.aDouble2 = local12 * (double) this.anInt4455 / local28 + (double) super.anInt8902;
			this.aDouble5 = (double) this.anInt4455 * local19 / local28 + (double) super.anInt8906;
			if (this.aBoolean318) {
				this.aDouble8 = Static538.method6114(super.aByte113, (int) this.aDouble5, (int) this.aDouble2) - this.anInt4469;
			} else {
				this.aDouble8 = super.anInt8908;
			}
		}
		local12 = this.anInt4454 + 1 - arg1;
		this.aDouble3 = ((double) arg3 - this.aDouble5) / local12;
		this.aDouble6 = ((double) arg2 - this.aDouble2) / local12;
		this.aDouble9 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble6 * this.aDouble6);
		if (this.anInt4476 == -1) {
			this.aDouble7 = ((double) arg0 - this.aDouble8) / local12;
		} else {
			if (!this.aBoolean320) {
				this.aDouble7 = -this.aDouble9 * Math.tan((double) this.anInt4476 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg0 - this.aDouble7 * local12 - this.aDouble8) * 2.0D / (local12 * local12);
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7209() {
		return false;
	}

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "(B)V")
	@Override
	public void method6054() {
		super.aShort88 = super.aShort89 = (short) (this.aDouble5 / 512.0D);
		super.aShort90 = super.aShort91 = (short) (this.aDouble2 / 512.0D);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V")
	public void method3588(@OriginalArg(0) int arg0) {
		this.aBoolean320 = true;
		this.aDouble2 += this.aDouble6 * (double) arg0;
		this.aDouble5 += this.aDouble3 * (double) arg0;
		if (this.aBoolean318) {
			this.aDouble8 = Static538.method6114(super.aByte113, (int) this.aDouble5, (int) this.aDouble2) - this.anInt4469;
		} else if (this.anInt4476 == -1) {
			this.aDouble8 += (double) arg0 * this.aDouble7;
		} else {
			this.aDouble8 += this.aDouble7 * (double) arg0 + this.aDouble4 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += (double) arg0 * this.aDouble4;
		}
		this.anInt4470 = (int) (Math.atan2(this.aDouble6, this.aDouble3) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4445 = (int) (Math.atan2(this.aDouble7, this.aDouble9) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass197_2 == null) {
			return;
		}
		this.anInt4459 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass197_2.anIntArray279[this.anInt4451] >= this.anInt4459) {
						return;
					}
					this.anInt4459 -= this.aClass197_2.anIntArray279[this.anInt4451];
					this.anInt4451++;
					if (this.anInt4451 >= this.aClass197_2.anIntArray284.length) {
						this.anInt4451 -= this.aClass197_2.anInt5063;
						if (this.anInt4451 < 0 || this.anInt4451 >= this.aClass197_2.anIntArray284.length) {
							this.anInt4451 = 0;
						}
					}
					this.anInt4462 = this.anInt4451 + 1;
				} while (this.anInt4462 < this.aClass197_2.anIntArray284.length);
				this.anInt4462 -= this.aClass197_2.anInt5063;
			} while (this.anInt4462 >= 0 && this.aClass197_2.anIntArray284.length > this.anInt4462);
			this.anInt4462 = -1;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Lclient!r;I)Lclient!bca;")
	@Override
	public Class11_Sub2 method7219(@OriginalArg(0) Class78 arg0) {
		@Pc(11) Class52 local11 = this.method3584(2048, arg0);
		if (local11 == null) {
			return null;
		}
		@Pc(23) Class34 local23 = arg0.method6848();
		local23.oa(this.anInt4445);
		local23.ZA(this.anInt4470);
		local23.U((int) this.aDouble2, (int) this.aDouble8, (int) this.aDouble5);
		this.method3585(arg0, local11, local23);
		if (Static594.aBoolean718) {
			local11.method7405(local23, null, Static18.anInt503, 0);
		} else {
			local11.method7413(local23, null, 0);
		}
		if (this.aClass11_Sub9_6 != null) {
			@Pc(70) Class64 local70 = this.aClass11_Sub9_6.method5336();
			if (Static594.aBoolean718) {
				arg0.method6850(local70, Static18.anInt503);
			} else {
				arg0.method6796(local70);
			}
		}
		this.aBoolean319 = local11.LA();
		this.anInt4466 = local11.J();
		this.anInt4452 = local11.RA();
		return null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public void method3590() {
		if (this.aClass11_Sub9_6 != null) {
			this.aClass11_Sub9_6.method5342();
		}
	}

	@OriginalMember(owner = "client!jf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass11_Sub9_6 != null) {
			this.aClass11_Sub9_6.method5342();
		}
	}

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7214() {
		return false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!r;)Lclient!cr;")
	@Override
	public Class48 method7205(@OriginalArg(1) Class78 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7217() {
		return this.aBoolean319;
	}

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "(I)V")
	@Override
	public void method7222() {
		throw new IllegalStateException();
	}
}
