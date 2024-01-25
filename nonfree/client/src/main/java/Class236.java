import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class236 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)I")
	public int method6431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = Static406.anInt7570 <= arg1 ? arg1 : Static406.anInt7570;
		if (Static343.aClass236_5 == this) {
			return 0;
		} else if (Static295.aClass236_2 == this) {
			return local18 - arg0;
		} else if (Static379.aClass236_8 == this) {
			return (local18 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
