import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static256 {

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "Z")
	public static boolean aBoolean277;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
	public static int anInt5440;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	public static int anInt5442 = 0;

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
	public static volatile int anInt5443 = 0;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "J")
	public static long aLong180 = 0L;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
	public static int anInt5444 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!hc;ILclient!hc;)V")
	public static void method4143(@OriginalArg(0) Class51 arg0, @OriginalArg(2) Class51 arg1) {
		Static75.aClass51_24 = arg0;
		Static155.aClass51_53 = arg1;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I")
	public static int method4144() {
		return 2;
	}
}
