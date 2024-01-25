import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class54 {

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "J")
	public long aLong52;

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class54(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray31 = arg3;
		this.aLong52 = arg0;
		this.aShortArray32 = arg2;
		this.anIntArray82 = arg1;
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
	private Class54() {
	}
}
