import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "[S")
	public static final short[] aShortArray99 = new short[] { 8, 4, 23, 59, 2, 53, 19, 45 };

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "[S")
	public static short[] aShortArray100 = new short[256];

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public static void method6655() {
		if (Static410.aClass194_1 != null) {
			Static410.aClass194_1.method4386();
		}
		if (Static564.aThread6 == null) {
			return;
		}
		while (true) {
			try {
				Static564.aThread6.join();
				return;
			} catch (@Pc(24) InterruptedException local24) {
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IC)Z")
	public static boolean method6656(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
	public static void method6657() {
		if (Static2.aFileOutputStream1 != null) {
			try {
				Static2.aFileOutputStream1.close();
			} catch (@Pc(6) IOException local6) {
			}
		}
		Static2.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method6658(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(40) int local40 = 0;
			for (@Pc(42) long local42 = arg0; local42 != 0L; local42 /= 37L) {
				local40++;
			}
			@Pc(60) StringBuffer local60 = new StringBuffer(local40);
			while (arg0 != 0L) {
				@Pc(66) long local66 = arg0;
				arg0 /= 37L;
				local60.append(Static194.aCharArray2[(int) (local66 - arg0 * 37L)]);
			}
			return local60.reverse().toString();
		}
	}
}
