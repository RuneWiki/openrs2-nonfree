import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class3_Sub1_Sub3_Sub2 extends Class3_Sub1_Sub3 implements Interface20 {

	@OriginalMember(owner = "client!mf", name = "R", descriptor = "Lclient!oba;")
	private Class261 aClass261_6;

	@OriginalMember(owner = "client!mf", name = "hb", descriptor = "Z")
	private boolean aBoolean419 = false;

	@OriginalMember(owner = "client!mf", name = "ib", descriptor = "Lclient!mw;")
	public final Class244 aClass244_3;

	@OriginalMember(owner = "client!mf", name = "Z", descriptor = "Z")
	private final boolean aBoolean418;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!ha;Lclient!tba;IIIIIZIIIII)V")
	public Class3_Sub1_Sub3_Sub2(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class342 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass244_3 = new Class244(arg0, arg1, arg10, arg11, super.aByte141, arg3, this, arg7, arg12);
		this.aBoolean418 = arg1.anInt8742 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7085(@OriginalArg(0) Class33 arg0) {
		this.aClass244_3.method5016(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)I")
	@Override
	public int method7086() {
		return this.aClass244_3.anInt5688;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)I")
	@Override
	public int method7088() {
		return this.aClass244_3.anInt5711;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8501() {
		return this.aBoolean419;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8500() {
		return false;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!gt;I)V")
	public void method4905(@OriginalArg(0) Class141 arg0) {
		this.aClass244_3.method5007(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBILclient!ha;)Z")
	@Override
	public boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(12) Class62 local12 = this.aClass244_3.method5008(131072, false, false, arg2);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class92 local19 = arg2.method8078();
			local19.method3854(super.aShort87 + super.anInt9925, super.anInt9915, super.aShort88 + super.anInt9917);
			return Static499.aBoolean608 ? local12.method7341(arg0, arg1, local19, false, 0, Static140.anInt8126) : local12.method7347(arg0, arg1, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class3_Sub6 method8502(@OriginalArg(1) Class33 arg0) {
		@Pc(14) Class62 local14 = this.aClass244_3.method5008(2048, false, true, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class92 local21 = arg0.method8078();
		local21.method3854(super.anInt9925 + super.aShort87, super.anInt9915, super.aShort88 + super.anInt9917);
		@Pc(42) Class3_Sub6 local42 = Static665.method8806(1, this.aBoolean418);
		@Pc(47) int local47 = super.anInt9925 >> 9;
		@Pc(52) int local52 = super.anInt9917 >> 9;
		this.aClass244_3.method5015(true, local47, local47, local14, local52, local21, local52, arg0);
		if (Static499.aBoolean608) {
			local14.method7332(local21, local42.aClass3_Sub4Array1[0], Static140.anInt8126, 0);
		} else {
			local14.method7335(local21, local42.aClass3_Sub4Array1[0], 0);
		}
		if (this.aClass244_3.aClass3_Sub7_6 != null) {
			@Pc(102) Class9 local102 = this.aClass244_3.aClass3_Sub7_6.method7301();
			if (Static499.aBoolean608) {
				arg0.method8094(local102, Static140.anInt8126);
			} else {
				arg0.method8085(local102);
			}
		}
		this.aBoolean419 = local14.F() || this.aClass244_3.aClass3_Sub7_6 != null;
		if (this.aClass261_6 == null) {
			this.aClass261_6 = Static386.method4994(super.anInt9915, super.anInt9925, local14, super.anInt9917);
		} else {
			Static239.method3529(super.anInt9915, this.aClass261_6, super.anInt9917, local14, super.anInt9925);
		}
		return local42;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)I")
	@Override
	public int method7087() {
		return this.aClass244_3.anInt5694;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7089() {
		return this.aClass244_3.method5014();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method7084(@OriginalArg(1) Class33 arg0) {
		this.aClass244_3.method5005(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
	@Override
	public void method7090() {
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLclient!ha;)Lclient!oba;")
	@Override
	public Class261 method8507(@OriginalArg(1) Class33 arg0) {
		return this.aClass261_6;
	}

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)I")
	@Override
	public int method8499() {
		return this.aClass244_3.method5012();
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8492(@OriginalArg(0) Class33 arg0) {
		@Pc(14) Class62 local14 = this.aClass244_3.method5008(262144, false, true, arg0);
		if (local14 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt9925 >> 9;
		@Pc(32) int local32 = super.anInt9917 >> 9;
		@Pc(35) Class92 local35 = arg0.method8078();
		local35.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
		this.aClass244_3.method5015(false, local27, local27, local14, local32, local35, local32, arg0);
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)I")
	@Override
	public int method8495(@OriginalArg(0) int arg0) {
		return arg0 == -4798 ? this.aClass244_3.method5004((byte) -15) : 31;
	}
}
