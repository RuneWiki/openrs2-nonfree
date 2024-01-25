import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!an", name = "c", descriptor = "[Lclient!tb;")
	public static Class49[] aClass49Array5;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "Lclient!ui;")
	public static final Class359 aClass359_38 = new Class359(4);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "I")
	public static int anInt5053 = -1;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IZLclient!lt;)Z")
	public static boolean method4613(@OriginalArg(0) int arg0, @OriginalArg(2) Class230 arg1) {
		Static399.aClass109_6.method4596(arg1.anIntArray356[arg0], arg1.anIntArray354[arg0], arg1.anIntArray355[arg0], Static385.anIntArray383);
		@Pc(22) int local22 = Static385.anIntArray383[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray56[arg0] = (short) (Static385.anIntArray383[0] * Static591.anInt9401 / local22 + Static243.anInt4674);
			arg1.aShortArray58[arg0] = (short) (Static173.anInt3556 + Static547.anInt8867 * Static385.anIntArray383[1] / local22);
			arg1.aShortArray57[arg0] = (short) local22;
			return true;
		}
	}
}
