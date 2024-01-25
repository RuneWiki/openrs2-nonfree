import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "Lclient!qq;")
	public static Class203 aClass203_12;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
	public static int anInt7304;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "[[[Lclient!iia;")
	public static Class174[][][] aClass174ArrayArrayArray3;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "Lclient!lk;")
	public static Class219 aClass219_9;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "[S")
	private static final short[] aShortArray91 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "[S")
	private static final short[] aShortArray92 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "[S")
	private static final short[] aShortArray93 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "[[S")
	public static final short[][] aShortArrayArray11 = new short[][] { aShortArray93, aShortArray92, aShortArray91 };

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)I")
	public static int method6307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (local7 + arg1) / arg0 - local7;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
	public static void method6308() {
		Static563.aBoolean729 = false;
		Static437.method6493();
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	public static void method6309() {
		Static15.anInt267 = 0;
		Static300.anInt5167 = 0;
		Static128.anInt7014 = 0;
		Static68.anInt1102 = 0;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(III)Z")
	public static boolean method6310(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}
}
