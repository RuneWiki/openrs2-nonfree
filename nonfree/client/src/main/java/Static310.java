import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "Lclient!kea;")
	public static Class161 aClass161_61;

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
	public static int anInt6021;

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "[I")
	public static final int[] anIntArray537 = new int[14];

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "[I")
	public static int[] anIntArray538 = new int[1];

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
	public static void method5035() {
		Static235.anInt2721 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static485.aClass3_Sub27Array1[local14] = null;
			Static459.aByteArray96[local14] = 1;
			Static462.aClass89Array1[local14] = null;
		}
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V")
	public static void method5036() {
		@Pc(7) int local7 = Static235.anInt2721;
		@Pc(9) int[] local9 = Static130.anIntArray267;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class6_Sub1_Sub2_Sub1 local19 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static27.method795(local19, local19.method7083());
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5037(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static178.anInt4133 >= 200 && !Static107.aBoolean167 || Static178.anInt4133 >= 200) {
			Static356.method5583(Static329.aClass67_101.method1934(Static193.anInt7803));
			local30 = Static3.aClass67_6.method1934(Static193.anInt7803);
			if (local30 != null) {
				Static356.method5583(local30);
			}
			return;
		}
		local30 = Static329.method5266(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(91) String local91;
		for (@Pc(50) int local50 = 0; local50 < Static178.anInt4133; local50++) {
			@Pc(58) String local58 = Static329.method5266(Static520.aStringArray49[local50]);
			if (local58 != null && local58.equals(local30)) {
				Static356.method5583(arg0 + Static528.aClass67_149.method1934(Static193.anInt7803));
				return;
			}
			if (Static368.aStringArray40[local50] != null) {
				local91 = Static329.method5266(Static368.aStringArray40[local50]);
				if (local91 != null && local91.equals(local30)) {
					Static356.method5583(arg0 + Static528.aClass67_149.method1934(Static193.anInt7803));
					return;
				}
			}
		}
		for (@Pc(122) int local122 = 0; local122 < Static41.anInt1004; local122++) {
			local91 = Static329.method5266(Static241.aStringArray51[local122]);
			if (local91 != null && local91.equals(local30)) {
				Static356.method5583(Static146.aClass67_46.method1934(Static193.anInt7803) + arg0 + Static179.aClass67_73.method1934(Static193.anInt7803));
				return;
			}
			if (Static65.aStringArray11[local122] != null) {
				@Pc(166) String local166 = Static329.method5266(Static65.aStringArray11[local122]);
				if (local166 != null && local166.equals(local30)) {
					Static356.method5583(Static146.aClass67_46.method1934(Static193.anInt7803) + arg0 + Static179.aClass67_73.method1934(Static193.anInt7803));
					return;
				}
			}
		}
		if (Static329.method5266(Static111.aClass6_Sub1_Sub2_Sub1_3.aString27).equals(local30)) {
			Static356.method5583(Static303.aClass67_94.method1934(Static193.anInt7803));
		} else {
			Static278.method4791(Static210.aClass158_56);
			Static515.aClass3_Sub27_Sub1_2.method7576(Static274.method4751(arg0));
			Static515.aClass3_Sub27_Sub1_2.method7608(arg0);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)Z")
	public static boolean method5038(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
