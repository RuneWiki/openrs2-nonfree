import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "z", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	public int anInt447;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	private int anInt448;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	private int anInt449;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	private int anInt450;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	private int anInt436 = 100;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!pc;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "I")
	public int anInt437;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	private int anInt438;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	private int anInt439;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	private int anInt440;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public int anInt442;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	public int anInt443;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	public int anInt446;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass33_1 = Class33.aClass33Array1[arg6];
			this.anInt437 = arg10;
			this.anInt438 = arg11;
			this.anInt439 = arg0;
			this.anInt440 = arg4;
			this.anInt442 = arg9;
			this.anInt443 = arg5;
			this.anInt444 = arg1;
			this.anInt445 = arg7;
			if (arg8 != 0) {
				this.aBoolean113 = !this.aBoolean113;
			}
			this.anInt446 = arg3;
			this.anInt441 = arg2;
			this.aBoolean114 = false;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("67913, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
	public void method239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean114) {
				local8 = arg3 - this.anInt438;
				@Pc(14) double local14 = (double) (arg2 - this.anInt439);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt438 + local8 * (double) this.anInt445 / local23;
				this.aDouble2 = (double) this.anInt439 + local14 * (double) this.anInt445 / local23;
				this.aDouble3 = this.anInt440;
			}
			local8 = this.anInt443 + 1 - arg1;
			this.aDouble4 = ((double) arg3 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg2 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean114) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt444 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg0 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("56429, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -126 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	public void method240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean114 = true;
			if (arg0 <= 0) {
				this.aBoolean113 = !this.aBoolean113;
			}
			this.aDouble1 += this.aDouble4 * (double) arg1;
			this.aDouble2 += this.aDouble5 * (double) arg1;
			this.aDouble3 += this.aDouble7 * (double) arg1 + this.aDouble8 * 0.5D * (double) arg1 * (double) arg1;
			this.aDouble7 += this.aDouble8 * (double) arg1;
			this.anInt447 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt448 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass33_1.aClass27_2 != null) {
				this.anInt450 += arg1;
				while (this.anInt450 > this.aClass33_1.aClass27_2.method498(this.anInt449)) {
					this.anInt450 -= this.aClass33_1.aClass27_2.method498(this.anInt449) + 1;
					this.anInt449++;
					if (this.anInt449 >= this.aClass33_1.aClass27_2.anInt768) {
						this.anInt449 = 0;
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("64939, " + arg0 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method669() {
		try {
			@Pc(12) Class1_Sub1_Sub1_Sub5 local12 = this.aClass33_1.method515();
			if (local12 == null) {
				return null;
			}
			@Pc(18) int local18 = -1;
			if (this.aClass33_1.aClass27_2 != null) {
				local18 = this.aClass33_1.aClass27_2.anIntArray222[this.anInt449];
			}
			@Pc(41) Class1_Sub1_Sub1_Sub5 local41 = new Class1_Sub1_Sub1_Sub5(false, true, local12, Class12.method303(local18, 681), 9);
			if (local18 != -1) {
				local41.method266();
				local41.method267(local18);
				local41.anIntArrayArray9 = null;
				local41.anIntArrayArray8 = null;
			}
			if (this.aClass33_1.anInt804 != 128 || this.aClass33_1.anInt805 != 128) {
				local41.method275(this.aClass33_1.anInt804, this.aClass33_1.anInt805, this.aClass33_1.anInt804);
			}
			local41.method271(this.anInt448);
			local41.method276(this.aClass33_1.anInt807 + 64, this.aClass33_1.anInt808 + 850, -30, -50, -30, true);
			return local41;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("81259, " + 0 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}
}
