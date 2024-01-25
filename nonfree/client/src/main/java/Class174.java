import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public final class Class174 {

	@OriginalMember(owner = "client!ija", name = "b", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!ija", name = "c", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!ija", name = "f", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!ija", name = "d", descriptor = "J")
	public long aLong154;

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class174(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray50 = arg3;
		this.aShortArray49 = arg2;
		this.anIntArray269 = arg1;
		this.aLong154 = arg0;
	}

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "()V")
	private Class174() {
	}
}
