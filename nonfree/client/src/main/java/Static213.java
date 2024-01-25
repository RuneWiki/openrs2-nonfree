import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
	public static int anInt4078 = 0;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I[Lclient!or;Z)V")
	public static void method3715(@OriginalArg(0) int arg0, @OriginalArg(1) Class260[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class260 local17 = arg1[local11];
			if (local17 != null && arg0 == local17.anInt6993 && !Static79.method1512(local17)) {
				if (local17.anInt7003 == 0) {
					method3715(local17.anInt6930, arg1);
					if (local17.aClass260Array2 != null) {
						method3715(local17.anInt6930, local17.aClass260Array2);
					}
					@Pc(58) Class3_Sub46 local58 = (Class3_Sub46) Static455.aClass83_31.method2368((long) local17.anInt6930);
					if (local58 != null) {
						Static548.method7838(local58.anInt7855);
					}
				}
				if (local17.anInt7003 == 6 && local17.anInt6927 != -1) {
					@Pc(79) Class372 local79 = Static243.aClass343_3.method8356(local17.anInt6927);
					if (local79 != null) {
						local17.anInt6988 += Static619.anInt10674;
						@Pc(90) int local90 = local17.anInt6954;
						while (local17.anInt6988 > local79.anIntArray900[local17.anInt6954]) {
							local17.anInt6988 -= local79.anIntArray900[local17.anInt6954];
							local17.anInt6954++;
							if (local79.anIntArray901.length <= local17.anInt6954) {
								local17.anInt6954 -= local79.anInt10256;
								if (local17.anInt6954 < 0 || local17.anInt6954 >= local79.anIntArray901.length) {
									local17.anInt6954 = 0;
								}
							}
							local17.anInt6982 = local17.anInt6954 + 1;
							if (local79.anIntArray901.length <= local17.anInt6982) {
								local17.anInt6982 -= local79.anInt10256;
								if (local17.anInt6982 < 0 || local17.anInt6982 >= local79.anIntArray901.length) {
									local17.anInt6982 = -1;
								}
							}
							Static456.method8151(local17);
						}
						if (local17.anInt6954 != local90) {
							Static639.method8891(local17.anInt6954, local79);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
	public static void method3716() {
		Static90.aClass13_18.L(Static438.anInt6925, Static24.aClass3_Sub22_4.aClass6_Sub5_1.method2797() == 1 ? Static297.anInt4985 + 256 << 2 : -1, 0);
	}
}
