import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class35 {

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "J")
	public long aLong28;

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "[S")
	public short[] aShortArray17;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "[S")
	public short[] aShortArray16;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "[I")
	public int[] anIntArray60;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class35(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aLong28 = arg0;
		this.aShortArray17 = arg3;
		this.aShortArray16 = arg2;
		this.anIntArray60 = arg1;
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	private Class35() {
	}
}
