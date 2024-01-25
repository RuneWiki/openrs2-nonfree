import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class50 {

	@OriginalMember(owner = "client!cga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIB)I")
	public int method1701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = Static330.anInt6165 <= arg1 ? arg1 : Static330.anInt6165;
		if (Static63.aClass50_6 == this) {
			return 0;
		} else if (Static405.aClass50_14 == this) {
			return local19 - arg0;
		} else if (Static454.aClass50_12 == this) {
			return (local19 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
