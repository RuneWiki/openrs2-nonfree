import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class304 {

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "F")
	public float aFloat167 = 0.25F;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "F")
	public float aFloat168 = 1.0F;

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "F")
	public float aFloat169 = 1.0F;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "F")
	public float aFloat166;

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
	public int anInt8403;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
	public int anInt8395;

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "F")
	public float aFloat164;

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "Lclient!pca;")
	public Class277 aClass277_6;

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
	public int anInt8397;

	@OriginalMember(owner = "client!qp", name = "t", descriptor = "F")
	public float aFloat165;

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
	public int anInt8400;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "Lclient!sn;")
	public Class81 aClass81_1;

	@OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
	public int anInt8402;

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
	public int anInt8399;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
	public Class304() {
		this.aFloat166 = 1.1523438F;
		this.anInt8403 = -50;
		this.anInt8395 = 0;
		this.aFloat164 = 1.2F;
		this.aClass277_6 = Static652.aClass277_8;
		this.anInt8397 = Static14.anInt194;
		this.aFloat165 = 0.69921875F;
		this.anInt8400 = -60;
		this.aClass81_1 = Static522.aClass81_2;
		this.anInt8402 = -50;
		this.anInt8399 = Static493.anInt8353;
	}

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class304(@OriginalArg(0) Class6_Sub15 arg0) {
		this.method7339(arg0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLclient!jc;)V")
	public void method7334(@OriginalArg(1) Class6_Sub15 arg0) {
		this.aFloat168 = (float) (arg0.method3030() * 8) / 255.0F;
		this.aFloat167 = (float) (arg0.method3030() * 8) / 255.0F;
		this.aFloat169 = (float) (arg0.method3030() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!qp;B)Z")
	public boolean method7335(@OriginalArg(0) Class304 arg0) {
		return arg0.anInt8397 == this.anInt8397 && this.aFloat166 == arg0.aFloat166 && this.aFloat165 == arg0.aFloat165 && this.aFloat164 == arg0.aFloat164 && arg0.aFloat167 == this.aFloat167 && this.aFloat168 == arg0.aFloat168 && arg0.aFloat169 == this.aFloat169 && arg0.anInt8399 == this.anInt8399 && this.anInt8395 == arg0.anInt8395 && arg0.aClass81_1 == this.aClass81_1 && this.aClass277_6 == arg0.aClass277_6;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(ILclient!jc;)V")
	public void method7336(@OriginalArg(1) Class6_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method3018();
		@Pc(11) int local11 = arg0.method2989();
		@Pc(23) int local23 = arg0.method2989();
		@Pc(27) int local27 = arg0.method2989();
		@Pc(31) int local31 = arg0.method3018();
		Static646.anInt8107 = local31;
		this.aClass277_6 = Static100.method1963(local23, local27, local7, local11);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!jc;)V")
	public void method7339(@OriginalArg(1) Class6_Sub15 arg0) {
		@Pc(9) int local9 = arg0.method3030();
		if (Static687.aClass6_Sub44_33.aClass7_Sub4_1.method648() == 1 && Static473.aClass75_14.method6689() > 0) {
			if ((local9 & 0x1) == 0) {
				this.anInt8397 = Static14.anInt194;
			} else {
				this.anInt8397 = arg0.method3015();
			}
			if ((local9 & 0x2) == 0) {
				this.aFloat166 = 1.1523438F;
			} else {
				this.aFloat166 = (float) arg0.method3018() / 256.0F;
			}
			if ((local9 & 0x4) == 0) {
				this.aFloat165 = 0.69921875F;
			} else {
				this.aFloat165 = (float) arg0.method3018() / 256.0F;
			}
			if ((local9 & 0x8) == 0) {
				this.aFloat164 = 1.2F;
			} else {
				this.aFloat164 = (float) arg0.method3018() / 256.0F;
			}
		} else {
			if ((local9 & 0x1) != 0) {
				arg0.method3015();
			}
			if ((local9 & 0x2) != 0) {
				arg0.method3018();
			}
			if ((local9 & 0x4) != 0) {
				arg0.method3018();
			}
			if ((local9 & 0x8) != 0) {
				arg0.method3018();
			}
			this.anInt8397 = Static14.anInt194;
			this.aFloat164 = 1.2F;
			this.aFloat166 = 1.1523438F;
			this.aFloat165 = 0.69921875F;
		}
		if ((local9 & 0x10) == 0) {
			this.anInt8403 = -50;
			this.anInt8400 = -60;
			this.anInt8402 = -50;
		} else {
			this.anInt8402 = arg0.method2989();
			this.anInt8400 = arg0.method2989();
			this.anInt8403 = arg0.method2989();
		}
		if ((local9 & 0x20) == 0) {
			this.anInt8399 = Static493.anInt8353;
		} else {
			this.anInt8399 = arg0.method3015();
		}
		if ((local9 & 0x40) == 0) {
			this.anInt8395 = 0;
		} else {
			this.anInt8395 = arg0.method3018();
		}
		if ((local9 & 0x80) == 0) {
			this.aClass81_1 = Static522.aClass81_2;
			return;
		}
		@Pc(270) int local270 = arg0.method3018();
		@Pc(274) int local274 = arg0.method3018();
		@Pc(278) int local278 = arg0.method3018();
		@Pc(282) int local282 = arg0.method3018();
		@Pc(286) int local286 = arg0.method3018();
		@Pc(290) int local290 = arg0.method3018();
		this.aClass81_1 = Static9.method121(local270, local290, local286, local274, local282, local278);
	}
}
