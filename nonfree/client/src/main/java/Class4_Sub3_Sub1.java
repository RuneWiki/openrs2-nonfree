import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class4_Sub3_Sub1 extends Class4_Sub3 implements Interface9 {

	@OriginalMember(owner = "client!gf", name = "D", descriptor = "Lclient!id;")
	public final Class117 aClass117_1;

	@OriginalMember(owner = "client!gf", name = "B", descriptor = "Z")
	private final boolean aBoolean221;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!qa;Lclient!us;IIIIIZII)V")
	public Class4_Sub3_Sub1(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean608, arg1.aBoolean605);
		this.aClass117_1 = new Class117(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean221 = arg1.anInt7186 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	@Override
	public void method5899() {
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class32 local16 = this.aClass117_1.method2618(false, false, arg1, super.anInt4182, super.anInt4181, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class102 local23 = arg1.method2223();
			local23.R(super.anInt4181, super.anInt4183, super.anInt4182);
			return local16.method5671(arg2, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)I")
	@Override
	public int method5901() {
		return this.aClass117_1.anInt3240;
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5905() {
		return this.aClass117_1.method2625();
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(ILclient!qa;)Lclient!fm;")
	@Override
	public Class38_Sub3 method5896(@OriginalArg(1) Class26 arg0) {
		@Pc(18) Class32 local18 = this.aClass117_1.method2618(false, true, arg0, super.anInt4182, super.anInt4181, 2048);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class102 local25 = arg0.method2223();
		local25.R(super.anInt4181, super.anInt4183, super.anInt4182);
		@Pc(42) Class38_Sub3 local42 = null;
		if (this.aBoolean221) {
			local42 = Static313.method4433(1);
		}
		if (this.aClass117_1.aClass38_Sub6_1 == null) {
			local18.method5675(local25, local42 == null ? null : local42.aClass38_Sub4Array1[0], 0);
		} else {
			@Pc(72) Class192 local72 = this.aClass117_1.aClass38_Sub6_1.method3549();
			arg0.method2218(local18, local72, local25, local42 == null ? null : local42.aClass38_Sub4Array1[0]);
		}
		@Pc(91) int local91 = super.anInt4181 >> 7;
		@Pc(96) int local96 = super.anInt4182 >> 7;
		this.aClass117_1.method2614(local18, arg0, local91, local96, local96, local91, true);
		return local42;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)I")
	@Override
	public int method5904() {
		return this.aClass117_1.anInt3233;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILclient!qa;Lclient!eq;IIZ)V")
	@Override
	public void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5900(@OriginalArg(0) Class26 arg0) {
		this.aClass117_1.method2619(arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!qa;I)Lclient!c;")
	@Override
	public Class32 method5906(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1) {
		return this.aClass117_1.method2618(false, false, arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method5893(@OriginalArg(0) Class26 arg0) {
		@Pc(16) Class32 local16 = this.aClass117_1.method2618(true, true, arg0, super.anInt4182, super.anInt4181, 262144);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt4181 >> 7;
			@Pc(28) int local28 = super.anInt4182 >> 7;
			this.aClass117_1.method2614(local16, arg0, local23, local28, local28, local23, false);
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5891() {
		return false;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)I")
	@Override
	public int method5902() {
		return this.aClass117_1.anInt3237;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5903(@OriginalArg(1) Class26 arg0) {
		this.aClass117_1.method2617(arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
	@Override
	public void method5889() {
		throw new IllegalStateException();
	}
}
