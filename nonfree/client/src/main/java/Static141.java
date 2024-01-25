import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIII)V")
	public static void method1946(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(30) Class228 local30 = Static469.aClass228ArrayArrayArray6[arg0][arg1][arg5];
		if (local30 == null) {
			local30 = new Class228(arg0);
		}
		if (arg2 == 1) {
			local30.aShort82 = (short) arg4;
			local30.aShort80 = (short) arg3;
		} else if (arg2 == 2) {
			local30.aShort81 = (short) arg4;
			local30.aShort83 = (short) arg3;
		}
		if (Static251.aBoolean314) {
			Static201.method2518();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "(I)I")
	public static int method1948(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static259.anInt4285 - 1; local3++) {
			if (arg0 < Static435.anIntArray474[local3] + Static305.anIntArray353[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static259.anInt4285 - 1;
		}
		return local1;
	}
}
