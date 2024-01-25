import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class83 {

	@OriginalMember(owner = "client!eda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(IBI)I")
	public int method2416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static109.anInt2357 > arg0 ? Static109.anInt2357 : arg0;
		if (Static52.aClass83_4 == this) {
			return 0;
		} else if (Static106.aClass83_7 == this) {
			return local14 - arg1;
		} else if (Static533.aClass83_12 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
