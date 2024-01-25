import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mka")
public final class Class241 {

	@OriginalMember(owner = "client!mka", name = "i", descriptor = "[S")
	public short[] aShortArray121;

	@OriginalMember(owner = "client!mka", name = "e", descriptor = "[I")
	public int[] anIntArray387;

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "J")
	public long aLong238;

	@OriginalMember(owner = "client!mka", name = "d", descriptor = "[S")
	public short[] aShortArray122;

	@OriginalMember(owner = "client!mka", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class241(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray121 = arg3;
		this.anIntArray387 = arg1;
		this.aLong238 = arg0;
		this.aShortArray122 = arg2;
	}

	@OriginalMember(owner = "client!mka", name = "<init>", descriptor = "()V")
	private Class241() {
	}
}
