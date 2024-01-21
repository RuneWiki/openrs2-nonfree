import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class4_Sub4_Sub3_Sub2 extends Class4_Sub4_Sub3 {

	@OriginalMember(owner = "client!ga", name = "cb", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!ga", name = "eb", descriptor = "I")
	private int anInt1014;

	@OriginalMember(owner = "client!ga", name = "fb", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!ga", name = "ib", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!ga", name = "xb", descriptor = "I")
	public int anInt1027;

	@OriginalMember(owner = "client!ga", name = "Ab", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!ga", name = "Fb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ga", name = "Ib", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ga", name = "Jb", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!ga", name = "Lb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ga", name = "gb", descriptor = "I")
	private int anInt1015 = 0;

	@OriginalMember(owner = "client!ga", name = "hb", descriptor = "I")
	private int anInt1016 = 0;

	@OriginalMember(owner = "client!ga", name = "rb", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!ga", name = "Kb", descriptor = "I")
	public final int anInt1034;

	@OriginalMember(owner = "client!ga", name = "qb", descriptor = "I")
	private final int anInt1022;

	@OriginalMember(owner = "client!ga", name = "Qb", descriptor = "I")
	private final int anInt1038;

	@OriginalMember(owner = "client!ga", name = "Db", descriptor = "I")
	private final int anInt1030;

	@OriginalMember(owner = "client!ga", name = "Ob", descriptor = "I")
	public final int anInt1036;

	@OriginalMember(owner = "client!ga", name = "tb", descriptor = "I")
	private final int anInt1023;

	@OriginalMember(owner = "client!ga", name = "wb", descriptor = "I")
	public final int anInt1026;

	@OriginalMember(owner = "client!ga", name = "Gb", descriptor = "I")
	private final int anInt1032;

	@OriginalMember(owner = "client!ga", name = "nb", descriptor = "I")
	public final int anInt1020;

	@OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
	public final int anInt1012;

	@OriginalMember(owner = "client!ga", name = "Bb", descriptor = "I")
	private final int anInt1028;

	@OriginalMember(owner = "client!ga", name = "yb", descriptor = "Lclient!kc;")
	private final Class4_Sub4_Sub9 aClass4_Sub4_Sub9_1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class4_Sub4_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1034 = arg1;
		this.anInt1022 = arg7;
		this.anInt1038 = arg3;
		this.anInt1030 = arg4;
		this.anInt1036 = arg10;
		this.anInt1023 = arg0;
		this.anInt1026 = arg9;
		this.anInt1032 = arg2;
		this.anInt1020 = arg6;
		this.anInt1012 = arg5;
		this.aBoolean59 = false;
		this.anInt1028 = arg8;
		@Pc(52) int local52 = Static84.method1424(this.anInt1023).anInt2230;
		if (local52 == -1) {
			this.aClass4_Sub4_Sub9_1 = null;
		} else {
			this.aClass4_Sub4_Sub9_1 = Static118.method1796(local52);
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)Lclient!u;")
	@Override
	public Class4_Sub4_Sub3_Sub7 method1754() {
		@Pc(8) Class4_Sub4_Sub13 local8 = Static84.method1424(this.anInt1023);
		@Pc(19) Class4_Sub4_Sub3_Sub7 local19 = local8.method1545(this.anInt1015);
		if (local19 == null) {
			return null;
		} else {
			local19.method1770(this.anInt1014);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
	public void method655(@OriginalArg(0) int arg0) {
		this.aBoolean59 = true;
		this.aDouble2 += (double) arg0 * this.aDouble5;
		this.aDouble7 += this.aDouble3 * (double) arg0;
		this.aDouble4 += this.aDouble8 * (double) arg0 + (double) arg0 * this.aDouble6 * 0.5D * (double) arg0;
		this.aDouble8 += this.aDouble6 * (double) arg0;
		this.anInt1027 = (int) (Math.atan2(this.aDouble5, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
		this.anInt1014 = (int) (Math.atan2(this.aDouble8, this.aDouble1) * 325.949D) & 0x7FF;
		if (this.aClass4_Sub4_Sub9_1 == null) {
			return;
		}
		this.anInt1016 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass4_Sub4_Sub9_1.anIntArray200[this.anInt1015] >= this.anInt1016) {
						return;
					}
					this.anInt1016 -= this.aClass4_Sub4_Sub9_1.anIntArray200[this.anInt1015];
					this.anInt1015++;
				} while (this.aClass4_Sub4_Sub9_1.anIntArray196.length > this.anInt1015);
				this.anInt1015 -= this.aClass4_Sub4_Sub9_1.anInt1569;
			} while (this.anInt1015 >= 0 && this.aClass4_Sub4_Sub9_1.anIntArray196.length > this.anInt1015);
			this.anInt1015 = 0;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIBI)V")
	public void method656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) double local23;
		if (!this.aBoolean59) {
			local23 = arg2 - this.anInt1032;
			@Pc(29) double local29 = (double) (arg0 - this.anInt1038);
			@Pc(38) double local38 = Math.sqrt(local29 * local29 + local23 * local23);
			this.aDouble7 = (double) this.anInt1038 + (double) this.anInt1028 * local29 / local38;
			this.aDouble4 = this.anInt1030;
			this.aDouble2 = (double) this.anInt1032 + local23 * (double) this.anInt1028 / local38;
		}
		local23 = this.anInt1020 + 1 - arg1;
		this.aDouble3 = ((double) arg0 - this.aDouble7) / local23;
		this.aDouble5 = ((double) arg2 - this.aDouble2) / local23;
		this.aDouble1 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble5 * this.aDouble5);
		if (!this.aBoolean59) {
			this.aDouble8 = -this.aDouble1 * Math.tan((double) this.anInt1022 * 0.02454369D);
		}
		this.aDouble6 = ((double) arg3 - this.aDouble4 - local23 * this.aDouble8) * 2.0D / (local23 * local23);
	}
}
