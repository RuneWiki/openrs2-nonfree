import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "o", descriptor = "I")
	private int anInt452;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!db", name = "M", descriptor = "I")
	public int anInt465;

	@OriginalMember(owner = "client!db", name = "N", descriptor = "I")
	private int anInt466;

	@OriginalMember(owner = "client!db", name = "O", descriptor = "I")
	private int anInt467;

	@OriginalMember(owner = "client!db", name = "P", descriptor = "I")
	private int anInt468;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	private int anInt453 = 26961;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "Z")
	private boolean aBoolean113 = true;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	private int anInt454 = 4;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "Lclient!pc;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public int anInt455;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	private int anInt456;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	private int anInt457;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	private int anInt458;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "I")
	public int anInt460;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "I")
	public int anInt461;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "I")
	private int anInt462;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "I")
	private int anInt463;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "I")
	public int anInt464;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	public int anInt459;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass33_1 = Class33.aClass33Array1[arg10];
			this.anInt455 = arg11;
			this.anInt456 = arg6;
			this.anInt457 = arg2;
			this.anInt458 = arg4;
			this.anInt460 = arg0;
			this.anInt461 = arg7;
			this.anInt462 = arg1;
			this.anInt463 = arg5;
			this.anInt464 = arg8;
			this.anInt459 = arg3;
			this.aBoolean114 = false;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("40422, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
	public void method240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(10) double local10;
			if (!this.aBoolean114) {
				local10 = arg1 - this.anInt456;
				@Pc(16) double local16 = (double) (arg0 - this.anInt457);
				@Pc(25) double local25 = Math.sqrt(local10 * local10 + local16 * local16);
				this.aDouble1 = (double) this.anInt456 + local10 * (double) this.anInt463 / local25;
				this.aDouble2 = (double) this.anInt457 + local16 * (double) this.anInt463 / local25;
				this.aDouble3 = this.anInt458;
			}
			local10 = this.anInt461 + 1 - arg3;
			this.aDouble4 = ((double) arg1 - this.aDouble1) / local10;
			this.aDouble5 = ((double) arg0 - this.aDouble2) / local10;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean114) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt462 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg2 - this.aDouble3 - this.aDouble7 * local10) * 2.0D / (local10 * local10);
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("36922, " + arg0 + ", " + arg1 + ", " + -630 + ", " + arg2 + ", " + arg3 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	public void method241(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt454 <= 4 && this.anInt454 >= 4) {
				this.aBoolean114 = true;
				this.aDouble1 += this.aDouble4 * (double) arg0;
				this.aDouble2 += this.aDouble5 * (double) arg0;
				this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
				this.aDouble7 += this.aDouble8 * (double) arg0;
				this.anInt465 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
				this.anInt466 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
				if (this.aClass33_1.aClass27_2 != null) {
					this.anInt468 += arg0;
					while (this.anInt468 > this.aClass33_1.aClass27_2.method500(this.anInt467)) {
						this.anInt468 -= this.aClass33_1.aClass27_2.method500(this.anInt467) + 1;
						this.anInt467++;
						if (this.anInt467 >= this.aClass33_1.aClass27_2.anInt793) {
							this.anInt467 = 0;
						}
					}
				}
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("49994, " + 4 + ", " + arg0 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method671() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass33_1.method517();
			if (local3 == null) {
				return null;
			}
			@Pc(18) int local18 = -1;
			if (this.aClass33_1.aClass27_2 != null) {
				local18 = this.aClass33_1.aClass27_2.anIntArray222[this.anInt467];
			}
			@Pc(42) Class1_Sub1_Sub1_Sub5 local42 = new Class1_Sub1_Sub1_Sub5(9, false, Class12.method304(this.anInt452, local18), true, local3);
			if (local18 != -1) {
				local42.method267();
				local42.method268(local18);
				local42.anIntArrayArray9 = null;
				local42.anIntArrayArray8 = null;
			}
			if (this.aClass33_1.anInt831 != 128 || this.aClass33_1.anInt832 != 128) {
				local42.method276(this.aClass33_1.anInt831, this.aClass33_1.anInt831, this.aClass33_1.anInt832);
			}
			local42.method272(this.anInt453, this.anInt466);
			local42.method277(this.aClass33_1.anInt834 + 64, this.aClass33_1.anInt835 + 850, -30, -50, -30, true);
			return local42;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("15670, " + true + ", " + local105.toString());
			throw new RuntimeException();
		}
	}
}
