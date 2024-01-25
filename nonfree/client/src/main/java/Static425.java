import java.awt.Canvas;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static425 {

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "Z")
	public static boolean aBoolean601 = false;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_147 = new Class136(93, 10);

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	public static int anInt7212 = 0;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "[I")
	public static final int[] anIntArray577 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!d;ZILjava/awt/Canvas;)Lclient!ha;")
	public static Class126 method6397(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		return new Class126_Sub3(arg2, arg0, arg1);
	}
}
