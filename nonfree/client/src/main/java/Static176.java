import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!bt;IB)Lclient!ui;")
	public static Class4_Sub49 method2867(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method1255(arg1);
		return local8 == null ? null : new Class4_Sub49(local8);
	}
}
