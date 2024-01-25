import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "Lclient!pga;")
	public static Class264 aClass264_2;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
	public static int anInt8118 = 0;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public static void method7011() {
		@Pc(3) Class139[] local3 = Class66_Sub1.aClass139Array1;
		synchronized (Class66_Sub1.aClass139Array1) {
			for (@Pc(14) int local14 = 0; local14 < Class66_Sub1.aClass139Array1.length; local14++) {
				Class66_Sub1.aClass139Array1[local14] = new Class139();
				Static55.anIntArray64[local14] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!ida;B)I")
	public static int method7013(@OriginalArg(0) Class3_Sub7_Sub13 arg0) {
		@Pc(14) String local14 = Static424.method6731(arg0);
		return Static426.aClass93_11.method2319(Static307.aClass103Array12, local14);
	}
}
