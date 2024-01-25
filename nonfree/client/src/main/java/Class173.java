import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public final class Class173 {

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "[I")
	public int[] anIntArray273;

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "J")
	public long aLong128;

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class173(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.anIntArray273 = arg1;
		this.aLong128 = arg0;
		this.aShortArray59 = arg3;
		this.aShortArray60 = arg2;
	}

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V")
	private Class173() {
	}
}
