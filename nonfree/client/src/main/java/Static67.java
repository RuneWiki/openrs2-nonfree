import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method1436(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(37) int local37 = 0;
			for (@Pc(39) long local39 = arg0; local39 != 0L; local39 /= 37L) {
				local37++;
			}
			@Pc(57) StringBuffer local57 = new StringBuffer(local37);
			while (arg0 != 0L) {
				@Pc(61) long local61 = arg0;
				arg0 /= 37L;
				@Pc(75) char local75 = Static579.aCharArray8[(int) (local61 - arg0 * 37L)];
				if (local75 == '_') {
					@Pc(85) int local85 = local57.length() - 1;
					local57.setCharAt(local85, Character.toUpperCase(local57.charAt(local85)));
					local75 = ' ';
				}
				local57.append(local75);
			}
			local57.reverse();
			local57.setCharAt(0, Character.toUpperCase(local57.charAt(0)));
			return local57.toString();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!gba;ZLjava/awt/Frame;)V")
	public static void method1437(@OriginalArg(0) Class114 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(10) Class23 local10 = arg0.method2502(arg1);
			while (local10.anInt875 == 0) {
				Static423.method5918(10L);
			}
			if (local10.anInt875 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static423.method5918(100L);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)V")
	public static void method1438(@OriginalArg(1) int arg0) {
		Static582.anInt9419 = -1;
		Static222.anInt1235 = arg0;
		Static248.anInt4641 = -1;
		Static341.method5077();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ag;IIBII)Lclient!ck;")
	public static Class52_Sub1_Sub1 method1440(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean22 || Static119.method2029(arg1) && Static119.method2029(arg3)) {
			return new Class52_Sub1_Sub1(arg0, 3553, arg4, arg2, arg1, arg3, true);
		} else if (arg0.aBoolean21) {
			return new Class52_Sub1_Sub1(arg0, 34037, arg4, arg2, arg1, arg3, true);
		} else {
			return new Class52_Sub1_Sub1(arg0, arg4, arg2, arg1, arg3, Static200.method3428(arg1), Static200.method3428(arg3), true);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BII)Z")
	public static boolean method1441(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
