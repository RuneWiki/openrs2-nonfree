import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
	public static int anInt6340;

	@OriginalMember(owner = "client!sj", name = "L", descriptor = "Lclient!qc;")
	public static Class2_Sub18_Sub4 aClass2_Sub18_Sub4_2;

	@OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
	public static int anInt6338 = -1;

	@OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
	public static int anInt6341 = 0;

	@OriginalMember(owner = "client!sj", name = "K", descriptor = "[I")
	public static final int[] anIntArray425 = new int[2];

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BI)V")
	public static void method5030(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub2_Sub2 local14 = Static15.method236(arg0, 8);
		local14.method435();
	}
}
