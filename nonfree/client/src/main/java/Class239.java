import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class239 {

	@OriginalMember(owner = "client!mfa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(III)I")
	public int method5836(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = Static295.anInt4558 <= arg0 ? arg0 : Static295.anInt4558;
		if (Static146.aClass239_5 == this) {
			return 0;
		} else if (Static621.aClass239_20 == this) {
			return local21 - arg1;
		} else if (Static726.aClass239_22 == this) {
			return (local21 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
