import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class272 {

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "J")
	public long aLong242;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "[I")
	public int[] anIntArray440;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class272(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray96 = arg2;
		this.aLong242 = arg0;
		this.aShortArray97 = arg3;
		this.anIntArray440 = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
	private Class272() {
	}
}
