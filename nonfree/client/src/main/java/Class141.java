import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class141 {

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "J")
	public long aLong107;

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "[I")
	public int[] anIntArray243;

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class141(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aLong107 = arg0;
		this.anIntArray243 = arg1;
		this.aShortArray41 = arg3;
		this.aShortArray42 = arg2;
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
	private Class141() {
	}
}
