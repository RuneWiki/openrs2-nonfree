import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class20_Sub2_Sub1 extends Class20_Sub2 implements Interface9 {

	@OriginalMember(owner = "client!bl", name = "F", descriptor = "Lclient!dg;")
	public final Class50 aClass50_2;

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "Z")
	private final boolean aBoolean47;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!qa;Lclient!kn;IIIIIZII)V")
	public Class20_Sub2_Sub1(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean271, arg1.aBoolean269);
		this.aClass50_2 = new Class50(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean47 = arg1.anInt3379 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)I")
	@Override
	public int method5124() {
		return this.aClass50_2.anInt1202;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)I")
	@Override
	public int method5125() {
		return this.aClass50_2.anInt1194;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)I")
	@Override
	public int method5122() {
		return this.aClass50_2.anInt1199;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIILclient!er;Lclient!qa;IB)V")
	@Override
	public void method5116(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5121(@OriginalArg(1) Class128 arg0) {
		this.aClass50_2.method1044(arg0);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	@Override
	public void method5123() {
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5110() {
		return false;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5128() {
		return this.aClass50_2.method1047();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		@Pc(24) Class33 local24 = this.aClass50_2.method1049(false, arg2, 131072, super.anInt5044, false, super.anInt5039);
		if (local24 == null) {
			return false;
		} else {
			@Pc(31) Class40 local31 = arg2.method3600();
			local31.R(super.anInt5039, super.anInt5040, super.anInt5044);
			return local24.method5395(arg0, arg1, local31, false);
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		@Pc(16) Class33 local16 = this.aClass50_2.method1049(false, arg0, 2048, super.anInt5044, true, super.anInt5039);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class40 local23 = arg0.method3600();
		local23.R(super.anInt5039, super.anInt5040, super.anInt5044);
		@Pc(33) Class13_Sub4 local33 = null;
		if (this.aBoolean47) {
			local33 = Static192.method2550(1);
		}
		if (this.aClass50_2.aClass13_Sub2_1 == null) {
			local16.method5391(local23, local33 == null ? null : local33.aClass13_Sub8Array1[0], 0);
		} else {
			@Pc(63) Class194 local63 = this.aClass50_2.aClass13_Sub2_1.method702();
			arg0.method3557(local16, local63, local23, local33 == null ? null : local33.aClass13_Sub8Array1[0]);
		}
		@Pc(88) int local88 = super.anInt5039 >> 7;
		@Pc(93) int local93 = super.anInt5044 >> 7;
		this.aClass50_2.method1051(local88, local93, local93, local88, local16, arg0, true);
		return local33;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
		@Pc(21) Class33 local21 = this.aClass50_2.method1049(true, arg0, 262144, super.anInt5044, true, super.anInt5039);
		if (local21 != null) {
			@Pc(28) int local28 = super.anInt5039 >> 7;
			@Pc(33) int local33 = super.anInt5044 >> 7;
			this.aClass50_2.method1051(local28, local33, local33, local28, local21, arg0, false);
		}
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)V")
	@Override
	public void method5111() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	@Override
	public Class33 method5127(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1) {
		return this.aClass50_2.method1049(false, arg1, arg0, 0, false, 0);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5126(@OriginalArg(0) Class128 arg0) {
		this.aClass50_2.method1043(arg0);
	}
}
