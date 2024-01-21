import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!qi", name = "y", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!qi", name = "D", descriptor = "Lclient!bc;")
	public static Class10 aClass10_3;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
	public static int anInt3462 = 0;

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
	public static int anInt3468 = -1;

	@OriginalMember(owner = "client!qi", name = "z", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1012 = Static81.method1507("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!qi", name = "B", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1013 = Static81.method1507(" ");

	@OriginalMember(owner = "client!qi", name = "I", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1014 = Static81.method1507("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ca;III)V")
	public static void method2662(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt2485 == arg2 && arg2 != -1) {
			@Pc(19) Class1_Sub2_Sub22 local19 = Static85.method2622(arg2);
			@Pc(22) int local22 = local19.anInt3996;
			if (local22 == 1) {
				arg0.anInt2466 = 0;
				arg0.anInt2493 = 0;
				arg0.anInt2496 = 0;
				arg0.anInt2472 = arg1;
				Static125.method2098(local19, arg0.anInt2501, arg0.anInt2448, arg0.anInt2493, arg0 == Static87.aClass5_Sub2_Sub1_1);
			}
			if (local22 == 2) {
				arg0.anInt2466 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt2485 == -1 || Static85.method2622(arg2).anInt3994 >= Static85.method2622(arg0.anInt2485).anInt3994) {
			arg0.anInt2466 = 0;
			arg0.anInt2496 = 0;
			arg0.anInt2493 = 0;
			arg0.anInt2472 = arg1;
			arg0.anInt2456 = arg0.anInt2447;
			arg0.anInt2485 = arg2;
			if (arg0.anInt2485 != -1) {
				Static125.method2098(Static85.method2622(arg0.anInt2485), arg0.anInt2501, arg0.anInt2448, arg0.anInt2493, arg0 == Static87.aClass5_Sub2_Sub1_1);
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
	public static byte[] method2664(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static8.method213(local18) : local18;
		} else if (arg0 instanceof Class70) {
			@Pc(32) Class70 local32 = (Class70) arg0;
			return local32.method2246();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
