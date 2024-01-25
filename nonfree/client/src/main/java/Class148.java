import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class148 {

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BII)I")
	public int method3982(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static228.anInt4744 > arg0 ? Static228.anInt4744 : arg0;
		if (Static413.aClass148_9 == this) {
			return 0;
		} else if (Static246.aClass148_4 == this) {
			return local15 - arg1;
		} else if (Static58.aClass148_1 == this) {
			return (local15 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ida", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
