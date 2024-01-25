import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class226 implements Interface8 {

	@OriginalMember(owner = "client!su", name = "c", descriptor = "Lclient!ul;")
	private final Class243 aClass243_4 = new Class243(256);

	@OriginalMember(owner = "client!su", name = "f", descriptor = "Lclient!he;")
	private final Class100 aClass100_76;

	@OriginalMember(owner = "client!su", name = "g", descriptor = "Lclient!he;")
	private final Class100 aClass100_77;

	@OriginalMember(owner = "client!su", name = "j", descriptor = "[Lclient!op;")
	private final Class184[] aClass184Array1;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!he;Lclient!he;Lclient!he;)V")
	public Class226(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_76 = arg1;
		this.aClass100_77 = arg2;
		@Pc(24) Class6_Sub1 local24 = new Class6_Sub1(arg0.method2520(0, 0));
		@Pc(28) int local28 = local24.method6485();
		this.aClass184Array1 = new Class184[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method6433() == 1) {
				this.aClass184Array1[local34] = new Class184();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
			if (this.aClass184Array1[local58] != null) {
				this.aClass184Array1[local58].aBoolean330 = local24.method6433() == 0;
			}
		}
		for (@Pc(90) int local90 = 0; local90 < local28; local90++) {
			if (this.aClass184Array1[local90] != null) {
				this.aClass184Array1[local90].aBoolean324 = local24.method6433() == 1;
			}
		}
		for (@Pc(120) int local120 = 0; local120 < local28; local120++) {
			if (this.aClass184Array1[local120] != null) {
				this.aClass184Array1[local120].aBoolean325 = local24.method6433() == 1;
			}
		}
		for (@Pc(152) int local152 = 0; local152 < local28; local152++) {
			if (this.aClass184Array1[local152] != null) {
				this.aClass184Array1[local152].aBoolean331 = local24.method6433() == 1;
			}
		}
		for (@Pc(184) int local184 = 0; local184 < local28; local184++) {
			if (this.aClass184Array1[local184] != null) {
				this.aClass184Array1[local184].aByte74 = local24.method6438();
			}
		}
		for (@Pc(205) int local205 = 0; local205 < local28; local205++) {
			if (this.aClass184Array1[local205] != null) {
				this.aClass184Array1[local205].aByte73 = local24.method6438();
			}
		}
		for (@Pc(226) int local226 = 0; local226 < local28; local226++) {
			if (this.aClass184Array1[local226] != null) {
				this.aClass184Array1[local226].aByte72 = local24.method6438();
			}
		}
		for (@Pc(251) int local251 = 0; local251 < local28; local251++) {
			if (this.aClass184Array1[local251] != null) {
				this.aClass184Array1[local251].aByte69 = local24.method6438();
			}
		}
		for (@Pc(272) int local272 = 0; local272 < local28; local272++) {
			if (this.aClass184Array1[local272] != null) {
				this.aClass184Array1[local272].aShort72 = (short) local24.method6485();
			}
		}
		for (@Pc(298) int local298 = 0; local298 < local28; local298++) {
			if (this.aClass184Array1[local298] != null) {
				this.aClass184Array1[local298].aByte70 = local24.method6438();
			}
		}
		for (@Pc(319) int local319 = 0; local319 < local28; local319++) {
			if (this.aClass184Array1[local319] != null) {
				this.aClass184Array1[local319].aByte68 = local24.method6438();
			}
		}
		for (@Pc(344) int local344 = 0; local344 < local28; local344++) {
			if (this.aClass184Array1[local344] != null) {
				this.aClass184Array1[local344].aBoolean332 = local24.method6433() == 1;
			}
		}
		for (@Pc(370) int local370 = 0; local370 < local28; local370++) {
			if (this.aClass184Array1[local370] != null) {
				this.aClass184Array1[local370].aBoolean327 = local24.method6433() == 1;
			}
		}
		for (@Pc(396) int local396 = 0; local396 < local28; local396++) {
			if (this.aClass184Array1[local396] != null) {
				this.aClass184Array1[local396].aByte71 = local24.method6438();
			}
		}
		for (@Pc(417) int local417 = 0; local417 < local28; local417++) {
			if (this.aClass184Array1[local417] != null) {
				this.aClass184Array1[local417].aBoolean329 = local24.method6433() == 1;
			}
		}
		for (@Pc(447) int local447 = 0; local447 < local28; local447++) {
			if (this.aClass184Array1[local447] != null) {
				this.aClass184Array1[local447].aBoolean326 = local24.method6433() == 1;
			}
		}
		for (@Pc(479) int local479 = 0; local479 < local28; local479++) {
			if (this.aClass184Array1[local479] != null) {
				this.aClass184Array1[local479].aBoolean328 = local24.method6433() == 1;
			}
		}
		for (@Pc(505) int local505 = 0; local505 < local28; local505++) {
			if (this.aClass184Array1[local505] != null) {
				this.aClass184Array1[local505].anInt5196 = local24.method6433();
			}
		}
		for (@Pc(526) int local526 = 0; local526 < local28; local526++) {
			if (this.aClass184Array1[local526] != null) {
				this.aClass184Array1[local526].anInt5200 = local24.method6442();
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IZ)Lclient!op;")
	@Override
	public Class184 method5566(@OriginalArg(0) int arg0) {
		return this.aClass184Array1[arg0];
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(FIZIBI)[I")
	@Override
	public int[] method5564(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method5567(arg3).method1171(arg1, this.aClass100_77, this, this.aClass184Array1[arg3].aBoolean327, (double) arg0, arg2);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5562(@OriginalArg(1) int arg0) {
		@Pc(14) Class6_Sub2_Sub2 local14 = this.method5567(arg0);
		return local14 != null && local14.method1173(this, this.aClass100_77);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IZIFII)[F")
	@Override
	public float[] method5565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3) {
		return this.method5567(arg0).method1174(this.aClass100_77, this, arg3, arg1, this.aClass184Array1[arg0].aBoolean327);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIZFII)[I")
	@Override
	public int[] method5563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4) {
		return this.method5567(arg0).method1169(arg4, arg2, this.aClass184Array1[arg0].aBoolean327, (double) arg3, this, this.aClass100_77, arg1);
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(IZ)Lclient!cm;")
	private Class6_Sub2_Sub2 method5567(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub2 local10 = this.aClass243_4.method5962((long) arg0);
		if (local10 != null) {
			return (Class6_Sub2_Sub2) local10;
		}
		@Pc(21) byte[] local21 = this.aClass100_76.method2515(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class6_Sub2_Sub2 local33 = new Class6_Sub2_Sub2(new Class6_Sub1(local21));
			this.aClass243_4.method5960(local33, (long) arg0);
			return local33;
		}
	}
}
