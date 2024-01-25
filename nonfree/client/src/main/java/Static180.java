import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!li", name = "b", descriptor = "I")
	public static final int anInt3862 = 12;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "[I")
	public static final int[] anIntArray265 = new int[5];

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	public static int anInt3865 = 0;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)I")
	public static int method3224() {
		@Pc(10) Class198 local10 = Static336.aClass198_61;
		synchronized (Static336.aClass198_61) {
			return Static336.aClass198_61.method5235();
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!ir;ILclient!ir;)V")
	public static void method3226(@OriginalArg(0) Class100 arg0, @OriginalArg(2) Class100 arg1) {
		Static283.aClass100_90 = arg0;
		Static149.aClass100_66 = arg1;
	}
}
