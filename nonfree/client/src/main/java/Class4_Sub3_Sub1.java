import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public abstract class Class4_Sub3_Sub1 extends Class4_Sub3 {

	@OriginalMember(owner = "client!h", name = "J", descriptor = "I")
	public int anInt2166 = 1000;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method1484() {
		return null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class4_Sub3_Sub1_Sub7 local3 = this.method1484();
		if (local3 != null) {
			this.anInt2166 = local3.anInt2166;
			local3.method1485(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}
