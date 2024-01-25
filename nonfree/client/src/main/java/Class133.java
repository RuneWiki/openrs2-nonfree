import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class133 {

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "J")
	public long aLong86;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class133(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray18 = arg3;
		this.anIntArray167 = arg1;
		this.aLong86 = arg0;
		this.aShortArray19 = arg2;
	}

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	private Class133() {
	}
}
