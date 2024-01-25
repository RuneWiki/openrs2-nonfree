import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!jo", name = "J", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!jo", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString68 = "Created gameworld";

	@OriginalMember(owner = "client!jo", name = "S", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!jo", name = "T", descriptor = "[I")
	public static final int[] anIntArray112 = new int[14];

	@OriginalMember(owner = "client!jo", name = "U", descriptor = "[I")
	public static final int[] anIntArray113 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V")
	public static void method1564() {
		@Pc(10) Class198 local10 = Static249.aClass198_43;
		synchronized (Static249.aClass198_43) {
			Static249.aClass198_43.method5230();
		}
		local10 = Static216.aClass198_40;
		synchronized (Static216.aClass198_40) {
			Static216.aClass198_40.method5230();
		}
		local10 = Static323.aClass198_56;
		synchronized (Static323.aClass198_56) {
			Static323.aClass198_56.method5230();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZ)Lclient!aa;")
	public static Class2 method1566(@OriginalArg(0) int arg0) {
		@Pc(5) Class198 local5 = Static94.aClass198_18;
		@Pc(14) Class2 local14;
		synchronized (Static94.aClass198_18) {
			local14 = (Class2) Static94.aClass198_18.method5242((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static65.aClass100_37.method2319(Static234.method4372(arg0), Static152.method2449(arg0));
		local14 = new Class2();
		local14.anInt19 = arg0;
		if (local34 != null) {
			local14.method12(new Class3_Sub4(local34));
		}
		@Pc(52) Class198 local52 = Static94.aClass198_18;
		synchronized (Static94.aClass198_18) {
			Static94.aClass198_18.method5231((long) arg0, local14);
			return local14;
		}
	}
}
