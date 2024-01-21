import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!r", name = "v", descriptor = "Lclient!sg;")
	public static Class5 aClass5_2;

	@OriginalMember(owner = "client!r", name = "r", descriptor = "I")
	public static int anInt3101 = 0;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "I")
	public static int anInt3103 = 0;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "I")
	public static int anInt3105 = 0;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "I")
	public static int anInt3106 = 0;

	@OriginalMember(owner = "client!r", name = "B", descriptor = "[J")
	public static long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
	public static void method2246(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class3_Sub7 local14 = (Class3_Sub7) Static146.aClass16_10.method551(); local14 != null; local14 = (Class3_Sub7) Static146.aClass16_10.method552()) {
			if ((long) arg0 == (local14.aLong183 >> 48 & 0xFFFFL)) {
				local14.method2783();
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)I")
	public static int method2247(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub16 local8 = (Class3_Sub16) Static69.aClass16_6.method554((long) arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < local8.anIntArray306.length; local27++) {
				if (arg1 == local8.anIntArray307[local27]) {
					local25 += local8.anIntArray306[local27];
				}
			}
			return local25;
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	public static void method2248() {
		aClass5_2 = null;
		aLongArray4 = null;
	}
}
