import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_103 = new Class32("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!wl", name = "v", descriptor = "Z")
	public static boolean aBoolean466 = false;

	@OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
	public static int anInt6554 = 0;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!nl;ILclient!nl;)V")
	public static void method5621(@OriginalArg(0) Class171 arg0, @OriginalArg(2) Class171 arg1) {
		Static125.aClass171_36 = arg1;
		Static68.aClass171_26 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)Lclient!ha;")
	public static Class89 method5623(@OriginalArg(0) int arg0) {
		@Pc(8) Class89[] local8 = Static206.method3480();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class89 local16 = local8[local10];
			if (arg0 == local16.anInt2589) {
				return local16;
			}
		}
		return null;
	}
}
