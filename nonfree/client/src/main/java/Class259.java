import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class259 {

	@OriginalMember(owner = "client!or", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BII)I")
	public int method5515(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static349.anInt6422 <= arg1 ? arg1 : Static349.anInt6422;
		if (Static237.aClass259_7 == this) {
			return 0;
		} else if (Static427.aClass259_11 == this) {
			return local14 - arg0;
		} else if (Static591.aClass259_13 == this) {
			return (local14 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
