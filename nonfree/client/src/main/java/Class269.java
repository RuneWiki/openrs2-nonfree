import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class269 {

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "[I")
	public int[] anIntArray387;

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "J")
	public long aLong192;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class269(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray89 = arg2;
		this.aShortArray90 = arg3;
		this.anIntArray387 = arg1;
		this.aLong192 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
	private Class269() {
	}
}
