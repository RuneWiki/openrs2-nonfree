import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	private int anInt154;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	private int anInt155;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIZIIZI)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt150 = arg1;
			this.anInt151 = arg2;
			this.anInt152 = arg0;
			this.anInt153 = arg6;
			this.anInt154 = arg9;
			this.anInt155 = arg4;
			this.anInt156 = arg3;
			if (arg7 != -1) {
				this.aClass27_1 = Class27.aClass27Array1[arg7];
				this.anInt157 = 0;
				this.anInt158 = client.anInt396;
				if (arg8 && this.aClass27_1.anInt784 != -1) {
					this.anInt157 = (int) (Math.random() * (double) this.aClass27_1.anInt783);
					this.anInt158 -= (int) (Math.random() * (double) this.aClass27_1.method502(this.anInt157));
				}
			}
			@Pc(77) Class9 local77 = Class9.method287(this.anInt150);
			this.anInt159 = local77.anInt516;
			this.anIntArray17 = local77.anIntArray160;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("78557, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method672() {
		try {
			@Pc(13) int local13 = -1;
			if (this.aClass27_1 != null) {
				@Pc(21) int local21 = client.anInt396 - this.anInt158;
				if (local21 > 100 && this.aClass27_1.anInt784 > 0) {
					local21 = 100;
				}
				label48: {
					do {
						do {
							if (local21 <= this.aClass27_1.method502(this.anInt157)) {
								break label48;
							}
							local21 -= this.aClass27_1.method502(this.anInt157);
							this.anInt157++;
						} while (this.anInt157 < this.aClass27_1.anInt783);
						this.anInt157 -= this.aClass27_1.anInt784;
					} while (this.anInt157 >= 0 && this.anInt157 < this.aClass27_1.anInt783);
					this.aClass27_1 = null;
				}
				this.anInt158 = client.anInt396 - local21;
				local13 = this.aClass27_1.anIntArray224[this.anInt157];
			}
			@Pc(148) Class9 local148;
			if (this.anIntArray17 == null) {
				local148 = Class9.method287(this.anInt150);
			} else {
				@Pc(103) Class36 local103 = Class36.aClass36Array1[this.anInt159];
				@Pc(106) int local106 = local103.anInt835;
				@Pc(109) int local109 = local103.anInt836;
				@Pc(112) int local112 = local103.anInt837;
				@Pc(118) int local118 = client.anIntArray70[local112 - local109];
				@Pc(127) int local127 = aClient1.anIntArray85[local106] >> local109 & local118;
				if (local127 < 0 || local127 >= this.anIntArray17.length || this.anIntArray17[local127] == -1) {
					return null;
				}
				local148 = Class9.method287(this.anIntArray17[local127]);
			}
			return local148.method293(this.anInt151, this.anInt152, this.anInt153, this.anInt154, this.anInt155, this.anInt156, local13);
		} catch (@Pc(173) RuntimeException local173) {
			signlink.reporterror("27197, " + -37770 + ", " + local173.toString());
			throw new RuntimeException();
		}
	}
}
