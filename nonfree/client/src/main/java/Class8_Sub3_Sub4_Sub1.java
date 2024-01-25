import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class8_Sub3_Sub4_Sub1 extends Class8_Sub3_Sub4 implements Interface19 {

	@OriginalMember(owner = "client!lj", name = "T", descriptor = "Lclient!nu;")
	private Class242 aClass242_5;

	@OriginalMember(owner = "client!lj", name = "N", descriptor = "Z")
	private boolean aBoolean419 = false;

	@OriginalMember(owner = "client!lj", name = "X", descriptor = "Lclient!kh;")
	public final Class191 aClass191_3;

	@OriginalMember(owner = "client!lj", name = "J", descriptor = "Z")
	private final boolean aBoolean417;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!r;Lclient!et;IIIIIZIII)V")
	public Class8_Sub3_Sub4_Sub1(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static237.method3599(arg9, arg8));
		this.aClass191_3 = new Class191(arg0, arg1, arg8, arg9, super.aByte123, arg3, super.anInt9365, super.anInt9370, arg7, arg10);
		this.aBoolean417 = arg1.anInt2399 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)I")
	@Override
	public int method7637() {
		return this.aClass191_3.anInt4757;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7625(@OriginalArg(1) Class134 arg0) {
		@Pc(19) Class63 local19 = this.aClass191_3.method3850(true, arg0, 262144, true, super.anInt9370, super.anInt9365);
		if (local19 == null) {
			return;
		}
		@Pc(26) int local26 = super.anInt9365 >> 9;
		@Pc(31) int local31 = super.anInt9370 >> 9;
		@Pc(34) Class113 local34 = arg0.method6963();
		local34.NA(super.anInt9365, super.anInt9361, super.anInt9370);
		this.aClass191_3.method3842(local19, local31, local26, local34, false, local26, local31, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7642(@OriginalArg(0) Class134 arg0) {
		this.aClass191_3.method3851(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7620() {
		return this.aBoolean419;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZLclient!r;Lclient!rga;IIZ)V")
	@Override
	public void method7623(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class8_Sub3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(ILclient!r;)Lclient!nu;")
	@Override
	public Class242 method7627(@OriginalArg(1) Class134 arg0) {
		return this.aClass242_5;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7636(@OriginalArg(0) Class134 arg0) {
		this.aClass191_3.method3854(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V")
	@Override
	public void method7617() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7622() {
		return false;
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7641() {
		return this.aClass191_3.method3844();
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(Lclient!r;Z)Lclient!kq;")
	@Override
	public Class8_Sub5 method7630(@OriginalArg(0) Class134 arg0) {
		@Pc(18) Class63 local18 = this.aClass191_3.method3850(false, arg0, 2048, true, super.anInt9370, super.anInt9365);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class113 local25 = arg0.method6963();
		local25.NA(super.anInt9365, super.anInt9361, super.anInt9370);
		@Pc(35) Class8_Sub5 local35 = null;
		if (this.aBoolean417) {
			local35 = Static418.method5818(1);
		}
		@Pc(47) int local47 = super.anInt9365 >> 9;
		@Pc(52) int local52 = super.anInt9370 >> 9;
		this.aClass191_3.method3842(local18, local52, local47, local25, true, local47, local52, arg0);
		if (Static181.aBoolean242) {
			local18.method7420(local25, local35 == null ? null : local35.aClass8_Sub4Array1[0], Static40.anInt631, 0);
		} else {
			local18.method7429(local25, local35 == null ? null : local35.aClass8_Sub4Array1[0], 0);
		}
		if (this.aClass191_3.aClass8_Sub7_4 != null) {
			@Pc(102) Class343 local102 = this.aClass191_3.aClass8_Sub7_4.method4402();
			if (Static181.aBoolean242) {
				arg0.method6947(local102, Static40.anInt631);
			} else {
				arg0.method6940(local102);
			}
		}
		this.aBoolean419 = local18.LA() || this.aClass191_3.aClass8_Sub7_4 != null;
		if (this.aClass242_5 == null) {
			this.aClass242_5 = Static82.method1472(super.anInt9370, super.anInt9365, local18, super.anInt9361);
		} else {
			Static272.method3862(local18, this.aClass242_5, super.anInt9361, super.anInt9370, super.anInt9365);
		}
		return local35;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)I")
	@Override
	public int method7628(@OriginalArg(0) byte arg0) {
		if (arg0 <= 39) {
			Static301.anInt5192 = -103;
		}
		return this.aClass191_3.method3852(-82);
	}

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7629() {
		return false;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7626(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class63 local21 = this.aClass191_3.method3850(false, arg1, 131072, false, super.anInt9370, super.anInt9365);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class113 local28 = arg1.method6963();
			local28.NA(super.anInt9365, super.anInt9361, super.anInt9370);
			return Static181.aBoolean242 ? local21.method7419(arg2, arg0, local28, false, Static40.anInt631) : local21.method7415(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)I")
	@Override
	public int method7638() {
		return this.aClass191_3.anInt4749;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
	@Override
	public void method7639() {
	}

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)I")
	@Override
	public int method7618() {
		return this.aClass191_3.method3847();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)I")
	@Override
	public int method7640() {
		return this.aClass191_3.anInt4755;
	}
}
