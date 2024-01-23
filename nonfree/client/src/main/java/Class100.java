import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class100 {

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "F")
	public float aFloat36 = 1.0F;

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "F")
	public float aFloat37 = 1.0F;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "F")
	public float aFloat38 = 0.25F;

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
	public int anInt3479;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
	public int anInt3475;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
	public int anInt3476;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
	public int anInt3485;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
	public int anInt3482;

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
	public int anInt3484;

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "Lclient!ne;")
	public Class2_Sub8_Sub14 aClass2_Sub8_Sub14_4;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	public Class100() {
		this.aFloat35 = 0.69921875F;
		this.anInt3479 = -60;
		this.anInt3475 = Static235.anInt4717;
		this.anInt3476 = -50;
		this.anInt3485 = Static235.anInt4714;
		this.aFloat40 = 1.1523438F;
		this.anInt3482 = -50;
		this.aFloat39 = 1.2F;
		this.anInt3484 = 0;
		if (Static2.anIntArray13 != null) {
			this.aClass2_Sub8_Sub14_4 = Static186.method3274(Static2.anIntArray13[0], Static2.anIntArray13[1], Static2.anIntArray13[2], Static2.anIntArray13[3], Static2.anIntArray13[4], Static2.anIntArray13[5]);
		}
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!oe;)V")
	public Class100(@OriginalArg(0) Class2_Sub16 arg0) {
		@Pc(16) int local16 = arg0.method2146();
		if ((local16 & 0x1) == 0) {
			this.anInt3485 = Static235.anInt4714;
		} else {
			this.anInt3485 = arg0.method2145();
		}
		if ((local16 & 0x2) == 0) {
			this.aFloat40 = 1.1523438F;
		} else {
			this.aFloat40 = (float) arg0.method2130() / 256.0F;
		}
		if ((local16 & 0x4) == 0) {
			this.aFloat35 = 0.69921875F;
		} else {
			this.aFloat35 = (float) arg0.method2130() / 256.0F;
		}
		if ((local16 & 0x8) == 0) {
			this.aFloat39 = 1.2F;
		} else {
			this.aFloat39 = (float) arg0.method2130() / 256.0F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt3476 = -50;
			this.anInt3482 = -50;
			this.anInt3479 = -60;
		} else {
			this.anInt3476 = arg0.method2191();
			this.anInt3479 = arg0.method2191();
			this.anInt3482 = arg0.method2191();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt3475 = Static235.anInt4717;
		} else {
			this.anInt3475 = arg0.method2145();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt3484 = 0;
		} else {
			this.anInt3484 = arg0.method2130();
		}
		if ((local16 & 0x80) != 0) {
			this.aClass2_Sub8_Sub14_4 = Static186.method3274(arg0.method2130(), arg0.method2130(), arg0.method2130(), arg0.method2130(), arg0.method2130(), arg0.method2130());
		} else if (Static2.anIntArray13 != null) {
			this.aClass2_Sub8_Sub14_4 = Static186.method3274(Static2.anIntArray13[0], Static2.anIntArray13[1], Static2.anIntArray13[2], Static2.anIntArray13[3], Static2.anIntArray13[4], Static2.anIntArray13[5]);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLclient!oe;)V")
	public void method2851(@OriginalArg(1) Class2_Sub16 arg0) {
		this.aFloat37 = (float) (arg0.method2146() * 8) / 255.0F;
		this.aFloat38 = (float) (arg0.method2146() * 8) / 255.0F;
		this.aFloat36 = (float) (arg0.method2146() * 8) / 255.0F;
	}
}
