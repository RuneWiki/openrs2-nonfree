import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	public static int anInt5538;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "J")
	public static long aLong150;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!fha;")
	public static final Class101 aClass101_12 = new Class101(5, 3);

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Z")
	public static boolean aBoolean439 = false;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLclient!mu;)Z")
	public static boolean method4574(@OriginalArg(1) Class212 arg0) {
		return arg0 == Static283.aClass212_16 || arg0 == Static199.aClass212_6 || Static375.aClass212_15 == arg0 || arg0 == Static259.aClass212_13;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIB)Z")
	public static boolean method4575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) boolean local22 = (arg0 & 0x37) == 0 ? Static290.method5003(arg0, arg1) : Static593.method8180(arg1, arg0);
		return local22 | Static531.method7545(arg0, arg1) | (arg1 & 0x10000) != 0;
	}
}
