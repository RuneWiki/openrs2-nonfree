import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class300 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)I")
	public int method6502(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 >= Static318.anInt5754 ? arg1 : Static318.anInt5754;
		if (Static120.aClass300_3 == this) {
			return 0;
		} else if (Static15.aClass300_2 == this) {
			return local10 - arg0;
		} else if (Static196.aClass300_9 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
