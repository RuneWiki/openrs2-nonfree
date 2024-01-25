import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class103 {

	@OriginalMember(owner = "client!fn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)I")
	public int method2391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 >= Static300.anInt5516 ? arg1 : Static300.anInt5516;
		if (Static407.aClass103_19 == this) {
			return 0;
		} else if (Static125.aClass103_6 == this) {
			return local18 - arg0;
		} else if (Static287.aClass103_13 == this) {
			return (local18 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
