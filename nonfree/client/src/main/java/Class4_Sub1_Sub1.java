import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BXTJETAB")
public class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!BXTJETAB", name = "i", descriptor = "[Lclient!CKROTWSG;")
	public Class6[] aClass6Array10;

	@OriginalMember(owner = "client!BXTJETAB", name = "j", descriptor = "I")
	public int anInt760 = 1000;

	@OriginalMember(owner = "client!BXTJETAB", name = "a", descriptor = "(IIIIIIIII)V")
	public void method530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class4_Sub1_Sub1_Sub3 local3 = this.method531();
		if (local3 != null) {
			this.anInt760 = local3.anInt760;
			local3.method530(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!BXTJETAB", name = "a", descriptor = "(I)Lclient!IGXVZOHI;")
	protected Class4_Sub1_Sub1_Sub3 method531() {
		try {
			return null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("18681, " + 47492 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
