import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class11 {

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "[S")
	public short[] aShortArray4;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "J")
	public long aLong6;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "[S")
	public short[] aShortArray3;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
	public int[] anIntArray20;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class11(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray4 = arg3;
		this.aLong6 = arg0;
		this.aShortArray3 = arg2;
		this.anIntArray20 = arg1;
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	private Class11() {
	}
}
