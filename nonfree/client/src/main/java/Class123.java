import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class123 implements Interface4 {

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "Lclient!tea;")
	private final Class308 aClass308_5 = new Class308(256);

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "Lclient!pe;")
	private final Class254 aClass254_55;

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "Lclient!pe;")
	private final Class254 aClass254_54;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
	private final int anInt3524;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "[Lclient!kc;")
	private final Class178[] aClass178Array1;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!pe;Lclient!pe;Lclient!pe;)V")
	public Class123(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_55 = arg1;
		this.aClass254_54 = arg2;
		@Pc(24) Class3_Sub7 local24 = new Class3_Sub7(arg0.method6401(0, 0));
		this.anInt3524 = local24.method6535();
		this.aClass178Array1 = new Class178[this.anInt3524];
		for (@Pc(36) int local36 = 0; local36 < this.anInt3524; local36++) {
			if (local24.method6538() == 1) {
				this.aClass178Array1[local36] = new Class178();
			}
		}
		for (@Pc(59) int local59 = 0; local59 < this.anInt3524; local59++) {
			if (this.aClass178Array1[local59] != null) {
				this.aClass178Array1[local59].aBoolean488 = local24.method6538() == 0;
			}
		}
		for (@Pc(88) int local88 = 0; local88 < this.anInt3524; local88++) {
			if (this.aClass178Array1[local88] != null) {
				this.aClass178Array1[local88].aBoolean489 = local24.method6538() == 1;
			}
		}
		for (@Pc(119) int local119 = 0; local119 < this.anInt3524; local119++) {
			if (this.aClass178Array1[local119] != null) {
				this.aClass178Array1[local119].aBoolean486 = local24.method6538() == 1;
			}
		}
		for (@Pc(152) int local152 = 0; local152 < this.anInt3524; local152++) {
			if (this.aClass178Array1[local152] != null) {
				this.aClass178Array1[local152].aBoolean493 = local24.method6538() == 1;
			}
		}
		for (@Pc(185) int local185 = 0; local185 < this.anInt3524; local185++) {
			if (this.aClass178Array1[local185] != null) {
				this.aClass178Array1[local185].aByte57 = local24.method6529();
			}
		}
		for (@Pc(207) int local207 = 0; local207 < this.anInt3524; local207++) {
			if (this.aClass178Array1[local207] != null) {
				this.aClass178Array1[local207].aByte52 = local24.method6529();
			}
		}
		for (@Pc(229) int local229 = 0; local229 < this.anInt3524; local229++) {
			if (this.aClass178Array1[local229] != null) {
				this.aClass178Array1[local229].aByte54 = local24.method6529();
			}
		}
		for (@Pc(255) int local255 = 0; local255 < this.anInt3524; local255++) {
			if (this.aClass178Array1[local255] != null) {
				this.aClass178Array1[local255].aByte58 = local24.method6529();
			}
		}
		for (@Pc(277) int local277 = 0; local277 < this.anInt3524; local277++) {
			if (this.aClass178Array1[local277] != null) {
				this.aClass178Array1[local277].aShort56 = (short) local24.method6535();
			}
		}
		for (@Pc(304) int local304 = 0; local304 < this.anInt3524; local304++) {
			if (this.aClass178Array1[local304] != null) {
				this.aClass178Array1[local304].aByte56 = local24.method6529();
			}
		}
		for (@Pc(326) int local326 = 0; local326 < this.anInt3524; local326++) {
			if (this.aClass178Array1[local326] != null) {
				this.aClass178Array1[local326].aByte55 = local24.method6529();
			}
		}
		for (@Pc(352) int local352 = 0; local352 < this.anInt3524; local352++) {
			if (this.aClass178Array1[local352] != null) {
				this.aClass178Array1[local352].aBoolean490 = local24.method6538() == 1;
			}
		}
		for (@Pc(379) int local379 = 0; local379 < this.anInt3524; local379++) {
			if (this.aClass178Array1[local379] != null) {
				this.aClass178Array1[local379].aBoolean485 = local24.method6538() == 1;
			}
		}
		for (@Pc(412) int local412 = 0; local412 < this.anInt3524; local412++) {
			if (this.aClass178Array1[local412] != null) {
				this.aClass178Array1[local412].aByte53 = local24.method6529();
			}
		}
		for (@Pc(438) int local438 = 0; local438 < this.anInt3524; local438++) {
			if (this.aClass178Array1[local438] != null) {
				this.aClass178Array1[local438].aBoolean492 = local24.method6538() == 1;
			}
		}
		for (@Pc(471) int local471 = 0; local471 < this.anInt3524; local471++) {
			if (this.aClass178Array1[local471] != null) {
				this.aClass178Array1[local471].aBoolean491 = local24.method6538() == 1;
			}
		}
		for (@Pc(502) int local502 = 0; local502 < this.anInt3524; local502++) {
			if (this.aClass178Array1[local502] != null) {
				this.aClass178Array1[local502].aBoolean487 = local24.method6538() == 1;
			}
		}
		for (@Pc(531) int local531 = 0; local531 < this.anInt3524; local531++) {
			if (this.aClass178Array1[local531] != null) {
				this.aClass178Array1[local531].anInt5666 = local24.method6538();
			}
		}
		for (@Pc(553) int local553 = 0; local553 < this.anInt3524; local553++) {
			if (this.aClass178Array1[local553] != null) {
				this.aClass178Array1[local553].anInt5664 = local24.method6497();
			}
		}
		for (@Pc(575) int local575 = 0; local575 < this.anInt3524; local575++) {
			if (this.aClass178Array1[local575] != null) {
				this.aClass178Array1[local575].aBoolean494 = local24.method6538() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(FIIZII)[F")
	@Override
	public float[] method3085(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return this.method3092(arg2).method2834(this, arg1, this.aClass178Array1[arg2].aBoolean485, this.aClass254_54, arg3);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZFIIB)[I")
	@Override
	public int[] method3086(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method3092(arg4).method2837(this, (double) arg2, arg3, this.aClass254_54, arg0, arg1, this.aClass178Array1[arg4].aBoolean485);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)I")
	@Override
	public int method3087() {
		return this.anInt3524;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZIIIFI)[I")
	@Override
	public int[] method3089(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		return this.method3092(arg1).method2838(this.aClass178Array1[arg1].aBoolean485, this, arg2, arg0, this.aClass254_54, (double) arg3);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)Lclient!kc;")
	@Override
	public Class178 method3088(@OriginalArg(1) int arg0) {
		return this.aClass178Array1[arg0];
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)Lclient!fga;")
	private Class3_Sub4_Sub11 method3092(@OriginalArg(0) int arg0) {
		@Pc(18) Class3_Sub4 local18 = this.aClass308_5.method7537((long) arg0);
		if (local18 != null) {
			return (Class3_Sub4_Sub11) local18;
		}
		@Pc(29) byte[] local29 = this.aClass254_55.method6420(arg0);
		if (local29 == null) {
			return null;
		} else {
			@Pc(41) Class3_Sub4_Sub11 local41 = new Class3_Sub4_Sub11(new Class3_Sub7(local29));
			this.aClass308_5.method7538((long) arg0, local41);
			return local41;
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(BI)Z")
	@Override
	public boolean method3090(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub4_Sub11 local13 = this.method3092(arg0);
		return local13 != null && local13.method2835(this, this.aClass254_54);
	}
}
