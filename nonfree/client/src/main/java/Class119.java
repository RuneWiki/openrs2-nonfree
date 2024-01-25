import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class119 {

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "F")
	public float aFloat45 = 0.25F;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "F")
	public float aFloat47 = 1.0F;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "F")
	public float aFloat44 = 1.0F;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
	public final int anInt3055;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
	public final int anInt3047;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "Lclient!rp;")
	public final Class21 aClass21_2;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "F")
	public final float aFloat48;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "F")
	public final float aFloat46;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	public final int anInt3049;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
	public final int anInt3050;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
	public final int anInt3053;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
	public final int anInt3054;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "F")
	public final float aFloat43;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	public Class119() {
		this.anInt3055 = -60;
		this.anInt3047 = 0;
		this.aClass21_2 = Static88.aClass21_1;
		this.aFloat48 = 0.69921875F;
		this.aFloat46 = 1.2F;
		this.anInt3049 = Static161.anInt3121;
		this.anInt3050 = -50;
		this.anInt3053 = Static110.anInt2329;
		this.anInt3054 = -50;
		this.aFloat43 = 1.1523438F;
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!kk;)V")
	public Class119(@OriginalArg(0) Class2_Sub16 arg0) {
		@Pc(16) int local16 = arg0.method5350();
		if (Static212.aBoolean293 && Static140.aClass63_4.method1990() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt3053 = Static110.anInt2329;
			} else {
				this.anInt3053 = arg0.method5346();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat43 = 1.1523438F;
			} else {
				this.aFloat43 = (float) arg0.method5312() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat48 = 0.69921875F;
			} else {
				this.aFloat48 = (float) arg0.method5312() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat46 = 1.2F;
			} else {
				this.aFloat46 = (float) arg0.method5312() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method5346();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method5312();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method5312();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method5312();
			}
			this.aFloat48 = 0.69921875F;
			this.aFloat43 = 1.1523438F;
			this.aFloat46 = 1.2F;
			this.anInt3053 = Static110.anInt2329;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt3050 = -50;
			this.anInt3055 = -60;
			this.anInt3054 = -50;
		} else {
			this.anInt3054 = arg0.method5341();
			this.anInt3055 = arg0.method5341();
			this.anInt3050 = arg0.method5341();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt3049 = Static161.anInt3121;
		} else {
			this.anInt3049 = arg0.method5346();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt3047 = 0;
		} else {
			this.anInt3047 = arg0.method5312();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass21_2 = Static88.aClass21_1;
		} else {
			this.aClass21_2 = Static59.method954(arg0.method5312(), arg0.method5312(), arg0.method5312(), arg0.method5312(), arg0.method5312(), arg0.method5312());
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!jf;)Z")
	public boolean method2862(@OriginalArg(1) Class119 arg0) {
		return this.anInt3053 == arg0.anInt3053 && this.aFloat43 == arg0.aFloat43 && arg0.aFloat48 == this.aFloat48 && arg0.aFloat46 == this.aFloat46 && arg0.aFloat45 == this.aFloat45 && this.aFloat44 == arg0.aFloat44 && arg0.aFloat47 == this.aFloat47 && this.anInt3049 == arg0.anInt3049 && arg0.anInt3047 == this.anInt3047 && arg0.aClass21_2 == this.aClass21_2;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!kk;)V")
	public void method2864(@OriginalArg(1) Class2_Sub16 arg0) {
		this.aFloat44 = (float) (arg0.method5350() * 8) / 255.0F;
		this.aFloat45 = (float) (arg0.method5350() * 8) / 255.0F;
		this.aFloat47 = (float) (arg0.method5350() * 8) / 255.0F;
	}
}
