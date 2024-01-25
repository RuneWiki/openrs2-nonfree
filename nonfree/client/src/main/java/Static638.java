import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!wp", name = "E", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_170 = new Class337(0, 4);

	@OriginalMember(owner = "client!wp", name = "L", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_171 = new Class337(65, -2);

	@OriginalMember(owner = "client!wp", name = "M", descriptor = "Lclient!pfa;")
	public static final Class269 aClass269_1 = new Class269();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIZ)V")
	public static void method9004(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		Static41.method748(arg1, Static174.aClass120_12.method2690(Static266.anInt4796), arg0);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BIIII)V")
	public static void method9005(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(4, arg1);
		local8.method8958();
		local8.anInt10537 = arg0;
		local8.anInt10530 = arg2;
		local8.anInt10533 = arg3;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!la;)V")
	public static void method9006(@OriginalArg(1) Class207 arg0) {
		Static286.aClass207_63 = arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZI)I")
	public static int method9007(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static432.method6588(arg0);
	}
}
