import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class26_Sub4_Sub1 extends Class26_Sub4 implements Interface6 {

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "Lclient!eo;")
	public final Class72 aClass72_3;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Z")
	private final boolean aBoolean67;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!qa;Lclient!pk;IIIIIZII)V")
	public Class26_Sub4_Sub1(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean348, arg1.aBoolean359);
		this.aClass72_3 = new Class72(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean67 = arg1.anInt5468 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	@Override
	public void method4672() {
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5512() {
		return false;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!co;ILclient!qa;ZZ)V")
	@Override
	public void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4671() {
		return this.aClass72_3.method1512();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method4669(@OriginalArg(1) int arg0, @OriginalArg(2) Class109 arg1) {
		return this.aClass72_3.method1507(false, 0, arg0, 0, arg1, false);
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5519(@OriginalArg(1) Class109 arg0) {
		@Pc(24) Class37 local24 = this.aClass72_3.method1507(true, super.anInt3476, 262144, super.anInt3474, arg0, true);
		if (local24 != null) {
			@Pc(31) int local31 = super.anInt3476 >> 7;
			@Pc(36) int local36 = super.anInt3474 >> 7;
			this.aClass72_3.method1505(local31, arg0, local24, false, local31, local36, local36);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4667(@OriginalArg(1) Class109 arg0) {
		this.aClass72_3.method1509(arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
	@Override
	public int method4666() {
		return this.aClass72_3.anInt1791;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	@Override
	public Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0) {
		@Pc(18) Class37 local18 = this.aClass72_3.method1507(true, super.anInt3476, 2048, super.anInt3474, arg0, false);
		if (local18 == null) {
			return null;
		}
		@Pc(30) Class18 local30 = arg0.method4709();
		local30.R(super.anInt3476, super.anInt3475, super.anInt3474);
		@Pc(40) Class39_Sub4 local40 = null;
		if (this.aBoolean67) {
			local40 = Static72.method1208(1);
		}
		if (this.aClass72_3.aClass39_Sub8_1 == null) {
			local18.method4230(local30, local40 == null ? null : local40.aClass39_Sub7Array1[0], 0);
		} else {
			@Pc(72) Class185 local72 = this.aClass72_3.aClass39_Sub8_1.method5629();
			arg0.method4736(local18, local72, local30, local40 == null ? null : local40.aClass39_Sub7Array1[0]);
		}
		@Pc(91) int local91 = super.anInt3476 >> 7;
		@Pc(96) int local96 = super.anInt3474 >> 7;
		this.aClass72_3.method1505(local91, arg0, local18, true, local91, local96, local96);
		return local40;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)I")
	@Override
	public int method4670() {
		return this.aClass72_3.anInt1795;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)I")
	@Override
	public int method4665() {
		return this.aClass72_3.anInt1806;
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
	@Override
	public void method5516() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4668(@OriginalArg(1) Class109 arg0) {
		this.aClass72_3.method1508(arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) Class37 local23 = this.aClass72_3.method1507(false, super.anInt3476, 131072, super.anInt3474, arg0, false);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class18 local30 = arg0.method4709();
			local30.R(super.anInt3476, super.anInt3475, super.anInt3474);
			return local23.method4228(arg1, arg2, local30, false);
		}
	}
}
