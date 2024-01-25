import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class168 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIB)I")
	public int method3716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 >= Static561.anInt9759 ? arg1 : Static561.anInt9759;
		if (Static119.aClass168_4 == this) {
			return 0;
		} else if (Static225.aClass168_7 == this) {
			return local10 - arg0;
		} else if (Static56.aClass168_1 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!in", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
