import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
	public static int anInt9137;

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "[I")
	public static int[] anIntArray673;

	@OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
	public static int anInt9147;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_143 = new Class45(111, 8);

	@OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
	public static int anInt9146 = 0;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method7528(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				local15++;
			} else if (local23 <= '\u07ff') {
				local15 += 2;
			} else {
				local15 += 3;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "(I)V")
	public static void method7534() {
		Static540.anInt9595 = 0;
		Static141.anInt3151 = -1;
		Static273.anInt5444 = -1;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!daa;B)V")
	public static void method7539(@OriginalArg(0) Class12_Sub8 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Static527.anInt9426; local1++) {
			@Pc(9) int local9 = arg0.method5218();
			@Pc(13) int local13 = arg0.method5199();
			if (local13 == 65535) {
				local13 = -1;
			}
			if (Static502.aClass23_Sub1Array2[local9] != null) {
				Static502.aClass23_Sub1Array2[local9].anInt5189 = local13;
			}
		}
	}
}
