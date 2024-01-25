import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class266 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)I")
	public int method5919(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 >= Static531.anInt8327 ? arg0 : Static531.anInt8327;
		if (Static94.aClass266_5 == this) {
			return 0;
		} else if (Static119.aClass266_7 == this) {
			return local14 - arg1;
		} else if (Static67.aClass266_4 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!og", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
