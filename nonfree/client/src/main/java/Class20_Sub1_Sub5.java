import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class20_Sub1_Sub5 extends Class20_Sub1 {

	@OriginalMember(owner = "client!qr", name = "lb", descriptor = "[Lclient!vw;")
	public static final Class312[] lb = new Class312[2048];

	@OriginalMember(owner = "client!qr", name = "C", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!qr", name = "E", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!qr", name = "K", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!qr", name = "O", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!qr", name = "P", descriptor = "Lclient!ts;")
	private Class46_Sub7 aClass46_Sub7_4;

	@OriginalMember(owner = "client!qr", name = "Q", descriptor = "I")
	private int anInt7131;

	@OriginalMember(owner = "client!qr", name = "U", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!qr", name = "db", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!qr", name = "fb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!qr", name = "gb", descriptor = "I")
	private int anInt7142;

	@OriginalMember(owner = "client!qr", name = "ob", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!qr", name = "S", descriptor = "I")
	private int anInt7133 = -32768;

	@OriginalMember(owner = "client!qr", name = "T", descriptor = "I")
	private int anInt7134 = -1;

	@OriginalMember(owner = "client!qr", name = "ib", descriptor = "I")
	private int anInt7144 = 0;

	@OriginalMember(owner = "client!qr", name = "M", descriptor = "I")
	private int anInt7129 = 0;

	@OriginalMember(owner = "client!qr", name = "qb", descriptor = "Z")
	private boolean aBoolean549 = false;

	@OriginalMember(owner = "client!qr", name = "ab", descriptor = "I")
	public final int anInt7139;

	@OriginalMember(owner = "client!qr", name = "jb", descriptor = "I")
	private final int anInt7145;

	@OriginalMember(owner = "client!qr", name = "W", descriptor = "Z")
	private final boolean aBoolean548;

	@OriginalMember(owner = "client!qr", name = "V", descriptor = "I")
	public final int anInt7135;

	@OriginalMember(owner = "client!qr", name = "R", descriptor = "I")
	private final int anInt7132;

	@OriginalMember(owner = "client!qr", name = "F", descriptor = "I")
	private final int anInt7124;

	@OriginalMember(owner = "client!qr", name = "rb", descriptor = "I")
	public final int anInt7150;

	@OriginalMember(owner = "client!qr", name = "N", descriptor = "I")
	private final int anInt7130;

	@OriginalMember(owner = "client!qr", name = "H", descriptor = "I")
	public final int anInt7126;

	@OriginalMember(owner = "client!qr", name = "eb", descriptor = "Lclient!lk;")
	private final Class176 aClass176_2;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class20_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static508.method7754(arg3, arg2, arg1) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt7139 = arg5;
		this.anInt7145 = arg4;
		this.aBoolean548 = arg11;
		this.anInt7135 = arg6;
		this.anInt7132 = arg7;
		this.aBoolean549 = false;
		this.anInt7124 = arg8;
		this.anInt7150 = arg9;
		this.anInt7130 = arg0;
		this.anInt7126 = arg10;
		@Pc(78) int local78 = Static530.aClass195_2.method5439(this.anInt7130).anInt2314;
		if (local78 == -1) {
			this.aClass176_2 = null;
		} else {
			this.aClass176_2 = Static35.aClass152_1.method4045(local78);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZLclient!qa;Lclient!r;)V")
	private void method6434(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class97 arg1) {
		@Pc(12) Class68[] local12 = arg1.method6782();
		@Pc(15) Class106[] local15 = arg1.method6767();
		if ((this.aClass46_Sub7_4 == null || this.aClass46_Sub7_4.aBoolean627) && (local12 != null || local15 != null)) {
			this.aClass46_Sub7_4 = Static477.method7410(Static445.anInt7791);
		}
		if (this.aClass46_Sub7_4 != null) {
			this.aClass46_Sub7_4.method7414(arg0, (long) Static445.anInt7791, local12, local15);
			this.aClass46_Sub7_4.method7420(super.aByte108, super.aShort124, super.aShort126, super.aShort123, super.aShort125);
		}
	}

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8038() {
		return false;
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	@Override
	public Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0) {
		@Pc(17) Class97 local17 = this.method6437(2048, arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(24) Class128 local24 = arg0.method7165();
		local24.KA(this.anInt7131);
		local24.XA(this.anInt7142);
		local24.TA((int) this.aDouble1, (int) this.aDouble7, (int) this.aDouble2);
		if (this.aClass46_Sub7_4 == null) {
			local17.method6773(local24, null, 0);
		} else {
			@Pc(50) Class158 local50 = this.aClass46_Sub7_4.method7408();
			arg0.method7211(local17, local50, local24, null);
		}
		this.anInt7133 = local17.TA();
		this.method6434(arg0, local17);
		return null;
	}

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "(B)V")
	@Override
	public void method7800() {
		super.aShort123 = super.aShort125 = (short) (this.aDouble2 / 128.0D);
		super.aShort124 = super.aShort126 = (short) (this.aDouble1 / 128.0D);
	}

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "(I)I")
	@Override
	public int method7798() {
		return this.anInt7133;
	}

	@OriginalMember(owner = "client!qr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass46_Sub7_4 != null) {
			this.aClass46_Sub7_4.method7412();
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
	public void method6436() {
		if (this.aClass46_Sub7_4 != null) {
			this.aClass46_Sub7_4.method7412();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZLclient!oe;ILclient!qa;III)V")
	@Override
	public void method8034(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IILclient!qa;)Lclient!r;")
	private Class97 method6437(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1) {
		@Pc(15) Class87 local15 = Static530.aClass195_2.method5439(this.anInt7130);
		return local15.method2233(this.anInt7129, this.anInt7134, arg0, arg1, Static35.aClass152_1, this.anInt7144);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method8030(@OriginalArg(1) Class4 arg0) {
		@Pc(13) Class97 local13 = this.method6437(0, arg0);
		if (local13 == null) {
			return;
		}
		@Pc(19) Class128 local19 = arg0.method7165();
		local19.KA(this.anInt7131);
		local19.XA(this.anInt7142);
		local19.TA((int) this.aDouble1, (int) this.aDouble7, (int) this.aDouble2);
		this.anInt7133 = local13.TA();
		this.method6434(arg0, local13);
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	@Override
	public Class271 method8031(@OriginalArg(1) Class4 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(B)V")
	@Override
	public void method8036() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIII)V")
	public void method6439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) double local20;
		if (!this.aBoolean549) {
			local20 = arg2 - super.anInt8954;
			@Pc(27) double local27 = (double) (arg0 - super.anInt8949);
			@Pc(36) double local36 = Math.sqrt(local27 * local27 + local20 * local20);
			this.aDouble1 = (double) super.anInt8954 + (double) this.anInt7124 * local20 / local36;
			this.aDouble2 = (double) super.anInt8949 + local27 * (double) this.anInt7124 / local36;
			if (this.aBoolean548) {
				this.aDouble7 = Static508.method7754((int) this.aDouble2, (int) this.aDouble1, super.aByte108) - this.anInt7145;
			} else {
				this.aDouble7 = super.anInt8947;
			}
		}
		local20 = this.anInt7135 + 1 - arg3;
		this.aDouble5 = ((double) arg2 - this.aDouble1) / local20;
		this.aDouble4 = ((double) arg0 - this.aDouble2) / local20;
		this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
		if (this.anInt7132 == -1) {
			this.aDouble3 = ((double) arg1 - this.aDouble7) / local20;
		} else {
			if (!this.aBoolean549) {
				this.aDouble3 = -this.aDouble6 * Math.tan((double) this.anInt7132 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg1 - this.aDouble3 * local20 - this.aDouble7) * 2.0D / (local20 * local20);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)V")
	public void method6441(@OriginalArg(1) int arg0) {
		this.aDouble1 += this.aDouble5 * (double) arg0;
		this.aDouble2 += (double) arg0 * this.aDouble4;
		this.aBoolean549 = true;
		if (this.aBoolean548) {
			this.aDouble7 = Static508.method7754((int) this.aDouble2, (int) this.aDouble1, super.aByte108) - this.anInt7145;
		} else if (this.anInt7132 == -1) {
			this.aDouble7 += (double) arg0 * this.aDouble3;
		} else {
			this.aDouble7 += this.aDouble3 * (double) arg0 + (double) arg0 * this.aDouble8 * 0.5D * (double) arg0;
			this.aDouble3 += (double) arg0 * this.aDouble8;
		}
		this.anInt7142 = (int) (Math.atan2(this.aDouble5, this.aDouble4) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt7131 = (int) (Math.atan2(this.aDouble3, this.aDouble6) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass176_2 == null) {
			return;
		}
		this.anInt7129 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass176_2.anIntArray433[this.anInt7144] >= this.anInt7129) {
						return;
					}
					this.anInt7129 -= this.aClass176_2.anIntArray433[this.anInt7144];
					this.anInt7144++;
					if (this.aClass176_2.anIntArray432.length <= this.anInt7144) {
						this.anInt7144 -= this.aClass176_2.anInt5288;
						if (this.anInt7144 < 0 || this.aClass176_2.anIntArray432.length <= this.anInt7144) {
							this.anInt7144 = 0;
						}
					}
					this.anInt7134 = this.anInt7144 + 1;
				} while (this.aClass176_2.anIntArray432.length > this.anInt7134);
				this.anInt7134 -= this.aClass176_2.anInt5288;
			} while (this.anInt7134 >= 0 && this.aClass176_2.anIntArray432.length > this.anInt7134);
			this.anInt7134 = -1;
		}
	}
}
