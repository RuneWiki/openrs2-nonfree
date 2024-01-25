import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
	public static int anInt9091;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_111 = new Class100(55, 18);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIZ)I")
	public static int method7509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!rr;[[BI)V")
	public static void method7513(@OriginalArg(0) Class49_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(8) int local8 = Static513.aByteArrayArray41.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg1[local10];
			if (local16 != null) {
				@Pc(29) int local29 = (Static332.anIntArray455[local10] >> 8) * 64 - Static329.anInt6225;
				@Pc(40) int local40 = (Static332.anIntArray455[local10] & 0xFF) * 64 - Static202.anInt3755;
				Static299.method4404();
				arg0.method7527(local16, local40, local29, Static226.aClass226Array3, Static677.aClass137_47);
			}
		}
	}
}
