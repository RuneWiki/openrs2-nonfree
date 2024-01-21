import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "[Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4[] aClass2_Sub2_Sub2_Sub4Array3;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4 aClass2_Sub2_Sub2_Sub4_2;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "[I")
	public static int[] anIntArray79 = new int[50];

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_82 = method257("Enter name of player to delete from list");

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public static int anInt304 = 0;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Lclient!o;")
	public static Class40 aClass40_83 = method257(" @yel@");

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
	public static int anInt308 = 0;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
	public static int anInt309 = 0;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "[Lclient!o;")
	public static Class40[] aClass40Array6 = new Class40[5];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method254() {
		aClass40_82 = null;
		Class11.anIntArray80 = null;
		anIntArray79 = null;
		aClass40Array6 = null;
		aClass2_Sub2_Sub2_Sub4Array3 = null;
		aClass40_83 = null;
		aClass2_Sub2_Sub2_Sub4_2 = null;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public static void method255() {
		for (@Pc(18) Class2_Sub7 local18 = (Class2_Sub7) Static92.aClass44_7.method1224(); local18 != null; local18 = (Class2_Sub7) Static92.aClass44_7.method1231()) {
			if (local18.anInt826 == -1) {
				local18.anInt827 = 0;
				Static4.method86(local18);
			} else {
				local18.method1677();
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/awt/Component;Lclient!bb;)V")
	public static void method256(@OriginalArg(1) Component arg0, @OriginalArg(2) Class7 arg1) {
		try {
			@Pc(8) Class24_Sub1 local8 = (Class24_Sub1) Class.forName("Class24_Sub1_Sub1").getDeclaredConstructor().newInstance();
			local8.method1088(arg1, 2048);
			Static80.aClass24_1 = local8;
		} catch (@Pc(21) Throwable local21) {
			try {
				Static80.aClass24_1 = new Class24_Sub1_Sub2(arg1, arg0);
			} catch (@Pc(29) Throwable local29) {
				if (Static8.aString4.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static80.aClass24_1 = new Class24_Sub2();
						return;
					} catch (@Pc(43) Throwable local43) {
					}
				}
				Static80.aClass24_1 = new Class24(8000);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!o;")
	public static Class40 method257(@OriginalArg(0) String arg0) {
		@Pc(2) byte[] local2 = arg0.getBytes();
		@Pc(9) int local9 = local2.length;
		@Pc(13) Class40 local13 = new Class40();
		local13.aByteArray14 = new byte[local9];
		@Pc(19) int local19 = 0;
		while (local19 < local9) {
			@Pc(27) int local27 = local2[local19++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local9 <= local19) {
					break;
				}
				@Pc(58) int local58 = local2[local19++] & 0xFF;
				local13.aByteArray14[local13.anInt1783++] = (byte) ((local27 - 40) * 43 + local58 - 48);
			} else {
				local13.aByteArray14[local13.anInt1783++] = (byte) local27;
			}
		}
		local13.method1183();
		return local13.method1165();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!ud;IB)Lclient!fc;")
	public static Class2_Sub2_Sub2_Sub2 method260(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2) {
		return Static92.method1484(arg2, arg1, arg0) ? Static21.method406() : null;
	}
}
