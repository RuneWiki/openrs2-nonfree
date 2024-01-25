import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject18;

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
	public static int anInt8992 = 0;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "B")
	public static byte aByte135 = -6;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIB)Z")
	public static boolean method7674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static173.method2843(arg1, arg0) | (arg0 & 0x40000) != 0 || Static425.method5897(arg1, arg0);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIII)V")
	public static void method7684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) int local20 = Static124.aClass4_Sub20_4.aClass8_Sub22_5.method7414() * arg2 >> 8;
		if (arg0 == -1 && !Static299.aBoolean350) {
			Static633.method8381();
		} else if (arg0 != -1 && (Static573.anInt8886 != arg0 || !Static242.method3573()) && local20 != 0 && !Static299.aBoolean350) {
			Static543.method7258(Static611.aClass34_120, arg1, arg0, local20);
			Static174.method2858();
		}
		if (arg0 != Static573.anInt8886) {
			Static399.aClass4_Sub3_Sub4_2 = null;
		}
		Static573.anInt8886 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Z")
	public static boolean method7687(@OriginalArg(0) int arg0) {
		if (Static335.aBooleanArray11[arg0]) {
			return true;
		} else if (Static358.aClass34_79.method1234(arg0)) {
			@Pc(23) int local23 = Static358.aClass34_79.method1233(arg0);
			if (local23 == 0) {
				Static335.aBooleanArray11[arg0] = true;
				return true;
			}
			if (Static392.aClass199ArrayArray2[arg0] == null) {
				Static392.aClass199ArrayArray2[arg0] = new Class199[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static392.aClass199ArrayArray2[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static358.aClass34_79.method1239(arg0, local45);
					if (local59 != null) {
						@Pc(71) Class199 local71 = Static392.aClass199ArrayArray2[arg0][local45] = new Class199();
						local71.anInt5041 = (arg0 << 16) + local45;
						if (local59[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local71.method4415(new Class4_Sub11(local59));
					}
				}
			}
			Static335.aBooleanArray11[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
