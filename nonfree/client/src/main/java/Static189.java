import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static189 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
	public static void method2689() {
		Static284.method4121(-1, 255);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)I")
	public static int method2690() {
		return Static353.anInt6019 == 1 ? Static457.anInt7638 : Static424.anInt7323;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!qf;Z)V")
	public static void method2691(@OriginalArg(0) int arg0, @OriginalArg(1) Class283 arg1) {
		if (Static346.aBoolean394) {
			arg0 = 0;
			Static346.aBoolean394 = false;
		}
		if (Static328.aClass283_33 != null && Static328.aClass283_33.method6971(arg1)) {
			return;
		}
		Static328.aClass283_33 = arg1;
		Static418.aLong210 = Static566.method7936();
		Static49.anInt1029 = arg0;
		Static108.anInt1974 = arg0;
		if (Static108.anInt1974 == 0) {
			Static440.method6453();
			return;
		}
		Static87.aFloat11 = Static499.aFloat160;
		Static407.aFloat82 = Static449.aFloat116;
		Static95.aClass25_1 = Static602.aClass25_4;
		Static146.anInt4860 = Static450.anInt10323;
		Static530.aFloat162 = Static244.aFloat30;
		Static649.aFloat200 = Static668.aFloat203;
		Static619.aFloat197 = Static560.aFloat10;
		Static23.anInt567 = Static355.anInt6039;
		Static398.anInt6687 = Static391.anInt6569;
		Static406.aFloat81 = Static314.aFloat36;
	}
}
