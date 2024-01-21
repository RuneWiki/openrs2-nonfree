import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!nd", name = "bb", descriptor = "Lclient!tb;")
	public static Class44 aClass44_71;

	@OriginalMember(owner = "client!nd", name = "eb", descriptor = "Lclient!kd;")
	public static Class44_Sub1 aClass44_Sub1_82;

	@OriginalMember(owner = "client!nd", name = "ib", descriptor = "I")
	public static int anInt3137;

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1723 = Static33.method650("backbase1");

	@OriginalMember(owner = "client!nd", name = "Z", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1724 = Static33.method650("Walk here");

	@OriginalMember(owner = "client!nd", name = "cb", descriptor = "I")
	public static int anInt3134 = 0;

	@OriginalMember(owner = "client!nd", name = "lb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1726 = Static33.method650("Connecting to update server");

	@OriginalMember(owner = "client!nd", name = "db", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1725 = aClass56_1726;

	@OriginalMember(owner = "client!nd", name = "mb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1727 = aClass56_1724;

	@OriginalMember(owner = "client!nd", name = "nb", descriptor = "Z")
	public static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!nd", name = "ob", descriptor = "I")
	public static int anInt3140 = -1;

	@OriginalMember(owner = "client!nd", name = "qb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1728 = Static33.method650("p12_full");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)V")
	public static void method2025(@OriginalArg(1) boolean arg0) {
		Static18.method349();
		Static1.anInt3++;
		if (Static1.anInt3 < 50 && !arg0) {
			return;
		}
		Static1.anInt3 = 0;
		if (Static17.aBoolean20 || Static117.aClass17_4 == null) {
			return;
		}
		Static111.aClass3_Sub2_Sub1_4.method325(74);
		try {
			Static117.aClass17_4.method493(Static111.aClass3_Sub2_Sub1_4.aByteArray7, Static111.aClass3_Sub2_Sub1_4.anInt413);
			Static111.aClass3_Sub2_Sub1_4.anInt413 = 0;
		} catch (@Pc(45) IOException local45) {
			Static17.aBoolean20 = true;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!tb;IIZIII)V")
	public static void method2027(@OriginalArg(0) Class44 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static2.aBoolean1 = false;
		Static117.anInt2967 = arg2;
		Static57.anInt1621 = 1;
		Static19.anInt593 = arg1;
		Static47.aClass44_30 = arg0;
		Static19.anInt592 = 2;
		Static57.anInt1619 = arg3;
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(B)V")
	public static void method2030() {
		aClass56_1726 = null;
		aClass56_1725 = null;
		aClass44_Sub1_82 = null;
		aClass56_1728 = null;
		Class3_Sub1_Sub2.anIntArray331 = null;
		aClass56_1723 = null;
		aClass56_1724 = null;
		aClass56_1727 = null;
		aClass44_71 = null;
	}
}
