import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
	public static int anInt35;

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
	public static int anInt32 = 2;

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
	public static int anInt33 = -1;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZI)V")
	public static void method41(@OriginalArg(1) int arg0) {
		@Pc(14) Class5_Sub25 local14 = (Class5_Sub25) Static587.aClass81_67.method1599((long) arg0);
		if (local14 != null) {
			local14.aBoolean370 = !local14.aBoolean370;
			local14.aClass103_Sub1_1.method6160(local14.aBoolean370);
		}
	}
}
