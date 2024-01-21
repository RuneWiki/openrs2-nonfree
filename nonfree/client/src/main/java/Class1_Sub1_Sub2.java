import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FKSXNQOK")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!FKSXNQOK", name = "i", descriptor = "[Lclient!AOSCHFOT;")
	public Class4[] aClass4Array9;

	@OriginalMember(owner = "client!FKSXNQOK", name = "j", descriptor = "I")
	public int anInt603 = 1000;

	@OriginalMember(owner = "client!FKSXNQOK", name = "a", descriptor = "(IIIIIIIII)V")
	public void method409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub1_Sub2_Sub6 local3 = this.method410();
		if (local3 != null) {
			this.anInt603 = local3.anInt603;
			local3.method409(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!FKSXNQOK", name = "a", descriptor = "(I)Lclient!RTQSBWRH;")
	protected Class1_Sub1_Sub2_Sub6 method410() {
		try {
			return null;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("29810, " + -704 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}
}
