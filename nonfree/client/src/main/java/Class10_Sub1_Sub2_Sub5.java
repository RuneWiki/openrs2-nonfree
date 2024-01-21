import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NRPYRAWK")
public final class Class10_Sub1_Sub2_Sub5 extends Class10_Sub1_Sub2 {

	@OriginalMember(owner = "client!NRPYRAWK", name = "v", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!NRPYRAWK", name = "A", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "client!NRPYRAWK", name = "m", descriptor = "Z")
	private boolean aBoolean122 = false;

	@OriginalMember(owner = "client!NRPYRAWK", name = "s", descriptor = "I")
	private int anInt466;

	@OriginalMember(owner = "client!NRPYRAWK", name = "t", descriptor = "I")
	private int anInt467;

	@OriginalMember(owner = "client!NRPYRAWK", name = "u", descriptor = "I")
	private int anInt468;

	@OriginalMember(owner = "client!NRPYRAWK", name = "n", descriptor = "I")
	private int anInt461;

	@OriginalMember(owner = "client!NRPYRAWK", name = "o", descriptor = "I")
	private int anInt462;

	@OriginalMember(owner = "client!NRPYRAWK", name = "p", descriptor = "I")
	private int anInt463;

	@OriginalMember(owner = "client!NRPYRAWK", name = "q", descriptor = "I")
	private int anInt464;

	@OriginalMember(owner = "client!NRPYRAWK", name = "w", descriptor = "Lclient!FHWCLIAS;")
	private Class15 aClass15_2;

	@OriginalMember(owner = "client!NRPYRAWK", name = "C", descriptor = "I")
	private int anInt473;

	@OriginalMember(owner = "client!NRPYRAWK", name = "B", descriptor = "I")
	private int anInt472;

	@OriginalMember(owner = "client!NRPYRAWK", name = "x", descriptor = "I")
	private int anInt469;

	@OriginalMember(owner = "client!NRPYRAWK", name = "y", descriptor = "I")
	private int anInt470;

	@OriginalMember(owner = "client!NRPYRAWK", name = "z", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!NRPYRAWK", name = "r", descriptor = "I")
	private int anInt465;

	@OriginalMember(owner = "client!NRPYRAWK", name = "<init>", descriptor = "(IIIIIBIZII)V")
	public Class10_Sub1_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt466 = arg6;
			this.anInt467 = arg4;
			this.anInt468 = arg9;
			this.anInt461 = arg8;
			this.anInt462 = arg3;
			this.anInt463 = arg1;
			this.anInt464 = arg2;
			if (arg0 != -1) {
				this.aClass15_2 = Class15.aClass15Array1[arg0];
				this.anInt473 = 0;
				this.anInt472 = client.anInt1050 - 1;
				if (arg7 && this.aClass15_2.anInt153 != -1) {
					this.anInt473 = (int) (Math.random() * (double) this.aClass15_2.anInt152);
					this.anInt472 -= (int) (Math.random() * (double) this.aClass15_2.method97(this.anInt473));
				}
			}
			@Pc(76) Class48 local76 = Class48.method523(this.anInt466);
			this.anInt469 = local76.anInt699;
			this.anInt470 = local76.anInt701;
			this.anIntArray154 = local76.anIntArray192;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("66382, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NRPYRAWK", name = "a", descriptor = "(I)Lclient!YMYTDPVW;")
	private Class48 method358() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt469 != -1) {
				@Pc(15) Class50 local15 = Class50.aClass50Array1[this.anInt469];
				@Pc(18) int local18 = local15.anInt800;
				@Pc(21) int local21 = local15.anInt801;
				@Pc(24) int local24 = local15.anInt802;
				@Pc(30) int local30 = client.anIntArray262[local24 - local21];
				local1 = aClient2.anIntArray244[local18] >> local21 & local30;
			} else if (this.anInt470 != -1) {
				local1 = aClient2.anIntArray244[this.anInt470];
			}
			return local1 < 0 || local1 >= this.anIntArray154.length || this.anIntArray154[local1] == -1 ? null : Class48.method523(this.anIntArray154[local1]);
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("64623, " + 0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NRPYRAWK", name = "a", descriptor = "(B)Lclient!LZYQDKJV;")
	@Override
	protected Class10_Sub1_Sub2_Sub4 method537(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 3) {
				this.aBoolean122 = !this.aBoolean122;
			}
			@Pc(14) int local14 = -1;
			if (this.aClass15_2 != null) {
				@Pc(22) int local22 = client.anInt1050 - this.anInt472;
				if (local22 > 100 && this.aClass15_2.anInt153 > 0) {
					local22 = 100;
				}
				label51: {
					do {
						do {
							if (local22 <= this.aClass15_2.method97(this.anInt473)) {
								break label51;
							}
							local22 -= this.aClass15_2.method97(this.anInt473);
							this.anInt473++;
						} while (this.anInt473 < this.aClass15_2.anInt152);
						this.anInt473 -= this.aClass15_2.anInt153;
					} while (this.anInt473 >= 0 && this.anInt473 < this.aClass15_2.anInt152);
					this.aClass15_2 = null;
				}
				this.anInt472 = client.anInt1050 - local22;
				if (this.aClass15_2 != null) {
					local14 = this.aClass15_2.anIntArray47[this.anInt473];
				}
			}
			@Pc(106) Class48 local106;
			if (this.anIntArray154 == null) {
				local106 = Class48.method523(this.anInt466);
			} else {
				local106 = this.method358();
			}
			return local106 == null ? null : local106.method531(this.anInt467, this.anInt468, this.anInt461, this.anInt462, this.anInt463, this.anInt464, local14);
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("86963, " + arg0 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}
}
