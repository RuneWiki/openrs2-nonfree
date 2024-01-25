import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class361 {

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IBI)I")
	public int method8101(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = arg0 < Static511.anInt8548 ? Static511.anInt8548 : arg0;
		if (Static632.aClass361_13 == this) {
			return 0;
		} else if (Static241.aClass361_7 == this) {
			return local22 - arg1;
		} else if (Static624.aClass361_12 == this) {
			return (local22 - arg1) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
