import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static219 {

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
	public static int anInt4846;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "Lclient!iq;")
	public static Class104 aClass104_125;

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "[S")
	public static short[] aShortArray86 = new short[256];

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_145 = new Class157(64, -1);

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "[Lclient!nh;")
	public static final Class138_Sub1[] aClass138_Sub1Array1 = new Class138_Sub1[29];

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "Z")
	public static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "[I")
	public static final int[] anIntArray354 = new int[200];

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "Z")
	public static boolean aBoolean425 = true;

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
	public static int anInt4849 = 0;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IILclient!jk;)V")
	public static void method4156(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12_Sub2 arg1) {
		Static228.aBoolean430 = false;
		Static248.anInt5203 = 0;
		Static353.method5003(arg1);
		Static6.method84(arg1);
		if (Static228.aBoolean430) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt3606 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt3606 + " psize:" + arg0);
		}
	}
}
