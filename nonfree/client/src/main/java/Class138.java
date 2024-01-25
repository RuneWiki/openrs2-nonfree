import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public final class Class138 {

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "[S")
	public short[] aShortArray63;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "J")
	public long aLong124;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "[I")
	public int[] anIntArray376;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class138(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray63 = arg2;
		this.aLong124 = arg0;
		this.anIntArray376 = arg1;
		this.aShortArray62 = arg3;
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	private Class138() {
	}
}
