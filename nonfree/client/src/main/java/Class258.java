import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class258 {

	@OriginalMember(owner = "client!nv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(III)I")
	public int method6293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = arg0 >= Static563.anInt4939 ? arg0 : Static563.anInt4939;
		if (Static3.aClass258_1 == this) {
			return 0;
		} else if (Static419.aClass258_14 == this) {
			return local21 - arg1;
		} else if (Static7.aClass258_2 == this) {
			return (local21 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
