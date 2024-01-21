import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ob", name = "V", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!ob", name = "Y", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "Lclient!pi;")
	public static final Class67 aClass67_8 = new Class67();

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_964 = Static158.method3034("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!ob", name = "S", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_965 = Static158.method3034("lila:");

	@OriginalMember(owner = "client!ob", name = "T", descriptor = "J")
	public static volatile long aLong114 = 0L;

	@OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
	public static int anInt3488 = -1;

	@OriginalMember(owner = "client!ob", name = "bb", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[100];

	@OriginalMember(owner = "client!ob", name = "cb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_966 = Static158.method3034("Die Verbindung konnte");

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)Lclient!d;")
	public static Class2_Sub1_Sub6 method2669(@OriginalArg(0) int arg0) {
		@Pc(15) Class2_Sub1_Sub6 local15 = (Class2_Sub1_Sub6) Static90.aClass89_31.method3437((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29 = Static59.aClass13_12.method521(Static81.method1908(arg0), Static31.method769(arg0));
		local15 = new Class2_Sub1_Sub6();
		if (local29 != null) {
			local15.method791(new Class2_Sub3(local29));
		}
		Static90.aClass89_31.method3432(local15, (long) arg0);
		return local15;
	}
}
