import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
	public static int anInt3611;

	@OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
	public static int anInt3612;

	@OriginalMember(owner = "client!ab", name = "R", descriptor = "Lclient!ha;")
	public static Class33 aClass33_5;

	@OriginalMember(owner = "client!ab", name = "L", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_85 = new Class151(53, 6);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BII)V")
	public static void method3320(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class4_Sub5_Sub11 local17 = Static652.method8695((long) arg1, 17);
		local17.method3955();
		local17.anInt4427 = arg0;
	}
}
