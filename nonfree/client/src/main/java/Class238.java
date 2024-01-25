import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class238 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)I")
	public int method5892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(23) int local23 = arg1 >= Static274.anInt3226 ? arg1 : Static274.anInt3226;
		if (Static607.aClass238_12 == this) {
			return 0;
		} else if (Static375.aClass238_8 == this) {
			return local23 - arg0;
		} else if (Static275.aClass238_7 == this) {
			return (local23 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
