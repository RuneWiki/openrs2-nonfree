import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class347 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIZ)I")
	public int method7949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = arg0 < Static123.anInt9150 ? Static123.anInt9150 : arg0;
		if (Static501.aClass347_13 == this) {
			return 0;
		} else if (Static297.aClass347_8 == this) {
			return local19 - arg1;
		} else if (Static277.aClass347_7 == this) {
			return (local19 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
