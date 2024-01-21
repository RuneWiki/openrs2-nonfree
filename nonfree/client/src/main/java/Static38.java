import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static38 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Lclient!pb;")
	public static Class40 aClass40_21;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
	public static int[] anIntArray95;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "[Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2[] aClass6_Sub2_Sub2_Sub2Array7;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	public static int anInt1386;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!rc;")
	private static Class55 aClass55_538 = Static34.method846("yellow:");

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Lclient!rc;")
	public static Class55 aClass55_537 = aClass55_538;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
	public static int anInt1387 = 0;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method906() {
		aClass55_537 = null;
		aClass55_538 = null;
		anIntArray95 = null;
		aClass40_21 = null;
		aCRC32_2 = null;
		aClass6_Sub2_Sub2_Sub2Array7 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!pb;Lclient!pb;)V")
	public static void method907(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class40 arg1) {
		Static97.aClass40_36 = arg0;
		Static15.aClass40_14 = arg1;
		Static33.anInt1274 = Static97.aClass40_36.method1224(3);
	}
}
