import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class126 {

	@OriginalMember(owner = "client!he", name = "c", descriptor = "F")
	public float aFloat56 = 0.25F;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "F")
	public float aFloat58 = 1.0F;

	@OriginalMember(owner = "client!he", name = "t", descriptor = "F")
	public float aFloat60 = 1.0F;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "F")
	public final float aFloat57;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "I")
	public final int anInt3479;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "I")
	public final int anInt3478;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "F")
	public final float aFloat59;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "I")
	public final int anInt3475;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "F")
	public final float aFloat55;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "I")
	public final int anInt3474;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "I")
	public final int anInt3473;

	@OriginalMember(owner = "client!he", name = "u", descriptor = "Lclient!mv;")
	public final Class103 aClass103_1;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "I")
	public final int anInt3476;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class126() {
		this.aFloat57 = 1.1523438F;
		this.anInt3479 = Static179.anInt3764;
		this.anInt3478 = -60;
		this.aFloat59 = 1.2F;
		this.anInt3475 = Static139.anInt2796;
		this.aFloat55 = 0.69921875F;
		this.anInt3474 = -50;
		this.anInt3473 = -50;
		this.aClass103_1 = Static193.aClass103_2;
		this.anInt3476 = 0;
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class126(@OriginalArg(0) Class1_Sub17 arg0) {
		@Pc(16) int local16 = arg0.method4487();
		if (Static286.aClass1_Sub15_Sub1_1.method6361(Static449.anInt7876) && Static247.aClass4_7.method7163() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt3479 = Static179.anInt3764;
			} else {
				this.anInt3479 = arg0.method4481();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat57 = 1.1523438F;
			} else {
				this.aFloat57 = (float) arg0.method4494() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat55 = 0.69921875F;
			} else {
				this.aFloat55 = (float) arg0.method4494() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat59 = 1.2F;
			} else {
				this.aFloat59 = (float) arg0.method4494() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method4481();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method4494();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method4494();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method4494();
			}
			this.aFloat57 = 1.1523438F;
			this.aFloat59 = 1.2F;
			this.anInt3479 = Static179.anInt3764;
			this.aFloat55 = 0.69921875F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt3478 = -60;
			this.anInt3474 = -50;
			this.anInt3473 = -50;
		} else {
			this.anInt3474 = arg0.method4447();
			this.anInt3478 = arg0.method4447();
			this.anInt3473 = arg0.method4447();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt3475 = Static139.anInt2796;
		} else {
			this.anInt3475 = arg0.method4481();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt3476 = 0;
		} else {
			this.anInt3476 = arg0.method4494();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass103_1 = Static193.aClass103_2;
		} else {
			@Pc(225) int local225 = arg0.method4494();
			@Pc(229) int local229 = arg0.method4494();
			@Pc(233) int local233 = arg0.method4494();
			@Pc(237) int local237 = arg0.method4494();
			@Pc(241) int local241 = arg0.method4494();
			@Pc(245) int local245 = arg0.method4494();
			this.aClass103_1 = Static361.method5868(local245, local233, local237, local225, local229, local241);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!os;B)V")
	public void method3238(@OriginalArg(0) Class1_Sub17 arg0) {
		this.aFloat58 = (float) (arg0.method4487() * 8) / 255.0F;
		this.aFloat56 = (float) (arg0.method4487() * 8) / 255.0F;
		this.aFloat60 = (float) (arg0.method4487() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!he;B)Z")
	public boolean method3241(@OriginalArg(0) Class126 arg0) {
		return this.anInt3479 == arg0.anInt3479 && arg0.aFloat57 == this.aFloat57 && this.aFloat55 == arg0.aFloat55 && this.aFloat59 == arg0.aFloat59 && arg0.aFloat56 == this.aFloat56 && this.aFloat58 == arg0.aFloat58 && this.aFloat60 == arg0.aFloat60 && this.anInt3475 == arg0.anInt3475 && this.anInt3476 == arg0.anInt3476 && arg0.aClass103_1 == this.aClass103_1;
	}
}
