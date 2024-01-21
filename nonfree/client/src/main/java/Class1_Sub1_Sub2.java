import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public abstract class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ha", name = "qb", descriptor = "I")
	public int anInt2678 = 1000;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method1910() {
		return null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub1_Sub2_Sub7 local3 = this.method1910();
		if (local3 != null) {
			this.anInt2678 = local3.anInt2678;
			local3.method1911(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}
