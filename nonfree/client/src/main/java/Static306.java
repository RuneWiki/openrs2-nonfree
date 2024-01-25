import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "Lclient!wm;")
	public static Class390 aClass390_78;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
	public static int anInt5852 = 0;

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "Lclient!vha;")
	public static final Class368 aClass368_4 = new Class368("RC", 1);

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
	public static int anInt5853 = 1;

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "[I")
	public static final int[] anIntArray326 = new int[50];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!fda;I)I")
	public static int method4845(@OriginalArg(0) Class28_Sub1_Sub4_Sub2 arg0) {
		if (arg0.anInt5519 == 0) {
			return 0;
		}
		@Pc(70) int local70;
		@Pc(63) int local63;
		if (arg0.anInt5500 != -1) {
			@Pc(23) Class28_Sub1_Sub4_Sub2 local23 = null;
			if (arg0.anInt5500 < 32768) {
				@Pc(37) Class5_Sub25 local37 = (Class5_Sub25) Static56.aClass300_8.method7188((long) arg0.anInt5500);
				if (local37 != null) {
					local23 = local37.aClass28_Sub1_Sub4_Sub2_Sub1_1;
				}
			} else if (arg0.anInt5500 >= 32768) {
				local23 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[arg0.anInt5500 - 32768];
			}
			if (local23 != null) {
				local63 = arg0.anInt10781 - local23.anInt10781;
				local70 = arg0.anInt10784 - local23.anInt10784;
				if (local63 != 0 || local70 != 0) {
					arg0.method4582((int) (Math.atan2((double) local63, (double) local70) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class28_Sub1_Sub4_Sub2_Sub2) {
			@Pc(166) Class28_Sub1_Sub4_Sub2_Sub2 local166 = (Class28_Sub1_Sub4_Sub2_Sub2) arg0;
			if (local166.anInt5543 != -1 && (local166.anInt5524 == 0 || local166.anInt5522 > 0)) {
				local166.method4582(local166.anInt5543);
				local166.anInt5543 = -1;
			}
		} else if (arg0 instanceof Class28_Sub1_Sub4_Sub2_Sub1) {
			@Pc(96) Class28_Sub1_Sub4_Sub2_Sub1 local96 = (Class28_Sub1_Sub4_Sub2_Sub1) arg0;
			if (local96.anInt3566 != -1 && (local96.anInt5524 == 0 || local96.anInt5522 > 0)) {
				local63 = local96.anInt10781 - (local96.anInt3566 - Static153.anInt3147 - Static153.anInt3147) * 256;
				local70 = local96.anInt10784 - (local96.anInt3577 - Static201.anInt3839 - Static201.anInt3839) * 256;
				if (local63 != 0 || local70 != 0) {
					local96.method4582((int) (Math.atan2((double) local63, (double) local70) * 2607.5945876176133D) & 0x3FFF);
				}
				local96.anInt3566 = -1;
			}
		}
		return arg0.method4589();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
	public static void method4846(@OriginalArg(1) int arg0) {
		@Pc(1) Class5_Sub3_Sub7 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class109 local8 = Static605.aClass109Array5[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static233.anInt4238; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static216.anInt4042; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static588.anInt9672;
							@Pc(32) int local32 = local12 << Static588.anInt9672;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class109 local41 = Static605.aClass109Array5[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7695(local12, local15) - local41.method7695(local12, local15);
									@Pc(71) int local71 = local8.method7695(local12, local15 + 1) - local41.method7695(local12, local15 + 1);
									@Pc(91) int local91 = local8.method7695(local12 + 1, local15 + 1) - local41.method7695(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method7695(local12 + 1, local15) - local41.method7695(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
