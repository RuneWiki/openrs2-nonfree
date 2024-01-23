import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!di", name = "k", descriptor = "Lclient!k;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "I")
	public static int anInt797 = 0;

	@OriginalMember(owner = "client!di", name = "m", descriptor = "I")
	public static int anInt806 = 0;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Z")
	public static boolean method587(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIILclient!qf;IZJ)Z")
	public static boolean method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class5 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static144.anIntArrayArrayArray7 == Static100.anIntArrayArrayArray5;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (@Pc(13) int local13 = arg2; local13 < arg2 + arg4; local13++) {
				if (local10 < 0 || local13 < 0 || local10 >= Static173.anInt3981 || local13 >= Static159.anInt4174) {
					return false;
				}
				@Pc(34) Class2_Sub12 local34 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][local10][local13];
				if (local34 != null && local34.anInt775 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class100 local58 = new Class100();
		local58.aLong169 = arg11;
		local58.anInt4516 = arg0;
		local58.anInt4522 = arg5;
		local58.anInt4520 = arg6;
		local58.anInt4519 = arg7;
		local58.aClass5_8 = arg8;
		local58.anInt4526 = arg9;
		local58.anInt4529 = arg1;
		local58.anInt4517 = arg2;
		local58.anInt4525 = arg1 + arg3 - 1;
		local58.anInt4528 = arg2 + arg4 - 1;
		@Pc(104) int local104;
		@Pc(107) int local107;
		for (@Pc(101) int local101 = arg1; local101 < arg1 + arg3; local101++) {
			for (local104 = arg2; local104 < arg2 + arg4; local104++) {
				local107 = 0;
				if (local101 > arg1) {
					local107++;
				}
				if (local101 < arg1 + arg3 - 1) {
					local107 += 4;
				}
				if (local104 > arg2) {
					local107 += 8;
				}
				if (local104 < arg2 + arg4 - 1) {
					local107 += 2;
				}
				for (@Pc(133) int local133 = arg0; local133 >= 0; local133--) {
					if (Static226.aClass2_Sub12ArrayArrayArray3[local133][local101][local104] == null) {
						Static226.aClass2_Sub12ArrayArrayArray3[local133][local101][local104] = new Class2_Sub12(local133, local101, local104);
					}
				}
				@Pc(166) Class2_Sub12 local166 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][local101][local104];
				local166.aClass100Array3[local166.anInt775] = local58;
				local166.anIntArray128[local166.anInt775] = local107;
				local166.anInt762 |= local107;
				local166.anInt775++;
				if (local6 && Static160.anIntArrayArray35[local101][local104] != 0) {
					local8 = Static160.anIntArrayArray35[local101][local104];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local104 = arg1; local104 < arg1 + arg3; local104++) {
				for (local107 = arg2; local107 < arg2 + arg4; local107++) {
					if (Static160.anIntArrayArray35[local104][local107] == 0) {
						Static160.anIntArrayArray35[local104][local107] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static38.aClass100Array2[Static49.anInt897++] = local58;
		}
		return true;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	public static void method590() {
		for (@Pc(6) Class2_Sub14 local6 = (Class2_Sub14) Static10.aClass44_5.method1359(); local6 != null; local6 = (Class2_Sub14) Static10.aClass44_5.method1356()) {
			if (local6.aBoolean34) {
				local6.method645();
			}
		}
		for (@Pc(33) Class2_Sub14 local33 = (Class2_Sub14) Static49.aClass44_11.method1359(); local33 != null; local33 = (Class2_Sub14) Static49.aClass44_11.method1356()) {
			if (local33.aBoolean34) {
				local33.method645();
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(II)I")
	public static int method591(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
