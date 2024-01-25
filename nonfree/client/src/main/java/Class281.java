import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class281 {

	@OriginalMember(owner = "client!os", name = "f", descriptor = "[I")
	public static final int[] anIntArray541 = new int[4096];

	static {
		for (@Pc(43) int local43 = 0; local43 < 4096; local43++) {
			anIntArray541[local43] = Static156.method2242(local43);
		}
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(II)V")
	public Class281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!os", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
