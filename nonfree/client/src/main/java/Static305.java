import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static305 {

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "[Lclient!tb;")
	public static Class49[] aClass49Array9;

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "Lclient!ob;")
	public static Class260 aClass260_2;

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
	public static int anInt6023 = 0;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(BLclient!hh;)I")
	public static int method5428(@OriginalArg(1) Class155 arg0) {
		if (Static265.aClass155_24 == arg0) {
			return 6407;
		} else if (Static432.aClass155_45 == arg0) {
			return 6408;
		} else if (arg0 == Static212.aClass155_46) {
			return 6406;
		} else if (Static290.aClass155_60 == arg0) {
			return 6409;
		} else if (Static487.aClass155_62 == arg0) {
			return 6410;
		} else if (Static522.aClass155_50 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(Z)J")
	public static long method5430() {
		return Static125.aClass29_1.method8356();
	}
}
