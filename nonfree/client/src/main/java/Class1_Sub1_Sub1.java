import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!y")
public class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!y", name = "i", descriptor = "[Lclient!o;")
	public Class28[] aClass28Array10;

	@OriginalMember(owner = "client!y", name = "h", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!y", name = "j", descriptor = "I")
	public int anInt579 = 1000;

	@OriginalMember(owner = "client!y", name = "a", descriptor = "(IIIIIIIII)V")
	public void method312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.method313();
		if (local3 != null) {
			this.anInt579 = local3.anInt579;
			local3.method312(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!y", name = "a", descriptor = "(Z)Lclient!fb;")
	protected Class1_Sub1_Sub1_Sub5 method313() {
		try {
			return null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("42963, " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
