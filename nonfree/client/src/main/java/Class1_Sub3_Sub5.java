import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class1_Sub3_Sub5 extends Class1_Sub3 {

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
	private int anInt4935;

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!nb", name = "U", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!nb", name = "V", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!nb", name = "fb", descriptor = "Lclient!wp;")
	private Class13_Sub8 aClass13_Sub8_4;

	@OriginalMember(owner = "client!nb", name = "jb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!nb", name = "kb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!nb", name = "tb", descriptor = "I")
	private int anInt4959;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
	private int anInt4932 = 0;

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "Z")
	private boolean aBoolean368 = false;

	@OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
	private int anInt4937 = -1;

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
	private int anInt4936 = 0;

	@OriginalMember(owner = "client!nb", name = "eb", descriptor = "I")
	private int anInt4949 = -32768;

	@OriginalMember(owner = "client!nb", name = "ab", descriptor = "Z")
	private final boolean aBoolean369;

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
	private final int anInt4933;

	@OriginalMember(owner = "client!nb", name = "bb", descriptor = "I")
	public final int anInt4946;

	@OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
	private final int anInt4940;

	@OriginalMember(owner = "client!nb", name = "pb", descriptor = "I")
	public final int anInt4955;

	@OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
	public final int anInt4938;

	@OriginalMember(owner = "client!nb", name = "rb", descriptor = "I")
	private final int anInt4957;

	@OriginalMember(owner = "client!nb", name = "gb", descriptor = "I")
	private final int anInt4950;

	@OriginalMember(owner = "client!nb", name = "sb", descriptor = "I")
	public final int anInt4958;

	@OriginalMember(owner = "client!nb", name = "hb", descriptor = "Lclient!hi;")
	private final Class96 aClass96_2;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class1_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static124.method2209(arg1, arg2, arg3) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.aBoolean369 = arg11;
		this.anInt4933 = arg4;
		this.anInt4946 = arg9;
		this.anInt4940 = arg0;
		this.anInt4955 = arg10;
		this.anInt4938 = arg6;
		this.anInt4957 = arg8;
		this.anInt4950 = arg7;
		this.aBoolean368 = false;
		this.anInt4958 = arg5;
		@Pc(78) int local78 = Static102.aClass91_2.method2560(this.anInt4940).anInt5611;
		if (local78 == -1) {
			this.aClass96_2 = null;
		} else {
			this.aClass96_2 = Static196.aClass30_2.method942(local78);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5840(@OriginalArg(1) Class75 arg0) {
		@Pc(9) Class31 local9 = this.method3964(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class106 local15 = arg0.method2587();
		local15.YA(this.anInt4959);
		local15.c(this.anInt4935);
		local15.ZA((int) this.aDouble8, (int) this.aDouble1, (int) this.aDouble3);
		this.anInt4949 = local9.b();
		this.method3965(local9, arg0);
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5839() {
		return false;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V")
	public void method3961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean368) {
			local12 = arg0 - super.anInt6053;
			@Pc(18) double local18 = (double) (arg3 - super.anInt6055);
			@Pc(27) double local27 = Math.sqrt(local18 * local18 + local12 * local12);
			this.aDouble3 = (double) this.anInt4957 * local18 / local27 + (double) super.anInt6055;
			this.aDouble8 = (double) this.anInt4957 * local12 / local27 + (double) super.anInt6053;
			if (this.aBoolean369) {
				this.aDouble1 = Static124.method2209(super.aByte77, (int) this.aDouble8, (int) this.aDouble3) - this.anInt4933;
			} else {
				this.aDouble1 = super.anInt6045;
			}
		}
		local12 = this.anInt4938 + 1 - arg2;
		this.aDouble2 = ((double) arg3 - this.aDouble3) / local12;
		this.aDouble6 = ((double) arg0 - this.aDouble8) / local12;
		this.aDouble4 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble6 * this.aDouble6);
		if (this.anInt4950 == -1) {
			this.aDouble7 = ((double) arg1 - this.aDouble1) / local12;
		} else {
			if (!this.aBoolean368) {
				this.aDouble7 = -this.aDouble4 * Math.tan((double) this.anInt4950 * 0.02454369D);
			}
			this.aDouble5 = ((double) arg1 - this.aDouble7 * local12 - this.aDouble1) * 2.0D / (local12 * local12);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	@Override
	public void method5838() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass13_Sub8_4 != null) {
			this.aClass13_Sub8_4.method5946();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!rn;ZIILclient!qa;I)V")
	@Override
	public void method5836(@OriginalArg(1) Class1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	public void method3963() {
		if (this.aClass13_Sub8_4 != null) {
			this.aClass13_Sub8_4.method5946();
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lclient!qa;B)Lclient!vs;")
	@Override
	public Class13_Sub7 method5837(@OriginalArg(0) Class75 arg0) {
		@Pc(9) Class31 local9 = this.method3964(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class106 local16 = arg0.method2587();
		local16.YA(this.anInt4959);
		local16.c(this.anInt4935);
		local16.ZA((int) this.aDouble8, (int) this.aDouble1, (int) this.aDouble3);
		if (this.aClass13_Sub8_4 == null) {
			local9.method5704(local16, null, 0);
		} else {
			@Pc(57) Class116 local57 = this.aClass13_Sub8_4.method5943();
			arg0.method2571(local9, local57, local16, null);
		}
		this.anInt4949 = local9.b();
		this.method3965(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)V")
	@Override
	public void method4826() {
		super.aShort181 = super.aShort180 = (short) (this.aDouble8 / 128.0D);
		super.aShort179 = super.aShort178 = (short) (this.aDouble3 / 128.0D);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBLclient!qa;)Lclient!c;")
	private Class31 method3964(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		@Pc(9) Class186 local9 = Static102.aClass91_2.method2560(this.anInt4940);
		return local9.method4526(this.anInt4937, arg0, arg1, this.anInt4936, Static196.aClass30_2, this.anInt4932);
	}

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)I")
	@Override
	public int method4828() {
		return this.anInt4949;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!c;Lclient!qa;B)V")
	private void method3965(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class75 arg1) {
		@Pc(16) Class209[] local16 = arg0.method5707();
		@Pc(19) Class178[] local19 = arg0.method5705();
		if ((this.aClass13_Sub8_4 == null || this.aClass13_Sub8_4.aBoolean522) && (local16 != null || local19 != null)) {
			this.aClass13_Sub8_4 = new Class13_Sub8(Static290.anInt5325);
		}
		if (this.aClass13_Sub8_4 != null) {
			this.aClass13_Sub8_4.method5940(arg1, (long) Static290.anInt5325, local16, local19);
			this.aClass13_Sub8_4.method5948(super.aByte77, super.aShort181, super.aShort180, super.aShort179, super.aShort178);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)V")
	public void method3966(@OriginalArg(0) int arg0) {
		this.aDouble3 += (double) arg0 * this.aDouble2;
		this.aDouble8 += (double) arg0 * this.aDouble6;
		this.aBoolean368 = true;
		if (this.aBoolean369) {
			this.aDouble1 = Static124.method2209(super.aByte77, (int) this.aDouble8, (int) this.aDouble3) - this.anInt4933;
		} else if (this.anInt4950 == -1) {
			this.aDouble1 += (double) arg0 * this.aDouble7;
		} else {
			this.aDouble1 += this.aDouble7 * (double) arg0 + (double) arg0 * 0.5D * this.aDouble5 * (double) arg0;
			this.aDouble7 += this.aDouble5 * (double) arg0;
		}
		this.anInt4935 = (int) (Math.atan2(this.aDouble6, this.aDouble2) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4959 = (int) (Math.atan2(this.aDouble7, this.aDouble4) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass96_2 == null) {
			return;
		}
		this.anInt4932 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt4932 <= this.aClass96_2.anIntArray254[this.anInt4936]) {
						return;
					}
					this.anInt4932 -= this.aClass96_2.anIntArray254[this.anInt4936];
					this.anInt4936++;
					if (this.anInt4936 >= this.aClass96_2.anIntArray253.length) {
						this.anInt4936 -= this.aClass96_2.anInt3329;
						if (this.anInt4936 < 0 || this.anInt4936 >= this.aClass96_2.anIntArray253.length) {
							this.anInt4936 = 0;
						}
					}
					this.anInt4937 = this.anInt4936 + 1;
				} while (this.aClass96_2.anIntArray253.length > this.anInt4937);
				this.anInt4937 -= this.aClass96_2.anInt3329;
			} while (this.anInt4937 >= 0 && this.aClass96_2.anIntArray253.length > this.anInt4937);
			this.anInt4937 = -1;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZILclient!qa;)Z")
	@Override
	public boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		return false;
	}
}
