import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "[I")
	public static int[] anIntArray375;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "F")
	public static float aFloat125;

	@OriginalMember(owner = "client!ml", name = "D", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!ml", name = "I", descriptor = "Lclient!tf;")
	public static Class134_Sub1 aClass134_Sub1_2;

	@OriginalMember(owner = "client!ml", name = "J", descriptor = "F")
	public static float aFloat126;

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_62 = new Class242("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
	public static int anInt4520 = 0;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!jb;I)Lclient!jb;")
	public static Class126 method3417(@OriginalArg(0) Class126 arg0) {
		@Pc(12) Class126 local12 = Static55.method1115(arg0);
		if (local12 == null) {
			local12 = arg0.aClass126_9;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!jb;ILclient!jb;)V")
	public static void method3419(@OriginalArg(0) Class126 arg0, @OriginalArg(2) Class126 arg1) {
		Static209.method2982(Static114.aClass36_58);
		Static116.aClass4_Sub30_Sub1_1.method4861(arg0.anInt3397);
		Static116.aClass4_Sub30_Sub1_1.method4861(arg1.anInt3397);
		Static116.aClass4_Sub30_Sub1_1.method4835(arg0.anInt3395);
		Static116.aClass4_Sub30_Sub1_1.method4828(arg1.anInt3392);
		Static116.aClass4_Sub30_Sub1_1.method4883(arg0.anInt3392);
		Static116.aClass4_Sub30_Sub1_1.method4883(arg1.anInt3395);
	}
}
