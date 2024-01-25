import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class8_Sub1_Sub5 extends Class8_Sub1 {

	@OriginalMember(owner = "client!wn", name = "H", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!wn", name = "J", descriptor = "Lclient!nl;")
	private Class2_Sub4 aClass2_Sub4_7;

	@OriginalMember(owner = "client!wn", name = "W", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!wn", name = "X", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!wn", name = "Y", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!wn", name = "ab", descriptor = "I")
	private int anInt6726;

	@OriginalMember(owner = "client!wn", name = "hb", descriptor = "I")
	private int anInt6732;

	@OriginalMember(owner = "client!wn", name = "jb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!wn", name = "kb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!wn", name = "nb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!wn", name = "zb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
	private int anInt6710 = -32768;

	@OriginalMember(owner = "client!wn", name = "eb", descriptor = "I")
	private int anInt6729 = 0;

	@OriginalMember(owner = "client!wn", name = "db", descriptor = "I")
	private int anInt6728 = -1;

	@OriginalMember(owner = "client!wn", name = "qb", descriptor = "Z")
	private boolean aBoolean486 = false;

	@OriginalMember(owner = "client!wn", name = "ib", descriptor = "I")
	private int anInt6733 = 0;

	@OriginalMember(owner = "client!wn", name = "C", descriptor = "I")
	public final int anInt6707;

	@OriginalMember(owner = "client!wn", name = "fb", descriptor = "I")
	private final int anInt6730;

	@OriginalMember(owner = "client!wn", name = "S", descriptor = "I")
	public final int anInt6721;

	@OriginalMember(owner = "client!wn", name = "V", descriptor = "I")
	public final int anInt6724;

	@OriginalMember(owner = "client!wn", name = "O", descriptor = "I")
	public final int anInt6717;

	@OriginalMember(owner = "client!wn", name = "T", descriptor = "I")
	private final int anInt6722;

	@OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
	private final int anInt6708;

	@OriginalMember(owner = "client!wn", name = "lb", descriptor = "Lclient!b;")
	private final Class14 lb;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class8_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt6707 = arg6;
		this.anInt6730 = arg0;
		this.anInt6721 = arg9;
		this.anInt6724 = arg10;
		this.anInt6717 = arg5;
		this.anInt6722 = arg7;
		this.anInt6708 = arg8;
		this.aBoolean486 = false;
		@Pc(64) int local64 = Static116.method2427(this.anInt6730).anInt101;
		if (local64 == -1) {
			this.lb = null;
		} else {
			this.lb = Static225.method4042(local64);
		}
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(B)V")
	@Override
	public void method5628() {
		super.aShort97 = super.aShort99 = (short) (this.aDouble8 / 128.0D);
		super.aShort98 = super.aShort96 = (short) (this.aDouble4 / 128.0D);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BLclient!vq;)Lclient!bf;")
	@Override
	public Class2_Sub2 method5624(@OriginalArg(1) Class47 arg0) {
		@Pc(9) Class38 local9 = this.method5640(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(24) Class57 local24 = arg0.method2706();
		local24.method4187(this.anInt6726);
		local24.method4199(this.anInt6732);
		local24.method4190((int) this.aDouble4, (int) this.aDouble2, (int) this.aDouble8);
		if (this.aClass2_Sub4_7 == null) {
			local9.method1925(local24, null, 0);
		} else {
			@Pc(50) Class176 local50 = this.aClass2_Sub4_7.method3927();
			arg0.method2760(local9, local50, local24, null);
		}
		this.anInt6710 = local9.method1921();
		this.method5634(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!vq;IIB)Z")
	@Override
	public boolean method5623(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(B)V")
	@Override
	public void method5625() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)I")
	@Override
	public int method5629() {
		return this.anInt6710;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!ni;Lclient!vq;)V")
	private void method5634(@OriginalArg(1) Class38 arg0, @OriginalArg(2) Class47 arg1) {
		@Pc(6) Class89[] local6 = arg0.method1917();
		@Pc(9) Class175[] local9 = arg0.method1901();
		if ((this.aClass2_Sub4_7 == null || this.aClass2_Sub4_7.aBoolean348) && (local6 != null || local9 != null)) {
			this.aClass2_Sub4_7 = new Class2_Sub4(Static199.anInt4137);
		}
		if (this.aClass2_Sub4_7 != null) {
			this.aClass2_Sub4_7.method3929(arg1, (long) Static199.anInt4137, local6, local9);
			this.aClass2_Sub4_7.method3925(super.aByte77, super.aShort98, super.aShort96, super.aShort97, super.aShort99);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!vq;ZLclient!km;IIBI)V")
	@Override
	public void method5621(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IB)V")
	public void method5635(@OriginalArg(0) int arg0) {
		this.aDouble8 += (double) arg0 * this.aDouble3;
		if (this.anInt6722 == -1) {
			this.aDouble2 += (double) arg0 * this.aDouble9;
		} else {
			this.aDouble2 += (double) arg0 * this.aDouble7 * 0.5D * (double) arg0 + (double) arg0 * this.aDouble9;
			this.aDouble9 += (double) arg0 * this.aDouble7;
		}
		this.aBoolean486 = true;
		this.aDouble4 += (double) arg0 * this.aDouble5;
		this.anInt6732 = (int) (Math.atan2(this.aDouble5, this.aDouble3) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt6726 = (int) (Math.atan2(this.aDouble9, this.aDouble6) * 2607.5945876176133D) & 0x3FFF;
		if (this.lb == null) {
			return;
		}
		this.anInt6729 += arg0;
		while (true) {
			do {
				do {
					if (this.lb.anIntArray11[this.anInt6733] >= this.anInt6729) {
						return;
					}
					this.anInt6729 -= this.lb.anIntArray11[this.anInt6733];
					this.anInt6733++;
					if (this.anInt6733 >= this.lb.anIntArray12.length) {
						this.anInt6733 -= this.lb.anInt348;
						if (this.anInt6733 < 0 || this.lb.anIntArray12.length <= this.anInt6733) {
							this.anInt6733 = 0;
						}
					}
					this.anInt6728 = this.anInt6733 + 1;
				} while (this.lb.anIntArray12.length > this.anInt6728);
				this.anInt6728 -= this.lb.anInt348;
			} while (this.anInt6728 >= 0 && this.lb.anIntArray12.length > this.anInt6728);
			this.anInt6728 = -1;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIII)V")
	public void method5636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean486) {
			local9 = arg1 - super.anInt6701;
			@Pc(15) double local15 = (double) (arg0 - super.anInt6702);
			@Pc(24) double local24 = Math.sqrt(local9 * local9 + local15 * local15);
			this.aDouble4 = local9 * (double) this.anInt6708 / local24 + (double) super.anInt6701;
			this.aDouble2 = super.anInt6697;
			this.aDouble8 = (double) this.anInt6708 * local15 / local24 + (double) super.anInt6702;
		}
		local9 = this.anInt6707 + 1 - arg3;
		this.aDouble5 = ((double) arg1 - this.aDouble4) / local9;
		this.aDouble3 = ((double) arg0 - this.aDouble8) / local9;
		this.aDouble6 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble5 * this.aDouble5);
		if (this.anInt6722 == -1) {
			this.aDouble9 = ((double) arg2 - this.aDouble2) / local9;
		} else {
			if (!this.aBoolean486) {
				this.aDouble9 = -this.aDouble6 * Math.tan((double) this.anInt6722 * 0.02454369D);
			}
			this.aDouble7 = ((double) arg2 - local9 * this.aDouble9 - this.aDouble2) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
	public void method5638() {
		if (this.aClass2_Sub4_7 != null) {
			this.aClass2_Sub4_7.method3930();
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!vq;B)V")
	@Override
	public void method5627(@OriginalArg(0) Class47 arg0) {
		@Pc(9) Class38 local9 = this.method5640(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class57 local15 = arg0.method2706();
		local15.method4187(this.anInt6726);
		local15.method4199(this.anInt6732);
		local15.method4190((int) this.aDouble4, (int) this.aDouble2, (int) this.aDouble8);
		this.anInt6710 = local9.method1921();
		this.method5634(local9, arg0);
	}

	@OriginalMember(owner = "client!wn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass2_Sub4_7 != null) {
			this.aClass2_Sub4_7.method3930();
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!vq;I)Lclient!ni;")
	private Class38 method5640(@OriginalArg(1) Class47 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class5 local16 = Static116.method2427(this.anInt6730);
		return local16.method121(arg1, this.anInt6733, arg0, this.anInt6729, this.anInt6728);
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5622() {
		return false;
	}
}
