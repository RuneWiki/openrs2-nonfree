import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ea", name = "sb", descriptor = "I")
	public int anInt664;

	@OriginalMember(owner = "client!ea", name = "vb", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!ea", name = "Fb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ea", name = "Ib", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!ea", name = "Jb", descriptor = "I")
	private int anInt676;

	@OriginalMember(owner = "client!ea", name = "Ob", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!ea", name = "Rb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ea", name = "Tb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ea", name = "Zb", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!ea", name = "ac", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ea", name = "zb", descriptor = "I")
	private int anInt670 = 0;

	@OriginalMember(owner = "client!ea", name = "Ub", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!ea", name = "wb", descriptor = "I")
	private int anInt667 = 0;

	@OriginalMember(owner = "client!ea", name = "Kb", descriptor = "I")
	private final int anInt677;

	@OriginalMember(owner = "client!ea", name = "Eb", descriptor = "I")
	private final int anInt674;

	@OriginalMember(owner = "client!ea", name = "bc", descriptor = "I")
	private final int anInt681;

	@OriginalMember(owner = "client!ea", name = "Cb", descriptor = "I")
	private final int anInt672;

	@OriginalMember(owner = "client!ea", name = "Sb", descriptor = "I")
	public final int anInt678;

	@OriginalMember(owner = "client!ea", name = "Db", descriptor = "I")
	private final int anInt673;

	@OriginalMember(owner = "client!ea", name = "xb", descriptor = "I")
	public final int anInt668;

	@OriginalMember(owner = "client!ea", name = "ec", descriptor = "I")
	public final int anInt682;

	@OriginalMember(owner = "client!ea", name = "Gb", descriptor = "I")
	public final int anInt675;

	@OriginalMember(owner = "client!ea", name = "Vb", descriptor = "I")
	public final int anInt679;

	@OriginalMember(owner = "client!ea", name = "Bb", descriptor = "I")
	private final int anInt671;

	@OriginalMember(owner = "client!ea", name = "Ab", descriptor = "Lclient!tb;")
	private final Class1_Sub1_Sub15 aClass1_Sub1_Sub15_2;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt677 = arg2;
		this.anInt674 = arg0;
		this.anInt681 = arg7;
		this.anInt672 = arg3;
		this.anInt678 = arg5;
		this.anInt673 = arg4;
		this.anInt668 = arg9;
		this.anInt682 = arg10;
		this.aBoolean31 = false;
		this.anInt675 = arg6;
		this.anInt679 = arg1;
		this.anInt671 = arg8;
		@Pc(52) int local52 = Static122.method1994(this.anInt674).anInt2351;
		if (local52 == -1) {
			this.aClass1_Sub1_Sub15_2 = null;
		} else {
			this.aClass1_Sub1_Sub15_2 = Static56.method1247(local52);
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)Lclient!lb;")
	@Override
	public Class1_Sub1_Sub1_Sub6 method1897() {
		@Pc(9) Class1_Sub1_Sub12 local9 = Static122.method1994(this.anInt674);
		@Pc(21) Class1_Sub1_Sub1_Sub6 local21 = local9.method1643(this.anInt670);
		if (local21 == null) {
			return null;
		} else {
			local21.method1326(this.anInt676);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
	public void method525(@OriginalArg(0) int arg0) {
		this.aBoolean31 = true;
		this.aDouble7 += this.aDouble2 * (double) arg0;
		this.aDouble1 += this.aDouble3 * (double) arg0;
		this.aDouble4 += (double) arg0 * this.aDouble5 + (double) arg0 * 0.5D * this.aDouble8 * (double) arg0;
		this.aDouble5 += (double) arg0 * this.aDouble8;
		this.anInt664 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
		this.anInt676 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub1_Sub15_2 == null) {
			return;
		}
		this.anInt667 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass1_Sub1_Sub15_2.anIntArray452[this.anInt670] >= this.anInt667) {
						return;
					}
					this.anInt667 -= this.aClass1_Sub1_Sub15_2.anIntArray452[this.anInt670];
					this.anInt670++;
				} while (this.aClass1_Sub1_Sub15_2.anIntArray450.length > this.anInt670);
				this.anInt670 -= this.aClass1_Sub1_Sub15_2.anInt2657;
			} while (this.anInt670 >= 0 && this.aClass1_Sub1_Sub15_2.anIntArray450.length > this.anInt670);
			this.anInt670 = 0;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIZ)V")
	public void method526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(20) double local20;
		if (!this.aBoolean31) {
			local20 = arg1 - this.anInt677;
			@Pc(27) double local27 = (double) (arg0 - this.anInt672);
			@Pc(36) double local36 = Math.sqrt(local20 * local20 + local27 * local27);
			this.aDouble1 = (double) this.anInt671 * local27 / local36 + (double) this.anInt672;
			this.aDouble4 = this.anInt673;
			this.aDouble7 = (double) this.anInt677 + (double) this.anInt671 * local20 / local36;
		}
		local20 = this.anInt675 + 1 - arg3;
		this.aDouble3 = ((double) arg0 - this.aDouble1) / local20;
		this.aDouble2 = ((double) arg1 - this.aDouble7) / local20;
		this.aDouble6 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble2 * this.aDouble2);
		if (!this.aBoolean31) {
			this.aDouble5 = -this.aDouble6 * Math.tan((double) this.anInt681 * 0.02454369D);
		}
		this.aDouble8 = ((double) arg2 - local20 * this.aDouble5 - this.aDouble4) * 2.0D / (local20 * local20);
	}
}
