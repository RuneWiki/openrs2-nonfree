import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "Lclient!da;")
	public static Class6 aClass6_8;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Lclient!wu;")
	public static Class384 aClass384_72;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
	public static int anInt4696 = -1;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_111 = new Class136(109, 0);

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Lclient!kg;")
	public static final Class186 aClass186_8 = new Class186(6, 0, 4, 2);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	public static void method4292() {
		Static645.aClass293_77.method6930();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
	public static void method4293(@OriginalArg(1) int arg0) {
		Static536.anInt8899 = arg0;
		Static264.anInt4388 = 2;
		if (Static120.aString144 == null) {
			Static43.method745(35);
		} else {
			@Pc(29) Class5_Sub12 local29 = new Class5_Sub12(Static189.method3005(Static513.method7409(Static120.aString144)));
			@Pc(33) long local33 = local29.method8644();
			Static271.aLong139 = local29.method8644();
			Static77.method1243(true, "", Static387.method5968(local33));
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBI)Z")
	public static boolean method4294(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}
}
