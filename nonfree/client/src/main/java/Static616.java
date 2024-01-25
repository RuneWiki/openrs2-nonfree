import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!w", name = "D", descriptor = "Lclient!sv;")
	public static Class326 aClass326_11;

	@OriginalMember(owner = "client!w", name = "y", descriptor = "Lclient!fha;")
	public static final Class109 aClass109_73 = new Class109();

	@OriginalMember(owner = "client!w", name = "J", descriptor = "[S")
	public static short[] aShortArray146 = new short[256];

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)[Lclient!jf;")
	public static Class168[] method8276() {
		return new Class168[] { Static4.aClass168_1, Static476.aClass168_11, Static184.aClass168_5, Static204.aClass168_6, Static368.aClass168_9, Static137.aClass168_3, Static392.aClass168_10, Static184.aClass168_4, Static548.aClass168_13, Static60.aClass168_2, Static548.aClass168_12, Static554.aClass168_14, Static312.aClass168_8, Static259.aClass168_7 };
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IBLclient!vea;I)J")
	public static long method8282(@OriginalArg(0) int arg0, @OriginalArg(2) Interface25 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) long local13 = 4194304L;
		@Pc(15) long local15 = Long.MIN_VALUE;
		@Pc(22) Class191 local22 = Static319.aClass141_4.method2971(arg1.method8425());
		@Pc(43) long local43 = (long) (arg2 << 7 | arg0 | arg1.method8421() << 14 | arg1.method8420() << 20 | 0x40000000);
		if (local22.anInt4828 == 0) {
			local43 |= local15;
		}
		if (local22.anInt4810 == 1) {
			local43 |= local13;
		}
		return local43 | (long) arg1.method8425() << 32;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IBI)Z")
	public static boolean method8283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
