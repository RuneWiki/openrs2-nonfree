import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YPQKGFZW")
public class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!YPQKGFZW", name = "i", descriptor = "[Lclient!HNGTTWCU;")
	public Class12[] aClass12Array10;

	@OriginalMember(owner = "client!YPQKGFZW", name = "j", descriptor = "I")
	public int anInt799 = 1000;

	@OriginalMember(owner = "client!YPQKGFZW", name = "a", descriptor = "(IIIIIIIII)V")
	public void method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class4_Sub1_Sub2_Sub3 local3 = this.method575();
		if (local3 != null) {
			this.anInt799 = local3.anInt799;
			local3.method574(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!YPQKGFZW", name = "a", descriptor = "(B)Lclient!KUGNQTGL;")
	protected Class4_Sub1_Sub2_Sub3 method575() {
		try {
			return null;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("84381, " + 0 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}
}
