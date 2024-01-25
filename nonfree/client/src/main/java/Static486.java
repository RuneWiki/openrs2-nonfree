import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "Lclient!mf;")
	public static final Class221 aClass221_5 = new Class221();

	@OriginalMember(owner = "client!sm", name = "gb", descriptor = "Z")
	public static boolean aBoolean563 = true;

	@OriginalMember(owner = "client!sm", name = "kb", descriptor = "Lclient!jw;")
	public static final Class183 aClass183_34 = new Class183(64);

	@OriginalMember(owner = "client!sm", name = "mb", descriptor = "I")
	public static int anInt8197 = 0;

	@OriginalMember(owner = "client!sm", name = "nb", descriptor = "I")
	public static int anInt8198 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
	public static void method6754() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static21.aBooleanArray5[local3] = false;
		}
		Static88.anInt2276 = Static569.anInt4616;
		Static226.anInt4661 = -1;
		Static135.anInt3092 = -1;
		Static592.anInt9728 = Static563.anInt9436;
		Static140.anInt3147 = -1;
		Static380.anInt6749 = -1;
		Static354.anInt6168 = 0;
		Static555.anInt9335 = 5;
		Static584.anInt9650 = Static473.anInt7978;
		Static578.anInt9587 = Static348.anInt6087;
		Static466.anInt7862 = 0;
		Static276.anInt5209 = Static237.anInt7561;
		Static249.anInt4944 = Static37.anInt738;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZLjava/io/File;)[B")
	public static byte[] method6755(@OriginalArg(1) File arg0) {
		return Static110.method2322(arg0, (int) arg0.length());
	}
}
