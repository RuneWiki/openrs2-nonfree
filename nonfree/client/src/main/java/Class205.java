import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kka")
public final class Class205 {

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(III)I")
	public int method5049(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 < Static506.anInt8791 ? Static506.anInt8791 : arg0;
		if (Static591.aClass205_17 == this) {
			return 0;
		} else if (Static272.aClass205_15 == this) {
			return local11 - arg1;
		} else if (Static1.aClass205_12 == this) {
			return (local11 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kka", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
