import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XHHRODPC")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!XHHRODPC", name = "j", descriptor = "[Lclient!RJXWGZGD;")
	public Class34[] aClass34Array9;

	@OriginalMember(owner = "client!XHHRODPC", name = "i", descriptor = "I")
	private int anInt789 = 923;

	@OriginalMember(owner = "client!XHHRODPC", name = "k", descriptor = "I")
	public int anInt790 = 1000;

	@OriginalMember(owner = "client!XHHRODPC", name = "a", descriptor = "(IIIIIIIII)V")
	public void method528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub1_Sub2_Sub6 local3 = this.method529();
		if (local3 != null) {
			this.anInt790 = local3.anInt790;
			local3.method528(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!XHHRODPC", name = "a", descriptor = "(I)Lclient!ZKARKDQW;")
	protected Class1_Sub1_Sub2_Sub6 method529() {
		try {
			return null;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("75653, " + 4016 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}
}
