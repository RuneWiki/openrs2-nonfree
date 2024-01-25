import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "[I")
	public static int[] anIntArray462;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "Z")
	public static boolean aBoolean615 = false;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V")
	public static void method6011() {
		Static121.anIntArray272 = Static14.method424(0.4F);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(B[BZ)V")
	public static void method6012(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static77.aClass3_Sub7_1 == null) {
			Static77.aClass3_Sub7_1 = new Class3_Sub7(20000);
		}
		Static77.aClass3_Sub7_1.method6500(arg0.length, arg0);
		if (!arg1) {
			return;
		}
		Static421.method6748(Static77.aClass3_Sub7_1.aByteArray86);
		Static228.aClass69_Sub1Array1 = new Class69_Sub1[Static244.anInt5120];
		@Pc(36) int local36 = 0;
		for (@Pc(38) int local38 = Static312.anInt6275; local38 <= Static394.anInt7572; local38++) {
			@Pc(43) Class69_Sub1 local43 = Static52.method1287(local38);
			if (local43 != null) {
				Static228.aClass69_Sub1Array1[local36++] = local43;
			}
		}
		Static380.aBoolean625 = false;
		Static41.aLong46 = Static376.method6088();
		Static77.aClass3_Sub7_1 = null;
	}
}
