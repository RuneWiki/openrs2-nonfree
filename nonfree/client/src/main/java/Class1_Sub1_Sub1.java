import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JNFESWRD")
public class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!JNFESWRD", name = "h", descriptor = "[Lclient!IFUVAINH;")
	public Class12[] aClass12Array10;

	@OriginalMember(owner = "client!JNFESWRD", name = "i", descriptor = "I")
	public int anInt724 = 1000;

	@OriginalMember(owner = "client!JNFESWRD", name = "a", descriptor = "(IIIIIIIII)V")
	public void method512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub1_Sub1_Sub3 local3 = this.method513();
		if (local3 != null) {
			this.anInt724 = local3.anInt724;
			local3.method512(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!JNFESWRD", name = "a", descriptor = "(Z)Lclient!IYSWJGDE;")
	protected Class1_Sub1_Sub1_Sub3 method513() {
		try {
			return null;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("47822, " + true + ", " + local8.toString());
			throw new RuntimeException();
		}
	}
}
