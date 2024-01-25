import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class238 {

	@OriginalMember(owner = "client!og", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZ)I")
	public int method6456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = arg0 < Static321.anInt6137 ? Static321.anInt6137 : arg0;
		if (Static480.aClass238_12 == this) {
			return 0;
		} else if (Static132.aClass238_3 == this) {
			return local19 - arg1;
		} else if (Static555.aClass238_13 == this) {
			return (local19 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
