import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static79 {

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "Z")
	public static boolean aBoolean103;

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
	public static int anInt1486 = 1;

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "[I")
	public static final int[] anIntArray124 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!ij;ILclient!ea;Lclient!ij;)V")
	public static void method1422(@OriginalArg(0) Class93 arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class93 arg2) {
		Static185.aClass36_6 = Static349.method5944(arg0, Static199.anInt3969);
		Static355.aClass18_4 = arg1.method5180(Static185.aClass36_6, Static363.method2681(arg2, Static199.anInt3969));
		Static92.aClass36_4 = Static349.method5944(arg0, Static276.anInt5762);
		Static204.aClass18_3 = arg1.method5180(Static92.aClass36_4, Static363.method2681(arg2, Static276.anInt5762));
		Static268.aClass36_8 = Static349.method5944(arg0, Static222.anInt4384);
		Static77.aClass18_1 = arg1.method5180(Static268.aClass36_8, Static363.method2681(arg2, Static222.anInt4384));
	}
}
