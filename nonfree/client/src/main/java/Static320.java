import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static320 {

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!ha;")
	public static Class84 aClass84_17;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "F")
	public static float aFloat125;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_57 = new Class77(35, 3);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!mc;I)V")
	public static void method5076(@OriginalArg(0) Class198 arg0) {
		if (Static478.anInt8724 != arg0.anInt5788) {
			return;
		}
		if (Static440.aClass30_Sub1_Sub1_Sub1_2.aString6 == null) {
			arg0.anInt5744 = 0;
			arg0.anInt5765 = 0;
			return;
		}
		arg0.anInt5745 = 150;
		arg0.anInt5730 = (int) (Math.sin((double) Static409.anInt7683 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt5722 = 5;
		arg0.anInt5744 = Static396.anInt7452;
		arg0.anInt5765 = Static470.method7078(Static440.aClass30_Sub1_Sub1_Sub1_2.aString6);
		arg0.anInt5753 = 0;
		arg0.anInt5708 = Static440.aClass30_Sub1_Sub1_Sub1_2.anInt4155;
		arg0.anInt5783 = Static440.aClass30_Sub1_Sub1_Sub1_2.anInt4124;
		arg0.anInt5735 = Static440.aClass30_Sub1_Sub1_Sub1_2.anInt4187;
	}
}
