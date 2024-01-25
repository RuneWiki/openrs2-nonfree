import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class329 implements Interface7 {

	@OriginalMember(owner = "client!sea", name = "m", descriptor = "Lclient!v;")
	private final Class370 aClass370_6 = new Class370(256);

	@OriginalMember(owner = "client!sea", name = "r", descriptor = "Lclient!gda;")
	private final Class126 aClass126_245;

	@OriginalMember(owner = "client!sea", name = "p", descriptor = "Lclient!gda;")
	private final Class126 aClass126_244;

	@OriginalMember(owner = "client!sea", name = "j", descriptor = "I")
	private final int anInt8615;

	@OriginalMember(owner = "client!sea", name = "l", descriptor = "[Lclient!bq;")
	private final Class44[] aClass44Array1;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!gda;Lclient!gda;Lclient!gda;)V")
	public Class329(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_245 = arg1;
		this.aClass126_244 = arg2;
		@Pc(24) Class5_Sub36 local24 = new Class5_Sub36(arg0.method3086(0, 0));
		this.anInt8615 = local24.method7333();
		this.aClass44Array1 = new Class44[this.anInt8615];
		for (@Pc(36) int local36 = 0; local36 < this.anInt8615; local36++) {
			if (local24.method7291() == 1) {
				this.aClass44Array1[local36] = new Class44();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt8615; local61++) {
			if (this.aClass44Array1[local61] != null) {
				this.aClass44Array1[local61].aBoolean56 = local24.method7291() == 0;
			}
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt8615; local94++) {
			if (this.aClass44Array1[local94] != null) {
				this.aClass44Array1[local94].aBoolean62 = local24.method7291() == 1;
			}
		}
		for (@Pc(134) int local134 = 0; local134 < this.anInt8615; local134++) {
			if (this.aClass44Array1[local134] != null) {
				this.aClass44Array1[local134].aBoolean58 = local24.method7291() == 1;
			}
		}
		for (@Pc(174) int local174 = 0; local174 < this.anInt8615; local174++) {
			if (this.aClass44Array1[local174] != null) {
				this.aClass44Array1[local174].aByte22 = local24.method7318();
			}
		}
		for (@Pc(206) int local206 = 0; local206 < this.anInt8615; local206++) {
			if (this.aClass44Array1[local206] != null) {
				this.aClass44Array1[local206].aByte17 = local24.method7318();
			}
		}
		for (@Pc(238) int local238 = 0; local238 < this.anInt8615; local238++) {
			if (this.aClass44Array1[local238] != null) {
				this.aClass44Array1[local238].aByte23 = local24.method7318();
			}
		}
		for (@Pc(266) int local266 = 0; local266 < this.anInt8615; local266++) {
			if (this.aClass44Array1[local266] != null) {
				this.aClass44Array1[local266].aByte19 = local24.method7318();
			}
		}
		for (@Pc(298) int local298 = 0; local298 < this.anInt8615; local298++) {
			if (this.aClass44Array1[local298] != null) {
				this.aClass44Array1[local298].aShort26 = (short) local24.method7333();
			}
		}
		for (@Pc(327) int local327 = 0; local327 < this.anInt8615; local327++) {
			if (this.aClass44Array1[local327] != null) {
				this.aClass44Array1[local327].aByte18 = local24.method7318();
			}
		}
		for (@Pc(355) int local355 = 0; local355 < this.anInt8615; local355++) {
			if (this.aClass44Array1[local355] != null) {
				this.aClass44Array1[local355].aByte20 = local24.method7318();
			}
		}
		for (@Pc(387) int local387 = 0; local387 < this.anInt8615; local387++) {
			if (this.aClass44Array1[local387] != null) {
				this.aClass44Array1[local387].aBoolean59 = local24.method7291() == 1;
			}
		}
		for (@Pc(425) int local425 = 0; local425 < this.anInt8615; local425++) {
			if (this.aClass44Array1[local425] != null) {
				this.aClass44Array1[local425].aBoolean61 = local24.method7291() == 1;
			}
		}
		for (@Pc(465) int local465 = 0; local465 < this.anInt8615; local465++) {
			if (this.aClass44Array1[local465] != null) {
				this.aClass44Array1[local465].aByte21 = local24.method7318();
			}
		}
		for (@Pc(493) int local493 = 0; local493 < this.anInt8615; local493++) {
			if (this.aClass44Array1[local493] != null) {
				this.aClass44Array1[local493].aBoolean63 = local24.method7291() == 1;
			}
		}
		for (@Pc(527) int local527 = 0; local527 < this.anInt8615; local527++) {
			if (this.aClass44Array1[local527] != null) {
				this.aClass44Array1[local527].aBoolean60 = local24.method7291() == 1;
			}
		}
		for (@Pc(561) int local561 = 0; local561 < this.anInt8615; local561++) {
			if (this.aClass44Array1[local561] != null) {
				this.aClass44Array1[local561].aBoolean57 = local24.method7291() == 1;
			}
		}
		for (@Pc(599) int local599 = 0; local599 < this.anInt8615; local599++) {
			if (this.aClass44Array1[local599] != null) {
				this.aClass44Array1[local599].anInt811 = local24.method7291();
			}
		}
		for (@Pc(627) int local627 = 0; local627 < this.anInt8615; local627++) {
			if (this.aClass44Array1[local627] != null) {
				this.aClass44Array1[local627].anInt814 = local24.method7268();
			}
		}
		for (@Pc(659) int local659 = 0; local659 < this.anInt8615; local659++) {
			if (this.aClass44Array1[local659] != null) {
				this.aClass44Array1[local659].anInt809 = local24.method7291();
			}
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)Lclient!bq;")
	@Override
	public Class44 method7423(@OriginalArg(0) int arg0) {
		return this.aClass44Array1[arg0];
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZIIFI)[I")
	@Override
	public int[] method7424(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		return this.method7429(arg3).method5570(arg0, this.aClass126_244, arg2, arg1, this, this.aClass44Array1[arg3].aBoolean61, (double) arg4);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method7421(@OriginalArg(1) int arg0) {
		@Pc(16) Class5_Sub1_Sub14 local16 = this.method7429(arg0);
		return local16 != null && local16.method5572(this, this.aClass126_244);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IFIIIZ)[I")
	@Override
	public int[] method7419(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method7429(arg0).method5573(this, this.aClass44Array1[arg0].aBoolean61, arg2, (double) arg1, this.aClass126_244, arg3);
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(II)Lclient!mr;")
	private Class5_Sub1_Sub14 method7429(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub1 local10 = this.aClass370_6.method8484((long) arg0);
		if (local10 != null) {
			return (Class5_Sub1_Sub14) local10;
		}
		@Pc(31) byte[] local31 = this.aClass126_245.method3069(arg0);
		if (local31 == null) {
			return null;
		} else {
			@Pc(44) Class5_Sub1_Sub14 local44 = new Class5_Sub1_Sub14(new Class5_Sub36(local31));
			this.aClass370_6.method8485(local44, (long) arg0);
			return local44;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)I")
	@Override
	public int method7420() {
		return this.anInt8615;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIFZI)[F")
	@Override
	public float[] method7422(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3) {
		return this.method7429(arg1).method5574(this.aClass44Array1[arg1].aBoolean61, arg0, arg3, this.aClass126_244, this);
	}
}
