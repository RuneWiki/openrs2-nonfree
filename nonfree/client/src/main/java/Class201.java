import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class201 {

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZI)I")
	public int method4868(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = Static492.anInt8445 > arg1 ? Static492.anInt8445 : arg1;
		if (Static199.aClass201_9 == this) {
			return 0;
		} else if (Static309.aClass201_12 == this) {
			return local10 - arg0;
		} else if (Static62.aClass201_6 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
