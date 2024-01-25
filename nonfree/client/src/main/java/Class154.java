import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class154 {

	@OriginalMember(owner = "client!ja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)I")
	public int method3814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static34.anInt3201 > arg1 ? Static34.anInt3201 : arg1;
		if (Static580.aClass154_15 == this) {
			return 0;
		} else if (Static232.aClass154_11 == this) {
			return local14 - arg0;
		} else if (Static511.aClass154_14 == this) {
			return (local14 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
