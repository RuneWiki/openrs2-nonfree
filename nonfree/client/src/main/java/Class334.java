import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class334 implements Interface8 {

	@OriginalMember(owner = "client!to", name = "m", descriptor = "Lclient!vv;")
	private final Class368 aClass368_4 = new Class368(256);

	@OriginalMember(owner = "client!to", name = "i", descriptor = "Lclient!wu;")
	private final Class384 aClass384_122;

	@OriginalMember(owner = "client!to", name = "d", descriptor = "Lclient!wu;")
	private final Class384 aClass384_121;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "I")
	private final int anInt9162;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "[Lclient!sw;")
	private final Class321[] aClass321Array1;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;Lclient!wu;)V")
	public Class334(@OriginalArg(0) Class384 arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_122 = arg1;
		this.aClass384_121 = arg2;
		@Pc(24) Class5_Sub12 local24 = new Class5_Sub12(arg0.method8885(0, 0));
		this.anInt9162 = local24.method8631();
		this.aClass321Array1 = new Class321[this.anInt9162];
		for (@Pc(36) int local36 = 0; local36 < this.anInt9162; local36++) {
			if (local24.method8645() == 1) {
				this.aClass321Array1[local36] = new Class321();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt9162; local61++) {
			if (this.aClass321Array1[local61] != null) {
				this.aClass321Array1[local61].aBoolean724 = local24.method8645() == 0;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt9162; local87++) {
			if (this.aClass321Array1[local87] != null) {
				this.aClass321Array1[local87].aBoolean729 = local24.method8645() == 1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < this.anInt9162; local116++) {
			if (this.aClass321Array1[local116] != null) {
				this.aClass321Array1[local116].aBoolean726 = local24.method8645() == 1;
			}
		}
		for (@Pc(147) int local147 = 0; local147 < this.anInt9162; local147++) {
			if (this.aClass321Array1[local147] != null) {
				this.aClass321Array1[local147].aByte116 = local24.method8635();
			}
		}
		for (@Pc(173) int local173 = 0; local173 < this.anInt9162; local173++) {
			if (this.aClass321Array1[local173] != null) {
				this.aClass321Array1[local173].aByte117 = local24.method8635();
			}
		}
		for (@Pc(195) int local195 = 0; local195 < this.anInt9162; local195++) {
			if (this.aClass321Array1[local195] != null) {
				this.aClass321Array1[local195].aByte115 = local24.method8635();
			}
		}
		for (@Pc(217) int local217 = 0; local217 < this.anInt9162; local217++) {
			if (this.aClass321Array1[local217] != null) {
				this.aClass321Array1[local217].aByte120 = local24.method8635();
			}
		}
		for (@Pc(243) int local243 = 0; local243 < this.anInt9162; local243++) {
			if (this.aClass321Array1[local243] != null) {
				this.aClass321Array1[local243].aShort103 = (short) local24.method8631();
			}
		}
		for (@Pc(266) int local266 = 0; local266 < this.anInt9162; local266++) {
			if (this.aClass321Array1[local266] != null) {
				this.aClass321Array1[local266].aByte119 = local24.method8635();
			}
		}
		for (@Pc(288) int local288 = 0; local288 < this.anInt9162; local288++) {
			if (this.aClass321Array1[local288] != null) {
				this.aClass321Array1[local288].aByte118 = local24.method8635();
			}
		}
		for (@Pc(310) int local310 = 0; local310 < this.anInt9162; local310++) {
			if (this.aClass321Array1[local310] != null) {
				this.aClass321Array1[local310].aBoolean730 = local24.method8645() == 1;
			}
		}
		for (@Pc(337) int local337 = 0; local337 < this.anInt9162; local337++) {
			if (this.aClass321Array1[local337] != null) {
				this.aClass321Array1[local337].aBoolean728 = local24.method8645() == 1;
			}
		}
		for (@Pc(364) int local364 = 0; local364 < this.anInt9162; local364++) {
			if (this.aClass321Array1[local364] != null) {
				this.aClass321Array1[local364].aByte114 = local24.method8635();
			}
		}
		for (@Pc(386) int local386 = 0; local386 < this.anInt9162; local386++) {
			if (this.aClass321Array1[local386] != null) {
				this.aClass321Array1[local386].aBoolean727 = local24.method8645() == 1;
			}
		}
		for (@Pc(419) int local419 = 0; local419 < this.anInt9162; local419++) {
			if (this.aClass321Array1[local419] != null) {
				this.aClass321Array1[local419].aBoolean731 = local24.method8645() == 1;
			}
		}
		for (@Pc(446) int local446 = 0; local446 < this.anInt9162; local446++) {
			if (this.aClass321Array1[local446] != null) {
				this.aClass321Array1[local446].aBoolean725 = local24.method8645() == 1;
			}
		}
		for (@Pc(477) int local477 = 0; local477 < this.anInt9162; local477++) {
			if (this.aClass321Array1[local477] != null) {
				this.aClass321Array1[local477].anInt8902 = local24.method8645();
			}
		}
		for (@Pc(503) int local503 = 0; local503 < this.anInt9162; local503++) {
			if (this.aClass321Array1[local503] != null) {
				this.aClass321Array1[local503].anInt8904 = local24.method8623();
			}
		}
		for (@Pc(525) int local525 = 0; local525 < this.anInt9162; local525++) {
			if (this.aClass321Array1[local525] != null) {
				this.aClass321Array1[local525].anInt8901 = local24.method8645();
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method7811(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub4_Sub15 local8 = this.method7817(arg0);
		return local8 != null && local8.method5202(this, this.aClass384_121);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIFZII)[I")
	@Override
	public int[] method7812(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method7817(arg3).method5204(arg4, arg2, (double) arg1, this.aClass384_121, this, arg0, this.aClass321Array1[arg3].aBoolean728);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IZIIFI)[F")
	@Override
	public float[] method7816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		return this.method7817(arg2).method5201(this.aClass321Array1[arg2].aBoolean728, arg0, this, this.aClass384_121, arg1);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI)Lclient!m;")
	private Class5_Sub4_Sub15 method7817(@OriginalArg(1) int arg0) {
		@Pc(15) Class5_Sub4 local15 = this.aClass368_4.method8528((long) arg0);
		if (local15 != null) {
			return (Class5_Sub4_Sub15) local15;
		}
		@Pc(26) byte[] local26 = this.aClass384_122.method8893(arg0);
		if (local26 == null) {
			return null;
		} else {
			@Pc(38) Class5_Sub4_Sub15 local38 = new Class5_Sub4_Sub15(new Class5_Sub12(local26));
			this.aClass368_4.method8527((long) arg0, local38);
			return local38;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
	@Override
	public int method7814() {
		return this.anInt9162;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IB)Lclient!sw;")
	@Override
	public Class321 method7813(@OriginalArg(0) int arg0) {
		return this.aClass321Array1[arg0];
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZBIIFI)[I")
	@Override
	public int[] method7815(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method7817(arg3).method5200(this, arg0, this.aClass384_121, (double) arg2, arg1, this.aClass321Array1[arg3].aBoolean728);
	}
}
