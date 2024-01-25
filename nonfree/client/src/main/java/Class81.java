import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public final class Class81 {

	@OriginalMember(owner = "client!dja", name = "h", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!dja", name = "f", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!dja", name = "g", descriptor = "J")
	public long aLong65;

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class81(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.anIntArray148 = arg1;
		this.aShortArray40 = arg2;
		this.aShortArray41 = arg3;
		this.aLong65 = arg0;
	}

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "()V")
	private Class81() {
	}
}
