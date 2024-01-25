import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!uk", name = "V", descriptor = "I")
	public static int anInt6756;

	@OriginalMember(owner = "client!uk", name = "X", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!uk", name = "L", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_168 = new Class12(59, -2);

	@OriginalMember(owner = "client!uk", name = "U", descriptor = "[Lclient!cc;")
	public static final Class1_Sub5_Sub2[] aClass1_Sub5_Sub2Array4 = new Class1_Sub5_Sub2[14];

	@OriginalMember(owner = "client!uk", name = "W", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[8];

	@OriginalMember(owner = "client!uk", name = "Y", descriptor = "[I")
	public static final int[] anIntArray455 = new int[25];

	@OriginalMember(owner = "client!uk", name = "Z", descriptor = "I")
	public static int anInt6757 = -2;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
	public static void method5299() {
		if (Static278.aBoolean562) {
			return;
		}
		Static278.aBoolean562 = true;
		if (Static453.aClass136_Sub1_1.aBoolean495) {
			Static98.aFloat20 = (int) Static98.aFloat20 + 191 & 0xFFFFFF80;
		} else {
			Static252.aFloat61 += (24.0F - Static252.aFloat61) / 2.0F;
		}
		Static297.aBoolean669 = true;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)Z")
	public static boolean method5300() {
		if (Static330.aBoolean639) {
			try {
				Static461.method3101(Static183.aClass83_2.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(III)V")
	public static void method5301(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub5_Sub11 local8 = Static188.method2688(arg0, 6);
		local8.method2661();
		local8.anInt3213 = arg1;
	}
}
