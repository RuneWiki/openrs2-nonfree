import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "i", descriptor = "Lclient!hg;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "Lclient!bd;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "Lclient!li;")
	public static final Class216 aClass216_1 = new Class216();

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)V")
	public static void method24(@OriginalArg(0) int arg0) {
		Static89.anInt1507 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static328.anInt5870; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static526.anInt8863; local6++) {
				if (Static260.aClass174ArrayArrayArray2[arg0][local3][local6] == null) {
					Static260.aClass174ArrayArrayArray2[arg0][local3][local6] = new Class174(arg0);
				}
			}
		}
	}
}
