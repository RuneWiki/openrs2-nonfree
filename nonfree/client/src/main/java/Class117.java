import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class117 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZII)I")
	public int method3782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static114.anInt2970 <= arg0 ? arg0 : Static114.anInt2970;
		if (Static332.aClass117_11 == this) {
			return 0;
		} else if (Static568.aClass117_12 == this) {
			return local14 - arg1;
		} else if (Static285.aClass117_9 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
