import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jha")
public final class Class176 {

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(III)I")
	public int method4289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Static585.anInt9606 <= arg1 ? arg1 : Static585.anInt9606;
		if (Static126.aClass176_5 == this) {
			return 0;
		} else if (Static527.aClass176_13 == this) {
			return local14 - arg0;
		} else if (Static519.aClass176_12 == this) {
			return (local14 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jha", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
