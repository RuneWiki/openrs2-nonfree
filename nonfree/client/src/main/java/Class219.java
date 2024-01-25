import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class219 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)I")
	public int method5206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static70.anInt1125 <= arg1 ? arg1 : Static70.anInt1125;
		if (Static127.aClass219_6 == this) {
			return 0;
		} else if (Static39.aClass219_2 == this) {
			return local15 - arg0;
		} else if (Static543.aClass219_11 == this) {
			return (local15 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
