import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YRZVGTOF")
public final class Class4_Sub1_Sub1_Sub6 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!YRZVGTOF", name = "C", descriptor = "Lclient!client;")
	public static client aClient5;

	@OriginalMember(owner = "client!YRZVGTOF", name = "s", descriptor = "Z")
	private boolean aBoolean193 = true;

	@OriginalMember(owner = "client!YRZVGTOF", name = "u", descriptor = "I")
	private int anInt729 = -479;

	@OriginalMember(owner = "client!YRZVGTOF", name = "z", descriptor = "I")
	private int anInt734 = 40410;

	@OriginalMember(owner = "client!YRZVGTOF", name = "v", descriptor = "I")
	private int anInt730;

	@OriginalMember(owner = "client!YRZVGTOF", name = "w", descriptor = "I")
	private int anInt731;

	@OriginalMember(owner = "client!YRZVGTOF", name = "x", descriptor = "I")
	private int anInt732;

	@OriginalMember(owner = "client!YRZVGTOF", name = "m", descriptor = "I")
	private int anInt724;

	@OriginalMember(owner = "client!YRZVGTOF", name = "n", descriptor = "I")
	private int anInt725;

	@OriginalMember(owner = "client!YRZVGTOF", name = "o", descriptor = "I")
	private int anInt726;

	@OriginalMember(owner = "client!YRZVGTOF", name = "p", descriptor = "I")
	private int anInt727;

	@OriginalMember(owner = "client!YRZVGTOF", name = "t", descriptor = "Lclient!KIZBPSHZ;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!YRZVGTOF", name = "q", descriptor = "I")
	private int anInt728;

	@OriginalMember(owner = "client!YRZVGTOF", name = "y", descriptor = "I")
	private int anInt733;

	@OriginalMember(owner = "client!YRZVGTOF", name = "A", descriptor = "I")
	private int anInt735;

	@OriginalMember(owner = "client!YRZVGTOF", name = "B", descriptor = "I")
	private int anInt736;

	@OriginalMember(owner = "client!YRZVGTOF", name = "r", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!YRZVGTOF", name = "<init>", descriptor = "(IIZIIIIZII)V")
	public Class4_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt730 = arg6;
			this.anInt731 = arg1;
			this.anInt732 = arg4;
			this.anInt724 = arg5;
			this.anInt725 = arg8;
			this.anInt726 = arg3;
			this.anInt727 = arg9;
			if (arg0 != -1) {
				this.aClass21_2 = Class21.aClass21Array1[arg0];
				this.anInt728 = 0;
				this.anInt733 = client.anInt1054;
				if (arg7 && this.aClass21_2.anInt370 != -1) {
					this.anInt728 = (int) (Math.random() * (double) this.aClass21_2.anInt369);
					this.anInt733 -= (int) (Math.random() * (double) this.aClass21_2.method275(this.anInt734, this.anInt728));
				}
			}
			@Pc(87) Class7 local87 = Class7.method82(this.anInt730);
			this.anInt735 = local87.anInt41;
			this.anInt736 = local87.anInt59;
			this.anIntArray183 = local87.anIntArray14;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("72271, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YRZVGTOF", name = "a", descriptor = "(Z)Lclient!POJFANDE;")
	@Override
	protected Class4_Sub1_Sub1_Sub4 method559() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass21_2 != null) {
				@Pc(11) int local11 = client.anInt1054 - this.anInt733;
				if (local11 > 100 && this.aClass21_2.anInt370 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass21_2.method275(this.anInt734, this.anInt728)) {
								break label43;
							}
							local11 -= this.aClass21_2.method275(this.anInt734, this.anInt728);
							this.anInt728++;
						} while (this.anInt728 < this.aClass21_2.anInt369);
						this.anInt728 -= this.aClass21_2.anInt370;
					} while (this.anInt728 >= 0 && this.anInt728 < this.aClass21_2.anInt369);
					this.aClass21_2 = null;
				}
				this.anInt733 = client.anInt1054 - local11;
				if (this.aClass21_2 != null) {
					local3 = this.aClass21_2.anIntArray69[this.anInt728];
				}
			}
			@Pc(103) Class7 local103;
			if (this.anIntArray183 == null) {
				local103 = Class7.method82(this.anInt730);
			} else {
				local103 = this.method549();
			}
			return local103 == null ? null : local103.method80(this.anInt731, this.anInt732, this.anInt724, this.anInt725, this.anInt726, this.anInt727, local3);
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("58105, " + true + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YRZVGTOF", name = "b", descriptor = "(Z)Lclient!CSTFGNEK;")
	private Class7 method549() {
		try {
			@Pc(6) int local6 = -1;
			if (this.anInt735 != -1) {
				@Pc(15) Class13 local15 = Class13.aClass13Array1[this.anInt735];
				@Pc(18) int local18 = local15.anInt241;
				@Pc(21) int local21 = local15.anInt242;
				@Pc(24) int local24 = local15.anInt243;
				@Pc(30) int local30 = client.anIntArray223[local24 - local21];
				local6 = aClient5.anIntArray249[local18] >> local21 & local30;
			} else if (this.anInt736 != -1) {
				local6 = aClient5.anIntArray249[this.anInt736];
			}
			return local6 < 0 || local6 >= this.anIntArray183.length || this.anIntArray183[local6] == -1 ? null : Class7.method82(this.anIntArray183[local6]);
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("72498, " + true + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
