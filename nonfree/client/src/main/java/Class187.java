import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public final class Class187 {

	@OriginalMember(owner = "client!is", name = "d", descriptor = "J")
	public long aLong154;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "[I")
	public int[] anIntArray341;

	@OriginalMember(owner = "client!is", name = "b", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class187(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aLong154 = arg0;
		this.anIntArray341 = arg1;
		this.aShortArray53 = arg2;
		this.aShortArray54 = arg3;
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	private Class187() {
	}
}
