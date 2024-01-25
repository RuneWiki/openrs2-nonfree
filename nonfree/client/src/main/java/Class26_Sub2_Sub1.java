import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class26_Sub2_Sub1 extends Class26_Sub2 {

	@OriginalMember(owner = "client!bn", name = "O", descriptor = "Lclient!li;")
	private Class28_Sub3 aClass28_Sub3_1;

	@OriginalMember(owner = "client!bn", name = "B", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
	private int anInt560 = 0;

	@OriginalMember(owner = "client!bn", name = "N", descriptor = "I")
	private final int anInt571 = -1;

	@OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
	private int anInt562 = 0;

	@OriginalMember(owner = "client!bn", name = "W", descriptor = "I")
	private int anInt579 = 0;

	@OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
	private int anInt578 = -32768;

	@OriginalMember(owner = "client!bn", name = "J", descriptor = "I")
	public final int anInt567;

	@OriginalMember(owner = "client!bn", name = "T", descriptor = "I")
	private final int anInt576;

	@OriginalMember(owner = "client!bn", name = "S", descriptor = "I")
	private final int anInt575;

	@OriginalMember(owner = "client!bn", name = "H", descriptor = "Lclient!lc;")
	private Class139 aClass139_1;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class26_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt567 = arg1 + arg2;
		this.anInt562 = arg12;
		this.anInt576 = arg4;
		this.anInt575 = arg0;
		@Pc(49) Class105 local49 = Static79.aClass231_1.method4830(this.anInt575);
		@Pc(52) int local52 = local49.anInt2900;
		if (local52 == -1) {
			this.aBoolean24 = true;
		} else {
			this.aClass139_1 = Static364.aClass151_2.method3293(local52);
			this.aBoolean24 = false;
		}
		if (this.anInt567 == arg2) {
			Static454.method5772(this.aClass139_1, false, super.anInt7383, super.aByte102, super.anInt7388, this.anInt560);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	public void method459() {
		if (this.aClass28_Sub3_1 != null) {
			this.aClass28_Sub3_1.method3171();
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
	@Override
	public void method5715() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5721() {
		return false;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BI)V")
	public void method461(@OriginalArg(1) int arg0) {
		if (this.aBoolean24) {
			return;
		}
		this.anInt579 += arg0;
		while (this.aClass139_1.anIntArray345[this.anInt560] < this.anInt579) {
			this.anInt579 -= this.aClass139_1.anIntArray345[this.anInt560];
			this.anInt560++;
			if (this.anInt560 >= this.aClass139_1.anIntArray344.length) {
				this.aBoolean24 = true;
				break;
			}
		}
		if (!this.aBoolean24) {
			Static454.method5772(this.aClass139_1, false, super.anInt7383, super.aByte102, super.anInt7388, this.anInt560);
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		@Pc(18) Class163 local18 = this.method465((this.anInt562 == 0 ? 0 : 5) | 0x800, this.anInt575, arg0);
		if (local18 == null) {
			return null;
		}
		if (this.anInt562 != 0) {
			local18.Q(this.anInt562 * 2048);
		}
		@Pc(37) Class33 local37 = arg0.method5285();
		local37.j(super.anInt7388, super.anInt7390, super.anInt7383);
		if (this.aClass28_Sub3_1 == null) {
			local18.method4667(local37, null, 0);
		} else {
			@Pc(59) Class201 local59 = this.aClass28_Sub3_1.method3164();
			arg0.method5291(local18, local59, local37, null);
		}
		this.anInt578 = local18.MA();
		this.method464(local18, arg0);
		return null;
	}

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "(I)I")
	@Override
	public int method5695() {
		return this.anInt578;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!ya;IIILclient!qj;IZ)V")
	@Override
	public void method5712(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
		@Pc(17) Class163 local17 = this.method465(0, this.anInt575, arg0);
		if (local17 != null) {
			this.method464(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!bn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass28_Sub3_1 != null) {
			this.aClass28_Sub3_1.method3171();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!t;Lclient!ya;I)V")
	private void method464(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class51 arg1) {
		@Pc(6) Class167[] local6 = arg0.method4661();
		@Pc(9) Class52[] local9 = arg0.method4663();
		if ((this.aClass28_Sub3_1 == null || this.aClass28_Sub3_1.aBoolean248) && (local6 != null || local9 != null)) {
			this.aClass28_Sub3_1 = new Class28_Sub3(Static274.anInt4617);
		}
		if (this.aClass28_Sub3_1 != null) {
			this.aClass28_Sub3_1.method3166(arg1, (long) Static274.anInt4617, local6, local9);
			this.aClass28_Sub3_1.method3172(super.aByte102, super.aShort105, super.aShort104, super.aShort103, super.aShort102);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIILclient!ya;)Lclient!t;")
	private Class163 method465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class51 arg2) {
		@Pc(15) Class105 local15 = Static79.aClass231_1.method4830(arg1);
		@Pc(20) Class165 local20 = Static149.aClass165Array7[super.aByte102];
		@Pc(33) Class165 local33 = this.anInt576 < 3 ? Static149.aClass165Array7[this.anInt576 + 1] : null;
		return this.aBoolean24 ? local15.method2331(Static364.aClass151_2, 0, -1, super.anInt7390, super.anInt7383, -1, local33, arg2, arg0, super.anInt7388, local20) : local15.method2331(Static364.aClass151_2, this.anInt579, this.anInt560, super.anInt7390, super.anInt7383, this.anInt571, local33, arg2, arg0, super.anInt7388, local20);
	}
}
