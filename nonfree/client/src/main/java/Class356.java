import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class356 {

	@OriginalMember(owner = "client!ur", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIB)I")
	public int method8711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = Static312.anInt5191 > arg1 ? Static312.anInt5191 : arg1;
		if (Static400.aClass356_12 == this) {
			return 0;
		} else if (Static374.aClass356_9 == this) {
			return local14 - arg0;
		} else if (Static240.aClass356_4 == this) {
			return (local14 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
