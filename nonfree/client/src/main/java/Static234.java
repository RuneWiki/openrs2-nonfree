import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!op", name = "o", descriptor = "I")
	public static int anInt4720 = 0;

	@OriginalMember(owner = "client!op", name = "v", descriptor = "[I")
	public static final int[] anIntArray393 = new int[13];

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLclient!br;)V")
	public static void method4152(@OriginalArg(1) Class21 arg0) {
		@Pc(6) int local6 = arg0.anInt757;
		if (local6 == 327) {
			arg0.anInt734 = 150;
			arg0.anInt783 = (int) (Math.sin((double) Static199.anInt4137 / 40.0D) * 256.0D) & 0x3FFF;
			arg0.anInt787 = 5;
			arg0.anInt771 = -1;
		} else if (local6 == 328) {
			if (Static158.aClass8_Sub1_Sub2_Sub1_1.aString24 == null) {
				arg0.anInt771 = 0;
				arg0.anInt745 = 0;
			} else {
				arg0.anInt734 = 150;
				arg0.anInt783 = (int) (Math.sin((double) Static199.anInt4137 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt771 = 2047;
				arg0.anInt787 = 5;
				arg0.anInt745 = Static294.method4904(Static158.aClass8_Sub1_Sub2_Sub1_1.aString24);
				arg0.anInt749 = 0;
				arg0.anInt716 = Static158.aClass8_Sub1_Sub2_Sub1_1.anInt4937;
				arg0.anInt756 = Static158.aClass8_Sub1_Sub2_Sub1_1.anInt4921;
				arg0.anInt764 = Static158.aClass8_Sub1_Sub2_Sub1_1.anInt4920;
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZZLclient!ks;Z)V")
	public static void method4154(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub25 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt3695;
		@Pc(12) int local12 = (int) arg1.aLong223;
		arg1.method5687();
		if (arg0) {
			Static298.method4927(local8);
		}
		Static309.method5096(local8);
		@Pc(27) Class21 local27 = Static92.method534(local12);
		if (local27 != null) {
			Static349.method5536(local27);
		}
		Static193.method3860();
		if (!arg2 && Static357.anInt6821 != -1) {
			Static318.method5242(1, Static357.anInt6821);
		}
		@Pc(48) Class22 local48 = new Class22(Static270.aClass43_29);
		for (@Pc(61) Class4_Sub25 local61 = (Class4_Sub25) local48.method554(); local61 != null; local61 = (Class4_Sub25) local48.method551()) {
			if (!local61.method5689()) {
				local61 = (Class4_Sub25) local48.method554();
				if (local61 == null) {
					return;
				}
			}
			if (local61.anInt3697 == 3) {
				@Pc(85) int local85 = (int) local61.aLong223;
				if (local85 >>> 16 == local8) {
					method4154(true, local61, arg2);
				}
			}
		}
	}
}
