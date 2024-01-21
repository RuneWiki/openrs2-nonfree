import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PJUTMHMD")
public class Class8_Sub1_Sub2 extends Class8_Sub1 {

	@OriginalMember(owner = "client!PJUTMHMD", name = "i", descriptor = "[Lclient!DOBBTZYO;")
	public Class10[] aClass10Array10;

	@OriginalMember(owner = "client!PJUTMHMD", name = "j", descriptor = "I")
	public int anInt788 = 1000;

	@OriginalMember(owner = "client!PJUTMHMD", name = "a", descriptor = "(IIIIIIIII)V")
	public void method556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class8_Sub1_Sub2_Sub5 local3 = this.method557();
		if (local3 != null) {
			this.anInt788 = local3.anInt788;
			local3.method556(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!PJUTMHMD", name = "a", descriptor = "(I)Lclient!VHYCWIPJ;")
	protected Class8_Sub1_Sub2_Sub5 method557() {
		try {
			return null;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("96597, " + -650 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}
}
