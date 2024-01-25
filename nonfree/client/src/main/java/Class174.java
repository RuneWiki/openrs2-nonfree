import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class174 {

	@OriginalMember(owner = "client!jg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)I")
	public int method4260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = Static571.anInt9399 <= arg0 ? arg0 : Static571.anInt9399;
		if (Static495.aClass174_13 == this) {
			return 0;
		} else if (Static201.aClass174_9 == this) {
			return local19 - arg1;
		} else if (Static146.aClass174_5 == this) {
			return (local19 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
