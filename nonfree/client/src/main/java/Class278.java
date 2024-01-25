import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class278 {

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "J")
	public long aLong227;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "[I")
	public int[] anIntArray408;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "[S")
	public short[] aShortArray101;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class278(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray102 = arg2;
		this.aLong227 = arg0;
		this.anIntArray408 = arg1;
		this.aShortArray101 = arg3;
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	private Class278() {
	}
}
