import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class27 implements Interface4 {

	@OriginalMember(owner = "client!av", name = "b", descriptor = "Lclient!eg;")
	private final Class97 aClass97_1 = new Class97(256);

	@OriginalMember(owner = "client!av", name = "o", descriptor = "Lclient!wm;")
	private final Class390 aClass390_5;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "Lclient!wm;")
	private final Class390 aClass390_4;

	@OriginalMember(owner = "client!av", name = "f", descriptor = "I")
	private final int anInt403;

	@OriginalMember(owner = "client!av", name = "n", descriptor = "[Lclient!gk;")
	private final Class136[] aClass136Array1;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!wm;Lclient!wm;Lclient!wm;)V")
	public Class27(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_5 = arg1;
		this.aClass390_4 = arg2;
		@Pc(24) Class5_Sub41 local24 = new Class5_Sub41(arg0.method8914(0, 0));
		this.anInt403 = local24.method7860();
		this.aClass136Array1 = new Class136[this.anInt403];
		for (@Pc(36) int local36 = 0; local36 < this.anInt403; local36++) {
			if (local24.method7816() == 1) {
				this.aClass136Array1[local36] = new Class136();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt403; local61++) {
			if (this.aClass136Array1[local61] != null) {
				this.aClass136Array1[local61].aBoolean315 = local24.method7816() == 0;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt403; local87++) {
			if (this.aClass136Array1[local87] != null) {
				this.aClass136Array1[local87].aBoolean312 = local24.method7816() == 1;
			}
		}
		for (@Pc(120) int local120 = 0; local120 < this.anInt403; local120++) {
			if (this.aClass136Array1[local120] != null) {
				this.aClass136Array1[local120].aBoolean311 = local24.method7816() == 1;
			}
		}
		for (@Pc(149) int local149 = 0; local149 < this.anInt403; local149++) {
			if (this.aClass136Array1[local149] != null) {
				this.aClass136Array1[local149].aByte51 = local24.method7861();
			}
		}
		for (@Pc(175) int local175 = 0; local175 < this.anInt403; local175++) {
			if (this.aClass136Array1[local175] != null) {
				this.aClass136Array1[local175].aByte55 = local24.method7861();
			}
		}
		for (@Pc(201) int local201 = 0; local201 < this.anInt403; local201++) {
			if (this.aClass136Array1[local201] != null) {
				this.aClass136Array1[local201].aByte56 = local24.method7861();
			}
		}
		for (@Pc(223) int local223 = 0; local223 < this.anInt403; local223++) {
			if (this.aClass136Array1[local223] != null) {
				this.aClass136Array1[local223].aByte57 = local24.method7861();
			}
		}
		for (@Pc(245) int local245 = 0; local245 < this.anInt403; local245++) {
			if (this.aClass136Array1[local245] != null) {
				this.aClass136Array1[local245].aShort36 = (short) local24.method7860();
			}
		}
		for (@Pc(272) int local272 = 0; local272 < this.anInt403; local272++) {
			if (this.aClass136Array1[local272] != null) {
				this.aClass136Array1[local272].aByte52 = local24.method7861();
			}
		}
		for (@Pc(298) int local298 = 0; local298 < this.anInt403; local298++) {
			if (this.aClass136Array1[local298] != null) {
				this.aClass136Array1[local298].aByte53 = local24.method7861();
			}
		}
		for (@Pc(324) int local324 = 0; local324 < this.anInt403; local324++) {
			if (this.aClass136Array1[local324] != null) {
				this.aClass136Array1[local324].aBoolean313 = local24.method7816() == 1;
			}
		}
		for (@Pc(353) int local353 = 0; local353 < this.anInt403; local353++) {
			if (this.aClass136Array1[local353] != null) {
				this.aClass136Array1[local353].aBoolean314 = local24.method7816() == 1;
			}
		}
		for (@Pc(384) int local384 = 0; local384 < this.anInt403; local384++) {
			if (this.aClass136Array1[local384] != null) {
				this.aClass136Array1[local384].aByte54 = local24.method7861();
			}
		}
		for (@Pc(406) int local406 = 0; local406 < this.anInt403; local406++) {
			if (this.aClass136Array1[local406] != null) {
				this.aClass136Array1[local406].aBoolean308 = local24.method7816() == 1;
			}
		}
		for (@Pc(439) int local439 = 0; local439 < this.anInt403; local439++) {
			if (this.aClass136Array1[local439] != null) {
				this.aClass136Array1[local439].aBoolean309 = local24.method7816() == 1;
			}
		}
		for (@Pc(468) int local468 = 0; local468 < this.anInt403; local468++) {
			if (this.aClass136Array1[local468] != null) {
				this.aClass136Array1[local468].aBoolean310 = local24.method7816() == 1;
			}
		}
		for (@Pc(497) int local497 = 0; local497 < this.anInt403; local497++) {
			if (this.aClass136Array1[local497] != null) {
				this.aClass136Array1[local497].anInt3868 = local24.method7816();
			}
		}
		for (@Pc(523) int local523 = 0; local523 < this.anInt403; local523++) {
			if (this.aClass136Array1[local523] != null) {
				this.aClass136Array1[local523].anInt3864 = local24.method7804();
			}
		}
		for (@Pc(549) int local549 = 0; local549 < this.anInt403; local549++) {
			if (this.aClass136Array1[local549] != null) {
				this.aClass136Array1[local549].anInt3869 = local24.method7816();
			}
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(FIIIZI)[F")
	@Override
	public float[] method361(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return this.method364(arg1).method3510(this, arg3, arg2, this.aClass136Array1[arg1].aBoolean314, this.aClass390_4);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BI)Lclient!gk;")
	@Override
	public Class136 method358(@OriginalArg(1) int arg0) {
		return this.aClass136Array1[arg0];
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZIIIF)[I")
	@Override
	public int[] method360(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method364(arg2).method3511(this, this.aClass390_4, arg1, arg0, this.aClass136Array1[arg2].aBoolean314, (double) arg3);
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(II)Lclient!hf;")
	private Class5_Sub3_Sub5 method364(@OriginalArg(1) int arg0) {
		@Pc(16) Class5_Sub3 local16 = this.aClass97_1.method2405((long) arg0);
		if (local16 != null) {
			return (Class5_Sub3_Sub5) local16;
		}
		@Pc(27) byte[] local27 = this.aClass390_5.method8923(arg0);
		if (local27 == null) {
			return null;
		} else {
			@Pc(39) Class5_Sub3_Sub5 local39 = new Class5_Sub3_Sub5(new Class5_Sub41(local27));
			this.aClass97_1.method2400(local39, (long) arg0);
			return local39;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method359(@OriginalArg(1) int arg0) {
		@Pc(15) Class5_Sub3_Sub5 local15 = this.method364(arg0);
		return local15 != null && local15.method3512(this, this.aClass390_4);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIFZIB)[I")
	@Override
	public int[] method363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method364(arg0).method3513(arg4, arg1, this, this.aClass136Array1[arg0].aBoolean314, this.aClass390_4, arg3, (double) arg2);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)I")
	@Override
	public int method362() {
		return this.anInt403;
	}
}
