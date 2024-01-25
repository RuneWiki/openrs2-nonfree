import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class60 {

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZII)I")
	public int method2078(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 < Static313.anInt6355 ? Static313.anInt6355 : arg0;
		if (Static220.aClass60_6 == this) {
			return 0;
		} else if (Static487.aClass60_9 == this) {
			return local14 - arg1;
		} else if (Static603.aClass60_11 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
