import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RWIDPYKY")
public class Class6_Sub2_Sub1 extends Class6_Sub2 {

	@OriginalMember(owner = "client!RWIDPYKY", name = "k", descriptor = "[Lclient!QHWKYEXN;")
	public Class33[] aClass33Array10;

	@OriginalMember(owner = "client!RWIDPYKY", name = "j", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!RWIDPYKY", name = "l", descriptor = "I")
	public int anInt776 = 1000;

	@OriginalMember(owner = "client!RWIDPYKY", name = "a", descriptor = "(IIIIIIIII)V")
	public void method528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class6_Sub2_Sub1_Sub3 local3 = this.method529(697);
		if (local3 != null) {
			this.anInt776 = local3.anInt776;
			local3.method528(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!RWIDPYKY", name = "a", descriptor = "(I)Lclient!JUQSYEMB;")
	protected Class6_Sub2_Sub1_Sub3 method529(@OriginalArg(0) int arg0) {
		try {
			return null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("60832, " + 697 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
