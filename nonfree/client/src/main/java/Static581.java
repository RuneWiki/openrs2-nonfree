import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static581 {

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "J")
	public static long aLong258;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "[I")
	public static final int[] anIntArray524 = new int[8];

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "[I")
	public static final int[] anIntArray525 = new int[1];

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "Lclient!nd;")
	public static final Class216 aClass216_8 = new Class216();

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)V")
	public static void method8051(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static60.aString69 = arg1;
		Static613.aString108 = arg2;
		Static339.aBoolean539 = arg0;
		if (!Static339.aBoolean539 && (Static60.aString69.equals("") || Static613.aString108.equals(""))) {
			Static628.method8566(3);
			return;
		}
		Static450.aBoolean650 = false;
		if (Static554.anInt9496 != 1) {
			Static599.anInt10166 = 0;
			Static566.anInt9749 = -1;
		}
		Static628.method8566(-3);
		Static271.anInt5798 = 0;
		Static643.anInt10743 = 0;
		Static347.anInt6836 = 1;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
	public static void method8052(@OriginalArg(0) int arg0) {
		Static382.aLong192 = 1000000000L / (long) arg0;
	}
}
