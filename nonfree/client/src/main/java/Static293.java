import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
	public static int anInt6495;

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "Lclient!nl;")
	public static Class171 aClass171_97;

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "Z")
	public static final boolean aBoolean464 = false;

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "Lclient!mo;")
	public static final Class160 aClass160_62 = new Class160(4);

	@OriginalMember(owner = "client!rg", name = "I", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_100 = new Class32("K", "T", "K", "K");

	@OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
	public static int anInt6496 = 20;

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "[I")
	public static final int[] anIntArray1333 = new int[500];

	@OriginalMember(owner = "client!rg", name = "N", descriptor = "[I")
	public static final int[] anIntArray1334 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ra;IZZ)V")
	public static void method5577(@OriginalArg(0) Class2_Sub38 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt4976;
		@Pc(12) int local12 = (int) arg0.aLong209;
		arg0.method5617();
		if (arg2) {
			Static96.method1918(local8);
		}
		Static290.method4402(local8);
		@Pc(29) Class4 local29 = Static380.method5560(local12);
		if (local29 != null) {
			Static51.method872(local29);
		}
		Static54.method3534();
		if (!arg1 && Static234.anInt4158 != -1) {
			Static55.method919(1, Static234.anInt4158);
		}
		@Pc(61) Class122 local61 = new Class122(Static12.aClass246_2);
		for (@Pc(66) Class2_Sub38 local66 = (Class2_Sub38) local61.method2875(); local66 != null; local66 = (Class2_Sub38) local61.method2878()) {
			if (!local66.method5618()) {
				local66 = (Class2_Sub38) local61.method2875();
				if (local66 == null) {
					return;
				}
			}
			if (local66.anInt4974 == 3) {
				@Pc(90) int local90 = (int) local66.aLong209;
				if (local8 == local90 >>> 16) {
					method5577(local66, arg1, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)V")
	public static void method5578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static96.aByteArrayArrayArray8 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V")
	public static void method5579() {
		Static249.aClass2_Sub2_Sub4_42.method5303();
		Static198.aClass171_50 = null;
		Static391.anInt6626 = 1;
	}
}
