import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class102 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "F")
	public float aFloat16 = 1.0F;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "F")
	public float aFloat17 = 0.25F;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "F")
	public float aFloat20 = 1.0F;

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
	public final int anInt2509;

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
	public final int anInt2511;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "F")
	public final float aFloat19;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "Lclient!ja;")
	public final Class8 aClass8_4;

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
	public final int anInt2508;

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "F")
	public final float aFloat18;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
	public final int anInt2503;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
	public final int anInt2505;

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
	public final int anInt2512;

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "F")
	public final float aFloat21;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	public Class102() {
		this.anInt2509 = -50;
		this.anInt2511 = -60;
		this.aFloat19 = 0.69921875F;
		this.aClass8_4 = Static118.aClass8_3;
		this.anInt2508 = Static103.anInt2049;
		this.aFloat18 = 1.1523438F;
		this.anInt2503 = Static162.anInt2896;
		this.anInt2505 = 0;
		this.anInt2512 = -50;
		this.aFloat21 = 1.2F;
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!rp;)V")
	public Class102(@OriginalArg(0) Class3_Sub5 arg0) {
		@Pc(16) int local16 = arg0.method2739();
		if (Static164.aClass154_Sub1_1.aBoolean463 && Static278.aClass155_6.method4943() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt2508 = Static103.anInt2049;
			} else {
				this.anInt2508 = arg0.method2726();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat18 = 1.1523438F;
			} else {
				this.aFloat18 = (float) arg0.method2767() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat19 = 0.69921875F;
			} else {
				this.aFloat19 = (float) arg0.method2767() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat21 = 1.2F;
			} else {
				this.aFloat21 = (float) arg0.method2767() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method2726();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method2767();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method2767();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method2767();
			}
			this.aFloat21 = 1.2F;
			this.aFloat19 = 0.69921875F;
			this.aFloat18 = 1.1523438F;
			this.anInt2508 = Static103.anInt2049;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt2512 = -50;
			this.anInt2511 = -60;
			this.anInt2509 = -50;
		} else {
			this.anInt2512 = arg0.method2740();
			this.anInt2511 = arg0.method2740();
			this.anInt2509 = arg0.method2740();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt2503 = Static162.anInt2896;
		} else {
			this.anInt2503 = arg0.method2726();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt2505 = 0;
		} else {
			this.anInt2505 = arg0.method2767();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass8_4 = Static118.aClass8_3;
		} else {
			this.aClass8_4 = Static244.method3985(arg0.method2767(), arg0.method2767(), arg0.method2767(), arg0.method2767(), arg0.method2767(), arg0.method2767());
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!hg;)Z")
	public boolean method2094(@OriginalArg(1) Class102 arg0) {
		return arg0.anInt2508 == this.anInt2508 && arg0.aFloat18 == this.aFloat18 && arg0.aFloat19 == this.aFloat19 && arg0.aFloat21 == this.aFloat21 && arg0.aFloat17 == this.aFloat17 && arg0.aFloat16 == this.aFloat16 && this.aFloat20 == arg0.aFloat20 && arg0.anInt2503 == this.anInt2503 && this.anInt2505 == arg0.anInt2505 && arg0.aClass8_4 == this.aClass8_4;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!rp;I)V")
	public void method2095(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aFloat16 = (float) (arg0.method2739() * 8) / 255.0F;
		this.aFloat17 = (float) (arg0.method2739() * 8) / 255.0F;
		this.aFloat20 = (float) (arg0.method2739() * 8) / 255.0F;
	}
}
