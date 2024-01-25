import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
	public static int anInt9677 = -1;

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Lclient!ki;")
	public static final Class183 aClass183_58 = new Class183();

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "F")
	public static float aFloat188 = 0.0F;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_141 = new Class276(28, 8);

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
	public static int anInt9681 = 0;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "[I")
	public static final int[] anIntArray644 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "Lclient!ol;")
	public static final Class245 aClass245_4 = new Class245();

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!oa;J)V")
	public static void method7862(@OriginalArg(1) Class15 arg0, @OriginalArg(2) long arg1) {
		Static589.anInt10307 = Static518.anInt9484;
		Static217.anInt4435 = 0;
		Static65.anInt1698 = 0;
		Static518.anInt9484 = 0;
		@Pc(18) long local18 = Static376.method6088();
		for (@Pc(23) Class55_Sub8 local23 = (Class55_Sub8) Static388.aClass134_7.method3233(); local23 != null; local23 = (Class55_Sub8) Static388.aClass134_7.method3230()) {
			if (local23.method7117(arg0, arg1)) {
				Static65.anInt1698++;
			}
		}
		if (Static262.aBoolean480 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static388.aClass134_7.method3229() + ", running: " + Static65.anInt1698);
			System.out.println("Emitters: " + Static217.anInt4435 + " Particles: " + Static518.anInt9484 + ". Time taken: " + (Static376.method6088() - local18) + "ms");
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lclient!uaa;")
	public static Class320 method7863(@OriginalArg(0) int arg0) {
		@Pc(13) Class320[] local13 = Static298.method4995();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class320 local21 = local13[local15];
			if (local21.anInt9515 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
