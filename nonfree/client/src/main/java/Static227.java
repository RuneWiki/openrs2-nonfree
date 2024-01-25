import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "I")
	public static int anInt3689;

	@OriginalMember(owner = "client!hka", name = "c", descriptor = "Lclient!uu;")
	public static final Class359 aClass359_2 = new Class359();

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(III)V")
	public static void method3223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static260.aClass174ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static577.method8285(local7.aClass8_Sub1_Sub4_2);
		Static577.method8285(local7.aClass8_Sub1_Sub4_1);
		if (local7.aClass8_Sub1_Sub4_2 != null) {
			local7.aClass8_Sub1_Sub4_2 = null;
		}
		if (local7.aClass8_Sub1_Sub4_1 != null) {
			local7.aClass8_Sub1_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(IIBII)V")
	public static void method3224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		if (arg3 <= arg0) {
			for (local19 = arg3; local19 < arg0; local19++) {
				Static569.anIntArrayArray54[local19][arg1] = arg2;
			}
		} else {
			for (local19 = arg0; local19 < arg3; local19++) {
				Static569.anIntArrayArray54[local19][arg1] = arg2;
			}
		}
	}
}
