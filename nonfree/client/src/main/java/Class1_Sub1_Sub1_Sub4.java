import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	private int anInt452;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	public int anInt463;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	private int anInt464;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	private int anInt465;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "I")
	private int anInt466;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!pc;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	public int anInt453;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	private int anInt454;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	private int anInt455;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	private int anInt456;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	public int anInt458;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	public int anInt459;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	private int anInt460;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	private int anInt461;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "I")
	public int anInt462;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public int anInt457;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIIIIZIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass33_1 = Class33.aClass33Array1[arg7];
			this.anInt453 = arg6;
			this.anInt454 = arg0;
			this.anInt455 = arg11;
			this.anInt456 = arg9;
			this.anInt458 = arg5;
			this.anInt459 = arg3;
			this.anInt460 = arg4;
			this.anInt461 = arg1;
			this.anInt462 = arg10;
			this.anInt457 = arg2;
			this.aBoolean106 = false;
			if (!arg8) {
				this.aBoolean105 = !this.aBoolean105;
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("79962, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIBI)V")
	public void method240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean106) {
				local8 = arg2 - this.anInt454;
				@Pc(14) double local14 = (double) (arg3 - this.anInt455);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt454 + local8 * (double) this.anInt461 / local23;
				this.aDouble2 = (double) this.anInt455 + local14 * (double) this.anInt461 / local23;
				this.aDouble3 = this.anInt456;
			}
			local8 = this.anInt459 + 1 - arg0;
			this.aDouble4 = ((double) arg2 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg3 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean106) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt460 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg1 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("10750, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7 + ", " + arg3 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V")
	public void method241(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean106 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt463 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt464 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass33_1.aClass27_2 != null) {
				this.anInt466 += arg0;
				while (this.anInt466 > this.aClass33_1.aClass27_2.method499(this.anInt465)) {
					this.anInt466 -= this.aClass33_1.aClass27_2.method499(this.anInt465) + 1;
					this.anInt465++;
					if (this.anInt465 >= this.aClass33_1.aClass27_2.anInt795) {
						this.anInt465 = 0;
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("57395, " + arg0 + ", " + true + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method670() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass33_1.method516();
			if (local3 == null) {
				return null;
			}
			@Pc(14) int local14 = -1;
			if (this.aClass33_1.aClass27_2 != null) {
				local14 = this.aClass33_1.aClass27_2.anIntArray222[this.anInt465];
			}
			@Pc(37) Class1_Sub1_Sub1_Sub5 local37 = new Class1_Sub1_Sub1_Sub5(true, Class12.method304(local14), local3, true, false);
			if (local14 != -1) {
				local37.method267();
				local37.method268(local14);
				local37.anIntArrayArray9 = null;
				local37.anIntArrayArray8 = null;
			}
			if (this.aClass33_1.anInt829 != 128 || this.aClass33_1.anInt830 != 128) {
				local37.method276(this.aClass33_1.anInt829, this.aClass33_1.anInt829, this.aClass33_1.anInt830);
			}
			local37.method272(this.anInt464);
			local37.method277(this.aClass33_1.anInt832 + 64, this.aClass33_1.anInt833 + 850, -30, -50, -30, true);
			return local37;
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("48491, " + false + ", " + local99.toString());
			throw new RuntimeException();
		}
	}
}
