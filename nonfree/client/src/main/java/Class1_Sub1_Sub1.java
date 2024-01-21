import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FGVBONDH")
public class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!FGVBONDH", name = "i", descriptor = "I")
	private int anInt787;

	@OriginalMember(owner = "client!FGVBONDH", name = "j", descriptor = "[Lclient!GPZVLKRL;")
	public Class17[] aClass17Array10;

	@OriginalMember(owner = "client!FGVBONDH", name = "k", descriptor = "I")
	public int anInt788 = 1000;

	@OriginalMember(owner = "client!FGVBONDH", name = "a", descriptor = "(IIIIIIIII)V")
	public void method546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class1_Sub1_Sub1_Sub4 local3 = this.method547();
		if (local3 != null) {
			this.anInt788 = local3.anInt788;
			local3.method546(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!FGVBONDH", name = "a", descriptor = "(I)Lclient!HEQROJXW;")
	protected Class1_Sub1_Sub1_Sub4 method547() {
		try {
			return null;
		} catch (@Pc(8) RuntimeException local8) {
			signlink.reporterror("22661, " + 8 + ", " + local8.toString());
			throw new RuntimeException();
		}
	}
}
