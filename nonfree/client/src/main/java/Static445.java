import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
	public static int anInt8114;

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "Lclient!pu;")
	public static Class244 aClass244_7;

	@OriginalMember(owner = "client!sca", name = "e", descriptor = "Lclient!dj;")
	public static Class71 aClass71_4;

	@OriginalMember(owner = "client!sca", name = "i", descriptor = "Lclient!mc;")
	public static Class198 aClass198_14;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IBI)V")
	public static void method6724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class12_Sub4_Sub1 local8 = Static389.method6156(7, arg0);
		local8.method820();
		local8.anInt806 = arg1;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
	public static void method6725() {
		for (@Pc(5) int local5 = 0; local5 < 100; local5++) {
			Static154.aBooleanArray31[local5] = true;
		}
	}
}
