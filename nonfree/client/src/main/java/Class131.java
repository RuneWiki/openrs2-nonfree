import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class131 {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)I")
	public int method3034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = Static13.anInt306 > arg1 ? Static13.anInt306 : arg1;
		if (Static263.aClass131_10 == this) {
			return 0;
		} else if (Static388.aClass131_19 == this) {
			return local15 - arg0;
		} else if (Static152.aClass131_25 == this) {
			return (local15 - arg0) / 2;
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
