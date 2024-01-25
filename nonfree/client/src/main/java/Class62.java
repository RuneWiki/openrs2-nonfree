import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class62 {

	@OriginalMember(owner = "client!ct", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)I")
	public int method1173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 < Static140.anInt2937 ? Static140.anInt2937 : arg0;
		if (Static338.aClass62_12 == this) {
			return 0;
		} else if (Static299.aClass62_11 == this) {
			return local14 - arg1;
		} else if (Static249.aClass62_6 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
