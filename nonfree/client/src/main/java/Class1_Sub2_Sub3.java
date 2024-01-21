import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public abstract class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
	public int anInt2778 = 1000;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub2_Sub3_Sub2 local3 = this.method1969();
		if (local3 != null) {
			this.anInt2778 = local3.anInt2778;
			local3.method1968(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method1969() {
		return null;
	}
}
