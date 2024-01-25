import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "Lclient!kv;")
	public static Class195 aClass195_1;

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
	public static int anInt3168;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_62 = new Class298(47, -1);

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
	public static int anInt3171 = 1;

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
	public static final int anInt3173 = 1;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIII)I")
	public static int method2835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < arg1) {
			return arg1;
		} else if (arg2 <= arg0) {
			return arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
	public static void method2836(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static209.anInt8184 = 1;
		Static490.anInt7979 = -1;
		Static536.method7048(false, arg0, arg1);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZB)I")
	public static int method2837(@OriginalArg(0) boolean arg0) {
		if (Static22.anIntArray52 == null) {
			return 0;
		} else if (arg0 || Static129.aClass197Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(29) int local29 = 0; local29 < Static22.anIntArray52.length; local29++) {
				@Pc(35) int local35 = Static22.anIntArray52[local29];
				if (Static299.aClass246_141.method5667(local35)) {
					local20++;
				}
				if (Static350.aClass246_238.method5667(local35)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static22.anIntArray52.length * 2;
		}
	}
}
