import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIILclient!in;)Lclient!oea;")
	public static Class239 method1704(@OriginalArg(0) int arg0, @OriginalArg(3) Class157 arg1) {
		@Pc(9) byte[] local9 = arg1.method4564(arg0, 0);
		return local9 == null ? null : new Class239(local9);
	}
}
