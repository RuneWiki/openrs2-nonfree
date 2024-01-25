import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class293 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZII)I")
	public int method7212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = Static330.anInt6254 > arg0 ? Static330.anInt6254 : arg0;
		if (Static527.aClass293_10 == this) {
			return 0;
		} else if (Static595.aClass293_13 == this) {
			return local14 - arg1;
		} else if (Static406.aClass293_7 == this) {
			return (local14 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
