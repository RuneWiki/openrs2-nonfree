import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
	public static int anInt9594;

	@OriginalMember(owner = "client!tt", name = "O", descriptor = "[I")
	public static int[] anIntArray698;

	@OriginalMember(owner = "client!tt", name = "I", descriptor = "I")
	public static int anInt9602 = -1;

	@OriginalMember(owner = "client!tt", name = "M", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_189 = new Class225(25, 0);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)V")
	public static void method8472(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static268.method3778(arg0)) {
			Static180.method5444(arg1, Static581.aClass273ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZB)V")
	public static void method8473() {
		@Pc(22) Class2_Sub33 local22 = Static592.method8154(Static220.aClass349_57, Static487.aClass221_2.aClass48_1);
		Static487.aClass221_2.method5173(local22);
		for (@Pc(31) Class2_Sub26 local31 = (Class2_Sub26) Static463.aClass218_36.method5092(); local31 != null; local31 = (Class2_Sub26) Static463.aClass218_36.method5096()) {
			if (!local31.method9871()) {
				local31 = (Class2_Sub26) Static463.aClass218_36.method5092();
				if (local31 == null) {
					break;
				}
			}
			if (local31.anInt3019 == 0) {
				Static331.method4599(local31, true, true);
			}
		}
		if (Static13.aClass273_1 != null) {
			Static371.method5299(Static13.aClass273_1);
			Static13.aClass273_1 = null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBI)Z")
	public static boolean method8474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static327.method8981(arg1, arg0) | (arg1 & 0x70000) != 0 || Static435.method6316(arg0, arg1);
	}
}
