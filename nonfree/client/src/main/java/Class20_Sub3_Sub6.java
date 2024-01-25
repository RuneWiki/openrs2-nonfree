import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class20_Sub3_Sub6 extends Class20_Sub3 implements Interface9 {

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "Lclient!dg;")
	public final Class50 aClass50_3;

	@OriginalMember(owner = "client!ui", name = "D", descriptor = "Z")
	private final boolean aBoolean544;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!qa;Lclient!kn;IIIIIZIIIIIII)V")
	public Class20_Sub3_Sub6(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt3429 == 1, Static290.method3793(arg13, arg12));
		this.aClass50_3 = new Class50(arg0, arg1, arg12, arg13, super.aByte89, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean544 = arg1.anInt3379 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)I")
	@Override
	public int method5125() {
		return this.aClass50_3.anInt1194;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		@Pc(16) Class33 local16 = this.aClass50_3.method1049(false, arg0, 2048, super.anInt6616, true, super.anInt6613);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class40 local28 = arg0.method3600();
		local28.R(super.anInt6613, super.anInt6615, super.anInt6616);
		@Pc(38) Class13_Sub4 local38 = null;
		if (this.aBoolean544) {
			local38 = Static192.method2550(1);
		}
		if (this.aClass50_3.aClass13_Sub2_1 == null) {
			local16.method5391(local28, local38 == null ? null : local38.aClass13_Sub8Array1[0], 0);
		} else {
			@Pc(68) Class194 local68 = this.aClass50_3.aClass13_Sub2_1.method702();
			arg0.method3557(local16, local68, local28, local38 == null ? null : local38.aClass13_Sub8Array1[0]);
		}
		this.aClass50_3.method1051(super.aShort85, super.aShort86, super.aShort88, super.aShort87, local16, arg0, true);
		return local38;
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)I")
	@Override
	public int method5097() {
		return this.aClass50_3.method1046();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		@Pc(24) Class33 local24 = this.aClass50_3.method1049(false, arg2, 131072, super.anInt6616, false, super.anInt6613);
		if (local24 == null) {
			return false;
		} else {
			@Pc(31) Class40 local31 = arg2.method3600();
			local31.R(super.anInt6613, super.anInt6615, super.anInt6616);
			return local24.method5395(arg0, arg1, local31, false);
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5110() {
		return false;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5121(@OriginalArg(1) Class128 arg0) {
		this.aClass50_3.method1044(arg0);
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)V")
	@Override
	public void method5111() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
		@Pc(23) Class33 local23 = this.aClass50_3.method1049(true, arg0, 262144, super.anInt6616, true, super.anInt6613);
		if (local23 != null) {
			this.aClass50_3.method1051(super.aShort85, super.aShort86, super.aShort88, super.aShort87, local23, arg0, false);
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)I")
	@Override
	public int method5124() {
		return this.aClass50_3.anInt1202;
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5128() {
		return this.aClass50_3.method1047();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
	@Override
	public void method5123() {
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)I")
	@Override
	public int method5122() {
		return this.aClass50_3.anInt1199;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIILclient!er;Lclient!qa;IB)V")
	@Override
	public void method5116(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5126(@OriginalArg(0) Class128 arg0) {
		this.aClass50_3.method1043(arg0);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	@Override
	public Class33 method5127(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1) {
		return this.aClass50_3.method1049(false, arg1, arg0, 0, false, 0);
	}
}
