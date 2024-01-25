import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class237 {

	@OriginalMember(owner = "client!oca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(III)I")
	public int method6027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Static294.anInt10217 > arg1 ? Static294.anInt10217 : arg1;
		if (Static553.aClass237_13 == this) {
			return 0;
		} else if (Static443.aClass237_9 == this) {
			return local14 - arg0;
		} else if (Static222.aClass237_3 == this) {
			return (local14 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
