import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class26_Sub5_Sub1 extends Class26_Sub5 {

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
	public int anInt4201;

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
	public int anInt4203;

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
	public int anInt4204;

	@OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
	public int anInt4207;

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
	public int anInt4206 = -1;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
	public int anInt4199 = -1;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		@Pc(6) Class33 local6 = arg0.method5285();
		local6.j(super.anInt4196, super.anInt4190, super.anInt4193);
		@Pc(20) Class28_Sub4 local20 = Static329.method4328(3);
		@Pc(44) Class163 local44;
		if (this.anInt4206 != -1) {
			local44 = Static259.aClass206_2.method4320(this.anInt4206).method761(arg0, this.anInt4201, null, 0, 0, 2048, null, -1);
			if (local44 != null) {
				local44.method4667(local6, local20.aClass28_Sub6Array1[2], 0);
			}
		}
		if (this.anInt4199 != -1) {
			local44 = Static259.aClass206_2.method4320(this.anInt4199).method761(arg0, this.anInt4207, null, 0, 0, 2048, null, -1);
			if (local44 != null) {
				local44.method4667(local6, local20.aClass28_Sub6Array1[1], 0);
			}
		}
		local44 = Static259.aClass206_2.method4320(this.anInt4204).method761(arg0, this.anInt4203, null, 0, 0, 2048, null, -1);
		if (local44 != null) {
			local44.method4667(local6, local20.aClass28_Sub6Array1[0], 0);
		}
		return local20;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class33 local6 = arg1.method5285();
		local6.j(super.anInt4196, super.anInt4190, super.anInt4193);
		@Pc(31) Class163 local31 = Static259.aClass206_2.method4320(this.anInt4204).method761(arg1, this.anInt4203, null, 0, 0, 131072, null, -1);
		if (local31 != null && local31.method4653(arg0, arg2, local6, true)) {
			return true;
		}
		if (this.anInt4199 != -1) {
			local31 = Static259.aClass206_2.method4320(this.anInt4199).method761(arg1, this.anInt4207, null, 0, 0, 131072, null, -1);
			if (local31 != null && local31.method4653(arg0, arg2, local6, true)) {
				return true;
			}
		}
		if (this.anInt4206 != -1) {
			local31 = Static259.aClass206_2.method4320(this.anInt4206).method761(arg1, this.anInt4201, null, 0, 0, 131072, null, -1);
			if (local31 != null && local31.method4653(arg0, arg2, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
