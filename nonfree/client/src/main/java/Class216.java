import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class216 {

	@OriginalMember(owner = "client!ma", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)I")
	public int method4653(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg1 >= Static594.anInt9806 ? arg1 : Static594.anInt9806;
		if (Static148.aClass216_6 == this) {
			return 0;
		} else if (Static564.aClass216_13 == this) {
			return local19 - arg0;
		} else if (Static321.aClass216_9 == this) {
			return (local19 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
