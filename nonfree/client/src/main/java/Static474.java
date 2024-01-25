import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	public static int anInt4410;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!oa;")
	public static Class66 aClass66_8;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
	public static int anInt4413;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	public static int anInt4412 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)Z")
	public static boolean method3729(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(27) boolean local27 = (arg0 & 0x37) == 0 ? Static515.method7276(arg0, arg1) : Static124.method2648(arg1, arg0);
		return local27 | (arg1 & 0x10000) != 0 | Static260.method4300(arg0, arg1);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public static void method3730() {
		if (Static233.aBoolean354) {
			return;
		}
		Static279.aBoolean393 = true;
		if (Static189.aClass4_Sub2_Sub1_1.aBoolean651) {
			Static477.aFloat164 = (int) Static477.aFloat164 + 191 & 0xFFFFFF80;
		} else {
			Static432.aFloat144 += (24.0F - Static432.aFloat144) / 2.0F;
		}
		Static233.aBoolean354 = true;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Z")
	public static boolean method3731(@OriginalArg(0) int arg0) {
		if (Static448.aBooleanArray32[arg0]) {
			return true;
		} else if (Static552.aClass31_118.method678(arg0)) {
			@Pc(23) int local23 = Static552.aClass31_118.method657(arg0);
			if (local23 == 0) {
				Static448.aBooleanArray32[arg0] = true;
				return true;
			}
			if (Static458.aClass115ArrayArray2[arg0] == null) {
				Static458.aClass115ArrayArray2[arg0] = new Class115[local23];
			}
			for (@Pc(43) int local43 = 0; local43 < local23; local43++) {
				if (Static458.aClass115ArrayArray2[arg0][local43] == null) {
					@Pc(57) byte[] local57 = Static552.aClass31_118.method667(arg0, local43);
					if (local57 != null) {
						@Pc(69) Class115 local69 = Static458.aClass115ArrayArray2[arg0][local43] = new Class115();
						local69.anInt3464 = local43 + (arg0 << 16);
						if (local57[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local69.method3145(new Class4_Sub9(local57));
					}
				}
			}
			Static448.aBooleanArray32[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
