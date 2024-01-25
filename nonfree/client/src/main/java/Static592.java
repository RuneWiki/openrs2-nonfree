import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
	public static int anInt9687 = 0;

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "[S")
	private static final short[] aShortArray137 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "Z")
	public static boolean aBoolean765 = false;

	@OriginalMember(owner = "client!ws", name = "w", descriptor = "[S")
	public static final short[] aShortArray139 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ws", name = "q", descriptor = "[S")
	private static final short[] aShortArray138 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "[[S")
	public static final short[][] aShortArrayArray32 = new short[][] { aShortArray139, aShortArray137, aShortArray138 };

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
	public static int anInt9689 = -1;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method7916(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(13) Class3_Sub7_Sub18 local13 = Static543.method7218(2, arg0);
		local13.method7326();
		local13.aString82 = arg1;
	}
}
