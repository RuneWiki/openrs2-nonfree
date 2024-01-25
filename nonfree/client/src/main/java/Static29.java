import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bba", name = "Z", descriptor = "I")
	public static int anInt420;

	@OriginalMember(owner = "client!bba", name = "h", descriptor = "(B)V")
	public static void method496() {
		Static487.aClass168_76.method3862();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method497(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(16) Class5_Sub1_Sub18 local16 = Static123.method1827((long) arg0, 2);
		local16.method7441();
		local16.aString99 = arg1;
	}

	@OriginalMember(owner = "client!bba", name = "j", descriptor = "(I)V")
	public static void method499() {
		Static405.anInt10904 = -1;
		Static215.anInt3739 = 0;
		Static19.anInt250 = -1;
	}
}
