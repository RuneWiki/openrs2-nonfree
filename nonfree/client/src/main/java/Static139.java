import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "[Lclient!rn;")
	public static Class18[] aClass18Array5;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	public static int anInt2784;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
	public static int anInt2783 = -2;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Lclient!nf;")
	public static Class167 method2652() {
		try {
			return (Class167) Class.forName("Class167_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIII)V")
	public static void method2654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = Static322.anInt5529 * arg1 >> 8;
		if (local5 != 0 && arg2 != -1) {
			Static154.method2825(arg2, local5, Static165.aClass171_41);
			Static221.aBoolean428 = true;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLclient!kk;)Lclient!ta;")
	public static Class65_Sub4 method2655(@OriginalArg(1) Class2_Sub16 arg0) {
		return new Class65_Sub4(arg0.method5341(), arg0.method5341(), arg0.method5341(), arg0.method5341(), arg0.method5341(), arg0.method5341(), arg0.method5341(), arg0.method5341(), arg0.method5356(), arg0.method5350());
	}
}
