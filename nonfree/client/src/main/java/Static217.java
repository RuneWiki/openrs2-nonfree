import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!no", name = "fb", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!no", name = "gb", descriptor = "[I")
	public static int[] anIntArray349;

	@OriginalMember(owner = "client!no", name = "F", descriptor = "I")
	public static int anInt4314 = 0;

	@OriginalMember(owner = "client!no", name = "X", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_116 = new Class21(4);

	@OriginalMember(owner = "client!no", name = "mb", descriptor = "Z")
	public static boolean aBoolean322 = false;

	@OriginalMember(owner = "client!no", name = "nb", descriptor = "I")
	public static int anInt4331 = 2;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)Lclient!g;")
	public static Class67 method4010(@OriginalArg(1) int arg0) {
		@Pc(12) Class21 local12 = Static14.aClass21_133;
		@Pc(21) Class67 local21;
		synchronized (Static14.aClass21_133) {
			local21 = (Class67) Static14.aClass21_133.method854((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(37) byte[] local37 = Static364.aClass30_109.method1161(arg0, 32);
		local21 = new Class67();
		if (local37 != null) {
			local21.method2061(new Class1_Sub7(local37));
		}
		local21.method2059();
		@Pc(55) Class21 local55 = Static14.aClass21_133;
		synchronized (Static14.aClass21_133) {
			Static14.aClass21_133.method843(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "(I)V")
	public static void method4011() {
		Static237.anInt2678 = -1;
		Static97.anInt2177 = -1;
		Static294.anInt5663 = 0;
		Static236.anInt4782 = -1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!sq;BLclient!sq;)V")
	public static void method4013(@OriginalArg(0) Class1_Sub4 arg0, @OriginalArg(2) Class1_Sub4 arg1) {
		if (arg1.aClass1_Sub4_62 != null) {
			arg1.method5714();
		}
		arg1.aClass1_Sub4_61 = arg0.aClass1_Sub4_61;
		arg1.aClass1_Sub4_62 = arg0;
		arg1.aClass1_Sub4_62.aClass1_Sub4_61 = arg1;
		arg1.aClass1_Sub4_61.aClass1_Sub4_62 = arg1;
	}
}
