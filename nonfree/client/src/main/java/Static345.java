import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
	public static int anInt6605;

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "[I")
	public static final int[] anIntArray544 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "Lclient!bf;")
	public static final Class24 aClass24_1 = Static156.method2517();

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
	public static int method5613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return local16 + (arg0 + (arg0 >>> 31)) % arg1;
	}
}
