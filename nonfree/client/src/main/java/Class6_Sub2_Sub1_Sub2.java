import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JSKMYDBH")
public final class Class6_Sub2_Sub1_Sub2 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!JSKMYDBH", name = "p", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!JSKMYDBH", name = "u", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!JSKMYDBH", name = "y", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!JSKMYDBH", name = "z", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!JSKMYDBH", name = "A", descriptor = "I")
	private int anInt267;

	@OriginalMember(owner = "client!JSKMYDBH", name = "q", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!JSKMYDBH", name = "r", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!JSKMYDBH", name = "s", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!JSKMYDBH", name = "t", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!JSKMYDBH", name = "B", descriptor = "Lclient!KYGPROVJ;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!JSKMYDBH", name = "x", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!JSKMYDBH", name = "o", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!JSKMYDBH", name = "v", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!JSKMYDBH", name = "w", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!JSKMYDBH", name = "n", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!JSKMYDBH", name = "<init>", descriptor = "(IIIIIIIZII)V")
	public Class6_Sub2_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt265 = arg0;
			this.anInt266 = arg2;
			this.anInt267 = arg6;
			this.anInt258 = arg1;
			this.anInt259 = arg4;
			this.anInt260 = arg5;
			this.anInt261 = arg3;
			if (arg9 != -1) {
				this.aClass21_1 = Class21.aClass21Array1[arg9];
				this.anInt264 = 0;
				this.anInt257 = client.anInt1077;
				if (arg7 && this.aClass21_1.anInt345 != -1) {
					this.anInt264 = (int) (Math.random() * (double) this.aClass21_1.anInt344);
					this.anInt257 -= (int) (Math.random() * (double) this.aClass21_1.method176(this.anInt264, 642));
				}
			}
			@Pc(82) Class19 local82 = Class19.method169(this.anInt265);
			this.anInt262 = local82.anInt308;
			this.anInt263 = local82.anInt315;
			this.anIntArray58 = local82.anIntArray104;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("14822, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSKMYDBH", name = "b", descriptor = "(I)Lclient!KBTDMRWU;")
	private Class19 method124() {
		try {
			@Pc(8) int local8 = -1;
			if (this.anInt262 != -1) {
				@Pc(17) Class17 local17 = Class17.aClass17Array1[this.anInt262];
				@Pc(20) int local20 = local17.anInt294;
				@Pc(23) int local23 = local17.anInt295;
				@Pc(26) int local26 = local17.anInt296;
				@Pc(32) int local32 = client.anIntArray271[local26 - local23];
				local8 = aClient2.anIntArray260[local20] >> local23 & local32;
			} else if (this.anInt263 != -1) {
				local8 = aClient2.anIntArray260[this.anInt263];
			}
			return local8 < 0 || local8 >= this.anIntArray58.length || this.anIntArray58[local8] == -1 ? null : Class19.method169(this.anIntArray58[local8]);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("15879, " + -19182 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JSKMYDBH", name = "a", descriptor = "(I)Lclient!JUQSYEMB;")
	@Override
	protected Class6_Sub2_Sub1_Sub3 method529(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass21_1 != null) {
				@Pc(11) int local11 = client.anInt1077 - this.anInt257;
				if (local11 > 100 && this.aClass21_1.anInt345 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass21_1.method176(this.anInt264, 642)) {
								break label43;
							}
							local11 -= this.aClass21_1.method176(this.anInt264, 642);
							this.anInt264++;
						} while (this.anInt264 < this.aClass21_1.anInt344);
						this.anInt264 -= this.aClass21_1.anInt345;
					} while (this.anInt264 >= 0 && this.anInt264 < this.aClass21_1.anInt344);
					this.aClass21_1 = null;
				}
				this.anInt257 = client.anInt1077 - local11;
				if (this.aClass21_1 != null) {
					local3 = this.aClass21_1.anIntArray108[this.anInt264];
				}
			}
			@Pc(105) Class19 local105;
			if (this.anIntArray58 == null) {
				local105 = Class19.method169(this.anInt265);
			} else {
				local105 = this.method124();
			}
			return local105 == null ? null : local105.method167(this.anInt266, this.anInt267, this.anInt258, this.anInt259, this.anInt260, this.anInt261, local3);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("95821, " + 697 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}
}
