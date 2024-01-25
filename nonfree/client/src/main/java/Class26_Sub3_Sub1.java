import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class26_Sub3_Sub1 extends Class26_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!cm", name = "H", descriptor = "Lclient!eo;")
	public final Class72 aClass72_2;

	@OriginalMember(owner = "client!cm", name = "y", descriptor = "Z")
	private final boolean aBoolean51;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!qa;Lclient!pk;IIIIIZIIIIII)V")
	public Class26_Sub3_Sub1(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static121.method1797(arg12, arg11));
		this.aClass72_2 = new Class72(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean51 = arg1.anInt5468 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
	@Override
	public void method4672() {
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	@Override
	public Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0) {
		@Pc(16) Class37 local16 = this.aClass72_2.method1507(true, super.anInt5768, 2048, super.anInt5760, arg0, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class18 local23 = arg0.method4709();
		local23.R(super.anInt5755 + super.anInt5768, super.anInt5758, super.anInt5765 + super.anInt5760);
		@Pc(46) Class39_Sub4 local46 = null;
		if (this.aBoolean51) {
			local46 = Static72.method1208(1);
		}
		if (this.aClass72_2.aClass39_Sub8_1 == null) {
			local16.method4230(local23, local46 == null ? null : local46.aClass39_Sub7Array1[0], 0);
		} else {
			@Pc(62) Class185 local62 = this.aClass72_2.aClass39_Sub8_1.method5629();
			arg0.method4736(local16, local62, local23, local46 == null ? null : local46.aClass39_Sub7Array1[0]);
		}
		@Pc(95) int local95 = super.anInt5768 >> 7;
		@Pc(100) int local100 = super.anInt5760 >> 7;
		this.aClass72_2.method1505(local95, arg0, local16, true, local95, local100, local100);
		return local46;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)I")
	@Override
	public int method4670() {
		return this.aClass72_2.anInt1795;
	}

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "(I)I")
	@Override
	public int method4627() {
		return this.aClass72_2.method1504();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I")
	@Override
	public int method4666() {
		return this.aClass72_2.anInt1791;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method4669(@OriginalArg(1) int arg0, @OriginalArg(2) Class109 arg1) {
		return this.aClass72_2.method1507(false, 0, arg0, 0, arg1, false);
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4671() {
		return this.aClass72_2.method1512();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)I")
	@Override
	public int method4665() {
		return this.aClass72_2.anInt1806;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5519(@OriginalArg(1) Class109 arg0) {
		@Pc(16) Class37 local16 = this.aClass72_2.method1507(true, super.anInt5768, 262144, super.anInt5760, arg0, false);
		if (local16 != null) {
			@Pc(31) int local31 = super.anInt5768 >> 7;
			@Pc(36) int local36 = super.anInt5760 >> 7;
			this.aClass72_2.method1505(local31, arg0, local16, false, local31, local36, local36);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4667(@OriginalArg(1) Class109 arg0) {
		this.aClass72_2.method1509(arg0);
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4668(@OriginalArg(1) Class109 arg0) {
		this.aClass72_2.method1508(arg0);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) Class37 local23 = this.aClass72_2.method1507(false, super.anInt5768, 131072, super.anInt5760, arg0, false);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class18 local30 = arg0.method4709();
			local30.R(super.anInt5755 + super.anInt5768, super.anInt5758, super.anInt5760 + super.anInt5765);
			return local23.method4228(arg1, arg2, local30, false);
		}
	}
}
