import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "[Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4[] aClass2_Sub2_Sub2_Sub4Array3;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4 aClass2_Sub2_Sub2_Sub4_2;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 17)
	public static void method254() {
		Class11.aClass40_82 = null;
		Class11.anIntArray80 = null;
		Class11.anIntArray79 = null;
		Class11.aClass40Array6 = null;
		aClass2_Sub2_Sub2_Sub4Array3 = null;
		Class11.aClass40_83 = null;
		aClass2_Sub2_Sub2_Sub4_2 = null;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 48)
	public static void method255() {
		for (@Pc(18) Class2_Sub7 local18 = (Class2_Sub7) Class45_Sub1.aClass44_7.method1224(); local18 != null; local18 = (Class2_Sub7) Class45_Sub1.aClass44_7.method1231()) {
			if (local18.anInt826 == -1) {
				local18.anInt827 = 0;
				Static4.method86(local18);
			} else {
				local18.method1677();
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/awt/Component;Lclient!bb;)V", line = 72)
	public static void method256(@OriginalArg(1) Component arg0, @OriginalArg(2) Class7 arg1) {
		try {
			@Pc(8) Class24_Sub1 local8 = (Class24_Sub1) Class.forName("Class24_Sub1_Sub1").getDeclaredConstructor().newInstance();
			local8.method1088(arg1, 2048);
			Static72.aClass24_1 = local8;
		} catch (@Pc(21) Throwable local21) {
			try {
				Static72.aClass24_1 = new Class24_Sub1_Sub2(arg1, arg0);
			} catch (@Pc(29) Throwable local29) {
				if (Static8.aString4.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static72.aClass24_1 = new Class24_Sub2();
						return;
					} catch (@Pc(43) Throwable local43) {
					}
				}
				Static72.aClass24_1 = new Class24(8000);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!o;", line = 118)
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

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!ud;IB)Lclient!fc;", line = 340)
	public static Class2_Sub2_Sub2_Sub2 method260(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2) {
		return Static84.method1484(arg2, arg1, arg0) ? Static20.method406() : null;
	}
}
