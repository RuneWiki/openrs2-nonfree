import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "Z")
	public static boolean aBoolean766 = false;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
	public static int anInt9135 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public static void method7308() {
		for (@Pc(15) int local15 = 0; local15 < Static549.anInt9008; local15++) {
			@Pc(21) int local21 = Static224.anIntArray269[local15];
			@Pc(29) Class12_Sub2_Sub1_Sub4_Sub2 local29 = ((Class2_Sub5) Static436.aClass90_26.method1685((long) local21)).aClass12_Sub2_Sub1_Sub4_Sub2_1;
			@Pc(33) int local33 = Static361.aClass2_Sub7_Sub2_1.method4464();
			if ((local33 & 0x80) != 0) {
				local33 += Static361.aClass2_Sub7_Sub2_1.method4464() << 8;
			}
			if ((local33 & 0x2) != 0) {
				if (local29.aClass295_1.method5945()) {
					Static238.method3429(local29);
				}
				local29.method6784(Static76.aClass361_1.method7581(Static361.aClass2_Sub7_Sub2_1.method4517()));
				local29.method6762(local29.aClass295_1.anInt7362);
				local29.anInt8395 = local29.aClass295_1.anInt7329 << 3;
				if (local29.aClass295_1.method5945()) {
					Static169.method2211(local29.anIntArray566[0], null, 0, local29.anIntArray565[0], local29.aByte128, null, local29);
				}
			}
			if ((local33 & 0x10) != 0) {
				local29.aString126 = Static361.aClass2_Sub7_Sub2_1.method4494();
				local29.anInt8391 = 100;
			}
			@Pc(123) int local123;
			@Pc(126) int[] local126;
			@Pc(129) int[] local129;
			@Pc(137) int local137;
			@Pc(148) int local148;
			if ((local33 & 0x100) != 0) {
				local123 = Static361.aClass2_Sub7_Sub2_1.method4466();
				local126 = new int[local123];
				local129 = new int[local123];
				for (@Pc(131) int local131 = 0; local131 < local123; local131++) {
					local137 = Static361.aClass2_Sub7_Sub2_1.method4518();
					if ((local137 & 0xC000) == 49152) {
						local148 = Static361.aClass2_Sub7_Sub2_1.method4517();
						local126[local131] = local137 << 16 | local148;
					} else {
						local126[local131] = local137;
					}
					local129[local131] = Static361.aClass2_Sub7_Sub2_1.method4465();
				}
				local29.method6774(local129, local126);
			}
			if ((local33 & 0x1000) != 0) {
				local29.aByte121 = Static361.aClass2_Sub7_Sub2_1.method4505();
				local29.aByte122 = Static361.aClass2_Sub7_Sub2_1.method4477();
				local29.aByte120 = Static361.aClass2_Sub7_Sub2_1.method4505();
				local29.aByte119 = (byte) Static361.aClass2_Sub7_Sub2_1.method4466();
				local29.anInt8352 = Static532.anInt8757 + Static361.aClass2_Sub7_Sub2_1.method4517();
				local29.anInt8422 = Static532.anInt8757 + Static361.aClass2_Sub7_Sub2_1.method4517();
			}
			if ((local33 & 0x1) != 0) {
				local29.anInt8442 = Static361.aClass2_Sub7_Sub2_1.method4517();
				local29.anInt8436 = Static361.aClass2_Sub7_Sub2_1.method4465();
			}
			if ((local33 & 0x400) != 0) {
				local29.anInt8358 = Static361.aClass2_Sub7_Sub2_1.method4477();
				local29.anInt8359 = Static361.aClass2_Sub7_Sub2_1.method4477();
				local29.anInt8401 = Static361.aClass2_Sub7_Sub2_1.method4522();
				local29.anInt8363 = Static361.aClass2_Sub7_Sub2_1.method4522();
				local29.anInt8369 = Static361.aClass2_Sub7_Sub2_1.method4518() + Static532.anInt8757;
				local29.anInt8412 = Static361.aClass2_Sub7_Sub2_1.method4465() + Static532.anInt8757;
				local29.anInt8426 = Static361.aClass2_Sub7_Sub2_1.method4515();
				local29.anInt8401 += local29.anIntArray566[0];
				local29.anInt8363 += local29.anIntArray565[0];
				local29.anInt8358 += local29.anIntArray566[0];
				local29.anInt8431 = 1;
				local29.anInt8359 += local29.anIntArray565[0];
				local29.anInt8430 = 0;
			}
			@Pc(337) int local337;
			@Pc(364) int local364;
			if ((local33 & 0x8) != 0) {
				@Pc(335) int[] local335 = new int[4];
				for (local337 = 0; local337 < 4; local337++) {
					local335[local337] = Static361.aClass2_Sub7_Sub2_1.method4518();
					if (local335[local337] == 65535) {
						local335[local337] = -1;
					}
				}
				local364 = Static361.aClass2_Sub7_Sub2_1.method4488();
				Static369.method7665(local335, local29, local364);
			}
			if ((local33 & 0x4000) != 0) {
				local123 = Static361.aClass2_Sub7_Sub2_1.method4488();
				local126 = new int[local123];
				local129 = new int[local123];
				@Pc(389) int[] local389 = new int[local123];
				for (local137 = 0; local137 < local123; local137++) {
					local148 = Static361.aClass2_Sub7_Sub2_1.method4521();
					if (local148 == 65535) {
						local148 = -1;
					}
					local126[local137] = local148;
					local129[local137] = Static361.aClass2_Sub7_Sub2_1.method4464();
					local389[local137] = Static361.aClass2_Sub7_Sub2_1.method4465();
				}
				Static486.method6249(local126, local389, local129, local29);
			}
			if ((local33 & 0x800) != 0) {
				local123 = Static361.aClass2_Sub7_Sub2_1.method4458();
				local337 = Static361.aClass2_Sub7_Sub2_1.method4488();
				local29.method6769(local123, local337, Static532.anInt8757);
			}
			if ((local33 & 0x2000) != 0) {
				local123 = Static361.aClass2_Sub7_Sub2_1.method4521();
				if (local123 == 65535) {
					local123 = -1;
				}
				local337 = Static361.aClass2_Sub7_Sub2_1.method4490();
				local364 = Static361.aClass2_Sub7_Sub2_1.method4488();
				local29.method6779(local364, local337, local123, true);
			}
			if ((local33 & 0x40) != 0) {
				local123 = Static361.aClass2_Sub7_Sub2_1.method4458();
				local337 = Static361.aClass2_Sub7_Sub2_1.method4515();
				local29.method6769(local123, local337, Static532.anInt8757);
				local29.anInt8354 = Static532.anInt8757 + 300;
				local29.anInt8348 = Static361.aClass2_Sub7_Sub2_1.method4515();
			}
			if ((local33 & 0x4) != 0) {
				local29.anInt8424 = Static361.aClass2_Sub7_Sub2_1.method4517();
				if (local29.anInt8424 == 65535) {
					local29.anInt8424 = -1;
				}
			}
			if ((local33 & 0x20) != 0) {
				local123 = Static361.aClass2_Sub7_Sub2_1.method4465();
				if (local123 == 65535) {
					local123 = -1;
				}
				local337 = Static361.aClass2_Sub7_Sub2_1.method4490();
				local364 = Static361.aClass2_Sub7_Sub2_1.method4488();
				local29.method6779(local364, local337, local123, false);
			}
			if ((local33 & 0x200) != 0) {
				local123 = Static361.aClass2_Sub7_Sub2_1.method4465();
				local29.anInt8375 = Static361.aClass2_Sub7_Sub2_1.method4515();
				local29.anInt8373 = Static361.aClass2_Sub7_Sub2_1.method4488();
				local29.anInt8403 = local123 & 0x7FFF;
				local29.aBoolean708 = (local123 & 0x8000) != 0;
				local29.anInt8356 = local29.anInt8375 + local29.anInt8403 + Static532.anInt8757;
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLclient!mm;Lclient!mm;)V")
	public static void method7309(@OriginalArg(1) Class12 arg0, @OriginalArg(2) Class12 arg1) {
		if (arg1.aClass12_68 != null) {
			arg1.method7630();
		}
		arg1.aClass12_68 = arg0.aClass12_68;
		arg1.aClass12_67 = arg0;
		arg1.aClass12_68.aClass12_67 = arg1;
		arg1.aClass12_67.aClass12_68 = arg1;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method7310(@OriginalArg(0) String arg0) {
		return Static308.method4413(arg0, 10);
	}
}
