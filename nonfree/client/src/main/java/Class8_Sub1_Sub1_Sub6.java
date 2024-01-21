import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VCMSZAQJ")
public final class Class8_Sub1_Sub1_Sub6 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!VCMSZAQJ", name = "n", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "o", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "p", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "q", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "s", descriptor = "I")
	private int anInt635;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "t", descriptor = "I")
	private int anInt636;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "v", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "w", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "x", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "B", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "C", descriptor = "I")
	public int anInt641;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "D", descriptor = "I")
	private int anInt642;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "k", descriptor = "Z")
	private boolean aBoolean154 = true;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "l", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "r", descriptor = "Z")
	private boolean aBoolean156 = true;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "u", descriptor = "I")
	private int anInt637 = 41952;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "K", descriptor = "Z")
	private boolean aBoolean157 = false;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "m", descriptor = "Lclient!QUXKFXEA;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "L", descriptor = "I")
	public int anInt649;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "G", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "H", descriptor = "I")
	private int anInt646;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "I", descriptor = "I")
	private int anInt647;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "E", descriptor = "I")
	public int anInt643;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "F", descriptor = "I")
	public int anInt644;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "y", descriptor = "I")
	private int anInt638;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "z", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "A", descriptor = "I")
	public int anInt640;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "J", descriptor = "I")
	public int anInt648;

	@OriginalMember(owner = "client!VCMSZAQJ", name = "<init>", descriptor = "(IIBIIIIIIIII)V")
	public Class8_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass32_2 = Class32.aClass32Array1[arg9];
			this.anInt649 = arg6;
			this.anInt645 = arg11;
			this.anInt646 = arg4;
			this.anInt647 = arg5;
			this.anInt643 = arg0;
			this.anInt644 = arg10;
			this.anInt638 = arg1;
			this.anInt639 = arg8;
			this.anInt640 = arg3;
			this.anInt648 = arg7;
			this.aBoolean157 = false;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("28496, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCMSZAQJ", name = "a", descriptor = "(I)Lclient!KDWDYCIL;")
	@Override
	protected Class8_Sub1_Sub1_Sub3 method472() {
		try {
			@Pc(3) Class8_Sub1_Sub1_Sub3 local3 = this.aClass32_2.method313();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass32_2.aClass20_2 != null) {
				local9 = this.aClass32_2.aClass20_2.anIntArray110[this.anInt635];
			}
			@Pc(43) Class8_Sub1_Sub1_Sub3 local43 = new Class8_Sub1_Sub1_Sub3((byte) -48, false, local3, Class34.method331(local9, this.anInt637), true);
			if (local9 != -1) {
				local43.method143();
				local43.method144(local9);
				local43.anIntArrayArray7 = null;
				local43.anIntArrayArray6 = null;
			}
			if (this.aClass32_2.anInt515 != 128 || this.aClass32_2.anInt516 != 128) {
				local43.method152(this.aClass32_2.anInt515, this.aClass32_2.anInt515, this.aClass32_2.anInt516);
			}
			local43.method148(this.anInt642);
			local43.method153(this.aClass32_2.anInt518 + 64, this.aClass32_2.anInt519 + 850, -30, -50, -30, true);
			return local43;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("58725, " + 9 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCMSZAQJ", name = "a", descriptor = "(IIIII)V")
	public void method473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean157) {
				local8 = arg1 - this.anInt645;
				@Pc(14) double local14 = (double) (arg3 - this.anInt646);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble5 = (double) this.anInt645 + local8 * (double) this.anInt639 / local23;
				this.aDouble6 = (double) this.anInt646 + local14 * (double) this.anInt639 / local23;
				this.aDouble7 = this.anInt647;
			}
			local8 = this.anInt644 + 1 - arg2;
			this.aDouble1 = ((double) arg1 - this.aDouble5) / local8;
			this.aDouble2 = ((double) arg3 - this.aDouble6) / local8;
			this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
			if (!this.aBoolean157) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt638 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg0 - this.aDouble7 - this.aDouble4 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("71437, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + arg3 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCMSZAQJ", name = "a", descriptor = "(IZ)V")
	public void method474(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean157 = true;
			this.aDouble5 += this.aDouble1 * (double) arg0;
			this.aDouble6 += this.aDouble2 * (double) arg0;
			this.aDouble7 += this.aDouble4 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble4 += this.aDouble8 * (double) arg0;
			this.anInt641 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
			this.anInt642 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
			if (this.aClass32_2.aClass20_2 != null) {
				this.anInt636 += arg0;
				while (this.anInt636 > this.aClass32_2.aClass20_2.method170(this.anInt635)) {
					this.anInt636 -= this.aClass32_2.aClass20_2.method170(this.anInt635) + 1;
					this.anInt635++;
					if (this.anInt635 >= this.aClass32_2.aClass20_2.anInt325) {
						this.anInt635 = 0;
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("54636, " + arg0 + ", " + true + ", " + local144.toString());
			throw new RuntimeException();
		}
	}
}
