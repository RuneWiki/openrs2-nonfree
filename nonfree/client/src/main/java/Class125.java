import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class125 {

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IBI)I")
	public int method2842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static357.anInt5421 <= arg1 ? arg1 : Static357.anInt5421;
		if (Static624.aClass125_17 == this) {
			return 0;
		} else if (Static282.aClass125_10 == this) {
			return local15 - arg0;
		} else if (Static222.aClass125_13 == this) {
			return (local15 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ft", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
