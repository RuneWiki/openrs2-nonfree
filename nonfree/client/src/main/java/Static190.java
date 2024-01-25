import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "J")
	public static long aLong163 = -1L;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)V")
	public static void method5361(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class1 local15 = Static441.aClass91_34.method2278(); local15 != null; local15 = Static441.aClass91_34.method2276()) {
			if ((long) arg0 == (local15.aLong268 >> 48 & 0xFFFFL)) {
				local15.method7908();
			}
		}
	}

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "(I)V")
	public static void method5362() {
		for (@Pc(10) Class1_Sub43 local10 = (Class1_Sub43) Static64.aClass111_5.method2547(); local10 != null; local10 = (Class1_Sub43) Static64.aClass111_5.method2554()) {
			if (local10.anInt8096 == -1) {
				local10.anInt8104 = 0;
				if (local10.anInt8101 >= 0 && local10.anInt8102 >= 0 && Static458.anInt9736 > local10.anInt8101 && local10.anInt8102 < Static378.anInt6747) {
					Static80.method1331(local10);
				}
			} else {
				local10.method7908();
			}
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;B)V")
	public static void method5363(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1) {
		Static122.aHashtable3.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(III)Z")
	public static boolean method5364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static64.method1035(arg1, arg0) | (arg1 & 0x40000) != 0 || Static519.method7180(arg1, arg0);
	}
}
