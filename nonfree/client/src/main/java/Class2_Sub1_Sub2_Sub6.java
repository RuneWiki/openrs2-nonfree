import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WZPSCBGD")
public final class Class2_Sub1_Sub2_Sub6 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!WZPSCBGD", name = "n", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!WZPSCBGD", name = "y", descriptor = "I")
	public int anInt612;

	@OriginalMember(owner = "client!WZPSCBGD", name = "z", descriptor = "I")
	private int anInt613;

	@OriginalMember(owner = "client!WZPSCBGD", name = "B", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!WZPSCBGD", name = "C", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!WZPSCBGD", name = "D", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!WZPSCBGD", name = "E", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!WZPSCBGD", name = "G", descriptor = "I")
	private int anInt615;

	@OriginalMember(owner = "client!WZPSCBGD", name = "H", descriptor = "I")
	private int anInt616;

	@OriginalMember(owner = "client!WZPSCBGD", name = "I", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!WZPSCBGD", name = "J", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!WZPSCBGD", name = "K", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!WZPSCBGD", name = "A", descriptor = "I")
	private int anInt614 = -458;

	@OriginalMember(owner = "client!WZPSCBGD", name = "L", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!WZPSCBGD", name = "M", descriptor = "B")
	private byte aByte23 = 0;

	@OriginalMember(owner = "client!WZPSCBGD", name = "N", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "client!WZPSCBGD", name = "F", descriptor = "Lclient!SDNQJNMP;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!WZPSCBGD", name = "o", descriptor = "I")
	public int anInt602;

	@OriginalMember(owner = "client!WZPSCBGD", name = "u", descriptor = "I")
	private int anInt608;

	@OriginalMember(owner = "client!WZPSCBGD", name = "v", descriptor = "I")
	private int anInt609;

	@OriginalMember(owner = "client!WZPSCBGD", name = "w", descriptor = "I")
	private int anInt610;

	@OriginalMember(owner = "client!WZPSCBGD", name = "p", descriptor = "I")
	public int anInt603;

	@OriginalMember(owner = "client!WZPSCBGD", name = "q", descriptor = "I")
	public int anInt604;

	@OriginalMember(owner = "client!WZPSCBGD", name = "r", descriptor = "I")
	private int anInt605;

	@OriginalMember(owner = "client!WZPSCBGD", name = "s", descriptor = "I")
	private int anInt606;

	@OriginalMember(owner = "client!WZPSCBGD", name = "t", descriptor = "I")
	public int anInt607;

	@OriginalMember(owner = "client!WZPSCBGD", name = "x", descriptor = "I")
	public int anInt611;

	@OriginalMember(owner = "client!WZPSCBGD", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class2_Sub1_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass33_2 = Class33.aClass33Array1[arg6];
			this.anInt602 = arg7;
			this.anInt608 = arg8;
			this.anInt609 = arg1;
			this.anInt610 = arg11;
			this.anInt603 = arg0;
			this.anInt604 = arg5;
			this.anInt605 = arg2;
			this.anInt606 = arg10;
			this.anInt607 = arg9;
			this.anInt611 = arg4;
			this.aBoolean195 = false;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("67315, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZPSCBGD", name = "a", descriptor = "(II)V")
	public void method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean195 = true;
			this.aDouble6 += this.aDouble2 * (double) arg0;
			if (arg1 <= 0) {
				for (@Pc(18) int local18 = 1; local18 > 0; local18++) {
				}
			}
			this.aDouble7 += this.aDouble3 * (double) arg0;
			this.aDouble8 += this.aDouble5 * (double) arg0 + this.aDouble1 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble5 += this.aDouble1 * (double) arg0;
			this.anInt612 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
			this.anInt613 = (int) (Math.atan2(this.aDouble5, this.aDouble4) * 325.949D) & 0x7FF;
			if (this.aClass33_2.aClass39_2 != null) {
				this.anInt616 += arg0;
				while (this.anInt616 > this.aClass33_2.aClass39_2.method403(this.anInt615)) {
					this.anInt616 -= this.aClass33_2.aClass39_2.method403(this.anInt615) + 1;
					this.anInt615++;
					if (this.anInt615 >= this.aClass33_2.aClass39_2.anInt585) {
						this.anInt615 = 0;
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("59963, " + arg0 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZPSCBGD", name = "a", descriptor = "(I)Lclient!IEHKDFMR;")
	@Override
	protected Class2_Sub1_Sub2_Sub2 method469() {
		try {
			@Pc(3) Class2_Sub1_Sub2_Sub2 local3 = this.aClass33_2.method318();
			if (local3 == null) {
				return null;
			}
			@Pc(18) int local18 = -1;
			if (this.aClass33_2.aClass39_2 != null) {
				local18 = this.aClass33_2.aClass39_2.anIntArray166[this.anInt615];
			}
			@Pc(42) Class2_Sub1_Sub2_Sub2 local42 = new Class2_Sub1_Sub2_Sub2(false, (byte) 1, Class26.method223(this.aByte23, local18), local3, true);
			if (local18 != -1) {
				local42.method158();
				local42.method159((byte) 9, local18);
				local42.anIntArrayArray8 = null;
				local42.anIntArrayArray7 = null;
			}
			if (this.aClass33_2.anInt477 != 128 || this.aClass33_2.anInt478 != 128) {
				local42.method167(this.aClass33_2.anInt477, this.aClass33_2.anInt478, this.aClass33_2.anInt477);
			}
			local42.method163(this.anInt613);
			local42.method168(this.aClass33_2.anInt480 + 64, this.aClass33_2.anInt481 + 850, -30, -50, -30, true);
			return local42;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("79196, " + 0 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZPSCBGD", name = "a", descriptor = "(IIIII)V")
	public void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean195) {
				local8 = arg1 - this.anInt608;
				@Pc(14) double local14 = (double) (arg0 - this.anInt609);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble6 = (double) this.anInt608 + local8 * (double) this.anInt606 / local23;
				this.aDouble7 = (double) this.anInt609 + local14 * (double) this.anInt606 / local23;
				this.aDouble8 = this.anInt610;
			}
			local8 = this.anInt604 + 1 - arg2;
			this.aDouble2 = ((double) arg1 - this.aDouble6) / local8;
			this.aDouble3 = ((double) arg0 - this.aDouble7) / local8;
			this.aDouble4 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble3 * this.aDouble3);
			if (!this.aBoolean195) {
				this.aDouble5 = -this.aDouble4 * Math.tan((double) this.anInt605 * 0.02454369D);
			}
			this.aDouble1 = ((double) arg3 - this.aDouble8 - this.aDouble5 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("14933, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -458 + ", " + arg3 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}
}
