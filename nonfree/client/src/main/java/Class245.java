import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nha")
public final class Class245 {

	@OriginalMember(owner = "client!nha", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IBI)I")
	public int method5486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static345.anInt5827 > arg0 ? Static345.anInt5827 : arg0;
		if (Static125.aClass245_3 == this) {
			return 0;
		} else if (Static3.aClass245_15 == this) {
			return local15 - arg1;
		} else if (Static440.aClass245_13 == this) {
			return (local15 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
