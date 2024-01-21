import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public abstract class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vb", name = "db", descriptor = "I")
	public int anInt2656 = 1000;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class2_Sub2_Sub2_Sub5 local3 = this.method1855();
		if (local3 != null) {
			this.anInt2656 = local3.anInt2656;
			local3.method1852(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method1855() {
		return null;
	}
}
