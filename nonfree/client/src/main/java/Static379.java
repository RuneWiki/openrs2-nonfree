import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!nw", name = "r", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_71 = new Class257(56, 4);

	@OriginalMember(owner = "client!nw", name = "t", descriptor = "[I")
	public static final int[] anIntArray398 = new int[14];

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)Lclient!m;")
	public static Class8_Sub35 method6033() {
		if (Static110.aClass43_49 == null || Static356.aClass307_1 == null) {
			return null;
		}
		for (@Pc(21) Class8_Sub35 local21 = (Class8_Sub35) Static356.aClass307_1.method7375(); local21 != null; local21 = (Class8_Sub35) Static356.aClass307_1.method7375()) {
			@Pc(31) Class17 local31 = Static110.aClass12_3.method136(local21.anInt6533);
			if (local31 != null && local31.aBoolean76 && local31.method764(Static110.anInterface17_2)) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)Z")
	public static boolean method6034(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZLclient!ig;)Lclient!sv;")
	public static Class196_Sub1 method6038(@OriginalArg(1) Class8_Sub8 arg0) {
		@Pc(12) Class196 local12 = Static22.method904(arg0);
		@Pc(16) int local16 = arg0.method8561();
		return new Class196_Sub1(local12.anInt9132, local12.aClass173_11, local12.aClass60_10, local12.anInt9127, local12.anInt9129, local16);
	}
}
