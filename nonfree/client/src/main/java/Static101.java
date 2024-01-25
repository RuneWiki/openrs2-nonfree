import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray20;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	public static int anInt1981;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "[S")
	private static final short[] aShortArray36 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "[S")
	private static final short[] aShortArray34 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "[S")
	private static final short[] aShortArray35 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { aShortArray36, aShortArray34, aShortArray35 };

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Z")
	public static boolean aBoolean145 = false;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
	public static int anInt1980 = 0;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "Lclient!ef;")
	public static final Class77 aClass77_1 = new Class77();

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V")
	public static void method1629(@OriginalArg(0) int arg0) {
		if (Static399.anIntArray446 == null || arg0 > Static399.anIntArray446.length) {
			Static399.anIntArray446 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1631(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			@Pc(21) Class6_Sub9 local21 = Static560.method8089(Static391.aClass126_1, Static12.aClass208_6);
			local21.aClass6_Sub40_Sub2_1.method8589(Static583.method8194(arg0));
			local21.aClass6_Sub40_Sub2_1.method8551(arg0);
			Static263.method4681(local21);
		}
	}
}
