import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public final class Class194 {

	@OriginalMember(owner = "client!js", name = "c", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!js", name = "b", descriptor = "J")
	public long aLong150;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "[I")
	public int[] anIntArray294;

	@OriginalMember(owner = "client!js", name = "d", descriptor = "[S")
	public short[] aShortArray65;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class194(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray66 = arg3;
		this.aLong150 = arg0;
		this.anIntArray294 = arg1;
		this.aShortArray65 = arg2;
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	private Class194() {
	}
}
