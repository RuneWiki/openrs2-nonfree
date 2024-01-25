import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class384 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "[S")
	public short[] aShortArray144;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "[I")
	public int[] anIntArray734;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "J")
	public long aLong330;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "[S")
	public short[] aShortArray145;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class384(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray144 = arg3;
		this.anIntArray734 = arg1;
		this.aLong330 = arg0;
		this.aShortArray145 = arg2;
	}

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
	private Class384() {
	}
}
