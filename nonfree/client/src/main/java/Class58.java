import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class58 {

	@OriginalMember(owner = "client!cp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)I")
	public int method1299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 >= Static19.anInt390 ? arg1 : Static19.anInt390;
		if (Static15.aClass58_1 == this) {
			return 0;
		} else if (Static597.aClass58_15 == this) {
			return local15 - arg0;
		} else if (Static127.aClass58_12 == this) {
			return (local15 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
