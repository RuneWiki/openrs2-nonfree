import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class41_Sub1_Sub5_Sub2 extends Class41_Sub1_Sub5 implements Interface10 {

	@OriginalMember(owner = "client!kca", name = "hb", descriptor = "Lclient!pw;")
	private Class280 aClass280_3;

	@OriginalMember(owner = "client!kca", name = "ob", descriptor = "Z")
	private boolean aBoolean307 = false;

	@OriginalMember(owner = "client!kca", name = "T", descriptor = "Lclient!km;")
	public final Class205 aClass205_1;

	@OriginalMember(owner = "client!kca", name = "bb", descriptor = "Z")
	private boolean aBoolean306;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!ha;Lclient!dja;IIIIIZIIIII)V")
	public Class41_Sub1_Sub5_Sub2(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass205_1 = new Class205(arg0, arg1, arg10, arg11, super.aByte149, arg3, this, arg7, arg12);
		this.aBoolean306 = arg1.anInt1885 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8669() {
		return this.aClass205_1.method4793();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Z)I")
	@Override
	public int method8671() {
		return this.aClass205_1.anInt5562;
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8667(@OriginalArg(1) Class143 arg0) {
		this.aClass205_1.method4790(arg0);
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(Lclient!ha;B)Lclient!pw;")
	@Override
	public Class280 method8656(@OriginalArg(0) Class143 arg0) {
		return this.aClass280_3;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)I")
	@Override
	public int method8670() {
		return this.aClass205_1.anInt5549;
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)V")
	@Override
	public void method8672() {
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!ha;B)Lclient!hq;")
	@Override
	public Class41_Sub3 method8648(@OriginalArg(0) Class143 arg0) {
		@Pc(14) Class114 local14 = this.aClass205_1.method4788(false, arg0, 2048, true);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class56 local21 = arg0.method6212();
		local21.method8395(super.anInt10366 + super.aShort63, super.anInt10370, super.anInt10367 + super.aShort64);
		@Pc(43) Class41_Sub3 local43 = Static578.method7877(1, this.aBoolean306);
		@Pc(48) int local48 = super.anInt10366 >> 9;
		@Pc(53) int local53 = super.anInt10367 >> 9;
		this.aClass205_1.method4796(local53, local53, local48, arg0, local14, local21, true, local48);
		if (Static426.aBoolean555) {
			local14.method8807(local21, local43.aClass41_Sub9Array1[0], Static663.anInt10391, 0);
		} else {
			local14.method8801(local21, local43.aClass41_Sub9Array1[0], 0);
		}
		if (this.aClass205_1.aClass41_Sub7_4 != null) {
			@Pc(107) Class149 local107 = this.aClass205_1.aClass41_Sub7_4.method7086();
			if (Static426.aBoolean555) {
				arg0.method6233(local107, Static663.anInt10391);
			} else {
				arg0.method6215(local107);
			}
		}
		this.aBoolean307 = local14.F() || this.aClass205_1.aClass41_Sub7_4 != null;
		if (this.aClass280_3 == null) {
			this.aClass280_3 = Static273.method3807(super.anInt10366, super.anInt10367, super.anInt10370, local14);
		} else {
			Static614.method8241(local14, super.anInt10370, super.anInt10366, this.aClass280_3, super.anInt10367);
		}
		return local43;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class143 arg0) {
		@Pc(16) Class114 local16 = this.aClass205_1.method4788(false, arg0, 262144, true);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt10366 >> 9;
		@Pc(28) int local28 = super.anInt10367 >> 9;
		@Pc(31) Class56 local31 = arg0.method6212();
		local31.method8395(super.anInt10366, super.anInt10370, super.anInt10367);
		this.aClass205_1.method4796(local28, local28, local23, arg0, local16, local31, false, local23);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IZLclient!ha;I)Z")
	@Override
	public boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class114 local12 = this.aClass205_1.method4788(false, arg1, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class56 local19 = arg1.method6212();
			local19.method8395(super.anInt10366 + super.aShort63, super.anInt10370, super.aShort64 + super.anInt10367);
			return Static426.aBoolean555 ? local12.method8798(arg2, arg0, local19, false, 0, Static663.anInt10391) : local12.method8795(arg2, arg0, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)I")
	@Override
	public int method8668() {
		return this.aClass205_1.anInt5571;
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8650() {
		return false;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8666(@OriginalArg(1) Class143 arg0) {
		this.aClass205_1.method4795(arg0);
	}

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "(I)I")
	@Override
	public int method8652() {
		return this.aClass205_1.method4799();
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8647() {
		return this.aBoolean307;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!pi;I)V")
	public void method4062(@OriginalArg(0) Class272 arg0) {
		this.aClass205_1.method4794(arg0);
	}

	@OriginalMember(owner = "client!kca", name = "j", descriptor = "(I)I")
	@Override
	public int method8660(@OriginalArg(0) int arg0) {
		if (arg0 > -9) {
			this.aBoolean306 = false;
		}
		return this.aClass205_1.method4800((byte) 14);
	}
}
