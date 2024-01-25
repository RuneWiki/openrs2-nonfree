import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "Lclient!nd;")
	public static Class238 aClass238_220;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "[I")
	public static final int[] anIntArray556 = new int[8];

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "[I")
	public static final int[] anIntArray557 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!nd;Lclient!bl;ZLclient!nd;Lclient!nd;Lclient!cea;)Z")
	public static boolean method6768(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) Class238 arg2, @OriginalArg(4) Class238 arg3, @OriginalArg(5) Class2_Sub11_Sub1 arg4) {
		Static355.aClass238_163 = arg2;
		Static464.aClass39_3 = arg1;
		Static318.aClass238_145 = arg3;
		Static347.aClass238_277 = arg0;
		Static264.anIntArray299 = new int[16];
		Static191.aClass2_Sub11_Sub1_2 = arg4;
		for (@Pc(18) int local18 = 0; local18 < 16; local18++) {
			Static264.anIntArray299[local18] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)Lclient!lk;")
	public static Class2_Sub31 method6770() {
		return Static599.anInt9925 == 0 ? new Class2_Sub31() : Static494.aClass2_Sub31Array1[--Static599.anInt9925];
	}
}
