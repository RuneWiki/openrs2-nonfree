import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "[I")
	public static int[] anIntArray907;

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_209 = new Class180(43, 3);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IZI)Z")
	public static boolean method8982(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Lclient!gs;")
	public static Class125 method8984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static15.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass125_2;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
	public static void method8985() {
		if (!Static470.aBoolean587) {
			Static577.aFloat226 += (12.0F - Static577.aFloat226) / 2.0F;
			Static214.aBoolean310 = true;
			Static470.aBoolean587 = true;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZZLclient!qb;I)V")
	public static void method8986(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class3_Sub46 arg2) {
		@Pc(8) int local8 = arg2.anInt7855;
		@Pc(12) int local12 = (int) arg2.aLong311;
		arg2.method9380();
		if (arg1) {
			Static344.method5168(local8);
		}
		Static165.method8798(local8);
		@Pc(29) Class260 local29 = Static383.method5492(local12);
		if (local29 != null) {
			Static456.method8151(local29);
		}
		Static611.method8671();
		if (!arg0 && Static110.anInt2265 != -1) {
			Static610.method8667(1, Static110.anInt2265);
		}
		@Pc(58) Class394 local58 = new Class394(Static455.aClass83_31);
		for (@Pc(63) Class3_Sub46 local63 = (Class3_Sub46) local58.method9370(); local63 != null; local63 = (Class3_Sub46) local58.method9366()) {
			if (!local63.method9378()) {
				local63 = (Class3_Sub46) local58.method9370();
				if (local63 == null) {
					return;
				}
			}
			if (local63.anInt7850 == 3) {
				@Pc(87) int local87 = (int) local63.aLong311;
				if (local8 == local87 >>> 16) {
					method8986(arg0, true, local63);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB)V")
	public static void method8987(@OriginalArg(0) int arg0) {
		Static88.anInt1725 = -1;
		Static90.anInt10121 = arg0;
		Static88.anInt1725 = -1;
		Static496.method7118();
	}
}
