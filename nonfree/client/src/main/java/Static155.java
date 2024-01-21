import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!qh", name = "lb", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_135;

	@OriginalMember(owner = "client!qh", name = "jb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2068 = Static118.method2249("shake:");

	@OriginalMember(owner = "client!qh", name = "hb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2067 = aClass65_2068;

	@OriginalMember(owner = "client!qh", name = "kb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2069 = Static118.method2249("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!qh", name = "nb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2070 = aClass65_2068;

	@OriginalMember(owner = "client!qh", name = "qb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2071 = Static118.method2249(": ");

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(1) Class1_Sub24 local1 = null;
		for (@Pc(10) Class1_Sub24 local10 = (Class1_Sub24) Static159.aClass91_19.method3148(); local10 != null; local10 = (Class1_Sub24) Static159.aClass91_19.method3150()) {
			if (arg6 == local10.anInt4096 && local10.anInt4100 == arg3 && local10.anInt4087 == arg7 && local10.anInt4089 == arg1) {
				local1 = local10;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class1_Sub24();
			local1.anInt4100 = arg3;
			local1.anInt4096 = arg6;
			local1.anInt4089 = arg1;
			local1.anInt4087 = arg7;
			Static185.method3078(local1);
			Static159.aClass91_19.method3151(local1);
		}
		local1.anInt4098 = arg4;
		local1.anInt4093 = arg5;
		local1.anInt4094 = arg8;
		local1.anInt4085 = arg0;
		local1.anInt4101 = arg2;
	}
}
