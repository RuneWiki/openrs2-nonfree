import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OXJUGPEO")
public final class Class4_Sub1_Sub1_Sub5 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!OXJUGPEO", name = "l", descriptor = "I")
	private int anInt537;

	@OriginalMember(owner = "client!OXJUGPEO", name = "m", descriptor = "I")
	private int anInt538;

	@OriginalMember(owner = "client!OXJUGPEO", name = "o", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!OXJUGPEO", name = "p", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!OXJUGPEO", name = "q", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!OXJUGPEO", name = "y", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!OXJUGPEO", name = "D", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!OXJUGPEO", name = "E", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!OXJUGPEO", name = "F", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!OXJUGPEO", name = "G", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!OXJUGPEO", name = "H", descriptor = "I")
	public int anInt548;

	@OriginalMember(owner = "client!OXJUGPEO", name = "I", descriptor = "I")
	private int anInt549;

	@OriginalMember(owner = "client!OXJUGPEO", name = "r", descriptor = "B")
	private byte aByte19 = 9;

	@OriginalMember(owner = "client!OXJUGPEO", name = "s", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!OXJUGPEO", name = "t", descriptor = "I")
	private int anInt539 = 5131;

	@OriginalMember(owner = "client!OXJUGPEO", name = "n", descriptor = "Lclient!VCTVXSNH;")
	private Class42 aClass42_2;

	@OriginalMember(owner = "client!OXJUGPEO", name = "C", descriptor = "I")
	public int anInt547;

	@OriginalMember(owner = "client!OXJUGPEO", name = "u", descriptor = "I")
	private int anInt540;

	@OriginalMember(owner = "client!OXJUGPEO", name = "v", descriptor = "I")
	private int anInt541;

	@OriginalMember(owner = "client!OXJUGPEO", name = "w", descriptor = "I")
	private int anInt542;

	@OriginalMember(owner = "client!OXJUGPEO", name = "J", descriptor = "I")
	public int anInt550;

	@OriginalMember(owner = "client!OXJUGPEO", name = "K", descriptor = "I")
	public int anInt551;

	@OriginalMember(owner = "client!OXJUGPEO", name = "z", descriptor = "I")
	private int anInt544;

	@OriginalMember(owner = "client!OXJUGPEO", name = "A", descriptor = "I")
	private int anInt545;

	@OriginalMember(owner = "client!OXJUGPEO", name = "B", descriptor = "I")
	public int anInt546;

	@OriginalMember(owner = "client!OXJUGPEO", name = "x", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!OXJUGPEO", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class4_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass42_2 = Class42.aClass42Array1[arg8];
			this.anInt547 = arg1;
			this.anInt540 = arg5;
			this.anInt541 = arg2;
			this.anInt542 = arg6;
			this.anInt550 = arg0;
			this.anInt551 = arg9;
			this.anInt544 = arg7;
			this.anInt545 = arg3;
			this.anInt546 = arg4;
			this.anInt543 = arg10;
			this.aBoolean155 = false;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("85291, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXJUGPEO", name = "a", descriptor = "(I)Lclient!IGXVZOHI;")
	@Override
	protected Class4_Sub1_Sub1_Sub3 method531() {
		try {
			@Pc(3) Class4_Sub1_Sub1_Sub3 local3 = this.aClass42_2.method527();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass42_2.aClass5_1 != null) {
				local9 = this.aClass42_2.aClass5_1.anIntArray7[this.anInt537];
			}
			@Pc(33) Class4_Sub1_Sub1_Sub3 local33 = new Class4_Sub1_Sub1_Sub3(true, local3, false, Class22.method274(local9, this.anInt539), (byte) 1);
			if (local9 != -1) {
				local33.method290();
				local33.method291(local9);
				local33.anIntArrayArray5 = null;
				local33.anIntArrayArray4 = null;
			}
			if (this.aClass42_2.anInt751 != 128 || this.aClass42_2.anInt752 != 128) {
				local33.method299(this.aClass42_2.anInt751, this.aClass42_2.anInt752, this.aClass42_2.anInt751);
			}
			local33.method295(this.anInt549);
			local33.method300(this.aClass42_2.anInt754 + 64, this.aClass42_2.anInt755 + 850, -30, -50, -30, true);
			return local33;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("18139, " + 47492 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXJUGPEO", name = "a", descriptor = "(IIIII)V")
	public void method432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean155) {
				local8 = arg1 - this.anInt540;
				@Pc(14) double local14 = (double) (arg2 - this.anInt541);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt540 + local8 * (double) this.anInt545 / local23;
				this.aDouble2 = (double) this.anInt541 + local14 * (double) this.anInt545 / local23;
				this.aDouble3 = this.anInt542;
			}
			local8 = this.anInt551 + 1 - arg0;
			this.aDouble5 = ((double) arg1 - this.aDouble1) / local8;
			this.aDouble6 = ((double) arg2 - this.aDouble2) / local8;
			this.aDouble7 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble6 * this.aDouble6);
			if (!this.aBoolean155) {
				this.aDouble8 = -this.aDouble7 * Math.tan((double) this.anInt544 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg3 - this.aDouble3 - this.aDouble8 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("80670, " + arg0 + ", " + arg1 + ", " + -41536 + ", " + arg2 + ", " + arg3 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OXJUGPEO", name = "a", descriptor = "(IB)V")
	public void method433(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aBoolean155 = true;
			this.aDouble1 += this.aDouble5 * (double) arg0;
			this.aDouble2 += this.aDouble6 * (double) arg0;
			if (arg1 == this.aByte19) {
				@Pc(30) boolean local30 = false;
				this.aDouble3 += this.aDouble8 * (double) arg0 + this.aDouble4 * 0.5D * (double) arg0 * (double) arg0;
				this.aDouble8 += this.aDouble4 * (double) arg0;
				this.anInt548 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
				this.anInt549 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) & 0x7FF;
				if (this.aClass42_2.aClass5_1 != null) {
					this.anInt538 += arg0;
					while (this.anInt538 > this.aClass42_2.aClass5_1.method32(this.anInt537)) {
						this.anInt538 -= this.aClass42_2.aClass5_1.method32(this.anInt537) + 1;
						this.anInt537++;
						if (this.anInt537 >= this.aClass42_2.aClass5_1.anInt39) {
							this.anInt537 = 0;
						}
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("54944, " + arg0 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}
}
