import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "[I")
	public static int[] anIntArray456 = new int[1];

	@OriginalMember(owner = "client!rg", name = "P", descriptor = "J")
	public static long aLong182 = 0L;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIFIIIIZI)[[I")
	public static int[][] method4952(@OriginalArg(2) float arg0) {
		@Pc(14) int[][] local14 = new int[256][64];
		@Pc(18) Class1_Sub2_Sub36 local18 = new Class1_Sub2_Sub36();
		local18.anInt7040 = (int) (arg0 * 4096.0F);
		local18.anInt7046 = 4;
		local18.aBoolean589 = false;
		local18.anInt7038 = 3;
		local18.anInt7042 = 8;
		local18.method5864();
		Static316.method4366(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local18.method5430(local14[local45], local45);
		}
		return local14;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!qa;BJ)V")
	public static void method4954(@OriginalArg(0) Class121 arg0, @OriginalArg(2) long arg1) {
		Static53.anInt930 = 0;
		Static296.anInt4975 = Static361.anInt6591;
		Static361.anInt6591 = 0;
		@Pc(14) long local14 = Static107.method1707();
		for (@Pc(19) Class36_Sub7 local19 = (Class36_Sub7) Static158.aClass242_2.method5503(); local19 != null; local19 = (Class36_Sub7) Static158.aClass242_2.method5506()) {
			if (local19.method4878(arg0, arg1)) {
				Static53.anInt930++;
			}
		}
		if (Static283.aBoolean379 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static158.aClass242_2.method5507() + ", running: " + Static53.anInt930 + ". Particles: " + Static361.anInt6591 + ". Time taken: " + (Static107.method1707() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(IIB)I")
	public static int method4955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!sq;Lclient!sq;)V")
	public static void method4956(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg0.aClass1_Sub1_57 != null) {
			arg0.method5893();
		}
		arg0.aClass1_Sub1_57 = arg1;
		arg0.aClass1_Sub1_58 = arg1.aClass1_Sub1_58;
		arg0.aClass1_Sub1_57.aClass1_Sub1_58 = arg0;
		arg0.aClass1_Sub1_58.aClass1_Sub1_57 = arg0;
	}
}
