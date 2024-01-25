import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static657 {

	@OriginalMember(owner = "client!wda", name = "u", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray5 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!wda", name = "C", descriptor = "I")
	public static int anInt10371 = 0;

	@OriginalMember(owner = "client!wda", name = "D", descriptor = "I")
	public static int anInt10372 = 0;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IBI)V")
	public static void method8758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class4_Sub48 local18 = Static335.method4615(Static256.aClass216_77, Static669.aClass196_2);
		local18.aClass4_Sub11_Sub1_2.method8863(arg1);
		local18.aClass4_Sub11_Sub1_2.method8849(arg0);
		Static410.method5170(local18);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)[Lclient!bja;")
	public static Class27[] method8759() {
		return new Class27[] { Static673.aClass27_35, Static407.aClass27_11, Static500.aClass27_27, Static585.aClass27_33, Static486.aClass27_26, Static582.aClass27_32, Static87.aClass27_7, Static96.aClass27_10, Static557.aClass27_31, Static180.aClass27_34, Static510.aClass27_29, Static223.aClass27_17, Static355.aClass27_23, Static42.aClass27_6 };
	}
}
