import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class15_Sub1_Sub2_Sub4 extends Class15_Sub1_Sub2 implements Interface27 {

	@OriginalMember(owner = "client!od", name = "ab", descriptor = "Lclient!lca;")
	private Class191 aClass191_5;

	@OriginalMember(owner = "client!od", name = "kb", descriptor = "Z")
	private boolean aBoolean545 = false;

	@OriginalMember(owner = "client!od", name = "lb", descriptor = "Lclient!iea;")
	public final Class143 lb;

	@OriginalMember(owner = "client!od", name = "ob", descriptor = "Z")
	private final boolean aBoolean546;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!ha;Lclient!vc;IIIIIZIIIIIII)V")
	public Class15_Sub1_Sub2_Sub4(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt10124 == 1, Static294.method4883(arg12, arg13));
		this.lb = new Class143(arg0, arg1, arg12, arg13, super.aByte124, arg3, this, arg7, arg14);
		this.aBoolean546 = arg1.anInt10102 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!ha;)Lclient!lba;")
	@Override
	public Class15_Sub7 method8331(@OriginalArg(1) Class16 arg0) {
		@Pc(14) Class83 local14 = this.lb.method4182(true, arg0, false, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class54 local21 = arg0.method6124();
		local21.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
		@Pc(40) Class15_Sub7 local40 = Static342.method5465(this.aBoolean546, 1);
		this.lb.method4184(super.aShort106, super.aShort103, local14, super.aShort104, local21, super.aShort105, arg0, true);
		if (Static183.aBoolean308) {
			local14.method8009(local21, local40.aClass15_Sub6Array1[0], Static115.anInt3009, 0);
		} else {
			local14.method8003(local21, local40.aClass15_Sub6Array1[0], 0);
		}
		if (this.lb.aClass15_Sub8_5 != null) {
			@Pc(86) Class250 local86 = this.lb.aClass15_Sub8_5.method6540();
			if (Static183.aBoolean308) {
				arg0.method6108(local86, Static115.anInt3009);
			} else {
				arg0.method6100(local86);
			}
		}
		this.aBoolean545 = local14.F() || this.lb.aClass15_Sub8_5 != null;
		if (this.aClass191_5 == null) {
			this.aClass191_5 = Static327.method5365(super.anInt10298, local14, super.anInt10301, super.anInt10297);
		} else {
			Static96.method2220(super.anInt10301, super.anInt10298, local14, super.anInt10297, this.aClass191_5);
		}
		return local40;
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(Z)I")
	@Override
	public int method8333(@OriginalArg(0) boolean arg0) {
		return arg0 ? -20 : this.lb.method4178(true);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLclient!ha;Lclient!rr;IIII)V")
	@Override
	public void method8322(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class15_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8328() {
		return this.aBoolean545;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(B)I")
	@Override
	public int method8342() {
		return this.lb.anInt5110;
	}

	@OriginalMember(owner = "client!od", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8332() {
		return false;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		@Pc(12) Class83 local12 = this.lb.method4182(false, arg2, false, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(25) Class54 local25 = arg2.method6124();
			local25.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
			return Static183.aBoolean308 ? local12.method7994(arg0, arg1, local25, false, 0, Static115.anInt3009) : local12.method8007(arg0, arg1, local25, false, 0);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8340(@OriginalArg(1) Class16 arg0) {
		this.lb.method4187(arg0);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	@Override
	public void method8317() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8320() {
		return false;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method8341(@OriginalArg(0) Class16 arg0) {
		this.lb.method4186(arg0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8327(@OriginalArg(0) Class16 arg0) {
		@Pc(12) Class83 local12 = this.lb.method4182(true, arg0, true, 262144);
		if (local12 != null) {
			@Pc(17) Class54 local17 = arg0.method6124();
			local17.method5128(super.anInt10301, super.anInt10297, super.anInt10298);
			this.lb.method4184(super.aShort106, super.aShort103, local12, super.aShort104, local17, super.aShort105, arg0, false);
		}
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)I")
	@Override
	public int method8326() {
		return this.lb.method4176();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8339() {
		return this.lb.method4180();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)I")
	@Override
	public int method8337() {
		return this.lb.anInt5101;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(B)I")
	@Override
	public int method8343() {
		return this.lb.anInt5113;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(ILclient!ha;)Lclient!lca;")
	@Override
	public Class191 method8319(@OriginalArg(1) Class16 arg0) {
		return this.aClass191_5;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
	@Override
	public void method8338() {
	}
}
