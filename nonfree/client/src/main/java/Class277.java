import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class277 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)I")
	public int method6409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = Static502.anInt8364 <= arg0 ? arg0 : Static502.anInt8364;
		if (Static315.aClass277_4 == this) {
			return 0;
		} else if (Static330.aClass277_6 == this) {
			return local15 - arg1;
		} else if (Static415.aClass277_8 == this) {
			return (local15 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
