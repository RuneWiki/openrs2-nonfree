import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
	public static int anInt10929;

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "F")
	public static float aFloat214;

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_163 = new Class171(94, 7);

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "[I")
	public static final int[] anIntArray631 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "Z")
	public static boolean aBoolean757 = false;

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "Z")
	public static boolean aBoolean758 = false;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZB)V")
	public static void method9017(@OriginalArg(0) boolean arg0) {
		@Pc(5) int local5 = Static166.anInt3035;
		@Pc(7) int local7 = Static64.anInt1323;
		if (arg0 && Static375.aBoolean532) {
			local5 <<= 0x1;
			local7 = -local5;
		}
		Static119.aClass95_4.f(local7, local5);
	}
}
