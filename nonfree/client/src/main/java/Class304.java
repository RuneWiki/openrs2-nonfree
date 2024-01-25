import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class304 {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)I")
	public int method7463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = Static575.anInt9435 <= arg1 ? arg1 : Static575.anInt9435;
		if (Static536.aClass304_12 == this) {
			return 0;
		} else if (Static335.aClass304_11 == this) {
			return local22 - arg0;
		} else if (Static63.aClass304_6 == this) {
			return (local22 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
