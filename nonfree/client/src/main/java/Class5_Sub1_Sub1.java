import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JEESRQGR")
public class Class5_Sub1_Sub1 extends Class5_Sub1 {

	@OriginalMember(owner = "client!JEESRQGR", name = "i", descriptor = "[Lclient!LWVZOAPR;")
	public Class29[] aClass29Array9;

	@OriginalMember(owner = "client!JEESRQGR", name = "j", descriptor = "I")
	public int anInt679 = 1000;

	@OriginalMember(owner = "client!JEESRQGR", name = "a", descriptor = "(IIIIIIIII)V")
	public void method371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class5_Sub1_Sub1_Sub6 local3 = this.method372(186);
		if (local3 != null) {
			this.anInt679 = local3.anInt679;
			local3.method371(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!JEESRQGR", name = "a", descriptor = "(I)Lclient!VYUQHOMO;")
	protected Class5_Sub1_Sub1_Sub6 method372(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return null;
		} catch (@Pc(6) RuntimeException local6) {
			signlink.reporterror("1186, " + arg0 + ", " + local6.toString());
			throw new RuntimeException();
		}
	}
}
