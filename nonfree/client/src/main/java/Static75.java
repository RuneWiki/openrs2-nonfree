import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!di", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[128][128];

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIZ)I")
	public static int method1399(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub46 local12 = Static114.method1848(false, arg0);
		if (local12 == null) {
			return Static430.aClass174_24.method3818(arg0).anInt6388;
		}
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = 0; local37 < local12.anIntArray750.length; local37++) {
			if (local12.anIntArray750[local37] == -1) {
				local35++;
			}
		}
		return local35 + Static430.aClass174_24.method3818(arg0).anInt6388 - local12.anIntArray750.length;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([BIIZLclient!ih;IIB)Lclient!gq;")
	public static Class8_Sub1_Sub1 method1402(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class106_Sub2 arg3) {
		if (arg3.aBoolean236 || Static25.method518(arg1) && Static25.method518(arg2)) {
			return new Class8_Sub1_Sub1(arg3, 3553, 6406, arg1, arg2, false, arg0, 6406);
		} else if (arg3.aBoolean216) {
			return new Class8_Sub1_Sub1(arg3, 34037, 6406, arg1, arg2, false, arg0, 6406);
		} else {
			return new Class8_Sub1_Sub1(arg3, 6406, arg1, arg2, Static427.method5762(arg1), Static427.method5762(arg2), arg0, 6406);
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(II)V")
	public static void method1403() {
		@Pc(5) Class91 local5 = Static429.aClass91_97;
		synchronized (Static429.aClass91_97) {
			Static429.aClass91_97.method1998(5);
		}
	}
}
