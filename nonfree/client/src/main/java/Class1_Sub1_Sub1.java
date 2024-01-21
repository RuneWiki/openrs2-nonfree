import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ACEAAIDL")
public class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ACEAAIDL", name = "i", descriptor = "I")
	private int anInt783;

	@OriginalMember(owner = "client!ACEAAIDL", name = "j", descriptor = "[Lclient!GIKYYSAQ;")
	public Class12[] aClass12Array10;

	@OriginalMember(owner = "client!ACEAAIDL", name = "k", descriptor = "I")
	public int anInt784 = 1000;

	@OriginalMember(owner = "client!ACEAAIDL", name = "a", descriptor = "(IIIIIIIII)V")
	public void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub1_Sub1_Sub2 local3 = this.method555();
		if (local3 != null) {
			this.anInt784 = local3.anInt784;
			local3.method554(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!ACEAAIDL", name = "a", descriptor = "(Z)Lclient!GCSAWSJV;")
	protected Class1_Sub1_Sub1_Sub2 method555() {
		try {
			return null;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("51218, " + false + ", " + local7.toString());
			throw new RuntimeException();
		}
	}
}
