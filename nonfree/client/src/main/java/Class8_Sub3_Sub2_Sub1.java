import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class8_Sub3_Sub2_Sub1 extends Class8_Sub3_Sub2 implements Interface19 {

	@OriginalMember(owner = "client!ck", name = "D", descriptor = "Lclient!nu;")
	private Class242 aClass242_2;

	@OriginalMember(owner = "client!ck", name = "Z", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!ck", name = "Y", descriptor = "Lclient!kh;")
	public final Class191 aClass191_1;

	@OriginalMember(owner = "client!ck", name = "H", descriptor = "Z")
	private final boolean aBoolean90;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!r;Lclient!et;IIIIIZIIIII)V")
	public Class8_Sub3_Sub2_Sub1(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass191_1 = new Class191(arg0, arg1, arg10, arg11, super.aByte123, arg3, arg4, arg6, arg7, arg12);
		this.aBoolean90 = arg1.anInt2399 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
	@Override
	public void method7639() {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7625(@OriginalArg(1) Class134 arg0) {
		@Pc(21) Class63 local21 = this.aClass191_1.method3850(false, arg0, 262144, true, super.anInt9370, super.anInt9365);
		if (local21 == null) {
			return;
		}
		@Pc(28) int local28 = super.anInt9365 >> 9;
		@Pc(33) int local33 = super.anInt9370 >> 9;
		@Pc(36) Class113 local36 = arg0.method6963();
		local36.NA(super.anInt9365, super.anInt9361, super.anInt9370);
		this.aClass191_1.method3842(local21, local33, local28, local36, false, local28, local33, arg0);
	}

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7620() {
		return this.aBoolean91;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)I")
	@Override
	public int method7640() {
		return this.aClass191_1.anInt4755;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)I")
	@Override
	public int method7628(@OriginalArg(0) byte arg0) {
		if (arg0 <= 39) {
			this.method7639();
		}
		return this.aClass191_1.method3852(-83);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7642(@OriginalArg(0) Class134 arg0) {
		this.aClass191_1.method3851(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)I")
	@Override
	public int method7618() {
		return this.aClass191_1.method3847();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)I")
	@Override
	public int method7637() {
		return this.aClass191_1.anInt4757;
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7641() {
		return this.aClass191_1.method3844();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7636(@OriginalArg(0) Class134 arg0) {
		this.aClass191_1.method3854(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)I")
	@Override
	public int method7638() {
		return this.aClass191_1.anInt4749;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(ILclient!r;)Lclient!nu;")
	@Override
	public Class242 method7627(@OriginalArg(1) Class134 arg0) {
		return this.aClass242_2;
	}

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7622() {
		return false;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7626(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class63 local16 = this.aClass191_1.method3850(false, arg1, 131072, false, super.anInt9370, super.anInt9365);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class113 local28 = arg1.method6963();
			local28.NA(super.anInt9365 + super.aShort51, super.anInt9361, super.aShort50 + super.anInt9370);
			return Static181.aBoolean242 ? local16.method7419(arg2, arg0, local28, false, Static40.anInt631) : local16.method7415(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(Lclient!r;Z)Lclient!kq;")
	@Override
	public Class8_Sub5 method7630(@OriginalArg(0) Class134 arg0) {
		@Pc(18) Class63 local18 = this.aClass191_1.method3850(false, arg0, 2048, true, super.anInt9370, super.anInt9365);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class113 local25 = arg0.method6963();
		local25.NA(super.aShort51 + super.anInt9365, super.anInt9361, super.anInt9370 + super.aShort50);
		@Pc(42) Class8_Sub5 local42 = null;
		if (this.aBoolean90) {
			local42 = Static418.method5818(1);
		}
		@Pc(54) int local54 = super.anInt9365 >> 9;
		@Pc(59) int local59 = super.anInt9370 >> 9;
		this.aClass191_1.method3842(local18, local59, local54, local25, true, local54, local59, arg0);
		if (Static181.aBoolean242) {
			local18.method7420(local25, local42 == null ? null : local42.aClass8_Sub4Array1[0], Static40.anInt631, 0);
		} else {
			local18.method7429(local25, local42 == null ? null : local42.aClass8_Sub4Array1[0], 0);
		}
		if (this.aClass191_1.aClass8_Sub7_4 != null) {
			@Pc(109) Class343 local109 = this.aClass191_1.aClass8_Sub7_4.method4402();
			if (Static181.aBoolean242) {
				arg0.method6947(local109, Static40.anInt631);
			} else {
				arg0.method6940(local109);
			}
		}
		this.aBoolean91 = local18.LA() || this.aClass191_1.aClass8_Sub7_4 != null;
		if (this.aClass242_2 == null) {
			this.aClass242_2 = Static82.method1472(super.anInt9370, super.anInt9365, local18, super.anInt9361);
		} else {
			Static272.method3862(local18, this.aClass242_2, super.anInt9361, super.anInt9370, super.anInt9365);
		}
		return local42;
	}
}
