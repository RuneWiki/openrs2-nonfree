import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_122 = new Class56(100, -2);

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
	public static final int anInt3488 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIII)V")
	public static void method2768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 >= Static62.anInt1114 && arg2 <= Static207.anInt3632 && Static254.anInt4211 <= arg1 && arg4 <= Static275.anInt4594) {
			Static27.method371(arg0, arg1, arg4, arg2, arg3);
		} else {
			Static25.method345(arg3, arg2, arg1, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public static void method2769() {
		@Pc(5) Class137 local5 = Static31.aClass137_5;
		synchronized (Static31.aClass137_5) {
			Static31.aClass137_5.method2737();
		}
	}
}
