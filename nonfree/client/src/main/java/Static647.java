import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!wu", name = "D", descriptor = "Z")
	public static boolean aBoolean839 = false;

	@OriginalMember(owner = "client!wu", name = "F", descriptor = "Z")
	public static boolean aBoolean840 = true;

	@OriginalMember(owner = "client!wu", name = "I", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_99 = new Class181(44, 3);

	@OriginalMember(owner = "client!wu", name = "R", descriptor = "I")
	public static int anInt10483 = 0;

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(IB)V")
	public static void method8873(@OriginalArg(1) byte arg0) {
		if (Static479.aByteArrayArrayArray21 == null) {
			Static479.aByteArrayArrayArray21 = new byte[4][Static111.anInt1752][Static279.anInt4567];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static111.anInt1752; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static279.anInt4567; local22++) {
					Static479.aByteArrayArrayArray21[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B[ILclient!fs;I)V")
	public static void method8880(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class14_Sub1_Sub1_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) boolean local16;
		@Pc(18) int local18;
		if (arg1.anIntArray243 != null) {
			local16 = true;
			for (local18 = 0; local18 < arg1.anIntArray243.length; local18++) {
				if (arg1.anIntArray243[local18] != arg0[local18]) {
					local16 = false;
					break;
				}
			}
			if (local16 && arg1.anInt2930 != -1) {
				@Pc(55) Class200 local55 = Static396.aClass359_2.method8415(arg1.anInt2930);
				@Pc(58) int local58 = local55.anInt4871;
				if (local58 == 1) {
					arg1.anInt2947 = 0;
					arg1.anInt2903 = 1;
					arg1.anInt2914 = 0;
					arg1.anInt2918 = arg2;
					arg1.anInt2913 = 0;
					if (!arg1.aBoolean255) {
						Static270.method4083(local55, arg1.anInt2914, arg1);
					}
				}
				if (local58 == 2) {
					arg1.anInt2913 = 0;
				}
			}
		}
		local16 = true;
		for (local18 = 0; local18 < arg0.length; local18++) {
			if (arg0[local18] != -1) {
				local16 = false;
			}
			if (arg1.anIntArray243 == null || arg1.anIntArray243[local18] == -1 || Static396.aClass359_2.method8415(arg0[local18]).anInt4870 >= Static396.aClass359_2.method8415(arg1.anIntArray243[local18]).anInt4870) {
				arg1.anIntArray243 = arg0;
				arg1.anInt2918 = arg2;
				arg1.anInt2973 = arg1.anInt2972;
			}
		}
		if (local16) {
			arg1.anInt2918 = arg2;
			arg1.anIntArray243 = arg0;
			arg1.anInt2973 = arg1.anInt2972;
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(Ljava/lang/String;Z)I")
	public static int method8887(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + Static181.method2917(arg0.charAt(local12)) - local10;
		}
		return local10;
	}
}
