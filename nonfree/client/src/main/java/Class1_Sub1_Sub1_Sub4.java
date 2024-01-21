import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "B", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	public int anInt474;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	private int anInt475;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "I")
	private int anInt476;

	@OriginalMember(owner = "client!db", name = "M", descriptor = "I")
	private int anInt477;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Z")
	private boolean aBoolean111 = true;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	private int anInt463 = -917;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Z")
	private boolean aBoolean112 = true;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "Lclient!pc;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	public int anInt464;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	private int anInt465;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	private int anInt466;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	private int anInt467;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	public int anInt469;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	public int anInt470;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "I")
	private int anInt472;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "I")
	public int anInt473;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	public int anInt468;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIBIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass33_1 = Class33.aClass33Array1[arg3];
			this.anInt464 = arg8;
			this.anInt465 = arg6;
			this.anInt466 = arg10;
			this.anInt467 = arg1;
			this.anInt469 = arg2;
			this.anInt470 = arg0;
			this.anInt471 = arg9;
			this.anInt472 = arg11;
			this.anInt473 = arg4;
			@Pc(49) boolean local49 = false;
			this.anInt468 = arg7;
			this.aBoolean113 = false;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("93881, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
	public void method241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean113) {
				local8 = arg2 - this.anInt465;
				@Pc(14) double local14 = (double) (arg1 - this.anInt466);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt465 + local8 * (double) this.anInt472 / local23;
				this.aDouble2 = (double) this.anInt466 + local14 * (double) this.anInt472 / local23;
				this.aDouble3 = this.anInt467;
			}
			local8 = this.anInt470 + 1 - arg3;
			this.aDouble4 = ((double) arg2 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg1 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean113) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt471 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg0 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("52691, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)V")
	public void method242(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean113 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt474 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt475 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass33_1.aClass27_2 != null) {
				this.anInt477 += arg0;
				while (this.anInt477 > this.aClass33_1.aClass27_2.method506(this.anInt476, this.aBoolean112)) {
					this.anInt477 -= this.aClass33_1.aClass27_2.method506(this.anInt476, this.aBoolean112) + 1;
					this.anInt476++;
					if (this.anInt476 >= this.aClass33_1.aClass27_2.anInt814) {
						this.anInt476 = 0;
					}
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("75706, " + false + ", " + arg0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(9) Class1_Sub1_Sub1_Sub5 local9 = this.aClass33_1.method523();
			if (local9 == null) {
				return null;
			}
			@Pc(15) int local15 = -1;
			if (this.aClass33_1.aClass27_2 != null) {
				local15 = this.aClass33_1.aClass27_2.anIntArray225[this.anInt476];
			}
			@Pc(39) Class1_Sub1_Sub1_Sub5 local39 = new Class1_Sub1_Sub1_Sub5(false, -16051, local9, Class12.method306(local15, this.aBoolean111), true);
			if (local15 != -1) {
				local39.method268();
				local39.method269(local15);
				local39.anIntArrayArray9 = null;
				local39.anIntArrayArray8 = null;
			}
			if (this.aClass33_1.anInt847 != 128 || this.aClass33_1.anInt848 != 128) {
				local39.method277(this.aClass33_1.anInt847, this.aClass33_1.anInt847, this.aClass33_1.anInt848);
			}
			local39.method273(this.anInt475);
			local39.method278(this.aClass33_1.anInt850 + 64, this.aClass33_1.anInt851 + 850, -30, -50, -30, true);
			return local39;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("85444, " + -47094 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}
}
