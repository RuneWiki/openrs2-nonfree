import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class274 {

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "F")
	public float aFloat171 = 0.25F;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "F")
	public float aFloat172 = 1.0F;

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "F")
	public float aFloat173 = 1.0F;

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "F")
	public final float aFloat174;

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
	public final int anInt8207;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
	public final int anInt8204;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
	public final int anInt8205;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
	public final int anInt8203;

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
	public final int anInt8206;

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "Lclient!om;")
	public final Class57 aClass57_1;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
	public final int anInt8208;

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "F")
	public final float aFloat175;

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "F")
	public final float aFloat176;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class274() {
		this.aFloat174 = 1.1523438F;
		this.anInt8207 = Static634.anInt10638;
		this.anInt8204 = Static588.anInt9824;
		this.anInt8205 = -50;
		this.anInt8203 = -60;
		this.anInt8206 = -50;
		this.aClass57_1 = Static636.aClass57_4;
		this.anInt8208 = 0;
		this.aFloat175 = 1.2F;
		this.aFloat176 = 0.69921875F;
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!rg;)V")
	public Class274(@OriginalArg(0) Class6_Sub40 arg0) {
		@Pc(16) int local16 = arg0.method8604();
		if (Static348.aClass6_Sub22_19.aClass15_Sub1_1.method331() == 1 && Static6.aClass100_1.method8780() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt8207 = Static634.anInt10638;
			} else {
				this.anInt8207 = arg0.method8579();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat174 = 1.1523438F;
			} else {
				this.aFloat174 = (float) arg0.method8571() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat176 = 0.69921875F;
			} else {
				this.aFloat176 = (float) arg0.method8571() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat175 = 1.2F;
			} else {
				this.aFloat175 = (float) arg0.method8571() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method8579();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method8571();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method8571();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method8571();
			}
			this.aFloat176 = 0.69921875F;
			this.anInt8207 = Static634.anInt10638;
			this.aFloat175 = 1.2F;
			this.aFloat174 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt8206 = -50;
			this.anInt8205 = -50;
			this.anInt8203 = -60;
		} else {
			this.anInt8205 = arg0.method8615();
			this.anInt8203 = arg0.method8615();
			this.anInt8206 = arg0.method8615();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt8204 = Static588.anInt9824;
		} else {
			this.anInt8204 = arg0.method8579();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt8208 = 0;
		} else {
			this.anInt8208 = arg0.method8571();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass57_1 = Static636.aClass57_4;
		} else {
			@Pc(228) int local228 = arg0.method8571();
			@Pc(232) int local232 = arg0.method8571();
			@Pc(236) int local236 = arg0.method8571();
			@Pc(240) int local240 = arg0.method8571();
			@Pc(244) int local244 = arg0.method8571();
			@Pc(248) int local248 = arg0.method8571();
			this.aClass57_1 = Static266.method4716(local244, local240, local248, local232, local228, local236);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!rg;)V")
	public void method7073(@OriginalArg(1) Class6_Sub40 arg0) {
		this.aFloat172 = (float) (arg0.method8604() * 8) / 255.0F;
		this.aFloat171 = (float) (arg0.method8604() * 8) / 255.0F;
		this.aFloat173 = (float) (arg0.method8604() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!qj;I)Z")
	public boolean method7074(@OriginalArg(0) Class274 arg0) {
		return arg0.anInt8207 == this.anInt8207 && arg0.aFloat174 == this.aFloat174 && this.aFloat176 == arg0.aFloat176 && this.aFloat175 == arg0.aFloat175 && arg0.aFloat171 == this.aFloat171 && arg0.aFloat172 == this.aFloat172 && arg0.aFloat173 == this.aFloat173 && arg0.anInt8204 == this.anInt8204 && arg0.anInt8208 == this.anInt8208 && this.aClass57_1 == arg0.aClass57_1;
	}
}
