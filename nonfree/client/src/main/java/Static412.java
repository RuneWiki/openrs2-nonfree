import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
	public static int anInt568;

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "Lclient!la;")
	public static Class29 aClass29_2;

	@OriginalMember(owner = "client!pm", name = "C", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!pm", name = "K", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "J")
	public static long aLong14 = 0L;

	@OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
	public static int anInt575 = 0;

	@OriginalMember(owner = "client!pm", name = "F", descriptor = "F")
	public static float aFloat13 = 1024.0F;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!es;)Lclient!aea;")
	public static Class9_Sub1_Sub1 method369(@OriginalArg(1) Class2_Sub15 arg0) {
		@Pc(11) Class9_Sub1 local11 = Static504.method7012(arg0);
		@Pc(15) int local15 = arg0.method4334();
		return new Class9_Sub1_Sub1(local11.aClass62_10, local11.aClass279_9, local11.anInt5035, local11.anInt5029, local11.anInt5034, local11.anInt5030, local11.anInt5032, local11.anInt5027, local11.anInt5031, local11.anInt407, local11.anInt409, local11.anInt403, local11.anInt400, local11.anInt404, local11.anInt411, local15);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V")
	public static void method370(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static249.anInt4668 = arg0;
		Static326.anInt6028 = 0;
		Static80.anInt1738 = arg1;
		Static553.anInt9074 = 0;
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)Ljava/lang/String;")
	public static String method376() {
		@Pc(12) String local12 = "www";
		if (Static207.aClass258_3 == Static212.aClass258_4) {
			local12 = "www-wtrc";
		} else if (Static207.aClass258_3 == Static99.aClass258_1) {
			local12 = "www-wtqa";
		} else if (Static207.aClass258_3 == Static158.aClass258_2) {
			local12 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static397.aString62 != null) {
			local33 = "/p=" + Static397.aString62;
		}
		return "http://" + local12 + "." + Static328.aClass284_2.aString74 + ".com/l=" + Static52.anInt1264 + "/a=" + Static200.anInt3958 + local33 + "/";
	}
}
