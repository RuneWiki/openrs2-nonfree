import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WNPAFFHH")
public final class Class3_Sub1_Sub1_Sub6 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!WNPAFFHH", name = "p", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!WNPAFFHH", name = "q", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!WNPAFFHH", name = "r", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!WNPAFFHH", name = "s", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!WNPAFFHH", name = "u", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!WNPAFFHH", name = "v", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!WNPAFFHH", name = "w", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!WNPAFFHH", name = "y", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!WNPAFFHH", name = "z", descriptor = "I")
	public int anInt678;

	@OriginalMember(owner = "client!WNPAFFHH", name = "A", descriptor = "I")
	private int anInt679;

	@OriginalMember(owner = "client!WNPAFFHH", name = "C", descriptor = "I")
	private int anInt680;

	@OriginalMember(owner = "client!WNPAFFHH", name = "D", descriptor = "I")
	private int anInt681;

	@OriginalMember(owner = "client!WNPAFFHH", name = "x", descriptor = "Z")
	private boolean aBoolean162 = true;

	@OriginalMember(owner = "client!WNPAFFHH", name = "B", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!WNPAFFHH", name = "J", descriptor = "Z")
	private boolean aBoolean164 = true;

	@OriginalMember(owner = "client!WNPAFFHH", name = "t", descriptor = "Lclient!TYXORIIC;")
	private Class39 aClass39_2;

	@OriginalMember(owner = "client!WNPAFFHH", name = "o", descriptor = "I")
	public int anInt677;

	@OriginalMember(owner = "client!WNPAFFHH", name = "k", descriptor = "I")
	private int anInt673;

	@OriginalMember(owner = "client!WNPAFFHH", name = "l", descriptor = "I")
	private int anInt674;

	@OriginalMember(owner = "client!WNPAFFHH", name = "m", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!WNPAFFHH", name = "H", descriptor = "I")
	public int anInt685;

	@OriginalMember(owner = "client!WNPAFFHH", name = "I", descriptor = "I")
	public int anInt686;

	@OriginalMember(owner = "client!WNPAFFHH", name = "E", descriptor = "I")
	private int anInt682;

	@OriginalMember(owner = "client!WNPAFFHH", name = "F", descriptor = "I")
	private int anInt683;

	@OriginalMember(owner = "client!WNPAFFHH", name = "G", descriptor = "I")
	public int anInt684;

	@OriginalMember(owner = "client!WNPAFFHH", name = "n", descriptor = "I")
	public int anInt676;

	@OriginalMember(owner = "client!WNPAFFHH", name = "<init>", descriptor = "(IIIIIIIBIIII)V")
	public Class3_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass39_2 = Class39.aClass39Array1[arg10];
			this.anInt677 = arg0;
			this.anInt673 = arg4;
			this.anInt674 = arg2;
			this.anInt675 = arg5;
			this.anInt685 = arg8;
			this.anInt686 = arg9;
			this.anInt682 = arg6;
			this.anInt683 = arg3;
			this.anInt684 = arg11;
			this.anInt676 = arg1;
			this.aBoolean163 = false;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("91484, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNPAFFHH", name = "a", descriptor = "(II)V")
	public void method500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean163 = true;
			this.aDouble5 += this.aDouble1 * (double) arg0;
			this.aDouble6 += this.aDouble2 * (double) arg0;
			this.aDouble7 += this.aDouble4 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			if (arg1 < 0 || arg1 > 0) {
				this.aBoolean164 = !this.aBoolean164;
			}
			this.aDouble4 += this.aDouble8 * (double) arg0;
			this.anInt678 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
			this.anInt679 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
			if (this.aClass39_2.aClass30_2 != null) {
				this.anInt681 += arg0;
				while (this.anInt681 > this.aClass39_2.aClass30_2.method308(this.anInt680)) {
					this.anInt681 -= this.aClass39_2.aClass30_2.method308(this.anInt680);
					this.anInt680++;
					if (this.anInt680 >= this.aClass39_2.aClass30_2.anInt386) {
						this.anInt680 = 0;
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("81541, " + arg0 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNPAFFHH", name = "a", descriptor = "(IIIBI)V")
	public void method501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(12) double local12;
			if (!this.aBoolean163) {
				local12 = arg1 - this.anInt673;
				@Pc(18) double local18 = (double) (arg0 - this.anInt674);
				@Pc(27) double local27 = Math.sqrt(local12 * local12 + local18 * local18);
				this.aDouble5 = (double) this.anInt673 + local12 * (double) this.anInt683 / local27;
				this.aDouble6 = (double) this.anInt674 + local18 * (double) this.anInt683 / local27;
				this.aDouble7 = this.anInt675;
			}
			local12 = this.anInt686 + 1 - arg3;
			this.aDouble1 = ((double) arg1 - this.aDouble5) / local12;
			this.aDouble2 = ((double) arg0 - this.aDouble6) / local12;
			this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
			if (!this.aBoolean163) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt682 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg2 - this.aDouble7 - this.aDouble4 * local12) * 2.0D / (local12 * local12);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("60232, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 8 + ", " + arg3 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNPAFFHH", name = "a", descriptor = "(B)Lclient!UNLYQRUD;")
	@Override
	protected Class3_Sub1_Sub1_Sub5 method505() {
		try {
			@Pc(14) Class3_Sub1_Sub1_Sub5 local14 = this.aClass39_2.method377();
			if (local14 == null) {
				return null;
			}
			@Pc(20) int local20 = -1;
			if (this.aClass39_2.aClass30_2 != null) {
				local20 = this.aClass39_2.aClass30_2.anIntArray90[this.anInt680];
			}
			@Pc(43) Class3_Sub1_Sub1_Sub5 local43 = new Class3_Sub1_Sub1_Sub5(true, local14, false, 8, Class5.method64(local20));
			if (local20 != -1) {
				local43.method403(956);
				local43.method404(936, local20);
				local43.anIntArrayArray15 = null;
				local43.anIntArrayArray14 = null;
			}
			if (this.aClass39_2.anInt559 != 128 || this.aClass39_2.anInt560 != 128) {
				local43.method412(this.aClass39_2.anInt559, this.aClass39_2.anInt560, this.aClass39_2.anInt559);
			}
			local43.method408(this.anInt679);
			local43.method413(this.aClass39_2.anInt562 + 64, this.aClass39_2.anInt563 + 850, -30, -50, -30, true);
			return local43;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("59574, " + 93 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}
}
