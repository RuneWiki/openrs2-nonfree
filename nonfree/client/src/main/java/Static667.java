import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static667 {

	@OriginalMember(owner = "client!wia", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject20;

	@OriginalMember(owner = "client!wia", name = "f", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_209 = new Class126(64, 12);

	@OriginalMember(owner = "client!wia", name = "m", descriptor = "Lclient!wm;")
	public static final Class393 aClass393_8 = new Class393();

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)Lclient!bi;")
	public static Class3_Sub8 method8672() {
		if (Static574.aClass193_53 == null || Static612.aClass191_1 == null) {
			return null;
		}
		for (@Pc(21) Class3_Sub8 local21 = (Class3_Sub8) Static612.aClass191_1.method4412(); local21 != null; local21 = (Class3_Sub8) Static612.aClass191_1.method4412()) {
			@Pc(29) Class145 local29 = Static574.aClass321_3.method7485(local21.anInt1242);
			if (local29 != null && local29.aBoolean288 && local29.method3156(Static574.anInterface15_2)) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IILclient!kh;)I")
	public static int method8673(@OriginalArg(1) int arg0, @OriginalArg(2) Class208 arg1) {
		if (!Static82.method1754(arg1).method38(arg0) && arg1.anObjectArray3 == null) {
			return -1;
		} else if (arg1.anIntArray362 == null || arg0 >= arg1.anIntArray362.length) {
			return -1;
		} else {
			return arg1.anIntArray362[arg0];
		}
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)V")
	public static void method8675() {
		Static228.anInt2286 = 0;
		Static631.aClass303Array2 = new Class303[50];
	}
}
