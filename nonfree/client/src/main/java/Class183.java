import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class183 {

	@OriginalMember(owner = "client!jn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBI)I")
	public int method4291(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 >= Static408.anInt7118 ? arg1 : Static408.anInt7118;
		if (Static47.aClass183_1 == this) {
			return 0;
		} else if (Static352.aClass183_10 == this) {
			return local14 - arg0;
		} else if (Static471.aClass183_11 == this) {
			return (local14 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
