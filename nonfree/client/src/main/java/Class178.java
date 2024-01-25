import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public final class Class178 {

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIB)I")
	public int method5000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21 = Static256.anInt5669 <= arg1 ? arg1 : Static256.anInt5669;
		if (Static618.aClass178_13 == this) {
			return 0;
		} else if (Static268.aClass178_7 == this) {
			return local21 - arg0;
		} else if (Static566.aClass178_11 == this) {
			return (local21 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
