import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "[Lclient!kr;")
	public static Class20[] aClass20Array16;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	public static int anInt10092;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "[S")
	private static final short[] aShortArray149 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "[S")
	private static final short[] aShortArray150 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "[S")
	private static final short[] aShortArray151 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "[[S")
	public static final short[][] aShortArrayArray32 = new short[][] { aShortArray151, aShortArray149, aShortArray150 };

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	public static void method8440(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub29 local15 = (Class2_Sub29) Static581.aClass222_41.method5468((long) arg0);
		if (local15 != null) {
			local15.aClass52_Sub1_1.method1225();
			Static171.method3176(local15.aBoolean417, local15.anInt5430);
			local15.method8599();
		}
	}
}
