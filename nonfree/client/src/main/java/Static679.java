import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static679 {

	@OriginalMember(owner = "client!za", name = "l", descriptor = "I")
	public static int anInt10636;

	@OriginalMember(owner = "client!za", name = "m", descriptor = "I")
	public static int anInt10637;

	@OriginalMember(owner = "client!za", name = "j", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_159 = new Class216(19, 3);

	@OriginalMember(owner = "client!za", name = "k", descriptor = "Lclient!lf;")
	public static final Class210 aClass210_19 = new Class210(1, 2);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([BI)Z")
	public static boolean method9004(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub11 local8 = new Class4_Sub11(arg0);
		@Pc(12) int local12 = local8.method8865();
		if (local12 != 2) {
			return false;
		}
		@Pc(30) boolean local30 = local8.method8865() == 1;
		if (local30) {
			Static476.method6544(local8);
		}
		Static24.method562(local8);
		return true;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(ZZ)V")
	public static void method9005(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = Static248.anInt4083;
		@Pc(12) int local12 = Static610.anInt9363;
		if (arg0 && Static499.aBoolean608) {
			local10 <<= 0x1;
			local12 = -local10;
		}
		Static582.aClass33_13.f(local12, local10);
	}
}
