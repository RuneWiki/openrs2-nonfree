import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "Lclient!ir;")
	public static Class100 aClass100_24;

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "[Lclient!da;")
	public static Class22[] aClass22Array1;

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "Lclient!ir;")
	public static Class100 aClass100_25;

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
	public static int anInt1411;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "Lclient!fi;")
	public static final Class65 aClass65_4 = new Class65();

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "[I")
	public static final int[] anIntArray85 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "[I")
	public static final int[] anIntArray86 = new int[13];

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)Lclient!bd;")
	public static Class3_Sub5 method1089() {
		if (Static193.aClass127_11 == null || Static41.aClass137_1 == null) {
			return null;
		}
		Static41.aClass137_1.method3461(Static193.aClass127_11);
		@Pc(23) Class3_Sub5 local23 = (Class3_Sub5) Static41.aClass137_1.method3466();
		if (local23 == null) {
			return null;
		} else {
			@Pc(32) Class211 local32 = Static136.method2268(local23.anInt544);
			return local32 != null && local32.aBoolean442 && local32.method5562() ? local23 : Static105.method1783();
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method1091(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(12) String local12 = "";
			if (arg1 != null) {
				local12 = Static300.method5079(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local12 = local12 + " | ";
				}
				local12 = local12 + arg0;
			}
			Static186.method2538(local12);
			local12 = Static179.method2994(":", local12, "%3a");
			local12 = Static179.method2994("@", local12, "%40");
			local12 = Static179.method2994("&", local12, "%26");
			local12 = Static179.method2994("#", local12, "%23");
			if (Static13.aClass42_1.anApplet1 != null) {
				@Pc(104) Class207 local104 = Static13.aClass42_1.method974(new URL(Static13.aClass42_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static9.anInt231 + "&u=" + Static46.aLong37 + "&v1=" + Static59.aString43 + "&v2=" + Static59.aString39 + "&e=" + local12));
				while (local104.anInt6346 == 0) {
					Static134.method2241(1L);
				}
				if (local104.anInt6346 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local104.anObject7;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I")
	public static int method1092(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
