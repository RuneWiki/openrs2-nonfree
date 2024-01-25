import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class275 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
	public int method6449(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = Static32.anInt510 > arg0 ? Static32.anInt510 : arg0;
		if (Static69.aClass275_18 == this) {
			return 0;
		} else if (Static321.aClass275_12 == this) {
			return local16 - arg1;
		} else if (Static370.aClass275_15 == this) {
			return (local16 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
