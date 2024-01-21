import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GLSQHJVO")
public class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!GLSQHJVO", name = "h", descriptor = "[Lclient!QGLHAGGP;")
	public Class37[] aClass37Array10;

	@OriginalMember(owner = "client!GLSQHJVO", name = "i", descriptor = "I")
	public int anInt791 = 1000;

	@OriginalMember(owner = "client!GLSQHJVO", name = "a", descriptor = "(IIIIIIIII)V")
	public void method573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub2_Sub2_Sub3 local3 = this.method574();
		if (local3 != null) {
			this.anInt791 = local3.anInt791;
			local3.method573(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!GLSQHJVO", name = "a", descriptor = "(I)Lclient!IRLTEWJP;")
	protected Class1_Sub2_Sub2_Sub3 method574() {
		try {
			return null;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("23334, " + -840 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}
}
