import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oea")
public final class Class252 {

	@OriginalMember(owner = "client!oea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(III)I")
	public int method6014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Static71.anInt1925 <= arg1 ? arg1 : Static71.anInt1925;
		if (Static285.aClass252_9 == this) {
			return 0;
		} else if (Static104.aClass252_2 == this) {
			return local14 - arg0;
		} else if (Static648.aClass252_13 == this) {
			return (local14 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
