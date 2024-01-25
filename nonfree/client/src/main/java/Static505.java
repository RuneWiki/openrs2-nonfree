import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static505 {

	@OriginalMember(owner = "client!vaa", name = "q", descriptor = "I")
	public static final int anInt8209 = 1401;

	@OriginalMember(owner = "client!vaa", name = "z", descriptor = "J")
	public static long aLong225 = 0L;

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(III)Z")
	public static boolean method6629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(IIII)V")
	public static void method6630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static164.aClass5_Sub3_Sub1_2.method4184(arg1);
		Static164.aClass5_Sub3_Sub1_2.method4200(arg0);
		Static164.aClass5_Sub3_Sub1_2.method4181(arg2);
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V")
	public static void method6631() {
		if (Static56.anInt1176 == 1 || Static56.anInt1176 == 3 || Static329.anInt6278 != Static56.anInt1176 && (Static56.anInt1176 == 0 || Static329.anInt6278 == 0)) {
			Static310.anInt6066 = 0;
			Static438.anInt7689 = 0;
			Static521.aClass42_42.method1108();
		}
		Static329.anInt6278 = Static56.anInt1176;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BLjava/lang/String;Ljava/io/File;)V")
	public static void method6632(@OriginalArg(1) String arg0, @OriginalArg(2) File arg1) {
		Static540.aHashtable7.put(arg0, arg1);
	}
}
