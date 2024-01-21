import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BSBQPUWL")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!BSBQPUWL", name = "p", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!BSBQPUWL", name = "t", descriptor = "I")
	public int anInt208;

	@OriginalMember(owner = "client!BSBQPUWL", name = "u", descriptor = "I")
	private int anInt209;

	@OriginalMember(owner = "client!BSBQPUWL", name = "v", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!BSBQPUWL", name = "w", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!BSBQPUWL", name = "x", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!BSBQPUWL", name = "C", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!BSBQPUWL", name = "D", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!BSBQPUWL", name = "E", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!BSBQPUWL", name = "F", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!BSBQPUWL", name = "I", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!BSBQPUWL", name = "K", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!BSBQPUWL", name = "L", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!BSBQPUWL", name = "G", descriptor = "I")
	private int anInt214 = 1;

	@OriginalMember(owner = "client!BSBQPUWL", name = "H", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!BSBQPUWL", name = "J", descriptor = "Lclient!XYSJIYWF;")
	private Class46 aClass46_2;

	@OriginalMember(owner = "client!BSBQPUWL", name = "q", descriptor = "I")
	public int anInt205;

	@OriginalMember(owner = "client!BSBQPUWL", name = "y", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!BSBQPUWL", name = "z", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!BSBQPUWL", name = "A", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!BSBQPUWL", name = "r", descriptor = "I")
	public int anInt206;

	@OriginalMember(owner = "client!BSBQPUWL", name = "s", descriptor = "I")
	public int anInt207;

	@OriginalMember(owner = "client!BSBQPUWL", name = "m", descriptor = "I")
	private int anInt201;

	@OriginalMember(owner = "client!BSBQPUWL", name = "n", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!BSBQPUWL", name = "o", descriptor = "I")
	public int anInt203;

	@OriginalMember(owner = "client!BSBQPUWL", name = "B", descriptor = "I")
	public int anInt213;

	@OriginalMember(owner = "client!BSBQPUWL", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass46_2 = Class46.aClass46Array1[arg4];
			this.anInt205 = arg3;
			this.anInt210 = arg5;
			this.anInt211 = arg6;
			this.anInt212 = arg10;
			this.anInt206 = arg2;
			this.anInt207 = arg7;
			this.anInt201 = arg9;
			this.anInt202 = arg8;
			this.anInt203 = arg0;
			this.anInt213 = arg1;
			this.aBoolean35 = false;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("49071, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSBQPUWL", name = "a", descriptor = "(IZ)V")
	public void method89(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean35 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt208 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt209 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass46_2.aClass7_2 != null) {
				this.anInt216 += arg0;
				while (this.anInt216 > this.aClass46_2.aClass7_2.method103((byte) 6, this.anInt215)) {
					this.anInt216 -= this.aClass46_2.aClass7_2.method103((byte) 6, this.anInt215);
					this.anInt215++;
					if (this.anInt215 >= this.aClass46_2.aClass7_2.anInt237) {
						this.anInt215 = 0;
					}
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("61735, " + arg0 + ", " + true + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSBQPUWL", name = "a", descriptor = "(I)Lclient!OJGAHFXC;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method504(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass46_2.method554();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass46_2.aClass7_2 != null) {
				local9 = this.aClass46_2.aClass7_2.anIntArray27[this.anInt215];
			}
			@Pc(32) Class1_Sub1_Sub1_Sub5 local32 = new Class1_Sub1_Sub1_Sub5(Class23.method343(local9, (byte) 1), false, true, -900, local3);
			if (local9 != -1) {
				local32.method386(this.anInt204);
				local32.method387(local9);
				local32.anIntArrayArray11 = null;
				local32.anIntArrayArray10 = null;
			}
			if (this.aClass46_2.anInt818 != 128 || this.aClass46_2.anInt819 != 128) {
				local32.method395(this.aClass46_2.anInt818, this.anInt214, this.aClass46_2.anInt819, this.aClass46_2.anInt818);
			}
			local32.method391(171, this.anInt209);
			local32.method396(this.aClass46_2.anInt821 + 64, this.aClass46_2.anInt822 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("36227, " + 822 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSBQPUWL", name = "a", descriptor = "(IIIII)V")
	public void method90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean35) {
				local8 = arg3 - this.anInt210;
				@Pc(14) double local14 = (double) (arg0 - this.anInt211);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt210 + local8 * (double) this.anInt202 / local23;
				this.aDouble2 = (double) this.anInt211 + local14 * (double) this.anInt202 / local23;
				this.aDouble3 = this.anInt212;
			}
			local8 = this.anInt207 + 1 - arg2;
			this.aDouble4 = ((double) arg3 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg0 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean35) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt201 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg1 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("82463, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -37962 + ", " + arg3 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}
}
