import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public abstract class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
	public int anInt3358 = 1000;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method2178() {
		return null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class5_Sub2_Sub2_Sub6 local7 = this.method2178();
		if (local7 != null) {
			this.anInt3358 = local7.anInt3358;
			local7.method2179(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}
