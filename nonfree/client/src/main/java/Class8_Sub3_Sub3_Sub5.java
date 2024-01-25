import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class8_Sub3_Sub3_Sub5 extends Class8_Sub3_Sub3 implements Interface19 {

	@OriginalMember(owner = "client!vp", name = "ab", descriptor = "Lclient!nu;")
	private Class242 aClass242_8;

	@OriginalMember(owner = "client!vp", name = "X", descriptor = "Z")
	private boolean aBoolean733 = false;

	@OriginalMember(owner = "client!vp", name = "Y", descriptor = "Lclient!kh;")
	public final Class191 aClass191_4;

	@OriginalMember(owner = "client!vp", name = "I", descriptor = "Z")
	private final boolean aBoolean732;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!r;Lclient!et;IIIIIZIIIIIII)V")
	public Class8_Sub3_Sub3_Sub5(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt2434 == 1, Static349.method4738(arg12, arg13));
		this.aClass191_4 = new Class191(arg0, arg1, arg12, arg13, super.aByte123, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean732 = arg1.anInt2399 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)I")
	@Override
	public int method7628(@OriginalArg(0) byte arg0) {
		if (arg0 <= 39) {
			this.method7620();
		}
		return this.aClass191_4.method3852(-99);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IZLclient!r;Lclient!rga;IIZ)V")
	@Override
	public void method7623(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class8_Sub3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7642(@OriginalArg(0) Class134 arg0) {
		this.aClass191_4.method3851(arg0);
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(Lclient!r;Z)Lclient!kq;")
	@Override
	public Class8_Sub5 method7630(@OriginalArg(0) Class134 arg0) {
		@Pc(18) Class63 local18 = this.aClass191_4.method3850(false, arg0, 2048, true, super.anInt9370, super.anInt9365);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class113 local25 = arg0.method6963();
		local25.NA(super.anInt9365, super.anInt9361, super.anInt9370);
		@Pc(35) Class8_Sub5 local35 = null;
		if (this.aBoolean732) {
			local35 = Static418.method5818(1);
		}
		this.aClass191_4.method3842(local18, super.aShort131, super.aShort133, local25, true, super.aShort132, super.aShort130, arg0);
		if (Static181.aBoolean242) {
			local18.method7420(local25, local35 == null ? null : local35.aClass8_Sub4Array1[0], Static40.anInt631, 0);
		} else {
			local18.method7429(local25, local35 == null ? null : local35.aClass8_Sub4Array1[0], 0);
		}
		if (this.aClass191_4.aClass8_Sub7_4 != null) {
			@Pc(96) Class343 local96 = this.aClass191_4.aClass8_Sub7_4.method4402();
			if (Static181.aBoolean242) {
				arg0.method6947(local96, Static40.anInt631);
			} else {
				arg0.method6940(local96);
			}
		}
		this.aBoolean733 = local18.LA() || this.aClass191_4.aClass8_Sub7_4 != null;
		if (this.aClass242_8 == null) {
			this.aClass242_8 = Static82.method1472(super.anInt9370, super.anInt9365, local18, super.anInt9361);
		} else {
			Static272.method3862(local18, this.aClass242_8, super.anInt9361, super.anInt9370, super.anInt9365);
		}
		return local35;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)V")
	@Override
	public void method7639() {
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)I")
	@Override
	public int method7637() {
		return this.aClass191_4.anInt4757;
	}

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "(I)V")
	@Override
	public void method7617() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7636(@OriginalArg(0) Class134 arg0) {
		this.aClass191_4.method3854(arg0);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7625(@OriginalArg(1) Class134 arg0) {
		@Pc(21) Class63 local21 = this.aClass191_4.method3850(true, arg0, 262144, true, super.anInt9370, super.anInt9365);
		if (local21 != null) {
			@Pc(26) Class113 local26 = arg0.method6963();
			local26.NA(super.anInt9365, super.anInt9361, super.anInt9370);
			this.aClass191_4.method3842(local21, super.aShort131, super.aShort133, local26, false, super.aShort132, super.aShort130, arg0);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)I")
	@Override
	public int method7640() {
		return this.aClass191_4.anInt4755;
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7641() {
		return this.aClass191_4.method3844();
	}

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7622() {
		return false;
	}

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "(I)I")
	@Override
	public int method7618() {
		return this.aClass191_4.method3847();
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(ILclient!r;)Lclient!nu;")
	@Override
	public Class242 method7627(@OriginalArg(1) Class134 arg0) {
		return this.aClass242_8;
	}

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7620() {
		return this.aBoolean733;
	}

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7629() {
		return false;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7626(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class63 local16 = this.aClass191_4.method3850(false, arg1, 131072, false, super.anInt9370, super.anInt9365);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class113 local23 = arg1.method6963();
			local23.NA(super.anInt9365, super.anInt9361, super.anInt9370);
			return Static181.aBoolean242 ? local16.method7419(arg2, arg0, local23, false, Static40.anInt631) : local16.method7415(arg2, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)I")
	@Override
	public int method7638() {
		return this.aClass191_4.anInt4749;
	}
}
