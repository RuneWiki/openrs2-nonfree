import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class31_Sub2_Sub6 extends Class31_Sub2 {

	@OriginalMember(owner = "client!v", name = "B", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!v", name = "C", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!v", name = "F", descriptor = "I")
	private int anInt6803;

	@OriginalMember(owner = "client!v", name = "L", descriptor = "I")
	private int anInt6809;

	@OriginalMember(owner = "client!v", name = "S", descriptor = "Lclient!mq;")
	private Class4_Sub7 aClass4_Sub7_5;

	@OriginalMember(owner = "client!v", name = "T", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!v", name = "W", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!v", name = "ab", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!v", name = "jb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!v", name = "kb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!v", name = "H", descriptor = "I")
	private int anInt6805 = 0;

	@OriginalMember(owner = "client!v", name = "K", descriptor = "I")
	private int anInt6808 = -1;

	@OriginalMember(owner = "client!v", name = "hb", descriptor = "I")
	private int anInt6821 = -32768;

	@OriginalMember(owner = "client!v", name = "M", descriptor = "Z")
	private boolean aBoolean476 = false;

	@OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
	private int anInt6820 = 0;

	@OriginalMember(owner = "client!v", name = "lb", descriptor = "I")
	public final int lb;

	@OriginalMember(owner = "client!v", name = "mb", descriptor = "I")
	private final int anInt6823;

	@OriginalMember(owner = "client!v", name = "ib", descriptor = "I")
	private final int anInt6822;

	@OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
	private final int anInt6818;

	@OriginalMember(owner = "client!v", name = "v", descriptor = "I")
	public final int anInt6796;

	@OriginalMember(owner = "client!v", name = "db", descriptor = "Z")
	private final boolean aBoolean477;

	@OriginalMember(owner = "client!v", name = "z", descriptor = "I")
	public final int anInt6799;

	@OriginalMember(owner = "client!v", name = "P", descriptor = "I")
	private final int anInt6812;

	@OriginalMember(owner = "client!v", name = "y", descriptor = "I")
	public final int anInt6798;

	@OriginalMember(owner = "client!v", name = "R", descriptor = "Lclient!sm;")
	private final Class223 aClass223_3;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class31_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static301.method4312(arg1, arg2, arg3) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.lb = arg9;
		this.aBoolean476 = false;
		this.anInt6823 = arg0;
		this.anInt6822 = arg7;
		this.anInt6818 = arg4;
		this.anInt6796 = arg6;
		this.aBoolean477 = arg11;
		this.anInt6799 = arg10;
		this.anInt6812 = arg8;
		this.anInt6798 = arg5;
		@Pc(78) int local78 = Static67.aClass263_2.method5782(this.anInt6823).anInt1014;
		if (local78 == -1) {
			this.aClass223_3 = null;
		} else {
			this.aClass223_3 = Static293.aClass127_1.method2975(local78);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIZII)V")
	public void method5601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean476) {
			local9 = arg3 - super.anInt7300;
			@Pc(16) double local16 = (double) (arg1 - super.anInt7298);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble2 = local16 * (double) this.anInt6812 / local25 + (double) super.anInt7298;
			this.aDouble8 = (double) super.anInt7300 + local9 * (double) this.anInt6812 / local25;
			if (this.aBoolean477) {
				this.aDouble9 = Static301.method4312(super.aByte100, (int) this.aDouble8, (int) this.aDouble2) - this.anInt6818;
			} else {
				this.aDouble9 = super.anInt7296;
			}
		}
		local9 = this.anInt6796 + 1 - arg0;
		this.aDouble6 = ((double) arg3 - this.aDouble8) / local9;
		this.aDouble3 = ((double) arg1 - this.aDouble2) / local9;
		this.aDouble4 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble6 * this.aDouble6);
		if (this.anInt6822 == -1) {
			this.aDouble5 = ((double) arg2 - this.aDouble9) / local9;
		} else {
			if (!this.aBoolean476) {
				this.aDouble5 = -this.aDouble4 * Math.tan((double) this.anInt6822 * 0.02454369D);
			}
			this.aDouble7 = ((double) arg2 - this.aDouble9 - local9 * this.aDouble5) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!ya;)Lclient!t;")
	private Class105 method5602(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1) {
		@Pc(14) Class38 local14 = Static67.aClass263_2.method5782(this.anInt6823);
		return local14.method918(this.anInt6805, this.anInt6820, this.anInt6808, arg0, arg1, Static293.aClass127_1);
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
	@Override
	public void method5975() {
		super.aShort103 = super.aShort100 = (short) (this.aDouble8 / 128.0D);
		super.aShort102 = super.aShort101 = (short) (this.aDouble2 / 128.0D);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	public void method5603() {
		if (this.aClass4_Sub7_5 != null) {
			this.aClass4_Sub7_5.method3776();
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!ya;ILclient!or;IZ)V")
	@Override
	public void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	public void method5604(@OriginalArg(0) int arg0) {
		this.aBoolean476 = true;
		this.aDouble8 += (double) arg0 * this.aDouble6;
		this.aDouble2 += this.aDouble3 * (double) arg0;
		if (this.aBoolean477) {
			this.aDouble9 = Static301.method4312(super.aByte100, (int) this.aDouble8, (int) this.aDouble2) - this.anInt6818;
		} else if (this.anInt6822 == -1) {
			this.aDouble9 += this.aDouble5 * (double) arg0;
		} else {
			this.aDouble9 += (double) arg0 * this.aDouble5 + (double) arg0 * this.aDouble7 * 0.5D * (double) arg0;
			this.aDouble5 += this.aDouble7 * (double) arg0;
		}
		this.anInt6809 = (int) (Math.atan2(this.aDouble6, this.aDouble3) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt6803 = (int) (Math.atan2(this.aDouble5, this.aDouble4) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass223_3 == null) {
			return;
		}
		this.anInt6820 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass223_3.anIntArray559[this.anInt6805] >= this.anInt6820) {
						return;
					}
					this.anInt6820 -= this.aClass223_3.anIntArray559[this.anInt6805];
					this.anInt6805++;
					if (this.aClass223_3.anIntArray557.length <= this.anInt6805) {
						this.anInt6805 -= this.aClass223_3.anInt6055;
						if (this.anInt6805 < 0 || this.anInt6805 >= this.aClass223_3.anIntArray557.length) {
							this.anInt6805 = 0;
						}
					}
					this.anInt6808 = this.anInt6805 + 1;
				} while (this.aClass223_3.anIntArray557.length > this.anInt6808);
				this.anInt6808 -= this.aClass223_3.anInt6055;
			} while (this.anInt6808 >= 0 && this.anInt6808 < this.aClass223_3.anIntArray557.length);
			this.anInt6808 = -1;
		}
	}

	@OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub7_5 != null) {
			this.aClass4_Sub7_5.method3776();
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		@Pc(14) Class105 local14 = this.method5602(2048, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class33 local21 = arg0.method4516();
		local21.N(this.anInt6803);
		local21.ja(this.anInt6809);
		local21.o((int) this.aDouble8, (int) this.aDouble9, (int) this.aDouble2);
		if (this.aClass4_Sub7_5 == null) {
			local14.method3534(local21, null, 0);
		} else {
			@Pc(54) Class140 local54 = this.aClass4_Sub7_5.method3777();
			arg0.method4526(local14, local54, local21, null);
		}
		this.anInt6821 = local14.MA();
		this.method5607(arg0, local14);
		return null;
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)I")
	@Override
	public int method5976() {
		return this.anInt6821;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
	@Override
	public void method5970() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5971() {
		return false;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
		@Pc(9) Class105 local9 = this.method5602(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class33 local15 = arg0.method4516();
		local15.N(this.anInt6803);
		local15.ja(this.anInt6809);
		local15.o((int) this.aDouble8, (int) this.aDouble9, (int) this.aDouble2);
		this.anInt6821 = local9.MA();
		this.method5607(arg0, local9);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!ya;Lclient!t;)V")
	private void method5607(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class105 arg1) {
		@Pc(11) Class244[] local11 = arg1.method3535();
		@Pc(14) Class57[] local14 = arg1.method3530();
		if ((this.aClass4_Sub7_5 == null || this.aClass4_Sub7_5.aBoolean308) && (local11 != null || local14 != null)) {
			this.aClass4_Sub7_5 = new Class4_Sub7(Static378.anInt4244);
		}
		if (this.aClass4_Sub7_5 != null) {
			this.aClass4_Sub7_5.method3779(arg0, (long) Static378.anInt4244, local11, local14);
			this.aClass4_Sub7_5.method3784(super.aByte100, super.aShort103, super.aShort100, super.aShort102, super.aShort101);
		}
	}
}
