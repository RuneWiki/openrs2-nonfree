import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QOQPOLAC")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!QOQPOLAC", name = "p", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!QOQPOLAC", name = "x", descriptor = "I")
	public int anInt608;

	@OriginalMember(owner = "client!QOQPOLAC", name = "y", descriptor = "I")
	private int anInt609;

	@OriginalMember(owner = "client!QOQPOLAC", name = "A", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!QOQPOLAC", name = "B", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!QOQPOLAC", name = "C", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!QOQPOLAC", name = "D", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!QOQPOLAC", name = "G", descriptor = "I")
	private int anInt611;

	@OriginalMember(owner = "client!QOQPOLAC", name = "H", descriptor = "I")
	private int anInt612;

	@OriginalMember(owner = "client!QOQPOLAC", name = "J", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!QOQPOLAC", name = "K", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!QOQPOLAC", name = "L", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!QOQPOLAC", name = "s", descriptor = "I")
	private int anInt603 = 1;

	@OriginalMember(owner = "client!QOQPOLAC", name = "E", descriptor = "Z")
	private boolean aBoolean119 = true;

	@OriginalMember(owner = "client!QOQPOLAC", name = "I", descriptor = "I")
	private int anInt613 = -39282;

	@OriginalMember(owner = "client!QOQPOLAC", name = "M", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!QOQPOLAC", name = "z", descriptor = "Lclient!VSBOWDVL;")
	private Class48 aClass48_2;

	@OriginalMember(owner = "client!QOQPOLAC", name = "F", descriptor = "I")
	public int anInt610;

	@OriginalMember(owner = "client!QOQPOLAC", name = "t", descriptor = "I")
	private int anInt604;

	@OriginalMember(owner = "client!QOQPOLAC", name = "u", descriptor = "I")
	private int anInt605;

	@OriginalMember(owner = "client!QOQPOLAC", name = "v", descriptor = "I")
	private int anInt606;

	@OriginalMember(owner = "client!QOQPOLAC", name = "q", descriptor = "I")
	public int anInt601;

	@OriginalMember(owner = "client!QOQPOLAC", name = "r", descriptor = "I")
	public int anInt602;

	@OriginalMember(owner = "client!QOQPOLAC", name = "m", descriptor = "I")
	private int anInt598;

	@OriginalMember(owner = "client!QOQPOLAC", name = "n", descriptor = "I")
	private int anInt599;

	@OriginalMember(owner = "client!QOQPOLAC", name = "o", descriptor = "I")
	public int anInt600;

	@OriginalMember(owner = "client!QOQPOLAC", name = "w", descriptor = "I")
	public int anInt607;

	@OriginalMember(owner = "client!QOQPOLAC", name = "<init>", descriptor = "(IIIIIIIIIZII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass48_2 = Class48.aClass48Array1[arg3];
			this.anInt610 = arg7;
			this.anInt604 = arg11;
			this.anInt605 = arg10;
			this.anInt606 = arg4;
			this.anInt601 = arg2;
			this.anInt602 = arg6;
			this.anInt598 = arg1;
			this.anInt599 = arg0;
			this.anInt600 = arg5;
			this.anInt607 = arg8;
			this.aBoolean120 = false;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("19538, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QOQPOLAC", name = "a", descriptor = "(IIIII)V")
	public void method342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(13) double local13;
			if (!this.aBoolean120) {
				local13 = arg0 - this.anInt604;
				@Pc(19) double local19 = (double) (arg1 - this.anInt605);
				@Pc(28) double local28 = Math.sqrt(local13 * local13 + local19 * local19);
				this.aDouble6 = (double) this.anInt604 + local13 * (double) this.anInt599 / local28;
				this.aDouble7 = (double) this.anInt605 + local19 * (double) this.anInt599 / local28;
				this.aDouble8 = this.anInt606;
			}
			local13 = this.anInt602 + 1 - arg3;
			this.aDouble2 = ((double) arg0 - this.aDouble6) / local13;
			this.aDouble3 = ((double) arg1 - this.aDouble7) / local13;
			this.aDouble4 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble3 * this.aDouble3);
			if (!this.aBoolean120) {
				this.aDouble5 = -this.aDouble4 * Math.tan((double) this.anInt598 * 0.02454369D);
			}
			this.aDouble1 = ((double) arg2 - this.aDouble8 - this.aDouble5 * local13) * 2.0D / (local13 * local13);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("21459, " + arg0 + ", " + arg1 + ", " + 136 + ", " + arg2 + ", " + arg3 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QOQPOLAC", name = "a", descriptor = "(I)Lclient!FUTAQMCE;")
	@Override
	protected Class1_Sub1_Sub1_Sub3 method341() {
		try {
			if (this.anInt613 != -39282) {
				this.aBoolean119 = !this.aBoolean119;
			}
			@Pc(15) Class1_Sub1_Sub1_Sub3 local15 = this.aClass48_2.method481();
			if (local15 == null) {
				return null;
			}
			@Pc(21) int local21 = -1;
			if (this.aClass48_2.aClass16_2 != null) {
				local21 = this.aClass48_2.aClass16_2.anIntArray78[this.anInt611];
			}
			@Pc(44) Class1_Sub1_Sub1_Sub3 local44 = new Class1_Sub1_Sub1_Sub3(local15, false, (byte) 2, true, Class40.method367(local21));
			if (local21 != -1) {
				local44.method189(284);
				local44.method190(local21);
				local44.anIntArrayArray7 = null;
				local44.anIntArrayArray6 = null;
			}
			if (this.aClass48_2.anInt785 != 128 || this.aClass48_2.anInt786 != 128) {
				local44.method198(this.aClass48_2.anInt785, this.aClass48_2.anInt786, this.aClass48_2.anInt785);
			}
			local44.method194(this.anInt609);
			local44.method199(this.aClass48_2.anInt788 + 64, this.aClass48_2.anInt789 + 850, -30, -50, -30, true);
			return local44;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("40497, " + -39282 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QOQPOLAC", name = "a", descriptor = "(IZ)V")
	public void method343(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean120 = true;
			this.aDouble6 += this.aDouble2 * (double) arg0;
			this.aDouble7 += this.aDouble3 * (double) arg0;
			this.aDouble8 += this.aDouble5 * (double) arg0 + this.aDouble1 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble5 += this.aDouble1 * (double) arg0;
			this.anInt608 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
			this.anInt609 = (int) (Math.atan2(this.aDouble5, this.aDouble4) * 325.949D) & 0x7FF;
			if (this.aClass48_2.aClass16_2 != null) {
				this.anInt612 += arg0;
				while (this.anInt612 > this.aClass48_2.aClass16_2.method208(this.anInt611)) {
					this.anInt612 -= this.aClass48_2.aClass16_2.method208(this.anInt611) + 1;
					this.anInt611++;
					if (this.anInt611 >= this.aClass48_2.aClass16_2.anInt333) {
						this.anInt611 = 0;
					}
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("54351, " + arg0 + ", " + true + ", " + local138.toString());
			throw new RuntimeException();
		}
	}
}
