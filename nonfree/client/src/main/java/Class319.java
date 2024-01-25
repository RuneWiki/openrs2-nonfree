import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class319 {

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)I")
	public int method7077(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = Static240.anInt4852 <= arg0 ? arg0 : Static240.anInt4852;
		if (Static533.aClass319_14 == this) {
			return 0;
		} else if (Static306.aClass319_7 == this) {
			return local10 - arg1;
		} else if (Static49.aClass319_3 == this) {
			return (local10 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
