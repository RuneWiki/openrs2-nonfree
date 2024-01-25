import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class63 {

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)I")
	public int method1678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Static40.anInt758 <= arg0 ? arg0 : Static40.anInt758;
		if (Static382.aClass63_18 == this) {
			return 0;
		} else if (Static293.aClass63_14 == this) {
			return local10 - arg1;
		} else if (Static184.aClass63_9 == this) {
			return (local10 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
