import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!uca", name = "F", descriptor = "I")
	public static int anInt8859 = 0;

	@OriginalMember(owner = "client!uca", name = "L", descriptor = "[I")
	public static int[] anIntArray656 = new int[2];

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIZ)V")
	public static void method7282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class12_Sub4_Sub1 local13 = Static389.method6156(1, arg1);
		local13.method820();
		local13.anInt806 = arg0;
	}
}
