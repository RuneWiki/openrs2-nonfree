import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "[I")
	public static int[] anIntArray536;

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
	public static int anInt6995;

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "Z")
	public static boolean aBoolean618 = false;

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "[I")
	public static final int[] anIntArray537 = new int[4096];

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
	public static int anInt6992 = 0;

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "Z")
	public static boolean aBoolean619 = false;

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[100];

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!sc;)[Lclient!od;")
	public static Class147[] method5800(@OriginalArg(1) Class179 arg0) {
		if (!arg0.method4874()) {
			return new Class147[0];
		}
		@Pc(16) Class26 local16 = arg0.method4897();
		while (local16.anInt484 == 0) {
			Static248.method4401(10L);
		}
		if (local16.anInt484 == 2) {
			return new Class147[0];
		}
		@Pc(47) int[] local47 = (int[]) local16.anObject1;
		@Pc(53) Class147[] local53 = new Class147[local47.length >> 2];
		for (@Pc(55) int local55 = 0; local55 < local53.length; local55++) {
			@Pc(61) Class147 local61 = new Class147();
			local53[local55] = local61;
			local61.anInt4940 = local47[local55 << 2];
			local61.anInt4943 = local47[(local55 << 2) + 1];
			local61.anInt4945 = local47[(local55 << 2) + 2];
			local61.anInt4944 = local47[(local55 << 2) + 3];
		}
		return local53;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method5806(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
