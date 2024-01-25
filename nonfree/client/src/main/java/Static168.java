import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Lclient!qs;")
	public static Class196 aClass196_2;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "[Lclient!dp;")
	public static Class51[] aClass51Array11;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
	public static void method2470() {
		@Pc(1) Class227 local1 = Static109.aClass227_16;
		synchronized (Static109.aClass227_16) {
			Static109.aClass227_16.method4859(5);
		}
		@Pc(27) Class227 local27 = Static366.aClass227_46;
		synchronized (Static366.aClass227_46) {
			Static366.aClass227_46.method4859(5);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	public static void method2472(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub6_Sub11 local8 = Static295.method4455(arg0, 11);
		local8.method3004();
		local8.anInt3686 = arg1;
		local8.anInt3679 = arg2;
	}
}
