import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class346 {

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIB)I")
	public int method7688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = Static256.anInt4629 <= arg1 ? arg1 : Static256.anInt4629;
		if (Static137.aClass346_4 == this) {
			return 0;
		} else if (Static393.aClass346_10 == this) {
			return local11 - arg0;
		} else if (Static584.aClass346_13 == this) {
			return (local11 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
