import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class249 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)I")
	public int method5777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Static308.anInt5171 <= arg1 ? arg1 : Static308.anInt5171;
		if (Static361.aClass249_22 == this) {
			return 0;
		} else if (Static271.aClass249_12 == this) {
			return local14 - arg0;
		} else if (Static559.aClass249_24 == this) {
			return (local14 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
