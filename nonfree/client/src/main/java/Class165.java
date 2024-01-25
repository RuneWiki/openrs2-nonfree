import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class165 {

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "J")
	public long aLong147;

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "[I")
	public int[] anIntArray293;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class165(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aLong147 = arg0;
		this.aShortArray44 = arg3;
		this.aShortArray43 = arg2;
		this.anIntArray293 = arg1;
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	private Class165() {
	}
}
