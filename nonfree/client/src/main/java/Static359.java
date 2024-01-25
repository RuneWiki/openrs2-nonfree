import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static359 {

	@OriginalMember(owner = "client!ofa", name = "v", descriptor = "Z")
	public static boolean aBoolean432 = true;

	@OriginalMember(owner = "client!ofa", name = "x", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_82 = new Class160(32, 2);

	@OriginalMember(owner = "client!ofa", name = "A", descriptor = "Lclient!nn;")
	public static final Class216 aClass216_13 = new Class216(13, 19);

	@OriginalMember(owner = "client!ofa", name = "C", descriptor = "Lclient!kca;")
	public static final Class168 aClass168_4 = new Class168();

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ILclient!d;)V")
	public static void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1) {
		Static285.aClass60Array8[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III)Z")
	public static boolean method5335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static305.method4677(arg0, arg1) | (arg0 & 0x70000) != 0 || Static123.method1856(arg0, arg1);
	}
}
