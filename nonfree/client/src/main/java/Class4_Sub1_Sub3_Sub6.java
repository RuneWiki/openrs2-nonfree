import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class4_Sub1_Sub3_Sub6 extends Class4_Sub1_Sub3 {

	@OriginalMember(owner = "client!sc", name = "V", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!sc", name = "W", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!sc", name = "ib", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!sc", name = "lb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!sc", name = "nb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!sc", name = "ob", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!sc", name = "sb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!sc", name = "tb", descriptor = "I")
	private int anInt2682;

	@OriginalMember(owner = "client!sc", name = "vb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!sc", name = "Eb", descriptor = "I")
	public int anInt2690;

	@OriginalMember(owner = "client!sc", name = "gb", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!sc", name = "eb", descriptor = "I")
	private int anInt2675 = 0;

	@OriginalMember(owner = "client!sc", name = "rb", descriptor = "I")
	private int anInt2681 = 0;

	@OriginalMember(owner = "client!sc", name = "Cb", descriptor = "I")
	private final int anInt2688;

	@OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
	private final int anInt2672;

	@OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
	public final int anInt2671;

	@OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
	private final int anInt2669;

	@OriginalMember(owner = "client!sc", name = "wb", descriptor = "I")
	public final int anInt2683;

	@OriginalMember(owner = "client!sc", name = "hb", descriptor = "I")
	private final int anInt2677;

	@OriginalMember(owner = "client!sc", name = "pb", descriptor = "I")
	private final int anInt2679;

	@OriginalMember(owner = "client!sc", name = "zb", descriptor = "I")
	public final int anInt2685;

	@OriginalMember(owner = "client!sc", name = "kb", descriptor = "I")
	public final int anInt2678;

	@OriginalMember(owner = "client!sc", name = "Db", descriptor = "I")
	private final int anInt2689;

	@OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
	public final int anInt2670;

	@OriginalMember(owner = "client!sc", name = "ub", descriptor = "Lclient!vc;")
	private final Class4_Sub1_Sub17 aClass4_Sub1_Sub17_2;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class4_Sub1_Sub3_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2688 = arg8;
		this.anInt2672 = arg3;
		this.anInt2671 = arg1;
		this.anInt2669 = arg4;
		this.anInt2683 = arg9;
		this.anInt2677 = arg7;
		this.anInt2679 = arg0;
		this.anInt2685 = arg5;
		this.anInt2678 = arg6;
		this.aBoolean239 = false;
		this.anInt2689 = arg2;
		this.anInt2670 = arg10;
		@Pc(52) int local52 = Static33.method549(this.anInt2679).anInt2768;
		if (local52 == -1) {
			this.aClass4_Sub1_Sub17_2 = null;
		} else {
			this.aClass4_Sub1_Sub17_2 = Static79.method1437(local52);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V")
	public void method1746(@OriginalArg(0) int arg0) {
		this.aDouble4 += this.aDouble7 * (double) arg0;
		this.aBoolean239 = true;
		this.aDouble6 += this.aDouble2 * 0.5D * (double) arg0 * (double) arg0 + this.aDouble3 * (double) arg0;
		this.aDouble3 += (double) arg0 * this.aDouble2;
		this.aDouble5 += (double) arg0 * this.aDouble1;
		this.anInt2690 = (int) (Math.atan2(this.aDouble7, this.aDouble1) * 325.949D) + 1024 & 0x7FF;
		this.anInt2682 = (int) (Math.atan2(this.aDouble3, this.aDouble8) * 325.949D) & 0x7FF;
		if (this.aClass4_Sub1_Sub17_2 == null) {
			return;
		}
		this.anInt2675 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2675 <= this.aClass4_Sub1_Sub17_2.anIntArray327[this.anInt2681]) {
						return;
					}
					this.anInt2675 -= this.aClass4_Sub1_Sub17_2.anIntArray327[this.anInt2681];
					this.anInt2681++;
				} while (this.anInt2681 < this.aClass4_Sub1_Sub17_2.anIntArray330.length);
				this.anInt2681 -= this.aClass4_Sub1_Sub17_2.anInt2998;
			} while (this.anInt2681 >= 0 && this.aClass4_Sub1_Sub17_2.anIntArray330.length > this.anInt2681);
			this.anInt2681 = 0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Lclient!od;")
	@Override
	public Class4_Sub1_Sub3_Sub3 method1816() {
		@Pc(13) Class4_Sub1_Sub14 local13 = Static33.method549(this.anInt2679);
		@Pc(19) Class4_Sub1_Sub3_Sub3 local19 = local13.method1790(this.anInt2681);
		if (local19 == null) {
			return null;
		} else {
			local19.method1472(this.anInt2682);
			return local19;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIBII)V")
	public void method1752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean239) {
			local13 = arg1 - this.anInt2689;
			@Pc(19) double local19 = (double) (arg0 - this.anInt2672);
			@Pc(28) double local28 = Math.sqrt(local13 * local13 + local19 * local19);
			this.aDouble4 = (double) this.anInt2689 + local13 * (double) this.anInt2688 / local28;
			this.aDouble6 = this.anInt2669;
			this.aDouble5 = (double) this.anInt2672 + (double) this.anInt2688 * local19 / local28;
		}
		local13 = this.anInt2678 + 1 - arg2;
		this.aDouble7 = ((double) arg1 - this.aDouble4) / local13;
		this.aDouble1 = ((double) arg0 - this.aDouble5) / local13;
		this.aDouble8 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble1 * this.aDouble1);
		if (!this.aBoolean239) {
			this.aDouble3 = -this.aDouble8 * Math.tan((double) this.anInt2677 * 0.02454369D);
		}
		this.aDouble2 = ((double) arg3 - local13 * this.aDouble3 - this.aDouble6) * 2.0D / (local13 * local13);
	}
}
