import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class1_Sub2_Sub2_Sub3 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
	private int anInt761;

	@OriginalMember(owner = "client!cc", name = "Z", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!cc", name = "bb", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!cc", name = "db", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!cc", name = "fb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!cc", name = "pb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!cc", name = "yb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!cc", name = "Ab", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!cc", name = "Bb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!cc", name = "Hb", descriptor = "I")
	public int anInt778;

	@OriginalMember(owner = "client!cc", name = "vb", descriptor = "I")
	private int anInt774 = 0;

	@OriginalMember(owner = "client!cc", name = "Gb", descriptor = "I")
	private int anInt777 = 0;

	@OriginalMember(owner = "client!cc", name = "Kb", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!cc", name = "Ib", descriptor = "I")
	private final int anInt779;

	@OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
	public final int anInt767;

	@OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
	private final int anInt762;

	@OriginalMember(owner = "client!cc", name = "nb", descriptor = "I")
	public final int anInt768;

	@OriginalMember(owner = "client!cc", name = "Cb", descriptor = "I")
	private final int anInt776;

	@OriginalMember(owner = "client!cc", name = "tb", descriptor = "I")
	private final int anInt772;

	@OriginalMember(owner = "client!cc", name = "qb", descriptor = "I")
	private final int anInt770;

	@OriginalMember(owner = "client!cc", name = "ob", descriptor = "I")
	private final int anInt769;

	@OriginalMember(owner = "client!cc", name = "Jb", descriptor = "I")
	public final int anInt780;

	@OriginalMember(owner = "client!cc", name = "zb", descriptor = "I")
	public final int anInt775;

	@OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
	public final int anInt763;

	@OriginalMember(owner = "client!cc", name = "Eb", descriptor = "Lclient!fa;")
	private final Class1_Sub2_Sub8 aClass1_Sub2_Sub8_1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub2_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt779 = arg7;
		this.anInt767 = arg5;
		this.anInt762 = arg0;
		this.anInt768 = arg9;
		this.anInt776 = arg3;
		this.anInt772 = arg2;
		this.anInt770 = arg4;
		this.aBoolean54 = false;
		this.anInt769 = arg8;
		this.anInt780 = arg10;
		this.anInt775 = arg1;
		this.anInt763 = arg6;
		@Pc(52) int local52 = Static42.method1121(this.anInt762).anInt478;
		if (local52 == -1) {
			this.aClass1_Sub2_Sub8_1 = null;
		} else {
			this.aClass1_Sub2_Sub8_1 = Static142.method2538(local52);
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
	public void method682(@OriginalArg(1) int arg0) {
		this.aDouble2 += (double) arg0 * this.aDouble5;
		this.aDouble3 += this.aDouble1 * (double) arg0;
		this.aBoolean54 = true;
		this.aDouble6 += this.aDouble8 * (double) arg0 + this.aDouble7 * 0.5D * (double) arg0 * (double) arg0;
		this.aDouble8 += this.aDouble7 * (double) arg0;
		this.anInt778 = (int) (Math.atan2(this.aDouble1, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
		this.anInt761 = (int) (Math.atan2(this.aDouble8, this.aDouble4) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub2_Sub8_1 == null) {
			return;
		}
		this.anInt777 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass1_Sub2_Sub8_1.anIntArray155[this.anInt774] >= this.anInt777) {
						return;
					}
					this.anInt777 -= this.aClass1_Sub2_Sub8_1.anIntArray155[this.anInt774];
					this.anInt774++;
				} while (this.anInt774 < this.aClass1_Sub2_Sub8_1.anIntArray157.length);
				this.anInt774 -= this.aClass1_Sub2_Sub8_1.anInt1520;
			} while (this.anInt774 >= 0 && this.anInt774 < this.aClass1_Sub2_Sub8_1.anIntArray157.length);
			this.anInt774 = 0;
		}
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)Lclient!ia;")
	@Override
	protected Class1_Sub2_Sub2_Sub5 method2706() {
		@Pc(8) Class1_Sub2_Sub3 local8 = Static42.method1121(this.anInt762);
		@Pc(14) Class1_Sub2_Sub2_Sub5 local14 = local8.method530(this.anInt774);
		if (local14 == null) {
			return null;
		} else {
			local14.method2716(this.anInt761);
			return local14;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V")
	public void method684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean54) {
			local12 = arg1 - this.anInt772;
			@Pc(19) double local19 = (double) (arg2 - this.anInt776);
			@Pc(28) double local28 = Math.sqrt(local12 * local12 + local19 * local19);
			this.aDouble6 = this.anInt770;
			this.aDouble3 = (double) this.anInt769 * local12 / local28 + (double) this.anInt772;
			this.aDouble2 = (double) this.anInt776 + (double) this.anInt769 * local19 / local28;
		}
		local12 = this.anInt763 + 1 - arg0;
		this.aDouble5 = ((double) arg2 - this.aDouble2) / local12;
		this.aDouble1 = ((double) arg1 - this.aDouble3) / local12;
		this.aDouble4 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble5 * this.aDouble5);
		if (!this.aBoolean54) {
			this.aDouble8 = -this.aDouble4 * Math.tan((double) this.anInt779 * 0.02454369D);
		}
		this.aDouble7 = ((double) arg3 - this.aDouble6 - this.aDouble8 * local12) * 2.0D / (local12 * local12);
	}
}
