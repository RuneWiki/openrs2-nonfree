import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class29_Sub6 extends Class29 {

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
	private final int anInt3233;

	@OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
	private final int anInt3227;

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
	private final int anInt3232;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
	private final int anInt3230;

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
	private final int anInt3229;

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
	private final int anInt3231;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub6(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt3233 = arg0.method2028(-14795);
		@Pc(13) int local13 = arg0.method2048(255);
		if ((local13 & 0x1) == 0) {
			this.anInt3227 = -1;
			this.anInt3232 = -1;
		} else {
			this.anInt3227 = arg0.method2028(-14795);
			this.anInt3232 = arg0.method2028(-14795);
		}
		if ((local13 & 0x2) == 0) {
			this.anInt3230 = -1;
			this.anInt3229 = -1;
		} else {
			this.anInt3229 = arg0.method2028(-14795);
			this.anInt3230 = arg0.method2028(-14795);
		}
		if ((local13 & 0x4) == 0) {
			this.anInt3231 = -1;
		} else {
			@Pc(79) int local79 = arg0.method2028(-14795);
			@Pc(83) int local83 = arg0.method2028(-14795);
			@Pc(89) int local89 = local79 * 255 / local83;
			if (local79 > 0 && local89 < 1) {
				local89 = 1;
			}
			this.anInt3231 = local89;
		}
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static470.aClass7Array1[this.anInt3233].method249().method7497(this.anInt3227, Static716.anInt11157, this.anInt3232, this.anInt3231, this.anInt3230, 0, this.anInt3229);
	}
}
