import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!m", name = "f", descriptor = "I")
	public static int anInt1671;

	@OriginalMember(owner = "client!m", name = "H", descriptor = "[Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array35;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	public static int anInt1669 = -1;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!v;")
	public static Class62 aClass62_723 = Static45.method753("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!m", name = "h", descriptor = "I")
	public static int anInt1672 = 0;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!v;")
	public static Class62 aClass62_724 = Static45.method753("(U1");

	@OriginalMember(owner = "client!m", name = "n", descriptor = "Lclient!v;")
	public static Class62 aClass62_725 = Static45.method753("Um ein neues Spielkonto zu erstellen)1 m\u001c1ssen Sie");

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Lclient!v;")
	private static Class62 aClass62_726 = Static45.method753("flash2:");

	@OriginalMember(owner = "client!m", name = "p", descriptor = "Lclient!v;")
	private static Class62 aClass62_727 = Static45.method753("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!m", name = "u", descriptor = "I")
	public static int anInt1679 = 0;

	@OriginalMember(owner = "client!m", name = "z", descriptor = "Lclient!v;")
	public static Class62 aClass62_728 = Static45.method753("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!m", name = "B", descriptor = "Lclient!v;")
	public static Class62 aClass62_729 = aClass62_727;

	@OriginalMember(owner = "client!m", name = "D", descriptor = "[I")
	public static int[] anIntArray173 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!m", name = "E", descriptor = "Lclient!v;")
	public static Class62 aClass62_730 = aClass62_726;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	public static void method1023() {
		Static18.anInt686 = 0;
		@Pc(12) int local12 = (Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882 >> 7) + Static2.anInt56;
		@Pc(23) int local23 = Static41.anInt1196 + (Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local23 >= 3056 && local23 <= 3136) {
			Static18.anInt686 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local23 >= 9492 && local23 <= 9535) {
			Static18.anInt686 = 1;
		}
		if (Static18.anInt686 == 1 && local12 >= 3139 && local12 <= 3199 && local23 >= 3008 && local23 <= 3062) {
			Static18.anInt686 = 0;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLclient!mb;II)Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4 method1026(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static16.method442(arg0, arg2, arg1) ? Static74.method1198() : null;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V")
	public static void method1027() {
		aClass62_723 = null;
		aClass62_724 = null;
		aClass62_729 = null;
		anIntArray173 = null;
		aClass3_Sub1_Sub1_Sub4Array35 = null;
		aClass62_730 = null;
		aClass62_727 = null;
		aClass62_726 = null;
		aClass62_725 = null;
		aClass62_728 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZI[BI)V")
	public static void method1028(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (Static55.aClass38_1 == null) {
			return;
		}
		if (Static30.anInt974 >= 0) {
			Static78.anInt2074 = arg1;
			if (Static30.anInt974 == 0) {
				Static22.anInt745 = 1;
			} else {
				@Pc(25) int local25 = Static53.method830(Static30.anInt974);
				@Pc(29) int local29 = local25 - Static68.anInt1892;
				Static22.anInt745 = (local29 + 3600) / arg1;
				if (Static22.anInt745 < 1) {
					Static22.anInt745 = 1;
				}
			}
			Static10.aByteArray20 = arg2;
			Static44.aBoolean71 = arg0;
			Static59.anInt1620 = arg3;
		} else if (Static22.anInt745 == 0) {
			Static51.method1436(arg3, arg0, arg2);
		} else {
			Static59.anInt1620 = arg3;
			Static10.aByteArray20 = arg2;
			Static44.aBoolean71 = arg0;
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public static void method1030() {
		Static33.aClass34_12.method762();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!v;Lclient!v;Lclient!mb;I)[Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1[] method1031(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class42 arg2) {
		@Pc(8) int local8 = arg2.method1521(arg0);
		@Pc(21) int local21 = arg2.method1498(arg1, local8);
		return Static24.method507(local8, local21, arg2);
	}
}
