import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
	public int anInt6158;

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
	public int anInt6160;

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
	public int anInt6161;

	@OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
	public int anInt6166;

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
	public int anInt6162 = -1;

	@OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
	public int anInt6165 = -1;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILclient!dr;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		@Pc(6) Class38 local6 = arg2.method3672();
		local6.method4474(super.anInt6148, super.anInt6156, super.anInt6154);
		@Pc(39) Class49 local39 = Static310.aClass184_2.method5040(this.anInt6161).method3402(this.anInt6160, 65536, 0, arg2, 0, -1, null, null);
		if (local39 != null && local39.method5816(arg0, arg1, local6, true)) {
			return true;
		}
		if (this.anInt6162 != -1) {
			local39 = Static310.aClass184_2.method5040(this.anInt6162).method3402(this.anInt6158, 65536, 0, arg2, 0, -1, null, null);
			if (local39 != null && local39.method5816(arg0, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt6165 != -1) {
			local39 = Static310.aClass184_2.method5040(this.anInt6165).method3402(this.anInt6166, 65536, 0, arg2, 0, -1, null, null);
			if (local39 != null && local39.method5816(arg0, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	@Override
	public Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0) {
		@Pc(6) Class38 local6 = arg0.method3672();
		local6.method4474(super.anInt6148, super.anInt6156, super.anInt6154);
		@Pc(18) Class57_Sub5 local18 = Static116.method2281(3);
		@Pc(42) Class49 local42;
		if (this.anInt6165 != -1) {
			local42 = Static310.aClass184_2.method5040(this.anInt6165).method3402(this.anInt6166, 1024, 0, arg0, 0, -1, null, null);
			if (local42 != null) {
				local42.method5825(local6, local18.aClass57_Sub4Array1[2], 0);
			}
		}
		if (this.anInt6162 != -1) {
			local42 = Static310.aClass184_2.method5040(this.anInt6162).method3402(this.anInt6158, 1024, 0, arg0, 0, -1, null, null);
			if (local42 != null) {
				local42.method5825(local6, local18.aClass57_Sub4Array1[1], 0);
			}
		}
		local42 = Static310.aClass184_2.method5040(this.anInt6161).method3402(this.anInt6160, 1024, 0, arg0, 0, -1, null, null);
		if (local42 != null) {
			local42.method5825(local6, local18.aClass57_Sub4Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5754(@OriginalArg(0) Class37 arg0) {
	}
}
