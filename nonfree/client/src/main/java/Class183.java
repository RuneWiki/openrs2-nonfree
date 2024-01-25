import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public final class Class183 {

	@OriginalMember(owner = "client!jka", name = "f", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!jka", name = "e", descriptor = "[I")
	public int[] anIntArray393;

	@OriginalMember(owner = "client!jka", name = "h", descriptor = "J")
	public long aLong153;

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!jka", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class183(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray82 = arg2;
		this.anIntArray393 = arg1;
		this.aLong153 = arg0;
		this.aShortArray81 = arg3;
	}

	@OriginalMember(owner = "client!jka", name = "<init>", descriptor = "()V")
	private Class183() {
	}
}
