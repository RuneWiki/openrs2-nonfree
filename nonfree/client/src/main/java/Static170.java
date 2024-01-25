import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public static int anInt3482 = 0;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	public static int anInt3491 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public static void method3228(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		Static243.method4137(arg1, arg3, arg4, -1, null, arg2, arg0);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)I")
	public static int method3230() {
		@Pc(5) Class66 local5 = Static177.aClass66_38;
		synchronized (Static177.aClass66_38) {
			return Static177.aClass66_38.method1943();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([Ljava/lang/String;ZII)Ljava/lang/String;")
	public static String method3231(@OriginalArg(0) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(24) String local24 = arg0[arg1];
			return local24 == null ? "null" : local24.toString();
		} else {
			@Pc(35) int local35 = arg2 + arg1;
			@Pc(37) int local37 = 0;
			for (@Pc(39) int local39 = arg1; local39 < local35; local39++) {
				@Pc(45) String local45 = arg0[local39];
				if (local45 == null) {
					local37 += 4;
				} else {
					local37 += local45.length();
				}
			}
			@Pc(64) StringBuffer local64 = new StringBuffer(local37);
			for (@Pc(66) int local66 = arg1; local66 < local35; local66++) {
				@Pc(72) String local72 = arg0[local66];
				if (local72 == null) {
					local64.append("null");
				} else {
					local64.append(local72);
				}
			}
			return local64.toString();
		}
	}
}
