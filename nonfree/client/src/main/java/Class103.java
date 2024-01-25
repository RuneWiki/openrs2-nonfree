import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class103 {

	@OriginalMember(owner = "client!fe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)I")
	public int method3186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 >= Static19.anInt352 ? arg0 : Static19.anInt352;
		if (Static429.aClass103_8 == this) {
			return 0;
		} else if (Static342.aClass103_5 == this) {
			return local14 - arg1;
		} else if (Static27.aClass103_1 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
