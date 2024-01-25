import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class309 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIB)I")
	public int method7817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 < Static81.anInt2497 ? Static81.anInt2497 : arg0;
		if (Static65.aClass309_14 == this) {
			return 0;
		} else if (Static5.aClass309_1 == this) {
			return local14 - arg1;
		} else if (Static348.aClass309_8 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
