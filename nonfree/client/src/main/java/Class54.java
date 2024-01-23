import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class54 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "F")
	public float aFloat44 = 1.0F;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "F")
	public float aFloat45 = 0.25F;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "F")
	public float aFloat48 = 1.0F;

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
	public int anInt1710;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
	public int anInt1713;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
	public int anInt1712;

	@OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
	public int anInt1717;

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
	public int anInt1715;

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
	public int anInt1714;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "Lclient!jg;")
	public Class4_Sub2_Sub11 aClass4_Sub2_Sub11_2;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	public Class54() {
		this.anInt1710 = -60;
		this.aFloat43 = 1.2F;
		this.aFloat47 = 1.1523438F;
		this.anInt1713 = 0;
		this.aFloat46 = 0.69921875F;
		this.anInt1712 = Static290.anInt5645;
		this.anInt1717 = Static290.anInt5641;
		this.anInt1715 = -50;
		this.anInt1714 = -50;
		if (Static52.anIntArray122 != null) {
			this.aClass4_Sub2_Sub11_2 = Static128.method2090(Static52.anIntArray122[0], Static52.anIntArray122[1], Static52.anIntArray122[2], Static52.anIntArray122[3], Static52.anIntArray122[4], Static52.anIntArray122[5]);
		}
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class54(@OriginalArg(0) Class4_Sub24 arg0) {
		@Pc(16) int local16 = arg0.method3110();
		if ((local16 & 0x1) == 0) {
			this.anInt1712 = Static290.anInt5645;
		} else {
			this.anInt1712 = arg0.method3084();
		}
		if ((local16 & 0x2) == 0) {
			this.aFloat47 = 1.1523438F;
		} else {
			this.aFloat47 = (float) arg0.method3085() / 256.0F;
		}
		if ((local16 & 0x4) == 0) {
			this.aFloat46 = 0.69921875F;
		} else {
			this.aFloat46 = (float) arg0.method3085() / 256.0F;
		}
		if ((local16 & 0x8) == 0) {
			this.aFloat43 = 1.2F;
		} else {
			this.aFloat43 = (float) arg0.method3085() / 256.0F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt1710 = -60;
			this.anInt1715 = -50;
			this.anInt1714 = -50;
		} else {
			this.anInt1714 = arg0.method3072();
			this.anInt1710 = arg0.method3072();
			this.anInt1715 = arg0.method3072();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt1717 = Static290.anInt5641;
		} else {
			this.anInt1717 = arg0.method3084();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt1713 = 0;
		} else {
			this.anInt1713 = arg0.method3085();
		}
		if ((local16 & 0x80) != 0) {
			this.aClass4_Sub2_Sub11_2 = Static128.method2090(arg0.method3085(), arg0.method3085(), arg0.method3085(), arg0.method3085(), arg0.method3085(), arg0.method3085());
		} else if (Static52.anIntArray122 != null) {
			this.aClass4_Sub2_Sub11_2 = Static128.method2090(Static52.anIntArray122[0], Static52.anIntArray122[1], Static52.anIntArray122[2], Static52.anIntArray122[3], Static52.anIntArray122[4], Static52.anIntArray122[5]);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLclient!pi;)V")
	public void method1413(@OriginalArg(1) Class4_Sub24 arg0) {
		this.aFloat44 = (float) (arg0.method3110() * 8) / 255.0F;
		this.aFloat45 = (float) (arg0.method3110() * 8) / 255.0F;
		this.aFloat48 = (float) (arg0.method3110() * 8) / 255.0F;
	}
}
