import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class4 {

	@OriginalMember(owner = "client!aba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(BII)I")
	public int method49(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg0 >= Static316.anInt8165 ? arg0 : Static316.anInt8165;
		if (Static14.aClass4_1 == this) {
			return 0;
		} else if (Static22.aClass4_2 == this) {
			return local19 - arg1;
		} else if (Static636.aClass4_13 == this) {
			return (local19 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
