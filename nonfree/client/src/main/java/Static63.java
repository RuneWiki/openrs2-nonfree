import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
	public static int anInt1302;

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "Lclient!fd;")
	public static Class72 aClass72_6;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_19 = new Class154(64);

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Lclient!mn;")
	public static Class4_Sub29 aClass4_Sub29_1 = null;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)V")
	public static void method1076(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class4_Sub1_Sub8 local16 = Static155.method2994(arg0, 13);
		local16.method2031();
		local16.anInt2410 = arg1;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method1077(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) - (local15 - Static269.method4692(arg0.charAt(local17)));
		}
		return local15;
	}
}
