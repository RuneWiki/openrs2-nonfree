import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!co", name = "c", descriptor = "I")
	public static int anInt1632;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "I")
	public static volatile int anInt1630 = -1;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_33 = new Class151(29, 8);

	@OriginalMember(owner = "client!co", name = "e", descriptor = "I")
	public static int anInt1633 = 0;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIZB)V")
	public static void method1621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (Static407.aFrame5 != null && (arg0 != 3 || Static449.anInt7009 != arg2 || Static224.anInt3559 != arg1)) {
			Static494.method6885(Static239.aClass207_2, Static407.aFrame5);
			Static407.aFrame5 = null;
		}
		if (arg0 == 3 && Static407.aFrame5 == null) {
			Static407.aFrame5 = Static374.method4923(arg2, 0, Static239.aClass207_2, arg1);
			if (Static407.aFrame5 != null) {
				Static224.anInt3559 = arg1;
				Static449.anInt7009 = arg2;
				Static361.method4808();
			}
		}
		if (arg0 == 3 && Static407.aFrame5 == null) {
			method1621(Static124.aClass4_Sub20_4.aClass8_Sub21_2.method7121(), -1, -1, arg3, true);
			return;
		}
		@Pc(79) Container local79;
		@Pc(96) Insets local96;
		if (Static407.aFrame5 != null) {
			Static599.anInt9215 = arg1;
			local79 = Static407.aFrame5;
			Static553.anInt8551 = arg2;
		} else if (Static280.aFrame10 == null) {
			if (Static649.anApplet2 == null) {
				local79 = Static333.anApplet_Sub1_1;
			} else {
				local79 = Static649.anApplet2;
			}
			Static553.anInt8551 = local79.getSize().width;
			Static599.anInt9215 = local79.getSize().height;
		} else {
			local96 = Static280.aFrame10.getInsets();
			@Pc(102) int local102 = -local96.left;
			Static553.anInt8551 = Static280.aFrame10.getSize().width + local102 - local96.right;
			Static599.anInt9215 = Static280.aFrame10.getSize().height - local96.top - local96.bottom;
			local79 = Static280.aFrame10;
		}
		if (arg0 == 1) {
			Static661.anInt9530 = (Static553.anInt8551 - Static606.anInt9314) / 2;
			Static357.anInt5421 = Static353.anInt5368;
			Static632.anInt9867 = Static606.anInt9314;
			Static435.anInt6854 = 0;
		} else {
			Static613.method8031();
		}
		if (Static181.aClass60_3 != Static215.aClass60_4) {
			@Pc(162) boolean local162;
			if (Static632.anInt9867 < 1024 && Static357.anInt5421 < 768) {
				local162 = true;
			} else {
				local162 = false;
			}
		}
		if (arg4) {
			Static294.method4171();
		} else {
			Static17.aCanvas1.setSize(Static632.anInt9867, Static357.anInt5421);
			if (Static423.aBoolean517) {
				Static87.method1771(Static17.aCanvas1);
			} else {
				Static582.aClass33_13.method8098(Static17.aCanvas1, Static632.anInt9867, Static357.anInt5421);
			}
			if (local79 == Static280.aFrame10) {
				local96 = Static280.aFrame10.getInsets();
				Static17.aCanvas1.setLocation(local96.left + Static661.anInt9530, local96.top - -Static435.anInt6854);
			} else {
				Static17.aCanvas1.setLocation(Static661.anInt9530, Static435.anInt6854);
			}
		}
		if (arg0 < 2) {
			Static420.aBoolean509 = false;
		} else {
			Static420.aBoolean509 = true;
		}
		if (anInt1630 != -1) {
			Static470.method6503(true);
		}
		if (Static375.aClass192_2 != null && Static310.method4317(Static656.anInt10356)) {
			Static654.method8727();
		}
		for (@Pc(238) int local238 = 0; local238 < 100; local238++) {
			Static109.aBooleanArray4[local238] = true;
		}
		Static172.aBoolean223 = true;
	}
}
