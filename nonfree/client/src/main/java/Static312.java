import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
	public static int anInt5514;

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "Lclient!di;")
	public static final Class54 aClass54_77 = new Class54(49, 3);

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "[I")
	public static final int[] anIntArray448 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIBIII)V")
	public static void method4390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg2;
		@Pc(15) int local15 = arg1 - arg3;
		if (local10 == 0) {
			if (local15 != 0) {
				Static79.method1470(arg4, arg1, arg3, arg2);
			}
		} else if (local15 == 0) {
			Static355.method4855(arg0, arg3, arg4, arg2);
		} else {
			@Pc(48) int local48 = (local15 << 12) / local10;
			@Pc(57) int local57 = arg3 - (arg2 * local48 >> 12);
			@Pc(62) int local62;
			@Pc(70) int local70;
			if (Static8.anInt223 > arg0) {
				local62 = Static8.anInt223;
				local70 = local57 + (Static8.anInt223 * local48 >> 12);
			} else if (Static184.anInt3600 < arg0) {
				local62 = Static184.anInt3600;
				local70 = (Static184.anInt3600 * local48 >> 12) + local57;
			} else {
				local70 = arg1;
				local62 = arg0;
			}
			@Pc(107) int local107;
			@Pc(105) int local105;
			if (arg2 < Static8.anInt223) {
				local105 = local57 + (local48 * Static8.anInt223 >> 12);
				local107 = Static8.anInt223;
			} else if (arg2 > Static184.anInt3600) {
				local105 = (local48 * Static184.anInt3600 >> 12) + local57;
				local107 = Static184.anInt3600;
			} else {
				local107 = arg2;
				local105 = arg3;
			}
			if (local70 < Static430.anInt7123) {
				local70 = Static430.anInt7123;
				local62 = (Static430.anInt7123 - local57 << 12) / local48;
			} else if (local70 > Static181.anInt3543) {
				local62 = (Static181.anInt3543 - local57 << 12) / local48;
				local70 = Static181.anInt3543;
			}
			if (local105 < Static430.anInt7123) {
				local107 = (Static430.anInt7123 - local57 << 12) / local48;
				local105 = Static430.anInt7123;
			} else if (local105 > Static181.anInt3543) {
				local107 = (Static181.anInt3543 - local57 << 12) / local48;
				local105 = Static181.anInt3543;
			}
			Static369.method5015(local107, local70, arg4, local62, local105);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
	public static void method4391() {
		if (Static53.aClass56_2 != Static123.aClass56_4) {
			try {
				Static463.method4344("tbrefresh", Static148.aClient1);
			} catch (@Pc(14) Throwable local14) {
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4393(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static435.method5673("\n", arg0, "%0a"));
	}
}
