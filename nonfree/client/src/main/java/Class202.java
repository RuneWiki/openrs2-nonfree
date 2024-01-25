import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class202 {

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "J")
	public long aLong156;

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "[S")
	public short[] aShortArray84;

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class202(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.anIntArray344 = arg1;
		this.aLong156 = arg0;
		this.aShortArray84 = arg3;
		this.aShortArray85 = arg2;
	}

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
	private Class202() {
	}
}
