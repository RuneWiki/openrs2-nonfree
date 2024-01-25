import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class5_Sub2_Sub5 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ew", name = "s", descriptor = "[I")
	public static final int[] anIntArray136 = new int[256];

	@OriginalMember(owner = "client!ew", name = "n", descriptor = "Ljava/lang/String;")
	private String aString40;

	@OriginalMember(owner = "client!ew", name = "q", descriptor = "I")
	private int anInt2433;

	static {
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(40) int local40 = local37;
			for (@Pc(42) int local42 = 0; local42 < 8; local42++) {
				if ((local40 & 0x1) == 1) {
					local40 = local40 >>> 1 ^ 0xEDB88320;
				} else {
					local40 >>>= 0x1;
				}
			}
			anIntArray136[local37] = local40;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!kp;I)V")
	@Override
	public void method8190(@OriginalArg(0) Class205 arg0) {
		arg0.method4895(this.aString40, this.anInt2433);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BLclient!ib;)V")
	@Override
	public void method8188(@OriginalArg(1) Class5_Sub23 arg0) {
		this.anInt2433 = arg0.method8527();
		this.aString40 = arg0.method8497();
	}
}
