import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!pk", name = "G", descriptor = "Lclient!qha;")
	public static Class299 aClass299_1;

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "(I)V")
	public static void method7431(@OriginalArg(0) int arg0) {
		Static601.anInt10526 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static585.anInt10170; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static202.anInt4238; local6++) {
				if (Static193.aClass291ArrayArrayArray2[arg0][local3][local6] == null) {
					Static193.aClass291ArrayArrayArray2[arg0][local3][local6] = new Class291(arg0);
				}
			}
		}
	}
}
