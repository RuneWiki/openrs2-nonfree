import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_27 = new Class186(58, 15);

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "Lclient!dn;")
	public static final Class11 aClass11_2 = Static65.method7159();

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
	public static int anInt1986 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZIIII)I")
	public static int method1905(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static290.aClass10Array7 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(19) int local19 = arg0 >> 7;
			@Pc(23) int local23 = arg3 >> 7;
			if (arg2 < 0 || arg4 < 0 || Static542.anInt9387 - 1 < arg2 || Static36.anInt1324 - 1 < arg4) {
				return 0;
			} else if (local19 >= 1 && local23 >= 1 && local19 <= Static542.anInt9387 - 1 && local23 <= Static36.anInt1324 - 1) {
				@Pc(85) boolean local85 = (Static542.aByteArrayArrayArray17[1][arg0 >> 7][arg3 >> 7] & 0x2) != 0;
				@Pc(110) boolean local110;
				@Pc(129) boolean local129;
				if ((arg0 & 0x7F) == 0) {
					local110 = (Static542.aByteArrayArrayArray17[1][local19 - 1][arg3 >> 7] & 0x2) != 0;
					local129 = (Static542.aByteArrayArrayArray17[1][local19][arg3 >> 7] & 0x2) != 0;
					if (local129 != local110) {
						local85 = (Static542.aByteArrayArrayArray17[1][arg2][arg4] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x7F) == 0) {
					local110 = (Static542.aByteArrayArrayArray17[1][arg0 >> 7][local23 - 1] & 0x2) != 0;
					local129 = (Static542.aByteArrayArrayArray17[1][arg0 >> 7][local23] & 0x2) != 0;
					if (local129 != local110) {
						local85 = (Static542.aByteArrayArrayArray17[1][arg2][arg4] & 0x2) != 0;
					}
				}
				if (local85) {
					arg1++;
				}
				return Static290.aClass10Array7[arg1].aa(arg0, arg3);
			} else {
				return 0;
			}
		} else {
			return Static290.aClass10Array7[arg1].aa(arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIBIIII)Lclient!qba;")
	public static Class25 method1906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(40) long local40 = (long) arg5 * 32147369L ^ (long) arg0 * 475427L ^ (long) arg3 * 67481L ^ (long) arg4 * 97549L ^ (long) arg2 * 986053L ^ (long) arg1 * 76724863L;
		@Pc(46) Class25 local46 = (Class25) Static286.aClass316_39.method7799(local40);
		if (local46 == null) {
			local46 = Static397.aClass9_6.method7608(arg3, arg4, arg0, arg2, arg5, arg1);
			Static286.aClass316_39.method7792(local40, local46);
			return local46;
		} else {
			return local46;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IJII)V")
	public static void method1909(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg1 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg1 >> 20 & 0x3;
		@Pc(24) int local24 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static76.method1968(arg0, 0, true, arg2, 0, local10, local17, 0);
			return;
		}
		@Pc(54) Class288 local54 = Static365.aClass194_6.method5084(local24);
		@Pc(70) int local70;
		@Pc(67) int local67;
		if (local17 == 0 || local17 == 2) {
			local67 = local54.anInt8343;
			local70 = local54.anInt8365;
		} else {
			local70 = local54.anInt8343;
			local67 = local54.anInt8365;
		}
		@Pc(80) int local80 = local54.anInt8360;
		if (local17 != 0) {
			local80 = (local80 << local17 & 0xF) + (local80 >> 4 - local17);
		}
		Static76.method1968(arg0, local67, true, arg2, local70, 0, 0, local80);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I")
	public static int method1912(@OriginalArg(1) int arg0) {
		@Pc(21) int local21 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(27) int local27 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (arg0 * local27 >> 12) + 40960;
		return local21 * local35 >> 12;
	}
}
