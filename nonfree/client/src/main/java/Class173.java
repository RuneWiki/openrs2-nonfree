import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class173 {

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IBI)I")
	public int method4706(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 < Static235.anInt5298 ? Static235.anInt5298 : arg0;
		if (Static538.aClass173_12 == this) {
			return 0;
		} else if (Static342.aClass173_8 == this) {
			return local14 - arg1;
		} else if (Static502.aClass173_10 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
