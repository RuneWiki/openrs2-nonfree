import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILjava/awt/Canvas;I)Lclient!us;")
	public static Class2_Sub40 method366(@OriginalArg(0) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(16) Class local16 = Class.forName("mja");
			@Pc(20) Class2_Sub40 local20 = (Class2_Sub40) local16.getDeclaredConstructor().newInstance();
			local20.method7508(arg1, arg0, arg2);
			return local20;
		} catch (@Pc(29) Throwable local29) {
			@Pc(33) Class2_Sub40_Sub2 local33 = new Class2_Sub40_Sub2();
			local33.method7508(arg1, arg0, arg2);
			return local33;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)I")
	public static int method369(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(24) int local24 = (arg0 & 0x7F) * 96 >> 7;
		if (local24 < 2) {
			local24 = 2;
		} else if (local24 > 126) {
			local24 = 126;
		}
		return (arg0 & 0xFF80) + local24;
	}
}
