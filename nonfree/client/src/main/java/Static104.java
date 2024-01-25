import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "Lclient!mk;")
	public static Class130 aClass130_159;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
	public static int anInt6825 = 0;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray123 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
	public static int anInt6829 = 0;

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "Z")
	public static boolean aBoolean594 = false;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI[I)V")
	public static void method5668(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		for (@Pc(3) int local3 = 31; local3 > 0; local3--) {
			@Pc(16) int local16 = local3 * 36;
			for (@Pc(18) int local18 = 35; local18 > 0; local18--) {
				if (arg1[local18 + local16] == 0 && arg1[local16 + local18 - 36 - 1] != 0) {
					arg1[local16 + local18] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!lo;)V")
	public static void method5669(@OriginalArg(1) Class2_Sub2_Sub1 arg0) {
		@Pc(13) int local13 = arg0.anInt6484 - Static342.anInt6706;
		@Pc(24) int local24 = arg0.anInt6475 * 128 + arg0.method5425() * 64;
		@Pc(36) int local36 = arg0.anInt6529 * 128 + arg0.method5425() * 64;
		arg0.anInt6465 += (local24 - arg0.anInt6465) / local13;
		arg0.anInt6466 += (local36 - arg0.anInt6466) / local13;
		arg0.anInt6548 = 0;
		if (arg0.anInt6519 == 0) {
			arg0.method5437(8192);
		}
		if (arg0.anInt6519 == 1) {
			arg0.method5437(12288);
		}
		if (arg0.anInt6519 == 2) {
			arg0.method5437(0);
		}
		if (arg0.anInt6519 == 3) {
			arg0.method5437(4096);
		}
	}
}
