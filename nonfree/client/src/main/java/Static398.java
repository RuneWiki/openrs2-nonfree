import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!baa;")
	public static final Class28 aClass28_22 = new Class28(9, 0, 4, 1);

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
	public static int anInt8718 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)V")
	public static void method7272(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(7, arg0);
		local8.method6095();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!d;Lclient!d;I)V")
	public static void method7273(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1) {
		if (arg0.aClass2_285 != null) {
			arg0.method7966();
		}
		arg0.aClass2_285 = arg1.aClass2_285;
		arg0.aClass2_286 = arg1;
		arg0.aClass2_285.aClass2_286 = arg0;
		arg0.aClass2_286.aClass2_285 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IB)V")
	public static void method7277(@OriginalArg(1) byte arg0) {
		if (Static143.aByteArrayArrayArray50 == null) {
			Static143.aByteArrayArrayArray50 = new byte[4][Static188.anInt3850][Static49.anInt1174];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static188.anInt3850; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static49.anInt1174; local27++) {
					Static143.aByteArrayArrayArray50[local19][local23][local27] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
	public static void method7278(@OriginalArg(1) int arg0) {
		Static591.anInt9584 = -1;
		Static356.anInt6365 = 3;
		Static582.anInt9503 = arg0;
		Static485.anInt8224 = 100;
	}
}
