import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class15_Sub1_Sub5_Sub1 extends Class15_Sub1_Sub5 implements Interface27 {

	@OriginalMember(owner = "client!re", name = "W", descriptor = "Lclient!lca;")
	private Class191 aClass191_6;

	@OriginalMember(owner = "client!re", name = "cb", descriptor = "Z")
	private boolean aBoolean614 = false;

	@OriginalMember(owner = "client!re", name = "Y", descriptor = "Lclient!iea;")
	public final Class143 aClass143_2;

	@OriginalMember(owner = "client!re", name = "O", descriptor = "Z")
	private final boolean aBoolean613;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!ha;Lclient!vc;IIIIIZIIIII)V")
	public Class15_Sub1_Sub5_Sub1(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass143_2 = new Class143(arg0, arg1, arg10, arg11, super.aByte124, arg3, this, arg7, arg12);
		this.aBoolean613 = arg1.anInt10102 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)I")
	@Override
	public int method8337() {
		return this.aClass143_2.anInt5101;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
	@Override
	public void method8338() {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method8341(@OriginalArg(0) Class16 arg0) {
		this.aClass143_2.method4186(arg0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!ha;)Lclient!lba;")
	@Override
	public Class15_Sub7 method8331(@OriginalArg(1) Class16 arg0) {
		@Pc(14) Class83 local14 = this.aClass143_2.method4182(true, arg0, false, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class54 local21 = arg0.method6124();
		local21.method5128(super.aShort120 + super.anInt10301, super.anInt10297, super.anInt10298 + super.aShort119);
		@Pc(48) Class15_Sub7 local48 = Static342.method5465(this.aBoolean613, 1);
		@Pc(53) int local53 = super.anInt10301 >> 9;
		@Pc(58) int local58 = super.anInt10298 >> 9;
		this.aClass143_2.method4184(local58, local58, local14, local53, local21, local53, arg0, true);
		if (Static183.aBoolean308) {
			local14.method8009(local21, local48.aClass15_Sub6Array1[0], Static115.anInt3009, 0);
		} else {
			local14.method8003(local21, local48.aClass15_Sub6Array1[0], 0);
		}
		if (this.aClass143_2.aClass15_Sub8_5 != null) {
			@Pc(100) Class250 local100 = this.aClass143_2.aClass15_Sub8_5.method6540();
			if (Static183.aBoolean308) {
				arg0.method6108(local100, Static115.anInt3009);
			} else {
				arg0.method6100(local100);
			}
		}
		this.aBoolean614 = local14.F() || this.aClass143_2.aClass15_Sub8_5 != null;
		if (this.aClass191_6 == null) {
			this.aClass191_6 = Static327.method5365(super.anInt10298, local14, super.anInt10301, super.anInt10297);
		} else {
			Static96.method2220(super.anInt10301, super.anInt10298, local14, super.anInt10297, this.aClass191_6);
		}
		return local48;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8339() {
		return this.aClass143_2.method4180();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8340(@OriginalArg(1) Class16 arg0) {
		this.aClass143_2.method4187(arg0);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(B)I")
	@Override
	public int method8342() {
		return this.aClass143_2.anInt5110;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(ILclient!ha;)Lclient!lca;")
	@Override
	public Class191 method8319(@OriginalArg(1) Class16 arg0) {
		return this.aClass191_6;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8327(@OriginalArg(0) Class16 arg0) {
		@Pc(20) Class83 local20 = this.aClass143_2.method4182(true, arg0, false, 262144);
		if (local20 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt10301 >> 9;
		@Pc(32) int local32 = super.anInt10298 >> 9;
		@Pc(35) Class54 local35 = arg0.method6124();
		local35.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
		this.aClass143_2.method4184(local32, local32, local20, local27, local35, local27, arg0, false);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8320() {
		return false;
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(Z)I")
	@Override
	public int method8333(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method8316(-20, -73, null);
		}
		return this.aClass143_2.method4178(true);
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8328() {
		return this.aBoolean614;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		@Pc(17) Class83 local17 = this.aClass143_2.method4182(false, arg2, false, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(24) Class54 local24 = arg2.method6124();
			local24.method5128(super.aShort120 + super.anInt10301, super.anInt10297, super.anInt10298 + super.aShort119);
			return Static183.aBoolean308 ? local17.method7994(arg0, arg1, local24, false, 0, Static115.anInt3009) : local17.method8007(arg0, arg1, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(B)I")
	@Override
	public int method8343() {
		return this.aClass143_2.anInt5113;
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)I")
	@Override
	public int method8326() {
		return this.aClass143_2.method4176();
	}
}
