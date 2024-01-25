import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class125 {

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "F")
	public float aFloat53 = 1.0F;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "F")
	public float aFloat56 = 0.25F;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "F")
	public float aFloat52 = 1.0F;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
	public final int anInt3074;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "F")
	public final float aFloat55;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "F")
	public final float aFloat57;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
	public final int anInt3077;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "F")
	public final float aFloat54;

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
	public final int anInt3078;

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
	public final int anInt3079;

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
	public final int anInt3072;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	public final int anInt3070;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!lf;")
	public final Class133 aClass133_2;

	static {
		new Class231("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public Class125() {
		this.anInt3074 = -50;
		this.aFloat55 = 1.1523438F;
		this.aFloat57 = 1.2F;
		this.anInt3077 = Static215.anInt3736;
		this.aFloat54 = 0.69921875F;
		this.anInt3078 = -60;
		this.anInt3079 = Static414.anInt6927;
		this.anInt3072 = -50;
		this.anInt3070 = 0;
		this.aClass133_2 = Static35.aClass133_1;
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!ha;)V")
	public Class125(@OriginalArg(0) Class6_Sub15 arg0) {
		@Pc(16) int local16 = arg0.method3111();
		if (Static8.aClass173_Sub1_1.aBoolean317 && Static307.aClass28_42.method3574() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt3077 = Static215.anInt3736;
			} else {
				this.anInt3077 = arg0.method3109();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat55 = 1.1523438F;
			} else {
				this.aFloat55 = (float) arg0.method3108() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat54 = 0.69921875F;
			} else {
				this.aFloat54 = (float) arg0.method3108() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat57 = 1.2F;
			} else {
				this.aFloat57 = (float) arg0.method3108() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method3109();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method3108();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method3108();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method3108();
			}
			this.anInt3077 = Static215.anInt3736;
			this.aFloat54 = 0.69921875F;
			this.aFloat57 = 1.2F;
			this.aFloat55 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt3078 = -60;
			this.anInt3072 = -50;
			this.anInt3074 = -50;
		} else {
			this.anInt3072 = arg0.method3103();
			this.anInt3078 = arg0.method3103();
			this.anInt3074 = arg0.method3103();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt3079 = Static414.anInt6927;
		} else {
			this.anInt3079 = arg0.method3109();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt3070 = 0;
		} else {
			this.anInt3070 = arg0.method3108();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass133_2 = Static35.aClass133_1;
		} else {
			@Pc(224) int local224 = arg0.method3108();
			@Pc(228) int local228 = arg0.method3108();
			@Pc(232) int local232 = arg0.method3108();
			@Pc(236) int local236 = arg0.method3108();
			@Pc(240) int local240 = arg0.method3108();
			@Pc(244) int local244 = arg0.method3108();
			this.aClass133_2 = Static439.method5909(local244, local240, local236, local224, local228, local232);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method2768(@OriginalArg(0) Class6_Sub15 arg0) {
		this.aFloat52 = (float) (arg0.method3111() * 8) / 255.0F;
		this.aFloat56 = (float) (arg0.method3111() * 8) / 255.0F;
		this.aFloat53 = (float) (arg0.method3111() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ja;I)Z")
	public boolean method2772(@OriginalArg(0) Class125 arg0) {
		return arg0.anInt3077 == this.anInt3077 && arg0.aFloat55 == this.aFloat55 && this.aFloat54 == arg0.aFloat54 && this.aFloat57 == arg0.aFloat57 && arg0.aFloat56 == this.aFloat56 && this.aFloat52 == arg0.aFloat52 && this.aFloat53 == arg0.aFloat53 && arg0.anInt3079 == this.anInt3079 && arg0.anInt3070 == this.anInt3070 && arg0.aClass133_2 == this.aClass133_2;
	}
}
