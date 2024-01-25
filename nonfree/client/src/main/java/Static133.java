import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
	public static int anInt3875;

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
	public static int anInt3879;

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "Lclient!ku;")
	public static final Class199 aClass199_2 = new Class199();

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
	public static int anInt3877 = -1;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
	public static void method3507(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class5_Sub4_Sub13 local14 = Static506.method2916(0, 15);
		local14.method4140();
		local14.anInt4504 = arg1;
		local14.anInt4508 = arg0;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)I")
	public static int method3508() {
		if ((double) Static203.aFloat4 == 3.0D) {
			return 37;
		} else if ((double) Static203.aFloat4 == 4.0D) {
			return 50;
		} else if ((double) Static203.aFloat4 == 6.0D) {
			return 75;
		} else if ((double) Static203.aFloat4 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
