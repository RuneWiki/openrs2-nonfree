import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class3_Sub1_Sub2_Sub4 extends Class3_Sub1_Sub2 implements Interface20 {

	@OriginalMember(owner = "client!laa", name = "lb", descriptor = "Lclient!tja;")
	public static final Class352 lb = new Class352(8);

	@OriginalMember(owner = "client!laa", name = "U", descriptor = "Lclient!oba;")
	private Class261 aClass261_5;

	@OriginalMember(owner = "client!laa", name = "qb", descriptor = "Z")
	private boolean aBoolean396 = false;

	@OriginalMember(owner = "client!laa", name = "gb", descriptor = "Lclient!mw;")
	public Class244 aClass244_2;

	@OriginalMember(owner = "client!laa", name = "X", descriptor = "Z")
	private final boolean aBoolean395;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lclient!ha;Lclient!tba;IIIIIZIIIIIII)V")
	public Class3_Sub1_Sub2_Sub4(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class342 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8693 == 1, Static521.method7028(arg12, arg13));
		this.aClass244_2 = new Class244(arg0, arg1, arg12, arg13, super.aByte141, arg3, this, arg7, arg14);
		this.aBoolean395 = arg1.anInt8742 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method8505() {
		return false;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7085(@OriginalArg(0) Class33 arg0) {
		this.aClass244_2.method5016(arg0);
	}

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "(I)I")
	@Override
	public int method8495(@OriginalArg(0) int arg0) {
		if (arg0 != -4798) {
			this.aClass244_2 = null;
		}
		return this.aClass244_2.method5004((byte) -15);
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)I")
	@Override
	public int method7088() {
		return this.aClass244_2.anInt5711;
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class3_Sub6 method8502(@OriginalArg(1) Class33 arg0) {
		@Pc(14) Class62 local14 = this.aClass244_2.method5008(2048, false, true, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class92 local21 = arg0.method8078();
		local21.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
		@Pc(35) Class3_Sub6 local35 = Static665.method8806(1, this.aBoolean395);
		this.aClass244_2.method5015(true, super.aShort123, super.aShort124, local14, super.aShort122, local21, super.aShort125, arg0);
		if (Static499.aBoolean608) {
			local14.method7332(local21, local35.aClass3_Sub4Array1[0], Static140.anInt8126, 0);
		} else {
			local14.method7335(local21, local35.aClass3_Sub4Array1[0], 0);
		}
		if (this.aClass244_2.aClass3_Sub7_6 != null) {
			@Pc(89) Class9 local89 = this.aClass244_2.aClass3_Sub7_6.method7301();
			if (Static499.aBoolean608) {
				arg0.method8094(local89, Static140.anInt8126);
			} else {
				arg0.method8085(local89);
			}
		}
		this.aBoolean396 = local14.F() || this.aClass244_2.aClass3_Sub7_6 != null;
		if (this.aClass261_5 == null) {
			this.aClass261_5 = Static386.method4994(super.anInt9915, super.anInt9925, local14, super.anInt9917);
		} else {
			Static239.method3529(super.anInt9915, this.aClass261_5, super.anInt9917, local14, super.anInt9925);
		}
		return local35;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)I")
	@Override
	public int method7087() {
		return this.aClass244_2.anInt5694;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)I")
	@Override
	public int method7086() {
		return this.aClass244_2.anInt5688;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method7084(@OriginalArg(1) Class33 arg0) {
		this.aClass244_2.method5005(arg0);
	}

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "(Z)V")
	@Override
	public void method8504() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IBILclient!ha;)Z")
	@Override
	public boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(18) Class62 local18 = this.aClass244_2.method5008(131072, false, false, arg2);
		if (local18 == null) {
			return false;
		} else {
			@Pc(25) Class92 local25 = arg2.method8078();
			local25.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
			return Static499.aBoolean608 ? local18.method7341(arg0, arg1, local25, false, 0, Static140.anInt8126) : local18.method7347(arg0, arg1, local25, false, 0);
		}
	}

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "(I)I")
	@Override
	public int method8499() {
		return this.aClass244_2.method5012();
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZLclient!ha;)Lclient!oba;")
	@Override
	public Class261 method8507(@OriginalArg(1) Class33 arg0) {
		return this.aClass261_5;
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7089() {
		return this.aClass244_2.method5014();
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!gda;Lclient!ha;IIZII)V")
	@Override
	public void method8491(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8500() {
		return false;
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8492(@OriginalArg(0) Class33 arg0) {
		@Pc(16) Class62 local16 = this.aClass244_2.method5008(262144, true, true, arg0);
		if (local16 != null) {
			@Pc(21) Class92 local21 = arg0.method8078();
			local21.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
			this.aClass244_2.method5015(false, super.aShort123, super.aShort124, local16, super.aShort122, local21, super.aShort125, arg0);
		}
	}

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8501() {
		return this.aBoolean396;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7090() {
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILclient!gt;)V")
	public void method4558(@OriginalArg(1) Class141 arg0) {
		this.aClass244_2.method5007(arg0);
	}
}
