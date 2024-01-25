import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "Lclient!q;")
	public static Class81 aClass81_1;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "Lclient!tn;")
	public static final Class318 aClass318_3 = new Class318();

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "([BLjava/lang/String;II)I")
	public static int method1134(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = arg1.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19 += 4) {
			@Pc(27) int local27 = Static223.method3625(arg1.charAt(local19));
			@Pc(46) int local46 = local17 > local19 + 1 ? Static223.method3625(arg1.charAt(local19 + 1)) : -1;
			@Pc(61) int local61 = local19 + 2 >= local17 ? -1 : Static223.method3625(arg1.charAt(local19 + 2));
			@Pc(76) int local76 = local17 <= local19 + 3 ? -1 : Static223.method3625(arg1.charAt(local19 + 3));
			arg0[arg2++] = (byte) (local46 >>> 4 | local27 << 2);
			if (local61 == -1) {
				break;
			}
			arg0[arg2++] = (byte) ((local46 & 0xF) << 4 | local61 >>> 2);
			if (local76 == -1) {
				break;
			}
			arg0[arg2++] = (byte) (local76 | (local61 & 0x3) << 6);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I")
	public static int method1138(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1139(@OriginalArg(1) String arg0) {
		if (Static404.aStringArray31 == null) {
			Static59.method1360();
		}
		Static68.aCalendar1.setTime(new Date(Static112.method2047()));
		@Pc(20) int local20 = Static68.aCalendar1.get(11);
		@Pc(24) int local24 = Static68.aCalendar1.get(12);
		@Pc(28) int local28 = Static68.aCalendar1.get(13);
		@Pc(67) String local67 = Integer.toString(local20 / 10) + local20 % 10 + ":" + local24 / 10 + local24 % 10 + ":" + local28 / 10 + local28 % 10;
		@Pc(72) String[] local72 = Static297.method4750(arg0, '\n');
		for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
			for (@Pc(78) int local78 = Static506.anInt9457; local78 > 0; local78--) {
				Static404.aStringArray31[local78] = Static404.aStringArray31[local78 - 1];
			}
			Static404.aStringArray31[0] = local67 + ": " + local72[local74];
			if (Static348.aFileOutputStream1 != null) {
				try {
					Static348.aFileOutputStream1.write(Static50.method1169(Static404.aStringArray31[0] + "\n"));
				} catch (@Pc(124) IOException local124) {
				}
			}
			if (Static404.aStringArray31.length - 1 > Static506.anInt9457) {
				Static506.anInt9457++;
				if (Static85.anInt2259 > 0) {
					Static85.anInt2259++;
				}
			}
		}
	}
}
