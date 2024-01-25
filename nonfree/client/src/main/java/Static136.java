import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
	public static int anInt2817;

	@OriginalMember(owner = "client!gr", name = "w", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_36 = new Class212(77, -1);

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
	public static int anInt2819 = 0;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZZ)Z")
	public static boolean method2526(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
	public static void method2529() {
		if (!Static214.method3759()) {
			return;
		}
		if (Static65.aStringArray8 == null) {
			Static19.method306();
		}
		Static72.anInt1777 = 0;
		Static379.aBoolean483 = true;
		try {
			Static290.aClipboard1 = Static179.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(25) Exception local25) {
		}
	}

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "(B)V")
	public static void method2531() {
		@Pc(5) int local5 = 0;
		if (Static157.aClass185_Sub1_1.method4632(Static192.anInt3828)) {
			local5 = 55;
		}
		if (!Static157.aClass185_Sub1_1.aBoolean405) {
			local5 |= 0x40;
		}
		Static115.method2208(local5);
		Static146.aClass228_1.method5202(local5);
		Static139.aClass193_1.method4656(local5);
		Static220.aClass247_1.method5659(local5);
		Static193.aClass186_1.method4464(local5);
		Static416.method5806(local5);
		Static53.method3950(local5);
		Static39.method808(local5);
		Static294.method4499(local5);
		Static461.method4588();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BBILclient!ki;I)V")
	public static void method2532(@OriginalArg(2) int arg0, @OriginalArg(3) Class11_Sub5_Sub2_Sub1 arg1, @OriginalArg(4) int arg2) {
		@Pc(15) int local15 = arg1.anIntArray523[0];
		@Pc(20) int local20 = arg1.anIntArray524[0];
		if (local15 < 0 || local15 >= Static193.anInt3853 || local20 < 0 || Static301.anInt5585 <= local20 || (arg2 < 0 || arg2 >= Static193.anInt3853 || arg0 < 0 || arg0 >= Static301.anInt5585)) {
			return;
		}
		@Pc(81) int local81 = Static381.method5403(0, 0, arg1.method5302(), -4, Static221.anIntArray353, true, local20, 0, arg2, Static174.anIntArray281, local15, 0, Static335.aClass253Array1[arg1.aByte100], arg0);
		if (local81 >= 1 && local81 <= 3) {
			for (@Pc(95) int local95 = 0; local95 < local81 - 1; local95++) {
				arg1.method3627(Static221.anIntArray353[local95], Static174.anIntArray281[local95], (byte) 2);
			}
		}
	}
}
