import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!of", name = "F", descriptor = "I")
	private int anInt4659;

	@OriginalMember(owner = "client!of", name = "H", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!of", name = "K", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!of", name = "O", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!of", name = "P", descriptor = "Lclient!dp;")
	private Class17_Sub3 aClass17_Sub3_6;

	@OriginalMember(owner = "client!of", name = "W", descriptor = "I")
	private int anInt4669;

	@OriginalMember(owner = "client!of", name = "X", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!of", name = "ab", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!of", name = "fb", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!of", name = "hb", descriptor = "D")
	private double aDouble11;

	@OriginalMember(owner = "client!of", name = "sb", descriptor = "D")
	private double aDouble12;

	@OriginalMember(owner = "client!of", name = "J", descriptor = "I")
	private int anInt4661 = 0;

	@OriginalMember(owner = "client!of", name = "G", descriptor = "Z")
	private boolean aBoolean395 = false;

	@OriginalMember(owner = "client!of", name = "L", descriptor = "I")
	private int anInt4662 = 0;

	@OriginalMember(owner = "client!of", name = "tb", descriptor = "I")
	private int anInt4685 = -32768;

	@OriginalMember(owner = "client!of", name = "nb", descriptor = "I")
	private int anInt4680 = -1;

	@OriginalMember(owner = "client!of", name = "cb", descriptor = "I")
	private final int anInt4673;

	@OriginalMember(owner = "client!of", name = "I", descriptor = "I")
	public final int anInt4660;

	@OriginalMember(owner = "client!of", name = "jb", descriptor = "I")
	private final int anInt4677;

	@OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
	private final int anInt4664;

	@OriginalMember(owner = "client!of", name = "kb", descriptor = "I")
	public final int anInt4678;

	@OriginalMember(owner = "client!of", name = "lb", descriptor = "I")
	public final int lb;

	@OriginalMember(owner = "client!of", name = "ob", descriptor = "I")
	public final int anInt4681;

	@OriginalMember(owner = "client!of", name = "gb", descriptor = "Lclient!lb;")
	private final Class116 aClass116_3;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt4673 = arg7;
		this.anInt4660 = arg5;
		this.anInt4677 = arg8;
		this.anInt4664 = arg0;
		this.anInt4678 = arg10;
		this.lb = arg9;
		this.anInt4681 = arg6;
		this.aBoolean395 = false;
		@Pc(64) int local64 = Static244.method4224(this.anInt4664).anInt5127;
		if (local64 == -1) {
			this.aClass116_3 = null;
		} else {
			this.aClass116_3 = Static340.method5560(local64);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!vm;BI)Lclient!jn;")
	private Class5 method3837(@OriginalArg(0) Class92 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class156 local16 = Static244.method4224(this.anInt4664);
		return local16.method4236(this.anInt4662, this.anInt4661, arg0, this.anInt4680, arg1);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)V")
	public void method3838(@OriginalArg(1) int arg0) {
		if (this.anInt4673 == -1) {
			this.aDouble10 += (double) arg0 * this.aDouble12;
		} else {
			this.aDouble10 += this.aDouble12 * (double) arg0 + (double) arg0 * this.aDouble11 * 0.5D * (double) arg0;
			this.aDouble12 += this.aDouble11 * (double) arg0;
		}
		this.aDouble5 += (double) arg0 * this.aDouble6;
		this.aBoolean395 = true;
		this.aDouble7 += (double) arg0 * this.aDouble8;
		this.anInt4669 = (int) (Math.atan2(this.aDouble8, this.aDouble6) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4659 = (int) (Math.atan2(this.aDouble12, this.aDouble9) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass116_3 == null) {
			return;
		}
		this.anInt4662 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass116_3.anIntArray329[this.anInt4661] >= this.anInt4662) {
						return;
					}
					this.anInt4662 -= this.aClass116_3.anIntArray329[this.anInt4661];
					this.anInt4661++;
					if (this.aClass116_3.anIntArray330.length <= this.anInt4661) {
						this.anInt4661 -= this.aClass116_3.anInt3753;
						if (this.anInt4661 < 0 || this.anInt4661 >= this.aClass116_3.anIntArray330.length) {
							this.anInt4661 = 0;
						}
					}
					this.anInt4680 = this.anInt4661 + 1;
				} while (this.aClass116_3.anIntArray330.length > this.anInt4680);
				this.anInt4680 -= this.aClass116_3.anInt3753;
			} while (this.anInt4680 >= 0 && this.aClass116_3.anIntArray330.length > this.anInt4680);
			this.anInt4680 = -1;
		}
	}

	@OriginalMember(owner = "client!of", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass17_Sub3_6 != null) {
			this.aClass17_Sub3_6.method1070();
		}
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(I)I")
	@Override
	public int method5416() {
		return this.anInt4685;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
	public void method3841() {
		if (this.aClass17_Sub3_6 != null) {
			this.aClass17_Sub3_6.method1070();
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!vm;ZLclient!jn;)V")
	private void method3842(@OriginalArg(0) Class92 arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(6) Class125[] local6 = arg1.method3989();
		@Pc(9) Class143[] local9 = arg1.method4002();
		if ((this.aClass17_Sub3_6 == null || this.aClass17_Sub3_6.aBoolean97) && (local6 != null || local9 != null)) {
			this.aClass17_Sub3_6 = new Class17_Sub3(Static342.anInt6706);
		}
		if (this.aClass17_Sub3_6 != null) {
			this.aClass17_Sub3_6.method1064(arg0, (long) Static342.anInt6706, local6, local9);
			this.aClass17_Sub3_6.method1068(super.aByte73, super.aShort85, super.aShort83, super.aShort84, super.aShort82);
		}
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5411() {
		return false;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!vm;I)V")
	@Override
	public void method5409(@OriginalArg(0) Class92 arg0) {
		@Pc(9) Class5 local9 = this.method3837(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class23 local15 = arg0.method4466();
		local15.method5101(this.anInt4659);
		local15.method5095(this.anInt4669);
		local15.method5089((int) this.aDouble7, (int) this.aDouble10, (int) this.aDouble5);
		this.anInt4685 = local9.method4020();
		this.method3842(arg0, local9);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILclient!vm;)Z")
	@Override
	public boolean method5414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class92 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
	@Override
	public void method5415() {
		super.aShort84 = super.aShort82 = (short) (this.aDouble5 / 128.0D);
		super.aShort85 = super.aShort83 = (short) (this.aDouble7 / 128.0D);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)V")
	public void method3843(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean395) {
			local9 = arg3 - super.anInt6465;
			@Pc(15) double local15 = (double) (arg2 - super.anInt6466);
			@Pc(24) double local24 = Math.sqrt(local9 * local9 + local15 * local15);
			this.aDouble7 = (double) this.anInt4677 * local9 / local24 + (double) super.anInt6465;
			this.aDouble5 = (double) this.anInt4677 * local15 / local24 + (double) super.anInt6466;
			this.aDouble10 = super.anInt6464;
		}
		local9 = this.anInt4681 + 1 - arg0;
		this.aDouble6 = ((double) arg2 - this.aDouble5) / local9;
		this.aDouble8 = ((double) arg3 - this.aDouble7) / local9;
		this.aDouble9 = Math.sqrt(this.aDouble8 * this.aDouble8 + this.aDouble6 * this.aDouble6);
		if (this.anInt4673 == -1) {
			this.aDouble12 = ((double) arg1 - this.aDouble10) / local9;
		} else {
			if (!this.aBoolean395) {
				this.aDouble12 = -this.aDouble9 * Math.tan((double) this.anInt4673 * 0.02454369D);
			}
			this.aDouble11 = ((double) arg1 - this.aDouble10 - local9 * this.aDouble12) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!vm;Z)Lclient!dn;")
	@Override
	public Class17_Sub2 method5413(@OriginalArg(0) Class92 arg0) {
		@Pc(9) Class5 local9 = this.method3837(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class23 local16 = arg0.method4466();
		local16.method5101(this.anInt4659);
		local16.method5095(this.anInt4669);
		local16.method5089((int) this.aDouble7, (int) this.aDouble10, (int) this.aDouble5);
		if (this.aClass17_Sub3_6 == null) {
			local9.method4029(local16, null, 0);
		} else {
			@Pc(42) Class88 local42 = this.aClass17_Sub3_6.method1067();
			arg0.method4451(local9, local42, local16, null);
		}
		this.anInt4685 = local9.method4020();
		this.method3842(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	@Override
	public void method5408() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZIIILclient!ai;ILclient!vm;)V")
	@Override
	public void method5406(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class92 arg5) {
		throw new IllegalStateException();
	}
}
