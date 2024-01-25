import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	public static int anInt5391;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
	public static int anInt5390 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)I")
	public static int method4575() {
		return Static61.anIntArray145 == null ? 0 : Static61.anIntArray145.length * 2;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
	public static void method4576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static309.aClass100ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass10_Sub4_1 != null) {
			local7.aClass10_Sub4_1 = null;
		}
		if (local7.aClass10_Sub4_2 != null) {
			local7.aClass10_Sub4_2 = null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZIIIBIII)Z")
	public static boolean method4577(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray653[0];
		@Pc(13) int local13 = Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray654[0];
		if (local8 < 0 || Static38.anInt740 <= local8 || local13 < 0 || Static38.anInt741 <= local13) {
			return false;
		} else if (arg5 >= 0 && Static38.anInt740 > arg5 && arg4 >= 0 && arg4 < Static38.anInt741) {
			@Pc(70) int local70 = Static208.method3673(local8, arg0, arg5, arg1, local13, arg2, Static15.aClass84Array1[Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101], Static129.aClass10_Sub1_Sub2_Sub2_1.method7021(), arg6, arg4, arg3, arg7, Static475.anIntArray637, Static556.anIntArray591);
			if (local70 < 1) {
				return false;
			}
			Static319.anInt5739 = Static556.anIntArray591[local70 - 1];
			Static435.anInt7462 = Static475.anIntArray637[local70 - 1];
			Static357.aBoolean462 = false;
			Static52.method798();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZI)V")
	public static void method4578(@OriginalArg(2) boolean arg0) {
		Static379.anInt7010 = 22050;
		Static461.anInt7817 = 2;
		Static558.aBoolean667 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)Lclient!pe;")
	public static Class26_Sub6 method4579(@OriginalArg(1) int arg0) {
		@Pc(7) Class8[] local7 = Class4_Sub20.aClass8Array1;
		synchronized (Class4_Sub20.aClass8Array1) {
			@Pc(23) Class26_Sub6 local23;
			if (arg0 >= Class4_Sub20.aClass8Array1.length || Class4_Sub20.aClass8Array1[arg0].method112()) {
				local23 = new Class26_Sub6();
				local23.aClass26_Sub5Array1 = new Class26_Sub5[arg0];
				for (@Pc(29) int local29 = 0; local29 < arg0; local29++) {
					local23.aClass26_Sub5Array1[local29] = new Class26_Sub5();
				}
			} else {
				local23 = (Class26_Sub6) Class4_Sub20.aClass8Array1[arg0].method107();
				local23.method7575();
				@Pc(58) int local58 = Static436.anIntArray613[arg0]--;
			}
			return local23;
		}
	}
}
