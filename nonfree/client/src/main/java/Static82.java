import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
	public static int anInt1956 = 0;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_586 = Static81.method1507("<col=80ff00>");

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_29 = new Class86(64);

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_587 = Static81.method1507("Loaded textures");

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
	public static int anInt1957 = 0;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!dj;")
	public static Class24 aClass24_588 = aClass24_587;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[8];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method1513(@OriginalArg(0) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static35.anInt4161 > 0) {
			local19 = Static151.aByteArrayArray9[--Static35.anInt4161];
			Static151.aByteArrayArray9[Static35.anInt4161] = null;
			return local19;
		} else if (arg0 == 5000 && Static88.anInt2067 > 0) {
			local19 = Static39.aByteArrayArray3[--Static88.anInt2067];
			Static39.aByteArrayArray3[Static88.anInt2067] = null;
			return local19;
		} else if (arg0 == 30000 && Static199.anInt2884 > 0) {
			local19 = Static184.aByteArrayArray10[--Static199.anInt2884];
			Static184.aByteArrayArray10[Static199.anInt2884] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public static void method1514() {
		Static30.aBoolean35 = false;
		Static193.aBoolean201 = false;
	}
}
