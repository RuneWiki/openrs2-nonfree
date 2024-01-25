import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class200 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "[S")
	public short[] aShortArray115;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "J")
	public long aLong186;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "[I")
	public int[] anIntArray322;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "[S")
	public short[] aShortArray116;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class200(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray115 = arg3;
		this.aLong186 = arg0;
		this.anIntArray322 = arg1;
		this.aShortArray116 = arg2;
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	private Class200() {
	}
}
