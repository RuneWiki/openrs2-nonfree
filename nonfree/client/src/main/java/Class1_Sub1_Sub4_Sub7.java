import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class1_Sub1_Sub4_Sub7 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
	public int anInt4003;

	@OriginalMember(owner = "client!sb", name = "db", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!sb", name = "hb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!sb", name = "ib", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!sb", name = "kb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!sb", name = "ob", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!sb", name = "qb", descriptor = "I")
	private int anInt4015;

	@OriginalMember(owner = "client!sb", name = "tb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!sb", name = "xb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!sb", name = "Ab", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!sb", name = "sb", descriptor = "I")
	private int anInt4017 = 0;

	@OriginalMember(owner = "client!sb", name = "cb", descriptor = "I")
	private int anInt4007 = 0;

	@OriginalMember(owner = "client!sb", name = "Db", descriptor = "Z")
	private boolean aBoolean150 = false;

	@OriginalMember(owner = "client!sb", name = "vb", descriptor = "I")
	private final int anInt4018;

	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
	private final int anInt4004;

	@OriginalMember(owner = "client!sb", name = "lb", descriptor = "I")
	private final int anInt4012;

	@OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
	public final int anInt4002;

	@OriginalMember(owner = "client!sb", name = "Bb", descriptor = "I")
	private final int anInt4021;

	@OriginalMember(owner = "client!sb", name = "pb", descriptor = "I")
	private final int anInt4014;

	@OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
	public final int anInt4009;

	@OriginalMember(owner = "client!sb", name = "ab", descriptor = "I")
	public final int anInt4005;

	@OriginalMember(owner = "client!sb", name = "nb", descriptor = "I")
	public final int anInt4013;

	@OriginalMember(owner = "client!sb", name = "rb", descriptor = "I")
	public final int anInt4016;

	@OriginalMember(owner = "client!sb", name = "gb", descriptor = "I")
	private final int anInt4010;

	@OriginalMember(owner = "client!sb", name = "ub", descriptor = "Lclient!re;")
	private final Class1_Sub1_Sub17 aClass1_Sub1_Sub17_3;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub1_Sub4_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt4018 = arg7;
		this.anInt4004 = arg0;
		this.anInt4012 = arg4;
		this.anInt4002 = arg10;
		this.aBoolean150 = false;
		this.anInt4021 = arg8;
		this.anInt4014 = arg2;
		this.anInt4009 = arg6;
		this.anInt4005 = arg9;
		this.anInt4013 = arg5;
		this.anInt4016 = arg1;
		this.anInt4010 = arg3;
		@Pc(52) int local52 = Static86.method1911(this.anInt4004).anInt4556;
		if (local52 == -1) {
			this.aClass1_Sub1_Sub17_3 = null;
		} else {
			this.aClass1_Sub1_Sub17_3 = Static90.method1962(local52);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)V")
	public void method3070(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean150) {
			local9 = arg3 - this.anInt4014;
			@Pc(16) double local16 = (double) (arg1 - this.anInt4010);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble3 = (double) this.anInt4021 * local9 / local25 + (double) this.anInt4014;
			this.aDouble4 = (double) this.anInt4021 * local16 / local25 + (double) this.anInt4010;
			this.aDouble6 = this.anInt4012;
		}
		local9 = this.anInt4009 + 1 - arg2;
		this.aDouble2 = ((double) arg3 - this.aDouble3) / local9;
		this.aDouble5 = ((double) arg1 - this.aDouble4) / local9;
		this.aDouble7 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble2 * this.aDouble2);
		if (!this.aBoolean150) {
			this.aDouble8 = -this.aDouble7 * Math.tan((double) this.anInt4018 * 0.02454369D);
		}
		this.aDouble1 = ((double) arg0 - local9 * this.aDouble8 - this.aDouble6) * 2.0D / (local9 * local9);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)Lclient!je;")
	@Override
	protected Class1_Sub1_Sub4_Sub1 method3066() {
		@Pc(18) Class1_Sub1_Sub18 local18 = Static86.method1911(this.anInt4004);
		@Pc(24) Class1_Sub1_Sub4_Sub1 local24 = local18.method3510(this.anInt4017);
		if (local24 == null) {
			return null;
		} else {
			local24.method720(this.anInt4015);
			return local24;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
	public void method3071(@OriginalArg(1) int arg0) {
		this.aDouble6 += (double) arg0 * this.aDouble8 + (double) arg0 * 0.5D * this.aDouble1 * (double) arg0;
		this.aDouble4 += this.aDouble5 * (double) arg0;
		this.aDouble8 += this.aDouble1 * (double) arg0;
		this.aDouble3 += this.aDouble2 * (double) arg0;
		this.aBoolean150 = true;
		this.anInt4003 = (int) (Math.atan2(this.aDouble2, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
		this.anInt4015 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub1_Sub17_3 == null) {
			return;
		}
		this.anInt4007 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt4007 <= this.aClass1_Sub1_Sub17_3.anIntArray370[this.anInt4017]) {
						return;
					}
					this.anInt4007 -= this.aClass1_Sub1_Sub17_3.anIntArray370[this.anInt4017];
					this.anInt4017++;
				} while (this.aClass1_Sub1_Sub17_3.anIntArray365.length > this.anInt4017);
				this.anInt4017 -= this.aClass1_Sub1_Sub17_3.anInt3869;
			} while (this.anInt4017 >= 0 && this.anInt4017 < this.aClass1_Sub1_Sub17_3.anIntArray365.length);
			this.anInt4017 = 0;
		}
	}
}
