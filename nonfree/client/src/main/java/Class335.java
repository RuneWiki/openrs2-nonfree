import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class335 {

	@OriginalMember(owner = "client!ut", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIB)I")
	public int method7396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Static130.anInt2566 <= arg0 ? arg0 : Static130.anInt2566;
		if (Static224.aClass335_17 == this) {
			return 0;
		} else if (Static511.aClass335_18 == this) {
			return local10 - arg1;
		} else if (Static59.aClass335_5 == this) {
			return (local10 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
