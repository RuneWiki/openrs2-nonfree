import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!lj;")
	public static Class12 aClass12_2;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BII)Z")
	public static boolean method3257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public static void method3260() {
		for (@Pc(14) Class3_Sub18 local14 = (Class3_Sub18) Static220.aClass112_25.method3088(); local14 != null; local14 = (Class3_Sub18) Static220.aClass112_25.method3084()) {
			if (local14.aBoolean265) {
				local14.method3023();
			}
		}
		for (@Pc(38) Class3_Sub18 local38 = (Class3_Sub18) Static350.aClass112_47.method3088(); local38 != null; local38 = (Class3_Sub18) Static350.aClass112_47.method3084()) {
			if (local38.aBoolean265) {
				local38.method3023();
			}
		}
	}
}
