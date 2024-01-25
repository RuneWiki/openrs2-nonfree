import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static281 {

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "Z")
	public static boolean aBoolean409;

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "Lclient!wia;")
	public static Class389 aClass389_1;

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
	public static final int anInt5254 = 1407;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)Lclient!po;")
	public static Class281 method4450(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static574.aFloat183 == 3.0D) {
				return Static644.aClass281_10;
			}
			if ((double) Static574.aFloat183 == 4.0D) {
				return Static219.aClass281_8;
			}
			if ((double) Static574.aFloat183 == 6.0D) {
				return Static374.aClass281_6;
			}
			if ((double) Static574.aFloat183 >= 8.0D) {
				return Static140.aClass281_1;
			}
		} else if (arg0 == 1) {
			if ((double) Static574.aFloat183 == 3.0D) {
				return Static374.aClass281_6;
			}
			if ((double) Static574.aFloat183 == 4.0D) {
				return Static140.aClass281_1;
			}
			if ((double) Static574.aFloat183 == 6.0D) {
				return Static146.aClass281_2;
			}
			if ((double) Static574.aFloat183 >= 8.0D) {
				return Static280.aClass281_5;
			}
		} else if (arg0 == 2) {
			if ((double) Static574.aFloat183 == 3.0D) {
				return Static146.aClass281_2;
			}
			if ((double) Static574.aFloat183 == 4.0D) {
				return Static280.aClass281_5;
			}
			if ((double) Static574.aFloat183 == 6.0D) {
				return Static575.aClass281_9;
			}
			if ((double) Static574.aFloat183 >= 8.0D) {
				return Static195.aClass281_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IBI)Z")
	public static boolean method4451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
