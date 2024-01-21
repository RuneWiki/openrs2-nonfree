import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KCWTSCHR")
public class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!KCWTSCHR", name = "i", descriptor = "[Lclient!USOVHGHC;")
	public Class35[] aClass35Array9;

	@OriginalMember(owner = "client!KCWTSCHR", name = "j", descriptor = "I")
	public int anInt754 = 1000;

	@OriginalMember(owner = "client!KCWTSCHR", name = "a", descriptor = "(IIIIIIIII)V")
	public void method506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class2_Sub1_Sub1_Sub6 local3 = this.method507((byte) 3);
		if (local3 != null) {
			this.anInt754 = local3.anInt754;
			local3.method506(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!KCWTSCHR", name = "a", descriptor = "(B)Lclient!XBVYIDUH;")
	protected Class2_Sub1_Sub1_Sub6 method507(@OriginalArg(0) byte arg0) {
		try {
			return null;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("84498, " + 3 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}
}
