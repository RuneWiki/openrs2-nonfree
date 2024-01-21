import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DVAULXJA")
public class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!DVAULXJA", name = "k", descriptor = "[Lclient!KQUEOHKL;")
	public Class20[] aClass20Array10;

	@OriginalMember(owner = "client!DVAULXJA", name = "j", descriptor = "Z")
	private boolean aBoolean215 = true;

	@OriginalMember(owner = "client!DVAULXJA", name = "l", descriptor = "I")
	public int anInt655 = 1000;

	@OriginalMember(owner = "client!DVAULXJA", name = "a", descriptor = "(IIIIIIIII)V")
	public void method468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class2_Sub1_Sub2_Sub2 local3 = this.method469();
		if (local3 != null) {
			this.anInt655 = local3.anInt655;
			local3.method468(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!DVAULXJA", name = "a", descriptor = "(I)Lclient!IEHKDFMR;")
	protected Class2_Sub1_Sub2_Sub2 method469() {
		try {
			return null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("8054, " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
