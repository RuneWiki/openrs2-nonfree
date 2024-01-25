import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "Lclient!tj;")
	public static final Class357 aClass357_10 = new Class357();

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!wka;IZI[I)V")
	public static void method2903(@OriginalArg(0) Class19_Sub1_Sub3_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg0.anIntArray425 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg0.anIntArray425.length; local12++) {
				if (arg0.anIntArray425[local12] != arg3[local12]) {
					local10 = false;
					break;
				}
			}
			@Pc(39) Class100 local39 = arg0.aClass100_9;
			if (local10 && local39.method8963()) {
				@Pc(54) Class26 local54 = arg0.aClass100_9.method8977();
				@Pc(57) int local57 = local54.anInt767;
				if (local57 == 1) {
					local39.method8956(arg2);
				}
				if (local57 == 2) {
					local39.method8957();
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg3.length; local12++) {
			if (arg3[local12] != -1) {
				local10 = false;
			}
			if (arg0.anIntArray425 == null || arg0.anIntArray425[local12] == -1 || Static59.aClass177_1.method4259(arg3[local12]).anInt768 >= Static59.aClass177_1.method4259(arg0.anIntArray425[local12]).anInt768) {
				arg0.anIntArray425 = arg3;
				arg0.aClass100_9.method8964(arg2);
				if (arg1) {
					arg0.anInt7822 = arg0.anInt7824;
				}
			}
		}
		if (!local10) {
			return;
		}
		arg0.anIntArray425 = arg3;
		arg0.aClass100_9.method8964(arg2);
		if (arg1) {
			arg0.anInt7822 = arg0.anInt7824;
			return;
		}
	}
}
