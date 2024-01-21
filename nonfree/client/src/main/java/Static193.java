import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!v", name = "i", descriptor = "[I")
	public static int[] anIntArray276;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "[I")
	public static int[] anIntArray277;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "I")
	public static int anInt3063;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Lclient!wd;")
	public static final Class97 aClass97_16 = new Class97(32);

	@OriginalMember(owner = "client!v", name = "g", descriptor = "Lclient!wd;")
	public static final Class97 aClass97_17 = new Class97(4096);

	@OriginalMember(owner = "client!v", name = "h", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1451 = Static187.method3089("null");

	@OriginalMember(owner = "client!v", name = "k", descriptor = "I")
	public static int anInt3062 = -1;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Lclient!vd;")
	public static Class92 method2265(@OriginalArg(1) int arg0) {
		@Pc(3) Class92 local3 = new Class92();
		local3.anInt4244 = 0;
		local3.aByteArray52 = new byte[arg0];
		return local3;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	public static void method2266() {
		if (Static30.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static202.anIntArray358[187] = 27;
			Static202.anIntArray358[220] = 74;
			Static202.anIntArray358[189] = 26;
			Static202.anIntArray358[221] = 43;
			Static202.anIntArray358[190] = 72;
			Static202.anIntArray358[188] = 71;
			Static202.anIntArray358[186] = 57;
			Static202.anIntArray358[191] = 73;
			Static202.anIntArray358[222] = 59;
			Static202.anIntArray358[192] = 58;
			Static202.anIntArray358[223] = 28;
			Static202.anIntArray358[219] = 42;
			return;
		}
		Static202.anIntArray358[92] = 74;
		Static202.anIntArray358[44] = 71;
		Static202.anIntArray358[45] = 26;
		if (Static30.aMethod2 == null) {
			Static202.anIntArray358[222] = 59;
			Static202.anIntArray358[192] = 58;
		} else {
			Static202.anIntArray358[222] = 58;
			Static202.anIntArray358[192] = 28;
			Static202.anIntArray358[520] = 59;
		}
		Static202.anIntArray358[59] = 57;
		Static202.anIntArray358[61] = 27;
		Static202.anIntArray358[46] = 72;
		Static202.anIntArray358[91] = 42;
		Static202.anIntArray358[93] = 43;
		Static202.anIntArray358[47] = 73;
	}
}
