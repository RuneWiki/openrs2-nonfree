import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class49 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIB)I")
	public int method1326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Static180.anInt4051 > arg0 ? Static180.anInt4051 : arg0;
		if (Static516.aClass49_13 == this) {
			return 0;
		} else if (Static268.aClass49_12 == this) {
			return local10 - arg1;
		} else if (Static45.aClass49_1 == this) {
			return (local10 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ce", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
