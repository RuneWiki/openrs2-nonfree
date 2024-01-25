import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static394 {

	@OriginalMember(owner = "client!oba", name = "K", descriptor = "I")
	public static int anInt6214 = 0;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)Lclient!cj;")
	public static Class55 method5391(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static193.aFloat15 == 3.0D) {
				return Static349.aClass55_5;
			}
			if ((double) Static193.aFloat15 == 4.0D) {
				return Static468.aClass55_7;
			}
			if ((double) Static193.aFloat15 == 6.0D) {
				return Static493.aClass55_8;
			}
			if ((double) Static193.aFloat15 >= 8.0D) {
				return Static442.aClass55_6;
			}
		} else if (arg0 == 1) {
			if ((double) Static193.aFloat15 == 3.0D) {
				return Static493.aClass55_8;
			}
			if ((double) Static193.aFloat15 == 4.0D) {
				return Static442.aClass55_6;
			}
			if ((double) Static193.aFloat15 == 6.0D) {
				return Static301.aClass55_4;
			}
			if ((double) Static193.aFloat15 >= 8.0D) {
				return Static293.aClass55_3;
			}
		} else if (arg0 == 2) {
			if ((double) Static193.aFloat15 == 3.0D) {
				return Static301.aClass55_4;
			}
			if ((double) Static193.aFloat15 == 4.0D) {
				return Static293.aClass55_3;
			}
			if ((double) Static193.aFloat15 == 6.0D) {
				return Static253.aClass55_2;
			}
			if ((double) Static193.aFloat15 >= 8.0D) {
				return Static245.aClass55_1;
			}
		}
		return null;
	}
}
