import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class12_Sub5_Sub1 extends Class12_Sub5 implements Interface11 {

	@OriginalMember(owner = "client!kg", name = "P", descriptor = "Lclient!ja;")
	public final Class120 aClass120_2;

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "Z")
	private final boolean aBoolean239;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!km;Lclient!cj;IIIIIZII)V")
	public Class12_Sub5_Sub1(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean68, arg1.aBoolean57);
		this.aClass120_2 = new Class120(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean239 = arg1.anInt788 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
	@Override
	public void method5022() {
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)I")
	@Override
	public int method5027() {
		return this.aClass120_2.anInt2929;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5026() {
		return this.aClass120_2.method2679();
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5455() {
		return false;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5021(@OriginalArg(0) Class82 arg0) {
		this.aClass120_2.method2686(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
		@Pc(16) Class3 local16 = this.aClass120_2.method2677(super.anInt5657, true, true, super.anInt5658, arg0, 131072);
		if (local16 != null) {
			this.aClass120_2.method2683(super.anInt5658 >> 7, super.anInt5658 >> 7, super.anInt5657 >> 7, arg0, super.anInt5657 >> 7, local16, false);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	@Override
	public void method5456() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I")
	@Override
	public int method5024() {
		return this.aClass120_2.anInt2942;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!km;II)Lclient!ab;")
	@Override
	public Class3 method5023(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		return this.aClass120_2.method2677(0, false, false, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		@Pc(16) Class3 local16 = this.aClass120_2.method2677(super.anInt5657, false, true, super.anInt5658, arg0, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class54 local23 = arg0.method4556();
		local23.method4789(super.anInt5658, super.anInt5653, super.anInt5657);
		@Pc(40) Class22_Sub8 local40 = null;
		if (this.aBoolean239) {
			local40 = Static128.method2279(1);
		}
		if (this.aClass120_2.aClass22_Sub6_3 == null) {
			local16.method3443(local23, local40 == null ? null : local40.aClass22_Sub1Array1[0], 0);
		} else {
			@Pc(70) Class157 local70 = this.aClass120_2.aClass22_Sub6_3.method3555();
			arg0.method4485(local16, local70, local23, local40 == null ? null : local40.aClass22_Sub1Array1[0]);
		}
		this.aClass120_2.method2683(super.anInt5658 >> 7, super.anInt5658 >> 7, super.anInt5657 >> 7, arg0, super.anInt5657 >> 7, local16, true);
		return local40;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5028(@OriginalArg(0) Class82 arg0) {
		this.aClass120_2.method2678(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)I")
	@Override
	public int method5025() {
		return this.aClass120_2.anInt2922;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class3 local16 = this.aClass120_2.method2677(super.anInt5657, false, false, super.anInt5658, arg0, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class54 local23 = arg0.method4556();
			local23.method4789(super.anInt5658, super.anInt5653, super.anInt5657);
			return local16.method3444(arg2, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!km;IZILclient!kj;B)V")
	@Override
	public void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5) {
		throw new IllegalStateException();
	}
}
