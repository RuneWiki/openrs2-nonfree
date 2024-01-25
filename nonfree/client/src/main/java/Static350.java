import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static350 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!gga;I)I")
	public static int method5648(@OriginalArg(0) Class117 arg0) {
		if (Static379.aClass117_7 == arg0) {
			return 7681;
		} else if (arg0 == Static573.aClass117_9) {
			return 8448;
		} else if (arg0 == Static435.aClass117_8) {
			return 34165;
		} else if (arg0 == Static341.aClass117_4) {
			return 260;
		} else if (Static463.aClass117_6 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)I")
	public static int method5649() {
		if ((double) Static455.aFloat120 == 3.0D) {
			return 37;
		} else if ((double) Static455.aFloat120 == 4.0D) {
			return 50;
		} else if ((double) Static455.aFloat120 == 6.0D) {
			return 75;
		} else if ((double) Static455.aFloat120 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLclient!jn;Lclient!jn;I)V")
	public static void method5650(@OriginalArg(1) Class176 arg0, @OriginalArg(2) Class176 arg1) {
		Static512.aClass176_126 = arg1;
		Static307.aClass176_80 = arg0;
	}
}
