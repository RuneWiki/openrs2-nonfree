import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!ua", name = "tb", descriptor = "I")
	public static int anInt9541;

	@OriginalMember(owner = "client!ua", name = "V", descriptor = "Lclient!dha;")
	public static final Class74 aClass74_13 = new Class74();

	@OriginalMember(owner = "client!ua", name = "db", descriptor = "[F")
	public static final float[] aFloatArray77 = new float[2];

	@OriginalMember(owner = "client!ua", name = "hb", descriptor = "I")
	public static int anInt9532 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/io/File;BI)[B")
	public static byte[] method8346(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(14) byte[] local14 = new byte[arg1];
			Static302.method4634(arg0, arg1, local14);
			return local14;
		} catch (@Pc(22) IOException local22) {
			return null;
		}
	}
}
