import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Lclient!ct;")
	public static Class62 aClass62_5;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "S")
	public static short aShort35 = 320;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)I")
	public static int method2917() {
		return Static438.anInt7733;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)Z")
	public static boolean method2918(@OriginalArg(1) int arg0) {
		if (Static418.aBooleanArray28[arg0]) {
			return true;
		} else if (Static136.aClass259_54.method5970(arg0)) {
			@Pc(23) int local23 = Static136.aClass259_54.method5969(arg0);
			if (local23 == 0) {
				Static418.aBooleanArray28[arg0] = true;
				return true;
			}
			if (Static2.aClass196ArrayArray1[arg0] == null) {
				Static2.aClass196ArrayArray1[arg0] = new Class196[local23];
			}
			for (@Pc(47) int local47 = 0; local47 < local23; local47++) {
				if (Static2.aClass196ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static136.aClass259_54.method5985(local47, arg0);
					if (local61 != null) {
						@Pc(73) Class196 local73 = Static2.aClass196ArrayArray1[arg0][local47] = new Class196();
						local73.anInt5112 = (arg0 << 16) + local47;
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method4239(new Class2_Sub15(local61));
					}
				}
			}
			Static418.aBooleanArray28[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
	public static void method2919() {
		Static376.anInt6647 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static566.aClass2_Sub15Array1[local14] = null;
			Static195.aByteArray43[local14] = 1;
			Static119.aClass274Array1[local14] = null;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
	public static int method2920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
