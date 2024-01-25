import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gaa", name = "Xb", descriptor = "I")
	public static int anInt3720;

	@OriginalMember(owner = "client!gaa", name = "Rb", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_74 = new Class180(14, 4);

	@OriginalMember(owner = "client!gaa", name = "Wb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[8];

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!or;I)V")
	public static void method3390(@OriginalArg(0) Class260 arg0) {
		if (arg0.anInt7003 == 5 && arg0.anInt6964 != -1) {
			Static219.method3795(Static674.aClass13_22, arg0);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "()V")
	public static void method3398() {
		for (@Pc(1) int local1 = 0; local1 < Static77.anInt1423; local1++) {
			@Pc(6) Class28_Sub1_Sub1 local6 = Static443.aClass28_Sub1_Sub1Array1[local1];
			Static113.method2112(local6, true);
			Static443.aClass28_Sub1_Sub1Array1[local1] = null;
		}
		Static77.anInt1423 = 0;
	}
}
