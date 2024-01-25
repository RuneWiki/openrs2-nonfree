import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!fu", name = "S", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)[Lclient!mt;")
	public static Class165[] method1563() {
		return new Class165[] { Static328.aClass165_13, Static422.aClass165_18, Static271.aClass165_9, Static356.aClass165_15, Static243.aClass165_8, Static165.aClass165_6, Static313.aClass165_12, Static115.aClass165_4, Static407.aClass165_16, Static155.aClass165_5, Static195.aClass165_7, Static345.aClass165_14, Static420.aClass165_17, Static359.aClass165_11 };
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!sq;III)V")
	public static void method1578(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static404.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt4999 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass1_Sub29Array3[arg0.anInt4999++] = Static203.aClass93Array1[local21 - 1].aClass1_Sub29_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt4999; local21 < 4; local21++) {
			arg0.aClass1_Sub29Array3[local21] = null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)V")
	public static void method1580(@OriginalArg(0) int arg0) {
		Static357.anInt5806 = arg0;
		Static368.aClass77_60.method1395();
	}
}
