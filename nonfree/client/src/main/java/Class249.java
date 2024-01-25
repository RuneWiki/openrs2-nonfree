import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class249 {

	@OriginalMember(owner = "client!oe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)I")
	public int method6236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = Static348.anInt5935 <= arg0 ? arg0 : Static348.anInt5935;
		if (Static555.aClass249_13 == this) {
			return 0;
		} else if (Static640.aClass249_15 == this) {
			return local10 - arg1;
		} else if (Static134.aClass249_5 == this) {
			return (local10 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
