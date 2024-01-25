import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "Lclient!bp;")
	public static Class26 aClass26_12;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "([[[Lclient!we;I)V")
	public static void method5698(@OriginalArg(0) Class213[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class213[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class213 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass10_Sub5_1 instanceof Interface7) {
							((Interface7) local23.aClass10_Sub5_1).method4065();
						}
						if (local23.aClass10_Sub4_1 instanceof Interface7) {
							((Interface7) local23.aClass10_Sub4_1).method4065();
						}
						if (local23.aClass10_Sub4_2 instanceof Interface7) {
							((Interface7) local23.aClass10_Sub4_2).method4065();
						}
						if (local23.aClass10_Sub2_2 instanceof Interface7) {
							((Interface7) local23.aClass10_Sub2_2).method4065();
						}
						if (local23.aClass10_Sub2_1 instanceof Interface7) {
							((Interface7) local23.aClass10_Sub2_1).method4065();
						}
						for (@Pc(75) Class81 local75 = local23.aClass81_4; local75 != null; local75 = local75.aClass81_3) {
							@Pc(80) Class10_Sub3 local80 = local75.aClass10_Sub3_1;
							if (local80 instanceof Interface7) {
								((Interface7) local80).method4065();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)Lclient!br;")
	public static Class14_Sub5 method5699() {
		if (Static241.aClass18_35 == null || Static50.aClass165_1 == null) {
			return null;
		}
		for (@Pc(16) Class14_Sub5 local16 = (Class14_Sub5) Static50.aClass165_1.method4355(); local16 != null; local16 = (Class14_Sub5) Static50.aClass165_1.method4355()) {
			@Pc(28) Class52 local28 = Static247.method4306(local16.anInt725);
			if (local28 != null && local28.aBoolean113 && local28.method1767()) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILclient!lf;)V")
	public static void method5700(@OriginalArg(0) int arg0, @OriginalArg(1) Class114 arg1) {
		Static158.aClass114Array2[arg0] = arg1;
	}
}
