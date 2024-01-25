import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_20 = new Class73(121, -1);

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_10 = new Class94(8);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZZIZI)I")
	public static int method1776(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class6_Sub6 local10 = Static612.method8391(arg1, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray33.length; local18++) {
			if (local10.anIntArray33[local18] >= 0 && Static356.aClass221_1.anInt7082 > local10.anIntArray33[local18]) {
				@Pc(47) Class306 local47 = Static356.aClass221_1.method5923(local10.anIntArray33[local18]);
				@Pc(57) int local57 = local47.method7408(arg2, Static69.aClass369_1.method8523(arg2).anInt5972);
				if (arg0) {
					local16 += local10.anIntArray32[local18] * local57;
				} else {
					local16 += local57;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!ni;I)Lclient!lv;")
	public static Class192 method1779(@OriginalArg(2) Class223 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method5954(0, arg1);
		return local9 == null ? null : new Class192(local9);
	}
}
