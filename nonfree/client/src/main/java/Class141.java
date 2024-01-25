import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class141 implements Interface4 {

	@OriginalMember(owner = "client!le", name = "n", descriptor = "Lclient!fs;")
	private final Class86 aClass86_3 = new Class86(256);

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Lclient!ok;")
	private final Class178 aClass178_64;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "Lclient!ok;")
	private final Class178 aClass178_63;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "[Lclient!qg;")
	private final Class203[] aClass203Array1;

	static {
		new Class55("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!ok;Lclient!ok;Lclient!ok;)V")
	public Class141(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_64 = arg1;
		this.aClass178_63 = arg2;
		@Pc(24) Class7_Sub14 local24 = new Class7_Sub14(arg0.method3838(0, 0));
		@Pc(28) int local28 = local24.method3943();
		this.aClass203Array1 = new Class203[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method3981() == 1) {
				this.aClass203Array1[local34] = new Class203();
			}
		}
		for (@Pc(56) int local56 = 0; local56 < local28; local56++) {
			if (this.aClass203Array1[local56] != null) {
				this.aClass203Array1[local56].aBoolean360 = local24.method3981() == 0;
			}
		}
		for (@Pc(88) int local88 = 0; local88 < local28; local88++) {
			if (this.aClass203Array1[local88] != null) {
				this.aClass203Array1[local88].aBoolean361 = local24.method3981() == 1;
			}
		}
		for (@Pc(118) int local118 = 0; local118 < local28; local118++) {
			if (this.aClass203Array1[local118] != null) {
				this.aClass203Array1[local118].aBoolean365 = local24.method3981() == 1;
			}
		}
		for (@Pc(148) int local148 = 0; local148 < local28; local148++) {
			if (this.aClass203Array1[local148] != null) {
				this.aClass203Array1[local148].aBoolean366 = local24.method3981() == 1;
			}
		}
		for (@Pc(174) int local174 = 0; local174 < local28; local174++) {
			if (this.aClass203Array1[local174] != null) {
				this.aClass203Array1[local174].aByte57 = local24.method3930();
			}
		}
		for (@Pc(199) int local199 = 0; local199 < local28; local199++) {
			if (this.aClass203Array1[local199] != null) {
				this.aClass203Array1[local199].aByte62 = local24.method3930();
			}
		}
		for (@Pc(224) int local224 = 0; local224 < local28; local224++) {
			if (this.aClass203Array1[local224] != null) {
				this.aClass203Array1[local224].aByte59 = local24.method3930();
			}
		}
		for (@Pc(249) int local249 = 0; local249 < local28; local249++) {
			if (this.aClass203Array1[local249] != null) {
				this.aClass203Array1[local249].aByte60 = local24.method3930();
			}
		}
		for (@Pc(270) int local270 = 0; local270 < local28; local270++) {
			if (this.aClass203Array1[local270] != null) {
				this.aClass203Array1[local270].aShort67 = (short) local24.method3943();
			}
		}
		for (@Pc(292) int local292 = 0; local292 < local28; local292++) {
			if (this.aClass203Array1[local292] != null) {
				this.aClass203Array1[local292].aByte58 = local24.method3930();
			}
		}
		for (@Pc(317) int local317 = 0; local317 < local28; local317++) {
			if (this.aClass203Array1[local317] != null) {
				this.aClass203Array1[local317].aByte56 = local24.method3930();
			}
		}
		for (@Pc(338) int local338 = 0; local338 < local28; local338++) {
			if (this.aClass203Array1[local338] != null) {
				this.aClass203Array1[local338].aBoolean364 = local24.method3981() == 1;
			}
		}
		for (@Pc(370) int local370 = 0; local370 < local28; local370++) {
			if (this.aClass203Array1[local370] != null) {
				this.aClass203Array1[local370].aBoolean367 = local24.method3981() == 1;
			}
		}
		for (@Pc(396) int local396 = 0; local396 < local28; local396++) {
			if (this.aClass203Array1[local396] != null) {
				this.aClass203Array1[local396].aByte61 = local24.method3930();
			}
		}
		for (@Pc(417) int local417 = 0; local417 < local28; local417++) {
			if (this.aClass203Array1[local417] != null) {
				this.aClass203Array1[local417].aBoolean362 = local24.method3981() == 1;
			}
		}
		for (@Pc(449) int local449 = 0; local449 < local28; local449++) {
			if (this.aClass203Array1[local449] != null) {
				this.aClass203Array1[local449].aBoolean359 = local24.method3981() == 1;
			}
		}
		for (@Pc(477) int local477 = 0; local477 < local28; local477++) {
			if (this.aClass203Array1[local477] != null) {
				this.aClass203Array1[local477].aBoolean363 = local24.method3981() == 1;
			}
		}
		for (@Pc(509) int local509 = 0; local509 < local28; local509++) {
			if (this.aClass203Array1[local509] != null) {
				this.aClass203Array1[local509].anInt5348 = local24.method3981();
			}
		}
		for (@Pc(534) int local534 = 0; local534 < local28; local534++) {
			if (this.aClass203Array1[local534] != null) {
				this.aClass203Array1[local534].anInt5345 = local24.method3938();
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZIFII)[I")
	@Override
	public int[] method3142(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method3145(arg3).method168((double) arg2, arg1, arg0, this, this.aClass178_63, arg4, this.aClass203Array1[arg3].aBoolean367);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZFIIII)[I")
	@Override
	public int[] method3139(@OriginalArg(1) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method3145(arg1).method166(this, this.aClass178_63, arg2, (double) arg0, arg3, this.aClass203Array1[arg1].aBoolean367);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Lclient!qg;")
	@Override
	public Class203 method3138(@OriginalArg(0) int arg0) {
		return this.aClass203Array1[arg0];
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method3140(@OriginalArg(1) int arg0) {
		@Pc(13) Class7_Sub4_Sub1 local13 = this.method3145(arg0);
		return local13 != null && local13.method167(this.aClass178_63, this);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)Lclient!ar;")
	private Class7_Sub4_Sub1 method3145(@OriginalArg(0) int arg0) {
		@Pc(10) Class7_Sub4 local10 = this.aClass86_3.method2019((long) arg0);
		if (local10 != null) {
			return (Class7_Sub4_Sub1) local10;
		}
		@Pc(29) byte[] local29 = this.aClass178_64.method3823(arg0);
		if (local29 == null) {
			return null;
		} else {
			@Pc(41) Class7_Sub4_Sub1 local41 = new Class7_Sub4_Sub1(new Class7_Sub14(local29));
			this.aClass86_3.method2018(local41, (long) arg0);
			return local41;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIFIZI)[F")
	@Override
	public float[] method3141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		return this.method3145(arg0).method170(arg3, this, this.aClass178_63, this.aClass203Array1[arg0].aBoolean367, arg1);
	}
}
