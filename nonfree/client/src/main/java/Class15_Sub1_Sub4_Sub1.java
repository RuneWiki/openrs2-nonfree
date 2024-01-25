import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class15_Sub1_Sub4_Sub1 extends Class15_Sub1_Sub4 implements Interface27 {

	@OriginalMember(owner = "client!dt", name = "Y", descriptor = "Lclient!lca;")
	private Class191 aClass191_2;

	@OriginalMember(owner = "client!dt", name = "fb", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!dt", name = "ab", descriptor = "Lclient!iea;")
	public final Class143 aClass143_1;

	@OriginalMember(owner = "client!dt", name = "M", descriptor = "Z")
	private final boolean aBoolean223;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!ha;Lclient!vc;IIIIIZIII)V")
	public Class15_Sub1_Sub4_Sub1(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static80.method7555(arg8, arg9));
		this.aClass143_1 = new Class143(arg0, arg1, arg8, arg9, super.aByte124, arg3, this, arg7, arg10);
		this.aBoolean223 = arg1.anInt10102 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(ILclient!ha;)Lclient!lca;")
	@Override
	public Class191 method8319(@OriginalArg(1) Class16 arg0) {
		return this.aClass191_2;
	}

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "(I)I")
	@Override
	public int method8326() {
		return this.aClass143_1.method4176();
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8339() {
		return this.aClass143_1.method4180();
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
	@Override
	public void method8317() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(B)I")
	@Override
	public int method8342() {
		return this.aClass143_1.anInt5110;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8327(@OriginalArg(0) Class16 arg0) {
		@Pc(20) Class83 local20 = this.aClass143_1.method4182(true, arg0, true, 262144);
		if (local20 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt10301 >> 9;
		@Pc(32) int local32 = super.anInt10298 >> 9;
		@Pc(35) Class54 local35 = arg0.method6124();
		local35.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
		this.aClass143_1.method4184(local32, local32, local20, local27, local35, local27, arg0, false);
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)V")
	@Override
	public void method8338() {
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZLclient!ha;Lclient!rr;IIII)V")
	@Override
	public void method8322(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class15_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8320() {
		return false;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)I")
	@Override
	public int method8337() {
		return this.aClass143_1.anInt5101;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8340(@OriginalArg(1) Class16 arg0) {
		this.aClass143_1.method4187(arg0);
	}

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "(B)I")
	@Override
	public int method8343() {
		return this.aClass143_1.anInt5113;
	}

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "(Z)I")
	@Override
	public int method8333(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static109.anInt2865 = -87;
		}
		return this.aClass143_1.method4178(true);
	}

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8328() {
		return this.aBoolean225;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		@Pc(12) Class83 local12 = this.aClass143_1.method4182(false, arg2, false, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(26) Class54 local26 = arg2.method6124();
			local26.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
			return Static183.aBoolean308 ? local12.method7994(arg0, arg1, local26, false, 0, Static115.anInt3009) : local12.method8007(arg0, arg1, local26, false, 0);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLclient!ha;)Lclient!lba;")
	@Override
	public Class15_Sub7 method8331(@OriginalArg(1) Class16 arg0) {
		@Pc(14) Class83 local14 = this.aClass143_1.method4182(true, arg0, false, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class54 local21 = arg0.method6124();
		local21.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
		@Pc(35) Class15_Sub7 local35 = Static342.method5465(this.aBoolean223, 1);
		@Pc(40) int local40 = super.anInt10301 >> 9;
		@Pc(45) int local45 = super.anInt10298 >> 9;
		this.aClass143_1.method4184(local45, local45, local14, local40, local21, local40, arg0, true);
		if (Static183.aBoolean308) {
			local14.method8009(local21, local35.aClass15_Sub6Array1[0], Static115.anInt3009, 0);
		} else {
			local14.method8003(local21, local35.aClass15_Sub6Array1[0], 0);
		}
		if (this.aClass143_1.aClass15_Sub8_5 != null) {
			@Pc(95) Class250 local95 = this.aClass143_1.aClass15_Sub8_5.method6540();
			if (Static183.aBoolean308) {
				arg0.method6108(local95, Static115.anInt3009);
			} else {
				arg0.method6100(local95);
			}
		}
		this.aBoolean225 = local14.F() || this.aClass143_1.aClass15_Sub8_5 != null;
		if (this.aClass191_2 == null) {
			this.aClass191_2 = Static327.method5365(super.anInt10298, local14, super.anInt10301, super.anInt10297);
		} else {
			Static96.method2220(super.anInt10301, super.anInt10298, local14, super.anInt10297, this.aClass191_2);
		}
		return local35;
	}

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8332() {
		return false;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method8341(@OriginalArg(0) Class16 arg0) {
		this.aClass143_1.method4186(arg0);
	}
}
