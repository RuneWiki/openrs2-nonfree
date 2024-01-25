import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!kda", name = "x", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_85 = new Class133(49, -2);

	@OriginalMember(owner = "client!kda", name = "y", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_74 = new Class67("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IBI)Z")
	public static boolean method4224(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZII)Z")
	public static boolean method4227(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class242 local8 = Static454.aClass298_3.method7185(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method5980(arg0);
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(IBI)I")
	public static int method4228(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static301.method4970(arg0 + 91923, arg1 + 45365, 4) + (Static301.method4970(arg0 + 37821, arg1 + 10294, 2) + -128 >> 1) + (Static301.method4970(arg0, arg1, 1) + -128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)V")
	public static void method4229() {
		Static347.aBoolean419 = true;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(II)I")
	public static int method4231(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
