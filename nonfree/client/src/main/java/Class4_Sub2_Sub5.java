import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class4_Sub2_Sub5 extends Class4_Sub2 {

	@OriginalMember(owner = "client!su", name = "D", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!su", name = "G", descriptor = "Lclient!lr;")
	private Class38_Sub6 aClass38_Sub6_6;

	@OriginalMember(owner = "client!su", name = "H", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!su", name = "L", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!su", name = "P", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!su", name = "S", descriptor = "I")
	private int anInt6591;

	@OriginalMember(owner = "client!su", name = "bb", descriptor = "I")
	private int anInt6600;

	@OriginalMember(owner = "client!su", name = "eb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!su", name = "ib", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!su", name = "jb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!su", name = "mb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!su", name = "B", descriptor = "I")
	private int anInt6581 = -32768;

	@OriginalMember(owner = "client!su", name = "hb", descriptor = "I")
	private int anInt6605 = 0;

	@OriginalMember(owner = "client!su", name = "W", descriptor = "I")
	private int anInt6595 = -1;

	@OriginalMember(owner = "client!su", name = "ob", descriptor = "Z")
	private boolean aBoolean566 = false;

	@OriginalMember(owner = "client!su", name = "Z", descriptor = "I")
	private int anInt6598 = 0;

	@OriginalMember(owner = "client!su", name = "lb", descriptor = "I")
	public final int lb;

	@OriginalMember(owner = "client!su", name = "fb", descriptor = "I")
	private final int anInt6603;

	@OriginalMember(owner = "client!su", name = "cb", descriptor = "I")
	private final int anInt6601;

	@OriginalMember(owner = "client!su", name = "db", descriptor = "I")
	private final int anInt6602;

	@OriginalMember(owner = "client!su", name = "V", descriptor = "I")
	private final int anInt6594;

	@OriginalMember(owner = "client!su", name = "pb", descriptor = "Z")
	private final boolean aBoolean567;

	@OriginalMember(owner = "client!su", name = "C", descriptor = "I")
	public final int anInt6582;

	@OriginalMember(owner = "client!su", name = "Y", descriptor = "I")
	public final int anInt6597;

	@OriginalMember(owner = "client!su", name = "kb", descriptor = "I")
	public final int anInt6606;

	@OriginalMember(owner = "client!su", name = "K", descriptor = "Lclient!dc;")
	private final Class46 aClass46_2;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class4_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static66.method1200(arg1, arg2, arg3) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.lb = arg5;
		this.anInt6603 = arg0;
		this.anInt6601 = arg8;
		this.anInt6602 = arg4;
		this.anInt6594 = arg7;
		this.aBoolean567 = arg11;
		this.aBoolean566 = false;
		this.anInt6582 = arg9;
		this.anInt6597 = arg6;
		this.anInt6606 = arg10;
		@Pc(78) int local78 = Static137.aClass16_2.method251(this.anInt6603).anInt2238;
		if (local78 == -1) {
			this.aClass46_2 = null;
		} else {
			this.aClass46_2 = Static9.aClass194_1.method4371(local78);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)V")
	@Override
	public void method5889() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(ILclient!qa;)Lclient!fm;")
	@Override
	public Class38_Sub3 method5896(@OriginalArg(1) Class26 arg0) {
		@Pc(14) Class32 local14 = this.method5186(2048, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class102 local21 = arg0.method2223();
		local21.YA(this.anInt6591);
		local21.c(this.anInt6600);
		local21.ZA((int) this.aDouble6, (int) this.aDouble7, (int) this.aDouble5);
		if (this.aClass38_Sub6_6 == null) {
			local14.method5675(local21, null, 0);
		} else {
			@Pc(54) Class192 local54 = this.aClass38_Sub6_6.method3549();
			arg0.method2218(local14, local54, local21, null);
		}
		this.anInt6581 = local14.b();
		this.method5184(local14, arg0);
		return null;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IILclient!qa;Lclient!eq;IIZ)V")
	@Override
	public void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	public void method5182() {
		if (this.aClass38_Sub6_6 != null) {
			this.aClass38_Sub6_6.method3548();
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIII)V")
	public void method5183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean566) {
			local12 = arg3 - super.anInt7117;
			@Pc(19) double local19 = (double) (arg2 - super.anInt7111);
			@Pc(28) double local28 = Math.sqrt(local19 * local19 + local12 * local12);
			this.aDouble5 = local19 * (double) this.anInt6601 / local28 + (double) super.anInt7111;
			this.aDouble6 = (double) this.anInt6601 * local12 / local28 + (double) super.anInt7117;
			if (this.aBoolean567) {
				this.aDouble7 = Static66.method1200(super.aByte92, (int) this.aDouble6, (int) this.aDouble5) - this.anInt6602;
			} else {
				this.aDouble7 = super.anInt7109;
			}
		}
		local12 = this.anInt6597 + 1 - arg0;
		this.aDouble3 = ((double) arg2 - this.aDouble5) / local12;
		this.aDouble2 = ((double) arg3 - this.aDouble6) / local12;
		this.aDouble9 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble3 * this.aDouble3);
		if (this.anInt6594 == -1) {
			this.aDouble8 = ((double) arg1 - this.aDouble7) / local12;
		} else {
			if (!this.aBoolean566) {
				this.aDouble8 = -this.aDouble9 * Math.tan((double) this.anInt6594 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg1 - this.aDouble7 - local12 * this.aDouble8) * 2.0D / (local12 * local12);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method5893(@OriginalArg(0) Class26 arg0) {
		@Pc(13) Class32 local13 = this.method5186(0, arg0);
		if (local13 == null) {
			return;
		}
		@Pc(19) Class102 local19 = arg0.method2223();
		local19.YA(this.anInt6591);
		local19.c(this.anInt6600);
		local19.ZA((int) this.aDouble6, (int) this.aDouble7, (int) this.aDouble5);
		this.anInt6581 = local13.b();
		this.method5184(local13, arg0);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BLclient!c;Lclient!qa;)V")
	private void method5184(@OriginalArg(1) Class32 arg0, @OriginalArg(2) Class26 arg1) {
		@Pc(6) Class202[] local6 = arg0.method5673();
		@Pc(9) Class17[] local9 = arg0.method5667();
		if ((this.aClass38_Sub6_6 == null || this.aClass38_Sub6_6.aBoolean368) && (local6 != null || local9 != null)) {
			this.aClass38_Sub6_6 = new Class38_Sub6(Static164.anInt3206);
		}
		if (this.aClass38_Sub6_6 != null) {
			this.aClass38_Sub6_6.method3556(arg1, (long) Static164.anInt3206, local6, local9);
			this.aClass38_Sub6_6.method3555(super.aByte92, super.aShort88, super.aShort87, super.aShort89, super.aShort86);
		}
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(B)I")
	@Override
	public int method5562() {
		return this.anInt6581;
	}

	@OriginalMember(owner = "client!su", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass38_Sub6_6 != null) {
			this.aClass38_Sub6_6.method3548();
		}
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5891() {
		return false;
	}

	@OriginalMember(owner = "client!su", name = "f", descriptor = "(I)V")
	@Override
	public void method5564() {
		super.aShort88 = super.aShort87 = (short) (this.aDouble6 / 128.0D);
		super.aShort89 = super.aShort86 = (short) (this.aDouble5 / 128.0D);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IB)V")
	public void method5185(@OriginalArg(0) int arg0) {
		this.aDouble5 += (double) arg0 * this.aDouble3;
		this.aBoolean566 = true;
		this.aDouble6 += this.aDouble2 * (double) arg0;
		if (this.aBoolean567) {
			this.aDouble7 = Static66.method1200(super.aByte92, (int) this.aDouble6, (int) this.aDouble5) - this.anInt6602;
		} else if (this.anInt6594 == -1) {
			this.aDouble7 += (double) arg0 * this.aDouble8;
		} else {
			this.aDouble7 += this.aDouble4 * 0.5D * (double) arg0 * (double) arg0 + this.aDouble8 * (double) arg0;
			this.aDouble8 += this.aDouble4 * (double) arg0;
		}
		this.anInt6600 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt6591 = (int) (Math.atan2(this.aDouble8, this.aDouble9) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass46_2 == null) {
			return;
		}
		this.anInt6598 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass46_2.anIntArray89[this.anInt6605] >= this.anInt6598) {
						return;
					}
					this.anInt6598 -= this.aClass46_2.anIntArray89[this.anInt6605];
					this.anInt6605++;
					if (this.aClass46_2.anIntArray90.length <= this.anInt6605) {
						this.anInt6605 -= this.aClass46_2.anInt1763;
						if (this.anInt6605 < 0 || this.anInt6605 >= this.aClass46_2.anIntArray90.length) {
							this.anInt6605 = 0;
						}
					}
					this.anInt6595 = this.anInt6605 + 1;
				} while (this.aClass46_2.anIntArray90.length > this.anInt6595);
				this.anInt6595 -= this.aClass46_2.anInt1763;
			} while (this.anInt6595 >= 0 && this.aClass46_2.anIntArray90.length > this.anInt6595);
			this.anInt6595 = -1;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	private Class32 method5186(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1) {
		@Pc(15) Class77 local15 = Static137.aClass16_2.method251(this.anInt6603);
		return local15.method1670(arg1, this.anInt6595, arg0, this.anInt6598, Static9.aClass194_1, this.anInt6605);
	}
}
