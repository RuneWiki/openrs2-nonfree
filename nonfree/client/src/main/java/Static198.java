import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!jp", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!jp", name = "K", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array13;

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_133 = new Class184(18, -1);

	@OriginalMember(owner = "client!jp", name = "F", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_121 = new Class92(20, 7);

	@OriginalMember(owner = "client!jp", name = "J", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_122 = new Class92(17, 0);

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I[Lclient!f;)V")
	public static void method3226(@OriginalArg(1) Class22[] arg0) {
		Static4.anInt815 = arg0.length;
		Static184.anIntArray285 = new int[Static4.anInt815 + 10];
		Static270.aClass22Array21 = new Class22[Static4.anInt815 + 10];
		Static464.method5799(arg0, 0, Static270.aClass22Array21, 0, Static4.anInt815);
		for (@Pc(24) int local24 = 0; local24 < Static4.anInt815; local24++) {
			Static184.anIntArray285[local24] = Static270.aClass22Array21[local24].JA();
		}
		for (@Pc(42) int local42 = Static4.anInt815; local42 < Static270.aClass22Array21.length; local42++) {
			Static184.anIntArray285[local42] = 12;
		}
	}
}
