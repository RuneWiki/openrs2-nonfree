import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class72 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)I")
	public int method1433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 < Static154.anInt2867 ? Static154.anInt2867 : arg0;
		if (Static442.aClass72_10 == this) {
			return 0;
		} else if (Static482.aClass72_11 == this) {
			return local14 - arg1;
		} else if (Static173.aClass72_4 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
