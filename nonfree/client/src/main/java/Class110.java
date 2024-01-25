import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class110 implements Interface2 {

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "Lclient!no;")
	private final Class142 aClass142_8 = new Class142(256);

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "Lclient!nq;")
	private final Class144 aClass144_40;

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!nq;")
	private final Class144 aClass144_41;

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "[Lclient!mp;")
	private final Class134[] aClass134Array1;

	static {
		new Class117("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!nq;Lclient!nq;Lclient!nq;)V")
	public Class110(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class144 arg2) {
		this.aClass144_40 = arg1;
		this.aClass144_41 = arg2;
		@Pc(24) Class11_Sub25 local24 = new Class11_Sub25(arg0.method3896(0, 0));
		@Pc(28) int local28 = local24.method5187();
		this.aClass134Array1 = new Class134[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method5185() == 1) {
				this.aClass134Array1[local34] = new Class134();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
			if (this.aClass134Array1[local58] != null) {
				this.aClass134Array1[local58].aBoolean256 = local24.method5185() == 0;
			}
		}
		for (@Pc(90) int local90 = 0; local90 < local28; local90++) {
			if (this.aClass134Array1[local90] != null) {
				this.aClass134Array1[local90].aBoolean258 = local24.method5185() == 1;
			}
		}
		for (@Pc(118) int local118 = 0; local118 < local28; local118++) {
			if (this.aClass134Array1[local118] != null) {
				this.aClass134Array1[local118].aBoolean259 = local24.method5185() == 1;
			}
		}
		for (@Pc(144) int local144 = 0; local144 < local28; local144++) {
			if (this.aClass134Array1[local144] != null) {
				this.aClass134Array1[local144].aBoolean253 = local24.method5185() == 1;
			}
		}
		for (@Pc(174) int local174 = 0; local174 < local28; local174++) {
			if (this.aClass134Array1[local174] != null) {
				this.aClass134Array1[local174].aByte43 = local24.method5175();
			}
		}
		for (@Pc(195) int local195 = 0; local195 < local28; local195++) {
			if (this.aClass134Array1[local195] != null) {
				this.aClass134Array1[local195].aByte48 = local24.method5175();
			}
		}
		for (@Pc(216) int local216 = 0; local216 < local28; local216++) {
			if (this.aClass134Array1[local216] != null) {
				this.aClass134Array1[local216].aByte42 = local24.method5175();
			}
		}
		for (@Pc(237) int local237 = 0; local237 < local28; local237++) {
			if (this.aClass134Array1[local237] != null) {
				this.aClass134Array1[local237].aByte44 = local24.method5175();
			}
		}
		for (@Pc(262) int local262 = 0; local262 < local28; local262++) {
			if (this.aClass134Array1[local262] != null) {
				this.aClass134Array1[local262].aShort63 = (short) local24.method5187();
			}
		}
		for (@Pc(288) int local288 = 0; local288 < local28; local288++) {
			if (this.aClass134Array1[local288] != null) {
				this.aClass134Array1[local288].aByte46 = local24.method5175();
			}
		}
		for (@Pc(313) int local313 = 0; local313 < local28; local313++) {
			if (this.aClass134Array1[local313] != null) {
				this.aClass134Array1[local313].aByte45 = local24.method5175();
			}
		}
		for (@Pc(338) int local338 = 0; local338 < local28; local338++) {
			if (this.aClass134Array1[local338] != null) {
				this.aClass134Array1[local338].aBoolean254 = local24.method5185() == 1;
			}
		}
		for (@Pc(366) int local366 = 0; local366 < local28; local366++) {
			if (this.aClass134Array1[local366] != null) {
				this.aClass134Array1[local366].aBoolean255 = local24.method5185() == 1;
			}
		}
		for (@Pc(396) int local396 = 0; local396 < local28; local396++) {
			if (this.aClass134Array1[local396] != null) {
				this.aClass134Array1[local396].aByte47 = local24.method5175();
			}
		}
		for (@Pc(417) int local417 = 0; local417 < local28; local417++) {
			if (this.aClass134Array1[local417] != null) {
				this.aClass134Array1[local417].aBoolean252 = local24.method5185() == 1;
			}
		}
		for (@Pc(445) int local445 = 0; local445 < local28; local445++) {
			if (this.aClass134Array1[local445] != null) {
				this.aClass134Array1[local445].aBoolean260 = local24.method5185() == 1;
			}
		}
		for (@Pc(477) int local477 = 0; local477 < local28; local477++) {
			if (this.aClass134Array1[local477] != null) {
				this.aClass134Array1[local477].aBoolean257 = local24.method5185() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)Lclient!pp;")
	private Class11_Sub4_Sub15 method2249(@OriginalArg(1) int arg0) {
		@Pc(10) Class11_Sub4 local10 = this.aClass142_8.method3874((long) arg0);
		if (local10 != null) {
			return (Class11_Sub4_Sub15) local10;
		}
		@Pc(23) byte[] local23 = this.aClass144_40.method3908(arg0);
		if (local23 == null) {
			return null;
		} else {
			@Pc(35) Class11_Sub4_Sub15 local35 = new Class11_Sub4_Sub15(new Class11_Sub25(local23));
			this.aClass142_8.method3870(local35, (long) arg0);
			return local35;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IFIIIZ)[I")
	@Override
	public int[] method2247(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method2249(arg3).method4330(this.aClass144_41, arg2, this.aClass134Array1[arg3].aBoolean255, arg0, (double) arg1, this);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)Lclient!mp;")
	@Override
	public Class134 method2244(@OriginalArg(0) int arg0) {
		return this.aClass134Array1[arg0];
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBFZII)[I")
	@Override
	public int[] method2243(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method2249(arg3).method4332(arg2, arg4, this.aClass144_41, (double) arg1, this, arg0, this.aClass134Array1[arg3].aBoolean255);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2246(@OriginalArg(0) int arg0) {
		@Pc(20) Class11_Sub4_Sub15 local20 = this.method2249(arg0);
		return local20 != null && local20.method4333(this, this.aClass144_41);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZIIIIF)[F")
	@Override
	public float[] method2245(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method2249(arg1).method4328(arg2, this.aClass144_41, this, this.aClass134Array1[arg1].aBoolean255, arg0);
	}
}
