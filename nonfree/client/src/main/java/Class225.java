import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public final class Class225 {

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!mea", name = "i", descriptor = "J")
	public long aLong174;

	@OriginalMember(owner = "client!mea", name = "d", descriptor = "[I")
	public int[] anIntArray376;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class225(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray78 = arg3;
		this.aLong174 = arg0;
		this.anIntArray376 = arg1;
		this.aShortArray77 = arg2;
	}

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "()V")
	private Class225() {
	}
}
