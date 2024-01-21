import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HVMNUAXR")
public final class Class3_Sub1_Sub1_Sub2 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!HVMNUAXR", name = "o", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!HVMNUAXR", name = "n", descriptor = "Z")
	private boolean aBoolean73 = true;

	@OriginalMember(owner = "client!HVMNUAXR", name = "k", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!HVMNUAXR", name = "l", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!HVMNUAXR", name = "m", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!HVMNUAXR", name = "t", descriptor = "I")
	private int anInt241;

	@OriginalMember(owner = "client!HVMNUAXR", name = "u", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!HVMNUAXR", name = "v", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!HVMNUAXR", name = "w", descriptor = "I")
	private int anInt244;

	@OriginalMember(owner = "client!HVMNUAXR", name = "y", descriptor = "Lclient!PVVHTYPN;")
	private Class30 aClass30_1;

	@OriginalMember(owner = "client!HVMNUAXR", name = "s", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!HVMNUAXR", name = "r", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!HVMNUAXR", name = "p", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!HVMNUAXR", name = "q", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!HVMNUAXR", name = "x", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!HVMNUAXR", name = "<init>", descriptor = "(IIIZZIIIII)V")
	public Class3_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt234 = arg8;
			this.anInt235 = arg6;
			this.anInt236 = arg7;
			this.anInt241 = arg5;
			this.anInt242 = arg1;
			this.anInt243 = arg0;
			this.anInt244 = arg2;
			if (arg9 != -1) {
				this.aClass30_1 = Class30.aClass30Array1[arg9];
				this.anInt240 = 0;
				this.anInt239 = client.anInt919 - 1;
				if (arg3 && this.aClass30_1.anInt387 != -1) {
					this.anInt240 = (int) (Math.random() * (double) this.aClass30_1.anInt386);
					this.anInt239 -= (int) (Math.random() * (double) this.aClass30_1.method308(this.anInt240));
				}
			}
			@Pc(76) Class8 local76 = Class8.method70(this.anInt234);
			this.anInt237 = local76.anInt105;
			this.anInt238 = local76.anInt108;
			this.anIntArray49 = local76.anIntArray18;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("69273, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HVMNUAXR", name = "a", descriptor = "(B)Lclient!UNLYQRUD;")
	@Override
	protected Class3_Sub1_Sub1_Sub5 method505() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass30_1 != null) {
				@Pc(11) int local11 = client.anInt919 - this.anInt239;
				if (local11 > 100 && this.aClass30_1.anInt387 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass30_1.method308(this.anInt240)) {
								break label43;
							}
							local11 -= this.aClass30_1.method308(this.anInt240);
							this.anInt240++;
						} while (this.anInt240 < this.aClass30_1.anInt386);
						this.anInt240 -= this.aClass30_1.anInt387;
					} while (this.anInt240 >= 0 && this.anInt240 < this.aClass30_1.anInt386);
					this.aClass30_1 = null;
				}
				this.anInt239 = client.anInt919 - local11;
				if (this.aClass30_1 != null) {
					local3 = this.aClass30_1.anIntArray90[this.anInt240];
				}
			}
			@Pc(95) Class8 local95;
			if (this.anIntArray49 == null) {
				local95 = Class8.method70(this.anInt234);
			} else {
				local95 = this.method231();
			}
			return local95 == null ? null : local95.method76(this.anInt235, this.anInt236, this.anInt241, this.anInt242, this.anInt243, this.anInt244, local3);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("23666, " + 93 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HVMNUAXR", name = "a", descriptor = "(Z)Lclient!DZZSWICG;")
	private Class8 method231() {
		try {
			@Pc(7) int local7 = -1;
			if (this.anInt237 != -1) {
				@Pc(16) Class43 local16 = Class43.aClass43Array1[this.anInt237];
				@Pc(19) int local19 = local16.anInt645;
				@Pc(22) int local22 = local16.anInt646;
				@Pc(25) int local25 = local16.anInt647;
				@Pc(31) int local31 = client.anIntArray219[local25 - local22];
				local7 = aClient4.anIntArray273[local19] >> local22 & local31;
			} else if (this.anInt238 != -1) {
				local7 = aClient4.anIntArray273[this.anInt238];
			}
			return local7 < 0 || local7 >= this.anIntArray49.length || this.anIntArray49[local7] == -1 ? null : Class8.method70(this.anIntArray49[local7]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("40374, " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
