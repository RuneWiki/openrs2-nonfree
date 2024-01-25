import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class352 {

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IBI)I")
	public int method7803(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = Static76.anInt1720 > arg0 ? Static76.anInt1720 : arg0;
		if (Static472.aClass352_10 == this) {
			return 0;
		} else if (Static683.aClass352_13 == this) {
			return local21 - arg1;
		} else if (Static207.aClass352_3 == this) {
			return (local21 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!taa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
