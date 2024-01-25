import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class141 {

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "J")
	public long aLong101;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class141(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray53 = arg3;
		this.aShortArray52 = arg2;
		this.aLong101 = arg0;
		this.anIntArray297 = arg1;
	}

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	private Class141() {
	}
}
