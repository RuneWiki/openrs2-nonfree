import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public final class Class207 {

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "J")
	public long aLong143;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "[I")
	public int[] anIntArray349;

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class207(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray60 = arg2;
		this.aLong143 = arg0;
		this.anIntArray349 = arg1;
		this.aShortArray59 = arg3;
	}

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "()V")
	private Class207() {
	}
}
