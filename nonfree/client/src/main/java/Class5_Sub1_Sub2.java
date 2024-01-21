import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UPHLHIWQ")
public class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!UPHLHIWQ", name = "i", descriptor = "[Lclient!ICFMSSJN;")
	public Class22[] aClass22Array10;

	@OriginalMember(owner = "client!UPHLHIWQ", name = "j", descriptor = "I")
	public int anInt633 = 1000;

	@OriginalMember(owner = "client!UPHLHIWQ", name = "a", descriptor = "(IIIIIIIII)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class5_Sub1_Sub2_Sub5 local3 = this.method422();
		if (local3 != null) {
			this.anInt633 = local3.anInt633;
			local3.method421(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!UPHLHIWQ", name = "a", descriptor = "(I)Lclient!PSGMMDJS;")
	protected Class5_Sub1_Sub2_Sub5 method422() {
		try {
			return null;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("44622, " + 27243 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}
}
