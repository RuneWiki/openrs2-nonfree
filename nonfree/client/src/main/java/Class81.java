import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class81 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)I")
	public int method2034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Static79.anInt1140 > arg0 ? Static79.anInt1140 : arg0;
		if (Static663.aClass81_18 == this) {
			return 0;
		} else if (Static549.aClass81_16 == this) {
			return local14 - arg1;
		} else if (Static564.aClass81_15 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
