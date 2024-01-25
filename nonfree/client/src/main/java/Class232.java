import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class232 {

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "[I")
	public int[] anIntArray489;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "J")
	public long aLong185;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class232(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.anIntArray489 = arg1;
		this.aShortArray103 = arg3;
		this.aLong185 = arg0;
		this.aShortArray104 = arg2;
	}

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	private Class232() {
	}
}
