import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!co", name = "n", descriptor = "I")
	public static int anInt1289 = 0;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIJZLclient!wu;II)V")
	public static void method1241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2, @OriginalArg(5) Class384 arg3) {
		Static617.aBoolean818 = false;
		Static198.anInt3546 = 0;
		Static583.aClass5_Sub16_Sub1_6 = null;
		Static598.anInt9770 = 0;
		Static30.aLong19 = arg2;
		Static166.aClass384_43 = arg3;
		Static3.anInt29 = 10000;
		Static571.anInt9391 = 1;
		Static210.anInt3640 = arg1;
		Static474.anInt7949 = arg0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZLjava/lang/String;BLjava/lang/String;)V")
	public static void method1243(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static358.aString114 = arg2;
		Static94.aString145 = arg1;
		Static592.aBoolean844 = arg0;
		if (!Static592.aBoolean844 && (Static358.aString114.equals("") || Static94.aString145.equals(""))) {
			Static43.method745(3);
			return;
		}
		Static156.aBoolean236 = false;
		if (Static264.anInt4388 != 1) {
			Static133.anInt3877 = -1;
			Static596.anInt9738 = 0;
		}
		Static43.method745(-3);
		Static548.anInt9084 = 1;
		Static100.anInt1576 = 0;
		Static334.anInt5792 = 0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZB)V")
	public static void method1244(@OriginalArg(0) boolean arg0) {
		for (@Pc(15) Class5_Sub52 local15 = (Class5_Sub52) Static250.aClass306_16.method7313(); local15 != null; local15 = (Class5_Sub52) Static250.aClass306_16.method7301()) {
			if (local15.aClass5_Sub16_Sub2_4 != null) {
				Static287.aClass5_Sub16_Sub3_1.method6144(local15.aClass5_Sub16_Sub2_4);
				local15.aClass5_Sub16_Sub2_4 = null;
			}
			if (local15.aClass5_Sub16_Sub2_3 != null) {
				Static287.aClass5_Sub16_Sub3_1.method6144(local15.aClass5_Sub16_Sub2_3);
				local15.aClass5_Sub16_Sub2_3 = null;
			}
			local15.method8911();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class5_Sub52 local54 = (Class5_Sub52) Static573.aClass306_59.method7313(); local54 != null; local54 = (Class5_Sub52) Static573.aClass306_59.method7301()) {
			if (local54.aClass5_Sub16_Sub2_4 != null) {
				Static287.aClass5_Sub16_Sub3_1.method6144(local54.aClass5_Sub16_Sub2_4);
				local54.aClass5_Sub16_Sub2_4 = null;
			}
			local54.method8911();
		}
		for (@Pc(81) Class5_Sub52 local81 = (Class5_Sub52) Static616.aClass81_73.method1608(); local81 != null; local81 = (Class5_Sub52) Static616.aClass81_73.method1610()) {
			if (local81.aClass5_Sub16_Sub2_4 != null) {
				Static287.aClass5_Sub16_Sub3_1.method6144(local81.aClass5_Sub16_Sub2_4);
				local81.aClass5_Sub16_Sub2_4 = null;
			}
			local81.method8911();
		}
	}
}
