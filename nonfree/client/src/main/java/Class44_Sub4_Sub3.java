import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class44_Sub4_Sub3 extends Class44_Sub4 {

	@OriginalMember(owner = "client!pb", name = "L", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!pb", name = "Q", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!pb", name = "eb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
	private int anInt4389;

	@OriginalMember(owner = "client!pb", name = "ib", descriptor = "Lclient!bl;")
	private Class20_Sub2 aClass20_Sub2_4;

	@OriginalMember(owner = "client!pb", name = "jb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!pb", name = "nb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!pb", name = "pb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!pb", name = "sb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!pb", name = "tb", descriptor = "I")
	private int anInt4396;

	@OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
	private int anInt4379 = -32768;

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
	private int anInt4378 = -1;

	@OriginalMember(owner = "client!pb", name = "V", descriptor = "Z")
	private boolean aBoolean306 = false;

	@OriginalMember(owner = "client!pb", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!pb", name = "qb", descriptor = "I")
	private int anInt4394 = 0;

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
	public final int anInt4377;

	@OriginalMember(owner = "client!pb", name = "X", descriptor = "I")
	public final int anInt4382;

	@OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
	private final int anInt4385;

	@OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
	public final int anInt4374;

	@OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
	public final int anInt4381;

	@OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
	private final int anInt4372;

	@OriginalMember(owner = "client!pb", name = "mb", descriptor = "I")
	private final int anInt4392;

	@OriginalMember(owner = "client!pb", name = "cb", descriptor = "Lclient!bq;")
	private final Class24 aClass24_3;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class44_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt4377 = arg5;
		this.anInt4382 = arg6;
		this.anInt4385 = arg7;
		this.anInt4374 = arg10;
		this.anInt4381 = arg9;
		this.anInt4372 = arg0;
		this.aBoolean306 = false;
		this.anInt4392 = arg8;
		@Pc(64) int local64 = Static62.method999(this.anInt4372).anInt4753;
		if (local64 == -1) {
			this.aClass24_3 = null;
		} else {
			this.aClass24_3 = Static209.method3737(local64);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!ja;)V")
	@Override
	public void method5775(@OriginalArg(1) Class81 arg0) {
		@Pc(17) Class78 local17 = this.method4175(0, arg0);
		if (local17 == null) {
			return;
		}
		@Pc(23) Class72 local23 = arg0.method2990();
		local23.method4069(this.anInt4396);
		local23.method4074(this.anInt4389);
		local23.method4068((int) this.aDouble7, (int) this.aDouble1, (int) this.aDouble4);
		this.anInt4379 = local17.method4639();
		this.method4174(arg0, local17);
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(II)V")
	public void method4171(@OriginalArg(0) int arg0) {
		this.aDouble7 += this.aDouble2 * (double) arg0;
		this.aBoolean306 = true;
		this.aDouble4 += this.aDouble6 * (double) arg0;
		if (this.anInt4385 == -1) {
			this.aDouble1 += (double) arg0 * this.aDouble3;
		} else {
			this.aDouble1 += this.aDouble3 * (double) arg0 + (double) arg0 * (double) arg0 * this.aDouble5 * 0.5D;
			this.aDouble3 += (double) arg0 * this.aDouble5;
		}
		this.anInt4389 = (int) (Math.atan2(this.aDouble2, this.aDouble6) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4396 = (int) (Math.atan2(this.aDouble3, this.aDouble8) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass24_3 == null) {
			return;
		}
		this.anInt4394 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass24_3.anIntArray66[this.lb] >= this.anInt4394) {
						return;
					}
					this.anInt4394 -= this.aClass24_3.anIntArray66[this.lb];
					this.lb++;
					if (this.lb >= this.aClass24_3.anIntArray64.length) {
						this.lb -= this.aClass24_3.anInt586;
						if (this.lb < 0 || this.aClass24_3.anIntArray64.length <= this.lb) {
							this.lb = 0;
						}
					}
					this.anInt4378 = this.lb + 1;
				} while (this.aClass24_3.anIntArray64.length > this.anInt4378);
				this.anInt4378 -= this.aClass24_3.anInt586;
			} while (this.anInt4378 >= 0 && this.anInt4378 < this.aClass24_3.anIntArray64.length);
			this.anInt4378 = -1;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLclient!ja;)Lclient!kh;")
	@Override
	public Class20_Sub6 method5779(@OriginalArg(1) Class81 arg0) {
		@Pc(9) Class78 local9 = this.method4175(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class72 local16 = arg0.method2990();
		local16.method4069(this.anInt4396);
		local16.method4074(this.anInt4389);
		local16.method4068((int) this.aDouble7, (int) this.aDouble1, (int) this.aDouble4);
		if (this.aClass20_Sub2_4 == null) {
			local9.method4649(local16, null, 0);
		} else {
			@Pc(54) Class90 local54 = this.aClass20_Sub2_4.method449();
			arg0.method2979(local9, local54, local16, null);
		}
		this.anInt4379 = local9.method4639();
		this.method4174(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5783() {
		return false;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZIII)V")
	public void method4172(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean306) {
			local13 = arg1 - super.anInt6340;
			@Pc(20) double local20 = (double) (arg3 - super.anInt6339);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble7 = (double) this.anInt4392 * local13 / local29 + (double) super.anInt6340;
			this.aDouble1 = super.anInt6335;
			this.aDouble4 = (double) super.anInt6339 + (double) this.anInt4392 * local20 / local29;
		}
		local13 = this.anInt4382 + 1 - arg2;
		this.aDouble2 = ((double) arg1 - this.aDouble7) / local13;
		this.aDouble6 = ((double) arg3 - this.aDouble4) / local13;
		this.aDouble8 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble6 * this.aDouble6);
		if (this.anInt4385 == -1) {
			this.aDouble3 = ((double) arg0 - this.aDouble1) / local13;
		} else {
			if (!this.aBoolean306) {
				this.aDouble3 = -this.aDouble8 * Math.tan((double) this.anInt4385 * 0.02454369D);
			}
			this.aDouble5 = ((double) arg0 - local13 * this.aDouble3 - this.aDouble1) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public void method4173() {
		if (this.aClass20_Sub2_4 != null) {
			this.aClass20_Sub2_4.method453();
		}
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)V")
	@Override
	public void method5789() {
		super.aShort90 = super.aShort87 = (short) (this.aDouble7 / 128.0D);
		super.aShort89 = super.aShort88 = (short) (this.aDouble4 / 128.0D);
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
	@Override
	public void method5777() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!ja;II)Z")
	@Override
	public boolean method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!pb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub2_4 != null) {
			this.aClass20_Sub2_4.method453();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLclient!ja;Lclient!rc;)V")
	private void method4174(@OriginalArg(1) Class81 arg0, @OriginalArg(2) Class78 arg1) {
		@Pc(12) Class157[] local12 = arg1.method4662();
		@Pc(15) Class22[] local15 = arg1.method4650();
		if ((this.aClass20_Sub2_4 == null || this.aClass20_Sub2_4.aBoolean35) && (local12 != null || local15 != null)) {
			this.aClass20_Sub2_4 = new Class20_Sub2(Static76.anInt2853);
		}
		if (this.aClass20_Sub2_4 != null) {
			this.aClass20_Sub2_4.method446(arg0, (long) Static76.anInt2853, local12, local15);
			this.aClass20_Sub2_4.method451(super.aByte90, super.aShort90, super.aShort87, super.aShort89, super.aShort88);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBZIILclient!nf;Lclient!ja;)V")
	@Override
	public void method5780(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class44 arg4, @OriginalArg(6) Class81 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILclient!ja;)Lclient!rc;")
	private Class78 method4175(@OriginalArg(0) int arg0, @OriginalArg(2) Class81 arg1) {
		@Pc(13) Class166 local13 = Static62.method999(this.anInt4372);
		return local13.method4372(arg1, arg0, this.anInt4378, this.anInt4394, this.lb);
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)I")
	@Override
	public int method5784() {
		return this.anInt4379;
	}
}
