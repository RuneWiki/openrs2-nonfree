import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_108 = new Class145(10, 6);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V")
	public static void method5387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static188.method3210(4, arg1);
		local8.method925();
		local8.anInt855 = arg0;
		local8.anInt852 = arg2;
		local8.anInt858 = arg3;
	}
}
