import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class68 {

	@OriginalMember(owner = "client!em", name = "d", descriptor = "F")
	public float aFloat72 = 0.25F;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "F")
	public float aFloat75 = 1.0F;

	@OriginalMember(owner = "client!em", name = "r", descriptor = "F")
	public float aFloat77 = 1.0F;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "F")
	public final float aFloat73;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	public final int anInt2168;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "F")
	public final float aFloat74;

	@OriginalMember(owner = "client!em", name = "m", descriptor = "Lclient!to;")
	public final Class21 aClass21_2;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "I")
	public final int anInt2165;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	public final int anInt2167;

	@OriginalMember(owner = "client!em", name = "q", descriptor = "F")
	public final float aFloat76;

	@OriginalMember(owner = "client!em", name = "n", descriptor = "I")
	public final int anInt2171;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "I")
	public final int anInt2164;

	@OriginalMember(owner = "client!em", name = "l", descriptor = "I")
	public final int anInt2170;

	static {
		new Class256("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	public Class68() {
		this.aFloat73 = 0.69921875F;
		this.anInt2168 = 0;
		this.aFloat74 = 1.2F;
		this.aClass21_2 = Static376.aClass21_3;
		this.anInt2165 = -50;
		this.anInt2167 = -60;
		this.aFloat76 = 1.1523438F;
		this.anInt2171 = -50;
		this.anInt2164 = Static166.anInt3219;
		this.anInt2170 = Static75.anInt1859;
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!md;)V")
	public Class68(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(16) int local16 = arg0.method3737();
		if (Static399.aClass167_Sub1_1.method4514(Static281.anInt5126) && Static184.aClass26_4.method2281() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt2164 = Static166.anInt3219;
			} else {
				this.anInt2164 = arg0.method3731();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat76 = 1.1523438F;
			} else {
				this.aFloat76 = (float) arg0.method3711() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat73 = 0.69921875F;
			} else {
				this.aFloat73 = (float) arg0.method3711() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat74 = 1.2F;
			} else {
				this.aFloat74 = (float) arg0.method3711() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method3731();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method3711();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method3711();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method3711();
			}
			this.aFloat74 = 1.2F;
			this.aFloat73 = 0.69921875F;
			this.anInt2164 = Static166.anInt3219;
			this.aFloat76 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt2171 = -50;
			this.anInt2165 = -50;
			this.anInt2167 = -60;
		} else {
			this.anInt2165 = arg0.method3701();
			this.anInt2167 = arg0.method3701();
			this.anInt2171 = arg0.method3701();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt2170 = Static75.anInt1859;
		} else {
			this.anInt2170 = arg0.method3731();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt2168 = 0;
		} else {
			this.anInt2168 = arg0.method3711();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass21_2 = Static376.aClass21_3;
		} else {
			@Pc(229) int local229 = arg0.method3711();
			@Pc(233) int local233 = arg0.method3711();
			@Pc(237) int local237 = arg0.method3711();
			@Pc(241) int local241 = arg0.method3711();
			@Pc(245) int local245 = arg0.method3711();
			@Pc(249) int local249 = arg0.method3711();
			this.aClass21_2 = Static256.method3901(local229, local245, local233, local237, local241, local249);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!md;I)V")
	public void method1602(@OriginalArg(0) Class2_Sub20 arg0) {
		this.aFloat77 = (float) (arg0.method3737() * 8) / 255.0F;
		this.aFloat72 = (float) (arg0.method3737() * 8) / 255.0F;
		this.aFloat75 = (float) (arg0.method3737() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!em;B)Z")
	public boolean method1605(@OriginalArg(0) Class68 arg0) {
		return this.anInt2164 == arg0.anInt2164 && arg0.aFloat76 == this.aFloat76 && arg0.aFloat73 == this.aFloat73 && arg0.aFloat74 == this.aFloat74 && this.aFloat72 == arg0.aFloat72 && arg0.aFloat77 == this.aFloat77 && arg0.aFloat75 == this.aFloat75 && this.anInt2170 == arg0.anInt2170 && this.anInt2168 == arg0.anInt2168 && this.aClass21_2 == arg0.aClass21_2;
	}
}
