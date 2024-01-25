import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "Lclient!jf;")
	public static Class128 aClass128_1;

	@OriginalMember(owner = "client!kv", name = "h", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_94 = new Class209("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method3374(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) long local11 = (long) 0;
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			local11 = (local11 << 5) + (long) arg0.charAt(local13) - local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZIIII)V")
	public static void method3375(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 >= Static8.anInt223 && Static184.anInt3600 >= arg3 && Static430.anInt7123 <= arg2 && arg4 <= Static181.anInt3543) {
			Static51.method874(arg0, arg1, arg3, arg4, arg2);
		} else {
			Static70.method1326(arg0, arg3, arg1, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)Lclient!vr;")
	public static Class3_Sub5 method3376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static440.aClass106ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub5_1;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
	public static void method3379() {
		for (@Pc(14) Class2_Sub11 local14 = (Class2_Sub11) Static362.aClass14_42.method309(); local14 != null; local14 = (Class2_Sub11) Static362.aClass14_42.method311()) {
			if (local14.anInt1612 > 0) {
				local14.anInt1612--;
			}
			if (local14.anInt1612 != 0) {
				if (local14.anInt1609 > 0) {
					local14.anInt1609--;
				}
				if (local14.anInt1609 == 0 && local14.anInt1614 >= 1 && local14.anInt1615 >= 1 && Static229.anInt4427 - 2 >= local14.anInt1614 && local14.anInt1615 <= Static379.anInt6422 - 2 && (local14.anInt1606 < 0 || Static260.method3919(local14.anInt1606, local14.anInt1608))) {
					Static330.method4568(local14.anInt1613, local14.anInt1606, local14.anInt1614, -1, local14.anInt1615, local14.anInt1602, local14.anInt1611, local14.anInt1608);
					local14.anInt1609 = -1;
					if (local14.anInt1606 == local14.anInt1616 && local14.anInt1616 == -1) {
						local14.method5866();
					} else if (local14.anInt1616 == local14.anInt1606 && local14.anInt1602 == local14.anInt1605 && local14.anInt1608 == local14.anInt1610) {
						local14.method5866();
					}
				}
			} else if (local14.anInt1616 < 0 || Static260.method3919(local14.anInt1616, local14.anInt1610)) {
				Static330.method4568(local14.anInt1613, local14.anInt1616, local14.anInt1614, -1, local14.anInt1615, local14.anInt1605, local14.anInt1611, local14.anInt1610);
				local14.method5866();
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(BLclient!ol;II)Lclient!eh;")
	public static Class2_Sub5_Sub5 method3380(@OriginalArg(1) Class182 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anInt5135 | arg1 << 8;
		@Pc(19) Class2_Sub5_Sub5 local19 = (Class2_Sub5_Sub5) Static158.aClass147_1.method3340((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(36) byte[] local36 = Static424.aClass160_81.method3711(Static424.aClass160_81.method3702(local10));
		if (local36 == null) {
			local10 = arg0.anInt5135 | arg2 + 65536 << 8;
			local19 = (Class2_Sub5_Sub5) Static158.aClass147_1.method3340((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local36 = Static424.aClass160_81.method3711(Static424.aClass160_81.method3702(local10));
			if (local36 == null) {
				local10 = arg0.anInt5135 | 0xFFFF00;
				local19 = (Class2_Sub5_Sub5) Static158.aClass147_1.method3340((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local36 = Static424.aClass160_81.method3711(Static424.aClass160_81.method3702(local10));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local19 = Static384.method5099(local36);
					local19.aClass182_30 = arg0;
					Static158.aClass147_1.method3336(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				local19 = Static384.method5099(local36);
				local19.aClass182_30 = arg0;
				Static158.aClass147_1.method3336(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local19 = Static384.method5099(local36);
			local19.aClass182_30 = arg0;
			Static158.aClass147_1.method3336(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZI)V")
	public static void method3381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class2_Sub5_Sub13 local15 = Static208.method3306(arg0, 12);
		local15.method4547();
		local15.anInt5641 = arg1;
	}
}
