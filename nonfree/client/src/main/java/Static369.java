import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!mea", name = "A", descriptor = "I")
	public static int anInt5530 = 0;

	@OriginalMember(owner = "client!mea", name = "J", descriptor = "I")
	public static int anInt5535 = 0;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIIII)V")
	public static void method4865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class4_Sub5_Sub11 local9 = Static652.method8695((long) arg3, 8);
		local9.method3955();
		local9.anInt4425 = arg1;
		local9.anInt4427 = arg2;
		local9.anInt4429 = arg0;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIZLclient!kq;)V")
	public static void method4868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class199 arg2) {
		Static678.anInt10617 = arg0;
		Static514.aClass199_13 = arg2;
		Static24.anInt563 = arg1;
	}
}
