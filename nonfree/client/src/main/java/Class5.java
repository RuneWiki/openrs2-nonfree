import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5 implements Interface2 {

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Lclient!rm;")
	private final Class178 aClass178_1 = new Class178(256);

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Lclient!mo;")
	private final Class143 aClass143_2;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!mo;")
	private final Class143 aClass143_1;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "[Lclient!nq;")
	private final Class154[] aClass154Array1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!mo;Lclient!mo;Lclient!mo;)V")
	public Class5(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_2 = arg2;
		this.aClass143_1 = arg1;
		@Pc(24) Class14_Sub4 local24 = new Class14_Sub4(arg0.method3745(0, 0));
		@Pc(28) int local28 = local24.method2498();
		this.aClass154Array1 = new Class154[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method2548() == 1) {
				this.aClass154Array1[local34] = new Class154();
			}
		}
		for (@Pc(56) int local56 = 0; local56 < local28; local56++) {
			if (this.aClass154Array1[local56] != null) {
				this.aClass154Array1[local56].aBoolean285 = local24.method2548() == 0;
			}
		}
		for (@Pc(84) int local84 = 0; local84 < local28; local84++) {
			if (this.aClass154Array1[local84] != null) {
				this.aClass154Array1[local84].aBoolean284 = local24.method2548() == 1;
			}
		}
		for (@Pc(112) int local112 = 0; local112 < local28; local112++) {
			if (this.aClass154Array1[local112] != null) {
				this.aClass154Array1[local112].aBoolean292 = local24.method2548() == 1;
			}
		}
		for (@Pc(138) int local138 = 0; local138 < local28; local138++) {
			if (this.aClass154Array1[local138] != null) {
				this.aClass154Array1[local138].aBoolean286 = local24.method2548() == 1;
			}
		}
		for (@Pc(164) int local164 = 0; local164 < local28; local164++) {
			if (this.aClass154Array1[local164] != null) {
				this.aClass154Array1[local164].aByte49 = local24.method2553();
			}
		}
		for (@Pc(189) int local189 = 0; local189 < local28; local189++) {
			if (this.aClass154Array1[local189] != null) {
				this.aClass154Array1[local189].aByte51 = local24.method2553();
			}
		}
		for (@Pc(214) int local214 = 0; local214 < local28; local214++) {
			if (this.aClass154Array1[local214] != null) {
				this.aClass154Array1[local214].aByte48 = local24.method2553();
			}
		}
		for (@Pc(235) int local235 = 0; local235 < local28; local235++) {
			if (this.aClass154Array1[local235] != null) {
				this.aClass154Array1[local235].aByte46 = local24.method2553();
			}
		}
		for (@Pc(256) int local256 = 0; local256 < local28; local256++) {
			if (this.aClass154Array1[local256] != null) {
				this.aClass154Array1[local256].aShort64 = (short) local24.method2498();
			}
		}
		for (@Pc(278) int local278 = 0; local278 < local28; local278++) {
			if (this.aClass154Array1[local278] != null) {
				this.aClass154Array1[local278].aByte45 = local24.method2553();
			}
		}
		for (@Pc(303) int local303 = 0; local303 < local28; local303++) {
			if (this.aClass154Array1[local303] != null) {
				this.aClass154Array1[local303].aByte50 = local24.method2553();
			}
		}
		for (@Pc(328) int local328 = 0; local328 < local28; local328++) {
			if (this.aClass154Array1[local328] != null) {
				this.aClass154Array1[local328].aBoolean289 = local24.method2548() == 1;
			}
		}
		for (@Pc(360) int local360 = 0; local360 < local28; local360++) {
			if (this.aClass154Array1[local360] != null) {
				this.aClass154Array1[local360].aBoolean291 = local24.method2548() == 1;
			}
		}
		for (@Pc(390) int local390 = 0; local390 < local28; local390++) {
			if (this.aClass154Array1[local390] != null) {
				this.aClass154Array1[local390].aByte47 = local24.method2553();
			}
		}
		for (@Pc(411) int local411 = 0; local411 < local28; local411++) {
			if (this.aClass154Array1[local411] != null) {
				this.aClass154Array1[local411].aBoolean290 = local24.method2548() == 1;
			}
		}
		for (@Pc(443) int local443 = 0; local443 < local28; local443++) {
			if (this.aClass154Array1[local443] != null) {
				this.aClass154Array1[local443].aBoolean288 = local24.method2548() == 1;
			}
		}
		for (@Pc(469) int local469 = 0; local469 < local28; local469++) {
			if (this.aClass154Array1[local469] != null) {
				this.aClass154Array1[local469].aBoolean287 = local24.method2548() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(IB)Lclient!cr;")
	private Class14_Sub2_Sub4 method120(@OriginalArg(0) int arg0) {
		@Pc(10) Class14_Sub2 local10 = this.aClass178_1.method4772((long) arg0);
		if (local10 != null) {
			return (Class14_Sub2_Sub4) local10;
		}
		@Pc(21) byte[] local21 = this.aClass143_1.method3750(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(33) Class14_Sub2_Sub4 local33 = new Class14_Sub2_Sub4(new Class14_Sub4(local21));
			this.aClass178_1.method4767(local33, (long) arg0);
			return local33;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IFIZII)[I")
	@Override
	public int[] method119(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		return this.method120(arg0).method1171((double) arg1, arg3, this, arg4, arg2, this.aClass154Array1[arg0].aBoolean291, this.aClass143_2);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIZZFI)[I")
	@Override
	public int[] method115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method120(arg0).method1173((double) arg2, arg1, this, this.aClass143_2, this.aClass154Array1[arg0].aBoolean291, arg3);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method117(@OriginalArg(0) int arg0) {
		@Pc(16) Class14_Sub2_Sub4 local16 = this.method120(arg0);
		return local16 != null && local16.method1175(this.aClass143_2, this);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Lclient!nq;")
	@Override
	public Class154 method116(@OriginalArg(0) int arg0) {
		return this.aClass154Array1[arg0];
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIFBZI)[F")
	@Override
	public float[] method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(5) int arg3) {
		return this.method120(arg0).method1170(this.aClass143_2, this, this.aClass154Array1[arg0].aBoolean291, arg1, arg3);
	}
}
