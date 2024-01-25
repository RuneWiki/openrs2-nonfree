import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class21 {

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "[I")
	public int[] anIntArray38;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "J")
	public long aLong14;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class21(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.anIntArray38 = arg1;
		this.aLong14 = arg0;
		this.aShortArray13 = arg3;
		this.aShortArray14 = arg2;
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V")
	private Class21() {
	}
}
