import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream3;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Lclient!oaa;")
	public static final Class234 aClass234_20 = new Class234(1, 2, 2, 0);

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIB)I")
	public static int method7092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(17) double local17 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(33) double local33 = (local10 - local17) * Math.random() + local17;
		return (int) (Math.pow(2.0D, local33) + 0.5D);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)Z")
	public static boolean method7094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
