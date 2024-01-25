import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class258 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZII)I")
	public int method6279(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 < Static554.anInt9828 ? Static554.anInt9828 : arg0;
		if (Static408.aClass258_6 == this) {
			return 0;
		} else if (Static528.aClass258_11 == this) {
			return local10 - arg1;
		} else if (Static443.aClass258_8 == this) {
			return (local10 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
