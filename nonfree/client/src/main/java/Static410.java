import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[Lclient!fc;")
	public static Class83[] aClass83Array1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_77 = new Class243(77, 2);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([JB[Ljava/lang/Object;)V")
	public static void method6417(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static545.method7796(arg0, 0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public static void method6418() {
		if (Static271.anInt8654 == 2) {
			Static301.method4738(3);
		} else if (Static271.anInt8654 == 6) {
			Static301.method4738(7);
		} else if (Static271.anInt8654 == 9) {
			Static301.method4738(10);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILjava/io/File;)[B")
	public static byte[] method6419(@OriginalArg(0) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(14) byte[] local14 = new byte[arg0];
			Static404.method6384(arg0, local14, arg1);
			return local14;
		} catch (@Pc(22) IOException local22) {
			return null;
		}
	}
}
