import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class350 {

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "F")
	public float aFloat207 = 1.0F;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "F")
	public float aFloat209 = 0.25F;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "F")
	public float aFloat212 = 1.0F;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
	public final int anInt9404;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "Lclient!cd;")
	public final Class12 aClass12_3;

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "F")
	public final float aFloat208;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
	public final int anInt9399;

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "F")
	public final float aFloat210;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public final int anInt9397;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
	public final int anInt9408;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "F")
	public final float aFloat211;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
	public final int anInt9398;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
	public final int anInt9403;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
	public Class350() {
		this.anInt9404 = -60;
		this.aClass12_3 = Static608.aClass12_4;
		this.aFloat208 = 0.69921875F;
		this.anInt9399 = 0;
		this.aFloat210 = 1.2F;
		this.anInt9397 = Static433.anInt7009;
		this.anInt9408 = Static507.anInt8422;
		this.aFloat211 = 1.1523438F;
		this.anInt9398 = -50;
		this.anInt9403 = -50;
	}

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class350(@OriginalArg(0) Class2_Sub22 arg0) {
		@Pc(16) int local16 = arg0.method8547();
		if (Static234.aClass2_Sub5_48.aClass6_Sub17_1.method4403() == 1 && Static566.aClass95_14.method6994() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt9408 = Static507.anInt8422;
			} else {
				this.anInt9408 = arg0.method8542();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat211 = 1.1523438F;
			} else {
				this.aFloat211 = (float) arg0.method8546() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat208 = 0.69921875F;
			} else {
				this.aFloat208 = (float) arg0.method8546() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat210 = 1.2F;
			} else {
				this.aFloat210 = (float) arg0.method8546() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method8542();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method8546();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method8546();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method8546();
			}
			this.anInt9408 = Static507.anInt8422;
			this.aFloat208 = 0.69921875F;
			this.aFloat210 = 1.2F;
			this.aFloat211 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt9404 = -60;
			this.anInt9403 = -50;
			this.anInt9398 = -50;
		} else {
			this.anInt9403 = arg0.method8526();
			this.anInt9404 = arg0.method8526();
			this.anInt9398 = arg0.method8526();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt9397 = Static433.anInt7009;
		} else {
			this.anInt9397 = arg0.method8542();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt9399 = 0;
		} else {
			this.anInt9399 = arg0.method8546();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass12_3 = Static608.aClass12_4;
		} else {
			@Pc(224) int local224 = arg0.method8546();
			@Pc(228) int local228 = arg0.method8546();
			@Pc(232) int local232 = arg0.method8546();
			@Pc(236) int local236 = arg0.method8546();
			@Pc(240) int local240 = arg0.method8546();
			@Pc(244) int local244 = arg0.method8546();
			this.aClass12_3 = Static485.method6791(local232, local244, local224, local236, local228, local240);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLclient!vj;)V")
	public void method7892(@OriginalArg(1) Class2_Sub22 arg0) {
		this.aFloat207 = (float) (arg0.method8547() * 8) / 255.0F;
		this.aFloat209 = (float) (arg0.method8547() * 8) / 255.0F;
		this.aFloat212 = (float) (arg0.method8547() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!ul;Z)Z")
	public boolean method7894(@OriginalArg(0) Class350 arg0) {
		return this.anInt9408 == arg0.anInt9408 && this.aFloat211 == arg0.aFloat211 && arg0.aFloat208 == this.aFloat208 && arg0.aFloat210 == this.aFloat210 && this.aFloat209 == arg0.aFloat209 && this.aFloat207 == arg0.aFloat207 && this.aFloat212 == arg0.aFloat212 && this.anInt9397 == arg0.anInt9397 && this.anInt9399 == arg0.anInt9399 && arg0.aClass12_3 == this.aClass12_3;
	}
}
