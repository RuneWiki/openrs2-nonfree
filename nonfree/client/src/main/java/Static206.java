import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "[I")
	public static final int[] anIntArray315 = new int[5];

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "[I")
	public static final int[] anIntArray316 = new int[13];

	@OriginalMember(owner = "client!ke", name = "U", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_66 = new Class237(69, 8);

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
	public static void method3163(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static277.aString38 = arg1;
		Static425.aString57 = arg2;
		Static97.anInt1822 = arg0;
		if (Static425.aString57.equals("") || Static277.aString38.equals("")) {
			Static430.anInt7428 = 3;
		} else if (Static193.anInt1052 == -1) {
			Static430.anInt7428 = -3;
			Static100.anInt1855 = 0;
			Static359.anInt6125 = 1;
			Static452.anInt7817 = 0;
			@Pc(40) Class1_Sub1 local40 = new Class1_Sub1(128);
			local40.method4115(10);
			local40.method4105((int) (Math.random() * 9.9999999E7D));
			local40.method4107(Static315.method4683(Static425.aString57));
			local40.method4105((int) (Math.random() * 9.9999999E7D));
			local40.method4104(Static277.aString38);
			local40.method4105((int) (Math.random() * 9.9999999E7D));
			local40.method4141(Static195.aBigInteger3, Static212.aBigInteger2);
			Static232.aClass1_Sub1_Sub1_2.anInt5056 = 0;
			Static232.aClass1_Sub1_Sub1_2.method4115(Static20.aClass108_10.anInt2675);
			Static232.aClass1_Sub1_Sub1_2.method4115(local40.anInt5056 + 2);
			Static232.aClass1_Sub1_Sub1_2.method4101(586);
			Static232.aClass1_Sub1_Sub1_2.method4110(local40.anInt5056, local40.aByteArray66);
		} else {
			Static103.method1573();
		}
	}
}
