import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!eb")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!eb", name = "I", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
	public int anInt506;

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
	private int anInt507;

	@OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
	private int anInt508;

	@OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
	private int anInt509;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	private int anInt494 = 2;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	private int anInt495 = 650;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Z")
	private boolean aBoolean109 = true;

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "Lclient!pc;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
	public int anInt496;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	private int anInt497;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
	private int anInt498;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	private int anInt499;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	public int anInt501;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	public int anInt502;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
	private int anInt503;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
	private int anInt504;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
	public int anInt505;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	public int anInt500;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIZIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass32_1 = Class32.aClass32Array1[arg2];
			this.anInt496 = arg11;
			this.anInt497 = arg7;
			this.anInt498 = arg1;
			this.anInt499 = arg6;
			this.anInt501 = arg4;
			this.anInt502 = arg3;
			this.anInt503 = arg9;
			this.anInt504 = arg0;
			this.anInt505 = arg10;
			this.anInt500 = arg8;
			this.aBoolean110 = false;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("87012, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIIII)V")
	public void method254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(14) double local14;
			if (!this.aBoolean110) {
				local14 = arg2 - this.anInt497;
				@Pc(20) double local20 = (double) (arg1 - this.anInt498);
				@Pc(29) double local29 = Math.sqrt(local14 * local14 + local20 * local20);
				this.aDouble1 = (double) this.anInt497 + local14 * (double) this.anInt504 / local29;
				this.aDouble2 = (double) this.anInt498 + local20 * (double) this.anInt504 / local29;
				this.aDouble3 = this.anInt499;
			}
			local14 = this.anInt502 + 1 - arg0;
			this.aDouble4 = ((double) arg2 - this.aDouble1) / local14;
			this.aDouble5 = ((double) arg1 - this.aDouble2) / local14;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean110) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt503 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg3 - this.aDouble3 - this.aDouble7 * local14) * 2.0D / (local14 * local14);
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("7137, " + 7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	public void method255(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean110 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt506 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt507 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass32_1.aClass27_2 != null) {
				this.anInt509 += arg0;
				while (this.anInt509 > this.aClass32_1.aClass27_2.method517(this.anInt508)) {
					this.anInt509 -= this.aClass32_1.aClass27_2.method517(this.anInt508) + 1;
					this.anInt508++;
					if (this.anInt508 >= this.aClass32_1.aClass27_2.anInt800) {
						this.anInt508 = 0;
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("27270, " + arg0 + ", " + 2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass32_1.method530();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass32_1.aClass27_2 != null) {
				local9 = this.aClass32_1.aClass27_2.anIntArray227[this.anInt508];
			}
			@Pc(42) Class1_Sub1_Sub1_Sub5 local42 = new Class1_Sub1_Sub1_Sub5(23727, Class14.method328(local9), true, local3, false);
			if (local9 != -1) {
				local42.method295();
				local42.method296(local9);
				local42.anIntArrayArray8 = null;
				local42.anIntArrayArray7 = null;
			}
			if (this.aClass32_1.anInt838 != 128 || this.aClass32_1.anInt839 != 128) {
				local42.method304(this.aClass32_1.anInt838, this.aClass32_1.anInt839, this.aClass32_1.anInt838);
			}
			local42.method300(this.anInt507);
			local42.method305(this.aClass32_1.anInt841 + 64, this.aClass32_1.anInt842 + 850, -30, -50, -30, true);
			return local42;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("95032, " + 650 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}
}
