import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIII)V")
	public static void method8365(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub2_Sub4 local8 = Static566.method7763(arg1, 4);
		local8.method662();
		local8.anInt823 = arg0;
		local8.anInt821 = arg3;
		local8.anInt817 = arg2;
	}
}
