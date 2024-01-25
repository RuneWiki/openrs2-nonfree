import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vea")
public final class Class347 {

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BII)I")
	public int method7305(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 >= Static187.anInt8962 ? arg0 : Static187.anInt8962;
		if (Static9.aClass347_1 == this) {
			return 0;
		} else if (Static404.aClass347_9 == this) {
			return local14 - arg1;
		} else if (Static488.aClass347_10 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
