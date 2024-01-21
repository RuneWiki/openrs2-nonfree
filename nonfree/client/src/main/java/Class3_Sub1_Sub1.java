import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZHYAQRMA")
public class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ZHYAQRMA", name = "i", descriptor = "[Lclient!CSJSQCOH;")
	public Class4[] aClass4Array10;

	@OriginalMember(owner = "client!ZHYAQRMA", name = "j", descriptor = "I")
	public int anInt743 = 1000;

	@OriginalMember(owner = "client!ZHYAQRMA", name = "a", descriptor = "(IIIIIIIII)V")
	public void method505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class3_Sub1_Sub1_Sub3 local3 = this.method506();
		if (local3 != null) {
			this.anInt743 = local3.anInt743;
			local3.method505(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!ZHYAQRMA", name = "a", descriptor = "(Z)Lclient!OQIGXOFQ;")
	protected Class3_Sub1_Sub1_Sub3 method506() {
		try {
			return null;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("15318, " + false + ", " + local8.toString());
			throw new RuntimeException();
		}
	}
}
