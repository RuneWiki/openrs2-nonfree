import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class314 {

	@OriginalMember(owner = "client!tl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BII)I")
	public int method7035(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = Static443.anInt7718 > arg1 ? Static443.anInt7718 : arg1;
		if (Static43.aClass314_1 == this) {
			return 0;
		} else if (Static88.aClass314_2 == this) {
			return local10 - arg0;
		} else if (Static296.aClass314_6 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
