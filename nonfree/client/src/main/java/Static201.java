import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
	public static int anInt3268;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
	public static int anInt3269;

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "[Lclient!f;")
	public static Class49[] aClass49Array71;

	@OriginalMember(owner = "client!kb", name = "tb", descriptor = "Lclient!ji;")
	public static Class124 aClass124_3;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method2761(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local32++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				@Pc(70) char local70 = Static240.aCharArray3[(int) (local56 - arg0 * 37L)];
				if (local70 == '_') {
					@Pc(78) int local78 = local52.length() - 1;
					local52.setCharAt(local78, Character.toUpperCase(local52.charAt(local78)));
					local70 = ' ';
				}
				local52.append(local70);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZBIII)V")
	public static void method2762(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static266.method2725(arg2)) {
			Static22.method396(arg3, -1, arg1, Static369.aClass250ArrayArray5[arg2], arg0);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method2764() {
		@Pc(1) Class167 local1 = Static416.aClass167_95;
		synchronized (Static416.aClass167_95) {
			Static416.aClass167_95.method3389();
		}
		local1 = Static43.aClass167_74;
		synchronized (Static43.aClass167_74) {
			Static43.aClass167_74.method3389();
		}
	}
}
