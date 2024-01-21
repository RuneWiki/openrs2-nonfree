import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
	public int anInt822;

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!dd", name = "S", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
	private int anInt832;

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
	private int anInt823 = -32768;

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
	private int anInt825 = 0;

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
	private int anInt824 = 0;

	@OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
	public final int anInt833;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
	private final int anInt819;

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
	private final int anInt821;

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
	private final int anInt826;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
	public final int anInt816;

	@OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
	private final int anInt835;

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
	private final int anInt815;

	@OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
	public final int anInt820;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
	private final int anInt817;

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
	public final int anInt830;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
	public final int anInt813;

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Lclient!re;")
	private final Class1_Sub3_Sub20 aClass1_Sub3_Sub20_2;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class8_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt833 = arg9;
		this.anInt819 = arg3;
		this.anInt821 = arg4;
		this.anInt826 = arg0;
		this.aBoolean54 = false;
		this.anInt816 = arg5;
		this.anInt835 = arg8;
		this.anInt815 = arg2;
		this.anInt820 = arg10;
		this.anInt817 = arg7;
		this.anInt830 = arg6;
		this.anInt813 = arg1;
		@Pc(55) int local55 = Static116.method1724(this.anInt826).anInt1908;
		if (local55 == -1) {
			this.aClass1_Sub3_Sub20_2 = null;
		} else {
			this.aClass1_Sub3_Sub20_2 = Static84.method1279(local55);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
	public void method613(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean54) {
			local8 = arg1 - this.anInt815;
			@Pc(15) double local15 = (double) (arg2 - this.anInt819);
			@Pc(24) double local24 = Math.sqrt(local8 * local8 + local15 * local15);
			this.aDouble8 = (double) this.anInt815 + (double) this.anInt835 * local8 / local24;
			this.aDouble4 = this.anInt821;
			this.aDouble3 = (double) this.anInt819 + (double) this.anInt835 * local15 / local24;
		}
		local8 = this.anInt830 + 1 - arg0;
		this.aDouble9 = ((double) arg2 - this.aDouble3) / local8;
		this.aDouble5 = ((double) arg1 - this.aDouble8) / local8;
		this.aDouble6 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble9 * this.aDouble9);
		if (!this.aBoolean54) {
			this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt817 * 0.02454369D);
		}
		this.aDouble2 = ((double) arg3 - this.aDouble4 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "()I")
	@Override
	public int method2668() {
		return this.anInt823;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Lclient!ee;")
	private Class8_Sub5 method615() {
		@Pc(22) Class1_Sub3_Sub11 local22 = Static116.method1724(this.anInt826);
		@Pc(30) Class8_Sub5 local30 = local22.method1317(this.anInt825);
		if (local30 == null) {
			return null;
		} else {
			local30.method2045(this.anInt832);
			return local30;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class8_Sub5 local7 = this.method615();
		if (local7 != null) {
			local7.method2672(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt823 = local7.method2668();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)V")
	public void method619(@OriginalArg(0) int arg0) {
		this.aDouble3 += this.aDouble9 * (double) arg0;
		this.aDouble4 += (double) arg0 * this.aDouble7 + (double) arg0 * 0.5D * this.aDouble2 * (double) arg0;
		this.aBoolean54 = true;
		this.aDouble7 += (double) arg0 * this.aDouble2;
		this.aDouble8 += (double) arg0 * this.aDouble5;
		this.anInt822 = (int) (Math.atan2(this.aDouble5, this.aDouble9) * 325.949D) + 1024 & 0x7FF;
		this.anInt832 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub3_Sub20_2 == null) {
			return;
		}
		this.anInt824 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt824 <= this.aClass1_Sub3_Sub20_2.anIntArray298[this.anInt825]) {
						return;
					}
					this.anInt824 -= this.aClass1_Sub3_Sub20_2.anIntArray298[this.anInt825];
					this.anInt825++;
				} while (this.anInt825 < this.aClass1_Sub3_Sub20_2.anIntArray300.length);
				this.anInt825 -= this.aClass1_Sub3_Sub20_2.anInt3390;
			} while (this.anInt825 >= 0 && this.aClass1_Sub3_Sub20_2.anIntArray300.length > this.anInt825);
			this.anInt825 = 0;
		}
	}
}
