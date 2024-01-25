import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "[I")
	public static int[] anIntArray492;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "Lclient!kq;")
	public static final Class136 aClass136_8 = new Class136("WTWIP", 3);

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_117 = new Class55("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)I")
	public static int method4330(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static401.anIntArray575[arg1 & 0x3] : Static123.anIntArray170[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
	public static void method4331() {
		if (Static99.aClass116_1 != null) {
			Static99.aClass116_1.method5580();
		}
		if (Static247.aClass116_3 != null) {
			Static247.aClass116_3.method5580();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4333(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static458.method5799(Static301.method4015(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
