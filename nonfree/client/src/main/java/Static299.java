import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!kaa", name = "i", descriptor = "Lclient!hu;")
	public static Class157 aClass157_4;

	@OriginalMember(owner = "client!kaa", name = "j", descriptor = "Z")
	public static final boolean aBoolean349 = false;

	@OriginalMember(owner = "client!kaa", name = "l", descriptor = "Z")
	public static boolean aBoolean350 = false;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
	public static void method4204() {
		for (@Pc(12) int local12 = 0; local12 < Static655.anInt10336; local12++) {
			@Pc(18) Class129 local18 = Static665.aClass129Array1[local12];
			if (local18.aByte33 == 3) {
				if (local18.aClass4_Sub3_Sub3_1 == null) {
					local18.anInt3085 = Integer.MIN_VALUE;
				} else {
					Static162.aClass4_Sub3_Sub5_3.method7723(local18.aClass4_Sub3_Sub3_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIB)Z")
	public static boolean method4205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static481.method6598(arg1, arg0) & Static393.method5070(arg0, arg1);
	}
}
