import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class41_Sub1_Sub3_Sub2 extends Class41_Sub1_Sub3 implements Interface10 {

	@OriginalMember(owner = "client!wj", name = "K", descriptor = "Lclient!pw;")
	private Class280 aClass280_8;

	@OriginalMember(owner = "client!wj", name = "Y", descriptor = "Z")
	private boolean aBoolean766 = false;

	@OriginalMember(owner = "client!wj", name = "P", descriptor = "Lclient!km;")
	public final Class205 aClass205_4;

	@OriginalMember(owner = "client!wj", name = "O", descriptor = "Z")
	private final boolean aBoolean765;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!ha;Lclient!dja;IIIIIZIII)V")
	public Class41_Sub1_Sub3_Sub2(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static185.method2702(arg9, arg8));
		this.aClass205_4 = new Class205(arg0, arg1, arg8, arg9, super.aByte149, arg3, this, arg7, arg10);
		this.aBoolean765 = arg1.anInt1885 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(Lclient!ha;B)Lclient!pw;")
	@Override
	public Class280 method8656(@OriginalArg(0) Class143 arg0) {
		return this.aClass280_8;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!sf;Lclient!ha;BIIZ)V")
	@Override
	public void method8658(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!ha;B)Lclient!hq;")
	@Override
	public Class41_Sub3 method8648(@OriginalArg(0) Class143 arg0) {
		@Pc(12) Class114 local12 = this.aClass205_4.method4788(false, arg0, 2048, true);
		if (local12 == null) {
			return null;
		}
		@Pc(19) Class56 local19 = arg0.method6212();
		local19.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
		@Pc(33) Class41_Sub3 local33 = Static578.method7877(1, this.aBoolean765);
		@Pc(43) int local43 = super.anInt10366 >> 9;
		@Pc(48) int local48 = super.anInt10367 >> 9;
		this.aClass205_4.method4796(local48, local48, local43, arg0, local12, local19, true, local43);
		if (Static426.aBoolean555) {
			local12.method8807(local19, local33.aClass41_Sub9Array1[0], Static663.anInt10391, 0);
		} else {
			local12.method8801(local19, local33.aClass41_Sub9Array1[0], 0);
		}
		if (this.aClass205_4.aClass41_Sub7_4 != null) {
			@Pc(89) Class149 local89 = this.aClass205_4.aClass41_Sub7_4.method7086();
			if (Static426.aBoolean555) {
				arg0.method6233(local89, Static663.anInt10391);
			} else {
				arg0.method6215(local89);
			}
		}
		this.aBoolean766 = local12.F() || this.aClass205_4.aClass41_Sub7_4 != null;
		if (this.aClass280_8 == null) {
			this.aClass280_8 = Static273.method3807(super.anInt10366, super.anInt10367, super.anInt10370, local12);
		} else {
			Static614.method8241(local12, super.anInt10370, super.anInt10366, this.aClass280_8, super.anInt10367);
		}
		return local33;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V")
	@Override
	public void method8672() {
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZLclient!ha;I)Z")
	@Override
	public boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class114 local12 = this.aClass205_4.method4788(false, arg1, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(24) Class56 local24 = arg1.method6212();
			local24.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
			return Static426.aBoolean555 ? local12.method8798(arg2, arg0, local24, false, 0, Static663.anInt10391) : local12.method8795(arg2, arg0, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8653() {
		return false;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class143 arg0) {
		@Pc(12) Class114 local12 = this.aClass205_4.method4788(true, arg0, 262144, true);
		if (local12 == null) {
			return;
		}
		@Pc(26) int local26 = super.anInt10366 >> 9;
		@Pc(31) int local31 = super.anInt10367 >> 9;
		@Pc(34) Class56 local34 = arg0.method6212();
		local34.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
		this.aClass205_4.method4796(local31, local31, local26, arg0, local12, local34, false, local26);
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8650() {
		return false;
	}

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "(I)V")
	@Override
	public void method8654() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8666(@OriginalArg(1) Class143 arg0) {
		this.aClass205_4.method4795(arg0);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)I")
	@Override
	public int method8670() {
		return this.aClass205_4.anInt5549;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8667(@OriginalArg(1) Class143 arg0) {
		this.aClass205_4.method4790(arg0);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)I")
	@Override
	public int method8668() {
		return this.aClass205_4.anInt5571;
	}

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "(I)I")
	@Override
	public int method8652() {
		return this.aClass205_4.method4799();
	}

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "(I)I")
	@Override
	public int method8660(@OriginalArg(0) int arg0) {
		return arg0 >= -9 ? -39 : this.aClass205_4.method4800((byte) 14);
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8647() {
		return this.aBoolean766;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8669() {
		return this.aClass205_4.method4793();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLclient!pi;)V")
	public void method8674(@OriginalArg(1) Class272 arg0) {
		this.aClass205_4.method4794(arg0);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)I")
	@Override
	public int method8671() {
		return this.aClass205_4.anInt5562;
	}
}
