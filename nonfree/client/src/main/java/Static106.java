import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dha", name = "B", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_37 = new Class126(87, -2);

	@OriginalMember(owner = "client!dha", name = "D", descriptor = "[I")
	public static final int[] anIntArray147 = new int[14];

	@OriginalMember(owner = "client!dha", name = "E", descriptor = "Lclient!cja;")
	public static final Class62 aClass62_11 = new Class62(32);

	@OriginalMember(owner = "client!dha", name = "F", descriptor = "I")
	public static int anInt2229 = 0;

	@OriginalMember(owner = "client!dha", name = "e", descriptor = "(I)V")
	public static void method2054() {
		@Pc(13) int local13;
		if (Static491.aClass167Array16 != null) {
			for (local13 = 0; local13 < Static114.anInt2292; local13++) {
				Static491.aClass167Array16[local13] = null;
			}
			Static491.aClass167Array16 = null;
		}
		if (Static243.aClass167Array11 != null) {
			for (local13 = 0; local13 < Static246.anInt4586; local13++) {
				Static243.aClass167Array11[local13] = null;
			}
			Static243.aClass167Array11 = null;
		}
		if (Static67.aClass167Array15 != null) {
			for (local13 = 0; local13 < Static22.anInt704; local13++) {
				Static67.aClass167Array15[local13] = null;
			}
			Static67.aClass167Array15 = null;
		}
		Static662.anIntArrayArrayArray20 = null;
		Static600.anIntArray615 = null;
		Static142.aClass167Array12 = null;
		Static652.anInt10051 = -1;
		Static526.anInt8708 = -1;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIIIII)I")
	public static int method2057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static343.aClass104Array2 == null) {
			return 0;
		} else if (arg4 < 3) {
			@Pc(19) int local19 = arg2 >> 9;
			@Pc(23) int local23 = arg3 >> 9;
			if (arg0 < 0 || arg1 < 0 || Static251.anInt4680 - 1 < arg0 || Static406.anInt6924 - 1 < arg1) {
				return 0;
			} else if (local19 >= 1 && local23 >= 1 && Static251.anInt4680 - 1 >= local19 && local23 <= Static406.anInt6924 - 1) {
				@Pc(102) boolean local102 = (Static338.aByteArrayArrayArray13[1][arg2 >> 9][arg3 >> 9] & 0x2) != 0;
				@Pc(127) boolean local127;
				@Pc(146) boolean local146;
				if ((arg2 & 0x1FF) == 0) {
					local127 = (Static338.aByteArrayArrayArray13[1][local19 - 1][arg3 >> 9] & 0x2) != 0;
					local146 = (Static338.aByteArrayArrayArray13[1][local19][arg3 >> 9] & 0x2) != 0;
					if (local146 != local127) {
						local102 = (Static338.aByteArrayArrayArray13[1][arg0][arg1] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x1FF) == 0) {
					local127 = (Static338.aByteArrayArrayArray13[1][arg2 >> 9][local23 - 1] & 0x2) != 0;
					local146 = (Static338.aByteArrayArrayArray13[1][arg2 >> 9][local23] & 0x2) != 0;
					if (local127 != local146) {
						local102 = (Static338.aByteArrayArrayArray13[1][arg0][arg1] & 0x2) != 0;
					}
				}
				if (local102) {
					arg4++;
				}
				return Static343.aClass104Array2[arg4].method8286(arg2, arg3);
			} else {
				return 0;
			}
		} else {
			return Static343.aClass104Array2[arg4].method8286(arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IBII)V")
	public static void method2058(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(40) String local40 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local40);
		Static145.method2526(local40, false, true);
	}
}
