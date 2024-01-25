import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
	public static int anInt183;

	@OriginalMember(owner = "client!ag", name = "I", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_5 = new Class316(70, 1);

	@OriginalMember(owner = "client!ag", name = "P", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[5];

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "[I")
	public static final int[] anIntArray11 = new int[5];

	@OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
	public static int anInt190 = 1;

	@OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
	public static int anInt191 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZIII)I")
	public static int method174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class22.anIntArray19[arg0 * 8192 / arg1] >> 1;
		return (arg2 * local21 >> 16) + (arg3 * (65536 - local21) >> 16);
	}
}
