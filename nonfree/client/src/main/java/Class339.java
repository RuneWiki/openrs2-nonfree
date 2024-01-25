import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class339 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)I")
	public int method8222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = Static639.anInt10685 <= arg1 ? arg1 : Static639.anInt10685;
		if (Static91.aClass339_3 == this) {
			return 0;
		} else if (Static634.aClass339_12 == this) {
			return local10 - arg0;
		} else if (Static345.aClass339_9 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ti", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
