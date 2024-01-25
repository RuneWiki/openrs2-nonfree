import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class79 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)I")
	public int method2610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Static294.anInt6026 > arg0 ? Static294.anInt6026 : arg0;
		if (Static431.aClass79_17 == this) {
			return 0;
		} else if (Static646.aClass79_25 == this) {
			return local10 - arg1;
		} else if (Static627.aClass79_23 == this) {
			return (local10 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
