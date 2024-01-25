import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!oca", name = "m", descriptor = "I")
	public static int anInt7268;

	@OriginalMember(owner = "client!oca", name = "n", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!oca", name = "v", descriptor = "Lclient!sm;")
	public static final Class311 aClass311_8 = new Class311("", 14);

	@OriginalMember(owner = "client!oca", name = "w", descriptor = "I")
	public static int anInt7276 = 0;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IZ)V")
	public static void method6344(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static556.method8018(6, arg0);
		local8.method3607();
	}
}
