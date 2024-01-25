import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vea")
public final class Class368 {

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IBI)I")
	public int method8776(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static631.anInt10283 <= arg1 ? arg1 : Static631.anInt10283;
		if (Static404.aClass368_9 == this) {
			return 0;
		} else if (Static298.aClass368_7 == this) {
			return local15 - arg0;
		} else if (Static48.aClass368_2 == this) {
			return (local15 - arg0) / 2;
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
