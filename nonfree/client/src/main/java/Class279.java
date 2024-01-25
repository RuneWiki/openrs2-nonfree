import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class279 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)I")
	public int method6456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = Static120.anInt2371 > arg0 ? Static120.anInt2371 : arg0;
		if (Static385.aClass279_12 == this) {
			return 0;
		} else if (Static504.aClass279_13 == this) {
			return local19 - arg1;
		} else if (Static305.aClass279_10 == this) {
			return (local19 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
