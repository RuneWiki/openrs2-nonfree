import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "D")
	public static double aDouble10;

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
	public static int anInt4686;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "Lclient!kca;")
	public static Class196 aClass196_1;

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "[I")
	public static final int[] anIntArray265 = new int[14];

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "Lclient!qea;")
	public static final Class288 aClass288_2 = new Class288();

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "[J")
	public static final long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILjava/io/File;)[B")
	public static byte[] method4022(@OriginalArg(0) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg0];
			Static66.method1088(arg0, local6, arg1);
			return local6;
		} catch (@Pc(20) IOException local20) {
			return null;
		}
	}
}
