import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class129 {

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "J")
	public long aLong78;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "[I")
	public int[] anIntArray184;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class129(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray40 = arg3;
		this.aShortArray41 = arg2;
		this.aLong78 = arg0;
		this.anIntArray184 = arg1;
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	private Class129() {
	}
}
