import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class18 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)I")
	public int method282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = arg0 < Static151.anInt7983 ? Static151.anInt7983 : arg0;
		if (Static175.aClass18_16 == this) {
			return 0;
		} else if (Static409.aClass18_10 == this) {
			return local22 - arg1;
		} else if (Static24.aClass18_1 == this) {
			return (local22 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!al", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
