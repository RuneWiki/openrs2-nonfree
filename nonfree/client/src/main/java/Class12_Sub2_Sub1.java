import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class12_Sub2_Sub1 extends Class12_Sub2 implements Interface11 {

	@OriginalMember(owner = "client!bi", name = "M", descriptor = "Lclient!ja;")
	public final Class120 aClass120_1;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "Z")
	private final boolean aBoolean30;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!km;Lclient!cj;IIIIIZIII)V")
	public Class12_Sub2_Sub1(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static286.method4395(arg8, arg9));
		this.aClass120_1 = new Class120(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt1074, super.anInt1077, arg7, arg10);
		this.aBoolean30 = arg1.anInt788 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5455() {
		return false;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
	@Override
	public void method5022() {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I")
	@Override
	public int method5024() {
		return this.aClass120_1.anInt2942;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)I")
	@Override
	public int method5025() {
		return this.aClass120_1.anInt2922;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
		@Pc(24) Class3 local24 = this.aClass120_1.method2677(super.anInt1077, true, true, super.anInt1074, arg0, 131072);
		if (local24 != null) {
			this.aClass120_1.method2683(super.anInt1074 >> 7, super.anInt1074 >> 7, super.anInt1077 >> 7, arg0, super.anInt1077 >> 7, local24, false);
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)I")
	@Override
	public int method5027() {
		return this.aClass120_1.anInt2929;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!km;II)Lclient!ab;")
	@Override
	public Class3 method5023(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		return this.aClass120_1.method2677(0, false, false, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		@Pc(16) Class3 local16 = this.aClass120_1.method2677(super.anInt1077, false, true, super.anInt1074, arg0, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class54 local23 = arg0.method4556();
		local23.method4789(super.anInt1074, super.anInt1076, super.anInt1077);
		@Pc(39) Class22_Sub8 local39 = null;
		if (this.aBoolean30) {
			local39 = Static128.method2279(1);
		}
		if (this.aClass120_1.aClass22_Sub6_3 == null) {
			local16.method3443(local23, local39 == null ? null : local39.aClass22_Sub1Array1[0], 0);
		} else {
			@Pc(55) Class157 local55 = this.aClass120_1.aClass22_Sub6_3.method3555();
			arg0.method4485(local16, local55, local23, local39 == null ? null : local39.aClass22_Sub1Array1[0]);
		}
		this.aClass120_1.method2683(super.anInt1074 >> 7, super.anInt1074 >> 7, super.anInt1077 >> 7, arg0, super.anInt1077 >> 7, local16, true);
		return local39;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!km;IZILclient!kj;B)V")
	@Override
	public void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5021(@OriginalArg(0) Class82 arg0) {
		this.aClass120_1.method2686(arg0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) Class3 local23 = this.aClass120_1.method2677(super.anInt1077, false, false, super.anInt1074, arg0, 65536);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class54 local30 = arg0.method4556();
			local30.method4789(super.anInt1074, super.anInt1076, super.anInt1077);
			return local23.method3444(arg2, arg1, local30, false);
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5028(@OriginalArg(0) Class82 arg0) {
		this.aClass120_1.method2678(arg0);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5026() {
		return this.aClass120_1.method2679();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	@Override
	public void method5456() {
		throw new IllegalStateException();
	}
}
