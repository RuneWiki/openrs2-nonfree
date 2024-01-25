import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class15 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)I")
	public int method259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = Static190.anInt3576 > arg1 ? Static190.anInt3576 : arg1;
		if (Static277.aClass15_8 == this) {
			return 0;
		} else if (Static522.aClass15_11 == this) {
			return local19 - arg0;
		} else if (Static75.aClass15_5 == this) {
			return (local19 - arg0) / 2;
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
