import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public final class Class322 {

	@OriginalMember(owner = "client!saa", name = "f", descriptor = "[S")
	public short[] aShortArray123;

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "J")
	public long aLong245;

	@OriginalMember(owner = "client!saa", name = "h", descriptor = "[S")
	public short[] aShortArray124;

	@OriginalMember(owner = "client!saa", name = "d", descriptor = "[I")
	public int[] anIntArray486;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class322(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray123 = arg2;
		this.aLong245 = arg0;
		this.aShortArray124 = arg3;
		this.anIntArray486 = arg1;
	}

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "()V")
	private Class322() {
	}
}
