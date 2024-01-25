import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class268 implements Interface4 {

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "Lclient!ks;")
	private final Class168 aClass168_3 = new Class168(256);

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "Lclient!kea;")
	private final Class161 aClass161_96;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "Lclient!kea;")
	private final Class161 aClass161_95;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
	private final int anInt8102;

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "[Lclient!pw;")
	private final Class238[] aClass238Array1;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!kea;Lclient!kea;Lclient!kea;)V")
	public Class268(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_96 = arg1;
		this.aClass161_95 = arg2;
		@Pc(24) Class3_Sub27 local24 = new Class3_Sub27(arg0.method4243(0, 0));
		this.anInt8102 = local24.method7591();
		this.aClass238Array1 = new Class238[this.anInt8102];
		for (@Pc(36) int local36 = 0; local36 < this.anInt8102; local36++) {
			if (local24.method7548() == 1) {
				this.aClass238Array1[local36] = new Class238();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt8102; local61++) {
			if (this.aClass238Array1[local61] != null) {
				this.aClass238Array1[local61].aBoolean461 = local24.method7548() == 0;
			}
		}
		for (@Pc(90) int local90 = 0; local90 < this.anInt8102; local90++) {
			if (this.aClass238Array1[local90] != null) {
				this.aClass238Array1[local90].aBoolean464 = local24.method7548() == 1;
			}
		}
		for (@Pc(121) int local121 = 0; local121 < this.anInt8102; local121++) {
			if (this.aClass238Array1[local121] != null) {
				this.aClass238Array1[local121].aBoolean466 = local24.method7548() == 1;
			}
		}
		for (@Pc(148) int local148 = 0; local148 < this.anInt8102; local148++) {
			if (this.aClass238Array1[local148] != null) {
				this.aClass238Array1[local148].aBoolean470 = local24.method7548() == 1;
			}
		}
		for (@Pc(177) int local177 = 0; local177 < this.anInt8102; local177++) {
			if (this.aClass238Array1[local177] != null) {
				this.aClass238Array1[local177].aByte71 = local24.method7584();
			}
		}
		for (@Pc(203) int local203 = 0; local203 < this.anInt8102; local203++) {
			if (this.aClass238Array1[local203] != null) {
				this.aClass238Array1[local203].aByte67 = local24.method7584();
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.anInt8102; local229++) {
			if (this.aClass238Array1[local229] != null) {
				this.aClass238Array1[local229].aByte70 = local24.method7584();
			}
		}
		for (@Pc(251) int local251 = 0; local251 < this.anInt8102; local251++) {
			if (this.aClass238Array1[local251] != null) {
				this.aClass238Array1[local251].aByte66 = local24.method7584();
			}
		}
		for (@Pc(273) int local273 = 0; local273 < this.anInt8102; local273++) {
			if (this.aClass238Array1[local273] != null) {
				this.aClass238Array1[local273].aShort111 = (short) local24.method7591();
			}
		}
		for (@Pc(296) int local296 = 0; local296 < this.anInt8102; local296++) {
			if (this.aClass238Array1[local296] != null) {
				this.aClass238Array1[local296].aByte68 = local24.method7584();
			}
		}
		for (@Pc(318) int local318 = 0; local318 < this.anInt8102; local318++) {
			if (this.aClass238Array1[local318] != null) {
				this.aClass238Array1[local318].aByte69 = local24.method7584();
			}
		}
		for (@Pc(344) int local344 = 0; local344 < this.anInt8102; local344++) {
			if (this.aClass238Array1[local344] != null) {
				this.aClass238Array1[local344].aBoolean468 = local24.method7548() == 1;
			}
		}
		for (@Pc(373) int local373 = 0; local373 < this.anInt8102; local373++) {
			if (this.aClass238Array1[local373] != null) {
				this.aClass238Array1[local373].aBoolean467 = local24.method7548() == 1;
			}
		}
		for (@Pc(400) int local400 = 0; local400 < this.anInt8102; local400++) {
			if (this.aClass238Array1[local400] != null) {
				this.aClass238Array1[local400].aByte72 = local24.method7584();
			}
		}
		for (@Pc(422) int local422 = 0; local422 < this.anInt8102; local422++) {
			if (this.aClass238Array1[local422] != null) {
				this.aClass238Array1[local422].aBoolean462 = local24.method7548() == 1;
			}
		}
		for (@Pc(455) int local455 = 0; local455 < this.anInt8102; local455++) {
			if (this.aClass238Array1[local455] != null) {
				this.aClass238Array1[local455].aBoolean469 = local24.method7548() == 1;
			}
		}
		for (@Pc(482) int local482 = 0; local482 < this.anInt8102; local482++) {
			if (this.aClass238Array1[local482] != null) {
				this.aClass238Array1[local482].aBoolean463 = local24.method7548() == 1;
			}
		}
		for (@Pc(509) int local509 = 0; local509 < this.anInt8102; local509++) {
			if (this.aClass238Array1[local509] != null) {
				this.aClass238Array1[local509].anInt7127 = local24.method7548();
			}
		}
		for (@Pc(531) int local531 = 0; local531 < this.anInt8102; local531++) {
			if (this.aClass238Array1[local531] != null) {
				this.aClass238Array1[local531].anInt7126 = local24.method7549();
			}
		}
		for (@Pc(557) int local557 = 0; local557 < this.anInt8102; local557++) {
			if (this.aClass238Array1[local557] != null) {
				this.aClass238Array1[local557].aBoolean465 = local24.method7548() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IFIIIZ)[I")
	@Override
	public int[] method6711(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method6714(arg2).method4038((double) arg1, this, this.aClass161_95, arg4, arg3, arg0, this.aClass238Array1[arg2].aBoolean467);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZIIIF)[I")
	@Override
	public int[] method6707(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method6714(arg1).method4039(arg2, this, (double) arg3, this.aClass238Array1[arg1].aBoolean467, arg0, this.aClass161_95);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)I")
	@Override
	public int method6710() {
		return this.anInt8102;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)Lclient!jf;")
	private Class3_Sub10_Sub8 method6714(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub10 local10 = this.aClass168_3.method4551((long) arg0);
		if (local10 != null) {
			return (Class3_Sub10_Sub8) local10;
		}
		@Pc(26) byte[] local26 = this.aClass161_96.method4265(arg0);
		if (local26 == null) {
			return null;
		} else {
			@Pc(38) Class3_Sub10_Sub8 local38 = new Class3_Sub10_Sub8(new Class3_Sub27(local26));
			this.aClass168_3.method4547((long) arg0, local38);
			return local38;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6708(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub10_Sub8 local13 = this.method6714(arg0);
		return local13 != null && local13.method4041(this, this.aClass161_95);
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)Lclient!pw;")
	@Override
	public Class238 method6712(@OriginalArg(1) int arg0) {
		return this.aClass238Array1[arg0];
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIZIFI)[F")
	@Override
	public float[] method6709(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method6714(arg3).method4037(arg0, arg1, this.aClass238Array1[arg3].aBoolean467, this, this.aClass161_95);
	}
}
