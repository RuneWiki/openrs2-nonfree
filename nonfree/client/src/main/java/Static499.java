import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_151 = new Class200(22, -1);

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIII)V")
	public static void method6053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg3;
		@Pc(15) int local15 = arg0 - arg2;
		if (local10 == 0) {
			if (local15 != 0) {
				Static373.method5550(arg1, arg2, arg0, arg3);
			}
		} else if (local15 == 0) {
			Static277.method4490(arg2, arg4, arg3, arg1);
		} else {
			@Pc(49) int local49 = (local15 << 12) / local10;
			@Pc(57) int local57 = arg2 - (local49 * arg3 >> 12);
			@Pc(62) int local62;
			@Pc(70) int local70;
			if (Static566.anInt9279 > arg3) {
				local62 = Static566.anInt9279;
				local70 = (local49 * Static566.anInt9279 >> 12) + local57;
			} else if (arg3 <= Static392.anInt6753) {
				local70 = arg2;
				local62 = arg3;
			} else {
				local62 = Static392.anInt6753;
				local70 = (local49 * Static392.anInt6753 >> 12) + local57;
			}
			@Pc(107) int local107;
			@Pc(115) int local115;
			if (arg4 < Static566.anInt9279) {
				local107 = Static566.anInt9279;
				local115 = (Static566.anInt9279 * local49 >> 12) + local57;
			} else if (arg4 > Static392.anInt6753) {
				local107 = Static392.anInt6753;
				local115 = (local49 * Static392.anInt6753 >> 12) + local57;
			} else {
				local115 = arg0;
				local107 = arg4;
			}
			if (local115 < Static346.anInt5494) {
				local107 = (Static346.anInt5494 - local57 << 12) / local49;
				local115 = Static346.anInt5494;
			} else if (local115 > Static640.anInt10333) {
				local107 = (Static640.anInt10333 - local57 << 12) / local49;
				local115 = Static640.anInt10333;
			}
			if (local70 < Static346.anInt5494) {
				local70 = Static346.anInt5494;
				local62 = (Static346.anInt5494 - local57 << 12) / local49;
			} else if (local70 > Static640.anInt10333) {
				local62 = (Static640.anInt10333 - local57 << 12) / local49;
				local70 = Static640.anInt10333;
			}
			Static89.method6082(local115, local62, local107, arg1, local70);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method6054() {
		@Pc(10) String local10 = "www";
		if (Static213.aClass373_3 == Static392.aClass373_6) {
			local10 = "www-wtrc";
		} else if (Static392.aClass373_6 == Static201.aClass373_2) {
			local10 = "www-wtqa";
		} else if (Static392.aClass373_6 == Static364.aClass373_5) {
			local10 = "www-wtwip";
		}
		@Pc(29) String local29 = "";
		if (Static112.aString22 != null) {
			local29 = "/p=" + Static112.aString22;
		}
		return "http://" + local10 + "." + Static51.aClass17_2.aString3 + ".com/l=" + Static496.anInt7407 + "/a=" + Static65.anInt1744 + local29 + "/";
	}
}
