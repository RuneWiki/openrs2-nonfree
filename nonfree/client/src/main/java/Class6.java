import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class6 implements Interface7 {

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Lclient!rh;")
	private final Class215 aClass215_1 = new Class215(256);

	@OriginalMember(owner = "client!af", name = "p", descriptor = "Lclient!qs;")
	private final Class211 aClass211_4;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!qs;")
	private final Class211 aClass211_3;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "[Lclient!ks;")
	private final Class150[] aClass150Array1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!qs;Lclient!qs;Lclient!qs;)V")
	public Class6(@OriginalArg(0) Class211 arg0, @OriginalArg(1) Class211 arg1, @OriginalArg(2) Class211 arg2) {
		this.aClass211_4 = arg1;
		this.aClass211_3 = arg2;
		@Pc(24) Class1_Sub3 local24 = new Class1_Sub3(arg0.method4758(0, 0));
		@Pc(28) int local28 = local24.method1177();
		this.aClass150Array1 = new Class150[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method1171() == 1) {
				this.aClass150Array1[local34] = new Class150();
			}
		}
		for (@Pc(60) int local60 = 0; local60 < local28; local60++) {
			if (this.aClass150Array1[local60] != null) {
				this.aClass150Array1[local60].aBoolean274 = local24.method1171() == 0;
			}
		}
		for (@Pc(85) int local85 = 0; local85 < local28; local85++) {
			if (this.aClass150Array1[local85] != null) {
				this.aClass150Array1[local85].aBoolean276 = local24.method1171() == 1;
			}
		}
		for (@Pc(113) int local113 = 0; local113 < local28; local113++) {
			if (this.aClass150Array1[local113] != null) {
				this.aClass150Array1[local113].aBoolean272 = local24.method1171() == 1;
			}
		}
		for (@Pc(141) int local141 = 0; local141 < local28; local141++) {
			if (this.aClass150Array1[local141] != null) {
				this.aClass150Array1[local141].aBoolean275 = local24.method1171() == 1;
			}
		}
		for (@Pc(169) int local169 = 0; local169 < local28; local169++) {
			if (this.aClass150Array1[local169] != null) {
				this.aClass150Array1[local169].aByte56 = local24.method1212();
			}
		}
		for (@Pc(190) int local190 = 0; local190 < local28; local190++) {
			if (this.aClass150Array1[local190] != null) {
				this.aClass150Array1[local190].aByte54 = local24.method1212();
			}
		}
		for (@Pc(211) int local211 = 0; local211 < local28; local211++) {
			if (this.aClass150Array1[local211] != null) {
				this.aClass150Array1[local211].aByte53 = local24.method1212();
			}
		}
		for (@Pc(236) int local236 = 0; local236 < local28; local236++) {
			if (this.aClass150Array1[local236] != null) {
				this.aClass150Array1[local236].aByte57 = local24.method1212();
			}
		}
		for (@Pc(261) int local261 = 0; local261 < local28; local261++) {
			if (this.aClass150Array1[local261] != null) {
				this.aClass150Array1[local261].aShort59 = (short) local24.method1177();
			}
		}
		for (@Pc(287) int local287 = 0; local287 < local28; local287++) {
			if (this.aClass150Array1[local287] != null) {
				this.aClass150Array1[local287].aByte55 = local24.method1212();
			}
		}
		for (@Pc(312) int local312 = 0; local312 < local28; local312++) {
			if (this.aClass150Array1[local312] != null) {
				this.aClass150Array1[local312].aByte52 = local24.method1212();
			}
		}
		for (@Pc(333) int local333 = 0; local333 < local28; local333++) {
			if (this.aClass150Array1[local333] != null) {
				this.aClass150Array1[local333].aBoolean273 = local24.method1171() == 1;
			}
		}
		for (@Pc(359) int local359 = 0; local359 < local28; local359++) {
			if (this.aClass150Array1[local359] != null) {
				this.aClass150Array1[local359].aBoolean278 = local24.method1171() == 1;
			}
		}
		for (@Pc(387) int local387 = 0; local387 < local28; local387++) {
			if (this.aClass150Array1[local387] != null) {
				this.aClass150Array1[local387].aByte51 = local24.method1212();
			}
		}
		for (@Pc(412) int local412 = 0; local412 < local28; local412++) {
			if (this.aClass150Array1[local412] != null) {
				this.aClass150Array1[local412].aBoolean271 = local24.method1171() == 1;
			}
		}
		for (@Pc(438) int local438 = 0; local438 < local28; local438++) {
			if (this.aClass150Array1[local438] != null) {
				this.aClass150Array1[local438].aBoolean270 = local24.method1171() == 1;
			}
		}
		for (@Pc(470) int local470 = 0; local470 < local28; local470++) {
			if (this.aClass150Array1[local470] != null) {
				this.aClass150Array1[local470].aBoolean277 = local24.method1171() == 1;
			}
		}
		for (@Pc(502) int local502 = 0; local502 < local28; local502++) {
			if (this.aClass150Array1[local502] != null) {
				this.aClass150Array1[local502].anInt4425 = local24.method1171();
			}
		}
		for (@Pc(523) int local523 = 0; local523 < local28; local523++) {
			if (this.aClass150Array1[local523] != null) {
				this.aClass150Array1[local523].anInt4426 = local24.method1188();
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZZIIIF)[I")
	@Override
	public int[] method79(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method83(arg1).method5601((double) arg3, arg0, this.aClass211_3, arg2, this.aClass150Array1[arg1].aBoolean278, this);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(FIIIZI)[F")
	@Override
	public float[] method80(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method83(arg3).method5599(this.aClass211_3, this, arg2, arg1, this.aClass150Array1[arg3].aBoolean278);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(BI)Lclient!um;")
	private Class1_Sub1_Sub16 method83(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub1 local15 = this.aClass215_1.method4926((long) arg0);
		if (local15 != null) {
			return (Class1_Sub1_Sub16) local15;
		}
		@Pc(26) byte[] local26 = this.aClass211_4.method4774(arg0);
		if (local26 == null) {
			return null;
		} else {
			@Pc(38) Class1_Sub1_Sub16 local38 = new Class1_Sub1_Sub16(new Class1_Sub3(local26));
			this.aClass215_1.method4925(local38, (long) arg0);
			return local38;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method77(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub1_Sub16 local16 = this.method83(arg0);
		return local16 != null && local16.method5600(this, this.aClass211_3);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)Lclient!ks;")
	@Override
	public Class150 method78(@OriginalArg(0) int arg0) {
		return this.aClass150Array1[arg0];
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IFIBIZ)[I")
	@Override
	public int[] method76(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method83(arg0).method5597(arg2, this.aClass150Array1[arg0].aBoolean278, arg4, this.aClass211_3, arg3, (double) arg1, this);
	}
}
