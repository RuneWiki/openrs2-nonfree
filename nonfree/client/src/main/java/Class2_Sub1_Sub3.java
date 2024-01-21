import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ESJLSSWI")
public class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ESJLSSWI", name = "i", descriptor = "[Lclient!EQPISSKH;")
	public Class11[] aClass11Array10;

	@OriginalMember(owner = "client!ESJLSSWI", name = "h", descriptor = "Z")
	private boolean aBoolean203 = true;

	@OriginalMember(owner = "client!ESJLSSWI", name = "j", descriptor = "I")
	public int anInt730 = 1000;

	@OriginalMember(owner = "client!ESJLSSWI", name = "a", descriptor = "(IIIIIIIII)V")
	public void method509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class2_Sub1_Sub3_Sub5 local3 = this.method510();
		if (local3 != null) {
			this.anInt730 = local3.anInt730;
			local3.method509(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!ESJLSSWI", name = "a", descriptor = "(Z)Lclient!WRJMHIDY;")
	protected Class2_Sub1_Sub3_Sub5 method510() {
		try {
			return null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("38728, " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
