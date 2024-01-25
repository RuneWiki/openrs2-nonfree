import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
	public static int anInt7660;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!fr;")
	public static final Class90 aClass90_31 = new Class90(1);

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "[Lclient!ql;")
	public static final Class4_Sub2_Sub2_Sub1[] aClass4_Sub2_Sub2_Sub1Array27 = new Class4_Sub2_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
	public static void method5935() {
		for (@Pc(7) int local7 = 0; local7 < Static379.anInt6725; local7++) {
			@Pc(13) int local13 = Static19.anIntArray29[local7];
			@Pc(17) Class4_Sub2_Sub2_Sub2 local17 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local13];
			@Pc(21) int local21 = Static426.aClass2_Sub20_Sub1_2.method3737();
			if ((local21 & 0x4) != 0) {
				local21 += Static426.aClass2_Sub20_Sub1_2.method3737() << 8;
			}
			if ((local21 & 0x40) != 0) {
				local17.aString55 = Static426.aClass2_Sub20_Sub1_2.method3717();
				local17.anInt6514 = 100;
			}
			if ((local21 & 0x8) != 0) {
				local17.anInt6481 = Static426.aClass2_Sub20_Sub1_2.method3706();
				if (local17.anInt6481 == 65535) {
					local17.anInt6481 = -1;
				}
			}
			@Pc(77) int local77;
			@Pc(81) int local81;
			if ((local21 & 0x80) != 0) {
				local77 = Static426.aClass2_Sub20_Sub1_2.method3698();
				local81 = Static426.aClass2_Sub20_Sub1_2.method3737();
				local17.method5116(local77, Static164.anInt3206, local81);
				local17.anInt6451 = Static164.anInt3206 + 300;
				local17.anInt6511 = Static426.aClass2_Sub20_Sub1_2.method3737();
			}
			if ((local21 & 0x1) != 0) {
				local77 = Static426.aClass2_Sub20_Sub1_2.method3706();
				if (local77 == 65535) {
					local77 = -1;
				}
				local81 = Static426.aClass2_Sub20_Sub1_2.method3739();
				Static305.method982(local81, local17, local77);
			}
			if ((local21 & 0x1000) != 0) {
				local17.aByte85 = Static426.aClass2_Sub20_Sub1_2.method3693();
				local17.aByte86 = Static426.aClass2_Sub20_Sub1_2.method3730();
				local17.aByte88 = Static426.aClass2_Sub20_Sub1_2.method3696();
				local17.aByte87 = (byte) Static426.aClass2_Sub20_Sub1_2.method3739();
				local17.anInt6495 = Static164.anInt3206 + Static426.aClass2_Sub20_Sub1_2.method3744();
				local17.anInt6468 = Static164.anInt3206 + Static426.aClass2_Sub20_Sub1_2.method3732();
			}
			if ((local21 & 0x200) != 0) {
				local77 = Static426.aClass2_Sub20_Sub1_2.method3732();
				local17.anInt6502 = Static426.aClass2_Sub20_Sub1_2.method3716();
				local17.anInt6516 = Static426.aClass2_Sub20_Sub1_2.method3739();
				local17.aBoolean562 = (local77 & 0x8000) != 0;
				local17.anInt6489 = local77 & 0x7FFF;
				local17.anInt6475 = local17.anInt6502 + Static164.anInt3206 + local17.anInt6489;
			}
			if ((local21 & 0x100) != 0) {
				local17.anInt6540 = Static426.aClass2_Sub20_Sub1_2.method3744();
				local17.anInt6529 = Static426.aClass2_Sub20_Sub1_2.method3706();
			}
			@Pc(246) int local246;
			if ((local21 & 0x2) != 0) {
				local77 = Static426.aClass2_Sub20_Sub1_2.method3706();
				if (local77 == 65535) {
					local77 = -1;
				}
				local81 = Static426.aClass2_Sub20_Sub1_2.method3731();
				local246 = Static426.aClass2_Sub20_Sub1_2.method3721();
				local17.method5128(false, local77, local81, local246);
			}
			if ((local21 & 0x800) != 0) {
				local77 = Static426.aClass2_Sub20_Sub1_2.method3711();
				if (local77 == 65535) {
					local77 = -1;
				}
				local81 = Static426.aClass2_Sub20_Sub1_2.method3742();
				local246 = Static426.aClass2_Sub20_Sub1_2.method3737();
				local17.method5128(true, local77, local81, local246);
			}
			if ((local21 & 0x400) != 0) {
				local17.anInt6496 = Static426.aClass2_Sub20_Sub1_2.method3730();
				local17.anInt6498 = Static426.aClass2_Sub20_Sub1_2.method3693();
				local17.anInt6454 = Static426.aClass2_Sub20_Sub1_2.method3712();
				local17.anInt6518 = Static426.aClass2_Sub20_Sub1_2.method3696();
				local17.anInt6463 = Static426.aClass2_Sub20_Sub1_2.method3744() + Static164.anInt3206;
				local17.anInt6457 = Static426.aClass2_Sub20_Sub1_2.method3711() + Static164.anInt3206;
				local17.anInt6500 = Static426.aClass2_Sub20_Sub1_2.method3721();
				local17.anInt6518 += local17.anIntArray437[0];
				local17.anInt6524 = 1;
				local17.anInt6454 += local17.anIntArray436[0];
				local17.anInt6525 = 0;
				local17.anInt6496 += local17.anIntArray436[0];
				local17.anInt6498 += local17.anIntArray437[0];
			}
			if ((local21 & 0x20) != 0) {
				local77 = Static426.aClass2_Sub20_Sub1_2.method3698();
				local81 = Static426.aClass2_Sub20_Sub1_2.method3739();
				local17.method5116(local77, Static164.anInt3206, local81);
			}
			if ((local21 & 0x2000) != 0) {
				local77 = Static426.aClass2_Sub20_Sub1_2.method3739();
				@Pc(403) int[] local403 = new int[local77];
				@Pc(406) int[] local406 = new int[local77];
				@Pc(409) int[] local409 = new int[local77];
				for (@Pc(411) int local411 = 0; local411 < local77; local411++) {
					@Pc(417) int local417 = Static426.aClass2_Sub20_Sub1_2.method3706();
					if (local417 == 65535) {
						local417 = -1;
					}
					local403[local411] = local417;
					local406[local411] = Static426.aClass2_Sub20_Sub1_2.method3739();
					local409[local411] = Static426.aClass2_Sub20_Sub1_2.method3744();
				}
				Static215.method3335(local409, local406, local17, local403);
			}
			if ((local21 & 0x10) != 0) {
				if (local17.aClass215_1.method4799()) {
					Static246.method3808(local17);
				}
				local17.method5135(Static417.aClass234_2.method5362(Static426.aClass2_Sub20_Sub1_2.method3711()));
				local17.method5117(local17.aClass215_1.anInt5998);
				local17.anInt6462 = local17.aClass215_1.anInt6004 << 3;
				if (local17.aClass215_1.method4799()) {
					Static354.method4965(null, null, local17, local17.anIntArray436[0], 0, local17.aByte92, local17.anIntArray437[0]);
				}
			}
		}
	}
}
