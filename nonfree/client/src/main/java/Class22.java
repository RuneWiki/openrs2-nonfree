import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class22 {

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "J")
	public long aLong10;

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "[S")
	public short[] aShortArray12;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class22(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray13 = arg3;
		this.anIntArray17 = arg1;
		this.aLong10 = arg0;
		this.aShortArray12 = arg2;
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	private Class22() {
	}
}
