import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class92 {

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(III)I")
	public int method2199(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static654.anInt10064 > arg0 ? Static654.anInt10064 : arg0;
		if (Static338.aClass92_9 == this) {
			return 0;
		} else if (Static447.aClass92_12 == this) {
			return local15 - arg1;
		} else if (Static120.aClass92_2 == this) {
			return (local15 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
