import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class56 {

	@OriginalMember(owner = "client!cf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I")
	public int method1354(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static222.anInt4196 <= arg0 ? arg0 : Static222.anInt4196;
		if (Static180.aClass56_6 == this) {
			return 0;
		} else if (Static68.aClass56_1 == this) {
			return local14 - arg1;
		} else if (Static307.aClass56_9 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
