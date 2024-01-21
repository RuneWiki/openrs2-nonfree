import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!b", name = "T", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!b", name = "Z", descriptor = "[Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!b", name = "db", descriptor = "Lclient!pa;")
	public static Class35_Sub1 aClass35_Sub1_6;

	@OriginalMember(owner = "client!b", name = "S", descriptor = "I")
	public static int anInt389 = 0;

	@OriginalMember(owner = "client!b", name = "U", descriptor = "Lclient!id;")
	public static Class34 aClass34_194 = Static9.method266("Konfig geladen)3");

	@OriginalMember(owner = "client!b", name = "V", descriptor = "Lclient!id;")
	public static Class34 aClass34_195 = Static9.method266("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!b", name = "Y", descriptor = "Lclient!id;")
	public static Class34 aClass34_196 = Static9.method266("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!b", name = "bb", descriptor = "Lclient!id;")
	public static Class34 aClass34_197 = Static9.method266("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!b", name = "cb", descriptor = "Lclient!id;")
	public static Class34 aClass34_198 = Static9.method266("l");

	@OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
	public static int anInt393 = 0;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)V")
	public static void method228(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static26.method496(arg0)) {
			return;
		}
		@Pc(19) Class1_Sub9[] local19 = Static41.aClass1_Sub9ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class1_Sub9 local27 = local19[local21];
			if (local27.anObjectArray8 != null) {
				@Pc(34) Class1_Sub5 local34 = new Class1_Sub5();
				local34.aClass1_Sub9_3 = local27;
				local34.anObjectArray1 = local27.anObjectArray8;
				Static56.method1567(local34);
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILjava/awt/Component;I)Lclient!vf;")
	public static Class6 method229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class6_Sub2");
			@Pc(15) Class6 local15 = (Class6) local11.getDeclaredConstructor().newInstance();
			local15.method1356(arg1, arg2, arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class6_Sub1 local28 = new Class6_Sub1();
			local28.method1356(arg1, arg2, arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
	public static void method230() {
		aClass1_Sub1_Sub2_Sub1Array1 = null;
		aClass34_194 = null;
		aClass34_197 = null;
		aByteArrayArrayArray1 = null;
		aClass34_196 = null;
		aClass35_Sub1_6 = null;
		aClass34_195 = null;
		aClass34_198 = null;
	}
}
