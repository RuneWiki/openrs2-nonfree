import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class6_Sub5_Sub13 extends Class6_Sub5 {

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "[I")
	public static final int[] anIntArray455 = new int[4096];

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "[B")
	public final byte[] aByteArray84;

	static {
		for (@Pc(7) int local7 = 0; local7 < 4096; local7++) {
			anIntArray455[local7] = Static407.method5854(local7);
		}
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V")
	public Class6_Sub5_Sub13(@OriginalArg(0) byte[] arg0) {
		this.aByteArray84 = arg0;
	}
}
