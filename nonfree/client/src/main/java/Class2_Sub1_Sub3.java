import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QLYZESGB")
public class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!QLYZESGB", name = "j", descriptor = "B")
	private static byte aByte52 = 3;

	@OriginalMember(owner = "client!QLYZESGB", name = "k", descriptor = "[Lclient!AMFCSYQM;")
	public Class3[] aClass3Array10;

	@OriginalMember(owner = "client!QLYZESGB", name = "i", descriptor = "Z")
	private boolean aBoolean199 = true;

	@OriginalMember(owner = "client!QLYZESGB", name = "l", descriptor = "I")
	public int anInt658 = 1000;

	@OriginalMember(owner = "client!QLYZESGB", name = "a", descriptor = "(IIIIIIIII)V")
	public void method488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class2_Sub1_Sub3_Sub4 local3 = this.method489(aByte52);
		if (local3 != null) {
			this.anInt658 = local3.anInt658;
			local3.method488(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!QLYZESGB", name = "a", descriptor = "(B)Lclient!RMLAXPMV;")
	protected Class2_Sub1_Sub3_Sub4 method489(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 3) {
				this.aBoolean199 = !this.aBoolean199;
			}
			return null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("95316, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
