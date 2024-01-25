import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "J")
	public static long aLong221;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
	public static int anInt8345 = 0;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!fo;Z)V")
	public static void method6470(@OriginalArg(0) int arg0, @OriginalArg(1) Class111 arg1) {
		if (Static399.anInt7806 >= 50 || (arg1 == null || arg1.anIntArrayArray14 == null || arg0 >= arg1.anIntArrayArray14.length || arg1.anIntArrayArray14[arg0] == null)) {
			return;
		}
		@Pc(32) int local32 = arg1.anIntArrayArray14[arg0][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(61) int local61;
		if (arg1.anIntArrayArray14[arg0].length > 1) {
			local61 = (int) (Math.random() * (double) arg1.anIntArrayArray14[arg0].length);
			if (local61 > 0) {
				local36 = arg1.anIntArrayArray14[arg0][local61];
			}
		}
		local61 = 256;
		if (arg1.anIntArray151 != null && arg1.anIntArray154 != null) {
			local61 = Static566.method8000(arg1.anIntArray151[arg0], arg1.anIntArray154[arg0]);
		}
		if (arg1.aBoolean233) {
			Static414.method6238(false, 255, 0, local61, local42, local36);
		} else {
			Static170.method2832(local61, 255, 0, local42, local36);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	public static boolean method6471(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (Static372.aClass366_5.aBoolean719) {
			Static326.aClass271_2 = new Class271();
			Static326.aClass271_2.anInt7991 = arg0;
			Static326.aClass271_2.aString164 = arg1;
			if (Static383.aClass326_7 != Static342.aClass326_6) {
				Static326.aClass271_2.anInt7987 = Static326.aClass271_2.anInt7991 + 50000;
				Static326.aClass271_2.anInt7994 = Static326.aClass271_2.anInt7991 + 40000;
			}
			if (arg0 < Static353.aClass222_Sub1Array1.length && Static353.aClass222_Sub1Array1[arg0] != null) {
				Static266.anInt5356 = Static353.aClass222_Sub1Array1[arg0].anInt10271;
			}
			return true;
		}
		@Pc(52) String local52 = "";
		if (Static383.aClass326_7 != Static342.aClass326_6) {
			local52 = ":" + (arg0 + 7000);
		}
		@Pc(72) String local72 = "";
		if (Static146.aString56 != null) {
			local72 = "/p=" + Static146.aString56;
		}
		@Pc(120) String local120 = "http://" + arg1 + local52 + "/l=" + Static142.anInt3088 + "/a=" + Static446.anInt8497 + local72 + "/j" + (Static314.aBoolean433 ? "1" : "0") + ",o" + (Static414.aBoolean572 ? "1" : "0") + ",a2";
		try {
			Static104.aClient3.getAppletContext().showDocument(new URL(local120), "_self");
			return true;
		} catch (@Pc(130) Exception local130) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
	public static void method6472() {
		Static144.aClass279Array1 = null;
	}
}
