import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class116 {

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "F")
	public float aFloat77 = 1.0F;

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "F")
	public float aFloat78 = 1.0F;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "F")
	public float aFloat76 = 0.25F;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
	public final int anInt3322;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	public final int anInt3315;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
	public final int anInt3324;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "F")
	public final float aFloat80;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "F")
	public final float aFloat75;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
	public final int anInt3318;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
	public final int anInt3319;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
	public final int anInt3325;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "F")
	public final float aFloat79;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Lclient!pa;")
	public final Class112 aClass112_1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class116() {
		this.anInt3322 = -50;
		this.anInt3315 = -50;
		this.anInt3324 = -60;
		this.aFloat80 = 1.1523438F;
		this.aFloat75 = 1.2F;
		this.anInt3318 = Static46.anInt1310;
		this.anInt3319 = Static292.anInt5985;
		this.anInt3325 = 0;
		this.aFloat79 = 0.69921875F;
		this.aClass112_1 = Static426.aClass112_3;
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!ek;)V")
	public Class116(@OriginalArg(0) Class4_Sub13 arg0) {
		@Pc(16) int local16 = arg0.method7004();
		if (Static455.aClass4_Sub35_Sub1_1.method7615(Static453.anInt8614) && Static25.aClass7_1.method7835() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt3318 = Static46.anInt1310;
			} else {
				this.anInt3318 = arg0.method6990();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat80 = 1.1523438F;
			} else {
				this.aFloat80 = (float) arg0.method7054() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat79 = 0.69921875F;
			} else {
				this.aFloat79 = (float) arg0.method7054() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat75 = 1.2F;
			} else {
				this.aFloat75 = (float) arg0.method7054() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method6990();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method7054();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method7054();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method7054();
			}
			this.aFloat80 = 1.1523438F;
			this.anInt3318 = Static46.anInt1310;
			this.aFloat75 = 1.2F;
			this.aFloat79 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt3322 = -50;
			this.anInt3324 = -60;
			this.anInt3315 = -50;
		} else {
			this.anInt3322 = arg0.method7043();
			this.anInt3324 = arg0.method7043();
			this.anInt3315 = arg0.method7043();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt3319 = Static292.anInt5985;
		} else {
			this.anInt3319 = arg0.method6990();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt3325 = 0;
		} else {
			this.anInt3325 = arg0.method7054();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass112_1 = Static426.aClass112_3;
		} else {
			@Pc(232) int local232 = arg0.method7054();
			@Pc(236) int local236 = arg0.method7054();
			@Pc(240) int local240 = arg0.method7054();
			@Pc(244) int local244 = arg0.method7054();
			@Pc(248) int local248 = arg0.method7054();
			@Pc(252) int local252 = arg0.method7054();
			this.aClass112_1 = Static454.method6669(local252, local244, local248, local236, local240, local232);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!ga;)Z")
	public boolean method2657(@OriginalArg(1) Class116 arg0) {
		return this.anInt3318 == arg0.anInt3318 && this.aFloat80 == arg0.aFloat80 && this.aFloat79 == arg0.aFloat79 && this.aFloat75 == arg0.aFloat75 && this.aFloat76 == arg0.aFloat76 && this.aFloat77 == arg0.aFloat77 && this.aFloat78 == arg0.aFloat78 && arg0.anInt3319 == this.anInt3319 && arg0.anInt3325 == this.anInt3325 && this.aClass112_1 == arg0.aClass112_1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLclient!ek;)V")
	public void method2659(@OriginalArg(1) Class4_Sub13 arg0) {
		this.aFloat77 = (float) (arg0.method7004() * 8) / 255.0F;
		this.aFloat76 = (float) (arg0.method7004() * 8) / 255.0F;
		this.aFloat78 = (float) (arg0.method7004() * 8) / 255.0F;
	}
}
