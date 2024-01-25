import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class100 {

	@OriginalMember(owner = "client!ffa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IBI)I")
	public int method2801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg0 < Static582.anInt10234 ? Static582.anInt10234 : arg0;
		if (Static585.aClass100_13 == this) {
			return 0;
		} else if (Static276.aClass100_4 == this) {
			return local19 - arg1;
		} else if (Static459.aClass100_10 == this) {
			return (local19 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
