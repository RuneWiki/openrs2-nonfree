import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dda", name = "N", descriptor = "[I")
	public static int[] anIntArray177;

	@OriginalMember(owner = "client!dda", name = "O", descriptor = "I")
	public static int anInt2170;

	@OriginalMember(owner = "client!dda", name = "P", descriptor = "I")
	public static int anInt2171;

	@OriginalMember(owner = "client!dda", name = "G", descriptor = "I")
	public static int anInt2166 = 0;

	@OriginalMember(owner = "client!dda", name = "L", descriptor = "Lclient!h;")
	public static final Class114 aClass114_46 = new Class114("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!dda", name = "Q", descriptor = "I")
	public static final int anInt2172 = 1339;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZLclient!bq;BZ)V")
	public static void method2049(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub5 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(6) int local6 = arg1.anInt1389;
		@Pc(10) int local10 = (int) arg1.aLong244;
		arg1.method7983();
		if (arg2) {
			Static257.method7981(local6);
		}
		Static89.method2161(local6);
		@Pc(25) Class309 local25 = Static80.method2005(local10);
		if (local25 != null) {
			Static291.method4908(local25);
		}
		Static441.method6402();
		if (!arg0 && Static85.anInt2201 != -1) {
			Static16.method808(1, Static85.anInt2201);
		}
		@Pc(52) Class230 local52 = new Class230(Static484.aClass174_32);
		for (@Pc(57) Class1_Sub5 local57 = (Class1_Sub5) local52.method5700(); local57 != null; local57 = (Class1_Sub5) local52.method5702()) {
			if (!local57.method7979()) {
				local57 = (Class1_Sub5) local52.method5700();
				if (local57 == null) {
					return;
				}
			}
			if (local57.anInt1387 == 3) {
				@Pc(80) int local80 = (int) local57.aLong244;
				if (local6 == local80 >>> 16) {
					method2049(arg0, local57, true);
				}
			}
		}
	}
}
