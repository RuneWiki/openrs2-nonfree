import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class4_Sub1_Sub7 extends Class4_Sub1 {

	@OriginalMember(owner = "client!er", name = "E", descriptor = "[I")
	public static final int[] anIntArray183 = new int[32];

	@OriginalMember(owner = "client!er", name = "G", descriptor = "[B")
	public final byte[] aByteArray26;

	static {
		@Pc(14) int local14 = 2;
		for (@Pc(16) int local16 = 0; local16 < 32; local16++) {
			anIntArray183[local16] = local14 - 1;
			local14 += local14;
		}
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "([B)V")
	public Class4_Sub1_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray26 = arg0;
	}
}
