import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!paa", name = "h", descriptor = "I")
	public static int anInt7851 = 0;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!wia;BILclient!wia;)V")
	public static void method6496(@OriginalArg(0) Class386 arg0, @OriginalArg(3) Class386 arg1) {
		Static530.aClass386_112 = arg0;
		Static101.aClass386_24 = arg1;
	}

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "(I)I")
	public static int method6497() {
		return Static379.anInt11206;
	}

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "(I)V")
	public static void method6499(@OriginalArg(0) int arg0) {
		Static591.anInt10109 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static28.anInt704; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static55.anInt1384; local6++) {
				if (Static486.aClass58ArrayArrayArray2[arg0][local3][local6] == null) {
					Static486.aClass58ArrayArrayArray2[arg0][local3][local6] = new Class58(arg0);
				}
			}
		}
	}
}
