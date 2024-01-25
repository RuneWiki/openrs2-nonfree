import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class316 {

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "J")
	public long aLong266;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
	public int[] anIntArray479;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class316(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray102 = arg2;
		this.aLong266 = arg0;
		this.anIntArray479 = arg1;
		this.aShortArray103 = arg3;
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	private Class316() {
	}
}
