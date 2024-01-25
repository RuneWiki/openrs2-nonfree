import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
	public static int anInt6302;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIII)V")
	public static void method5358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(43) String local43 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local43);
		Static12.method182(true, false, local43);
	}
}
