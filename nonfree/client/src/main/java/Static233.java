import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "Lclient!nl;")
	public static Class171 aClass171_53;

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "Lclient!nl;")
	public static Class171 aClass171_54;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "[Lclient!nc;")
	public static final Class2_Sub10_Sub12[] aClass2_Sub10_Sub12Array5 = new Class2_Sub10_Sub12[14];

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "Lclient!cf;")
	public static final Class30 aClass30_34 = new Class30();

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
	public static int anInt4156 = 0;

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_58 = new Class32(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!gf;)V")
	public static void method3791(@OriginalArg(1) Class1_Sub5_Sub1_Sub1 arg0) {
		@Pc(17) Class2_Sub29 local17 = (Class2_Sub29) Static367.aClass246_32.method5613((long) arg0.anInt6413);
		if (local17 == null) {
			return;
		}
		if (local17.aClass2_Sub2_Sub2_3 != null) {
			Static324.aClass2_Sub2_Sub1_2.method58(local17.aClass2_Sub2_Sub2_3);
			local17.aClass2_Sub2_Sub2_3 = null;
		}
		local17.method5617();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method3792(@OriginalArg(1) long arg0) {
		Static176.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static176.aCalendar1.get(7);
		@Pc(17) int local17 = Static176.aCalendar1.get(5);
		@Pc(21) int local21 = Static176.aCalendar1.get(2);
		@Pc(25) int local25 = Static176.aCalendar1.get(1);
		@Pc(29) int local29 = Static176.aCalendar1.get(11);
		@Pc(33) int local33 = Static176.aCalendar1.get(12);
		@Pc(37) int local37 = Static176.aCalendar1.get(13);
		return Static150.aStringArray77[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static121.aStringArray69[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	public static void method3794() {
		Static262.anIntArray890 = Static72.method4060(0.4F);
	}
}
