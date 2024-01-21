import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public abstract class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vb", name = "yb", descriptor = "I")
	public int anInt2698 = 1000;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class2_Sub1_Sub1_Sub5 local7 = this.method1778();
		if (local7 != null) {
			this.anInt2698 = local7.anInt2698;
			local7.method1777(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method1778() {
		return null;
	}
}
