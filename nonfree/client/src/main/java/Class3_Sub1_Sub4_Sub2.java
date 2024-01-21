import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class3_Sub1_Sub4_Sub2 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!ed", name = "gb", descriptor = "I")
	public int anInt833;

	@OriginalMember(owner = "client!ed", name = "mb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ed", name = "ob", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!ed", name = "rb", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!ed", name = "tb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ed", name = "vb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ed", name = "wb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!ed", name = "Bb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ed", name = "Hb", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!ed", name = "Lb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!ed", name = "db", descriptor = "I")
	private int anInt832 = 0;

	@OriginalMember(owner = "client!ed", name = "xb", descriptor = "I")
	private int anInt841 = 0;

	@OriginalMember(owner = "client!ed", name = "Rb", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!ed", name = "Ab", descriptor = "I")
	private final int anInt844;

	@OriginalMember(owner = "client!ed", name = "nb", descriptor = "I")
	public final int anInt838;

	@OriginalMember(owner = "client!ed", name = "Qb", descriptor = "I")
	private final int anInt854;

	@OriginalMember(owner = "client!ed", name = "Kb", descriptor = "I")
	public final int anInt850;

	@OriginalMember(owner = "client!ed", name = "kb", descriptor = "I")
	public final int anInt836;

	@OriginalMember(owner = "client!ed", name = "Cb", descriptor = "I")
	public final int anInt845;

	@OriginalMember(owner = "client!ed", name = "Sb", descriptor = "I")
	public final int anInt855;

	@OriginalMember(owner = "client!ed", name = "Ib", descriptor = "I")
	private final int anInt849;

	@OriginalMember(owner = "client!ed", name = "hb", descriptor = "I")
	private final int anInt834;

	@OriginalMember(owner = "client!ed", name = "Pb", descriptor = "I")
	private final int anInt853;

	@OriginalMember(owner = "client!ed", name = "Ob", descriptor = "I")
	private final int anInt852;

	@OriginalMember(owner = "client!ed", name = "eb", descriptor = "Lclient!qc;")
	private final Class3_Sub1_Sub11 aClass3_Sub1_Sub11_1;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class3_Sub1_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt844 = arg4;
		this.anInt838 = arg5;
		this.anInt854 = arg2;
		this.anInt850 = arg1;
		this.anInt836 = arg9;
		this.anInt845 = arg10;
		this.aBoolean35 = false;
		this.anInt855 = arg6;
		this.anInt849 = arg3;
		this.anInt834 = arg0;
		this.anInt853 = arg7;
		this.anInt852 = arg8;
		@Pc(52) int local52 = Static89.method1461(this.anInt834).anInt359;
		if (local52 == -1) {
			this.aClass3_Sub1_Sub11_1 = null;
		} else {
			this.aClass3_Sub1_Sub11_1 = Static97.method1629(local52);
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(II)V")
	public void method519(@OriginalArg(0) int arg0) {
		this.aDouble6 += this.aDouble7 * (double) arg0;
		this.aDouble8 += (double) arg0 * this.aDouble4 + (double) arg0 * 0.5D * this.aDouble2 * (double) arg0;
		this.aDouble3 += (double) arg0 * this.aDouble9;
		this.aBoolean35 = true;
		this.aDouble4 += this.aDouble2 * (double) arg0;
		this.anInt833 = (int) (Math.atan2(this.aDouble7, this.aDouble9) * 325.949D) + 1024 & 0x7FF;
		this.anInt839 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) & 0x7FF;
		if (this.aClass3_Sub1_Sub11_1 == null) {
			return;
		}
		this.anInt841 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass3_Sub1_Sub11_1.anIntArray305[this.anInt832] >= this.anInt841) {
						return;
					}
					this.anInt841 -= this.aClass3_Sub1_Sub11_1.anIntArray305[this.anInt832];
					this.anInt832++;
				} while (this.aClass3_Sub1_Sub11_1.anIntArray306.length > this.anInt832);
				this.anInt832 -= this.aClass3_Sub1_Sub11_1.anInt2251;
			} while (this.anInt832 >= 0 && this.anInt832 < this.aClass3_Sub1_Sub11_1.anIntArray306.length);
			this.anInt832 = 0;
		}
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)Lclient!ua;")
	@Override
	public Class3_Sub1_Sub4_Sub7 method1750() {
		@Pc(4) Class3_Sub1_Sub3 local4 = Static89.method1461(this.anInt834);
		@Pc(16) Class3_Sub1_Sub4_Sub7 local16 = local4.method239(this.anInt832);
		if (local16 == null) {
			return null;
		} else {
			local16.method1759(this.anInt839);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)V")
	public void method521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) double local17;
		if (!this.aBoolean35) {
			local17 = arg3 - this.anInt854;
			@Pc(23) double local23 = (double) (arg2 - this.anInt849);
			@Pc(32) double local32 = Math.sqrt(local17 * local17 + local23 * local23);
			this.aDouble8 = this.anInt844;
			this.aDouble6 = (double) this.anInt854 + local17 * (double) this.anInt852 / local32;
			this.aDouble3 = (double) this.anInt852 * local23 / local32 + (double) this.anInt849;
		}
		local17 = this.anInt855 + 1 - arg0;
		this.aDouble7 = ((double) arg3 - this.aDouble6) / local17;
		this.aDouble9 = ((double) arg2 - this.aDouble3) / local17;
		this.aDouble5 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble9 * this.aDouble9);
		if (!this.aBoolean35) {
			this.aDouble4 = -this.aDouble5 * Math.tan((double) this.anInt853 * 0.02454369D);
		}
		this.aDouble2 = ((double) arg1 - this.aDouble4 * local17 - this.aDouble8) * 2.0D / (local17 * local17);
	}
}
