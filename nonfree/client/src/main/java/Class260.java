import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class260 {

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "F")
	public float aFloat212 = 1.0F;

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "F")
	public float aFloat214 = 1.0F;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "F")
	public float aFloat211 = 0.25F;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
	public final int anInt7866;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "F")
	public final float aFloat216;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "F")
	public final float aFloat213;

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
	public final int anInt7870;

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "Lclient!tj;")
	public final Class4 aClass4_10;

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
	public final int anInt7869;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
	public final int anInt7867;

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
	public final int anInt7872;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "F")
	public final float aFloat215;

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
	public final int anInt7868;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class260() {
		this.anInt7866 = Static315.anInt6423;
		this.aFloat216 = 0.69921875F;
		this.aFloat213 = 1.2F;
		this.anInt7870 = Static621.anInt10313;
		this.aClass4_10 = Static312.aClass4_13;
		this.anInt7869 = 0;
		this.anInt7867 = -50;
		this.anInt7872 = -60;
		this.aFloat215 = 1.1523438F;
		this.anInt7868 = -50;
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!tn;)V")
	public Class260(@OriginalArg(0) Class3_Sub15 arg0) {
		@Pc(16) int local16 = arg0.method8401();
		if (Static552.aClass3_Sub48_30.aClass23_Sub7_1.method3329() == 1 && Static174.aClass33_7.method6226() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt7870 = Static621.anInt10313;
			} else {
				this.anInt7870 = arg0.method8402();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat215 = 1.1523438F;
			} else {
				this.aFloat215 = (float) arg0.method8414() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat216 = 0.69921875F;
			} else {
				this.aFloat216 = (float) arg0.method8414() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat213 = 1.2F;
			} else {
				this.aFloat213 = (float) arg0.method8414() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method8402();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method8414();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method8414();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method8414();
			}
			this.aFloat215 = 1.1523438F;
			this.anInt7870 = Static621.anInt10313;
			this.aFloat213 = 1.2F;
			this.aFloat216 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt7867 = -50;
			this.anInt7868 = -50;
			this.anInt7872 = -60;
		} else {
			this.anInt7867 = arg0.method8444();
			this.anInt7872 = arg0.method8444();
			this.anInt7868 = arg0.method8444();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt7866 = Static315.anInt6423;
		} else {
			this.anInt7866 = arg0.method8402();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt7869 = 0;
		} else {
			this.anInt7869 = arg0.method8414();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass4_10 = Static312.aClass4_13;
		} else {
			@Pc(232) int local232 = arg0.method8414();
			@Pc(236) int local236 = arg0.method8414();
			@Pc(240) int local240 = arg0.method8414();
			@Pc(244) int local244 = arg0.method8414();
			@Pc(248) int local248 = arg0.method8414();
			@Pc(252) int local252 = arg0.method8414();
			this.aClass4_10 = Static27.method486(local240, local244, local252, local248, local232, local236);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!tn;)V")
	public void method6583(@OriginalArg(1) Class3_Sub15 arg0) {
		this.aFloat212 = (float) (arg0.method8401() * 8) / 255.0F;
		this.aFloat211 = (float) (arg0.method8401() * 8) / 255.0F;
		this.aFloat214 = (float) (arg0.method8401() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!pg;B)Z")
	public boolean method6584(@OriginalArg(0) Class260 arg0) {
		return arg0.anInt7870 == this.anInt7870 && arg0.aFloat215 == this.aFloat215 && arg0.aFloat216 == this.aFloat216 && this.aFloat213 == arg0.aFloat213 && this.aFloat211 == arg0.aFloat211 && arg0.aFloat212 == this.aFloat212 && this.aFloat214 == arg0.aFloat214 && this.anInt7866 == arg0.anInt7866 && arg0.anInt7869 == this.anInt7869 && arg0.aClass4_10 == this.aClass4_10;
	}
}
