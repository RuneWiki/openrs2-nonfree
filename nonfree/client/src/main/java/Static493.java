import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!ria", name = "f", descriptor = "Lclient!cj;")
	public static Class55 aClass55_8;

	@OriginalMember(owner = "client!ria", name = "d", descriptor = "[I")
	public static final int[] anIntArray569 = new int[4096];

	@OriginalMember(owner = "client!ria", name = "k", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_72 = new Class32(20);

	@OriginalMember(owner = "client!ria", name = "q", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)V")
	public static void method6850() {
		for (@Pc(10) Class2_Sub2_Sub11 local10 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2325(); local10 != null; local10 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2318()) {
			if (Static514.method7201(local10.anInt4369)) {
				Static52.method839(local10);
			}
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6854(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static566.method7763(arg0, 2);
		local8.method662();
		local8.aString10 = arg1;
	}

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "(B)V")
	public static void method6855() {
		Static158.method2370(11);
		Static371.method5011();
		System.gc();
	}
}
