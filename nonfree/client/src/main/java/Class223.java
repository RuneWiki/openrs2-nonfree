import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class223 {

	@OriginalMember(owner = "client!lea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(III)I")
	public int method5074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = Static681.anInt10652 > arg1 ? Static681.anInt10652 : arg1;
		if (Static530.aClass223_10 == this) {
			return 0;
		} else if (Static57.aClass223_1 == this) {
			return local21 - arg0;
		} else if (Static334.aClass223_7 == this) {
			return (local21 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
