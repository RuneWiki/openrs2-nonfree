import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class20_Sub4_Sub3 extends Class20_Sub4 implements Interface9 {

	@OriginalMember(owner = "client!uk", name = "D", descriptor = "Lclient!dg;")
	public final Class50 aClass50_4;

	@OriginalMember(owner = "client!uk", name = "G", descriptor = "Z")
	private final boolean aBoolean545;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!qa;Lclient!kn;IIIIIZIIIIII)V")
	public Class20_Sub4_Sub3(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static454.method5615(arg12, arg11));
		this.aClass50_4 = new Class50(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean545 = arg1.anInt3379 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5128() {
		return this.aClass50_4.method1047();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)I")
	@Override
	public int method5122() {
		return this.aClass50_4.anInt1199;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
		@Pc(20) Class33 local20 = this.aClass50_4.method1049(false, arg0, 262144, super.anInt6661, true, super.anInt6658);
		if (local20 != null) {
			@Pc(27) int local27 = super.anInt6658 >> 7;
			@Pc(32) int local32 = super.anInt6661 >> 7;
			this.aClass50_4.method1051(local27, local32, local32, local27, local20, arg0, false);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		@Pc(24) Class33 local24 = this.aClass50_4.method1049(false, arg2, 131072, super.anInt6661, false, super.anInt6658);
		if (local24 == null) {
			return false;
		} else {
			@Pc(31) Class40 local31 = arg2.method3600();
			local31.R(super.anInt6653 + super.anInt6658, super.anInt6664, super.anInt6662 + super.anInt6661);
			return local24.method5395(arg0, arg1, local31, false);
		}
	}

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "(B)I")
	@Override
	public int method5118() {
		return this.aClass50_4.method1046();
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I")
	@Override
	public int method5124() {
		return this.aClass50_4.anInt1202;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	@Override
	public Class33 method5127(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1) {
		return this.aClass50_4.method1049(false, arg1, arg0, 0, false, 0);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5126(@OriginalArg(0) Class128 arg0) {
		this.aClass50_4.method1043(arg0);
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)I")
	@Override
	public int method5125() {
		return this.aClass50_4.anInt1194;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
	@Override
	public void method5123() {
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5121(@OriginalArg(1) Class128 arg0) {
		this.aClass50_4.method1044(arg0);
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		@Pc(16) Class33 local16 = this.aClass50_4.method1049(false, arg0, 2048, super.anInt6661, true, super.anInt6658);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class40 local28 = arg0.method3600();
		local28.R(super.anInt6653 + super.anInt6658, super.anInt6664, super.anInt6661 + super.anInt6662);
		@Pc(45) Class13_Sub4 local45 = null;
		if (this.aBoolean545) {
			local45 = Static192.method2550(1);
		}
		if (this.aClass50_4.aClass13_Sub2_1 == null) {
			local16.method5391(local28, local45 == null ? null : local45.aClass13_Sub8Array1[0], 0);
		} else {
			@Pc(75) Class194 local75 = this.aClass50_4.aClass13_Sub2_1.method702();
			arg0.method3557(local16, local75, local28, local45 == null ? null : local45.aClass13_Sub8Array1[0]);
		}
		@Pc(94) int local94 = super.anInt6658 >> 7;
		@Pc(99) int local99 = super.anInt6661 >> 7;
		this.aClass50_4.method1051(local94, local99, local99, local94, local16, arg0, true);
		return local45;
	}
}
