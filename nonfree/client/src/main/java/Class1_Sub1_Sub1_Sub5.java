import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LQMHWDJZ")
public final class Class1_Sub1_Sub1_Sub5 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!LQMHWDJZ", name = "n", descriptor = "I")
	private int anInt483;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "o", descriptor = "I")
	private int anInt484;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "x", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "y", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "z", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "A", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "B", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "C", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "D", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "F", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "J", descriptor = "I")
	public int anInt492;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "K", descriptor = "I")
	private int anInt493;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "q", descriptor = "Z")
	private boolean aBoolean135 = false;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "E", descriptor = "I")
	private int anInt491 = -22136;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "G", descriptor = "B")
	private byte aByte24 = -15;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "H", descriptor = "Z")
	private boolean aBoolean136 = false;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "I", descriptor = "Z")
	private boolean aBoolean137 = false;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "p", descriptor = "Lclient!UIVLSYQW;")
	private Class38 aClass38_2;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "m", descriptor = "I")
	public int anInt482;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "t", descriptor = "I")
	private int anInt487;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "u", descriptor = "I")
	private int anInt488;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "v", descriptor = "I")
	private int anInt489;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "r", descriptor = "I")
	public int anInt485;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "s", descriptor = "I")
	public int anInt486;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "L", descriptor = "I")
	private int anInt494;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "M", descriptor = "I")
	private int anInt495;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "N", descriptor = "I")
	public int anInt496;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "w", descriptor = "I")
	public int anInt490;

	@OriginalMember(owner = "client!LQMHWDJZ", name = "<init>", descriptor = "(IIZIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass38_2 = Class38.aClass38Array1[arg0];
			this.anInt482 = arg1;
			this.anInt487 = arg8;
			this.anInt488 = arg9;
			this.anInt489 = arg3;
			this.anInt485 = arg6;
			this.anInt486 = arg7;
			this.anInt494 = arg11;
			this.anInt495 = arg10;
			this.anInt496 = arg4;
			this.anInt490 = arg5;
			this.aBoolean135 = false;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("42401, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQMHWDJZ", name = "a", descriptor = "(IIIIB)V")
	public void method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean135) {
				local8 = arg2 - this.anInt487;
				@Pc(14) double local14 = (double) (arg0 - this.anInt488);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble5 = (double) this.anInt487 + local8 * (double) this.anInt495 / local23;
				this.aDouble6 = (double) this.anInt488 + local14 * (double) this.anInt495 / local23;
				this.aDouble7 = this.anInt489;
			}
			local8 = this.anInt486 + 1 - arg3;
			this.aDouble1 = ((double) arg2 - this.aDouble5) / local8;
			this.aDouble2 = ((double) arg0 - this.aDouble6) / local8;
			if (arg4 != this.aByte24) {
				for (@Pc(86) int local86 = 1; local86 > 0; local86++) {
				}
			}
			this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
			if (!this.aBoolean135) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt494 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg1 - this.aDouble7 - this.aDouble4 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("42645, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQMHWDJZ", name = "a", descriptor = "(ZI)V")
	public void method434(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean135 = true;
			this.aDouble5 += this.aDouble1 * (double) arg0;
			this.aDouble6 += this.aDouble2 * (double) arg0;
			this.aDouble7 += this.aDouble4 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble4 += this.aDouble8 * (double) arg0;
			this.anInt492 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
			this.anInt493 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
			if (this.aClass38_2.aClass46_2 != null) {
				this.anInt484 += arg0;
				while (this.anInt484 > this.aClass38_2.aClass46_2.method542(this.anInt483, (byte) 2)) {
					this.anInt484 -= this.aClass38_2.aClass46_2.method542(this.anInt483, (byte) 2) + 1;
					this.anInt483++;
					if (this.anInt483 >= this.aClass38_2.aClass46_2.anInt775) {
						this.anInt483 = 0;
					}
				}
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("7602, " + false + ", " + arg0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LQMHWDJZ", name = "a", descriptor = "(I)Lclient!HEQROJXW;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method547() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub4 local3 = this.aClass38_2.method513();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass38_2.aClass46_2 != null) {
				local9 = this.aClass38_2.aClass46_2.anIntArray196[this.anInt483];
			}
			@Pc(32) Class1_Sub1_Sub1_Sub4 local32 = new Class1_Sub1_Sub1_Sub4(-167, false, true, Class37.method510(local9), local3);
			if (local9 != -1) {
				local32.method277();
				local32.method278(local9);
				local32.anIntArrayArray12 = null;
				local32.anIntArrayArray11 = null;
			}
			if (this.aClass38_2.anInt680 != 128 || this.aClass38_2.anInt681 != 128) {
				local32.method286(this.aClass38_2.anInt681, this.aClass38_2.anInt680, this.aClass38_2.anInt680);
			}
			local32.method282(this.aBoolean137, this.anInt493);
			local32.method287(this.aClass38_2.anInt683 + 64, this.aClass38_2.anInt684 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("70057, " + 8 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}
}
