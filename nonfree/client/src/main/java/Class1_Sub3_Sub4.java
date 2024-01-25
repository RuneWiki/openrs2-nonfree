import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ml", name = "S", descriptor = "Lclient!wp;")
	private Class13_Sub8 aClass13_Sub8_2;

	@OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
	private int anInt4702 = 0;

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "Z")
	public boolean aBoolean355 = false;

	@OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
	private int anInt4698 = 0;

	@OriginalMember(owner = "client!ml", name = "Y", descriptor = "I")
	private final int anInt4708 = -1;

	@OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
	private int anInt4697 = 0;

	@OriginalMember(owner = "client!ml", name = "Z", descriptor = "I")
	private int anInt4709 = -32768;

	@OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
	public final int anInt4695;

	@OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
	private final int anInt4694;

	@OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
	private final int anInt4696;

	@OriginalMember(owner = "client!ml", name = "J", descriptor = "Lclient!hi;")
	private Class96 aClass96_1;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class1_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt4698 = arg12;
		this.anInt4695 = arg2 + arg1;
		this.anInt4694 = arg0;
		this.anInt4696 = arg4;
		@Pc(49) Class186 local49 = Static102.aClass91_2.method2560(this.anInt4694);
		@Pc(52) int local52 = local49.anInt5611;
		if (local52 == -1) {
			this.aBoolean355 = true;
		} else {
			this.aClass96_1 = Static196.aClass30_2.method942(local52);
			this.aBoolean355 = false;
		}
		if (arg2 == this.anInt4695) {
			Static86.method1483(super.anInt6053, this.anInt4702, super.aByte77, super.anInt6055, this.aClass96_1, false);
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(Lclient!qa;B)Lclient!vs;")
	@Override
	public Class13_Sub7 method5837(@OriginalArg(0) Class75 arg0) {
		@Pc(18) Class31 local18 = this.method3830((this.anInt4698 == 0 ? 0 : 5) | 0x800, this.anInt4694, arg0);
		if (local18 == null) {
			return null;
		}
		if (this.anInt4698 != 0) {
			local18.k(this.anInt4698 * 2048);
		}
		@Pc(37) Class106 local37 = arg0.method2587();
		local37.R(super.anInt6053, super.anInt6045, super.anInt6055);
		if (this.aClass13_Sub8_2 == null) {
			local18.method5704(local37, null, 0);
		} else {
			@Pc(60) Class116 local60 = this.aClass13_Sub8_2.method5943();
			arg0.method2571(local18, local60, local37, null);
		}
		this.anInt4709 = local18.b();
		this.method3831(arg0, local18);
		return null;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	@Override
	public void method5838() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLclient!rn;ZIILclient!qa;I)V")
	@Override
	public void method5836(@OriginalArg(1) Class1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5840(@OriginalArg(1) Class75 arg0) {
		@Pc(21) Class31 local21 = this.method3830(0, this.anInt4694, arg0);
		if (local21 != null) {
			this.method3831(arg0, local21);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public void method3828() {
		if (this.aClass13_Sub8_2 != null) {
			this.aClass13_Sub8_2.method5946();
		}
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5839() {
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
	public void method3829(@OriginalArg(0) int arg0) {
		if (this.aBoolean355) {
			return;
		}
		this.anInt4697 += arg0;
		while (this.anInt4697 > this.aClass96_1.anIntArray254[this.anInt4702]) {
			this.anInt4697 -= this.aClass96_1.anIntArray254[this.anInt4702];
			this.anInt4702++;
			if (this.anInt4702 >= this.aClass96_1.anIntArray253.length) {
				this.aBoolean355 = true;
				break;
			}
		}
		if (!this.aBoolean355) {
			Static86.method1483(super.anInt6053, this.anInt4702, super.aByte77, super.anInt6055, this.aClass96_1, false);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZILclient!qa;)Z")
	@Override
	public boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "(I)I")
	@Override
	public int method4828() {
		return this.anInt4709;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILclient!qa;Z)Lclient!c;")
	private Class31 method3830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2) {
		@Pc(8) Class186 local8 = Static102.aClass91_2.method2560(arg1);
		@Pc(21) Class64 local21 = Static205.aClass64Array2[super.aByte77];
		@Pc(34) Class64 local34 = this.anInt4696 >= 3 ? null : Static205.aClass64Array2[this.anInt4696 + 1];
		return this.aBoolean355 ? local8.method4525(super.anInt6055, arg0, local21, super.anInt6045, local34, arg2, 0, -1, -1, super.anInt6053, Static196.aClass30_2) : local8.method4525(super.anInt6055, arg0, local21, super.anInt6045, local34, arg2, this.anInt4697, this.anInt4702, this.anInt4708, super.anInt6053, Static196.aClass30_2);
	}

	@OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass13_Sub8_2 != null) {
			this.aClass13_Sub8_2.method5946();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!qa;Lclient!c;Z)V")
	private void method3831(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class31 arg1) {
		@Pc(6) Class209[] local6 = arg1.method5707();
		@Pc(13) Class178[] local13 = arg1.method5705();
		if ((this.aClass13_Sub8_2 == null || this.aClass13_Sub8_2.aBoolean522) && (local6 != null || local13 != null)) {
			this.aClass13_Sub8_2 = new Class13_Sub8(Static290.anInt5325);
		}
		if (this.aClass13_Sub8_2 != null) {
			this.aClass13_Sub8_2.method5940(arg0, (long) Static290.anInt5325, local6, local13);
			this.aClass13_Sub8_2.method5948(super.aByte77, super.aShort181, super.aShort180, super.aShort179, super.aShort178);
		}
	}
}
