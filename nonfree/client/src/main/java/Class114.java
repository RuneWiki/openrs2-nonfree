import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class114 {

	@OriginalMember(owner = "client!fw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IBI)I")
	public int method2576(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = Static367.anInt6719 > arg1 ? Static367.anInt6719 : arg1;
		if (Static224.aClass114_4 == this) {
			return 0;
		} else if (Static498.aClass114_11 == this) {
			return local10 - arg0;
		} else if (Static298.aClass114_7 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
