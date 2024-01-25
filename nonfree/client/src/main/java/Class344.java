import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class344 {

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "F")
	public float aFloat174 = 0.25F;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "F")
	public float aFloat175 = 1.0F;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "F")
	public float aFloat178 = 1.0F;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "F")
	public final float aFloat173;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
	public final int anInt8742;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
	public final int anInt8744;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
	public final int anInt8738;

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
	public final int anInt8745;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "F")
	public final float aFloat176;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "F")
	public final float aFloat177;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!lj;")
	public final Class12 aClass12_3;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
	public final int anInt8741;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
	public final int anInt8735;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class344() {
		this.aFloat173 = 0.69921875F;
		this.anInt8742 = -50;
		this.anInt8744 = 0;
		this.anInt8738 = Static525.anInt8428;
		this.anInt8745 = Static443.anInt7208;
		this.aFloat176 = 1.2F;
		this.aFloat177 = 1.1523438F;
		this.aClass12_3 = Static565.aClass12_4;
		this.anInt8741 = -60;
		this.anInt8735 = -50;
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!np;)V")
	public Class344(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(16) int local16 = arg0.method5175();
		if (Static405.aClass3_Sub3_Sub1_1.method6297(Static60.anInt1312) && Static288.aClass45_9.method7374() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt8738 = Static525.anInt8428;
			} else {
				this.anInt8738 = arg0.method5186();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat177 = 1.1523438F;
			} else {
				this.aFloat177 = (float) arg0.method5198() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat173 = 0.69921875F;
			} else {
				this.aFloat173 = (float) arg0.method5198() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat176 = 1.2F;
			} else {
				this.aFloat176 = (float) arg0.method5198() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5186();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5198();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5198();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5198();
			}
			this.aFloat173 = 0.69921875F;
			this.aFloat176 = 1.2F;
			this.anInt8738 = Static525.anInt8428;
			this.aFloat177 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt8741 = -60;
			this.anInt8735 = -50;
			this.anInt8742 = -50;
		} else {
			this.anInt8742 = arg0.method5231();
			this.anInt8741 = arg0.method5231();
			this.anInt8735 = arg0.method5231();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt8745 = Static443.anInt7208;
		} else {
			this.anInt8745 = arg0.method5186();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt8744 = 0;
		} else {
			this.anInt8744 = arg0.method5198();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass12_3 = Static565.aClass12_4;
		} else {
			@Pc(223) int local223 = arg0.method5198();
			@Pc(227) int local227 = arg0.method5198();
			@Pc(231) int local231 = arg0.method5198();
			@Pc(235) int local235 = arg0.method5198();
			@Pc(239) int local239 = arg0.method5198();
			@Pc(243) int local243 = arg0.method5198();
			this.aClass12_3 = Static470.method6496(local223, local231, local239, local227, local235, local243);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!vc;I)Z")
	public boolean method7281(@OriginalArg(0) Class344 arg0) {
		return this.anInt8738 == arg0.anInt8738 && this.aFloat177 == arg0.aFloat177 && arg0.aFloat173 == this.aFloat173 && arg0.aFloat176 == this.aFloat176 && arg0.aFloat174 == this.aFloat174 && arg0.aFloat175 == this.aFloat175 && this.aFloat178 == arg0.aFloat178 && this.anInt8745 == arg0.anInt8745 && arg0.anInt8744 == this.anInt8744 && this.aClass12_3 == arg0.aClass12_3;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLclient!np;)V")
	public void method7282(@OriginalArg(1) Class3_Sub11 arg0) {
		this.aFloat175 = (float) (arg0.method5175() * 8) / 255.0F;
		this.aFloat174 = (float) (arg0.method5175() * 8) / 255.0F;
		this.aFloat178 = (float) (arg0.method5175() * 8) / 255.0F;
	}
}
