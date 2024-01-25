import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public final class Class328 {

	@OriginalMember(owner = "client!sea", name = "f", descriptor = "[S")
	public short[] aShortArray118;

	@OriginalMember(owner = "client!sea", name = "d", descriptor = "[S")
	public short[] aShortArray117;

	@OriginalMember(owner = "client!sea", name = "j", descriptor = "J")
	public long aLong248;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "[I")
	public int[] anIntArray478;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class328(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray118 = arg2;
		this.aShortArray117 = arg3;
		this.aLong248 = arg0;
		this.anIntArray478 = arg1;
	}

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "()V")
	private Class328() {
	}
}
