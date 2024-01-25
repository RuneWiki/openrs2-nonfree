import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public final class Class18 {

	@OriginalMember(owner = "client!aka", name = "d", descriptor = "[S")
	public short[] aShortArray2;

	@OriginalMember(owner = "client!aka", name = "e", descriptor = "J")
	public long aLong11;

	@OriginalMember(owner = "client!aka", name = "f", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!aka", name = "c", descriptor = "[S")
	public short[] aShortArray1;

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class18(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray2 = arg2;
		this.aLong11 = arg0;
		this.anIntArray17 = arg1;
		this.aShortArray1 = arg3;
	}

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "()V")
	private Class18() {
	}
}
