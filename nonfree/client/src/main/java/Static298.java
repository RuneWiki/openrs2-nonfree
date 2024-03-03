import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V", line = 3)
	public static void method5479() {
		Class11_Sub1_Sub2.aBoolean24 = false;
		Static328.anIntArray450 = null;
		Static290.anIntArray388 = null;
		Static114.anIntArray156 = null;
		Static22.aClipboard1 = null;
		Static114.anIntArray157 = null;
		Static91.method2109();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(FIIIZIII)[I", line = 29)
	public static int[] method5480(@OriginalArg(0) float arg0) {
		@Pc(11) int[] local11 = new int[2048];
		@Pc(15) Class2_Sub3_Sub6 local15 = new Class2_Sub3_Sub6();
		local15.anInt1050 = 8;
		local15.anInt1048 = (int) (arg0 * 4096.0F);
		local15.anInt1042 = 4;
		local15.anInt1044 = 35;
		local15.aBoolean85 = true;
		local15.anInt1049 = 8;
		local15.method6481();
		Static146.method2791(2048, 1);
		local15.method1308(local11, 0);
		return local11;
	}
}
