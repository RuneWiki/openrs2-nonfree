import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class342 {

	@OriginalMember(owner = "client!sw", name = "k", descriptor = "F")
	public float aFloat182 = 1.0F;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "F")
	public float aFloat185 = 0.25F;

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "F")
	public float aFloat187 = 1.0F;

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "I")
	public int anInt9488;

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!sw", name = "i", descriptor = "I")
	public int anInt9497;

	@OriginalMember(owner = "client!sw", name = "r", descriptor = "I")
	public int anInt9491;

	@OriginalMember(owner = "client!sw", name = "n", descriptor = "I")
	public int anInt9487;

	@OriginalMember(owner = "client!sw", name = "z", descriptor = "Lclient!lb;")
	public Class47 aClass47_2;

	@OriginalMember(owner = "client!sw", name = "u", descriptor = "F")
	public float aFloat184;

	@OriginalMember(owner = "client!sw", name = "m", descriptor = "F")
	public float aFloat183;

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "I")
	public int anInt9495;

	@OriginalMember(owner = "client!sw", name = "s", descriptor = "I")
	public int anInt9489;

	@OriginalMember(owner = "client!sw", name = "y", descriptor = "Lclient!uj;")
	public Class366 aClass366_4;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "()V")
	public Class342() {
		this.anInt9488 = Static234.anInt4559;
		this.aFloat186 = 1.1523438F;
		this.anInt9497 = 0;
		this.anInt9491 = -60;
		this.anInt9487 = -50;
		this.aClass47_2 = Static629.aClass47_4;
		this.aFloat184 = 1.2F;
		this.aFloat183 = 0.69921875F;
		this.anInt9495 = Static133.anInt2088;
		this.anInt9489 = -50;
		this.aClass366_4 = Static253.aClass366_2;
	}

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class342(@OriginalArg(0) Class14_Sub21 arg0) {
		this.method8193(arg0);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!sw;I)Z")
	public boolean method8187(@OriginalArg(0) Class342 arg0) {
		return arg0.anInt9495 == this.anInt9495 && arg0.aFloat186 == this.aFloat186 && this.aFloat183 == arg0.aFloat183 && arg0.aFloat184 == this.aFloat184 && this.aFloat185 == arg0.aFloat185 && arg0.aFloat187 == this.aFloat187 && this.aFloat182 == arg0.aFloat182 && this.anInt9488 == arg0.anInt9488 && arg0.anInt9497 == this.anInt9497 && this.aClass47_2 == arg0.aClass47_2 && arg0.aClass366_4 == this.aClass366_4;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!jc;B)V")
	public void method8189(@OriginalArg(0) Class14_Sub21 arg0) {
		this.aFloat187 = (float) (arg0.method7695(117) * 8) / 255.0F;
		this.aFloat185 = (float) (arg0.method7695(99) * 8) / 255.0F;
		this.aFloat182 = (float) (arg0.method7695(113) * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZLclient!jc;)V")
	public void method8191(@OriginalArg(1) Class14_Sub21 arg0) {
		@Pc(7) int local7 = arg0.method7717(-1978450544);
		@Pc(11) int local11 = arg0.method7752();
		@Pc(15) int local15 = arg0.method7752();
		@Pc(19) int local19 = arg0.method7752();
		@Pc(28) int local28 = arg0.method7717(-1978450544);
		Static334.anInt5725 = local28;
		this.aClass366_4 = Static451.method6677(local11, local19, local7, local15);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method8193(@OriginalArg(0) Class14_Sub21 arg0) {
		@Pc(12) int local12 = arg0.method7695(95);
		if (Static181.aClass14_Sub26_9.aClass43_Sub16_1.method4851() == 1 && Static127.aClass144_17.method6926() > 0) {
			if ((local12 & 0x1) == 0) {
				this.anInt9495 = Static133.anInt2088;
			} else {
				this.anInt9495 = arg0.method7748();
			}
			if ((local12 & 0x2) == 0) {
				this.aFloat186 = 1.1523438F;
			} else {
				this.aFloat186 = (float) arg0.method7717(-1978450544) / 256.0F;
			}
			if ((local12 & 0x4) == 0) {
				this.aFloat183 = 0.69921875F;
			} else {
				this.aFloat183 = (float) arg0.method7717(-1978450544) / 256.0F;
			}
			if ((local12 & 0x8) == 0) {
				this.aFloat184 = 1.2F;
			} else {
				this.aFloat184 = (float) arg0.method7717(-1978450544) / 256.0F;
			}
		} else {
			if ((local12 & 0x1) != 0) {
				arg0.method7748();
			}
			if ((local12 & 0x2) != 0) {
				arg0.method7717(-1978450544);
			}
			if ((local12 & 0x4) != 0) {
				arg0.method7717(-1978450544);
			}
			if ((local12 & 0x8) != 0) {
				arg0.method7717(-1978450544);
			}
			this.anInt9495 = Static133.anInt2088;
			this.aFloat184 = 1.2F;
			this.aFloat183 = 0.69921875F;
			this.aFloat186 = 1.1523438F;
		}
		if ((local12 & 0x10) == 0) {
			this.anInt9491 = -60;
			this.anInt9489 = -50;
			this.anInt9487 = -50;
		} else {
			this.anInt9489 = arg0.method7752();
			this.anInt9491 = arg0.method7752();
			this.anInt9487 = arg0.method7752();
		}
		if ((local12 & 0x20) == 0) {
			this.anInt9488 = Static234.anInt4559;
		} else {
			this.anInt9488 = arg0.method7748();
		}
		if ((local12 & 0x40) == 0) {
			this.anInt9497 = 0;
		} else {
			this.anInt9497 = arg0.method7717(-1978450544);
		}
		if ((local12 & 0x80) == 0) {
			this.aClass47_2 = Static629.aClass47_4;
			return;
		}
		@Pc(241) int local241 = arg0.method7717(-1978450544);
		@Pc(245) int local245 = arg0.method7717(-1978450544);
		@Pc(249) int local249 = arg0.method7717(-1978450544);
		@Pc(253) int local253 = arg0.method7717(-1978450544);
		@Pc(257) int local257 = arg0.method7717(-1978450544);
		@Pc(261) int local261 = arg0.method7717(-1978450544);
		this.aClass47_2 = Static12.method246(local261, local249, local241, local253, local245, local257);
	}
}
