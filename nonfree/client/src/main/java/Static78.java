import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!jd", name = "ab", descriptor = "Lclient!bf;")
	public static Class10 aClass10_5 = new Class10(512);

	@OriginalMember(owner = "client!jd", name = "eb", descriptor = "Lclient!td;")
	public static Class79 aClass79_12 = new Class79(50);

	@OriginalMember(owner = "client!jd", name = "hb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_786 = Static169.method2903("mn");

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IBI)I")
	public static int method1413(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) long local16 = (long) ((arg0 << 16) + arg1);
		return Static62.aClass1_Sub1_Sub14_1 != null && local16 == Static62.aClass1_Sub1_Sub14_1.aLong140 ? Static61.aClass1_Sub8_5.anInt1357 * 99 / (Static61.aClass1_Sub8_5.aByteArray12.length - Static62.aClass1_Sub1_Sub14_1.aByte6) + 1 : 0;
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
	public static void method1414() {
		Static122.aClass7_2.method578();
		for (@Pc(11) int local11 = 0; local11 < 32; local11++) {
			Static123.aLongArray6[local11] = 0L;
		}
		for (@Pc(23) int local23 = 0; local23 < 32; local23++) {
			Static53.aLongArray3[local23] = 0L;
		}
		Static89.anInt2376 = 0;
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
	public static void method1415() {
		aClass23_786 = null;
		aClass10_5 = null;
		aClass79_12 = null;
	}
}
