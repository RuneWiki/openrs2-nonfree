import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public final class Class101 {

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "[I")
	public int[] anIntArray179;

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "J")
	public long aLong80;

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class101(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray35 = arg3;
		this.anIntArray179 = arg1;
		this.aLong80 = arg0;
		this.aShortArray36 = arg2;
	}

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "()V")
	private Class101() {
	}
}
