import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NSRXNXHB")
public class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!NSRXNXHB", name = "j", descriptor = "[Lclient!NONLGXRN;")
	public Class28[] aClass28Array10;

	@OriginalMember(owner = "client!NSRXNXHB", name = "i", descriptor = "I")
	private int anInt596 = -39282;

	@OriginalMember(owner = "client!NSRXNXHB", name = "k", descriptor = "I")
	public int anInt597 = 1000;

	@OriginalMember(owner = "client!NSRXNXHB", name = "a", descriptor = "(IIIIIIIII)V")
	public void method340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub1_Sub1_Sub3 local3 = this.method341();
		if (local3 != null) {
			this.anInt597 = local3.anInt597;
			local3.method340(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!NSRXNXHB", name = "a", descriptor = "(I)Lclient!FUTAQMCE;")
	protected Class1_Sub1_Sub1_Sub3 method341() {
		try {
			if (this.anInt596 != -39282) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			return null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("20535, " + -39282 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
