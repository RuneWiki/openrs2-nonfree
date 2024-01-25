import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class3_Sub46 extends Class3 {

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "[B")
	public static final byte[] aByteArray110 = new byte[32896];

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "Lclient!pca;")
	public final Class2_Sub2_Sub1_Sub2 aClass2_Sub2_Sub1_Sub2_2;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray110[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!pca;)V")
	public Class3_Sub46(@OriginalArg(0) Class2_Sub2_Sub1_Sub2 arg0) {
		this.aClass2_Sub2_Sub1_Sub2_2 = arg0;
	}
}
