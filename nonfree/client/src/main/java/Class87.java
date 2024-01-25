import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public final class Class87 {

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "[I")
	public int[] anIntArray96;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "J")
	public long aLong64;

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class87(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.anIntArray96 = arg1;
		this.aShortArray30 = arg3;
		this.aLong64 = arg0;
		this.aShortArray29 = arg2;
	}

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
	private Class87() {
	}
}
