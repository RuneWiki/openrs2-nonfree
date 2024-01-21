import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HDKZMJGE")
public final class Class6_Sub1_Sub2_Sub2 extends Class6_Sub1_Sub2 {

	@OriginalMember(owner = "client!HDKZMJGE", name = "n", descriptor = "I")
	private int anInt142;

	@OriginalMember(owner = "client!HDKZMJGE", name = "o", descriptor = "I")
	private int anInt143;

	@OriginalMember(owner = "client!HDKZMJGE", name = "p", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!HDKZMJGE", name = "q", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!HDKZMJGE", name = "r", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!HDKZMJGE", name = "s", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!HDKZMJGE", name = "z", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!HDKZMJGE", name = "A", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!HDKZMJGE", name = "B", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!HDKZMJGE", name = "G", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!HDKZMJGE", name = "M", descriptor = "I")
	public int anInt156;

	@OriginalMember(owner = "client!HDKZMJGE", name = "N", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!HDKZMJGE", name = "t", descriptor = "I")
	private int anInt144 = 3;

	@OriginalMember(owner = "client!HDKZMJGE", name = "x", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!HDKZMJGE", name = "y", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!HDKZMJGE", name = "L", descriptor = "I")
	private int anInt155 = 58;

	@OriginalMember(owner = "client!HDKZMJGE", name = "w", descriptor = "Lclient!FOXTQZWB;")
	private Class12 aClass12_2;

	@OriginalMember(owner = "client!HDKZMJGE", name = "K", descriptor = "I")
	public int anInt154;

	@OriginalMember(owner = "client!HDKZMJGE", name = "C", descriptor = "I")
	private int anInt147;

	@OriginalMember(owner = "client!HDKZMJGE", name = "D", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!HDKZMJGE", name = "E", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!HDKZMJGE", name = "u", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!HDKZMJGE", name = "v", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!HDKZMJGE", name = "H", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!HDKZMJGE", name = "I", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!HDKZMJGE", name = "J", descriptor = "I")
	public int anInt153;

	@OriginalMember(owner = "client!HDKZMJGE", name = "F", descriptor = "I")
	public int anInt150;

	@OriginalMember(owner = "client!HDKZMJGE", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class6_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass12_2 = Class12.aClass12Array1[arg8];
			this.anInt154 = arg11;
			this.anInt147 = arg0;
			this.anInt148 = arg2;
			this.anInt149 = arg7;
			this.anInt145 = arg10;
			this.anInt146 = arg9;
			this.anInt151 = arg3;
			this.anInt152 = arg5;
			this.anInt153 = arg6;
			this.anInt150 = arg1;
			this.aBoolean50 = false;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("67341, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HDKZMJGE", name = "a", descriptor = "(BIIII)V")
	public void method112(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(18) double local18;
			if (!this.aBoolean50) {
				local18 = arg1 - this.anInt147;
				@Pc(24) double local24 = (double) (arg3 - this.anInt148);
				@Pc(33) double local33 = Math.sqrt(local18 * local18 + local24 * local24);
				this.aDouble5 = (double) this.anInt147 + local18 * (double) this.anInt152 / local33;
				this.aDouble6 = (double) this.anInt148 + local24 * (double) this.anInt152 / local33;
				this.aDouble7 = this.anInt149;
			}
			local18 = this.anInt146 + 1 - arg4;
			this.aDouble1 = ((double) arg1 - this.aDouble5) / local18;
			this.aDouble2 = ((double) arg3 - this.aDouble6) / local18;
			this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
			if (!this.aBoolean50) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt151 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg2 - this.aDouble7 - this.aDouble4 * local18) * 2.0D / (local18 * local18);
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("77844, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HDKZMJGE", name = "a", descriptor = "(ZI)V")
	public void method113(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean50 = true;
			this.aDouble5 += this.aDouble1 * (double) arg0;
			this.aDouble6 += this.aDouble2 * (double) arg0;
			this.aDouble7 += this.aDouble4 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble4 += this.aDouble8 * (double) arg0;
			this.anInt156 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
			this.anInt157 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
			if (this.aClass12_2.aClass21_1 != null) {
				this.anInt143 += arg0;
				while (this.anInt143 > this.aClass12_2.aClass21_1.method159(this.anInt142)) {
					this.anInt143 -= this.aClass12_2.aClass21_1.method159(this.anInt142) + 1;
					this.anInt142++;
					if (this.anInt142 >= this.aClass12_2.aClass21_1.anInt343) {
						this.anInt142 = 0;
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("37798, " + false + ", " + arg0 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HDKZMJGE", name = "a", descriptor = "(I)Lclient!NGYJLUVS;")
	@Override
	protected Class6_Sub1_Sub2_Sub5 method382() {
		try {
			@Pc(3) Class6_Sub1_Sub2_Sub5 local3 = this.aClass12_2.method101();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass12_2.aClass21_1 != null) {
				local9 = this.aClass12_2.aClass21_1.anIntArray64[this.anInt142];
			}
			@Pc(32) Class6_Sub1_Sub2_Sub5 local32 = new Class6_Sub1_Sub2_Sub5(Class34.method378(local9), true, true, local3, false);
			if (local9 != -1) {
				local32.method235();
				local32.method236(local9);
				local32.anIntArrayArray9 = null;
				local32.anIntArrayArray8 = null;
			}
			if (this.aClass12_2.anInt131 != 128 || this.aClass12_2.anInt132 != 128) {
				local32.method244(this.aClass12_2.anInt131, this.aClass12_2.anInt131, this.aClass12_2.anInt132);
			}
			local32.method240(this.anInt157);
			local32.method245(this.aClass12_2.anInt134 + 64, this.aClass12_2.anInt135 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("12296, " + -12617 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}
}
