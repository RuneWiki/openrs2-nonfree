import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class189 {

	@OriginalMember(owner = "client!jk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)I")
	public int method4461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 >= Static85.anInt9921 ? arg0 : Static85.anInt9921;
		if (Static512.aClass189_11 == this) {
			return 0;
		} else if (Static411.aClass189_10 == this) {
			return local18 - arg1;
		} else if (Static33.aClass189_1 == this) {
			return (local18 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
