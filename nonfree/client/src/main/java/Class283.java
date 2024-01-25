import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class283 {

	@OriginalMember(owner = "client!th", name = "c", descriptor = "F")
	public float aFloat148 = 0.25F;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "F")
	public float aFloat150 = 1.0F;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "F")
	public float aFloat152 = 1.0F;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "I")
	public final int anInt7848;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "F")
	public final float aFloat151;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "I")
	public final int anInt7855;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "I")
	public final int anInt7850;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "F")
	public final float aFloat149;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "I")
	public final int anInt7856;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "I")
	public final int anInt7854;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "F")
	public final float aFloat147;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "I")
	public final int anInt7851;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "Lclient!rn;")
	public final Class45 aClass45_4;

	static {
		new Class306("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class283() {
		this.anInt7848 = -60;
		this.aFloat151 = 0.69921875F;
		this.anInt7855 = -50;
		this.anInt7850 = -50;
		this.aFloat149 = 1.1523438F;
		this.anInt7856 = Static532.anInt8955;
		this.anInt7854 = Static467.anInt7881;
		this.aFloat147 = 1.2F;
		this.anInt7851 = 0;
		this.aClass45_4 = Static181.aClass45_3;
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class283(@OriginalArg(0) Class1_Sub6 arg0) {
		@Pc(16) int local16 = arg0.method3922();
		if (Static544.aClass1_Sub22_Sub1_1.method4648(Static374.anInt6861) && Static487.aClass122_8.method7217() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt7856 = Static532.anInt8955;
			} else {
				this.anInt7856 = arg0.method3925();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat149 = 1.1523438F;
			} else {
				this.aFloat149 = (float) arg0.method3967() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat151 = 0.69921875F;
			} else {
				this.aFloat151 = (float) arg0.method3967() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat147 = 1.2F;
			} else {
				this.aFloat147 = (float) arg0.method3967() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method3925();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method3967();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method3967();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method3967();
			}
			this.anInt7856 = Static532.anInt8955;
			this.aFloat151 = 0.69921875F;
			this.aFloat149 = 1.1523438F;
			this.aFloat147 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt7855 = -50;
			this.anInt7848 = -60;
			this.anInt7850 = -50;
		} else {
			this.anInt7850 = arg0.method3964();
			this.anInt7848 = arg0.method3964();
			this.anInt7855 = arg0.method3964();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt7854 = Static467.anInt7881;
		} else {
			this.anInt7854 = arg0.method3925();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt7851 = 0;
		} else {
			this.anInt7851 = arg0.method3967();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass45_4 = Static181.aClass45_3;
		} else {
			@Pc(211) int local211 = arg0.method3967();
			@Pc(215) int local215 = arg0.method3967();
			@Pc(219) int local219 = arg0.method3967();
			@Pc(223) int local223 = arg0.method3967();
			@Pc(227) int local227 = arg0.method3967();
			@Pc(231) int local231 = arg0.method3967();
			this.aClass45_4 = Static393.method5946(local223, local227, local231, local215, local219, local211);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method6531(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aFloat150 = (float) (arg0.method3922() * 8) / 255.0F;
		this.aFloat148 = (float) (arg0.method3922() * 8) / 255.0F;
		this.aFloat152 = (float) (arg0.method3922() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLclient!th;)Z")
	public boolean method6532(@OriginalArg(1) Class283 arg0) {
		return arg0.anInt7856 == this.anInt7856 && arg0.aFloat149 == this.aFloat149 && this.aFloat151 == arg0.aFloat151 && this.aFloat147 == arg0.aFloat147 && arg0.aFloat148 == this.aFloat148 && arg0.aFloat150 == this.aFloat150 && this.aFloat152 == arg0.aFloat152 && arg0.anInt7854 == this.anInt7854 && arg0.anInt7851 == this.anInt7851 && arg0.aClass45_4 == this.aClass45_4;
	}
}
