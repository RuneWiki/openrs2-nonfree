import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class309 {

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "[S")
	public short[] aShortArray114;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "[I")
	public int[] anIntArray505;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "[S")
	public short[] aShortArray115;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "J")
	public long aLong259;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class309(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray114 = arg2;
		this.anIntArray505 = arg1;
		this.aShortArray115 = arg3;
		this.aLong259 = arg0;
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	private Class309() {
	}
}
