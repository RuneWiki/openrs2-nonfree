import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class122 {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBI)I")
	public int method2394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = arg0 < Static499.anInt4149 ? Static499.anInt4149 : arg0;
		if (Static65.aClass122_3 == this) {
			return 0;
		} else if (Static192.aClass122_8 == this) {
			return local22 - arg1;
		} else if (Static68.aClass122_4 == this) {
			return (local22 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
