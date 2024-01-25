import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fda", name = "s", descriptor = "I")
	public static int anInt3696;

	@OriginalMember(owner = "client!fda", name = "j", descriptor = "F")
	public static float aFloat76 = 0.0F;

	@OriginalMember(owner = "client!fda", name = "p", descriptor = "I")
	public static int anInt3693 = 1;

	@OriginalMember(owner = "client!fda", name = "q", descriptor = "I")
	public static final int anInt3694 = 1401;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/io/File;ZI)[B")
	public static byte[] method3031(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg1];
			Static259.method4573(local11, arg0, arg1);
			return local11;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
	public static void method3032() {
		@Pc(17) byte[] local17;
		if (Static575.anObject22 == null) {
			@Pc(10) Class103_Sub2_Sub2 local10 = new Class103_Sub2_Sub2();
			local17 = local10.method7650();
			Static575.anObject22 = Static550.method8311(local17);
		}
		if (Static62.anObject7 == null) {
			@Pc(34) Class103_Sub1_Sub1 local34 = new Class103_Sub1_Sub1();
			local17 = local34.method3153();
			Static62.anObject7 = Static550.method8311(local17);
		}
	}
}
