import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class64 {

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "F")
	public float aFloat18 = 0.25F;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "F")
	public float aFloat17 = 1.0F;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "F")
	public float aFloat21 = 1.0F;

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
	public int anInt2269;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
	public int anInt2265;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	public int anInt2263;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
	public int anInt2259;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
	public int anInt2268;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "F")
	public float aFloat19;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
	public int anInt2264;

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "F")
	public float aFloat20;

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "F")
	public float aFloat22;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!od;")
	public Class4_Sub2_Sub15 aClass4_Sub2_Sub15_3;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	public Class64() {
		this.anInt2269 = -50;
		this.anInt2265 = Static291.anInt5435;
		this.anInt2263 = Static291.anInt5436;
		this.anInt2259 = -50;
		this.anInt2268 = -60;
		this.aFloat19 = 1.2F;
		this.anInt2264 = 0;
		this.aFloat20 = 1.1523438F;
		this.aFloat22 = 0.69921875F;
		if (Static21.anIntArray385 != null) {
			this.aClass4_Sub2_Sub15_3 = Static188.method3006(Static21.anIntArray385[0], Static21.anIntArray385[1], Static21.anIntArray385[2], Static21.anIntArray385[3], Static21.anIntArray385[4], Static21.anIntArray385[5]);
		}
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!p;)V")
	public Class64(@OriginalArg(0) Class4_Sub17 arg0) {
		@Pc(16) int local16 = arg0.method1874();
		if ((local16 & 0x1) == 0) {
			this.anInt2265 = Static291.anInt5435;
		} else {
			this.anInt2265 = arg0.method1889();
		}
		if ((local16 & 0x2) == 0) {
			this.aFloat20 = 1.1523438F;
		} else {
			this.aFloat20 = (float) arg0.method1837() / 256.0F;
		}
		if ((local16 & 0x4) == 0) {
			this.aFloat22 = 0.69921875F;
		} else {
			this.aFloat22 = (float) arg0.method1837() / 256.0F;
		}
		if ((local16 & 0x8) == 0) {
			this.aFloat19 = 1.2F;
		} else {
			this.aFloat19 = (float) arg0.method1837() / 256.0F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt2259 = -50;
			this.anInt2269 = -50;
			this.anInt2268 = -60;
		} else {
			this.anInt2259 = arg0.method1869();
			this.anInt2268 = arg0.method1869();
			this.anInt2269 = arg0.method1869();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt2263 = Static291.anInt5436;
		} else {
			this.anInt2263 = arg0.method1889();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt2264 = 0;
		} else {
			this.anInt2264 = arg0.method1837();
		}
		if ((local16 & 0x80) != 0) {
			this.aClass4_Sub2_Sub15_3 = Static188.method3006(arg0.method1837(), arg0.method1837(), arg0.method1837(), arg0.method1837(), arg0.method1837(), arg0.method1837());
		} else if (Static21.anIntArray385 != null) {
			this.aClass4_Sub2_Sub15_3 = Static188.method3006(Static21.anIntArray385[0], Static21.anIntArray385[1], Static21.anIntArray385[2], Static21.anIntArray385[3], Static21.anIntArray385[4], Static21.anIntArray385[5]);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLclient!p;)V")
	public void method1734(@OriginalArg(1) Class4_Sub17 arg0) {
		this.aFloat17 = (float) (arg0.method1874() * 8) / 255.0F;
		this.aFloat18 = (float) (arg0.method1874() * 8) / 255.0F;
		this.aFloat21 = (float) (arg0.method1874() * 8) / 255.0F;
	}
}
