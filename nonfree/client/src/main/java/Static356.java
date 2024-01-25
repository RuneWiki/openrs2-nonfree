import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "[I")
	public static int[] anIntArray348;

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "Lclient!ic;")
	public static Class113 aClass113_110;

	@OriginalMember(owner = "client!rt", name = "r", descriptor = "[S")
	public static short[] aShortArray73;

	@OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
	public static int anInt5887;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_221 = new Class137(74, 3);

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "[I")
	public static final int[] anIntArray349 = new int[50];

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
	public static int anInt5885 = 0;

	@OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
	public static final int anInt5886 = 52;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BII)B")
	public static byte method4567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIZI)I")
	public static int method4570(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1_Sub20 local13 = Static240.method3131(arg1, arg0);
		if (local13 == null) {
			return -1;
		} else if (arg2 >= 0 && arg2 < local13.anIntArray149.length) {
			return local13.anIntArray149[arg2];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V")
	public static void method4573() {
		if (Static70.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static434.anInt4327;
		@Pc(10) int local10 = Static239.anInt3852;
		@Pc(26) int local26 = Static320.anInt5295 - Static126.anInt2202 - local8;
		@Pc(34) int local34 = Static347.anInt5659 - Static92.anInt1618 - local10;
		if (local8 <= 0 && local26 <= 0 && local10 <= 0 && local34 <= 0) {
			return;
		}
		try {
			@Pc(53) Container local53;
			if (Static158.aFrame2 == null) {
				local53 = Static41.aClass124_2.anApplet1;
			} else {
				local53 = Static158.aFrame2;
			}
			@Pc(59) int local59 = 0;
			@Pc(61) int local61 = 0;
			if (local53 == Static158.aFrame2) {
				@Pc(67) Insets local67 = Static158.aFrame2.getInsets();
				local59 = local67.left;
				local61 = local67.top;
			}
			@Pc(76) Graphics local76 = local53.getGraphics();
			local76.setColor(Color.black);
			if (local8 > 0) {
				local76.fillRect(local59, local61, local8, Static347.anInt5659);
			}
			if (local10 > 0) {
				local76.fillRect(local59, local61, Static320.anInt5295, local10);
			}
			if (local26 > 0) {
				local76.fillRect(local59 + Static320.anInt5295 - local26, local61, local26, Static347.anInt5659);
			}
			if (local34 > 0) {
				local76.fillRect(local59, Static347.anInt5659 + local61 - local34, Static320.anInt5295, local34);
				return;
			}
		} catch (@Pc(129) Exception local129) {
			return;
		}
	}
}
