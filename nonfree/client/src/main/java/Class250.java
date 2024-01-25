import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class250 {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(III)I")
	public int method6077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22 = arg1 < Static375.anInt7256 ? Static375.anInt7256 : arg1;
		if (Static34.aClass250_1 == this) {
			return 0;
		} else if (Static405.aClass250_8 == this) {
			return local22 - arg0;
		} else if (Static484.aClass250_11 == this) {
			return (local22 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!op", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
