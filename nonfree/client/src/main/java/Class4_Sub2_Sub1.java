import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public abstract class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!uc", name = "zb", descriptor = "I")
	public int anInt3118 = 1000;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class4_Sub2_Sub1_Sub6 local3 = this.method2172();
		if (local3 != null) {
			this.anInt3118 = local3.anInt3118;
			local3.method2171(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(B)Lclient!vb;")
	public Class4_Sub2_Sub1_Sub6 method2172() {
		return null;
	}
}
