import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class28_Sub1_Sub5_Sub1 extends Class28_Sub1_Sub5 implements Interface1 {

	@OriginalMember(owner = "client!lh", name = "S", descriptor = "Lclient!id;")
	private Class160 aClass160_3;

	@OriginalMember(owner = "client!lh", name = "E", descriptor = "Z")
	private boolean aBoolean557 = false;

	@OriginalMember(owner = "client!lh", name = "Y", descriptor = "Lclient!hw;")
	public final Class157 aClass157_3;

	@OriginalMember(owner = "client!lh", name = "T", descriptor = "Z")
	private final boolean aBoolean558;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!ha;Lclient!ih;IIIIIZIII)V")
	public Class28_Sub1_Sub5_Sub1(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static98.method1950(arg9, arg8));
		this.aClass157_3 = new Class157(arg0, arg1, arg8, arg9, super.aByte145, arg3, this, arg7, arg10);
		this.aBoolean558 = arg1.anInt4647 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8963() {
		return false;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8962(@OriginalArg(0) Class65 arg0) {
		@Pc(20) Class153 local20 = this.aClass157_3.method3789(262144, true, arg0, true);
		if (local20 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt10781 >> 9;
		@Pc(32) int local32 = super.anInt10784 >> 9;
		@Pc(35) Class254 local35 = arg0.method6903();
		local35.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
		this.aClass157_3.method3787(local32, local20, false, local27, local35, arg0, local27, local32);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZIBLclient!lq;Lclient!ha;II)V")
	@Override
	public void method8969(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class28_Sub1 arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8973() {
		return false;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(ILclient!ha;)Lclient!pi;")
	@Override
	public Class28_Sub7 method8972(@OriginalArg(1) Class65 arg0) {
		@Pc(14) Class153 local14 = this.aClass157_3.method3789(2048, true, arg0, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class254 local21 = arg0.method6903();
		local21.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
		@Pc(35) Class28_Sub7 local35 = Static375.method5607(this.aBoolean558, 1);
		@Pc(40) int local40 = super.anInt10781 >> 9;
		@Pc(50) int local50 = super.anInt10784 >> 9;
		this.aClass157_3.method3787(local50, local14, true, local40, local21, arg0, local40, local50);
		if (Static632.aBoolean877) {
			local14.method8594(local21, local35.aClass28_Sub9Array1[0], Static483.anInt8094, 0);
		} else {
			local14.method8585(local21, local35.aClass28_Sub9Array1[0], 0);
		}
		if (this.aClass157_3.aClass28_Sub5_3 != null) {
			@Pc(94) Class392 local94 = this.aClass157_3.aClass28_Sub5_3.method5856();
			if (Static632.aBoolean877) {
				arg0.method6897(local94, Static483.anInt8094);
			} else {
				arg0.method6899(local94);
			}
		}
		this.aBoolean557 = local14.F() || this.aClass157_3.aClass28_Sub5_3 != null;
		if (this.aClass160_3 == null) {
			this.aClass160_3 = Static224.method3501(super.anInt10779, super.anInt10784, local14, super.anInt10781);
		} else {
			Static476.method6818(this.aClass160_3, local14, super.anInt10784, super.anInt10781, super.anInt10779);
		}
		return local35;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8988(@OriginalArg(1) Class65 arg0) {
		this.aClass157_3.method3790(arg0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)I")
	@Override
	public int method8984() {
		return this.aClass157_3.anInt4480;
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)I")
	@Override
	public int method8976() {
		return this.aClass157_3.method3792();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)I")
	@Override
	public int method8986() {
		return this.aClass157_3.anInt4493;
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8965() {
		return this.aBoolean557;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!mea;B)V")
	public void method5267(@OriginalArg(0) Class225 arg0) {
		this.aClass157_3.method3791(arg0);
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V")
	@Override
	public void method8989() {
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	@Override
	public void method8960() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8985(@OriginalArg(1) Class65 arg0) {
		this.aClass157_3.method3788(arg0);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)I")
	@Override
	public int method8987() {
		return this.aClass157_3.anInt4489;
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)I")
	@Override
	public int method8964(@OriginalArg(0) byte arg0) {
		if (arg0 > -85) {
			this.aClass160_3 = null;
		}
		return this.aClass157_3.method3786(0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(12) Class153 local12 = this.aClass157_3.method3789(131072, false, arg2, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(27) Class254 local27 = arg2.method6903();
			local27.method7361(super.anInt10781, super.anInt10779, super.anInt10784);
			return Static632.aBoolean877 ? local12.method8590(arg0, arg1, local27, false, 0, Static483.anInt8094) : local12.method8593(arg0, arg1, local27, false, 0);
		}
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(ILclient!ha;)Lclient!id;")
	@Override
	public Class160 method8978(@OriginalArg(1) Class65 arg0) {
		return this.aClass160_3;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8983() {
		return this.aClass157_3.method3793();
	}
}
