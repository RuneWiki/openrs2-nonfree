import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
	public static int anInt1025;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "Lclient!sd;")
	private static Class73 aClass73_595 = Static122.method531("Please try again)3");

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger3 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Lclient!sd;")
	public static Class73 aClass73_596 = aClass73_595;

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "Lclient!sd;")
	public static Class73 aClass73_597 = Static122.method531("<col=ffff00>");

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
	public static int anInt1024 = 0;

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "Lclient!sd;")
	public static Class73 aClass73_598 = Static122.method531(":duelreq:");

	@OriginalMember(owner = "client!fb", name = "E", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!sd;ILclient!ff;)I")
	public static int method786(@OriginalArg(0) Class73 arg0, @OriginalArg(2) Class3_Sub12 arg1) {
		@Pc(6) int local6 = arg1.anInt1793;
		arg1.method1388(arg0.anInt3356);
		arg1.anInt1793 += Static115.aClass58_1.method2072(arg0.anInt3356, arg1.aByteArray16, arg0.aByteArray36, 0, arg1.anInt1793);
		return arg1.anInt1793 - local6;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)I")
	public static int method787() {
		@Pc(5) int local5 = Static107.method1922(Static34.anInt834, Static19.anInt513, Static147.anInt3309);
		return local5 - Static55.anInt1291 >= 800 || (Static110.aByteArrayArrayArray5[Static147.anInt3309][Static34.anInt834 >> 7][Static19.anInt513 >> 7] & 0x4) == 0 ? 3 : Static147.anInt3309;
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
	public static void method788() {
		aBigInteger3 = null;
		aClass73_598 = null;
		aClass73_595 = null;
		aClass73_596 = null;
		aClass73_597 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BZ)V")
	public static void method789(@OriginalArg(1) boolean arg0) {
		if (Static139.aClass2_5 == null) {
			return;
		}
		try {
			@Pc(11) Class3_Sub12 local11 = new Class3_Sub12(4);
			local11.method1383(arg0 ? 2 : 3);
			local11.method1346(0);
			Static139.aClass2_5.method15(4, local11.aByteArray16);
		} catch (@Pc(37) IOException local37) {
			try {
				Static139.aClass2_5.method12();
			} catch (@Pc(42) Exception local42) {
			}
			Static139.aClass2_5 = null;
			Static52.anInt1278++;
		}
	}
}
