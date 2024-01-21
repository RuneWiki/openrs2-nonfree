import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!x")
public class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!x", name = "l", descriptor = "[Lclient!n;")
	public Class26[] aClass26Array10;

	@OriginalMember(owner = "client!x", name = "j", descriptor = "Z")
	private boolean aBoolean258 = true;

	@OriginalMember(owner = "client!x", name = "k", descriptor = "I")
	private int anInt983 = 462;

	@OriginalMember(owner = "client!x", name = "m", descriptor = "I")
	public int anInt984 = 1000;

	@OriginalMember(owner = "client!x", name = "a", descriptor = "(IIIIIIIII)V")
	public void method670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.method671();
		if (local3 != null) {
			this.anInt984 = local3.anInt984;
			local3.method670(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!x", name = "a", descriptor = "(Z)Lclient!eb;")
	protected Class1_Sub1_Sub1_Sub5 method671() {
		try {
			return null;
		} catch (@Pc(7) RuntimeException local7) {
			signlink.reporterror("69043, " + true + ", " + local7.toString());
			throw new RuntimeException();
		}
	}
}
