import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class226 {

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "F")
	public float aFloat81 = 1.0F;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "F")
	public float aFloat82 = 1.0F;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "F")
	public float aFloat84 = 0.25F;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
	public final int anInt6542;

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "Lclient!mt;")
	public final Class141 aClass141_3;

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
	public final int anInt6546;

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
	public final int anInt6543;

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "F")
	public final float aFloat86;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
	public final int anInt6537;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "F")
	public final float aFloat83;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
	public final int anInt6541;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
	public final int anInt6540;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "F")
	public final float aFloat85;

	static {
		new Class231("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
	public Class226() {
		this.anInt6542 = -50;
		this.aClass141_3 = Static434.aClass141_4;
		this.anInt6546 = 0;
		this.anInt6543 = -50;
		this.aFloat86 = 1.1523438F;
		this.anInt6537 = -60;
		this.aFloat83 = 0.69921875F;
		this.anInt6541 = Static298.anInt5367;
		this.anInt6540 = Static149.anInt7396;
		this.aFloat85 = 1.2F;
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!hw;)V")
	public Class226(@OriginalArg(0) Class2_Sub17 arg0) {
		@Pc(16) int local16 = arg0.method6138();
		if (Static434.aClass165_Sub1_1.method3390(Static404.anInt2752) && Static28.aClass75_3.method5994() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt6540 = Static149.anInt7396;
			} else {
				this.anInt6540 = arg0.method6129();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat86 = 1.1523438F;
			} else {
				this.aFloat86 = (float) arg0.method6148() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat83 = 0.69921875F;
			} else {
				this.aFloat83 = (float) arg0.method6148() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat85 = 1.2F;
			} else {
				this.aFloat85 = (float) arg0.method6148() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method6129();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method6148();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method6148();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method6148();
			}
			this.anInt6540 = Static149.anInt7396;
			this.aFloat86 = 1.1523438F;
			this.aFloat83 = 0.69921875F;
			this.aFloat85 = 1.2F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt6543 = -50;
			this.anInt6542 = -50;
			this.anInt6537 = -60;
		} else {
			this.anInt6543 = arg0.method6149();
			this.anInt6537 = arg0.method6149();
			this.anInt6542 = arg0.method6149();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt6541 = Static298.anInt5367;
		} else {
			this.anInt6541 = arg0.method6129();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt6546 = 0;
		} else {
			this.anInt6546 = arg0.method6148();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass141_3 = Static434.aClass141_4;
		} else {
			@Pc(217) int local217 = arg0.method6148();
			@Pc(221) int local221 = arg0.method6148();
			@Pc(225) int local225 = arg0.method6148();
			@Pc(229) int local229 = arg0.method6148();
			@Pc(233) int local233 = arg0.method6148();
			@Pc(237) int local237 = arg0.method6148();
			this.aClass141_3 = Static114.method1875(local233, local217, local237, local225, local229, local221);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!hw;)V")
	public void method5204(@OriginalArg(1) Class2_Sub17 arg0) {
		this.aFloat82 = (float) (arg0.method6138() * 8) / 255.0F;
		this.aFloat84 = (float) (arg0.method6138() * 8) / 255.0F;
		this.aFloat81 = (float) (arg0.method6138() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!sk;)Z")
	public boolean method5208(@OriginalArg(1) Class226 arg0) {
		return arg0.anInt6540 == this.anInt6540 && this.aFloat86 == arg0.aFloat86 && this.aFloat83 == arg0.aFloat83 && arg0.aFloat85 == this.aFloat85 && arg0.aFloat84 == this.aFloat84 && arg0.aFloat82 == this.aFloat82 && arg0.aFloat81 == this.aFloat81 && arg0.anInt6541 == this.anInt6541 && arg0.anInt6546 == this.anInt6546 && this.aClass141_3 == arg0.aClass141_3;
	}
}
