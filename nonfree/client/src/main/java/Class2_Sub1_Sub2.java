import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XEUTUWWF")
public class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!XEUTUWWF", name = "i", descriptor = "[Lclient!NLCFOCQC;")
	public Class28[] aClass28Array10;

	@OriginalMember(owner = "client!XEUTUWWF", name = "j", descriptor = "I")
	public int anInt761 = 1000;

	@OriginalMember(owner = "client!XEUTUWWF", name = "a", descriptor = "(IIIIIIIII)V")
	public void method560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class2_Sub1_Sub2_Sub5 local3 = this.method561((byte) 5);
		if (local3 != null) {
			this.anInt761 = local3.anInt761;
			local3.method560(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!XEUTUWWF", name = "a", descriptor = "(B)Lclient!SNMMQNPZ;")
	protected Class2_Sub1_Sub2_Sub5 method561(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("21947, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
