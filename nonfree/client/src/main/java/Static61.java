import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!qj;")
	public static Class204 aClass204_1;

	@OriginalMember(owner = "client!d", name = "n", descriptor = "Lclient!qj;")
	public static Class204 aClass204_2;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "I")
	public static int anInt1580;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_28 = new Class217(66, 2);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
	public static void method1234(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static263.aClass118ArrayArrayArray2 = Static38.aClass118ArrayArrayArray1;
			Static444.aClass159Array3 = Static85.aClass159Array2;
		} else {
			Static263.aClass118ArrayArrayArray2 = Static276.aClass118ArrayArrayArray3;
			Static444.aClass159Array3 = Static26.aClass159Array1;
		}
		Static362.anInt6122 = Static263.aClass118ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method1236() {
		if (Static227.anInt4227 == 2) {
			Static286.anInt1448 = 96;
			return;
		}
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("maxMemory");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Long local31 = (Long) local21.invoke(local25, (Object[]) null);
					Static286.anInt1448 = (int) (local31 / 1048576L) + 1;
				} catch (@Pc(41) Throwable local41) {
				}
			}
		} catch (@Pc(43) Exception local43) {
		}
	}
}
