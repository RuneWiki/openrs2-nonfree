import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class214 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)I")
	public int method5005(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 >= Static71.anInt1872 ? arg0 : Static71.anInt1872;
		if (Static40.aClass214_2 == this) {
			return 0;
		} else if (Static382.aClass214_9 == this) {
			return local14 - arg1;
		} else if (Static449.aClass214_12 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
