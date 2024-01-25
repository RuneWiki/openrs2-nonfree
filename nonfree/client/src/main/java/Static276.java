import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
	public static int anInt4800;

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "Lclient!tr;")
	public static Class110 aClass110_13;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "[Lclient!vn;")
	public static final Class239[] aClass239Array1 = new Class239[4];

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "[S")
	public static short[] aShortArray78 = new short[256];

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
	public static void method4308(@OriginalArg(0) int arg0) {
		if (Static175.anInt3065 == 0) {
			Static69.aClass3_Sub8_Sub4_1.method2157(arg0);
		} else {
			Static83.anInt1721 = arg0;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IB)I")
	public static int method4310(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4311(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) + arg0.charAt(local17) - local10;
		}
		return local10;
	}
}
