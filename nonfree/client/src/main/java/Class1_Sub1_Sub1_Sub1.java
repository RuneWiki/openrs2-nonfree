import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AAKFEJZP")
public final class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!AAKFEJZP", name = "l", descriptor = "I")
	public int anInt7;

	@OriginalMember(owner = "client!AAKFEJZP", name = "m", descriptor = "I")
	private int anInt8;

	@OriginalMember(owner = "client!AAKFEJZP", name = "u", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!AAKFEJZP", name = "v", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!AAKFEJZP", name = "w", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!AAKFEJZP", name = "x", descriptor = "I")
	private int anInt15;

	@OriginalMember(owner = "client!AAKFEJZP", name = "y", descriptor = "I")
	private int anInt16;

	@OriginalMember(owner = "client!AAKFEJZP", name = "E", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!AAKFEJZP", name = "F", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!AAKFEJZP", name = "G", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!AAKFEJZP", name = "H", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!AAKFEJZP", name = "I", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!AAKFEJZP", name = "z", descriptor = "I")
	private int anInt17 = 7;

	@OriginalMember(owner = "client!AAKFEJZP", name = "D", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!AAKFEJZP", name = "J", descriptor = "Z")
	private boolean aBoolean8 = false;

	@OriginalMember(owner = "client!AAKFEJZP", name = "t", descriptor = "Lclient!RTDMFIDA;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!AAKFEJZP", name = "k", descriptor = "I")
	public int anInt6;

	@OriginalMember(owner = "client!AAKFEJZP", name = "n", descriptor = "I")
	private int anInt9;

	@OriginalMember(owner = "client!AAKFEJZP", name = "o", descriptor = "I")
	private int anInt10;

	@OriginalMember(owner = "client!AAKFEJZP", name = "p", descriptor = "I")
	private int anInt11;

	@OriginalMember(owner = "client!AAKFEJZP", name = "r", descriptor = "I")
	public int anInt13;

	@OriginalMember(owner = "client!AAKFEJZP", name = "s", descriptor = "I")
	public int anInt14;

	@OriginalMember(owner = "client!AAKFEJZP", name = "A", descriptor = "I")
	private int anInt18;

	@OriginalMember(owner = "client!AAKFEJZP", name = "B", descriptor = "I")
	private int anInt19;

	@OriginalMember(owner = "client!AAKFEJZP", name = "C", descriptor = "I")
	public int anInt20;

	@OriginalMember(owner = "client!AAKFEJZP", name = "q", descriptor = "I")
	public int anInt12;

	@OriginalMember(owner = "client!AAKFEJZP", name = "<init>", descriptor = "(IIIIIIIBIIII)V")
	public Class1_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass34_1 = Class34.aClass34Array1[arg8];
			this.anInt6 = arg2;
			this.anInt9 = arg3;
			this.anInt10 = arg9;
			this.anInt11 = arg1;
			this.anInt13 = arg0;
			this.anInt14 = arg11;
			this.anInt18 = arg10;
			this.anInt19 = arg4;
			this.anInt20 = arg5;
			this.anInt12 = arg6;
			this.aBoolean7 = false;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("17074, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AAKFEJZP", name = "a", descriptor = "(ZI)V")
	public void method12(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean7 = true;
			this.aDouble1 += this.aDouble5 * (double) arg0;
			this.aDouble2 += this.aDouble6 * (double) arg0;
			this.aDouble3 += this.aDouble8 * (double) arg0 + this.aDouble4 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble8 += this.aDouble4 * (double) arg0;
			this.anInt7 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
			this.anInt8 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) & 0x7FF;
			if (this.aClass34_1.aClass19_2 != null) {
				this.anInt16 += arg0;
				while (this.anInt16 > this.aClass34_1.aClass19_2.method193(this.anInt15)) {
					this.anInt16 -= this.aClass34_1.aClass19_2.method193(this.anInt15) + 1;
					this.anInt15++;
					if (this.anInt15 >= this.aClass34_1.aClass19_2.anInt211) {
						this.anInt15 = 0;
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("65263, " + true + ", " + arg0 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AAKFEJZP", name = "a", descriptor = "(Z)Lclient!IYSWJGDE;")
	@Override
	protected Class1_Sub1_Sub1_Sub3 method513() {
		try {
			@Pc(13) Class1_Sub1_Sub1_Sub3 local13 = this.aClass34_1.method390();
			if (local13 == null) {
				return null;
			}
			@Pc(19) int local19 = -1;
			if (this.aClass34_1.aClass19_2 != null) {
				local19 = this.aClass34_1.aClass19_2.anIntArray99[this.anInt15];
			}
			@Pc(42) Class1_Sub1_Sub1_Sub3 local42 = new Class1_Sub1_Sub1_Sub3(Class30.method334(local19), local13, 946, true, false);
			if (local19 != -1) {
				local42.method154();
				local42.method155(local19);
				local42.anIntArrayArray8 = null;
				local42.anIntArrayArray7 = null;
			}
			if (this.aClass34_1.anInt584 != 128 || this.aClass34_1.anInt585 != 128) {
				local42.method163(this.aClass34_1.anInt584, this.aClass34_1.anInt584, this.aClass34_1.anInt585);
			}
			local42.method159(this.anInt8);
			local42.method164(this.aClass34_1.anInt587 + 64, this.aClass34_1.anInt588 + 850, -30, -50, -30, true);
			return local42;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("43922, " + true + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AAKFEJZP", name = "a", descriptor = "(IIIZI)V")
	public void method13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(13) double local13;
			if (!this.aBoolean7) {
				local13 = arg0 - this.anInt9;
				@Pc(19) double local19 = (double) (arg1 - this.anInt10);
				@Pc(28) double local28 = Math.sqrt(local13 * local13 + local19 * local19);
				this.aDouble1 = (double) this.anInt9 + local13 * (double) this.anInt19 / local28;
				this.aDouble2 = (double) this.anInt10 + local19 * (double) this.anInt19 / local28;
				this.aDouble3 = this.anInt11;
			}
			local13 = this.anInt14 + 1 - arg3;
			this.aDouble5 = ((double) arg0 - this.aDouble1) / local13;
			this.aDouble6 = ((double) arg1 - this.aDouble2) / local13;
			this.aDouble7 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble6 * this.aDouble6);
			if (!this.aBoolean7) {
				this.aDouble8 = -this.aDouble7 * Math.tan((double) this.anInt18 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg2 - this.aDouble3 - this.aDouble8 * local13) * 2.0D / (local13 * local13);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("85986, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}
}
