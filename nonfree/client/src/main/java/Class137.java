import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class137 {

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)I")
	public int method2982(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = Static476.anInt8045 > arg0 ? Static476.anInt8045 : arg0;
		if (Static53.aClass137_3 == this) {
			return 0;
		} else if (Static270.aClass137_6 == this) {
			return local16 - arg1;
		} else if (Static560.aClass137_11 == this) {
			return (local16 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
