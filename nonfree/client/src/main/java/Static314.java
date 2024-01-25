import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
	public static int anInt5650 = 0;

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
	public static final int anInt5663 = 1403;

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "Lclient!br;")
	public static final Class37 aClass37_3 = new Class37("", 17);

	@OriginalMember(owner = "client!mb", name = "O", descriptor = "[I")
	public static final int[] anIntArray364 = new int[2];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Z")
	public static boolean method4791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static26.method714(arg0, arg1) | (arg0 & 0x70000) != 0 || Static395.method5608(arg0, arg1);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V")
	public static void method4792() {
		Static419.aClass326_41.method7241(50);
		Static478.aClass326_48.method7241(50);
		Static171.aClass326_13.method7241(50);
		Static399.aClass326_37.method7241(50);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method4794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static129.method2210(arg5, arg0, arg6)) {
			return false;
		}
		@Pc(15) int local15 = Static299.anIntArray350[0];
		@Pc(19) int local19 = Static299.anIntArray350[1];
		@Pc(23) int local23 = Static299.anIntArray350[2];
		if (!Static129.method2210(arg8, arg4, arg3)) {
			return false;
		}
		@Pc(35) int local35 = Static299.anIntArray350[2];
		@Pc(39) int local39 = Static299.anIntArray350[1];
		@Pc(43) int local43 = Static299.anIntArray350[0];
		if (Static129.method2210(arg7, arg1, arg2)) {
			@Pc(55) int local55 = Static299.anIntArray350[0];
			@Pc(59) int local59 = Static299.anIntArray350[1];
			@Pc(63) int local63 = Static299.anIntArray350[2];
			return Static417.method5835(local43, local39, local35, local63, local59, local19, local15, local55, local23);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLclient!gba;Ljava/lang/String;BZ)V")
	public static void method4795(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) String arg2, @OriginalArg(4) boolean arg3) {
		if (!arg0) {
			Static410.method5764(arg2, 3, arg1);
			return;
		}
		@Pc(18) String local18;
		if (Static162.aString37.startsWith("win") && arg1.aBoolean212) {
			local18 = null;
			if (Static412.anApplet1 != null) {
				local18 = Static412.anApplet1.getParameter("haveie6");
			}
			if (local18 == null || !local18.equals("1")) {
				@Pc(36) Class23 local36 = Static410.method5764(arg2, 0, arg1);
				Static33.aClass23_2 = local36;
				Static374.aClass114_7 = arg1;
				Static581.aString94 = arg2;
				return;
			}
		}
		if (Static162.aString37.startsWith("mac")) {
			local18 = null;
			if (Static412.anApplet1 != null) {
				local18 = Static412.anApplet1.getParameter("havefirefox");
			}
			if (local18 != null && local18.equals("1") && arg3) {
				Static410.method5764(arg2, 1, arg1);
				return;
			}
		}
		Static410.method5764(arg2, 2, arg1);
	}
}
