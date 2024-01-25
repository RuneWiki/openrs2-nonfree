import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eka")
public final class Class3_Sub1_Sub4_Sub1 extends Class3_Sub1_Sub4 implements Interface20 {

	@OriginalMember(owner = "client!eka", name = "gb", descriptor = "Lclient!oba;")
	private Class261 aClass261_1;

	@OriginalMember(owner = "client!eka", name = "eb", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!eka", name = "rb", descriptor = "Lclient!mw;")
	public final Class244 aClass244_1;

	@OriginalMember(owner = "client!eka", name = "hb", descriptor = "Z")
	private final boolean aBoolean178;

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(Lclient!ha;Lclient!tba;IIIIIZIII)V")
	public Class3_Sub1_Sub4_Sub1(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class342 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static377.method4942(arg8, arg9));
		this.aClass244_1 = new Class244(arg0, arg1, arg8, arg9, super.aByte141, arg3, this, arg7, arg10);
		this.aBoolean178 = arg1.anInt8742 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IBILclient!ha;)Z")
	@Override
	public boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(17) Class62 local17 = this.aClass244_1.method5008(131072, false, false, arg2);
		if (local17 == null) {
			return false;
		} else {
			@Pc(24) Class92 local24 = arg2.method8078();
			local24.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
			return Static499.aBoolean608 ? local17.method7341(arg0, arg1, local24, false, 0, Static140.anInt8126) : local17.method7347(arg0, arg1, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8492(@OriginalArg(0) Class33 arg0) {
		@Pc(22) Class62 local22 = this.aClass244_1.method5008(262144, true, true, arg0);
		if (local22 == null) {
			return;
		}
		@Pc(29) int local29 = super.anInt9925 >> 9;
		@Pc(34) int local34 = super.anInt9917 >> 9;
		@Pc(37) Class92 local37 = arg0.method8078();
		local37.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
		this.aClass244_1.method5015(false, local29, local29, local22, local34, local37, local34, arg0);
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7085(@OriginalArg(0) Class33 arg0) {
		this.aClass244_1.method5016(arg0);
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lclient!gt;Z)V")
	public void method2404(@OriginalArg(0) Class141 arg0) {
		this.aClass244_1.method5007(arg0);
	}

	@OriginalMember(owner = "client!eka", name = "d", descriptor = "(Z)V")
	@Override
	public void method8504() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class3_Sub6 method8502(@OriginalArg(1) Class33 arg0) {
		@Pc(14) Class62 local14 = this.aClass244_1.method5008(2048, false, true, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class92 local21 = arg0.method8078();
		local21.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
		@Pc(35) Class3_Sub6 local35 = Static665.method8806(1, this.aBoolean178);
		@Pc(40) int local40 = super.anInt9925 >> 9;
		@Pc(45) int local45 = super.anInt9917 >> 9;
		this.aClass244_1.method5015(true, local40, local40, local14, local45, local21, local45, arg0);
		if (Static499.aBoolean608) {
			local14.method7332(local21, local35.aClass3_Sub4Array1[0], Static140.anInt8126, 0);
		} else {
			local14.method7335(local21, local35.aClass3_Sub4Array1[0], 0);
		}
		if (this.aClass244_1.aClass3_Sub7_6 != null) {
			@Pc(95) Class9 local95 = this.aClass244_1.aClass3_Sub7_6.method7301();
			if (Static499.aBoolean608) {
				arg0.method8094(local95, Static140.anInt8126);
			} else {
				arg0.method8085(local95);
			}
		}
		this.aBoolean177 = local14.F() || this.aClass244_1.aClass3_Sub7_6 != null;
		if (this.aClass261_1 == null) {
			this.aClass261_1 = Static386.method4994(super.anInt9915, super.anInt9925, local14, super.anInt9917);
		} else {
			Static239.method3529(super.anInt9915, this.aClass261_1, super.anInt9917, local14, super.anInt9925);
		}
		return local35;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Z)V")
	@Override
	public void method7090() {
	}

	@OriginalMember(owner = "client!eka", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8501() {
		return this.aBoolean177;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(B)I")
	@Override
	public int method7086() {
		return this.aClass244_1.anInt5688;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method7084(@OriginalArg(1) Class33 arg0) {
		this.aClass244_1.method5005(arg0);
	}

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7089() {
		return this.aClass244_1.method5014();
	}

	@OriginalMember(owner = "client!eka", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method8505() {
		return false;
	}

	@OriginalMember(owner = "client!eka", name = "e", descriptor = "(I)I")
	@Override
	public int method8495(@OriginalArg(0) int arg0) {
		return arg0 == -4798 ? this.aClass244_1.method5004((byte) -15) : -67;
	}

	@OriginalMember(owner = "client!eka", name = "f", descriptor = "(I)I")
	@Override
	public int method8499() {
		return this.aClass244_1.method5012();
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lclient!gda;Lclient!ha;IIZII)V")
	@Override
	public void method8491(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8500() {
		return false;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(ZLclient!ha;)Lclient!oba;")
	@Override
	public Class261 method8507(@OriginalArg(1) Class33 arg0) {
		return this.aClass261_1;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(I)I")
	@Override
	public int method7087() {
		return this.aClass244_1.anInt5694;
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(I)I")
	@Override
	public int method7088() {
		return this.aClass244_1.anInt5711;
	}
}
