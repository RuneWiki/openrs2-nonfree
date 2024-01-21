import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class3_Sub1_Sub5_Sub1 extends Class3_Sub1_Sub5 {

	@OriginalMember(owner = "client!ee", name = "ab", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
	private int anInt950;

	@OriginalMember(owner = "client!ee", name = "mb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ee", name = "pb", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!ee", name = "ub", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ee", name = "Cb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ee", name = "Eb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!ee", name = "Hb", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!ee", name = "Ib", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ee", name = "Kb", descriptor = "I")
	public int anInt963;

	@OriginalMember(owner = "client!ee", name = "gb", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!ee", name = "qb", descriptor = "I")
	private int anInt955 = 0;

	@OriginalMember(owner = "client!ee", name = "ob", descriptor = "I")
	private int anInt954 = 0;

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
	public final int anInt946;

	@OriginalMember(owner = "client!ee", name = "Gb", descriptor = "I")
	private final int anInt961;

	@OriginalMember(owner = "client!ee", name = "jb", descriptor = "I")
	private final int anInt951;

	@OriginalMember(owner = "client!ee", name = "Mb", descriptor = "I")
	private final int anInt965;

	@OriginalMember(owner = "client!ee", name = "lb", descriptor = "I")
	private final int anInt953;

	@OriginalMember(owner = "client!ee", name = "vb", descriptor = "I")
	public final int anInt958;

	@OriginalMember(owner = "client!ee", name = "fb", descriptor = "I")
	public final int anInt949;

	@OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
	private final int anInt947;

	@OriginalMember(owner = "client!ee", name = "zb", descriptor = "I")
	private final int anInt960;

	@OriginalMember(owner = "client!ee", name = "tb", descriptor = "I")
	public final int anInt957;

	@OriginalMember(owner = "client!ee", name = "kb", descriptor = "I")
	public final int anInt952;

	@OriginalMember(owner = "client!ee", name = "Pb", descriptor = "Lclient!ri;")
	private final Class3_Sub1_Sub15 aClass3_Sub1_Sub15_1;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class3_Sub1_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.aBoolean44 = false;
		this.anInt946 = arg5;
		this.anInt961 = arg2;
		this.anInt951 = arg0;
		this.anInt965 = arg3;
		this.anInt953 = arg7;
		this.anInt958 = arg1;
		this.anInt949 = arg9;
		this.anInt947 = arg4;
		this.anInt960 = arg8;
		this.anInt957 = arg6;
		this.anInt952 = arg10;
		@Pc(52) int local52 = Static194.method3135(this.anInt951).anInt2463;
		if (local52 == -1) {
			this.aClass3_Sub1_Sub15_1 = null;
		} else {
			this.aClass3_Sub1_Sub15_1 = Static148.method2368(local52);
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V")
	public void method646(@OriginalArg(0) int arg0) {
		this.aDouble6 += (double) arg0 * this.aDouble5;
		this.aDouble7 += (double) arg0 * this.aDouble8 * 0.5D * (double) arg0 + this.aDouble4 * (double) arg0;
		this.aDouble3 += (double) arg0 * this.aDouble2;
		this.aBoolean44 = true;
		this.aDouble4 += this.aDouble8 * (double) arg0;
		this.anInt963 = (int) (Math.atan2(this.aDouble5, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
		this.anInt950 = (int) (Math.atan2(this.aDouble4, this.aDouble1) * 325.949D) & 0x7FF;
		if (this.aClass3_Sub1_Sub15_1 == null) {
			return;
		}
		this.anInt954 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass3_Sub1_Sub15_1.anIntArray440[this.anInt955] >= this.anInt954) {
						return;
					}
					this.anInt954 -= this.aClass3_Sub1_Sub15_1.anIntArray440[this.anInt955];
					this.anInt955++;
				} while (this.anInt955 < this.aClass3_Sub1_Sub15_1.anIntArray439.length);
				this.anInt955 -= this.aClass3_Sub1_Sub15_1.anInt3549;
			} while (this.anInt955 >= 0 && this.anInt955 < this.aClass3_Sub1_Sub15_1.anIntArray439.length);
			this.anInt955 = 0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZIIII)V")
	public void method647(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean44) {
			local9 = arg0 - this.anInt961;
			@Pc(16) double local16 = (double) (arg3 - this.anInt965);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble7 = this.anInt947;
			this.aDouble3 = (double) this.anInt960 * local16 / local25 + (double) this.anInt965;
			this.aDouble6 = (double) this.anInt960 * local9 / local25 + (double) this.anInt961;
		}
		local9 = this.anInt957 + 1 - arg2;
		this.aDouble2 = ((double) arg3 - this.aDouble3) / local9;
		this.aDouble5 = ((double) arg0 - this.aDouble6) / local9;
		this.aDouble1 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble5 * this.aDouble5);
		if (!this.aBoolean44) {
			this.aDouble4 = -this.aDouble1 * Math.tan((double) this.anInt953 * 0.02454369D);
		}
		this.aDouble8 = ((double) arg1 - local9 * this.aDouble4 - this.aDouble7) * 2.0D / (local9 * local9);
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)Lclient!vf;")
	@Override
	protected Class3_Sub1_Sub5_Sub3 method3056() {
		@Pc(10) Class3_Sub1_Sub12 local10 = Static194.method3135(this.anInt951);
		@Pc(16) Class3_Sub1_Sub5_Sub3 local16 = local10.method1708(this.anInt955);
		if (local16 == null) {
			return null;
		} else {
			local16.method1376(this.anInt950);
			return local16;
		}
	}
}
