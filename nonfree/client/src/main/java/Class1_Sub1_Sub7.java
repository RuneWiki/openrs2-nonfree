import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ha", name = "V", descriptor = "[I")
	public static int[] anIntArray123 = new int[32];

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "[B")
	public final byte[] aByteArray12;

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray123[local8] = local6 - 1;
			local6 += local6;
		}
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray12 = arg0;
	}
}
