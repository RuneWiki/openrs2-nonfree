import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class3_Sub1_Sub5_Sub2 extends Class3_Sub1_Sub5 implements Interface20 {

	@OriginalMember(owner = "client!ra", name = "kb", descriptor = "Lclient!oba;")
	private Class261 aClass261_7;

	@OriginalMember(owner = "client!ra", name = "V", descriptor = "Z")
	private boolean aBoolean623 = false;

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "Lclient!mw;")
	public final Class244 aClass244_4;

	@OriginalMember(owner = "client!ra", name = "W", descriptor = "Z")
	private final boolean aBoolean624;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!ha;Lclient!tba;IIIIIZII)V")
	public Class3_Sub1_Sub5_Sub2(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class342 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt8715);
		this.aClass244_4 = new Class244(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean624 = arg1.anInt8742 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method8505() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
	@Override
	public int method7087() {
		return this.aClass244_4.anInt5694;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)I")
	@Override
	public int method7088() {
		return this.aClass244_4.anInt5711;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8492(@OriginalArg(0) Class33 arg0) {
		@Pc(18) Class62 local18 = this.aClass244_4.method5008(262144, true, true, arg0);
		if (local18 == null) {
			return;
		}
		@Pc(25) int local25 = super.anInt9925 >> 9;
		@Pc(30) int local30 = super.anInt9917 >> 9;
		@Pc(33) Class92 local33 = arg0.method8078();
		local33.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
		this.aClass244_4.method5015(false, local25, local25, local18, local30, local33, local30, arg0);
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)I")
	@Override
	public int method8495(@OriginalArg(0) int arg0) {
		if (arg0 != -4798) {
			this.method8500();
		}
		return this.aClass244_4.method5004((byte) -15);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)I")
	@Override
	public int method7086() {
		return this.aClass244_4.anInt5688;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBILclient!ha;)Z")
	@Override
	public boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(12) Class62 local12 = this.aClass244_4.method5008(131072, false, false, arg2);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class92 local19 = arg2.method8078();
			local19.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
			return Static499.aBoolean608 ? local12.method7341(arg0, arg1, local19, false, 0, Static140.anInt8126) : local12.method7347(arg0, arg1, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method7084(@OriginalArg(1) Class33 arg0) {
		this.aClass244_4.method5005(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(Z)V")
	@Override
	public void method8504() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7085(@OriginalArg(0) Class33 arg0) {
		this.aClass244_4.method5016(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8500() {
		return false;
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)I")
	@Override
	public int method8499() {
		return this.aClass244_4.method5012();
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class3_Sub6 method8502(@OriginalArg(1) Class33 arg0) {
		@Pc(22) Class62 local22 = this.aClass244_4.method5008(2048, false, true, arg0);
		if (local22 == null) {
			return null;
		}
		@Pc(29) Class92 local29 = arg0.method8078();
		local29.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
		@Pc(43) Class3_Sub6 local43 = Static665.method8806(1, this.aBoolean624);
		@Pc(48) int local48 = super.anInt9925 >> 9;
		@Pc(53) int local53 = super.anInt9917 >> 9;
		this.aClass244_4.method5015(true, local48, local48, local22, local53, local29, local53, arg0);
		if (Static499.aBoolean608) {
			local22.method7332(local29, local43.aClass3_Sub4Array1[0], Static140.anInt8126, 0);
		} else {
			local22.method7335(local29, local43.aClass3_Sub4Array1[0], 0);
		}
		if (this.aClass244_4.aClass3_Sub7_6 != null) {
			@Pc(95) Class9 local95 = this.aClass244_4.aClass3_Sub7_6.method7301();
			if (Static499.aBoolean608) {
				arg0.method8094(local95, Static140.anInt8126);
			} else {
				arg0.method8085(local95);
			}
		}
		this.aBoolean623 = local22.F() || this.aClass244_4.aClass3_Sub7_6 != null;
		if (this.aClass261_7 == null) {
			this.aClass261_7 = Static386.method4994(super.anInt9915, super.anInt9925, local22, super.anInt9917);
		} else {
			Static239.method3529(super.anInt9915, this.aClass261_7, super.anInt9917, local22, super.anInt9925);
		}
		return local43;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLclient!ha;)Lclient!oba;")
	@Override
	public Class261 method8507(@OriginalArg(1) Class33 arg0) {
		return this.aClass261_7;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!gt;)V")
	public void method6897(@OriginalArg(1) Class141 arg0) {
		this.aClass244_4.method5007(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8501() {
		return this.aBoolean623;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7089() {
		return this.aClass244_4.method5014();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!gda;Lclient!ha;IIZII)V")
	@Override
	public void method8491(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
	@Override
	public void method7090() {
	}
}
