import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_96 = new Class322(98, 3);

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BI)V")
	public static void method5000(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class6 local14 = Static497.aClass74_58.method1404(); local14 != null; local14 = Static497.aClass74_58.method1405()) {
			if ((local14.aLong346 >> 48 & 0xFFFFL) == (long) arg0) {
				local14.method9051();
			}
		}
	}
}
