import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class202 implements Interface7 {

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "Lclient!se;")
	private final Class179 aClass179_11 = new Class179(256);

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "Lclient!tq;")
	private final Class191 aClass191_213;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "Lclient!tq;")
	private final Class191 aClass191_214;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "[Lclient!wm;")
	private final Class213[] aClass213Array1;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!tq;Lclient!tq;Lclient!tq;)V")
	public Class202(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) Class191 arg2) {
		this.aClass191_213 = arg1;
		this.aClass191_214 = arg2;
		@Pc(24) Class2_Sub10 local24 = new Class2_Sub10(arg0.method5459(0, 0));
		@Pc(28) int local28 = local24.method4464();
		this.aClass213Array1 = new Class213[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method4421() == 1) {
				this.aClass213Array1[local34] = new Class213();
			}
		}
		for (@Pc(60) int local60 = 0; local60 < local28; local60++) {
			if (this.aClass213Array1[local60] != null) {
				this.aClass213Array1[local60].aBoolean608 = local24.method4421() == 0;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < local28; local92++) {
			if (this.aClass213Array1[local92] != null) {
				this.aClass213Array1[local92].aBoolean612 = local24.method4421() == 1;
			}
		}
		for (@Pc(120) int local120 = 0; local120 < local28; local120++) {
			if (this.aClass213Array1[local120] != null) {
				this.aClass213Array1[local120].aBoolean609 = local24.method4421() == 1;
			}
		}
		for (@Pc(150) int local150 = 0; local150 < local28; local150++) {
			if (this.aClass213Array1[local150] != null) {
				this.aClass213Array1[local150].aBoolean614 = local24.method4421() == 1;
			}
		}
		for (@Pc(176) int local176 = 0; local176 < local28; local176++) {
			if (this.aClass213Array1[local176] != null) {
				this.aClass213Array1[local176].aByte75 = local24.method4436();
			}
		}
		for (@Pc(197) int local197 = 0; local197 < local28; local197++) {
			if (this.aClass213Array1[local197] != null) {
				this.aClass213Array1[local197].aByte70 = local24.method4436();
			}
		}
		for (@Pc(222) int local222 = 0; local222 < local28; local222++) {
			if (this.aClass213Array1[local222] != null) {
				this.aClass213Array1[local222].aByte72 = local24.method4436();
			}
		}
		for (@Pc(247) int local247 = 0; local247 < local28; local247++) {
			if (this.aClass213Array1[local247] != null) {
				this.aClass213Array1[local247].aByte76 = local24.method4436();
			}
		}
		for (@Pc(272) int local272 = 0; local272 < local28; local272++) {
			if (this.aClass213Array1[local272] != null) {
				this.aClass213Array1[local272].aShort92 = (short) local24.method4464();
			}
		}
		for (@Pc(298) int local298 = 0; local298 < local28; local298++) {
			if (this.aClass213Array1[local298] != null) {
				this.aClass213Array1[local298].aByte71 = local24.method4436();
			}
		}
		for (@Pc(323) int local323 = 0; local323 < local28; local323++) {
			if (this.aClass213Array1[local323] != null) {
				this.aClass213Array1[local323].aByte73 = local24.method4436();
			}
		}
		for (@Pc(344) int local344 = 0; local344 < local28; local344++) {
			if (this.aClass213Array1[local344] != null) {
				this.aClass213Array1[local344].aBoolean615 = local24.method4421() == 1;
			}
		}
		for (@Pc(376) int local376 = 0; local376 < local28; local376++) {
			if (this.aClass213Array1[local376] != null) {
				this.aClass213Array1[local376].aBoolean616 = local24.method4421() == 1;
			}
		}
		for (@Pc(406) int local406 = 0; local406 < local28; local406++) {
			if (this.aClass213Array1[local406] != null) {
				this.aClass213Array1[local406].aByte74 = local24.method4436();
			}
		}
		for (@Pc(427) int local427 = 0; local427 < local28; local427++) {
			if (this.aClass213Array1[local427] != null) {
				this.aClass213Array1[local427].aBoolean610 = local24.method4421() == 1;
			}
		}
		for (@Pc(453) int local453 = 0; local453 < local28; local453++) {
			if (this.aClass213Array1[local453] != null) {
				this.aClass213Array1[local453].aBoolean613 = local24.method4421() == 1;
			}
		}
		for (@Pc(481) int local481 = 0; local481 < local28; local481++) {
			if (this.aClass213Array1[local481] != null) {
				this.aClass213Array1[local481].aBoolean611 = local24.method4421() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZIIFII)[I")
	@Override
	public int[] method5781(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3) {
		return this.method5784(arg0).method5738(this.aClass191_214, arg1, this, this.aClass213Array1[arg0].aBoolean616, arg3, (double) arg2);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIFIIZ)[I")
	@Override
	public int[] method5777(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method5784(arg2).method5734(this.aClass191_214, this.aClass213Array1[arg2].aBoolean616, arg0, this, (double) arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZIIIIF)[F")
	@Override
	public float[] method5779(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method5784(arg1).method5732(arg0, arg2, this.aClass213Array1[arg1].aBoolean616, this, this.aClass191_214);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Lclient!v;")
	private Class2_Sub11_Sub20 method5784(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub11 local15 = this.aClass179_11.method5092((long) arg0);
		if (local15 != null) {
			return (Class2_Sub11_Sub20) local15;
		}
		@Pc(26) byte[] local26 = this.aClass191_213.method5448(arg0);
		if (local26 == null) {
			return null;
		} else {
			@Pc(38) Class2_Sub11_Sub20 local38 = new Class2_Sub11_Sub20(new Class2_Sub10(local26));
			this.aClass179_11.method5085(local38, (long) arg0);
			return local38;
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(BI)Z")
	@Override
	public boolean method5780(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub11_Sub20 local16 = this.method5784(arg0);
		return local16 != null && local16.method5735(this, this.aClass191_214);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)Lclient!wm;")
	@Override
	public Class213 method5778(@OriginalArg(1) int arg0) {
		return this.aClass213Array1[arg0];
	}
}
