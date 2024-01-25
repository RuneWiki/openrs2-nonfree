import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class297 {

	@OriginalMember(owner = "client!rt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)I")
	public int method6544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 >= Static2.anInt29 ? arg1 : Static2.anInt29;
		if (Static288.aClass297_6 == this) {
			return 0;
		} else if (Static506.aClass297_11 == this) {
			return local10 - arg0;
		} else if (Static61.aClass297_1 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
