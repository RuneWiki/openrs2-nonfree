import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public final class Class187 {

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "J")
	public long aLong153;

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "[I")
	public int[] anIntArray307;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class187(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray47 = arg3;
		this.aShortArray48 = arg2;
		this.aLong153 = arg0;
		this.anIntArray307 = arg1;
	}

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "()V")
	private Class187() {
	}
}
