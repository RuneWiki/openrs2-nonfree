import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class147 {

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "F")
	public float aFloat43 = 1.0F;

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "F")
	public float aFloat45 = 0.25F;

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "F")
	public float aFloat46 = 1.0F;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
	public int anInt4604;

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
	public int anInt4600;

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
	public int anInt4603;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
	public int anInt4597;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public int anInt4596;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
	public int anInt4601;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!qm", name = "o", descriptor = "Lclient!kj;")
	public Class2_Sub3_Sub12 aClass2_Sub3_Sub12_6;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class147() {
		this.aFloat48 = 1.1523438F;
		this.anInt4604 = -50;
		this.anInt4600 = Static117.anInt2495;
		this.anInt4603 = -50;
		this.anInt4597 = -60;
		this.anInt4596 = 0;
		this.anInt4601 = Static117.anInt2494;
		this.aFloat44 = 0.69921875F;
		this.aFloat47 = 1.2F;
		if (Static174.anIntArray299 != null) {
			this.aClass2_Sub3_Sub12_6 = Static135.method2348(Static174.anIntArray299[0], Static174.anIntArray299[1], Static174.anIntArray299[2], Static174.anIntArray299[3], Static174.anIntArray299[4], Static174.anIntArray299[5]);
		}
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!wm;)V")
	public Class147(@OriginalArg(0) Class2_Sub26 arg0) {
		@Pc(16) int local16 = arg0.method4261();
		if ((local16 & 0x1) == 0) {
			this.anInt4600 = Static117.anInt2495;
		} else {
			this.anInt4600 = arg0.method4228();
		}
		if ((local16 & 0x2) == 0) {
			this.aFloat48 = 1.1523438F;
		} else {
			this.aFloat48 = (float) arg0.method4242() / 256.0F;
		}
		if ((local16 & 0x4) == 0) {
			this.aFloat44 = 0.69921875F;
		} else {
			this.aFloat44 = (float) arg0.method4242() / 256.0F;
		}
		if ((local16 & 0x8) == 0) {
			this.aFloat47 = 1.2F;
		} else {
			this.aFloat47 = (float) arg0.method4242() / 256.0F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt4597 = -60;
			this.anInt4604 = -50;
			this.anInt4603 = -50;
		} else {
			this.anInt4603 = arg0.method4255();
			this.anInt4597 = arg0.method4255();
			this.anInt4604 = arg0.method4255();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt4601 = Static117.anInt2494;
		} else {
			this.anInt4601 = arg0.method4228();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt4596 = 0;
		} else {
			this.anInt4596 = arg0.method4242();
		}
		if ((local16 & 0x80) != 0) {
			this.aClass2_Sub3_Sub12_6 = Static135.method2348(arg0.method4242(), arg0.method4242(), arg0.method4242(), arg0.method4242(), arg0.method4242(), arg0.method4242());
		} else if (Static174.anIntArray299 != null) {
			this.aClass2_Sub3_Sub12_6 = Static135.method2348(Static174.anIntArray299[0], Static174.anIntArray299[1], Static174.anIntArray299[2], Static174.anIntArray299[3], Static174.anIntArray299[4], Static174.anIntArray299[5]);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLclient!wm;)V")
	public void method3712(@OriginalArg(1) Class2_Sub26 arg0) {
		this.aFloat46 = (float) (arg0.method4261() * 8) / 255.0F;
		this.aFloat45 = (float) (arg0.method4261() * 8) / 255.0F;
		this.aFloat43 = (float) (arg0.method4261() * 8) / 255.0F;
	}
}
