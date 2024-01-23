import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "J")
	public static long aLong34;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "Lclient!kh;")
	public static Class60 aClass60_322 = Static200.method3116("details)3dat");

	@OriginalMember(owner = "client!di", name = "d", descriptor = "Lclient!kh;")
	public static Class60 aClass60_323 = Static200.method3116(":clan:");

	@OriginalMember(owner = "client!di", name = "e", descriptor = "[Lclient!f;")
	public static Class9_Sub4_Sub1[] aClass9_Sub4_Sub1Array2 = new Class9_Sub4_Sub1[2048];

	@OriginalMember(owner = "client!di", name = "f", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "I")
	public static int anInt971 = 0;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Lclient!lb;")
	public static Class1_Sub1_Sub11 method732(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub11 local10 = (Class1_Sub1_Sub11) Static155.aClass39_18.method1161((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static110.method1906(Static128.aClass7_24, Static1.aClass7_1, arg0);
		if (local10 != null) {
			Static155.aClass39_18.method1152((long) arg0, local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
	public static void method735() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	public static void method737() {
		if (Static148.aBoolean266 && Static180.anInt3841 != Static204.anInt4327) {
			Static70.method1281(Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static36.anInt3891, Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], Static134.anInt2900, Static180.anInt3841);
		} else if (Static180.anInt3841 != Static179.anInt4185) {
			Static179.anInt4185 = Static180.anInt3841;
			Static103.method1762(Static180.anInt3841);
		}
	}
}
