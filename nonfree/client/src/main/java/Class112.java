import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class112 {

	@OriginalMember(owner = "client!fda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(III)I")
	public int method2278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 >= Static563.anInt9176 ? arg0 : Static563.anInt9176;
		if (Static67.aClass112_2 == this) {
			return 0;
		} else if (Static374.aClass112_15 == this) {
			return local10 - arg1;
		} else if (Static60.aClass112_1 == this) {
			return (local10 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
