import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "Lclient!fa;")
	public static Class63 aClass63_2;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "Lclient!kl;")
	public static final Class1_Sub8_Sub1 aClass1_Sub8_Sub1_3 = new Class1_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "[I")
	public static final int[] anIntArray87 = new int[5];

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method718(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static93.method2020(Static261.method1470(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method719(@OriginalArg(0) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static30.anInt1228 > 0) {
			local24 = Static274.aByteArrayArray18[--Static30.anInt1228];
			Static274.aByteArrayArray18[Static30.anInt1228] = null;
			return local24;
		} else if (arg0 == 5000 && Static240.anInt1896 > 0) {
			local24 = Static209.aByteArrayArray13[--Static240.anInt1896];
			Static209.aByteArrayArray13[Static240.anInt1896] = null;
			return local24;
		} else if (arg0 == 30000 && Static351.anInt6704 > 0) {
			local24 = Static232.aByteArrayArray14[--Static351.anInt6704];
			Static232.aByteArrayArray14[Static351.anInt6704] = null;
			return local24;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(IB)Lclient!lf;")
	public static Class123 method721(@OriginalArg(0) int arg0) {
		@Pc(5) Class87 local5 = Static20.aClass87_3;
		@Pc(14) Class123 local14;
		synchronized (Static20.aClass87_3) {
			local14 = (Class123) Static20.aClass87_3.method2482((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(37) byte[] local37 = Static54.aClass216_15.method5648(32, arg0);
		local14 = new Class123();
		if (local37 != null) {
			local14.method3391(new Class1_Sub8(local37));
		}
		local14.method3392();
		@Pc(55) Class87 local55 = Static20.aClass87_3;
		synchronized (Static20.aClass87_3) {
			Static20.aClass87_3.method2481(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[Lclient!c;)V")
	public static void method722(@OriginalArg(1) Class5[] arg0) {
		Static271.anInt5534 = arg0.length;
		Static279.anIntArray476 = new int[Static271.anInt5534 + 10];
		Static197.aClass5Array16 = new Class5[Static271.anInt5534 + 10];
		Static361.method1334(arg0, 0, Static197.aClass5Array16, 0, Static271.anInt5534);
		for (@Pc(31) int local31 = 0; local31 < Static271.anInt5534; local31++) {
			Static279.anIntArray476[local31] = Static197.aClass5Array16[local31].method3630();
		}
		for (@Pc(50) int local50 = Static271.anInt5534; local50 < Static197.aClass5Array16.length; local50++) {
			Static279.anIntArray476[local50] = 12;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	public static void method723() {
		Static50.aClass16_4 = new Class16();
	}
}
