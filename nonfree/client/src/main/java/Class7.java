import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public final class Class7 {

	@OriginalMember(owner = "client!ada", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIB)I")
	public int method247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 < Static449.anInt7506 ? Static449.anInt7506 : arg0;
		if (Class2_Sub1_Sub4_Sub1.lb == this) {
			return 0;
		} else if (Static513.aClass7_10 == this) {
			return local10 - arg1;
		} else if (Static656.aClass7_12 == this) {
			return (local10 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
