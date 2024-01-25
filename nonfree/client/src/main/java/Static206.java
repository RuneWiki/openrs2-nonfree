import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hfa", name = "e", descriptor = "Z")
	public static boolean aBoolean362;

	@OriginalMember(owner = "client!hfa", name = "h", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_43 = new Class269(52, 8);

	@OriginalMember(owner = "client!hfa", name = "i", descriptor = "Lclient!mp;")
	public static Class222 aClass222_14 = new Class222(8);

	@OriginalMember(owner = "client!hfa", name = "j", descriptor = "[I")
	public static final int[] anIntArray296 = new int[25];

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILclient!fca;)V")
	public static void method3598(@OriginalArg(1) Class11_Sub1_Sub1_Sub2_Sub2 arg0) {
		for (@Pc(15) Class2_Sub31 local15 = (Class2_Sub31) Static124.aClass238_22.method5833(); local15 != null; local15 = (Class2_Sub31) Static124.aClass238_22.method5838()) {
			if (arg0 == local15.aClass11_Sub1_Sub1_Sub2_Sub2_1) {
				if (local15.aClass2_Sub2_Sub5_3 != null) {
					Static1.aClass2_Sub2_Sub2_6.method1042(local15.aClass2_Sub2_Sub5_3);
					local15.aClass2_Sub2_Sub5_3 = null;
				}
				local15.method8599();
				return;
			}
		}
	}
}
