import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sha")
public final class Class28_Sub1_Sub3_Sub1 extends Class28_Sub1_Sub3 implements Interface1 {

	@OriginalMember(owner = "client!sha", name = "Q", descriptor = "Lclient!id;")
	private Class160 aClass160_4;

	@OriginalMember(owner = "client!sha", name = "R", descriptor = "Z")
	private boolean aBoolean759 = false;

	@OriginalMember(owner = "client!sha", name = "N", descriptor = "Lclient!hw;")
	public final Class157 aClass157_4;

	@OriginalMember(owner = "client!sha", name = "P", descriptor = "Z")
	private final boolean aBoolean758;

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!ha;Lclient!ih;IIIIIZIIIII)V")
	public Class28_Sub1_Sub3_Sub1(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass157_4 = new Class157(arg0, arg1, arg10, arg11, super.aByte145, arg3, this, arg7, arg12);
		this.aBoolean758 = arg1.anInt4647 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!sha", name = "e", descriptor = "(B)I")
	@Override
	public int method8964(@OriginalArg(0) byte arg0) {
		return arg0 > -85 ? -77 : this.aClass157_4.method3786(0);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(12) Class153 local12 = this.aClass157_4.method3789(131072, false, arg2, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(27) Class254 local27 = arg2.method6903();
			local27.method7361(super.aShort118 + super.anInt10781, super.anInt10779, super.anInt10784 + super.aShort119);
			return Static632.aBoolean877 ? local12.method8590(arg0, arg1, local27, false, 0, Static483.anInt8094) : local12.method8593(arg0, arg1, local27, false, 0);
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)I")
	@Override
	public int method8986() {
		return this.aClass157_4.anInt4493;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8962(@OriginalArg(0) Class65 arg0) {
		@Pc(12) Class153 local12 = this.aClass157_4.method3789(262144, true, arg0, false);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt10781 >> 9;
		@Pc(24) int local24 = super.anInt10784 >> 9;
		@Pc(27) Class254 local27 = arg0.method6903();
		local27.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
		this.aClass157_4.method3787(local24, local12, false, local19, local27, arg0, local19, local24);
	}

	@OriginalMember(owner = "client!sha", name = "e", descriptor = "(I)I")
	@Override
	public int method8976() {
		return this.aClass157_4.method3792();
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8983() {
		return this.aClass157_4.method3793();
	}

	@OriginalMember(owner = "client!sha", name = "c", descriptor = "(B)V")
	@Override
	public void method8989() {
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8988(@OriginalArg(1) Class65 arg0) {
		this.aClass157_4.method3790(arg0);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Lclient!mea;B)V")
	public void method7585(@OriginalArg(0) Class225 arg0) {
		this.aClass157_4.method3791(arg0);
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(ILclient!ha;)Lclient!pi;")
	@Override
	public Class28_Sub7 method8972(@OriginalArg(1) Class65 arg0) {
		@Pc(14) Class153 local14 = this.aClass157_4.method3789(2048, true, arg0, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class254 local21 = arg0.method6903();
		local21.method7361(super.aShort118 + super.anInt10781, super.anInt10779, super.aShort119 + super.anInt10784);
		@Pc(41) Class28_Sub7 local41 = Static375.method5607(this.aBoolean758, 1);
		@Pc(51) int local51 = super.anInt10781 >> 9;
		@Pc(56) int local56 = super.anInt10784 >> 9;
		this.aClass157_4.method3787(local56, local14, true, local51, local21, arg0, local51, local56);
		if (Static632.aBoolean877) {
			local14.method8594(local21, local41.aClass28_Sub9Array1[0], Static483.anInt8094, 0);
		} else {
			local14.method8585(local21, local41.aClass28_Sub9Array1[0], 0);
		}
		if (this.aClass157_4.aClass28_Sub5_3 != null) {
			@Pc(100) Class392 local100 = this.aClass157_4.aClass28_Sub5_3.method5856();
			if (Static632.aBoolean877) {
				arg0.method6897(local100, Static483.anInt8094);
			} else {
				arg0.method6899(local100);
			}
		}
		this.aBoolean759 = local14.F() || this.aClass157_4.aClass28_Sub5_3 != null;
		if (this.aClass160_4 == null) {
			this.aClass160_4 = Static224.method3501(super.anInt10779, super.anInt10784, local14, super.anInt10781);
		} else {
			Static476.method6818(this.aClass160_4, local14, super.anInt10784, super.anInt10781, super.anInt10779);
		}
		return local41;
	}

	@OriginalMember(owner = "client!sha", name = "c", descriptor = "(ILclient!ha;)Lclient!id;")
	@Override
	public Class160 method8978(@OriginalArg(1) Class65 arg0) {
		return this.aClass160_4;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(Z)I")
	@Override
	public int method8984() {
		return this.aClass157_4.anInt4480;
	}

	@OriginalMember(owner = "client!sha", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8963() {
		return false;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8985(@OriginalArg(1) Class65 arg0) {
		this.aClass157_4.method3788(arg0);
	}

	@OriginalMember(owner = "client!sha", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8965() {
		return this.aBoolean759;
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(B)I")
	@Override
	public int method8987() {
		return this.aClass157_4.anInt4489;
	}
}
