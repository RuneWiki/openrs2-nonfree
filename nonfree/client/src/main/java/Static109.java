import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!md", name = "i", descriptor = "I")
	public static int anInt3066;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "I")
	public static int anInt3068;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "I")
	public static int anInt3061 = 0;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	public static int anInt3062 = 0;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_997 = Static49.method1293("gleiten:");

	@OriginalMember(owner = "client!md", name = "f", descriptor = "I")
	public static int anInt3064 = 0;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_998 = Static49.method1293(":assist:");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!u;B)V")
	public static void method2269(@OriginalArg(0) Class76 arg0) {
		Static32.aClass76_28 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method2270() {
		aClass70_998 = null;
		aClass70_997 = null;
		aShortArrayArray3 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method2271(@OriginalArg(0) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static51.anInt1669 > 0) {
			local19 = Static132.aByteArrayArray7[--Static51.anInt1669];
			Static132.aByteArrayArray7[Static51.anInt1669] = null;
			return local19;
		} else if (arg0 == 5000 && Static19.anInt543 > 0) {
			local19 = Static61.aByteArrayArray4[--Static19.anInt543];
			Static61.aByteArrayArray4[Static19.anInt543] = null;
			return local19;
		} else if (arg0 == 30000 && Static108.anInt3051 > 0) {
			local19 = Static38.aByteArrayArray2[--Static108.anInt3051];
			Static38.aByteArrayArray2[Static108.anInt3051] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	public static void method2272() {
		if (Static179.anInt4501 > 0) {
			Static38.method976();
		} else {
			Static77.method1751(40);
			Static74.aClass43_19 = Static85.aClass43_22;
			Static85.aClass43_22 = null;
		}
	}
}
