import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
	public static int anInt6316;

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
	public static int anInt6320;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_55 = new Class129(8);

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "F")
	public static float aFloat192 = 1.0F;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
	public static int anInt6319 = 0;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!bi;IIIII)V")
	public static void method5012(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6960 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static427.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class168 local35 = Static77.aClass168Array9[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt6960; local37++) {
							if (arg0.aClass2_Sub7Array3[local37] == local35.aClass2_Sub7_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass2_Sub7Array3[arg0.anInt6960++] = local35.aClass2_Sub7_2;
						if (arg0.anInt6960 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt6960; local7 < 4; local7++) {
			arg0.aClass2_Sub7Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)I")
	public static int method5018(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(47) int local47 = (arg0 & 0x7F) * 96 >> 7;
			if (local47 < 2) {
				local47 = 2;
			} else if (local47 > 126) {
				local47 = 126;
			}
			return local47 + (arg0 & 0xFF80);
		}
	}
}
