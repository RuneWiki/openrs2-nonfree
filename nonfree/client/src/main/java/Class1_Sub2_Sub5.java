import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ms", name = "lb", descriptor = "Lclient!vp;")
	public static Class93 lb;

	@OriginalMember(owner = "client!ms", name = "D", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ms", name = "N", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!ms", name = "S", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ms", name = "T", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ms", name = "U", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ms", name = "ab", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ms", name = "db", descriptor = "I")
	private int anInt4601;

	@OriginalMember(owner = "client!ms", name = "ib", descriptor = "I")
	private int anInt4606;

	@OriginalMember(owner = "client!ms", name = "jb", descriptor = "Lclient!mk;")
	private Class57_Sub6 aClass57_Sub6_4;

	@OriginalMember(owner = "client!ms", name = "kb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ms", name = "qb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!ms", name = "A", descriptor = "I")
	private int anInt4583 = 0;

	@OriginalMember(owner = "client!ms", name = "X", descriptor = "Z")
	private boolean aBoolean398 = false;

	@OriginalMember(owner = "client!ms", name = "V", descriptor = "I")
	private int anInt4596 = -1;

	@OriginalMember(owner = "client!ms", name = "cb", descriptor = "I")
	private int anInt4600 = -32768;

	@OriginalMember(owner = "client!ms", name = "sb", descriptor = "I")
	private int anInt4612 = 0;

	@OriginalMember(owner = "client!ms", name = "Z", descriptor = "I")
	public final int anInt4599;

	@OriginalMember(owner = "client!ms", name = "J", descriptor = "I")
	public final int anInt4590;

	@OriginalMember(owner = "client!ms", name = "Y", descriptor = "I")
	private final int anInt4598;

	@OriginalMember(owner = "client!ms", name = "rb", descriptor = "I")
	public final int anInt4611;

	@OriginalMember(owner = "client!ms", name = "pb", descriptor = "I")
	private final int anInt4610;

	@OriginalMember(owner = "client!ms", name = "W", descriptor = "I")
	public final int anInt4597;

	@OriginalMember(owner = "client!ms", name = "B", descriptor = "I")
	private final int anInt4584;

	@OriginalMember(owner = "client!ms", name = "bb", descriptor = "Lclient!gr;")
	private final Class84 aClass84_1;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt4599 = arg9;
		this.anInt4590 = arg10;
		this.anInt4598 = arg8;
		this.anInt4611 = arg6;
		this.aBoolean398 = false;
		this.anInt4610 = arg7;
		this.anInt4597 = arg5;
		this.anInt4584 = arg0;
		@Pc(64) int local64 = Static41.method4707(this.anInt4584).anInt5808;
		if (local64 == -1) {
			this.aClass84_1 = null;
		} else {
			this.aClass84_1 = Static91.method1822(local64);
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5759() {
		return false;
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(Z)I")
	@Override
	public int method5766() {
		return this.anInt4600;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIBI)V")
	public void method3962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) double local19;
		if (!this.aBoolean398) {
			local19 = arg2 - super.anInt6893;
			@Pc(26) double local26 = (double) (arg0 - super.anInt6888);
			@Pc(35) double local35 = Math.sqrt(local19 * local19 + local26 * local26);
			this.aDouble7 = local26 * (double) this.anInt4598 / local35 + (double) super.anInt6888;
			this.aDouble2 = local19 * (double) this.anInt4598 / local35 + (double) super.anInt6893;
			this.aDouble8 = super.anInt6886;
		}
		local19 = this.anInt4611 + 1 - arg3;
		this.aDouble9 = ((double) arg2 - this.aDouble2) / local19;
		this.aDouble3 = ((double) arg0 - this.aDouble7) / local19;
		this.aDouble4 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble9 * this.aDouble9);
		if (this.anInt4610 == -1) {
			this.aDouble5 = ((double) arg1 - this.aDouble8) / local19;
		} else {
			if (!this.aBoolean398) {
				this.aDouble5 = -this.aDouble4 * Math.tan((double) this.anInt4610 * 0.02454369D);
			}
			this.aDouble6 = ((double) arg1 - local19 * this.aDouble5 - this.aDouble8) * 2.0D / (local19 * local19);
		}
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	@Override
	public Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0) {
		@Pc(15) Class49 local15 = this.method3967(arg0, 1024);
		if (local15 == null) {
			return null;
		}
		@Pc(22) Class38 local22 = arg0.method3672();
		local22.method4479(this.anInt4606);
		local22.method4473(this.anInt4601);
		local22.method4470((int) this.aDouble2, (int) this.aDouble8, (int) this.aDouble7);
		if (this.aClass57_Sub6_4 == null) {
			local15.method5825(local22, null, 0);
		} else {
			@Pc(48) Class214 local48 = this.aClass57_Sub6_4.method3844();
			arg0.method3692(local15, local48, local22, null);
		}
		this.anInt4600 = local15.method5842();
		this.method3965(local15, arg0);
		return null;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	public void method3964() {
		if (this.aClass57_Sub6_4 != null) {
			this.aClass57_Sub6_4.method3845();
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V")
	@Override
	public void method5761() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!wp;Lclient!dr;I)V")
	private void method3965(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class37 arg1) {
		@Pc(6) Class197[] local6 = arg0.method5828();
		@Pc(18) Class136[] local18 = arg0.method5832();
		if ((this.aClass57_Sub6_4 == null || this.aClass57_Sub6_4.aBoolean379) && (local6 != null || local18 != null)) {
			this.aClass57_Sub6_4 = new Class57_Sub6(Static6.anInt91);
		}
		if (this.aClass57_Sub6_4 != null) {
			this.aClass57_Sub6_4.method3854(arg1, (long) Static6.anInt91, local6, local18);
			this.aClass57_Sub6_4.method3843(super.aByte77, super.aShort89, super.aShort88, super.aShort90, super.aShort87);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZILclient!la;IIILclient!dr;)V")
	@Override
	public void method5762(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IILclient!dr;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "(I)V")
	@Override
	public void method5767() {
		super.aShort89 = super.aShort88 = (short) (this.aDouble2 / 128.0D);
		super.aShort90 = super.aShort87 = (short) (this.aDouble7 / 128.0D);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!dr;II)Lclient!wp;")
	private Class49 method3967(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class177 local10 = Static41.method4707(this.anInt4584);
		return local10.method4854(this.anInt4612, arg1, this.anInt4583, arg0, this.anInt4596);
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(II)V")
	public void method3969(@OriginalArg(0) int arg0) {
		if (this.anInt4610 == -1) {
			this.aDouble8 += (double) arg0 * this.aDouble5;
		} else {
			this.aDouble8 += (double) arg0 * 0.5D * this.aDouble6 * (double) arg0 + this.aDouble5 * (double) arg0;
			this.aDouble5 += this.aDouble6 * (double) arg0;
		}
		this.aDouble7 += (double) arg0 * this.aDouble3;
		this.aBoolean398 = true;
		this.aDouble2 += (double) arg0 * this.aDouble9;
		this.anInt4601 = (int) (Math.atan2(this.aDouble9, this.aDouble3) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4606 = (int) (Math.atan2(this.aDouble5, this.aDouble4) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass84_1 == null) {
			return;
		}
		this.anInt4583 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt4583 <= this.aClass84_1.anIntArray198[this.anInt4612]) {
						return;
					}
					this.anInt4583 -= this.aClass84_1.anIntArray198[this.anInt4612];
					this.anInt4612++;
					if (this.anInt4612 >= this.aClass84_1.anIntArray197.length) {
						this.anInt4612 -= this.aClass84_1.anInt2452;
						if (this.anInt4612 < 0 || this.aClass84_1.anIntArray197.length <= this.anInt4612) {
							this.anInt4612 = 0;
						}
					}
					this.anInt4596 = this.anInt4612 + 1;
				} while (this.anInt4596 < this.aClass84_1.anIntArray197.length);
				this.anInt4596 -= this.aClass84_1.anInt2452;
			} while (this.anInt4596 >= 0 && this.anInt4596 < this.aClass84_1.anIntArray197.length);
			this.anInt4596 = -1;
		}
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5754(@OriginalArg(0) Class37 arg0) {
		@Pc(13) Class49 local13 = this.method3967(arg0, 0);
		if (local13 == null) {
			return;
		}
		@Pc(19) Class38 local19 = arg0.method3672();
		local19.method4479(this.anInt4606);
		local19.method4473(this.anInt4601);
		local19.method4470((int) this.aDouble2, (int) this.aDouble8, (int) this.aDouble7);
		this.anInt4600 = local13.method5842();
		this.method3965(local13, arg0);
	}

	@OriginalMember(owner = "client!ms", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass57_Sub6_4 != null) {
			this.aClass57_Sub6_4.method3845();
		}
	}
}
