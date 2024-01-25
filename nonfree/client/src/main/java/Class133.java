import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public final class Class133 {

	@OriginalMember(owner = "client!gfa", name = "h", descriptor = "J")
	public long aLong102;

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!gfa", name = "g", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!gfa", name = "f", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class133(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aLong102 = arg0;
		this.aShortArray39 = arg3;
		this.aShortArray40 = arg2;
		this.anIntArray233 = arg1;
	}

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "()V")
	private Class133() {
	}
}
