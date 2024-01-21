import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HTDIJKWW")
public class Class8_Sub1_Sub1 extends Class8_Sub1 {

	@OriginalMember(owner = "client!HTDIJKWW", name = "h", descriptor = "[Lclient!HULEYVZK;")
	public Class13[] aClass13Array10;

	@OriginalMember(owner = "client!HTDIJKWW", name = "i", descriptor = "I")
	public int anInt634 = 1000;

	@OriginalMember(owner = "client!HTDIJKWW", name = "a", descriptor = "(IIIIIIIII)V")
	public void method471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class8_Sub1_Sub1_Sub3 local3 = this.method472();
		if (local3 != null) {
			this.anInt634 = local3.anInt634;
			local3.method471(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!HTDIJKWW", name = "a", descriptor = "(I)Lclient!KDWDYCIL;")
	protected Class8_Sub1_Sub1_Sub3 method472() {
		try {
			return null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("5956, " + 9 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
