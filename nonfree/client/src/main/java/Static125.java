import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Lclient!ae;")
	public static final Class8 aClass8_16 = new Class8();

	@OriginalMember(owner = "client!em", name = "d", descriptor = "[I")
	public static final int[] anIntArray158 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	public static int anInt2405 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
	public static void method1803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static415.anInt7185 = arg0 - Static270.anInt1800;
		Static264.anInt4873 = arg1 - Static270.anInt1801;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIILclient!wr;)V")
	public static void method1804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub1_Sub4 arg4) {
		@Pc(4) Class346 local4 = Static308.method4598(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt8761 = (arg1 << Static134.anInt2822) + Static81.anInt1767;
		arg4.anInt8759 = arg3;
		arg4.anInt8764 = (arg2 << Static134.anInt2822) + Static81.anInt1767;
		if (local4.aClass6_Sub1_Sub2_1 != null) {
			arg4.anInt8759 -= local4.aClass6_Sub1_Sub2_1.aShort96;
		}
		local4.aClass6_Sub1_Sub4_1 = arg4;
		@Pc(44) int local44 = Static421.aClass67Array7 == Static592.aClass67Array4 ? 1 : 0;
		if (arg4.method7329()) {
			if (arg4.method7318()) {
				Static312.aClass6_Sub1ArrayArray3[local44][Static142.anIntArray179[local44]++] = arg4;
				return;
			}
			Static3.aClass6_Sub1ArrayArray1[local44][Static26.anIntArray39[local44]++] = arg4;
			return;
		}
		Static54.aClass6_Sub1ArrayArray2[local44][Static53.anIntArray64[local44]++] = arg4;
	}
}
