import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class326 {

	@OriginalMember(owner = "client!td", name = "b", descriptor = "[S")
	public short[] aShortArray135;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "[I")
	public int[] anIntArray648;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "[S")
	public short[] aShortArray136;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "J")
	public long aLong234;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class326(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray135 = arg3;
		this.anIntArray648 = arg1;
		this.aShortArray136 = arg2;
		this.aLong234 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	private Class326() {
	}
}
