import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class216 {

	@OriginalMember(owner = "client!kr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)I")
	public int method5030(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 < Static272.anInt5005 ? Static272.anInt5005 : arg0;
		if (Static639.aClass216_13 == this) {
			return 0;
		} else if (Static613.aClass216_12 == this) {
			return local11 - arg1;
		} else if (Static110.aClass216_6 == this) {
			return (local11 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
