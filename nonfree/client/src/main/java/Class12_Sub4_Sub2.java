import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class12_Sub4_Sub2 extends Class12_Sub4 implements Interface11 {

	@OriginalMember(owner = "client!ql", name = "K", descriptor = "Lclient!ja;")
	public final Class120 aClass120_3;

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "Z")
	private final boolean aBoolean416;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!km;Lclient!cj;IIIIIZIIIIII)V")
	public Class12_Sub4_Sub2(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static32.method5232(arg11, arg12));
		this.aClass120_3 = new Class120(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean416 = arg1.anInt788 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!km;II)Lclient!ab;")
	@Override
	public Class3 method5023(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		return this.aClass120_3.method2677(0, false, false, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)I")
	@Override
	public int method5025() {
		return this.aClass120_3.anInt2922;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) Class3 local26 = this.aClass120_3.method2677(super.anInt5721, false, false, super.anInt5727, arg0, 65536);
		if (local26 == null) {
			return false;
		} else {
			@Pc(33) Class54 local33 = arg0.method4556();
			local33.method4789(super.anInt5727 + super.anInt5725, super.anInt5724, super.anInt5721 + super.anInt5726);
			return local26.method3444(arg2, arg1, local33, false);
		}
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
		@Pc(16) Class3 local16 = this.aClass120_3.method2677(super.anInt5721, false, true, super.anInt5727, arg0, 131072);
		if (local16 != null) {
			this.aClass120_3.method2683(super.anInt5727 >> 7, super.anInt5727 >> 7, super.anInt5721 >> 7, arg0, super.anInt5721 >> 7, local16, false);
		}
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)I")
	@Override
	public int method5019() {
		return this.aClass120_3.method2681();
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		@Pc(23) Class3 local23 = this.aClass120_3.method2677(super.anInt5721, false, true, super.anInt5727, arg0, 1024);
		if (local23 == null) {
			return null;
		}
		@Pc(30) Class54 local30 = arg0.method4556();
		local30.method4789(super.anInt5727 + super.anInt5725, super.anInt5724, super.anInt5721 + super.anInt5726);
		@Pc(47) Class22_Sub8 local47 = null;
		if (this.aBoolean416) {
			local47 = Static128.method2279(1);
		}
		if (this.aClass120_3.aClass22_Sub6_3 == null) {
			local23.method3443(local30, local47 == null ? null : local47.aClass22_Sub1Array1[0], 0);
		} else {
			@Pc(77) Class157 local77 = this.aClass120_3.aClass22_Sub6_3.method3555();
			arg0.method4485(local23, local77, local30, local47 == null ? null : local47.aClass22_Sub1Array1[0]);
		}
		this.aClass120_3.method2683(super.anInt5727 >> 7, super.anInt5727 >> 7, super.anInt5721 >> 7, arg0, super.anInt5721 >> 7, local23, true);
		return local47;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5026() {
		return this.aClass120_3.method2679();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)I")
	@Override
	public int method5024() {
		return this.aClass120_3.anInt2942;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5021(@OriginalArg(0) Class82 arg0) {
		this.aClass120_3.method2686(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
	@Override
	public void method5022() {
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5028(@OriginalArg(0) Class82 arg0) {
		this.aClass120_3.method2678(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)I")
	@Override
	public int method5027() {
		return this.aClass120_3.anInt2929;
	}
}
