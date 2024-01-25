import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class79 {

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(BII)I")
	public int method2054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static356.anInt6630 <= arg1 ? arg1 : Static356.anInt6630;
		if (Static274.aClass79_17 == this) {
			return 0;
		} else if (Static354.aClass79_6 == this) {
			return local15 - arg0;
		} else if (Static489.aClass79_18 == this) {
			return (local15 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ega", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
