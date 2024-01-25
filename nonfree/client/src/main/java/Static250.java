import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "Lclient!tf;")
	public static Class322 aClass322_88;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "[[[Lclient!ru;")
	public static Class299[][][] aClass299ArrayArrayArray2;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "[I")
	public static final int[] anIntArray238 = new int[14];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)[Lclient!hb;")
	public static Class122[] method3867() {
		return new Class122[] { Static242.aClass122_5, Static469.aClass122_4, Static412.aClass122_6 };
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLclient!vi;ZZ)V")
	public static void method3868(@OriginalArg(1) Class3_Sub49 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt8836;
		@Pc(12) int local12 = (int) arg0.aLong273;
		arg0.method7825();
		if (arg2) {
			Static153.method2893(local8);
		}
		Static470.method6499(local8);
		@Pc(27) Class361 local27 = Static265.method4040(local12);
		if (local27 != null) {
			Static186.method3170(local27);
		}
		Static183.method3139();
		if (!arg1 && Static353.anInt6188 != -1) {
			Static556.method7355(Static353.anInt6188, 1);
		}
		@Pc(48) Class162 local48 = new Class162(Static216.aClass354_18);
		for (@Pc(61) Class3_Sub49 local61 = (Class3_Sub49) local48.method3920(); local61 != null; local61 = (Class3_Sub49) local48.method3917()) {
			if (!local61.method7828()) {
				local61 = (Class3_Sub49) local48.method3920();
				if (local61 == null) {
					return;
				}
			}
			if (local61.anInt8837 == 3) {
				@Pc(85) int local85 = (int) local61.aLong273;
				if (local8 == local85 >>> 16) {
					method3868(local61, arg1, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I")
	public static int method3870(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
