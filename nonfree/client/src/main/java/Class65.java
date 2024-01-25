import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class65 {

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "F")
	public float aFloat10 = 0.25F;

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "F")
	public float aFloat13 = 1.0F;

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "F")
	public float aFloat11 = 1.0F;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
	public final int anInt1481;

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
	public final int anInt1478;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
	public final int anInt1479;

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "Lclient!sg;")
	public final Class54 aClass54_1;

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
	public final int anInt1483;

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
	public final int anInt1487;

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "F")
	public final float aFloat12;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "F")
	public final float aFloat15;

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
	public final int anInt1484;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "F")
	public final float aFloat14;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
	public Class65() {
		this.anInt1481 = Static139.anInt2689;
		this.anInt1478 = -50;
		this.anInt1479 = Static321.anInt6213;
		this.aClass54_1 = Static297.aClass54_3;
		this.anInt1483 = -50;
		this.anInt1487 = -60;
		this.aFloat12 = 0.69921875F;
		this.aFloat15 = 1.2F;
		this.anInt1484 = 0;
		this.aFloat14 = 1.1523438F;
	}

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!rg;)V")
	public Class65(@OriginalArg(0) Class5_Sub12 arg0) {
		@Pc(16) int local16 = arg0.method5115();
		if (Static280.aBoolean452 && Static291.aClass55_11.method5207() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt1481 = Static139.anInt2689;
			} else {
				this.anInt1481 = arg0.method5067();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat14 = 1.1523438F;
			} else {
				this.aFloat14 = (float) arg0.method5106() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat12 = 0.69921875F;
			} else {
				this.aFloat12 = (float) arg0.method5106() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat15 = 1.2F;
			} else {
				this.aFloat15 = (float) arg0.method5106() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5067();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5106();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5106();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5106();
			}
			this.anInt1481 = Static139.anInt2689;
			this.aFloat15 = 1.2F;
			this.aFloat14 = 1.1523438F;
			this.aFloat12 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt1478 = -50;
			this.anInt1483 = -50;
			this.anInt1487 = -60;
		} else {
			this.anInt1483 = arg0.method5066();
			this.anInt1487 = arg0.method5066();
			this.anInt1478 = arg0.method5066();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt1479 = Static321.anInt6213;
		} else {
			this.anInt1479 = arg0.method5067();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt1484 = 0;
		} else {
			this.anInt1484 = arg0.method5106();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass54_1 = Static297.aClass54_3;
		} else {
			this.aClass54_1 = Static357.method6057(arg0.method5106(), arg0.method5106(), arg0.method5106(), arg0.method5106(), arg0.method5106(), arg0.method5106());
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!rg;)V")
	public void method1423(@OriginalArg(1) Class5_Sub12 arg0) {
		this.aFloat11 = (float) (arg0.method5115() * 8) / 255.0F;
		this.aFloat10 = (float) (arg0.method5115() * 8) / 255.0F;
		this.aFloat13 = (float) (arg0.method5115() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!eq;)Z")
	public boolean method1424(@OriginalArg(1) Class65 arg0) {
		return arg0.anInt1481 == this.anInt1481 && this.aFloat14 == arg0.aFloat14 && this.aFloat12 == arg0.aFloat12 && this.aFloat15 == arg0.aFloat15 && arg0.aFloat10 == this.aFloat10 && arg0.aFloat11 == this.aFloat11 && this.aFloat13 == arg0.aFloat13 && this.anInt1479 == arg0.anInt1479 && this.anInt1484 == arg0.anInt1484 && this.aClass54_1 == arg0.aClass54_1;
	}
}
