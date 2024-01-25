import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "Lclient!eea;")
	public static final Class71 aClass71_41 = new Class71();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)I")
	public static int method4179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4180(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(21) int local21 = 0; local21 < local8; local21++) {
			local10 = arg0.charAt(local21) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method4181() {
		for (@Pc(6) Class3_Sub16 local6 = (Class3_Sub16) Static529.aClass71_66.method2089(); local6 != null; local6 = (Class3_Sub16) Static529.aClass71_66.method2086()) {
			if (local6.aBoolean196) {
				local6.method2231();
			}
		}
		for (@Pc(30) Class3_Sub16 local30 = (Class3_Sub16) aClass71_41.method2089(); local30 != null; local30 = (Class3_Sub16) aClass71_41.method2086()) {
			if (local30.aBoolean196) {
				local30.method2231();
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZILjava/lang/String;I)V")
	public static void method4182(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		Static244.method4213(arg3, arg2, false, arg1, arg0, null);
	}
}
