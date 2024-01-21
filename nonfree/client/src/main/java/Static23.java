import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
	public static int anInt699;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Lclient!ga;")
	public static Class30 aClass30_11;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
	public static int anInt701;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "[Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1[] aClass1_Sub1_Sub12_Sub1Array2;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
	public static int anInt698 = 0;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "[I")
	public static int[] anIntArray97 = new int[100];

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Z")
	public static boolean aBoolean33 = true;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray2 = new byte[1000][];

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "Lclient!ed;")
	public static Class23 aClass23_252 = Static169.method2903("<col=ff3000>");

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lclient!ke;")
	public static Class7 method396() {
		try {
			return (Class7) Class.forName("Class7_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class7_Sub2();
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public static void method397() {
		aClass1_Sub1_Sub12_Sub1Array2 = null;
		aByteArrayArray2 = null;
		aClass30_11 = null;
		aClass23_252 = null;
		anIntArray97 = null;
		aByteArrayArray3 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLclient!ga;)V")
	public static void method398(@OriginalArg(1) Class30 arg0) {
		Static162.aClass30_59 = arg0;
	}
}
