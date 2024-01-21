import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
	public static int anInt1741;

	@OriginalMember(owner = "client!i", name = "cb", descriptor = "Lclient!ga;")
	public static Class30 aClass30_27;

	@OriginalMember(owner = "client!i", name = "fb", descriptor = "I")
	public static int anInt1744;

	@OriginalMember(owner = "client!i", name = "ib", descriptor = "I")
	public static int anInt1747;

	@OriginalMember(owner = "client!i", name = "eb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_645 = Static169.method2903("Loaded title screen");

	@OriginalMember(owner = "client!i", name = "bb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_644 = aClass23_645;

	@OriginalMember(owner = "client!i", name = "kb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_646 = Static169.method2903("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!i", name = "lb", descriptor = "I")
	public static int anInt1749 = 0;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLclient!ob;)V")
	public static void method1175(@OriginalArg(1) Class60 arg0) {
		@Pc(11) int local11 = arg0.anInt3007;
		if (local11 == 324) {
			if (Static89.anInt2373 == -1) {
				Static8.anInt349 = arg0.anInt3036;
				Static89.anInt2373 = arg0.anInt2992;
			}
			if (Static5.aClass41_35.aBoolean87) {
				arg0.anInt2992 = Static89.anInt2373;
			} else {
				arg0.anInt2992 = Static8.anInt349;
			}
		} else if (local11 == 325) {
			if (Static89.anInt2373 == -1) {
				Static89.anInt2373 = arg0.anInt2992;
				Static8.anInt349 = arg0.anInt3036;
			}
			if (Static5.aClass41_35.aBoolean87) {
				arg0.anInt2992 = Static8.anInt349;
			} else {
				arg0.anInt2992 = Static89.anInt2373;
			}
		} else if (local11 == 327) {
			arg0.anInt2979 = 150;
			arg0.anInt2978 = (int) (Math.sin((double) Static26.anInt845 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3000 = 5;
			arg0.anInt2982 = -1;
		} else if (local11 == 328) {
			if (Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.aClass23_68 == null) {
				arg0.anInt2982 = 0;
			} else {
				arg0.anInt2979 = 150;
				arg0.anInt2978 = (int) (Math.sin((double) Static26.anInt845 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt3000 = 5;
				arg0.anInt2982 = ((int) Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.aClass23_68.method643() << 11) + 2047;
				arg0.anInt2976 = Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1837;
				arg0.anInt2975 = Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1835;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
	public static void method1176() {
		aClass23_646 = null;
		aClass23_645 = null;
		aClass30_27 = null;
		aClass23_644 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BZ)V")
	public static void method1177(@OriginalArg(1) boolean arg0) {
		if (Static26.aClass44_3 == null) {
			return;
		}
		try {
			@Pc(16) Class1_Sub8 local16 = new Class1_Sub8(4);
			local16.method862(arg0 ? 2 : 3);
			local16.method872(0);
			Static26.aClass44_3.method1419(local16.aByteArray12, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				Static26.aClass44_3.method1417();
			} catch (@Pc(42) Exception local42) {
			}
			Static26.aClass44_3 = null;
			Static46.anInt4321++;
		}
	}
}
