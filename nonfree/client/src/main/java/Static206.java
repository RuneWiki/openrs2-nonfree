import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "Lclient!jv;")
	public static final Class191 aClass191_2 = new Class191();

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
	public static int anInt3998 = 0;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V")
	public static void method3478() {
		if (Static392.aClass373_6 != Static472.aClass373_7) {
			try {
				Static655.method4698("tbrefresh", Static509.aClient1);
			} catch (@Pc(23) Throwable local23) {
			}
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZZI)I")
	public static int method3479(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub43 local13 = Static95.method1915(arg1, arg2);
		if (local13 == null) {
			return 0;
		} else if (arg0 >= 0 && local13.anIntArray672.length > arg0) {
			return local13.anIntArray672[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IILclient!wp;ZI)V")
	public static void method3480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub50 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 << 14 | arg1 << 28 | arg0);
		@Pc(22) Class2_Sub23 local22 = (Class2_Sub23) Static263.aClass323_18.method7484(local16);
		if (local22 == null) {
			local22 = new Class2_Sub23();
			Static263.aClass323_18.method7477(local22, local16);
			local22.aClass114_22.method2771(arg2);
			return;
		}
		@Pc(45) Class327 local45 = Static470.aClass250_1.method5960(arg2.anInt10421);
		@Pc(48) int local48 = local45.anInt8747;
		if (local45.anInt8756 == 1) {
			local48 *= arg2.anInt10422 + 1;
		}
		for (@Pc(65) Class2_Sub50 local65 = (Class2_Sub50) local22.aClass114_22.method2772(); local65 != null; local65 = (Class2_Sub50) local22.aClass114_22.method2762()) {
			local45 = Static470.aClass250_1.method5960(local65.anInt10421);
			@Pc(76) int local76 = local45.anInt8747;
			if (local45.anInt8756 == 1) {
				local76 *= local65.anInt10422 + 1;
			}
			if (local76 < local48) {
				Static296.method4688(local65, arg2);
				return;
			}
		}
		local22.aClass114_22.method2771(arg2);
	}
}
