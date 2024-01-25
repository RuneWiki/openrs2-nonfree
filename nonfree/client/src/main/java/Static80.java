import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "F")
	public static float aFloat80;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "S")
	public static short aShort10 = 320;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)Z")
	public static boolean method2326(@OriginalArg(0) int arg0) {
		if (Static421.aBooleanArray19[arg0]) {
			return true;
		} else if (Static517.aClass157_255.method4562(arg0)) {
			@Pc(23) int local23 = Static517.aClass157_255.method4561(arg0);
			if (local23 == 0) {
				Static421.aBooleanArray19[arg0] = true;
				return true;
			}
			if (Static631.aClass24ArrayArray2[arg0] == null) {
				Static631.aClass24ArrayArray2[arg0] = new Class24[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static631.aClass24ArrayArray2[arg0][local42] == null) {
					@Pc(58) byte[] local58 = Static517.aClass157_255.method4564(arg0, local42);
					if (local58 != null) {
						@Pc(70) Class24 local70 = Static631.aClass24ArrayArray2[arg0][local42] = new Class24();
						local70.anInt510 = local42 + (arg0 << 16);
						if (local58[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local70.method619(new Class2_Sub11(local58));
					}
				}
			}
			Static421.aBooleanArray19[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
