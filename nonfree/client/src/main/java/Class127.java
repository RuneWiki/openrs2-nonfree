import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class127 {

	@OriginalMember(owner = "client!haa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIB)I")
	public int method3682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Static277.anInt5899 <= arg1 ? arg1 : Static277.anInt5899;
		if (Static610.aClass127_19 == this) {
			return 0;
		} else if (Static201.aClass127_14 == this) {
			return local10 - arg0;
		} else if (Static544.aClass127_15 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
