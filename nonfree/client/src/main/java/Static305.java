import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static305 {

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "Lclient!lt;")
	public static Class158 aClass158_67;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
	public static int anInt5001 = 0;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "Z")
	public static boolean aBoolean353 = true;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZIBILclient!lt;)V")
	public static void method4409(@OriginalArg(0) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class158 arg2) {
		Static411.aClass158_87 = arg2;
		Static2.anInt9 = 1;
		Static61.aBoolean110 = false;
		Static258.anInt4423 = arg1;
		Static254.anInt3860 = 2;
		Static271.anInt4635 = 0;
		Static422.anInt7022 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!ts;")
	public static Class86 method4410(@OriginalArg(0) Component arg0) {
		return new Class86_Sub1(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Z")
	public static boolean method4412(@OriginalArg(1) int arg0) {
		if (arg0 == 17 || arg0 == 4 || arg0 == 9 || arg0 == 60 || arg0 == 51) {
			return true;
		} else {
			return arg0 == 57 || arg0 == 1008;
		}
	}
}
