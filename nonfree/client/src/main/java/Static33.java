import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
	public static int anInt662;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "Lclient!f;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
	public static int anInt667;

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
	public static int anInt668 = -2;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZII)Z")
	public static boolean method440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static445.method6017(arg0, arg1) & Static304.method4372(arg0, arg1);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)I")
	public static int method443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIILclient!jo;II)V")
	public static void method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub23 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt3790 == -1 && arg2.anIntArray252 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(24) int local24 = arg2.anInt3789 * Static399.aClass167_Sub1_1.anInt5567 >> 8;
		if (arg4 > arg2.anInt3780) {
			local16 = arg4 - arg2.anInt3780;
		} else if (arg4 < arg2.anInt3784) {
			local16 = arg2.anInt3784 - arg4;
		}
		if (arg2.anInt3785 < arg3) {
			local16 += arg3 - arg2.anInt3785;
		} else if (arg2.anInt3779 > arg3) {
			local16 += arg2.anInt3779 - arg3;
		}
		if (arg2.anInt3786 == 0 || local16 - 64 > arg2.anInt3786 || Static399.aClass167_Sub1_1.anInt5567 == 0 || arg2.anInt3782 != arg1) {
			if (arg2.aClass2_Sub18_Sub1_3 != null) {
				Static360.aClass2_Sub18_Sub4_2.method4456(arg2.aClass2_Sub18_Sub1_3);
				arg2.aClass2_Sub18_Sub1_3 = null;
			}
			if (arg2.aClass2_Sub18_Sub1_2 != null) {
				Static360.aClass2_Sub18_Sub4_2.method4456(arg2.aClass2_Sub18_Sub1_2);
				arg2.aClass2_Sub18_Sub1_2 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(151) int local151 = local24 * (arg2.anInt3786 - local16) / arg2.anInt3786;
		if (arg2.aClass2_Sub18_Sub1_3 != null) {
			arg2.aClass2_Sub18_Sub1_3.method2709(local151);
		} else if (arg2.anInt3790 >= 0) {
			@Pc(169) Class267 local169 = Static462.method6066(Static310.aClass188_83, arg2.anInt3790, 0);
			if (local169 != null) {
				@Pc(176) Class2_Sub41_Sub1 local176 = local169.method6067().method5546(Static20.aClass195_1);
				@Pc(181) Class2_Sub18_Sub1 local181 = Static458.method2694(local176, local151);
				local181.method2698(-1);
				Static360.aClass2_Sub18_Sub4_2.method4455(local181);
				arg2.aClass2_Sub18_Sub1_3 = local181;
			}
		}
		if (arg2.aClass2_Sub18_Sub1_2 != null) {
			arg2.aClass2_Sub18_Sub1_2.method2709(local151);
			if (arg2.aClass2_Sub18_Sub1_2.method6074()) {
				return;
			}
			arg2.aClass2_Sub18_Sub1_2 = null;
		} else if (arg2.anIntArray252 != null && (arg2.anInt3778 -= arg0) <= 0) {
			@Pc(212) int local212 = (int) (Math.random() * (double) arg2.anIntArray252.length);
			@Pc(220) Class267 local220 = Static462.method6066(Static310.aClass188_83, arg2.anIntArray252[local212], 0);
			if (local220 != null) {
				@Pc(227) Class2_Sub41_Sub1 local227 = local220.method6067().method5546(Static20.aClass195_1);
				@Pc(232) Class2_Sub18_Sub1 local232 = Static458.method2694(local227, local151);
				local232.method2698(0);
				Static360.aClass2_Sub18_Sub4_2.method4455(local232);
				arg2.anInt3778 = arg2.anInt3788 + (int) (Math.random() * (double) (arg2.anInt3781 - arg2.anInt3788));
				arg2.aClass2_Sub18_Sub1_2 = local232;
				return;
			}
		}
	}
}
