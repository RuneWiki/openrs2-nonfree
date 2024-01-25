import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class26_Sub2_Sub1 extends Class26_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!dt", name = "L", descriptor = "Lclient!eo;")
	public final Class72 aClass72_4;

	@OriginalMember(owner = "client!dt", name = "D", descriptor = "Z")
	private final boolean aBoolean81;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!qa;Lclient!pk;IIIIIZIIIIIII)V")
	public Class26_Sub2_Sub1(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5470 == 1, Static375.method5138(arg13, arg12));
		this.aClass72_4 = new Class72(arg0, arg1, arg12, arg13, super.aByte95, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean81 = arg1.anInt5468 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)I")
	@Override
	public int method4665() {
		return this.aClass72_4.anInt1806;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILclient!co;ILclient!qa;ZZ)V")
	@Override
	public void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method4669(@OriginalArg(1) int arg0, @OriginalArg(2) Class109 arg1) {
		return this.aClass72_4.method1507(false, 0, arg0, 0, arg1, false);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5512() {
		return false;
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5519(@OriginalArg(1) Class109 arg0) {
		@Pc(24) Class37 local24 = this.aClass72_4.method1507(true, super.anInt7068, 262144, super.anInt7065, arg0, true);
		if (local24 != null) {
			this.aClass72_4.method1505(super.aShort92, arg0, local24, false, super.aShort93, super.aShort94, super.aShort95);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class37 local18 = this.aClass72_4.method1507(false, super.anInt7068, 131072, super.anInt7065, arg0, false);
		if (local18 == null) {
			return false;
		} else {
			@Pc(25) Class18 local25 = arg0.method4709();
			local25.R(super.anInt7068, super.anInt7063, super.anInt7065);
			return local18.method4228(arg1, arg2, local25, false);
		}
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)V")
	@Override
	public void method4672() {
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4667(@OriginalArg(1) Class109 arg0) {
		this.aClass72_4.method1509(arg0);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)I")
	@Override
	public int method4666() {
		return this.aClass72_4.anInt1791;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4668(@OriginalArg(1) Class109 arg0) {
		this.aClass72_4.method1508(arg0);
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)I")
	@Override
	public int method4670() {
		return this.aClass72_4.anInt1795;
	}

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "(I)V")
	@Override
	public void method5516() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4671() {
		return this.aClass72_4.method1512();
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	@Override
	public Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0) {
		@Pc(16) Class37 local16 = this.aClass72_4.method1507(true, super.anInt7068, 2048, super.anInt7065, arg0, false);
		if (local16 == null) {
			return null;
		}
		@Pc(29) Class18 local29 = arg0.method4709();
		local29.R(super.anInt7068, super.anInt7063, super.anInt7065);
		@Pc(39) Class39_Sub4 local39 = null;
		if (this.aBoolean81) {
			local39 = Static72.method1208(1);
		}
		if (this.aClass72_4.aClass39_Sub8_1 == null) {
			local16.method4230(local29, local39 == null ? null : local39.aClass39_Sub7Array1[0], 0);
		} else {
			@Pc(69) Class185 local69 = this.aClass72_4.aClass39_Sub8_1.method5629();
			arg0.method4736(local16, local69, local29, local39 == null ? null : local39.aClass39_Sub7Array1[0]);
		}
		this.aClass72_4.method1505(super.aShort92, arg0, local16, true, super.aShort93, super.aShort94, super.aShort95);
		return local39;
	}

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "(I)I")
	@Override
	public int method5522() {
		return this.aClass72_4.method1504();
	}
}
