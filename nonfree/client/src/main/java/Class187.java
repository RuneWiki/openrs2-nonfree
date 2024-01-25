import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public final class Class187 implements Interface4 {

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "Lclient!jv;")
	private final Class179 aClass179_3 = new Class179(256);

	@OriginalMember(owner = "client!kfa", name = "j", descriptor = "Lclient!aj;")
	private final Class15 aClass15_80;

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "Lclient!aj;")
	private final Class15 aClass15_79;

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "I")
	private final int anInt5101;

	@OriginalMember(owner = "client!kfa", name = "i", descriptor = "[Lclient!gj;")
	private final Class119[] aClass119Array1;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!aj;Lclient!aj;Lclient!aj;)V")
	public Class187(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_80 = arg1;
		this.aClass15_79 = arg2;
		@Pc(24) Class3_Sub25 local24 = new Class3_Sub25(arg0.method517(0, 0));
		this.anInt5101 = local24.method8593();
		this.aClass119Array1 = new Class119[this.anInt5101];
		for (@Pc(36) int local36 = 0; local36 < this.anInt5101; local36++) {
			if (local24.method8632() == 1) {
				this.aClass119Array1[local36] = new Class119();
			}
		}
		for (@Pc(59) int local59 = 0; local59 < this.anInt5101; local59++) {
			if (this.aClass119Array1[local59] != null) {
				this.aClass119Array1[local59].aBoolean291 = local24.method8632() == 0;
			}
		}
		for (@Pc(89) int local89 = 0; local89 < this.anInt5101; local89++) {
			if (this.aClass119Array1[local89] != null) {
				this.aClass119Array1[local89].aBoolean292 = local24.method8632() == 1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < this.anInt5101; local116++) {
			if (this.aClass119Array1[local116] != null) {
				this.aClass119Array1[local116].aBoolean294 = local24.method8632() == 1;
			}
		}
		for (@Pc(149) int local149 = 0; local149 < this.anInt5101; local149++) {
			if (this.aClass119Array1[local149] != null) {
				this.aClass119Array1[local149].aByte53 = local24.method8621();
			}
		}
		for (@Pc(175) int local175 = 0; local175 < this.anInt5101; local175++) {
			if (this.aClass119Array1[local175] != null) {
				this.aClass119Array1[local175].aByte55 = local24.method8621();
			}
		}
		for (@Pc(201) int local201 = 0; local201 < this.anInt5101; local201++) {
			if (this.aClass119Array1[local201] != null) {
				this.aClass119Array1[local201].aByte54 = local24.method8621();
			}
		}
		for (@Pc(227) int local227 = 0; local227 < this.anInt5101; local227++) {
			if (this.aClass119Array1[local227] != null) {
				this.aClass119Array1[local227].aByte56 = local24.method8621();
			}
		}
		for (@Pc(253) int local253 = 0; local253 < this.anInt5101; local253++) {
			if (this.aClass119Array1[local253] != null) {
				this.aClass119Array1[local253].aShort42 = (short) local24.method8593();
			}
		}
		for (@Pc(280) int local280 = 0; local280 < this.anInt5101; local280++) {
			if (this.aClass119Array1[local280] != null) {
				this.aClass119Array1[local280].aByte57 = local24.method8621();
			}
		}
		for (@Pc(306) int local306 = 0; local306 < this.anInt5101; local306++) {
			if (this.aClass119Array1[local306] != null) {
				this.aClass119Array1[local306].aByte59 = local24.method8621();
			}
		}
		for (@Pc(328) int local328 = 0; local328 < this.anInt5101; local328++) {
			if (this.aClass119Array1[local328] != null) {
				this.aClass119Array1[local328].aBoolean290 = local24.method8632() == 1;
			}
		}
		for (@Pc(357) int local357 = 0; local357 < this.anInt5101; local357++) {
			if (this.aClass119Array1[local357] != null) {
				this.aClass119Array1[local357].aBoolean289 = local24.method8632() == 1;
			}
		}
		for (@Pc(386) int local386 = 0; local386 < this.anInt5101; local386++) {
			if (this.aClass119Array1[local386] != null) {
				this.aClass119Array1[local386].aByte58 = local24.method8621();
			}
		}
		for (@Pc(408) int local408 = 0; local408 < this.anInt5101; local408++) {
			if (this.aClass119Array1[local408] != null) {
				this.aClass119Array1[local408].aBoolean296 = local24.method8632() == 1;
			}
		}
		for (@Pc(439) int local439 = 0; local439 < this.anInt5101; local439++) {
			if (this.aClass119Array1[local439] != null) {
				this.aClass119Array1[local439].aBoolean293 = local24.method8632() == 1;
			}
		}
		for (@Pc(468) int local468 = 0; local468 < this.anInt5101; local468++) {
			if (this.aClass119Array1[local468] != null) {
				this.aClass119Array1[local468].aBoolean297 = local24.method8632() == 1;
			}
		}
		for (@Pc(495) int local495 = 0; local495 < this.anInt5101; local495++) {
			if (this.aClass119Array1[local495] != null) {
				this.aClass119Array1[local495].anInt3896 = local24.method8632();
			}
		}
		for (@Pc(521) int local521 = 0; local521 < this.anInt5101; local521++) {
			if (this.aClass119Array1[local521] != null) {
				this.aClass119Array1[local521].anInt3899 = local24.method8618();
			}
		}
		for (@Pc(543) int local543 = 0; local543 < this.anInt5101; local543++) {
			if (this.aClass119Array1[local543] != null) {
				this.aClass119Array1[local543].anInt3894 = local24.method8632();
			}
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIFIZ)[I")
	@Override
	public int[] method4677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		return this.method4678(arg1).method8412(arg3, (double) arg2, this.aClass119Array1[arg1].aBoolean289, this.aClass15_79, this, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(IZ)Lclient!ue;")
	private Class3_Sub11_Sub19 method4678(@OriginalArg(0) int arg0) {
		@Pc(22) Class3_Sub11 local22 = this.aClass179_3.method4558((long) arg0);
		if (local22 != null) {
			return (Class3_Sub11_Sub19) local22;
		}
		@Pc(33) byte[] local33 = this.aClass15_80.method536(arg0);
		if (local33 == null) {
			return null;
		} else {
			@Pc(45) Class3_Sub11_Sub19 local45 = new Class3_Sub11_Sub19(new Class3_Sub25(local33));
			this.aClass179_3.method4562(local45, (long) arg0);
			return local45;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BIZFII)[F")
	@Override
	public float[] method4675(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method4678(arg2).method8410(this.aClass119Array1[arg2].aBoolean289, arg0, this.aClass15_79, this, arg3);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZIFIB)[I")
	@Override
	public int[] method4676(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4) {
		return this.method4678(arg4).method8411(this.aClass15_79, arg2, arg1, (double) arg3, this, this.aClass119Array1[arg4].aBoolean289, arg0);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method4672(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub11_Sub19 local8 = this.method4678(arg0);
		return local8 != null && local8.method8409(this, this.aClass15_79);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)I")
	@Override
	public int method4674() {
		return this.anInt5101;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZ)Lclient!gj;")
	@Override
	public Class119 method4673(@OriginalArg(0) int arg0) {
		return this.aClass119Array1[arg0];
	}
}
