import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class86 {

	@OriginalMember(owner = "client!ec", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)I")
	public int method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = Static423.anInt7984 <= arg0 ? arg0 : Static423.anInt7984;
		if (Static310.aClass86_7 == this) {
			return 0;
		} else if (Static589.aClass86_11 == this) {
			return local15 - arg1;
		} else if (Static224.aClass86_5 == this) {
			return (local15 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
