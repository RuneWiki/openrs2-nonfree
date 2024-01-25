import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(B)Lclient!jha;")
	public static Class67_Sub1 method5087() {
		Static423.anInt7805 = 0;
		return Static588.method8113();
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "([BB)V")
	public static void method5088(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class6_Sub8 local10 = new Class6_Sub8(arg0);
		@Pc(12) boolean local12 = false;
		while (true) {
			while (true) {
				@Pc(20) int local20 = local10.method8246();
				if (local20 == 0) {
					if (local12) {
						return;
					}
					if (Static113.anIntArray107 == null) {
						Static616.anInt10413 = 4;
						Static416.anIntArray384 = new int[4];
						Static113.anIntArray107 = new int[4];
					}
					for (local20 = 0; local20 < Static113.anIntArray107.length; local20++) {
						Static113.anIntArray107[local20] = 0;
						Static416.anIntArray384[local20] = local20 * 20;
					}
					return;
				}
				if (local20 == 1) {
					if (Static113.anIntArray107 == null) {
						Static416.anIntArray384 = new int[4];
						Static616.anInt10413 = 4;
						Static113.anIntArray107 = new int[4];
					}
					for (@Pc(39) int local39 = 0; local39 < Static113.anIntArray107.length; local39++) {
						Static113.anIntArray107[local39] = local10.method8231();
						Static416.anIntArray384[local39] = local10.method8231();
					}
					local12 = true;
				} else if (local20 == 2) {
					Static151.anInt3538 = local10.method8220();
				} else if (local20 == 3) {
					Static616.anInt10413 = local10.method8246();
					Static113.anIntArray107 = new int[Static616.anInt10413];
					Static416.anIntArray384 = new int[Static616.anInt10413];
				}
			}
		}
	}
}
