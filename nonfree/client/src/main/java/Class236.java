import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class236 {

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "J")
	public long aLong186;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
	public int[] anIntArray411;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "[S")
	public short[] aShortArray84;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class236(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aLong186 = arg0;
		this.anIntArray411 = arg1;
		this.aShortArray84 = arg3;
		this.aShortArray85 = arg2;
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	private Class236() {
	}
}
