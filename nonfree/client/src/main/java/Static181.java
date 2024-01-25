import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gfa", name = "k", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_59 = new Class145(46, 3);

	@OriginalMember(owner = "client!gfa", name = "m", descriptor = "Lclient!ria;")
	public static Class303 aClass303_9 = null;

	@OriginalMember(owner = "client!gfa", name = "p", descriptor = "I")
	public static int anInt3623 = 0;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BIII)V")
	public static void method3101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static188.method3210(11, arg0);
		local8.method925();
		local8.anInt855 = arg2;
		local8.anInt852 = arg1;
	}
}
