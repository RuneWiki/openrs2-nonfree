import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class322 {

	@OriginalMember(owner = "client!tca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(III)I")
	public int method6534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = Static172.anInt2621 > arg0 ? Static172.anInt2621 : arg0;
		if (Static12.aClass322_1 == this) {
			return 0;
		} else if (Static445.aClass322_10 == this) {
			return local19 - arg1;
		} else if (Static398.aClass322_8 == this) {
			return (local19 - arg1) / 2;
		} else {
			return 0;
		}
	}
}
