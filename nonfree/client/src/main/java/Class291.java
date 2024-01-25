import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class291 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BII)I")
	public int method6524(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 >= Static632.anInt9867 ? arg0 : Static632.anInt9867;
		if (Static81.aClass291_1 == this) {
			return 0;
		} else if (Static452.aClass291_10 == this) {
			return local14 - arg1;
		} else if (Static436.aClass291_11 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ps", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
