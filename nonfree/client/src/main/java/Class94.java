import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class94 {

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "[I")
	public int[] anIntArray178;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "J")
	public long aLong80;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class94(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray57 = arg2;
		this.aShortArray56 = arg3;
		this.anIntArray178 = arg1;
		this.aLong80 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	private Class94() {
	}
}
