import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!gl", name = "G", descriptor = "[I")
	public static int[] anIntArray171;

	@OriginalMember(owner = "client!gl", name = "L", descriptor = "[[[Lclient!og;")
	public static Class155[][][] aClass155ArrayArrayArray2;

	@OriginalMember(owner = "client!gl", name = "F", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!gl", name = "O", descriptor = "Z")
	public static boolean aBoolean159 = true;

	@OriginalMember(owner = "client!gl", name = "S", descriptor = "Lclient!jm;")
	public static final Class105 aClass105_5 = new Class105("", 11);

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)V")
	public static void method2243() {
		@Pc(1) Class21 local1 = Static288.aClass21_147;
		synchronized (Static288.aClass21_147) {
			Static288.aClass21_147.method844(5);
		}
		local1 = Static19.aClass21_18;
		synchronized (Static19.aClass21_18) {
			Static19.aClass21_18.method844(5);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)V")
	public static void method2248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub4_Sub17 local8 = Static132.method2717(arg0, 9);
		local8.method3480();
		local8.anInt3727 = arg1;
		local8.anInt3725 = arg2;
	}
}
