import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class318 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)I")
	public int method7565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 < Static535.anInt4128 ? Static535.anInt4128 : arg1;
		if (Static358.aClass318_13 == this) {
			return 0;
		} else if (Static65.aClass318_2 == this) {
			return local11 - arg0;
		} else if (Static450.aClass318_16 == this) {
			return (local11 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
