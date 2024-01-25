import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method4590(@OriginalArg(2) String arg0) {
		return Static259.method2661(arg0, 16);
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)I")
	public static int method4591(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
	public static void method4592() {
		for (@Pc(12) Class12_Sub4 local12 = (Class12_Sub4) Static156.aClass22_5.method291(); local12 != null; local12 = (Class12_Sub4) Static156.aClass22_5.method292()) {
			local12.method1800();
		}
	}
}
