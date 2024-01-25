import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class326 implements Interface4 {

	@OriginalMember(owner = "client!tda", name = "n", descriptor = "Lclient!wu;")
	private final Class379 aClass379_4 = new Class379(256);

	@OriginalMember(owner = "client!tda", name = "k", descriptor = "Lclient!in;")
	private final Class157 aClass157_261;

	@OriginalMember(owner = "client!tda", name = "p", descriptor = "Lclient!in;")
	private final Class157 aClass157_262;

	@OriginalMember(owner = "client!tda", name = "q", descriptor = "I")
	private final int anInt9676;

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "[Lclient!hd;")
	private final Class127[] aClass127Array1;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lclient!in;Lclient!in;Lclient!in;)V")
	public Class326(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_261 = arg1;
		this.aClass157_262 = arg2;
		@Pc(24) Class2_Sub11 local24 = new Class2_Sub11(arg0.method4564(0, 0));
		this.anInt9676 = local24.method8326();
		this.aClass127Array1 = new Class127[this.anInt9676];
		for (@Pc(36) int local36 = 0; local36 < this.anInt9676; local36++) {
			if (local24.method8383() == 1) {
				this.aClass127Array1[local36] = new Class127();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt9676; local61++) {
			if (this.aClass127Array1[local61] != null) {
				this.aClass127Array1[local61].aBoolean338 = local24.method8383() == 0;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt9676; local87++) {
			if (this.aClass127Array1[local87] != null) {
				this.aClass127Array1[local87].aBoolean335 = local24.method8383() == 1;
			}
		}
		for (@Pc(118) int local118 = 0; local118 < this.anInt9676; local118++) {
			if (this.aClass127Array1[local118] != null) {
				this.aClass127Array1[local118].aBoolean336 = local24.method8383() == 1;
			}
		}
		for (@Pc(145) int local145 = 0; local145 < this.anInt9676; local145++) {
			if (this.aClass127Array1[local145] != null) {
				this.aClass127Array1[local145].aByte79 = local24.method8384();
			}
		}
		for (@Pc(167) int local167 = 0; local167 < this.anInt9676; local167++) {
			if (this.aClass127Array1[local167] != null) {
				this.aClass127Array1[local167].aByte74 = local24.method8384();
			}
		}
		for (@Pc(193) int local193 = 0; local193 < this.anInt9676; local193++) {
			if (this.aClass127Array1[local193] != null) {
				this.aClass127Array1[local193].aByte78 = local24.method8384();
			}
		}
		for (@Pc(215) int local215 = 0; local215 < this.anInt9676; local215++) {
			if (this.aClass127Array1[local215] != null) {
				this.aClass127Array1[local215].aByte75 = local24.method8384();
			}
		}
		for (@Pc(237) int local237 = 0; local237 < this.anInt9676; local237++) {
			if (this.aClass127Array1[local237] != null) {
				this.aClass127Array1[local237].aShort52 = (short) local24.method8326();
			}
		}
		for (@Pc(260) int local260 = 0; local260 < this.anInt9676; local260++) {
			if (this.aClass127Array1[local260] != null) {
				this.aClass127Array1[local260].aByte73 = local24.method8384();
			}
		}
		for (@Pc(286) int local286 = 0; local286 < this.anInt9676; local286++) {
			if (this.aClass127Array1[local286] != null) {
				this.aClass127Array1[local286].aByte77 = local24.method8384();
			}
		}
		for (@Pc(312) int local312 = 0; local312 < this.anInt9676; local312++) {
			if (this.aClass127Array1[local312] != null) {
				this.aClass127Array1[local312].aBoolean339 = local24.method8383() == 1;
			}
		}
		for (@Pc(345) int local345 = 0; local345 < this.anInt9676; local345++) {
			if (this.aClass127Array1[local345] != null) {
				this.aClass127Array1[local345].aBoolean337 = local24.method8383() == 1;
			}
		}
		for (@Pc(376) int local376 = 0; local376 < this.anInt9676; local376++) {
			if (this.aClass127Array1[local376] != null) {
				this.aClass127Array1[local376].aByte76 = local24.method8384();
			}
		}
		for (@Pc(398) int local398 = 0; local398 < this.anInt9676; local398++) {
			if (this.aClass127Array1[local398] != null) {
				this.aClass127Array1[local398].aBoolean341 = local24.method8383() == 1;
			}
		}
		for (@Pc(427) int local427 = 0; local427 < this.anInt9676; local427++) {
			if (this.aClass127Array1[local427] != null) {
				this.aClass127Array1[local427].aBoolean340 = local24.method8383() == 1;
			}
		}
		for (@Pc(456) int local456 = 0; local456 < this.anInt9676; local456++) {
			if (this.aClass127Array1[local456] != null) {
				this.aClass127Array1[local456].aBoolean342 = local24.method8383() == 1;
			}
		}
		for (@Pc(483) int local483 = 0; local483 < this.anInt9676; local483++) {
			if (this.aClass127Array1[local483] != null) {
				this.aClass127Array1[local483].anInt4660 = local24.method8383();
			}
		}
		for (@Pc(505) int local505 = 0; local505 < this.anInt9676; local505++) {
			if (this.aClass127Array1[local505] != null) {
				this.aClass127Array1[local505].anInt4661 = local24.method8381();
			}
		}
		for (@Pc(527) int local527 = 0; local527 < this.anInt9676; local527++) {
			if (this.aClass127Array1[local527] != null) {
				this.aClass127Array1[local527].anInt4659 = local24.method8383();
			}
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIFIZI)[I")
	@Override
	public int[] method8051(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method8053(arg2).method5717(this, arg3, arg0, this.aClass127Array1[arg2].aBoolean337, (double) arg1, this.aClass157_262);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZ)Lclient!lr;")
	private Class2_Sub6_Sub16 method8053(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub6 local10 = this.aClass379_4.method9219((long) arg0);
		if (local10 != null) {
			return (Class2_Sub6_Sub16) local10;
		}
		@Pc(21) byte[] local21 = this.aClass157_261.method4569(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(45) Class2_Sub6_Sub16 local45 = new Class2_Sub6_Sub16(new Class2_Sub11(local21));
			this.aClass379_4.method9222((long) arg0, local45);
			return local45;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(II)Lclient!hd;")
	@Override
	public Class127 method8048(@OriginalArg(0) int arg0) {
		return this.aClass127Array1[arg0];
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZIFIII)[I")
	@Override
	public int[] method8050(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method8053(arg1).method5719(arg3, this, this.aClass127Array1[arg1].aBoolean337, (double) arg2, arg0, this.aClass157_262, arg4);
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method8049(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub6_Sub16 local8 = this.method8053(arg0);
		return local8 != null && local8.method5718(this, this.aClass157_262);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IFZIII)[F")
	@Override
	public float[] method8046(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method8053(arg3).method5720(arg0, this, this.aClass127Array1[arg3].aBoolean337, arg2, this.aClass157_262);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)I")
	@Override
	public int method8047() {
		return this.anInt9676;
	}
}
