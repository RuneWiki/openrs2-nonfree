import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "I")
	public static int anInt6297 = -1;

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_83 = new Class160(5, 4);

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBI)I")
	public static int method5356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (arg1 + local12) / arg0 - local12;
	}
}
