import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Lclient!fl;")
	public static Class116 aClass116_2;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_109 = new Class286(93, 7);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "[I")
	public static final int[] anIntArray547 = new int[3];

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[I")
	public static int[] method8342(@OriginalArg(1) int arg0) {
		Static490.method7108(Static330.method4919(arg0));
		return new int[] { Static321.aCalendar10.get(5), Static321.aCalendar10.get(2), Static321.aCalendar10.get(1) };
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!dfa;I)Z")
	public static boolean method8343(@OriginalArg(0) Class68 arg0) {
		return arg0 == null ? false : Static506.method7239(arg0.anInt2188, arg0.anInt2180, arg0.anInt2189 - arg0.anInt2180, arg0.anInt2182, arg0.anInt2184 - arg0.anInt2188, -arg0.anInt2182 + arg0.anInt2178);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	public static void method8345(@OriginalArg(0) byte arg0) {
		for (@Pc(10) Class3_Sub24 local10 = (Class3_Sub24) Static699.aClass136_50.method3509(); local10 != null; local10 = (Class3_Sub24) Static699.aClass136_50.method3506()) {
			Static411.method5564(local10.anInt3357);
		}
		if (arg0 != -80) {
			method8345((byte) 124);
		}
	}
}
