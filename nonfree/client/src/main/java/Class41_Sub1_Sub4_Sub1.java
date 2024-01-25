import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class41_Sub1_Sub4_Sub1 extends Class41_Sub1_Sub4 implements Interface10 {

	@OriginalMember(owner = "client!laa", name = "gb", descriptor = "Lclient!pw;")
	private Class280 aClass280_4;

	@OriginalMember(owner = "client!laa", name = "S", descriptor = "Z")
	private boolean aBoolean433 = false;

	@OriginalMember(owner = "client!laa", name = "W", descriptor = "Lclient!km;")
	public final Class205 aClass205_2;

	@OriginalMember(owner = "client!laa", name = "mb", descriptor = "Z")
	private final boolean aBoolean435;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lclient!ha;Lclient!dja;IIIIIZII)V")
	public Class41_Sub1_Sub4_Sub1(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt1912);
		this.aClass205_2 = new Class205(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean435 = arg1.anInt1885 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(Lclient!ha;B)Lclient!pw;")
	@Override
	public Class280 method8656(@OriginalArg(0) Class143 arg0) {
		return this.aClass280_4;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!ha;B)Lclient!hq;")
	@Override
	public Class41_Sub3 method8648(@OriginalArg(0) Class143 arg0) {
		@Pc(14) Class114 local14 = this.aClass205_2.method4788(false, arg0, 2048, true);
		if (local14 == null) {
			return null;
		}
		@Pc(27) Class56 local27 = arg0.method6212();
		local27.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
		@Pc(43) Class41_Sub3 local43 = Static578.method7877(1, this.aBoolean435);
		@Pc(48) int local48 = super.anInt10366 >> 9;
		@Pc(53) int local53 = super.anInt10367 >> 9;
		this.aClass205_2.method4796(local53, local53, local48, arg0, local14, local27, true, local48);
		if (Static426.aBoolean555) {
			local14.method8807(local27, local43.aClass41_Sub9Array1[0], Static663.anInt10391, 0);
		} else {
			local14.method8801(local27, local43.aClass41_Sub9Array1[0], 0);
		}
		if (this.aClass205_2.aClass41_Sub7_4 != null) {
			@Pc(97) Class149 local97 = this.aClass205_2.aClass41_Sub7_4.method7086();
			if (Static426.aBoolean555) {
				arg0.method6233(local97, Static663.anInt10391);
			} else {
				arg0.method6215(local97);
			}
		}
		this.aBoolean433 = local14.F() || this.aClass205_2.aClass41_Sub7_4 != null;
		if (this.aClass280_4 == null) {
			this.aClass280_4 = Static273.method3807(super.anInt10366, super.anInt10367, super.anInt10370, local14);
		} else {
			Static614.method8241(local14, super.anInt10370, super.anInt10366, this.aClass280_4, super.anInt10367);
		}
		return local43;
	}

	@OriginalMember(owner = "client!laa", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8653() {
		return false;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZLclient!ha;I)Z")
	@Override
	public boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class114 local12 = this.aClass205_2.method4788(false, arg1, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(24) Class56 local24 = arg1.method6212();
			local24.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
			return Static426.aBoolean555 ? local12.method8798(arg2, arg0, local24, false, 0, Static663.anInt10391) : local12.method8795(arg2, arg0, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!laa", name = "j", descriptor = "(I)I")
	@Override
	public int method8660(@OriginalArg(0) int arg0) {
		if (arg0 > -9) {
			Static324.aClass196_178 = null;
		}
		return this.aClass205_2.method4800((byte) 14);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)I")
	@Override
	public int method8671() {
		return this.aClass205_2.anInt5562;
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8669() {
		return this.aClass205_2.method4793();
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!pi;I)V")
	public void method5064(@OriginalArg(0) Class272 arg0) {
		this.aClass205_2.method4794(arg0);
	}

	@OriginalMember(owner = "client!laa", name = "g", descriptor = "(I)I")
	@Override
	public int method8652() {
		return this.aClass205_2.method4799();
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILclient!sf;Lclient!ha;BIIZ)V")
	@Override
	public void method8658(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8667(@OriginalArg(1) Class143 arg0) {
		this.aClass205_2.method4790(arg0);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)I")
	@Override
	public int method8668() {
		return this.aClass205_2.anInt5571;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)I")
	@Override
	public int method8670() {
		return this.aClass205_2.anInt5549;
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8647() {
		return this.aBoolean433;
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)V")
	@Override
	public void method8672() {
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8666(@OriginalArg(1) Class143 arg0) {
		this.aClass205_2.method4795(arg0);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class143 arg0) {
		@Pc(17) Class114 local17 = this.aClass205_2.method4788(true, arg0, 262144, true);
		if (local17 == null) {
			return;
		}
		@Pc(24) int local24 = super.anInt10366 >> 9;
		@Pc(29) int local29 = super.anInt10367 >> 9;
		@Pc(32) Class56 local32 = arg0.method6212();
		local32.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
		this.aClass205_2.method4796(local29, local29, local24, arg0, local17, local32, false, local24);
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8650() {
		return false;
	}

	@OriginalMember(owner = "client!laa", name = "i", descriptor = "(I)V")
	@Override
	public void method8654() {
		throw new IllegalStateException();
	}
}
