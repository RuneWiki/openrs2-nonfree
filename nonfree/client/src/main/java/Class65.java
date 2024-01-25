import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class65 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)I")
	public int method1786(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = Static483.anInt8181 <= arg0 ? arg0 : Static483.anInt8181;
		if (Static529.aClass65_16 == this) {
			return 0;
		} else if (Static90.aClass65_3 == this) {
			return local10 - arg1;
		} else if (Static296.aClass65_15 == this) {
			return (local10 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
