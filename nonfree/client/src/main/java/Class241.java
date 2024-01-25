import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class241 {

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "F")
	public float aFloat116 = 0.25F;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "F")
	public float aFloat117 = 1.0F;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "F")
	public float aFloat121 = 1.0F;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
	public final int anInt7148;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
	public final int anInt7153;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
	public final int anInt7147;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "F")
	public final float aFloat119;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "F")
	public final float aFloat120;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
	public final int anInt7149;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "F")
	public final float aFloat118;

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
	public final int anInt7152;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!md;")
	public final Class89 aClass89_4;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
	public final int anInt7144;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
	public Class241() {
		this.anInt7148 = -60;
		this.anInt7153 = Static18.anInt291;
		this.anInt7147 = Static19.anInt296;
		this.aFloat119 = 0.69921875F;
		this.aFloat120 = 1.2F;
		this.anInt7149 = -50;
		this.aFloat118 = 1.1523438F;
		this.anInt7152 = -50;
		this.aClass89_4 = Static311.aClass89_2;
		this.anInt7144 = 0;
	}

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!ti;)V")
	public Class241(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(16) int local16 = arg0.method4548();
		if (Static327.aClass230_Sub1_1.method5639(Static146.anInt2664) && Static328.aClass121_9.method4572() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt7147 = Static19.anInt296;
			} else {
				this.anInt7147 = arg0.method4500();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat118 = 1.1523438F;
			} else {
				this.aFloat118 = (float) arg0.method4498() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat119 = 0.69921875F;
			} else {
				this.aFloat119 = (float) arg0.method4498() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat120 = 1.2F;
			} else {
				this.aFloat120 = (float) arg0.method4498() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4500();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4498();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4498();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4498();
			}
			this.aFloat119 = 0.69921875F;
			this.anInt7147 = Static19.anInt296;
			this.aFloat120 = 1.2F;
			this.aFloat118 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt7149 = -50;
			this.anInt7152 = -50;
			this.anInt7148 = -60;
		} else {
			this.anInt7149 = arg0.method4531();
			this.anInt7148 = arg0.method4531();
			this.anInt7152 = arg0.method4531();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt7153 = Static18.anInt291;
		} else {
			this.anInt7153 = arg0.method4500();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt7144 = 0;
		} else {
			this.anInt7144 = arg0.method4498();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass89_4 = Static311.aClass89_2;
		} else {
			@Pc(235) int local235 = arg0.method4498();
			@Pc(239) int local239 = arg0.method4498();
			@Pc(243) int local243 = arg0.method4498();
			@Pc(247) int local247 = arg0.method4498();
			@Pc(251) int local251 = arg0.method4498();
			@Pc(255) int local255 = arg0.method4498();
			this.aClass89_4 = Static67.method996(local235, local243, local247, local251, local255, local239);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!ti;)V")
	public void method5497(@OriginalArg(1) Class1_Sub14 arg0) {
		this.aFloat121 = (float) (arg0.method4548() * 8) / 255.0F;
		this.aFloat116 = (float) (arg0.method4548() * 8) / 255.0F;
		this.aFloat117 = (float) (arg0.method4548() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!ui;)Z")
	public boolean method5498(@OriginalArg(1) Class241 arg0) {
		return this.anInt7147 == arg0.anInt7147 && this.aFloat118 == arg0.aFloat118 && this.aFloat119 == arg0.aFloat119 && this.aFloat120 == arg0.aFloat120 && arg0.aFloat116 == this.aFloat116 && this.aFloat121 == arg0.aFloat121 && arg0.aFloat117 == this.aFloat117 && arg0.anInt7153 == this.anInt7153 && arg0.anInt7144 == this.anInt7144 && arg0.aClass89_4 == this.aClass89_4;
	}
}
