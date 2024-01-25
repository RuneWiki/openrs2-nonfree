import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!jfa", name = "v", descriptor = "Lclient!wia;")
	public static Class386 aClass386_69;

	@OriginalMember(owner = "client!jfa", name = "w", descriptor = "[I")
	public static final int[] anIntArray383 = new int[250];

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(II)I")
	public static int method3963(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BLclient!nq;)Z")
	public static boolean method3964(@OriginalArg(1) Interface19 arg0) {
		@Pc(18) Class203 local18 = Static511.aClass13_2.method86(arg0.method9171());
		if (local18.anInt6019 == -1) {
			return true;
		} else {
			@Pc(31) Class221 local31 = Static313.aClass83_6.method2081(local18.anInt6019);
			return local31.anInt6395 == -1 ? true : local31.method5296();
		}
	}
}
