import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class191 {

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "F")
	public float aFloat69 = 1.0F;

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "F")
	public float aFloat73 = 0.25F;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "F")
	public float aFloat72 = 1.0F;

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
	public final int anInt6124;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
	public final int anInt6121;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "F")
	public final float aFloat68;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
	public final int anInt6116;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "F")
	public final float aFloat70;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
	public final int anInt6114;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "Lclient!tc;")
	public final Class3 aClass3_3;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
	public final int anInt6112;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "F")
	public final float aFloat71;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	public final int anInt6118;

	static {
		new Class140("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	public Class191() {
		this.anInt6124 = Static341.anInt463;
		this.anInt6121 = -60;
		this.aFloat68 = 1.1523438F;
		this.anInt6116 = -50;
		this.aFloat70 = 0.69921875F;
		this.anInt6114 = -50;
		this.aClass3_3 = Static128.aClass3_2;
		this.anInt6112 = Static328.anInt6689;
		this.aFloat71 = 1.2F;
		this.anInt6118 = 0;
	}

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class191(@OriginalArg(0) Class2_Sub12 arg0) {
		@Pc(16) int local16 = arg0.method3124();
		if (Static309.aBoolean544 && Static79.aClass37_2.method3740() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt6124 = Static341.anInt463;
			} else {
				this.anInt6124 = arg0.method3135();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat68 = 1.1523438F;
			} else {
				this.aFloat68 = (float) arg0.method3104() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat70 = 0.69921875F;
			} else {
				this.aFloat70 = (float) arg0.method3104() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat71 = 1.2F;
			} else {
				this.aFloat71 = (float) arg0.method3104() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method3135();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method3104();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method3104();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method3104();
			}
			this.aFloat71 = 1.2F;
			this.anInt6124 = Static341.anInt463;
			this.aFloat68 = 1.1523438F;
			this.aFloat70 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt6121 = -60;
			this.anInt6116 = -50;
			this.anInt6114 = -50;
		} else {
			this.anInt6116 = arg0.method3108();
			this.anInt6121 = arg0.method3108();
			this.anInt6114 = arg0.method3108();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt6112 = Static328.anInt6689;
		} else {
			this.anInt6112 = arg0.method3135();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt6118 = 0;
		} else {
			this.anInt6118 = arg0.method3104();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass3_3 = Static128.aClass3_2;
		} else {
			this.aClass3_3 = Static347.method5646(arg0.method3104(), arg0.method3104(), arg0.method3104(), arg0.method3104(), arg0.method3104(), arg0.method3104());
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLclient!ef;)V")
	public void method5156(@OriginalArg(1) Class2_Sub12 arg0) {
		this.aFloat69 = (float) (arg0.method3124() * 8) / 255.0F;
		this.aFloat73 = (float) (arg0.method3124() * 8) / 255.0F;
		this.aFloat72 = (float) (arg0.method3124() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZLclient!tg;)Z")
	public boolean method5161(@OriginalArg(1) Class191 arg0) {
		return arg0.anInt6124 == this.anInt6124 && arg0.aFloat68 == this.aFloat68 && this.aFloat70 == arg0.aFloat70 && arg0.aFloat71 == this.aFloat71 && arg0.aFloat73 == this.aFloat73 && this.aFloat69 == arg0.aFloat69 && this.aFloat72 == arg0.aFloat72 && arg0.anInt6112 == this.anInt6112 && arg0.anInt6118 == this.anInt6118 && this.aClass3_3 == arg0.aClass3_3;
	}
}
