import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!te", name = "r", descriptor = "I")
	public static int anInt3853;

	@OriginalMember(owner = "client!te", name = "H", descriptor = "I")
	public static int anInt3860;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1359 = Static151.method2243("Cabbage");

	@OriginalMember(owner = "client!te", name = "d", descriptor = "I")
	public static int anInt3845 = 0;

	@OriginalMember(owner = "client!te", name = "m", descriptor = "[I")
	public static final int[] anIntArray350 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!te", name = "I", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1360 = Static151.method2243(" ");

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
	public static void method2661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass10_1 = null;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BILclient!oc;)V")
	public static void method2663(@OriginalArg(1) int arg0, @OriginalArg(2) Class71_Sub1 arg1) {
		if (Static165.aClass2_Sub11_3 == null) {
			Static206.method279(255, 0, (byte) 0, true, 255, null);
			Static97.aClass71_Sub1Array1[arg0] = arg1;
		} else {
			Static165.aClass2_Sub11_3.anInt2235 = arg0 * 8 + 5;
			@Pc(25) int local25 = Static165.aClass2_Sub11_3.method1577();
			@Pc(29) int local29 = Static165.aClass2_Sub11_3.method1577();
			arg1.method2150(local29, local25);
		}
	}
}
