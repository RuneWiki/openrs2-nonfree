import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cca", name = "u", descriptor = "I")
	public static int anInt1181;

	@OriginalMember(owner = "client!cca", name = "Q", descriptor = "Lclient!sfa;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!cca", name = "g", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_13 = new Class269(35, 7);

	@OriginalMember(owner = "client!cca", name = "y", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!cca", name = "T", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(Z)V")
	public static void method1058() {
		aBoolean85 = true;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(JB)V")
	public static void method1062(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static39.method8153(arg0 - 1L);
			Static39.method8153(1L);
		} else {
			Static39.method8153(arg0);
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILclient!rca;)V")
	public static void method1063(@OriginalArg(1) Class2_Sub34_Sub2 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Static387.anInt6972; local1++) {
			@Pc(6) int local6 = Static108.anIntArray194[local1];
			@Pc(10) Class11_Sub1_Sub1_Sub2_Sub1 local10 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local6];
			@Pc(14) int local14 = arg0.method6904();
			if ((local14 & 0x1) != 0) {
				local14 += arg0.method6904() << 8;
			}
			if ((local14 & 0x8000) != 0) {
				local14 += arg0.method6904() << 16;
			}
			Static511.method6431(local14, arg0, local6, local10);
		}
	}
}
