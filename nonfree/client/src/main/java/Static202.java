import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
	public static int anInt3312;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IZI)V")
	public static void method3065(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub5_Sub11 local13 = Static652.method8695((long) arg1, 6);
		local13.method3955();
		local13.anInt4427 = arg0;
	}
}
