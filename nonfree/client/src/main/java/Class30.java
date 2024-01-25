import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class30 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
	public int[] anIntArray40;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "J")
	public long aLong21;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class30(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray18 = arg3;
		this.anIntArray40 = arg1;
		this.aShortArray19 = arg2;
		this.aLong21 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	private Class30() {
	}
}
