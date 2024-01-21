import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class5_Sub2_Sub2_Sub2 extends Class5_Sub2_Sub2 {

	@OriginalMember(owner = "client!db", name = "Z", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
	public int anInt675;

	@OriginalMember(owner = "client!db", name = "db", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!db", name = "gb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!db", name = "lb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!db", name = "mb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!db", name = "wb", descriptor = "I")
	private int anInt688;

	@OriginalMember(owner = "client!db", name = "Ab", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!db", name = "Cb", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!db", name = "Ib", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!db", name = "tb", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!db", name = "xb", descriptor = "I")
	private int anInt689 = 0;

	@OriginalMember(owner = "client!db", name = "Kb", descriptor = "I")
	private int anInt696 = 0;

	@OriginalMember(owner = "client!db", name = "Eb", descriptor = "I")
	private final int anInt694;

	@OriginalMember(owner = "client!db", name = "Bb", descriptor = "I")
	private final int anInt692;

	@OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
	private final int anInt678;

	@OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
	public final int anInt680;

	@OriginalMember(owner = "client!db", name = "ub", descriptor = "I")
	public final int anInt686;

	@OriginalMember(owner = "client!db", name = "pb", descriptor = "I")
	private final int anInt684;

	@OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
	public final int anInt676;

	@OriginalMember(owner = "client!db", name = "sb", descriptor = "I")
	private final int anInt685;

	@OriginalMember(owner = "client!db", name = "yb", descriptor = "I")
	public final int anInt690;

	@OriginalMember(owner = "client!db", name = "kb", descriptor = "I")
	private final int anInt681;

	@OriginalMember(owner = "client!db", name = "Db", descriptor = "I")
	public final int anInt693;

	@OriginalMember(owner = "client!db", name = "Jb", descriptor = "Lclient!w;")
	private final Class5_Sub2_Sub17 aClass5_Sub2_Sub17_1;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class5_Sub2_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt694 = arg8;
		this.anInt692 = arg7;
		this.anInt678 = arg4;
		this.anInt680 = arg9;
		this.anInt686 = arg1;
		this.anInt684 = arg2;
		this.anInt676 = arg5;
		this.anInt685 = arg0;
		this.anInt690 = arg10;
		this.anInt681 = arg3;
		this.anInt693 = arg6;
		this.aBoolean23 = false;
		@Pc(52) int local52 = Static1.method2(this.anInt685).anInt1213;
		if (local52 == -1) {
			this.aClass5_Sub2_Sub17_1 = null;
		} else {
			this.aClass5_Sub2_Sub17_1 = Static106.method1769(local52);
		}
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)Lclient!wb;")
	@Override
	public Class5_Sub2_Sub2_Sub6 method2178() {
		@Pc(9) Class5_Sub2_Sub7 local9 = Static1.method2(this.anInt685);
		@Pc(19) Class5_Sub2_Sub2_Sub6 local19 = local9.method850(this.anInt696);
		if (local19 == null) {
			return null;
		} else {
			local19.method2158(this.anInt688);
			return local19;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
	public void method484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean23) {
			local8 = arg2 - this.anInt684;
			@Pc(15) double local15 = (double) (arg3 - this.anInt681);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local8 * local8);
			this.aDouble8 = (double) this.anInt694 * local15 / local24 + (double) this.anInt681;
			this.aDouble7 = this.anInt678;
			this.aDouble5 = (double) this.anInt684 + local8 * (double) this.anInt694 / local24;
		}
		local8 = this.anInt693 + 1 - arg1;
		this.aDouble6 = ((double) arg2 - this.aDouble5) / local8;
		this.aDouble4 = ((double) arg3 - this.aDouble8) / local8;
		this.aDouble2 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble6 * this.aDouble6);
		if (!this.aBoolean23) {
			this.aDouble1 = -this.aDouble2 * Math.tan((double) this.anInt692 * 0.02454369D);
		}
		this.aDouble3 = ((double) arg0 - local8 * this.aDouble1 - this.aDouble7) * 2.0D / (local8 * local8);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)V")
	public void method486(@OriginalArg(0) int arg0) {
		this.aDouble7 += (double) arg0 * (double) arg0 * 0.5D * this.aDouble3 + (double) arg0 * this.aDouble1;
		this.aDouble8 += (double) arg0 * this.aDouble4;
		this.aDouble1 += this.aDouble3 * (double) arg0;
		this.aBoolean23 = true;
		this.aDouble5 += (double) arg0 * this.aDouble6;
		this.anInt675 = (int) (Math.atan2(this.aDouble6, this.aDouble4) * 325.949D) + 1024 & 0x7FF;
		this.anInt688 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) & 0x7FF;
		if (this.aClass5_Sub2_Sub17_1 == null) {
			return;
		}
		this.anInt689 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt689 <= this.aClass5_Sub2_Sub17_1.anIntArray396[this.anInt696]) {
						return;
					}
					this.anInt689 -= this.aClass5_Sub2_Sub17_1.anIntArray396[this.anInt696];
					this.anInt696++;
				} while (this.aClass5_Sub2_Sub17_1.anIntArray391.length > this.anInt696);
				this.anInt696 -= this.aClass5_Sub2_Sub17_1.anInt3228;
			} while (this.anInt696 >= 0 && this.aClass5_Sub2_Sub17_1.anIntArray391.length > this.anInt696);
			this.anInt696 = 0;
		}
	}
}
