import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class260 implements Interface4 {

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "Lclient!kka;")
	private final Class214 aClass214_2 = new Class214(256);

	@OriginalMember(owner = "client!nfa", name = "i", descriptor = "Lclient!ik;")
	private final Class182 aClass182_91;

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "Lclient!ik;")
	private final Class182 aClass182_90;

	@OriginalMember(owner = "client!nfa", name = "e", descriptor = "I")
	private final int anInt6635;

	@OriginalMember(owner = "client!nfa", name = "k", descriptor = "[Lclient!wka;")
	private final Class406[] aClass406Array1;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lclient!ik;Lclient!ik;Lclient!ik;)V")
	public Class260(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_91 = arg2;
		this.aClass182_90 = arg1;
		@Pc(24) Class3_Sub2 local24 = new Class3_Sub2(arg0.method3985(0, 0));
		this.anInt6635 = local24.method2028(-14795);
		this.aClass406Array1 = new Class406[this.anInt6635];
		for (@Pc(36) int local36 = 0; local36 < this.anInt6635; local36++) {
			if (local24.method2048(255) == 1) {
				this.aClass406Array1[local36] = new Class406();
			}
		}
		for (@Pc(67) int local67 = 0; local67 < this.anInt6635; local67++) {
			if (this.aClass406Array1[local67] != null) {
				this.aClass406Array1[local67].aBoolean761 = local24.method2048(255) == 0;
			}
		}
		for (@Pc(107) int local107 = 0; local107 < this.anInt6635; local107++) {
			if (this.aClass406Array1[local107] != null) {
				this.aClass406Array1[local107].aBoolean762 = local24.method2048(255) == 1;
			}
		}
		for (@Pc(143) int local143 = 0; local143 < this.anInt6635; local143++) {
			if (this.aClass406Array1[local143] != null) {
				this.aClass406Array1[local143].aBoolean765 = local24.method2048(255) == 1;
			}
		}
		for (@Pc(177) int local177 = 0; local177 < this.anInt6635; local177++) {
			if (this.aClass406Array1[local177] != null) {
				this.aClass406Array1[local177].aByte146 = local24.method2022();
			}
		}
		for (@Pc(209) int local209 = 0; local209 < this.anInt6635; local209++) {
			if (this.aClass406Array1[local209] != null) {
				this.aClass406Array1[local209].aByte144 = local24.method2022();
			}
		}
		for (@Pc(241) int local241 = 0; local241 < this.anInt6635; local241++) {
			if (this.aClass406Array1[local241] != null) {
				this.aClass406Array1[local241].aByte149 = local24.method2022();
			}
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt6635; local269++) {
			if (this.aClass406Array1[local269] != null) {
				this.aClass406Array1[local269].aByte147 = local24.method2022();
			}
		}
		for (@Pc(301) int local301 = 0; local301 < this.anInt6635; local301++) {
			if (this.aClass406Array1[local301] != null) {
				this.aClass406Array1[local301].aShort127 = (short) local24.method2028(-14795);
			}
		}
		for (@Pc(330) int local330 = 0; local330 < this.anInt6635; local330++) {
			if (this.aClass406Array1[local330] != null) {
				this.aClass406Array1[local330].aByte145 = local24.method2022();
			}
		}
		for (@Pc(362) int local362 = 0; local362 < this.anInt6635; local362++) {
			if (this.aClass406Array1[local362] != null) {
				this.aClass406Array1[local362].aByte150 = local24.method2022();
			}
		}
		for (@Pc(394) int local394 = 0; local394 < this.anInt6635; local394++) {
			if (this.aClass406Array1[local394] != null) {
				this.aClass406Array1[local394].aBoolean764 = local24.method2048(255) == 1;
			}
		}
		for (@Pc(428) int local428 = 0; local428 < this.anInt6635; local428++) {
			if (this.aClass406Array1[local428] != null) {
				this.aClass406Array1[local428].aBoolean760 = local24.method2048(255) == 1;
			}
		}
		for (@Pc(464) int local464 = 0; local464 < this.anInt6635; local464++) {
			if (this.aClass406Array1[local464] != null) {
				this.aClass406Array1[local464].aByte148 = local24.method2022();
			}
		}
		for (@Pc(496) int local496 = 0; local496 < this.anInt6635; local496++) {
			if (this.aClass406Array1[local496] != null) {
				this.aClass406Array1[local496].aBoolean766 = local24.method2048(255) == 1;
			}
		}
		for (@Pc(536) int local536 = 0; local536 < this.anInt6635; local536++) {
			if (this.aClass406Array1[local536] != null) {
				this.aClass406Array1[local536].aBoolean759 = local24.method2048(255) == 1;
			}
		}
		for (@Pc(574) int local574 = 0; local574 < this.anInt6635; local574++) {
			if (this.aClass406Array1[local574] != null) {
				this.aClass406Array1[local574].aBoolean763 = local24.method2048(255) == 1;
			}
		}
		for (@Pc(610) int local610 = 0; local610 < this.anInt6635; local610++) {
			if (this.aClass406Array1[local610] != null) {
				this.aClass406Array1[local610].anInt11144 = local24.method2048(255);
			}
		}
		for (@Pc(638) int local638 = 0; local638 < this.anInt6635; local638++) {
			if (this.aClass406Array1[local638] != null) {
				this.aClass406Array1[local638].anInt11146 = local24.method2036();
			}
		}
		for (@Pc(666) int local666 = 0; local666 < this.anInt6635; local666++) {
			if (this.aClass406Array1[local666] != null) {
				this.aClass406Array1[local666].anInt11143 = local24.method2048(255);
			}
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIZFII)[I")
	@Override
	public int[] method5760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4) {
		return this.method5763(arg4).method4481(this.aClass406Array1[arg4].aBoolean760, this, (double) arg3, arg0, this.aClass182_91, arg1, arg2);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IZIFII)[F")
	@Override
	public float[] method5762(@OriginalArg(2) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method5763(arg3).method4482(this.aClass406Array1[arg3].aBoolean760, arg0, this.aClass182_91, arg2, this);
	}

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "(II)Lclient!je;")
	private Class3_Sub7_Sub11 method5763(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub7 local12 = this.aClass214_2.method4927((long) arg0);
		if (local12 != null) {
			return (Class3_Sub7_Sub11) local12;
		}
		@Pc(24) byte[] local24 = this.aClass182_90.method3961(arg0);
		if (local24 == null) {
			return null;
		} else {
			@Pc(37) Class3_Sub7_Sub11 local37 = new Class3_Sub7_Sub11(new Class3_Sub2(local24));
			this.aClass214_2.method4928(local37, (long) arg0);
			return local37;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)I")
	@Override
	public int method5759() {
		return this.anInt6635;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)Lclient!wka;")
	@Override
	public Class406 method5761(@OriginalArg(0) int arg0) {
		return this.aClass406Array1[arg0];
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method5758(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub7_Sub11 local8 = this.method5763(arg0);
		return local8 != null && local8.method4478(this.aClass182_91, this);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIBIFZ)[I")
	@Override
	public int[] method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		return this.method5763(arg2).method4480(arg0, this.aClass406Array1[arg2].aBoolean760, this.aClass182_91, this, (double) arg3, arg1);
	}
}
