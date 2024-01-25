import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!wj", name = "J", descriptor = "Lclient!ffa;")
	public static final Class100 aClass100_13 = new Class100();

	@OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
	public static final int anInt10270 = 4;

	@OriginalMember(owner = "client!wj", name = "L", descriptor = "[I")
	public static final int[] anIntArray666 = new int[200];

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BILjava/io/File;)[B")
	public static byte[] method8313(@OriginalArg(1) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg0];
			Static252.method4537(local11, arg1, arg0);
			return local11;
		} catch (@Pc(21) IOException local21) {
			return null;
		}
	}

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "(I)V")
	public static void method8315() {
		if (Static107.aClass66_3 == null) {
			return;
		}
		if (Static107.aClass66_3.anInt2308 == 1) {
			Static107.aClass66_3 = null;
			return;
		}
		if (Static107.aClass66_3.anInt2308 == 2) {
			Static295.method4985(2, Static441.aClass326_2, Static214.aString45);
			Static107.aClass66_3 = null;
			return;
		}
	}
}
