import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!ida", name = "o", descriptor = "I")
	public static int anInt4415;

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "(B)V")
	public static void method3733() {
		Static420.method6046();
		Static464.method6712();
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(III)Lclient!dk;")
	public static Class10_Sub2 method3734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static309.aClass100ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass10_Sub2_3;
	}
}
