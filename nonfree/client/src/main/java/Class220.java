import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class220 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "[I")
	public int[] anIntArray392;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "[S")
	public short[] aShortArray130;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "J")
	public long aLong156;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "[S")
	public short[] aShortArray129;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class220(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.anIntArray392 = arg1;
		this.aShortArray130 = arg3;
		this.aLong156 = arg0;
		this.aShortArray129 = arg2;
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	private Class220() {
	}
}
