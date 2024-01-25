import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
	public static int anInt826;

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "S")
	public static short aShort11 = 32767;

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "[I")
	public static final int[] anIntArray72 = new int[25];

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "[I")
	public static final int[] anIntArray73 = new int[13];

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZI)Lclient!fh;")
	public static Class68 method942(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class68 local15 = Static8.method144(arg1);
		if (arg0 == -1) {
			return local15;
		} else if (local15 == null || local15.aClass68Array1 == null || local15.aClass68Array1.length <= arg0) {
			return null;
		} else {
			return local15.aClass68Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)I")
	public static int method945(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static212.method3990(arg0);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)I")
	public static int method946() {
		if (Static18.aClass68_1 == null) {
			if (!Static258.aBoolean470 && Static225.anInt4918 > 0) {
				if (Static231.aBoolean433 && Static166.aClass25_1.method398(81) && Static225.anInt4918 > 2) {
					return ((Class2_Sub31) Static103.aClass180_24.aClass2_207.aClass2_252.aClass2_252).anInt5372;
				}
				return ((Class2_Sub31) Static103.aClass180_24.aClass2_207.aClass2_252).anInt5372;
			}
			@Pc(45) int local45 = Class1_Sub2_Sub5.lb.method2470();
			@Pc(49) int local49 = Class1_Sub2_Sub5.lb.method2466();
			@Pc(51) int local51 = Static118.anInt2499;
			@Pc(53) int local53 = Static220.anInt4855;
			@Pc(55) int local55 = Static118.anInt2488;
			if (local45 > local51 && local45 < local51 + local55) {
				@Pc(65) int local65 = -1;
				@Pc(83) int local83;
				for (@Pc(67) int local67 = 0; local67 < Static225.anInt4918; local67++) {
					if (Static257.aBoolean463) {
						local83 = local53 + (Static225.anInt4918 + -1 - local67) * 16 + 33;
						if (local49 > local83 - 13 && local49 <= local83 + 3) {
							local65 = local67;
						}
					} else {
						local83 = (Static225.anInt4918 - local67 - 1) * 16 + local53 + 31;
						if (local83 - 13 < local49 && local83 + 3 >= local49) {
							local65 = local67;
						}
					}
				}
				if (local65 != -1) {
					local83 = 0;
					@Pc(145) Class91 local145 = new Class91(Static103.aClass180_24);
					for (@Pc(150) Class2_Sub31 local150 = (Class2_Sub31) local145.method2446(); local150 != null; local150 = (Class2_Sub31) local145.method2443()) {
						if (local83++ == local65) {
							return local150.anInt5372;
						}
					}
				}
			}
		}
		return -1;
	}
}
