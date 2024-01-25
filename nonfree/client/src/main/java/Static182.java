import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static182 {

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
	public static int anInt3875;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_86 = new Class205(12, -2);

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
	public static int anInt3878 = 0;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
	public static int anInt3879 = 2;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)V")
	public static void method3567() {
		Static358.anInt2084 = -1;
		Static60.anInt1159 = -1;
		Static233.anInt4156 = 0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([Ljava/lang/Object;B[J)V")
	public static void method3568(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static23.method416(0, arg1, arg0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V")
	public static void method3571(@OriginalArg(1) int arg0) {
		if (Static262.anIntArray891 == null || arg0 > Static262.anIntArray891.length) {
			Static262.anIntArray891 = new int[arg0];
		}
	}
}
