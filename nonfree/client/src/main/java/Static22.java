import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!aw", name = "G", descriptor = "Lclient!kk;")
	public static Class135 aClass135_1 = new Class135(8);

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BB)V")
	public static void method609(@OriginalArg(1) byte arg0) {
		if (Static344.aByteArrayArrayArray16 == null) {
			Static344.aByteArrayArrayArray16 = new byte[4][Static399.anInt6923][Static127.anInt2696];
		}
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			for (@Pc(19) int local19 = 0; local19 < Static399.anInt6923; local19++) {
				for (@Pc(22) int local22 = 0; local22 < Static127.anInt2696; local22++) {
					Static344.aByteArrayArrayArray16[local16][local19][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BIIIII)V")
	public static void method610(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg1 - arg2;
		@Pc(19) int local19 = arg0 - arg3;
		if (local14 == 0) {
			if (local19 != 0) {
				Static382.method5246(arg4, arg3, arg0, arg2);
			}
		} else if (local19 == 0) {
			Static40.method6024(arg1, arg2, arg3, arg4);
		} else {
			@Pc(51) int local51 = (local19 << 12) / local14;
			@Pc(59) int local59 = arg3 - (arg2 * local51 >> 12);
			@Pc(71) int local71;
			@Pc(73) int local73;
			if (arg1 < Static142.anInt3212) {
				local73 = local59 + (local51 * Static142.anInt3212 >> 12);
				local71 = Static142.anInt3212;
			} else if (arg1 <= Static450.anInt7594) {
				local71 = arg1;
				local73 = arg0;
			} else {
				local73 = (Static450.anInt7594 * local51 >> 12) + local59;
				local71 = Static450.anInt7594;
			}
			@Pc(114) int local114;
			@Pc(123) int local123;
			if (Static142.anInt3212 > arg2) {
				local114 = Static142.anInt3212;
				local123 = (local51 * Static142.anInt3212 >> 12) + local59;
			} else if (arg2 > Static450.anInt7594) {
				local114 = Static450.anInt7594;
				local123 = local59 + (Static450.anInt7594 * local51 >> 12);
			} else {
				local114 = arg2;
				local123 = arg3;
			}
			if (local73 < Static161.anInt3448) {
				local71 = (Static161.anInt3448 - local59 << 12) / local51;
				local73 = Static161.anInt3448;
			} else if (Static163.anInt3488 < local73) {
				local73 = Static163.anInt3488;
				local71 = (Static163.anInt3488 - local59 << 12) / local51;
			}
			if (local123 < Static161.anInt3448) {
				local123 = Static161.anInt3448;
				local114 = (Static161.anInt3448 - local59 << 12) / local51;
			} else if (local123 > Static163.anInt3488) {
				local123 = Static163.anInt3488;
				local114 = (Static163.anInt3488 - local59 << 12) / local51;
			}
			Static26.method716(local114, arg4, local71, local73, local123);
		}
	}
}
