import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eha")
public final class Class97 {

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(III)I")
	public int method2304(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 >= Class16_Sub1_Sub5_Sub1.lb ? arg1 : Class16_Sub1_Sub5_Sub1.lb;
		if (Static57.aClass97_1 == this) {
			return 0;
		} else if (Static399.aClass97_12 == this) {
			return local10 - arg0;
		} else if (Static313.aClass97_14 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eha", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
