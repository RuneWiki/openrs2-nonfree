import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!tca", name = "C", descriptor = "F")
	public static float aFloat182;

	@OriginalMember(owner = "client!tca", name = "F", descriptor = "Lclient!uaa;")
	public static Class320 aClass320_9;

	@OriginalMember(owner = "client!tca", name = "G", descriptor = "I")
	public static int anInt9269;

	@OriginalMember(owner = "client!tca", name = "A", descriptor = "Lclient!fl;")
	public static final Class103 aClass103_7 = new Class103(9, 2);

	@OriginalMember(owner = "client!tca", name = "B", descriptor = "Lclient!fl;")
	public static final Class103 aClass103_8 = new Class103(5, 1);

	@OriginalMember(owner = "client!tca", name = "D", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_135 = new Class276(57, 12);

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)Lclient!lga;")
	public static Class2_Sub4 method7511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class125 local7 = Static580.aClass125ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub4_1;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIII)I")
	public static int method7512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static576.aByteArrayArrayArray21[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static576.aByteArrayArrayArray21[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
