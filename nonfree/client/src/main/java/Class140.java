import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class140 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I")
	public int method3723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 < Static447.anInt7372 ? Static447.anInt7372 : arg0;
		if (Static318.aClass140_9 == this) {
			return 0;
		} else if (Static356.aClass140_12 == this) {
			return local14 - arg1;
		} else if (Static523.aClass140_17 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
