import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "[Lclient!kt;")
	public static final Class6_Sub2_Sub8[] aClass6_Sub2_Sub8Array3 = new Class6_Sub2_Sub8[14];

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "S")
	public static short aShort2 = 205;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method656() {
		Static242.aClass44_33.method1351();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method657() {
		if (!Static91.method1639()) {
			return;
		}
		if (Static406.aStringArray46 == null) {
			Static379.method5650();
		}
		Static125.aBoolean171 = true;
		Static326.anInt5607 = 0;
		try {
			Static221.aClipboard1 = Static448.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(25) Exception local25) {
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIII)I")
	public static int method660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static55.aClass86Array1 == null) {
			return 0;
		} else if (arg3 < 3) {
			@Pc(19) int local19 = arg4 >> 7;
			@Pc(23) int local23 = arg2 >> 7;
			if (arg0 < 0 || arg1 < 0 || Static181.anInt3574 - 1 < arg0 || Static117.anInt2450 - 1 < arg1) {
				return 0;
			} else if (local19 >= 1 && local23 >= 1 && local19 <= Static181.anInt3574 - 1 && Static117.anInt2450 - 1 >= local23) {
				@Pc(87) boolean local87 = (Static203.aByteArrayArrayArray11[1][arg4 >> 7][arg2 >> 7] & 0x2) != 0;
				@Pc(115) boolean local115;
				@Pc(131) boolean local131;
				if ((arg4 & 0x7F) == 0) {
					local115 = (Static203.aByteArrayArrayArray11[1][local19 - 1][arg2 >> 7] & 0x2) != 0;
					local131 = (Static203.aByteArrayArrayArray11[1][local19][arg2 >> 7] & 0x2) != 0;
					if (local115 != local131) {
						local87 = (Static203.aByteArrayArrayArray11[1][arg0][arg1] & 0x2) != 0;
					}
				}
				if ((arg2 & 0x7F) == 0) {
					local115 = (Static203.aByteArrayArrayArray11[1][arg4 >> 7][local23 - 1] & 0x2) != 0;
					local131 = (Static203.aByteArrayArrayArray11[1][arg4 >> 7][local23] & 0x2) != 0;
					if (local115 != local131) {
						local87 = (Static203.aByteArrayArrayArray11[1][arg0][arg1] & 0x2) != 0;
					}
				}
				if (local87) {
					arg3++;
				}
				return Static55.aClass86Array1[arg3].method6590(arg4, arg2);
			} else {
				return 0;
			}
		} else {
			return Static55.aClass86Array1[arg3].method6590(arg4, arg2);
		}
	}
}
