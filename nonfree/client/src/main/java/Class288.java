import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class288 {

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BII)I")
	public int method6878(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static438.anInt7403 <= arg0 ? arg0 : Static438.anInt7403;
		if (Static166.aClass288_5 == this) {
			return 0;
		} else if (Static25.aClass288_1 == this) {
			return local14 - arg1;
		} else if (Static50.aClass288_2 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
