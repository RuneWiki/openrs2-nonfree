import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "[I")
	public static final int[] anIntArray101 = new int[1000];

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Z")
	public static final boolean aBoolean64 = false;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_11 = new Class8(64);

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_363 = Static161.method2452("FULL");

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "[I")
	public static final int[] anIntArray102 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_364 = Static161.method2452("Lade Texturen )2 ");

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!dc;")
	public static Class20 aClass20_365 = aClass20_363;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_366 = Static161.method2452("<col=ffffff>");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method890(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static208.method3110(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static155.aClass12_4.anApplet1 != null) {
				@Pc(102) Class65 local102 = Static155.aClass12_4.method295(new URL(Static155.aClass12_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static197.anInt3852 + "&u=" + Static173.aLong203 + "&v1=" + Static19.aString2 + "&v2=" + Static19.aString1 + "&e=" + local7));
				while (local102.anInt2446 == 0) {
					Static210.method739(1L);
				}
				if (local102.anInt2446 == 1) {
					@Pc(118) DataInputStream local118 = (DataInputStream) local102.anObject3;
					local118.read();
					local118.close();
				}
			}
		} catch (@Pc(125) Exception local125) {
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!re;I)V")
	public static void method891(@OriginalArg(0) Class1_Sub2 arg0) {
		if (Static177.anInt3533 == arg0.anInt2269 || arg0.anInt2254 == -1 || arg0.anInt2262 != 0 || arg0.anInt2237 + 1 > Static14.method253(arg0.anInt2254).anIntArray375[arg0.anInt2265]) {
			@Pc(43) int local43 = Static177.anInt3533 - arg0.anInt2247;
			@Pc(49) int local49 = arg0.anInt2269 - arg0.anInt2247;
			@Pc(59) int local59 = arg0.anInt2228 * 128 + arg0.anInt2238 * 64;
			@Pc(69) int local69 = arg0.anInt2238 * 64 + arg0.anInt2214 * 128;
			@Pc(79) int local79 = arg0.anInt2238 * 64 + arg0.anInt2245 * 128;
			arg0.anInt2241 = (local43 * local69 + (local49 - local43) * local59) / local49;
			@Pc(104) int local104 = arg0.anInt2250 * 128 + arg0.anInt2238 * 64;
			arg0.anInt2234 = (local43 * local79 + local104 * (local49 - local43)) / local49;
		}
		if (arg0.anInt2270 == 0) {
			arg0.anInt2246 = 1024;
		}
		if (arg0.anInt2270 == 1) {
			arg0.anInt2246 = 1536;
		}
		arg0.anInt2213 = 0;
		if (arg0.anInt2270 == 2) {
			arg0.anInt2246 = 0;
		}
		if (arg0.anInt2270 == 3) {
			arg0.anInt2246 = 512;
		}
		arg0.anInt2244 = arg0.anInt2246;
	}
}
