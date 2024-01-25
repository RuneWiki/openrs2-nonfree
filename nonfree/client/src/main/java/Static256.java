import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Z")
	public static boolean aBoolean363 = true;

	@OriginalMember(owner = "client!p", name = "r", descriptor = "I")
	public static int anInt4912 = 0;

	@OriginalMember(owner = "client!p", name = "y", descriptor = "J")
	public static long aLong150 = 0L;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(II)I")
	public static int method4418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static139.aByteArrayArray11 == null ? 0 : Static139.aByteArrayArray11[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!mt;)V")
	public static void method4420(@OriginalArg(0) Class1_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort95; local2 <= arg0.aShort97; local2++) {
			for (@Pc(6) int local6 = arg0.aShort96; local6 <= arg0.aShort94; local6++) {
				@Pc(16) Class188 local16 = Static45.aClass188ArrayArrayArray5[arg0.aByte73][local2][local6];
				if (local16 != null) {
					@Pc(21) Class168 local21 = local16.aClass168_2;
					@Pc(23) Class168 local23 = null;
					while (local21 != null) {
						if (local21.aClass1_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass168_2 = local21.aClass168_1;
							} else {
								local23.aClass168_1 = local21.aClass168_1;
							}
							local21.method4283();
							break;
						}
						local23 = local21;
						local21 = local21.aClass168_1;
					}
					local16.aByte47 = 0;
					for (@Pc(56) Class168 local56 = local16.aClass168_2; local56 != null; local56 = local56.aClass168_1) {
						local16.aByte47 = (byte) (local16.aByte47 | local56.anInt4777);
					}
				}
			}
		}
	}
}
