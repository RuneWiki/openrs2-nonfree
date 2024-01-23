import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
	public static int anInt428;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public static int anInt431;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "Lclient!rn;")
	public static Class155 aClass155_18;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "Lclient!pe;")
	public static Class136 aClass136_1;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "Lclient!rn;")
	public static Class155 aClass155_19;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BII)V")
	public static void method363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static179.aFloat48 = arg1;
		Static84.aFloat21 = arg0;
		if (Static25.anInt467 == 2) {
			Static113.anInt2103 = arg0;
			Static79.anInt1912 = arg1;
		}
		Static197.method4292();
		Static153.aBoolean205 = true;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	public static void method364() {
		Static178.aClass98_29.method2565(5);
		Static252.aClass98_41.method2565(5);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!ud;)V")
	public static void method366(@OriginalArg(1) Class10_Sub5 arg0) {
		if (arg0.anInt5088 == Static124.anInt2371 || arg0.anInt5061 == -1 || arg0.anInt5027 != 0 || arg0.anInt5081 + 1 > Static253.method4288(arg0.anInt5061).anIntArray36[arg0.anInt5049]) {
			@Pc(37) int local37 = arg0.anInt5088 - arg0.anInt5094;
			@Pc(43) int local43 = Static124.anInt2371 - arg0.anInt5094;
			@Pc(54) int local54 = arg0.anInt5040 * 128 + arg0.method4186() * 64;
			@Pc(66) int local66 = arg0.anInt5012 * 128 + arg0.method4186() * 64;
			@Pc(78) int local78 = arg0.anInt5032 * 128 + arg0.method4186() * 64;
			@Pc(89) int local89 = arg0.anInt5096 * 128 + arg0.method4186() * 64;
			arg0.anInt5073 = (local43 * local78 + local54 * (local37 - local43)) / local37;
			arg0.anInt5016 = (local43 * local89 + (local37 - local43) * local66) / local37;
		}
		arg0.anInt5059 = 0;
		if (arg0.anInt5070 == 0) {
			arg0.anInt5018 = 1024;
		}
		if (arg0.anInt5070 == 1) {
			arg0.anInt5018 = 1536;
		}
		if (arg0.anInt5070 == 2) {
			arg0.anInt5018 = 0;
		}
		if (arg0.anInt5070 == 3) {
			arg0.anInt5018 = 512;
		}
		arg0.anInt5043 = arg0.anInt5018;
	}
}
