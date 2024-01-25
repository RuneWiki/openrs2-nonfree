import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!gt;IIBI)V")
	public static void method4196(@OriginalArg(0) int arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class4_Sub27 local7 = null;
		for (@Pc(14) Class4_Sub27 local14 = (Class4_Sub27) Static450.aClass163_49.method3639(); local14 != null; local14 = (Class4_Sub27) Static450.aClass163_49.method3640()) {
			if (local14.anInt4668 == arg0 && arg3 == local14.anInt4663 && arg4 == local14.anInt4666 && local14.anInt4662 == arg2) {
				local7 = local14;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class4_Sub27();
			local7.anInt4666 = arg4;
			local7.anInt4662 = arg2;
			local7.anInt4663 = arg3;
			local7.anInt4668 = arg0;
			Static450.aClass163_49.method3646(local7);
		}
		local7.aBoolean348 = false;
		local7.aBoolean347 = true;
		local7.aClass141_1 = arg1;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method4197(@OriginalArg(0) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static665.anInt10447 > 0) {
			local16 = Static193.aByteArrayArray11[--Static665.anInt10447];
			Static193.aByteArrayArray11[Static665.anInt10447] = null;
			return local16;
		} else if (arg0 == 5000 && Static614.anInt9422 > 0) {
			local16 = Static289.aByteArrayArray14[--Static614.anInt9422];
			Static289.aByteArrayArray14[Static614.anInt9422] = null;
			return local16;
		} else if (arg0 == 30000 && Static123.anInt2301 > 0) {
			local16 = Static279.aByteArrayArray13[--Static123.anInt2301];
			Static279.aByteArrayArray13[Static123.anInt2301] = null;
			return local16;
		} else {
			if (Static552.aByteArrayArrayArray17 != null) {
				for (@Pc(72) int local72 = 0; local72 < Static169.anIntArray218.length; local72++) {
					if (Static169.anIntArray218[local72] == arg0 && Static211.anIntArray728[local72] > 0) {
						@Pc(102) byte[] local102 = Static552.aByteArrayArrayArray17[local72][--Static211.anIntArray728[local72]];
						Static552.aByteArrayArrayArray17[local72][Static211.anIntArray728[local72]] = null;
						return local102;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I[B)V")
	public static synchronized void method4198(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static665.anInt10447 < 1000) {
			Static193.aByteArrayArray11[Static665.anInt10447++] = arg0;
		} else if (arg0.length == 5000 && Static614.anInt9422 < 250) {
			Static289.aByteArrayArray14[Static614.anInt9422++] = arg0;
		} else if (arg0.length == 30000 && Static123.anInt2301 < 50) {
			Static279.aByteArrayArray13[Static123.anInt2301++] = arg0;
		} else if (Static552.aByteArrayArrayArray17 != null) {
			for (@Pc(71) int local71 = 0; local71 < Static169.anIntArray218.length; local71++) {
				if (arg0.length == Static169.anIntArray218[local71] && Static552.aByteArrayArrayArray17[local71].length > Static211.anIntArray728[local71]) {
					Static552.aByteArrayArrayArray17[local71][Static211.anIntArray728[local71]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZIII)I")
	public static int method4199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static140.aClass42Array4 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(23) int local23 = arg3 >> 9;
			@Pc(27) int local27 = arg2 >> 9;
			if (arg0 < 0 || arg4 < 0 || arg0 > Static224.anInt3557 - 1 || Static267.anInt4309 - 1 < arg4) {
				return 0;
			} else if (local23 >= 1 && local27 >= 1 && Static224.anInt3557 - 1 >= local23 && Static267.anInt4309 - 1 >= local27) {
				@Pc(90) boolean local90 = (Static47.aByteArrayArrayArray3[1][arg3 >> 9][arg2 >> 9] & 0x2) != 0;
				@Pc(115) boolean local115;
				@Pc(134) boolean local134;
				if ((arg3 & 0x1FF) == 0) {
					local115 = (Static47.aByteArrayArrayArray3[1][local23 - 1][arg2 >> 9] & 0x2) != 0;
					local134 = (Static47.aByteArrayArrayArray3[1][local23][arg2 >> 9] & 0x2) != 0;
					if (local115 != local134) {
						local90 = (Static47.aByteArrayArrayArray3[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if ((arg2 & 0x1FF) == 0) {
					local115 = (Static47.aByteArrayArrayArray3[1][arg3 >> 9][local27 - 1] & 0x2) != 0;
					local134 = (Static47.aByteArrayArrayArray3[1][arg3 >> 9][local27] & 0x2) != 0;
					if (local134 != local115) {
						local90 = (Static47.aByteArrayArrayArray3[1][arg0][arg4] & 0x2) != 0;
					}
				}
				if (local90) {
					arg1++;
				}
				return Static140.aClass42Array4[arg1].method7453(arg3, arg2);
			} else {
				return 0;
			}
		} else {
			return Static140.aClass42Array4[arg1].method7453(arg3, arg2);
		}
	}
}
