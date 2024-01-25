import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class247 {

	@OriginalMember(owner = "client!pd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I")
	public int method5723(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg0 >= Static196.anInt4059 ? arg0 : Static196.anInt4059;
		if (Static160.aClass247_4 == this) {
			return 0;
		} else if (Static66.aClass247_2 == this) {
			return local19 - arg1;
		} else if (Static339.aClass247_9 == this) {
			return (local19 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
