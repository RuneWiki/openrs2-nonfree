import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
	public static int anInt2289;

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray25 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
	public static int anInt2288 = 0;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!kq;)V")
	public static void method2086(@OriginalArg(1) Class110 arg0) {
		@Pc(12) Class99 local12 = null;
		try {
			@Pc(16) Class134 local16 = arg0.method3358();
			while (local16.anInt4033 == 0) {
				Static134.method2598(1L);
			}
			if (local16.anInt4033 == 1) {
				local12 = (Class99) local16.anObject6;
				@Pc(40) Class1_Sub7 local40 = Static304.method5146();
				local12.method2723(0, local40.anInt3368, local40.aByteArray58);
			}
		} catch (@Pc(50) Exception local50) {
		}
		try {
			if (local12 != null) {
				local12.method2725();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}
}
