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
	public int anInt444;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	private int anInt445;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	private int anInt446;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	private int anInt447;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "B")
	private byte aByte11 = 7;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Z")
	private boolean aBoolean110 = true;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!pc;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "I")
	public int anInt434;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	private int anInt435;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	private int anInt436;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public int anInt439;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	public int anInt440;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	private int anInt441;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	private int anInt442;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	public int anInt443;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	public int anInt438;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass33_1 = Class33.aClass33Array1[arg6];
			this.anInt434 = arg10;
			this.anInt435 = arg0;
			this.anInt436 = arg3;
			this.anInt437 = arg2;
			this.anInt439 = arg9;
			this.anInt440 = arg7;
			this.anInt441 = arg11;
			this.anInt442 = arg8;
			this.anInt443 = arg1;
			this.anInt438 = arg5;
			this.aBoolean111 = false;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("75262, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIB)V")
	public void method241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean111) {
				local8 = arg3 - this.anInt435;
				@Pc(14) double local14 = (double) (arg2 - this.anInt436);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt435 + local8 * (double) this.anInt442 / local23;
				this.aDouble2 = (double) this.anInt436 + local14 * (double) this.anInt442 / local23;
				this.aDouble3 = this.anInt437;
			}
			local8 = this.anInt440 + 1 - arg0;
			this.aDouble4 = ((double) arg3 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg2 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean111) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt441 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg1 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("4382, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 105 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)V")
	public void method242(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean111 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt444 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt445 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass33_1.aClass27_2 != null) {
				this.anInt447 += arg0;
				while (this.anInt447 > this.aClass33_1.aClass27_2.method506(this.anInt446)) {
					this.anInt447 -= this.aClass33_1.aClass27_2.method506(this.anInt446) + 1;
					this.anInt446++;
					if (this.anInt446 >= this.aClass33_1.aClass27_2.anInt771) {
						this.anInt446 = 0;
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("51779, " + true + ", " + arg0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass33_1.method523();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass33_1.aClass27_2 != null) {
				local9 = this.aClass33_1.aClass27_2.anIntArray225[this.anInt446];
			}
			@Pc(38) Class1_Sub1_Sub1_Sub5 local38 = new Class1_Sub1_Sub1_Sub5(false, 201, local3, Class12.method306(local9), true);
			if (local9 != -1) {
				local38.method268();
				local38.method269(local9);
				local38.anIntArrayArray9 = null;
				local38.anIntArrayArray8 = null;
			}
			if (this.aClass33_1.anInt806 != 128 || this.aClass33_1.anInt807 != 128) {
				local38.method277(this.aClass33_1.anInt806, this.aClass33_1.anInt807, this.aClass33_1.anInt806);
			}
			local38.method273(this.anInt445, this.aByte11);
			local38.method278(this.aClass33_1.anInt809 + 64, this.aClass33_1.anInt810 + 850, -30, -50, -30, true);
			return local38;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("42058, " + true + ", " + local101.toString());
			throw new RuntimeException();
		}
	}
}
