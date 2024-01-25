import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class28_Sub1_Sub4_Sub1 extends Class28_Sub1_Sub4 implements Interface1 {

	@OriginalMember(owner = "client!dn", name = "M", descriptor = "Lclient!id;")
	private Class160 aClass160_2;

	@OriginalMember(owner = "client!dn", name = "db", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!dn", name = "U", descriptor = "Lclient!hw;")
	public final Class157 aClass157_2;

	@OriginalMember(owner = "client!dn", name = "V", descriptor = "Z")
	private final boolean aBoolean225;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!ha;Lclient!ih;IIIIIZIIIIIII)V")
	public Class28_Sub1_Sub4_Sub1(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4667 == 1, Static507.method7264(arg12, arg13));
		this.aClass157_2 = new Class157(arg0, arg1, arg12, arg13, super.aByte145, arg3, this, arg7, arg14);
		this.aBoolean225 = arg1.anInt4647 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(ILclient!ha;)Lclient!pi;")
	@Override
	public Class28_Sub7 method8972(@OriginalArg(1) Class65 arg0) {
		@Pc(14) Class153 local14 = this.aClass157_2.method3789(2048, true, arg0, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class254 local21 = arg0.method6903();
		local21.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
		@Pc(35) Class28_Sub7 local35 = Static375.method5607(this.aBoolean225, 1);
		this.aClass157_2.method3787(super.aShort123, local14, true, super.aShort124, local21, arg0, super.aShort122, super.aShort121);
		if (Static632.aBoolean877) {
			local14.method8594(local21, local35.aClass28_Sub9Array1[0], Static483.anInt8094, 0);
		} else {
			local14.method8585(local21, local35.aClass28_Sub9Array1[0], 0);
		}
		if (this.aClass157_2.aClass28_Sub5_3 != null) {
			@Pc(83) Class392 local83 = this.aClass157_2.aClass28_Sub5_3.method5856();
			if (Static632.aBoolean877) {
				arg0.method6897(local83, Static483.anInt8094);
			} else {
				arg0.method6899(local83);
			}
		}
		this.aBoolean226 = local14.F() || this.aClass157_2.aClass28_Sub5_3 != null;
		if (this.aClass160_2 == null) {
			this.aClass160_2 = Static224.method3501(super.anInt10779, super.anInt10784, local14, super.anInt10781);
		} else {
			Static476.method6818(this.aClass160_2, local14, super.anInt10784, super.anInt10781, super.anInt10779);
		}
		return local35;
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)I")
	@Override
	public int method8976() {
		return this.aClass157_2.method3792();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8983() {
		return this.aClass157_2.method3793();
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8963() {
		return false;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)I")
	@Override
	public int method8987() {
		return this.aClass157_2.anInt4489;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)I")
	@Override
	public int method8986() {
		return this.aClass157_2.anInt4493;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8988(@OriginalArg(1) Class65 arg0) {
		this.aClass157_2.method3790(arg0);
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V")
	@Override
	public void method8960() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!mea;I)V")
	public void method2204(@OriginalArg(0) Class225 arg0) {
		this.aClass157_2.method3791(arg0);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(12) Class153 local12 = this.aClass157_2.method3789(131072, false, arg2, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(27) Class254 local27 = arg2.method6903();
			local27.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
			return Static632.aBoolean877 ? local12.method8590(arg0, arg1, local27, false, 0, Static483.anInt8094) : local12.method8593(arg0, arg1, local27, false, 0);
		}
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(B)I")
	@Override
	public int method8964(@OriginalArg(0) byte arg0) {
		return arg0 > -85 ? 29 : this.aClass157_2.method3786(0);
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8973() {
		return false;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)I")
	@Override
	public int method8984() {
		return this.aClass157_2.anInt4480;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZIBLclient!lq;Lclient!ha;II)V")
	@Override
	public void method8969(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28_Sub1 arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8962(@OriginalArg(0) Class65 arg0) {
		@Pc(24) Class153 local24 = this.aClass157_2.method3789(262144, true, arg0, true);
		if (local24 != null) {
			@Pc(29) Class254 local29 = arg0.method6903();
			local29.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
			this.aClass157_2.method3787(super.aShort123, local24, false, super.aShort124, local29, arg0, super.aShort122, super.aShort121);
		}
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V")
	@Override
	public void method8989() {
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8965() {
		return this.aBoolean226;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(ILclient!ha;)Lclient!id;")
	@Override
	public Class160 method8978(@OriginalArg(1) Class65 arg0) {
		return this.aClass160_2;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8985(@OriginalArg(1) Class65 arg0) {
		this.aClass157_2.method3788(arg0);
	}
}
