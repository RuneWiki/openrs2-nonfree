import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!hw", name = "q", descriptor = "[[Lclient!gf;")
	public static Class119[][] aClass119ArrayArray1;

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_33 = new Class70(7, -1);

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)V")
	public static void method3264(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub6_Sub16 local8 = Static212.method3332(14, arg0);
		local8.method6593();
	}
}
