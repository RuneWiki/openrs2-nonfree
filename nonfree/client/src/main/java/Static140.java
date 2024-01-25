import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "I")
	public static int anInt2891;

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "Lclient!aa;")
	public static Class2 aClass2_14;

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_40 = new Class212(33, -1);

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IB)Lclient!ea;")
	public static Class56 method2578(@OriginalArg(0) int arg0) {
		@Pc(8) Class56[] local8 = Static407.method5681();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(21) Class56 local21 = local8[local10];
			if (arg0 == local21.anInt1919) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
	public static void method2579(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(10, arg0);
		local8.method517();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!nf;II)V")
	public static void method2588(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1) {
		if (Static204.aBoolean264) {
			Static204.aBoolean264 = false;
			arg1 = 0;
		}
		if (Static78.aClass169_1 != null && Static78.aClass169_1.method4245(arg0)) {
			return;
		}
		Static78.aClass169_1 = arg0;
		Static309.aLong171 = Static167.method2929();
		Static403.anInt3405 = arg1;
		Static218.anInt4426 = arg1;
		if (Static218.anInt4426 == 0) {
			Static263.method4246();
			return;
		}
		Static77.aFloat36 = Static363.aFloat88;
		Static453.anInt7765 = Static352.anInt6230;
		Static178.anInt3669 = Static229.anInt4569;
		Static14.aClass41_1 = Static254.aClass41_4;
		Static218.anInt4425 = Static368.anInt6380;
		Static196.aFloat94 = Static13.aFloat4;
		Static460.aFloat99 = Static199.aFloat3;
		Static162.aFloat34 = Static354.aFloat85;
		Static67.aFloat33 = Static341.aFloat84;
		Static449.aFloat95 = Static122.aFloat58;
	}
}
