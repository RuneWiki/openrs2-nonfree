import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class41_Sub1_Sub1_Sub4 extends Class41_Sub1_Sub1 implements Interface10 {

	@OriginalMember(owner = "client!qs", name = "rb", descriptor = "Lclient!pw;")
	private Class280 aClass280_6;

	@OriginalMember(owner = "client!qs", name = "W", descriptor = "Z")
	private boolean aBoolean605 = false;

	@OriginalMember(owner = "client!qs", name = "qb", descriptor = "Lclient!km;")
	public final Class205 aClass205_3;

	@OriginalMember(owner = "client!qs", name = "db", descriptor = "Z")
	private boolean aBoolean606;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!ha;Lclient!dja;IIIIIZIIIIIII)V")
	public Class41_Sub1_Sub1_Sub4(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1905 == 1, Static481.method888(arg13, arg12));
		this.aClass205_3 = new Class205(arg0, arg1, arg12, arg13, super.aByte149, arg3, this, arg7, arg14);
		this.aBoolean606 = arg1.anInt1885 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8653() {
		return false;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8667(@OriginalArg(1) Class143 arg0) {
		this.aClass205_3.method4790(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)I")
	@Override
	public int method8668() {
		return this.aClass205_3.anInt5571;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class143 arg0) {
		@Pc(19) Class114 local19 = this.aClass205_3.method4788(true, arg0, 262144, true);
		if (local19 != null) {
			@Pc(24) Class56 local24 = arg0.method6212();
			local24.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
			this.aClass205_3.method4796(super.aShort108, super.aShort110, super.aShort109, arg0, local19, local24, false, super.aShort107);
		}
	}

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "(I)I")
	@Override
	public int method8652() {
		return this.aClass205_3.method4799();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!ha;B)Lclient!hq;")
	@Override
	public Class41_Sub3 method8648(@OriginalArg(0) Class143 arg0) {
		@Pc(16) Class114 local16 = this.aClass205_3.method4788(false, arg0, 2048, true);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class56 local23 = arg0.method6212();
		local23.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
		@Pc(42) Class41_Sub3 local42 = Static578.method7877(1, this.aBoolean606);
		this.aClass205_3.method4796(super.aShort108, super.aShort110, super.aShort109, arg0, local16, local23, true, super.aShort107);
		if (Static426.aBoolean555) {
			local16.method8807(local23, local42.aClass41_Sub9Array1[0], Static663.anInt10391, 0);
		} else {
			local16.method8801(local23, local42.aClass41_Sub9Array1[0], 0);
		}
		if (this.aClass205_3.aClass41_Sub7_4 != null) {
			@Pc(88) Class149 local88 = this.aClass205_3.aClass41_Sub7_4.method7086();
			if (Static426.aBoolean555) {
				arg0.method6233(local88, Static663.anInt10391);
			} else {
				arg0.method6215(local88);
			}
		}
		this.aBoolean605 = local16.F() || this.aClass205_3.aClass41_Sub7_4 != null;
		if (this.aClass280_6 == null) {
			this.aClass280_6 = Static273.method3807(super.anInt10366, super.anInt10367, super.anInt10370, local16);
		} else {
			Static614.method8241(local16, super.anInt10370, super.anInt10366, this.aClass280_6, super.anInt10367);
		}
		return local42;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(Lclient!ha;B)Lclient!pw;")
	@Override
	public Class280 method8656(@OriginalArg(0) Class143 arg0) {
		return this.aClass280_6;
	}

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "(I)I")
	@Override
	public int method8660(@OriginalArg(0) int arg0) {
		if (arg0 > -9) {
			this.aBoolean606 = false;
		}
		return this.aClass205_3.method4800((byte) 14);
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8650() {
		return false;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZLclient!ha;I)Z")
	@Override
	public boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class114 local19 = this.aClass205_3.method4788(false, arg1, 131072, false);
		if (local19 == null) {
			return false;
		} else {
			@Pc(26) Class56 local26 = arg1.method6212();
			local26.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
			return Static426.aBoolean555 ? local19.method8798(arg2, arg0, local26, false, 0, Static663.anInt10391) : local19.method8795(arg2, arg0, local26, false, 0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "(I)V")
	@Override
	public void method8654() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8669() {
		return this.aClass205_3.method4793();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)I")
	@Override
	public int method8671() {
		return this.aClass205_3.anInt5562;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!sf;Lclient!ha;BIIZ)V")
	@Override
	public void method8658(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V")
	@Override
	public void method8672() {
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8666(@OriginalArg(1) Class143 arg0) {
		this.aClass205_3.method4795(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!pi;I)V")
	public void method7150(@OriginalArg(0) Class272 arg0) {
		this.aClass205_3.method4794(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)I")
	@Override
	public int method8670() {
		return this.aClass205_3.anInt5549;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8647() {
		return this.aBoolean605;
	}
}
