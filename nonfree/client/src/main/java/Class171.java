import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class171 {

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "F")
	public float aFloat65 = 1.0F;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "F")
	public float aFloat66 = 0.25F;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "F")
	public float aFloat61 = 1.0F;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	public final int anInt4232;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
	public final int anInt4235;

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
	public final int anInt4239;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "F")
	public final float aFloat63;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "Lclient!aq;")
	public final Class17 aClass17_2;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "F")
	public final float aFloat64;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "F")
	public final float aFloat62;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
	public final int anInt4229;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
	public final int anInt4231;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
	public final int anInt4241;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
	public Class171() {
		this.anInt4232 = Static252.anInt4138;
		this.anInt4235 = -50;
		this.anInt4239 = 0;
		this.aFloat63 = 1.1523438F;
		this.aClass17_2 = Static443.aClass17_4;
		this.aFloat64 = 0.69921875F;
		this.aFloat62 = 1.2F;
		this.anInt4229 = -60;
		this.anInt4231 = Static276.anInt4600;
		this.anInt4241 = -50;
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!dga;)V")
	public Class171(@OriginalArg(0) Class6_Sub14 arg0) {
		@Pc(16) int local16 = arg0.method6041();
		if (Static480.aClass6_Sub37_Sub1_1.method5151(Static567.anInt9503) && Static246.aClass121_7.method7085() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt4231 = Static276.anInt4600;
			} else {
				this.anInt4231 = arg0.method6027();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat63 = 1.1523438F;
			} else {
				this.aFloat63 = (float) arg0.method6006() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat64 = 0.69921875F;
			} else {
				this.aFloat64 = (float) arg0.method6006() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat62 = 1.2F;
			} else {
				this.aFloat62 = (float) arg0.method6006() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method6027();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method6006();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method6006();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method6006();
			}
			this.aFloat63 = 1.1523438F;
			this.aFloat64 = 0.69921875F;
			this.aFloat62 = 1.2F;
			this.anInt4231 = Static276.anInt4600;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt4241 = -50;
			this.anInt4235 = -50;
			this.anInt4229 = -60;
		} else {
			this.anInt4241 = arg0.method6008();
			this.anInt4229 = arg0.method6008();
			this.anInt4235 = arg0.method6008();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt4232 = Static252.anInt4138;
		} else {
			this.anInt4232 = arg0.method6027();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt4239 = 0;
		} else {
			this.anInt4239 = arg0.method6006();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass17_2 = Static443.aClass17_4;
		} else {
			@Pc(232) int local232 = arg0.method6006();
			@Pc(236) int local236 = arg0.method6006();
			@Pc(240) int local240 = arg0.method6006();
			@Pc(244) int local244 = arg0.method6006();
			@Pc(248) int local248 = arg0.method6006();
			@Pc(252) int local252 = arg0.method6006();
			this.aClass17_2 = Static188.method2785(local232, local252, local240, local236, local244, local248);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!kg;B)Z")
	public boolean method3639(@OriginalArg(0) Class171 arg0) {
		return arg0.anInt4231 == this.anInt4231 && this.aFloat63 == arg0.aFloat63 && this.aFloat64 == arg0.aFloat64 && arg0.aFloat62 == this.aFloat62 && this.aFloat66 == arg0.aFloat66 && this.aFloat65 == arg0.aFloat65 && arg0.aFloat61 == this.aFloat61 && arg0.anInt4232 == this.anInt4232 && arg0.anInt4239 == this.anInt4239 && this.aClass17_2 == arg0.aClass17_2;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!dga;)V")
	public void method3640(@OriginalArg(1) Class6_Sub14 arg0) {
		this.aFloat65 = (float) (arg0.method6041() * 8) / 255.0F;
		this.aFloat66 = (float) (arg0.method6041() * 8) / 255.0F;
		this.aFloat61 = (float) (arg0.method6041() * 8) / 255.0F;
	}
}
