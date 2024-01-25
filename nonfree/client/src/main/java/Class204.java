import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class204 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)I")
	public int method4964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 >= Static254.anInt4283 ? arg1 : Static254.anInt4283;
		if (Static239.aClass204_7 == this) {
			return 0;
		} else if (Static435.aClass204_12 == this) {
			return local14 - arg0;
		} else if (Static107.aClass204_1 == this) {
			return (local14 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!le", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
