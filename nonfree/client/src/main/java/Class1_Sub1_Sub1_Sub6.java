import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SOQRIJPC")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!SOQRIJPC", name = "l", descriptor = "I")
	public int anInt707;

	@OriginalMember(owner = "client!SOQRIJPC", name = "m", descriptor = "I")
	private int anInt708;

	@OriginalMember(owner = "client!SOQRIJPC", name = "n", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!SOQRIJPC", name = "o", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!SOQRIJPC", name = "p", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!SOQRIJPC", name = "q", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!SOQRIJPC", name = "r", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!SOQRIJPC", name = "s", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!SOQRIJPC", name = "t", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!SOQRIJPC", name = "v", descriptor = "I")
	private int anInt710;

	@OriginalMember(owner = "client!SOQRIJPC", name = "w", descriptor = "I")
	private int anInt711;

	@OriginalMember(owner = "client!SOQRIJPC", name = "G", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!SOQRIJPC", name = "z", descriptor = "Z")
	private boolean aBoolean154 = true;

	@OriginalMember(owner = "client!SOQRIJPC", name = "E", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!SOQRIJPC", name = "F", descriptor = "Z")
	private boolean aBoolean156 = true;

	@OriginalMember(owner = "client!SOQRIJPC", name = "A", descriptor = "Lclient!MBSSGBHW;")
	private Class25 aClass25_2;

	@OriginalMember(owner = "client!SOQRIJPC", name = "u", descriptor = "I")
	public int anInt709;

	@OriginalMember(owner = "client!SOQRIJPC", name = "H", descriptor = "I")
	private int anInt717;

	@OriginalMember(owner = "client!SOQRIJPC", name = "I", descriptor = "I")
	private int anInt718;

	@OriginalMember(owner = "client!SOQRIJPC", name = "J", descriptor = "I")
	private int anInt719;

	@OriginalMember(owner = "client!SOQRIJPC", name = "x", descriptor = "I")
	public int anInt712;

	@OriginalMember(owner = "client!SOQRIJPC", name = "y", descriptor = "I")
	public int anInt713;

	@OriginalMember(owner = "client!SOQRIJPC", name = "B", descriptor = "I")
	private int anInt714;

	@OriginalMember(owner = "client!SOQRIJPC", name = "C", descriptor = "I")
	private int anInt715;

	@OriginalMember(owner = "client!SOQRIJPC", name = "D", descriptor = "I")
	public int anInt716;

	@OriginalMember(owner = "client!SOQRIJPC", name = "K", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!SOQRIJPC", name = "<init>", descriptor = "(IIIIIIIIIIBI)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass25_2 = Class25.aClass25Array1[arg2];
			this.anInt709 = arg1;
			this.anInt717 = arg11;
			this.anInt718 = arg8;
			this.anInt719 = arg4;
			@Pc(32) boolean local32 = false;
			this.anInt712 = arg9;
			this.anInt713 = arg3;
			this.anInt714 = arg6;
			this.anInt715 = arg7;
			this.anInt716 = arg5;
			this.anInt720 = arg0;
			this.aBoolean155 = false;
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("16872, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SOQRIJPC", name = "a", descriptor = "(IZ)V")
	public void method498(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aBoolean155 = true;
			this.aDouble5 += this.aDouble1 * (double) arg0;
			this.aDouble6 += this.aDouble2 * (double) arg0;
			this.aDouble7 += this.aDouble4 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			if (arg1) {
				this.aBoolean156 = !this.aBoolean156;
			}
			this.aDouble4 += this.aDouble8 * (double) arg0;
			this.anInt707 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
			this.anInt708 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
			if (this.aClass25_2.aClass19_1 != null) {
				this.anInt711 += arg0;
				while (this.anInt711 > this.aClass25_2.aClass19_1.method243(this.anInt710)) {
					this.anInt711 -= this.aClass25_2.aClass19_1.method243(this.anInt710) + 1;
					this.anInt710++;
					if (this.anInt710 >= this.aClass25_2.aClass19_1.anInt411) {
						this.anInt710 = 0;
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("9134, " + arg0 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SOQRIJPC", name = "a", descriptor = "(B)Lclient!PDVZPZLT;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method497(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub4 local3 = this.aClass25_2.method278();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass25_2.aClass19_1 != null) {
				local9 = this.aClass25_2.aClass19_1.anIntArray82[this.anInt710];
			}
			@Pc(32) Class1_Sub1_Sub1_Sub4 local32 = new Class1_Sub1_Sub1_Sub4(local3, true, Class49.method573(local9), 0, false);
			if (local9 != -1) {
				local32.method370();
				local32.method371(local9);
				local32.anIntArrayArray12 = null;
				local32.anIntArrayArray11 = null;
			}
			if (this.aClass25_2.anInt473 != 128 || this.aClass25_2.anInt474 != 128) {
				local32.method379(this.aClass25_2.anInt473, this.aClass25_2.anInt474, this.aClass25_2.anInt473);
			}
			local32.method375((byte) 5, this.anInt708);
			local32.method380(this.aClass25_2.anInt476 + 64, this.aClass25_2.anInt477 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("6999, " + 6 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SOQRIJPC", name = "a", descriptor = "(IIZII)V")
	public void method499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean155) {
				local8 = arg0 - this.anInt717;
				@Pc(14) double local14 = (double) (arg3 - this.anInt718);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble5 = (double) this.anInt717 + local8 * (double) this.anInt715 / local23;
				this.aDouble6 = (double) this.anInt718 + local14 * (double) this.anInt715 / local23;
				this.aDouble7 = this.anInt719;
			}
			local8 = this.anInt713 + 1 - arg1;
			this.aDouble1 = ((double) arg0 - this.aDouble5) / local8;
			this.aDouble2 = ((double) arg3 - this.aDouble6) / local8;
			this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
			if (!this.aBoolean155) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt714 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg2 - this.aDouble7 - this.aDouble4 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("52582, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}
}
