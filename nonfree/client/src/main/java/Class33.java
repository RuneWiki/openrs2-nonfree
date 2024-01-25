import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class33 {

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "F")
	public float aFloat18 = 1.0F;

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "F")
	public float aFloat20 = 0.25F;

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "F")
	public float aFloat21 = 1.0F;

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
	public final int anInt736;

	@OriginalMember(owner = "client!bs", name = "v", descriptor = "F")
	public final float aFloat22;

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
	public final int anInt735;

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
	public final int anInt733;

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
	public final int anInt739;

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
	public final int anInt732;

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "Lclient!pv;")
	public final Class78 aClass78_2;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "F")
	public final float aFloat17;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
	public final int anInt734;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "F")
	public final float aFloat19;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class33() {
		this.anInt736 = -50;
		this.aFloat22 = 1.2F;
		this.anInt735 = Static267.anInt4801;
		this.anInt733 = 0;
		this.anInt739 = -60;
		this.anInt732 = Static281.anInt4959;
		this.aClass78_2 = Static33.aClass78_1;
		this.aFloat17 = 1.1523438F;
		this.anInt734 = -50;
		this.aFloat19 = 0.69921875F;
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!lh;)V")
	public Class33(@OriginalArg(0) Class1_Sub1 arg0) {
		@Pc(16) int local16 = arg0.method4130();
		if (Static389.aClass128_Sub1_1.method2975(Static285.anInt7839) && Static269.aClass109_9.method4755() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt735 = Static267.anInt4801;
			} else {
				this.anInt735 = arg0.method4087();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat17 = 1.1523438F;
			} else {
				this.aFloat17 = (float) arg0.method4093() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat19 = 0.69921875F;
			} else {
				this.aFloat19 = (float) arg0.method4093() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat22 = 1.2F;
			} else {
				this.aFloat22 = (float) arg0.method4093() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4087();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4093();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4093();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4093();
			}
			this.aFloat19 = 0.69921875F;
			this.anInt735 = Static267.anInt4801;
			this.aFloat22 = 1.2F;
			this.aFloat17 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt736 = -50;
			this.anInt739 = -60;
			this.anInt734 = -50;
		} else {
			this.anInt734 = arg0.method4100();
			this.anInt739 = arg0.method4100();
			this.anInt736 = arg0.method4100();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt732 = Static281.anInt4959;
		} else {
			this.anInt732 = arg0.method4087();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt733 = 0;
		} else {
			this.anInt733 = arg0.method4093();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass78_2 = Static33.aClass78_1;
		} else {
			@Pc(217) int local217 = arg0.method4093();
			@Pc(221) int local221 = arg0.method4093();
			@Pc(225) int local225 = arg0.method4093();
			@Pc(229) int local229 = arg0.method4093();
			@Pc(233) int local233 = arg0.method4093();
			@Pc(237) int local237 = arg0.method4093();
			this.aClass78_2 = Static77.method1345(local237, local233, local221, local217, local225, local229);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BLclient!bs;)Z")
	public boolean method668(@OriginalArg(1) Class33 arg0) {
		return arg0.anInt735 == this.anInt735 && arg0.aFloat17 == this.aFloat17 && this.aFloat19 == arg0.aFloat19 && arg0.aFloat22 == this.aFloat22 && arg0.aFloat20 == this.aFloat20 && arg0.aFloat21 == this.aFloat21 && arg0.aFloat18 == this.aFloat18 && arg0.anInt732 == this.anInt732 && arg0.anInt733 == this.anInt733 && this.aClass78_2 == arg0.aClass78_2;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILclient!lh;)V")
	public void method671(@OriginalArg(1) Class1_Sub1 arg0) {
		this.aFloat21 = (float) (arg0.method4130() * 8) / 255.0F;
		this.aFloat20 = (float) (arg0.method4130() * 8) / 255.0F;
		this.aFloat18 = (float) (arg0.method4130() * 8) / 255.0F;
	}
}
