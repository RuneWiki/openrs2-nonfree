import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WWTUXVKR")
public class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!WWTUXVKR", name = "j", descriptor = "[Lclient!XEISCDXD;")
	public Class41[] aClass41Array10;

	@OriginalMember(owner = "client!WWTUXVKR", name = "i", descriptor = "Z")
	private boolean aBoolean196 = true;

	@OriginalMember(owner = "client!WWTUXVKR", name = "k", descriptor = "I")
	public int anInt742 = 1000;

	@OriginalMember(owner = "client!WWTUXVKR", name = "a", descriptor = "(IIIIIIIII)V")
	public void method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class4_Sub1_Sub1_Sub4 local3 = this.method559();
		if (local3 != null) {
			this.anInt742 = local3.anInt742;
			local3.method558(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!WWTUXVKR", name = "a", descriptor = "(Z)Lclient!POJFANDE;")
	protected Class4_Sub1_Sub1_Sub4 method559() {
		try {
			return null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("68047, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
