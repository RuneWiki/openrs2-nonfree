import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class306 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIZ)I")
	public int method6899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Static153.anInt2747 > arg1 ? Static153.anInt2747 : arg1;
		if (Static173.aClass306_14 == this) {
			return 0;
		} else if (Static523.aClass306_11 == this) {
			return local10 - arg0;
		} else if (Static503.aClass306_10 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
