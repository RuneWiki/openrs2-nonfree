import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
	public static int anInt11044 = -1;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "[I")
	public static final int[] anIntArray714 = new int[13];

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IILclient!d;Ljava/awt/Canvas;I)Lclient!ha;")
	public static Class20 method9214(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3) {
		return new oa(arg2, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method9215(@OriginalArg(1) String arg0) {
		if (Static427.aClass132Array1 != null) {
			@Pc(15) Class2_Sub52 local15 = Static130.method3019(Static136.aClass94_32, Static361.aClass183_1);
			local15.aClass2_Sub11_Sub2_7.method8374(Static296.method5291(arg0));
			local15.aClass2_Sub11_Sub2_7.method8329(arg0);
			Static96.method2563(local15);
		}
	}
}
