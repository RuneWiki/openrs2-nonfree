import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class39 implements Interface2 {

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!gq;")
	private final Class88 aClass88_3 = new Class88(256);

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Lclient!lm;")
	private final Class134 aClass134_27;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "Lclient!lm;")
	private final Class134 aClass134_28;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "[Lclient!jh;")
	private final Class116[] aClass116Array1;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!lm;Lclient!lm;Lclient!lm;)V")
	public Class39(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class134 arg2) {
		this.aClass134_27 = arg2;
		this.aClass134_28 = arg1;
		@Pc(24) Class1_Sub21 local24 = new Class1_Sub21(arg0.method3009(0, 0));
		@Pc(28) int local28 = local24.method5715();
		this.aClass116Array1 = new Class116[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method5720() == 1) {
				this.aClass116Array1[local34] = new Class116();
			}
		}
		for (@Pc(60) int local60 = 0; local60 < local28; local60++) {
			if (this.aClass116Array1[local60] != null) {
				this.aClass116Array1[local60].aBoolean217 = local24.method5720() == 0;
			}
		}
		for (@Pc(85) int local85 = 0; local85 < local28; local85++) {
			if (this.aClass116Array1[local85] != null) {
				this.aClass116Array1[local85].aBoolean218 = local24.method5720() == 1;
			}
		}
		for (@Pc(113) int local113 = 0; local113 < local28; local113++) {
			if (this.aClass116Array1[local113] != null) {
				this.aClass116Array1[local113].aBoolean223 = local24.method5720() == 1;
			}
		}
		for (@Pc(141) int local141 = 0; local141 < local28; local141++) {
			if (this.aClass116Array1[local141] != null) {
				this.aClass116Array1[local141].aBoolean220 = local24.method5720() == 1;
			}
		}
		for (@Pc(173) int local173 = 0; local173 < local28; local173++) {
			if (this.aClass116Array1[local173] != null) {
				this.aClass116Array1[local173].aByte49 = local24.method5721();
			}
		}
		for (@Pc(198) int local198 = 0; local198 < local28; local198++) {
			if (this.aClass116Array1[local198] != null) {
				this.aClass116Array1[local198].aByte44 = local24.method5721();
			}
		}
		for (@Pc(219) int local219 = 0; local219 < local28; local219++) {
			if (this.aClass116Array1[local219] != null) {
				this.aClass116Array1[local219].aByte47 = local24.method5721();
			}
		}
		for (@Pc(240) int local240 = 0; local240 < local28; local240++) {
			if (this.aClass116Array1[local240] != null) {
				this.aClass116Array1[local240].aByte46 = local24.method5721();
			}
		}
		for (@Pc(261) int local261 = 0; local261 < local28; local261++) {
			if (this.aClass116Array1[local261] != null) {
				this.aClass116Array1[local261].aShort56 = (short) local24.method5715();
			}
		}
		for (@Pc(283) int local283 = 0; local283 < local28; local283++) {
			if (this.aClass116Array1[local283] != null) {
				this.aClass116Array1[local283].aByte43 = local24.method5721();
			}
		}
		for (@Pc(308) int local308 = 0; local308 < local28; local308++) {
			if (this.aClass116Array1[local308] != null) {
				this.aClass116Array1[local308].aByte48 = local24.method5721();
			}
		}
		for (@Pc(333) int local333 = 0; local333 < local28; local333++) {
			if (this.aClass116Array1[local333] != null) {
				this.aClass116Array1[local333].aBoolean219 = local24.method5720() == 1;
			}
		}
		for (@Pc(365) int local365 = 0; local365 < local28; local365++) {
			if (this.aClass116Array1[local365] != null) {
				this.aClass116Array1[local365].aBoolean216 = local24.method5720() == 1;
			}
		}
		for (@Pc(391) int local391 = 0; local391 < local28; local391++) {
			if (this.aClass116Array1[local391] != null) {
				this.aClass116Array1[local391].aByte45 = local24.method5721();
			}
		}
		for (@Pc(416) int local416 = 0; local416 < local28; local416++) {
			if (this.aClass116Array1[local416] != null) {
				this.aClass116Array1[local416].aBoolean221 = local24.method5720() == 1;
			}
		}
		for (@Pc(446) int local446 = 0; local446 < local28; local446++) {
			if (this.aClass116Array1[local446] != null) {
				this.aClass116Array1[local446].aBoolean222 = local24.method5720() == 1;
			}
		}
		for (@Pc(476) int local476 = 0; local476 < local28; local476++) {
			if (this.aClass116Array1[local476] != null) {
				this.aClass116Array1[local476].aBoolean224 = local24.method5720() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IBZIIF)[I")
	@Override
	public int[] method949(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4) {
		return this.method953(arg3).method5153(arg2, this.aClass134_27, arg1, arg0, (double) arg4, this, this.aClass116Array1[arg3].aBoolean216);
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(II)Lclient!tg;")
	private Class1_Sub2_Sub18 method953(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2 local10 = this.aClass88_3.method1652((long) arg0);
		if (local10 != null) {
			return (Class1_Sub2_Sub18) local10;
		}
		@Pc(29) byte[] local29 = this.aClass134_28.method3014(arg0);
		if (local29 == null) {
			return null;
		} else {
			@Pc(41) Class1_Sub2_Sub18 local41 = new Class1_Sub2_Sub18(new Class1_Sub21(local29));
			this.aClass88_3.method1651((long) arg0, local41);
			return local41;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIZFII)[F")
	@Override
	public float[] method948(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method953(arg2).method5155(arg0, this.aClass134_27, arg3, this.aClass116Array1[arg2].aBoolean216, this);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method952(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub2_Sub18 local15 = this.method953(arg0);
		return local15 != null && local15.method5156(this, this.aClass134_27);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIIIFI)[I")
	@Override
	public int[] method950(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method953(arg3).method5158(this, (double) arg2, arg1, arg0, this.aClass134_27, this.aClass116Array1[arg3].aBoolean216);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Lclient!jh;")
	@Override
	public Class116 method951(@OriginalArg(0) int arg0) {
		return this.aClass116Array1[arg0];
	}
}
