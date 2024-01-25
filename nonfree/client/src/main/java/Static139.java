import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!il", name = "a", descriptor = "I")
	public static int anInt2886 = -1;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_57 = new Class93("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!il", name = "k", descriptor = "I")
	public static int anInt2893 = -1;

	@OriginalMember(owner = "client!il", name = "n", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_90 = new Class119(64);

	@OriginalMember(owner = "client!il", name = "o", descriptor = "I")
	public static int anInt2896 = 0;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
	public static void method2751() {
		if (Static183.anInt3622 != 2) {
			try {
				Static358.method3(Static293.aClient1, "tbrefresh");
			} catch (@Pc(21) Throwable local21) {
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!dg;I)Lclient!r;")
	public static Class2_Sub2 method2754(@OriginalArg(0) Class2_Sub10 arg0) {
		arg0.method4421();
		@Pc(13) int local13 = arg0.method4421();
		@Pc(17) Class2_Sub2 local17 = Static84.method1905(local13);
		local17.anInt6821 = arg0.method4421();
		@Pc(30) int local30 = arg0.method4421();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			@Pc(38) int local38 = arg0.method4421();
			local17.method5882(local38, arg0);
		}
		local17.method5877();
		return local17;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	public static void method2755() {
		for (@Pc(7) int local7 = 0; local7 < Static169.anInt3463; local7++) {
			@Pc(13) int local13 = Static98.anIntArray215[local7];
			@Pc(17) Class62_Sub1_Sub2_Sub1 local17 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local13];
			if (local17 != null) {
				Static46.method1095(local17, local17.aClass186_1.anInt5977);
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
	public static void method2757(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub11_Sub19 local13 = Static306.method5411(9, arg0);
		local13.method5539();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/awt/Frame;ILclient!rd;)V")
	public static void method2759(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class168 arg1) {
		while (true) {
			@Pc(6) Class193 local6 = arg1.method4832(arg0);
			while (local6.anInt6293 == 0) {
				Static102.method2276(10L);
			}
			if (local6.anInt6293 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static102.method2276(100L);
		}
	}
}
